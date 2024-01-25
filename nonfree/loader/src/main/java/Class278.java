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
public final class Class278 {

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "()V")
	public Class278() throws Exception {
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(III)V")
	public void method6089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aRobot1.mouseMove(arg1, arg0);
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/awt/Component;ZZ)V")
	public void method6090(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1) {
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

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/awt/Point;I[ILjava/awt/Component;IZ)V")
	public void method6091(@OriginalArg(0) Point arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Component arg3, @OriginalArg(4) int arg4) {
		if (arg2 == null) {
			arg3.setCursor(null);
		} else {
			@Pc(15) BufferedImage local15 = new BufferedImage(arg4, arg1, 2);
			local15.setRGB(0, 0, arg4, arg1, arg2, 0, arg4);
			arg3.setCursor(arg3.getToolkit().createCustomCursor(local15, arg0, null));
		}
	}
}
