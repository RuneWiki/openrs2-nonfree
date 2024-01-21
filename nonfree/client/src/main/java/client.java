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
				Static10.method210();
			}
			Static69.anInt1704 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static98.anInt1928 = 0;
			} else if (arg0[1].equals("office")) {
				Static98.anInt1928 = 1;
			} else if (arg0[1].equals("local")) {
				Static98.anInt1928 = 2;
			} else {
				Static10.method210();
			}
			if (arg0[2].equals("live")) {
				Static61.anInt1552 = 0;
			} else if (arg0[2].equals("rc")) {
				Static61.anInt1552 = 1;
			} else if (arg0[2].equals("wip")) {
				Static61.anInt1552 = 2;
			} else {
				Static10.method210();
			}
			if (arg0[3].equals("lowmem")) {
				Static8.method191();
			} else if (arg0[3].equals("highmem")) {
				Static71.method1178();
			} else {
				Static10.method210();
			}
			if (arg0[4].equals("free")) {
				Static62.aBoolean67 = false;
			} else if (arg0[4].equals("members")) {
				Static62.aBoolean67 = true;
			} else {
				Static10.method210();
			}
			if (arg0[5].equals("english")) {
				Static10.anInt317 = 0;
			} else if (arg0[5].equals("german")) {
				Static56.method996();
				Static10.anInt317 = 1;
			} else {
				Static10.method210();
			}
			@Pc(150) client local150 = new client();
			local150.method457("runescape", Static61.anInt1552 + 32, InetAddress.getLocalHost());
		} catch (@Pc(164) Exception local164) {
			Static93.method1558(null, local164);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method453() {
		if (Static54.aBoolean55) {
			Static110.method1743(Static105.aCanvas1);
			Static9.method201(Static105.aCanvas1);
			if (Static70.aClass2_1 != null) {
				Static70.aClass2_1.method1236(Static105.aCanvas1);
			}
			this.method472();
			Static61.method1043(Static105.aCanvas1);
			Static24.method554(Static105.aCanvas1);
			if (Static70.aClass2_1 != null) {
				Static70.aClass2_1.method1238(Static105.aCanvas1);
			}
		}
		if (Static90.anInt3001 == 0) {
			Static98.method1273(Static56.anInt1452, null, Static98.aClass71_944);
		} else if (Static90.anInt3001 == 5) {
			Static73.method1212(Static35.aClass5_Sub1_Sub10_Sub4_2, Static7.aClass5_Sub1_Sub10_Sub4_1);
		} else if (Static90.anInt3001 == 10) {
			Static73.method1212(Static35.aClass5_Sub1_Sub10_Sub4_2, Static7.aClass5_Sub1_Sub10_Sub4_1);
		} else if (Static90.anInt3001 == 20) {
			Static73.method1212(Static35.aClass5_Sub1_Sub10_Sub4_2, Static7.aClass5_Sub1_Sub10_Sub4_1);
		} else if (Static90.anInt3001 == 25) {
			@Pc(107) int local107;
			if (Static85.anInt2048 == 1) {
				if (Static10.anInt304 > Static104.anInt3010) {
					Static104.anInt3010 = Static10.anInt304;
				}
				local107 = (Static104.anInt3010 - Static10.anInt304) * 50 / Static104.anInt3010;
				Static5.method143(Static97.aClass71_1149, Static74.method677(new Class71[] { Static17.aClass71_339, Static51.method962(local107), Static98.aClass71_942 }), true);
			} else if (Static85.anInt2048 == 2) {
				if (Static106.anInt2500 < Static97.anInt2317) {
					Static106.anInt2500 = Static97.anInt2317;
				}
				local107 = (Static106.anInt2500 - Static97.anInt2317) * 50 / Static106.anInt2500 + 50;
				Static5.method143(Static97.aClass71_1149, Static74.method677(new Class71[] { Static17.aClass71_339, Static51.method962(local107), Static98.aClass71_942 }), true);
			} else {
				Static5.method143(Static97.aClass71_1149, null, false);
			}
		} else if (Static90.anInt3001 == 30) {
			Static9.method199();
		} else if (Static90.anInt3001 == 35) {
			Static89.method1407();
		} else if (Static90.anInt3001 == 40) {
			Static5.method143(Static25.aClass71_434, Static92.aClass71_1088, false);
		}
		Static79.anInt1938 = 0;
		Static88.anInt2064 = 0;
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method459()) {
			return;
		}
		Static69.anInt1704 = Integer.parseInt(this.getParameter("worldid"));
		Static61.anInt1552 = Integer.parseInt(this.getParameter("modewhat"));
		Static98.anInt1928 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static8.method191();
		} else {
			Static71.method1178();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static62.aBoolean67 = true;
		} else {
			Static62.aBoolean67 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static56.method996();
			Static10.anInt317 = 1;
		}
		this.method471(Static61.anInt1552 + 32);
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method477() {
		if (Static90.anInt3001 != 1000) {
			@Pc(12) boolean local12 = Static49.method943();
			if (!local12) {
				this.method482();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method454() {
		Static112.anInt2649 = Static98.anInt1928 == 0 ? 443 : Static69.anInt1704 + 50000;
		Static114.anInt2667 = Static98.anInt1928 == 0 ? 43594 : Static69.anInt1704 + 40000;
		Static99.anInt2334 = Static114.anInt2667;
		Static117.method1927();
		Static61.method1043(Static105.aCanvas1);
		Static24.method554(Static105.aCanvas1);
		Static70.aClass2_1 = Static7.method190();
		if (Static70.aClass2_1 != null) {
			Static70.aClass2_1.method1238(Static105.aCanvas1);
		}
		Static111.anInt977 = Static43.anInt1085;
		try {
			if (Static111.aClass29_3.aClass31_1 != null) {
				Static76.aClass56_4 = new Class56(Static111.aClass29_3.aClass31_1, 5200, 0);
				for (@Pc(63) int local63 = 0; local63 < 14; local63++) {
					Static117.aClass56Array1[local63] = new Class56(Static111.aClass29_3.aClass31Array1[local63], 6000, 0);
				}
				Static38.aClass56_3 = new Class56(Static111.aClass29_3.aClass31_2, 6000, 0);
				Static119.aClass14_4 = new Class14(255, Static76.aClass56_4, Static38.aClass56_3, 500000);
				Static111.aClass29_3.aClass31Array1 = null;
				Static111.aClass29_3.aClass31_1 = null;
				Static111.aClass29_3.aClass31_2 = null;
			}
		} catch (@Pc(110) IOException local110) {
			Static38.aClass56_3 = null;
			Static119.aClass14_4 = null;
			Static76.aClass56_4 = null;
		}
		if (Static98.anInt1928 != 0) {
			Static89.aBoolean99 = true;
		}
		Static38.aClass5_Sub1_Sub11_2 = new Class5_Sub1_Sub11();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method458() {
		Static17.method480();
		Static115.method1781();
		Static37.method469();
		Static111.method710();
		Static78.method694();
		Static14.method410();
		Static92.method1519();
		Static51.method963();
		Static33.method689();
		Static94.method1573();
		Static16.method429();
		Static47.method858();
		Static93.method1557();
		Static121.method2047();
		Static63.method1074();
		Static49.method949();
		Static106.method1688();
		Static83.method1361();
		Static72.method1197();
		Static2.method1239();
		Static95.method1580();
		Static82.method1351();
		Static48.method935();
		Static119.method1952();
		Static64.method1683();
		Static62.method1054();
		Static116.method1892();
		Static90.method2001();
		Static99.method1613();
		Static65.method1127();
		Static88.method1405();
		Static11.method241();
		Static120.method2000();
		Static89.method1408();
		Static87.method1394();
		Static9.method200();
		Static58.method1029();
		Static114.method1773();
		Static112.method1750();
		Static86.method1975();
		Static29.method577();
		Static42.method771();
		Static60.method1038();
		Static27.method572();
		Static45.method784();
		Static59.method1034();
		Static71.method1177();
		Static50.method957();
		Static104.method2008();
		Static74.method657();
		Static24.method553();
		Static10.method205();
		Static73.method1213();
		Static66.method1133();
		Static8.method196();
		Static53.method974();
		Static6.method160();
		Static32.method617();
		Static28.method575();
		Static80.method1316();
		Static52.method2014();
		Static61.method1047();
		Static105.method1657();
		Static102.method1647();
		Static41.method763();
		Static5.method145();
		Static85.method1390();
		Static107.method1706();
		Static117.method1932();
		Static21.method520();
		Static91.method1427();
		Static7.method188();
		Static46.method797();
		Static38.method737();
		Static1.method10();
		Static15.method420();
		Static30.method584();
		Static75.method1231();
		Static56.method991();
		Static118.method1938();
		Static69.method1163();
		Static31.method601();
		Static20.method506();
		Static39.method744();
		Static35.method712();
		Static67.method1138();
		Static57.method1020();
		Static108.method1737();
		Static109.method1739();
		Static110.method1742();
		Static101.method1640();
		Static77.method1267();
		Static4.method127();
		Static100.method1633();
		Static18.method484();
		Static25.method558();
		Static3.method62();
		Static34.method700();
		Static26.method986();
		Static19.method491();
		Static23.method548();
		Static36.method717();
		Static84.method1368();
		Static103.method1648();
		Static55.method982();
		Static70.method1174();
		Static96.method1590();
		Static68.method1144();
		Static81.method1344();
		Static98.method1279();
		Static97.method1610();
		Static44.method1227();
		Static12.method354();
		Static54.method978();
		Static76.method1247();
		Static40.method540();
		Static113.method1770();
		Static79.method1282();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method464() {
		Static95.anInt2285++;
		this.method477();
		Static30.method586();
		Static10.method212();
		Static86.method1978();
		Static98.method1274();
		Static39.method746();
		if (Static70.aClass2_1 != null) {
			@Pc(38) int local38 = Static70.aClass2_1.method1234();
			Static88.anInt2064 += local38;
			Static97.anInt2320 = local38;
		}
		if (Static90.anInt3001 == 0) {
			Static71.method1176();
			Static101.method1642();
		} else if (Static90.anInt3001 == 5) {
			Static71.method1176();
			Static101.method1642();
		} else if (Static90.anInt3001 == 10) {
			Static30.method588();
		} else if (Static90.anInt3001 == 20) {
			Static30.method588();
			Static30.method592();
		} else if (Static90.anInt3001 == 25) {
			Static25.method557();
		}
		if (Static90.anInt3001 == 30) {
			Static26.method984();
		} else if (Static90.anInt3001 == 35) {
			Static26.method984();
		} else if (Static90.anInt3001 == 40) {
			Static30.method592();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	@Override
	protected void method466() {
		if (Static40.aClass13_3 != null) {
			Static40.aClass13_3.aBoolean18 = false;
		}
		Static40.aClass13_3 = null;
		if (Static58.aClass35_2 != null) {
			Static58.aClass35_2.method961();
			Static58.aClass35_2 = null;
		}
		Static39.method745();
		Static49.method944();
		Static70.aClass2_1 = null;
		Static10.method206();
		Static31.method602();
		Static35.method715();
		Static116.method1890();
		try {
			if (Static76.aClass56_4 != null) {
				Static76.aClass56_4.method1567();
			}
			if (Static117.aClass56Array1 != null) {
				for (@Pc(42) int local42 = 0; local42 < Static117.aClass56Array1.length; local42++) {
					if (Static117.aClass56Array1[local42] != null) {
						Static117.aClass56Array1[local42].method1567();
					}
				}
			}
			if (Static38.aClass56_3 != null) {
				Static38.aClass56_3.method1567();
			}
		} catch (@Pc(69) IOException local69) {
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method481(@OriginalArg(1) int arg0) {
		Static117.aClass35_4 = null;
		Static116.anInt2804 = 0;
		if (Static114.anInt2667 == Static99.anInt2334) {
			Static99.anInt2334 = Static112.anInt2649;
		} else {
			Static99.anInt2334 = Static114.anInt2667;
		}
		Static91.aClass70_7 = null;
		Static119.anInt2961++;
		if (Static119.anInt2961 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static90.anInt3001 > 5) {
				Static61.anInt1556 = 3000;
			} else {
				this.method473("js5connect_full");
				Static90.anInt3001 = 1000;
			}
		} else if (Static119.anInt2961 >= 2 && arg0 == 6) {
			this.method473("js5connect_outofdate");
			Static90.anInt3001 = 1000;
		} else if (Static119.anInt2961 >= 4) {
			if (Static90.anInt3001 > 5) {
				Static61.anInt1556 = 3000;
			} else {
				this.method473("js5connect");
				Static90.anInt3001 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method482() {
		if (Static64.anInt2492 >= 4) {
			this.method473("js5crc");
			Static90.anInt3001 = 1000;
			return;
		}
		if (Static20.anInt674 >= 4) {
			if (Static90.anInt3001 <= 5) {
				this.method473("js5io");
				Static90.anInt3001 = 1000;
				return;
			}
			Static20.anInt674 = 3;
			Static61.anInt1556 = 3000;
		}
		if (Static61.anInt1556-- > 0) {
			return;
		}
		try {
			if (Static116.anInt2804 == 0) {
				Static91.aClass70_7 = Static111.aClass29_3.method776(Static99.anInt2334);
				Static116.anInt2804++;
			}
			if (Static116.anInt2804 == 1) {
				if (Static91.aClass70_7.anInt2692 == 2) {
					this.method481(-1);
					return;
				}
				if (Static91.aClass70_7.anInt2692 == 1) {
					Static116.anInt2804++;
				}
			}
			if (Static116.anInt2804 == 2) {
				Static117.aClass35_4 = new Class35((Socket) Static91.aClass70_7.anObject3, Static111.aClass29_3);
				@Pc(99) Class5_Sub11 local99 = new Class5_Sub11(5);
				local99.method1545(15);
				local99.method1525(448);
				Static117.aClass35_4.method967(5, local99.aByteArray23);
				Static116.anInt2804++;
				Static76.aLong67 = Static50.method959();
			}
			if (Static116.anInt2804 == 3) {
				if (Static90.anInt3001 <= 5 || Static117.aClass35_4.method965() > 0) {
					@Pc(152) int local152 = Static117.aClass35_4.method960();
					if (local152 != 0) {
						this.method481(local152);
						return;
					}
					Static116.anInt2804++;
				} else if (Static50.method959() - Static76.aLong67 > 30000L) {
					this.method481(-2);
					return;
				}
			}
			if (Static116.anInt2804 == 4) {
				Static24.method552(Static90.anInt3001 > 20, Static117.aClass35_4);
				Static116.anInt2804 = 0;
				Static91.aClass70_7 = null;
				Static117.aClass35_4 = null;
				Static119.anInt2961 = 0;
			}
		} catch (@Pc(192) IOException local192) {
			this.method481(-3);
		}
	}
}
