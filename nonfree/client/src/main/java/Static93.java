import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!ji", name = "D", descriptor = "I")
	public static int anInt3208;

	@OriginalMember(owner = "client!ji", name = "H", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!ji", name = "P", descriptor = "Lclient!qh;")
	public static Class5_Sub2_Sub10_Sub1 aClass5_Sub2_Sub10_Sub1_5;

	@OriginalMember(owner = "client!ji", name = "Q", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!ji", name = "K", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1194 = Static161.method2452(")1p");

	@OriginalMember(owner = "client!ji", name = "S", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1196 = Static161.method2452("Connection timed out)3");

	@OriginalMember(owner = "client!ji", name = "L", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1195 = aClass20_1196;

	@OriginalMember(owner = "client!ji", name = "N", descriptor = "I")
	public static int anInt3215 = 0;

	@OriginalMember(owner = "client!ji", name = "V", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1197 = Static161.method2452("::qa_op_test");

	@OriginalMember(owner = "client!ji", name = "X", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1198 = Static161.method2452(")2");

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!wa;ILclient!dc;Lclient!dc;)Lclient!qh;")
	public static Class5_Sub2_Sub10_Sub1 method2401(@OriginalArg(0) Class23 arg0, @OriginalArg(2) Class20 arg1, @OriginalArg(3) Class20 arg2) {
		@Pc(13) int local13 = arg0.method734(arg2);
		@Pc(19) int local19 = arg0.method737(arg1, local13);
		return Static183.method2773(arg0, local13, local19);
	}

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V")
	public static void method2402() {
		if (!Static104.aBoolean95) {
			Static151.aShortArray40[0] = 1006;
			Static203.aClass20Array32[0] = Static141.aClass20_1110;
			Static193.aClass20Array31[0] = Static215.aClass20_1545;
			Static85.anInt1879 = 1;
		}
		if (Static130.anInt2715 != -1) {
			Static183.method2776(Static130.anInt2715);
		}
		for (@Pc(30) int local30 = 0; local30 < Static137.anInt2871; local30++) {
			if (Static185.aBooleanArray43[local30]) {
				Static75.aBooleanArray17[local30] = true;
			}
			Static139.aBooleanArray31[local30] = Static185.aBooleanArray43[local30];
			Static185.aBooleanArray43[local30] = false;
		}
		Static192.anInt3776 = -1;
		Static131.anInt2717 = -1;
		Static70.anInt1544 = Static177.anInt3533;
		Static191.aClass69_15 = null;
		if (Static130.anInt2715 != -1) {
			Static137.anInt2871 = 0;
			Static195.method2892(0, 0, Static90.anInt1933, -1, 0, Static101.anInt2163, Static130.anInt2715, 0);
		}
		Static42.method802();
		Static72.method1178();
		if (Static104.aBoolean95) {
			Static194.method2880();
		} else if (Static192.anInt3776 != -1) {
			Static138.method2923(Static131.anInt2717, Static192.anInt3776);
		}
		if (Static108.anInt2202 == 3) {
			for (@Pc(108) int local108 = 0; local108 < Static137.anInt2871; local108++) {
				if (Static139.aBooleanArray31[local108]) {
					Static42.method814(Static52.anIntArray104[local108], Static55.anIntArray109[local108], Static49.anIntArray99[local108], Static106.anIntArray237[local108], 16711935, 128);
				} else if (Static75.aBooleanArray17[local108]) {
					Static42.method814(Static52.anIntArray104[local108], Static55.anIntArray109[local108], Static49.anIntArray99[local108], Static106.anIntArray237[local108], 16711680, 128);
				}
			}
		}
		Static71.method1169(Static176.anInt3529, Static210.aClass1_Sub2_Sub2_2.anInt2241, Static210.aClass1_Sub2_Sub2_2.anInt2234, Static111.anInt2327);
		Static176.anInt3529 = 0;
	}

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "(I)V")
	public static void method2409() {
		Static17.anInt347 = 0;
		Static65.anInt1422 = 0;
		Static69.method1141();
		Static175.method2661();
		Static91.method1507();
		Static127.method1971();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static65.anInt1422; local19++) {
			local25 = Static105.anIntArray234[local19];
			if (Static6.aClass1_Sub2_Sub2Array1[local25].anInt2258 != Static177.anInt3533) {
				Static6.aClass1_Sub2_Sub2Array1[local25] = null;
			}
		}
		if (Static6.anInt155 != Static10.aClass5_Sub6_Sub1_1.anInt4050) {
			throw new RuntimeException("gpp1 pos:" + Static10.aClass5_Sub6_Sub1_1.anInt4050 + " psize:" + Static6.anInt155);
		}
		for (local25 = 0; local25 < Static66.anInt1444; local25++) {
			if (Static6.aClass1_Sub2_Sub2Array1[Static7.anIntArray13[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static66.anInt1444);
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BI)V")
	public static void method2412(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static105.aBooleanArray25[arg0]) {
			return;
		}
		Static198.aClass23_77.method736(arg0);
		if (Static155.aClass69ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(25) boolean local25 = true;
		for (@Pc(31) int local31 = 0; local31 < Static155.aClass69ArrayArray1[arg0].length; local31++) {
			if (Static155.aClass69ArrayArray1[arg0][local31] != null) {
				if (Static155.aClass69ArrayArray1[arg0][local31].anInt2474 == 2) {
					local25 = false;
				} else {
					Static155.aClass69ArrayArray1[arg0][local31] = null;
				}
			}
		}
		if (local25) {
			Static155.aClass69ArrayArray1[arg0] = null;
		}
		Static105.aBooleanArray25[arg0] = false;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLclient!dc;B)V")
	public static void method2413(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class20 arg1) {
		@Pc(5) Class20 local5 = arg1.method563();
		@Pc(8) short[] local8 = new short[16];
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static60.anInt1347; local16++) {
			@Pc(22) Class5_Sub2_Sub11 local22 = Static196.method2908(local16);
			if ((!arg0 || local22.aBoolean98) && local22.anInt2356 == -1 && local22.anInt2326 == -1 && local22.anInt2357 == 0 && local22.aClass20_861.method563().method584(local5) != -1) {
				if (local14 >= 250) {
					Static16.aShortArray3 = null;
					Static1.anInt15 = -1;
					return;
				}
				if (local8.length <= local14) {
					@Pc(76) short[] local76 = new short[local8.length * 2];
					for (@Pc(78) int local78 = 0; local78 < local14; local78++) {
						local76[local78] = local8[local78];
					}
					local8 = local76;
				}
				local8[local14++] = (short) local16;
			}
		}
		Static129.anInt2696 = 0;
		Static1.anInt15 = local14;
		@Pc(113) Class20[] local113 = new Class20[Static1.anInt15];
		Static16.aShortArray3 = local8;
		for (@Pc(117) int local117 = 0; local117 < Static1.anInt15; local117++) {
			local113[local117] = Static196.method2908(local8[local117]).aClass20_861;
		}
		Static79.method1388(Static16.aShortArray3, local113);
	}
}
