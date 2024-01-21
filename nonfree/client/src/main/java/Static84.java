import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!jc", name = "U", descriptor = "[Lclient!fa;")
	public static Class2_Sub1_Sub7_Sub2[] aClass2_Sub1_Sub7_Sub2Array7;

	@OriginalMember(owner = "client!jc", name = "gb", descriptor = "Lclient!pe;")
	public static Class13 aClass13_15;

	@OriginalMember(owner = "client!jc", name = "S", descriptor = "Z")
	public static boolean aBoolean99 = false;

	@OriginalMember(owner = "client!jc", name = "Z", descriptor = "Lclient!vc;")
	public static final Class89 aClass89_27 = new Class89(500);

	@OriginalMember(owner = "client!jc", name = "bb", descriptor = "[I")
	public static final int[] anIntArray277 = new int[1000];

	@OriginalMember(owner = "client!jc", name = "db", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_677 = Static158.method3034(" loggt sich ein)3");

	@OriginalMember(owner = "client!jc", name = "fb", descriptor = "I")
	public static int anInt2511 = 1;

	@OriginalMember(owner = "client!jc", name = "ib", descriptor = "I")
	public static int anInt2513 = 0;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "(I)V")
	public static void method1984() {
		Static70.aFont1 = null;
		Static47.aFontMetrics2 = null;
		Static129.anImage4 = null;
	}

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "(I)Z")
	public static boolean method1985() {
		return Static179.anInt4363 == 0 ? Static78.aClass2_Sub7_Sub1_1.method1522() : true;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)Z")
	public static boolean method1986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static15.method397(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static100.anIntArrayArrayArray5[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static18.anInt4397) {
					if (!Static188.method3446(local10, local24, local14)) {
						return false;
					}
					if (!Static188.method3446(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static188.method3446(local10, local28, local14)) {
						return false;
					}
					if (!Static188.method3446(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static188.method3446(local10, local32, local14)) {
					return false;
				}
				if (!Static188.method3446(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static36.anInt1081) {
					if (!Static188.method3446(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static188.method3446(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static188.method3446(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static188.method3446(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static188.method3446(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static188.method3446(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static18.anInt4397) {
					if (!Static188.method3446(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static188.method3446(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static188.method3446(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static188.method3446(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static188.method3446(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static188.method3446(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static36.anInt1081) {
					if (!Static188.method3446(local10, local24, local14)) {
						return false;
					}
					if (!Static188.method3446(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static188.method3446(local10, local28, local14)) {
						return false;
					}
					if (!Static188.method3446(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static188.method3446(local10, local32, local14)) {
					return false;
				}
				if (!Static188.method3446(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static188.method3446(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static188.method3446(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static188.method3446(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static188.method3446(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static188.method3446(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "(I)V")
	public static void method1987() {
		if (!Static103.aBoolean115) {
			Static22.aClass60Array5[0] = Static43.aClass60_311;
			Static196.aClass60Array26[0] = Static101.aClass60_807;
			Static169.anInt4148 = 1;
			Static140.aShortArray53[0] = 1006;
		}
		if (Static18.anInt4401 != -1) {
			Static70.method1640(Static18.anInt4401);
		}
		for (@Pc(29) int local29 = 0; local29 < Static42.anInt1305; local29++) {
			if (Static127.aBooleanArray14[local29]) {
				Static196.aBooleanArray19[local29] = true;
			}
			Static174.aBooleanArray16[local29] = Static127.aBooleanArray14[local29];
			Static127.aBooleanArray14[local29] = false;
		}
		Static127.anInt3488 = -1;
		Static8.anInt286 = Static20.anInt580;
		Static75.aClass72_6 = null;
		Static158.anInt4008 = -1;
		if (Static18.anInt4401 != -1) {
			Static42.anInt1305 = 0;
			Static16.method401(0, -1, 0, 765, Static18.anInt4401, 503, 0, 0);
		}
		Static133.method2126();
		Static52.method1232();
		if (Static103.aBoolean115) {
			Static48.method1095();
		} else if (Static127.anInt3488 != -1) {
			Static119.method2566(Static158.anInt4008, Static127.anInt3488);
		}
		if (Static159.anInt4432 == 3) {
			for (@Pc(103) int local103 = 0; local103 < Static42.anInt1305; local103++) {
				if (Static174.aBooleanArray16[local103]) {
					Static133.method2123(Static38.anIntArray101[local103], Static16.anIntArray42[local103], Static99.anIntArray329[local103], Static98.anIntArray326[local103], 16711935, 128);
				} else if (Static196.aBooleanArray19[local103]) {
					Static133.method2123(Static38.anIntArray101[local103], Static16.anIntArray42[local103], Static99.anIntArray329[local103], Static98.anIntArray326[local103], 16711680, 128);
				}
			}
		}
		Static19.method2425(Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3273, Static62.anInt1923, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3302, Static35.anInt3071);
		Static35.anInt3071 = 0;
	}
}
