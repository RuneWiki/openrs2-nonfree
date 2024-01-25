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
public final class Class321 {

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "()V")
	public Class321() throws Exception {
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(IIILjava/awt/Point;[ILjava/awt/Component;)V")
	public void method8270(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Point arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Component arg4) {
		if (arg3 == null) {
			arg4.setCursor(null);
		} else {
			@Pc(20) BufferedImage local20 = new BufferedImage(arg1, arg0, 2);
			local20.setRGB(0, 0, arg1, arg0, arg3, 0, arg1);
			arg4.setCursor(arg4.getToolkit().createCustomCursor(local20, arg2, null));
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(BII)V")
	public void method8271(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(ZLjava/awt/Component;Z)V")
	public void method8272(@OriginalArg(1) Component arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			arg0 = null;
		} else if (arg0 == null) {
			throw new NullPointerException();
		}
		if (arg0 == this.aComponent5) {
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
