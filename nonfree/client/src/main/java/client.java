import java.awt.Color;
import java.io.IOException;
import java.net.InetAddress;
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
			if (arg0.length != 6) {
				Static4.method162();
			}
			Static22.anInt715 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static44.anInt1252 = 0;
			} else if (arg0[1].equals("office")) {
				Static44.anInt1252 = 1;
			} else if (arg0[1].equals("local")) {
				Static44.anInt1252 = 2;
			} else {
				Static4.method162();
			}
			if (arg0[2].equals("live")) {
				Static10.anInt2820 = 0;
			} else if (arg0[2].equals("rc")) {
				Static10.anInt2820 = 1;
			} else if (arg0[2].equals("wip")) {
				Static10.anInt2820 = 2;
			} else {
				Static4.method162();
			}
			if (arg0[3].equals("lowmem")) {
				Static2.method111();
			} else if (arg0[3].equals("highmem")) {
				Static82.method1311();
			} else {
				Static4.method162();
			}
			if (arg0[4].equals("free")) {
				Static23.aBoolean34 = false;
			} else if (arg0[4].equals("members")) {
				Static23.aBoolean34 = true;
			} else {
				Static4.method162();
			}
			if (arg0[5].equals("english")) {
				Static23.anInt736 = 0;
			} else if (arg0[5].equals("german")) {
				Static9.method281();
				Static23.anInt736 = 1;
			} else {
				Static4.method162();
			}
			@Pc(150) client local150 = new client();
			local150.method385(InetAddress.getLocalHost(), "runescape", Static10.anInt2820 + 32);
		} catch (@Pc(164) Exception local164) {
			Static69.method1187(local164, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method397(@OriginalArg(1) int arg0) {
		if (Static36.anInt2765 == Static23.anInt730) {
			Static23.anInt730 = Static99.anInt2503;
		} else {
			Static23.anInt730 = Static36.anInt2765;
		}
		Static90.anInt2325 = 0;
		Static34.anInt971++;
		Static115.aClass18_4 = null;
		Static24.aClass58_2 = null;
		if (Static34.anInt971 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static47.anInt1308 > 5) {
				Static109.anInt2874 = 3000;
			} else {
				this.method381("js5connect_full");
				Static47.anInt1308 = 1000;
			}
		} else if (Static34.anInt971 >= 2 && arg0 == 6) {
			this.method381("js5connect_outofdate");
			Static47.anInt1308 = 1000;
		} else if (Static34.anInt971 >= 4) {
			if (Static47.anInt1308 > 5) {
				Static109.anInt2874 = 3000;
			} else {
				this.method381("js5connect");
				Static47.anInt1308 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method394() {
		if (Static69.aBoolean83) {
			Static101.method1685(Static62.aCanvas1);
			Static91.method1532(Static62.aCanvas1);
			if (Static70.aClass38_1 != null) {
				Static70.aClass38_1.method1563(Static62.aCanvas1);
			}
			this.method390();
			Static14.method1905(Static62.aCanvas1);
			Static27.method541(Static62.aCanvas1);
			if (Static70.aClass38_1 != null) {
				Static70.aClass38_1.method1568(Static62.aCanvas1);
			}
		}
		if (Static47.anInt1308 == 0) {
			Static51.method1571(null, Static88.aClass5_1025, Static69.anInt1825);
		} else if (Static47.anInt1308 == 5) {
			Static80.method1292(Static2.aClass3_Sub1_Sub2_Sub1_1, Static48.aClass3_Sub1_Sub2_Sub1_2);
		} else if (Static47.anInt1308 == 10) {
			Static80.method1292(Static2.aClass3_Sub1_Sub2_Sub1_1, Static48.aClass3_Sub1_Sub2_Sub1_2);
		} else if (Static47.anInt1308 == 20) {
			Static80.method1292(Static2.aClass3_Sub1_Sub2_Sub1_1, Static48.aClass3_Sub1_Sub2_Sub1_2);
		} else if (Static47.anInt1308 == 25) {
			@Pc(120) int local120;
			if (Static1.anInt7 == 1) {
				if (Static110.anInt2892 < Static55.anInt1454) {
					Static110.anInt2892 = Static55.anInt1454;
				}
				local120 = (Static110.anInt2892 - Static55.anInt1454) * 50 / Static110.anInt2892;
				Static37.method697(true, Static12.aClass5_186, Static75.method1261(new Class5[] { Static68.aClass5_763, Static96.method1319(local120), Static65.aClass5_1111 }));
			} else if (Static1.anInt7 == 2) {
				if (Static75.anInt1936 < Static21.anInt704) {
					Static75.anInt1936 = Static21.anInt704;
				}
				local120 = (Static75.anInt1936 - Static21.anInt704) * 50 / Static75.anInt1936 + 50;
				Static37.method697(true, Static12.aClass5_186, Static75.method1261(new Class5[] { Static68.aClass5_763, Static96.method1319(local120), Static65.aClass5_1111 }));
			} else {
				Static37.method697(false, Static12.aClass5_186, null);
			}
		} else if (Static47.anInt1308 == 30) {
			Static65.method1626();
		} else if (Static47.anInt1308 == 35) {
			Static78.method1271();
		} else if (Static47.anInt1308 == 40) {
			Static37.method697(false, Static92.aClass5_1082, Static105.aClass5_1206);
		}
		Static50.anInt1351 = 0;
		Static93.anInt2371 = 0;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method393() {
		Static16.method396();
		Static4.method138();
		Static94.method383();
		Static76.method1689();
		Static96.method1320();
		Static47.method869();
		Static65.method1585();
		Static18.method403();
		Static108.method1893();
		Static22.method446();
		Static7.method202();
		Static2.method110();
		Static95.method1642();
		Static8.method273();
		Static59.method1058();
		Static38.method706();
		Static57.method1004();
		Static82.method1315();
		Static102.method1724();
		Static51.method1565();
		Static70.method1191();
		Static74.method1223();
		Static68.method990();
		Static89.method1508();
		Static87.method1476();
		Static23.method457();
		Static60.method1962();
		Static100.method1668();
		Static15.method359();
		Static9.method285();
		Static75.method1257();
		Static107.method1808();
		Static91.method1533();
		Static21.method435();
		Static113.method1941();
		Static116.method1972();
		Static11.method320();
		Static37.method692();
		Static36.method1794();
		Static54.method935();
		Static73.method1218();
		Static84.method1336();
		Static48.method872();
		Static20.method434();
		Static52.method915();
		Static64.method1085();
		Static3.method127();
		Static63.method1932();
		Static10.method1867();
		Static115.method1955();
		Static62.method1079();
		Static14.method1909();
		Static109.method1897();
		Static24.method461();
		Static58.method1006();
		Static92.method1545();
		Static30.method604();
		Static110.method1914();
		Static25.method502();
		Static66.method1841();
		Static12.method322();
		Static32.method645();
		Static105.method1749();
		Static88.method1498();
		Static56.method966();
		Static44.method836();
		Static90.method1527();
		Static19.method429();
		Static80.method1294();
		Static112.method1937();
		Static55.method954();
		Static101.method1688();
		Static93.method1556();
		Static71.method1209();
		Static61.method1072();
		Static46.method855();
		Static79.method1277();
		Static49.method877();
		Static114.method1952();
		Static85.method1367();
		Static27.method545();
		Static17.method402();
		Static98.method1655();
		Static81.method1297();
		Static34.method670();
		Static106.method1773();
		Static13.method325();
		Static33.method653();
		Static42.method801();
		Static40.method757();
		Static45.method852();
		Static5.method173();
		Static72.method1213();
		Static50.method901();
		Static83.method1332();
		Static111.method1920();
		Static97.method1651();
		Static35.method689();
		Static86.method1458();
		Static103.method1744();
		Static29.method589();
		Static99.method1658();
		Static78.method1272();
		Static104.method1161();
		Static53.method932();
		Static77.method1351();
		Static28.method584();
		Static1.method3();
		Static69.method1185();
		Static43.method820();
		Static31.method781();
		Static6.method185();
		Static67.method1163();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method384() {
		if (Static9.aClass34_1 != null) {
			Static9.aClass34_1.aBoolean64 = false;
		}
		Static9.aClass34_1 = null;
		if (Static58.aClass18_1 != null) {
			Static58.aClass18_1.method405();
			Static58.aClass18_1 = null;
		}
		Static5.method174();
		Static61.method1070();
		Static70.aClass38_1 = null;
		Static62.method1078();
		Static62.method1080();
		Static2.method112();
		Static68.method1000();
		try {
			if (Static70.aClass20_4 != null) {
				Static70.aClass20_4.method440();
			}
			if (Static2.aClass20Array1 != null) {
				for (@Pc(46) int local46 = 0; local46 < Static2.aClass20Array1.length; local46++) {
					if (Static2.aClass20Array1[local46] != null) {
						Static2.aClass20Array1[local46].method440();
					}
				}
			}
			if (Static35.aClass20_3 != null) {
				Static35.aClass20_3.method440();
			}
		} catch (@Pc(79) IOException local79) {
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method399() {
		if (Static24.anInt740 >= 4) {
			this.method381("js5crc");
			Static47.anInt1308 = 1000;
			return;
		}
		if (Static109.anInt2870 >= 4) {
			if (Static47.anInt1308 <= 5) {
				this.method381("js5io");
				Static47.anInt1308 = 1000;
				return;
			}
			Static109.anInt2874 = 3000;
			Static109.anInt2870 = 3;
		}
		if (Static109.anInt2874-- > 0) {
			return;
		}
		try {
			if (Static90.anInt2325 == 0) {
				Static24.aClass58_2 = Static56.aClass23_3.method523(Static23.anInt730);
				Static90.anInt2325++;
			}
			if (Static90.anInt2325 == 1) {
				if (Static24.aClass58_2.anInt2474 == 2) {
					this.method397(-1);
					return;
				}
				if (Static24.aClass58_2.anInt2474 == 1) {
					Static90.anInt2325++;
				}
			}
			if (Static90.anInt2325 == 2) {
				Static115.aClass18_4 = new Class18((Socket) Static24.aClass58_2.anObject4, Static56.aClass23_3);
				@Pc(96) Class3_Sub6 local96 = new Class3_Sub6(5);
				local96.method1608(15);
				local96.method1611(443);
				Static115.aClass18_4.method409(local96.aByteArray17, 5);
				Static90.anInt2325++;
				Static30.aLong36 = Static3.method125();
			}
			if (Static90.anInt2325 == 3) {
				if (Static47.anInt1308 <= 5 || Static115.aClass18_4.method408() > 0) {
					@Pc(151) int local151 = Static115.aClass18_4.method407();
					if (local151 != 0) {
						this.method397(local151);
						return;
					}
					Static90.anInt2325++;
				} else if (Static3.method125() - Static30.aLong36 > 30000L) {
					this.method397(-2);
					return;
				}
			}
			if (Static90.anInt2325 == 4) {
				Static42.method802(Static115.aClass18_4, Static47.anInt1308 > 20);
				Static34.anInt971 = 0;
				Static90.anInt2325 = 0;
				Static24.aClass58_2 = null;
				Static115.aClass18_4 = null;
			}
		} catch (@Pc(189) IOException local189) {
			this.method397(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method400() {
		if (Static47.anInt1308 != 1000) {
			@Pc(14) boolean local14 = Static52.method914();
			if (!local14) {
				this.method399();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method391()) {
			return;
		}
		Static22.anInt715 = Integer.parseInt(this.getParameter("worldid"));
		Static10.anInt2820 = Integer.parseInt(this.getParameter("modewhat"));
		Static44.anInt1252 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static2.method111();
		} else {
			Static82.method1311();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static23.aBoolean34 = true;
		} else {
			Static23.aBoolean34 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static9.method281();
			Static23.anInt736 = 1;
		}
		this.method379(Static10.anInt2820 + 32);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method395() {
		Static3.anInt289++;
		this.method400();
		Static106.method1776();
		Static62.method1077();
		Static43.method822();
		Static55.method951();
		Static112.method1933();
		if (Static70.aClass38_1 != null) {
			@Pc(39) int local39 = Static70.aClass38_1.method1569();
			Static104.anInt1773 = local39;
			Static93.anInt2371 += local39;
		}
		if (Static47.anInt1308 == 0) {
			Static103.method1743();
			Static33.method648();
		} else if (Static47.anInt1308 == 5) {
			Static103.method1743();
			Static33.method648();
		} else if (Static47.anInt1308 == 10) {
			Static10.method1873();
		} else if (Static47.anInt1308 == 20) {
			Static10.method1873();
			Static35.method688();
		} else if (Static47.anInt1308 == 25) {
			Static67.method1172();
		}
		if (Static47.anInt1308 == 30) {
			Static51.method1567();
		} else if (Static47.anInt1308 == 35) {
			Static51.method1567();
		} else if (Static47.anInt1308 == 40) {
			Static35.method688();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method382() {
		Static36.anInt2765 = Static44.anInt1252 == 0 ? 43594 : Static22.anInt715 + 40000;
		Static99.anInt2503 = Static44.anInt1252 == 0 ? 443 : Static22.anInt715 + 50000;
		Static23.anInt730 = Static36.anInt2765;
		Static61.method1064();
		Static14.method1905(Static62.aCanvas1);
		Static27.method541(Static62.aCanvas1);
		Static70.aClass38_1 = Static34.method669();
		if (Static70.aClass38_1 != null) {
			Static70.aClass38_1.method1568(Static62.aCanvas1);
		}
		Static58.anInt1607 = Static26.anInt789;
		try {
			if (Static56.aClass23_3.aClass10_3 != null) {
				Static70.aClass20_4 = new Class20(Static56.aClass23_3.aClass10_3, 5200, 0);
				for (@Pc(65) int local65 = 0; local65 < 14; local65++) {
					Static2.aClass20Array1[local65] = new Class20(Static56.aClass23_3.aClass10Array1[local65], 6000, 0);
				}
				Static35.aClass20_3 = new Class20(Static56.aClass23_3.aClass10_2, 6000, 0);
				Static15.aClass8_1 = new Class8(255, Static70.aClass20_4, Static35.aClass20_3, 500000);
				Static56.aClass23_3.aClass10_3 = null;
				Static56.aClass23_3.aClass10Array1 = null;
				Static56.aClass23_3.aClass10_2 = null;
			}
		} catch (@Pc(112) IOException local112) {
			Static70.aClass20_4 = null;
			Static35.aClass20_3 = null;
			Static15.aClass8_1 = null;
		}
		if (Static44.anInt1252 != 0) {
			Static30.aBoolean46 = true;
		}
		Static109.aClass3_Sub1_Sub17_5 = new Class3_Sub1_Sub17();
	}
}
