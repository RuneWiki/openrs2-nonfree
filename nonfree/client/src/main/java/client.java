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
				Static44.method760();
			}
			Static17.anInt386 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static67.anInt1595 = 0;
			} else if (arg0[1].equals("office")) {
				Static67.anInt1595 = 1;
			} else if (arg0[1].equals("local")) {
				Static67.anInt1595 = 2;
			} else {
				Static44.method760();
			}
			if (arg0[2].equals("live")) {
				Static22.anInt549 = 0;
			} else if (arg0[2].equals("rc")) {
				Static22.anInt549 = 1;
			} else if (arg0[2].equals("wip")) {
				Static22.anInt549 = 2;
			} else {
				Static44.method760();
			}
			if (arg0[3].equals("lowmem")) {
				Static120.method1870();
			} else if (arg0[3].equals("highmem")) {
				Static47.method817();
			} else {
				Static44.method760();
			}
			if (arg0[4].equals("free")) {
				Static49.aBoolean48 = false;
			} else if (arg0[4].equals("members")) {
				Static49.aBoolean48 = true;
			} else {
				Static44.method760();
			}
			if (arg0[5].equals("english")) {
				Static73.anInt1662 = 0;
			} else if (arg0[5].equals("german")) {
				Static23.method1318();
				Static110.aClass65_1041 = Static127.aClass65_1191;
				Static73.anInt1662 = 1;
			} else {
				Static44.method760();
			}
			if (arg0[6].equals("game0")) {
				Static123.anInt2627 = 0;
			} else if (arg0[6].equals("game1")) {
				Static123.anInt2627 = 1;
			} else {
				Static44.method760();
			}
			Static43.aString5 = "127.0.0.1";
			@Pc(176) client local176 = new client();
			local176.method311("runescape", Static22.anInt549 + 32);
		} catch (@Pc(190) Exception local190) {
			Static93.method1535(null, local190);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method306() {
		if (Static123.anInt2627 == 1) {
			Static132.aShortArrayArray6 = Static69.aShortArrayArray3;
			Static47.aShortArray14 = Static20.aShortArray1;
			Static42.aShortArray13 = Static120.aShortArray34;
			Static108.aShortArrayArray5 = Static83.aShortArrayArray4;
		} else {
			Static108.aShortArrayArray5 = Static44.aShortArrayArray2;
			Static47.aShortArray14 = Static72.aShortArray19;
			Static42.aShortArray13 = Static96.aShortArray32;
			Static132.aShortArrayArray6 = Static9.aShortArrayArray1;
		}
		Static57.anInt1439 = Static67.anInt1595 == 0 ? 43594 : Static17.anInt386 + 40000;
		Static73.anInt1663 = Static67.anInt1595 == 0 ? 443 : Static17.anInt386 + 50000;
		Static114.anInt2537 = Static57.anInt1439;
		Static60.method301();
		Static34.method634(Static115.aCanvas1);
		Static9.method170(Static115.aCanvas1);
		Static128.aClass61_1 = Static21.method351();
		if (Static128.aClass61_1 != null) {
			Static128.aClass61_1.method1938(Static115.aCanvas1);
		}
		Static33.anInt766 = Static24.anInt558;
		try {
			if (Static28.aClass20_2.aClass59_2 != null) {
				Static47.aClass70_3 = new Class70(Static28.aClass20_2.aClass59_2, 5200, 0);
				for (@Pc(78) int local78 = 0; local78 < 16; local78++) {
					Static75.aClass70Array2[local78] = new Class70(Static28.aClass20_2.aClass59Array1[local78], 6000, 0);
				}
				Static56.aClass70_4 = new Class70(Static28.aClass20_2.aClass59_3, 6000, 0);
				Static124.aClass24_4 = new Class24(255, Static47.aClass70_3, Static56.aClass70_4, 500000);
				Static81.aClass70_5 = new Class70(Static28.aClass20_2.aClass59_1, 24, 0);
				Static28.aClass20_2.aClass59Array1 = null;
				Static28.aClass20_2.aClass59_2 = null;
				Static28.aClass20_2.aClass59_3 = null;
				Static28.aClass20_2.aClass59_1 = null;
			}
		} catch (@Pc(136) IOException local136) {
			Static124.aClass24_4 = null;
			Static81.aClass70_5 = null;
			Static47.aClass70_3 = null;
			Static56.aClass70_4 = null;
		}
		if (Static67.anInt1595 != 0) {
			Static114.aBoolean102 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method300() {
		Static19.method319();
		Static90.method1494();
		Static60.method302();
		Static13.method1862();
		Static16.method1602();
		Static40.method675();
		Static11.method908();
		Static8.method158();
		Static103.method1697();
		Static98.method1613();
		Static30.method610();
		Static89.method1472();
		Static54.method955();
		Static65.method1196();
		Static61.method1107();
		Static130.method1975();
		Static41.method728();
		Static17.method264();
		Static50.method853();
		Static82.method1937();
		Static108.method1749();
		Static4.method860();
		Static88.method1443();
		Static12.method248();
		Static5.method119();
		Static119.method1461();
		Static111.method1811();
		Static94.method1565();
		Static63.method1133();
		Static10.method2054();
		Static3.method67();
		Static102.method1661();
		Static9.method173();
		Static131.method2015();
		Static27.method560();
		Static35.method649();
		Static37.method654();
		Static114.method1830();
		Static66.method1209();
		Static15.method261();
		Static33.method633();
		Static68.method1995();
		Static91.method1515();
		Static126.method1926();
		Static95.method1567();
		Static81.method1326();
		Static29.method602();
		Static123.method1888();
		Static39.method672();
		Static57.method1079();
		Static48.method829();
		Static78.method1297();
		Static67.method1211();
		Static115.method1837();
		Static75.method1684();
		Static47.method806();
		Static62.method1118();
		Static117.method1860();
		Static97.method1595();
		Static121.method1875();
		Static34.method636();
		Static71.method1238();
		Static43.method740();
		Static113.method1822();
		Static128.method1956();
		Static129.method1962();
		Static22.method354();
		Static6.method132();
		Static118.method2080();
		Static104.method2059();
		Static87.method1435();
		Static133.method2040();
		Static64.method1137();
		Static99.method1632();
		Static107.method1734();
		Static53.method887();
		Static56.method1067();
		Static20.method344();
		Static83.method1357();
		Static125.method1919();
		Static93.method1542();
		Static38.method667();
		Static69.method1227();
		Static49.method844();
		Static100.method1650();
		Static44.method758();
		Static116.method1854();
		Static55.method2088();
		Static1.method13();
		Static80.method1312();
		Static18.method277();
		Static86.method1384();
		Static72.method1239();
		Static79.method1298();
		Static122.method1886();
		Static106.method1720();
		Static132.method2032();
		Static42.method739();
		Static14.method259();
		Static77.method1291();
		Static70.method1236();
		Static127.method1940();
		Static92.method1519();
		Static96.method1589();
		Static28.method580();
		Static134.method2048();
		Static110.method1792();
		Static2.method63();
		Static101.method1658();
		Static52.method879();
		Static76.method1280();
		Static105.method1709();
		Static59.method1095();
		Static7.method152();
		Static23.method1314();
		Static45.method766();
		Static26.method523();
		Static58.method1086();
		Static73.method1247();
		Static51.method876();
		Static25.method518();
		Static32.method624();
		Static74.method1252();
		Static46.method779();
		Static112.method1820();
		Static31.method612();
		Static21.method352();
		Static84.method1366();
		Static120.method1872();
		Static85.method1380();
		Static109.method1757();
		Static36.method652();
		Static124.method1896();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method318(@OriginalArg(1) int arg0) {
		Static78.anInt1729 = 0;
		Static13.aClass15_10 = null;
		if (Static114.anInt2537 == Static57.anInt1439) {
			Static114.anInt2537 = Static73.anInt1663;
		} else {
			Static114.anInt2537 = Static57.anInt1439;
		}
		Static128.aClass7_5 = null;
		Static110.anInt2467++;
		if (Static110.anInt2467 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static129.anInt2753 <= 5) {
				this.method310("js5connect_full");
				Static129.anInt2753 = 1000;
			} else {
				Static94.anInt2124 = 3000;
			}
		} else if (Static110.anInt2467 >= 2 && arg0 == 6) {
			this.method310("js5connect_outofdate");
			Static129.anInt2753 = 1000;
		} else if (Static110.anInt2467 >= 4) {
			if (Static129.anInt2753 > 5) {
				Static94.anInt2124 = 3000;
			} else {
				this.method310("js5connect");
				Static129.anInt2753 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method315()) {
			return;
		}
		Static17.anInt386 = Integer.parseInt(this.getParameter("worldid"));
		Static22.anInt549 = Integer.parseInt(this.getParameter("modewhat"));
		Static67.anInt1595 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static120.method1870();
		} else {
			Static47.method817();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static49.aBoolean48 = true;
		} else {
			Static49.aBoolean48 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static23.method1318();
			Static110.aClass65_1041 = Static127.aClass65_1191;
			Static73.anInt1662 = 1;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static123.anInt2627 = 1;
		} else {
			Static123.anInt2627 = 0;
		}
		try {
			Static81.anInt1760 = Integer.parseInt(this.getParameter("js"));
			Static70.anInt1634 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(101) Exception local101) {
		}
		Static43.aString5 = this.getCodeBase().getHost();
		this.method305(Static22.anInt549 + 32);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method320() {
		if (Static129.anInt2753 != 1000) {
			@Pc(14) boolean local14 = Static14.method260();
			if (!local14) {
				this.method321();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method313() {
		@Pc(13) boolean local13 = Static21.method349();
		if (local13 && Static100.aBoolean92 && Static40.aClass4_1 != null) {
			Static40.aClass4_1.method875();
		}
		if (Static97.aBoolean89) {
			Static47.method796(Static115.aCanvas1);
			Static107.method1735(Static115.aCanvas1);
			if (Static128.aClass61_1 != null) {
				Static128.aClass61_1.method1931(Static115.aCanvas1);
			}
			this.method309();
			Static34.method634(Static115.aCanvas1);
			Static9.method170(Static115.aCanvas1);
			if (Static128.aClass61_1 != null) {
				Static128.aClass61_1.method1938(Static115.aCanvas1);
			}
		}
		if (Static129.anInt2753 == 0) {
			Static17.method272(null, Static57.aClass65_626, Static9.anInt256);
		} else if (Static129.anInt2753 == 5) {
			Static96.method1588(Static2.aClass2_Sub1_Sub4_Sub3_Sub1_1, Static107.aClass2_Sub1_Sub4_Sub3_Sub1_3);
		} else if (Static129.anInt2753 == 10) {
			Static96.method1588(Static2.aClass2_Sub1_Sub4_Sub3_Sub1_1, Static107.aClass2_Sub1_Sub4_Sub3_Sub1_3);
		} else if (Static129.anInt2753 == 20) {
			Static96.method1588(Static2.aClass2_Sub1_Sub4_Sub3_Sub1_1, Static107.aClass2_Sub1_Sub4_Sub3_Sub1_3);
		} else if (Static129.anInt2753 == 25) {
			@Pc(139) int local139;
			if (Static114.anInt2533 == 1) {
				if (Static75.anInt2330 > Static44.anInt1085) {
					Static44.anInt1085 = Static75.anInt2330;
				}
				local139 = (Static44.anInt1085 - Static75.anInt2330) * 50 / Static44.anInt1085;
				Static20.method338(Static35.method647(new Class65[] { Static37.aClass65_390, Static47.aClass65_521, Static120.method1871(local139), Static117.aClass65_1119 }), false);
			} else if (Static114.anInt2533 == 2) {
				if (Static125.anInt2669 < Static102.anInt2297) {
					Static125.anInt2669 = Static102.anInt2297;
				}
				local139 = (Static125.anInt2669 - Static102.anInt2297) * 50 / Static125.anInt2669 + 50;
				Static20.method338(Static35.method647(new Class65[] { Static37.aClass65_390, Static47.aClass65_521, Static120.method1871(local139), Static117.aClass65_1119 }), false);
			} else {
				Static20.method338(Static37.aClass65_390, false);
			}
		} else if (Static129.anInt2753 == 30) {
			Static108.method1747();
		} else if (Static129.anInt2753 == 40) {
			Static20.method338(Static35.method647(new Class65[] { Static11.aClass65_572, Static6.aClass65_78, Static41.aClass65_455 }), false);
		}
		@Pc(252) int local252;
		@Pc(250) Graphics local250;
		if (Static129.anInt2753 == 30 && Static20.anInt520 == 0 && !Static43.aBoolean44) {
			try {
				local250 = Static115.aCanvas1.getGraphics();
				for (local252 = 0; local252 < Static17.anInt392; local252++) {
					if (Static9.aBooleanArray3[local252]) {
						Static59.aClass6_1.method1599(Static47.anIntArray143[local252], Static95.anIntArray284[local252], local250, Static115.anIntArray335[local252], Static41.anIntArray117[local252]);
						Static9.aBooleanArray3[local252] = false;
					}
				}
			} catch (@Pc(284) Exception local284) {
				Static115.aCanvas1.repaint();
			}
		} else if (Static129.anInt2753 > 0) {
			try {
				local250 = Static115.aCanvas1.getGraphics();
				Static59.aClass6_1.method1601(local250);
				Static43.aBoolean44 = false;
				for (local252 = 0; local252 < Static17.anInt392; local252++) {
					Static9.aBooleanArray3[local252] = false;
				}
			} catch (@Pc(318) Exception local318) {
				Static115.aCanvas1.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method314() {
		if (Static17.aClass33_1 != null) {
			Static17.aClass33_1.aBoolean37 = false;
		}
		Static17.aClass33_1 = null;
		if (Static129.aClass7_6 != null) {
			Static129.aClass7_6.method157();
			Static129.aClass7_6 = null;
		}
		Static120.method1869();
		Static89.method1473();
		Static128.aClass61_1 = null;
		if (Static40.aClass4_1 != null) {
			Static40.aClass4_1.method866();
		}
		if (Static124.aClass4_2 != null) {
			Static124.aClass4_2.method866();
		}
		Static77.method1294();
		Static4.method855();
		try {
			if (Static47.aClass70_3 != null) {
				Static47.aClass70_3.method1606();
			}
			if (Static75.aClass70Array2 != null) {
				for (@Pc(56) int local56 = 0; local56 < Static75.aClass70Array2.length; local56++) {
					if (Static75.aClass70Array2[local56] != null) {
						Static75.aClass70Array2[local56].method1606();
					}
				}
			}
			if (Static56.aClass70_4 != null) {
				Static56.aClass70_4.method1606();
			}
			if (Static81.aClass70_5 != null) {
				Static81.aClass70_5.method1606();
			}
		} catch (@Pc(88) IOException local88) {
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method321() {
		if (Static90.anInt2002 >= 4) {
			this.method310("js5crc");
			Static129.anInt2753 = 1000;
			return;
		}
		if (Static76.anInt1705 >= 4) {
			if (Static129.anInt2753 <= 5) {
				this.method310("js5io");
				Static129.anInt2753 = 1000;
				return;
			}
			Static76.anInt1705 = 3;
			Static94.anInt2124 = 3000;
		}
		if (Static94.anInt2124-- > 0) {
			return;
		}
		try {
			if (Static78.anInt1729 == 0) {
				Static13.aClass15_10 = Static28.aClass20_2.method371(Static114.anInt2537, Static43.aString5);
				Static78.anInt1729++;
			}
			if (Static78.anInt1729 == 1) {
				if (Static13.aClass15_10.anInt404 == 2) {
					this.method318(-1);
					return;
				}
				if (Static13.aClass15_10.anInt404 == 1) {
					Static78.anInt1729++;
				}
			}
			if (Static78.anInt1729 == 2) {
				Static128.aClass7_5 = new Class7((Socket) Static13.aClass15_10.anObject9, Static28.aClass20_2);
				@Pc(91) Class2_Sub4 local91 = new Class2_Sub4(5);
				local91.method926(15);
				local91.method914(466);
				Static128.aClass7_5.method161(local91.aByteArray20, 5);
				Static78.anInt1729++;
				Static9.aLong12 = Static78.method1296();
			}
			if (Static78.anInt1729 == 3) {
				if (Static129.anInt2753 <= 5 || Static128.aClass7_5.method155() > 0) {
					@Pc(141) int local141 = Static128.aClass7_5.method160();
					if (local141 != 0) {
						this.method318(local141);
						return;
					}
					Static78.anInt1729++;
				} else if (Static78.method1296() - Static9.aLong12 > 30000L) {
					this.method318(-2);
					return;
				}
			}
			if (Static78.anInt1729 == 4) {
				Static6.method130(Static129.anInt2753 > 20, Static128.aClass7_5);
				Static128.aClass7_5 = null;
				Static110.anInt2467 = 0;
				Static13.aClass15_10 = null;
				Static78.anInt1729 = 0;
			}
		} catch (@Pc(181) IOException local181) {
			this.method318(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method307() {
		Static10.anInt2951++;
		this.method320();
		Static47.method808();
		Static70.method1233();
		Static124.method1897();
		Static47.method823();
		Static35.method640();
		if (Static128.aClass61_1 != null) {
			@Pc(36) int local36 = Static128.aClass61_1.method1935();
			Static130.anInt2839 = local36;
		}
		if (Static129.anInt2753 == 0) {
			Static1.method10();
			Static6.method133();
		} else if (Static129.anInt2753 == 5) {
			Static72.method1242(this);
			Static1.method10();
			Static6.method133();
		} else if (Static129.anInt2753 == 10) {
			Static72.method1242(this);
		} else if (Static129.anInt2753 == 20) {
			Static72.method1242(this);
			Static52.method882();
		} else if (Static129.anInt2753 == 25) {
			Static22.method355();
		}
		if (Static129.anInt2753 == 30) {
			Static103.method1696();
		} else if (Static129.anInt2753 == 40) {
			Static52.method882();
		}
	}
}
