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
				Static65.method1340();
			}
			Static22.anInt921 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static73.anInt1985 = 0;
			} else if (arg0[1].equals("office")) {
				Static73.anInt1985 = 1;
			} else if (arg0[1].equals("local")) {
				Static73.anInt1985 = 2;
			} else {
				Static65.method1340();
			}
			if (arg0[2].equals("live")) {
				Static73.anInt1981 = 0;
			} else if (arg0[2].equals("rc")) {
				Static73.anInt1981 = 1;
			} else if (arg0[2].equals("wip")) {
				Static73.anInt1981 = 2;
			} else {
				Static65.method1340();
			}
			if (arg0[3].equals("lowmem")) {
				Static98.method1660();
			} else if (arg0[3].equals("highmem")) {
				Static12.method1737();
			} else {
				Static65.method1340();
			}
			if (arg0[4].equals("free")) {
				Static40.aBoolean87 = false;
			} else if (arg0[4].equals("members")) {
				Static40.aBoolean87 = true;
			} else {
				Static65.method1340();
			}
			if (arg0[5].equals("english")) {
				Static62.anInt1877 = 0;
			} else if (arg0[5].equals("german")) {
				Static90.method1574();
				Static62.anInt1877 = 1;
			} else {
				Static65.method1340();
			}
			@Pc(154) client local154 = new client();
			local154.method490("runescape", Static73.anInt1981 + 32, InetAddress.getLocalHost());
		} catch (@Pc(169) Exception local169) {
			Static10.method1681(null, local169);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method495(@OriginalArg(1) int arg0) {
		if (Static15.anInt694 == Static29.anInt1100) {
			Static15.anInt694 = Static5.anInt405;
		} else {
			Static15.anInt694 = Static29.anInt1100;
		}
		Static56.aClass65_2 = null;
		Static113.aClass18_9 = null;
		Static12.anInt2644++;
		Static12.anInt2643 = 0;
		if (Static12.anInt2644 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static85.anInt2262 > 5) {
				Static34.anInt1271 = 3000;
			} else {
				this.method481("js5connect_full");
				Static85.anInt2262 = 1000;
			}
		} else if (Static12.anInt2644 >= 2 && arg0 == 6) {
			this.method481("js5connect_outofdate");
			Static85.anInt2262 = 1000;
		} else if (Static12.anInt2644 >= 4) {
			if (Static85.anInt2262 <= 5) {
				this.method481("js5connect");
				Static85.anInt2262 = 1000;
			} else {
				Static34.anInt1271 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method482() {
		Static69.anInt2806++;
		this.method499();
		Static22.method602();
		Static60.method1286();
		Static38.method945();
		Static83.method1511();
		Static108.method1764();
		if (Static85.anInt2262 == 0) {
			Static20.method598();
			Static99.method1669();
		} else if (Static85.anInt2262 == 5) {
			Static20.method598();
			Static99.method1669();
		} else if (Static85.anInt2262 == 10) {
			Static99.method1670();
		} else if (Static85.anInt2262 == 20) {
			Static99.method1670();
			Static25.method718();
		} else if (Static85.anInt2262 == 25) {
			Static84.method1530();
		}
		if (Static85.anInt2262 == 30) {
			Static109.method1791();
		} else if (Static85.anInt2262 == 35) {
			Static109.method1791();
		} else if (Static85.anInt2262 == 40) {
			Static25.method718();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method499() {
		if (Static85.anInt2262 != 1000) {
			@Pc(10) boolean local10 = Static46.method1048();
			if (!local10) {
				this.method500();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method494() {
		if (Static112.aBoolean160) {
			Static33.method860(Static103.aCanvas1);
			Static90.method1577(Static103.aCanvas1);
			this.method493();
			Static83.method1514(Static103.aCanvas1);
			Static38.method947(Static103.aCanvas1);
		}
		if (Static85.anInt2262 == 0) {
			Static48.method1071(Static112.anInt2804, null, Static104.aClass1_1598);
		} else if (Static85.anInt2262 == 5) {
			Static88.method1563(Static97.aClass2_Sub1_Sub2_Sub1_3, Static97.aClass2_Sub1_Sub2_Sub1_2);
		} else if (Static85.anInt2262 == 10) {
			Static88.method1563(Static97.aClass2_Sub1_Sub2_Sub1_3, Static97.aClass2_Sub1_Sub2_Sub1_2);
		} else if (Static85.anInt2262 == 20) {
			Static88.method1563(Static97.aClass2_Sub1_Sub2_Sub1_3, Static97.aClass2_Sub1_Sub2_Sub1_2);
		} else if (Static85.anInt2262 == 25) {
			@Pc(68) int local68;
			if (Static113.anInt2242 == 1) {
				if (Static65.anInt1940 > Static31.anInt1206) {
					Static31.anInt1206 = Static65.anInt1940;
				}
				local68 = (Static31.anInt1206 - Static65.anInt1940) * 50 / Static31.anInt1206;
				Static85.method1537(Static112.aClass1_2901, true, Static97.method1655(new Class1[] { Static5.aClass1_288, Static43.method994(local68), Static57.aClass1_1842 }));
			} else if (Static113.anInt2242 == 2) {
				if (Static79.anInt2096 > Static48.anInt1608) {
					Static48.anInt1608 = Static79.anInt2096;
				}
				local68 = (Static48.anInt1608 - Static79.anInt2096) * 50 / Static48.anInt1608 + 50;
				Static85.method1537(Static112.aClass1_2901, true, Static97.method1655(new Class1[] { Static5.aClass1_288, Static43.method994(local68), Static57.aClass1_1842 }));
			} else {
				Static85.method1537(Static112.aClass1_2901, false, null);
			}
		} else if (Static85.anInt2262 == 30) {
			Static54.method1231();
		} else if (Static85.anInt2262 == 35) {
			Static8.method298();
		} else if (Static85.anInt2262 == 40) {
			Static85.method1537(Static109.aClass1_2875, false, Static67.aClass1_2871);
		}
		Static109.anInt2768 = 0;
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method500() {
		if (Static62.anInt1863 >= 4) {
			this.method481("js5crc");
			Static85.anInt2262 = 1000;
			return;
		}
		if (Static14.anInt681 >= 4) {
			if (Static85.anInt2262 <= 5) {
				this.method481("js5io");
				Static85.anInt2262 = 1000;
				return;
			}
			Static14.anInt681 = 3;
			Static34.anInt1271 = 3000;
		}
		if (Static34.anInt1271-- > 0) {
			return;
		}
		try {
			if (Static12.anInt2643 == 0) {
				Static113.aClass18_9 = Static34.aClass34_4.method1263(Static15.anInt694);
				Static12.anInt2643++;
			}
			if (Static12.anInt2643 == 1) {
				if (Static113.aClass18_9.anInt1028 == 2) {
					this.method495(-1);
					return;
				}
				if (Static113.aClass18_9.anInt1028 == 1) {
					Static12.anInt2643++;
				}
			}
			if (Static12.anInt2643 == 2) {
				Static56.aClass65_2 = new Class65((Socket) Static113.aClass18_9.anObject3, Static34.aClass34_4);
				@Pc(101) Class2_Sub3 local101 = new Class2_Sub3(5);
				local101.method788(15);
				local101.method829(435);
				Static56.aClass65_2.method1759(5, local101.aByteArray7);
				Static12.anInt2643++;
				Static33.aLong32 = Static85.method1534();
			}
			if (Static12.anInt2643 == 3) {
				if (Static85.anInt2262 <= 5 || Static56.aClass65_2.method1763() > 0) {
					@Pc(157) int local157 = Static56.aClass65_2.method1765();
					if (local157 != 0) {
						this.method495(local157);
						return;
					}
					Static12.anInt2643++;
				} else if (Static85.method1534() - Static33.aLong32 > 30000L) {
					this.method495(-2);
					return;
				}
			}
			if (Static12.anInt2643 == 4) {
				Static27.method725(Static56.aClass65_2, Static85.anInt2262 > 20);
				Static113.aClass18_9 = null;
				Static12.anInt2643 = 0;
				Static56.aClass65_2 = null;
				Static12.anInt2644 = 0;
			}
		} catch (@Pc(190) IOException local190) {
			this.method495(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method483() {
		if (Static21.aClass41_1 != null) {
			Static21.aClass41_1.aBoolean106 = false;
		}
		Static21.aClass41_1 = null;
		if (Static50.aClass65_1 != null) {
			Static50.aClass65_1.method1758();
			Static50.aClass65_1 = null;
		}
		Static96.method1630();
		Static22.method609();
		Static60.method1280();
		Static99.method1666();
		Static37.method929();
		Static87.method1559();
		try {
			if (Static25.aClass68_1 != null) {
				Static25.aClass68_1.method1813();
			}
			if (Static41.aClass68Array1 != null) {
				for (@Pc(47) int local47 = 0; local47 < Static41.aClass68Array1.length; local47++) {
					if (Static41.aClass68Array1[local47] != null) {
						Static41.aClass68Array1[local47].method1813();
					}
				}
			}
			if (Static57.aClass68_2 != null) {
				Static57.aClass68_2.method1813();
			}
		} catch (@Pc(72) IOException local72) {
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method480()) {
			return;
		}
		Static22.anInt921 = Integer.parseInt(this.getParameter("worldid"));
		Static73.anInt1981 = Integer.parseInt(this.getParameter("modewhat"));
		Static73.anInt1985 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static98.method1660();
		} else {
			Static12.method1737();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static40.aBoolean87 = true;
		} else {
			Static40.aBoolean87 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static90.method1574();
			Static62.anInt1877 = 1;
		}
		this.method484(Static73.anInt1981 + 32);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method475() {
		Static17.method501();
		Static1.method34();
		Static55.method477();
		Static66.method1586();
		Static113.method1523();
		Static68.method1349();
		Static7.method822();
		Static108.method1760();
		Static101.method1715();
		Static112.method1814();
		Static91.method1579();
		Static109.method1792();
		Static31.method837();
		Static9.method361();
		Static3.method146();
		Static5.method204();
		Static2.method122();
		Static76.method1433();
		Static83.method1513();
		Static81.method1491();
		Static57.method1242();
		Static67.method1787();
		Static20.method597();
		Static37.method943();
		Static43.method988();
		Static69.method1821();
		Static34.method864();
		Static82.method1497();
		Static13.method434();
		Static42.method976();
		Static75.method1401();
		Static65.method1341();
		Static38.method944();
		Static47.method1052();
		Static28.method738();
		Static32.method846();
		Static59.method1269();
		Static107.method1779();
		Static15.method452();
		Static88.method1564();
		Static46.method1050();
		Static87.method1558();
		Static16.method454();
		Static89.method1565();
		Static103.method1723();
		Static85.method1536();
		Static39.method1775();
		Static10.method1692();
		Static73.method1373();
		Static60.method1281();
		Static12.method1741();
		Static90.method1573();
		Static99.method1671();
		Static110.method1794();
		Static54.method1222();
		Static86.method1554();
		Static84.method1532();
		Static24.method692();
		Static92.method1131();
		Static71.method1364();
		Static45.method1022();
		Static27.method729();
		Static29.method754();
		Static64.method1333();
		Static79.method1461();
		Static44.method1011();
		Static96.method1631();
		Static95.method1610();
		Static25.method714();
		Static30.method775();
		Static80.method1484();
		Static63.method1312();
		Static74.method1385();
		Static111.method1799();
		Static98.method1662();
		Static8.method297();
		Static11.method411();
		Static14.method447();
		Static6.method211();
		Static105.method1733();
		Static77.method1447();
		Static18.method522();
		Static97.method1658();
		Static21.method600();
		Static72.method1370();
		Static102.method1720();
		Static48.method1069();
		Static51.method1172();
		Static61.method1294();
		Static22.method608();
		Static53.method1216();
		Static52.method1189();
		Static4.method189();
		Static94.method1599();
		Static26.method720();
		Static93.method1592();
		Static70.method1358();
		Static106.method1753();
		Static36.method910();
		Static62.method1299();
		Static50.method1106();
		Static40.method1074();
		Static41.method959();
		Static78.method1036();
		Static35.method909();
		Static56.method1236();
		Static100.method1680();
		Static104.method1092();
		Static23.method659();
		Static33.method859();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	protected void method491() {
		Static5.anInt405 = Static73.anInt1985 == 0 ? 443 : Static22.anInt921 + 50000;
		Static29.anInt1100 = Static73.anInt1985 == 0 ? 43594 : Static22.anInt921 + 40000;
		Static15.anInt694 = Static29.anInt1100;
		Static102.method1719();
		Static83.method1514(Static103.aCanvas1);
		Static38.method947(Static103.aCanvas1);
		Static53.anInt1753 = Static58.anInt1800;
		try {
			if (Static34.aClass34_4.aClass48_2 != null) {
				Static25.aClass68_1 = new Class68(Static34.aClass34_4.aClass48_2, 5200, 0);
				for (@Pc(54) int local54 = 0; local54 < 13; local54++) {
					Static41.aClass68Array1[local54] = new Class68(Static34.aClass34_4.aClass48Array1[local54], 6000, 0);
				}
				Static57.aClass68_2 = new Class68(Static34.aClass34_4.aClass48_1, 6000, 0);
				Static30.aClass57_1 = new Class57(255, Static25.aClass68_1, Static57.aClass68_2, 500000);
				Static34.aClass34_4.aClass48Array1 = null;
				Static34.aClass34_4.aClass48_1 = null;
				Static34.aClass34_4.aClass48_2 = null;
			}
		} catch (@Pc(99) IOException local99) {
			Static30.aClass57_1 = null;
			Static25.aClass68_1 = null;
			Static57.aClass68_2 = null;
		}
		if (Static73.anInt1985 != 0) {
			Static32.aBoolean55 = true;
		}
		Static21.aClass2_Sub1_Sub14_4 = new Class2_Sub1_Sub14();
	}
}
