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

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "[I")
	public static int[] anIntArray63 = new int[99];

	static {
		@Pc(37) int local37 = 0;
		for (@Pc(39) int local39 = 0; local39 < 99; local39++) {
			@Pc(44) int local44 = local39 + 1;
			@Pc(57) int local57 = (int) ((double) local44 + Math.pow(2.0D, (double) local44 / 7.0D) * 300.0D);
			local37 += local57;
			anIntArray63[local39] = local37 / 4;
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static10.method110();
			}
			Static1.anInt68 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static42.anInt1457 = 0;
			} else if (arg0[1].equals("office")) {
				Static42.anInt1457 = 1;
			} else if (arg0[1].equals("local")) {
				Static42.anInt1457 = 2;
			} else {
				Static10.method110();
			}
			if (arg0[2].equals("live")) {
				Static66.anInt1968 = 0;
			} else if (arg0[2].equals("rc")) {
				Static66.anInt1968 = 1;
			} else if (arg0[2].equals("wip")) {
				Static66.anInt1968 = 2;
			} else {
				Static10.method110();
			}
			if (arg0[3].equals("lowmem")) {
				Static100.method1674();
			} else if (arg0[3].equals("highmem")) {
				Static25.method417();
			} else {
				Static10.method110();
			}
			if (arg0[4].equals("free")) {
				Static37.aBoolean68 = false;
			} else if (arg0[4].equals("members")) {
				Static37.aBoolean68 = true;
			} else {
				Static10.method110();
			}
			if (arg0[5].equals("english")) {
				Static98.anInt2533 = 0;
			} else if (arg0[5].equals("german")) {
				Static114.method1932();
				Static98.anInt2533 = 1;
			} else {
				Static10.method110();
			}
			@Pc(154) client local154 = new client();
			local154.method214(InetAddress.getLocalHost(), Static66.anInt1968 + 32, "runescape");
		} catch (@Pc(168) Exception local168) {
			Static42.method908(null, local168);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method225() {
		Static7.anInt176++;
		this.method230();
		Static49.method899();
		Static77.method1347();
		Static79.method1366();
		Static87.method1870();
		Static66.method1259();
		if (Static98.anInt2537 == 0) {
			Static73.method1310();
			Static108.method1841();
		} else if (Static98.anInt2537 == 5) {
			Static73.method1310();
			Static108.method1841();
		} else if (Static98.anInt2537 == 10) {
			Static40.method867();
		} else if (Static98.anInt2537 == 20) {
			Static40.method867();
			Static110.method1903();
		} else if (Static98.anInt2537 == 25) {
			Static28.method1388();
		}
		if (Static98.anInt2537 == 30) {
			Static75.method1319();
		} else if (Static98.anInt2537 == 35) {
			Static75.method1319();
		} else if (Static98.anInt2537 == 40) {
			Static110.method1903();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method230() {
		if (Static98.anInt2537 != 1000) {
			@Pc(14) boolean local14 = Static60.method1129();
			if (!local14) {
				this.method232();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method220() {
		Static17.method234();
		Static32.method521();
		Static68.method223();
		Static49.method902();
		Static70.method1142();
		Static64.method1244();
		Static88.method717();
		Static115.method1939();
		Static110.method1896();
		Static75.method1326();
		Static66.method1256();
		Static20.method336();
		Static36.method737();
		Static38.method827();
		Static103.method1726();
		Static79.method1352();
		Static80.method1398();
		Static72.method1290();
		Static26.method433();
		Static40.method873();
		Static95.method1621();
		Static28.method1395();
		Static73.method1313();
		Static107.method1817();
		Static21.method347();
		Static92.method1912();
		Static54.method1047();
		Static61.method1198();
		Static8.method100();
		Static34.method581();
		Static81.method1436();
		Static13.method129();
		Static114.method1926();
		Static51.method993();
		Static45.method954();
		Static100.method1673();
		Static35.method594();
		Static2.method1420();
		Static3.method64();
		Static37.method748();
		Static52.method996();
		Static43.method914();
		Static78.method1351();
		Static48.method988();
		Static99.method1660();
		Static82.method1456();
		Static58.method1856();
		Static87.method1866();
		Static60.method1126();
		Static77.method1343();
		Static12.method1543();
		Static83.method1458();
		Static19.method275();
		Static27.method438();
		Static62.method1209();
		Static69.method1284();
		Static98.method1651();
		Static93.method1591();
		Static24.method1573();
		Static50.method991();
		Static16.method192();
		Static56.method1072();
		Static18.method251();
		Static102.method1707();
		Static108.method1838();
		Static15.method172();
		Static1.method41();
		Static109.method1859();
		Static41.method894();
		Static104.method1775();
		Static97.method1642();
		Static76.method1338();
		Static6.method77();
		Static105.method1783();
		Static94.method1608();
		Static71.method1286();
		Static47.method981();
		Static112.method1915();
		Static84.method1469();
		Static90.method1537();
		Static25.method415();
		Static4.method68();
		Static29.method448();
		Static46.method979();
		Static57.method1101();
		Static5.method69();
		Static89.method1525();
		Static33.method568();
		Static31.method508();
		Static39.method857();
		Static67.method1265();
		Static113.method1920();
		Static42.method909();
		Static55.method1069();
		Static11.method115();
		Static23.method384();
		Static9.method103();
		Static22.method378();
		Static65.method1255();
		Static85.method1480();
		Static111.method1906();
		Static44.method922();
		Static96.method1112();
		Static7.method93();
		Static30.method1554();
		Static91.method1560();
		Static10.method112();
		Static106.method1800();
		Static63.method1224();
		Static74.method1120();
		Static101.method1692();
		Static14.method156();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method224() {
		Static100.anInt2580 = Static42.anInt1457 == 0 ? 443 : Static1.anInt68 + 50000;
		Static92.anInt2923 = Static42.anInt1457 == 0 ? 43594 : Static1.anInt68 + 40000;
		Static19.anInt493 = Static92.anInt2923;
		Static62.method1211();
		Static98.method1652(Static26.aCanvas1);
		Static35.method598(Static26.aCanvas1);
		Static70.anInt1835 = Static86.anInt2354;
		try {
			if (Static26.aClass54_2.aClass60_3 != null) {
				Static1.aClass46_1 = new Class46(Static26.aClass54_2.aClass60_3, 5200, 0);
				for (@Pc(52) int local52 = 0; local52 < 14; local52++) {
					Static80.aClass46Array1[local52] = new Class46(Static26.aClass54_2.aClass60Array1[local52], 6000, 0);
				}
				Static37.aClass46_2 = new Class46(Static26.aClass54_2.aClass60_2, 6000, 0);
				Static55.aClass41_2 = new Class41(255, Static1.aClass46_1, Static37.aClass46_2, 500000);
				Static26.aClass54_2.aClass60_2 = null;
				Static26.aClass54_2.aClass60_3 = null;
				Static26.aClass54_2.aClass60Array1 = null;
			}
		} catch (@Pc(97) IOException local97) {
			Static37.aClass46_2 = null;
			Static1.aClass46_1 = null;
			Static55.aClass41_2 = null;
		}
		if (Static42.anInt1457 != 0) {
			Static102.aBoolean122 = true;
		}
		Static28.aClass1_Sub1_Sub7_6 = new Class1_Sub1_Sub7();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method212() {
		if (Static9.aBoolean6) {
			Static25.method416(Static26.aCanvas1);
			Static99.method1662(Static26.aCanvas1);
			this.method215();
			Static98.method1652(Static26.aCanvas1);
			Static35.method598(Static26.aCanvas1);
		}
		if (Static98.anInt2537 == 0) {
			Static39.method861(Static76.aClass23_1217, Static14.anInt273, null);
		} else if (Static98.anInt2537 == 5) {
			Static114.method1925(Static2.aClass1_Sub1_Sub6_Sub2_13, Static63.aClass1_Sub1_Sub6_Sub2_10);
		} else if (Static98.anInt2537 == 10) {
			Static114.method1925(Static2.aClass1_Sub1_Sub6_Sub2_13, Static63.aClass1_Sub1_Sub6_Sub2_10);
		} else if (Static98.anInt2537 == 20) {
			Static114.method1925(Static2.aClass1_Sub1_Sub6_Sub2_13, Static63.aClass1_Sub1_Sub6_Sub2_10);
		} else if (Static98.anInt2537 == 25) {
			@Pc(86) int local86;
			if (Static87.anInt2853 == 1) {
				if (Static11.anInt211 > Static109.anInt2833) {
					Static109.anInt2833 = Static11.anInt211;
				}
				local86 = (Static109.anInt2833 - Static11.anInt211) * 50 / Static109.anInt2833;
				Static83.method1459(true, Static17.method233(new Class23[] { Static61.aClass23_1047, Static19.method274(local86), Static67.aClass23_1130 }), Static56.aClass23_933);
			} else if (Static87.anInt2853 == 2) {
				if (Static14.anInt274 > Static27.anInt855) {
					Static27.anInt855 = Static14.anInt274;
				}
				local86 = (Static27.anInt855 - Static14.anInt274) * 50 / Static27.anInt855 + 50;
				Static83.method1459(true, Static17.method233(new Class23[] { Static61.aClass23_1047, Static19.method274(local86), Static67.aClass23_1130 }), Static56.aClass23_933);
			} else {
				Static83.method1459(false, null, Static56.aClass23_933);
			}
		} else if (Static98.anInt2537 == 30) {
			Static50.method990();
		} else if (Static98.anInt2537 == 35) {
			Static35.method593();
		} else if (Static98.anInt2537 == 40) {
			Static83.method1459(false, Static60.aClass23_988, Static7.aClass23_142);
		}
		Static41.anInt1432 = 0;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method232() {
		if (Static51.anInt1623 >= 4) {
			this.method228("js5crc");
			Static98.anInt2537 = 1000;
			return;
		}
		if (Static95.anInt2504 >= 4) {
			if (Static98.anInt2537 <= 5) {
				this.method228("js5io");
				Static98.anInt2537 = 1000;
				return;
			}
			Static95.anInt2504 = 3;
			Static92.anInt2917 = 3000;
		}
		if (Static92.anInt2917-- > 0) {
			return;
		}
		try {
			if (Static25.anInt761 == 0) {
				Static89.aClass62_43 = Static26.aClass54_2.method1492(Static19.anInt493);
				Static25.anInt761++;
			}
			if (Static25.anInt761 == 1) {
				if (Static89.aClass62_43.anInt2572 == 2) {
					this.method235(-1);
					return;
				}
				if (Static89.aClass62_43.anInt2572 == 1) {
					Static25.anInt761++;
				}
			}
			if (Static25.anInt761 == 2) {
				Static83.aClass68_3 = new Class68((Socket) Static89.aClass62_43.anObject4, Static26.aClass54_2);
				@Pc(106) Class1_Sub5 local106 = new Class1_Sub5(5);
				local106.method674(15);
				local106.method679(441);
				Static83.aClass68_3.method1942(local106.aByteArray6, 5);
				Static25.anInt761++;
				Static100.aLong76 = Static82.method1454();
			}
			if (Static25.anInt761 == 3) {
				if (Static98.anInt2537 <= 5 || Static83.aClass68_3.method1941() > 0) {
					@Pc(161) int local161 = Static83.aClass68_3.method1940();
					if (local161 != 0) {
						this.method235(local161);
						return;
					}
					Static25.anInt761++;
				} else if (Static82.method1454() - Static100.aLong76 > 30000L) {
					this.method235(-2);
					return;
				}
			}
			if (Static25.anInt761 == 4) {
				Static34.method584(Static83.aClass68_3, Static98.anInt2537 > 20);
				Static25.anInt761 = 0;
				Static34.anInt1076 = 0;
				Static83.aClass68_3 = null;
				Static89.aClass62_43 = null;
			}
		} catch (@Pc(196) IOException local196) {
			this.method235(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method213()) {
			return;
		}
		Static1.anInt68 = Integer.parseInt(this.getParameter("worldid"));
		Static66.anInt1968 = Integer.parseInt(this.getParameter("modewhat"));
		Static42.anInt1457 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static100.method1674();
		} else {
			Static25.method417();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static37.aBoolean68 = true;
		} else {
			Static37.aBoolean68 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static114.method1932();
			Static98.anInt2533 = 1;
		}
		this.method229(Static66.anInt1968 + 32);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method217() {
		if (Static57.aClass40_1 != null) {
			Static57.aClass40_1.aBoolean97 = false;
		}
		Static57.aClass40_1 = null;
		if (Static94.aClass68_4 != null) {
			Static94.aClass68_4.method1935();
			Static94.aClass68_4 = null;
		}
		Static57.method1093();
		Static106.method1799();
		Static77.method1348();
		Static64.method1241();
		Static114.method1933();
		Static60.method1130();
		try {
			if (Static1.aClass46_1 != null) {
				Static1.aClass46_1.method1320();
			}
			if (Static80.aClass46Array1 != null) {
				for (@Pc(48) int local48 = 0; local48 < Static80.aClass46Array1.length; local48++) {
					if (Static80.aClass46Array1[local48] != null) {
						Static80.aClass46Array1[local48].method1320();
					}
				}
			}
			if (Static37.aClass46_2 != null) {
				Static37.aClass46_2.method1320();
			}
		} catch (@Pc(75) IOException local75) {
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method235(@OriginalArg(1) int arg0) {
		Static89.aClass62_43 = null;
		Static25.anInt761 = 0;
		if (Static92.anInt2923 == Static19.anInt493) {
			Static19.anInt493 = Static100.anInt2580;
		} else {
			Static19.anInt493 = Static92.anInt2923;
		}
		Static34.anInt1076++;
		Static83.aClass68_3 = null;
		if (Static34.anInt1076 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static98.anInt2537 <= 5) {
				this.method228("js5connect_full");
				Static98.anInt2537 = 1000;
			} else {
				Static92.anInt2917 = 3000;
			}
		} else if (Static34.anInt1076 >= 2 && arg0 == 6) {
			this.method228("js5connect_outofdate");
			Static98.anInt2537 = 1000;
		} else if (Static34.anInt1076 >= 4) {
			if (Static98.anInt2537 > 5) {
				Static92.anInt2917 = 3000;
			} else {
				this.method228("js5connect");
				Static98.anInt2537 = 1000;
			}
		}
	}
}
