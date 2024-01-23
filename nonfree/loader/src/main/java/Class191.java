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
public final class Class191 {

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "Ljava/awt/Robot;")
	private Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "()V")
	public Class191() throws Exception {
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(ZLjava/awt/Component;Z)V")
	public void method4722(@OriginalArg(1) Component arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			arg0 = null;
		} else if (arg0 == null) {
			throw new NullPointerException();
		}
		if (this.aComponent3 == arg0) {
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

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(BII)V")
	public void method4723(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg1, arg0);
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/awt/Point;I[IIILjava/awt/Component;)V")
	public void method4724(@OriginalArg(0) Point arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Component arg4) {
		if (arg1 == null) {
			arg4.setCursor(null);
		} else {
			@Pc(9) BufferedImage local9 = new BufferedImage(arg3, arg2, 2);
			local9.setRGB(0, 0, arg3, arg2, arg1, 0, arg3);
			arg4.setCursor(arg4.getToolkit().createCustomCursor(local9, arg0, null));
		}
	}
}
