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
				Static5.method1487();
			}
			Static59.anInt1828 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static21.anInt1000 = 0;
			} else if (arg0[1].equals("office")) {
				Static21.anInt1000 = 1;
			} else if (arg0[1].equals("local")) {
				Static21.anInt1000 = 2;
			} else {
				Static5.method1487();
			}
			if (arg0[2].equals("live")) {
				Static63.anInt1887 = 0;
			} else if (arg0[2].equals("rc")) {
				Static63.anInt1887 = 1;
			} else if (arg0[2].equals("wip")) {
				Static63.anInt1887 = 2;
			} else {
				Static5.method1487();
			}
			if (arg0[3].equals("lowmem")) {
				Static3.method30();
			} else if (arg0[3].equals("highmem")) {
				Static92.method1751();
			} else {
				Static5.method1487();
			}
			if (arg0[4].equals("free")) {
				Static47.aBoolean69 = false;
			} else if (arg0[4].equals("members")) {
				Static47.aBoolean69 = true;
			} else {
				Static5.method1487();
			}
			if (arg0[5].equals("english")) {
				Static72.anInt2121 = 0;
			} else if (arg0[5].equals("german")) {
				Static69.method1381();
				Static72.anInt2121 = 1;
			} else {
				Static5.method1487();
			}
			@Pc(154) client local154 = new client();
			local154.method495(InetAddress.getLocalHost(), Static63.anInt1887 + 32, "runescape");
		} catch (@Pc(168) Exception local168) {
			Static15.method544(null, local168);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method511() {
		if (Static61.anInt1879 != 1000) {
			@Pc(16) boolean local16 = Static65.method1344();
			if (!local16) {
				this.method515();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	protected void method498() {
		Static9.anInt418 = Static21.anInt1000 == 0 ? 43594 : Static59.anInt1828 + 40000;
		Static106.anInt2345 = Static21.anInt1000 == 0 ? 443 : Static59.anInt1828 + 50000;
		Static4.anInt2363 = Static9.anInt418;
		Static29.method743();
		Static97.method1868(Static32.aCanvas1);
		Static45.method992(Static32.aCanvas1);
		Static23.anInt1022 = Static25.anInt1125;
		try {
			if (Static102.aClass20_4.aClass29_1 != null) {
				Static52.aClass61_3 = new Class61(Static102.aClass20_4.aClass29_1, 5200, 0);
				for (@Pc(52) int local52 = 0; local52 < 13; local52++) {
					Static100.aClass61Array1[local52] = new Class61(Static102.aClass20_4.aClass29Array1[local52], 6000, 0);
				}
				Static61.aClass61_4 = new Class61(Static102.aClass20_4.aClass29_2, 6000, 0);
				Static6.aClass32_1 = new Class32(255, Static52.aClass61_3, Static61.aClass61_4, 500000);
				Static102.aClass20_4.aClass29_1 = null;
				Static102.aClass20_4.aClass29Array1 = null;
				Static102.aClass20_4.aClass29_2 = null;
			}
		} catch (@Pc(99) IOException local99) {
			Static6.aClass32_1 = null;
			Static52.aClass61_3 = null;
			Static61.aClass61_4 = null;
		}
		if (Static21.anInt1000 != 0) {
			Static106.aBoolean111 = true;
		}
		Static21.aClass6_Sub2_Sub14_16 = new Class6_Sub2_Sub14();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method487() {
		Static85.anInt2389++;
		this.method511();
		Static35.method863();
		Static77.method1530();
		Static101.method1947();
		Static56.method1174();
		Static112.method2071();
		if (Static61.anInt1879 == 0) {
			Static50.method2081();
			Static10.method444();
		} else if (Static61.anInt1879 == 5) {
			Static50.method2081();
			Static10.method444();
		} else if (Static61.anInt1879 == 10) {
			Static75.method1440();
		} else if (Static61.anInt1879 == 20) {
			Static75.method1440();
			Static15.method539();
		} else if (Static61.anInt1879 == 25) {
			Static51.method1095();
		}
		if (Static61.anInt1879 == 30) {
			Static13.method494();
		} else if (Static61.anInt1879 == 35) {
			Static13.method494();
		} else if (Static61.anInt1879 == 40) {
			Static15.method539();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method496()) {
			return;
		}
		Static59.anInt1828 = Integer.parseInt(this.getParameter("worldid"));
		Static63.anInt1887 = Integer.parseInt(this.getParameter("modewhat"));
		Static21.anInt1000 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static3.method30();
		} else {
			Static92.method1751();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static47.aBoolean69 = true;
		} else {
			Static47.aBoolean69 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static69.method1381();
			Static72.anInt2121 = 1;
		}
		this.method490(Static63.anInt1887 + 32);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method514(@OriginalArg(0) int arg0) {
		Static64.aClass65_4 = null;
		Static65.anInt1951 = 0;
		Static77.anInt2239++;
		Static7.aClass25_1 = null;
		if (Static4.anInt2363 == Static9.anInt418) {
			Static4.anInt2363 = Static106.anInt2345;
		} else {
			Static4.anInt2363 = Static9.anInt418;
		}
		if (Static77.anInt2239 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static61.anInt1879 <= 5) {
				this.method506("js5connect_full");
				Static61.anInt1879 = 1000;
			} else {
				Static69.anInt2034 = 3000;
			}
		} else if (Static77.anInt2239 >= 2 && arg0 == 6) {
			this.method506("js5connect_outofdate");
			Static61.anInt1879 = 1000;
		} else if (Static77.anInt2239 >= 4) {
			if (Static61.anInt1879 <= 5) {
				this.method506("js5connect");
				Static61.anInt1879 = 1000;
			} else {
				Static69.anInt2034 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	@Override
	protected void method504() {
		if (Static99.aBoolean132) {
			Static107.method2003(Static32.aCanvas1);
			Static50.method2084(Static32.aCanvas1);
			this.method492();
			Static97.method1868(Static32.aCanvas1);
			Static45.method992(Static32.aCanvas1);
		}
		if (Static61.anInt1879 == 0) {
			Static110.method2038(Static29.aClass55_434, Static102.anInt3022, null);
		} else if (Static61.anInt1879 == 5) {
			Static57.method1178(Static81.aClass6_Sub2_Sub2_Sub4_4, Static57.aClass6_Sub2_Sub2_Sub4_2);
		} else if (Static61.anInt1879 == 10) {
			Static57.method1178(Static81.aClass6_Sub2_Sub2_Sub4_4, Static57.aClass6_Sub2_Sub2_Sub4_2);
		} else if (Static61.anInt1879 == 20) {
			Static57.method1178(Static81.aClass6_Sub2_Sub2_Sub4_4, Static57.aClass6_Sub2_Sub2_Sub4_2);
		} else if (Static61.anInt1879 == 25) {
			@Pc(98) int local98;
			if (Static114.anInt3277 == 1) {
				if (Static54.anInt1681 > Static66.anInt1970) {
					Static66.anInt1970 = Static54.anInt1681;
				}
				local98 = (Static66.anInt1970 - Static54.anInt1681) * 50 / Static66.anInt1970;
				Static108.method2013(Static89.method1698(new Class55[] { Static59.aClass55_704, Static58.method1196(local98), Static93.aClass55_1117 }), true, Static72.aClass55_861);
			} else if (Static114.anInt3277 == 2) {
				if (Static93.anInt2609 < Static71.anInt2109) {
					Static93.anInt2609 = Static71.anInt2109;
				}
				local98 = (Static93.anInt2609 - Static71.anInt2109) * 50 / Static93.anInt2609 + 50;
				Static108.method2013(Static89.method1698(new Class55[] { Static59.aClass55_704, Static58.method1196(local98), Static93.aClass55_1117 }), true, Static72.aClass55_861);
			} else {
				Static108.method2013(null, false, Static72.aClass55_861);
			}
		} else if (Static61.anInt1879 == 30) {
			Static65.method1345();
		} else if (Static61.anInt1879 == 35) {
			Static29.method742();
		} else if (Static61.anInt1879 == 40) {
			Static108.method2013(Static87.aClass55_1005, false, Static83.aClass55_962);
		}
		Static45.anInt1471 = 0;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method515() {
		if (Static49.anInt1573 >= 4) {
			this.method506("js5crc");
			Static61.anInt1879 = 1000;
			return;
		}
		if (Static24.anInt1088 >= 4) {
			if (Static61.anInt1879 <= 5) {
				this.method506("js5io");
				Static61.anInt1879 = 1000;
				return;
			}
			Static24.anInt1088 = 3;
			Static69.anInt2034 = 3000;
		}
		if (Static69.anInt2034-- > 0) {
			return;
		}
		try {
			if (Static65.anInt1951 == 0) {
				Static7.aClass25_1 = Static102.aClass20_4.method719(Static4.anInt2363);
				Static65.anInt1951++;
			}
			if (Static65.anInt1951 == 1) {
				if (Static7.aClass25_1.anInt1212 == 2) {
					this.method514(-1);
					return;
				}
				if (Static7.aClass25_1.anInt1212 == 1) {
					Static65.anInt1951++;
				}
			}
			if (Static65.anInt1951 == 2) {
				Static64.aClass65_4 = new Class65((Socket) Static7.aClass25_1.anObject3, Static102.aClass20_4);
				@Pc(104) Class6_Sub1 local104 = new Class6_Sub1(5);
				local104.method1501(15);
				local104.method1499(439);
				Static64.aClass65_4.method2009(local104.aByteArray11, 5);
				Static65.anInt1951++;
				Static59.aLong65 = Static1.method3();
			}
			if (Static65.anInt1951 == 3) {
				if (Static61.anInt1879 <= 5 || Static64.aClass65_4.method2007() > 0) {
					@Pc(157) int local157 = Static64.aClass65_4.method2008();
					if (local157 != 0) {
						this.method514(local157);
						return;
					}
					Static65.anInt1951++;
				} else if (Static1.method3() - Static59.aLong65 > 30000L) {
					this.method514(-2);
					return;
				}
			}
			if (Static65.anInt1951 == 4) {
				Static10.method448(Static61.anInt1879 > 20, Static64.aClass65_4);
				Static65.anInt1951 = 0;
				Static64.aClass65_4 = null;
				Static77.anInt2239 = 0;
				Static7.aClass25_1 = null;
			}
		} catch (@Pc(193) IOException local193) {
			this.method514(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method508() {
		if (Static56.aClass51_1 != null) {
			Static56.aClass51_1.aBoolean104 = false;
		}
		Static56.aClass51_1 = null;
		if (Static19.aClass65_1 != null) {
			Static19.aClass65_1.method2012();
			Static19.aClass65_1 = null;
		}
		Static10.method447();
		Static74.method1227();
		Static77.method1527();
		Static59.method1250();
		Static35.method862();
		Static26.method1448();
		try {
			if (Static52.aClass61_3 != null) {
				Static52.aClass61_3.method1955();
			}
			if (Static100.aClass61Array1 != null) {
				for (@Pc(44) int local44 = 0; local44 < Static100.aClass61Array1.length; local44++) {
					if (Static100.aClass61Array1[local44] != null) {
						Static100.aClass61Array1[local44].method1955();
					}
				}
			}
			if (Static61.aClass61_4 != null) {
				Static61.aClass61_4.method1955();
			}
		} catch (@Pc(67) IOException local67) {
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method493() {
		Static14.method517();
		Static86.method1660();
		Static13.method488();
		Static39.method1167();
		Static26.method1446();
		Static78.method1537();
		Static5.method1481();
		Static108.method2011();
		Static59.method1252();
		Static102.method1957();
		Static43.method986();
		Static95.method1837();
		Static76.method1518();
		Static60.method1302();
		Static48.method1057();
		Static91.method1725();
		Static10.method449();
		Static3.method21();
		Static99.method1892();
		Static11.method457();
		Static8.method324();
		Static44.method1823();
		Static85.method1632();
		Static15.method534();
		Static57.method1187();
		Static50.method2080();
		Static7.method249();
		Static35.method861();
		Static54.method1160();
		Static96.method1866();
		Static42.method962();
		Static45.method989();
		Static38.method906();
		Static97.method1870();
		Static68.method1379();
		Static65.method1346();
		Static67.method1361();
		Static46.method2064();
		Static61.method1317();
		Static83.method1592();
		Static29.method741();
		Static41.method926();
		Static73.method1433();
		Static31.method799();
		Static9.method355();
		Static1.method1();
		Static88.method2092();
		Static74.method1233();
		Static75.method1438();
		Static77.method1525();
		Static27.method879();
		Static104.method1984();
		Static81.method1563();
		Static69.method1382();
		Static12.method460();
		Static89.method1697();
		Static63.method1319();
		Static30.method785();
		Static53.method1283();
		Static111.method2042();
		Static22.method661();
		Static103.method1959();
		Static93.method1774();
		Static6.method239();
		Static90.method1716();
		Static101.method1939();
		Static24.method701();
		Static47.method1014();
		Static70.method1407();
		Static94.method1799();
		Static34.method848();
		Static23.method670();
		Static37.method903();
		Static58.method1190();
		Static98.method1871();
		Static105.method1990();
		Static100.method1913();
		Static64.method1338();
		Static109.method2033();
		Static92.method1749();
		Static113.method2077();
		Static72.method1429();
		Static112.method2067();
		Static33.method826();
		Static28.method739();
		Static56.method1173();
		Static21.method653();
		Static79.method1559();
		Static52.method1119();
		Static66.method1360();
		Static20.method591();
		Static32.method802();
		Static55.method1169();
		Static51.method1094();
		Static18.method585();
		Static16.method567();
		Static87.method1678();
		Static80.method1561();
		Static107.method2001();
		Static40.method915();
		Static110.method2039();
		Static49.method1083();
		Static106.method1597();
		Static114.method2098();
		Static62.method882();
		Static36.method891();
		Static19.method588();
		Static17.method582();
		Static4.method1613();
		Static2.method5();
		Static71.method1422();
	}
}
