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
				Static53.method1223();
			}
			Static118.anInt2768 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static126.anInt2891 = 0;
			} else if (arg0[1].equals("office")) {
				Static126.anInt2891 = 1;
			} else if (arg0[1].equals("local")) {
				Static126.anInt2891 = 2;
			} else {
				Static53.method1223();
			}
			if (arg0[2].equals("live")) {
				Static63.anInt1921 = 0;
			} else if (arg0[2].equals("rc")) {
				Static63.anInt1921 = 1;
			} else if (arg0[2].equals("wip")) {
				Static63.anInt1921 = 2;
			} else {
				Static53.method1223();
			}
			if (arg0[3].equals("lowmem")) {
				Static47.method1045();
			} else if (arg0[3].equals("highmem")) {
				Static102.method1786();
			} else {
				Static53.method1223();
			}
			if (arg0[4].equals("free")) {
				Static32.aBoolean35 = false;
			} else if (arg0[4].equals("members")) {
				Static32.aBoolean35 = true;
			} else {
				Static53.method1223();
			}
			if (arg0[5].equals("english")) {
				Static129.anInt2913 = 0;
			} else if (arg0[5].equals("german")) {
				Static132.method2044();
				Static129.anInt2913 = 1;
				Static13.aClass66_283 = Static52.aClass66_863;
			} else {
				Static53.method1223();
			}
			if (arg0[6].equals("game0")) {
				Static20.anInt616 = 0;
			} else if (arg0[6].equals("game1")) {
				Static20.anInt616 = 1;
			} else {
				Static53.method1223();
			}
			Static98.aString4 = "127.0.0.1";
			@Pc(180) client local180 = new client();
			local180.method436(Static63.anInt1921 + 32, "runescape");
		} catch (@Pc(193) Exception local193) {
			Static93.method1709(local193, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method442() {
		Static6.anInt318 = Static126.anInt2891 == 0 ? 443 : Static118.anInt2768 + 50000;
		Static124.anInt2864 = Static126.anInt2891 == 0 ? 43594 : Static118.anInt2768 + 40000;
		Static88.anInt2320 = Static124.anInt2864;
		if (Static20.anInt616 == 1) {
			Static16.aShortArrayArray2 = Static49.aShortArrayArray6;
			Static70.aShortArray21 = Static8.aShortArray10;
			Static16.aShortArrayArray1 = Static40.aShortArrayArray5;
			Static15.aShortArray102 = Static85.aShortArray66;
		} else {
			Static16.aShortArrayArray1 = Static82.aShortArrayArray7;
			Static16.aShortArrayArray2 = Static84.aShortArrayArray8;
			Static70.aShortArray21 = Static50.aShortArray45;
			Static15.aShortArray102 = Static36.aShortArray24;
		}
		Static11.method361();
		Static40.method933(Static104.aCanvas1);
		Static4.method142(Static104.aCanvas1);
		Static59.aClass3_1 = Static105.method1813();
		if (Static59.aClass3_1 != null) {
			Static59.aClass3_1.method75(Static104.aCanvas1);
		}
		Static126.anInt2888 = Static7.anInt325;
		try {
			if (Static120.aClass7_4.aClass55_2 != null) {
				Static39.aClass72_3 = new Class72(Static120.aClass7_4.aClass55_2, 5200, 0);
				for (@Pc(83) int local83 = 0; local83 < 16; local83++) {
					Static116.aClass72Array1[local83] = new Class72(Static120.aClass7_4.aClass55Array1[local83], 6000, 0);
				}
				Static122.aClass72_5 = new Class72(Static120.aClass7_4.aClass55_1, 6000, 0);
				Static131.aClass22_13 = new Class22(255, Static39.aClass72_3, Static122.aClass72_5, 500000);
				Static56.aClass72_4 = new Class72(Static120.aClass7_4.aClass55_3, 24, 0);
				Static120.aClass7_4.aClass55_3 = null;
				Static120.aClass7_4.aClass55Array1 = null;
				Static120.aClass7_4.aClass55_1 = null;
				Static120.aClass7_4.aClass55_2 = null;
			}
		} catch (@Pc(139) IOException local139) {
			Static131.aClass22_13 = null;
			Static122.aClass72_5 = null;
			Static39.aClass72_3 = null;
			Static56.aClass72_4 = null;
		}
		if (Static126.anInt2891 != 0) {
			Static126.aBoolean119 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method447()) {
			return;
		}
		Static118.anInt2768 = Integer.parseInt(this.getParameter("worldid"));
		Static63.anInt1921 = Integer.parseInt(this.getParameter("modewhat"));
		Static126.anInt2891 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static47.method1045();
		} else {
			Static102.method1786();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static32.aBoolean35 = true;
		} else {
			Static32.aBoolean35 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static132.method2044();
			Static13.aClass66_283 = Static52.aClass66_863;
			Static129.anInt2913 = 1;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static20.anInt616 = 1;
		} else {
			Static20.anInt616 = 0;
		}
		try {
			Static16.anInt485 = Integer.parseInt(this.getParameter("js"));
			Static109.anInt2626 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(101) Exception local101) {
		}
		Static98.aString4 = this.getCodeBase().getHost();
		this.method437(Static63.anInt1921 + 32);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method434() {
		if (Static59.aClass58_1 != null) {
			Static59.aClass58_1.aBoolean102 = false;
		}
		Static59.aClass58_1 = null;
		if (Static49.aClass34_3 != null) {
			Static49.aClass34_3.method1104();
			Static49.aClass34_3 = null;
		}
		Static42.method937();
		Static26.method533();
		Static59.aClass3_1 = null;
		if (Static20.aClass24_1 != null) {
			Static20.aClass24_1.method1464();
		}
		if (Static101.aClass24_2 != null) {
			Static101.aClass24_2.method1464();
		}
		Static56.method1246();
		Static87.method1624();
		try {
			if (Static39.aClass72_3 != null) {
				Static39.aClass72_3.method1934();
			}
			if (Static116.aClass72Array1 != null) {
				for (@Pc(56) int local56 = 0; local56 < Static116.aClass72Array1.length; local56++) {
					if (Static116.aClass72Array1[local56] != null) {
						Static116.aClass72Array1[local56].method1934();
					}
				}
			}
			if (Static122.aClass72_5 != null) {
				Static122.aClass72_5.method1934();
			}
			if (Static56.aClass72_4 != null) {
				Static56.aClass72_4.method1934();
			}
		} catch (@Pc(88) IOException local88) {
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	protected void method446() {
		Static22.anInt636++;
		if (Static22.anInt636 % 1000 == 0) {
			@Pc(20) GregorianCalendar local20 = new GregorianCalendar();
			Static93.anInt2398 = local20.get(11) * 600 + local20.get(12) * 10 + local20.get(13) / 6;
			Static63.aRandom1.setSeed((long) Static93.anInt2398);
		}
		this.method452();
		Static103.method1794();
		Static105.method1818();
		Static5.method159();
		Static29.method556();
		Static87.method1627();
		if (Static59.aClass3_1 != null) {
			@Pc(64) int local64 = Static59.aClass3_1.method67();
			Static121.anInt2808 = local64;
		}
		if (Static11.anInt398 == 0) {
			Static57.method1249();
			Static83.method1506();
		} else if (Static11.anInt398 == 5) {
			Static42.method944(this);
			Static57.method1249();
			Static83.method1506();
		} else if (Static11.anInt398 == 10) {
			Static42.method944(this);
		} else if (Static11.anInt398 == 20) {
			Static42.method944(this);
			Static42.method941();
		} else if (Static11.anInt398 == 25) {
			Static36.method654();
		}
		if (Static11.anInt398 == 30) {
			Static71.method1398();
		} else if (Static11.anInt398 == 40) {
			Static42.method941();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method448() {
		@Pc(13) boolean local13 = Static73.method1459();
		if (local13 && Static53.aBoolean68 && Static20.aClass24_1 != null) {
			Static20.aClass24_1.method1470();
		}
		if (Static85.aBoolean93) {
			Static75.method1446(Static104.aCanvas1);
			Static51.method1094(Static104.aCanvas1);
			if (Static59.aClass3_1 != null) {
				Static59.aClass3_1.method71(Static104.aCanvas1);
			}
			this.method433();
			Static40.method933(Static104.aCanvas1);
			Static4.method142(Static104.aCanvas1);
			if (Static59.aClass3_1 != null) {
				Static59.aClass3_1.method75(Static104.aCanvas1);
			}
		}
		if (Static11.anInt398 == 0) {
			Static36.method655(Static11.anInt397, Static109.aClass66_1462, null);
		} else if (Static11.anInt398 == 5) {
			Static68.method1377(Static77.aClass1_Sub1_Sub2_Sub2_Sub1_1, Static101.aClass1_Sub1_Sub2_Sub2_Sub1_3);
		} else if (Static11.anInt398 == 10) {
			Static68.method1377(Static77.aClass1_Sub1_Sub2_Sub2_Sub1_1, Static101.aClass1_Sub1_Sub2_Sub2_Sub1_3);
		} else if (Static11.anInt398 == 20) {
			Static68.method1377(Static77.aClass1_Sub1_Sub2_Sub2_Sub1_1, Static101.aClass1_Sub1_Sub2_Sub2_Sub1_3);
		} else if (Static11.anInt398 == 25) {
			@Pc(100) int local100;
			if (Static70.anInt708 == 1) {
				if (Static20.anInt621 < Static17.anInt563) {
					Static20.anInt621 = Static17.anInt563;
				}
				local100 = (Static20.anInt621 - Static17.anInt563) * 50 / Static20.anInt621;
				Static49.method1060(false, Static41.method897(new Class66[] { Static20.aClass66_371, Static52.aClass66_861, Static88.method1632(local100), Static3.aClass66_113 }));
			} else if (Static70.anInt708 == 2) {
				if (Static122.anInt2829 < Static39.anInt985) {
					Static122.anInt2829 = Static39.anInt985;
				}
				local100 = (Static122.anInt2829 - Static39.anInt985) * 50 / Static122.anInt2829 + 50;
				Static49.method1060(false, Static41.method897(new Class66[] { Static20.aClass66_371, Static52.aClass66_861, Static88.method1632(local100), Static3.aClass66_113 }));
			} else {
				Static49.method1060(false, Static20.aClass66_371);
			}
		} else if (Static11.anInt398 == 30) {
			Static118.method1950();
		} else if (Static11.anInt398 == 40) {
			Static49.method1060(false, Static41.method897(new Class66[] { Static27.aClass66_455, Static85.aClass66_1222, Static79.aClass66_1145 }));
		}
		@Pc(244) int local244;
		@Pc(242) Graphics local242;
		if (Static11.anInt398 == 30 && Static71.anInt2010 == 0 && !Static98.aBoolean107) {
			try {
				local242 = Static104.aCanvas1.getGraphics();
				for (local244 = 0; local244 < Static94.anInt2420; local244++) {
					if (Static5.aBooleanArray2[local244]) {
						Static3.aClass6_1.method908(local242, Static2.anIntArray16[local244], Static27.anIntArray103[local244], Static99.anIntArray180[local244], Static13.anIntArray76[local244]);
						Static5.aBooleanArray2[local244] = false;
					}
				}
			} catch (@Pc(280) Exception local280) {
				Static104.aCanvas1.repaint();
			}
		} else if (Static11.anInt398 > 0) {
			try {
				local242 = Static104.aCanvas1.getGraphics();
				Static3.aClass6_1.method906(local242);
				Static98.aBoolean107 = false;
				for (local244 = 0; local244 < Static94.anInt2420; local244++) {
					Static5.aBooleanArray2[local244] = false;
				}
			} catch (@Pc(310) Exception local310) {
				Static104.aCanvas1.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method450(@OriginalArg(1) int arg0) {
		Static100.aClass34_6 = null;
		if (Static88.anInt2320 == Static124.anInt2864) {
			Static88.anInt2320 = Static6.anInt318;
		} else {
			Static88.anInt2320 = Static124.anInt2864;
		}
		Static28.aClass32_4 = null;
		Static124.anInt2853 = 0;
		Static129.anInt2911++;
		if (Static129.anInt2911 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static11.anInt398 <= 5) {
				this.method445("js5connect_full");
				Static11.anInt398 = 1000;
			} else {
				Static49.anInt1509 = 3000;
			}
		} else if (Static129.anInt2911 >= 2 && arg0 == 6) {
			this.method445("js5connect_outofdate");
			Static11.anInt398 = 1000;
		} else if (Static129.anInt2911 >= 4) {
			if (Static11.anInt398 > 5) {
				Static49.anInt1509 = 3000;
			} else {
				this.method445("js5connect");
				Static11.anInt398 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method438() {
		Static17.method449();
		Static105.method1842();
		Static66.method439();
		Static70.method541();
		Static99.method904();
		Static93.method1711();
		Static67.method1171();
		Static52.method1101();
		Static4.method140();
		Static116.method1933();
		Static29.method557();
		Static41.method898();
		Static53.method1233();
		Static10.method305();
		Static18.method460();
		Static43.method957();
		Static42.method940();
		Static98.method1757();
		Static104.method1800();
		Static34.method66();
		Static49.method1061();
		Static73.method1462();
		Static16.method412();
		Static57.method1252();
		Static111.method1877();
		Static40.method934();
		Static12.method385();
		Static47.method1043();
		Static119.method1960();
		Static15.method2052();
		Static51.method1089();
		Static123.method1996();
		Static97.method1743();
		Static62.method1347();
		Static113.method1922();
		Static106.method1848();
		Static125.method2014();
		Static68.method1381();
		Static96.method1735();
		Static117.method1943();
		Static76.method1453();
		Static131.method1896();
		Static28.method554();
		Static60.method1296();
		Static132.method2046();
		Static79.method1481();
		Static107.method1853();
		Static44.method965();
		Static122.method1992();
		Static88.method1631();
		Static55.method1242();
		Static54.method1235();
		Static33.method628();
		Static56.method1243();
		Static108.method109();
		Static39.method815();
		Static83.method1512();
		Static120.method1967();
		Static133.method2048();
		Static3.method77();
		Static19.method484();
		Static25.method530();
		Static82.method1503();
		Static61.method1305();
		Static36.method657();
		Static59.method1281();
		Static128.method2034();
		Static71.method1399();
		Static115.method1666();
		Static38.method2006();
		Static91.method1684();
		Static65.method1370();
		Static37.method663();
		Static84.method1527();
		Static14.method409();
		Static24.method527();
		Static121.method1990();
		Static95.method1729();
		Static102.method1789();
		Static75.method1448();
		Static50.method1083();
		Static86.method1608();
		Static89.method1648();
		Static124.method2007();
		Static58.method1276();
		Static8.method300();
		Static74.method1421();
		Static110.method786();
		Static92.method1701();
		Static21.method505();
		Static103.method1796();
		Static22.method507();
		Static26.method534();
		Static9.method301();
		Static134.method2055();
		Static63.method1353();
		Static85.method1543();
		Static100.method1764();
		Static77.method1477();
		Static13.method400();
		Static112.method1884();
		Static129.method2036();
		Static64.method1359();
		Static23.method524();
		Static5.method163();
		Static87.method1625();
		Static1.method44();
		Static32.method623();
		Static11.method360();
		Static127.method2024();
		Static48.method1053();
		Static101.method1768();
		Static27.method545();
		Static6.method274();
		Static90.method1293();
		Static20.method497();
		Static130.method2043();
		Static35.method631();
		Static109.method1857();
		Static31.method606();
		Static46.method1028();
		Static114.method1923();
		Static78.method1478();
		Static118.method1955();
		Static81.method1500();
		Static30.method563();
		Static94.method1714();
		Static2.method50();
		Static126.method2019();
		Static69.method1391();
		Static72.method1407();
		Static45.method1020();
		Static80.method1489();
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method452() {
		if (Static11.anInt398 != 1000) {
			@Pc(16) boolean local16 = Static28.method551();
			if (!local16) {
				this.method453();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	private void method453() {
		if (Static77.anInt2147 >= 4) {
			this.method445("js5crc");
			Static11.anInt398 = 1000;
			return;
		}
		if (Static20.anInt618 >= 4) {
			if (Static11.anInt398 <= 5) {
				this.method445("js5io");
				Static11.anInt398 = 1000;
				return;
			}
			Static20.anInt618 = 3;
			Static49.anInt1509 = 3000;
		}
		if (Static49.anInt1509-- > 0) {
			return;
		}
		try {
			if (Static124.anInt2853 == 0) {
				Static28.aClass32_4 = Static120.aClass7_4.method281(Static88.anInt2320, Static98.aString4);
				Static124.anInt2853++;
			}
			if (Static124.anInt2853 == 1) {
				if (Static28.aClass32_4.anInt1494 == 2) {
					this.method450(-1);
					return;
				}
				if (Static28.aClass32_4.anInt1494 == 1) {
					Static124.anInt2853++;
				}
			}
			if (Static124.anInt2853 == 2) {
				Static100.aClass34_6 = new Class34((Socket) Static28.aClass32_4.anObject4, Static120.aClass7_4);
				@Pc(97) Class1_Sub12 local97 = new Class1_Sub12(5);
				local97.method1197(15);
				local97.method1193(470);
				Static100.aClass34_6.method1098(local97.aByteArray12, 5);
				Static124.anInt2853++;
				Static97.aLong104 = Static54.method1236();
			}
			if (Static124.anInt2853 == 3) {
				if (Static11.anInt398 <= 5 || Static100.aClass34_6.method1103() > 0) {
					@Pc(150) int local150 = Static100.aClass34_6.method1100();
					if (local150 != 0) {
						this.method450(local150);
						return;
					}
					Static124.anInt2853++;
				} else if (Static54.method1236() - Static97.aLong104 > 30000L) {
					this.method450(-2);
					return;
				}
			}
			if (Static124.anInt2853 == 4) {
				Static96.method1736(Static11.anInt398 > 20, Static100.aClass34_6);
				Static124.anInt2853 = 0;
				Static28.aClass32_4 = null;
				Static129.anInt2911 = 0;
				Static100.aClass34_6 = null;
			}
		} catch (@Pc(189) IOException local189) {
			this.method450(-3);
		}
	}
}
