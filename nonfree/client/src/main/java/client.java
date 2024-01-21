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
				Static36.method649();
			}
			Static15.anInt614 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static31.anInt921 = 0;
			} else if (arg0[1].equals("office")) {
				Static31.anInt921 = 1;
			} else if (arg0[1].equals("local")) {
				Static31.anInt921 = 2;
			} else {
				Static36.method649();
			}
			if (arg0[2].equals("live")) {
				Static113.anInt2719 = 0;
			} else if (arg0[2].equals("rc")) {
				Static113.anInt2719 = 1;
			} else if (arg0[2].equals("wip")) {
				Static113.anInt2719 = 2;
			} else {
				Static36.method649();
			}
			if (arg0[3].equals("lowmem")) {
				Static102.method1708();
			} else if (arg0[3].equals("highmem")) {
				Static78.method1370();
			} else {
				Static36.method649();
			}
			if (arg0[4].equals("free")) {
				Static28.aBoolean177 = false;
			} else if (arg0[4].equals("members")) {
				Static28.aBoolean177 = true;
			} else {
				Static36.method649();
			}
			if (arg0[5].equals("english")) {
				Static122.anInt2892 = 0;
			} else if (arg0[5].equals("german")) {
				Static117.method417();
				Static122.anInt2892 = 1;
				Static81.aClass34_1057 = Static34.aClass34_477;
			} else {
				Static36.method649();
			}
			if (arg0[6].equals("game0")) {
				Static17.anInt649 = 0;
			} else if (arg0[6].equals("game1")) {
				Static17.anInt649 = 1;
			} else {
				Static36.method649();
			}
			Static51.aString5 = "127.0.0.1";
			@Pc(176) client local176 = new client();
			local176.method434(Static113.anInt2719 + 32, "runescape");
		} catch (@Pc(190) Exception local190) {
			Static65.method1115(null, local190);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method428() {
		Static20.method439();
		Static55.method989();
		Static117.method433();
		Static120.method1908();
		Static127.method1351();
		Static58.method1027();
		Static90.method2058();
		Static78.method1364();
		Static92.method1589();
		Static26.method498();
		Static54.method950();
		Static48.method908();
		Static132.method2099();
		Static68.method1180();
		Static93.method1593();
		Static36.method647();
		Static1.method94();
		Static60.method1045();
		Static75.method1343();
		Static89.method1305();
		Static67.method1131();
		Static130.method937();
		Static66.method1121();
		Static15.method359();
		Static42.method722();
		Static32.method904();
		Static10.method276();
		Static129.method2014();
		Static72.method1266();
		Static109.method2038();
		Static128.method1995();
		Static29.method553();
		Static99.method1658();
		Static63.method1100();
		Static83.method1414();
		Static19.method395();
		Static44.method745();
		Static100.method1667();
		Static21.method447();
		Static37.method657();
		Static70.method1198();
		Static45.method1844();
		Static77.method1359();
		Static49.method909();
		Static88.method1491();
		Static97.method1645();
		Static82.method1391();
		Static101.method1693();
		Static95.method1618();
		Static122.method1922();
		Static114.method1824();
		Static35.method635();
		Static106.method1725();
		Static34.method625();
		Static56.method1560();
		Static12.method321();
		Static65.method1110();
		Static3.method106();
		Static71.method1255();
		Static27.method549();
		Static50.method916();
		Static81.method1390();
		Static133.method2108();
		Static126.method1988();
		Static80.method1388();
		Static91.method1553();
		Static119.method1882();
		Static9.method265();
		Static111.method1755();
		Static28.method2003();
		Static108.method1766();
		Static47.method876();
		Static33.method606();
		Static24.method479();
		Static23.method465();
		Static61.method1050();
		Static112.method1798();
		Static113.method1813();
		Static38.method675();
		Static124.method1965();
		Static74.method1327();
		Static43.method742();
		Static102.method1710();
		Static5.method214();
		Static6.method230();
		Static116.method1866();
		Static96.method1638();
		Static103.method862();
		Static118.method1872();
		Static107.method1733();
		Static31.method565();
		Static62.method1060();
		Static86.method1463();
		Static11.method280();
		Static22.method455();
		Static121.method1921();
		Static123.method1940();
		Static17.method389();
		Static4.method108();
		Static13.method344();
		Static76.method1349();
		Static2.method98();
		Static79.method1374();
		Static73.method1285();
		Static87.method1488();
		Static57.method1025();
		Static115.method1849();
		Static84.method1446();
		Static98.method1652();
		Static40.method689();
		Static39.method682();
		Static94.method1608();
		Static16.method384();
		Static7.method253();
		Static110.method1677();
		Static105.method1722();
		Static30.method563();
		Static59.method1032();
		Static52.method940();
		Static104.method1714();
		Static46.method867();
		Static18.method392();
		Static41.method696();
		Static85.method1461();
		Static125.method1978();
		Static14.method351();
		Static69.method1189();
		Static64.method1107();
		Static131.method2031();
		Static53.method948();
		Static51.method920();
		Static8.method263();
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method438() {
		if (Static44.anInt1247 != 1000) {
			@Pc(16) boolean local16 = Static44.method744();
			if (!local16) {
				this.method440();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method426() {
		@Pc(8) boolean local8 = Static65.method1116();
		if (local8 && Static64.aBoolean94 && Static98.aClass22_4 != null) {
			Static98.aClass22_4.method932();
		}
		if (Static76.aBoolean108) {
			Static4.method109(Static7.aCanvas1);
			Static69.method1195(Static7.aCanvas1);
			if (Static118.aClass47_1 != null) {
				Static118.aClass47_1.method1308(Static7.aCanvas1);
			}
			this.method435();
			Static89.method1306(Static7.aCanvas1);
			Static28.method2005(Static7.aCanvas1);
			if (Static118.aClass47_1 != null) {
				Static118.aClass47_1.method1309(Static7.aCanvas1);
			}
		}
		if (Static44.anInt1247 == 0) {
			Static132.method2106(null, Static3.anInt276, Static120.aClass34_1467);
		} else if (Static44.anInt1247 == 5) {
			Static116.method1862(Static16.aClass1_Sub1_Sub2_Sub3_Sub1_3, Static90.aClass1_Sub1_Sub2_Sub3_Sub1_7);
		} else if (Static44.anInt1247 == 10) {
			Static116.method1862(Static16.aClass1_Sub1_Sub2_Sub3_Sub1_3, Static90.aClass1_Sub1_Sub2_Sub3_Sub1_7);
		} else if (Static44.anInt1247 == 20) {
			Static116.method1862(Static16.aClass1_Sub1_Sub2_Sub3_Sub1_3, Static90.aClass1_Sub1_Sub2_Sub3_Sub1_7);
		} else if (Static44.anInt1247 == 25) {
			@Pc(149) int local149;
			if (Static116.anInt2802 == 1) {
				if (Static101.anInt2546 < Static124.anInt2987) {
					Static101.anInt2546 = Static124.anInt2987;
				}
				local149 = (Static101.anInt2546 - Static124.anInt2987) * 50 / Static101.anInt2546;
				Static72.method1267(false, Static91.method1554(new Class34[] { Static17.aClass34_347, Static55.aClass34_740, Static85.method1456(local149), Static13.aClass34_290 }));
			} else if (Static116.anInt2802 == 2) {
				if (Static89.anInt1975 > Static11.anInt490) {
					Static11.anInt490 = Static89.anInt1975;
				}
				local149 = (Static11.anInt490 - Static89.anInt1975) * 50 / Static11.anInt490 + 50;
				Static72.method1267(false, Static91.method1554(new Class34[] { Static17.aClass34_347, Static55.aClass34_740, Static85.method1456(local149), Static13.aClass34_290 }));
			} else {
				Static72.method1267(false, Static17.aClass34_347);
			}
		} else if (Static44.anInt1247 == 30) {
			Static28.method2009();
		} else if (Static44.anInt1247 == 40) {
			Static72.method1267(false, Static91.method1554(new Class34[] { Static77.aClass34_1025, Static91.aClass34_1175, Static106.aClass34_1309 }));
		}
		@Pc(250) int local250;
		@Pc(248) Graphics local248;
		if (Static44.anInt1247 == 30 && Static59.anInt1635 == 0 && !Static86.aBoolean121) {
			try {
				local248 = Static7.aCanvas1.getGraphics();
				for (local250 = 0; local250 < Static76.anInt2054; local250++) {
					if (Static43.aBooleanArray8[local250]) {
						Static62.aClass6_1.method1352(Static34.anIntArray99[local250], local248, Static32.anIntArray151[local250], Static17.anIntArray64[local250], Static12.anIntArray39[local250]);
						Static43.aBooleanArray8[local250] = false;
					}
				}
			} catch (@Pc(286) Exception local286) {
				Static7.aCanvas1.repaint();
			}
		} else if (Static44.anInt1247 > 0) {
			try {
				local248 = Static7.aCanvas1.getGraphics();
				Static62.aClass6_1.method1355(local248);
				Static86.aBoolean121 = false;
				for (local250 = 0; local250 < Static76.anInt2054; local250++) {
					Static43.aBooleanArray8[local250] = false;
				}
			} catch (@Pc(319) Exception local319) {
				Static7.aCanvas1.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method431() {
		if (Static48.aClass36_1 != null) {
			Static48.aClass36_1.aBoolean89 = false;
		}
		Static48.aClass36_1 = null;
		if (Static3.aClass51_1 != null) {
			Static3.aClass51_1.method1361();
			Static3.aClass51_1 = null;
		}
		Static46.method869();
		Static129.method2016();
		Static118.aClass47_1 = null;
		if (Static98.aClass22_4 != null) {
			Static98.aClass22_4.method922();
		}
		if (Static127.aClass22_3 != null) {
			Static127.aClass22_3.method922();
		}
		Static126.method1987();
		Static94.method1610();
		try {
			if (Static61.aClass17_4 != null) {
				Static61.aClass17_4.method507();
			}
			if (Static4.aClass17Array1 != null) {
				for (@Pc(53) int local53 = 0; local53 < Static4.aClass17Array1.length; local53++) {
					if (Static4.aClass17Array1[local53] != null) {
						Static4.aClass17Array1[local53].method507();
					}
				}
			}
			if (Static59.aClass17_3 != null) {
				Static59.aClass17_3.method507();
			}
		} catch (@Pc(80) IOException local80) {
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method440() {
		if (Static74.anInt2021 >= 4) {
			this.method429("js5crc");
			Static44.anInt1247 = 1000;
			return;
		}
		if (Static102.anInt2570 >= 4) {
			if (Static44.anInt1247 <= 5) {
				this.method429("js5io");
				Static44.anInt1247 = 1000;
				return;
			}
			Static102.anInt2570 = 3;
			Static60.anInt1657 = 3000;
		}
		if (Static60.anInt1657-- > 0) {
			return;
		}
		try {
			if (Static110.anInt2528 == 0) {
				Static45.aClass73_16 = Static100.aClass15_4.method483(Static78.anInt2088, Static51.aString5);
				Static110.anInt2528++;
			}
			if (Static110.anInt2528 == 1) {
				if (Static45.aClass73_16.anInt2813 == 2) {
					this.method441(-1);
					return;
				}
				if (Static45.aClass73_16.anInt2813 == 1) {
					Static110.anInt2528++;
				}
			}
			if (Static110.anInt2528 == 2) {
				Static121.aClass51_3 = new Class51((Socket) Static45.aClass73_16.anObject4, Static100.aClass15_4);
				@Pc(93) Class1_Sub19 local93 = new Class1_Sub19(5);
				local93.method2061(15);
				local93.method2062(463);
				Static121.aClass51_3.method1362(local93.aByteArray42, 5);
				Static110.anInt2528++;
				Static97.aLong128 = Static35.method634();
			}
			if (Static110.anInt2528 == 3) {
				if (Static44.anInt1247 <= 5 || Static121.aClass51_3.method1367() > 0) {
					@Pc(144) int local144 = Static121.aClass51_3.method1371();
					if (local144 != 0) {
						this.method441(local144);
						return;
					}
					Static110.anInt2528++;
				} else if (Static35.method634() - Static97.aLong128 > 30000L) {
					this.method441(-2);
					return;
				}
			}
			if (Static110.anInt2528 == 4) {
				Static78.method1363(Static121.aClass51_3, Static44.anInt1247 > 20);
				Static45.aClass73_16 = null;
				Static110.anInt2528 = 0;
				Static121.aClass51_3 = null;
				Static59.anInt1633 = 0;
			}
		} catch (@Pc(184) IOException local184) {
			this.method441(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method441(@OriginalArg(0) int arg0) {
		Static121.aClass51_3 = null;
		Static45.aClass73_16 = null;
		Static110.anInt2528 = 0;
		if (Static55.anInt1525 == Static78.anInt2088) {
			Static78.anInt2088 = Static106.anInt2604;
		} else {
			Static78.anInt2088 = Static55.anInt1525;
		}
		Static59.anInt1633++;
		if (Static59.anInt1633 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static44.anInt1247 <= 5) {
				this.method429("js5connect_full");
				Static44.anInt1247 = 1000;
			} else {
				Static60.anInt1657 = 3000;
			}
		} else if (Static59.anInt1633 >= 2 && arg0 == 6) {
			this.method429("js5connect_outofdate");
			Static44.anInt1247 = 1000;
		} else if (Static59.anInt1633 >= 4) {
			if (Static44.anInt1247 > 5) {
				Static60.anInt1657 = 3000;
			} else {
				this.method429("js5connect");
				Static44.anInt1247 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method424() {
		Static55.anInt1525 = Static31.anInt921 == 0 ? 43594 : Static15.anInt614 + 40000;
		if (Static17.anInt649 == 1) {
			Static127.aShortArrayArray7 = Static8.aShortArrayArray3;
			Static77.aShortArray10 = Static110.aShortArray14;
			Static56.aShortArray12 = Static76.aShortArray9;
			Static54.aShortArrayArray6 = Static50.aShortArrayArray5;
		} else {
			Static77.aShortArray10 = Static76.aShortArray8;
			Static54.aShortArrayArray6 = Static92.aShortArrayArray8;
			Static56.aShortArray12 = Static128.aShortArray19;
			Static127.aShortArrayArray7 = Static30.aShortArrayArray4;
		}
		Static106.anInt2604 = Static31.anInt921 == 0 ? 443 : Static15.anInt614 + 50000;
		Static78.anInt2088 = Static55.anInt1525;
		Static34.method622();
		Static89.method1306(Static7.aCanvas1);
		Static28.method2005(Static7.aCanvas1);
		Static118.aClass47_1 = Static34.method628();
		if (Static118.aClass47_1 != null) {
			Static118.aClass47_1.method1309(Static7.aCanvas1);
		}
		Static3.anInt275 = Static25.anInt819;
		try {
			if (Static100.aClass15_4.aClass3_1 != null) {
				Static61.aClass17_4 = new Class17(Static100.aClass15_4.aClass3_1, 5200, 0);
				for (@Pc(82) int local82 = 0; local82 < 16; local82++) {
					Static4.aClass17Array1[local82] = new Class17(Static100.aClass15_4.aClass3Array1[local82], 6000, 0);
				}
				Static59.aClass17_3 = new Class17(Static100.aClass15_4.aClass3_2, 6000, 0);
				Static114.aClass33_4 = new Class33(255, Static61.aClass17_4, Static59.aClass17_3, 500000);
				Static100.aClass15_4.aClass3_2 = null;
				Static100.aClass15_4.aClass3_1 = null;
				Static100.aClass15_4.aClass3Array1 = null;
			}
		} catch (@Pc(127) IOException local127) {
			Static59.aClass17_3 = null;
			Static61.aClass17_4 = null;
			Static114.aClass33_4 = null;
		}
		if (Static31.anInt921 != 0) {
			Static31.aBoolean48 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method423()) {
			return;
		}
		Static15.anInt614 = Integer.parseInt(this.getParameter("worldid"));
		Static113.anInt2719 = Integer.parseInt(this.getParameter("modewhat"));
		Static31.anInt921 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static102.method1708();
		} else {
			Static78.method1370();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static28.aBoolean177 = true;
		} else {
			Static28.aBoolean177 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static117.method417();
			Static81.aClass34_1057 = Static34.aClass34_477;
			Static122.anInt2892 = 1;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static17.anInt649 = 1;
		} else {
			Static17.anInt649 = 0;
		}
		try {
			Static16.anInt633 = Integer.parseInt(this.getParameter("js"));
			Static88.anInt2289 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(101) Exception local101) {
		}
		Static51.aString5 = this.getCodeBase().getHost();
		this.method421(Static113.anInt2719 + 32);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method419() {
		Static73.anInt1947++;
		this.method438();
		Static76.method1347();
		Static57.method1023();
		Static118.method1873();
		Static101.method1692();
		Static88.method1492();
		if (Static118.aClass47_1 != null) {
			@Pc(34) int local34 = Static118.aClass47_1.method1307();
			Static126.anInt2997 = local34;
		}
		if (Static44.anInt1247 == 0) {
			Static36.method640();
			Static85.method1460();
		} else if (Static44.anInt1247 == 5) {
			Static24.method480(this);
			Static36.method640();
			Static85.method1460();
		} else if (Static44.anInt1247 == 10) {
			Static24.method480(this);
		} else if (Static44.anInt1247 == 20) {
			Static24.method480(this);
			Static50.method915();
		} else if (Static44.anInt1247 == 25) {
			Static9.method269();
		}
		if (Static44.anInt1247 == 30) {
			Static60.method1041();
		} else if (Static44.anInt1247 == 40) {
			Static50.method915();
			return;
		}
	}
}
