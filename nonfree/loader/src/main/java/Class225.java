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
public final class Class225 {

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "()V")
	public Class225() throws Exception {
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/awt/Component;ZZ)V")
	public void method5793(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			arg0 = null;
		} else if (arg0 == null) {
			throw new NullPointerException();
		}
		if (this.aComponent2 == arg0) {
			return;
		}
		if (this.aComponent2 != null) {
			this.aComponent2.setCursor(null);
			this.aComponent2 = null;
		}
		if (arg0 != null) {
			arg0.setCursor(arg0.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
			this.aComponent2 = arg0;
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(III)V")
	public void method5794(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg1, arg0);
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "([ILjava/awt/Component;IILjava/awt/Point;I)V")
	public void method5795(@OriginalArg(0) int[] arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Point arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			arg1.setCursor(null);
		} else {
			@Pc(9) BufferedImage local9 = new BufferedImage(arg2, arg4, 2);
			local9.setRGB(0, 0, arg2, arg4, arg0, 0, arg2);
			arg1.setCursor(arg1.getToolkit().createCustomCursor(local9, arg3, null));
		}
	}
}
