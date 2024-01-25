import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!h")
public final class Class257 {

	@OriginalMember(owner = "loader!h", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "()V")
	public Class257() throws Exception {
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/awt/Component;ZI)V")
	public void method6159(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
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

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(IIILjava/awt/Point;Ljava/awt/Component;[I)V")
	public void method6160(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Point arg2, @OriginalArg(4) Component arg3, @OriginalArg(5) int[] arg4) {
		if (arg4 == null) {
			arg3.setCursor(null);
		} else {
			@Pc(14) BufferedImage local14 = new BufferedImage(arg1, arg0, 2);
			local14.setRGB(0, 0, arg1, arg0, arg4, 0, arg1);
			arg3.setCursor(arg3.getToolkit().createCustomCursor(local14, arg2, null));
		}
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(III)V")
	public void method6161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aRobot1.mouseMove(arg1, arg0);
	}
}
