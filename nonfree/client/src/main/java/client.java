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
				Static154.method2489();
			}
			Static94.anInt2078 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static90.anInt2026 = 0;
			} else if (arg0[1].equals("office")) {
				Static90.anInt2026 = 1;
			} else if (arg0[1].equals("local")) {
				Static90.anInt2026 = 2;
			} else {
				Static154.method2489();
			}
			if (arg0[2].equals("live")) {
				Static39.anInt910 = 0;
			} else if (arg0[2].equals("rc")) {
				Static39.anInt910 = 1;
			} else if (arg0[2].equals("wip")) {
				Static39.anInt910 = 2;
			} else {
				Static154.method2489();
			}
			if (arg0[3].equals("lowmem")) {
				Static160.method2534();
			} else if (arg0[3].equals("highmem")) {
				Static138.method2276();
			} else {
				Static154.method2489();
			}
			if (arg0[4].equals("free")) {
				Static109.aBoolean173 = false;
			} else if (arg0[4].equals("members")) {
				Static109.aBoolean173 = true;
			} else {
				Static154.method2489();
			}
			if (arg0[5].equals("english")) {
				Static104.anInt2351 = 0;
			} else if (arg0[5].equals("german")) {
				Static159.method2526();
				Static173.aClass73_2031 = Static9.aClass73_155;
				Static104.anInt2351 = 1;
			} else {
				Static154.method2489();
			}
			if (arg0[6].equals("game0")) {
				Static159.anInt3490 = 0;
			} else if (arg0[6].equals("game1")) {
				Static159.anInt3490 = 1;
			} else {
				Static154.method2489();
			}
			Static65.aString2 = "127.0.0.1";
			@Pc(178) client local178 = new client();
			local178.method536(Static39.anInt910 + 32, "runescape");
			Static90.aFrame1.setLocation(40, 40);
		} catch (@Pc(195) Exception local195) {
			Static29.method571(local195, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method522() {
		@Pc(8) boolean local8 = Static92.method1601();
		if (local8 && Static44.aBoolean70 && Static79.aClass5_1 != null) {
			Static79.aClass5_1.method2589();
		}
		if (Static118.aBoolean270) {
			Static109.method1957(Static102.aCanvas1);
			Static131.method2178(Static102.aCanvas1);
			if (Static25.aClass10_1 != null) {
				Static25.aClass10_1.method211(Static102.aCanvas1);
			}
			this.method537();
			Static147.method2402(Static102.aCanvas1);
			Static14.method231(Static102.aCanvas1);
			if (Static25.aClass10_1 != null) {
				Static25.aClass10_1.method210(Static102.aCanvas1);
			}
		}
		if (Static25.anInt717 == 0) {
			Static178.method2753(Static135.anInt3086, null, Static12.aClass73_173);
		} else if (Static25.anInt717 == 5) {
			Static93.method1622(Static142.aClass3_Sub1_Sub3_Sub1_Sub1_5, Static113.aClass3_Sub1_Sub3_Sub1_Sub1_2);
		} else if (Static25.anInt717 == 10) {
			Static93.method1622(Static142.aClass3_Sub1_Sub3_Sub1_Sub1_5, Static113.aClass3_Sub1_Sub3_Sub1_Sub1_2);
		} else if (Static25.anInt717 == 20) {
			Static93.method1622(Static142.aClass3_Sub1_Sub3_Sub1_Sub1_5, Static113.aClass3_Sub1_Sub3_Sub1_Sub1_2);
		} else if (Static25.anInt717 == 25) {
			@Pc(109) int local109;
			if (Static113.anInt2742 == 1) {
				if (Static72.anInt1643 < Static86.anInt1938) {
					Static72.anInt1643 = Static86.anInt1938;
				}
				local109 = (Static72.anInt1643 - Static86.anInt1938) * 50 / Static72.anInt1643;
				Static104.method1816(false, Static19.method372(new Class73[] { Static133.aClass73_1696, Static129.aClass73_1656, Static154.method2485(local109), Static68.aClass73_846 }));
			} else if (Static113.anInt2742 == 2) {
				if (Static9.anInt267 > Static58.anInt1368) {
					Static58.anInt1368 = Static9.anInt267;
				}
				local109 = (Static58.anInt1368 - Static9.anInt267) * 50 / Static58.anInt1368 + 50;
				Static104.method1816(false, Static19.method372(new Class73[] { Static133.aClass73_1696, Static129.aClass73_1656, Static154.method2485(local109), Static68.aClass73_846 }));
			} else {
				Static104.method1816(false, Static133.aClass73_1696);
			}
		} else if (Static25.anInt717 == 30) {
			Static25.method541();
		} else if (Static25.anInt717 == 40) {
			Static104.method1816(false, Static19.method372(new Class73[] { Static38.aClass73_1738, Static38.aClass73_1742, Static134.aClass73_1698 }));
		}
		@Pc(245) int local245;
		@Pc(243) Graphics local243;
		if (Static25.anInt717 == 30 && Static20.anInt540 == 0 && !Static135.aBoolean209) {
			try {
				local243 = Static102.aCanvas1.getGraphics();
				for (local245 = 0; local245 < Static81.anInt1818; local245++) {
					if (Static84.aBooleanArray7[local245]) {
						Static87.aClass30_1.method2024(Static72.anIntArray176[local245], Static163.anIntArray325[local245], Static34.anIntArray78[local245], local243, Static19.anIntArray47[local245]);
						Static84.aBooleanArray7[local245] = false;
					}
				}
			} catch (@Pc(277) Exception local277) {
				Static102.aCanvas1.repaint();
			}
		} else if (Static25.anInt717 > 0) {
			try {
				local243 = Static102.aCanvas1.getGraphics();
				Static87.aClass30_1.method2026(local243);
				Static135.aBoolean209 = false;
				for (local245 = 0; local245 < Static81.anInt1818; local245++) {
					Static84.aBooleanArray7[local245] = false;
				}
			} catch (@Pc(312) Exception local312) {
				Static102.aCanvas1.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method540(@OriginalArg(1) int arg0) {
		if (Static105.anInt2370 == Static103.anInt2328) {
			Static105.anInt2370 = Static98.anInt2187;
		} else {
			Static105.anInt2370 = Static103.anInt2328;
		}
		Static33.anInt828 = 0;
		Static94.aClass29_7 = null;
		Static155.aClass2_6 = null;
		Static141.anInt3256++;
		if (Static141.anInt3256 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static25.anInt717 <= 5) {
				this.method527("js5connect_full");
				Static25.anInt717 = 1000;
			} else {
				Static38.anInt3124 = 3000;
			}
		} else if (Static141.anInt3256 >= 2 && arg0 == 6) {
			this.method527("js5connect_outofdate");
			Static25.anInt717 = 1000;
		} else if (Static141.anInt3256 >= 4) {
			if (Static25.anInt717 <= 5) {
				this.method527("js5connect");
				Static25.anInt717 = 1000;
			} else {
				Static38.anInt3124 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method525() {
		if (Static87.aClass54_1 != null) {
			Static87.aClass54_1.aBoolean152 = false;
		}
		Static87.aClass54_1 = null;
		if (Static42.aClass2_2 != null) {
			Static42.aClass2_2.method12();
			Static42.aClass2_2 = null;
		}
		Static31.method599();
		Static31.method597();
		Static25.aClass10_1 = null;
		if (Static79.aClass5_1 != null) {
			Static79.aClass5_1.method2588();
		}
		if (Static137.aClass5_2 != null) {
			Static137.aClass5_2.method2588();
		}
		Static39.method692();
		Static130.method2167();
		try {
			if (Static171.aClass80_4 != null) {
				Static171.aClass80_4.method2612();
			}
			if (Static80.aClass80Array1 != null) {
				for (@Pc(52) int local52 = 0; local52 < Static80.aClass80Array1.length; local52++) {
					if (Static80.aClass80Array1[local52] != null) {
						Static80.aClass80Array1[local52].method2612();
					}
				}
			}
			if (Static172.aClass80_5 != null) {
				Static172.aClass80_5.method2612();
			}
			if (Static98.aClass80_3 != null) {
				Static98.aClass80_3.method2612();
			}
		} catch (@Pc(84) IOException local84) {
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method543() {
		if (Static25.anInt717 != 1000) {
			@Pc(16) boolean local16 = Static101.method1774();
			if (!local16) {
				this.method545();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method535() {
		Static44.anInt1024++;
		if (Static44.anInt1024 % 1000 == 1) {
			@Pc(18) GregorianCalendar local18 = new GregorianCalendar();
			Static52.anInt1283 = local18.get(11) * 600 + local18.get(12) * 10 + local18.get(13) / 6;
			Static13.aRandom1.setSeed((long) Static52.anInt1283);
		}
		this.method543();
		Static130.method2169();
		Static134.method2209();
		Static109.method1956();
		Static75.method1291();
		Static32.method601();
		if (Static25.aClass10_1 != null) {
			@Pc(62) int local62 = Static25.aClass10_1.method212();
			Static28.anInt751 = local62;
		}
		if (Static25.anInt717 == 0) {
			Static17.method2684();
			Static56.method989();
		} else if (Static25.anInt717 == 5) {
			Static149.method2460(this);
			Static17.method2684();
			Static56.method989();
		} else if (Static25.anInt717 == 10) {
			Static149.method2460(this);
		} else if (Static25.anInt717 == 20) {
			Static149.method2460(this);
			Static180.method2775();
		} else if (Static25.anInt717 == 25) {
			Static57.method995();
		}
		if (Static25.anInt717 == 30) {
			Static111.method2022();
		} else if (Static25.anInt717 == 40) {
			Static180.method2775();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method523()) {
			return;
		}
		Static94.anInt2078 = Integer.parseInt(this.getParameter("worldid"));
		Static39.anInt910 = Integer.parseInt(this.getParameter("modewhat"));
		Static90.anInt2026 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static160.method2534();
		} else {
			Static138.method2276();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static109.aBoolean173 = true;
		} else {
			Static109.aBoolean173 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static159.method2526();
			Static104.anInt2351 = 1;
			Static173.aClass73_2031 = Static9.aClass73_155;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static159.anInt3490 = 1;
		} else {
			Static159.anInt3490 = 0;
		}
		try {
			Static112.anInt2735 = Integer.parseInt(this.getParameter("js"));
			Static173.anInt3798 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(101) Exception local101) {
		}
		Static65.aString2 = this.getCodeBase().getHost();
		this.method533(Static39.anInt910 + 32);
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method545() {
		if (Static118.anInt3946 >= 4) {
			this.method527("js5crc");
			Static25.anInt717 = 1000;
			return;
		}
		if (Static52.anInt1278 >= 4) {
			if (Static25.anInt717 <= 5) {
				this.method527("js5io");
				Static25.anInt717 = 1000;
				return;
			}
			Static52.anInt1278 = 3;
			Static38.anInt3124 = 3000;
		}
		if (Static38.anInt3124-- > 0) {
			return;
		}
		try {
			if (Static33.anInt828 == 0) {
				Static94.aClass29_7 = Static32.aClass39_2.method1228(Static105.anInt2370, Static65.aString2);
				Static33.anInt828++;
			}
			if (Static33.anInt828 == 1) {
				if (Static94.aClass29_7.anInt1375 == 2) {
					this.method540(-1);
					return;
				}
				if (Static94.aClass29_7.anInt1375 == 1) {
					Static33.anInt828++;
				}
			}
			if (Static33.anInt828 == 2) {
				Static155.aClass2_6 = new Class2((Socket) Static94.aClass29_7.anObject2, Static32.aClass39_2);
				@Pc(99) Class3_Sub12 local99 = new Class3_Sub12(5);
				local99.method1383(15);
				local99.method1392(476);
				Static155.aClass2_6.method15(5, local99.aByteArray16);
				Static33.anInt828++;
				Static72.aLong79 = Static88.method1536();
			}
			if (Static33.anInt828 == 3) {
				if (Static25.anInt717 <= 5 || Static155.aClass2_6.method16() > 0) {
					@Pc(139) int local139 = Static155.aClass2_6.method10();
					if (local139 != 0) {
						this.method540(local139);
						return;
					}
					Static33.anInt828++;
				} else if (Static88.method1536() - Static72.aLong79 > 30000L) {
					this.method540(-2);
					return;
				}
			}
			if (Static33.anInt828 == 4) {
				Static176.method2726(Static25.anInt717 > 20, Static155.aClass2_6);
				Static141.anInt3256 = 0;
				Static155.aClass2_6 = null;
				Static33.anInt828 = 0;
				Static94.aClass29_7 = null;
			}
		} catch (@Pc(201) IOException local201) {
			this.method540(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method524() {
		Static25.method544();
		Static148.method2448();
		Static122.method529();
		Static144.method2513();
		Static59.method2025();
		Static102.method1776();
		Static47.method1360();
		Static2.method14();
		Static19.method379();
		Static166.method2610();
		Static76.method1294();
		Static138.method2277();
		Static80.method1405();
		Static64.method1166();
		Static128.method2158();
		Static170.method2657();
		Static111.method2019();
		Static147.method2399();
		Static26.method557();
		Static165.method213();
		Static28.method564();
		Static131.method2174();
		Static150.method2597();
		Static77.method1302();
		Static99.method1708();
		Static56.method986();
		Static163.method2270();
		Static41.method779();
		Static68.method1199();
		Static48.method876();
		Static118.method2782();
		Static135.method2232();
		Static72.method1263();
		Static11.method188();
		Static114.method1889();
		Static62.method1117();
		Static43.method781();
		Static12.method195();
		Static30.method577();
		Static4.method49();
		Static173.method2692();
		Static38.method2263();
		Static63.method1128();
		Static94.method1623();
		Static110.method1962();
		Static89.method1557();
		Static61.method1111();
		Static174.method2696();
		Static123.method2100();
		Static91.method1593();
		Static113.method2036();
		Static134.method2210();
		Static88.method1535();
		Static33.method611();
		Static10.method176();
		Static42.method356();
		Static50.method919();
		Static175.method2705();
		Static66.method1182();
		Static55.method972();
		Static130.method2168();
		Static155.method2491();
		Static32.method600();
		Static140.method2284();
		Static92.method1602();
		Static79.method1335();
		Static34.method615();
		Static29.method569();
		Static54.method969();
		Static15.method2308();
		Static17.method2685();
		Static36.method653();
		Static39.method691();
		Static18.method304();
		Static69.method1225();
		Static149.method2459();
		Static154.method2487();
		Static3.method40();
		Static5.method67();
		Static58.method1020();
		Static132.method2190();
		Static51.method937();
		Static106.method1901();
		Static108.method1934();
		Static105.method1827();
		Static172.method2688();
		Static85.method1505();
		Static152.method2477();
		Static22.method474();
		Static21.method1061();
		Static100.method1729();
		Static141.method2356();
		Static119.method2067();
		Static115.method2038();
		Static146.method2394();
		Static167.method2622();
		Static121.method2097();
		Static8.method157();
		Static23.method501();
		Static67.method1186();
		Static81.method1411();
		Static124.method2105();
		Static27.method559();
		Static86.method1511();
		Static145.method2389();
		Static16.method295();
		Static52.method964();
		Static31.method598();
		Static107.method1919();
		Static164.method2576();
		Static160.method2532();
		Static136.method2238();
		Static46.method810();
		Static157.method2517();
		Static112.method2030();
		Static127.method485();
		Static159.method2525();
		Static151.method2465();
		Static13.method205();
		Static24.method503();
		Static7.method151();
		Static73.method1269();
		Static179.method2757();
		Static49.method877();
		Static153.method2483();
		Static137.method2248();
		Static1.method8();
		Static65.method1181();
		Static116.method2044();
		Static169.method2646();
		Static161.method2549();
		Static177.method2733();
		Static75.method1292();
		Static142.method2360();
		Static53.method2791();
		Static158.method2522();
		Static129.method2162();
		Static9.method175();
		Static57.method998();
		Static82.method1415();
		Static139.method1769();
		Static83.method1436();
		Static103.method1797();
		Static74.method1289();
		Static104.method1815();
		Static126.method2142();
		Static87.method1530();
		Static45.method808();
		Static78.method1322();
		Static96.method1660();
		Static84.method1460();
		Static37.method686();
		Static90.method1591();
		Static117.method2064();
		Static20.method397();
		Static125.method2123();
		Static120.method2089();
		Static95.method1641();
		Static180.method2774();
		Static101.method1775();
		Static178.method2754();
		Static40.method772();
		Static168.method2642();
		Static6.method105();
		Static71.method1256();
		Static97.method1678();
		Static14.method230();
		Static176.method2725();
		Static93.method1621();
		Static98.method1696();
		Static156.method2510();
		Static109.method1960();
		Static171.method2677();
		Static181.method2801();
		Static143.method2382();
		Static60.method1108();
		Static162.method2567();
		Static133.method2207();
		Static44.method788();
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method539() {
		Static103.anInt2328 = Static90.anInt2026 == 0 ? 43594 : Static94.anInt2078 + 40000;
		if (Static159.anInt3490 == 1) {
			Static28.aShortArray1 = Static68.aShortArray16;
			Static103.aShortArray25 = Static48.aShortArray2;
			Static5.aShortArrayArray1 = Static158.aShortArrayArray6;
			Static157.aShortArrayArray5 = Static121.aShortArrayArray4;
		} else {
			Static103.aShortArray25 = Static52.aShortArray7;
			Static157.aShortArrayArray5 = Static19.aShortArrayArray2;
			Static5.aShortArrayArray1 = Static85.aShortArrayArray3;
			Static28.aShortArray1 = Static175.aShortArray36;
		}
		Static105.anInt2370 = Static103.anInt2328;
		Static98.anInt2187 = Static90.anInt2026 == 0 ? 443 : Static94.anInt2078 + 50000;
		Static88.method1533();
		Static147.method2402(Static102.aCanvas1);
		Static14.method231(Static102.aCanvas1);
		Static25.aClass10_1 = Static22.method475();
		if (Static25.aClass10_1 != null) {
			Static25.aClass10_1.method210(Static102.aCanvas1);
		}
		Static173.anInt3804 = Static70.anInt1604;
		try {
			if (Static32.aClass39_2.aClass20_1 != null) {
				Static171.aClass80_4 = new Class80(Static32.aClass39_2.aClass20_1, 5200, 0);
				for (@Pc(89) int local89 = 0; local89 < 16; local89++) {
					Static80.aClass80Array1[local89] = new Class80(Static32.aClass39_2.aClass20Array1[local89], 6000, 0);
				}
				Static172.aClass80_5 = new Class80(Static32.aClass39_2.aClass20_2, 6000, 0);
				Static57.aClass43_3 = new Class43(255, Static171.aClass80_4, Static172.aClass80_5, 500000);
				Static98.aClass80_3 = new Class80(Static32.aClass39_2.aClass20_3, 24, 0);
				Static32.aClass39_2.aClass20_1 = null;
				Static32.aClass39_2.aClass20_3 = null;
				Static32.aClass39_2.aClass20_2 = null;
				Static32.aClass39_2.aClass20Array1 = null;
			}
		} catch (@Pc(147) IOException local147) {
			Static57.aClass43_3 = null;
			Static171.aClass80_4 = null;
			Static172.aClass80_5 = null;
			Static98.aClass80_3 = null;
		}
		if (Static90.anInt2026 != 0) {
			Static115.aBoolean182 = true;
		}
	}
}
