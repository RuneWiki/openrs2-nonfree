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
				Static286.method5273("argument count");
			}
			Static342.anInt6507 = Integer.parseInt(arg0[0]);
			Static195.anInt3950 = 2;
			if (arg0[1].equals("live")) {
				Static355.anInt6715 = 0;
			} else if (arg0[1].equals("rc")) {
				Static355.anInt6715 = 1;
			} else if (arg0[1].equals("wip")) {
				Static355.anInt6715 = 2;
			} else {
				Static286.method5273("modewhat");
			}
			Static254.anInt5172 = Static30.method716(arg0[2]);
			if (Static254.anInt5172 == -1) {
				if (arg0[2].equals("english")) {
					Static254.anInt5172 = 0;
				} else if (arg0[2].equals("german")) {
					Static254.anInt5172 = 1;
				} else {
					Static286.method5273("language");
				}
			}
			Static230.aBoolean144 = false;
			Static71.aBoolean115 = false;
			if (arg0[3].equals("game0")) {
				Static285.aClass81_4 = Static171.aClass81_1;
			} else if (arg0[3].equals("game1")) {
				Static285.aClass81_4 = Static215.aClass81_2;
			} else {
				Static286.method5273("game");
			}
			Static180.anInt3698 = 0;
			Static220.aString43 = "";
			Static254.anInt5171 = 0;
			Static112.aBoolean184 = true;
			Static285.aBoolean359 = true;
			Static240.anInt4896 = Static285.aClass81_4.anInt2629;
			@Pc(128) client local128 = new client();
			Static48.aClient2 = local128;
			local128.method1056(Static285.aClass81_4.aString20, Static355.anInt6715 + 32);
			Static39.aFrame2.setLocation(40, 40);
		} catch (@Pc(150) Exception local150) {
			Static119.method2541(null, local150);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method1061() {
		@Pc(9) int local9;
		if (!Static367.aBoolean512) {
			for (local9 = 0; local9 < Static27.anInt619; local9++) {
				if (Static204.aClass159Array1[local9].method4340() == 's' || Static204.aClass159Array1[local9].method4340() == 'S') {
					Static367.aBoolean512 = true;
					break;
				}
			}
		}
		@Pc(49) int local49;
		if (Static320.anInt4361 == 0) {
			@Pc(39) Runtime local39 = Runtime.getRuntime();
			local49 = (int) ((local39.totalMemory() - local39.freeMemory()) / 1024L);
			@Pc(54) long local54 = Static183.method3462();
			if (Static29.aLong30 == 0L) {
				Static29.aLong30 = local54;
			}
			if (local49 > 16384 && local54 - Static29.aLong30 < 5000L) {
				if (local54 - Static15.aLong11 > 1000L) {
					System.gc();
					Static15.aLong11 = local54;
				}
				Static367.aString66 = Static208.aClass106_140.method2927(Static254.anInt5172);
				Static367.anInt7054 = 5;
			} else {
				Static367.aString66 = Static362.aClass106_236.method2927(Static254.anInt5172);
				Static320.anInt4361 = 10;
				Static367.anInt7054 = 5;
			}
		} else if (Static320.anInt4361 == 10) {
			for (local9 = 0; local9 < 4; local9++) {
				Static11.aClass196Array2[local9] = Static148.method2878(Static189.anInt3820, Static311.anInt5653);
			}
			Static367.aString66 = Static155.aClass106_113.method2927(Static254.anInt5172);
			Static320.anInt4361 = 20;
			Static367.anInt7054 = 10;
		} else if (Static320.anInt4361 == 20) {
			if (Static221.aClass204_1 == null) {
				Static221.aClass204_1 = new Class204(Static280.aClass191_2, Static200.aClass143_2);
			}
			if (Static221.aClass204_1.method5503()) {
				Static86.aClass30_25 = Static357.method5928(true, 0, false);
				Static176.aClass30_98 = Static357.method5928(true, 1, false);
				Static195.aClass30_57 = Static357.method5928(true, 2, false);
				Static71.aClass30_17 = Static357.method5928(true, 3, false);
				Static265.aClass30_78 = Static357.method5928(true, 4, false);
				Static166.aClass30_53 = Static357.method5928(true, 5, true);
				Static330.aClass30_93 = Static357.method5928(false, 6, true);
				Static140.aClass30_41 = Static357.method5928(true, 7, false);
				Static280.aClass30_83 = Static357.method5928(true, 8, false);
				Static19.aClass30_2 = Static357.method5928(true, 9, false);
				Static73.aClass30_18 = Static357.method5928(true, 10, false);
				Static47.aClass30_11 = Static357.method5928(true, 11, false);
				Static368.aClass30_112 = Static357.method5928(true, 12, false);
				Static101.aClass30_30 = Static357.method5928(true, 13, false);
				Static22.aClass30_104 = Static357.method5928(false, 14, false);
				Static363.aClass30_108 = Static357.method5928(true, 15, false);
				Static83.aClass30_21 = Static357.method5928(true, 16, false);
				Static155.aClass30_46 = Static357.method5928(true, 17, false);
				Static276.aClass30_82 = Static357.method5928(true, 18, false);
				Static270.aClass30_79 = Static357.method5928(true, 19, false);
				Static247.aClass30_75 = Static357.method5928(true, 20, false);
				Static218.aClass30_65 = Static357.method5928(true, 21, false);
				Static34.aClass30_8 = Static357.method5928(true, 22, false);
				Static310.aClass30_88 = Static357.method5928(true, 23, true);
				Static177.aClass30_56 = Static357.method5928(true, 24, false);
				Static84.aClass30_23 = Static357.method5928(true, 25, false);
				Static361.aClass30_107 = Static357.method5928(true, 26, true);
				Static311.aClass30_85 = Static357.method5928(true, 27, false);
				Static273.aClass30_80 = Static357.method5928(true, 28, true);
				Static367.aString66 = Static120.aClass106_93.method2927(Static254.anInt5172);
				Static367.anInt7054 = 15;
				Static320.anInt4361 = 30;
			} else {
				Static367.aString66 = Static112.aClass106_86.method2927(Static254.anInt5172);
				Static367.anInt7054 = 12;
			}
		} else if (Static320.anInt4361 == 30) {
			local9 = 0;
			for (local49 = 0; local49 < 29; local49++) {
				local9 += Static14.aClass51_Sub1Array2[local49].method1742() * Static263.anIntArray410[local49] / 100;
			}
			if (local9 == 100) {
				Static367.aString66 = Static314.aClass106_211.method2927(Static254.anInt5172);
				Static367.anInt7054 = 20;
				Static333.method5602(Static280.aClass30_83);
				Static281.method5015(Static280.aClass30_83);
				Static320.anInt4361 = 40;
			} else {
				if (local9 != 0) {
					Static367.aString66 = Static238.aClass106_164.method2927(Static254.anInt5172) + local9 + "%";
				}
				Static367.anInt7054 = 20;
			}
		} else if (Static320.anInt4361 == 40) {
			if (Static273.aClass30_80.method1164()) {
				this.method1066(Static273.aClass30_80.method1179(1));
				Static367.aString66 = Static281.aClass106_190.method2927(Static254.anInt5172);
				Static320.anInt4361 = 50;
				Static367.anInt7054 = 25;
			} else {
				Static367.aString66 = Static27.aClass106_27.method2927(Static254.anInt5172) + Static273.aClass30_80.method1176() + "%";
				Static367.anInt7054 = 25;
			}
		} else if (Static320.anInt4361 == 50) {
			Static65.method5283(Static299.aBoolean302);
			Static7.aClass1_Sub6_Sub4_1 = new Class1_Sub6_Sub4();
			Static7.aClass1_Sub6_Sub4_1.method4079();
			Static284.aClass48_12 = Static353.method5813(22050, Static227.aClass75_5, 0, Static174.aCanvas3);
			Static284.aClass48_12.method1826(Static7.aClass1_Sub6_Sub4_1);
			Static125.method2619(Static7.aClass1_Sub6_Sub4_1, Static363.aClass30_108, Static22.aClass30_104, Static265.aClass30_78);
			Static61.aClass48_4 = Static353.method5813(2048, Static227.aClass75_5, 1, Static174.aCanvas3);
			Static324.aClass1_Sub6_Sub3_2 = new Class1_Sub6_Sub3();
			Static61.aClass48_4.method1826(Static324.aClass1_Sub6_Sub3_2);
			Static42.aClass70_1 = new Class70(22050, Static14.anInt4962);
			Static148.anInt3111 = Static330.aClass30_93.method1153("scape main");
			Static367.aString66 = Static344.aClass106_167.method2927(Static254.anInt5172);
			Static367.anInt7054 = 30;
			Static320.anInt4361 = 60;
		} else if (Static320.anInt4361 == 60) {
			local9 = Static59.method1446(Static101.aClass30_30, Static280.aClass30_83);
			local49 = Static164.method3100();
			if (local49 > local9) {
				Static367.aString66 = Static67.aClass106_53.method2927(Static254.anInt5172) + local9 * 100 / local49 + "%";
				Static367.anInt7054 = 35;
			} else {
				Static367.aString66 = Static344.aClass106_166.method2927(Static254.anInt5172);
				Static320.anInt4361 = 70;
				Static367.anInt7054 = 35;
			}
		} else if (Static320.anInt4361 == 70) {
			local9 = Static257.method1020(Static280.aClass30_83);
			local49 = Static254.method4767();
			if (local49 > local9) {
				Static367.aString66 = Static254.aClass106_178.method2927(Static254.anInt5172) + local9 * 100 / local49 + "%";
				Static367.anInt7054 = 40;
			} else {
				Static367.aString66 = Static273.aClass106_185.method2927(Static254.anInt5172);
				Static367.anInt7054 = 40;
				Static320.anInt4361 = 80;
			}
		} else if (Static320.anInt4361 == 80) {
			if (Static361.aClass30_107.method1164()) {
				Static314.anInterface3_7 = new Class202(Static361.aClass30_107, Static19.aClass30_2, Static280.aClass30_83);
				Static367.aString66 = Static165.aClass106_118.method2927(Static254.anInt5172);
				Static320.anInt4361 = 90;
				Static367.anInt7054 = 45;
			} else {
				Static367.aString66 = Static39.aClass106_39.method2927(Static254.anInt5172) + Static361.aClass30_107.method1176() + "%";
				Static367.anInt7054 = 45;
			}
		} else if (Static320.anInt4361 == 90) {
			Static367.aString66 = Static79.aClass106_63.method2927(Static254.anInt5172);
			Static367.anInt7054 = 50;
			Static320.anInt4361 = 95;
		} else if (Static320.anInt4361 == 95) {
			if (Static367.aBoolean512) {
				Static289.anInt5617 = 0;
				Static164.anInt3449 = 1;
				Static72.anInt1645 = 0;
				Static359.anInt6875 = 0;
				Static209.anInt4164 = 0;
			}
			Static367.aBoolean512 = true;
			Static206.method4914(Static227.aClass75_5);
			Static121.method2546(false, Static359.anInt6875);
			Static367.aString66 = Static48.aClass106_104.method2927(Static254.anInt5172);
			Static320.anInt4361 = 100;
			Static367.anInt7054 = 55;
		} else if (Static320.anInt4361 == 100) {
			Static54.method6034(Static9.aClass63_1, Static101.aClass30_30, Static280.aClass30_83);
			Static367.aString66 = Static127.aClass106_99.method2927(Static254.anInt5172);
			Static367.anInt7054 = 60;
			Static44.method1064(5);
			Static320.anInt4361 = 110;
		} else if (Static320.anInt4361 == 110) {
			Static195.aClass30_57.method1164();
			local9 = Static195.aClass30_57.method1176();
			Static83.aClass30_21.method1164();
			local9 += Static83.aClass30_21.method1176();
			Static155.aClass30_46.method1164();
			local9 += Static155.aClass30_46.method1176();
			Static276.aClass30_82.method1164();
			local9 += Static276.aClass30_82.method1176();
			Static270.aClass30_79.method1164();
			local9 += Static270.aClass30_79.method1176();
			Static247.aClass30_75.method1164();
			local9 += Static247.aClass30_75.method1176();
			Static218.aClass30_65.method1164();
			local9 += Static218.aClass30_65.method1176();
			Static34.aClass30_8.method1164();
			local9 += Static34.aClass30_8.method1176();
			Static177.aClass30_56.method1164();
			local9 += Static177.aClass30_56.method1176();
			Static84.aClass30_23.method1164();
			local9 += Static84.aClass30_23.method1176();
			Static311.aClass30_85.method1164();
			local9 += Static311.aClass30_85.method1176();
			if (local9 < 1100) {
				Static367.aString66 = Static362.aClass106_235.method2927(Static254.anInt5172) + local9 / 11 + "%";
				Static367.anInt7054 = 65;
			} else {
				Static10.method317(Static195.aClass30_57);
				Static211.method3899(Static195.aClass30_57);
				Static33.method847(Static195.aClass30_57);
				Static304.method5263(Static195.aClass30_57, Static140.aClass30_41);
				Static85.method1807(Static140.aClass30_41, Static83.aClass30_21, Static254.anInt5172);
				Static95.method1828(Static140.aClass30_41, Static254.anInt5172, Static276.aClass30_82);
				Static243.aClass220_2 = new Class220(Static285.aClass81_4, Static254.anInt5172, true, Static270.aClass30_79, Static140.aClass30_41);
				Static130.method2677(Static195.aClass30_57);
				Static43.method4863(Static86.aClass30_25, Static247.aClass30_75, Static176.aClass30_98);
				Static40.method951(Static195.aClass30_57);
				Static285.method4341(Static218.aClass30_65, Static140.aClass30_41);
				Static296.method5174(Static34.aClass30_8);
				Static352.method1733(Static195.aClass30_57);
				Static119.method2531(Static280.aClass30_83, Static71.aClass30_17, Static140.aClass30_41, Static101.aClass30_30);
				Static113.method2412(Static195.aClass30_57);
				Static50.method1204(Static155.aClass30_46);
				Static149.method2886(Static84.aClass30_23, Static177.aClass30_56, new Class124());
				Static40.method952(Static177.aClass30_56, Static84.aClass30_23);
				Static366.method6068(Static195.aClass30_57);
				Static124.method2605(Static195.aClass30_57);
				Static280.method5006(Static195.aClass30_57);
				Static364.method6052(Static280.aClass30_83, Static195.aClass30_57);
				Static208.method3816(Static195.aClass30_57, Static280.aClass30_83);
				Static112.method2385(Static195.aClass30_57);
				Static310.method5371(Static280.aClass30_83, Static195.aClass30_57);
				Static308.method5348(Static195.aClass30_57);
				Static304.method5266(Static195.aClass30_57);
				Static367.aString66 = Static85.aClass106_68.method2927(Static254.anInt5172);
				Static367.anInt7054 = 65;
				Static330.method5558();
				Static71.method1584();
				Static320.anInt4361 = 120;
			}
		} else if (Static320.anInt4361 == 120) {
			local9 = Static187.method3508(Static280.aClass30_83);
			local49 = Static44.method1083();
			if (local9 < local49) {
				Static367.aString66 = Static349.aClass106_227.method2927(Static254.anInt5172) + local9 * 100 / local49 + "%";
				Static367.anInt7054 = 70;
			} else {
				Static263.method4796(Static9.aClass63_1, Static280.aClass30_83);
				Static337.method5671(Static240.aClass4Array16);
				Static367.aString66 = Static290.aClass106_200.method2927(Static254.anInt5172);
				Static367.anInt7054 = 70;
				Static320.anInt4361 = 130;
			}
		} else if (Static320.anInt4361 == 130) {
			Static367.aString66 = Static24.aClass106_23.method2927(Static254.anInt5172);
			Static320.anInt4361 = 140;
			Static367.anInt7054 = 75;
		} else if (Static320.anInt4361 == 140) {
			if (Static73.aClass30_18.method1178("huffman", "")) {
				@Pc(1144) Class215 local1144 = new Class215(Static73.aClass30_18.method1184("huffman", ""));
				Static221.method4130(local1144);
				Static367.aString66 = Static76.aClass106_61.method2927(Static254.anInt5172);
				Static367.anInt7054 = 80;
				Static320.anInt4361 = 150;
			} else {
				Static367.aString66 = Static110.aClass106_85.method2927(Static254.anInt5172) + "0%";
				Static367.anInt7054 = 80;
			}
		} else if (Static320.anInt4361 == 150) {
			if (!Static71.aClass30_17.method1164()) {
				Static367.aString66 = Static242.aClass106_170.method2927(Static254.anInt5172) + Static71.aClass30_17.method1176() * 3 / 4 + "%";
				Static367.anInt7054 = 85;
			} else if (!Static368.aClass30_112.method1164()) {
				Static367.aString66 = Static242.aClass106_170.method2927(Static254.anInt5172) + (Static368.aClass30_112.method1176() / 10 + 75) + "%";
				Static367.anInt7054 = 85;
			} else if (!Static101.aClass30_30.method1164()) {
				Static367.aString66 = Static242.aClass106_170.method2927(Static254.anInt5172) + (Static101.aClass30_30.method1176() / 20 + 85) + "%";
				Static367.anInt7054 = 85;
			} else if (Static310.aClass30_88.method1182("details")) {
				Static269.method3040(Static310.aClass30_88);
				Static144.method2859(Static311.aClass30_85);
				Static235.method4354(Static140.aClass30_41, Static314.anInterface3_7);
				Static367.aString66 = Static228.aClass106_157.method2927(Static254.anInt5172);
				Static320.anInt4361 = 160;
				Static367.anInt7054 = 85;
			} else {
				Static367.aString66 = Static242.aClass106_170.method2927(Static254.anInt5172) + (Static310.aClass30_88.method1185("details") / 10 + 90) + "%";
				Static367.anInt7054 = 85;
			}
		} else if (Static320.anInt4361 == 160) {
			local9 = Static182.method3459();
			if (local9 == -1) {
				Static367.aString66 = Static82.aClass106_66.method2927(Static254.anInt5172);
				Static367.anInt7054 = 90;
			} else if (local9 == 7 || local9 == 9) {
				this.method1059("worldlistfull");
				Static44.method1064(1000);
			} else if (Static12.aBoolean15) {
				Static367.aString66 = Static116.aClass106_88.method2927(Static254.anInt5172);
				Static320.anInt4361 = 170;
				Static367.anInt7054 = 90;
			} else {
				this.method1059("worldlistio_" + local9);
				Static44.method1064(1000);
			}
		} else if (Static320.anInt4361 == 170) {
			Static304.aStringArray37 = new String[Static220.anInt4449];
			Static7.anIntArray24 = new int[Static301.anInt5789];
			Static237.aBooleanArray11 = new boolean[Static301.anInt5789];
			for (local9 = 0; local9 < Static301.anInt5789; local9++) {
				if (Static364.method6049(local9).anInt6469 == 0) {
					Static237.aBooleanArray11[local9] = true;
					Static338.anInt6427++;
				}
				Static7.anIntArray24[local9] = -1;
			}
			Static49.method1147();
			Static301.anInt5788 = Static71.aClass30_17.method1153("loginscreen");
			Static166.aClass30_53.method1148(false);
			Static330.aClass30_93.method1148(true);
			Static280.aClass30_83.method1148(true);
			Static101.aClass30_30.method1148(true);
			Static73.aClass30_18.method1148(true);
			Static71.aClass30_17.method1148(true);
			Static195.aClass30_57.anInt1229 = 2;
			Static270.aBoolean401 = true;
			Static155.aClass30_46.anInt1229 = 2;
			Static83.aClass30_21.anInt1229 = 2;
			Static276.aClass30_82.anInt1229 = 2;
			Static270.aClass30_79.anInt1229 = 2;
			Static247.aClass30_75.anInt1229 = 2;
			Static218.aClass30_65.anInt1229 = 2;
			Static194.method3635(Static164.anInt3449, -1, -1, false);
			Static367.aString66 = Static140.aClass106_109.method2927(Static254.anInt5172);
			Static367.anInt7054 = 95;
			Static320.anInt4361 = 180;
		} else if (Static320.anInt4361 == 180) {
			Static10.method318(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method1062() {
		@Pc(7) boolean local7 = Static280.aClass191_2.method5183();
		if (!local7) {
			this.method1063();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method1063() {
		if (Static134.anInt2900 < Static280.aClass191_2.anInt5732) {
			if (Static29.anInt680 == Static201.anInt4056) {
				Static201.anInt4056 = Static270.anInt5271;
			} else {
				Static201.anInt4056 = Static29.anInt680;
			}
			Static124.anInt2723 = (Static280.aClass191_2.anInt5732 * 50 - 50) * 5;
			if (Static124.anInt2723 > 3000) {
				Static124.anInt2723 = 3000;
			}
			if (Static280.aClass191_2.anInt5732 >= 2 && Static280.aClass191_2.anInt5731 == 6) {
				this.method1059("js5connect_outofdate");
				Static13.anInt334 = 1000;
				return;
			}
			if (Static280.aClass191_2.anInt5732 >= 4 && Static280.aClass191_2.anInt5731 == -1) {
				this.method1059("js5crc");
				Static13.anInt334 = 1000;
				return;
			}
			if (Static280.aClass191_2.anInt5732 >= 4 && (Static13.anInt334 == 0 || Static13.anInt334 == 5)) {
				if (Static280.aClass191_2.anInt5731 == 7 || Static280.aClass191_2.anInt5731 == 9) {
					this.method1059("js5connect_full");
				} else if (Static280.aClass191_2.anInt5731 <= 0) {
					this.method1059("js5io");
				} else {
					this.method1059("js5connect");
				}
				Static13.anInt334 = 1000;
				return;
			}
		}
		Static134.anInt2900 = Static280.aClass191_2.anInt5732;
		if (Static124.anInt2723 > 0) {
			Static124.anInt2723--;
			return;
		}
		try {
			if (Static98.anInt2258 == 0) {
				Static287.aClass121_8 = Static227.aClass75_5.method2359(Static306.aString53, Static201.anInt4056);
				Static98.anInt2258++;
			}
			if (Static98.anInt2258 == 1) {
				if (Static287.aClass121_8.anInt3693 == 2) {
					this.method1074(1000);
					return;
				}
				if (Static287.aClass121_8.anInt3693 == 1) {
					Static98.anInt2258++;
				}
			}
			if (Static98.anInt2258 == 2) {
				Static281.aClass76_3 = new Class76((Socket) Static287.aClass121_8.anObject2, Static227.aClass75_5);
				@Pc(171) Class1_Sub7 local171 = new Class1_Sub7(5);
				local171.method2121(Static204.aClass103_2.anInt3138);
				local171.method2115(571);
				Static281.aClass76_3.method2376(5, local171.aByteArray41);
				Static98.anInt2258++;
				Static365.aLong218 = Static183.method3462();
			}
			if (Static98.anInt2258 == 3) {
				if (Static13.anInt334 == 0 || Static13.anInt334 == 5 || Static281.aClass76_3.method2387() > 0) {
					@Pc(230) int local230 = Static281.aClass76_3.method2379();
					if (local230 != 0) {
						this.method1074(local230);
						return;
					}
					Static98.anInt2258++;
				} else if (Static183.method3462() - Static365.aLong218 > 30000L) {
					this.method1074(1001);
					return;
				}
			}
			if (Static98.anInt2258 == 4) {
				@Pc(261) boolean local261 = Static13.anInt334 == 5 || Static13.anInt334 == 10 || Static13.anInt334 == 28;
				Static280.aClass191_2.method5182(Static281.aClass76_3, !local261);
				Static98.anInt2258 = 0;
				Static287.aClass121_8 = null;
				Static281.aClass76_3 = null;
			}
		} catch (@Pc(285) IOException local285) {
			this.method1074(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V")
	private void method1066(@OriginalArg(1) byte[] arg0) {
		@Pc(14) Class1_Sub7 local14 = new Class1_Sub7(arg0);
		while (true) {
			while (true) {
				@Pc(18) int local18 = local14.method2132();
				if (local18 == 0) {
					return;
				}
				if (local18 == 1) {
					@Pc(32) int[] local32 = Static17.anIntArray168 = new int[6];
					local32[0] = local14.method2161();
					local32[1] = local14.method2161();
					local32[2] = local14.method2161();
					local32[3] = local14.method2161();
					local32[4] = local14.method2161();
					local32[5] = local14.method2161();
				} else {
					@Pc(79) int local79;
					@Pc(84) int local84;
					if (local18 == 4) {
						local79 = local14.method2132();
						Static154.anIntArray230 = new int[local79];
						for (local84 = 0; local84 < local79; local84++) {
							Static154.anIntArray230[local84] = local14.method2161();
							if (Static154.anIntArray230[local84] == 65535) {
								Static154.anIntArray230[local84] = -1;
							}
						}
					} else if (local18 == 5) {
						local79 = local14.method2132();
						Static217.anIntArray349 = new int[local79];
						for (local84 = 0; local84 < local79; local84++) {
							Static217.anIntArray349[local84] = local14.method2161();
							if (Static217.anIntArray349[local84] == 65535) {
								Static217.anIntArray349[local84] = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method1068() {
		Static217.anInt4314++;
		Static143.method2851(-1, -1, null);
		Static113.method2409(-1, null, -1);
		Static144.method2857();
		Static356.anInt6822++;
		for (@Pc(27) int local27 = 0; local27 < 32768; local27++) {
			@Pc(33) Class11_Sub2_Sub6_Sub2 local33 = Static231.aClass11_Sub2_Sub6_Sub2Array1[local27];
			if (local33 != null) {
				@Pc(39) byte local39 = local33.aClass208_1.aByte66;
				if ((local39 & 0x1) != 0) {
					@Pc(50) int local50 = local33.method5894();
					@Pc(77) int local77;
					if ((local39 & 0x2) != 0 && local33.anInt6798 == 0 && Math.random() * 1000.0D < 10.0D) {
						local77 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(85) int local85 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local77 != 0 || local85 != 0) {
							@Pc(99) int local99 = local77 + local33.anIntArray505[0];
							if (local99 < 0) {
								local99 = 0;
							} else if (local99 > Static311.anInt5653 - local50 - 1) {
								local99 = Static311.anInt5653 - local50 - 1;
							}
							@Pc(131) int local131 = local85 + local33.anIntArray504[0];
							if (local131 < 0) {
								local131 = 0;
							} else if (Static189.anInt3820 - local50 - 1 < local131) {
								local131 = Static189.anInt3820 - local50 - 1;
							}
							@Pc(185) int local185 = Static279.method4985(-1, local50, 0, true, local99, local50, 0, local33.anIntArray505[0], Static133.anIntArray215, Static11.aClass196Array2[local33.aByte79], local33.anIntArray504[0], local131, local50, Static15.anIntArray27);
							if (local185 > 0) {
								if (local185 > 9) {
									local185 = 9;
								}
								for (@Pc(199) int local199 = 0; local199 < local185; local199++) {
									local33.anIntArray505[local199] = Static133.anIntArray215[local185 - local199 - 1];
									local33.anIntArray504[local199] = Static15.anIntArray27[local185 - local199 - 1];
									local33.aByteArray97[local199] = 1;
								}
								local33.anInt6798 = local185;
							}
						}
					}
					Static277.method4938(true, local33);
					local77 = Static285.method4343(local33);
					Static320.method4036(Static156.anInt3217, local33, local77, Static83.anInt1863);
					Static87.method1814(local33);
				}
			}
		}
		if (Static184.anInt3735 == 0 && Static180.anInt3696 == 0) {
			if (Static50.anInt1273 == 2) {
				Static123.method2600();
			} else {
				Static218.method4030();
			}
			if (Static14.anInt4971 >> 7 < 14 || Static14.anInt4971 >> 7 >= Static311.anInt5653 - 14 || Static260.anInt5192 >> 7 < 14 || Static189.anInt3820 - 14 <= Static260.anInt5192 >> 7) {
				Static62.method1476();
			}
		}
		while (true) {
			@Pc(318) Class1_Sub35 local318;
			@Pc(323) Class112 local323;
			@Pc(331) Class112 local331;
			do {
				local318 = (Class1_Sub35) Static180.aClass42_31.method1541();
				if (local318 == null) {
					while (true) {
						do {
							local318 = (Class1_Sub35) Static154.aClass42_17.method1541();
							if (local318 == null) {
								while (true) {
									do {
										local318 = (Class1_Sub35) Static215.aClass42_37.method1541();
										if (local318 == null) {
											if (Static243.aClass112_15 != null) {
												Static210.method3869();
											}
											if (Static51.anInt1301 % 1500 == 0) {
												Static211.method3897();
											}
											Static216.method3984();
											if (Static174.aBoolean271 && Static123.aLong98 < Static183.method3462() - 60000L) {
												Static344.method4471();
												return;
											}
											return;
										}
										local323 = local318.aClass112_16;
										if (local323.anInt3398 < 0) {
											break;
										}
										local331 = Static188.method3536(local323.anInt3428);
									} while (local331 == null || local331.aClass112Array2 == null || local331.aClass112Array2.length <= local323.anInt3398 || local323 != local331.aClass112Array2[local323.anInt3398]);
									Static302.method5243(local318);
								}
							}
							local323 = local318.aClass112_16;
							if (local323.anInt3398 < 0) {
								break;
							}
							local331 = Static188.method3536(local323.anInt3428);
						} while (local331 == null || local331.aClass112Array2 == null || local323.anInt3398 >= local331.aClass112Array2.length || local331.aClass112Array2[local323.anInt3398] != local323);
						Static302.method5243(local318);
					}
				}
				local323 = local318.aClass112_16;
				if (local323.anInt3398 < 0) {
					break;
				}
				local331 = Static188.method3536(local323.anInt3428);
			} while (local331 == null || local331.aClass112Array2 == null || local331.aClass112Array2.length <= local323.anInt3398 || local323 != local331.aClass112Array2[local323.anInt3398]);
			Static302.method5243(local318);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method1058() {
		if (Static174.aBoolean271) {
			Static344.method4471();
		}
		if (Static9.aClass63_1 != null) {
			Static9.aClass63_1.method4625();
		}
		if (Static31.aFrame1 != null) {
			Static187.method3509(Static227.aClass75_5, Static31.aFrame1);
			Static31.aFrame1 = null;
		}
		if (Static165.aClass76_2 != null) {
			Static165.aClass76_2.method2377();
			Static165.aClass76_2 = null;
		}
		if (Static8.aClass29_1 != null) {
			Static8.aClass29_1.method2775(Static174.aCanvas3);
		}
		Static8.aClass29_1 = null;
		if (Static284.aClass48_12 != null) {
			Static284.aClass48_12.method1833();
		}
		if (Static61.aClass48_4 != null) {
			Static61.aClass48_4.method1833();
		}
		Static280.aClass191_2.method5185();
		Static200.aClass143_2.method3810();
		if (Static149.aClass117_1 != null) {
			Static149.aClass117_1.method3398();
			Static149.aClass117_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method1044() {
		if (Static13.anInt334 == 1000) {
			return;
		}
		@Pc(16) long local16 = Static240.method4475() / 1000000L - Static163.aLong121;
		Static163.aLong121 = Static240.method4475() / 1000000L;
		@Pc(24) boolean local24 = Static131.method2691();
		if (local24 && Static298.aBoolean482 && Static284.aClass48_12 != null) {
			Static284.aClass48_12.method1837();
		}
		if (Static13.anInt334 == 30 || Static13.anInt334 == 10) {
			if (Static154.aLong114 != 0L && Static183.method3462() > Static154.aLong114) {
				Static194.method3635(Static300.method5230(), Static42.anInt1013, Static170.anInt3543, false);
			} else if (Static9.aClass63_1.method4602() && Static108.aBoolean177) {
				Static215.method3976();
			}
		}
		@Pc(87) int local87;
		if (Static31.aFrame1 == null) {
			@Pc(75) Container local75;
			if (Static39.aFrame2 == null) {
				local75 = Static227.aClass75_5.anApplet1;
			} else {
				local75 = Static39.aFrame2;
			}
			@Pc(83) int local83 = local75.getSize().width;
			local87 = local75.getSize().height;
			if (Static39.aFrame2 == local75) {
				@Pc(93) Insets local93 = Static39.aFrame2.getInsets();
				local87 -= local93.top + local93.bottom;
				local83 -= local93.right + local93.left;
			}
			if (Static210.anInt4185 != local83 || local87 != Static281.anInt5472) {
				if (Static9.aClass63_1 == null || Static9.aClass63_1.method4599()) {
					Static124.method2602();
				} else {
					Static281.anInt5472 = local87;
					Static210.anInt4185 = local83;
				}
				Static154.aLong114 = Static183.method3462() + 500L;
			}
		}
		if (Static31.aFrame1 != null && !Static177.aBoolean275 && (Static13.anInt334 == 30 || Static13.anInt334 == 10)) {
			Static194.method3635(Static164.anInt3449, -1, -1, false);
		}
		@Pc(163) boolean local163 = false;
		if (Static237.aBoolean198) {
			local163 = true;
			Static237.aBoolean198 = false;
		}
		if (local163) {
			Static136.method4750();
		}
		if (Static9.aClass63_1 != null && Static9.aClass63_1.method4578() || Static300.method5230() != 1) {
			Static113.method2415();
		}
		if (Static13.anInt334 == 0) {
			Static359.method5947(Static367.anInt7054, Static367.aString66, Static273.aColorArray2[Static240.anInt4896], Static137.aColorArray1[Static240.anInt4896], Static336.aColorArray3[Static240.anInt4896], local163);
		} else if (Static13.anInt334 == 5) {
			Static319.method5496(local163 | Static9.aClass63_1.method4578(), Static336.aColorArray3[Static240.anInt4896].getRGB(), Static273.aColorArray2[Static240.anInt4896].getRGB(), Static137.aColorArray1[Static240.anInt4896].getRGB(), Static340.aClass33_3, Static9.aClass63_1);
		} else if (Static13.anInt334 == 10) {
			Static59.method1449();
		} else if (Static13.anInt334 == 25 || Static13.anInt334 == 28) {
			if (Static295.anInt5680 == 1) {
				if (Static210.anInt4182 > Static280.anInt5470) {
					Static280.anInt5470 = Static210.anInt4182;
				}
				local87 = (Static280.anInt5470 - Static210.anInt4182) * 50 / Static280.anInt5470;
				Static291.method5127(true, Static313.aClass106_210.method2927(Static254.anInt5172) + "<br>(" + local87 + "%)", Static24.aClass33_1);
			} else if (Static295.anInt5680 == 2) {
				if (Static314.anInt6028 > Static90.anInt2053) {
					Static90.anInt2053 = Static314.anInt6028;
				}
				local87 = (Static90.anInt2053 - Static314.anInt6028) * 50 / Static90.anInt2053 + 50;
				Static291.method5127(true, Static313.aClass106_210.method2927(Static254.anInt5172) + "<br>(" + local87 + "%)", Static24.aClass33_1);
			} else {
				Static291.method5127(true, Static313.aClass106_210.method2927(Static254.anInt5172), Static24.aClass33_1);
			}
		} else if (Static13.anInt334 == 30) {
			Static166.method3125(local16);
		} else if (Static13.anInt334 == 40) {
			Static291.method5127(true, Static273.aClass106_184.method2927(Static254.anInt5172) + "<br>" + Static289.aClass106_194.method2927(Static254.anInt5172), Static24.aClass33_1);
		}
		if (Static332.anInt6250 == 3) {
			for (local87 = 0; local87 < Static77.anInt1698; local87++) {
				@Pc(384) Rectangle local384 = Class11_Sub1_Sub2.aRectangleArray2[local87];
				if (Static240.aBooleanArray26[local87]) {
					Static9.aClass63_1.method4639(local384.y, local384.x, local384.height, -1996553985, local384.width);
				} else if (Static149.aBooleanArray16[local87]) {
					Static9.aClass63_1.method4639(local384.y, local384.x, local384.height, -1996554240, local384.width);
				}
			}
		}
		if (Static84.method1781()) {
			Static187.method3510(Static9.aClass63_1);
		}
		if ((Static13.anInt334 == 30 || Static13.anInt334 == 10) && Static332.anInt6250 == 0 && Static300.method5230() == 1 && !local163 && Static111.aString16.equals("1.1")) {
			local87 = 0;
			for (@Pc(475) int local475 = 0; local475 < Static77.anInt1698; local475++) {
				if (Static149.aBooleanArray16[local475]) {
					Static149.aBooleanArray16[local475] = false;
					Static154.aRectangleArray1[local87++] = Class11_Sub1_Sub2.aRectangleArray2[local475];
				}
			}
			Static9.aClass63_1.method4632(Static154.aRectangleArray1, local87);
		} else if (Static13.anInt334 != 0) {
			Static9.aClass63_1.method4647();
			for (local87 = 0; local87 < Static77.anInt1698; local87++) {
				Static149.aBooleanArray16[local87] = false;
			}
		}
		if (Static300.anInt5779 == 0) {
			Static135.method2737(15L);
		} else if (Static300.anInt5779 == 1) {
			Static135.method2737(10L);
		} else if (Static300.anInt5779 == 2) {
			Static135.method2737(5L);
		} else if (Static300.anInt5779 == 3) {
			Static135.method2737(2L);
		}
		if (Static270.aBoolean401) {
			Static319.method5495();
		}
		if (Static367.aBoolean512 && Static13.anInt334 == 10 && Static336.anInt6389 != -1) {
			Static367.aBoolean512 = false;
			Static206.method4914(Static227.aClass75_5);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1054()) {
			return;
		}
		Static342.anInt6507 = Integer.parseInt(this.getParameter("worldid"));
		Static195.anInt3950 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static195.anInt3950 < 0 || Static195.anInt3950 > 1) {
			Static195.anInt3950 = 0;
		}
		Static355.anInt6715 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static355.anInt6715 < 0 || Static355.anInt6715 > 2) {
			Static355.anInt6715 = 0;
		}
		try {
			Static254.anInt5172 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(49) Exception local49) {
			Static254.anInt5172 = 0;
		}
		@Pc(55) String local55 = this.getParameter("objecttag");
		if (local55 != null && local55.equals("1")) {
			Static230.aBoolean144 = true;
		} else {
			Static230.aBoolean144 = false;
		}
		@Pc(71) String local71 = this.getParameter("js");
		if (local71 != null && local71.equals("1")) {
			Static71.aBoolean115 = true;
		} else {
			Static71.aBoolean115 = false;
		}
		@Pc(87) String local87 = this.getParameter("advert");
		if (local87 != null && local87.equals("1")) {
			Static332.aBoolean467 = true;
		} else {
			Static332.aBoolean467 = false;
		}
		@Pc(103) String local103 = this.getParameter("game");
		if (local103 != null && local103.equals("1")) {
			Static285.aClass81_4 = Static215.aClass81_2;
		} else {
			Static285.aClass81_4 = Static171.aClass81_1;
		}
		try {
			Static180.anInt3698 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(122) Exception local122) {
			Static180.anInt3698 = 0;
		}
		Static310.aString55 = this.getParameter("quiturl");
		Static220.aString43 = this.getParameter("settings");
		if (Static220.aString43 == null) {
			Static220.aString43 = "";
		}
		@Pc(140) String local140 = this.getParameter("country");
		if (local140 != null) {
			try {
				Static254.anInt5171 = Integer.parseInt(local140);
			} catch (@Pc(147) Exception local147) {
				Static254.anInt5171 = 0;
			}
		}
		Static240.anInt4896 = Integer.parseInt(this.getParameter("colourid"));
		if (Static240.anInt4896 < 0 || Static240.anInt4896 >= Static137.aColorArray1.length) {
			Static240.anInt4896 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static112.aBoolean184 = true;
			Static285.aBoolean359 = true;
		}
		if (Static171.aClass81_1 == Static285.aClass81_4) {
			Static142.anInt3063 = 503;
			Static82.anInt1847 = 765;
		} else if (Static285.aClass81_4 == Static215.aClass81_2) {
			Static82.anInt1847 = 640;
			Static142.anInt3063 = 480;
		}
		Static48.aClient2 = this;
		this.method1057(Static355.anInt6715 + 32, Static82.anInt1847, Static142.anInt3063);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method1055() {
		if (Static13.anInt334 == 1000) {
			return;
		}
		Static51.anInt1301++;
		if (Static51.anInt1301 % 1000 == 1) {
			@Pc(34) GregorianCalendar local34 = new GregorianCalendar();
			Static27.anInt622 = local34.get(11) * 600 + local34.get(12) * 10 + local34.get(13) / 6;
			Static166.aRandom1.setSeed((long) Static27.anInt622);
		}
		this.method1062();
		if (Static221.aClass204_1 != null) {
			Static221.aClass204_1.method5501();
		}
		Static304.method5268();
		Static82.method1769();
		Static271.aClass60_2.method1870();
		Static164.aClass142_1.method4910();
		if (Static8.aClass29_1 != null) {
			@Pc(80) int local80 = Static8.aClass29_1.method2781();
			Static140.anInt3024 = local80;
		}
		if (Static9.aClass63_1 != null) {
			Static9.aClass63_1.method4633((int) Static183.method3462());
		}
		Static24.method614();
		Static27.anInt619 = 0;
		for (@Pc(97) Class159 local97 = Static271.aClass60_2.method1865(); local97 != null && Static27.anInt619 < 128; local97 = Static271.aClass60_2.method1865()) {
			if (local97.method4336() != 1) {
				@Pc(110) char local110 = local97.method4340();
				if (!Static241.method4501() || local110 != '`' && local110 != '§') {
					Static204.aClass159Array1[Static27.anInt619] = local97;
					Static27.anInt619++;
				} else if (Static84.method1781()) {
					Static243.method4544();
				} else {
					Static54.method6030();
				}
			}
		}
		Static189.aClass1_Sub8_1 = null;
		for (@Pc(155) Class1_Sub8 local155 = Static164.aClass142_1.method4918(); local155 != null; local155 = Static164.aClass142_1.method4918()) {
			@Pc(161) int local161 = local155.method598();
			if (local161 == -1) {
				Static355.aClass42_45.method1549(local155);
			} else if (Static357.method5930(local161)) {
				Static189.aClass1_Sub8_1 = local155;
			}
		}
		if (Static84.method1781()) {
			Static235.method4355();
		}
		if (Static13.anInt334 == 0) {
			this.method1061();
			Static160.method3013();
		} else if (Static13.anInt334 == 5) {
			this.method1061();
			Static160.method3013();
		} else if (Static13.anInt334 == 25 || Static13.anInt334 == 28) {
			Static257.method1017();
		}
		if (Static13.anInt334 == 10) {
			this.method1068();
			Static29.method702();
			Static215.method3979();
			Static234.method4345();
		} else if (Static13.anInt334 == 30) {
			Static210.method3871();
		} else if (Static13.anInt334 == 40) {
			Static234.method4345();
			if (Static171.anInt3577 != -3 && Static171.anInt3577 != 2 && Static171.anInt3577 != 15) {
				Static294.method5141();
			}
		}
		Static294.method5140(Static9.aClass63_1);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method1074(@OriginalArg(0) int arg0) {
		Static280.aClass191_2.anInt5731 = arg0;
		Static281.aClass76_3 = null;
		Static287.aClass121_8 = null;
		Static280.aClass191_2.anInt5732++;
		Static98.anInt2258 = 0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method1045() {
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method1047() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static124.method2602();
		Static200.aClass143_2 = new Class143(Static227.aClass75_5);
		Static280.aClass191_2 = new Class191();
		if (Static355.anInt6715 != 0) {
			Static291.aByteArrayArray16 = new byte[50][];
		}
		Static65.method5285(Static227.aClass75_5);
		if (Static195.anInt3950 == 0) {
			Static306.aString54 = this.getCodeBase().getHost();
			Static293.anInt4949 = 443;
			Static345.anInt6538 = 43594;
		} else if (Static195.anInt3950 == 1) {
			Static306.aString54 = this.getCodeBase().getHost();
			Static345.anInt6538 = Static342.anInt6507 + 40000;
			Static293.anInt4949 = Static342.anInt6507 + 50000;
		} else if (Static195.anInt3950 == 2) {
			Static293.anInt4949 = Static342.anInt6507 + 50000;
			Static345.anInt6538 = Static342.anInt6507 + 40000;
			Static306.aString54 = "127.0.0.1";
		}
		Static225.anInt4520 = Static345.anInt6538;
		Static29.anInt680 = Static345.anInt6538;
		Static306.aString53 = Static306.aString54;
		Static270.anInt5271 = Static293.anInt4949;
		if (Static111.anInt2479 == 3) {
			Static239.anInt4853 = Static342.anInt6507;
		}
		if (Static285.aClass81_4 == Static215.aClass81_2) {
			Static140.aShortArray63 = Static180.aShortArray77;
			Static217.aShortArrayArray6 = Static31.aShortArrayArray1;
			Static272.aBoolean405 = true;
			Static339.anInt6002 = 16777215;
			Static220.aShortArrayArray7 = Static174.aShortArrayArray5;
			Static123.aShortArray59 = Static152.aShortArray65;
			Static28.anInt665 = 0;
		} else {
			Static123.aShortArray59 = Static99.aShortArray53;
			Static220.aShortArrayArray7 = Static129.aShortArrayArray4;
			Static217.aShortArrayArray6 = Static40.aShortArrayArray2;
			Static140.aShortArray63 = Static116.aShortArray58;
		}
		Static201.anInt4056 = Static225.anInt4520;
		Static218.aShortArray87 = Static149.aShortArray64 = Static65.aShortArray99 = Static27.aShortArray15 = new short[256];
		Static271.aClass60_2 = Static323.method4446(Static174.aCanvas3);
		Static164.aClass142_1 = Static132.method2713(Static174.aCanvas3);
		Static8.aClass29_1 = Static33.method856();
		if (Static8.aClass29_1 != null) {
			Static8.aClass29_1.method2778(Static174.aCanvas3);
		}
		Static274.anInt5325 = Static111.anInt2479;
		try {
			if (Static227.aClass75_5.aClass183_1 != null) {
				Static235.aClass162_4 = new Class162(Static227.aClass75_5.aClass183_1, 5200, 0);
				for (@Pc(168) int local168 = 0; local168 < 29; local168++) {
					Static336.aClass162Array1[local168] = new Class162(Static227.aClass75_5.aClass183Array1[local168], 6000, 0);
				}
				Static289.aClass162_5 = new Class162(Static227.aClass75_5.aClass183_2, 6000, 0);
				Static90.aClass28_3 = new Class28(255, Static235.aClass162_4, Static289.aClass162_5, 500000);
				Static5.aClass162_1 = new Class162(Static227.aClass75_5.aClass183_3, 24, 0);
				Static227.aClass75_5.aClass183_2 = null;
				Static227.aClass75_5.aClass183_1 = null;
				Static227.aClass75_5.aClass183Array1 = null;
				Static227.aClass75_5.aClass183_3 = null;
			}
		} catch (@Pc(231) IOException local231) {
			Static289.aClass162_5 = null;
			Static5.aClass162_1 = null;
			Static235.aClass162_4 = null;
			Static90.aClass28_3 = null;
		}
		if (Static195.anInt3950 != 0) {
			Static291.aBoolean428 = true;
		}
		Static101.aString9 = (Static171.aClass81_1 == Static285.aClass81_4 ? Static71.aClass106_57 : Static227.aClass106_156).method2927(Static254.anInt5172);
	}
}
