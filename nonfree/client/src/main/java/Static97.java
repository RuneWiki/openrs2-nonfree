import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "Lclient!fd;")
	public static Class21 aClass21_4;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "Lclient!od;")
	public static Class53 aClass53_2;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "Lclient!ea;")
	private static Class18 aClass18_761 = Static8.method128("headicons_prayer");

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray86 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
	public static int anInt3003 = 0;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
	public static int anInt3004 = 127;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
	public static int anInt3005 = 0;

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "[I")
	public static int[] anIntArray265 = new int[100];

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "Lclient!ea;")
	public static Class18 aClass18_762 = Static8.method128("<col=ff3000>");

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	public static void method2115() {
		@Pc(20) int local20;
		if (Static23.anInt699 == 0) {
			Static87.aClass68_1 = new Class68(4, 104, 104, Static135.anIntArrayArrayArray5);
			for (local20 = 0; local20 < 4; local20++) {
				Static141.aClass22Array2[local20] = new Class22(104, 104);
			}
			Static86.aClass1_Sub1_Sub8_Sub3_2 = new Class1_Sub1_Sub8_Sub3(512, 512);
			Static23.anInt699 = 20;
			Static144.anInt3993 = 5;
			Static163.aClass18_1151 = Static49.aClass18_389;
			return;
		}
		@Pc(55) int local55;
		@Pc(65) int local65;
		@Pc(75) int local75;
		@Pc(69) int local69;
		if (Static23.anInt699 == 20) {
			@Pc(53) int[] local53 = new int[9];
			for (local55 = 0; local55 < 9; local55++) {
				local65 = local55 * 32 + 15 + 128;
				local69 = Class1_Sub1_Sub8_Sub4.anIntArray212[local65];
				local75 = local65 * 3 + 600;
				local53[local55] = local69 * local75 >> 16;
			}
			Static138.method2654(local53);
			Static163.aClass18_1151 = Static145.aClass18_1029;
			Static144.anInt3993 = 10;
			Static23.anInt699 = 30;
		} else if (Static23.anInt699 == 30) {
			Static142.aClass16_Sub1_45 = Static96.method2113(true, true, 0, false);
			Static142.aClass16_Sub1_44 = Static96.method2113(true, true, 1, false);
			Static26.aClass16_Sub1_11 = Static96.method2113(false, true, 2, true);
			Static69.aClass16_Sub1_24 = Static96.method2113(true, true, 3, false);
			Static12.aClass16_Sub1_51 = Static96.method2113(true, true, 4, false);
			Static42.aClass16_Sub1_16 = Static96.method2113(true, true, 5, true);
			Static115.aClass16_Sub1_36 = Static96.method2113(true, false, 6, true);
			Static64.aClass16_Sub1_22 = Static96.method2113(true, true, 7, false);
			Static127.aClass16_Sub1_41 = Static96.method2113(true, true, 8, false);
			Static24.aClass16_Sub1_10 = Static96.method2113(false, true, 9, true);
			Static107.aClass16_Sub1_35 = Static96.method2113(true, true, 10, false);
			Static82.aClass16_Sub1_29 = Static96.method2113(true, true, 11, false);
			Static164.aClass16_Sub1_50 = Static96.method2113(true, true, 12, false);
			Static14.aClass16_Sub1_6 = Static96.method2113(false, true, 13, true);
			Static149.aClass16_Sub1_46 = Static96.method2113(true, false, 14, false);
			Static106.aClass16_Sub1_34 = Static96.method2113(true, true, 15, false);
			Static23.anInt699 = 40;
			Static144.anInt3993 = 20;
			Static163.aClass18_1151 = Static34.aClass18_279;
		} else if (Static23.anInt699 == 40) {
			local20 = Static142.aClass16_Sub1_45.method2258() * 4 / 100;
			local20 += Static142.aClass16_Sub1_44.method2258() * 4 / 100;
			local20 += Static26.aClass16_Sub1_11.method2258() * 2 / 100;
			local20 += Static69.aClass16_Sub1_24.method2258() * 2 / 100;
			local20 += Static12.aClass16_Sub1_51.method2258() * 6 / 100;
			local20 += Static42.aClass16_Sub1_16.method2258() * 4 / 100;
			local20 += Static115.aClass16_Sub1_36.method2258() * 2 / 100;
			local20 += Static64.aClass16_Sub1_22.method2258() * 60 / 100;
			local20 += Static127.aClass16_Sub1_41.method2258() * 2 / 100;
			local20 += Static24.aClass16_Sub1_10.method2258() * 2 / 100;
			local20 += Static107.aClass16_Sub1_35.method2258() * 2 / 100;
			local20 += Static82.aClass16_Sub1_29.method2258() * 2 / 100;
			local20 += Static164.aClass16_Sub1_50.method2258() * 2 / 100;
			local20 += Static14.aClass16_Sub1_6.method2258() * 2 / 100;
			local20 += Static149.aClass16_Sub1_46.method2258() * 2 / 100;
			local20 += Static106.aClass16_Sub1_34.method2258() * 2 / 100;
			if (local20 == 100) {
				Static163.aClass18_1151 = Static96.aClass18_760;
				Static23.anInt699 = 45;
				Static144.anInt3993 = 30;
			} else {
				if (local20 != 0) {
					Static163.aClass18_1151 = Static144.method2735(new Class18[] { Static30.aClass18_256, Static132.method2564(local20), Static11.aClass18_122 });
				}
				Static144.anInt3993 = 30;
			}
		} else if (Static23.anInt699 == 45) {
			Static105.method2178(!Static27.aBoolean26);
			@Pc(444) Class1_Sub5_Sub3 local444 = new Class1_Sub5_Sub3();
			local444.method1225();
			Static177.aClass25_12 = Static37.method768(Static46.aCanvas38, Static162.aClass53_4, 22050, 0);
			Static177.aClass25_12.method1563(local444);
			Static11.method205(Static12.aClass16_Sub1_51, Static149.aClass16_Sub1_46, local444, Static106.aClass16_Sub1_34);
			Static47.aClass25_11 = Static37.method768(Static46.aCanvas38, Static162.aClass53_4, 2048, 1);
			Static2.aClass1_Sub5_Sub2_1 = new Class1_Sub5_Sub2();
			Static47.aClass25_11.method1563(Static2.aClass1_Sub5_Sub2_1);
			Static174.aClass32_1 = new Class32(22050, Static74.anInt2248);
			Static144.anInt3993 = 35;
			Static163.aClass18_1151 = Static48.aClass18_383;
			Static23.anInt699 = 50;
		} else if (Static23.anInt699 == 50) {
			local20 = 0;
			if (Static12.aClass1_Sub1_Sub8_Sub2_Sub1_37 == null) {
				Static12.aClass1_Sub1_Sub8_Sub2_Sub1_37 = Static51.method1106(Static119.aClass18_861, Static14.aClass16_Sub1_6, Static62.aClass18_472, Static127.aClass16_Sub1_41);
			} else {
				local20++;
			}
			if (Static37.aClass1_Sub1_Sub8_Sub2_Sub1_12 == null) {
				Static37.aClass1_Sub1_Sub8_Sub2_Sub1_12 = Static51.method1106(Static22.aClass18_192, Static14.aClass16_Sub1_6, Static62.aClass18_472, Static127.aClass16_Sub1_41);
			} else {
				local20++;
			}
			if (Static29.aClass1_Sub1_Sub8_Sub2_Sub1_11 == null) {
				Static29.aClass1_Sub1_Sub8_Sub2_Sub1_11 = Static51.method1106(Static96.aClass18_757, Static14.aClass16_Sub1_6, Static62.aClass18_472, Static127.aClass16_Sub1_41);
			} else {
				local20++;
			}
			if (local20 < 3) {
				Static163.aClass18_1151 = Static144.method2735(new Class18[] { Static152.aClass18_1075, Static132.method2564(local20 * 100 / 3), Static11.aClass18_122 });
				Static144.anInt3993 = 40;
			} else {
				Static163.aClass18_1151 = Static36.aClass18_280;
				Static144.anInt3993 = 40;
				Static23.anInt699 = 60;
			}
		} else if (Static23.anInt699 == 60) {
			local20 = Static114.method2306(Static107.aClass16_Sub1_35, Static127.aClass16_Sub1_41);
			local55 = Static166.method3057();
			if (local20 < local55) {
				Static163.aClass18_1151 = Static144.method2735(new Class18[] { Static54.aClass18_430, Static132.method2564(local20 * 100 / local55), Static11.aClass18_122 });
				Static144.anInt3993 = 50;
			} else {
				Static163.aClass18_1151 = Static159.aClass18_1126;
				Static144.anInt3993 = 50;
				Static6.method107(5);
				Static23.anInt699 = 70;
			}
		} else if (Static23.anInt699 == 70) {
			if (Static26.aClass16_Sub1_11.method2237()) {
				Static12.method3148(Static26.aClass16_Sub1_11);
				Static4.method87(Static26.aClass16_Sub1_11);
				Static42.method845(Static64.aClass16_Sub1_22, Static26.aClass16_Sub1_11);
				Static54.method1136(Static26.aClass16_Sub1_11, Static27.aBoolean26, Static64.aClass16_Sub1_22);
				Static6.method115(Static64.aClass16_Sub1_22, Static26.aClass16_Sub1_11);
				Static62.method1275(Static124.aBoolean153, Static26.aClass16_Sub1_11, Static12.aClass1_Sub1_Sub8_Sub2_Sub1_37, Static64.aClass16_Sub1_22);
				Static7.method118(Static142.aClass16_Sub1_45, Static142.aClass16_Sub1_44, Static26.aClass16_Sub1_11);
				Static35.method414(Static64.aClass16_Sub1_22, Static26.aClass16_Sub1_11);
				Static171.method3129(Static26.aClass16_Sub1_11);
				Static123.method2415(Static26.aClass16_Sub1_11);
				Static169.method3115(Static64.aClass16_Sub1_22, Static127.aClass16_Sub1_41, Static69.aClass16_Sub1_24, Static14.aClass16_Sub1_6);
				Static32.method695(Static26.aClass16_Sub1_11);
				Static127.method2491(Static26.aClass16_Sub1_11);
				Static23.anInt699 = 80;
				Static144.anInt3993 = 60;
				Static163.aClass18_1151 = Static34.aClass18_276;
			} else {
				Static163.aClass18_1151 = Static144.method2735(new Class18[] { Static108.aClass18_814, Static132.method2564(Static26.aClass16_Sub1_11.method2259()), Static11.aClass18_122 });
				Static144.anInt3993 = 60;
			}
		} else if (Static23.anInt699 == 80) {
			local20 = 0;
			if (Static145.aClass1_Sub1_Sub8_Sub3_7 == null) {
				Static145.aClass1_Sub1_Sub8_Sub3_7 = Static100.method2069(Static127.aClass16_Sub1_41, Static62.aClass18_472, Static82.aClass18_601);
			} else {
				local20++;
			}
			if (Static126.aClass1_Sub1_Sub8_Sub3_5 == null) {
				Static126.aClass1_Sub1_Sub8_Sub3_5 = Static100.method2069(Static127.aClass16_Sub1_41, Static62.aClass18_472, Static174.aClass18_1218);
			} else {
				local20++;
			}
			if (Static49.aClass1_Sub1_Sub8_Sub1Array2 == null) {
				Static49.aClass1_Sub1_Sub8_Sub1Array2 = Static101.method2130(Static127.aClass16_Sub1_41, Static62.aClass18_472, Static53.aClass18_423);
			} else {
				local20++;
			}
			if (Static121.aClass1_Sub1_Sub8_Sub3Array6 == null) {
				Static121.aClass1_Sub1_Sub8_Sub3Array6 = Static74.method1573(Static46.aClass18_1239, Static62.aClass18_472, Static127.aClass16_Sub1_41);
			} else {
				local20++;
			}
			if (Static126.aClass1_Sub1_Sub8_Sub3Array7 == null) {
				Static126.aClass1_Sub1_Sub8_Sub3Array7 = Static74.method1573(Static11.aClass18_124, Static62.aClass18_472, Static127.aClass16_Sub1_41);
			} else {
				local20++;
			}
			if (Static30.aClass1_Sub1_Sub8_Sub3Array2 == null) {
				Static30.aClass1_Sub1_Sub8_Sub3Array2 = Static74.method1573(Static111.aClass18_821, Static62.aClass18_472, Static127.aClass16_Sub1_41);
			} else {
				local20++;
			}
			if (Static114.aClass1_Sub1_Sub8_Sub3Array5 == null) {
				Static114.aClass1_Sub1_Sub8_Sub3Array5 = Static74.method1573(aClass18_761, Static62.aClass18_472, Static127.aClass16_Sub1_41);
			} else {
				local20++;
			}
			if (Static178.aClass1_Sub1_Sub8_Sub3Array10 == null) {
				Static178.aClass1_Sub1_Sub8_Sub3Array10 = Static74.method1573(Static126.aClass18_910, Static62.aClass18_472, Static127.aClass16_Sub1_41);
			} else {
				local20++;
			}
			if (Static108.aClass1_Sub1_Sub8_Sub3Array4 == null) {
				Static108.aClass1_Sub1_Sub8_Sub3Array4 = Static74.method1573(Static58.aClass18_452, Static62.aClass18_472, Static127.aClass16_Sub1_41);
			} else {
				local20++;
			}
			if (Static155.aClass1_Sub1_Sub8_Sub3Array9 == null) {
				Static155.aClass1_Sub1_Sub8_Sub3Array9 = Static74.method1573(Static23.aClass18_202, Static62.aClass18_472, Static127.aClass16_Sub1_41);
			} else {
				local20++;
			}
			if (Static147.aClass1_Sub1_Sub8_Sub3Array8 == null) {
				Static147.aClass1_Sub1_Sub8_Sub3Array8 = Static74.method1573(Static42.aClass18_340, Static62.aClass18_472, Static127.aClass16_Sub1_41);
			} else {
				local20++;
			}
			if (Static119.aClass1_Sub1_Sub8_Sub1Array7 == null) {
				Static119.aClass1_Sub1_Sub8_Sub1Array7 = Static101.method2130(Static127.aClass16_Sub1_41, Static62.aClass18_472, Static148.aClass18_1048);
			} else {
				local20++;
			}
			if (Static22.aClass1_Sub1_Sub8_Sub1Array1 == null) {
				Static22.aClass1_Sub1_Sub8_Sub1Array1 = Static101.method2130(Static127.aClass16_Sub1_41, Static62.aClass18_472, Static125.aClass18_904);
			} else {
				local20++;
			}
			if (Static69.aClass1_Sub1_Sub8_Sub1_2 == null) {
				Static69.aClass1_Sub1_Sub8_Sub1_2 = Static66.method1305(Static62.aClass18_472, Static4.aClass18_68, Static127.aClass16_Sub1_41);
			} else {
				local20++;
			}
			if (local20 < 14) {
				Static163.aClass18_1151 = Static144.method2735(new Class18[] { Static48.aClass18_384, Static132.method2564(local20 * 100 / 14), Static11.aClass18_122 });
				Static144.anInt3993 = 70;
			} else {
				local55 = (int) (Math.random() * 21.0D) - 10;
				Static67.aClass1_Sub1_Sub8_Sub1Array5 = Static22.aClass1_Sub1_Sub8_Sub1Array1;
				local65 = (int) (Math.random() * 21.0D) - 10;
				local75 = (int) (Math.random() * 21.0D) - 10;
				local69 = (int) (Math.random() * 41.0D) - 20;
				Static126.aClass1_Sub1_Sub8_Sub3_5.method1648();
				for (@Pc(952) int local952 = 0; local952 < Static121.aClass1_Sub1_Sub8_Sub3Array6.length; local952++) {
					Static121.aClass1_Sub1_Sub8_Sub3Array6[local952].method1636(local69 + local55, local69 + local65, local69 + local75);
				}
				Static49.aClass1_Sub1_Sub8_Sub1Array2[0].method918(local55 + local69, local65 + local69, local69 + local75);
				Static12.method3149();
				Static163.aClass18_1151 = Static85.aClass18_627;
				Static23.anInt699 = 90;
				Static144.anInt3993 = 70;
			}
		} else if (Static23.anInt699 == 90) {
			if (Static24.aClass16_Sub1_10.method2237()) {
				@Pc(1039) Class82 local1039 = new Class82(Static24.aClass16_Sub1_10, Static127.aClass16_Sub1_41, 20, Static27.aBoolean26 ? 64 : 128);
				Static79.method1766(local1039);
				Static79.method1759(0.8F);
				Static144.anInt3993 = 90;
				Static23.anInt699 = 110;
				Static163.aClass18_1151 = Static125.aClass18_901;
			} else {
				Static163.aClass18_1151 = Static144.method2735(new Class18[] { Static170.aClass18_1198, Static132.method2564(Static24.aClass16_Sub1_10.method2259()), Static11.aClass18_122 });
				Static144.anInt3993 = 90;
			}
		} else if (Static23.anInt699 == 110) {
			Static144.aClass56_1 = new Class56();
			Static162.aClass53_4.method2271(Static144.aClass56_1, 10);
			Static144.anInt3993 = 94;
			Static163.aClass18_1151 = Static88.aClass18_679;
			Static23.anInt699 = 120;
		} else if (Static23.anInt699 == 120) {
			if (Static107.aClass16_Sub1_35.method2253(Static35.aClass18_197, Static62.aClass18_472)) {
				@Pc(1106) Class15 local1106 = new Class15(Static107.aClass16_Sub1_35.method2249(Static35.aClass18_197, Static62.aClass18_472));
				Static133.method2586(local1106);
				Static144.anInt3993 = 96;
				Static163.aClass18_1151 = Static2.aClass18_52;
				Static23.anInt699 = 130;
			} else {
				Static163.aClass18_1151 = Static144.method2735(new Class18[] { Static5.aClass18_75, Static147.aClass18_1037 });
				Static144.anInt3993 = 96;
			}
		} else if (Static23.anInt699 == 130) {
			if (!Static69.aClass16_Sub1_24.method2237()) {
				Static163.aClass18_1151 = Static144.method2735(new Class18[] { Static93.aClass18_728, Static132.method2564(Static69.aClass16_Sub1_24.method2259() * 4 / 5), Static11.aClass18_122 });
				Static144.anInt3993 = 100;
			} else if (!Static164.aClass16_Sub1_50.method2237()) {
				Static163.aClass18_1151 = Static144.method2735(new Class18[] { Static93.aClass18_728, Static132.method2564(Static164.aClass16_Sub1_50.method2259() / 6 + 80), Static11.aClass18_122 });
				Static144.anInt3993 = 100;
			} else if (Static14.aClass16_Sub1_6.method2237()) {
				Static23.anInt699 = 140;
				Static163.aClass18_1151 = Static142.aClass18_996;
				Static144.anInt3993 = 100;
			} else {
				Static163.aClass18_1151 = Static144.method2735(new Class18[] { Static93.aClass18_728, Static132.method2564(Static14.aClass16_Sub1_6.method2259() / 20 + 96), Static11.aClass18_122 });
				Static144.anInt3993 = 100;
			}
		} else if (Static23.anInt699 == 140) {
			Static6.method107(10);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(III[Lclient!ea;)Lclient!ea;")
	public static Class18 method2116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class18[] arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg0; local9++) {
			if (arg2[arg1 + local9] == null) {
				arg2[arg1 + local9] = Static91.aClass18_689;
			}
			local7 += arg2[local9 + arg1].anInt1129;
		}
		@Pc(51) int local51 = 0;
		@Pc(54) byte[] local54 = new byte[local7];
		@Pc(65) Class18 local65;
		for (@Pc(56) int local56 = 0; local56 < arg0; local56++) {
			local65 = arg2[arg1 + local56];
			Static185.method2279(local65.aByteArray6, 0, local54, local51, local65.anInt1129);
			local51 += local65.anInt1129;
		}
		local65 = new Class18();
		local65.anInt1129 = local7;
		local65.aByteArray6 = local54;
		return local65;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BZZ)I")
	public static int method2117() {
		return Static88.anInt2735 + Static78.anInt2403;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!fb;B)V")
	public static void method2118(@OriginalArg(0) Class1_Sub10 arg0) {
		Static31.method685(arg0, 200000);
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
	public static void method2119() {
		aClass53_2 = null;
		aClass21_4 = null;
		aClass18_762 = null;
		aClass18_761 = null;
		anIntArrayArray86 = null;
		anIntArray265 = null;
	}
}
