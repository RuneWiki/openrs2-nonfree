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
				Static39.method895();
			}
			Static48.anInt1226 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static32.anInt898 = 0;
			} else if (arg0[1].equals("office")) {
				Static32.anInt898 = 1;
			} else if (arg0[1].equals("local")) {
				Static32.anInt898 = 2;
			} else {
				Static39.method895();
			}
			if (arg0[2].equals("live")) {
				Static83.anInt1854 = 0;
			} else if (arg0[2].equals("rc")) {
				Static83.anInt1854 = 1;
			} else if (arg0[2].equals("wip")) {
				Static83.anInt1854 = 2;
			} else {
				Static39.method895();
			}
			if (arg0[3].equals("lowmem")) {
				Static94.method1593();
			} else if (arg0[3].equals("highmem")) {
				Static76.method1234();
			} else {
				Static39.method895();
			}
			if (arg0[4].equals("free")) {
				Static23.aBoolean21 = false;
			} else if (arg0[4].equals("members")) {
				Static23.aBoolean21 = true;
			} else {
				Static39.method895();
			}
			if (arg0[5].equals("english")) {
				Static34.anInt947 = 0;
			} else if (arg0[5].equals("german")) {
				Static111.method1791();
				Static92.aClass25_983 = Static93.aClass25_994;
				Static34.anInt947 = 1;
			} else {
				Static39.method895();
			}
			Static52.aString1 = "127.0.0.1";
			@Pc(152) client local152 = new client();
			local152.method420(Static83.anInt1854 + 32, "runescape");
		} catch (@Pc(165) Exception local165) {
			Static120.method1980(null, local165);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method416()) {
			return;
		}
		Static48.anInt1226 = Integer.parseInt(this.getParameter("worldid"));
		Static83.anInt1854 = Integer.parseInt(this.getParameter("modewhat"));
		Static32.anInt898 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static94.method1593();
		} else {
			Static76.method1234();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static23.aBoolean21 = true;
		} else {
			Static23.aBoolean21 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static111.method1791();
			Static92.aClass25_983 = Static93.aClass25_994;
			Static34.anInt947 = 1;
		}
		try {
			Static55.anInt1314 = Integer.parseInt(this.getParameter("js"));
			Static81.anInt1800 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(85) Exception local85) {
		}
		Static52.aString1 = this.getCodeBase().getHost();
		this.method422(Static83.anInt1854 + 32);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method409() {
		Static18.method431();
		Static35.method769();
		Static89.method415();
		Static125.method1735();
		Static70.method1099();
		Static28.method606();
		Static22.method632();
		Static118.method1901();
		Static77.method1290();
		Static14.method355();
		Static105.method1689();
		Static106.method1723();
		Static30.method686();
		Static72.method1195();
		Static4.method47();
		Static88.method1444();
		Static120.method1979();
		Static2.method27();
		Static86.method1435();
		Static57.method1729();
		Static99.method1654();
		Static63.method1107();
		Static124.method2004();
		Static82.method1383();
		Static115.method1852();
		Static101.method1673();
		Static96.method1972();
		Static111.method1792();
		Static83.method1402();
		Static122.method2020();
		Static55.method1034();
		Static59.method1063();
		Static90.method1518();
		Static20.method471();
		Static117.method1891();
		Static129.method2049();
		Static68.method1139();
		Static67.method1138();
		Static78.method1312();
		Static54.method1025();
		Static76.method1232();
		Static98.method1966();
		Static74.method1213();
		Static10.method248();
		Static46.method971();
		Static104.method1686();
		Static17.method385();
		Static42.method939();
		Static58.method1055();
		Static26.method595();
		Static103.method1963();
		Static87.method1283();
		Static60.method1070();
		Static84.method1409();
		Static13.method325();
		Static23.method557();
		Static109.method1751();
		Static3.method42();
		Static11.method250();
		Static27.method604();
		Static6.method101();
		Static56.method1045();
		Static40.method898();
		Static80.method1364();
		Static49.method983();
		Static36.method833();
		Static128.method1937();
		Static9.method233();
		Static85.method1414();
		Static71.method1148();
		Static45.method960();
		Static29.method619();
		Static126.method2035();
		Static114.method1830();
		Static15.method359();
		Static7.method126();
		Static16.method380();
		Static112.method1804();
		Static31.method711();
		Static94.method1579();
		Static52.method1006();
		Static92.method1555();
		Static38.method872();
		Static34.method753();
		Static61.method1087();
		Static32.method730();
		Static75.method1225();
		Static43.method948();
		Static116.method1862();
		Static33.method738();
		Static62.method1093();
		Static69.method1146();
		Static1.method17();
		Static21.method491();
		Static24.method573();
		Static47.method975();
		Static50.method985();
		Static91.method1541();
		Static110.method1769();
		Static12.method283();
		Static127.method2041();
		Static100.method1658();
		Static119.method1919();
		Static64.method1125();
		Static97.method1640();
		Static121.method1991();
		Static108.method1742();
		Static65.method1130();
		Static25.method586();
		Static8.method231();
		Static53.method1781();
		Static5.method99();
		Static102.method1682();
		Static48.method980();
		Static79.method1353();
		Static51.method993();
		Static107.method1732();
		Static44.method951();
		Static37.method859();
		Static19.method436();
		Static95.method1599();
		Static93.method1566();
		Static81.method1379();
		Static66.method1131();
		Static73.method1207();
		Static41.method906();
		Static123.method1997();
		Static39.method888();
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method426() {
		if (Static48.anInt1227 != 1000) {
			@Pc(16) boolean local16 = Static119.method1917();
			if (!local16) {
				this.method427();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	private void method427() {
		if (Static6.anInt120 >= 4) {
			this.method418("js5crc");
			Static48.anInt1227 = 1000;
			return;
		}
		if (Static21.anInt590 >= 4) {
			if (Static48.anInt1227 <= 5) {
				this.method418("js5io");
				Static48.anInt1227 = 1000;
				return;
			}
			Static83.anInt1859 = 3000;
			Static21.anInt590 = 3;
		}
		if (Static83.anInt1859-- > 0) {
			return;
		}
		try {
			if (Static104.anInt2374 == 0) {
				Static27.aClass50_2 = Static71.aClass74_2.method1817(Static102.anInt2365, Static52.aString1);
				Static104.anInt2374++;
			}
			if (Static104.anInt2374 == 1) {
				if (Static27.aClass50_2.anInt1485 == 2) {
					this.method428(-1);
					return;
				}
				if (Static27.aClass50_2.anInt1485 == 1) {
					Static104.anInt2374++;
				}
			}
			if (Static104.anInt2374 == 2) {
				Static52.aClass77_4 = new Class77((Socket) Static27.aClass50_2.anObject4, Static71.aClass74_2);
				@Pc(101) Class1_Sub5 local101 = new Class1_Sub5(5);
				local101.method676(15);
				local101.method633(458);
				Static52.aClass77_4.method1904(5, local101.aByteArray13);
				Static104.anInt2374++;
				Static61.aLong94 = Static26.method596();
			}
			if (Static104.anInt2374 == 3) {
				if (Static48.anInt1227 <= 5 || Static52.aClass77_4.method1902() > 0) {
					@Pc(159) int local159 = Static52.aClass77_4.method1907();
					if (local159 != 0) {
						this.method428(local159);
						return;
					}
					Static104.anInt2374++;
				} else if (Static26.method596() - Static61.aLong94 > 30000L) {
					this.method428(-2);
					return;
				}
			}
			if (Static104.anInt2374 == 4) {
				Static13.method342(Static48.anInt1227 > 20, Static52.aClass77_4);
				Static95.anInt2175 = 0;
				Static104.anInt2374 = 0;
				Static27.aClass50_2 = null;
				Static52.aClass77_4 = null;
			}
		} catch (@Pc(201) IOException local201) {
			this.method428(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method428(@OriginalArg(0) int arg0) {
		Static95.anInt2175++;
		Static52.aClass77_4 = null;
		Static104.anInt2374 = 0;
		Static27.aClass50_2 = null;
		if (Static102.anInt2365 == Static69.anInt1483) {
			Static102.anInt2365 = Static55.anInt1307;
		} else {
			Static102.anInt2365 = Static69.anInt1483;
		}
		if (Static95.anInt2175 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static48.anInt1227 > 5) {
				Static83.anInt1859 = 3000;
			} else {
				this.method418("js5connect_full");
				Static48.anInt1227 = 1000;
			}
		} else if (Static95.anInt2175 >= 2 && arg0 == 6) {
			this.method418("js5connect_outofdate");
			Static48.anInt1227 = 1000;
		} else if (Static95.anInt2175 >= 4) {
			if (Static48.anInt1227 > 5) {
				Static83.anInt1859 = 3000;
			} else {
				this.method418("js5connect");
				Static48.anInt1227 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method407() {
		@Pc(8) boolean local8 = Static123.method1995();
		if (local8 && Static8.aBoolean5 && Static18.aClass57_1 != null) {
			Static18.aClass57_1.method2014();
		}
		if (Static49.aBoolean51) {
			Static8.method230(Static119.aCanvas1);
			Static13.method316(Static119.aCanvas1);
			if (Static12.aClass41_1 != null) {
				Static12.aClass41_1.method1728(Static119.aCanvas1);
			}
			this.method421();
			Static9.method235(Static119.aCanvas1);
			Static1.method15(Static119.aCanvas1);
			if (Static12.aClass41_1 != null) {
				Static12.aClass41_1.method1726(Static119.aCanvas1);
			}
		}
		if (Static48.anInt1227 == 0) {
			Static127.method2040(Static81.aClass25_861, null, Static109.anInt2512);
		} else if (Static48.anInt1227 == 5) {
			Static15.method364(Static83.aClass1_Sub2_Sub2_Sub3_3, Static46.aClass1_Sub2_Sub2_Sub3_2);
		} else if (Static48.anInt1227 == 10) {
			Static15.method364(Static83.aClass1_Sub2_Sub2_Sub3_3, Static46.aClass1_Sub2_Sub2_Sub3_2);
		} else if (Static48.anInt1227 == 20) {
			Static15.method364(Static83.aClass1_Sub2_Sub2_Sub3_3, Static46.aClass1_Sub2_Sub2_Sub3_2);
		} else if (Static48.anInt1227 == 25) {
			@Pc(100) int local100;
			if (Static34.anInt944 == 1) {
				if (Static34.anInt946 < Static3.anInt54) {
					Static34.anInt946 = Static3.anInt54;
				}
				local100 = (Static34.anInt946 - Static3.anInt54) * 50 / Static34.anInt946;
				Static111.method1790(Static116.method1859(new Class25[] { Static87.aClass25_800, Static74.method1214(local100), Static87.aClass25_795 }), Static2.aClass25_30, true);
			} else if (Static34.anInt944 == 2) {
				if (Static83.anInt1844 < Static105.anInt2381) {
					Static83.anInt1844 = Static105.anInt2381;
				}
				local100 = (Static83.anInt1844 - Static105.anInt2381) * 50 / Static83.anInt1844 + 50;
				Static111.method1790(Static116.method1859(new Class25[] { Static87.aClass25_800, Static74.method1214(local100), Static87.aClass25_795 }), Static2.aClass25_30, true);
			} else {
				Static111.method1790(null, Static2.aClass25_30, false);
			}
		} else if (Static48.anInt1227 == 30) {
			Static80.method1368();
		} else if (Static48.anInt1227 == 35) {
			Static110.method1770();
		} else if (Static48.anInt1227 == 40) {
			Static111.method1790(Static27.aClass25_331, Static125.aClass25_1191, false);
		}
		Static88.anInt1975 = 0;
		Static59.anInt1355 = 0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method413() {
		Static60.anInt1366++;
		this.method426();
		Static102.method1683();
		Static98.method1965();
		Static106.method1722();
		Static7.method128();
		Static2.method25();
		if (Static12.aClass41_1 != null) {
			@Pc(36) int local36 = Static12.aClass41_1.method1725();
			Static2.anInt30 = local36;
			Static59.anInt1355 += local36;
		}
		if (Static48.anInt1227 == 0) {
			Static90.method1523();
			Static30.method684();
		} else if (Static48.anInt1227 == 5) {
			Static87.method1276(this);
			Static90.method1523();
			Static30.method684();
		} else if (Static48.anInt1227 == 10) {
			Static87.method1276(this);
		} else if (Static48.anInt1227 == 20) {
			Static87.method1276(this);
			Static94.method1588();
		} else if (Static48.anInt1227 == 25) {
			Static116.method1864();
		}
		if (Static48.anInt1227 == 30) {
			Static52.method1005();
		} else if (Static48.anInt1227 == 35) {
			Static52.method1005();
		} else if (Static48.anInt1227 == 40) {
			Static94.method1588();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	protected void method414() {
		Static55.anInt1307 = Static32.anInt898 == 0 ? 443 : Static48.anInt1226 + 50000;
		Static69.anInt1483 = Static32.anInt898 == 0 ? 43594 : Static48.anInt1226 + 40000;
		Static102.anInt2365 = Static69.anInt1483;
		Static61.method1090();
		Static9.method235(Static119.aCanvas1);
		Static1.method15(Static119.aCanvas1);
		Static12.aClass41_1 = Static26.method593();
		if (Static12.aClass41_1 != null) {
			Static12.aClass41_1.method1726(Static119.aCanvas1);
		}
		Static46.anInt1197 = Static113.anInt2620;
		try {
			if (Static71.aClass74_2.aClass9_3 != null) {
				Static122.aClass12_61 = new Class12(Static71.aClass74_2.aClass9_3, 5200, 0);
				for (@Pc(61) int local61 = 0; local61 < 16; local61++) {
					Static33.aClass12Array1[local61] = new Class12(Static71.aClass74_2.aClass9Array1[local61], 6000, 0);
				}
				Static86.aClass12_38 = new Class12(Static71.aClass74_2.aClass9_2, 6000, 0);
				Static94.aClass70_4 = new Class70(255, Static122.aClass12_61, Static86.aClass12_38, 500000);
				Static71.aClass74_2.aClass9_2 = null;
				Static71.aClass74_2.aClass9Array1 = null;
				Static71.aClass74_2.aClass9_3 = null;
			}
		} catch (@Pc(108) IOException local108) {
			Static122.aClass12_61 = null;
			Static86.aClass12_38 = null;
			Static94.aClass70_4 = null;
		}
		if (Static32.anInt898 != 0) {
			Static87.aBoolean63 = true;
		}
		Static85.aClass1_Sub2_Sub14_4 = new Class1_Sub2_Sub14();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method410() {
		if (Static126.aClass22_1 != null) {
			Static126.aClass22_1.aBoolean27 = false;
		}
		Static126.aClass22_1 = null;
		if (Static100.aClass77_5 != null) {
			Static100.aClass77_5.method1909();
			Static100.aClass77_5 = null;
		}
		Static12.method284();
		Static25.method591();
		Static12.aClass41_1 = null;
		if (Static18.aClass57_1 != null) {
			Static18.aClass57_1.method2018();
		}
		if (Static90.aClass57_2 != null) {
			Static90.aClass57_2.method2018();
		}
		Static5.method97();
		Static64.method1128();
		try {
			if (Static122.aClass12_61 != null) {
				Static122.aClass12_61.method349();
			}
			if (Static33.aClass12Array1 != null) {
				for (@Pc(53) int local53 = 0; local53 < Static33.aClass12Array1.length; local53++) {
					if (Static33.aClass12Array1[local53] != null) {
						Static33.aClass12Array1[local53].method349();
					}
				}
			}
			if (Static86.aClass12_38 != null) {
				Static86.aClass12_38.method349();
			}
		} catch (@Pc(80) IOException local80) {
		}
	}
}
