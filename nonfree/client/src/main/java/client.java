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
				Static74.method1693();
			}
			Static62.anInt1821 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static41.anInt2277 = 0;
			} else if (arg0[1].equals("office")) {
				Static41.anInt2277 = 1;
			} else if (arg0[1].equals("local")) {
				Static41.anInt2277 = 2;
			} else {
				Static74.method1693();
			}
			if (arg0[2].equals("live")) {
				Static39.anInt2100 = 0;
			} else if (arg0[2].equals("rc")) {
				Static39.anInt2100 = 1;
			} else if (arg0[2].equals("wip")) {
				Static39.anInt2100 = 2;
			} else {
				Static74.method1693();
			}
			if (arg0[3].equals("lowmem")) {
				Static85.method1626();
			} else if (arg0[3].equals("highmem")) {
				Static79.method1503();
			} else {
				Static74.method1693();
			}
			if (arg0[4].equals("free")) {
				Static68.aBoolean95 = false;
			} else if (arg0[4].equals("members")) {
				Static68.aBoolean95 = true;
			} else {
				Static74.method1693();
			}
			if (arg0[5].equals("english")) {
				Static122.anInt3151 = 0;
			} else if (arg0[5].equals("german")) {
				Static107.method1929();
				Static122.anInt3151 = 1;
			} else {
				Static74.method1693();
			}
			@Pc(150) client local150 = new client();
			local150.method307(InetAddress.getLocalHost(), Static39.anInt2100 + 32, "runescape");
		} catch (@Pc(164) Exception local164) {
			Static53.method1609(null, local164);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method299() {
		@Pc(4) boolean local4 = Static39.method1403();
		if (local4 && Static61.aBoolean88 && Static41.aClass15_3 != null) {
			Static41.aClass15_3.method1531();
		}
		if (Static46.aBoolean71) {
			Static46.method978(Static75.aCanvas1);
			Static121.method1624(Static75.aCanvas1);
			if (Static19.aClass21_1 != null) {
				Static19.aClass21_1.method566(Static75.aCanvas1);
			}
			this.method298();
			Static108.method1948(Static75.aCanvas1);
			Static87.method1686(Static75.aCanvas1);
			if (Static19.aClass21_1 != null) {
				Static19.aClass21_1.method569(Static75.aCanvas1);
			}
		}
		if (Static121.anInt2385 == 0) {
			Static115.method2091(null, Static40.aClass45_517, Static31.anInt926);
		} else if (Static121.anInt2385 == 5) {
			Static107.method1923(Static71.aClass5_Sub2_Sub6_Sub1_4, Static8.aClass5_Sub2_Sub6_Sub1_1);
		} else if (Static121.anInt2385 == 10) {
			Static107.method1923(Static71.aClass5_Sub2_Sub6_Sub1_4, Static8.aClass5_Sub2_Sub6_Sub1_1);
		} else if (Static121.anInt2385 == 20) {
			Static107.method1923(Static71.aClass5_Sub2_Sub6_Sub1_4, Static8.aClass5_Sub2_Sub6_Sub1_1);
		} else if (Static121.anInt2385 == 25) {
			@Pc(95) int local95;
			if (Static75.anInt2183 == 1) {
				if (Static30.anInt470 > Static66.anInt1898) {
					Static66.anInt1898 = Static30.anInt470;
				}
				local95 = (Static66.anInt1898 - Static30.anInt470) * 50 / Static66.anInt1898;
				Static59.method1216(Static39.method1443(new Class45[] { Static100.aClass45_1161, Static76.method1476(local95), Static49.aClass45_634 }), Static111.aClass45_1277, true);
			} else if (Static75.anInt2183 == 2) {
				if (Static99.anInt2658 < Static78.anInt2217) {
					Static99.anInt2658 = Static78.anInt2217;
				}
				local95 = (Static99.anInt2658 - Static78.anInt2217) * 50 / Static99.anInt2658 + 50;
				Static59.method1216(Static39.method1443(new Class45[] { Static100.aClass45_1161, Static76.method1476(local95), Static49.aClass45_634 }), Static111.aClass45_1277, true);
			} else {
				Static59.method1216(null, Static111.aClass45_1277, false);
			}
		} else if (Static121.anInt2385 == 30) {
			Static21.method441();
		} else if (Static121.anInt2385 == 35) {
			Static10.method218();
		} else if (Static121.anInt2385 == 40) {
			Static59.method1216(Static96.aClass45_1106, Static103.aClass45_1188, false);
		}
		Static108.anInt2839 = 0;
		Static119.anInt3094 = 0;
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method302()) {
			return;
		}
		Static62.anInt1821 = Integer.parseInt(this.getParameter("worldid"));
		Static39.anInt2100 = Integer.parseInt(this.getParameter("modewhat"));
		Static41.anInt2277 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static85.method1626();
		} else {
			Static79.method1503();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static68.aBoolean95 = true;
		} else {
			Static68.aBoolean95 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static107.method1929();
			Static122.anInt3151 = 1;
		}
		this.method308(Static39.anInt2100 + 32);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method304() {
		if (Static68.aClass1_1 != null) {
			Static68.aClass1_1.aBoolean1 = false;
		}
		Static68.aClass1_1 = null;
		if (Static104.aClass7_3 != null) {
			Static104.aClass7_3.method73();
			Static104.aClass7_3 = null;
		}
		Static108.method1944();
		Static77.method1478();
		Static19.aClass21_1 = null;
		if (Static41.aClass15_3 != null) {
			Static41.aClass15_3.method1520();
		}
		if (Static122.aClass15_4 != null) {
			Static122.aClass15_4.method1520();
		}
		Static99.method1817();
		Static45.method965();
		try {
			if (Static59.aClass2_2 != null) {
				Static59.aClass2_2.method13();
			}
			if (Static70.aClass2Array1 != null) {
				for (@Pc(52) int local52 = 0; local52 < Static70.aClass2Array1.length; local52++) {
					if (Static70.aClass2Array1[local52] != null) {
						Static70.aClass2Array1[local52].method13();
					}
				}
			}
			if (Static7.aClass2_1 != null) {
				Static7.aClass2_1.method13();
			}
		} catch (@Pc(79) IOException local79) {
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method311() {
		if (Static121.anInt2385 != 1000) {
			@Pc(10) boolean local10 = Static114.method2085();
			if (!local10) {
				this.method312();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method312() {
		if (Static5.anInt110 >= 4) {
			this.method295("js5crc");
			Static121.anInt2385 = 1000;
			return;
		}
		if (Static45.anInt1314 >= 4) {
			if (Static121.anInt2385 <= 5) {
				this.method295("js5io");
				Static121.anInt2385 = 1000;
				return;
			}
			Static1.anInt11 = 3000;
			Static45.anInt1314 = 3;
		}
		if (Static1.anInt11-- > 0) {
			return;
		}
		try {
			if (Static41.anInt2274 == 0) {
				Static120.aClass46_5 = Static96.aClass77_3.method2168(Static30.anInt491);
				Static41.anInt2274++;
			}
			if (Static41.anInt2274 == 1) {
				if (Static120.aClass46_5.anInt1964 == 2) {
					this.method313(-1);
					return;
				}
				if (Static120.aClass46_5.anInt1964 == 1) {
					Static41.anInt2274++;
				}
			}
			if (Static41.anInt2274 == 2) {
				Static62.aClass7_2 = new Class7((Socket) Static120.aClass46_5.anObject4, Static96.aClass77_3);
				@Pc(107) Class5_Sub9 local107 = new Class5_Sub9(5);
				local107.method1428(15);
				local107.method1413(451);
				Static62.aClass7_2.method80(5, local107.aByteArray28);
				Static41.anInt2274++;
				Static12.aLong147 = Static62.method1228();
			}
			if (Static41.anInt2274 == 3) {
				if (Static121.anInt2385 <= 5 || Static62.aClass7_2.method72() > 0) {
					@Pc(157) int local157 = Static62.aClass7_2.method74();
					if (local157 != 0) {
						this.method313(local157);
						return;
					}
					Static41.anInt2274++;
				} else if (Static62.method1228() - Static12.aLong147 > 30000L) {
					this.method313(-2);
					return;
				}
			}
			if (Static41.anInt2274 == 4) {
				Static97.method1803(Static121.anInt2385 > 20, Static62.aClass7_2);
				Static62.aClass7_2 = null;
				Static41.anInt2274 = 0;
				Static120.aClass46_5 = null;
				Static45.anInt1313 = 0;
			}
		} catch (@Pc(195) IOException local195) {
			this.method313(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method313(@OriginalArg(0) int arg0) {
		Static45.anInt1313++;
		if (Static36.anInt1055 == Static30.anInt491) {
			Static30.anInt491 = Static16.anInt497;
		} else {
			Static30.anInt491 = Static36.anInt1055;
		}
		Static120.aClass46_5 = null;
		Static41.anInt2274 = 0;
		Static62.aClass7_2 = null;
		if (Static45.anInt1313 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static121.anInt2385 <= 5) {
				this.method295("js5connect_full");
				Static121.anInt2385 = 1000;
			} else {
				Static1.anInt11 = 3000;
			}
		} else if (Static45.anInt1313 >= 2 && arg0 == 6) {
			this.method295("js5connect_outofdate");
			Static121.anInt2385 = 1000;
		} else if (Static45.anInt1313 >= 4) {
			if (Static121.anInt2385 <= 5) {
				this.method295("js5connect");
				Static121.anInt2385 = 1000;
			} else {
				Static1.anInt11 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method293() {
		Static16.method310();
		Static68.method1294();
		Static30.method294();
		Static74.method1694();
		Static52.method2153();
		Static1.method3();
		Static39.method1438();
		Static5.method81();
		Static36.method774();
		Static2.method18();
		Static103.method1896();
		Static85.method1625();
		Static72.method1465();
		Static22.method507();
		Static43.method887();
		Static51.method1116();
		Static48.method1103();
		Static11.method231();
		Static44.method955();
		Static42.method567();
		Static98.method1808();
		Static112.method2028();
		Static41.method1522();
		Static107.method1924();
		Static40.method871();
		Static55.method1150();
		Static121.method1623();
		Static120.method2146();
		Static117.method2117();
		Static12.method2141();
		Static47.method984();
		Static35.method696();
		Static99.method1816();
		Static20.method416();
		Static83.method1574();
		Static97.method1802();
		Static49.method1105();
		Static119.method2133();
		Static110.method1982();
		Static60.method1220();
		Static70.method1358();
		Static53.method1608();
		Static67.method1291();
		Static91.method1708();
		Static115.method2088();
		Static64.method1259();
		Static94.method1783();
		Static78.method1483();
		Static96.method1799();
		Static62.method1231();
		Static92.method2114();
		Static101.method763();
		Static90.method1704();
		Static14.method270();
		Static29.method630();
		Static80.method1508();
		Static21.method439();
		Static105.method1908();
		Static75.method1473();
		Static79.method1502();
		Static77.method1481();
		Static86.method1659();
		Static118.method1863();
		Static81.method1516();
		Static23.method544();
		Static3.method69();
		Static26.method586();
		Static31.method663();
		Static56.method1168();
		Static111.method1987();
		Static7.method134();
		Static19.method384();
		Static69.method1351();
		Static27.method609();
		Static8.method171();
		Static93.method1727();
		Static109.method1963();
		Static114.method2086();
		Static6.method113();
		Static108.method1943();
		Static87.method1684();
		Static58.method1184();
		Static73.method1468();
		Static50.method1111();
		Static25.method558();
		Static33.method685();
		Static28.method625();
		Static46.method975();
		Static100.method1839();
		Static104.method1902();
		Static38.method799();
		Static15.method272();
		Static59.method1217();
		Static71.method1387();
		Static34.method690();
		Static57.method1174();
		Static13.method264();
		Static9.method216();
		Static66.method1289();
		Static116.method2101();
		Static37.method794();
		Static54.method1131();
		Static89.method1702();
		Static122.method2155();
		Static32.method675();
		Static84.method1588();
		Static4.method70();
		Static76.method1477();
		Static45.method964();
		Static17.method323();
		Static18.method365();
		Static65.method1266();
		Static88.method1687();
		Static113.method2068();
		Static106.method1920();
		Static24.method554();
		Static10.method219();
		Static63.method1255();
		Static95.method1788();
		Static82.method1545();
		Static61.method1226();
		Static102.method1891();
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method306() {
		Static3.anInt94++;
		this.method311();
		Static13.method267();
		Static2.method16();
		Static104.method1900();
		Static25.method557();
		Static35.method697();
		if (Static19.aClass21_1 != null) {
			@Pc(34) int local34 = Static19.aClass21_1.method568();
			Static119.anInt3094 += local34;
			Static28.anInt882 = local34;
		}
		if (Static121.anInt2385 == 0) {
			Static29.method626();
			Static100.method1841();
		} else if (Static121.anInt2385 == 5) {
			Static29.method632();
			Static29.method626();
			Static100.method1841();
		} else if (Static121.anInt2385 == 10) {
			Static29.method632();
		} else if (Static121.anInt2385 == 20) {
			Static29.method632();
			Static41.method1525();
		} else if (Static121.anInt2385 == 25) {
			Static122.method2157();
		}
		if (Static121.anInt2385 == 30) {
			Static1.method6();
		} else if (Static121.anInt2385 == 35) {
			Static1.method6();
		} else if (Static121.anInt2385 == 40) {
			Static41.method1525();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method305() {
		Static36.anInt1055 = Static41.anInt2277 == 0 ? 43594 : Static62.anInt1821 + 40000;
		Static16.anInt497 = Static41.anInt2277 == 0 ? 443 : Static62.anInt1821 + 50000;
		Static30.anInt491 = Static36.anInt1055;
		Static41.method1529();
		Static108.method1948(Static75.aCanvas1);
		Static87.method1686(Static75.aCanvas1);
		Static19.aClass21_1 = Static84.method1592();
		if (Static19.aClass21_1 != null) {
			Static19.aClass21_1.method569(Static75.aCanvas1);
		}
		Static39.anInt2116 = Static123.anInt3158;
		try {
			if (Static96.aClass77_3.aClass72_2 != null) {
				Static59.aClass2_2 = new Class2(Static96.aClass77_3.aClass72_2, 5200, 0);
				for (@Pc(63) int local63 = 0; local63 < 16; local63++) {
					Static70.aClass2Array1[local63] = new Class2(Static96.aClass77_3.aClass72Array1[local63], 6000, 0);
				}
				Static7.aClass2_1 = new Class2(Static96.aClass77_3.aClass72_3, 6000, 0);
				Static76.aClass68_4 = new Class68(255, Static59.aClass2_2, Static7.aClass2_1, 500000);
				Static96.aClass77_3.aClass72_3 = null;
				Static96.aClass77_3.aClass72Array1 = null;
				Static96.aClass77_3.aClass72_2 = null;
			}
		} catch (@Pc(108) IOException local108) {
			Static59.aClass2_2 = null;
			Static7.aClass2_1 = null;
			Static76.aClass68_4 = null;
		}
		if (Static41.anInt2277 != 0) {
			Static49.aBoolean80 = true;
		}
		Static77.aClass5_Sub2_Sub8_4 = new Class5_Sub2_Sub8();
	}
}
