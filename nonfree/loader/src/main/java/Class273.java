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
public final class Class273 {

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "()V")
	public Class273() throws Exception {
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(IBI)V")
	public void method5725(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(ZLjava/awt/Component;Z)V")
	public void method5726(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1) {
		if (arg0) {
			arg1 = null;
		} else if (arg1 == null) {
			throw new NullPointerException();
		}
		if (arg1 == this.aComponent4) {
			return;
		}
		if (this.aComponent4 != null) {
			this.aComponent4.setCursor(null);
			this.aComponent4 = null;
		}
		if (arg1 != null) {
			arg1.setCursor(arg1.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
			this.aComponent4 = arg1;
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "([IILjava/awt/Component;IBLjava/awt/Point;)V")
	public void method5727(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Point arg4) {
		if (arg0 == null) {
			arg2.setCursor(null);
		} else {
			@Pc(12) BufferedImage local12 = new BufferedImage(arg1, arg3, 2);
			local12.setRGB(0, 0, arg1, arg3, arg0, 0, arg1);
			arg2.setCursor(arg2.getToolkit().createCustomCursor(local12, arg4, null));
		}
	}
}
