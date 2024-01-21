import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!la", name = "bb", descriptor = "Lclient!dd;")
	public static Class16 aClass16_11;

	@OriginalMember(owner = "client!la", name = "ab", descriptor = "Lclient!ea;")
	private static Class18 aClass18_624 = Static8.method128("Loaded sprites");

	@OriginalMember(owner = "client!la", name = "cb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_625 = Static8.method128("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!la", name = "kb", descriptor = "Lclient!ea;")
	private static Class18 aClass18_629 = Static8.method128("Create a free account");

	@OriginalMember(owner = "client!la", name = "eb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_626 = aClass18_629;

	@OriginalMember(owner = "client!la", name = "gb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_627 = aClass18_624;

	@OriginalMember(owner = "client!la", name = "hb", descriptor = "Lclient!ea;")
	private static Class18 aClass18_628 = Static8.method128("yellow:");

	@OriginalMember(owner = "client!la", name = "lb", descriptor = "I")
	public static int anInt2571 = 0;

	@OriginalMember(owner = "client!la", name = "mb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_630 = Static8.method128("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!la", name = "rb", descriptor = "[Lclient!hc;")
	public static Class1_Sub6[] aClass1_Sub6Array1 = new Class1_Sub6[2048];

	@OriginalMember(owner = "client!la", name = "ub", descriptor = "Lclient!ea;")
	public static Class18 aClass18_631 = aClass18_628;

	@OriginalMember(owner = "client!la", name = "xb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_632 = aClass18_628;

	@OriginalMember(owner = "client!la", name = "yb", descriptor = "I")
	public static int anInt2578 = 0;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
	public static void method1848() {
		for (@Pc(6) Class1_Sub8 local6 = (Class1_Sub8) Static155.aClass14_14.method563(); local6 != null; local6 = (Class1_Sub8) Static155.aClass14_14.method571()) {
			@Pc(11) int local11 = local6.anInt1188;
			if (Static48.method1038(local11)) {
				@Pc(17) boolean local17 = true;
				@Pc(21) Class20[] local21 = Static148.aClass20ArrayArray1[local11];
				for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
					if (local21[local23] != null) {
						local17 = local21[local23].aBoolean44;
						break;
					}
				}
				if (!local17) {
					@Pc(47) int local47 = (int) local6.aLong139;
					@Pc(53) Class20 local53 = Static84.method1826(local47);
					if (local53 != null) {
						Static152.method2858(local53);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!eb;I)V")
	public static void method1849(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static124.aBoolean154) {
			Static108.method2222(arg0);
			return;
		}
		if (Static145.anInt4043 == 1 && Static74.anInt2247 >= 715 && Static91.anInt2764 >= 453) {
			Static113.aBoolean194 = !Static113.aBoolean194;
			if (Static113.aBoolean194) {
				Static31.method687();
			} else {
				Static87.method1885(Static1.aClass18_48, Static115.aClass16_Sub1_36, Static163.aClass18_1152);
			}
		}
		if (Static73.anInt1886 == 5) {
			return;
		}
		Static164.anInt4505++;
		if (Static73.anInt1886 != 10) {
			return;
		}
		if (Static22.anInt614 != 2 && Static139.anInt3912 == 0) {
			if (Static145.anInt4043 == 1 && Static74.anInt2247 >= 5 && Static74.anInt2247 <= 105 && Static91.anInt2764 >= 463 && Static91.anInt2764 <= 498) {
				Static72.method1550();
				return;
			}
			if (Static46.aClass24_38 != null) {
				Static72.method1550();
			}
		}
		@Pc(114) int local114 = Static145.anInt4043;
		@Pc(116) int local116 = Static91.anInt2764;
		@Pc(118) int local118 = Static74.anInt2247;
		if (Static39.anInt1204 == 0) {
			@Pc(125) boolean local125 = false;
			if (local114 == 1 && local118 >= 227 && local118 <= 377 && local116 >= 271 && local116 <= 311) {
				Static156.anInt4309 = 0;
				Static39.anInt1204 = 3;
			}
			if (Static94.anInt2919 != 0) {
				while (Static101.method2132()) {
					if (Static6.anInt195 == 84) {
						local125 = true;
						break;
					}
				}
			}
			if (local125 || local114 == 1 && local118 >= 387 && local118 <= 537 && local116 >= 271 && local116 <= 311) {
				Static163.aClass18_1150 = Static69.aClass18_508;
				Static163.aClass18_1155 = Static1.aClass18_21;
				Static163.aClass18_1149 = Static1.aClass18_11;
				Static39.anInt1204 = 2;
				Static156.anInt4309 = 0;
			}
		} else if (Static39.anInt1204 == 2) {
			@Pc(250) short local250 = 231;
			@Pc(251) int local251 = local250 + 30;
			if (local114 == 1 && local116 >= 246 && local116 < 261) {
				Static156.anInt4309 = 0;
			}
			local251 += 15;
			if (local114 == 1 && local116 >= 261 && local116 < 276) {
				Static156.anInt4309 = 1;
			}
			local251 += 15;
			if (local114 == 1 && local118 >= 227 && local118 <= 377 && local116 >= 301 && local116 <= 341) {
				Static163.aClass18_1154 = Static163.aClass18_1154.method742().method739();
				if (Static163.aClass18_1154.method747() == 0) {
					Static30.method659(Static1.aClass18_16, Static1.aClass18_51, Static81.aClass18_598);
				} else if (Static163.aClass18_1153.method747() == 0) {
					Static30.method659(Static1.aClass18_30, Static1.aClass18_41, Static117.aClass18_840);
				} else {
					Static30.method659(Static1.aClass18_23, Static1.aClass18_39, Static155.aClass18_1091);
					Static6.method107(20);
				}
			} else {
				if (local114 == 1 && local118 >= 387 && local118 <= 537 && local116 >= 301 && local116 <= 341) {
					Static163.aClass18_1154 = Static163.aClass18_1152;
					Static39.anInt1204 = 0;
					Static163.aClass18_1153 = Static163.aClass18_1152;
				}
				while (true) {
					@Pc(418) boolean local418;
					label238: do {
						while (Static101.method2132()) {
							local418 = false;
							for (@Pc(420) int local420 = 0; local420 < Static100.aClass18_741.method747(); local420++) {
								if (Static177.anInt4717 == Static100.aClass18_741.method736(local420)) {
									local418 = true;
									break;
								}
							}
							if (Static156.anInt4309 != 0) {
								continue label238;
							}
							if (Static6.anInt195 == 85 && Static163.aClass18_1154.method747() > 0) {
								Static163.aClass18_1154 = Static163.aClass18_1154.method744(0, Static163.aClass18_1154.method747() - 1);
							}
							if (Static6.anInt195 == 84 || Static6.anInt195 == 80) {
								Static156.anInt4309 = 1;
							}
							if (local418 && Static163.aClass18_1154.method747() < 12) {
								Static163.aClass18_1154 = Static163.aClass18_1154.method719(Static177.anInt4717);
							}
						}
						return;
					} while (Static156.anInt4309 != 1);
					if (Static6.anInt195 == 85 && Static163.aClass18_1153.method747() > 0) {
						Static163.aClass18_1153 = Static163.aClass18_1153.method744(0, Static163.aClass18_1153.method747() - 1);
					}
					if (Static6.anInt195 == 84 || Static6.anInt195 == 80) {
						Static156.anInt4309 = 0;
					}
					if (Static94.anInt2919 != 0 && Static6.anInt195 == 84) {
						Static163.aClass18_1154 = Static163.aClass18_1154.method742().method739();
						if (Static163.aClass18_1154.method747() == 0) {
							Static30.method659(Static1.aClass18_16, Static1.aClass18_51, Static81.aClass18_598);
							return;
						}
						if (Static163.aClass18_1153.method747() == 0) {
							Static30.method659(Static1.aClass18_30, Static1.aClass18_41, Static117.aClass18_840);
							return;
						}
						Static30.method659(Static1.aClass18_23, Static1.aClass18_39, Static155.aClass18_1091);
						Static6.method107(20);
						return;
					}
					if (local418 && Static163.aClass18_1153.method747() < 20) {
						Static163.aClass18_1153 = Static163.aClass18_1153.method719(Static177.anInt4717);
					}
				}
			}
		} else if (Static39.anInt1204 == 3 && local114 == 1 && local118 >= 307 && local118 <= 457 && local116 >= 301 && local116 <= 341) {
			Static39.anInt1204 = 0;
		}
	}

	@OriginalMember(owner = "client!la", name = "i", descriptor = "(I)V")
	public static void method1851() {
		aClass18_628 = null;
		aClass18_630 = null;
		aClass18_627 = null;
		aClass18_632 = null;
		aClass18_626 = null;
		aClass18_624 = null;
		aClass1_Sub6Array1 = null;
		aClass16_11 = null;
		aClass18_625 = null;
		aClass18_631 = null;
		aClass18_629 = null;
	}
}
