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
				Static5.method37();
			}
			Static83.anInt1974 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static105.anInt2515 = 0;
			} else if (arg0[1].equals("office")) {
				Static105.anInt2515 = 1;
			} else if (arg0[1].equals("local")) {
				Static105.anInt2515 = 2;
			} else {
				Static5.method37();
			}
			if (arg0[2].equals("live")) {
				Static7.anInt2981 = 0;
			} else if (arg0[2].equals("rc")) {
				Static7.anInt2981 = 1;
			} else if (arg0[2].equals("wip")) {
				Static7.anInt2981 = 2;
			} else {
				Static5.method37();
			}
			if (arg0[3].equals("lowmem")) {
				Static121.method2051();
			} else if (arg0[3].equals("highmem")) {
				Static63.method1269();
			} else {
				Static5.method37();
			}
			if (arg0[4].equals("free")) {
				Static76.aBoolean76 = false;
			} else if (arg0[4].equals("members")) {
				Static76.aBoolean76 = true;
			} else {
				Static5.method37();
			}
			if (arg0[5].equals("english")) {
				Static25.anInt697 = 0;
			} else if (arg0[5].equals("german")) {
				Static129.method2122();
				Static22.aClass60_235 = Static65.aClass60_606;
				Static25.anInt697 = 1;
			} else {
				Static5.method37();
			}
			if (arg0[6].equals("game0")) {
				Static6.anInt71 = 0;
			} else if (arg0[6].equals("game1")) {
				Static6.anInt71 = 1;
			} else {
				Static5.method37();
			}
			Static99.aString5 = "127.0.0.1";
			@Pc(180) client local180 = new client();
			local180.method334("runescape", Static7.anInt2981 + 32);
		} catch (@Pc(194) Exception local194) {
			Static15.method2092(local194, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method337() {
		if (Static71.anInt1828 != 1000) {
			@Pc(10) boolean local10 = Static26.method510();
			if (!local10) {
				this.method341();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method326() {
		if (Static30.aClass22_1 != null) {
			Static30.aClass22_1.aBoolean27 = false;
		}
		Static30.aClass22_1 = null;
		if (Static7.aClass78_6 != null) {
			Static7.aClass78_6.method2085();
			Static7.aClass78_6 = null;
		}
		Static111.method1896();
		Static46.method833();
		Static62.aClass53_1 = null;
		if (Static110.aClass39_2 != null) {
			Static110.aClass39_2.method1689();
		}
		if (Static46.aClass39_1 != null) {
			Static46.aClass39_1.method1689();
		}
		Static126.method2083();
		Static32.method609();
		try {
			if (Static61.aClass29_1 != null) {
				Static61.aClass29_1.method815();
			}
			if (Static33.aClass29Array1 != null) {
				for (@Pc(56) int local56 = 0; local56 < Static33.aClass29Array1.length; local56++) {
					if (Static33.aClass29Array1[local56] != null) {
						Static33.aClass29Array1[local56].method815();
					}
				}
			}
			if (Static130.aClass29_4 != null) {
				Static130.aClass29_4.method815();
			}
		} catch (@Pc(83) IOException local83) {
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method336() {
		Static81.anInt1944++;
		this.method337();
		Static39.method674();
		Static88.method1523();
		Static9.method138();
		Static127.method2104();
		Static14.method2128();
		if (Static62.aClass53_1 != null) {
			@Pc(36) int local36 = Static62.aClass53_1.method1447();
			Static108.anInt2548 = local36;
		}
		if (Static71.anInt1828 == 0) {
			Static64.method1283();
			Static31.method596();
		} else if (Static71.anInt1828 == 5) {
			Static36.method636(this);
			Static64.method1283();
			Static31.method596();
		} else if (Static71.anInt1828 == 10) {
			Static36.method636(this);
		} else if (Static71.anInt1828 == 20) {
			Static36.method636(this);
			Static65.method1286();
		} else if (Static71.anInt1828 == 25) {
			Static117.method1959();
		}
		if (Static71.anInt1828 == 30) {
			Static116.method1951();
		} else if (Static71.anInt1828 == 40) {
			Static65.method1286();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method331() {
		Static19.method343();
		Static94.method1667();
		Static57.method321();
		Static7.method2115();
		Static2.method992();
		Static35.method631();
		Static103.method1217();
		Static126.method2080();
		Static61.method1132();
		Static45.method817();
		Static81.method1453();
		Static13.method281();
		Static62.method1257();
		Static97.method1735();
		Static44.method789();
		Static69.method1331();
		Static92.method1616();
		Static109.method1885();
		Static114.method1935();
		Static107.method1836();
		Static120.method1444();
		Static122.method2058();
		Static60.method1675();
		Static125.method2068();
		Static56.method1042();
		Static112.method1919();
		Static128.method1878();
		Static104.method1823();
		Static84.method1485();
		Static98.method1757();
		Static14.method2126();
		Static52.method976();
		Static11.method206();
		Static74.method1391();
		Static100.method1802();
		Static118.method1991();
		Static106.method1826();
		Static95.method1672();
		Static77.method1419();
		Static64.method1279();
		Static93.method1633();
		Static38.method646();
		Static67.method1982();
		Static18.method297();
		Static37.method639();
		Static5.method36();
		Static82.method1460();
		Static42.method700();
		Static105.method1825();
		Static3.method12();
		Static16.method282();
		Static73.method1385();
		Static83.method1470();
		Static66.method1105();
		Static28.method567();
		Static102.method1811();
		Static25.method478();
		Static36.method635();
		Static75.method1403();
		Static131.method2142();
		Static59.method1055();
		Static31.method595();
		Static17.method293();
		Static119.method2026();
		Static110.method1892();
		Static78.method1423();
		Static8.method120();
		Static80.method1716();
		Static15.method2098();
		Static91.method1600();
		Static32.method611();
		Static68.method1306();
		Static51.method970();
		Static30.method590();
		Static89.method1524();
		Static20.method362();
		Static70.method1357();
		Static48.method938();
		Static43.method730();
		Static90.method1541();
		Static71.method1379();
		Static47.method849();
		Static41.method694();
		Static127.method2101();
		Static88.method1521();
		Static121.method2043();
		Static34.method623();
		Static49.method951();
		Static130.method2139();
		Static123.method2062();
		Static65.method1288();
		Static116.method1953();
		Static58.method1051();
		Static115.method1950();
		Static46.method835();
		Static113.method1925();
		Static63.method1271();
		Static76.method1414();
		Static1.method1();
		Static4.method27();
		Static50.method954();
		Static39.method672();
		Static10.method200();
		Static22.method449();
		Static55.method1024();
		Static26.method509();
		Static29.method582();
		Static101.method1805();
		Static87.method1500();
		Static24.method472();
		Static129.method2121();
		Static54.method998();
		Static86.method465();
		Static72.method1382();
		Static33.method614();
		Static85.method1498();
		Static96.method1691();
		Static40.method678();
		Static117.method1957();
		Static124.method2067();
		Static9.method136();
		Static23.method457();
		Static12.method208();
		Static99.method1758();
		Static27.method522();
		Static6.method42();
		Static79.method1433();
		Static21.method435();
		Static111.method1899();
		Static108.method1853();
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method325() {
		Static122.anInt2915 = Static105.anInt2515 == 0 ? 43594 : Static83.anInt1974 + 40000;
		Static76.anInt1900 = Static122.anInt2915;
		Static3.anInt17 = Static105.anInt2515 == 0 ? 443 : Static83.anInt1974 + 50000;
		Static111.method1901();
		Static65.method1284(Static83.aCanvas1);
		Static125.method2074(Static83.aCanvas1);
		Static62.aClass53_1 = Static108.method1852();
		if (Static62.aClass53_1 != null) {
			Static62.aClass53_1.method1443(Static83.aCanvas1);
		}
		Static86.anInt674 = Static53.anInt1351;
		try {
			if (Static129.aClass35_3.aClass32_2 != null) {
				Static61.aClass29_1 = new Class29(Static129.aClass35_3.aClass32_2, 5200, 0);
				for (@Pc(61) int local61 = 0; local61 < 16; local61++) {
					Static33.aClass29Array1[local61] = new Class29(Static129.aClass35_3.aClass32Array1[local61], 6000, 0);
				}
				Static130.aClass29_4 = new Class29(Static129.aClass35_3.aClass32_3, 6000, 0);
				Static75.aClass54_4 = new Class54(255, Static61.aClass29_1, Static130.aClass29_4, 500000);
				Static129.aClass35_3.aClass32_2 = null;
				Static129.aClass35_3.aClass32_3 = null;
				Static129.aClass35_3.aClass32Array1 = null;
			}
		} catch (@Pc(108) IOException local108) {
			Static61.aClass29_1 = null;
			Static130.aClass29_4 = null;
			Static75.aClass54_4 = null;
		}
		if (Static105.anInt2515 != 0) {
			Static112.aBoolean117 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method341() {
		if (Static30.anInt839 >= 4) {
			this.method329("js5crc");
			Static71.anInt1828 = 1000;
			return;
		}
		if (Static11.anInt250 >= 4) {
			if (Static71.anInt1828 <= 5) {
				this.method329("js5io");
				Static71.anInt1828 = 1000;
				return;
			}
			Static11.anInt250 = 3;
			Static3.anInt32 = 3000;
		}
		if (Static3.anInt32-- > 0) {
			return;
		}
		try {
			if (Static10.anInt233 == 0) {
				Static56.aClass30_6 = Static129.aClass35_3.method987(Static99.aString5, Static76.anInt1900);
				Static10.anInt233++;
			}
			if (Static10.anInt233 == 1) {
				if (Static56.aClass30_6.anInt1209 == 2) {
					this.method344(-1);
					return;
				}
				if (Static56.aClass30_6.anInt1209 == 1) {
					Static10.anInt233++;
				}
			}
			if (Static10.anInt233 == 2) {
				Static1.aClass78_1 = new Class78((Socket) Static56.aClass30_6.anObject3, Static129.aClass35_3);
				@Pc(103) Class4_Sub13 local103 = new Class4_Sub13(5);
				local103.method1209(15);
				local103.method1221(462);
				Static1.aClass78_1.method2081(local103.aByteArray68, 5);
				Static10.anInt233++;
				Static10.aLong9 = Static16.method286();
			}
			if (Static10.anInt233 == 3) {
				if (Static71.anInt1828 <= 5 || Static1.aClass78_1.method2076() > 0) {
					@Pc(146) int local146 = Static1.aClass78_1.method2079();
					if (local146 != 0) {
						this.method344(local146);
						return;
					}
					Static10.anInt233++;
				} else if (Static16.method286() - Static10.aLong9 > 30000L) {
					this.method344(-2);
					return;
				}
			}
			if (Static10.anInt233 == 4) {
				Static65.method1287(Static1.aClass78_1, Static71.anInt1828 > 20);
				Static56.aClass30_6 = null;
				Static1.aClass78_1 = null;
				Static52.anInt1347 = 0;
				Static10.anInt233 = 0;
			}
		} catch (@Pc(200) IOException local200) {
			this.method344(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method327() {
		@Pc(8) boolean local8 = Static73.method1388();
		if (local8 && Static103.aBoolean61 && Static110.aClass39_2 != null) {
			Static110.aClass39_2.method1686();
		}
		if (Static75.aBoolean75) {
			Static5.method35(Static83.aCanvas1);
			Static109.method1891(Static83.aCanvas1);
			if (Static62.aClass53_1 != null) {
				Static62.aClass53_1.method1448(Static83.aCanvas1);
			}
			this.method333();
			Static65.method1284(Static83.aCanvas1);
			Static125.method2074(Static83.aCanvas1);
			if (Static62.aClass53_1 != null) {
				Static62.aClass53_1.method1443(Static83.aCanvas1);
			}
		}
		if (Static71.anInt1828 == 0) {
			Static109.method1884(Static33.aClass60_369, Static111.anInt2691, null);
		} else if (Static71.anInt1828 == 5) {
			Static26.method504(Static87.aClass4_Sub4_Sub3_Sub4_5, Static71.aClass4_Sub4_Sub3_Sub4_4);
		} else if (Static71.anInt1828 == 10) {
			Static26.method504(Static87.aClass4_Sub4_Sub3_Sub4_5, Static71.aClass4_Sub4_Sub3_Sub4_4);
		} else if (Static71.anInt1828 == 20) {
			Static26.method504(Static87.aClass4_Sub4_Sub3_Sub4_5, Static71.aClass4_Sub4_Sub3_Sub4_4);
		} else if (Static71.anInt1828 == 25) {
			@Pc(124) int local124;
			if (Static54.anInt1376 == 1) {
				if (Static99.anInt2414 > Static116.anInt2781) {
					Static116.anInt2781 = Static99.anInt2414;
				}
				local124 = (Static116.anInt2781 - Static99.anInt2414) * 50 / Static116.anInt2781;
				Static71.method1377(Static125.method2072(new Class60[] { Static84.aClass60_833, Static43.aClass60_453, Static120.method1450(local124), Static19.aClass60_198 }), false);
			} else if (Static54.anInt1376 == 2) {
				if (Static82.anInt1959 < Static77.anInt1904) {
					Static82.anInt1959 = Static77.anInt1904;
				}
				local124 = (Static82.anInt1959 - Static77.anInt1904) * 50 / Static82.anInt1959 + 50;
				Static71.method1377(Static125.method2072(new Class60[] { Static84.aClass60_833, Static43.aClass60_453, Static120.method1450(local124), Static19.aClass60_198 }), false);
			} else {
				Static71.method1377(Static84.aClass60_833, false);
			}
		} else if (Static71.anInt1828 == 30) {
			Static83.method1468();
		} else if (Static71.anInt1828 == 40) {
			Static71.method1377(Static125.method2072(new Class60[] { Static23.aClass60_245, Static126.aClass60_1180, Static112.aClass60_1096 }), false);
		}
		@Pc(247) int local247;
		@Pc(237) Graphics local237;
		if (Static71.anInt1828 == 30 && Static31.anInt847 == 0 && !Static23.aBoolean20) {
			try {
				local237 = Static83.aCanvas1.getGraphics();
				for (local247 = 0; local247 < Static92.anInt2256; local247++) {
					if (Static74.aBooleanArray9[local247]) {
						Static20.aClass2_1.method994(Static109.anIntArray290[local247], Static101.anIntArray276[local247], Static60.anIntArray235[local247], local237, Static125.anIntArray330[local247]);
						Static74.aBooleanArray9[local247] = false;
					}
				}
			} catch (@Pc(299) Exception local299) {
				Static83.aCanvas1.repaint();
			}
		} else if (Static71.anInt1828 > 0) {
			try {
				local237 = Static83.aCanvas1.getGraphics();
				Static20.aClass2_1.method989(local237);
				Static23.aBoolean20 = false;
				for (local247 = 0; local247 < Static92.anInt2256; local247++) {
					Static74.aBooleanArray9[local247] = false;
				}
			} catch (@Pc(259) Exception local259) {
				Static83.aCanvas1.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method319()) {
			return;
		}
		Static83.anInt1974 = Integer.parseInt(this.getParameter("worldid"));
		Static7.anInt2981 = Integer.parseInt(this.getParameter("modewhat"));
		Static105.anInt2515 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static121.method2051();
		} else {
			Static63.method1269();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static76.aBoolean76 = true;
		} else {
			Static76.aBoolean76 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static129.method2122();
			Static25.anInt697 = 1;
			Static22.aClass60_235 = Static65.aClass60_606;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static6.anInt71 = 1;
		} else {
			Static6.anInt71 = 0;
		}
		try {
			Static102.anInt2474 = Integer.parseInt(this.getParameter("js"));
			Static7.anInt2989 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(101) Exception local101) {
		}
		Static99.aString5 = this.getCodeBase().getHost();
		this.method324(Static7.anInt2981 + 32);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method344(@OriginalArg(1) int arg0) {
		Static52.anInt1347++;
		Static1.aClass78_1 = null;
		if (Static76.anInt1900 == Static122.anInt2915) {
			Static76.anInt1900 = Static3.anInt17;
		} else {
			Static76.anInt1900 = Static122.anInt2915;
		}
		Static10.anInt233 = 0;
		Static56.aClass30_6 = null;
		if (Static52.anInt1347 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static71.anInt1828 > 5) {
				Static3.anInt32 = 3000;
			} else {
				this.method329("js5connect_full");
				Static71.anInt1828 = 1000;
			}
		} else if (Static52.anInt1347 >= 2 && arg0 == 6) {
			this.method329("js5connect_outofdate");
			Static71.anInt1828 = 1000;
		} else if (Static52.anInt1347 >= 4) {
			if (Static71.anInt1828 <= 5) {
				this.method329("js5connect");
				Static71.anInt1828 = 1000;
			} else {
				Static3.anInt32 = 3000;
			}
		}
	}
}
