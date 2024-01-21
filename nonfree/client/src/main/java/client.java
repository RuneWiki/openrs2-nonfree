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
				Static9.method231();
			}
			Static95.anInt2172 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static45.anInt1072 = 0;
			} else if (arg0[1].equals("office")) {
				Static45.anInt1072 = 1;
			} else if (arg0[1].equals("local")) {
				Static45.anInt1072 = 2;
			} else {
				Static9.method231();
			}
			if (arg0[2].equals("live")) {
				Static65.anInt1490 = 0;
			} else if (arg0[2].equals("rc")) {
				Static65.anInt1490 = 1;
			} else if (arg0[2].equals("wip")) {
				Static65.anInt1490 = 2;
			} else {
				Static9.method231();
			}
			if (arg0[3].equals("lowmem")) {
				Static21.method414();
			} else if (arg0[3].equals("highmem")) {
				Static58.method975();
			} else {
				Static9.method231();
			}
			if (arg0[4].equals("free")) {
				Static113.aBoolean111 = false;
			} else if (arg0[4].equals("members")) {
				Static113.aBoolean111 = true;
			} else {
				Static9.method231();
			}
			if (arg0[5].equals("english")) {
				Static37.anInt876 = 0;
			} else if (arg0[5].equals("german")) {
				Static101.method1632();
				Static37.anInt876 = 1;
			} else {
				Static9.method231();
			}
			@Pc(150) client local150 = new client();
			local150.method331("runescape", Static65.anInt1490 + 32, InetAddress.getLocalHost());
		} catch (@Pc(164) Exception local164) {
			Static99.method1601(local164, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method336() {
		Static17.method348();
		Static93.method1465();
		Static90.method343();
		Static27.method680();
		Static54.method1458();
		Static22.method431();
		Static48.method1856();
		Static34.method566();
		Static61.method1083();
		Static8.method227();
		Static18.method354();
		Static6.method212();
		Static109.method1880();
		Static36.method664();
		Static107.method1766();
		Static73.method1205();
		Static104.method1698();
		Static69.method1146();
		Static74.method1225();
		Static113.method1305();
		Static82.method1376();
		Static40.method695();
		Static75.method1248();
		Static23.method447();
		Static28.method1690();
		Static79.method1365();
		Static102.method1650();
		Static55.method2070();
		Static20.method398();
		Static7.method217();
		Static21.method418();
		Static111.method1924();
		Static59.method1000();
		Static60.method1019();
		Static46.method821();
		Static3.method129();
		Static70.method1162();
		Static63.method1094();
		Static89.method1446();
		Static41.method1909();
		Static100.method1607();
		Static9.method230();
		Static91.method1452();
		Static72.method1191();
		Static76.method1295();
		Static116.method2039();
		Static31.method547();
		Static80.method1370();
		Static52.method2078();
		Static81.method1059();
		Static16.method303();
		Static65.method1102();
		Static25.method2022();
		Static39.method687();
		Static37.method670();
		Static99.method1603();
		Static11.method269();
		Static106.method1738();
		Static67.method1132();
		Static112.method1974();
		Static47.method1963();
		Static64.method1097();
		Static14.method291();
		Static83.method1386();
		Static44.method798();
		Static95.method1559();
		Static117.method2064();
		Static10.method261();
		Static43.method721();
		Static1.method39();
		Static50.method906();
		Static94.method1540();
		Static71.method1180();
		Static66.method1125();
		Static120.method2094();
		Static88.method1445();
		Static58.method973();
		Static26.method512();
		Static42.method696();
		Static51.method918();
		Static110.method1891();
		Static53.method931();
		Static118.method2084();
		Static92.method1453();
		Static13.method289();
		Static56.method942();
		Static57.method962();
		Static105.method1724();
		Static121.method2102();
		Static15.method298();
		Static108.method1803();
		Static77.method1332();
		Static101.method1631();
		Static114.method1998();
		Static84.method1391();
		Static30.method546();
		Static38.method684();
		Static87.method1428();
		Static12.method1396();
		Static68.method1137();
		Static49.method890();
		Static2.method62();
		Static4.method137();
		Static5.method139();
		Static33.method558();
		Static45.method814();
		Static32.method556();
		Static62.method1092();
		Static103.method1666();
		Static96.method2003();
		Static86.method1418();
		Static29.method2032();
		Static78.method1352();
		Static119.method2089();
		Static98.method1595();
		Static85.method2020();
		Static97.method1576();
		Static19.method393();
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method345() {
		if (Static40.aBoolean60) {
			Static17.method347(Static93.aCanvas1);
			Static45.method815(Static93.aCanvas1);
			if (Static96.aClass56_5 != null) {
				Static96.aClass56_5.method1310(Static93.aCanvas1);
			}
			this.method328();
			Static54.method1462(Static93.aCanvas1);
			Static119.method2088(Static93.aCanvas1);
			if (Static96.aClass56_5 != null) {
				Static96.aClass56_5.method1307(Static93.aCanvas1);
			}
		}
		if (Static64.anInt1487 == 0) {
			Static55.method2077(null, Static93.anInt2092, Static34.aClass64_499);
		} else if (Static64.anInt1487 == 5) {
			Static102.method1647(Static23.aClass1_Sub1_Sub5_Sub1_3, Static17.aClass1_Sub1_Sub5_Sub1_2);
		} else if (Static64.anInt1487 == 10) {
			Static102.method1647(Static23.aClass1_Sub1_Sub5_Sub1_3, Static17.aClass1_Sub1_Sub5_Sub1_2);
		} else if (Static64.anInt1487 == 20) {
			Static102.method1647(Static23.aClass1_Sub1_Sub5_Sub1_3, Static17.aClass1_Sub1_Sub5_Sub1_2);
		} else if (Static64.anInt1487 == 25) {
			@Pc(82) int local82;
			if (Static117.anInt2814 == 1) {
				if (Static45.anInt1074 < Static18.anInt585) {
					Static45.anInt1074 = Static18.anInt585;
				}
				local82 = (Static45.anInt1074 - Static18.anInt585) * 50 / Static45.anInt1074;
				Static74.method1233(Static82.method1383(new Class64[] { Static81.aClass64_883, Static12.method1395(local82), Static110.aClass64_1668 }), true, Static95.aClass64_1384);
			} else if (Static117.anInt2814 == 2) {
				if (Static20.anInt629 < Static43.anInt961) {
					Static20.anInt629 = Static43.anInt961;
				}
				local82 = (Static20.anInt629 - Static43.anInt961) * 50 / Static20.anInt629 + 50;
				Static74.method1233(Static82.method1383(new Class64[] { Static81.aClass64_883, Static12.method1395(local82), Static110.aClass64_1668 }), true, Static95.aClass64_1384);
			} else {
				Static74.method1233(null, false, Static95.aClass64_1384);
			}
		} else if (Static64.anInt1487 == 30) {
			Static57.method968();
		} else if (Static64.anInt1487 == 35) {
			Static96.method2005();
		} else if (Static64.anInt1487 == 40) {
			Static74.method1233(Static121.aClass64_1849, false, Static64.aClass64_921);
		}
		Static120.anInt2853 = 0;
		Static50.anInt1190 = 0;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method330() {
		Static15.anInt471++;
		this.method352();
		Static79.method1364();
		Static65.method1111();
		Static100.method1612();
		Static90.method329();
		Static104.method1701();
		if (Static96.aClass56_5 != null) {
			@Pc(32) int local32 = Static96.aClass56_5.method1309();
			Static15.anInt465 = local32;
			Static120.anInt2853 += local32;
		}
		if (Static64.anInt1487 == 0) {
			Static5.method140();
			Static2.method66();
		} else if (Static64.anInt1487 == 5) {
			Static5.method140();
			Static2.method66();
		} else if (Static64.anInt1487 == 10) {
			Static101.method1633();
		} else if (Static64.anInt1487 == 20) {
			Static101.method1633();
			Static90.method327();
		} else if (Static64.anInt1487 == 25) {
			Static60.method1016();
		}
		if (Static64.anInt1487 == 30) {
			Static51.method921();
		} else if (Static64.anInt1487 == 35) {
			Static51.method921();
			return;
		} else if (Static64.anInt1487 == 40) {
			Static90.method327();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method335()) {
			return;
		}
		Static95.anInt2172 = Integer.parseInt(this.getParameter("worldid"));
		Static65.anInt1490 = Integer.parseInt(this.getParameter("modewhat"));
		Static45.anInt1072 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static21.method414();
		} else {
			Static58.method975();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static113.aBoolean111 = true;
		} else {
			Static113.aBoolean111 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static101.method1632();
			Static37.anInt876 = 1;
		}
		this.method341(Static65.anInt1490 + 32);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method350(@OriginalArg(1) int arg0) {
		Static40.anInt925 = 0;
		Static26.aClass27_2 = null;
		if (Static48.anInt2585 == Static105.anInt2477) {
			Static105.anInt2477 = Static71.anInt1610;
		} else {
			Static105.anInt2477 = Static48.anInt2585;
		}
		Static62.anInt1440++;
		Static51.aClass48_7 = null;
		if (Static62.anInt1440 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static64.anInt1487 <= 5) {
				this.method342("js5connect_full");
				Static64.anInt1487 = 1000;
			} else {
				Static31.anInt805 = 3000;
			}
		} else if (Static62.anInt1440 >= 2 && arg0 == 6) {
			this.method342("js5connect_outofdate");
			Static64.anInt1487 = 1000;
		} else if (Static62.anInt1440 >= 4) {
			if (Static64.anInt1487 <= 5) {
				this.method342("js5connect");
				Static64.anInt1487 = 1000;
			} else {
				Static31.anInt805 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	@Override
	protected void method337() {
		Static48.anInt2585 = Static45.anInt1072 == 0 ? 43594 : Static95.anInt2172 + 40000;
		Static105.anInt2477 = Static48.anInt2585;
		Static71.anInt1610 = Static45.anInt1072 == 0 ? 443 : Static95.anInt2172 + 50000;
		Static7.method216();
		Static54.method1462(Static93.aCanvas1);
		Static119.method2088(Static93.aCanvas1);
		Static96.aClass56_5 = Static87.method1430();
		if (Static96.aClass56_5 != null) {
			Static96.aClass56_5.method1307(Static93.aCanvas1);
		}
		Static89.anInt2024 = Static35.anInt821;
		try {
			if (Static28.aClass28_6.aClass53_2 != null) {
				Static6.aClass8_1 = new Class8(Static28.aClass28_6.aClass53_2, 5200, 0);
				for (@Pc(67) int local67 = 0; local67 < 14; local67++) {
					Static20.aClass8Array1[local67] = new Class8(Static28.aClass28_6.aClass53Array1[local67], 6000, 0);
				}
				Static44.aClass8_4 = new Class8(Static28.aClass28_6.aClass53_3, 6000, 0);
				Static57.aClass16_1 = new Class16(255, Static6.aClass8_1, Static44.aClass8_4, 500000);
				Static28.aClass28_6.aClass53_3 = null;
				Static28.aClass28_6.aClass53_2 = null;
				Static28.aClass28_6.aClass53Array1 = null;
			}
		} catch (@Pc(112) IOException local112) {
			Static44.aClass8_4 = null;
			Static57.aClass16_1 = null;
			Static6.aClass8_1 = null;
		}
		if (Static45.anInt1072 != 0) {
			Static100.aBoolean135 = true;
		}
		Static118.aClass1_Sub1_Sub11_5 = new Class1_Sub1_Sub11();
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method352() {
		if (Static64.anInt1487 != 1000) {
			@Pc(12) boolean local12 = Static95.method1561();
			if (!local12) {
				this.method353();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method334() {
		if (Static40.aClass20_1 != null) {
			Static40.aClass20_1.aBoolean45 = false;
		}
		Static40.aClass20_1 = null;
		if (Static14.aClass27_1 != null) {
			Static14.aClass27_1.method562();
			Static14.aClass27_1 = null;
		}
		Static110.method1894();
		Static17.method349();
		Static96.aClass56_5 = null;
		Static65.method1108();
		Static58.method976();
		Static110.method1893();
		Static27.method677();
		try {
			if (Static6.aClass8_1 != null) {
				Static6.aClass8_1.method226();
			}
			if (Static20.aClass8Array1 != null) {
				for (@Pc(50) int local50 = 0; local50 < Static20.aClass8Array1.length; local50++) {
					if (Static20.aClass8Array1[local50] != null) {
						Static20.aClass8Array1[local50].method226();
					}
				}
			}
			if (Static44.aClass8_4 != null) {
				Static44.aClass8_4.method226();
			}
		} catch (@Pc(73) IOException local73) {
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method353() {
		if (Static44.anInt1048 >= 4) {
			this.method342("js5crc");
			Static64.anInt1487 = 1000;
			return;
		}
		if (Static11.anInt427 >= 4) {
			if (Static64.anInt1487 <= 5) {
				this.method342("js5io");
				Static64.anInt1487 = 1000;
				return;
			}
			Static11.anInt427 = 3;
			Static31.anInt805 = 3000;
		}
		if (Static31.anInt805-- > 0) {
			return;
		}
		try {
			if (Static40.anInt925 == 0) {
				Static51.aClass48_7 = Static28.aClass28_6.method574(Static105.anInt2477);
				Static40.anInt925++;
			}
			if (Static40.anInt925 == 1) {
				if (Static51.aClass48_7.anInt1534 == 2) {
					this.method350(-1);
					return;
				}
				if (Static51.aClass48_7.anInt1534 == 1) {
					Static40.anInt925++;
				}
			}
			if (Static40.anInt925 == 2) {
				Static26.aClass27_2 = new Class27((Socket) Static51.aClass48_7.anObject5, Static28.aClass28_6);
				@Pc(93) Class1_Sub6 local93 = new Class1_Sub6(5);
				local93.method1853(15);
				local93.method1851(449);
				Static26.aClass27_2.method560(5, local93.aByteArray27);
				Static40.anInt925++;
				Static26.aLong23 = Static80.method1369();
			}
			if (Static40.anInt925 == 3) {
				if (Static64.anInt1487 <= 5 || Static26.aClass27_2.method559() > 0) {
					@Pc(143) int local143 = Static26.aClass27_2.method567();
					if (local143 != 0) {
						this.method350(local143);
						return;
					}
					Static40.anInt925++;
				} else if (Static80.method1369() - Static26.aLong23 > 30000L) {
					this.method350(-2);
					return;
				}
			}
			if (Static40.anInt925 == 4) {
				Static48.method1849(Static64.anInt1487 > 20, Static26.aClass27_2);
				Static40.anInt925 = 0;
				Static26.aClass27_2 = null;
				Static51.aClass48_7 = null;
				Static62.anInt1440 = 0;
			}
		} catch (@Pc(181) IOException local181) {
			this.method350(-3);
		}
	}
}
