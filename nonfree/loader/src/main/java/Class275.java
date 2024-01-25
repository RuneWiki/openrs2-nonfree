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
public final class Class275 {

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "()V")
	public Class275() throws Exception {
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(ZII)V")
	public void method5770(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg1, arg0);
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(ZLjava/awt/Component;Z)V")
	public void method5771(@OriginalArg(1) Component arg0, @OriginalArg(2) boolean arg1) {
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

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/awt/Component;[IBLjava/awt/Point;II)V")
	public void method5772(@OriginalArg(0) Component arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Point arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == null) {
			arg0.setCursor(null);
		} else {
			@Pc(17) BufferedImage local17 = new BufferedImage(arg3, arg4, 2);
			local17.setRGB(0, 0, arg3, arg4, arg1, 0, arg3);
			arg0.setCursor(arg0.getToolkit().createCustomCursor(local17, arg2, null));
		}
	}
}
