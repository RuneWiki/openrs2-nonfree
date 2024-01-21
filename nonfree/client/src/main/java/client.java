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
				Static149.method3067();
			}
			Static26.anInt708 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static35.anInt2016 = 0;
			} else if (arg0[1].equals("office")) {
				Static35.anInt2016 = 1;
			} else if (arg0[1].equals("local")) {
				Static35.anInt2016 = 2;
			} else {
				Static149.method3067();
			}
			if (arg0[2].equals("live")) {
				Static4.anInt194 = 0;
			} else if (arg0[2].equals("rc")) {
				Static4.anInt194 = 1;
			} else if (arg0[2].equals("wip")) {
				Static4.anInt194 = 2;
			} else {
				Static149.method3067();
			}
			if (arg0[3].equals("lowmem")) {
				Static81.method1837();
			} else if (arg0[3].equals("highmem")) {
				Static57.method1406();
			} else {
				Static149.method3067();
			}
			if (arg0[4].equals("free")) {
				Static133.aBoolean136 = false;
			} else if (arg0[4].equals("members")) {
				Static133.aBoolean136 = true;
			} else {
				Static149.method3067();
			}
			if (arg0[5].equals("english")) {
				Static123.anInt3345 = 0;
			} else if (arg0[5].equals("german")) {
				Static120.method2455();
				Static123.anInt3345 = 1;
				Static35.aClass70_630 = Static142.aClass70_1287;
			} else {
				Static149.method3067();
			}
			if (arg0[6].equals("game0")) {
				Static82.anInt2517 = 0;
			} else if (arg0[6].equals("game1")) {
				Static82.anInt2517 = 1;
			} else {
				Static149.method3067();
			}
			Static101.aString4 = "127.0.0.1";
			@Pc(176) client local176 = new client();
			local176.method770("runescape", Static4.anInt194 + 32);
			Static131.aFrame1.setLocation(40, 40);
		} catch (@Pc(193) Exception local193) {
			Static141.method2762(local193, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method781(@OriginalArg(1) int arg0) {
		Static143.anInt3771 = 0;
		Static129.aClass43_43 = null;
		Static83.anInt4537++;
		if (Static158.anInt4152 == Static58.anInt1874) {
			Static158.anInt4152 = Static3.anInt172;
		} else {
			Static158.anInt4152 = Static58.anInt1874;
		}
		Static176.aClass18_8 = null;
		if (Static83.anInt4537 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static15.anInt445 > 5) {
				Static40.anInt1391 = 3000;
			} else {
				this.method764("js5connect_full");
				Static15.anInt445 = 1000;
			}
		} else if (Static83.anInt4537 >= 2 && arg0 == 6) {
			this.method764("js5connect_outofdate");
			Static15.anInt445 = 1000;
		} else if (Static83.anInt4537 >= 4) {
			if (Static15.anInt445 > 5) {
				Static40.anInt1391 = 3000;
			} else {
				this.method764("js5connect");
				Static15.anInt445 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method772() {
		Static47.anInt1654++;
		if (Static47.anInt1654 % 1000 == 1) {
			@Pc(25) GregorianCalendar local25 = new GregorianCalendar();
			Static67.anInt2094 = local25.get(11) * 600 + local25.get(12) * 10 + local25.get(13) / 6;
			Static49.aRandom1.setSeed((long) Static67.anInt2094);
		}
		this.method784();
		Static166.method3302();
		Static44.method1101();
		Static30.method785();
		Static98.method2112();
		Static146.method2861();
		if (Static107.aClass36_1 != null) {
			@Pc(67) int local67 = Static107.aClass36_1.method1611();
			Static78.anInt2425 = local67;
		}
		if (Static15.anInt445 == 0) {
			Static6.method238();
			Static94.method2039();
		} else if (Static15.anInt445 == 5) {
			Static80.method1819(this);
			Static6.method238();
			Static94.method2039();
		} else if (Static15.anInt445 == 10) {
			Static80.method1819(this);
		} else if (Static15.anInt445 == 20) {
			Static80.method1819(this);
			Static129.method3396();
		} else if (Static15.anInt445 == 25) {
			Static135.method2648();
		}
		if (Static15.anInt445 == 30) {
			Static124.method2526();
		} else if (Static15.anInt445 == 40) {
			Static129.method3396();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method784() {
		if (Static15.anInt445 != 1000) {
			@Pc(20) boolean local20 = Static58.method1420();
			if (!local20) {
				this.method787();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method767() {
		if (Static67.aClass38_1 != null) {
			Static67.aClass38_1.aBoolean76 = false;
		}
		Static67.aClass38_1 = null;
		if (Static85.aClass43_22 != null) {
			Static85.aClass43_22.method2042();
			Static85.aClass43_22 = null;
		}
		Static181.method3476();
		Static55.method1371();
		Static107.aClass36_1 = null;
		if (Static110.aClass2_1 != null) {
			Static110.aClass2_1.method1972();
		}
		if (Static172.aClass2_2 != null) {
			Static172.aClass2_2.method1972();
		}
		Static101.method2122();
		Static139.method2731();
		try {
			if (Static22.aClass66_3 != null) {
				Static22.aClass66_3.method2650();
			}
			if (Static24.aClass66Array1 != null) {
				for (@Pc(48) int local48 = 0; local48 < Static24.aClass66Array1.length; local48++) {
					if (Static24.aClass66Array1[local48] != null) {
						Static24.aClass66Array1[local48].method2650();
					}
				}
			}
			if (Static120.aClass66_5 != null) {
				Static120.aClass66_5.method2650();
			}
			if (Static25.aClass66_4 != null) {
				Static25.aClass66_4.method2650();
			}
		} catch (@Pc(81) IOException local81) {
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method776() {
		@Pc(4) boolean local4 = Static20.method440();
		if (local4 && Static100.aBoolean115 && Static110.aClass2_1 != null) {
			Static110.aClass2_1.method1979();
		}
		if (Static4.aBoolean9) {
			Static133.method2575(Static24.aCanvas1);
			Static122.method2495(Static24.aCanvas1);
			if (Static107.aClass36_1 != null) {
				Static107.aClass36_1.method1610(Static24.aCanvas1);
			}
			this.method774();
			Static166.method3303(Static24.aCanvas1);
			Static148.method2920(Static24.aCanvas1);
			if (Static107.aClass36_1 != null) {
				Static107.aClass36_1.method1612(Static24.aCanvas1);
			}
		}
		if (Static15.anInt445 == 0) {
			Static168.method1665(null, Static179.aClass70_1559, Static42.anInt1427);
		} else if (Static15.anInt445 == 5) {
			Static162.method3314(Static124.aClass1_Sub1_Sub1_Sub2_Sub1_5, Static128.aClass1_Sub1_Sub1_Sub2_Sub1_7);
		} else if (Static15.anInt445 == 10) {
			Static162.method3314(Static124.aClass1_Sub1_Sub1_Sub2_Sub1_5, Static128.aClass1_Sub1_Sub1_Sub2_Sub1_7);
		} else if (Static15.anInt445 == 20) {
			Static162.method3314(Static124.aClass1_Sub1_Sub1_Sub2_Sub1_5, Static128.aClass1_Sub1_Sub1_Sub2_Sub1_7);
		} else if (Static15.anInt445 == 25) {
			@Pc(126) int local126;
			if (Static115.anInt3157 == 1) {
				if (Static96.anInt2795 > Static106.anInt3001) {
					Static106.anInt3001 = Static96.anInt2795;
				}
				local126 = (Static106.anInt3001 - Static96.anInt2795) * 50 / Static106.anInt3001;
				Static44.method1098(false, Static160.method3210(new Class70[] { Static88.aClass70_862, Static160.aClass70_1414, Static34.method873(local126), Static157.aClass70_875 }));
			} else if (Static115.anInt3157 == 2) {
				if (Static131.anInt3437 > Static55.anInt1762) {
					Static55.anInt1762 = Static131.anInt3437;
				}
				local126 = (Static55.anInt1762 - Static131.anInt3437) * 50 / Static55.anInt1762 + 50;
				Static44.method1098(false, Static160.method3210(new Class70[] { Static88.aClass70_862, Static160.aClass70_1414, Static34.method873(local126), Static157.aClass70_875 }));
			} else {
				Static44.method1098(false, Static88.aClass70_862);
			}
		} else if (Static15.anInt445 == 30) {
			Static77.method1760();
		} else if (Static15.anInt445 == 40) {
			Static44.method1098(false, Static160.method3210(new Class70[] { Static44.aClass70_483, Static102.aClass70_942, Static145.aClass70_1308 }));
		}
		@Pc(246) int local246;
		@Pc(244) Graphics local244;
		if (Static15.anInt445 == 30 && Static45.anInt1478 == 0 && !Static11.aBoolean16) {
			try {
				local244 = Static24.aCanvas1.getGraphics();
				for (local246 = 0; local246 < Static44.anInt1474; local246++) {
					if (Static26.aBooleanArray3[local246]) {
						Static31.aClass14_1.method3226(local244, Static146.anIntArray363[local246], Static19.anIntArray32[local246], Static92.anIntArray254[local246], Static99.anIntArray437[local246]);
						Static26.aBooleanArray3[local246] = false;
					}
				}
			} catch (@Pc(278) Exception local278) {
				Static24.aCanvas1.repaint();
			}
		} else if (Static15.anInt445 > 0) {
			try {
				local244 = Static24.aCanvas1.getGraphics();
				Static31.aClass14_1.method3221(local244);
				Static11.aBoolean16 = false;
				for (local246 = 0; local246 < Static44.anInt1474; local246++) {
					Static26.aBooleanArray3[local246] = false;
				}
			} catch (@Pc(315) Exception local315) {
				Static24.aCanvas1.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method769()) {
			return;
		}
		Static26.anInt708 = Integer.parseInt(this.getParameter("worldid"));
		Static4.anInt194 = Integer.parseInt(this.getParameter("modewhat"));
		Static35.anInt2016 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static81.method1837();
		} else {
			Static57.method1406();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static133.aBoolean136 = true;
		} else {
			Static133.aBoolean136 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static120.method2455();
			Static35.aClass70_630 = Static142.aClass70_1287;
			Static123.anInt3345 = 1;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static82.anInt2517 = 1;
		} else {
			Static82.anInt2517 = 0;
		}
		try {
			Static130.anInt3423 = Integer.parseInt(this.getParameter("js"));
			Static19.anInt535 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(101) Exception local101) {
		}
		Static101.aString4 = this.getCodeBase().getHost();
		this.method777(Static4.anInt194 + 32);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method768() {
		if (Static82.anInt2517 == 1) {
			Static119.aShortArray31 = Static117.aShortArray26;
			Static109.aShortArrayArray3 = Static151.aShortArrayArray4;
			Static146.aShortArray36 = Static77.aShortArray23;
			Static176.aShortArrayArray6 = Static40.aShortArrayArray1;
		} else {
			Static109.aShortArrayArray3 = Static42.aShortArrayArray2;
			Static146.aShortArray36 = Static11.aShortArray6;
			Static119.aShortArray31 = Static64.aShortArray10;
			Static176.aShortArrayArray6 = Static164.aShortArrayArray5;
		}
		Static3.anInt172 = Static35.anInt2016 == 0 ? 443 : Static26.anInt708 + 50000;
		Static58.anInt1874 = Static35.anInt2016 == 0 ? 43594 : Static26.anInt708 + 40000;
		Static158.anInt4152 = Static58.anInt1874;
		Static96.method2075();
		Static166.method3303(Static24.aCanvas1);
		Static148.method2920(Static24.aCanvas1);
		Static107.aClass36_1 = Static96.method2079();
		if (Static107.aClass36_1 != null) {
			Static107.aClass36_1.method1612(Static24.aCanvas1);
		}
		Static37.anInt1307 = Static62.anInt1964;
		try {
			if (Static9.aClass32_1.aClass74_3 != null) {
				Static22.aClass66_3 = new Class66(Static9.aClass32_1.aClass74_3, 5200, 0);
				for (@Pc(86) int local86 = 0; local86 < 16; local86++) {
					Static24.aClass66Array1[local86] = new Class66(Static9.aClass32_1.aClass74Array1[local86], 6000, 0);
				}
				Static120.aClass66_5 = new Class66(Static9.aClass32_1.aClass74_1, 6000, 0);
				Static138.aClass9_2 = new Class9(255, Static22.aClass66_3, Static120.aClass66_5, 500000);
				Static25.aClass66_4 = new Class66(Static9.aClass32_1.aClass74_2, 24, 0);
				Static9.aClass32_1.aClass74_1 = null;
				Static9.aClass32_1.aClass74_2 = null;
				Static9.aClass32_1.aClass74_3 = null;
				Static9.aClass32_1.aClass74Array1 = null;
			}
		} catch (@Pc(142) IOException local142) {
			Static22.aClass66_3 = null;
			Static120.aClass66_5 = null;
			Static25.aClass66_4 = null;
			Static138.aClass9_2 = null;
		}
		if (Static35.anInt2016 != 0) {
			Static89.aBoolean103 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method779() {
		Static30.method786();
		Static148.method2916();
		Static64.method778();
		Static168.method1664();
		Static128.method3229();
		Static73.method1661();
		Static48.method1238();
		Static95.method2049();
		Static167.method3342();
		Static136.method2655();
		Static15.method376();
		Static65.method1524();
		Static47.method1284();
		Static121.method2472();
		Static77.method1759();
		Static37.method956();
		Static4.method177();
		Static61.method1469();
		Static152.method1614();
		Static182.method3486();
		Static56.method1374();
		Static157.method1984();
		Static163.method3268();
		Static106.method2227();
		Static147.method2887();
		Static35.method1513();
		Static60.method1462();
		Static119.method2426();
		Static80.method1820();
		Static83.method3500();
		Static181.method3472();
		Static173.method3413();
		Static50.method1296();
		Static84.method721();
		Static45.method1105();
		Static164.method3270();
		Static159.method3182();
		Static103.method2187();
		Static113.method2295();
		Static132.method2567();
		Static149.method3064();
		Static67.method1547();
		Static114.method2300();
		Static8.method249();
		Static46.method1130();
		Static101.method2118();
		Static43.method1053();
		Static92.method1991();
		Static14.method369();
		Static127.method2536();
		Static131.method2565();
		Static143.method2808();
		Static176.method3432();
		Static89.method1933();
		Static162.method3310();
		Static102.method2158();
		Static7.method240();
		Static36.method921();
		Static5.method183();
		Static22.method470();
		Static31.method788();
		Static69.method1574();
		Static51.method1304();
		Static53.method1337();
		Static38.method980();
		Static72.method1659();
		Static118.method2404();
		Static117.method2402();
		Static155.method3003();
		Static99.method3505();
		Static1.method101();
		Static18.method407();
		Static180.method3455();
		Static105.method2211();
		Static81.method1832();
		Static20.method441();
		Static10.method299();
		Static66.method1544();
		Static142.method2798();
		Static57.method1403();
		Static3.method161();
		Static29.method735();
		Static79.method1807();
		Static183.method3508();
		Static93.method2008();
		Static68.method1564();
		Static122.method2498();
		Static40.method1023();
		Static76.method2370();
		Static174.method3427();
		Static85.method1879();
		Static150.method3046();
		Static185.method3521();
		Static111.method2289();
		Static63.method1488();
		Static88.method1930();
		Static58.method1418();
		Static138.method2701();
		Static178.method3439();
		Static140.method2733();
		Static110.method2283();
		Static169.method3344();
		Static166.method3305();
		Static153.method3077();
		Static151.method3072();
		Static71.method1643();
		Static16.method388();
		Static137.method2686();
		Static52.method1329();
		Static44.method1094();
		Static161.method3220();
		Static109.method2270();
		Static133.method2572();
		Static42.method1040();
		Static74.method1667();
		Static27.method572();
		Static112.method3351();
		Static49.method1295();
		Static123.method2500();
		Static26.method550();
		Static91.method1988();
		Static87.method1917();
		Static125.method2531();
		Static175.method3430();
		Static172.method3411();
		Static146.method2858();
		Static75.method1682();
		Static17.method391();
		Static55.method1369();
		Static12.method337();
		Static100.method2116();
		Static23.method485();
		Static97.method2086();
		Static134.method2578();
		Static184.method3513();
		Static129.method3392();
		Static108.method2266();
		Static104.method2188();
		Static6.method236();
		Static41.method1034();
		Static177.method3434();
		Static126.method630();
		Static130.method2561();
		Static165.method3301();
		Static144.method2835();
		Static124.method2527();
		Static139.method2730();
		Static78.method1787();
		Static54.method1367();
		Static94.method2038();
		Static25.method547();
		Static86.method1912();
		Static32.method821();
		Static170.method3377();
		Static98.method2113();
		Static141.method2758();
		Static33.method847();
		Static135.method2645();
		Static171.method3405();
		Static90.method1966();
		Static28.method632();
		Static24.method520();
		Static120.method2458();
		Static11.method326();
		Static96.method2074();
		Static9.method276();
		Static82.method1862();
		Static107.method2253();
		Static34.method874();
		Static39.method1007();
		Static70.method1600();
		Static59.method1449();
		Static160.method3209();
		Static154.method3107();
		Static158.method3171();
		Static21.method467();
		Static115.method2332();
		Static13.method364();
		Static19.method435();
		Static156.method3143();
		Static116.method2335();
		Static145.method2848();
		Static179.method3453();
		Static2.method140();
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method787() {
		if (Static150.anInt3975 >= 4) {
			this.method764("js5crc");
			Static15.anInt445 = 1000;
			return;
		}
		if (Static102.anInt2886 >= 4) {
			if (Static15.anInt445 <= 5) {
				this.method764("js5io");
				Static15.anInt445 = 1000;
				return;
			}
			Static40.anInt1391 = 3000;
			Static102.anInt2886 = 3;
		}
		if (Static40.anInt1391-- > 0) {
			return;
		}
		try {
			if (Static143.anInt3771 == 0) {
				Static176.aClass18_8 = Static9.aClass32_1.method1475(Static158.anInt4152, Static101.aString4);
				Static143.anInt3771++;
			}
			if (Static143.anInt3771 == 1) {
				if (Static176.aClass18_8.anInt1403 == 2) {
					this.method781(-1);
					return;
				}
				if (Static176.aClass18_8.anInt1403 == 1) {
					Static143.anInt3771++;
				}
			}
			if (Static143.anInt3771 == 2) {
				Static129.aClass43_43 = new Class43((Socket) Static176.aClass18_8.anObject2, Static9.aClass32_1);
				@Pc(103) Class1_Sub9 local103 = new Class1_Sub9(5);
				local103.method1260(15);
				local103.method1259(483);
				Static129.aClass43_43.method2045(local103.aByteArray25, 5);
				Static143.anInt3771++;
				Static12.aLong20 = Static143.method2807();
			}
			if (Static143.anInt3771 == 3) {
				if (Static15.anInt445 <= 5 || Static129.aClass43_43.method2041() > 0) {
					@Pc(141) int local141 = Static129.aClass43_43.method2043();
					if (local141 != 0) {
						this.method781(local141);
						return;
					}
					Static143.anInt3771++;
				} else if (Static143.method2807() - Static12.aLong20 > 30000L) {
					this.method781(-2);
					return;
				}
			}
			if (Static143.anInt3771 == 4) {
				Static22.method471(Static129.aClass43_43, Static15.anInt445 > 20);
				Static176.aClass18_8 = null;
				Static143.anInt3771 = 0;
				Static83.anInt4537 = 0;
				Static129.aClass43_43 = null;
			}
		} catch (@Pc(199) IOException local199) {
			this.method781(-3);
		}
	}
}
