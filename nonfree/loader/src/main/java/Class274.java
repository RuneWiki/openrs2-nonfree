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
public final class Class274 {

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "()V")
	public Class274() throws Exception {
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(IIB)V")
	public void method5913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(ZLjava/awt/Component;B)V")
	public void method5914(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1) {
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

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/awt/Component;Ljava/awt/Point;IBI[I)V")
	public void method5915(@OriginalArg(0) Component arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if (arg4 == null) {
			arg0.setCursor(null);
		} else {
			@Pc(9) BufferedImage local9 = new BufferedImage(arg3, arg2, 2);
			local9.setRGB(0, 0, arg3, arg2, arg4, 0, arg3);
			arg0.setCursor(arg0.getToolkit().createCustomCursor(local9, arg1, null));
		}
	}
}
