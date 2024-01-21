import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!pc", name = "sb", descriptor = "J")
	public static long aLong64;

	@OriginalMember(owner = "client!pc", name = "xb", descriptor = "[I")
	public static int[] anIntArray281;

	@OriginalMember(owner = "client!pc", name = "ab", descriptor = "Lclient!la;")
	public static Class6_Sub4_Sub1 aClass6_Sub4_Sub1_5 = new Class6_Sub4_Sub1(5000);

	@OriginalMember(owner = "client!pc", name = "qb", descriptor = "I")
	public static int anInt2466 = -1;

	@OriginalMember(owner = "client!pc", name = "tb", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1282 = Static80.method1463("World");

	@OriginalMember(owner = "client!pc", name = "ub", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1283 = aClass63_1282;

	@OriginalMember(owner = "client!pc", name = "vb", descriptor = "Lclient!a;")
	public static Class1 aClass1_5 = new Class1();

	@OriginalMember(owner = "client!pc", name = "wb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1284 = Static80.method1463(" )2> @whi@");

	@OriginalMember(owner = "client!pc", name = "yb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1285 = Static80.method1463("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(IB)Lclient!oa;")
	public static Class6_Sub3_Sub13 method1591(@OriginalArg(0) int arg0) {
		@Pc(10) Class6_Sub3_Sub13 local10 = (Class6_Sub3_Sub13) Static7.aClass49_2.method1397((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static15.aClass7_7.method110(3, arg0);
		local10 = new Class6_Sub3_Sub13();
		if (local20 != null) {
			local10.method1482(new Class6_Sub4(local20));
		}
		Static7.aClass49_2.method1396((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)V")
	public static void method1593() {
		@Pc(20) int local20;
		if (Static29.anInt935 == 0) {
			Static76.aClass19_1 = new Class19(4, 104, 104, Static11.anIntArrayArrayArray6);
			for (local20 = 0; local20 < 4; local20++) {
				Static15.aClass30Array1[local20] = new Class30(104, 104);
			}
			Static123.aClass6_Sub3_Sub3_Sub2_6 = new Class6_Sub3_Sub3_Sub2(512, 512);
			Static29.anInt935 = 20;
			Static49.aClass63_794 = Static43.aClass63_70;
			Static46.anInt1441 = 5;
			return;
		}
		@Pc(59) int local59;
		@Pc(69) int local69;
		@Pc(79) int local79;
		@Pc(73) int local73;
		if (Static29.anInt935 == 20) {
			@Pc(57) int[] local57 = new int[9];
			for (local59 = 0; local59 < 9; local59++) {
				local69 = local59 * 32 + 15 + 128;
				local73 = Class6_Sub3_Sub3_Sub4.anIntArray343[local69];
				local79 = local69 * 3 + 600;
				local57[local59] = local73 * local79 >> 16;
			}
			Static28.method680(local57);
			Static46.anInt1441 = 10;
			Static29.anInt935 = 30;
			Static49.aClass63_794 = Static69.aClass63_1047;
		} else if (Static29.anInt935 == 30) {
			Static82.aClass7_Sub1_14 = Static91.method1671(true, 0, true, false);
			Static5.aClass7_Sub1_2 = Static91.method1671(true, 1, true, false);
			Static5.aClass7_Sub1_1 = Static91.method1671(false, 2, true, true);
			Static98.aClass7_Sub1_18 = Static91.method1671(true, 3, true, false);
			Static86.aClass7_Sub1_16 = Static91.method1671(true, 4, true, false);
			Static67.aClass7_Sub1_11 = Static91.method1671(true, 5, true, true);
			Static64.aClass7_Sub1_10 = Static91.method1671(true, 6, false, true);
			Static24.aClass7_Sub1_5 = Static91.method1671(true, 7, true, false);
			Static52.aClass7_Sub1_8 = Static91.method1671(true, 8, true, false);
			Static85.aClass7_Sub1_19 = Static91.method1671(true, 9, true, false);
			Static71.aClass7_Sub1_12 = Static91.method1671(true, 10, true, false);
			Static113.aClass7_Sub1_4 = Static91.method1671(true, 11, true, false);
			Static81.aClass7_Sub1_13 = Static91.method1671(true, 12, true, false);
			Static60.aClass7_Sub1_9 = Static91.method1671(false, 13, true, true);
			Static51.aClass7_Sub1_7 = Static91.method1671(true, 14, false, false);
			Static91.aClass7_Sub1_17 = Static91.method1671(true, 15, true, false);
			Static29.anInt935 = 40;
			Static49.aClass63_794 = Static4.aClass63_20;
			Static46.anInt1441 = 20;
		} else if (Static29.anInt935 == 40) {
			local20 = Static82.aClass7_Sub1_14.method119() * 4 / 100;
			local20 += Static5.aClass7_Sub1_2.method119() * 4 / 100;
			local20 += Static5.aClass7_Sub1_1.method119() * 2 / 100;
			local20 += Static98.aClass7_Sub1_18.method119() * 2 / 100;
			local20 += Static86.aClass7_Sub1_16.method119() * 6 / 100;
			local20 += Static67.aClass7_Sub1_11.method119() * 4 / 100;
			local20 += Static64.aClass7_Sub1_10.method119() * 2 / 100;
			local20 += Static24.aClass7_Sub1_5.method119() * 60 / 100;
			local20 += Static52.aClass7_Sub1_8.method119() * 2 / 100;
			local20 += Static85.aClass7_Sub1_19.method119() * 2 / 100;
			local20 += Static71.aClass7_Sub1_12.method119() * 2 / 100;
			local20 += Static113.aClass7_Sub1_4.method119() * 2 / 100;
			local20 += Static81.aClass7_Sub1_13.method119() * 2 / 100;
			local20 += Static60.aClass7_Sub1_9.method119() * 2 / 100;
			local20 += Static51.aClass7_Sub1_7.method119() * 2 / 100;
			local20 += Static91.aClass7_Sub1_17.method119() * 2 / 100;
			if (local20 == 100) {
				Static46.anInt1441 = 30;
				Static29.anInt935 = 45;
				Static49.aClass63_794 = Static113.aClass63_401;
			} else {
				if (local20 != 0) {
					Static49.aClass63_794 = Static15.method374(new Class63[] { Static61.aClass63_976, Static118.method2114(local20), Static19.aClass63_406 });
				}
				Static46.anInt1441 = 30;
			}
		} else if (Static29.anInt935 == 45) {
			Static115.method2096(!Static61.aBoolean98);
			@Pc(447) Class6_Sub6_Sub4 local447 = new Class6_Sub6_Sub4();
			local447.method1927();
			Static54.aClass10_1 = Static39.method882(22050, Static38.aCanvas1, 0, Static4.aClass8_1);
			Static54.aClass10_1.method1720(local447);
			Static14.method368(Static91.aClass7_Sub1_17, Static51.aClass7_Sub1_7, Static86.aClass7_Sub1_16, local447);
			Static97.aClass10_2 = Static39.method882(2048, Static38.aCanvas1, 1, Static4.aClass8_1);
			Static54.aClass6_Sub6_Sub2_1 = new Class6_Sub6_Sub2();
			Static97.aClass10_2.method1720(Static54.aClass6_Sub6_Sub2_1);
			Static69.aClass43_1 = new Class43(22050, Static73.anInt2059);
			Static46.anInt1441 = 35;
			Static49.aClass63_794 = Static15.aClass63_335;
			Static29.anInt935 = 50;
		} else if (Static29.anInt935 == 50) {
			local20 = 0;
			if (Static92.aClass6_Sub3_Sub3_Sub1_3 == null) {
				Static92.aClass6_Sub3_Sub3_Sub1_3 = Static102.method1859(Static24.aClass63_492, Static111.aClass63_1661, Static52.aClass7_Sub1_8);
			} else {
				local20++;
			}
			if (Static48.aClass6_Sub3_Sub3_Sub1_2 == null) {
				Static48.aClass6_Sub3_Sub3_Sub1_2 = Static102.method1859(Static87.aClass63_1261, Static111.aClass63_1661, Static52.aClass7_Sub1_8);
			} else {
				local20++;
			}
			if (Static114.aClass6_Sub3_Sub3_Sub1_4 == null) {
				Static114.aClass6_Sub3_Sub3_Sub1_4 = Static102.method1859(Static99.aClass63_1504, Static111.aClass63_1661, Static52.aClass7_Sub1_8);
			} else {
				local20++;
			}
			if (local20 < 3) {
				Static49.aClass63_794 = Static15.method374(new Class63[] { Static118.aClass63_1739, Static118.method2114(local20 * 100 / 3), Static19.aClass63_406 });
				Static46.anInt1441 = 40;
			} else {
				Static49.aClass63_794 = Static94.aClass63_1386;
				Static46.anInt1441 = 40;
				Static29.anInt935 = 60;
			}
		} else if (Static29.anInt935 == 60) {
			local20 = Static35.method847(Static71.aClass7_Sub1_12, Static52.aClass7_Sub1_8);
			local59 = Static58.method1140();
			if (local59 > local20) {
				Static49.aClass63_794 = Static15.method374(new Class63[] { Static61.aClass63_973, Static118.method2114(local20 * 100 / local59), Static19.aClass63_406 });
				Static46.anInt1441 = 50;
			} else {
				Static49.aClass63_794 = Static117.aClass63_1625;
				Static46.anInt1441 = 50;
				Static73.method1392(5);
				Static29.anInt935 = 70;
			}
		} else if (Static29.anInt935 == 70) {
			if (Static5.aClass7_Sub1_1.method100()) {
				Static47.method1024(Static5.aClass7_Sub1_1);
				Static33.method839(Static5.aClass7_Sub1_1);
				Static23.method1550(Static5.aClass7_Sub1_1, Static24.aClass7_Sub1_5);
				Static103.method2134(Static5.aClass7_Sub1_1, Static24.aClass7_Sub1_5, Static61.aBoolean98);
				Static29.method709(Static24.aClass7_Sub1_5, Static5.aClass7_Sub1_1);
				Static74.method1399(Static24.aClass7_Sub1_5, Static92.aClass6_Sub3_Sub3_Sub1_3, Static5.aClass7_Sub1_1, Static30.aBoolean49);
				Static66.method2128(Static82.aClass7_Sub1_14, Static5.aClass7_Sub1_1, Static5.aClass7_Sub1_2);
				Static32.method836(Static5.aClass7_Sub1_1, Static24.aClass7_Sub1_5);
				Static44.method956(Static5.aClass7_Sub1_1);
				Static90.method1651(Static5.aClass7_Sub1_1);
				Static75.method1416(Static98.aClass7_Sub1_18, Static24.aClass7_Sub1_5, Static52.aClass7_Sub1_8);
				Static99.method1837(Static5.aClass7_Sub1_1);
				Static49.aClass63_794 = Static1.aClass63_3;
				Static29.anInt935 = 80;
				Static46.anInt1441 = 60;
			} else {
				Static49.aClass63_794 = Static15.method374(new Class63[] { Static31.aClass63_576, Static118.method2114(Static5.aClass7_Sub1_1.method127()), Static19.aClass63_406 });
				Static46.anInt1441 = 60;
			}
		} else if (Static29.anInt935 == 80) {
			local20 = 0;
			if (Static97.aClass6_Sub3_Sub3_Sub2_4 == null) {
				Static97.aClass6_Sub3_Sub3_Sub2_4 = Static87.method1566(Static111.aClass63_1661, Static52.aClass7_Sub1_8, Static24.aClass63_489);
			} else {
				local20++;
			}
			if (Static64.aClass6_Sub3_Sub3_Sub2_2 == null) {
				Static64.aClass6_Sub3_Sub3_Sub2_2 = Static87.method1566(Static111.aClass63_1661, Static52.aClass7_Sub1_8, Static36.aClass63_647);
			} else {
				local20++;
			}
			if (Static69.aClass6_Sub3_Sub3_Sub3Array3 == null) {
				Static69.aClass6_Sub3_Sub3_Sub3Array3 = Static58.method1137(Static111.aClass63_1661, Static52.aClass7_Sub1_8, Static98.aClass63_1501);
			} else {
				local20++;
			}
			if (Static116.aClass6_Sub3_Sub3_Sub2Array12 == null) {
				Static116.aClass6_Sub3_Sub3_Sub2Array12 = Static54.method1089(Static52.aClass7_Sub1_8, Static37.aClass63_660, Static111.aClass63_1661);
			} else {
				local20++;
			}
			if (Static72.aClass6_Sub3_Sub3_Sub2Array6 == null) {
				Static72.aClass6_Sub3_Sub3_Sub2Array6 = Static54.method1089(Static52.aClass7_Sub1_8, Static40.aClass63_1108, Static111.aClass63_1661);
			} else {
				local20++;
			}
			if (Static21.aClass6_Sub3_Sub3_Sub2Array4 == null) {
				Static21.aClass6_Sub3_Sub3_Sub2Array4 = Static54.method1089(Static52.aClass7_Sub1_8, Static1.aClass63_7, Static111.aClass63_1661);
			} else {
				local20++;
			}
			if (Static17.aClass6_Sub3_Sub3_Sub2Array9 == null) {
				Static17.aClass6_Sub3_Sub3_Sub2Array9 = Static54.method1089(Static52.aClass7_Sub1_8, Static6.aClass63_54, Static111.aClass63_1661);
			} else {
				local20++;
			}
			if (Static2.aClass6_Sub3_Sub3_Sub2Array1 == null) {
				Static2.aClass6_Sub3_Sub3_Sub2Array1 = Static54.method1089(Static52.aClass7_Sub1_8, Static53.aClass63_1681, Static111.aClass63_1661);
			} else {
				local20++;
			}
			if (Static73.aClass6_Sub3_Sub3_Sub2_3 == null) {
				Static73.aClass6_Sub3_Sub3_Sub2_3 = Static87.method1566(Static111.aClass63_1661, Static52.aClass7_Sub1_8, Static6.aClass63_56);
			} else {
				local20++;
			}
			if (Static85.aClass6_Sub3_Sub3_Sub2Array11 == null) {
				Static85.aClass6_Sub3_Sub3_Sub2Array11 = Static54.method1089(Static52.aClass7_Sub1_8, Static54.aClass63_864, Static111.aClass63_1661);
			} else {
				local20++;
			}
			if (Static37.aClass6_Sub3_Sub3_Sub2Array5 == null) {
				Static37.aClass6_Sub3_Sub3_Sub2Array5 = Static54.method1089(Static52.aClass7_Sub1_8, Static116.aClass63_1730, Static111.aClass63_1661);
			} else {
				local20++;
			}
			if (Static102.aClass6_Sub3_Sub3_Sub2Array10 == null) {
				Static102.aClass6_Sub3_Sub3_Sub2Array10 = Static54.method1089(Static52.aClass7_Sub1_8, Static13.aClass63_298, Static111.aClass63_1661);
			} else {
				local20++;
			}
			if (Static73.aClass6_Sub3_Sub3_Sub3Array4 == null) {
				Static73.aClass6_Sub3_Sub3_Sub3Array4 = Static58.method1137(Static111.aClass63_1661, Static52.aClass7_Sub1_8, Static64.aClass63_986);
			} else {
				local20++;
			}
			if (Static6.aClass6_Sub3_Sub3_Sub3Array1 == null) {
				Static6.aClass6_Sub3_Sub3_Sub3Array1 = Static58.method1137(Static111.aClass63_1661, Static52.aClass7_Sub1_8, Static99.aClass63_1508);
			} else {
				local20++;
			}
			if (local20 < 14) {
				Static49.aClass63_794 = Static15.method374(new Class63[] { Static71.aClass63_1063, Static118.method2114(local20 * 100 / 14), Static19.aClass63_406 });
				Static46.anInt1441 = 70;
			} else {
				Static64.aClass6_Sub3_Sub3_Sub2_2.method1258();
				local59 = (int) (Math.random() * 21.0D) - 10;
				local79 = (int) (Math.random() * 21.0D) - 10;
				local73 = (int) (Math.random() * 41.0D) - 20;
				local69 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(940) int local940 = 0; local940 < Static116.aClass6_Sub3_Sub3_Sub2Array12.length; local940++) {
					Static116.aClass6_Sub3_Sub3_Sub2Array12[local940].method1264(local73 + local59, local73 + local69, local79 + local73);
				}
				Static69.aClass6_Sub3_Sub3_Sub3Array3[0].method1767(local73 + local59, local73 + local69, local73 + local79);
				Static46.anInt1441 = 70;
				Static49.aClass63_794 = Static73.aClass63_1075;
				Static29.anInt935 = 85;
			}
		} else if (Static29.anInt935 == 85) {
			local20 = Static36.method863(Static52.aClass7_Sub1_8);
			local59 = Static19.method500();
			if (local59 > local20) {
				Static49.aClass63_794 = Static15.method374(new Class63[] { Static13.aClass63_290, Static118.method2114(local20 * 100 / local59), Static19.aClass63_406 });
				Static46.anInt1441 = 80;
			} else {
				Static49.aClass63_794 = Static50.aClass63_809;
				Static46.anInt1441 = 80;
				Static29.anInt935 = 90;
			}
		} else if (Static29.anInt935 == 90) {
			if (Static85.aClass7_Sub1_19.method100()) {
				@Pc(1072) Class72 local1072 = new Class72(Static85.aClass7_Sub1_19, Static52.aClass7_Sub1_8, 20, 0.8D, Static61.aBoolean98 ? 64 : 128);
				Static107.method1988(local1072);
				Static107.method1997(0.8D);
				Static49.aClass63_794 = Static65.aClass63_993;
				Static46.anInt1441 = 90;
				Static29.anInt935 = 110;
			} else {
				Static49.aClass63_794 = Static15.method374(new Class63[] { Static124.aClass63_1788, Static118.method2114(Static85.aClass7_Sub1_19.method127()), Static19.aClass63_406 });
				Static46.anInt1441 = 90;
			}
		} else if (Static29.anInt935 == 110) {
			Static2.aClass45_1 = new Class45();
			Static4.aClass8_1.method145(10, Static2.aClass45_1);
			Static49.aClass63_794 = Static111.aClass63_1650;
			Static46.anInt1441 = 94;
			Static29.anInt935 = 120;
		} else if (Static29.anInt935 == 120) {
			if (Static71.aClass7_Sub1_12.method99(Static97.aClass63_1495, Static111.aClass63_1661)) {
				@Pc(1139) Class11 local1139 = new Class11(Static71.aClass7_Sub1_12.method104(Static111.aClass63_1661, Static97.aClass63_1495));
				Static42.method927(local1139);
				Static49.aClass63_794 = Static55.aClass63_885;
				Static46.anInt1441 = 96;
				Static29.anInt935 = 130;
			} else {
				Static49.aClass63_794 = Static15.method374(new Class63[] { Static73.aClass63_1068, Static19.aClass63_407 });
				Static46.anInt1441 = 96;
			}
		} else if (Static29.anInt935 == 130) {
			if (!Static98.aClass7_Sub1_18.method100()) {
				Static49.aClass63_794 = Static15.method374(new Class63[] { Static94.aClass63_1384, Static118.method2114(Static98.aClass7_Sub1_18.method127() * 4 / 5), Static19.aClass63_406 });
				Static46.anInt1441 = 100;
			} else if (!Static81.aClass7_Sub1_13.method100()) {
				Static49.aClass63_794 = Static15.method374(new Class63[] { Static94.aClass63_1384, Static118.method2114(Static81.aClass7_Sub1_13.method127() / 6 + 80), Static19.aClass63_406 });
				Static46.anInt1441 = 100;
			} else if (Static60.aClass7_Sub1_9.method100()) {
				Static46.anInt1441 = 100;
				Static49.aClass63_794 = Static110.aClass63_1641;
				Static29.anInt935 = 140;
			} else {
				Static49.aClass63_794 = Static15.method374(new Class63[] { Static94.aClass63_1384, Static118.method2114(Static60.aClass7_Sub1_9.method127() / 20 + 96), Static19.aClass63_406 });
				Static46.anInt1441 = 100;
			}
		} else if (Static29.anInt935 == 140) {
			Static73.method1392(10);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!p;IBI)V")
	public static void method1595(@OriginalArg(0) Class6_Sub3_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(23) int local23;
		if ((arg2 & 0x200) != 0) {
			arg0.anInt2334 = aClass6_Sub4_Sub1_5.method1335();
			local23 = aClass6_Sub4_Sub1_5.method1293();
			arg0.anInt2327 = local23 >> 16;
			if (arg0.anInt2334 == 65535) {
				arg0.anInt2334 = -1;
			}
			arg0.anInt2333 = 0;
			arg0.anInt2341 = (local23 & 0xFFFF) + Static73.anInt2064;
			arg0.anInt2342 = 0;
			if (arg0.anInt2341 > Static73.anInt2064) {
				arg0.anInt2342 = -1;
			}
		}
		@Pc(74) int local74;
		if ((arg2 & 0x100) != 0) {
			local23 = aClass6_Sub4_Sub1_5.method1336();
			local74 = aClass6_Sub4_Sub1_5.method1312();
			arg0.method1544(local23, Static73.anInt2064, local74);
			arg0.anInt2306 = Static73.anInt2064 + 300;
			arg0.anInt2315 = aClass6_Sub4_Sub1_5.method1336();
			arg0.anInt2336 = aClass6_Sub4_Sub1_5.method1324();
		}
		if ((arg2 & 0x400) != 0) {
			arg0.anInt2340 = aClass6_Sub4_Sub1_5.method1321();
			arg0.anInt2294 = aClass6_Sub4_Sub1_5.method1312();
			arg0.anInt2326 = aClass6_Sub4_Sub1_5.method1336();
			arg0.anInt2313 = aClass6_Sub4_Sub1_5.method1336();
			arg0.anInt2331 = aClass6_Sub4_Sub1_5.method1335() + Static73.anInt2064;
			arg0.anInt2332 = aClass6_Sub4_Sub1_5.method1335() + Static73.anInt2064;
			arg0.anInt2316 = aClass6_Sub4_Sub1_5.method1336();
			arg0.anInt2299 = 0;
			arg0.anInt2337 = 1;
		}
		if ((arg2 & 0x4) != 0) {
			arg0.anInt2300 = aClass6_Sub4_Sub1_5.method1300();
			if (arg0.anInt2300 == 65535) {
				arg0.anInt2300 = -1;
			}
		}
		if ((arg2 & 0x10) != 0) {
			arg0.anInt2311 = aClass6_Sub4_Sub1_5.method1295();
			arg0.anInt2339 = aClass6_Sub4_Sub1_5.method1300();
		}
		if ((arg2 & 0x2) != 0) {
			local23 = aClass6_Sub4_Sub1_5.method1306();
			local74 = aClass6_Sub4_Sub1_5.method1336();
			@Pc(203) int local203 = aClass6_Sub4_Sub1_5.method1321();
			@Pc(206) int local206 = aClass6_Sub4_Sub1_5.anInt1949;
			if (arg0.aClass63_1237 != null && arg0.aClass21_1 != null) {
				@Pc(217) long local217 = arg0.aClass63_1237.method1823();
				@Pc(219) boolean local219 = false;
				if (local74 <= 1) {
					for (@Pc(224) int local224 = 0; local224 < Static92.anInt2592; local224++) {
						if (local217 == Static92.aLongArray5[local224]) {
							local219 = true;
							break;
						}
					}
				}
				if (!local219 && Static102.anInt2822 == 0) {
					Static50.aClass6_Sub4_1.anInt1949 = 0;
					aClass6_Sub4_Sub1_5.method1305(local203, Static50.aClass6_Sub4_1.aByteArray27);
					Static50.aClass6_Sub4_1.anInt1949 = 0;
					@Pc(274) Class63 local274 = Static11.method1296(Static50.aClass6_Sub4_1).method1827();
					arg0.aClass63_1232 = local274.method1833();
					arg0.anInt2322 = local23 >> 8;
					arg0.anInt2343 = local23 & 0xFF;
					arg0.anInt2291 = 150;
					if (local74 == 2 || local74 == 3) {
						Static46.method996(Static15.method374(new Class63[] { Static35.aClass63_627, arg0.aClass63_1237 }), 1, local274);
					} else if (local74 == 1) {
						Static46.method996(Static15.method374(new Class63[] { Static54.aClass63_861, arg0.aClass63_1237 }), 1, local274);
					} else {
						Static46.method996(arg0.aClass63_1237, 2, local274);
					}
				}
			}
			aClass6_Sub4_Sub1_5.anInt1949 = local206 + local203;
		}
		if ((arg2 & 0x8) != 0) {
			local23 = aClass6_Sub4_Sub1_5.method1295();
			if (local23 == 65535) {
				local23 = -1;
			}
			local74 = aClass6_Sub4_Sub1_5.method1312();
			Static54.method1090(local23, local74, arg0);
		}
		if ((arg2 & 0x80) != 0) {
			local23 = aClass6_Sub4_Sub1_5.method1336();
			@Pc(392) byte[] local392 = new byte[local23];
			@Pc(397) Class6_Sub4 local397 = new Class6_Sub4(local392);
			aClass6_Sub4_Sub1_5.method1307(local392, local23);
			Static14.aClass6_Sub4Array1[arg1] = local397;
			arg0.method1553(local397);
		}
		if ((arg2 & 0x20) != 0) {
			arg0.aClass63_1232 = aClass6_Sub4_Sub1_5.method1339();
			if (arg0.aClass63_1232.method1810(0) == 126) {
				arg0.aClass63_1232 = arg0.aClass63_1232.method1806(1);
				Static46.method996(arg0.aClass63_1237, 2, arg0.aClass63_1232);
			} else if (arg0 == Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1) {
				Static46.method996(arg0.aClass63_1237, 2, arg0.aClass63_1232);
			}
			arg0.anInt2291 = 150;
			arg0.anInt2343 = 0;
			arg0.anInt2322 = 0;
		}
		if ((arg2 & 0x1) == 0) {
			return;
		}
		local23 = aClass6_Sub4_Sub1_5.method1336();
		local74 = aClass6_Sub4_Sub1_5.method1321();
		arg0.method1544(local23, Static73.anInt2064, local74);
		arg0.anInt2306 = Static73.anInt2064 + 300;
		arg0.anInt2315 = aClass6_Sub4_Sub1_5.method1336();
		arg0.anInt2336 = aClass6_Sub4_Sub1_5.method1336();
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V")
	public static void method1596() {
		aClass63_1284 = null;
		aClass63_1283 = null;
		aClass63_1285 = null;
		anIntArray281 = null;
		aClass63_1282 = null;
		aClass6_Sub4_Sub1_5 = null;
		aClass1_5 = null;
	}
}
