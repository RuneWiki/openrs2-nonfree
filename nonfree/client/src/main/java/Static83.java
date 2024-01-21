import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ne", name = "nb", descriptor = "Lclient!af;")
	private static Class5 aClass5_1027 = Static45.method1937("glow3:");

	@OriginalMember(owner = "client!ne", name = "ab", descriptor = "Lclient!af;")
	public static Class5 aClass5_1025 = aClass5_1027;

	@OriginalMember(owner = "client!ne", name = "eb", descriptor = "Lclient!af;")
	private static Class5 aClass5_1026 = Static45.method1937("Loading interfaces )2 ");

	@OriginalMember(owner = "client!ne", name = "wb", descriptor = "[Lclient!ie;")
	public static Class37[] aClass37Array1 = new Class37[50];

	@OriginalMember(owner = "client!ne", name = "Fb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1029 = aClass5_1027;

	@OriginalMember(owner = "client!ne", name = "Lb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1030 = aClass5_1026;

	@OriginalMember(owner = "client!ne", name = "Nb", descriptor = "I")
	public static int anInt2118 = 0;

	@OriginalMember(owner = "client!ne", name = "Sb", descriptor = "Lclient!af;")
	private static Class5 aClass5_1033 = Static45.method1937("Click to switch");

	@OriginalMember(owner = "client!ne", name = "Ob", descriptor = "Lclient!af;")
	public static Class5 aClass5_1031 = aClass5_1033;

	@OriginalMember(owner = "client!ne", name = "Pb", descriptor = "I")
	public static int anInt2119 = 0;

	@OriginalMember(owner = "client!ne", name = "Qb", descriptor = "Lclient!af;")
	private static Class5 aClass5_1032 = Static45.method1937("Close");

	@OriginalMember(owner = "client!ne", name = "Rb", descriptor = "I")
	public static int anInt2120 = 0;

	@OriginalMember(owner = "client!ne", name = "Tb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1034 = Static45.method1937("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!ne", name = "Ub", descriptor = "Lclient!af;")
	public static Class5 aClass5_1035 = Static45.method1937(")1");

	@OriginalMember(owner = "client!ne", name = "Vb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1036 = aClass5_1032;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)Z")
	public static boolean method1471(@OriginalArg(0) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
	public static void method1472() {
		Static66.method2201(false);
		@Pc(8) boolean local8 = true;
		Static124.anInt3182 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static81.aByteArrayArray8.length; local16++) {
			if (Static25.anIntArray88[local16] != -1 && Static81.aByteArrayArray8[local16] == null) {
				Static81.aByteArrayArray8[local16] = Static20.aClass41_Sub1_4.method1710(Static25.anIntArray88[local16], 0);
				if (Static81.aByteArrayArray8[local16] == null) {
					Static124.anInt3182++;
					local8 = false;
				}
			}
			if (Static45.anIntArray414[local16] != -1 && Static82.aByteArrayArray9[local16] == null) {
				Static82.aByteArrayArray9[local16] = Static20.aClass41_Sub1_4.method1709(0, Static117.anIntArrayArray87[local16], Static45.anIntArray414[local16]);
				if (Static82.aByteArrayArray9[local16] == null) {
					Static124.anInt3182++;
					local8 = false;
				}
			}
		}
		if (!local8) {
			Static92.anInt2322 = 1;
			return;
		}
		Static12.anInt3241 = 0;
		local8 = true;
		@Pc(126) int local126;
		@Pc(115) int local115;
		for (@Pc(96) int local96 = 0; local96 < Static81.aByteArrayArray8.length; local96++) {
			@Pc(102) byte[] local102 = Static82.aByteArrayArray9[local96];
			if (local102 != null) {
				local115 = (Static45.anIntArray415[local96] & 0xFF) * 64 - Static32.anInt927;
				local126 = (Static45.anIntArray415[local96] >> 8) * 64 - Static129.anInt3262;
				if (Static11.aBoolean6) {
					local126 = 10;
					local115 = 10;
				}
				local8 &= Static10.method280(local102, local115, local126);
			}
		}
		if (!local8) {
			Static92.anInt2322 = 2;
			return;
		}
		if (Static92.anInt2322 != 0) {
			Static40.method783(Static100.method1696(new Class5[] { Static12.aClass5_1454, Static112.aClass5_1277 }), true);
		}
		Static101.method1733();
		Static11.method283();
		Static101.method1733();
		Static44.aClass68_1.method1874();
		Static101.method1733();
		System.gc();
		for (@Pc(190) int local190 = 0; local190 < 4; local190++) {
			Static131.aClass49Array1[local190].method1327();
		}
		@Pc(213) int local213;
		for (local126 = 0; local126 < 4; local126++) {
			for (local115 = 0; local115 < 104; local115++) {
				for (local213 = 0; local213 < 104; local213++) {
					Static25.aByteArrayArrayArray1[local126][local115][local213] = 0;
				}
			}
		}
		Static101.method1733();
		Static18.method2156();
		local115 = Static81.aByteArrayArray8.length;
		Static71.method1227();
		Static66.method2201(true);
		@Pc(270) int local270;
		@Pc(285) int local285;
		@Pc(392) int local392;
		@Pc(334) int local334;
		@Pc(381) int local381;
		if (!Static11.aBoolean6) {
			@Pc(274) byte[] local274;
			for (local213 = 0; local213 < local115; local213++) {
				local270 = (Static45.anIntArray415[local213] >> 8) * 64 - Static129.anInt3262;
				local274 = Static81.aByteArrayArray8[local213];
				local285 = (Static45.anIntArray415[local213] & 0xFF) * 64 - Static32.anInt927;
				if (local274 != null) {
					Static101.method1733();
					Static86.method1526(local274, Static108.anInt2662 * 8 - 48, Static131.aClass49Array1, Static42.anInt1066 * 8 - 48, local285, local270);
				}
			}
			for (local270 = 0; local270 < local115; local270++) {
				local285 = (Static45.anIntArray415[local270] >> 8) * 64 - Static129.anInt3262;
				local334 = (Static45.anIntArray415[local270] & 0xFF) * 64 - Static32.anInt927;
				@Pc(338) byte[] local338 = Static81.aByteArrayArray8[local270];
				if (local338 == null && Static42.anInt1066 < 800) {
					Static101.method1733();
					Static97.method1633(64, 64, local334, local285);
				}
			}
			Static66.method2201(true);
			for (local285 = 0; local285 < local115; local285++) {
				local274 = Static82.aByteArrayArray9[local285];
				if (local274 != null) {
					local381 = (Static45.anIntArray415[local285] >> 8) * 64 - Static129.anInt3262;
					local392 = (Static45.anIntArray415[local285] & 0xFF) * 64 - Static32.anInt927;
					Static101.method1733();
					Static26.method564(Static44.aClass68_1, Static131.aClass49Array1, local381, local274, local392);
				}
			}
		}
		@Pc(446) int local446;
		@Pc(452) int local452;
		if (Static11.aBoolean6) {
			@Pc(458) int local458;
			@Pc(469) int local469;
			@Pc(471) int local471;
			for (local213 = 0; local213 < 4; local213++) {
				Static101.method1733();
				for (local270 = 0; local270 < 13; local270++) {
					for (local285 = 0; local285 < 13; local285++) {
						@Pc(423) boolean local423 = false;
						local381 = Static13.anIntArrayArrayArray1[local213][local270][local285];
						if (local381 != -1) {
							local392 = local381 >> 24 & 0x3;
							local446 = local381 >> 1 & 0x3;
							local452 = local381 >> 14 & 0x3FF;
							local458 = local381 >> 3 & 0x7FF;
							local469 = (local452 / 8 << 8) + (local458 / 8);
							for (local471 = 0; local471 < Static45.anIntArray415.length; local471++) {
								if (Static45.anIntArray415[local471] == local469 && Static81.aByteArrayArray8[local471] != null) {
									local423 = true;
									Static72.method1232(local270 * 8, Static81.aByteArrayArray8[local471], local285 * 8, (local452 & 0x7) * 8, local213, local392, Static131.aClass49Array1, local446, (local458 & 0x7) * 8);
									break;
								}
							}
						}
						if (!local423) {
							Static89.method2146(local285 * 8, local270 * 8, local213);
						}
					}
				}
			}
			for (local270 = 0; local270 < 13; local270++) {
				for (local285 = 0; local285 < 13; local285++) {
					local334 = Static13.anIntArrayArrayArray1[0][local270][local285];
					if (local334 == -1) {
						Static97.method1633(8, 8, local285 * 8, local270 * 8);
					}
				}
			}
			Static66.method2201(true);
			for (local285 = 0; local285 < 4; local285++) {
				Static101.method1733();
				for (local334 = 0; local334 < 13; local334++) {
					for (local381 = 0; local381 < 13; local381++) {
						local392 = Static13.anIntArrayArrayArray1[local285][local334][local381];
						if (local392 != -1) {
							local446 = local392 >> 24 & 0x3;
							local452 = local392 >> 1 & 0x3;
							local469 = local392 >> 3 & 0x7FF;
							local458 = local392 >> 14 & 0x3FF;
							local471 = (local458 / 8 << 8) + (local469 / 8);
							for (@Pc(649) int local649 = 0; local649 < Static45.anIntArray415.length; local649++) {
								if (Static45.anIntArray415[local649] == local471 && Static82.aByteArrayArray9[local649] != null) {
									Static2.method55((local458 & 0x7) * 8, local446, Static82.aByteArrayArray9[local649], (local469 & 0x7) * 8, local334 * 8, Static131.aClass49Array1, local452, local381 * 8, local285, Static44.aClass68_1);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static66.method2201(true);
		Static11.method283();
		Static101.method1733();
		Static85.method1500(Static44.aClass68_1, Static131.aClass49Array1);
		Static66.method2201(true);
		local213 = Static76.anInt1797;
		if (local213 > Static7.anInt213) {
			local213 = Static7.anInt213;
		}
		if (local213 < Static7.anInt213 - 1) {
		}
		if (Static79.aBoolean64) {
			Static44.aClass68_1.method1846(Static76.anInt1797);
		} else {
			Static44.aClass68_1.method1846(0);
		}
		for (local270 = 0; local270 < 104; local270++) {
			for (local285 = 0; local285 < 104; local285++) {
				Static7.method222(local270, local285);
			}
		}
		Static101.method1733();
		Static79.method1370();
		Static54.aClass28_35.method792();
		if (Static51.aFrame1 != null) {
			Static44.aClass1_Sub20_Sub1_1.method2108(57);
			Static44.aClass1_Sub20_Sub1_1.method2092(1057001181);
		}
		if (!Static11.aBoolean6) {
			local381 = (Static42.anInt1066 - 6) / 8;
			local334 = (Static108.anInt2662 + 6) / 8;
			local285 = (Static108.anInt2662 - 6) / 8;
			local392 = (Static42.anInt1066 + 6) / 8;
			for (local446 = local285 - 1; local446 <= local334 + 1; local446++) {
				for (local452 = local381 - 1; local452 <= local392 + 1; local452++) {
					if (local285 > local446 || local334 < local446 || local381 > local452 || local452 > local392) {
						Static20.aClass41_Sub1_4.method1716(Static100.method1696(new Class5[] { Static24.aClass5_348, Static48.method838(local446), Static80.aClass5_990, Static48.method838(local452) }));
						Static20.aClass41_Sub1_4.method1716(Static100.method1696(new Class5[] { Static96.aClass5_1144, Static48.method838(local446), Static80.aClass5_990, Static48.method838(local452) }));
					}
				}
			}
		}
		Static97.method1636(30);
		Static101.method1733();
		Static47.method834();
		Static44.aClass1_Sub20_Sub1_1.method2108(67);
		Static51.method897();
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V")
	public static void method1474() {
		try {
			if (Static43.aClass45_1 == null) {
				Static43.aClass45_1 = new Class45(Static65.aClass55_2, Static100.method1696(new Class5[] { Static3.aClass5_44, Static49.aClass5_618, Static66.aClass5_1397 }).method203());
			} else {
				@Pc(16) byte[] local16 = Static43.aClass45_1.method1204();
				if (local16 != null) {
					@Pc(23) Class1_Sub20 local23 = new Class1_Sub20(local16);
					Static52.anInt1265 = local23.method2087();
					Static37.aClass9Array1 = new Class9[Static52.anInt1265];
					for (@Pc(32) int local32 = 0; local32 < Static52.anInt1265; local32++) {
						@Pc(42) Class9 local42 = Static37.aClass9Array1[local32] = new Class9();
						@Pc(46) int local46 = local23.method2087();
						local42.anInt346 = local46 & 0x7FFF;
						local42.aBoolean7 = (local46 & 0x8000) != 0;
						local42.aClass5_177 = local23.method2101();
						local42.anInt343 = local23.method2079();
						local42.anInt344 = local32;
						local42.anInt342 = Static12.method2241(local42.aClass5_177);
					}
					Static60.method1088(Static37.aClass9Array1, Static64.anIntArray247, Static66.anIntArray453, 0, Static37.aClass9Array1.length - 1);
					Static84.aBoolean75 = true;
					Static43.aClass45_1 = null;
					return;
				}
			}
		} catch (@Pc(130) Exception local130) {
			local130.printStackTrace();
			Static43.aClass45_1 = null;
		}
	}

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)V")
	public static void method1476() {
		aClass37Array1 = null;
		aClass5_1035 = null;
		aClass5_1031 = null;
		aClass5_1026 = null;
		aClass5_1029 = null;
		aClass5_1034 = null;
		aClass5_1030 = null;
		aClass5_1025 = null;
		aClass5_1033 = null;
		Class1_Sub3_Sub12.anIntArray323 = null;
		aClass5_1027 = null;
		aClass5_1032 = null;
		aClass5_1036 = null;
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(II)V")
	public static void method1479(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub2 local12 = (Class1_Sub2) Static59.aClass7_6.method287((long) arg0);
		if (local12 != null) {
			for (@Pc(21) int local21 = 0; local21 < local12.anIntArray10.length; local21++) {
				local12.anIntArray10[local21] = -1;
				local12.anIntArray11[local21] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([BIIZ)I")
	public static int method1481(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(14) int local14 = arg1; local14 < arg2; local14++) {
			local7 = Class26.anIntArray184[(arg0[local14] ^ local7) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}
}
