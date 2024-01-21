import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
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
			if (arg0.length != 7) {
				Static75.method1286();
			}
			Static113.anInt2771 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static22.anInt728 = 0;
			} else if (arg0[1].equals("office")) {
				Static22.anInt728 = 1;
			} else if (arg0[1].equals("local")) {
				Static22.anInt728 = 2;
			} else {
				Static75.method1286();
			}
			if (arg0[2].equals("live")) {
				Static17.anInt511 = 0;
			} else if (arg0[2].equals("rc")) {
				Static17.anInt511 = 1;
			} else if (arg0[2].equals("wip")) {
				Static17.anInt511 = 2;
			} else {
				Static75.method1286();
			}
			if (arg0[3].equals("lowmem")) {
				Static22.method513();
			} else if (arg0[3].equals("highmem")) {
				Static59.method1064();
			} else {
				Static75.method1286();
			}
			if (arg0[4].equals("free")) {
				Static82.aBoolean70 = false;
			} else if (arg0[4].equals("members")) {
				Static82.aBoolean70 = true;
			} else {
				Static75.method1286();
			}
			if (arg0[5].equals("english")) {
				Static131.anInt3269 = 0;
			} else if (arg0[5].equals("german")) {
				Static118.method2109();
				Static131.anInt3269 = 1;
				Static49.aClass5_618 = Static49.aClass5_615;
			} else {
				Static75.method1286();
			}
			if (arg0[6].equals("game0")) {
				Static36.anInt952 = 0;
			} else if (arg0[6].equals("game1")) {
				Static36.anInt952 = 1;
			} else {
				Static75.method1286();
			}
			Static1.aString1 = "127.0.0.1";
			@Pc(174) client local174 = new client();
			local174.method510("runescape", Static17.anInt511 + 32);
		} catch (@Pc(187) Exception local187) {
			Static122.method2173(local187, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method509() {
		@Pc(8) boolean local8 = Static93.method1592();
		if (local8 && Static18.aBoolean117 && Static113.aClass10_2 != null) {
			Static113.aClass10_2.method1289();
		}
		if (Static113.aBoolean106) {
			Static77.method1329(Static12.aCanvas3);
			Static59.method1065(Static12.aCanvas3);
			if (Static74.aClass50_1 != null) {
				Static74.aClass50_1.method1349(Static12.aCanvas3);
			}
			this.method519();
			Static92.method1584(Static12.aCanvas3);
			Static79.method1372(Static12.aCanvas3);
			if (Static74.aClass50_1 != null) {
				Static74.aClass50_1.method1343(Static12.aCanvas3);
			}
		}
		if (Static95.anInt2352 == 0) {
			Static8.method242(null, Static93.aClass5_1109, Static12.anInt3240);
		} else if (Static95.anInt2352 == 5) {
			Static100.method1694(Static25.aClass1_Sub3_Sub1_Sub1_1, Static48.aClass1_Sub3_Sub1_Sub1_2);
		} else if (Static95.anInt2352 == 10) {
			Static100.method1694(Static25.aClass1_Sub3_Sub1_Sub1_1, Static48.aClass1_Sub3_Sub1_Sub1_2);
		} else if (Static95.anInt2352 == 20) {
			Static100.method1694(Static25.aClass1_Sub3_Sub1_Sub1_1, Static48.aClass1_Sub3_Sub1_Sub1_2);
		} else if (Static95.anInt2352 == 25) {
			@Pc(107) int local107;
			if (Static92.anInt2322 == 1) {
				if (Static54.anInt1300 < Static124.anInt3182) {
					Static54.anInt1300 = Static124.anInt3182;
				}
				local107 = (Static54.anInt1300 - Static124.anInt3182) * 50 / Static54.anInt1300;
				Static40.method783(Static100.method1696(new Class5[] { Static12.aClass5_1454, Static120.aClass5_923, Static48.method838(local107), Static113.aClass5_1293 }), false);
			} else if (Static92.anInt2322 == 2) {
				if (Static12.anInt3241 > Static10.anInt315) {
					Static10.anInt315 = Static12.anInt3241;
				}
				local107 = (Static10.anInt315 - Static12.anInt3241) * 50 / Static10.anInt315 + 50;
				Static40.method783(Static100.method1696(new Class5[] { Static12.aClass5_1454, Static120.aClass5_923, Static48.method838(local107), Static113.aClass5_1293 }), false);
			} else {
				Static40.method783(Static12.aClass5_1454, false);
			}
		} else if (Static95.anInt2352 == 30) {
			Static78.method1364();
		} else if (Static95.anInt2352 == 40) {
			Static40.method783(Static100.method1696(new Class5[] { Static129.aClass5_1471, Static120.aClass5_937, Static89.aClass5_1367 }), false);
		}
		@Pc(248) int local248;
		@Pc(246) Graphics local246;
		if (Static95.anInt2352 == 30 && Static108.anInt2660 == 0 && !Static7.aBoolean5) {
			try {
				local246 = Static12.aCanvas3.getGraphics();
				for (local248 = 0; local248 < Static74.anInt1725; local248++) {
					if (Static113.aBooleanArray25[local248]) {
						Static90.aClass43_1.method2198(Static76.anIntArray294[local248], local246, Static28.anIntArray100[local248], Static84.anIntArray330[local248], Static92.anIntArray352[local248]);
						Static113.aBooleanArray25[local248] = false;
					}
				}
			} catch (@Pc(280) Exception local280) {
				Static12.aCanvas3.repaint();
			}
		} else if (Static95.anInt2352 > 0) {
			try {
				local246 = Static12.aCanvas3.getGraphics();
				Static90.aClass43_1.method2199(local246);
				Static7.aBoolean5 = false;
				for (local248 = 0; local248 < Static74.anInt1725; local248++) {
					Static113.aBooleanArray25[local248] = false;
				}
			} catch (@Pc(317) Exception local317) {
				Static12.aCanvas3.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method516() {
		Static21.method525();
		Static6.method190();
		Static22.method507();
		Static12.method2243();
		Static66.method2196();
		Static127.method2248();
		Static105.method2057();
		Static123.method2181();
		Static101.method1727();
		Static85.method1497();
		Static108.method1884();
		Static119.method2163();
		Static118.method2121();
		Static4.method169();
		Static107.method1840();
		Static77.method1326();
		Static91.method1571();
		Static80.method1408();
		Static82.method1447();
		Static11.method285();
		Static120.method1348();
		Static75.method1285();
		Static63.method1300();
		Static5.method175();
		Static116.method2044();
		Static81.method1436();
		Static18.method2154();
		Static111.method1925();
		Static83.method1476();
		Static28.method602();
		Static117.method2225();
		Static121.method2165();
		Static25.method546();
		Static43.method790();
		Static31.method644();
		Static14.method364();
		Static59.method1063();
		Static131.method2261();
		Static92.method1587();
		Static113.method1947();
		Static109.method1889();
		Static69.method1212();
		Static89.method2145();
		Static99.method1688();
		Static41.method784();
		Static36.method679();
		Static23.method533();
		Static29.method603();
		Static98.method1645();
		Static32.method655();
		Static52.method905();
		Static20.method488();
		Static51.method899();
		Static62.method1717();
		Static64.method1147();
		Static97.method1640();
		Static47.method831();
		Static68.method1208();
		Static13.method299();
		Static71.method1230();
		Static2.method56();
		Static37.method684();
		Static30.method607();
		Static96.method1625();
		Static65.method1181();
		Static40.method780();
		Static129.method2252();
		Static33.method1972();
		Static87.method2229();
		Static114.method1994();
		Static74.method1276();
		Static53.method922();
		Static78.method1368();
		Static9.method261();
		Static56.method1020();
		Static17.method418();
		Static8.method248();
		Static86.method1525();
		Static73.method1263();
		Static115.method2026();
		Static46.method827();
		Static27.method590();
		Static90.method1559();
		Static126.method2237();
		Static54.method943();
		Static26.method566();
		Static57.method1045();
		Static61.method1102();
		Static3.method57();
		Static112.method1927();
		Static93.method1590();
		Static72.method1231();
		Static1.method50();
		Static84.method1494();
		Static10.method282();
		Static16.method400();
		Static104.method1753();
		Static38.method694();
		Static44.method800();
		Static100.method1693();
		Static34.method666();
		Static50.method891();
		Static60.method1091();
		Static106.method1825();
		Static19.method485();
		Static49.method865();
		Static70.method1223();
		Static39.method771();
		Static128.method2249();
		Static103.method1748();
		Static125.method2219();
		Static124.method2207();
		Static45.method1931();
		Static79.method1373();
		Static24.method539();
		Static55.method947();
		Static15.method399();
		Static130.method2259();
		Static122.method2171();
		Static94.method1594();
		Static76.method1313();
		Static102.method1744();
		Static110.method1895();
		Static7.method224();
		Static95.method1602();
		Static48.method840();
		Static35.method676();
		Static67.method1198();
		Static42.method788();
		Static58.method1057();
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method526() {
		if (Static95.anInt2352 != 1000) {
			@Pc(14) boolean local14 = Static39.method778();
			if (!local14) {
				this.method531();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method508()) {
			return;
		}
		Static113.anInt2771 = Integer.parseInt(this.getParameter("worldid"));
		Static17.anInt511 = Integer.parseInt(this.getParameter("modewhat"));
		Static22.anInt728 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static22.method513();
		} else {
			Static59.method1064();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static82.aBoolean70 = true;
		} else {
			Static82.aBoolean70 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static118.method2109();
			Static131.anInt3269 = 1;
			Static49.aClass5_618 = Static49.aClass5_615;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static36.anInt952 = 1;
		} else {
			Static36.anInt952 = 0;
		}
		try {
			Static96.anInt2386 = Integer.parseInt(this.getParameter("js"));
			Static108.anInt2670 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(101) Exception local101) {
		}
		Static1.aString1 = this.getCodeBase().getHost();
		this.method512(Static17.anInt511 + 32);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method527(@OriginalArg(0) int arg0) {
		Static28.anInt864++;
		if (Static49.anInt1195 == Static96.anInt2385) {
			Static49.anInt1195 = Static57.anInt1368;
		} else {
			Static49.anInt1195 = Static96.anInt2385;
		}
		Static122.anInt3122 = 0;
		Static66.aClass51_9 = null;
		Static75.aClass78_4 = null;
		if (Static28.anInt864 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static95.anInt2352 <= 5) {
				this.method515("js5connect_full");
				Static95.anInt2352 = 1000;
			} else {
				Static83.anInt2120 = 3000;
			}
		} else if (Static28.anInt864 >= 2 && arg0 == 6) {
			this.method515("js5connect_outofdate");
			Static95.anInt2352 = 1000;
		} else if (Static28.anInt864 >= 4) {
			if (Static95.anInt2352 <= 5) {
				this.method515("js5connect");
				Static95.anInt2352 = 1000;
			} else {
				Static83.anInt2120 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method511() {
		if (Static40.aClass79_1 != null) {
			Static40.aClass79_1.aBoolean122 = false;
		}
		Static40.aClass79_1 = null;
		if (Static11.aClass78_2 != null) {
			Static11.aClass78_2.method2176();
			Static11.aClass78_2 = null;
		}
		Static80.method1412();
		Static24.method538();
		Static74.aClass50_1 = null;
		if (Static113.aClass10_2 != null) {
			Static113.aClass10_2.method1303();
		}
		if (Static97.aClass10_1 != null) {
			Static97.aClass10_1.method1303();
		}
		Static10.method278();
		Static96.method1621();
		try {
			if (Static46.aClass54_1 != null) {
				Static46.aClass54_1.method1504();
			}
			if (Static1.aClass54Array1 != null) {
				for (@Pc(56) int local56 = 0; local56 < Static1.aClass54Array1.length; local56++) {
					if (Static1.aClass54Array1[local56] != null) {
						Static1.aClass54Array1[local56].method1504();
					}
				}
			}
			if (Static75.aClass54_2 != null) {
				Static75.aClass54_2.method1504();
			}
		} catch (@Pc(79) IOException local79) {
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method521() {
		Static96.anInt2385 = Static22.anInt728 == 0 ? 43594 : Static113.anInt2771 + 40000;
		Static49.anInt1195 = Static96.anInt2385;
		Static57.anInt1368 = Static22.anInt728 == 0 ? 443 : Static113.anInt2771 + 50000;
		Static98.method1647();
		Static92.method1584(Static12.aCanvas3);
		Static79.method1372(Static12.aCanvas3);
		Static74.aClass50_1 = Static96.method1623();
		if (Static74.aClass50_1 != null) {
			Static74.aClass50_1.method1343(Static12.aCanvas3);
		}
		Static95.anInt2357 = Static88.anInt2199;
		try {
			if (Static65.aClass55_2.aClass19_2 != null) {
				Static46.aClass54_1 = new Class54(Static65.aClass55_2.aClass19_2, 5200, 0);
				for (@Pc(64) int local64 = 0; local64 < 16; local64++) {
					Static1.aClass54Array1[local64] = new Class54(Static65.aClass55_2.aClass19Array1[local64], 6000, 0);
				}
				Static75.aClass54_2 = new Class54(Static65.aClass55_2.aClass19_3, 6000, 0);
				Static118.aClass70_4 = new Class70(255, Static46.aClass54_1, Static75.aClass54_2, 500000);
				Static65.aClass55_2.aClass19Array1 = null;
				Static65.aClass55_2.aClass19_3 = null;
				Static65.aClass55_2.aClass19_2 = null;
			}
		} catch (@Pc(111) IOException local111) {
			Static75.aClass54_2 = null;
			Static46.aClass54_1 = null;
			Static118.aClass70_4 = null;
		}
		if (Static22.anInt728 != 0) {
			Static63.aBoolean60 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method520() {
		Static131.anInt3270++;
		this.method526();
		Static57.method1041();
		Static101.method1726();
		Static101.method1733();
		Static92.method1583();
		Static81.method1431();
		if (Static74.aClass50_1 != null) {
			@Pc(36) int local36 = Static74.aClass50_1.method1344();
			Static120.anInt1843 = local36;
		}
		if (Static95.anInt2352 == 0) {
			Static109.method1888();
			Static17.method419();
		} else if (Static95.anInt2352 == 5) {
			Static44.method799(this);
			Static109.method1888();
			Static17.method419();
		} else if (Static95.anInt2352 == 10) {
			Static44.method799(this);
		} else if (Static95.anInt2352 == 20) {
			Static44.method799(this);
			Static122.method2170();
		} else if (Static95.anInt2352 == 25) {
			Static83.method1472();
		}
		if (Static95.anInt2352 == 30) {
			Static123.method2183();
		} else if (Static95.anInt2352 == 40) {
			Static122.method2170();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method531() {
		if (Static80.anInt1993 >= 4) {
			this.method515("js5crc");
			Static95.anInt2352 = 1000;
			return;
		}
		if (Static120.anInt1835 >= 4) {
			if (Static95.anInt2352 <= 5) {
				this.method515("js5io");
				Static95.anInt2352 = 1000;
				return;
			}
			Static83.anInt2120 = 3000;
			Static120.anInt1835 = 3;
		}
		if (Static83.anInt2120-- > 0) {
			return;
		}
		try {
			if (Static122.anInt3122 == 0) {
				Static66.aClass51_9 = Static65.aClass55_2.method1536(Static1.aString1, Static49.anInt1195);
				Static122.anInt3122++;
			}
			if (Static122.anInt3122 == 1) {
				if (Static66.aClass51_9.anInt1880 == 2) {
					this.method527(-1);
					return;
				}
				if (Static66.aClass51_9.anInt1880 == 1) {
					Static122.anInt3122++;
				}
			}
			if (Static122.anInt3122 == 2) {
				Static75.aClass78_4 = new Class78((Socket) Static66.aClass51_9.anObject2, Static65.aClass55_2);
				@Pc(99) Class1_Sub20 local99 = new Class1_Sub20(5);
				local99.method2081(15);
				local99.method2092(461);
				Static75.aClass78_4.method2182(5, local99.aByteArray36);
				Static122.anInt3122++;
				Static129.aLong97 = Static52.method906();
			}
			if (Static122.anInt3122 == 3) {
				if (Static95.anInt2352 <= 5 || Static75.aClass78_4.method2179() > 0) {
					@Pc(138) int local138 = Static75.aClass78_4.method2175();
					if (local138 != 0) {
						this.method527(local138);
						return;
					}
					Static122.anInt3122++;
				} else if (Static52.method906() - Static129.aLong97 > 30000L) {
					this.method527(-2);
					return;
				}
			}
			if (Static122.anInt3122 == 4) {
				Static124.method2205(Static95.anInt2352 > 20, Static75.aClass78_4);
				Static28.anInt864 = 0;
				Static66.aClass51_9 = null;
				Static122.anInt3122 = 0;
				Static75.aClass78_4 = null;
			}
		} catch (@Pc(192) IOException local192) {
			this.method527(-3);
		}
	}
}
