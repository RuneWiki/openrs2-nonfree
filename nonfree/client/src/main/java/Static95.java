import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3 aClass2_Sub2_Sub2_Sub3_24;

	@OriginalMember(owner = "client!vd", name = "s", descriptor = "Lclient!ud;")
	public static Class5 aClass5_30;

	@OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
	public static int anInt2493;

	@OriginalMember(owner = "client!vd", name = "y", descriptor = "[I")
	public static int[] anIntArray547;

	@OriginalMember(owner = "client!vd", name = "z", descriptor = "Lclient!fc;")
	public static Class2_Sub2_Sub2_Sub2 aClass2_Sub2_Sub2_Sub2_5;

	@OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
	public static int anInt2495;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!o;Lclient!o;ILclient!ud;)Lclient!vb;", line = 36)
	public static Class2_Sub2_Sub2_Sub4 method1644(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(3) Class5 arg2) {
		@Pc(8) int local8 = arg2.method80(arg0);
		@Pc(14) int local14 = arg2.method72(arg1, local8);
		return Static36.method732(arg2, local8, local14);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!cc;", line = 59)
	public static RuntimeException_Sub1 method1645(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString7 = local12.aString7 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!vb;II)V", line = 121)
	public static void method1646(@OriginalArg(1) Class2_Sub2_Sub2_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg1 * arg1 + arg2 * arg2;
		if (local11 <= 4225 || local11 >= 90000) {
			Static82.method1461(arg2, arg0, arg1);
			return;
		}
		@Pc(32) int local32 = Class52.anInt1978 + Class38.anInt1669 & 0x7FF;
		@Pc(36) int local36 = Class2_Sub2_Sub12_Sub4.anIntArray386[local32];
		@Pc(44) int local44 = local36 * 256 / (Class12_Sub1.anInt1857 + 256);
		@Pc(48) int local48 = Class2_Sub2_Sub12_Sub4.anIntArray402[local32];
		@Pc(56) int local56 = local48 * 256 / (Class12_Sub1.anInt1857 + 256);
		@Pc(67) int local67 = local44 * arg1 + arg2 * local56 >> 16;
		@Pc(78) int local78 = local56 * arg1 - arg2 * local44 >> 16;
		@Pc(84) double local84 = Math.atan2((double) local67, (double) local78);
		@Pc(90) int local90 = (int) (Math.sin(local84) * 63.0D);
		@Pc(96) int local96 = (int) (Math.cos(local84) * 57.0D);
		Static96.aClass2_Sub2_Sub2_Sub4_10.method1623(local90 + 94 + 4 - 10, -20 + 83 + -local96, local84);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V", line = 167)
	public static void method1647() {
		@Pc(17) int local17;
		if (Class12.anInt1850 == 0) {
			Static85.aClass55_1 = new Class55(4, 104, 104, Class57.anIntArrayArrayArray8);
			for (local17 = 0; local17 < 4; local17++) {
				Class18.aClass20Array3[local17] = new Class20(104, 104);
			}
			Static85.aClass2_Sub2_Sub2_Sub4_8 = new Class2_Sub2_Sub2_Sub4(512, 512);
			Class60.aClass40_680 = Class34.aClass40_446;
			Class12.anInt1850 = 20;
			Class59.anInt2194 = 5;
			return;
		}
		@Pc(54) int local54;
		@Pc(62) int local62;
		@Pc(72) int local72;
		@Pc(66) int local66;
		if (Class12.anInt1850 == 20) {
			@Pc(52) int[] local52 = new int[9];
			for (local54 = 0; local54 < 9; local54++) {
				local62 = local54 * 32 + 143;
				local66 = Class2_Sub2_Sub2_Sub1.anIntArray59[local62];
				local72 = local62 * 3 + 600;
				local52[local54] = local72 * local66 >> 16;
			}
			Static81.method1422(local52);
			Class12.anInt1850 = 25;
			Class60.aClass40_680 = Class24.aClass40_721;
			Class59.anInt2194 = 10;
			return;
		}
		try {
			if (Class12.anInt1850 == 25) {
				if (Static9.aClass14_1 != null && Static61.aClass14_4 != null && Static61.aClass14_4.method351() < 60000L) {
					Static30.aClass11Array2 = new Class11[5];
					for (local17 = 0; local17 < 5; local17++) {
						Static30.aClass11Array2[local17] = new Class11(local17 + 1, Static9.aClass14_1, Class2_Sub6.aClass14Array2[local17], 500000);
					}
					Static17.aClass11Array1 = new Class11[12];
					for (local54 = 0; local54 < 12; local54++) {
						Static17.aClass11Array1[local54] = new Class11(local54, Static61.aClass14_4, Class3.aClass14Array1[local54], 500000);
					}
					Class2_Sub2_Sub15.anInt2396 = 0;
					Class60.aClass40_680 = Class2_Sub3.aClass40_736;
					Class59.anInt2194 = 15;
					Class12.anInt1850 = 26;
					return;
				}
				Class59.anInt2194 = 15;
				Class12.anInt1850 = 30;
				Class60.aClass40_680 = Class19.aClass40_140;
				return;
			}
			if (Class12.anInt1850 == 26) {
				while (Class2_Sub2_Sub15.anInt2396 < 65535) {
					Static26.method540(Static30.aClass11Array2[1], Static17.aClass11Array1[7], Class2_Sub2_Sub15.anInt2396++);
					if ((Class2_Sub2_Sub15.anInt2396 & 0xFF) == 0) {
						Class60.aClass40_680 = Static72.method1334(new Class40[] { Class2_Sub3_Sub1.aClass40_740, Static48.method859(Class2_Sub2_Sub15.anInt2396 * 100 / 65536), Class32.aClass40_430 });
						Class59.anInt2194 = 15;
						return;
					}
				}
				Class59.anInt2194 = 15;
				Class12.anInt1850 = 27;
				Class2_Sub2_Sub15.anInt2396 = 0;
				Class60.aClass40_680 = Class19.aClass40_139;
				return;
			}
			if (Class12.anInt1850 == 27) {
				while (Class2_Sub2_Sub15.anInt2396 < 65535) {
					Static26.method540(Static30.aClass11Array2[3], Static17.aClass11Array1[6], Class2_Sub2_Sub15.anInt2396++);
					if ((Class2_Sub2_Sub15.anInt2396 & 0xFF) == 0) {
						Class60.aClass40_680 = Static72.method1334(new Class40[] { Class54.aClass40_605, Static48.method859(Class2_Sub2_Sub15.anInt2396 * 100 / 65536), Class32.aClass40_430 });
						Class59.anInt2194 = 15;
						return;
					}
				}
				Class60.aClass40_680 = Class40.aClass40_507;
				Class59.anInt2194 = 15;
				Class12.anInt1850 = 28;
				Class2_Sub2_Sub15.anInt2396 = 0;
				return;
			}
			if (Class12.anInt1850 == 28) {
				while (Class2_Sub2_Sub15.anInt2396 < 65535) {
					Static26.method540(Static30.aClass11Array2[4], Static17.aClass11Array1[5], Class2_Sub2_Sub15.anInt2396++);
					if ((Class2_Sub2_Sub15.anInt2396 & 0xFF) == 0) {
						Class60.aClass40_680 = Static72.method1334(new Class40[] { Class53.aClass40_571, Static48.method859(Class2_Sub2_Sub15.anInt2396 * 100 / 65536), Class32.aClass40_430 });
						Class59.anInt2194 = 15;
						return;
					}
				}
				Class12.anInt1850 = 30;
				Class60.aClass40_680 = Applet_Sub1.aClass40_105;
				Class59.anInt2194 = 15;
				return;
			}
		} catch (@Pc(368) Exception local368) {
			if (Class12.anInt1850 < 30) {
				Class12.anInt1850 = 30;
			}
		}
		if (Class12.anInt1850 == 30) {
			Static40.aClass5_Sub1_14 = Static66.method1188(false, 0, true, true);
			Static79.aClass5_Sub1_18 = Static66.method1188(false, 1, true, true);
			Static5.aClass5_Sub1_1 = Static66.method1188(true, 2, true, false);
			Static26.aClass5_Sub1_5 = Static66.method1188(false, 3, true, true);
			Static33.aClass5_Sub1_7 = Static66.method1188(false, 4, true, true);
			Static34.aClass5_Sub1_8 = Static66.method1188(true, 5, true, true);
			Static77.aClass5_Sub1_17 = Static66.method1188(true, 6, false, true);
			Static24.aClass5_Sub1_4 = Static66.method1188(false, 7, true, true);
			Static74.aClass5_Sub1_16 = Static66.method1188(false, 8, true, true);
			Static33.aClass5_Sub1_6 = Static66.method1188(false, 9, true, true);
			Static73.aClass5_Sub1_15 = Static66.method1188(false, 10, true, true);
			Static68.aClass5_Sub1_13 = Static66.method1188(false, 11, true, true);
			Class60.aClass40_680 = Class2_Sub2_Sub15.aClass40_691;
			Class59.anInt2194 = 20;
			Class12.anInt1850 = 40;
		} else if (Class12.anInt1850 == 40) {
			local17 = Static40.aClass5_Sub1_14.method89() * 5 / 100;
			local17 += Static79.aClass5_Sub1_18.method89() * 5 / 100;
			local17 += Static5.aClass5_Sub1_1.method89() * 5 / 100;
			local17 += Static26.aClass5_Sub1_5.method89() * 5 / 100;
			local17 += Static33.aClass5_Sub1_7.method89() * 5 / 100;
			local17 += Static34.aClass5_Sub1_8.method89() * 5 / 100;
			local17 += Static77.aClass5_Sub1_17.method89() * 5 / 100;
			local17 += Static24.aClass5_Sub1_4.method89() * 45 / 100;
			local17 += Static74.aClass5_Sub1_16.method89() * 5 / 100;
			local17 += Static33.aClass5_Sub1_6.method89() * 5 / 100;
			local17 += Static73.aClass5_Sub1_15.method89() * 5 / 100;
			local17 += Static68.aClass5_Sub1_13.method89() * 5 / 100;
			if (local17 == 100) {
				Class59.anInt2194 = 30;
				Class12.anInt1850 = 45;
				Class60.aClass40_680 = Class2_Sub2_Sub12_Sub5.aClass40_584;
			} else {
				if (local17 != 0) {
					Class60.aClass40_680 = Static72.method1334(new Class40[] { Class49.aClass40_558, Static48.method859(local17), Class32.aClass40_430 });
				}
				Class59.anInt2194 = 30;
			}
		} else if (Class12.anInt1850 == 45) {
			Static79.method1400(Static91.aClass7_2, !Class1.aBoolean2);
			Static80.aClass2_Sub10_Sub2_1 = Static35.method717(Static91.aClass7_2, Static7.method185());
			Static10.aClass56_1 = new Class56(22050, Static11.anInt291);
			Class59.anInt2194 = 35;
			Class12.anInt1850 = 50;
			Class60.aClass40_680 = Class58.aClass40_625;
		} else if (Class12.anInt1850 == 50) {
			local17 = 0;
			if (Static70.aClass2_Sub2_Sub2_Sub2_4 == null) {
				Static70.aClass2_Sub2_Sub2_Sub2_4 = Static50.method941(Static74.aClass5_Sub1_16, Class34.aClass40_445, Class45_Sub1.aClass40_620);
			} else {
				local17++;
			}
			if (aClass2_Sub2_Sub2_Sub2_5 == null) {
				aClass2_Sub2_Sub2_Sub2_5 = Static50.method941(Static74.aClass5_Sub1_16, Class34.aClass40_445, Class64.aClass40_726);
			} else {
				local17++;
			}
			if (Static13.aClass2_Sub2_Sub2_Sub2_1 == null) {
				Static13.aClass2_Sub2_Sub2_Sub2_1 = Static50.method941(Static74.aClass5_Sub1_16, Class34.aClass40_445, Class10.aClass40_69);
			} else {
				local17++;
			}
			if (Static39.aClass2_Sub2_Sub2_Sub2_2 == null) {
				Static39.aClass2_Sub2_Sub2_Sub2_2 = Static50.method941(Static74.aClass5_Sub1_16, Class34.aClass40_445, Class18.aClass40_543);
			} else {
				local17++;
			}
			if (local17 < 4) {
				Class60.aClass40_680 = Static72.method1334(new Class40[] { Class2_Sub2_Sub1.aClass40_47, Static48.method859(local17 * 100 / 4), Class32.aClass40_430 });
				Class59.anInt2194 = 40;
			} else {
				Class12.anInt1850 = 60;
				Class59.anInt2194 = 40;
				Static45.aClass2_Sub2_Sub2_Sub2Array9 = new Class2_Sub2_Sub2_Sub2[] { Static70.aClass2_Sub2_Sub2_Sub2_4, aClass2_Sub2_Sub2_Sub2_5, Static13.aClass2_Sub2_Sub2_Sub2_1, Static39.aClass2_Sub2_Sub2_Sub2_2 };
				Class60.aClass40_680 = Class2_Sub2_Sub16.aClass40_711;
			}
		} else if (Class12.anInt1850 == 60) {
			local17 = Static93.method1592(Static74.aClass5_Sub1_16, Static73.aClass5_Sub1_15);
			local54 = Static5.method120();
			if (local17 < local54) {
				Class60.aClass40_680 = Static72.method1334(new Class40[] { Class33.aClass40_434, Static48.method859(local17 * 100 / local54), Class32.aClass40_430 });
				Class59.anInt2194 = 50;
			} else {
				Class60.aClass40_680 = Class41.aClass40_516;
				Class59.anInt2194 = 50;
				Static7.method187(5);
				Class12.anInt1850 = 70;
			}
		} else if (Class12.anInt1850 == 70) {
			if (Static5.aClass5_Sub1_1.method78()) {
				Static91.method75(Static5.aClass5_Sub1_1);
				Static5.method117(Static5.aClass5_Sub1_1);
				Static30.method591(Static24.aClass5_Sub1_4, Static5.aClass5_Sub1_1);
				Static87.method1518(Class1.aBoolean2, Static24.aClass5_Sub1_4, Static5.aClass5_Sub1_1);
				method1651(Static5.aClass5_Sub1_1, Static24.aClass5_Sub1_4);
				Static98.method1741(Static24.aClass5_Sub1_4, Static5.aClass5_Sub1_1, Class15.aBoolean37);
				Static88.method1551(Static79.aClass5_Sub1_18, Static40.aClass5_Sub1_14, Static5.aClass5_Sub1_1);
				Static72.method1329(Static5.aClass5_Sub1_1, Static24.aClass5_Sub1_4);
				Static15.method340(Static5.aClass5_Sub1_1);
				Static84.method1483(Static5.aClass5_Sub1_1);
				Static83.method1471(Static74.aClass5_Sub1_16, Static26.aClass5_Sub1_5, Static24.aClass5_Sub1_4);
				Class60.aClass40_680 = Class2_Sub2_Sub13.aClass40_469;
				Class12.anInt1850 = 80;
				Class59.anInt2194 = 60;
			} else {
				Class60.aClass40_680 = Static72.method1334(new Class40[] { Class45.aClass40_616, Static48.method859(Static5.aClass5_Sub1_1.method87()), Class32.aClass40_430 });
				Class59.anInt2194 = 60;
			}
		} else if (Class12.anInt1850 == 80) {
			local17 = 0;
			if (Static12.aClass2_Sub2_Sub2_Sub4_2 == null) {
				Static12.aClass2_Sub2_Sub2_Sub4_2 = method1644(Class2_Sub2_Sub9.aClass40_307, Class34.aClass40_445, Static74.aClass5_Sub1_16);
			} else {
				local17++;
			}
			if (Static96.aClass2_Sub2_Sub2_Sub4_10 == null) {
				Static96.aClass2_Sub2_Sub2_Sub4_10 = method1644(Class2_Sub2_Sub12_Sub6.aClass40_647, Class34.aClass40_445, Static74.aClass5_Sub1_16);
			} else {
				local17++;
			}
			if (Static51.aClass2_Sub2_Sub2_Sub3Array15 == null) {
				Static51.aClass2_Sub2_Sub2_Sub3Array15 = Static4.method85(Static74.aClass5_Sub1_16, Class41.aClass40_520, Class34.aClass40_445);
			} else {
				local17++;
			}
			if (Static91.aClass2_Sub2_Sub2_Sub4Array2 == null) {
				Static91.aClass2_Sub2_Sub2_Sub4Array2 = Static34.method638(Static74.aClass5_Sub1_16, Class2_Sub2_Sub12_Sub1_Sub2.aClass40_663, Class34.aClass40_445);
			} else {
				local17++;
			}
			if (Static27.aClass2_Sub2_Sub2_Sub4Array4 == null) {
				Static27.aClass2_Sub2_Sub2_Sub4Array4 = Static34.method638(Static74.aClass5_Sub1_16, Class5.aClass40_26, Class34.aClass40_445);
			} else {
				local17++;
			}
			if (Static41.aClass2_Sub2_Sub2_Sub4Array6 == null) {
				Static41.aClass2_Sub2_Sub2_Sub4Array6 = Static34.method638(Static74.aClass5_Sub1_16, Class54.aClass40_607, Class34.aClass40_445);
			} else {
				local17++;
			}
			if (Static53.aClass2_Sub2_Sub2_Sub4Array8 == null) {
				Static53.aClass2_Sub2_Sub2_Sub4Array8 = Static34.method638(Static74.aClass5_Sub1_16, Class33.aClass40_433, Class34.aClass40_445);
			} else {
				local17++;
			}
			if (Static93.aClass2_Sub2_Sub2_Sub4Array10 == null) {
				Static93.aClass2_Sub2_Sub2_Sub4Array10 = Static34.method638(Static74.aClass5_Sub1_16, Class2_Sub12.aClass40_671, Class34.aClass40_445);
			} else {
				local17++;
			}
			if (Static40.aClass2_Sub2_Sub2_Sub4_7 == null) {
				Static40.aClass2_Sub2_Sub2_Sub4_7 = method1644(Class5.aClass40_25, Class34.aClass40_445, Static74.aClass5_Sub1_16);
			} else {
				local17++;
			}
			if (Static12.aClass2_Sub2_Sub2_Sub4Array3 == null) {
				Static12.aClass2_Sub2_Sub2_Sub4Array3 = Static34.method638(Static74.aClass5_Sub1_16, Applet_Sub1.aClass40_101, Class34.aClass40_445);
			} else {
				local17++;
			}
			if (Static49.aClass2_Sub2_Sub2_Sub4Array7 == null) {
				Static49.aClass2_Sub2_Sub2_Sub4Array7 = Static34.method638(Static74.aClass5_Sub1_16, Class2_Sub2_Sub11.aClass40_332, Class34.aClass40_445);
			} else {
				local17++;
			}
			if (Static28.aClass2_Sub2_Sub2_Sub4Array5 == null) {
				Static28.aClass2_Sub2_Sub2_Sub4Array5 = Static34.method638(Static74.aClass5_Sub1_16, Class64.aClass40_727, Class34.aClass40_445);
			} else {
				local17++;
			}
			if (Static85.aClass2_Sub2_Sub2_Sub3Array12 == null) {
				Static85.aClass2_Sub2_Sub2_Sub3Array12 = Static4.method85(Static74.aClass5_Sub1_16, Class2_Sub2_Sub12_Sub6.aClass40_643, Class34.aClass40_445);
			} else {
				local17++;
			}
			if (Static64.aClass2_Sub2_Sub2_Sub3Array8 == null) {
				Static64.aClass2_Sub2_Sub2_Sub3Array8 = Static4.method85(Static74.aClass5_Sub1_16, Class22.aClass40_222, Class34.aClass40_445);
			} else {
				local17++;
			}
			if (local17 < 14) {
				Class60.aClass40_680 = Static72.method1334(new Class40[] { Class12_Sub1.aClass40_541, Static48.method859(local17 * 100 / 14), Class32.aClass40_430 });
				Class59.anInt2194 = 70;
			} else {
				Static96.aClass2_Sub2_Sub2_Sub4_10.method1620();
				local54 = (int) (Math.random() * 21.0D) - 10;
				local62 = (int) (Math.random() * 21.0D) - 10;
				local66 = (int) (Math.random() * 41.0D) - 20;
				local72 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(1134) int local1134 = 0; local1134 < Static91.aClass2_Sub2_Sub2_Sub4Array2.length; local1134++) {
					Static91.aClass2_Sub2_Sub2_Sub4Array2[local1134].method1621(local54 + local66, local62 + local66, local66 + local72);
				}
				Static51.aClass2_Sub2_Sub2_Sub3Array15[0].method1321(local66 + local54, local62 + local66, local72 + local66);
				Class60.aClass40_680 = Class2_Sub2_Sub13.aClass40_465;
				Class12.anInt1850 = 85;
				Class59.anInt2194 = 70;
			}
		} else if (Class12.anInt1850 == 85) {
			local17 = Static17.method358(Static74.aClass5_Sub1_16);
			local54 = Static9.method228();
			if (local54 > local17) {
				Class60.aClass40_680 = Static72.method1334(new Class40[] { Class10.aClass40_68, Static48.method859(local17 * 100 / local54), Class32.aClass40_430 });
				Class59.anInt2194 = 80;
			} else {
				Class59.anInt2194 = 80;
				Class12.anInt1850 = 90;
				Class60.aClass40_680 = Class14.aClass40_114;
			}
		} else if (Class12.anInt1850 == 90) {
			if (Static33.aClass5_Sub1_6.method78()) {
				@Pc(1269) Class19 local1269 = new Class19(Static33.aClass5_Sub1_6, Static74.aClass5_Sub1_16, 20, 0.8D, Class1.aBoolean2 ? 64 : 128);
				Static6.method173(local1269);
				Static6.method168(0.8D);
				Class59.anInt2194 = 90;
				Class12.anInt1850 = 110;
				Class60.aClass40_680 = Class41.aClass40_513;
			} else {
				Class60.aClass40_680 = Static72.method1334(new Class40[] { Class44.aClass40_527, Static48.method859(Static33.aClass5_Sub1_6.method87()), Class32.aClass40_430 });
				Class59.anInt2194 = 90;
			}
		} else if (Class12.anInt1850 == 110) {
			Static41.aClass52_1 = new Class52();
			Static91.aClass7_2.method207(10, Static41.aClass52_1);
			Class59.anInt2194 = 94;
			Class12.anInt1850 = 120;
			Class60.aClass40_680 = Class2_Sub3.aClass40_737;
		} else if (Class12.anInt1850 == 120) {
			if (Static73.aClass5_Sub1_15.method73(Class34.aClass40_445, Class18_Sub1.aClass40_131)) {
				@Pc(1325) Class42 local1325 = new Class42(Static73.aClass5_Sub1_15.method69(Class18_Sub1.aClass40_131, Class34.aClass40_445));
				Static79.method1397(local1325);
				Class12.anInt1850 = 130;
				Class60.aClass40_680 = Class2_Sub2_Sub13.aClass40_470;
				Class59.anInt2194 = 96;
			} else {
				Class59.anInt2194 = 96;
				Class60.aClass40_680 = Class2_Sub2_Sub5.aClass40_180;
			}
		} else if (Class12.anInt1850 == 130) {
			if (Static26.aClass5_Sub1_5.method78()) {
				Class59.anInt2194 = 100;
				Class12.anInt1850 = 140;
				Class60.aClass40_680 = Class41.aClass40_517;
			} else {
				Class60.aClass40_680 = Static72.method1334(new Class40[] { Class45_Sub1.aClass40_619, Static48.method859(Static26.aClass5_Sub1_5.method87()), Class32.aClass40_430 });
				Class59.anInt2194 = 100;
			}
		} else if (Class12.anInt1850 == 140) {
			Static7.method187(10);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V", line = 701)
	public static void method1648(@OriginalArg(0) int arg0) {
		if (!Static99.method1665(arg0)) {
			return;
		}
		@Pc(26) Class2_Sub2_Sub13[] local26 = Static46.aClass2_Sub2_Sub13ArrayArray1[arg0];
		for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
			@Pc(34) Class2_Sub2_Sub13 local34 = local26[local28];
			if (local34 != null) {
				local34.anInt1593 = 0;
				local34.anInt1569 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILclient!ke;)V", line = 734)
	public static void method1649(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2_Sub12_Sub1 arg1) {
		Static96.method1667(arg0, arg1.anInt2275, arg1.anInt2284);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIII)I", line = 776)
	public static int method1650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(8) int local8 = arg4;
			arg4 = arg1;
			arg1 = local8;
		}
		@Pc(16) int local16 = arg3 & 0x3;
		if (local16 == 0) {
			return arg0;
		} else if (local16 == 1) {
			return arg2;
		} else if (local16 == 2) {
			return 8 - arg4 - arg0;
		} else {
			return 7 + 1 - arg2 - arg1;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!ud;BLclient!ud;)V", line = 808)
	private static void method1651(@OriginalArg(0) Class5 arg0, @OriginalArg(2) Class5 arg1) {
		aClass5_30 = arg1;
		Static32.aClass5_11 = arg0;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V", line = 832)
	public static void method1652() {
		Class62.aClass47_22 = null;
		aClass2_Sub2_Sub2_Sub2_5 = null;
		Class62.aClass40_714 = null;
		Class62.aClass40_715 = null;
		aClass2_Sub2_Sub2_Sub3_24 = null;
		aClass5_30 = null;
		anIntArray547 = null;
	}
}
