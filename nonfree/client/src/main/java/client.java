import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
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
				Static32.method645();
			}
			Static67.anInt1683 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static30.anInt925 = 0;
			} else if (arg0[1].equals("office")) {
				Static30.anInt925 = 1;
			} else if (arg0[1].equals("local")) {
				Static30.anInt925 = 2;
			} else {
				Static32.method645();
			}
			if (arg0[2].equals("live")) {
				Static71.anInt1725 = 0;
			} else if (arg0[2].equals("rc")) {
				Static71.anInt1725 = 1;
			} else if (arg0[2].equals("wip")) {
				Static71.anInt1725 = 2;
			} else {
				Static32.method645();
			}
			if (arg0[3].equals("lowmem")) {
				Static62.method1073();
			} else if (arg0[3].equals("highmem")) {
				Static29.method621();
			} else {
				Static32.method645();
			}
			if (arg0[4].equals("free")) {
				Static54.aBoolean49 = false;
			} else if (arg0[4].equals("members")) {
				Static54.aBoolean49 = true;
			} else {
				Static32.method645();
			}
			if (arg0[5].equals("english")) {
				Static13.anInt367 = 0;
			} else if (arg0[5].equals("german")) {
				Static98.method1660();
				Static96.aClass61_742 = Static79.aClass61_614;
				Static13.anInt367 = 1;
			} else {
				Static32.method645();
			}
			if (arg0[6].equals("game0")) {
				Static106.anInt2743 = 0;
			} else if (arg0[6].equals("game1")) {
				Static106.anInt2743 = 1;
			} else {
				Static32.method645();
			}
			Static30.aString1 = "127.0.0.1";
			@Pc(180) client local180 = new client();
			local180.method444(Static71.anInt1725 + 32, "runescape");
		} catch (@Pc(194) Exception local194) {
			Static21.method462(null, local194);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method439()) {
			return;
		}
		Static67.anInt1683 = Integer.parseInt(this.getParameter("worldid"));
		Static71.anInt1725 = Integer.parseInt(this.getParameter("modewhat"));
		Static30.anInt925 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static62.method1073();
		} else {
			Static29.method621();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static54.aBoolean49 = true;
		} else {
			Static54.aBoolean49 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static98.method1660();
			Static96.aClass61_742 = Static79.aClass61_614;
			Static13.anInt367 = 1;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static106.anInt2743 = 1;
		} else {
			Static106.anInt2743 = 0;
		}
		try {
			Static16.anInt495 = Integer.parseInt(this.getParameter("js"));
			Static91.anInt2419 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(101) Exception local101) {
		}
		Static30.aString1 = this.getCodeBase().getHost();
		this.method446(Static71.anInt1725 + 32);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method442() {
		Static58.anInt1422++;
		if (Static58.anInt1422 % 1000 == 1) {
			@Pc(28) GregorianCalendar local28 = new GregorianCalendar();
			Static95.anInt2450 = local28.get(11) * 600 + local28.get(12) * 10 + local28.get(13) / 6;
			Static92.aRandom2.setSeed((long) Static95.anInt2450);
		}
		this.method452();
		Static32.method646();
		Static104.method1754();
		Static48.method879();
		Static52.method962();
		Static17.method400();
		if (Static107.aClass6_1 != null) {
			@Pc(70) int local70 = Static107.aClass6_1.method54();
			Static90.anInt2381 = local70;
		}
		if (Static24.anInt723 == 0) {
			Static40.method738();
			Static114.method1870();
		} else if (Static24.anInt723 == 5) {
			Static79.method1297(this);
			Static40.method738();
			Static114.method1870();
		} else if (Static24.anInt723 == 10) {
			Static79.method1297(this);
		} else if (Static24.anInt723 == 20) {
			Static79.method1297(this);
			Static50.method891();
		} else if (Static24.anInt723 == 25) {
			Static52.method961();
		}
		if (Static24.anInt723 == 30) {
			Static70.method1160();
		} else if (Static24.anInt723 == 40) {
			Static50.method891();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method437() {
		@Pc(8) boolean local8 = Static17.method402();
		if (local8 && Static78.aBoolean75 && Static43.aClass12_3 != null) {
			Static43.aClass12_3.method1523();
		}
		if (Static113.aBoolean103) {
			Static92.method1431(Static4.aCanvas2);
			Static88.method2188(Static4.aCanvas2);
			if (Static107.aClass6_1 != null) {
				Static107.aClass6_1.method56(Static4.aCanvas2);
			}
			this.method447();
			Static81.method2182(Static4.aCanvas2);
			Static37.method703(Static4.aCanvas2);
			if (Static107.aClass6_1 != null) {
				Static107.aClass6_1.method53(Static4.aCanvas2);
			}
		}
		if (Static24.anInt723 == 0) {
			Static60.method1021(null, Static33.anInt1001, Static112.aClass61_886);
		} else if (Static24.anInt723 == 5) {
			Static103.method1746(Static100.aClass5_Sub2_Sub1_Sub1_Sub1_4, Static63.aClass5_Sub2_Sub1_Sub1_Sub1_3);
		} else if (Static24.anInt723 == 10) {
			Static103.method1746(Static100.aClass5_Sub2_Sub1_Sub1_Sub1_4, Static63.aClass5_Sub2_Sub1_Sub1_Sub1_3);
		} else if (Static24.anInt723 == 20) {
			Static103.method1746(Static100.aClass5_Sub2_Sub1_Sub1_Sub1_4, Static63.aClass5_Sub2_Sub1_Sub1_Sub1_3);
		} else if (Static24.anInt723 == 25) {
			@Pc(143) int local143;
			if (Static125.anInt3138 == 1) {
				if (Static132.anInt3364 < Static43.anInt1121) {
					Static132.anInt3364 = Static43.anInt1121;
				}
				local143 = (Static132.anInt3364 - Static43.anInt1121) * 50 / Static132.anInt3364;
				Static32.method651(Static123.method1929(new Class61[] { Static17.aClass61_165, Static44.aClass61_345, Static39.method730(local143), Static71.aClass61_534 }), false);
			} else if (Static125.anInt3138 == 2) {
				if (Static98.anInt2577 > Static115.anInt2985) {
					Static115.anInt2985 = Static98.anInt2577;
				}
				local143 = (Static115.anInt2985 - Static98.anInt2577) * 50 / Static115.anInt2985 + 50;
				Static32.method651(Static123.method1929(new Class61[] { Static17.aClass61_165, Static44.aClass61_345, Static39.method730(local143), Static71.aClass61_534 }), false);
			} else {
				Static32.method651(Static17.aClass61_165, false);
			}
		} else if (Static24.anInt723 == 30) {
			Static97.method1655();
		} else if (Static24.anInt723 == 40) {
			Static32.method651(Static123.method1929(new Class61[] { Static12.aClass61_111, Static40.aClass61_321, Static90.aClass61_697 }), false);
		}
		@Pc(259) int local259;
		@Pc(249) Graphics local249;
		if (Static24.anInt723 == 30 && Static66.anInt1591 == 0 && !Static58.aBoolean50) {
			try {
				local249 = Static4.aCanvas2.getGraphics();
				for (local259 = 0; local259 < Static129.anInt3251; local259++) {
					if (Static60.aBooleanArray8[local259]) {
						Static11.aClass36_1.method1763(Static56.anIntArray209[local259], Static40.anIntArray176[local259], Static81.anIntArray444[local259], Static82.anIntArray288[local259], local249);
						Static60.aBooleanArray8[local259] = false;
					}
				}
			} catch (@Pc(315) Exception local315) {
				Static4.aCanvas2.repaint();
			}
		} else if (Static24.anInt723 > 0) {
			try {
				local249 = Static4.aCanvas2.getGraphics();
				Static11.aClass36_1.method1765(local249);
				Static58.aBoolean50 = false;
				for (local259 = 0; local259 < Static129.anInt3251; local259++) {
					Static60.aBooleanArray8[local259] = false;
				}
			} catch (@Pc(275) Exception local275) {
				Static4.aCanvas2.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method451() {
		if (Static8.anInt181 >= 4) {
			this.method438("js5crc");
			Static24.anInt723 = 1000;
			return;
		}
		if (Static8.anInt194 >= 4) {
			if (Static24.anInt723 <= 5) {
				this.method438("js5io");
				Static24.anInt723 = 1000;
				return;
			}
			Static134.anInt3401 = 3000;
			Static8.anInt194 = 3;
		}
		if (Static134.anInt3401-- > 0) {
			return;
		}
		try {
			if (Static34.anInt1006 == 0) {
				Static2.aClass10_2 = Static86.aClass80_2.method2039(Static30.aString1, Static79.anInt2009);
				Static34.anInt1006++;
			}
			if (Static34.anInt1006 == 1) {
				if (Static2.aClass10_2.anInt242 == 2) {
					this.method453(-1);
					return;
				}
				if (Static2.aClass10_2.anInt242 == 1) {
					Static34.anInt1006++;
				}
			}
			if (Static34.anInt1006 == 2) {
				Static60.aClass30_7 = new Class30((Socket) Static2.aClass10_2.anObject1, Static86.aClass80_2);
				@Pc(95) Class5_Sub14 local95 = new Class5_Sub14(5);
				local95.method1440(15);
				local95.method1451(471);
				Static60.aClass30_7.method780(local95.aByteArray33, 5);
				Static34.anInt1006++;
				Static60.aLong50 = Static102.method1742();
			}
			if (Static34.anInt1006 == 3) {
				if (Static24.anInt723 <= 5 || Static60.aClass30_7.method777() > 0) {
					@Pc(152) int local152 = Static60.aClass30_7.method771();
					if (local152 != 0) {
						this.method453(local152);
						return;
					}
					Static34.anInt1006++;
				} else if (Static102.method1742() - Static60.aLong50 > 30000L) {
					this.method453(-2);
					return;
				}
			}
			if (Static34.anInt1006 == 4) {
				Static72.method1285(Static24.anInt723 > 20, Static60.aClass30_7);
				Static60.aClass30_7 = null;
				Static78.anInt1961 = 0;
				Static34.anInt1006 = 0;
				Static2.aClass10_2 = null;
			}
		} catch (@Pc(187) IOException local187) {
			this.method453(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method443() {
		if (Static47.aClass15_1 != null) {
			Static47.aClass15_1.aBoolean21 = false;
		}
		Static47.aClass15_1 = null;
		if (Static108.aClass30_2 != null) {
			Static108.aClass30_2.method779();
			Static108.aClass30_2 = null;
		}
		Static63.method1086();
		Static103.method1751();
		Static107.aClass6_1 = null;
		if (Static43.aClass12_3 != null) {
			Static43.aClass12_3.method1517();
		}
		if (Static108.aClass12_2 != null) {
			Static108.aClass12_2.method1517();
		}
		Static54.method994();
		Static106.method1770();
		try {
			if (Static108.aClass8_2 != null) {
				Static108.aClass8_2.method173();
			}
			if (Static125.aClass8Array1 != null) {
				for (@Pc(56) int local56 = 0; local56 < Static125.aClass8Array1.length; local56++) {
					if (Static125.aClass8Array1[local56] != null) {
						Static125.aClass8Array1[local56].method173();
					}
				}
			}
			if (Static132.aClass8_6 != null) {
				Static132.aClass8_6.method173();
			}
			if (Static82.aClass8_5 != null) {
				Static82.aClass8_5.method173();
			}
		} catch (@Pc(84) IOException local84) {
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method452() {
		if (Static24.anInt723 != 1000) {
			@Pc(12) boolean local12 = Static124.method1946();
			if (!local12) {
				this.method451();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method453(@OriginalArg(0) int arg0) {
		Static78.anInt1961++;
		Static60.aClass30_7 = null;
		if (Static79.anInt2009 == Static107.anInt2778) {
			Static79.anInt2009 = Static127.anInt3202;
		} else {
			Static79.anInt2009 = Static107.anInt2778;
		}
		Static34.anInt1006 = 0;
		Static2.aClass10_2 = null;
		if (Static78.anInt1961 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static24.anInt723 > 5) {
				Static134.anInt3401 = 3000;
			} else {
				this.method438("js5connect_full");
				Static24.anInt723 = 1000;
			}
		} else if (Static78.anInt1961 >= 2 && arg0 == 6) {
			this.method438("js5connect_outofdate");
			Static24.anInt723 = 1000;
		} else if (Static78.anInt1961 >= 4) {
			if (Static24.anInt723 <= 5) {
				this.method438("js5connect");
				Static24.anInt723 = 1000;
			} else {
				Static134.anInt3401 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method433() {
		Static127.anInt3202 = Static30.anInt925 == 0 ? 443 : Static67.anInt1683 + 50000;
		if (Static106.anInt2743 == 1) {
			Static34.aShortArray13 = Static57.aShortArray19;
			Static17.aShortArray12 = Static91.aShortArray25;
			Static116.aShortArrayArray6 = Static29.aShortArrayArray3;
			Static102.aShortArrayArray5 = Static125.aShortArrayArray7;
		} else {
			Static102.aShortArrayArray5 = Static1.aShortArrayArray1;
			Static17.aShortArray12 = Static57.aShortArray18;
			Static116.aShortArrayArray6 = Static4.aShortArrayArray4;
			Static34.aShortArray13 = Static95.aShortArray26;
		}
		Static107.anInt2778 = Static30.anInt925 == 0 ? 43594 : Static67.anInt1683 + 40000;
		Static79.anInt2009 = Static107.anInt2778;
		Static17.method399();
		Static81.method2182(Static4.aCanvas2);
		Static37.method703(Static4.aCanvas2);
		Static107.aClass6_1 = Static114.method1873();
		if (Static107.aClass6_1 != null) {
			Static107.aClass6_1.method53(Static4.aCanvas2);
		}
		Static65.anInt1581 = Static128.anInt3203;
		try {
			if (Static86.aClass80_2.aClass54_2 != null) {
				Static108.aClass8_2 = new Class8(Static86.aClass80_2.aClass54_2, 5200, 0);
				for (@Pc(92) int local92 = 0; local92 < 16; local92++) {
					Static125.aClass8Array1[local92] = new Class8(Static86.aClass80_2.aClass54Array1[local92], 6000, 0);
				}
				Static132.aClass8_6 = new Class8(Static86.aClass80_2.aClass54_3, 6000, 0);
				Static55.aClass40_2 = new Class40(255, Static108.aClass8_2, Static132.aClass8_6, 500000);
				Static82.aClass8_5 = new Class8(Static86.aClass80_2.aClass54_4, 24, 0);
				Static86.aClass80_2.aClass54Array1 = null;
				Static86.aClass80_2.aClass54_2 = null;
				Static86.aClass80_2.aClass54_3 = null;
				Static86.aClass80_2.aClass54_4 = null;
			}
		} catch (@Pc(150) IOException local150) {
			Static132.aClass8_6 = null;
			Static82.aClass8_5 = null;
			Static55.aClass40_2 = null;
			Static108.aClass8_2 = null;
		}
		if (Static30.anInt925 != 0) {
			Static102.aBoolean98 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method440() {
		Static19.method450();
		Static101.method1735();
		Static26.method445();
		Static72.method1284();
		Static64.method1764();
		Static21.method460();
		Static92.method1475();
		Static44.method775();
		Static61.method1054();
		Static8.method175();
		Static58.method1010();
		Static76.method1227();
		Static82.method1497();
		Static130.method2094();
		Static109.method1805();
		Static67.method1122();
		Static112.method1863();
		Static98.method1671();
		Static32.method650();
		Static108.method49();
		Static74.method1192();
		Static41.method1521();
		Static10.method193();
		Static54.method993();
		Static129.method2065();
		Static27.method1856();
		Static11.method202();
		Static96.method1637();
		Static79.method1298();
		Static88.method2190();
		Static25.method509();
		Static59.method1018();
		Static43.method769();
		Static131.method2151();
		Static15.method337();
		Static114.method1872();
		Static55.method1002();
		Static99.method1675();
		Static97.method1656();
		Static116.method1888();
		Static100.method1679();
		Static81.method2177();
		Static95.method1608();
		Static73.method1185();
		Static57.method1008();
		Static39.method732();
		Static6.method57();
		Static66.method1108();
		Static16.method380();
		Static68.method1133();
		Static50.method887();
		Static102.method1741();
		Static85.method1528();
		Static34.method677();
		Static38.method1037();
		Static12.method234();
		Static106.method1767();
		Static75.method1196();
		Static1.method4();
		Static29.method622();
		Static118.method1892();
		Static37.method702();
		Static20.method456();
		Static134.method2200();
		Static28.method620();
		Static2.method9();
		Static126.method1973();
		Static117.method1889();
		Static46.method1997();
		Static105.method2175();
		Static51.method943();
		Static90.method1579();
		Static35.method689();
		Static48.method876();
		Static63.method1085();
		Static30.method632();
		Static53.method984();
		Static33.method671();
		Static107.method1787();
		Static125.method1965();
		Static78.method1277();
		Static65.method1104();
		Static45.method852();
		Static42.method754();
		Static110.method1824();
		Static17.method395();
		Static62.method1071();
		Static7.method557();
		Static70.method1156();
		Static18.method412();
		Static47.method856();
		Static24.method504();
		Static119.method1897();
		Static49.method886();
		Static87.method1549();
		Static9.method183();
		Static123.method1931();
		Static113.method1868();
		Static86.method1531();
		Static115.method1883();
		Static40.method739();
		Static36.method698();
		Static94.method1603();
		Static22.method483();
		Static80.method1320();
		Static13.method274();
		Static132.method2185();
		Static77.method1252();
		Static124.method1945();
		Static103.method1752();
		Static89.method1572();
		Static120.method1902();
		Static71.method1184();
		Static52.method960();
		Static4.method1685();
		Static104.method1755();
		Static127.method2034();
		Static56.method1003();
		Static111.method1832();
		Static84.method1527();
		Static122.method1910();
		Static121.method1905();
		Static3.method11();
		Static133.method2197();
		Static31.method640();
		Static69.method1140();
		Static60.method1022();
		Static23.method498();
		Static83.method1505();
		Static5.method35();
		Static14.method279();
		Static93.method1598();
		Static91.method1597();
	}
}
