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
				Static161.method5536("argument count");
			}
			Static440.anInt7216 = Integer.parseInt(arg0[0]);
			Static53.aClass56_2 = Static123.aClass56_4;
			if (arg0[1].equals("live")) {
				Static198.aClass258_5 = Static76.aClass258_1;
			} else if (arg0[1].equals("rc")) {
				Static198.aClass258_5 = Static341.aClass258_3;
			} else if (arg0[1].equals("wip")) {
				Static198.aClass258_5 = Static146.aClass258_4;
			} else {
				Static161.method5536("modewhat");
			}
			Static388.anInt6533 = Static51.method858(arg0[2]);
			if (Static388.anInt6533 == -1) {
				if (arg0[2].equals("english")) {
					Static388.anInt6533 = 0;
				} else if (arg0[2].equals("german")) {
					Static388.anInt6533 = 1;
				} else {
					Static161.method5536("language");
				}
			}
			Static92.aBoolean239 = false;
			Static362.aBoolean434 = false;
			if (arg0[3].equals("game0")) {
				Static320.aClass10_28 = Static199.aClass10_22;
			} else if (arg0[3].equals("game1")) {
				Static320.aClass10_28 = Static423.aClass10_43;
			} else {
				Static161.method5536("game");
			}
			Static219.aBoolean307 = true;
			Static192.aBoolean280 = true;
			Static92.aString37 = "";
			Static359.anInt6109 = 0;
			Static223.anInt4338 = Static320.aClass10_28.anInt259;
			Static352.anInt5971 = 0;
			@Pc(128) client local128 = new client();
			Static148.aClient1 = local128;
			local128.method772(Static320.aClass10_28.aString1, Static198.aClass258_5.method5675() + 32);
			Static149.aFrame4.setLocation(40, 40);
		} catch (@Pc(151) Exception local151) {
			Static361.method4904(local151, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method778() {
		@Pc(6) int local6;
		if (!Static12.aClass79_Sub1_1.aBoolean353) {
			for (local6 = 0; local6 < Static222.anInt4305; local6++) {
				if (Static23.aClass141Array1[local6].method4290() == 's' || Static23.aClass141Array1[local6].method4290() == 'S') {
					Static12.aClass79_Sub1_1.aBoolean353 = true;
					break;
				}
			}
		}
		@Pc(55) int local55;
		if (Static436.anInt7184 == 0) {
			@Pc(45) Runtime local45 = Runtime.getRuntime();
			local55 = (int) ((local45.totalMemory() - local45.freeMemory()) / 1024L);
			@Pc(58) long local58 = Static21.method458();
			if (Static148.aLong93 == 0L) {
				Static148.aLong93 = local58;
			}
			if (local55 > 16384 && local58 - Static148.aLong93 < 5000L) {
				if (local58 - Static390.aLong195 > 1000L) {
					System.gc();
					Static390.aLong195 = local58;
				}
				Static137.aString35 = Static215.aClass209_94.method4562(Static388.anInt6533);
				Static209.anInt4079 = 5;
			} else {
				Static137.aString35 = Static60.aClass209_33.method4562(Static388.anInt6533);
				Static436.anInt7184 = 10;
				Static209.anInt4079 = 5;
			}
		} else if (Static436.anInt7184 == 10) {
			for (local6 = 0; local6 < 4; local6++) {
				Static194.aClass70Array1[local6] = Static192.method3010(Static229.anInt4427, Static379.anInt6422);
			}
			Static137.aString35 = Static94.aClass209_49.method4562(Static388.anInt6533);
			Static436.anInt7184 = 20;
			Static209.anInt4079 = 10;
		} else if (Static436.anInt7184 == 20) {
			if (Static292.aClass27_1 == null) {
				Static292.aClass27_1 = new Class27(Static102.aClass243_2, Static160.aClass30_4);
			}
			if (Static292.aClass27_1.method526()) {
				Static438.aClass160_89 = Static322.method4520(false, true, 0);
				Static441.aClass160_4 = Static322.method4520(false, true, 1);
				Static49.aClass160_6 = Static322.method4520(false, true, 2);
				Static191.aClass160_35 = Static322.method4520(false, true, 3);
				Static285.aClass160_58 = Static322.method4520(false, true, 4);
				Static368.aClass160_73 = Static322.method4520(true, true, 5);
				Static186.aClass160_34 = Static322.method4520(true, false, 6);
				Static307.aClass160_60 = Static322.method4520(false, true, 7);
				Static153.aClass160_25 = Static322.method4520(false, true, 8);
				Static394.aClass160_74 = Static322.method4520(false, true, 9);
				Static180.aClass160_30 = Static322.method4520(false, true, 10);
				Static223.aClass160_42 = Static322.method4520(false, true, 11);
				Static424.aClass160_81 = Static322.method4520(false, true, 12);
				Static410.aClass160_77 = Static322.method4520(false, true, 13);
				Static167.aClass160_28 = Static322.method4520(false, false, 14);
				Static453.aClass160_92 = Static322.method4520(false, true, 15);
				Static331.aClass160_65 = Static322.method4520(false, true, 16);
				Static395.aClass160_76 = Static322.method4520(false, true, 17);
				Static234.aClass160_47 = Static322.method4520(false, true, 18);
				Static138.aClass160_20 = Static322.method4520(false, true, 19);
				Static217.aClass160_40 = Static322.method4520(false, true, 20);
				Static146.aClass160_23 = Static322.method4520(false, true, 21);
				Static353.aClass160_68 = Static322.method4520(false, true, 22);
				Static323.aClass160_64 = Static322.method4520(true, true, 23);
				Static282.aClass160_57 = Static322.method4520(false, true, 24);
				Static287.aClass160_59 = Static322.method4520(false, true, 25);
				Static355.aClass160_69 = Static322.method4520(true, true, 26);
				Static183.aClass160_32 = Static322.method4520(false, true, 27);
				Static146.aClass160_24 = Static322.method4520(true, true, 28);
				Static128.aClass160_19 = Static322.method4520(false, true, 29);
				Static137.aString35 = Static82.aClass209_43.method4562(Static388.anInt6533);
				Static436.anInt7184 = 30;
				Static209.anInt4079 = 15;
			} else {
				Static137.aString35 = Static10.aClass209_8.method4562(Static388.anInt6533);
				Static209.anInt4079 = 12;
			}
		} else if (Static436.anInt7184 == 30) {
			local6 = 0;
			for (local55 = 0; local55 < 30; local55++) {
				local6 += Static318.aClass94_Sub1Array6[local55].method2189() * Static313.anIntArray450[local55] / 100;
			}
			if (local6 == 100) {
				Static137.aString35 = Static423.aClass209_166.method4562(Static388.anInt6533);
				Static209.anInt4079 = 20;
				Static228.method3577(Static153.aClass160_25);
				Static4.method144(Static153.aClass160_25);
				Static436.anInt7184 = 40;
			} else {
				if (local6 != 0) {
					Static137.aString35 = Static157.aClass209_68.method4562(Static388.anInt6533) + local6 + "%";
				}
				Static209.anInt4079 = 20;
			}
		} else if (Static436.anInt7184 == 40) {
			if (Static146.aClass160_24.method3706()) {
				this.method794(Static146.aClass160_24.method3711(1));
				Static137.aString35 = Static330.aClass209_129.method4562(Static388.anInt6533);
				Static209.anInt4079 = 25;
				Static436.anInt7184 = 50;
			} else {
				Static137.aString35 = Static408.aClass209_153.method4562(Static388.anInt6533) + Static146.aClass160_24.method3700() + "%";
				Static209.anInt4079 = 25;
			}
		} else if (Static436.anInt7184 == 50) {
			Static80.method5644();
			Static137.aString35 = Static336.aClass209_132.method4562(Static388.anInt6533);
			Static436.anInt7184 = 60;
			Static209.anInt4079 = 30;
		} else if (Static436.anInt7184 == 60) {
			local6 = Static267.method5788(Static410.aClass160_77, Static153.aClass160_25);
			local55 = Static16.method320();
			if (local6 < local55) {
				Static137.aString35 = Static24.aClass209_114.method4562(Static388.anInt6533) + local6 * 100 / local55 + "%";
				Static209.anInt4079 = 35;
			} else {
				Static137.aString35 = Static82.aClass209_44.method4562(Static388.anInt6533);
				Static436.anInt7184 = 70;
				Static209.anInt4079 = 35;
			}
		} else if (Static436.anInt7184 == 70) {
			local6 = Static271.method4023(Static153.aClass160_25);
			local55 = Static15.method313();
			if (local6 < local55) {
				Static137.aString35 = Static300.aClass209_123.method4562(Static388.anInt6533) + local6 * 100 / local55 + "%";
				Static209.anInt4079 = 40;
			} else {
				Static137.aString35 = Static221.aClass209_97.method4562(Static388.anInt6533);
				Static209.anInt4079 = 40;
				Static436.anInt7184 = 80;
			}
		} else if (Static436.anInt7184 == 80) {
			if (Static355.aClass160_69.method3706()) {
				Static427.anInterface4_8 = new Class164(Static355.aClass160_69, Static394.aClass160_74, Static153.aClass160_25);
				Static137.aString35 = Static258.aClass209_18.method4562(Static388.anInt6533);
				Static436.anInt7184 = 90;
				Static209.anInt4079 = 45;
			} else {
				Static137.aString35 = Static145.aClass209_67.method4562(Static388.anInt6533) + Static355.aClass160_69.method3700() + "%";
				Static209.anInt4079 = 45;
			}
		} else if (Static436.anInt7184 == 90) {
			Static137.aString35 = Static402.aClass209_150.method4562(Static388.anInt6533);
			Static209.anInt4079 = 50;
			Static436.anInt7184 = 95;
		} else if (Static436.anInt7184 == 95) {
			if (Static12.aClass79_Sub1_1.aBoolean353) {
				Static12.aClass79_Sub1_1.anInt4927 = 0;
				Static12.aClass79_Sub1_1.anInt4926 = 0;
				Static12.aClass79_Sub1_1.anInt4929 = 0;
				Static12.aClass79_Sub1_1.anInt4917 = 1;
				Static12.aClass79_Sub1_1.anInt4930 = 0;
			}
			Static12.aClass79_Sub1_1.aBoolean353 = true;
			Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
			Static260.method3912(false, Static12.aClass79_Sub1_1.anInt4926);
			Static137.aString35 = Static340.aClass209_134.method4562(Static388.anInt6533);
			Static209.anInt4079 = 55;
			Static436.anInt7184 = 100;
		} else if (Static436.anInt7184 == 100) {
			Static173.method2818(Static153.aClass160_25, Static33.aClass49_1, Static410.aClass160_77);
			Static137.aString35 = Static41.aClass209_23.method4562(Static388.anInt6533);
			Static209.anInt4079 = 60;
			Static365.method4986(5);
			Static436.anInt7184 = 110;
		} else if (Static436.anInt7184 == 110) {
			Static49.aClass160_6.method3706();
			local6 = Static49.aClass160_6.method3700();
			Static331.aClass160_65.method3706();
			local6 += Static331.aClass160_65.method3700();
			Static395.aClass160_76.method3706();
			local6 += Static395.aClass160_76.method3700();
			Static234.aClass160_47.method3706();
			local6 += Static234.aClass160_47.method3700();
			Static138.aClass160_20.method3706();
			local6 += Static138.aClass160_20.method3700();
			Static217.aClass160_40.method3706();
			local6 += Static217.aClass160_40.method3700();
			Static146.aClass160_23.method3706();
			local6 += Static146.aClass160_23.method3700();
			Static353.aClass160_68.method3706();
			local6 += Static353.aClass160_68.method3700();
			Static282.aClass160_57.method3706();
			local6 += Static282.aClass160_57.method3700();
			Static287.aClass160_59.method3706();
			local6 += Static287.aClass160_59.method3700();
			Static183.aClass160_32.method3706();
			local6 += Static183.aClass160_32.method3700();
			Static128.aClass160_19.method3706();
			local6 += Static128.aClass160_19.method3700();
			if (local6 < 1200) {
				Static137.aString35 = Static332.aClass209_131.method4562(Static388.anInt6533) + local6 / 12 + "%";
				Static209.anInt4079 = 65;
			} else {
				Static186.aClass161_1 = new Class161(Static320.aClass10_28, Static388.anInt6533, Static49.aClass160_6);
				Static262.aClass51_3 = new Class51(Static320.aClass10_28, Static388.anInt6533, Static49.aClass160_6);
				Static254.aClass263_1 = new Class263(Static320.aClass10_28, Static388.anInt6533, Static49.aClass160_6, Static153.aClass160_25);
				Static390.aClass125_1 = new Class125(Static320.aClass10_28, Static388.anInt6533, Static395.aClass160_76);
				Static31.aClass148_3 = new Class148(Static320.aClass10_28, Static388.anInt6533, Static49.aClass160_6);
				Static44.aClass47_2 = new Class47(Static320.aClass10_28, Static388.anInt6533, Static49.aClass160_6);
				Static356.aClass259_2 = new Class259(Static320.aClass10_28, Static388.anInt6533, Static49.aClass160_6, Static307.aClass160_60);
				Static378.aClass172_1 = new Class172(Static320.aClass10_28, Static388.anInt6533, Static49.aClass160_6);
				Static418.aClass86_1 = new Class86(Static320.aClass10_28, Static388.anInt6533, Static49.aClass160_6);
				Static118.aClass165_2 = new Class165(Static320.aClass10_28, Static388.anInt6533, true, Static331.aClass160_65, Static307.aClass160_60);
				Static357.aClass215_4 = new Class215(Static320.aClass10_28, Static388.anInt6533, Static49.aClass160_6, Static153.aClass160_25);
				Static258.aClass120_4 = new Class120(Static320.aClass10_28, Static388.anInt6533, Static49.aClass160_6, Static153.aClass160_25);
				Static219.aClass76_2 = new Class76(Static320.aClass10_28, Static388.anInt6533, true, Static234.aClass160_47, Static307.aClass160_60);
				Static318.aClass144_6 = new Class144(Static320.aClass10_28, Static388.anInt6533, true, Static186.aClass161_1, Static138.aClass160_20, Static307.aClass160_60);
				Static250.aClass78_1 = new Class78(Static320.aClass10_28, Static388.anInt6533, Static49.aClass160_6);
				Static338.aClass12_2 = new Class12(Static320.aClass10_28, Static388.anInt6533, Static217.aClass160_40, Static438.aClass160_89, Static441.aClass160_4);
				Static154.aClass252_1 = new Class252(Static320.aClass10_28, Static388.anInt6533, Static49.aClass160_6);
				Static318.aClass131_5 = new Class131(Static320.aClass10_28, Static388.anInt6533, Static49.aClass160_6);
				Static395.aClass247_2 = new Class247(Static320.aClass10_28, Static388.anInt6533, Static146.aClass160_23, Static307.aClass160_60);
				Static40.aClass84_1 = new Class84(Static320.aClass10_28, Static388.anInt6533, Static49.aClass160_6);
				Static8.aClass167_1 = new Class167(Static320.aClass10_28, Static388.anInt6533, Static49.aClass160_6);
				Static215.aClass128_1 = new Class128(Static320.aClass10_28, Static388.anInt6533, Static49.aClass160_6);
				Static166.aClass6_1 = new Class6(Static320.aClass10_28, Static388.anInt6533, Static353.aClass160_68);
				Static191.aClass151_1 = new Class151(Static320.aClass10_28, Static388.anInt6533, Static49.aClass160_6);
				Static221.method3468(Static307.aClass160_60, Static191.aClass160_35, Static153.aClass160_25, Static410.aClass160_77);
				Static380.method5088(Static128.aClass160_19);
				Static322.aClass257_1 = new Class257(Static388.anInt6533, Static282.aClass160_57, Static287.aClass160_59);
				Static181.aClass71_1 = new Class71(Static388.anInt6533, Static282.aClass160_57, Static287.aClass160_59, new Class80());
				Static137.aString35 = Static176.aClass209_7.method4562(Static388.anInt6533);
				Static209.anInt4079 = 65;
				Static31.method544();
				Static118.aClass165_2.method3806(!Static12.aClass79_Sub1_1.method3966(Static399.anInt6653));
				Static344.aClass108_1 = new Class108();
				Static185.method2952();
				Static380.method5087(Static183.aClass160_32);
				Static121.method2118(Static427.anInterface4_8, Static307.aClass160_60);
				Static436.anInt7184 = 120;
			}
		} else if (Static436.anInt7184 == 120) {
			local6 = Static298.method4282(Static153.aClass160_25);
			local55 = Static6.method194();
			if (local6 < local55) {
				Static137.aString35 = Static38.aClass209_145.method4562(Static388.anInt6533) + local6 * 100 / local55 + "%";
				Static209.anInt4079 = 70;
			} else {
				Static381.method4980(Static153.aClass160_25, Static33.aClass49_1);
				Static254.method3857(Static279.aClass17Array12);
				Static137.aString35 = Static247.aClass209_104.method4562(Static388.anInt6533);
				Static436.anInt7184 = 130;
				Static209.anInt4079 = 70;
			}
		} else if (Static436.anInt7184 == 130) {
			if (Static180.aClass160_30.method3703("huffman", "")) {
				@Pc(1215) Class157 local1215 = new Class157(Static180.aClass160_30.method3721("huffman", ""));
				Static376.method5064(local1215);
				Static137.aString35 = Static164.aClass209_72.method4562(Static388.anInt6533);
				Static209.anInt4079 = 75;
				Static436.anInt7184 = 140;
			} else {
				Static137.aString35 = Static171.aClass209_74.method4562(Static388.anInt6533) + "0%";
				Static209.anInt4079 = 75;
			}
		} else if (Static436.anInt7184 == 140) {
			if (Static191.aClass160_35.method3706()) {
				Static137.aString35 = Static52.aClass209_26.method4562(Static388.anInt6533);
				Static436.anInt7184 = 150;
				Static209.anInt4079 = 80;
			} else {
				Static137.aString35 = Static201.aClass209_81.method4562(Static388.anInt6533) + Static191.aClass160_35.method3700() + "%";
				Static209.anInt4079 = 80;
			}
		} else if (Static436.anInt7184 == 150) {
			if (Static424.aClass160_81.method3706()) {
				Static137.aString35 = Static295.aClass209_119.method4562(Static388.anInt6533);
				Static209.anInt4079 = 82;
				Static436.anInt7184 = 160;
			} else {
				Static137.aString35 = Static94.aClass209_50.method4562(Static388.anInt6533) + Static424.aClass160_81.method3700() + "%";
				Static209.anInt4079 = 82;
			}
		} else if (Static436.anInt7184 == 160) {
			if (Static410.aClass160_77.method3706()) {
				Static137.aString35 = Static98.aClass209_51.method4562(Static388.anInt6533);
				Static209.anInt4079 = 85;
				Static436.anInt7184 = 170;
			} else {
				Static137.aString35 = Static98.aClass209_51.method4562(Static388.anInt6533) + Static410.aClass160_77.method3700() + "%";
				Static209.anInt4079 = 85;
			}
		} else if (Static436.anInt7184 == 170) {
			if (Static323.aClass160_64.method3709("details")) {
				Static88.method3655(Static323.aClass160_64, Static31.aClass148_3, Static44.aClass47_2, Static118.aClass165_2, Static357.aClass215_4, Static258.aClass120_4, Static344.aClass108_1);
				Static137.aString35 = Static425.aClass209_159.method4562(Static388.anInt6533);
				Static209.anInt4079 = 89;
				Static436.anInt7184 = 180;
			} else {
				Static137.aString35 = Static19.aClass209_118.method4562(Static388.anInt6533) + Static323.aClass160_64.method3705("details") + "%";
				Static209.anInt4079 = 87;
			}
		} else if (Static436.anInt7184 == 180) {
			local6 = Static117.method2083();
			if (local6 == -1) {
				Static137.aString35 = Static366.aClass209_143.method4562(Static388.anInt6533);
				Static209.anInt4079 = 90;
			} else if (local6 == 7 || local6 == 9) {
				this.method768("worldlistfull");
				Static365.method4986(1000);
			} else if (Static230.aBoolean325) {
				Static137.aString35 = Static66.aClass209_5.method4562(Static388.anInt6533);
				Static436.anInt7184 = 190;
				Static209.anInt4079 = 90;
			} else {
				this.method768("worldlistio_" + local6);
				Static365.method4986(1000);
			}
		} else if (Static436.anInt7184 == 190) {
			Static109.aStringArray34 = new String[Static8.aClass167_1.anInt4751];
			Static70.aBooleanArray9 = new boolean[Static215.aClass128_1.anInt3521];
			Static19.anIntArray426 = new int[Static215.aClass128_1.anInt3521];
			for (local6 = 0; local6 < Static215.aClass128_1.anInt3521; local6++) {
				if (Static215.aClass128_1.method2886(local6).anInt5061 == 0) {
					Static70.aBooleanArray9[local6] = true;
					Static421.anInt7073++;
				}
				Static19.anIntArray426[local6] = -1;
			}
			Static84.method1683();
			Static275.anInt5051 = Static191.aClass160_35.method3704("loginscreen");
			Static368.aClass160_73.method3718(false);
			Static186.aClass160_34.method3718(true);
			Static153.aClass160_25.method3718(true);
			Static410.aClass160_77.method3718(true);
			Static180.aClass160_30.method3718(true);
			Static191.aClass160_35.method3718(true);
			Static49.aClass160_6.anInt4623 = 2;
			Static275.aBoolean377 = true;
			Static395.aClass160_76.anInt4623 = 2;
			Static331.aClass160_65.anInt4623 = 2;
			Static234.aClass160_47.anInt4623 = 2;
			Static138.aClass160_20.anInt4623 = 2;
			Static217.aClass160_40.anInt4623 = 2;
			Static146.aClass160_23.anInt4623 = 2;
			Static243.method3738(-1, -1, false, Static12.aClass79_Sub1_1.anInt4917);
			Static137.aString35 = Static454.aClass209_167.method4562(Static388.anInt6533);
			Static209.anInt4079 = 95;
			Static436.anInt7184 = 200;
		} else if (Static436.anInt7184 == 200) {
			Static258.method584(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method775()) {
			return;
		}
		Static440.anInt7216 = Integer.parseInt(this.getParameter("worldid"));
		Static53.aClass56_2 = Static173.method2821(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static44.method695(Static53.aClass56_2) && Static23.aClass56_1 != Static53.aClass56_2) {
			Static53.aClass56_2 = Static23.aClass56_1;
		}
		Static198.aClass258_5 = Static413.method5433(Integer.parseInt(this.getParameter("modewhat")));
		if (Static198.aClass258_5 != Static146.aClass258_4 && Static341.aClass258_3 != Static198.aClass258_5 && Static198.aClass258_5 != Static76.aClass258_1) {
			Static198.aClass258_5 = Static76.aClass258_1;
		}
		try {
			Static388.anInt6533 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(56) Exception local56) {
			Static388.anInt6533 = 0;
		}
		@Pc(62) String local62 = this.getParameter("objecttag");
		if (local62 != null && local62.equals("1")) {
			Static362.aBoolean434 = true;
		} else {
			Static362.aBoolean434 = false;
		}
		@Pc(78) String local78 = this.getParameter("js");
		if (local78 != null && local78.equals("1")) {
			Static92.aBoolean239 = true;
		} else {
			Static92.aBoolean239 = false;
		}
		@Pc(94) String local94 = this.getParameter("advert");
		if (local94 != null && local94.equals("1")) {
			Static30.aBoolean33 = true;
		} else {
			Static30.aBoolean33 = false;
		}
		@Pc(110) String local110 = this.getParameter("game");
		if (local110 != null && local110.equals("1")) {
			Static320.aClass10_28 = Static423.aClass10_43;
		} else {
			Static320.aClass10_28 = Static199.aClass10_22;
		}
		try {
			Static352.anInt5971 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(129) Exception local129) {
			Static352.anInt5971 = 0;
		}
		Static408.aString61 = this.getParameter("quiturl");
		Static92.aString37 = this.getParameter("settings");
		if (Static92.aString37 == null) {
			Static92.aString37 = "";
		}
		@Pc(147) String local147 = this.getParameter("country");
		if (local147 != null) {
			try {
				Static359.anInt6109 = Integer.parseInt(local147);
			} catch (@Pc(154) Exception local154) {
				Static359.anInt6109 = 0;
			}
		}
		Static223.anInt4338 = Integer.parseInt(this.getParameter("colourid"));
		if (Static223.anInt4338 < 0 || Static223.anInt4338 >= Static176.aColorArray2.length) {
			Static223.anInt4338 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static219.aBoolean307 = true;
			Static192.aBoolean280 = true;
		}
		Static148.aClient1 = this;
		if (Static199.aClass10_22 == Static320.aClass10_28) {
			Static41.anInt771 = 503;
			Static361.anInt6116 = 765;
		} else if (Static423.aClass10_43 == Static320.aClass10_28) {
			Static361.anInt6116 = 640;
			Static41.anInt771 = 480;
		}
		this.method762(Static198.aClass258_5.method5675() + 32, Static361.anInt6116, Static41.anInt771);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	protected void method777() {
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method783(@OriginalArg(1) int arg0) {
		Static102.aClass243_2.anInt6617++;
		Static199.anInt3821 = 0;
		Static246.aClass138_7 = null;
		Static4.aClass34_1 = null;
		Static102.aClass243_2.anInt6618 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	protected void method774() {
		if (Static162.anInt3250 == 1000) {
			return;
		}
		@Pc(16) long local16 = Static144.method2413() / 1000000L - Static226.aLong90;
		Static226.aLong90 = Static144.method2413() / 1000000L;
		@Pc(24) boolean local24 = Static180.method2884();
		if (local24 && Static144.aBoolean238 && Static366.aClass18_2 != null) {
			Static366.aClass18_2.method5645();
		}
		if (Static162.anInt3250 == 30 || Static162.anInt3250 == 10) {
			if (Static253.aLong129 != 0L && Static253.aLong129 < Static21.method458()) {
				Static243.method3738(Static12.aClass79_Sub1_1.anInt4916, Static12.aClass79_Sub1_1.anInt4914, false, Static359.method4899());
			} else if (!Static33.aClass49_1.method4444() && Static432.aBoolean475) {
				Static85.method1696();
			}
		}
		@Pc(87) int local87;
		@Pc(91) int local91;
		if (Static150.aFrame5 == null) {
			@Pc(79) Container local79;
			if (Static149.aFrame4 == null) {
				local79 = Static43.aClass59_5.anApplet1;
			} else {
				local79 = Static149.aFrame4;
			}
			local87 = local79.getSize().width;
			local91 = local79.getSize().height;
			if (Static149.aFrame4 == local79) {
				@Pc(97) Insets local97 = Static149.aFrame4.getInsets();
				local87 -= local97.right + local97.left;
				local91 -= local97.bottom + local97.top;
			}
			if (Static15.anInt349 != local87 || Static6.anInt215 != local91) {
				if (Static33.aClass49_1 == null || Static33.aClass49_1.method4458()) {
					Static328.method4556();
				} else {
					Static15.anInt349 = local87;
					Static6.anInt215 = local91;
				}
				Static253.aLong129 = Static21.method458() + 500L;
			}
		}
		if (Static150.aFrame5 != null && !Static8.aBoolean8 && (Static162.anInt3250 == 30 || Static162.anInt3250 == 10)) {
			Static243.method3738(-1, -1, false, Static12.aClass79_Sub1_1.anInt4917);
		}
		@Pc(164) boolean local164 = false;
		if (Static404.aBoolean456) {
			Static404.aBoolean456 = false;
			local164 = true;
		}
		if (local164) {
			Static137.method2320();
		}
		if (Static33.aClass49_1 != null && Static33.aClass49_1.method4444() || Static359.method4899() != 1) {
			Static260.method3927();
		}
		if (Static162.anInt3250 == 0) {
			Static44.method694(Static176.aColorArray2[Static223.anInt4338], Static33.aColorArray3[Static223.anInt4338], Static209.anInt4079, Static124.aColorArray12[Static223.anInt4338], Static137.aString35, local164);
		} else if (Static162.anInt3250 == 5) {
			Static282.method4105(Static176.aColorArray2[Static223.anInt4338].getRGB(), local164 | Static33.aClass49_1.method4444(), Static114.aClass116_1, Static124.aColorArray12[Static223.anInt4338].getRGB(), Static33.aClass49_1, Static33.aColorArray3[Static223.anInt4338].getRGB());
		} else if (Static162.anInt3250 == 10) {
			Static348.method3783();
		} else if (Static162.anInt3250 == 25 || Static162.anInt3250 == 28) {
			if (Static416.anInt6986 == 1) {
				if (Static296.anInt5296 < Static139.anInt2953) {
					Static296.anInt5296 = Static139.anInt2953;
				}
				local87 = (Static296.anInt5296 - Static139.anInt2953) * 50 / Static296.anInt5296;
				Static452.method5851(Static368.aClass116_4, true, Static99.aClass209_54.method4562(Static388.anInt6533) + "<br>(" + local87 + "%)");
			} else if (Static416.anInt6986 == 2) {
				if (Static11.anInt282 > Static18.anInt7350) {
					Static18.anInt7350 = Static11.anInt282;
				}
				local87 = (Static18.anInt7350 - Static11.anInt282) * 50 / Static18.anInt7350 + 50;
				Static452.method5851(Static368.aClass116_4, true, Static99.aClass209_54.method4562(Static388.anInt6533) + "<br>(" + local87 + "%)");
			} else {
				Static452.method5851(Static368.aClass116_4, true, Static99.aClass209_54.method4562(Static388.anInt6533));
			}
		} else if (Static162.anInt3250 == 30) {
			Static141.method2385(local16);
		} else if (Static162.anInt3250 == 40) {
			Static452.method5851(Static368.aClass116_4, true, Static93.aClass209_48.method4562(Static388.anInt6533) + "<br>" + Static174.aClass209_78.method4562(Static388.anInt6533));
		}
		if (Static270.anInt5006 == 3) {
			for (local87 = 0; local87 < Static104.anInt2441; local87++) {
				@Pc(402) Rectangle local402 = Class200.aRectangleArray3[local87];
				if (Static345.aBooleanArray21[local87]) {
					Static33.aClass49_1.method4480(local402.x, local402.width, -1996553985, local402.y, local402.height);
				} else if (Static367.aBooleanArray23[local87]) {
					Static33.aClass49_1.method4480(local402.x, local402.width, -1996554240, local402.y, local402.height);
				}
			}
		}
		if (Static309.method4373()) {
			Static19.method4247(Static33.aClass49_1);
		}
		if ((Static162.anInt3250 == 30 || Static162.anInt3250 == 10) && Static270.anInt5006 == 0 && Static359.method4899() == 1 && !local164 && Static73.aString16.equals("1.1")) {
			local87 = 0;
			for (local91 = 0; local91 < Static104.anInt2441; local91++) {
				if (Static367.aBooleanArray23[local91]) {
					Static367.aBooleanArray23[local91] = false;
					Static160.aRectangleArray2[local87++] = Class200.aRectangleArray3[local91];
				}
			}
			Static33.aClass49_1.method4411(Static160.aRectangleArray2, local87);
		} else if (Static162.anInt3250 != 0) {
			Static33.aClass49_1.method4412();
			for (local87 = 0; local87 < Static104.anInt2441; local87++) {
				Static367.aBooleanArray23[local87] = false;
			}
		}
		if (Static12.aClass79_Sub1_1.anInt4913 == 0) {
			Static81.method1477(15L);
		} else if (Static12.aClass79_Sub1_1.anInt4913 == 1) {
			Static81.method1477(10L);
		} else if (Static12.aClass79_Sub1_1.anInt4913 == 2) {
			Static81.method1477(5L);
		} else if (Static12.aClass79_Sub1_1.anInt4913 == 3) {
			Static81.method1477(2L);
		}
		if (Static275.aBoolean377) {
			Static248.method3786();
		}
		if (Static12.aClass79_Sub1_1.aBoolean353 && Static162.anInt3250 == 10 && Static410.anInt6841 != -1) {
			Static12.aClass79_Sub1_1.aBoolean353 = false;
			Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)Ljava/lang/String;")
	@Override
	protected String method776() {
		@Pc(5) String local5 = null;
		try {
			local5 = "[1)" + Static48.anInt962 + "," + Static324.anInt5624 + "," + Static229.anInt4427 + "," + Static379.anInt6422 + "|";
			if (Static375.aClass3_Sub2_Sub1_Sub2_7 != null) {
				local5 = local5 + "2)" + Static383.anInt6436 + "," + (Static375.aClass3_Sub2_Sub1_Sub2_7.anIntArray525[0] + Static48.anInt962) + "," + (Static324.anInt5624 + Static375.aClass3_Sub2_Sub1_Sub2_7.anIntArray524[0]) + "|";
			}
			local5 = local5 + "3)" + Static399.anInt6653 + "|4)" + Static12.aClass79_Sub1_1.anInt4930 + "|5)" + Static359.method4899() + "|6)" + Static86.anInt4394 + "," + Static395.anInt6582 + "|";
			local5 = local5 + "7)" + Static12.aClass79_Sub1_1.method3959(Static399.anInt6653) + "|";
			local5 = local5 + "8)" + Static12.aClass79_Sub1_1.method3960(Static399.anInt6653) + "|";
			local5 = local5 + "9)" + Static12.aClass79_Sub1_1.aBoolean354 + "|";
			local5 = local5 + "10)" + Static12.aClass79_Sub1_1.aBoolean352 + "|";
			local5 = local5 + "11)" + Static12.aClass79_Sub1_1.aBoolean364 + "|";
			local5 = local5 + "12)" + Static12.aClass79_Sub1_1.method3966(Static399.anInt6653) + "|";
			local5 = local5 + "13)" + Static7.anInt219 + "]";
		} catch (@Pc(196) Throwable local196) {
		}
		return local5;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method766() {
		if (Static275.aBoolean376) {
			Static415.method5522();
		}
		if (Static33.aClass49_1 != null) {
			Static33.aClass49_1.method4437();
		}
		if (Static150.aFrame5 != null) {
			Static20.method453(Static150.aFrame5, Static43.aClass59_5);
			Static150.aFrame5 = null;
		}
		if (Static34.aClass34_2 != null) {
			Static34.aClass34_2.method610();
			Static34.aClass34_2 = null;
		}
		if (Static96.aClass39_1 != null) {
			Static96.aClass39_1.method3514(Static339.aCanvas7);
		}
		Static96.aClass39_1 = null;
		Static3.method126();
		Static102.aClass243_2.method5239();
		Static160.aClass30_4.method573();
		if (Static451.aClass268_1 != null) {
			Static451.aClass268_1.method5853();
			Static451.aClass268_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method785() {
		@Pc(11) boolean local11 = Static102.aClass243_2.method5230();
		if (!local11) {
			this.method786();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method761() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static328.method4556();
		Static160.aClass30_4 = new Class30(Static43.aClass59_5);
		Static102.aClass243_2 = new Class243();
		if (Static23.aClass56_1 != Static53.aClass56_2) {
			Static260.aByteArrayArray38 = new byte[50][];
		}
		Static12.aClass79_Sub1_1 = new Class79_Sub1(Static43.aClass59_5);
		if (Static53.aClass56_2 == Static23.aClass56_1) {
			Static227.aString45 = this.getCodeBase().getHost();
			Static420.anInt7047 = 43594;
			Static188.anInt3651 = 443;
		} else if (Static44.method695(Static53.aClass56_2)) {
			Static227.aString45 = this.getCodeBase().getHost();
			Static188.anInt3651 = Static440.anInt7216 + 50000;
			Static420.anInt7047 = Static440.anInt7216 + 40000;
		} else if (Static123.aClass56_4 == Static53.aClass56_2) {
			Static420.anInt7047 = Static440.anInt7216 + 40000;
			Static188.anInt3651 = Static440.anInt7216 + 50000;
			Static227.aString45 = "127.0.0.1";
		}
		Static266.aString47 = Static227.aString45;
		Static432.anInt7151 = Static188.anInt3651;
		Static395.anInt6580 = Static420.anInt7047;
		Static370.anInt6355 = Static420.anInt7047;
		Static1.aShortArray10 = Static385.aShortArray110 = Static295.aShortArray88 = Static23.aShortArray9 = new short[256];
		Static45.anInt816 = Static370.anInt6355;
		if (Static423.aClass10_43 == Static320.aClass10_28) {
			Static380.anInt6431 = 16777215;
			Static347.aShortArray108 = Static424.aShortArray112;
			Static187.aShortArrayArray4 = Static275.aShortArrayArray6;
			Static424.aBoolean472 = true;
			Static387.anInt6504 = 0;
			Static256.aShortArray73 = Static363.aShortArray109;
			Static239.aShortArrayArray5 = Static51.aShortArrayArray1;
		} else {
			Static239.aShortArrayArray5 = Static75.aShortArrayArray2;
			Static187.aShortArrayArray4 = Static418.aShortArrayArray7;
			Static347.aShortArray108 = Static143.aShortArray36;
			Static256.aShortArray73 = Static263.aShortArray78;
		}
		if (Static73.anInt1597 == 3) {
			Static375.anInt5832 = Static440.anInt7216;
		}
		Static334.aClass226_1 = Static311.method4389(Static339.aCanvas7);
		Static109.aClass1_2 = Static52.method883(Static339.aCanvas7);
		Static96.aClass39_1 = Static334.method4664();
		if (Static96.aClass39_1 != null) {
			Static96.aClass39_1.method3512(Static339.aCanvas7);
		}
		Static427.anInt7109 = Static73.anInt1597;
		try {
			if (Static43.aClass59_5.aClass99_1 != null) {
				Static199.aClass220_2 = new Class220(Static43.aClass59_5.aClass99_1, 5200, 0);
				for (@Pc(172) int local172 = 0; local172 < 30; local172++) {
					Static86.aClass220Array4[local172] = new Class220(Static43.aClass59_5.aClass99Array1[local172], 6000, 0);
				}
				Static205.aClass220_3 = new Class220(Static43.aClass59_5.aClass99_2, 6000, 0);
				Static13.aClass248_1 = new Class248(255, Static199.aClass220_2, Static205.aClass220_3, 500000);
				Static194.aClass220_1 = new Class220(Static43.aClass59_5.aClass99_3, 24, 0);
				Static43.aClass59_5.aClass99_2 = null;
				Static43.aClass59_5.aClass99_1 = null;
				Static43.aClass59_5.aClass99_3 = null;
				Static43.aClass59_5.aClass99Array1 = null;
			}
		} catch (@Pc(228) IOException local228) {
			Static205.aClass220_3 = null;
			Static194.aClass220_1 = null;
			Static199.aClass220_2 = null;
			Static13.aClass248_1 = null;
		}
		if (Static23.aClass56_1 != Static53.aClass56_2) {
			Static121.aBoolean205 = true;
		}
		Static278.aString48 = (Static199.aClass10_22 == Static320.aClass10_28 ? Static119.aClass209_59 : Static374.aClass209_146).method4562(Static388.anInt6533);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method786() {
		if (Static102.aClass243_2.anInt6617 > Static203.anInt4635) {
			Static154.anInt3162 = (Static102.aClass243_2.anInt6617 * 50 - 50) * 5;
			if (Static395.anInt6580 == Static45.anInt816) {
				Static45.anInt816 = Static432.anInt7151;
			} else {
				Static45.anInt816 = Static395.anInt6580;
			}
			if (Static154.anInt3162 > 3000) {
				Static154.anInt3162 = 3000;
			}
			if (Static102.aClass243_2.anInt6617 >= 2 && Static102.aClass243_2.anInt6618 == 6) {
				this.method768("js5connect_outofdate");
				Static162.anInt3250 = 1000;
				return;
			}
			if (Static102.aClass243_2.anInt6617 >= 4 && Static102.aClass243_2.anInt6618 == -1) {
				this.method768("js5crc");
				Static162.anInt3250 = 1000;
				return;
			}
			if (Static102.aClass243_2.anInt6617 >= 4 && (Static162.anInt3250 == 0 || Static162.anInt3250 == 5)) {
				if (Static102.aClass243_2.anInt6618 == 7 || Static102.aClass243_2.anInt6618 == 9) {
					this.method768("js5connect_full");
				} else if (Static102.aClass243_2.anInt6618 > 0) {
					this.method768("js5connect");
				} else {
					this.method768("js5io");
				}
				Static162.anInt3250 = 1000;
				return;
			}
		}
		Static203.anInt4635 = Static102.aClass243_2.anInt6617;
		if (Static154.anInt3162 > 0) {
			Static154.anInt3162--;
			return;
		}
		try {
			if (Static199.anInt3821 == 0) {
				Static246.aClass138_7 = Static43.aClass59_5.method1353(Static45.anInt816, Static266.aString47);
				Static199.anInt3821++;
			}
			if (Static199.anInt3821 == 1) {
				if (Static246.aClass138_7.anInt3723 == 2) {
					this.method783(1000);
					return;
				}
				if (Static246.aClass138_7.anInt3723 == 1) {
					Static199.anInt3821++;
				}
			}
			if (Static199.anInt3821 == 2) {
				Static4.aClass34_1 = new Class34((Socket) Static246.aClass138_7.anObject7, Static43.aClass59_5);
				@Pc(185) Class2_Sub23 local185 = new Class2_Sub23(5);
				local185.method5449(Static94.aClass240_2.anInt6576);
				local185.method5506(591);
				Static4.aClass34_1.method606(5, local185.aByteArray130);
				Static199.anInt3821++;
				Static353.aLong176 = Static21.method458();
			}
			if (Static199.anInt3821 == 3) {
				if (Static162.anInt3250 == 0 || Static162.anInt3250 == 5 || Static4.aClass34_1.method613() > 0) {
					@Pc(231) int local231 = Static4.aClass34_1.method615();
					if (local231 != 0) {
						this.method783(local231);
						return;
					}
					Static199.anInt3821++;
				} else if (Static21.method458() - Static353.aLong176 > 30000L) {
					this.method783(1001);
					return;
				}
			}
			if (Static199.anInt3821 == 4) {
				@Pc(280) boolean local280 = Static162.anInt3250 == 5 || Static162.anInt3250 == 10 || Static162.anInt3250 == 28;
				Static102.aClass243_2.method5237(Static4.aClass34_1, !local280);
				Static4.aClass34_1 = null;
				Static246.aClass138_7 = null;
				Static199.anInt3821 = 0;
			}
		} catch (@Pc(297) IOException local297) {
			this.method783(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method793() {
		Static377.anInt6400++;
		Static428.method5624(-1, null, -1);
		Static130.method2223(-1, null, -1);
		Static281.method5823();
		Static37.anInt715++;
		for (@Pc(27) int local27 = 0; local27 < 32768; local27++) {
			@Pc(33) Class3_Sub2_Sub1_Sub1 local33 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local27];
			if (local33 != null) {
				@Pc(39) byte local39 = local33.aClass65_1.lb;
				if ((local39 & 0x1) != 0) {
					@Pc(47) int local47 = local33.method4935();
					@Pc(71) int local71;
					if ((local39 & 0x2) != 0 && local33.anInt6206 == 0 && Math.random() * 1000.0D < 10.0D) {
						local71 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(79) int local79 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local71 != 0 || local79 != 0) {
							@Pc(90) int local90 = local33.anIntArray525[0] + local71;
							if (local90 < 0) {
								local90 = 0;
							} else if (local90 > Static229.anInt4427 - local47 - 1) {
								local90 = Static229.anInt4427 - local47 - 1;
							}
							@Pc(120) int local120 = local79 + local33.anIntArray524[0];
							if (local120 < 0) {
								local120 = 0;
							} else if (local120 > Static379.anInt6422 - local47 - 1) {
								local120 = Static379.anInt6422 - local47 - 1;
							}
							@Pc(170) int local170 = Static343.method4718(true, Static411.anIntArray583, local47, Static194.aClass70Array1[local33.aByte89], local47, 0, local33.anIntArray525[0], 0, local120, local47, -1, local90, Static77.anIntArray145, local33.anIntArray524[0]);
							if (local170 > 0) {
								if (local170 > 9) {
									local170 = 9;
								}
								for (@Pc(182) int local182 = 0; local182 < local170; local182++) {
									local33.anIntArray525[local182] = Static77.anIntArray145[local170 - local182 - 1];
									local33.anIntArray524[local182] = Static411.anIntArray583[local170 - local182 - 1];
									local33.aByteArray119[local182] = 1;
								}
								local33.anInt6206 = local170;
							}
						}
					}
					Static190.method3000(local33, true);
					local71 = Static50.method4936(local33);
					Static395.method5210(local71, local33, Static171.anInt3396, Static413.anInt6892);
					Static290.method4176(local33);
				}
			}
		}
		if (Static305.anInt5413 == 0 && Static10.anInt258 == 0) {
			if (Static159.anInt3195 == 2) {
				Static69.method1323();
			} else {
				Static176.method188();
			}
			if (Static364.anInt6270 >> 7 < 14 || Static229.anInt4427 - 14 <= Static364.anInt6270 >> 7 || Static23.anInt567 >> 7 < 14 || Static23.anInt567 >> 7 >= Static379.anInt6422 - 14) {
				Static348.method3781();
			}
		}
		while (true) {
			@Pc(300) Class2_Sub30 local300;
			@Pc(305) Class68 local305;
			@Pc(313) Class68 local313;
			do {
				local300 = (Class2_Sub30) Static156.aClass14_30.method307();
				if (local300 == null) {
					while (true) {
						do {
							local300 = (Class2_Sub30) Static179.aClass14_31.method307();
							if (local300 == null) {
								while (true) {
									do {
										local300 = (Class2_Sub30) Static293.aClass14_39.method307();
										if (local300 == null) {
											if (Static182.aClass68_7 != null) {
												Static117.method2079();
											}
											if (Static131.anInt2821 % 1500 == 0) {
												Static312.method4391();
											}
											Static287.method4144();
											if (Static275.aBoolean376 && Static449.aLong223 < Static21.method458() - 60000L) {
												Static415.method5522();
												return;
											}
											return;
										}
										local305 = local300.aClass68_12;
										if (local305.anInt2215 < 0) {
											break;
										}
										local313 = Static165.method2704(local305.anInt2221);
									} while (local313 == null || local313.aClass68Array1 == null || local313.aClass68Array1.length <= local305.anInt2215 || local305 != local313.aClass68Array1[local305.anInt2215]);
									Static168.method2731(local300);
								}
							}
							local305 = local300.aClass68_12;
							if (local305.anInt2215 < 0) {
								break;
							}
							local313 = Static165.method2704(local305.anInt2221);
						} while (local313 == null || local313.aClass68Array1 == null || local313.aClass68Array1.length <= local305.anInt2215 || local305 != local313.aClass68Array1[local305.anInt2215]);
						Static168.method2731(local300);
					}
				}
				local305 = local300.aClass68_12;
				if (local305.anInt2215 < 0) {
					break;
				}
				local313 = Static165.method2704(local305.anInt2221);
			} while (local313 == null || local313.aClass68Array1 == null || local305.anInt2215 >= local313.aClass68Array1.length || local305 != local313.aClass68Array1[local305.anInt2215]);
			Static168.method2731(local300);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method764() {
		if (Static162.anInt3250 == 1000) {
			return;
		}
		Static131.anInt2821++;
		if (Static131.anInt2821 % 1000 == 1) {
			@Pc(26) GregorianCalendar local26 = new GregorianCalendar();
			Static37.anInt717 = local26.get(11) * 600 + local26.get(12) * 10 + local26.get(13) / 6;
			Static365.aRandom1.setSeed((long) Static37.anInt717);
		}
		if (Static131.anInt2821 % 50 == 0) {
			Static182.anInt3563 = Static67.anInt1493;
			Static67.anInt1493 = 0;
			Static301.anInt5392 = Static203.anInt4633;
			Static203.anInt4633 = 0;
		}
		this.method785();
		if (Static292.aClass27_1 != null) {
			Static292.aClass27_1.method525();
		}
		Static213.method3361();
		Static334.aClass226_1.method4979();
		Static109.aClass1_2.method706();
		if (Static96.aClass39_1 != null) {
			@Pc(88) int local88 = Static96.aClass39_1.method3516();
			Static411.anInt6846 = local88;
		}
		if (Static33.aClass49_1 != null) {
			Static33.aClass49_1.method4446((int) Static21.method458());
		}
		Static242.method3727();
		Static222.anInt4305 = 0;
		for (@Pc(105) Class141 local105 = Static334.aClass226_1.method4981(); local105 != null && Static222.anInt4305 < 128; local105 = Static334.aClass226_1.method4981()) {
			if (local105.method4286() != 1) {
				@Pc(116) char local116 = local105.method4290();
				if (!Static115.method2049() || local116 != '`' && local116 != '§') {
					Static23.aClass141Array1[Static222.anInt4305] = local105;
					Static222.anInt4305++;
				} else if (Static309.method4373()) {
					Static318.method5335();
				} else {
					Static192.method3012();
				}
			}
		}
		for (@Pc(163) Class2_Sub15 local163 = Static109.aClass1_2.method704(); local163 != null; local163 = Static109.aClass1_2.method704()) {
			@Pc(169) int local169 = local163.method2337();
			if (local169 == -1) {
				Static421.aClass14_48.method300(local163);
			} else if (Static135.method2305(local169)) {
				Static360.aClass14_47.method300(local163);
			}
			if (Static360.aClass14_47.method297() > 10) {
				Static360.aClass14_47.method307();
			}
		}
		if (Static309.method4373()) {
			Static27.method5783();
		}
		if (Static162.anInt3250 == 0) {
			this.method778();
			Static136.method2313();
		} else if (Static162.anInt3250 == 5) {
			this.method778();
			Static136.method2313();
		} else if (Static162.anInt3250 == 25 || Static162.anInt3250 == 28) {
			Static393.method5207();
		}
		if (Static162.anInt3250 == 10) {
			this.method793();
			Static333.method4624();
			Static404.method5329();
			Static13.method295();
		} else if (Static162.anInt3250 == 30) {
			Static18.method5792();
		} else if (Static162.anInt3250 == 40) {
			Static13.method295();
			if (Static378.anInt6415 != -3 && Static378.anInt6415 != 2 && Static378.anInt6415 != 15) {
				Static220.method3461();
			}
		}
		Static300.method4296(Static33.aClass49_1);
		Static360.aClass14_47.method307();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "([BI)V")
	private void method794(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub23 local10 = new Class2_Sub23(arg0);
		while (true) {
			@Pc(22) int local22;
			@Pc(48) int local48;
			@Pc(43) int local43;
			label45: do {
				while (true) {
					while (true) {
						local22 = local10.method5495();
						if (local22 == 0) {
							return;
						}
						if (local22 == 1) {
							@Pc(108) int[] local108 = Static340.anIntArray497 = new int[6];
							local108[0] = local10.method5500();
							local108[1] = local10.method5500();
							local108[2] = local10.method5500();
							local108[3] = local10.method5500();
							local108[4] = local10.method5500();
							local108[5] = local10.method5500();
						} else {
							if (local22 != 4) {
								continue label45;
							}
							local43 = local10.method5495();
							Static136.anIntArray259 = new int[local43];
							for (local48 = 0; local48 < local43; local48++) {
								Static136.anIntArray259[local48] = local10.method5500();
								if (Static136.anIntArray259[local48] == 65535) {
									Static136.anIntArray259[local48] = -1;
								}
							}
						}
					}
				}
			} while (local22 != 5);
			local43 = local10.method5495();
			Static193.anIntArray327 = new int[local43];
			for (local48 = 0; local48 < local43; local48++) {
				Static193.anIntArray327[local48] = local10.method5500();
				if (Static193.anIntArray327[local48] == 65535) {
					Static193.anIntArray327[local48] = -1;
				}
			}
		}
	}
}
