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
				Static149.method2539();
			}
			Static70.anInt1900 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static18.anInt619 = 0;
			} else if (arg0[1].equals("office")) {
				Static18.anInt619 = 1;
			} else if (arg0[1].equals("local")) {
				Static18.anInt619 = 2;
			} else {
				Static149.method2539();
			}
			if (arg0[2].equals("live")) {
				Static20.anInt637 = 0;
			} else if (arg0[2].equals("rc")) {
				Static20.anInt637 = 1;
			} else if (arg0[2].equals("wip")) {
				Static20.anInt637 = 2;
			} else {
				Static149.method2539();
			}
			if (arg0[3].equals("lowmem")) {
				Static172.method2893();
			} else if (arg0[3].equals("highmem")) {
				Static137.method2292();
			} else {
				Static149.method2539();
			}
			if (arg0[4].equals("free")) {
				Static153.aBoolean154 = false;
			} else if (arg0[4].equals("members")) {
				Static153.aBoolean154 = true;
			} else {
				Static149.method2539();
			}
			if (arg0[5].equals("english")) {
				Static136.anInt3303 = 0;
			} else if (arg0[5].equals("german")) {
				Static168.method2813();
				Static136.anInt3303 = 1;
				Static41.aClass77_471 = Static144.aClass77_1250;
			} else {
				Static149.method2539();
			}
			if (arg0[6].equals("game0")) {
				Static174.anInt4450 = 0;
			} else if (arg0[6].equals("game1")) {
				Static174.anInt4450 = 1;
			} else {
				Static149.method2539();
			}
			Static18.aString1 = "127.0.0.1";
			@Pc(178) client local178 = new client();
			local178.method544("runescape", Static20.anInt637 + 32);
			Static145.aFrame1.setLocation(40, 40);
		} catch (@Pc(195) Exception local195) {
			Static19.method441(null, local195);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method559(@OriginalArg(1) int arg0) {
		if (Static13.anInt381 == Static50.anInt1375) {
			Static50.anInt1375 = Static70.anInt1895;
		} else {
			Static50.anInt1375 = Static13.anInt381;
		}
		Static86.aClass78_3 = null;
		Static13.anInt380++;
		Static123.aClass29_4 = null;
		Static109.anInt895 = 0;
		if (Static13.anInt380 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static97.anInt2440 <= 5) {
				this.method555("js5connect_full");
				Static97.anInt2440 = 1000;
			} else {
				Static179.anInt4568 = 3000;
			}
		} else if (Static13.anInt380 >= 2 && arg0 == 6) {
			this.method555("js5connect_outofdate");
			Static97.anInt2440 = 1000;
		} else if (Static13.anInt380 >= 4) {
			if (Static97.anInt2440 > 5) {
				Static179.anInt4568 = 3000;
			} else {
				this.method555("js5connect");
				Static97.anInt2440 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method560() {
		if (Static50.anInt1383 >= 4) {
			this.method555("js5crc");
			Static97.anInt2440 = 1000;
			return;
		}
		if (Static170.anInt4200 >= 4) {
			if (Static97.anInt2440 <= 5) {
				this.method555("js5io");
				Static97.anInt2440 = 1000;
				return;
			}
			Static179.anInt4568 = 3000;
			Static170.anInt4200 = 3;
		}
		if (Static179.anInt4568-- > 0) {
			return;
		}
		try {
			if (Static109.anInt895 == 0) {
				Static86.aClass78_3 = Static144.aClass50_4.method1743(Static50.anInt1375, Static18.aString1);
				Static109.anInt895++;
			}
			if (Static109.anInt895 == 1) {
				if (Static86.aClass78_3.anInt3646 == 2) {
					this.method559(-1);
					return;
				}
				if (Static86.aClass78_3.anInt3646 == 1) {
					Static109.anInt895++;
				}
			}
			if (Static109.anInt895 == 2) {
				Static123.aClass29_4 = new Class29((Socket) Static86.aClass78_3.anObject3, Static144.aClass50_4);
				@Pc(96) Class2_Sub18 local96 = new Class2_Sub18(5);
				local96.method2389(15);
				local96.method2370(475);
				Static123.aClass29_4.method969(5, local96.aByteArray39);
				Static109.anInt895++;
				Static21.aLong23 = Static101.method1795();
			}
			if (Static109.anInt895 == 3) {
				if (Static97.anInt2440 <= 5 || Static123.aClass29_4.method966() > 0) {
					@Pc(139) int local139 = Static123.aClass29_4.method970();
					if (local139 != 0) {
						this.method559(local139);
						return;
					}
					Static109.anInt895++;
				} else if (Static101.method1795() - Static21.aLong23 > 30000L) {
					this.method559(-2);
					return;
				}
			}
			if (Static109.anInt895 == 4) {
				Static41.method807(Static97.anInt2440 > 20, Static123.aClass29_4);
				Static13.anInt380 = 0;
				Static86.aClass78_3 = null;
				Static109.anInt895 = 0;
				Static123.aClass29_4 = null;
			}
		} catch (@Pc(191) IOException local191) {
			this.method559(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	protected void method558() {
		Static143.anInt3513++;
		if (Static143.anInt3513 % 1000 == 1) {
			@Pc(23) GregorianCalendar local23 = new GregorianCalendar();
			Static127.anInt3071 = local23.get(11) * 600 + local23.get(12) * 10 + local23.get(13) / 6;
			Static56.aRandom1.setSeed((long) Static127.anInt3071);
		}
		this.method561();
		Static166.method2914();
		Static134.method2281();
		Static34.method700();
		Static145.method2441();
		Static170.method2836();
		if (Static61.aClass18_1 != null) {
			@Pc(68) int local68 = Static61.aClass18_1.method620();
			Static100.anInt800 = local68;
		}
		if (Static97.anInt2440 == 0) {
			Static44.method824();
			Static99.method1792();
		} else if (Static97.anInt2440 == 5) {
			Static46.method843(this);
			Static44.method824();
			Static99.method1792();
		} else if (Static97.anInt2440 == 10) {
			Static46.method843(this);
		} else if (Static97.anInt2440 == 20) {
			Static46.method843(this);
			Static81.method1496();
		} else if (Static97.anInt2440 == 25) {
			Static110.method2368();
		}
		if (Static97.anInt2440 == 30) {
			Static23.method516();
		} else if (Static97.anInt2440 == 40) {
			Static81.method1496();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method545()) {
			return;
		}
		Static70.anInt1900 = Integer.parseInt(this.getParameter("worldid"));
		Static20.anInt637 = Integer.parseInt(this.getParameter("modewhat"));
		Static18.anInt619 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static172.method2893();
		} else {
			Static137.method2292();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static153.aBoolean154 = true;
		} else {
			Static153.aBoolean154 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static168.method2813();
			Static136.anInt3303 = 1;
			Static41.aClass77_471 = Static144.aClass77_1250;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static174.anInt4450 = 1;
		} else {
			Static174.anInt4450 = 0;
		}
		try {
			Static7.anInt225 = Integer.parseInt(this.getParameter("js"));
			Static164.anInt4022 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(101) Exception local101) {
		}
		Static18.aString1 = this.getCodeBase().getHost();
		this.method548(Static20.anInt637 + 32);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method546() {
		Static27.method563();
		Static148.method2518();
		Static100.method556();
		Static126.method1615();
		Static146.method2175();
		Static75.method1420();
		Static110.method2362();
		Static51.method968();
		Static130.method2237();
		Static181.method3013();
		Static125.method2167();
		Static173.method2920();
		Static141.method2399();
		Static116.method2061();
		Static168.method2802();
		Static132.method2239();
		Static172.method2895();
		Static20.method455();
		Static144.method2436();
		Static109.method622();
		Static63.method1159();
		Static94.method1689();
		Static162.method892();
		Static44.method828();
		Static1.method4();
		Static152.method2585();
		Static166.method2912();
		Static92.method1680();
		Static153.method2610();
		Static70.method1371();
		Static160.method3001();
		Static91.method1674();
		Static26.method526();
		Static159.method2695();
		Static22.method583();
		Static96.method1755();
		Static45.method831();
		Static137.method2291();
		Static46.method844();
		Static124.method2159();
		Static80.method1470();
		Static4.method2909();
		Static5.method101();
		Static112.method1995();
		Static136.method2286();
		Static47.method876();
		Static121.method2128();
		Static135.method2283();
		Static39.method773();
		Static97.method1760();
		Static19.method443();
		Static53.method1025();
		Static101.method1794();
		Static72.method1389();
		Static18.method439();
		Static84.method2210();
		Static147.method2485();
		Static58.method1063();
		Static140.method2332();
		Static111.method1990();
		Static164.method2755();
		Static24.method518();
		Static28.method567();
		Static165.method2759();
		Static13.method268();
		Static8.method128();
		Static133.method2256();
		Static15.method330();
		Static113.method1237();
		Static131.method2902();
		Static12.method254();
		Static177.method2964();
		Static35.method714();
		Static139.method2331();
		Static74.method1419();
		Static174.method2942();
		Static50.method957();
		Static33.method671();
		Static158.method2692();
		Static16.method350();
		Static64.method1308();
		Static29.method602();
		Static85.method1557();
		Static67.method1343();
		Static66.method1325();
		Static82.method1511();
		Static71.method1385();
		Static167.method2799();
		Static102.method1275();
		Static90.method1662();
		Static52.method986();
		Static62.method1153();
		Static117.method2097();
		Static68.method1346();
		Static54.method1027();
		Static76.method1427();
		Static180.method3008();
		Static9.method145();
		Static25.method522();
		Static145.method2444();
		Static175.method2948();
		Static105.method1834();
		Static31.method614();
		Static65.method1313();
		Static7.method125();
		Static169.method2833();
		Static6.method107();
		Static128.method2197();
		Static143.method2429();
		Static118.method2103();
		Static42.method812();
		Static149.method2540();
		Static93.method1684();
		Static37.method743();
		Static127.method2179();
		Static120.method712();
		Static99.method1791();
		Static83.method1519();
		Static155.method2646();
		Static129.method2200();
		Static32.method657();
		Static151.method2568();
		Static157.method2671();
		Static36.method729();
		Static178.method2974();
		Static41.method804();
		Static43.method819();
		Static142.method2410();
		Static78.method1459();
		Static30.method608();
		Static73.method1410();
		Static69.method1348();
		Static170.method2838();
		Static57.method2995();
		Static79.method1467();
		Static55.method1035();
		Static49.method943();
		Static23.method513();
		Static3.method71();
		Static122.method321();
		Static59.method1095();
		Static163.method2750();
		Static89.method1646();
		Static48.method920();
		Static150.method2564();
		Static108.method1922();
		Static56.method1060();
		Static107.method1881();
		Static81.method1497();
		Static87.method1613();
		Static119.method2126();
		Static38.method768();
		Static115.method2041();
		Static60.method1125();
		Static2.method58();
		Static123.method2153();
		Static154.method2642();
		Static14.method326();
		Static138.method2314();
		Static40.method797();
		Static11.method174();
		Static114.method2019();
		Static77.method1453();
		Static134.method2280();
		Static86.method1588();
		Static106.method1857();
		Static61.method1148();
		Static161.method2724();
		Static179.method3000();
		Static17.method437();
		Static156.method2669();
		Static34.method701();
		Static98.method1786();
		Static104.method1830();
		Static171.method2870();
		Static176.method2959();
		Static103.method1805();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method553() {
		@Pc(4) boolean local4 = Static20.method445();
		if (local4 && Static8.aBoolean10 && Static18.aClass19_10 != null) {
			Static18.aClass19_10.method891();
		}
		if (Static163.aBoolean165) {
			Static115.method2043(Static1.aCanvas1);
			Static143.method2426(Static1.aCanvas1);
			if (Static61.aClass18_1 != null) {
				Static61.aClass18_1.method623(Static1.aCanvas1);
			}
			this.method554();
			Static21.method480(Static1.aCanvas1);
			Static3.method64(Static1.aCanvas1);
			if (Static61.aClass18_1 != null) {
				Static61.aClass18_1.method621(Static1.aCanvas1);
			}
		}
		if (Static97.anInt2440 == 0) {
			Static89.method1647(Static49.anInt1343, null, Static39.aClass77_449);
		} else if (Static97.anInt2440 == 5) {
			Static96.method1757(Static99.aClass2_Sub2_Sub3_Sub4_Sub1_5, Static86.aClass2_Sub2_Sub3_Sub4_Sub1_4);
		} else if (Static97.anInt2440 == 10) {
			Static96.method1757(Static99.aClass2_Sub2_Sub3_Sub4_Sub1_5, Static86.aClass2_Sub2_Sub3_Sub4_Sub1_4);
		} else if (Static97.anInt2440 == 20) {
			Static96.method1757(Static99.aClass2_Sub2_Sub3_Sub4_Sub1_5, Static86.aClass2_Sub2_Sub3_Sub4_Sub1_4);
		} else if (Static97.anInt2440 == 25) {
			@Pc(141) int local141;
			if (Static72.anInt1931 == 1) {
				if (Static16.anInt510 > Static42.anInt1175) {
					Static42.anInt1175 = Static16.anInt510;
				}
				local141 = (Static42.anInt1175 - Static16.anInt510) * 50 / Static42.anInt1175;
				Static91.method1669(Static146.method2168(new Class77[] { Static131.aClass77_1491, Static124.aClass77_1117, Static2.method61(local141), Static24.aClass77_309 }), false);
			} else if (Static72.anInt1931 == 2) {
				if (Static124.anInt3043 > Static27.anInt815) {
					Static27.anInt815 = Static124.anInt3043;
				}
				local141 = (Static27.anInt815 - Static124.anInt3043) * 50 / Static27.anInt815 + 50;
				Static91.method1669(Static146.method2168(new Class77[] { Static131.aClass77_1491, Static124.aClass77_1117, Static2.method61(local141), Static24.aClass77_309 }), false);
			} else {
				Static91.method1669(Static131.aClass77_1491, false);
			}
		} else if (Static97.anInt2440 == 30) {
			Static142.method2409();
		} else if (Static97.anInt2440 == 40) {
			Static91.method1669(Static146.method2168(new Class77[] { Static139.aClass77_1211, Static163.aClass77_1366, Static178.aClass77_1545 }), false);
		}
		@Pc(240) int local240;
		@Pc(238) Graphics local238;
		if (Static97.anInt2440 == 30 && Static58.anInt1521 == 0 && !Static158.aBoolean160) {
			try {
				local238 = Static1.aCanvas1.getGraphics();
				for (local240 = 0; local240 < Static176.anInt4482; local240++) {
					if (Static154.aBooleanArray17[local240]) {
						Static152.aClass57_1.method2171(Static74.anIntArray330[local240], local238, Static98.anIntArray396[local240], Static94.anIntArray385[local240], Static56.anIntArray233[local240]);
						Static154.aBooleanArray17[local240] = false;
					}
				}
			} catch (@Pc(272) Exception local272) {
				Static1.aCanvas1.repaint();
			}
		} else if (Static97.anInt2440 > 0) {
			try {
				local238 = Static1.aCanvas1.getGraphics();
				Static152.aClass57_1.method2169(local238);
				Static158.aBoolean160 = false;
				for (local240 = 0; local240 < Static176.anInt4482; local240++) {
					Static154.aBooleanArray17[local240] = false;
				}
			} catch (@Pc(307) Exception local307) {
				Static1.aCanvas1.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method552() {
		if (Static55.aClass40_1 != null) {
			Static55.aClass40_1.aBoolean89 = false;
		}
		Static55.aClass40_1 = null;
		if (Static2.aClass29_2 != null) {
			Static2.aClass29_2.method967();
			Static2.aClass29_2 = null;
		}
		Static8.method130();
		Static155.method2643();
		Static61.aClass18_1 = null;
		if (Static18.aClass19_10 != null) {
			Static18.aClass19_10.method888();
		}
		if (Static131.aClass19_35 != null) {
			Static131.aClass19_35.method888();
		}
		Static106.method1858();
		Static103.method1802();
		try {
			if (Static91.aClass89_2 != null) {
				Static91.aClass89_2.method3016();
			}
			if (Static157.aClass89Array1 != null) {
				for (@Pc(59) int local59 = 0; local59 < Static157.aClass89Array1.length; local59++) {
					if (Static157.aClass89Array1[local59] != null) {
						Static157.aClass89Array1[local59].method3016();
					}
				}
			}
			if (Static72.aClass89_1 != null) {
				Static72.aClass89_1.method3016();
			}
			if (Static159.aClass89_5 != null) {
				Static159.aClass89_5.method3016();
			}
		} catch (@Pc(91) IOException local91) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	private void method561() {
		if (Static97.anInt2440 != 1000) {
			@Pc(15) boolean local15 = Static80.method1471();
			if (!local15) {
				this.method560();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method557() {
		Static13.anInt381 = Static18.anInt619 == 0 ? 43594 : Static70.anInt1900 + 40000;
		Static50.anInt1375 = Static13.anInt381;
		if (Static174.anInt4450 == 1) {
			Static6.aShortArray7 = Static139.aShortArray104;
			Static142.aShortArray106 = Static169.aShortArray129;
			Static63.aShortArrayArray6 = Static4.aShortArrayArray17;
			Static70.aShortArrayArray7 = Static149.aShortArrayArray11;
		} else {
			Static142.aShortArray106 = Static96.aShortArray87;
			Static63.aShortArrayArray6 = Static111.aShortArrayArray8;
			Static70.aShortArrayArray7 = Static166.aShortArrayArray18;
			Static6.aShortArray7 = Static160.aShortArray139;
		}
		Static70.anInt1895 = Static18.anInt619 == 0 ? 443 : Static70.anInt1900 + 50000;
		Static133.method2257();
		Static21.method480(Static1.aCanvas1);
		Static3.method64(Static1.aCanvas1);
		Static61.aClass18_1 = Static150.method2567();
		if (Static61.aClass18_1 != null) {
			Static61.aClass18_1.method621(Static1.aCanvas1);
		}
		Static159.anInt3925 = Static95.anInt2432;
		try {
			if (Static144.aClass50_4.aClass35_2 != null) {
				Static91.aClass89_2 = new Class89(Static144.aClass50_4.aClass35_2, 5200, 0);
				for (@Pc(79) int local79 = 0; local79 < 16; local79++) {
					Static157.aClass89Array1[local79] = new Class89(Static144.aClass50_4.aClass35Array1[local79], 6000, 0);
				}
				Static72.aClass89_1 = new Class89(Static144.aClass50_4.aClass35_3, 6000, 0);
				Static179.aClass64_4 = new Class64(255, Static91.aClass89_2, Static72.aClass89_1, 500000);
				Static159.aClass89_5 = new Class89(Static144.aClass50_4.aClass35_1, 24, 0);
				Static144.aClass50_4.aClass35_3 = null;
				Static144.aClass50_4.aClass35_2 = null;
				Static144.aClass50_4.aClass35Array1 = null;
				Static144.aClass50_4.aClass35_1 = null;
			}
		} catch (@Pc(135) IOException local135) {
			Static179.aClass64_4 = null;
			Static91.aClass89_2 = null;
			Static159.aClass89_5 = null;
			Static72.aClass89_1 = null;
		}
		if (Static18.anInt619 != 0) {
			Static8.aBoolean11 = true;
		}
	}
}
