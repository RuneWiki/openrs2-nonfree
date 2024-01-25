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
public final class Class220 {

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "()V")
	public Class220() throws Exception {
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(I[ILjava/awt/Component;IILjava/awt/Point;)V")
	public void method5708(@OriginalArg(1) int[] arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Point arg4) {
		if (arg0 == null) {
			arg1.setCursor(null);
		} else {
			@Pc(9) BufferedImage local9 = new BufferedImage(arg3, arg2, 2);
			local9.setRGB(0, 0, arg3, arg2, arg0, 0, arg3);
			arg1.setCursor(arg1.getToolkit().createCustomCursor(local9, arg4, null));
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(III)V")
	public void method5709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aRobot1.mouseMove(arg1, arg0);
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
	public void method5710(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1) {
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
}
