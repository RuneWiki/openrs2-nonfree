import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!r", name = "l", descriptor = "[I")
	public static int[] anIntArray284;

	@OriginalMember(owner = "client!r", name = "C", descriptor = "Lclient!wc;")
	public static Class4 aClass4_51;

	@OriginalMember(owner = "client!r", name = "D", descriptor = "[I")
	public static int[] anIntArray285;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "I")
	public static int anInt2244 = 0;

	@OriginalMember(owner = "client!r", name = "b", descriptor = "Lclient!a;")
	private static Class1 aClass1_2353 = Static94.method1596("Enter amount:");

	@OriginalMember(owner = "client!r", name = "d", descriptor = "Lclient!a;")
	public static Class1 aClass1_2354 = Static94.method1596("Passwort: ");

	@OriginalMember(owner = "client!r", name = "e", descriptor = "Lclient!a;")
	public static Class1 aClass1_2355 = Static94.method1596("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!r", name = "f", descriptor = "Lclient!a;")
	public static Class1 aClass1_2356 = Static94.method1596("@gre@");

	@OriginalMember(owner = "client!r", name = "g", descriptor = "Lclient!a;")
	private static Class1 aClass1_2357 = Static94.method1596("glow1:");

	@OriginalMember(owner = "client!r", name = "j", descriptor = "I")
	public static int anInt2248 = 0;

	@OriginalMember(owner = "client!r", name = "k", descriptor = "[Lclient!ad;")
	public static Class5[] aClass5Array1 = new Class5[4];

	@OriginalMember(owner = "client!r", name = "m", descriptor = "Lclient!a;")
	private static Class1 aClass1_2358 = Static94.method1596("Your ignore list is full)3 Max of 100 hit");

	@OriginalMember(owner = "client!r", name = "n", descriptor = "I")
	public static int anInt2249 = 0;

	@OriginalMember(owner = "client!r", name = "o", descriptor = "I")
	public static int anInt2250 = 0;

	@OriginalMember(owner = "client!r", name = "p", descriptor = "Lclient!a;")
	private static Class1 aClass1_2359 = Static94.method1596("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!r", name = "t", descriptor = "Lclient!a;")
	private static Class1 aClass1_2362 = Static94.method1596("Loaded wordpack");

	@OriginalMember(owner = "client!r", name = "q", descriptor = "Lclient!a;")
	public static Class1 aClass1_2360 = aClass1_2362;

	@OriginalMember(owner = "client!r", name = "r", descriptor = "Lclient!a;")
	public static Class1 aClass1_2361 = aClass1_2353;

	@OriginalMember(owner = "client!r", name = "s", descriptor = "[[I")
	public static int[][] anIntArrayArray20 = new int[104][104];

	@OriginalMember(owner = "client!r", name = "v", descriptor = "Lclient!a;")
	public static Class1 aClass1_2363 = aClass1_2359;

	@OriginalMember(owner = "client!r", name = "x", descriptor = "Lclient!a;")
	public static Class1 aClass1_2364 = aClass1_2358;

	@OriginalMember(owner = "client!r", name = "y", descriptor = "Lclient!a;")
	public static Class1 aClass1_2365 = aClass1_2357;

	@OriginalMember(owner = "client!r", name = "A", descriptor = "Lclient!a;")
	public static Class1 aClass1_2366 = Static94.method1596("");

	@OriginalMember(owner = "client!r", name = "B", descriptor = "[Lclient!a;")
	public static Class1[] aClass1Array20 = new Class1[500];

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([BI)[B")
	public static byte[] method1528(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class2_Sub3 local4 = new Class2_Sub3(arg0);
		@Pc(12) int local12 = local4.method791();
		@Pc(21) int local21 = local4.method814();
		if (local21 < 0 || Static85.anInt2261 != 0 && Static85.anInt2261 < local21) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(103) byte[] local103 = new byte[local21];
			local4.method820(local103, local21);
			return local103;
		} else {
			@Pc(45) int local45 = local4.method814();
			if (local45 < 0 || Static85.anInt2261 != 0 && local45 > Static85.anInt2261) {
				throw new RuntimeException();
			}
			@Pc(66) byte[] local66 = new byte[local45];
			if (local12 == 1) {
				Static36.method918(local66, local45, arg0, local21);
			} else {
				try {
					@Pc(82) DataInputStream local82 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, local21)));
					local82.readFully(local66);
					local82.close();
				} catch (@Pc(89) IOException local89) {
				}
			}
			return local66;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)Lclient!h;")
	public static Class2_Sub1_Sub7 method1529(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub1_Sub7 local15 = (Class2_Sub1_Sub7) Static34.aClass11_11.method431((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static94.aClass8_23.method1684(arg0, 9);
		local15 = new Class2_Sub1_Sub7();
		local15.anInt1366 = arg0;
		if (local25 != null) {
			local15.method935(new Class2_Sub3(local25));
		}
		local15.method941();
		Static34.aClass11_11.method430((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	public static void method1530() {
		Static54.method1230(false);
		Static65.anInt1940 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static1.aByteArrayArray1.length; local14++) {
			if (Static76.anIntArray265[local14] != -1 && Static1.aByteArrayArray1[local14] == null) {
				Static1.aByteArrayArray1[local14] = Static107.aClass8_Sub1_23.method1684(0, Static76.anIntArray265[local14]);
				if (Static1.aByteArrayArray1[local14] == null) {
					Static65.anInt1940++;
					local12 = false;
				}
			}
			if (Static22.anIntArray92[local14] != -1 && Static87.aByteArrayArray7[local14] == null) {
				Static87.aByteArrayArray7[local14] = Static107.aClass8_Sub1_23.method1688(Static22.anIntArray92[local14], 0, Static73.anIntArrayArray13[local14]);
				if (Static87.aByteArrayArray7[local14] == null) {
					Static65.anInt1940++;
					local12 = false;
				}
			}
		}
		if (!local12) {
			Static113.anInt2242 = 1;
			return;
		}
		local12 = true;
		Static79.anInt2096 = 0;
		@Pc(126) int local126;
		@Pc(116) int local116;
		for (@Pc(98) int local98 = 0; local98 < Static1.aByteArrayArray1.length; local98++) {
			@Pc(104) byte[] local104 = Static87.aByteArrayArray7[local98];
			if (local104 != null) {
				local116 = (Static34.anIntArray128[local98] & 0xFF) * 64 - Static47.anInt1563;
				local126 = (Static34.anIntArray128[local98] >> 8) * 64 - Static25.anInt1022;
				if (Static94.aBoolean140) {
					local126 = 10;
					local116 = 10;
				}
				local12 &= Static61.method1295(local104, local126, local116);
			}
		}
		if (!local12) {
			Static113.anInt2242 = 2;
			return;
		}
		if (Static113.anInt2242 != 0) {
			Static85.method1537(Static112.aClass1_2901, true, Static37.aClass1_1322);
		}
		Static53.method1215();
		Static109.aClass3_1.method130();
		System.gc();
		for (@Pc(171) int local171 = 0; local171 < 4; local171++) {
			aClass5Array1[local171].method198();
		}
		@Pc(194) int local194;
		for (local126 = 0; local126 < 4; local126++) {
			for (local116 = 0; local116 < 104; local116++) {
				for (local194 = 0; local194 < 104; local194++) {
					Static29.aByteArrayArrayArray2[local126][local116][local194] = 0;
				}
			}
		}
		Static110.method1797();
		local116 = Static1.aByteArrayArray1.length;
		Static65.method1344();
		Static54.method1230(true);
		@Pc(258) int local258;
		@Pc(247) int local247;
		@Pc(365) int local365;
		@Pc(314) int local314;
		@Pc(355) int local355;
		if (!Static94.aBoolean140) {
			@Pc(262) byte[] local262;
			for (local194 = 0; local194 < local116; local194++) {
				local247 = (Static34.anIntArray128[local194] & 0xFF) * 64 - Static47.anInt1563;
				local258 = (Static34.anIntArray128[local194] >> 8) * 64 - Static25.anInt1022;
				local262 = Static1.aByteArrayArray1[local194];
				if (local262 != null) {
					Static42.method979(aClass5Array1, (Static85.anInt2263 - 6) * 8, local262, local258, local247, (Static27.anInt1032 - 6) * 8);
				}
			}
			for (local258 = 0; local258 < local116; local258++) {
				local247 = (Static34.anIntArray128[local258] >> 8) * 64 - Static25.anInt1022;
				@Pc(303) byte[] local303 = Static1.aByteArrayArray1[local258];
				local314 = (Static34.anIntArray128[local258] & 0xFF) * 64 - Static47.anInt1563;
				if (local303 == null && Static27.anInt1032 < 800) {
					Static102.method1721(local314, 64, 64, local247);
				}
			}
			Static54.method1230(true);
			for (local247 = 0; local247 < local116; local247++) {
				local262 = Static87.aByteArrayArray7[local247];
				if (local262 != null) {
					local355 = (Static34.anIntArray128[local247] >> 8) * 64 - Static25.anInt1022;
					local365 = (Static34.anIntArray128[local247] & 0xFF) * 64 - Static47.anInt1563;
					Static48.method1070(local355, Static109.aClass3_1, aClass5Array1, local262, local365);
				}
			}
		}
		@Pc(409) int local409;
		@Pc(415) int local415;
		if (Static94.aBoolean140) {
			@Pc(427) int local427;
			@Pc(438) int local438;
			@Pc(440) int local440;
			for (local194 = 0; local194 < 4; local194++) {
				for (local258 = 0; local258 < 13; local258++) {
					for (local247 = 0; local247 < 13; local247++) {
						local355 = Static29.anIntArrayArrayArray6[local194][local258][local247];
						@Pc(400) boolean local400 = false;
						if (local355 != -1) {
							local409 = local355 >> 1 & 0x3;
							local415 = local355 >> 14 & 0x3FF;
							local365 = local355 >> 24 & 0x3;
							local427 = local355 >> 3 & 0x7FF;
							local438 = (local415 / 8 << 8) + (local427 / 8);
							for (local440 = 0; local440 < Static34.anIntArray128.length; local440++) {
								if (local438 == Static34.anIntArray128[local440] && Static1.aByteArrayArray1[local440] != null) {
									Static8.method296(local247 * 8, (local415 & 0x7) * 8, local365, local194, local258 * 8, (local427 & 0x7) * 8, local409, Static1.aByteArrayArray1[local440], aClass5Array1);
									local400 = true;
									break;
								}
							}
						}
						if (!local400) {
							Static69.method1818(local247 * 8, local194, local258 * 8);
						}
					}
				}
			}
			for (local258 = 0; local258 < 13; local258++) {
				for (local247 = 0; local247 < 13; local247++) {
					local314 = Static29.anIntArrayArrayArray6[0][local258][local247];
					if (local314 == -1) {
						Static102.method1721(local247 * 8, 8, 8, local258 * 8);
					}
				}
			}
			Static54.method1230(true);
			for (local247 = 0; local247 < 4; local247++) {
				for (local314 = 0; local314 < 13; local314++) {
					for (local355 = 0; local355 < 13; local355++) {
						local365 = Static29.anIntArrayArrayArray6[local247][local314][local355];
						if (local365 != -1) {
							local409 = local365 >> 24 & 0x3;
							local427 = local365 >> 14 & 0x3FF;
							local415 = local365 >> 1 & 0x3;
							local438 = local365 >> 3 & 0x7FF;
							local440 = (local427 / 8 << 8) + (local438 / 8);
							for (@Pc(620) int local620 = 0; local620 < Static34.anIntArray128.length; local620++) {
								if (local440 == Static34.anIntArray128[local620] && Static87.aByteArrayArray7[local620] != null) {
									Static45.method1024((local427 & 0x7) * 8, Static109.aClass3_1, local247, local415, local409, Static87.aByteArrayArray7[local620], local355 * 8, aClass5Array1, (local438 & 0x7) * 8, local314 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static54.method1230(true);
		Static53.method1215();
		Static34.method863(Static109.aClass3_1, aClass5Array1);
		Static54.method1230(true);
		local194 = Static108.anInt2678;
		if (Static2.anInt287 < local194) {
			local194 = Static2.anInt287;
		}
		if (local194 < Static2.anInt287 - 1) {
		}
		if (Static77.aBoolean113) {
			Static109.aClass3_1.method168(Static108.anInt2678);
		} else {
			Static109.aClass3_1.method168(0);
		}
		for (local258 = 0; local258 < 104; local258++) {
			for (local247 = 0; local247 < 104; local247++) {
				Static106.method1756(local247, local258);
			}
		}
		Static34.method867();
		Static77.aClass11_18.method435();
		if (Static63.aFrame1 != null) {
			Static59.aClass2_Sub3_Sub1_2.method841(121);
			Static59.aClass2_Sub3_Sub1_2.method829(1057001181);
		}
		if (!Static94.aBoolean140) {
			local247 = (Static85.anInt2263 - 6) / 8;
			local355 = (Static27.anInt1032 - 6) / 8;
			local365 = (Static27.anInt1032 + 6) / 8;
			local314 = (Static85.anInt2263 + 6) / 8;
			for (local409 = local247 - 1; local409 <= local314 + 1; local409++) {
				for (local415 = local355 - 1; local415 <= local365 + 1; local415++) {
					if (local247 > local409 || local409 > local314 || local415 < local355 || local415 > local365) {
						Static107.aClass8_Sub1_23.method1707(Static97.method1655(new Class1[] { Static76.aClass1_2149, Static43.method994(local409), Static12.aClass1_2753, Static43.method994(local415) }));
						Static107.aClass8_Sub1_23.method1707(Static97.method1655(new Class1[] { Static43.aClass1_1436, Static43.method994(local409), Static12.aClass1_2753, Static43.method994(local415) }));
					}
				}
			}
		}
		if (Static37.anInt1369 == -1) {
			Static29.method759(30);
		} else {
			Static29.method759(35);
		}
		Static91.method1585();
		Static59.aClass2_Sub3_Sub1_2.method841(178);
		Static38.method948();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
	public static void method1531(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(18) Class2_Sub4 local18 = (Class2_Sub4) Static14.aClass46_3.method1435(); local18 != null; local18 = (Class2_Sub4) Static14.aClass46_3.method1442()) {
			if (local18.anInt609 != -1 || local18.anIntArray60 != null) {
				@Pc(29) int local29 = 0;
				if (arg0 > local18.anInt620) {
					local29 = arg0 - local18.anInt620;
				} else if (arg0 < local18.anInt607) {
					local29 = local18.anInt607 - arg0;
				}
				if (arg3 > local18.anInt617) {
					local29 += arg3 - local18.anInt617;
				} else if (arg3 < local18.anInt614) {
					local29 += local18.anInt614 - arg3;
				}
				if (local18.anInt612 < local29 - 64 || Static53.anInt1756 == 0 || local18.anInt606 != arg1) {
					if (local18.aClass2_Sub2_Sub2_1 != null) {
						Static82.aClass2_Sub2_Sub1_1.method239(local18.aClass2_Sub2_Sub2_1);
						local18.aClass2_Sub2_Sub2_1 = null;
					}
					if (local18.aClass2_Sub2_Sub2_2 != null) {
						Static82.aClass2_Sub2_Sub1_1.method239(local18.aClass2_Sub2_Sub2_2);
						local18.aClass2_Sub2_Sub2_2 = null;
					}
				} else {
					local29 -= 64;
					if (local29 < 0) {
						local29 = 0;
					}
					@Pc(142) int local142 = (local18.anInt612 - local29) * Static53.anInt1756 / local18.anInt612;
					if (local18.aClass2_Sub2_Sub2_1 != null) {
						local18.aClass2_Sub2_Sub2_1.method1203(local142);
					} else if (local18.anInt609 >= 0) {
						@Pc(154) Class39 local154 = Static121.method1337(Static67.aClass8_Sub1_24, local18.anInt609);
						if (local154 != null) {
							@Pc(161) Class2_Sub12_Sub1 local161 = local154.method1336().method1823(Static90.aClass49_1);
							@Pc(166) Class2_Sub2_Sub2 local166 = Static118.method1210(local161, local142);
							local166.method1206(-1);
							Static82.aClass2_Sub2_Sub1_1.method232(local166);
							local18.aClass2_Sub2_Sub2_1 = local166;
						}
					}
					if (local18.aClass2_Sub2_Sub2_2 != null) {
						local18.aClass2_Sub2_Sub2_2.method1203(local142);
						if (!local18.aClass2_Sub2_Sub2_2.method1209()) {
							local18.aClass2_Sub2_Sub2_2 = null;
						}
					} else if (local18.anIntArray60 != null && (local18.anInt621 -= arg2) <= 0) {
						@Pc(203) int local203 = (int) ((double) local18.anIntArray60.length * Math.random());
						@Pc(211) Class39 local211 = Static121.method1337(Static67.aClass8_Sub1_24, local18.anIntArray60[local203]);
						if (local211 != null) {
							@Pc(218) Class2_Sub12_Sub1 local218 = local211.method1336().method1823(Static90.aClass49_1);
							@Pc(223) Class2_Sub2_Sub2 local223 = Static118.method1210(local218, local142);
							local223.method1206(0);
							Static82.aClass2_Sub2_Sub1_1.method232(local223);
							local18.anInt621 = local18.anInt619 + (int) ((double) (local18.anInt613 - local18.anInt619) * Math.random());
							local18.aClass2_Sub2_Sub2_2 = local223;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public static void method1532() {
		anIntArrayArray20 = null;
		aClass1_2357 = null;
		aClass1_2354 = null;
		aClass1_2353 = null;
		aClass1_2356 = null;
		aClass5Array1 = null;
		aClass1_2365 = null;
		aClass1_2362 = null;
		anIntArray284 = null;
		aClass1_2363 = null;
		aClass1_2366 = null;
		aClass1_2355 = null;
		aClass1_2359 = null;
		aClass1_2364 = null;
		aClass4_51 = null;
		aClass1_2360 = null;
		anIntArray285 = null;
		aClass1Array20 = null;
		aClass1_2358 = null;
		aClass1_2361 = null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!bd;)V")
	public static void method1533(@OriginalArg(1) Class8 arg0) {
		Static53.aClass8_18 = arg0;
	}
}
