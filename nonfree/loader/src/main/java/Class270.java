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
public final class Class270 {

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "()V")
	public Class270() throws Exception {
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ZLjava/awt/Component;Z)V")
	public void method6098(@OriginalArg(1) Component arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			arg0 = null;
		} else if (arg0 == null) {
			throw new NullPointerException();
		}
		if (this.aComponent4 == arg0) {
			return;
		}
		if (this.aComponent4 != null) {
			this.aComponent4.setCursor(null);
			this.aComponent4 = null;
		}
		if (arg0 != null) {
			arg0.setCursor(arg0.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
			this.aComponent4 = arg0;
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(III)V")
	public void method6099(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ILjava/awt/Point;Ljava/awt/Component;[III)V")
	public void method6100(@OriginalArg(1) Point arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == null) {
			arg1.setCursor(null);
		} else {
			@Pc(20) BufferedImage local20 = new BufferedImage(arg4, arg3, 2);
			local20.setRGB(0, 0, arg4, arg3, arg2, 0, arg4);
			arg1.setCursor(arg1.getToolkit().createCustomCursor(local20, arg0, null));
		}
	}
}
