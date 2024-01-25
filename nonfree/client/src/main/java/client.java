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
				Static113.method1808("argument count");
			}
			Static28.anInt682 = Integer.parseInt(arg0[0]);
			Static130.aClass239_4 = Static371.aClass239_6;
			if (arg0[1].equals("live")) {
				Static259.aClass170_2 = Static446.aClass170_4;
			} else if (arg0[1].equals("rc")) {
				Static259.aClass170_2 = Static282.aClass170_3;
			} else if (arg0[1].equals("wip")) {
				Static259.aClass170_2 = Static11.aClass170_1;
			} else {
				Static113.method1808("modewhat");
			}
			Static139.anInt2670 = Static209.method2984(arg0[2]);
			if (Static139.anInt2670 == -1) {
				if (arg0[2].equals("english")) {
					Static139.anInt2670 = 0;
				} else if (arg0[2].equals("german")) {
					Static139.anInt2670 = 1;
				} else {
					Static113.method1808("language");
				}
			}
			Static197.aBoolean435 = false;
			Static242.aBoolean359 = false;
			if (arg0[3].equals("game0")) {
				Static441.aClass95_5 = Static162.aClass95_7;
			} else if (arg0[3].equals("game1")) {
				Static441.aClass95_5 = Static128.aClass95_1;
			} else {
				Static113.method1808("game");
			}
			Static121.anInt2512 = 0;
			Static156.aString26 = "";
			Static383.anInt6697 = Static441.aClass95_5.anInt2635;
			Static313.aBoolean374 = true;
			Static404.aBoolean463 = true;
			Static47.anInt1314 = 0;
			@Pc(126) client local126 = new client();
			Static102.aClient1 = local126;
			local126.method1098(Static441.aClass95_5.aString24, Static259.aClass170_2.method3735() + 32);
			Static373.aFrame2.setLocation(40, 40);
		} catch (@Pc(150) Exception local150) {
			Static273.method3690(null, local150);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method1116(@OriginalArg(0) int arg0) {
		Static38.anInt1003 = 0;
		Static366.aClass125_3.anInt3329++;
		Static317.aClass5_4 = null;
		Static17.aClass108_2 = null;
		Static366.aClass125_3.anInt3328 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method1109() {
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method1125() {
		@Pc(6) int local6;
		if (!Static126.aClass67_Sub1_1.aBoolean401) {
			for (local6 = 0; local6 < Static83.anInt1892; local6++) {
				if (Static344.aClass150Array1[local6].method3230() == 's' || Static344.aClass150Array1[local6].method3230() == 'S') {
					Static126.aClass67_Sub1_1.aBoolean401 = true;
					break;
				}
			}
		}
		@Pc(50) int local50;
		if (Static55.anInt1493 == 0) {
			@Pc(41) Runtime local41 = Runtime.getRuntime();
			local50 = (int) ((local41.totalMemory() - local41.freeMemory()) / 1024L);
			@Pc(53) long local53 = Static199.method2845();
			if (Static144.aLong68 == 0L) {
				Static144.aLong68 = local53;
			}
			if (local50 > 16384 && local53 - Static144.aLong68 < 5000L) {
				if (local53 - Static80.aLong40 > 1000L) {
					System.gc();
					Static80.aLong40 = local53;
				}
				Static372.aString71 = Static4.aClass242_1.method5320(Static139.anInt2670);
				Static222.anInt4093 = 5;
			} else {
				Static372.aString71 = Static402.aClass242_27.method5320(Static139.anInt2670);
				Static222.anInt4093 = 5;
				Static55.anInt1493 = 10;
			}
		} else if (Static55.anInt1493 == 10) {
			for (local6 = 0; local6 < 4; local6++) {
				Static395.aClass268Array1[local6] = Static373.method5103(Static126.anInt2569, Static190.anInt3697);
			}
			Static372.aString71 = Static160.aClass242_42.method5320(Static139.anInt2670);
			Static55.anInt1493 = 20;
			Static222.anInt4093 = 10;
		} else if (Static55.anInt1493 == 20) {
			if (Static344.aClass73_1 == null) {
				Static344.aClass73_1 = new Class73(Static366.aClass125_3, Static80.aClass227_1);
			}
			if (Static344.aClass73_1.method1678()) {
				Static375.aClass166_207 = Static5.method162(true, false, 0);
				Static359.aClass166_251 = Static5.method162(true, false, 1);
				Static430.aClass166_284 = Static5.method162(true, false, 2);
				Static349.aClass166_240 = Static5.method162(true, false, 3);
				Static354.aClass166_247 = Static5.method162(true, false, 4);
				Static193.aClass166_291 = Static5.method162(true, true, 5);
				Static273.aClass166_193 = Static5.method162(false, true, 6);
				Static207.aClass166_151 = Static5.method162(true, false, 7);
				Static149.aClass166_105 = Static5.method162(true, false, 8);
				Static28.aClass166_28 = Static5.method162(true, false, 9);
				Static320.aClass166_226 = Static5.method162(true, false, 10);
				Static300.aClass166_212 = Static5.method162(true, false, 11);
				Static4.aClass166_6 = Static5.method162(true, false, 12);
				Static439.aClass166_293 = Static5.method162(true, false, 13);
				Static240.aClass166_165 = Static5.method162(false, false, 14);
				Static77.aClass166_60 = Static5.method162(true, false, 15);
				Static376.aClass166_259 = Static5.method162(true, false, 16);
				Static224.aClass166_162 = Static5.method162(true, false, 17);
				Static195.aClass166_106 = Static5.method162(true, false, 18);
				Static102.aClass166_75 = Static5.method162(true, false, 19);
				Static416.aClass166_278 = Static5.method162(true, false, 20);
				Static78.aClass166_61 = Static5.method162(true, false, 21);
				Static81.aClass166_66 = Static5.method162(true, false, 22);
				Static260.aClass166_302 = Static5.method162(true, true, 23);
				Static289.aClass166_205 = Static5.method162(true, false, 24);
				Static160.aClass166_118 = Static5.method162(true, false, 25);
				Static278.aClass166_290 = Static5.method162(true, true, 26);
				Static192.aClass166_304 = Static5.method162(true, false, 27);
				Static12.aClass166_20 = Static5.method162(true, true, 28);
				Static408.aClass166_271 = Static5.method162(true, false, 29);
				Static372.aString71 = Static364.aClass242_88.method5320(Static139.anInt2670);
				Static55.anInt1493 = 30;
				Static222.anInt4093 = 15;
			} else {
				Static372.aString71 = Static446.aClass242_102.method5320(Static139.anInt2670);
				Static222.anInt4093 = 12;
			}
		} else if (Static55.anInt1493 == 30) {
			local6 = 0;
			for (local50 = 0; local50 < 30; local50++) {
				local6 += Static216.aClass193_Sub1Array2[local50].method4431() * Static136.anIntArray176[local50] / 100;
			}
			if (local6 == 100) {
				Static372.aString71 = Static385.aClass242_77.method5320(Static139.anInt2670);
				Static222.anInt4093 = 20;
				Static387.method5227(Static149.aClass166_105);
				Static256.method4039(Static149.aClass166_105);
				Static55.anInt1493 = 40;
			} else {
				if (local6 != 0) {
					Static372.aString71 = Static169.aClass242_43.method5320(Static139.anInt2670) + local6 + "%";
				}
				Static222.anInt4093 = 20;
			}
		} else if (Static55.anInt1493 == 40) {
			if (Static12.aClass166_20.method3689()) {
				this.method1126(Static12.aClass166_20.method3684(1));
				Static372.aString71 = Static57.aClass242_17.method5320(Static139.anInt2670);
				Static55.anInt1493 = 50;
				Static222.anInt4093 = 25;
			} else {
				Static372.aString71 = Static394.aClass242_98.method5320(Static139.anInt2670) + Static12.aClass166_20.method3674() + "%";
				Static222.anInt4093 = 25;
			}
		} else if (Static55.anInt1493 == 50) {
			Static442.method5687();
			Static372.aString71 = Static157.aClass242_41.method5320(Static139.anInt2670);
			Static222.anInt4093 = 30;
			Static55.anInt1493 = 60;
		} else if (Static55.anInt1493 == 60) {
			local6 = Static201.method5152(Static149.aClass166_105, Static439.aClass166_293);
			local50 = Static55.method1124();
			if (local6 < local50) {
				Static372.aString71 = Static308.aClass242_69.method5320(Static139.anInt2670) + local6 * 100 / local50 + "%";
				Static222.anInt4093 = 35;
			} else {
				Static372.aString71 = Static237.aClass242_60.method5320(Static139.anInt2670);
				Static55.anInt1493 = 70;
				Static222.anInt4093 = 35;
			}
		} else if (Static55.anInt1493 == 70) {
			local6 = Static99.method4518(Static149.aClass166_105);
			local50 = Static163.method2391();
			if (local50 > local6) {
				Static372.aString71 = Static406.aClass242_100.method5320(Static139.anInt2670) + local6 * 100 / local50 + "%";
				Static222.anInt4093 = 40;
			} else {
				Static372.aString71 = Static133.aClass242_37.method5320(Static139.anInt2670);
				Static222.anInt4093 = 40;
				Static55.anInt1493 = 80;
			}
		} else if (Static55.anInt1493 == 80) {
			if (Static278.aClass166_290.method3689()) {
				Static222.anInterface10_6 = new Class187(Static278.aClass166_290, Static28.aClass166_28, Static149.aClass166_105);
				Static372.aString71 = Static448.aClass242_104.method5320(Static139.anInt2670);
				Static222.anInt4093 = 45;
				Static55.anInt1493 = 90;
			} else {
				Static372.aString71 = Static120.aClass242_35.method5320(Static139.anInt2670) + Static278.aClass166_290.method3674() + "%";
				Static222.anInt4093 = 45;
			}
		} else if (Static55.anInt1493 == 90) {
			Static372.aString71 = Static271.aClass242_16.method5320(Static139.anInt2670);
			Static222.anInt4093 = 50;
			Static55.anInt1493 = 95;
		} else if (Static55.anInt1493 == 95) {
			if (Static126.aClass67_Sub1_1.aBoolean401) {
				Static126.aClass67_Sub1_1.anInt5863 = 1;
				Static126.aClass67_Sub1_1.anInt5848 = 0;
				Static126.aClass67_Sub1_1.anInt5858 = 0;
				Static126.aClass67_Sub1_1.anInt5854 = 0;
				Static126.aClass67_Sub1_1.anInt5866 = 0;
			}
			Static126.aClass67_Sub1_1.aBoolean401 = true;
			Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
			Static183.method2710(false, Static126.aClass67_Sub1_1.anInt5866);
			Static372.aString71 = Static313.aClass242_71.method5320(Static139.anInt2670);
			Static55.anInt1493 = 100;
			Static222.anInt4093 = 55;
		} else if (Static55.anInt1493 == 100) {
			Static341.method4737(Static439.aClass166_293, Static149.aClass166_105, Static16.aClass30_11);
			Static372.aString71 = Static69.aClass242_19.method5320(Static139.anInt2670);
			Static222.anInt4093 = 60;
			Static321.method4406(5);
			Static55.anInt1493 = 110;
		} else if (Static55.anInt1493 == 110) {
			Static430.aClass166_284.method3689();
			local6 = Static430.aClass166_284.method3674();
			Static376.aClass166_259.method3689();
			local6 += Static376.aClass166_259.method3674();
			Static224.aClass166_162.method3689();
			local6 += Static224.aClass166_162.method3674();
			Static195.aClass166_106.method3689();
			local6 += Static195.aClass166_106.method3674();
			Static102.aClass166_75.method3689();
			local6 += Static102.aClass166_75.method3674();
			Static416.aClass166_278.method3689();
			local6 += Static416.aClass166_278.method3674();
			Static78.aClass166_61.method3689();
			local6 += Static78.aClass166_61.method3674();
			Static81.aClass166_66.method3689();
			local6 += Static81.aClass166_66.method3674();
			Static289.aClass166_205.method3689();
			local6 += Static289.aClass166_205.method3674();
			Static160.aClass166_118.method3689();
			local6 += Static160.aClass166_118.method3674();
			Static192.aClass166_304.method3689();
			local6 += Static192.aClass166_304.method3674();
			Static408.aClass166_271.method3689();
			local6 += Static408.aClass166_271.method3674();
			if (local6 < 1200) {
				Static372.aString71 = Static196.aClass242_50.method5320(Static139.anInt2670) + local6 / 12 + "%";
				Static222.anInt4093 = 65;
			} else {
				Static110.aClass262_1 = new Class262(Static441.aClass95_5, Static139.anInt2670, Static430.aClass166_284);
				Static8.aClass226_1 = new Class226(Static441.aClass95_5, Static139.anInt2670, Static430.aClass166_284);
				Static232.aClass138_2 = new Class138(Static441.aClass95_5, Static139.anInt2670, Static430.aClass166_284, Static149.aClass166_105);
				Static126.aClass206_1 = new Class206(Static441.aClass95_5, Static139.anInt2670, Static224.aClass166_162);
				Static62.aClass112_1 = new Class112(Static441.aClass95_5, Static139.anInt2670, Static430.aClass166_284);
				Static339.aClass23_4 = new Class23(Static441.aClass95_5, Static139.anInt2670, Static430.aClass166_284);
				Static116.aClass50_1 = new Class50(Static441.aClass95_5, Static139.anInt2670, Static430.aClass166_284, Static207.aClass166_151);
				Static88.aClass137_1 = new Class137(Static441.aClass95_5, Static139.anInt2670, Static430.aClass166_284);
				Static419.aClass81_1 = new Class81(Static441.aClass95_5, Static139.anInt2670, Static430.aClass166_284);
				Static2.aClass74_13 = new Class74(Static441.aClass95_5, Static139.anInt2670, true, Static376.aClass166_259, Static207.aClass166_151);
				Static236.aClass198_3 = new Class198(Static441.aClass95_5, Static139.anInt2670, Static430.aClass166_284, Static149.aClass166_105);
				Static70.aClass212_6 = new Class212(Static441.aClass95_5, Static139.anInt2670, Static430.aClass166_284, Static149.aClass166_105);
				Static388.aClass211_1 = new Class211(Static441.aClass95_5, Static139.anInt2670, true, Static195.aClass166_106, Static207.aClass166_151);
				Static390.aClass204_2 = new Class204(Static441.aClass95_5, Static139.anInt2670, true, Static110.aClass262_1, Static102.aClass166_75, Static207.aClass166_151);
				Static85.aClass157_1 = new Class157(Static441.aClass95_5, Static139.anInt2670, Static430.aClass166_284);
				Static269.aClass10_1 = new Class10(Static441.aClass95_5, Static139.anInt2670, Static416.aClass166_278, Static375.aClass166_207, Static359.aClass166_251);
				Static447.aClass78_1 = new Class78(Static441.aClass95_5, Static139.anInt2670, Static430.aClass166_284);
				Static316.aClass88_4 = new Class88(Static441.aClass95_5, Static139.anInt2670, Static430.aClass166_284);
				Static92.aClass89_1 = new Class89(Static441.aClass95_5, Static139.anInt2670, Static78.aClass166_61, Static207.aClass166_151);
				Static311.aClass174_1 = new Class174(Static441.aClass95_5, Static139.anInt2670, Static430.aClass166_284);
				Static146.aClass253_1 = new Class253(Static441.aClass95_5, Static139.anInt2670, Static430.aClass166_284);
				Static254.aClass189_1 = new Class189(Static441.aClass95_5, Static139.anInt2670, Static430.aClass166_284);
				Static73.aClass252_1 = new Class252(Static441.aClass95_5, Static139.anInt2670, Static81.aClass166_66);
				Static186.aClass54_1 = new Class54(Static441.aClass95_5, Static139.anInt2670, Static430.aClass166_284);
				Static247.method4142(Static439.aClass166_293, Static149.aClass166_105, Static207.aClass166_151, Static349.aClass166_240);
				Static189.method2798(Static408.aClass166_271);
				Static428.aClass19_1 = new Class19(Static139.anInt2670, Static289.aClass166_205, Static160.aClass166_118);
				Static390.aClass221_2 = new Class221(Static139.anInt2670, Static289.aClass166_205, Static160.aClass166_118, new Class164());
				Static372.aString71 = Static156.aClass242_40.method5320(Static139.anInt2670);
				Static222.anInt4093 = 65;
				Static404.method5330();
				Static2.aClass74_13.method1689(!Static126.aClass67_Sub1_1.method4531(Static286.anInt5207));
				Static155.aClass149_1 = new Class149();
				Static88.method1487();
				Static294.method4071(Static192.aClass166_304);
				Static326.method2433(Static222.anInterface10_6, Static207.aClass166_151);
				Static55.anInt1493 = 120;
			}
		} else if (Static55.anInt1493 == 120) {
			local6 = Static185.method5254(Static149.aClass166_105);
			local50 = Static215.method5517();
			if (local50 > local6) {
				Static372.aString71 = Static259.aClass242_63.method5320(Static139.anInt2670) + local6 * 100 / local50 + "%";
				Static222.anInt4093 = 70;
			} else {
				Static276.method3722(Static16.aClass30_11, Static149.aClass166_105);
				Static178.method2599(Static352.aClass3Array13);
				Static372.aString71 = Static62.aClass242_18.method5320(Static139.anInt2670);
				Static222.anInt4093 = 70;
				Static55.anInt1493 = 130;
			}
		} else if (Static55.anInt1493 == 130) {
			if (Static320.aClass166_226.method3672("", "huffman")) {
				@Pc(1190) Class68 local1190 = new Class68(Static320.aClass166_226.method3673("", "huffman"));
				Static132.method1939(local1190);
				Static372.aString71 = Static119.aClass242_34.method5320(Static139.anInt2670);
				Static222.anInt4093 = 75;
				Static55.anInt1493 = 140;
			} else {
				Static372.aString71 = Static304.aClass242_67.method5320(Static139.anInt2670) + "0%";
				Static222.anInt4093 = 75;
			}
		} else if (Static55.anInt1493 == 140) {
			if (Static349.aClass166_240.method3689()) {
				Static372.aString71 = Static121.aClass242_36.method5320(Static139.anInt2670);
				Static222.anInt4093 = 80;
				Static55.anInt1493 = 150;
			} else {
				Static372.aString71 = Static177.aClass242_49.method5320(Static139.anInt2670) + Static349.aClass166_240.method3674() + "%";
				Static222.anInt4093 = 80;
			}
		} else if (Static55.anInt1493 == 150) {
			if (Static4.aClass166_6.method3689()) {
				Static372.aString71 = Static47.aClass242_12.method5320(Static139.anInt2670);
				Static55.anInt1493 = 160;
				Static222.anInt4093 = 82;
			} else {
				Static372.aString71 = Static240.aClass242_61.method5320(Static139.anInt2670) + Static4.aClass166_6.method3674() + "%";
				Static222.anInt4093 = 82;
			}
		} else if (Static55.anInt1493 == 160) {
			if (Static439.aClass166_293.method3689()) {
				Static372.aString71 = Static203.aClass242_51.method5320(Static139.anInt2670);
				Static222.anInt4093 = 85;
				Static55.anInt1493 = 170;
			} else {
				Static372.aString71 = Static203.aClass242_51.method5320(Static139.anInt2670) + Static439.aClass166_293.method3674() + "%";
				Static222.anInt4093 = 85;
			}
		} else if (Static55.anInt1493 == 170) {
			if (Static260.aClass166_302.method3682("details")) {
				Static137.method4283(Static260.aClass166_302, Static62.aClass112_1, Static339.aClass23_4, Static2.aClass74_13, Static236.aClass198_3, Static70.aClass212_6, Static155.aClass149_1);
				Static372.aString71 = Static111.aClass242_89.method5320(Static139.anInt2670);
				Static222.anInt4093 = 89;
				Static55.anInt1493 = 180;
			} else {
				Static372.aString71 = Static16.aClass242_82.method5320(Static139.anInt2670) + Static260.aClass166_302.method3692("details") + "%";
				Static222.anInt4093 = 87;
			}
		} else if (Static55.anInt1493 == 180) {
			local6 = Static94.method1540();
			if (local6 == -1) {
				Static372.aString71 = Static94.aClass242_22.method5320(Static139.anInt2670);
				Static222.anInt4093 = 90;
			} else if (local6 == 7 || local6 == 9) {
				this.method1107("worldlistfull");
				Static321.method4406(1000);
			} else if (Static398.aBoolean455) {
				Static372.aString71 = Static173.aClass242_44.method5320(Static139.anInt2670);
				Static55.anInt1493 = 190;
				Static222.anInt4093 = 90;
			} else {
				this.method1107("worldlistio_" + local6);
				Static321.method4406(1000);
			}
		} else if (Static55.anInt1493 == 190) {
			Static78.aStringArray11 = new String[Static146.aClass253_1.anInt7123];
			Static291.aBooleanArray18 = new boolean[Static254.aClass189_1.anInt5626];
			Static327.anIntArray505 = new int[Static254.aClass189_1.anInt5626];
			for (local6 = 0; local6 < Static254.aClass189_1.anInt5626; local6++) {
				if (Static254.aClass189_1.method4328(local6).anInt3586 == 0) {
					Static291.aBooleanArray18[local6] = true;
					Static215.anInt7151++;
				}
				Static327.anIntArray505[local6] = -1;
			}
			Static141.method2010();
			Static17.anInt532 = Static349.aClass166_240.method3698("loginscreen");
			Static193.aClass166_291.method3675(false);
			Static273.aClass166_193.method3675(true);
			Static149.aClass166_105.method3675(true);
			Static439.aClass166_293.method3675(true);
			Static320.aClass166_226.method3675(true);
			Static349.aClass166_240.method3675(true);
			Static295.aBoolean365 = true;
			Static430.aClass166_284.anInt4829 = 2;
			Static224.aClass166_162.anInt4829 = 2;
			Static376.aClass166_259.anInt4829 = 2;
			Static195.aClass166_106.anInt4829 = 2;
			Static102.aClass166_75.anInt4829 = 2;
			Static416.aClass166_278.anInt4829 = 2;
			Static78.aClass166_61.anInt4829 = 2;
			Static352.method4941(-1, -1, Static126.aClass67_Sub1_1.anInt5863, false);
			Static372.aString71 = Static38.aClass242_9.method5320(Static139.anInt2670);
			Static55.anInt1493 = 200;
			Static222.anInt4093 = 95;
		} else if (Static55.anInt1493 == 200) {
			Static93.method1521(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BZ)V")
	private void method1126(@OriginalArg(0) byte[] arg0) {
		@Pc(15) Class4_Sub30 local15 = new Class4_Sub30(arg0);
		while (true) {
			while (true) {
				@Pc(19) int local19 = local15.method4864();
				if (local19 == 0) {
					return;
				}
				if (local19 == 1) {
					@Pc(31) int[] local31 = Static229.anIntArray340 = new int[6];
					local31[0] = local15.method4877();
					local31[1] = local15.method4877();
					local31[2] = local15.method4877();
					local31[3] = local15.method4877();
					local31[4] = local15.method4877();
					local31[5] = local15.method4877();
				} else {
					@Pc(76) int local76;
					@Pc(81) int local81;
					if (local19 == 4) {
						local76 = local15.method4864();
						Static335.anIntArray525 = new int[local76];
						for (local81 = 0; local81 < local76; local81++) {
							Static335.anIntArray525[local81] = local15.method4877();
							if (Static335.anIntArray525[local81] == 65535) {
								Static335.anIntArray525[local81] = -1;
							}
						}
					} else if (local19 == 5) {
						local76 = local15.method4864();
						Static397.anIntArray600 = new int[local76];
						for (local81 = 0; local81 < local76; local81++) {
							Static397.anIntArray600[local81] = local15.method4877();
							if (Static397.anIntArray600[local81] == 65535) {
								Static397.anIntArray600[local81] = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method1128() {
		Static4.anInt161++;
		Static253.method3465(-1, -1, null);
		Static95.method1553(-1, null, -1);
		Static15.method340();
		Static190.anInt3670++;
		for (@Pc(27) int local27 = 0; local27 < 32768; local27++) {
			@Pc(33) Class6_Sub2_Sub1_Sub2 local33 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local27];
			if (local33 != null) {
				@Pc(39) byte local39 = local33.aClass243_1.aByte105;
				if ((local39 & 0x1) != 0) {
					@Pc(50) int local50 = local33.method4763();
					@Pc(77) int local77;
					if ((local39 & 0x2) != 0 && local33.anInt6147 == 0 && Math.random() * 1000.0D < 10.0D) {
						local77 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(85) int local85 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local77 != 0 || local85 != 0) {
							@Pc(102) int local102 = local33.anIntArray536[0] + local77;
							@Pc(109) int local109 = local85 + local33.anIntArray537[0];
							if (local102 < 0) {
								local102 = 0;
							} else if (Static126.anInt2569 - local50 - 1 < local102) {
								local102 = Static126.anInt2569 - local50 - 1;
							}
							if (local109 < 0) {
								local109 = 0;
							} else if (Static190.anInt3697 - local50 - 1 < local109) {
								local109 = Static190.anInt3697 - local50 - 1;
							}
							@Pc(188) int local188 = Static48.method1022(local50, Static395.aClass268Array1[local33.aByte86], local102, Static41.anIntArray78, 0, local33.anIntArray537[0], -1, local50, 0, Static244.anIntArray368, local50, local109, local33.anIntArray536[0], true);
							if (local188 > 0) {
								if (local188 > 9) {
									local188 = 9;
								}
								for (@Pc(199) int local199 = 0; local199 < local188; local199++) {
									local33.anIntArray536[local199] = Static41.anIntArray78[local188 - local199 - 1];
									local33.anIntArray537[local199] = Static244.anIntArray368[local188 - local199 - 1];
									local33.aByteArray69[local199] = 1;
								}
								local33.anInt6147 = local188;
							}
						}
					}
					Static302.method4181(true, local33);
					local77 = Static50.method1033(local33);
					Static202.method2934(Static415.anInt7049, local77, local33, Static283.anInt5103);
					Static285.method3979(local33);
				}
			}
		}
		if (Static341.anInt6053 == 0 && Static272.anInt4809 == 0) {
			if (Static134.anInt2621 == 2) {
				Static44.method903();
			} else {
				Static393.method5277();
			}
			if (Static254.anInt4614 >> 7 < 14 || Static126.anInt2569 - 14 <= Static254.anInt4614 >> 7 || Static30.anInt696 >> 7 < 14 || Static190.anInt3697 - 14 <= Static30.anInt696 >> 7) {
				Static324.method5214();
			}
		}
		while (true) {
			@Pc(305) Class4_Sub40 local305;
			@Pc(310) Class126 local310;
			@Pc(321) Class126 local321;
			do {
				local305 = (Class4_Sub40) Static362.aClass258_44.method5530();
				if (local305 == null) {
					while (true) {
						do {
							local305 = (Class4_Sub40) Static332.aClass258_40.method5530();
							if (local305 == null) {
								while (true) {
									do {
										local305 = (Class4_Sub40) Static447.aClass258_49.method5530();
										if (local305 == null) {
											if (Static15.aClass126_1 != null) {
												Static355.method4965();
											}
											if (Static175.anInt3261 % 1500 == 0) {
												Static367.method5075();
											}
											Static317.method4375();
											if (Static111.aBoolean437 && Static256.aLong156 < Static199.method2845() - 60000L) {
												Static130.method1932();
												return;
											}
											return;
										}
										local310 = local305.aClass126_16;
										if (local310.anInt3392 < 0) {
											break;
										}
										local321 = Static53.method1056(local310.anInt3405);
									} while (local321 == null || local321.aClass126Array3 == null || local321.aClass126Array3.length <= local310.anInt3392 || local310 != local321.aClass126Array3[local310.anInt3392]);
									Static172.method2513(local305);
								}
							}
							local310 = local305.aClass126_16;
							if (local310.anInt3392 < 0) {
								break;
							}
							local321 = Static53.method1056(local310.anInt3405);
						} while (local321 == null || local321.aClass126Array3 == null || local321.aClass126Array3.length <= local310.anInt3392 || local310 != local321.aClass126Array3[local310.anInt3392]);
						Static172.method2513(local305);
					}
				}
				local310 = local305.aClass126_16;
				if (local310.anInt3392 < 0) {
					break;
				}
				local321 = Static53.method1056(local310.anInt3405);
			} while (local321 == null || local321.aClass126Array3 == null || local321.aClass126Array3.length <= local310.anInt3392 || local310 != local321.aClass126Array3[local310.anInt3392]);
			Static172.method2513(local305);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1129() {
		@Pc(15) boolean local15 = Static366.aClass125_3.method2614();
		if (!local15) {
			this.method1132();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)Ljava/lang/String;")
	@Override
	protected String method1099() {
		@Pc(5) String local5 = null;
		try {
			local5 = "[1)" + Static381.anInt6688 + "," + Static285.anInt5187 + "," + Static126.anInt2569 + "," + Static190.anInt3697 + "|";
			if (Static375.aClass6_Sub2_Sub1_Sub1_3 != null) {
				local5 = local5 + "2)" + Static221.anInt4855 + "," + (Static381.anInt6688 + Static375.aClass6_Sub2_Sub1_Sub1_3.anIntArray536[0]) + "," + (Static285.anInt5187 + Static375.aClass6_Sub2_Sub1_Sub1_3.anIntArray537[0]) + "|";
			}
			local5 = local5 + "3)" + Static286.anInt5207 + "|4)" + Static126.aClass67_Sub1_1.anInt5848 + "|5)" + Static144.method2104() + "|6)" + Static87.anInt1948 + "," + Static349.anInt6303 + "|";
			local5 = local5 + "7)" + Static126.aClass67_Sub1_1.method4524(Static286.anInt5207) + "|";
			local5 = local5 + "8)" + Static126.aClass67_Sub1_1.method4523(Static286.anInt5207) + "|";
			local5 = local5 + "9)" + Static126.aClass67_Sub1_1.aBoolean388 + "|";
			local5 = local5 + "10)" + Static126.aClass67_Sub1_1.aBoolean396 + "|";
			local5 = local5 + "11)" + Static126.aClass67_Sub1_1.aBoolean398 + "|";
			local5 = local5 + "12)" + Static126.aClass67_Sub1_1.method4531(Static286.anInt5207) + "|";
			local5 = local5 + "13)" + Static346.anInt6291 + "]";
		} catch (@Pc(196) Throwable local196) {
		}
		return local5;
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1132() {
		if (Static366.aClass125_3.anInt3329 > Static368.anInt6518) {
			if (Static274.anInt4849 == Static81.anInt1880) {
				Static274.anInt4849 = Static271.anInt1484;
			} else {
				Static274.anInt4849 = Static81.anInt1880;
			}
			Static250.anInt4527 = (Static366.aClass125_3.anInt3329 * 50 - 50) * 5;
			if (Static250.anInt4527 > 3000) {
				Static250.anInt4527 = 3000;
			}
			if (Static366.aClass125_3.anInt3329 >= 2 && Static366.aClass125_3.anInt3328 == 6) {
				this.method1107("js5connect_outofdate");
				Static73.anInt1749 = 1000;
				return;
			}
			if (Static366.aClass125_3.anInt3329 >= 4 && Static366.aClass125_3.anInt3328 == -1) {
				this.method1107("js5crc");
				Static73.anInt1749 = 1000;
				return;
			}
			if (Static366.aClass125_3.anInt3329 >= 4 && (Static73.anInt1749 == 0 || Static73.anInt1749 == 5)) {
				if (Static366.aClass125_3.anInt3328 == 7 || Static366.aClass125_3.anInt3328 == 9) {
					this.method1107("js5connect_full");
				} else if (Static366.aClass125_3.anInt3328 > 0) {
					this.method1107("js5connect");
				} else {
					this.method1107("js5io");
				}
				Static73.anInt1749 = 1000;
				return;
			}
		}
		Static368.anInt6518 = Static366.aClass125_3.anInt3329;
		if (Static250.anInt4527 > 0) {
			Static250.anInt4527--;
			return;
		}
		try {
			if (Static38.anInt1003 == 0) {
				Static17.aClass108_2 = Static89.aClass114_3.method2364(Static274.anInt4849, Static436.aString70);
				Static38.anInt1003++;
			}
			if (Static38.anInt1003 == 1) {
				if (Static17.aClass108_2.anInt2803 == 2) {
					this.method1116(1000);
					return;
				}
				if (Static17.aClass108_2.anInt2803 == 1) {
					Static38.anInt1003++;
				}
			}
			if (Static38.anInt1003 == 2) {
				Static317.aClass5_4 = new Class5((Socket) Static17.aClass108_2.anObject4, Static89.aClass114_3);
				@Pc(187) Class4_Sub30 local187 = new Class4_Sub30(5);
				local187.method4871(Static58.aClass223_12.anInt6527);
				local187.method4861(587);
				Static317.aClass5_4.method124(local187.aByteArray79, 5);
				Static38.anInt1003++;
				Static149.aLong69 = Static199.method2845();
			}
			if (Static38.anInt1003 == 3) {
				if (Static73.anInt1749 == 0 || Static73.anInt1749 == 5 || Static317.aClass5_4.method120() > 0) {
					@Pc(245) int local245 = Static317.aClass5_4.method125();
					if (local245 != 0) {
						this.method1116(local245);
						return;
					}
					Static38.anInt1003++;
				} else if (Static199.method2845() - Static149.aLong69 > 30000L) {
					this.method1116(1001);
					return;
				}
			}
			if (Static38.anInt1003 == 4) {
				@Pc(274) boolean local274 = Static73.anInt1749 == 5 || Static73.anInt1749 == 10 || Static73.anInt1749 == 28;
				Static366.aClass125_3.method2615(!local274, Static317.aClass5_4);
				Static17.aClass108_2 = null;
				Static317.aClass5_4 = null;
				Static38.anInt1003 = 0;
			}
		} catch (@Pc(291) IOException local291) {
			this.method1116(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1100()) {
			return;
		}
		Static28.anInt682 = Integer.parseInt(this.getParameter("worldid"));
		Static130.aClass239_4 = Static355.method4962(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static289.method4026(Static130.aClass239_4) && Static427.aClass239_7 != Static130.aClass239_4) {
			Static130.aClass239_4 = Static427.aClass239_7;
		}
		Static259.aClass170_2 = Static400.method5318(Integer.parseInt(this.getParameter("modewhat")));
		if (Static11.aClass170_1 != Static259.aClass170_2 && Static259.aClass170_2 != Static282.aClass170_3 && Static259.aClass170_2 != Static446.aClass170_4) {
			Static259.aClass170_2 = Static446.aClass170_4;
		}
		try {
			Static139.anInt2670 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(56) Exception local56) {
			Static139.anInt2670 = 0;
		}
		@Pc(62) String local62 = this.getParameter("objecttag");
		if (local62 != null && local62.equals("1")) {
			Static242.aBoolean359 = true;
		} else {
			Static242.aBoolean359 = false;
		}
		@Pc(78) String local78 = this.getParameter("js");
		if (local78 != null && local78.equals("1")) {
			Static197.aBoolean435 = true;
		} else {
			Static197.aBoolean435 = false;
		}
		@Pc(94) String local94 = this.getParameter("advert");
		if (local94 != null && local94.equals("1")) {
			Static266.aBoolean342 = true;
		} else {
			Static266.aBoolean342 = false;
		}
		@Pc(110) String local110 = this.getParameter("game");
		if (local110 != null && local110.equals("1")) {
			Static441.aClass95_5 = Static128.aClass95_1;
		} else {
			Static441.aClass95_5 = Static162.aClass95_7;
		}
		try {
			Static121.anInt2512 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(129) Exception local129) {
			Static121.anInt2512 = 0;
		}
		Static1.aString3 = this.getParameter("quiturl");
		Static156.aString26 = this.getParameter("settings");
		if (Static156.aString26 == null) {
			Static156.aString26 = "";
		}
		@Pc(147) String local147 = this.getParameter("country");
		if (local147 != null) {
			try {
				Static47.anInt1314 = Integer.parseInt(local147);
			} catch (@Pc(154) Exception local154) {
				Static47.anInt1314 = 0;
			}
		}
		Static383.anInt6697 = Integer.parseInt(this.getParameter("colourid"));
		if (Static383.anInt6697 < 0 || Static383.anInt6697 >= Static449.aColorArray2.length) {
			Static383.anInt6697 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static313.aBoolean374 = true;
			Static404.aBoolean463 = true;
		}
		if (Static441.aClass95_5 == Static162.aClass95_7) {
			Static410.anInt6809 = 503;
			Static200.anInt3847 = 765;
		} else if (Static128.aClass95_1 == Static441.aClass95_5) {
			Static410.anInt6809 = 480;
			Static200.anInt3847 = 640;
		}
		Static102.aClient1 = this;
		this.method1110(Static259.aClass170_2.method3735() + 32, Static410.anInt6809, Static200.anInt3847);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method1102() {
		if (Static111.aBoolean437) {
			Static130.method1932();
		}
		if (Static16.aClass30_11 != null) {
			Static16.aClass30_11.method4695();
		}
		if (Static269.aFrame1 != null) {
			Static387.method5231(Static89.aClass114_3, Static269.aFrame1);
			Static269.aFrame1 = null;
		}
		if (Static223.aClass5_3 != null) {
			Static223.aClass5_3.method119();
			Static223.aClass5_3 = null;
		}
		if (Static141.aClass44_1 != null) {
			Static141.aClass44_1.method3472(Static248.aCanvas5);
		}
		Static141.aClass44_1 = null;
		Static372.method5824();
		Static366.aClass125_3.method2602();
		Static80.aClass227_1.method5113();
		if (Static201.aClass255_2 != null) {
			Static201.aClass255_2.method5501();
			Static201.aClass255_2 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1108() {
		if (Static73.anInt1749 == 1000) {
			return;
		}
		@Pc(19) long local19 = Static214.method3057() / 1000000L - Static319.aLong171;
		Static319.aLong171 = Static214.method3057() / 1000000L;
		@Pc(27) boolean local27 = Static119.method1854();
		if (local27 && Static156.aBoolean213 && Static411.aClass75_2 != null) {
			Static411.aClass75_2.method5359();
		}
		if (Static73.anInt1749 == 30 || Static73.anInt1749 == 10) {
			if (Static158.aLong77 != 0L && Static199.method2845() > Static158.aLong77) {
				Static352.method4941(Static126.aClass67_Sub1_1.anInt5860, Static126.aClass67_Sub1_1.anInt5847, Static144.method2104(), false);
			} else if (!Static16.aClass30_11.method4652() && Static255.aBoolean339) {
				Static291.method4052();
			}
		}
		@Pc(88) int local88;
		@Pc(92) int local92;
		if (Static269.aFrame1 == null) {
			@Pc(80) Container local80;
			if (Static373.aFrame2 == null) {
				local80 = Static89.aClass114_3.anApplet1;
			} else {
				local80 = Static373.aFrame2;
			}
			local88 = local80.getSize().width;
			local92 = local80.getSize().height;
			if (local80 == Static373.aFrame2) {
				@Pc(98) Insets local98 = Static373.aFrame2.getInsets();
				local92 -= local98.bottom + local98.top;
				local88 -= local98.left + local98.right;
			}
			if (Static290.anInt5237 != local88 || Static274.anInt4847 != local92) {
				if (Static16.aClass30_11 == null || Static16.aClass30_11.method4688()) {
					Static276.method3720();
				} else {
					Static274.anInt4847 = local92;
					Static290.anInt5237 = local88;
				}
				Static158.aLong77 = Static199.method2845() + 500L;
			}
		}
		if (Static269.aFrame1 != null && !Static165.aBoolean224 && (Static73.anInt1749 == 30 || Static73.anInt1749 == 10)) {
			Static352.method4941(-1, -1, Static126.aClass67_Sub1_1.anInt5863, false);
		}
		@Pc(171) boolean local171 = false;
		if (Static70.aBoolean488) {
			Static70.aBoolean488 = false;
			local171 = true;
		}
		if (local171) {
			Static244.method3362();
		}
		if (Static16.aClass30_11 != null && Static16.aClass30_11.method4652() || Static144.method2104() != 1) {
			Static262.method3574();
		}
		if (Static73.anInt1749 == 0) {
			Static267.method3630(Static222.anInt4093, Static245.aColorArray1[Static383.anInt6697], local171, Static450.aColorArray3[Static383.anInt6697], Static449.aColorArray2[Static383.anInt6697], Static372.aString71);
		} else if (Static73.anInt1749 == 5) {
			Static89.method1488(local171 | Static16.aClass30_11.method4652(), Static245.aClass105_4, Static245.aColorArray1[Static383.anInt6697].getRGB(), Static449.aColorArray2[Static383.anInt6697].getRGB(), Static16.aClass30_11, Static450.aColorArray3[Static383.anInt6697].getRGB());
		} else if (Static73.anInt1749 == 10) {
			Static336.method4592();
		} else if (Static73.anInt1749 == 25 || Static73.anInt1749 == 28) {
			if (Static113.anInt2413 == 1) {
				if (Static213.anInt3994 < Static276.anInt4866) {
					Static213.anInt3994 = Static276.anInt4866;
				}
				local88 = (Static213.anInt3994 - Static276.anInt4866) * 50 / Static213.anInt3994;
				Static309.method4260(Static390.aClass105_7, Static104.aClass242_28.method5320(Static139.anInt2670) + "<br>(" + local88 + "%)", true);
			} else if (Static113.anInt2413 == 2) {
				if (Static235.anInt4317 > Static240.anInt4397) {
					Static240.anInt4397 = Static235.anInt4317;
				}
				local88 = (Static240.anInt4397 - Static235.anInt4317) * 50 / Static240.anInt4397 + 50;
				Static309.method4260(Static390.aClass105_7, Static104.aClass242_28.method5320(Static139.anInt2670) + "<br>(" + local88 + "%)", true);
			} else {
				Static309.method4260(Static390.aClass105_7, Static104.aClass242_28.method5320(Static139.anInt2670), true);
			}
		} else if (Static73.anInt1749 == 30) {
			Static164.method2398(local19);
		} else if (Static73.anInt1749 == 40) {
			Static309.method4260(Static390.aClass105_7, Static7.aClass242_3.method5320(Static139.anInt2670) + "<br>" + Static5.aClass242_2.method5320(Static139.anInt2670), true);
		}
		if (Static31.anInt724 == 3) {
			for (local88 = 0; local88 < Static180.anInt3352; local88++) {
				@Pc(398) Rectangle local398 = Class6_Sub4.aRectangleArray4[local88];
				if (Static86.aBooleanArray24[local88]) {
					Static16.aClass30_11.method4692(local398.width, local398.height, local398.x, -1996553985, local398.y);
				} else if (Static203.aBooleanArray11[local88]) {
					Static16.aClass30_11.method4692(local398.width, local398.height, local398.x, -1996554240, local398.y);
				}
			}
		}
		if (Static272.method3664()) {
			Static181.method2912(Static16.aClass30_11);
		}
		if ((Static73.anInt1749 == 30 || Static73.anInt1749 == 10) && Static31.anInt724 == 0 && Static144.method2104() == 1 && !local171 && Static159.aString33.equals("1.1")) {
			local88 = 0;
			for (local92 = 0; local92 < Static180.anInt3352; local92++) {
				if (Static203.aBooleanArray11[local92]) {
					Static203.aBooleanArray11[local92] = false;
					Static214.aRectangleArray5[local88++] = Class6_Sub4.aRectangleArray4[local92];
				}
			}
			Static16.aClass30_11.method4707(Static214.aRectangleArray5, local88);
		} else if (Static73.anInt1749 != 0) {
			Static16.aClass30_11.method4704();
			for (local88 = 0; local88 < Static180.anInt3352; local88++) {
				Static203.aBooleanArray11[local88] = false;
			}
		}
		if (Static126.aClass67_Sub1_1.anInt5845 == 0) {
			Static20.method1515(15L);
		} else if (Static126.aClass67_Sub1_1.anInt5845 == 1) {
			Static20.method1515(10L);
		} else if (Static126.aClass67_Sub1_1.anInt5845 == 2) {
			Static20.method1515(5L);
		} else if (Static126.aClass67_Sub1_1.anInt5845 == 3) {
			Static20.method1515(2L);
		}
		if (Static295.aBoolean365) {
			Static342.method4771();
		}
		if (Static126.aClass67_Sub1_1.aBoolean401 && Static73.anInt1749 == 10 && Static404.anInt6892 != -1) {
			Static126.aClass67_Sub1_1.aBoolean401 = false;
			Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method1101() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static276.method3720();
		Static80.aClass227_1 = new Class227(Static89.aClass114_3);
		Static366.aClass125_3 = new Class125();
		if (Static130.aClass239_4 != Static427.aClass239_7) {
			Static190.aByteArrayArray5 = new byte[50][];
		}
		Static126.aClass67_Sub1_1 = new Class67_Sub1(Static89.aClass114_3);
		if (Static427.aClass239_7 == Static130.aClass239_4) {
			Static220.aString53 = this.getCodeBase().getHost();
			Static444.anInt7413 = 43594;
			Static179.anInt3323 = 443;
		} else if (Static289.method4026(Static130.aClass239_4)) {
			Static220.aString53 = this.getCodeBase().getHost();
			Static179.anInt3323 = Static28.anInt682 + 50000;
			Static444.anInt7413 = Static28.anInt682 + 40000;
		} else if (Static371.aClass239_6 == Static130.aClass239_4) {
			Static444.anInt7413 = Static28.anInt682 + 40000;
			Static179.anInt3323 = Static28.anInt682 + 50000;
			Static220.aString53 = "127.0.0.1";
		}
		Static271.anInt1484 = Static179.anInt3323;
		Static81.anInt1880 = Static444.anInt7413;
		Static224.anInt4140 = Static444.anInt7413;
		Static436.aString70 = Static220.aString53;
		Static274.anInt4849 = Static224.anInt4140;
		if (Static128.aClass95_1 == Static441.aClass95_5) {
			Static91.anInt1984 = 0;
			Static416.aBoolean477 = true;
			Static246.aShortArrayArray7 = Static222.aShortArrayArray5;
			Static356.anInt6380 = 16777215;
			Static99.aShortArray74 = Static115.aShortArray26;
			Static30.aShortArrayArray1 = Static264.aShortArrayArray8;
			Static49.aShortArray14 = Static387.aShortArray100;
		} else {
			Static99.aShortArray74 = Static341.aShortArray75;
			Static49.aShortArray14 = Static389.aShortArray101;
			Static246.aShortArrayArray7 = Static107.aShortArrayArray2;
			Static30.aShortArrayArray1 = Static218.aShortArrayArray4;
		}
		Static69.aShortArray16 = Static410.aShortArray109 = Static367.aShortArray99 = Static47.aShortArray13 = new short[256];
		if (Static159.anInt3000 == 3) {
			Static83.anInt1889 = Static28.anInt682;
		}
		Static23.aClass14_1 = Static108.method1682(Static248.aCanvas5);
		Static284.aClass12_1 = Static34.method631(Static248.aCanvas5);
		Static141.aClass44_1 = Static279.method3736();
		if (Static141.aClass44_1 != null) {
			Static141.aClass44_1.method3469(Static248.aCanvas5);
		}
		Static258.anInt4728 = Static159.anInt3000;
		try {
			if (Static89.aClass114_3.aClass154_1 != null) {
				Static383.aClass162_4 = new Class162(Static89.aClass114_3.aClass154_1, 5200, 0);
				for (@Pc(169) int local169 = 0; local169 < 30; local169++) {
					Static221.aClass162Array3[local169] = new Class162(Static89.aClass114_3.aClass154Array1[local169], 6000, 0);
				}
				Static60.aClass162_1 = new Class162(Static89.aClass114_3.aClass154_2, 6000, 0);
				Static86.aClass113_7 = new Class113(255, Static383.aClass162_4, Static60.aClass162_1, 500000);
				Static442.aClass162_5 = new Class162(Static89.aClass114_3.aClass154_3, 24, 0);
				Static89.aClass114_3.aClass154_2 = null;
				Static89.aClass114_3.aClass154Array1 = null;
				Static89.aClass114_3.aClass154_3 = null;
				Static89.aClass114_3.aClass154_1 = null;
			}
		} catch (@Pc(225) IOException local225) {
			Static442.aClass162_5 = null;
			Static60.aClass162_1 = null;
			Static86.aClass113_7 = null;
			Static383.aClass162_4 = null;
		}
		if (Static130.aClass239_4 != Static427.aClass239_7) {
			Static107.aBoolean174 = true;
		}
		Static59.aString18 = (Static441.aClass95_5 == Static162.aClass95_7 ? Static376.aClass242_93 : Static426.aClass242_81).method5320(Static139.anInt2670);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	protected void method1105() {
		if (Static73.anInt1749 == 1000) {
			return;
		}
		Static175.anInt3261++;
		if (Static175.anInt3261 % 1000 == 1) {
			@Pc(31) GregorianCalendar local31 = new GregorianCalendar();
			Static256.anInt5256 = local31.get(11) * 600 + local31.get(12) * 10 + local31.get(13) / 6;
			Static274.aRandom1.setSeed((long) Static256.anInt5256);
		}
		if (Static175.anInt3261 % 50 == 0) {
			Static240.anInt4394 = Static263.anInt4701;
			Static359.anInt6421 = Static105.anInt2232;
			Static263.anInt4701 = 0;
			Static105.anInt2232 = 0;
		}
		this.method1129();
		if (Static344.aClass73_1 != null) {
			Static344.aClass73_1.method1673();
		}
		Static297.method4119();
		Static23.aClass14_1.method1512();
		Static284.aClass12_1.method4209();
		if (Static141.aClass44_1 != null) {
			@Pc(90) int local90 = Static141.aClass44_1.method3471();
			Static430.anInt7165 = local90;
		}
		if (Static16.aClass30_11 != null) {
			Static16.aClass30_11.method4697((int) Static199.method2845());
		}
		Static245.method3386();
		Static83.anInt1892 = 0;
		for (@Pc(111) Class150 local111 = Static23.aClass14_1.method1513(); local111 != null && Static83.anInt1892 < 128; local111 = Static23.aClass14_1.method1513()) {
			if (local111.method3235() != 1) {
				@Pc(122) char local122 = local111.method3230();
				if (!Static14.method4215() || local122 != '`' && local122 != '§') {
					Static344.aClass150Array1[Static83.anInt1892] = local111;
					Static83.anInt1892++;
				} else if (Static272.method3664()) {
					Static152.method2250();
				} else {
					Static47.method993();
				}
			}
		}
		for (@Pc(165) Class4_Sub10 local165 = Static284.aClass12_1.method4216(); local165 != null; local165 = Static284.aClass12_1.method4216()) {
			@Pc(171) int local171 = local165.method1653();
			if (local171 == -1) {
				Static124.aClass258_18.method5526(local165);
			} else if (Static14.method4217(local171)) {
				Static157.aClass258_24.method5526(local165);
			}
			if (Static157.aClass258_24.method5535() > 10) {
				Static157.aClass258_24.method5530();
			}
		}
		if (Static272.method3664()) {
			Static414.method5432();
		}
		if (Static73.anInt1749 == 0) {
			this.method1125();
			Static208.method2967();
		} else if (Static73.anInt1749 == 5) {
			this.method1125();
			Static208.method2967();
		} else if (Static73.anInt1749 == 25 || Static73.anInt1749 == 28) {
			Static49.method1026();
		}
		if (Static73.anInt1749 == 10) {
			this.method1128();
			Static111.method5045();
			Static193.method5639();
			Static379.method5160();
		} else if (Static73.anInt1749 == 30) {
			Static39.method1430();
		} else if (Static73.anInt1749 == 40) {
			Static379.method5160();
			if (Static452.anInt7565 != -3 && Static452.anInt7565 != 2 && Static452.anInt7565 != 15) {
				Static246.method3390();
			}
		}
		Static312.method4314(Static16.aClass30_11);
		Static157.aClass258_24.method5530();
	}
}
