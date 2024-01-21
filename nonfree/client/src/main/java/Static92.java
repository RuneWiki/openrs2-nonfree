import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3 aClass6_Sub3_Sub3_Sub3_22;

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "Lclient!cd;")
	public static Class6_Sub3_Sub3_Sub1 aClass6_Sub3_Sub3_Sub1_3;

	@OriginalMember(owner = "client!qb", name = "w", descriptor = "[I")
	public static int[] anIntArray286;

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1359 = Static80.method1463("flash2:");

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1353 = aClass63_1359;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1354 = Static80.method1463("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "[J")
	public static long[] aLongArray5 = new long[100];

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1355 = Static80.method1463("T");

	@OriginalMember(owner = "client!qb", name = "x", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1361 = Static80.method1463("The server is being updated)3");

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1356 = aClass63_1361;

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "Z")
	public static volatile boolean aBoolean135 = true;

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1357 = aClass63_1359;

	@OriginalMember(owner = "client!qb", name = "u", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1360 = Static80.method1463("Error connecting to server)3");

	@OriginalMember(owner = "client!qb", name = "s", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1358 = aClass63_1360;

	@OriginalMember(owner = "client!qb", name = "z", descriptor = "I")
	public static int anInt2592 = 0;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
	public static void method1673() {
		while (true) {
			if (Static88.aClass6_Sub4_Sub1_5.method1348(Static14.anInt464) >= 27) {
				@Pc(20) int local20 = Static88.aClass6_Sub4_Sub1_5.method1349(15);
				if (local20 != 32767) {
					@Pc(25) boolean local25 = false;
					if (Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[local20] == null) {
						Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[local20] = new Class6_Sub3_Sub1_Sub2_Sub1();
						local25 = true;
					}
					@Pc(41) Class6_Sub3_Sub1_Sub2_Sub1 local41 = Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[local20];
					Static80.anIntArray247[Static22.anInt689++] = local20;
					local41.anInt2324 = Static73.anInt2064;
					@Pc(57) int local57 = Static88.aClass6_Sub4_Sub1_5.method1349(1);
					@Pc(64) int local64 = Static68.anIntArray224[Static88.aClass6_Sub4_Sub1_5.method1349(3)];
					if (local25) {
						local41.anInt2301 = local64;
					}
					@Pc(74) int local74 = Static88.aClass6_Sub4_Sub1_5.method1349(5);
					@Pc(79) int local79 = Static88.aClass6_Sub4_Sub1_5.method1349(1);
					if (local74 > 15) {
						local74 -= 32;
					}
					if (local79 == 1) {
						Static112.anIntArray355[Static43.anInt129++] = local20;
					}
					local41.aClass6_Sub3_Sub2_1 = Static41.method904(Static88.aClass6_Sub4_Sub1_5.method1349(13));
					@Pc(109) int local109 = Static88.aClass6_Sub4_Sub1_5.method1349(5);
					if (local109 > 15) {
						local109 -= 32;
					}
					local41.anInt2296 = local41.aClass6_Sub3_Sub2_1.anInt466;
					local41.anInt2320 = local41.aClass6_Sub3_Sub2_1.anInt486;
					local41.anInt2293 = local41.aClass6_Sub3_Sub2_1.anInt482;
					local41.anInt2323 = local41.aClass6_Sub3_Sub2_1.anInt469;
					if (local41.anInt2320 == 0) {
						local41.anInt2301 = 0;
					}
					local41.anInt2317 = local41.aClass6_Sub3_Sub2_1.anInt470;
					local41.anInt2321 = local41.aClass6_Sub3_Sub2_1.anInt476;
					local41.anInt2330 = local41.aClass6_Sub3_Sub2_1.anInt461;
					local41.anInt2346 = local41.aClass6_Sub3_Sub2_1.anInt475;
					local41.anInt2328 = local41.aClass6_Sub3_Sub2_1.anInt459;
					local41.method1547(Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0] + local109, local74 + Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], local57 == 1);
					continue;
				}
			}
			Static88.aClass6_Sub4_Sub1_5.method1341();
			return;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method1674(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static38.method879(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static115.aClass8_3.anApplet1 != null) {
				@Pc(106) Class20 local106 = Static115.aClass8_3.method146(new URL(Static115.aClass8_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static114.anInt3106 + "&u=" + Static78.aLong53 + "&v1=" + Static8.aString3 + "&v2=" + Static8.aString2 + "&e=" + local7));
				while (local106.anInt931 == 0) {
					Static53.method2063(1L);
				}
				if (local106.anInt931 == 1) {
					@Pc(122) DataInputStream local122 = (DataInputStream) local106.anObject2;
					local122.read();
					local122.close();
				}
			}
		} catch (@Pc(129) Exception local129) {
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIB)Z")
	public static boolean method1675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 >> 14 & 0x7FFF;
		@Pc(14) int local14 = Static76.aClass19_1.method697(Static101.anInt2810, arg2, arg0, arg1);
		if (local14 == -1) {
			return false;
		}
		@Pc(33) int local33 = local14 & 0x1F;
		@Pc(39) int local39 = local14 >> 6 & 0x3;
		if (local33 == 10 || local33 == 11 || local33 == 22) {
			@Pc(54) Class6_Sub3_Sub10 local54 = Static123.method2172(local7);
			@Pc(68) int local68;
			@Pc(65) int local65;
			if (local39 == 0 || local39 == 2) {
				local65 = local54.anInt1683;
				local68 = local54.anInt1672;
			} else {
				local68 = local54.anInt1683;
				local65 = local54.anInt1672;
			}
			@Pc(79) int local79 = local54.anInt1686;
			if (local39 != 0) {
				local79 = (local79 >> 4 - local39) + (local79 << local39 & 0xF);
			}
			Static113.method488(0, arg2, 2, true, arg0, 0, local65, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], local79, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], local68);
		} else {
			Static113.method488(local39, arg2, 2, true, arg0, local33 + 1, 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 0);
		}
		Static84.anInt2419 = Static59.anInt1765;
		Static76.anInt2138 = Static61.anInt1804;
		Static112.anInt3088 = 2;
		Static34.anInt1151 = 0;
		return true;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)[Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3[] method1677() {
		@Pc(8) Class6_Sub3_Sub3_Sub3[] local8 = new Class6_Sub3_Sub3_Sub3[Static2.anInt18];
		for (@Pc(18) int local18 = 0; local18 < Static2.anInt18; local18++) {
			@Pc(28) Class6_Sub3_Sub3_Sub3 local28 = local8[local18] = new Class6_Sub3_Sub3_Sub3();
			local28.anInt2691 = Static12.anInt417;
			local28.anInt2688 = Static18.anInt566;
			local28.anInt2686 = Static22.anIntArray65[local18];
			local28.anInt2690 = Static39.anIntArray143[local18];
			local28.anInt2689 = Static117.anIntArray345[local18];
			local28.anInt2687 = Static59.anIntArray189[local18];
			local28.anIntArray290 = Static61.anIntArray190;
			local28.aByteArray31 = Static61.aByteArrayArray6[local18];
		}
		Static5.method36();
		return local8;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)Z")
	public static boolean method1678() {
		if (Static100.aClass47_4 == null) {
			return false;
		}
		@Pc(129) int local129;
		try {
			@Pc(13) int local13 = Static100.aClass47_4.method1380();
			if (local13 == 0) {
				return false;
			}
			if (Static77.anInt2144 == -1) {
				local13--;
				Static100.aClass47_4.method1379(1, Static88.aClass6_Sub4_Sub1_5.aByteArray27, 0);
				Static88.aClass6_Sub4_Sub1_5.anInt1949 = 0;
				Static77.anInt2144 = Static88.aClass6_Sub4_Sub1_5.method1340();
				Static14.anInt464 = Static47.anIntArray166[Static77.anInt2144];
			}
			if (Static14.anInt464 == -1) {
				if (local13 <= 0) {
					return false;
				}
				Static100.aClass47_4.method1379(1, Static88.aClass6_Sub4_Sub1_5.aByteArray27, 0);
				Static14.anInt464 = Static88.aClass6_Sub4_Sub1_5.aByteArray27[0] & 0xFF;
				local13--;
			}
			if (Static14.anInt464 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static100.aClass47_4.method1379(2, Static88.aClass6_Sub4_Sub1_5.aByteArray27, 0);
				local13 -= 2;
				Static88.aClass6_Sub4_Sub1_5.anInt1949 = 0;
				Static14.anInt464 = Static88.aClass6_Sub4_Sub1_5.method1306();
			}
			if (Static14.anInt464 > local13) {
				return false;
			}
			Static88.aClass6_Sub4_Sub1_5.anInt1949 = 0;
			Static100.aClass47_4.method1379(Static14.anInt464, Static88.aClass6_Sub4_Sub1_5.aByteArray27, 0);
			Static61.anInt1806 = Static111.anInt3046;
			Static111.anInt3046 = Static115.anInt3138;
			Static100.anInt2788 = 0;
			Static115.anInt3138 = Static77.anInt2144;
			@Pc(125) int local125;
			if (Static77.anInt2144 == 236) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1324();
				local129 = Static88.aClass6_Sub4_Sub1_5.method1295();
				if (local129 == 65535) {
					local129 = -1;
				}
				if (Static111.anIntArray352[local125] == local129) {
					Static111.method2043(Static111.anIntArray352[local125]);
				} else {
					Static75.method1419(Static111.anIntArray352[local125]);
					Static111.anIntArray352[local125] = local129;
				}
				Static10.aBoolean20 = true;
				Static12.aBoolean22 = true;
				Static77.method1446(Static111.anIntArray352[local125]);
				Static77.anInt2144 = -1;
				return true;
			}
			@Pc(185) Class6_Sub3_Sub17 local185;
			@Pc(181) Class63 local181;
			if (Static77.anInt2144 == 248) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1293();
				local181 = Static88.aClass6_Sub4_Sub1_5.method1339();
				local185 = Static12.method339(local125);
				local185.aClass63_1765 = local181;
				if (local125 >> 16 == Static111.anIntArray352[Static86.anInt2366]) {
					Static10.aBoolean20 = true;
				}
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 105) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1295();
				local129 = Static88.aClass6_Sub4_Sub1_5.method1289();
				local185 = Static12.method339(local129);
				local185.anInt3253 = local125;
				local185.anInt3262 = 1;
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 90) {
				Static11.method1338(true);
				Static77.anInt2144 = -1;
				return true;
			}
			@Pc(279) long local279;
			@Pc(259) long local259;
			@Pc(269) long local269;
			@Pc(251) long local251;
			if (Static77.anInt2144 == 89) {
				local251 = Static88.aClass6_Sub4_Sub1_5.method1301();
				@Pc(255) byte local255 = Static88.aClass6_Sub4_Sub1_5.method1297();
				local259 = Static88.aClass6_Sub4_Sub1_5.method1301();
				@Pc(264) long local264 = (long) Static88.aClass6_Sub4_Sub1_5.method1306();
				local269 = Static88.aClass6_Sub4_Sub1_5.method1290();
				@Pc(273) int local273 = Static88.aClass6_Sub4_Sub1_5.method1321();
				local279 = local269 + (local264 << 32);
				@Pc(281) boolean local281 = false;
				for (@Pc(283) int local283 = 0; local283 < 100; local283++) {
					if (Static54.aLongArray3[local283] == local279) {
						local281 = true;
						break;
					}
				}
				if (local273 <= 1) {
					for (@Pc(312) int local312 = 0; local312 < anInt2592; local312++) {
						if (local251 == aLongArray5[local312]) {
							local281 = true;
							break;
						}
					}
				}
				if (!local281 && Static102.anInt2822 == 0) {
					Static54.aLongArray3[Static73.anInt2060] = local279;
					Static73.anInt2060 = (Static73.anInt2060 + 1) % 100;
					@Pc(359) Class63 local359 = Static11.method1296(Static88.aClass6_Sub4_Sub1_5).method1827();
					@Pc(388) Class63 local388 = Static15.method374(new Class63[] { Static60.aClass63_949, Static24.method578(local259), Static37.aClass63_654, Static118.method2114(local255), Static98.aClass63_1498 });
					if (local273 == 2 || local273 == 3) {
						Static46.method996(Static15.method374(new Class63[] { local388, Static35.aClass63_627, Static24.method578(local251).method1814() }), 7, local359);
					} else if (local273 == 1) {
						Static46.method996(Static15.method374(new Class63[] { local388, Static54.aClass63_861, Static24.method578(local251).method1814() }), 7, local359);
					} else {
						Static46.method996(Static15.method374(new Class63[] { local388, Static24.method578(local251).method1814() }), 3, local359);
					}
				}
				Static77.anInt2144 = -1;
				return true;
			}
			@Pc(487) long local487;
			@Pc(496) int local496;
			if (Static77.anInt2144 == 161) {
				local251 = Static88.aClass6_Sub4_Sub1_5.method1301();
				local487 = Static88.aClass6_Sub4_Sub1_5.method1306();
				@Pc(492) long local492 = (long) Static88.aClass6_Sub4_Sub1_5.method1290();
				local496 = Static88.aClass6_Sub4_Sub1_5.method1321();
				local269 = local492 + (local487 << 32);
				@Pc(504) boolean local504 = false;
				for (@Pc(506) int local506 = 0; local506 < 100; local506++) {
					if (Static54.aLongArray3[local506] == local269) {
						local504 = true;
						break;
					}
				}
				if (local496 <= 1) {
					for (@Pc(533) int local533 = 0; local533 < anInt2592; local533++) {
						if (local251 == aLongArray5[local533]) {
							local504 = true;
							break;
						}
					}
				}
				if (!local504 && Static102.anInt2822 == 0) {
					Static54.aLongArray3[Static73.anInt2060] = local269;
					Static73.anInt2060 = (Static73.anInt2060 + 1) % 100;
					@Pc(576) Class63 local576 = Static11.method1296(Static88.aClass6_Sub4_Sub1_5).method1827();
					if (local496 == 2 || local496 == 3) {
						Static46.method996(Static15.method374(new Class63[] { Static35.aClass63_627, Static24.method578(local251).method1814() }), 7, local576);
					} else if (local496 == 1) {
						Static46.method996(Static15.method374(new Class63[] { Static54.aClass63_861, Static24.method578(local251).method1814() }), 7, local576);
					} else {
						Static46.method996(Static24.method578(local251).method1814(), 3, local576);
					}
				}
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 147) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1300();
				local129 = Static88.aClass6_Sub4_Sub1_5.method1306();
				Static30.method723(local129);
				if (local125 != -1) {
					Static30.method723(local125);
				}
				if (Static102.anInt2833 != -1) {
					Static75.method1419(Static102.anInt2833);
					Static102.anInt2833 = -1;
				}
				if (Static25.anInt847 != -1) {
					Static75.method1419(Static25.anInt847);
					Static25.anInt847 = -1;
				}
				if (Static49.anInt1513 != -1) {
					Static75.method1419(Static49.anInt1513);
					Static49.anInt1513 = -1;
				}
				if (Static14.anInt480 == local129) {
					Static111.method2043(Static14.anInt480);
				} else {
					Static75.method1419(Static14.anInt480);
					Static14.anInt480 = local129;
					Static73.method1392(35);
				}
				if (Static85.anInt2839 == local129) {
					Static111.method2043(Static85.anInt2839);
				} else {
					Static75.method1419(Static85.anInt2839);
					Static85.anInt2839 = local125;
				}
				Static70.anInt2011 = 0;
				Static73.anInt2061 = -1;
				Static77.method1446(Static14.anInt480);
				Static77.method1446(Static85.anInt2839);
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 245) {
				Static15.anInt494 = Static88.aClass6_Sub4_Sub1_5.method1321();
				Static38.anInt1233 = Static88.aClass6_Sub4_Sub1_5.method1321();
				Static68.anInt1974 = Static88.aClass6_Sub4_Sub1_5.method1321();
				Static77.anInt2144 = -1;
				Static96.aBoolean146 = true;
				Static15.aBoolean29 = true;
				return true;
			}
			if (Static77.anInt2144 == 209) {
				for (local125 = 0; local125 < Static117.anInt2999; local125++) {
					@Pc(768) Class6_Sub3_Sub15 local768 = Static76.method1437(local125);
					if (local768 != null && local768.anInt2901 == 0) {
						Static86.anIntArray276[local125] = 0;
						Static89.anIntArray283[local125] = 0;
					}
				}
				if (Static79.anInt2158 != -1) {
					Static15.aBoolean29 = true;
				}
				Static10.aBoolean20 = true;
				Static77.anInt2144 = -1;
				Static72.anInt2047 = Static73.anInt2064;
				return true;
			}
			if (Static77.anInt2144 == 17) {
				Static47.anInt1496 = Static88.aClass6_Sub4_Sub1_5.method1321();
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 221) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1306();
				local129 = Static88.aClass6_Sub4_Sub1_5.method1327();
				local185 = Static12.method339(local129);
				if (local185 != null && local185.anInt3284 == 0) {
					if (local125 > local185.anInt3219 - local185.anInt3264) {
						local125 = local185.anInt3219 - local185.anInt3264;
					}
					if (local125 < 0) {
						local125 = 0;
					}
					local185.anInt3291 = local125;
				}
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 235) {
				Static40.anInt2120 = Static88.aClass6_Sub4_Sub1_5.method1306();
				Static77.anInt2144 = -1;
				return true;
			}
			@Pc(898) int local898;
			@Pc(912) int local912;
			if (Static77.anInt2144 == 112) {
				Static10.aBoolean20 = true;
				local125 = Static88.aClass6_Sub4_Sub1_5.method1318();
				local129 = Static88.aClass6_Sub4_Sub1_5.method1312();
				local898 = Static88.aClass6_Sub4_Sub1_5.method1312();
				Static38.anIntArray142[local129] = local125;
				Static76.anIntArray240[local129] = local898;
				Static74.anIntArray234[local129] = 1;
				for (local912 = 0; local912 < 98; local912++) {
					if (local125 >= Class6_Sub3_Sub1_Sub2.anIntArray272[local912]) {
						Static74.anIntArray234[local129] = local912 + 2;
					}
				}
				Static77.anInt2144 = -1;
				Static23.anInt2354 = Static73.anInt2064;
				return true;
			}
			if (Static77.anInt2144 == 251) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1336();
				local129 = Static88.aClass6_Sub4_Sub1_5.method1312();
				local898 = Static88.aClass6_Sub4_Sub1_5.method1312();
				Static101.anInt2810 = local129 >> 1;
				Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.method1547(local898, local125, (local129 & 0x1) == 1);
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 68) {
				Static15.anInt492 = Static88.aClass6_Sub4_Sub1_5.method1321();
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 244) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1300();
				Static30.method723(local125);
				if (Static49.anInt1513 != -1) {
					Static75.method1419(Static49.anInt1513);
					Static15.aBoolean29 = true;
					Static49.anInt1513 = -1;
				}
				if (Static14.anInt480 != -1) {
					Static75.method1419(Static14.anInt480);
					Static14.anInt480 = -1;
					Static73.method1392(30);
				}
				if (Static85.anInt2839 != -1) {
					Static75.method1419(Static85.anInt2839);
					Static85.anInt2839 = -1;
				}
				if (Static102.anInt2833 != -1) {
					Static75.method1419(Static102.anInt2833);
					Static102.anInt2833 = -1;
				}
				if (Static25.anInt847 == local125) {
					Static111.method2043(Static25.anInt847);
				} else {
					Static75.method1419(Static25.anInt847);
					Static25.anInt847 = local125;
				}
				Static12.aBoolean22 = true;
				Static10.aBoolean20 = true;
				Static73.anInt2061 = -1;
				if (Static70.anInt2011 != 0) {
					Static15.aBoolean29 = true;
					Static70.anInt2011 = 0;
				}
				Static77.method1446(Static25.anInt847);
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 164) {
				local251 = Static88.aClass6_Sub4_Sub1_5.method1301();
				@Pc(1092) Class63 local1092 = Static11.method1296(Static88.aClass6_Sub4_Sub1_5).method1827();
				Static46.method996(Static24.method578(local251).method1814(), 6, local1092);
				Static77.anInt2144 = -1;
				return true;
			}
			@Pc(1116) Class6_Sub3_Sub17 local1116;
			if (Static77.anInt2144 == 175) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1289();
				local1116 = Static12.method339(local125);
				local1116.anInt3262 = 3;
				local1116.anInt3253 = Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.aClass21_1.method713();
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 114) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1311();
				local129 = Static88.aClass6_Sub4_Sub1_5.method1318();
				local185 = Static12.method339(local129);
				if (local125 != local185.anInt3224 || local125 == -1) {
					local185.anInt3259 = 0;
					local185.anInt3289 = 0;
					local185.anInt3224 = local125;
				}
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 92) {
				for (local125 = 0; local125 < Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1.length; local125++) {
					if (Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[local125] != null) {
						Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[local125].anInt2307 = -1;
					}
				}
				for (local129 = 0; local129 < Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1.length; local129++) {
					if (Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[local129] != null) {
						Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[local129].anInt2307 = -1;
					}
				}
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 97) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1303();
				if (local125 != Static79.anInt2158) {
					Static75.method1419(Static79.anInt2158);
					Static79.anInt2158 = local125;
				}
				Static15.aBoolean29 = true;
				Static77.method1446(Static79.anInt2158);
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 101) {
				@Pc(1252) boolean local1252 = Static88.aClass6_Sub4_Sub1_5.method1321() == 1;
				local129 = Static88.aClass6_Sub4_Sub1_5.method1289();
				local185 = Static12.method339(local129);
				local185.aBoolean182 = local1252;
				Static77.anInt2144 = -1;
				return true;
			}
			@Pc(1314) int local1314;
			@Pc(1310) int local1310;
			if (Static77.anInt2144 == 76) {
				Static10.aBoolean20 = true;
				local125 = Static88.aClass6_Sub4_Sub1_5.method1289();
				local129 = Static88.aClass6_Sub4_Sub1_5.method1306();
				if (local125 < -70000) {
					local129 += 32768;
				}
				if (local125 < 0) {
					local185 = null;
				} else {
					local185 = Static12.method339(local125);
				}
				while (Static88.aClass6_Sub4_Sub1_5.anInt1949 < Static14.anInt464) {
					local912 = Static88.aClass6_Sub4_Sub1_5.method1337();
					local1310 = 0;
					local1314 = Static88.aClass6_Sub4_Sub1_5.method1306();
					if (local1314 != 0) {
						local1310 = Static88.aClass6_Sub4_Sub1_5.method1321();
						if (local1310 == 255) {
							local1310 = Static88.aClass6_Sub4_Sub1_5.method1289();
						}
					}
					if (local185 != null && local912 >= 0 && local912 < local185.anIntArray362.length) {
						local185.anIntArray362[local912] = local1314;
						local185.anIntArray363[local912] = local1310;
					}
					Static102.method1853(local1314 - 1, local912, local129, local1310);
				}
				Static77.anInt2144 = -1;
				Static84.anInt2422 = Static73.anInt2064;
				return true;
			}
			if (Static77.anInt2144 == 13) {
				Static17.aBoolean142 = true;
				Static97.anInt2725 = Static88.aClass6_Sub4_Sub1_5.method1321();
				Static54.anInt1633 = Static88.aClass6_Sub4_Sub1_5.method1321();
				Static89.anInt2479 = Static88.aClass6_Sub4_Sub1_5.method1306();
				Static116.anInt3157 = Static88.aClass6_Sub4_Sub1_5.method1321();
				Static91.anInt2575 = Static88.aClass6_Sub4_Sub1_5.method1321();
				if (Static91.anInt2575 >= 100) {
					local125 = Static97.anInt2725 * 128 + 64;
					local129 = Static54.anInt1633 * 128 + 64;
					local898 = Static110.method2038(Static101.anInt2810, local129, local125) - Static89.anInt2479;
					local912 = local125 - Static41.anInt1273;
					local1314 = local898 - Static34.anInt1163;
					local1310 = local129 - Static4.anInt45;
					local496 = (int) Math.sqrt((double) (local1310 * local1310 + local912 * local912));
					Static35.anInt1172 = (int) (Math.atan2((double) local1314, (double) local496) * 325.949D) & 0x7FF;
					Static94.anInt2627 = (int) (-325.949D * Math.atan2((double) local912, (double) local1310)) & 0x7FF;
					if (Static35.anInt1172 < 128) {
						Static35.anInt1172 = 128;
					}
					if (Static35.anInt1172 > 383) {
						Static35.anInt1172 = 383;
					}
				}
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 7) {
				if (Static86.anInt2366 == 12) {
					Static10.aBoolean20 = true;
				}
				Static66.anInt3198 = Static88.aClass6_Sub4_Sub1_5.method1321();
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 38) {
				Static31.anInt1026 = Static88.aClass6_Sub4_Sub1_5.method1336();
				Static36.anInt1213 = Static88.aClass6_Sub4_Sub1_5.method1324();
				for (local125 = Static31.anInt1026; local125 < Static31.anInt1026 + 8; local125++) {
					for (local129 = Static36.anInt1213; local129 < Static36.anInt1213 + 8; local129++) {
						if (Static89.aClass1ArrayArrayArray1[Static101.anInt2810][local125][local129] != null) {
							Static89.aClass1ArrayArrayArray1[Static101.anInt2810][local125][local129] = null;
							Static73.method1390(local129, local125);
						}
					}
				}
				for (@Pc(1563) Class6_Sub18 local1563 = (Class6_Sub18) Static39.aClass1_3.method3(); local1563 != null; local1563 = (Class6_Sub18) Static39.aClass1_3.method14()) {
					if (local1563.anInt3020 >= Static31.anInt1026 && local1563.anInt3020 < Static31.anInt1026 + 8 && Static36.anInt1213 <= local1563.anInt3018 && local1563.anInt3018 < Static36.anInt1213 + 8 && local1563.anInt3031 == Static101.anInt2810) {
						local1563.anInt3016 = 0;
					}
				}
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 217) {
				Static36.anInt1213 = Static88.aClass6_Sub4_Sub1_5.method1321();
				Static31.anInt1026 = Static88.aClass6_Sub4_Sub1_5.method1312();
				while (Static14.anInt464 > Static88.aClass6_Sub4_Sub1_5.anInt1949) {
					Static77.anInt2144 = Static88.aClass6_Sub4_Sub1_5.method1321();
					Static67.method1217();
				}
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 34) {
				Static78.anInt2156 = Static88.aClass6_Sub4_Sub1_5.method1321();
				Static72.anInt2047 = Static73.anInt2064;
				Static77.anInt2144 = -1;
				Static10.aBoolean20 = true;
				return true;
			}
			if (Static77.anInt2144 == 153) {
				if (Static25.anInt847 != -1) {
					Static75.method1419(Static25.anInt847);
					Static10.aBoolean20 = true;
					Static12.aBoolean22 = true;
					Static25.anInt847 = -1;
				}
				if (Static49.anInt1513 != -1) {
					Static75.method1419(Static49.anInt1513);
					Static49.anInt1513 = -1;
					Static15.aBoolean29 = true;
				}
				if (Static14.anInt480 != -1) {
					Static75.method1419(Static14.anInt480);
					Static14.anInt480 = -1;
					Static73.method1392(30);
				}
				if (Static85.anInt2839 != -1) {
					Static75.method1419(Static85.anInt2839);
					Static85.anInt2839 = -1;
				}
				if (Static102.anInt2833 != -1) {
					Static75.method1419(Static102.anInt2833);
					Static102.anInt2833 = -1;
				}
				if (Static70.anInt2011 != 0) {
					Static70.anInt2011 = 0;
					Static15.aBoolean29 = true;
				}
				Static73.anInt2061 = -1;
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 228) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1321();
				local129 = Static88.aClass6_Sub4_Sub1_5.method1321();
				local898 = Static88.aClass6_Sub4_Sub1_5.method1321();
				local912 = Static88.aClass6_Sub4_Sub1_5.method1321();
				Static2.aBooleanArray1[local125] = true;
				Static78.anIntArray241[local125] = local129;
				Static43.anIntArray22[local125] = local898;
				Static74.anIntArray235[local125] = local912;
				Static81.anIntArray249[local125] = 0;
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 193) {
				Static21.anInt685 = Static88.aClass6_Sub4_Sub1_5.method1312();
				if (Static86.anInt2366 == Static21.anInt685) {
					Static10.aBoolean20 = true;
					if (Static21.anInt685 == 3) {
						Static86.anInt2366 = 1;
					} else {
						Static86.anInt2366 = 3;
					}
				}
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 255) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1295();
				Static30.method723(local125);
				if (Static25.anInt847 != -1) {
					Static75.method1419(Static25.anInt847);
					Static25.anInt847 = -1;
					Static12.aBoolean22 = true;
					Static10.aBoolean20 = true;
				}
				if (Static49.anInt1513 != -1) {
					Static75.method1419(Static49.anInt1513);
					Static49.anInt1513 = -1;
					Static15.aBoolean29 = true;
				}
				if (Static14.anInt480 != -1) {
					Static75.method1419(Static14.anInt480);
					Static14.anInt480 = -1;
					Static73.method1392(30);
				}
				if (Static85.anInt2839 != -1) {
					Static75.method1419(Static85.anInt2839);
					Static85.anInt2839 = -1;
				}
				if (Static102.anInt2833 == local125) {
					Static111.method2043(Static102.anInt2833);
				} else {
					Static75.method1419(Static102.anInt2833);
					Static102.anInt2833 = local125;
				}
				Static73.anInt2061 = -1;
				if (Static70.anInt2011 != 0) {
					Static15.aBoolean29 = true;
					Static70.anInt2011 = 0;
				}
				Static77.method1446(Static102.anInt2833);
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 5) {
				local251 = Static88.aClass6_Sub4_Sub1_5.method1301();
				local898 = Static88.aClass6_Sub4_Sub1_5.method1306();
				local912 = Static88.aClass6_Sub4_Sub1_5.method1321();
				@Pc(1909) Class63 local1909 = Static24.method578(local251).method1814();
				for (local1310 = 0; local1310 < Static5.anInt52; local1310++) {
					if (Static49.aLongArray2[local1310] == local251) {
						if (Static31.anIntArray127[local1310] != local898) {
							Static31.anIntArray127[local1310] = local898;
							Static10.aBoolean20 = true;
							if (local898 > 0) {
								Static46.method996(Static111.aClass63_1661, 5, Static15.method374(new Class63[] { local1909, Static70.aClass63_1051 }));
							}
							if (local898 == 0) {
								Static46.method996(Static111.aClass63_1661, 5, Static15.method374(new Class63[] { local1909, Static82.aClass63_1195 }));
							}
						}
						Static12.anIntArray50[local1310] = local912;
						local1909 = null;
						break;
					}
				}
				if (local1909 != null && Static5.anInt52 < 200) {
					Static49.aLongArray2[Static5.anInt52] = local251;
					Static65.aClass63Array16[Static5.anInt52] = local1909;
					Static31.anIntArray127[Static5.anInt52] = local898;
					Static12.anIntArray50[Static5.anInt52] = local912;
					Static72.anInt2047 = Static73.anInt2064;
					Static5.anInt52++;
					Static10.aBoolean20 = true;
				}
				@Pc(2016) boolean local2016 = false;
				while (!local2016) {
					local2016 = true;
					for (@Pc(2022) int local2022 = 0; local2022 < Static5.anInt52 - 1; local2022++) {
						if (Static115.anInt3134 != Static31.anIntArray127[local2022] && Static115.anInt3134 == Static31.anIntArray127[local2022 + 1] || Static31.anIntArray127[local2022] == 0 && Static31.anIntArray127[local2022 + 1] != 0) {
							local2016 = false;
							@Pc(2059) int local2059 = Static31.anIntArray127[local2022];
							Static31.anIntArray127[local2022] = Static31.anIntArray127[local2022 + 1];
							Static31.anIntArray127[local2022 + 1] = local2059;
							@Pc(2077) Class63 local2077 = Static65.aClass63Array16[local2022];
							Static65.aClass63Array16[local2022] = Static65.aClass63Array16[local2022 + 1];
							Static65.aClass63Array16[local2022 + 1] = local2077;
							local279 = Static49.aLongArray2[local2022];
							Static49.aLongArray2[local2022] = Static49.aLongArray2[local2022 + 1];
							Static49.aLongArray2[local2022 + 1] = local279;
							@Pc(2113) int local2113 = Static12.anIntArray50[local2022];
							Static12.anIntArray50[local2022] = Static12.anIntArray50[local2022 + 1];
							Static12.anIntArray50[local2022 + 1] = local2113;
							Static10.aBoolean20 = true;
						}
					}
				}
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 96) {
				Static17.aBoolean142 = true;
				Static57.anInt1726 = Static88.aClass6_Sub4_Sub1_5.method1321();
				Static87.anInt2410 = Static88.aClass6_Sub4_Sub1_5.method1321();
				Static87.anInt2409 = Static88.aClass6_Sub4_Sub1_5.method1306();
				Static80.anInt2170 = Static88.aClass6_Sub4_Sub1_5.method1321();
				Static34.anInt1162 = Static88.aClass6_Sub4_Sub1_5.method1321();
				if (Static34.anInt1162 >= 100) {
					Static41.anInt1273 = Static57.anInt1726 * 128 + 64;
					Static4.anInt45 = Static87.anInt2410 * 128 + 64;
					Static34.anInt1163 = Static110.method2038(Static101.anInt2810, Static4.anInt45, Static41.anInt1273) - Static87.anInt2409;
				}
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 29) {
				Static36.anInt1213 = Static88.aClass6_Sub4_Sub1_5.method1312();
				Static31.anInt1026 = Static88.aClass6_Sub4_Sub1_5.method1324();
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 60) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1318();
				local129 = Static88.aClass6_Sub4_Sub1_5.method1306();
				local185 = Static12.method339(local125);
				Static77.anInt2144 = -1;
				local185.anInt3253 = local129;
				local185.anInt3262 = 2;
				return true;
			}
			if (Static77.anInt2144 == 113) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1306();
				local129 = Static88.aClass6_Sub4_Sub1_5.method1321();
				local898 = Static88.aClass6_Sub4_Sub1_5.method1306();
				Static6.method63(local125, local129, local898);
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 66) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1295();
				Static61.method1189(local125);
				Static84.anInt2422 = Static73.anInt2064;
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 118) {
				Static11.method1338(false);
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 149) {
				Static10.aBoolean20 = true;
				local125 = Static88.aClass6_Sub4_Sub1_5.method1289();
				local129 = Static88.aClass6_Sub4_Sub1_5.method1306();
				if (local125 < 0) {
					local185 = null;
				} else {
					local185 = Static12.method339(local125);
				}
				if (local125 < -70000) {
					local129 += 32768;
				}
				if (local185 != null) {
					for (local912 = 0; local912 < local185.anIntArray362.length; local912++) {
						local185.anIntArray362[local912] = 0;
						local185.anIntArray363[local912] = 0;
					}
				}
				Static1.method13(local129);
				local912 = Static88.aClass6_Sub4_Sub1_5.method1306();
				for (local1314 = 0; local1314 < local912; local1314++) {
					local1310 = Static88.aClass6_Sub4_Sub1_5.method1295();
					local496 = Static88.aClass6_Sub4_Sub1_5.method1324();
					if (local496 == 255) {
						local496 = Static88.aClass6_Sub4_Sub1_5.method1327();
					}
					if (local185 != null && local185.anIntArray362.length > local1314) {
						local185.anIntArray362[local1314] = local1310;
						local185.anIntArray363[local1314] = local496;
					}
					Static102.method1853(local1310 - 1, local1314, local129, local496);
				}
				Static77.anInt2144 = -1;
				Static84.anInt2422 = Static73.anInt2064;
				return true;
			}
			if (Static77.anInt2144 == 223) {
				Static52.method1071(Static88.aClass6_Sub4_Sub1_5, Static14.anInt464, Static4.aClass8_1);
				Static77.anInt2144 = -1;
				return true;
			}
			@Pc(2442) Class63 local2442;
			if (Static77.anInt2144 == 218) {
				local2442 = Static88.aClass6_Sub4_Sub1_5.method1339();
				@Pc(2462) boolean local2462;
				if (local2442.method1821(Static34.aClass63_620)) {
					local181 = local2442.method1820(local2442.method1805(Static120.aClass63_1774), 0);
					local487 = local181.method1823();
					local2462 = false;
					for (local1310 = 0; local1310 < anInt2592; local1310++) {
						if (aLongArray5[local1310] == local487) {
							local2462 = true;
							break;
						}
					}
					if (!local2462 && Static102.anInt2822 == 0) {
						Static46.method996(local181, 4, Static19.aClass63_405);
					}
				} else if (local2442.method1821(Static14.aClass63_318)) {
					local2462 = false;
					local181 = local2442.method1820(local2442.method1805(Static120.aClass63_1774), 0);
					local487 = local181.method1823();
					for (local1310 = 0; local1310 < anInt2592; local1310++) {
						if (aLongArray5[local1310] == local487) {
							local2462 = true;
							break;
						}
					}
					if (!local2462 && Static102.anInt2822 == 0) {
						Static46.method996(local181, 8, Static116.aClass63_1732);
					}
				} else if (local2442.method1821(Static7.aClass63_79)) {
					local181 = local2442.method1820(local2442.method1805(Static120.aClass63_1774), 0);
					local487 = local181.method1823();
					local2462 = false;
					for (local1310 = 0; local1310 < anInt2592; local1310++) {
						if (aLongArray5[local1310] == local487) {
							local2462 = true;
							break;
						}
					}
					if (!local2462 && Static102.anInt2822 == 0) {
						@Pc(2571) Class63 local2571 = local2442.method1820(local2442.method1811() - 9, local2442.method1805(Static120.aClass63_1774) - -1);
						Static46.method996(local181, 8, local2571);
					}
				} else {
					Static46.method996(Static111.aClass63_1661, 0, local2442);
				}
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 230) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1306();
				local129 = Static88.aClass6_Sub4_Sub1_5.method1289();
				Static86.anIntArray276[local125] = local129;
				if (local129 != Static89.anIntArray283[local125]) {
					Static89.anIntArray283[local125] = local129;
					Static66.method2129(local125);
					Static10.aBoolean20 = true;
					if (Static79.anInt2158 != -1) {
						Static15.aBoolean29 = true;
					}
				}
				Static77.anInt2144 = -1;
				Static72.anInt2047 = Static73.anInt2064;
				return true;
			}
			if (Static77.anInt2144 == 21) {
				Static36.anInt1217 = 0;
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 162) {
				Static72.method1383();
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 213) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1303();
				if (local125 >= 0) {
					Static30.method723(local125);
				}
				if (Static31.anInt1025 != local125) {
					Static75.method1419(Static31.anInt1025);
					Static31.anInt1025 = local125;
				}
				Static77.method1446(Static31.anInt1025);
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 210) {
				if (Static49.anInt1513 != -1) {
					Static75.method1419(Static49.anInt1513);
					Static49.anInt1513 = -1;
				}
				Static70.anInt2011 = 2;
				Static32.aBoolean57 = false;
				Static77.anInt2144 = -1;
				Static111.aClass63_1657 = Static111.aClass63_1661;
				Static15.aBoolean29 = true;
				return true;
			}
			if (Static77.anInt2144 == 231) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1327();
				local1116 = Static12.method339(local125);
				for (local898 = 0; local898 < local1116.anIntArray362.length; local898++) {
					local1116.anIntArray362[local898] = -1;
					local1116.anIntArray362[local898] = 0;
				}
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 25) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1335();
				local129 = Static88.aClass6_Sub4_Sub1_5.method1318();
				local898 = local125 >> 10 & 0x1F;
				local1314 = local125 & 0x1F;
				@Pc(2821) Class6_Sub3_Sub17 local2821 = Static12.method339(local129);
				local912 = local125 >> 5 & 0x1F;
				Static77.anInt2144 = -1;
				local2821.anInt3269 = (local1314 << 3) + (local912 << 11) + (local898 << 19);
				return true;
			}
			if (Static77.anInt2144 == 71) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1295();
				Static30.method723(local125);
				if (Static25.anInt847 != -1) {
					Static75.method1419(Static25.anInt847);
					Static12.aBoolean22 = true;
					Static10.aBoolean20 = true;
					Static25.anInt847 = -1;
				}
				if (Static14.anInt480 != -1) {
					Static75.method1419(Static14.anInt480);
					Static14.anInt480 = -1;
					Static73.method1392(30);
				}
				if (Static85.anInt2839 != -1) {
					Static75.method1419(Static85.anInt2839);
					Static85.anInt2839 = -1;
				}
				if (Static102.anInt2833 != -1) {
					Static75.method1419(Static102.anInt2833);
					Static102.anInt2833 = -1;
				}
				if (Static49.anInt1513 == local125) {
					Static111.method2043(Static49.anInt1513);
				} else {
					Static75.method1419(Static49.anInt1513);
					Static49.anInt1513 = local125;
				}
				Static73.anInt2061 = -1;
				Static77.method1446(Static49.anInt1513);
				Static15.aBoolean29 = true;
				Static77.anInt2144 = -1;
				return true;
			}
			@Pc(2941) Class6_Sub3_Sub17 local2941;
			if (Static77.anInt2144 == 49) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1327();
				local129 = Static88.aClass6_Sub4_Sub1_5.method1300();
				local898 = Static88.aClass6_Sub4_Sub1_5.method1335();
				local2941 = Static12.method339(local125);
				local2941.anInt3216 = local898 + (local129 << 16);
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 189) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1289();
				Static5.aClass20_1 = Static4.aClass8_1.method142(local125);
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 109) {
				local2442 = Static88.aClass6_Sub4_Sub1_5.method1339();
				@Pc(2984) Object[] local2984 = new Object[local2442.method1811() + 1];
				for (local898 = local2442.method1811() - 1; local898 >= 0; local898--) {
					if (local2442.method1810(local898) == 115) {
						local2984[local898 + 1] = Static88.aClass6_Sub4_Sub1_5.method1339();
					} else {
						local2984[local898 + 1] = Integer.valueOf(Static88.aClass6_Sub4_Sub1_5.method1289());
					}
				}
				local2984[0] = Integer.valueOf(Static88.aClass6_Sub4_Sub1_5.method1289());
				Static99.method1836(local2984, null, 0, 0, null, 0);
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 146) {
				Static117.anInt3000 = Static88.aClass6_Sub4_Sub1_5.method1321();
				if (Static117.anInt3000 == 1) {
					Static40.anInt2114 = Static88.aClass6_Sub4_Sub1_5.method1306();
				}
				if (Static117.anInt3000 >= 2 && Static117.anInt3000 <= 6) {
					if (Static117.anInt3000 == 2) {
						Static5.anInt54 = 64;
						Static78.anInt2152 = 64;
					}
					if (Static117.anInt3000 == 3) {
						Static5.anInt54 = 64;
						Static78.anInt2152 = 0;
					}
					if (Static117.anInt3000 == 4) {
						Static78.anInt2152 = 128;
						Static5.anInt54 = 64;
					}
					if (Static117.anInt3000 == 5) {
						Static5.anInt54 = 0;
						Static78.anInt2152 = 64;
					}
					if (Static117.anInt3000 == 6) {
						Static5.anInt54 = 128;
						Static78.anInt2152 = 64;
					}
					Static117.anInt3000 = 2;
					Static97.anInt2727 = Static88.aClass6_Sub4_Sub1_5.method1306();
					Static46.anInt1428 = Static88.aClass6_Sub4_Sub1_5.method1306();
					Static23.anInt2350 = Static88.aClass6_Sub4_Sub1_5.method1321();
				}
				if (Static117.anInt3000 == 10) {
					Static2.anInt32 = Static88.aClass6_Sub4_Sub1_5.method1306();
				}
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 134) {
				Static31.anInt1015 = Static88.aClass6_Sub4_Sub1_5.method1306() * 30;
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 69) {
				Static5.method40();
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 62) {
				Static42.method922();
				Static77.anInt2144 = -1;
				return false;
			}
			if (Static77.anInt2144 == 185) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1306();
				@Pc(3180) byte local3180 = Static88.aClass6_Sub4_Sub1_5.method1304();
				Static86.anIntArray276[local125] = local3180;
				if (Static89.anIntArray283[local125] != local3180) {
					Static89.anIntArray283[local125] = local3180;
					Static66.method2129(local125);
					if (Static79.anInt2158 != -1) {
						Static15.aBoolean29 = true;
					}
					Static10.aBoolean20 = true;
				}
				Static77.anInt2144 = -1;
				Static72.anInt2047 = Static73.anInt2064;
				return true;
			}
			if (Static77.anInt2144 == 8) {
				Static17.aBoolean142 = false;
				for (local125 = 0; local125 < 5; local125++) {
					Static2.aBooleanArray1[local125] = false;
				}
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 204) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1289();
				local129 = Static88.aClass6_Sub4_Sub1_5.method1311();
				local898 = Static88.aClass6_Sub4_Sub1_5.method1311();
				local2941 = Static12.method339(local125);
				local2941.anInt3221 = local2941.anInt3255 + local898;
				local2941.anInt3287 = local129 + local2941.anInt3240;
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 75) {
				anInt2592 = Static14.anInt464 / 8;
				for (local125 = 0; local125 < anInt2592; local125++) {
					aLongArray5[local125] = Static88.aClass6_Sub4_Sub1_5.method1301();
				}
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 179) {
				if (Static49.anInt1513 != -1) {
					Static75.method1419(Static49.anInt1513);
					Static49.anInt1513 = -1;
				}
				Static111.aClass63_1657 = Static111.aClass63_1661;
				Static77.anInt2144 = -1;
				Static15.aBoolean29 = true;
				Static32.aBoolean57 = false;
				Static70.anInt2011 = 1;
				return true;
			}
			if (Static77.anInt2144 == 83) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1306();
				if (local125 == 65535) {
					local125 = -1;
				}
				Static123.method2167(local125);
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 202) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1294();
				local129 = Static88.aClass6_Sub4_Sub1_5.method1306();
				if (local129 == 65535) {
					local129 = -1;
				}
				Static105.method1897(local129, local125);
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 142) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1318();
				local129 = Static88.aClass6_Sub4_Sub1_5.method1335();
				local898 = Static88.aClass6_Sub4_Sub1_5.method1293();
				if (local129 == 65535) {
					local129 = -1;
				}
				local259 = (long) local129 + ((long) local125 << 32);
				@Pc(3407) Class6 local3407 = Static105.aClass2_10.method20(local259);
				if (local3407 != null) {
					local3407.method2123();
				}
				Static105.aClass2_10.method18(new Class6_Sub16(local898), local259);
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 137) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1327();
				local129 = Static88.aClass6_Sub4_Sub1_5.method1295();
				if (local129 == 65535) {
					local129 = -1;
				}
				local898 = Static88.aClass6_Sub4_Sub1_5.method1318();
				local2941 = Static12.method339(local898);
				@Pc(3465) Class6_Sub3_Sub8 local3465;
				if (local2941.aBoolean179) {
					local2941.anInt3279 = local125;
					local2941.anInt3293 = local129;
					local3465 = Static91.method1664(local129);
					local2941.anInt3220 = local3465.anInt1380;
					local2941.anInt3265 = local3465.anInt1358;
					if (local2941.anInt3230 > 0) {
						local2941.anInt3265 = local2941.anInt3265 * 32 / local2941.anInt3230;
					}
					local2941.anInt3247 = local3465.anInt1397;
					local2941.anInt3277 = local3465.anInt1367;
					local2941.anInt3251 = local3465.anInt1359;
					local2941.anInt3227 = local3465.anInt1360;
					Static73.method1395(local2941);
				} else if (local129 == -1) {
					Static77.anInt2144 = -1;
					local2941.anInt3262 = 0;
					return true;
				} else {
					local3465 = Static91.method1664(local129);
					local2941.anInt3251 = local3465.anInt1359;
					local2941.anInt3247 = local3465.anInt1397;
					local2941.anInt3253 = local129;
					local2941.anInt3262 = 4;
					local2941.anInt3265 = local3465.anInt1358 * 100 / local125;
				}
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 52 || Static77.anInt2144 == 249 || Static77.anInt2144 == 171 || Static77.anInt2144 == 203 || Static77.anInt2144 == 123 || Static77.anInt2144 == 59 || Static77.anInt2144 == 207 || Static77.anInt2144 == 241 || Static77.anInt2144 == 63 || Static77.anInt2144 == 95 || Static77.anInt2144 == 41) {
				Static67.method1217();
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 167) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1300();
				local129 = Static88.aClass6_Sub4_Sub1_5.method1335();
				if (Static49.anInt1513 != -1) {
					Static75.method1419(Static49.anInt1513);
					Static49.anInt1513 = -1;
					Static15.aBoolean29 = true;
				}
				if (Static14.anInt480 != -1) {
					Static75.method1419(Static14.anInt480);
					Static14.anInt480 = -1;
					Static73.method1392(30);
				}
				if (Static85.anInt2839 != -1) {
					Static75.method1419(Static85.anInt2839);
					Static85.anInt2839 = -1;
				}
				if (local129 == Static102.anInt2833) {
					Static111.method2043(Static102.anInt2833);
				} else {
					Static75.method1419(Static102.anInt2833);
					Static102.anInt2833 = local129;
				}
				if (Static25.anInt847 == local125) {
					Static111.method2043(Static25.anInt847);
				} else {
					Static75.method1419(Static25.anInt847);
					Static25.anInt847 = local125;
				}
				Static10.aBoolean20 = true;
				if (Static70.anInt2011 != 0) {
					Static70.anInt2011 = 0;
					Static15.aBoolean29 = true;
				}
				Static12.aBoolean22 = true;
				Static73.anInt2061 = -1;
				Static77.method1446(Static102.anInt2833);
				Static77.method1446(Static25.anInt847);
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 197) {
				Static111.aClass63_1664 = Static88.aClass6_Sub4_Sub1_5.method1339();
				if (Static49.anInt1513 != -1) {
					Static75.method1419(Static49.anInt1513);
					Static49.anInt1513 = -1;
				}
				Static111.aClass63_1657 = Static111.aClass63_1661;
				Static32.aBoolean57 = false;
				Static15.aBoolean29 = true;
				Static70.anInt2011 = 4;
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 121) {
				for (local125 = 0; local125 < Static89.anIntArray283.length; local125++) {
					if (Static86.anIntArray276[local125] != Static89.anIntArray283[local125]) {
						Static89.anIntArray283[local125] = Static86.anIntArray276[local125];
						Static66.method2129(local125);
						Static10.aBoolean20 = true;
					}
				}
				Static77.anInt2144 = -1;
				Static72.anInt2047 = Static73.anInt2064;
				return true;
			}
			if (Static77.anInt2144 == 208) {
				Static86.anInt2366 = Static88.aClass6_Sub4_Sub1_5.method1321();
				Static77.anInt2144 = -1;
				Static12.aBoolean22 = true;
				Static10.aBoolean20 = true;
				return true;
			}
			if (Static77.anInt2144 == 87) {
				local2442 = Static88.aClass6_Sub4_Sub1_5.method1339();
				local129 = Static88.aClass6_Sub4_Sub1_5.method1336();
				local898 = Static88.aClass6_Sub4_Sub1_5.method1324();
				if (local898 >= 1 && local898 <= 5) {
					if (local2442.method1822(Static54.aClass63_862)) {
						local2442 = null;
					}
					Static115.aClass63Array21[local898 - 1] = local2442;
					Static87.aBooleanArray13[local898 - 1] = local129 == 0;
				}
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 177) {
				if (Static86.anInt2366 == 12) {
					Static10.aBoolean20 = true;
				}
				Static37.anInt1218 = Static88.aClass6_Sub4_Sub1_5.method1323();
				Static77.anInt2144 = -1;
				return true;
			}
			if (Static77.anInt2144 == 74) {
				local125 = Static88.aClass6_Sub4_Sub1_5.method1335();
				local129 = Static88.aClass6_Sub4_Sub1_5.method1300();
				local898 = Static88.aClass6_Sub4_Sub1_5.method1327();
				local912 = Static88.aClass6_Sub4_Sub1_5.method1335();
				@Pc(3872) Class6_Sub3_Sub17 local3872 = Static12.method339(local898);
				local3872.anInt3251 = local912;
				Static77.anInt2144 = -1;
				local3872.anInt3265 = local125;
				local3872.anInt3247 = local129;
				return true;
			}
			method1674(null, "T1 - " + Static77.anInt2144 + "," + Static111.anInt3046 + "," + Static61.anInt1806 + " - " + Static14.anInt464);
			Static42.method922();
		} catch (@Pc(3911) IOException local3911) {
			Static85.method1864();
		} catch (@Pc(3915) Exception local3915) {
			@Pc(3956) String local3956 = "T2 - " + Static77.anInt2144 + "," + Static111.anInt3046 + "," + Static61.anInt1806 + " - " + Static14.anInt464 + "," + (Static80.anInt2169 + Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0]) + "," + (Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0] + Static91.anInt2560) + " - ";
			for (local129 = 0; Static14.anInt464 > local129 && local129 < 50; local129++) {
				local3956 = local3956 + Static88.aClass6_Sub4_Sub1_5.aByteArray27[local129] + ",";
			}
			method1674(local3915, local3956);
			Static42.method922();
		}
		return true;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V")
	public static void method1679() {
		aClass63_1361 = null;
		aClass63_1354 = null;
		aClass63_1356 = null;
		aLongArray5 = null;
		aClass63_1358 = null;
		aClass63_1357 = null;
		aClass63_1355 = null;
		aClass63_1359 = null;
		aClass63_1360 = null;
		aClass6_Sub3_Sub3_Sub1_3 = null;
		aClass63_1353 = null;
		anIntArray286 = null;
		aClass6_Sub3_Sub3_Sub3_22 = null;
	}
}
