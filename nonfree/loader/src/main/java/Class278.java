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
public final class Class278 {

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "()V")
	public Class278() throws Exception {
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(I[ILjava/awt/Point;ILjava/awt/Component;I)V")
	public void method6381(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Point arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Component arg4) {
		if (arg1 == null) {
			arg4.setCursor(null);
		} else {
			@Pc(12) BufferedImage local12 = new BufferedImage(arg0, arg3, 2);
			local12.setRGB(0, 0, arg0, arg3, arg1, 0, arg0);
			arg4.setCursor(arg4.getToolkit().createCustomCursor(local12, arg2, null));
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(IIB)V")
	public void method6382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(ZILjava/awt/Component;)V")
	public void method6383(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1) {
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
}
