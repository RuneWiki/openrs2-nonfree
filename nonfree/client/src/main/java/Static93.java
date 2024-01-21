import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!sa", name = "ab", descriptor = "Lclient!da;")
	public static Class15 aClass15_64;

	@OriginalMember(owner = "client!sa", name = "kb", descriptor = "Lclient!da;")
	public static Class15 aClass15_65;

	@OriginalMember(owner = "client!sa", name = "qb", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_19;

	@OriginalMember(owner = "client!sa", name = "sb", descriptor = "[I")
	public static int[] anIntArray387;

	@OriginalMember(owner = "client!sa", name = "ub", descriptor = "Lclient!fe;")
	public static Class2_Sub8 aClass2_Sub8_5;

	@OriginalMember(owner = "client!sa", name = "zb", descriptor = "[I")
	public static int[] anIntArray388;

	@OriginalMember(owner = "client!sa", name = "Ab", descriptor = "I")
	public static int anInt2623;

	@OriginalMember(owner = "client!sa", name = "bb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1177 = Static24.method441("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!sa", name = "hb", descriptor = "I")
	public static int anInt2615 = 0;

	@OriginalMember(owner = "client!sa", name = "gc", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1183 = Static24.method441("Close");

	@OriginalMember(owner = "client!sa", name = "tb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1178 = aClass65_1183;

	@OriginalMember(owner = "client!sa", name = "Wb", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1181 = Static24.method441("Service unavailable)3");

	@OriginalMember(owner = "client!sa", name = "Bb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1179 = aClass65_1181;

	@OriginalMember(owner = "client!sa", name = "Hb", descriptor = "I")
	public static int anInt2629 = 0;

	@OriginalMember(owner = "client!sa", name = "Sb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1180 = Static24.method441("Nehmen");

	@OriginalMember(owner = "client!sa", name = "ac", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1182 = null;

	@OriginalMember(owner = "client!sa", name = "rc", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1185 = Static24.method441("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(B)V")
	public static void method1607() {
		@Pc(5) Class19 local5 = Static108.aClass19_1;
		synchronized (Static108.aClass19_1) {
			Static8.anInt304 = Static46.anInt1371;
			Static16.anInt480 = Static36.anInt1208;
			Static85.anInt2459 = Static98.anInt2772;
			Static101.anInt2793 = Static21.anInt2498;
			Static89.anInt2559 = Static68.anInt2046;
			Static32.anInt1044 = Static5.anInt247;
			Static4.aLong7 = Static62.aLong53;
			Static21.anInt2498 = 0;
		}
	}

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "(I)V")
	public static void method1610() {
		aClass65_1183 = null;
		aClass65_1182 = null;
		aClass65_1180 = null;
		aClass2_Sub8_5 = null;
		aClass15_65 = null;
		aClass15_64 = null;
		aClass65_1181 = null;
		aClass65_1178 = null;
		aClass65_1177 = null;
		aClass65_1179 = null;
		aClass65_1185 = null;
		anIntArray388 = null;
		aClass2_Sub1_Sub4_Sub3_19 = null;
		anIntArray387 = null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZI)V")
	public static void method1614(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(15) int local15 = Static12.anIntArray70[arg0];
		@Pc(19) int local19 = Static3.anIntArray20[arg0];
		@Pc(23) int local23 = Static41.anIntArray171[arg0];
		if (local19 >= 2000) {
			local19 -= 2000;
		}
		@Pc(33) int local33 = Static84.anIntArray313[arg0];
		if (Static55.anInt1673 != 0 && local19 != 1004) {
			Static107.aBoolean156 = true;
			Static55.anInt1673 = 0;
		}
		if (local19 == 1003) {
			Static85.anInt2457 = 2;
			Static83.anInt2381 = 0;
			Static19.anInt1890 = Static32.anInt1044;
			Static71.anInt2166 = Static89.anInt2559;
			Static12.aClass2_Sub8_Sub1_8.method1425(105);
			Static12.aClass2_Sub8_Sub1_8.method1374(local33 >> 14 & 0x7FFF);
		}
		if (local19 == 18) {
			Static12.aClass2_Sub8_Sub1_8.method1425(155);
			Static12.aClass2_Sub8_Sub1_8.method1416(local15);
			Static12.aClass2_Sub8_Sub1_8.method1416(local33);
			Static12.aClass2_Sub8_Sub1_8.method1370(local23);
			Static1.anInt3 = 2;
			Static16.anInt497 = local23;
			Static46.anInt1372 = local15;
			if (local23 >> 16 == Static98.anInt2770) {
				Static1.anInt3 = 1;
			}
			Static35.anInt1204 = 0;
			if (Static21.anInt2494 == local23 >> 16) {
				Static1.anInt3 = 3;
			}
		}
		if (local19 == 37) {
			Static7.anInt294 = local33;
			Static80.anInt2291 = 1;
			Static76.anInt2216 = local15;
			Static79.anInt2279 = local23;
			Static99.aClass65_1144 = Static13.method282(new Class65[] { Static42.aClass65_597, Static70.method1263(local33).aClass65_820, Static68.aClass65_948 });
			Static19.aBoolean99 = true;
			Static37.anInt1224 = 0;
			if (Static99.aClass65_1144 == null) {
				Static99.aClass65_1144 = Static63.aClass65_857;
			}
			return;
		}
		@Pc(170) Class2_Sub1_Sub1_Sub2_Sub2 local170;
		if (local19 == 26) {
			local170 = Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local33];
			if (local170 != null) {
				Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 1, 1, 0, 2, 0, false, local170.anIntArray209[0], Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local170.anIntArray208[0]);
				Static19.anInt1890 = Static32.anInt1044;
				Static85.anInt2457 = 2;
				Static83.anInt2381 = 0;
				Static71.anInt2166 = Static89.anInt2559;
				Static12.aClass2_Sub8_Sub1_8.method1425(136);
				Static12.aClass2_Sub8_Sub1_8.method1398(local33);
			}
		}
		if (local19 == 2) {
			Static12.aClass2_Sub8_Sub1_8.method1425(244);
			Static12.aClass2_Sub8_Sub1_8.method1416(local15);
			Static12.aClass2_Sub8_Sub1_8.method1392(local33);
			Static12.aClass2_Sub8_Sub1_8.method1385(local23);
			Static46.anInt1372 = local15;
			Static1.anInt3 = 2;
			Static35.anInt1204 = 0;
			if (Static98.anInt2770 == local23 >> 16) {
				Static1.anInt3 = 1;
			}
			if (Static21.anInt2494 == local23 >> 16) {
				Static1.anInt3 = 3;
			}
			Static16.anInt497 = local23;
		}
		@Pc(304) int local304;
		@Pc(284) Class2_Sub1_Sub2 local284;
		if (local19 == 33) {
			Static12.aClass2_Sub8_Sub1_8.method1425(133);
			Static12.aClass2_Sub8_Sub1_8.method1370(local23);
			local284 = Static28.method503(local23);
			if (local284.anIntArrayArray2 != null && local284.anIntArrayArray2[0][0] == 5) {
				local304 = local284.anIntArrayArray2[0][1];
				if (Static26.anIntArray416[local304] != local284.anIntArray25[0]) {
					Static26.anIntArray416[local304] = local284.anIntArray25[0];
					Static98.method1698(local304);
					Static19.aBoolean99 = true;
				}
			}
		}
		if (local19 == 19) {
			Static12.aClass2_Sub8_Sub1_8.method1425(6);
			Static12.aClass2_Sub8_Sub1_8.method1374(Static7.anInt294);
			Static12.aClass2_Sub8_Sub1_8.method1370(Static79.anInt2279);
			Static12.aClass2_Sub8_Sub1_8.method1416(local33);
			Static12.aClass2_Sub8_Sub1_8.method1398(Static76.anInt2216);
			Static12.aClass2_Sub8_Sub1_8.method1390(local23);
			Static12.aClass2_Sub8_Sub1_8.method1374(local15);
			Static35.anInt1204 = 0;
			Static46.anInt1372 = local15;
			Static16.anInt497 = local23;
			Static1.anInt3 = 2;
			if (Static98.anInt2770 == local23 >> 16) {
				Static1.anInt3 = 1;
			}
			if (local23 >> 16 == Static21.anInt2494) {
				Static1.anInt3 = 3;
			}
		}
		if (local19 == 17) {
			Static12.aClass2_Sub8_Sub1_8.method1425(9);
			Static12.aClass2_Sub8_Sub1_8.method1390(local23);
			Static12.aClass2_Sub8_Sub1_8.method1398(local15);
			Static12.aClass2_Sub8_Sub1_8.method1374(local33);
			Static35.anInt1204 = 0;
			Static46.anInt1372 = local15;
			Static1.anInt3 = 2;
			Static16.anInt497 = local23;
			if (Static98.anInt2770 == local23 >> 16) {
				Static1.anInt3 = 1;
			}
			if (local23 >> 16 == Static21.anInt2494) {
				Static1.anInt3 = 3;
			}
		}
		if (local19 == 45) {
			local170 = Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local33];
			if (local170 != null) {
				Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 1, 1, 0, 2, 0, false, local170.anIntArray209[0], Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local170.anIntArray208[0]);
				Static71.anInt2166 = Static89.anInt2559;
				Static83.anInt2381 = 0;
				Static85.anInt2457 = 2;
				Static19.anInt1890 = Static32.anInt1044;
				Static12.aClass2_Sub8_Sub1_8.method1425(239);
				Static12.aClass2_Sub8_Sub1_8.method1416(local33);
			}
		}
		@Pc(532) boolean local532;
		if (local19 == 47) {
			local532 = Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 0, 0, 0, 2, 0, false, local15, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local23);
			if (!local532) {
				Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 1, 1, 0, 2, 0, false, local15, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local23);
			}
			Static19.anInt1890 = Static32.anInt1044;
			Static83.anInt2381 = 0;
			Static85.anInt2457 = 2;
			Static71.anInt2166 = Static89.anInt2559;
			Static12.aClass2_Sub8_Sub1_8.method1425(22);
			Static12.aClass2_Sub8_Sub1_8.method1374(local23 + Static37.anInt1220);
			Static12.aClass2_Sub8_Sub1_8.method1392(local33);
			Static12.aClass2_Sub8_Sub1_8.method1416(Static107.anInt2849 + local15);
		}
		if (local19 == 50) {
			Static12.aClass2_Sub8_Sub1_8.method1425(180);
			Static12.aClass2_Sub8_Sub1_8.method1416(local33);
			Static12.aClass2_Sub8_Sub1_8.method1392(local15);
			Static12.aClass2_Sub8_Sub1_8.method1379(local23);
			Static1.anInt3 = 2;
			Static16.anInt497 = local23;
			Static46.anInt1372 = local15;
			if (Static98.anInt2770 == local23 >> 16) {
				Static1.anInt3 = 1;
			}
			Static35.anInt1204 = 0;
			if (local23 >> 16 == Static21.anInt2494) {
				Static1.anInt3 = 3;
			}
		}
		if (local19 == 3) {
			Static5.method122(local33, local15, local23);
			Static12.aClass2_Sub8_Sub1_8.method1425(29);
			Static12.aClass2_Sub8_Sub1_8.method1392(Static107.anInt2849 + local15);
			Static12.aClass2_Sub8_Sub1_8.method1416(Static37.anInt1220 + local23);
			Static12.aClass2_Sub8_Sub1_8.method1374(local33 >> 14 & 0x7FFF);
		}
		if (local19 == 54) {
			Static98.method1695(Static5.anInt237);
			Static5.anInt237 = -1;
			Static107.aBoolean156 = true;
		}
		if (local19 == 6) {
			local170 = Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local33];
			if (local170 != null) {
				Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 1, 1, 0, 2, 0, false, local170.anIntArray209[0], Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local170.anIntArray208[0]);
				Static19.anInt1890 = Static32.anInt1044;
				Static83.anInt2381 = 0;
				Static71.anInt2166 = Static89.anInt2559;
				Static85.anInt2457 = 2;
				Static12.aClass2_Sub8_Sub1_8.method1425(252);
				Static12.aClass2_Sub8_Sub1_8.method1374(local33);
			}
		}
		if (local19 == 12) {
			local170 = Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local33];
			if (local170 != null) {
				Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 1, 1, 0, 2, 0, false, local170.anIntArray209[0], Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local170.anIntArray208[0]);
				Static19.anInt1890 = Static32.anInt1044;
				Static85.anInt2457 = 2;
				Static83.anInt2381 = 0;
				Static71.anInt2166 = Static89.anInt2559;
				Static12.aClass2_Sub8_Sub1_8.method1425(31);
				Static12.aClass2_Sub8_Sub1_8.method1416(local33);
			}
		}
		if (local19 == 29) {
			Static12.aClass2_Sub8_Sub1_8.method1425(133);
			Static12.aClass2_Sub8_Sub1_8.method1370(local23);
			local284 = Static28.method503(local23);
			if (local284.anIntArrayArray2 != null && local284.anIntArrayArray2[0][0] == 5) {
				local304 = local284.anIntArrayArray2[0][1];
				Static26.anIntArray416[local304] = 1 - Static26.anIntArray416[local304];
				Static98.method1698(local304);
				Static19.aBoolean99 = true;
			}
		}
		if (local19 == 39) {
			Static5.method122(local33, local15, local23);
			Static12.aClass2_Sub8_Sub1_8.method1425(8);
			Static12.aClass2_Sub8_Sub1_8.method1398(Static37.anInt1220 + local23);
			Static12.aClass2_Sub8_Sub1_8.method1374(local15 + Static107.anInt2849);
			Static12.aClass2_Sub8_Sub1_8.method1392(local33 >> 14 & 0x7FFF);
		}
		if (local19 == 55) {
			local170 = Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local33];
			if (local170 != null) {
				Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 1, 1, 0, 2, 0, false, local170.anIntArray209[0], Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local170.anIntArray208[0]);
				Static71.anInt2166 = Static89.anInt2559;
				Static85.anInt2457 = 2;
				Static19.anInt1890 = Static32.anInt1044;
				Static83.anInt2381 = 0;
				Static12.aClass2_Sub8_Sub1_8.method1425(27);
				Static12.aClass2_Sub8_Sub1_8.method1370(Static52.anInt1594);
				Static12.aClass2_Sub8_Sub1_8.method1398(local33);
			}
		}
		if (local19 == 46) {
			local532 = Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 0, 0, 0, 2, 0, false, local15, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local23);
			if (!local532) {
				Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 1, 1, 0, 2, 0, false, local15, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local23);
			}
			Static83.anInt2381 = 0;
			Static71.anInt2166 = Static89.anInt2559;
			Static19.anInt1890 = Static32.anInt1044;
			Static85.anInt2457 = 2;
			Static12.aClass2_Sub8_Sub1_8.method1425(250);
			Static12.aClass2_Sub8_Sub1_8.method1392(local33);
			Static12.aClass2_Sub8_Sub1_8.method1398(local15 + Static107.anInt2849);
			Static12.aClass2_Sub8_Sub1_8.method1398(Static37.anInt1220 + local23);
		}
		if (local19 == 1005) {
			Static5.method122(local33, local15, local23);
			Static12.aClass2_Sub8_Sub1_8.method1425(49);
			Static12.aClass2_Sub8_Sub1_8.method1398(local33 >> 14 & 0x7FFF);
			Static12.aClass2_Sub8_Sub1_8.method1416(local15 + Static107.anInt2849);
			Static12.aClass2_Sub8_Sub1_8.method1416(Static37.anInt1220 + local23);
		}
		@Pc(1078) Class2_Sub1_Sub1_Sub2_Sub1 local1078;
		if (local19 == 32) {
			local1078 = Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local33];
			if (local1078 != null) {
				Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 1, 1, 0, 2, 0, false, local1078.anIntArray209[0], Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local1078.anIntArray208[0]);
				Static19.anInt1890 = Static32.anInt1044;
				Static85.anInt2457 = 2;
				Static71.anInt2166 = Static89.anInt2559;
				Static83.anInt2381 = 0;
				Static12.aClass2_Sub8_Sub1_8.method1425(175);
				Static12.aClass2_Sub8_Sub1_8.method1392(local33);
			}
		}
		@Pc(1135) Class65 local1135;
		if (local19 == 35) {
			local1135 = Static89.aClass65Array12[arg0];
			local304 = local1135.method1775(Static68.aClass65_948);
			if (local304 != -1) {
				if (Static98.anInt2770 == -1) {
					Static19.method1106();
					if (Static84.anInt2416 != -1) {
						Static8.aClass65_142 = local1135.method1779(local304 + 5).method1769();
						Static17.aBoolean39 = false;
						Static99.anInt2544 = Static98.anInt2770 = Static84.anInt2416;
					}
				} else {
					Static36.method742(Static8.aClass65_145, Static33.aClass65_1055, 0);
				}
			}
		}
		if (local19 == 7) {
			local1078 = Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local33];
			if (local1078 != null) {
				Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 1, 1, 0, 2, 0, false, local1078.anIntArray209[0], Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local1078.anIntArray208[0]);
				Static71.anInt2166 = Static89.anInt2559;
				Static85.anInt2457 = 2;
				Static83.anInt2381 = 0;
				Static19.anInt1890 = Static32.anInt1044;
				Static12.aClass2_Sub8_Sub1_8.method1425(226);
				Static12.aClass2_Sub8_Sub1_8.method1398(local33);
			}
		}
		if (local19 == 20) {
			local284 = Static28.method503(local23);
			Static52.anInt1594 = local23;
			Static19.aBoolean99 = true;
			Static39.anInt1259 = local284.anInt198;
			Static80.aClass65_1042 = local284.aClass65_84;
			Static37.anInt1224 = 1;
			Static80.anInt2291 = 0;
			Static29.aClass65_387 = Static13.method282(new Class65[] { Static47.aClass65_621, local284.aClass65_85, Static68.aClass65_948 });
			if (Static39.anInt1259 == 16) {
				Static37.anInt1223 = 3;
				Static22.aBoolean46 = true;
				Static19.aBoolean99 = true;
			}
			return;
		}
		if (local19 == 53) {
			local1078 = Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local33];
			if (local1078 != null) {
				Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 1, 1, 0, 2, 0, false, local1078.anIntArray209[0], Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local1078.anIntArray208[0]);
				Static19.anInt1890 = Static32.anInt1044;
				Static71.anInt2166 = Static89.anInt2559;
				Static85.anInt2457 = 2;
				Static83.anInt2381 = 0;
				Static12.aClass2_Sub8_Sub1_8.method1425(66);
				Static12.aClass2_Sub8_Sub1_8.method1374(local33);
			}
		}
		if (local19 == 9) {
			local532 = Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 0, 0, 0, 2, 0, false, local15, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local23);
			if (!local532) {
				Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 1, 1, 0, 2, 0, false, local15, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local23);
			}
			Static71.anInt2166 = Static89.anInt2559;
			Static83.anInt2381 = 0;
			Static19.anInt1890 = Static32.anInt1044;
			Static85.anInt2457 = 2;
			Static12.aClass2_Sub8_Sub1_8.method1425(232);
			Static12.aClass2_Sub8_Sub1_8.method1416(Static107.anInt2849 + local15);
			Static12.aClass2_Sub8_Sub1_8.method1416(local23 + Static37.anInt1220);
			Static12.aClass2_Sub8_Sub1_8.method1374(local33);
		}
		if (local19 == 13 && Static5.method122(local33, local15, local23)) {
			Static12.aClass2_Sub8_Sub1_8.method1425(165);
			Static12.aClass2_Sub8_Sub1_8.method1374(local23 + Static37.anInt1220);
			Static12.aClass2_Sub8_Sub1_8.method1416(Static76.anInt2216);
			Static12.aClass2_Sub8_Sub1_8.method1398(Static107.anInt2849 + local15);
			Static12.aClass2_Sub8_Sub1_8.method1392(local33 >> 14 & 0x7FFF);
			Static12.aClass2_Sub8_Sub1_8.method1374(Static7.anInt294);
			Static12.aClass2_Sub8_Sub1_8.method1370(Static79.anInt2279);
		}
		if (local19 == 5) {
			Static12.aClass2_Sub8_Sub1_8.method1425(230);
			Static12.aClass2_Sub8_Sub1_8.method1392(local33);
			Static12.aClass2_Sub8_Sub1_8.method1379(local23);
			Static12.aClass2_Sub8_Sub1_8.method1398(local15);
			Static16.anInt497 = local23;
			Static35.anInt1204 = 0;
			Static1.anInt3 = 2;
			if (Static98.anInt2770 == local23 >> 16) {
				Static1.anInt3 = 1;
			}
			if (Static21.anInt2494 == local23 >> 16) {
				Static1.anInt3 = 3;
			}
			Static46.anInt1372 = local15;
		}
		if (local19 == 30) {
			local170 = Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local33];
			if (local170 != null) {
				Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 1, 1, 0, 2, 0, false, local170.anIntArray209[0], Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local170.anIntArray208[0]);
				Static85.anInt2457 = 2;
				Static19.anInt1890 = Static32.anInt1044;
				Static71.anInt2166 = Static89.anInt2559;
				Static83.anInt2381 = 0;
				Static12.aClass2_Sub8_Sub1_8.method1425(143);
				Static12.aClass2_Sub8_Sub1_8.method1416(local33);
			}
		}
		if (local19 == 1) {
			Static5.method122(local33, local15, local23);
			Static12.aClass2_Sub8_Sub1_8.method1425(65);
			Static12.aClass2_Sub8_Sub1_8.method1392(local33 >> 14 & 0x7FFF);
			Static12.aClass2_Sub8_Sub1_8.method1398(Static107.anInt2849 + local15);
			Static12.aClass2_Sub8_Sub1_8.method1374(local23 + Static37.anInt1220);
		}
		if (local19 == 22) {
			local284 = Static28.method503(local23);
			@Pc(1624) boolean local1624 = true;
			if (local284.anInt180 > 0) {
				local1624 = Static62.method1097(local284);
			}
			if (local1624) {
				Static12.aClass2_Sub8_Sub1_8.method1425(133);
				Static12.aClass2_Sub8_Sub1_8.method1370(local23);
			}
		}
		if (local19 == 1001) {
			Static71.anInt2166 = Static89.anInt2559;
			Static19.anInt1890 = Static32.anInt1044;
			Static83.anInt2381 = 0;
			Static85.anInt2457 = 2;
			Static12.aClass2_Sub8_Sub1_8.method1425(110);
			Static12.aClass2_Sub8_Sub1_8.method1392(local33);
		}
		if (local19 == 23) {
			local532 = Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 0, 0, 0, 2, 0, false, local15, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local23);
			if (!local532) {
				Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 1, 1, 0, 2, 0, false, local15, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local23);
			}
			Static71.anInt2166 = Static89.anInt2559;
			Static19.anInt1890 = Static32.anInt1044;
			Static83.anInt2381 = 0;
			Static85.anInt2457 = 2;
			Static12.aClass2_Sub8_Sub1_8.method1425(28);
			Static12.aClass2_Sub8_Sub1_8.method1392(local15 + Static107.anInt2849);
			Static12.aClass2_Sub8_Sub1_8.method1374(local33);
			Static12.aClass2_Sub8_Sub1_8.method1398(Static37.anInt1220 + local23);
			Static12.aClass2_Sub8_Sub1_8.method1398(Static7.anInt294);
			Static12.aClass2_Sub8_Sub1_8.method1392(Static76.anInt2216);
			Static12.aClass2_Sub8_Sub1_8.method1390(Static79.anInt2279);
		}
		if (local19 == 42) {
			local532 = Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 0, 0, 0, 2, 0, false, local15, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local23);
			if (!local532) {
				Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 1, 1, 0, 2, 0, false, local15, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local23);
			}
			Static19.anInt1890 = Static32.anInt1044;
			Static71.anInt2166 = Static89.anInt2559;
			Static85.anInt2457 = 2;
			Static83.anInt2381 = 0;
			Static12.aClass2_Sub8_Sub1_8.method1425(114);
			Static12.aClass2_Sub8_Sub1_8.method1392(Static107.anInt2849 + local15);
			Static12.aClass2_Sub8_Sub1_8.method1398(local33);
			Static12.aClass2_Sub8_Sub1_8.method1398(local23 + Static37.anInt1220);
		}
		if (local19 == 31) {
			local1078 = Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local33];
			if (local1078 != null) {
				Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 1, 1, 0, 2, 0, false, local1078.anIntArray209[0], Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local1078.anIntArray208[0]);
				Static19.anInt1890 = Static32.anInt1044;
				Static71.anInt2166 = Static89.anInt2559;
				Static83.anInt2381 = 0;
				Static85.anInt2457 = 2;
				Static12.aClass2_Sub8_Sub1_8.method1425(42);
				Static12.aClass2_Sub8_Sub1_8.method1392(local33);
			}
		}
		if (local19 == 38) {
			Static12.aClass2_Sub8_Sub1_8.method1425(98);
			Static12.aClass2_Sub8_Sub1_8.method1398(local15);
			Static12.aClass2_Sub8_Sub1_8.method1374(local33);
			Static12.aClass2_Sub8_Sub1_8.method1370(local23);
			Static1.anInt3 = 2;
			Static35.anInt1204 = 0;
			if (local23 >> 16 == Static98.anInt2770) {
				Static1.anInt3 = 1;
			}
			Static46.anInt1372 = local15;
			Static16.anInt497 = local23;
			if (Static21.anInt2494 == local23 >> 16) {
				Static1.anInt3 = 3;
			}
		}
		if (local19 == 21) {
			Static19.method1106();
		}
		if (local19 == 40 && Static85.anInt2453 == -1) {
			Static12.aClass2_Sub8_Sub1_8.method1425(60);
			Static12.aClass2_Sub8_Sub1_8.method1385(local23);
			Static85.anInt2453 = local23;
		}
		if (local19 == 43) {
			Static12.aClass2_Sub8_Sub1_8.method1425(215);
			Static12.aClass2_Sub8_Sub1_8.method1398(local15);
			Static12.aClass2_Sub8_Sub1_8.method1392(local33);
			Static12.aClass2_Sub8_Sub1_8.method1379(local23);
			Static35.anInt1204 = 0;
			Static1.anInt3 = 2;
			Static46.anInt1372 = local15;
			Static16.anInt497 = local23;
			if (Static98.anInt2770 == local23 >> 16) {
				Static1.anInt3 = 1;
			}
			if (local23 >> 16 == Static21.anInt2494) {
				Static1.anInt3 = 3;
			}
		}
		if (local19 == 41) {
			Static12.aClass2_Sub8_Sub1_8.method1425(146);
			Static12.aClass2_Sub8_Sub1_8.method1370(local23);
			Static12.aClass2_Sub8_Sub1_8.method1379(Static52.anInt1594);
			Static12.aClass2_Sub8_Sub1_8.method1374(local15);
			Static12.aClass2_Sub8_Sub1_8.method1416(local33);
			Static46.anInt1372 = local15;
			Static1.anInt3 = 2;
			Static16.anInt497 = local23;
			if (local23 >> 16 == Static98.anInt2770) {
				Static1.anInt3 = 1;
			}
			Static35.anInt1204 = 0;
			if (local23 >> 16 == Static21.anInt2494) {
				Static1.anInt3 = 3;
			}
		}
		@Pc(2103) long local2103;
		@Pc(2105) int local2105;
		if (local19 == 34) {
			local1135 = Static89.aClass65Array12[arg0];
			local304 = local1135.method1775(Static68.aClass65_948);
			if (local304 != -1) {
				local2103 = local1135.method1779(local304 + 5).method1769().method1790();
				local2105 = -1;
				for (@Pc(2107) int local2107 = 0; local2107 < Static32.anInt1047; local2107++) {
					if (local2103 == Static4.aLongArray2[local2107]) {
						local2105 = local2107;
						break;
					}
				}
				if (local2105 != -1 && Static12.anIntArray71[local2105] > 0) {
					Static15.anInt474 = 3;
					Static107.aBoolean156 = true;
					Static8.aClass65_148 = Static8.aClass65_145;
					Static55.anInt1673 = 0;
					Static85.aBoolean125 = true;
					Static104.aLong81 = Static4.aLongArray2[local2105];
					Static8.aClass65_158 = Static13.method282(new Class65[] { Static50.aClass65_638, Static67.aClass65Array9[local2105] });
				}
			}
		}
		if (local19 == 44 && Static5.method122(local33, local15, local23)) {
			Static12.aClass2_Sub8_Sub1_8.method1425(194);
			Static12.aClass2_Sub8_Sub1_8.method1390(Static52.anInt1594);
			Static12.aClass2_Sub8_Sub1_8.method1392(local23 + Static37.anInt1220);
			Static12.aClass2_Sub8_Sub1_8.method1398(local33 >> 14 & 0x7FFF);
			Static12.aClass2_Sub8_Sub1_8.method1392(local15 + Static107.anInt2849);
		}
		if (local19 == 25) {
			local532 = Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 0, 0, 0, 2, 0, false, local15, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local23);
			if (!local532) {
				Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 1, 1, 0, 2, 0, false, local15, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local23);
			}
			Static71.anInt2166 = Static89.anInt2559;
			Static85.anInt2457 = 2;
			Static83.anInt2381 = 0;
			Static19.anInt1890 = Static32.anInt1044;
			Static12.aClass2_Sub8_Sub1_8.method1425(71);
			Static12.aClass2_Sub8_Sub1_8.method1374(Static37.anInt1220 + local23);
			Static12.aClass2_Sub8_Sub1_8.method1392(local15 + Static107.anInt2849);
			Static12.aClass2_Sub8_Sub1_8.method1370(Static52.anInt1594);
			Static12.aClass2_Sub8_Sub1_8.method1416(local33);
		}
		if (local19 == 51 || local19 == 36 || local19 == 27 || local19 == 24) {
			local1135 = Static89.aClass65Array12[arg0];
			local304 = local1135.method1775(Static68.aClass65_948);
			if (local304 != -1) {
				local2103 = local1135.method1779(local304 + 5).method1769().method1790();
				if (local19 == 51) {
					Static47.method826(local2103);
				}
				if (local19 == 36) {
					Static2.method66(local2103);
				}
				if (local19 == 27) {
					Static75.method1295(local2103);
				}
				if (local19 == 24) {
					Static78.method361(local2103);
				}
			}
		}
		if (local19 == 52 || local19 == 48) {
			local1135 = Static89.aClass65Array12[arg0];
			local304 = local1135.method1775(Static68.aClass65_948);
			if (local304 != -1) {
				local1135 = local1135.method1779(local304 + 5).method1769();
				@Pc(2389) Class65 local2389 = local1135.method1786().method1787();
				@Pc(2391) boolean local2391 = false;
				for (local2105 = 0; local2105 < Static54.anInt1640; local2105++) {
					@Pc(2401) Class2_Sub1_Sub1_Sub2_Sub2 local2401 = Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[Static24.anIntArray99[local2105]];
					if (local2401 != null && local2401.aClass65_726 != null && local2401.aClass65_726.method1788(local2389)) {
						Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 1, 1, 0, 2, 0, false, local2401.anIntArray209[0], Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local2401.anIntArray208[0]);
						if (local19 == 52) {
							Static12.aClass2_Sub8_Sub1_8.method1425(252);
							Static12.aClass2_Sub8_Sub1_8.method1374(Static24.anIntArray99[local2105]);
						}
						local2391 = true;
						if (local19 == 48) {
							Static12.aClass2_Sub8_Sub1_8.method1425(143);
							Static12.aClass2_Sub8_Sub1_8.method1416(Static24.anIntArray99[local2105]);
						}
						break;
					}
				}
				if (!local2391) {
					Static36.method742(Static8.aClass65_145, Static13.method282(new Class65[] { Static38.aClass65_528, local2389 }), 0);
				}
			}
		}
		if (local19 == 1002) {
			local284 = Static28.method503(local23);
			if (local284 == null || local284.anIntArray26[local15] < 100000) {
				Static12.aClass2_Sub8_Sub1_8.method1425(110);
				Static12.aClass2_Sub8_Sub1_8.method1392(local33);
			} else {
				Static36.method742(Static8.aClass65_145, Static13.method282(new Class65[] { method1617(local284.anIntArray26[local15]), Static23.aClass65_323, Static70.method1263(local33).aClass65_820 }), 0);
			}
			Static35.anInt1204 = 0;
			Static46.anInt1372 = local15;
			Static16.anInt497 = local23;
			Static1.anInt3 = 2;
			if (Static98.anInt2770 == local23 >> 16) {
				Static1.anInt3 = 1;
			}
			if (local23 >> 16 == Static21.anInt2494) {
				Static1.anInt3 = 3;
			}
		}
		if (local19 == 4) {
			local1078 = Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local33];
			if (local1078 != null) {
				Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 1, 1, 0, 2, 0, false, local1078.anIntArray209[0], Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local1078.anIntArray208[0]);
				Static71.anInt2166 = Static89.anInt2559;
				Static85.anInt2457 = 2;
				Static83.anInt2381 = 0;
				Static19.anInt1890 = Static32.anInt1044;
				Static12.aClass2_Sub8_Sub1_8.method1425(87);
				Static12.aClass2_Sub8_Sub1_8.method1392(local33);
				Static12.aClass2_Sub8_Sub1_8.method1374(Static7.anInt294);
				Static12.aClass2_Sub8_Sub1_8.method1385(Static79.anInt2279);
				Static12.aClass2_Sub8_Sub1_8.method1416(Static76.anInt2216);
			}
		}
		if (local19 == 56) {
			Static12.aClass2_Sub8_Sub1_8.method1425(63);
			Static12.aClass2_Sub8_Sub1_8.method1390(local23);
			Static12.aClass2_Sub8_Sub1_8.method1374(local33);
			Static12.aClass2_Sub8_Sub1_8.method1398(local15);
			Static46.anInt1372 = local15;
			Static1.anInt3 = 2;
			Static16.anInt497 = local23;
			Static35.anInt1204 = 0;
			if (Static98.anInt2770 == local23 >> 16) {
				Static1.anInt3 = 1;
			}
			if (Static21.anInt2494 == local23 >> 16) {
				Static1.anInt3 = 3;
			}
		}
		if (local19 == 1006) {
			Static85.anInt2457 = 2;
			Static19.anInt1890 = Static32.anInt1044;
			Static71.anInt2166 = Static89.anInt2559;
			Static83.anInt2381 = 0;
			local1078 = Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local33];
			if (local1078 != null) {
				@Pc(2721) Class2_Sub1_Sub11 local2721 = local1078.aClass2_Sub1_Sub11_1;
				if (local2721.anIntArray285 != null) {
					local2721 = local2721.method1262();
				}
				if (local2721 != null) {
					Static12.aClass2_Sub8_Sub1_8.method1425(251);
					Static12.aClass2_Sub8_Sub1_8.method1392(local2721.anInt2122);
				}
			}
		}
		if (local19 == 11) {
			local1078 = Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local33];
			if (local1078 != null) {
				Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 1, 1, 0, 2, 0, false, local1078.anIntArray209[0], Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local1078.anIntArray208[0]);
				Static83.anInt2381 = 0;
				Static19.anInt1890 = Static32.anInt1044;
				Static85.anInt2457 = 2;
				Static71.anInt2166 = Static89.anInt2559;
				Static12.aClass2_Sub8_Sub1_8.method1425(170);
				Static12.aClass2_Sub8_Sub1_8.method1370(Static52.anInt1594);
				Static12.aClass2_Sub8_Sub1_8.method1374(local33);
			}
		}
		if (local19 == 10) {
			Static12.aClass2_Sub8_Sub1_8.method1425(70);
			Static12.aClass2_Sub8_Sub1_8.method1379(local23);
			Static12.aClass2_Sub8_Sub1_8.method1392(local15);
			Static12.aClass2_Sub8_Sub1_8.method1374(local33);
			Static46.anInt1372 = local15;
			Static35.anInt1204 = 0;
			Static1.anInt3 = 2;
			Static16.anInt497 = local23;
			if (Static98.anInt2770 == local23 >> 16) {
				Static1.anInt3 = 1;
			}
			if (Static21.anInt2494 == local23 >> 16) {
				Static1.anInt3 = 3;
			}
		}
		if (local19 == 8) {
			Static12.aClass2_Sub8_Sub1_8.method1425(35);
			Static12.aClass2_Sub8_Sub1_8.method1398(local15);
			Static12.aClass2_Sub8_Sub1_8.method1416(local33);
			Static12.aClass2_Sub8_Sub1_8.method1370(local23);
			Static1.anInt3 = 2;
			Static35.anInt1204 = 0;
			Static16.anInt497 = local23;
			Static46.anInt1372 = local15;
			if (Static98.anInt2770 == local23 >> 16) {
				Static1.anInt3 = 1;
			}
			if (local23 >> 16 == Static21.anInt2494) {
				Static1.anInt3 = 3;
			}
		}
		if (local19 == 16) {
			local1078 = Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local33];
			if (local1078 != null) {
				Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 1, 1, 0, 2, 0, false, local1078.anIntArray209[0], Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local1078.anIntArray208[0]);
				Static83.anInt2381 = 0;
				Static85.anInt2457 = 2;
				Static71.anInt2166 = Static89.anInt2559;
				Static19.anInt1890 = Static32.anInt1044;
				Static12.aClass2_Sub8_Sub1_8.method1425(203);
				Static12.aClass2_Sub8_Sub1_8.method1392(local33);
			}
		}
		if (local19 == 49) {
			Static5.method122(local33, local15, local23);
			Static12.aClass2_Sub8_Sub1_8.method1425(129);
			Static12.aClass2_Sub8_Sub1_8.method1374(local23 + Static37.anInt1220);
			Static12.aClass2_Sub8_Sub1_8.method1416(Static107.anInt2849 + local15);
			Static12.aClass2_Sub8_Sub1_8.method1416(local33 >> 14 & 0x7FFF);
		}
		if (local19 == 14) {
			local532 = Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 0, 0, 0, 2, 0, false, local15, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local23);
			if (!local532) {
				Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 1, 1, 0, 2, 0, false, local15, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local23);
			}
			Static19.anInt1890 = Static32.anInt1044;
			Static71.anInt2166 = Static89.anInt2559;
			Static83.anInt2381 = 0;
			Static85.anInt2457 = 2;
			Static12.aClass2_Sub8_Sub1_8.method1425(221);
			Static12.aClass2_Sub8_Sub1_8.method1398(Static107.anInt2849 + local15);
			Static12.aClass2_Sub8_Sub1_8.method1374(local33);
			Static12.aClass2_Sub8_Sub1_8.method1416(local23 + Static37.anInt1220);
		}
		if (local19 == 28) {
			if (Static51.aBoolean83) {
				Static67.aClass18_1.method626(local15 - 4, local23 + -4);
			} else {
				Static67.aClass18_1.method626(Static89.anInt2559 - 4, Static32.anInt1044 - 4);
			}
		}
		if (local19 == 15) {
			local170 = Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local33];
			if (local170 != null) {
				Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 1, 1, 0, 2, 0, false, local170.anIntArray209[0], Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local170.anIntArray208[0]);
				Static83.anInt2381 = 0;
				Static85.anInt2457 = 2;
				Static71.anInt2166 = Static89.anInt2559;
				Static19.anInt1890 = Static32.anInt1044;
				Static12.aClass2_Sub8_Sub1_8.method1425(135);
				Static12.aClass2_Sub8_Sub1_8.method1374(Static7.anInt294);
				Static12.aClass2_Sub8_Sub1_8.method1390(Static79.anInt2279);
				Static12.aClass2_Sub8_Sub1_8.method1416(Static76.anInt2216);
				Static12.aClass2_Sub8_Sub1_8.method1416(local33);
			}
		}
		if (Static80.anInt2291 != 0) {
			Static80.anInt2291 = 0;
			Static19.aBoolean99 = true;
		}
		if (Static37.anInt1224 != 0) {
			Static37.anInt1224 = 0;
			Static19.aBoolean99 = true;
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)Lclient!wb;")
	public static Class65 method1617(@OriginalArg(0) int arg0) {
		return Static54.method962(arg0);
	}

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "(I)V")
	public static void method1619() {
		Static16.anImage1 = null;
		Static19.aFontMetrics3 = null;
		Static53.aFont2 = null;
	}
}
