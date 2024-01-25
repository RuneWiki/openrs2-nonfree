import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
	public static int anInt2006;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
	public static int anInt1996 = 0;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!ua;ILclient!kp;Lclient!la;ILjava/lang/String;IIILclient!sa;IB)V")
	public static void method1466(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196 arg2, @OriginalArg(3) Class29 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class294 arg9, @OriginalArg(10) int arg10) {
		@Pc(15) int local15;
		if (Static311.anInt5570 == 4) {
			local15 = (int) Static447.aFloat233 & 0x3FFF;
		} else {
			local15 = Static417.anInt7188 + (int) Static447.aFloat233 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg2.anInt5130 / 2, arg2.anInt5078 / 2) + 10;
		@Pc(42) int local42 = arg1 * arg1 + arg10 * arg10;
		if (local42 > local34 * local34) {
			return;
		}
		@Pc(52) int local52 = Class363.anIntArray697[local15];
		@Pc(56) int local56 = Class363.anIntArray698[local15];
		if (Static311.anInt5570 != 4) {
			local52 = local52 * 256 / (Static557.anInt9152 + 256);
			local56 = local56 * 256 / (Static557.anInt9152 + 256);
		}
		@Pc(87) int local87 = arg10 * local56 + local52 * arg1 >> 14;
		@Pc(106) int local106 = arg1 * local56 - arg10 * local52 >> 14;
		@Pc(113) int local113 = arg9.method6722(arg5, null, 100);
		@Pc(121) int local121 = arg9.method6727(100, 0, arg5, null);
		@Pc(127) int local127 = local87 - local113 / 2;
		if (local127 >= -arg2.anInt5130 && arg2.anInt5130 >= local127 && -arg2.anInt5078 <= local106 && arg2.anInt5078 >= local106) {
			arg3.method7104(0, 0, arg0, local113, arg5, arg6, 1, 0, 50, null, null, arg7, arg8, arg2.anInt5078 / 2 + arg8 - local121 - arg4 - local106, local127 + (arg7 - -(arg2.anInt5130 / 2)));
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I[BII)[B")
	public static byte[] method1468(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static598.method1137(arg0, arg1, local6, 0, 32768);
		return local6;
	}
}
