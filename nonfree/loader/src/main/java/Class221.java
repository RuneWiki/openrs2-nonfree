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
public final class Class221 {

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "()V")
	public Class221() throws Exception {
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
	public void method5876(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1) {
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

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(III)V")
	public void method5877(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(I[ILjava/awt/Point;IILjava/awt/Component;)V")
	public void method5878(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Point arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Component arg4) {
		if (arg1 == null) {
			arg4.setCursor(null);
		} else {
			@Pc(21) BufferedImage local21 = new BufferedImage(arg3, arg0, 2);
			local21.setRGB(0, 0, arg3, arg0, arg1, 0, arg3);
			arg4.setCursor(arg4.getToolkit().createCustomCursor(local21, arg2, null));
		}
	}
}
