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
				Static54.method870("argument count");
			}
			Static277.anInt5673 = Integer.parseInt(arg0[0]);
			Static147.anInt2995 = 2;
			if (arg0[1].equals("live")) {
				Static66.anInt4469 = 0;
			} else if (arg0[1].equals("rc")) {
				Static66.anInt4469 = 1;
			} else if (arg0[1].equals("wip")) {
				Static66.anInt4469 = 2;
			} else {
				Static54.method870("modewhat");
			}
			Static218.aBoolean362 = false;
			Static184.anInt3648 = Static20.method367(arg0[2]);
			if (Static184.anInt3648 == -1) {
				if (arg0[2].equals("english")) {
					Static184.anInt3648 = 0;
				} else if (arg0[2].equals("german")) {
					Static184.anInt3648 = 1;
				} else {
					Static54.method870("language");
				}
			}
			Static265.method4002(Static184.anInt3648);
			Static282.aBoolean65 = false;
			Static119.aBoolean204 = false;
			if (arg0[3].equals("game0")) {
				Static198.anInt3914 = 0;
			} else if (arg0[3].equals("game1")) {
				Static198.anInt3914 = 1;
			} else {
				Static54.method870("game");
			}
			Static260.anInt5234 = 0;
			Static73.aString61 = "";
			Static270.anInt5329 = 0;
			Static279.aBoolean460 = false;
			@Pc(132) client local132 = new client();
			Static249.aClient1 = local132;
			local132.method656("runescape", Static66.anInt4469 + 32);
			Static209.aFrame3.setLocation(40, 40);
		} catch (@Pc(152) Exception local152) {
			Static88.method1444(null, local152);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method655() {
		if (Static116.aBoolean188) {
			Static116.method1900();
		}
		if (Static58.aFrame2 != null) {
			Static178.method2735(Static199.aClass17_3, Static58.aFrame2);
			Static58.aFrame2 = null;
		}
		if (Static199.aClass17_3 != null) {
			Static199.aClass17_3.method450(this.getClass());
		}
		if (Static272.aClass87_1 != null) {
			Static272.aClass87_1.aBoolean212 = false;
		}
		Static272.aClass87_1 = null;
		if (Static95.aClass92_4 != null) {
			Static95.aClass92_4.method2176();
			Static95.aClass92_4 = null;
		}
		Static236.method3590(Static39.aCanvas1);
		Static171.method2675(Static39.aCanvas1);
		if (Static21.aClass41_1 != null) {
			Static21.aClass41_1.method1730(Static39.aCanvas1);
		}
		Static192.method3015();
		Static156.method2486();
		Static21.aClass41_1 = null;
		if (Static153.aClass111_2 != null) {
			Static153.aClass111_2.method4146();
		}
		if (Static79.aClass111_1 != null) {
			Static79.aClass111_1.method4146();
		}
		Static158.aClass139_2.method3448();
		Static130.aClass42_2.method937();
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method662() {
		if (!Static163.aBoolean361) {
			label260: while (true) {
				do {
					if (!Static45.method4136()) {
						break label260;
					}
				} while (Static27.aChar1 != 's' && Static27.aChar1 != 'S');
				Static163.aBoolean361 = true;
			}
		}
		@Pc(38) int local38;
		if (Static4.anInt53 == 0) {
			@Pc(28) Runtime local28 = Runtime.getRuntime();
			local38 = (int) ((local28.totalMemory() - local28.freeMemory()) / 1024L);
			@Pc(43) long local43 = Static71.method1143();
			if (Static145.aLong109 == 0L) {
				Static145.aLong109 = local43;
			}
			if (local38 > 16384 && local43 - Static145.aLong109 < 5000L) {
				if (local43 - Static258.aLong183 > 1000L) {
					System.gc();
					Static258.aLong183 = local43;
				}
				Static109.anInt2272 = 5;
				Static180.aString125 = Static161.aString107;
			} else {
				Static109.anInt2272 = 5;
				Static180.aString125 = Static4.aString7;
				Static4.anInt53 = 10;
			}
			return;
		}
		@Pc(95) int local95;
		if (Static4.anInt53 == 10) {
			Static186.method2916();
			for (local95 = 0; local95 < 4; local95++) {
				Static159.aClass112Array1[local95] = new Class112(104, 104);
			}
			Static180.aString125 = Static167.aString115;
			Static109.anInt2272 = 10;
			Static4.anInt53 = 30;
		} else if (Static4.anInt53 == 30) {
			if (Static139.aClass148_1 == null) {
				Static139.aClass148_1 = new Class148(Static158.aClass139_2, Static130.aClass42_2);
			}
			if (Static139.aClass148_1.method3560()) {
				Static230.aClass132_78 = Static7.method62(false, 0, true, true);
				Static97.aClass132_38 = Static7.method62(false, 1, true, true);
				Static279.aClass132_90 = Static7.method62(true, 2, false, true);
				Static81.aClass132_33 = Static7.method62(false, 3, true, true);
				Static207.aClass132_72 = Static7.method62(false, 4, true, true);
				Static157.aClass132_92 = Static7.method62(true, 5, true, true);
				Static88.aClass132_35 = Static7.method62(true, 6, true, false);
				Static28.aClass132_9 = Static7.method62(false, 7, true, true);
				Static145.aClass132_55 = Static7.method62(false, 8, true, true);
				Static84.aClass132_34 = Static7.method62(false, 9, true, true);
				Static210.aClass132_75 = Static7.method62(false, 10, true, true);
				Static246.aClass132_84 = Static7.method62(false, 11, true, true);
				Static206.aClass132_71 = Static7.method62(false, 12, true, true);
				Static35.aClass132_13 = Static7.method62(false, 13, true, true);
				Static89.aClass132_36 = Static7.method62(false, 14, true, false);
				Static245.aClass132_83 = Static7.method62(false, 15, true, true);
				Static299.aClass132_93 = Static7.method62(false, 16, true, true);
				Static222.aClass132_76 = Static7.method62(false, 17, true, true);
				Static195.aClass132_54 = Static7.method62(false, 18, true, true);
				Static269.aClass132_88 = Static7.method62(false, 19, true, true);
				Static231.aClass132_79 = Static7.method62(false, 20, true, true);
				Static123.aClass132_43 = Static7.method62(false, 21, true, true);
				Static31.aClass132_11 = Static7.method62(false, 22, true, true);
				Static172.aClass132_61 = Static7.method62(true, 23, true, true);
				Static204.aClass132_70 = Static7.method62(false, 24, true, true);
				Static136.aClass132_50 = Static7.method62(false, 25, true, true);
				Static204.aClass132_69 = Static7.method62(true, 26, true, true);
				Static52.aClass132_17 = Static7.method62(false, 27, true, true);
				Static249.aClass132_86 = Static7.method62(true, 28, true, true);
				Static4.anInt53 = 40;
				Static180.aString125 = Static9.aString9;
				Static109.anInt2272 = 15;
			} else {
				Static109.anInt2272 = 12;
				Static180.aString125 = Static246.aString172;
			}
		} else if (Static4.anInt53 == 40) {
			local95 = 0;
			for (local38 = 0; local38 < 29; local38++) {
				local95 += Static83.aClass46_Sub1Array1[local38].method980() * Static172.anIntArray261[local38] / 100;
			}
			if (local95 == 100) {
				Static180.aString125 = Static128.aString97;
				Static109.anInt2272 = 20;
				Static284.method4234(Static145.aClass132_55);
				Static81.method1348(Static145.aClass132_55);
				Static178.method2736(Static145.aClass132_55);
				Static4.anInt53 = 41;
			} else {
				Static109.anInt2272 = 20;
				if (local95 != 0) {
					Static180.aString125 = Static24.aString21 + local95 + "%";
				}
			}
		} else if (Static4.anInt53 == 41) {
			if (Static249.aClass132_86.method3187()) {
				this.method672(Static249.aClass132_86.method3177(1));
				Static180.aString125 = Static63.aString56;
				Static4.anInt53 = 45;
				Static109.anInt2272 = 25;
			} else {
				Static180.aString125 = Static290.aString198 + Static249.aClass132_86.method3169() + "%";
				Static109.anInt2272 = 25;
			}
		} else if (Static4.anInt53 == 45) {
			Static255.method3819(Static277.aBoolean477);
			Static194.aClass8_Sub8_Sub2_2 = new Class8_Sub8_Sub2();
			Static194.aClass8_Sub8_Sub2_2.method2125();
			Static153.aClass111_2 = Static54.method871(22050, Static199.aClass17_3, 0, Static39.aCanvas1);
			Static153.aClass111_2.method4150(Static194.aClass8_Sub8_Sub2_2);
			Static146.method2313(Static89.aClass132_36, Static207.aClass132_72, Static245.aClass132_83, Static194.aClass8_Sub8_Sub2_2);
			Static79.aClass111_1 = Static54.method871(2048, Static199.aClass17_3, 1, Static39.aCanvas1);
			Static84.aClass8_Sub8_Sub1_1 = new Class8_Sub8_Sub1();
			Static79.aClass111_1.method4150(Static84.aClass8_Sub8_Sub1_1);
			Static224.aClass75_1 = new Class75(22050, Static264.anInt5577);
			Static212.anInt4368 = Static88.aClass132_35.method3185("scape main");
			Static4.anInt53 = 50;
			Static109.anInt2272 = 30;
			Static180.aString125 = Static157.aString201;
		} else if (Static4.anInt53 == 50) {
			local95 = Static199.method3083(Static35.aClass132_13, Static145.aClass132_55);
			local38 = Static105.method1703();
			if (local95 < local38) {
				Static109.anInt2272 = 35;
				Static180.aString125 = Static236.aString166 + local95 * 100 / local38 + "%";
			} else {
				Static4.anInt53 = 60;
				Static109.anInt2272 = 35;
				Static180.aString125 = Static3.aString170;
			}
		} else if (Static4.anInt53 == 60) {
			local95 = Static21.method391(Static145.aClass132_55);
			local38 = Static272.method4050();
			if (local95 >= local38) {
				Static4.anInt53 = 65;
				Static109.anInt2272 = 40;
				Static180.aString125 = Static191.aString137;
			} else {
				Static180.aString125 = Static232.aString164 + local95 * 100 / local38 + "%";
				Static109.anInt2272 = 40;
			}
		} else if (Static4.anInt53 == 65) {
			Static105.method1705(Static145.aClass132_55, Static35.aClass132_13);
			Static109.anInt2272 = 45;
			Static180.aString125 = Static128.aString96;
			Static49.method774(5);
			Static4.anInt53 = 70;
		} else if (Static4.anInt53 == 70) {
			Static279.aClass132_90.method3187();
			local95 = Static279.aClass132_90.method3169();
			Static299.aClass132_93.method3187();
			local95 += Static299.aClass132_93.method3169();
			Static222.aClass132_76.method3187();
			local95 += Static222.aClass132_76.method3169();
			Static195.aClass132_54.method3187();
			local95 += Static195.aClass132_54.method3169();
			Static269.aClass132_88.method3187();
			local95 += Static269.aClass132_88.method3169();
			Static231.aClass132_79.method3187();
			local95 += Static231.aClass132_79.method3169();
			Static123.aClass132_43.method3187();
			local95 += Static123.aClass132_43.method3169();
			Static31.aClass132_11.method3187();
			local95 += Static31.aClass132_11.method3169();
			Static204.aClass132_70.method3187();
			local95 += Static204.aClass132_70.method3169();
			Static136.aClass132_50.method3187();
			local95 += Static136.aClass132_50.method3169();
			Static52.aClass132_17.method3187();
			local95 += Static52.aClass132_17.method3169();
			if (local95 >= 1100) {
				Static91.method1478(Static279.aClass132_90);
				Static275.method4083(Static279.aClass132_90);
				Static83.method1367(Static279.aClass132_90);
				Static197.method3046(Static28.aClass132_9, Static279.aClass132_90);
				Static173.method2686(Static28.aClass132_9, Static299.aClass132_93);
				Static78.method1277(Static28.aClass132_9, Static195.aClass132_54);
				Static74.method1177(Static28.aClass132_9, Static269.aClass132_88, Static210.aClass8_Sub1_Sub5_Sub2_7);
				Static156.method2490(Static279.aClass132_90);
				Static200.method3087(Static97.aClass132_38, Static231.aClass132_79, Static230.aClass132_78);
				Static119.method1929(Static279.aClass132_90);
				Static229.method3526(Static123.aClass132_43, Static28.aClass132_9);
				Static82.method1359(Static31.aClass132_11);
				Static227.method3514(Static279.aClass132_90);
				Static69.method1130(Static145.aClass132_55, Static35.aClass132_13, Static81.aClass132_33, Static28.aClass132_9);
				Static145.method2284(Static279.aClass132_90);
				Static58.method1725(Static222.aClass132_76);
				Static217.method3400(Static136.aClass132_50, new Class103(), Static204.aClass132_70);
				Static61.method955(Static136.aClass132_50, Static204.aClass132_70);
				Static86.method1408(Static279.aClass132_90);
				Static293.method4283(Static279.aClass132_90);
				Static185.method2874(Static279.aClass132_90);
				Static54.method865(Static145.aClass132_55, Static279.aClass132_90);
				Static255.method3820(Static145.aClass132_55, Static279.aClass132_90);
				Static109.anInt2272 = 50;
				Static180.aString125 = Static244.aString169;
				Static228.method3519();
				Static4.anInt53 = 80;
			} else {
				Static180.aString125 = Static255.aString175 + local95 / 11 + "%";
				Static109.anInt2272 = 50;
			}
		} else if (Static4.anInt53 == 80) {
			local95 = Static28.method471(Static145.aClass132_55);
			local38 = Static104.method1688();
			if (local95 >= local38) {
				Static63.method979(Static145.aClass132_55);
				Static180.aString125 = Static104.aString82;
				Static4.anInt53 = 90;
				Static109.anInt2272 = 60;
			} else {
				Static109.anInt2272 = 60;
				Static180.aString125 = Static191.aString139 + local95 * 100 / local38 + "%";
			}
		} else if (Static4.anInt53 == 90) {
			if (Static204.aClass132_69.method3187()) {
				@Pc(979) Class49_Sub1 local979 = new Class49_Sub1(Static84.aClass132_34, Static204.aClass132_69, Static145.aClass132_55, 20, !Static214.aBoolean355);
				Static96.method1524(local979);
				if (Static54.anInt1180 == 1) {
					Static96.method1525(0.9F);
				}
				if (Static54.anInt1180 == 2) {
					Static96.method1525(0.8F);
				}
				if (Static54.anInt1180 == 3) {
					Static96.method1525(0.7F);
				}
				if (Static54.anInt1180 == 4) {
					Static96.method1525(0.6F);
				}
				Static109.anInt2272 = 70;
				Static4.anInt53 = 100;
				Static180.aString125 = Static102.aString79;
			} else {
				Static180.aString125 = Static89.aString70 + Static204.aClass132_69.method3169() + "%";
				Static109.anInt2272 = 70;
			}
		} else if (Static4.anInt53 == 100) {
			if (Static65.method4176(Static145.aClass132_55)) {
				Static4.anInt53 = 110;
			}
		} else if (Static4.anInt53 == 110) {
			Static272.aClass87_1 = new Class87();
			Static199.aClass17_3.method449(Static272.aClass87_1, 10);
			Static180.aString125 = Static182.aString126;
			Static109.anInt2272 = 75;
			Static4.anInt53 = 120;
		} else if (Static4.anInt53 == 120) {
			if (Static210.aClass132_75.method3179("huffman", "")) {
				@Pc(1081) Class145 local1081 = new Class145(Static210.aClass132_75.method3162("huffman", ""));
				Static147.method2396(local1081);
				Static180.aString125 = Static290.aString197;
				Static4.anInt53 = 130;
				Static109.anInt2272 = 80;
			} else {
				Static180.aString125 = Static289.aString196 + "0%";
				Static109.anInt2272 = 80;
			}
		} else if (Static4.anInt53 == 130) {
			if (!Static81.aClass132_33.method3187()) {
				Static180.aString125 = Static12.aString15 + Static81.aClass132_33.method3169() * 3 / 4 + "%";
				Static109.anInt2272 = 85;
			} else if (!Static206.aClass132_71.method3187()) {
				Static180.aString125 = Static12.aString15 + (Static206.aClass132_71.method3169() / 10 + 75) + "%";
				Static109.anInt2272 = 85;
			} else if (!Static35.aClass132_13.method3187()) {
				Static180.aString125 = Static12.aString15 + (Static35.aClass132_13.method3169() / 20 + 85) + "%";
				Static109.anInt2272 = 85;
			} else if (Static172.aClass132_61.method3178("details")) {
				Static63.method974(Static13.aClass8_Sub1_Sub7_Sub1Array1, Static172.aClass132_61);
				Static131.method2096(Static28.aClass132_9);
				Static109.anInt2272 = 95;
				Static4.anInt53 = 135;
				Static180.aString125 = Static258.aString180;
			} else {
				Static180.aString125 = Static12.aString15 + (Static172.aClass132_61.method3182("details") / 10 + 90) + "%";
				Static109.anInt2272 = 85;
			}
		} else if (Static4.anInt53 == 135) {
			local95 = Static17.method315();
			if (local95 == -1) {
				Static109.anInt2272 = 95;
				Static180.aString125 = Static104.aString81;
			} else if (local95 == 7 || local95 == 9) {
				this.method649("worldlistfull");
				Static49.method774(1000);
			} else if (Static158.aBoolean272) {
				Static4.anInt53 = 140;
				Static180.aString125 = Static94.aString75;
				Static109.anInt2272 = 96;
			} else {
				this.method649("worldlistio_" + local95);
				Static49.method774(1000);
			}
		} else if (Static4.anInt53 == 140) {
			Static161.anInt3266 = Static81.aClass132_33.method3185("loginscreen");
			Static157.aClass132_92.method3164(false);
			Static88.aClass132_35.method3164(true);
			Static145.aClass132_55.method3164(true);
			Static35.aClass132_13.method3164(true);
			Static210.aClass132_75.method3164(true);
			Static81.aClass132_33.method3164(true);
			Static180.aString125 = Static104.aString80;
			Static4.anInt53 = 150;
			Static109.anInt2272 = 97;
			Static24.aBoolean42 = true;
		} else if (Static4.anInt53 == 150) {
			Static129.method2085();
			if (Static163.aBoolean361) {
				Static279.anInt5448 = 0;
				Static174.anInt3451 = 0;
				Static99.anInt2072 = 0;
				Static215.anInt4429 = 0;
			}
			Static163.aBoolean361 = true;
			Static269.method3754(Static199.aClass17_3);
			Static101.method1616(-1, -1, false, Static99.anInt2072);
			Static4.anInt53 = 160;
			Static109.anInt2272 = 100;
			Static180.aString125 = Static12.aString14;
		} else if (Static4.anInt53 == 160) {
			Static179.method2743(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method664() {
		@Pc(13) boolean local13 = Static158.aClass139_2.method3442();
		if (!local13) {
			this.method670();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method657() {
		if (Static23.anInt618 == 1000) {
			return;
		}
		Static183.anInt3590++;
		if (Static183.anInt3590 % 1000 == 1) {
			@Pc(31) GregorianCalendar local31 = new GregorianCalendar();
			Static123.anInt2480 = local31.get(11) * 600 + local31.get(12) * 10 + local31.get(13) / 6;
			Static17.aRandom1.setSeed((long) Static123.anInt2480);
		}
		this.method664();
		if (Static139.aClass148_1 != null) {
			Static139.aClass148_1.method3564();
		}
		Static44.method712();
		Static16.method2745();
		Static114.method1852();
		Static209.method3307();
		if (Static116.aBoolean188) {
			Static166.method2634();
		}
		if (Static21.aClass41_1 != null) {
			@Pc(82) int local82 = Static21.aClass41_1.method1728();
			Static183.anInt3587 = local82;
		}
		if (Static23.anInt618 == 0) {
			this.method662();
			Static159.method2557();
		} else if (Static23.anInt618 == 5) {
			this.method662();
			Static159.method2557();
		} else if (Static23.anInt618 == 25 || Static23.anInt618 == 28) {
			Static240.method3618();
		}
		if (Static23.anInt618 == 10) {
			this.method674();
			Static113.method1838();
			Static267.method4013();
			Static214.method3356();
		} else if (Static23.anInt618 == 30) {
			Static175.method2706();
		} else if (Static23.anInt618 == 40) {
			Static214.method3356();
			if (Static130.anInt2600 != -3) {
				if (Static130.anInt2600 == 15) {
					Static239.method3608();
				} else if (Static130.anInt2600 != 2) {
					Static206.method3267();
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method658() {
		Static184.method2847();
		Static130.aClass42_2 = new Class42();
		Static158.aClass139_2 = new Class139();
		if (Static66.anInt4469 != 0) {
			Static74.aByteArrayArray6 = new byte[50][];
		}
		Static104.method1689(Static199.aClass17_3);
		if (Static147.anInt2995 == 0) {
			Static267.aString190 = this.getCodeBase().getHost();
			Static37.anInt3863 = 43594;
			Static209.anInt4334 = 443;
		} else if (Static147.anInt2995 == 1) {
			Static267.aString190 = this.getCodeBase().getHost();
			Static37.anInt3863 = Static277.anInt5673 + 40000;
			Static209.anInt4334 = Static277.anInt5673 + 50000;
		} else if (Static147.anInt2995 == 2) {
			Static267.aString190 = "127.0.0.1";
			Static209.anInt4334 = Static277.anInt5673 + 50000;
			Static37.anInt3863 = Static277.anInt5673 + 40000;
		}
		Static33.anInt764 = Static37.anInt3863;
		Static190.anInt3820 = Static209.anInt4334;
		if (Static198.anInt3914 == 1) {
			Static21.aShortArray5 = Static118.aShortArray24;
			Static269.aBoolean399 = true;
			Static145.aShortArrayArray4 = Static192.aShortArrayArray8;
			Static152.aShortArrayArray5 = Static292.aShortArrayArray10;
			Static92.aShortArray17 = Static108.aShortArray22;
			Static233.anInt4709 = 0;
			Static233.anInt4710 = 16777215;
		} else {
			Static21.aShortArray5 = Static62.aShortArray53;
			Static145.aShortArrayArray4 = Static286.aShortArrayArray9;
			Static92.aShortArray17 = Static114.aShortArray23;
			Static152.aShortArrayArray5 = Static15.aShortArrayArray1;
		}
		Static150.aShortArray47 = Static257.aShortArray56 = Static77.aShortArray12 = Static232.aShortArray52 = new short[256];
		if (Static26.anInt662 == 3 && Static147.anInt2995 != 2) {
			Static11.anInt2977 = Static277.anInt5673;
		}
		Static159.anInt3248 = Static33.anInt764;
		Static2.anInt8 = Static37.anInt3863;
		Static224.aString162 = Static267.aString190;
		Static20.method363();
		Static225.method3500(Static39.aCanvas1);
		Static178.method2737(Static39.aCanvas1);
		Static21.aClass41_1 = Static229.method3523();
		if (Static21.aClass41_1 != null) {
			Static21.aClass41_1.method1729(Static39.aCanvas1);
		}
		Static165.anInt3348 = Static26.anInt662;
		try {
			if (Static199.aClass17_3.aClass35_2 != null) {
				Static176.aClass57_3 = new Class57(Static199.aClass17_3.aClass35_2, 5200, 0);
				for (@Pc(169) int local169 = 0; local169 < 29; local169++) {
					Static123.aClass57Array1[local169] = new Class57(Static199.aClass17_3.aClass35Array1[local169], 6000, 0);
				}
				Static77.aClass57_1 = new Class57(Static199.aClass17_3.aClass35_1, 6000, 0);
				Static253.aClass133_4 = new Class133(255, Static176.aClass57_3, Static77.aClass57_1, 500000);
				Static115.aClass57_2 = new Class57(Static199.aClass17_3.aClass35_3, 24, 0);
				Static199.aClass17_3.aClass35_1 = null;
				Static199.aClass17_3.aClass35Array1 = null;
				Static199.aClass17_3.aClass35_2 = null;
				Static199.aClass17_3.aClass35_3 = null;
			}
		} catch (@Pc(225) IOException local225) {
			Static253.aClass133_4 = null;
			Static176.aClass57_3 = null;
			Static77.aClass57_1 = null;
			Static115.aClass57_2 = null;
		}
		if (Static147.anInt2995 != 0) {
			Static216.aBoolean360 = true;
		}
		Static189.aString134 = Static206.aString151;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	@Override
	protected void method661() {
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method660()) {
			return;
		}
		Static277.anInt5673 = Integer.parseInt(this.getParameter("worldid"));
		Static147.anInt2995 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static147.anInt2995 < 0 || Static147.anInt2995 > 1) {
			Static147.anInt2995 = 0;
		}
		Static66.anInt4469 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static66.anInt4469 < 0 || Static66.anInt4469 > 2) {
			Static66.anInt4469 = 0;
		}
		@Pc(49) String local49 = this.getParameter("advertsuppressed");
		if (local49 != null && local49.equals("1")) {
			Static218.aBoolean362 = true;
		} else {
			Static218.aBoolean362 = false;
		}
		try {
			Static184.anInt3648 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(68) Exception local68) {
			Static184.anInt3648 = 0;
		}
		Static265.method4002(Static184.anInt3648);
		@Pc(77) String local77 = this.getParameter("objecttag");
		if (local77 != null && local77.equals("1")) {
			Static119.aBoolean204 = true;
		} else {
			Static119.aBoolean204 = false;
		}
		@Pc(93) String local93 = this.getParameter("js");
		if (local93 != null && local93.equals("1")) {
			Static282.aBoolean65 = true;
		} else {
			Static282.aBoolean65 = false;
		}
		@Pc(109) String local109 = this.getParameter("game");
		if (local109 != null && local109.equals("1")) {
			Static198.anInt3914 = 1;
		} else {
			Static198.anInt3914 = 0;
		}
		try {
			Static270.anInt5329 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(129) Exception local129) {
			Static270.anInt5329 = 0;
		}
		Static73.aString61 = this.getParameter("settings");
		if (Static73.aString61 == null) {
			Static73.aString61 = "";
		}
		@Pc(145) String local145 = this.getParameter("country");
		if (local145 != null) {
			try {
				Static260.anInt5234 = Integer.parseInt(local145);
			} catch (@Pc(153) Exception local153) {
				Static260.anInt5234 = 0;
			}
		}
		@Pc(159) String local159 = this.getParameter("haveie6");
		if (local159 != null && local159.equals("1")) {
			Static279.aBoolean460 = true;
		} else {
			Static279.aBoolean460 = false;
		}
		Static249.aClient1 = this;
		this.method654(Static66.anInt4469 + 32);
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method670() {
		if (Static158.aClass139_2.anInt4543 > Static180.anInt3531) {
			if (Static159.anInt3248 == Static2.anInt8) {
				Static159.anInt3248 = Static190.anInt3820;
			} else {
				Static159.anInt3248 = Static2.anInt8;
			}
			Static294.anInt5693 = (Static158.aClass139_2.anInt4543 - 1) * 250;
			if (Static294.anInt5693 > 3000) {
				Static294.anInt5693 = 3000;
			}
			if (Static158.aClass139_2.anInt4543 >= 2 && Static158.aClass139_2.anInt4544 == 6) {
				this.method649("js5connect_outofdate");
				Static23.anInt618 = 1000;
				return;
			}
			if (Static158.aClass139_2.anInt4543 >= 4 && Static158.aClass139_2.anInt4544 == -1) {
				this.method649("js5crc");
				Static23.anInt618 = 1000;
				return;
			}
			if (Static158.aClass139_2.anInt4543 >= 4 && (Static23.anInt618 == 0 || Static23.anInt618 == 5)) {
				if (Static158.aClass139_2.anInt4544 == 7 || Static158.aClass139_2.anInt4544 == 9) {
					this.method649("js5connect_full");
				} else if (Static158.aClass139_2.anInt4544 <= 0) {
					this.method649("js5io");
				} else {
					this.method649("js5connect");
				}
				Static23.anInt618 = 1000;
				return;
			}
		}
		Static180.anInt3531 = Static158.aClass139_2.anInt4543;
		if (Static294.anInt5693 > 0) {
			Static294.anInt5693--;
			return;
		}
		try {
			if (Static173.anInt3447 == 0) {
				Static276.aClass163_12 = Static199.aClass17_3.method445(Static224.aString162, Static159.anInt3248);
				Static173.anInt3447++;
			}
			if (Static173.anInt3447 == 1) {
				if (Static276.aClass163_12.anInt5259 == 2) {
					this.method673(1000);
					return;
				}
				if (Static276.aClass163_12.anInt5259 == 1) {
					Static173.anInt3447++;
				}
			}
			if (Static173.anInt3447 == 2) {
				Static291.aClass92_6 = new Class92((Socket) Static276.aClass163_12.anObject7, Static199.aClass17_3);
				@Pc(194) Class8_Sub2 local194 = new Class8_Sub2(5);
				local194.method2340(15);
				local194.method2330(544);
				Static291.aClass92_6.method2178(local194.aByteArray24, 5);
				Static173.anInt3447++;
				Static218.aLong155 = Static71.method1143();
			}
			if (Static173.anInt3447 == 3) {
				if (Static23.anInt618 == 0 || Static23.anInt618 == 5 || Static291.aClass92_6.method2175() > 0) {
					@Pc(263) int local263 = Static291.aClass92_6.method2177();
					if (local263 != 0) {
						this.method673(local263);
						return;
					}
					Static173.anInt3447++;
				} else if (Static71.method1143() - Static218.aLong155 > 30000L) {
					this.method673(1001);
					return;
				}
			}
			if (Static173.anInt3447 == 4) {
				@Pc(293) boolean local293 = Static23.anInt618 == 5 || Static23.anInt618 == 10 || Static23.anInt618 == 28;
				Static158.aClass139_2.method3446(Static291.aClass92_6, !local293);
				Static276.aClass163_12 = null;
				Static173.anInt3447 = 0;
				Static291.aClass92_6 = null;
			}
		} catch (@Pc(310) IOException local310) {
			this.method673(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[B)V")
	private void method672(@OriginalArg(1) byte[] arg0) {
		@Pc(15) Class8_Sub2 local15 = new Class8_Sub2(arg0);
		while (true) {
			@Pc(19) int local19 = local15.method2334();
			if (local19 == 0) {
				return;
			}
			if (local19 == 1) {
				@Pc(32) int[] local32 = Static234.anIntArray353 = new int[6];
				local32[0] = local15.method2375();
				local32[1] = local15.method2375();
				local32[2] = local15.method2375();
				local32[3] = local15.method2375();
				local32[4] = local15.method2375();
				local32[5] = local15.method2375();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method673(@OriginalArg(1) int arg0) {
		Static173.anInt3447 = 0;
		Static291.aClass92_6 = null;
		Static276.aClass163_12 = null;
		Static158.aClass139_2.anInt4544 = arg0;
		Static158.aClass139_2.anInt4543++;
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method674() {
		for (Static97.anInt2003 = 0; Static45.method4136() && Static97.anInt2003 < 128; Static97.anInt2003++) {
			Static156.anIntArray251[Static97.anInt2003] = Static60.anInt1301;
			Static13.anIntArray14[Static97.anInt2003] = Static27.aChar1;
		}
		Static185.anInt3691++;
		if (Static248.anInt4917 != -1) {
			Static189.method2949(Static250.anInt4959, Static248.anInt4917, 0, 0, 0, 0, Static13.anInt356);
		}
		Static157.anInt5706++;
		if (Static116.aBoolean188) {
			label197: for (@Pc(58) int local58 = 0; local58 < 32768; local58++) {
				@Pc(67) Class36_Sub3_Sub2 local67 = Static48.aClass36_Sub3_Sub2Array1[local58];
				if (local67 != null) {
					@Pc(74) byte local74 = local67.aClass173_1.aByte23;
					if ((local74 & 0x2) > 0 && local67.anInt4093 == 0 && Math.random() * 1000.0D < 10.0D) {
						@Pc(95) int local95 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						@Pc(103) int local103 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						if (local95 != 0 || local103 != 0) {
							local67.aByteArray36[0] = 1;
							local67.anIntArray310[0] = local95 + (local67.anInt4117 >> 7);
							local67.anIntArray308[0] = (local67.anInt4118 >> 7) + local103;
							Static159.aClass112Array1[Static34.anInt770].method2542(0, local67.anInt4118 >> 7, false, local67.method3110(), local67.anInt4117 >> 7, false, local67.method3110());
							if (local67.anIntArray310[0] >= 0 && local67.anIntArray310[0] <= 104 - local67.method3110() && local67.anIntArray308[0] >= 0 && local67.anIntArray308[0] <= 104 - local67.method3110() && Static159.aClass112Array1[Static34.anInt770].method2554(local67.anIntArray308[0], local67.anInt4118 >> 7, local67.anInt4117 >> 7, local67.anIntArray310[0])) {
								if (local67.method3110() > 1) {
									for (@Pc(238) int local238 = local67.anIntArray310[0]; local67.anIntArray310[0] + local67.method3110() > local238; local238++) {
										for (@Pc(256) int local256 = local67.anIntArray308[0]; local67.anIntArray308[0] + local67.method3110() > local256; local256++) {
											if ((Static159.aClass112Array1[Static34.anInt770].anIntArrayArray14[local238][local256] & 0x2401FF) != 0) {
												continue label197;
											}
										}
									}
								}
								local67.anInt4093 = 1;
							}
						}
					}
					Static23.method413(local67);
					Static234.method3566(local67);
					Static93.method1486(local67);
					Static159.aClass112Array1[Static34.anInt770].method2538(local67.method3110(), local67.anInt4117 >> 7, false, local67.anInt4118 >> 7, local67.method3110(), false);
				}
			}
		}
		if (!Static116.aBoolean188 && Static198.anInt3914 == 0) {
			Static130.method2092();
		} else if (Static247.anInt5536 == 0 && Static230.anInt4668 == 0) {
			if (Static172.anInt3428 == 2) {
				Static105.method1702();
			} else {
				Static74.method1178();
			}
			if (Static46.anInt1044 >> 7 < 14 || Static46.anInt1044 >> 7 >= 90 || Static185.anInt3689 >> 7 < 14 || Static185.anInt3689 >> 7 >= 90) {
				Static25.method432();
			}
		}
		while (true) {
			@Pc(385) Class8_Sub14 local385;
			@Pc(391) Class159 local391;
			@Pc(402) Class159 local402;
			do {
				local385 = (Class8_Sub14) Static167.aClass182_20.method4326();
				if (local385 == null) {
					while (true) {
						do {
							local385 = (Class8_Sub14) Static190.aClass182_23.method4326();
							if (local385 == null) {
								while (true) {
									do {
										local385 = (Class8_Sub14) Static180.aClass182_22.method4326();
										if (local385 == null) {
											if (Static201.aClass159_15 != null) {
												Static163.method3406();
											}
											if (Static3.aClass163_10 != null && Static3.aClass163_10.anInt5259 == 1) {
												if (Static3.aClass163_10.anObject7 != null) {
													Static37.method3008(Static79.aString65, Static102.aBoolean168);
												}
												Static79.aString65 = null;
												Static102.aBoolean168 = false;
												Static3.aClass163_10 = null;
											}
											if (Static183.anInt3590 % 1500 == 0) {
												Static23.method411();
											}
											return;
										}
										local391 = local385.aClass159_10;
										if (local391.anInt5133 < 0) {
											break;
										}
										local402 = Static82.method1361(local391.anInt5116);
									} while (local402 == null || local402.aClass159Array1 == null || local402.aClass159Array1.length <= local391.anInt5133 || local402.aClass159Array1[local391.anInt5133] != local391);
									Static173.method2688(local385);
								}
							}
							local391 = local385.aClass159_10;
							if (local391.anInt5133 < 0) {
								break;
							}
							local402 = Static82.method1361(local391.anInt5116);
						} while (local402 == null || local402.aClass159Array1 == null || local391.anInt5133 >= local402.aClass159Array1.length || local402.aClass159Array1[local391.anInt5133] != local391);
						Static173.method2688(local385);
					}
				}
				local391 = local385.aClass159_10;
				if (local391.anInt5133 < 0) {
					break;
				}
				local402 = Static82.method1361(local391.anInt5116);
			} while (local402 == null || local402.aClass159Array1 == null || local391.anInt5133 >= local402.aClass159Array1.length || local402.aClass159Array1[local391.anInt5133] != local391);
			Static173.method2688(local385);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method647() {
		if (Static23.anInt618 == 1000) {
			return;
		}
		@Pc(18) long local18 = Static242.method3645() / 1000000L - Static162.aLong123;
		Static162.aLong123 = Static242.method3645() / 1000000L;
		@Pc(26) boolean local26 = Static15.method287();
		if (local26 && Static140.aBoolean230 && Static153.aClass111_2 != null) {
			Static153.aClass111_2.method4140();
		}
		if ((Static23.anInt618 == 30 || Static23.anInt618 == 10) && (Static120.aBoolean205 || Static35.aLong29 != 0L && Static35.aLong29 < Static71.method1143())) {
			Static101.method1616(Static229.anInt4665, Static172.anInt3425, Static120.aBoolean205, Static99.method1585());
		}
		@Pc(88) int local88;
		@Pc(92) int local92;
		if (Static58.aFrame2 == null) {
			@Pc(72) Container local72;
			if (Static58.aFrame2 != null) {
				local72 = Static58.aFrame2;
			} else if (Static209.aFrame3 == null) {
				local72 = Static199.aClass17_3.anApplet1;
			} else {
				local72 = Static209.aFrame3;
			}
			local88 = local72.getSize().width;
			local92 = local72.getSize().height;
			if (Static209.aFrame3 == local72) {
				@Pc(99) Insets local99 = Static209.aFrame3.getInsets();
				local92 -= local99.bottom + local99.top;
				local88 -= local99.left + local99.right;
			}
			if (local88 != Static11.anInt2953 || Static151.anInt4076 != local92) {
				if (Static26.aString24.startsWith("mac")) {
					Static11.anInt2953 = local88;
					Static151.anInt4076 = local92;
				} else {
					Static184.method2847();
				}
				Static35.aLong29 = Static71.method1143() + 500L;
			}
		}
		if (Static58.aFrame2 != null && !Static269.aBoolean400 && (Static23.anInt618 == 30 || Static23.anInt618 == 10)) {
			Static101.method1616(-1, -1, false, Static99.anInt2072);
		}
		@Pc(170) boolean local170 = false;
		if (Static272.aBoolean453) {
			Static272.aBoolean453 = false;
			local170 = true;
		}
		if (local170) {
			Static253.method3796();
		}
		if (Static116.aBoolean188) {
			for (local88 = 0; local88 < 100; local88++) {
				Static128.aBooleanArray7[local88] = true;
			}
		}
		if (Static23.anInt618 == 0) {
			Static37.method3012(Static180.aString125, local170, Static109.anInt2272, null);
		} else if (Static23.anInt618 == 5) {
			Static214.method3354(false, Static229.aClass8_Sub1_Sub5_3);
		} else if (Static23.anInt618 == 10) {
			Static102.method1662();
		} else if (Static23.anInt618 == 25 || Static23.anInt618 == 28) {
			if (Static14.anInt370 == 1) {
				if (Static50.anInt1115 > Static92.anInt1943) {
					Static92.anInt1943 = Static50.anInt1115;
				}
				local88 = (Static92.anInt1943 - Static50.anInt1115) * 50 / Static92.anInt1943;
				Static261.method3923(Static58.aString83 + "<br>(" + local88 + "%)", false);
			} else if (Static14.anInt370 == 2) {
				if (Static4.anInt46 > Static266.anInt5290) {
					Static266.anInt5290 = Static4.anInt46;
				}
				local88 = (Static266.anInt5290 - Static4.anInt46) * 50 / Static266.anInt5290 + 50;
				Static261.method3923(Static58.aString83 + "<br>(" + local88 + "%)", false);
			} else {
				Static261.method3923(Static58.aString83, false);
			}
		} else if (Static23.anInt618 == 30) {
			Static181.method2772(local18);
		} else if (Static23.anInt618 == 40) {
			Static261.method3923(Static204.aString149 + "<br>" + Static101.aString78, false);
		}
		if (Static116.aBoolean188 && Static23.anInt618 != 0) {
			Static116.method1879();
			for (local88 = 0; local88 < Static235.anInt4759; local88++) {
				Static44.aBooleanArray3[local88] = false;
			}
		} else {
			@Pc(359) Graphics local359;
			if ((Static23.anInt618 == 30 || Static23.anInt618 == 10) && Static138.anInt2763 == 0 && !local170) {
				try {
					local359 = Static39.aCanvas1.getGraphics();
					for (local92 = 0; local92 < Static235.anInt4759; local92++) {
						if (Static44.aBooleanArray3[local92]) {
							Static99.aClass4_1.method3762(local359, Static78.anIntArray113[local92], Static250.anIntArray374[local92], Static57.anIntArray84[local92], Static295.anIntArray277[local92]);
							Static44.aBooleanArray3[local92] = false;
						}
					}
				} catch (@Pc(397) Exception local397) {
					Static39.aCanvas1.repaint();
				}
			} else if (Static23.anInt618 != 0) {
				try {
					local359 = Static39.aCanvas1.getGraphics();
					Static99.aClass4_1.method3763(local359);
					for (local92 = 0; local92 < Static235.anInt4759; local92++) {
						Static44.aBooleanArray3[local92] = false;
					}
				} catch (@Pc(428) Exception local428) {
					Static39.aCanvas1.repaint();
				}
			}
		}
		if (Static24.aBoolean42) {
			Static68.method1241();
		}
		if (Static163.aBoolean361 && Static23.anInt618 == 10 && Static248.anInt4917 != -1) {
			Static163.aBoolean361 = false;
			Static269.method3754(Static199.aClass17_3);
		}
	}
}
