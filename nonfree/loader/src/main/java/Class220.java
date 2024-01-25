import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!c")
public final class Class220 {

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "()V")
	public Class220() throws Exception {
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/awt/Component;II[ILjava/awt/Point;I)V")
	public void method5739(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Point arg4) {
		if (arg3 == null) {
			arg0.setCursor(null);
		} else {
			@Pc(27) BufferedImage local27 = new BufferedImage(arg2, arg1, 2);
			local27.setRGB(0, 0, arg2, arg1, arg3, 0, arg2);
			arg0.setCursor(arg0.getToolkit().createCustomCursor(local27, arg4, null));
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(IIB)V")
	public void method5740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(IZLjava/awt/Component;)V")
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
}
