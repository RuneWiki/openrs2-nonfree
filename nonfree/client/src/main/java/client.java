import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
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
				Static7.method100();
			}
			Static28.anInt591 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static21.anInt508 = 0;
			} else if (arg0[1].equals("office")) {
				Static21.anInt508 = 1;
			} else if (arg0[1].equals("local")) {
				Static21.anInt508 = 2;
			} else {
				Static7.method100();
			}
			if (arg0[2].equals("live")) {
				Static128.anInt2752 = 0;
			} else if (arg0[2].equals("rc")) {
				Static128.anInt2752 = 1;
			} else if (arg0[2].equals("wip")) {
				Static128.anInt2752 = 2;
			} else {
				Static7.method100();
			}
			if (arg0[3].equals("lowmem")) {
				Static30.method972();
			} else if (arg0[3].equals("highmem")) {
				Static111.method1712();
			} else {
				Static7.method100();
			}
			if (arg0[4].equals("free")) {
				Static68.aBoolean108 = false;
			} else if (arg0[4].equals("members")) {
				Static68.aBoolean108 = true;
			} else {
				Static7.method100();
			}
			if (arg0[5].equals("english")) {
				Static55.anInt1445 = 0;
			} else if (arg0[5].equals("german")) {
				Static92.method1496();
				Static133.aClass76_1321 = Static76.aClass76_831;
				Static55.anInt1445 = 1;
			} else {
				Static7.method100();
			}
			if (arg0[6].equals("game0")) {
				Static38.anInt1092 = 0;
			} else if (arg0[6].equals("game1")) {
				Static38.anInt1092 = 1;
			} else {
				Static7.method100();
			}
			Static104.aString4 = "127.0.0.1";
			@Pc(174) client local174 = new client();
			local174.method224(Static128.anInt2752 + 32, "runescape");
		} catch (@Pc(187) Exception local187) {
			Static102.method1593(null, local187);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method228() {
		if (Static115.anInt2500 >= 4) {
			this.method223("js5crc");
			Static39.anInt1113 = 1000;
			return;
		}
		if (Static85.anInt2051 >= 4) {
			if (Static39.anInt1113 <= 5) {
				this.method223("js5io");
				Static39.anInt1113 = 1000;
				return;
			}
			Static33.anInt960 = 3000;
			Static85.anInt2051 = 3;
		}
		if (Static33.anInt960-- > 0) {
			return;
		}
		try {
			if (Static99.anInt2770 == 0) {
				Static113.aClass24_6 = Static121.aClass14_3.method193(Static104.aString4, Static6.anInt138);
				Static99.anInt2770++;
			}
			if (Static99.anInt2770 == 1) {
				if (Static113.aClass24_6.anInt814 == 2) {
					this.method233(-1);
					return;
				}
				if (Static113.aClass24_6.anInt814 == 1) {
					Static99.anInt2770++;
				}
			}
			if (Static99.anInt2770 == 2) {
				Static114.aClass75_5 = new Class75((Socket) Static113.aClass24_6.anObject10, Static121.aClass14_3);
				@Pc(98) Class4_Sub10 local98 = new Class4_Sub10(5);
				local98.method600(15);
				local98.method597(469);
				Static114.aClass75_5.method1849(5, local98.aByteArray17);
				Static99.anInt2770++;
				Static123.aLong97 = Static42.method793();
			}
			if (Static99.anInt2770 == 3) {
				if (Static39.anInt1113 <= 5 || Static114.aClass75_5.method1844() > 0) {
					@Pc(134) int local134 = Static114.aClass75_5.method1848();
					if (local134 != 0) {
						this.method233(local134);
						return;
					}
					Static99.anInt2770++;
				} else if (Static42.method793() - Static123.aLong97 > 30000L) {
					this.method233(-2);
					return;
				}
			}
			if (Static99.anInt2770 == 4) {
				Static49.method855(Static39.anInt1113 > 20, Static114.aClass75_5);
				Static114.anInt2468 = 0;
				Static99.anInt2770 = 0;
				Static113.aClass24_6 = null;
				Static114.aClass75_5 = null;
			}
		} catch (@Pc(185) IOException local185) {
			this.method233(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method213() {
		Static34.anInt967 = Static21.anInt508 == 0 ? 443 : Static28.anInt591 + 50000;
		Static38.anInt1095 = Static21.anInt508 == 0 ? 43594 : Static28.anInt591 + 40000;
		Static6.anInt138 = Static38.anInt1095;
		if (Static38.anInt1092 == 1) {
			Static13.aShortArrayArray3 = Static113.aShortArrayArray6;
			Static82.aShortArray19 = Static112.aShortArray37;
			Static106.aShortArrayArray5 = Static12.aShortArrayArray2;
			Static74.aShortArray17 = Static78.aShortArray18;
		} else {
			Static13.aShortArrayArray3 = Static57.aShortArrayArray4;
			Static106.aShortArrayArray5 = Static1.aShortArrayArray1;
			Static74.aShortArray17 = Static107.aShortArray24;
			Static82.aShortArray19 = Static110.aShortArray36;
		}
		Static61.method1042();
		Static17.method235(Static1.aCanvas1);
		Static122.method1890(Static1.aCanvas1);
		Static119.aClass16_1 = Static111.method1713();
		if (Static119.aClass16_1 != null) {
			Static119.aClass16_1.method788(Static1.aCanvas1);
		}
		Static48.anInt1234 = Static16.anInt263;
		try {
			if (Static121.aClass14_3.aClass11_1 != null) {
				Static66.aClass68_7 = new Class68(Static121.aClass14_3.aClass11_1, 5200, 0);
				for (@Pc(84) int local84 = 0; local84 < 16; local84++) {
					Static20.aClass68Array1[local84] = new Class68(Static121.aClass14_3.aClass11Array1[local84], 6000, 0);
				}
				Static54.aClass68_14 = new Class68(Static121.aClass14_3.aClass11_3, 6000, 0);
				Static77.aClass58_4 = new Class58(255, Static66.aClass68_7, Static54.aClass68_14, 500000);
				Static69.aClass68_9 = new Class68(Static121.aClass14_3.aClass11_2, 24, 0);
				Static121.aClass14_3.aClass11_1 = null;
				Static121.aClass14_3.aClass11_3 = null;
				Static121.aClass14_3.aClass11Array1 = null;
				Static121.aClass14_3.aClass11_2 = null;
			}
		} catch (@Pc(140) IOException local140) {
			Static54.aClass68_14 = null;
			Static77.aClass58_4 = null;
			Static69.aClass68_9 = null;
			Static66.aClass68_7 = null;
		}
		if (Static21.anInt508 != 0) {
			Static126.aBoolean156 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method219()) {
			return;
		}
		Static28.anInt591 = Integer.parseInt(this.getParameter("worldid"));
		Static128.anInt2752 = Integer.parseInt(this.getParameter("modewhat"));
		Static21.anInt508 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static30.method972();
		} else {
			Static111.method1712();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static68.aBoolean108 = true;
		} else {
			Static68.aBoolean108 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static92.method1496();
			Static55.anInt1445 = 1;
			Static133.aClass76_1321 = Static76.aClass76_831;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static38.anInt1092 = 1;
		} else {
			Static38.anInt1092 = 0;
		}
		try {
			Static36.anInt1017 = Integer.parseInt(this.getParameter("js"));
			Static132.anInt2821 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(101) Exception local101) {
		}
		Static104.aString4 = this.getCodeBase().getHost();
		this.method227(Static128.anInt2752 + 32);
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method230() {
		if (Static39.anInt1113 != 1000) {
			@Pc(18) boolean local18 = Static17.method232();
			if (!local18) {
				this.method228();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method218() {
		Static78.anInt1981++;
		this.method230();
		Static63.method1093();
		Static124.method1903();
		Static20.method310();
		Static103.method1597();
		Static45.method813();
		if (Static119.aClass16_1 != null) {
			@Pc(32) int local32 = Static119.aClass16_1.method790();
			Static124.anInt2718 = local32;
		}
		if (Static39.anInt1113 == 0) {
			Static2.method13();
			Static13.method164();
		} else if (Static39.anInt1113 == 5) {
			Static94.method1514(this);
			Static2.method13();
			Static13.method164();
		} else if (Static39.anInt1113 == 10) {
			Static94.method1514(this);
		} else if (Static39.anInt1113 == 20) {
			Static94.method1514(this);
			Static128.method1933();
		} else if (Static39.anInt1113 == 25) {
			Static115.method1741();
		}
		if (Static39.anInt1113 == 30) {
			Static113.method1719();
		} else if (Static39.anInt1113 == 40) {
			Static128.method1933();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method225() {
		@Pc(8) boolean local8 = Static10.method136();
		if (local8 && Static18.aBoolean22 && Static12.aClass3_1 != null) {
			Static12.aClass3_1.method1522();
		}
		if (Static40.aBoolean68) {
			Static110.method1683(Static1.aCanvas1);
			Static43.method214(Static1.aCanvas1);
			if (Static119.aClass16_1 != null) {
				Static119.aClass16_1.method789(Static1.aCanvas1);
			}
			this.method211();
			Static17.method235(Static1.aCanvas1);
			Static122.method1890(Static1.aCanvas1);
			if (Static119.aClass16_1 != null) {
				Static119.aClass16_1.method788(Static1.aCanvas1);
			}
		}
		if (Static39.anInt1113 == 0) {
			Static94.method1513(Static88.anInt2089, Static111.aClass76_1155, null);
		} else if (Static39.anInt1113 == 5) {
			Static130.method1946(Static126.aClass4_Sub4_Sub5_Sub3_Sub1_6, Static87.aClass4_Sub4_Sub5_Sub3_Sub1_4);
		} else if (Static39.anInt1113 == 10) {
			Static130.method1946(Static126.aClass4_Sub4_Sub5_Sub3_Sub1_6, Static87.aClass4_Sub4_Sub5_Sub3_Sub1_4);
		} else if (Static39.anInt1113 == 20) {
			Static130.method1946(Static126.aClass4_Sub4_Sub5_Sub3_Sub1_6, Static87.aClass4_Sub4_Sub5_Sub3_Sub1_4);
		} else if (Static39.anInt1113 == 25) {
			@Pc(138) int local138;
			if (Static122.anInt2653 == 1) {
				if (Static84.anInt2030 > Static60.anInt1574) {
					Static60.anInt1574 = Static84.anInt2030;
				}
				local138 = (Static60.anInt1574 - Static84.anInt2030) * 50 / Static60.anInt1574;
				Static9.method113(false, Static59.method1017(new Class76[] { Static127.aClass76_1288, Static42.aClass76_497, Static63.method1092(local138), Static21.aClass76_196 }));
			} else if (Static122.anInt2653 == 2) {
				if (Static134.anInt2840 > Static78.anInt1985) {
					Static78.anInt1985 = Static134.anInt2840;
				}
				local138 = (Static78.anInt1985 - Static134.anInt2840) * 50 / Static78.anInt1985 + 50;
				Static9.method113(false, Static59.method1017(new Class76[] { Static127.aClass76_1288, Static42.aClass76_497, Static63.method1092(local138), Static21.aClass76_196 }));
			} else {
				Static9.method113(false, Static127.aClass76_1288);
			}
		} else if (Static39.anInt1113 == 30) {
			Static58.method1012();
		} else if (Static39.anInt1113 == 40) {
			Static9.method113(false, Static59.method1017(new Class76[] { Static74.aClass76_817, Static95.aClass76_988, Static67.aClass76_719 }));
		}
		@Pc(255) int local255;
		@Pc(245) Graphics local245;
		if (Static39.anInt1113 == 30 && Static13.anInt223 == 0 && !Static104.aBoolean138) {
			try {
				local245 = Static1.aCanvas1.getGraphics();
				for (local255 = 0; local255 < Static77.anInt1960; local255++) {
					if (Static132.aBooleanArray18[local255]) {
						Static118.aClass43_1.method1907(Static41.anIntArray131[local255], Static126.anIntArray396[local255], Static30.anIntArray185[local255], Static134.anIntArray409[local255], local245);
						Static132.aBooleanArray18[local255] = false;
					}
				}
			} catch (@Pc(307) Exception local307) {
				Static1.aCanvas1.repaint();
			}
		} else if (Static39.anInt1113 > 0) {
			try {
				local245 = Static1.aCanvas1.getGraphics();
				Static118.aClass43_1.method1908(local245);
				Static104.aBoolean138 = false;
				for (local255 = 0; local255 < Static77.anInt1960; local255++) {
					Static132.aBooleanArray18[local255] = false;
				}
			} catch (@Pc(267) Exception local267) {
				Static1.aCanvas1.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method233(@OriginalArg(0) int arg0) {
		Static114.aClass75_5 = null;
		Static113.aClass24_6 = null;
		Static99.anInt2770 = 0;
		if (Static6.anInt138 == Static38.anInt1095) {
			Static6.anInt138 = Static34.anInt967;
		} else {
			Static6.anInt138 = Static38.anInt1095;
		}
		Static114.anInt2468++;
		if (Static114.anInt2468 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static39.anInt1113 > 5) {
				Static33.anInt960 = 3000;
			} else {
				this.method223("js5connect_full");
				Static39.anInt1113 = 1000;
			}
		} else if (Static114.anInt2468 >= 2 && arg0 == 6) {
			this.method223("js5connect_outofdate");
			Static39.anInt1113 = 1000;
		} else if (Static114.anInt2468 >= 4) {
			if (Static39.anInt1113 > 5) {
				Static33.anInt960 = 3000;
			} else {
				this.method223("js5connect");
				Static39.anInt1113 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method226() {
		Static17.method236();
		Static122.method1870();
		Static43.method222();
		Static87.method1400();
		Static125.method1905();
		Static24.method355();
		Static79.method564();
		Static121.method1841();
		Static20.method306();
		Static110.method1674();
		Static94.method1512();
		Static32.method477();
		Static33.method615();
		Static131.method1986();
		Static76.method1392();
		Static21.method330();
		Static55.method979();
		Static127.method1926();
		Static40.method772();
		Static19.method786();
		Static111.method1711();
		Static3.method1518();
		Static124.method1902();
		Static35.method632();
		Static60.method1038();
		Static30.method974();
		Static85.method1438();
		Static67.method1135();
		Static78.method1408();
		Static27.method2002();
		Static13.method165();
		Static77.method1393();
		Static117.method1782();
		Static116.method1766();
		Static108.method1656();
		Static34.method619();
		Static107.method1619();
		Static95.method1534();
		Static50.method874();
		Static74.method1369();
		Static120.method1806();
		Static54.method1755();
		Static113.method1722();
		Static52.method943();
		Static73.method1360();
		Static104.method1605();
		Static44.method795();
		Static84.method1428();
		Static6.method86();
		Static82.method1422();
		Static90.method1481();
		Static42.method792();
		Static48.method840();
		Static119.method1800();
		Static65.method294();
		Static62.method1090();
		Static72.method1353();
		Static129.method1934();
		Static28.method381();
		Static102.method1594();
		Static56.method982();
		Static58.method1011();
		Static9.method115();
		Static134.method2018();
		Static118.method1798();
		Static114.method1726();
		Static12.method151();
		Static15.method183();
		Static46.method1822();
		Static99.method1942();
		Static37.method716();
		Static123.method1897();
		Static71.method1337();
		Static39.method764();
		Static132.method2007();
		Static61.method1041();
		Static70.method1168();
		Static10.method135();
		Static25.method370();
		Static57.method1001();
		Static49.method850();
		Static130.method1949();
		Static96.method1546();
		Static98.method1576();
		Static31.method447();
		Static47.method833();
		Static81.method1418();
		Static83.method1319();
		Static41.method780();
		Static89.method1475();
		Static29.method383();
		Static128.method1928();
		Static91.method1483();
		Static106.method1616();
		Static105.method1611();
		Static5.method75();
		Static97.method1558();
		Static18.method238();
		Static133.method2012();
		Static100.method1582();
		Static23.method351();
		Static63.method1096();
		Static53.method947();
		Static36.method653();
		Static69.method1157();
		Static8.method107();
		Static45.method817();
		Static115.method1742();
		Static7.method97();
		Static64.method1098();
		Static126.method1911();
		Static103.method1596();
		Static2.method16();
		Static66.method1115();
		Static51.method1458();
		Static93.method1500();
		Static101.method1591();
		Static112.method1715();
		Static68.method1140();
		Static4.method56();
		Static109.method1665();
		Static59.method1015();
		Static80.method1409();
		Static38.method736();
		Static14.method173();
		Static22.method344();
		Static75.method1371();
		Static88.method1469();
		Static26.method374();
		Static86.method1446();
		Static11.method144();
		Static1.method4();
		Static92.method1495();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method220() {
		if (Static93.aClass20_1 != null) {
			Static93.aClass20_1.aBoolean44 = false;
		}
		Static93.aClass20_1 = null;
		if (Static48.aClass75_4 != null) {
			Static48.aClass75_4.method1842();
			Static48.aClass75_4 = null;
		}
		Static113.method1717();
		Static32.method481();
		Static119.aClass16_1 = null;
		if (Static12.aClass3_1 != null) {
			Static12.aClass3_1.method1533();
		}
		if (Static74.aClass3_2 != null) {
			Static74.aClass3_2.method1533();
		}
		Static18.method240();
		Static6.method83();
		try {
			if (Static66.aClass68_7 != null) {
				Static66.aClass68_7.method1676();
			}
			if (Static20.aClass68Array1 != null) {
				for (@Pc(54) int local54 = 0; local54 < Static20.aClass68Array1.length; local54++) {
					if (Static20.aClass68Array1[local54] != null) {
						Static20.aClass68Array1[local54].method1676();
					}
				}
			}
			if (Static54.aClass68_14 != null) {
				Static54.aClass68_14.method1676();
			}
			if (Static69.aClass68_9 != null) {
				Static69.aClass68_9.method1676();
			}
		} catch (@Pc(82) IOException local82) {
		}
	}
}
