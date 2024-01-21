import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
	public static int anInt2077;

	@OriginalMember(owner = "client!qb", name = "s", descriptor = "Lclient!oa;")
	public static Class7 aClass7_64;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "Z")
	public static boolean aBoolean99 = false;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
	public static int anInt2075 = 0;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1038 = Static38.method736("Passwort: ");

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1039 = Static38.method736("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "Lclient!pb;")
	public static Class52 aClass52_11 = new Class52();

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1040 = Static38.method736("Trade)4compete");

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1041 = Static38.method736(" )2> ");

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "[I")
	public static int[] anIntArray255 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "[Lclient!eb;")
	public static Class5_Sub2[] aClass5_Sub2Array1 = new Class5_Sub2[8];

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1042 = Static38.method736("@or2@");

	@OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
	public static int anInt2081 = 2;

	@OriginalMember(owner = "client!qb", name = "v", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1043 = Static38.method736("invback");

	@OriginalMember(owner = "client!qb", name = "w", descriptor = "J")
	public static volatile long aLong77 = 0L;

	@OriginalMember(owner = "client!qb", name = "x", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1044 = aClass71_1040;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)Lclient!bb;")
	public static Class5_Sub1_Sub3 method1406(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub1_Sub3 local10 = (Class5_Sub1_Sub3) Static72.aClass54_29.method1397((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static118.aClass24_25.method679(14, arg0);
		local10 = new Class5_Sub1_Sub3();
		if (local20 != null) {
			local10.method185(new Class5_Sub11(local20));
		}
		Static72.aClass54_29.method1399(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public static void method1407() {
		Static72.method1207(Static68.anInt1659);
		if (Static75.anInt1857 != -1) {
			Static72.method1207(Static75.anInt1857);
		}
		Static58.anInt1515 = 0;
		Static107.aClass7_78.method699();
		Static19.anIntArray79 = Static80.method1319(Static19.anIntArray79);
		Static52.method2021();
		Static23.method549(765, 503, 0, Static68.anInt1659);
		if (Static75.anInt1857 != -1) {
			Static23.method549(765, 503, 0, Static75.anInt1857);
		}
		if (Static65.aBoolean71) {
			method1412();
		} else {
			Static1.method12();
			Static40.method539();
		}
		try {
			@Pc(62) Graphics local62 = Static105.aCanvas1.getGraphics();
			Static107.aClass7_78.method697(0, local62, 0);
		} catch (@Pc(70) Exception local70) {
			Static105.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
	public static void method1408() {
		aClass52_11 = null;
		aClass5_Sub2Array1 = null;
		aClass71_1040 = null;
		aClass71_1044 = null;
		aClass71_1038 = null;
		aClass71_1041 = null;
		aClass7_64 = null;
		anIntArray255 = null;
		aClass71_1042 = null;
		aClass71_1043 = null;
		aClass71_1039 = null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)Lclient!ia;")
	public static Class5_Sub1_Sub10_Sub1 method1409() {
		@Pc(7) Class5_Sub1_Sub10_Sub1 local7 = new Class5_Sub1_Sub10_Sub1();
		local7.anInt1354 = Static118.anInt2914;
		local7.anIntArray154 = Static40.anIntArray84;
		local7.anInt1352 = Static66.anIntArray192[0];
		local7.anInt1350 = Static5.anIntArray8[0];
		local7.anInt1351 = Static48.anIntArray157[0];
		local7.anInt1353 = Static29.anInt778;
		local7.aByteArray8 = Static116.aByteArrayArray10[0];
		local7.anInt1355 = Static40.anIntArray85[0];
		Static74.method676();
		return local7;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIZI[I)V")
	public static void method1410(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		Static64.aClass7_76.method699();
		Static49.aClass5_Sub1_Sub10_Sub1_13.method921(0, 0);
		if (arg1) {
			if (arg3[arg2] != -1) {
				if (arg2 == 0) {
					Static88.aClass5_Sub1_Sub10_Sub1_21.method921(22, 10);
				}
				if (arg2 == 1) {
					Static36.aClass5_Sub1_Sub10_Sub1_10.method921(54, 8);
				}
				if (arg2 == 2) {
					Static36.aClass5_Sub1_Sub10_Sub1_10.method921(82, 8);
				}
				if (arg2 == 3) {
					Static17.aClass5_Sub1_Sub10_Sub1_8.method921(110, 8);
				}
				if (arg2 == 4) {
					Static98.aClass5_Sub1_Sub10_Sub1_17.method921(153, 8);
				}
				if (arg2 == 5) {
					Static98.aClass5_Sub1_Sub10_Sub1_17.method921(181, 8);
				}
				if (arg2 == 6) {
					Static3.aClass5_Sub1_Sub10_Sub1_1.method921(209, 9);
				}
			}
			if (arg3[0] != -1 && arg0 != 0) {
				Static114.aClass5_Sub1_Sub10_Sub1Array9[0].method921(29, 13);
			}
			if (arg3[1] != -1 && arg0 != 1) {
				Static114.aClass5_Sub1_Sub10_Sub1Array9[1].method921(53, 11);
			}
			if (arg3[2] != -1 && arg0 != 2) {
				Static114.aClass5_Sub1_Sub10_Sub1Array9[2].method921(82, 11);
			}
			if (arg3[3] != -1 && arg0 != 3) {
				Static114.aClass5_Sub1_Sub10_Sub1Array9[3].method921(115, 12);
			}
			if (arg3[4] != -1 && arg0 != 4) {
				Static114.aClass5_Sub1_Sub10_Sub1Array9[4].method921(153, 13);
			}
			if (arg3[5] != -1 && arg0 != 5) {
				Static114.aClass5_Sub1_Sub10_Sub1Array9[5].method921(180, 11);
			}
			if (arg3[6] != -1 && arg0 != 6) {
				Static114.aClass5_Sub1_Sub10_Sub1Array9[6].method921(208, 13);
			}
		}
		Static16.aClass7_22.method699();
		Static8.aClass5_Sub1_Sub10_Sub1_4.method921(0, 0);
		if (arg1) {
			if (arg3[arg2] != -1) {
				if (arg2 == 7) {
					Static79.aClass5_Sub1_Sub10_Sub1_18.method921(42, 0);
				}
				if (arg2 == 8) {
					Static77.aClass5_Sub1_Sub10_Sub1_16.method921(74, 0);
				}
				if (arg2 == 9) {
					Static77.aClass5_Sub1_Sub10_Sub1_16.method921(102, 0);
				}
				if (arg2 == 10) {
					Static93.aClass5_Sub1_Sub10_Sub1_22.method921(130, 1);
				}
				if (arg2 == 11) {
					Static4.aClass5_Sub1_Sub10_Sub1_2.method921(173, 0);
				}
				if (arg2 == 12) {
					Static4.aClass5_Sub1_Sub10_Sub1_2.method921(201, 0);
				}
				if (arg2 == 13) {
					Static81.aClass5_Sub1_Sub10_Sub1_19.method921(229, 0);
				}
			}
			if (arg3[8] != -1 && arg0 != 8) {
				Static114.aClass5_Sub1_Sub10_Sub1Array9[7].method921(74, 2);
			}
			if (arg3[9] != -1 && arg0 != 9) {
				Static114.aClass5_Sub1_Sub10_Sub1Array9[8].method921(102, 3);
			}
			if (arg3[10] != -1 && arg0 != 10) {
				Static114.aClass5_Sub1_Sub10_Sub1Array9[9].method921(137, 4);
			}
			if (arg3[11] != -1 && arg0 != 11) {
				Static114.aClass5_Sub1_Sub10_Sub1Array9[10].method921(174, 2);
			}
			if (arg3[12] != -1 && arg0 != 12) {
				Static114.aClass5_Sub1_Sub10_Sub1Array9[11].method921(201, 2);
			}
			if (arg3[13] != -1 && arg0 != 13) {
				Static114.aClass5_Sub1_Sub10_Sub1Array9[12].method921(226, 2);
			}
		}
		try {
			@Pc(342) Graphics local342 = Static105.aCanvas1.getGraphics();
			Static64.aClass7_76.method697(516, local342, 160);
			Static16.aClass7_22.method697(496, local342, 466);
		} catch (@Pc(361) Exception local361) {
			Static105.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(Z)Z")
	public static boolean method1411() {
		if (Static58.aClass35_2 == null) {
			return false;
		}
		@Pc(165) int local165;
		try {
			@Pc(13) int local13 = Static58.aClass35_2.method965();
			if (local13 == 0) {
				return false;
			}
			if (Static8.anInt283 == -1) {
				Static58.aClass35_2.method968(0, Static86.aClass5_Sub11_Sub1_12.aByteArray23, 1);
				local13--;
				Static86.aClass5_Sub11_Sub1_12.anInt2233 = 0;
				Static8.anInt283 = Static86.aClass5_Sub11_Sub1_12.method1561();
				Static57.anInt1482 = Static117.anIntArray289[Static8.anInt283];
			}
			if (Static57.anInt1482 == -1) {
				if (local13 <= 0) {
					return false;
				}
				local13--;
				Static58.aClass35_2.method968(0, Static86.aClass5_Sub11_Sub1_12.aByteArray23, 1);
				Static57.anInt1482 = Static86.aClass5_Sub11_Sub1_12.aByteArray23[0] & 0xFF;
			}
			if (Static57.anInt1482 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static58.aClass35_2.method968(0, Static86.aClass5_Sub11_Sub1_12.aByteArray23, 2);
				Static86.aClass5_Sub11_Sub1_12.anInt2233 = 0;
				local13 -= 2;
				Static57.anInt1482 = Static86.aClass5_Sub11_Sub1_12.method1543();
			}
			if (local13 < Static57.anInt1482) {
				return false;
			}
			Static86.aClass5_Sub11_Sub1_12.anInt2233 = 0;
			Static58.aClass35_2.method968(0, Static86.aClass5_Sub11_Sub1_12.aByteArray23, Static57.anInt1482);
			Static40.anInt716 = 0;
			Static92.anInt2246 = Static38.anInt1019;
			Static38.anInt1019 = Static51.anInt1421;
			Static51.anInt1421 = Static8.anInt283;
			@Pc(174) int local174;
			@Pc(189) int local189;
			@Pc(159) int local159;
			@Pc(184) int local184;
			@Pc(200) int local200;
			@Pc(179) int local179;
			if (Static8.anInt283 == 34) {
				Static26.aBoolean59 = true;
				Static70.anInt1720 = Static86.aClass5_Sub11_Sub1_12.method1546();
				Static79.anInt1934 = Static86.aClass5_Sub11_Sub1_12.method1546();
				Static109.anInt2625 = Static86.aClass5_Sub11_Sub1_12.method1543();
				Static9.anInt296 = Static86.aClass5_Sub11_Sub1_12.method1546();
				Static65.anInt1633 = Static86.aClass5_Sub11_Sub1_12.method1546();
				if (Static65.anInt1633 >= 100) {
					local159 = Static70.anInt1720 * 128 + 64;
					local165 = Static79.anInt1934 * 128 + 64;
					local174 = Static26.method989(local159, Static23.anInt728, local165) - Static109.anInt2625;
					local179 = local174 - Static5.anInt202;
					local184 = local159 - Static37.anInt572;
					local189 = local165 - Static1.anInt1;
					local200 = (int) Math.sqrt((double) (local184 * local184 + local189 * local189));
					Static31.anInt815 = (int) (Math.atan2((double) local179, (double) local200) * 325.949D) & 0x7FF;
					Static4.anInt171 = (int) (-325.949D * Math.atan2((double) local184, (double) local189)) & 0x7FF;
					if (Static31.anInt815 < 128) {
						Static31.anInt815 = 128;
					}
					if (Static31.anInt815 > 383) {
						Static31.anInt815 = 383;
					}
				}
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 194) {
				if (Static95.anInt2286 != -1) {
					Static117.method1924(Static95.anInt2286);
					Static28.aBoolean33 = true;
					Static16.aBoolean22 = true;
					Static95.anInt2286 = -1;
				}
				if (Static62.anInt1577 != -1) {
					Static117.method1924(Static62.anInt1577);
					Static68.aBoolean72 = true;
					Static62.anInt1577 = -1;
				}
				if (Static68.anInt1659 != -1) {
					Static117.method1924(Static68.anInt1659);
					Static68.anInt1659 = -1;
					Static27.method571(30);
				}
				if (Static75.anInt1857 != -1) {
					Static117.method1924(Static75.anInt1857);
					Static75.anInt1857 = -1;
				}
				if (Static47.anInt1298 != -1) {
					Static117.method1924(Static47.anInt1298);
					Static47.anInt1298 = -1;
				}
				Static88.anInt2058 = -1;
				Static8.anInt283 = -1;
				if (Static77.anInt1917 != 0) {
					Static77.anInt1917 = 0;
					Static68.aBoolean72 = true;
				}
				return true;
			}
			if (Static8.anInt283 == 146) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1513();
				local165 = Static86.aClass5_Sub11_Sub1_12.method1543();
				Static70.anIntArray214[local165] = local159;
				if (Static23.anIntArray87[local165] != local159) {
					Static23.anIntArray87[local165] = local159;
					Static82.method1345(local165);
					if (Static7.anInt275 != -1) {
						Static68.aBoolean72 = true;
					}
					Static28.aBoolean33 = true;
				}
				Static8.anInt282 = Static95.anInt2285;
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 181) {
				Static100.anInt2361 = Static86.aClass5_Sub11_Sub1_12.method1533();
				Static93.anInt2254 = Static86.aClass5_Sub11_Sub1_12.method1502();
				for (local159 = Static100.anInt2361; local159 < Static100.anInt2361 + 8; local159++) {
					for (local165 = Static93.anInt2254; local165 < Static93.anInt2254 + 8; local165++) {
						if (Static34.aClass52ArrayArrayArray1[Static23.anInt728][local159][local165] != null) {
							Static34.aClass52ArrayArrayArray1[Static23.anInt728][local159][local165] = null;
							Static112.method1748(local165, local159);
						}
					}
				}
				for (@Pc(418) Class5_Sub6 local418 = (Class5_Sub6) Static2.aClass52_10.method1358(); local418 != null; local418 = (Class5_Sub6) Static2.aClass52_10.method1363()) {
					if (local418.anInt1580 >= Static100.anInt2361 && Static100.anInt2361 + 8 > local418.anInt1580 && Static93.anInt2254 <= local418.anInt1587 && local418.anInt1587 < Static93.anInt2254 + 8 && local418.anInt1578 == Static23.anInt728) {
						local418.anInt1582 = 0;
					}
				}
				Static8.anInt283 = -1;
				return true;
			}
			@Pc(473) Class71 local473;
			if (Static8.anInt283 == 177) {
				local473 = Static86.aClass5_Sub11_Sub1_12.method1541();
				@Pc(480) Object[] local480 = new Object[local473.method1784() + 1];
				for (local174 = local473.method1784() - 1; local174 >= 0; local174--) {
					if (local473.method1804(local174) == 115) {
						local480[local174 + 1] = Static86.aClass5_Sub11_Sub1_12.method1541();
					} else {
						local480[local174 + 1] = Integer.valueOf(Static86.aClass5_Sub11_Sub1_12.method1540());
					}
				}
				local480[0] = Integer.valueOf(Static86.aClass5_Sub11_Sub1_12.method1540());
				Static53.method972(0, null, local480, 0, 0, null);
				Static8.anInt283 = -1;
				return true;
			}
			@Pc(568) Class5_Sub1_Sub11 local568;
			if (Static8.anInt283 == 95) {
				@Pc(560) boolean local560 = Static86.aClass5_Sub11_Sub1_12.method1533() == 1;
				local165 = Static86.aClass5_Sub11_Sub1_12.method1510();
				local568 = Static118.method1937(local165);
				Static8.anInt283 = -1;
				local568.aBoolean78 = local560;
				return true;
			}
			if (Static8.anInt283 == 123) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1510();
				local165 = Static86.aClass5_Sub11_Sub1_12.method1539();
				local184 = local165 >> 5 & 0x1F;
				local174 = local165 >> 10 & 0x1F;
				local179 = local165 & 0x1F;
				@Pc(608) Class5_Sub1_Sub11 local608 = Static118.method1937(local159);
				Static8.anInt283 = -1;
				local608.anInt1777 = (local184 << 11) + (local174 << 19) + (local179 << 3);
				return true;
			}
			if (Static8.anInt283 == 171) {
				Static14.method406(false);
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 254) {
				Static42.anInt1083 = Static86.aClass5_Sub11_Sub1_12.method1549() * 30;
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 9) {
				Static14.anInt496 = Static86.aClass5_Sub11_Sub1_12.method1543();
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 71) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1529();
				local165 = Static86.aClass5_Sub11_Sub1_12.method1540();
				local568 = Static118.method1937(local165);
				if (local568 != null && local568.anInt1790 == 0) {
					if (local568.anInt1809 - local568.anInt1801 < local159) {
						local159 = local568.anInt1809 - local568.anInt1801;
					}
					if (local159 < 0) {
						local159 = 0;
					}
					local568.anInt1774 = local159;
				}
				Static8.anInt283 = -1;
				return true;
			}
			@Pc(725) long local725;
			if (Static8.anInt283 == 14) {
				local725 = Static86.aClass5_Sub11_Sub1_12.method1537();
				@Pc(731) Class71 local731 = Static66.method1130(Static86.aClass5_Sub11_Sub1_12).method1797();
				Static92.method1500(6, local731, Static88.method1396(local725).method1803());
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 90) {
				Static29.method578();
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 18) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1503();
				local165 = Static86.aClass5_Sub11_Sub1_12.method1540();
				local568 = Static118.method1937(local165);
				if (local159 != local568.anInt1788 || local159 == -1) {
					local568.anInt1767 = 0;
					local568.anInt1798 = 0;
					local568.anInt1788 = local159;
				}
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 140) {
				local725 = Static86.aClass5_Sub11_Sub1_12.method1537();
				local174 = Static86.aClass5_Sub11_Sub1_12.method1543();
				local184 = Static86.aClass5_Sub11_Sub1_12.method1546();
				@Pc(815) Class71 local815 = Static88.method1396(local725).method1803();
				for (local189 = 0; local189 < Static68.anInt1685; local189++) {
					if (Static57.aLongArray6[local189] == local725) {
						if (local174 != Static70.anIntArray216[local189]) {
							Static70.anIntArray216[local189] = local174;
							Static28.aBoolean33 = true;
							if (local174 > 0) {
								Static92.method1500(5, Static74.method677(new Class71[] { local815, Static19.aClass71_359 }), Static38.aClass71_568);
							}
							if (local174 == 0) {
								Static92.method1500(5, Static74.method677(new Class71[] { local815, Static95.aClass71_1114 }), Static38.aClass71_568);
							}
						}
						local815 = null;
						Static82.anIntArray247[local189] = local184;
						break;
					}
				}
				if (local815 != null && Static68.anInt1685 < 200) {
					Static57.aLongArray6[Static68.anInt1685] = local725;
					Static81.aClass71Array13[Static68.anInt1685] = local815;
					Static70.anIntArray216[Static68.anInt1685] = local174;
					Static82.anIntArray247[Static68.anInt1685] = local184;
					Static68.anInt1685++;
					Static8.anInt282 = Static95.anInt2285;
					Static28.aBoolean33 = true;
				}
				@Pc(924) boolean local924 = false;
				while (!local924) {
					local924 = true;
					for (@Pc(930) int local930 = 0; local930 < Static68.anInt1685 - 1; local930++) {
						if (Static70.anIntArray216[local930] != Static69.anInt1704 && Static69.anInt1704 == Static70.anIntArray216[local930 + 1] || Static70.anIntArray216[local930] == 0 && Static70.anIntArray216[local930 + 1] != 0) {
							local924 = false;
							@Pc(967) int local967 = Static70.anIntArray216[local930];
							Static70.anIntArray216[local930] = Static70.anIntArray216[local930 + 1];
							Static70.anIntArray216[local930 + 1] = local967;
							@Pc(985) Class71 local985 = Static81.aClass71Array13[local930];
							Static81.aClass71Array13[local930] = Static81.aClass71Array13[local930 + 1];
							Static81.aClass71Array13[local930 + 1] = local985;
							@Pc(1003) long local1003 = Static57.aLongArray6[local930];
							Static57.aLongArray6[local930] = Static57.aLongArray6[local930 + 1];
							Static57.aLongArray6[local930 + 1] = local1003;
							@Pc(1021) int local1021 = Static82.anIntArray247[local930];
							Static82.anIntArray247[local930] = Static82.anIntArray247[local930 + 1];
							Static82.anIntArray247[local930 + 1] = local1021;
							Static28.aBoolean33 = true;
						}
					}
				}
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 193) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1546();
				local165 = Static86.aClass5_Sub11_Sub1_12.method1546();
				local174 = Static86.aClass5_Sub11_Sub1_12.method1546();
				local184 = Static86.aClass5_Sub11_Sub1_12.method1546();
				Static50.aBooleanArray10[local159] = true;
				Static17.anIntArray76[local159] = local165;
				Static61.anIntArray176[local159] = local174;
				Static20.anIntArray80[local159] = local184;
				Static61.anIntArray177[local159] = 0;
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 187) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1539();
				local165 = Static86.aClass5_Sub11_Sub1_12.method1539();
				Static1.method14(local165);
				if (local159 != -1) {
					Static1.method14(local159);
				}
				if (Static47.anInt1298 != -1) {
					Static117.method1924(Static47.anInt1298);
					Static47.anInt1298 = -1;
				}
				if (Static95.anInt2286 != -1) {
					Static117.method1924(Static95.anInt2286);
					Static95.anInt2286 = -1;
				}
				if (Static62.anInt1577 != -1) {
					Static117.method1924(Static62.anInt1577);
					Static62.anInt1577 = -1;
				}
				if (local165 == Static68.anInt1659) {
					Static60.method1041(Static68.anInt1659);
				} else {
					Static117.method1924(Static68.anInt1659);
					Static68.anInt1659 = local165;
					Static27.method571(35);
				}
				if (local165 == Static75.anInt1857) {
					Static60.method1041(Static75.anInt1857);
				} else {
					Static117.method1924(Static75.anInt1857);
					Static75.anInt1857 = local159;
				}
				Static88.anInt2058 = -1;
				Static77.anInt1917 = 0;
				Static117.method1934(Static68.anInt1659);
				Static117.method1934(Static75.anInt1857);
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 100) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1513();
				local165 = Static86.aClass5_Sub11_Sub1_12.method1539();
				local568 = Static118.method1937(local159);
				Static8.anInt283 = -1;
				local568.anInt1766 = 2;
				local568.anInt1819 = local165;
				return true;
			}
			if (Static8.anInt283 == 204) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1539();
				local165 = Static86.aClass5_Sub11_Sub1_12.method1529();
				if (Static62.anInt1577 != -1) {
					Static117.method1924(Static62.anInt1577);
					Static62.anInt1577 = -1;
					Static68.aBoolean72 = true;
				}
				if (Static68.anInt1659 != -1) {
					Static117.method1924(Static68.anInt1659);
					Static68.anInt1659 = -1;
					Static27.method571(30);
				}
				if (Static75.anInt1857 != -1) {
					Static117.method1924(Static75.anInt1857);
					Static75.anInt1857 = -1;
				}
				if (local165 == Static47.anInt1298) {
					Static60.method1041(Static47.anInt1298);
				} else {
					Static117.method1924(Static47.anInt1298);
					Static47.anInt1298 = local165;
				}
				if (local159 == Static95.anInt2286) {
					Static60.method1041(Static95.anInt2286);
				} else {
					Static117.method1924(Static95.anInt2286);
					Static95.anInt2286 = local159;
				}
				Static28.aBoolean33 = true;
				Static88.anInt2058 = -1;
				Static16.aBoolean22 = true;
				if (Static77.anInt1917 != 0) {
					Static77.anInt1917 = 0;
					Static68.aBoolean72 = true;
				}
				Static117.method1934(Static47.anInt1298);
				Static117.method1934(Static95.anInt2286);
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 209) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1544();
				if (Static7.anInt275 != local159) {
					Static117.method1924(Static7.anInt275);
					Static7.anInt275 = local159;
				}
				Static68.aBoolean72 = true;
				Static117.method1934(Static7.anInt275);
				Static8.anInt283 = -1;
				return true;
			}
			@Pc(1374) Class5_Sub1_Sub11 local1374;
			if (Static8.anInt283 == 244) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1510();
				local165 = Static86.aClass5_Sub11_Sub1_12.method1539();
				local174 = Static86.aClass5_Sub11_Sub1_12.method1510();
				if (local165 == 65535) {
					local165 = -1;
				}
				local1374 = Static118.method1937(local174);
				@Pc(1387) Class5_Sub1_Sub17 local1387;
				if (local1374.aBoolean75) {
					local1374.anInt1803 = local165;
					local1374.anInt1794 = local159;
					local1387 = Static33.method691(local165);
					local1374.anInt1814 = local1387.anInt2881;
					local1374.anInt1829 = local1387.anInt2871;
					local1374.anInt1810 = local1387.anInt2898;
					if (local1374.anInt1776 > 0) {
						local1374.anInt1810 = local1374.anInt1810 * 32 / local1374.anInt1776;
					}
					local1374.anInt1783 = local1387.anInt2865;
					local1374.anInt1808 = local1387.anInt2909;
					local1374.anInt1802 = local1387.anInt2873;
				} else if (local165 == -1) {
					Static8.anInt283 = -1;
					local1374.anInt1766 = 0;
					return true;
				} else {
					local1387 = Static33.method691(local165);
					local1374.anInt1829 = local1387.anInt2871;
					local1374.anInt1810 = local1387.anInt2898 * 100 / local159;
					local1374.anInt1766 = 4;
					local1374.anInt1808 = local1387.anInt2909;
					local1374.anInt1819 = local165;
				}
				Static8.anInt283 = -1;
				return true;
			}
			@Pc(1480) long local1480;
			if (Static8.anInt283 == 7) {
				local725 = Static86.aClass5_Sub11_Sub1_12.method1537();
				local1480 = Static86.aClass5_Sub11_Sub1_12.method1543();
				@Pc(1485) long local1485 = (long) Static86.aClass5_Sub11_Sub1_12.method1530();
				local200 = Static86.aClass5_Sub11_Sub1_12.method1546();
				@Pc(1491) boolean local1491 = false;
				@Pc(1497) long local1497 = local1485 + (local1480 << 32);
				for (@Pc(1499) int local1499 = 0; local1499 < 100; local1499++) {
					if (local1497 == Static56.aLongArray5[local1499]) {
						local1491 = true;
						break;
					}
				}
				if (local200 <= 1) {
					for (@Pc(1526) int local1526 = 0; local1526 < Static33.anInt935; local1526++) {
						if (Static78.aLongArray4[local1526] == local725) {
							local1491 = true;
							break;
						}
					}
				}
				if (!local1491 && Static65.anInt1637 == 0) {
					Static56.aLongArray5[Static78.anInt948] = local1497;
					Static78.anInt948 = (Static78.anInt948 + 1) % 100;
					@Pc(1573) Class71 local1573 = Static66.method1130(Static86.aClass5_Sub11_Sub1_12).method1797();
					if (local200 == 2 || local200 == 3) {
						Static92.method1500(7, local1573, Static74.method677(new Class71[] { Static71.aClass71_861, Static88.method1396(local725).method1803() }));
					} else if (local200 == 1) {
						Static92.method1500(7, local1573, Static74.method677(new Class71[] { Static49.aClass71_712, Static88.method1396(local725).method1803() }));
					} else {
						Static92.method1500(3, local1573, Static88.method1396(local725).method1803());
					}
				}
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 145) {
				Static68.method1148();
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 120) {
				Static28.aBoolean33 = true;
				local159 = Static86.aClass5_Sub11_Sub1_12.method1533();
				local165 = Static86.aClass5_Sub11_Sub1_12.method1513();
				local174 = Static86.aClass5_Sub11_Sub1_12.method1533();
				Static5.anIntArray7[local159] = local165;
				Static62.anIntArray178[local159] = local174;
				Static26.anIntArray170[local159] = 1;
				for (local184 = 0; local184 < 98; local184++) {
					if (Class5_Sub1_Sub4.anIntArray83[local184] <= local165) {
						Static26.anIntArray170[local159] = local184 + 2;
					}
				}
				Static116.anInt2816 = Static95.anInt2285;
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 5) {
				Static69.anInt1701 = Static86.aClass5_Sub11_Sub1_12.method1546();
				Static8.anInt283 = -1;
				if (Static69.anInt1701 == Static64.anInt2489) {
					if (Static69.anInt1701 == 3) {
						Static64.anInt2489 = 1;
					} else {
						Static64.anInt2489 = 3;
					}
					Static28.aBoolean33 = true;
				}
				return true;
			}
			if (Static8.anInt283 == 247) {
				Static26.aBoolean59 = true;
				Static97.anInt2318 = Static86.aClass5_Sub11_Sub1_12.method1546();
				Static57.anInt1501 = Static86.aClass5_Sub11_Sub1_12.method1546();
				Static69.anInt1699 = Static86.aClass5_Sub11_Sub1_12.method1543();
				Static97.anInt2326 = Static86.aClass5_Sub11_Sub1_12.method1546();
				Static49.anInt1381 = Static86.aClass5_Sub11_Sub1_12.method1546();
				if (Static49.anInt1381 >= 100) {
					Static1.anInt1 = Static57.anInt1501 * 128 + 64;
					Static37.anInt572 = Static97.anInt2318 * 128 + 64;
					Static5.anInt202 = Static26.method989(Static37.anInt572, Static23.anInt728, Static1.anInt1) - Static69.anInt1699;
				}
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 63) {
				local473 = Static86.aClass5_Sub11_Sub1_12.method1541();
				local165 = Static86.aClass5_Sub11_Sub1_12.method1510();
				local568 = Static118.method1937(local165);
				local568.aClass71_879 = local473;
				if (local165 >> 16 == Static26.anIntArray168[Static64.anInt2489]) {
					Static28.aBoolean33 = true;
				}
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 113) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1540();
				Static31.aClass70_1 = Static111.aClass29_3.method781(local159);
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 147) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1549();
				Static1.method14(local159);
				if (Static95.anInt2286 != -1) {
					Static117.method1924(Static95.anInt2286);
					Static16.aBoolean22 = true;
					Static95.anInt2286 = -1;
					Static28.aBoolean33 = true;
				}
				if (Static62.anInt1577 != -1) {
					Static117.method1924(Static62.anInt1577);
					Static62.anInt1577 = -1;
					Static68.aBoolean72 = true;
				}
				if (Static68.anInt1659 != -1) {
					Static117.method1924(Static68.anInt1659);
					Static68.anInt1659 = -1;
					Static27.method571(30);
				}
				if (Static75.anInt1857 != -1) {
					Static117.method1924(Static75.anInt1857);
					Static75.anInt1857 = -1;
				}
				if (Static47.anInt1298 == local159) {
					Static60.method1041(Static47.anInt1298);
				} else {
					Static117.method1924(Static47.anInt1298);
					Static47.anInt1298 = local159;
				}
				if (Static77.anInt1917 != 0) {
					Static77.anInt1917 = 0;
					Static68.aBoolean72 = true;
				}
				Static88.anInt2058 = -1;
				Static117.method1934(Static47.anInt1298);
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 211) {
				Static100.anInt2361 = Static86.aClass5_Sub11_Sub1_12.method1502();
				Static93.anInt2254 = Static86.aClass5_Sub11_Sub1_12.method1516();
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 38) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1539();
				if (local159 == 65535) {
					local159 = -1;
				}
				Static73.method1211(local159);
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 242) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1506();
				local165 = Static86.aClass5_Sub11_Sub1_12.method1543();
				if (local165 == 65535) {
					local165 = -1;
				}
				Static30.method582(local159, local165);
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 44) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1502();
				local165 = Static86.aClass5_Sub11_Sub1_12.method1546();
				local174 = Static86.aClass5_Sub11_Sub1_12.method1546();
				Static23.anInt728 = local165 >> 1;
				Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.method1678((local165 & 0x1) == 1, local174, local159);
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 106) {
				Static14.method406(true);
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 77) {
				Static93.anInt2254 = Static86.aClass5_Sub11_Sub1_12.method1516();
				Static100.anInt2361 = Static86.aClass5_Sub11_Sub1_12.method1502();
				while (Static86.aClass5_Sub11_Sub1_12.anInt2233 < Static57.anInt1482) {
					Static8.anInt283 = Static86.aClass5_Sub11_Sub1_12.method1546();
					Static69.method1164();
				}
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 161) {
				Static6.anInt227 = Static86.aClass5_Sub11_Sub1_12.method1546();
				if (Static6.anInt227 == 1) {
					Static20.anInt678 = Static86.aClass5_Sub11_Sub1_12.method1543();
				}
				if (Static6.anInt227 >= 2 && Static6.anInt227 <= 6) {
					if (Static6.anInt227 == 2) {
						Static6.anInt226 = 64;
						Static29.anInt776 = 64;
					}
					if (Static6.anInt227 == 3) {
						Static6.anInt226 = 64;
						Static29.anInt776 = 0;
					}
					if (Static6.anInt227 == 4) {
						Static29.anInt776 = 128;
						Static6.anInt226 = 64;
					}
					if (Static6.anInt227 == 5) {
						Static6.anInt226 = 0;
						Static29.anInt776 = 64;
					}
					if (Static6.anInt227 == 6) {
						Static6.anInt226 = 128;
						Static29.anInt776 = 64;
					}
					Static6.anInt227 = 2;
					Static101.anInt2379 = Static86.aClass5_Sub11_Sub1_12.method1543();
					Static98.anInt1921 = Static86.aClass5_Sub11_Sub1_12.method1543();
					Static81.anInt1992 = Static86.aClass5_Sub11_Sub1_12.method1546();
				}
				if (Static6.anInt227 == 10) {
					Static40.anInt713 = Static86.aClass5_Sub11_Sub1_12.method1543();
				}
				Static8.anInt283 = -1;
				return true;
			}
			@Pc(2179) Class5_Sub1_Sub11 local2179;
			if (Static8.anInt283 == 185) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1510();
				local2179 = Static118.method1937(local159);
				for (local174 = 0; local174 < local2179.anIntArray222.length; local174++) {
					local2179.anIntArray222[local174] = -1;
					local2179.anIntArray222[local174] = 0;
				}
				Static8.anInt283 = -1;
				return true;
			}
			@Pc(2220) Class71 local2220;
			if (Static8.anInt283 == 2) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1516();
				local2220 = Static86.aClass5_Sub11_Sub1_12.method1541();
				local174 = Static86.aClass5_Sub11_Sub1_12.method1546();
				if (local159 >= 1 && local159 <= 5) {
					if (local2220.method1785(Static30.aClass71_469)) {
						local2220 = null;
					}
					Static23.aClass71Array7[local159 - 1] = local2220;
					Static21.aBooleanArray5[local159 - 1] = local174 == 0;
				}
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 164) {
				Static28.aBoolean33 = true;
				local159 = Static86.aClass5_Sub11_Sub1_12.method1540();
				local165 = Static86.aClass5_Sub11_Sub1_12.method1543();
				if (local159 >= 0) {
					local568 = Static118.method1937(local159);
				} else {
					local568 = null;
				}
				if (local568 != null) {
					for (local184 = 0; local184 < local568.anIntArray222.length; local184++) {
						local568.anIntArray222[local184] = 0;
						local568.anIntArray217[local184] = 0;
					}
				}
				Static64.method1681(local165);
				local184 = Static86.aClass5_Sub11_Sub1_12.method1543();
				for (local179 = 0; local179 < local184; local179++) {
					local189 = Static86.aClass5_Sub11_Sub1_12.method1529();
					local200 = Static86.aClass5_Sub11_Sub1_12.method1502();
					if (local200 == 255) {
						local200 = Static86.aClass5_Sub11_Sub1_12.method1547();
					}
					if (local568 != null && local179 < local568.anIntArray222.length) {
						local568.anIntArray222[local179] = local189;
						local568.anIntArray217[local179] = local200;
					}
					Static115.method1798(local200, local165, local179, local189 - 1);
				}
				Static14.anInt485 = Static95.anInt2285;
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 158) {
				Static38.aClass71_572 = Static86.aClass5_Sub11_Sub1_12.method1541();
				if (Static62.anInt1577 != -1) {
					Static117.method1924(Static62.anInt1577);
					Static62.anInt1577 = -1;
				}
				Static38.aClass71_563 = Static38.aClass71_568;
				Static58.aBoolean66 = false;
				Static77.anInt1917 = 4;
				Static8.anInt283 = -1;
				Static68.aBoolean72 = true;
				return true;
			}
			if (Static8.anInt283 == 251) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1547();
				local165 = Static86.aClass5_Sub11_Sub1_12.method1513();
				local174 = Static86.aClass5_Sub11_Sub1_12.method1543();
				if (local174 == 65535) {
					local174 = -1;
				}
				@Pc(2426) long local2426 = ((long) local159 << 32) + ((long) local174);
				@Pc(2435) Class5 local2435 = Static51.aClass57_7.method1575(local2426);
				if (local2435 != null) {
					local2435.method2002();
				}
				Static51.aClass57_7.method1581(local2426, new Class5_Sub14(local165));
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 92) {
				for (local159 = 0; local159 < Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1.length; local159++) {
					if (Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local159] != null) {
						Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local159].anInt2458 = -1;
					}
				}
				for (local165 = 0; local165 < Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1.length; local165++) {
					if (Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local165] != null) {
						Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local165].anInt2458 = -1;
					}
				}
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 141) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1533();
				local165 = Static86.aClass5_Sub11_Sub1_12.method1529();
				if (local165 == 65535) {
					local165 = -1;
				}
				if (local165 == Static26.anIntArray168[local159]) {
					Static60.method1041(Static26.anIntArray168[local159]);
				} else {
					Static117.method1924(Static26.anIntArray168[local159]);
					Static26.anIntArray168[local159] = local165;
				}
				Static28.aBoolean33 = true;
				Static16.aBoolean22 = true;
				Static117.method1934(Static26.anIntArray168[local159]);
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 182) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1543();
				Static1.method14(local159);
				if (Static62.anInt1577 != -1) {
					Static117.method1924(Static62.anInt1577);
					Static68.aBoolean72 = true;
					Static62.anInt1577 = -1;
				}
				if (Static68.anInt1659 != -1) {
					Static117.method1924(Static68.anInt1659);
					Static68.anInt1659 = -1;
					Static27.method571(30);
				}
				if (Static75.anInt1857 != -1) {
					Static117.method1924(Static75.anInt1857);
					Static75.anInt1857 = -1;
				}
				if (Static47.anInt1298 != -1) {
					Static117.method1924(Static47.anInt1298);
					Static47.anInt1298 = -1;
				}
				if (local159 == Static95.anInt2286) {
					Static60.method1041(Static95.anInt2286);
				} else {
					Static117.method1924(Static95.anInt2286);
					Static95.anInt2286 = local159;
				}
				Static28.aBoolean33 = true;
				Static88.anInt2058 = -1;
				if (Static77.anInt1917 != 0) {
					Static77.anInt1917 = 0;
					Static68.aBoolean72 = true;
				}
				Static16.aBoolean22 = true;
				Static117.method1934(Static95.anInt2286);
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 133) {
				Static28.aBoolean33 = true;
				local159 = Static86.aClass5_Sub11_Sub1_12.method1540();
				local165 = Static86.aClass5_Sub11_Sub1_12.method1543();
				if (local159 < 0) {
					local568 = null;
				} else {
					local568 = Static118.method1937(local159);
				}
				while (Static57.anInt1482 > Static86.aClass5_Sub11_Sub1_12.anInt2233) {
					local184 = Static86.aClass5_Sub11_Sub1_12.method1535();
					local189 = 0;
					local179 = Static86.aClass5_Sub11_Sub1_12.method1543();
					if (local179 != 0) {
						local189 = Static86.aClass5_Sub11_Sub1_12.method1546();
						if (local189 == 255) {
							local189 = Static86.aClass5_Sub11_Sub1_12.method1540();
						}
					}
					if (local568 != null && local184 >= 0 && local184 < local568.anIntArray222.length) {
						local568.anIntArray222[local184] = local179;
						local568.anIntArray217[local184] = local189;
					}
					Static115.method1798(local189, local165, local184, local179 - 1);
				}
				Static8.anInt283 = -1;
				Static14.anInt485 = Static95.anInt2285;
				return true;
			}
			if (Static8.anInt283 == 54) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1511();
				if (local159 >= 0) {
					Static1.method14(local159);
				}
				if (Static56.anInt1451 != local159) {
					Static117.method1924(Static56.anInt1451);
					Static56.anInt1451 = local159;
				}
				Static117.method1934(Static56.anInt1451);
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 69 || Static8.anInt283 == 225 || Static8.anInt283 == 98 || Static8.anInt283 == 160 || Static8.anInt283 == 227 || Static8.anInt283 == 12 || Static8.anInt283 == 196 || Static8.anInt283 == 132 || Static8.anInt283 == 55 || Static8.anInt283 == 241 || Static8.anInt283 == 124) {
				Static69.method1164();
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 78) {
				Static16.anInt518 = Static86.aClass5_Sub11_Sub1_12.method1546();
				Static60.anInt1551 = Static86.aClass5_Sub11_Sub1_12.method1546();
				Static93.anInt2252 = Static86.aClass5_Sub11_Sub1_12.method1546();
				Static68.aBoolean72 = true;
				Static8.anInt283 = -1;
				Static99.aBoolean103 = true;
				return true;
			}
			if (Static8.anInt283 == 108) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1549();
				local165 = Static86.aClass5_Sub11_Sub1_12.method1529();
				local174 = Static86.aClass5_Sub11_Sub1_12.method1513();
				local184 = Static86.aClass5_Sub11_Sub1_12.method1549();
				@Pc(2874) Class5_Sub1_Sub11 local2874 = Static118.method1937(local174);
				local2874.anInt1808 = local165;
				local2874.anInt1829 = local184;
				Static8.anInt283 = -1;
				local2874.anInt1810 = local159;
				return true;
			}
			if (Static8.anInt283 == 45) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1547();
				local165 = Static86.aClass5_Sub11_Sub1_12.method1529();
				local568 = Static118.method1937(local159);
				local568.anInt1766 = 1;
				Static8.anInt283 = -1;
				local568.anInt1819 = local165;
				return true;
			}
			if (Static8.anInt283 == 138) {
				Static41.anInt1068 = 0;
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 153) {
				Static42.method769(Static57.anInt1482, Static86.aClass5_Sub11_Sub1_12, Static111.aClass29_3);
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 136) {
				Static33.anInt935 = Static57.anInt1482 / 8;
				for (local159 = 0; local159 < Static33.anInt935; local159++) {
					Static78.aLongArray4[local159] = Static86.aClass5_Sub11_Sub1_12.method1537();
				}
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 216) {
				if (Static64.anInt2489 == 12) {
					Static28.aBoolean33 = true;
				}
				Static16.anInt515 = Static86.aClass5_Sub11_Sub1_12.method1544();
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 79) {
				Static26.aBoolean59 = false;
				for (local159 = 0; local159 < 5; local159++) {
					Static50.aBooleanArray10[local159] = false;
				}
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 57) {
				local473 = Static86.aClass5_Sub11_Sub1_12.method1541();
				@Pc(3034) boolean local3034;
				if (local473.method1788(Static30.aClass71_465)) {
					local2220 = local473.method1800(local473.method1790(Static77.aClass71_938), 0);
					local3034 = false;
					local1480 = local2220.method1817();
					for (local189 = 0; local189 < Static33.anInt935; local189++) {
						if (Static78.aLongArray4[local189] == local1480) {
							local3034 = true;
							break;
						}
					}
					if (!local3034 && Static65.anInt1637 == 0) {
						Static92.method1500(4, Static117.aClass71_1369, local2220);
					}
				} else if (local473.method1788(Static68.aClass71_826)) {
					local3034 = false;
					local2220 = local473.method1800(local473.method1790(Static77.aClass71_938), 0);
					local1480 = local2220.method1817();
					for (local189 = 0; local189 < Static33.anInt935; local189++) {
						if (local1480 == Static78.aLongArray4[local189]) {
							local3034 = true;
							break;
						}
					}
					if (!local3034 && Static65.anInt1637 == 0) {
						Static92.method1500(8, Static101.aClass71_1188, local2220);
					}
				} else if (local473.method1788(Static14.aClass71_302)) {
					local2220 = local473.method1800(local473.method1790(Static77.aClass71_938), 0);
					local1480 = local2220.method1817();
					local3034 = false;
					for (local189 = 0; local189 < Static33.anInt935; local189++) {
						if (local1480 == Static78.aLongArray4[local189]) {
							local3034 = true;
							break;
						}
					}
					if (!local3034 && Static65.anInt1637 == 0) {
						@Pc(3144) Class71 local3144 = local473.method1800(local473.method1784() - 9, local473.method1790(Static77.aClass71_938) + 1);
						Static92.method1500(8, local3144, local2220);
					}
				} else {
					Static92.method1500(0, local473, Static38.aClass71_568);
				}
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 17) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1549();
				Static5.method151(local159);
				Static14.anInt485 = Static95.anInt2285;
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 134) {
				Static66.method1134();
				Static8.anInt283 = -1;
				return false;
			}
			if (Static8.anInt283 == 30) {
				Static39.anInt1031 = Static86.aClass5_Sub11_Sub1_12.method1546();
				Static8.anInt282 = Static95.anInt2285;
				Static28.aBoolean33 = true;
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 231) {
				for (local159 = 0; local159 < Static75.anInt1856; local159++) {
					@Pc(3261) Class5_Sub1_Sub9 local3261 = Static56.method993(local159);
					if (local3261 != null && local3261.anInt1113 == 0) {
						Static70.anIntArray214[local159] = 0;
						Static23.anIntArray87[local159] = 0;
					}
				}
				Static8.anInt283 = -1;
				Static28.aBoolean33 = true;
				Static8.anInt282 = Static95.anInt2285;
				if (Static7.anInt275 != -1) {
					Static68.aBoolean72 = true;
				}
				return true;
			}
			if (Static8.anInt283 == 117) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1513();
				local165 = Static86.aClass5_Sub11_Sub1_12.method1539();
				local174 = Static86.aClass5_Sub11_Sub1_12.method1543();
				local1374 = Static118.method1937(local159);
				local1374.anInt1771 = (local165 << 16) + local174;
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 188) {
				for (local159 = 0; local159 < Static23.anIntArray87.length; local159++) {
					if (Static23.anIntArray87[local159] != Static70.anIntArray214[local159]) {
						Static23.anIntArray87[local159] = Static70.anIntArray214[local159];
						Static82.method1345(local159);
						Static28.aBoolean33 = true;
					}
				}
				Static8.anInt283 = -1;
				Static8.anInt282 = Static95.anInt2285;
				return true;
			}
			if (Static8.anInt283 == 197) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1543();
				local165 = Static86.aClass5_Sub11_Sub1_12.method1546();
				local174 = Static86.aClass5_Sub11_Sub1_12.method1543();
				Static38.method738(local159, local174, local165);
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 104) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1529();
				@Pc(3399) byte local3399 = Static86.aClass5_Sub11_Sub1_12.method1520();
				Static70.anIntArray214[local159] = local3399;
				if (Static23.anIntArray87[local159] != local3399) {
					Static23.anIntArray87[local159] = local3399;
					Static82.method1345(local159);
					Static28.aBoolean33 = true;
					if (Static7.anInt275 != -1) {
						Static68.aBoolean72 = true;
					}
				}
				Static8.anInt282 = Static95.anInt2285;
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 116) {
				Static64.anInt2489 = Static86.aClass5_Sub11_Sub1_12.method1546();
				Static16.aBoolean22 = true;
				Static8.anInt283 = -1;
				Static28.aBoolean33 = true;
				return true;
			}
			if (Static8.anInt283 == 176) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1511();
				local165 = Static86.aClass5_Sub11_Sub1_12.method1540();
				local174 = Static86.aClass5_Sub11_Sub1_12.method1503();
				local1374 = Static118.method1937(local165);
				local1374.anInt1817 = local1374.anInt1799 + local159;
				local1374.anInt1804 = local174 + local1374.anInt1795;
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 149) {
				Static119.anInt2958 = Static86.aClass5_Sub11_Sub1_12.method1546();
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 125) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1539();
				Static1.method14(local159);
				if (Static95.anInt2286 != -1) {
					Static117.method1924(Static95.anInt2286);
					Static95.anInt2286 = -1;
					Static28.aBoolean33 = true;
					Static16.aBoolean22 = true;
				}
				if (Static68.anInt1659 != -1) {
					Static117.method1924(Static68.anInt1659);
					Static68.anInt1659 = -1;
					Static27.method571(30);
				}
				if (Static75.anInt1857 != -1) {
					Static117.method1924(Static75.anInt1857);
					Static75.anInt1857 = -1;
				}
				if (Static47.anInt1298 != -1) {
					Static117.method1924(Static47.anInt1298);
					Static47.anInt1298 = -1;
				}
				if (Static62.anInt1577 == local159) {
					Static60.method1041(Static62.anInt1577);
				} else {
					Static117.method1924(Static62.anInt1577);
					Static62.anInt1577 = local159;
				}
				Static88.anInt2058 = -1;
				Static117.method1934(Static62.anInt1577);
				Static68.aBoolean72 = true;
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 174) {
				if (Static62.anInt1577 != -1) {
					Static117.method1924(Static62.anInt1577);
					Static62.anInt1577 = -1;
				}
				Static68.aBoolean72 = true;
				Static58.aBoolean66 = false;
				Static38.aClass71_563 = Static38.aClass71_568;
				Static8.anInt283 = -1;
				Static77.anInt1917 = 1;
				return true;
			}
			if (Static8.anInt283 == 162) {
				local159 = Static86.aClass5_Sub11_Sub1_12.method1513();
				local2179 = Static118.method1937(local159);
				local2179.anInt1766 = 3;
				local2179.anInt1819 = Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.aClass32_2.method931();
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 53) {
				Static66.anInt1647 = Static86.aClass5_Sub11_Sub1_12.method1546();
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 85) {
				if (Static64.anInt2489 == 12) {
					Static28.aBoolean33 = true;
				}
				Static117.anInt2910 = Static86.aClass5_Sub11_Sub1_12.method1546();
				Static8.anInt283 = -1;
				return true;
			}
			if (Static8.anInt283 == 214) {
				if (Static62.anInt1577 != -1) {
					Static117.method1924(Static62.anInt1577);
					Static62.anInt1577 = -1;
				}
				Static77.anInt1917 = 2;
				Static68.aBoolean72 = true;
				Static8.anInt283 = -1;
				Static38.aClass71_563 = Static38.aClass71_568;
				Static58.aBoolean66 = false;
				return true;
			}
			Static93.method1558("T1 - " + Static8.anInt283 + "," + Static38.anInt1019 + "," + Static92.anInt2246 + " - " + Static57.anInt1482, null);
			Static66.method1134();
		} catch (@Pc(3706) IOException local3706) {
			Static61.method1042();
		} catch (@Pc(3710) Exception local3710) {
			@Pc(3752) String local3752 = "T2 - " + Static8.anInt283 + "," + Static38.anInt1019 + "," + Static92.anInt2246 + " - " + Static57.anInt1482 + "," + (Static48.anInt1367 + Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0]) + "," + (Static76.anInt1884 + Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0]) + " - ";
			for (local165 = 0; local165 < Static57.anInt1482 && local165 < 50; local165++) {
				local3752 = local3752 + Static86.aClass5_Sub11_Sub1_12.aByteArray23[local165] + ",";
			}
			Static93.method1558(local3752, local3710);
			Static66.method1134();
		}
		return true;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
	public static void method1412() {
		@Pc(7) int local7 = Static114.anInt2680;
		@Pc(9) int local9 = Static61.anInt1559;
		@Pc(13) int local13 = Static100.anInt2365;
		@Pc(15) int local15 = Static38.anInt1025;
		Static52.method2024(local7, local15, local13, local9, 6116423);
		Static52.method2024(local7 + 1, local15 + 1, local13 - 2, 16, 0);
		Static52.method2027(local7 + 1, local15 - -18, local13 - 2, local9 + -19, 0);
		Static35.aClass5_Sub1_Sub10_Sub4_2.method2033(Static64.aClass71_1226, local7 + 3, local15 - -14, 6116423);
		@Pc(59) int local59 = Static26.anInt1440;
		@Pc(61) int local61 = Static107.anInt2563;
		if (Static90.anInt2998 == 0) {
			local61 -= 4;
			local59 -= 4;
		}
		if (Static90.anInt2998 == 1) {
			local59 -= 205;
			local61 -= 553;
		}
		if (Static90.anInt2998 == 2) {
			local61 -= 17;
			local59 -= 357;
		}
		for (@Pc(79) int local79 = 0; local79 < Static49.anInt1394; local79++) {
			@Pc(83) int local83 = 16777215;
			@Pc(96) int local96 = local15 + (-local79 + -1 + Static49.anInt1394) * 15 + 31;
			if (local61 > local7 && local13 + local7 > local61 && local59 > local96 - 13 && local59 < local96 + 3) {
				local83 = 16776960;
			}
			Static35.aClass5_Sub1_Sub10_Sub4_2.method2049(Static24.aClass71Array8[local79], local7 + 3, local96, local83, true);
		}
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)[Lclient!vd;")
	public static Class5_Sub1_Sub10_Sub3[] method1413() {
		@Pc(8) Class5_Sub1_Sub10_Sub3[] local8 = new Class5_Sub1_Sub10_Sub3[Static87.anInt2053];
		for (@Pc(10) int local10 = 0; local10 < Static87.anInt2053; local10++) {
			@Pc(20) Class5_Sub1_Sub10_Sub3 local20 = local8[local10] = new Class5_Sub1_Sub10_Sub3();
			local20.anInt2774 = Static29.anInt778;
			local20.anInt2771 = Static118.anInt2914;
			local20.anInt2773 = Static66.anIntArray192[local10];
			local20.anInt2770 = Static40.anIntArray85[local10];
			local20.anInt2772 = Static5.anIntArray8[local10];
			local20.anInt2769 = Static48.anIntArray157[local10];
			@Pc(52) int local52 = local20.anInt2772 * local20.anInt2769;
			@Pc(56) byte[] local56 = Static116.aByteArrayArray10[local10];
			local20.anIntArray281 = new int[local52];
			for (@Pc(62) int local62 = 0; local62 < local52; local62++) {
				local20.anIntArray281[local62] = Static40.anIntArray84[local56[local62] & 0xFF];
			}
		}
		Static74.method676();
		return local8;
	}
}
