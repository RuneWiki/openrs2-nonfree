import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "[Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3[] aClass2_Sub1_Sub9_Sub3Array7;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "Lclient!wd;")
	private static Class80 aClass80_887 = Static2.method59("Attack");

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "Lclient!wd;")
	public static Class80 aClass80_883 = aClass80_887;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "Lclient!wd;")
	public static Class80 aClass80_884 = Static2.method59("welle2:");

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "Lclient!wd;")
	private static Class80 aClass80_889 = Static2.method59("Offline");

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "Lclient!wd;")
	public static Class80 aClass80_885 = aClass80_889;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "[I")
	public static int[] anIntArray305 = new int[100];

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "Lclient!wd;")
	public static Class80 aClass80_886 = Static2.method59("@cr1@");

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "Lclient!wd;")
	public static Class80 aClass80_888 = Static2.method59("null");

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "Lclient!wd;")
	public static Class80 aClass80_890 = Static2.method59("mapback");

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "Lclient!wd;")
	public static Class80 aClass80_891 = Static2.method59("Versteckt");

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "B")
	public static byte aByte4 = 0;

	@OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
	public static int anInt2272 = 0;

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
	public static int anInt2273 = 0;

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "Lclient!wd;")
	public static Class80 aClass80_892 = Static2.method59("Offline");

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public static void method1394() {
		if (Static20.anInt906 != 1) {
			return;
		}
		if (Static13.anInt365 >= 6 && Static13.anInt365 <= 106 && Static108.anInt2880 >= 467 && Static108.anInt2880 <= 499) {
			Static112.anInt2924 = (Static112.anInt2924 + 1) % 4;
			Static15.aBoolean35 = true;
			Static37.aBoolean77 = true;
			Static120.aClass2_Sub17_Sub1_3.method1799(232);
			Static120.aClass2_Sub17_Sub1_3.method1769(Static112.anInt2924);
			Static120.aClass2_Sub17_Sub1_3.method1769(Static6.anInt172);
			Static120.aClass2_Sub17_Sub1_3.method1769(Static111.anInt2993);
		}
		if (Static13.anInt365 >= 135 && Static13.anInt365 <= 235 && Static108.anInt2880 >= 467 && Static108.anInt2880 <= 499) {
			Static37.aBoolean77 = true;
			Static15.aBoolean35 = true;
			Static6.anInt172 = (Static6.anInt172 + 1) % 3;
			Static120.aClass2_Sub17_Sub1_3.method1799(232);
			Static120.aClass2_Sub17_Sub1_3.method1769(Static112.anInt2924);
			Static120.aClass2_Sub17_Sub1_3.method1769(Static6.anInt172);
			Static120.aClass2_Sub17_Sub1_3.method1769(Static111.anInt2993);
		}
		if (Static13.anInt365 >= 273 && Static13.anInt365 <= 373 && Static108.anInt2880 >= 467 && Static108.anInt2880 <= 499) {
			Static111.anInt2993 = (Static111.anInt2993 + 1) % 3;
			Static37.aBoolean77 = true;
			Static15.aBoolean35 = true;
			Static120.aClass2_Sub17_Sub1_3.method1799(232);
			Static120.aClass2_Sub17_Sub1_3.method1769(Static112.anInt2924);
			Static120.aClass2_Sub17_Sub1_3.method1769(Static6.anInt172);
			Static120.aClass2_Sub17_Sub1_3.method1769(Static111.anInt2993);
		}
		if (Static13.anInt365 < 412 || Static13.anInt365 > 512 || Static108.anInt2880 < 467 || Static108.anInt2880 > 499) {
			return;
		}
		if (Static90.anInt2214 == -1) {
			Static61.method1062();
			if (Static111.anInt2998 != -1) {
				Static18.aBoolean49 = false;
				Static40.aClass80_456 = Static40.aClass80_446;
				Static110.anInt2906 = Static90.anInt2214 = Static111.anInt2998;
				return;
			}
			return;
		}
		Static3.method65(0, Static124.aClass80_1198, Static40.aClass80_446);
		if (Static96.aClass80_963 != null) {
			Static3.method65(0, Static96.aClass80_963, Static40.aClass80_446);
			return;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([BI)[B")
	public static byte[] method1395(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class2_Sub17 local4 = new Class2_Sub17(arg0);
		@Pc(20) int local20 = local4.method1780();
		@Pc(24) int local24 = local4.method1747();
		if (local24 < 0 || Static57.anInt1740 != 0 && Static57.anInt1740 < local24) {
			throw new RuntimeException();
		} else if (local20 == 0) {
			@Pc(85) byte[] local85 = new byte[local24];
			local4.method1746(local24, local85);
			return local85;
		} else {
			@Pc(41) int local41 = local4.method1747();
			if (local41 < 0 || Static57.anInt1740 != 0 && local41 > Static57.anInt1740) {
				throw new RuntimeException();
			}
			@Pc(62) byte[] local62 = new byte[local41];
			if (local20 == 1) {
				Static58.method1032(local62, local41, arg0, local24);
			} else {
				Static115.method1865(local62, local4);
			}
			return local62;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!qd;)V")
	public static void method1396(@OriginalArg(1) Class2_Sub1_Sub9_Sub3 arg0) {
		for (@Pc(5) int local5 = 0; local5 < Static64.anIntArray225.length; local5++) {
			Static64.anIntArray225[local5] = 0;
		}
		@Pc(36) int local36;
		for (@Pc(26) int local26 = 0; local26 < 5000; local26++) {
			local36 = (int) ((double) 256 * Math.random() * 128.0D);
			Static64.anIntArray225[local36] = (int) (Math.random() * 256.0D);
		}
		@Pc(58) int local58;
		@Pc(62) int local62;
		@Pc(70) int local70;
		for (local36 = 0; local36 < 20; local36++) {
			for (local58 = 1; local58 < 255; local58++) {
				for (local62 = 1; local62 < 127; local62++) {
					local70 = (local58 << 7) + local62;
					Static60.anIntArray221[local70] = (Static64.anIntArray225[local70 + 1] + Static64.anIntArray225[local70 - 1] + Static64.anIntArray225[local70 - 128] + Static64.anIntArray225[local70 + 128]) / 4;
				}
			}
			@Pc(117) int[] local117 = Static64.anIntArray225;
			Static64.anIntArray225 = Static60.anIntArray221;
			Static60.anIntArray221 = local117;
		}
		if (arg0 == null) {
			return;
		}
		local58 = 0;
		for (local62 = 0; local62 < arg0.anInt2482; local62++) {
			for (local70 = 0; local70 < arg0.anInt2487; local70++) {
				if (arg0.aByteArray34[local58++] != 0) {
					@Pc(152) int local152 = arg0.anInt2485 + local70 + 16;
					@Pc(159) int local159 = local62 + arg0.anInt2484 + 16;
					@Pc(166) int local166 = local152 + (local159 << 7);
					Static64.anIntArray225[local166] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
	public static void method1397() {
		try {
			@Pc(11) Graphics local11 = Static119.aCanvas2.getGraphics();
			Static45.aClass22_15.method1065(local11, 205, 553);
		} catch (@Pc(19) Exception local19) {
			Static119.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBIIII)V")
	public static void method1398(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == Static119.anInt1677 && arg4 == Static78.anInt1997 && (arg0 == Static90.anInt2213 || !Static18.aBoolean51)) {
			return;
		}
		Static90.anInt2213 = arg0;
		Static78.anInt1997 = arg4;
		if (!Static18.aBoolean51) {
			Static90.anInt2213 = 0;
		}
		Static119.anInt1677 = arg2;
		Static10.method167(25);
		Static23.method467(Static86.aClass80_835, null, false);
		@Pc(51) int local51 = Static66.anInt1860;
		@Pc(53) int local53 = Static57.anInt1736;
		Static66.anInt1860 = arg4 * 8 - 48;
		@Pc(63) int local63 = Static66.anInt1860 - local51;
		Static57.anInt1736 = (arg2 - 6) * 8;
		@Pc(74) int local74 = Static57.anInt1736 - local53;
		for (@Pc(80) int local80 = 0; local80 < 32768; local80++) {
			@Pc(86) Class2_Sub1_Sub1_Sub4_Sub1 local86 = Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local80];
			if (local86 != null) {
				for (@Pc(90) int local90 = 0; local90 < 10; local90++) {
					local86.anIntArray312[local90] -= local74;
					local86.anIntArray309[local90] -= local63;
				}
				local86.anInt2324 -= local63 * 128;
				local86.anInt2370 -= local74 * 128;
			}
		}
		for (@Pc(138) int local138 = 0; local138 < 2048; local138++) {
			@Pc(144) Class2_Sub1_Sub1_Sub4_Sub2 local144 = Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local138];
			if (local144 != null) {
				for (@Pc(148) int local148 = 0; local148 < 10; local148++) {
					local144.anIntArray312[local148] -= local74;
					local144.anIntArray309[local148] -= local63;
				}
				local144.anInt2370 -= local74 * 128;
				local144.anInt2324 -= local63 * 128;
			}
		}
		Static16.anInt444 = arg0;
		Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.method1434(arg3, arg1, false);
		@Pc(202) byte local202 = 104;
		@Pc(204) byte local204 = 0;
		@Pc(206) byte local206 = 1;
		if (local74 < 0) {
			local202 = -1;
			local206 = -1;
			local204 = 103;
		}
		@Pc(219) byte local219 = 0;
		@Pc(221) byte local221 = 104;
		@Pc(223) byte local223 = 1;
		if (local63 < 0) {
			local223 = -1;
			local221 = -1;
			local219 = 103;
		}
		for (@Pc(233) int local233 = local204; local233 != local202; local233 += local206) {
			for (@Pc(237) int local237 = local219; local237 != local221; local237 += local223) {
				@Pc(243) int local243 = local233 + local74;
				@Pc(247) int local247 = local63 + local237;
				for (@Pc(249) int local249 = 0; local249 < 4; local249++) {
					if (local243 >= 0 && local247 >= 0 && local243 < 104 && local247 < 104) {
						Static45.aClass58ArrayArrayArray3[local249][local233][local237] = Static45.aClass58ArrayArrayArray3[local249][local243][local247];
					} else {
						Static45.aClass58ArrayArrayArray3[local249][local233][local237] = null;
					}
				}
			}
		}
		for (@Pc(313) Class2_Sub5 local313 = (Class2_Sub5) Static90.aClass58_11.method1285(); local313 != null; local313 = (Class2_Sub5) Static90.aClass58_11.method1281()) {
			local313.anInt1497 -= local63;
			local313.anInt1509 -= local74;
			if (local313.anInt1509 < 0 || local313.anInt1497 < 0 || local313.anInt1509 >= 104 || local313.anInt1497 >= 104) {
				local313.method1961();
			}
		}
		if (Static119.anInt1678 != 0) {
			Static119.anInt1678 -= local74;
			Static2.anInt121 -= local63;
		}
		Static16.anInt443 = 0;
		Static95.anInt2428 = -1;
		Static45.aBoolean157 = false;
		Static33.aClass58_3.method1292();
		Static93.aClass58_12.method1292();
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
	public static void method1399() {
		aClass80_883 = null;
		aClass80_888 = null;
		aClass80_891 = null;
		aClass2_Sub1_Sub9_Sub3Array7 = null;
		aClass80_892 = null;
		aClass80_887 = null;
		anIntArray305 = null;
		aClass80_889 = null;
		aClass80_886 = null;
		aClass80_890 = null;
		aClass80_885 = null;
		aClass80_884 = null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)V")
	public static void method1400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < 100; local9++) {
			if (Static36.aClass80Array8[local9] != null) {
				@Pc(24) int local24 = Static84.anInt2049 + 74 - local7 * 14;
				@Pc(28) int local28 = Static110.anIntArray378[local9];
				if (local24 < -20) {
					break;
				}
				if (local28 == 0) {
					local7++;
				}
				@Pc(41) Class80 local41 = Static25.aClass80Array6[local9];
				if (local41 != null && local41.method2028(aClass80_886)) {
					local41 = local41.method2021(5);
				}
				if (local41 != null && local41.method2028(Static4.aClass80_49)) {
					local41 = local41.method2021(5);
				}
				if ((local28 == 1 || local28 == 2) && (local28 == 1 || Static112.anInt2924 == 0 || Static112.anInt2924 == 1 && Static110.method1844(local41))) {
					local7++;
					if (local24 - 14 < arg0 && arg0 <= local24 && !local41.method2017(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.aClass80_924)) {
						if (Static57.anInt1738 >= 1) {
							Static59.method1043(0, 23, Static112.aClass80_1103, 0, Static93.method1444(new Class80[] { Static3.aClass80_38, local41 }), 0);
						}
						Static59.method1043(0, 3, Static94.aClass80_930, 0, Static93.method1444(new Class80[] { Static3.aClass80_38, local41 }), 0);
						Static59.method1043(0, 21, Static17.aClass80_225, 0, Static93.method1444(new Class80[] { Static3.aClass80_38, local41 }), 0);
					}
				}
				if ((local28 == 3 || local28 == 7) && Static98.anInt2611 == 0 && (local28 == 7 || Static6.anInt172 == 0 || Static6.anInt172 == 1 && Static110.method1844(local41))) {
					local7++;
					if (local24 - 14 < arg0 && arg0 <= local24) {
						if (Static57.anInt1738 >= 1) {
							Static59.method1043(0, 23, Static112.aClass80_1103, 0, Static93.method1444(new Class80[] { Static3.aClass80_38, local41 }), 0);
						}
						Static59.method1043(0, 3, Static94.aClass80_930, 0, Static93.method1444(new Class80[] { Static3.aClass80_38, local41 }), 0);
						Static59.method1043(0, 21, Static17.aClass80_225, 0, Static93.method1444(new Class80[] { Static3.aClass80_38, local41 }), 0);
					}
				}
				if (local28 == 4 && (Static111.anInt2993 == 0 || Static111.anInt2993 == 1 && Static110.method1844(local41))) {
					local7++;
					if (local24 - 14 < arg0 && arg0 <= local24) {
						Static59.method1043(0, 18, Static19.aClass80_270, 0, Static93.method1444(new Class80[] { Static3.aClass80_38, local41 }), 0);
					}
				}
				if ((local28 == 5 || local28 == 6) && Static98.anInt2611 == 0 && Static6.anInt172 < 2) {
					local7++;
				}
				if (local28 == 8 && (Static111.anInt2993 == 0 || Static111.anInt2993 == 1 && Static110.method1844(local41))) {
					if (local24 - 14 < arg0 && arg0 <= local24) {
						Static59.method1043(0, 45, Static80.aClass80_799, 0, Static93.method1444(new Class80[] { Static3.aClass80_38, local41 }), 0);
					}
					local7++;
				}
			}
		}
	}
}
