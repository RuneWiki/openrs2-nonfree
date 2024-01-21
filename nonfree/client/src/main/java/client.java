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

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static82.method1502();
			}
			Static115.anInt3134 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static124.anInt3327 = 0;
			} else if (arg0[1].equals("office")) {
				Static124.anInt3327 = 1;
			} else if (arg0[1].equals("local")) {
				Static124.anInt3327 = 2;
			} else {
				Static82.method1502();
			}
			if (arg0[2].equals("live")) {
				Static31.anInt1027 = 0;
			} else if (arg0[2].equals("rc")) {
				Static31.anInt1027 = 1;
			} else if (arg0[2].equals("wip")) {
				Static31.anInt1027 = 2;
			} else {
				Static82.method1502();
			}
			if (arg0[3].equals("lowmem")) {
				Static36.method867();
			} else if (arg0[3].equals("highmem")) {
				Static123.method2165();
			} else {
				Static82.method1502();
			}
			if (arg0[4].equals("free")) {
				Static30.aBoolean49 = false;
			} else if (arg0[4].equals("members")) {
				Static30.aBoolean49 = true;
			} else {
				Static82.method1502();
			}
			if (arg0[5].equals("english")) {
				Static65.anInt1845 = 0;
			} else if (arg0[5].equals("german")) {
				Static103.method2133();
				Static65.anInt1845 = 1;
			} else {
				Static82.method1502();
			}
			@Pc(150) client local150 = new client();
			local150.method498("runescape", InetAddress.getLocalHost(), Static31.anInt1027 + 32);
		} catch (@Pc(165) Exception local165) {
			Static92.method1674(local165, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method489()) {
			return;
		}
		Static115.anInt3134 = Integer.parseInt(this.getParameter("worldid"));
		Static31.anInt1027 = Integer.parseInt(this.getParameter("modewhat"));
		Static124.anInt3327 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static36.method867();
		} else {
			Static123.method2165();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static30.aBoolean49 = true;
		} else {
			Static30.aBoolean49 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static103.method2133();
			Static65.anInt1845 = 1;
		}
		this.method494(Static31.anInt1027 + 32);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method486() {
		Static73.anInt2064++;
		this.method504();
		Static56.method1127();
		Static58.method1141();
		Static44.method959();
		Static66.method2127();
		Static120.method2142();
		if (Static41.aClass58_1 != null) {
			@Pc(30) int local30 = Static41.aClass58_1.method1569();
			Static35.anInt1173 = local30;
			Static74.anInt2071 += local30;
		}
		if (Static46.anInt1432 == 0) {
			Static88.method1593();
			Static79.method1452();
		} else if (Static46.anInt1432 == 5) {
			Static46.method997();
			Static88.method1593();
			Static79.method1452();
		} else if (Static46.anInt1432 == 10) {
			Static46.method997();
		} else if (Static46.anInt1432 == 20) {
			Static46.method997();
			Static24.method587();
		} else if (Static46.anInt1432 == 25) {
			Static67.method1215();
		}
		if (Static46.anInt1432 == 30) {
			Static105.method1898();
		} else if (Static46.anInt1432 == 35) {
			Static105.method1898();
		} else if (Static46.anInt1432 == 40) {
			Static24.method587();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method484() {
		Static98.anInt2773 = Static124.anInt3327 == 0 ? 443 : Static115.anInt3134 + 50000;
		Static51.anInt1568 = Static124.anInt3327 == 0 ? 43594 : Static115.anInt3134 + 40000;
		Static2.anInt22 = Static51.anInt1568;
		Static46.method988();
		Static67.method1216(Static38.aCanvas1);
		Static53.method2065(Static38.aCanvas1);
		Static41.aClass58_1 = Static20.method507();
		if (Static41.aClass58_1 != null) {
			Static41.aClass58_1.method1570(Static38.aCanvas1);
		}
		Static103.anInt3214 = Static8.anInt182;
		try {
			if (Static4.aClass8_1.aClass9_2 != null) {
				Static111.aClass78_4 = new Class78(Static4.aClass8_1.aClass9_2, 5200, 0);
				for (@Pc(61) int local61 = 0; local61 < 16; local61++) {
					Static53.aClass78Array10[local61] = new Class78(Static4.aClass8_1.aClass9Array1[local61], 6000, 0);
				}
				Static44.aClass78_1 = new Class78(Static4.aClass8_1.aClass9_1, 6000, 0);
				Static31.aClass53_4 = new Class53(255, Static111.aClass78_4, Static44.aClass78_1, 500000);
				Static4.aClass8_1.aClass9Array1 = null;
				Static4.aClass8_1.aClass9_1 = null;
				Static4.aClass8_1.aClass9_2 = null;
			}
		} catch (@Pc(108) IOException local108) {
			Static31.aClass53_4 = null;
			Static44.aClass78_1 = null;
			Static111.aClass78_4 = null;
		}
		if (Static124.anInt3327 != 0) {
			Static29.aBoolean48 = true;
		}
		Static54.aClass6_Sub3_Sub17_4 = new Class6_Sub3_Sub17();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method502(@OriginalArg(0) int arg0) {
		Static20.anInt649++;
		if (Static2.anInt22 == Static51.anInt1568) {
			Static2.anInt22 = Static98.anInt2773;
		} else {
			Static2.anInt22 = Static51.anInt1568;
		}
		Static72.anInt2044 = 0;
		Static58.aClass20_5 = null;
		Static82.aClass47_3 = null;
		if (Static20.anInt649 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static46.anInt1432 > 5) {
				Static90.anInt2544 = 3000;
			} else {
				this.method491("js5connect_full");
				Static46.anInt1432 = 1000;
			}
		} else if (Static20.anInt649 >= 2 && arg0 == 6) {
			this.method491("js5connect_outofdate");
			Static46.anInt1432 = 1000;
		} else if (Static20.anInt649 >= 4) {
			if (Static46.anInt1432 <= 5) {
				this.method491("js5connect");
				Static46.anInt1432 = 1000;
			} else {
				Static90.anInt2544 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method497() {
		Static19.method499();
		Static98.method1828();
		Static113.method496();
		Static117.method2003();
		Static40.method1426();
		Static70.method1364();
		Static11.method1299();
		Static71.method1374();
		Static7.method121();
		Static124.method2184();
		Static77.method1444();
		Static32.method837();
		Static68.method1346();
		Static16.method447();
		Static28.method665();
		Static46.method986();
		Static86.method1554();
		Static1.method8();
		Static120.method2139();
		Static84.method1572();
		Static2.method26();
		Static17.method1716();
		Static67.method1211();
		Static29.method717();
		Static42.method926();
		Static23.method1551();
		Static109.method2033();
		Static14.method365();
		Static66.method2122();
		Static31.method804();
		Static78.method1448();
		Static73.method1391();
		Static26.method636();
		Static9.method227();
		Static5.method35();
		Static94.method1708();
		Static39.method885();
		Static91.method1669();
		Static34.method844();
		Static118.method2117();
		Static53.method2064();
		Static30.method722();
		Static50.method1041();
		Static33.method841();
		Static57.method1132();
		Static62.method1194();
		Static100.method1838();
		Static64.method1205();
		Static89.method1606();
		Static103.method2130();
		Static43.method112();
		Static38.method878();
		Static99.method1834();
		Static106.method1924();
		Static4.method34();
		Static35.method848();
		Static58.method1139();
		Static15.method376();
		Static111.method2045();
		Static92.method1679();
		Static115.method2093();
		Static79.method1451();
		Static107.method1986();
		Static121.method1981();
		Static56.method1128();
		Static72.method1381();
		Static87.method1564();
		Static108.method2018();
		Static93.method1698();
		Static61.method1187();
		Static13.method345();
		Static88.method1596();
		Static24.method585();
		Static81.method1486();
		Static55.method1114();
		Static44.method953();
		Static59.method1160();
		Static75.method1418();
		Static36.method870();
		Static105.method1901();
		Static21.method526();
		Static114.method2077();
		Static45.method983();
		Static10.method264();
		Static22.method530();
		Static116.method2109();
		Static20.method510();
		Static41.method902();
		Static101.method1851();
		Static54.method1093();
		Static69.method1361();
		Static123.method2171();
		Static3.method29();
		Static47.method1029();
		Static90.method1653();
		Static49.method1039();
		Static48.method1032();
		Static97.method1790();
		Static112.method2067();
		Static51.method1063();
		Static6.method61();
		Static102.method1854();
		Static37.method877();
		Static80.method1464();
		Static76.method1439();
		Static85.method1862();
		Static18.method463();
		Static12.method341();
		Static119.method2119();
		Static95.method1727();
		Static83.method1503();
		Static110.method2034();
		Static104.method1869();
		Static96.method1779();
		Static27.method650();
		Static52.method1072();
		Static25.method598();
		Static60.method1176();
		Static65.method1208();
		Static122.method2157();
		Static63.method1202();
		Static74.method1398();
		Static82.method1500();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method503() {
		if (Static57.anInt1728 >= 4) {
			this.method491("js5crc");
			Static46.anInt1432 = 1000;
			return;
		}
		if (Static67.anInt1854 >= 4) {
			if (Static46.anInt1432 <= 5) {
				this.method491("js5io");
				Static46.anInt1432 = 1000;
				return;
			}
			Static90.anInt2544 = 3000;
			Static67.anInt1854 = 3;
		}
		if (Static90.anInt2544-- > 0) {
			return;
		}
		try {
			if (Static72.anInt2044 == 0) {
				Static58.aClass20_5 = Static4.aClass8_1.method141(Static2.anInt22);
				Static72.anInt2044++;
			}
			if (Static72.anInt2044 == 1) {
				if (Static58.aClass20_5.anInt931 == 2) {
					this.method502(-1);
					return;
				}
				if (Static58.aClass20_5.anInt931 == 1) {
					Static72.anInt2044++;
				}
			}
			if (Static72.anInt2044 == 2) {
				Static82.aClass47_3 = new Class47((Socket) Static58.aClass20_5.anObject2, Static4.aClass8_1);
				@Pc(97) Class6_Sub4 local97 = new Class6_Sub4(5);
				local97.method1330(15);
				local97.method1292(452);
				Static82.aClass47_3.method1377(5, local97.aByteArray27);
				Static72.anInt2044++;
				Static88.aLong64 = Static89.method1607();
			}
			if (Static72.anInt2044 == 3) {
				if (Static46.anInt1432 <= 5 || Static82.aClass47_3.method1380() > 0) {
					@Pc(142) int local142 = Static82.aClass47_3.method1375();
					if (local142 != 0) {
						this.method502(local142);
						return;
					}
					Static72.anInt2044++;
				} else if (Static89.method1607() - Static88.aLong64 > 30000L) {
					this.method502(-2);
					return;
				}
			}
			if (Static72.anInt2044 == 4) {
				Static29.method716(Static46.anInt1432 > 20, Static82.aClass47_3);
				Static82.aClass47_3 = null;
				Static72.anInt2044 = 0;
				Static20.anInt649 = 0;
				Static58.aClass20_5 = null;
			}
		} catch (@Pc(192) IOException local192) {
			this.method502(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method504() {
		if (Static46.anInt1432 != 1000) {
			@Pc(15) boolean local15 = Static94.method1709();
			if (!local15) {
				this.method503();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	@Override
	protected void method493() {
		@Pc(8) boolean local8 = Static21.method529();
		if (local8 && Static64.aBoolean100 && Static54.aClass10_1 != null) {
			Static54.aClass10_1.method1721();
		}
		if (Static49.aBoolean75) {
			Static13.method350(Static38.aCanvas1);
			Static94.method1710(Static38.aCanvas1);
			if (Static41.aClass58_1 != null) {
				Static41.aClass58_1.method1576(Static38.aCanvas1);
			}
			this.method490();
			Static67.method1216(Static38.aCanvas1);
			Static53.method2065(Static38.aCanvas1);
			if (Static41.aClass58_1 != null) {
				Static41.aClass58_1.method1570(Static38.aCanvas1);
			}
		}
		if (Static46.anInt1432 == 0) {
			Static5.method41(Static46.anInt1441, Static49.aClass63_794, null);
		} else if (Static46.anInt1432 == 5) {
			Static1.method6(Static92.aClass6_Sub3_Sub3_Sub1_3, Static114.aClass6_Sub3_Sub3_Sub1_4);
		} else if (Static46.anInt1432 == 10) {
			Static1.method6(Static92.aClass6_Sub3_Sub3_Sub1_3, Static114.aClass6_Sub3_Sub3_Sub1_4);
		} else if (Static46.anInt1432 == 20) {
			Static1.method6(Static92.aClass6_Sub3_Sub3_Sub1_3, Static114.aClass6_Sub3_Sub3_Sub1_4);
		} else if (Static46.anInt1432 == 25) {
			@Pc(87) int local87;
			if (Static118.anInt3163 == 1) {
				if (Static52.anInt1586 < Static1.anInt7) {
					Static52.anInt1586 = Static1.anInt7;
				}
				local87 = (Static52.anInt1586 - Static1.anInt7) * 50 / Static52.anInt1586;
				Static93.method1703(true, Static15.method374(new Class63[] { Static94.aClass63_1389, Static118.method2114(local87), Static37.aClass63_662 }), Static110.aClass63_1649);
			} else if (Static118.anInt3163 == 2) {
				if (Static52.anInt1583 > Static76.anInt2137) {
					Static76.anInt2137 = Static52.anInt1583;
				}
				local87 = (Static76.anInt2137 - Static52.anInt1583) * 50 / Static76.anInt2137 + 50;
				Static93.method1703(true, Static15.method374(new Class63[] { Static94.aClass63_1389, Static118.method2114(local87), Static37.aClass63_662 }), Static110.aClass63_1649);
			} else {
				Static93.method1703(false, null, Static110.aClass63_1649);
			}
		} else if (Static46.anInt1432 == 30) {
			Static24.method586();
		} else if (Static46.anInt1432 == 35) {
			Static123.method2169();
		} else if (Static46.anInt1432 == 40) {
			Static93.method1703(false, Static19.aClass63_409, Static120.aClass63_1769);
		}
		Static11.anInt1969 = 0;
		Static74.anInt2071 = 0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method487() {
		if (Static2.aClass45_1 != null) {
			Static2.aClass45_1.aBoolean106 = false;
		}
		Static2.aClass45_1 = null;
		if (Static100.aClass47_4 != null) {
			Static100.aClass47_4.method1378();
			Static100.aClass47_4 = null;
		}
		Static22.method532();
		Static51.method1066();
		Static41.aClass58_1 = null;
		if (Static54.aClass10_1 != null) {
			Static54.aClass10_1.method1718();
		}
		if (Static97.aClass10_2 != null) {
			Static97.aClass10_2.method1718();
		}
		Static29.method710();
		Static2.method19();
		try {
			if (Static111.aClass78_4 != null) {
				Static111.aClass78_4.method2186();
			}
			if (Static53.aClass78Array10 != null) {
				for (@Pc(53) int local53 = 0; local53 < Static53.aClass78Array10.length; local53++) {
					if (Static53.aClass78Array10[local53] != null) {
						Static53.aClass78Array10[local53].method2186();
					}
				}
			}
			if (Static44.aClass78_1 != null) {
				Static44.aClass78_1.method2186();
			}
		} catch (@Pc(76) IOException local76) {
		}
	}
}
