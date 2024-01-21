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
				Static140.method2468();
			}
			Static86.anInt2304 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static73.anInt2024 = 0;
			} else if (arg0[1].equals("office")) {
				Static73.anInt2024 = 1;
			} else if (arg0[1].equals("local")) {
				Static73.anInt2024 = 2;
			} else {
				Static140.method2468();
			}
			if (arg0[2].equals("live")) {
				Static180.anInt4299 = 0;
			} else if (arg0[2].equals("rc")) {
				Static180.anInt4299 = 1;
			} else if (arg0[2].equals("wip")) {
				Static180.anInt4299 = 2;
			} else {
				Static140.method2468();
			}
			if (arg0[3].equals("lowmem")) {
				Static25.method437();
			} else if (arg0[3].equals("highmem")) {
				Static123.method2189();
			} else {
				Static140.method2468();
			}
			if (arg0[4].equals("free")) {
				Static176.aBoolean209 = false;
			} else if (arg0[4].equals("members")) {
				Static176.aBoolean209 = true;
			} else {
				Static140.method2468();
			}
			if (arg0[5].equals("english")) {
				Static37.anInt994 = 0;
			} else if (arg0[5].equals("german")) {
				Static137.method2409();
				Static101.aClass23_994 = Static5.aClass23_1665;
				Static37.anInt994 = 1;
			} else {
				Static140.method2468();
			}
			if (arg0[6].equals("game0")) {
				Static62.anInt1652 = 0;
			} else if (arg0[6].equals("game1")) {
				Static62.anInt1652 = 1;
			} else {
				Static140.method2468();
			}
			Static27.aString1 = "127.0.0.1";
			@Pc(176) client local176 = new client();
			local176.method469("runescape", Static180.anInt4299 + 32);
			Static174.aFrame1.setLocation(40, 40);
		} catch (@Pc(193) Exception local193) {
			Static153.method2616(null, local193);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method471() {
		if (Static20.aClass73_1 != null) {
			Static20.aClass73_1.aBoolean184 = false;
		}
		Static20.aClass73_1 = null;
		if (Static43.aClass44_4 != null) {
			Static43.aClass44_4.method1417();
			Static43.aClass44_4 = null;
		}
		Static99.method1678();
		Static178.method3068();
		Static140.aClass16_1 = null;
		if (Static74.aClass40_1 != null) {
			Static74.aClass40_1.method2523();
		}
		if (Static149.aClass40_2 != null) {
			Static149.aClass40_2.method2523();
		}
		Static124.method2201();
		Static169.method2899();
		try {
			if (Static120.aClass21_5 != null) {
				Static120.aClass21_5.method595();
			}
			if (Static94.aClass21Array1 != null) {
				for (@Pc(53) int local53 = 0; local53 < Static94.aClass21Array1.length; local53++) {
					if (Static94.aClass21Array1[local53] != null) {
						Static94.aClass21Array1[local53].method595();
					}
				}
			}
			if (Static116.aClass21_4 != null) {
				Static116.aClass21_4.method595();
			}
			if (Static44.aClass21_3 != null) {
				Static44.aClass21_3.method595();
			}
		} catch (@Pc(81) IOException local81) {
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method478() {
		@Pc(8) boolean local8 = Static61.method1107();
		if (local8 && Static37.aBoolean48 && Static74.aClass40_1 != null) {
			Static74.aClass40_1.method2510();
		}
		if (Static62.aBoolean81) {
			Static107.method1850(Static91.aCanvas1);
			Static36.method586(Static91.aCanvas1);
			if (Static140.aClass16_1 != null) {
				Static140.aClass16_1.method1956(Static91.aCanvas1);
			}
			this.method481();
			Static139.method2444(Static91.aCanvas1);
			Static170.method472(Static91.aCanvas1);
			if (Static140.aClass16_1 != null) {
				Static140.aClass16_1.method1960(Static91.aCanvas1);
			}
		}
		if (Static156.anInt3821 == 0) {
			Static139.method2442(Static86.anInt2301, null, Static61.aClass23_606);
		} else if (Static156.anInt3821 == 5) {
			Static19.method354(Static107.aClass1_Sub1_Sub12_Sub3_Sub1_6, Static81.aClass1_Sub1_Sub12_Sub3_Sub1_3);
		} else if (Static156.anInt3821 == 10) {
			Static19.method354(Static107.aClass1_Sub1_Sub12_Sub3_Sub1_6, Static81.aClass1_Sub1_Sub12_Sub3_Sub1_3);
		} else if (Static156.anInt3821 == 20) {
			Static19.method354(Static107.aClass1_Sub1_Sub12_Sub3_Sub1_6, Static81.aClass1_Sub1_Sub12_Sub3_Sub1_3);
		} else if (Static156.anInt3821 == 25) {
			@Pc(126) int local126;
			if (Static180.anInt4298 == 1) {
				if (Static142.anInt3609 < Static118.anInt3062) {
					Static142.anInt3609 = Static118.anInt3062;
				}
				local126 = (Static142.anInt3609 - Static118.anInt3062) * 50 / Static142.anInt3609;
				Static5.method3152(false, Static149.method2571(new Class23[] { Static177.aClass23_1604, Static37.aClass23_387, Static27.method498(local126), Static9.aClass23_131 }));
			} else if (Static180.anInt4298 == 2) {
				if (Static109.anInt2813 > Static97.anInt2496) {
					Static97.anInt2496 = Static109.anInt2813;
				}
				local126 = (Static97.anInt2496 - Static109.anInt2813) * 50 / Static97.anInt2496 + 50;
				Static5.method3152(false, Static149.method2571(new Class23[] { Static177.aClass23_1604, Static37.aClass23_387, Static27.method498(local126), Static9.aClass23_131 }));
			} else {
				Static5.method3152(false, Static177.aClass23_1604);
			}
		} else if (Static156.anInt3821 == 30) {
			Static127.method2278();
		} else if (Static156.anInt3821 == 40) {
			Static5.method3152(false, Static149.method2571(new Class23[] { Static58.aClass23_598, Static26.aClass23_288, Static1.aClass23_70 }));
		}
		@Pc(245) int local245;
		@Pc(243) Graphics local243;
		if (Static156.anInt3821 == 30 && Static20.anInt670 == 0 && !Static181.aBoolean217) {
			try {
				local243 = Static91.aCanvas1.getGraphics();
				for (local245 = 0; local245 < Static112.anInt2869; local245++) {
					if (Static18.aBooleanArray5[local245]) {
						Static138.aClass25_1.method2791(local243, Static18.anIntArray79[local245], Static87.anIntArray121[local245], Static23.anIntArray97[local245], Static103.anIntArray345[local245]);
						Static18.aBooleanArray5[local245] = false;
					}
				}
			} catch (@Pc(281) Exception local281) {
				Static91.aCanvas1.repaint();
			}
		} else if (Static156.anInt3821 > 0) {
			try {
				local243 = Static91.aCanvas1.getGraphics();
				Static138.aClass25_1.method2795(local243);
				Static181.aBoolean217 = false;
				for (local245 = 0; local245 < Static112.anInt2869; local245++) {
					Static18.aBooleanArray5[local245] = false;
				}
			} catch (@Pc(315) Exception local315) {
				Static91.aCanvas1.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	private void method482() {
		if (Static137.anInt3499 >= 4) {
			this.method474("js5crc");
			Static156.anInt3821 = 1000;
			return;
		}
		if (Static46.anInt4321 >= 4) {
			if (Static156.anInt3821 <= 5) {
				this.method474("js5io");
				Static156.anInt3821 = 1000;
				return;
			}
			Static35.anInt970 = 3000;
			Static46.anInt4321 = 3;
		}
		if (Static35.anInt970-- > 0) {
			return;
		}
		try {
			if (Static16.anInt500 == 0) {
				Static119.aClass63_3 = Static29.aClass74_2.method2478(Static79.anInt2148, Static27.aString1);
				Static16.anInt500++;
			}
			if (Static16.anInt500 == 1) {
				if (Static119.aClass63_3.anInt3324 == 2) {
					this.method485(-1);
					return;
				}
				if (Static119.aClass63_3.anInt3324 == 1) {
					Static16.anInt500++;
				}
			}
			if (Static16.anInt500 == 2) {
				Static108.aClass44_5 = new Class44((Socket) Static119.aClass63_3.anObject3, Static29.aClass74_2);
				@Pc(95) Class1_Sub8 local95 = new Class1_Sub8(5);
				local95.method862(15);
				local95.method904(478);
				Static108.aClass44_5.method1419(local95.aByteArray12, 5);
				Static16.anInt500++;
				Static1.aLong6 = Static47.method763();
			}
			if (Static16.anInt500 == 3) {
				if (Static156.anInt3821 <= 5 || Static108.aClass44_5.method1418() > 0) {
					@Pc(131) int local131 = Static108.aClass44_5.method1420();
					if (local131 != 0) {
						this.method485(local131);
						return;
					}
					Static16.anInt500++;
				} else if (Static47.method763() - Static1.aLong6 > 30000L) {
					this.method485(-2);
					return;
				}
			}
			if (Static16.anInt500 == 4) {
				Static140.method2467(Static156.anInt3821 > 20, Static108.aClass44_5);
				Static119.aClass63_3 = null;
				Static108.aClass44_5 = null;
				Static115.anInt2958 = 0;
				Static16.anInt500 = 0;
			}
		} catch (@Pc(180) IOException local180) {
			this.method485(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method466() {
		if (Static62.anInt1652 == 1) {
			Static27.aShortArray14 = Static19.aShortArray5;
			Static118.aShortArray32 = Static49.aShortArray20;
			Static120.aShortArrayArray5 = Static18.aShortArrayArray2;
			Static40.aShortArrayArray3 = Static86.aShortArrayArray4;
		} else {
			Static118.aShortArray32 = Static73.aShortArray29;
			Static120.aShortArrayArray5 = Static11.aShortArrayArray1;
			Static27.aShortArray14 = Static45.aShortArray19;
			Static40.aShortArrayArray3 = Static144.aShortArrayArray6;
		}
		Static132.anInt3971 = Static73.anInt2024 == 0 ? 443 : Static86.anInt2304 + 50000;
		Static48.anInt1280 = Static73.anInt2024 == 0 ? 43594 : Static86.anInt2304 + 40000;
		Static79.anInt2148 = Static48.anInt1280;
		Static99.method1685();
		Static139.method2444(Static91.aCanvas1);
		Static170.method472(Static91.aCanvas1);
		Static140.aClass16_1 = Static89.method1571();
		if (Static140.aClass16_1 != null) {
			Static140.aClass16_1.method1960(Static91.aCanvas1);
		}
		Static66.anInt1744 = Static143.anInt3610;
		try {
			if (Static29.aClass74_2.aClass46_4 != null) {
				Static120.aClass21_5 = new Class21(Static29.aClass74_2.aClass46_4, 5200, 0);
				for (@Pc(84) int local84 = 0; local84 < 16; local84++) {
					Static94.aClass21Array1[local84] = new Class21(Static29.aClass74_2.aClass46Array1[local84], 6000, 0);
				}
				Static116.aClass21_4 = new Class21(Static29.aClass74_2.aClass46_3, 6000, 0);
				Static87.aClass27_3 = new Class27(255, Static120.aClass21_5, Static116.aClass21_4, 500000);
				Static44.aClass21_3 = new Class21(Static29.aClass74_2.aClass46_2, 24, 0);
				Static29.aClass74_2.aClass46_2 = null;
				Static29.aClass74_2.aClass46Array1 = null;
				Static29.aClass74_2.aClass46_3 = null;
				Static29.aClass74_2.aClass46_4 = null;
			}
		} catch (@Pc(148) IOException local148) {
			Static116.aClass21_4 = null;
			Static44.aClass21_3 = null;
			Static87.aClass27_3 = null;
			Static120.aClass21_5 = null;
		}
		if (Static73.anInt2024 != 0) {
			Static31.aBoolean45 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method480() {
		Static26.method484();
		Static39.method636();
		Static170.method463();
		Static87.method579();
		Static132.method2793();
		Static142.method2476();
		Static81.method893();
		Static72.method1306();
		Static37.method596();
		Static43.method718();
		Static69.method1226();
		Static49.method914();
		Static159.method2696();
		Static137.method2394();
		Static116.method2049();
		Static1.method94();
		Static107.method1854();
		Static14.method258();
		Static30.method1962();
		Static167.method2889();
		Static129.method2297();
		Static65.method2515();
		Static11.method214();
		Static67.method1186();
		Static180.method3109();
		Static108.method1220();
		Static124.method2203();
		Static53.method985();
		Static123.method2188();
		Static60.method3143();
		Static99.method1681();
		Static61.method1108();
		Static158.method2654();
		Static175.method1071();
		Static111.method1965();
		Static162.method2821();
		Static146.method2527();
		Static68.method1198();
		Static6.method165();
		Static120.method2102();
		Static84.method3153();
		Static75.method1345();
		Static141.method2471();
		Static169.method2901();
		Static151.method2599();
		Static40.method668();
		Static3.method119();
		Static148.method2559();
		Static23.method397();
		Static59.method1103();
		Static98.method1674();
		Static47.method765();
		Static33.method575();
		Static110.method1953();
		Static52.method1285();
		Static103.method1762();
		Static54.method998();
		Static176.method2992();
		Static163.method2825();
		Static155.method2629();
		Static94.method1629();
		Static97.method1669();
		Static57.method1098();
		Static101.method1714();
		Static128.method2292();
		Static102.method1724();
		Static139.method2446();
		Static31.method543();
		Static150.method3033();
		Static5.method3147();
		Static121.method2148();
		Static149.method2570();
		Static28.method511();
		Static96.method1666();
		Static16.method282();
		Static93.method1621();
		Static64.method1134();
		Static25.method435();
		Static24.method413();
		Static20.method379();
		Static41.method700();
		Static56.method1096();
		Static92.method1617();
		Static171.method2922();
		Static29.method533();
		Static48.method785();
		Static9.method208();
		Static113.method2004();
		Static136.method3043();
		Static2.method115();
		Static138.method2429();
		Static50.method920();
		Static62.method1111();
		Static178.method3066();
		Static156.method2642();
		Static13.method250();
		Static179.method3082();
		Static133.method2311();
		Static118.method2078();
		Static104.method1792();
		Static74.method1343();
		Static55.method999();
		Static173.method2987();
		Static114.method2029();
		Static112.method1985();
		Static27.method494();
		Static182.method3161();
		Static140.method2466();
		Static135.method2315();
		Static157.method2650();
		Static58.method1100();
		Static91.method1597();
		Static35.method584();
		Static34.method581();
		Static161.method2799();
		Static152.method2439();
		Static10.method211();
		Static174.method2989();
		Static95.method1634();
		Static164.method2830();
		Static145.method2525();
		Static63.method1116();
		Static42.method713();
		Static131.method2310();
		Static130.method2306();
		Static177.method3001();
		Static168.method2894();
		Static109.method1949();
		Static154.method2626();
		Static36.method589();
		Static117.method2075();
		Static172.method2979();
		Static80.method1424();
		Static15.method270();
		Static46.method3121();
		Static115.method2044();
		Static22.method394();
		Static70.method1249();
		Static153.method2615();
		Static7.method170();
		Static122.method2772();
		Static100.method1707();
		Static71.method1276();
		Static106.method1840();
		Static89.method1570();
		Static126.method2251();
		Static66.method1176();
		Static17.method307();
		Static82.method1448();
		Static105.method1815();
		Static88.method1547();
		Static18.method328();
		Static76.method1368();
		Static51.method943();
		Static86.method1523();
		Static4.method160();
		Static38.method623();
		Static85.method1493();
		Static19.method352();
		Static160.method2775();
		Static166.method2875();
		Static77.method1392();
		Static165.method2853();
		Static45.method762();
		Static127.method2277();
		Static90.method1594();
		Static78.method1415();
		Static144.method2508();
		Static147.method2549();
		Static44.method739();
		Static119.method2100();
		Static12.method238();
		Static73.method1334();
		Static181.method3135();
		Static83.method1470();
		Static125.method2227();
		Static32.method568();
		Static21.method389();
		Static8.method184();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method485(@OriginalArg(1) int arg0) {
		Static119.aClass63_3 = null;
		if (Static79.anInt2148 == Static48.anInt1280) {
			Static79.anInt2148 = Static132.anInt3971;
		} else {
			Static79.anInt2148 = Static48.anInt1280;
		}
		Static115.anInt2958++;
		Static16.anInt500 = 0;
		Static108.aClass44_5 = null;
		if (Static115.anInt2958 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static156.anInt3821 <= 5) {
				this.method474("js5connect_full");
				Static156.anInt3821 = 1000;
			} else {
				Static35.anInt970 = 3000;
			}
		} else if (Static115.anInt2958 >= 2 && arg0 == 6) {
			this.method474("js5connect_outofdate");
			Static156.anInt3821 = 1000;
		} else if (Static115.anInt2958 >= 4) {
			if (Static156.anInt3821 <= 5) {
				this.method474("js5connect");
				Static156.anInt3821 = 1000;
			} else {
				Static35.anInt970 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method486() {
		if (Static156.anInt3821 != 1000) {
			@Pc(12) boolean local12 = Static92.method1613();
			if (!local12) {
				this.method482();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method470()) {
			return;
		}
		Static86.anInt2304 = Integer.parseInt(this.getParameter("worldid"));
		Static180.anInt4299 = Integer.parseInt(this.getParameter("modewhat"));
		Static73.anInt2024 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static25.method437();
		} else {
			Static123.method2189();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static176.aBoolean209 = true;
		} else {
			Static176.aBoolean209 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static137.method2409();
			Static101.aClass23_994 = Static5.aClass23_1665;
			Static37.anInt994 = 1;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static62.anInt1652 = 1;
		} else {
			Static62.anInt1652 = 0;
		}
		try {
			Static51.anInt1460 = Integer.parseInt(this.getParameter("js"));
			Static95.anInt2462 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(101) Exception local101) {
		}
		Static27.aString1 = this.getCodeBase().getHost();
		this.method479(Static180.anInt4299 + 32);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method476() {
		Static26.anInt845++;
		if (Static26.anInt845 % 1000 == 1) {
			@Pc(27) GregorianCalendar local27 = new GregorianCalendar();
			Static110.anInt2829 = local27.get(11) * 600 + local27.get(12) * 10 + local27.get(13) / 6;
			Static132.aRandom3.setSeed((long) Static110.anInt2829);
		}
		this.method486();
		Static42.method712();
		Static16.method284();
		Static38.method622();
		Static20.method372();
		Static176.method2990();
		if (Static140.aClass16_1 != null) {
			@Pc(69) int local69 = Static140.aClass16_1.method1961();
			Static138.anInt3532 = local69;
		}
		if (Static156.anInt3821 == 0) {
			Static160.method2779();
			Static78.method1414();
		} else if (Static156.anInt3821 == 5) {
			Static77.method1391(this);
			Static160.method2779();
			Static78.method1414();
		} else if (Static156.anInt3821 == 10) {
			Static77.method1391(this);
		} else if (Static156.anInt3821 == 20) {
			Static77.method1391(this);
			Static60.method3146();
		} else if (Static156.anInt3821 == 25) {
			Static93.method1623();
		}
		if (Static156.anInt3821 == 30) {
			Static180.method3108();
		} else if (Static156.anInt3821 == 40) {
			Static60.method3146();
		}
	}
}
