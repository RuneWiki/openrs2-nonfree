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

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "()V")
	public Class273() throws Exception {
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
	public void method6208(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1) {
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

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(IZI)V")
	public void method6209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ILjava/awt/Point;ILjava/awt/Component;I[I)V")
	public void method6210(@OriginalArg(0) int arg0, @OriginalArg(1) Point arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if (arg4 == null) {
			arg2.setCursor(null);
		} else {
			@Pc(9) BufferedImage local9 = new BufferedImage(arg0, arg3, 2);
			local9.setRGB(0, 0, arg0, arg3, arg4, 0, arg0);
			arg2.setCursor(arg2.getToolkit().createCustomCursor(local9, arg1, null));
		}
	}
}
