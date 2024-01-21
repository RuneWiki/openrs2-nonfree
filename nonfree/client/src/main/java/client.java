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
				Static73.method1343();
			}
			Static101.anInt2759 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static18.anInt437 = 0;
			} else if (arg0[1].equals("office")) {
				Static18.anInt437 = 1;
			} else if (arg0[1].equals("local")) {
				Static18.anInt437 = 2;
			} else {
				Static73.method1343();
			}
			if (arg0[2].equals("live")) {
				Static76.anInt2095 = 0;
			} else if (arg0[2].equals("rc")) {
				Static76.anInt2095 = 1;
			} else if (arg0[2].equals("wip")) {
				Static76.anInt2095 = 2;
			} else {
				Static73.method1343();
			}
			if (arg0[3].equals("lowmem")) {
				Static103.method1904();
			} else if (arg0[3].equals("highmem")) {
				Static115.method2085();
			} else {
				Static73.method1343();
			}
			if (arg0[4].equals("free")) {
				Static125.aBoolean179 = false;
			} else if (arg0[4].equals("members")) {
				Static125.aBoolean179 = true;
			} else {
				Static73.method1343();
			}
			if (arg0[5].equals("english")) {
				Static27.anInt978 = 0;
			} else if (arg0[5].equals("german")) {
				Static43.method1868();
				Static27.anInt978 = 1;
				Static22.aClass26_417 = Static19.aClass26_302;
			} else {
				Static73.method1343();
			}
			if (arg0[6].equals("game0")) {
				Static35.anInt1134 = 0;
			} else if (arg0[6].equals("game1")) {
				Static35.anInt1134 = 1;
			} else {
				Static73.method1343();
			}
			Static42.aString2 = "127.0.0.1";
			@Pc(174) client local174 = new client();
			local174.method371("runescape", Static76.anInt2095 + 32);
		} catch (@Pc(187) Exception local187) {
			Static38.method768(local187, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method374() {
		Static43.anInt2678 = Static18.anInt437 == 0 ? 443 : Static101.anInt2759 + 50000;
		if (Static35.anInt1134 == 1) {
			Static8.aShortArray3 = Static49.aShortArray12;
			Static46.aShortArrayArray3 = Static66.aShortArrayArray6;
			Static28.aShortArray8 = Static62.aShortArray15;
			Static86.aShortArrayArray5 = Static22.aShortArrayArray2;
		} else {
			Static86.aShortArrayArray5 = Static124.aShortArrayArray7;
			Static46.aShortArrayArray3 = Static2.aShortArrayArray1;
			Static8.aShortArray3 = Static14.aShortArray6;
			Static28.aShortArray8 = Static24.aShortArray7;
		}
		Static79.anInt2136 = Static18.anInt437 == 0 ? 43594 : Static101.anInt2759 + 40000;
		Static105.anInt2845 = Static79.anInt2136;
		Static87.method1624();
		Static56.method1128(Static58.aCanvas1);
		Static43.method1876(Static58.aCanvas1);
		Static4.aClass42_1 = Static120.method2156();
		if (Static4.aClass42_1 != null) {
			Static4.aClass42_1.method1635(Static58.aCanvas1);
		}
		Static133.anInt566 = Static123.anInt3183;
		try {
			if (Static67.aClass75_4.aClass39_3 != null) {
				Static81.aClass27_4 = new Class27(Static67.aClass75_4.aClass39_3, 5200, 0);
				for (@Pc(87) int local87 = 0; local87 < 16; local87++) {
					Static39.aClass27Array1[local87] = new Class27(Static67.aClass75_4.aClass39Array1[local87], 6000, 0);
				}
				Static11.aClass27_1 = new Class27(Static67.aClass75_4.aClass39_2, 6000, 0);
				Static17.aClass12_1 = new Class12(255, Static81.aClass27_4, Static11.aClass27_1, 500000);
				Static67.aClass75_4.aClass39_2 = null;
				Static67.aClass75_4.aClass39_3 = null;
				Static67.aClass75_4.aClass39Array1 = null;
			}
		} catch (@Pc(132) IOException local132) {
			Static11.aClass27_1 = null;
			Static17.aClass12_1 = null;
			Static81.aClass27_4 = null;
		}
		if (Static18.anInt437 != 0) {
			Static63.aBoolean99 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	private void method384() {
		if (Static47.anInt1430 >= 4) {
			this.method376("js5crc");
			Static89.anInt2466 = 1000;
			return;
		}
		if (Static109.anInt2925 >= 4) {
			if (Static89.anInt2466 <= 5) {
				this.method376("js5io");
				Static89.anInt2466 = 1000;
				return;
			}
			Static109.anInt2925 = 3;
			Static71.anInt2024 = 3000;
		}
		if (Static71.anInt2024-- > 0) {
			return;
		}
		try {
			if (Static81.anInt2249 == 0) {
				Static22.aClass22_1 = Static67.aClass75_4.method2178(Static42.aString2, Static105.anInt2845);
				Static81.anInt2249++;
			}
			if (Static81.anInt2249 == 1) {
				if (Static22.aClass22_1.anInt1200 == 2) {
					this.method386(-1);
					return;
				}
				if (Static22.aClass22_1.anInt1200 == 1) {
					Static81.anInt2249++;
				}
			}
			if (Static81.anInt2249 == 2) {
				Static1.aClass76_1 = new Class76((Socket) Static22.aClass22_1.anObject3, Static67.aClass75_4);
				@Pc(105) Class3_Sub11 local105 = new Class3_Sub11(5);
				local105.method992(15);
				local105.method1001(464);
				Static1.aClass76_1.method2185(5, local105.aByteArray13);
				Static81.anInt2249++;
				Static17.aLong16 = Static87.method1625();
			}
			if (Static81.anInt2249 == 3) {
				if (Static89.anInt2466 <= 5 || Static1.aClass76_1.method2191() > 0) {
					@Pc(143) int local143 = Static1.aClass76_1.method2186();
					if (local143 != 0) {
						this.method386(local143);
						return;
					}
					Static81.anInt2249++;
				} else if (Static87.method1625() - Static17.aLong16 > 30000L) {
					this.method386(-2);
					return;
				}
			}
			if (Static81.anInt2249 == 4) {
				Static90.method1664(Static89.anInt2466 > 20, Static1.aClass76_1);
				Static1.aClass76_1 = null;
				Static12.anInt305 = 0;
				Static81.anInt2249 = 0;
				Static22.aClass22_1 = null;
			}
		} catch (@Pc(196) IOException local196) {
			this.method386(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method369() {
		@Pc(4) boolean local4 = Static105.method1948();
		if (local4 && Static42.aBoolean70 && Static19.aClass43_1 != null) {
			Static19.aClass43_1.method1911();
		}
		if (Static121.aBoolean175) {
			Static13.method214(Static58.aCanvas1);
			Static46.method884(Static58.aCanvas1);
			if (Static4.aClass42_1 != null) {
				Static4.aClass42_1.method1639(Static58.aCanvas1);
			}
			this.method367();
			Static56.method1128(Static58.aCanvas1);
			Static43.method1876(Static58.aCanvas1);
			if (Static4.aClass42_1 != null) {
				Static4.aClass42_1.method1635(Static58.aCanvas1);
			}
		}
		if (Static89.anInt2466 == 0) {
			Static10.method168(Static55.aClass26_828, null, Static4.anInt137);
		} else if (Static89.anInt2466 == 5) {
			Static116.method2091(Static111.aClass3_Sub1_Sub4_Sub2_Sub1_4, Static54.aClass3_Sub1_Sub4_Sub2_Sub1_2);
		} else if (Static89.anInt2466 == 10) {
			Static116.method2091(Static111.aClass3_Sub1_Sub4_Sub2_Sub1_4, Static54.aClass3_Sub1_Sub4_Sub2_Sub1_2);
		} else if (Static89.anInt2466 == 20) {
			Static116.method2091(Static111.aClass3_Sub1_Sub4_Sub2_Sub1_4, Static54.aClass3_Sub1_Sub4_Sub2_Sub1_2);
		} else if (Static89.anInt2466 == 25) {
			@Pc(114) int local114;
			if (Static100.anInt3231 == 1) {
				if (Static117.anInt3072 > Static48.anInt1575) {
					Static48.anInt1575 = Static117.anInt3072;
				}
				local114 = (Static48.anInt1575 - Static117.anInt3072) * 50 / Static48.anInt1575;
				Static30.method555(false, Static119.method2136(new Class26[] { Static11.aClass26_167, Static72.aClass26_1031, Static122.method2170(local114), Static52.aClass26_819 }));
			} else if (Static100.anInt3231 == 2) {
				if (Static125.anInt3207 > Static76.anInt2092) {
					Static76.anInt2092 = Static125.anInt3207;
				}
				local114 = (Static76.anInt2092 - Static125.anInt3207) * 50 / Static76.anInt2092 + 50;
				Static30.method555(false, Static119.method2136(new Class26[] { Static11.aClass26_167, Static72.aClass26_1031, Static122.method2170(local114), Static52.aClass26_819 }));
			} else {
				Static30.method555(false, Static11.aClass26_167);
			}
		} else if (Static89.anInt2466 == 30) {
			Static39.method771();
		} else if (Static89.anInt2466 == 40) {
			Static30.method555(false, Static119.method2136(new Class26[] { Static107.aClass26_1548, Static17.aClass26_255, Static131.aClass26_1780 }));
		}
		@Pc(260) int local260;
		@Pc(250) Graphics local250;
		if (Static89.anInt2466 == 30 && Static87.anInt2437 == 0 && !Static24.aBoolean47) {
			try {
				local250 = Static58.aCanvas1.getGraphics();
				for (local260 = 0; local260 < Static15.anInt403; local260++) {
					if (Static28.aBooleanArray9[local260]) {
						Static102.aClass6_1.method874(Static125.anIntArray386[local260], local250, Static39.anIntArray134[local260], Static31.anIntArray328[local260], Static66.anIntArray296[local260]);
						Static28.aBooleanArray9[local260] = false;
					}
				}
			} catch (@Pc(316) Exception local316) {
				Static58.aCanvas1.repaint();
			}
		} else if (Static89.anInt2466 > 0) {
			try {
				local250 = Static58.aCanvas1.getGraphics();
				Static102.aClass6_1.method881(local250);
				Static24.aBoolean47 = false;
				for (local260 = 0; local260 < Static15.anInt403; local260++) {
					Static28.aBooleanArray9[local260] = false;
				}
			} catch (@Pc(276) Exception local276) {
				Static58.aCanvas1.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	protected void method382() {
		Static4.anInt136++;
		this.method385();
		Static117.method2102();
		Static88.method1633();
		Static65.method1267();
		Static54.method1093();
		Static113.method2065();
		if (Static4.aClass42_1 != null) {
			@Pc(34) int local34 = Static4.aClass42_1.method1636();
			Static6.anInt162 = local34;
		}
		if (Static89.anInt2466 == 0) {
			Static86.method1498();
			Static4.method63();
		} else if (Static89.anInt2466 == 5) {
			Static65.method1269(this);
			Static86.method1498();
			Static4.method63();
		} else if (Static89.anInt2466 == 10) {
			Static65.method1269(this);
		} else if (Static89.anInt2466 == 20) {
			Static65.method1269(this);
			Static46.method887();
		} else if (Static89.anInt2466 == 25) {
			Static65.method1266();
		}
		if (Static89.anInt2466 == 30) {
			Static101.method1894();
		} else if (Static89.anInt2466 == 40) {
			Static46.method887();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method385() {
		if (Static89.anInt2466 != 1000) {
			@Pc(10) boolean local10 = Static118.method2123();
			if (!local10) {
				this.method384();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method373() {
		Static20.method387();
		Static44.method824();
		Static133.method372();
		Static25.method2165();
		Static23.method877();
		Static88.method1631();
		Static70.method982();
		Static124.method2182();
		Static27.method591();
		Static47.method899();
		Static16.method267();
		Static99.method1886();
		Static48.method1034();
		Static112.method2022();
		Static4.method78();
		Static79.method1388();
		Static21.method479();
		Static106.method1960();
		Static28.method596();
		Static66.method1640();
		Static41.method792();
		Static67.method1921();
		Static12.method177();
		Static57.method1148();
		Static118.method2120();
		Static31.method1884();
		Static35.method705();
		Static9.method137();
		Static94.method1703();
		Static5.method2200();
		Static54.method1095();
		Static52.method1084();
		Static107.method1966();
		Static84.method1483();
		Static34.method679();
		Static49.method1042();
		Static19.method349();
		Static115.method2086();
		Static22.method490();
		Static110.method2007();
		Static18.method278();
		Static43.method1873();
		Static111.method2013();
		Static40.method781();
		Static122.method2169();
		Static8.method116();
		Static82.method1422();
		Static64.method1261();
		Static96.method1773();
		Static29.method605();
		Static113.method2066();
		Static87.method1627();
		Static78.method1361();
		Static59.method1189();
		Static30.method577();
		Static13.method212();
		Static131.method2263();
		Static121.method2166();
		Static105.method1949();
		Static14.method243();
		Static80.method1393();
		Static39.method777();
		Static10.method170();
		Static1.method4();
		Static71.method1315();
		Static102.method1902();
		Static125.method2195();
		Static130.method2254();
		Static77.method2232();
		Static100.method2206();
		Static127.method2235();
		Static60.method1197();
		Static50.method1051();
		Static120.method2152();
		Static117.method2101();
		Static132.method2266();
		Static63.method1250();
		Static6.method98();
		Static81.method1416();
		Static3.method58();
		Static56.method1126();
		Static90.method1662();
		Static42.method809();
		Static24.method515();
		Static72.method1333();
		Static33.method649();
		Static129.method1604();
		Static55.method1108();
		Static97.method1793();
		Static75.method1349();
		Static53.method1090();
		Static103.method1906();
		Static76.method1358();
		Static7.method112();
		Static114.method2080();
		Static109.method2000();
		Static61.method1205();
		Static2.method11();
		Static86.method1499();
		Static17.method273();
		Static98.method1799();
		Static128.method2250();
		Static58.method1183();
		Static36.method729();
		Static91.method1673();
		Static38.method766();
		Static62.method1230();
		Static108.method1980();
		Static116.method2090();
		Static85.method1491();
		Static74.method1347();
		Static15.method264();
		Static46.method888();
		Static69.method1678();
		Static101.method1892();
		Static89.method1643();
		Static11.method174();
		Static83.method1441();
		Static92.method1684();
		Static51.method1081();
		Static68.method1296();
		Static119.method2137();
		Static73.method1344();
		Static37.method740();
		Static65.method1268();
		Static95.method1771();
		Static93.method1692();
		Static45.method871();
		Static26.method523();
		Static126.method2196();
		Static32.method628();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method386(@OriginalArg(1) int arg0) {
		if (Static105.anInt2845 == Static79.anInt2136) {
			Static105.anInt2845 = Static43.anInt2678;
		} else {
			Static105.anInt2845 = Static79.anInt2136;
		}
		Static1.aClass76_1 = null;
		Static81.anInt2249 = 0;
		Static22.aClass22_1 = null;
		Static12.anInt305++;
		if (Static12.anInt305 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static89.anInt2466 > 5) {
				Static71.anInt2024 = 3000;
			} else {
				this.method376("js5connect_full");
				Static89.anInt2466 = 1000;
			}
		} else if (Static12.anInt305 >= 2 && arg0 == 6) {
			this.method376("js5connect_outofdate");
			Static89.anInt2466 = 1000;
		} else if (Static12.anInt305 >= 4) {
			if (Static89.anInt2466 > 5) {
				Static71.anInt2024 = 3000;
			} else {
				this.method376("js5connect");
				Static89.anInt2466 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method378() {
		if (Static52.aClass53_1 != null) {
			Static52.aClass53_1.aBoolean135 = false;
		}
		Static52.aClass53_1 = null;
		if (Static118.aClass76_4 != null) {
			Static118.aClass76_4.method2183();
			Static118.aClass76_4 = null;
		}
		Static116.method2087();
		Static124.method2184();
		Static4.aClass42_1 = null;
		if (Static19.aClass43_1 != null) {
			Static19.aClass43_1.method1918();
		}
		if (Static42.aClass43_2 != null) {
			Static42.aClass43_2.method1918();
		}
		Static86.method1500();
		Static48.method1037();
		try {
			if (Static81.aClass27_4 != null) {
				Static81.aClass27_4.method892();
			}
			if (Static39.aClass27Array1 != null) {
				for (@Pc(54) int local54 = 0; local54 < Static39.aClass27Array1.length; local54++) {
					if (Static39.aClass27Array1[local54] != null) {
						Static39.aClass27Array1[local54].method892();
					}
				}
			}
			if (Static11.aClass27_1 != null) {
				Static11.aClass27_1.method892();
			}
		} catch (@Pc(81) IOException local81) {
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method381()) {
			return;
		}
		Static101.anInt2759 = Integer.parseInt(this.getParameter("worldid"));
		Static76.anInt2095 = Integer.parseInt(this.getParameter("modewhat"));
		Static18.anInt437 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static103.method1904();
		} else {
			Static115.method2085();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static125.aBoolean179 = true;
		} else {
			Static125.aBoolean179 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static43.method1868();
			Static27.anInt978 = 1;
			Static22.aClass26_417 = Static19.aClass26_302;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static35.anInt1134 = 1;
		} else {
			Static35.anInt1134 = 0;
		}
		try {
			Static79.anInt2162 = Integer.parseInt(this.getParameter("js"));
			Static40.anInt1264 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(101) Exception local101) {
		}
		Static42.aString2 = this.getCodeBase().getHost();
		this.method380(Static76.anInt2095 + 32);
	}
}
