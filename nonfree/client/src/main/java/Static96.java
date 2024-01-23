import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!hj", name = "x", descriptor = "[[Lclient!qm;")
	public static Class147[][] aClass147ArrayArray1;

	@OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
	public static int anInt2115 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!hj", name = "M", descriptor = "[[I")
	public static int[][] anIntArrayArray21 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

	@OriginalMember(owner = "client!hj", name = "O", descriptor = "Z")
	public static boolean aBoolean166 = true;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)Lclient!hd;")
	public static Class65 method1832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub31 local7 = Static180.aClass2_Sub31ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass65_1 == null ? null : local7.aClass65_1;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)Z")
	public static boolean method1834() {
		try {
			if (Static131.anInt2692 == 2) {
				if (Static8.aClass2_Sub24_1 == null) {
					Static8.aClass2_Sub24_1 = Static309.method3882(Static101.aClass84_127, Static273.anInt5686, Static70.anInt1532);
					if (Static8.aClass2_Sub24_1 == null) {
						return false;
					}
				}
				if (Static236.aClass47_1 == null) {
					Static236.aClass47_1 = new Class47(Static285.aClass84_122, Static31.aClass84_14);
				}
				if (Static2.aClass2_Sub5_Sub3_4.method2756(Static212.aClass84_95, Static8.aClass2_Sub24_1, Static236.aClass47_1)) {
					Static2.aClass2_Sub5_Sub3_4.method2753();
					Static2.aClass2_Sub5_Sub3_4.method2761(Static51.anInt1198);
					Static2.aClass2_Sub5_Sub3_4.method2744(Static8.aClass2_Sub24_1, Static25.aBoolean467);
					Static101.aClass84_127 = null;
					Static236.aClass47_1 = null;
					Static131.anInt2692 = 0;
					Static8.aClass2_Sub24_1 = null;
					return true;
				}
			}
		} catch (@Pc(79) Exception local79) {
			local79.printStackTrace();
			Static2.aClass2_Sub5_Sub3_4.method2758();
			Static236.aClass47_1 = null;
			Static131.anInt2692 = 0;
			Static101.aClass84_127 = null;
			Static8.aClass2_Sub24_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)V")
	public static void method1835() {
		try {
			@Pc(12) Method local12 = Runtime.class.getMethod("maxMemory");
			if (local12 != null) {
				try {
					@Pc(17) Runtime local17 = Runtime.getRuntime();
					@Pc(24) Long local24 = (Long) local12.invoke(local17, (Object[]) null);
					Static171.anInt3655 = (int) (local24 / 1048576L) + 1;
				} catch (@Pc(34) Throwable local34) {
				}
			}
		} catch (@Pc(36) Exception local36) {
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(Lclient!wm;B)V")
	public static void method1837(@OriginalArg(0) Class2_Sub26 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static184.anInt3909; local7++) {
			@Pc(18) int local18 = arg0.method4217();
			@Pc(22) int local22 = arg0.method4242();
			if (local22 == 65535) {
				local22 = -1;
			}
			if (Static234.aClass132_Sub1Array1[local18] != null) {
				Static234.aClass132_Sub1Array1[local18].anInt4117 = local22;
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZIILclient!wm;ZBIIIII)V")
	public static void method1838(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub26 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(43) int local43;
		if (arg0 < 0 || arg0 >= 104 || arg8 < 0 || arg8 >= 104) {
			while (true) {
				local43 = arg4.method4261();
				if (local43 == 0) {
					break;
				}
				if (local43 == 1) {
					arg4.method4261();
					break;
				}
				if (local43 <= 49) {
					arg4.method4261();
				}
			}
			return;
		}
		if (!arg1 && !arg5) {
			Static134.aByteArrayArrayArray9[arg6][arg0][arg8] = 0;
		}
		while (true) {
			local43 = arg4.method4261();
			if (local43 == 0) {
				if (arg1) {
					Static141.anIntArrayArrayArray4[0][arg0 + arg3][arg8 + arg9] = Static274.anIntArrayArrayArray14[0][arg0 + arg3][arg9 + arg8];
				} else if (arg6 == 0) {
					Static141.anIntArrayArrayArray4[0][arg3 + arg0][arg8 + arg9] = -Static12.method279(arg10 + 556238, arg7 + 932731) * 8;
				} else {
					Static141.anIntArrayArrayArray4[arg6][arg0 + arg3][arg9 + arg8] = Static141.anIntArrayArrayArray4[arg6 - 1][arg3 + arg0][arg8 + arg9] - 240;
				}
				break;
			}
			if (local43 == 1) {
				@Pc(140) int local140 = arg4.method4261();
				if (arg1) {
					Static141.anIntArrayArrayArray4[0][arg3 + arg0][arg9 + arg8] = Static274.anIntArrayArrayArray14[0][arg0 + arg3][arg8 + arg9] + local140 * 8;
				} else {
					if (local140 == 1) {
						local140 = 0;
					}
					if (arg6 == 0) {
						Static141.anIntArrayArrayArray4[0][arg3 + arg0][arg9 + arg8] = -local140 * 8;
					} else {
						Static141.anIntArrayArrayArray4[arg6][arg0 + arg3][arg8 + arg9] = Static141.anIntArrayArrayArray4[arg6 - 1][arg0 + arg3][arg9 + arg8] - local140 * 8;
					}
				}
				break;
			}
			if (local43 <= 49) {
				if (arg5) {
					arg4.method4261();
				} else {
					Static297.aByteArrayArrayArray17[arg6][arg0][arg8] = arg4.method4220();
					Static108.aByteArrayArrayArray7[arg6][arg0][arg8] = (byte) ((local43 - 2) / 4);
					Static25.aByteArrayArrayArray14[arg6][arg0][arg8] = (byte) (local43 + arg2 - 2 & 0x3);
				}
			} else if (local43 <= 81) {
				if (!arg1 && !arg5) {
					Static134.aByteArrayArrayArray9[arg6][arg0][arg8] = (byte) (local43 - 49);
				}
			} else if (!arg5) {
				Static57.aByteArrayArrayArray5[arg6][arg0][arg8] = (byte) (local43 - 81);
			}
		}
	}
}
