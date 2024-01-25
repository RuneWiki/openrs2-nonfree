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
public final class Class274 {

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "()V")
	public Class274() throws Exception {
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(ZILjava/awt/Component;)V")
	public void method6033(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1) {
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

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(IBI)V")
	public void method6034(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg1, arg0);
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(IBLjava/awt/Component;ILjava/awt/Point;[I)V")
	public void method6035(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Point arg3, @OriginalArg(5) int[] arg4) {
		if (arg4 == null) {
			arg1.setCursor(null);
		} else {
			@Pc(9) BufferedImage local9 = new BufferedImage(arg2, arg0, 2);
			local9.setRGB(0, 0, arg2, arg0, arg4, 0, arg2);
			arg1.setCursor(arg1.getToolkit().createCustomCursor(local9, arg3, null));
		}
	}
}
