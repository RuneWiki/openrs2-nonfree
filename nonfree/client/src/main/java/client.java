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
				Static48.method1682();
			}
			Static72.anInt1911 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static30.anInt789 = 0;
			} else if (arg0[1].equals("office")) {
				Static30.anInt789 = 1;
			} else if (arg0[1].equals("local")) {
				Static30.anInt789 = 2;
			} else {
				Static48.method1682();
			}
			if (arg0[2].equals("live")) {
				Static102.anInt2657 = 0;
			} else if (arg0[2].equals("rc")) {
				Static102.anInt2657 = 1;
			} else if (arg0[2].equals("wip")) {
				Static102.anInt2657 = 2;
			} else {
				Static48.method1682();
			}
			if (arg0[3].equals("lowmem")) {
				Static64.method1180();
			} else if (arg0[3].equals("highmem")) {
				Static61.method1136();
			} else {
				Static48.method1682();
			}
			if (arg0[4].equals("free")) {
				Static83.aBoolean117 = false;
			} else if (arg0[4].equals("members")) {
				Static83.aBoolean117 = true;
			} else {
				Static48.method1682();
			}
			if (arg0[5].equals("english")) {
				Static33.anInt817 = 0;
			} else if (arg0[5].equals("german")) {
				Static46.method926();
				Static33.anInt817 = 1;
			} else {
				Static48.method1682();
			}
			@Pc(154) client local154 = new client();
			local154.method290(InetAddress.getLocalHost(), Static102.anInt2657 + 32, "runescape");
		} catch (@Pc(168) Exception local168) {
			Static16.method293(null, local168);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method286() {
		Static16.method295();
		Static39.method759();
		Static45.method287();
		Static108.method1903();
		Static106.method681();
		Static79.method672();
		Static53.method1057();
		Static109.method1453();
		Static30.method652();
		Static85.method1627();
		Static56.method1071();
		Static87.method1644();
		Static40.method872();
		Static74.method1473();
		Static27.method607();
		Static26.method542();
		Static78.method1527();
		Static88.method1689();
		Static41.method883();
		Static62.method1158();
		Static76.method1513();
		Static20.method335();
		Static48.method1681();
		Static104.method1861();
		Static38.method713();
		Static18.method319();
		Static105.method1884();
		Static73.method1347();
		Static93.method1750();
		Static4.method1895();
		Static97.method1606();
		Static31.method657();
		Static99.method1797();
		Static21.method392();
		Static32.method666();
		Static42.method892();
		Static19.method331();
		Static10.method235();
		Static36.method693();
		Static83.method1669();
		Static70.method1273();
		Static54.method1058();
		Static80.method1539();
		Static37.method697();
		Static5.method87();
		Static84.method1560();
		Static55.method1062();
		Static28.method622();
		Static1.method5();
		Static11.method1870();
		Static43.method902();
		Static68.method1242();
		Static25.method490();
		Static15.method248();
		Static107.method1899();
		Static94.method1753();
		Static51.method1027();
		Static95.method1318();
		Static8.method178();
		Static59.method1108();
		Static33.method667();
		Static75.method1506();
		Static66.method1223();
		Static64.method1192();
		Static50.method972();
		Static69.method1266();
		Static102.method1835();
		Static90.method1708();
		Static98.method1778();
		Static61.method1140();
		Static82.method1555();
		Static60.method1120();
		Static65.method1196();
		Static81.method1542();
		Static89.method1692();
		Static52.method1055();
		Static72.method1336();
		Static63.method1162();
		Static101.method1814();
		Static24.method485();
		Static71.method1301();
		Static77.method1518();
		Static57.method1102();
		Static22.method448();
		Static12.method247();
		Static46.method928();
		Static86.method1638();
		Static35.method691();
		Static17.method311();
		Static103.method1842();
		Static100.method1808();
		Static34.method675();
		Static23.method451();
		Static2.method15();
		Static58.method1104();
		Static3.method68();
		Static91.method1733();
		Static96.method1227();
		Static92.method1747();
		Static14.method1874();
		Static9.method228();
		Static7.method160();
		Static47.method938();
		Static13.method637();
		Static44.method907();
		Static67.method1236();
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method294() {
		if (Static57.anInt1500 >= 4) {
			this.method283("js5crc");
			Static59.anInt1508 = 1000;
			return;
		}
		if (Static98.anInt2574 >= 4) {
			if (Static59.anInt1508 <= 5) {
				this.method283("js5io");
				Static59.anInt1508 = 1000;
				return;
			}
			Static70.anInt1825 = 3000;
			Static98.anInt2574 = 3;
		}
		if (Static70.anInt1825-- > 0) {
			return;
		}
		try {
			if (Static10.anInt269 == 0) {
				Static18.aClass64_1 = Static88.aClass32_4.method951(Static109.anInt2069);
				Static10.anInt269++;
			}
			if (Static10.anInt269 == 1) {
				if (Static18.aClass64_1.anInt2678 == 2) {
					this.method296(-1);
					return;
				}
				if (Static18.aClass64_1.anInt2678 == 1) {
					Static10.anInt269++;
				}
			}
			if (Static10.anInt269 == 2) {
				Static105.aClass20_49 = new Class20((Socket) Static18.aClass64_1.anObject6, Static88.aClass32_4);
				@Pc(104) Class3_Sub11 local104 = new Class3_Sub11(5);
				local104.method1443(15);
				local104.method1425(423);
				Static105.aClass20_49.method651(5, local104.aByteArray17);
				Static10.anInt269++;
				Static99.aLong76 = System.currentTimeMillis();
			}
			if (Static10.anInt269 == 3) {
				if (Static59.anInt1508 <= 5 || Static105.aClass20_49.method655() > 0) {
					@Pc(144) int local144 = Static105.aClass20_49.method650();
					if (local144 != 0) {
						this.method296(local144);
						return;
					}
					Static10.anInt269++;
				} else if (System.currentTimeMillis() - Static99.aLong76 > 30000L) {
					this.method296(-2);
					return;
				}
			}
			if (Static10.anInt269 == 4) {
				Static15.method252(Static105.aClass20_49, Static59.anInt1508 > 20);
				Static10.anInt269 = 0;
				Static18.aClass64_1 = null;
				Static99.anInt2623 = 0;
				Static105.aClass20_49 = null;
			}
		} catch (@Pc(194) IOException local194) {
			this.method296(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method285() {
		Static2.anInt38++;
		this.method297();
		Static38.method723();
		Static1.method1();
		Static4.method1894();
		Static93.method1751();
		Static76.method1514();
		if (Static59.anInt1508 == 0) {
			Static7.method162();
			Static73.method1344();
		} else if (Static59.anInt1508 == 5) {
			Static7.method162();
			Static73.method1344();
		} else if (Static59.anInt1508 == 10) {
			Static65.method1197();
		} else if (Static59.anInt1508 == 20) {
			Static65.method1197();
			Static30.method649();
		} else if (Static59.anInt1508 == 25) {
			Static98.method1781();
		}
		if (Static59.anInt1508 == 30) {
			Static1.method9();
		} else if (Static59.anInt1508 == 35) {
			Static1.method9();
		} else if (Static59.anInt1508 == 40) {
			Static30.method649();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method296(@OriginalArg(1) int arg0) {
		if (Static59.anInt1509 == Static109.anInt2069) {
			Static109.anInt2069 = Static43.anInt1242;
		} else {
			Static109.anInt2069 = Static59.anInt1509;
		}
		Static99.anInt2623++;
		Static105.aClass20_49 = null;
		Static10.anInt269 = 0;
		Static18.aClass64_1 = null;
		if (Static99.anInt2623 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static59.anInt1508 > 5) {
				Static70.anInt1825 = 3000;
			} else {
				this.method283("js5connect_full");
				Static59.anInt1508 = 1000;
			}
		} else if (Static99.anInt2623 >= 2 && arg0 == 6) {
			this.method283("js5connect_outofdate");
			Static59.anInt1508 = 1000;
		} else if (Static99.anInt2623 >= 4) {
			if (Static59.anInt1508 <= 5) {
				this.method283("js5connect");
				Static59.anInt1508 = 1000;
			} else {
				Static70.anInt1825 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method297() {
		if (Static59.anInt1508 != 1000) {
			@Pc(10) boolean local10 = Static19.method332();
			if (!local10) {
				this.method294();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method276() {
		if (Static86.aClass33_1 != null) {
			Static86.aClass33_1.aBoolean73 = false;
		}
		Static86.aClass33_1 = null;
		if (Static91.aClass20_42 != null) {
			Static91.aClass20_42.method656();
			Static91.aClass20_42 = null;
		}
		Static83.method1666();
		Static82.method1553();
		Static1.method11();
		Static80.method1536();
		Static68.method1247();
		Static41.method876();
		try {
			if (Static107.aClass37_4 != null) {
				Static107.aClass37_4.method1070();
			}
			if (Static41.aClass37Array1 != null) {
				for (@Pc(50) int local50 = 0; local50 < Static41.aClass37Array1.length; local50++) {
					if (Static41.aClass37Array1[local50] != null) {
						Static41.aClass37Array1[local50].method1070();
					}
				}
			}
			if (Static54.aClass37_1 != null) {
				Static54.aClass37_1.method1070();
			}
		} catch (@Pc(77) IOException local77) {
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method289()) {
			return;
		}
		Static72.anInt1911 = Integer.parseInt(this.getParameter("worldid"));
		Static102.anInt2657 = Integer.parseInt(this.getParameter("modewhat"));
		Static30.anInt789 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static64.method1180();
		} else {
			Static61.method1136();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static83.aBoolean117 = true;
		} else {
			Static83.aBoolean117 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static46.method926();
			Static33.anInt817 = 1;
		}
		this.method279(Static102.anInt2657 + 32);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method275() {
		Static43.anInt1242 = Static30.anInt789 == 0 ? 443 : Static72.anInt1911 + 50000;
		Static59.anInt1509 = Static30.anInt789 == 0 ? 43594 : Static72.anInt1911 + 40000;
		Static109.anInt2069 = Static59.anInt1509;
		Static90.method1714();
		Static67.method1238(Static19.aCanvas1);
		Static102.method1834(Static19.aCanvas1);
		Static41.anInt1223 = Static49.anInt1280;
		try {
			if (Static88.aClass32_4.aClass59_2 != null) {
				Static107.aClass37_4 = new Class37(Static88.aClass32_4.aClass59_2, 5200, 0);
				for (@Pc(55) int local55 = 0; local55 < 12; local55++) {
					Static41.aClass37Array1[local55] = new Class37(Static88.aClass32_4.aClass59Array1[local55], 6000, 0);
				}
				Static54.aClass37_1 = new Class37(Static88.aClass32_4.aClass59_1, 6000, 0);
				Static75.aClass55_1 = new Class55(255, Static107.aClass37_4, Static54.aClass37_1, 500000);
				Static88.aClass32_4.aClass59_2 = null;
				Static88.aClass32_4.aClass59_1 = null;
				Static88.aClass32_4.aClass59Array1 = null;
			}
		} catch (@Pc(102) IOException local102) {
			Static75.aClass55_1 = null;
			Static107.aClass37_4 = null;
			Static54.aClass37_1 = null;
		}
		if (Static30.anInt789 != 0) {
			Static55.aBoolean75 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method277() {
		if (Static77.aBoolean102) {
			Static41.method890(Static19.aCanvas1);
			Static86.method1637(Static19.aCanvas1);
			this.method291();
			Static67.method1238(Static19.aCanvas1);
			Static102.method1834(Static19.aCanvas1);
		}
		if (Static59.anInt1508 == 0) {
			Static88.method1687(Static102.anInt2658, Static76.aClass27_1012, null);
		} else if (Static59.anInt1508 == 5) {
			Static72.method1338(Static31.aClass3_Sub3_Sub2_Sub1_1, Static89.aClass3_Sub3_Sub2_Sub1_3);
		} else if (Static59.anInt1508 == 10) {
			Static72.method1338(Static31.aClass3_Sub3_Sub2_Sub1_1, Static89.aClass3_Sub3_Sub2_Sub1_3);
		} else if (Static59.anInt1508 == 20) {
			Static72.method1338(Static31.aClass3_Sub3_Sub2_Sub1_1, Static89.aClass3_Sub3_Sub2_Sub1_3);
		} else if (Static59.anInt1508 == 25) {
			@Pc(76) int local76;
			if (Static24.anInt644 == 1) {
				if (Static66.anInt1702 > Static25.anInt659) {
					Static25.anInt659 = Static66.anInt1702;
				}
				local76 = (Static25.anInt659 - Static66.anInt1702) * 50 / Static25.anInt659;
				Static35.method687(Static33.aClass27_396, true, Static98.method1779(new Class27[] { Static79.aClass27_409, Static97.method1616(local76), Static97.aClass27_1079 }));
			} else if (Static24.anInt644 == 2) {
				if (Static92.anInt2541 < Static69.anInt1787) {
					Static92.anInt2541 = Static69.anInt1787;
				}
				local76 = (Static92.anInt2541 - Static69.anInt1787) * 50 / Static92.anInt2541 + 50;
				Static35.method687(Static33.aClass27_396, true, Static98.method1779(new Class27[] { Static79.aClass27_409, Static97.method1616(local76), Static97.aClass27_1079 }));
			} else {
				Static35.method687(Static33.aClass27_396, false, null);
			}
		} else if (Static59.anInt1508 == 30) {
			Static10.method230();
		} else if (Static59.anInt1508 == 35) {
			Static84.method1558();
		} else if (Static59.anInt1508 == 40) {
			Static35.method687(Static81.aClass27_1045, false, Static107.aClass27_1337);
		}
		Static18.anInt424 = 0;
	}
}
