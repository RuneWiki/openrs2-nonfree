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
public final class Class326 {

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "()V")
	public Class326() throws Exception {
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(III)V")
	public void method7500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aRobot1.mouseMove(arg1, arg0);
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(ILjava/awt/Component;[IIILjava/awt/Point;)V")
	public void method7501(@OriginalArg(1) Component arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Point arg4) {
		if (arg1 == null) {
			arg0.setCursor(null);
		} else {
			@Pc(8) BufferedImage local8 = new BufferedImage(arg3, arg2, 2);
			local8.setRGB(0, 0, arg3, arg2, arg1, 0, arg3);
			arg0.setCursor(arg0.getToolkit().createCustomCursor(local8, arg4, null));
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(BLjava/awt/Component;Z)V")
	public void method7502(@OriginalArg(1) Component arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			arg0 = null;
		} else if (arg0 == null) {
			throw new NullPointerException();
		}
		if (this.aComponent5 == arg0) {
			return;
		}
		if (this.aComponent5 != null) {
			this.aComponent5.setCursor(null);
			this.aComponent5 = null;
		}
		if (arg0 != null) {
			arg0.setCursor(arg0.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
			this.aComponent5 = arg0;
		}
	}
}
