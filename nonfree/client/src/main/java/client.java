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
				Static107.method1728();
			}
			Static12.anInt363 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static174.anInt3740 = 0;
			} else if (arg0[1].equals("office")) {
				Static174.anInt3740 = 1;
			} else if (arg0[1].equals("local")) {
				Static174.anInt3740 = 2;
			} else {
				Static107.method1728();
			}
			if (arg0[2].equals("live")) {
				Static61.anInt3639 = 0;
			} else if (arg0[2].equals("rc")) {
				Static61.anInt3639 = 1;
			} else if (arg0[2].equals("wip")) {
				Static61.anInt3639 = 2;
			} else {
				Static107.method1728();
			}
			if (arg0[3].equals("lowmem")) {
				Static140.method2219();
			} else if (arg0[3].equals("highmem")) {
				Static60.method1098();
			} else {
				Static107.method1728();
			}
			if (arg0[4].equals("free")) {
				Static165.aBoolean157 = false;
			} else if (arg0[4].equals("members")) {
				Static165.aBoolean157 = true;
			} else {
				Static107.method1728();
			}
			if (arg0[5].equals("english")) {
				Static130.anInt2891 = 0;
			} else if (arg0[5].equals("german")) {
				Static44.method849();
				Static63.aClass10_684 = Static11.aClass10_1513;
				Static130.anInt2891 = 1;
			} else {
				Static107.method1728();
			}
			if (arg0[6].equals("game0")) {
				Static86.anInt1946 = 0;
			} else if (arg0[6].equals("game1")) {
				Static86.anInt1946 = 1;
			} else {
				Static107.method1728();
			}
			Static87.aString1 = "127.0.0.1";
			@Pc(180) client local180 = new client();
			local180.method583("runescape", Static61.anInt3639 + 32);
			Static11.aFrame3.setLocation(40, 40);
		} catch (@Pc(198) Exception local198) {
			Static165.method2525(null, local198);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method579() {
		Static26.method587();
		Static22.method330();
		Static78.method585();
		Static145.method1881();
		Static74.method2104();
		Static176.method2696();
		Static167.method1477();
		Static65.method1133();
		Static55.method1048();
		Static48.method888();
		Static165.method2524();
		Static162.method2470();
		Static87.method1493();
		Static113.method1791();
		Static51.method945();
		Static44.method840();
		Static54.method984();
		Static24.method383();
		Static34.method678();
		Static96.method2625();
		Static120.method1933();
		Static39.method785();
		Static171.method2634();
		Static27.method599();
		Static146.method2274();
		Static85.method1364();
		Static11.method2462();
		Static135.method2148();
		Static4.method52();
		Static104.method1690();
		Static147.method2708();
		Static148.method2279();
		Static62.method1105();
		Static144.method2265();
		Static17.method812();
		Static166.method2548();
		Static64.method1126();
		Static160.method2427();
		Static47.method880();
		Static154.method2384();
		Static86.method1371();
		Static114.method1830();
		Static150.method2545();
		Static143.method2251();
		Static159.method2423();
		Static89.method1500();
		Static33.method675();
		Static127.method2071();
		Static59.method1077();
		Static178.method2704();
		Static170.method2618();
		Static175.method2695();
		Static29.method617();
		Static130.method2084();
		Static95.method1589();
		Static88.method1035();
		Static174.method2658();
		Static46.method872();
		Static138.method2179();
		Static10.method172();
		Static20.method327();
		Static21.method328();
		Static66.method1138();
		Static77.method1270();
		Static52.method949();
		Static100.method1658();
		Static40.method788();
		Static101.method1662();
		Static9.method167();
		Static172.method2025();
		Static102.method2538();
		Static125.method2035();
		Static38.method779();
		Static84.method1332();
		Static30.method641();
		Static13.method216();
		Static41.method792();
		Static141.method2232();
		Static79.method1282();
		Static139.method2199();
		Static94.method1579();
		Static60.method1102();
		Static2.method30();
		Static28.method609();
		Static133.method2121();
		Static142.method2246();
		Static119.method1920();
		Static115.method1845();
		Static35.method511();
		Static16.method265();
		Static68.method1159();
		Static69.method1166();
		Static132.method2109();
		Static3.method35();
		Static163.method2473();
		Static169.method2596();
		Static136.method2156();
		Static164.method2487();
		Static56.method1050();
		Static156.method2400();
		Static129.method2078();
		Static108.method1731();
		Static110.method1755();
		Static43.method838();
		Static42.method830();
		Static80.method1305();
		Static5.method86();
		Static53.method957();
		Static49.method910();
		Static106.method1723();
		Static97.method1606();
		Static1.method3();
		Static177.method2699();
		Static93.method1563();
		Static116.method1885();
		Static75.method1257();
		Static67.method2102();
		Static157.method2403();
		Static14.method223();
		Static111.method1763();
		Static81.method1310();
		Static173.method2646();
		Static23.method372();
		Static128.method2072();
		Static82.method1311();
		Static58.method1074();
		Static19.method326();
		Static31.method652();
		Static107.method1729();
		Static37.method773();
		Static131.method2085();
		Static112.method1774();
		Static153.method2373();
		Static76.method1262();
		Static180.method2713();
		Static61.method2577();
		Static155.method2391();
		Static72.method1223();
		Static32.method672();
		Static118.method1909();
		Static149.method2292();
		Static45.method869();
		Static7.method136();
		Static161.method2446();
		Static71.method1206();
		Static126.method2064();
		Static70.method1189();
		Static18.method319();
		Static25.method550();
		Static121.method1952();
		Static36.method760();
		Static99.method1645();
		Static98.method1626();
		Static57.method1066();
		Static109.method1750();
		Static137.method2176();
		Static73.method1241();
		Static8.method162();
		Static15.method244();
		Static124.method1998();
		Static105.method1707();
		Static158.method2422();
		Static6.method118();
		Static12.method210();
		Static83.method1327();
		Static123.method1981();
		Static92.method1562();
		Static91.method1542();
		Static168.method2586();
		Static50.method928();
		Static63.method1123();
		Static103.method1680();
		Static117.method1902();
		Static134.method2140();
		Static90.method1526();
		Static152.method2367();
		Static140.method2217();
		Static179.method2710();
		Static151.method2300();
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method581()) {
			return;
		}
		Static12.anInt363 = Integer.parseInt(this.getParameter("worldid"));
		Static61.anInt3639 = Integer.parseInt(this.getParameter("modewhat"));
		Static174.anInt3740 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static140.method2219();
		} else {
			Static60.method1098();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static165.aBoolean157 = true;
		} else {
			Static165.aBoolean157 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static44.method849();
			Static130.anInt2891 = 1;
			Static63.aClass10_684 = Static11.aClass10_1513;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static86.anInt1946 = 1;
		} else {
			Static86.anInt1946 = 0;
		}
		try {
			Static65.anInt1580 = Integer.parseInt(this.getParameter("js"));
			Static111.anInt2520 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(101) Exception local101) {
		}
		Static87.aString1 = this.getCodeBase().getHost();
		this.method571(Static61.anInt3639 + 32);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method589(@OriginalArg(0) int arg0) {
		if (Static63.anInt1563 == Static159.anInt3394) {
			Static159.anInt3394 = Static103.anInt2370;
		} else {
			Static159.anInt3394 = Static63.anInt1563;
		}
		Static11.anInt3504++;
		Static40.aClass34_1 = null;
		Static38.aClass15_3 = null;
		Static109.anInt2491 = 0;
		if (Static11.anInt3504 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static49.anInt1185 > 5) {
				Static21.anInt505 = 3000;
			} else {
				this.method573("js5connect_full");
				Static49.anInt1185 = 1000;
			}
		} else if (Static11.anInt3504 >= 2 && arg0 == 6) {
			this.method573("js5connect_outofdate");
			Static49.anInt1185 = 1000;
		} else if (Static11.anInt3504 >= 4) {
			if (Static49.anInt1185 > 5) {
				Static21.anInt505 = 3000;
			} else {
				this.method573("js5connect");
				Static49.anInt1185 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method591() {
		if (Static49.anInt1185 != 1000) {
			@Pc(10) boolean local10 = Static4.method56();
			if (!local10) {
				this.method593();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method586() {
		Static14.anInt386++;
		if (Static14.anInt386 % 1000 == 1) {
			@Pc(14) GregorianCalendar local14 = new GregorianCalendar();
			Static70.anInt1660 = local14.get(11) * 600 + local14.get(12) * 10 + local14.get(13) / 6;
			Static175.aRandom1.setSeed((long) Static70.anInt1660);
		}
		this.method591();
		Static118.method1910();
		Static38.method783();
		Static155.method2390();
		Static18.method317();
		Static155.method2392();
		if (Static145.aClass52_3 != null) {
			@Pc(66) int local66 = Static145.aClass52_3.method2626();
			Static81.anInt1877 = local66;
		}
		if (Static49.anInt1185 == 0) {
			Static120.method1934();
			Static14.method226();
		} else if (Static49.anInt1185 == 5) {
			Static118.method1903(this);
			Static120.method1934();
			Static14.method226();
		} else if (Static49.anInt1185 == 10) {
			Static118.method1903(this);
		} else if (Static49.anInt1185 == 20) {
			Static118.method1903(this);
			Static26.method588();
		} else if (Static49.anInt1185 == 25) {
			Static168.method2587();
		}
		if (Static49.anInt1185 == 30) {
			Static115.method1841();
		} else if (Static49.anInt1185 == 40) {
			Static26.method588();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method584() {
		Static63.anInt1563 = Static174.anInt3740 == 0 ? 43594 : Static12.anInt363 + 40000;
		Static159.anInt3394 = Static63.anInt1563;
		if (Static86.anInt1946 == 1) {
			Static135.aShortArray23 = Static7.aShortArray5;
			Static136.aShortArray24 = Static81.aShortArray17;
			Static58.aShortArrayArray40 = Static106.aShortArrayArray69;
			Static147.aShortArrayArray107 = Static53.aShortArrayArray36;
		} else {
			Static136.aShortArray24 = Static162.aShortArray29;
			Static135.aShortArray23 = Static48.aShortArray12;
			Static58.aShortArrayArray40 = Static8.aShortArrayArray11;
			Static147.aShortArrayArray107 = Static144.aShortArrayArray92;
		}
		Static103.anInt2370 = Static174.anInt3740 == 0 ? 443 : Static12.anInt363 + 50000;
		Static28.method610();
		Static142.method2249(Static25.aCanvas1);
		Static149.method2288(Static25.aCanvas1);
		Static145.aClass52_3 = Static12.method211();
		if (Static145.aClass52_3 != null) {
			Static145.aClass52_3.method2624(Static25.aCanvas1);
		}
		Static44.anInt1079 = Static122.anInt2754;
		try {
			if (Static57.aClass63_4.aClass68_4 != null) {
				Static120.aClass26_3 = new Class26(Static57.aClass63_4.aClass68_4, 5200, 0);
				for (@Pc(85) int local85 = 0; local85 < 16; local85++) {
					Static68.aClass26Array1[local85] = new Class26(Static57.aClass63_4.aClass68Array1[local85], 6000, 0);
				}
				Static59.aClass26_2 = new Class26(Static57.aClass63_4.aClass68_2, 6000, 0);
				Static161.aClass83_4 = new Class83(255, Static120.aClass26_3, Static59.aClass26_2, 500000);
				Static19.aClass26_1 = new Class26(Static57.aClass63_4.aClass68_3, 24, 0);
				Static57.aClass63_4.aClass68_3 = null;
				Static57.aClass63_4.aClass68_2 = null;
				Static57.aClass63_4.aClass68_4 = null;
				Static57.aClass63_4.aClass68Array1 = null;
			}
		} catch (@Pc(143) IOException local143) {
			Static59.aClass26_2 = null;
			Static161.aClass83_4 = null;
			Static120.aClass26_3 = null;
			Static19.aClass26_1 = null;
		}
		if (Static174.anInt3740 != 0) {
			Static90.aBoolean88 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method578() {
		if (Static14.aClass87_1 != null) {
			Static14.aClass87_1.aBoolean167 = false;
		}
		Static14.aClass87_1 = null;
		if (Static98.aClass34_5 != null) {
			Static98.aClass34_5.method1136();
			Static98.aClass34_5 = null;
		}
		Static87.method1497();
		Static19.method324();
		Static145.aClass52_3 = null;
		if (Static71.aClass82_2 != null) {
			Static71.aClass82_2.method2641();
		}
		if (Static38.aClass82_1 != null) {
			Static38.aClass82_1.method2641();
		}
		Static146.method2271();
		Static109.method1753();
		try {
			if (Static120.aClass26_3 != null) {
				Static120.aClass26_3.method885();
			}
			if (Static68.aClass26Array1 != null) {
				for (@Pc(57) int local57 = 0; local57 < Static68.aClass26Array1.length; local57++) {
					if (Static68.aClass26Array1[local57] != null) {
						Static68.aClass26Array1[local57].method885();
					}
				}
			}
			if (Static59.aClass26_2 != null) {
				Static59.aClass26_2.method885();
			}
			if (Static19.aClass26_1 != null) {
				Static19.aClass26_1.method885();
			}
		} catch (@Pc(85) IOException local85) {
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method576() {
		@Pc(8) boolean local8 = Static9.method166();
		if (local8 && Static24.aBoolean22 && Static71.aClass82_2 != null) {
			Static71.aClass82_2.method2636();
		}
		if (Static117.aBoolean116) {
			Static123.method1982(Static25.aCanvas1);
			Static64.method1129(Static25.aCanvas1);
			if (Static145.aClass52_3 != null) {
				Static145.aClass52_3.method2628(Static25.aCanvas1);
			}
			this.method570();
			Static142.method2249(Static25.aCanvas1);
			Static149.method2288(Static25.aCanvas1);
			if (Static145.aClass52_3 != null) {
				Static145.aClass52_3.method2624(Static25.aCanvas1);
			}
		}
		if (Static49.anInt1185 == 0) {
			Static9.method165(Static30.anInt813, null, Static95.aClass10_943);
		} else if (Static49.anInt1185 == 5) {
			Static3.method37(Static176.aClass2_Sub1_Sub4_Sub1_Sub1_5, Static167.aClass2_Sub1_Sub4_Sub1_Sub1_4);
		} else if (Static49.anInt1185 == 10) {
			Static3.method37(Static176.aClass2_Sub1_Sub4_Sub1_Sub1_5, Static167.aClass2_Sub1_Sub4_Sub1_Sub1_4);
		} else if (Static49.anInt1185 == 20) {
			Static3.method37(Static176.aClass2_Sub1_Sub4_Sub1_Sub1_5, Static167.aClass2_Sub1_Sub4_Sub1_Sub1_4);
		} else if (Static49.anInt1185 == 25) {
			@Pc(139) int local139;
			if (Static91.anInt2156 == 1) {
				if (Static152.anInt3301 > Static65.anInt1582) {
					Static65.anInt1582 = Static152.anInt3301;
				}
				local139 = (Static65.anInt1582 - Static152.anInt3301) * 50 / Static65.anInt1582;
				Static170.method2617(false, Static3.method36(new Class10[] { Static20.aClass10_244, Static58.aClass10_639, Static164.method2485(local139), Static19.aClass10_235 }));
			} else if (Static91.anInt2156 == 2) {
				if (Static28.anInt773 < Static156.anInt3342) {
					Static28.anInt773 = Static156.anInt3342;
				}
				local139 = (Static28.anInt773 - Static156.anInt3342) * 50 / Static28.anInt773 + 50;
				Static170.method2617(false, Static3.method36(new Class10[] { Static20.aClass10_244, Static58.aClass10_639, Static164.method2485(local139), Static19.aClass10_235 }));
			} else {
				Static170.method2617(false, Static20.aClass10_244);
			}
		} else if (Static49.anInt1185 == 30) {
			Static6.method120();
		} else if (Static49.anInt1185 == 40) {
			Static170.method2617(false, Static3.method36(new Class10[] { Static157.aClass10_1466, Static30.aClass10_377, Static143.aClass10_1397 }));
		}
		@Pc(250) int local250;
		@Pc(240) Graphics local240;
		if (Static49.anInt1185 == 30 && Static24.anInt566 == 0 && !Static20.aBoolean18) {
			try {
				local240 = Static25.aCanvas1.getGraphics();
				for (local250 = 0; local250 < Static5.anInt119; local250++) {
					if (Static170.aBooleanArray18[local250]) {
						Static133.aClass40_1.method2105(local240, Static101.anIntArray244[local250], Static159.anIntArray360[local250], Static72.anIntArray187[local250], Static109.anIntArray255[local250]);
						Static170.aBooleanArray18[local250] = false;
					}
				}
			} catch (@Pc(303) Exception local303) {
				Static25.aCanvas1.repaint();
			}
		} else if (Static49.anInt1185 > 0) {
			try {
				local240 = Static25.aCanvas1.getGraphics();
				Static133.aClass40_1.method2106(local240);
				Static20.aBoolean18 = false;
				for (local250 = 0; local250 < Static5.anInt119; local250++) {
					Static170.aBooleanArray18[local250] = false;
				}
			} catch (@Pc(262) Exception local262) {
				Static25.aCanvas1.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method593() {
		if (Static140.anInt3103 >= 4) {
			this.method573("js5crc");
			Static49.anInt1185 = 1000;
			return;
		}
		if (Static36.anInt926 >= 4) {
			if (Static49.anInt1185 <= 5) {
				this.method573("js5io");
				Static49.anInt1185 = 1000;
				return;
			}
			Static36.anInt926 = 3;
			Static21.anInt505 = 3000;
		}
		if (Static21.anInt505-- > 0) {
			return;
		}
		try {
			if (Static109.anInt2491 == 0) {
				Static38.aClass15_3 = Static57.aClass63_4.method1960(Static159.anInt3394, Static87.aString1);
				Static109.anInt2491++;
			}
			if (Static109.anInt2491 == 1) {
				if (Static38.aClass15_3.anInt821 == 2) {
					this.method589(-1);
					return;
				}
				if (Static38.aClass15_3.anInt821 == 1) {
					Static109.anInt2491++;
				}
			}
			if (Static109.anInt2491 == 2) {
				Static40.aClass34_1 = new Class34((Socket) Static38.aClass15_3.anObject2, Static57.aClass63_4);
				@Pc(102) Class2_Sub11 local102 = new Class2_Sub11(5);
				local102.method1439(15);
				local102.method1445(473);
				Static40.aClass34_1.method1130(5, local102.aByteArray24);
				Static109.anInt2491++;
				Static148.aLong112 = Static29.method615();
			}
			if (Static109.anInt2491 == 3) {
				if (Static49.anInt1185 <= 5 || Static40.aClass34_1.method1135() > 0) {
					@Pc(148) int local148 = Static40.aClass34_1.method1132();
					if (local148 != 0) {
						this.method589(local148);
						return;
					}
					Static109.anInt2491++;
				} else if (Static29.method615() - Static148.aLong112 > 30000L) {
					this.method589(-2);
					return;
				}
			}
			if (Static109.anInt2491 == 4) {
				Static105.method1706(Static40.aClass34_1, Static49.anInt1185 > 20);
				Static11.anInt3504 = 0;
				Static38.aClass15_3 = null;
				Static40.aClass34_1 = null;
				Static109.anInt2491 = 0;
			}
		} catch (@Pc(203) IOException local203) {
			this.method589(-3);
		}
	}
}
