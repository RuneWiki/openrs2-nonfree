import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!qf", name = "W", descriptor = "[Lclient!ma;")
	public static Class3_Sub1_Sub2_Sub3[] aClass3_Sub1_Sub2_Sub3Array6;

	@OriginalMember(owner = "client!qf", name = "Z", descriptor = "I")
	public static int anInt2824;

	@OriginalMember(owner = "client!qf", name = "db", descriptor = "Lclient!ha;")
	public static Class25_Sub1 aClass25_Sub1_13;

	@OriginalMember(owner = "client!qf", name = "lb", descriptor = "[Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array8;

	@OriginalMember(owner = "client!qf", name = "mb", descriptor = "Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_12;

	@OriginalMember(owner = "client!qf", name = "S", descriptor = "Lclient!eb;")
	public static Class17 aClass17_47 = new Class17(100);

	@OriginalMember(owner = "client!qf", name = "hb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1205 = Static59.method1195("M");

	@OriginalMember(owner = "client!qf", name = "V", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1197 = aClass60_1205;

	@OriginalMember(owner = "client!qf", name = "X", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1198 = Static59.method1195(" seconds)3");

	@OriginalMember(owner = "client!qf", name = "Y", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1199 = Static59.method1195("Enter name:");

	@OriginalMember(owner = "client!qf", name = "ab", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1200 = aClass60_1205;

	@OriginalMember(owner = "client!qf", name = "bb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1201 = Static59.method1195("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!qf", name = "cb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1202 = Static59.method1195(" is already on your ignore list");

	@OriginalMember(owner = "client!qf", name = "eb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1203 = Static59.method1195("scrollbar");

	@OriginalMember(owner = "client!qf", name = "gb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1204 = aClass60_1199;

	@OriginalMember(owner = "client!qf", name = "ib", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1206 = Static59.method1195("backleft1");

	@OriginalMember(owner = "client!qf", name = "jb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1207 = Static59.method1195("Die Verbindung konnte");

	@OriginalMember(owner = "client!qf", name = "kb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1208 = aClass60_1198;

	@OriginalMember(owner = "client!qf", name = "nb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1209 = aClass60_1202;

	@OriginalMember(owner = "client!qf", name = "ob", descriptor = "I")
	public static int anInt2826 = 0;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/awt/Component;ILclient!jb;Lclient!jb;)V")
	public static void method1831(@OriginalArg(0) Component arg0, @OriginalArg(2) Class25 arg1, @OriginalArg(3) Class25 arg2) {
		if (Static55.aBoolean55) {
			return;
		}
		Static55.aClass16_41 = Static42.method971(arg0, 765, 503);
		Static55.aClass16_41.method1668();
		Static40.method1886();
		@Pc(24) byte[] local24 = arg2.method914(Static105.aClass60_1279, Static81.aClass60_1086);
		Static82.aClass3_Sub1_Sub2_Sub3_4 = new Class3_Sub1_Sub2_Sub3(local24, arg0);
		Static62.aClass3_Sub1_Sub2_Sub3_2 = Static82.aClass3_Sub1_Sub2_Sub3_4.method1445();
		Static113.aClass3_Sub1_Sub2_Sub4_19 = Static54.method1137(Static105.aClass60_1279, Static32.aClass60_430, arg1);
		Static96.aClass3_Sub1_Sub2_Sub4_11 = Static54.method1137(Static105.aClass60_1279, Static32.aClass60_427, arg1);
		Static76.aClass3_Sub1_Sub2_Sub4_8 = Static54.method1137(Static105.aClass60_1279, Static14.aClass60_189, arg1);
		Static80.aClass3_Sub1_Sub2_Sub4Array7 = Static52.method1130(arg1, Static62.aClass60_860, Static105.aClass60_1279);
		Static112.aClass3_Sub1_Sub2_Sub4Array10 = Static52.method1130(arg1, Static30.aClass60_397, Static105.aClass60_1279);
		Static100.anIntArray309 = new int[256];
		for (@Pc(68) int local68 = 0; local68 < 64; local68++) {
			Static100.anIntArray309[local68] = local68 * 262144;
		}
		for (@Pc(82) int local82 = 0; local82 < 64; local82++) {
			Static100.anIntArray309[local82 + 64] = local82 * 1024 + 16711680;
		}
		for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
			Static100.anIntArray309[local102 + 128] = local102 * 4 + 16776960;
		}
		for (@Pc(120) int local120 = 0; local120 < 64; local120++) {
			Static100.anIntArray309[local120 + 192] = 16777215;
		}
		Static113.anIntArray335 = new int[256];
		for (@Pc(137) int local137 = 0; local137 < 64; local137++) {
			Static113.anIntArray335[local137] = local137 * 1024;
		}
		for (@Pc(151) int local151 = 0; local151 < 64; local151++) {
			Static113.anIntArray335[local151 + 64] = local151 * 4 + 65280;
		}
		for (@Pc(172) int local172 = 0; local172 < 64; local172++) {
			Static113.anIntArray335[local172 + 128] = local172 * 262144 + 65535;
		}
		for (@Pc(192) int local192 = 0; local192 < 64; local192++) {
			Static113.anIntArray335[local192 + 192] = 16777215;
		}
		Static130.anIntArray392 = new int[256];
		for (@Pc(209) int local209 = 0; local209 < 64; local209++) {
			Static130.anIntArray392[local209] = local209 * 4;
		}
		for (@Pc(225) int local225 = 0; local225 < 64; local225++) {
			Static130.anIntArray392[local225 + 64] = local225 * 262144 + 255;
		}
		for (@Pc(243) int local243 = 0; local243 < 64; local243++) {
			Static130.anIntArray392[local243 + 128] = local243 * 1024 + 16711935;
		}
		for (@Pc(266) int local266 = 0; local266 < 64; local266++) {
			Static130.anIntArray392[local266 + 192] = 16777215;
		}
		Static66.anIntArray215 = new int[256];
		Static58.anIntArray201 = new int[32768];
		Static113.anIntArray333 = new int[32768];
		Static10.method311(null);
		Static73.anIntArray237 = new int[32768];
		Static21.aBoolean27 = false;
		Static105.aClass60_1281 = Static105.aClass60_1279;
		Static53.anInt1743 = 0;
		Static105.aClass60_1276 = Static105.aClass60_1279;
		Static114.anIntArray338 = new int[32768];
		if (Static34.anInt1185 == 0) {
			Static72.aBoolean78 = true;
		} else {
			Static72.aBoolean78 = false;
		}
		if (Static72.aBoolean78) {
			Static53.method1136();
		} else {
			Static79.method1595(Static41.aClass25_Sub1_7, Static91.aClass60_1152, Static105.aClass60_1279);
		}
		Static117.method2133(false);
		Static33.aBoolean35 = true;
		Static55.aBoolean55 = true;
		Static82.aClass3_Sub1_Sub2_Sub3_4.method1455(0, 0);
		Static62.aClass3_Sub1_Sub2_Sub3_2.method1455(382, 0);
		Static113.aClass3_Sub1_Sub2_Sub4_19.method1903(382 - Static113.aClass3_Sub1_Sub2_Sub4_19.anInt2860 / 2, 18);
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)V")
	public static void method1838() {
		aClass60_1204 = null;
		aClass3_Sub1_Sub2_Sub4Array8 = null;
		aClass17_47 = null;
		aClass3_Sub1_Sub2_Sub4_12 = null;
		aClass60_1208 = null;
		aClass60_1198 = null;
		aClass60_1201 = null;
		aClass60_1207 = null;
		aClass60_1203 = null;
		aClass60_1202 = null;
		aClass60_1206 = null;
		aClass60_1205 = null;
		aClass60_1197 = null;
		aClass60_1199 = null;
		aClass60_1209 = null;
		aClass3_Sub1_Sub2_Sub3Array6 = null;
		aClass60_1200 = null;
		aClass25_Sub1_13 = null;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!v;I)V")
	public static void method1851(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static21.aBoolean27) {
			Static69.method1396(arg0);
			return;
		}
		if (Static112.anInt3110 == 1 && Static130.anInt3486 >= 715 && Static84.anInt2576 >= 453) {
			Static72.aBoolean78 = !Static72.aBoolean78;
			if (Static72.aBoolean78) {
				Static125.method2258();
			} else {
				Static11.method321(Static91.aClass60_1152, Static105.aClass60_1279, Static41.aClass25_Sub1_7);
			}
		}
		if (Static39.anInt1303 == 5) {
			return;
		}
		Static22.anInt881++;
		if (Static39.anInt1303 != 10) {
			return;
		}
		if (Static13.anInt403 != 2 && Static123.anInt3361 == 0) {
			if (Static112.anInt3110 == 1 && Static130.anInt3486 >= 5 && Static130.anInt3486 <= 105 && Static84.anInt2576 >= 463 && Static84.anInt2576 <= 498) {
				Static97.method1822();
				return;
			}
			if (Static52.aClass40_1 != null) {
				Static97.method1822();
			}
		}
		@Pc(108) int local108 = Static112.anInt3110;
		@Pc(110) int local110 = Static130.anInt3486;
		@Pc(112) int local112 = Static84.anInt2576;
		if (Static53.anInt1743 == 0) {
			if (local108 == 1 && local110 >= 227 && local110 <= 377 && local112 >= 271 && local112 <= 311) {
				Static53.anInt1746 = 0;
				Static53.anInt1743 = 3;
			}
			if (local108 == 1 && local110 >= 387 && local110 <= 537 && local112 >= 271 && local112 <= 311) {
				Static105.aClass60_1284 = Static39.aClass60_536;
				Static105.aClass60_1273 = Static95.aClass60_1169;
				Static53.anInt1746 = 0;
				Static53.anInt1743 = 2;
				Static105.aClass60_1278 = Static39.aClass60_521;
				return;
			}
			return;
		}
		if (Static53.anInt1743 == 2) {
			@Pc(212) short local212 = 231;
			@Pc(213) int local213 = local212 + 30;
			if (local108 == 1 && local112 >= 246 && local112 < 261) {
				Static53.anInt1746 = 0;
			}
			local213 += 15;
			if (local108 == 1 && local112 >= 261 && local112 < 276) {
				Static53.anInt1746 = 1;
			}
			local213 += 15;
			if (local108 == 1 && local110 >= 227 && local110 <= 377 && local112 >= 301 && local112 <= 341) {
				Static105.aClass60_1281 = Static105.aClass60_1281.method1854().method1866();
				if (Static105.aClass60_1281.method1836() == 0) {
					Static29.method665(Static39.aClass60_550, Static39.aClass60_555, Static71.aClass60_660);
					return;
				}
				if (Static105.aClass60_1276.method1836() == 0) {
					Static29.method665(Static39.aClass60_524, Static39.aClass60_554, Static2.aClass60_63);
					return;
				}
				Static29.method665(Static39.aClass60_520, Static39.aClass60_543, Static103.aClass60_1260);
				Static50.method1075(20);
				return;
			}
			if (local108 == 1 && local110 >= 387 && local110 <= 537 && local112 >= 301 && local112 <= 341) {
				Static105.aClass60_1276 = Static105.aClass60_1279;
				Static105.aClass60_1281 = Static105.aClass60_1279;
				Static53.anInt1743 = 0;
			}
			while (true) {
				@Pc(374) boolean local374;
				label184: do {
					while (Static68.method1388()) {
						local374 = false;
						for (@Pc(376) int local376 = 0; local376 < Static89.aClass60_1147.method1836(); local376++) {
							if (Static70.anInt2197 == Static89.aClass60_1147.method1832(local376)) {
								local374 = true;
								break;
							}
						}
						if (Static53.anInt1746 != 0) {
							continue label184;
						}
						if (Static86.anInt1611 == 85 && Static105.aClass60_1281.method1836() > 0) {
							Static105.aClass60_1281 = Static105.aClass60_1281.method1864(0, Static105.aClass60_1281.method1836() - 1);
						}
						if (Static86.anInt1611 == 84 || Static86.anInt1611 == 80) {
							Static53.anInt1746 = 1;
						}
						if (local374 && Static105.aClass60_1281.method1836() < 12) {
							Static105.aClass60_1281 = Static105.aClass60_1281.method1840(Static70.anInt2197);
						}
					}
					return;
				} while (Static53.anInt1746 != 1);
				if (Static86.anInt1611 == 85 && Static105.aClass60_1276.method1836() > 0) {
					Static105.aClass60_1276 = Static105.aClass60_1276.method1864(0, Static105.aClass60_1276.method1836() - 1);
				}
				if (Static86.anInt1611 == 84 || Static86.anInt1611 == 80) {
					Static53.anInt1746 = 0;
				}
				if (local374 && Static105.aClass60_1276.method1836() < 20) {
					Static105.aClass60_1276 = Static105.aClass60_1276.method1840(Static70.anInt2197);
				}
			}
		}
		if (Static53.anInt1743 != 3 || local108 != 1 || local110 < 307 || local110 > 457 || local112 < 301 || local112 > 341) {
			return;
		}
		Static53.anInt1743 = 0;
	}

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "(IB)I")
	public static int method1859(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return local5 + arg0;
	}
}
