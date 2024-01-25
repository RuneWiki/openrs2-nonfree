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
public final class Class253 {

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "()V")
	public Class253() throws Exception {
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/awt/Component;Ljava/awt/Point;I[III)V")
	public void method5590(@OriginalArg(0) Component arg0, @OriginalArg(1) Point arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == null) {
			arg0.setCursor(null);
		} else {
			@Pc(16) BufferedImage local16 = new BufferedImage(arg3, arg4, 2);
			local16.setRGB(0, 0, arg3, arg4, arg2, 0, arg3);
			arg0.setCursor(arg0.getToolkit().createCustomCursor(local16, arg1, null));
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ZLjava/awt/Component;B)V")
	public void method5591(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1) {
		if (arg0) {
			arg1 = null;
		} else if (arg1 == null) {
			throw new NullPointerException();
		}
		if (arg1 == this.aComponent4) {
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
	public void method5592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}
}
