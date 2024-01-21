import java.awt.Color;
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
			if (arg0.length != 6) {
				Static2.method74();
			}
			Static46.anInt1445 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static72.anInt2292 = 0;
			} else if (arg0[1].equals("office")) {
				Static72.anInt2292 = 1;
			} else if (arg0[1].equals("local")) {
				Static72.anInt2292 = 2;
			} else {
				Static2.method74();
			}
			if (arg0[2].equals("live")) {
				Static24.anInt921 = 0;
			} else if (arg0[2].equals("rc")) {
				Static24.anInt921 = 1;
			} else if (arg0[2].equals("wip")) {
				Static24.anInt921 = 2;
			} else {
				Static2.method74();
			}
			if (arg0[3].equals("lowmem")) {
				Static43.method974();
			} else if (arg0[3].equals("highmem")) {
				Static67.method1385();
			} else {
				Static2.method74();
			}
			if (arg0[4].equals("free")) {
				Static124.aBoolean117 = false;
			} else if (arg0[4].equals("members")) {
				Static124.aBoolean117 = true;
			} else {
				Static2.method74();
			}
			if (arg0[5].equals("english")) {
				Static123.anInt3361 = 0;
			} else if (arg0[5].equals("german")) {
				Static59.method1200();
				Static120.aClass60_1378 = Static120.aClass60_1377;
				Static123.anInt3361 = 1;
			} else {
				Static2.method74();
			}
			Static102.aString2 = "127.0.0.1";
			@Pc(158) client local158 = new client();
			local158.method473("runescape", Static24.anInt921 + 32);
		} catch (@Pc(171) Exception local171) {
			Static87.method1031(local171, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method487() {
		if (Static39.anInt1303 != 1000) {
			@Pc(14) boolean local14 = Static112.method2069();
			if (!local14) {
				this.method488();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method461()) {
			return;
		}
		Static46.anInt1445 = Integer.parseInt(this.getParameter("worldid"));
		Static24.anInt921 = Integer.parseInt(this.getParameter("modewhat"));
		Static72.anInt2292 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static43.method974();
		} else {
			Static67.method1385();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static124.aBoolean117 = true;
		} else {
			Static124.aBoolean117 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static59.method1200();
			Static120.aClass60_1378 = Static120.aClass60_1377;
			Static123.anInt3361 = 1;
		}
		try {
			Static24.anInt917 = Integer.parseInt(this.getParameter("js"));
			Static13.anInt403 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(85) Exception local85) {
		}
		Static102.aString2 = this.getCodeBase().getHost();
		this.method475(Static24.anInt921 + 32);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method459() {
		@Pc(8) boolean local8 = Static60.method1213();
		if (local8 && Static31.aBoolean34 && Static99.aClass34_2 != null) {
			Static99.aClass34_2.method1717();
		}
		if (Static8.aBoolean12) {
			Static128.method2292(Static2.aCanvas1);
			Static35.method778(Static2.aCanvas1);
			if (Static112.aClass32_1 != null) {
				Static112.aClass32_1.method1070(Static2.aCanvas1);
			}
			this.method465();
			Static11.method317(Static2.aCanvas1);
			Static27.method655(Static2.aCanvas1);
			if (Static112.aClass32_1 != null) {
				Static112.aClass32_1.method1069(Static2.aCanvas1);
			}
		}
		if (Static39.anInt1303 == 0) {
			Static95.method1791(null, Static78.anInt2433, Static105.aClass60_1275);
		} else if (Static39.anInt1303 == 5) {
			Static77.method1568(Static123.aClass3_Sub1_Sub2_Sub2_4, Static20.aClass3_Sub1_Sub2_Sub2_1);
		} else if (Static39.anInt1303 == 10) {
			Static77.method1568(Static123.aClass3_Sub1_Sub2_Sub2_4, Static20.aClass3_Sub1_Sub2_Sub2_1);
		} else if (Static39.anInt1303 == 20) {
			Static77.method1568(Static123.aClass3_Sub1_Sub2_Sub2_4, Static20.aClass3_Sub1_Sub2_Sub2_1);
		} else if (Static39.anInt1303 == 25) {
			@Pc(124) int local124;
			if (Static93.anInt2678 == 1) {
				if (Static74.anInt2405 < Static21.anInt869) {
					Static74.anInt2405 = Static21.anInt869;
				}
				local124 = (Static74.anInt2405 - Static21.anInt869) * 50 / Static74.anInt2405;
				Static99.method1974(Static62.aClass60_857, true, Static60.method1211(new Class60[] { Static125.aClass60_1404, Static65.method1341(local124), Static104.aClass60_1263 }));
			} else if (Static93.anInt2678 == 2) {
				if (Static79.anInt2485 > Static38.anInt1282) {
					Static38.anInt1282 = Static79.anInt2485;
				}
				local124 = (Static38.anInt1282 - Static79.anInt2485) * 50 / Static38.anInt1282 + 50;
				Static99.method1974(Static62.aClass60_857, true, Static60.method1211(new Class60[] { Static125.aClass60_1404, Static65.method1341(local124), Static104.aClass60_1263 }));
			} else {
				Static99.method1974(Static62.aClass60_857, false, null);
			}
		} else if (Static39.anInt1303 == 30) {
			Static64.method1334();
		} else if (Static39.anInt1303 == 35) {
			Static4.method86();
		} else if (Static39.anInt1303 == 40) {
			Static99.method1974(Static86.aClass60_717, false, Static105.aClass60_1274);
		}
		Static102.anInt2964 = 0;
		Static33.anInt1149 = 0;
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method488() {
		if (Static10.anInt323 >= 4) {
			this.method463("js5crc");
			Static39.anInt1303 = 1000;
			return;
		}
		if (Static108.anInt3059 >= 4) {
			if (Static39.anInt1303 <= 5) {
				this.method463("js5io");
				Static39.anInt1303 = 1000;
				return;
			}
			Static108.anInt3059 = 3;
			Static96.anInt2749 = 3000;
		}
		if (Static96.anInt2749-- > 0) {
			return;
		}
		try {
			if (Static54.anInt1748 == 0) {
				Static26.aClass7_2 = Static35.aClass74_1.method2126(Static102.aString2, Static70.anInt2201);
				Static54.anInt1748++;
			}
			if (Static54.anInt1748 == 1) {
				if (Static26.aClass7_2.anInt148 == 2) {
					this.method490(-1);
					return;
				}
				if (Static26.aClass7_2.anInt148 == 1) {
					Static54.anInt1748++;
				}
			}
			if (Static54.anInt1748 == 2) {
				Static24.aClass47_1 = new Class47((Socket) Static26.aClass7_2.anObject1, Static35.aClass74_1);
				@Pc(99) Class3_Sub12 local99 = new Class3_Sub12(5);
				local99.method1937(15);
				local99.method1966(459);
				Static24.aClass47_1.method1562(local99.aByteArray77, 5);
				Static54.anInt1748++;
				Static86.aLong52 = Static102.method1996();
			}
			if (Static54.anInt1748 == 3) {
				if (Static39.anInt1303 <= 5 || Static24.aClass47_1.method1557() > 0) {
					@Pc(144) int local144 = Static24.aClass47_1.method1558();
					if (local144 != 0) {
						this.method490(local144);
						return;
					}
					Static54.anInt1748++;
				} else if (Static102.method1996() - Static86.aLong52 > 30000L) {
					this.method490(-2);
					return;
				}
			}
			if (Static54.anInt1748 == 4) {
				Static101.method1986(Static24.aClass47_1, Static39.anInt1303 > 20);
				Static54.anInt1748 = 0;
				Static24.aClass47_1 = null;
				Static26.aClass7_2 = null;
				Static95.anInt2722 = 0;
			}
		} catch (@Pc(201) IOException local201) {
			this.method490(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method477() {
		Static11.anInt347 = Static72.anInt2292 == 0 ? 443 : Static46.anInt1445 + 50000;
		Static104.anInt3005 = Static72.anInt2292 == 0 ? 43594 : Static46.anInt1445 + 40000;
		Static70.anInt2201 = Static104.anInt3005;
		Static107.method2031();
		Static11.method317(Static2.aCanvas1);
		Static27.method655(Static2.aCanvas1);
		Static112.aClass32_1 = Static45.method989();
		if (Static112.aClass32_1 != null) {
			Static112.aClass32_1.method1069(Static2.aCanvas1);
		}
		Static33.anInt1150 = Static116.anInt3206;
		try {
			if (Static35.aClass74_1.aClass19_3 != null) {
				Static57.aClass41_61 = new Class41(Static35.aClass74_1.aClass19_3, 5200, 0);
				for (@Pc(65) int local65 = 0; local65 < 16; local65++) {
					Static114.aClass41Array1[local65] = new Class41(Static35.aClass74_1.aClass19Array1[local65], 6000, 0);
				}
				Static83.aClass41_50 = new Class41(Static35.aClass74_1.aClass19_2, 6000, 0);
				Static10.aClass13_1 = new Class13(255, Static57.aClass41_61, Static83.aClass41_50, 500000);
				Static35.aClass74_1.aClass19Array1 = null;
				Static35.aClass74_1.aClass19_3 = null;
				Static35.aClass74_1.aClass19_2 = null;
			}
		} catch (@Pc(112) IOException local112) {
			Static83.aClass41_50 = null;
			Static57.aClass41_61 = null;
			Static10.aClass13_1 = null;
		}
		if (Static72.anInt2292 != 0) {
			Static2.aBoolean2 = true;
		}
		Static85.aClass3_Sub15_3 = new Class3_Sub15();
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	@Override
	protected void method481() {
		Static34.anInt1183++;
		this.method487();
		Static57.method2268();
		Static119.method2148();
		Static100.method1983();
		Static8.method289();
		Static6.method126();
		if (Static112.aClass32_1 != null) {
			@Pc(32) int local32 = Static112.aClass32_1.method1071();
			Static33.anInt1149 += local32;
			Static105.anInt3025 = local32;
		}
		if (Static39.anInt1303 == 0) {
			Static101.method1989();
			Static122.method469();
		} else if (Static39.anInt1303 == 5) {
			Static98.method1851(this);
			Static101.method1989();
			Static122.method469();
		} else if (Static39.anInt1303 == 10) {
			Static98.method1851(this);
		} else if (Static39.anInt1303 == 20) {
			Static98.method1851(this);
			Static115.method2115();
		} else if (Static39.anInt1303 == 25) {
			Static112.method2068();
		}
		if (Static39.anInt1303 == 30) {
			Static100.method1985();
		} else if (Static39.anInt1303 == 35) {
			Static100.method1985();
		} else if (Static39.anInt1303 == 40) {
			Static115.method2115();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method467() {
		if (Static21.aClass79_1 != null) {
			Static21.aClass79_1.aBoolean123 = false;
		}
		Static21.aClass79_1 = null;
		if (Static104.aClass47_3 != null) {
			Static104.aClass47_3.method1564();
			Static104.aClass47_3 = null;
		}
		Static20.method537();
		Static65.method1346();
		Static112.aClass32_1 = null;
		if (Static99.aClass34_2 != null) {
			Static99.aClass34_2.method1725();
		}
		if (Static73.aClass34_1 != null) {
			Static73.aClass34_1.method1725();
		}
		Static103.method2015();
		Static35.method779();
		try {
			if (Static57.aClass41_61 != null) {
				Static57.aClass41_61.method1348();
			}
			if (Static114.aClass41Array1 != null) {
				for (@Pc(52) int local52 = 0; local52 < Static114.aClass41Array1.length; local52++) {
					if (Static114.aClass41Array1[local52] != null) {
						Static114.aClass41Array1[local52].method1348();
					}
				}
			}
			if (Static83.aClass41_50 != null) {
				Static83.aClass41_50.method1348();
			}
		} catch (@Pc(79) IOException local79) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method490(@OriginalArg(1) int arg0) {
		Static24.aClass47_1 = null;
		Static26.aClass7_2 = null;
		if (Static104.anInt3005 == Static70.anInt2201) {
			Static70.anInt2201 = Static11.anInt347;
		} else {
			Static70.anInt2201 = Static104.anInt3005;
		}
		Static95.anInt2722++;
		Static54.anInt1748 = 0;
		if (Static95.anInt2722 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static39.anInt1303 <= 5) {
				this.method463("js5connect_full");
				Static39.anInt1303 = 1000;
			} else {
				Static96.anInt2749 = 3000;
			}
		} else if (Static95.anInt2722 >= 2 && arg0 == 6) {
			this.method463("js5connect_outofdate");
			Static39.anInt1303 = 1000;
		} else if (Static95.anInt2722 >= 4) {
			if (Static39.anInt1303 > 5) {
				Static96.anInt2749 = 3000;
			} else {
				this.method463("js5connect");
				Static39.anInt1303 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method478() {
		Static16.method485();
		Static98.method1838();
		Static122.method474();
		Static124.method2142();
		Static23.method1665();
		Static125.method2254();
		Static63.method1930();
		Static76.method1563();
		Static41.method940();
		Static65.method1342();
		Static11.method316();
		Static48.method1025();
		Static99.method1977();
		Static37.method843();
		Static94.method1768();
		Static114.method2110();
		Static15.method434();
		Static4.method80();
		Static72.method1500();
		Static86.method1068();
		Static130.method2301();
		Static36.method797();
		Static127.method1718();
		Static91.method1710();
		Static81.method1637();
		Static79.method1594();
		Static71.method1019();
		Static18.method519();
		Static113.method2094();
		Static57.method2269();
		Static107.method2033();
		Static8.method290();
		Static26.method648();
		Static25.method623();
		Static121.method2244();
		Static105.method2023();
		Static101.method1987();
		Static112.method2073();
		Static109.method2057();
		Static104.method2021();
		Static50.method1072();
		Static28.method2221();
		Static108.method2039();
		Static39.method880();
		Static84.method1663();
		Static53.method1133();
		Static1.method1();
		Static129.method2297();
		Static43.method975();
		Static102.method1995();
		Static51.method927();
		Static70.method1460();
		Static83.method1661();
		Static120.method2179();
		Static45.method985();
		Static77.method1570();
		Static62.method1255();
		Static27.method654();
		Static60.method1208();
		Static46.method993();
		Static78.method1571();
		Static68.method1387();
		Static21.method565();
		Static128.method2291();
		Static7.method273();
		Static40.method1898();
		Static19.method2273();
		Static10.method310();
		Static95.method1784();
		Static22.method569();
		Static30.method680();
		Static9.method306();
		Static38.method875();
		Static56.method1160();
		Static75.method1554();
		Static61.method1251();
		Static24.method593();
		Static20.method542();
		Static126.method2283();
		Static59.method1203();
		Static34.method774();
		Static49.method1052();
		Static33.method752();
		Static74.method1551();
		Static42.method969();
		Static80.method1624();
		Static58.method1171();
		Static88.method1690();
		Static31.method730();
		Static89.method1692();
		Static66.method1355();
		Static100.method1984();
		Static64.method1336();
		Static17.method503();
		Static52.method1127();
		Static115.method2117();
		Static54.method1138();
		Static106.method2029();
		Static73.method1524();
		Static67.method1380();
		Static32.method733();
		Static118.method2136();
		Static13.method353();
		Static2.method73();
		Static6.method125();
		Static14.method368();
		Static117.method2134();
		Static55.method1142();
		Static35.method777();
		Static119.method2152();
		Static85.method1672();
		Static87.method1034();
		Static93.method1731();
		Static29.method662();
		Static69.method1397();
		Static92.method1729();
		Static110.method2061();
		Static12.method340();
		Static47.method994();
		Static82.method1657();
		Static5.method103();
		Static123.method2250();
		Static103.method2017();
		Static96.method1806();
		Static111.method2066();
		Static90.method1696();
		Static44.method980();
		Static3.method75();
		Static97.method1820();
	}
}
