import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!d")
public final class Class206 {

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Ljava/awt/Robot;")
	private Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "()V")
	public Class206() throws Exception {
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(I[IBLjava/awt/Point;Ljava/awt/Component;I)V")
	public void method5163(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Point arg2, @OriginalArg(4) Component arg3, @OriginalArg(5) int arg4) {
		if (arg1 == null) {
			arg3.setCursor(null);
		} else {
			@Pc(8) BufferedImage local8 = new BufferedImage(arg0, arg4, 2);
			local8.setRGB(0, 0, arg0, arg4, arg1, 0, arg0);
			arg3.setCursor(arg3.getToolkit().createCustomCursor(local8, arg2, null));
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(ZILjava/awt/Component;)V")
	public void method5164(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1) {
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

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(III)V")
	public void method5165(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg1, arg0);
	}
}
