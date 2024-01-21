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
				Static84.method1490();
			}
			Static97.anInt2448 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static158.anInt3499 = 0;
			} else if (arg0[1].equals("office")) {
				Static158.anInt3499 = 1;
			} else if (arg0[1].equals("local")) {
				Static158.anInt3499 = 2;
			} else {
				Static84.method1490();
			}
			if (arg0[2].equals("live")) {
				Static88.anInt2254 = 0;
			} else if (arg0[2].equals("rc")) {
				Static88.anInt2254 = 1;
			} else if (arg0[2].equals("wip")) {
				Static88.anInt2254 = 2;
			} else {
				Static84.method1490();
			}
			if (arg0[3].equals("lowmem")) {
				Static31.method2860();
			} else if (arg0[3].equals("highmem")) {
				Static6.method228();
			} else {
				Static84.method1490();
			}
			if (arg0[4].equals("free")) {
				Static51.aBoolean96 = false;
			} else if (arg0[4].equals("members")) {
				Static51.aBoolean96 = true;
			} else {
				Static84.method1490();
			}
			if (arg0[5].equals("english")) {
				Static22.anInt739 = 0;
			} else if (arg0[5].equals("german")) {
				Static114.method1902();
				Static22.anInt739 = 1;
				Static136.aClass28_1829 = Static27.aClass28_1659;
			} else {
				Static84.method1490();
			}
			if (arg0[6].equals("game0")) {
				Static51.anInt1940 = 0;
			} else if (arg0[6].equals("game1")) {
				Static51.anInt1940 = 1;
			} else {
				Static84.method1490();
			}
			Static79.aString2 = "127.0.0.1";
			@Pc(176) client local176 = new client();
			local176.method622("runescape", Static88.anInt2254 + 32);
			Static138.aFrame1.setLocation(40, 40);
		} catch (@Pc(194) Exception local194) {
			Static178.method2785(null, local194);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method614() {
		@Pc(13) boolean local13 = Static19.method619();
		if (local13 && Static148.aBoolean151 && Static165.aClass21_2 != null) {
			Static165.aClass21_2.method1342();
		}
		if (Static24.aBoolean23) {
			Static159.method2885(Static49.aCanvas1);
			Static31.method2859(Static49.aCanvas1);
			if (Static181.aClass13_1 != null) {
				Static181.aClass13_1.method1955(Static49.aCanvas1);
			}
			this.method623();
			Static180.method2867(Static49.aCanvas1);
			Static149.method2327(Static49.aCanvas1);
			if (Static181.aClass13_1 != null) {
				Static181.aClass13_1.method1952(Static49.aCanvas1);
			}
		}
		if (Static124.anInt2924 == 0) {
			Static50.method937(Static138.aClass28_1857, null, Static107.anInt2609);
		} else if (Static124.anInt2924 == 5) {
			Static93.method1633(Static165.aClass2_Sub4_Sub3_Sub2_Sub1_5, Static29.aClass2_Sub4_Sub3_Sub2_Sub1_2);
		} else if (Static124.anInt2924 == 10) {
			Static93.method1633(Static165.aClass2_Sub4_Sub3_Sub2_Sub1_5, Static29.aClass2_Sub4_Sub3_Sub2_Sub1_2);
		} else if (Static124.anInt2924 == 20) {
			Static93.method1633(Static165.aClass2_Sub4_Sub3_Sub2_Sub1_5, Static29.aClass2_Sub4_Sub3_Sub2_Sub1_2);
		} else if (Static124.anInt2924 == 25) {
			@Pc(120) int local120;
			if (Static26.anInt817 == 1) {
				if (Static129.anInt3028 > Static99.anInt2491) {
					Static99.anInt2491 = Static129.anInt3028;
				}
				local120 = (Static99.anInt2491 - Static129.anInt3028) * 50 / Static99.anInt2491;
				Static59.method1061(false, Static83.method1481(new Class28[] { Static11.aClass28_367, Static4.aClass28_65, Static158.method2411(local120), Static14.aClass28_413 }));
			} else if (Static26.anInt817 == 2) {
				if (Static3.anInt2407 < Static14.anInt601) {
					Static3.anInt2407 = Static14.anInt601;
				}
				local120 = (Static3.anInt2407 - Static14.anInt601) * 50 / Static3.anInt2407 + 50;
				Static59.method1061(false, Static83.method1481(new Class28[] { Static11.aClass28_367, Static4.aClass28_65, Static158.method2411(local120), Static14.aClass28_413 }));
			} else {
				Static59.method1061(false, Static11.aClass28_367);
			}
		} else if (Static124.anInt2924 == 30) {
			Static22.method473();
		} else if (Static124.anInt2924 == 40) {
			Static59.method1061(false, Static83.method1481(new Class28[] { Static122.aClass28_1713, Static132.aClass28_1819, Static179.aClass28_2428 }));
		}
		@Pc(241) int local241;
		@Pc(239) Graphics local239;
		if (Static124.anInt2924 == 30 && Static12.anInt554 == 0 && !Static116.aBoolean128) {
			try {
				local239 = Static49.aCanvas1.getGraphics();
				for (local241 = 0; local241 < Static179.anInt4042; local241++) {
					if (Static59.aBooleanArray11[local241]) {
						Static62.aClass8_1.method2591(Static27.anIntArray264[local241], Static101.anIntArray29[local241], Static90.anIntArray221[local241], Static91.anIntArray223[local241], local239);
						Static59.aBooleanArray11[local241] = false;
					}
				}
			} catch (@Pc(273) Exception local273) {
				Static49.aCanvas1.repaint();
			}
		} else if (Static124.anInt2924 > 0) {
			try {
				local239 = Static49.aCanvas1.getGraphics();
				Static62.aClass8_1.method2590(local239);
				Static116.aBoolean128 = false;
				for (local241 = 0; local241 < Static179.anInt4042; local241++) {
					Static59.aBooleanArray11[local241] = false;
				}
			} catch (@Pc(306) Exception local306) {
				Static49.aCanvas1.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method625() {
		if (Static105.aClass83_1 != null) {
			Static105.aClass83_1.aBoolean164 = false;
		}
		Static105.aClass83_1 = null;
		if (Static155.aClass22_4 != null) {
			Static155.aClass22_4.method962();
			Static155.aClass22_4 = null;
		}
		Static151.method2335();
		Static179.method2876();
		Static181.aClass13_1 = null;
		if (Static165.aClass21_2 != null) {
			Static165.aClass21_2.method1348();
		}
		if (Static120.aClass21_1 != null) {
			Static120.aClass21_1.method1348();
		}
		Static34.method654();
		Static96.method1715();
		try {
			if (Static77.aClass5_3 != null) {
				Static77.aClass5_3.method398();
			}
			if (Static62.aClass5Array1 != null) {
				for (@Pc(53) int local53 = 0; local53 < Static62.aClass5Array1.length; local53++) {
					if (Static62.aClass5Array1[local53] != null) {
						Static62.aClass5Array1[local53].method398();
					}
				}
			}
			if (Static158.aClass5_4 != null) {
				Static158.aClass5_4.method398();
			}
			if (Static162.aClass5_5 != null) {
				Static162.aClass5_5.method398();
			}
		} catch (@Pc(81) IOException local81) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method613() {
		Static30.method629();
		Static62.method1120();
		Static19.method618();
		Static1.method2039();
		Static18.method2594();
		Static169.method2650();
		Static3.method1672();
		Static52.method970();
		Static102.method1798();
		Static14.method389();
		Static69.method1280();
		Static6.method226();
		Static96.method1712();
		Static76.method1376();
		Static54.method989();
		Static61.method1102();
		Static133.method2114();
		Static75.method1357();
		Static27.method1956();
		Static71.method1302();
		Static130.method2085();
		Static51.method1344();
		Static128.method2073();
		Static16.method408();
		Static9.method314();
		Static47.method1095();
		Static112.method1890();
		Static28.method586();
		Static120.method1976();
		Static159.method2887();
		Static111.method1884();
		Static77.method1383();
		Static29.method602();
		Static37.method1202();
		Static157.method2409();
		Static36.method665();
		Static173.method2695();
		Static89.method1594();
		Static91.method1621();
		Static110.method1872();
		Static31.method2855();
		Static107.method1836();
		Static100.method1766();
		Static42.method741();
		Static86.method1545();
		Static137.method2145();
		Static144.method2256();
		Static57.method1031();
		Static150.method2330();
		Static123.method2012();
		Static92.method1622();
		Static177.method2754();
		Static74.method1353();
		Static39.method721();
		Static81.method1768();
		Static43.method787();
		Static80.method1437();
		Static95.method1645();
		Static158.method2413();
		Static67.method1220();
		Static122.method2004();
		Static114.method1900();
		Static156.method2406();
		Static10.method324();
		Static103.method1809();
		Static40.method724();
		Static146.method2286();
		Static98.method1725();
		Static161.method2810();
		Static118.method2852();
		Static25.method554();
		Static113.method1896();
		Static7.method238();
		Static139.method2187();
		Static88.method1578();
		Static149.method2325();
		Static50.method943();
		Static176.method2745();
		Static166.method2589();
		Static38.method704();
		Static87.method1570();
		Static65.method1211();
		Static34.method656();
		Static46.method890();
		Static70.method1297();
		Static125.method2035();
		Static148.method2322();
		Static48.method904();
		Static68.method2449();
		Static171.method2669();
		Static55.method1002();
		Static124.method2015();
		Static22.method474();
		Static142.method2252();
		Static136.method2142();
		Static84.method1489();
		Static15.method404();
		Static108.method1849();
		Static58.method1033();
		Static153.method2365();
		Static119.method1968();
		Static135.method2136();
		Static117.method1962();
		Static106.method1833();
		Static180.method2866();
		Static21.method472();
		Static83.method1480();
		Static104.method1827();
		Static41.method738();
		Static64.method1170();
		Static94.method1639();
		Static175.method2733();
		Static160.method2419();
		Static141.method2244();
		Static126.method2045();
		Static26.method567();
		Static179.method2883();
		Static23.method479();
		Static66.method1216();
		Static44.method801();
		Static60.method1078();
		Static20.method455();
		Static105.method1831();
		Static143.method2255();
		Static132.method2111();
		Static154.method2377();
		Static35.method664();
		Static32.method635();
		Static151.method2334();
		Static12.method358();
		Static17.method422();
		Static2.method24();
		Static53.method976();
		Static33.method645();
		Static82.method1471();
		Static170.method2895();
		Static93.method1630();
		Static97.method1722();
		Static162.method2498();
		Static24.method484();
		Static72.method1308();
		Static101.method293();
		Static167.method2621();
		Static178.method2783();
		Static63.method1165();
		Static49.method927();
		Static127.method2067();
		Static165.method2569();
		Static152.method2362();
		Static168.method2646();
		Static78.method1407();
		Static85.method1511();
		Static181.method2908();
		Static13.method384();
		Static163.method2523();
		Static174.method2720();
		Static155.method2399();
		Static56.method1026();
		Static121.method1998();
		Static73.method1334();
		Static8.method296();
		Static140.method2210();
		Static59.method1058();
		Static45.method877();
		Static145.method2277();
		Static90.method1618();
		Static172.method2692();
		Static164.method2548();
		Static131.method2108();
		Static5.method155();
		Static115.method1924();
		Static138.method2171();
		Static99.method1764();
		Static4.method129();
		Static147.method2309();
		Static79.method1433();
		Static11.method348();
		Static116.method1947();
		Static109.method1858();
		Static129.method2081();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method628(@OriginalArg(1) int arg0) {
		Static117.aClass41_4 = null;
		Static148.anInt3353 = 0;
		if (Static167.anInt3751 == Static151.anInt3389) {
			Static167.anInt3751 = Static180.anInt4033;
		} else {
			Static167.anInt3751 = Static151.anInt3389;
		}
		Static28.aClass22_2 = null;
		Static10.anInt498++;
		if (Static10.anInt498 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static124.anInt2924 <= 5) {
				this.method610("js5connect_full");
				Static124.anInt2924 = 1000;
			} else {
				Static23.anInt749 = 3000;
			}
		} else if (Static10.anInt498 >= 2 && arg0 == 6) {
			this.method610("js5connect_outofdate");
			Static124.anInt2924 = 1000;
		} else if (Static10.anInt498 >= 4) {
			if (Static124.anInt2924 <= 5) {
				this.method610("js5connect");
				Static124.anInt2924 = 1000;
			} else {
				Static23.anInt749 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method627() {
		Static156.anInt3491++;
		if (Static156.anInt3491 % 1000 == 1) {
			@Pc(14) GregorianCalendar local14 = new GregorianCalendar();
			Static43.anInt1123 = local14.get(11) * 600 + local14.get(12) * 10 + local14.get(13) / 6;
			Static109.aRandom1.setSeed((long) Static43.anInt1123);
		}
		this.method632();
		Static153.method2366();
		Static173.method2697();
		Static177.method2757();
		Static18.method2596();
		Static98.method1723();
		if (Static181.aClass13_1 != null) {
			@Pc(67) int local67 = Static181.aClass13_1.method1950();
			Static148.anInt3354 = local67;
		}
		if (Static124.anInt2924 == 0) {
			Static173.method2696();
			Static129.method2082();
		} else if (Static124.anInt2924 == 5) {
			Static48.method903(this);
			Static173.method2696();
			Static129.method2082();
		} else if (Static124.anInt2924 == 10) {
			Static48.method903(this);
		} else if (Static124.anInt2924 == 20) {
			Static48.method903(this);
			Static77.method1381();
		} else if (Static124.anInt2924 == 25) {
			Static61.method1104();
		}
		if (Static124.anInt2924 == 30) {
			Static128.method2074();
		} else if (Static124.anInt2924 == 40) {
			Static77.method1381();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method616()) {
			return;
		}
		Static97.anInt2448 = Integer.parseInt(this.getParameter("worldid"));
		Static88.anInt2254 = Integer.parseInt(this.getParameter("modewhat"));
		Static158.anInt3499 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static31.method2860();
		} else {
			Static6.method228();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static51.aBoolean96 = true;
		} else {
			Static51.aBoolean96 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static114.method1902();
			Static22.anInt739 = 1;
			Static136.aClass28_1829 = Static27.aClass28_1659;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static51.anInt1940 = 1;
		} else {
			Static51.anInt1940 = 0;
		}
		try {
			Static85.anInt2162 = Integer.parseInt(this.getParameter("js"));
			Static58.anInt1513 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(101) Exception local101) {
		}
		Static79.aString2 = this.getCodeBase().getHost();
		this.method612(Static88.anInt2254 + 32);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method631() {
		if (Static100.anInt2510 >= 4) {
			this.method610("js5crc");
			Static124.anInt2924 = 1000;
			return;
		}
		if (Static157.anInt3497 >= 4) {
			if (Static124.anInt2924 <= 5) {
				this.method610("js5io");
				Static124.anInt2924 = 1000;
				return;
			}
			Static157.anInt3497 = 3;
			Static23.anInt749 = 3000;
		}
		if (Static23.anInt749-- > 0) {
			return;
		}
		try {
			if (Static148.anInt3353 == 0) {
				Static117.aClass41_4 = Static76.aClass66_2.method2129(Static167.anInt3751, Static79.aString2);
				Static148.anInt3353++;
			}
			if (Static148.anInt3353 == 1) {
				if (Static117.aClass41_4.anInt2096 == 2) {
					this.method628(-1);
					return;
				}
				if (Static117.aClass41_4.anInt2096 == 1) {
					Static148.anInt3353++;
				}
			}
			if (Static148.anInt3353 == 2) {
				Static28.aClass22_2 = new Class22((Socket) Static117.aClass41_4.anObject2, Static76.aClass66_2);
				@Pc(101) Class2_Sub2 local101 = new Class2_Sub2(5);
				local101.method1700(15);
				local101.method1710(480);
				Static28.aClass22_2.method965(5, local101.aByteArray35);
				Static148.anInt3353++;
				Static142.aLong120 = Static177.method2758();
			}
			if (Static148.anInt3353 == 3) {
				if (Static124.anInt2924 <= 5 || Static28.aClass22_2.method963() > 0) {
					@Pc(143) int local143 = Static28.aClass22_2.method969();
					if (local143 != 0) {
						this.method628(local143);
						return;
					}
					Static148.anInt3353++;
				} else if (Static177.method2758() - Static142.aLong120 > 30000L) {
					this.method628(-2);
					return;
				}
			}
			if (Static148.anInt3353 == 4) {
				Static147.method2310(Static28.aClass22_2, Static124.anInt2924 > 20);
				Static10.anInt498 = 0;
				Static117.aClass41_4 = null;
				Static28.aClass22_2 = null;
				Static148.anInt3353 = 0;
			}
		} catch (@Pc(196) IOException local196) {
			this.method628(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method626() {
		Static151.anInt3389 = Static158.anInt3499 == 0 ? 43594 : Static97.anInt2448 + 40000;
		if (Static51.anInt1940 == 1) {
			Static64.aShortArray17 = Static18.aShortArray40;
			Static69.aShortArrayArray5 = Static57.aShortArrayArray4;
			Static36.aShortArrayArray2 = Static52.aShortArrayArray3;
			Static157.aShortArray35 = Static13.aShortArray1;
		} else {
			Static157.aShortArray35 = Static114.aShortArray32;
			Static64.aShortArray17 = Static152.aShortArray34;
			Static36.aShortArrayArray2 = Static126.aShortArrayArray6;
			Static69.aShortArrayArray5 = Static26.aShortArrayArray1;
		}
		Static180.anInt4033 = Static158.anInt3499 == 0 ? 443 : Static97.anInt2448 + 50000;
		Static167.anInt3751 = Static151.anInt3389;
		Static176.method2741();
		Static180.method2867(Static49.aCanvas1);
		Static149.method2327(Static49.aCanvas1);
		Static181.aClass13_1 = Static26.method563();
		if (Static181.aClass13_1 != null) {
			Static181.aClass13_1.method1952(Static49.aCanvas1);
		}
		Static145.anInt3286 = Static134.anInt3096;
		try {
			if (Static76.aClass66_2.aClass87_2 != null) {
				Static77.aClass5_3 = new Class5(Static76.aClass66_2.aClass87_2, 5200, 0);
				for (@Pc(79) int local79 = 0; local79 < 16; local79++) {
					Static62.aClass5Array1[local79] = new Class5(Static76.aClass66_2.aClass87Array1[local79], 6000, 0);
				}
				Static158.aClass5_4 = new Class5(Static76.aClass66_2.aClass87_3, 6000, 0);
				Static22.aClass32_1 = new Class32(255, Static77.aClass5_3, Static158.aClass5_4, 500000);
				Static162.aClass5_5 = new Class5(Static76.aClass66_2.aClass87_4, 24, 0);
				Static76.aClass66_2.aClass87_2 = null;
				Static76.aClass66_2.aClass87Array1 = null;
				Static76.aClass66_2.aClass87_3 = null;
				Static76.aClass66_2.aClass87_4 = null;
			}
		} catch (@Pc(137) IOException local137) {
			Static158.aClass5_4 = null;
			Static22.aClass32_1 = null;
			Static77.aClass5_3 = null;
			Static162.aClass5_5 = null;
		}
		if (Static158.anInt3499 != 0) {
			Static171.aBoolean166 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method632() {
		if (Static124.anInt2924 != 1000) {
			@Pc(17) boolean local17 = Static151.method2337();
			if (!local17) {
				this.method631();
			}
		}
	}
}
