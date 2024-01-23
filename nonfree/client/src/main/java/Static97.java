import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
	public static int anInt1804;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "Lclient!qf;")
	public static Class146 aClass146_8;

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "[I")
	public static int[] anIntArray146 = new int[25];

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray16 = new String[100];

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
	public static int anInt1806 = 0;

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString65 = "Connected to update server";

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
	public static volatile int anInt1808 = -1;

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "Lclient!th;")
	public static Class169 aClass169_59 = new Class169(4);

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString66 = "glow3:";

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ[[F[[FFLclient!nk;[[FI[[III[[IIIIIBI)I")
	public static int method1399(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float[][] arg2, @OriginalArg(3) float[][] arg3, @OriginalArg(4) float arg4, @OriginalArg(5) Class1_Sub20 arg5, @OriginalArg(6) float[][] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[][] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[][] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(17) int arg16) {
		@Pc(18) int local18;
		if (arg0 == 1) {
			local18 = arg10;
			arg10 = arg12;
			arg12 = 128 - local18;
		} else if (arg0 == 2) {
			arg12 = 128 - arg12;
			arg10 = 128 - arg10;
		} else if (arg0 == 3) {
			local18 = arg10;
			arg10 = 128 - arg12;
			arg12 = local18;
		}
		@Pc(98) float local98;
		@Pc(88) float local88;
		@Pc(110) int local110;
		@Pc(108) float local108;
		if (arg10 == 0 && arg12 == 0) {
			local88 = arg2[arg16][arg9];
			local110 = arg14;
			local98 = arg3[arg16][arg9];
			local108 = arg6[arg16][arg9];
		} else if (arg10 == 128 && arg12 == 0) {
			local110 = arg15;
			local98 = arg3[arg16 + 1][arg9];
			local108 = arg6[arg16 + 1][arg9];
			local88 = arg2[arg16 + 1][arg9];
		} else if (arg10 == 128 && arg12 == 128) {
			local88 = arg2[arg16 + 1][arg9 + 1];
			local98 = arg3[arg16 + 1][arg9 + 1];
			local108 = arg6[arg16 + 1][arg9 + 1];
			local110 = arg13;
		} else if (arg10 == 0 && arg12 == 128) {
			local88 = arg2[arg16][arg9 + 1];
			local98 = arg3[arg16][arg9 + 1];
			local108 = arg6[arg16][arg9 + 1];
			local110 = arg7;
		} else {
			local98 = arg3[arg16][arg9];
			local108 = arg6[arg16][arg9];
			local88 = arg2[arg16][arg9];
			@Pc(142) float local142 = (float) arg10 / 128.0F;
			@Pc(157) float local157 = local98 + (arg3[arg16 + 1][arg9] - local98) * local142;
			@Pc(162) float local162 = (float) arg12 / 128.0F;
			@Pc(177) float local177 = local88 + (arg2[arg16 + 1][arg9] - local88) * local142;
			@Pc(192) float local192 = local108 + local142 * (arg6[arg16 + 1][arg9] - local108);
			@Pc(200) float local200 = arg3[arg16][arg9 + 1];
			@Pc(208) float local208 = arg6[arg16][arg9 + 1];
			@Pc(216) float local216 = arg2[arg16][arg9 + 1];
			@Pc(232) float local232 = local216 + (arg2[arg16 + 1][arg9 + 1] - local216) * local142;
			@Pc(248) float local248 = local200 + local142 * (arg3[arg16 + 1][arg9 + 1] - local200);
			local88 = local177 + (local232 - local177) * local162;
			@Pc(274) float local274 = local208 + (arg6[arg16 + 1][arg9 + 1] - local208) * local142;
			local98 = local157 + (local248 - local157) * local162;
			@Pc(289) int local289 = Static287.method4255(arg15, arg14, arg10);
			@Pc(295) int local295 = Static287.method4255(arg13, arg7, arg10);
			local108 = local192 + local162 * (local274 - local192);
			local110 = Static287.method4255(local295, local289, arg12);
		}
		@Pc(400) int local400 = (arg9 << 7) + arg12;
		@Pc(406) int local406 = (arg16 << 7) + arg10;
		@Pc(414) int local414 = Static10.method150(arg9, arg10, arg12, arg16, arg8);
		return arg5.method3049(local406, local414, local400, local108, local98, local88, arg1 ? local110 & 0xFFFFFF00 : local110, arg11 == null ? 0.0F : (float) (local414 - Static10.method150(arg9, arg10, arg12, arg16, arg11)) / arg4);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Lclient!ib;")
	public static Class79 method1400(@OriginalArg(0) int arg0) {
		@Pc(10) Class79 local10 = (Class79) Static232.aClass169_102.method4017((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static194.aClass138_51.method3346(34, arg0);
		local10 = new Class79();
		if (local28 != null) {
			local10.method1791(arg0, new Class1_Sub14(local28));
		}
		Static232.aClass169_102.method4016(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
	public static void method1402() {
		if (Static72.anInt1374 < 0) {
			Static72.anInt1374 = 0;
			Static140.anInt2753 = -1;
			Static280.anInt5336 = -1;
		}
		if (Static58.anInt2561 < Static72.anInt1374) {
			Static140.anInt2753 = -1;
			Static280.anInt5336 = -1;
			Static72.anInt1374 = Static58.anInt2561;
		}
		if (Static75.anInt1427 < 0) {
			Static75.anInt1427 = 0;
			Static280.anInt5336 = -1;
			Static140.anInt2753 = -1;
		}
		if (Static58.anInt2563 < Static75.anInt1427) {
			Static280.anInt5336 = -1;
			Static75.anInt1427 = Static58.anInt2563;
			Static140.anInt2753 = -1;
		}
	}
}
