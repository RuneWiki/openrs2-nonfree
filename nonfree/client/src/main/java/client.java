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
				Static92.method1480();
			}
			Static4.anInt140 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static90.anInt2132 = 0;
			} else if (arg0[1].equals("office")) {
				Static90.anInt2132 = 1;
			} else if (arg0[1].equals("local")) {
				Static90.anInt2132 = 2;
			} else {
				Static92.method1480();
			}
			if (arg0[2].equals("live")) {
				Static20.anInt475 = 0;
			} else if (arg0[2].equals("rc")) {
				Static20.anInt475 = 1;
			} else if (arg0[2].equals("wip")) {
				Static20.anInt475 = 2;
			} else {
				Static92.method1480();
			}
			if (arg0[3].equals("lowmem")) {
				Static31.method1676();
			} else if (arg0[3].equals("highmem")) {
				Static7.method188();
			} else {
				Static92.method1480();
			}
			if (arg0[4].equals("free")) {
				Static18.aBoolean37 = false;
			} else if (arg0[4].equals("members")) {
				Static18.aBoolean37 = true;
			} else {
				Static92.method1480();
			}
			@Pc(124) client local124 = new client();
			local124.method339("runescape", Static20.anInt475 + 32, InetAddress.getLocalHost());
		} catch (@Pc(138) Exception local138) {
			Static38.method727(null, local138);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method330() {
		if (Static44.anInt1075 == 0) {
			Static91.method1467(null, Static98.aClass40_680, Static94.anInt2194);
		} else if (Static44.anInt1075 == 5) {
			Static101.method1589(Static76.aClass2_Sub2_Sub2_Sub2_4, Static24.aGraphics1, Static14.aClass2_Sub2_Sub2_Sub2_1);
		} else if (Static44.anInt1075 == 10) {
			Static101.method1589(Static76.aClass2_Sub2_Sub2_Sub2_4, Static24.aGraphics1, Static14.aClass2_Sub2_Sub2_Sub2_1);
		} else if (Static44.anInt1075 == 20) {
			Static101.method1589(Static76.aClass2_Sub2_Sub2_Sub2_4, Static24.aGraphics1, Static14.aClass2_Sub2_Sub2_Sub2_1);
		} else if (Static44.anInt1075 == 25) {
			@Pc(97) int local97;
			if (Static68.anInt375 == 1) {
				if (Static34.anInt805 < Static44.anInt1080) {
					Static34.anInt805 = Static44.anInt1080;
				}
				local97 = (Static34.anInt805 - Static44.anInt1080) * 50 / Static34.anInt805;
				Static66.method1095(true, Static80.method1334(new Class40[] { Static10.aClass40_63, Static53.method859(local97), Static44.aClass40_335 }), Static98.aClass40_674);
			} else if (Static68.anInt375 == 2) {
				if (Static46.anInt2455 < Static67.anInt1667) {
					Static46.anInt2455 = Static67.anInt1667;
				}
				local97 = (Static46.anInt2455 - Static67.anInt1667) * 50 / Static46.anInt2455 + 50;
				Static66.method1095(true, Static80.method1334(new Class40[] { Static10.aClass40_63, Static53.method859(local97), Static44.aClass40_335 }), Static98.aClass40_674);
			} else {
				Static66.method1095(false, null, Static98.aClass40_674);
			}
		} else if (Static44.anInt1075 == 30) {
			Static94.method1489();
		} else if (Static44.anInt1075 == 35) {
			Static94.method1492();
		} else if (Static44.anInt1075 == 40) {
			Static66.method1095(false, Static2.aClass40_13, Static103.aClass40_714);
		}
		Static56.anInt2326 = 0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method341(@OriginalArg(1) int arg0) {
		Static67.anInt1675 = 0;
		Static27.anInt695++;
		if (Static96.anInt2341 == Static59.anInt1500) {
			Static59.anInt1500 = Static52.anInt1173;
		} else {
			Static59.anInt1500 = Static96.anInt2341;
		}
		Static29.aClass25_15 = null;
		Static80.aClass48_7 = null;
		if (Static27.anInt695 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static44.anInt1075 > 5) {
				Static45.anInt1097 = 3000;
			} else {
				this.method333("js5connect_full");
				Static44.anInt1075 = 1000;
			}
		} else if (Static27.anInt695 >= 2 && arg0 == 6) {
			this.method333("js5connect_outofdate");
			Static44.anInt1075 = 1000;
		} else if (Static27.anInt695 >= 4) {
			if (Static44.anInt1075 <= 5) {
				this.method333("js5connect");
				Static44.anInt1075 = 1000;
			} else {
				Static45.anInt1097 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method327() {
		Static96.anInt2341 = Static90.anInt2132 == 0 ? 43594 : Static4.anInt140 + 40000;
		Static59.anInt1500 = Static96.anInt2341;
		Static52.anInt1173 = Static90.anInt2132 == 0 ? 443 : Static4.anInt140 + 50000;
		Static56.method1538();
		Static37.method712(Static7.method185());
		Static67.method1097(Static7.method185());
		Static103.anInt2495 = Static8.anInt248;
		try {
			@Pc(55) int local55;
			if (Static99.aClass7_2.aClass16_1 != null) {
				Static66.aClass14_4 = new Class14(Static99.aClass7_2.aClass16_1, 5200, 0);
				for (local55 = 0; local55 < 12; local55++) {
					Static2.aClass14Array1[local55] = new Class14(Static99.aClass7_2.aClass16Array2[local55], 6000, 0);
				}
				Static105.aClass14_5 = new Class14(Static99.aClass7_2.aClass16_3, 6000, 0);
				Static74.aClass11_4 = new Class11(255, Static66.aClass14_4, Static105.aClass14_5, 500000);
				Static99.aClass7_2.aClass16_3 = null;
				Static99.aClass7_2.aClass16_1 = null;
				Static99.aClass7_2.aClass16Array2 = null;
			}
			if (Static99.aClass7_2.aClass16_2 != null) {
				Static10.aClass14_1 = new Class14(Static99.aClass7_2.aClass16_2, 5200, 0);
				for (local55 = 0; local55 < 5; local55++) {
					Static34.aClass14Array2[local55] = new Class14(Static99.aClass7_2.aClass16Array1[local55], 6000, 0);
				}
				Static99.aClass7_2.aClass16_2 = null;
				Static99.aClass7_2.aClass16Array1 = null;
			}
		} catch (@Pc(144) IOException local144) {
			Static66.aClass14_4 = null;
			Static10.aClass14_1 = null;
			Static105.aClass14_5 = null;
			Static74.aClass11_4 = null;
		}
		if (Static90.anInt2132 != 0) {
			Static96.aBoolean173 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method342() {
		if (Static44.anInt1075 != 1000) {
			@Pc(10) boolean local10 = Static34.method625();
			if (!local10) {
				this.method343();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method331()) {
			return;
		}
		Static4.anInt140 = Integer.parseInt(this.getParameter("worldid"));
		Static20.anInt475 = Integer.parseInt(this.getParameter("modewhat"));
		Static90.anInt2132 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static31.method1676();
		} else {
			Static7.method188();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static18.aBoolean37 = true;
		} else {
			Static18.aBoolean37 = false;
		}
		this.method326(Static20.anInt475 + 32);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method343() {
		if (Static72.anInt1792 >= 4) {
			this.method333("js5crc");
			Static44.anInt1075 = 1000;
			return;
		}
		if (Static101.anInt2401 >= 4) {
			if (Static44.anInt1075 <= 5) {
				this.method333("js5io");
				Static44.anInt1075 = 1000;
				return;
			}
			Static101.anInt2401 = 3;
			Static45.anInt1097 = 3000;
		}
		if (Static45.anInt1097-- > 0) {
			return;
		}
		try {
			if (Static67.anInt1675 == 0) {
				Static80.aClass48_7 = Static99.aClass7_2.method202(Static59.anInt1500);
				Static67.anInt1675++;
			}
			if (Static67.anInt1675 == 1) {
				if (Static80.aClass48_7.anInt1928 == 2) {
					this.method341(-1);
					return;
				}
				if (Static80.aClass48_7.anInt1928 == 1) {
					Static67.anInt1675++;
				}
			}
			if (Static67.anInt1675 == 2) {
				Static29.aClass25_15 = new Class25((Socket) Static80.aClass48_7.anObject4, Static99.aClass7_2);
				@Pc(103) Class2_Sub3 local103 = new Class2_Sub3(5);
				local103.method1703(15);
				local103.method1725(410);
				Static29.aClass25_15.method731(local103.aByteArray24, 5);
				Static67.anInt1675++;
				Static12.aLong24 = System.currentTimeMillis();
			}
			if (Static67.anInt1675 == 3) {
				if (Static44.anInt1075 <= 5 || Static29.aClass25_15.method728() > 0) {
					@Pc(142) int local142 = Static29.aClass25_15.method726();
					if (local142 != 0) {
						this.method341(local142);
						return;
					}
					Static67.anInt1675++;
				} else if (System.currentTimeMillis() - Static12.aLong24 > 30000L) {
					this.method341(-2);
					return;
				}
			}
			if (Static67.anInt1675 == 4) {
				Static81.method1336(Static29.aClass25_15, Static44.anInt1075 > 20);
				Static27.anInt695 = 0;
				Static80.aClass48_7 = null;
				Static29.aClass25_15 = null;
				Static67.anInt1675 = 0;
			}
		} catch (@Pc(196) IOException local196) {
			this.method341(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method332() {
		Static16.method344();
		Static72.method1170();
		Static68.method325();
		Static91.method1466();
		Static79.method1278();
		Static76.method1472();
		Static51.method847();
		Static84.method1358();
		Static22.method1689();
		Static38.method733();
		Static4.method96();
		Static17.method345();
		Static13.method254();
		Static96.method1554();
		Static106.method1738();
		Static28.method571();
		Static89.method1431();
		Static27.method541();
		Static54.method919();
		Static75.method1219();
		Static63.method1058();
		Static90.method1464();
		Static60.method1003();
		Static56.method1546();
		Static35.method635();
		Static33.method613();
		Static7.method191();
		Static31.method1679();
		Static11.method234();
		Static36.method642();
		Static46.method1635();
		Static99.method70();
		Static80.method1328();
		Static25.method525();
		Static71.method1150();
		Static14.method263();
		Static70.method1112();
		Static66.method1093();
		Static88.method1405();
		Static49.method1531();
		Static98.method1569();
		Static1.method5();
		Static3.method24();
		Static82.method1346();
		Static69.method1102();
		Static52.method852();
		Static103.method1652();
		Static85.method1363();
		Static94.method1498();
		Static107.method1653();
		Static2.method20();
		Static104.method1666();
		Static73.method1206();
		Static41.method753();
		Static59.method994();
		Static6.method180();
		Static26.method1605();
		Static61.method1041();
		Static29.method581();
		Static67.method1096();
		Static23.method474();
		Static102.method1643();
		Static100.method1580();
		Static42.method775();
		Static37.method720();
		Static87.method1398();
		Static24.method506();
		Static5.method118();
		Static44.method790();
		Static21.method398();
		Static39.method740();
		Static74.method1211();
		Static30.method584();
		Static81.method1339();
		Static93.method1488();
		Static50.method842();
		Static10.method229();
		Static55.method940();
		Static95.method1520();
		Static19.method368();
		Static58.method991();
		Static86.method1382();
		Static62.method1043();
		Static34.method622();
		Static45.method802();
		Static20.method386();
		Static92.method1482();
		Static83.method1352();
		Static64.method1064();
		Static105.method1670();
		Static78.method1272();
		Static101.method1591();
		Static47.method804();
		Static32.method593();
		Static53.method858();
		Static43.method1245();
		Static12.method250();
		Static40.method1086();
		Static65.method1092();
		Static18.method356();
		Static97.method1562();
		Static15.method1264();
		Static9.method224();
		Static48.method823();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method334() {
		if (Static44.aClass52_1 != null) {
			Static44.aClass52_1.aBoolean157 = false;
		}
		Static44.aClass52_1 = null;
		if (Static70.aClass25_36 != null) {
			Static70.aClass25_36.method730();
		}
		Static49.method1530();
		Static56.method1541();
		Static94.method1493();
		Static7.method183();
		Static96.method1550();
		Static79.method1279();
		try {
			if (Static66.aClass14_4 != null) {
				Static66.aClass14_4.method353();
			}
			@Pc(43) int local43;
			if (Static2.aClass14Array1 != null) {
				for (local43 = 0; local43 < Static2.aClass14Array1.length; local43++) {
					if (Static2.aClass14Array1[local43] != null) {
						Static2.aClass14Array1[local43].method353();
					}
				}
			}
			if (Static105.aClass14_5 != null) {
				Static105.aClass14_5.method353();
			}
			if (Static10.aClass14_1 != null) {
				Static10.aClass14_1.method353();
			}
			if (Static34.aClass14Array2 != null) {
				for (local43 = 0; local43 < Static34.aClass14Array2.length; local43++) {
					if (Static34.aClass14Array2[local43] != null) {
						Static34.aClass14Array2[local43].method353();
					}
				}
			}
		} catch (@Pc(95) IOException local95) {
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method329() {
		Static107.anInt2511++;
		this.method342();
		Static81.method1341();
		Static94.method1500();
		Static17.method347();
		Static67.method1101();
		Static54.method916();
		if (Static44.anInt1075 == 0) {
			Static103.method1647();
			Static25.method524();
		} else if (Static44.anInt1075 == 5) {
			Static103.method1647();
			Static25.method524();
		} else if (Static44.anInt1075 == 10) {
			Static56.method1548();
		} else if (Static44.anInt1075 == 20) {
			Static56.method1548();
			Static43.method1246();
		} else if (Static44.anInt1075 == 25) {
			Static73.method1205();
		}
		if (Static44.anInt1075 == 30) {
			Static92.method1479();
		} else if (Static44.anInt1075 == 35) {
			Static92.method1479();
		} else if (Static44.anInt1075 == 40) {
			Static43.method1246();
			return;
		}
	}
}
