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
public final class Class273 {

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "()V")
	public Class273() throws Exception {
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ZBLjava/awt/Component;)V")
	public void method5969(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1) {
		if (arg0) {
			arg1 = null;
		} else if (arg1 == null) {
			throw new NullPointerException();
		}
		if (this.aComponent4 == arg1) {
			return;
		}
		if (this.aComponent4 != null) {
			this.aComponent4.setCursor(null);
			this.aComponent4 = null;
		}
		if (arg1 != null) {
			arg1.setCursor(arg1.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
			this.aComponent4 = arg1;
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(III)V")
	public void method5970(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg1, arg0);
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(BILjava/awt/Component;Ljava/awt/Point;[II)V")
	public void method5971(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) Point arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if (arg3 == null) {
			arg1.setCursor(null);
		} else {
			@Pc(12) BufferedImage local12 = new BufferedImage(arg0, arg4, 2);
			local12.setRGB(0, 0, arg0, arg4, arg3, 0, arg0);
			arg1.setCursor(arg1.getToolkit().createCustomCursor(local12, arg2, null));
		}
	}
}
