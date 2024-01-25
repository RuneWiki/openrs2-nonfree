import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!g")
public final class Class276 {

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "()V")
	public Class276() throws Exception {
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/awt/Point;IBLjava/awt/Component;[II)V")
	public void method6124(@OriginalArg(0) Point arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if (arg3 == null) {
			arg2.setCursor(null);
		} else {
			@Pc(27) BufferedImage local27 = new BufferedImage(arg1, arg4, 2);
			local27.setRGB(0, 0, arg1, arg4, arg3, 0, arg1);
			arg2.setCursor(arg2.getToolkit().createCustomCursor(local27, arg0, null));
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(III)V")
	public void method6125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(ZLjava/awt/Component;I)V")
	public void method6126(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1) {
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
}
