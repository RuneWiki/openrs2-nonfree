import jagex3.jagmisc.jagmisc;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "[I")
	public static int[] lb = new int[2];

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static379.method7243("Argument count");
			}
			Static77.aClass4_3 = new Class4();
			Static77.aClass4_3.anInt111 = Integer.parseInt(arg0[0]);
			Static86.aClass4_4 = new Class4();
			Static86.aClass4_4.anInt111 = Integer.parseInt(arg0[1]);
			Static192.aClass4_5 = new Class4();
			Static192.aClass4_5.anInt111 = Integer.parseInt(arg0[2]);
			Static145.aClass21_4 = Static247.aClass21_5;
			if (arg0[3].equals("live")) {
				Static221.aClass302_2 = Static289.aClass302_3;
			} else if (arg0[3].equals("rc")) {
				Static221.aClass302_2 = Static490.aClass302_4;
			} else if (arg0[3].equals("wip")) {
				Static221.aClass302_2 = Static31.aClass302_1;
			} else {
				Static379.method7243("modewhat");
			}
			Static179.anInt3168 = Static266.method7459(arg0[4]);
			if (Static179.anInt3168 == -1) {
				if (arg0[4].equals("english")) {
					Static179.anInt3168 = 0;
				} else if (arg0[4].equals("german")) {
					Static179.anInt3168 = 1;
				} else {
					Static379.method7243("language");
				}
			}
			Static474.aBoolean564 = false;
			Static488.aBoolean570 = false;
			if (arg0[5].equals("game0")) {
				Static304.aClass101_1 = Static442.aClass101_3;
			} else if (arg0[5].equals("game1")) {
				Static304.aClass101_1 = Static542.aClass101_4;
			} else {
				Static379.method7243("game");
			}
			Static192.anInt3400 = 0;
			Static36.anInt790 = Static304.aClass101_1.anInt2782;
			Static176.aBoolean215 = false;
			Static543.anInt9158 = 0;
			Static516.aBoolean613 = true;
			Static39.aBoolean38 = true;
			Static285.aString48 = "";
			Static444.anInt7643 = 0;
			Static306.aString51 = null;
			Static5.aBoolean7 = false;
			@Pc(164) client local164 = new client();
			Static230.aClient2 = local164;
			local164.method1214(Static221.aClass302_2.method7101() + 32, Static304.aClass101_1.aString23);
			Static224.aFrame6.setLocation(40, 40);
		} catch (@Pc(187) Exception local187) {
			Static234.method4051(local187, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1224() {
		if (!Static544.aClass1_Sub22_Sub1_1.aBoolean382) {
			for (@Pc(6) int local6 = 0; local6 < Static240.anInt4803; local6++) {
				if (Static176.anInterface12Array1[local6].method7436() == 's' || Static176.anInterface12Array1[local6].method7436() == 'S') {
					Static544.aClass1_Sub22_Sub1_1.aBoolean382 = true;
					break;
				}
			}
		}
		@Pc(59) int local59;
		if (Static168.anInt5441 == 0) {
			@Pc(50) Runtime local50 = Runtime.getRuntime();
			local59 = (int) ((local50.totalMemory() - local50.freeMemory()) / 1024L);
			@Pc(62) long local62 = Static60.method1119();
			if (Static3.aLong13 == 0L) {
				Static3.aLong13 = local62;
			}
			if (local59 > 16384 && local62 - Static3.aLong13 < 5000L) {
				if (local62 - Static423.aLong318 > 1000L) {
					System.gc();
					Static423.aLong318 = local62;
				}
				Static304.aString50 = Static134.aClass306_31.method7165(Static179.anInt3168);
				Static227.anInt4490 = 5;
			} else {
				Static304.aString50 = Static398.aClass306_100.method7165(Static179.anInt3168);
				Static168.anInt5441 = 10;
				Static227.anInt4490 = 5;
			}
			return;
		}
		@Pc(119) int local119;
		if (Static168.anInt5441 == 10) {
			for (local119 = 0; local119 < 4; local119++) {
				Static86.aClass91Array1[local119] = Static419.method6152(Static482.anInt7990, Static459.anInt7799);
			}
			Static304.aString50 = Static407.aClass306_103.method7165(Static179.anInt3168);
			Static227.anInt4490 = 10;
			Static168.anInt5441 = 20;
		} else if (Static168.anInt5441 == 20) {
			if (Static40.aClass182_1 == null) {
				Static40.aClass182_1 = new Class182(Static322.aClass114_2, Static237.aClass38_1, Static129.aBigInteger1, Static242.aBigInteger2);
			}
			if (Static40.aClass182_1.method4471()) {
				Static390.aClass171_92 = Static536.method7441(0, false, true);
				Static93.aClass171_38 = Static536.method7441(1, false, true);
				Static429.aClass171_146 = Static536.method7441(2, false, true);
				Static129.aClass171_46 = Static536.method7441(3, false, true);
				Static361.aClass171_109 = Static536.method7441(4, false, true);
				Static223.aClass171_77 = Static536.method7441(5, true, true);
				Static235.aClass171_78 = Static536.method7441(6, true, false);
				Static179.aClass171_69 = Static536.method7441(7, false, true);
				Static543.aClass171_154 = Static536.method7441(8, false, true);
				Static94.aClass171_39 = Static536.method7441(9, false, true);
				Static410.aClass171_127 = Static536.method7441(10, false, true);
				Static7.aClass171_5 = Static536.method7441(11, false, true);
				Static409.aClass171_126 = Static536.method7441(12, false, true);
				Static542.aClass171_152 = Static536.method7441(13, false, true);
				Static546.aClass171_60 = Static536.method7441(14, false, false);
				Static354.aClass171_105 = Static536.method7441(15, false, true);
				Static140.aClass171_55 = Static536.method7441(16, false, true);
				Static441.aClass171_137 = Static536.method7441(17, false, true);
				Static266.aClass171_150 = Static536.method7441(18, false, true);
				Static342.aClass171_98 = Static536.method7441(19, false, true);
				Static193.aClass171_125 = Static536.method7441(20, false, true);
				Static13.aClass171_12 = Static536.method7441(21, false, true);
				Static88.aClass171_37 = Static536.method7441(22, false, true);
				Static154.aClass171_59 = Static536.method7441(23, true, true);
				Static192.aClass171_72 = Static536.method7441(24, false, true);
				Static133.aClass171_47 = Static536.method7441(25, false, true);
				Static307.aClass171_88 = Static536.method7441(26, true, true);
				Static76.aClass171_30 = Static536.method7441(27, false, true);
				Static352.aClass171_103 = Static536.method7441(28, true, true);
				Static193.aClass171_124 = Static536.method7441(29, false, true);
				Static71.aClass171_29 = Static536.method7441(30, true, true);
				Static313.aClass171_93 = Static536.method7441(31, true, true);
				Static304.aString50 = Static14.aClass306_5.method7165(Static179.anInt3168);
				Static227.anInt4490 = 15;
				Static168.anInt5441 = 30;
			} else {
				Static304.aString50 = Static33.aClass306_9.method7165(Static179.anInt3168);
				Static227.anInt4490 = 12;
			}
		} else if (Static168.anInt5441 == 30) {
			local119 = 0;
			for (local59 = 0; local59 < 32; local59++) {
				local119 += Static527.aClass131_Sub1Array2[local59].method7014() * Static444.anIntArray720[local59] / 100;
			}
			if (local119 == 100) {
				Static304.aString50 = Static510.aClass306_109.method7165(Static179.anInt3168);
				Static227.anInt4490 = 20;
				Static94.method1646(Static543.aClass171_154);
				Static37.method844(Static543.aClass171_154);
				Static168.anInt5441 = 35;
			} else {
				if (local119 != 0) {
					Static304.aString50 = Static487.aClass306_122.method7165(Static179.anInt3168) + local119 + "%";
				}
				Static227.anInt4490 = 20;
			}
		} else if (Static168.anInt5441 == 35) {
			Static311.method1476(Static466.aClass102_4, Static71.aClass171_29);
			Static304.aString50 = Static286.aClass306_65.method7165(Static179.anInt3168);
			Static168.anInt5441 = 40;
			Static227.anInt4490 = 20;
		} else if (Static168.anInt5441 == 40) {
			if (Static352.aClass171_103.method4344()) {
				this.method1241(Static352.aClass171_103.method4361(1));
				this.method1227(Static352.aClass171_103.method4361(3));
				if (Static232.anInt4617 == -1 || Static179.aClass171_69.method4336(0, Static232.anInt4617)) {
					Static304.aString50 = Static291.aClass306_69.method7165(Static179.anInt3168);
					Static168.anInt5441 = 41;
					Static227.anInt4490 = 25;
				}
			} else {
				Static304.aString50 = Static370.aClass306_132.method7165(Static179.anInt3168) + Static352.aClass171_103.method4335() + "%";
				Static227.anInt4490 = 25;
			}
		} else if (Static168.anInt5441 == 41) {
			local119 = Static257.method1713("jaggl");
			if (local119 >= 0 && local119 < 100) {
				Static304.aString50 = Static38.aClass306_11.method7165(Static179.anInt3168) + local119 + "%";
				Static227.anInt4490 = 25;
			} else {
				Static304.aString50 = Static328.aClass306_72.method7165(Static179.anInt3168);
				Static227.anInt4490 = 25;
				Static168.anInt5441 = 42;
			}
		} else if (Static168.anInt5441 == 42) {
			local119 = Static257.method1713("jagdx");
			if (local119 >= 0 && local119 < 100) {
				Static304.aString50 = Static86.aClass306_23.method7165(Static179.anInt3168) + local119 + "%";
				Static227.anInt4490 = 25;
			} else {
				Static304.aString50 = Static408.aClass306_105.method7165(Static179.anInt3168);
				Static168.anInt5441 = 43;
				Static227.anInt4490 = 25;
			}
		} else if (Static168.anInt5441 == 43) {
			local119 = Static257.method1713("jagmisc");
			if (local119 >= 0 && local119 < 100) {
				Static304.aString50 = Static480.aClass306_121.method7165(Static179.anInt3168) + local119 + "%";
				Static227.anInt4490 = 25;
			} else {
				if (local119 == 100) {
					this.method1211();
				}
				Static304.aString50 = Static148.aClass306_99.method7165(Static179.anInt3168);
				Static168.anInt5441 = 44;
				Static227.anInt4490 = 25;
			}
		} else if (Static168.anInt5441 == 44) {
			local119 = Static257.method1713("sw3d");
			if (local119 >= 0 && local119 < 100) {
				Static304.aString50 = Static411.aClass306_106.method7165(Static179.anInt3168) + local119 + "%";
				Static227.anInt4490 = 25;
			} else {
				Static304.aString50 = Static489.aClass306_125.method7165(Static179.anInt3168);
				Static168.anInt5441 = 45;
				Static227.anInt4490 = 25;
			}
		} else if (Static168.anInt5441 == 45) {
			local119 = Static257.method1713("jaclib");
			if (local119 >= 0 && local119 < 100) {
				Static304.aString50 = Static401.aClass306_102.method7165(Static179.anInt3168) + local119 + "%";
				Static227.anInt4490 = 25;
			} else {
				if (local119 == 100) {
					this.method1209();
				}
				Static304.aString50 = Static406.aClass306_104.method7165(Static179.anInt3168);
				Static168.anInt5441 = 46;
				Static227.anInt4490 = 25;
			}
		} else if (Static168.anInt5441 == 46) {
			local119 = Static257.method1713("hw3d");
			if (local119 >= 0 && local119 < 100) {
				Static304.aString50 = Static190.aClass306_41.method7165(Static179.anInt3168) + local119 + "%";
				Static227.anInt4490 = 25;
			} else {
				Static304.aString50 = Static490.aClass306_126.method7165(Static179.anInt3168);
				Static168.anInt5441 = 47;
				Static227.anInt4490 = 25;
			}
		} else if (Static168.anInt5441 == 47) {
			if (Static313.aClass171_93.method4344()) {
				Static304.aString50 = Static137.aClass306_33.method7165(Static179.anInt3168);
				Static227.anInt4490 = 25;
				Static168.anInt5441 = 50;
			} else {
				Static304.aString50 = Static187.aClass306_40.method7165(Static179.anInt3168);
				Static227.anInt4490 = 25;
			}
		} else if (Static168.anInt5441 == 50) {
			Static214.method1852();
			Static304.aString50 = Static301.aClass306_70.method7165(Static179.anInt3168);
			Static227.anInt4490 = 30;
			Static168.anInt5441 = 60;
		} else if (Static168.anInt5441 == 60) {
			local119 = Static201.method3449(Static542.aClass171_152, Static543.aClass171_154);
			local59 = Static343.method5194();
			if (local119 < local59) {
				Static304.aString50 = Static143.aClass306_34.method7165(Static179.anInt3168) + local119 * 100 / local59 + "%";
				Static227.anInt4490 = 35;
			} else {
				Static304.aString50 = Static273.aClass306_61.method7165(Static179.anInt3168);
				Static227.anInt4490 = 35;
				Static168.anInt5441 = 70;
			}
		} else if (Static168.anInt5441 == 70) {
			local119 = Static517.method7133(Static543.aClass171_154);
			local59 = Static484.method6633();
			if (local119 < local59) {
				Static304.aString50 = Static380.aClass306_94.method7165(Static179.anInt3168) + local119 * 100 / local59 + "%";
				Static227.anInt4490 = 40;
			} else {
				Static304.aString50 = Static16.aClass306_7.method7165(Static179.anInt3168);
				Static168.anInt5441 = 80;
				Static227.anInt4490 = 40;
			}
		} else if (Static168.anInt5441 == 80) {
			if (Static307.aClass171_88.method4344()) {
				Static227.anInterface8_11 = new Class25(Static307.aClass171_88, Static94.aClass171_39, Static543.aClass171_154);
				Static304.aString50 = Static6.aClass306_1.method7165(Static179.anInt3168);
				Static168.anInt5441 = 90;
				Static227.anInt4490 = 45;
			} else {
				Static304.aString50 = Static361.aClass306_78.method7165(Static179.anInt3168) + Static307.aClass171_88.method4335() + "%";
				Static227.anInt4490 = 45;
			}
		} else if (Static168.anInt5441 == 90) {
			Static304.aString50 = Static204.aClass306_44.method7165(Static179.anInt3168);
			Static168.anInt5441 = 95;
			Static227.anInt4490 = 50;
		} else if (Static168.anInt5441 == 95) {
			if (Static544.aClass1_Sub22_Sub1_1.aBoolean382) {
				Static544.aClass1_Sub22_Sub1_1.anInt5437 = 0;
				Static544.aClass1_Sub22_Sub1_1.anInt5429 = 1;
				Static544.aClass1_Sub22_Sub1_1.anInt5443 = 0;
				Static544.aClass1_Sub22_Sub1_1.anInt5450 = 0;
				Static544.aClass1_Sub22_Sub1_1.anInt5445 = 0;
			}
			Static544.aClass1_Sub22_Sub1_1.aBoolean382 = true;
			Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
			Static212.method3594(Static544.aClass1_Sub22_Sub1_1.anInt5437, false);
			Static304.aString50 = Static287.aClass306_66.method7165(Static179.anInt3168);
			Static227.anInt4490 = 55;
			Static168.anInt5441 = 100;
		} else if (Static168.anInt5441 == 100) {
			Static486.method6640(Static513.aClass122_10, Static543.aClass171_154, Static542.aClass171_152);
			Static304.aString50 = Static11.aClass306_4.method7165(Static179.anInt3168);
			Static227.anInt4490 = 60;
			Static85.method1463(1);
			Static168.anInt5441 = 110;
		} else if (Static168.anInt5441 == 110) {
			Static429.aClass171_146.method4344();
			local119 = Static429.aClass171_146.method4335();
			Static140.aClass171_55.method4344();
			local119 += Static140.aClass171_55.method4335();
			Static441.aClass171_137.method4344();
			local119 += Static441.aClass171_137.method4335();
			Static266.aClass171_150.method4344();
			local119 += Static266.aClass171_150.method4335();
			Static342.aClass171_98.method4344();
			local119 += Static342.aClass171_98.method4335();
			Static193.aClass171_125.method4344();
			local119 += Static193.aClass171_125.method4335();
			Static13.aClass171_12.method4344();
			local119 += Static13.aClass171_12.method4335();
			Static88.aClass171_37.method4344();
			local119 += Static88.aClass171_37.method4335();
			Static192.aClass171_72.method4344();
			local119 += Static192.aClass171_72.method4335();
			Static133.aClass171_47.method4344();
			local119 += Static133.aClass171_47.method4335();
			Static76.aClass171_30.method4344();
			local119 += Static76.aClass171_30.method4335();
			Static193.aClass171_124.method4344();
			local119 += Static193.aClass171_124.method4335();
			if (local119 < 1200) {
				Static304.aString50 = Static488.aClass306_124.method7165(Static179.anInt3168) + local119 / 12 + "%";
				Static227.anInt4490 = 65;
			} else {
				Static452.aClass317_2 = new Class317(Static304.aClass101_1, Static179.anInt3168, Static429.aClass171_146);
				Static351.aClass228_1 = new Class228(Static304.aClass101_1, Static179.anInt3168, Static429.aClass171_146);
				Static420.aClass95_2 = new Class95(Static304.aClass101_1, Static179.anInt3168, Static429.aClass171_146, Static543.aClass171_154);
				Static4.aClass191_1 = new Class191(Static304.aClass101_1, Static179.anInt3168, Static441.aClass171_137);
				Static458.aClass279_6 = new Class279(Static304.aClass101_1, Static179.anInt3168, Static429.aClass171_146);
				Static11.aClass61_1 = new Class61(Static304.aClass101_1, Static179.anInt3168, Static429.aClass171_146);
				Static477.aClass15_1 = new Class15(Static304.aClass101_1, Static179.anInt3168, Static429.aClass171_146, Static179.aClass171_69);
				Static219.aClass94_3 = new Class94(Static304.aClass101_1, Static179.anInt3168, Static429.aClass171_146);
				Static270.aClass195_1 = new Class195(Static304.aClass101_1, Static179.anInt3168, Static429.aClass171_146);
				Static308.aClass96_4 = new Class96(Static304.aClass101_1, Static179.anInt3168, true, Static140.aClass171_55, Static179.aClass171_69);
				Static244.aClass272_4 = new Class272(Static304.aClass101_1, Static179.anInt3168, Static429.aClass171_146, Static543.aClass171_154);
				Static323.aClass257_4 = new Class257(Static304.aClass101_1, Static179.anInt3168, Static429.aClass171_146, Static543.aClass171_154);
				Static538.aClass242_2 = new Class242(Static304.aClass101_1, Static179.anInt3168, true, Static266.aClass171_150, Static179.aClass171_69);
				Static342.aClass250_2 = new Class250(Static304.aClass101_1, Static179.anInt3168, true, Static452.aClass317_2, Static342.aClass171_98, Static179.aClass171_69);
				Static526.aClass216_1 = new Class216(Static304.aClass101_1, Static179.anInt3168, Static429.aClass171_146);
				Static182.aClass218_1 = new Class218(Static304.aClass101_1, Static179.anInt3168, Static193.aClass171_125, Static390.aClass171_92, Static93.aClass171_38);
				Static335.aClass41_1 = new Class41(Static304.aClass101_1, Static179.anInt3168, Static429.aClass171_146);
				Static482.aClass82_1 = new Class82(Static304.aClass101_1, Static179.anInt3168, Static429.aClass171_146);
				Static489.aClass194_2 = new Class194(Static304.aClass101_1, Static179.anInt3168, Static13.aClass171_12, Static179.aClass171_69);
				Static529.aClass263_1 = new Class263(Static304.aClass101_1, Static179.anInt3168, Static429.aClass171_146);
				Static413.aClass74_1 = new Class74(Static304.aClass101_1, Static179.anInt3168, Static429.aClass171_146);
				Static343.aClass99_1 = new Class99(Static304.aClass101_1, Static179.anInt3168, Static429.aClass171_146);
				Static37.aClass247_1 = new Class247(Static304.aClass101_1, Static179.anInt3168, Static88.aClass171_37);
				Static463.aClass108_1 = new Class108(Static304.aClass101_1, Static179.anInt3168, Static429.aClass171_146);
				Static297.method4737(Static542.aClass171_152, Static179.aClass171_69, Static129.aClass171_46, Static543.aClass171_154);
				Static512.method7096(Static193.aClass171_124);
				Static533.aClass276_1 = new Class276(Static179.anInt3168, Static192.aClass171_72, Static133.aClass171_47);
				Static480.aClass32_2 = new Class32(Static179.anInt3168, Static192.aClass171_72, Static133.aClass171_47, new Class186());
				Static304.aString50 = Static110.aClass306_29.method7165(Static179.anInt3168);
				Static227.anInt4490 = 65;
				Static456.method6472();
				Static308.aClass96_4.method2271(!Static544.aClass1_Sub22_Sub1_1.method4662(Static374.anInt6861));
				Static251.aClass119_1 = new Class119();
				Static205.method3533();
				Static256.method4326(Static76.aClass171_30);
				Static366.method5470(Static227.anInterface8_11, Static179.aClass171_69);
				Static168.anInt5441 = 120;
			}
		} else if (Static168.anInt5441 == 120) {
			local119 = Static263.method4382(Static543.aClass171_154);
			local59 = Static222.method3846();
			if (local59 > local119) {
				Static304.aString50 = Static334.aClass306_73.method7165(Static179.anInt3168) + local119 * 100 / local59 + "%";
				Static227.anInt4490 = 70;
			} else {
				Static46.method935(Static513.aClass122_10, Static543.aClass171_154);
				Static134.method2248(Static415.aClass2Array14);
				Static304.aString50 = Static362.aClass306_81.method7165(Static179.anInt3168);
				Static227.anInt4490 = 70;
				Static168.anInt5441 = 130;
			}
		} else if (Static168.anInt5441 == 130) {
			if (Static410.aClass171_127.method4345("huffman", "")) {
				@Pc(1559) Class27 local1559 = new Class27(Static410.aClass171_127.method4330("", "huffman"));
				Static456.method6475(local1559);
				Static304.aString50 = Static39.aClass306_12.method7165(Static179.anInt3168);
				Static227.anInt4490 = 75;
				Static168.anInt5441 = 140;
			} else {
				Static304.aString50 = Static211.aClass306_47.method7165(Static179.anInt3168) + "0%";
				Static227.anInt4490 = 75;
			}
		} else if (Static168.anInt5441 == 140) {
			if (Static129.aClass171_46.method4344()) {
				Static304.aString50 = Static15.aClass306_6.method7165(Static179.anInt3168);
				Static227.anInt4490 = 80;
				Static168.anInt5441 = 150;
			} else {
				Static304.aString50 = Static446.aClass306_112.method7165(Static179.anInt3168) + Static129.aClass171_46.method4335() + "%";
				Static227.anInt4490 = 80;
			}
		} else if (Static168.anInt5441 == 150) {
			if (Static409.aClass171_126.method4344()) {
				Static304.aString50 = Static171.aClass306_38.method7165(Static179.anInt3168);
				Static168.anInt5441 = 160;
				Static227.anInt4490 = 82;
			} else {
				Static304.aString50 = Static89.aClass306_25.method7165(Static179.anInt3168) + Static409.aClass171_126.method4335() + "%";
				Static227.anInt4490 = 82;
			}
		} else if (Static168.anInt5441 == 160) {
			if (Static542.aClass171_152.method4344()) {
				Static304.aString50 = Static435.aClass306_110.method7165(Static179.anInt3168);
				Static227.anInt4490 = 85;
				Static168.anInt5441 = 170;
			} else {
				Static304.aString50 = Static435.aClass306_110.method7165(Static179.anInt3168) + Static542.aClass171_152.method4335() + "%";
				Static227.anInt4490 = 85;
			}
		} else if (Static168.anInt5441 == 170) {
			if (Static154.aClass171_59.method4357("details")) {
				Static118.method825(Static154.aClass171_59, Static458.aClass279_6, Static11.aClass61_1, Static308.aClass96_4, Static244.aClass272_4, Static323.aClass257_4, Static251.aClass119_1);
				Static304.aString50 = Static378.aClass306_93.method7165(Static179.anInt3168);
				Static227.anInt4490 = 89;
				Static168.anInt5441 = 190;
			} else {
				Static304.aString50 = Static418.aClass306_107.method7165(Static179.anInt3168) + Static154.aClass171_59.method4329("details") + "%";
				Static227.anInt4490 = 87;
			}
		} else if (Static168.anInt5441 == 190) {
			Static303.aBooleanArray39 = new boolean[Static343.aClass99_1.anInt2744];
			Static221.aStringArray23 = new String[Static413.aClass74_1.anInt2053];
			Static42.anIntArray119 = new int[Static343.aClass99_1.anInt2744];
			for (local119 = 0; local119 < Static343.aClass99_1.anInt2744; local119++) {
				if (Static343.aClass99_1.method2335(local119).anInt781 == 0) {
					Static303.aBooleanArray39[local119] = true;
					Static329.anInt5976++;
				}
				Static42.anIntArray119[local119] = -1;
			}
			Static365.method5433();
			Static321.anInt5892 = Static129.aClass171_46.method4338("loginscreen");
			Static253.anInt4956 = Static129.aClass171_46.method4338("lobbyscreen");
			Static223.aClass171_77.method4337(false);
			Static235.aClass171_78.method4337(true);
			Static543.aClass171_154.method4337(true);
			Static542.aClass171_152.method4337(true);
			Static410.aClass171_127.method4337(true);
			Static129.aClass171_46.method4337(true);
			Static472.aBoolean562 = true;
			Static429.aClass171_146.anInt4998 = 2;
			Static441.aClass171_137.anInt4998 = 2;
			Static140.aClass171_55.anInt4998 = 2;
			Static266.aClass171_150.anInt4998 = 2;
			Static342.aClass171_98.anInt4998 = 2;
			Static193.aClass171_125.anInt4998 = 2;
			Static13.aClass171_12.anInt4998 = 2;
			Static219.method6545(Static544.aClass1_Sub22_Sub1_1.anInt5429, false, -1, -1);
			Static304.aString50 = Static516.aClass306_129.method7165(Static179.anInt3168);
			Static227.anInt4490 = 95;
			Static168.anInt5441 = 200;
		} else if (Static168.anInt5441 == 200) {
			Static85.method1463(2);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method1217() {
		if (Static47.aBoolean51) {
			Static82.method3794();
		}
		if (Static513.aClass122_10 != null) {
			Static513.aClass122_10.method7224();
		}
		if (Static193.aFrame8 != null) {
			Static433.method6290(Static193.aFrame8, Static466.aClass102_4);
			Static193.aFrame8 = null;
		}
		if (Static402.aClass56_2 != null) {
			Static402.aClass56_2.method1312();
			Static402.aClass56_2 = null;
		}
		Static255.method4299();
		Static322.aClass114_2.method2598();
		Static237.aClass38_1.method984();
		if (Static523.aClass7_1 != null) {
			Static523.aClass7_1.method374();
			Static523.aClass7_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method1225() {
		@Pc(11) boolean local11 = Static322.aClass114_2.method2607();
		if (!local11) {
			this.method1242();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	@Override
	protected void method1222() {
		if (Static374.anInt6861 != 2) {
			this.method1237();
			return;
		}
		try {
			this.method1237();
		} catch (@Pc(17) Throwable local17) {
			Static234.method4051(local17, local17.getMessage() + " (Recovered) " + this.method1206());
			Static390.method4905(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method1215() {
		if (Static5.aBoolean7) {
			Static17.anInt454 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static112.method1906();
		Static237.aClass38_1 = new Class38(Static466.aClass102_4);
		Static322.aClass114_2 = new Class114();
		if (Static145.aClass21_4 != Static71.aClass21_1) {
			Static47.aByteArrayArray2 = new byte[50][];
		}
		Static544.aClass1_Sub22_Sub1_1 = new Class1_Sub22_Sub1(Static466.aClass102_4);
		if (Static145.aClass21_4 == Static71.aClass21_1) {
			Static77.aClass4_3.aString2 = this.getCodeBase().getHost();
		} else if (Static245.method4188(Static145.aClass21_4)) {
			Static77.aClass4_3.aString2 = this.getCodeBase().getHost();
			Static77.aClass4_3.anInt113 = Static77.aClass4_3.anInt111 + 40000;
			Static86.aClass4_4.anInt113 = Static86.aClass4_4.anInt111 + 40000;
			Static77.aClass4_3.anInt114 = Static77.aClass4_3.anInt111 + 50000;
			Static192.aClass4_5.anInt113 = Static192.aClass4_5.anInt111 + 40000;
			Static86.aClass4_4.anInt114 = Static86.aClass4_4.anInt111 + 50000;
			Static192.aClass4_5.anInt114 = Static192.aClass4_5.anInt111 + 50000;
		} else if (Static145.aClass21_4 == Static247.aClass21_5) {
			Static77.aClass4_3.aString2 = "127.0.0.1";
			Static86.aClass4_4.aString2 = "127.0.0.1";
			Static77.aClass4_3.anInt113 = Static77.aClass4_3.anInt111 + 40000;
			Static192.aClass4_5.aString2 = "127.0.0.1";
			Static86.aClass4_4.anInt113 = Static86.aClass4_4.anInt111 + 40000;
			Static77.aClass4_3.anInt114 = Static77.aClass4_3.anInt111 + 50000;
			Static192.aClass4_5.anInt113 = Static192.aClass4_5.anInt111 + 40000;
			Static86.aClass4_4.anInt114 = Static86.aClass4_4.anInt111 + 50000;
			Static192.aClass4_5.anInt114 = Static192.aClass4_5.anInt111 + 50000;
		}
		Static52.aClass4_1 = Static77.aClass4_3;
		if (Static542.aClass101_4 == Static304.aClass101_1) {
			Static88.aShortArray33 = Static136.aShortArray36;
			Static467.anInt7881 = 0;
			Static546.aBoolean183 = true;
			Static532.anInt8955 = 16777215;
			Static293.aShortArrayArray4 = Static94.aShortArrayArray2;
			Static430.aShortArray117 = Static39.aShortArray17;
			Static45.aShortArrayArray1 = Static343.aShortArrayArray6;
		} else {
			Static45.aShortArrayArray1 = Static485.aShortArrayArray8;
			Static88.aShortArray33 = Static98.aShortArray144;
			Static430.aShortArray117 = Static532.aShortArray154;
			Static293.aShortArrayArray4 = Static192.aShortArrayArray3;
		}
		if (Static304.aClass101_1 == Static442.aClass101_3) {
			Static332.aBoolean434 = false;
		}
		Static283.aShortArray93 = Static344.aShortArray115 = Static308.aShortArray111 = Static5.aShortArray2 = new short[256];
		Static149.aClass66_1 = Static105.method1786(Static105.aCanvas3);
		Static498.aClass5_1 = Static364.method5423(Static105.aCanvas3);
		Static381.anInt6943 = Static151.anInt2788;
		try {
			if (Static466.aClass102_4.aClass177_1 != null) {
				Static113.aClass307_1 = new Class307(Static466.aClass102_4.aClass177_1, 5200, 0);
				for (@Pc(216) int local216 = 0; local216 < 32; local216++) {
					Static529.aClass307Array1[local216] = new Class307(Static466.aClass102_4.aClass177Array1[local216], 6000, 0);
				}
				Static324.aClass307_5 = new Class307(Static466.aClass102_4.aClass177_2, 6000, 0);
				Static231.aClass167_1 = new Class167(255, Static113.aClass307_1, Static324.aClass307_5, 500000);
				Static197.aClass307_6 = new Class307(Static466.aClass102_4.aClass177_3, 24, 0);
				Static466.aClass102_4.aClass177_1 = null;
				Static466.aClass102_4.aClass177_2 = null;
				Static466.aClass102_4.aClass177Array1 = null;
				Static466.aClass102_4.aClass177_3 = null;
			}
		} catch (@Pc(274) IOException local274) {
			Static231.aClass167_1 = null;
			Static197.aClass307_6 = null;
			Static113.aClass307_1 = null;
			Static324.aClass307_5 = null;
		}
		if (Static71.aClass21_1 != Static145.aClass21_4) {
			Static135.aBoolean172 = true;
		}
		if (Static304.aClass101_1 == Static442.aClass101_3) {
			Static424.aString69 = Static90.aClass306_26.method7165(Static179.anInt3168);
		} else if (Static542.aClass101_4 == Static304.aClass101_1) {
			Static424.aString69 = Static282.aClass306_114.method7165(Static179.anInt3168);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
	private void method1227(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub6 local8 = new Class1_Sub6(arg0);
		while (true) {
			@Pc(18) int local18 = local8.method3922();
			if (local18 == 0) {
				return;
			}
			if (local18 == 2) {
				Static232.anInt4617 = local8.method3967();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	protected void method1220() {
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method1232() {
		@Pc(23) int local23;
		if (Static268.anInt5100 == 6 && Static250.anInt4901 == 0) {
			if (Static531.anInt8934 > 1) {
				Static51.anInt1019 = Static164.anInt2967;
				Static531.anInt8934--;
			}
			if (!Static15.aBoolean16) {
				Static324.method5028();
			}
			for (local23 = 0; local23 < 100 && Static283.method4573(); local23++) {
			}
		}
		Static152.anInt2791++;
		Static281.method4559(-1, -1, null);
		Static20.method503(-1, -1, null);
		Static148.method5995();
		Static164.anInt2967++;
		for (local23 = 0; local23 < Static350.anInt6254; local23++) {
			@Pc(71) Class49_Sub2_Sub2_Sub2 local71 = Static177.aClass1_Sub17Array3[local23].aClass49_Sub2_Sub2_Sub2_2;
			if (local71 != null) {
				@Pc(77) byte local77 = local71.aClass196_1.aByte68;
				if ((local77 & 0x1) != 0) {
					@Pc(88) int local88 = local71.method3788();
					@Pc(109) int local109;
					if ((local77 & 0x2) != 0 && local71.anInt4338 == 0 && Math.random() * 1000.0D < 10.0D) {
						local109 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(117) int local117 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local109 != 0 || local117 != 0) {
							@Pc(135) int local135 = local71.anIntArray428[0] + local109;
							@Pc(142) int local142 = local117 + local71.anIntArray427[0];
							if (local135 < 0) {
								local135 = 0;
							} else if (Static459.anInt7799 - local88 - 1 < local135) {
								local135 = Static459.anInt7799 - local88 - 1;
							}
							if (local142 < 0) {
								local142 = 0;
							} else if (Static482.anInt7990 - local88 - 1 < local142) {
								local142 = Static482.anInt7990 - local88 - 1;
							}
							@Pc(224) int local224 = Static311.method1477(local88, local88, local71.anIntArray427[0], local88, -1, Static491.anIntArray760, true, local142, 0, 0, Static86.aClass91Array1[local71.aByte98], local71.anIntArray428[0], Static421.anIntArray703, local135);
							if (local224 > 0) {
								if (local224 > 9) {
									local224 = 9;
								}
								for (@Pc(238) int local238 = 0; local238 < local224; local238++) {
									local71.anIntArray428[local238] = Static421.anIntArray703[local224 - local238 - 1];
									local71.anIntArray427[local238] = Static491.anIntArray760[local224 - local238 - 1];
									local71.aByteArray64[local238] = 1;
								}
								local71.anInt4338 = local224;
							}
						}
					}
					Static372.method5724(local71, true);
					local109 = Static153.method2413(local71);
					Static473.method6592(local71, local109, Static471.anInt7902, Static76.anInt1386);
					Static299.method4747(local71);
				}
			}
		}
		if (Static250.anInt4901 == 0 && Static179.anInt3165 == 0) {
			if (Static448.anInt7701 == 2) {
				Static322.method4997();
			} else {
				Static408.method6071();
			}
			if (Static522.anInt8770 >> 9 < 14 || Static459.anInt7799 - 14 <= Static522.anInt8770 >> 9 || Static516.anInt8682 >> 9 < 14 || Static482.anInt7990 - 14 <= Static516.anInt8682 >> 9) {
				Static88.method1539();
			}
		}
		while (true) {
			@Pc(366) Class1_Sub30 local366;
			@Pc(371) Class156 local371;
			@Pc(382) Class156 local382;
			do {
				local366 = (Class1_Sub30) Static281.aClass37_55.method973();
				if (local366 == null) {
					while (true) {
						do {
							local366 = (Class1_Sub30) Static420.aClass37_80.method973();
							if (local366 == null) {
								while (true) {
									do {
										local366 = (Class1_Sub30) Static90.aClass37_21.method973();
										if (local366 == null) {
											if (Static86.aClass156_4 != null) {
												Static312.method4875();
											}
											if (Static436.anInt6850 % 1500 == 0) {
												Static234.method4047();
											}
											if (Static268.anInt5100 == 6 && Static250.anInt4901 == 0) {
												Static467.method6553();
											}
											Static16.method451();
											if (Static47.aBoolean51 && Static60.method1119() - 60000L > Static226.aLong178) {
												Static82.method3794();
											}
											for (@Pc(546) Class72_Sub1_Sub2 local546 = (Class72_Sub1_Sub2) Static516.aClass299_9.method7030(); local546 != null; local546 = (Class72_Sub1_Sub2) Static516.aClass299_9.method7031()) {
												if (Static60.method1119() / 1000L - 5L > (long) local546.anInt8156) {
													if (local546.aShort130 > 0) {
														Static363.method5419(local546.aString76 + Static362.aClass306_79.method7165(Static179.anInt3168), 0, "", 5, "");
													}
													if (local546.aShort130 == 0) {
														Static363.method5419(local546.aString76 + Static163.aClass306_37.method7165(Static179.anInt3168), 0, "", 5, "");
													}
													local546.method6719();
												}
											}
											if (Static268.anInt5100 == 6 && Static250.anInt4901 == 0) {
												if (Static402.aClass56_2 == null) {
													Static123.method2107(false);
													return;
												}
												Static94.anInt1936++;
												if (Static94.anInt1936 > 50) {
													Static144.method2331(Static221.aClass296_188);
												}
												try {
													if (Static402.aClass56_2 != null && Static455.aClass1_Sub6_Sub2_2.anInt4555 > 0) {
														Static232.anInt4616 += Static455.aClass1_Sub6_Sub2_2.anInt4555;
														Static402.aClass56_2.method1315(Static455.aClass1_Sub6_Sub2_2.anInt4555, Static455.aClass1_Sub6_Sub2_2.aByteArray66);
														Static455.aClass1_Sub6_Sub2_2.anInt4555 = 0;
														Static94.anInt1936 = 0;
														return;
													}
												} catch (@Pc(678) IOException local678) {
													Static123.method2107(false);
													return;
												}
											}
											return;
										}
										local371 = local366.aClass156_11;
										if (local371.anInt4723 < 0) {
											break;
										}
										local382 = Static182.method2888(local371.anInt4686);
									} while (local382 == null || local382.aClass156Array1 == null || local382.aClass156Array1.length <= local371.anInt4723 || local382.aClass156Array1[local371.anInt4723] != local371);
									Static180.method2683(local366);
								}
							}
							local371 = local366.aClass156_11;
							if (local371.anInt4723 < 0) {
								break;
							}
							local382 = Static182.method2888(local371.anInt4686);
						} while (local382 == null || local382.aClass156Array1 == null || local382.aClass156Array1.length <= local371.anInt4723 || local382.aClass156Array1[local371.anInt4723] != local371);
						Static180.method2683(local366);
					}
				}
				local371 = local366.aClass156_11;
				if (local371.anInt4723 < 0) {
					break;
				}
				local382 = Static182.method2888(local371.anInt4686);
			} while (local382 == null || local382.aClass156Array1 == null || local371.anInt4723 >= local382.aClass156Array1.length || local371 != local382.aClass156Array1[local371.anInt4723]);
			Static180.method2683(local366);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1221()) {
			return;
		}
		Static77.aClass4_3 = new Class4();
		Static77.aClass4_3.anInt111 = Integer.parseInt(this.getParameter("worldid"));
		Static86.aClass4_4 = new Class4();
		Static86.aClass4_4.anInt111 = Integer.parseInt(this.getParameter("lobbyid"));
		Static86.aClass4_4.aString2 = this.getParameter("lobbyaddress");
		Static192.aClass4_5 = new Class4();
		Static192.aClass4_5.anInt111 = Integer.parseInt(this.getParameter("demoid"));
		Static192.aClass4_5.aString2 = this.getParameter("demoaddress");
		Static145.aClass21_4 = Static423.method6198(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static245.method4188(Static145.aClass21_4) && Static71.aClass21_1 != Static145.aClass21_4) {
			Static145.aClass21_4 = Static71.aClass21_1;
		}
		Static221.aClass302_2 = Static21.method524(Integer.parseInt(this.getParameter("modewhat")));
		if (Static221.aClass302_2 != Static31.aClass302_1 && Static221.aClass302_2 != Static490.aClass302_4 && Static289.aClass302_3 != Static221.aClass302_2) {
			Static221.aClass302_2 = Static289.aClass302_3;
		}
		try {
			Static179.anInt3168 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(91) Exception local91) {
			Static179.anInt3168 = 0;
		}
		@Pc(97) String local97 = this.getParameter("objecttag");
		if (local97 != null && local97.equals("1")) {
			Static474.aBoolean564 = true;
		} else {
			Static474.aBoolean564 = false;
		}
		@Pc(113) String local113 = this.getParameter("js");
		if (local113 != null && local113.equals("1")) {
			Static488.aBoolean570 = true;
		} else {
			Static488.aBoolean570 = false;
		}
		@Pc(129) String local129 = this.getParameter("advert");
		if (local129 != null && local129.equals("1")) {
			Static146.aBoolean177 = true;
		} else {
			Static146.aBoolean177 = false;
		}
		@Pc(145) String local145 = this.getParameter("game");
		if (local145 != null) {
			if (local145.equals("0")) {
				Static304.aClass101_1 = Static442.aClass101_3;
			} else if (local145.equals("1")) {
				Static304.aClass101_1 = Static542.aClass101_4;
			}
		}
		try {
			Static543.anInt9158 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(168) Exception local168) {
			Static543.anInt9158 = 0;
		}
		Static517.aString79 = this.getParameter("quiturl");
		Static285.aString48 = this.getParameter("settings");
		if (Static285.aString48 == null) {
			Static285.aString48 = "";
		}
		@Pc(186) String local186 = this.getParameter("country");
		if (local186 != null) {
			try {
				Static444.anInt7643 = Integer.parseInt(local186);
			} catch (@Pc(193) Exception local193) {
				Static444.anInt7643 = 0;
			}
		}
		Static36.anInt790 = Integer.parseInt(this.getParameter("colourid"));
		if (Static36.anInt790 < 0 || Static36.anInt790 >= Static489.aColorArray2.length) {
			Static36.anInt790 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static516.aBoolean613 = true;
			Static39.aBoolean38 = true;
		}
		@Pc(228) String local228 = this.getParameter("frombilling");
		if (local228 != null && local228.equals("true")) {
			Static176.aBoolean215 = true;
		}
		Static306.aString51 = this.getParameter("sskey");
		if (Static306.aString51 != null && Static306.aString51.length() < 2) {
			Static306.aString51 = null;
		}
		@Pc(254) String local254 = this.getParameter("force64mb");
		if (local254 != null && local254.equals("true")) {
			Static5.aBoolean7 = true;
		}
		@Pc(266) String local266 = this.getParameter("worldflags");
		if (local266 != null) {
			try {
				Static192.anInt3400 = Integer.parseInt(local266);
			} catch (@Pc(273) Exception local273) {
			}
		}
		Static230.aClient2 = this;
		if (Static304.aClass101_1 == Static442.aClass101_3) {
			Static134.anInt2646 = 503;
			Static397.anInt7131 = 765;
		} else if (Static542.aClass101_4 == Static304.aClass101_1) {
			Static397.anInt7131 = 640;
			Static134.anInt2646 = 480;
		}
		this.method1213(Static134.anInt2646, Static221.aClass302_2.method7101() + 32, Static397.anInt7131);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1206() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static470.anInt7897 + "," + Static534.anInt9007 + "," + Static459.anInt7799 + "," + Static482.anInt7990 + "|";
			if (Static63.aClass49_Sub2_Sub2_Sub1_1 != null) {
				local7 = local7 + "2)" + Static501.anInt8491 + "," + (Static470.anInt7897 + Static63.aClass49_Sub2_Sub2_Sub1_1.anIntArray428[0]) + "," + (Static534.anInt9007 + Static63.aClass49_Sub2_Sub2_Sub1_1.anIntArray427[0]) + "|";
			}
			local7 = local7 + "3)" + Static374.anInt6861 + "|4)" + Static544.aClass1_Sub22_Sub1_1.anInt5445 + "|5)" + Static306.method4842() + "|6)" + Static83.anInt1567 + "," + Static350.anInt6255 + "|";
			local7 = local7 + "7)" + Static544.aClass1_Sub22_Sub1_1.method4648(Static374.anInt6861) + "|";
			local7 = local7 + "8)" + Static544.aClass1_Sub22_Sub1_1.method4655(Static374.anInt6861) + "|";
			local7 = local7 + "9)" + Static544.aClass1_Sub22_Sub1_1.aBoolean392 + "|";
			local7 = local7 + "10)" + Static544.aClass1_Sub22_Sub1_1.aBoolean396 + "|";
			local7 = local7 + "11)" + Static544.aClass1_Sub22_Sub1_1.aBoolean387 + "|";
			local7 = local7 + "12)" + Static544.aClass1_Sub22_Sub1_1.method4662(Static374.anInt6861) + "|";
			local7 = local7 + "13)" + Static17.anInt454 + "|";
			local7 = local7 + "14)" + Static268.anInt5100;
			try {
				local7 = local7 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(222) Throwable local222) {
			}
			try {
				if (Static374.anInt6861 == 2) {
					@Pc(228) Class local228 = Class.forName("java.lang.ClassLoader");
					@Pc(232) Field local232 = local228.getDeclaredField("nativeLibraries");
					@Pc(235) Class local235 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(245) Method local245 = local235.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local245.invoke(local232, Boolean.TRUE);
					@Pc(268) Vector local268 = (Vector) local232.get(client.class.getClassLoader());
					for (@Pc(270) int local270 = 0; local270 < local268.size(); local270++) {
						try {
							@Pc(276) Object local276 = local268.elementAt(local270);
							@Pc(281) Field local281 = local276.getClass().getDeclaredField("name");
							local245.invoke(local281, Boolean.TRUE);
							try {
								@Pc(296) String local296 = (String) local281.get(local276);
								if (local296 != null && local296.indexOf("sw3d.dll") != -1) {
									@Pc(308) Field local308 = local276.getClass().getDeclaredField("handle");
									local245.invoke(local308, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local308.getLong(local276));
									local245.invoke(local308, Boolean.FALSE);
								}
							} catch (@Pc(344) Throwable local344) {
							}
							local245.invoke(local281, Boolean.FALSE);
						} catch (@Pc(356) Throwable local356) {
						}
					}
				}
			} catch (@Pc(369) Throwable local369) {
			}
			local7 = local7 + "]";
		} catch (@Pc(380) Throwable local380) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method1237() {
		if (Static268.anInt5100 == 13) {
			return;
		}
		@Pc(20) long local20 = Static332.method5095() / 1000000L - Static512.aLong363;
		Static512.aLong363 = Static332.method5095() / 1000000L;
		@Pc(34) boolean local34 = Static382.method5849();
		if (local34 && Static316.aBoolean424 && Static314.aClass183_2 != null) {
			Static314.aClass183_2.method7430();
		}
		if (Static114.method1962(Static268.anInt5100)) {
			if (Static314.aLong237 != 0L && Static314.aLong237 < Static60.method1119()) {
				Static219.method6545(Static306.method4842(), false, Static544.aClass1_Sub22_Sub1_1.anInt5455, Static544.aClass1_Sub22_Sub1_1.anInt5456);
			} else if (!Static513.aClass122_10.method7242() && Static194.aBoolean233) {
				Static359.method5343();
			}
		}
		@Pc(95) int local95;
		@Pc(99) int local99;
		if (Static193.aFrame8 == null) {
			@Pc(86) Container local86;
			if (Static224.aFrame6 == null) {
				local86 = Static466.aClass102_4.anApplet1;
			} else {
				local86 = Static224.aFrame6;
			}
			local95 = local86.getSize().width;
			local99 = local86.getSize().height;
			if (local86 == Static224.aFrame6) {
				@Pc(105) Insets local105 = Static224.aFrame6.getInsets();
				local95 -= local105.right + local105.left;
				local99 -= local105.top + local105.bottom;
			}
			if (Static399.anInt7190 != local95 || local99 != Static128.anInt1835) {
				if (Static513.aClass122_10 == null || Static513.aClass122_10.method7258()) {
					Static112.method1906();
				} else {
					Static128.anInt1835 = local99;
					Static399.anInt7190 = local95;
				}
				Static314.aLong237 = Static60.method1119() + 500L;
			}
		}
		if (Static193.aFrame8 != null && !Static297.aBoolean404 && Static114.method1962(Static268.anInt5100)) {
			Static219.method6545(Static544.aClass1_Sub22_Sub1_1.anInt5429, false, -1, -1);
		}
		@Pc(162) boolean local162 = false;
		if (Static336.aBoolean435) {
			local162 = true;
			Static336.aBoolean435 = false;
		}
		if (local162) {
			Static97.method1657();
		}
		if (Static513.aClass122_10 != null && Static513.aClass122_10.method7242() || Static306.method4842() != 1) {
			Static299.method4748();
		}
		if (Static268.anInt5100 == 0) {
			Static175.method2634(Static489.aColorArray2[Static36.anInt790], Static443.aColorArray1[Static36.anInt790], Static523.aColorArray3[Static36.anInt790], local162, Static304.aString50, Static227.anInt4490);
		} else if (Static268.anInt5100 == 1) {
			Static497.method6752(Static513.aClass122_10, Static296.aClass67_9, Static523.aColorArray3[Static36.anInt790].getRGB(), Static443.aColorArray1[Static36.anInt790].getRGB(), local162 | Static513.aClass122_10.method7242(), Static489.aColorArray2[Static36.anInt790].getRGB());
		} else if (Static399.method6026(Static268.anInt5100)) {
			Static223.method3876();
		} else if (Static218.method6061(Static268.anInt5100)) {
			Static223.method3876();
		} else if (Static399.method6025(Static268.anInt5100)) {
			if (Static277.anInt5226 == 1) {
				if (Static41.anInt864 > Static302.anInt5575) {
					Static302.anInt5575 = Static41.anInt864;
				}
				local95 = (Static302.anInt5575 - Static41.anInt864) * 50 / Static302.anInt5575;
				Static489.method6714(Static190.aClass306_42.method7165(Static179.anInt3168) + "<br>(" + local95 + "%)", true, Static112.aClass67_3);
			} else if (Static277.anInt5226 == 2) {
				if (Static532.anInt8953 > Static386.anInt7017) {
					Static386.anInt7017 = Static532.anInt8953;
				}
				local95 = (Static386.anInt7017 - Static532.anInt8953) * 50 / Static386.anInt7017 + 50;
				Static489.method6714(Static190.aClass306_42.method7165(Static179.anInt3168) + "<br>(" + local95 + "%)", true, Static112.aClass67_3);
			} else {
				Static489.method6714(Static190.aClass306_42.method7165(Static179.anInt3168), true, Static112.aClass67_3);
			}
		} else if (Static268.anInt5100 == 9) {
			Static399.method6033(local20);
		} else if (Static268.anInt5100 == 12) {
			Static489.method6714(Static44.aClass306_14.method7165(Static179.anInt3168) + "<br>" + Static86.aClass306_22.method7165(Static179.anInt3168), true, Static112.aClass67_3);
		}
		if (Static503.anInt8507 == 3) {
			for (local95 = 0; local95 < Static422.anInt7388; local95++) {
				@Pc(398) Rectangle local398 = Class79.aRectangleArray1[local95];
				if (Static389.aBooleanArray42[local95]) {
					Static513.aClass122_10.method7265(-1996553985, local398.height, local398.x, local398.width, local398.y);
				} else if (Static236.aBooleanArray29[local95]) {
					Static513.aClass122_10.method7265(-1996554240, local398.height, local398.x, local398.width, local398.y);
				}
			}
		}
		if (Static378.method5806()) {
			Static169.method2565(Static513.aClass122_10);
		}
		if (Static114.method1962(Static268.anInt5100) && Static503.anInt8507 == 0 && Static306.method4842() == 1 && !local162 && Static151.aString24.equals("1.1")) {
			local95 = 0;
			for (local99 = 0; local99 < Static422.anInt7388; local99++) {
				if (Static236.aBooleanArray29[local99]) {
					Static236.aBooleanArray29[local99] = false;
					Static231.aRectangleArray2[local95++] = Class79.aRectangleArray1[local99];
				}
			}
			try {
				Static513.aClass122_10.method7216(Static231.aRectangleArray2, local95);
			} catch (@Pc(539) Exception_Sub1 local539) {
			}
		} else if (Static268.anInt5100 != 0) {
			for (local95 = 0; local95 < Static422.anInt7388; local95++) {
				Static236.aBooleanArray29[local95] = false;
			}
			try {
				Static513.aClass122_10.method7236();
			} catch (@Pc(487) Exception_Sub1 local487) {
				Static234.method4051(local487, local487.getMessage() + " (Recovered) " + this.method1206());
				Static390.method4905(0);
			}
		}
		if (Static544.aClass1_Sub22_Sub1_1.anInt5435 == 0) {
			Static209.method3565(15L);
		} else if (Static544.aClass1_Sub22_Sub1_1.anInt5435 == 1) {
			Static209.method3565(10L);
		} else if (Static544.aClass1_Sub22_Sub1_1.anInt5435 == 2) {
			Static209.method3565(5L);
		} else if (Static544.aClass1_Sub22_Sub1_1.anInt5435 == 3) {
			Static209.method3565(2L);
		}
		if (Static472.aBoolean562) {
			Static260.method4368();
		}
		if (Static544.aClass1_Sub22_Sub1_1.aBoolean382 && Static268.anInt5100 == 2 && Static170.anInt3050 != -1) {
			Static544.aClass1_Sub22_Sub1_1.aBoolean382 = false;
			Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method1240() {
		if (Static268.anInt5100 == 13) {
			return;
		}
		Static436.anInt6850++;
		if (Static436.anInt6850 % 1000 == 1) {
			@Pc(22) GregorianCalendar local22 = new GregorianCalendar();
			Static193.anInt7224 = local22.get(11) * 600 + local22.get(12) * 10 + local22.get(13) / 6;
			Static216.aRandom1.setSeed((long) Static193.anInt7224);
		}
		if (Static436.anInt6850 % 50 == 0) {
			Static40.anInt858 = Static232.anInt4616;
			Static17.anInt451 = Static419.anInt7363;
			Static232.anInt4616 = 0;
			Static419.anInt7363 = 0;
		}
		this.method1225();
		if (Static40.aClass182_1 != null) {
			Static40.aClass182_1.method4476();
		}
		Static106.method1798();
		Static149.aClass66_1.method1583();
		Static498.aClass5_1.method7054();
		if (Static513.aClass122_10 != null) {
			Static513.aClass122_10.method7234((int) Static60.method1119());
		}
		Static78.method1337();
		Static240.anInt4803 = 0;
		Static473.anInt7951 = 0;
		for (@Pc(94) Interface12 local94 = Static149.aClass66_1.method1581(); local94 != null; local94 = Static149.aClass66_1.method1581()) {
			@Pc(100) int local100 = local94.method7438();
			if (local100 == 2 || local100 == 3) {
				@Pc(110) char local110 = local94.method7436();
				if (Static386.method5877() && (local110 == '`' || local110 == '§')) {
					if (Static378.method5806()) {
						Static292.method7306();
					} else {
						Static204.method3513();
					}
				} else if (Static240.anInt4803 < 128) {
					Static176.anInterface12Array1[Static240.anInt4803] = local94;
					Static240.anInt4803++;
				}
			} else if (local100 == 0 && Static473.anInt7951 < 75) {
				Static211.anInterface12Array2[Static473.anInt7951] = local94;
				Static473.anInt7951++;
			}
		}
		Static168.anInt5448 = 0;
		for (@Pc(172) Class1_Sub13 local172 = Static498.aClass5_1.method7043(); local172 != null; local172 = Static498.aClass5_1.method7043()) {
			@Pc(178) int local178 = local172.method5739();
			if (local178 == -1) {
				Static210.aClass37_44.method970(local172);
			} else if (local178 == 6) {
				Static168.anInt5448 += local172.method5740();
			} else if (Static26.method590(local178)) {
				Static22.aClass37_50.method970(local172);
				if (Static22.aClass37_50.method965() > 10) {
					Static22.aClass37_50.method973();
				}
			}
		}
		if (Static378.method5806()) {
			Static4.method233();
		}
		if (Static268.anInt5100 == 0) {
			this.method1224();
			Static156.method2461();
		} else if (Static268.anInt5100 == 1) {
			this.method1224();
			Static156.method2461();
		} else if (Static399.method6025(Static268.anInt5100)) {
			Static370.method7393();
		}
		if (Static160.method2489(Static268.anInt5100) && !Static399.method6025(Static268.anInt5100)) {
			this.method1232();
			Static71.method1276();
			Static190.method2952();
		} else if (Static82.method3792(Static268.anInt5100) && !Static399.method6025(Static268.anInt5100)) {
			this.method1232();
			Static190.method2952();
		} else if (Static268.anInt5100 == 11) {
			Static190.method2952();
		} else if (Static64.method1156(Static268.anInt5100) && !Static399.method6025(Static268.anInt5100)) {
			Static264.method4394();
		} else if (Static268.anInt5100 == 12) {
			Static190.method2952();
			if (Static430.anInt6478 != -3 && Static430.anInt6478 != 2 && Static430.anInt6478 != 15) {
				Static123.method2107(false);
			}
		}
		Static186.method2917(Static513.aClass122_10);
		Static22.aClass37_50.method973();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I[B)V")
	private void method1241(@OriginalArg(1) byte[] arg0) {
		@Pc(16) Class1_Sub6 local16 = new Class1_Sub6(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(20) int local20 = local16.method3922();
					if (local20 == 0) {
						return;
					}
					if (local20 == 1) {
						@Pc(110) int[] local110 = Static82.anIntArray424 = new int[6];
						local110[0] = local16.method3967();
						local110[1] = local16.method3967();
						local110[2] = local16.method3967();
						local110[3] = local16.method3967();
						local110[4] = local16.method3967();
						local110[5] = local16.method3967();
					} else {
						@Pc(39) int local39;
						@Pc(34) int local34;
						if (local20 == 4) {
							local34 = local16.method3922();
							Static171.anIntArray289 = new int[local34];
							for (local39 = 0; local39 < local34; local39++) {
								Static171.anIntArray289[local39] = local16.method3967();
								if (Static171.anIntArray289[local39] == 65535) {
									Static171.anIntArray289[local39] = -1;
								}
							}
						} else if (local20 == 5) {
							local34 = local16.method3922();
							Static272.anIntArray524 = new int[local34];
							for (local39 = 0; local39 < local34; local39++) {
								Static272.anIntArray524[local39] = local16.method3967();
								if (Static272.anIntArray524[local39] == 65535) {
									Static272.anIntArray524[local39] = -1;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method1242() {
		if (Static149.anInt2773 < Static322.aClass114_2.anInt3073) {
			Static16.anInt421 = (Static322.aClass114_2.anInt3073 - 1) * 50 * 5;
			Static52.aClass4_1.aBoolean8 = !Static52.aClass4_1.aBoolean8;
			if (Static16.anInt421 > 3000) {
				Static16.anInt421 = 3000;
			}
			if (Static322.aClass114_2.anInt3073 >= 2 && Static322.aClass114_2.anInt3072 == 6) {
				this.method1223("js5connect_outofdate");
				Static268.anInt5100 = 13;
				return;
			}
			if (Static322.aClass114_2.anInt3073 >= 4 && Static322.aClass114_2.anInt3072 == -1) {
				this.method1223("js5crc");
				Static268.anInt5100 = 13;
				return;
			}
			if (Static322.aClass114_2.anInt3073 >= 4 && Static388.method5884(Static268.anInt5100)) {
				if (Static322.aClass114_2.anInt3072 == 7 || Static322.aClass114_2.anInt3072 == 9) {
					this.method1223("js5connect_full");
				} else if (Static322.aClass114_2.anInt3072 <= 0) {
					this.method1223("js5io");
				} else {
					this.method1223("js5connect");
				}
				Static268.anInt5100 = 13;
				return;
			}
		}
		Static149.anInt2773 = Static322.aClass114_2.anInt3073;
		if (Static16.anInt421 > 0) {
			Static16.anInt421--;
			return;
		}
		try {
			if (Static380.anInt6942 == 0) {
				Static163.aClass157_5 = Static466.aClass102_4.method2395(Static52.aClass4_1.aString2, Static52.aClass4_1.method243());
				Static380.anInt6942++;
			}
			if (Static380.anInt6942 == 1) {
				if (Static163.aClass157_5.anInt4742 == 2) {
					this.method1243(1000);
					return;
				}
				if (Static163.aClass157_5.anInt4742 == 1) {
					Static380.anInt6942++;
				}
			}
			if (Static380.anInt6942 == 2) {
				Static77.aClass301_1 = new Class301((Socket) Static163.aClass157_5.anObject12, Static466.aClass102_4);
				@Pc(193) Class1_Sub6 local193 = new Class1_Sub6(5);
				local193.method3937(Static295.aClass158_2.anInt4745);
				local193.method3948(610);
				Static77.aClass301_1.method7065(5, local193.aByteArray66);
				Static380.anInt6942++;
				Static265.aLong200 = Static60.method1119();
			}
			if (Static380.anInt6942 == 3) {
				if (Static388.method5884(Static268.anInt5100) || Static77.aClass301_1.method7067() > 0) {
					@Pc(246) int local246 = Static77.aClass301_1.method7061();
					if (local246 != 0) {
						this.method1243(local246);
						return;
					}
					Static380.anInt6942++;
				} else if (Static60.method1119() - Static265.aLong200 > 30000L) {
					this.method1243(1001);
					return;
				}
			}
			if (Static380.anInt6942 == 4) {
				@Pc(280) boolean local280 = Static268.anInt5100 == 1 || Static160.method2489(Static268.anInt5100) || Static82.method3792(Static268.anInt5100);
				Static322.aClass114_2.method2608(!local280, Static77.aClass301_1);
				Static380.anInt6942 = 0;
				Static77.aClass301_1 = null;
				Static163.aClass157_5 = null;
			}
		} catch (@Pc(297) IOException local297) {
			this.method1243(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method1243(@OriginalArg(1) int arg0) {
		Static77.aClass301_1 = null;
		Static322.aClass114_2.anInt3073++;
		Static163.aClass157_5 = null;
		Static380.anInt6942 = 0;
		Static322.aClass114_2.anInt3072 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1216() {
		if (Static374.anInt6861 != 2) {
			this.method1240();
			return;
		}
		try {
			this.method1240();
		} catch (@Pc(18) Throwable local18) {
			Static234.method4051(local18, local18.getMessage() + " (Recovered) " + this.method1206());
			Static390.method4905(0);
		}
	}
}
