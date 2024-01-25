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
public final class Class226 {

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "()V")
	public Class226() throws Exception {
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(IZLjava/awt/Component;)V")
	public void method6093(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1) {
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

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/awt/Component;I[IILjava/awt/Point;I)V")
	public void method6094(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Point arg3, @OriginalArg(5) int arg4) {
		if (arg2 == null) {
			arg0.setCursor(null);
		} else {
			@Pc(12) BufferedImage local12 = new BufferedImage(arg4, arg1, 2);
			local12.setRGB(0, 0, arg4, arg1, arg2, 0, arg4);
			arg0.setCursor(arg0.getToolkit().createCustomCursor(local12, arg3, null));
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(IIB)V")
	public void method6095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aRobot1.mouseMove(arg1, arg0);
	}
}
