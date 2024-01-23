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
				Static146.method2488("argument count");
			}
			Static123.anInt2530 = Integer.parseInt(arg0[0]);
			Static85.anInt1679 = 2;
			if (arg0[1].equals("live")) {
				Static31.anInt552 = 0;
			} else if (arg0[1].equals("rc")) {
				Static31.anInt552 = 1;
			} else if (arg0[1].equals("wip")) {
				Static31.anInt552 = 2;
			} else {
				Static146.method2488("modewhat");
			}
			Static113.aBoolean138 = false;
			Static114.anInt2371 = Static218.method1094(arg0[2]);
			if (Static114.anInt2371 == -1) {
				if (arg0[2].equals("english")) {
					Static114.anInt2371 = 0;
				} else if (arg0[2].equals("german")) {
					Static114.anInt2371 = 1;
				} else {
					Static146.method2488("language");
				}
			}
			Static64.method1152(Static114.anInt2371);
			Static155.aBoolean191 = false;
			Static96.aBoolean106 = false;
			if (arg0[3].equals("game0")) {
				Static118.anInt2486 = 0;
			} else if (arg0[3].equals("game1")) {
				Static118.anInt2486 = 1;
			} else {
				Static146.method2488("game");
			}
			Static154.aBoolean186 = false;
			Static37.aString43 = "";
			Static71.anInt1519 = 0;
			Static212.anInt650 = 0;
			@Pc(124) client local124 = new client();
			Static196.aClient1 = local124;
			local124.method675(Static31.anInt552 + 32, Static118.anInt2486 == 1 ? "mechscape" : "runescape");
			Static197.aFrame1.setLocation(40, 40);
		} catch (@Pc(151) Exception local151) {
			Static159.method2733(local151, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method663() {
		if (Static37.anInt773 == 1000) {
			return;
		}
		@Pc(17) long local17 = Static315.method4459() / 1000000L - Static46.aLong38;
		Static46.aLong38 = Static315.method4459() / 1000000L;
		@Pc(27) boolean local27 = Static137.method2375();
		if (local27 && Static152.aBoolean36 && Static300.aClass28_2 != null) {
			Static300.aClass28_2.method4769();
		}
		if ((Static37.anInt773 == 30 || Static37.anInt773 == 10) && (Static270.aBoolean338 || Static117.aLong88 != 0L && Static298.method4535() > Static117.aLong88)) {
			Static259.method4091(Static270.aBoolean338, Static228.method3541(), Static48.anInt956, Static218.anInt1144);
		}
		@Pc(92) int local92;
		@Pc(96) int local96;
		if (Static275.aFrame2 == null) {
			@Pc(77) Container local77;
			if (Static275.aFrame2 != null) {
				local77 = Static275.aFrame2;
			} else if (Static197.aFrame1 == null) {
				local77 = Static26.aClass154_1.anApplet1;
			} else {
				local77 = Static197.aFrame1;
			}
			local92 = local77.getSize().width;
			local96 = local77.getSize().height;
			if (Static197.aFrame1 == local77) {
				@Pc(102) Insets local102 = Static197.aFrame1.getInsets();
				local92 -= local102.left + local102.right;
				local96 -= local102.top + local102.bottom;
			}
			if (Static171.anInt3365 != local92 || local96 != Static132.anInt3685) {
				if (Static246.aString266.startsWith("mac")) {
					Static171.anInt3365 = local92;
					Static132.anInt3685 = local96;
				} else {
					Static185.method3031();
				}
				Static117.aLong88 = Static298.method4535() + 500L;
			}
		}
		@Pc(150) boolean local150 = false;
		if (Static275.aFrame2 != null && !Static13.aBoolean6 && (Static37.anInt773 == 30 || Static37.anInt773 == 10)) {
			Static259.method4091(false, Static41.anInt852, -1, -1);
		}
		if (Static52.aBoolean380) {
			Static52.aBoolean380 = false;
			local150 = true;
		}
		if (local150) {
			Static13.method176();
		}
		if (Static156.aBoolean211) {
			for (local92 = 0; local92 < 100; local92++) {
				Static304.aBooleanArray23[local92] = true;
			}
		}
		if (Static37.anInt773 == 0) {
			Static204.method3261(null, Static133.anInt2675, Static258.aString279, local150);
		} else if (Static37.anInt773 == 5) {
			Static191.method3102(false, Static307.aClass1_Sub2_Sub6_4);
		} else if (Static37.anInt773 == 10) {
			Static32.method2409();
		} else if (Static37.anInt773 == 25 || Static37.anInt773 == 28) {
			if (Static63.anInt3251 == 1) {
				if (Static57.anInt1091 < Static193.anInt3675) {
					Static57.anInt1091 = Static193.anInt3675;
				}
				local92 = (Static57.anInt1091 - Static193.anInt3675) * 50 / Static57.anInt1091;
				Static1.method14(false, Static180.aString200 + "<br>(" + local92 + "%)");
			} else if (Static63.anInt3251 == 2) {
				if (Static258.anInt4706 > Static242.anInt4408) {
					Static242.anInt4408 = Static258.anInt4706;
				}
				local92 = (Static242.anInt4408 - Static258.anInt4706) * 50 / Static242.anInt4408 + 50;
				Static1.method14(false, Static180.aString200 + "<br>(" + local92 + "%)");
			} else {
				Static1.method14(false, Static180.aString200);
			}
		} else if (Static37.anInt773 == 30) {
			Static129.method2229(local17);
		} else if (Static37.anInt773 == 40) {
			Static1.method14(false, Static313.aString168 + "<br>" + Static54.aString62);
		}
		if (Static156.aBoolean211 && Static37.anInt773 != 0) {
			Static156.method2662();
			for (local92 = 0; local92 < Static293.anInt5272; local92++) {
				Static116.aBooleanArray8[local92] = false;
			}
		} else {
			@Pc(369) Graphics local369;
			if ((Static37.anInt773 == 30 || Static37.anInt773 == 10) && Static301.anInt5354 == 0 && !local150) {
				try {
					local369 = Static127.aCanvas1.getGraphics();
					for (local96 = 0; local96 < Static293.anInt5272; local96++) {
						if (Static116.aBooleanArray8[local96]) {
							Static94.aClass58_3.method2973(Static217.anIntArray342[local96], Static46.anIntArray57[local96], Static294.anIntArray467[local96], local369, Static233.anIntArray365[local96]);
							Static116.aBooleanArray8[local96] = false;
						}
					}
				} catch (@Pc(435) Exception local435) {
					Static127.aCanvas1.repaint();
				}
			} else if (Static37.anInt773 != 0) {
				try {
					local369 = Static127.aCanvas1.getGraphics();
					Static94.aClass58_3.method2967(local369);
					for (local96 = 0; local96 < Static293.anInt5272; local96++) {
						Static116.aBooleanArray8[local96] = false;
					}
				} catch (@Pc(389) Exception local389) {
					Static127.aCanvas1.repaint();
				}
			}
		}
		if (Static148.aBoolean181) {
			Static153.method2614();
		}
		if (Static277.aBoolean341 && Static37.anInt773 == 10 && Static270.anInt4897 != -1) {
			Static277.aBoolean341 = false;
			Static286.method4396(Static26.aClass154_1);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method678() {
		if (!Static277.aBoolean341) {
			label262: while (true) {
				do {
					if (!Static123.method2169()) {
						break label262;
					}
				} while (Static117.aChar3 != 's' && Static117.aChar3 != 'S');
				Static277.aBoolean341 = true;
			}
		}
		@Pc(38) int local38;
		if (Static256.anInt4643 == 0) {
			@Pc(28) Runtime local28 = Runtime.getRuntime();
			local38 = (int) ((local28.totalMemory() - local28.freeMemory()) / 1024L);
			@Pc(43) long local43 = Static298.method4535();
			if (Static219.aLong140 == 0L) {
				Static219.aLong140 = local43;
			}
			if (local38 > 16384 && local43 - Static219.aLong140 < 5000L) {
				if (local43 - Static171.aLong122 > 1000L) {
					System.gc();
					Static171.aLong122 = local43;
				}
				Static133.anInt2675 = 5;
				Static258.aString279 = Static174.aString196;
			} else {
				Static256.anInt4643 = 10;
				Static133.anInt2675 = 5;
				Static258.aString279 = Static235.aString317;
			}
			return;
		}
		@Pc(93) int local93;
		if (Static256.anInt4643 == 10) {
			for (local93 = 0; local93 < 4; local93++) {
				Static240.aClass118Array1[local93] = new Class118(104, 104);
			}
			Static258.aString279 = Static269.aString142;
			Static133.anInt2675 = 10;
			Static256.anInt4643 = 30;
		} else if (Static256.anInt4643 == 30) {
			if (Static66.aClass109_3 == null) {
				Static66.aClass109_3 = new Class109(Static66.aClass22_5, Static210.aClass31_3);
			}
			if (Static66.aClass109_3.method2909()) {
				Static152.aClass121_23 = Static16.method4780(false, true, true, 0);
				Static210.aClass121_91 = Static16.method4780(false, true, true, 1);
				Static123.aClass121_57 = Static16.method4780(true, false, true, 2);
				Static239.aClass121_103 = Static16.method4780(false, true, true, 3);
				Static15.aClass121_12 = Static16.method4780(false, true, true, 4);
				Static313.aClass121_73 = Static16.method4780(true, true, true, 5);
				Static308.aClass121_135 = Static16.method4780(true, true, false, 6);
				Static3.aClass121_1 = Static16.method4780(false, true, true, 7);
				Static258.aClass121_114 = Static16.method4780(false, true, true, 8);
				Static261.aClass121_116 = Static16.method4780(false, true, true, 9);
				Static208.aClass121_89 = Static16.method4780(false, true, true, 10);
				Static32.aClass121_68 = Static16.method4780(false, true, true, 11);
				Static162.aClass121_77 = Static16.method4780(false, true, true, 12);
				Static103.aClass121_52 = Static16.method4780(false, true, true, 13);
				Static76.aClass121_42 = Static16.method4780(false, true, false, 14);
				Static43.aClass121_31 = Static16.method4780(false, true, true, 15);
				Static151.aClass121_71 = Static16.method4780(false, true, true, 16);
				Static173.aClass121_82 = Static16.method4780(false, true, true, 17);
				Static136.aClass121_66 = Static16.method4780(false, true, true, 18);
				Static12.aClass121_10 = Static16.method4780(false, true, true, 19);
				Static8.aClass121_5 = Static16.method4780(false, true, true, 20);
				Static282.aClass121_125 = Static16.method4780(false, true, true, 21);
				Static285.aClass121_127 = Static16.method4780(false, true, true, 22);
				Static242.aClass121_104 = Static16.method4780(true, true, true, 23);
				Static145.aClass121_70 = Static16.method4780(false, true, true, 24);
				Static269.aClass121_56 = Static16.method4780(false, true, true, 25);
				Static24.aClass121_13 = Static16.method4780(true, true, true, 26);
				Static133.aClass121_65 = Static16.method4780(false, true, true, 27);
				Static210.aClass121_92 = Static16.method4780(true, true, true, 28);
				Static256.anInt4643 = 40;
				Static133.anInt2675 = 15;
				Static258.aString279 = Static3.aString5;
			} else {
				Static133.anInt2675 = 12;
				Static258.aString279 = Static202.aString214;
			}
		} else if (Static256.anInt4643 == 40) {
			local93 = 0;
			for (local38 = 0; local38 < 29; local38++) {
				local93 += Static5.aClass21_Sub1Array1[local38].method2416() * Static290.anIntArray462[local38] / 100;
			}
			if (local93 == 100) {
				Static258.aString279 = Static173.aString193;
				Static133.anInt2675 = 20;
				Static184.method3005(Static258.aClass121_114);
				Static203.method3256(Static258.aClass121_114);
				Static88.method1626(Static258.aClass121_114);
				Static256.anInt4643 = 41;
			} else {
				if (local93 != 0) {
					Static258.aString279 = Static240.aString248 + local93 + "%";
				}
				Static133.anInt2675 = 20;
			}
		} else if (Static256.anInt4643 == 41) {
			if (Static210.aClass121_92.method3117()) {
				this.method680(Static210.aClass121_92.method3139(1));
				Static256.anInt4643 = 45;
				Static133.anInt2675 = 25;
				Static258.aString279 = Static71.aString87;
			} else {
				Static258.aString279 = Static26.aString31 + Static210.aClass121_92.method3126() + "%";
				Static133.anInt2675 = 25;
			}
		} else if (Static256.anInt4643 == 45) {
			Static233.method3607(Static219.aBoolean281);
			Static116.aClass1_Sub24_Sub4_1 = new Class1_Sub24_Sub4();
			Static116.aClass1_Sub24_Sub4_1.method4661();
			Static300.aClass28_2 = Static146.method2490(22050, Static127.aCanvas1, 0, Static26.aClass154_1);
			Static300.aClass28_2.method4770(Static116.aClass1_Sub24_Sub4_1);
			Static94.method2972(Static116.aClass1_Sub24_Sub4_1, Static43.aClass121_31, Static15.aClass121_12, Static76.aClass121_42);
			Static248.aClass28_1 = Static146.method2490(2048, Static127.aCanvas1, 1, Static26.aClass154_1);
			Static205.aClass1_Sub24_Sub3_1 = new Class1_Sub24_Sub3();
			Static248.aClass28_1.method4770(Static205.aClass1_Sub24_Sub3_1);
			Static84.aClass117_1 = new Class117(22050, Static303.anInt5383);
			Static37.anInt772 = Static308.aClass121_135.method3108("scape main");
			Static258.aString279 = Static300.aString326;
			Static133.anInt2675 = 30;
			Static256.anInt4643 = 50;
		} else if (Static256.anInt4643 == 50) {
			local93 = Static38.method3320(Static258.aClass121_114, Static103.aClass121_52);
			local38 = Static103.method1863();
			if (local93 < local38) {
				Static258.aString279 = Static52.aString337 + local93 * 100 / local38 + "%";
				Static133.anInt2675 = 35;
			} else {
				Static256.anInt4643 = 60;
				Static133.anInt2675 = 35;
				Static258.aString279 = Static56.aString65;
			}
		} else if (Static256.anInt4643 == 60) {
			local93 = Static174.method2939(Static258.aClass121_114);
			local38 = Static15.method200();
			if (local93 < local38) {
				Static133.anInt2675 = 40;
				Static258.aString279 = Static66.aString244 + local93 * 100 / local38 + "%";
			} else {
				Static133.anInt2675 = 40;
				Static256.anInt4643 = 65;
				Static258.aString279 = Static190.aString206;
			}
		} else if (Static256.anInt4643 == 65) {
			Static274.method4265(Static258.aClass121_114, Static103.aClass121_52);
			Static258.aString279 = Static209.aString223;
			Static133.anInt2675 = 45;
			Static65.method1215(5);
			Static256.anInt4643 = 70;
		} else if (Static256.anInt4643 == 70) {
			Static123.aClass121_57.method3117();
			local93 = Static123.aClass121_57.method3126();
			Static151.aClass121_71.method3117();
			local93 += Static151.aClass121_71.method3126();
			Static173.aClass121_82.method3117();
			local93 += Static173.aClass121_82.method3126();
			Static136.aClass121_66.method3117();
			local93 += Static136.aClass121_66.method3126();
			Static12.aClass121_10.method3117();
			local93 += Static12.aClass121_10.method3126();
			Static8.aClass121_5.method3117();
			local93 += Static8.aClass121_5.method3126();
			Static282.aClass121_125.method3117();
			local93 += Static282.aClass121_125.method3126();
			Static285.aClass121_127.method3117();
			local93 += Static285.aClass121_127.method3126();
			Static145.aClass121_70.method3117();
			local93 += Static145.aClass121_70.method3126();
			Static269.aClass121_56.method3117();
			local93 += Static269.aClass121_56.method3126();
			Static133.aClass121_65.method3117();
			local93 += Static133.aClass121_65.method3126();
			if (local93 >= 1100) {
				Static207.method3318(Static123.aClass121_57);
				Static299.method4546(Static123.aClass121_57);
				Static303.method4584(Static123.aClass121_57);
				Static12.method166(Static3.aClass121_1, Static123.aClass121_57);
				Static281.method4342(Static3.aClass121_1, Static151.aClass121_71);
				Static18.method268(Static136.aClass121_66, Static3.aClass121_1);
				Static307.method4643(Static34.aClass1_Sub2_Sub6_Sub1_4, Static3.aClass121_1, Static12.aClass121_10);
				Static4.method28(Static123.aClass121_57);
				Static306.method4608(Static210.aClass121_91, Static8.aClass121_5, Static152.aClass121_23);
				Static139.method2418(Static123.aClass121_57);
				Static308.method4672(Static3.aClass121_1, Static282.aClass121_125);
				Static196.method3170(Static285.aClass121_127);
				Static238.method3680(Static123.aClass121_57);
				Static49.method908(Static239.aClass121_103, Static258.aClass121_114, Static103.aClass121_52, Static3.aClass121_1);
				Static74.method1465(Static123.aClass121_57);
				Static117.method2103(Static173.aClass121_82);
				Static251.method3970(new Class193(), Static145.aClass121_70, Static269.aClass121_56);
				Static52.method4722(Static269.aClass121_56, Static145.aClass121_70);
				Static77.method1508(Static123.aClass121_57);
				Static285.method4390(Static123.aClass121_57);
				Static132.method3148(Static123.aClass121_57);
				Static280.method4338(Static123.aClass121_57, Static258.aClass121_114);
				Static135.method2337(Static258.aClass121_114, Static123.aClass121_57);
				Static116.method2094(Static258.aClass121_114, Static123.aClass121_57);
				Static133.anInt2675 = 50;
				Static258.aString279 = Static253.aString274;
				Static184.method3006();
				Static256.anInt4643 = 80;
			} else {
				Static133.anInt2675 = 50;
				Static258.aString279 = Static237.aString245 + local93 / 11 + "%";
			}
		} else if (Static256.anInt4643 == 80) {
			local93 = Static53.method967(Static258.aClass121_114);
			local38 = Static95.method1734();
			if (local38 <= local93) {
				Static167.method2844(Static258.aClass121_114);
				Static256.anInt4643 = 90;
				Static258.aString279 = Static245.aString259;
				Static133.anInt2675 = 60;
			} else {
				Static258.aString279 = Static196.aString209 + local93 * 100 / local38 + "%";
				Static133.anInt2675 = 60;
			}
		} else if (Static256.anInt4643 == 90) {
			if (Static24.aClass121_13.method3117()) {
				@Pc(971) Class30_Sub1 local971 = new Class30_Sub1(Static261.aClass121_116, Static24.aClass121_13, Static258.aClass121_114, 20, !Static310.aBoolean382);
				Static215.method3371(local971);
				if (Static184.anInt3503 == 1) {
					Static215.method3362(0.9F);
				}
				if (Static184.anInt3503 == 2) {
					Static215.method3362(0.8F);
				}
				if (Static184.anInt3503 == 3) {
					Static215.method3362(0.7F);
				}
				if (Static184.anInt3503 == 4) {
					Static215.method3362(0.6F);
				}
				Static256.anInt4643 = 100;
				Static133.anInt2675 = 70;
				Static258.aString279 = Static176.aString198;
			} else {
				Static258.aString279 = Static2.aString4 + Static24.aClass121_13.method3126() + "%";
				Static133.anInt2675 = 70;
			}
		} else if (Static256.anInt4643 == 100) {
			if (Static94.method2969(Static258.aClass121_114)) {
				Static256.anInt4643 = 110;
			}
		} else if (Static256.anInt4643 == 110) {
			Static136.aClass88_1 = new Class88();
			Static26.aClass154_1.method3881(10, Static136.aClass88_1);
			Static258.aString279 = Static79.aString96;
			Static256.anInt4643 = 120;
			Static133.anInt2675 = 75;
		} else if (Static256.anInt4643 == 120) {
			if (Static208.aClass121_89.method3118("huffman", "")) {
				@Pc(1081) Class192 local1081 = new Class192(Static208.aClass121_89.method3134("huffman", ""));
				Static297.method4533(local1081);
				Static258.aString279 = Static290.aString308;
				Static133.anInt2675 = 80;
				Static256.anInt4643 = 130;
			} else {
				Static258.aString279 = Static103.aString118 + "0%";
				Static133.anInt2675 = 80;
			}
		} else if (Static256.anInt4643 == 130) {
			if (!Static239.aClass121_103.method3117()) {
				Static258.aString279 = Static86.aString103 + Static239.aClass121_103.method3126() * 3 / 4 + "%";
				Static133.anInt2675 = 85;
			} else if (!Static162.aClass121_77.method3117()) {
				Static258.aString279 = Static86.aString103 + (Static162.aClass121_77.method3126() / 10 + 75) + "%";
				Static133.anInt2675 = 85;
			} else if (!Static103.aClass121_52.method3117()) {
				Static258.aString279 = Static86.aString103 + (Static103.aClass121_52.method3126() / 20 + 85) + "%";
				Static133.anInt2675 = 85;
			} else if (Static242.aClass121_104.method3114("details")) {
				Static109.method3590(Static242.aClass121_104);
				Static158.method2713(Static133.aClass121_65);
				Static216.method3387(Static3.aClass121_1);
				Static256.anInt4643 = 135;
				Static258.aString279 = Static240.aString249;
				Static133.anInt2675 = 95;
			} else {
				Static258.aString279 = Static86.aString103 + (Static242.aClass121_104.method3113("details") / 10 + 90) + "%";
				Static133.anInt2675 = 85;
			}
		} else if (Static256.anInt4643 == 135) {
			local93 = Static229.method3544();
			if (local93 == -1) {
				Static258.aString279 = Static175.aString197;
				Static133.anInt2675 = 95;
			} else if (local93 == 7 || local93 == 9) {
				this.method662("worldlistfull");
				Static65.method1215(1000);
			} else if (Static212.aBoolean26) {
				Static133.anInt2675 = 96;
				Static258.aString279 = Static307.aString332;
				Static256.anInt4643 = 140;
			} else {
				this.method662("worldlistio_" + local93);
				Static65.method1215(1000);
			}
		} else if (Static256.anInt4643 == 140) {
			Static69.anInt4978 = Static239.aClass121_103.method3108("loginscreen");
			Static313.aClass121_73.method3121(false);
			Static308.aClass121_135.method3121(true);
			Static258.aClass121_114.method3121(true);
			Static103.aClass121_52.method3121(true);
			Static208.aClass121_89.method3121(true);
			Static239.aClass121_103.method3121(true);
			Static133.anInt2675 = 97;
			Static148.aBoolean181 = true;
			Static258.aString279 = Static12.aString17;
			Static256.anInt4643 = 150;
		} else if (Static256.anInt4643 == 150) {
			Static9.method121();
			if (Static277.aBoolean341) {
				Static27.anInt478 = 0;
				Static37.anInt771 = 0;
				Static111.anInt2296 = 0;
				Static41.anInt852 = 0;
			}
			Static277.aBoolean341 = true;
			Static286.method4396(Static26.aClass154_1);
			Static259.method4091(false, Static41.anInt852, -1, -1);
			Static258.aString279 = Static218.aString71;
			Static256.anInt4643 = 160;
			Static133.anInt2675 = 100;
		} else if (Static256.anInt4643 == 160) {
			Static302.method4562(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	protected void method673() {
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BZ)V")
	private void method680(@OriginalArg(0) byte[] arg0) {
		@Pc(13) Class1_Sub14 local13 = new Class1_Sub14(arg0);
		while (true) {
			@Pc(17) int local17 = local13.method1378();
			if (local17 == 0) {
				return;
			}
			if (local17 == 1) {
				@Pc(30) int[] local30 = Static224.anIntArray349 = new int[6];
				local30[0] = local13.method1386();
				local30[1] = local13.method1386();
				local30[2] = local13.method1386();
				local30[3] = local13.method1386();
				local30[4] = local13.method1386();
				local30[5] = local13.method1386();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method660() {
		Static185.method3031();
		Static210.aClass31_3 = new Class31();
		Static66.aClass22_5 = new Class22();
		if (Static31.anInt552 != 0) {
			Static282.aByteArrayArray16 = new byte[50][];
		}
		Static189.method3086(Static26.aClass154_1);
		if (Static85.anInt1679 == 0) {
			Static47.aString51 = this.getCodeBase().getHost();
			Static115.anInt2426 = 443;
			Static160.anInt3164 = 43594;
		} else if (Static85.anInt1679 == 1) {
			Static47.aString51 = this.getCodeBase().getHost();
			Static160.anInt3164 = Static123.anInt2530 + 40000;
			Static115.anInt2426 = Static123.anInt2530 + 50000;
		} else if (Static85.anInt1679 == 2) {
			Static47.aString51 = "127.0.0.1";
			Static160.anInt3164 = Static123.anInt2530 + 40000;
			Static115.anInt2426 = Static123.anInt2530 + 50000;
		}
		if (Static246.anInt4462 == 3 && Static85.anInt1679 != 2) {
			Static312.anInt5731 = Static123.anInt2530;
		}
		Static141.anInt2839 = Static160.anInt3164;
		Static270.anInt4895 = Static115.anInt2426;
		Static224.anInt4119 = Static160.anInt3164;
		Static252.aShortArray89 = Static4.aShortArray1 = Static249.aShortArray88 = Static76.aShortArray29 = new short[256];
		if (Static118.anInt2486 == 1) {
			Static82.aShortArray30 = Static203.aShortArray76;
			Static263.aShortArrayArray8 = Static222.aShortArrayArray6;
			Static309.aBoolean379 = true;
			Static210.aShortArray77 = Static295.aShortArray90;
			Static283.anInt5100 = 0;
			Static283.anInt5101 = 16777215;
			Static143.aShortArrayArray1 = Static193.aShortArrayArray5;
		} else {
			Static210.aShortArray77 = Static43.aShortArray5;
			Static82.aShortArray30 = Static106.aShortArray37;
			Static263.aShortArrayArray8 = Static255.aShortArrayArray7;
			Static143.aShortArrayArray1 = Static153.aShortArrayArray2;
		}
		Static94.anInt3445 = Static224.anInt4119;
		Static77.aString93 = Static47.aString51;
		Static191.method3105();
		Static287.method4401(Static127.aCanvas1);
		Static243.method4752(Static127.aCanvas1);
		Static123.aClass56_1 = Static183.method2999();
		if (Static123.aClass56_1 != null) {
			Static123.aClass56_1.method1642(Static127.aCanvas1);
		}
		Static15.anInt235 = Static246.anInt4462;
		try {
			if (Static26.aClass154_1.aClass132_4 != null) {
				Static72.aClass68_8 = new Class68(Static26.aClass154_1.aClass132_4, 5200, 0);
				for (@Pc(174) int local174 = 0; local174 < 29; local174++) {
					Static87.aClass68Array1[local174] = new Class68(Static26.aClass154_1.aClass132Array1[local174], 6000, 0);
				}
				Static275.aClass68_7 = new Class68(Static26.aClass154_1.aClass132_2, 6000, 0);
				Static135.aClass138_2 = new Class138(255, Static72.aClass68_8, Static275.aClass68_7, 500000);
				Static70.aClass68_1 = new Class68(Static26.aClass154_1.aClass132_3, 24, 0);
				Static26.aClass154_1.aClass132Array1 = null;
				Static26.aClass154_1.aClass132_3 = null;
				Static26.aClass154_1.aClass132_2 = null;
				Static26.aClass154_1.aClass132_4 = null;
			}
		} catch (@Pc(232) IOException local232) {
			Static70.aClass68_1 = null;
			Static275.aClass68_7 = null;
			Static72.aClass68_8 = null;
			Static135.aClass138_2 = null;
		}
		if (Static118.anInt2486 == 0) {
			Static129.aString149 = Static234.aString240;
		} else if (Static118.anInt2486 == 1) {
			Static129.aString149 = Static135.aString155;
		}
		if (Static85.anInt1679 != 0) {
			Static218.aBoolean73 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method683() {
		for (Static112.anInt2331 = 0; Static123.method2169() && Static112.anInt2331 < 128; Static112.anInt2331++) {
			Static162.anIntArray274[Static112.anInt2331] = Static142.anInt2853;
			Static152.anIntArray43[Static112.anInt2331] = Static117.aChar3;
		}
		Static81.anInt1635++;
		if (Static270.anInt4897 != -1) {
			Static162.method2785(Static270.anInt4897, 0, Static292.anInt5236, 0, Static120.anInt2505, 0, 0);
		}
		Static86.anInt1698++;
		if (Static156.aBoolean211) {
			label194: for (@Pc(57) int local57 = 0; local57 < 32768; local57++) {
				@Pc(64) Class15_Sub5_Sub1 local64 = Static83.aClass15_Sub5_Sub1Array1[local57];
				if (local64 != null) {
					@Pc(70) byte local70 = local64.aClass99_1.aByte16;
					if ((local70 & 0x2) > 0 && local64.anInt5578 == 0 && Math.random() * 1000.0D < 10.0D) {
						@Pc(97) int local97 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						@Pc(105) int local105 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						if (local97 != 0 || local105 != 0) {
							local64.anIntArray501[0] = (local64.anInt5559 >> 7) + local97;
							local64.aByteArray73[0] = 1;
							local64.anIntArray504[0] = (local64.anInt5557 >> 7) + local105;
							Static240.aClass118Array1[Static65.anInt1300].method3037(local64.anInt5559 >> 7, false, 0, local64.method4702(), local64.anInt5557 >> 7, false, local64.method4702());
							if (local64.anIntArray501[0] >= 0 && local64.anIntArray501[0] <= 104 - local64.method4702() && local64.anIntArray504[0] >= 0 && local64.anIntArray504[0] <= 104 - local64.method4702() && Static240.aClass118Array1[Static65.anInt1300].method3036(local64.anInt5557 >> 7, local64.anIntArray501[0], local64.anIntArray504[0], local64.anInt5559 >> 7)) {
								if (local64.method4702() > 1) {
									for (@Pc(232) int local232 = local64.anIntArray501[0]; local232 < local64.anIntArray501[0] + local64.method4702(); local232++) {
										for (@Pc(248) int local248 = local64.anIntArray504[0]; local64.anIntArray504[0] + local64.method4702() > local248; local248++) {
											if ((Static240.aClass118Array1[Static65.anInt1300].anIntArrayArray28[local232][local248] & 0x2401FF) != 0) {
												continue label194;
											}
										}
									}
								}
								local64.anInt5578 = 1;
							}
						}
					}
					Static293.method4478(local64);
					Static263.method4151(local64);
					Static22.method367(local64);
					Static240.aClass118Array1[Static65.anInt1300].method3041(false, false, local64.method4702(), local64.method4702(), local64.anInt5557 >> 7, local64.anInt5559 >> 7);
				}
			}
		}
		if (!Static156.aBoolean211 && Static118.anInt2486 == 0) {
			Static75.method1472();
		} else if (Static197.anInt3809 == 0 && Static227.anInt4177 == 0) {
			if (Static167.anInt3292 == 2) {
				Static145.method2483();
			} else {
				Static157.method1369();
			}
			if (Static94.anInt3434 >> 7 < 14 || Static94.anInt3434 >> 7 >= 90 || Static233.anInt4252 >> 7 < 14 || Static233.anInt4252 >> 7 >= 90) {
				Static116.method2100();
			}
		}
		while (true) {
			@Pc(380) Class1_Sub10 local380;
			@Pc(385) Class66 local385;
			@Pc(396) Class66 local396;
			do {
				local380 = (Class1_Sub10) Static257.aClass59_35.method1700();
				if (local380 == null) {
					while (true) {
						do {
							local380 = (Class1_Sub10) Static173.aClass59_27.method1700();
							if (local380 == null) {
								while (true) {
									do {
										local380 = (Class1_Sub10) Static13.aClass59_8.method1700();
										if (local380 == null) {
											if (Static5.aClass66_1 != null) {
												Static235.method4488();
											}
											if (Static107.aClass185_2 != null && Static107.aClass185_2.anInt5276 == 1) {
												if (Static107.aClass185_2.anObject6 != null) {
													Static56.method983(Static88.aString107, Static200.aBoolean260);
												}
												Static88.aString107 = null;
												Static200.aBoolean260 = false;
												Static107.aClass185_2 = null;
											}
											if (Static313.anInt2966 % 1500 == 0) {
												Static250.method3945();
											}
											return;
										}
										local385 = local380.aClass66_10;
										if (local385.anInt2178 < 0) {
											break;
										}
										local396 = Static53.method968(local385.anInt2221);
									} while (local396 == null || local396.aClass66Array3 == null || local396.aClass66Array3.length <= local385.anInt2178 || local385 != local396.aClass66Array3[local385.anInt2178]);
									Static194.method3152(local380);
								}
							}
							local385 = local380.aClass66_10;
							if (local385.anInt2178 < 0) {
								break;
							}
							local396 = Static53.method968(local385.anInt2221);
						} while (local396 == null || local396.aClass66Array3 == null || local396.aClass66Array3.length <= local385.anInt2178 || local385 != local396.aClass66Array3[local385.anInt2178]);
						Static194.method3152(local380);
					}
				}
				local385 = local380.aClass66_10;
				if (local385.anInt2178 < 0) {
					break;
				}
				local396 = Static53.method968(local385.anInt2221);
			} while (local396 == null || local396.aClass66Array3 == null || local385.anInt2178 >= local396.aClass66Array3.length || local396.aClass66Array3[local385.anInt2178] != local385);
			Static194.method3152(local380);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method665()) {
			return;
		}
		Static123.anInt2530 = Integer.parseInt(this.getParameter("worldid"));
		Static85.anInt1679 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static85.anInt1679 < 0 || Static85.anInt1679 > 1) {
			Static85.anInt1679 = 0;
		}
		Static31.anInt552 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static31.anInt552 < 0 || Static31.anInt552 > 2) {
			Static31.anInt552 = 0;
		}
		@Pc(49) String local49 = this.getParameter("advertsuppressed");
		if (local49 != null && local49.equals("1")) {
			Static113.aBoolean138 = true;
		} else {
			Static113.aBoolean138 = false;
		}
		try {
			Static114.anInt2371 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(68) Exception local68) {
			Static114.anInt2371 = 0;
		}
		Static64.method1152(Static114.anInt2371);
		@Pc(77) String local77 = this.getParameter("objecttag");
		if (local77 != null && local77.equals("1")) {
			Static155.aBoolean191 = true;
		} else {
			Static155.aBoolean191 = false;
		}
		@Pc(93) String local93 = this.getParameter("js");
		if (local93 != null && local93.equals("1")) {
			Static96.aBoolean106 = true;
		} else {
			Static96.aBoolean106 = false;
		}
		@Pc(109) String local109 = this.getParameter("game");
		if (local109 != null && local109.equals("1")) {
			Static118.anInt2486 = 1;
		} else {
			Static118.anInt2486 = 0;
		}
		try {
			Static71.anInt1519 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(129) Exception local129) {
			Static71.anInt1519 = 0;
		}
		Static37.aString43 = this.getParameter("settings");
		if (Static37.aString43 == null) {
			Static37.aString43 = "";
		}
		@Pc(144) String local144 = this.getParameter("country");
		if (local144 != null) {
			try {
				Static212.anInt650 = Integer.parseInt(local144);
			} catch (@Pc(151) Exception local151) {
				Static212.anInt650 = 0;
			}
		}
		@Pc(157) String local157 = this.getParameter("haveie6");
		if (local157 != null && local157.equals("1")) {
			Static154.aBoolean186 = true;
		} else {
			Static154.aBoolean186 = false;
		}
		Static196.aClient1 = this;
		this.method666(Static31.anInt552 + 32);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V")
	private void method686(@OriginalArg(1) int arg0) {
		Static66.aClass22_5.anInt584 = arg0;
		Static210.aClass185_5 = null;
		Static293.aClass97_4 = null;
		Static66.aClass22_5.anInt585++;
		Static28.anInt502 = 0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method674() {
		if (Static37.anInt773 == 1000) {
			return;
		}
		Static313.anInt2966++;
		if (Static313.anInt2966 % 1000 == 1) {
			@Pc(23) GregorianCalendar local23 = new GregorianCalendar();
			Static107.anInt2180 = local23.get(11) * 600 + local23.get(12) * 10 + local23.get(13) / 6;
			Static234.aRandom1.setSeed((long) Static107.anInt2180);
		}
		this.method687();
		if (Static66.aClass109_3 != null) {
			Static66.aClass109_3.method2911();
		}
		Static277.method4285();
		Static115.method2067();
		Static94.method2975();
		Static28.method464();
		if (Static156.aBoolean211) {
			Static10.method134();
		}
		if (Static123.aClass56_1 != null) {
			@Pc(75) int local75 = Static123.aClass56_1.method1640();
			Static20.anInt382 = local75;
		}
		if (Static37.anInt773 == 0) {
			this.method678();
			Static57.method1003();
		} else if (Static37.anInt773 == 5) {
			this.method678();
			Static57.method1003();
		} else if (Static37.anInt773 == 25 || Static37.anInt773 == 28) {
			Static299.method4545();
		}
		if (Static37.anInt773 == 10) {
			this.method683();
			Static304.method4586();
			Static108.method1952();
			Static15.method195();
		} else if (Static37.anInt773 == 30) {
			Static188.method3080();
		} else if (Static37.anInt773 == 40) {
			Static15.method195();
			if (Static201.anInt3864 != -3) {
				if (Static201.anInt3864 == 15) {
					Static304.method4588();
				} else if (Static201.anInt3864 != 2) {
					Static74.method1467();
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method676() {
		if (Static156.aBoolean211) {
			Static156.method2697();
		}
		if (Static275.aFrame2 != null) {
			Static75.method1470(Static26.aClass154_1, Static275.aFrame2);
			Static275.aFrame2 = null;
		}
		if (Static136.aClass88_1 != null) {
			Static136.aClass88_1.aBoolean178 = false;
		}
		Static136.aClass88_1 = null;
		if (Static5.aClass97_1 != null) {
			Static5.aClass97_1.method2547();
			Static5.aClass97_1 = null;
		}
		Static56.method987(Static127.aCanvas1);
		Static49.method907(Static127.aCanvas1);
		if (Static123.aClass56_1 != null) {
			Static123.aClass56_1.method1644(Static127.aCanvas1);
		}
		Static249.method3935();
		Static21.method360();
		Static123.aClass56_1 = null;
		if (Static300.aClass28_2 != null) {
			Static300.aClass28_2.method4774();
		}
		if (Static248.aClass28_1 != null) {
			Static248.aClass28_1.method4774();
		}
		Static66.aClass22_5.method525();
		Static210.aClass31_3.method810();
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method687() {
		@Pc(12) boolean local12 = Static66.aClass22_5.method519();
		if (!local12) {
			this.method688();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method688() {
		if (Static66.aClass22_5.anInt585 > Static167.anInt3291) {
			Static218.anInt1145 = (Static66.aClass22_5.anInt585 - 1) * 50 * 5;
			if (Static141.anInt2839 == Static94.anInt3445) {
				Static94.anInt3445 = Static270.anInt4895;
			} else {
				Static94.anInt3445 = Static141.anInt2839;
			}
			if (Static218.anInt1145 > 3000) {
				Static218.anInt1145 = 3000;
			}
			if (Static66.aClass22_5.anInt585 >= 2 && Static66.aClass22_5.anInt584 == 6) {
				this.method662("js5connect_outofdate");
				Static37.anInt773 = 1000;
				return;
			}
			if (Static66.aClass22_5.anInt585 >= 4 && Static66.aClass22_5.anInt584 == -1) {
				this.method662("js5crc");
				Static37.anInt773 = 1000;
				return;
			}
			if (Static66.aClass22_5.anInt585 >= 4 && (Static37.anInt773 == 0 || Static37.anInt773 == 5)) {
				if (Static66.aClass22_5.anInt584 == 7 || Static66.aClass22_5.anInt584 == 9) {
					this.method662("js5connect_full");
				} else if (Static66.aClass22_5.anInt584 > 0) {
					this.method662("js5connect");
				} else {
					this.method662("js5io");
				}
				Static37.anInt773 = 1000;
				return;
			}
		}
		Static167.anInt3291 = Static66.aClass22_5.anInt585;
		if (Static218.anInt1145 > 0) {
			Static218.anInt1145--;
			return;
		}
		try {
			if (Static28.anInt502 == 0) {
				Static210.aClass185_5 = Static26.aClass154_1.method3892(Static77.aString93, Static94.anInt3445);
				Static28.anInt502++;
			}
			if (Static28.anInt502 == 1) {
				if (Static210.aClass185_5.anInt5276 == 2) {
					this.method686(1000);
					return;
				}
				if (Static210.aClass185_5.anInt5276 == 1) {
					Static28.anInt502++;
				}
			}
			if (Static28.anInt502 == 2) {
				Static293.aClass97_4 = new Class97((Socket) Static210.aClass185_5.anObject6, Static26.aClass154_1);
				@Pc(194) Class1_Sub14 local194 = new Class1_Sub14(5);
				local194.method1390(15);
				local194.method1387(549);
				Static293.aClass97_4.method2552(5, local194.aByteArray17);
				Static28.anInt502++;
				Static281.aLong187 = Static298.method4535();
			}
			if (Static28.anInt502 == 3) {
				if (Static37.anInt773 == 0 || Static37.anInt773 == 5 || Static293.aClass97_4.method2551() > 0) {
					@Pc(236) int local236 = Static293.aClass97_4.method2548();
					if (local236 != 0) {
						this.method686(local236);
						return;
					}
					Static28.anInt502++;
				} else if (Static298.method4535() - Static281.aLong187 > 30000L) {
					this.method686(1001);
					return;
				}
			}
			if (Static28.anInt502 == 4) {
				@Pc(292) boolean local292 = Static37.anInt773 == 5 || Static37.anInt773 == 10 || Static37.anInt773 == 28;
				Static66.aClass22_5.method521(!local292, Static293.aClass97_4);
				Static210.aClass185_5 = null;
				Static28.anInt502 = 0;
				Static293.aClass97_4 = null;
			}
		} catch (@Pc(309) IOException local309) {
			this.method686(1002);
		}
	}
}
