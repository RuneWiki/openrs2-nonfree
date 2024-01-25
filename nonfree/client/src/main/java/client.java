import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 4) {
				Static124.method2398("argument count");
			}
			Static198.anInt4638 = Integer.parseInt(arg0[0]);
			Static260.anInt5453 = 2;
			if (arg0[1].equals("live")) {
				Static63.anInt1130 = 0;
			} else if (arg0[1].equals("rc")) {
				Static63.anInt1130 = 1;
			} else if (arg0[1].equals("wip")) {
				Static63.anInt1130 = 2;
			} else {
				Static124.method2398("modewhat");
			}
			Static239.anInt2803 = Static247.method4394(arg0[2]);
			if (Static239.anInt2803 == -1) {
				if (arg0[2].equals("english")) {
					Static239.anInt2803 = 0;
				} else if (arg0[2].equals("german")) {
					Static239.anInt2803 = 1;
				} else {
					Static124.method2398("language");
				}
			}
			Static334.aBoolean580 = false;
			Static327.aBoolean566 = false;
			if (arg0[3].equals("game0")) {
				Static13.aClass172_1 = Static30.aClass172_2;
			} else if (arg0[3].equals("game1")) {
				Static13.aClass172_1 = Static150.aClass172_3;
			} else {
				Static124.method2398("game");
			}
			Static50.aBoolean85 = true;
			Static328.aBoolean597 = true;
			Static206.anInt4520 = 0;
			Static114.anInt2412 = Static13.aClass172_1.anInt5669;
			Static366.anInt4512 = 0;
			Static71.aString12 = "";
			@Pc(125) client local125 = new client();
			Static2.aClient1 = local125;
			local125.method858(Static63.anInt1130 + 32, Static13.aClass172_1.aString55);
			Static291.aFrame4.setLocation(40, 40);
		} catch (@Pc(146) Exception local146) {
			Static40.method506(null, local146);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method876() {
		@Pc(9) int local9;
		if (!Static353.aBoolean525) {
			for (local9 = 0; local9 < Static304.anInt6075; local9++) {
				if (Static255.aClass50Array1[local9].method1165() == 's' || Static255.aClass50Array1[local9].method1165() == 'S') {
					Static353.aBoolean525 = true;
					break;
				}
			}
		}
		@Pc(48) int local48;
		if (Static249.anInt5212 == 0) {
			@Pc(39) Runtime local39 = Runtime.getRuntime();
			local48 = (int) ((local39.totalMemory() - local39.freeMemory()) / 1024L);
			@Pc(51) long local51 = Static22.method285();
			if (Static302.aLong188 == 0L) {
				Static302.aLong188 = local51;
			}
			if (local48 > 16384 && local51 - Static302.aLong188 < 5000L) {
				if (local51 - Static103.aLong114 > 1000L) {
					System.gc();
					Static103.aLong114 = local51;
				}
				Static319.aString66 = Static347.aClass140_158.method4155(Static239.anInt2803);
				Static286.anInt5754 = 5;
			} else {
				Static319.aString66 = Static102.aClass140_53.method4155(Static239.anInt2803);
				Static249.anInt5212 = 10;
				Static286.anInt5754 = 5;
			}
		} else if (Static249.anInt5212 == 10) {
			for (local9 = 0; local9 < 4; local9++) {
				Static182.aClass61Array2[local9] = Static79.method1616(Static12.anInt213, Static66.anInt1177);
			}
			Static319.aString66 = Static24.aClass140_13.method4155(Static239.anInt2803);
			Static249.anInt5212 = 20;
			Static286.anInt5754 = 10;
		} else if (Static249.anInt5212 == 20) {
			if (Static60.aClass220_1 == null) {
				Static60.aClass220_1 = new Class220(Static57.aClass79_1, Static51.aClass152_1);
			}
			if (Static60.aClass220_1.method5733()) {
				Static296.aClass104_177 = Static279.method3547(true, 0, false);
				Static327.aClass104_166 = Static279.method3547(true, 1, false);
				Static304.aClass104_159 = Static279.method3547(true, 2, false);
				Static224.aClass104_181 = Static279.method3547(true, 3, false);
				Static80.aClass104_54 = Static279.method3547(true, 4, false);
				Static63.aClass104_43 = Static279.method3547(true, 5, true);
				Static284.aClass104_149 = Static279.method3547(false, 6, true);
				Static302.aClass104_156 = Static279.method3547(true, 7, false);
				Static338.aClass104_184 = Static279.method3547(true, 8, false);
				Static156.aClass104_94 = Static279.method3547(true, 9, false);
				Static55.aClass104_40 = Static279.method3547(true, 10, false);
				Static207.aClass104_115 = Static279.method3547(true, 11, false);
				Static151.aClass104_90 = Static279.method3547(true, 12, false);
				Static283.aClass104_148 = Static279.method3547(true, 13, false);
				Static28.aClass104_22 = Static279.method3547(false, 14, false);
				Static14.aClass104_10 = Static279.method3547(true, 15, false);
				Static67.aClass104_109 = Static279.method3547(true, 16, false);
				Static304.aClass104_160 = Static279.method3547(true, 17, false);
				Static278.aClass104_146 = Static279.method3547(true, 18, false);
				Static36.aClass104_26 = Static279.method3547(true, 19, false);
				Static213.aClass104_119 = Static279.method3547(true, 20, false);
				Static24.aClass104_33 = Static279.method3547(true, 21, false);
				Static299.aClass104_153 = Static279.method3547(true, 22, false);
				Static92.aClass104_63 = Static279.method3547(true, 23, true);
				Static19.aClass104_14 = Static279.method3547(true, 24, false);
				Static309.aClass104_162 = Static279.method3547(true, 25, false);
				Static159.aClass104_78 = Static279.method3547(true, 26, true);
				Static358.aClass104_193 = Static279.method3547(true, 27, false);
				Static251.aClass104_135 = Static279.method3547(true, 28, true);
				Static319.aString66 = Static287.aClass140_137.method4155(Static239.anInt2803);
				Static286.anInt5754 = 15;
				Static249.anInt5212 = 30;
			} else {
				Static319.aString66 = Static237.aClass140_120.method4155(Static239.anInt2803);
				Static286.anInt5754 = 12;
			}
		} else if (Static249.anInt5212 == 30) {
			local9 = 0;
			for (local48 = 0; local48 < 29; local48++) {
				local9 += Static219.aClass138_Sub1Array1[local48].method4079() * Static126.anIntArray220[local48] / 100;
			}
			if (local9 == 100) {
				Static319.aString66 = Static361.aClass140_163.method4155(Static239.anInt2803);
				Static286.anInt5754 = 20;
				Static278.method4774(Static338.aClass104_184);
				Static272.method4031(Static338.aClass104_184);
				Static249.anInt5212 = 40;
			} else {
				if (local9 != 0) {
					Static319.aString66 = Static350.aClass140_160.method4155(Static239.anInt2803) + local9 + "%";
				}
				Static286.anInt5754 = 20;
			}
		} else if (Static249.anInt5212 == 40) {
			if (Static251.aClass104_135.method2761()) {
				this.method882(Static251.aClass104_135.method2758(1));
				Static319.aString66 = Static314.aClass140_146.method4155(Static239.anInt2803);
				Static249.anInt5212 = 50;
				Static286.anInt5754 = 25;
			} else {
				Static319.aString66 = Static98.aClass140_49.method4155(Static239.anInt2803) + Static251.aClass104_135.method2747() + "%";
				Static286.anInt5754 = 25;
			}
		} else if (Static249.anInt5212 == 50) {
			Static133.method2576(Static145.aBoolean285);
			Static159.aClass2_Sub11_Sub1_4 = new Class2_Sub11_Sub1();
			Static159.aClass2_Sub11_Sub1_4.method1397();
			Static288.aClass88_2 = Static77.method1590(0, Static95.aCanvas3, Static62.aClass179_2, 22050);
			Static288.aClass88_2.method2714(Static159.aClass2_Sub11_Sub1_4);
			Static348.method2463(Static28.aClass104_22, Static80.aClass104_54, Static14.aClass104_10, Static159.aClass2_Sub11_Sub1_4);
			Static77.aClass88_1 = Static77.method1590(1, Static95.aCanvas3, Static62.aClass179_2, 2048);
			Static31.aClass2_Sub11_Sub3_1 = new Class2_Sub11_Sub3();
			Static77.aClass88_1.method2714(Static31.aClass2_Sub11_Sub3_1);
			Static179.aClass83_1 = new Class83(22050, Static36.anInt551);
			Static134.anInt2868 = Static284.aClass104_149.method2769("scape main");
			Static319.aString66 = Static100.aClass140_52.method4155(Static239.anInt2803);
			Static249.anInt5212 = 60;
			Static286.anInt5754 = 30;
		} else if (Static249.anInt5212 == 60) {
			local9 = Static55.method1204(Static338.aClass104_184, Static283.aClass104_148);
			local48 = Static315.method5229();
			if (local9 < local48) {
				Static319.aString66 = Static112.aClass140_60.method4155(Static239.anInt2803) + local9 * 100 / local48 + "%";
				Static286.anInt5754 = 35;
			} else {
				Static319.aString66 = Static196.aClass140_98.method4155(Static239.anInt2803);
				Static249.anInt5212 = 70;
				Static286.anInt5754 = 35;
			}
		} else if (Static249.anInt5212 == 70) {
			local9 = Static17.method252(Static338.aClass104_184);
			local48 = Static343.method3356();
			if (local9 < local48) {
				Static319.aString66 = Static106.aClass140_56.method4155(Static239.anInt2803) + local9 * 100 / local48 + "%";
				Static286.anInt5754 = 40;
			} else {
				Static319.aString66 = Static366.aClass140_104.method4155(Static239.anInt2803);
				Static249.anInt5212 = 80;
				Static286.anInt5754 = 40;
			}
		} else if (Static249.anInt5212 == 80) {
			if (Static159.aClass104_78.method2761()) {
				Static358.anInterface3_7 = new Class9(Static159.aClass104_78, Static156.aClass104_94, Static338.aClass104_184);
				Static319.aString66 = Static274.aClass140_133.method4155(Static239.anInt2803);
				Static249.anInt5212 = 90;
				Static286.anInt5754 = 45;
			} else {
				Static319.aString66 = Static227.aClass140_118.method4155(Static239.anInt2803) + Static159.aClass104_78.method2747() + "%";
				Static286.anInt5754 = 45;
			}
		} else if (Static249.anInt5212 == 90) {
			Static319.aString66 = Static146.aClass140_73.method4155(Static239.anInt2803);
			Static249.anInt5212 = 95;
			Static286.anInt5754 = 50;
		} else if (Static249.anInt5212 == 95) {
			if (Static353.aBoolean525) {
				Static18.anInt304 = 0;
				Static313.anInt6146 = 1;
				Static207.anInt4534 = 0;
				Static248.anInt5206 = 0;
				Static181.anInt4031 = 0;
			}
			Static353.aBoolean525 = true;
			Static167.method3337(Static62.aClass179_2);
			Static59.method1244(false, Static18.anInt304);
			Static319.aString66 = Static207.aClass140_105.method4155(Static239.anInt2803);
			Static286.anInt5754 = 55;
			Static249.anInt5212 = 100;
		} else if (Static249.anInt5212 == 100) {
			Static288.method4853(Static283.aClass104_148, Static338.aClass104_184, Static51.aClass37_1);
			Static319.aString66 = Static234.aClass140_119.method4155(Static239.anInt2803);
			Static286.anInt5754 = 60;
			Static224.method5495(5);
			Static249.anInt5212 = 110;
		} else if (Static249.anInt5212 == 110) {
			Static304.aClass104_159.method2761();
			local9 = Static304.aClass104_159.method2747();
			Static67.aClass104_109.method2761();
			local9 += Static67.aClass104_109.method2747();
			Static304.aClass104_160.method2761();
			local9 += Static304.aClass104_160.method2747();
			Static278.aClass104_146.method2761();
			local9 += Static278.aClass104_146.method2747();
			Static36.aClass104_26.method2761();
			local9 += Static36.aClass104_26.method2747();
			Static213.aClass104_119.method2761();
			local9 += Static213.aClass104_119.method2747();
			Static24.aClass104_33.method2761();
			local9 += Static24.aClass104_33.method2747();
			Static299.aClass104_153.method2761();
			local9 += Static299.aClass104_153.method2747();
			Static19.aClass104_14.method2761();
			local9 += Static19.aClass104_14.method2747();
			Static309.aClass104_162.method2761();
			local9 += Static309.aClass104_162.method2747();
			Static358.aClass104_193.method2761();
			local9 += Static358.aClass104_193.method2747();
			if (local9 < 1100) {
				Static319.aString66 = Static344.aClass140_157.method4155(Static239.anInt2803) + local9 / 11 + "%";
				Static286.anInt5754 = 65;
			} else {
				Static65.method2537(Static304.aClass104_159);
				Static120.method50(Static304.aClass104_159);
				Static74.method3143(Static304.aClass104_159);
				Static21.method2846(Static304.aClass104_159, Static302.aClass104_156);
				Static235.method4286(Static239.anInt2803, Static67.aClass104_109, Static302.aClass104_156);
				Static353.method5007(Static302.aClass104_156, Static239.anInt2803, Static278.aClass104_146);
				Static310.aClass184_2 = new Class184(Static13.aClass172_1, Static239.anInt2803, true, Static36.aClass104_26, Static302.aClass104_156);
				Static279.method3542(Static304.aClass104_159);
				Static68.method1362(Static213.aClass104_119, Static296.aClass104_177, Static327.aClass104_166);
				Static223.method4180(Static304.aClass104_159);
				Static326.method5347(Static302.aClass104_156, Static24.aClass104_33);
				Static135.method2629(Static299.aClass104_153);
				Static317.method5262(Static304.aClass104_159);
				Static19.method275(Static224.aClass104_181, Static283.aClass104_148, Static338.aClass104_184, Static302.aClass104_156);
				Static209.method5775(Static304.aClass104_159);
				Static215.method4072(Static304.aClass104_160);
				Static273.method4727(Static309.aClass104_162, new Class43(), Static19.aClass104_14);
				Static362.method5789(Static19.aClass104_14, Static309.aClass104_162);
				Static177.method3425(Static304.aClass104_159);
				Static221.method4176(Static304.aClass104_159);
				Static337.method5506(Static304.aClass104_159);
				Static28.method368(Static338.aClass104_184, Static304.aClass104_159);
				Static11.method171(Static304.aClass104_159, Static338.aClass104_184);
				Static70.method1406(Static304.aClass104_159);
				Static242.method4784(Static338.aClass104_184, Static304.aClass104_159);
				Static300.method5054(Static304.aClass104_159);
				Static231.method4257(Static304.aClass104_159);
				Static319.aString66 = Static159.aClass140_65.method4155(Static239.anInt2803);
				Static286.anInt5754 = 65;
				Static49.method941();
				Static14.method242();
				Static249.anInt5212 = 120;
			}
		} else if (Static249.anInt5212 == 120) {
			local9 = Static226.method4201(Static338.aClass104_184);
			local48 = Static112.method2174();
			if (local48 > local9) {
				Static319.aString66 = Static335.aClass140_151.method4155(Static239.anInt2803) + local9 * 100 / local48 + "%";
				Static286.anInt5754 = 70;
			} else {
				Static31.method427(Static51.aClass37_1, Static338.aClass104_184);
				Static328.method5596(Static270.aClass46Array42);
				Static319.aString66 = Static87.aClass140_38.method4155(Static239.anInt2803);
				Static286.anInt5754 = 70;
				Static249.anInt5212 = 130;
			}
		} else if (Static249.anInt5212 == 130) {
			Static319.aString66 = Static178.aClass140_164.method4155(Static239.anInt2803);
			Static286.anInt5754 = 75;
			Static249.anInt5212 = 140;
		} else if (Static249.anInt5212 == 140) {
			if (Static55.aClass104_40.method2762("huffman", "")) {
				@Pc(1133) Class218 local1133 = new Class218(Static55.aClass104_40.method2760("huffman", ""));
				Static312.method5210(local1133);
				Static319.aString66 = Static112.aClass140_61.method4155(Static239.anInt2803);
				Static249.anInt5212 = 150;
				Static286.anInt5754 = 80;
			} else {
				Static319.aString66 = Static126.aClass140_63.method4155(Static239.anInt2803) + "0%";
				Static286.anInt5754 = 80;
			}
		} else if (Static249.anInt5212 == 150) {
			if (!Static224.aClass104_181.method2761()) {
				Static319.aString66 = Static51.aClass140_19.method4155(Static239.anInt2803) + Static224.aClass104_181.method2747() * 3 / 4 + "%";
				Static286.anInt5754 = 85;
			} else if (!Static151.aClass104_90.method2761()) {
				Static319.aString66 = Static51.aClass140_19.method4155(Static239.anInt2803) + (Static151.aClass104_90.method2747() / 10 + 75) + "%";
				Static286.anInt5754 = 85;
			} else if (!Static283.aClass104_148.method2761()) {
				Static319.aString66 = Static51.aClass140_19.method4155(Static239.anInt2803) + (Static283.aClass104_148.method2747() / 20 + 85) + "%";
				Static286.anInt5754 = 85;
			} else if (Static92.aClass104_63.method2753("details")) {
				Static202.method4218(Static92.aClass104_63);
				Static323.method5336(Static358.aClass104_193);
				Static360.method5736(Static358.anInterface3_7, Static302.aClass104_156);
				Static319.aString66 = Static150.aClass140_83.method4155(Static239.anInt2803);
				Static249.anInt5212 = 160;
				Static286.anInt5754 = 85;
			} else {
				Static319.aString66 = Static51.aClass140_19.method4155(Static239.anInt2803) + (Static92.aClass104_63.method2743("details") / 10 + 90) + "%";
				Static286.anInt5754 = 85;
			}
		} else if (Static249.anInt5212 == 160) {
			local9 = Static242.method4779();
			if (local9 == -1) {
				Static319.aString66 = Static152.aClass140_84.method4155(Static239.anInt2803);
				Static286.anInt5754 = 90;
			} else if (local9 == 7 || local9 == 9) {
				this.method872("worldlistfull");
				Static224.method5495(1000);
			} else if (Static122.aBoolean255) {
				Static319.aString66 = Static65.aClass140_67.method4155(Static239.anInt2803);
				Static249.anInt5212 = 170;
				Static286.anInt5754 = 90;
			} else {
				this.method872("worldlistio_" + local9);
				Static224.method5495(1000);
			}
		} else if (Static249.anInt5212 == 170) {
			Static18.aBooleanArray4 = new boolean[Static183.anInt4054];
			Static20.anIntArray40 = new int[Static183.anInt4054];
			Static253.aStringArray35 = new String[Static198.anInt4639];
			for (local9 = 0; local9 < Static183.anInt4054; local9++) {
				if (Static111.method2169(local9).anInt6192 == 0) {
					Static18.aBooleanArray4[local9] = true;
					Static249.anInt5210++;
				}
				Static20.anIntArray40[local9] = -1;
			}
			Static184.method3491();
			Static124.anInt2618 = Static224.aClass104_181.method2769("loginscreen");
			Static63.aClass104_43.method2754(false);
			Static284.aClass104_149.method2754(true);
			Static338.aClass104_184.method2754(true);
			Static283.aClass104_148.method2754(true);
			Static55.aClass104_40.method2754(true);
			Static224.aClass104_181.method2754(true);
			Static304.aClass104_159.anInt3077 = 2;
			Static120.aBoolean7 = true;
			Static304.aClass104_160.anInt3077 = 2;
			Static67.aClass104_109.anInt3077 = 2;
			Static278.aClass104_146.anInt3077 = 2;
			Static36.aClass104_26.anInt3077 = 2;
			Static213.aClass104_119.anInt3077 = 2;
			Static24.aClass104_33.anInt3077 = 2;
			Static84.method1692(-1, Static313.anInt6146, -1, false);
			Static319.aString66 = Static181.aClass140_95.method4155(Static239.anInt2803);
			Static286.anInt5754 = 95;
			Static249.anInt5212 = 180;
		} else if (Static249.anInt5212 == 180) {
			Static315.method5228(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method867() {
		if (Static6.aBoolean9) {
			Static191.method3581();
		}
		if (Static51.aClass37_1 != null) {
			Static51.aClass37_1.method3699();
		}
		if (Static229.aFrame3 != null) {
			Static155.method3199(Static229.aFrame3, Static62.aClass179_2);
			Static229.aFrame3 = null;
		}
		if (Static129.aClass117_2 != null) {
			Static129.aClass117_2.method3278();
			Static129.aClass117_2 = null;
		}
		if (Static147.aClass22_1 != null) {
			Static147.aClass22_1.method3362(Static95.aCanvas3);
		}
		Static147.aClass22_1 = null;
		if (Static288.aClass88_2 != null) {
			Static288.aClass88_2.method2712();
		}
		if (Static77.aClass88_1 != null) {
			Static77.aClass88_1.method2712();
		}
		Static57.aClass79_1.method2111();
		Static51.aClass152_1.method4377();
		if (Static350.aClass62_1 != null) {
			Static350.aClass62_1.method1683();
			Static350.aClass62_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method863() {
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
	private void method882(@OriginalArg(1) byte[] arg0) {
		@Pc(18) Class2_Sub12 local18 = new Class2_Sub12(arg0);
		while (true) {
			while (true) {
				@Pc(22) int local22 = local18.method3124();
				if (local22 == 0) {
					return;
				}
				if (local22 == 1) {
					@Pc(36) int[] local36 = Static86.anIntArray129 = new int[6];
					local36[0] = local18.method3104();
					local36[1] = local18.method3104();
					local36[2] = local18.method3104();
					local36[3] = local18.method3104();
					local36[4] = local18.method3104();
					local36[5] = local18.method3104();
				} else {
					@Pc(83) int local83;
					@Pc(88) int local88;
					if (local22 == 4) {
						local83 = local18.method3124();
						Static225.anIntArray360 = new int[local83];
						for (local88 = 0; local88 < local83; local88++) {
							Static225.anIntArray360[local88] = local18.method3104();
							if (Static225.anIntArray360[local88] == 65535) {
								Static225.anIntArray360[local88] = -1;
							}
						}
					} else if (local22 == 5) {
						local83 = local18.method3124();
						Static36.anIntArray67 = new int[local83];
						for (local88 = 0; local88 < local83; local88++) {
							Static36.anIntArray67[local88] = local18.method3104();
							if (Static36.anIntArray67[local88] == 65535) {
								Static36.anIntArray67[local88] = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method885() {
		if (Static317.anInt6257 < Static57.aClass79_1.anInt2290) {
			if (Static238.anInt5092 == Static295.anInt5861) {
				Static295.anInt5861 = Static248.anInt5205;
			} else {
				Static295.anInt5861 = Static238.anInt5092;
			}
			Static14.anInt259 = 5 * 50 * (Static57.aClass79_1.anInt2290 - 1);
			if (Static14.anInt259 > 3000) {
				Static14.anInt259 = 3000;
			}
			if (Static57.aClass79_1.anInt2290 >= 2 && Static57.aClass79_1.anInt2289 == 6) {
				this.method872("js5connect_outofdate");
				Static176.anInt3971 = 1000;
				return;
			}
			if (Static57.aClass79_1.anInt2290 >= 4 && Static57.aClass79_1.anInt2289 == -1) {
				this.method872("js5crc");
				Static176.anInt3971 = 1000;
				return;
			}
			if (Static57.aClass79_1.anInt2290 >= 4 && (Static176.anInt3971 == 0 || Static176.anInt3971 == 5)) {
				if (Static57.aClass79_1.anInt2289 == 7 || Static57.aClass79_1.anInt2289 == 9) {
					this.method872("js5connect_full");
				} else if (Static57.aClass79_1.anInt2289 > 0) {
					this.method872("js5connect");
				} else {
					this.method872("js5io");
				}
				Static176.anInt3971 = 1000;
				return;
			}
		}
		Static317.anInt6257 = Static57.aClass79_1.anInt2290;
		if (Static14.anInt259 > 0) {
			Static14.anInt259--;
			return;
		}
		try {
			if (Static340.anInt6628 == 0) {
				Static217.aClass26_6 = Static62.aClass179_2.method4887(Static295.anInt5861, Static90.aString19);
				Static340.anInt6628++;
			}
			if (Static340.anInt6628 == 1) {
				if (Static217.aClass26_6.anInt484 == 2) {
					this.method893(1000);
					return;
				}
				if (Static217.aClass26_6.anInt484 == 1) {
					Static340.anInt6628++;
				}
			}
			if (Static340.anInt6628 == 2) {
				Static274.aClass117_4 = new Class117((Socket) Static217.aClass26_6.anObject1, Static62.aClass179_2);
				@Pc(186) Class2_Sub12 local186 = new Class2_Sub12(5);
				local186.method3147(Static217.aClass69_2.anInt1946);
				local186.method3162(570);
				Static274.aClass117_4.method3279(5, local186.aByteArray30);
				Static340.anInt6628++;
				Static337.aLong204 = Static22.method285();
			}
			if (Static340.anInt6628 == 3) {
				if (Static176.anInt3971 == 0 || Static176.anInt3971 == 5 || Static274.aClass117_4.method3273() > 0) {
					@Pc(249) int local249 = Static274.aClass117_4.method3271();
					if (local249 != 0) {
						this.method893(local249);
						return;
					}
					Static340.anInt6628++;
				} else if (Static22.method285() - Static337.aLong204 > 30000L) {
					this.method893(1001);
					return;
				}
			}
			if (Static340.anInt6628 == 4) {
				@Pc(282) boolean local282 = Static176.anInt3971 == 5 || Static176.anInt3971 == 10 || Static176.anInt3971 == 28;
				Static57.aClass79_1.method2119(Static274.aClass117_4, !local282);
				Static340.anInt6628 = 0;
				Static217.aClass26_6 = null;
				Static274.aClass117_4 = null;
			}
		} catch (@Pc(299) IOException local299) {
			this.method893(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method860() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static39.method492();
		Static51.aClass152_1 = new Class152(Static62.aClass179_2);
		Static57.aClass79_1 = new Class79();
		if (Static63.anInt1130 != 0) {
			Static201.aByteArrayArray11 = new byte[50][];
		}
		Static84.method1689(Static62.aClass179_2);
		if (Static260.anInt5453 == 0) {
			Static91.aString20 = this.getCodeBase().getHost();
			Static35.anInt6892 = 43594;
			Static15.anInt269 = 443;
		} else if (Static260.anInt5453 == 1) {
			Static91.aString20 = this.getCodeBase().getHost();
			Static35.anInt6892 = Static198.anInt4638 + 40000;
			Static15.anInt269 = Static198.anInt4638 + 50000;
		} else if (Static260.anInt5453 == 2) {
			Static91.aString20 = "127.0.0.1";
			Static35.anInt6892 = Static198.anInt4638 + 40000;
			Static15.anInt269 = Static198.anInt4638 + 50000;
		}
		Static90.aString19 = Static91.aString20;
		Static248.anInt5205 = Static15.anInt269;
		Static134.anInt2875 = Static35.anInt6892;
		Static238.anInt5092 = Static35.anInt6892;
		if (Static150.aClass172_3 == Static13.aClass172_1) {
			Static328.anInt6689 = 0;
			Static195.aShortArray78 = Static113.aShortArray27;
			Static341.anInt463 = 16777215;
			Static298.aShortArray101 = Static256.aShortArray96;
			Static103.aShortArrayArray11 = Static21.aShortArrayArray9;
			Static26.aShortArrayArray12 = Static149.aShortArrayArray10;
			Static231.aBoolean433 = true;
		} else {
			Static298.aShortArray101 = Static155.aShortArray38;
			Static26.aShortArrayArray12 = Static13.aShortArrayArray1;
			Static103.aShortArrayArray11 = Static111.aShortArrayArray8;
			Static195.aShortArray78 = Static110.aShortArray26;
		}
		Static235.aShortArray92 = Static17.aShortArray1 = Static219.aShortArray86 = Static249.aShortArray95 = new short[256];
		Static295.anInt5861 = Static134.anInt2875;
		if (Static293.anInt5826 == 3) {
			Static122.anInt2591 = Static198.anInt4638;
		}
		Static166.aClass25_1 = Static362.method5792(Static95.aCanvas3);
		Class1_Sub2_Sub5.lb = Static216.method4117(Static95.aCanvas3);
		Static147.aClass22_1 = Static295.method4932();
		if (Static147.aClass22_1 != null) {
			Static147.aClass22_1.method3360(Static95.aCanvas3);
		}
		Static193.anInt4254 = Static293.anInt5826;
		try {
			if (Static62.aClass179_2.aClass209_3 != null) {
				Static36.aClass10_1 = new Class10(Static62.aClass179_2.aClass209_3, 5200, 0);
				for (@Pc(174) int local174 = 0; local174 < 29; local174++) {
					Static190.aClass10Array5[local174] = new Class10(Static62.aClass179_2.aClass209Array1[local174], 6000, 0);
				}
				Static301.aClass10_3 = new Class10(Static62.aClass179_2.aClass209_2, 6000, 0);
				Static247.aClass204_3 = new Class204(255, Static36.aClass10_1, Static301.aClass10_3, 500000);
				Static220.aClass10_2 = new Class10(Static62.aClass179_2.aClass209_4, 24, 0);
				Static62.aClass179_2.aClass209Array1 = null;
				Static62.aClass179_2.aClass209_4 = null;
				Static62.aClass179_2.aClass209_3 = null;
				Static62.aClass179_2.aClass209_2 = null;
			}
		} catch (@Pc(230) IOException local230) {
			Static301.aClass10_3 = null;
			Static247.aClass204_3 = null;
			Static36.aClass10_1 = null;
			Static220.aClass10_2 = null;
		}
		if (Static260.anInt5453 != 0) {
			Static311.aBoolean550 = true;
		}
		Static270.aString53 = (Static30.aClass172_2 == Static13.aClass172_1 ? Static70.aClass140_28 : Static328.aClass140_156).method4155(Static239.anInt2803);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method869() {
		if (Static176.anInt3971 == 1000) {
			return;
		}
		Static6.anInt91++;
		if (Static6.anInt91 % 1000 == 1) {
			@Pc(22) GregorianCalendar local22 = new GregorianCalendar();
			Static275.anInt5640 = local22.get(11) * 600 + local22.get(12) * 10 + local22.get(13) / 6;
			Static244.aRandom1.setSeed((long) Static275.anInt5640);
		}
		this.method887();
		if (Static60.aClass220_1 != null) {
			Static60.aClass220_1.method5735();
		}
		Static337.method5505();
		Static276.method4761();
		Static166.aClass25_1.method395();
		Class1_Sub2_Sub5.lb.method2473();
		if (Static147.aClass22_1 != null) {
			@Pc(75) int local75 = Static147.aClass22_1.method3359();
			Static184.anInt4075 = local75;
		}
		if (Static51.aClass37_1 != null) {
			Static51.aClass37_1.method3653((int) Static22.method285());
		}
		Static2.method55();
		Static304.anInt6075 = 0;
		for (@Pc(92) Class50 local92 = Static166.aClass25_1.method394(); local92 != null && Static304.anInt6075 < 128; local92 = Static166.aClass25_1.method394()) {
			if (local92.method1167() != 1) {
				@Pc(105) char local105 = local92.method1165();
				if (!Static189.method3533() || local105 != '`' && local105 != '§') {
					Static255.aClass50Array1[Static304.anInt6075] = local92;
					Static304.anInt6075++;
				} else if (Static12.method177()) {
					Static348.method2474();
				} else {
					Static122.method2380();
				}
			}
		}
		Static17.aClass2_Sub1_1 = null;
		for (@Pc(152) Class2_Sub1 local152 = Class1_Sub2_Sub5.lb.method2467(); local152 != null; local152 = Class1_Sub2_Sub5.lb.method2467()) {
			@Pc(158) int local158 = local152.method53();
			if (local158 == -1) {
				Static290.aClass180_40.method4909(local152);
			} else if (Static101.method2004(local158)) {
				Static17.aClass2_Sub1_1 = local152;
			}
		}
		if (Static12.method177()) {
			Static2.method54();
		}
		if (Static176.anInt3971 == 0) {
			this.method876();
			Static243.method4362();
		} else if (Static176.anInt3971 == 5) {
			this.method876();
			Static243.method4362();
		} else if (Static176.anInt3971 == 25 || Static176.anInt3971 == 28) {
			Static28.method374();
		}
		if (Static176.anInt3971 == 10) {
			this.method889();
			Static35.method5768();
			Static6.method83();
			Static56.method1226();
		} else if (Static176.anInt3971 == 30) {
			Static148.method2889();
		} else if (Static176.anInt3971 == 40) {
			Static56.method1226();
			if (Static284.anInt5721 != -3 && Static284.anInt5721 != 2 && Static284.anInt5721 != 15) {
				Static348.method2469();
			}
		}
		Static302.method5083(Static51.aClass37_1);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method870() {
		if (Static176.anInt3971 == 1000) {
			return;
		}
		@Pc(16) long local16 = Static164.method3270() / 1000000L - Static210.aLong138;
		Static210.aLong138 = Static164.method3270() / 1000000L;
		@Pc(24) boolean local24 = Static330.method5387();
		if (local24 && Static97.aBoolean179 && Static288.aClass88_2 != null) {
			Static288.aClass88_2.method2723();
		}
		if (Static176.anInt3971 == 30 || Static176.anInt3971 == 10) {
			if (Static91.aLong62 != 0L && Static91.aLong62 < Static22.method285()) {
				Static84.method1692(Static218.anInt4842, Static26.method3361(), Static128.anInt2762, false);
			} else if (Static51.aClass37_1.method3690() && Static128.aBoolean262) {
				Static243.method4371();
			}
		}
		@Pc(90) int local90;
		@Pc(94) int local94;
		if (Static229.aFrame3 == null) {
			@Pc(82) Container local82;
			if (Static291.aFrame4 == null) {
				local82 = Static62.aClass179_2.anApplet1;
			} else {
				local82 = Static291.aFrame4;
			}
			local90 = local82.getSize().width;
			local94 = local82.getSize().height;
			if (local82 == Static291.aFrame4) {
				@Pc(100) Insets local100 = Static291.aFrame4.getInsets();
				local94 -= local100.top + local100.bottom;
				local90 -= local100.left + local100.right;
			}
			if (local90 != Static286.anInt5753 || local94 != Static38.anInt556) {
				if (Static51.aClass37_1 == null || Static51.aClass37_1.method3713()) {
					Static39.method492();
				} else {
					Static38.anInt556 = local94;
					Static286.anInt5753 = local90;
				}
				Static91.aLong62 = Static22.method285() + 500L;
			}
		}
		if (Static229.aFrame3 != null && !Static107.aBoolean216 && (Static176.anInt3971 == 30 || Static176.anInt3971 == 10)) {
			Static84.method1692(-1, Static313.anInt6146, -1, false);
		}
		@Pc(161) boolean local161 = false;
		if (Static266.aBoolean487) {
			Static266.aBoolean487 = false;
			local161 = true;
		}
		if (local161) {
			Static162.method3263();
		}
		if (Static51.aClass37_1 != null && Static51.aClass37_1.method3649() || Static26.method3361() != 1) {
			Static35.method5765();
		}
		if (Static176.anInt3971 == 0) {
			Static278.method4773(Static278.aColorArray3[Static114.anInt2412], Static265.aColorArray2[Static114.anInt2412], Static286.anInt5754, Static227.aColorArray1[Static114.anInt2412], Static319.aString66, local161);
		} else if (Static176.anInt3971 == 5) {
			Static295.method4930(Static51.aClass37_1.method3649() | local161, Static227.aColorArray1[Static114.anInt2412].getRGB(), Static25.aClass71_1, Static265.aColorArray2[Static114.anInt2412].getRGB(), Static51.aClass37_1, Static278.aColorArray3[Static114.anInt2412].getRGB());
		} else if (Static176.anInt3971 == 10) {
			Static77.method1594();
		} else if (Static176.anInt3971 == 25 || Static176.anInt3971 == 28) {
			if (Static8.anInt171 == 1) {
				if (Static112.anInt2362 < Static251.anInt5243) {
					Static112.anInt2362 = Static251.anInt5243;
				}
				local90 = (Static112.anInt2362 - Static251.anInt5243) * 50 / Static112.anInt2362;
				Static105.method2078(Static272.aClass71_4, Static281.aClass140_135.method4155(Static239.anInt2803) + "<br>(" + local90 + "%)", true);
			} else if (Static8.anInt171 == 2) {
				if (Static138.anInt3002 < Static230.anInt5822) {
					Static138.anInt3002 = Static230.anInt5822;
				}
				local90 = (Static138.anInt3002 - Static230.anInt5822) * 50 / Static138.anInt3002 + 50;
				Static105.method2078(Static272.aClass71_4, Static281.aClass140_135.method4155(Static239.anInt2803) + "<br>(" + local90 + "%)", true);
			} else {
				Static105.method2078(Static272.aClass71_4, Static281.aClass140_135.method4155(Static239.anInt2803), true);
			}
		} else if (Static176.anInt3971 == 30) {
			Static224.method5496(local16);
		} else if (Static176.anInt3971 == 40) {
			Static105.method2078(Static272.aClass71_4, Static49.aClass140_15.method4155(Static239.anInt2803) + "<br>" + Static191.aClass140_96.method4155(Static239.anInt2803), true);
		}
		if (Static218.anInt4843 == 3) {
			for (local90 = 0; local90 < Static236.anInt928; local90++) {
				@Pc(384) Rectangle local384 = Class58.aRectangleArray2[local90];
				if (Static286.aBooleanArray24[local90]) {
					Static51.aClass37_1.method3694(local384.width, -1996553985, local384.height, local384.x, local384.y);
				} else if (Static286.aBooleanArray25[local90]) {
					Static51.aClass37_1.method3694(local384.width, -1996554240, local384.height, local384.x, local384.y);
				}
			}
		}
		if (Static12.method177()) {
			Static195.method3631(Static51.aClass37_1);
		}
		if ((Static176.anInt3971 == 30 || Static176.anInt3971 == 10) && Static218.anInt4843 == 0 && Static26.method3361() == 1 && !local161 && Static293.aString56.equals("1.1")) {
			local90 = 0;
			for (local94 = 0; local94 < Static236.anInt928; local94++) {
				if (Static286.aBooleanArray25[local94]) {
					Static286.aBooleanArray25[local94] = false;
					Static6.aRectangleArray1[local90++] = Class58.aRectangleArray2[local94];
				}
			}
			Static51.aClass37_1.method3723(Static6.aRectangleArray1, local90);
		} else if (Static176.anInt3971 != 0) {
			Static51.aClass37_1.method3742();
			for (local90 = 0; local90 < Static236.anInt928; local90++) {
				Static286.aBooleanArray25[local90] = false;
			}
		}
		if (Static168.anInt3821 == 0) {
			Static248.method4401(15L);
		} else if (Static168.anInt3821 == 1) {
			Static248.method4401(10L);
		} else if (Static168.anInt3821 == 2) {
			Static248.method4401(5L);
		} else if (Static168.anInt3821 == 3) {
			Static248.method4401(2L);
		}
		if (Static120.aBoolean7) {
			Static366.method3928();
		}
		if (Static353.aBoolean525 && Static176.anInt3971 == 10 && Static269.anInt6658 != -1) {
			Static353.aBoolean525 = false;
			Static167.method3337(Static62.aClass179_2);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method887() {
		@Pc(15) boolean local15 = Static57.aClass79_1.method2115();
		if (!local15) {
			this.method885();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method889() {
		Static170.anInt5086++;
		Static209.method5788(null, -1, -1);
		Static294.method4923(-1, null, -1);
		Static8.method148();
		Static125.anInt2664++;
		for (@Pc(33) int local33 = 0; local33 < 32768; local33++) {
			@Pc(39) Class1_Sub2_Sub3_Sub2 local39 = Static95.aClass1_Sub2_Sub3_Sub2Array1[local33];
			if (local39 != null) {
				@Pc(45) byte local45 = local39.aClass139_1.aByte51;
				if ((local45 & 0x1) != 0) {
					@Pc(56) int local56 = local39.method5787();
					@Pc(80) int local80;
					if ((local45 & 0x2) != 0 && local39.anInt6962 == 0 && Math.random() * 1000.0D < 10.0D) {
						local80 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(88) int local88 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local80 != 0 || local88 != 0) {
							@Pc(99) int local99 = local39.anIntArray535[0] + local80;
							@Pc(106) int local106 = local39.anIntArray534[0] + local88;
							if (local99 < 0) {
								local99 = 0;
							} else if (local99 > Static66.anInt1177 - local56 - 1) {
								local99 = Static66.anInt1177 - local56 - 1;
							}
							if (local106 < 0) {
								local106 = 0;
							} else if (Static12.anInt213 - local56 - 1 < local106) {
								local106 = Static12.anInt213 - local56 - 1;
							}
							@Pc(180) int local180 = Static63.method1316(local106, local56, Static17.anIntArray31, local56, Static300.anIntArray460, local99, local56, Static182.aClass61Array2[local39.aByte77], 0, -1, true, local39.anIntArray534[0], 0, local39.anIntArray535[0]);
							if (local180 > 0) {
								if (local180 > 9) {
									local180 = 9;
								}
								for (@Pc(189) int local189 = 0; local189 < local180; local189++) {
									local39.anIntArray535[local189] = Static300.anIntArray460[local180 - local189 - 1];
									local39.anIntArray534[local189] = Static17.anIntArray31[local180 - local189 - 1];
									local39.aByteArray93[local189] = 1;
								}
								local39.anInt6962 = local180;
							}
						}
					}
					Static109.method2120(true, local39);
					local80 = Static180.method3461(local39);
					Static19.method272(Static118.anInt2491, local39, Static316.anInt6235, local80);
					Static155.method3198(local39);
				}
			}
		}
		if (Static269.anInt6656 == 0 && Static328.anInt6688 == 0) {
			if (Static135.anInt2910 == 2) {
				Static190.method5238();
			} else {
				Static125.method2441();
			}
			if (Static166.anInt3804 >> 7 < 14 || Static166.anInt3804 >> 7 >= Static66.anInt1177 - 14 || Static51.anInt879 >> 7 < 14 || Static12.anInt213 - 14 <= Static51.anInt879 >> 7) {
				Static92.method1836();
			}
		}
		while (true) {
			@Pc(307) Class2_Sub41 local307;
			@Pc(312) Class68 local312;
			@Pc(320) Class68 local320;
			do {
				local307 = (Class2_Sub41) Static311.aClass180_42.method4914();
				if (local307 == null) {
					while (true) {
						do {
							local307 = (Class2_Sub41) Static215.aClass180_28.method4914();
							if (local307 == null) {
								while (true) {
									do {
										local307 = (Class2_Sub41) Static245.aClass180_36.method4914();
										if (local307 == null) {
											if (Static18.aClass68_1 != null) {
												Static150.method3006();
											}
											if (Static6.anInt91 % 1500 == 0) {
												Static183.method3485();
											}
											Static56.method1225();
											if (Static6.aBoolean9 && Static22.method285() - 60000L > Static271.aLong174) {
												Static191.method3581();
												return;
											}
											return;
										}
										local312 = local307.aClass68_35;
										if (local312.anInt1851 < 0) {
											break;
										}
										local320 = Static8.method144(local312.anInt1830);
									} while (local320 == null || local320.aClass68Array1 == null || local312.anInt1851 >= local320.aClass68Array1.length || local320.aClass68Array1[local312.anInt1851] != local312);
									Static367.method5890(local307);
								}
							}
							local312 = local307.aClass68_35;
							if (local312.anInt1851 < 0) {
								break;
							}
							local320 = Static8.method144(local312.anInt1830);
						} while (local320 == null || local320.aClass68Array1 == null || local320.aClass68Array1.length <= local312.anInt1851 || local312 != local320.aClass68Array1[local312.anInt1851]);
						Static367.method5890(local307);
					}
				}
				local312 = local307.aClass68_35;
				if (local312.anInt1851 < 0) {
					break;
				}
				local320 = Static8.method144(local312.anInt1830);
			} while (local320 == null || local320.aClass68Array1 == null || local320.aClass68Array1.length <= local312.anInt1851 || local312 != local320.aClass68Array1[local312.anInt1851]);
			Static367.method5890(local307);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method893(@OriginalArg(0) int arg0) {
		Static217.aClass26_6 = null;
		Static274.aClass117_4 = null;
		Static57.aClass79_1.anInt2289 = arg0;
		Static340.anInt6628 = 0;
		Static57.aClass79_1.anInt2290++;
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method857()) {
			return;
		}
		Static198.anInt4638 = Integer.parseInt(this.getParameter("worldid"));
		Static260.anInt5453 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static260.anInt5453 < 0 || Static260.anInt5453 > 1) {
			Static260.anInt5453 = 0;
		}
		Static63.anInt1130 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static63.anInt1130 < 0 || Static63.anInt1130 > 2) {
			Static63.anInt1130 = 0;
		}
		try {
			Static239.anInt2803 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(46) Exception local46) {
			Static239.anInt2803 = 0;
		}
		@Pc(52) String local52 = this.getParameter("objecttag");
		if (local52 != null && local52.equals("1")) {
			Static327.aBoolean566 = true;
		} else {
			Static327.aBoolean566 = false;
		}
		@Pc(68) String local68 = this.getParameter("js");
		if (local68 != null && local68.equals("1")) {
			Static334.aBoolean580 = true;
		} else {
			Static334.aBoolean580 = false;
		}
		@Pc(84) String local84 = this.getParameter("advert");
		if (local84 != null && local84.equals("1")) {
			Static171.aBoolean333 = true;
		} else {
			Static171.aBoolean333 = false;
		}
		@Pc(100) String local100 = this.getParameter("game");
		if (local100 != null && local100.equals("1")) {
			Static13.aClass172_1 = Static150.aClass172_3;
		} else {
			Static13.aClass172_1 = Static30.aClass172_2;
		}
		try {
			Static206.anInt4520 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(119) Exception local119) {
			Static206.anInt4520 = 0;
		}
		Static327.aString67 = this.getParameter("quiturl");
		Static71.aString12 = this.getParameter("settings");
		if (Static71.aString12 == null) {
			Static71.aString12 = "";
		}
		@Pc(137) String local137 = this.getParameter("country");
		if (local137 != null) {
			try {
				Static366.anInt4512 = Integer.parseInt(local137);
			} catch (@Pc(144) Exception local144) {
				Static366.anInt4512 = 0;
			}
		}
		Static114.anInt2412 = Integer.parseInt(this.getParameter("colourid"));
		if (Static114.anInt2412 < 0 || Static114.anInt2412 >= Static278.aColorArray3.length) {
			Static114.anInt2412 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static50.aBoolean85 = true;
			Static328.aBoolean597 = true;
		}
		if (Static13.aClass172_1 == Static30.aClass172_2) {
			Static2.anInt54 = 765;
			Static30.anInt482 = 503;
		} else if (Static150.aClass172_3 == Static13.aClass172_1) {
			Static30.anInt482 = 480;
			Static2.anInt54 = 640;
		}
		Static2.aClient1 = this;
		this.method875(Static63.anInt1130 + 32, Static2.anInt54, Static30.anInt482);
	}
}
