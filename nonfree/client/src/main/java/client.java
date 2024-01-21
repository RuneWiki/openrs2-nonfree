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
				Static106.method2188();
			}
			Static108.anInt3191 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static94.anInt2919 = 0;
			} else if (arg0[1].equals("office")) {
				Static94.anInt2919 = 1;
			} else if (arg0[1].equals("local")) {
				Static94.anInt2919 = 2;
			} else {
				Static106.method2188();
			}
			if (arg0[2].equals("live")) {
				Static80.anInt2482 = 0;
			} else if (arg0[2].equals("rc")) {
				Static80.anInt2482 = 1;
			} else if (arg0[2].equals("wip")) {
				Static80.anInt2482 = 2;
			} else {
				Static106.method2188();
			}
			if (arg0[3].equals("lowmem")) {
				Static43.method928();
			} else if (arg0[3].equals("highmem")) {
				Static146.method2770();
			} else {
				Static106.method2188();
			}
			if (arg0[4].equals("free")) {
				Static124.aBoolean153 = false;
			} else if (arg0[4].equals("members")) {
				Static124.aBoolean153 = true;
			} else {
				Static106.method2188();
			}
			if (arg0[5].equals("english")) {
				Static139.anInt3912 = 0;
			} else if (arg0[5].equals("german")) {
				Static117.method2323();
				Static62.aClass18_474 = Static136.aClass18_968;
				Static139.anInt3912 = 1;
			} else {
				Static106.method2188();
			}
			if (arg0[6].equals("game0")) {
				Static169.anInt4600 = 0;
			} else if (arg0[6].equals("game1")) {
				Static169.anInt4600 = 1;
			} else {
				Static106.method2188();
			}
			Static43.aString2 = "127.0.0.1";
			@Pc(176) client local176 = new client();
			local176.method412("runescape", Static80.anInt2482 + 32);
			Static82.aFrame1.setLocation(40, 40);
		} catch (@Pc(193) Exception local193) {
			Static15.method266(null, local193);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method423(@OriginalArg(0) int arg0) {
		Static114.aClass21_5 = null;
		Static147.anInt4056++;
		if (Static17.anInt3606 == Static156.anInt4308) {
			Static17.anInt3606 = Static54.anInt1732;
		} else {
			Static17.anInt3606 = Static156.anInt4308;
		}
		Static114.aClass26_6 = null;
		Static81.anInt2485 = 0;
		if (Static147.anInt4056 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static73.anInt1886 > 5) {
				Static65.anInt1973 = 3000;
			} else {
				this.method408("js5connect_full");
				Static73.anInt1886 = 1000;
			}
		} else if (Static147.anInt4056 >= 2 && arg0 == 6) {
			this.method408("js5connect_outofdate");
			Static73.anInt1886 = 1000;
		} else if (Static147.anInt4056 >= 4) {
			if (Static73.anInt1886 > 5) {
				Static65.anInt1973 = 3000;
			} else {
				this.method408("js5connect");
				Static73.anInt1886 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method410() {
		if (Static169.anInt4600 == 1) {
			Static17.aShortArrayArray7 = Static8.aShortArrayArray1;
			Static1.aShortArray3 = Static62.aShortArray12;
			Static106.aShortArrayArray6 = Static178.aShortArrayArray8;
			Static81.aShortArray21 = Static99.aShortArray26;
		} else {
			Static17.aShortArrayArray7 = Static82.aShortArrayArray4;
			Static106.aShortArrayArray6 = Static27.aShortArrayArray3;
			Static1.aShortArray3 = Static171.aShortArray33;
			Static81.aShortArray21 = Static21.aShortArray10;
		}
		Static156.anInt4308 = Static94.anInt2919 == 0 ? 43594 : Static108.anInt3191 + 40000;
		Static54.anInt1732 = Static94.anInt2919 == 0 ? 443 : Static108.anInt3191 + 50000;
		Static17.anInt3606 = Static156.anInt4308;
		Static87.method1887();
		Static159.method2973(Static46.aCanvas38);
		Static26.method576(Static46.aCanvas38);
		Static56.aClass43_3 = Static12.method3142();
		if (Static56.aClass43_3 != null) {
			Static56.aClass43_3.method2074(Static46.aCanvas38);
		}
		Static177.anInt4714 = Static112.anInt3254;
		try {
			if (Static162.aClass53_4.aClass70_2 != null) {
				Static123.aClass44_1 = new Class44(Static162.aClass53_4.aClass70_2, 5200, 0);
				for (@Pc(87) int local87 = 0; local87 < 16; local87++) {
					Static17.aClass44Array3[local87] = new Class44(Static162.aClass53_4.aClass70Array1[local87], 6000, 0);
				}
				Static170.aClass44_5 = new Class44(Static162.aClass53_4.aClass70_4, 6000, 0);
				Static22.aClass69_1 = new Class69(255, Static123.aClass44_1, Static170.aClass44_5, 500000);
				Static146.aClass44_4 = new Class44(Static162.aClass53_4.aClass70_3, 24, 0);
				Static162.aClass53_4.aClass70_3 = null;
				Static162.aClass53_4.aClass70_2 = null;
				Static162.aClass53_4.aClass70_4 = null;
				Static162.aClass53_4.aClass70Array1 = null;
			}
		} catch (@Pc(143) IOException local143) {
			Static146.aClass44_4 = null;
			Static123.aClass44_1 = null;
			Static22.aClass69_1 = null;
			Static170.aClass44_5 = null;
		}
		if (Static94.anInt2919 != 0) {
			Static135.aBoolean168 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method411() {
		Static41.anInt1322++;
		if (Static41.anInt1322 % 1000 == 1) {
			@Pc(18) GregorianCalendar local18 = new GregorianCalendar();
			Static89.anInt2751 = local18.get(11) * 600 + local18.get(12) * 10 + local18.get(13) / 6;
			Static74.aRandom1.setSeed((long) Static89.anInt2751);
		}
		this.method425();
		Static54.method1133();
		Static37.method762();
		Static147.method2775();
		Static124.method2452();
		Static84.method1824();
		if (Static56.aClass43_3 != null) {
			@Pc(67) int local67 = Static56.aClass43_3.method2072();
			Static88.anInt2731 = local67;
		}
		if (Static73.anInt1886 == 0) {
			Static97.method2115();
			Static4.method86();
		} else if (Static73.anInt1886 == 5) {
			Static85.method1849(this);
			Static97.method2115();
			Static4.method86();
		} else if (Static73.anInt1886 == 10) {
			Static85.method1849(this);
		} else if (Static73.anInt1886 == 20) {
			Static85.method1849(this);
			Static81.method1797();
		} else if (Static73.anInt1886 == 25) {
			Static123.method2410();
		}
		if (Static73.anInt1886 == 30) {
			Static95.method2081();
		} else if (Static73.anInt1886 == 40) {
			Static81.method1797();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method425() {
		if (Static73.anInt1886 != 1000) {
			@Pc(12) boolean local12 = Static72.method1552();
			if (!local12) {
				this.method426();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method407()) {
			return;
		}
		Static108.anInt3191 = Integer.parseInt(this.getParameter("worldid"));
		Static80.anInt2482 = Integer.parseInt(this.getParameter("modewhat"));
		Static94.anInt2919 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static43.method928();
		} else {
			Static146.method2770();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static124.aBoolean153 = true;
		} else {
			Static124.aBoolean153 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static117.method2323();
			Static139.anInt3912 = 1;
			Static62.aClass18_474 = Static136.aClass18_968;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static169.anInt4600 = 1;
		} else {
			Static169.anInt4600 = 0;
		}
		try {
			Static24.anInt857 = Integer.parseInt(this.getParameter("js"));
			Static22.anInt614 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(101) Exception local101) {
		}
		Static43.aString2 = this.getCodeBase().getHost();
		this.method409(Static80.anInt2482 + 32);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method426() {
		if (Static178.anInt4739 >= 4) {
			this.method408("js5crc");
			Static73.anInt1886 = 1000;
			return;
		}
		if (Static122.anInt3468 >= 4) {
			if (Static73.anInt1886 <= 5) {
				this.method408("js5io");
				Static73.anInt1886 = 1000;
				return;
			}
			Static122.anInt3468 = 3;
			Static65.anInt1973 = 3000;
		}
		if (Static65.anInt1973-- > 0) {
			return;
		}
		try {
			if (Static81.anInt2485 == 0) {
				Static114.aClass26_6 = Static162.aClass53_4.method2269(Static43.aString2, Static17.anInt3606);
				Static81.anInt2485++;
			}
			if (Static81.anInt2485 == 1) {
				if (Static114.aClass26_6.anInt1788 == 2) {
					this.method423(-1);
					return;
				}
				if (Static114.aClass26_6.anInt1788 == 1) {
					Static81.anInt2485++;
				}
			}
			if (Static81.anInt2485 == 2) {
				Static114.aClass21_5 = new Class21((Socket) Static114.aClass26_6.anObject2, Static162.aClass53_4);
				@Pc(94) Class1_Sub6 local94 = new Class1_Sub6(5);
				local94.method530(15);
				local94.method513(474);
				Static114.aClass21_5.method1024(local94.aByteArray3, 5);
				Static81.anInt2485++;
				Static162.aLong127 = Static146.method2771();
			}
			if (Static81.anInt2485 == 3) {
				if (Static73.anInt1886 <= 5 || Static114.aClass21_5.method1026() > 0) {
					@Pc(135) int local135 = Static114.aClass21_5.method1025();
					if (local135 != 0) {
						this.method423(local135);
						return;
					}
					Static81.anInt2485++;
				} else if (Static146.method2771() - Static162.aLong127 > 30000L) {
					this.method423(-2);
					return;
				}
			}
			if (Static81.anInt2485 == 4) {
				Static135.method2593(Static114.aClass21_5, Static73.anInt1886 > 20);
				Static81.anInt2485 = 0;
				Static114.aClass26_6 = null;
				Static147.anInt4056 = 0;
				Static114.aClass21_5 = null;
			}
		} catch (@Pc(190) IOException local190) {
			this.method423(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method419() {
		if (Static144.aClass56_1 != null) {
			Static144.aClass56_1.aBoolean144 = false;
		}
		Static144.aClass56_1 = null;
		if (Static35.aClass21_2 != null) {
			Static35.aClass21_2.method1029();
			Static35.aClass21_2 = null;
		}
		Static74.method1576();
		Static33.method715();
		Static56.aClass43_3 = null;
		if (Static177.aClass25_12 != null) {
			Static177.aClass25_12.method1553();
		}
		if (Static47.aClass25_11 != null) {
			Static47.aClass25_11.method1553();
		}
		Static71.method1525();
		Static143.method2710();
		try {
			if (Static123.aClass44_1 != null) {
				Static123.aClass44_1.method2080();
			}
			if (Static17.aClass44Array3 != null) {
				for (@Pc(57) int local57 = 0; local57 < Static17.aClass44Array3.length; local57++) {
					if (Static17.aClass44Array3[local57] != null) {
						Static17.aClass44Array3[local57].method2080();
					}
				}
			}
			if (Static170.aClass44_5 != null) {
				Static170.aClass44_5.method2080();
			}
			if (Static146.aClass44_4 != null) {
				Static146.aClass44_4.method2080();
			}
		} catch (@Pc(89) IOException local89) {
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method417() {
		Static23.method424();
		Static34.method721();
		Static35.method416();
		Static113.method2978();
		Static73.method1248();
		Static116.method2315();
		Static59.method551();
		Static45.method1027();
		Static110.method2261();
		Static95.method2087();
		Static142.method2686();
		Static88.method1921();
		Static24.method561();
		Static138.method2655();
		Static49.method1050();
		Static39.method776();
		Static125.method2486();
		Static123.method2422();
		Static25.method568();
		Static100.method2075();
		Static117.method2322();
		Static131.method2537();
		Static56.method1568();
		Static66.method1304();
		Static64.method1286();
		Static122.method2408();
		Static17.method2482();
		Static8.method129();
		Static133.method2583();
		Static38.method775();
		Static83.method3203();
		Static10.method175();
		Static177.method3183();
		Static136.method2596();
		Static140.method1007();
		Static70.method1476();
		Static82.method1802();
		Static36.method760();
		Static99.method2127();
		Static106.method2186();
		Static61.method1246();
		Static161.method2991();
		Static47.method2891();
		Static153.method2874();
		Static93.method2038();
		Static89.method1923();
		Static111.method2266();
		Static134.method2592();
		Static165.method3049();
		Static115.method2311();
		Static52.method1107();
		Static20.method349();
		Static146.method2769();
		Static19.method348();
		Static5.method90();
		Static28.method2256();
		Static60.method1222();
		Static152.method2855();
		Static120.method2354();
		Static54.method1137();
		Static119.method2352();
		Static102.method2136();
		Static175.method3158();
		Static2.method55();
		Static157.method2930();
		Static124.method2451();
		Static127.method2493();
		Static16.method274();
		Static126.method2489();
		Static63.method1994();
		Static12.method3144();
		Static79.method1750();
		Static65.method1298();
		Static18.method338();
		Static33.method713();
		Static103.method2145();
		Static7.method120();
		Static50.method1079();
		Static6.method111();
		Static11.method198();
		Static92.method1964();
		Static1.method44();
		Static150.method2829();
		Static173.method3150();
		Static21.method371();
		Static130.method2536();
		Static158.method2951();
		Static71.method1522();
		Static67.method2022();
		Static166.method3061();
		Static3.method78();
		Static26.method573();
		Static135.method2594();
		Static97.method2119();
		Static171.method3126();
		Static91.method1944();
		Static41.method820();
		Static27.method593();
		Static57.method1173();
		Static147.method2777();
		Static43.method930();
		Static81.method1796();
		Static160.method2981();
		Static13.method219();
		Static44.method1013();
		Static29.method644();
		Static154.method2898();
		Static48.method1036();
		Static42.method847();
		Static96.method2114();
		Static4.method88();
		Static167.method3067();
		Static69.method1446();
		Static174.method3156();
		Static107.method2201();
		Static30.method662();
		Static141.method1502();
		Static155.method2900();
		Static22.method379();
		Static58.method1195();
		Static179.method3196();
		Static55.method1171();
		Static77.method1687();
		Static101.method2129();
		Static128.method2495();
		Static178.method3195();
		Static32.method697();
		Static68.method1424();
		Static170.method3124();
		Static137.method2605();
		Static176.method3172();
		Static90.method1931();
		Static109.method2229();
		Static37.method767();
		Static46.method3204();
		Static149.method2811();
		Static162.method2995();
		Static84.method1825();
		Static74.method1575();
		Static87.method1882();
		Static118.method2348();
		Static180.method3218();
		Static53.method1129();
		Static139.method2682();
		Static168.method3090();
		Static31.method686();
		Static105.method2177();
		Static156.method2924();
		Static148.method2801();
		Static85.method1851();
		Static144.method2732();
		Static80.method1792();
		Static145.method2767();
		Static76.method1685();
		Static163.method3019();
		Static108.method2223();
		Static164.method3046();
		Static132.method2561();
		Static114.method2307();
		Static75.method1598();
		Static72.method1551();
		Static9.method173();
		Static143.method2711();
		Static159.method2972();
		Static121.method2380();
		Static94.method2060();
		Static169.method3112();
		Static62.method1276();
		Static40.method810();
		Static15.method267();
		Static51.method1103();
		Static14.method244();
		Static86.method1876();
		Static129.method2517();
		Static151.method2853();
		Static78.method1713();
		Static98.method2126();
		Static104.method2155();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method415() {
		@Pc(13) boolean local13 = Static76.method1683();
		if (local13 && Static116.aBoolean143 && Static177.aClass25_12 != null) {
			Static177.aClass25_12.method1560();
		}
		if (Static132.aBoolean162) {
			Static33.method716(Static46.aCanvas38);
			Static16.method275(Static46.aCanvas38);
			if (Static56.aClass43_3 != null) {
				Static56.aClass43_3.method2070(Static46.aCanvas38);
			}
			this.method421();
			Static159.method2973(Static46.aCanvas38);
			Static26.method576(Static46.aCanvas38);
			if (Static56.aClass43_3 != null) {
				Static56.aClass43_3.method2074(Static46.aCanvas38);
			}
		}
		if (Static73.anInt1886 == 0) {
			Static147.method2778(Static163.aClass18_1151, null, Static144.anInt3993);
		} else if (Static73.anInt1886 == 5) {
			Static51.method1105(Static12.aClass1_Sub1_Sub8_Sub2_Sub1_37, Static29.aClass1_Sub1_Sub8_Sub2_Sub1_11);
		} else if (Static73.anInt1886 == 10) {
			Static51.method1105(Static12.aClass1_Sub1_Sub8_Sub2_Sub1_37, Static29.aClass1_Sub1_Sub8_Sub2_Sub1_11);
		} else if (Static73.anInt1886 == 20) {
			Static51.method1105(Static12.aClass1_Sub1_Sub8_Sub2_Sub1_37, Static29.aClass1_Sub1_Sub8_Sub2_Sub1_11);
		} else if (Static73.anInt1886 == 25) {
			@Pc(121) int local121;
			if (Static156.anInt4306 == 1) {
				if (Static15.anInt437 < Static23.anInt710) {
					Static15.anInt437 = Static23.anInt710;
				}
				local121 = (Static15.anInt437 - Static23.anInt710) * 50 / Static15.anInt437;
				Static161.method2992(Static144.method2735(new Class18[] { Static173.aClass18_1214, Static175.aClass18_1220, Static132.method2564(local121), Static111.aClass18_818 }), false);
			} else if (Static156.anInt4306 == 2) {
				if (Static155.anInt4268 > Static88.anInt2730) {
					Static88.anInt2730 = Static155.anInt4268;
				}
				local121 = (Static88.anInt2730 - Static155.anInt4268) * 50 / Static88.anInt2730 + 50;
				Static161.method2992(Static144.method2735(new Class18[] { Static173.aClass18_1214, Static175.aClass18_1220, Static132.method2564(local121), Static111.aClass18_818 }), false);
			} else {
				Static161.method2992(Static173.aClass18_1214, false);
			}
		} else if (Static73.anInt1886 == 30) {
			Static80.method1790();
		} else if (Static73.anInt1886 == 40) {
			Static161.method2992(Static144.method2735(new Class18[] { Static81.aClass18_600, Static76.aClass18_567, Static38.aClass18_290 }), false);
		}
		@Pc(248) int local248;
		@Pc(246) Graphics local246;
		if (Static73.anInt1886 == 30 && Static124.anInt3517 == 0 && !Static10.aBoolean10) {
			try {
				local246 = Static46.aCanvas38.getGraphics();
				for (local248 = 0; local248 < Static180.anInt4780; local248++) {
					if (Static9.aBooleanArray1[local248]) {
						Static52.aClass17_1.method1252(Static146.anIntArray376[local248], Static154.anIntArray391[local248], Static24.anIntArray49[local248], Static97.anIntArray265[local248], local246);
						Static9.aBooleanArray1[local248] = false;
					}
				}
			} catch (@Pc(284) Exception local284) {
				Static46.aCanvas38.repaint();
			}
		} else if (Static73.anInt1886 > 0) {
			try {
				local246 = Static46.aCanvas38.getGraphics();
				Static52.aClass17_1.method1250(local246);
				Static10.aBoolean10 = false;
				for (local248 = 0; local248 < Static180.anInt4780; local248++) {
					Static9.aBooleanArray1[local248] = false;
				}
			} catch (@Pc(318) Exception local318) {
				Static46.aCanvas38.repaint();
			}
		}
	}
}
