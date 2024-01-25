import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!g")
public final class Class326 {

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "()V")
	public Class326() throws Exception {
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(III)V")
	public void method7844(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(ZLjava/awt/Component;B)V")
	public void method7845(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1) {
		if (arg0) {
			arg1 = null;
		} else if (arg1 == null) {
			throw new NullPointerException();
		}
		if (this.aComponent5 == arg1) {
			return;
		}
		if (this.aComponent5 != null) {
			this.aComponent5.setCursor(null);
			this.aComponent5 = null;
		}
		if (arg1 != null) {
			arg1.setCursor(arg1.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
			this.aComponent5 = arg1;
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(IB[ILjava/awt/Point;ILjava/awt/Component;)V")
	public void method7846(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Point arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Component arg4) {
		if (arg1 == null) {
			arg4.setCursor(null);
		} else {
			@Pc(17) BufferedImage local17 = new BufferedImage(arg3, arg0, 2);
			local17.setRGB(0, 0, arg3, arg0, arg1, 0, arg3);
			arg4.setCursor(arg4.getToolkit().createCustomCursor(local17, arg2, null));
		}
	}
}
