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
				Static51.method1840();
			}
			Static62.anInt1620 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static107.anInt2739 = 0;
			} else if (arg0[1].equals("office")) {
				Static107.anInt2739 = 1;
			} else if (arg0[1].equals("local")) {
				Static107.anInt2739 = 2;
			} else {
				Static51.method1840();
			}
			if (arg0[2].equals("live")) {
				Static60.anInt1599 = 0;
			} else if (arg0[2].equals("rc")) {
				Static60.anInt1599 = 1;
			} else if (arg0[2].equals("wip")) {
				Static60.anInt1599 = 2;
			} else {
				Static51.method1840();
			}
			if (arg0[3].equals("lowmem")) {
				Static55.method1922();
			} else if (arg0[3].equals("highmem")) {
				Static33.method331();
			} else {
				Static51.method1840();
			}
			if (arg0[4].equals("free")) {
				Static33.aBoolean13 = false;
			} else if (arg0[4].equals("members")) {
				Static33.aBoolean13 = true;
			} else {
				Static51.method1840();
			}
			if (arg0[5].equals("english")) {
				Static101.anInt2660 = 0;
			} else if (arg0[5].equals("german")) {
				Static16.method295();
				Static101.anInt2660 = 1;
			} else {
				Static51.method1840();
			}
			@Pc(152) client local152 = new client();
			local152.method319("runescape", Static60.anInt1599 + 32, InetAddress.getLocalHost());
		} catch (@Pc(166) Exception local166) {
			Static90.method1648(local166, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	protected void method335() {
		Static25.anInt635 = Static107.anInt2739 == 0 ? 443 : Static62.anInt1620 + 50000;
		Static82.anInt2071 = Static107.anInt2739 == 0 ? 43594 : Static62.anInt1620 + 40000;
		Static118.anInt3001 = Static82.anInt2071;
		Static105.method1928();
		Static106.method1926(Static107.aCanvas1);
		Static113.method2040(Static107.aCanvas1);
		Static118.aClass12_1 = Static74.method1426();
		if (Static118.aClass12_1 != null) {
			Static118.aClass12_1.method268(Static107.aCanvas1);
		}
		Static47.anInt1257 = Static12.anInt272;
		try {
			if (Static67.aClass11_1.aClass16_2 != null) {
				Static103.aClass47_4 = new Class47(Static67.aClass11_1.aClass16_2, 5200, 0);
				for (@Pc(55) int local55 = 0; local55 < 14; local55++) {
					Static4.aClass47Array1[local55] = new Class47(Static67.aClass11_1.aClass16Array1[local55], 6000, 0);
				}
				Static53.aClass47_3 = new Class47(Static67.aClass11_1.aClass16_1, 6000, 0);
				Static103.aClass10_4 = new Class10(255, Static103.aClass47_4, Static53.aClass47_3, 500000);
				Static67.aClass11_1.aClass16_1 = null;
				Static67.aClass11_1.aClass16_2 = null;
				Static67.aClass11_1.aClass16Array1 = null;
			}
		} catch (@Pc(100) IOException local100) {
			Static103.aClass10_4 = null;
			Static53.aClass47_3 = null;
			Static103.aClass47_4 = null;
		}
		if (Static107.anInt2739 != 0) {
			Static55.aBoolean125 = true;
		}
		Static83.aClass2_Sub1_Sub6_5 = new Class2_Sub1_Sub6();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method333() {
		Static113.anInt2952++;
		this.method342();
		Static48.method921();
		Static113.method2047();
		Static42.method822();
		Static59.method1098();
		Static47.method916();
		if (Static118.aClass12_1 != null) {
			@Pc(36) int local36 = Static118.aClass12_1.method266();
			Static1.anInt6 = local36;
			Static111.anInt2879 += local36;
		}
		if (Static23.anInt591 == 0) {
			Static108.method1963();
			Static94.method1759();
		} else if (Static23.anInt591 == 5) {
			Static108.method1963();
			Static94.method1759();
		} else if (Static23.anInt591 == 10) {
			Static104.method1916();
		} else if (Static23.anInt591 == 20) {
			Static104.method1916();
			Static61.method1115();
		} else if (Static23.anInt591 == 25) {
			Static34.method710();
		}
		if (Static23.anInt591 == 30) {
			Static60.method1107();
		} else if (Static23.anInt591 == 35) {
			Static60.method1107();
		} else if (Static23.anInt591 == 40) {
			Static61.method1115();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method327() {
		if (Static25.aBoolean24) {
			Static68.method1171(Static107.aCanvas1);
			Static99.method1471(Static107.aCanvas1);
			if (Static118.aClass12_1 != null) {
				Static118.aClass12_1.method267(Static107.aCanvas1);
			}
			this.method320();
			Static106.method1926(Static107.aCanvas1);
			Static113.method2040(Static107.aCanvas1);
			if (Static118.aClass12_1 != null) {
				Static118.aClass12_1.method268(Static107.aCanvas1);
			}
		}
		if (Static23.anInt591 == 0) {
			Static91.method1658(Static15.aClass36_181, null, Static57.anInt1497);
		} else if (Static23.anInt591 == 5) {
			Static74.method1428(Static25.aClass2_Sub1_Sub1_Sub2_3, Static97.aClass2_Sub1_Sub1_Sub2_4);
		} else if (Static23.anInt591 == 10) {
			Static74.method1428(Static25.aClass2_Sub1_Sub1_Sub2_3, Static97.aClass2_Sub1_Sub1_Sub2_4);
		} else if (Static23.anInt591 == 20) {
			Static74.method1428(Static25.aClass2_Sub1_Sub1_Sub2_3, Static97.aClass2_Sub1_Sub1_Sub2_4);
		} else if (Static23.anInt591 == 25) {
			@Pc(111) int local111;
			if (Static111.anInt2890 == 1) {
				if (Static48.anInt1265 > Static41.anInt1079) {
					Static41.anInt1079 = Static48.anInt1265;
				}
				local111 = (Static41.anInt1079 - Static48.anInt1265) * 50 / Static41.anInt1079;
				Static89.method1643(true, Static49.method949(new Class36[] { Static35.aClass36_483, Static57.method1055(local111), Static69.aClass36_861 }), Static14.aClass36_1421);
			} else if (Static111.anInt2890 == 2) {
				if (Static105.anInt2736 < Static101.anInt2667) {
					Static105.anInt2736 = Static101.anInt2667;
				}
				local111 = (Static105.anInt2736 - Static101.anInt2667) * 50 / Static105.anInt2736 + 50;
				Static89.method1643(true, Static49.method949(new Class36[] { Static35.aClass36_483, Static57.method1055(local111), Static69.aClass36_861 }), Static14.aClass36_1421);
			} else {
				Static89.method1643(false, null, Static14.aClass36_1421);
			}
		} else if (Static23.anInt591 == 30) {
			Static78.method1480();
		} else if (Static23.anInt591 == 35) {
			Static74.method1432();
		} else if (Static23.anInt591 == 40) {
			Static89.method1643(false, Static95.aClass36_1211, Static62.aClass36_778);
		}
		Static19.anInt2917 = 0;
		Static111.anInt2879 = 0;
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method338() {
		if (Static84.anInt2112 >= 4) {
			this.method329("js5crc");
			Static23.anInt591 = 1000;
			return;
		}
		if (Static22.anInt580 >= 4) {
			if (Static23.anInt591 <= 5) {
				this.method329("js5io");
				Static23.anInt591 = 1000;
				return;
			}
			Static62.anInt1615 = 3000;
			Static22.anInt580 = 3;
		}
		if (Static62.anInt1615-- > 0) {
			return;
		}
		try {
			if (Static89.anInt2336 == 0) {
				Static96.aClass34_6 = Static67.aClass11_1.method242(Static118.anInt3001);
				Static89.anInt2336++;
			}
			if (Static89.anInt2336 == 1) {
				if (Static96.aClass34_6.anInt1269 == 2) {
					this.method341(-1);
					return;
				}
				if (Static96.aClass34_6.anInt1269 == 1) {
					Static89.anInt2336++;
				}
			}
			if (Static89.anInt2336 == 2) {
				Static111.aClass51_5 = new Class51((Socket) Static96.aClass34_6.anObject2, Static67.aClass11_1);
				@Pc(99) Class2_Sub12 local99 = new Class2_Sub12(5);
				local99.method1409(15);
				local99.method1394(445);
				Static111.aClass51_5.method1486(5, local99.aByteArray20);
				Static89.anInt2336++;
				Static65.aLong49 = Static66.method1158();
			}
			if (Static89.anInt2336 == 3) {
				if (Static23.anInt591 <= 5 || Static111.aClass51_5.method1484() > 0) {
					@Pc(137) int local137 = Static111.aClass51_5.method1488();
					if (local137 != 0) {
						this.method341(local137);
						return;
					}
					Static89.anInt2336++;
				} else if (Static66.method1158() - Static65.aLong49 > 30000L) {
					this.method341(-2);
					return;
				}
			}
			if (Static89.anInt2336 == 4) {
				Static85.method1558(Static111.aClass51_5, Static23.anInt591 > 20);
				Static111.aClass51_5 = null;
				Static96.aClass34_6 = null;
				Static6.anInt149 = 0;
				Static89.anInt2336 = 0;
			}
		} catch (@Pc(192) IOException local192) {
			this.method341(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method321() {
		if (Static56.aClass60_1 != null) {
			Static56.aClass60_1.aBoolean106 = false;
		}
		Static56.aClass60_1 = null;
		if (Static57.aClass51_3 != null) {
			Static57.aClass51_3.method1483();
			Static57.aClass51_3 = null;
		}
		Static36.method739();
		Static25.method519();
		Static118.aClass12_1 = null;
		Static113.method2041();
		Static74.method1430();
		Static73.method1302();
		Static23.method493();
		try {
			if (Static103.aClass47_4 != null) {
				Static103.aClass47_4.method1293();
			}
			if (Static4.aClass47Array1 != null) {
				for (@Pc(46) int local46 = 0; local46 < Static4.aClass47Array1.length; local46++) {
					if (Static4.aClass47Array1[local46] != null) {
						Static4.aClass47Array1[local46].method1293();
					}
				}
			}
			if (Static53.aClass47_3 != null) {
				Static53.aClass47_3.method1293();
			}
		} catch (@Pc(78) IOException local78) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method341(@OriginalArg(1) int arg0) {
		Static96.aClass34_6 = null;
		Static6.anInt149++;
		if (Static118.anInt3001 == Static82.anInt2071) {
			Static118.anInt3001 = Static25.anInt635;
		} else {
			Static118.anInt3001 = Static82.anInt2071;
		}
		Static89.anInt2336 = 0;
		Static111.aClass51_5 = null;
		if (Static6.anInt149 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static23.anInt591 > 5) {
				Static62.anInt1615 = 3000;
			} else {
				this.method329("js5connect_full");
				Static23.anInt591 = 1000;
			}
		} else if (Static6.anInt149 >= 2 && arg0 == 6) {
			this.method329("js5connect_outofdate");
			Static23.anInt591 = 1000;
		} else if (Static6.anInt149 >= 4) {
			if (Static23.anInt591 <= 5) {
				this.method329("js5connect");
				Static23.anInt591 = 1000;
			} else {
				Static62.anInt1615 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method342() {
		if (Static23.anInt591 != 1000) {
			@Pc(12) boolean local12 = Static46.method906();
			if (!local12) {
				this.method338();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method324() {
		Static17.method339();
		Static53.method1030();
		Static33.method334();
		Static55.method1920();
		Static99.method1475();
		Static91.method1655();
		Static117.method1415();
		Static79.method1487();
		Static49.method951();
		Static73.method1301();
		Static11.method225();
		Static52.method1000();
		Static74.method1429();
		Static21.method476();
		Static93.method1697();
		Static4.method132();
		Static85.method1560();
		Static8.method183();
		Static26.method547();
		Static13.method265();
		Static46.method909();
		Static82.method1502();
		Static111.method2006();
		Static40.method1547();
		Static42.method820();
		Static58.method1082();
		Static2.method2071();
		Static45.method897();
		Static86.method1561();
		Static34.method714();
		Static92.method1675();
		Static30.method680();
		Static56.method1046();
		Static25.method522();
		Static80.method1490();
		Static114.method2074();
		Static6.method146();
		Static110.method1993();
		Static19.method2026();
		Static50.method963();
		Static20.method375();
		Static90.method1646();
		Static100.method1853();
		Static31.method685();
		Static10.method212();
		Static47.method914();
		Static66.method1157();
		Static14.method2018();
		Static3.method929();
		Static62.method1119();
		Static113.method2043();
		Static115.method1258();
		Static89.method1640();
		Static57.method1051();
		Static41.method799();
		Static1.method1();
		Static9.method207();
		Static71.method1277();
		Static87.method1605();
		Static54.method1580();
		Static77.method1465();
		Static81.method1493();
		Static67.method1160();
		Static32.method705();
		Static94.method1757();
		Static24.method515();
		Static88.method1628();
		Static109.method1984();
		Static7.method171();
		Static65.method1150();
		Static59.method1104();
		Static96.method1808();
		Static97.method1819();
		Static72.method1285();
		Static23.method488();
		Static63.method1125();
		Static38.method747();
		Static15.method272();
		Static84.method1519();
		Static43.method831();
		Static108.method1964();
		Static103.method1910();
		Static118.method2080();
		Static37.method742();
		Static83.method1510();
		Static101.method1880();
		Static95.method1788();
		Static18.method344();
		Static48.method918();
		Static36.method740();
		Static69.method1198();
		Static112.method2035();
		Static22.method483();
		Static78.method1478();
		Static104.method1912();
		Static106.method1927();
		Static16.method294();
		Static60.method1110();
		Static5.method139();
		Static61.method1113();
		Static116.method2079();
		Static35.method726();
		Static75.method1438();
		Static64.method1134();
		Static29.method628();
		Static105.method1931();
		Static27.method570();
		Static28.method1267();
		Static70.method1273();
		Static39.method759();
		Static68.method1172();
		Static76.method1458();
		Static51.method1843();
		Static102.method1885();
		Static107.method1944();
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method325()) {
			return;
		}
		Static62.anInt1620 = Integer.parseInt(this.getParameter("worldid"));
		Static60.anInt1599 = Integer.parseInt(this.getParameter("modewhat"));
		Static107.anInt2739 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static55.method1922();
		} else {
			Static33.method331();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static33.aBoolean13 = true;
		} else {
			Static33.aBoolean13 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static16.method295();
			Static101.anInt2660 = 1;
		}
		this.method318(Static60.anInt1599 + 32);
	}
}
