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
				Static75.method994();
			}
			Static48.anInt1226 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static97.anInt2479 = 0;
			} else if (arg0[1].equals("office")) {
				Static97.anInt2479 = 1;
			} else if (arg0[1].equals("local")) {
				Static97.anInt2479 = 2;
			} else {
				Static75.method994();
			}
			if (arg0[2].equals("live")) {
				Static67.anInt1636 = 0;
			} else if (arg0[2].equals("rc")) {
				Static67.anInt1636 = 1;
			} else if (arg0[2].equals("wip")) {
				Static67.anInt1636 = 2;
			} else {
				Static75.method994();
			}
			if (arg0[3].equals("lowmem")) {
				Static16.method412();
			} else if (arg0[3].equals("highmem")) {
				Static68.method1166();
			} else {
				Static75.method994();
			}
			if (arg0[4].equals("free")) {
				Static90.aBoolean133 = false;
			} else if (arg0[4].equals("members")) {
				Static90.aBoolean133 = true;
			} else {
				Static75.method994();
			}
			if (arg0[5].equals("english")) {
				Static5.anInt134 = 0;
			} else if (arg0[5].equals("german")) {
				Static47.method1652();
				Static5.anInt134 = 1;
			} else {
				Static75.method994();
			}
			@Pc(150) client local150 = new client();
			local150.method306(InetAddress.getLocalHost(), "runescape", Static67.anInt1636 + 32);
		} catch (@Pc(164) Exception local164) {
			Static95.method1687(null, local164);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method318() {
		if (Static5.anInt129 >= 4) {
			this.method309("js5crc");
			Static91.anInt2400 = 1000;
			return;
		}
		if (Static58.anInt1442 >= 4) {
			if (Static91.anInt2400 <= 5) {
				this.method309("js5io");
				Static91.anInt2400 = 1000;
				return;
			}
			Static80.anInt2105 = 3000;
			Static58.anInt1442 = 3;
		}
		if (Static80.anInt2105-- > 0) {
			return;
		}
		try {
			if (Static13.anInt460 == 0) {
				Static69.aClass59_2 = Static64.aClass60_3.method1804(Static93.anInt2454);
				Static13.anInt460++;
			}
			if (Static13.anInt460 == 1) {
				if (Static69.aClass59_2.anInt2522 == 2) {
					this.method323(-1);
					return;
				}
				if (Static69.aClass59_2.anInt2522 == 1) {
					Static13.anInt460++;
				}
			}
			if (Static13.anInt460 == 2) {
				Static11.aClass47_6 = new Class47((Socket) Static69.aClass59_2.anObject3, Static64.aClass60_3);
				@Pc(96) Class1_Sub8 local96 = new Class1_Sub8(5);
				local96.method1185(15);
				local96.method1218(419);
				Static11.aClass47_6.method1343(5, local96.aByteArray24);
				Static13.anInt460++;
				Static46.aLong35 = System.currentTimeMillis();
			}
			if (Static13.anInt460 == 3) {
				if (Static91.anInt2400 <= 5 || Static11.aClass47_6.method1335() > 0) {
					@Pc(150) int local150 = Static11.aClass47_6.method1341();
					if (local150 != 0) {
						this.method323(local150);
						return;
					}
					Static13.anInt460++;
				} else if (System.currentTimeMillis() - Static46.aLong35 > 30000L) {
					this.method323(-2);
					return;
				}
			}
			if (Static13.anInt460 == 4) {
				Static21.method448(Static11.aClass47_6, Static91.anInt2400 > 20);
				Static69.aClass59_2 = null;
				Static11.aClass47_6 = null;
				Static13.anInt460 = 0;
				Static9.anInt251 = 0;
			}
		} catch (@Pc(190) IOException local190) {
			this.method323(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method319() {
		if (Static91.anInt2400 != 1000) {
			@Pc(15) boolean local15 = Static31.method1557();
			if (!local15) {
				this.method318();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method311() {
		if (Static43.aBoolean61) {
			Static63.method1078(Static89.aCanvas1);
			Static52.method980(Static89.aCanvas1);
			this.method313();
			Static56.method1002(Static89.aCanvas1);
			Static51.method971(Static89.aCanvas1);
		}
		if (Static91.anInt2400 == 0) {
			Static52.method977(Static51.anInt1376, Static39.aClass42_230, null);
		} else if (Static91.anInt2400 == 5) {
			Static19.method441(Static3.aClass1_Sub1_Sub1_Sub3_1, Static37.aClass1_Sub1_Sub1_Sub3_2);
		} else if (Static91.anInt2400 == 10) {
			Static19.method441(Static3.aClass1_Sub1_Sub1_Sub3_1, Static37.aClass1_Sub1_Sub1_Sub3_2);
		} else if (Static91.anInt2400 == 20) {
			Static19.method441(Static3.aClass1_Sub1_Sub1_Sub3_1, Static37.aClass1_Sub1_Sub1_Sub3_2);
		} else if (Static91.anInt2400 == 25) {
			@Pc(85) int local85;
			if (Static46.anInt1212 == 1) {
				if (Static90.anInt2395 > Static11.anInt344) {
					Static11.anInt344 = Static90.anInt2395;
				}
				local85 = (Static11.anInt344 - Static90.anInt2395) * 50 / Static11.anInt344;
				Static19.method440(true, Static57.method1822(new Class42[] { Static34.aClass42_466, Static38.method642(local85), Static33.aClass42_450 }), Static5.aClass42_92);
			} else if (Static46.anInt1212 == 2) {
				if (Static80.anInt2110 > Static18.anInt611) {
					Static18.anInt611 = Static80.anInt2110;
				}
				local85 = (Static18.anInt611 - Static80.anInt2110) * 50 / Static18.anInt611 + 50;
				Static19.method440(true, Static57.method1822(new Class42[] { Static34.aClass42_466, Static38.method642(local85), Static33.aClass42_450 }), Static5.aClass42_92);
			} else {
				Static19.method440(false, null, Static5.aClass42_92);
			}
		} else if (Static91.anInt2400 == 30) {
			Static64.method1097();
		} else if (Static91.anInt2400 == 35) {
			Static6.method118();
		} else if (Static91.anInt2400 == 40) {
			Static19.method440(false, Static33.aClass42_457, Static77.aClass42_1046);
		}
		Static21.anInt667 = 0;
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method317()) {
			return;
		}
		Static48.anInt1226 = Integer.parseInt(this.getParameter("worldid"));
		Static67.anInt1636 = Integer.parseInt(this.getParameter("modewhat"));
		Static97.anInt2479 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static16.method412();
		} else {
			Static68.method1166();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static90.aBoolean133 = true;
		} else {
			Static90.aBoolean133 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static47.method1652();
			Static5.anInt134 = 1;
		}
		this.method307(Static67.anInt1636 + 32);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method300() {
		Static83.anInt2218 = Static97.anInt2479 == 0 ? 43594 : Static48.anInt1226 + 40000;
		Static93.anInt2454 = Static83.anInt2218;
		Static65.anInt1584 = Static97.anInt2479 == 0 ? 443 : Static48.anInt1226 + 50000;
		Static12.method280();
		Static56.method1002(Static89.aCanvas1);
		Static51.method971(Static89.aCanvas1);
		Static11.anInt347 = Static102.anInt2661;
		try {
			if (Static64.aClass60_3.aClass36_2 != null) {
				Static56.aClass44_4 = new Class44(Static64.aClass60_3.aClass36_2, 5200, 0);
				for (@Pc(55) int local55 = 0; local55 < 12; local55++) {
					Static30.aClass44Array1[local55] = new Class44(Static64.aClass60_3.aClass36Array1[local55], 6000, 0);
				}
				Static24.aClass44_3 = new Class44(Static64.aClass60_3.aClass36_3, 6000, 0);
				Static23.aClass8_1 = new Class8(255, Static56.aClass44_4, Static24.aClass44_3, 500000);
				Static64.aClass60_3.aClass36_2 = null;
				Static64.aClass60_3.aClass36Array1 = null;
				Static64.aClass60_3.aClass36_3 = null;
			}
		} catch (@Pc(102) IOException local102) {
			Static24.aClass44_3 = null;
			Static56.aClass44_4 = null;
			Static23.aClass8_1 = null;
		}
		if (Static97.anInt2479 != 0) {
			Static2.aBoolean5 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method315() {
		Static13.method321();
		Static62.method1044();
		Static39.method302();
		Static67.method1152();
		Static47.method1650();
		Static75.method998();
		Static56.method1000();
		Static50.method1194();
		Static74.method1339();
		Static73.method1330();
		Static65.method1098();
		Static8.method175();
		Static80.method1480();
		Static69.method1235();
		Static44.method814();
		Static22.method458();
		Static6.method127();
		Static101.method1769();
		Static25.method516();
		Static82.method1501();
		Static16.method411();
		Static37.method631();
		Static42.method1753();
		Static17.method421();
		Static27.method548();
		Static61.method1018();
		Static57.method1827();
		Static46.method854();
		Static108.method1851();
		Static107.method1832();
		Static45.method1317();
		Static52.method975();
		Static88.method1610();
		Static76.method1393();
		Static33.method584();
		Static1.method2();
		Static38.method644();
		Static103.method1817();
		Static93.method1682();
		Static53.method1834();
		Static2.method87();
		Static109.method1852();
		Static64.method1094();
		Static18.method426();
		Static32.method575();
		Static68.method1171();
		Static104.method1818();
		Static4.method102();
		Static97.method1701();
		Static31.method1556();
		Static58.method1006();
		Static24.method511();
		Static95.method1685();
		Static5.method109();
		Static84.method1534();
		Static106.method1847();
		Static41.method693();
		Static55.method1133();
		Static48.method855();
		Static21.method446();
		Static30.method571();
		Static15.method394();
		Static10.method257();
		Static51.method963();
		Static49.method877();
		Static7.method147();
		Static19.method442();
		Static70.method1263();
		Static92.method1677();
		Static99.method1731();
		Static11.method266();
		Static66.method1116();
		Static34.method586();
		Static12.method279();
		Static91.method1663();
		Static83.method1517();
		Static79.method1446();
		Static26.method524();
		Static29.method568();
		Static89.method1647();
		Static77.method1417();
		Static9.method181();
		Static71.method1288();
		Static105.method1842();
		Static3.method101();
		Static98.method1715();
		Static23.method502();
		Static90.method1656();
		Static43.method774();
		Static81.method1485();
		Static40.method652();
		Static87.method1579();
		Static96.method1696();
		Static20.method444();
		Static100.method1733();
		Static35.method601();
		Static54.method989();
		Static59.method1419();
		Static36.method615();
		Static94.method1568();
		Static86.method1574();
		Static60.method1010();
		Static28.method564();
		Static72.method1431();
		Static85.method1544();
		Static63.method1077();
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method314() {
		Static27.anInt768++;
		this.method319();
		Static97.method1704();
		Static97.method1708();
		Static10.method253();
		Static56.method1001();
		Static93.method1683();
		if (Static91.anInt2400 == 0) {
			Static39.method316();
			Static45.method1298();
		} else if (Static91.anInt2400 == 5) {
			Static39.method316();
			Static45.method1298();
		} else if (Static91.anInt2400 == 10) {
			Static7.method150();
		} else if (Static91.anInt2400 == 20) {
			Static7.method150();
			Static7.method162();
		} else if (Static91.anInt2400 == 25) {
			Static91.method1662();
		}
		if (Static91.anInt2400 == 30) {
			Static88.method1614();
		} else if (Static91.anInt2400 == 35) {
			Static88.method1614();
			return;
		} else if (Static91.anInt2400 == 40) {
			Static7.method162();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method303() {
		if (Static33.aClass38_1 != null) {
			Static33.aClass38_1.aBoolean86 = false;
		}
		Static33.aClass38_1 = null;
		if (Static58.aClass47_17 != null) {
			Static58.aClass47_17.method1338();
		}
		Static29.method565();
		Static107.method1830();
		Static97.method1707();
		Static11.method268();
		Static35.method602();
		Static88.method1622();
		try {
			if (Static56.aClass44_4 != null) {
				Static56.aClass44_4.method1102();
			}
			if (Static30.aClass44Array1 != null) {
				for (@Pc(45) int local45 = 0; local45 < Static30.aClass44Array1.length; local45++) {
					if (Static30.aClass44Array1[local45] != null) {
						Static30.aClass44Array1[local45].method1102();
					}
				}
			}
			if (Static24.aClass44_3 != null) {
				Static24.aClass44_3.method1102();
			}
		} catch (@Pc(72) IOException local72) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method323(@OriginalArg(1) int arg0) {
		Static11.aClass47_6 = null;
		if (Static83.anInt2218 == Static93.anInt2454) {
			Static93.anInt2454 = Static65.anInt1584;
		} else {
			Static93.anInt2454 = Static83.anInt2218;
		}
		Static9.anInt251++;
		Static69.aClass59_2 = null;
		Static13.anInt460 = 0;
		if (Static9.anInt251 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static91.anInt2400 <= 5) {
				this.method309("js5connect_full");
				Static91.anInt2400 = 1000;
			} else {
				Static80.anInt2105 = 3000;
			}
		} else if (Static9.anInt251 >= 2 && arg0 == 6) {
			this.method309("js5connect_outofdate");
			Static91.anInt2400 = 1000;
		} else if (Static9.anInt251 >= 4) {
			if (Static91.anInt2400 > 5) {
				Static80.anInt2105 = 3000;
			} else {
				this.method309("js5connect");
				Static91.anInt2400 = 1000;
			}
		}
	}
}
