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
public final class Class320 {

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "()V")
	public Class320() throws Exception {
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/awt/Component;Ljava/awt/Point;III[I)V")
	public void method7546(@OriginalArg(0) Component arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4) {
		if (arg4 == null) {
			arg0.setCursor(null);
		} else {
			@Pc(12) BufferedImage local12 = new BufferedImage(arg2, arg3, 2);
			local12.setRGB(0, 0, arg2, arg3, arg4, 0, arg2);
			arg0.setCursor(arg0.getToolkit().createCustomCursor(local12, arg1, null));
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ZII)V")
	public void method7547(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg1, arg0);
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/awt/Component;BZ)V")
	public void method7548(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			arg0 = null;
		} else if (arg0 == null) {
			throw new NullPointerException();
		}
		if (arg0 == this.aComponent5) {
			return;
		}
		if (this.aComponent5 != null) {
			this.aComponent5.setCursor(null);
			this.aComponent5 = null;
		}
		if (arg0 != null) {
			arg0.setCursor(arg0.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
			this.aComponent5 = arg0;
		}
	}
}
