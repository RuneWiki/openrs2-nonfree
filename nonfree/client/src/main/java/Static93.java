import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!daa", name = "p", descriptor = "[Lclient!s;")
	public static Class18[] aClass18Array33;

	@OriginalMember(owner = "client!daa", name = "q", descriptor = "I")
	public static int anInt10961 = -1;

	@OriginalMember(owner = "client!daa", name = "y", descriptor = "[Z")
	public static final boolean[] aBooleanArray66 = new boolean[8];

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "([IIIII[IZIIIIILclient!kn;II)I")
	public static int method9375(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class200 arg12, @OriginalArg(14) int arg13) {
		for (@Pc(12) int local12 = 0; local12 < 128; local12++) {
			for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
				Static296.anIntArrayArray19[local12][local16] = 0;
				Static96.anIntArrayArray16[local12][local16] = 99999999;
			}
		}
		@Pc(66) boolean local66;
		if (arg11 == 1) {
			local66 = Static81.method1409(arg12, arg9, arg13, arg7, arg2, arg8, arg10, arg3, arg4, arg1);
		} else if (arg11 == 2) {
			local66 = Static284.method4759(arg4, arg3, arg13, arg10, arg8, arg1, arg9, arg2, arg12, arg7);
		} else {
			local66 = Static232.method9284(arg9, arg3, arg10, arg13, arg7, arg1, arg4, arg8, arg11, arg12, arg2);
		}
		@Pc(100) int local100 = arg10 - 64;
		@Pc(104) int local104 = arg9 - 64;
		@Pc(106) int local106 = Static503.anInt8360;
		@Pc(108) int local108 = Static539.anInt9400;
		@Pc(116) int local116;
		@Pc(118) int local118;
		@Pc(125) int local125;
		if (!local66) {
			if (!arg6) {
				return -1;
			}
			local116 = Integer.MAX_VALUE;
			local118 = Integer.MAX_VALUE;
			for (local125 = arg2 - 10; local125 <= arg2 + 10; local125++) {
				for (@Pc(132) int local132 = arg1 - 10; local132 <= arg1 + 10; local132++) {
					@Pc(139) int local139 = local125 - local100;
					@Pc(143) int local143 = local132 - local104;
					if (local139 >= 0 && local143 >= 0 && local139 < 128 && local143 < 128 && Static96.anIntArrayArray16[local139][local143] < 100) {
						@Pc(167) int local167 = 0;
						if (arg2 > local125) {
							local167 = arg2 - local125;
						} else if (local125 > arg2 + arg8 - 1) {
							local167 = local125 + 1 - arg8 - arg2;
						}
						@Pc(199) int local199 = 0;
						if (local132 < arg1) {
							local199 = arg1 - local132;
						} else if (arg1 + arg7 - 1 < local132) {
							local199 = local132 + 1 - arg7 - arg1;
						}
						@Pc(237) int local237 = local167 * local167 + local199 * local199;
						if (local237 < local116 || local116 == local237 && local118 > Static96.anIntArrayArray16[local139][local143]) {
							local106 = local125;
							local116 = local237;
							local118 = Static96.anIntArrayArray16[local139][local143];
							local108 = local132;
						}
					}
				}
			}
			if (~local116 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg10 == local106 && local108 == arg9) {
			return 0;
		}
		@Pc(307) byte local307 = 0;
		Static456.anIntArray409[0] = local106;
		local116 = local307 + 1;
		Static312.anIntArray288[0] = local108;
		@Pc(328) int local328;
		local118 = local328 = Static296.anIntArrayArray19[local106 - local100][local108 - local104];
		while (arg10 != local106 || arg9 != local108) {
			if (local328 != local118) {
				Static456.anIntArray409[local116] = local106;
				local328 = local118;
				Static312.anIntArray288[local116++] = local108;
			}
			if ((local118 & 0x2) != 0) {
				local106++;
			} else if ((local118 & 0x8) != 0) {
				local106--;
			}
			if ((local118 & 0x1) != 0) {
				local108++;
			} else if ((local118 & 0x4) != 0) {
				local108--;
			}
			local118 = Static296.anIntArrayArray19[local106 - local100][local108 - local104];
		}
		local125 = 0;
		while (local116-- > 0) {
			arg5[local125] = Static456.anIntArray409[local116];
			arg0[local125++] = Static312.anIntArray288[local116];
			if (arg5.length <= local125) {
				break;
			}
		}
		return local125;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method9378(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(II[B)[B")
	public static byte[] method9379(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[arg0];
		Static679.method4129(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(II)I")
	public static int method9380(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}
}
