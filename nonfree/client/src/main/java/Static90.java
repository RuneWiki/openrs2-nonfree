import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!pc", name = "V", descriptor = "Lclient!ff;")
	public static Class11 aClass11_35;

	@OriginalMember(owner = "client!pc", name = "gb", descriptor = "Lclient!ff;")
	public static Class11 aClass11_36;

	@OriginalMember(owner = "client!pc", name = "wb", descriptor = "Lclient!ce;")
	public static Class11_Sub1 aClass11_Sub1_13;

	@OriginalMember(owner = "client!pc", name = "T", descriptor = "Lclient!wd;")
	private static Class80 aClass80_866 = Static2.method59("Too many connections from your address)3");

	@OriginalMember(owner = "client!pc", name = "X", descriptor = "Lclient!wd;")
	public static Class80 aClass80_867 = aClass80_866;

	@OriginalMember(owner = "client!pc", name = "bb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_868 = Static2.method59("Menge eingeben:");

	@OriginalMember(owner = "client!pc", name = "db", descriptor = "Lclient!wd;")
	public static Class80 aClass80_869 = Static2.method59("Null");

	@OriginalMember(owner = "client!pc", name = "eb", descriptor = "[Lclient!wb;")
	public static Class2_Sub17[] aClass2_Sub17Array1 = new Class2_Sub17[2048];

	@OriginalMember(owner = "client!pc", name = "pb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_870 = Static2.method59("k");

	@OriginalMember(owner = "client!pc", name = "rb", descriptor = "Lclient!of;")
	public static Class58 aClass58_11 = new Class58();

	@OriginalMember(owner = "client!pc", name = "sb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_871 = Static2.method59("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!pc", name = "tb", descriptor = "I")
	public static int anInt2212 = 0;

	@OriginalMember(owner = "client!pc", name = "ub", descriptor = "I")
	public static int anInt2213 = 0;

	@OriginalMember(owner = "client!pc", name = "vb", descriptor = "I")
	public static int anInt2214 = -1;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!se;)V")
	public static void method1341(@OriginalArg(1) Class2_Sub1_Sub1_Sub4 arg0) {
		if (arg0.anInt2376 == 0) {
			arg0.anInt2375 = 1024;
		}
		if (arg0.anInt2376 == 1) {
			arg0.anInt2375 = 1536;
		}
		arg0.anInt2336 = 0;
		@Pc(27) int local27 = arg0.anInt2366 - Static10.anInt300;
		@Pc(37) int local37 = arg0.anInt2364 * 64 + arg0.anInt2325 * 128;
		arg0.anInt2370 += (local37 - arg0.anInt2370) / local27;
		@Pc(60) int local60 = arg0.anInt2332 * 128 + arg0.anInt2364 * 64;
		if (arg0.anInt2376 == 2) {
			arg0.anInt2375 = 0;
		}
		arg0.anInt2324 += (local60 - arg0.anInt2324) / local27;
		if (arg0.anInt2376 == 3) {
			arg0.anInt2375 = 512;
		}
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(B)V")
	public static void method1344() {
		aClass80_868 = null;
		aClass11_Sub1_13 = null;
		aClass58_11 = null;
		aClass11_35 = null;
		aClass80_869 = null;
		aClass11_36 = null;
		aClass80_871 = null;
		aClass80_870 = null;
		aClass2_Sub17Array1 = null;
		aClass80_867 = null;
		Class2_Sub1_Sub12.anIntArray287 = null;
		aClass80_866 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
	public static void method1345(@OriginalArg(0) int arg0) {
		Static5.method101();
		@Pc(12) int local12 = Static14.method244(arg0).anInt2157;
		if (local12 == 0) {
			return;
		}
		@Pc(19) int local19 = Static15.anIntArray66[arg0];
		if (local12 == 1) {
			if (local19 == 1) {
				Static52.method931(0.9D);
				((Class24) Static52.anInterface1_1).method670(0.9D);
			}
			if (local19 == 2) {
				Static52.method931(0.8D);
				((Class24) Static52.anInterface1_1).method670(0.8D);
			}
			if (local19 == 3) {
				Static52.method931(0.7D);
				((Class24) Static52.anInterface1_1).method670(0.7D);
			}
			if (local19 == 4) {
				Static52.method931(0.6D);
				((Class24) Static52.anInterface1_1).method670(0.6D);
			}
			Static63.method1071();
			Static82.aBoolean236 = true;
		}
		if (local12 == 3) {
			@Pc(81) short local81 = 0;
			if (local19 == 0) {
				local81 = 255;
			}
			if (local19 == 1) {
				local81 = 192;
			}
			if (local19 == 2) {
				local81 = 128;
			}
			if (local19 == 3) {
				local81 = 64;
			}
			if (local19 == 4) {
				local81 = 0;
			}
			if (Static87.anInt2274 != local81) {
				if (Static87.anInt2274 == 0 && Static91.anInt2226 != -1) {
					Static55.method712(local81, 0, Static29.aClass11_Sub1_7, Static91.anInt2226);
					Static70.aBoolean132 = false;
				} else if (local81 == 0) {
					Static15.method251();
					Static70.aBoolean132 = false;
				} else {
					Static25.method521(local81);
				}
				Static87.anInt2274 = local81;
			}
		}
		if (local12 == 8) {
			Static37.aBoolean77 = true;
			Static98.anInt2611 = local19;
		}
		if (local12 == 4) {
			if (local19 == 0) {
				Static98.anInt2613 = 127;
			}
			if (local19 == 1) {
				Static98.anInt2613 = 96;
			}
			if (local19 == 2) {
				Static98.anInt2613 = 64;
			}
			if (local19 == 3) {
				Static98.anInt2613 = 32;
			}
			if (local19 == 4) {
				Static98.anInt2613 = 0;
			}
		}
		if (local12 == 6) {
			Static93.anInt2409 = local19;
		}
		if (local12 == 9) {
			Static2.anInt116 = local19;
		}
		if (local12 == 10) {
			if (local19 == 0) {
				Static22.anInt963 = 127;
			}
			if (local19 == 1) {
				Static22.anInt963 = 96;
			}
			if (local19 == 2) {
				Static22.anInt963 = 64;
			}
			if (local19 == 3) {
				Static22.anInt963 = 32;
			}
			if (local19 == 4) {
				Static22.anInt963 = 0;
			}
		}
		if (local12 == 5) {
			Static81.anInt2040 = local19;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIZ)Lclient!wd;")
	public static Class80 method1346(@OriginalArg(0) int arg0) {
		return Static121.method1964(true, arg0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZLclient!ff;IIII)V")
	public static void method1347(@OriginalArg(0) int arg0, @OriginalArg(2) Class11 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		Static17.anInt650 = 1;
		Static5.aClass11_4 = arg1;
		Static107.aBoolean212 = false;
		Static15.anInt428 = 2;
		Static64.anInt1819 = arg0;
		Static35.anInt1172 = arg2;
		Static57.anInt1739 = arg3;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!wd;)I")
	public static int method1348(@OriginalArg(1) Class80 arg0) {
		if (Static81.anInt2043 == 1) {
			return 7;
		} else if (arg0.method2028(Static56.aClass80_609)) {
			return 1;
		} else if (arg0.method2028(Static76.aClass80_763)) {
			return 1;
		} else if (arg0.method2028(Static104.aClass80_1032)) {
			return 2;
		} else if (arg0.method2028(Static61.aClass80_643)) {
			return 2;
		} else if (arg0.method2028(Static73.aClass80_746)) {
			return 3;
		} else if (arg0.method2028(Static1.aClass80_6)) {
			return 4;
		} else if (arg0.method2028(Static65.aClass80_691)) {
			return 5;
		} else if (arg0.method2028(Static111.aClass80_1156)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
	public static void method1349() {
		if (Static98.anInt2611 == 0) {
			return;
		}
		@Pc(13) Class2_Sub1_Sub9_Sub4 local13 = Static21.aClass2_Sub1_Sub9_Sub4_12;
		@Pc(15) int local15 = 0;
		if (Static56.anInt1718 != 0) {
			local15 = 1;
		}
		for (@Pc(21) int local21 = 0; local21 < 100; local21++) {
			if (Static36.aClass80Array8[local21] != null) {
				@Pc(37) int local37 = Static110.anIntArray378[local21];
				@Pc(41) Class80 local41 = Static25.aClass80Array6[local21];
				@Pc(43) byte local43 = 0;
				if (local41 != null && local41.method2028(Static92.aClass80_886)) {
					local41 = local41.method2021(5);
					local43 = 1;
				}
				if (local41 != null && local41.method2028(Static4.aClass80_49)) {
					local41 = local41.method2021(5);
					local43 = 2;
				}
				@Pc(98) int local98;
				if ((local37 == 3 || local37 == 7) && (local37 == 7 || Static6.anInt172 == 0 || Static6.anInt172 == 1 && Static110.method1844(local41))) {
					local98 = 329 - local15 * 13;
					local15++;
					local13.method1925(Static61.aClass80_646, 4, local98, 0);
					local13.method1925(Static61.aClass80_646, 4, local98 - 1, 65535);
					@Pc(121) int local121 = local13.method1910(Static61.aClass80_646) + 4;
					local121 += local13.method1908(32);
					if (local43 == 1) {
						Static110.aClass2_Sub1_Sub9_Sub3Array8[0].method1494(local121, local98 - 12);
						local121 += 14;
					}
					if (local43 == 2) {
						Static110.aClass2_Sub1_Sub9_Sub3Array8[1].method1494(local121, local98 - 12);
						local121 += 14;
					}
					local13.method1925(Static93.method1444(new Class80[] { local41, Static63.aClass80_665, Static36.aClass80Array8[local21] }), local121, local98, 0);
					local13.method1925(Static93.method1444(new Class80[] { local41, Static63.aClass80_665, Static36.aClass80Array8[local21] }), local121, local98 - 1, 65535);
					if (local15 >= 5) {
						return;
					}
				}
				if (local37 == 5 && Static6.anInt172 < 2) {
					local98 = 329 - local15 * 13;
					local15++;
					local13.method1925(Static36.aClass80Array8[local21], 4, local98, 0);
					local13.method1925(Static36.aClass80Array8[local21], 4, local98 - 1, 65535);
					if (local15 >= 5) {
						return;
					}
				}
				if (local37 == 6 && Static6.anInt172 < 2) {
					local98 = 329 - local15 * 13;
					local13.method1925(Static93.method1444(new Class80[] { Static91.aClass80_880, Static7.aClass80_95, local41, Static63.aClass80_665, Static36.aClass80Array8[local21] }), 4, local98, 0);
					local15++;
					local13.method1925(Static93.method1444(new Class80[] { Static91.aClass80_880, Static7.aClass80_95, local41, Static63.aClass80_665, Static36.aClass80Array8[local21] }), 4, local98 - 1, 65535);
					if (local15 >= 5) {
						return;
					}
				}
			}
		}
	}
}
