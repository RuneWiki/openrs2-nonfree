import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!u", name = "db", descriptor = "[[I")
	public static int[][] anIntArrayArray66;

	@OriginalMember(owner = "client!u", name = "eb", descriptor = "[I")
	public static int[] anIntArray378;

	@OriginalMember(owner = "client!u", name = "ib", descriptor = "Lclient!pc;")
	public static Class12 aClass12_75;

	@OriginalMember(owner = "client!u", name = "T", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1238 = Static87.method1648("blinken2:");

	@OriginalMember(owner = "client!u", name = "U", descriptor = "Z")
	public static boolean aBoolean123 = false;

	@OriginalMember(owner = "client!u", name = "V", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1239 = Static87.method1648("Loaded input handler");

	@OriginalMember(owner = "client!u", name = "W", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1240 = aClass27_1239;

	@OriginalMember(owner = "client!u", name = "Z", descriptor = "I")
	public static int anInt2574 = 0;

	@OriginalMember(owner = "client!u", name = "bb", descriptor = "I")
	public static int anInt2576 = 0;

	@OriginalMember(owner = "client!u", name = "cb", descriptor = "Z")
	public static boolean aBoolean124 = false;

	@OriginalMember(owner = "client!u", name = "jb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1241 = Static87.method1648(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!u", name = "lb", descriptor = "Z")
	public static boolean aBoolean125 = false;

	@OriginalMember(owner = "client!u", name = "mb", descriptor = "[I")
	public static int[] anIntArray379 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!hb;Lclient!td;ILclient!hb;)Lclient!ne;")
	public static Class3_Sub3_Sub2_Sub4 method1775(@OriginalArg(0) Class27 arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(3) Class27 arg2) {
		@Pc(8) int local8 = arg1.method1620(arg0);
		@Pc(19) int local19 = arg1.method1613(arg2, local8);
		return Static3.method72(local8, arg1, local19);
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(B)V")
	public static void method1777() {
		if (Static104.anInt2721 > 0) {
			Static17.method309();
		} else {
			Static109.method1459(40);
			Static52.aClass20_26 = Static91.aClass20_42;
			Static91.aClass20_42 = null;
		}
	}

	@OriginalMember(owner = "client!u", name = "g", descriptor = "(I)V")
	public static void method1778() {
		aClass27_1238 = null;
		anIntArray378 = null;
		aClass27_1239 = null;
		anIntArrayArray66 = null;
		aClass12_75 = null;
		Class3_Sub3_Sub13.anIntArray377 = null;
		anIntArray379 = null;
		aClass27_1240 = null;
		aClass27_1241 = null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "([Lclient!hb;Z)Lclient!hb;")
	public static Class27 method1779(@OriginalArg(0) Class27[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static87.method1645(arg0.length, arg0);
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(B)V")
	public static void method1781() {
		Static47.method937(false);
		@Pc(10) boolean local10 = true;
		Static66.anInt1702 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static72.aByteArrayArray9.length; local14++) {
			if (Static8.anIntArray42[local14] != -1 && Static72.aByteArrayArray9[local14] == null) {
				Static72.aByteArrayArray9[local14] = Static68.aClass54_Sub1_31.method1615(Static8.anIntArray42[local14], 0);
				if (Static72.aByteArrayArray9[local14] == null) {
					local10 = false;
					Static66.anInt1702++;
				}
			}
			if (Static13.anIntArray147[local14] != -1 && Static65.aByteArrayArray7[local14] == null) {
				Static65.aByteArrayArray7[local14] = Static68.aClass54_Sub1_31.method1601(0, Static13.anIntArray147[local14], anIntArrayArray66[local14]);
				if (Static65.aByteArrayArray7[local14] == null) {
					local10 = false;
					Static66.anInt1702++;
				}
			}
		}
		if (!local10) {
			Static24.anInt644 = 1;
			return;
		}
		local10 = true;
		Static69.anInt1787 = 0;
		@Pc(112) int local112;
		@Pc(123) int local123;
		for (@Pc(94) int local94 = 0; local94 < Static72.aByteArrayArray9.length; local94++) {
			@Pc(100) byte[] local100 = Static65.aByteArrayArray7[local94];
			if (local100 != null) {
				local112 = (Static72.anIntArray317[local94] >> 8) * 64 - Static89.anInt2464;
				local123 = (Static72.anIntArray317[local94] & 0xFF) * 64 - Static101.anInt2631;
				if (Static65.aBoolean89) {
					local112 = 10;
					local123 = 10;
				}
				local10 &= Static45.method278(local123, local112, local100);
			}
		}
		if (!local10) {
			Static24.anInt644 = 2;
			return;
		}
		if (Static24.anInt644 != 0) {
			Static35.method687(Static33.aClass27_396, true, Static47.aClass27_622);
		}
		Static106.method679();
		Static76.aClass18_1.method519();
		System.gc();
		for (@Pc(173) int local173 = 0; local173 < 4; local173++) {
			Static57.aClass49Array1[local173].method1529();
		}
		@Pc(194) int local194;
		for (local112 = 0; local112 < 4; local112++) {
			for (local123 = 0; local123 < 104; local123++) {
				for (local194 = 0; local194 < 104; local194++) {
					Static89.aByteArrayArrayArray11[local112][local123][local194] = 0;
				}
			}
		}
		Static17.method307();
		local123 = Static72.aByteArrayArray9.length;
		Static35.method685();
		Static47.method937(true);
		@Pc(246) int local246;
		@Pc(257) int local257;
		@Pc(357) int local357;
		@Pc(313) int local313;
		@Pc(368) int local368;
		if (!Static65.aBoolean89) {
			@Pc(261) byte[] local261;
			for (local194 = 0; local194 < local123; local194++) {
				local246 = (Static72.anIntArray317[local194] >> 8) * 64 - Static89.anInt2464;
				local257 = (Static72.anIntArray317[local194] & 0xFF) * 64 - Static101.anInt2631;
				local261 = Static72.aByteArrayArray9[local194];
				if (local261 != null) {
					Static41.method887((Static13.anInt762 - 6) * 8, local246, local261, (Static106.anInt831 - 6) * 8, local257, Static57.aClass49Array1);
				}
			}
			for (local246 = 0; local246 < local123; local246++) {
				local257 = (Static72.anIntArray317[local246] >> 8) * 64 - Static89.anInt2464;
				local313 = (Static72.anIntArray317[local246] & 0xFF) * 64 - Static101.anInt2631;
				@Pc(317) byte[] local317 = Static72.aByteArrayArray9[local246];
				if (local317 == null && Static106.anInt831 < 800) {
					Static80.method1538(64, 64, local257, local313);
				}
			}
			Static47.method937(true);
			for (local257 = 0; local257 < local123; local257++) {
				local261 = Static65.aByteArrayArray7[local257];
				if (local261 != null) {
					local357 = (Static72.anIntArray317[local257] & 0xFF) * 64 - Static101.anInt2631;
					local368 = (Static72.anIntArray317[local257] >> 8) * 64 - Static89.anInt2464;
					Static45.method280(Static57.aClass49Array1, Static76.aClass18_1, local261, local368, local357);
				}
			}
		}
		@Pc(429) int local429;
		@Pc(423) int local423;
		if (Static65.aBoolean89) {
			@Pc(435) int local435;
			@Pc(445) int local445;
			@Pc(447) int local447;
			for (local194 = 0; local194 < 4; local194++) {
				for (local246 = 0; local246 < 13; local246++) {
					for (local257 = 0; local257 < 13; local257++) {
						local368 = Static16.anIntArrayArrayArray1[local194][local246][local257];
						@Pc(407) boolean local407 = false;
						if (local368 != -1) {
							local357 = local368 >> 24 & 0x3;
							local423 = local368 >> 14 & 0x3FF;
							local429 = local368 >> 1 & 0x3;
							local435 = local368 >> 3 & 0x7FF;
							local445 = local435 / 8 + (local423 / 8 << 8);
							for (local447 = 0; local447 < Static72.anIntArray317.length; local447++) {
								if (Static72.anIntArray317[local447] == local445 && Static72.aByteArrayArray9[local447] != null) {
									Static64.method1181(local194, local357, local429, (local423 & 0x7) * 8, Static72.aByteArrayArray9[local447], Static57.aClass49Array1, local246 * 8, (local435 & 0x7) * 8, local257 * 8);
									local407 = true;
									break;
								}
							}
						}
						if (!local407) {
							Static86.method1636(local257 * 8, local194, local246 * 8);
						}
					}
				}
			}
			for (local246 = 0; local246 < 13; local246++) {
				for (local257 = 0; local257 < 13; local257++) {
					local313 = Static16.anIntArrayArrayArray1[0][local246][local257];
					if (local313 == -1) {
						Static80.method1538(8, 8, local246 * 8, local257 * 8);
					}
				}
			}
			Static47.method937(true);
			for (local257 = 0; local257 < 4; local257++) {
				for (local313 = 0; local313 < 13; local313++) {
					for (local368 = 0; local368 < 13; local368++) {
						local357 = Static16.anIntArrayArrayArray1[local257][local313][local368];
						if (local357 != -1) {
							local429 = local357 >> 24 & 0x3;
							local435 = local357 >> 14 & 0x3FF;
							local445 = local357 >> 3 & 0x7FF;
							local423 = local357 >> 1 & 0x3;
							local447 = (local435 / 8 << 8) + (local445 / 8);
							for (@Pc(630) int local630 = 0; local630 < Static72.anIntArray317.length; local630++) {
								if (local447 == Static72.anIntArray317[local630] && Static65.aByteArrayArray7[local630] != null) {
									Static30.method654((local435 & 0x7) * 8, local429, Static76.aClass18_1, Static57.aClass49Array1, (local445 & 0x7) * 8, local257, local313 * 8, local368 * 8, Static65.aByteArrayArray7[local630], local423);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static47.method937(true);
		Static106.method679();
		Static104.method1860(Static76.aClass18_1, Static57.aClass49Array1);
		Static47.method937(true);
		local194 = Static80.anInt2191;
		if (local194 > Static68.anInt1747) {
			local194 = Static68.anInt1747;
		}
		if (local194 < Static68.anInt1747 - 1) {
		}
		if (Static70.aBoolean94) {
			Static76.aClass18_1.method529(Static80.anInt2191);
		} else {
			Static76.aClass18_1.method529(0);
		}
		for (local246 = 0; local246 < 104; local246++) {
			for (local257 = 0; local257 < 104; local257++) {
				Static33.method669(local257, local246);
			}
		}
		Static67.method1237();
		Static10.aClass21_9.method663();
		if (Static43.aFrame1 != null) {
			Static78.aClass3_Sub11_Sub1_3.method1478(35);
			Static78.aClass3_Sub11_Sub1_3.method1425(1057001181);
		}
		if (!Static65.aBoolean89) {
			local313 = (Static13.anInt762 + 6) / 8;
			local368 = (Static106.anInt831 - 6) / 8;
			local357 = (Static106.anInt831 + 6) / 8;
			local257 = (Static13.anInt762 - 6) / 8;
			for (local429 = local257 - 1; local429 <= local313 + 1; local429++) {
				for (local423 = local368 - 1; local423 <= local357 + 1; local423++) {
					if (local257 > local429 || local429 > local313 || local368 > local423 || local423 > local357) {
						Static68.aClass54_Sub1_31.method1612(method1779(new Class27[] { Static4.aClass27_1333, Static97.method1616(local429), Static87.aClass27_1102, Static97.method1616(local423) }));
						Static68.aClass54_Sub1_31.method1612(method1779(new Class27[] { Static83.aClass27_1127, Static97.method1616(local429), Static87.aClass27_1102, Static97.method1616(local423) }));
					}
				}
			}
		}
		if (Static55.anInt1446 == -1) {
			Static109.method1459(30);
		} else {
			Static109.method1459(35);
		}
		Static20.method334();
		Static78.aClass3_Sub11_Sub1_3.method1478(159);
		Static107.method1896();
	}
}
