import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
	public static int anInt1944;

	@OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
	public static int anInt1946;

	@OriginalMember(owner = "client!hc", name = "W", descriptor = "I")
	public static int anInt1951;

	@OriginalMember(owner = "client!hc", name = "ab", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!hc", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString76 = "Unable to find ";

	@OriginalMember(owner = "client!hc", name = "T", descriptor = "[I")
	public static int[] anIntArray166 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!hc", name = "U", descriptor = "I")
	public static int anInt1950 = 0;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIZII)V")
	public static void method1628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7;
		@Pc(14) int local14;
		for (local7 = arg1; local7 <= arg2 + arg1; local7++) {
			for (local14 = arg3; local14 <= arg0 + arg3; local14++) {
				if (local14 >= 0 && local14 < 104 && local7 >= 0 && local7 < 104) {
					Static22.aByteArrayArrayArray1[arg4][local14][local7] = 127;
				}
			}
		}
		for (local7 = arg1; local7 < arg2 + arg1; local7++) {
			for (local14 = arg3; local14 < arg0 + arg3; local14++) {
				if (local14 >= 0 && local14 < 104 && local7 >= 0 && local7 < 104) {
					Static154.anIntArrayArrayArray5[arg4][local14][local7] = arg4 > 0 ? Static154.anIntArrayArrayArray5[arg4 - 1][local14][local7] : 0;
				}
			}
		}
		if (arg3 > 0 && arg3 < 104) {
			for (local7 = arg1 + 1; local7 < arg2 + arg1; local7++) {
				if (local7 >= 0 && local7 < 104) {
					Static154.anIntArrayArrayArray5[arg4][arg3][local7] = Static154.anIntArrayArrayArray5[arg4][arg3 - 1][local7];
				}
			}
		}
		if (arg1 > 0 && arg1 < 104) {
			for (local7 = arg3 + 1; local7 < arg3 + arg0; local7++) {
				if (local7 >= 0 && local7 < 104) {
					Static154.anIntArrayArrayArray5[arg4][local7][arg1] = Static154.anIntArrayArrayArray5[arg4][local7][arg1 - 1];
				}
			}
		}
		if (arg3 < 0 || arg1 < 0 || arg3 >= 104 || arg1 >= 104) {
			return;
		}
		if (arg4 == 0) {
			if (arg3 > 0 && Static154.anIntArrayArrayArray5[arg4][arg3 - 1][arg1] != 0) {
				Static154.anIntArrayArrayArray5[arg4][arg3][arg1] = Static154.anIntArrayArrayArray5[arg4][arg3 - 1][arg1];
			} else if (arg1 > 0 && Static154.anIntArrayArrayArray5[arg4][arg3][arg1 - 1] != 0) {
				Static154.anIntArrayArrayArray5[arg4][arg3][arg1] = Static154.anIntArrayArrayArray5[arg4][arg3][arg1 - 1];
			} else if (arg3 > 0 && arg1 > 0 && Static154.anIntArrayArrayArray5[arg4][arg3 - 1][arg1 - 1] != 0) {
				Static154.anIntArrayArrayArray5[arg4][arg3][arg1] = Static154.anIntArrayArrayArray5[arg4][arg3 - 1][arg1 - 1];
			}
		} else if (arg3 > 0 && Static154.anIntArrayArrayArray5[arg4][arg3 - 1][arg1] != Static154.anIntArrayArrayArray5[arg4 - 1][arg3 - 1][arg1]) {
			Static154.anIntArrayArrayArray5[arg4][arg3][arg1] = Static154.anIntArrayArrayArray5[arg4][arg3 - 1][arg1];
		} else if (arg1 > 0 && Static154.anIntArrayArrayArray5[arg4][arg3][arg1 - 1] != Static154.anIntArrayArrayArray5[arg4 - 1][arg3][arg1 - 1]) {
			Static154.anIntArrayArrayArray5[arg4][arg3][arg1] = Static154.anIntArrayArrayArray5[arg4][arg3][arg1 - 1];
		} else if (arg3 > 0 && arg1 > 0 && Static154.anIntArrayArrayArray5[arg4 - 1][arg3 - 1][arg1 - 1] != Static154.anIntArrayArrayArray5[arg4][arg3 - 1][arg1 - 1]) {
			Static154.anIntArrayArrayArray5[arg4][arg3][arg1] = Static154.anIntArrayArrayArray5[arg4][arg3 - 1][arg1 - 1];
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!lg;I)Ljava/lang/String;")
	public static String method1629(@OriginalArg(0) Class97 arg0) {
		if (Static41.method791(arg0).method2577() == 0) {
			return null;
		} else if (arg0.aString107 == null || arg0.aString107.trim().length() == 0) {
			return Static14.aBoolean26 ? "Hidden-use" : null;
		} else {
			return arg0.aString107;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public static void method1631() {
		Static118.aFontMetrics1 = null;
		Static91.anImage2 = null;
		Static219.aFont1 = null;
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(Z)Lclient!ql;")
	public static Class64_Sub1 method1632() {
		return Static143.anInt2833 >= Static214.aClass64_Sub1Array3.length ? null : Static214.aClass64_Sub1Array3[Static143.anInt2833++];
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIB)V")
	public static void method1633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static219.anInt4212 < 100) {
			Static279.method4344();
		}
		if (Static251.aBoolean330) {
			Static87.method1457(arg2, arg3, arg1 + arg2, arg0 + arg3);
		} else {
			Static258.method4029(arg2, arg3, arg1 + arg2, arg0 + arg3);
		}
		@Pc(48) int local48;
		@Pc(58) int local58;
		if (Static219.anInt4212 < 100) {
			local48 = arg1 / 2 + arg2;
			local58 = arg0 / 2 + arg3 - 18 - 20;
			if (Static251.aBoolean330) {
				Static87.method1464(arg2, arg3, arg1, arg0, 0);
				Static87.method1452(local48 - 152, local58, 304, 34, 9179409);
				Static87.method1452(local48 - 151, local58 + 1, 302, 32, 0);
				Static87.method1464(local48 - 150, local58 + 2, Static219.anInt4212 * 3, 30, 9179409);
				Static87.method1464(Static219.anInt4212 * 3 + local48 - 150, local58 + 2, 300 - Static219.anInt4212 * 3, 30, 0);
			} else {
				Static258.method4031(arg2, arg3, arg1, arg0, 0);
				Static258.method4025(local48 - 152, local58, 304, 34, 9179409);
				Static258.method4025(local48 - 151, local58 + 1, 302, 32, 0);
				Static258.method4031(local48 - 150, local58 + 2, Static219.anInt4212 * 3, 30, 9179409);
				Static258.method4031(local48 + Static219.anInt4212 * 3 - 150, local58 + 2, 300 - Static219.anInt4212 * 3, 30, 0);
			}
			Static86.aClass4_Sub2_Sub9_3.method4101(Static11.aString11, local48, local58 + 20, 16777215, -1);
			return;
		}
		Static8.anInt158 = Static208.anInt4072 - (int) ((float) arg1 / Static64.aFloat35);
		Static217.anInt4191 = (int) ((float) (arg0 * 2) / Static64.aFloat35);
		Static298.anInt5312 = (int) ((float) (arg1 * 2) / Static64.aFloat35);
		Static143.anInt2837 = Static104.anInt2092 - (int) ((float) arg0 / Static64.aFloat35);
		local58 = Static208.anInt4072 + (int) ((float) arg1 / Static64.aFloat35);
		@Pc(239) int local239 = Static208.anInt4072 - (int) ((float) arg1 / Static64.aFloat35);
		local48 = Static104.anInt2092 - (int) ((float) arg0 / Static64.aFloat35);
		@Pc(256) int local256 = Static104.anInt2092 + (int) ((float) arg0 / Static64.aFloat35);
		if (Static251.aBoolean330) {
			if (Static233.aClass4_Sub2_Sub4_Sub2_8 == null || Static233.aClass4_Sub2_Sub4_Sub2_8.anInt5193 != arg1 || arg0 != Static233.aClass4_Sub2_Sub4_Sub2_8.anInt5191) {
				Static233.aClass4_Sub2_Sub4_Sub2_8 = null;
				Static233.aClass4_Sub2_Sub4_Sub2_8 = new Class4_Sub2_Sub4_Sub2(arg1, arg0);
			}
			Static258.method4016(Static233.aClass4_Sub2_Sub4_Sub2_8.anIntArray409, arg1, arg0);
			Static184.method2973(local256, 0, local58, local239, local48, arg0, 0, arg1);
			Static213.method3349(arg1, local256, Static84.aBoolean101, arg0, 0, local58, 0, local48, local239);
			Static157.method257(0, local58, arg0, local48, arg1, local256, 0, local239);
			Static233.aClass4_Sub2_Sub4_Sub2_8.method4150();
			Static87.method1454(Static233.aClass4_Sub2_Sub4_Sub2_8.anIntArray409, arg2, arg3, arg1, arg0);
			Static258.anIntArray399 = null;
		} else {
			Static184.method2973(local256, arg3, local58, local239, local48, arg3 + arg0, arg2, arg2 + arg1);
			Static213.method3349(arg2 + arg1, local256, Static84.aBoolean101, arg0 + arg3, arg3, local58, arg2, local48, local239);
			Static157.method257(arg2, local58, arg0 + arg3, local48, arg1 + arg2, local256, arg3, local239);
		}
		if (Static64.anInt1391 > 0) {
			Static115.anInt2343--;
			if (Static115.anInt2343 == 0) {
				Static115.anInt2343 = 20;
				Static64.anInt1391--;
			}
		}
		if (!Static262.aBoolean344) {
			return;
		}
		@Pc(405) int local405 = arg1 + arg2 - 5;
		@Pc(412) int local412 = arg3 + arg0 - 8;
		Static156.aClass4_Sub2_Sub9_4.method4104("Fps:" + Static278.anInt5386, local405, local412, 16776960, -1);
		@Pc(428) Runtime local428 = Runtime.getRuntime();
		@Pc(429) int local429 = local412 - 15;
		@Pc(431) int local431 = 16776960;
		@Pc(440) int local440 = (int) ((local428.totalMemory() - local428.freeMemory()) / 1024L);
		if (local440 > 65536) {
			local431 = 16711680;
		}
		Static156.aClass4_Sub2_Sub9_4.method4104("Mem:" + local440 + "k", local405, local429, local431, -1);
		local412 = local429 - 15;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIII)V")
	public static void method1634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static173.anInt3481 <= arg0 && Static121.anInt2460 >= arg1 && Static293.anInt5688 <= arg2 && arg4 <= Static100.anInt1982) {
			Static282.method4405(arg0, arg2, arg1, arg4, arg3);
		} else {
			Static272.method4320(arg2, arg0, arg3, arg4, arg1);
		}
	}
}
