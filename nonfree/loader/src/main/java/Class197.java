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
public final class Class197 {

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/awt/Robot;")
	private Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "()V")
	public Class197() throws Exception {
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(IZI)V")
	public void method4767(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(ZBLjava/awt/Component;)V")
	public void method4768(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1) {
		if (arg0) {
			arg1 = null;
		} else if (arg1 == null) {
			throw new NullPointerException();
		}
		if (this.aComponent3 == arg1) {
			return;
		}
		if (this.aComponent3 != null) {
			this.aComponent3.setCursor(null);
			this.aComponent3 = null;
		}
		if (arg1 != null) {
			arg1.setCursor(arg1.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
			this.aComponent3 = arg1;
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(ILjava/awt/Component;I[IILjava/awt/Point;)V")
	public void method4769(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Point arg4) {
		if (arg2 == null) {
			arg0.setCursor(null);
		} else {
			@Pc(17) BufferedImage local17 = new BufferedImage(arg1, arg3, 2);
			local17.setRGB(0, 0, arg1, arg3, arg2, 0, arg1);
			arg0.setCursor(arg0.getToolkit().createCustomCursor(local17, arg4, null));
		}
	}
}
