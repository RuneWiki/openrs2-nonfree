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

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "[I")
	public static int[] anIntArray60 = new int[32];

	static {
		@Pc(9) int local9 = 2;
		for (@Pc(11) int local11 = 0; local11 < 32; local11++) {
			anIntArray60[local11] = local9 - 1;
			local9 += local9;
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 7) {
				Static114.method1943();
			}
			Static67.anInt1405 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static27.anInt594 = 0;
			} else if (arg0[1].equals("office")) {
				Static27.anInt594 = 1;
			} else if (arg0[1].equals("local")) {
				Static27.anInt594 = 2;
			} else {
				Static114.method1943();
			}
			if (arg0[2].equals("live")) {
				Static27.anInt591 = 0;
			} else if (arg0[2].equals("rc")) {
				Static27.anInt591 = 1;
			} else if (arg0[2].equals("wip")) {
				Static27.anInt591 = 2;
			} else {
				Static114.method1943();
			}
			if (arg0[3].equals("lowmem")) {
				Static130.method2874();
			} else if (arg0[3].equals("highmem")) {
				Static108.method1833();
			} else {
				Static114.method1943();
			}
			if (arg0[4].equals("free")) {
				Static62.aBoolean56 = false;
			} else if (arg0[4].equals("members")) {
				Static62.aBoolean56 = true;
			} else {
				Static114.method1943();
			}
			if (arg0[5].equals("english")) {
				Static45.anInt1056 = 0;
			} else if (arg0[5].equals("german")) {
				Static138.method2290();
				Static45.anInt1056 = 1;
				Static154.aClass49_1490 = Static120.aClass49_1159;
			} else {
				Static114.method1943();
			}
			if (arg0[6].equals("game0")) {
				Static148.anInt3154 = 0;
			} else if (arg0[6].equals("game1")) {
				Static148.anInt3154 = 1;
			} else {
				Static114.method1943();
			}
			Static167.aString7 = "127.0.0.1";
			@Pc(180) client local180 = new client();
			local180.method536("runescape", Static27.anInt591 + 32);
			Static24.aFrame1.setLocation(40, 40);
		} catch (@Pc(197) Exception local197) {
			Static8.method1789(null, local197);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method533()) {
			return;
		}
		Static67.anInt1405 = Integer.parseInt(this.getParameter("worldid"));
		Static27.anInt591 = Integer.parseInt(this.getParameter("modewhat"));
		Static27.anInt594 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static130.method2874();
		} else {
			Static108.method1833();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static62.aBoolean56 = true;
		} else {
			Static62.aBoolean56 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static138.method2290();
			Static154.aClass49_1490 = Static120.aClass49_1159;
			Static45.anInt1056 = 1;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static148.anInt3154 = 1;
		} else {
			Static148.anInt3154 = 0;
		}
		try {
			Static123.anInt2730 = Integer.parseInt(this.getParameter("js"));
			Static177.anInt3895 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(101) Exception local101) {
		}
		Static167.aString7 = this.getCodeBase().getHost();
		this.method527(Static27.anInt591 + 32);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method542() {
		if (Static169.anInt3681 >= 4) {
			this.method525("js5crc");
			Static95.anInt2009 = 1000;
			return;
		}
		if (Static69.anInt1423 >= 4) {
			if (Static95.anInt2009 <= 5) {
				this.method525("js5io");
				Static95.anInt2009 = 1000;
				return;
			}
			Static38.anInt943 = 3000;
			Static69.anInt1423 = 3;
		}
		if (Static38.anInt943-- > 0) {
			return;
		}
		try {
			if (Static37.anInt932 == 0) {
				Static117.aClass16_8 = Static45.aClass45_1.method1486(Static114.anInt2376, Static167.aString7);
				Static37.anInt932++;
			}
			if (Static37.anInt932 == 1) {
				if (Static117.aClass16_8.anInt749 == 2) {
					this.method550(-1);
					return;
				}
				if (Static117.aClass16_8.anInt749 == 1) {
					Static37.anInt932++;
				}
			}
			if (Static37.anInt932 == 2) {
				Static4.aClass57_1 = new Class57((Socket) Static117.aClass16_8.anObject1, Static45.aClass45_1);
				@Pc(108) Class2_Sub13 local108 = new Class2_Sub13(5);
				local108.method2932(15);
				local108.method2952(484);
				Static4.aClass57_1.method1885(5, local108.aByteArray49);
				Static37.anInt932++;
				Static177.aLong153 = Static108.method1828();
			}
			if (Static37.anInt932 == 3) {
				if (Static95.anInt2009 <= 5 || Static4.aClass57_1.method1884() > 0) {
					@Pc(163) int local163 = Static4.aClass57_1.method1891();
					if (local163 != 0) {
						this.method550(local163);
						return;
					}
					Static37.anInt932++;
				} else if (Static108.method1828() - Static177.aLong153 > 30000L) {
					this.method550(-2);
					return;
				}
			}
			if (Static37.anInt932 == 4) {
				Static70.method1162(Static4.aClass57_1, Static95.anInt2009 > 20);
				Static116.anInt2426 = 0;
				Static37.anInt932 = 0;
				Static4.aClass57_1 = null;
				Static117.aClass16_8 = null;
			}
		} catch (@Pc(200) IOException local200) {
			this.method550(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method546() {
		if (Static95.anInt2009 != 1000) {
			@Pc(17) boolean local17 = Static153.method2530();
			if (!local17) {
				this.method542();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method534() {
		@Pc(12) boolean local12 = Static31.method661();
		if (local12 && Static33.aBoolean32 && Static146.aClass5_2 != null) {
			Static146.aClass5_2.method1790();
		}
		if (Static153.aBoolean140) {
			Static107.method1822(Static5.aCanvas1);
			Static4.method51(Static5.aCanvas1);
			if (Static125.aClass44_1 != null) {
				Static125.aClass44_1.method2287(Static5.aCanvas1);
			}
			this.method528();
			Static127.method2157(Static5.aCanvas1);
			Static30.method575(Static5.aCanvas1);
			if (Static125.aClass44_1 != null) {
				Static125.aClass44_1.method2285(Static5.aCanvas1);
			}
		}
		if (Static95.anInt2009 == 0) {
			Static83.method1426(null, Static80.anInt3951, Static129.aClass49_1270);
		} else if (Static95.anInt2009 == 5) {
			Static171.method2844(Static68.aClass2_Sub2_Sub2_Sub1_Sub1_2, Static42.aClass2_Sub2_Sub2_Sub1_Sub1_1);
		} else if (Static95.anInt2009 == 10) {
			Static171.method2844(Static68.aClass2_Sub2_Sub2_Sub1_Sub1_2, Static42.aClass2_Sub2_Sub2_Sub1_Sub1_1);
		} else if (Static95.anInt2009 == 20) {
			Static171.method2844(Static68.aClass2_Sub2_Sub2_Sub1_Sub1_2, Static42.aClass2_Sub2_Sub2_Sub1_Sub1_1);
		} else if (Static95.anInt2009 == 25) {
			@Pc(119) int local119;
			if (Static152.anInt3279 == 1) {
				if (Static45.anInt1054 > Static122.anInt2560) {
					Static122.anInt2560 = Static45.anInt1054;
				}
				local119 = (Static122.anInt2560 - Static45.anInt1054) * 50 / Static122.anInt2560;
				Static91.method1580(Static33.method692(new Class49[] { Static104.aClass49_1038, Static32.aClass49_439, Static48.method882(local119), Static26.aClass49_330 }), false);
			} else if (Static152.anInt3279 == 2) {
				if (Static88.anInt1863 < Static125.anInt2749) {
					Static88.anInt1863 = Static125.anInt2749;
				}
				local119 = (Static88.anInt1863 - Static125.anInt2749) * 50 / Static88.anInt1863 + 50;
				Static91.method1580(Static33.method692(new Class49[] { Static104.aClass49_1038, Static32.aClass49_439, Static48.method882(local119), Static26.aClass49_330 }), false);
			} else {
				Static91.method1580(Static104.aClass49_1038, false);
			}
		} else if (Static95.anInt2009 == 30) {
			Static161.method2713();
		} else if (Static95.anInt2009 == 40) {
			Static91.method1580(Static33.method692(new Class49[] { Static155.aClass49_1507, Static185.aClass49_1762, Static108.aClass49_1050 }), false);
		}
		@Pc(263) int local263;
		@Pc(253) Graphics local253;
		if (Static95.anInt2009 == 30 && Static153.anInt3281 == 0 && !Static74.aBoolean68) {
			try {
				local253 = Static5.aCanvas1.getGraphics();
				for (local263 = 0; local263 < Static100.anInt2133; local263++) {
					if (Static164.aBooleanArray17[local263]) {
						Static62.aClass24_1.method1749(Static62.anIntArray164[local263], Static176.anIntArray361[local263], local253, Static25.anIntArray48[local263], Static55.anIntArray111[local263]);
						Static164.aBooleanArray17[local263] = false;
					}
				}
			} catch (@Pc(319) Exception local319) {
				Static5.aCanvas1.repaint();
			}
		} else if (Static95.anInt2009 > 0) {
			try {
				local253 = Static5.aCanvas1.getGraphics();
				Static62.aClass24_1.method1748(local253);
				Static74.aBoolean68 = false;
				for (local263 = 0; local263 < Static100.anInt2133; local263++) {
					Static164.aBooleanArray17[local263] = false;
				}
			} catch (@Pc(275) Exception local275) {
				Static5.aCanvas1.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method550(@OriginalArg(0) int arg0) {
		Static117.aClass16_8 = null;
		Static116.anInt2426++;
		Static37.anInt932 = 0;
		if (Static182.anInt4063 == Static114.anInt2376) {
			Static114.anInt2376 = Static58.anInt1235;
		} else {
			Static114.anInt2376 = Static182.anInt4063;
		}
		Static4.aClass57_1 = null;
		if (Static116.anInt2426 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static95.anInt2009 <= 5) {
				this.method525("js5connect_full");
				Static95.anInt2009 = 1000;
			} else {
				Static38.anInt943 = 3000;
			}
		} else if (Static116.anInt2426 >= 2 && arg0 == 6) {
			this.method525("js5connect_outofdate");
			Static95.anInt2009 = 1000;
		} else if (Static116.anInt2426 >= 4) {
			if (Static95.anInt2009 > 5) {
				Static38.anInt943 = 3000;
			} else {
				this.method525("js5connect");
				Static95.anInt2009 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method541() {
		if (Static148.anInt3154 == 1) {
			Static36.aShortArrayArray2 = Static30.aShortArrayArray1;
			Static75.aShortArrayArray3 = Static139.aShortArrayArray5;
			Static146.aShortArray32 = Static78.aShortArray18;
			Static78.aShortArray17 = Static53.aShortArray3;
		} else {
			Static36.aShortArrayArray2 = Static179.aShortArrayArray6;
			Static78.aShortArray17 = Static149.aShortArray33;
			Static146.aShortArray32 = Static177.aShortArray49;
			Static75.aShortArrayArray3 = Static82.aShortArrayArray4;
		}
		Static182.anInt4063 = Static27.anInt594 == 0 ? 43594 : Static67.anInt1405 + 40000;
		Static114.anInt2376 = Static182.anInt4063;
		Static58.anInt1235 = Static27.anInt594 == 0 ? 443 : Static67.anInt1405 + 50000;
		Static74.method1212();
		Static127.method2157(Static5.aCanvas1);
		Static30.method575(Static5.aCanvas1);
		Static125.aClass44_1 = Static34.method730();
		if (Static125.aClass44_1 != null) {
			Static125.aClass44_1.method2285(Static5.aCanvas1);
		}
		Static63.anInt1354 = Static89.anInt1867;
		try {
			if (Static45.aClass45_1.aClass77_2 != null) {
				Static157.aClass37_3 = new Class37(Static45.aClass45_1.aClass77_2, 5200, 0);
				for (@Pc(85) int local85 = 0; local85 < 16; local85++) {
					Static85.aClass37Array1[local85] = new Class37(Static45.aClass45_1.aClass77Array1[local85], 6000, 0);
				}
				Static115.aClass37_2 = new Class37(Static45.aClass45_1.aClass77_3, 6000, 0);
				Static15.aClass88_1 = new Class88(255, Static157.aClass37_3, Static115.aClass37_2, 500000);
				Static29.aClass37_1 = new Class37(Static45.aClass45_1.aClass77_4, 24, 0);
				Static45.aClass45_1.aClass77_4 = null;
				Static45.aClass45_1.aClass77Array1 = null;
				Static45.aClass45_1.aClass77_2 = null;
				Static45.aClass45_1.aClass77_3 = null;
			}
		} catch (@Pc(141) IOException local141) {
			Static29.aClass37_1 = null;
			Static15.aClass88_1 = null;
			Static157.aClass37_3 = null;
			Static115.aClass37_2 = null;
		}
		if (Static27.anInt594 != 0) {
			Static116.aBoolean106 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method540() {
		Static29.method548();
		Static96.method1663();
		Static163.method532();
		Static167.method2771();
		Static44.method1746();
		Static138.method2291();
		Static80.method2915();
		Static110.method1886();
		Static122.method2084();
		Static69.method1148();
		Static180.method2984();
		Static123.method2143();
		Static179.method2973();
		Static93.method1591();
		Static176.method2896();
		Static162.method2744();
		Static159.method2684();
		Static45.method831();
		Static87.method2284();
		Static81.method1392();
		Static117.method1971();
		Static8.method1795();
		Static124.method2145();
		Static15.method214();
		Static19.method359();
		Static165.method2732();
		Static75.method1221();
		Static150.method2474();
		Static55.method951();
		Static65.method3005();
		Static14.method206();
		Static115.method1946();
		Static142.method2344();
		Static166.method1047();
		Static153.method2525();
		Static136.method2266();
		Static126.method2154();
		Static2.method24();
		Static41.method795();
		Static146.method2400();
		Static86.method2728();
		Static11.method163();
		Static92.method1586();
		Static46.method840();
		Static119.method2014();
		Static112.method1899();
		Static39.method768();
		Static161.method2714();
		Static59.method991();
		Static73.method1210();
		Static127.method2158();
		Static108.method1832();
		Static178.method2905();
		Static57.method964();
		Static17.method2077();
		Static154.method2553();
		Static22.method403();
		Static35.method733();
		Static74.method1215();
		Static51.method907();
		Static63.method1096();
		Static148.method2438();
		Static121.method2048();
		Static91.method1575();
		Static158.method2677();
		Static78.method1255();
		Static37.method762();
		Static1.method2();
		Static10.method1858();
		Static131.method2840();
		Static109.method1881();
		Static175.method2887();
		Static137.method2273();
		Static105.method1784();
		Static101.method1742();
		Static53.method928();
		Static26.method474();
		Static113.method1916();
		Static71.method1179();
		Static72.method1199();
		Static77.method1247();
		Static60.method1059();
		Static157.method2663();
		Static98.method1704();
		Static143.method2361();
		Static68.method1144();
		Static50.method900();
		Static3.method45();
		Static16.method635();
		Static13.method194();
		Static149.method2452();
		Static4.method54();
		Static177.method2903();
		Static144.method2370();
		Static9.method129();
		Static94.method1611();
		Static83.method1427();
		Static171.method2846();
		Static54.method939();
		Static135.method2263();
		Static76.method1229();
		Static7.method110();
		Static43.method821();
		Static173.method2850();
		Static28.method503();
		Static104.method1768();
		Static18.method345();
		Static66.method1121();
		Static61.method1070();
		Static6.method104();
		Static141.method2339();
		Static128.method2162();
		Static185.method3042();
		Static107.method1820();
		Static102.method1755();
		Static130.method2877();
		Static38.method764();
		Static21.method394();
		Static70.method1161();
		Static106.method1804();
		Static183.method3029();
		Static49.method885();
		Static172.method2848();
		Static34.method728();
		Static64.method1104();
		Static120.method2043();
		Static97.method1679();
		Static25.method459();
		Static33.method689();
		Static111.method1896();
		Static52.method916();
		Static56.method954();
		Static103.method1759();
		Static184.method3036();
		Static79.method3012();
		Static169.method2803();
		Static125.method2153();
		Static140.method2334();
		Static85.method1441();
		Static100.method1731();
		Static133.method2826();
		Static134.method2262();
		Static32.method681();
		Static30.method577();
		Static118.method1996();
		Static182.method3028();
		Static160.method2710();
		Static145.method2392();
		Static95.method1632();
		Static156.method2643();
		Static116.method1966();
		Static147.method2423();
		Static24.method457();
		Static47.method861();
		Static164.method2766();
		Static155.method2621();
		Static114.method1939();
		Static42.method818();
		Static99.method1725();
		Static170.method2832();
		Static40.method789();
		Static181.method3004();
		Static129.method2183();
		Static62.method1092();
		Static12.method184();
		Static152.method2523();
		Static5.method97();
		Static23.method428();
		Static174.method2872();
		Static88.method1477();
		Static139.method2313();
		Static48.method884();
		Static36.method757();
		Static151.method2503();
		Static168.method2795();
		Static132.method2213();
		Static90.method1573();
		Static20.method391();
		Static31.method657();
		Static82.method1416();
		Static84.method1436();
		Static67.method1131();
		Static27.method480();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method537() {
		Static127.anInt2757++;
		if (Static127.anInt2757 % 1000 == 1) {
			@Pc(14) GregorianCalendar local14 = new GregorianCalendar();
			Static82.anInt1769 = local14.get(11) * 600 + local14.get(12) * 10 + local14.get(13) / 6;
			Static82.aRandom1.setSeed((long) Static82.anInt1769);
		}
		this.method546();
		Static153.method2527();
		Static11.method161();
		Static167.method2773();
		Static29.method545();
		Static98.method1697();
		if (Static125.aClass44_1 != null) {
			@Pc(61) int local61 = Static125.aClass44_1.method2286();
			Static42.anInt1030 = local61;
		}
		if (Static95.anInt2009 == 0) {
			Static150.method2477();
			Static35.method731();
		} else if (Static95.anInt2009 == 5) {
			Static158.method2675(this);
			Static150.method2477();
			Static35.method731();
		} else if (Static95.anInt2009 == 10) {
			Static158.method2675(this);
		} else if (Static95.anInt2009 == 20) {
			Static158.method2675(this);
			Static154.method2544();
		} else if (Static95.anInt2009 == 25) {
			Static63.method1093();
		}
		if (Static95.anInt2009 == 30) {
			Static177.method2901();
		} else if (Static95.anInt2009 == 40) {
			Static154.method2544();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method529() {
		if (Static82.aClass72_1 != null) {
			Static82.aClass72_1.aBoolean124 = false;
		}
		Static82.aClass72_1 = null;
		if (Static51.aClass57_3 != null) {
			Static51.aClass57_3.method1892();
			Static51.aClass57_3 = null;
		}
		Static145.method2394();
		Static43.method823();
		Static125.aClass44_1 = null;
		if (Static146.aClass5_2 != null) {
			Static146.aClass5_2.method1796();
		}
		if (Static37.aClass5_1 != null) {
			Static37.aClass5_1.method1796();
		}
		Static83.method1428();
		Static29.method549();
		try {
			if (Static157.aClass37_3 != null) {
				Static157.aClass37_3.method1150();
			}
			if (Static85.aClass37Array1 != null) {
				for (@Pc(52) int local52 = 0; local52 < Static85.aClass37Array1.length; local52++) {
					if (Static85.aClass37Array1[local52] != null) {
						Static85.aClass37Array1[local52].method1150();
					}
				}
			}
			if (Static115.aClass37_2 != null) {
				Static115.aClass37_2.method1150();
			}
			if (Static29.aClass37_1 != null) {
				Static29.aClass37_1.method1150();
			}
		} catch (@Pc(84) IOException local84) {
		}
	}
}
