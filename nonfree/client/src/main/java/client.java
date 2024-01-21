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
				Static81.method1302();
			}
			Static169.anInt3981 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static115.anInt2775 = 0;
			} else if (arg0[1].equals("office")) {
				Static115.anInt2775 = 1;
			} else if (arg0[1].equals("local")) {
				Static115.anInt2775 = 2;
			} else {
				Static81.method1302();
			}
			if (arg0[2].equals("live")) {
				Static38.anInt1087 = 0;
			} else if (arg0[2].equals("rc")) {
				Static38.anInt1087 = 1;
			} else if (arg0[2].equals("wip")) {
				Static38.anInt1087 = 2;
			} else {
				Static81.method1302();
			}
			if (arg0[3].equals("lowmem")) {
				Static139.method2152();
			} else if (arg0[3].equals("highmem")) {
				Static101.method1413();
			} else {
				Static81.method1302();
			}
			if (arg0[4].equals("free")) {
				Static19.aBoolean17 = false;
			} else if (arg0[4].equals("members")) {
				Static19.aBoolean17 = true;
			} else {
				Static81.method1302();
			}
			if (arg0[5].equals("english")) {
				Static54.anInt1438 = 0;
			} else if (arg0[5].equals("german")) {
				Static173.method2730();
				Static54.anInt1438 = 1;
				Static9.aClass6_74 = Static157.aClass6_1065;
			} else {
				Static81.method1302();
			}
			if (arg0[6].equals("game0")) {
				Static63.anInt1567 = 0;
			} else if (arg0[6].equals("game1")) {
				Static63.anInt1567 = 1;
			} else {
				Static81.method1302();
			}
			Static10.aString1 = "127.0.0.1";
			@Pc(180) client local180 = new client();
			local180.method423(Static38.anInt1087 + 32, "runescape");
			Static24.aFrame1.setLocation(40, 40);
		} catch (@Pc(197) Exception local197) {
			Static97.method1572(local197, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method432() {
		Static107.anInt2559++;
		if (Static107.anInt2559 % 1000 == 1) {
			@Pc(18) GregorianCalendar local18 = new GregorianCalendar();
			Static180.anInt4190 = local18.get(11) * 600 + local18.get(12) * 10 + local18.get(13) / 6;
			Static34.aRandom1.setSeed((long) Static180.anInt4190);
		}
		this.method443();
		Static17.method1603();
		Static10.method158();
		Static58.method957();
		Static15.method309();
		Static145.method2245();
		if (Static163.aClass50_1 != null) {
			@Pc(65) int local65 = Static163.aClass50_1.method2631();
			Static152.anInt3511 = local65;
		}
		if (Static156.anInt3638 == 0) {
			Static164.method2621();
			Static34.method620();
		} else if (Static156.anInt3638 == 5) {
			Static122.method1902(this);
			Static164.method2621();
			Static34.method620();
		} else if (Static156.anInt3638 == 10) {
			Static122.method1902(this);
		} else if (Static156.anInt3638 == 20) {
			Static122.method1902(this);
			Static171.method2716();
		} else if (Static156.anInt3638 == 25) {
			Static146.method2709();
		}
		if (Static156.anInt3638 == 30) {
			Static182.method2814();
		} else if (Static156.anInt3638 == 40) {
			Static171.method2716();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method435() {
		Static24.method441();
		Static9.method138();
		Static160.method422();
		Static6.method927();
		Static146.method2704();
		Static92.method1504();
		Static101.method1449();
		Static79.method1237();
		Static98.method1610();
		Static75.method1156();
		Static76.method1172();
		Static112.method1809();
		Static84.method1450();
		Static80.method1275();
		Static88.method1486();
		Static176.method2766();
		Static32.method593();
		Static170.method2698();
		Static26.method477();
		Static90.method2630();
		Static8.method100();
		Static102.method1696();
		Static181.method1511();
		Static177.method2769();
		Static103.method1705();
		Static67.method1077();
		Static56.method1805();
		Static154.method2346();
		Static166.method2646();
		Static105.method1733();
		Static106.method2807();
		Static46.method856();
		Static144.method2229();
		Static28.method506();
		Static147.method2313();
		Static127.method1966();
		Static54.method934();
		Static64.method1015();
		Static87.method1470();
		Static13.method209();
		Static43.method840();
		Static109.method2296();
		Static165.method2628();
		Static89.method1490();
		Static121.method1889();
		Static99.method1645();
		Static57.method944();
		Static91.method1499();
		Static137.method2124();
		Static173.method2731();
		Static21.method378();
		Static85.method1460();
		Static70.method1107();
		Static124.method1932();
		Static135.method2099();
		Static17.method1592();
		Static130.method2029();
		Static18.method351();
		Static83.method1328();
		Static61.method983();
		Static29.method519();
		Static14.method301();
		Static107.method1736();
		Static116.method1865();
		Static172.method2728();
		Static167.method2652();
		Static151.method2328();
		Static182.method2816();
		Static53.method2485();
		Static174.method2727();
		Static100.method1676();
		Static15.method306();
		Static114.method1836();
		Static122.method1904();
		Static94.method1532();
		Static4.method51();
		Static131.method2045();
		Static7.method81();
		Static30.method536();
		Static41.method749();
		Static82.method1320();
		Static150.method2322();
		Static164.method2622();
		Static139.method2151();
		Static58.method954();
		Static16.method319();
		Static95.method1544();
		Static81.method1303();
		Static175.method2509();
		Static104.method1722();
		Static136.method2121();
		Static108.method1742();
		Static3.method48();
		Static1.method2();
		Static48.method881();
		Static118.method1880();
		Static153.method2340();
		Static115.method1859();
		Static31.method538();
		Static35.method623();
		Static5.method57();
		Static49.method885();
		Static158.method2416();
		Static44.method843();
		Static138.method2142();
		Static126.method1961();
		Static23.method399();
		Static36.method635();
		Static145.method2247();
		Static50.method889();
		Static169.method2686();
		Static69.method1102();
		Static120.method1887();
		Static97.method1571();
		Static22.method390();
		Static171.method2719();
		Static60.method924();
		Static148.method2277();
		Static55.method937();
		Static52.method933();
		Static86.method1464();
		Static93.method1524();
		Static119.method1881();
		Static117.method1875();
		Static78.method1234();
		Static149.method2287();
		Static72.method1123();
		Static178.method2779();
		Static134.method2094();
		Static33.method601();
		Static140.method2158();
		Static125.method1947();
		Static45.method848();
		Static157.method2415();
		Static152.method2332();
		Static129.method2795();
		Static63.method1011();
		Static74.method1150();
		Static38.method684();
		Static128.method1969();
		Static163.method2610();
		Static155.method2676();
		Static27.method503();
		Static40.method729();
		Static77.method1231();
		Static2.method44();
		Static10.method157();
		Static73.method1147();
		Static59.method981();
		Static132.method2067();
		Static42.method835();
		Static11.method186();
		Static133.method2093();
		Static162.method2604();
		Static142.method2204();
		Static37.method663();
		Static25.method464();
		Static159.method2553();
		Static179.method2804();
		Static65.method1035();
		Static168.method2681();
		Static143.method2224();
		Static19.method371();
		Static113.method1830();
		Static141.method2182();
		Static110.method1761();
		Static34.method621();
		Static68.method1101();
		Static12.method205();
		Static66.method1058();
		Static161.method2581();
		Static51.method915();
		Static62.method1003();
		Static47.method880();
		Static123.method1929();
		Static111.method1784();
		Static96.method1568();
		Static39.method708();
		Static156.method2410();
		Static180.method2809();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method440(@OriginalArg(1) int arg0) {
		Static173.aClass43_4 = null;
		Static25.anInt672 = 0;
		Static154.anInt3554++;
		Static77.aClass11_5 = null;
		if (Static165.anInt3869 == Static120.anInt2810) {
			Static165.anInt3869 = Static132.anInt3073;
		} else {
			Static165.anInt3869 = Static120.anInt2810;
		}
		if (Static154.anInt3554 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static156.anInt3638 <= 5) {
				this.method430("js5connect_full");
				Static156.anInt3638 = 1000;
			} else {
				Static130.anInt3020 = 3000;
			}
		} else if (Static154.anInt3554 >= 2 && arg0 == 6) {
			this.method430("js5connect_outofdate");
			Static156.anInt3638 = 1000;
		} else if (Static154.anInt3554 >= 4) {
			if (Static156.anInt3638 <= 5) {
				this.method430("js5connect");
				Static156.anInt3638 = 1000;
			} else {
				Static130.anInt3020 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method436()) {
			return;
		}
		Static169.anInt3981 = Integer.parseInt(this.getParameter("worldid"));
		Static38.anInt1087 = Integer.parseInt(this.getParameter("modewhat"));
		Static115.anInt2775 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static139.method2152();
		} else {
			Static101.method1413();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static19.aBoolean17 = true;
		} else {
			Static19.aBoolean17 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static173.method2730();
			Static9.aClass6_74 = Static157.aClass6_1065;
			Static54.anInt1438 = 1;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static63.anInt1567 = 1;
		} else {
			Static63.anInt1567 = 0;
		}
		try {
			Static65.anInt1624 = Integer.parseInt(this.getParameter("js"));
			Static101.anInt2159 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(101) Exception local101) {
		}
		Static10.aString1 = this.getCodeBase().getHost();
		this.method437(Static38.anInt1087 + 32);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method421() {
		@Pc(4) boolean local4 = Static156.method2407();
		if (local4 && Static52.aBoolean56 && Static138.aClass41_3 != null) {
			Static138.aClass41_3.method1522();
		}
		if (Static9.aBoolean5) {
			Static92.method1503(Static121.aCanvas1);
			Static51.method916(Static121.aCanvas1);
			if (Static163.aClass50_1 != null) {
				Static163.aClass50_1.method2634(Static121.aCanvas1);
			}
			this.method433();
			Static133.method2087(Static121.aCanvas1);
			Static149.method2283(Static121.aCanvas1);
			if (Static163.aClass50_1 != null) {
				Static163.aClass50_1.method2629(Static121.aCanvas1);
			}
		}
		if (Static156.anInt3638 == 0) {
			Static39.method707(Static9.aClass6_76, null, Static97.anInt2401);
		} else if (Static156.anInt3638 == 5) {
			Static42.method837(Static58.aClass2_Sub3_Sub2_Sub4_Sub1_4, Static85.aClass2_Sub3_Sub2_Sub4_Sub1_5);
		} else if (Static156.anInt3638 == 10) {
			Static42.method837(Static58.aClass2_Sub3_Sub2_Sub4_Sub1_4, Static85.aClass2_Sub3_Sub2_Sub4_Sub1_5);
		} else if (Static156.anInt3638 == 20) {
			Static42.method837(Static58.aClass2_Sub3_Sub2_Sub4_Sub1_4, Static85.aClass2_Sub3_Sub2_Sub4_Sub1_5);
		} else if (Static156.anInt3638 == 25) {
			@Pc(144) int local144;
			if (Static123.anInt2876 == 1) {
				if (Static52.anInt1433 > Static77.anInt1914) {
					Static77.anInt1914 = Static52.anInt1433;
				}
				local144 = (Static77.anInt1914 - Static52.anInt1433) * 50 / Static77.anInt1914;
				Static59.method978(false, Static58.method956(new Class6[] { Static117.aClass6_801, Static174.aClass6_1202, Static106.method2806(local144), Static173.aClass6_1206 }));
			} else if (Static123.anInt2876 == 2) {
				if (Static73.anInt1794 > Static65.anInt1610) {
					Static65.anInt1610 = Static73.anInt1794;
				}
				local144 = (Static65.anInt1610 - Static73.anInt1794) * 50 / Static65.anInt1610 + 50;
				Static59.method978(false, Static58.method956(new Class6[] { Static117.aClass6_801, Static174.aClass6_1202, Static106.method2806(local144), Static173.aClass6_1206 }));
			} else {
				Static59.method978(false, Static117.aClass6_801);
			}
		} else if (Static156.anInt3638 == 30) {
			Static9.method113();
		} else if (Static156.anInt3638 == 40) {
			Static59.method978(false, Static58.method956(new Class6[] { Static23.aClass6_157, Static115.aClass6_798, Static46.aClass6_351 }));
		}
		@Pc(251) int local251;
		@Pc(241) Graphics local241;
		if (Static156.anInt3638 == 30 && Static81.anInt1980 == 0 && !Static76.aBoolean67) {
			try {
				local241 = Static121.aCanvas1.getGraphics();
				for (local251 = 0; local251 < Static10.anInt232; local251++) {
					if (Static137.aBooleanArray14[local251]) {
						Static168.aClass67_1.method2711(local241, Static60.anIntArray92[local251], Static4.anIntArray1[local251], Static27.anIntArray30[local251], Static58.anIntArray97[local251]);
						Static137.aBooleanArray14[local251] = false;
					}
				}
			} catch (@Pc(307) Exception local307) {
				Static121.aCanvas1.repaint();
			}
		} else if (Static156.anInt3638 > 0) {
			try {
				local241 = Static121.aCanvas1.getGraphics();
				Static168.aClass67_1.method2705(local241);
				Static76.aBoolean67 = false;
				for (local251 = 0; local251 < Static10.anInt232; local251++) {
					Static137.aBooleanArray14[local251] = false;
				}
			} catch (@Pc(267) Exception local267) {
				Static121.aCanvas1.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method442() {
		if (Static38.anInt1090 >= 4) {
			this.method430("js5crc");
			Static156.anInt3638 = 1000;
			return;
		}
		if (Static55.anInt1442 >= 4) {
			if (Static156.anInt3638 <= 5) {
				this.method430("js5io");
				Static156.anInt3638 = 1000;
				return;
			}
			Static130.anInt3020 = 3000;
			Static55.anInt1442 = 3;
		}
		if (Static130.anInt3020-- > 0) {
			return;
		}
		try {
			if (Static25.anInt672 == 0) {
				Static77.aClass11_5 = Static107.aClass36_4.method1114(Static165.anInt3869, Static10.aString1);
				Static25.anInt672++;
			}
			if (Static25.anInt672 == 1) {
				if (Static77.aClass11_5.anInt467 == 2) {
					this.method440(-1);
					return;
				}
				if (Static77.aClass11_5.anInt467 == 1) {
					Static25.anInt672++;
				}
			}
			if (Static25.anInt672 == 2) {
				Static173.aClass43_4 = new Class43((Socket) Static77.aClass11_5.anObject2, Static107.aClass36_4);
				@Pc(105) Class2_Sub13 local105 = new Class2_Sub13(5);
				local105.method1416(15);
				local105.method1421(477);
				Static173.aClass43_4.method1241(5, local105.aByteArray14);
				Static25.anInt672++;
				Static106.aLong242 = Static70.method1106();
			}
			if (Static25.anInt672 == 3) {
				if (Static156.anInt3638 <= 5 || Static173.aClass43_4.method1235() > 0) {
					@Pc(143) int local143 = Static173.aClass43_4.method1238();
					if (local143 != 0) {
						this.method440(local143);
						return;
					}
					Static25.anInt672++;
				} else if (Static70.method1106() - Static106.aLong242 > 30000L) {
					this.method440(-2);
					return;
				}
			}
			if (Static25.anInt672 == 4) {
				Static55.method935(Static173.aClass43_4, Static156.anInt3638 > 20);
				Static25.anInt672 = 0;
				Static77.aClass11_5 = null;
				Static173.aClass43_4 = null;
				Static154.anInt3554 = 0;
			}
		} catch (@Pc(196) IOException local196) {
			this.method440(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method443() {
		if (Static156.anInt3638 != 1000) {
			@Pc(14) boolean local14 = Static124.method1934();
			if (!local14) {
				this.method442();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method434() {
		if (Static36.aClass52_1 != null) {
			Static36.aClass52_1.aBoolean87 = false;
		}
		Static36.aClass52_1 = null;
		if (Static166.aClass43_3 != null) {
			Static166.aClass43_3.method1236();
			Static166.aClass43_3 = null;
		}
		Static97.method1570();
		Static154.method2345();
		Static163.aClass50_1 = null;
		if (Static138.aClass41_3 != null) {
			Static138.aClass41_3.method1507();
		}
		if (Static160.aClass41_2 != null) {
			Static160.aClass41_2.method1507();
		}
		Static19.method373();
		Static7.method86();
		try {
			if (Static26.aClass38_1 != null) {
				Static26.aClass38_1.method1158();
			}
			if (Static154.aClass38Array1 != null) {
				for (@Pc(53) int local53 = 0; local53 < Static154.aClass38Array1.length; local53++) {
					if (Static154.aClass38Array1[local53] != null) {
						Static154.aClass38Array1[local53].method1158();
					}
				}
			}
			if (Static112.aClass38_4 != null) {
				Static112.aClass38_4.method1158();
			}
			if (Static180.aClass38_5 != null) {
				Static180.aClass38_5.method1158();
			}
		} catch (@Pc(85) IOException local85) {
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method425() {
		if (Static63.anInt1567 == 1) {
			Static81.aShortArray10 = Static120.aShortArray25;
			Static18.aShortArrayArray1 = Static164.aShortArrayArray7;
			Static154.aShortArrayArray6 = Static167.aShortArrayArray8;
			Static162.aShortArray32 = Static169.aShortArray37;
		} else {
			Static18.aShortArrayArray1 = Static181.aShortArrayArray5;
			Static162.aShortArray32 = Static148.aShortArray30;
			Static81.aShortArray10 = Static30.aShortArray1;
			Static154.aShortArrayArray6 = Static46.aShortArrayArray2;
		}
		Static132.anInt3073 = Static115.anInt2775 == 0 ? 443 : Static169.anInt3981 + 50000;
		Static120.anInt2810 = Static115.anInt2775 == 0 ? 43594 : Static169.anInt3981 + 40000;
		Static165.anInt3869 = Static120.anInt2810;
		Static116.method1866();
		Static133.method2087(Static121.aCanvas1);
		Static149.method2283(Static121.aCanvas1);
		Static163.aClass50_1 = Static1.method3();
		if (Static163.aClass50_1 != null) {
			Static163.aClass50_1.method2629(Static121.aCanvas1);
		}
		Static94.anInt2327 = Static71.anInt1746;
		try {
			if (Static107.aClass36_4.aClass80_3 != null) {
				Static26.aClass38_1 = new Class38(Static107.aClass36_4.aClass80_3, 5200, 0);
				for (@Pc(91) int local91 = 0; local91 < 16; local91++) {
					Static154.aClass38Array1[local91] = new Class38(Static107.aClass36_4.aClass80Array1[local91], 6000, 0);
				}
				Static112.aClass38_4 = new Class38(Static107.aClass36_4.aClass80_2, 6000, 0);
				Static142.aClass40_4 = new Class40(255, Static26.aClass38_1, Static112.aClass38_4, 500000);
				Static180.aClass38_5 = new Class38(Static107.aClass36_4.aClass80_1, 24, 0);
				Static107.aClass36_4.aClass80Array1 = null;
				Static107.aClass36_4.aClass80_1 = null;
				Static107.aClass36_4.aClass80_3 = null;
				Static107.aClass36_4.aClass80_2 = null;
			}
		} catch (@Pc(147) IOException local147) {
			Static26.aClass38_1 = null;
			Static142.aClass40_4 = null;
			Static112.aClass38_4 = null;
			Static180.aClass38_5 = null;
		}
		if (Static115.anInt2775 != 0) {
			Static110.aBoolean108 = true;
		}
	}
}
