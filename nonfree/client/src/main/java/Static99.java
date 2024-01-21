import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "Lclient!ob;")
	public static Class1_Sub2_Sub14 aClass1_Sub2_Sub14_6;

	@OriginalMember(owner = "client!qc", name = "y", descriptor = "Lclient!oc;")
	public static Class56 aClass56_71;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1088 = Static78.method1313("Wordpack geladen)3");

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1089 = Static78.method1313("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "Lclient!p;")
	public static Class63 aClass63_19 = new Class63(30);

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[112];

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1090 = aClass25_1089;

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
	public static int anInt2311 = 128;

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1091 = Static78.method1313("::clientdrop");

	@OriginalMember(owner = "client!qc", name = "w", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1092 = Static78.method1313("0(U");

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
	public static int anInt2315 = -1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)V")
	public static void method1645(@OriginalArg(1) int arg0) {
		if (arg0 == Static48.anInt1227) {
			return;
		}
		if (Static48.anInt1227 == 0) {
			Static119.method1918();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static34.anInt941 = 0;
			Static121.anInt2877 = 0;
			Static80.anInt1778 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static89.aClass77_2 != null) {
			Static89.aClass77_2.method1909();
			Static89.aClass77_2 = null;
		}
		if (Static48.anInt1227 == 25 || Static48.anInt1227 == 40) {
			Static31.method708();
			Static128.method1943();
		}
		if (Static48.anInt1227 == 25) {
			Static34.anInt944 = 0;
			Static105.anInt2381 = 0;
			Static34.anInt946 = 1;
			Static3.anInt54 = 0;
			Static83.anInt1844 = 1;
		}
		if (arg0 == 35) {
			Static1.method16();
			Static90.method1522();
			if (Static15.aClass7_4 == null) {
				Static15.aClass7_4 = Static3.method37(503, 765, Static119.aCanvas1);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static15.aClass7_4 = null;
			Static1.method16();
			Static106.method1720(Static1.aClass56_Sub1_1, Static119.aCanvas1, Static110.aClass56_Sub1_17);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static15.aClass7_4 = null;
			Static90.method1522();
			Static58.method1056(Static119.aCanvas1, Static110.aClass56_Sub1_17);
		}
		Static60.aBoolean54 = true;
		Static48.anInt1227 = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
	public static void method1646() {
		@Pc(10) int local10 = Static64.anInt1439 + Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2832;
		if (aBooleanArray11[98]) {
			Static127.anInt2945 += (12 - Static127.anInt2945) / 2;
		} else if (aBooleanArray11[99]) {
			Static127.anInt2945 += (-Static127.anInt2945 - 12) / 2;
		} else {
			Static127.anInt2945 /= 2;
		}
		anInt2311 += Static127.anInt2945 / 2;
		if (aBooleanArray11[96]) {
			Static63.anInt1414 += (-Static63.anInt1414 - 24) / 2;
		} else if (aBooleanArray11[97]) {
			Static63.anInt1414 += (24 - Static63.anInt1414) / 2;
		} else {
			Static63.anInt1414 /= 2;
		}
		Static54.anInt1298 = Static54.anInt1298 + Static63.anInt1414 / 2 & 0x7FF;
		if (anInt2311 < 128) {
			anInt2311 = 128;
		}
		if (anInt2311 > 383) {
			anInt2311 = 383;
		}
		@Pc(117) int local117 = Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2827 + Static108.anInt2501;
		if (Static107.anInt2488 - local10 < -500 || Static107.anInt2488 - local10 > 500 || Static118.anInt2719 - local117 < -500 || Static118.anInt2719 - local117 > 500) {
			Static118.anInt2719 = local117;
			Static107.anInt2488 = local10;
		}
		if (Static118.anInt2719 != local117) {
			Static118.anInt2719 += (local117 - Static118.anInt2719) / 16;
		}
		if (Static107.anInt2488 != local10) {
			Static107.anInt2488 += (local10 - Static107.anInt2488) / 16;
		}
		@Pc(185) int local185 = Static118.anInt2719 >> 7;
		@Pc(187) int local187 = 0;
		@Pc(191) int local191 = Static107.anInt2488 >> 7;
		@Pc(197) int local197 = Static129.method2048(Static118.anInt2719, Static21.anInt596, Static107.anInt2488);
		@Pc(217) int local217;
		if (local191 > 3 && local185 > 3 && local191 < 100 && local185 < 100) {
			for (local217 = local191 - 4; local217 <= local191 + 4; local217++) {
				for (@Pc(223) int local223 = local185 - 4; local223 <= local185 + 4; local223++) {
					@Pc(227) int local227 = Static21.anInt596;
					if (local227 < 3 && (Static116.aByteArrayArrayArray7[1][local217][local223] & 0x2) == 2) {
						local227++;
					}
					@Pc(253) int local253 = local197 - Static7.anIntArrayArrayArray3[local227][local217][local223];
					if (local253 > local187) {
						local187 = local253;
					}
				}
			}
		}
		local217 = local187 * 192;
		if (local217 > 98048) {
			local217 = 98048;
		}
		if (local217 < 32768) {
			local217 = 32768;
		}
		if (local217 > Static100.anInt2321) {
			Static100.anInt2321 += (local217 - Static100.anInt2321) / 24;
		} else if (local217 < Static100.anInt2321) {
			Static100.anInt2321 += (local217 - Static100.anInt2321) / 80;
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
	public static void method1649() {
		Static1.anIntArray10 = null;
		Static62.anIntArray267 = null;
		Static100.anIntArray402 = null;
		Static13.aByteArrayArray1 = null;
		Static111.anIntArray434 = null;
		Static88.anIntArray349 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!h;B)V")
	public static void method1651(@OriginalArg(0) Class1_Sub3 arg0) {
		arg0.aBoolean131 = false;
		if (arg0.aClass1_Sub14_5 != null) {
			arg0.aClass1_Sub14_5.anInt2049 = 0;
		}
		for (@Pc(19) Class1_Sub3 local19 = arg0.method2026(); local19 != null; local19 = arg0.method2032()) {
			method1651(local19);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!dc;I)Lclient!fc;")
	public static Class25 method1652(@OriginalArg(0) Class1_Sub5 arg0) {
		return Static88.method1448(arg0);
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
	public static void method1654() {
		aClass25_1088 = null;
		aClass63_19 = null;
		aClass25_1091 = null;
		aClass25_1089 = null;
		aClass25_1090 = null;
		aBooleanArray11 = null;
		aClass56_71 = null;
		aClass25_1092 = null;
		aClass1_Sub2_Sub14_6 = null;
	}
}
