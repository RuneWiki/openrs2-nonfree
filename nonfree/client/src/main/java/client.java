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
				Static96.method1767();
			}
			Static15.anInt298 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static34.anInt804 = 0;
			} else if (arg0[1].equals("office")) {
				Static34.anInt804 = 1;
			} else if (arg0[1].equals("local")) {
				Static34.anInt804 = 2;
			} else {
				Static96.method1767();
			}
			if (arg0[2].equals("live")) {
				Static83.anInt2158 = 0;
			} else if (arg0[2].equals("rc")) {
				Static83.anInt2158 = 1;
			} else if (arg0[2].equals("wip")) {
				Static83.anInt2158 = 2;
			} else {
				Static96.method1767();
			}
			if (arg0[3].equals("lowmem")) {
				Static121.method2038();
			} else if (arg0[3].equals("highmem")) {
				Static56.method998();
			} else {
				Static96.method1767();
			}
			if (arg0[4].equals("free")) {
				Static92.aBoolean184 = false;
			} else if (arg0[4].equals("members")) {
				Static92.aBoolean184 = true;
			} else {
				Static96.method1767();
			}
			if (arg0[5].equals("english")) {
				Static17.anInt432 = 0;
			} else if (arg0[5].equals("german")) {
				Static79.method1398();
				Static43.aClass40_575 = Static119.aClass40_1499;
				Static17.anInt432 = 1;
			} else {
				Static96.method1767();
			}
			if (arg0[6].equals("game0")) {
				Static24.anInt3061 = 0;
			} else if (arg0[6].equals("game1")) {
				Static24.anInt3061 = 1;
			} else {
				Static96.method1767();
			}
			Static45.aString1 = "127.0.0.1";
			@Pc(174) client local174 = new client();
			local174.method276(Static83.anInt2158 + 32, "runescape");
		} catch (@Pc(187) Exception local187) {
			Static92.method1662(local187, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method281() {
		Static28.anInt704++;
		this.method301();
		Static31.method467();
		Static92.method1671();
		Static55.method990();
		Static67.method1183();
		Static29.method457();
		if (Static118.aClass50_1 != null) {
			@Pc(34) int local34 = Static118.aClass50_1.method1234();
			Static74.anInt923 = local34;
		}
		if (Static105.anInt2533 == 0) {
			Static66.method1149();
			Static45.method812();
		} else if (Static105.anInt2533 == 5) {
			Static95.method1752(this);
			Static66.method1149();
			Static45.method812();
		} else if (Static105.anInt2533 == 10) {
			Static95.method1752(this);
		} else if (Static105.anInt2533 == 20) {
			Static95.method1752(this);
			Static13.method213();
		} else if (Static105.anInt2533 == 25) {
			Static77.method1341();
		}
		if (Static105.anInt2533 == 30) {
			Static64.method1140();
		} else if (Static105.anInt2533 == 40) {
			Static13.method213();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method298() {
		if (Static74.anInt950 >= 4) {
			this.method295("js5crc");
			Static105.anInt2533 = 1000;
			return;
		}
		if (Static15.anInt299 >= 4) {
			if (Static105.anInt2533 <= 5) {
				this.method295("js5io");
				Static105.anInt2533 = 1000;
				return;
			}
			Static15.anInt299 = 3;
			Static45.anInt1178 = 3000;
		}
		if (Static45.anInt1178-- > 0) {
			return;
		}
		try {
			if (Static99.anInt2470 == 0) {
				Static61.aClass26_32 = Static129.aClass59_5.method1636(Static45.aString1, Static47.anInt1271);
				Static99.anInt2470++;
			}
			if (Static99.anInt2470 == 1) {
				if (Static61.aClass26_32.anInt831 == 2) {
					this.method299(-1);
					return;
				}
				if (Static61.aClass26_32.anInt831 == 1) {
					Static99.anInt2470++;
				}
			}
			if (Static99.anInt2470 == 2) {
				Static112.aClass57_3 = new Class57((Socket) Static61.aClass26_32.anObject2, Static129.aClass59_5);
				@Pc(100) Class2_Sub9 local100 = new Class2_Sub9(5);
				local100.method644(15);
				local100.method620(467);
				Static112.aClass57_3.method1591(local100.aByteArray16, 5);
				Static99.anInt2470++;
				Static118.aLong81 = Static125.method2075();
			}
			if (Static99.anInt2470 == 3) {
				if (Static105.anInt2533 <= 5 || Static112.aClass57_3.method1597() > 0) {
					@Pc(155) int local155 = Static112.aClass57_3.method1594();
					if (local155 != 0) {
						this.method299(local155);
						return;
					}
					Static99.anInt2470++;
				} else if (Static125.method2075() - Static118.aLong81 > 30000L) {
					this.method299(-2);
					return;
				}
			}
			if (Static99.anInt2470 == 4) {
				Static70.method1218(Static112.aClass57_3, Static105.anInt2533 > 20);
				Static61.aClass26_32 = null;
				Static3.anInt115 = 0;
				Static99.anInt2470 = 0;
				Static112.aClass57_3 = null;
			}
		} catch (@Pc(193) IOException local193) {
			this.method299(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method284() {
		@Pc(9) boolean local9 = Static32.method489();
		if (local9 && Static86.aBoolean247 && Static32.aClass34_2 != null) {
			Static32.aClass34_2.method2111();
		}
		if (Static127.aBoolean242) {
			Static60.method1107(Static80.aCanvas1);
			Static117.method1969(Static80.aCanvas1);
			if (Static118.aClass50_1 != null) {
				Static118.aClass50_1.method1237(Static80.aCanvas1);
			}
			this.method292();
			Static119.method2009(Static80.aCanvas1);
			Static46.method826(Static80.aCanvas1);
			if (Static118.aClass50_1 != null) {
				Static118.aClass50_1.method1232(Static80.aCanvas1);
			}
		}
		if (Static105.anInt2533 == 0) {
			Static53.method943(Static76.anInt1982, Static87.aClass40_669, null);
		} else if (Static105.anInt2533 == 5) {
			Static111.method1868(Static73.aClass2_Sub1_Sub2_Sub3_Sub1_3, Static95.aClass2_Sub1_Sub2_Sub3_Sub1_4);
		} else if (Static105.anInt2533 == 10) {
			Static111.method1868(Static73.aClass2_Sub1_Sub2_Sub3_Sub1_3, Static95.aClass2_Sub1_Sub2_Sub3_Sub1_4);
		} else if (Static105.anInt2533 == 20) {
			Static111.method1868(Static73.aClass2_Sub1_Sub2_Sub3_Sub1_3, Static95.aClass2_Sub1_Sub2_Sub3_Sub1_4);
		} else if (Static105.anInt2533 == 25) {
			@Pc(133) int local133;
			if (Static95.anInt2421 == 1) {
				if (Static83.anInt2152 > Static105.anInt2523) {
					Static105.anInt2523 = Static83.anInt2152;
				}
				local133 = (Static105.anInt2523 - Static83.anInt2152) * 50 / Static105.anInt2523;
				Static5.method130(false, Static40.method722(new Class40[] { Static32.aClass40_456, Static66.aClass40_857, Static49.method886(local133), Static85.aClass40_1180 }));
			} else if (Static95.anInt2421 == 2) {
				if (Static21.anInt644 > Static103.anInt2512) {
					Static103.anInt2512 = Static21.anInt644;
				}
				local133 = (Static103.anInt2512 - Static21.anInt644) * 50 / Static103.anInt2512 + 50;
				Static5.method130(false, Static40.method722(new Class40[] { Static32.aClass40_456, Static66.aClass40_857, Static49.method886(local133), Static85.aClass40_1180 }));
			} else {
				Static5.method130(false, Static32.aClass40_456);
			}
		} else if (Static105.anInt2533 == 30) {
			Static63.method289();
		} else if (Static105.anInt2533 == 40) {
			Static5.method130(false, Static40.method722(new Class40[] { Static104.aClass40_1343, Static103.aClass40_1341, Static1.aClass40_4 }));
		}
		@Pc(256) int local256;
		@Pc(246) Graphics local246;
		if (Static105.anInt2533 == 30 && Static63.anInt395 == 0 && !Static7.aBoolean20) {
			try {
				local246 = Static80.aCanvas1.getGraphics();
				for (local256 = 0; local256 < Static70.anInt1897; local256++) {
					if (Static84.aBooleanArray21[local256]) {
						Static65.aClass7_1.method2127(local246, Static60.anIntArray168[local256], Static24.anIntArray376[local256], Static46.anIntArray131[local256], Static117.anIntArray323[local256]);
						Static84.aBooleanArray21[local256] = false;
					}
				}
			} catch (@Pc(312) Exception local312) {
				Static80.aCanvas1.repaint();
			}
		} else if (Static105.anInt2533 > 0) {
			try {
				local246 = Static80.aCanvas1.getGraphics();
				Static65.aClass7_1.method2132(local246);
				Static7.aBoolean20 = false;
				for (local256 = 0; local256 < Static70.anInt1897; local256++) {
					Static84.aBooleanArray21[local256] = false;
				}
			} catch (@Pc(272) Exception local272) {
				Static80.aCanvas1.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method275() {
		if (Static114.aClass61_1 != null) {
			Static114.aClass61_1.aBoolean191 = false;
		}
		Static114.aClass61_1 = null;
		if (Static85.aClass57_2 != null) {
			Static85.aClass57_2.method1596();
			Static85.aClass57_2 = null;
		}
		Static83.method1488();
		Static103.method1817();
		Static118.aClass50_1 = null;
		if (Static32.aClass34_2 != null) {
			Static32.aClass34_2.method2123();
		}
		if (Static29.aClass34_1 != null) {
			Static29.aClass34_1.method2123();
		}
		Static39.method709();
		Static104.method1823();
		try {
			if (Static18.aClass82_1 != null) {
				Static18.aClass82_1.method2147();
			}
			if (Static43.aClass82Array1 != null) {
				for (@Pc(58) int local58 = 0; local58 < Static43.aClass82Array1.length; local58++) {
					if (Static43.aClass82Array1[local58] != null) {
						Static43.aClass82Array1[local58].method2147();
					}
				}
			}
			if (Static57.aClass82_4 != null) {
				Static57.aClass82_4.method2147();
			}
			if (Static104.aClass82_5 != null) {
				Static104.aClass82_5.method2147();
			}
		} catch (@Pc(92) IOException local92) {
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method286() {
		Static7.anInt198 = Static34.anInt804 == 0 ? 43594 : Static15.anInt298 + 40000;
		Static86.anInt3032 = Static34.anInt804 == 0 ? 443 : Static15.anInt298 + 50000;
		Static47.anInt1271 = Static7.anInt198;
		if (Static24.anInt3061 == 1) {
			Static25.aShortArrayArray7 = Static65.aShortArrayArray11;
			Static26.aShortArray5 = Static77.aShortArray10;
			Static126.aShortArrayArray14 = Static86.aShortArrayArray15;
			Static95.aShortArray19 = Static118.aShortArray20;
		} else {
			Static126.aShortArrayArray14 = Static21.aShortArrayArray6;
			Static25.aShortArrayArray7 = Static125.aShortArrayArray13;
			Static26.aShortArray5 = Static7.aShortArray2;
			Static95.aShortArray19 = Static19.aShortArray3;
		}
		Static48.method870();
		Static119.method2009(Static80.aCanvas1);
		Static46.method826(Static80.aCanvas1);
		Static118.aClass50_1 = Static57.method1016();
		if (Static118.aClass50_1 != null) {
			Static118.aClass50_1.method1232(Static80.aCanvas1);
		}
		Static79.anInt2072 = Static91.anInt2313;
		try {
			if (Static129.aClass59_5.aClass78_3 != null) {
				Static18.aClass82_1 = new Class82(Static129.aClass59_5.aClass78_3, 5200, 0);
				for (@Pc(83) int local83 = 0; local83 < 16; local83++) {
					Static43.aClass82Array1[local83] = new Class82(Static129.aClass59_5.aClass78Array1[local83], 6000, 0);
				}
				Static57.aClass82_4 = new Class82(Static129.aClass59_5.aClass78_2, 6000, 0);
				Static110.aClass29_3 = new Class29(255, Static18.aClass82_1, Static57.aClass82_4, 500000);
				Static104.aClass82_5 = new Class82(Static129.aClass59_5.aClass78_1, 24, 0);
				Static129.aClass59_5.aClass78_3 = null;
				Static129.aClass59_5.aClass78_2 = null;
				Static129.aClass59_5.aClass78_1 = null;
				Static129.aClass59_5.aClass78Array1 = null;
			}
		} catch (@Pc(139) IOException local139) {
			Static18.aClass82_1 = null;
			Static110.aClass29_3 = null;
			Static104.aClass82_5 = null;
			Static57.aClass82_4 = null;
		}
		if (Static34.anInt804 != 0) {
			Static38.aBoolean68 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method287()) {
			return;
		}
		Static15.anInt298 = Integer.parseInt(this.getParameter("worldid"));
		Static83.anInt2158 = Integer.parseInt(this.getParameter("modewhat"));
		Static34.anInt804 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static121.method2038();
		} else {
			Static56.method998();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static92.aBoolean184 = true;
		} else {
			Static92.aBoolean184 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static79.method1398();
			Static17.anInt432 = 1;
			Static43.aClass40_575 = Static119.aClass40_1499;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static24.anInt3061 = 1;
		} else {
			Static24.anInt3061 = 0;
		}
		try {
			Static134.anInt1649 = Integer.parseInt(this.getParameter("js"));
			Static2.anInt102 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(101) Exception local101) {
		}
		Static45.aString1 = this.getCodeBase().getHost();
		this.method282(Static83.anInt2158 + 32);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method299(@OriginalArg(1) int arg0) {
		Static3.anInt115++;
		if (Static7.anInt198 == Static47.anInt1271) {
			Static47.anInt1271 = Static86.anInt3032;
		} else {
			Static47.anInt1271 = Static7.anInt198;
		}
		Static99.anInt2470 = 0;
		Static61.aClass26_32 = null;
		Static112.aClass57_3 = null;
		if (Static3.anInt115 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static105.anInt2533 <= 5) {
				this.method295("js5connect_full");
				Static105.anInt2533 = 1000;
			} else {
				Static45.anInt1178 = 3000;
			}
		} else if (Static3.anInt115 >= 2 && arg0 == 6) {
			this.method295("js5connect_outofdate");
			Static105.anInt2533 = 1000;
		} else if (Static3.anInt115 >= 4) {
			if (Static105.anInt2533 > 5) {
				Static45.anInt1178 = 3000;
			} else {
				this.method295("js5connect");
				Static105.anInt2533 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method285() {
		Static16.method296();
		Static55.method958();
		Static63.method279();
		Static87.method899();
		Static10.method2128();
		Static94.method1735();
		Static74.method635();
		Static88.method1595();
		Static116.method1940();
		Static130.method2149();
		Static41.method730();
		Static18.method374();
		Static36.method668();
		Static42.method740();
		Static28.method432();
		Static59.method1049();
		Static67.method1179();
		Static3.method76();
		Static121.method2032();
		Static69.method1235();
		Static75.method1248();
		Static109.method2112();
		Static43.method787();
		Static56.method1002();
		Static76.method1267();
		Static110.method1178();
		Static115.method1905();
		Static92.method1658();
		Static49.method885();
		Static12.method2210();
		Static107.method1838();
		Static72.method1225();
		Static81.method1409();
		Static4.method109();
		Static131.method2179();
		Static21.method399();
		Static97.method1771();
		Static37.method677();
		Static111.method1866();
		Static73.method1230();
		Static47.method868();
		Static86.method2167();
		Static13.method215();
		Static34.method520();
		Static8.method183();
		Static53.method942();
		Static71.method1223();
		Static11.method205();
		Static79.method1397();
		Static17.method318();
		Static15.method238();
		Static125.method2078();
		Static93.method1733();
		Static7.method176();
		Static33.method1932();
		Static117.method1992();
		Static1.method7();
		Static54.method949();
		Static26.method427();
		Static104.method1821();
		Static106.method1830();
		Static119.method2006();
		Static40.method726();
		Static85.method1589();
		Static99.method1789();
		Static101.method1796();
		Static66.method1152();
		Static48.method872();
		Static6.method1686();
		Static24.method2213();
		Static78.method1392();
		Static118.method2003();
		Static113.method1887();
		Static95.method1755();
		Static25.method424();
		Static23.method411();
		Static108.method1854();
		Static14.method232();
		Static133.method2220();
		Static39.method706();
		Static84.method1577();
		Static70.method1215();
		Static120.method2028();
		Static52.method937();
		Static77.method1343();
		Static122.method2064();
		Static127.method2109();
		Static82.method1538();
		Static57.method1017();
		Static9.method195();
		Static27.method428();
		Static30.method463();
		Static102.method1803();
		Static100.method1792();
		Static96.method1765();
		Static60.method1106();
		Static83.method1489();
		Static31.method466();
		Static103.method1816();
		Static29.method456();
		Static5.method128();
		Static112.method1874();
		Static98.method1773();
		Static45.method815();
		Static51.method921();
		Static68.method1192();
		Static32.method492();
		Static2.method71();
		Static58.method1030();
		Static123.method2066();
		Static38.method685();
		Static65.method1144();
		Static20.method398();
		Static129.method2138();
		Static134.method1093();
		Static124.method2072();
		Static61.method1110();
		Static105.method1827();
		Static50.method889();
		Static128.method2126();
		Static22.method407();
		Static114.method1892();
		Static44.method790();
		Static126.method2089();
		Static80.method1408();
		Static89.method1606();
		Static62.method1118();
		Static35.method532();
		Static64.method1141();
		Static90.method1625();
		Static132.method2203();
		Static19.method377();
		Static46.method827();
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method301() {
		if (Static105.anInt2533 != 1000) {
			@Pc(10) boolean local10 = Static14.method235();
			if (!local10) {
				this.method298();
			}
		}
	}
}
