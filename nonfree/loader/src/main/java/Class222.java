import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!d")
public final class Class222 {

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "()V")
	public Class222() throws Exception {
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(ILjava/awt/Point;Ljava/awt/Component;[III)V")
	public void method6063(@OriginalArg(1) Point arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == null) {
			arg1.setCursor(null);
		} else {
			@Pc(8) BufferedImage local8 = new BufferedImage(arg3, arg4, 2);
			local8.setRGB(0, 0, arg3, arg4, arg2, 0, arg3);
			arg1.setCursor(arg1.getToolkit().createCustomCursor(local8, arg0, null));
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/awt/Component;ZB)V")
	public void method6064(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			arg0 = null;
		} else if (arg0 == null) {
			throw new NullPointerException();
		}
		if (arg0 == this.aComponent4) {
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

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(IBI)V")
	public void method6065(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg1, arg0);
	}
}
