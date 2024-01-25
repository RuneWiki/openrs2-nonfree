import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
	public static int anInt1927;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_24 = new Class303(51, 4);

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[III[IZILclient!jw;IIIBIII)I")
	public static int method1744(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class169 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static285.anIntArrayArray111[local7][local11] = 0;
				Static427.anIntArrayArray161[local7][local11] = 99999999;
			}
		}
		@Pc(61) boolean local61;
		if (arg8 == 1) {
			local61 = Static430.method6069(arg6, arg7, arg0, arg12, arg10, arg11, arg9, arg13, arg3, arg2);
		} else if (arg8 == 2) {
			local61 = Static445.method6212(arg2, arg9, arg7, arg0, arg6, arg3, arg13, arg10, arg11, arg12);
		} else {
			local61 = Static409.method5903(arg13, arg9, arg0, arg2, arg12, arg3, arg6, arg8, arg11, arg7, arg10);
		}
		@Pc(95) int local95 = arg9 - 64;
		@Pc(99) int local99 = arg10 - 64;
		@Pc(101) int local101 = Static505.anInt8221;
		@Pc(103) int local103 = Static439.anInt7337;
		@Pc(111) int local111;
		@Pc(113) int local113;
		@Pc(120) int local120;
		if (!local61) {
			if (!arg5) {
				return -1;
			}
			local111 = Integer.MAX_VALUE;
			local113 = Integer.MAX_VALUE;
			for (local120 = arg11 - 10; local120 <= arg11 + 10; local120++) {
				for (@Pc(126) int local126 = arg0 - 10; local126 <= arg0 + 10; local126++) {
					@Pc(133) int local133 = local120 - local95;
					@Pc(138) int local138 = local126 - local99;
					if (local133 >= 0 && local138 >= 0 && local133 < 128 && local138 < 128 && Static427.anIntArrayArray161[local133][local138] < 100) {
						@Pc(157) int local157 = 0;
						if (arg11 > local120) {
							local157 = arg11 - local120;
						} else if (local120 > arg13 + arg11 - 1) {
							local157 = local120 + 1 - arg11 - arg13;
						}
						@Pc(189) int local189 = 0;
						if (local126 < arg0) {
							local189 = arg0 - local126;
						} else if (arg12 + arg0 - 1 < local126) {
							local189 = local126 + 1 - arg12 - arg0;
						}
						@Pc(222) int local222 = local189 * local189 + local157 * local157;
						if (local222 < local111 || local222 == local111 && Static427.anIntArrayArray161[local133][local138] < local113) {
							local111 = local222;
							local113 = Static427.anIntArrayArray161[local133][local138];
							local101 = local120;
							local103 = local126;
						}
					}
				}
			}
			if (~local111 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (local101 == arg9 && local103 == arg10) {
			return 0;
		}
		@Pc(296) byte local296 = 0;
		Static305.anIntArray301[0] = local101;
		local111 = local296 + 1;
		Static47.anIntArray608[0] = local103;
		@Pc(317) int local317;
		local113 = local317 = Static285.anIntArrayArray111[local101 - local95][local103 - local99];
		while (arg9 != local101 || local103 != arg10) {
			if (local317 != local113) {
				local317 = local113;
				Static305.anIntArray301[local111] = local101;
				Static47.anIntArray608[local111++] = local103;
			}
			if ((local113 & 0x1) != 0) {
				local103++;
			} else if ((local113 & 0x4) != 0) {
				local103--;
			}
			if ((local113 & 0x2) != 0) {
				local101++;
			} else if ((local113 & 0x8) != 0) {
				local101--;
			}
			local113 = Static285.anIntArrayArray111[local101 - local95][local103 - local99];
		}
		local120 = 0;
		while (local111-- > 0) {
			arg1[local120] = Static305.anIntArray301[local111];
			arg4[local120++] = Static47.anIntArray608[local111];
			if (arg1.length <= local120) {
				break;
			}
		}
		return local120;
	}
}
