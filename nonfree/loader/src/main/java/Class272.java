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
public final class Class272 {

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "()V")
	public Class272() throws Exception {
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(ZZLjava/awt/Component;)V")
	public void method6085(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1) {
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

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(IIB)V")
	public void method6086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(ILjava/awt/Point;BILjava/awt/Component;[I)V")
	public void method6087(@OriginalArg(0) int arg0, @OriginalArg(1) Point arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3, @OriginalArg(5) int[] arg4) {
		if (arg4 == null) {
			arg3.setCursor(null);
		} else {
			@Pc(12) BufferedImage local12 = new BufferedImage(arg2, arg0, 2);
			local12.setRGB(0, 0, arg2, arg0, arg4, 0, arg2);
			arg3.setCursor(arg3.getToolkit().createCustomCursor(local12, arg1, null));
		}
	}
}
