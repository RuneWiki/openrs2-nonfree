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
public final class Class276 {

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "()V")
	public Class276() throws Exception {
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(IZLjava/awt/Component;)V")
	public void method6343(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1) {
		if (arg0) {
			arg1 = null;
		} else if (arg1 == null) {
			throw new NullPointerException();
		}
		if (arg1 == this.aComponent5) {
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
	public void method6344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aRobot1.mouseMove(arg1, arg0);
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(IIILjava/awt/Component;Ljava/awt/Point;[I)V")
	public void method6345(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) Point arg3, @OriginalArg(5) int[] arg4) {
		if (arg4 == null) {
			arg2.setCursor(null);
		} else {
			@Pc(17) BufferedImage local17 = new BufferedImage(arg1, arg0, 2);
			local17.setRGB(0, 0, arg1, arg0, arg4, 0, arg1);
			arg2.setCursor(arg2.getToolkit().createCustomCursor(local17, arg3, null));
		}
	}
}
