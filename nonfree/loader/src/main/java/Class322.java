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
public final class Class322 {

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "()V")
	public Class322() throws Exception {
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(ZII)V")
	public void method7997(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg1, arg0);
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(ZBLjava/awt/Component;)V")
	public void method7998(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1) {
		if (arg0) {
			arg1 = null;
		} else if (arg1 == null) {
			throw new NullPointerException();
		}
		if (arg1 == this.aComponent5) {
			return;
		}
		if (this.aComponent5 != null) {
			this.aComponent5.setCursor(null);
			this.aComponent5 = null;
		}
		if (arg1 != null) {
			arg1.setCursor(arg1.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
			this.aComponent5 = arg1;
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(ILjava/awt/Component;I[IILjava/awt/Point;)V")
	public void method7999(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) Point arg4) {
		if (arg3 == null) {
			arg1.setCursor(null);
		} else {
			@Pc(13) BufferedImage local13 = new BufferedImage(arg2, arg0, 2);
			local13.setRGB(0, 0, arg2, arg0, arg3, 0, arg2);
			arg1.setCursor(arg1.getToolkit().createCustomCursor(local13, arg4, null));
		}
	}
}
