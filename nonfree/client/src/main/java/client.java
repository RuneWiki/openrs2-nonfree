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
				Static93.method1750();
			}
			Static88.anInt1141 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static38.anInt1159 = 0;
			} else if (arg0[1].equals("office")) {
				Static38.anInt1159 = 1;
			} else if (arg0[1].equals("local")) {
				Static38.anInt1159 = 2;
			} else {
				Static93.method1750();
			}
			if (arg0[2].equals("live")) {
				Static95.anInt2503 = 0;
			} else if (arg0[2].equals("rc")) {
				Static95.anInt2503 = 1;
			} else if (arg0[2].equals("wip")) {
				Static95.anInt2503 = 2;
			} else {
				Static93.method1750();
			}
			if (arg0[3].equals("lowmem")) {
				Static28.method564();
			} else if (arg0[3].equals("highmem")) {
				Static95.method1806();
			} else {
				Static93.method1750();
			}
			if (arg0[4].equals("free")) {
				Static24.aBoolean40 = false;
			} else if (arg0[4].equals("members")) {
				Static24.aBoolean40 = true;
			} else {
				Static93.method1750();
			}
			if (arg0[5].equals("english")) {
				Static46.anInt1246 = 0;
			} else if (arg0[5].equals("german")) {
				Static102.method1972();
				Static46.anInt1246 = 1;
			} else {
				Static93.method1750();
			}
			@Pc(150) client local150 = new client();
			local150.method367("runescape", Static95.anInt2503 + 32, InetAddress.getLocalHost());
		} catch (@Pc(164) Exception local164) {
			Static108.method2075(local164, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method372()) {
			return;
		}
		Static88.anInt1141 = Integer.parseInt(this.getParameter("worldid"));
		Static95.anInt2503 = Integer.parseInt(this.getParameter("modewhat"));
		Static38.anInt1159 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static28.method564();
		} else {
			Static95.method1806();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static24.aBoolean40 = true;
		} else {
			Static24.aBoolean40 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static102.method1972();
			Static46.anInt1246 = 1;
		}
		this.method361(Static95.anInt2503 + 32);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method379() {
		if (Static46.anInt1256 >= 4) {
			this.method359("js5crc");
			Static18.anInt554 = 1000;
			return;
		}
		if (Static47.anInt1325 >= 4) {
			if (Static18.anInt554 <= 5) {
				this.method359("js5io");
				Static18.anInt554 = 1000;
				return;
			}
			Static77.anInt2110 = 3000;
			Static47.anInt1325 = 3;
		}
		if (Static77.anInt2110-- > 0) {
			return;
		}
		try {
			if (Static85.anInt2292 == 0) {
				Static23.aClass19_4 = Static61.aClass12_3.method322(Static95.anInt2515);
				Static85.anInt2292++;
			}
			if (Static85.anInt2292 == 1) {
				if (Static23.aClass19_4.anInt799 == 2) {
					this.method381(-1);
					return;
				}
				if (Static23.aClass19_4.anInt799 == 1) {
					Static85.anInt2292++;
				}
			}
			if (Static85.anInt2292 == 2) {
				Static19.aClass10_1 = new Class10((Socket) Static23.aClass19_4.anObject3, Static61.aClass12_3);
				@Pc(104) Class2_Sub5 local104 = new Class2_Sub5(5);
				local104.method1252(15);
				local104.method1298(418);
				Static19.aClass10_1.method260(5, local104.aByteArray16);
				Static85.anInt2292++;
				Static19.aLong14 = System.currentTimeMillis();
			}
			if (Static85.anInt2292 == 3) {
				if (Static18.anInt554 <= 5 || Static19.aClass10_1.method259() > 0) {
					@Pc(159) int local159 = Static19.aClass10_1.method254();
					if (local159 != 0) {
						this.method381(local159);
						return;
					}
					Static85.anInt2292++;
				} else if (System.currentTimeMillis() - Static19.aLong14 > 30000L) {
					this.method381(-2);
					return;
				}
			}
			if (Static85.anInt2292 == 4) {
				Static16.method376(Static18.anInt554 > 20, Static19.aClass10_1);
				Static85.anInt2292 = 0;
				Static19.aClass10_1 = null;
				Static23.aClass19_4 = null;
				Static10.anInt244 = 0;
			}
		} catch (@Pc(197) IOException local197) {
			this.method381(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method369() {
		if (Static18.aBoolean24) {
			Static75.method370(Static7.aCanvas1);
			Static4.method74(Static7.aCanvas1);
			this.method375();
			Static28.method562(Static7.aCanvas1);
			Static26.method548(Static7.aCanvas1);
		}
		if (Static18.anInt554 == 0) {
			Static99.method1908(Static22.aClass39_298, null, Static20.anInt581);
		} else if (Static18.anInt554 == 5) {
			Static66.method1381(Static97.aClass2_Sub1_Sub4_Sub1_3, Static25.aClass2_Sub1_Sub4_Sub1_1);
		} else if (Static18.anInt554 == 10) {
			Static66.method1381(Static97.aClass2_Sub1_Sub4_Sub1_3, Static25.aClass2_Sub1_Sub4_Sub1_1);
		} else if (Static18.anInt554 == 20) {
			Static66.method1381(Static97.aClass2_Sub1_Sub4_Sub1_3, Static25.aClass2_Sub1_Sub4_Sub1_1);
		} else if (Static18.anInt554 == 25) {
			@Pc(90) int local90;
			if (Static20.anInt577 == 1) {
				if (Static20.anInt586 < Static9.anInt187) {
					Static20.anInt586 = Static9.anInt187;
				}
				local90 = (Static20.anInt586 - Static9.anInt187) * 50 / Static20.anInt586;
				Static16.method378(Static20.method431(new Class39[] { Static50.aClass39_625, Static31.method1267(local90), Static96.aClass39_1179 }), Static109.aClass39_1339, true);
			} else if (Static20.anInt577 == 2) {
				if (Static22.anInt591 > Static92.anInt2400) {
					Static92.anInt2400 = Static22.anInt591;
				}
				local90 = (Static92.anInt2400 - Static22.anInt591) * 50 / Static92.anInt2400 + 50;
				Static16.method378(Static20.method431(new Class39[] { Static50.aClass39_625, Static31.method1267(local90), Static96.aClass39_1179 }), Static109.aClass39_1339, true);
			} else {
				Static16.method378(null, Static109.aClass39_1339, false);
			}
		} else if (Static18.anInt554 == 30) {
			Static64.method1355();
		} else if (Static18.anInt554 == 35) {
			Static22.method437();
		} else if (Static18.anInt554 == 40) {
			Static16.method378(Static68.aClass39_886, Static107.aClass39_1200, false);
		}
		Static24.anInt664 = 0;
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method380() {
		if (Static18.anInt554 != 1000) {
			@Pc(17) boolean local17 = Static30.method573();
			if (!local17) {
				this.method379();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method357() {
		Static64.anInt1889++;
		this.method380();
		Static61.method1236();
		Static73.method1499();
		Static19.method424();
		Static72.method1482();
		Static94.method1784();
		if (Static18.anInt554 == 0) {
			Static96.method1850();
			Static25.method516();
		} else if (Static18.anInt554 == 5) {
			Static96.method1850();
			Static25.method516();
		} else if (Static18.anInt554 == 10) {
			Static78.method1546();
		} else if (Static18.anInt554 == 20) {
			Static78.method1546();
			Static66.method1380();
		} else if (Static18.anInt554 == 25) {
			Static56.method1097();
		}
		if (Static18.anInt554 == 30) {
			Static39.method820();
		} else if (Static18.anInt554 == 35) {
			Static39.method820();
		} else if (Static18.anInt554 == 40) {
			Static66.method1380();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method373() {
		Static16.method382();
		Static56.method1092();
		Static75.method360();
		Static44.method863();
		Static88.method806();
		Static79.method1969();
		Static20.method432();
		Static31.method1260();
		Static12.method256();
		Static94.method1791();
		Static85.method1626();
		Static58.method1162();
		Static108.method2076();
		Static62.method1300();
		Static11.method248();
		Static59.method1216();
		Static71.method1469();
		Static96.method1853();
		Static46.method867();
		Static25.method509();
		Static101.method1957();
		Static48.method918();
		Static35.method2073();
		Static17.method393();
		Static49.method945();
		Static89.method1672();
		Static15.method2043();
		Static100.method1954();
		Static42.method834();
		Static84.method2050();
		Static51.method1777();
		Static86.method1639();
		Static2.method50();
		Static32.method708();
		Static1.method3();
		Static97.method1857();
		Static105.method1990();
		Static22.method433();
		Static57.method1148();
		Static6.method2058();
		Static24.method487();
		Static29.method569();
		Static27.method555();
		Static9.method128();
		Static74.method1503();
		Static87.method1641();
		Static40.method825();
		Static81.method1571();
		Static73.method1492();
		Static60.method1126();
		Static23.method445();
		Static45.method864();
		Static69.method1436();
		Static39.method818();
		Static90.method1706();
		Static77.method1517();
		Static106.method2035();
		Static91.method2017();
		Static4.method77();
		Static53.method1008();
		Static28.method560();
		Static63.method1328();
		Static93.method1748();
		Static10.method162();
		Static18.method414();
		Static47.method897();
		Static99.method1906();
		Static68.method1429();
		Static67.method1402();
		Static64.method1356();
		Static92.method1724();
		Static52.method996();
		Static41.method832();
		Static109.method2078();
		Static37.method803();
		Static72.method1489();
		Static102.method1973();
		Static103.method1976();
		Static19.method427();
		Static26.method552();
		Static55.method1083();
		Static5.method81();
		Static83.method1610();
		Static78.method1545();
		Static76.method1513();
		Static65.method1361();
		Static50.method954();
		Static38.method815();
		Static82.method1580();
		Static54.method1055();
		Static3.method70();
		Static104.method1980();
		Static34.method732();
		Static7.method109();
		Static33.method723();
		Static8.method125();
		Static66.method1379();
		Static107.method1863();
		Static61.method1234();
		Static36.method1141();
		Static43.method861();
		Static30.method571();
		Static80.method1566();
		Static21.method1876();
		Static70.method1443();
		Static95.method1808();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method381(@OriginalArg(0) int arg0) {
		Static23.aClass19_4 = null;
		Static10.anInt244++;
		Static85.anInt2292 = 0;
		if (Static57.anInt1653 == Static95.anInt2515) {
			Static95.anInt2515 = Static49.anInt1390;
		} else {
			Static95.anInt2515 = Static57.anInt1653;
		}
		Static19.aClass10_1 = null;
		if (Static10.anInt244 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static18.anInt554 > 5) {
				Static77.anInt2110 = 3000;
			} else {
				this.method359("js5connect_full");
				Static18.anInt554 = 1000;
			}
		} else if (Static10.anInt244 >= 2 && arg0 == 6) {
			this.method359("js5connect_outofdate");
			Static18.anInt554 = 1000;
		} else if (Static10.anInt244 >= 4) {
			if (Static18.anInt554 <= 5) {
				this.method359("js5connect");
				Static18.anInt554 = 1000;
			} else {
				Static77.anInt2110 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method371() {
		if (Static12.aClass15_1 != null) {
			Static12.aClass15_1.aBoolean34 = false;
		}
		Static12.aClass15_1 = null;
		if (Static85.aClass10_3 != null) {
			Static85.aClass10_3.method251();
		}
		Static15.method2038();
		Static29.method567();
		Static73.method1497();
		Static21.method1882();
		Static62.method1304();
		Static99.method1907();
		try {
			if (Static76.aClass53_6 != null) {
				Static76.aClass53_6.method1624();
			}
			if (Static7.aClass53Array1 != null) {
				for (@Pc(46) int local46 = 0; local46 < Static7.aClass53Array1.length; local46++) {
					if (Static7.aClass53Array1[local46] != null) {
						Static7.aClass53Array1[local46].method1624();
					}
				}
			}
			if (Static88.aClass53_3 != null) {
				Static88.aClass53_3.method1624();
			}
		} catch (@Pc(73) IOException local73) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method364() {
		Static57.anInt1653 = Static38.anInt1159 == 0 ? 43594 : Static88.anInt1141 + 40000;
		Static49.anInt1390 = Static38.anInt1159 == 0 ? 443 : Static88.anInt1141 + 50000;
		Static95.anInt2515 = Static57.anInt1653;
		Static1.method4();
		Static28.method562(Static7.aCanvas1);
		Static26.method548(Static7.aCanvas1);
		Static18.anInt536 = Static14.anInt378;
		try {
			if (Static61.aClass12_3.aClass58_1 != null) {
				Static76.aClass53_6 = new Class53(Static61.aClass12_3.aClass58_1, 5200, 0);
				for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
					Static7.aClass53Array1[local50] = new Class53(Static61.aClass12_3.aClass58Array1[local50], 6000, 0);
				}
				Static88.aClass53_3 = new Class53(Static61.aClass12_3.aClass58_2, 6000, 0);
				Static80.aClass42_2 = new Class42(255, Static76.aClass53_6, Static88.aClass53_3, 500000);
				Static61.aClass12_3.aClass58_1 = null;
				Static61.aClass12_3.aClass58Array1 = null;
				Static61.aClass12_3.aClass58_2 = null;
			}
		} catch (@Pc(95) IOException local95) {
			Static80.aClass42_2 = null;
			Static88.aClass53_3 = null;
			Static76.aClass53_6 = null;
		}
		if (Static38.anInt1159 != 0) {
			Static10.aBoolean10 = true;
		}
	}
}
