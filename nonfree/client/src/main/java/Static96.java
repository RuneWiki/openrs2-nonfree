import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!ua", name = "Mc", descriptor = "Lclient!vb;")
	public static Class2_Sub2_Sub2_Sub4 aClass2_Sub2_Sub2_Sub4_9;

	@OriginalMember(owner = "client!ua", name = "ad", descriptor = "I")
	public static int anInt2341;

	@OriginalMember(owner = "client!ua", name = "Fc", descriptor = "I")
	public static int anInt2328 = 0;

	@OriginalMember(owner = "client!ua", name = "Hc", descriptor = "Lclient!od;")
	public static Class44 aClass44_8 = new Class44();

	@OriginalMember(owner = "client!ua", name = "Lc", descriptor = "I")
	public static int anInt2333 = 0;

	@OriginalMember(owner = "client!ua", name = "Nc", descriptor = "[I")
	public static int[] anIntArray497 = new int[50];

	@OriginalMember(owner = "client!ua", name = "Tc", descriptor = "Z")
	public static boolean aBoolean173 = false;

	@OriginalMember(owner = "client!ua", name = "Uc", descriptor = "Lclient!o;")
	public static Class40 aClass40_661 = Static13.method257("titlebutton");

	@OriginalMember(owner = "client!ua", name = "Xc", descriptor = "Lclient!o;")
	private static Class40 aClass40_662 = Static13.method257("as it was used to break our rules");

	@OriginalMember(owner = "client!ua", name = "Yc", descriptor = "Lclient!o;")
	public static Class40 aClass40_663 = Static13.method257("mapfunction");

	@OriginalMember(owner = "client!ua", name = "Zc", descriptor = "I")
	public static int anInt2340 = -1;

	@OriginalMember(owner = "client!ua", name = "bd", descriptor = "I")
	public static int anInt2342 = 0;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)V")
	public static void method1549(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(12) int local12 = Static54.anIntArray287[arg0];
		if (local12 >= 2000) {
			local12 -= 2000;
		}
		@Pc(22) int local22 = Static88.anIntArray454[arg0];
		@Pc(26) int local26 = Static35.anIntArray161[arg0];
		@Pc(30) int local30 = Static36.anIntArray165[arg0];
		if (Static101.anInt2399 != 0 && local12 != 1003) {
			Static101.anInt2399 = 0;
			Static73.aBoolean144 = true;
		}
		@Pc(50) Class2_Sub2_Sub12_Sub1_Sub2 local50;
		@Pc(70) Class40 local70;
		if (local12 == 1006) {
			local50 = Static2.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local22];
			if (local50 != null) {
				@Pc(55) Class2_Sub2_Sub7 local55 = local50.aClass2_Sub2_Sub7_1;
				if (local55.anIntArray154 != null) {
					local55 = local55.method611();
				}
				if (local55 != null) {
					if (local55.aClass40_237 == null) {
						local70 = Static80.method1334(new Class40[] { Static42.aClass40_318, local55.aClass40_238, Static41.aClass40_306 });
					} else {
						local70 = local55.aClass40_237;
					}
					Static58.method989(0, Static61.aClass40_445, local70);
				}
			}
		}
		if (local12 == 8) {
			local50 = Static2.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local22];
			if (local50 != null) {
				Static83.method1349(local50.anIntArray496[0], 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local50.anIntArray492[0]);
				Static45.anInt1096 = 2;
				Static102.anInt2465 = Static90.anInt2133;
				Static62.anInt1554 = Static107.anInt2500;
				Static101.anInt2410 = 0;
				Static80.aClass2_Sub3_Sub1_4.method1736(110);
				Static80.aClass2_Sub3_Sub1_4.method1711(local22);
			}
		}
		if (local12 == 1005) {
			@Pc(161) int local161 = local22 >> 14 & 0x7FFF;
			@Pc(165) Class2_Sub2_Sub10 local165 = Static91.method1470(local161);
			if (local165.aClass40_316 == null) {
				local70 = Static80.method1334(new Class40[] { Static42.aClass40_318, local165.aClass40_315, Static41.aClass40_306 });
			} else {
				local70 = local165.aClass40_316;
			}
			Static58.method989(0, Static61.aClass40_445, local70);
		}
		@Pc(225) boolean local225;
		if (local12 == 11) {
			local225 = Static83.method1349(local30, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 0, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 0, local26);
			if (!local225) {
				Static83.method1349(local30, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local26);
			}
			Static101.anInt2410 = 0;
			Static45.anInt1096 = 2;
			Static102.anInt2465 = Static90.anInt2133;
			Static62.anInt1554 = Static107.anInt2500;
			Static80.aClass2_Sub3_Sub1_4.method1736(211);
			Static80.aClass2_Sub3_Sub1_4.method1711(Static30.anInt724);
			Static80.aClass2_Sub3_Sub1_4.method1720(Static99.anInt96);
			Static80.aClass2_Sub3_Sub1_4.method1720(local26 + Static87.anInt2058);
			Static80.aClass2_Sub3_Sub1_4.method1694(Static30.anInt725 + local30);
			Static80.aClass2_Sub3_Sub1_4.method1697(Static105.anInt2526);
			Static80.aClass2_Sub3_Sub1_4.method1694(local22);
		}
		if (local12 == 56) {
			local50 = Static2.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local22];
			if (local50 != null) {
				Static83.method1349(local50.anIntArray496[0], 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local50.anIntArray492[0]);
				Static62.anInt1554 = Static107.anInt2500;
				Static101.anInt2410 = 0;
				Static102.anInt2465 = Static90.anInt2133;
				Static45.anInt1096 = 2;
				Static80.aClass2_Sub3_Sub1_4.method1736(212);
				Static80.aClass2_Sub3_Sub1_4.method1711(local22);
			}
		}
		if (local12 == 55) {
			Static80.aClass2_Sub3_Sub1_4.method1736(79);
			Static80.aClass2_Sub3_Sub1_4.method1722(local30);
			Static80.aClass2_Sub3_Sub1_4.method1707(local22);
			Static80.aClass2_Sub3_Sub1_4.method1694(local26);
			Static21.anInt481 = 2;
			Static52.anInt1171 = local30;
			Static82.anInt1947 = local26;
			if (Static22.anInt2585 == local30 >> 16) {
				Static21.anInt481 = 1;
			}
			if (Static85.anInt1994 == local30 >> 16) {
				Static21.anInt481 = 3;
			}
			Static29.anInt719 = 0;
		}
		@Pc(407) Class40 local407;
		@Pc(412) int local412;
		@Pc(427) long local427;
		if (local12 == 51 || local12 == 12 || local12 == 2 || local12 == 45) {
			local407 = Static18.aClass40Array8[arg0];
			local412 = local407.method1200(Static32.aClass40_229);
			if (local412 != -1) {
				local427 = local407.method1185(local412 + 5).method1178().method1179();
				if (local12 == 51) {
					Static63.method1062(local427);
				}
				if (local12 == 12) {
					Static15.method1254(local427);
				}
				if (local12 == 2) {
					Static70.method1115(local427);
				}
				if (local12 == 45) {
					Static82.method1345(local427);
				}
			}
		}
		@Pc(462) Class2_Sub2_Sub12_Sub1_Sub1 local462;
		if (local12 == 15) {
			local462 = Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local22];
			if (local462 != null) {
				Static83.method1349(local462.anIntArray496[0], 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local462.anIntArray492[0]);
				Static102.anInt2465 = Static90.anInt2133;
				Static101.anInt2410 = 0;
				Static45.anInt1096 = 2;
				Static62.anInt1554 = Static107.anInt2500;
				Static80.aClass2_Sub3_Sub1_4.method1736(7);
				Static80.aClass2_Sub3_Sub1_4.method1707(local22);
			}
		}
		@Pc(529) Class2_Sub2_Sub13 local529;
		if (local12 == 49) {
			Static80.aClass2_Sub3_Sub1_4.method1736(184);
			Static80.aClass2_Sub3_Sub1_4.method1725(local30);
			local529 = Static81.method1340(local30);
			if (local529.anIntArrayArray11 != null && local529.anIntArrayArray11[0][0] == 5) {
				local412 = local529.anIntArrayArray11[0][1];
				if (local529.anIntArray333[0] != Static67.anIntArray339[local412]) {
					Static67.anIntArray339[local412] = local529.anIntArray333[0];
					Static22.method1700(local412);
					Static33.aBoolean59 = true;
				}
			}
		}
		@Pc(600) int local600;
		if (local12 == 20) {
			local407 = Static18.aClass40Array8[arg0];
			local412 = local407.method1200(Static32.aClass40_229);
			if (local412 != -1) {
				local427 = local407.method1185(local412 + 5).method1178().method1179();
				@Pc(598) int local598 = -1;
				for (local600 = 0; local600 < Static22.anInt2594; local600++) {
					if (Static21.aLongArray2[local600] == local427) {
						local598 = local600;
						break;
					}
				}
				if (local598 != -1 && Static62.anIntArray316[local598] > 0) {
					Static93.anInt2180 = 3;
					Static101.anInt2399 = 0;
					Static73.aBoolean144 = true;
					Static74.aBoolean146 = true;
					Static61.aClass40_447 = Static61.aClass40_445;
					Static56.aLong136 = Static21.aLongArray2[local598];
					Static61.aClass40_453 = Static80.method1334(new Class40[] { Static1.aClass40_2, Static51.aClass40Array23[local598] });
				}
			}
		}
		if (local12 == 46) {
			Static80.aClass2_Sub3_Sub1_4.method1736(64);
			Static80.aClass2_Sub3_Sub1_4.method1725(local30);
			Static80.aClass2_Sub3_Sub1_4.method1707(local26);
			Static80.aClass2_Sub3_Sub1_4.method1707(local22);
			Static52.anInt1171 = local30;
			Static21.anInt481 = 2;
			Static29.anInt719 = 0;
			Static82.anInt1947 = local26;
			if (local30 >> 16 == Static22.anInt2585) {
				Static21.anInt481 = 1;
			}
			if (local30 >> 16 == Static85.anInt1994) {
				Static21.anInt481 = 3;
			}
		}
		if (local12 == 42) {
			local407 = Static18.aClass40Array8[arg0];
			local412 = local407.method1200(Static32.aClass40_229);
			if (local412 != -1) {
				if (Static22.anInt2585 == -1) {
					Static60.method998();
					if (Static34.anInt808 != -1) {
						Static61.aClass40_448 = local407.method1185(local412 + 5).method1178();
						Static75.anInt1826 = Static22.anInt2585 = Static34.anInt808;
						Static54.aBoolean103 = false;
					}
				} else {
					Static58.method989(0, Static61.aClass40_445, Static94.aClass40_628);
				}
			}
		}
		if (local12 == 31) {
			local50 = Static2.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local22];
			if (local50 != null) {
				Static83.method1349(local50.anIntArray496[0], 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local50.anIntArray492[0]);
				Static102.anInt2465 = Static90.anInt2133;
				Static62.anInt1554 = Static107.anInt2500;
				Static45.anInt1096 = 2;
				Static101.anInt2410 = 0;
				Static80.aClass2_Sub3_Sub1_4.method1736(133);
				Static80.aClass2_Sub3_Sub1_4.method1711(local22);
			}
		}
		if (local12 == 40) {
			Static80.aClass2_Sub3_Sub1_4.method1736(184);
			Static80.aClass2_Sub3_Sub1_4.method1725(local30);
			local529 = Static81.method1340(local30);
			if (local529.anIntArrayArray11 != null && local529.anIntArrayArray11[0][0] == 5) {
				local412 = local529.anIntArrayArray11[0][1];
				Static67.anIntArray339[local412] = 1 - Static67.anIntArray339[local412];
				Static22.method1700(local412);
				Static33.aBoolean59 = true;
			}
		}
		if (local12 == 4) {
			Static80.aClass2_Sub3_Sub1_4.method1736(220);
			Static80.aClass2_Sub3_Sub1_4.method1720(local22);
			Static80.aClass2_Sub3_Sub1_4.method1694(local26);
			Static80.aClass2_Sub3_Sub1_4.method1722(local30);
			Static21.anInt481 = 2;
			Static29.anInt719 = 0;
			Static82.anInt1947 = local26;
			Static52.anInt1171 = local30;
			if (Static22.anInt2585 == local30 >> 16) {
				Static21.anInt481 = 1;
			}
			if (Static85.anInt1994 == local30 >> 16) {
				Static21.anInt481 = 3;
			}
		}
		if (local12 == 33) {
			local462 = Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local22];
			if (local462 != null) {
				Static83.method1349(local462.anIntArray496[0], 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local462.anIntArray492[0]);
				Static45.anInt1096 = 2;
				Static101.anInt2410 = 0;
				Static102.anInt2465 = Static90.anInt2133;
				Static62.anInt1554 = Static107.anInt2500;
				Static80.aClass2_Sub3_Sub1_4.method1736(58);
				Static80.aClass2_Sub3_Sub1_4.method1711(local22);
			}
		}
		if (local12 == 44) {
			local50 = Static2.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local22];
			if (local50 != null) {
				Static83.method1349(local50.anIntArray496[0], 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local50.anIntArray492[0]);
				Static102.anInt2465 = Static90.anInt2133;
				Static62.anInt1554 = Static107.anInt2500;
				Static45.anInt1096 = 2;
				Static101.anInt2410 = 0;
				Static80.aClass2_Sub3_Sub1_4.method1736(101);
				Static80.aClass2_Sub3_Sub1_4.method1725(Static85.anInt1992);
				Static80.aClass2_Sub3_Sub1_4.method1707(local22);
			}
		}
		if (local12 == 3) {
			local225 = Static83.method1349(local30, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 0, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 0, local26);
			if (!local225) {
				Static83.method1349(local30, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local26);
			}
			Static102.anInt2465 = Static90.anInt2133;
			Static45.anInt1096 = 2;
			Static62.anInt1554 = Static107.anInt2500;
			Static101.anInt2410 = 0;
			Static80.aClass2_Sub3_Sub1_4.method1736(131);
			Static80.aClass2_Sub3_Sub1_4.method1694(local30 + Static30.anInt725);
			Static80.aClass2_Sub3_Sub1_4.method1711(local22);
			Static80.aClass2_Sub3_Sub1_4.method1694(local26 + Static87.anInt2058);
		}
		if (local12 == 16) {
			local225 = Static83.method1349(local30, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 0, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 0, local26);
			if (!local225) {
				Static83.method1349(local30, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local26);
			}
			Static45.anInt1096 = 2;
			Static62.anInt1554 = Static107.anInt2500;
			Static102.anInt2465 = Static90.anInt2133;
			Static101.anInt2410 = 0;
			Static80.aClass2_Sub3_Sub1_4.method1736(200);
			Static80.aClass2_Sub3_Sub1_4.method1694(Static30.anInt725 + local30);
			Static80.aClass2_Sub3_Sub1_4.method1694(Static87.anInt2058 + local26);
			Static80.aClass2_Sub3_Sub1_4.method1720(local22);
		}
		@Pc(1208) boolean local1208;
		if (local12 == 54) {
			local529 = Static81.method1340(local30);
			local1208 = true;
			if (local529.anInt1610 > 0) {
				local1208 = Static36.method639(local529);
			}
			if (local1208) {
				Static80.aClass2_Sub3_Sub1_4.method1736(184);
				Static80.aClass2_Sub3_Sub1_4.method1725(local30);
			}
		}
		if (local12 == 32) {
			Static60.method998();
		}
		if (local12 == 41) {
			Static42.method770(local30, local22, local26);
			Static80.aClass2_Sub3_Sub1_4.method1736(165);
			Static80.aClass2_Sub3_Sub1_4.method1707(local30 + Static30.anInt725);
			Static80.aClass2_Sub3_Sub1_4.method1711(Static87.anInt2058 + local26);
			Static80.aClass2_Sub3_Sub1_4.method1720(local22 >> 14 & 0x7FFF);
		}
		@Pc(1295) Class2_Sub2_Sub12_Sub1_Sub2 local1295;
		if (local12 == 17) {
			local1295 = Static2.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local22];
			if (local1295 != null) {
				Static83.method1349(local1295.anIntArray496[0], 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local1295.anIntArray492[0]);
				Static102.anInt2465 = Static90.anInt2133;
				Static62.anInt1554 = Static107.anInt2500;
				Static45.anInt1096 = 2;
				Static101.anInt2410 = 0;
				Static80.aClass2_Sub3_Sub1_4.method1736(185);
				Static80.aClass2_Sub3_Sub1_4.method1707(local22);
			}
		}
		if (local12 == 1) {
			Static79.anInt1874 = 1;
			Static30.anInt724 = local26;
			Static105.anInt2526 = local30;
			Static99.anInt96 = local22;
			Static87.aClass40_601 = Static105.method1669(local22).aClass40_290;
			if (Static87.aClass40_601 == null) {
				Static87.aClass40_601 = Static52.aClass40_359;
			}
			Static24.anInt641 = 0;
			Static33.aBoolean59 = true;
			return;
		}
		if (local12 == 39) {
			Static80.aClass2_Sub3_Sub1_4.method1736(135);
			Static80.aClass2_Sub3_Sub1_4.method1707(local22);
			Static80.aClass2_Sub3_Sub1_4.method1722(local30);
			Static80.aClass2_Sub3_Sub1_4.method1711(local26);
			Static21.anInt481 = 2;
			Static29.anInt719 = 0;
			if (local30 >> 16 == Static22.anInt2585) {
				Static21.anInt481 = 1;
			}
			Static52.anInt1171 = local30;
			Static82.anInt1947 = local26;
			if (Static85.anInt1994 == local30 >> 16) {
				Static21.anInt481 = 3;
			}
		}
		if (local12 == 22) {
			local1295 = Static2.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local22];
			if (local1295 != null) {
				Static83.method1349(local1295.anIntArray496[0], 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local1295.anIntArray492[0]);
				Static62.anInt1554 = Static107.anInt2500;
				Static101.anInt2410 = 0;
				Static45.anInt1096 = 2;
				Static102.anInt2465 = Static90.anInt2133;
				Static80.aClass2_Sub3_Sub1_4.method1736(164);
				Static80.aClass2_Sub3_Sub1_4.method1720(local22);
			}
		}
		if (local12 == 14) {
			local1208 = Static83.method1349(local30, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 0, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 0, local26);
			if (!local1208) {
				Static83.method1349(local30, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local26);
			}
			Static45.anInt1096 = 2;
			Static102.anInt2465 = Static90.anInt2133;
			Static62.anInt1554 = Static107.anInt2500;
			Static101.anInt2410 = 0;
			Static80.aClass2_Sub3_Sub1_4.method1736(219);
			Static80.aClass2_Sub3_Sub1_4.method1720(Static87.anInt2058 + local26);
			Static80.aClass2_Sub3_Sub1_4.method1720(local22);
			Static80.aClass2_Sub3_Sub1_4.method1720(local30 + Static30.anInt725);
		}
		@Pc(1556) Class2_Sub2_Sub8 local1556;
		if (local12 == 1001) {
			local1556 = Static105.method1669(local22);
			if (local1556.aClass40_289 == null) {
				local70 = Static80.method1334(new Class40[] { Static42.aClass40_318, local1556.aClass40_290, Static41.aClass40_306 });
			} else {
				local70 = local1556.aClass40_289;
			}
			Static58.method989(0, Static61.aClass40_445, local70);
		}
		if (local12 == 28) {
			Static80.aClass2_Sub3_Sub1_4.method1736(66);
			Static80.aClass2_Sub3_Sub1_4.method1711(local26);
			Static80.aClass2_Sub3_Sub1_4.method1722(local30);
			Static80.aClass2_Sub3_Sub1_4.method1694(local22);
			Static80.aClass2_Sub3_Sub1_4.method1725(Static85.anInt1992);
			Static21.anInt481 = 2;
			Static82.anInt1947 = local26;
			if (local30 >> 16 == Static22.anInt2585) {
				Static21.anInt481 = 1;
			}
			Static29.anInt719 = 0;
			Static52.anInt1171 = local30;
			if (Static85.anInt1994 == local30 >> 16) {
				Static21.anInt481 = 3;
			}
		}
		if (local12 == 35) {
			Static83.method1350(Static38.anInt980);
			Static38.anInt980 = -1;
			Static73.aBoolean144 = true;
		}
		if (local12 == 52) {
			Static80.aClass2_Sub3_Sub1_4.method1736(199);
			Static80.aClass2_Sub3_Sub1_4.method1694(local26);
			Static80.aClass2_Sub3_Sub1_4.method1725(local30);
			Static80.aClass2_Sub3_Sub1_4.method1694(local22);
			Static29.anInt719 = 0;
			Static52.anInt1171 = local30;
			Static21.anInt481 = 2;
			if (Static22.anInt2585 == local30 >> 16) {
				Static21.anInt481 = 1;
			}
			if (local30 >> 16 == Static85.anInt1994) {
				Static21.anInt481 = 3;
			}
			Static82.anInt1947 = local26;
		}
		if (local12 == 53) {
			Static80.aClass2_Sub3_Sub1_4.method1736(193);
			Static80.aClass2_Sub3_Sub1_4.method1686(local30);
			Static80.aClass2_Sub3_Sub1_4.method1720(local26);
			Static80.aClass2_Sub3_Sub1_4.method1711(local22);
			Static82.anInt1947 = local26;
			Static21.anInt481 = 2;
			if (Static22.anInt2585 == local30 >> 16) {
				Static21.anInt481 = 1;
			}
			if (Static85.anInt1994 == local30 >> 16) {
				Static21.anInt481 = 3;
			}
			Static52.anInt1171 = local30;
			Static29.anInt719 = 0;
		}
		if (local12 == 34) {
			Static42.method770(local30, local22, local26);
			Static80.aClass2_Sub3_Sub1_4.method1736(222);
			Static80.aClass2_Sub3_Sub1_4.method1720(Static30.anInt725 + local30);
			Static80.aClass2_Sub3_Sub1_4.method1707(local22 >> 14 & 0x7FFF);
			Static80.aClass2_Sub3_Sub1_4.method1711(Static87.anInt2058 + local26);
		}
		if (local12 == 47) {
			Static80.aClass2_Sub3_Sub1_4.method1736(192);
			Static80.aClass2_Sub3_Sub1_4.method1697(local30);
			Static80.aClass2_Sub3_Sub1_4.method1711(local26);
			Static80.aClass2_Sub3_Sub1_4.method1707(local22);
			Static52.anInt1171 = local30;
			Static29.anInt719 = 0;
			Static21.anInt481 = 2;
			Static82.anInt1947 = local26;
			if (Static22.anInt2585 == local30 >> 16) {
				Static21.anInt481 = 1;
			}
			if (Static85.anInt1994 == local30 >> 16) {
				Static21.anInt481 = 3;
			}
		}
		if (local12 == 26) {
			Static80.aClass2_Sub3_Sub1_4.method1736(194);
			Static80.aClass2_Sub3_Sub1_4.method1694(local22);
			Static80.aClass2_Sub3_Sub1_4.method1722(local30);
			Static80.aClass2_Sub3_Sub1_4.method1707(local26);
			Static29.anInt719 = 0;
			Static82.anInt1947 = local26;
			Static52.anInt1171 = local30;
			Static21.anInt481 = 2;
			if (Static22.anInt2585 == local30 >> 16) {
				Static21.anInt481 = 1;
			}
			if (Static85.anInt1994 == local30 >> 16) {
				Static21.anInt481 = 3;
			}
		}
		if (local12 == 1002) {
			local1556 = Static105.method1669(local22);
			@Pc(1908) Class2_Sub2_Sub13 local1908 = Static81.method1340(local30);
			if (local1908 != null && local1908.anIntArray327[local26] >= 100000) {
				local70 = Static80.method1334(new Class40[] { Static53.method859(local1908.anIntArray327[local26]), Static70.aClass40_496, local1556.aClass40_290 });
			} else if (local1556.aClass40_289 == null) {
				local70 = Static80.method1334(new Class40[] { Static42.aClass40_318, local1556.aClass40_290, Static41.aClass40_306 });
			} else {
				local70 = local1556.aClass40_289;
			}
			Static58.method989(0, Static61.aClass40_445, local70);
		}
		if (local12 == 1004) {
			Static42.method770(local30, local22, local26);
			Static80.aClass2_Sub3_Sub1_4.method1736(33);
			Static80.aClass2_Sub3_Sub1_4.method1707(local30 + Static30.anInt725);
			Static80.aClass2_Sub3_Sub1_4.method1711(Static87.anInt2058 + local26);
			Static80.aClass2_Sub3_Sub1_4.method1711(local22 >> 14 & 0x7FFF);
		}
		if (local12 == 10) {
			Static42.method770(local30, local22, local26);
			Static80.aClass2_Sub3_Sub1_4.method1736(3);
			Static80.aClass2_Sub3_Sub1_4.method1694(Static87.anInt2058 + local26);
			Static80.aClass2_Sub3_Sub1_4.method1707(Static30.anInt725 + local30);
			Static80.aClass2_Sub3_Sub1_4.method1720(local22 >> 14 & 0x7FFF);
		}
		if (local12 == 23) {
			Static80.aClass2_Sub3_Sub1_4.method1736(29);
			Static80.aClass2_Sub3_Sub1_4.method1720(local26);
			Static80.aClass2_Sub3_Sub1_4.method1694(local22);
			Static80.aClass2_Sub3_Sub1_4.method1697(local30);
			Static21.anInt481 = 2;
			Static52.anInt1171 = local30;
			Static82.anInt1947 = local26;
			if (Static22.anInt2585 == local30 >> 16) {
				Static21.anInt481 = 1;
			}
			Static29.anInt719 = 0;
			if (Static85.anInt1994 == local30 >> 16) {
				Static21.anInt481 = 3;
			}
		}
		if (local12 == 18 && !Static20.aBoolean40) {
			Static80.aClass2_Sub3_Sub1_4.method1736(11);
			Static20.aBoolean40 = true;
		}
		@Pc(2157) Class40 local2157;
		if (local12 == 21) {
			@Pc(2125) Class2_Sub2_Sub13 local2125 = Static81.method1340(local30);
			Static79.anInt1874 = 0;
			local70 = local2125.aClass40_471;
			Static33.aBoolean59 = true;
			Static85.anInt1992 = local30;
			Static86.anInt2027 = local2125.anInt1599;
			Static24.anInt641 = 1;
			if (local70.method1200(Static107.aClass40_716) != -1) {
				local70 = local70.method1180(local70.method1200(Static107.aClass40_716), 0);
			}
			local2157 = local2125.aClass40_471;
			if (local2157.method1200(Static107.aClass40_716) != -1) {
				local2157 = local2157.method1185(local2157.method1200(Static107.aClass40_716) + 1);
			}
			Static83.aClass40_567 = Static80.method1334(new Class40[] { local70, Static107.aClass40_716, local2125.aClass40_464, Static107.aClass40_716, local2157 });
			if (Static86.anInt2027 == 16) {
				Static33.aBoolean59 = true;
				Static62.anInt1551 = 3;
				Static22.aBoolean184 = true;
			}
			return;
		}
		if (local12 == 24) {
			if (Static97.aBoolean175) {
				Static93.aClass55_1.method1450(local26 - 4, local30 + -4);
			} else {
				Static93.aClass55_1.method1450(Static107.anInt2500 - 4, Static90.anInt2133 + -4);
			}
		}
		if (local12 == 13) {
			local1208 = Static83.method1349(local30, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 0, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 0, local26);
			if (!local1208) {
				Static83.method1349(local30, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local26);
			}
			Static45.anInt1096 = 2;
			Static102.anInt2465 = Static90.anInt2133;
			Static101.anInt2410 = 0;
			Static62.anInt1554 = Static107.anInt2500;
			Static80.aClass2_Sub3_Sub1_4.method1736(156);
			Static80.aClass2_Sub3_Sub1_4.method1711(local22);
			Static80.aClass2_Sub3_Sub1_4.method1694(Static87.anInt2058 + local26);
			Static80.aClass2_Sub3_Sub1_4.method1711(Static30.anInt725 + local30);
		}
		if (local12 == 6 && Static42.method770(local30, local22, local26)) {
			Static80.aClass2_Sub3_Sub1_4.method1736(116);
			Static80.aClass2_Sub3_Sub1_4.method1694(Static30.anInt725 + local30);
			Static80.aClass2_Sub3_Sub1_4.method1720(local26 + Static87.anInt2058);
			Static80.aClass2_Sub3_Sub1_4.method1720(local22 >> 14 & 0x7FFF);
			Static80.aClass2_Sub3_Sub1_4.method1722(Static85.anInt1992);
		}
		if (local12 == 29 || local12 == 37) {
			@Pc(2368) Class40 local2368 = Static18.aClass40Array8[arg0];
			@Pc(2373) int local2373 = local2368.method1200(Static32.aClass40_229);
			if (local2373 != -1) {
				local2368 = local2368.method1185(local2373 + 5).method1178();
				local2157 = local2368.method1175().method1167();
				@Pc(2394) boolean local2394 = false;
				for (local600 = 0; local600 < Static88.anInt2067; local600++) {
					@Pc(2404) Class2_Sub2_Sub12_Sub1_Sub1 local2404 = Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1[Static73.anIntArray408[local600]];
					if (local2404 != null && local2404.aClass40_395 != null && local2404.aClass40_395.method1199(local2157)) {
						local2394 = true;
						Static83.method1349(local2404.anIntArray496[0], 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local2404.anIntArray492[0]);
						if (local12 == 29) {
							Static80.aClass2_Sub3_Sub1_4.method1736(235);
							Static80.aClass2_Sub3_Sub1_4.method1711(Static73.anIntArray408[local600]);
						}
						if (local12 == 37) {
							Static80.aClass2_Sub3_Sub1_4.method1736(7);
							Static80.aClass2_Sub3_Sub1_4.method1707(Static73.anIntArray408[local600]);
						}
						break;
					}
				}
				if (!local2394) {
					Static58.method989(0, Static61.aClass40_445, Static80.method1334(new Class40[] { Static34.aClass40_246, local2157 }));
				}
			}
		}
		@Pc(2510) Class2_Sub2_Sub12_Sub1_Sub1 local2510;
		if (local12 == 30) {
			local2510 = Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local22];
			if (local2510 != null) {
				Static83.method1349(local2510.anIntArray496[0], 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local2510.anIntArray492[0]);
				Static45.anInt1096 = 2;
				Static102.anInt2465 = Static90.anInt2133;
				Static62.anInt1554 = Static107.anInt2500;
				Static101.anInt2410 = 0;
				Static80.aClass2_Sub3_Sub1_4.method1736(36);
				Static80.aClass2_Sub3_Sub1_4.method1707(local22);
			}
		}
		if (local12 == 9 && Static42.method770(local30, local22, local26)) {
			Static80.aClass2_Sub3_Sub1_4.method1736(44);
			Static80.aClass2_Sub3_Sub1_4.method1707(Static99.anInt96);
			Static80.aClass2_Sub3_Sub1_4.method1720(local22 >> 14 & 0x7FFF);
			Static80.aClass2_Sub3_Sub1_4.method1694(Static30.anInt724);
			Static80.aClass2_Sub3_Sub1_4.method1694(local30 + Static30.anInt725);
			Static80.aClass2_Sub3_Sub1_4.method1686(Static105.anInt2526);
			Static80.aClass2_Sub3_Sub1_4.method1707(local26 + Static87.anInt2058);
		}
		if (local12 == 27) {
			Static80.aClass2_Sub3_Sub1_4.method1736(228);
			Static80.aClass2_Sub3_Sub1_4.method1686(local30);
			Static80.aClass2_Sub3_Sub1_4.method1707(local26);
			Static80.aClass2_Sub3_Sub1_4.method1694(local22);
			Static52.anInt1171 = local30;
			Static21.anInt481 = 2;
			Static29.anInt719 = 0;
			if (local30 >> 16 == Static22.anInt2585) {
				Static21.anInt481 = 1;
			}
			Static82.anInt1947 = local26;
			if (Static85.anInt1994 == local30 >> 16) {
				Static21.anInt481 = 3;
			}
		}
		if (local12 == 38) {
			local2510 = Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local22];
			if (local2510 != null) {
				Static83.method1349(local2510.anIntArray496[0], 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local2510.anIntArray492[0]);
				Static45.anInt1096 = 2;
				Static101.anInt2410 = 0;
				Static62.anInt1554 = Static107.anInt2500;
				Static102.anInt2465 = Static90.anInt2133;
				Static80.aClass2_Sub3_Sub1_4.method1736(235);
				Static80.aClass2_Sub3_Sub1_4.method1711(local22);
			}
		}
		if (local12 == 19) {
			Static80.aClass2_Sub3_Sub1_4.method1736(142);
			Static80.aClass2_Sub3_Sub1_4.method1711(local26);
			Static80.aClass2_Sub3_Sub1_4.method1711(Static99.anInt96);
			Static80.aClass2_Sub3_Sub1_4.method1711(local22);
			Static80.aClass2_Sub3_Sub1_4.method1707(Static30.anInt724);
			Static80.aClass2_Sub3_Sub1_4.method1686(local30);
			Static80.aClass2_Sub3_Sub1_4.method1686(Static105.anInt2526);
			Static52.anInt1171 = local30;
			Static21.anInt481 = 2;
			if (local30 >> 16 == Static22.anInt2585) {
				Static21.anInt481 = 1;
			}
			Static82.anInt1947 = local26;
			if (local30 >> 16 == Static85.anInt1994) {
				Static21.anInt481 = 3;
			}
			Static29.anInt719 = 0;
		}
		if (local12 == 36) {
			local2510 = Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local22];
			if (local2510 != null) {
				Static83.method1349(local2510.anIntArray496[0], 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local2510.anIntArray492[0]);
				Static101.anInt2410 = 0;
				Static45.anInt1096 = 2;
				Static102.anInt2465 = Static90.anInt2133;
				Static62.anInt1554 = Static107.anInt2500;
				Static80.aClass2_Sub3_Sub1_4.method1736(147);
				Static80.aClass2_Sub3_Sub1_4.method1722(Static85.anInt1992);
				Static80.aClass2_Sub3_Sub1_4.method1694(local22);
			}
		}
		if (local12 == 48) {
			local1208 = Static83.method1349(local30, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 0, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 0, local26);
			if (!local1208) {
				Static83.method1349(local30, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local26);
			}
			Static102.anInt2465 = Static90.anInt2133;
			Static45.anInt1096 = 2;
			Static62.anInt1554 = Static107.anInt2500;
			Static101.anInt2410 = 0;
			Static80.aClass2_Sub3_Sub1_4.method1736(108);
			Static80.aClass2_Sub3_Sub1_4.method1707(Static87.anInt2058 + local26);
			Static80.aClass2_Sub3_Sub1_4.method1722(Static85.anInt1992);
			Static80.aClass2_Sub3_Sub1_4.method1694(local22);
			Static80.aClass2_Sub3_Sub1_4.method1720(local30 + Static30.anInt725);
		}
		if (local12 == 50) {
			local1208 = Static83.method1349(local30, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 0, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 0, local26);
			if (!local1208) {
				Static83.method1349(local30, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local26);
			}
			Static62.anInt1554 = Static107.anInt2500;
			Static102.anInt2465 = Static90.anInt2133;
			Static45.anInt1096 = 2;
			Static101.anInt2410 = 0;
			Static80.aClass2_Sub3_Sub1_4.method1736(202);
			Static80.aClass2_Sub3_Sub1_4.method1694(local30 + Static30.anInt725);
			Static80.aClass2_Sub3_Sub1_4.method1711(local22);
			Static80.aClass2_Sub3_Sub1_4.method1707(Static87.anInt2058 + local26);
		}
		if (local12 == 7) {
			local1295 = Static2.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local22];
			if (local1295 != null) {
				Static83.method1349(local1295.anIntArray496[0], 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local1295.anIntArray492[0]);
				Static62.anInt1554 = Static107.anInt2500;
				Static45.anInt1096 = 2;
				Static101.anInt2410 = 0;
				Static102.anInt2465 = Static90.anInt2133;
				Static80.aClass2_Sub3_Sub1_4.method1736(4);
				Static80.aClass2_Sub3_Sub1_4.method1694(local22);
				Static80.aClass2_Sub3_Sub1_4.method1694(Static30.anInt724);
				Static80.aClass2_Sub3_Sub1_4.method1725(Static105.anInt2526);
				Static80.aClass2_Sub3_Sub1_4.method1720(Static99.anInt96);
			}
		}
		if (local12 == 43) {
			local2510 = Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local22];
			if (local2510 != null) {
				Static83.method1349(local2510.anIntArray496[0], 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local2510.anIntArray492[0]);
				Static45.anInt1096 = 2;
				Static102.anInt2465 = Static90.anInt2133;
				Static62.anInt1554 = Static107.anInt2500;
				Static101.anInt2410 = 0;
				Static80.aClass2_Sub3_Sub1_4.method1736(190);
				Static80.aClass2_Sub3_Sub1_4.method1707(local22);
			}
		}
		if (local12 == 5) {
			Static42.method770(local30, local22, local26);
			Static80.aClass2_Sub3_Sub1_4.method1736(139);
			Static80.aClass2_Sub3_Sub1_4.method1720(local30 + Static30.anInt725);
			Static80.aClass2_Sub3_Sub1_4.method1707(local26 + Static87.anInt2058);
			Static80.aClass2_Sub3_Sub1_4.method1711(local22 >> 14 & 0x7FFF);
		}
		if (local12 == 25) {
			local2510 = Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local22];
			if (local2510 != null) {
				Static83.method1349(local2510.anIntArray496[0], 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local2510.anIntArray492[0]);
				Static45.anInt1096 = 2;
				Static101.anInt2410 = 0;
				Static102.anInt2465 = Static90.anInt2133;
				Static62.anInt1554 = Static107.anInt2500;
				Static80.aClass2_Sub3_Sub1_4.method1736(214);
				Static80.aClass2_Sub3_Sub1_4.method1707(Static99.anInt96);
				Static80.aClass2_Sub3_Sub1_4.method1686(Static105.anInt2526);
				Static80.aClass2_Sub3_Sub1_4.method1694(Static30.anInt724);
				Static80.aClass2_Sub3_Sub1_4.method1720(local22);
			}
		}
		if (Static79.anInt1874 != 0) {
			Static33.aBoolean59 = true;
			Static79.anInt1874 = 0;
		}
		if (Static24.anInt641 != 0) {
			Static33.aBoolean59 = true;
			Static24.anInt641 = 0;
		}
	}

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "(I)V")
	public static void method1550() {
		if (Static31.aClass25_48 != null) {
			Static31.aClass25_48.method730();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!ud;ILclient!ud;Lclient!ud;)V")
	public static void method1551(@OriginalArg(0) Class5 arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) Class5 arg2) {
		Static74.aClass5_24 = arg2;
		Static37.aClass5_12 = arg1;
		Static85.aClass5_27 = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(IB)V")
	public static void method1552(@OriginalArg(0) int arg0) {
		if (arg0 == -3) {
			Static49.method1537(Static15.aClass40_537, Static86.aClass40_586);
		} else if (arg0 == -2) {
			Static49.method1537(Static61.aClass40_445, Static85.aClass40_573);
		} else if (arg0 == -1) {
			Static49.method1537(Static23.aClass40_157, Static86.aClass40_586);
		} else if (arg0 == 3) {
			Static49.method1537(Static61.aClass40_445, Static17.aClass40_117);
		} else if (arg0 == 4) {
			Static49.method1537(Static2.aClass40_15, Static67.aClass40_488);
		} else if (arg0 == 5) {
			Static49.method1537(Static31.aClass40_732, Static58.aClass40_427);
		} else if (arg0 == 6) {
			Static49.method1537(Static86.aClass40_588, Static25.aClass40_192);
		} else if (arg0 == 7) {
			Static49.method1537(Static21.aClass40_141, Static84.aClass40_570);
		} else if (arg0 == 8) {
			Static49.method1537(Static55.aClass40_410, Static75.aClass40_529);
		} else if (arg0 == 9) {
			Static49.method1537(Static95.aClass40_645, Static90.aClass40_608);
		} else if (arg0 == 10) {
			Static49.method1537(Static55.aClass40_410, Static102.aClass40_713);
		} else if (arg0 == 11) {
			Static49.method1537(Static45.aClass40_341, Static45.aClass40_336);
		} else if (arg0 == 12) {
			Static49.method1537(Static56.aClass40_656, Static94.aClass40_631);
		} else if (arg0 == 13) {
			Static49.method1537(Static14.aClass40_84, Static86.aClass40_586);
		} else if (arg0 == 14) {
			Static49.method1537(Static106.aClass40_742, Static73.aClass40_518);
		} else if (arg0 == 16) {
			Static49.method1537(Static85.aClass40_575, Static73.aClass40_518);
		} else if (arg0 == 17) {
			Static49.method1537(Static76.aClass40_615, Static45.aClass40_338);
		} else if (arg0 == 18) {
			Static49.method1537(Static55.aClass40_406, Static88.aClass40_603);
		} else if (arg0 == 20) {
			Static49.method1537(Static100.aClass40_688, Static86.aClass40_586);
		} else if (arg0 == 22) {
			Static49.method1537(Static36.aClass40_257, Static53.aClass40_366);
		} else if (arg0 == 23) {
			Static49.method1537(Static23.aClass40_162, Static73.aClass40_518);
		} else if (arg0 == 24) {
			Static49.method1537(Static81.aClass40_559, Static90.aClass40_611);
		} else if (arg0 == 25) {
			Static49.method1537(Static56.aClass40_658, Static86.aClass40_586);
		} else if (arg0 == 26) {
			Static49.method1537(Static68.aClass40_104, aClass40_662);
		} else {
			Static49.method1537(Static80.method1334(new Class40[] { Static86.aClass40_585, Static53.method859(arg0) }), Static86.aClass40_586);
		}
		Static7.method187(10);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLclient!ke;)V")
	public static void method1553(@OriginalArg(1) Class2_Sub2_Sub12_Sub1 arg0) {
		arg0.aBoolean172 = false;
		@Pc(15) Class2_Sub2_Sub6 local15;
		if (arg0.anInt2318 != -1) {
			local15 = Static62.method1042(arg0.anInt2318);
			arg0.anInt2296++;
			if (arg0.anInt2295 < local15.anIntArray124.length && arg0.anInt2296 > local15.anIntArray128[arg0.anInt2295]) {
				arg0.anInt2295++;
				arg0.anInt2296 = 1;
			}
			if (arg0.anInt2295 >= local15.anIntArray124.length) {
				arg0.anInt2296 = 0;
				arg0.anInt2295 = 0;
			}
		}
		if (arg0.anInt2302 != -1 && arg0.anInt2320 <= Static107.anInt2511) {
			if (arg0.anInt2291 < 0) {
				arg0.anInt2291 = 0;
			}
			@Pc(81) int local81 = Static5.method116(arg0.anInt2302).anInt640;
			if (local81 == -1) {
				arg0.anInt2302 = -1;
			} else {
				@Pc(89) Class2_Sub2_Sub6 local89 = Static62.method1042(local81);
				arg0.anInt2268++;
				if (arg0.anInt2291 < local89.anIntArray124.length && arg0.anInt2268 > local89.anIntArray128[arg0.anInt2291]) {
					arg0.anInt2268 = 1;
					arg0.anInt2291++;
				}
				if (local89.anIntArray124.length <= arg0.anInt2291 && (arg0.anInt2291 < 0 || arg0.anInt2291 >= local89.anIntArray124.length)) {
					arg0.anInt2302 = -1;
				}
			}
		}
		if (arg0.anInt2307 != -1 && arg0.anInt2313 <= 1) {
			local15 = Static62.method1042(arg0.anInt2307);
			if (local15.anInt663 == 1 && arg0.anInt2281 > 0 && arg0.anInt2277 <= Static107.anInt2511 && arg0.anInt2297 < Static107.anInt2511) {
				arg0.anInt2313 = 1;
				return;
			}
		}
		if (arg0.anInt2307 != -1 && arg0.anInt2313 == 0) {
			local15 = Static62.method1042(arg0.anInt2307);
			arg0.anInt2267++;
			if (local15.anIntArray124.length > arg0.anInt2316 && arg0.anInt2267 > local15.anIntArray128[arg0.anInt2316]) {
				arg0.anInt2316++;
				arg0.anInt2267 = 1;
			}
			if (arg0.anInt2316 >= local15.anIntArray124.length) {
				arg0.anInt2316 -= local15.anInt669;
				arg0.anInt2300++;
				if (local15.anInt660 <= arg0.anInt2300) {
					arg0.anInt2307 = -1;
				}
				if (arg0.anInt2316 < 0 || arg0.anInt2316 >= local15.anIntArray124.length) {
					arg0.anInt2307 = -1;
				}
			}
			arg0.aBoolean172 = local15.aBoolean50;
		}
		if (arg0.anInt2313 > 0) {
			arg0.anInt2313--;
		}
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(Z)V")
	public static void method1554() {
		aClass40_661 = null;
		aClass40_663 = null;
		aClass40_662 = null;
		anIntArray497 = null;
		aClass44_8 = null;
		aClass2_Sub2_Sub2_Sub4_9 = null;
	}

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "(I)[Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3[] method1555() {
		@Pc(4) Class2_Sub2_Sub2_Sub3[] local4 = new Class2_Sub2_Sub2_Sub3[Static30.anInt727];
		for (@Pc(10) int local10 = 0; local10 < Static30.anInt727; local10++) {
			@Pc(20) Class2_Sub2_Sub2_Sub3 local20 = local4[local10] = new Class2_Sub2_Sub2_Sub3();
			local20.anInt1908 = Static104.anInt2513;
			local20.anInt1909 = Static44.anInt1079;
			local20.anInt1907 = Static83.anIntArray430[local10];
			local20.anInt1906 = Static97.anIntArray503[local10];
			local20.anInt1905 = Static66.anIntArray338[local10];
			local20.anInt1910 = Static19.anIntArray86[local10];
			local20.anIntArray427 = Static20.anIntArray92;
			local20.aByteArray16 = Static91.aByteArrayArray10[local10];
		}
		Static93.method1485();
		return local4;
	}
}
