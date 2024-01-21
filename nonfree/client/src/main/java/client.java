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
				Static18.method300();
			}
			Static49.anInt1283 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static1.anInt2 = 0;
			} else if (arg0[1].equals("office")) {
				Static1.anInt2 = 1;
			} else if (arg0[1].equals("local")) {
				Static1.anInt2 = 2;
			} else {
				Static18.method300();
			}
			if (arg0[2].equals("live")) {
				Static14.anInt368 = 0;
			} else if (arg0[2].equals("rc")) {
				Static14.anInt368 = 1;
			} else if (arg0[2].equals("wip")) {
				Static14.anInt368 = 2;
			} else {
				Static18.method300();
			}
			if (arg0[3].equals("lowmem")) {
				Static72.method529();
			} else if (arg0[3].equals("highmem")) {
				Static101.method1817();
			} else {
				Static18.method300();
			}
			if (arg0[4].equals("free")) {
				Static99.aBoolean121 = false;
			} else if (arg0[4].equals("members")) {
				Static99.aBoolean121 = true;
			} else {
				Static18.method300();
			}
			if (arg0[5].equals("english")) {
				Static44.anInt1125 = 0;
			} else if (arg0[5].equals("german")) {
				Static110.method1956();
				Static44.anInt1125 = 1;
				Static72.aClass39_426 = Static91.aClass39_1120;
			} else {
				Static18.method300();
			}
			if (arg0[6].equals("game0")) {
				Static96.anInt2340 = 0;
			} else if (arg0[6].equals("game1")) {
				Static96.anInt2340 = 1;
			} else {
				Static18.method300();
			}
			Static35.aString1 = "127.0.0.1";
			@Pc(178) client local178 = new client();
			local178.method320("runescape", Static14.anInt368 + 32);
		} catch (@Pc(191) Exception local191) {
			Static77.method1294(local191, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method332() {
		@Pc(8) boolean local8 = Static123.method2102();
		if (local8 && Static50.aBoolean69 && Static74.aClass26_2 != null) {
			Static74.aClass26_2.method1809();
		}
		if (Static88.aBoolean111) {
			Static114.method1992(Static8.aCanvas1);
			Static19.method336(Static8.aCanvas1);
			if (Static110.aClass30_1 != null) {
				Static110.aClass30_1.method681(Static8.aCanvas1);
			}
			this.method323();
			Static113.method1986(Static8.aCanvas1);
			Static94.method1707(Static8.aCanvas1);
			if (Static110.aClass30_1 != null) {
				Static110.aClass30_1.method685(Static8.aCanvas1);
			}
		}
		if (Static88.anInt2205 == 0) {
			Static20.method387(Static72.anInt802, Static6.aClass39_177, null);
		} else if (Static88.anInt2205 == 5) {
			Static47.method773(Static62.aClass4_Sub2_Sub3_Sub3_3, Static53.aClass4_Sub2_Sub3_Sub3_2);
		} else if (Static88.anInt2205 == 10) {
			Static47.method773(Static62.aClass4_Sub2_Sub3_Sub3_3, Static53.aClass4_Sub2_Sub3_Sub3_2);
		} else if (Static88.anInt2205 == 20) {
			Static47.method773(Static62.aClass4_Sub2_Sub3_Sub3_3, Static53.aClass4_Sub2_Sub3_Sub3_2);
		} else if (Static88.anInt2205 == 25) {
			@Pc(101) int local101;
			if (Static75.anInt1799 == 1) {
				if (Static93.anInt3185 < Static68.anInt1705) {
					Static93.anInt3185 = Static68.anInt1705;
				}
				local101 = (Static93.anInt3185 - Static68.anInt1705) * 50 / Static93.anInt3185;
				Static103.method1845(Static62.method1123(new Class39[] { Static40.aClass39_574, Static25.aClass39_1782, Static29.method510(local101), Static59.aClass39_841 }), false);
			} else if (Static75.anInt1799 == 2) {
				if (Static111.anInt2777 > Static108.anInt2701) {
					Static108.anInt2701 = Static111.anInt2777;
				}
				local101 = (Static108.anInt2701 - Static111.anInt2777) * 50 / Static108.anInt2701 + 50;
				Static103.method1845(Static62.method1123(new Class39[] { Static40.aClass39_574, Static25.aClass39_1782, Static29.method510(local101), Static59.aClass39_841 }), false);
			} else {
				Static103.method1845(Static40.aClass39_574, false);
			}
		} else if (Static88.anInt2205 == 30) {
			Static129.method2186();
		} else if (Static88.anInt2205 == 40) {
			Static103.method1845(Static62.method1123(new Class39[] { Static122.aClass39_1619, Static65.aClass39_884, Static28.aClass39_400 }), false);
		}
		@Pc(260) int local260;
		@Pc(250) Graphics local250;
		if (Static88.anInt2205 == 30 && Static2.anInt17 == 0 && !Static58.aBoolean86) {
			try {
				local250 = Static8.aCanvas1.getGraphics();
				for (local260 = 0; local260 < Static87.anInt2227; local260++) {
					if (Static113.aBooleanArray16[local260]) {
						Static91.aClass6_1.method533(Static11.anIntArray38[local260], Static30.anIntArray89[local260], Static108.anIntArray301[local260], Static94.anIntArray252[local260], local250);
						Static113.aBooleanArray16[local260] = false;
					}
				}
			} catch (@Pc(316) Exception local316) {
				Static8.aCanvas1.repaint();
			}
		} else if (Static88.anInt2205 > 0) {
			try {
				local250 = Static8.aCanvas1.getGraphics();
				Static91.aClass6_1.method531(local250);
				Static58.aBoolean86 = false;
				for (local260 = 0; local260 < Static87.anInt2227; local260++) {
					Static113.aBooleanArray16[local260] = false;
				}
			} catch (@Pc(272) Exception local272) {
				Static8.aCanvas1.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method324()) {
			return;
		}
		Static49.anInt1283 = Integer.parseInt(this.getParameter("worldid"));
		Static14.anInt368 = Integer.parseInt(this.getParameter("modewhat"));
		Static1.anInt2 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static72.method529();
		} else {
			Static101.method1817();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static99.aBoolean121 = true;
		} else {
			Static99.aBoolean121 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static110.method1956();
			Static72.aClass39_426 = Static91.aClass39_1120;
			Static44.anInt1125 = 1;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static96.anInt2340 = 1;
		} else {
			Static96.anInt2340 = 0;
		}
		try {
			Static62.anInt1638 = Integer.parseInt(this.getParameter("js"));
			Static105.anInt2043 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(101) Exception local101) {
		}
		Static35.aString1 = this.getCodeBase().getHost();
		this.method335(Static14.anInt368 + 32);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method329() {
		Static71.anInt1738++;
		this.method340();
		Static42.method704();
		Static126.method2192();
		Static122.method2094();
		Static130.method2205();
		Static110.method1952();
		if (Static110.aClass30_1 != null) {
			@Pc(36) int local36 = Static110.aClass30_1.method686();
			Static83.anInt2076 = local36;
		}
		if (Static88.anInt2205 == 0) {
			Static35.method592();
			Static70.method1188();
		} else if (Static88.anInt2205 == 5) {
			Static92.method490(this);
			Static35.method592();
			Static70.method1188();
		} else if (Static88.anInt2205 == 10) {
			Static92.method490(this);
		} else if (Static88.anInt2205 == 20) {
			Static92.method490(this);
			Static45.method766();
		} else if (Static88.anInt2205 == 25) {
			Static68.method1175();
		}
		if (Static88.anInt2205 == 30) {
			Static121.method2082();
		} else if (Static88.anInt2205 == 40) {
			Static45.method766();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method339(@OriginalArg(1) int arg0) {
		Static16.anInt393 = 0;
		Static85.aClass16_5 = null;
		if (Static123.anInt3044 == Static103.anInt2560) {
			Static123.anInt3044 = Static127.anInt3134;
		} else {
			Static123.anInt3044 = Static103.anInt2560;
		}
		Static27.aClass69_1 = null;
		Static31.anInt815++;
		if (Static31.anInt815 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static88.anInt2205 <= 5) {
				this.method321("js5connect_full");
				Static88.anInt2205 = 1000;
			} else {
				Static111.anInt2780 = 3000;
			}
		} else if (Static31.anInt815 >= 2 && arg0 == 6) {
			this.method321("js5connect_outofdate");
			Static88.anInt2205 = 1000;
		} else if (Static31.anInt815 >= 4) {
			if (Static88.anInt2205 <= 5) {
				this.method321("js5connect");
				Static88.anInt2205 = 1000;
			} else {
				Static111.anInt2780 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method340() {
		if (Static88.anInt2205 != 1000) {
			@Pc(10) boolean local10 = Static42.method705();
			if (!local10) {
				this.method341();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method341() {
		if (Static131.anInt3205 >= 4) {
			this.method321("js5crc");
			Static88.anInt2205 = 1000;
			return;
		}
		if (Static64.anInt1659 >= 4) {
			if (Static88.anInt2205 <= 5) {
				this.method321("js5io");
				Static88.anInt2205 = 1000;
				return;
			}
			Static64.anInt1659 = 3;
			Static111.anInt2780 = 3000;
		}
		if (Static111.anInt2780-- > 0) {
			return;
		}
		try {
			if (Static16.anInt393 == 0) {
				Static85.aClass16_5 = Static126.aClass29_63.method605(Static35.aString1, Static123.anInt3044);
				Static16.anInt393++;
			}
			if (Static16.anInt393 == 1) {
				if (Static85.aClass16_5.anInt441 == 2) {
					this.method339(-1);
					return;
				}
				if (Static85.aClass16_5.anInt441 == 1) {
					Static16.anInt393++;
				}
			}
			if (Static16.anInt393 == 2) {
				Static27.aClass69_1 = new Class69((Socket) Static85.aClass16_5.anObject2, Static126.aClass29_63);
				@Pc(103) Class4_Sub16 local103 = new Class4_Sub16(5);
				local103.method1459(15);
				local103.method1489(460);
				Static27.aClass69_1.method1860(5, local103.aByteArray22);
				Static16.anInt393++;
				Static74.aLong85 = Static23.method431();
			}
			if (Static16.anInt393 == 3) {
				if (Static88.anInt2205 <= 5 || Static27.aClass69_1.method1863() > 0) {
					@Pc(154) int local154 = Static27.aClass69_1.method1858();
					if (local154 != 0) {
						this.method339(local154);
						return;
					}
					Static16.anInt393++;
				} else if (Static23.method431() - Static74.aLong85 > 30000L) {
					this.method339(-2);
					return;
				}
			}
			if (Static16.anInt393 == 4) {
				Static33.method555(Static27.aClass69_1, Static88.anInt2205 > 20);
				Static27.aClass69_1 = null;
				Static16.anInt393 = 0;
				Static85.aClass16_5 = null;
				Static31.anInt815 = 0;
			}
		} catch (@Pc(191) IOException local191) {
			this.method339(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method331() {
		Static127.anInt3134 = Static1.anInt2 == 0 ? 443 : Static49.anInt1283 + 50000;
		Static103.anInt2560 = Static1.anInt2 == 0 ? 43594 : Static49.anInt1283 + 40000;
		Static123.anInt3044 = Static103.anInt2560;
		Static48.method789();
		Static113.method1986(Static8.aCanvas1);
		Static94.method1707(Static8.aCanvas1);
		Static110.aClass30_1 = Static59.method1053();
		if (Static110.aClass30_1 != null) {
			Static110.aClass30_1.method685(Static8.aCanvas1);
		}
		Static20.anInt573 = Static37.anInt912;
		try {
			if (Static126.aClass29_63.aClass45_2 != null) {
				Static99.aClass38_2 = new Class38(Static126.aClass29_63.aClass45_2, 5200, 0);
				for (@Pc(61) int local61 = 0; local61 < 16; local61++) {
					Static83.aClass38Array1[local61] = new Class38(Static126.aClass29_63.aClass45Array1[local61], 6000, 0);
				}
				Static1.aClass38_1 = new Class38(Static126.aClass29_63.aClass45_1, 6000, 0);
				Static13.aClass75_1 = new Class75(255, Static99.aClass38_2, Static1.aClass38_1, 500000);
				Static126.aClass29_63.aClass45Array1 = null;
				Static126.aClass29_63.aClass45_2 = null;
				Static126.aClass29_63.aClass45_1 = null;
			}
		} catch (@Pc(106) IOException local106) {
			Static13.aClass75_1 = null;
			Static99.aClass38_2 = null;
			Static1.aClass38_1 = null;
		}
		if (Static1.anInt2 != 0) {
			Static106.aBoolean129 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method326() {
		if (Static104.aClass70_1 != null) {
			Static104.aClass70_1.aBoolean128 = false;
		}
		Static104.aClass70_1 = null;
		if (Static49.aClass69_3 != null) {
			Static49.aClass69_3.method1859();
			Static49.aClass69_3 = null;
		}
		Static87.method1646();
		Static55.method983();
		Static110.aClass30_1 = null;
		if (Static74.aClass26_2 != null) {
			Static74.aClass26_2.method1798();
		}
		if (Static70.aClass26_1 != null) {
			Static70.aClass26_1.method1798();
		}
		Static122.method2093();
		Static62.method1127();
		try {
			if (Static99.aClass38_2 != null) {
				Static99.aClass38_2.method889();
			}
			if (Static83.aClass38Array1 != null) {
				for (@Pc(54) int local54 = 0; local54 < Static83.aClass38Array1.length; local54++) {
					if (Static83.aClass38Array1[local54] != null) {
						Static83.aClass38Array1[local54].method889();
					}
				}
			}
			if (Static1.aClass38_1 != null) {
				Static1.aClass38_1.method889();
			}
		} catch (@Pc(81) IOException local81) {
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method325() {
		Static19.method337();
		Static54.method958();
		Static24.method333();
		Static93.method2206();
		Static72.method535();
		Static106.method1875();
		Static105.method1437();
		Static104.method1861();
		Static27.method497();
		Static52.method888();
		Static116.method2019();
		Static108.method1917();
		Static83.method1496();
		Static76.method1266();
		Static61.method1081();
		Static131.method2229();
		Static48.method794();
		Static97.method1793();
		Static91.method1638();
		Static59.method1058();
		Static98.method682();
		Static111.method1972();
		Static51.method1810();
		Static74.method1212();
		Static94.method1701();
		Static10.method212();
		Static5.method1916();
		Static109.method1926();
		Static117.method2045();
		Static69.method1184();
		Static126.method2190();
		Static78.method1299();
		Static35.method591();
		Static13.method232();
		Static124.method2140();
		Static95.method1750();
		Static9.method192();
		Static63.method1131();
		Static6.method157();
		Static60.method1067();
		Static26.method436();
		Static112.method1974();
		Static119.method2168();
		Static127.method2178();
		Static30.method524();
		Static3.method14();
		Static33.method551();
		Static66.method1155();
		Static100.method1813();
		Static101.method1818();
		Static23.method427();
		Static22.method422();
		Static44.method740();
		Static92.method478();
		Static4.method70();
		Static14.method238();
		Static2.method8();
		Static65.method1150();
		Static118.method2047();
		Static41.method687();
		Static58.method1046();
		Static128.method2181();
		Static7.method184();
		Static45.method762();
		Static15.method247();
		Static70.method1187();
		Static29.method508();
		Static17.method1687();
		Static25.method2196();
		Static57.method1030();
		Static113.method1987();
		Static81.method1340();
		Static39.method643();
		Static80.method1325();
		Static129.method2185();
		Static88.method1610();
		Static82.method1362();
		Static110.method1949();
		Static53.method915();
		Static21.method414();
		Static20.method388();
		Static102.method1840();
		Static130.method2202();
		Static50.method815();
		Static38.method628();
		Static115.method2010();
		Static11.method221();
		Static79.method1314();
		Static62.method1125();
		Static120.method2051();
		Static103.method1847();
		Static28.method505();
		Static77.method1297();
		Static55.method984();
		Static42.method712();
		Static36.method598();
		Static64.method1148();
		Static96.method1758();
		Static46.method770();
		Static32.method548();
		Static86.method1579();
		Static43.method736();
		Static121.method2074();
		Static67.method1165();
		Static125.method2174();
		Static40.method670();
		Static16.method262();
		Static1.method2();
		Static71.method1195();
		Static49.method797();
		Static84.method1515();
		Static31.method542();
		Static87.method1647();
		Static47.method772();
		Static114.method1994();
		Static68.method1176();
		Static34.method588();
		Static89.method1616();
		Static99.method1811();
		Static12.method228();
		Static75.method1225();
		Static123.method2103();
		Static56.method993();
		Static18.method301();
		Static73.method1208();
		Static85.method1520();
		Static107.method1879();
		Static90.method1622();
		Static8.method189();
		Static122.method2090();
	}
}
