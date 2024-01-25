import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!c")
public final class Class223 {

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "()V")
	public Class223() throws Exception {
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(III)V")
	public void method5752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/awt/Point;II[ILjava/awt/Component;I)V")
	public void method5753(@OriginalArg(0) Point arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Component arg3, @OriginalArg(5) int arg4) {
		if (arg2 == null) {
			arg3.setCursor(null);
		} else {
			@Pc(13) BufferedImage local13 = new BufferedImage(arg4, arg1, 2);
			local13.setRGB(0, 0, arg4, arg1, arg2, 0, arg4);
			arg3.setCursor(arg3.getToolkit().createCustomCursor(local13, arg0, null));
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(ILjava/awt/Component;Z)V")
	public void method5754(@OriginalArg(1) Component arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			arg0 = null;
		} else if (arg0 == null) {
			throw new NullPointerException();
		}
		if (this.aComponent2 == arg0) {
			return;
		}
		if (this.aComponent2 != null) {
			this.aComponent2.setCursor(null);
			this.aComponent2 = null;
		}
		if (arg0 != null) {
			arg0.setCursor(arg0.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
			this.aComponent2 = arg0;
		}
	}
}
