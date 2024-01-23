import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!gf", name = "z", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!gf", name = "q", descriptor = "[I")
	public static int[] anIntArray125 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "Lclient!gd;")
	public static Class61 aClass61_15 = new Class61(260);

	@OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
	public static int anInt1862 = 0;

	@OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
	public static int anInt1864 = 0;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "([ILclient!ck;III[[FILclient!ig;[[F[[F[[I)V")
	public static void method1415(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[][] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class80 arg6, @OriginalArg(8) float[][] arg7, @OriginalArg(9) float[][] arg8, @OriginalArg(10) int[][] arg9) {
		@Pc(7) int[] local7 = new int[arg0.length / 2];
		for (@Pc(13) int local13 = 0; local13 < local7.length; local13++) {
			@Pc(24) int local24 = arg0[local13 + local13];
			@Pc(32) int local32 = arg0[local13 + local13 + 1];
			@Pc(39) int local39;
			if (arg3 == 1) {
				local39 = local24;
				local24 = local32;
				local32 = 128 - local39;
			} else if (arg3 == 2) {
				local32 = 128 - local32;
				local24 = 128 - local24;
			} else if (arg3 == 3) {
				local39 = local24;
				local24 = 128 - local32;
				local32 = local39;
			}
			@Pc(101) float local101;
			@Pc(109) float local109;
			@Pc(117) float local117;
			if (local24 == 0 && local32 == 0) {
				local117 = arg8[arg2][arg5];
				local101 = arg4[arg2][arg5];
				local109 = arg7[arg2][arg5];
			} else if (local24 == 128 && local32 == 0) {
				local101 = arg4[arg2 + 1][arg5];
				local109 = arg7[arg2 + 1][arg5];
				local117 = arg8[arg2 + 1][arg5];
			} else if (local24 == 128 && local32 == 128) {
				local109 = arg7[arg2 + 1][arg5 + 1];
				local117 = arg8[arg2 + 1][arg5 + 1];
				local101 = arg4[arg2 + 1][arg5 + 1];
			} else if (local24 == 0 && local32 == 128) {
				local109 = arg7[arg2][arg5 + 1];
				local101 = arg4[arg2][arg5 + 1];
				local117 = arg8[arg2][arg5 + 1];
			} else {
				local117 = arg8[arg2][arg5];
				@Pc(148) float local148 = (float) local24 / 128.0F;
				local101 = arg4[arg2][arg5];
				@Pc(159) float local159 = (float) local32 / 128.0F;
				@Pc(173) float local173 = local101 + local148 * (arg4[arg2 + 1][arg5] - local101);
				@Pc(181) float local181 = arg7[arg2][arg5 + 1];
				@Pc(189) float local189 = arg8[arg2][arg5 + 1];
				local109 = arg7[arg2][arg5];
				@Pc(209) float local209 = local117 + local148 * (arg8[arg2 + 1][arg5] - local117);
				@Pc(217) float local217 = arg4[arg2][arg5 + 1];
				@Pc(234) float local234 = local217 + (arg4[arg2 + 1][arg5 + 1] - local217) * local148;
				@Pc(248) float local248 = local109 + local148 * (arg7[arg2 + 1][arg5] - local109);
				@Pc(265) float local265 = local181 + (arg7[arg2 + 1][arg5 + 1] - local181) * local148;
				local101 = local173 + (local234 - local173) * local159;
				local109 = local248 + (local265 - local248) * local159;
				@Pc(300) float local300 = local189 + local148 * (arg8[arg2 + 1][arg5 + 1] - local189);
				local117 = local209 + local159 * (local300 - local209);
			}
			@Pc(393) int local393 = local32 + (arg5 << 7);
			@Pc(400) int local400 = (arg2 << 7) + local24;
			@Pc(408) int local408 = Static9.method82(arg2, local24, arg9, local32, arg5);
			local7[local13] = arg6.method1825(arg1, local400, local408, local393, local117, local101, local109);
		}
		arg6.method1823(local7);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IBI)I")
	public static int method1417(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 - 1 & arg1 >> 31;
		return ((arg1 >>> 31) + arg1) % arg0 + local14;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIII)Z")
	public static boolean method1418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static125.method1985(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static195.anIntArrayArrayArray7[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static228.anInt4644) {
					if (!Static124.method1979(local10, local24, local14)) {
						return false;
					}
					if (!Static124.method1979(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static124.method1979(local10, local28, local14)) {
						return false;
					}
					if (!Static124.method1979(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static124.method1979(local10, local32, local14)) {
					return false;
				}
				if (!Static124.method1979(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static64.anInt1382) {
					if (!Static124.method1979(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static124.method1979(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static124.method1979(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static124.method1979(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static124.method1979(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static124.method1979(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static228.anInt4644) {
					if (!Static124.method1979(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static124.method1979(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static124.method1979(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static124.method1979(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static124.method1979(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static124.method1979(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static64.anInt1382) {
					if (!Static124.method1979(local10, local24, local14)) {
						return false;
					}
					if (!Static124.method1979(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static124.method1979(local10, local28, local14)) {
						return false;
					}
					if (!Static124.method1979(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static124.method1979(local10, local32, local14)) {
					return false;
				}
				if (!Static124.method1979(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static124.method1979(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static124.method1979(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static124.method1979(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static124.method1979(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static124.method1979(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZIIIII)V")
	public static void method1419(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 >= Static253.anInt4996 && arg1 <= Static52.anInt1146 && Static228.anInt4643 <= arg4 && Static244.anInt4872 >= arg0) {
			Static25.method436(arg3, arg1, arg0, arg2, arg4);
		} else {
			Static40.method620(arg0, arg1, arg4, arg2, arg3);
		}
	}
}
