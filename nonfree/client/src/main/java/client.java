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
				Static113.method1442();
			}
			Static179.anInt3950 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static114.anInt2715 = 0;
			} else if (arg0[1].equals("office")) {
				Static114.anInt2715 = 1;
			} else if (arg0[1].equals("local")) {
				Static114.anInt2715 = 2;
			} else {
				Static113.method1442();
			}
			if (arg0[2].equals("live")) {
				Static157.anInt3504 = 0;
			} else if (arg0[2].equals("rc")) {
				Static157.anInt3504 = 1;
			} else if (arg0[2].equals("wip")) {
				Static157.anInt3504 = 2;
			} else {
				Static113.method1442();
			}
			if (arg0[3].equals("lowmem")) {
				Static161.method2581();
			} else if (arg0[3].equals("highmem")) {
				Static79.method1324();
			} else {
				Static113.method1442();
			}
			if (arg0[4].equals("free")) {
				Static52.aBoolean41 = false;
			} else if (arg0[4].equals("members")) {
				Static52.aBoolean41 = true;
			} else {
				Static113.method1442();
			}
			if (arg0[5].equals("english")) {
				Static122.anInt2902 = 0;
			} else if (arg0[5].equals("german")) {
				Static8.method229();
				Static38.aClass46_300 = Static106.aClass46_838;
				Static122.anInt2902 = 1;
			} else {
				Static113.method1442();
			}
			if (arg0[6].equals("game0")) {
				Static124.anInt2956 = 0;
			} else if (arg0[6].equals("game1")) {
				Static124.anInt2956 = 1;
			} else {
				Static113.method1442();
			}
			Static37.aString1 = "127.0.0.1";
			@Pc(180) client local180 = new client();
			local180.method479("runescape", Static157.anInt3504 + 32);
			Static58.aFrame1.setLocation(40, 40);
		} catch (@Pc(197) Exception local197) {
			Static124.method2117(null, local197);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method477()) {
			return;
		}
		Static179.anInt3950 = Integer.parseInt(this.getParameter("worldid"));
		Static157.anInt3504 = Integer.parseInt(this.getParameter("modewhat"));
		Static114.anInt2715 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static161.method2581();
		} else {
			Static79.method1324();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static52.aBoolean41 = true;
		} else {
			Static52.aBoolean41 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static8.method229();
			Static38.aClass46_300 = Static106.aClass46_838;
			Static122.anInt2902 = 1;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static124.anInt2956 = 1;
		} else {
			Static124.anInt2956 = 0;
		}
		try {
			Static62.anInt1655 = Integer.parseInt(this.getParameter("js"));
			Static48.anInt1331 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(101) Exception local101) {
		}
		Static37.aString1 = this.getCodeBase().getHost();
		this.method465(Static157.anInt3504 + 32);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method482() {
		if (Static26.anInt597 != 1000) {
			@Pc(14) boolean local14 = Static105.method1727();
			if (!local14) {
				this.method483();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method483() {
		if (Static160.anInt3564 >= 4) {
			this.method473("js5crc");
			Static26.anInt597 = 1000;
			return;
		}
		if (Static2.anInt22 >= 4) {
			if (Static26.anInt597 <= 5) {
				this.method473("js5io");
				Static26.anInt597 = 1000;
				return;
			}
			Static84.anInt2082 = 3000;
			Static2.anInt22 = 3;
		}
		if (Static84.anInt2082-- > 0) {
			return;
		}
		try {
			if (Static78.anInt2389 == 0) {
				Static63.aClass14_4 = Static66.aClass68_4.method2199(Static37.aString1, Static105.anInt2512);
				Static78.anInt2389++;
			}
			if (Static78.anInt2389 == 1) {
				if (Static63.aClass14_4.anInt516 == 2) {
					this.method486(-1);
					return;
				}
				if (Static63.aClass14_4.anInt516 == 1) {
					Static78.anInt2389++;
				}
			}
			if (Static78.anInt2389 == 2) {
				Static180.aClass1_4 = new Class1((Socket) Static63.aClass14_4.anObject1, Static66.aClass68_4);
				@Pc(105) Class3_Sub4 local105 = new Class3_Sub4(5);
				local105.method206(15);
				local105.method188(479);
				Static180.aClass1_4.method6(local105.aByteArray5, 5);
				Static78.anInt2389++;
				Static100.aLong80 = Static150.method2481();
			}
			if (Static78.anInt2389 == 3) {
				if (Static26.anInt597 <= 5 || Static180.aClass1_4.method4() > 0) {
					@Pc(164) int local164 = Static180.aClass1_4.method2();
					if (local164 != 0) {
						this.method486(local164);
						return;
					}
					Static78.anInt2389++;
				} else if (Static150.method2481() - Static100.aLong80 > 30000L) {
					this.method486(-2);
					return;
				}
			}
			if (Static78.anInt2389 == 4) {
				Static93.method1558(Static26.anInt597 > 20, Static180.aClass1_4);
				Static174.anInt3823 = 0;
				Static63.aClass14_4 = null;
				Static78.anInt2389 = 0;
				Static180.aClass1_4 = null;
			}
		} catch (@Pc(200) IOException local200) {
			this.method486(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method474() {
		if (Static89.aClass84_1 != null) {
			Static89.aClass84_1.aBoolean161 = false;
		}
		Static89.aClass84_1 = null;
		if (Static129.aClass1_3 != null) {
			Static129.aClass1_3.method10();
			Static129.aClass1_3 = null;
		}
		Static160.method2575();
		Static158.method2549();
		Static99.aClass49_1 = null;
		if (Static139.aClass12_2 != null) {
			Static139.aClass12_2.method2671();
		}
		if (Static127.aClass12_1 != null) {
			Static127.aClass12_1.method2671();
		}
		Static100.method1646();
		Static151.method2488();
		try {
			if (Static53.aClass6_3 != null) {
				Static53.aClass6_3.method284();
			}
			if (Static110.aClass6Array1 != null) {
				for (@Pc(48) int local48 = 0; local48 < Static110.aClass6Array1.length; local48++) {
					if (Static110.aClass6Array1[local48] != null) {
						Static110.aClass6Array1[local48].method284();
					}
				}
			}
			if (Static65.aClass6_4 != null) {
				Static65.aClass6_4.method284();
			}
			if (Static135.aClass6_5 != null) {
				Static135.aClass6_5.method284();
			}
		} catch (@Pc(76) IOException local76) {
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method472() {
		Static20.anInt512++;
		if (Static20.anInt512 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static20.anInt509 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static108.aRandom1.setSeed((long) Static20.anInt509);
		}
		this.method482();
		Static63.method1144();
		Static64.method1145();
		Static177.method2831();
		Static101.method1655();
		Static179.method2878();
		if (Static99.aClass49_1 != null) {
			@Pc(66) int local66 = Static99.aClass49_1.method1441();
			Static105.anInt2516 = local66;
		}
		if (Static26.anInt597 == 0) {
			Static106.method1740();
			Static135.method2311();
		} else if (Static26.anInt597 == 5) {
			Static94.method1563(this);
			Static106.method1740();
			Static135.method2311();
		} else if (Static26.anInt597 == 10) {
			Static94.method1563(this);
		} else if (Static26.anInt597 == 20) {
			Static94.method1563(this);
			Static1.method8();
		} else if (Static26.anInt597 == 25) {
			Static61.method1130();
		}
		if (Static26.anInt597 == 30) {
			Static58.method1093();
		} else if (Static26.anInt597 == 40) {
			Static1.method8();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method471() {
		Static28.method481();
		Static81.method1350();
		Static85.method478();
		Static149.method2588();
		Static167.method522();
		Static172.method2725();
		Static140.method173();
		Static1.method7();
		Static99.method1636();
		Static13.method294();
		Static51.method1005();
		Static65.method1171();
		Static8.method230();
		Static117.method1997();
		Static133.method2260();
		Static55.method1027();
		Static31.method574();
		Static106.method1739();
		Static98.method1606();
		Static113.method1443();
		Static119.method2037();
		Static50.method998();
		Static41.method2660();
		Static74.method1243();
		Static124.method2123();
		Static34.method601();
		Static97.method1170();
		Static158.method2550();
		Static174.method2745();
		Static67.method1183();
		Static39.method2902();
		Static46.method911();
		Static155.method2524();
		Static104.method1718();
		Static45.method1796();
		Static154.method2519();
		Static61.method1128();
		Static177.method2829();
		Static107.method1747();
		Static23.method414();
		Static24.method415();
		Static4.method2682();
		Static2.method12();
		Static66.method1176();
		Static110.method1812();
		Static115.method1945();
		Static18.method335();
		Static75.method1252();
		Static16.method320();
		Static126.method2151();
		Static173.method2728();
		Static136.method2318();
		Static150.method2480();
		Static171.method2721();
		Static20.method399();
		Static78.method1627();
		Static135.method2317();
		Static116.method1959();
		Static120.method2040();
		Static147.method2434();
		Static69.method1188();
		Static63.method1142();
		Static87.method1451();
		Static29.method487();
		Static14.method302();
		Static143.method2385();
		Static181.method2897();
		Static105.method1725();
		Static22.method410();
		Static103.method2225();
		Static12.method2887();
		Static132.method2238();
		Static151.method2490();
		Static164.method2622();
		Static19.method364();
		Static145.method2411();
		Static142.method2372();
		Static156.method2534();
		Static56.method1051();
		Static139.method2346();
		Static70.method1211();
		Static146.method2431();
		Static109.method1806();
		Static40.method843();
		Static47.method938();
		Static118.method2028();
		Static179.method2870();
		Static180.method2894();
		Static111.method1824();
		Static138.method814();
		Static176.method2827();
		Static57.method1069();
		Static153.method2514();
		Static53.method1007();
		Static42.method850();
		Static52.method1006();
		Static33.method583();
		Static95.method1571();
		Static54.method1023();
		Static129.method2167();
		Static71.method1213();
		Static91.method1512();
		Static101.method1654();
		Static94.method1561();
		Static11.method281();
		Static112.method1843();
		Static79.method1323();
		Static175.method2759();
		Static114.method1919();
		Static168.method2687();
		Static161.method2582();
		Static59.method1102();
		Static37.method657();
		Static7.method102();
		Static72.method1220();
		Static162.method2591();
		Static15.method317();
		Static21.method2163();
		Static100.method1647();
		Static68.method1186();
		Static159.method2552();
		Static166.method2672();
		Static76.method1254();
		Static157.method2542();
		Static144.method2394();
		Static84.method1409();
		Static137.method2327();
		Static17.method325();
		Static44.method875();
		Static134.method2269();
		Static127.method2152();
		Static5.method91();
		Static82.method1398();
		Static64.method1147();
		Static89.method1476();
		Static25.method2907();
		Static27.method443();
		Static32.method576();
		Static26.method437();
		Static83.method1401();
		Static170.method2715();
		Static148.method2574();
		Static130.method2190();
		Static9.method255();
		Static86.method1431();
		Static92.method1535();
		Static122.method2086();
		Static30.method516();
		Static123.method2109();
		Static48.method965();
		Static36.method653();
		Static163.method2612();
		Static169.method2710();
		Static35.method629();
		Static58.method1091();
		Static141.method2368();
		Static77.method1278();
		Static38.method683();
		Static88.method1474();
		Static182.method2919();
		Static160.method2578();
		Static43.method873();
		Static152.method2513();
		Static49.method994();
		Static178.method2857();
		Static96.method1595();
		Static80.method1347();
		Static3.method58();
		Static10.method278();
		Static93.method1559();
		Static90.method1504();
		Static102.method1676();
		Static60.method1124();
		Static73.method1241();
		Static165.method2654();
		Static108.method1770();
		Static121.method2063();
		Static125.method2148();
		Static128.method2160();
		Static62.method1139();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method466() {
		@Pc(8) boolean local8 = Static128.method2159();
		if (local8 && Static150.aBoolean146 && Static139.aClass12_2 != null) {
			Static139.aClass12_2.method2670();
		}
		if (Static26.aBoolean20) {
			Static9.method254(Static100.aCanvas1);
			Static139.method2345(Static100.aCanvas1);
			if (Static99.aClass49_1 != null) {
				Static99.aClass49_1.method1446(Static100.aCanvas1);
			}
			this.method467();
			Static118.method2027(Static100.aCanvas1);
			Static174.method2738(Static100.aCanvas1);
			if (Static99.aClass49_1 != null) {
				Static99.aClass49_1.method1445(Static100.aCanvas1);
			}
		}
		if (Static26.anInt597 == 0) {
			Static87.method1453(Static130.aClass46_1059, Static52.anInt1390, null);
		} else if (Static26.anInt597 == 5) {
			Static66.method1175(Static58.aClass3_Sub2_Sub3_Sub1_Sub1_4, Static178.aClass3_Sub2_Sub3_Sub1_Sub1_5);
		} else if (Static26.anInt597 == 10) {
			Static66.method1175(Static58.aClass3_Sub2_Sub3_Sub1_Sub1_4, Static178.aClass3_Sub2_Sub3_Sub1_Sub1_5);
		} else if (Static26.anInt597 == 20) {
			Static66.method1175(Static58.aClass3_Sub2_Sub3_Sub1_Sub1_4, Static178.aClass3_Sub2_Sub3_Sub1_Sub1_5);
		} else if (Static26.anInt597 == 25) {
			@Pc(89) int local89;
			if (Static125.anInt3006 == 1) {
				if (Static10.anInt347 < Static92.anInt2257) {
					Static10.anInt347 = Static92.anInt2257;
				}
				local89 = (Static10.anInt347 - Static92.anInt2257) * 50 / Static10.anInt347;
				Static139.method2339(Static178.method2860(new Class46[] { Static31.aClass46_232, Static174.aClass46_1372, Static57.method1068(local89), Static52.aClass46_455 }), false);
			} else if (Static125.anInt3006 == 2) {
				if (Static57.anInt1542 < Static74.anInt1886) {
					Static57.anInt1542 = Static74.anInt1886;
				}
				local89 = (Static57.anInt1542 - Static74.anInt1886) * 50 / Static57.anInt1542 + 50;
				Static139.method2339(Static178.method2860(new Class46[] { Static31.aClass46_232, Static174.aClass46_1372, Static57.method1068(local89), Static52.aClass46_455 }), false);
			} else {
				Static139.method2339(Static31.aClass46_232, false);
			}
		} else if (Static26.anInt597 == 30) {
			Static161.method2584();
		} else if (Static26.anInt597 == 40) {
			Static139.method2339(Static178.method2860(new Class46[] { Static129.aClass46_1051, Static112.aClass46_907, Static79.aClass46_681 }), false);
		}
		@Pc(256) int local256;
		@Pc(246) Graphics local246;
		if (Static26.anInt597 == 30 && Static127.anInt3012 == 0 && !Static159.aBoolean149) {
			try {
				local246 = Static100.aCanvas1.getGraphics();
				for (local256 = 0; local256 < Static21.anInt3036; local256++) {
					if (Static77.aBooleanArray10[local256]) {
						Static139.aClass8_1.method520(Static42.anIntArray104[local256], local246, Static119.anIntArray326[local256], Static54.anIntArray133[local256], Static33.anIntArray68[local256]);
						Static77.aBooleanArray10[local256] = false;
					}
				}
			} catch (@Pc(316) Exception local316) {
				Static100.aCanvas1.repaint();
			}
		} else if (Static26.anInt597 > 0) {
			try {
				local246 = Static100.aCanvas1.getGraphics();
				Static139.aClass8_1.method524(local246);
				Static159.aBoolean149 = false;
				for (local256 = 0; local256 < Static21.anInt3036; local256++) {
					Static77.aBooleanArray10[local256] = false;
				}
			} catch (@Pc(272) Exception local272) {
				Static100.aCanvas1.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method480() {
		if (Static124.anInt2956 == 1) {
			Static113.aShortArray13 = Static52.aShortArray7;
			Static106.aShortArray15 = Static50.aShortArray5;
			Static22.aShortArrayArray3 = Static72.aShortArrayArray6;
			Static167.aShortArrayArray4 = Static63.aShortArrayArray5;
		} else {
			Static22.aShortArrayArray3 = Static77.aShortArrayArray7;
			Static106.aShortArray15 = Static98.aShortArray14;
			Static113.aShortArray13 = Static51.aShortArray6;
			Static167.aShortArrayArray4 = Static182.aShortArrayArray8;
		}
		Static35.anInt990 = Static114.anInt2715 == 0 ? 43594 : Static179.anInt3950 + 40000;
		Static105.anInt2512 = Static35.anInt990;
		Static90.anInt2210 = Static114.anInt2715 == 0 ? 443 : Static179.anInt3950 + 50000;
		Static107.method1748();
		Static118.method2027(Static100.aCanvas1);
		Static174.method2738(Static100.aCanvas1);
		Static99.aClass49_1 = Static154.method2518();
		if (Static99.aClass49_1 != null) {
			Static99.aClass49_1.method1445(Static100.aCanvas1);
		}
		Static104.anInt2509 = Static131.anInt3076;
		try {
			if (Static66.aClass68_4.aClass23_4 != null) {
				Static53.aClass6_3 = new Class6(Static66.aClass68_4.aClass23_4, 5200, 0);
				for (@Pc(84) int local84 = 0; local84 < 16; local84++) {
					Static110.aClass6Array1[local84] = new Class6(Static66.aClass68_4.aClass23Array1[local84], 6000, 0);
				}
				Static65.aClass6_4 = new Class6(Static66.aClass68_4.aClass23_2, 6000, 0);
				Static152.aClass30_4 = new Class30(255, Static53.aClass6_3, Static65.aClass6_4, 500000);
				Static135.aClass6_5 = new Class6(Static66.aClass68_4.aClass23_3, 24, 0);
				Static66.aClass68_4.aClass23_3 = null;
				Static66.aClass68_4.aClass23_4 = null;
				Static66.aClass68_4.aClass23_2 = null;
				Static66.aClass68_4.aClass23Array1 = null;
			}
		} catch (@Pc(140) IOException local140) {
			Static65.aClass6_4 = null;
			Static135.aClass6_5 = null;
			Static152.aClass30_4 = null;
			Static53.aClass6_3 = null;
		}
		if (Static114.anInt2715 != 0) {
			Static165.aBoolean157 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method486(@OriginalArg(0) int arg0) {
		Static180.aClass1_4 = null;
		Static63.aClass14_4 = null;
		Static174.anInt3823++;
		if (Static35.anInt990 == Static105.anInt2512) {
			Static105.anInt2512 = Static90.anInt2210;
		} else {
			Static105.anInt2512 = Static35.anInt990;
		}
		Static78.anInt2389 = 0;
		if (Static174.anInt3823 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static26.anInt597 <= 5) {
				this.method473("js5connect_full");
				Static26.anInt597 = 1000;
			} else {
				Static84.anInt2082 = 3000;
			}
		} else if (Static174.anInt3823 >= 2 && arg0 == 6) {
			this.method473("js5connect_outofdate");
			Static26.anInt597 = 1000;
		} else if (Static174.anInt3823 >= 4) {
			if (Static26.anInt597 <= 5) {
				this.method473("js5connect");
				Static26.anInt597 = 1000;
			} else {
				Static84.anInt2082 = 3000;
			}
		}
	}
}
