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
			if (arg0.length != 5) {
				Static2.method83();
			}
			Static2.anInt100 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static95.anInt2576 = 0;
			} else if (arg0[1].equals("office")) {
				Static95.anInt2576 = 1;
			} else if (arg0[1].equals("local")) {
				Static95.anInt2576 = 2;
			} else {
				Static2.method83();
			}
			if (arg0[2].equals("live")) {
				Static11.anInt516 = 0;
			} else if (arg0[2].equals("rc")) {
				Static11.anInt516 = 1;
			} else if (arg0[2].equals("wip")) {
				Static11.anInt516 = 2;
			} else {
				Static2.method83();
			}
			if (arg0[3].equals("lowmem")) {
				Static70.method1385();
			} else if (arg0[3].equals("highmem")) {
				Static98.method801();
			} else {
				Static2.method83();
			}
			if (arg0[4].equals("free")) {
				Static62.aBoolean108 = false;
			} else if (arg0[4].equals("members")) {
				Static62.aBoolean108 = true;
			} else {
				Static2.method83();
			}
			@Pc(130) client local130 = new client();
			local130.method404("runescape", InetAddress.getLocalHost(), Static11.anInt516 + 32);
		} catch (@Pc(144) Exception local144) {
			Static57.method1692(null, local144);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method408()) {
			return;
		}
		Static2.anInt100 = Integer.parseInt(this.getParameter("worldid"));
		Static11.anInt516 = Integer.parseInt(this.getParameter("modewhat"));
		Static95.anInt2576 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static70.method1385();
		} else {
			Static98.method801();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static62.aBoolean108 = true;
		} else {
			Static62.aBoolean108 = false;
		}
		this.method406(Static11.anInt516 + 32);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method403() {
		if (Static103.anInt2775 == 0) {
			Static78.method1428(null, Static79.aClass31_798, Static18.anInt802);
		} else if (Static103.anInt2775 == 5) {
			Static100.method1717(Static18.aGraphics1, Static69.aClass2_Sub1_Sub3_Sub3_5, Static28.aClass2_Sub1_Sub3_Sub3_3);
		} else if (Static103.anInt2775 == 10) {
			Static100.method1717(Static18.aGraphics1, Static69.aClass2_Sub1_Sub3_Sub3_5, Static28.aClass2_Sub1_Sub3_Sub3_3);
		} else if (Static103.anInt2775 == 20) {
			Static100.method1717(Static18.aGraphics1, Static69.aClass2_Sub1_Sub3_Sub3_5, Static28.aClass2_Sub1_Sub3_Sub3_3);
		} else if (Static103.anInt2775 == 25) {
			@Pc(86) int local86;
			if (Static65.anInt2169 == 1) {
				if (Static92.anInt1558 < Static51.anInt1779) {
					Static92.anInt1558 = Static51.anInt1779;
				}
				local86 = (Static92.anInt1558 - Static51.anInt1779) * 50 / Static92.anInt1558;
				Static59.method1283(true, Static40.aClass31_712, Static37.method974(new Class31[] { Static88.aClass31_824, Static89.method1499(local86), Static34.aClass31_451 }));
			} else if (Static65.anInt2169 == 2) {
				if (Static45.anInt1597 < Static95.anInt2563) {
					Static45.anInt1597 = Static95.anInt2563;
				}
				local86 = (Static45.anInt1597 - Static95.anInt2563) * 50 / Static45.anInt1597 + 50;
				Static59.method1283(true, Static40.aClass31_712, Static37.method974(new Class31[] { Static88.aClass31_824, Static89.method1499(local86), Static34.aClass31_451 }));
			} else {
				Static59.method1283(false, Static40.aClass31_712, null);
			}
		} else if (Static103.anInt2775 == 30) {
			Static19.method556();
		} else if (Static103.anInt2775 == 35) {
			Static67.method1368();
		} else if (Static103.anInt2775 == 40) {
			Static59.method1283(false, Static3.aClass31_52, Static60.aClass31_719);
		}
		Static40.anInt2032 = 0;
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method422() {
		if (Static59.anInt2042-- > 0) {
			return;
		}
		try {
			if (Static103.anInt2773 == 0) {
				Static18.aClass59_1 = Static51.aClass51_2.method1471(Static62.anInt2113);
				Static103.anInt2773++;
			}
			if (Static103.anInt2773 == 1) {
				if (Static18.aClass59_1.anInt2608 == 2) {
					this.method427(-1);
					return;
				}
				if (Static18.aClass59_1.anInt2608 == 1) {
					Static103.anInt2773++;
				}
			}
			if (Static103.anInt2773 == 2) {
				Static51.aClass35_1 = new Class35((Socket) Static18.aClass59_1.anObject5, Static51.aClass51_2);
				@Pc(70) byte[] local70 = new byte[] { 15 };
				Static51.aClass35_1.method1347(1, local70);
				Static103.anInt2773++;
				Static69.aLong59 = System.currentTimeMillis();
			}
			if (Static103.anInt2773 == 3) {
				if (Static103.anInt2775 <= 5 || Static51.aClass35_1.method1350() > 0) {
					@Pc(116) int local116 = Static51.aClass35_1.method1351();
					if (local116 != 0) {
						this.method427(local116);
						return;
					}
					Static103.anInt2773++;
				} else if (System.currentTimeMillis() - Static69.aLong59 > 30000L) {
					this.method427(-2);
					return;
				}
			}
			if (Static103.anInt2773 == 4) {
				Static55.aClass30_2.method1159(Static103.anInt2775 > 20, Static51.aClass35_1);
				Static103.anInt2773 = 0;
				Static25.anInt1108 = 0;
				Static18.aClass59_1 = null;
				Static51.aClass35_1 = null;
			}
		} catch (@Pc(152) IOException local152) {
			this.method427(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method401() {
		Static14.method423();
		Static56.method1227();
		Static64.method411();
		Static34.method874();
		Static102.method470();
		Static72.method862();
		Static25.method756();
		Static82.method1446();
		Static80.method655();
		Static54.method1162();
		Static66.method1353();
		Static11.method353();
		Static103.method1736();
		Static46.method1072();
		Static59.method1284();
		Static21.method683();
		Static36.method960();
		Static107.method1761();
		Static101.method1726();
		Static47.method1107();
		Static67.method1359();
		Static7.method179();
		Static76.method1411();
		Static4.method101();
		Static40.method1275();
		Static10.method229();
		Static55.method1188();
		Static83.method1456();
		Static57.method1694();
		Static48.method1117();
		Static43.method1059();
		Static49.method1696();
		Static50.method351();
		Static28.method781();
		Static61.method1307();
		Static35.method905();
		Static99.method1689();
		Static13.method382();
		Static9.method204();
		Static88.method1491();
		Static20.method1263();
		Static93.method1577();
		Static87.method1487();
		Static15.method429();
		Static53.method1157();
		Static26.method757();
		Static12.method365();
		Static63.method1322();
		Static79.method1444();
		Static85.method1567();
		Static75.method1408();
		Static106.method1753();
		Static96.method1620();
		Static45.method1067();
		Static5.method112();
		Static97.method1662();
		Static81.method1638();
		Static70.method1383();
		Static89.method1497();
		Static23.method701();
		Static30.method838();
		Static65.method1346();
		Static90.method1513();
		Static100.method1706();
		Static91.method1547();
		Static39.method1009();
		Static95.method1605();
		Static2.method85();
		Static58.method1245();
		Static77.method1424();
		Static22.method697();
		Static74.method1399();
		Static42.method1056();
		Static44.method1060();
		Static105.method1747();
		Static32.method858();
		Static86.method1484();
		Static19.method554();
		Static16.method514();
		Static62.method1314();
		Static24.method720();
		Static27.method775();
		Static69.method1378();
		Static38.method986();
		Static78.method1429();
		Static8.method201();
		Static33.method870();
		Static60.method1286();
		Static94.method1583();
		Static18.method534();
		Static73.method1389();
		Static3.method87();
		Static71.method1387();
		Static37.method979();
		Static92.method1044();
		Static51.method1135();
		Static104.method1568();
		Static6.method163();
		Static17.method531();
		Static68.method1376();
		Static31.method851();
		Static98.method807();
		Static52.method1142();
		Static41.method1054();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method413() {
		if (Static14.aClass48_1 != null) {
			Static14.aClass48_1.aBoolean119 = false;
		}
		Static14.aClass48_1 = null;
		if (Static89.aClass35_4 != null) {
			Static89.aClass35_4.method1349();
		}
		Static17.method529();
		Static10.method231();
		Static79.method1437();
		Static100.method1715();
		if (Static55.aClass30_2 != null) {
			Static55.aClass30_2.method1161();
		}
		Static58.method1247();
		try {
			if (Static88.aClass61_4 != null) {
				Static88.aClass61_4.method1737();
			}
			@Pc(49) int local49;
			if (Static28.aClass61Array1 != null) {
				for (local49 = 0; local49 < Static28.aClass61Array1.length; local49++) {
					if (Static28.aClass61Array1[local49] != null) {
						Static28.aClass61Array1[local49].method1737();
					}
				}
			}
			if (Static21.aClass61_1 != null) {
				Static21.aClass61_1.method1737();
			}
			if (Static69.aClass61Array2 != null) {
				for (local49 = 0; local49 < Static69.aClass61Array2.length; local49++) {
					if (Static69.aClass61Array2[local49] != null) {
						Static69.aClass61Array2[local49].method1737();
					}
				}
			}
		} catch (@Pc(96) IOException local96) {
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method416() {
		Static49.anInt2694++;
		this.method425();
		Static79.method1440();
		Static69.method1380();
		Static100.method1714();
		Static63.method1321();
		if (Static103.anInt2775 == 0) {
			Static61.method1303();
		} else if (Static103.anInt2775 == 5) {
			Static61.method1303();
		} else if (Static103.anInt2775 == 10) {
			Static57.method1690();
		} else if (Static103.anInt2775 == 20) {
			Static57.method1690();
			Static18.method535();
		} else if (Static103.anInt2775 == 25) {
			Static61.method1301();
		}
		if (Static103.anInt2775 == 30) {
			Static78.method1431();
		} else if (Static103.anInt2775 == 35) {
			Static78.method1431();
		} else if (Static103.anInt2775 == 40) {
			Static18.method535();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method418() {
		Static5.anInt159 = Static95.anInt2576 == 0 ? 443 : Static2.anInt100 + 50000;
		Static8.anInt292 = Static95.anInt2576 == 0 ? 43594 : Static2.anInt100 + 40000;
		Static62.anInt2113 = Static8.anInt292;
		Static28.method788();
		Static45.method1070(Static70.method1381());
		Static70.method1382(Static70.method1381());
		Static5.anInt156 = Static84.anInt2324;
		try {
			@Pc(51) int local51;
			if (Static51.aClass51_2.aClass49_2 != null) {
				Static88.aClass61_4 = new Class61(Static51.aClass51_2.aClass49_2, 5200, 0);
				for (local51 = 0; local51 < 12; local51++) {
					Static28.aClass61Array1[local51] = new Class61(Static51.aClass51_2.aClass49Array1[local51], 6000, 0);
				}
				Static51.aClass51_2.aClass49_2 = null;
				Static51.aClass51_2.aClass49Array1 = null;
			}
			if (Static51.aClass51_2.aClass49_1 != null) {
				Static21.aClass61_1 = new Class61(Static51.aClass51_2.aClass49_1, 5200, 0);
				for (local51 = 0; local51 < 5; local51++) {
					Static69.aClass61Array2[local51] = new Class61(Static51.aClass51_2.aClass49Array2[local51], 6000, 0);
				}
				Static51.aClass51_2.aClass49Array2 = null;
				Static51.aClass51_2.aClass49_1 = null;
			}
		} catch (@Pc(116) IOException local116) {
			Static21.aClass61_1 = null;
			Static88.aClass61_4 = null;
		}
		if (Static95.anInt2576 != 0) {
			Static13.aBoolean39 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method425() {
		if (Static103.anInt2775 == 1000) {
			return;
		}
		if (Static55.aClass30_2 == null) {
			Static55.aClass30_2 = new Class30();
		}
		@Pc(22) boolean local22 = Static55.aClass30_2.method1160();
		if (!local22) {
			this.method422();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method427(@OriginalArg(1) int arg0) {
		Static25.anInt1108++;
		Static18.aClass59_1 = null;
		Static103.anInt2773 = 0;
		if (Static8.anInt292 == Static62.anInt2113) {
			Static62.anInt2113 = Static5.anInt159;
		} else {
			Static62.anInt2113 = Static8.anInt292;
		}
		Static51.aClass35_1 = null;
		if (Static25.anInt1108 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static103.anInt2775 <= 5) {
				this.method410("js5connect_full");
				Static103.anInt2775 = 1000;
			} else {
				Static59.anInt2042 = 3000;
			}
		} else if (Static25.anInt1108 >= 4) {
			if (Static103.anInt2775 <= 5) {
				this.method410("js5connect");
				Static103.anInt2775 = 1000;
			} else {
				Static59.anInt2042 = 3000;
			}
		}
	}
}
