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
public final class Class196 {

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/awt/Robot;")
	private Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "()V")
	public Class196() throws Exception {
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ZLjava/awt/Component;Z)V")
	public void method4671(@OriginalArg(1) Component arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			arg0 = null;
		} else if (arg0 == null) {
			throw new NullPointerException();
		}
		if (arg0 == this.aComponent3) {
			return;
		}
		if (this.aComponent3 != null) {
			this.aComponent3.setCursor(null);
			this.aComponent3 = null;
		}
		if (arg0 != null) {
			arg0.setCursor(arg0.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
			this.aComponent3 = arg0;
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(I[ILjava/awt/Component;ILjava/awt/Point;I)V")
	public void method4672(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Component arg2, @OriginalArg(4) Point arg3, @OriginalArg(5) int arg4) {
		if (arg1 == null) {
			arg2.setCursor(null);
		} else {
			@Pc(27) BufferedImage local27 = new BufferedImage(arg0, arg4, 2);
			local27.setRGB(0, 0, arg0, arg4, arg1, 0, arg0);
			arg2.setCursor(arg2.getToolkit().createCustomCursor(local27, arg3, null));
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(III)V")
	public void method4673(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg1, arg0);
	}
}
