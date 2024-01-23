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
public final class Class207 {

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/awt/Robot;")
	private Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "()V")
	public Class207() throws Exception {
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(ILjava/awt/Component;IILjava/awt/Point;[I)V")
	public void method4712(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Point arg3, @OriginalArg(5) int[] arg4) {
		if (arg4 == null) {
			arg1.setCursor(null);
		} else {
			@Pc(19) BufferedImage local19 = new BufferedImage(arg2, arg0, 2);
			local19.setRGB(0, 0, arg2, arg0, arg4, 0, arg2);
			arg1.setCursor(arg1.getToolkit().createCustomCursor(local19, arg3, null));
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(ZLjava/awt/Component;B)V")
	public void method4713(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1) {
		if (arg0) {
			arg1 = null;
		} else if (arg1 == null) {
			throw new NullPointerException();
		}
		if (this.aComponent5 == arg1) {
			return;
		}
		if (this.aComponent5 != null) {
			this.aComponent5.setCursor(null);
			this.aComponent5 = null;
		}
		if (arg1 != null) {
			arg1.setCursor(arg1.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
			this.aComponent5 = arg1;
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(IIZ)V")
	public void method4714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aRobot1.mouseMove(arg1, arg0);
	}
}
