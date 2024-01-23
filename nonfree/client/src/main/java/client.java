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
				Static76.method1295("argument count");
			}
			Static49.anInt1063 = Integer.parseInt(arg0[0]);
			Static243.anInt5013 = 2;
			if (arg0[1].equals("live")) {
				Static286.anInt5076 = 0;
			} else if (arg0[1].equals("rc")) {
				Static286.anInt5076 = 1;
			} else if (arg0[1].equals("wip")) {
				Static286.anInt5076 = 2;
			} else {
				Static76.method1295("modewhat");
			}
			Static149.aBoolean196 = false;
			Static282.anInt5857 = Static236.method3751(arg0[2]);
			if (Static282.anInt5857 == -1) {
				if (arg0[2].equals("english")) {
					Static282.anInt5857 = 0;
				} else if (arg0[2].equals("german")) {
					Static282.anInt5857 = 1;
				} else {
					Static76.method1295("language");
				}
			}
			Static29.method480(Static282.anInt5857);
			Static49.aBoolean90 = false;
			Static286.aBoolean392 = false;
			if (arg0[3].equals("game0")) {
				Static107.anInt1994 = 0;
			} else if (arg0[3].equals("game1")) {
				Static107.anInt1994 = 1;
			} else {
				Static76.method1295("game");
			}
			Static129.anInt3918 = 0;
			Static219.aBoolean337 = false;
			Static266.aString179 = "";
			Static94.anInt1774 = 0;
			@Pc(127) client local127 = new client();
			Static95.aClient1 = local127;
			local127.method789(Static286.anInt5076 + 32, "runescape");
			Static299.aFrame2.setLocation(40, 40);
		} catch (@Pc(147) Exception local147) {
			Static6.method149(local147, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method780() {
		Static46.method828();
		Static160.aClass179_2 = new Class179();
		Static137.aClass168_3 = new Class168();
		if (Static286.anInt5076 != 0) {
			Static94.aByteArrayArray6 = new byte[50][];
		}
		Static259.method4020(Static13.aClass84_3);
		if (Static243.anInt5013 == 0) {
			Static160.aString103 = this.getCodeBase().getHost();
			Static146.anInt2695 = 43594;
			Static259.anInt5236 = 443;
		} else if (Static243.anInt5013 == 1) {
			Static160.aString103 = this.getCodeBase().getHost();
			Static146.anInt2695 = Static49.anInt1063 + 40000;
			Static259.anInt5236 = Static49.anInt1063 + 50000;
		} else if (Static243.anInt5013 == 2) {
			Static259.anInt5236 = Static49.anInt1063 + 50000;
			Static160.aString103 = "127.0.0.1";
			Static146.anInt2695 = Static49.anInt1063 + 40000;
		}
		Static128.aShortArray51 = Static38.aShortArray16 = Static33.aShortArray15 = Static296.aShortArray93 = new short[256];
		if (Static107.anInt1994 == 1) {
			Static138.aShortArrayArray9 = Static79.aShortArrayArray11;
			Static133.aShortArrayArray8 = Static247.aShortArrayArray13;
			Static202.aShortArray84 = Static286.aShortArray87;
			Static9.aShortArray1 = Static162.aShortArray77;
			Static34.anInt730 = 0;
			Static34.anInt728 = 16777215;
			Static266.aBoolean410 = true;
		} else {
			Static202.aShortArray84 = Static238.aShortArray85;
			Static133.aShortArrayArray8 = Static192.aShortArrayArray14;
			Static138.aShortArrayArray9 = Static97.aShortArrayArray4;
			Static9.aShortArray1 = Static17.aShortArray2;
		}
		Static121.anInt2345 = Static146.anInt2695;
		Static286.aString169 = Static160.aString103;
		Static254.anInt5889 = Static259.anInt5236;
		if (Static127.anInt2419 == 3 && Static243.anInt5013 != 2) {
			Static102.anInt1933 = Static49.anInt1063;
		}
		Static52.anInt1108 = Static121.anInt2345;
		Static89.anInt1687 = Static146.anInt2695;
		Static9.method185();
		Static274.method4192(Static189.aCanvas1);
		Static230.method3691(Static189.aCanvas1);
		Static14.aClass90_1 = Static297.method4544();
		if (Static14.aClass90_1 != null) {
			Static14.aClass90_1.method3358(Static189.aCanvas1);
		}
		Static274.anInt5476 = Static127.anInt2419;
		try {
			if (Static13.aClass84_3.aClass115_3 != null) {
				Static147.aClass66_3 = new Class66(Static13.aClass84_3.aClass115_3, 5200, 0);
				for (@Pc(175) int local175 = 0; local175 < 29; local175++) {
					Static43.aClass66Array1[local175] = new Class66(Static13.aClass84_3.aClass115Array1[local175], 6000, 0);
				}
				Static122.aClass66_2 = new Class66(Static13.aClass84_3.aClass115_4, 6000, 0);
				Static8.aClass159_1 = new Class159(255, Static147.aClass66_3, Static122.aClass66_2, 500000);
				Static37.aClass66_5 = new Class66(Static13.aClass84_3.aClass115_2, 24, 0);
				Static13.aClass84_3.aClass115_4 = null;
				Static13.aClass84_3.aClass115_2 = null;
				Static13.aClass84_3.aClass115_3 = null;
				Static13.aClass84_3.aClass115Array1 = null;
			}
		} catch (@Pc(231) IOException local231) {
			Static147.aClass66_3 = null;
			Static8.aClass159_1 = null;
			Static37.aClass66_5 = null;
			Static122.aClass66_2 = null;
		}
		if (Static243.anInt5013 != 0) {
			Static63.aBoolean101 = true;
		}
		Static4.aString4 = Static251.aString174;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method788() {
		if (Static98.anInt1878 == 1000) {
			return;
		}
		@Pc(19) long local19 = Static58.method998() / 1000000L - Static27.aLong23;
		Static27.aLong23 = Static58.method998() / 1000000L;
		@Pc(27) boolean local27 = Static146.method2281();
		if (local27 && Static295.aBoolean448 && Static72.aClass24_1 != null) {
			Static72.aClass24_1.method2463();
		}
		if ((Static98.anInt1878 == 30 || Static98.anInt1878 == 10) && (Static242.aBoolean388 || Static221.aLong143 != 0L && Static221.aLong143 < Static252.method3964())) {
			Static282.method4510(Static136.method2157(), Static242.aBoolean388, Static44.anInt997, Static224.anInt4699);
		}
		@Pc(93) int local93;
		@Pc(97) int local97;
		if (Static136.aFrame1 == null) {
			@Pc(81) Container local81;
			if (Static136.aFrame1 != null) {
				local81 = Static136.aFrame1;
			} else if (Static299.aFrame2 == null) {
				local81 = Static13.aClass84_3.anApplet1;
			} else {
				local81 = Static299.aFrame2;
			}
			local93 = local81.getSize().width;
			local97 = local81.getSize().height;
			if (local81 == Static299.aFrame2) {
				@Pc(104) Insets local104 = Static299.aFrame2.getInsets();
				local93 -= local104.right + local104.left;
				local97 -= local104.bottom + local104.top;
			}
			if (local93 != Static139.anInt2621 || Static269.anInt5394 != local97) {
				if (Static127.aString79.startsWith("mac")) {
					Static269.anInt5394 = local97;
					Static139.anInt2621 = local93;
				} else {
					Static46.method828();
				}
				Static221.aLong143 = Static252.method3964() + 500L;
			}
		}
		if (Static136.aFrame1 != null && !Static297.aBoolean450 && (Static98.anInt1878 == 30 || Static98.anInt1878 == 10)) {
			Static282.method4510(Static8.anInt239, false, -1, -1);
		}
		@Pc(167) boolean local167 = false;
		if (Static278.aBoolean425) {
			Static278.aBoolean425 = false;
			local167 = true;
		}
		if (local167) {
			Static109.method1723();
		}
		if (Static240.aBoolean369) {
			for (local93 = 0; local93 < 100; local93++) {
				Static267.aBooleanArray25[local93] = true;
			}
		}
		if (Static98.anInt1878 == 0) {
			Static152.method2362(local167, Static217.anInt4478, Static250.aString170, null);
		} else if (Static98.anInt1878 == 5) {
			Static290.method4465(false, Static10.aClass1_Sub2_Sub12_1);
		} else if (Static98.anInt1878 == 10) {
			Static53.method907();
		} else if (Static98.anInt1878 == 25 || Static98.anInt1878 == 28) {
			if (Static88.anInt1649 == 1) {
				if (Static199.anInt3859 < Static229.anInt4801) {
					Static199.anInt3859 = Static229.anInt4801;
				}
				local93 = (Static199.anInt3859 - Static229.anInt4801) * 50 / Static199.anInt3859;
				Static195.method2964(false, Static4.aString6 + "<br>(" + local93 + "%)");
			} else if (Static88.anInt1649 == 2) {
				if (Static298.anInt5902 > Static290.anInt5784) {
					Static290.anInt5784 = Static298.anInt5902;
				}
				local93 = (Static290.anInt5784 - Static298.anInt5902) * 50 / Static290.anInt5784 + 50;
				Static195.method2964(false, Static4.aString6 + "<br>(" + local93 + "%)");
			} else {
				Static195.method2964(false, Static4.aString6);
			}
		} else if (Static98.anInt1878 == 30) {
			Static256.method3981(local19);
		} else if (Static98.anInt1878 == 40) {
			Static195.method2964(false, Static126.aString76 + "<br>" + Static14.aString15);
		}
		if (Static240.aBoolean369 && Static98.anInt1878 != 0) {
			Static240.method3802();
			for (local93 = 0; local93 < Static166.anInt3059; local93++) {
				Static260.aBooleanArray24[local93] = false;
			}
		} else {
			@Pc(373) Graphics local373;
			if ((Static98.anInt1878 == 30 || Static98.anInt1878 == 10) && Static58.anInt1223 == 0 && !local167) {
				try {
					local373 = Static189.aCanvas1.getGraphics();
					for (local97 = 0; local97 < Static166.anInt3059; local97++) {
						if (Static260.aBooleanArray24[local97]) {
							Static282.aClass23_33.method1013(Static174.anIntArray383[local97], Static171.anIntArray380[local97], Static217.anIntArray514[local97], local373, Static38.anIntArray118[local97]);
							Static260.aBooleanArray24[local97] = false;
						}
					}
				} catch (@Pc(439) Exception local439) {
					Static189.aCanvas1.repaint();
				}
			} else if (Static98.anInt1878 != 0) {
				try {
					local373 = Static189.aCanvas1.getGraphics();
					Static282.aClass23_33.method1016(local373);
					for (local97 = 0; local97 < Static166.anInt3059; local97++) {
						Static260.aBooleanArray24[local97] = false;
					}
				} catch (@Pc(397) Exception local397) {
					Static189.aCanvas1.repaint();
				}
			}
		}
		if (Static174.aBoolean240) {
			Static289.method4436();
		}
		if (Static203.aBoolean299 && Static98.anInt1878 == 10 && Static121.anInt2350 != -1) {
			Static203.aBoolean299 = false;
			Static147.method2287(Static13.aClass84_3);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method796() {
		@Pc(3) boolean local3 = Static137.aClass168_3.method4274();
		if (!local3) {
			this.method801();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method790() {
		if (Static98.anInt1878 == 1000) {
			return;
		}
		Static261.anInt5259++;
		if (Static261.anInt5259 % 1000 == 1) {
			@Pc(26) GregorianCalendar local26 = new GregorianCalendar();
			Static246.anInt3362 = local26.get(11) * 600 + local26.get(12) * 10 + local26.get(13) / 6;
			Static54.aRandom1.setSeed((long) Static246.anInt3362);
		}
		this.method796();
		if (Static254.aClass20_113 != null) {
			Static254.aClass20_113.method620();
		}
		Static37.method2464();
		Static39.method716();
		Static13.method2697();
		Static214.method3388();
		if (Static240.aBoolean369) {
			Static154.method2375();
		}
		if (Static14.aClass90_1 != null) {
			@Pc(76) int local76 = Static14.aClass90_1.method3355();
			Static286.anInt5073 = local76;
		}
		if (Static98.anInt1878 == 0) {
			this.method799();
			Static81.method1390();
		} else if (Static98.anInt1878 == 5) {
			this.method799();
			Static81.method1390();
		} else if (Static98.anInt1878 == 25 || Static98.anInt1878 == 28) {
			Static202.method3148();
		}
		if (Static98.anInt1878 == 10) {
			this.method802();
			Static130.method2049();
			Static77.method1326();
			Static183.method4456();
		} else if (Static98.anInt1878 == 30) {
			Static105.method1661();
		} else if (Static98.anInt1878 == 40) {
			Static183.method4456();
			if (Static170.anInt3132 != -3) {
				if (Static170.anInt3132 == 15) {
					Static171.method2597();
				} else if (Static170.anInt3132 != 2) {
					Static51.method877();
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	protected void method785() {
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method799() {
		if (!Static203.aBoolean299) {
			label260: while (true) {
				do {
					if (!Static64.method1059()) {
						break label260;
					}
				} while (Static65.aChar1 != 's' && Static65.aChar1 != 'S');
				Static203.aBoolean299 = true;
			}
		}
		@Pc(40) int local40;
		if (Static37.anInt2946 == 0) {
			@Pc(30) Runtime local30 = Runtime.getRuntime();
			local40 = (int) ((local30.totalMemory() - local30.freeMemory()) / 1024L);
			@Pc(43) long local43 = Static252.method3964();
			if (Static189.aLong119 == 0L) {
				Static189.aLong119 = local43;
			}
			if (local40 > 16384 && local43 - Static189.aLong119 < 5000L) {
				if (local43 - Static199.aLong129 > 1000L) {
					System.gc();
					Static199.aLong129 = local43;
				}
				Static250.aString170 = Static140.aString91;
				Static217.anInt4478 = 5;
			} else {
				Static37.anInt2946 = 10;
				Static217.anInt4478 = 5;
				Static250.aString170 = Static9.aString10;
			}
			return;
		}
		@Pc(97) int local97;
		if (Static37.anInt2946 == 10) {
			Static194.method2939();
			for (local97 = 0; local97 < 4; local97++) {
				Static27.aClass2Array1[local97] = new Class2(104, 104);
			}
			Static217.anInt4478 = 10;
			Static250.aString170 = Static123.aString74;
			Static37.anInt2946 = 30;
		} else if (Static37.anInt2946 == 30) {
			if (Static254.aClass20_113 == null) {
				Static254.aClass20_113 = new Class20(Static137.aClass168_3, Static160.aClass179_2);
			}
			if (Static254.aClass20_113.method614()) {
				Static253.aClass7_205 = Static72.method1186(true, 0, true, false);
				Static79.aClass7_132 = Static72.method1186(true, 1, true, false);
				Static251.aClass7_203 = Static72.method1186(true, 2, false, true);
				Static41.aClass7_41 = Static72.method1186(true, 3, true, false);
				Static60.aClass7_60 = Static72.method1186(true, 4, true, false);
				Static216.aClass7_178 = Static72.method1186(true, 5, true, true);
				Static67.aClass7_68 = Static72.method1186(false, 6, true, true);
				Static27.aClass7_29 = Static72.method1186(true, 7, true, false);
				Static58.aClass7_58 = Static72.method1186(true, 8, true, false);
				Static299.aClass7_240 = Static72.method1186(true, 9, true, false);
				Static169.aClass7_138 = Static72.method1186(true, 10, true, false);
				Static52.aClass7_47 = Static72.method1186(true, 11, true, false);
				Static82.aClass7_82 = Static72.method1186(true, 12, true, false);
				Static39.aClass7_39 = Static72.method1186(true, 13, true, false);
				Static284.aClass7_229 = Static72.method1186(false, 14, true, false);
				Static227.aClass7_184 = Static72.method1186(true, 15, true, false);
				Static12.aClass7_18 = Static72.method1186(true, 16, true, false);
				Static158.aClass7_133 = Static72.method1186(true, 17, true, false);
				Static95.aClass7_87 = Static72.method1186(true, 18, true, false);
				Static272.aClass7_218 = Static72.method1186(true, 19, true, false);
				Static195.aClass7_162 = Static72.method1186(true, 20, true, false);
				Static44.aClass7_43 = Static72.method1186(true, 21, true, false);
				Static54.aClass7_48 = Static72.method1186(true, 22, true, false);
				Static133.aClass7_117 = Static72.method1186(true, 23, true, true);
				Static140.aClass7_121 = Static72.method1186(true, 24, true, false);
				Static136.aClass7_119 = Static72.method1186(true, 25, true, false);
				Static107.aClass7_97 = Static72.method1186(true, 26, true, true);
				Static204.aClass7_168 = Static72.method1186(true, 27, true, false);
				Static75.aClass7_74 = Static72.method1186(true, 28, true, true);
				Static250.aString170 = Static71.aString40;
				Static37.anInt2946 = 40;
				Static217.anInt4478 = 15;
			} else {
				Static217.anInt4478 = 12;
				Static250.aString170 = Static3.aString3;
			}
		} else if (Static37.anInt2946 == 40) {
			local97 = 0;
			for (local40 = 0; local40 < 29; local40++) {
				local97 += Static61.aClass143_Sub1Array2[local40].method3825() * Static235.anIntArray575[local40] / 100;
			}
			if (local97 == 100) {
				Static217.anInt4478 = 20;
				Static250.aString170 = Static3.aString2;
				Static80.method1357(Static58.aClass7_58);
				Static268.method4113(Static58.aClass7_58);
				Static216.method3457(Static58.aClass7_58);
				Static37.anInt2946 = 41;
			} else {
				Static217.anInt4478 = 20;
				if (local97 != 0) {
					Static250.aString170 = Static192.aString181 + local97 + "%";
				}
			}
		} else if (Static37.anInt2946 == 41) {
			if (Static75.aClass7_74.method261()) {
				this.method800(Static75.aClass7_74.method258(1));
				Static250.aString170 = Static10.aString12;
				Static37.anInt2946 = 45;
				Static217.anInt4478 = 25;
			} else {
				Static250.aString170 = Static46.aString27 + Static75.aClass7_74.method236() + "%";
				Static217.anInt4478 = 25;
			}
		} else if (Static37.anInt2946 == 45) {
			Static147.method2290(Static99.aBoolean138);
			Static93.aClass1_Sub8_Sub4_2 = new Class1_Sub8_Sub4();
			Static93.aClass1_Sub8_Sub4_2.method4241();
			Static72.aClass24_1 = Static4.method108(Static189.aCanvas1, 22050, Static13.aClass84_3, 0);
			Static72.aClass24_1.method2453(Static93.aClass1_Sub8_Sub4_2);
			Static51.method875(Static60.aClass7_60, Static227.aClass7_184, Static93.aClass1_Sub8_Sub4_2, Static284.aClass7_229);
			Static159.aClass24_2 = Static4.method108(Static189.aCanvas1, 2048, Static13.aClass84_3, 1);
			Static28.aClass1_Sub8_Sub3_1 = new Class1_Sub8_Sub3();
			Static159.aClass24_2.method2453(Static28.aClass1_Sub8_Sub3_1);
			Static61.aClass151_1 = new Class151(22050, Static234.anInt4892);
			Static92.anInt1748 = Static67.aClass7_68.method264("scape main");
			Static37.anInt2946 = 50;
			Static217.anInt4478 = 30;
			Static250.aString170 = Static139.aString90;
		} else if (Static37.anInt2946 == 50) {
			local97 = Static73.method1187(Static39.aClass7_39, Static58.aClass7_58);
			local40 = Static60.method1023();
			if (local97 >= local40) {
				Static217.anInt4478 = 35;
				Static250.aString170 = Static95.aString54;
				Static37.anInt2946 = 60;
			} else {
				Static217.anInt4478 = 35;
				Static250.aString170 = Static189.aString120 + local97 * 100 / local40 + "%";
			}
		} else if (Static37.anInt2946 == 60) {
			local97 = Static64.method1057(Static58.aClass7_58);
			local40 = Static233.method3728();
			if (local40 > local97) {
				Static250.aString170 = Static169.aString106 + local97 * 100 / local40 + "%";
				Static217.anInt4478 = 40;
			} else {
				Static217.anInt4478 = 40;
				Static37.anInt2946 = 65;
				Static250.aString170 = Static86.aString45;
			}
		} else if (Static37.anInt2946 == 65) {
			Static77.method1325(Static39.aClass7_39, Static58.aClass7_58);
			Static217.anInt4478 = 45;
			Static250.aString170 = Static131.aString87;
			Static299.method4554(5);
			Static37.anInt2946 = 70;
		} else if (Static37.anInt2946 == 70) {
			Static251.aClass7_203.method261();
			local97 = Static251.aClass7_203.method236();
			Static12.aClass7_18.method261();
			local97 += Static12.aClass7_18.method236();
			Static158.aClass7_133.method261();
			local97 += Static158.aClass7_133.method236();
			Static95.aClass7_87.method261();
			local97 += Static95.aClass7_87.method236();
			Static272.aClass7_218.method261();
			local97 += Static272.aClass7_218.method236();
			Static195.aClass7_162.method261();
			local97 += Static195.aClass7_162.method236();
			Static44.aClass7_43.method261();
			local97 += Static44.aClass7_43.method236();
			Static54.aClass7_48.method261();
			local97 += Static54.aClass7_48.method236();
			Static140.aClass7_121.method261();
			local97 += Static140.aClass7_121.method236();
			Static136.aClass7_119.method261();
			local97 += Static136.aClass7_119.method236();
			Static204.aClass7_168.method261();
			local97 += Static204.aClass7_168.method236();
			if (local97 >= 1100) {
				Static256.method3979(Static251.aClass7_203);
				Static287.method4361(Static251.aClass7_203);
				Static74.method1278(Static251.aClass7_203);
				Static118.method1852(Static27.aClass7_29, Static251.aClass7_203);
				Static17.method318(Static27.aClass7_29, Static12.aClass7_18);
				Static249.method3877(Static27.aClass7_29, Static95.aClass7_87);
				Static17.method319(Static27.aClass7_29, Static275.aClass1_Sub2_Sub12_Sub1_2, Static272.aClass7_218);
				Static140.method2198(Static251.aClass7_203);
				Static170.method2569(Static195.aClass7_162, Static253.aClass7_205, Static79.aClass7_132);
				Static174.method2636(Static251.aClass7_203);
				Static176.method2665(Static44.aClass7_43, Static27.aClass7_29);
				Static49.method848(Static54.aClass7_48);
				Static3.method106(Static251.aClass7_203);
				Static135.method3360(Static58.aClass7_58, Static27.aClass7_29, Static41.aClass7_41, Static39.aClass7_39);
				Static198.method3033(Static251.aClass7_203);
				Static28.method465(Static158.aClass7_133);
				Static229.method3661(Static140.aClass7_121, new Class146(), Static136.aClass7_119);
				Static16.method308(Static136.aClass7_119, Static140.aClass7_121);
				Static134.method2137(Static251.aClass7_203);
				Static71.method1172(Static251.aClass7_203);
				Static24.method427(Static251.aClass7_203);
				Static97.method1596(Static58.aClass7_58, Static251.aClass7_203);
				Static80.method1361(Static58.aClass7_58, Static251.aClass7_203);
				Static250.aString170 = Static4.aString5;
				Static217.anInt4478 = 50;
				Static41.method755();
				Static37.anInt2946 = 80;
			} else {
				Static250.aString170 = Static131.aString86 + local97 / 11 + "%";
				Static217.anInt4478 = 50;
			}
		} else if (Static37.anInt2946 == 80) {
			local97 = Static198.method3036(Static58.aClass7_58);
			local40 = Static84.method1404();
			if (local40 > local97) {
				Static217.anInt4478 = 60;
				Static250.aString170 = Static29.aString20 + local97 * 100 / local40 + "%";
			} else {
				Static222.method3549(Static58.aClass7_58);
				Static250.aString170 = Static260.aString178;
				Static37.anInt2946 = 90;
				Static217.anInt4478 = 60;
			}
		} else if (Static37.anInt2946 == 90) {
			if (Static107.aClass7_97.method261()) {
				@Pc(963) Class40_Sub1 local963 = new Class40_Sub1(Static299.aClass7_240, Static107.aClass7_97, Static58.aClass7_58, 20, !Static160.aBoolean222);
				Static208.method3252(local963);
				if (Static176.anInt3254 == 1) {
					Static208.method3234(0.9F);
				}
				if (Static176.anInt3254 == 2) {
					Static208.method3234(0.8F);
				}
				if (Static176.anInt3254 == 3) {
					Static208.method3234(0.7F);
				}
				if (Static176.anInt3254 == 4) {
					Static208.method3234(0.6F);
				}
				Static217.anInt4478 = 70;
				Static37.anInt2946 = 100;
				Static250.aString170 = Static220.aString146;
			} else {
				Static250.aString170 = Static247.aString166 + Static107.aClass7_97.method236() + "%";
				Static217.anInt4478 = 70;
			}
		} else if (Static37.anInt2946 == 100) {
			if (Static298.method4551(Static58.aClass7_58)) {
				Static37.anInt2946 = 110;
			}
		} else if (Static37.anInt2946 == 110) {
			Static74.aClass3_1 = new Class3();
			Static13.aClass84_3.method1958(Static74.aClass3_1, 10);
			Static37.anInt2946 = 120;
			Static250.aString170 = Static89.aString48;
			Static217.anInt4478 = 75;
		} else if (Static37.anInt2946 == 120) {
			if (Static169.aClass7_138.method259("", "huffman")) {
				@Pc(1067) Class99 local1067 = new Class99(Static169.aClass7_138.method260("", "huffman"));
				Static3.method105(local1067);
				Static217.anInt4478 = 80;
				Static37.anInt2946 = 130;
				Static250.aString170 = Static10.aString13;
			} else {
				Static217.anInt4478 = 80;
				Static250.aString170 = Static175.aString111 + "0%";
			}
		} else if (Static37.anInt2946 == 130) {
			if (!Static41.aClass7_41.method261()) {
				Static250.aString170 = Static145.aString94 + Static41.aClass7_41.method236() * 3 / 4 + "%";
				Static217.anInt4478 = 85;
			} else if (!Static82.aClass7_82.method261()) {
				Static250.aString170 = Static145.aString94 + (Static82.aClass7_82.method236() / 10 + 75) + "%";
				Static217.anInt4478 = 85;
			} else if (!Static39.aClass7_39.method261()) {
				Static250.aString170 = Static145.aString94 + (Static39.aClass7_39.method236() / 20 + 85) + "%";
				Static217.anInt4478 = 85;
			} else if (Static133.aClass7_117.method251("details")) {
				Static228.method3501(Static133.aClass7_117, Static159.aClass1_Sub2_Sub2_Sub1Array2);
				Static172.method2614(Static27.aClass7_29);
				Static37.anInt2946 = 135;
				Static217.anInt4478 = 95;
				Static250.aString170 = Static122.aString73;
			} else {
				Static250.aString170 = Static145.aString94 + (Static133.aClass7_117.method255("details") / 10 + 90) + "%";
				Static217.anInt4478 = 85;
			}
		} else if (Static37.anInt2946 == 135) {
			local97 = Static214.method3386();
			if (local97 == -1) {
				Static217.anInt4478 = 95;
				Static250.aString170 = Static53.aString29;
			} else if (local97 == 7 || local97 == 9) {
				this.method792("worldlistfull");
				Static299.method4554(1000);
			} else if (Static103.aBoolean139) {
				Static37.anInt2946 = 140;
				Static217.anInt4478 = 96;
				Static250.aString170 = Static143.aString92;
			} else {
				this.method792("worldlistio_" + local97);
				Static299.method4554(1000);
			}
		} else if (Static37.anInt2946 == 140) {
			Static195.anInt3761 = Static41.aClass7_41.method264("loginscreen");
			Static216.aClass7_178.method237(false);
			Static67.aClass7_68.method237(true);
			Static58.aClass7_58.method237(true);
			Static39.aClass7_39.method237(true);
			Static169.aClass7_138.method237(true);
			Static41.aClass7_41.method237(true);
			Static217.anInt4478 = 97;
			Static174.aBoolean240 = true;
			Static250.aString170 = Static233.aString158;
			Static37.anInt2946 = 150;
		} else if (Static37.anInt2946 == 150) {
			Static42.method759();
			if (Static203.aBoolean299) {
				Static286.anInt5079 = 0;
				Static8.anInt239 = 0;
				Static29.anInt623 = 0;
				Static207.anInt4118 = 0;
			}
			Static203.aBoolean299 = true;
			Static147.method2287(Static13.aClass84_3);
			Static282.method4510(Static8.anInt239, false, -1, -1);
			Static217.anInt4478 = 100;
			Static37.anInt2946 = 160;
			Static250.aString170 = Static103.aString61;
		} else if (Static37.anInt2946 == 160) {
			Static26.method442(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BB)V")
	private void method800(@OriginalArg(0) byte[] arg0) {
		@Pc(15) Class1_Sub18 local15 = new Class1_Sub18(arg0);
		while (true) {
			@Pc(19) int local19 = local15.method3122();
			if (local19 == 0) {
				return;
			}
			if (local19 == 1) {
				@Pc(32) int[] local32 = Static260.anIntArray612 = new int[6];
				local32[0] = local15.method3107();
				local32[1] = local15.method3107();
				local32[2] = local15.method3107();
				local32[3] = local15.method3107();
				local32[4] = local15.method3107();
				local32[5] = local15.method3107();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method801() {
		if (Static158.anInt2966 < Static137.aClass168_3.anInt5582) {
			Static63.anInt1291 = 5 * 50 * (Static137.aClass168_3.anInt5582 - 1);
			if (Static63.anInt1291 > 3000) {
				Static63.anInt1291 = 3000;
			}
			if (Static89.anInt1687 == Static52.anInt1108) {
				Static52.anInt1108 = Static254.anInt5889;
			} else {
				Static52.anInt1108 = Static89.anInt1687;
			}
			if (Static137.aClass168_3.anInt5582 >= 2 && Static137.aClass168_3.anInt5583 == 6) {
				this.method792("js5connect_outofdate");
				Static98.anInt1878 = 1000;
				return;
			}
			if (Static137.aClass168_3.anInt5582 >= 4 && Static137.aClass168_3.anInt5583 == -1) {
				this.method792("js5crc");
				Static98.anInt1878 = 1000;
				return;
			}
			if (Static137.aClass168_3.anInt5582 >= 4 && (Static98.anInt1878 == 0 || Static98.anInt1878 == 5)) {
				if (Static137.aClass168_3.anInt5583 == 7 || Static137.aClass168_3.anInt5583 == 9) {
					this.method792("js5connect_full");
				} else if (Static137.aClass168_3.anInt5583 > 0) {
					this.method792("js5connect");
				} else {
					this.method792("js5io");
				}
				Static98.anInt1878 = 1000;
				return;
			}
		}
		Static158.anInt2966 = Static137.aClass168_3.anInt5582;
		if (Static63.anInt1291 > 0) {
			Static63.anInt1291--;
			return;
		}
		try {
			if (Static32.anInt714 == 0) {
				Static2.aClass118_1 = Static13.aClass84_3.method1964(Static286.aString169, Static52.anInt1108);
				Static32.anInt714++;
			}
			if (Static32.anInt714 == 1) {
				if (Static2.aClass118_1.anInt3187 == 2) {
					this.method803(1000);
					return;
				}
				if (Static2.aClass118_1.anInt3187 == 1) {
					Static32.anInt714++;
				}
			}
			if (Static32.anInt714 == 2) {
				Static143.aClass73_2 = new Class73((Socket) Static2.aClass118_1.anObject3, Static13.aClass84_3);
				@Pc(187) Class1_Sub18 local187 = new Class1_Sub18(5);
				local187.method3093(15);
				local187.method3119(540);
				Static143.aClass73_2.method1685(5, local187.aByteArray71);
				Static32.anInt714++;
				Static153.aLong96 = Static252.method3964();
			}
			if (Static32.anInt714 == 3) {
				if (Static98.anInt1878 == 0 || Static98.anInt1878 == 5 || Static143.aClass73_2.method1687() > 0) {
					@Pc(242) int local242 = Static143.aClass73_2.method1686();
					if (local242 != 0) {
						this.method803(local242);
						return;
					}
					Static32.anInt714++;
				} else if (Static252.method3964() - Static153.aLong96 > 30000L) {
					this.method803(1001);
					return;
				}
			}
			if (Static32.anInt714 == 4) {
				@Pc(271) boolean local271 = Static98.anInt1878 == 5 || Static98.anInt1878 == 10 || Static98.anInt1878 == 28;
				Static137.aClass168_3.method4275(Static143.aClass73_2, !local271);
				Static143.aClass73_2 = null;
				Static2.aClass118_1 = null;
				Static32.anInt714 = 0;
			}
		} catch (@Pc(288) IOException local288) {
			this.method803(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method802() {
		for (Static57.anInt1183 = 0; Static64.method1059() && Static57.anInt1183 < 128; Static57.anInt1183++) {
			Static6.anIntArray21[Static57.anInt1183] = Static133.anInt2534;
			Static230.anIntArray567[Static57.anInt1183] = Static65.aChar1;
		}
		Static47.anInt5866++;
		if (Static121.anInt2350 != -1) {
			Static152.method2350(Static145.anInt2690, 0, 0, 0, 0, Static166.anInt3046, Static121.anInt2350);
		}
		Static56.anInt1175++;
		if (Static240.aBoolean369) {
			label194: for (@Pc(55) int local55 = 0; local55 < 32768; local55++) {
				@Pc(64) Class6_Sub6_Sub1 local64 = Static211.aClass6_Sub6_Sub1Array2[local55];
				if (local64 != null) {
					@Pc(71) byte local71 = local64.aClass19_1.aByte5;
					if ((local71 & 0x2) > 0 && local64.anInt4558 == 0 && Math.random() * 1000.0D < 10.0D) {
						@Pc(96) int local96 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						@Pc(104) int local104 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						if (local96 != 0 || local104 != 0) {
							local64.aByteArray76[0] = 1;
							local64.anIntArray519[0] = local96 + (local64.anInt4562 >> 7);
							local64.anIntArray516[0] = (local64.anInt4569 >> 7) + local104;
							Static27.aClass2Array1[Static159.anInt2978].method117(false, local64.method3509(), false, 0, local64.method3509(), local64.anInt4562 >> 7, local64.anInt4569 >> 7);
							if (local64.anIntArray519[0] >= 0 && local64.anIntArray519[0] <= 104 - local64.method3509() && local64.anIntArray516[0] >= 0 && local64.anIntArray516[0] <= 104 - local64.method3509() && Static27.aClass2Array1[Static159.anInt2978].method119(local64.anIntArray519[0], local64.anInt4562 >> 7, local64.anInt4569 >> 7, local64.anIntArray516[0])) {
								if (local64.method3509() > 1) {
									for (@Pc(226) int local226 = local64.anIntArray519[0]; local64.anIntArray519[0] + local64.method3509() > local226; local226++) {
										for (@Pc(242) int local242 = local64.anIntArray516[0]; local242 < local64.anIntArray516[0] + local64.method3509(); local242++) {
											if ((Static27.aClass2Array1[Static159.anInt2978].anIntArrayArray1[local226][local242] & 0x2401FF) != 0) {
												continue label194;
											}
										}
									}
								}
								local64.anInt4558 = 1;
							}
						}
					}
					Static38.method710(local64);
					Static145.method2277(local64);
					Static8.method184(local64);
					Static27.aClass2Array1[Static159.anInt2978].method118(false, local64.method3509(), local64.anInt4569 >> 7, local64.method3509(), local64.anInt4562 >> 7, false);
				}
			}
		}
		if (!Static240.aBoolean369) {
			Static243.method3850();
		} else if (Static224.anInt4701 == 0 && Static176.anInt3258 == 0) {
			if (Static109.anInt2057 == 2) {
				Static218.method964();
			} else {
				Static199.method3037();
			}
			if (Static182.anInt3398 >> 7 < 14 || Static182.anInt3398 >> 7 >= 90 || Static68.anInt4743 >> 7 < 14 || Static68.anInt4743 >> 7 >= 90) {
				Static12.method262();
			}
		}
		while (true) {
			@Pc(367) Class1_Sub20 local367;
			@Pc(374) Class127 local374;
			@Pc(383) Class127 local383;
			do {
				local367 = (Class1_Sub20) Static24.aClass69_3.method1630();
				if (local367 == null) {
					while (true) {
						do {
							local367 = (Class1_Sub20) Static106.aClass69_9.method1630();
							if (local367 == null) {
								while (true) {
									do {
										local367 = (Class1_Sub20) Static27.aClass69_4.method1630();
										if (local367 == null) {
											if (Static108.aClass127_7 != null) {
												Static207.method3230();
											}
											if (Static19.aClass118_3 != null && Static19.aClass118_3.anInt3187 == 1) {
												if (Static19.aClass118_3.anObject3 != null) {
													Static163.method3583(Static112.aString65, Static173.aBoolean239);
												}
												Static19.aClass118_3 = null;
												Static112.aString65 = null;
												Static173.aBoolean239 = false;
											}
											if (Static261.anInt5259 % 1500 == 0) {
												Static155.method2393();
											}
											return;
										}
										local374 = local367.aClass127_9;
										if (local374.anInt3573 < 0) {
											break;
										}
										local383 = Static75.method1287(local374.anInt3563);
									} while (local383 == null || local383.aClass127Array1 == null || local383.aClass127Array1.length <= local374.anInt3573 || local374 != local383.aClass127Array1[local374.anInt3573]);
									Static283.method4321(local367);
								}
							}
							local374 = local367.aClass127_9;
							if (local374.anInt3573 < 0) {
								break;
							}
							local383 = Static75.method1287(local374.anInt3563);
						} while (local383 == null || local383.aClass127Array1 == null || local383.aClass127Array1.length <= local374.anInt3573 || local374 != local383.aClass127Array1[local374.anInt3573]);
						Static283.method4321(local367);
					}
				}
				local374 = local367.aClass127_9;
				if (local374.anInt3573 < 0) {
					break;
				}
				local383 = Static75.method1287(local374.anInt3563);
			} while (local383 == null || local383.aClass127Array1 == null || local374.anInt3573 >= local383.aClass127Array1.length || local374 != local383.aClass127Array1[local374.anInt3573]);
			Static283.method4321(local367);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method803(@OriginalArg(1) int arg0) {
		Static137.aClass168_3.anInt5583 = arg0;
		Static32.anInt714 = 0;
		Static143.aClass73_2 = null;
		Static137.aClass168_3.anInt5582++;
		Static2.aClass118_1 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method781() {
		if (Static240.aBoolean369) {
			Static240.method3803();
		}
		if (Static136.aFrame1 != null) {
			Static106.method1682(Static13.aClass84_3, Static136.aFrame1);
			Static136.aFrame1 = null;
		}
		if (Static13.aClass84_3 != null) {
			Static13.aClass84_3.method1955(this.getClass());
		}
		if (Static74.aClass3_1 != null) {
			Static74.aClass3_1.aBoolean17 = false;
		}
		Static74.aClass3_1 = null;
		if (Static155.aClass73_3 != null) {
			Static155.aClass73_3.method1691();
			Static155.aClass73_3 = null;
		}
		Static134.method2140(Static189.aCanvas1);
		Static41.method751(Static189.aCanvas1);
		if (Static14.aClass90_1 != null) {
			Static14.aClass90_1.method3356(Static189.aCanvas1);
		}
		Static289.method4434();
		Static33.method612();
		Static14.aClass90_1 = null;
		if (Static72.aClass24_1 != null) {
			Static72.aClass24_1.method2462();
		}
		if (Static159.aClass24_2 != null) {
			Static159.aClass24_2.method2462();
		}
		Static137.aClass168_3.method4279();
		Static160.aClass179_2.method4525();
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method779()) {
			return;
		}
		Static49.anInt1063 = Integer.parseInt(this.getParameter("worldid"));
		Static243.anInt5013 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static243.anInt5013 < 0 || Static243.anInt5013 > 1) {
			Static243.anInt5013 = 0;
		}
		Static286.anInt5076 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static286.anInt5076 < 0 || Static286.anInt5076 > 2) {
			Static286.anInt5076 = 0;
		}
		@Pc(53) String local53 = this.getParameter("advertsuppressed");
		if (local53 != null && local53.equals("1")) {
			Static149.aBoolean196 = true;
		} else {
			Static149.aBoolean196 = false;
		}
		try {
			Static282.anInt5857 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(72) Exception local72) {
			Static282.anInt5857 = 0;
		}
		Static29.method480(Static282.anInt5857);
		@Pc(81) String local81 = this.getParameter("objecttag");
		if (local81 != null && local81.equals("1")) {
			Static286.aBoolean392 = true;
		} else {
			Static286.aBoolean392 = false;
		}
		@Pc(97) String local97 = this.getParameter("js");
		if (local97 != null && local97.equals("1")) {
			Static49.aBoolean90 = true;
		} else {
			Static49.aBoolean90 = false;
		}
		@Pc(114) String local114 = this.getParameter("game");
		if (local114 != null && local114.equals("1")) {
			Static107.anInt1994 = 1;
		} else {
			Static107.anInt1994 = 0;
		}
		try {
			Static129.anInt3918 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(134) Exception local134) {
			Static129.anInt3918 = 0;
		}
		Static266.aString179 = this.getParameter("settings");
		if (Static266.aString179 == null) {
			Static266.aString179 = "";
		}
		@Pc(148) String local148 = this.getParameter("country");
		if (local148 != null) {
			try {
				Static94.anInt1774 = Integer.parseInt(local148);
			} catch (@Pc(157) Exception local157) {
				Static94.anInt1774 = 0;
			}
		}
		@Pc(163) String local163 = this.getParameter("haveie6");
		if (local163 != null && local163.equals("1")) {
			Static219.aBoolean337 = true;
		} else {
			Static219.aBoolean337 = false;
		}
		Static95.aClient1 = this;
		this.method787(Static286.anInt5076 + 32);
	}
}
