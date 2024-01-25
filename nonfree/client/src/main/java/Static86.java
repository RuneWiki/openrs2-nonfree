import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_29 = new Class253(80, 12);

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
	public static int anInt1689 = 0;

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "[I")
	public static final int[] anIntArray111 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)B")
	public static byte method1475(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLclient!gk;)Ljava/lang/String;")
	public static String method1477(@OriginalArg(1) Class7_Sub14 arg0) {
		return Static365.method4702(arg0);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)S")
	public static short method1478(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(37) int local37 = local19 <= 64 ? local19 * local15 >> 7 : local15 * (127 - local19) >> 7;
		@Pc(41) int local41 = local37 + local19;
		@Pc(55) int local55;
		if (local41 == 0) {
			local55 = local37 << 1;
		} else {
			local55 = (local37 << 8) / local41;
		}
		return (short) (local9 << 10 | local55 >> 4 << 7 | local41);
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
	public static void method1480() {
		if (Static99.aClass116_1 != null) {
			Static99.aClass116_1.method5573();
		}
		if (Static247.aClass116_3 != null) {
			Static247.aClass116_3.method5573();
		}
	}
}
