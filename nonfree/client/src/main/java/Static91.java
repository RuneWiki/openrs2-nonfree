import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
	public static int anInt2242;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
	public static int anInt2239 = 0;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "[Lclient!rl;")
	public static final Class16_Sub1_Sub1_Sub3_Sub2[] aClass16_Sub1_Sub1_Sub3_Sub2Array1 = new Class16_Sub1_Sub1_Sub3_Sub2[2048];

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
	public static int anInt2244 = 0;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(FI)F")
	public static float method1883(@OriginalArg(0) float arg0) {
		return arg0 * arg0 * arg0 * (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIBIIIIIII)V")
	public static void method1885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 == arg6 && arg4 == arg2 && arg5 == arg8 && arg1 == arg7) {
			Static499.method6053(arg1, arg0, arg4, arg3, arg5);
			return;
		}
		@Pc(36) int local36 = arg3;
		@Pc(38) int local38 = arg4;
		@Pc(42) int local42 = arg3 * 3;
		@Pc(46) int local46 = arg4 * 3;
		@Pc(50) int local50 = arg6 * 3;
		@Pc(54) int local54 = arg2 * 3;
		@Pc(58) int local58 = arg8 * 3;
		@Pc(62) int local62 = arg7 * 3;
		@Pc(71) int local71 = local50 + arg5 - local58 - arg3;
		@Pc(81) int local81 = local54 + arg1 - arg4 - local62;
		@Pc(91) int local91 = local58 + local42 - local50 - local50;
		@Pc(101) int local101 = local46 + local62 - local54 - local54;
		@Pc(105) int local105 = local50 - local42;
		@Pc(110) int local110 = local54 - local46;
		for (@Pc(112) int local112 = 128; local112 <= 4096; local112 += 128) {
			@Pc(120) int local120 = local112 * local112 >> 12;
			@Pc(126) int local126 = local112 * local120 >> 12;
			@Pc(130) int local130 = local71 * local126;
			@Pc(134) int local134 = local126 * local81;
			@Pc(138) int local138 = local91 * local120;
			@Pc(142) int local142 = local101 * local120;
			@Pc(146) int local146 = local112 * local105;
			@Pc(150) int local150 = local110 * local112;
			@Pc(160) int local160 = (local146 + local138 + local130 >> 12) + arg3;
			@Pc(172) int local172 = arg4 + (local142 + local134 + local150 >> 12);
			Static499.method6053(local172, arg0, local38, local36, local160);
			local38 = local172;
			local36 = local160;
		}
	}
}
