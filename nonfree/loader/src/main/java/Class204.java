import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!a")
public final class Class204 {

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/awt/Robot;")
	private Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "()V")
	public Class204() throws Exception {
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/awt/Component;ILjava/awt/Point;I[IB)V")
	public void method4857(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Point arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg4 == null) {
			arg0.setCursor(null);
		} else {
			@Pc(9) BufferedImage local9 = new BufferedImage(arg3, arg1, 2);
			local9.setRGB(0, 0, arg3, arg1, arg4, 0, arg3);
			arg0.setCursor(arg0.getToolkit().createCustomCursor(local9, arg2, null));
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ZLjava/awt/Component;I)V")
	public void method4858(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1) {
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

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(III)V")
	public void method4859(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}
}
