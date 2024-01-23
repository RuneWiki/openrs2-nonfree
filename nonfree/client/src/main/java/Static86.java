import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!hj", name = "x", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!hj", name = "n", descriptor = "Lclient!hh;")
	public static Class50 aClass50_559 = Static186.method3527(" weitere Optionen");

	@OriginalMember(owner = "client!hj", name = "r", descriptor = "[[S")
	public static short[][] aShortArrayArray5 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!hj", name = "t", descriptor = "[I")
	public static int[] anIntArray141 = new int[4096];

	@OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
	public static int anInt1771 = 0;

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(B)V")
	public static void method1287() {
		@Pc(5) int local5 = Static230.anInt3197 * 128 + 64;
		@Pc(20) int local20 = Static63.anInt1256 * 128 + 64;
		@Pc(30) int local30 = Static131.method2213(local5, local20, Static212.anInt4195) - Static140.anInt2856;
		if (Static190.anInt3916 >= 100) {
			Static159.anInt4227 = Static63.anInt1256 * 128 + 64;
			Static137.anInt2804 = Static230.anInt3197 * 128 + 64;
			Static32.anInt601 = Static131.method2213(Static137.anInt2804, Static159.anInt4227, Static212.anInt4195) - Static140.anInt2856;
		} else {
			if (Static137.anInt2804 < local5) {
				Static137.anInt2804 += Static190.anInt3916 * (local5 - Static137.anInt2804) / 1000 + Static220.anInt4292;
				if (Static137.anInt2804 > local5) {
					Static137.anInt2804 = local5;
				}
			}
			if (local20 > Static159.anInt4227) {
				Static159.anInt4227 += Static220.anInt4292 + (local20 - Static159.anInt4227) * Static190.anInt3916 / 1000;
				if (local20 < Static159.anInt4227) {
					Static159.anInt4227 = local20;
				}
			}
			if (Static32.anInt601 < local30) {
				Static32.anInt601 += Static190.anInt3916 * (local30 - Static32.anInt601) / 1000 + Static220.anInt4292;
				if (local30 < Static32.anInt601) {
					Static32.anInt601 = local30;
				}
			}
			if (local30 < Static32.anInt601) {
				Static32.anInt601 -= Static220.anInt4292 + Static190.anInt3916 * (Static32.anInt601 - local30) / 1000;
				if (Static32.anInt601 < local30) {
					Static32.anInt601 = local30;
				}
			}
			if (Static137.anInt2804 > local5) {
				Static137.anInt2804 -= Static190.anInt3916 * (Static137.anInt2804 - local5) / 1000 + Static220.anInt4292;
				if (local5 > Static137.anInt2804) {
					Static137.anInt2804 = local5;
				}
			}
			if (local20 < Static159.anInt4227) {
				Static159.anInt4227 -= Static190.anInt3916 * (Static159.anInt4227 - local20) / 1000 + Static220.anInt4292;
				if (Static159.anInt4227 < local20) {
					Static159.anInt4227 = local20;
				}
			}
		}
		local5 = Static43.anInt925 * 128 + 64;
		local20 = Static220.anInt4302 * 128 + 64;
		local30 = Static131.method2213(local5, local20, Static212.anInt4195) - Static64.anInt1282;
		@Pc(240) int local240 = local20 - Static159.anInt4227;
		@Pc(244) int local244 = local5 - Static137.anInt2804;
		@Pc(249) int local249 = local30 - Static32.anInt601;
		@Pc(260) int local260 = (int) Math.sqrt((double) (local244 * local244 + local240 * local240));
		@Pc(271) int local271 = (int) (Math.atan2((double) local249, (double) local260) * 325.949D) & 0x7FF;
		@Pc(282) int local282 = (int) (Math.atan2((double) local240, (double) local244) * -325.949D) & 0x7FF;
		@Pc(287) int local287 = local282 - Static166.anInt3404;
		if (local287 > 1024) {
			local287 -= 2048;
		}
		if (local287 < -1024) {
			local287 += 2048;
		}
		if (local271 < 128) {
			local271 = 128;
		}
		if (local287 > 0) {
			Static166.anInt3404 += Static63.anInt1263 + Static149.anInt3109 * local287 / 1000;
			Static166.anInt3404 &= 0x7FF;
		}
		if (local271 > 383) {
			local271 = 383;
		}
		if (local287 < 0) {
			Static166.anInt3404 -= Static63.anInt1263 + -local287 * Static149.anInt3109 / 1000;
			Static166.anInt3404 &= 0x7FF;
		}
		@Pc(344) int local344 = local282 - Static166.anInt3404;
		if (local344 > 1024) {
			local344 -= 2048;
		}
		if (local344 < -1024) {
			local344 += 2048;
		}
		if (local271 > Static218.anInt3563) {
			Static218.anInt3563 += Static63.anInt1263 + (local271 - Static218.anInt3563) * Static149.anInt3109 / 1000;
			if (local271 < Static218.anInt3563) {
				Static218.anInt3563 = local271;
			}
		}
		if (local271 < Static218.anInt3563) {
			Static218.anInt3563 -= Static149.anInt3109 * (Static218.anInt3563 - local271) / 1000 + Static63.anInt1263;
			if (Static218.anInt3563 < local271) {
				Static218.anInt3563 = local271;
			}
		}
		if (local344 < 0 && local287 > 0 || local344 > 0 && local287 < 0) {
			Static166.anInt3404 = local282;
		}
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
	public static void method1288() {
		if (Static220.anInt4304 == 30) {
			Static229.method3481(25);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIB)Z")
	public static boolean method1289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)Z")
	public static boolean method1291(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIII)V")
	public static void method1292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static177.anInt3717 = Static12.anInt239 * arg0 / arg2;
		Static44.anInt939 = -1;
		Static95.anInt1938 = -1;
		Static4.anInt87 = arg1 * Static164.anInt3383 / arg3;
		Static107.method1639();
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(B)V")
	public static void method1293() {
		Static64.aClass84_20.method2585();
	}

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "(B)V")
	public static void method1294() {
		if (Static58.aClass48_1 != null) {
			Static58.aClass48_1.method3216();
		}
		if (Static132.aClass48_2 != null) {
			Static132.aClass48_2.method3216();
		}
		Static220.method3389(Static151.aBoolean134);
		Static58.aClass48_1 = Static140.method2328(0, Static193.aCanvas4, Static4.aClass87_1, 22050);
		Static58.aClass48_1.method3227(Static172.aClass1_Sub12_Sub3_4);
		Static132.aClass48_2 = Static140.method2328(1, Static193.aCanvas4, Static4.aClass87_1, 2048);
		Static132.aClass48_2.method3227(Static226.aClass1_Sub12_Sub1_2);
	}
}
