import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
	public static int anInt1796;

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
	public static int anInt1806;

	@OriginalMember(owner = "client!ii", name = "D", descriptor = "[I")
	public static int[] anIntArray94;

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_922 = Static193.method3027(")1j");

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_923 = Static193.method3027("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!ii", name = "x", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_925 = Static193.method3027("Click to switch");

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "Lclient!oc;")
	public static Class70 aClass70_924 = aClass70_925;

	@OriginalMember(owner = "client!ii", name = "B", descriptor = "Z")
	public static boolean aBoolean97 = true;

	@OriginalMember(owner = "client!ii", name = "C", descriptor = "Lclient!ri;")
	public static final Class85 aClass85_17 = new Class85(64);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)I")
	public static int method1315(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(35) int local35 = local22 | local22 >>> 8;
		@Pc(41) int local41 = local35 | local35 >>> 16;
		return local41 + 1;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V")
	public static void method1316() {
		Static9.method237(Static154.aClass6_83);
		Static23.anInt464++;
		if (Static86.aBoolean94 && Static47.aBoolean55) {
			@Pc(26) int local26 = Static8.anInt187;
			local26 -= Static208.anInt2643;
			if (local26 < Static109.anInt2187) {
				local26 = Static109.anInt2187;
			}
			if (Static154.aClass6_83.anInt244 + local26 > Static109.anInt2187 + Static87.aClass6_119.anInt244) {
				local26 = Static87.aClass6_119.anInt244 + Static109.anInt2187 - Static154.aClass6_83.anInt244;
			}
			@Pc(71) int local71 = local26 - Static82.anInt1628;
			@Pc(79) int local79 = local26 + Static87.aClass6_119.anInt271 - Static109.anInt2187;
			@Pc(82) int local82 = Static154.aClass6_83.anInt218;
			@Pc(84) int local84 = Static167.anInt3403;
			local84 -= Static108.anInt2196;
			if (local84 < Static79.anInt1587) {
				local84 = Static79.anInt1587;
			}
			if (local84 + Static154.aClass6_83.anInt217 > Static79.anInt1587 - -Static87.aClass6_119.anInt217) {
				local84 = Static79.anInt1587 + Static87.aClass6_119.anInt217 - Static154.aClass6_83.anInt217;
			}
			@Pc(124) int local124 = local84 + Static87.aClass6_119.anInt270 - Static79.anInt1587;
			@Pc(129) int local129 = local84 - Static123.anInt2476;
			if (Static23.anInt464 > Static154.aClass6_83.anInt228 && (local71 > local82 || -local82 > local71 || local82 < local129 || -local82 > local129)) {
				Static97.aBoolean104 = true;
			}
			@Pc(170) Class3_Sub26 local170;
			if (Static154.aClass6_83.anObjectArray12 != null && Static97.aBoolean104) {
				local170 = new Class3_Sub26();
				local170.aClass6_116 = Static154.aClass6_83;
				local170.anObjectArray29 = Static154.aClass6_83.anObjectArray12;
				local170.anInt4146 = local79;
				local170.anInt4144 = local124;
				Static185.method2901(local170);
			}
			if (Static202.anInt4135 == 0) {
				if (Static97.aBoolean104) {
					if (Static154.aClass6_83.anObjectArray25 != null) {
						local170 = new Class3_Sub26();
						local170.aClass6_115 = Static98.aClass6_55;
						local170.anInt4144 = local124;
						local170.anInt4146 = local79;
						local170.aClass6_116 = Static154.aClass6_83;
						local170.anObjectArray29 = Static154.aClass6_83.anObjectArray25;
						Static185.method2901(local170);
					}
					if (Static98.aClass6_55 != null && Static21.method345(Static154.aClass6_83) != null) {
						Static93.aClass3_Sub4_Sub1_18.method1298(48);
						Static93.aClass3_Sub4_Sub1_18.method1273(Static98.aClass6_55.anInt261);
						Static93.aClass3_Sub4_Sub1_18.method1289(Static154.aClass6_83.anInt261);
						Static93.aClass3_Sub4_Sub1_18.method1285(Static98.aClass6_55.anInt229);
						Static93.aClass3_Sub4_Sub1_18.method1293(Static154.aClass6_83.anInt229);
					}
				} else if ((Static75.anInt1476 == 1 || Static17.method308(Static35.anInt770 - 1)) && Static35.anInt770 > 2) {
					Static153.method2268();
				} else if (Static35.anInt770 > 0) {
					Static56.method887(Static35.anInt770 - 1);
				}
				Static154.aClass6_83 = null;
			}
		} else if (Static23.anInt464 > 1) {
			Static154.aClass6_83 = null;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!ig;I)V")
	public static void method1317(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static149.aBoolean142) {
			Static110.method1585(arg0);
			return;
		}
		if (Static15.anInt343 == 1 && Static124.anInt3874 >= 715 && Static96.anInt2006 >= 453) {
			Static153.aBoolean147 = !Static153.aBoolean147;
			if (Static153.aBoolean147) {
				Static111.method1606();
			} else {
				Static209.method3300(Static10.aClass52_Sub1_2, 255, Static167.anInt3405);
			}
		}
		if (Static15.anInt351 == 5) {
			return;
		}
		Static122.anInt2470++;
		if (Static15.anInt351 != 10) {
			return;
		}
		if (Static17.anInt361 != 2) {
			if (Static15.anInt343 == 1 && Static124.anInt3874 >= 5 && Static124.anInt3874 <= 105 && Static96.anInt2006 >= 463 && Static96.anInt2006 <= 498) {
				Static30.method551();
				return;
			}
			if (Static152.aClass49_1 != null) {
				Static30.method551();
			}
		}
		@Pc(115) int local115 = Static15.anInt343;
		@Pc(117) int local117 = Static124.anInt3874;
		@Pc(127) int local127 = Static96.anInt2006;
		if (Static186.anInt3812 == 0) {
			@Pc(514) boolean local514 = false;
			if (local115 == 1 && local117 >= 227 && local117 <= 377 && local127 >= 271 && local127 <= 311) {
				Static186.anInt3812 = 3;
				Static134.anInt2675 = 0;
			}
			if (Static8.anInt189 != 0) {
				while (Static138.method1981()) {
					if (Static175.anInt3547 == 84) {
						local514 = true;
						break;
					}
				}
			}
			if (local514 || local115 == 1 && local117 >= 387 && local117 <= 537 && local127 >= 271 && local127 <= 311) {
				Static198.aClass70_1991 = Static42.aClass70_431;
				Static198.aClass70_1987 = Static84.aClass70_851;
				Static134.anInt2675 = 0;
				Static186.anInt3812 = 2;
				Static198.aClass70_1995 = Static84.aClass70_835;
			}
			return;
		}
		if (Static186.anInt3812 == 2) {
			@Pc(139) short local139 = 231;
			@Pc(140) int local140 = local139 + 30;
			if (local115 == 1 && local127 >= 246 && local127 < 261) {
				Static134.anInt2675 = 0;
			}
			local140 += 15;
			if (local115 == 1 && local127 >= 261 && local127 < 276) {
				Static134.anInt2675 = 1;
			}
			local140 += 15;
			if (local115 == 1 && local117 >= 227 && local117 <= 377 && local127 >= 301 && local127 <= 341) {
				Static198.aClass70_1992 = Static198.aClass70_1992.method2028().method2033();
				if (Static198.aClass70_1992.method2045() == 0) {
					Static152.method2243(Static84.aClass70_830, Static77.aClass70_747, Static84.aClass70_833);
					return;
				}
				if (Static198.aClass70_1993.method2045() == 0) {
					Static152.method2243(Static84.aClass70_861, Static176.aClass70_1731, Static84.aClass70_867);
					return;
				}
				Static152.method2243(Static84.aClass70_845, Static51.aClass70_501, Static84.aClass70_842);
				Static29.method515(20);
				return;
			}
			if (local115 == 1 && local117 >= 387 && local117 <= 537 && local127 >= 301 && local127 <= 341) {
				Static198.aClass70_1993 = Static198.aClass70_1994;
				Static186.anInt3812 = 0;
				Static198.aClass70_1992 = Static198.aClass70_1994;
			}
			while (true) {
				while (Static138.method1981()) {
					@Pc(292) boolean local292 = false;
					for (@Pc(294) int local294 = 0; local294 < Static196.aClass70_1933.method2045(); local294++) {
						if (Static38.anInt824 == Static196.aClass70_1933.method2055(local294)) {
							local292 = true;
							break;
						}
					}
					if (Static134.anInt2675 == 0) {
						if (Static175.anInt3547 == 85 && Static198.aClass70_1992.method2045() > 0) {
							Static198.aClass70_1992 = Static198.aClass70_1992.method2023(Static198.aClass70_1992.method2045() - 1, 0);
						}
						if (Static175.anInt3547 == 84 || Static175.anInt3547 == 80) {
							Static134.anInt2675 = 1;
						}
						if (local292 && Static198.aClass70_1992.method2045() < 12) {
							Static198.aClass70_1992 = Static198.aClass70_1992.method2035(Static38.anInt824);
						}
					} else if (Static134.anInt2675 == 1) {
						if (Static175.anInt3547 == 85 && Static198.aClass70_1993.method2045() > 0) {
							Static198.aClass70_1993 = Static198.aClass70_1993.method2023(Static198.aClass70_1993.method2045() - 1, 0);
						}
						if (Static175.anInt3547 == 84 || Static175.anInt3547 == 80) {
							Static134.anInt2675 = 0;
						}
						if (Static8.anInt189 != 0 && Static175.anInt3547 == 84) {
							Static198.aClass70_1992 = Static198.aClass70_1992.method2028().method2033();
							if (Static198.aClass70_1992.method2045() == 0) {
								Static152.method2243(Static84.aClass70_830, Static77.aClass70_747, Static84.aClass70_833);
								return;
							}
							if (Static198.aClass70_1993.method2045() == 0) {
								Static152.method2243(Static84.aClass70_861, Static176.aClass70_1731, Static84.aClass70_867);
								return;
							}
							Static152.method2243(Static84.aClass70_845, Static51.aClass70_501, Static84.aClass70_842);
							Static29.method515(20);
							return;
						}
						if (local292 && Static198.aClass70_1993.method2045() < 20) {
							Static198.aClass70_1993 = Static198.aClass70_1993.method2035(Static38.anInt824);
						}
					}
				}
				return;
			}
		}
		if (Static186.anInt3812 == 3 && local115 == 1 && local117 >= 307 && local117 <= 457 && local127 >= 301 && local127 <= 341) {
			Static186.anInt3812 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IB)I")
	public static int method1318(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
