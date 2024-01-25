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
public final class Class219 {

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "()V")
	public Class219() throws Exception {
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(B[ILjava/awt/Point;IILjava/awt/Component;)V")
	public void method5695(@OriginalArg(1) int[] arg0, @OriginalArg(2) Point arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Component arg4) {
		if (arg0 == null) {
			arg4.setCursor(null);
		} else {
			@Pc(9) BufferedImage local9 = new BufferedImage(arg3, arg2, 2);
			local9.setRGB(0, 0, arg3, arg2, arg0, 0, arg3);
			arg4.setCursor(arg4.getToolkit().createCustomCursor(local9, arg1, null));
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/awt/Component;ZI)V")
	public void method5696(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			arg0 = null;
		} else if (arg0 == null) {
			throw new NullPointerException();
		}
		if (arg0 == this.aComponent4) {
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

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(III)V")
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg1, arg0);
	}
}
