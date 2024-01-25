import java.awt.Color;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!el", name = "a", descriptor = "Lclient!oi;")
	public static Class185 aClass185_30;

	@OriginalMember(owner = "client!el", name = "f", descriptor = "I")
	public static int anInt1305;

	@OriginalMember(owner = "client!el", name = "g", descriptor = "Lclient!oi;")
	public static Class185 aClass185_31;

	@OriginalMember(owner = "client!el", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray28;

	@OriginalMember(owner = "client!el", name = "d", descriptor = "I")
	public static int anInt1304 = 0;

	@OriginalMember(owner = "client!el", name = "e", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!nt;Ljava/awt/Frame;B)V")
	public static void method1146(@OriginalArg(0) Class177 arg0, @OriginalArg(1) Frame arg1) {
		while (true) {
			@Pc(10) Class253 local10 = arg0.method3844(arg1);
			while (local10.anInt6669 == 0) {
				Static331.method4343(10L);
			}
			if (local10.anInt6669 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static331.method4343(100L);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IB)Z")
	public static boolean method1148(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}
}
