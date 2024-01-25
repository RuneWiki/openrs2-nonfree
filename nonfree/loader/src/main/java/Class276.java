import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!e")
public final class Class276 {

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "()V")
	public Class276() throws Exception {
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(IIZ)V")
	public void method5812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(BLjava/awt/Component;Z)V")
	public void method5813(@OriginalArg(1) Component arg0, @OriginalArg(2) boolean arg1) {
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

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "([IILjava/awt/Component;Ljava/awt/Point;II)V")
	public void method5814(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) Point arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			arg2.setCursor(null);
		} else {
			@Pc(8) BufferedImage local8 = new BufferedImage(arg1, arg4, 2);
			local8.setRGB(0, 0, arg1, arg4, arg0, 0, arg1);
			arg2.setCursor(arg2.getToolkit().createCustomCursor(local8, arg3, null));
		}
	}
}
