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
				Static75.method1265();
			}
			Static72.anInt1919 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static57.anInt1741 = 0;
			} else if (arg0[1].equals("office")) {
				Static57.anInt1741 = 1;
			} else if (arg0[1].equals("local")) {
				Static57.anInt1741 = 2;
			} else {
				Static75.method1265();
			}
			if (arg0[2].equals("live")) {
				Static45.anInt1253 = 0;
			} else if (arg0[2].equals("rc")) {
				Static45.anInt1253 = 1;
			} else if (arg0[2].equals("wip")) {
				Static45.anInt1253 = 2;
			} else {
				Static75.method1265();
			}
			if (arg0[3].equals("lowmem")) {
				Static121.method1883();
			} else if (arg0[3].equals("highmem")) {
				Static111.method1791();
			} else {
				Static75.method1265();
			}
			if (arg0[4].equals("free")) {
				Static123.aBoolean277 = false;
			} else if (arg0[4].equals("members")) {
				Static123.aBoolean277 = true;
			} else {
				Static75.method1265();
			}
			if (arg0[5].equals("english")) {
				Static16.anInt379 = 0;
			} else if (arg0[5].equals("german")) {
				Static85.method1501();
				Static16.anInt379 = 1;
				Static64.aClass22_484 = Static23.aClass22_158;
			} else {
				Static75.method1265();
			}
			if (arg0[6].equals("game0")) {
				Static130.anInt3095 = 0;
			} else if (arg0[6].equals("game1")) {
				Static130.anInt3095 = 1;
			} else {
				Static75.method1265();
			}
			Static128.aString4 = "127.0.0.1";
			@Pc(178) client local178 = new client();
			local178.method339("runescape", Static45.anInt1253 + 32);
		} catch (@Pc(192) Exception local192) {
			Static91.method1588(local192, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method336() {
		Static117.anInt2877++;
		this.method358();
		Static50.method970();
		Static133.method2035();
		Static104.method1724();
		Static101.method1700();
		Static115.method1827();
		if (Static84.aClass31_1 != null) {
			@Pc(30) int local30 = Static84.aClass31_1.method947();
			Static59.anInt1766 = local30;
		}
		if (Static112.anInt2775 == 0) {
			Static128.method1976();
			Static94.method1628();
		} else if (Static112.anInt2775 == 5) {
			Static19.method373(this);
			Static128.method1976();
			Static94.method1628();
		} else if (Static112.anInt2775 == 10) {
			Static19.method373(this);
		} else if (Static112.anInt2775 == 20) {
			Static19.method373(this);
			Static37.method583();
		} else if (Static112.anInt2775 == 25) {
			Static98.method1668();
		}
		if (Static112.anInt2775 == 30) {
			Static61.method1120();
		} else if (Static112.anInt2775 == 40) {
			Static37.method583();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method341() {
		Static18.method353();
		Static28.method448();
		Static68.method350();
		Static8.method1572();
		Static42.method579();
		Static110.method1774();
		Static55.method695();
		Static7.method131();
		Static38.method615();
		Static129.method1989();
		Static112.method1795();
		Static92.method1619();
		Static41.method749();
		Static127.method1963();
		Static97.method1653();
		Static31.method526();
		Static57.method1095();
		Static132.method2031();
		Static131.method2012();
		Static122.method944();
		Static32.method541();
		Static95.method1200();
		Static29.method488();
		Static27.method434();
		Static126.method1910();
		Static96.method1606();
		Static19.method371();
		Static79.method1436();
		Static121.method1885();
		Static123.method2003();
		Static124.method1888();
		Static1.method3();
		Static52.method1001();
		Static83.method1485();
		Static86.method1534();
		Static48.method900();
		Static134.method2039();
		Static15.method281();
		Static130.method2005();
		Static39.method625();
		Static85.method1499();
		Static22.method1813();
		Static3.method10();
		Static98.method1669();
		Static62.method1125();
		Static133.method2037();
		Static40.method626();
		Static104.method1726();
		Static53.method1005();
		Static66.method1160();
		Static90.method1576();
		Static44.method858();
		Static115.method1825();
		Static72.method1185();
		Static26.method593();
		Static13.method221();
		Static56.method1031();
		Static5.method42();
		Static9.method156();
		Static84.method1496();
		Static23.method392();
		Static16.method283();
		Static87.method1542();
		Static128.method1973();
		Static91.method1591();
		Static78.method1306();
		Static2.method5();
		Static113.method1801();
		Static118.method1384();
		Static11.method1908();
		Static6.method114();
		Static64.method1139();
		Static100.method1678();
		Static35.method574();
		Static60.method1114();
		Static107.method1753();
		Static49.method924();
		Static30.method508();
		Static54.method1018();
		Static45.method880();
		Static51.method993();
		Static101.method1701();
		Static111.method1785();
		Static4.method41();
		Static50.method965();
		Static116.method1842();
		Static108.method1768();
		Static81.method1412();
		Static117.method1851();
		Static125.method1899();
		Static12.method170();
		Static24.method398();
		Static99.method1672();
		Static94.method1629();
		Static89.method1569();
		Static80.method1448();
		Static120.method1873();
		Static74.method1209();
		Static65.method1154();
		Static10.method164();
		Static70.method1174();
		Static105.method1730();
		Static20.method379();
		Static106.method1748();
		Static114.method1823();
		Static33.method550();
		Static14.method275();
		Static88.method1559();
		Static34.method557();
		Static93.method1622();
		Static46.method892();
		Static103.method1720();
		Static67.method1168();
		Static37.method585();
		Static109.method153();
		Static73.method1206();
		Static82.method1452();
		Static75.method1266();
		Static58.method1102();
		Static17.method318();
		Static47.method896();
		Static71.method1182();
		Static36.method576();
		Static76.method1280();
		Static119.method1859();
		Static102.method1710();
		Static69.method1171();
		Static43.method817();
		Static59.method1103();
		Static77.method1291();
		Static63.method1132();
		Static61.method1121();
		Static25.method404();
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method354() {
		if (Static18.anInt509 >= 4) {
			this.method352("js5crc");
			Static112.anInt2775 = 1000;
			return;
		}
		if (Static50.anInt1407 >= 4) {
			if (Static112.anInt2775 <= 5) {
				this.method352("js5io");
				Static112.anInt2775 = 1000;
				return;
			}
			Static93.anInt2531 = 3000;
			Static50.anInt1407 = 3;
		}
		if (Static93.anInt2531-- > 0) {
			return;
		}
		try {
			if (Static115.anInt2833 == 0) {
				Static45.aClass12_7 = Static130.aClass17_4.method389(Static128.aString4, Static34.anInt859);
				Static115.anInt2833++;
			}
			if (Static115.anInt2833 == 1) {
				if (Static45.aClass12_7.anInt373 == 2) {
					this.method356(-1);
					return;
				}
				if (Static45.aClass12_7.anInt373 == 1) {
					Static115.anInt2833++;
				}
			}
			if (Static115.anInt2833 == 2) {
				Static54.aClass6_2 = new Class6((Socket) Static45.aClass12_7.anObject1, Static130.aClass17_4);
				@Pc(100) Class4_Sub11 local100 = new Class4_Sub11(5);
				local100.method701(15);
				local100.method717(468);
				Static54.aClass6_2.method133(local100.aByteArray9, 5);
				Static115.anInt2833++;
				Static55.aLong36 = Static44.method861();
			}
			if (Static115.anInt2833 == 3) {
				if (Static112.anInt2775 <= 5 || Static54.aClass6_2.method135() > 0) {
					@Pc(151) int local151 = Static54.aClass6_2.method130();
					if (local151 != 0) {
						this.method356(local151);
						return;
					}
					Static115.anInt2833++;
				} else if (Static44.method861() - Static55.aLong36 > 30000L) {
					this.method356(-2);
					return;
				}
			}
			if (Static115.anInt2833 == 4) {
				Static113.method1800(Static54.aClass6_2, Static112.anInt2775 > 20);
				Static115.anInt2833 = 0;
				Static54.aClass6_2 = null;
				Static42.anInt889 = 0;
				Static45.aClass12_7 = null;
			}
		} catch (@Pc(188) IOException local188) {
			this.method356(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method351() {
		@Pc(8) boolean local8 = Static7.method137();
		if (local8 && Static93.aBoolean223 && Static31.aClass15_2 != null) {
			Static31.aClass15_2.method1198();
		}
		if (Static133.aBoolean285) {
			Static14.method280(Static89.aCanvas1);
			Static105.method1731(Static89.aCanvas1);
			if (Static84.aClass31_1 != null) {
				Static84.aClass31_1.method945(Static89.aCanvas1);
			}
			this.method347();
			Static44.method857(Static89.aCanvas1);
			Static106.method1747(Static89.aCanvas1);
			if (Static84.aClass31_1 != null) {
				Static84.aClass31_1.method949(Static89.aCanvas1);
			}
		}
		if (Static112.anInt2775 == 0) {
			Static115.method1828(Static61.aClass22_473, null, Static7.anInt160);
		} else if (Static112.anInt2775 == 5) {
			Static134.method2040(Static18.aClass4_Sub1_Sub2_Sub4_Sub1_1, Static33.aClass4_Sub1_Sub2_Sub4_Sub1_2);
		} else if (Static112.anInt2775 == 10) {
			Static134.method2040(Static18.aClass4_Sub1_Sub2_Sub4_Sub1_1, Static33.aClass4_Sub1_Sub2_Sub4_Sub1_2);
		} else if (Static112.anInt2775 == 20) {
			Static134.method2040(Static18.aClass4_Sub1_Sub2_Sub4_Sub1_1, Static33.aClass4_Sub1_Sub2_Sub4_Sub1_2);
		} else if (Static112.anInt2775 == 25) {
			@Pc(153) int local153;
			if (Static99.anInt2586 == 1) {
				if (Static45.anInt1249 < Static32.anInt819) {
					Static45.anInt1249 = Static32.anInt819;
				}
				local153 = (Static45.anInt1249 - Static32.anInt819) * 50 / Static45.anInt1249;
				Static12.method165(Static44.method856(new Class22[] { Static42.aClass22_252, Static96.aClass22_711, Static134.method2042(local153), Static1.aClass22_6 }), false);
			} else if (Static99.anInt2586 == 2) {
				if (Static129.anInt3052 > Static32.anInt820) {
					Static32.anInt820 = Static129.anInt3052;
				}
				local153 = (Static32.anInt820 - Static129.anInt3052) * 50 / Static32.anInt820 + 50;
				Static12.method165(Static44.method856(new Class22[] { Static42.aClass22_252, Static96.aClass22_711, Static134.method2042(local153), Static1.aClass22_6 }), false);
			} else {
				Static12.method165(Static42.aClass22_252, false);
			}
		} else if (Static112.anInt2775 == 30) {
			Static50.method966();
		} else if (Static112.anInt2775 == 40) {
			Static12.method165(Static44.method856(new Class22[] { Static13.aClass22_84, Static130.aClass22_954, Static72.aClass22_527 }), false);
		}
		@Pc(256) int local256;
		@Pc(254) Graphics local254;
		if (Static112.anInt2775 == 30 && Static76.anInt2022 == 0 && !Static1.aBoolean1) {
			try {
				local254 = Static89.aCanvas1.getGraphics();
				for (local256 = 0; local256 < Static111.anInt2765; local256++) {
					if (Static67.aBooleanArray11[local256]) {
						Static43.aClass11_1.method582(local254, Static24.anIntArray62[local256], Static16.anIntArray42[local256], Static121.anIntArray317[local256], Static103.anIntArray294[local256]);
						Static67.aBooleanArray11[local256] = false;
					}
				}
			} catch (@Pc(292) Exception local292) {
				Static89.aCanvas1.repaint();
			}
		} else if (Static112.anInt2775 > 0) {
			try {
				local254 = Static89.aCanvas1.getGraphics();
				Static43.aClass11_1.method578(local254);
				Static1.aBoolean1 = false;
				for (local256 = 0; local256 < Static111.anInt2765; local256++) {
					Static67.aBooleanArray11[local256] = false;
				}
			} catch (@Pc(322) Exception local322) {
				Static89.aCanvas1.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method356(@OriginalArg(1) int arg0) {
		if (Static22.anInt2810 == Static34.anInt859) {
			Static34.anInt859 = Static11.anInt2984;
		} else {
			Static34.anInt859 = Static22.anInt2810;
		}
		Static42.anInt889++;
		Static115.anInt2833 = 0;
		Static45.aClass12_7 = null;
		Static54.aClass6_2 = null;
		if (Static42.anInt889 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static112.anInt2775 <= 5) {
				this.method352("js5connect_full");
				Static112.anInt2775 = 1000;
			} else {
				Static93.anInt2531 = 3000;
			}
		} else if (Static42.anInt889 >= 2 && arg0 == 6) {
			this.method352("js5connect_outofdate");
			Static112.anInt2775 = 1000;
		} else if (Static42.anInt889 >= 4) {
			if (Static112.anInt2775 > 5) {
				Static93.anInt2531 = 3000;
			} else {
				this.method352("js5connect");
				Static112.anInt2775 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method344() {
		if (Static115.aClass70_1 != null) {
			Static115.aClass70_1.aBoolean243 = false;
		}
		Static115.aClass70_1 = null;
		if (Static120.aClass6_4 != null) {
			Static120.aClass6_4.method136();
			Static120.aClass6_4 = null;
		}
		Static110.method1773();
		Static88.method1558();
		Static84.aClass31_1 = null;
		if (Static31.aClass15_2 != null) {
			Static31.aClass15_2.method1189();
		}
		if (Static25.aClass15_1 != null) {
			Static25.aClass15_1.method1189();
		}
		Static35.method572();
		Static52.method1002();
		try {
			if (Static38.aClass79_1 != null) {
				Static38.aClass79_1.method1983();
			}
			if (Static98.aClass79Array1 != null) {
				for (@Pc(53) int local53 = 0; local53 < Static98.aClass79Array1.length; local53++) {
					if (Static98.aClass79Array1[local53] != null) {
						Static98.aClass79Array1[local53].method1983();
					}
				}
			}
			if (Static129.aClass79_5 != null) {
				Static129.aClass79_5.method1983();
			}
			if (Static111.aClass79_2 != null) {
				Static111.aClass79_2.method1983();
			}
		} catch (@Pc(81) IOException local81) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method338() {
		Static11.anInt2984 = Static57.anInt1741 == 0 ? 443 : Static72.anInt1919 + 50000;
		if (Static130.anInt3095 == 1) {
			Static88.aShortArrayArray2 = Static46.aShortArrayArray1;
			Static117.aShortArrayArray4 = Static134.aShortArrayArray6;
			Static35.aShortArray2 = Static70.aShortArray19;
			Static7.aShortArray1 = Static55.aShortArray4;
		} else {
			Static88.aShortArrayArray2 = Static129.aShortArrayArray5;
			Static35.aShortArray2 = Static69.aShortArray18;
			Static117.aShortArrayArray4 = Static113.aShortArrayArray3;
			Static7.aShortArray1 = Static124.aShortArray40;
		}
		Static22.anInt2810 = Static57.anInt1741 == 0 ? 43594 : Static72.anInt1919 + 40000;
		Static34.anInt859 = Static22.anInt2810;
		Static10.method163();
		Static44.method857(Static89.aCanvas1);
		Static106.method1747(Static89.aCanvas1);
		Static84.aClass31_1 = Static32.method542();
		if (Static84.aClass31_1 != null) {
			Static84.aClass31_1.method949(Static89.aCanvas1);
		}
		Static57.anInt1742 = Static21.anInt548;
		try {
			if (Static130.aClass17_4.aClass42_1 != null) {
				Static38.aClass79_1 = new Class79(Static130.aClass17_4.aClass42_1, 5200, 0);
				for (@Pc(83) int local83 = 0; local83 < 16; local83++) {
					Static98.aClass79Array1[local83] = new Class79(Static130.aClass17_4.aClass42Array1[local83], 6000, 0);
				}
				Static129.aClass79_5 = new Class79(Static130.aClass17_4.aClass42_2, 6000, 0);
				Static110.aClass71_3 = new Class71(255, Static38.aClass79_1, Static129.aClass79_5, 500000);
				Static111.aClass79_2 = new Class79(Static130.aClass17_4.aClass42_3, 24, 0);
				Static130.aClass17_4.aClass42_2 = null;
				Static130.aClass17_4.aClass42_1 = null;
				Static130.aClass17_4.aClass42Array1 = null;
				Static130.aClass17_4.aClass42_3 = null;
			}
		} catch (@Pc(141) IOException local141) {
			Static38.aClass79_1 = null;
			Static110.aClass71_3 = null;
			Static129.aClass79_5 = null;
			Static111.aClass79_2 = null;
		}
		if (Static57.anInt1741 != 0) {
			Static132.aBoolean283 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method337()) {
			return;
		}
		Static72.anInt1919 = Integer.parseInt(this.getParameter("worldid"));
		Static45.anInt1253 = Integer.parseInt(this.getParameter("modewhat"));
		Static57.anInt1741 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static121.method1883();
		} else {
			Static111.method1791();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static123.aBoolean277 = true;
		} else {
			Static123.aBoolean277 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static85.method1501();
			Static16.anInt379 = 1;
			Static64.aClass22_484 = Static23.aClass22_158;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static130.anInt3095 = 1;
		} else {
			Static130.anInt3095 = 0;
		}
		try {
			Static108.anInt2725 = Integer.parseInt(this.getParameter("js"));
			Static89.anInt2372 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(101) Exception local101) {
		}
		Static128.aString4 = this.getCodeBase().getHost();
		this.method349(Static45.anInt1253 + 32);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method358() {
		if (Static112.anInt2775 != 1000) {
			@Pc(12) boolean local12 = Static56.method1030();
			if (!local12) {
				this.method354();
			}
		}
	}
}
