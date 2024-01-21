import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!pc", name = "gb", descriptor = "I")
	public static int anInt2081;

	@OriginalMember(owner = "client!pc", name = "M", descriptor = "Lclient!fc;")
	public static Class25 aClass25_977 = Static78.method1313("gleiten:");

	@OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
	public static int anInt2072 = 0;

	@OriginalMember(owner = "client!pc", name = "P", descriptor = "Lclient!fc;")
	public static Class25 aClass25_978 = Static78.method1313(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
	public static int anInt2075 = 0;

	@OriginalMember(owner = "client!pc", name = "kb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_985 = Static78.method1313("");

	@OriginalMember(owner = "client!pc", name = "U", descriptor = "Lclient!fc;")
	public static Class25 aClass25_979 = aClass25_985;

	@OriginalMember(owner = "client!pc", name = "X", descriptor = "Lclient!fc;")
	public static Class25 aClass25_980 = Static78.method1313("Nehmen");

	@OriginalMember(owner = "client!pc", name = "Y", descriptor = "Lclient!fc;")
	public static Class25 aClass25_981 = aClass25_985;

	@OriginalMember(owner = "client!pc", name = "ab", descriptor = "Lclient!fc;")
	public static Class25 aClass25_982 = aClass25_985;

	@OriginalMember(owner = "client!pc", name = "bb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_983 = aClass25_985;

	@OriginalMember(owner = "client!pc", name = "cb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_984 = aClass25_985;

	@OriginalMember(owner = "client!pc", name = "lb", descriptor = "Lclient!fc;")
	private static Class25 aClass25_986 = aClass25_985;

	@OriginalMember(owner = "client!pc", name = "pb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_987 = aClass25_985;

	@OriginalMember(owner = "client!pc", name = "qb", descriptor = "Z")
	public static boolean aBoolean100 = false;

	@OriginalMember(owner = "client!pc", name = "sb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_988 = Static78.method1313("leuchten2:");

	@OriginalMember(owner = "client!pc", name = "tb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_989 = aClass25_985;

	@OriginalMember(owner = "client!pc", name = "ub", descriptor = "Z")
	public static boolean aBoolean101 = true;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
	public static void method1554() {
		Static106.method1722();
		Static96.aBoolean125 = true;
		Static108.method1738();
		if (Static110.aBoolean115) {
			Static83.aClass1_Sub2_Sub2_Sub3_3.method1200(aClass25_981, 239, 40, 0, -1);
			Static83.aClass1_Sub2_Sub2_Sub3_3.method1200(Static116.method1859(new Class25[] { Static72.method1188(aClass25_982), Static126.aClass25_1413 }), 239, 60, 128, -1);
		} else if (Static104.anInt2372 == 1) {
			Static83.aClass1_Sub2_Sub2_Sub3_3.method1200(Static9.aClass25_136, 239, 40, 0, -1);
			Static83.aClass1_Sub2_Sub2_Sub3_3.method1200(Static116.method1859(new Class25[] { Static72.method1188(aClass25_989), Static126.aClass25_1413 }), 239, 60, 128, -1);
		} else if (Static104.anInt2372 == 2) {
			Static83.aClass1_Sub2_Sub2_Sub3_3.method1200(Static27.aClass25_329, 239, 40, 0, -1);
			Static83.aClass1_Sub2_Sub2_Sub3_3.method1200(Static116.method1859(new Class25[] { Static72.method1188(aClass25_989), Static126.aClass25_1413 }), 239, 60, 128, -1);
		} else {
			@Pc(118) Class1_Sub2_Sub2_Sub3 local118;
			@Pc(125) int local125;
			@Pc(135) int local135;
			if (Static104.anInt2372 == 3) {
				if (aClass25_989 != aClass25_986) {
					Static15.method362(aClass25_989);
					aClass25_986 = aClass25_989;
				}
				local118 = Static42.aClass1_Sub2_Sub2_Sub3_1;
				Static128.method1942(0, 0, 463, 77);
				for (local125 = 0; local125 < Static69.anInt1481; local125++) {
					local135 = local125 * 14 + 18 - Static33.anInt920;
					if (local135 > 0 && local135 < 110) {
						local118.method1200(Static89.aClass25Array2[local125], 239, local135, 0, -1);
					}
				}
				Static128.method1946();
				if (Static69.anInt1481 > 5) {
					Static98.method1970(Static33.anInt920, 463, Static69.anInt1481 * 14 + 7, 0, 77);
				}
				if (aClass25_989.method762() == 0) {
					Static83.aClass1_Sub2_Sub2_Sub3_3.method1200(Static26.aClass25_326, 239, 40, 255, -1);
				} else if (Static69.anInt1481 == 0) {
					Static83.aClass1_Sub2_Sub2_Sub3_3.method1200(Static68.aClass25_689, 239, 40, 0, -1);
				}
				local118.method1200(Static116.method1859(new Class25[] { Static72.method1188(aClass25_989), Static126.aClass25_1413 }), 239, 90, 0, -1);
				Static128.method1944(0, 77, 479, 0);
			} else if (Static104.anInt2372 == 4) {
				Static83.aClass1_Sub2_Sub2_Sub3_3.method1200(aClass25_987, 239, 40, 0, -1);
				Static83.aClass1_Sub2_Sub2_Sub3_3.method1200(Static116.method1859(new Class25[] { Static72.method1188(aClass25_989), Static126.aClass25_1413 }), 239, 60, 128, -1);
			} else if (Static53.aClass25_1240 == null) {
				@Pc(244) boolean local244;
				if (Static33.anInt916 != -1) {
					local244 = Static25.method589(Static33.anInt916, 96, 2, 479);
					if (!local244) {
						Static110.aBoolean113 = true;
					}
				} else if (Static108.anInt2502 == -1) {
					local118 = Static42.aClass1_Sub2_Sub2_Sub3_1;
					Static128.method1942(0, 0, 463, 77);
					local125 = 0;
					for (local135 = 0; local135 < 100; local135++) {
						if (Static97.aClass25Array20[local135] != null) {
							@Pc(293) int local293 = Static7.anInt166 + 70 - local125 * 14;
							@Pc(297) Class25 local297 = Static118.aClass25Array23[local135];
							@Pc(301) int local301 = Static122.anIntArray495[local135];
							@Pc(303) byte local303 = 0;
							if (local297 != null && local297.method797(Static77.aClass25_810)) {
								local303 = 1;
								local297 = local297.method794(5);
							}
							if (local297 != null && local297.method797(Static38.aClass25_448)) {
								local303 = 2;
								local297 = local297.method794(5);
							}
							if (local301 == 0) {
								if (local293 > 0 && local293 < 110) {
									local118.method1180(Static97.aClass25Array20[local135], 4, local293, 0, -1);
								}
								local125++;
							}
							@Pc(389) int local389;
							if ((local301 == 1 || local301 == 2) && (local301 == 1 || Static82.anInt1811 == 0 || Static82.anInt1811 == 1 && Static31.method704(local297))) {
								if (local293 > 0 && local293 < 110) {
									local389 = 4;
									if (local303 == 1) {
										Static80.aClass1_Sub2_Sub2_Sub4Array5[0].method1953(4, local293 - 12);
										local389 += 14;
									}
									if (local303 == 2) {
										Static80.aClass1_Sub2_Sub2_Sub4Array5[1].method1953(local389, local293 - 12);
										local389 += 14;
									}
									local118.method1180(Static116.method1859(new Class25[] { local297, Static6.aClass25_55 }), local389, local293, 0, -1);
									local389 += local118.method1187(local297) + 8;
									local118.method1180(Static97.aClass25Array20[local135], local389, local293, 255, -1);
								}
								local125++;
							}
							if ((local301 == 3 || local301 == 7) && Static65.anInt1449 == 0 && (local301 == 7 || Static80.anInt1785 == 0 || Static80.anInt1785 == 1 && Static31.method704(local297))) {
								if (local293 > 0 && local293 < 110) {
									local118.method1180(Static10.aClass25_141, 4, local293, 0, -1);
									local389 = local118.method1187(Static10.aClass25_141) + 4;
									local389 += local118.method1201(32);
									if (local303 == 1) {
										Static80.aClass1_Sub2_Sub2_Sub4Array5[0].method1953(local389, local293 - 12);
										local389 += 14;
									}
									if (local303 == 2) {
										Static80.aClass1_Sub2_Sub2_Sub4Array5[1].method1953(local389, local293 - 12);
										local389 += 14;
									}
									local118.method1180(Static116.method1859(new Class25[] { local297, Static6.aClass25_55 }), local389, local293, 0, -1);
									local389 += local118.method1187(local297) + 8;
									local118.method1180(Static97.aClass25Array20[local135], local389, local293, 8388608, -1);
								}
								local125++;
							}
							if (local301 == 4 && (Static11.anInt279 == 0 || Static11.anInt279 == 1 && Static31.method704(local297))) {
								if (local293 > 0 && local293 < 110) {
									local118.method1180(Static116.method1859(new Class25[] { local297, Static70.aClass25_631, Static97.aClass25Array20[local135] }), 4, local293, 8388736, -1);
								}
								local125++;
							}
							if (local301 == 5 && Static65.anInt1449 == 0 && Static80.anInt1785 < 2) {
								if (local293 > 0 && local293 < 110) {
									local118.method1180(Static97.aClass25Array20[local135], 4, local293, 8388608, -1);
								}
								local125++;
							}
							if (local301 == 6 && Static65.anInt1449 == 0 && Static80.anInt1785 < 2) {
								if (local293 > 0 && local293 < 110) {
									local118.method1180(Static116.method1859(new Class25[] { Static1.aClass25_17, Static70.aClass25_631, local297, Static6.aClass25_55 }), 4, local293, 0, -1);
									local118.method1180(Static97.aClass25Array20[local135], local118.method1187(Static116.method1859(new Class25[] { Static1.aClass25_17, Static70.aClass25_631, local297 })) + 12, local293, 8388608, -1);
								}
								local125++;
							}
							if (local301 == 8 && (Static11.anInt279 == 0 || Static11.anInt279 == 1 && Static31.method704(local297))) {
								local125++;
								if (local293 > 0 && local293 < 110) {
									local118.method1180(Static116.method1859(new Class25[] { local297, Static70.aClass25_631, Static97.aClass25Array20[local135] }), 4, local293, 8270336, -1);
								}
							}
						}
					}
					Static128.method1946();
					Static58.anInt1342 = local125 * 14 + 7;
					if (Static58.anInt1342 < 78) {
						Static58.anInt1342 = 78;
					}
					Static98.method1970(Static58.anInt1342 - Static7.anInt166 - 77, 463, Static58.anInt1342, 0, 77);
					@Pc(806) Class25 local806;
					if (Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1 == null || Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.aClass25_1384 == null) {
						local806 = Static81.aClass25_862;
					} else {
						local806 = Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.aClass25_1384;
					}
					local118.method1180(Static116.method1859(new Class25[] { local806, Static6.aClass25_55 }), 4, 90, 0, -1);
					local118.method1180(Static116.method1859(new Class25[] { Static72.method1188(aClass25_984), Static126.aClass25_1413 }), local118.method1187(Static116.method1859(new Class25[] { local806, Static74.aClass25_739 })) + 6, 90, 255, -1);
					Static128.method1944(0, 77, 479, 0);
				} else {
					local244 = Static25.method589(Static108.anInt2502, 96, 3, 479);
					if (!local244) {
						Static110.aBoolean113 = true;
					}
				}
			} else {
				Static83.aClass1_Sub2_Sub2_Sub3_3.method1179(Static53.aClass25_1240, 10, 20, 459, 40, 0, -1, 1, 1, 0);
				Static83.aClass1_Sub2_Sub2_Sub3_3.method1200(Static83.aClass25_908, 239, 80, 128, -1);
			}
		}
		if (Static82.aBoolean77 && Static42.anInt1133 == 2) {
			Static27.method601();
		}
		Static88.method1441();
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V")
	public static void method1555() {
		aClass25_984 = null;
		aClass25_982 = null;
		aClass25_986 = null;
		aClass25_981 = null;
		aClass25_985 = null;
		aClass25_983 = null;
		aClass25_979 = null;
		aClass25_987 = null;
		aClass25_977 = null;
		aClass25_988 = null;
		aClass25_980 = null;
		aClass25_978 = null;
		aClass25_989 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IJ)V")
	public static void method1556(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static49.anInt1230; local12++) {
			if (arg0 == Static68.aLongArray3[local12]) {
				Static90.aBoolean98 = true;
				Static49.anInt1230--;
				for (@Pc(32) int local32 = local12; local32 < Static49.anInt1230; local32++) {
					Static68.aLongArray3[local32] = Static68.aLongArray3[local32 + 1];
				}
				Static68.aClass1_Sub5_Sub1_2.method688(254);
				Static68.aClass1_Sub5_Sub1_2.method640(arg0);
				return;
			}
		}
	}
}
