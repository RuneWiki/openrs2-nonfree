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
public final class Class322 {

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "()V")
	public Class322() throws Exception {
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(III)V")
	public void method8024(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg1, arg0);
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(I[ILjava/awt/Component;BILjava/awt/Point;)V")
	public void method8025(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Component arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Point arg4) {
		if (arg1 == null) {
			arg2.setCursor(null);
		} else {
			@Pc(16) BufferedImage local16 = new BufferedImage(arg3, arg0, 2);
			local16.setRGB(0, 0, arg3, arg0, arg1, 0, arg3);
			arg2.setCursor(arg2.getToolkit().createCustomCursor(local16, arg4, null));
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(ZLjava/awt/Component;Z)V")
	public void method8026(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1) {
		if (arg0) {
			arg1 = null;
		} else if (arg1 == null) {
			throw new NullPointerException();
		}
		if (arg1 == this.aComponent5) {
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
}
