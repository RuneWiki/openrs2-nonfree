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
				Static144.method2612("argument count");
			}
			Static153.anInt3686 = Integer.parseInt(arg0[0]);
			Static25.anInt848 = 2;
			if (arg0[1].equals("live")) {
				Static157.anInt3784 = 0;
			} else if (arg0[1].equals("rc")) {
				Static157.anInt3784 = 1;
			} else if (arg0[1].equals("wip")) {
				Static157.anInt3784 = 2;
			} else {
				Static144.method2612("modewhat");
			}
			Static121.aBoolean169 = false;
			Static135.anInt3311 = Static204.method3422(arg0[2]);
			if (Static135.anInt3311 == -1) {
				if (arg0[2].equals("english")) {
					Static135.anInt3311 = 0;
				} else if (arg0[2].equals("german")) {
					Static135.anInt3311 = 1;
				} else {
					Static144.method2612("language");
				}
			}
			Static259.method4153(Static135.anInt3311);
			Static28.aBoolean47 = false;
			Static250.aBoolean272 = false;
			if (arg0[3].equals("game0")) {
				Static68.anInt1404 = 0;
			} else if (arg0[3].equals("game1")) {
				Static68.anInt1404 = 1;
			} else {
				Static144.method2612("game");
			}
			Static151.aBoolean187 = false;
			Static154.anInt4037 = 0;
			Static135.aString214 = "";
			Static145.anInt3517 = 0;
			@Pc(127) client local127 = new client();
			Static35.aClient1 = local127;
			local127.method694("runescape", Static157.anInt3784 + 32);
			Static42.aFrame1.setLocation(40, 40);
		} catch (@Pc(147) Exception local147) {
			Static57.method1101(null, local147);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method701(@OriginalArg(1) int arg0) {
		Static228.aClass109_3 = null;
		Static196.aClass18_2.anInt769 = arg0;
		Static82.aClass145_4 = null;
		Static1.anInt25 = 0;
		Static196.aClass18_2.anInt768++;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method703() {
		@Pc(3) boolean local3 = Static196.aClass18_2.method435();
		if (!local3) {
			this.method708();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method704() {
		if (!Static87.aBoolean135) {
			label236: while (true) {
				do {
					if (!Static136.method2539()) {
						break label236;
					}
				} while (Static261.aChar4 != 's' && Static261.aChar4 != 'S');
				Static87.aBoolean135 = true;
			}
		}
		@Pc(40) int local40;
		if (Static69.anInt1876 == 0) {
			@Pc(30) Runtime local30 = Runtime.getRuntime();
			local40 = (int) ((local30.totalMemory() - local30.freeMemory()) / 1024L);
			@Pc(43) long local43 = Static31.method591();
			if (Static44.aLong40 == 0L) {
				Static44.aLong40 = local43;
			}
			if (local40 > 16384 && local43 - Static44.aLong40 < 5000L) {
				if (local43 - Static65.aLong58 > 1000L) {
					System.gc();
					Static65.aLong58 = local43;
				}
				Static16.anInt4949 = 5;
				Static175.aString270 = Static127.aString204;
			} else {
				Static16.anInt4949 = 5;
				Static69.anInt1876 = 10;
				Static175.aString270 = Static150.aString252;
			}
			return;
		}
		@Pc(91) int local91;
		if (Static69.anInt1876 == 10) {
			for (local91 = 0; local91 < 4; local91++) {
				Static47.aClass65Array1[local91] = new Class65(104, 104);
			}
			Static175.aString270 = Static209.aString321;
			Static16.anInt4949 = 10;
			Static69.anInt1876 = 30;
		} else if (Static69.anInt1876 == 30) {
			if (Static202.aClass130_1 == null) {
				Static202.aClass130_1 = new Class130(Static196.aClass18_2, Static57.aClass60_1);
			}
			if (Static202.aClass130_1.method3879()) {
				Static252.aClass51_81 = Static169.method2946(0, true, true, false);
				Static37.aClass51_13 = Static169.method2946(1, true, true, false);
				Static198.aClass51_67 = Static169.method2946(2, false, true, true);
				Static215.aClass51_69 = Static169.method2946(3, true, true, false);
				Static146.aClass51_48 = Static169.method2946(4, true, true, false);
				Static251.aClass51_80 = Static169.method2946(5, true, true, true);
				Static258.aClass51_83 = Static169.method2946(6, true, false, true);
				Static197.aClass51_28 = Static169.method2946(7, true, true, false);
				Static24.aClass51_10 = Static169.method2946(8, true, true, false);
				Static12.aClass51_2 = Static169.method2946(9, true, true, false);
				Static97.aClass51_49 = Static169.method2946(10, true, true, false);
				Static218.aClass51_71 = Static169.method2946(11, true, true, false);
				Static118.aClass51_39 = Static169.method2946(12, true, true, false);
				Static218.aClass51_70 = Static169.method2946(13, true, true, false);
				Static21.aClass51_9 = Static169.method2946(14, true, false, false);
				Static262.aClass51_87 = Static169.method2946(15, true, true, false);
				Static174.aClass51_58 = Static169.method2946(16, true, true, false);
				Static109.aClass51_35 = Static169.method2946(17, true, true, false);
				Static48.aClass51_19 = Static169.method2946(18, true, true, false);
				Static35.aClass51_12 = Static169.method2946(19, true, true, false);
				Static124.aClass51_44 = Static169.method2946(20, true, true, false);
				Static226.aClass51_73 = Static169.method2946(21, true, true, false);
				Static109.aClass51_36 = Static169.method2946(22, true, true, false);
				Static5.aClass51_1 = Static169.method2946(23, true, true, true);
				Static137.aClass51_45 = Static169.method2946(24, true, true, false);
				Static232.aClass51_77 = Static169.method2946(25, true, true, false);
				Static153.aClass51_51 = Static169.method2946(26, true, true, true);
				Static247.aClass51_79 = Static169.method2946(27, true, true, false);
				Static198.aClass51_66 = Static169.method2946(28, true, true, true);
				Static16.anInt4949 = 15;
				Static175.aString270 = Static209.aString322;
				Static69.anInt1876 = 40;
			} else {
				Static175.aString270 = Static213.aString328;
				Static16.anInt4949 = 12;
			}
		} else if (Static69.anInt1876 == 40) {
			local91 = 0;
			for (local40 = 0; local40 < 29; local40++) {
				local91 += Static157.aClass17_Sub1Array1[local40].method2196() * Static260.anIntArray205[local40] / 100;
			}
			if (local91 == 100) {
				Static175.aString270 = Static238.aString368;
				Static16.anInt4949 = 20;
				Static50.method1015(Static24.aClass51_10);
				Static117.method2316(Static24.aClass51_10);
				Static19.method360(Static24.aClass51_10);
				Static69.anInt1876 = 41;
			} else {
				Static16.anInt4949 = 20;
				if (local91 != 0) {
					Static175.aString270 = Static113.aString390 + local91 + "%";
				}
			}
		} else if (Static69.anInt1876 == 41) {
			if (Static198.aClass51_66.method1860()) {
				this.method709(Static198.aClass51_66.method1863(1));
				Static175.aString270 = Static133.aString213;
				Static16.anInt4949 = 25;
				Static69.anInt1876 = 45;
			} else {
				Static175.aString270 = Static197.aString145 + Static198.aClass51_66.method1848() + "%";
				Static16.anInt4949 = 25;
			}
		} else if (Static69.anInt1876 == 45) {
			Static203.method3395(Static69.aBoolean106);
			Static13.aClass1_Sub4_Sub2_2 = new Class1_Sub4_Sub2();
			Static13.aClass1_Sub4_Sub2_2.method1228();
			Static90.aClass55_1 = Static136.method2544(Static98.aCanvas1, Static38.aClass28_1, 22050, 0);
			Static90.aClass55_1.method3216(Static13.aClass1_Sub4_Sub2_2);
			Static186.method3144(Static146.aClass51_48, Static21.aClass51_9, Static13.aClass1_Sub4_Sub2_2, Static262.aClass51_87);
			Static239.aClass55_2 = Static136.method2544(Static98.aCanvas1, Static38.aClass28_1, 2048, 1);
			Static24.aClass1_Sub4_Sub4_1 = new Class1_Sub4_Sub4();
			Static239.aClass55_2.method3216(Static24.aClass1_Sub4_Sub4_1);
			Static13.aClass46_1 = new Class46(22050, Static107.anInt2862);
			Static149.anInt3580 = Static258.aClass51_83.method1866("scape main");
			Static16.anInt4949 = 30;
			Static69.anInt1876 = 50;
			Static175.aString270 = Static209.aString320;
		} else if (Static69.anInt1876 == 50) {
			local91 = Static77.method1517(Static218.aClass51_70, Static24.aClass51_10);
			local40 = Static67.method1315();
			if (local91 < local40) {
				Static16.anInt4949 = 35;
				Static175.aString270 = Static264.aString391 + local91 * 100 / local40 + "%";
			} else {
				Static69.anInt1876 = 60;
				Static175.aString270 = Static81.aString133;
				Static16.anInt4949 = 35;
			}
		} else if (Static69.anInt1876 == 60) {
			local91 = Static248.method4047(Static24.aClass51_10);
			local40 = Static256.method4144();
			if (local40 > local91) {
				Static16.anInt4949 = 40;
				Static175.aString270 = Static200.aString297 + local91 * 100 / local40 + "%";
			} else {
				Static16.anInt4949 = 40;
				Static69.anInt1876 = 65;
				Static175.aString270 = Static98.aString173;
			}
		} else if (Static69.anInt1876 == 65) {
			Static213.method3508(Static24.aClass51_10, Static218.aClass51_70);
			Static16.anInt4949 = 45;
			Static175.aString270 = Static34.aString44;
			Static168.method2918(5);
			Static69.anInt1876 = 70;
		} else if (Static69.anInt1876 == 70) {
			Static198.aClass51_67.method1860();
			local91 = Static198.aClass51_67.method1848();
			Static174.aClass51_58.method1860();
			local91 += Static174.aClass51_58.method1848();
			Static109.aClass51_35.method1860();
			local91 += Static109.aClass51_35.method1848();
			Static48.aClass51_19.method1860();
			local91 += Static48.aClass51_19.method1848();
			Static35.aClass51_12.method1860();
			local91 += Static35.aClass51_12.method1848();
			Static124.aClass51_44.method1860();
			local91 += Static124.aClass51_44.method1848();
			Static226.aClass51_73.method1860();
			local91 += Static226.aClass51_73.method1848();
			Static109.aClass51_36.method1860();
			local91 += Static109.aClass51_36.method1848();
			Static137.aClass51_45.method1860();
			local91 += Static137.aClass51_45.method1848();
			Static232.aClass51_77.method1860();
			local91 += Static232.aClass51_77.method1848();
			Static247.aClass51_79.method1860();
			local91 += Static247.aClass51_79.method1848();
			if (local91 < 1100) {
				Static16.anInt4949 = 50;
				Static175.aString270 = Static183.aString370 + local91 / 11 + "%";
			} else {
				Static24.method477(Static198.aClass51_67);
				Static251.method4065(Static198.aClass51_67);
				Static252.method4077(Static198.aClass51_67);
				Static213.method3509(Static197.aClass51_28, Static198.aClass51_67);
				Static254.method4103(Static174.aClass51_58, Static197.aClass51_28);
				Static224.method3731(Static197.aClass51_28, Static48.aClass51_19);
				Static33.method3952(Static197.aClass51_28, Static22.aClass1_Sub2_Sub7_Sub1_3, Static35.aClass51_12);
				Static64.method1256(Static198.aClass51_67);
				Static15.method252(Static252.aClass51_81, Static124.aClass51_44, Static37.aClass51_13);
				Static165.method2872(Static198.aClass51_67);
				Static132.method2488(Static197.aClass51_28, Static226.aClass51_73);
				Static7.method1524(Static109.aClass51_36);
				Static204.method3421(Static198.aClass51_67);
				Static2.method26(Static215.aClass51_69, Static218.aClass51_70, Static197.aClass51_28, Static24.aClass51_10);
				Static46.method960(Static198.aClass51_67);
				Static32.method592(Static109.aClass51_35);
				Static226.method3735(Static137.aClass51_45, new Class41(), Static232.aClass51_77);
				Static256.method4143(Static232.aClass51_77, Static137.aClass51_45);
				Static212.method3501(Static198.aClass51_67);
				Static119.method2349(Static198.aClass51_67);
				Static198.method3468(Static198.aClass51_67);
				Static200.method3325(Static24.aClass51_10, Static198.aClass51_67);
				Static55.method1069(Static198.aClass51_67, Static24.aClass51_10);
				Static16.anInt4949 = 50;
				Static175.aString270 = Static128.aString205;
				Static166.method2882();
				Static69.anInt1876 = 80;
			}
		} else if (Static69.anInt1876 == 80) {
			local91 = Static24.method478(Static24.aClass51_10);
			local40 = Static60.method1147();
			if (local40 > local91) {
				Static175.aString270 = Static86.aString152 + local91 * 100 / local40 + "%";
				Static16.anInt4949 = 60;
			} else {
				Static4.method77(Static24.aClass51_10);
				Static69.anInt1876 = 90;
				Static175.aString270 = Static61.aString99;
				Static16.anInt4949 = 60;
			}
		} else if (Static69.anInt1876 == 90) {
			if (Static153.aClass51_51.method1860()) {
				@Pc(960) Class15_Sub1 local960 = new Class15_Sub1(Static12.aClass51_2, Static153.aClass51_51, Static24.aClass51_10, 20, !Static132.aBoolean175);
				Static235.method3904(local960);
				if (Static148.anInt398 == 1) {
					Static235.method3894(0.9F);
				}
				if (Static148.anInt398 == 2) {
					Static235.method3894(0.8F);
				}
				if (Static148.anInt398 == 3) {
					Static235.method3894(0.7F);
				}
				if (Static148.anInt398 == 4) {
					Static235.method3894(0.6F);
				}
				Static175.aString270 = Static80.aString132;
				Static16.anInt4949 = 70;
				Static69.anInt1876 = 100;
			} else {
				Static175.aString270 = Static8.aString9 + Static153.aClass51_51.method1848() + "%";
				Static16.anInt4949 = 70;
			}
		} else if (Static69.anInt1876 == 100) {
			if (Static140.method2548(Static24.aClass51_10)) {
				Static69.anInt1876 = 110;
			}
		} else if (Static69.anInt1876 == 110) {
			Static120.aClass27_1 = new Class27();
			Static38.aClass28_1.method719(Static120.aClass27_1, 10);
			Static69.anInt1876 = 120;
			Static16.anInt4949 = 75;
			Static175.aString270 = Static172.aString266;
		} else if (Static69.anInt1876 == 120) {
			if (Static97.aClass51_49.method1845("", "huffman")) {
				@Pc(1058) Class118 local1058 = new Class118(Static97.aClass51_49.method1850("", "huffman"));
				Static146.method2666(local1058);
				Static69.anInt1876 = 130;
				Static16.anInt4949 = 80;
				Static175.aString270 = Static205.aString310;
			} else {
				Static16.anInt4949 = 80;
				Static175.aString270 = Static88.aString155 + "0%";
			}
		} else if (Static69.anInt1876 == 130) {
			if (!Static215.aClass51_69.method1860()) {
				Static175.aString270 = Static143.aString224 + Static215.aClass51_69.method1848() * 3 / 4 + "%";
				Static16.anInt4949 = 85;
			} else if (!Static118.aClass51_39.method1860()) {
				Static175.aString270 = Static143.aString224 + (Static118.aClass51_39.method1848() / 10 + 75) + "%";
				Static16.anInt4949 = 85;
			} else if (!Static218.aClass51_70.method1860()) {
				Static175.aString270 = Static143.aString224 + (Static218.aClass51_70.method1848() / 20 + 85) + "%";
				Static16.anInt4949 = 85;
			} else if (Static5.aClass51_1.method1851("details")) {
				Static18.method334(Static5.aClass51_1, Static247.aClass1_Sub2_Sub4_Sub1Array2);
				Static162.method2828(Static197.aClass51_28);
				Static175.aString270 = Static20.aString29;
				Static16.anInt4949 = 95;
				Static69.anInt1876 = 135;
			} else {
				Static175.aString270 = Static143.aString224 + (Static5.aClass51_1.method1857("details") / 10 + 90) + "%";
				Static16.anInt4949 = 85;
			}
		} else if (Static69.anInt1876 == 135) {
			local91 = Static34.method619();
			if (local91 == -1) {
				Static16.anInt4949 = 95;
				Static175.aString270 = Static205.aString311;
			} else if (local91 == 7 || local91 == 9) {
				this.method686("worldlistfull");
				Static168.method2918(1000);
			} else if (Static65.aBoolean101) {
				Static69.anInt1876 = 140;
				Static175.aString270 = Static137.aString215;
				Static16.anInt4949 = 96;
			} else {
				this.method686("worldlistio_" + local91);
				Static168.method2918(1000);
			}
		} else if (Static69.anInt1876 == 140) {
			Static228.anInt5019 = Static215.aClass51_69.method1866("loginscreen");
			Static251.aClass51_80.method1855(false);
			Static258.aClass51_83.method1855(true);
			Static24.aClass51_10.method1855(true);
			Static218.aClass51_70.method1855(true);
			Static97.aClass51_49.method1855(true);
			Static215.aClass51_69.method1855(true);
			Static175.aString270 = Static107.aString184;
			Static69.anInt1876 = 150;
			Static81.aBoolean129 = true;
			Static16.anInt4949 = 97;
		} else if (Static69.anInt1876 == 150) {
			if (Static87.aBoolean135) {
				Static44.anInt1342 = 0;
				Static57.anInt1587 = 0;
				Static216.anInt4750 = 0;
				Static182.anInt4168 = 0;
			}
			Static87.aBoolean135 = true;
			Static22.method2185(Static38.aClass28_1);
			Static48.method981(false, -1, -1, Static57.anInt1587);
			Static69.anInt1876 = 160;
			Static16.anInt4949 = 100;
			Static175.aString270 = Static170.aString262;
		} else if (Static69.anInt1876 == 160) {
			Static62.method1196();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method699()) {
			return;
		}
		Static153.anInt3686 = Integer.parseInt(this.getParameter("worldid"));
		Static25.anInt848 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static25.anInt848 < 0 || Static25.anInt848 > 1) {
			Static25.anInt848 = 0;
		}
		Static157.anInt3784 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static157.anInt3784 < 0 || Static157.anInt3784 > 2) {
			Static157.anInt3784 = 0;
		}
		@Pc(48) String local48 = this.getParameter("advertsuppressed");
		if (local48 != null && local48.equals("1")) {
			Static121.aBoolean169 = true;
		} else {
			Static121.aBoolean169 = false;
		}
		try {
			Static135.anInt3311 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(67) Exception local67) {
			Static135.anInt3311 = 0;
		}
		Static259.method4153(Static135.anInt3311);
		@Pc(76) String local76 = this.getParameter("objecttag");
		if (local76 != null && local76.equals("1")) {
			Static28.aBoolean47 = true;
		} else {
			Static28.aBoolean47 = false;
		}
		@Pc(92) String local92 = this.getParameter("js");
		if (local92 != null && local92.equals("1")) {
			Static250.aBoolean272 = true;
		} else {
			Static250.aBoolean272 = false;
		}
		@Pc(108) String local108 = this.getParameter("game");
		if (local108 != null && local108.equals("1")) {
			Static68.anInt1404 = 1;
		} else {
			Static68.anInt1404 = 0;
		}
		try {
			Static145.anInt3517 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(127) Exception local127) {
			Static145.anInt3517 = 0;
		}
		Static135.aString214 = this.getParameter("settings");
		if (Static135.aString214 == null) {
			Static135.aString214 = "";
		}
		@Pc(141) String local141 = this.getParameter("country");
		if (local141 != null) {
			try {
				Static154.anInt4037 = Integer.parseInt(local141);
			} catch (@Pc(148) Exception local148) {
				Static154.anInt4037 = 0;
			}
		}
		@Pc(155) String local155 = this.getParameter("haveie6");
		if (local155 != null && local155.equals("1")) {
			Static151.aBoolean187 = true;
		} else {
			Static151.aBoolean187 = false;
		}
		Static35.aClient1 = this;
		this.method687(Static157.anInt3784 + 32);
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method705() {
		for (Static128.anInt3218 = 0; Static136.method2539() && Static128.anInt3218 < 128; Static128.anInt3218++) {
			Static107.anIntArray211[Static128.anInt3218] = Static128.anInt3220;
			Static90.anIntArray182[Static128.anInt3218] = Static261.aChar4;
		}
		Static37.anInt999++;
		if (Static140.anInt3388 != -1) {
			Static79.method1582(0, 0, Static200.anInt4411, 0, Static251.anInt5352, 0, Static140.anInt3388);
		}
		Static243.anInt5249++;
		Static119.method2347();
		while (true) {
			@Pc(56) Class1_Sub30 local56;
			@Pc(61) Class122 local61;
			@Pc(74) Class122 local74;
			do {
				local56 = (Class1_Sub30) Static168.aClass3_16.method37();
				if (local56 == null) {
					while (true) {
						do {
							local56 = (Class1_Sub30) Static251.aClass3_24.method37();
							if (local56 == null) {
								while (true) {
									do {
										local56 = (Class1_Sub30) Static29.aClass3_4.method37();
										if (local56 == null) {
											if (Static63.aClass122_7 != null) {
												Static45.method950();
											}
											if (Static99.aClass145_5 != null && Static99.aClass145_5.anInt5354 == 1) {
												if (Static99.aClass145_5.anObject7 != null) {
													Static151.method2719(Static59.aString95, Static263.aBoolean281);
												}
												Static263.aBoolean281 = false;
												Static99.aClass145_5 = null;
												Static59.aString95 = null;
											}
											if (Static156.anInt3722 % 1500 == 0) {
												Static34.method618();
												return;
											}
											return;
										}
										local61 = local56.aClass122_18;
										if (local61.anInt4662 < 0) {
											break;
										}
										local74 = Static206.method3444(local61.anInt4703);
									} while (local74 == null || local74.aClass122Array2 == null || local61.anInt4662 >= local74.aClass122Array2.length || local61 != local74.aClass122Array2[local61.anInt4662]);
									Static153.method2746(local56);
								}
							}
							local61 = local56.aClass122_18;
							if (local61.anInt4662 < 0) {
								break;
							}
							local74 = Static206.method3444(local61.anInt4703);
						} while (local74 == null || local74.aClass122Array2 == null || local61.anInt4662 >= local74.aClass122Array2.length || local74.aClass122Array2[local61.anInt4662] != local61);
						Static153.method2746(local56);
					}
				}
				local61 = local56.aClass122_18;
				if (local61.anInt4662 < 0) {
					break;
				}
				local74 = Static206.method3444(local61.anInt4703);
			} while (local74 == null || local74.aClass122Array2 == null || local74.aClass122Array2.length <= local61.anInt4662 || local74.aClass122Array2[local61.anInt4662] != local61);
			Static153.method2746(local56);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method696() {
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method708() {
		if (Static32.anInt930 < Static196.aClass18_2.anInt768) {
			if (Static8.anInt151 == Static45.anInt1360) {
				Static45.anInt1360 = Static79.anInt2161;
			} else {
				Static45.anInt1360 = Static8.anInt151;
			}
			Static143.anInt3465 = (Static196.aClass18_2.anInt768 - 1) * 50 * 5;
			if (Static143.anInt3465 > 3000) {
				Static143.anInt3465 = 3000;
			}
			if (Static196.aClass18_2.anInt768 >= 2 && Static196.aClass18_2.anInt769 == 6) {
				this.method686("js5connect_outofdate");
				Static224.anInt4922 = 1000;
				return;
			}
			if (Static196.aClass18_2.anInt768 >= 4 && Static196.aClass18_2.anInt769 == -1) {
				this.method686("js5crc");
				Static224.anInt4922 = 1000;
				return;
			}
			if (Static196.aClass18_2.anInt768 >= 4 && (Static224.anInt4922 == 0 || Static224.anInt4922 == 5)) {
				if (Static196.aClass18_2.anInt769 == 7 || Static196.aClass18_2.anInt769 == 9) {
					this.method686("js5connect_full");
				} else if (Static196.aClass18_2.anInt769 <= 0) {
					this.method686("js5io");
				} else {
					this.method686("js5connect");
				}
				Static224.anInt4922 = 1000;
				return;
			}
		}
		Static32.anInt930 = Static196.aClass18_2.anInt768;
		if (Static143.anInt3465 > 0) {
			Static143.anInt3465--;
			return;
		}
		try {
			if (Static1.anInt25 == 0) {
				Static82.aClass145_4 = Static38.aClass28_1.method718(Static45.anInt1360, Static70.aString115);
				Static1.anInt25++;
			}
			if (Static1.anInt25 == 1) {
				if (Static82.aClass145_4.anInt5354 == 2) {
					this.method701(1000);
					return;
				}
				if (Static82.aClass145_4.anInt5354 == 1) {
					Static1.anInt25++;
				}
			}
			if (Static1.anInt25 == 2) {
				Static228.aClass109_3 = new Class109((Socket) Static82.aClass145_4.anObject7, Static38.aClass28_1);
				@Pc(179) Class1_Sub13 local179 = new Class1_Sub13(5);
				local179.method1766(15);
				local179.method1754(535);
				Static228.aClass109_3.method3150(local179.aByteArray29, 5);
				Static1.anInt25++;
				Static10.aLong15 = Static31.method591();
			}
			if (Static1.anInt25 == 3) {
				if (Static224.anInt4922 == 0 || Static224.anInt4922 == 5 || Static228.aClass109_3.method3143() > 0) {
					@Pc(234) int local234 = Static228.aClass109_3.method3142();
					if (local234 != 0) {
						this.method701(local234);
						return;
					}
					Static1.anInt25++;
				} else if (Static31.method591() - Static10.aLong15 > 30000L) {
					this.method701(1001);
					return;
				}
			}
			if (Static1.anInt25 == 4) {
				@Pc(263) boolean local263 = Static224.anInt4922 == 5 || Static224.anInt4922 == 10 || Static224.anInt4922 == 28;
				Static196.aClass18_2.method432(Static228.aClass109_3, !local263);
				Static228.aClass109_3 = null;
				Static82.aClass145_4 = null;
				Static1.anInt25 = 0;
			}
		} catch (@Pc(280) IOException local280) {
			this.method701(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method685() {
		if (Static224.anInt4922 == 1000) {
			return;
		}
		@Pc(14) long local14 = Static31.method591() - Static256.aLong180;
		Static256.aLong180 = Static31.method591();
		@Pc(20) boolean local20 = Static202.method3367();
		if (local20 && Static1.aBoolean1 && Static90.aClass55_1 != null) {
			Static90.aClass55_1.method3203();
		}
		if ((Static224.anInt4922 == 30 || Static224.anInt4922 == 10) && (Static64.aBoolean99 || Static202.aLong145 != 0L && Static202.aLong145 < Static31.method591())) {
			Static48.method981(Static64.aBoolean99, Static66.anInt1836, Static26.anInt701, Static110.method2246());
		}
		@Pc(84) int local84;
		if (Static88.aFrame2 == null) {
			@Pc(65) Container local65;
			if (Static88.aFrame2 != null) {
				local65 = Static88.aFrame2;
			} else if (Static42.aFrame1 == null) {
				local65 = Static38.aClass28_1.anApplet1;
			} else {
				local65 = Static42.aFrame1;
			}
			@Pc(80) int local80 = local65.getSize().width;
			local84 = local65.getSize().height;
			if (local65 == Static42.aFrame1) {
				@Pc(90) Insets local90 = Static42.aFrame1.getInsets();
				local80 -= local90.right + local90.left;
				local84 -= local90.top + local90.bottom;
			}
			if (local80 != Static101.anInt2760 || Static39.anInt1098 != local84) {
				if (Static40.aString58.startsWith("mac")) {
					Static101.anInt2760 = local80;
					Static39.anInt1098 = local84;
				} else {
					Static105.method2179();
				}
				Static202.aLong145 = Static31.method591() + 500L;
			}
		}
		@Pc(140) boolean local140 = false;
		if (Static122.aBoolean170) {
			Static122.aBoolean170 = false;
			local140 = true;
		}
		if (local140) {
			Static139.method4195();
		}
		if (Static224.anInt4922 == 0) {
			Static193.method3250(Static175.aString270, Static16.anInt4949, local140, null);
		} else if (Static224.anInt4922 == 5) {
			Static219.method3586(Static120.aClass1_Sub2_Sub7_2);
		} else if (Static224.anInt4922 == 10) {
			Static166.method2883();
		} else if (Static224.anInt4922 == 25 || Static224.anInt4922 == 28) {
			if (Static212.anInt4622 == 1) {
				if (Static230.anInt5423 > Static242.anInt5217) {
					Static242.anInt5217 = Static230.anInt5423;
				}
				local84 = (Static242.anInt5217 - Static230.anInt5423) * 50 / Static242.anInt5217;
				Static179.method3059(false, Static136.aString218 + "<br>(" + local84 + "%)");
			} else if (Static212.anInt4622 == 2) {
				if (Static16.anInt4951 > Static142.anInt3424) {
					Static142.anInt3424 = Static16.anInt4951;
				}
				local84 = (Static142.anInt3424 - Static16.anInt4951) * 50 / Static142.anInt3424 + 50;
				Static179.method3059(false, Static136.aString218 + "<br>(" + local84 + "%)");
			} else {
				Static179.method3059(false, Static136.aString218);
			}
		} else if (Static224.anInt4922 == 30) {
			Static102.method2109(local14);
		} else if (Static224.anInt4922 == 40) {
			Static179.method3059(false, Static93.aString165 + "<br>" + Static87.aString153);
		}
		@Pc(323) int local323;
		@Pc(315) Graphics local315;
		if ((Static224.anInt4922 == 30 || Static224.anInt4922 == 10) && Static242.anInt5228 == 0 && !local140) {
			try {
				local315 = Static98.aCanvas1.getGraphics();
				for (local323 = 0; local323 < Static255.anInt5426; local323++) {
					if (Static186.aBooleanArray17[local323]) {
						Static193.aClass73_1.method2870(Static67.anIntArray143[local323], local315, Static76.anIntArray156[local323], Static165.anIntArray291[local323], Static141.anIntArray178[local323]);
						Static186.aBooleanArray17[local323] = false;
					}
				}
			} catch (@Pc(380) Exception local380) {
				Static98.aCanvas1.repaint();
			}
		} else if (Static224.anInt4922 != 0) {
			try {
				local315 = Static98.aCanvas1.getGraphics();
				Static193.aClass73_1.method2867(local315);
				for (local323 = 0; local323 < Static255.anInt5426; local323++) {
					Static186.aBooleanArray17[local323] = false;
				}
			} catch (@Pc(339) Exception local339) {
				Static98.aCanvas1.repaint();
			}
		}
		if (Static81.aBoolean129) {
			Static113.method4191();
		}
		if (Static87.aBoolean135 && Static224.anInt4922 == 10 && Static140.anInt3388 != -1) {
			Static87.aBoolean135 = false;
			Static22.method2185(Static38.aClass28_1);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method700() {
		if (Static224.anInt4922 == 1000) {
			return;
		}
		Static156.anInt3722++;
		if (Static156.anInt3722 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static47.anInt1386 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static10.aRandom1.setSeed((long) Static47.anInt1386);
		}
		this.method703();
		if (Static202.aClass130_1 != null) {
			Static202.aClass130_1.method3889();
		}
		Static212.method3505();
		Static98.method2086();
		Static212.method3506();
		Static190.method3225();
		if (Static261.aClass62_1 != null) {
			@Pc(70) int local70 = Static261.aClass62_1.method2133();
			Static175.anInt4030 = local70;
		}
		if (Static224.anInt4922 == 0) {
			this.method704();
			Static90.method1901();
		} else if (Static224.anInt4922 == 5) {
			this.method704();
			Static90.method1901();
		} else if (Static224.anInt4922 == 25 || Static224.anInt4922 == 28) {
			Static122.method2378();
		}
		if (Static224.anInt4922 == 10) {
			this.method705();
			Static257.method4149();
			Static264.method4209();
			Static161.method2823();
		} else if (Static224.anInt4922 == 30) {
			Static56.method1072();
		} else if (Static224.anInt4922 == 40) {
			Static161.method2823();
			if (Static169.anInt3963 != -3) {
				if (Static169.anInt3963 == 15) {
					Static113.method4190();
					return;
				}
				if (Static169.anInt3963 != 2) {
					Static179.method3056();
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
	private void method709(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class1_Sub13 local12 = new Class1_Sub13(arg0);
		while (true) {
			@Pc(16) int local16 = local12.method1772();
			if (local16 == 0) {
				return;
			}
			if (local16 == 1) {
				local12.method1764();
				local12.method1764();
				local12.method1764();
				local12.method1764();
				local12.method1764();
				local12.method1764();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method690() {
		if (Static120.aClass27_1 != null) {
			Static120.aClass27_1.aBoolean55 = false;
		}
		Static120.aClass27_1 = null;
		if (Static34.aClass109_2 != null) {
			Static34.aClass109_2.method3141();
			Static34.aClass109_2 = null;
		}
		Static218.method3556(Static98.aCanvas1);
		Static117.method2318(Static98.aCanvas1);
		if (Static261.aClass62_1 != null) {
			Static261.aClass62_1.method2137(Static98.aCanvas1);
		}
		Static25.method509();
		Static232.method3870();
		Static261.aClass62_1 = null;
		if (Static90.aClass55_1 != null) {
			Static90.aClass55_1.method3219();
		}
		if (Static239.aClass55_2 != null) {
			Static239.aClass55_2.method3219();
		}
		Static196.aClass18_2.method439();
		Static57.aClass60_1.method2107();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method692() {
		Static105.method2179();
		Static57.aClass60_1 = new Class60();
		Static196.aClass18_2 = new Class18();
		if (Static157.anInt3784 != 0) {
			Static243.aByteArrayArray12 = new byte[50][];
		}
		Static42.method788(Static38.aClass28_1);
		if (Static25.anInt848 == 0) {
			Static183.aString371 = this.getCodeBase().getHost();
			Static115.anInt3010 = 443;
			Static11.anInt494 = 43594;
		} else if (Static25.anInt848 == 1) {
			Static183.aString371 = this.getCodeBase().getHost();
			Static11.anInt494 = Static153.anInt3686 + 40000;
			Static115.anInt3010 = Static153.anInt3686 + 50000;
		} else if (Static25.anInt848 == 2) {
			Static11.anInt494 = Static153.anInt3686 + 40000;
			Static183.aString371 = "127.0.0.1";
			Static115.anInt3010 = Static153.anInt3686 + 50000;
		}
		Static79.anInt2161 = Static115.anInt3010;
		Static70.aString115 = Static183.aString371;
		if (Static40.anInt1103 == 3 && Static25.anInt848 != 2) {
			Static136.anInt3373 = Static153.anInt3686;
		}
		Static74.aShortArray28 = Static238.aShortArray68 = Static115.aShortArray45 = Static250.aShortArray69 = new short[256];
		Static191.anInt4270 = Static11.anInt494;
		Static8.anInt151 = Static11.anInt494;
		Static45.anInt1360 = Static191.anInt4270;
		if (Static68.anInt1404 == 1) {
			Static108.aShortArray44 = Static143.aShortArray48;
			Static202.aBoolean219 = true;
			Static262.aShortArrayArray8 = Static229.aShortArrayArray7;
			Static73.aShortArrayArray2 = Static136.aShortArrayArray6;
			Static88.aShortArray33 = Static236.aShortArray66;
		} else {
			Static88.aShortArray33 = Static154.aShortArray55;
			Static73.aShortArrayArray2 = Static8.aShortArrayArray1;
			Static262.aShortArrayArray8 = Static111.aShortArrayArray3;
			Static108.aShortArray44 = Static234.aShortArray65;
		}
		Static5.method93();
		Static178.method3055(Static98.aCanvas1);
		Static4.method81(Static98.aCanvas1);
		Static261.aClass62_1 = Static47.method969();
		if (Static261.aClass62_1 != null) {
			Static261.aClass62_1.method2135(Static98.aCanvas1);
		}
		Static79.anInt2153 = Static40.anInt1103;
		try {
			if (Static38.aClass28_1.aClass129_4 != null) {
				Static52.aClass5_7 = new Class5(Static38.aClass28_1.aClass129_4, 5200, 0);
				for (@Pc(160) int local160 = 0; local160 < 29; local160++) {
					Static56.aClass5Array1[local160] = new Class5(Static38.aClass28_1.aClass129Array1[local160], 6000, 0);
				}
				Static107.aClass5_10 = new Class5(Static38.aClass28_1.aClass129_2, 6000, 0);
				Static252.aClass71_4 = new Class71(255, Static52.aClass5_7, Static107.aClass5_10, 500000);
				Static211.aClass5_15 = new Class5(Static38.aClass28_1.aClass129_3, 24, 0);
				Static38.aClass28_1.aClass129Array1 = null;
				Static38.aClass28_1.aClass129_3 = null;
				Static38.aClass28_1.aClass129_2 = null;
				Static38.aClass28_1.aClass129_4 = null;
			}
		} catch (@Pc(216) IOException local216) {
			Static252.aClass71_4 = null;
			Static211.aClass5_15 = null;
			Static52.aClass5_7 = null;
			Static107.aClass5_10 = null;
		}
		if (Static25.anInt848 != 0) {
			Static266.aBoolean282 = true;
		}
		Static210.aString325 = Static208.aString316;
	}
}
