import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
	public static int anInt4253;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "[Lclient!i;")
	public static final Class89[] aClass89Array5 = new Class89[14];

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Lclient!cj;")
	public static final Class37 aClass37_4 = Static161.method2845();

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "[S")
	public static final short[] aShortArray58 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
	public static int anInt4252 = 0;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method3936(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		if (arg4 < 128 || arg2 < 128 || arg4 > (Static22.anInt481 - 2) * 128 || arg2 > (Static269.anInt5281 - 2) * 128) {
			Static123.anIntArray224[0] = Static123.anIntArray224[1] = -1;
			return;
		}
		@Pc(55) int local55 = Static208.method3804(Static239.anInt4811, arg4, arg2) - arg3;
		Static303.aClass66_5.method5825(arg5, 0, 0);
		Static236.aClass55_9.method5252(Static303.aClass66_5);
		Static236.aClass55_9.method5215(arg4, local55, arg2, Static123.anIntArray224);
		Static303.aClass66_5.method5825(-arg5, 0, 0);
		Static236.aClass55_9.method5252(Static303.aClass66_5);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 == arg6 && arg4 == arg5 && arg2 == arg1 && arg0 == arg8) {
			Static329.method5698(arg7, arg6, arg0, arg2, arg5);
			return;
		}
		@Pc(36) int local36 = arg6;
		@Pc(38) int local38 = arg5;
		@Pc(42) int local42 = arg6 * 3;
		@Pc(46) int local46 = arg5 * 3;
		@Pc(50) int local50 = arg3 * 3;
		@Pc(54) int local54 = arg4 * 3;
		@Pc(58) int local58 = arg1 * 3;
		@Pc(62) int local62 = arg8 * 3;
		@Pc(73) int local73 = arg2 + local50 - arg6 - local58;
		@Pc(82) int local82 = local54 + arg0 - local62 - arg5;
		@Pc(92) int local92 = local42 + local58 - local50 - local50;
		@Pc(102) int local102 = local62 + local46 - local54 - local54;
		@Pc(107) int local107 = local50 - local42;
		@Pc(111) int local111 = local54 - local46;
		for (@Pc(113) int local113 = 128; local113 <= 4096; local113 += 128) {
			@Pc(121) int local121 = local113 * local113 >> 12;
			@Pc(127) int local127 = local113 * local121 >> 12;
			@Pc(131) int local131 = local127 * local73;
			@Pc(135) int local135 = local127 * local82;
			@Pc(139) int local139 = local92 * local121;
			@Pc(143) int local143 = local102 * local121;
			@Pc(147) int local147 = local107 * local113;
			@Pc(151) int local151 = local111 * local113;
			@Pc(162) int local162 = arg6 + (local147 + local131 + local139 >> 12);
			@Pc(173) int local173 = (local151 + local135 + local143 >> 12) + arg5;
			Static329.method5698(arg7, local36, local173, local162, local38);
			local38 = local173;
			local36 = local162;
		}
	}
}
