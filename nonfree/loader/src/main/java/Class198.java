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
public final class Class198 {

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/awt/Robot;")
	private Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "()V")
	public Class198() throws Exception {
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(ZLjava/awt/Component;I)V")
	public void method4795(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1) {
		if (arg0) {
			arg1 = null;
		} else if (arg1 == null) {
			throw new NullPointerException();
		}
		if (arg1 == this.aComponent3) {
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

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(ILjava/awt/Point;[ILjava/awt/Component;II)V")
	public void method4796(@OriginalArg(1) Point arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == null) {
			arg2.setCursor(null);
		} else {
			@Pc(12) BufferedImage local12 = new BufferedImage(arg4, arg3, 2);
			local12.setRGB(0, 0, arg4, arg3, arg1, 0, arg4);
			arg2.setCursor(arg2.getToolkit().createCustomCursor(local12, arg0, null));
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(IIB)V")
	public void method4797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}
}
