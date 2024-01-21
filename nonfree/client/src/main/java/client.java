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
				Static29.method517();
			}
			Static41.anInt1300 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static56.anInt1704 = 0;
			} else if (arg0[1].equals("office")) {
				Static56.anInt1704 = 1;
			} else if (arg0[1].equals("local")) {
				Static56.anInt1704 = 2;
			} else {
				Static29.method517();
			}
			if (arg0[2].equals("live")) {
				Static53.anInt1931 = 0;
			} else if (arg0[2].equals("rc")) {
				Static53.anInt1931 = 1;
			} else if (arg0[2].equals("wip")) {
				Static53.anInt1931 = 2;
			} else {
				Static29.method517();
			}
			if (arg0[3].equals("lowmem")) {
				Static34.method702();
			} else if (arg0[3].equals("highmem")) {
				Static5.method125();
			} else {
				Static29.method517();
			}
			if (arg0[4].equals("free")) {
				Static105.aBoolean152 = false;
			} else if (arg0[4].equals("members")) {
				Static105.aBoolean152 = true;
			} else {
				Static29.method517();
			}
			if (arg0[5].equals("english")) {
				Static59.anInt1817 = 0;
			} else if (arg0[5].equals("german")) {
				Static39.method760();
				Static59.anInt1817 = 1;
			} else {
				Static29.method517();
			}
			@Pc(154) client local154 = new client();
			local154.method358("runescape", InetAddress.getLocalHost(), Static53.anInt1931 + 32);
		} catch (@Pc(169) Exception local169) {
			Static30.method573(null, local169);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method354() {
		if (Static100.aClass6_1 != null) {
			Static100.aClass6_1.aBoolean24 = false;
		}
		Static100.aClass6_1 = null;
		if (Static41.aClass13_3 != null) {
			Static41.aClass13_3.method316();
			Static41.aClass13_3 = null;
		}
		Static33.method1414();
		Static87.method1547();
		Static57.method1005();
		Static90.method835();
		Static57.method1004();
		Static106.method1747();
		try {
			if (Static41.aClass3_3 != null) {
				Static41.aClass3_3.method92();
			}
			if (Static99.aClass3Array3 != null) {
				for (@Pc(40) int local40 = 0; local40 < Static99.aClass3Array3.length; local40++) {
					if (Static99.aClass3Array3[local40] != null) {
						Static99.aClass3Array3[local40].method92();
					}
				}
			}
			if (Static50.aClass3_4 != null) {
				Static50.aClass3_4.method92();
			}
		} catch (@Pc(72) IOException local72) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method343() {
		if (Static74.aBoolean85) {
			Static59.method1072(Static70.aCanvas1);
			Static80.method1355(Static70.aCanvas1);
			this.method347();
			Static54.method959(Static70.aCanvas1);
			Static15.method304(Static70.aCanvas1);
		}
		if (Static35.anInt1181 == 0) {
			Static80.method1354(Static105.aClass65_1284, Static36.anInt1219, null);
		} else if (Static35.anInt1181 == 5) {
			Static101.method1715(Static38.aClass2_Sub1_Sub4_Sub4_1, Static60.aClass2_Sub1_Sub4_Sub4_2);
		} else if (Static35.anInt1181 == 10) {
			Static101.method1715(Static38.aClass2_Sub1_Sub4_Sub4_1, Static60.aClass2_Sub1_Sub4_Sub4_2);
		} else if (Static35.anInt1181 == 20) {
			Static101.method1715(Static38.aClass2_Sub1_Sub4_Sub4_1, Static60.aClass2_Sub1_Sub4_Sub4_2);
		} else if (Static35.anInt1181 == 25) {
			@Pc(79) int local79;
			if (Static48.anInt1404 == 1) {
				if (Static101.anInt2786 < Static37.anInt1221) {
					Static101.anInt2786 = Static37.anInt1221;
				}
				local79 = (Static101.anInt2786 - Static37.anInt1221) * 50 / Static101.anInt2786;
				Static4.method94(Static13.method282(new Class65[] { Static3.aClass65_83, Static93.method1617(local79), Static22.aClass65_309 }), true, Static39.aClass65_537);
			} else if (Static48.anInt1404 == 2) {
				if (Static98.anInt2762 > Static81.anInt2904) {
					Static81.anInt2904 = Static98.anInt2762;
				}
				local79 = (Static81.anInt2904 - Static98.anInt2762) * 50 / Static81.anInt2904 + 50;
				Static4.method94(Static13.method282(new Class65[] { Static3.aClass65_83, Static93.method1617(local79), Static22.aClass65_309 }), true, Static39.aClass65_537);
			} else {
				Static4.method94(null, false, Static39.aClass65_537);
			}
		} else if (Static35.anInt1181 == 30) {
			Static2.method65();
		} else if (Static35.anInt1181 == 35) {
			Static51.method900();
		} else if (Static35.anInt1181 == 40) {
			Static4.method94(Static74.aClass65_710, false, Static37.aClass65_522);
		}
		Static92.anInt2582 = 0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method350() {
		Static17.method363();
		Static108.method1789();
		Static78.method360();
		Static90.method839();
		Static19.method1103();
		Static8.method159();
		Static33.method1383();
		Static16.method318();
		Static65.method1164();
		Static4.method89();
		Static6.method128();
		Static30.method575();
		Static82.method1427();
		Static109.method1831();
		Static31.method627();
		Static103.method1729();
		Static52.method932();
		Static92.method1586();
		Static3.method82();
		Static15.method305();
		Static85.method1488();
		Static74.method923();
		Static56.method994();
		Static70.method1258();
		Static9.method161();
		Static81.method1796();
		Static100.method1708();
		Static38.method752();
		Static26.method1804();
		Static53.method1130();
		Static36.method746();
		Static35.method727();
		Static86.method1542();
		Static110.method1842();
		Static25.method449();
		Static105.method1741();
		Static27.method501();
		Static97.method1655();
		Static75.method1300();
		Static21.method1510();
		Static62.method1096();
		Static51.method901();
		Static106.method1749();
		Static89.method1572();
		Static44.method814();
		Static45.method815();
		Static32.method629();
		Static76.method1304();
		Static69.method1244();
		Static57.method996();
		Static95.method1181();
		Static28.method502();
		Static80.method1356();
		Static50.method852();
		Static47.method822();
		Static84.method1452();
		Static107.method1751();
		Static10.method252();
		Static43.method1816();
		Static12.method263();
		Static46.method817();
		Static102.method1722();
		Static13.method279();
		Static79.method1353();
		Static7.method149();
		Static93.method1610();
		Static59.method1069();
		Static67.method1210();
		Static96.method1648();
		Static55.method983();
		Static98.method1693();
		Static5.method121();
		Static91.method1580();
		Static1.method2();
		Static101.method1717();
		Static61.method1086();
		Static22.method415();
		Static77.method1334();
		Static11.method258();
		Static60.method1079();
		Static2.method63();
		Static71.method1292();
		Static41.method787();
		Static40.method785();
		Static42.method807();
		Static29.method514();
		Static104.method1736();
		Static83.method1431();
		Static48.method844();
		Static63.method1107();
		Static54.method961();
		Static49.method849();
		Static87.method1545();
		Static64.method1129();
		Static23.method419();
		Static73.method1294();
		Static24.method443();
		Static34.method697();
		Static18.method1558();
		Static68.method1231();
		Static72.method1184();
		Static66.method1191();
		Static37.method749();
		Static39.method766();
		Static99.method1569();
		Static14.method303();
		Static20.method403();
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method357() {
		Static56.anInt1695 = Static56.anInt1704 == 0 ? 43594 : Static41.anInt1300 + 40000;
		Static45.anInt1368 = Static56.anInt1695;
		Static18.anInt2529 = Static56.anInt1704 == 0 ? 443 : Static41.anInt1300 + 50000;
		Static70.method1259();
		Static54.method959(Static70.aCanvas1);
		Static15.method304(Static70.aCanvas1);
		Static24.anInt713 = Static94.anInt2653;
		try {
			if (Static97.aClass53_3.aClass42_3 != null) {
				Static41.aClass3_3 = new Class3(Static97.aClass53_3.aClass42_3, 5200, 0);
				for (@Pc(57) int local57 = 0; local57 < 12; local57++) {
					Static99.aClass3Array3[local57] = new Class3(Static97.aClass53_3.aClass42Array1[local57], 6000, 0);
				}
				Static50.aClass3_4 = new Class3(Static97.aClass53_3.aClass42_2, 6000, 0);
				Static85.aClass5_4 = new Class5(255, Static41.aClass3_3, Static50.aClass3_4, 500000);
				Static97.aClass53_3.aClass42Array1 = null;
				Static97.aClass53_3.aClass42_2 = null;
				Static97.aClass53_3.aClass42_3 = null;
			}
		} catch (@Pc(104) IOException local104) {
			Static50.aClass3_4 = null;
			Static41.aClass3_3 = null;
			Static85.aClass5_4 = null;
		}
		if (Static56.anInt1704 != 0) {
			Static45.aBoolean80 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method365(@OriginalArg(0) int arg0) {
		Static9.anInt319 = 0;
		Static99.aClass20_12 = null;
		Static18.anInt2531++;
		if (Static45.anInt1368 == Static56.anInt1695) {
			Static45.anInt1368 = Static18.anInt2529;
		} else {
			Static45.anInt1368 = Static56.anInt1695;
		}
		Static61.aClass13_4 = null;
		if (Static18.anInt2531 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static35.anInt1181 <= 5) {
				this.method352("js5connect_full");
				Static35.anInt1181 = 1000;
			} else {
				Static110.anInt2943 = 3000;
			}
		} else if (Static18.anInt2531 >= 2 && arg0 == 6) {
			this.method352("js5connect_outofdate");
			Static35.anInt1181 = 1000;
		} else if (Static18.anInt2531 >= 4) {
			if (Static35.anInt1181 <= 5) {
				this.method352("js5connect");
				Static35.anInt1181 = 1000;
			} else {
				Static110.anInt2943 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method355() {
		Static108.anInt2902++;
		this.method368();
		Static47.method825();
		Static57.method997();
		Static24.method445();
		Static1.method3();
		Static93.method1607();
		if (Static35.anInt1181 == 0) {
			Static54.method958();
			Static40.method786();
		} else if (Static35.anInt1181 == 5) {
			Static54.method958();
			Static40.method786();
		} else if (Static35.anInt1181 == 10) {
			Static39.method765();
		} else if (Static35.anInt1181 == 20) {
			Static39.method765();
			Static42.method811();
		} else if (Static35.anInt1181 == 25) {
			Static35.method726();
		}
		if (Static35.anInt1181 == 30) {
			Static27.method500();
		} else if (Static35.anInt1181 == 35) {
			Static27.method500();
		} else if (Static35.anInt1181 == 40) {
			Static42.method811();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method366() {
		if (Static99.anInt2547 >= 4) {
			this.method352("js5crc");
			Static35.anInt1181 = 1000;
			return;
		}
		if (Static26.anInt2924 >= 4) {
			if (Static35.anInt1181 <= 5) {
				this.method352("js5io");
				Static35.anInt1181 = 1000;
				return;
			}
			Static26.anInt2924 = 3;
			Static110.anInt2943 = 3000;
		}
		if (Static110.anInt2943-- > 0) {
			return;
		}
		try {
			if (Static9.anInt319 == 0) {
				Static99.aClass20_12 = Static97.aClass53_3.method1625(Static45.anInt1368);
				Static9.anInt319++;
			}
			if (Static9.anInt319 == 1) {
				if (Static99.aClass20_12.anInt1156 == 2) {
					this.method365(-1);
					return;
				}
				if (Static99.aClass20_12.anInt1156 == 1) {
					Static9.anInt319++;
				}
			}
			if (Static9.anInt319 == 2) {
				Static61.aClass13_4 = new Class13((Socket) Static99.aClass20_12.anObject4, Static97.aClass53_3);
				@Pc(102) Class2_Sub8 local102 = new Class2_Sub8(5);
				local102.method1375(15);
				local102.method1370(427);
				Static61.aClass13_4.method313(5, local102.aByteArray59);
				Static9.anInt319++;
				Static32.aLong33 = Static76.method1306();
			}
			if (Static9.anInt319 == 3) {
				if (Static35.anInt1181 <= 5 || Static61.aClass13_4.method323() > 0) {
					@Pc(155) int local155 = Static61.aClass13_4.method321();
					if (local155 != 0) {
						this.method365(local155);
						return;
					}
					Static9.anInt319++;
				} else if (Static76.method1306() - Static32.aLong33 > 30000L) {
					this.method365(-2);
					return;
				}
			}
			if (Static9.anInt319 == 4) {
				Static69.method1242(Static61.aClass13_4, Static35.anInt1181 > 20);
				Static9.anInt319 = 0;
				Static18.anInt2531 = 0;
				Static99.aClass20_12 = null;
				Static61.aClass13_4 = null;
			}
		} catch (@Pc(192) IOException local192) {
			this.method365(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method368() {
		if (Static35.anInt1181 != 1000) {
			@Pc(16) boolean local16 = Static77.method1333();
			if (!local16) {
				this.method366();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method351()) {
			return;
		}
		Static41.anInt1300 = Integer.parseInt(this.getParameter("worldid"));
		Static53.anInt1931 = Integer.parseInt(this.getParameter("modewhat"));
		Static56.anInt1704 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static34.method702();
		} else {
			Static5.method125();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static105.aBoolean152 = true;
		} else {
			Static105.aBoolean152 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static39.method760();
			Static59.anInt1817 = 1;
		}
		this.method345(Static53.anInt1931 + 32);
	}
}
