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
				Static74.method1708();
			}
			Static170.anInt4098 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static81.anInt2377 = 0;
			} else if (arg0[1].equals("office")) {
				Static81.anInt2377 = 1;
			} else if (arg0[1].equals("local")) {
				Static81.anInt2377 = 2;
			} else {
				Static74.method1708();
			}
			if (arg0[2].equals("live")) {
				Static91.anInt4138 = 0;
			} else if (arg0[2].equals("rc")) {
				Static91.anInt4138 = 1;
			} else if (arg0[2].equals("wip")) {
				Static91.anInt4138 = 2;
			} else {
				Static74.method1708();
			}
			if (arg0[3].equals("lowmem")) {
				Static51.method1191();
			} else if (arg0[3].equals("highmem")) {
				Static14.method525();
			} else {
				Static74.method1708();
			}
			if (arg0[4].equals("free")) {
				Static86.aBoolean127 = false;
			} else if (arg0[4].equals("members")) {
				Static86.aBoolean127 = true;
			} else {
				Static74.method1708();
			}
			if (arg0[5].equals("english")) {
				Static114.anInt2922 = 0;
			} else if (arg0[5].equals("german")) {
				Static126.method2498();
				Static156.aClass28_1304 = Static19.aClass28_213;
				Static114.anInt2922 = 1;
			} else {
				Static74.method1708();
			}
			if (arg0[6].equals("game0")) {
				Static42.anInt1177 = 0;
			} else if (arg0[6].equals("game1")) {
				Static42.anInt1177 = 1;
			} else {
				Static74.method1708();
			}
			Static81.aString1 = "127.0.0.1";
			@Pc(164) client local164 = new client();
			local164.method651(Static91.anInt4138 + 32, "runescape");
			Static29.aFrame1.setLocation(40, 40);
		} catch (@Pc(181) Exception local181) {
			Static146.method2791(local181, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method659() {
		if (Static12.aClass24_1 != null) {
			Static12.aClass24_1.aBoolean54 = false;
		}
		Static12.aClass24_1 = null;
		if (Static52.aClass38_1 != null) {
			Static52.aClass38_1.method1632();
			Static52.aClass38_1 = null;
		}
		Static19.method579();
		Static108.method2206();
		Static2.aClass17_1 = null;
		if (Static166.aClass30_2 != null) {
			Static166.aClass30_2.method2673();
		}
		if (Static45.aClass30_1 != null) {
			Static45.aClass30_1.method2673();
		}
		Static126.method2503();
		Static50.method1190();
		try {
			if (Static128.aClass19_5 != null) {
				Static128.aClass19_5.method757();
			}
			if (Static69.aClass19Array1 != null) {
				for (@Pc(52) int local52 = 0; local52 < Static69.aClass19Array1.length; local52++) {
					if (Static69.aClass19Array1[local52] != null) {
						Static69.aClass19Array1[local52].method757();
					}
				}
			}
			if (Static122.aClass19_4 != null) {
				Static122.aClass19_4.method757();
			}
			if (Static110.aClass19_3 != null) {
				Static110.aClass19_3.method757();
			}
		} catch (@Pc(80) IOException local80) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method650() {
		if (Static42.anInt1177 == 1) {
			Static5.aShortArray1 = Static153.aShortArray36;
			Static170.aShortArrayArray8 = Static98.aShortArrayArray7;
			Static74.aShortArrayArray5 = Static38.aShortArrayArray1;
			Static160.aShortArray37 = Static17.aShortArray4;
		} else {
			Static5.aShortArray1 = Static75.aShortArray25;
			Static170.aShortArrayArray8 = Static50.aShortArrayArray4;
			Static74.aShortArrayArray5 = Static93.aShortArrayArray6;
			Static160.aShortArray37 = Static98.aShortArray34;
		}
		Static74.anInt2214 = Static81.anInt2377 == 0 ? 43594 : Static170.anInt4098 + 40000;
		Static23.anInt602 = Static81.anInt2377 == 0 ? 443 : Static170.anInt4098 + 50000;
		Static128.anInt3275 = Static74.anInt2214;
		Static172.method3134();
		Static123.method2457(Static41.aCanvas1);
		Static155.method2951(Static41.aCanvas1);
		Static2.aClass17_1 = Static173.method3144();
		if (Static2.aClass17_1 != null) {
			Static2.aClass17_1.method630(Static41.aCanvas1);
		}
		Static70.anInt2126 = Static130.anInt3287;
		try {
			if (Static123.aClass68_4.aClass45_3 != null) {
				Static128.aClass19_5 = new Class19(Static123.aClass68_4.aClass45_3, 5200, 0);
				for (@Pc(83) int local83 = 0; local83 < 16; local83++) {
					Static69.aClass19Array1[local83] = new Class19(Static123.aClass68_4.aClass45Array1[local83], 6000, 0);
				}
				Static122.aClass19_4 = new Class19(Static123.aClass68_4.aClass45_4, 6000, 0);
				Static33.aClass34_1 = new Class34(255, Static128.aClass19_5, Static122.aClass19_4, 500000);
				Static110.aClass19_3 = new Class19(Static123.aClass68_4.aClass45_2, 24, 0);
				Static123.aClass68_4.aClass45Array1 = null;
				Static123.aClass68_4.aClass45_4 = null;
				Static123.aClass68_4.aClass45_2 = null;
				Static123.aClass68_4.aClass45_3 = null;
			}
		} catch (@Pc(139) IOException local139) {
			Static128.aClass19_5 = null;
			Static33.aClass34_1 = null;
			Static122.aClass19_4 = null;
			Static110.aClass19_3 = null;
		}
		if (Static81.anInt2377 != 0) {
			Static108.aBoolean137 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method654() {
		@Pc(8) boolean local8 = Static124.method2459();
		if (local8 && Static61.aBoolean101 && Static166.aClass30_2 != null) {
			Static166.aClass30_2.method2670();
		}
		if (Static172.aBoolean192) {
			Static85.method1972(Static41.aCanvas1);
			Static167.method3089(Static41.aCanvas1);
			if (Static2.aClass17_1 != null) {
				Static2.aClass17_1.method629(Static41.aCanvas1);
			}
			this.method660();
			Static123.method2457(Static41.aCanvas1);
			Static155.method2951(Static41.aCanvas1);
			if (Static2.aClass17_1 != null) {
				Static2.aClass17_1.method630(Static41.aCanvas1);
			}
		}
		if (Static137.anInt3514 == 0) {
			Static11.method405(Static141.anInt3626, null, Static140.aClass28_1185);
		} else if (Static137.anInt3514 == 5) {
			Static70.method1645(Static43.aClass3_Sub2_Sub2_Sub1_Sub1_2, Static146.aClass3_Sub2_Sub2_Sub1_Sub1_5);
		} else if (Static137.anInt3514 == 10) {
			Static70.method1645(Static43.aClass3_Sub2_Sub2_Sub1_Sub1_2, Static146.aClass3_Sub2_Sub2_Sub1_Sub1_5);
		} else if (Static137.anInt3514 == 20) {
			Static70.method1645(Static43.aClass3_Sub2_Sub2_Sub1_Sub1_2, Static146.aClass3_Sub2_Sub2_Sub1_Sub1_5);
		} else if (Static137.anInt3514 == 25) {
			@Pc(125) int local125;
			if (Static100.anInt2652 == 1) {
				if (Static136.anInt3477 > Static159.anInt3902) {
					Static159.anInt3902 = Static136.anInt3477;
				}
				local125 = (Static159.anInt3902 - Static136.anInt3477) * 50 / Static159.anInt3902;
				Static128.method2519(false, Static4.method96(new Class28[] { Static171.aClass28_1433, Static125.aClass28_1060, Static146.method2793(local125), Static132.aClass28_1100 }));
			} else if (Static100.anInt2652 == 2) {
				if (Static160.anInt3912 < Static114.anInt2921) {
					Static160.anInt3912 = Static114.anInt2921;
				}
				local125 = (Static160.anInt3912 - Static114.anInt2921) * 50 / Static160.anInt3912 + 50;
				Static128.method2519(false, Static4.method96(new Class28[] { Static171.aClass28_1433, Static125.aClass28_1060, Static146.method2793(local125), Static132.aClass28_1100 }));
			} else {
				Static128.method2519(false, Static171.aClass28_1433);
			}
		} else if (Static137.anInt3514 == 30) {
			Static179.method3194();
		} else if (Static137.anInt3514 == 40) {
			Static128.method2519(false, Static4.method96(new Class28[] { Static108.aClass28_904, Static162.aClass28_1375, Static124.aClass28_1044 }));
		}
		@Pc(257) int local257;
		@Pc(247) Graphics local247;
		if (Static137.anInt3514 == 30 && Static116.anInt2985 == 0 && !Static54.aBoolean92) {
			try {
				local247 = Static41.aCanvas1.getGraphics();
				for (local257 = 0; local257 < Static2.anInt84; local257++) {
					if (Static118.aBooleanArray13[local257]) {
						Static68.aClass70_1.method2802(local247, Static24.anIntArray154[local257], Static166.anIntArray675[local257], Static64.anIntArray332[local257], Static78.anIntArray382[local257]);
						Static118.aBooleanArray13[local257] = false;
					}
				}
			} catch (@Pc(314) Exception local314) {
				Static41.aCanvas1.repaint();
			}
		} else if (Static137.anInt3514 > 0) {
			try {
				local247 = Static41.aCanvas1.getGraphics();
				Static68.aClass70_1.method2797(local247);
				Static54.aBoolean92 = false;
				for (local257 = 0; local257 < Static2.anInt84; local257++) {
					Static118.aBooleanArray13[local257] = false;
				}
			} catch (@Pc(273) Exception local273) {
				Static41.aCanvas1.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method666() {
		if (Static107.anInt2762 >= 4) {
			this.method655("js5crc");
			Static137.anInt3514 = 1000;
			return;
		}
		if (Static44.anInt3938 >= 4) {
			if (Static137.anInt3514 <= 5) {
				this.method655("js5io");
				Static137.anInt3514 = 1000;
				return;
			}
			Static44.anInt3938 = 3;
			Static69.anInt2114 = 3000;
		}
		if (Static69.anInt2114-- > 0) {
			return;
		}
		try {
			if (Static140.anInt3587 == 0) {
				Static11.aClass61_1 = Static123.aClass68_4.method2528(Static128.anInt3275, Static81.aString1);
				Static140.anInt3587++;
			}
			if (Static140.anInt3587 == 1) {
				if (Static11.aClass61_1.anInt2845 == 2) {
					this.method668(-1);
					return;
				}
				if (Static11.aClass61_1.anInt2845 == 1) {
					Static140.anInt3587++;
				}
			}
			if (Static140.anInt3587 == 2) {
				Static151.aClass38_3 = new Class38((Socket) Static11.aClass61_1.anObject4, Static123.aClass68_4);
				@Pc(101) Class3_Sub8 local101 = new Class3_Sub8(5);
				local101.method1550(15);
				local101.method1547(481);
				Static151.aClass38_3.method1633(5, local101.aByteArray19);
				Static140.anInt3587++;
				Static138.aLong119 = Static176.method3161();
			}
			if (Static140.anInt3587 == 3) {
				if (Static137.anInt3514 <= 5 || Static151.aClass38_3.method1634() > 0) {
					@Pc(140) int local140 = Static151.aClass38_3.method1635();
					if (local140 != 0) {
						this.method668(local140);
						return;
					}
					Static140.anInt3587++;
				} else if (Static176.method3161() - Static138.aLong119 > 30000L) {
					this.method668(-2);
					return;
				}
			}
			if (Static140.anInt3587 == 4) {
				Static128.method2514(Static151.aClass38_3, Static137.anInt3514 > 20);
				Static140.anInt3587 = 0;
				Static132.anInt3334 = 0;
				Static151.aClass38_3 = null;
				Static11.aClass61_1 = null;
			}
		} catch (@Pc(190) IOException local190) {
			this.method668(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method656() {
		Static14.anInt481++;
		if (Static14.anInt481 % 1000 == 1) {
			@Pc(20) GregorianCalendar local20 = new GregorianCalendar();
			Static177.anInt4214 = local20.get(11) * 600 + local20.get(12) * 10 + local20.get(13) / 6;
			Static64.aRandom1.setSeed((long) Static177.anInt4214);
		}
		this.method669();
		Static27.method740();
		Static76.method1737();
		Static110.method2233();
		Static86.method1988();
		Static165.method3033();
		if (Static2.aClass17_1 != null) {
			@Pc(65) int local65 = Static2.aClass17_1.method625();
			Static101.anInt2657 = local65;
		}
		if (Static137.anInt3514 == 0) {
			Static153.method2892();
			Static94.method2078();
		} else if (Static137.anInt3514 == 5) {
			Static106.method2172(this);
			Static153.method2892();
			Static94.method2078();
		} else if (Static137.anInt3514 == 10) {
			Static106.method2172(this);
		} else if (Static137.anInt3514 == 20) {
			Static106.method2172(this);
			Static104.method2128();
		} else if (Static137.anInt3514 == 25) {
			Static34.method860();
		}
		if (Static137.anInt3514 == 30) {
			Static16.method538();
		} else if (Static137.anInt3514 == 40) {
			Static104.method2128();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method663()) {
			return;
		}
		Static170.anInt4098 = Integer.parseInt(this.getParameter("worldid"));
		Static91.anInt4138 = Integer.parseInt(this.getParameter("modewhat"));
		Static81.anInt2377 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static51.method1191();
		} else {
			Static14.method525();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static86.aBoolean127 = true;
		} else {
			Static86.aBoolean127 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static126.method2498();
			Static114.anInt2922 = 1;
			Static156.aClass28_1304 = Static19.aClass28_213;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static42.anInt1177 = 1;
		} else {
			Static42.anInt1177 = 0;
		}
		try {
			Static43.anInt1212 = Integer.parseInt(this.getParameter("js"));
			Static140.anInt3584 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(101) Exception local101) {
		}
		Static81.aString1 = this.getCodeBase().getHost();
		this.method652(Static91.anInt4138 + 32);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method668(@OriginalArg(1) int arg0) {
		Static132.anInt3334++;
		Static151.aClass38_3 = null;
		if (Static128.anInt3275 == Static74.anInt2214) {
			Static128.anInt3275 = Static23.anInt602;
		} else {
			Static128.anInt3275 = Static74.anInt2214;
		}
		Static11.aClass61_1 = null;
		Static140.anInt3587 = 0;
		if (Static132.anInt3334 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static137.anInt3514 <= 5) {
				this.method655("js5connect_full");
				Static137.anInt3514 = 1000;
			} else {
				Static69.anInt2114 = 3000;
			}
		} else if (Static132.anInt3334 >= 2 && arg0 == 6) {
			this.method655("js5connect_outofdate");
			Static137.anInt3514 = 1000;
		} else if (Static132.anInt3334 >= 4) {
			if (Static137.anInt3514 > 5) {
				Static69.anInt2114 = 3000;
			} else {
				this.method655("js5connect");
				Static137.anInt3514 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method662() {
		Static24.method665();
		Static41.method925();
		Static169.method657();
		Static44.method3004();
		Static139.method2799();
		Static35.method864();
		Static58.method1509();
		Static68.method1629();
		Static43.method1039();
		Static29.method749();
		Static53.method1215();
		Static61.method1441();
		Static64.method1555();
		Static32.method795();
		Static52.method1196();
		Static27.method741();
		Static34.method852();
		Static179.method3193();
		Static158.method627();
		Static77.method1750();
		Static31.method790();
		Static98.method2671();
		Static173.method3146();
		Static157.method2968();
		Static18.method566();
		Static148.method1434();
		Static174.method3157();
		Static47.method1112();
		Static54.method1223();
		Static96.method3166();
		Static178.method3190();
		Static69.method1638();
		Static117.method2339();
		Static25.method192();
		Static170.method3104();
		Static124.method2460();
		Static99.method2103();
		Static132.method2565();
		Static51.method1193();
		Static123.method2458();
		Static80.method2758();
		Static38.method893();
		Static101.method2112();
		Static175.method3159();
		Static89.method2024();
		Static181.method3212();
		Static40.method900();
		Static114.method2282();
		Static142.method2770();
		Static23.method616();
		Static90.method2048();
		Static176.method3163();
		Static160.method2982();
		Static137.method2690();
		Static8.method1018();
		Static83.method1922();
		Static128.method2517();
		Static145.method2782();
		Static171.method3108();
		Static129.method2522();
		Static21.method595();
		Static107.method2177();
		Static159.method2979();
		Static180.method3206();
		Static26.method682();
		Static103.method2119();
		Static100.method2111();
		Static42.method1007();
		Static147.method1766();
		Static92.method3172();
		Static13.method520();
		Static112.method2253();
		Static56.method1230();
		Static84.method1946();
		Static153.method2895();
		Static150.method2830();
		Static59.method1340();
		Static138.method2705();
		Static22.method607();
		Static177.method3186();
		Static62.method1457();
		Static6.method214();
		Static95.method2095();
		Static17.method552();
		Static82.method1883();
		Static161.method3001();
		Static106.method2173();
		Static10.method1797();
		Static79.method1832();
		Static115.method2297();
		Static168.method3096();
		Static94.method2073();
		Static7.method219();
		Static19.method583();
		Static104.method2132();
		Static126.method2502();
		Static57.method1258();
		Static72.method1655();
		Static109.method2209();
		Static37.method891();
		Static78.method1813();
		Static120.method2405();
		Static3.method68();
		Static75.method1729();
		Static141.method2764();
		Static165.method3035();
		Static122.method2453();
		Static136.method2668();
		Static87.method1994();
		Static20.method590();
		Static76.method1739();
		Static102.method2116();
		Static16.method536();
		Static162.method3013();
		Static146.method2796();
		Static15.method948();
		Static50.method1189();
		Static14.method528();
		Static12.method474();
		Static49.method1188();
		Static39.method898();
		Static71.method1651();
		Static97.method2096();
		Static55.method1225();
		Static164.method3026();
		Static156.method2960();
		Static88.method1998();
		Static163.method3015();
		Static93.method2069();
		Static28.method745();
		Static36.method874();
		Static143.method2778();
		Static111.method2237();
		Static5.method105();
		Static91.method3125();
		Static70.method1649();
		Static151.method2852();
		Static167.method3093();
		Static1.method9();
		Static33.method846();
		Static144.method1399();
		Static110.method2236();
		Static152.method2881();
		Static63.method1493();
		Static67.method1628();
		Static166.method3061();
		Static131.method2556();
		Static85.method1970();
		Static118.method2369();
		Static30.method784();
		Static134.method2616();
		Static2.method66();
		Static154.method2920();
		Static73.method1682();
		Static133.method2592();
		Static113.method2280();
		Static9.method289();
		Static108.method2207();
		Static66.method1602();
		Static60.method1402();
		Static121.method2433();
		Static46.method1099();
		Static116.method2334();
		Static140.method2745();
		Static11.method406();
		Static45.method1072();
		Static155.method2947();
		Static74.method1707();
		Static125.method2490();
		Static135.method2648();
		Static81.method1866();
		Static149.method2827();
		Static4.method95();
		Static119.method2398();
		Static172.method3135();
		Static105.method2158();
		Static48.method1150();
		Static127.method2510();
		Static65.method1575();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method669() {
		if (Static137.anInt3514 != 1000) {
			@Pc(17) boolean local17 = Static59.method1341();
			if (!local17) {
				this.method666();
			}
		}
	}
}
