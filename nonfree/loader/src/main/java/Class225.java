import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!i")
public final class Class225 {

	@OriginalMember(owner = "loader!i", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "loader!i", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!i", name = "<init>", descriptor = "()V")
	public Class225() throws Exception {
	}

	@OriginalMember(owner = "loader!i", name = "a", descriptor = "(Ljava/awt/Component;IILjava/awt/Point;[II)V")
	public void method6062(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Point arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if (arg3 == null) {
			arg0.setCursor(null);
		} else {
			@Pc(9) BufferedImage local9 = new BufferedImage(arg4, arg1, 2);
			local9.setRGB(0, 0, arg4, arg1, arg3, 0, arg4);
			arg0.setCursor(arg0.getToolkit().createCustomCursor(local9, arg2, null));
		}
	}

	@OriginalMember(owner = "loader!i", name = "a", descriptor = "(IZI)V")
	public void method6063(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}

	@OriginalMember(owner = "loader!i", name = "a", descriptor = "(ZZLjava/awt/Component;)V")
	public void method6064(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1) {
		if (arg0) {
			arg1 = null;
		} else if (arg1 == null) {
			throw new NullPointerException();
		}
		if (arg1 == this.aComponent2) {
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
}
