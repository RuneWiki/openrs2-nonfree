import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
	public static int anInt2040;

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[100];

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIILclient!fda;ILclient!fda;IBII)V")
	public static void method1842(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class28_Sub1_Sub4_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class28_Sub1_Sub4_Sub2 arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6) {
		@Pc(7) int local7 = arg2.method4591();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class50 local21 = (Class50) Static196.aClass340_21.method7999((long) local7);
		if (local21 == null) {
			@Pc(28) Class369[] local28 = Static689.method8535(Static257.aClass390_60, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static208.aClass65_7.method6898(local28[0], true);
			Static196.aClass340_21.method7986((long) local7, local21);
		}
		Static476.method6822(arg0 >> 1, arg4.anInt10784, arg5 >> 1, 0, arg4.anInt10781, arg4.method4599() * 256, arg4.aByte145);
		@Pc(80) int local80 = arg3 + Static665.anIntArray475[0] - 18;
		@Pc(88) int local88 = local80 + arg1 / 4 * 18;
		@Pc(98) int local98 = Static665.anIntArray475[1] + arg6 - 16 - 54;
		@Pc(106) int local106 = local98 + arg1 % 4 * 18;
		local21.method5996(local88, local106);
		if (arg4 == arg2) {
			Static208.aClass65_7.method6943(local88 - 1, 18, 18, local106 - 1, -256);
		}
		Static520.method7366(local88 - 1, local106 + 18, local106 - 1, local88 + 18);
		@Pc(142) Class28_Sub8 local142 = Static63.method892();
		local142.anInt10185 = local88;
		local142.aClass28_Sub1_Sub4_Sub2_1 = arg2;
		local142.anInt10186 = local106;
		local142.anInt10188 = local106 + 16;
		local142.anInt10190 = local88 + 16;
		Static439.aClass156_7.method3774(local142);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)I")
	public static int method1843() {
		@Pc(8) int local8;
		if (Static172.aClass5_Sub50_14.aClass12_Sub5_1.method1912() == 0) {
			for (local8 = 0; local8 < Static276.anInt10228; local8++) {
				if (Static340.anInterface16Array2[local8].method7501() == 's' || Static340.anInterface16Array2[local8].method7501() == 'S') {
					Static172.aClass5_Sub50_14.method7531(1, Static172.aClass5_Sub50_14.aClass12_Sub5_1);
					Static83.aBoolean168 = true;
					break;
				}
			}
		}
		@Pc(68) int local68;
		if (Static123.aClass259_1 == Static412.aClass259_2) {
			@Pc(58) Runtime local58 = Runtime.getRuntime();
			local68 = (int) ((local58.totalMemory() - local58.freeMemory()) / 1024L);
			@Pc(71) long local71 = Static547.method7619();
			if (Static396.aLong181 == 0L) {
				Static396.aLong181 = local71;
			}
			if (local68 > 16384 && local71 - Static396.aLong181 < 5000L) {
				if (local71 - Static184.aLong70 > 1000L) {
					System.gc();
					Static184.aLong70 = local71;
				}
				return 0;
			}
		}
		if (Static412.aClass259_3 == Static123.aClass259_1) {
			if (Static303.aClass224_1 == null) {
				Static303.aClass224_1 = new Class224(Static671.aClass296_3, Static405.aClass147_5, Static627.aBigInteger6, Static280.aBigInteger1);
			}
			if (!Static303.aClass224_1.method5532()) {
				return 0;
			}
			Static77.method1011((String) null, true, 0);
			Static212.aBoolean330 = !Static238.method3729();
			Static552.aClass390_108 = Static366.method5555(Static212.aBoolean330 ? 34 : 32, 1, false);
			Static250.aClass390_57 = Static366.method5555(33, 1, false);
			Static536.aClass390_104 = Static366.method5555(13, 1, false);
		}
		@Pc(162) boolean local162;
		if (Static412.aClass259_4 == Static123.aClass259_1) {
			local162 = Static250.aClass390_57.method8932();
			local68 = Static609.aClass210_Sub1Array2[33].method5149();
			local68 += Static609.aClass210_Sub1Array2[Static212.aBoolean330 ? 34 : 32].method5149();
			local68 += Static609.aClass210_Sub1Array2[13].method5149();
			local68 += local162 ? 100 : Static250.aClass390_57.method8934();
			if (local68 != 400) {
				return local68 / 4;
			}
			Static402.anInt7159 = Static552.aClass390_108.method8915();
			Static274.anInt5021 = Static250.aClass390_57.method8915();
			Static50.method627(Static552.aClass390_108);
			@Pc(225) int local225 = Static172.aClass5_Sub50_14.aClass12_Sub12_1.method2961();
			Static189.aClass267_1 = new Class267(Static218.aClass98_2, Static544.anInt8937, Static250.aClass390_57);
			@Pc(237) int[] local237 = Static189.aClass267_1.method6305(local225);
			if (local237.length == 0) {
				local237 = Static189.aClass267_1.method6305(0);
			}
			@Pc(251) Class119 local251 = new Class119(Static552.aClass390_108, Static536.aClass390_104);
			if (local237.length > 0) {
				Static655.anInterface5Array1 = new Interface5[local237.length];
				for (@Pc(260) int local260 = 0; local260 < Static655.anInterface5Array1.length; local260++) {
					Static655.anInterface5Array1[local260] = new Class366(Static189.aClass267_1.method6307(local237[local260]), local251);
				}
			}
		}
		if (Static123.aClass259_1 == Static412.aClass259_5) {
			Static324.method8036(Static552.aClass390_108, Static536.aClass390_104, Static669.method8920());
		}
		if (Static123.aClass259_1 == Static412.aClass259_6) {
			local8 = Static45.method607();
			local68 = Static266.method4132();
			if (local68 > local8) {
				return local8 * 100 / local68;
			}
		}
		if (Static412.aClass259_7 == Static123.aClass259_1) {
			if (Static655.anInterface5Array1 != null && Static655.anInterface5Array1.length > 0) {
				if (Static655.anInterface5Array1[0].method8489() < 100) {
					return 0;
				}
				if (Static655.anInterface5Array1.length > 1 && Static189.aClass267_1.method6304() && Static655.anInterface5Array1[1].method8489() < 100) {
					return 0;
				}
			}
			Static508.method7269(Static208.aClass65_7);
			Static679.method9046(Static208.aClass65_7);
			Static271.method4671(1);
		}
		if (Static412.aClass259_8 == Static123.aClass259_1) {
			for (local8 = 0; local8 < 4; local8++) {
				Static275.aClass106Array1[local8] = Static449.method6487(Static626.anInt10238, Static201.anInt3834);
			}
		}
		if (Static412.aClass259_9 == Static123.aClass259_1) {
			Static257.aClass390_60 = Static366.method5555(8, 1, false);
			Static605.aClass390_117 = Static366.method5555(0, 1, false);
			Static100.aClass390_20 = Static366.method5555(1, 1, false);
			Static111.aClass390_79 = Static366.method5555(2, 1, false);
			Static622.aClass390_120 = Static366.method5555(3, 1, false);
			Static162.aClass390_35 = Static366.method5555(4, 1, false);
			Static260.aClass390_61 = Static366.method5555(5, 1, true);
			Static396.aClass390_82 = Static366.method5555(6, 1, true);
			Static676.aClass390_129 = Static366.method5555(7, 1, false);
			Static274.aClass390_67 = Static366.method5555(9, 1, false);
			Static83.aClass390_15 = Static366.method5555(10, 1, false);
			Static233.aClass390_54 = Static366.method5555(11, 1, false);
			Static98.aClass390_19 = Static366.method5555(12, 1, false);
			Static180.aClass390_42 = Static366.method5555(14, 1, false);
			Static548.aClass390_107 = Static366.method5555(15, 1, false);
			Static161.aClass390_71 = Static366.method5555(16, 1, false);
			Static242.aClass390_56 = Static366.method5555(17, 1, false);
			Static145.aClass390_31 = Static366.method5555(18, 1, false);
			Static7.aClass390_1 = Static366.method5555(19, 1, false);
			Static556.aClass390_110 = Static366.method5555(20, 1, false);
			Static143.aClass390_30 = Static366.method5555(21, 1, false);
			Static432.aClass390_85 = Static366.method5555(22, 1, false);
			Static543.aClass390_106 = Static366.method5555(23, 1, true);
			Static86.aClass390_16 = Static366.method5555(24, 1, false);
			Static474.aClass390_90 = Static366.method5555(25, 1, false);
			Static230.aClass390_52 = Static366.method5555(26, 1, true);
			Static570.aClass390_113 = Static366.method5555(27, 1, false);
			Static137.aClass390_29 = Static366.method5555(28, 1, true);
			Static509.aClass390_99 = Static366.method5555(29, 1, false);
			Static205.aClass390_11 = Static366.method5555(30, 1, true);
			Static305.aClass390_77 = Static366.method5555(31, 1, true);
			Static570.aClass390_114 = Static366.method5555(36, 2, true);
		}
		if (Static412.aClass259_10 == Static123.aClass259_1) {
			local8 = 0;
			for (local68 = 0; local68 < 37; local68++) {
				if (Static609.aClass210_Sub1Array2[local68] != null) {
					local8 += Static609.aClass210_Sub1Array2[local68].method5149() * Static45.anIntArray35[local68] / 100;
				}
			}
			if (local8 != 100) {
				if (Static107.anInt2280 < 0) {
					Static107.anInt2280 = local8;
				}
				return (local8 - Static107.anInt2280) * 100 / (100 - Static107.anInt2280);
			}
			Static164.method2894(Static257.aClass390_60);
			Static324.method8036(Static257.aClass390_60, Static536.aClass390_104, Static669.method8920());
		}
		if (Static412.aClass259_11 == Static123.aClass259_1) {
			if (Static433.anInt7533 == -1) {
				Static433.anInt7533 = Static396.aClass390_82.method8910("scape main");
			}
			Static231.method3571();
			Static271.method4671(2);
		}
		if (Static412.aClass259_12 == Static123.aClass259_1) {
			Static351.method4746(Static205.aClass390_11, Static570.aClass268_5);
		}
		if (Static123.aClass259_1 == Static412.aClass259_13) {
			local8 = Static321.method5003();
			if (local8 < 100) {
				return local8;
			}
			Static440.method6430(Static137.aClass390_29.method8923(1));
			Static269.method4164(Static137.aClass390_29.method8923(3));
			Static600.aClass236_2 = new Class236(Static137.aClass390_29);
		}
		if (Static412.aClass259_14 == Static123.aClass259_1) {
			if (Static105.anInt2259 != -1 && !Static676.aClass390_129.method8902(Static105.anInt2259, 0)) {
				return 99;
			}
			Static476.anInterface4_10 = new Class27(Static230.aClass390_52, Static274.aClass390_67, Static257.aClass390_60);
			Static191.aClass381_2 = new Class381(Static218.aClass98_2, Static544.anInt8937, Static111.aClass390_79);
			Static299.aClass286_2 = new Class286(Static218.aClass98_2, Static544.anInt8937, Static111.aClass390_79, Static600.aClass236_2);
			Static317.aClass176_2 = new Class176(Static218.aClass98_2, Static544.anInt8937, Static111.aClass390_79, Static257.aClass390_60);
			Static548.aClass190_1 = new Class190(Static218.aClass98_2, Static544.anInt8937, Static242.aClass390_56);
			Static99.aClass367_4 = new Class367(Static218.aClass98_2, Static544.anInt8937, Static111.aClass390_79);
			Static494.aClass314_5 = new Class314(Static218.aClass98_2, Static544.anInt8937, Static111.aClass390_79);
			Static463.aClass70_2 = new Class70(Static218.aClass98_2, Static544.anInt8937, Static111.aClass390_79, Static257.aClass390_60);
			Static619.aClass94_2 = new Class94(Static218.aClass98_2, Static544.anInt8937, Static111.aClass390_79, Static676.aClass390_129);
			Static446.aClass242_1 = new Class242(Static218.aClass98_2, Static544.anInt8937, Static111.aClass390_79);
			Static497.aClass182_4 = new Class182(Static218.aClass98_2, Static544.anInt8937, Static111.aClass390_79);
			Static568.aClass315_5 = new Class315(Static218.aClass98_2, Static544.anInt8937, true, Static161.aClass390_71, Static676.aClass390_129);
			Static49.aClass93_1 = new Class93(Static218.aClass98_2, Static544.anInt8937, Static111.aClass390_79, Static257.aClass390_60);
			Static367.aClass365_4 = new Class365(Static218.aClass98_2, Static544.anInt8937, Static111.aClass390_79, Static257.aClass390_60);
			Static231.aClass19_2 = new Class19(Static218.aClass98_2, Static544.anInt8937, true, Static145.aClass390_31, Static676.aClass390_129);
			Static110.aClass105_1 = new Class105(Static218.aClass98_2, Static544.anInt8937, true, Static191.aClass381_2, Static7.aClass390_1, Static676.aClass390_129);
			Static62.aClass336_1 = new Class336(Static218.aClass98_2, Static544.anInt8937, Static111.aClass390_79);
			Static591.aClass66_2 = new Class66(Static218.aClass98_2, Static544.anInt8937, Static556.aClass390_110, Static605.aClass390_117, Static100.aClass390_20);
			Static62.aClass393_1 = new Class393(Static218.aClass98_2, Static544.anInt8937, Static111.aClass390_79);
			Static230.aClass122_1 = new Class122(Static218.aClass98_2, Static544.anInt8937, Static111.aClass390_79);
			Static239.aClass91_1 = new Class91(Static218.aClass98_2, Static544.anInt8937, Static143.aClass390_30, Static676.aClass390_129);
			Static73.aClass211_1 = new Class211(Static218.aClass98_2, Static544.anInt8937, Static111.aClass390_79);
			Static412.aClass266_1 = new Class266(Static218.aClass98_2, Static544.anInt8937, Static111.aClass390_79);
			Static564.aClass185_6 = new Class185(Static218.aClass98_2, Static544.anInt8937, Static111.aClass390_79);
			Static545.aClass171_1 = new Class171(Static218.aClass98_2, Static544.anInt8937, Static432.aClass390_85);
			Static294.aClass389_1 = new Class389(Static218.aClass98_2, Static544.anInt8937, Static111.aClass390_79);
			Static667.aClass278_1 = new Class278(Static218.aClass98_2, Static544.anInt8937, Static111.aClass390_79);
			Static347.method5292(Static257.aClass390_60, Static536.aClass390_104, Static676.aClass390_129, Static622.aClass390_120);
			Static604.method8267(Static509.aClass390_99);
			Static314.aClass174_1 = new Class174(Static544.anInt8937, Static86.aClass390_16, Static474.aClass390_90);
			Static502.aClass163_2 = new Class163(Static544.anInt8937, Static86.aClass390_16, Static474.aClass390_90, new Class26());
			Static60.method6634();
			Static568.aClass315_5.method7513(Static172.aClass5_Sub50_14.aClass12_Sub8_2.method2213() == 0);
			Static161.aClass237_3 = new Class237();
			Static675.method9021();
			Static144.method2596(Static570.aClass390_113);
			Static628.method8483(Static476.anInterface4_10, Static676.aClass390_129);
			@Pc(983) Class229 local983 = new Class229(Static83.aClass390_15.method8917("huffman", ""));
			Static285.method4610(local983);
			try {
				jagmisc.init();
			} catch (@Pc(990) Throwable local990) {
			}
			Static282.aClass23_1 = Static439.method6411();
			Static580.aClass5_Sub30_1 = new Class5_Sub30(true, Static570.aClass268_5);
		}
		if (Static412.aClass259_16 == Static123.aClass259_1) {
			local8 = Static99.method1955(Static257.aClass390_60) + Static204.method3291(true);
			local68 = Static260.method4076() + Static266.method4132();
			if (local8 < local68) {
				return local8 * 100 / local68;
			}
		}
		if (Static123.aClass259_1 == Static412.aClass259_17) {
			Static330.method685(Static543.aClass390_106, Static99.aClass367_4, Static494.aClass314_5, Static568.aClass315_5, Static49.aClass93_1, Static367.aClass365_4, Static161.aClass237_3);
		}
		if (Static123.aClass259_1 == Static412.aClass259_18) {
			Static326.anIntArray342 = new int[Static564.aClass185_6.anInt5742];
			Static2.aStringArray1 = new String[Static412.aClass266_1.anInt7485];
			Static180.aBooleanArray15 = new boolean[Static564.aClass185_6.anInt5742];
			for (local8 = 0; local8 < Static564.aClass185_6.anInt5742; local8++) {
				if (Static564.aClass185_6.method4761(local8).anInt6345 == 0) {
					Static180.aBooleanArray15[local8] = true;
					Static115.anInt2386++;
				}
				Static326.anIntArray342[local8] = -1;
			}
			Static146.method2657();
			Static637.anInt10350 = Static622.aClass390_120.method8910("loginscreen");
			Static43.anInt681 = Static622.aClass390_120.method8910("lobbyscreen");
			Static260.aClass390_61.method8922(false);
			Static396.aClass390_82.method8922(true);
			Static257.aClass390_60.method8922(true);
			Static536.aClass390_104.method8922(true);
			Static83.aClass390_15.method8922(true);
			Static622.aClass390_120.method8922(true);
			Static582.aBoolean919 = true;
			Static111.aClass390_79.anInt10731 = 2;
			Static242.aClass390_56.anInt10731 = 2;
			Static161.aClass390_71.anInt10731 = 2;
			Static145.aClass390_31.anInt10731 = 2;
			Static7.aClass390_1.anInt10731 = 2;
			Static556.aClass390_110.anInt10731 = 2;
			Static143.aClass390_30.anInt10731 = 2;
		}
		if (Static123.aClass259_1 == Static412.aClass259_19) {
			if (!Static107.method2043(Static637.anInt10350)) {
				return 0;
			}
			local162 = true;
			for (local68 = 0; local68 < Static648.aClass345ArrayArray2[Static637.anInt10350].length; local68++) {
				@Pc(1178) Class345 local1178 = Static648.aClass345ArrayArray2[Static637.anInt10350][local68];
				if (local1178.anInt9591 == 5 && local1178.anInt9669 != -1 && !Static257.aClass390_60.method8902(local1178.anInt9669, 0)) {
					local162 = false;
				}
			}
			if (!local162) {
				return 0;
			}
		}
		if (Static412.aClass259_20 == Static123.aClass259_1) {
			Static564.method5793(true);
		}
		if (Static123.aClass259_1 == Static412.aClass259_21) {
			Static471.aClass352_41.method8260();
			try {
				Static430.aThread2.join();
			} catch (@Pc(1226) InterruptedException local1226) {
				return 0;
			}
			Static552.aClass390_108 = null;
			Static655.anInterface5Array1 = null;
			Static189.aClass267_1 = null;
			Static430.aThread2 = null;
			Static250.aClass390_57 = null;
			Static471.aClass352_41 = null;
			Static521.method7385();
			Static554.aBoolean774 = Static172.aClass5_Sub50_14.aClass12_Sub5_1.method1912() == 1;
			Static172.aClass5_Sub50_14.method7531(1, Static172.aClass5_Sub50_14.aClass12_Sub5_1);
			if (Static554.aBoolean774) {
				Static172.aClass5_Sub50_14.method7531(0, Static172.aClass5_Sub50_14.aClass12_Sub16_1);
			} else if (Static172.aClass5_Sub50_14.aClass12_Sub16_1.aBoolean350 && Static580.aClass5_Sub30_1.anInt4762 < 512 && Static580.aClass5_Sub30_1.anInt4762 != 0) {
				Static172.aClass5_Sub50_14.method7531(0, Static172.aClass5_Sub50_14.aClass12_Sub16_1);
			}
			Static102.method1995();
			if (Static554.aBoolean774) {
				Static428.method6321(0, false);
			} else {
				Static428.method6321(Static172.aClass5_Sub50_14.aClass12_Sub16_1.method3616(), false);
			}
			Static279.method4512(-1, false, Static172.aClass5_Sub50_14.aClass12_Sub9_2.method2337(), -1);
			Static508.method7269(Static208.aClass65_7);
			Static679.method9046(Static208.aClass65_7);
			Static113.method2119(Static257.aClass390_60, Static208.aClass65_7);
			Static436.method6381(Static366.aClass50Array9);
		}
		return Static207.method3304();
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(III)V")
	public static void method1844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static239.method3757(arg0, arg1);
	}
}
