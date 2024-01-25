import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!b")
public final class Class274 {

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "()V")
	public Class274() throws Exception {
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/awt/Point;II[ILjava/awt/Component;I)V")
	public void method6304(@OriginalArg(0) Point arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Component arg3, @OriginalArg(5) int arg4) {
		if (arg2 == null) {
			arg3.setCursor(null);
		} else {
			@Pc(13) BufferedImage local13 = new BufferedImage(arg1, arg4, 2);
			local13.setRGB(0, 0, arg1, arg4, arg2, 0, arg1);
			arg3.setCursor(arg3.getToolkit().createCustomCursor(local13, arg0, null));
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/awt/Component;BZ)V")
	public void method6305(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1) {
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

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(III)V")
	public void method6306(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}
}
