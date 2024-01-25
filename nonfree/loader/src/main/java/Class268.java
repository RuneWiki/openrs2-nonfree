import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!b")
public final class Class268 {

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "()V")
	public Class268() throws Exception {
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(IILjava/awt/Component;[ILjava/awt/Point;I)V")
	public void method6609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Point arg4) {
		if (arg3 == null) {
			arg2.setCursor(null);
		} else {
			@Pc(8) BufferedImage local8 = new BufferedImage(arg1, arg0, 2);
			local8.setRGB(0, 0, arg1, arg0, arg3, 0, arg1);
			arg2.setCursor(arg2.getToolkit().createCustomCursor(local8, arg4, null));
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(ZLjava/awt/Component;B)V")
	public void method6610(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1) {
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

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(IBI)V")
	public void method6611(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}
}
