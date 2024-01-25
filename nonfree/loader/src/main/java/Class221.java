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

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "()V")
	public Class221() throws Exception {
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(ILjava/awt/Component;Z)V")
	public void method5840(@OriginalArg(1) Component arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			arg0 = null;
		} else if (arg0 == null) {
			throw new NullPointerException();
		}
		if (arg0 == this.aComponent2) {
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

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "([ILjava/awt/Component;ILjava/awt/Point;IZ)V")
	public void method5841(@OriginalArg(0) int[] arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Point arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null) {
			arg1.setCursor(null);
		} else {
			@Pc(18) BufferedImage local18 = new BufferedImage(arg4, arg2, 2);
			local18.setRGB(0, 0, arg4, arg2, arg0, 0, arg4);
			arg1.setCursor(arg1.getToolkit().createCustomCursor(local18, arg3, null));
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(III)V")
	public void method5842(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}
}
