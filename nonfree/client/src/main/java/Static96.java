import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!tc", name = "Tc", descriptor = "Lclient!s;")
	public static Class2_Sub1_Sub14 aClass2_Sub1_Sub14_1;

	@OriginalMember(owner = "client!tc", name = "Zc", descriptor = "Lclient!uc;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_20;

	@OriginalMember(owner = "client!tc", name = "cd", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!tc", name = "ed", descriptor = "Z")
	public static boolean aBoolean119;

	@OriginalMember(owner = "client!tc", name = "sd", descriptor = "Lclient!pa;")
	public static Class51 aClass51_55;

	@OriginalMember(owner = "client!tc", name = "zd", descriptor = "Lclient!ub;")
	public static Class2_Sub4 aClass2_Sub4_1;

	@OriginalMember(owner = "client!tc", name = "Ed", descriptor = "Lclient!jd;")
	public static Class36 aClass36_65;

	@OriginalMember(owner = "client!tc", name = "Id", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!tc", name = "Rc", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1179 = Static2.method66("(U(Y");

	@OriginalMember(owner = "client!tc", name = "bd", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1180 = Static2.method66("p12_full");

	@OriginalMember(owner = "client!tc", name = "gd", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8 = new byte[4][104][104];

	@OriginalMember(owner = "client!tc", name = "id", descriptor = "I")
	public static int anInt2626 = -1;

	@OriginalMember(owner = "client!tc", name = "vd", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1183 = Static2.method66("New User");

	@OriginalMember(owner = "client!tc", name = "nd", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1181 = aClass39_1183;

	@OriginalMember(owner = "client!tc", name = "td", descriptor = "I")
	public static int anInt2634 = 0;

	@OriginalMember(owner = "client!tc", name = "Ad", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1184 = Static2.method66("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!tc", name = "Bd", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1185 = Static2.method66(" )2> @lre@");

	@OriginalMember(owner = "client!tc", name = "Fd", descriptor = "I")
	public static int anInt2639 = 0;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
	public static void method1845() {
		aByteArrayArrayArray7 = null;
		Static5.anIntArray15 = null;
		Static19.anIntArrayArray6 = null;
		Static73.anIntArray259 = null;
		Static45.anIntArray176 = null;
		Static62.anIntArrayArrayArray7 = null;
		Static5.anIntArray13 = null;
		Static69.aByteArrayArrayArray4 = null;
		Static29.anIntArray90 = null;
		Static57.aByteArrayArrayArray2 = null;
		aByteArrayArrayArray9 = null;
		Static64.aByteArrayArrayArray3 = null;
	}

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "(I)V")
	public static void method1846() {
		Static2.aClass54_1.method1635();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIZIII)V")
	public static void method1848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 1 || arg3 < 1 || arg0 > 102 || arg3 > 102) {
			return;
		}
		if (Static35.aBoolean136 && arg1 != Static18.anInt560) {
			return;
		}
		@Pc(32) int local32 = 0;
		if (arg6 == 0) {
			local32 = Static77.aClass43_1.method1195(arg1, arg0, arg3);
		}
		if (arg6 == 1) {
			local32 = Static77.aClass43_1.method1202(arg1, arg0, arg3);
		}
		if (arg6 == 2) {
			local32 = Static77.aClass43_1.method1200(arg1, arg0, arg3);
		}
		if (arg6 == 3) {
			local32 = Static77.aClass43_1.method1166(arg1, arg0, arg3);
		}
		@Pc(88) int local88;
		if (local32 != 0) {
			@Pc(81) int local81 = local32 >> 14 & 0x7FFF;
			local88 = Static77.aClass43_1.method1189(arg1, arg0, arg3, local32);
			@Pc(92) int local92 = local88 & 0x1F;
			@Pc(98) int local98 = local88 >> 6 & 0x3;
			@Pc(112) Class2_Sub1_Sub5 local112;
			if (arg6 == 0) {
				Static77.aClass43_1.method1184(arg1, arg0, arg3);
				local112 = Static48.method916(local81);
				if (local112.aBoolean30) {
					Static5.aClass47Array1[arg1].method1461(local92, arg3, arg0, local98, local112.aBoolean31);
				}
			}
			if (arg6 == 1) {
				Static77.aClass43_1.method1165(arg1, arg0, arg3);
			}
			if (arg6 == 2) {
				Static77.aClass43_1.method1211(arg1, arg0, arg3);
				local112 = Static48.method916(local81);
				if (local112.anInt528 + arg0 > 103 || local112.anInt528 + arg3 > 103 || arg0 + local112.anInt537 > 103 || local112.anInt537 + arg3 > 103) {
					return;
				}
				if (local112.aBoolean30) {
					Static5.aClass47Array1[arg1].method1467(local112.anInt537, local112.aBoolean31, local98, local112.anInt528, arg3, arg0);
				}
			}
			if (arg6 == 3) {
				Static77.aClass43_1.method1214(arg1, arg0, arg3);
				local112 = Static48.method916(local81);
				if (local112.aBoolean30 && local112.anInt551 == 1) {
					Static5.aClass47Array1[arg1].method1464(arg3, arg0);
				}
			}
		}
		if (arg5 < 0) {
			return;
		}
		local88 = arg1;
		if (arg1 < 3 && (aByteArrayArrayArray8[1][arg0][arg3] & 0x2) == 2) {
			local88 = arg1 + 1;
		}
		Static53.method1006(local88, Static5.aClass47Array1[arg1], arg1, arg2, arg5, Static77.aClass43_1, arg0, arg3, arg4);
		return;
	}

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "(B)V")
	public static void method1850() {
		@Pc(17) int local17;
		if (Static102.anInt2771 == 0) {
			Static77.aClass43_1 = new Class43(4, 104, 104, Static22.anIntArrayArrayArray3);
			for (local17 = 0; local17 < 4; local17++) {
				Static5.aClass47Array1[local17] = new Class47(104, 104);
			}
			Static42.aClass2_Sub1_Sub4_Sub2_4 = new Class2_Sub1_Sub4_Sub2(512, 512);
			Static20.anInt581 = 5;
			Static22.aClass39_298 = Static58.aClass39_721;
			Static102.anInt2771 = 20;
			return;
		}
		@Pc(52) int local52;
		@Pc(62) int local62;
		@Pc(68) int local68;
		@Pc(72) int local72;
		if (Static102.anInt2771 == 20) {
			@Pc(50) int[] local50 = new int[9];
			for (local52 = 0; local52 < 9; local52++) {
				local62 = local52 * 32 + 15 + 128;
				local68 = local62 * 3 + 600;
				local72 = Class2_Sub1_Sub4_Sub4.anIntArray356[local62];
				local50[local52] = local68 * local72 >> 16;
			}
			Static59.method1193(local50);
			Static22.aClass39_298 = Static109.aClass39_1335;
			Static102.anInt2771 = 30;
			Static20.anInt581 = 10;
		} else if (Static102.anInt2771 == 30) {
			Static18.aClass36_Sub1_4 = Static46.method870(true, true, false, 0);
			Static6.aClass36_Sub1_23 = Static46.method870(true, true, false, 1);
			Static108.aClass36_Sub1_24 = Static46.method870(false, true, true, 2);
			Static99.aClass36_Sub1_22 = Static46.method870(true, true, false, 3);
			Static58.aClass36_Sub1_14 = Static46.method870(true, true, false, 4);
			Static19.aClass36_Sub1_5 = Static46.method870(true, true, true, 5);
			Static50.aClass36_Sub1_12 = Static46.method870(true, false, true, 6);
			Static24.aClass36_Sub1_6 = Static46.method870(true, true, false, 7);
			Static21.aClass36_Sub1_21 = Static46.method870(true, true, false, 8);
			Static47.aClass36_Sub1_10 = Static46.method870(true, true, false, 9);
			Static86.aClass36_Sub1_18 = Static46.method870(true, true, false, 10);
			Static49.aClass36_Sub1_11 = Static46.method870(true, true, false, 11);
			Static22.aClass39_298 = Static97.aClass39_1191;
			Static20.anInt581 = 20;
			Static102.anInt2771 = 40;
		} else if (Static102.anInt2771 == 40) {
			local17 = Static18.aClass36_Sub1_4.method1786() * 5 / 100;
			local17 += Static6.aClass36_Sub1_23.method1786() * 5 / 100;
			local17 += Static108.aClass36_Sub1_24.method1786() * 5 / 100;
			local17 += Static99.aClass36_Sub1_22.method1786() * 5 / 100;
			local17 += Static58.aClass36_Sub1_14.method1786() * 5 / 100;
			local17 += Static19.aClass36_Sub1_5.method1786() * 5 / 100;
			local17 += Static50.aClass36_Sub1_12.method1786() * 5 / 100;
			local17 += Static24.aClass36_Sub1_6.method1786() * 45 / 100;
			local17 += Static21.aClass36_Sub1_21.method1786() * 5 / 100;
			local17 += Static47.aClass36_Sub1_10.method1786() * 5 / 100;
			local17 += Static86.aClass36_Sub1_18.method1786() * 5 / 100;
			local17 += Static49.aClass36_Sub1_11.method1786() * 5 / 100;
			if (local17 == 100) {
				Static22.aClass39_298 = Static72.aClass39_911;
				Static102.anInt2771 = 45;
				Static20.anInt581 = 30;
			} else {
				if (local17 != 0) {
					Static22.aClass39_298 = Static20.method431(new Class39[] { Static109.aClass39_1325, Static31.method1267(local17), Static108.aClass39_1318 });
				}
				Static20.anInt581 = 30;
			}
		} else if (Static102.anInt2771 == 45) {
			Static72.method1486(!Static35.aBoolean136, Static61.aClass12_3);
			Static10.aClass2_Sub4_Sub2_1 = Static73.method1500(Static61.aClass12_3, Static7.aCanvas1);
			Static82.aClass61_1 = new Class61(22050, Static57.anInt1657);
			Static102.anInt2771 = 50;
			Static22.aClass39_298 = Static77.aClass39_942;
			Static20.anInt581 = 35;
		} else if (Static102.anInt2771 == 50) {
			local17 = 0;
			if (Static97.aClass2_Sub1_Sub4_Sub1_3 == null) {
				Static97.aClass2_Sub1_Sub4_Sub1_3 = Static62.method1308(Static21.aClass36_Sub1_21, Static108.aClass39_1321, Static86.aClass39_1048);
			} else {
				local17++;
			}
			if (Static49.aClass2_Sub1_Sub4_Sub1_2 == null) {
				Static49.aClass2_Sub1_Sub4_Sub1_2 = Static62.method1308(Static21.aClass36_Sub1_21, aClass39_1180, Static86.aClass39_1048);
			} else {
				local17++;
			}
			if (Static25.aClass2_Sub1_Sub4_Sub1_1 == null) {
				Static25.aClass2_Sub1_Sub4_Sub1_1 = Static62.method1308(Static21.aClass36_Sub1_21, Static78.aClass39_974, Static86.aClass39_1048);
			} else {
				local17++;
			}
			if (local17 < 3) {
				Static22.aClass39_298 = Static20.method431(new Class39[] { Static10.aClass39_116, Static31.method1267(local17 * 100 / 3), Static108.aClass39_1318 });
				Static20.anInt581 = 40;
			} else {
				Static102.anInt2771 = 60;
				Static20.anInt581 = 40;
				Static22.aClass39_298 = Static40.aClass39_511;
			}
		} else if (Static102.anInt2771 == 60) {
			local17 = Static46.method868(Static86.aClass36_Sub1_18, Static21.aClass36_Sub1_21);
			local52 = Static16.method383();
			if (local52 > local17) {
				Static22.aClass39_298 = Static20.method431(new Class39[] { Static64.aClass39_836, Static31.method1267(local17 * 100 / local52), Static108.aClass39_1318 });
				Static20.anInt581 = 50;
			} else {
				Static20.anInt581 = 50;
				Static22.aClass39_298 = Static35.aClass39_1311;
				Static60.method1127(5);
				Static102.anInt2771 = 70;
			}
		} else if (Static102.anInt2771 == 70) {
			if (Static108.aClass36_Sub1_24.method1773()) {
				Static101.method1956(Static108.aClass36_Sub1_24);
				Static15.method2044(Static108.aClass36_Sub1_24);
				Static79.method1965(Static108.aClass36_Sub1_24, Static24.aClass36_Sub1_6);
				Static4.method75(Static108.aClass36_Sub1_24, Static35.aBoolean136, Static24.aClass36_Sub1_6);
				Static1.method1(Static108.aClass36_Sub1_24, Static24.aClass36_Sub1_6);
				Static8.method122(Static24.aBoolean40, Static24.aClass36_Sub1_6, Static108.aClass36_Sub1_24);
				Static65.method1362(Static108.aClass36_Sub1_24, Static6.aClass36_Sub1_23, Static18.aClass36_Sub1_4);
				Static69.method1440(Static24.aClass36_Sub1_6, Static108.aClass36_Sub1_24);
				Static95.method1807(Static108.aClass36_Sub1_24);
				Static8.method121(Static108.aClass36_Sub1_24);
				Static101.method1964(Static24.aClass36_Sub1_6, Static21.aClass36_Sub1_21, Static99.aClass36_Sub1_22);
				Static22.aClass39_298 = Static41.aClass39_527;
				Static20.anInt581 = 60;
				Static102.anInt2771 = 80;
			} else {
				Static22.aClass39_298 = Static20.method431(new Class39[] { Static88.aClass39_483, Static31.method1267(Static108.aClass36_Sub1_24.method1789()), Static108.aClass39_1318 });
				Static20.anInt581 = 60;
			}
		} else if (Static102.anInt2771 == 80) {
			local17 = 0;
			if (Static97.aClass2_Sub1_Sub4_Sub2_7 == null) {
				Static97.aClass2_Sub1_Sub4_Sub2_7 = Static20.method430(Static57.aClass39_710, Static86.aClass39_1048, Static21.aClass36_Sub1_21);
			} else {
				local17++;
			}
			if (Static35.aClass2_Sub1_Sub4_Sub2_8 == null) {
				Static35.aClass2_Sub1_Sub4_Sub2_8 = Static20.method430(Static84.aClass39_1300, Static86.aClass39_1048, Static21.aClass36_Sub1_21);
			} else {
				local17++;
			}
			if (Static83.aClass2_Sub1_Sub4_Sub3Array4 == null) {
				Static83.aClass2_Sub1_Sub4_Sub3Array4 = Static22.method436(Static63.aClass39_813, Static86.aClass39_1048, Static21.aClass36_Sub1_21);
			} else {
				local17++;
			}
			if (Static75.aClass2_Sub1_Sub4_Sub2Array3 == null) {
				Static75.aClass2_Sub1_Sub4_Sub2Array3 = Static101.method1955(Static21.aClass36_Sub1_21, Static108.aClass39_1320, Static86.aClass39_1048);
			} else {
				local17++;
			}
			if (Static87.aClass2_Sub1_Sub4_Sub2Array9 == null) {
				Static87.aClass2_Sub1_Sub4_Sub2Array9 = Static101.method1955(Static21.aClass36_Sub1_21, Static63.aClass39_815, Static86.aClass39_1048);
			} else {
				local17++;
			}
			if (Static29.aClass2_Sub1_Sub4_Sub2Array4 == null) {
				Static29.aClass2_Sub1_Sub4_Sub2Array4 = Static101.method1955(Static21.aClass36_Sub1_21, Static79.aClass39_1263, Static86.aClass39_1048);
			} else {
				local17++;
			}
			if (Static40.aClass2_Sub1_Sub4_Sub2Array5 == null) {
				Static40.aClass2_Sub1_Sub4_Sub2Array5 = Static101.method1955(Static21.aClass36_Sub1_21, Static23.aClass39_306, Static86.aClass39_1048);
			} else {
				local17++;
			}
			if (Static76.aClass2_Sub1_Sub4_Sub2Array7 == null) {
				Static76.aClass2_Sub1_Sub4_Sub2Array7 = Static101.method1955(Static21.aClass36_Sub1_21, Static80.aClass39_989, Static86.aClass39_1048);
			} else {
				local17++;
			}
			if (Static16.aClass2_Sub1_Sub4_Sub2_1 == null) {
				Static16.aClass2_Sub1_Sub4_Sub2_1 = Static20.method430(Static80.aClass39_984, Static86.aClass39_1048, Static21.aClass36_Sub1_21);
			} else {
				local17++;
			}
			if (Static81.aClass2_Sub1_Sub4_Sub2Array8 == null) {
				Static81.aClass2_Sub1_Sub4_Sub2Array8 = Static101.method1955(Static21.aClass36_Sub1_21, Static1.aClass39_4, Static86.aClass39_1048);
			} else {
				local17++;
			}
			if (Static101.aClass2_Sub1_Sub4_Sub2Array10 == null) {
				Static101.aClass2_Sub1_Sub4_Sub2Array10 = Static101.method1955(Static21.aClass36_Sub1_21, Static62.aClass39_791, Static86.aClass39_1048);
			} else {
				local17++;
			}
			if (Static9.aClass2_Sub1_Sub4_Sub2Array1 == null) {
				Static9.aClass2_Sub1_Sub4_Sub2Array1 = Static101.method1955(Static21.aClass36_Sub1_21, Static104.aClass39_1267, Static86.aClass39_1048);
			} else {
				local17++;
			}
			if (Static40.aClass2_Sub1_Sub4_Sub3Array2 == null) {
				Static40.aClass2_Sub1_Sub4_Sub3Array2 = Static22.method436(Static53.aClass39_641, Static86.aClass39_1048, Static21.aClass36_Sub1_21);
			} else {
				local17++;
			}
			if (Static45.aClass2_Sub1_Sub4_Sub3Array3 == null) {
				Static45.aClass2_Sub1_Sub4_Sub3Array3 = Static22.method436(Static10.aClass39_114, Static86.aClass39_1048, Static21.aClass36_Sub1_21);
			} else {
				local17++;
			}
			if (local17 < 14) {
				Static22.aClass39_298 = Static20.method431(new Class39[] { Static94.aClass39_1136, Static31.method1267(local17 * 100 / 14), Static108.aClass39_1318 });
				Static20.anInt581 = 70;
			} else {
				local52 = (int) (Math.random() * 21.0D) - 10;
				Static35.aClass2_Sub1_Sub4_Sub2_8.method1043();
				local68 = (int) (Math.random() * 21.0D) - 10;
				local72 = (int) (Math.random() * 41.0D) - 20;
				local62 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(826) int local826 = 0; local826 < Static75.aClass2_Sub1_Sub4_Sub2Array3.length; local826++) {
					Static75.aClass2_Sub1_Sub4_Sub2Array3[local826].method1052(local72 + local52, local72 + local62, local72 + local68);
				}
				Static83.aClass2_Sub1_Sub4_Sub3Array4[0].method1940(local72 + local52, local62 + local72, local68 + local72);
				Static102.anInt2771 = 85;
				Static20.anInt581 = 70;
				Static22.aClass39_298 = Static26.aClass39_367;
			}
		} else if (Static102.anInt2771 == 85) {
			local17 = Static108.method2074(Static21.aClass36_Sub1_21);
			local52 = Static31.method1248();
			if (local17 < local52) {
				Static22.aClass39_298 = Static20.method431(new Class39[] { Static64.aClass39_830, Static31.method1267(local17 * 100 / local52), Static108.aClass39_1318 });
				Static20.anInt581 = 80;
			} else {
				Static20.anInt581 = 80;
				Static22.aClass39_298 = Static89.aClass39_1070;
				Static102.anInt2771 = 90;
			}
		} else if (Static102.anInt2771 == 90) {
			if (Static47.aClass36_Sub1_10.method1773()) {
				@Pc(960) Class59 local960 = new Class59(Static47.aClass36_Sub1_10, Static21.aClass36_Sub1_21, 20, 0.8D, Static35.aBoolean136 ? 64 : 128);
				Static106.method2023(local960);
				Static106.method2022(0.8D);
				Static102.anInt2771 = 110;
				Static20.anInt581 = 90;
				Static22.aClass39_298 = Static73.aClass39_924;
			} else {
				Static22.aClass39_298 = Static20.method431(new Class39[] { Static63.aClass39_808, Static31.method1267(Static47.aClass36_Sub1_10.method1789()), Static108.aClass39_1318 });
				Static20.anInt581 = 90;
			}
		} else if (Static102.anInt2771 == 110) {
			Static12.aClass15_1 = new Class15();
			Static61.aClass12_3.method324(Static12.aClass15_1, 10);
			Static20.anInt581 = 94;
			Static102.anInt2771 = 120;
			Static22.aClass39_298 = Static40.aClass39_515;
		} else if (Static102.anInt2771 == 120) {
			if (Static86.aClass36_Sub1_18.method1769(Static86.aClass39_1048, Static54.aClass39_663)) {
				@Pc(1025) Class30 local1025 = new Class30(Static86.aClass36_Sub1_18.method1758(Static54.aClass39_663, Static86.aClass39_1048));
				Static28.method561(local1025);
				Static20.anInt581 = 96;
				Static22.aClass39_298 = Static109.aClass39_1337;
				Static102.anInt2771 = 130;
			} else {
				Static22.aClass39_298 = Static20.method431(new Class39[] { Static83.aClass39_1025, Static83.aClass39_1033 });
				Static20.anInt581 = 96;
			}
		} else if (Static102.anInt2771 == 130) {
			if (Static99.aClass36_Sub1_22.method1773()) {
				Static102.anInt2771 = 140;
				Static20.anInt581 = 100;
				Static22.aClass39_298 = Static5.aClass39_51;
			} else {
				Static22.aClass39_298 = Static20.method431(new Class39[] { Static25.aClass39_344, Static31.method1267(Static99.aClass36_Sub1_22.method1789()), Static108.aClass39_1318 });
				Static20.anInt581 = 100;
			}
		} else if (Static102.anInt2771 == 140) {
			Static60.method1127(10);
		}
	}

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "(I)V")
	public static void method1851() {
		Static50.method953();
		@Pc(20) int local20;
		@Pc(22) int local22;
		if (Static45.anInt1235 == 2) {
			@Pc(15) byte[] local15 = Static4.aClass2_Sub1_Sub4_Sub3_1.aByteArray24;
			@Pc(17) int[] local17 = Static91.anIntArray354;
			local20 = local15.length;
			for (local22 = 0; local22 < local20; local22++) {
				if (local15[local22] == 0) {
					local17[local22] = 0;
				}
			}
			Static97.aClass2_Sub1_Sub4_Sub2_7.method1048(0, 0, 33, 33, 25, 25, Static101.anInt2748, 256, Static28.anIntArray88, Static18.anIntArray59);
			Static58.method1160();
			return;
		}
		@Pc(65) int local65 = Static101.anInt2748 + Static94.anInt2489 & 0x7FF;
		@Pc(72) int local72 = Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2896 / 32 + 48;
		local20 = 464 - Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2899 / 32;
		Static42.aClass2_Sub1_Sub4_Sub2_4.method1048(25, 5, 146, 151, local72, local20, local65, Static63.anInt1865 + 256, Static109.anIntArray371, Static71.anIntArray255);
		for (local22 = 0; local22 < Static40.anInt1184; local22++) {
			local72 = Static16.anIntArray54[local22] * 4 + 2 - Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2896 / 32;
			local20 = Static55.anIntArray213[local22] * 4 + 2 - Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2899 / 32;
			Static72.method1483(local72, Static41.aClass2_Sub1_Sub4_Sub2Array6[local22], local20);
		}
		@Pc(155) int local155;
		for (@Pc(151) int local151 = 0; local151 < 104; local151++) {
			for (local155 = 0; local155 < 104; local155++) {
				@Pc(165) Class34 local165 = Static55.aClass34ArrayArrayArray1[Static18.anInt560][local151][local155];
				if (local165 != null) {
					local20 = local155 * 4 + 2 - Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2899 / 32;
					local72 = local151 * 4 + 2 - Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2896 / 32;
					Static72.method1483(local72, Static9.aClass2_Sub1_Sub4_Sub2Array1[0], local20);
				}
			}
		}
		for (local155 = 0; local155 < Static95.anInt2510; local155++) {
			@Pc(218) Class2_Sub1_Sub2_Sub3_Sub2 local218 = Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1[Static50.anIntArray193[local155]];
			if (local218 != null && local218.method2067()) {
				@Pc(227) Class2_Sub1_Sub8 local227 = local218.aClass2_Sub1_Sub8_1;
				if (local227.anIntArray190 != null) {
					local227 = local227.method941();
				}
				if (local227 != null && local227.aBoolean73 && local227.aBoolean72) {
					local72 = local218.anInt2896 / 32 - Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2896 / 32;
					local20 = local218.anInt2899 / 32 - Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2899 / 32;
					Static72.method1483(local72, Static9.aClass2_Sub1_Sub4_Sub2Array1[1], local20);
				}
			}
		}
		@Pc(291) Class2_Sub1_Sub2_Sub3_Sub1 local291;
		for (@Pc(283) int local283 = 0; local283 < Static61.anInt1740; local283++) {
			local291 = Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[Static7.anIntArray21[local283]];
			if (local291 != null && local291.method2067()) {
				local20 = local291.anInt2899 / 32 - Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2899 / 32;
				local72 = local291.anInt2896 / 32 - Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2896 / 32;
				@Pc(322) boolean local322 = false;
				@Pc(327) long local327 = local291.aClass39_1182.method1090();
				for (@Pc(329) int local329 = 0; local329 < Static72.anInt2061; local329++) {
					if (local327 == Static1.aLongArray1[local329] && Static45.anIntArray177[local329] != 0) {
						local322 = true;
						break;
					}
				}
				@Pc(351) boolean local351 = false;
				if (Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2636 != 0 && local291.anInt2636 != 0 && local291.anInt2636 == Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2636) {
					local351 = true;
				}
				if (local322) {
					Static72.method1483(local72, Static9.aClass2_Sub1_Sub4_Sub2Array1[3], local20);
				} else if (local351) {
					Static72.method1483(local72, Static9.aClass2_Sub1_Sub4_Sub2Array1[4], local20);
				} else {
					Static72.method1483(local72, Static9.aClass2_Sub1_Sub4_Sub2Array1[2], local20);
				}
			}
		}
		if (Static7.anInt151 != 0 && Static64.anInt1889 % 20 < 10) {
			if (Static7.anInt151 == 1 && Static47.anInt1324 >= 0 && Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1.length > Static47.anInt1324) {
				@Pc(440) Class2_Sub1_Sub2_Sub3_Sub2 local440 = Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1[Static47.anInt1324];
				if (local440 != null) {
					local72 = local440.anInt2896 / 32 - Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2896 / 32;
					local20 = local440.anInt2899 / 32 - Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2899 / 32;
					Static24.method490(local72, Static81.aClass2_Sub1_Sub4_Sub2Array8[1], local20);
				}
			}
			if (Static7.anInt151 == 2) {
				local72 = (-Static19.anInt575 + Static18.anInt547) * 4 + 2 - Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2896 / 32;
				local20 = (Static107.anInt2654 - Static75.anInt454) * 4 + 2 - Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2899 / 32;
				Static24.method490(local72, Static81.aClass2_Sub1_Sub4_Sub2Array8[1], local20);
			}
			if (Static7.anInt151 == 10 && Static82.anInt2220 >= 0 && Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1.length > Static82.anInt2220) {
				local291 = Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[Static82.anInt2220];
				if (local291 != null) {
					local20 = local291.anInt2899 / 32 - Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2899 / 32;
					local72 = local291.anInt2896 / 32 - Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2896 / 32;
					Static24.method490(local72, Static81.aClass2_Sub1_Sub4_Sub2Array8[1], local20);
				}
			}
		}
		if (Static12.anInt325 != 0) {
			local72 = Static12.anInt325 * 4 + 2 - Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2896 / 32;
			local20 = Static55.anInt1552 * 4 + 2 - Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2899 / 32;
			Static72.method1483(local72, Static81.aClass2_Sub1_Sub4_Sub2Array8[0], local20);
		}
		Static91.method2013(97, 78, 3, 3, 16777215);
		Static97.aClass2_Sub1_Sub4_Sub2_7.method1048(0, 0, 33, 33, 25, 25, Static101.anInt2748, 256, Static28.anIntArray88, Static18.anIntArray59);
		Static58.method1160();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([BI)V")
	public static void method1852(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub5 local8 = new Class2_Sub5(arg0);
		local8.anInt1772 = arg0.length - 2;
		Static92.anInt2392 = local8.method1273();
		Static83.anIntArray297 = new int[Static92.anInt2392];
		Static51.aByteArrayArray10 = new byte[Static92.anInt2392][];
		Static30.anIntArray94 = new int[Static92.anInt2392];
		Static95.anIntArray314 = new int[Static92.anInt2392];
		Static10.anIntArray34 = new int[Static92.anInt2392];
		local8.anInt1772 = arg0.length - Static92.anInt2392 * 8 - 7;
		Static76.anInt2102 = local8.method1273();
		Static56.anInt1612 = local8.method1273();
		@Pc(64) int local64 = (local8.method1281() & 0xFF) + 1;
		for (@Pc(71) int local71 = 0; local71 < Static92.anInt2392; local71++) {
			Static83.anIntArray297[local71] = local8.method1273();
		}
		for (@Pc(84) int local84 = 0; local84 < Static92.anInt2392; local84++) {
			Static10.anIntArray34[local84] = local8.method1273();
		}
		for (@Pc(99) int local99 = 0; local99 < Static92.anInt2392; local99++) {
			Static95.anIntArray314[local99] = local8.method1273();
		}
		for (@Pc(116) int local116 = 0; local116 < Static92.anInt2392; local116++) {
			Static30.anIntArray94[local116] = local8.method1273();
		}
		local8.anInt1772 = arg0.length - (local64 - 1) * 3 - Static92.anInt2392 * 8 - 7;
		Static46.anIntArray179 = new int[local64];
		for (@Pc(154) int local154 = 1; local154 < local64; local154++) {
			Static46.anIntArray179[local154] = local8.method1255();
			if (Static46.anIntArray179[local154] == 0) {
				Static46.anIntArray179[local154] = 1;
			}
		}
		local8.anInt1772 = 0;
		for (@Pc(185) int local185 = 0; local185 < Static92.anInt2392; local185++) {
			@Pc(190) int local190 = Static95.anIntArray314[local185];
			@Pc(194) int local194 = Static30.anIntArray94[local185];
			@Pc(198) int local198 = local194 * local190;
			@Pc(201) byte[] local201 = new byte[local198];
			Static51.aByteArrayArray10[local185] = local201;
			@Pc(211) int local211 = local8.method1281();
			@Pc(218) int local218;
			if (local211 == 0) {
				for (local218 = 0; local218 < local198; local218++) {
					local201[local218] = local8.method1254();
				}
			} else if (local211 == 1) {
				for (local218 = 0; local218 < local190; local218++) {
					for (@Pc(240) int local240 = 0; local240 < local194; local240++) {
						local201[local190 * local240 + local218] = local8.method1254();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "(I)V")
	public static void method1853() {
		aByteArrayArrayArray8 = null;
		aClass39_1180 = null;
		aClass39_1179 = null;
		aClass39_1185 = null;
		aClass2_Sub1_Sub4_Sub3_20 = null;
		aClass51_55 = null;
		aClass39_1183 = null;
		aClass39_1181 = null;
		aClass36_65 = null;
		aClass39_1184 = null;
		aByteArrayArrayArray9 = null;
		aClass2_Sub4_1 = null;
		aByteArrayArrayArray7 = null;
		aClass2_Sub1_Sub14_1 = null;
	}
}
