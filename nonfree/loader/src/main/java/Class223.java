import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!f")
public final class Class223 {

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "()V")
	public Class223() throws Exception {
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(III)V")
	public void method5754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aRobot1.mouseMove(arg1, arg0);
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(ZBLjava/awt/Component;)V")
	public void method5755(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1) {
		if (arg0) {
			arg1 = null;
		} else if (arg1 == null) {
			throw new NullPointerException();
		}
		if (this.aComponent2 == arg1) {
			return;
		}
		if (this.aComponent2 != null) {
			this.aComponent2.setCursor(null);
			this.aComponent2 = null;
		}
		if (arg1 != null) {
			arg1.setCursor(arg1.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
			this.aComponent2 = arg1;
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/awt/Point;ZILjava/awt/Component;[II)V")
	public void method5756(@OriginalArg(0) Point arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if (arg3 == null) {
			arg2.setCursor(null);
		} else {
			@Pc(15) BufferedImage local15 = new BufferedImage(arg4, arg1, 2);
			local15.setRGB(0, 0, arg4, arg1, arg3, 0, arg4);
			arg2.setCursor(arg2.getToolkit().createCustomCursor(local15, arg0, null));
		}
	}
}
