import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "[I")
	public static int[] anIntArray284;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "Lclient!qb;")
	public static Class54 aClass54_7;

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "Lclient!vb;")
	public static Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_5;

	@OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
	public static int anInt2601;

	@OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
	public static int anInt2603;

	@OriginalMember(owner = "client!ub", name = "P", descriptor = "[Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1[] aClass3_Sub1_Sub1_Sub1Array5;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "Lclient!v;")
	private static Class62 aClass62_1197 = Static45.method753("K");

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "Lclient!v;")
	public static Class62 aClass62_1195 = aClass62_1197;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Lclient!v;")
	public static Class62 aClass62_1196 = Static45.method753("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "Lclient!v;")
	private static Class62 aClass62_1205 = Static45.method753("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "Lclient!v;")
	public static Class62 aClass62_1198 = aClass62_1205;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "Lclient!v;")
	private static Class62 aClass62_1199 = Static45.method753("Loading fonts )2 ");

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "Lclient!v;")
	private static Class62 aClass62_1206 = Static45.method753("Unable to connect)3");

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "Lclient!v;")
	public static Class62 aClass62_1200 = aClass62_1206;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "Lclient!v;")
	private static Class62 aClass62_1201 = Static45.method753("Classic");

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "[Z")
	private static boolean[] aBooleanArray12 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, false, false };

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "[I")
	public static int[] anIntArray285 = new int[4000];

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "Lclient!v;")
	private static Class62 aClass62_1202 = Static45.method753("shake:");

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "Lclient!v;")
	public static Class62 aClass62_1203 = aClass62_1206;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "Lclient!v;")
	private static Class62 aClass62_1204 = Static45.method753("Examine");

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "Z")
	public static boolean aBoolean161 = false;

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
	public static int anInt2598 = 0;

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "Lclient!v;")
	public static Class62 aClass62_1207 = aClass62_1197;

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "Lclient!v;")
	public static Class62 aClass62_1208 = aClass62_1201;

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "Lclient!v;")
	private static Class62 aClass62_1212 = Static45.method753("Loading wordpack )2 ");

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "Lclient!v;")
	public static Class62 aClass62_1209 = aClass62_1212;

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "Lclient!v;")
	public static Class62 aClass62_1210 = aClass62_1202;

	@OriginalMember(owner = "client!ub", name = "G", descriptor = "Lclient!v;")
	public static Class62 aClass62_1211 = aClass62_1199;

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "[[B")
	public static byte[][] aByteArrayArray10 = new byte[250][];

	@OriginalMember(owner = "client!ub", name = "J", descriptor = "Lclient!v;")
	public static Class62 aClass62_1213 = Static45.method753("welle2:");

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
	public static int anInt2602 = 0;

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "Lclient!v;")
	public static Class62 aClass62_1214 = aClass62_1204;

	@OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
	public static int anInt2604 = 0;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILclient!fe;)I")
	public static int method1654(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub6 arg1) {
		if (arg1.anIntArrayArray6 == null || arg0 >= arg1.anIntArrayArray6.length) {
			return -2;
		}
		try {
			@Pc(24) int[] local24 = arg1.anIntArrayArray6[arg0];
			@Pc(31) int local31 = 0;
			@Pc(33) int local33 = 0;
			@Pc(35) byte local35 = 0;
			while (true) {
				@Pc(40) int local40 = local24[local31++];
				@Pc(42) byte local42 = 0;
				@Pc(44) int local44 = 0;
				if (local40 == 0) {
					return local33;
				}
				if (local40 == 1) {
					local44 = Static7.anIntArray22[local24[local31++]];
				}
				if (local40 == 15) {
					local42 = 1;
				}
				if (local40 == 16) {
					local42 = 2;
				}
				if (local40 == 17) {
					local42 = 3;
				}
				if (local40 == 2) {
					local44 = Static33.anIntArray77[local24[local31++]];
				}
				if (local40 == 3) {
					local44 = Static104.anIntArray307[local24[local31++]];
				}
				@Pc(116) int local116;
				@Pc(127) Class3_Sub1_Sub6 local127;
				@Pc(132) int local132;
				@Pc(145) int local145;
				if (local40 == 4) {
					local116 = local24[local31++] << 16;
					@Pc(123) int local123 = local116 + local24[local31++];
					local127 = Static3.method147(local123);
					local132 = local24[local31++];
					if (local132 != -1 && (!Static4.method160(local132).aBoolean14 || Static59.aBoolean87)) {
						for (local145 = 0; local145 < local127.anIntArray64.length; local145++) {
							if (local132 + 1 == local127.anIntArray64[local145]) {
								local44 += local127.anIntArray68[local145];
							}
						}
					}
				}
				if (local40 == 5) {
					local44 = Static62.anIntArray174[local24[local31++]];
				}
				if (local40 == 6) {
					local44 = Class56.anIntArray267[Static33.anIntArray77[local24[local31++]] - 1];
				}
				if (local40 == 7) {
					local44 = Static62.anIntArray174[local24[local31++]] * 100 / 46875;
				}
				if (local40 == 8) {
					local44 = Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1359;
				}
				if (local40 == 9) {
					for (local116 = 0; local116 < 25; local116++) {
						if (aBooleanArray12[local116]) {
							local44 += Static33.anIntArray77[local116];
						}
					}
				}
				if (local40 == 10) {
					local116 = local24[local31++] << 16;
					local116 += local24[local31++];
					local127 = Static3.method147(local116);
					local132 = local24[local31++];
					if (local132 != -1 && (!Static4.method160(local132).aBoolean14 || Static59.aBoolean87)) {
						for (local145 = 0; local145 < local127.anIntArray64.length; local145++) {
							if (local127.anIntArray64[local145] == local132 + 1) {
								local44 = 999999999;
								break;
							}
						}
					}
				}
				if (local40 == 11) {
					local44 = Static31.anInt989;
				}
				if (local40 == 12) {
					local44 = Static51.anInt2319;
				}
				if (local40 == 13) {
					local116 = Static62.anIntArray174[local24[local31++]];
					@Pc(336) int local336 = local24[local31++];
					local44 = (local116 & 0x1 << local336) == 0 ? 0 : 1;
				}
				if (local40 == 14) {
					local116 = local24[local31++];
					local44 = Static100.method1585(local116);
				}
				if (local40 == 18) {
					local44 = Static2.anInt56 + (Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1882 >> 7);
				}
				if (local40 == 19) {
					local44 = Static41.anInt1196 + (Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1887 >> 7);
				}
				if (local40 == 20) {
					local44 = local24[local31++];
				}
				if (local42 == 0) {
					if (local35 == 0) {
						local33 += local44;
					}
					if (local35 == 1) {
						local33 -= local44;
					}
					if (local35 == 2 && local44 != 0) {
						local33 /= local44;
					}
					if (local35 == 3) {
						local33 *= local44;
					}
					local35 = 0;
				} else {
					local35 = local42;
				}
			}
		} catch (@Pc(439) Exception local439) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public static void method1655() {
		if (Static26.anInt805 == 0) {
			return;
		}
		@Pc(17) int local17 = 0;
		if (Static13.anInt465 != 0) {
			local17 = 1;
		}
		for (@Pc(26) int local26 = 0; local26 < 100; local26++) {
			if (Static7.aClass62Array1[local26] != null) {
				@Pc(36) int local36 = Static56.anIntArray123[local26];
				@Pc(40) Class62 local40 = Static7.aClass62Array2[local26];
				if (local40 != null && local40.method1690(Static32.aClass62_433)) {
					local40 = local40.method1702(5);
				}
				if (local40 != null && local40.method1690(Static21.aClass62_305)) {
					local40 = local40.method1702(5);
				}
				if ((local36 == 3 || local36 == 7) && (local36 == 7 || Static15.anInt574 == 0 || Static15.anInt574 == 1 && Static64.method1085(local40))) {
					@Pc(94) int local94 = 329 - local17 * 13;
					if (Static6.anInt208 > 4 && Static61.anInt1672 - 4 > local94 + -10 && local94 + 3 >= Static61.anInt1672 + -4) {
						@Pc(140) int local140 = Static50.aClass3_Sub1_Sub1_Sub3_12.method1484(Static49.method782(new Class62[] { Static80.aClass62_951, Static100.aClass62_1118, local40, Static7.aClass62Array1[local26] })) + 25;
						if (local140 > 450) {
							local140 = 450;
						}
						if (local140 + 4 > Static6.anInt208) {
							if (Static48.anInt1373 >= 1) {
								Static91.method1543(Static54.aClass62_1241, 0, 2023, 0, Static49.method782(new Class62[] { Static75.aClass62_890, local40 }), 0);
							}
							Static91.method1543(Static27.aClass62_342, 0, 2021, 0, Static49.method782(new Class62[] { Static75.aClass62_890, local40 }), 0);
							Static91.method1543(Static25.aClass62_329, 0, 2008, 0, Static49.method782(new Class62[] { Static75.aClass62_890, local40 }), 0);
						}
					}
					local17++;
					if (local17 >= 5) {
						return;
					}
				}
				if ((local36 == 5 || local36 == 6) && Static15.anInt574 < 2) {
					local17++;
					if (local17 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	public static void method1656() {
		if (Static26.anInt805 == 0) {
			return;
		}
		@Pc(13) Class3_Sub1_Sub1_Sub3 local13 = Static50.aClass3_Sub1_Sub1_Sub3_12;
		@Pc(15) int local15 = 0;
		if (Static13.anInt465 != 0) {
			local15 = 1;
		}
		for (@Pc(21) int local21 = 0; local21 < 100; local21++) {
			if (Static7.aClass62Array1[local21] != null) {
				@Pc(31) int local31 = Static56.anIntArray123[local21];
				@Pc(33) byte local33 = 0;
				@Pc(37) Class62 local37 = Static7.aClass62Array2[local21];
				if (local37 != null && local37.method1690(Static32.aClass62_433)) {
					local33 = 1;
					local37 = local37.method1702(5);
				}
				if (local37 != null && local37.method1690(Static21.aClass62_305)) {
					local37 = local37.method1702(5);
					local33 = 2;
				}
				@Pc(99) int local99;
				if ((local31 == 3 || local31 == 7) && (local31 == 7 || Static15.anInt574 == 0 || Static15.anInt574 == 1 && Static64.method1085(local37))) {
					local99 = 329 - local15 * 13;
					local13.method1475(Static80.aClass62_951, 4, local99, 0);
					local13.method1475(Static80.aClass62_951, 4, local99 - 1, 65535);
					@Pc(119) int local119 = local13.method1484(Static80.aClass62_951) + 4;
					local15++;
					local119 += local13.method1478(32);
					if (local33 == 1) {
						Static69.aClass3_Sub1_Sub1_Sub1Array3[0].method145(local119, local99 - 12);
						local119 += 14;
					}
					if (local33 == 2) {
						Static69.aClass3_Sub1_Sub1_Sub1Array3[1].method145(local119, local99 - 12);
						local119 += 14;
					}
					local13.method1475(Static49.method782(new Class62[] { local37, Static100.aClass62_1114, Static7.aClass62Array1[local21] }), local119, local99, 0);
					local13.method1475(Static49.method782(new Class62[] { local37, Static100.aClass62_1114, Static7.aClass62Array1[local21] }), local119, local99 - 1, 65535);
					if (local15 >= 5) {
						return;
					}
				}
				if (local31 == 5 && Static15.anInt574 < 2) {
					local99 = 329 - local15 * 13;
					local15++;
					local13.method1475(Static7.aClass62Array1[local21], 4, local99, 0);
					local13.method1475(Static7.aClass62Array1[local21], 4, local99 - 1, 65535);
					if (local15 >= 5) {
						return;
					}
				}
				if (local31 == 6 && Static15.anInt574 < 2) {
					local99 = 329 - local15 * 13;
					local13.method1475(Static49.method782(new Class62[] { Static74.aClass62_879, Static56.aClass62_682, local37, Static100.aClass62_1114, Static7.aClass62Array1[local21] }), 4, local99, 0);
					local13.method1475(Static49.method782(new Class62[] { Static74.aClass62_879, Static56.aClass62_682, local37, Static100.aClass62_1114, Static7.aClass62Array1[local21] }), 4, local99 - 1, 65535);
					local15++;
					if (local15 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)Lclient!ca;")
	public static Class2 method1657() {
		try {
			return (Class2) Class.forName("Class2_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class2_Sub1();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIBII)I")
	public static int method1658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = 65536 - Class3_Sub1_Sub1_Sub2.anIntArray189[arg2 * 1024 / arg0] >> 1;
		return (local15 * arg3 >> 16) + ((65536 - local15) * arg1 >> 16);
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V")
	public static void method1659() {
		anIntArray284 = null;
		aClass62_1196 = null;
		aClass62_1197 = null;
		aClass62_1195 = null;
		aClass62_1203 = null;
		aClass62_1209 = null;
		aClass62_1211 = null;
		aClass62_1205 = null;
		aClass62_1199 = null;
		aClass62_1208 = null;
		aClass62_1214 = null;
		aClass62_1213 = null;
		aClass62_1200 = null;
		aClass62_1212 = null;
		aClass62_1204 = null;
		aClass62_1210 = null;
		aClass62_1202 = null;
		aClass3_Sub1_Sub1_Sub4_5 = null;
		aClass62_1207 = null;
		anIntArray285 = null;
		aByteArrayArray10 = null;
		aClass54_7 = null;
		aBooleanArray12 = null;
		aClass3_Sub1_Sub1_Sub1Array5 = null;
		aClass62_1198 = null;
		aClass62_1206 = null;
		aClass62_1201 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZLclient!kd;)Lclient!v;")
	public static Class62 method1660(@OriginalArg(1) Class3_Sub8 arg0) {
		return Static5.method163(arg0);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IJ)V")
	public static void method1661(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static20.anInt704 >= 100) {
			Static45.method757(Static41.aClass62_513, 0, Static24.aClass62_319);
			return;
		}
		@Pc(29) Class62 local29 = Static19.method1855(arg0).method1681();
		for (@Pc(36) int local36 = 0; local36 < Static20.anInt704; local36++) {
			if (arg0 == Static108.aLongArray35[local36]) {
				Static45.method757(Static41.aClass62_513, 0, Static49.method782(new Class62[] { local29, Static4.aClass62_77 }));
				return;
			}
		}
		for (@Pc(73) int local73 = 0; local73 < Static24.anInt762; local73++) {
			if (Static49.aLongArray15[local73] == arg0) {
				Static45.method757(Static41.aClass62_513, 0, Static49.method782(new Class62[] { Static78.aClass62_917, local29, Static34.aClass62_468 }));
				return;
			}
		}
		if (!local29.method1675(Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.aClass62_570)) {
			Static108.aLongArray35[Static20.anInt704++] = arg0;
			Static52.aBoolean64 = true;
			Static63.aClass3_Sub8_Sub1_6.method1824(231);
			Static63.aClass3_Sub8_Sub1_6.method1763(arg0);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Lclient!v;")
	public static Class62 method1662(@OriginalArg(0) int arg0) {
		return Static96.method1633(arg0);
	}
}
