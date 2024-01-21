import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!p", name = "m", descriptor = "Lclient!b;")
	public static Class1_Sub2_Sub2_Sub1 aClass1_Sub2_Sub2_Sub1_9;

	@OriginalMember(owner = "client!p", name = "q", descriptor = "Lclient!ve;")
	public static Class57 aClass57_2;

	@OriginalMember(owner = "client!p", name = "r", descriptor = "I")
	public static int anInt2026;

	@OriginalMember(owner = "client!p", name = "s", descriptor = "Lclient!wa;")
	public static Class19 aClass19_1;

	@OriginalMember(owner = "client!p", name = "x", descriptor = "[Lclient!b;")
	public static Class1_Sub2_Sub2_Sub1[] aClass1_Sub2_Sub2_Sub1Array7;

	@OriginalMember(owner = "client!p", name = "z", descriptor = "Lclient!oc;")
	public static Class56 aClass56_61;

	@OriginalMember(owner = "client!p", name = "l", descriptor = "Lclient!qc;")
	public static Class66 aClass66_13 = new Class66(32);

	@OriginalMember(owner = "client!p", name = "t", descriptor = "I")
	public static int anInt2027 = 3;

	@OriginalMember(owner = "client!p", name = "u", descriptor = "Lclient!fc;")
	public static Class25 aClass25_958 = Static78.method1313("<col=40ff00>");

	@OriginalMember(owner = "client!p", name = "y", descriptor = "Z")
	public static boolean aBoolean98 = false;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)Z")
	public static boolean method1514(@OriginalArg(0) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
	public static void method1515() {
		Static123.anInt2884 = 0;
		@Pc(17) int local17 = Static46.anInt1190 + (Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2832 >> 7);
		@Pc(24) int local24 = (Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2827 >> 7) + Static47.anInt1211;
		if (local17 >= 3053 && local17 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static123.anInt2884 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static123.anInt2884 = 1;
		}
		if (Static123.anInt2884 == 1 && local17 >= 3139 && local17 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static123.anInt2884 = 0;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!v;BII)V")
	public static void method1516(@OriginalArg(0) Class1_Sub2_Sub3_Sub4_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12;
		@Pc(16) int local16;
		if ((arg2 & 0x40) != 0) {
			local12 = Static35.aClass1_Sub5_Sub1_1.method651();
			local16 = Static35.aClass1_Sub5_Sub1_1.method648();
			@Pc(20) int local20 = Static35.aClass1_Sub5_Sub1_1.method648();
			@Pc(23) int local23 = Static35.aClass1_Sub5_Sub1_1.anInt792;
			if (arg0.aClass25_1384 != null && arg0.aClass75_2 != null) {
				@Pc(31) boolean local31 = false;
				@Pc(36) long local36 = arg0.aClass25_1384.method770();
				if (local16 <= 1) {
					for (@Pc(41) int local41 = 0; local41 < Static49.anInt1230; local41++) {
						if (Static68.aLongArray3[local41] == local36) {
							local31 = true;
							break;
						}
					}
				}
				if (!local31 && Static123.anInt2884 == 0) {
					Static78.aClass1_Sub5_37.anInt792 = 0;
					Static35.aClass1_Sub5_Sub1_1.method655(Static78.aClass1_Sub5_37.aByteArray13, local20);
					Static78.aClass1_Sub5_37.anInt792 = 0;
					@Pc(88) Class25 local88 = Static72.method1188(Static99.method1652(Static78.aClass1_Sub5_37).method775());
					arg0.aClass25_1379 = local88.method773();
					arg0.anInt2823 = local12 & 0xFF;
					arg0.anInt2783 = 150;
					arg0.anInt2836 = local12 >> 8;
					if (local16 == 2 || local16 == 3) {
						Static25.method584(1, local88, Static116.method1859(new Class25[] { Static38.aClass25_448, arg0.aClass25_1384 }));
					} else if (local16 == 1) {
						Static25.method584(1, local88, Static116.method1859(new Class25[] { Static77.aClass25_810, arg0.aClass25_1384 }));
					} else {
						Static25.method584(2, local88, arg0.aClass25_1384);
					}
				}
			}
			Static35.aClass1_Sub5_Sub1_1.anInt792 = local23 + local20;
		}
		if ((arg2 & 0x20) != 0) {
			local12 = Static35.aClass1_Sub5_Sub1_1.method677();
			if (local12 == 65535) {
				local12 = -1;
			}
			local16 = Static35.aClass1_Sub5_Sub1_1.method630();
			Static24.method574(arg0, local12, local16);
		}
		if ((arg2 & 0x4) != 0) {
			arg0.anInt2811 = Static35.aClass1_Sub5_Sub1_1.method642();
			arg0.anInt2812 = Static35.aClass1_Sub5_Sub1_1.method677();
		}
		if ((arg2 & 0x2) != 0) {
			local12 = Static35.aClass1_Sub5_Sub1_1.method672();
			@Pc(233) byte[] local233 = new byte[local12];
			@Pc(238) Class1_Sub5 local238 = new Class1_Sub5(local233);
			Static35.aClass1_Sub5_Sub1_1.method655(local233, local12);
			Static21.aClass1_Sub5Array1[arg1] = local238;
			arg0.method1981(local238);
		}
		if ((arg2 & 0x400) != 0) {
			arg0.anInt2800 = Static35.aClass1_Sub5_Sub1_1.method672();
			arg0.anInt2789 = Static35.aClass1_Sub5_Sub1_1.method671();
			arg0.anInt2816 = Static35.aClass1_Sub5_Sub1_1.method648();
			arg0.anInt2828 = Static35.aClass1_Sub5_Sub1_1.method671();
			arg0.anInt2822 = Static35.aClass1_Sub5_Sub1_1.method642() + Static60.anInt1366;
			arg0.anInt2803 = Static35.aClass1_Sub5_Sub1_1.method670() + Static60.anInt1366;
			arg0.anInt2837 = Static35.aClass1_Sub5_Sub1_1.method671();
			arg0.anInt2839 = 1;
			arg0.anInt2806 = 0;
		}
		if ((arg2 & 0x10) != 0) {
			arg0.aClass25_1379 = Static35.aClass1_Sub5_Sub1_1.method654();
			if (arg0.aClass25_1379.method767(0) == 126) {
				arg0.aClass25_1379 = arg0.aClass25_1379.method794(1);
				Static25.method584(2, arg0.aClass25_1379, arg0.aClass25_1384);
			} else if (arg0 == Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1) {
				Static25.method584(2, arg0.aClass25_1379, arg0.aClass25_1384);
			}
			arg0.anInt2836 = 0;
			arg0.anInt2823 = 0;
			arg0.anInt2783 = 150;
		}
		if ((arg2 & 0x1) != 0) {
			arg0.anInt2818 = Static35.aClass1_Sub5_Sub1_1.method677();
			if (arg0.anInt2818 == 65535) {
				arg0.anInt2818 = -1;
			}
		}
		if ((arg2 & 0x8) != 0) {
			local12 = Static35.aClass1_Sub5_Sub1_1.method671();
			local16 = Static35.aClass1_Sub5_Sub1_1.method630();
			arg0.method1978(Static60.anInt1366, local16, local12);
			arg0.anInt2801 = Static60.anInt1366 + 300;
			arg0.anInt2786 = Static35.aClass1_Sub5_Sub1_1.method648();
			arg0.anInt2784 = Static35.aClass1_Sub5_Sub1_1.method630();
		}
		if ((arg2 & 0x200) != 0) {
			arg0.anInt2813 = Static35.aClass1_Sub5_Sub1_1.method677();
			local12 = Static35.aClass1_Sub5_Sub1_1.method661();
			if (arg0.anInt2813 == 65535) {
				arg0.anInt2813 = -1;
			}
			arg0.anInt2821 = local12 >> 16;
			arg0.anInt2805 = Static60.anInt1366 + (local12 & 0xFFFF);
			arg0.anInt2792 = 0;
			if (Static60.anInt1366 < arg0.anInt2805) {
				arg0.anInt2792 = -1;
			}
			arg0.anInt2787 = 0;
		}
		if ((arg2 & 0x100) == 0) {
			return;
		}
		local12 = Static35.aClass1_Sub5_Sub1_1.method671();
		local16 = Static35.aClass1_Sub5_Sub1_1.method630();
		arg0.method1978(Static60.anInt1366, local16, local12);
		arg0.anInt2801 = Static60.anInt1366 + 300;
		arg0.anInt2786 = Static35.aClass1_Sub5_Sub1_1.method630();
		arg0.anInt2784 = Static35.aClass1_Sub5_Sub1_1.method648();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public static void method1518() {
		aClass1_Sub2_Sub2_Sub1_9 = null;
		aClass1_Sub2_Sub2_Sub1Array7 = null;
		aClass57_2 = null;
		aClass25_958 = null;
		aClass66_13 = null;
		aClass56_61 = null;
		aClass19_1 = null;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method1519(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local10 = local15.aString2 + " | ";
			arg0 = local15.aThrowable1;
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			while (true) {
				@Pc(59) String local59 = local53.readLine();
				if (local59 == null) {
					return local10 + "| " + local56;
				}
				@Pc(65) int local65 = local59.indexOf(40);
				@Pc(72) int local72 = local59.indexOf(41, local65 + 1);
				if (local65 >= 0 && local72 >= 0) {
					@Pc(86) String local86 = local59.substring(local65 + 1, local72);
					@Pc(90) int local90 = local86.indexOf(".java:");
					if (local90 >= 0) {
						local86 = local86.substring(0, local90) + local86.substring(local90 + 5);
						local10 = local10 + local86 + ' ';
						continue;
					}
					local59 = local59.substring(0, local65);
				}
				local59 = local59.trim();
				local59 = local59.substring(local59.lastIndexOf(32) + 1);
				local59 = local59.substring(local59.lastIndexOf(9) + 1);
				local10 = local10 + local59 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V")
	public static void method1522() {
		if (!Static120.aBoolean128) {
			return;
		}
		Static57.aClass1_Sub2_Sub2_Sub1_13 = null;
		Static127.aClass1_Sub2_Sub2_Sub4Array10 = null;
		Static53.anIntArray430 = null;
		Static88.aClass7_14 = null;
		Static122.anIntArray497 = null;
		Static127.anIntArray499 = null;
		Static76.aClass1_Sub2_Sub2_Sub4_12 = null;
		Static74.aClass1_Sub2_Sub2_Sub4_9 = null;
		Static80.anIntArray323 = null;
		Static52.aClass1_Sub2_Sub2_Sub4Array2 = null;
		Static80.anIntArray322 = null;
		Static84.anIntArray335 = null;
		Static101.anIntArray411 = null;
		Static52.aClass1_Sub2_Sub2_Sub4Array3 = null;
		Static93.aClass1_Sub2_Sub2_Sub4Array7 = null;
		Static84.aClass1_Sub2_Sub2_Sub4Array6 = null;
		Static124.anIntArray494 = null;
		Static109.aClass1_Sub2_Sub2_Sub4_17 = null;
		Static98.aClass1_Sub2_Sub2_Sub1_16 = null;
		aClass1_Sub2_Sub2_Sub1Array7 = null;
		Static24.aClass1_Sub2_Sub2_Sub4_4 = null;
		Static71.method1147();
		Static27.method603(true);
		Static120.aBoolean128 = false;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
	public static void method1523() {
		@Pc(17) int local17;
		if (Static89.anInt493 == 0) {
			Static118.aClass4_1 = new Class4(4, 104, 104, Static7.anIntArrayArrayArray3);
			for (local17 = 0; local17 < 4; local17++) {
				Static102.aClass62Array1[local17] = new Class62(104, 104);
			}
			Static60.aClass1_Sub2_Sub2_Sub1_6 = new Class1_Sub2_Sub2_Sub1(512, 512);
			Static89.anInt493 = 20;
			Static109.anInt2512 = 5;
			Static81.aClass25_861 = Static70.aClass25_627;
			return;
		}
		@Pc(54) int local54;
		@Pc(64) int local64;
		@Pc(70) int local70;
		@Pc(74) int local74;
		if (Static89.anInt493 == 20) {
			@Pc(52) int[] local52 = new int[9];
			for (local54 = 0; local54 < 9; local54++) {
				local64 = local54 * 32 + 128 + 15;
				local70 = local64 * 3 + 600;
				local74 = Class1_Sub2_Sub2_Sub2.anIntArray189[local64];
				local52[local54] = local70 * local74 >> 16;
			}
			Static4.method63(local52);
			Static89.anInt493 = 30;
			Static109.anInt2512 = 10;
			Static81.aClass25_861 = Static34.aClass25_401;
		} else if (Static89.anInt493 == 30) {
			Static38.aClass56_Sub1_5 = Static122.method2023(0, true, false, true);
			Static67.aClass56_Sub1_11 = Static122.method2023(1, true, false, true);
			Static49.aClass56_Sub1_9 = Static122.method2023(2, false, true, true);
			Static71.aClass56_Sub1_12 = Static122.method2023(3, true, false, true);
			Static45.aClass56_Sub1_6 = Static122.method2023(4, true, false, true);
			Static18.aClass56_Sub1_2 = Static122.method2023(5, true, true, true);
			Static49.aClass56_Sub1_10 = Static122.method2023(6, true, true, false);
			Static96.aClass56_Sub1_19 = Static122.method2023(7, true, false, true);
			Static110.aClass56_Sub1_17 = Static122.method2023(8, true, false, true);
			Static45.aClass56_Sub1_7 = Static122.method2023(9, true, false, true);
			Static1.aClass56_Sub1_1 = Static122.method2023(10, true, false, true);
			Static120.aClass56_Sub1_20 = Static122.method2023(11, true, false, true);
			Static25.aClass56_Sub1_4 = Static122.method2023(12, true, false, true);
			Static111.aClass56_Sub1_18 = Static122.method2023(13, false, true, true);
			Static25.aClass56_Sub1_3 = Static122.method2023(14, true, false, false);
			Static48.aClass56_Sub1_8 = Static122.method2023(15, true, false, true);
			Static89.anInt493 = 40;
			Static109.anInt2512 = 20;
			Static81.aClass25_861 = Static25.aClass25_315;
		} else if (Static89.anInt493 == 40) {
			local17 = Static38.aClass56_Sub1_5.method1296() * 4 / 100;
			local17 += Static67.aClass56_Sub1_11.method1296() * 4 / 100;
			local17 += Static49.aClass56_Sub1_9.method1296() * 2 / 100;
			local17 += Static71.aClass56_Sub1_12.method1296() * 2 / 100;
			local17 += Static45.aClass56_Sub1_6.method1296() * 6 / 100;
			local17 += Static18.aClass56_Sub1_2.method1296() * 4 / 100;
			local17 += Static49.aClass56_Sub1_10.method1296() * 2 / 100;
			local17 += Static96.aClass56_Sub1_19.method1296() * 60 / 100;
			local17 += Static110.aClass56_Sub1_17.method1296() * 2 / 100;
			local17 += Static45.aClass56_Sub1_7.method1296() * 2 / 100;
			local17 += Static1.aClass56_Sub1_1.method1296() * 2 / 100;
			local17 += Static120.aClass56_Sub1_20.method1296() * 2 / 100;
			local17 += Static25.aClass56_Sub1_4.method1296() * 2 / 100;
			local17 += Static111.aClass56_Sub1_18.method1296() * 2 / 100;
			local17 += Static25.aClass56_Sub1_3.method1296() * 2 / 100;
			local17 += Static48.aClass56_Sub1_8.method1296() * 2 / 100;
			if (local17 == 100) {
				Static109.anInt2512 = 30;
				Static89.anInt493 = 45;
				Static81.aClass25_861 = Static78.aClass25_825;
			} else {
				if (local17 != 0) {
					Static81.aClass25_861 = Static116.method1859(new Class25[] { Static22.aClass25_347, Static74.method1214(local17), Static33.aClass25_389 });
				}
				Static109.anInt2512 = 30;
			}
		} else if (Static89.anInt493 == 45) {
			Static108.method1741(!Static63.aBoolean55);
			@Pc(450) Class1_Sub3_Sub1 local450 = new Class1_Sub3_Sub1();
			local450.method321();
			Static18.aClass57_1 = Static105.method1688(Static71.aClass74_2, 0, 22050, Static119.aCanvas1);
			Static18.aClass57_1.method2003(local450);
			Static52.method1012(local450, Static25.aClass56_Sub1_3, Static45.aClass56_Sub1_6, Static48.aClass56_Sub1_8);
			aClass57_2 = Static105.method1688(Static71.aClass74_2, 1, 2048, Static119.aCanvas1);
			Static33.aClass1_Sub3_Sub2_1 = new Class1_Sub3_Sub2();
			aClass57_2.method2003(Static33.aClass1_Sub3_Sub2_1);
			Static55.aClass58_1 = new Class58(22050, Static81.anInt1802);
			Static89.anInt493 = 50;
			Static109.anInt2512 = 35;
			Static81.aClass25_861 = Static109.aClass25_1204;
		} else if (Static89.anInt493 == 50) {
			local17 = 0;
			if (Static46.aClass1_Sub2_Sub2_Sub3_2 == null) {
				Static46.aClass1_Sub2_Sub2_Sub3_2 = Static85.method1415(Static110.aClass56_Sub1_17, Static92.aClass25_985, Static89.aClass25_237);
			} else {
				local17++;
			}
			if (Static42.aClass1_Sub2_Sub2_Sub3_1 == null) {
				Static42.aClass1_Sub2_Sub2_Sub3_1 = Static85.method1415(Static110.aClass56_Sub1_17, Static92.aClass25_985, Static88.aClass25_948);
			} else {
				local17++;
			}
			if (Static83.aClass1_Sub2_Sub2_Sub3_3 == null) {
				Static83.aClass1_Sub2_Sub2_Sub3_3 = Static85.method1415(Static110.aClass56_Sub1_17, Static92.aClass25_985, Static96.aClass25_1374);
			} else {
				local17++;
			}
			if (local17 < 3) {
				Static81.aClass25_861 = Static116.method1859(new Class25[] { Static87.aClass25_802, Static74.method1214(local17 * 100 / 3), Static33.aClass25_389 });
				Static109.anInt2512 = 40;
			} else {
				Static89.anInt493 = 60;
				Static81.aClass25_861 = Static25.aClass25_317;
				Static109.anInt2512 = 40;
			}
		} else if (Static89.anInt493 == 60) {
			local17 = Static34.method751(Static1.aClass56_Sub1_1, Static110.aClass56_Sub1_17);
			local54 = Static35.method760();
			if (local54 > local17) {
				Static81.aClass25_861 = Static116.method1859(new Class25[] { Static120.aClass25_1381, Static74.method1214(local17 * 100 / local54), Static33.aClass25_389 });
				Static109.anInt2512 = 50;
			} else {
				Static81.aClass25_861 = Static94.aClass25_1027;
				Static109.anInt2512 = 50;
				Static99.method1645(5);
				Static89.anInt493 = 70;
			}
		} else if (Static89.anInt493 == 70) {
			if (Static49.aClass56_Sub1_9.method1277()) {
				Static58.method1053(Static49.aClass56_Sub1_9);
				Static107.method1731(Static49.aClass56_Sub1_9);
				Static42.method937(Static49.aClass56_Sub1_9, Static96.aClass56_Sub1_19);
				Static122.method2022(Static63.aBoolean55, Static96.aClass56_Sub1_19, Static49.aClass56_Sub1_9);
				Static76.method1238(Static96.aClass56_Sub1_19, Static49.aClass56_Sub1_9);
				Static102.method1684(Static49.aClass56_Sub1_9, Static96.aClass56_Sub1_19, Static23.aBoolean21, Static46.aClass1_Sub2_Sub2_Sub3_2);
				Static61.method1086(Static49.aClass56_Sub1_9, Static67.aClass56_Sub1_11, Static38.aClass56_Sub1_5);
				Static78.method1310(Static96.aClass56_Sub1_19, Static49.aClass56_Sub1_9);
				Static47.method973(Static49.aClass56_Sub1_9);
				Static58.method1052(Static49.aClass56_Sub1_9);
				Static33.method737(Static110.aClass56_Sub1_17, Static96.aClass56_Sub1_19, Static71.aClass56_Sub1_12);
				Static83.method1401(Static49.aClass56_Sub1_9);
				Static78.method1311(Static49.aClass56_Sub1_9);
				Static81.aClass25_861 = Static1.aClass25_19;
				Static89.anInt493 = 80;
				Static109.anInt2512 = 60;
			} else {
				Static81.aClass25_861 = Static116.method1859(new Class25[] { Static59.aClass25_591, Static74.method1214(Static49.aClass56_Sub1_9.method1299()), Static33.aClass25_389 });
				Static109.anInt2512 = 60;
			}
		} else if (Static89.anInt493 == 80) {
			local17 = 0;
			if (Static84.aClass1_Sub2_Sub2_Sub1_8 == null) {
				Static84.aClass1_Sub2_Sub2_Sub1_8 = Static47.method974(Static110.aClass56_Sub1_17, Static82.aClass25_872, Static92.aClass25_985);
			} else {
				local17++;
			}
			if (Static47.aClass1_Sub2_Sub2_Sub1_4 == null) {
				Static47.aClass1_Sub2_Sub2_Sub1_4 = Static47.method974(Static110.aClass56_Sub1_17, Static122.aClass25_1410, Static92.aClass25_985);
			} else {
				local17++;
			}
			if (Static104.aClass1_Sub2_Sub2_Sub4Array9 == null) {
				Static104.aClass1_Sub2_Sub2_Sub4Array9 = Static122.method2021(Static110.aClass56_Sub1_17, Static12.aClass25_189, Static92.aClass25_985);
			} else {
				local17++;
			}
			if (Static21.aClass1_Sub2_Sub2_Sub1Array2 == null) {
				Static21.aClass1_Sub2_Sub2_Sub1Array2 = Static88.method1453(Static110.aClass56_Sub1_17, Static92.aClass25_985, Static57.aClass25_1182);
			} else {
				local17++;
			}
			if (Static97.aClass1_Sub2_Sub2_Sub1Array8 == null) {
				Static97.aClass1_Sub2_Sub2_Sub1Array8 = Static88.method1453(Static110.aClass56_Sub1_17, Static92.aClass25_985, Static16.aClass25_227);
			} else {
				local17++;
			}
			if (Static62.aClass1_Sub2_Sub2_Sub1Array6 == null) {
				Static62.aClass1_Sub2_Sub2_Sub1Array6 = Static88.method1453(Static110.aClass56_Sub1_17, Static92.aClass25_985, Static42.aClass25_472);
			} else {
				local17++;
			}
			if (Static42.aClass1_Sub2_Sub2_Sub1Array4 == null) {
				Static42.aClass1_Sub2_Sub2_Sub1Array4 = Static88.method1453(Static110.aClass56_Sub1_17, Static92.aClass25_985, Static115.aClass25_1296);
			} else {
				local17++;
			}
			if (Static118.aClass1_Sub2_Sub2_Sub1Array9 == null) {
				Static118.aClass1_Sub2_Sub2_Sub1Array9 = Static88.method1453(Static110.aClass56_Sub1_17, Static92.aClass25_985, Static49.aClass25_511);
			} else {
				local17++;
			}
			if (aClass1_Sub2_Sub2_Sub1_9 == null) {
				aClass1_Sub2_Sub2_Sub1_9 = Static47.method974(Static110.aClass56_Sub1_17, Static55.aClass25_560, Static92.aClass25_985);
			} else {
				local17++;
			}
			if (Static123.aClass1_Sub2_Sub2_Sub1Array10 == null) {
				Static123.aClass1_Sub2_Sub2_Sub1Array10 = Static88.method1453(Static110.aClass56_Sub1_17, Static92.aClass25_985, Static84.aClass25_913);
			} else {
				local17++;
			}
			if (Static60.aClass1_Sub2_Sub2_Sub1Array5 == null) {
				Static60.aClass1_Sub2_Sub2_Sub1Array5 = Static88.method1453(Static110.aClass56_Sub1_17, Static92.aClass25_985, Static13.aClass25_200);
			} else {
				local17++;
			}
			if (Static30.aClass1_Sub2_Sub2_Sub1Array3 == null) {
				Static30.aClass1_Sub2_Sub2_Sub1Array3 = Static88.method1453(Static110.aClass56_Sub1_17, Static92.aClass25_985, Static64.aClass25_666);
			} else {
				local17++;
			}
			if (Static35.aClass1_Sub2_Sub2_Sub4Array1 == null) {
				Static35.aClass1_Sub2_Sub2_Sub4Array1 = Static122.method2021(Static110.aClass56_Sub1_17, Static119.aClass25_1341, Static92.aClass25_985);
			} else {
				local17++;
			}
			if (Static80.aClass1_Sub2_Sub2_Sub4Array5 == null) {
				Static80.aClass1_Sub2_Sub2_Sub4Array5 = Static122.method2021(Static110.aClass56_Sub1_17, Static104.aClass25_1132, Static92.aClass25_985);
			} else {
				local17++;
			}
			if (local17 < 14) {
				Static81.aClass25_861 = Static116.method1859(new Class25[] { Static11.aClass25_150, Static74.method1214(local17 * 100 / 14), Static33.aClass25_389 });
				Static109.anInt2512 = 70;
			} else {
				Static47.aClass1_Sub2_Sub2_Sub1_4.method209();
				local54 = (int) (Math.random() * 21.0D) - 10;
				local64 = (int) (Math.random() * 21.0D) - 10;
				local70 = (int) (Math.random() * 21.0D) - 10;
				local74 = (int) (Math.random() * 41.0D) - 20;
				for (@Pc(956) int local956 = 0; local956 < Static21.aClass1_Sub2_Sub2_Sub1Array2.length; local956++) {
					Static21.aClass1_Sub2_Sub2_Sub1Array2[local956].method202(local74 + local54, local64 + local74, local70 + local74);
				}
				Static104.aClass1_Sub2_Sub2_Sub4Array9[0].method1949(local74 + local54, local74 + local64, local74 + local70);
				Static81.aClass25_861 = Static65.aClass25_673;
				Static109.anInt2512 = 70;
				Static89.anInt493 = 85;
			}
		} else if (Static89.anInt493 == 85) {
			local17 = Static35.method774(Static110.aClass56_Sub1_17);
			local54 = Static96.method1975();
			if (local17 < local54) {
				Static81.aClass25_861 = Static116.method1859(new Class25[] { Static59.aClass25_592, Static74.method1214(local17 * 100 / local54), Static33.aClass25_389 });
				Static109.anInt2512 = 80;
			} else {
				Static81.aClass25_861 = Static10.aClass25_140;
				Static89.anInt493 = 90;
				Static109.anInt2512 = 80;
			}
		} else if (Static89.anInt493 == 90) {
			if (Static45.aClass56_Sub1_7.method1277()) {
				@Pc(1097) Class54 local1097 = new Class54(Static45.aClass56_Sub1_7, Static110.aClass56_Sub1_17, 20, 0.8D, Static63.aBoolean55 ? 64 : 128);
				Static36.method835(local1097);
				Static36.method836(0.8D);
				Static109.anInt2512 = 90;
				Static89.anInt493 = 110;
				Static81.aClass25_861 = Static126.aClass25_1415;
			} else {
				Static81.aClass25_861 = Static116.method1859(new Class25[] { Static84.aClass25_915, Static74.method1214(Static45.aClass56_Sub1_7.method1299()), Static33.aClass25_389 });
				Static109.anInt2512 = 90;
			}
		} else if (Static89.anInt493 == 110) {
			Static126.aClass22_1 = new Class22();
			Static71.aClass74_2.method1821(10, Static126.aClass22_1);
			Static81.aClass25_861 = Static3.aClass25_36;
			Static89.anInt493 = 120;
			Static109.anInt2512 = 94;
		} else if (Static89.anInt493 == 120) {
			if (Static1.aClass56_Sub1_1.method1273(Static94.aClass25_1029, Static92.aClass25_985)) {
				@Pc(1164) Class76 local1164 = new Class76(Static1.aClass56_Sub1_1.method1288(Static94.aClass25_1029, Static92.aClass25_985));
				Static26.method592(local1164);
				Static109.anInt2512 = 96;
				Static81.aClass25_861 = Static47.aClass25_502;
				Static89.anInt493 = 130;
			} else {
				Static81.aClass25_861 = Static116.method1859(new Class25[] { Static84.aClass25_920, Static99.aClass25_1092 });
				Static109.anInt2512 = 96;
			}
		} else if (Static89.anInt493 == 130) {
			if (!Static71.aClass56_Sub1_12.method1277()) {
				Static81.aClass25_861 = Static116.method1859(new Class25[] { Static58.aClass25_577, Static74.method1214(Static71.aClass56_Sub1_12.method1299() * 4 / 5), Static33.aClass25_389 });
				Static109.anInt2512 = 100;
			} else if (!Static25.aClass56_Sub1_4.method1277()) {
				Static81.aClass25_861 = Static116.method1859(new Class25[] { Static58.aClass25_577, Static74.method1214(Static25.aClass56_Sub1_4.method1299() / 6 + 80), Static33.aClass25_389 });
				Static109.anInt2512 = 100;
			} else if (Static111.aClass56_Sub1_18.method1277()) {
				Static109.anInt2512 = 100;
				Static81.aClass25_861 = Static105.aClass25_1145;
				Static89.anInt493 = 140;
			} else {
				Static81.aClass25_861 = Static116.method1859(new Class25[] { Static58.aClass25_577, Static74.method1214(Static111.aClass56_Sub1_18.method1299() / 20 + 96), Static33.aClass25_389 });
				Static109.anInt2512 = 100;
			}
		} else if (Static89.anInt493 == 140) {
			Static99.method1645(10);
		}
	}
}
