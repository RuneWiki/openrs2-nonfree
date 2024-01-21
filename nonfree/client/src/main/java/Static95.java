import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!qe", name = "I", descriptor = "[S")
	public static short[] aShortArray19;

	@OriginalMember(owner = "client!qe", name = "M", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!qe", name = "Q", descriptor = "Lclient!qb;")
	public static Class2_Sub1_Sub2_Sub4 aClass2_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
	public static int anInt2422;

	@OriginalMember(owner = "client!qe", name = "V", descriptor = "Lclient!oe;")
	public static Class2_Sub1_Sub2_Sub3_Sub1 aClass2_Sub1_Sub2_Sub3_Sub1_4;

	@OriginalMember(owner = "client!qe", name = "H", descriptor = "Lclient!je;")
	private static Class40 aClass40_1257 = Static69.method1231("glow2:");

	@OriginalMember(owner = "client!qe", name = "F", descriptor = "Lclient!je;")
	public static Class40 aClass40_1256 = aClass40_1257;

	@OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
	public static int anInt2421 = 0;

	@OriginalMember(owner = "client!qe", name = "W", descriptor = "Lclient!je;")
	public static Class40 aClass40_1258 = Static69.method1231("");

	@OriginalMember(owner = "client!qe", name = "Y", descriptor = "[I")
	public static int[] anIntArray263 = new int[5];

	@OriginalMember(owner = "client!qe", name = "Z", descriptor = "[I")
	public static int[] anIntArray264 = new int[5];

	@OriginalMember(owner = "client!qe", name = "cb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1259 = aClass40_1257;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!lc;B)V")
	public static void method1752(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static60.aBoolean124) {
			Static36.method669(arg0);
			return;
		}
		if (Static68.anInt1856 == 1 && Static41.anInt1096 >= 715 && Static103.anInt2511 >= 453) {
			Static111.aBoolean214 = !Static111.aBoolean214;
			if (Static111.aBoolean214) {
				Static52.method939();
			} else {
				Static133.method2216(Static21.aClass40_361, Static87.aClass40_667, Static61.aClass24_Sub1_8);
			}
		}
		if (Static105.anInt2533 == 5) {
			return;
		}
		Static102.anInt2482++;
		if (Static105.anInt2533 != 10) {
			return;
		}
		if (Static2.anInt102 != 2 && Static17.anInt432 == 0) {
			if (Static68.anInt1856 == 1 && Static41.anInt1096 >= 5 && Static41.anInt1096 <= 105 && Static103.anInt2511 >= 463 && Static103.anInt2511 <= 498) {
				Static96.method1766();
				return;
			}
			if (Static69.aClass18_2 != null) {
				Static96.method1766();
			}
		}
		@Pc(115) int local115 = Static68.anInt1856;
		@Pc(117) int local117 = Static41.anInt1096;
		@Pc(119) int local119 = Static103.anInt2511;
		if (Static118.anInt2778 == 0) {
			if (local115 == 1 && local117 >= 227 && local117 <= 377 && local119 >= 271 && local119 <= 311) {
				Static118.anInt2778 = 3;
				Static112.anInt2615 = 0;
			}
			if (local115 == 1 && local117 >= 387 && local117 <= 537 && local119 >= 271 && local119 <= 311) {
				Static112.anInt2615 = 0;
				Static118.anInt2778 = 2;
				Static87.aClass40_660 = Static7.aClass40_132;
				Static87.aClass40_668 = Static7.aClass40_167;
				Static87.aClass40_662 = Static45.aClass40_599;
				return;
			}
			return;
		}
		if (Static118.anInt2778 == 2) {
			@Pc(221) short local221 = 231;
			@Pc(222) int local222 = local221 + 30;
			if (local115 == 1 && local119 >= 246 && local119 < 261) {
				Static112.anInt2615 = 0;
			}
			local222 += 15;
			if (local115 == 1 && local119 >= 261 && local119 < 276) {
				Static112.anInt2615 = 1;
			}
			local222 += 15;
			if (local115 == 1 && local117 >= 227 && local117 <= 377 && local119 >= 301 && local119 <= 341) {
				Static87.aClass40_661 = Static87.aClass40_661.method989().method965();
				if (Static87.aClass40_661.method950() == 0) {
					Static56.method1005(Static112.aClass40_1416, Static7.aClass40_145, Static7.aClass40_144);
					return;
				}
				if (Static87.aClass40_664.method950() == 0) {
					Static56.method1005(Static68.aClass40_909, Static7.aClass40_134, Static7.aClass40_158);
					return;
				}
				Static56.method1005(Static123.aClass40_1557, Static7.aClass40_169, Static7.aClass40_142);
				Static21.method402(20);
				return;
			}
			if (local115 == 1 && local117 >= 387 && local117 <= 537 && local119 >= 301 && local119 <= 341) {
				Static87.aClass40_664 = Static87.aClass40_667;
				Static87.aClass40_661 = Static87.aClass40_667;
				Static118.anInt2778 = 0;
			}
			while (true) {
				while (Static104.method1822()) {
					@Pc(377) boolean local377 = false;
					for (@Pc(379) int local379 = 0; Static28.aClass40_403.method950() > local379; local379++) {
						if (Static48.anInt1299 == Static28.aClass40_403.method982(local379)) {
							local377 = true;
							break;
						}
					}
					if (Static112.anInt2615 == 0) {
						if (Static59.anInt1587 == 85 && Static87.aClass40_661.method950() > 0) {
							Static87.aClass40_661 = Static87.aClass40_661.method953(0, Static87.aClass40_661.method950() - 1);
						}
						if (Static59.anInt1587 == 84 || Static59.anInt1587 == 80) {
							Static112.anInt2615 = 1;
						}
						if (local377 && Static87.aClass40_661.method950() < 12) {
							Static87.aClass40_661 = Static87.aClass40_661.method983(Static48.anInt1299);
						}
					} else if (Static112.anInt2615 == 1) {
						if (Static59.anInt1587 == 85 && Static87.aClass40_664.method950() > 0) {
							Static87.aClass40_664 = Static87.aClass40_664.method953(0, Static87.aClass40_664.method950() - 1);
						}
						if (Static59.anInt1587 == 84 || Static59.anInt1587 == 80) {
							Static112.anInt2615 = 0;
						}
						if (Static34.anInt804 == 2 && Static59.anInt1587 == 84) {
							Static87.aClass40_661 = Static87.aClass40_661.method989().method965();
							if (Static87.aClass40_661.method950() == 0) {
								Static56.method1005(Static112.aClass40_1416, Static7.aClass40_145, Static7.aClass40_144);
								return;
							}
							if (Static87.aClass40_664.method950() == 0) {
								Static56.method1005(Static68.aClass40_909, Static7.aClass40_134, Static7.aClass40_158);
								return;
							}
							Static56.method1005(Static123.aClass40_1557, Static7.aClass40_169, Static7.aClass40_142);
							Static21.method402(20);
							return;
						}
						if (local377 && Static87.aClass40_664.method950() < 20) {
							Static87.aClass40_664 = Static87.aClass40_664.method983(Static48.anInt1299);
						}
					}
				}
				return;
			}
		}
		if (Static118.anInt2778 != 3 || local115 != 1 || local117 < 307 || local117 > 457 || local119 < 301 || local119 > 341) {
			return;
		}
		Static118.anInt2778 = 0;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V")
	public static void method1755() {
		aClass40_1258 = null;
		aShortArray19 = null;
		aByteArrayArray7 = null;
		anIntArray264 = null;
		aClass40_1257 = null;
		aClass2_Sub1_Sub2_Sub3_Sub1_4 = null;
		anIntArray263 = null;
		aClass40_1256 = null;
		aClass40_1259 = null;
		aClass2_Sub1_Sub2_Sub4_4 = null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLclient!fd;ILclient!fd;)V")
	public static void method1756(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(3) Class24 arg2) {
		Static94.aClass24_27 = arg2;
		Static69.aClass24_22 = arg1;
		Static37.aBoolean67 = arg0;
	}
}
