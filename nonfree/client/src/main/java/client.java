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
				Static35.method416();
			}
			Static5.anInt255 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static67.anInt1653 = 0;
			} else if (arg0[1].equals("office")) {
				Static67.anInt1653 = 1;
			} else if (arg0[1].equals("local")) {
				Static67.anInt1653 = 2;
			} else {
				Static35.method416();
			}
			if (arg0[2].equals("live")) {
				Static45.anInt1163 = 0;
			} else if (arg0[2].equals("rc")) {
				Static45.anInt1163 = 1;
			} else if (arg0[2].equals("wip")) {
				Static45.anInt1163 = 2;
			} else {
				Static35.method416();
			}
			if (arg0[3].equals("lowmem")) {
				Static15.method223();
			} else if (arg0[3].equals("highmem")) {
				Static70.method1138();
			} else {
				Static35.method416();
			}
			if (arg0[4].equals("free")) {
				Static13.aBoolean23 = false;
			} else if (arg0[4].equals("members")) {
				Static13.aBoolean23 = true;
			} else {
				Static35.method416();
			}
			if (arg0[5].equals("english")) {
				Static12.anInt342 = 0;
			} else if (arg0[5].equals("german")) {
				Static104.method1700();
				Static12.anInt342 = 1;
			} else {
				Static35.method416();
			}
			@Pc(154) client local154 = new client();
			local154.method276("runescape", Static45.anInt1163 + 32, InetAddress.getLocalHost());
		} catch (@Pc(168) Exception local168) {
			Static101.method1675(local168, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method278(@OriginalArg(1) int arg0) {
		Static52.aClass31_3 = null;
		Static11.anInt2847 = 0;
		Static71.anInt1717++;
		if (Static75.anInt1790 == Static24.anInt684) {
			Static24.anInt684 = Static75.anInt1798;
		} else {
			Static24.anInt684 = Static75.anInt1790;
		}
		Static76.aClass42_7 = null;
		if (Static71.anInt1717 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static20.anInt479 > 5) {
				Static76.anInt1816 = 3000;
			} else {
				this.method268("js5connect_full");
				Static20.anInt479 = 1000;
			}
		} else if (Static71.anInt1717 >= 2 && arg0 == 6) {
			this.method268("js5connect_outofdate");
			Static20.anInt479 = 1000;
		} else if (Static71.anInt1717 >= 4) {
			if (Static20.anInt479 <= 5) {
				this.method268("js5connect");
				Static20.anInt479 = 1000;
			} else {
				Static76.anInt1816 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method279() {
		if (Static21.anInt488 >= 4) {
			this.method268("js5crc");
			Static20.anInt479 = 1000;
			return;
		}
		if (Static31.anInt958 >= 4) {
			if (Static20.anInt479 <= 5) {
				this.method268("js5io");
				Static20.anInt479 = 1000;
				return;
			}
			Static76.anInt1816 = 3000;
			Static31.anInt958 = 3;
		}
		if (Static76.anInt1816-- > 0) {
			return;
		}
		try {
			if (Static11.anInt2847 == 0) {
				Static76.aClass42_7 = Static24.aClass2_1.method16(Static24.anInt684);
				Static11.anInt2847++;
			}
			if (Static11.anInt2847 == 1) {
				if (Static76.aClass42_7.anInt1395 == 2) {
					this.method278(-1);
					return;
				}
				if (Static76.aClass42_7.anInt1395 == 1) {
					Static11.anInt2847++;
				}
			}
			if (Static11.anInt2847 == 2) {
				Static52.aClass31_3 = new Class31((Socket) Static76.aClass42_7.anObject2, Static24.aClass2_1);
				@Pc(98) Class3_Sub4 local98 = new Class3_Sub4(5);
				local98.method423(15);
				local98.method424(433);
				Static52.aClass31_3.method716(5, local98.aByteArray4);
				Static11.anInt2847++;
				Static8.aLong9 = Static82.method1291();
			}
			if (Static11.anInt2847 == 3) {
				if (Static20.anInt479 <= 5 || Static52.aClass31_3.method715() > 0) {
					@Pc(155) int local155 = Static52.aClass31_3.method713();
					if (local155 != 0) {
						this.method278(local155);
						return;
					}
					Static11.anInt2847++;
				} else if (Static82.method1291() - Static8.aLong9 > 30000L) {
					this.method278(-2);
					return;
				}
			}
			if (Static11.anInt2847 == 4) {
				Static96.method1164(Static20.anInt479 > 20, Static52.aClass31_3);
				Static71.anInt1717 = 0;
				Static11.anInt2847 = 0;
				Static76.aClass42_7 = null;
				Static52.aClass31_3 = null;
			}
		} catch (@Pc(195) IOException local195) {
			this.method278(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method271() {
		if (Static69.aBoolean187) {
			Static83.method1299(Static9.aCanvas1);
			Static13.method218(Static9.aCanvas1);
			this.method277();
			Static98.method1556(Static9.aCanvas1);
			Static11.method1931(Static9.aCanvas1);
		}
		if (Static20.anInt479 == 0) {
			Static61.method1033(null, Static95.aClass4_1253, Static88.anInt2035);
		} else if (Static20.anInt479 == 5) {
			Static43.method803(Static113.aClass3_Sub1_Sub4_Sub4_3, Static45.aClass3_Sub1_Sub4_Sub4_1);
		} else if (Static20.anInt479 == 10) {
			Static43.method803(Static113.aClass3_Sub1_Sub4_Sub4_3, Static45.aClass3_Sub1_Sub4_Sub4_1);
		} else if (Static20.anInt479 == 20) {
			Static43.method803(Static113.aClass3_Sub1_Sub4_Sub4_3, Static45.aClass3_Sub1_Sub4_Sub4_1);
		} else if (Static20.anInt479 == 25) {
			@Pc(88) int local88;
			if (Static16.anInt363 == 1) {
				if (Static71.anInt1711 > Static70.anInt1687) {
					Static70.anInt1687 = Static71.anInt1711;
				}
				local88 = (Static70.anInt1687 - Static71.anInt1711) * 50 / Static70.anInt1687;
				Static63.method1086(true, Static60.aClass4_756, Static60.method1012(new Class4[] { Static111.aClass4_1560, Static93.method1632(local88), Static6.aClass4_119 }));
			} else if (Static16.anInt363 == 2) {
				if (Static22.anInt501 < Static76.anInt1811) {
					Static22.anInt501 = Static76.anInt1811;
				}
				local88 = (Static22.anInt501 - Static76.anInt1811) * 50 / Static22.anInt501 + 50;
				Static63.method1086(true, Static60.aClass4_756, Static60.method1012(new Class4[] { Static111.aClass4_1560, Static93.method1632(local88), Static6.aClass4_119 }));
			} else {
				Static63.method1086(false, Static60.aClass4_756, null);
			}
		} else if (Static20.anInt479 == 30) {
			Static91.method1405();
		} else if (Static20.anInt479 == 35) {
			Static39.method729();
		} else if (Static20.anInt479 == 40) {
			Static63.method1086(false, Static30.aClass4_446, Static82.aClass4_1087);
		}
		Static8.anInt299 = 0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method270() {
		if (Static28.aClass37_1 != null) {
			Static28.aClass37_1.aBoolean82 = false;
		}
		Static28.aClass37_1 = null;
		if (Static53.aClass31_6 != null) {
			Static53.aClass31_6.method717();
			Static53.aClass31_6 = null;
		}
		Static60.method1008();
		Static23.method306();
		Static67.method1110();
		Static10.method208();
		Static17.method240();
		Static109.method1885();
		try {
			if (Static100.aClass24_4 != null) {
				Static100.aClass24_4.method562();
			}
			if (Static53.aClass24Array3 != null) {
				for (@Pc(46) int local46 = 0; local46 < Static53.aClass24Array3.length; local46++) {
					if (Static53.aClass24Array3[local46] != null) {
						Static53.aClass24Array3[local46].method562();
					}
				}
			}
			if (Static10.aClass24_1 != null) {
				Static10.aClass24_1.method562();
			}
		} catch (@Pc(78) IOException local78) {
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method263()) {
			return;
		}
		Static5.anInt255 = Integer.parseInt(this.getParameter("worldid"));
		Static45.anInt1163 = Integer.parseInt(this.getParameter("modewhat"));
		Static67.anInt1653 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static15.method223();
		} else {
			Static70.method1138();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static13.aBoolean23 = true;
		} else {
			Static13.aBoolean23 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static104.method1700();
			Static12.anInt342 = 1;
		}
		this.method273(Static45.anInt1163 + 32);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method265() {
		Static75.anInt1790 = Static67.anInt1653 == 0 ? 43594 : Static5.anInt255 + 40000;
		Static75.anInt1798 = Static67.anInt1653 == 0 ? 443 : Static5.anInt255 + 50000;
		Static24.anInt684 = Static75.anInt1790;
		Static60.method1005();
		Static98.method1556(Static9.aCanvas1);
		Static11.method1931(Static9.aCanvas1);
		Static44.anInt1155 = Static2.anInt12;
		try {
			if (Static24.aClass2_1.aClass53_2 != null) {
				Static100.aClass24_4 = new Class24(Static24.aClass2_1.aClass53_2, 5200, 0);
				for (@Pc(60) int local60 = 0; local60 < 13; local60++) {
					Static53.aClass24Array3[local60] = new Class24(Static24.aClass2_1.aClass53Array1[local60], 6000, 0);
				}
				Static10.aClass24_1 = new Class24(Static24.aClass2_1.aClass53_1, 6000, 0);
				Static72.aClass62_2 = new Class62(255, Static100.aClass24_4, Static10.aClass24_1, 500000);
				Static24.aClass2_1.aClass53_2 = null;
				Static24.aClass2_1.aClass53_1 = null;
				Static24.aClass2_1.aClass53Array1 = null;
			}
		} catch (@Pc(107) IOException local107) {
			Static10.aClass24_1 = null;
			Static100.aClass24_4 = null;
			Static72.aClass62_2 = null;
		}
		if (Static67.anInt1653 != 0) {
			Static28.aBoolean53 = true;
		}
		Static89.aClass3_Sub1_Sub14_3 = new Class3_Sub1_Sub14();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method260() {
		Static60.anInt1489++;
		this.method283();
		Static65.method1098();
		Static67.method1105();
		Static88.method1390();
		Static17.method237();
		Static82.method1295();
		if (Static20.anInt479 == 0) {
			Static43.method801();
			Static69.method1519();
		} else if (Static20.anInt479 == 5) {
			Static43.method801();
			Static69.method1519();
		} else if (Static20.anInt479 == 10) {
			Static16.method233();
		} else if (Static20.anInt479 == 20) {
			Static16.method233();
			Static45.method816();
		} else if (Static20.anInt479 == 25) {
			Static24.method471();
		}
		if (Static20.anInt479 == 30) {
			Static8.method189();
		} else if (Static20.anInt479 == 35) {
			Static8.method189();
		} else if (Static20.anInt479 == 40) {
			Static45.method816();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method264() {
		Static18.method281();
		Static5.method135();
		Static78.method269();
		Static53.method1658();
		Static96.method1159();
		Static45.method815();
		Static35.method443();
		Static36.method718();
		Static100.method1647();
		Static27.method556();
		Static89.method1397();
		Static55.method937();
		Static24.method469();
		Static108.method1863();
		Static84.method1337();
		Static52.method887();
		Static98.method1555();
		Static23.method315();
		Static92.method1429();
		Static76.method1221();
		Static54.method893();
		Static3.method1548();
		Static110.method1895();
		Static101.method1679();
		Static42.method798();
		Static11.method1929();
		Static31.method626();
		Static63.method1088();
		Static9.method196();
		Static62.method1071();
		Static41.method790();
		Static73.method1187();
		Static86.method1370();
		Static91.method1406();
		Static107.method1823();
		Static49.method840();
		Static60.method1010();
		Static90.method1914();
		Static7.method169();
		Static56.method939();
		Static28.method593();
		Static51.method868();
		Static14.method221();
		Static111.method1896();
		Static83.method1298();
		Static82.method1288();
		Static38.method1907();
		Static93.method1621();
		Static44.method809();
		Static67.method1109();
		Static87.method994();
		Static65.method1096();
		Static16.method234();
		Static22.method298();
		Static74.method1189();
		Static95.method1501();
		Static19.method286();
		Static99.method1597();
		Static50.method1843();
		Static43.method800();
		Static17.method239();
		Static20.method292();
		Static88.method1391();
		Static79.method1262();
		Static75.method1213();
		Static61.method1032();
		Static25.method489();
		Static85.method1366();
		Static94.method1480();
		Static71.method1155();
		Static70.method1136();
		Static58.method963();
		Static57.method951();
		Static32.method630();
		Static15.method224();
		Static104.method1699();
		Static81.method1283();
		Static34.method710();
		Static6.method166();
		Static102.method1687();
		Static1.method1();
		Static106.method1806();
		Static29.method618();
		Static68.method1116();
		Static21.method295();
		Static66.method1100();
		Static4.method113();
		Static112.method1923();
		Static10.method209();
		Static13.method220();
		Static47.method829();
		Static8.method191();
		Static72.method1170();
		Static64.method1091();
		Static40.method735();
		Static12.method215();
		Static37.method719();
		Static113.method1934();
		Static80.method1268();
		Static30.method619();
		Static48.method838();
		Static46.method1877();
		Static77.method1242();
		Static105.method1003();
		Static26.method550();
		Static103.method1692();
		Static39.method731();
		Static69.method1521();
		Static59.method976();
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method283() {
		if (Static20.anInt479 != 1000) {
			@Pc(12) boolean local12 = Static106.method1809();
			if (!local12) {
				this.method279();
			}
		}
	}
}
