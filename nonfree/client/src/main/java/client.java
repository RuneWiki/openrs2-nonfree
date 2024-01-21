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
				Static135.method2424();
			}
			Static89.anInt2510 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static21.anInt787 = 0;
			} else if (arg0[1].equals("office")) {
				Static21.anInt787 = 1;
			} else if (arg0[1].equals("local")) {
				Static21.anInt787 = 2;
			} else {
				Static135.method2424();
			}
			if (arg0[2].equals("live")) {
				Static178.anInt4014 = 0;
			} else if (arg0[2].equals("rc")) {
				Static178.anInt4014 = 1;
			} else if (arg0[2].equals("wip")) {
				Static178.anInt4014 = 2;
			} else {
				Static135.method2424();
			}
			if (arg0[3].equals("lowmem")) {
				Static93.method1955();
			} else if (arg0[3].equals("highmem")) {
				Static89.method1865();
			} else {
				Static135.method2424();
			}
			if (arg0[4].equals("free")) {
				Static18.aBoolean52 = false;
			} else if (arg0[4].equals("members")) {
				Static18.aBoolean52 = true;
			} else {
				Static135.method2424();
			}
			if (arg0[5].equals("english")) {
				Static94.anInt2756 = 0;
			} else if (arg0[5].equals("german")) {
				Static47.method2339();
				Static16.aClass13_255 = Static4.aClass13_35;
				Static94.anInt2756 = 1;
			} else {
				Static135.method2424();
			}
			if (arg0[6].equals("game0")) {
				Static58.anInt1836 = 0;
			} else if (arg0[6].equals("game1")) {
				Static58.anInt1836 = 1;
			} else {
				Static135.method2424();
			}
			Static136.aString4 = "127.0.0.1";
			Static140.anInt3467 = 0;
			Static155.aClass13_1449 = Static16.aClass13_253;
			@Pc(178) client local178 = new client();
			local178.method801("runescape", Static178.anInt4014 + 32);
			Static97.aFrame106.setLocation(40, 40);
		} catch (@Pc(195) Exception local195) {
			Static154.method2661(null, local195);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	protected void method803() {
		Static187.anInt4125 = Static21.anInt787 == 0 ? 43594 : Static89.anInt2510 + 40000;
		Static73.anInt2093 = Static187.anInt4125;
		Static88.anInt2486 = Static21.anInt787 == 0 ? 443 : Static89.anInt2510 + 50000;
		if (Static58.anInt1836 == 1) {
			Static63.aShortArrayArray6 = Static15.aShortArrayArray2;
			Static160.aShortArray44 = Static31.aShortArray14;
			Static26.aShortArrayArray3 = Static6.aShortArrayArray1;
			Static12.aShortArray1 = Static133.aShortArray40;
		} else {
			Static63.aShortArrayArray6 = Static164.aShortArrayArray7;
			Static26.aShortArrayArray3 = Static151.aShortArrayArray8;
			Static12.aShortArray1 = Static89.aShortArray20;
			Static160.aShortArray44 = Static116.aShortArray31;
		}
		Static179.method2964();
		Static78.method1590(Static106.aCanvas1);
		Static109.method2128(Static106.aCanvas1);
		Static71.aClass19_1 = Static116.method2218();
		if (Static71.aClass19_1 != null) {
			Static71.aClass19_1.method2334(Static106.aCanvas1);
		}
		Static141.anInt3499 = Static36.anInt1197;
		try {
			if (Static163.aClass16_5.aClass70_2 != null) {
				Static14.aClass88_1 = new Class88(Static163.aClass16_5.aClass70_2, 5200, 0);
				for (@Pc(82) int local82 = 0; local82 < 16; local82++) {
					Static34.aClass88Array1[local82] = new Class88(Static163.aClass16_5.aClass70Array1[local82], 6000, 0);
				}
				Static178.aClass88_5 = new Class88(Static163.aClass16_5.aClass70_3, 6000, 0);
				Static165.aClass28_4 = new Class28(255, Static14.aClass88_1, Static178.aClass88_5, 500000);
				Static50.aClass88_2 = new Class88(Static163.aClass16_5.aClass70_1, 24, 0);
				Static163.aClass16_5.aClass70_2 = null;
				Static163.aClass16_5.aClass70Array1 = null;
				Static163.aClass16_5.aClass70_1 = null;
				Static163.aClass16_5.aClass70_3 = null;
			}
		} catch (@Pc(138) IOException local138) {
			Static178.aClass88_5 = null;
			Static50.aClass88_2 = null;
			Static14.aClass88_1 = null;
			Static165.aClass28_4 = null;
		}
		if (Static21.anInt787 != 0) {
			Static162.aBoolean293 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method800() {
		if (Static187.aClass26_1 != null) {
			Static187.aClass26_1.aBoolean148 = false;
		}
		Static187.aClass26_1 = null;
		if (Static96.aClass62_4 != null) {
			Static96.aClass62_4.method2277();
			Static96.aClass62_4 = null;
		}
		Static187.method3027();
		Static181.method2983();
		Static71.aClass19_1 = null;
		if (Static20.aClass53_1 != null) {
			Static20.aClass53_1.method3048();
		}
		if (Static22.aClass53_3 != null) {
			Static22.aClass53_3.method3048();
		}
		Static162.method2779();
		Static73.method1544();
		try {
			if (Static14.aClass88_1 != null) {
				Static14.aClass88_1.method2930();
			}
			if (Static34.aClass88Array1 != null) {
				for (@Pc(48) int local48 = 0; local48 < Static34.aClass88Array1.length; local48++) {
					if (Static34.aClass88Array1[local48] != null) {
						Static34.aClass88Array1[local48].method2930();
					}
				}
			}
			if (Static178.aClass88_5 != null) {
				Static178.aClass88_5.method2930();
			}
			if (Static50.aClass88_2 != null) {
				Static50.aClass88_2.method2930();
			}
		} catch (@Pc(76) IOException local76) {
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method792() {
		Static26.method809();
		Static30.method895();
		Static182.method794();
		Static161.method2972();
		Static151.method3037();
		Static61.method1408();
		Static78.method1593();
		Static22.method1613();
		Static123.method2284();
		Static122.method2273();
		Static175.method2924();
		Static65.method1438();
		Static15.method625();
		Static79.method1658();
		Static27.method812();
		Static49.method1226();
		Static90.method1891();
		Static167.method2859();
		Static95.method1983();
		Static47.method2335();
		Static82.method1707();
		Static118.method2229();
		Static155.method3038();
		Static86.method1824();
		Static16.method636();
		Static46.method1206();
		Static62.method1888();
		Static17.method656();
		Static163.method2803();
		Static173.method2919();
		Static97.method3060();
		Static142.method2532();
		Static124.method2288();
		Static99.method1992();
		Static72.method2710();
		Static130.method2341();
		Static153.method2621();
		Static184.method2990();
		Static48.method1222();
		Static119.method2233();
		Static70.method1462();
		Static98.method2708();
		Static18.method658();
		Static135.method2426();
		Static115.method2198();
		Static13.method510();
		Static50.method1245();
		Static105.method2061();
		Static96.method1989();
		Static68.method1456();
		Static55.method1321();
		Static83.method1776();
		Static169.method2885();
		Static133.method2389();
		Static104.method2060();
		Static7.method2258();
		Static154.method2646();
		Static140.method2508();
		Static183.method2989();
		Static4.method80();
		Static75.method1567();
		Static8.method303();
		Static144.method2549();
		Static164.method2807();
		Static156.method2674();
		Static109.method2131();
		Static126.method2306();
		Static117.method2223();
		Static69.method1459();
		Static128.method562();
		Static170.method2788();
		Static9.method355();
		Static89.method1863();
		Static172.method2910();
		Static138.method2475();
		Static148.method2595();
		Static59.method1374();
		Static81.method1699();
		Static150.method2613();
		Static129.method2332();
		Static131.method2380();
		Static134.method2406();
		Static41.method1072();
		Static158.method2730();
		Static45.method1186();
		Static14.method531();
		Static160.method2755();
		Static24.method767();
		Static137.method2456();
		Static102.method2038();
		Static177.method237();
		Static103.method2057();
		Static28.method844();
		Static57.method1347();
		Static149.method2599();
		Static21.method686();
		Static120.method2234();
		Static187.method3029();
		Static11.method450();
		Static108.method2113();
		Static53.method1294();
		Static113.method2189();
		Static178.method2944();
		Static19.method663();
		Static111.method2159();
		Static152.method2616();
		Static20.method680();
		Static35.method976();
		Static12.method460();
		Static157.method2692();
		Static85.method1818();
		Static37.method995();
		Static114.method2196();
		Static64.method1436();
		Static132.method2388();
		Static171.method2894();
		Static180.method2977();
		Static31.method934();
		Static23.method846();
		Static181.method2988();
		Static66.method1452();
		Static176.method2936();
		Static107.method2101();
		Static146.method2577();
		Static3.method74();
		Static100.method2000();
		Static88.method1854();
		Static6.method270();
		Static143.method2546();
		Static76.method1577();
		Static67.method1454();
		Static166.method2845();
		Static147.method2581();
		Static92.method1925();
		Static127.method2311();
		Static106.method2062();
		Static34.method956();
		Static32.method3016();
		Static38.method1003();
		Static185.method2998();
		Static33.method954();
		Static77.method1583();
		Static159.method2741();
		Static174.method1115();
		Static73.method1543();
		Static71.method1484();
		Static168.method2880();
		Static56.method1341();
		Static60.method1404();
		Static10.method443();
		Static87.method1846();
		Static29.method873();
		Static51.method1264();
		Static116.method2220();
		Static179.method2966();
		Static139.method2501();
		Static145.method2573();
		Static40.method1043();
		Static112.method2184();
		Static101.method2020();
		Static1.method44();
		Static94.method1979();
		Static42.method1119();
		Static39.method1024();
		Static44.method1169();
		Static74.method1563();
		Static5.method103();
		Static162.method2777();
		Static141.method2529();
		Static186.method3017();
		Static93.method1954();
		Static43.method1142();
		Static52.method1290();
		Static63.method1432();
		Static2.method68();
		Static91.method1916();
		Static84.method1797();
		Static58.method1370();
		Static54.method1314();
		Static165.method2829();
		Static110.method2152();
		Static80.method1683();
		Static25.method770();
		Static136.method2435();
		Static125.method2298();
		Static121.method2236();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	private void method806() {
		if (Static2.anInt97 != 1000) {
			@Pc(15) boolean local15 = Static41.method1064();
			if (!local15) {
				this.method807();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method807() {
		if (Static48.anInt1542 >= 4) {
			this.method790("js5crc");
			Static2.anInt97 = 1000;
			return;
		}
		if (Static30.anInt1095 >= 4) {
			if (Static2.anInt97 <= 5) {
				this.method790("js5io");
				Static2.anInt97 = 1000;
				return;
			}
			Static180.anInt4059 = 3000;
			Static30.anInt1095 = 3;
		}
		if (Static180.anInt4059-- > 0) {
			return;
		}
		try {
			if (Static129.anInt3272 == 0) {
				Static87.aClass32_5 = Static163.aClass16_5.method988(Static136.aString4, Static73.anInt2093);
				Static129.anInt3272++;
			}
			if (Static129.anInt3272 == 1) {
				if (Static87.aClass32_5.anInt1974 == 2) {
					this.method810(-1);
					return;
				}
				if (Static87.aClass32_5.anInt1974 == 1) {
					Static129.anInt3272++;
				}
			}
			if (Static129.anInt3272 == 2) {
				Static11.aClass62_1 = new Class62((Socket) Static87.aClass32_5.anObject2, Static163.aClass16_5);
				@Pc(106) Class1_Sub8 local106 = new Class1_Sub8(5);
				local106.method1643(15);
				local106.method1635(487);
				Static11.aClass62_1.method2281(5, local106.aByteArray27);
				Static129.anInt3272++;
				Static4.aLong6 = Static169.method2888();
			}
			if (Static129.anInt3272 == 3) {
				if (Static2.anInt97 <= 5 || Static11.aClass62_1.method2280() > 0) {
					@Pc(162) int local162 = Static11.aClass62_1.method2285();
					if (local162 != 0) {
						this.method810(local162);
						return;
					}
					Static129.anInt3272++;
				} else if (Static169.method2888() - Static4.aLong6 > 30000L) {
					this.method810(-2);
					return;
				}
			}
			if (Static129.anInt3272 == 4) {
				Static91.method1917(Static11.aClass62_1, Static2.anInt97 > 20);
				Static129.anInt3272 = 0;
				Static87.aClass32_5 = null;
				Static132.anInt3341 = 0;
				Static11.aClass62_1 = null;
			}
		} catch (@Pc(199) IOException local199) {
			this.method810(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method798() {
		@Pc(8) boolean local8 = Static126.method2303();
		if (local8 && Static162.aBoolean294 && Static20.aClass53_1 != null) {
			Static20.aClass53_1.method3052();
		}
		if (Static24.aBoolean57) {
			Static43.method1146(Static106.aCanvas1);
			Static179.method2968(Static106.aCanvas1);
			if (Static71.aClass19_1 != null) {
				Static71.aClass19_1.method2338(Static106.aCanvas1);
			}
			this.method802();
			Static78.method1590(Static106.aCanvas1);
			Static109.method2128(Static106.aCanvas1);
			if (Static71.aClass19_1 != null) {
				Static71.aClass19_1.method2334(Static106.aCanvas1);
			}
		}
		if (Static2.anInt97 == 0) {
			Static38.method1002(Static157.anInt3722, Static122.aClass13_1060, null);
		} else if (Static2.anInt97 == 5) {
			Static148.method2597(Static110.aClass1_Sub2_Sub1_Sub1_Sub1_6, Static12.aClass1_Sub2_Sub1_Sub1_Sub1_2);
		} else if (Static2.anInt97 == 10) {
			Static148.method2597(Static110.aClass1_Sub2_Sub1_Sub1_Sub1_6, Static12.aClass1_Sub2_Sub1_Sub1_Sub1_2);
		} else if (Static2.anInt97 == 20) {
			Static148.method2597(Static110.aClass1_Sub2_Sub1_Sub1_Sub1_6, Static12.aClass1_Sub2_Sub1_Sub1_Sub1_2);
		} else if (Static2.anInt97 == 25) {
			@Pc(143) int local143;
			if (Static102.anInt2853 == 1) {
				if (Static17.anInt726 < Static27.anInt979) {
					Static17.anInt726 = Static27.anInt979;
				}
				local143 = (Static17.anInt726 - Static27.anInt979) * 50 / Static17.anInt726;
				Static144.method2550(Static57.method1349(new Class13[] { Static153.aClass13_1250, Static161.aClass13_1399, Static3.method75(local143), Static16.aClass13_256 }), false);
			} else if (Static102.anInt2853 == 2) {
				if (Static22.anInt2237 > Static8.anInt287) {
					Static8.anInt287 = Static22.anInt2237;
				}
				local143 = (Static8.anInt287 - Static22.anInt2237) * 50 / Static8.anInt287 + 50;
				Static144.method2550(Static57.method1349(new Class13[] { Static153.aClass13_1250, Static161.aClass13_1399, Static3.method75(local143), Static16.aClass13_256 }), false);
			} else {
				Static144.method2550(Static153.aClass13_1250, false);
			}
		} else if (Static2.anInt97 == 30) {
			Static131.method2379();
		} else if (Static2.anInt97 == 40) {
			Static144.method2550(Static57.method1349(new Class13[] { Static25.aClass13_309, Static170.aClass13_1318, Static186.aClass13_1429 }), false);
		}
		@Pc(266) int local266;
		@Pc(256) Graphics local256;
		if (Static2.anInt97 == 30 && Static139.anInt3458 == 0 && !Static14.aBoolean44) {
			try {
				local256 = Static106.aCanvas1.getGraphics();
				for (local266 = 0; local266 < Static125.anInt3241; local266++) {
					if (Static28.aBooleanArray19[local266]) {
						Static85.aClass14_1.method3031(Static132.anIntArray330[local266], Static26.anIntArray111[local266], Static123.anIntArray308[local266], local256, Static181.anIntArray448[local266]);
						Static28.aBooleanArray19[local266] = false;
					}
				}
			} catch (@Pc(322) Exception local322) {
				Static106.aCanvas1.repaint();
			}
		} else if (Static2.anInt97 > 0) {
			try {
				local256 = Static106.aCanvas1.getGraphics();
				Static85.aClass14_1.method3032(local256);
				Static14.aBoolean44 = false;
				for (local266 = 0; local266 < Static125.anInt3241; local266++) {
					Static28.aBooleanArray19[local266] = false;
				}
			} catch (@Pc(278) Exception local278) {
				Static106.aCanvas1.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method796() {
		Static78.anInt2168++;
		if (Static78.anInt2168 % 1000 == 1) {
			@Pc(25) GregorianCalendar local25 = new GregorianCalendar();
			Static65.anInt1932 = local25.get(11) * 600 + local25.get(12) * 10 + local25.get(13) / 6;
			Static155.aRandom3.setSeed((long) Static65.anInt1932);
		}
		this.method806();
		Static27.method811();
		Static32.method3014();
		Static131.method2376();
		Static119.method2231();
		Static60.method1403();
		if (Static71.aClass19_1 != null) {
			@Pc(67) int local67 = Static71.aClass19_1.method2337();
			Static148.anInt3599 = local67;
		}
		if (Static2.anInt97 == 0) {
			Static175.method2933();
			Static49.method1235();
		} else if (Static2.anInt97 == 5) {
			Static70.method1465(this);
			Static175.method2933();
			Static49.method1235();
		} else if (Static2.anInt97 == 10) {
			Static70.method1465(this);
		} else if (Static2.anInt97 == 20) {
			Static70.method1465(this);
			Static103.method2054();
		} else if (Static2.anInt97 == 25) {
			Static61.method1409();
		}
		if (Static2.anInt97 == 30) {
			Static70.method1463();
		} else if (Static2.anInt97 == 40) {
			Static103.method2054();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method788()) {
			return;
		}
		Static89.anInt2510 = Integer.parseInt(this.getParameter("worldid"));
		Static178.anInt4014 = Integer.parseInt(this.getParameter("modewhat"));
		Static21.anInt787 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static93.method1955();
		} else {
			Static89.method1865();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static18.aBoolean52 = true;
		} else {
			Static18.aBoolean52 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static47.method2339();
			Static16.aClass13_255 = Static4.aClass13_35;
			Static94.anInt2756 = 1;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static58.anInt1836 = 1;
		} else {
			Static58.anInt1836 = 0;
		}
		try {
			Static1.anInt63 = Integer.parseInt(this.getParameter("js"));
			Static159.anInt3758 = Integer.parseInt(this.getParameter("plug"));
			Static140.anInt3467 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(106) Exception local106) {
		}
		Static155.aClass13_1449 = Static15.aClass13_250.method909(this);
		if (Static155.aClass13_1449 == null) {
			Static155.aClass13_1449 = Static16.aClass13_253;
		}
		Static136.aString4 = this.getCodeBase().getHost();
		this.method789(Static178.anInt4014 + 32);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V")
	private void method810(@OriginalArg(1) int arg0) {
		if (Static187.anInt4125 == Static73.anInt2093) {
			Static73.anInt2093 = Static88.anInt2486;
		} else {
			Static73.anInt2093 = Static187.anInt4125;
		}
		Static87.aClass32_5 = null;
		Static132.anInt3341++;
		Static129.anInt3272 = 0;
		Static11.aClass62_1 = null;
		if (Static132.anInt3341 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static2.anInt97 > 5) {
				Static180.anInt4059 = 3000;
			} else {
				this.method790("js5connect_full");
				Static2.anInt97 = 1000;
			}
		} else if (Static132.anInt3341 >= 2 && arg0 == 6) {
			this.method790("js5connect_outofdate");
			Static2.anInt97 = 1000;
		} else if (Static132.anInt3341 >= 4) {
			if (Static2.anInt97 > 5) {
				Static180.anInt4059 = 3000;
			} else {
				this.method790("js5connect");
				Static2.anInt97 = 1000;
			}
		}
	}
}
