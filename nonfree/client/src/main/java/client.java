import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
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
				Static182.method3113();
			}
			Static48.anInt3637 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static59.anInt1402 = 0;
			} else if (arg0[1].equals("office")) {
				Static59.anInt1402 = 1;
			} else if (arg0[1].equals("local")) {
				Static59.anInt1402 = 2;
			} else {
				Static182.method3113();
			}
			if (arg0[2].equals("live")) {
				Static98.anInt2163 = 0;
			} else if (arg0[2].equals("rc")) {
				Static98.anInt2163 = 1;
			} else if (arg0[2].equals("wip")) {
				Static98.anInt2163 = 2;
			} else {
				Static182.method3113();
			}
			if (arg0[3].equals("lowmem")) {
				Static97.method1628();
			} else if (arg0[3].equals("highmem")) {
				Static62.method1110();
			} else {
				Static182.method3113();
			}
			if (arg0[4].equals("free")) {
				Static44.aBoolean40 = false;
			} else if (arg0[4].equals("members")) {
				Static44.aBoolean40 = true;
			} else {
				Static182.method3113();
			}
			if (arg0[5].equals("english")) {
				Static125.anInt2756 = 0;
			} else if (arg0[5].equals("german")) {
				Static162.method2838();
				Static149.aClass81_1210 = Static175.aClass81_1026;
				Static125.anInt2756 = 1;
			} else {
				Static182.method3113();
			}
			if (arg0[6].equals("game0")) {
				Static96.anInt2113 = 0;
			} else if (arg0[6].equals("game1")) {
				Static96.anInt2113 = 1;
			} else {
				Static182.method3113();
			}
			Static99.aString6 = "127.0.0.1";
			@Pc(174) client local174 = new client();
			local174.method596(Static98.anInt2163 + 32, "runescape");
			Static40.aFrame1.setLocation(40, 40);
		} catch (@Pc(191) Exception local191) {
			Static5.method115(null, local191);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method610() {
		if (Static112.anInt2525 != 1000) {
			@Pc(14) boolean local14 = Static27.method608();
			if (!local14) {
				this.method611();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method592()) {
			return;
		}
		Static48.anInt3637 = Integer.parseInt(this.getParameter("worldid"));
		Static98.anInt2163 = Integer.parseInt(this.getParameter("modewhat"));
		Static59.anInt1402 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static97.method1628();
		} else {
			Static62.method1110();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static44.aBoolean40 = true;
		} else {
			Static44.aBoolean40 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static162.method2838();
			Static149.aClass81_1210 = Static175.aClass81_1026;
			Static125.anInt2756 = 1;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static96.anInt2113 = 1;
		} else {
			Static96.anInt2113 = 0;
		}
		try {
			Static146.anInt3191 = Integer.parseInt(this.getParameter("js"));
			Static154.anInt3506 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(101) Exception local101) {
		}
		Static99.aString6 = this.getCodeBase().getHost();
		this.method605(Static98.anInt2163 + 32);
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method611() {
		if (Static115.anInt2593 >= 4) {
			this.method599("js5crc");
			Static112.anInt2525 = 1000;
			return;
		}
		if (Static40.anInt1052 >= 4) {
			if (Static112.anInt2525 <= 5) {
				this.method599("js5io");
				Static112.anInt2525 = 1000;
				return;
			}
			Static181.anInt4087 = 3000;
			Static40.anInt1052 = 3;
		}
		if (Static181.anInt4087-- > 0) {
			return;
		}
		try {
			if (Static11.anInt655 == 0) {
				Static104.aClass47_4 = Static86.aClass68_2.method2222(Static141.anInt722, Static99.aString6);
				Static11.anInt655++;
			}
			if (Static11.anInt655 == 1) {
				if (Static104.aClass47_4.anInt1949 == 2) {
					this.method614(-1);
					return;
				}
				if (Static104.aClass47_4.anInt1949 == 1) {
					Static11.anInt655++;
				}
			}
			if (Static11.anInt655 == 2) {
				Static110.aClass41_1 = new Class41((Socket) Static104.aClass47_4.anObject1, Static86.aClass68_2);
				@Pc(89) Class1_Sub8 local89 = new Class1_Sub8(5);
				local89.method331(15);
				local89.method328(485);
				Static110.aClass41_1.method1339(5, local89.aByteArray3);
				Static11.anInt655++;
				Static113.aLong92 = Static23.method507();
			}
			if (Static11.anInt655 == 3) {
				if (Static112.anInt2525 <= 5 || Static110.aClass41_1.method1344() > 0) {
					@Pc(134) int local134 = Static110.aClass41_1.method1343();
					if (local134 != 0) {
						this.method614(local134);
						return;
					}
					Static11.anInt655++;
				} else if (Static23.method507() - Static113.aLong92 > 30000L) {
					this.method614(-2);
					return;
				}
			}
			if (Static11.anInt655 == 4) {
				Static73.method1275(Static112.anInt2525 > 20, Static110.aClass41_1);
				Static100.anInt2168 = 0;
				Static104.aClass47_4 = null;
				Static11.anInt655 = 0;
				Static110.aClass41_1 = null;
			}
		} catch (@Pc(190) IOException local190) {
			this.method614(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method595() {
		Static142.anInt3104++;
		if (Static142.anInt3104 % 1000 == 1) {
			@Pc(20) GregorianCalendar local20 = new GregorianCalendar();
			Static33.anInt924 = local20.get(11) * 600 + local20.get(12) * 10 + local20.get(13) / 6;
			Static137.aRandom1.setSeed((long) Static33.anInt924);
		}
		this.method610();
		Static79.method1350();
		Static60.method1069();
		Static81.method1360();
		Static11.method561();
		Static162.method2835();
		if (Static13.aClass6_1 != null) {
			@Pc(70) int local70 = Static13.aClass6_1.method558();
			Static125.anInt2757 = local70;
		}
		if (Static112.anInt2525 == 0) {
			Static61.method1106();
			Static95.method1593();
		} else if (Static112.anInt2525 == 5) {
			Static25.method551(this);
			Static61.method1106();
			Static95.method1593();
		} else if (Static112.anInt2525 == 10) {
			Static25.method551(this);
		} else if (Static112.anInt2525 == 20) {
			Static25.method551(this);
			Static98.method1643();
		} else if (Static112.anInt2525 == 25) {
			Static10.method179();
		}
		if (Static112.anInt2525 == 30) {
			Static42.method808();
		} else if (Static112.anInt2525 == 40) {
			Static98.method1643();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method589() {
		@Pc(14) boolean local14 = Static181.method3109();
		if (local14 && Static141.aBoolean23 && Static139.aClass31_2 != null) {
			Static139.aClass31_2.method2988();
		}
		if (Static157.aBoolean151) {
			Static187.method3153(Static114.aCanvas3);
			Static37.method745(Static114.aCanvas3);
			if (Static13.aClass6_1 != null) {
				Static13.aClass6_1.method559(Static114.aCanvas3);
			}
			this.method593();
			Static60.method1075(Static114.aCanvas3);
			Static113.method1994(Static114.aCanvas3);
			if (Static13.aClass6_1 != null) {
				Static13.aClass6_1.method562(Static114.aCanvas3);
			}
		}
		if (Static112.anInt2525 == 0) {
			Static83.method1389(Static44.anInt1088, Static165.aClass81_1338, null);
		} else if (Static112.anInt2525 == 5) {
			Static171.method3013(Static110.aClass1_Sub2_Sub2_Sub2_Sub1_3, Static108.aClass1_Sub2_Sub2_Sub2_Sub1_2);
		} else if (Static112.anInt2525 == 10) {
			Static171.method3013(Static110.aClass1_Sub2_Sub2_Sub2_Sub1_3, Static108.aClass1_Sub2_Sub2_Sub2_Sub1_2);
		} else if (Static112.anInt2525 == 20) {
			Static171.method3013(Static110.aClass1_Sub2_Sub2_Sub2_Sub1_3, Static108.aClass1_Sub2_Sub2_Sub2_Sub1_2);
		} else if (Static112.anInt2525 == 25) {
			@Pc(150) int local150;
			if (Static172.anInt3995 == 1) {
				if (Static120.anInt2671 < Static104.anInt2270) {
					Static120.anInt2671 = Static104.anInt2270;
				}
				local150 = (Static120.anInt2671 - Static104.anInt2270) * 50 / Static120.anInt2671;
				Static63.method1116(false, Static127.method2169(new Class81[] { Static71.aClass81_597, Static8.aClass81_84, Static149.method2548(local150), Static95.aClass81_731 }));
			} else if (Static172.anInt3995 == 2) {
				if (Static108.anInt2415 > Static126.anInt2770) {
					Static126.anInt2770 = Static108.anInt2415;
				}
				local150 = (Static126.anInt2770 - Static108.anInt2415) * 50 / Static126.anInt2770 + 50;
				Static63.method1116(false, Static127.method2169(new Class81[] { Static71.aClass81_597, Static8.aClass81_84, Static149.method2548(local150), Static95.aClass81_731 }));
			} else {
				Static63.method1116(false, Static71.aClass81_597);
			}
		} else if (Static112.anInt2525 == 30) {
			Static100.method1648();
		} else if (Static112.anInt2525 == 40) {
			Static63.method1116(false, Static127.method2169(new Class81[] { Static40.aClass81_363, Static148.aClass81_1200, Static141.aClass81_248 }));
		}
		@Pc(254) int local254;
		@Pc(252) Graphics local252;
		if (Static112.anInt2525 == 30 && Static161.anInt3668 == 0 && !Static139.aBoolean119) {
			try {
				local252 = Static114.aCanvas3.getGraphics();
				for (local254 = 0; local254 < Static11.anInt651; local254++) {
					if (Static119.aBooleanArray14[local254]) {
						Static147.aClass34_1.method1637(local252, Static50.anIntArray98[local254], Static171.anIntArray418[local254], Static118.anIntArray280[local254], Static175.anIntArray307[local254]);
						Static119.aBooleanArray14[local254] = false;
					}
				}
			} catch (@Pc(290) Exception local290) {
				Static114.aCanvas3.repaint();
			}
		} else if (Static112.anInt2525 > 0) {
			try {
				local252 = Static114.aCanvas3.getGraphics();
				Static147.aClass34_1.method1633(local252);
				Static139.aBoolean119 = false;
				for (local254 = 0; local254 < Static11.anInt651; local254++) {
					Static119.aBooleanArray14[local254] = false;
				}
			} catch (@Pc(327) Exception local327) {
				Static114.aCanvas3.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method601() {
		Static27.method609();
		Static161.method2816();
		Static141.method598();
		Static99.method2679();
		Static114.method1635();
		Static93.method1577();
		Static157.method2706();
		Static85.method315();
		Static77.method1342();
		Static167.method2980();
		Static127.method2166();
		Static126.method2163();
		Static140.method2368();
		Static17.method369();
		Static59.method1040();
		Static146.method2497();
		Static61.method1103();
		Static63.method1124();
		Static9.method137();
		Static11.method563();
		Static43.method817();
		Static118.method2030();
		Static185.method2997();
		Static41.method804();
		Static182.method3119();
		Static165.method2890();
		Static32.method2361();
		Static163.method2846();
		Static38.method763();
		Static7.method124();
		Static117.method3136();
		Static57.method1012();
		Static86.method1473();
		Static112.method1964();
		Static124.method1450();
		Static88.method1498();
		Static173.method3045();
		Static177.method3061();
		Static80.method1359();
		Static144.method2428();
		Static171.method3012();
		Static48.method2780();
		Static46.method849();
		Static119.method2034();
		Static78.method1347();
		Static159.method2758();
		Static100.method1646();
		Static28.method615();
		Static29.method616();
		Static133.method2258();
		Static35.method739();
		Static19.method396();
		Static23.method506();
		Static104.method1708();
		Static6.method116();
		Static174.method2950();
		Static74.method1314();
		Static8.method128();
		Static69.method1232();
		Static71.method1256();
		Static180.method3083();
		Static147.method2502();
		Static37.method744();
		Static62.method1108();
		Static132.method2256();
		Static73.method1276();
		Static42.method807();
		Static116.method2025();
		Static4.method2579();
		Static89.method3068();
		Static22.method494();
		Static1.method13();
		Static91.method1523();
		Static53.method958();
		Static166.method2910();
		Static83.method1392();
		Static156.method2704();
		Static138.method2326();
		Static149.method2544();
		Static52.method944();
		Static109.method1828();
		Static108.method1810();
		Static84.method1468();
		Static49.method868();
		Static51.method911();
		Static21.method418();
		Static97.method1630();
		Static158.method2725();
		Static178.method3074();
		Static186.method1950();
		Static58.method1032();
		Static18.method388();
		Static122.method2148();
		Static67.method1204();
		Static16.method240();
		Static81.method1361();
		Static33.method713();
		Static14.method221();
		Static66.method1200();
		Static125.method2160();
		Static47.method852();
		Static5.method114();
		Static26.method568();
		Static36.method742();
		Static123.method2154();
		Static101.method1674();
		Static160.method2786();
		Static20.method403();
		Static3.method74();
		Static13.method210();
		Static72.method1259();
		Static139.method2338();
		Static75.method1328();
		Static68.method1221();
		Static54.method966();
		Static155.method2688();
		Static98.method1641();
		Static175.method2239();
		Static44.method819();
		Static110.method1954();
		Static111.method1959();
		Static169.method3004();
		Static145.method2484();
		Static183.method3128();
		Static134.method2261();
		Static168.method2986();
		Static90.method1512();
		Static15.method229();
		Static76.method1335();
		Static154.method2678();
		Static176.method3055();
		Static179.method3082();
		Static55.method980();
		Static39.method771();
		Static170.method3005();
		Static131.method2243();
		Static12.method3152();
		Static70.method1239();
		Static184.method3133();
		Static87.method1494();
		Static95.method1590();
		Static2.method20();
		Static135.method1570();
		Static181.method3105();
		Static142.method2391();
		Static164.method2874();
		Static82.method1383();
		Static115.method2020();
		Static120.method2059();
		Static105.method1729();
		Static56.method1007();
		Static151.method2631();
		Static40.method795();
		Static50.method893();
		Static150.method2608();
		Static102.method1695();
		Static45.method847();
		Static137.method2312();
		Static148.method2525();
		Static65.method1182();
		Static143.method2415();
		Static92.method1576();
		Static96.method1615();
		Static172.method3036();
		Static107.method1778();
		Static106.method1755();
		Static129.method2220();
		Static113.method1998();
		Static153.method2675();
		Static187.method3154();
		Static31.method678();
		Static136.method2282();
		Static24.method528();
		Static121.method2086();
		Static10.method182();
		Static34.method736();
		Static128.method2199();
		Static30.method640();
		Static25.method550();
		Static152.method2651();
		Static60.method1073();
		Static64.method1161();
		Static103.method1703();
		Static162.method2837();
		Static94.method1581();
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method604() {
		if (Static40.aClass51_1 != null) {
			Static40.aClass51_1.aBoolean88 = false;
		}
		Static40.aClass51_1 = null;
		if (Static158.aClass41_3 != null) {
			Static158.aClass41_3.method1340();
			Static158.aClass41_3 = null;
		}
		Static127.method2173();
		Static33.method712();
		Static13.aClass6_1 = null;
		if (Static139.aClass31_2 != null) {
			Static139.aClass31_2.method3001();
		}
		if (Static80.aClass31_1 != null) {
			Static80.aClass31_1.method3001();
		}
		Static64.method1162();
		Static171.method3009();
		try {
			if (Static158.aClass67_5 != null) {
				Static158.aClass67_5.method2171();
			}
			if (Static47.aClass67Array1 != null) {
				for (@Pc(50) int local50 = 0; local50 < Static47.aClass67Array1.length; local50++) {
					if (Static47.aClass67Array1[local50] != null) {
						Static47.aClass67Array1[local50].method2171();
					}
				}
			}
			if (Static54.aClass67_2 != null) {
				Static54.aClass67_2.method2171();
			}
			if (Static19.aClass67_1 != null) {
				Static19.aClass67_1.method2171();
			}
		} catch (@Pc(86) IOException local86) {
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method591() {
		if (Static96.anInt2113 == 1) {
			Static108.aShortArray24 = Static54.aShortArray20;
			Static6.aShortArray1 = Static46.aShortArray10;
			Static118.aShortArrayArray5 = Static37.aShortArrayArray1;
			Static58.aShortArrayArray2 = Static110.aShortArrayArray3;
		} else {
			Static6.aShortArray1 = Static42.aShortArray9;
			Static118.aShortArrayArray5 = Static115.aShortArrayArray4;
			Static108.aShortArray24 = Static31.aShortArray4;
			Static58.aShortArrayArray2 = Static127.aShortArrayArray6;
		}
		Static97.anInt2131 = Static59.anInt1402 == 0 ? 43594 : Static48.anInt3637 + 40000;
		Static141.anInt722 = Static97.anInt2131;
		Static187.anInt4144 = Static59.anInt1402 == 0 ? 443 : Static48.anInt3637 + 50000;
		Static11.method565();
		Static60.method1075(Static114.aCanvas3);
		Static113.method1994(Static114.aCanvas3);
		Static13.aClass6_1 = Static176.method3056();
		if (Static13.aClass6_1 != null) {
			Static13.aClass6_1.method562(Static114.aCanvas3);
		}
		Static157.anInt3574 = Static130.anInt2845;
		try {
			if (Static86.aClass68_2.aClass56_3 != null) {
				Static158.aClass67_5 = new Class67(Static86.aClass68_2.aClass56_3, 5200, 0);
				for (@Pc(85) int local85 = 0; local85 < 16; local85++) {
					Static47.aClass67Array1[local85] = new Class67(Static86.aClass68_2.aClass56Array1[local85], 6000, 0);
				}
				Static54.aClass67_2 = new Class67(Static86.aClass68_2.aClass56_2, 6000, 0);
				Static73.aClass66_2 = new Class66(255, Static158.aClass67_5, Static54.aClass67_2, 500000);
				Static19.aClass67_1 = new Class67(Static86.aClass68_2.aClass56_4, 24, 0);
				Static86.aClass68_2.aClass56_3 = null;
				Static86.aClass68_2.aClass56_4 = null;
				Static86.aClass68_2.aClass56_2 = null;
				Static86.aClass68_2.aClass56Array1 = null;
			}
		} catch (@Pc(141) IOException local141) {
			Static54.aClass67_2 = null;
			Static19.aClass67_1 = null;
			Static73.aClass66_2 = null;
			Static158.aClass67_5 = null;
		}
		if (Static59.anInt1402 != 0) {
			Static67.aBoolean65 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method614(@OriginalArg(0) int arg0) {
		if (Static97.anInt2131 == Static141.anInt722) {
			Static141.anInt722 = Static187.anInt4144;
		} else {
			Static141.anInt722 = Static97.anInt2131;
		}
		Static110.aClass41_1 = null;
		Static11.anInt655 = 0;
		Static100.anInt2168++;
		Static104.aClass47_4 = null;
		if (Static100.anInt2168 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static112.anInt2525 > 5) {
				Static181.anInt4087 = 3000;
			} else {
				this.method599("js5connect_full");
				Static112.anInt2525 = 1000;
			}
		} else if (Static100.anInt2168 >= 2 && arg0 == 6) {
			this.method599("js5connect_outofdate");
			Static112.anInt2525 = 1000;
		} else if (Static100.anInt2168 >= 4) {
			if (Static112.anInt2525 <= 5) {
				this.method599("js5connect");
				Static112.anInt2525 = 1000;
			} else {
				Static181.anInt4087 = 3000;
			}
		}
	}
}
