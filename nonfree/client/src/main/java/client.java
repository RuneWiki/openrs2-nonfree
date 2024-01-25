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
				Static370.method4797("argument count");
			}
			Static273.anInt4336 = Integer.parseInt(arg0[0]);
			Static136.aClass166_3 = Static37.aClass166_2;
			if (arg0[1].equals("live")) {
				Static180.aClass44_2 = Static217.aClass44_3;
			} else if (arg0[1].equals("rc")) {
				Static180.aClass44_2 = Static139.aClass44_1;
			} else if (arg0[1].equals("wip")) {
				Static180.aClass44_2 = Static234.aClass44_4;
			} else {
				Static370.method4797("modewhat");
			}
			Static188.anInt3028 = Static2.method2552(arg0[2]);
			if (Static188.anInt3028 == -1) {
				if (arg0[2].equals("english")) {
					Static188.anInt3028 = 0;
				} else if (arg0[2].equals("german")) {
					Static188.anInt3028 = 1;
				} else {
					Static370.method4797("language");
				}
			}
			Static290.aBoolean384 = false;
			Static60.aBoolean90 = false;
			if (arg0[3].equals("game0")) {
				Static357.aClass6_4 = Static455.aClass6_5;
			} else if (arg0[3].equals("game1")) {
				Static357.aClass6_4 = Static43.aClass6_3;
			} else {
				Static370.method4797("game");
			}
			Static28.anInt564 = 0;
			Static168.anInt2764 = Static357.aClass6_4.anInt193;
			Static21.aBoolean34 = true;
			Static164.aBoolean215 = true;
			Static116.aString52 = "";
			Static160.anInt6707 = 0;
			@Pc(131) client local131 = new client();
			Static389.aClient4 = local131;
			local131.method777(Static180.aClass44_2.method951() + 32, Static357.aClass6_4.aString4);
			Static158.aFrame2.setLocation(40, 40);
		} catch (@Pc(154) Exception local154) {
			Static211.method2815(local154, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method789() {
		if (Static447.aBoolean604) {
			Static329.method4206();
		}
		if (Static213.aClass128_22 != null) {
			Static213.aClass128_22.method3596();
		}
		if (Static70.aFrame1 != null) {
			Static208.method2803(Static41.aClass124_2, Static70.aFrame1);
			Static70.aFrame1 = null;
		}
		if (Static48.aClass3_2 != null) {
			Static48.aClass3_2.method63();
			Static48.aClass3_2 = null;
		}
		if (Static19.aClass103_1 != null) {
			Static19.aClass103_1.method2127(Static226.aCanvas9);
		}
		Static19.aClass103_1 = null;
		Static41.method655();
		Static316.aClass19_1.method408();
		Static200.aClass134_1.method2784();
		if (Static30.aClass255_1 != null) {
			Static30.aClass255_1.method5465();
			Static30.aClass255_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method797() {
		@Pc(12) boolean local12 = Static316.aClass19_1.method405();
		if (!local12) {
			this.method813();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)Ljava/lang/String;")
	@Override
	protected String method784() {
		@Pc(5) String local5 = null;
		try {
			local5 = "[1)" + Static101.anInt6646 + "," + Static278.anInt4392 + "," + Static425.anInt6922 + "," + Static251.anInt4072 + "|";
			if (Static239.aClass20_Sub3_Sub3_Sub1_1 != null) {
				local5 = local5 + "2)" + Static138.anInt3548 + "," + (Static239.aClass20_Sub3_Sub3_Sub1_1.anIntArray370[0] + Static101.anInt6646) + "," + (Static278.anInt4392 + Static239.aClass20_Sub3_Sub3_Sub1_1.anIntArray369[0]) + "|";
			}
			local5 = local5 + "3)" + Static410.anInt6680 + "|4)" + Static336.aClass106_Sub1_1.anInt5675 + "|5)" + Static330.method4209() + "|6)" + Static126.anInt2202 + "," + Static92.anInt1618 + "|";
			local5 = local5 + "7)" + Static336.aClass106_Sub1_1.method4423(Static410.anInt6680) + "|";
			local5 = local5 + "8)" + Static336.aClass106_Sub1_1.method4424(Static410.anInt6680) + "|";
			local5 = local5 + "9)" + Static336.aClass106_Sub1_1.aBoolean466 + "|";
			local5 = local5 + "10)" + Static336.aClass106_Sub1_1.aBoolean463 + "|";
			local5 = local5 + "11)" + Static336.aClass106_Sub1_1.aBoolean459 + "|";
			local5 = local5 + "12)" + Static336.aClass106_Sub1_1.method4438(Static410.anInt6680) + "|";
			local5 = local5 + "13)" + Static144.anInt2437 + "]";
		} catch (@Pc(201) Throwable local201) {
		}
		return local5;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method785() {
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method802() {
		@Pc(10) int local10;
		if (!Static336.aClass106_Sub1_1.aBoolean458) {
			for (local10 = 0; local10 < Static36.anInt708; local10++) {
				if (Static266.aClass143Array3[local10].method2873() == 's' || Static266.aClass143Array3[local10].method2873() == 'S') {
					Static336.aClass106_Sub1_1.aBoolean458 = true;
					break;
				}
			}
		}
		@Pc(54) int local54;
		if (Static311.anInt5172 == 0) {
			@Pc(44) Runtime local44 = Runtime.getRuntime();
			local54 = (int) ((local44.totalMemory() - local44.freeMemory()) / 1024L);
			@Pc(57) long local57 = Static232.method3058();
			if (Static447.aLong223 == 0L) {
				Static447.aLong223 = local57;
			}
			if (local54 > 16384 && local57 - Static447.aLong223 < 5000L) {
				if (local57 - Static442.aLong220 > 1000L) {
					System.gc();
					Static442.aLong220 = local57;
				}
				Class106_Sub1.lb = Static167.aClass151_94.method3122(Static188.anInt3028);
				Static388.anInt891 = 5;
			} else {
				Class106_Sub1.lb = Static246.aClass151_130.method3122(Static188.anInt3028);
				Static388.anInt891 = 5;
				Static311.anInt5172 = 10;
			}
		} else if (Static311.anInt5172 == 10) {
			for (local10 = 0; local10 < 4; local10++) {
				Static383.aClass247Array1[local10] = Static430.method5417(Static425.anInt6922, Static251.anInt4072);
			}
			Class106_Sub1.lb = Static345.aClass151_179.method3122(Static188.anInt3028);
			Static311.anInt5172 = 20;
			Static388.anInt891 = 10;
		} else if (Static311.anInt5172 == 20) {
			if (Static170.aClass208_1 == null) {
				Static170.aClass208_1 = new Class208(Static316.aClass19_1, Static200.aClass134_1);
			}
			if (Static170.aClass208_1.method4297()) {
				Static356.aClass113_110 = Static108.method1515(false, 0, true);
				Static230.aClass113_116 = Static108.method1515(false, 1, true);
				Static383.aClass113_117 = Static108.method1515(false, 2, true);
				Static291.aClass113_92 = Static108.method1515(false, 3, true);
				Static12.aClass113_7 = Static108.method1515(false, 4, true);
				Static310.aClass113_97 = Static108.method1515(true, 5, true);
				Static116.aClass113_101 = Static108.method1515(true, 6, false);
				Static258.aClass113_80 = Static108.method1515(false, 7, true);
				Static169.aClass113_55 = Static108.method1515(false, 8, true);
				Static391.aClass113_119 = Static108.method1515(false, 9, true);
				Static313.aClass113_98 = Static108.method1515(false, 10, true);
				Static408.aClass113_127 = Static108.method1515(false, 11, true);
				Static143.aClass113_48 = Static108.method1515(false, 12, true);
				Static166.aClass113_59 = Static108.method1515(false, 13, true);
				Static224.aClass113_73 = Static108.method1515(false, 14, false);
				Static169.aClass113_54 = Static108.method1515(false, 15, true);
				Static315.aClass113_99 = Static108.method1515(false, 16, true);
				Static383.aClass113_118 = Static108.method1515(false, 17, true);
				Static28.aClass113_11 = Static108.method1515(false, 18, true);
				Static9.aClass113_5 = Static108.method1515(false, 19, true);
				Static66.aClass113_23 = Static108.method1515(false, 20, true);
				Static52.aClass113_20 = Static108.method1515(false, 21, true);
				Static265.aClass113_82 = Static108.method1515(false, 22, true);
				Static274.aClass113_84 = Static108.method1515(true, 23, true);
				Static61.aClass113_22 = Static108.method1515(false, 24, true);
				Static322.aClass113_135 = Static108.method1515(false, 25, true);
				Static334.aClass113_103 = Static108.method1515(true, 26, true);
				Class20_Sub3_Sub2.lb = Static108.method1515(false, 27, true);
				Static221.aClass113_71 = Static108.method1515(true, 28, true);
				Static74.aClass113_26 = Static108.method1515(false, 29, true);
				Class106_Sub1.lb = Static22.aClass151_16.method3122(Static188.anInt3028);
				Static388.anInt891 = 15;
				Static311.anInt5172 = 30;
			} else {
				Class106_Sub1.lb = Static1.aClass151_4.method3122(Static188.anInt3028);
				Static388.anInt891 = 12;
			}
		} else if (Static311.anInt5172 == 30) {
			local10 = 0;
			for (local54 = 0; local54 < 30; local54++) {
				local10 += Static324.aClass222_Sub1Array1[local54].method4794() * Static304.anIntArray298[local54] / 100;
			}
			if (local10 == 100) {
				Class106_Sub1.lb = Static167.aClass151_93.method3122(Static188.anInt3028);
				Static388.anInt891 = 20;
				Static313.method4061(Static169.aClass113_55);
				Static306.method3996(Static169.aClass113_55);
				Static311.anInt5172 = 40;
			} else {
				if (local10 != 0) {
					Class106_Sub1.lb = Static123.aClass151_71.method3122(Static188.anInt3028) + local10 + "%";
				}
				Static388.anInt891 = 20;
			}
		} else if (Static311.anInt5172 == 40) {
			if (Static221.aClass113_71.method2257()) {
				this.method806(Static221.aClass113_71.method2273(1));
				Class106_Sub1.lb = Static360.aClass151_188.method3122(Static188.anInt3028);
				Static388.anInt891 = 25;
				Static311.anInt5172 = 50;
			} else {
				Class106_Sub1.lb = Static235.aClass151_125.method3122(Static188.anInt3028) + Static221.aClass113_71.method2250() + "%";
				Static388.anInt891 = 25;
			}
		} else if (Static311.anInt5172 == 50) {
			Static409.method5109();
			Class106_Sub1.lb = Static254.aClass151_133.method3122(Static188.anInt3028);
			Static388.anInt891 = 30;
			Static311.anInt5172 = 60;
		} else if (Static311.anInt5172 == 60) {
			local10 = Static326.method4186(Static169.aClass113_55, Static166.aClass113_59);
			local54 = Static383.method4897();
			if (local54 > local10) {
				Class106_Sub1.lb = Static354.aClass151_184.method3122(Static188.anInt3028) + local10 * 100 / local54 + "%";
				Static388.anInt891 = 35;
			} else {
				Class106_Sub1.lb = Static112.aClass151_64.method3122(Static188.anInt3028);
				Static388.anInt891 = 35;
				Static311.anInt5172 = 70;
			}
		} else if (Static311.anInt5172 == 70) {
			local10 = Static84.method1262(Static169.aClass113_55);
			local54 = Static365.method4744();
			if (local54 > local10) {
				Class106_Sub1.lb = Static184.aClass151_102.method3122(Static188.anInt3028) + local10 * 100 / local54 + "%";
				Static388.anInt891 = 40;
			} else {
				Class106_Sub1.lb = Static62.aClass151_40.method3122(Static188.anInt3028);
				Static388.anInt891 = 40;
				Static311.anInt5172 = 80;
			}
		} else if (Static311.anInt5172 == 80) {
			if (Static334.aClass113_103.method2257()) {
				Static190.anInterface8_5 = new Class67(Static334.aClass113_103, Static391.aClass113_119, Static169.aClass113_55);
				Class106_Sub1.lb = Static234.aClass151_123.method3122(Static188.anInt3028);
				Static311.anInt5172 = 90;
				Static388.anInt891 = 45;
			} else {
				Class106_Sub1.lb = Static58.aClass151_34.method3122(Static188.anInt3028) + Static334.aClass113_103.method2250() + "%";
				Static388.anInt891 = 45;
			}
		} else if (Static311.anInt5172 == 90) {
			Class106_Sub1.lb = Static31.aClass151_20.method3122(Static188.anInt3028);
			Static311.anInt5172 = 95;
			Static388.anInt891 = 50;
		} else if (Static311.anInt5172 == 95) {
			if (Static336.aClass106_Sub1_1.aBoolean458) {
				Static336.aClass106_Sub1_1.anInt5685 = 0;
				Static336.aClass106_Sub1_1.anInt5675 = 0;
				Static336.aClass106_Sub1_1.anInt5684 = 0;
				Static336.aClass106_Sub1_1.anInt5680 = 0;
				Static336.aClass106_Sub1_1.anInt5679 = 1;
			}
			Static336.aClass106_Sub1_1.aBoolean458 = true;
			Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
			Static442.method5552(false, Static336.aClass106_Sub1_1.anInt5680);
			Class106_Sub1.lb = Static123.aClass151_70.method3122(Static188.anInt3028);
			Static388.anInt891 = 55;
			Static311.anInt5172 = 100;
		} else if (Static311.anInt5172 == 100) {
			Static280.method3525(Static213.aClass128_22, Static169.aClass113_55, Static166.aClass113_59);
			Class106_Sub1.lb = Static323.aClass151_167.method3122(Static188.anInt3028);
			Static388.anInt891 = 60;
			Static430.method5422(5);
			Static311.anInt5172 = 110;
		} else if (Static311.anInt5172 == 110) {
			Static383.aClass113_117.method2257();
			local10 = Static383.aClass113_117.method2250();
			Static315.aClass113_99.method2257();
			local10 += Static315.aClass113_99.method2250();
			Static383.aClass113_118.method2257();
			local10 += Static383.aClass113_118.method2250();
			Static28.aClass113_11.method2257();
			local10 += Static28.aClass113_11.method2250();
			Static9.aClass113_5.method2257();
			local10 += Static9.aClass113_5.method2250();
			Static66.aClass113_23.method2257();
			local10 += Static66.aClass113_23.method2250();
			Static52.aClass113_20.method2257();
			local10 += Static52.aClass113_20.method2250();
			Static265.aClass113_82.method2257();
			local10 += Static265.aClass113_82.method2250();
			Static61.aClass113_22.method2257();
			local10 += Static61.aClass113_22.method2250();
			Static322.aClass113_135.method2257();
			local10 += Static322.aClass113_135.method2250();
			Class20_Sub3_Sub2.lb.method2257();
			local10 += Class20_Sub3_Sub2.lb.method2250();
			Static74.aClass113_26.method2257();
			local10 += Static74.aClass113_26.method2250();
			if (local10 < 1200) {
				Class106_Sub1.lb = Static278.aClass151_143.method3122(Static188.anInt3028) + local10 / 12 + "%";
				Static388.anInt891 = 65;
			} else {
				Static85.aClass132_5 = new Class132(Static357.aClass6_4, Static188.anInt3028, Static383.aClass113_117);
				Static332.aClass174_1 = new Class174(Static357.aClass6_4, Static188.anInt3028, Static383.aClass113_117);
				Static455.aClass52_2 = new Class52(Static357.aClass6_4, Static188.anInt3028, Static383.aClass113_117, Static169.aClass113_55);
				Static248.aClass242_1 = new Class242(Static357.aClass6_4, Static188.anInt3028, Static383.aClass113_118);
				Static2.aClass28_4 = new Class28(Static357.aClass6_4, Static188.anInt3028, Static383.aClass113_117);
				Static139.aClass18_2 = new Class18(Static357.aClass6_4, Static188.anInt3028, Static383.aClass113_117);
				Static221.aClass129_2 = new Class129(Static357.aClass6_4, Static188.anInt3028, Static383.aClass113_117, Static258.aClass113_80);
				Static119.aClass228_1 = new Class228(Static357.aClass6_4, Static188.anInt3028, Static383.aClass113_117);
				Static337.aClass120_2 = new Class120(Static357.aClass6_4, Static188.anInt3028, Static383.aClass113_117);
				Static259.aClass95_3 = new Class95(Static357.aClass6_4, Static188.anInt3028, true, Static315.aClass113_99, Static258.aClass113_80);
				Static330.aClass101_3 = new Class101(Static357.aClass6_4, Static188.anInt3028, Static383.aClass113_117, Static169.aClass113_55);
				Static346.aClass135_3 = new Class135(Static357.aClass6_4, Static188.anInt3028, Static383.aClass113_117, Static169.aClass113_55);
				Static304.aClass27_1 = new Class27(Static357.aClass6_4, Static188.anInt3028, true, Static28.aClass113_11, Static258.aClass113_80);
				Static227.aClass65_2 = new Class65(Static357.aClass6_4, Static188.anInt3028, true, Static85.aClass132_5, Static9.aClass113_5, Static258.aClass113_80);
				Static100.aClass108_1 = new Class108(Static357.aClass6_4, Static188.anInt3028, Static383.aClass113_117);
				Static152.aClass213_1 = new Class213(Static357.aClass6_4, Static188.anInt3028, Static66.aClass113_23, Static356.aClass113_110, Static230.aClass113_116);
				Static128.aClass66_1 = new Class66(Static357.aClass6_4, Static188.anInt3028, Static383.aClass113_117);
				Static331.aClass238_1 = new Class238(Static357.aClass6_4, Static188.anInt3028, Static383.aClass113_117);
				Static44.aClass190_2 = new Class190(Static357.aClass6_4, Static188.anInt3028, Static52.aClass113_20, Static258.aClass113_80);
				Static120.aClass267_2 = new Class267(Static357.aClass6_4, Static188.anInt3028, Static383.aClass113_117);
				Static203.aClass165_1 = new Class165(Static357.aClass6_4, Static188.anInt3028, Static383.aClass113_117);
				Static368.aClass94_1 = new Class94(Static357.aClass6_4, Static188.anInt3028, Static383.aClass113_117);
				Static182.aClass205_1 = new Class205(Static357.aClass6_4, Static188.anInt3028, Static265.aClass113_82);
				Static183.aClass269_3 = new Class269(Static357.aClass6_4, Static188.anInt3028, Static383.aClass113_117);
				Static410.method5130(Static166.aClass113_59, Static291.aClass113_92, Static258.aClass113_80, Static169.aClass113_55);
				Static398.method5002(Static74.aClass113_26);
				Static166.aClass236_1 = new Class236(Static188.anInt3028, Static61.aClass113_22, Static322.aClass113_135);
				Static109.aClass229_1 = new Class229(Static188.anInt3028, Static61.aClass113_22, Static322.aClass113_135, new Class130());
				Class106_Sub1.lb = Static330.aClass151_170.method3122(Static188.anInt3028);
				Static388.anInt891 = 65;
				Static23.method430();
				Static259.aClass95_3.method1823(!Static336.aClass106_Sub1_1.method4438(Static410.anInt6680));
				Static364.aClass259_1 = new Class259();
				Static312.method4044();
				Static380.method4859(Class20_Sub3_Sub2.lb);
				Static320.method4120(Static258.aClass113_80, Static190.anInterface8_5);
				Static311.anInt5172 = 120;
			}
		} else if (Static311.anInt5172 == 120) {
			local10 = Static284.method3705(Static169.aClass113_55);
			local54 = Static311.method4040();
			if (local54 > local10) {
				Class106_Sub1.lb = Static427.aClass151_217.method3122(Static188.anInt3028) + local10 * 100 / local54 + "%";
				Static388.anInt891 = 70;
			} else {
				Static225.method3000(Static169.aClass113_55, Static213.aClass128_22);
				Static92.method1318(Static361.aClass49Array120);
				Class106_Sub1.lb = Static280.aClass151_145.method3122(Static188.anInt3028);
				Static311.anInt5172 = 130;
				Static388.anInt891 = 70;
			}
		} else if (Static311.anInt5172 == 130) {
			if (Static313.aClass113_98.method2260("huffman", "")) {
				@Pc(1205) Class54 local1205 = new Class54(Static313.aClass113_98.method2275("", "huffman"));
				Static391.method4948(local1205);
				Class106_Sub1.lb = Static419.aClass151_213.method3122(Static188.anInt3028);
				Static388.anInt891 = 75;
				Static311.anInt5172 = 140;
			} else {
				Class106_Sub1.lb = Static59.aClass151_37.method3122(Static188.anInt3028) + "0%";
				Static388.anInt891 = 75;
			}
		} else if (Static311.anInt5172 == 140) {
			if (Static291.aClass113_92.method2257()) {
				Class106_Sub1.lb = Static163.aClass151_92.method3122(Static188.anInt3028);
				Static311.anInt5172 = 150;
				Static388.anInt891 = 80;
			} else {
				Class106_Sub1.lb = Static439.aClass151_221.method3122(Static188.anInt3028) + Static291.aClass113_92.method2250() + "%";
				Static388.anInt891 = 80;
			}
		} else if (Static311.anInt5172 == 150) {
			if (Static143.aClass113_48.method2257()) {
				Class106_Sub1.lb = Static224.aClass151_120.method3122(Static188.anInt3028);
				Static311.anInt5172 = 160;
				Static388.anInt891 = 82;
			} else {
				Class106_Sub1.lb = Static113.aClass151_65.method3122(Static188.anInt3028) + Static143.aClass113_48.method2250() + "%";
				Static388.anInt891 = 82;
			}
		} else if (Static311.anInt5172 == 160) {
			if (Static166.aClass113_59.method2257()) {
				Class106_Sub1.lb = Static280.aClass151_146.method3122(Static188.anInt3028);
				Static388.anInt891 = 85;
				Static311.anInt5172 = 170;
			} else {
				Class106_Sub1.lb = Static280.aClass151_146.method3122(Static188.anInt3028) + Static166.aClass113_59.method2250() + "%";
				Static388.anInt891 = 85;
			}
		} else if (Static311.anInt5172 == 170) {
			if (Static274.aClass113_84.method2254("details")) {
				Static114.method5230(Static274.aClass113_84, Static2.aClass28_4, Static139.aClass18_2, Static259.aClass95_3, Static330.aClass101_3, Static346.aClass135_3, Static364.aClass259_1);
				Class106_Sub1.lb = Static418.aClass151_211.method3122(Static188.anInt3028);
				Static388.anInt891 = 89;
				Static311.anInt5172 = 180;
			} else {
				Class106_Sub1.lb = Static75.aClass151_47.method3122(Static188.anInt3028) + Static274.aClass113_84.method2267("details") + "%";
				Static388.anInt891 = 87;
			}
		} else if (Static311.anInt5172 == 180) {
			local10 = Static103.method1472();
			if (local10 == -1) {
				Class106_Sub1.lb = Static368.aClass151_192.method3122(Static188.anInt3028);
				Static388.anInt891 = 90;
			} else if (local10 == 7 || local10 == 9) {
				this.method795("worldlistfull");
				Static430.method5422(1000);
			} else if (Static54.aBoolean78) {
				Class106_Sub1.lb = Static13.aClass151_13.method3122(Static188.anInt3028);
				Static388.anInt891 = 90;
				Static311.anInt5172 = 190;
			} else {
				this.method795("worldlistio_" + local10);
				Static430.method5422(1000);
			}
		} else if (Static311.anInt5172 == 190) {
			Static260.aStringArray46 = new String[Static203.aClass165_1.anInt4189];
			Static156.anIntArray134 = new int[Static368.aClass94_1.anInt2299];
			Static389.aBooleanArray12 = new boolean[Static368.aClass94_1.anInt2299];
			for (local10 = 0; local10 < Static368.aClass94_1.anInt2299; local10++) {
				if (Static368.aClass94_1.method1816(local10).anInt6641 == 0) {
					Static389.aBooleanArray12[local10] = true;
					Static25.anInt543++;
				}
				Static156.anIntArray134[local10] = -1;
			}
			Static103.method1469();
			Static445.anInt7372 = Static291.aClass113_92.method2269("loginscreen");
			Static310.aClass113_97.method2252(false);
			Static116.aClass113_101.method2252(true);
			Static169.aClass113_55.method2252(true);
			Static166.aClass113_59.method2252(true);
			Static313.aClass113_98.method2252(true);
			Static291.aClass113_92.method2252(true);
			Static383.aClass113_117.anInt2734 = 2;
			Static269.aBoolean336 = true;
			Static383.aClass113_118.anInt2734 = 2;
			Static315.aClass113_99.anInt2734 = 2;
			Static28.aClass113_11.anInt2734 = 2;
			Static9.aClass113_5.anInt2734 = 2;
			Static66.aClass113_23.anInt2734 = 2;
			Static52.aClass113_20.anInt2734 = 2;
			Static421.method5241(-1, false, Static336.aClass106_Sub1_1.anInt5679, -1);
			Class106_Sub1.lb = Static303.aClass151_155.method3122(Static188.anInt3028);
			Static388.anInt891 = 95;
			Static311.anInt5172 = 200;
		} else if (Static311.anInt5172 == 200) {
			Static239.method3125(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method788() {
		if (Static98.anInt1721 == 1000) {
			return;
		}
		Static368.anInt6250++;
		if (Static368.anInt6250 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static218.anInt5622 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static411.aRandom1.setSeed((long) Static218.anInt5622);
		}
		if (Static368.anInt6250 % 50 == 0) {
			Static325.anInt5363 = Static88.anInt1565;
			Static389.anInt1932 = Static409.anInt6637;
			Static88.anInt1565 = 0;
			Static409.anInt6637 = 0;
		}
		this.method797();
		if (Static170.aClass208_1 != null) {
			Static170.aClass208_1.method4296();
		}
		Static339.method4304();
		Static321.aClass31_4.method3799();
		Static210.aClass26_1.method570();
		if (Static19.aClass103_1 != null) {
			@Pc(85) int local85 = Static19.aClass103_1.method2126();
			Static230.anInt6340 = local85;
		}
		if (Static213.aClass128_22 != null) {
			Static213.aClass128_22.method3544((int) Static232.method3058());
		}
		Static389.method1528();
		Static36.anInt708 = 0;
		for (@Pc(102) Class143 local102 = Static321.aClass31_4.method3796(); local102 != null && Static36.anInt708 < 128; local102 = Static321.aClass31_4.method3796()) {
			if (local102.method2871() != 1) {
				@Pc(113) char local113 = local102.method2873();
				if (!Static223.method2979() || local113 != '`' && local113 != '§') {
					Static266.aClass143Array3[Static36.anInt708] = local102;
					Static36.anInt708++;
				} else if (Static164.method2242()) {
					Static380.method4858();
				} else {
					Static259.method3355();
				}
			}
		}
		for (@Pc(156) Class1_Sub29 local156 = Static210.aClass26_1.method577(); local156 != null; local156 = Static210.aClass26_1.method577()) {
			@Pc(162) int local162 = local156.method3483();
			if (local162 == -1) {
				Static428.aClass254_46.method5430(local156);
			} else if (Static357.method4609(local162)) {
				Static416.aClass254_44.method5430(local156);
			}
			if (Static416.aClass254_44.method5431() > 10) {
				Static416.aClass254_44.method5436();
			}
		}
		if (Static164.method2242()) {
			Static300.method3931();
		}
		if (Static98.anInt1721 == 0) {
			this.method802();
			Static285.method3724();
		} else if (Static98.anInt1721 == 5) {
			this.method802();
			Static285.method3724();
		} else if (Static98.anInt1721 == 25 || Static98.anInt1721 == 28) {
			Static398.method5005();
		}
		if (Static98.anInt1721 == 10) {
			this.method808();
			Static382.method4886();
			Static36.method613();
			Static17.method272();
		} else if (Static98.anInt1721 == 30) {
			Static364.method4731();
		} else if (Static98.anInt1721 == 40) {
			Static17.method272();
			if (Static418.anInt6790 != -3 && Static418.anInt6790 != 2 && Static418.anInt6790 != 15) {
				Static252.method2868();
			}
		}
		Static318.method4105(Static213.aClass128_22);
		Static416.aClass254_44.method5436();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method781() {
		@Pc(16) Frame local16 = new Frame("Jagex");
		local16.pack();
		local16.dispose();
		Static300.method3936();
		Static200.aClass134_1 = new Class134(Static41.aClass124_2);
		Static316.aClass19_1 = new Class19();
		if (Static136.aClass166_3 != Static209.aClass166_6) {
			Static91.aByteArrayArray12 = new byte[50][];
		}
		Static336.aClass106_Sub1_1 = new Class106_Sub1(Static41.aClass124_2);
		if (Static209.aClass166_6 == Static136.aClass166_3) {
			Static428.aString65 = this.getCodeBase().getHost();
			Static288.anInt4735 = 443;
			Static25.anInt542 = 43594;
		} else if (Static25.method477(Static136.aClass166_3)) {
			Static428.aString65 = this.getCodeBase().getHost();
			Static25.anInt542 = Static273.anInt4336 + 40000;
			Static288.anInt4735 = Static273.anInt4336 + 50000;
		} else if (Static136.aClass166_3 == Static37.aClass166_2) {
			Static288.anInt4735 = Static273.anInt4336 + 50000;
			Static428.aString65 = "127.0.0.1";
			Static25.anInt542 = Static273.anInt4336 + 40000;
		}
		Static91.anInt1613 = Static288.anInt4735;
		Static270.aString42 = Static428.aString65;
		Static195.anInt3133 = Static25.anInt542;
		Static182.anInt2943 = Static25.anInt542;
		if (Static357.aClass6_4 == Static43.aClass6_3) {
			Static126.aShortArrayArray12 = Static253.aShortArrayArray21;
			Static91.anInt1609 = 16777215;
			Static250.aShortArray15 = Static248.aShortArray53;
			Static314.aBoolean419 = true;
			Static455.anInt7453 = 0;
			Static101.aShortArrayArray30 = Static172.aShortArrayArray14;
			Static356.aShortArray73 = Static361.aShortArray76;
		} else {
			Static250.aShortArray15 = Static164.aShortArray41;
			Static356.aShortArray73 = Static339.aShortArray66;
			Static126.aShortArrayArray12 = Static54.aShortArrayArray6;
			Static101.aShortArrayArray30 = Static188.aShortArrayArray15;
		}
		Static131.anInt2260 = Static195.anInt3133;
		if (Static191.anInt3047 == 3) {
			Static62.anInt1112 = Static273.anInt4336;
		}
		Static64.aShortArray18 = Static447.aShortArray124 = Static395.aShortArray117 = Static395.aShortArray116 = new short[256];
		Static321.aClass31_4 = Static414.method5162(Static226.aCanvas9);
		Static210.aClass26_1 = Static175.method2290(Static226.aCanvas9);
		Static19.aClass103_1 = Static136.method1820();
		if (Static19.aClass103_1 != null) {
			Static19.aClass103_1.method2125(Static226.aCanvas9);
		}
		Static346.anInt5656 = Static191.anInt3047;
		try {
			if (Static41.aClass124_2.aClass220_1 != null) {
				Static402.aClass173_6 = new Class173(Static41.aClass124_2.aClass220_1, 5200, 0);
				for (@Pc(173) int local173 = 0; local173 < 30; local173++) {
					Static449.aClass173Array1[local173] = new Class173(Static41.aClass124_2.aClass220Array1[local173], 6000, 0);
				}
				Static40.aClass173_5 = new Class173(Static41.aClass124_2.aClass220_2, 6000, 0);
				Static171.aClass178_2 = new Class178(255, Static402.aClass173_6, Static40.aClass173_5, 500000);
				Static58.aClass173_2 = new Class173(Static41.aClass124_2.aClass220_3, 24, 0);
				Static41.aClass124_2.aClass220_3 = null;
				Static41.aClass124_2.aClass220_1 = null;
				Static41.aClass124_2.aClass220_2 = null;
				Static41.aClass124_2.aClass220Array1 = null;
			}
		} catch (@Pc(231) IOException local231) {
			Static58.aClass173_2 = null;
			Static402.aClass173_6 = null;
			Static171.aClass178_2 = null;
			Static40.aClass173_5 = null;
		}
		if (Static209.aClass166_6 != Static136.aClass166_3) {
			Static365.aBoolean510 = true;
		}
		Static436.aString67 = (Static455.aClass6_5 == Static357.aClass6_4 ? Static76.aClass151_48 : Static298.aClass151_152).method3122(Static188.anInt3028);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
	private void method806(@OriginalArg(0) byte[] arg0) {
		@Pc(17) Class1_Sub11 local17 = new Class1_Sub11(arg0);
		while (true) {
			@Pc(21) int local21;
			@Pc(43) int local43;
			@Pc(38) int local38;
			label45: do {
				while (true) {
					while (true) {
						local21 = local17.method4463();
						if (local21 == 0) {
							return;
						}
						if (local21 == 1) {
							@Pc(105) int[] local105 = Static431.anIntArray484 = new int[6];
							local105[0] = local17.method4485();
							local105[1] = local17.method4485();
							local105[2] = local17.method4485();
							local105[3] = local17.method4485();
							local105[4] = local17.method4485();
							local105[5] = local17.method4485();
						} else {
							if (local21 != 4) {
								continue label45;
							}
							local38 = local17.method4463();
							Static433.anIntArray485 = new int[local38];
							for (local43 = 0; local43 < local38; local43++) {
								Static433.anIntArray485[local43] = local17.method4485();
								if (Static433.anIntArray485[local43] == 65535) {
									Static433.anIntArray485[local43] = -1;
								}
							}
						}
					}
				}
			} while (local21 != 5);
			local38 = local17.method4463();
			Static292.anIntArray255 = new int[local38];
			for (local43 = 0; local43 < local38; local43++) {
				Static292.anIntArray255[local43] = local17.method4485();
				if (Static292.anIntArray255[local43] == 65535) {
					Static292.anIntArray255[local43] = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method807(@OriginalArg(0) int arg0) {
		Static104.aClass3_5 = null;
		Static316.aClass19_1.anInt473++;
		Static238.aClass215_7 = null;
		Static316.aClass19_1.anInt472 = arg0;
		Static347.anInt5658 = 0;
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method808() {
		Static239.anInt3853++;
		Static177.method2367(-1, -1, null);
		Static244.method3191(-1, -1, null);
		Static195.method2587();
		Static443.anInt6230++;
		for (@Pc(27) int local27 = 0; local27 < 32768; local27++) {
			@Pc(33) Class20_Sub3_Sub3_Sub2 local33 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local27];
			if (local33 != null) {
				@Pc(39) byte local39 = local33.aClass246_1.aByte93;
				if ((local39 & 0x1) != 0) {
					@Pc(49) int local49 = local33.method4678();
					@Pc(73) int local73;
					if ((local39 & 0x2) != 0 && local33.anInt6088 == 0 && Math.random() * 1000.0D < 10.0D) {
						local73 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(81) int local81 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local73 != 0 || local81 != 0) {
							@Pc(92) int local92 = local73 + local33.anIntArray370[0];
							@Pc(99) int local99 = local81 + local33.anIntArray369[0];
							if (local92 < 0) {
								local92 = 0;
							} else if (local92 > Static425.anInt6922 - local49 - 1) {
								local92 = Static425.anInt6922 - local49 - 1;
							}
							if (local99 < 0) {
								local99 = 0;
							} else if (local99 > Static251.anInt4072 - local49 - 1) {
								local99 = Static251.anInt4072 - local49 - 1;
							}
							@Pc(173) int local173 = Static358.method4643(-1, local33.anIntArray370[0], local92, 0, Static356.anIntArray349, local33.anIntArray369[0], local99, Static383.aClass247Array1[local33.aByte89], Static224.anIntArray195, true, local49, local49, 0, local49);
							if (local173 > 0) {
								if (local173 > 9) {
									local173 = 9;
								}
								for (@Pc(187) int local187 = 0; local187 < local173; local187++) {
									local33.anIntArray370[local187] = Static356.anIntArray349[local173 - local187 - 1];
									local33.anIntArray369[local187] = Static224.anIntArray195[local173 - local187 - 1];
									local33.aByteArray67[local187] = 1;
								}
								local33.anInt6088 = local173;
							}
						}
					}
					Static303.method3968(true, local33);
					local73 = Static385.method4922(local33);
					Static149.method5577(Static339.anInt5513, Static213.anInt3439, local33, local73);
					Static109.method1526(local33);
				}
			}
		}
		if (Static354.anInt5868 == 0 && Static48.anInt801 == 0) {
			if (Static100.anInt1781 == 2) {
				Static419.method5236();
			} else {
				Static297.method3890();
			}
			if (Static278.anInt4391 >> 7 < 14 || Static425.anInt6922 - 14 <= Static278.anInt4391 >> 7 || Static8.anInt7337 >> 7 < 14 || Static251.anInt4072 - 14 <= Static8.anInt7337 >> 7) {
				Static209.method2810();
			}
		}
		while (true) {
			@Pc(302) Class1_Sub31 local302;
			@Pc(307) Class250 local307;
			@Pc(318) Class250 local318;
			do {
				local302 = (Class1_Sub31) Static40.aClass254_37.method5436();
				if (local302 == null) {
					while (true) {
						do {
							local302 = (Class1_Sub31) Static275.aClass254_27.method5436();
							if (local302 == null) {
								while (true) {
									do {
										local302 = (Class1_Sub31) Static6.aClass254_1.method5436();
										if (local302 == null) {
											if (Static68.aClass250_2 != null) {
												Static287.method3734();
											}
											if (Static368.anInt6250 % 1500 == 0) {
												Static77.method1209();
											}
											Static49.method728();
											if (Static447.aBoolean604 && Static232.method3058() - 60000L > Static152.aLong81) {
												Static329.method4206();
												return;
											}
											return;
										}
										local307 = local302.aClass250_8;
										if (local307.anInt7038 < 0) {
											break;
										}
										local318 = Static96.method1379(local307.anInt7002);
									} while (local318 == null || local318.aClass250Array2 == null || local318.aClass250Array2.length <= local307.anInt7038 || local307 != local318.aClass250Array2[local307.anInt7038]);
									Static267.method3402(local302);
								}
							}
							local307 = local302.aClass250_8;
							if (local307.anInt7038 < 0) {
								break;
							}
							local318 = Static96.method1379(local307.anInt7002);
						} while (local318 == null || local318.aClass250Array2 == null || local307.anInt7038 >= local318.aClass250Array2.length || local318.aClass250Array2[local307.anInt7038] != local307);
						Static267.method3402(local302);
					}
				}
				local307 = local302.aClass250_8;
				if (local307.anInt7038 < 0) {
					break;
				}
				local318 = Static96.method1379(local307.anInt7002);
			} while (local318 == null || local318.aClass250Array2 == null || local318.aClass250Array2.length <= local307.anInt7038 || local318.aClass250Array2[local307.anInt7038] != local307);
			Static267.method3402(local302);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method778() {
		if (Static98.anInt1721 == 1000) {
			return;
		}
		@Pc(16) long local16 = Static432.method5428() / 1000000L - Static136.aLong72;
		Static136.aLong72 = Static432.method5428() / 1000000L;
		@Pc(24) boolean local24 = Static246.method3215();
		if (local24 && Static17.aBoolean28 && Static260.aClass77_5 != null) {
			Static260.aClass77_5.method4265();
		}
		if (Static98.anInt1721 == 30 || Static98.anInt1721 == 10) {
			if (Static409.aLong207 != 0L && Static232.method3058() > Static409.aLong207) {
				Static421.method5241(Static336.aClass106_Sub1_1.anInt5683, false, Static330.method4209(), Static336.aClass106_Sub1_1.anInt5700);
			} else if (!Static213.aClass128_22.method3588() && Static5.aBoolean14) {
				Static258.method3270();
			}
		}
		@Pc(85) int local85;
		if (Static70.aFrame1 == null) {
			@Pc(73) Container local73;
			if (Static158.aFrame2 == null) {
				local73 = Static41.aClass124_2.anApplet1;
			} else {
				local73 = Static158.aFrame2;
			}
			@Pc(81) int local81 = local73.getSize().width;
			local85 = local73.getSize().height;
			if (Static158.aFrame2 == local73) {
				@Pc(91) Insets local91 = Static158.aFrame2.getInsets();
				local85 -= local91.bottom + local91.top;
				local81 -= local91.right + local91.left;
			}
			if (local81 != Static320.anInt5295 || local85 != Static347.anInt5659) {
				if (Static213.aClass128_22 == null || Static213.aClass128_22.method3589()) {
					Static300.method3936();
				} else {
					Static320.anInt5295 = local81;
					Static347.anInt5659 = local85;
				}
				Static409.aLong207 = Static232.method3058() + 500L;
			}
		}
		if (Static70.aFrame1 != null && !Static323.aBoolean426 && (Static98.anInt1721 == 30 || Static98.anInt1721 == 10)) {
			Static421.method5241(-1, false, Static336.aClass106_Sub1_1.anInt5679, -1);
		}
		@Pc(150) boolean local150 = false;
		if (Static107.aBoolean140) {
			Static107.aBoolean140 = false;
			local150 = true;
		}
		if (local150) {
			Static356.method4573();
		}
		if (Static213.aClass128_22 != null && Static213.aClass128_22.method3588() || Static330.method4209() != 1) {
			Static183.method4174();
		}
		if (Static98.anInt1721 == 0) {
			Static365.method4743(Static18.aColorArray1[Static168.anInt2764], Static64.aColorArray2[Static168.anInt2764], Static76.aColorArray3[Static168.anInt2764], local150, Class106_Sub1.lb, Static388.anInt891);
		} else if (Static98.anInt1721 == 5) {
			Static319.method4117(Static227.aClass16_1, Static64.aColorArray2[Static168.anInt2764].getRGB(), Static18.aColorArray1[Static168.anInt2764].getRGB(), Static213.aClass128_22, Static76.aColorArray3[Static168.anInt2764].getRGB(), local150 | Static213.aClass128_22.method3588());
		} else if (Static98.anInt1721 == 10) {
			Static217.method2878();
		} else if (Static98.anInt1721 == 25 || Static98.anInt1721 == 28) {
			if (Static430.anInt7185 == 1) {
				if (Static61.anInt1095 > Static124.anInt2155) {
					Static124.anInt2155 = Static61.anInt1095;
				}
				local85 = (Static124.anInt2155 - Static61.anInt1095) * 50 / Static124.anInt2155;
				Static357.method4619(Static275.aClass16_2, Static81.aClass151_51.method3122(Static188.anInt3028) + "<br>(" + local85 + "%)", true);
			} else if (Static430.anInt7185 == 2) {
				if (Static74.anInt1415 > Static215.anInt3455) {
					Static215.anInt3455 = Static74.anInt1415;
				}
				local85 = (Static215.anInt3455 - Static74.anInt1415) * 50 / Static215.anInt3455 + 50;
				Static357.method4619(Static275.aClass16_2, Static81.aClass151_51.method3122(Static188.anInt3028) + "<br>(" + local85 + "%)", true);
			} else {
				Static357.method4619(Static275.aClass16_2, Static81.aClass151_51.method3122(Static188.anInt3028), true);
			}
		} else if (Static98.anInt1721 == 30) {
			Static350.method4428(local16);
		} else if (Static98.anInt1721 == 40) {
			Static357.method4619(Static275.aClass16_2, Static195.aClass151_104.method3122(Static188.anInt3028) + "<br>" + Static44.aClass151_26.method3122(Static188.anInt3028), true);
		}
		if (Static348.anInt5665 == 3) {
			for (local85 = 0; local85 < Static193.anInt7328; local85++) {
				@Pc(377) Rectangle local377 = Class138.aRectangleArray5[local85];
				if (Static219.aBooleanArray11[local85]) {
					Static213.aClass128_22.method3580(local377.y, local377.x, local377.height, -1996553985, local377.width);
				} else if (Static308.aBooleanArray24[local85]) {
					Static213.aClass128_22.method3580(local377.y, local377.x, local377.height, -1996554240, local377.width);
				}
			}
		}
		if (Static164.method2242()) {
			Static427.method5347(Static213.aClass128_22);
		}
		if ((Static98.anInt1721 == 30 || Static98.anInt1721 == 10) && Static348.anInt5665 == 0 && Static330.method4209() == 1 && !local150 && Static191.aString29.equals("1.1")) {
			local85 = 0;
			for (@Pc(446) int local446 = 0; local446 < Static193.anInt7328; local446++) {
				if (Static308.aBooleanArray24[local446]) {
					Static308.aBooleanArray24[local446] = false;
					Static39.aRectangleArray7[local85++] = Class138.aRectangleArray5[local446];
				}
			}
			Static213.aClass128_22.method3574(Static39.aRectangleArray7, local85);
		} else if (Static98.anInt1721 != 0) {
			Static213.aClass128_22.method3534();
			for (local85 = 0; local85 < Static193.anInt7328; local85++) {
				Static308.aBooleanArray24[local85] = false;
			}
		}
		if (Static336.aClass106_Sub1_1.anInt5688 == 0) {
			Static252.method2874(15L);
		} else if (Static336.aClass106_Sub1_1.anInt5688 == 1) {
			Static252.method2874(10L);
		} else if (Static336.aClass106_Sub1_1.anInt5688 == 2) {
			Static252.method2874(5L);
		} else if (Static336.aClass106_Sub1_1.anInt5688 == 3) {
			Static252.method2874(2L);
		}
		if (Static269.aBoolean336) {
			Static281.method3531();
		}
		if (Static336.aClass106_Sub1_1.aBoolean458 && Static98.anInt1721 == 10 && Static169.anInt2522 != -1) {
			Static336.aClass106_Sub1_1.aBoolean458 = false;
			Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method780()) {
			return;
		}
		Static273.anInt4336 = Integer.parseInt(this.getParameter("worldid"));
		Static136.aClass166_3 = Static295.method3875(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static25.method477(Static136.aClass166_3) && Static209.aClass166_6 != Static136.aClass166_3) {
			Static136.aClass166_3 = Static209.aClass166_6;
		}
		Static180.aClass44_2 = Static401.method2976(Integer.parseInt(this.getParameter("modewhat")));
		if (Static180.aClass44_2 != Static234.aClass44_4 && Static180.aClass44_2 != Static139.aClass44_1 && Static217.aClass44_3 != Static180.aClass44_2) {
			Static180.aClass44_2 = Static217.aClass44_3;
		}
		try {
			Static188.anInt3028 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(56) Exception local56) {
			Static188.anInt3028 = 0;
		}
		@Pc(62) String local62 = this.getParameter("objecttag");
		if (local62 != null && local62.equals("1")) {
			Static60.aBoolean90 = true;
		} else {
			Static60.aBoolean90 = false;
		}
		@Pc(78) String local78 = this.getParameter("js");
		if (local78 != null && local78.equals("1")) {
			Static290.aBoolean384 = true;
		} else {
			Static290.aBoolean384 = false;
		}
		@Pc(94) String local94 = this.getParameter("advert");
		if (local94 != null && local94.equals("1")) {
			Static76.aBoolean113 = true;
		} else {
			Static76.aBoolean113 = false;
		}
		@Pc(110) String local110 = this.getParameter("game");
		if (local110 != null && local110.equals("1")) {
			Static357.aClass6_4 = Static43.aClass6_3;
		} else {
			Static357.aClass6_4 = Static455.aClass6_5;
		}
		try {
			Static28.anInt564 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(129) Exception local129) {
			Static28.anInt564 = 0;
		}
		Static206.aString35 = this.getParameter("quiturl");
		Static116.aString52 = this.getParameter("settings");
		if (Static116.aString52 == null) {
			Static116.aString52 = "";
		}
		@Pc(147) String local147 = this.getParameter("country");
		if (local147 != null) {
			try {
				Static160.anInt6707 = Integer.parseInt(local147);
			} catch (@Pc(154) Exception local154) {
				Static160.anInt6707 = 0;
			}
		}
		Static168.anInt2764 = Integer.parseInt(this.getParameter("colourid"));
		if (Static168.anInt2764 < 0 || Static168.anInt2764 >= Static76.aColorArray3.length) {
			Static168.anInt2764 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static21.aBoolean34 = true;
			Static164.aBoolean215 = true;
		}
		Static389.aClient4 = this;
		if (Static455.aClass6_5 == Static357.aClass6_4) {
			Static96.anInt1679 = 503;
			Static110.anInt1939 = 765;
		} else if (Static357.aClass6_4 == Static43.aClass6_3) {
			Static96.anInt1679 = 480;
			Static110.anInt1939 = 640;
		}
		this.method794(Static110.anInt1939, Static180.aClass44_2.method951() + 32, Static96.anInt1679);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method813() {
		if (Static316.aClass19_1.anInt473 > Static65.anInt1147) {
			if (Static131.anInt2260 == Static182.anInt2943) {
				Static131.anInt2260 = Static91.anInt1613;
			} else {
				Static131.anInt2260 = Static182.anInt2943;
			}
			Static115.anInt2018 = (Static316.aClass19_1.anInt473 * 50 - 50) * 5;
			if (Static115.anInt2018 > 3000) {
				Static115.anInt2018 = 3000;
			}
			if (Static316.aClass19_1.anInt473 >= 2 && Static316.aClass19_1.anInt472 == 6) {
				this.method795("js5connect_outofdate");
				Static98.anInt1721 = 1000;
				return;
			}
			if (Static316.aClass19_1.anInt473 >= 4 && Static316.aClass19_1.anInt472 == -1) {
				this.method795("js5crc");
				Static98.anInt1721 = 1000;
				return;
			}
			if (Static316.aClass19_1.anInt473 >= 4 && (Static98.anInt1721 == 0 || Static98.anInt1721 == 5)) {
				if (Static316.aClass19_1.anInt472 == 7 || Static316.aClass19_1.anInt472 == 9) {
					this.method795("js5connect_full");
				} else if (Static316.aClass19_1.anInt472 <= 0) {
					this.method795("js5io");
				} else {
					this.method795("js5connect");
				}
				Static98.anInt1721 = 1000;
				return;
			}
		}
		Static65.anInt1147 = Static316.aClass19_1.anInt473;
		if (Static115.anInt2018 > 0) {
			Static115.anInt2018--;
			return;
		}
		try {
			if (Static347.anInt5658 == 0) {
				Static238.aClass215_7 = Static41.aClass124_2.method2532(Static270.aString42, Static131.anInt2260);
				Static347.anInt5658++;
			}
			if (Static347.anInt5658 == 1) {
				if (Static238.aClass215_7.anInt5791 == 2) {
					this.method807(1000);
					return;
				}
				if (Static238.aClass215_7.anInt5791 == 1) {
					Static347.anInt5658++;
				}
			}
			if (Static347.anInt5658 == 2) {
				Static104.aClass3_5 = new Class3((Socket) Static238.aClass215_7.anObject10, Static41.aClass124_2);
				@Pc(180) Class1_Sub11 local180 = new Class1_Sub11(5);
				local180.method4445(Static335.aClass62_2.anInt1569);
				local180.method4450(589);
				Static104.aClass3_5.method62(5, local180.aByteArray64);
				Static347.anInt5658++;
				Static415.aLong54 = Static232.method3058();
			}
			if (Static347.anInt5658 == 3) {
				if (Static98.anInt1721 == 0 || Static98.anInt1721 == 5 || Static104.aClass3_5.method61() > 0) {
					@Pc(235) int local235 = Static104.aClass3_5.method57();
					if (local235 != 0) {
						this.method807(local235);
						return;
					}
					Static347.anInt5658++;
				} else if (Static232.method3058() - Static415.aLong54 > 30000L) {
					this.method807(1001);
					return;
				}
			}
			if (Static347.anInt5658 == 4) {
				@Pc(269) boolean local269 = Static98.anInt1721 == 5 || Static98.anInt1721 == 10 || Static98.anInt1721 == 28;
				Static316.aClass19_1.method410(Static104.aClass3_5, !local269);
				Static238.aClass215_7 = null;
				Static104.aClass3_5 = null;
				Static347.anInt5658 = 0;
			}
		} catch (@Pc(286) IOException local286) {
			this.method807(1002);
		}
	}
}
