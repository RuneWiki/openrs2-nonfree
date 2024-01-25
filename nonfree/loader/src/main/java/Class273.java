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
public final class Class273 {

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "()V")
	public Class273() throws Exception {
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(ILjava/awt/Component;IBLjava/awt/Point;[I)V")
	public void method5666(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Point arg3, @OriginalArg(5) int[] arg4) {
		if (arg4 == null) {
			arg1.setCursor(null);
		} else {
			@Pc(12) BufferedImage local12 = new BufferedImage(arg0, arg2, 2);
			local12.setRGB(0, 0, arg0, arg2, arg4, 0, arg0);
			arg1.setCursor(arg1.getToolkit().createCustomCursor(local12, arg3, null));
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(III)V")
	public void method5667(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg1, arg0);
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/awt/Component;BZ)V")
	public void method5668(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1) {
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
}
