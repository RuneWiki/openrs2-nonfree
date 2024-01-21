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
				Static19.method354();
			}
			Static9.anInt189 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static88.anInt2341 = 0;
			} else if (arg0[1].equals("office")) {
				Static88.anInt2341 = 1;
			} else if (arg0[1].equals("local")) {
				Static88.anInt2341 = 2;
			} else {
				Static19.method354();
			}
			if (arg0[2].equals("live")) {
				Static17.anInt450 = 0;
			} else if (arg0[2].equals("rc")) {
				Static17.anInt450 = 1;
			} else if (arg0[2].equals("wip")) {
				Static17.anInt450 = 2;
			} else {
				Static19.method354();
			}
			if (arg0[3].equals("lowmem")) {
				Static13.method226();
			} else if (arg0[3].equals("highmem")) {
				Static61.method935();
			} else {
				Static19.method354();
			}
			if (arg0[4].equals("free")) {
				Static16.aBoolean19 = false;
			} else if (arg0[4].equals("members")) {
				Static16.aBoolean19 = true;
			} else {
				Static19.method354();
			}
			if (arg0[5].equals("english")) {
				Static115.anInt2594 = 0;
			} else if (arg0[5].equals("german")) {
				Static15.method239();
				Static36.aClass34_500 = Static22.aClass34_1200;
				Static115.anInt2594 = 1;
			} else {
				Static19.method354();
			}
			if (arg0[6].equals("game0")) {
				Static56.anInt1415 = 0;
			} else if (arg0[6].equals("game1")) {
				Static56.anInt1415 = 1;
			} else {
				Static19.method354();
			}
			Static82.aString4 = "127.0.0.1";
			@Pc(174) client local174 = new client();
			local174.method337("runescape", Static17.anInt450 + 32);
		} catch (@Pc(188) Exception local188) {
			Static79.method1133(local188, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method347() {
		if (Static56.anInt1415 == 1) {
			Static79.aShortArray32 = Static116.aShortArray39;
			Static47.aShortArray27 = Static130.aShortArray40;
			Static47.aShortArrayArray4 = Static59.aShortArrayArray5;
			Static27.aShortArrayArray1 = Static93.aShortArrayArray8;
		} else {
			Static27.aShortArrayArray1 = Static64.aShortArrayArray7;
			Static47.aShortArrayArray4 = Static75.aShortArrayArray6;
			Static47.aShortArray27 = Static90.aShortArray2;
			Static79.aShortArray32 = Static84.aShortArray33;
		}
		Static64.anInt2037 = Static88.anInt2341 == 0 ? 43594 : Static9.anInt189 + 40000;
		Static67.anInt1653 = Static64.anInt2037;
		Static54.anInt1372 = Static88.anInt2341 == 0 ? 443 : Static9.anInt189 + 50000;
		Static20.method367();
		Static45.method677(Static119.aCanvas1);
		Static84.method1252(Static119.aCanvas1);
		Static1.aClass9_1 = Static44.method668();
		if (Static1.aClass9_1 != null) {
			Static1.aClass9_1.method194(Static119.aCanvas1);
		}
		Static16.anInt389 = Static63.anInt1603;
		try {
			if (Static93.aClass40_3.aClass63_2 != null) {
				Static7.aClass35_1 = new Class35(Static93.aClass40_3.aClass63_2, 5200, 0);
				for (@Pc(80) int local80 = 0; local80 < 16; local80++) {
					Static120.aClass35Array1[local80] = new Class35(Static93.aClass40_3.aClass63Array1[local80], 6000, 0);
				}
				Static107.aClass35_4 = new Class35(Static93.aClass40_3.aClass63_3, 6000, 0);
				Static44.aClass61_1 = new Class61(255, Static7.aClass35_1, Static107.aClass35_4, 500000);
				Static132.aClass35_6 = new Class35(Static93.aClass40_3.aClass63_4, 24, 0);
				Static93.aClass40_3.aClass63Array1 = null;
				Static93.aClass40_3.aClass63_3 = null;
				Static93.aClass40_3.aClass63_2 = null;
				Static93.aClass40_3.aClass63_4 = null;
			}
		} catch (@Pc(136) IOException local136) {
			Static7.aClass35_1 = null;
			Static44.aClass61_1 = null;
			Static132.aClass35_6 = null;
			Static107.aClass35_4 = null;
		}
		if (Static88.anInt2341 != 0) {
			Static1.aBoolean1 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method356() {
		if (Static84.anInt2112 >= 4) {
			this.method336("js5crc");
			Static61.anInt1587 = 1000;
			return;
		}
		if (Static67.anInt1665 >= 4) {
			if (Static61.anInt1587 <= 5) {
				this.method336("js5io");
				Static61.anInt1587 = 1000;
				return;
			}
			Static67.anInt1665 = 3;
			Static38.anInt943 = 3000;
		}
		if (Static38.anInt943-- > 0) {
			return;
		}
		try {
			if (Static34.anInt907 == 0) {
				Static57.aClass10_5 = Static93.aClass40_3.method948(Static82.aString4, Static67.anInt1653);
				Static34.anInt907++;
			}
			if (Static34.anInt907 == 1) {
				if (Static57.aClass10_5.anInt295 == 2) {
					this.method358(-1);
					return;
				}
				if (Static57.aClass10_5.anInt295 == 1) {
					Static34.anInt907++;
				}
			}
			if (Static34.anInt907 == 2) {
				Static128.aClass25_5 = new Class25((Socket) Static57.aClass10_5.anObject1, Static93.aClass40_3);
				@Pc(103) Class8_Sub20 local103 = new Class8_Sub20(5);
				local103.method1883(15);
				local103.method1873(472);
				Static128.aClass25_5.method586(5, local103.aByteArray44);
				Static34.anInt907++;
				Static42.aLong35 = Static27.method497();
			}
			if (Static34.anInt907 == 3) {
				if (Static61.anInt1587 <= 5 || Static128.aClass25_5.method585() > 0) {
					@Pc(143) int local143 = Static128.aClass25_5.method582();
					if (local143 != 0) {
						this.method358(local143);
						return;
					}
					Static34.anInt907++;
				} else if (Static27.method497() - Static42.aLong35 > 30000L) {
					this.method358(-2);
					return;
				}
			}
			if (Static34.anInt907 == 4) {
				Static67.method1031(Static128.aClass25_5, Static61.anInt1587 > 20);
				Static57.aClass10_5 = null;
				Static128.aClass25_5 = null;
				Static94.anInt2222 = 0;
				Static34.anInt907 = 0;
			}
		} catch (@Pc(200) IOException local200) {
			this.method358(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method340() {
		if (Static134.aClass33_1 != null) {
			Static134.aClass33_1.aBoolean54 = false;
		}
		Static134.aClass33_1 = null;
		if (Static93.aClass25_4 != null) {
			Static93.aClass25_4.method588();
			Static93.aClass25_4 = null;
		}
		Static80.method1172();
		Static123.method1940();
		Static1.aClass9_1 = null;
		if (Static96.aClass13_2 != null) {
			Static96.aClass13_2.method1597();
		}
		if (Static112.aClass13_3 != null) {
			Static112.aClass13_3.method1597();
		}
		Static56.method821();
		Static108.method1527();
		try {
			if (Static7.aClass35_1 != null) {
				Static7.aClass35_1.method906();
			}
			if (Static120.aClass35Array1 != null) {
				for (@Pc(50) int local50 = 0; local50 < Static120.aClass35Array1.length; local50++) {
					if (Static120.aClass35Array1[local50] != null) {
						Static120.aClass35Array1[local50].method906();
					}
				}
			}
			if (Static107.aClass35_4 != null) {
				Static107.aClass35_4.method906();
			}
			if (Static132.aClass35_6 != null) {
				Static132.aClass35_6.method906();
			}
		} catch (@Pc(84) IOException local84) {
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method358(@OriginalArg(1) int arg0) {
		Static94.anInt2222++;
		if (Static64.anInt2037 == Static67.anInt1653) {
			Static67.anInt1653 = Static54.anInt1372;
		} else {
			Static67.anInt1653 = Static64.anInt2037;
		}
		Static57.aClass10_5 = null;
		Static34.anInt907 = 0;
		Static128.aClass25_5 = null;
		if (Static94.anInt2222 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static61.anInt1587 <= 5) {
				this.method336("js5connect_full");
				Static61.anInt1587 = 1000;
			} else {
				Static38.anInt943 = 3000;
			}
		} else if (Static94.anInt2222 >= 2 && arg0 == 6) {
			this.method336("js5connect_outofdate");
			Static61.anInt1587 = 1000;
		} else if (Static94.anInt2222 >= 4) {
			if (Static61.anInt1587 <= 5) {
				this.method336("js5connect");
				Static61.anInt1587 = 1000;
			} else {
				Static38.anInt943 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method348() {
		Static19.method360();
		Static56.method837();
		Static96.method335();
		Static126.method1482();
		Static111.method1988();
		Static54.method781();
		Static132.method1890();
		Static38.method581();
		Static80.method1177();
		Static58.method905();
		Static97.method1366();
		Static83.method1228();
		Static120.method1908();
		Static98.method1395();
		Static67.method1028();
		Static134.method2017();
		Static47.method730();
		Static76.method1111();
		Static7.method44();
		Static90.method193();
		Static94.method1338();
		Static22.method1599();
		Static78.method1128();
		Static82.method1200();
		Static23.method415();
		Static64.method1225();
		Static103.method1472();
		Static106.method1501();
		Static39.method597();
		Static102.method2012();
		Static74.method1090();
		Static46.method684();
		Static75.method1095();
		Static85.method1276();
		Static26.method493();
		Static53.method775();
		Static92.method1326();
		Static45.method681();
		Static9.method98();
		Static18.method306();
		Static1.method6();
		Static66.method1957();
		Static116.method1642();
		Static104.method1475();
		Static30.method528();
		Static15.method238();
		Static114.method1621();
		Static32.method538();
		Static105.method1478();
		Static36.method573();
		Static60.method933();
		Static27.method498();
		Static5.method36();
		Static107.method1514();
		Static24.method1155();
		Static57.method895();
		Static31.method531();
		Static100.method1456();
		Static52.method773();
		Static2.method8();
		Static87.method1308();
		Static4.method29();
		Static50.method753();
		Static95.method1349();
		Static33.method551();
		Static113.method1615();
		Static121.method1929();
		Static101.method1460();
		Static110.method1726();
		Static48.method1950();
		Static11.method179();
		Static133.method2009();
		Static43.method645();
		Static115.method1635();
		Static40.method610();
		Static130.method1999();
		Static44.method670();
		Static59.method923();
		Static29.method521();
		Static17.method267();
		Static72.method1067();
		Static51.method763();
		Static21.method385();
		Static108.method1528();
		Static81.method1191();
		Static99.method1447();
		Static42.method639();
		Static131.method1760();
		Static41.method622();
		Static122.method1939();
		Static34.method554();
		Static69.method1042();
		Static93.method1332();
		Static62.method940();
		Static125.method1975();
		Static79.method1139();
		Static10.method109();
		Static28.method503();
		Static61.method936();
		Static118.method1651();
		Static109.method1535();
		Static119.method1771();
		Static71.method1056();
		Static124.method1961();
		Static84.method1250();
		Static16.method245();
		Static13.method228();
		Static8.method92();
		Static86.method1303();
		Static25.method454();
		Static73.method1084();
		Static128.method1985();
		Static3.method26();
		Static129.method1997();
		Static88.method1450();
		Static123.method1944();
		Static127.method1983();
		Static68.method1039();
		Static91.method1325();
		Static55.method802();
		Static37.method575();
		Static112.method1537();
		Static65.method953();
		Static20.method368();
		Static49.method746();
		Static89.method1322();
		Static77.method1119();
		Static70.method1049();
		Static117.method1644();
		Static12.method203();
		Static35.method565();
		Static6.method39();
		Static14.method233();
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method353() {
		@Pc(4) boolean local4 = Static77.method1117();
		if (local4 && Static60.aBoolean63 && Static96.aClass13_2 != null) {
			Static96.aClass13_2.method1611();
		}
		if (Static124.aBoolean109) {
			Static38.method587(Static119.aCanvas1);
			Static126.method1481(Static119.aCanvas1);
			if (Static1.aClass9_1 != null) {
				Static1.aClass9_1.method196(Static119.aCanvas1);
			}
			this.method350();
			Static45.method677(Static119.aCanvas1);
			Static84.method1252(Static119.aCanvas1);
			if (Static1.aClass9_1 != null) {
				Static1.aClass9_1.method194(Static119.aCanvas1);
			}
		}
		if (Static61.anInt1587 == 0) {
			Static74.method1089(null, Static83.aClass34_935, Static70.anInt1702);
		} else if (Static61.anInt1587 == 5) {
			Static78.method1125(Static41.aClass8_Sub1_Sub3_Sub4_Sub1_2, Static18.aClass8_Sub1_Sub3_Sub4_Sub1_1);
		} else if (Static61.anInt1587 == 10) {
			Static78.method1125(Static41.aClass8_Sub1_Sub3_Sub4_Sub1_2, Static18.aClass8_Sub1_Sub3_Sub4_Sub1_1);
		} else if (Static61.anInt1587 == 20) {
			Static78.method1125(Static41.aClass8_Sub1_Sub3_Sub4_Sub1_2, Static18.aClass8_Sub1_Sub3_Sub4_Sub1_1);
		} else if (Static61.anInt1587 == 25) {
			@Pc(151) int local151;
			if (Static32.anInt871 == 1) {
				if (Static128.anInt3019 > Static15.anInt370) {
					Static15.anInt370 = Static128.anInt3019;
				}
				local151 = (Static15.anInt370 - Static128.anInt3019) * 50 / Static15.anInt370;
				Static105.method1477(Static44.method669(new Class34[] { Static113.aClass34_1209, Static60.aClass34_746, Static44.method672(local151), Static130.aClass34_1407 }), false);
			} else if (Static32.anInt871 == 2) {
				if (Static4.anInt64 < Static36.anInt922) {
					Static4.anInt64 = Static36.anInt922;
				}
				local151 = (Static4.anInt64 - Static36.anInt922) * 50 / Static4.anInt64 + 50;
				Static105.method1477(Static44.method669(new Class34[] { Static113.aClass34_1209, Static60.aClass34_746, Static44.method672(local151), Static130.aClass34_1407 }), false);
			} else {
				Static105.method1477(Static113.aClass34_1209, false);
			}
		} else if (Static61.anInt1587 == 30) {
			Static77.method1120();
		} else if (Static61.anInt1587 == 40) {
			Static105.method1477(Static44.method669(new Class34[] { Static132.aClass34_1319, Static20.aClass34_302, Static16.aClass34_230 }), false);
		}
		@Pc(264) int local264;
		@Pc(252) Graphics local252;
		if (Static61.anInt1587 == 30 && Static82.anInt1973 == 0 && !Static39.aBoolean46) {
			try {
				local252 = Static119.aCanvas1.getGraphics();
				for (local264 = 0; local264 < Static133.anInt3069; local264++) {
					if (Static24.aBooleanArray11[local264]) {
						Static31.aClass62_1.method1992(local252, Static38.anIntArray131[local264], Static2.anIntArray3[local264], Static6.anIntArray12[local264], Static125.anIntArray395[local264]);
						Static24.aBooleanArray11[local264] = false;
					}
				}
			} catch (@Pc(320) Exception local320) {
				Static119.aCanvas1.repaint();
			}
		} else if (Static61.anInt1587 > 0) {
			try {
				local252 = Static119.aCanvas1.getGraphics();
				Static31.aClass62_1.method1990(local252);
				Static39.aBoolean46 = false;
				for (local264 = 0; local264 < Static133.anInt3069; local264++) {
					Static24.aBooleanArray11[local264] = false;
				}
			} catch (@Pc(280) Exception local280) {
				Static119.aCanvas1.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method361() {
		if (Static61.anInt1587 != 1000) {
			@Pc(15) boolean local15 = Static67.method1022();
			if (!local15) {
				this.method356();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method346()) {
			return;
		}
		Static9.anInt189 = Integer.parseInt(this.getParameter("worldid"));
		Static17.anInt450 = Integer.parseInt(this.getParameter("modewhat"));
		Static88.anInt2341 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static13.method226();
		} else {
			Static61.method935();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static16.aBoolean19 = true;
		} else {
			Static16.aBoolean19 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static15.method239();
			Static115.anInt2594 = 1;
			Static36.aClass34_500 = Static22.aClass34_1200;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static56.anInt1415 = 1;
		} else {
			Static56.anInt1415 = 0;
		}
		try {
			Static116.anInt2613 = Integer.parseInt(this.getParameter("js"));
			Static49.anInt1314 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(101) Exception local101) {
		}
		Static82.aString4 = this.getCodeBase().getHost();
		this.method352(Static17.anInt450 + 32);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method349() {
		Static21.anInt655++;
		if (Static21.anInt655 % 1000 == 1) {
			@Pc(20) GregorianCalendar local20 = new GregorianCalendar();
			Static52.anInt1356 = local20.get(11) * 600 + local20.get(12) * 10 + local20.get(13) / 6;
			Static128.aRandom1.setSeed((long) Static52.anInt1356);
		}
		this.method361();
		Static94.method1337();
		Static95.method1346();
		Static33.method548();
		Static46.method686();
		Static106.method1496();
		if (Static1.aClass9_1 != null) {
			@Pc(66) int local66 = Static1.aClass9_1.method195();
			Static129.anInt3044 = local66;
		}
		if (Static61.anInt1587 == 0) {
			Static132.method1870();
			Static79.method1141();
		} else if (Static61.anInt1587 == 5) {
			Static67.method1020(this);
			Static132.method1870();
			Static79.method1141();
		} else if (Static61.anInt1587 == 10) {
			Static67.method1020(this);
		} else if (Static61.anInt1587 == 20) {
			Static67.method1020(this);
			Static17.method268();
		} else if (Static61.anInt1587 == 25) {
			Static48.method1951();
		}
		if (Static61.anInt1587 == 30) {
			Static23.method420();
		} else if (Static61.anInt1587 == 40) {
			Static17.method268();
		}
	}
}
