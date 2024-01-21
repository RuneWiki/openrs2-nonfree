import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
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
			if (arg0.length != 7) {
				Static27.method405();
			}
			Static40.anInt844 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static44.anInt1016 = 0;
			} else if (arg0[1].equals("office")) {
				Static44.anInt1016 = 1;
			} else if (arg0[1].equals("local")) {
				Static44.anInt1016 = 2;
			} else {
				Static27.method405();
			}
			if (arg0[2].equals("live")) {
				Static132.anInt3724 = 0;
			} else if (arg0[2].equals("rc")) {
				Static132.anInt3724 = 1;
			} else if (arg0[2].equals("wip")) {
				Static132.anInt3724 = 2;
			} else {
				Static27.method405();
			}
			if (arg0[3].equals("lowmem")) {
				Static146.method2248();
			} else if (arg0[3].equals("highmem")) {
				Static158.method936();
			} else {
				Static27.method405();
			}
			if (arg0[4].equals("free")) {
				Static148.aBoolean131 = false;
			} else if (arg0[4].equals("members")) {
				Static148.aBoolean131 = true;
			} else {
				Static27.method405();
			}
			if (arg0[5].equals("english")) {
				Static140.anInt2923 = 0;
			} else if (arg0[5].equals("german")) {
				Static179.method2706();
				Static140.anInt2923 = 1;
			} else {
				Static27.method405();
			}
			if (arg0[6].equals("game0")) {
				Static167.anInt3347 = 0;
			} else if (arg0[6].equals("game1")) {
				Static167.anInt3347 = 1;
			} else {
				Static27.method405();
			}
			Static85.anInt1875 = 0;
			Static41.aClass20_307 = Static215.aClass20_1545;
			Static199.aString5 = "127.0.0.1";
			@Pc(178) client local178 = new client();
			local178.method488(Static132.anInt3724 + 32, "runescape");
			Static116.aFrame1.setLocation(40, 40);
		} catch (@Pc(196) Exception local196) {
			Static51.method890(local196, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method508() {
		if (Static96.anInt2013 != 1000) {
			@Pc(12) boolean local12 = Static169.method2571();
			if (!local12) {
				this.method513();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method490() {
		Static177.anInt3533++;
		if (Static177.anInt3533 % 1000 == 1) {
			@Pc(25) GregorianCalendar local25 = new GregorianCalendar();
			Static193.anInt3790 = local25.get(11) * 600 + local25.get(12) * 10 + local25.get(13) / 6;
			Static175.aRandom1.setSeed((long) Static193.anInt3790);
		}
		this.method508();
		Static124.method1952();
		Static178.method2697();
		Static95.method1546();
		Static47.method3209();
		Static13.method2940();
		if (Static80.aClass25_1 != null) {
			@Pc(67) int local67 = Static80.aClass25_1.method792();
			Static95.anInt2009 = local67;
		}
		if (Static96.anInt2013 == 0) {
			this.method512();
			Static28.method425();
		} else if (Static96.anInt2013 == 5) {
			Static134.method2068(this);
			this.method512();
			Static28.method425();
		} else if (Static96.anInt2013 == 10) {
			Static134.method2068(this);
		} else if (Static96.anInt2013 == 20) {
			Static134.method2068(this);
			Static86.method1466();
		} else if (Static96.anInt2013 == 25) {
			Static183.method2775();
		}
		if (Static96.anInt2013 == 30) {
			Static107.method1727();
		} else if (Static96.anInt2013 == 40) {
			Static86.method1466();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method495() {
		if (Static217.aClass100_1 != null) {
			Static217.aClass100_1.aBoolean172 = false;
		}
		Static217.aClass100_1 = null;
		if (Static157.aClass39_3 != null) {
			Static157.aClass39_3.method1175();
			Static157.aClass39_3 = null;
		}
		Static171.method2624(Static198.aCanvas1);
		Static30.method459(Static198.aCanvas1);
		if (Static80.aClass25_1 != null) {
			Static80.aClass25_1.method794(Static198.aCanvas1);
		}
		Static111.method1767();
		Static57.method994();
		Static80.aClass25_1 = null;
		if (Static59.aClass9_1 != null) {
			Static59.aClass9_1.method2928();
		}
		if (Static192.aClass9_2 != null) {
			Static192.aClass9_2.method2928();
		}
		Static167.method2535();
		Static83.method1439();
		try {
			if (Static36.aClass34_3 != null) {
				Static36.aClass34_3.method1016();
			}
			if (Static152.aClass34Array3 != null) {
				for (@Pc(67) int local67 = 0; local67 < Static152.aClass34Array3.length; local67++) {
					if (Static152.aClass34Array3[local67] != null) {
						Static152.aClass34Array3[local67].method1016();
					}
				}
			}
			if (Static157.aClass34_5 != null) {
				Static157.aClass34_5.method1016();
			}
			if (Static43.aClass34_4 != null) {
				Static43.aClass34_4.method1016();
			}
		} catch (@Pc(95) IOException local95) {
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	protected void method501() {
		@Pc(7) boolean local7 = false;
		@Pc(10) boolean local10 = Static165.method1746();
		if (local10 && Static210.aBoolean58 && Static59.aClass9_1 != null) {
			Static59.aClass9_1.method2927();
		}
		if (Static169.aBoolean150) {
			local7 = true;
			Static169.aBoolean150 = false;
		}
		if (Static96.anInt2013 == 0) {
			Static114.method502(null, Static136.anInt2841, local7, Static17.aClass20_155);
		} else if (Static96.anInt2013 == 5 || Static96.anInt2013 == 10 || Static96.anInt2013 == 20) {
			Static36.method615(Static30.aClass5_Sub2_Sub8_1, Static31.aClass5_Sub2_Sub8_2);
		} else if (Static96.anInt2013 == 25) {
			@Pc(61) int local61;
			if (Static137.anInt2874 == 1) {
				if (Static4.anInt106 < Static80.anInt1807) {
					Static4.anInt106 = Static80.anInt1807;
				}
				local61 = (Static4.anInt106 - Static80.anInt1807) * 50 / Static4.anInt106;
				Static167.method2533(Static70.method1166(new Class20[] { Static119.aClass20_924, Static158.aClass20_386, Static132.method2805(local61), Static199.aClass20_1471 }), false);
			} else if (Static137.anInt2874 == 2) {
				if (Static52.anInt1112 > Static65.anInt1418) {
					Static65.anInt1418 = Static52.anInt1112;
				}
				local61 = (Static65.anInt1418 - Static52.anInt1112) * 50 / Static65.anInt1418 + 50;
				Static167.method2533(Static70.method1166(new Class20[] { Static119.aClass20_924, Static158.aClass20_386, Static132.method2805(local61), Static199.aClass20_1471 }), false);
			} else {
				Static167.method2533(Static119.aClass20_924, false);
			}
		} else if (Static96.anInt2013 == 30) {
			Static93.method2402();
		} else if (Static96.anInt2013 == 40) {
			Static167.method2533(Static70.method1166(new Class20[] { Static90.aClass20_715, Static33.aClass20_259, Static3.aClass20_36 }), false);
		}
		@Pc(191) Canvas local191 = Static198.aCanvas1;
		@Pc(203) Graphics local203;
		@Pc(205) int local205;
		if (Static96.anInt2013 == 30 && Static108.anInt2202 == 0 && !local7) {
			try {
				local203 = local191.getGraphics();
				for (local205 = 0; local205 < Static137.anInt2871; local205++) {
					if (Static75.aBooleanArray17[local205]) {
						Static197.aClass24_1.method2290(Static49.anIntArray99[local205], Static52.anIntArray104[local205], Static55.anIntArray109[local205], local203, Static106.anIntArray237[local205]);
						Static75.aBooleanArray17[local205] = false;
					}
				}
			} catch (@Pc(237) Exception local237) {
				local191.repaint();
			}
		} else if (Static96.anInt2013 > 0) {
			try {
				local203 = local191.getGraphics();
				Static197.aClass24_1.method2287(local203);
				for (local205 = 0; local205 < Static137.anInt2871; local205++) {
					Static75.aBooleanArray17[local205] = false;
				}
			} catch (@Pc(265) Exception local265) {
				local191.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method511(@OriginalArg(0) int arg0) {
		Static141.anInt2954 = 0;
		Static2.anInt20++;
		Static26.aClass39_5 = null;
		if (Static141.anInt2946 == Static67.anInt3982) {
			Static141.anInt2946 = Static63.anInt1382;
		} else {
			Static141.anInt2946 = Static67.anInt3982;
		}
		Static129.aClass65_8 = null;
		if (Static2.anInt20 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static96.anInt2013 > 5) {
				Static215.anInt4178 = 3000;
			} else {
				this.method507("js5connect_full");
				Static96.anInt2013 = 1000;
			}
		} else if (Static2.anInt20 >= 2 && arg0 == 6) {
			this.method507("js5connect_outofdate");
			Static96.anInt2013 = 1000;
		} else if (Static2.anInt20 >= 4) {
			if (Static96.anInt2013 <= 5) {
				this.method507("js5connect");
				Static96.anInt2013 = 1000;
			} else {
				Static215.anInt4178 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method505()) {
			return;
		}
		Static40.anInt844 = Integer.parseInt(this.getParameter("worldid"));
		Static132.anInt3724 = Integer.parseInt(this.getParameter("modewhat"));
		Static44.anInt1016 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static146.method2248();
		} else {
			Static158.method936();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static148.aBoolean131 = true;
		} else {
			Static148.aBoolean131 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static179.method2706();
			Static140.anInt2923 = 1;
		}
		@Pc(75) String local75 = this.getParameter("game");
		if (local75 != null && local75.equals("1")) {
			Static167.anInt3347 = 1;
		} else {
			Static167.anInt3347 = 0;
		}
		try {
			Static57.anInt1309 = Integer.parseInt(this.getParameter("js"));
			Static94.anInt2006 = Integer.parseInt(this.getParameter("plug"));
			Static85.anInt1875 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(104) Exception local104) {
		}
		Static41.aClass20_307 = Static22.aClass20_1034.method583(this);
		if (Static41.aClass20_307 == null) {
			Static41.aClass20_307 = Static215.aClass20_1545;
		}
		Static199.aString5 = this.getCodeBase().getHost();
		this.method503(Static132.anInt3724 + 32);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	private void method512() {
		@Pc(22) int local22;
		if (Static131.anInt2719 == 0) {
			@Pc(12) Runtime local12 = Runtime.getRuntime();
			local22 = (int) ((local12.totalMemory() - local12.freeMemory()) / 1024L);
			@Pc(25) long local25 = Static188.method2822();
			if (Static130.aLong155 == 0L) {
				Static130.aLong155 = local25;
			}
			if (local22 > 16384 && local25 - Static130.aLong155 < 5000L) {
				if (local25 - Static141.aLong173 > 1000L) {
					System.gc();
					Static141.aLong173 = local25;
				}
				Static136.anInt2841 = 5;
				Static17.aClass20_155 = Static209.aClass20_1517;
			} else {
				Static136.anInt2841 = 5;
				Static131.anInt2719 = 10;
				Static17.aClass20_155 = Static167.aClass20_1229;
			}
			return;
		}
		@Pc(77) int local77;
		if (Static131.anInt2719 == 10) {
			Static147.method2259();
			for (local77 = 0; local77 < 4; local77++) {
				Static9.aClass76Array1[local77] = new Class76(104, 104);
			}
			Static131.anInt2719 = 30;
			Static17.aClass20_155 = Static144.aClass20_1129;
			Static136.anInt2841 = 10;
		} else if (Static131.anInt2719 == 30) {
			Static38.aClass23_Sub1_4 = Static54.method943(0, true, true, false);
			Static48.aClass23_Sub1_6 = Static54.method943(1, true, true, false);
			Static139.aClass23_Sub1_19 = Static54.method943(2, true, false, true);
			Static177.aClass23_Sub1_24 = Static54.method943(3, true, true, false);
			Static60.aClass23_Sub1_9 = Static54.method943(4, true, true, false);
			Static161.aClass23_Sub1_21 = Static54.method943(5, true, true, true);
			Static59.aClass23_Sub1_7 = Static54.method943(6, false, true, true);
			Static130.aClass23_Sub1_15 = Static54.method943(7, true, true, false);
			Static186.aClass23_Sub1_26 = Static54.method943(8, true, true, false);
			Static127.aClass23_Sub1_14 = Static54.method943(9, true, false, true);
			Static141.aClass23_Sub1_20 = Static54.method943(10, true, true, false);
			Static16.aClass23_Sub1_3 = Static54.method943(11, true, true, false);
			Static130.aClass23_Sub1_16 = Static54.method943(12, true, true, false);
			Static185.aClass23_Sub1_25 = Static54.method943(13, true, false, true);
			Static134.aClass23_Sub1_17 = Static54.method943(14, false, true, false);
			Static214.aClass23_Sub1_28 = Static54.method943(15, true, true, false);
			Static175.aClass23_Sub1_23 = Static54.method943(16, true, true, false);
			Static59.aClass23_Sub1_8 = Static54.method943(17, true, true, false);
			Static7.aClass23_Sub1_1 = Static54.method943(18, true, true, false);
			Static166.aClass23_Sub1_22 = Static54.method943(19, true, true, false);
			Static69.aClass23_Sub1_10 = Static54.method943(20, true, true, false);
			Static109.aClass23_Sub1_13 = Static54.method943(21, true, true, false);
			Static103.aClass23_Sub1_12 = Static54.method943(22, true, true, false);
			Static48.aClass23_Sub1_5 = Static54.method943(23, true, true, true);
			Static137.aClass23_Sub1_18 = Static54.method943(24, true, true, false);
			Static12.aClass23_Sub1_2 = Static54.method943(25, true, true, false);
			Static131.anInt2719 = 40;
			Static136.anInt2841 = 15;
			Static17.aClass20_155 = Static117.aClass20_906;
		} else if (Static131.anInt2719 == 40) {
			local77 = Static38.aClass23_Sub1_4.method765() * 4 / 100;
			local77 += Static48.aClass23_Sub1_6.method765() * 4 / 100;
			local77 += Static139.aClass23_Sub1_19.method765() / 100;
			local77 += Static177.aClass23_Sub1_24.method765() * 2 / 100;
			local77 += Static60.aClass23_Sub1_9.method765() * 6 / 100;
			local77 += Static161.aClass23_Sub1_21.method765() * 4 / 100;
			local77 += Static59.aClass23_Sub1_7.method765() * 2 / 100;
			local77 += Static130.aClass23_Sub1_15.method765() * 51 / 100;
			local77 += Static186.aClass23_Sub1_26.method765() * 2 / 100;
			local77 += Static127.aClass23_Sub1_14.method765() * 2 / 100;
			local77 += Static141.aClass23_Sub1_20.method765() * 2 / 100;
			local77 += Static16.aClass23_Sub1_3.method765() * 2 / 100;
			local77 += Static130.aClass23_Sub1_16.method765() * 2 / 100;
			local77 += Static185.aClass23_Sub1_25.method765() * 2 / 100;
			local77 += Static134.aClass23_Sub1_17.method765() * 2 / 100;
			local77 += Static214.aClass23_Sub1_28.method765() * 2 / 100;
			local77 += Static175.aClass23_Sub1_23.method765() / 100;
			local77 += Static59.aClass23_Sub1_8.method765() / 100;
			local77 += Static7.aClass23_Sub1_1.method765() / 100;
			local77 += Static166.aClass23_Sub1_22.method765() / 100;
			local77 += Static69.aClass23_Sub1_10.method765() / 100;
			local77 += Static109.aClass23_Sub1_13.method765() / 100;
			local77 += Static103.aClass23_Sub1_12.method765() / 100;
			local77 += Static48.aClass23_Sub1_5.method765() / 100;
			local77 += Static137.aClass23_Sub1_18.method765() / 100;
			local77 += Static12.aClass23_Sub1_2.method765() / 100;
			if (local77 == 100) {
				Static136.anInt2841 = 20;
				Static17.aClass20_155 = Static104.aClass20_810;
				Static170.method2601(Static59.aClass23_Sub1_7, Static141.aClass23_Sub1_20, Static186.aClass23_Sub1_26);
				Static131.anInt2719 = 45;
			} else {
				if (local77 != 0) {
					Static17.aClass20_155 = Static70.method1166(new Class20[] { Static82.aClass20_667, Static132.method2805(local77), Static41.aClass20_304 });
				}
				Static136.anInt2841 = 20;
			}
		} else if (Static131.anInt2719 == 45) {
			Static215.method3178(!Static14.aBoolean14);
			@Pc(607) Class5_Sub11_Sub2 local607 = new Class5_Sub11_Sub2();
			local607.method1630();
			Static59.aClass9_1 = Static97.method1565(22050, 0, Static8.aClass12_1, Static198.aCanvas1);
			Static59.aClass9_1.method2934(local607);
			Static207.method3103(Static60.aClass23_Sub1_9, local607, Static134.aClass23_Sub1_17, Static214.aClass23_Sub1_28);
			Static192.aClass9_2 = Static97.method1565(2048, 1, Static8.aClass12_1, Static198.aCanvas1);
			Static43.aClass5_Sub11_Sub4_1 = new Class5_Sub11_Sub4();
			Static192.aClass9_2.method2934(Static43.aClass5_Sub11_Sub4_1);
			Static160.aClass49_1 = new Class49(22050, Static62.anInt1362);
			Static17.aClass20_155 = Static18.aClass20_164;
			Static131.anInt2719 = 50;
			Static136.anInt2841 = 30;
		} else if (Static131.anInt2719 == 50) {
			local77 = 0;
			if (Static186.aClass23_Sub1_26.method754(Static105.aClass20_812)) {
				local77++;
			}
			if (Static186.aClass23_Sub1_26.method754(Static64.aClass20_481)) {
				local77++;
			}
			if (Static186.aClass23_Sub1_26.method754(Static95.aClass20_748)) {
				local77++;
			}
			if (Static185.aClass23_Sub1_25.method754(Static105.aClass20_812)) {
				local77++;
			}
			if (Static185.aClass23_Sub1_25.method754(Static64.aClass20_481)) {
				local77++;
			}
			if (Static185.aClass23_Sub1_25.method754(Static95.aClass20_748)) {
				local77++;
			}
			if (local77 < 6) {
				Static17.aClass20_155 = Static70.method1166(new Class20[] { Static165.aClass20_843, Static132.method2805(local77 * 100 / 6), Static41.aClass20_304 });
				Static136.anInt2841 = 35;
			} else {
				Static136.anInt2841 = 35;
				Static17.aClass20_155 = Static50.aClass20_362;
				Static131.anInt2719 = 60;
			}
		} else if (Static131.anInt2719 == 60) {
			local77 = Static73.method1194(Static186.aClass23_Sub1_26, Static141.aClass23_Sub1_20);
			local22 = Static44.method837();
			if (local77 < local22) {
				Static17.aClass20_155 = Static70.method1166(new Class20[] { Static101.aClass20_799, Static132.method2805(local77 * 100 / local22), Static41.aClass20_304 });
				Static136.anInt2841 = 40;
			} else {
				Static131.anInt2719 = 65;
				Static136.anInt2841 = 40;
				Static17.aClass20_155 = Static78.aClass20_552;
			}
		} else if (Static131.anInt2719 == 65) {
			Static31.aClass5_Sub2_Sub8_2 = Static129.method2009(Static185.aClass23_Sub1_25, Static215.aClass20_1545, Static186.aClass23_Sub1_26, Static105.aClass20_812);
			Static136.aClass5_Sub2_Sub8_Sub1_Sub1_2 = (Class5_Sub2_Sub8_Sub1_Sub1) Static31.aClass5_Sub2_Sub8_2;
			Static165.aClass5_Sub2_Sub8_5 = Static129.method2009(Static185.aClass23_Sub1_25, Static215.aClass20_1545, Static186.aClass23_Sub1_26, Static64.aClass20_481);
			Static30.aClass5_Sub2_Sub8_1 = Static129.method2009(Static185.aClass23_Sub1_25, Static215.aClass20_1545, Static186.aClass23_Sub1_26, Static95.aClass20_748);
			Static136.anInt2841 = 45;
			Static17.aClass20_155 = Static41.aClass20_303;
			Static208.method3109(5);
			Static131.anInt2719 = 70;
		} else if (Static131.anInt2719 == 70) {
			Static139.aClass23_Sub1_19.method728();
			local77 = Static139.aClass23_Sub1_19.method744();
			Static175.aClass23_Sub1_23.method728();
			local77 += Static175.aClass23_Sub1_23.method744();
			Static59.aClass23_Sub1_8.method728();
			local77 += Static59.aClass23_Sub1_8.method744();
			Static7.aClass23_Sub1_1.method728();
			local77 += Static7.aClass23_Sub1_1.method744();
			Static166.aClass23_Sub1_22.method728();
			local77 += Static166.aClass23_Sub1_22.method744();
			Static69.aClass23_Sub1_10.method728();
			local77 += Static69.aClass23_Sub1_10.method744();
			Static109.aClass23_Sub1_13.method728();
			local77 += Static109.aClass23_Sub1_13.method744();
			Static103.aClass23_Sub1_12.method728();
			local77 += Static103.aClass23_Sub1_12.method744();
			Static137.aClass23_Sub1_18.method728();
			local77 += Static137.aClass23_Sub1_18.method744();
			Static12.aClass23_Sub1_2.method728();
			local77 += Static12.aClass23_Sub1_2.method744();
			if (local77 < 1000) {
				Static17.aClass20_155 = Static70.method1166(new Class20[] { Static143.aClass20_1122, Static132.method2805(local77 / 10), Static41.aClass20_304 });
				Static136.anInt2841 = 50;
			} else {
				Static140.method2171(Static139.aClass23_Sub1_19);
				Static98.method1643(Static139.aClass23_Sub1_19);
				Static16.method276(Static139.aClass23_Sub1_19, Static130.aClass23_Sub1_15);
				Static192.method2857(Static175.aClass23_Sub1_23, Static14.aBoolean14, Static130.aClass23_Sub1_15, Static148.aBoolean131);
				Static33.method541(Static130.aClass23_Sub1_15, Static7.aClass23_Sub1_1);
				Static210.method751(Static148.aBoolean131, Static136.aClass5_Sub2_Sub8_Sub1_Sub1_2, Static130.aClass23_Sub1_15, Static166.aClass23_Sub1_22);
				Static21.method3202(Static48.aClass23_Sub1_6, Static38.aClass23_Sub1_4, Static69.aClass23_Sub1_10);
				Static152.method2295(Static130.aClass23_Sub1_15, Static109.aClass23_Sub1_13);
				Static183.method2771(Static103.aClass23_Sub1_12);
				Static137.method2135(Static139.aClass23_Sub1_19);
				Static201.method1361(Static185.aClass23_Sub1_25, Static130.aClass23_Sub1_15, Static186.aClass23_Sub1_26, Static177.aClass23_Sub1_24);
				Static147.method2263(Static139.aClass23_Sub1_19);
				Static78.method1239(Static59.aClass23_Sub1_8);
				Static60.method1019(Static137.aClass23_Sub1_18, new Class82(), Static12.aClass23_Sub1_2);
				Static59.method1014(Static12.aClass23_Sub1_2, Static137.aClass23_Sub1_18);
				Static136.anInt2841 = 50;
				Static17.aClass20_155 = Static6.aClass20_78;
				Static8.method193();
				Static131.anInt2719 = 80;
			}
		} else if (Static131.anInt2719 == 80) {
			local77 = 0;
			if (Static16.aClass5_Sub2_Sub10_1 == null) {
				@Pc(1053) Class5_Sub2_Sub10_Sub1 local1053 = Static93.method2401(Static186.aClass23_Sub1_26, Static215.aClass20_1545, Static32.aClass20_257);
				if (local1053 != null) {
					local1053.method2426();
					Static16.aClass5_Sub2_Sub10_1 = local1053;
				}
			} else {
				local77++;
			}
			if (Static191.aClass47_Sub1Array2 == null) {
				Static191.aClass47_Sub1Array2 = Static216.method3181(Static89.aClass20_706, Static186.aClass23_Sub1_26, Static215.aClass20_1545);
			} else {
				local77++;
			}
			if (Static47.aClass5_Sub2_Sub10_Sub1Array103 == null) {
				Static47.aClass5_Sub2_Sub10_Sub1Array103 = Static180.method2721(Static6.aClass20_75, Static215.aClass20_1545, Static186.aClass23_Sub1_26);
			} else {
				local77++;
			}
			if (Static150.aClass5_Sub2_Sub10Array10 == null) {
				Static150.aClass5_Sub2_Sub10Array10 = Static194.method2882(Static114.aClass20_243, Static215.aClass20_1545, Static186.aClass23_Sub1_26);
			} else {
				local77++;
			}
			if (Static176.aClass5_Sub2_Sub10Array11 == null) {
				Static176.aClass5_Sub2_Sub10Array11 = Static194.method2882(Static85.aClass20_686, Static215.aClass20_1545, Static186.aClass23_Sub1_26);
			} else {
				local77++;
			}
			if (Static211.aClass5_Sub2_Sub10Array12 == null) {
				Static211.aClass5_Sub2_Sub10Array12 = Static194.method2882(Static145.aClass20_1134, Static215.aClass20_1545, Static186.aClass23_Sub1_26);
			} else {
				local77++;
			}
			if (Static10.aClass5_Sub2_Sub10Array1 == null) {
				Static10.aClass5_Sub2_Sub10Array1 = Static194.method2882(Static130.aClass20_986, Static215.aClass20_1545, Static186.aClass23_Sub1_26);
			} else {
				local77++;
			}
			if (Static16.aClass5_Sub2_Sub10Array2 == null) {
				Static16.aClass5_Sub2_Sub10Array2 = Static194.method2882(Static214.aClass20_1535, Static215.aClass20_1545, Static186.aClass23_Sub1_26);
			} else {
				local77++;
			}
			@Pc(1156) int local1156;
			if (Static73.aClass5_Sub2_Sub10Array7 == null) {
				@Pc(1152) Class5_Sub2_Sub10_Sub1[] local1152 = Static180.method2721(Static176.aClass20_1297, Static215.aClass20_1545, Static186.aClass23_Sub1_26);
				if (local1152 != null) {
					for (local1156 = 0; local1156 < local1152.length; local1156++) {
						local1152[local1156].method2426();
					}
					Static73.aClass5_Sub2_Sub10Array7 = local1152;
				}
			} else {
				local77++;
			}
			if (Static201.aClass5_Sub2_Sub10_3 == null) {
				Static201.aClass5_Sub2_Sub10_3 = Static22.method2107(Static186.aClass23_Sub1_26, Static193.aClass20_1419, Static215.aClass20_1545);
			} else {
				local77++;
			}
			if (Static22.aClass5_Sub2_Sub10Array9 == null) {
				Static22.aClass5_Sub2_Sub10Array9 = Static194.method2882(Static6.aClass20_74, Static215.aClass20_1545, Static186.aClass23_Sub1_26);
			} else {
				local77++;
			}
			if (Static31.aClass5_Sub2_Sub10Array4 == null) {
				Static31.aClass5_Sub2_Sub10Array4 = Static194.method2882(Static37.aClass20_471, Static215.aClass20_1545, Static186.aClass23_Sub1_26);
			} else {
				local77++;
			}
			if (Static158.aClass47Array4 == null) {
				Static158.aClass47Array4 = Static38.method642(Static36.aClass20_273, Static186.aClass23_Sub1_26, Static215.aClass20_1545);
			} else {
				local77++;
			}
			if (Static3.aClass47Array1 == null) {
				Static3.aClass47Array1 = Static38.method642(Static105.aClass20_814, Static186.aClass23_Sub1_26, Static215.aClass20_1545);
			} else {
				local77++;
			}
			local77++;
			if (local77 < 15) {
				Static17.aClass20_155 = Static70.method1166(new Class20[] { Static111.aClass20_862, Static132.method2805(local77 * 100 / 15), Static41.aClass20_304 });
				Static136.anInt2841 = 60;
			} else {
				Static31.aClass5_Sub2_Sub8_2.method1345(Static3.aClass47Array1, null);
				local1156 = (int) (Math.random() * 21.0D) - 10;
				local22 = (int) (Math.random() * 21.0D) - 10;
				@Pc(1283) int local1283 = (int) (Math.random() * 21.0D) - 10;
				Static165.aClass5_Sub2_Sub8_5.method1345(Static3.aClass47Array1, null);
				@Pc(1294) int local1294 = (int) (Math.random() * 41.0D) - 20;
				Static30.aClass5_Sub2_Sub8_1.method1345(Static3.aClass47Array1, null);
				for (@Pc(1300) int local1300 = 0; local1300 < Static47.aClass5_Sub2_Sub10_Sub1Array103.length; local1300++) {
					Static47.aClass5_Sub2_Sub10_Sub1Array103[local1300].method2428(local22 + local1294, local1294 + local1156, local1283 + local1294);
				}
				Static191.aClass47_Sub1Array2[0].method2021(local1294 + local22, local1294 + local1156, local1294 + local1283);
				Static136.anInt2841 = 60;
				Static131.anInt2719 = 90;
				Static17.aClass20_155 = Static172.aClass20_1352;
				Static98.aClass5_Sub2_Sub10Array8 = Static47.aClass5_Sub2_Sub10_Sub1Array103;
			}
		} else if (Static131.anInt2719 == 90) {
			if (Static127.aClass23_Sub1_14.method728()) {
				@Pc(1396) Class89 local1396 = new Class89(Static127.aClass23_Sub1_14, Static186.aClass23_Sub1_26, 20, Static14.aBoolean14 ? 64 : 128);
				Static149.method2277(local1396);
				Static149.method2275(0.7F);
				Static131.anInt2719 = 110;
				Static136.anInt2841 = 70;
				Static17.aClass20_155 = Static181.aClass20_1340;
			} else {
				Static17.aClass20_155 = Static70.method1166(new Class20[] { Static100.aClass20_795, Static132.method2805(Static127.aClass23_Sub1_14.method744()), Static41.aClass20_304 });
				Static136.anInt2841 = 70;
			}
		} else if (Static131.anInt2719 == 110) {
			Static217.aClass100_1 = new Class100();
			Static8.aClass12_1.method297(10, Static217.aClass100_1);
			Static131.anInt2719 = 120;
			Static17.aClass20_155 = Static94.aClass20_743;
			Static136.anInt2841 = 75;
		} else if (Static131.anInt2719 == 120) {
			if (Static141.aClass23_Sub1_20.method759(Static212.aClass20_1521, Static215.aClass20_1545)) {
				@Pc(1463) Class107 local1463 = new Class107(Static141.aClass23_Sub1_20.method730(Static212.aClass20_1521, Static215.aClass20_1545));
				Static176.method2675(local1463);
				Static17.aClass20_155 = Static117.aClass20_907;
				Static131.anInt2719 = 130;
				Static136.anInt2841 = 80;
			} else {
				Static17.aClass20_155 = Static70.method1166(new Class20[] { Static215.aClass20_1544, Static191.aClass20_1390 });
				Static136.anInt2841 = 80;
			}
		} else if (Static131.anInt2719 == 130) {
			if (!Static177.aClass23_Sub1_24.method728()) {
				Static17.aClass20_155 = Static70.method1166(new Class20[] { Static171.aClass20_1273, Static132.method2805(Static177.aClass23_Sub1_24.method744() * 4 / 5), Static41.aClass20_304 });
				Static136.anInt2841 = 85;
			} else if (!Static130.aClass23_Sub1_16.method728()) {
				Static17.aClass20_155 = Static70.method1166(new Class20[] { Static171.aClass20_1273, Static132.method2805(Static130.aClass23_Sub1_16.method744() / 6 + 80), Static41.aClass20_304 });
				Static136.anInt2841 = 85;
			} else if (Static185.aClass23_Sub1_25.method728()) {
				Static131.anInt2719 = 140;
				Static136.anInt2841 = 100;
				Static17.aClass20_155 = Static91.aClass20_724;
			} else {
				Static17.aClass20_155 = Static70.method1166(new Class20[] { Static171.aClass20_1273, Static132.method2805(Static185.aClass23_Sub1_25.method744() / 20 + 96), Static41.aClass20_304 });
				Static136.anInt2841 = 85;
			}
		} else if (Static131.anInt2719 == 140) {
			Static161.aClass23_Sub1_21.method753(false);
			Static59.aClass23_Sub1_7.method753(true);
			Static186.aClass23_Sub1_26.method753(true);
			Static185.aClass23_Sub1_25.method753(true);
			Static141.aClass23_Sub1_20.method753(true);
			Static208.method3109(10);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method494() {
		Static67.anInt3982 = Static44.anInt1016 == 0 ? 43594 : Static40.anInt844 + 40000;
		if (Static167.anInt3347 == 1) {
			Static129.aShortArrayArray8 = Static121.aShortArrayArray7;
			Static171.aShortArray52 = Static83.aShortArray24;
			Static88.aShortArrayArray6 = Static138.aShortArrayArray10;
			Static86.aShortArray25 = Static194.aShortArray58;
		} else {
			Static86.aShortArray25 = Static61.aShortArray20;
			Static129.aShortArrayArray8 = Static63.aShortArrayArray5;
			Static171.aShortArray52 = Static118.aShortArray41;
			Static88.aShortArrayArray6 = Static213.aShortArrayArray11;
		}
		Static141.anInt2946 = Static67.anInt3982;
		Static145.aShortArray39 = Static183.aShortArray57 = Static166.aShortArray46 = Static37.aShortArray21 = new short[256];
		Static63.anInt1382 = Static44.anInt1016 == 0 ? 443 : Static40.anInt844 + 50000;
		Static70.method1167();
		Static69.method1140(Static198.aCanvas1);
		Static91.method1510(Static198.aCanvas1);
		Static80.aClass25_1 = Static109.method1751();
		if (Static80.aClass25_1 != null) {
			Static80.aClass25_1.method796(Static198.aCanvas1);
		}
		Static120.anInt2562 = Static19.anInt356;
		try {
			if (Static8.aClass12_1.aClass67_2 != null) {
				Static36.aClass34_3 = new Class34(Static8.aClass12_1.aClass67_2, 5200, 0);
				for (@Pc(101) int local101 = 0; local101 < 26; local101++) {
					Static152.aClass34Array3[local101] = new Class34(Static8.aClass12_1.aClass67Array1[local101], 6000, 0);
				}
				Static157.aClass34_5 = new Class34(Static8.aClass12_1.aClass67_3, 6000, 0);
				Static144.aClass17_4 = new Class17(255, Static36.aClass34_3, Static157.aClass34_5, 500000);
				Static43.aClass34_4 = new Class34(Static8.aClass12_1.aClass67_1, 24, 0);
				Static8.aClass12_1.aClass67_2 = null;
				Static8.aClass12_1.aClass67Array1 = null;
				Static8.aClass12_1.aClass67_1 = null;
				Static8.aClass12_1.aClass67_3 = null;
			}
		} catch (@Pc(157) IOException local157) {
			Static36.aClass34_3 = null;
			Static157.aClass34_5 = null;
			Static43.aClass34_4 = null;
			Static144.aClass17_4 = null;
		}
		if (Static44.anInt1016 != 0) {
			Static159.aBoolean141 = true;
		}
		Static116.aClass20_905 = Static207.aClass20_1506;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method513() {
		if (Static146.anInt3022 >= 4) {
			this.method507("js5crc");
			Static96.anInt2013 = 1000;
			return;
		}
		if (Static103.anInt2175 >= 4) {
			if (Static96.anInt2013 <= 5) {
				this.method507("js5io");
				Static96.anInt2013 = 1000;
				return;
			}
			Static103.anInt2175 = 3;
			Static215.anInt4178 = 3000;
		}
		if (Static215.anInt4178-- > 0) {
			return;
		}
		try {
			if (Static141.anInt2954 == 0) {
				Static129.aClass65_8 = Static8.aClass12_1.method298(Static199.aString5, Static141.anInt2946);
				Static141.anInt2954++;
			}
			if (Static141.anInt2954 == 1) {
				if (Static129.aClass65_8.anInt2446 == 2) {
					this.method511(-1);
					return;
				}
				if (Static129.aClass65_8.anInt2446 == 1) {
					Static141.anInt2954++;
				}
			}
			if (Static141.anInt2954 == 2) {
				Static26.aClass39_5 = new Class39((Socket) Static129.aClass65_8.anObject3, Static8.aClass12_1);
				@Pc(94) Class5_Sub6 local94 = new Class5_Sub6(5);
				local94.method3061(15);
				local94.method3030(498);
				Static26.aClass39_5.method1176(5, local94.aByteArray56);
				Static141.anInt2954++;
				Static181.aLong215 = Static188.method2822();
			}
			if (Static141.anInt2954 == 3) {
				if (Static96.anInt2013 <= 5 || Static26.aClass39_5.method1172() > 0) {
					@Pc(149) int local149 = Static26.aClass39_5.method1170();
					if (local149 != 0) {
						this.method511(local149);
						return;
					}
					Static141.anInt2954++;
				} else if (Static188.method2822() - Static181.aLong215 > 30000L) {
					this.method511(-2);
					return;
				}
			}
			if (Static141.anInt2954 == 4) {
				Static57.method996(Static26.aClass39_5, Static96.anInt2013 > 20);
				Static26.aClass39_5 = null;
				Static129.aClass65_8 = null;
				Static2.anInt20 = 0;
				Static141.anInt2954 = 0;
			}
		} catch (@Pc(191) IOException local191) {
			this.method511(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method489() {
	}
}
