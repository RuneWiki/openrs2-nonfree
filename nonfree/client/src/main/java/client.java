import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
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
				Static190.method3119("argument count");
			}
			Static224.anInt4410 = Integer.parseInt(arg0[0]);
			Static210.anInt4148 = 2;
			if (arg0[1].equals("live")) {
				Static134.anInt2682 = 0;
			} else if (arg0[1].equals("rc")) {
				Static134.anInt2682 = 1;
			} else if (arg0[1].equals("wip")) {
				Static134.anInt2682 = 2;
			} else {
				Static190.method3119("modewhat");
			}
			Static242.aBoolean347 = false;
			Static117.anInt2307 = Static292.method4345(arg0[2]);
			if (Static117.anInt2307 == -1) {
				if (arg0[2].equals("english")) {
					Static117.anInt2307 = 0;
				} else if (arg0[2].equals("german")) {
					Static117.anInt2307 = 1;
				} else {
					Static190.method3119("language");
				}
			}
			Static137.method2203(Static117.anInt2307);
			Static204.aBoolean278 = false;
			Static213.aBoolean287 = false;
			if (arg0[3].equals("game0")) {
				Static35.anInt641 = 0;
			} else if (arg0[3].equals("game1")) {
				Static35.anInt641 = 1;
			} else {
				Static190.method3119("game");
			}
			Static119.anInt5881 = 0;
			Static141.anInt2761 = 0;
			Static280.aBoolean382 = false;
			Static198.aString134 = "";
			@Pc(127) client local127 = new client();
			Static265.aClient1 = local127;
			local127.method633(Static35.anInt641 == 1 ? "mechscape" : "runescape", Static134.anInt2682 + 32);
			Static78.aFrame2.setLocation(40, 40);
		} catch (@Pc(154) Exception local154) {
			Static195.method3178(null, local154);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method634() {
		Static53.method904();
		Static286.aClass32_3 = new Class32();
		Static272.aClass40_2 = new Class40();
		if (Static134.anInt2682 != 0) {
			Static40.aByteArrayArray2 = new byte[50][];
		}
		Static124.method2002(Static117.aClass117_3);
		if (Static210.anInt4148 == 0) {
			Static121.aString88 = this.getCodeBase().getHost();
			Static66.anInt1306 = 43594;
			Static215.anInt4229 = 443;
		} else if (Static210.anInt4148 == 1) {
			Static121.aString88 = this.getCodeBase().getHost();
			Static215.anInt4229 = Static224.anInt4410 + 50000;
			Static66.anInt1306 = Static224.anInt4410 + 40000;
		} else if (Static210.anInt4148 == 2) {
			Static66.anInt1306 = Static224.anInt4410 + 40000;
			Static215.anInt4229 = Static224.anInt4410 + 50000;
			Static121.aString88 = "127.0.0.1";
		}
		Static61.anInt1208 = Static215.anInt4229;
		if (Static181.anInt3691 == 3 && Static210.anInt4148 != 2) {
			Static108.anInt2138 = Static224.anInt4410;
		}
		Static122.anInt2459 = Static66.anInt1306;
		Static27.anInt508 = Static122.anInt2459;
		Static236.aShortArray72 = Static314.aShortArray93 = Static224.aShortArray62 = Static207.aShortArray59 = new short[256];
		Static216.aString139 = Static121.aString88;
		Static286.anInt5441 = Static66.anInt1306;
		if (Static35.anInt641 == 1) {
			Static313.aShortArrayArray42 = Static260.aShortArrayArray34;
			Static175.aShortArrayArray23 = Static293.aShortArrayArray41;
			Static235.aShortArray70 = Static99.aShortArray22;
			Static96.anInt1801 = 0;
			Static96.anInt1802 = 16777215;
			Static99.aShortArray21 = Static244.aShortArray77;
			Static49.aBoolean74 = true;
		} else {
			Static313.aShortArrayArray42 = Static286.aShortArrayArray38;
			Static99.aShortArray21 = Static177.aShortArray42;
			Static235.aShortArray70 = Static215.aShortArray61;
			Static175.aShortArrayArray23 = Static239.aShortArrayArray31;
		}
		Static159.method2696();
		Static91.method1359(Static304.aCanvas1);
		Static228.method621(Static304.aCanvas1);
		Static81.aClass129_1 = Static15.method211();
		if (Static81.aClass129_1 != null) {
			Static81.aClass129_1.method4450(Static304.aCanvas1);
		}
		Static151.anInt3096 = Static181.anInt3691;
		try {
			if (Static117.aClass117_3.aClass126_2 != null) {
				Static176.aClass187_7 = new Class187(Static117.aClass117_3.aClass126_2, 5200, 0);
				for (@Pc(175) int local175 = 0; local175 < 29; local175++) {
					Static306.aClass187Array2[local175] = new Class187(Static117.aClass117_3.aClass126Array1[local175], 6000, 0);
				}
				Static235.aClass187_6 = new Class187(Static117.aClass117_3.aClass126_1, 6000, 0);
				Static72.aClass120_1 = new Class120(255, Static176.aClass187_7, Static235.aClass187_6, 500000);
				Static2.aClass187_1 = new Class187(Static117.aClass117_3.aClass126_3, 24, 0);
				Static117.aClass117_3.aClass126_1 = null;
				Static117.aClass117_3.aClass126_2 = null;
				Static117.aClass117_3.aClass126_3 = null;
				Static117.aClass117_3.aClass126Array1 = null;
			}
		} catch (@Pc(233) IOException local233) {
			Static235.aClass187_6 = null;
			Static72.aClass120_1 = null;
			Static176.aClass187_7 = null;
			Static2.aClass187_1 = null;
		}
		if (Static35.anInt641 == 0) {
			Static105.aString78 = Static105.aString77;
		} else if (Static35.anInt641 == 1) {
			Static105.aString78 = Static253.aString155;
		}
		if (Static210.anInt4148 != 0) {
			Static13.aBoolean13 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method630() {
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method645() {
		if (!Static8.aBoolean8) {
			label258: while (true) {
				do {
					if (!Static154.method2655()) {
						break label258;
					}
				} while (Static243.aChar6 != 's' && Static243.aChar6 != 'S');
				Static8.aBoolean8 = true;
			}
		}
		@Pc(42) int local42;
		if (Static265.anInt5101 == 0) {
			@Pc(32) Runtime local32 = Runtime.getRuntime();
			local42 = (int) ((local32.totalMemory() - local32.freeMemory()) / 1024L);
			@Pc(45) long local45 = Static135.method2186();
			if (Static83.aLong63 == 0L) {
				Static83.aLong63 = local45;
			}
			if (local42 > 16384 && local45 - Static83.aLong63 < 5000L) {
				if (local45 - Static169.aLong132 > 1000L) {
					System.gc();
					Static169.aLong132 = local45;
				}
				Static265.aString169 = Static94.aString64;
				Static200.anInt5630 = 5;
			} else {
				Static265.aString169 = Static253.aString156;
				Static200.anInt5630 = 5;
				Static265.anInt5101 = 10;
			}
			return;
		}
		@Pc(96) int local96;
		if (Static265.anInt5101 == 10) {
			for (local96 = 0; local96 < 4; local96++) {
				Static56.aClass122Array1[local96] = new Class122(104, 104);
			}
			Static265.anInt5101 = 30;
			Static200.anInt5630 = 10;
			Static265.aString169 = Static189.aString125;
		} else if (Static265.anInt5101 == 30) {
			if (Static161.aClass158_1 == null) {
				Static161.aClass158_1 = new Class158(Static272.aClass40_2, Static286.aClass32_3);
			}
			if (Static161.aClass158_1.method3836()) {
				Static106.aClass138_36 = Static60.method1021(true, false, 0, true);
				Static63.aClass138_16 = Static60.method1021(true, false, 1, true);
				Static34.aClass138_8 = Static60.method1021(false, true, 2, true);
				Static208.aClass138_56 = Static60.method1021(true, false, 3, true);
				Static273.aClass138_75 = Static60.method1021(true, false, 4, true);
				Static124.aClass138_40 = Static60.method1021(true, true, 5, true);
				Static132.aClass138_42 = Static60.method1021(true, true, 6, false);
				Static264.aClass138_71 = Static60.method1021(true, false, 7, true);
				Static241.aClass138_64 = Static60.method1021(true, false, 8, true);
				Static240.aClass138_19 = Static60.method1021(true, false, 9, true);
				Static48.aClass138_9 = Static60.method1021(true, false, 10, true);
				Static136.aClass138_43 = Static60.method1021(true, false, 11, true);
				Static209.aClass138_57 = Static60.method1021(true, false, 12, true);
				Static286.aClass138_79 = Static60.method1021(true, false, 13, true);
				Static167.aClass138_48 = Static60.method1021(true, false, 14, false);
				Static157.aClass138_46 = Static60.method1021(true, false, 15, true);
				Static264.aClass138_70 = Static60.method1021(true, false, 16, true);
				Static295.aClass138_84 = Static60.method1021(true, false, 17, true);
				Static247.aClass138_67 = Static60.method1021(true, false, 18, true);
				Static274.aClass138_77 = Static60.method1021(true, false, 19, true);
				Static98.aClass138_29 = Static60.method1021(true, false, 20, true);
				Static84.aClass138_24 = Static60.method1021(true, false, 21, true);
				Static302.aClass138_86 = Static60.method1021(true, false, 22, true);
				Static300.aClass138_85 = Static60.method1021(true, true, 23, true);
				Static315.aClass138_92 = Static60.method1021(true, false, 24, true);
				Static66.aClass138_17 = Static60.method1021(true, false, 25, true);
				Static270.aClass138_72 = Static60.method1021(true, true, 26, true);
				Static230.aClass138_60 = Static60.method1021(true, false, 27, true);
				Static114.aClass138_38 = Static60.method1021(true, true, 28, true);
				Static265.aString169 = Static97.aString65;
				Static200.anInt5630 = 15;
				Static265.anInt5101 = 40;
			} else {
				Static200.anInt5630 = 12;
				Static265.aString169 = Static132.aString96;
			}
		} else if (Static265.anInt5101 == 40) {
			local96 = 0;
			for (local42 = 0; local42 < 29; local42++) {
				local96 += Static305.aClass55_Sub1Array2[local42].method4241() * Static52.anIntArray93[local42] / 100;
			}
			if (local96 == 100) {
				Static200.anInt5630 = 20;
				Static265.aString169 = Static130.aString92;
				Static242.method3783(Static241.aClass138_64);
				Static129.method2030(Static241.aClass138_64);
				Static137.method2206(Static241.aClass138_64);
				Static265.anInt5101 = 41;
			} else {
				if (local96 != 0) {
					Static265.aString169 = Static6.aString3 + local96 + "%";
				}
				Static200.anInt5630 = 20;
			}
		} else if (Static265.anInt5101 == 41) {
			if (Static114.aClass138_38.method3341()) {
				this.method660(Static114.aClass138_38.method3339(1));
				Static265.anInt5101 = 45;
				Static200.anInt5630 = 25;
				Static265.aString169 = Static175.aString111;
			} else {
				Static265.aString169 = Static202.aString135 + Static114.aClass138_38.method3349() + "%";
				Static200.anInt5630 = 25;
			}
		} else if (Static265.anInt5101 == 45) {
			Static90.method3646(Static119.aBoolean428);
			Static172.aClass1_Sub4_Sub3_2 = new Class1_Sub4_Sub3();
			Static172.aClass1_Sub4_Sub3_2.method1486();
			Static313.aClass101_2 = Static280.method4158(22050, Static117.aClass117_3, 0, Static304.aCanvas1);
			Static313.aClass101_2.method2809(Static172.aClass1_Sub4_Sub3_2);
			Static88.method1307(Static273.aClass138_75, Static157.aClass138_46, Static172.aClass1_Sub4_Sub3_2, Static167.aClass138_48);
			Static199.aClass101_1 = Static280.method4158(2048, Static117.aClass117_3, 1, Static304.aCanvas1);
			Static303.aClass1_Sub4_Sub2_2 = new Class1_Sub4_Sub2();
			Static199.aClass101_1.method2809(Static303.aClass1_Sub4_Sub2_2);
			Static298.aClass163_1 = new Class163(22050, Static152.anInt3130);
			Static215.anInt4228 = Static132.aClass138_42.method3331("scape main");
			Static265.anInt5101 = 50;
			Static200.anInt5630 = 30;
			Static265.aString169 = Static167.aString107;
		} else if (Static265.anInt5101 == 50) {
			local96 = Static30.method533(Static241.aClass138_64, Static286.aClass138_79);
			local42 = Static310.method1129();
			if (local42 <= local96) {
				Static265.anInt5101 = 60;
				Static265.aString169 = Static145.aString100;
				Static200.anInt5630 = 35;
			} else {
				Static265.aString169 = Static257.aString165 + local96 * 100 / local42 + "%";
				Static200.anInt5630 = 35;
			}
		} else if (Static265.anInt5101 == 60) {
			local96 = Static295.method4390(Static241.aClass138_64);
			local42 = Static222.method3505();
			if (local96 >= local42) {
				Static200.anInt5630 = 40;
				Static265.aString169 = Static131.aString94;
				Static265.anInt5101 = 65;
			} else {
				Static200.anInt5630 = 40;
				Static265.aString169 = Static172.aString5 + local96 * 100 / local42 + "%";
			}
		} else if (Static265.anInt5101 == 65) {
			Static235.method3725(Static286.aClass138_79, Static241.aClass138_64);
			Static265.aString169 = Static171.aString110;
			Static200.anInt5630 = 45;
			Static176.method4598(5);
			Static265.anInt5101 = 70;
		} else if (Static265.anInt5101 == 70) {
			Static34.aClass138_8.method3341();
			local96 = Static34.aClass138_8.method3349();
			Static264.aClass138_70.method3341();
			local96 += Static264.aClass138_70.method3349();
			Static295.aClass138_84.method3341();
			local96 += Static295.aClass138_84.method3349();
			Static247.aClass138_67.method3341();
			local96 += Static247.aClass138_67.method3349();
			Static274.aClass138_77.method3341();
			local96 += Static274.aClass138_77.method3349();
			Static98.aClass138_29.method3341();
			local96 += Static98.aClass138_29.method3349();
			Static84.aClass138_24.method3341();
			local96 += Static84.aClass138_24.method3349();
			Static302.aClass138_86.method3341();
			local96 += Static302.aClass138_86.method3349();
			Static315.aClass138_92.method3341();
			local96 += Static315.aClass138_92.method3349();
			Static66.aClass138_17.method3341();
			local96 += Static66.aClass138_17.method3349();
			Static230.aClass138_60.method3341();
			local96 += Static230.aClass138_60.method3349();
			if (local96 < 1100) {
				Static265.aString169 = Static81.aString48 + local96 / 11 + "%";
				Static200.anInt5630 = 50;
			} else {
				Static2.method34(Static34.aClass138_8);
				Static9.method2419(Static34.aClass138_8);
				Static108.method1785(Static34.aClass138_8);
				Static254.method3868(Static264.aClass138_71, Static34.aClass138_8);
				Static76.method1201(Static264.aClass138_71, Static264.aClass138_70);
				Static131.method2055(Static264.aClass138_71, Static247.aClass138_67);
				Static124.method1997(Static110.aClass1_Sub1_Sub12_Sub2_1, Static274.aClass138_77, Static264.aClass138_71);
				Static248.method3827(Static34.aClass138_8);
				Static260.method3916(Static98.aClass138_29, Static63.aClass138_16, Static106.aClass138_36);
				Static199.method3217(Static34.aClass138_8);
				Static310.method1130(Static264.aClass138_71, Static84.aClass138_24);
				Static148.method2387(Static302.aClass138_86);
				Static137.method2202(Static34.aClass138_8);
				Static54.method934(Static264.aClass138_71, Static286.aClass138_79, Static241.aClass138_64, Static208.aClass138_56);
				Static246.method3809(Static34.aClass138_8);
				Static152.method2500(Static295.aClass138_84);
				Static202.method3244(new Class159(), Static315.aClass138_92, Static66.aClass138_17);
				Static245.method1896(Static315.aClass138_92, Static66.aClass138_17);
				Static253.method3718(Static34.aClass138_8);
				Static237.method2936(Static34.aClass138_8);
				Static104.method1649(Static34.aClass138_8);
				Static119.method4625(Static241.aClass138_64, Static34.aClass138_8);
				Static73.method1182(Static241.aClass138_64, Static34.aClass138_8);
				Static210.method3326(Static34.aClass138_8, Static241.aClass138_64);
				Static200.anInt5630 = 50;
				Static265.aString169 = Static202.aString136;
				Static9.method2417();
				Static265.anInt5101 = 80;
			}
		} else if (Static265.anInt5101 == 80) {
			local96 = Static94.method1384(Static241.aClass138_64);
			local42 = Static268.method4667();
			if (local42 > local96) {
				Static265.aString169 = Static236.aString160 + local96 * 100 / local42 + "%";
				Static200.anInt5630 = 60;
			} else {
				Static250.method2609(Static241.aClass138_64);
				Static265.anInt5101 = 90;
				Static265.aString169 = Static15.aString11;
				Static200.anInt5630 = 60;
			}
		} else if (Static265.anInt5101 == 90) {
			if (Static270.aClass138_72.method3341()) {
				@Pc(979) Class74_Sub1 local979 = new Class74_Sub1(Static240.aClass138_19, Static270.aClass138_72, Static241.aClass138_64, 20, !Static280.aBoolean383);
				Static18.method309(local979);
				if (Static287.anInt5449 == 1) {
					Static18.method317(0.9F);
				}
				if (Static287.anInt5449 == 2) {
					Static18.method317(0.8F);
				}
				if (Static287.anInt5449 == 3) {
					Static18.method317(0.7F);
				}
				if (Static287.anInt5449 == 4) {
					Static18.method317(0.6F);
				}
				Static200.anInt5630 = 70;
				Static265.anInt5101 = 100;
				Static265.aString169 = Static310.aString41;
			} else {
				Static265.aString169 = Static258.aString166 + Static270.aClass138_72.method3349() + "%";
				Static200.anInt5630 = 70;
			}
		} else if (Static265.anInt5101 == 100) {
			if (Static248.method3818(Static241.aClass138_64)) {
				Static265.anInt5101 = 110;
			}
		} else if (Static265.anInt5101 == 110) {
			Static190.aClass145_1 = new Class145();
			Static117.aClass117_3.method3000(10, Static190.aClass145_1);
			Static265.aString169 = Static212.aString138;
			Static265.anInt5101 = 120;
			Static200.anInt5630 = 75;
		} else if (Static265.anInt5101 == 120) {
			if (Static48.aClass138_9.method3356("", "huffman")) {
				@Pc(1075) Class143 local1075 = new Class143(Static48.aClass138_9.method3335("", "huffman"));
				Static49.method856(local1075);
				Static265.anInt5101 = 130;
				Static200.anInt5630 = 80;
				Static265.aString169 = Static129.aString91;
			} else {
				Static200.anInt5630 = 80;
				Static265.aString169 = Static208.aString137 + "0%";
			}
		} else if (Static265.anInt5101 == 130) {
			if (!Static208.aClass138_56.method3341()) {
				Static265.aString169 = Static235.aString158 + Static208.aClass138_56.method3349() * 3 / 4 + "%";
				Static200.anInt5630 = 85;
			} else if (!Static209.aClass138_57.method3341()) {
				Static265.aString169 = Static235.aString158 + (Static209.aClass138_57.method3349() / 10 + 75) + "%";
				Static200.anInt5630 = 85;
			} else if (!Static286.aClass138_79.method3341()) {
				Static265.aString169 = Static235.aString158 + (Static286.aClass138_79.method3349() / 20 + 85) + "%";
				Static200.anInt5630 = 85;
			} else if (Static300.aClass138_85.method3367("details")) {
				Static58.method2041(Static300.aClass138_85);
				Static149.method2394(Static230.aClass138_60);
				Static308.method4560(Static264.aClass138_71);
				Static200.anInt5630 = 95;
				Static265.anInt5101 = 135;
				Static265.aString169 = Static89.aString58;
			} else {
				Static265.aString169 = Static235.aString158 + (Static300.aClass138_85.method3370("details") / 10 + 90) + "%";
				Static200.anInt5630 = 85;
			}
		} else if (Static265.anInt5101 == 135) {
			local96 = Static6.method96();
			if (local96 == -1) {
				Static265.aString169 = Static88.aString56;
				Static200.anInt5630 = 95;
			} else if (local96 == 7 || local96 == 9) {
				this.method623("worldlistfull");
				Static176.method4598(1000);
			} else if (Static156.aBoolean233) {
				Static265.anInt5101 = 140;
				Static200.anInt5630 = 96;
				Static265.aString169 = Static285.aString179;
			} else {
				this.method623("worldlistio_" + local96);
				Static176.method4598(1000);
			}
		} else if (Static265.anInt5101 == 140) {
			Static229.anInt4491 = Static208.aClass138_56.method3331("loginscreen");
			Static124.aClass138_40.method3357(false);
			Static132.aClass138_42.method3357(true);
			Static241.aClass138_64.method3357(true);
			Static286.aClass138_79.method3357(true);
			Static48.aClass138_9.method3357(true);
			Static208.aClass138_56.method3357(true);
			Static200.anInt5630 = 97;
			Static265.anInt5101 = 150;
			Static296.aBoolean417 = true;
			Static265.aString169 = Static152.aString101;
		} else if (Static265.anInt5101 == 150) {
			Static153.method2504();
			if (Static8.aBoolean8) {
				Static37.anInt756 = 0;
				Static247.anInt4901 = 0;
				Static114.anInt2269 = 0;
				Static157.anInt3329 = 0;
			}
			Static8.aBoolean8 = true;
			Static80.method1224(Static117.aClass117_3);
			Static214.method3390(-1, false, -1, Static247.anInt4901);
			Static265.aString169 = Static77.aString178;
			Static265.anInt5101 = 160;
			Static200.anInt5630 = 100;
		} else if (Static265.anInt5101 == 160) {
			Static146.method2325(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method646() {
		for (Static265.anInt5102 = 0; Static154.method2655() && Static265.anInt5102 < 128; Static265.anInt5102++) {
			Static301.anIntArray521[Static265.anInt5102] = Static137.anInt2718;
			Static20.anIntArray30[Static265.anInt5102] = Static243.aChar6;
		}
		Static147.anInt2946++;
		if (Static287.anInt5450 != -1) {
			Static15.method212(0, 0, Static159.anInt3348, 0, Static136.anInt2696, Static287.anInt5450, 0);
		}
		Static314.anInt5908++;
		if (Static291.aBoolean404) {
			label196: for (@Pc(55) int local55 = 0; local55 < 32768; local55++) {
				@Pc(62) Class22_Sub3_Sub1 local62 = Static265.aClass22_Sub3_Sub1Array1[local55];
				if (local62 != null) {
					@Pc(68) byte local68 = local62.aClass112_1.aByte13;
					if ((local68 & 0x2) > 0 && local62.anInt4580 == 0 && Math.random() * 1000.0D < 10.0D) {
						@Pc(93) int local93 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						@Pc(101) int local101 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						if (local93 != 0 || local101 != 0) {
							local62.anIntArray427[0] = local93 + (local62.anInt4601 >> 7);
							local62.aByteArray54[0] = 1;
							local62.anIntArray424[0] = local101 + (local62.anInt4623 >> 7);
							Static56.aClass122Array1[Static295.anInt5586].method3126(false, local62.method3660(), local62.anInt4601 >> 7, local62.anInt4623 >> 7, false, local62.method3660(), 0);
							if (local62.anIntArray427[0] >= 0 && local62.anIntArray427[0] <= 104 - local62.method3660() && local62.anIntArray424[0] >= 0 && local62.anIntArray424[0] <= 104 - local62.method3660() && Static56.aClass122Array1[Static295.anInt5586].method3139(local62.anInt4623 >> 7, local62.anIntArray427[0], local62.anInt4601 >> 7, local62.anIntArray424[0])) {
								if (local62.method3660() > 1) {
									for (@Pc(223) int local223 = local62.anIntArray427[0]; local223 < local62.anIntArray427[0] + local62.method3660(); local223++) {
										for (@Pc(239) int local239 = local62.anIntArray424[0]; local239 < local62.anIntArray424[0] + local62.method3660(); local239++) {
											if ((Static56.aClass122Array1[Static295.anInt5586].anIntArrayArray28[local223][local239] & 0x2401FF) != 0) {
												continue label196;
											}
										}
									}
								}
								local62.anInt4580 = 1;
							}
						}
					}
					Static63.method1092(local62);
					Static206.method3273(local62);
					Static194.method3156(local62);
					Static56.aClass122Array1[Static295.anInt5586].method3124(local62.anInt4601 >> 7, local62.method3660(), local62.method3660(), false, local62.anInt4623 >> 7, false);
				}
			}
		}
		if (!Static291.aBoolean404 && Static35.anInt641 == 0) {
			Static281.method4171();
		} else if (Static92.anInt1758 == 0 && Static31.anInt560 == 0) {
			if (Static101.anInt1895 == 2) {
				Static315.method4656();
			} else {
				Static127.method2016();
			}
			if (Static243.anInt5653 >> 7 < 14 || Static243.anInt5653 >> 7 >= 90 || Static105.anInt2016 >> 7 < 14 || Static105.anInt2016 >> 7 >= 90) {
				Static140.method2234();
			}
		}
		while (true) {
			@Pc(359) Class1_Sub29 local359;
			@Pc(366) Class146 local366;
			@Pc(375) Class146 local375;
			do {
				local359 = (Class1_Sub29) Static85.aClass24_13.method469();
				if (local359 == null) {
					while (true) {
						do {
							local359 = (Class1_Sub29) Static263.aClass24_25.method469();
							if (local359 == null) {
								while (true) {
									do {
										local359 = (Class1_Sub29) Static250.aClass24_19.method469();
										if (local359 == null) {
											if (Static9.aClass146_11 != null) {
												Static209.method3312();
											}
											if (Static238.aClass10_10 != null && Static238.aClass10_10.anInt151 == 1) {
												if (Static238.aClass10_10.anObject1 != null) {
													Static183.method3027(Static68.aString43, Static207.aBoolean281);
												}
												Static238.aClass10_10 = null;
												Static207.aBoolean281 = false;
												Static68.aString43 = null;
											}
											if (Static37.anInt757 % 1500 == 0) {
												Static268.method4661();
											}
											return;
										}
										local366 = local359.aClass146_16;
										if (local366.anInt4407 < 0) {
											break;
										}
										local375 = Static259.method3908(local366.anInt4416);
									} while (local375 == null || local375.aClass146Array2 == null || local366.anInt4407 >= local375.aClass146Array2.length || local366 != local375.aClass146Array2[local366.anInt4407]);
									Static171.method2886(local359);
								}
							}
							local366 = local359.aClass146_16;
							if (local366.anInt4407 < 0) {
								break;
							}
							local375 = Static259.method3908(local366.anInt4416);
						} while (local375 == null || local375.aClass146Array2 == null || local375.aClass146Array2.length <= local366.anInt4407 || local366 != local375.aClass146Array2[local366.anInt4407]);
						Static171.method2886(local359);
					}
				}
				local366 = local359.aClass146_16;
				if (local366.anInt4407 < 0) {
					break;
				}
				local375 = Static259.method3908(local366.anInt4416);
			} while (local375 == null || local375.aClass146Array2 == null || local366.anInt4407 >= local375.aClass146Array2.length || local375.aClass146Array2[local366.anInt4407] != local366);
			Static171.method2886(local359);
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method647() {
		@Pc(9) boolean local9 = Static272.aClass40_2.method858();
		if (!local9) {
			this.method651();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method651() {
		if (Static48.anInt931 < Static272.aClass40_2.anInt955) {
			if (Static286.anInt5441 == Static27.anInt508) {
				Static27.anInt508 = Static61.anInt1208;
			} else {
				Static27.anInt508 = Static286.anInt5441;
			}
			Static179.anInt3671 = 5 * 50 * (Static272.aClass40_2.anInt955 - 1);
			if (Static179.anInt3671 > 3000) {
				Static179.anInt3671 = 3000;
			}
			if (Static272.aClass40_2.anInt955 >= 2 && Static272.aClass40_2.anInt954 == 6) {
				this.method623("js5connect_outofdate");
				Static258.anInt5016 = 1000;
				return;
			}
			if (Static272.aClass40_2.anInt955 >= 4 && Static272.aClass40_2.anInt954 == -1) {
				this.method623("js5crc");
				Static258.anInt5016 = 1000;
				return;
			}
			if (Static272.aClass40_2.anInt955 >= 4 && (Static258.anInt5016 == 0 || Static258.anInt5016 == 5)) {
				if (Static272.aClass40_2.anInt954 == 7 || Static272.aClass40_2.anInt954 == 9) {
					this.method623("js5connect_full");
				} else if (Static272.aClass40_2.anInt954 > 0) {
					this.method623("js5connect");
				} else {
					this.method623("js5io");
				}
				Static258.anInt5016 = 1000;
				return;
			}
		}
		Static48.anInt931 = Static272.aClass40_2.anInt955;
		if (Static179.anInt3671 > 0) {
			Static179.anInt3671--;
			return;
		}
		try {
			if (Static252.anInt4942 == 0) {
				Static118.aClass10_6 = Static117.aClass117_3.method2996(Static27.anInt508, Static216.aString139);
				Static252.anInt4942++;
			}
			if (Static252.anInt4942 == 1) {
				if (Static118.aClass10_6.anInt151 == 2) {
					this.method658(1000);
					return;
				}
				if (Static118.aClass10_6.anInt151 == 1) {
					Static252.anInt4942++;
				}
			}
			if (Static252.anInt4942 == 2) {
				Static99.aClass7_3 = new Class7((Socket) Static118.aClass10_6.anObject1, Static117.aClass117_3);
				@Pc(198) Class1_Sub14 local198 = new Class1_Sub14(5);
				local198.method2631(15);
				local198.method2630(552);
				Static99.aClass7_3.method108(local198.aByteArray34, 5);
				Static252.anInt4942++;
				Static222.aLong170 = Static135.method2186();
			}
			if (Static252.anInt4942 == 3) {
				if (Static258.anInt5016 == 0 || Static258.anInt5016 == 5 || Static99.aClass7_3.method104() > 0) {
					@Pc(257) int local257 = Static99.aClass7_3.method103();
					if (local257 != 0) {
						this.method658(local257);
						return;
					}
					Static252.anInt4942++;
				} else if (Static135.method2186() - Static222.aLong170 > 30000L) {
					this.method658(1001);
					return;
				}
			}
			if (Static252.anInt4942 == 4) {
				@Pc(286) boolean local286 = Static258.anInt5016 == 5 || Static258.anInt5016 == 10 || Static258.anInt5016 == 28;
				Static272.aClass40_2.method867(Static99.aClass7_3, !local286);
				Static99.aClass7_3 = null;
				Static118.aClass10_6 = null;
				Static252.anInt4942 = 0;
			}
		} catch (@Pc(303) IOException local303) {
			this.method658(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method626() {
		if (Static291.aBoolean404) {
			Static291.method4309();
		}
		if (Static75.aFrame1 != null) {
			Static194.method3152(Static117.aClass117_3, Static75.aFrame1);
			Static75.aFrame1 = null;
		}
		if (Static190.aClass145_1 != null) {
			Static190.aClass145_1.aBoolean296 = false;
		}
		Static190.aClass145_1 = null;
		if (Static81.aClass7_2 != null) {
			Static81.aClass7_2.method105();
			Static81.aClass7_2 = null;
		}
		Static76.method1202(Static304.aCanvas1);
		Static62.method1050(Static304.aCanvas1);
		if (Static81.aClass129_1 != null) {
			Static81.aClass129_1.method4453(Static304.aCanvas1);
		}
		Static300.method4493();
		Static232.method2985();
		Static81.aClass129_1 = null;
		if (Static313.aClass101_2 != null) {
			Static313.aClass101_2.method2814();
		}
		if (Static199.aClass101_1 != null) {
			Static199.aClass101_1.method2814();
		}
		Static272.aClass40_2.method860();
		Static286.aClass32_3.method684();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method658(@OriginalArg(1) int arg0) {
		Static118.aClass10_6 = null;
		Static272.aClass40_2.anInt955++;
		Static272.aClass40_2.anInt954 = arg0;
		Static252.anInt4942 = 0;
		Static99.aClass7_3 = null;
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method629()) {
			return;
		}
		Static224.anInt4410 = Integer.parseInt(this.getParameter("worldid"));
		Static210.anInt4148 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static210.anInt4148 < 0 || Static210.anInt4148 > 1) {
			Static210.anInt4148 = 0;
		}
		Static134.anInt2682 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static134.anInt2682 < 0 || Static134.anInt2682 > 2) {
			Static134.anInt2682 = 0;
		}
		@Pc(48) String local48 = this.getParameter("advertsuppressed");
		if (local48 != null && local48.equals("1")) {
			Static242.aBoolean347 = true;
		} else {
			Static242.aBoolean347 = false;
		}
		try {
			Static117.anInt2307 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(67) Exception local67) {
			Static117.anInt2307 = 0;
		}
		Static137.method2203(Static117.anInt2307);
		@Pc(76) String local76 = this.getParameter("objecttag");
		if (local76 != null && local76.equals("1")) {
			Static204.aBoolean278 = true;
		} else {
			Static204.aBoolean278 = false;
		}
		@Pc(93) String local93 = this.getParameter("js");
		if (local93 != null && local93.equals("1")) {
			Static213.aBoolean287 = true;
		} else {
			Static213.aBoolean287 = false;
		}
		@Pc(110) String local110 = this.getParameter("game");
		if (local110 != null && local110.equals("1")) {
			Static35.anInt641 = 1;
		} else {
			Static35.anInt641 = 0;
		}
		try {
			Static119.anInt5881 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(130) Exception local130) {
			Static119.anInt5881 = 0;
		}
		Static198.aString134 = this.getParameter("settings");
		if (Static198.aString134 == null) {
			Static198.aString134 = "";
		}
		@Pc(146) String local146 = this.getParameter("country");
		if (local146 != null) {
			try {
				Static141.anInt2761 = Integer.parseInt(local146);
			} catch (@Pc(154) Exception local154) {
				Static141.anInt2761 = 0;
			}
		}
		@Pc(160) String local160 = this.getParameter("haveie6");
		if (local160 != null && local160.equals("1")) {
			Static280.aBoolean382 = true;
		} else {
			Static280.aBoolean382 = false;
		}
		Static265.aClient1 = this;
		this.method635(Static134.anInt2682 + 32);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BZ)V")
	private void method660(@OriginalArg(0) byte[] arg0) {
		@Pc(14) Class1_Sub14 local14 = new Class1_Sub14(arg0);
		while (true) {
			while (true) {
				@Pc(18) int local18 = local14.method2595();
				if (local18 == 0) {
					return;
				}
				if (local18 == 1) {
					@Pc(33) int[] local33 = Static171.anIntArray286 = new int[6];
					local33[0] = local14.method2593();
					local33[1] = local14.method2593();
					local33[2] = local14.method2593();
					local33[3] = local14.method2593();
					local33[4] = local14.method2593();
					local33[5] = local14.method2593();
				} else if (local18 == 4) {
					@Pc(78) int local78 = local14.method2595();
					Static225.anIntArray370 = new int[local78];
					for (@Pc(83) int local83 = 0; local83 < local78; local83++) {
						Static225.anIntArray370[local83] = local14.method2593();
						if (Static225.anIntArray370[local83] == 65535) {
							Static225.anIntArray370[local83] = -1;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method622() {
		if (Static258.anInt5016 == 1000) {
			return;
		}
		@Pc(20) long local20 = Static143.method2284() / 1000000L - Static140.aLong99;
		Static140.aLong99 = Static143.method2284() / 1000000L;
		@Pc(28) boolean local28 = Static68.method1137();
		if (local28 && Static113.aBoolean168 && Static313.aClass101_2 != null) {
			Static313.aClass101_2.method2803();
		}
		if ((Static258.anInt5016 == 30 || Static258.anInt5016 == 10) && (Static85.aBoolean122 || Static142.aLong102 != 0L && Static135.method2186() > Static142.aLong102)) {
			Static214.method3390(Static63.anInt1285, Static85.aBoolean122, Static191.anInt3925, Static230.method3622());
		}
		@Pc(90) int local90;
		@Pc(94) int local94;
		if (Static75.aFrame1 == null) {
			@Pc(74) Container local74;
			if (Static75.aFrame1 != null) {
				local74 = Static75.aFrame1;
			} else if (Static78.aFrame2 == null) {
				local74 = Static117.aClass117_3.anApplet1;
			} else {
				local74 = Static78.aFrame2;
			}
			local90 = local74.getSize().width;
			local94 = local74.getSize().height;
			if (Static78.aFrame2 == local74) {
				@Pc(100) Insets local100 = Static78.aFrame2.getInsets();
				local94 -= local100.bottom + local100.top;
				local90 -= local100.left + local100.right;
			}
			if (local90 != Static21.anInt417 || Static302.anInt5720 != local94) {
				if (Static181.aString120.startsWith("mac")) {
					Static21.anInt417 = local90;
					Static302.anInt5720 = local94;
				} else {
					Static53.method904();
				}
				Static142.aLong102 = Static135.method2186() + 500L;
			}
		}
		if (Static75.aFrame1 != null && !Static162.aBoolean235 && (Static258.anInt5016 == 30 || Static258.anInt5016 == 10)) {
			Static214.method3390(-1, false, -1, Static247.anInt4901);
		}
		@Pc(170) boolean local170 = false;
		if (Static311.aBoolean426) {
			Static311.aBoolean426 = false;
			local170 = true;
		}
		if (local170) {
			Static231.method3665();
		}
		if (Static291.aBoolean404) {
			for (local90 = 0; local90 < 100; local90++) {
				Static132.aBooleanArray25[local90] = true;
			}
		}
		if (Static258.anInt5016 == 0) {
			Static185.method3037(Static200.anInt5630, null, Static265.aString169, local170);
		} else if (Static258.anInt5016 == 5) {
			Static94.method1385(false, Static245.aClass1_Sub1_Sub12_2);
		} else if (Static258.anInt5016 == 10) {
			Static89.method1327();
		} else if (Static258.anInt5016 == 25 || Static258.anInt5016 == 28) {
			if (Static233.anInt4697 == 1) {
				if (Static13.anInt220 < Static121.anInt2452) {
					Static13.anInt220 = Static121.anInt2452;
				}
				local90 = (Static13.anInt220 - Static121.anInt2452) * 50 / Static13.anInt220;
				Static312.method4593(Static165.aString106 + "<br>(" + local90 + "%)", false);
			} else if (Static233.anInt4697 == 2) {
				if (Static210.anInt4147 < Static300.anInt5677) {
					Static210.anInt4147 = Static300.anInt5677;
				}
				local90 = (Static210.anInt4147 - Static300.anInt5677) * 50 / Static210.anInt4147 + 50;
				Static312.method4593(Static165.aString106 + "<br>(" + local90 + "%)", false);
			} else {
				Static312.method4593(Static165.aString106, false);
			}
		} else if (Static258.anInt5016 == 30) {
			Static158.method1623(local20);
		} else if (Static258.anInt5016 == 40) {
			Static312.method4593(Static39.aString23 + "<br>" + Static175.aString112, false);
		}
		if (Static291.aBoolean404 && Static258.anInt5016 != 0) {
			Static291.method4294();
			for (local90 = 0; local90 < Static156.anInt3310; local90++) {
				Static307.aBooleanArray65[local90] = false;
			}
		} else {
			@Pc(357) Graphics local357;
			if ((Static258.anInt5016 == 30 || Static258.anInt5016 == 10) && Static16.anInt245 == 0 && !local170) {
				try {
					local357 = Static304.aCanvas1.getGraphics();
					for (local94 = 0; local94 < Static156.anInt3310; local94++) {
						if (Static307.aBooleanArray65[local94]) {
							Static242.aClass62_1.method4469(Static220.anIntArray527[local94], Static244.anIntArray440[local94], Static219.anIntArray345[local94], local357, Static191.anIntArray319[local94]);
							Static307.aBooleanArray65[local94] = false;
						}
					}
				} catch (@Pc(391) Exception local391) {
					Static304.aCanvas1.repaint();
				}
			} else if (Static258.anInt5016 != 0) {
				try {
					local357 = Static304.aCanvas1.getGraphics();
					Static242.aClass62_1.method4466(local357);
					for (local94 = 0; local94 < Static156.anInt3310; local94++) {
						Static307.aBooleanArray65[local94] = false;
					}
				} catch (@Pc(428) Exception local428) {
					Static304.aCanvas1.repaint();
				}
			}
		}
		if (Static296.aBoolean417) {
			Static119.method4626();
		}
		if (Static8.aBoolean8 && Static258.anInt5016 == 10 && Static287.anInt5450 != -1) {
			Static8.aBoolean8 = false;
			Static80.method1224(Static117.aClass117_3);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method636() {
		if (Static258.anInt5016 == 1000) {
			return;
		}
		Static37.anInt757++;
		if (Static37.anInt757 % 1000 == 1) {
			@Pc(30) GregorianCalendar local30 = new GregorianCalendar();
			Static295.anInt5587 = local30.get(11) * 600 + local30.get(12) * 10 + local30.get(13) / 6;
			Static295.aRandom1.setSeed((long) Static295.anInt5587);
		}
		this.method647();
		if (Static161.aClass158_1 != null) {
			Static161.aClass158_1.method3838();
		}
		Static220.method4573();
		Static82.method1238();
		Static148.method2388();
		Static253.method3723();
		if (Static291.aBoolean404) {
			Static74.method1190();
		}
		if (Static81.aClass129_1 != null) {
			@Pc(81) int local81 = Static81.aClass129_1.method4451();
			Static26.anInt498 = local81;
		}
		if (Static258.anInt5016 == 0) {
			this.method645();
			Static91.method1363();
		} else if (Static258.anInt5016 == 5) {
			this.method645();
			Static91.method1363();
		} else if (Static258.anInt5016 == 25 || Static258.anInt5016 == 28) {
			Static277.method4110();
		}
		if (Static258.anInt5016 == 10) {
			this.method646();
			Static241.method3768();
			Static169.method2847();
			Static98.method1451();
		} else if (Static258.anInt5016 == 30) {
			Static270.method3982();
		} else if (Static258.anInt5016 == 40) {
			Static98.method1451();
			if (Static213.anInt4207 != -3) {
				if (Static213.anInt4207 == 15) {
					Static235.method3728();
				} else if (Static213.anInt4207 != 2) {
					Static122.method1957();
				}
			}
		}
	}
}
