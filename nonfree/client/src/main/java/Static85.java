import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ie", name = "T", descriptor = "[I")
	public static int[] anIntArray156;

	@OriginalMember(owner = "client!ie", name = "U", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_592 = Static151.method2243("::autoshadow on");

	@OriginalMember(owner = "client!ie", name = "Y", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_593 = Static151.method2243("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!ie", name = "Z", descriptor = "I")
	public static int anInt1781 = 500;

	@OriginalMember(owner = "client!ie", name = "ab", descriptor = "Z")
	public static boolean aBoolean86 = false;

	@OriginalMember(owner = "client!ie", name = "cb", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_595 = Static151.method2243("Attack");

	@OriginalMember(owner = "client!ie", name = "bb", descriptor = "Lclient!mb;")
	public static Class62 aClass62_594 = aClass62_595;

	@OriginalMember(owner = "client!ie", name = "hb", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_596 = Static151.method2243("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(Z)V")
	public static void method1202() {
		@Pc(3) boolean local3 = true;
		Static145.method2186(false);
		Static89.anInt1941 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static61.aByteArrayArray3.length; local14++) {
			if (Static12.anIntArray27[local14] != -1 && Static61.aByteArrayArray3[local14] == null) {
				Static61.aByteArrayArray3[local14] = Static153.aClass71_Sub1_16.method2130(Static12.anIntArray27[local14], 0);
				if (Static61.aByteArrayArray3[local14] == null) {
					Static89.anInt1941++;
					local3 = false;
				}
			}
			if (Static93.anIntArray197[local14] != -1 && Static122.aByteArrayArray7[local14] == null) {
				Static122.aByteArrayArray7[local14] = Static153.aClass71_Sub1_16.method2129(Static59.anIntArrayArray9[local14], 0, Static93.anIntArray197[local14]);
				if (Static122.aByteArrayArray7[local14] == null) {
					local3 = false;
					Static89.anInt1941++;
				}
			}
		}
		if (!local3) {
			Static41.anInt4504 = 1;
			return;
		}
		Static33.anInt787 = 0;
		local3 = true;
		@Pc(117) int local117;
		@Pc(128) int local128;
		for (@Pc(98) int local98 = 0; local98 < Static61.aByteArrayArray3.length; local98++) {
			@Pc(104) byte[] local104 = Static122.aByteArrayArray7[local98];
			if (local104 != null) {
				local117 = (Static84.anIntArray327[local98] >> 8) * 64 - Static116.anInt2535;
				local128 = (Static84.anIntArray327[local98] & 0xFF) * 64 - Static153.anInt3278;
				if (Static76.aBoolean77) {
					local128 = 10;
					local117 = 10;
				}
				local3 &= Static121.method1900(local128, local104, local117);
			}
		}
		if (!local3) {
			Static41.anInt4504 = 2;
			return;
		}
		if (Static41.anInt4504 != 0) {
			Static175.method2549(Static169.method2460(new Class62[] { Static17.aClass62_132, Static123.aClass62_1532 }), true);
		}
		Static8.method148();
		Static15.method242();
		Static8.method148();
		Static19.method346();
		Static8.method148();
		System.gc();
		for (@Pc(188) int local188 = 0; local188 < 4; local188++) {
			Static164.aClass95Array1[local188].method2676();
		}
		@Pc(209) int local209;
		for (local117 = 0; local117 < 4; local117++) {
			for (local128 = 0; local128 < 104; local128++) {
				for (local209 = 0; local209 < 104; local209++) {
					Static133.aByteArrayArrayArray11[local117][local128][local209] = 0;
				}
			}
		}
		Static8.method148();
		Static43.method674();
		local128 = Static61.aByteArrayArray3.length;
		Static19.method343();
		Static145.method2186(true);
		@Pc(281) int local281;
		@Pc(266) int local266;
		@Pc(348) int local348;
		@Pc(335) int local335;
		@Pc(388) int local388;
		if (!Static76.aBoolean77) {
			@Pc(270) byte[] local270;
			for (local209 = 0; local209 < local128; local209++) {
				local266 = (Static84.anIntArray327[local209] & 0xFF) * 64 - Static153.anInt3278;
				local270 = Static61.aByteArrayArray3[local209];
				local281 = (Static84.anIntArray327[local209] >> 8) * 64 - Static116.anInt2535;
				if (local270 != null) {
					Static8.method148();
					Static179.method2593(Static64.anInt1337 * 8 - 48, Static18.anInt449 * 8 + -48, local281, local266, local270, Static164.aClass95Array1);
				}
			}
			for (local281 = 0; local281 < local128; local281++) {
				local266 = (Static84.anIntArray327[local281] >> 8) * 64 - Static116.anInt2535;
				local335 = (Static84.anIntArray327[local281] & 0xFF) * 64 - Static153.anInt3278;
				@Pc(339) byte[] local339 = Static61.aByteArrayArray3[local281];
				if (local339 == null && Static18.anInt449 < 800) {
					Static8.method148();
					for (local348 = 0; local348 < 4; local348++) {
						Static211.method3084(local348, 64, local266, 64, local335);
					}
				}
			}
			Static145.method2186(true);
			for (local266 = 0; local266 < local128; local266++) {
				local270 = Static122.aByteArrayArray7[local266];
				if (local270 != null) {
					local388 = (Static84.anIntArray327[local266] >> 8) * 64 - Static116.anInt2535;
					local348 = (Static84.anIntArray327[local266] & 0xFF) * 64 - Static153.anInt3278;
					Static8.method148();
					Static197.method2841(local348, local388, Static164.aClass95Array1, local270);
				}
			}
		}
		@Pc(453) int local453;
		@Pc(459) int local459;
		if (Static76.aBoolean77) {
			@Pc(465) int local465;
			@Pc(475) int local475;
			@Pc(477) int local477;
			for (local209 = 0; local209 < 4; local209++) {
				Static8.method148();
				for (local281 = 0; local281 < 13; local281++) {
					for (local266 = 0; local266 < 13; local266++) {
						local388 = Static192.anIntArrayArrayArray8[local209][local281][local266];
						@Pc(437) boolean local437 = false;
						if (local388 != -1) {
							local348 = local388 >> 24 & 0x3;
							local453 = local388 >> 1 & 0x3;
							local459 = local388 >> 14 & 0x3FF;
							local465 = local388 >> 3 & 0x7FF;
							local475 = (local459 / 8 << 8) + local465 / 8;
							for (local477 = 0; local477 < Static84.anIntArray327.length; local477++) {
								if (Static84.anIntArray327[local477] == local475 && Static61.aByteArrayArray3[local477] != null) {
									local437 = true;
									Static154.method2291(Static164.aClass95Array1, (local465 & 0x7) * 8, local281 * 8, local266 * 8, local453, Static61.aByteArrayArray3[local477], local348, (local459 & 0x7) * 8, local209);
									break;
								}
							}
						}
						if (!local437) {
							Static211.method3084(local209, 8, local281 * 8, 8, local266 * 8);
						}
					}
				}
			}
			Static145.method2186(true);
			for (local281 = 0; local281 < 4; local281++) {
				Static8.method148();
				for (local266 = 0; local266 < 13; local266++) {
					for (local335 = 0; local335 < 13; local335++) {
						local388 = Static192.anIntArrayArrayArray8[local281][local266][local335];
						if (local388 != -1) {
							local348 = local388 >> 24 & 0x3;
							local453 = local388 >> 1 & 0x3;
							local459 = local388 >> 14 & 0x3FF;
							local465 = local388 >> 3 & 0x7FF;
							local475 = (local459 / 8 << 8) + local465 / 8;
							for (local477 = 0; local477 < Static84.anIntArray327.length; local477++) {
								if (local475 == Static84.anIntArray327[local477] && Static122.aByteArrayArray7[local477] != null) {
									Static97.method1590(local348, (local459 & 0x7) * 8, local281, local335 * 8, local453, Static164.aClass95Array1, (local465 & 0x7) * 8, local266 * 8, Static122.aByteArrayArray7[local477]);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static145.method2186(true);
		Static15.method242();
		Static8.method148();
		Static82.method1168(Static164.aClass95Array1);
		Static145.method2186(true);
		local209 = Static51.anInt1107;
		if (Static126.anInt2806 < local209) {
			local209 = Static126.anInt2806;
		}
		if (Static126.anInt2806 - 1 > local209) {
		}
		if (Static60.aBoolean52) {
			Static13.method234(Static51.anInt1107);
		} else {
			Static13.method234(0);
		}
		for (local281 = 0; local281 < 104; local281++) {
			for (local266 = 0; local266 < 104; local266++) {
				Static143.method2155(local266, local281);
			}
		}
		Static8.method148();
		Static131.method1034();
		Static15.method242();
		if (Static113.aFrame1 != null) {
			Static58.aClass2_Sub11_Sub1_2.method1595(222);
			Static58.aClass2_Sub11_Sub1_2.method1544(1057001181);
		}
		if (!Static76.aBoolean77) {
			local335 = (Static64.anInt1337 + 6) / 8;
			local266 = (Static64.anInt1337 - 6) / 8;
			local348 = (Static18.anInt449 + 6) / 8;
			local388 = (Static18.anInt449 - 6) / 8;
			for (local453 = local266 - 1; local453 <= local335 + 1; local453++) {
				for (local459 = local388 - 1; local459 <= local348 + 1; local459++) {
					if (local266 > local453 || local335 < local453 || local388 > local459 || local348 < local459) {
						Static153.aClass71_Sub1_16.method2128(Static169.method2460(new Class62[] { Static99.aClass62_779, Static119.method1865(local453), Static134.aClass62_1011, Static119.method1865(local459) }));
						Static153.aClass71_Sub1_16.method2128(Static169.method2460(new Class62[] { Static147.aClass62_1080, Static119.method1865(local453), Static134.aClass62_1011, Static119.method1865(local459) }));
					}
				}
			}
		}
		Static2.method55(30);
		Static8.method148();
		Static80.method1137();
		Static58.aClass2_Sub11_Sub1_2.method1595(176);
		Static120.method1887();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ii;I)Z")
	public static boolean method1204(@OriginalArg(0) Class47 arg0) {
		if (Static172.aBoolean27) {
			if (Static155.method2304(arg0) != 0) {
				return false;
			}
			if (arg0.anInt1870 == 0) {
				return false;
			}
		}
		return arg0.aBoolean102;
	}
}
