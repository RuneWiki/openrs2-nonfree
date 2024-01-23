import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.GregorianCalendar;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length < 7 || arg0.length > 8) {
				Static216.method3528();
			}
			Static170.anInt3689 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static88.anInt1920 = 0;
			} else if (arg0[1].equals("office")) {
				Static88.anInt1920 = 1;
			} else if (arg0[1].equals("local")) {
				Static88.anInt1920 = 2;
			} else {
				Static216.method3528();
			}
			if (arg0[2].equals("live")) {
				Static189.anInt4176 = 0;
			} else if (arg0[2].equals("rc")) {
				Static189.anInt4176 = 1;
			} else if (arg0[2].equals("wip")) {
				Static189.anInt4176 = 2;
			} else {
				Static216.method3528();
			}
			if (arg0[4].equals("free")) {
				Static209.aBoolean396 = false;
			} else if (arg0[4].equals("members")) {
				Static209.aBoolean396 = true;
			} else {
				Static216.method3528();
			}
			if (arg0[5].equals("english")) {
				Static141.anInt3124 = 0;
			} else if (arg0[5].equals("german")) {
				Static91.method1536();
				Static141.anInt3124 = 1;
			} else {
				Static216.method3528();
			}
			if (arg0[6].equals("game0")) {
				Static46.anInt1029 = 0;
			} else if (arg0[6].equals("game1")) {
				Static46.anInt1029 = 1;
			} else {
				Static216.method3528();
			}
			if (arg0.length != 8) {
				Static180.aBoolean445 = false;
			} else if (arg0[7].equals("safemode")) {
				Static180.aBoolean445 = true;
			} else {
				Static216.method3528();
			}
			Static30.aClass107_204 = Static63.aClass107_427;
			Static91.aString10 = "127.0.0.1";
			Static156.anInt3410 = 0;
			@Pc(184) client local184 = new client();
			local184.method660("runescape", Static189.anInt4176 + 32);
			Static125.aFrame2.setLocation(40, 40);
		} catch (@Pc(201) Exception local201) {
			Static81.method1384(local201, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method655()) {
			return;
		}
		Static170.anInt3689 = Integer.parseInt(this.getParameter("worldid"));
		Static189.anInt4176 = Integer.parseInt(this.getParameter("modewhat"));
		Static88.anInt1920 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("safemode");
		if (local29 != null && local29.equals("1")) {
			Static180.aBoolean445 = true;
		} else {
			Static180.aBoolean445 = false;
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static209.aBoolean396 = true;
		} else {
			Static209.aBoolean396 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static91.method1536();
			Static141.anInt3124 = 1;
		}
		@Pc(75) String local75 = this.getParameter("game");
		if (local75 != null && local75.equals("1")) {
			Static46.anInt1029 = 1;
		} else {
			Static46.anInt1029 = 0;
		}
		try {
			Static100.anInt2169 = Integer.parseInt(this.getParameter("js"));
			Static96.anInt2096 = Integer.parseInt(this.getParameter("plug"));
			Static156.anInt3410 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(104) Exception local104) {
		}
		Static30.aClass107_204 = Static203.aClass107_90.method3083(this);
		if (Static30.aClass107_204 == null) {
			Static30.aClass107_204 = Static63.aClass107_427;
		}
		@Pc(117) String local117 = this.getParameter("advert");
		if (local117 != null) {
			@Pc(123) byte[] local123;
			try {
				local123 = local117.getBytes("ISO-8859-1");
			} catch (@Pc(125) UnsupportedEncodingException local125) {
				local123 = local117.getBytes();
			}
			@Pc(135) Class107 local135 = Static140.method661(0, local123.length, local123);
			@Pc(139) boolean local139 = Static109.method1901(local135);
			if (local139) {
				Static220.aClass107_1300 = local135;
			}
		}
		Static91.aString10 = this.getCodeBase().getHost();
		this.method663(Static189.anInt4176 + 32);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method662() {
		if (Static178.anInt3884 == 1000) {
			return;
		}
		Static128.anInt2802++;
		if (Static128.anInt2802 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static94.anInt2035 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static170.aRandom1.setSeed((long) Static94.anInt2035);
		}
		this.method679();
		Static47.method927();
		Static8.method252();
		Static30.method587();
		Static118.method2045();
		Static15.method342();
		if (Static98.aClass67_1 != null) {
			@Pc(79) int local79 = Static98.aClass67_1.method1968();
			Static178.anInt3882 = local79;
		}
		if (Static178.anInt3884 == 0) {
			this.method672();
			Static29.method582();
		} else if (Static178.anInt3884 == 5) {
			this.method672();
			Static29.method582();
		} else if (Static178.anInt3884 == 25 || Static178.anInt3884 == 28) {
			Static212.method3410();
		}
		if (Static178.anInt3884 == 10) {
			this.method678();
			Static224.method3667();
			Static213.method3440();
		} else if (Static178.anInt3884 == 30) {
			Static219.method3594();
			return;
		} else if (Static178.anInt3884 == 40) {
			Static213.method3440();
			if (Static207.anInt4429 != -3) {
				if (Static207.anInt4429 == 15) {
					Static75.method1335();
					return;
				}
				if (Static207.anInt4429 != 2) {
					Static85.method1436();
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method667() {
		if (browsercontrol.method2357()) {
			browsercontrol.method2361();
		}
		if (Static117.aClass34_2 != null) {
			Static117.aClass34_2.method1059(this.getClass());
		}
		if (Static35.aClass121_1 != null) {
			Static35.aClass121_1.aBoolean430 = false;
		}
		Static35.aClass121_1 = null;
		if (Static167.aClass82_3 != null) {
			Static167.aClass82_3.method2395();
			Static167.aClass82_3 = null;
		}
		Static60.method1161(Static203.aCanvas3);
		Static97.method1639(Static203.aCanvas3);
		if (Static98.aClass67_1 != null) {
			Static98.aClass67_1.method1970(Static203.aCanvas3);
		}
		Static49.method1015();
		Static173.method2750();
		Static98.aClass67_1 = null;
		if (Static186.aClass62_2 != null) {
			Static186.aClass62_2.method2422();
		}
		if (Static100.aClass62_1 != null) {
			Static100.aClass62_1.method2422();
		}
		Static143.method2371();
		Static32.method605();
		try {
			if (Static161.aClass13_5 != null) {
				Static161.aClass13_5.method352();
			}
			if (Static159.aClass13Array1 != null) {
				for (@Pc(81) int local81 = 0; local81 < Static159.aClass13Array1.length; local81++) {
					if (Static159.aClass13Array1[local81] != null) {
						Static159.aClass13Array1[local81].method352();
					}
				}
			}
			if (Static19.aClass13_1 != null) {
				Static19.aClass13_1.method352();
			}
			if (Static151.aClass13_4 != null) {
				Static151.aClass13_4.method352();
			}
		} catch (@Pc(113) IOException local113) {
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method672() {
		@Pc(21) int local21;
		if (Static221.anInt4832 == 0) {
			@Pc(12) Runtime local12 = Runtime.getRuntime();
			local21 = (int) ((local12.totalMemory() - local12.freeMemory()) / 1024L);
			@Pc(24) long local24 = Static209.method3309();
			if (Static60.aLong45 == 0L) {
				Static60.aLong45 = local24;
			}
			if (local21 > 16384 && local24 - Static60.aLong45 < 5000L) {
				if (local24 - Static88.aLong70 > 1000L) {
					System.gc();
					Static88.aLong70 = local24;
				}
				Static70.anInt1592 = 5;
				Static196.aClass107_1124 = Static169.aClass107_999;
			} else {
				Static196.aClass107_1124 = Static72.aClass107_474;
				Static221.anInt4832 = 10;
				Static70.anInt1592 = 5;
			}
			return;
		}
		@Pc(78) int local78;
		if (Static221.anInt4832 == 10) {
			Static163.method2615();
			for (local78 = 0; local78 < 4; local78++) {
				Static107.aClass60Array1[local78] = new Class60(104, 104);
			}
			Static221.anInt4832 = 30;
			Static196.aClass107_1124 = Static75.aClass107_492;
			Static70.anInt1592 = 10;
		} else if (Static221.anInt4832 == 30) {
			Static55.aClass28_Sub1_33 = Static122.method2084(true, true, 0, false);
			Static126.aClass28_Sub1_73 = Static122.method2084(true, true, 1, false);
			Static104.aClass28_Sub1_86 = Static122.method2084(false, true, 2, true);
			Static165.aClass28_Sub1_64 = Static122.method2084(true, true, 3, false);
			Static156.aClass28_Sub1_90 = Static122.method2084(true, true, 4, false);
			Static42.aClass28_Sub1_24 = Static122.method2084(true, true, 5, true);
			Static80.aClass28_Sub1_47 = Static122.method2084(true, false, 6, true);
			Static15.aClass28_Sub1_14 = Static122.method2084(true, true, 7, false);
			Static169.aClass28_Sub1_97 = Static122.method2084(true, true, 8, false);
			Static63.aClass28_Sub1_37 = Static122.method2084(true, true, 9, false);
			Static141.aClass28_Sub1_85 = Static122.method2084(true, true, 10, false);
			Static195.aClass28_Sub1_111 = Static122.method2084(true, true, 11, false);
			Static65.aClass28_Sub1_38 = Static122.method2084(true, true, 12, false);
			Static225.aClass28_Sub1_130 = Static122.method2084(true, true, 13, false);
			Static86.aClass28_Sub1_51 = Static122.method2084(true, false, 14, false);
			Static199.aClass28_Sub1_112 = Static122.method2084(true, true, 15, false);
			Static80.aClass28_Sub1_46 = Static122.method2084(true, true, 16, false);
			Static174.aClass28_Sub1_102 = Static122.method2084(true, true, 17, false);
			Static44.aClass28_Sub1_25 = Static122.method2084(true, true, 18, false);
			Static204.aClass28_Sub1_68 = Static122.method2084(true, true, 19, false);
			Static17.aClass28_Sub1_15 = Static122.method2084(true, true, 20, false);
			Static92.aClass28_Sub1_54 = Static122.method2084(true, true, 21, false);
			Static1.aClass28_Sub1_4 = Static122.method2084(true, true, 22, false);
			Static217.aClass28_Sub1_126 = Static122.method2084(true, true, 23, true);
			Static180.aClass28_Sub1_133 = Static122.method2084(true, true, 24, false);
			Static211.aClass28_Sub1_120 = Static122.method2084(true, true, 25, false);
			Static7.aClass28_Sub1_10 = Static122.method2084(true, true, 26, true);
			Static70.anInt1592 = 15;
			Static221.anInt4832 = 40;
			Static196.aClass107_1124 = Static161.aClass107_941;
		} else if (Static221.anInt4832 == 40) {
			local78 = Static55.aClass28_Sub1_33.method852() * 4 / 100;
			local78 += Static126.aClass28_Sub1_73.method852() * 4 / 100;
			local78 += Static104.aClass28_Sub1_86.method852() / 100;
			local78 += Static165.aClass28_Sub1_64.method852() * 2 / 100;
			local78 += Static156.aClass28_Sub1_90.method852() * 6 / 100;
			local78 += Static42.aClass28_Sub1_24.method852() * 4 / 100;
			local78 += Static80.aClass28_Sub1_47.method852() * 2 / 100;
			local78 += Static15.aClass28_Sub1_14.method852() * 50 / 100;
			local78 += Static169.aClass28_Sub1_97.method852() * 2 / 100;
			local78 += Static63.aClass28_Sub1_37.method852() * 2 / 100;
			local78 += Static141.aClass28_Sub1_85.method852() * 2 / 100;
			local78 += Static195.aClass28_Sub1_111.method852() * 2 / 100;
			local78 += Static65.aClass28_Sub1_38.method852() * 2 / 100;
			local78 += Static225.aClass28_Sub1_130.method852() * 2 / 100;
			local78 += Static86.aClass28_Sub1_51.method852() * 2 / 100;
			local78 += Static199.aClass28_Sub1_112.method852() * 2 / 100;
			local78 += Static80.aClass28_Sub1_46.method852() / 100;
			local78 += Static174.aClass28_Sub1_102.method852() / 100;
			local78 += Static44.aClass28_Sub1_25.method852() / 100;
			local78 += Static204.aClass28_Sub1_68.method852() / 100;
			local78 += Static17.aClass28_Sub1_15.method852() / 100;
			local78 += Static92.aClass28_Sub1_54.method852() / 100;
			local78 += Static1.aClass28_Sub1_4.method852() / 100;
			local78 += Static217.aClass28_Sub1_126.method852() / 100;
			local78 += Static180.aClass28_Sub1_133.method852() / 100;
			local78 += Static211.aClass28_Sub1_120.method852() / 100;
			local78 += Static7.aClass28_Sub1_10.method852() / 100;
			if (local78 == 100) {
				Static196.aClass107_1124 = Static141.aClass107_845;
				Static70.anInt1592 = 20;
				Static200.method2575(Static169.aClass28_Sub1_97);
				Static158.method2566(Static169.aClass28_Sub1_97);
				Static113.method1960(Static169.aClass28_Sub1_97);
				Static69.method1241(Static169.aClass28_Sub1_97);
				Static221.anInt4832 = 45;
			} else {
				if (local78 != 0) {
					Static196.aClass107_1124 = Static149.method2437(new Class107[] { Static58.aClass107_400, Static115.method2001(local78), Static7.aClass107_105 });
				}
				Static70.anInt1592 = 20;
			}
		} else if (Static221.anInt4832 == 45) {
			Static88.method1503(Static73.aBoolean151);
			Static128.aClass1_Sub6_Sub2_1 = new Class1_Sub6_Sub2();
			Static128.aClass1_Sub6_Sub2_1.method1443();
			Static186.aClass62_2 = Static228.method3718(Static117.aClass34_2, 22050, 0, Static203.aCanvas3);
			Static186.aClass62_2.method2411(Static128.aClass1_Sub6_Sub2_1);
			Static213.method3439(Static199.aClass28_Sub1_112, Static86.aClass28_Sub1_51, Static156.aClass28_Sub1_90, Static128.aClass1_Sub6_Sub2_1);
			Static100.aClass62_1 = Static228.method3718(Static117.aClass34_2, 2048, 1, Static203.aCanvas3);
			Static42.aClass1_Sub6_Sub1_1 = new Class1_Sub6_Sub1();
			Static100.aClass62_1.method2411(Static42.aClass1_Sub6_Sub1_1);
			Static218.aClass108_1 = new Class108(22050, Static14.anInt334);
			Static121.anInt2658 = Static80.aClass28_Sub1_47.method837(Static139.aClass107_838);
			Static221.anInt4832 = 50;
			Static70.anInt1592 = 30;
			Static196.aClass107_1124 = Static203.aClass107_91;
		} else if (Static221.anInt4832 == 50) {
			local78 = Static72.method1288(Static225.aClass28_Sub1_130, Static169.aClass28_Sub1_97);
			local21 = Static92.method1549();
			if (local21 > local78) {
				Static196.aClass107_1124 = Static149.method2437(new Class107[] { Static125.aClass107_736, Static115.method2001(local78 * 100 / local21), Static7.aClass107_105 });
				Static70.anInt1592 = 35;
			} else {
				Static221.anInt4832 = 60;
				Static70.anInt1592 = 35;
				Static196.aClass107_1124 = Static150.aClass107_877;
			}
		} else if (Static221.anInt4832 == 60) {
			local78 = Static138.method2313(Static169.aClass28_Sub1_97);
			local21 = Static20.method1730();
			if (local21 > local78) {
				Static196.aClass107_1124 = Static149.method2437(new Class107[] { Static39.aClass107_273, Static115.method2001(local78 * 100 / local21), Static7.aClass107_105 });
				Static70.anInt1592 = 40;
			} else {
				Static70.anInt1592 = 40;
				Static221.anInt4832 = 65;
				Static196.aClass107_1124 = Static42.aClass107_289;
			}
		} else if (Static221.anInt4832 == 65) {
			Static24.method425(Static225.aClass28_Sub1_130, Static169.aClass28_Sub1_97);
			Static70.anInt1592 = 45;
			Static196.aClass107_1124 = Static109.aClass107_651;
			Static52.method1046(5);
			Static221.anInt4832 = 70;
		} else if (Static221.anInt4832 == 70) {
			Static104.aClass28_Sub1_86.method839();
			local78 = Static104.aClass28_Sub1_86.method823();
			Static80.aClass28_Sub1_46.method839();
			local78 += Static80.aClass28_Sub1_46.method823();
			Static174.aClass28_Sub1_102.method839();
			local78 += Static174.aClass28_Sub1_102.method823();
			Static44.aClass28_Sub1_25.method839();
			local78 += Static44.aClass28_Sub1_25.method823();
			Static204.aClass28_Sub1_68.method839();
			local78 += Static204.aClass28_Sub1_68.method823();
			Static17.aClass28_Sub1_15.method839();
			local78 += Static17.aClass28_Sub1_15.method823();
			Static92.aClass28_Sub1_54.method839();
			local78 += Static92.aClass28_Sub1_54.method823();
			Static1.aClass28_Sub1_4.method839();
			local78 += Static1.aClass28_Sub1_4.method823();
			Static180.aClass28_Sub1_133.method839();
			local78 += Static180.aClass28_Sub1_133.method823();
			Static211.aClass28_Sub1_120.method839();
			local78 += Static211.aClass28_Sub1_120.method823();
			if (local78 < 1000) {
				Static196.aClass107_1124 = Static149.method2437(new Class107[] { Static27.aClass107_181, Static115.method2001(local78 / 10), Static7.aClass107_105 });
				Static70.anInt1592 = 50;
			} else {
				Static214.method3468(Static104.aClass28_Sub1_86);
				Static215.method3503(Static104.aClass28_Sub1_86);
				Static25.method457(Static104.aClass28_Sub1_86);
				Static209.method3308(Static104.aClass28_Sub1_86, Static15.aClass28_Sub1_14);
				Static39.method746(Static15.aClass28_Sub1_14, Static209.aBoolean396, Static80.aClass28_Sub1_46);
				Static217.method3557(Static15.aClass28_Sub1_14, Static44.aClass28_Sub1_25);
				Static153.method2511(Static209.aBoolean396, Static174.aClass1_Sub2_Sub15_Sub1_4, Static204.aClass28_Sub1_68, Static15.aClass28_Sub1_14);
				Static94.method1585(Static104.aClass28_Sub1_86);
				Static196.method3175(Static17.aClass28_Sub1_15, Static55.aClass28_Sub1_33, Static126.aClass28_Sub1_73);
				Static115.method2003(Static92.aClass28_Sub1_54, Static15.aClass28_Sub1_14);
				Static91.method1532(Static1.aClass28_Sub1_4);
				Static115.method2002(Static104.aClass28_Sub1_86);
				Static8.method254(Static165.aClass28_Sub1_64, Static225.aClass28_Sub1_130, Static15.aClass28_Sub1_14, Static169.aClass28_Sub1_97);
				Static30.method586(Static104.aClass28_Sub1_86);
				Static193.method3150(Static174.aClass28_Sub1_102);
				Static15.method343(Static211.aClass28_Sub1_120, new Class76(), Static180.aClass28_Sub1_133);
				Static76.method1345(Static211.aClass28_Sub1_120, Static180.aClass28_Sub1_133);
				Static70.anInt1592 = 50;
				Static196.aClass107_1124 = Static104.aClass107_855;
				Static131.method2192();
				Static221.anInt4832 = 80;
			}
		} else if (Static221.anInt4832 == 80) {
			local78 = Static3.method2857(Static169.aClass28_Sub1_97);
			local21 = Static73.method1312();
			if (local21 > local78) {
				Static196.aClass107_1124 = Static149.method2437(new Class107[] { Static143.aClass107_851, Static115.method2001(local78 * 100 / local21), Static7.aClass107_105 });
				Static70.anInt1592 = 60;
			} else {
				Static120.method2069(Static169.aClass28_Sub1_97);
				Static221.anInt4832 = 90;
				Static196.aClass107_1124 = Static76.aClass107_496;
				Static70.anInt1592 = 60;
			}
		} else if (Static221.anInt4832 == 90) {
			if (Static7.aClass28_Sub1_10.method839()) {
				@Pc(1132) Class59 local1132 = new Class59(Static63.aClass28_Sub1_37, Static7.aClass28_Sub1_10, Static169.aClass28_Sub1_97, 20, !Static142.aBoolean266);
				Static74.method1324(local1132);
				if (Static27.anInt523 == 1) {
					Static74.method1322(0.9F);
				}
				if (Static27.anInt523 == 2) {
					Static74.method1322(0.8F);
				}
				if (Static27.anInt523 == 3) {
					Static74.method1322(0.7F);
				}
				if (Static27.anInt523 == 4) {
					Static74.method1322(0.6F);
				}
				Static196.aClass107_1124 = Static202.aClass107_1159;
				Static221.anInt4832 = 100;
				Static70.anInt1592 = 70;
			} else {
				Static196.aClass107_1124 = Static149.method2437(new Class107[] { Static52.aClass107_367, Static115.method2001(Static7.aClass28_Sub1_10.method823()), Static7.aClass107_105 });
				Static70.anInt1592 = 70;
			}
		} else if (Static221.anInt4832 == 100) {
			if (Static214.method3467(Static169.aClass28_Sub1_97)) {
				Static221.anInt4832 = 110;
			}
		} else if (Static221.anInt4832 == 110) {
			Static35.aClass121_1 = new Class121();
			Static117.aClass34_2.method1068(10, Static35.aClass121_1);
			Static70.anInt1592 = 75;
			Static221.anInt4832 = 120;
			Static196.aClass107_1124 = Static35.aClass107_251;
		} else if (Static221.anInt4832 == 120) {
			if (Static141.aClass28_Sub1_85.method827(Static26.aClass107_176, Static63.aClass107_427)) {
				@Pc(1232) Class17 local1232 = new Class17(Static141.aClass28_Sub1_85.method818(Static26.aClass107_176, Static63.aClass107_427));
				Static40.method773(local1232);
				Static70.anInt1592 = 80;
				Static221.anInt4832 = 130;
				Static196.aClass107_1124 = Static109.aClass107_652;
			} else {
				Static196.aClass107_1124 = Static149.method2437(new Class107[] { Static70.aClass107_453, Static57.aClass107_1339 });
				Static70.anInt1592 = 80;
			}
		} else if (Static221.anInt4832 == 130) {
			if (!Static165.aClass28_Sub1_64.method839()) {
				Static196.aClass107_1124 = Static149.method2437(new Class107[] { Static217.aClass107_1280, Static115.method2001(Static165.aClass28_Sub1_64.method823() * 3 / 4), Static7.aClass107_105 });
				Static70.anInt1592 = 85;
			} else if (!Static65.aClass28_Sub1_38.method839()) {
				Static196.aClass107_1124 = Static149.method2437(new Class107[] { Static217.aClass107_1280, Static115.method2001(Static65.aClass28_Sub1_38.method823() / 10 + 75), Static7.aClass107_105 });
				Static70.anInt1592 = 85;
			} else if (!Static225.aClass28_Sub1_130.method839()) {
				Static196.aClass107_1124 = Static149.method2437(new Class107[] { Static217.aClass107_1280, Static115.method2001(Static225.aClass28_Sub1_130.method823() / 20 + 85), Static7.aClass107_105 });
				Static70.anInt1592 = 85;
			} else if (Static217.aClass28_Sub1_126.method817(Static72.aClass107_476)) {
				Static210.method3379(Static63.aClass64_Sub1Array4, Static217.aClass28_Sub1_126, Static213.aClass64_Sub1Array10, Static201.aClass64_Sub1Array9, Static61.aClass1_Sub2_Sub2_Sub1Array1, Static37.aClass64_Sub1Array1);
				Static196.aClass107_1124 = Static47.aClass107_313;
				Static70.anInt1592 = 100;
				Static221.anInt4832 = 140;
			} else {
				Static196.aClass107_1124 = Static149.method2437(new Class107[] { Static217.aClass107_1280, Static115.method2001(Static217.aClass28_Sub1_126.method843(Static72.aClass107_476) / 10 + 90), Static7.aClass107_105 });
				Static70.anInt1592 = 85;
			}
		} else if (Static221.anInt4832 == 140) {
			Static146.anInt3163 = Static165.aClass28_Sub1_64.method837(Static107.aClass107_632);
			Static42.aClass28_Sub1_24.method842(false);
			Static80.aClass28_Sub1_47.method842(true);
			Static169.aClass28_Sub1_97.method842(true);
			Static225.aClass28_Sub1_130.method842(true);
			Static141.aClass28_Sub1_85.method842(true);
			Static165.aClass28_Sub1_64.method842(true);
			Static35.aBoolean70 = true;
			Static85.method1436();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method654() {
		if (Static178.anInt3884 == 1000) {
			return;
		}
		@Pc(13) boolean local13 = false;
		@Pc(16) boolean local16 = Static61.method1169();
		if (local16 && Static179.aBoolean356 && Static186.aClass62_2 != null) {
			Static186.aClass62_2.method2414();
		}
		if (Static178.anInt3884 == 30 || Static178.anInt3884 == 10) {
			if (Static91.aBoolean180) {
				Static157.method2536();
			} else if (Static105.aLong92 != 0L && Static105.aLong92 < Static209.method3309()) {
				Static157.method2536();
			}
		}
		if (Static204.aLong99 != 0L && Static209.method3309() > Static204.aLong99 && Static167.aClass82_3 != null && (Static178.anInt3884 == 30 || Static178.anInt3884 == 25)) {
			Static98.method1669();
		}
		if (Static129.aBoolean235) {
			local13 = true;
			Static129.aBoolean235 = false;
		}
		if (local13) {
			Static130.method2171();
		}
		if (Static178.anInt3884 == 0) {
			Static199.method3192(Static196.aClass107_1124, Static70.anInt1592, local13, null);
		} else if (Static178.anInt3884 == 5) {
			Static202.method3236(Static175.aClass1_Sub2_Sub15_3);
		} else if (Static178.anInt3884 == 10) {
			Static30.method585();
		} else if (Static178.anInt3884 == 25 || Static178.anInt3884 == 28) {
			@Pc(132) int local132;
			if (Static151.anInt3334 == 1) {
				if (Static49.anInt1284 < Static58.anInt1425) {
					Static49.anInt1284 = Static58.anInt1425;
				}
				local132 = (Static49.anInt1284 - Static58.anInt1425) * 50 / Static49.anInt1284;
				Static172.method2741(false, Static149.method2437(new Class107[] { Static26.aClass107_179, Static166.aClass107_1145, Static115.method2001(local132), Static188.aClass107_1100 }));
			} else if (Static151.anInt3334 == 2) {
				if (Static149.anInt3262 < Static65.anInt1532) {
					Static149.anInt3262 = Static65.anInt1532;
				}
				local132 = (Static149.anInt3262 - Static65.anInt1532) * 50 / Static149.anInt3262 + 50;
				Static172.method2741(false, Static149.method2437(new Class107[] { Static26.aClass107_179, Static166.aClass107_1145, Static115.method2001(local132), Static188.aClass107_1100 }));
			} else {
				Static172.method2741(false, Static26.aClass107_179);
			}
		} else if (Static178.anInt3884 == 30) {
			Static102.method1720();
		} else if (Static178.anInt3884 == 40) {
			Static172.method2741(false, Static149.method2437(new Class107[] { Static36.aClass107_253, Static56.aClass107_396, Static125.aClass107_731 }));
		}
		@Pc(293) int local293;
		@Pc(291) Graphics local291;
		if ((Static178.anInt3884 == 30 || Static178.anInt3884 == 10) && Static163.anInt3554 == 0 && !local13) {
			try {
				local291 = Static203.aCanvas3.getGraphics();
				for (local293 = 0; local293 < Static14.anInt333; local293++) {
					if (Static175.aBooleanArray24[local293]) {
						Static42.aClass23_1.method2200(Static204.anIntArray232[local293], Static170.anIntArray328[local293], local291, Static189.anIntArray347[local293], Static25.anIntArray45[local293]);
						Static175.aBooleanArray24[local293] = false;
					}
				}
			} catch (@Pc(329) Exception local329) {
				Static203.aCanvas3.repaint();
			}
		} else if (Static178.anInt3884 != 0) {
			try {
				local291 = Static203.aCanvas3.getGraphics();
				Static42.aClass23_1.method2205(local291);
				for (local293 = 0; local293 < Static14.anInt333; local293++) {
					Static175.aBooleanArray24[local293] = false;
				}
			} catch (@Pc(358) Exception local358) {
				Static203.aCanvas3.repaint();
			}
		}
		if (Static35.aBoolean70) {
			Static1.method56();
		}
		if (!browsercontrol.method2357() || Static42.anInt947 == 0) {
			return;
		}
		try {
			@Pc(372) Point local372 = Static203.aCanvas3.getLocationOnScreen();
			@Pc(375) Dimension local375 = Static203.aCanvas3.getSize();
			browsercontrol.method2358(local372.x, local372.y - Static42.anInt947, local375.width, Static42.anInt947);
		} catch (@Pc(388) Exception local388) {
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method674() {
		if (Static18.anInt378 >= 4) {
			this.method656("js5crc");
			Static178.anInt3884 = 1000;
			return;
		}
		if (Static171.anInt3714 >= 4) {
			if (Static178.anInt3884 == 0 || Static178.anInt3884 == 5) {
				this.method656("js5io");
				Static178.anInt3884 = 1000;
				return;
			}
			Static171.anInt3714 = 3;
			Static10.anInt290 = 3000;
		}
		if (Static10.anInt290-- > 0) {
			return;
		}
		try {
			if (Static221.anInt4834 == 0) {
				Static79.aClass84_4 = Static117.aClass34_2.method1065(Static211.anInt4553, Static91.aString10);
				Static221.anInt4834++;
			}
			if (Static221.anInt4834 == 1) {
				if (Static79.aClass84_4.anInt3171 == 2) {
					this.method675(-1);
					return;
				}
				if (Static79.aClass84_4.anInt3171 == 1) {
					Static221.anInt4834++;
				}
			}
			if (Static221.anInt4834 == 2) {
				Static175.aClass82_4 = new Class82((Socket) Static79.aClass84_4.anObject4, Static117.aClass34_2);
				@Pc(99) Class1_Sub26 local99 = new Class1_Sub26(5);
				local99.method2967(15);
				local99.method2973(507);
				Static175.aClass82_4.method2399(5, local99.aByteArray52);
				Static221.anInt4834++;
				Static140.aLong30 = Static209.method3309();
			}
			if (Static221.anInt4834 == 3) {
				if (Static178.anInt3884 == 0 || Static178.anInt3884 == 5 || Static175.aClass82_4.method2397() > 0) {
					@Pc(156) int local156 = Static175.aClass82_4.method2394();
					if (local156 != 0) {
						this.method675(local156);
						return;
					}
					Static221.anInt4834++;
				} else if (Static209.method3309() - Static140.aLong30 > 30000L) {
					this.method675(-2);
					return;
				}
			}
			if (Static221.anInt4834 == 4) {
				@Pc(190) boolean local190 = Static178.anInt3884 == 5 || Static178.anInt3884 == 10 || Static178.anInt3884 == 28;
				Static120.method2071(!local190, Static175.aClass82_4);
				Static212.anInt4564 = 0;
				Static175.aClass82_4 = null;
				Static221.anInt4834 = 0;
				Static79.aClass84_4 = null;
			}
		} catch (@Pc(213) IOException local213) {
			this.method675(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method664() {
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method675(@OriginalArg(0) int arg0) {
		Static79.aClass84_4 = null;
		Static212.anInt4564++;
		Static175.aClass82_4 = null;
		Static221.anInt4834 = 0;
		if (Static211.anInt4553 == Static90.anInt1964) {
			Static211.anInt4553 = Static155.anInt434;
		} else {
			Static211.anInt4553 = Static90.anInt1964;
		}
		if (Static212.anInt4564 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static178.anInt3884 == 0 || Static178.anInt3884 == 5) {
				this.method656("js5connect_full");
				Static178.anInt3884 = 1000;
			} else {
				Static10.anInt290 = 3000;
			}
		} else if (Static212.anInt4564 >= 2 && arg0 == 6) {
			this.method656("js5connect_outofdate");
			Static178.anInt3884 = 1000;
		} else if (Static212.anInt4564 >= 4) {
			if (Static178.anInt3884 == 0 || Static178.anInt3884 == 5) {
				this.method656("js5connect");
				Static178.anInt3884 = 1000;
			} else {
				Static10.anInt290 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method678() {
		Static10.method302(this);
		for (Static150.anInt3332 = 0; Static90.method1530() && Static150.anInt3332 < 128; Static150.anInt3332++) {
			Static81.anIntArray178[Static150.anInt3332] = Static80.anInt1768;
			Static219.anIntArray369[Static150.anInt3332] = Static141.anInt3118;
		}
		Static204.anInt2498++;
		if (Static77.anInt1732 != -1) {
			Static105.method1797(0, 0, 0, Static158.anInt3484, 0, Static77.anInt1732, Static180.anInt4990);
		}
		Static218.anInt4760++;
		Static185.method3683();
		while (true) {
			@Pc(58) Class1_Sub22 local58;
			@Pc(63) Class86 local63;
			@Pc(74) Class86 local74;
			do {
				local58 = (Class1_Sub22) Static91.aClass120_11.method3566();
				if (local58 == null) {
					while (true) {
						do {
							local58 = (Class1_Sub22) Static70.aClass120_8.method3566();
							if (local58 == null) {
								while (true) {
									do {
										local58 = (Class1_Sub22) Static146.aClass120_17.method3566();
										if (local58 == null) {
											if (Static54.aClass86_1 != null) {
												Static221.method3627();
												return;
											}
											return;
										}
										local63 = local58.aClass86_10;
										if (local63.anInt3219 < 0) {
											break;
										}
										local74 = Static13.method333(local63.anInt3225);
									} while (local74 == null || local74.aClass86Array1 == null || local74.aClass86Array1.length <= local63.anInt3219 || local63 != local74.aClass86Array1[local63.anInt3219]);
									Static60.method1156(local58);
								}
							}
							local63 = local58.aClass86_10;
							if (local63.anInt3219 < 0) {
								break;
							}
							local74 = Static13.method333(local63.anInt3225);
						} while (local74 == null || local74.aClass86Array1 == null || local74.aClass86Array1.length <= local63.anInt3219 || local63 != local74.aClass86Array1[local63.anInt3219]);
						Static60.method1156(local58);
					}
				}
				local63 = local58.aClass86_10;
				if (local63.anInt3219 < 0) {
					break;
				}
				local74 = Static13.method333(local63.anInt3225);
			} while (local74 == null || local74.aClass86Array1 == null || local63.anInt3219 >= local74.aClass86Array1.length || local63 != local74.aClass86Array1[local63.anInt3219]);
			Static60.method1156(local58);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method679() {
		@Pc(7) boolean local7 = Static7.method241();
		if (!local7) {
			this.method674();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method670() {
		Static154.method2520(Static180.aBoolean445, Static117.aClass34_2);
		Static155.anInt434 = Static88.anInt1920 == 0 ? 443 : Static170.anInt3689 + 50000;
		Static90.anInt1964 = Static88.anInt1920 == 0 ? 43594 : Static170.anInt3689 + 40000;
		Static211.anInt4553 = Static90.anInt1964;
		Static89.aShortArray22 = Static171.aShortArray45 = Static149.aShortArray44 = Static99.aShortArray15 = new short[256];
		if (Static46.anInt1029 == 1) {
			Static62.aShortArray21 = Static194.aShortArray50;
			Static95.aShortArray28 = Static127.aShortArray41;
			Static49.aShortArrayArray3 = Static149.aShortArrayArray7;
			Static161.aShortArrayArray8 = Static94.aShortArrayArray4;
		} else {
			Static161.aShortArrayArray8 = Static51.aShortArrayArray6;
			Static95.aShortArray28 = Static130.aShortArray42;
			Static49.aShortArrayArray3 = Static129.aShortArrayArray5;
			Static62.aShortArray21 = Static148.aShortArray43;
		}
		Static158.method2567();
		Static108.method1889(Static203.aCanvas3);
		Static160.method2581(Static203.aCanvas3);
		Static98.aClass67_1 = Static115.method2005();
		if (Static98.aClass67_1 != null) {
			Static98.aClass67_1.method1969(Static203.aCanvas3);
		}
		Static177.anInt3842 = Static53.anInt1329;
		try {
			if (Static117.aClass34_2.aClass39_2 != null) {
				Static161.aClass13_5 = new Class13(Static117.aClass34_2.aClass39_2, 5200, 0);
				for (@Pc(101) int local101 = 0; local101 < 27; local101++) {
					Static159.aClass13Array1[local101] = new Class13(Static117.aClass34_2.aClass39Array1[local101], 6000, 0);
				}
				Static19.aClass13_1 = new Class13(Static117.aClass34_2.aClass39_3, 6000, 0);
				Static66.aClass73_4 = new Class73(255, Static161.aClass13_5, Static19.aClass13_1, 500000);
				Static151.aClass13_4 = new Class13(Static117.aClass34_2.aClass39_4, 24, 0);
				Static117.aClass34_2.aClass39_4 = null;
				Static117.aClass34_2.aClass39Array1 = null;
				Static117.aClass34_2.aClass39_2 = null;
				Static117.aClass34_2.aClass39_3 = null;
			}
		} catch (@Pc(157) IOException local157) {
			Static151.aClass13_4 = null;
			Static161.aClass13_5 = null;
			Static66.aClass73_4 = null;
			Static19.aClass13_1 = null;
		}
		if (Static88.anInt1920 != 0) {
			Static25.aBoolean39 = true;
		}
		Static171.aClass107_1009 = Static175.aClass107_1034;
	}
}
