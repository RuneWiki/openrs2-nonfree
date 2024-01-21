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
				Static35.method762();
			}
			Static31.anInt1056 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static95.anInt2276 = 0;
			} else if (arg0[1].equals("office")) {
				Static95.anInt2276 = 1;
			} else if (arg0[1].equals("local")) {
				Static95.anInt2276 = 2;
			} else {
				Static35.method762();
			}
			if (arg0[2].equals("live")) {
				Static23.anInt733 = 0;
			} else if (arg0[2].equals("rc")) {
				Static23.anInt733 = 1;
			} else if (arg0[2].equals("wip")) {
				Static23.anInt733 = 2;
			} else {
				Static35.method762();
			}
			if (arg0[3].equals("lowmem")) {
				Static42.method843();
			} else if (arg0[3].equals("highmem")) {
				Static85.method1432();
			} else {
				Static35.method762();
			}
			if (arg0[4].equals("free")) {
				Static123.aBoolean129 = false;
			} else if (arg0[4].equals("members")) {
				Static123.aBoolean129 = true;
			} else {
				Static35.method762();
			}
			if (arg0[5].equals("english")) {
				Static87.anInt2095 = 0;
			} else if (arg0[5].equals("german")) {
				Static70.method1200();
				Static35.aClass53_468 = Static44.aClass53_561;
				Static87.anInt2095 = 1;
			} else {
				Static35.method762();
			}
			Static107.aString5 = "127.0.0.1";
			@Pc(158) client local158 = new client();
			local158.method281("runescape", Static23.anInt733 + 32);
		} catch (@Pc(171) Exception local171) {
			Static10.method172(null, local171);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method277() {
		Static27.anInt843++;
		this.method293();
		Static18.method298();
		Static97.method1628();
		Static40.method820();
		Static20.method379();
		Static119.method285();
		if (Static62.aClass38_1 != null) {
			@Pc(35) int local35 = Static62.aClass38_1.method1442();
			Static43.anInt1234 += local35;
			Static99.anInt2346 = local35;
		}
		if (Static78.anInt1957 == 0) {
			Static104.method1755();
			Static5.method117();
		} else if (Static78.anInt1957 == 5) {
			Static30.method671(this);
			Static104.method1755();
			Static5.method117();
		} else if (Static78.anInt1957 == 10) {
			Static30.method671(this);
		} else if (Static78.anInt1957 == 20) {
			Static30.method671(this);
			Static19.method1696();
		} else if (Static78.anInt1957 == 25) {
			Static98.method1634();
		}
		if (Static78.anInt1957 == 30) {
			Static100.method1649();
		} else if (Static78.anInt1957 == 35) {
			Static100.method1649();
		} else if (Static78.anInt1957 == 40) {
			Static19.method1696();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method290() {
		Static18.method292();
		Static76.method1262();
		Static119.method276();
		Static50.method1911();
		Static37.method1537();
		Static42.method844();
		Static82.method627();
		Static52.method951();
		Static91.method1526();
		Static11.method181();
		Static22.method390();
		Static20.method376();
		Static29.method664();
		Static34.method732();
		Static55.method1006();
		Static9.method145();
		Static56.method1043();
		Static12.method191();
		Static117.method1851();
		Static53.method1444();
		Static113.method1807();
		Static33.method1399();
		Static15.method224();
		Static44.method874();
		Static94.method1565();
		Static96.method1033();
		Static109.method1738();
		Static4.method84();
		Static46.method1963();
		Static63.method1115();
		Static51.method942();
		Static108.method1731();
		Static110.method1765();
		Static67.method1167();
		Static57.method1050();
		Static71.method1208();
		Static7.method130();
		Static83.method1428();
		Static8.method132();
		Static98.method1636();
		Static104.method1754();
		Static105.method1702();
		Static66.method1136();
		Static41.method837();
		Static70.method1203();
		Static74.method1238();
		Static5.method113();
		Static62.method1107();
		Static89.method1458();
		Static54.method1955();
		Static126.method1518();
		Static85.method1434();
		Static95.method1572();
		Static118.method1901();
		Static99.method1638();
		Static21.method383();
		Static38.method778();
		Static73.method1235();
		Static100.method1652();
		Static125.method1971();
		Static40.method824();
		Static59.method1074();
		Static101.method1667();
		Static114.method1812();
		Static24.method463();
		Static84.method1320();
		Static60.method1079();
		Static122.method1944();
		Static111.method1788();
		Static47.method896();
		Static79.method1379();
		Static65.method1129();
		Static106.method1710();
		Static72.method1220();
		Static116.method1834();
		Static121.method1935();
		Static10.method164();
		Static61.method1099();
		Static49.method936();
		Static16.method243();
		Static80.method1416();
		Static123.method1961();
		Static103.method1694();
		Static25.method499();
		Static17.method248();
		Static86.method1436();
		Static81.method1420();
		Static35.method761();
		Static39.method817();
		Static115.method1818();
		Static124.method1967();
		Static58.method1061();
		Static77.method1353();
		Static87.method1450();
		Static92.method1531();
		Static27.method522();
		Static69.method1199();
		Static102.method1675();
		Static88.method1456();
		Static32.method703();
		Static48.method925();
		Static31.method692();
		Static13.method210();
		Static30.method670();
		Static2.method40();
		Static120.method1919();
		Static93.method1542();
		Static19.method1699();
		Static3.method47();
		Static90.method1469();
		Static68.method1175();
		Static1.method35();
		Static64.method1121();
		Static97.method1627();
		Static26.method500();
		Static23.method403();
		Static14.method214();
		Static107.method1718();
		Static36.method767();
		Static78.method1367();
		Static75.method1247();
		Static112.method1799();
		Static28.method532();
		Static43.method866();
		Static45.method888();
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method289() {
		@Pc(13) boolean local13 = Static71.method1205();
		if (local13 && Static58.aBoolean56 && Static42.aClass1_1 != null) {
			Static42.aClass1_1.method1398();
		}
		if (Static87.aBoolean80) {
			Static108.method1723(Static87.aCanvas1);
			Static25.method495(Static87.aCanvas1);
			if (Static62.aClass38_1 != null) {
				Static62.aClass38_1.method1443(Static87.aCanvas1);
			}
			this.method287();
			Static72.method1227(Static87.aCanvas1);
			Static73.method1237(Static87.aCanvas1);
			if (Static62.aClass38_1 != null) {
				Static62.aClass38_1.method1441(Static87.aCanvas1);
			}
		}
		if (Static78.anInt1957 == 0) {
			Static20.method380(null, Static113.anInt2601, Static122.aClass53_1404);
		} else if (Static78.anInt1957 == 5) {
			Static4.method78(Static90.aClass3_Sub1_Sub5_Sub2_4, Static43.aClass3_Sub1_Sub5_Sub2_1);
		} else if (Static78.anInt1957 == 10) {
			Static4.method78(Static90.aClass3_Sub1_Sub5_Sub2_4, Static43.aClass3_Sub1_Sub5_Sub2_1);
		} else if (Static78.anInt1957 == 20) {
			Static4.method78(Static90.aClass3_Sub1_Sub5_Sub2_4, Static43.aClass3_Sub1_Sub5_Sub2_1);
		} else if (Static78.anInt1957 == 25) {
			@Pc(109) int local109;
			if (Static2.anInt56 == 1) {
				if (Static82.anInt946 > Static38.anInt1146) {
					Static38.anInt1146 = Static82.anInt946;
				}
				local109 = (Static38.anInt1146 - Static82.anInt946) * 50 / Static38.anInt1146;
				Static18.method295(Static42.aClass53_538, Static103.method1689(new Class53[] { Static11.aClass53_114, Static108.method1725(local109), Static85.aClass53_945 }), true);
			} else if (Static2.anInt56 == 2) {
				if (Static94.anInt2245 > Static63.anInt1641) {
					Static63.anInt1641 = Static94.anInt2245;
				}
				local109 = (Static63.anInt1641 - Static94.anInt2245) * 50 / Static63.anInt1641 + 50;
				Static18.method295(Static42.aClass53_538, Static103.method1689(new Class53[] { Static11.aClass53_114, Static108.method1725(local109), Static85.aClass53_945 }), true);
			} else {
				Static18.method295(Static42.aClass53_538, null, false);
			}
		} else if (Static78.anInt1957 == 30) {
			Static3.method51();
		} else if (Static78.anInt1957 == 35) {
			Static43.method865();
		} else if (Static78.anInt1957 == 40) {
			Static18.method295(Static115.aClass53_1318, Static68.aClass53_767, false);
		}
		Static43.anInt1234 = 0;
		Static43.anInt1236 = 0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method273() {
		if (Static90.aClass32_1 != null) {
			Static90.aClass32_1.aBoolean43 = false;
		}
		Static90.aClass32_1 = null;
		if (Static40.aClass37_2 != null) {
			Static40.aClass37_2.method948();
			Static40.aClass37_2 = null;
		}
		Static102.method1677();
		Static104.method1752();
		Static62.aClass38_1 = null;
		if (Static42.aClass1_1 != null) {
			Static42.aClass1_1.method1391();
		}
		if (Static95.aClass1_2 != null) {
			Static95.aClass1_2.method1391();
		}
		Static22.method391();
		Static20.method377();
		try {
			if (Static27.aClass10_3 != null) {
				Static27.aClass10_3.method184();
			}
			if (Static79.aClass10Array1 != null) {
				for (@Pc(56) int local56 = 0; local56 < Static79.aClass10Array1.length; local56++) {
					if (Static79.aClass10Array1[local56] != null) {
						Static79.aClass10Array1[local56].method184();
					}
				}
			}
			if (Static103.aClass10_4 != null) {
				Static103.aClass10_4.method184();
			}
		} catch (@Pc(87) IOException local87) {
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method275()) {
			return;
		}
		Static31.anInt1056 = Integer.parseInt(this.getParameter("worldid"));
		Static23.anInt733 = Integer.parseInt(this.getParameter("modewhat"));
		Static95.anInt2276 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static42.method843();
		} else {
			Static85.method1432();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static123.aBoolean129 = true;
		} else {
			Static123.aBoolean129 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static70.method1200();
			Static35.aClass53_468 = Static44.aClass53_561;
			Static87.anInt2095 = 1;
		}
		try {
			Static101.anInt2377 = Integer.parseInt(this.getParameter("js"));
			Static59.anInt1542 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(85) Exception local85) {
		}
		Static107.aString5 = this.getCodeBase().getHost();
		this.method284(Static23.anInt733 + 32);
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method293() {
		if (Static78.anInt1957 != 1000) {
			@Pc(12) boolean local12 = Static73.method1236();
			if (!local12) {
				this.method299();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method279() {
		Static120.anInt2798 = Static95.anInt2276 == 0 ? 43594 : Static31.anInt1056 + 40000;
		Static5.anInt191 = Static120.anInt2798;
		Static41.anInt1209 = Static95.anInt2276 == 0 ? 443 : Static31.anInt1056 + 50000;
		Static94.method1557();
		Static72.method1227(Static87.aCanvas1);
		Static73.method1237(Static87.aCanvas1);
		Static62.aClass38_1 = Static5.method116();
		if (Static62.aClass38_1 != null) {
			Static62.aClass38_1.method1441(Static87.aCanvas1);
		}
		Static10.anInt260 = Static6.anInt194;
		try {
			if (Static4.aClass6_1.aClass18_1 != null) {
				Static27.aClass10_3 = new Class10(Static4.aClass6_1.aClass18_1, 5200, 0);
				for (@Pc(60) int local60 = 0; local60 < 16; local60++) {
					Static79.aClass10Array1[local60] = new Class10(Static4.aClass6_1.aClass18Array1[local60], 6000, 0);
				}
				Static103.aClass10_4 = new Class10(Static4.aClass6_1.aClass18_2, 6000, 0);
				Static109.aClass17_4 = new Class17(255, Static27.aClass10_3, Static103.aClass10_4, 500000);
				Static4.aClass6_1.aClass18Array1 = null;
				Static4.aClass6_1.aClass18_1 = null;
				Static4.aClass6_1.aClass18_2 = null;
			}
		} catch (@Pc(107) IOException local107) {
			Static27.aClass10_3 = null;
			Static109.aClass17_4 = null;
			Static103.aClass10_4 = null;
		}
		if (Static95.anInt2276 != 0) {
			Static102.aBoolean102 = true;
		}
		Static7.aClass3_Sub1_Sub15_2 = new Class3_Sub1_Sub15();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method297(@OriginalArg(1) int arg0) {
		Static120.anInt2808 = 0;
		Static3.aClass37_1 = null;
		Static113.aClass22_8 = null;
		if (Static120.anInt2798 == Static5.anInt191) {
			Static5.anInt191 = Static41.anInt1209;
		} else {
			Static5.anInt191 = Static120.anInt2798;
		}
		Static4.anInt144++;
		if (Static4.anInt144 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static78.anInt1957 > 5) {
				Static42.anInt1221 = 3000;
			} else {
				this.method286("js5connect_full");
				Static78.anInt1957 = 1000;
			}
		} else if (Static4.anInt144 >= 2 && arg0 == 6) {
			this.method286("js5connect_outofdate");
			Static78.anInt1957 = 1000;
		} else if (Static4.anInt144 >= 4) {
			if (Static78.anInt1957 > 5) {
				Static42.anInt1221 = 3000;
			} else {
				this.method286("js5connect");
				Static78.anInt1957 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method299() {
		if (Static39.anInt1176 >= 4) {
			this.method286("js5crc");
			Static78.anInt1957 = 1000;
			return;
		}
		if (Static20.anInt691 >= 4) {
			if (Static78.anInt1957 <= 5) {
				this.method286("js5io");
				Static78.anInt1957 = 1000;
				return;
			}
			Static20.anInt691 = 3;
			Static42.anInt1221 = 3000;
		}
		if (Static42.anInt1221-- > 0) {
			return;
		}
		try {
			if (Static120.anInt2808 == 0) {
				Static113.aClass22_8 = Static4.aClass6_1.method128(Static107.aString5, Static5.anInt191);
				Static120.anInt2808++;
			}
			if (Static120.anInt2808 == 1) {
				if (Static113.aClass22_8.anInt864 == 2) {
					this.method297(-1);
					return;
				}
				if (Static113.aClass22_8.anInt864 == 1) {
					Static120.anInt2808++;
				}
			}
			if (Static120.anInt2808 == 2) {
				Static3.aClass37_1 = new Class37((Socket) Static113.aClass22_8.anObject2, Static4.aClass6_1);
				@Pc(105) Class3_Sub7 local105 = new Class3_Sub7(5);
				local105.method625(15);
				local105.method642(453);
				Static3.aClass37_1.method953(5, local105.aByteArray15);
				Static120.anInt2808++;
				Static119.aLong23 = Static89.method1462();
			}
			if (Static120.anInt2808 == 3) {
				if (Static78.anInt1957 <= 5 || Static3.aClass37_1.method949() > 0) {
					@Pc(164) int local164 = Static3.aClass37_1.method947();
					if (local164 != 0) {
						this.method297(local164);
						return;
					}
					Static120.anInt2808++;
				} else if (Static89.method1462() - Static119.aLong23 > 30000L) {
					this.method297(-2);
					return;
				}
			}
			if (Static120.anInt2808 == 4) {
				Static7.method129(Static3.aClass37_1, Static78.anInt1957 > 20);
				Static3.aClass37_1 = null;
				Static4.anInt144 = 0;
				Static120.anInt2808 = 0;
				Static113.aClass22_8 = null;
			}
		} catch (@Pc(200) IOException local200) {
			this.method297(-3);
		}
	}
}
