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
				Static63.method1135();
			}
			Static98.anInt2390 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static46.anInt2784 = 0;
			} else if (arg0[1].equals("office")) {
				Static46.anInt2784 = 1;
			} else if (arg0[1].equals("local")) {
				Static46.anInt2784 = 2;
			} else {
				Static63.method1135();
			}
			if (arg0[2].equals("live")) {
				Static49.anInt1371 = 0;
			} else if (arg0[2].equals("rc")) {
				Static49.anInt1371 = 1;
			} else if (arg0[2].equals("wip")) {
				Static49.anInt1371 = 2;
			} else {
				Static63.method1135();
			}
			if (arg0[3].equals("lowmem")) {
				Static127.method2197();
			} else if (arg0[3].equals("highmem")) {
				Static53.method967();
			} else {
				Static63.method1135();
			}
			if (arg0[4].equals("free")) {
				Static46.aBoolean224 = false;
			} else if (arg0[4].equals("members")) {
				Static46.aBoolean224 = true;
			} else {
				Static63.method1135();
			}
			if (arg0[5].equals("english")) {
				Static122.anInt2972 = 0;
			} else if (arg0[5].equals("german")) {
				Static26.method515();
				Static8.aClass39_142 = Static116.aClass39_1388;
				Static122.anInt2972 = 1;
			} else {
				Static63.method1135();
			}
			Static25.aString1 = "127.0.0.1";
			@Pc(152) client local152 = new client();
			local152.method402("runescape", Static49.anInt1371 + 32);
		} catch (@Pc(165) Exception local165) {
			Static95.method2004(null, local165);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method400() {
		if (Static81.aClass75_1 != null) {
			Static81.aClass75_1.aBoolean236 = false;
		}
		Static81.aClass75_1 = null;
		if (Static29.aClass74_1 != null) {
			Static29.aClass74_1.method2047();
			Static29.aClass74_1 = null;
		}
		Static104.method1858();
		Static13.method286();
		Static44.aClass54_1 = null;
		if (Static65.aClass26_2 != null) {
			Static65.aClass26_2.method1925();
		}
		if (Static19.aClass26_1 != null) {
			Static19.aClass26_1.method1925();
		}
		Static14.method294();
		Static44.method789();
		try {
			if (Static101.aClass56_3 != null) {
				Static101.aClass56_3.method1467();
			}
			if (Static120.aClass56Array58 != null) {
				for (@Pc(56) int local56 = 0; local56 < Static120.aClass56Array58.length; local56++) {
					if (Static120.aClass56Array58[local56] != null) {
						Static120.aClass56Array58[local56].method1467();
					}
				}
			}
			if (Static122.aClass56_4 != null) {
				Static122.aClass56_4.method1467();
			}
		} catch (@Pc(79) IOException local79) {
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method389()) {
			return;
		}
		Static98.anInt2390 = Integer.parseInt(this.getParameter("worldid"));
		Static49.anInt1371 = Integer.parseInt(this.getParameter("modewhat"));
		Static46.anInt2784 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static127.method2197();
		} else {
			Static53.method967();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static46.aBoolean224 = true;
		} else {
			Static46.aBoolean224 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static26.method515();
			Static8.aClass39_142 = Static116.aClass39_1388;
			Static122.anInt2972 = 1;
		}
		try {
			Static81.anInt1991 = Integer.parseInt(this.getParameter("js"));
			Static93.anInt2200 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(85) Exception local85) {
		}
		Static25.aString1 = this.getCodeBase().getHost();
		this.method396(Static49.anInt1371 + 32);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method391() {
		Static21.anInt738 = Static46.anInt2784 == 0 ? 443 : Static98.anInt2390 + 50000;
		Static30.anInt1001 = Static46.anInt2784 == 0 ? 43594 : Static98.anInt2390 + 40000;
		Static72.anInt1808 = Static30.anInt1001;
		Static20.method403();
		Static85.method1434(Static16.aCanvas10);
		Static11.method270(Static16.aCanvas10);
		Static44.aClass54_1 = Static74.method1282();
		if (Static44.aClass54_1 != null) {
			Static44.aClass54_1.method1428(Static16.aCanvas10);
		}
		Static79.anInt2512 = Static125.anInt3005;
		try {
			if (Static92.aClass79_2.aClass30_2 != null) {
				Static101.aClass56_3 = new Class56(Static92.aClass79_2.aClass30_2, 5200, 0);
				for (@Pc(67) int local67 = 0; local67 < 16; local67++) {
					Static120.aClass56Array58[local67] = new Class56(Static92.aClass79_2.aClass30Array1[local67], 6000, 0);
				}
				Static122.aClass56_4 = new Class56(Static92.aClass79_2.aClass30_3, 6000, 0);
				Static46.aClass61_4 = new Class61(255, Static101.aClass56_3, Static122.aClass56_4, 500000);
				Static92.aClass79_2.aClass30_3 = null;
				Static92.aClass79_2.aClass30_2 = null;
				Static92.aClass79_2.aClass30Array1 = null;
			}
		} catch (@Pc(112) IOException local112) {
			Static101.aClass56_3 = null;
			Static122.aClass56_4 = null;
			Static46.aClass61_4 = null;
		}
		if (Static46.anInt2784 != 0) {
			Static81.aBoolean166 = true;
		}
		Static127.aClass1_Sub1_Sub1_5 = new Class1_Sub1_Sub1();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method388() {
		Static45.anInt1256++;
		this.method412();
		Static54.method993();
		Static40.method702();
		Static81.method1387();
		Static116.method1991();
		Static90.method1481();
		if (Static44.aClass54_1 != null) {
			@Pc(33) int local33 = Static44.aClass54_1.method1429();
			Static74.anInt1858 += local33;
			Static50.anInt1383 = local33;
		}
		if (Static1.anInt62 == 0) {
			Static1.method45();
			Static127.method2196();
		} else if (Static1.anInt62 == 5) {
			Static44.method785(this);
			Static1.method45();
			Static127.method2196();
		} else if (Static1.anInt62 == 10) {
			Static44.method785(this);
		} else if (Static1.anInt62 == 20) {
			Static44.method785(this);
			Static104.method1861();
		} else if (Static1.anInt62 == 25) {
			Static26.method526();
		}
		if (Static1.anInt62 == 30) {
			Static70.method1231();
		} else if (Static1.anInt62 == 35) {
			Static70.method1231();
		} else if (Static1.anInt62 == 40) {
			Static104.method1861();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method407(@OriginalArg(0) int arg0) {
		Static33.aClass74_2 = null;
		Static33.anInt1053 = 0;
		Static108.anInt2758++;
		if (Static72.anInt1808 == Static30.anInt1001) {
			Static72.anInt1808 = Static21.anInt738;
		} else {
			Static72.anInt1808 = Static30.anInt1001;
		}
		Static31.aClass34_1 = null;
		if (Static108.anInt2758 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static1.anInt62 > 5) {
				Static96.anInt2280 = 3000;
			} else {
				this.method392("js5connect_full");
				Static1.anInt62 = 1000;
			}
		} else if (Static108.anInt2758 >= 2 && arg0 == 6) {
			this.method392("js5connect_outofdate");
			Static1.anInt62 = 1000;
		} else if (Static108.anInt2758 >= 4) {
			if (Static1.anInt62 > 5) {
				Static96.anInt2280 = 3000;
			} else {
				this.method392("js5connect");
				Static1.anInt62 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method399() {
		Static20.method406();
		Static65.method1174();
		Static32.method386();
		Static28.method1812();
		Static9.method2071();
		Static121.method2058();
		Static97.method2143();
		Static119.method2057();
		Static117.method2029();
		Static88.method1470();
		Static93.method1570();
		Static8.method227();
		Static127.method2202();
		Static42.method746();
		Static7.method109();
		Static43.method762();
		Static100.method1805();
		Static55.method1006();
		Static1.method37();
		Static87.method1430();
		Static112.method1959();
		Static71.method1246();
		Static46.method1921();
		Static44.method783();
		Static50.method864();
		Static33.method631();
		Static79.method1802();
		Static113.method1974();
		Static26.method521();
		Static120.method2130();
		Static69.method1227();
		Static90.method1484();
		Static58.method1035();
		Static80.method1364();
		Static60.method1089();
		Static31.method605();
		Static82.method1395();
		Static48.method831();
		Static51.method882();
		Static36.method649();
		Static96.method1614();
		Static16.method1792();
		Static89.method1479();
		Static14.method292();
		Static25.method459();
		Static29.method581();
		Static115.method1979();
		Static114.method1978();
		Static72.method1250();
		Static124.method2076();
		Static41.method2105();
		Static95.method2018();
		Static129.method2210();
		Static53.method966();
		Static99.method1767();
		Static39.method695();
		Static91.method1487();
		Static64.method1147();
		Static128.method2205();
		Static4.method77();
		Static66.method1187();
		Static122.method2060();
		Static67.method1200();
		Static11.method273();
		Static27.method574();
		Static15.method1508();
		Static123.method2075();
		Static102.method1822();
		Static56.method1008();
		Static86.method1445();
		Static78.method1327();
		Static59.method1060();
		Static94.method1586();
		Static35.method646();
		Static10.method262();
		Static105.method1882();
		Static57.method1029();
		Static126.method2118();
		Static108.method1914();
		Static98.method1721();
		Static103.method1843();
		Static37.method665();
		Static47.method826();
		Static30.method602();
		Static38.method691();
		Static75.method1291();
		Static5.method87();
		Static110.method1944();
		Static21.method413();
		Static63.method1140();
		Static73.method1252();
		Static2.method60();
		Static22.method425();
		Static54.method990();
		Static85.method1435();
		Static81.method1389();
		Static6.method93();
		Static74.method1283();
		Static18.method361();
		Static70.method1232();
		Static107.method1888();
		Static68.method1218();
		Static23.method451();
		Static49.method854();
		Static77.method1320();
		Static40.method705();
		Static19.method365();
		Static101.method1818();
		Static13.method284();
		Static62.method2036();
		Static12.method275();
		Static92.method1546();
		Static34.method642();
		Static109.method1938();
		Static84.method1412();
		Static45.method791();
		Static106.method1884();
		Static76.method1308();
		Static61.method1119();
		Static24.method456();
		Static116.method1992();
		Static118.method2042();
		Static83.method1401();
		Static111.method1951();
		Static17.method330();
		Static52.method963();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method387() {
		@Pc(8) boolean local8 = Static40.method706();
		if (local8 && Static10.aBoolean46 && Static65.aClass26_2 != null) {
			Static65.aClass26_2.method1936();
		}
		if (Static38.aBoolean103) {
			Static100.method1807(Static16.aCanvas10);
			Static101.method1819(Static16.aCanvas10);
			if (Static44.aClass54_1 != null) {
				Static44.aClass54_1.method1424(Static16.aCanvas10);
			}
			this.method394();
			Static85.method1434(Static16.aCanvas10);
			Static11.method270(Static16.aCanvas10);
			if (Static44.aClass54_1 != null) {
				Static44.aClass54_1.method1428(Static16.aCanvas10);
			}
		}
		if (Static1.anInt62 == 0) {
			Static124.method2078(Static99.anInt2441, null, Static38.aClass39_542);
		} else if (Static1.anInt62 == 5) {
			Static9.method2070(Static53.aClass1_Sub1_Sub4_Sub3_1, Static97.aClass1_Sub1_Sub4_Sub3_5);
		} else if (Static1.anInt62 == 10) {
			Static9.method2070(Static53.aClass1_Sub1_Sub4_Sub3_1, Static97.aClass1_Sub1_Sub4_Sub3_5);
		} else if (Static1.anInt62 == 20) {
			Static9.method2070(Static53.aClass1_Sub1_Sub4_Sub3_1, Static97.aClass1_Sub1_Sub4_Sub3_5);
		} else if (Static1.anInt62 == 25) {
			@Pc(119) int local119;
			if (Static108.anInt2757 == 1) {
				if (Static76.anInt1919 > Static8.anInt433) {
					Static8.anInt433 = Static76.anInt1919;
				}
				local119 = (Static8.anInt433 - Static76.anInt1919) * 50 / Static8.anInt433;
				Static9.method2066(Static117.aClass39_1399, true, Static30.method601(new Class39[] { Static17.aClass39_300, Static69.method1226(local119), Static22.aClass39_375 }));
			} else if (Static108.anInt2757 == 2) {
				if (Static16.anInt2475 < Static72.anInt1811) {
					Static16.anInt2475 = Static72.anInt1811;
				}
				local119 = (Static16.anInt2475 - Static72.anInt1811) * 50 / Static16.anInt2475 + 50;
				Static9.method2066(Static117.aClass39_1399, true, Static30.method601(new Class39[] { Static17.aClass39_300, Static69.method1226(local119), Static22.aClass39_375 }));
			} else {
				Static9.method2066(Static117.aClass39_1399, false, null);
			}
		} else if (Static1.anInt62 == 30) {
			Static62.method2039();
		} else if (Static1.anInt62 == 35) {
			Static96.method1618();
		} else if (Static1.anInt62 == 40) {
			Static9.method2066(Static20.aClass39_347, false, Static4.aClass39_61);
		}
		Static69.anInt1769 = 0;
		Static74.anInt1858 = 0;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method410() {
		if (Static28.anInt2563 >= 4) {
			this.method392("js5crc");
			Static1.anInt62 = 1000;
			return;
		}
		if (Static90.anInt2124 >= 4) {
			if (Static1.anInt62 <= 5) {
				this.method392("js5io");
				Static1.anInt62 = 1000;
				return;
			}
			Static90.anInt2124 = 3;
			Static96.anInt2280 = 3000;
		}
		if (Static96.anInt2280-- > 0) {
			return;
		}
		try {
			if (Static33.anInt1053 == 0) {
				Static31.aClass34_1 = Static92.aClass79_2.method2089(Static72.anInt1808, Static25.aString1);
				Static33.anInt1053++;
			}
			if (Static33.anInt1053 == 1) {
				if (Static31.aClass34_1.anInt1567 == 2) {
					this.method407(-1);
					return;
				}
				if (Static31.aClass34_1.anInt1567 == 1) {
					Static33.anInt1053++;
				}
			}
			if (Static33.anInt1053 == 2) {
				Static33.aClass74_2 = new Class74((Socket) Static31.aClass34_1.anObject2, Static92.aClass79_2);
				@Pc(89) Class1_Sub18 local89 = new Class1_Sub18(5);
				local89.method2168(15);
				local89.method2149(457);
				Static33.aClass74_2.method2055(local89.aByteArray96, 5);
				Static33.anInt1053++;
				Static90.aLong70 = Static124.method2079();
			}
			if (Static33.anInt1053 == 3) {
				if (Static1.anInt62 <= 5 || Static33.aClass74_2.method2048() > 0) {
					@Pc(129) int local129 = Static33.aClass74_2.method2051();
					if (local129 != 0) {
						this.method407(local129);
						return;
					}
					Static33.anInt1053++;
				} else if (Static124.method2079() - Static90.aLong70 > 30000L) {
					this.method407(-2);
					return;
				}
			}
			if (Static33.anInt1053 == 4) {
				Static20.method411(Static33.aClass74_2, Static1.anInt62 > 20);
				Static108.anInt2758 = 0;
				Static33.aClass74_2 = null;
				Static33.anInt1053 = 0;
				Static31.aClass34_1 = null;
			}
		} catch (@Pc(187) IOException local187) {
			this.method407(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method412() {
		if (Static1.anInt62 != 1000) {
			@Pc(12) boolean local12 = Static79.method1796();
			if (!local12) {
				this.method410();
			}
		}
	}
}
