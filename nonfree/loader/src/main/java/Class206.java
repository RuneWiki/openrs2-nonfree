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
public final class Class206 {

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/awt/Robot;")
	private Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "()V")
	public Class206() throws Exception {
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(BII)V")
	public void method4775(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/awt/Point;II[IILjava/awt/Component;)V")
	public void method4776(@OriginalArg(0) Point arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) Component arg4) {
		if (arg3 == null) {
			arg4.setCursor(null);
		} else {
			@Pc(15) BufferedImage local15 = new BufferedImage(arg1, arg2, 2);
			local15.setRGB(0, 0, arg1, arg2, arg3, 0, arg1);
			arg4.setCursor(arg4.getToolkit().createCustomCursor(local15, arg0, null));
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
	public void method4777(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1) {
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
