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
public final class Class270 {

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "()V")
	public Class270() throws Exception {
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/awt/Component;Ljava/awt/Point;BII[I)V")
	public void method5998(@OriginalArg(0) Component arg0, @OriginalArg(1) Point arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if (arg4 == null) {
			arg0.setCursor(null);
		} else {
			@Pc(12) BufferedImage local12 = new BufferedImage(arg3, arg2, 2);
			local12.setRGB(0, 0, arg3, arg2, arg4, 0, arg3);
			arg0.setCursor(arg0.getToolkit().createCustomCursor(local12, arg1, null));
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(ZLjava/awt/Component;I)V")
	public void method5999(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1) {
		if (arg0) {
			arg1 = null;
		} else if (arg1 == null) {
			throw new NullPointerException();
		}
		if (this.aComponent4 == arg1) {
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

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(III)V")
	public void method6000(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}
}
