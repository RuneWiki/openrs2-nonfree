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

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "()V")
	public Class253() throws Exception {
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(IZLjava/awt/Component;)V")
	public void method5741(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1) {
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

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(IILjava/awt/Component;ILjava/awt/Point;[I)V")
	public void method5742(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Point arg3, @OriginalArg(5) int[] arg4) {
		if (arg4 == null) {
			arg1.setCursor(null);
		} else {
			@Pc(15) BufferedImage local15 = new BufferedImage(arg2, arg0, 2);
			local15.setRGB(0, 0, arg2, arg0, arg4, 0, arg2);
			arg1.setCursor(arg1.getToolkit().createCustomCursor(local15, arg3, null));
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(III)V")
	public void method5743(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg1, arg0);
	}
}
