import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg3 && arg2 == arg8 && arg7 == arg5 && arg1 == arg6) {
			Static258.method3722(arg8, arg3, arg5, arg1, arg0);
			return;
		}
		@Pc(32) int local32 = arg3;
		@Pc(34) int local34 = arg8;
		@Pc(38) int local38 = arg3 * 3;
		@Pc(42) int local42 = arg8 * 3;
		@Pc(46) int local46 = arg4 * 3;
		@Pc(50) int local50 = arg2 * 3;
		@Pc(54) int local54 = arg7 * 3;
		@Pc(58) int local58 = arg6 * 3;
		@Pc(66) int local66 = local46 + arg5 - local54 - arg3;
		@Pc(75) int local75 = local50 + arg1 - arg8 - local58;
		@Pc(84) int local84 = local54 + local38 - local46 - local46;
		@Pc(94) int local94 = local42 + local58 - local50 - local50;
		@Pc(99) int local99 = local46 - local38;
		@Pc(104) int local104 = local50 - local42;
		for (@Pc(106) int local106 = 128; local106 <= 4096; local106 += 128) {
			@Pc(114) int local114 = local106 * local106 >> 12;
			@Pc(120) int local120 = local114 * local106 >> 12;
			@Pc(124) int local124 = local120 * local66;
			@Pc(128) int local128 = local120 * local75;
			@Pc(132) int local132 = local114 * local84;
			@Pc(136) int local136 = local94 * local114;
			@Pc(140) int local140 = local99 * local106;
			@Pc(144) int local144 = local106 * local104;
			@Pc(154) int local154 = arg3 + (local140 + local132 + local124 >> 12);
			@Pc(164) int local164 = (local136 + local128 + local144 >> 12) + arg8;
			Static258.method3722(local34, local32, local154, local164, arg0);
			local34 = local164;
			local32 = local154;
		}
	}
}
