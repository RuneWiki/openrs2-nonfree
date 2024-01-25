import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!h")
public final class Class225 {

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "loader!h", name = "b", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "()V")
	public Class225() throws Exception {
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(BZLjava/awt/Component;)V")
	public void method5735(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1) {
		if (arg0) {
			arg1 = null;
		} else if (arg1 == null) {
			throw new NullPointerException();
		}
		if (this.aComponent2 == arg1) {
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

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(ILjava/awt/Point;I[ILjava/awt/Component;I)V")
	public void method5736(@OriginalArg(1) Point arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Component arg3, @OriginalArg(5) int arg4) {
		if (arg2 == null) {
			arg3.setCursor(null);
		} else {
			@Pc(19) BufferedImage local19 = new BufferedImage(arg1, arg4, 2);
			local19.setRGB(0, 0, arg1, arg4, arg2, 0, arg1);
			arg3.setCursor(arg3.getToolkit().createCustomCursor(local19, arg0, null));
		}
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(IBI)V")
	public void method5737(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg1, arg0);
	}
}
