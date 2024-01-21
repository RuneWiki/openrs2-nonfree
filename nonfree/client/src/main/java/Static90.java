import java.awt.Component;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Lclient!u;")
	public static Class8_Sub1 aClass8_Sub1_20;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "Lclient!qb;")
	public static Class49 aClass49_1;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "I")
	public static int anInt2328 = 0;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "Lclient!a;")
	private static Class1 aClass1_2444 = Static94.method1596("slide:");

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!a;")
	public static Class1 aClass1_2442 = aClass1_2444;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "Lclient!a;")
	private static Class1 aClass1_2443 = Static94.method1596("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!s", name = "j", descriptor = "I")
	public static volatile int anInt2331 = 0;

	@OriginalMember(owner = "client!s", name = "k", descriptor = "I")
	public static int anInt2332 = -1;

	@OriginalMember(owner = "client!s", name = "p", descriptor = "Lclient!a;")
	private static Class1 aClass1_2447 = Static94.method1596("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!s", name = "m", descriptor = "Lclient!a;")
	public static Class1 aClass1_2445 = aClass1_2447;

	@OriginalMember(owner = "client!s", name = "n", descriptor = "I")
	public static final int anInt2334 = 2301979;

	@OriginalMember(owner = "client!s", name = "o", descriptor = "Lclient!a;")
	public static Class1 aClass1_2446 = Static94.method1596("(U4");

	@OriginalMember(owner = "client!s", name = "s", descriptor = "I")
	public static int anInt2337 = 0;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
	public static void method1570(@OriginalArg(0) int arg0) {
		Static102.method1717(arg0);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method1571(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(21) String local21;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local21 = local11.aString1 + " | ";
			arg0 = local11.aThrowable1;
		} else {
			local21 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(60) String local60 = local53.readLine();
		while (true) {
			while (true) {
				@Pc(63) String local63 = local53.readLine();
				if (local63 == null) {
					return local21 + "| " + local60;
				}
				@Pc(69) int local69 = local63.indexOf(40);
				@Pc(76) int local76 = local63.indexOf(41, local69 + 1);
				if (local69 >= 0 && local76 >= 0) {
					@Pc(90) String local90 = local63.substring(local69 + 1, local76);
					@Pc(94) int local94 = local90.indexOf(".java:");
					if (local94 >= 0) {
						local90 = local90.substring(0, local94) + local90.substring(local94 + 5);
						local21 = local21 + local90 + ' ';
						continue;
					}
					local63 = local63.substring(0, local69);
				}
				local63 = local63.trim();
				local63 = local63.substring(local63.lastIndexOf(32) + 1);
				local63 = local63.substring(local63.lastIndexOf(9) + 1);
				local21 = local21 + local63 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)Lclient!t;")
	public static Class2_Sub1_Sub16 method1572(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub16 local10 = (Class2_Sub1_Sub16) Static71.aClass11_16.method431((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static63.method1310(Static30.aClass8_10, arg0, Static100.aClass8_25);
		if (local10 != null) {
			Static71.aClass11_16.method430((long) arg0, local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	public static void method1573() {
		aClass1_2443 = null;
		aClass1_2444 = null;
		aClass1_2446 = null;
		aClass1_2442 = null;
		aClass8_Sub1_20 = null;
		aClass1_2447 = null;
		aClass49_1 = null;
		aClass1_2445 = null;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
	public static void method1574() {
		Static68.aClass1_1986 = Static69.aClass1_2917;
		Static28.aClass1_1061 = Static107.aClass1_2862;
		Static17.aClass1_679 = Static65.aClass1_1977;
		Static1.aClass1_8 = Static21.aClass1_850;
		Static62.aClass1_1907 = Static63.aClass1_1917;
		Static67.aClass1_2871 = Static106.aClass1_2799;
		Static8.aClass1_425 = Static106.aClass1_2798;
		Static93.aClass1_2460 = Static95.aClass1_2518;
		Static63.aClass1_1918 = Static65.aClass1_1972;
		Static85.aClass1_2367 = Static25.aClass1_1004;
		Static108.aClass1_2813 = Static77.aClass1_2160;
		Static69.aClass1_2913 = Static54.aClass1_1831;
		Static80.aClass1_2267 = Static37.aClass1_1321;
		Static51.aClass1_1747 = Static97.aClass1_2622;
		Static98.aClass1_2627 = Static37.aClass1_1321;
		Static113.aClass1_2348 = Static110.aClass1_2881;
		Static69.aClass1_2943 = Static112.aClass1_2909;
		Static32.aClass1_1213 = Static99.aClass1_2629;
		Static37.aClass1_1315 = Static62.aClass1_1911;
		Static28.aClass1_1059 = Static65.aClass1_1970;
		Static69.aClass1_2937 = Static108.aClass1_2811;
		Static53.aClass1_1820 = Static42.aClass1_1434;
		aClass1_2442 = Static112.aClass1_2906;
		Static113.aClass1_2350 = Static106.aClass1_2802;
		Static65.aClass1_1973 = Static60.aClass1_1850;
		Static69.aClass1_2938 = Static88.aClass1_2436;
		Static25.aClass1_998 = Static112.aClass1_2908;
		Static77.aClass1_2166 = Static44.aClass1_1488;
		Static13.aClass1_597 = Static29.aClass1_1110;
		Static103.aClass1_2701 = Static68.aClass1_1978;
		Static88.aClass1_2431 = Static43.aClass1_1438;
		Static69.aClass1_2939 = Static18.aClass1_736;
		Static69.aClass1_2927 = Static108.aClass1_2811;
		Static87.aClass1_2423 = Static15.aClass1_657;
		Static29.aClass1_1109 = Static11.aClass1_581;
		Static28.aClass1_1055 = Static65.aClass1_1970;
		Static22.aClass1_856 = Static79.aClass1_2218;
		Static15.aClass1_655 = Static87.aClass1_2427;
		Static21.aClass1_851 = Static99.aClass1_2631;
		Static41.aClass1_1380 = Static48.aClass1_1575;
		Static67.aClass1_2867 = Static55.aClass1_666;
		Static93.aClass1_2465 = Static34.aClass1_1241;
		Static69.aClass1_2932 = Static108.aClass1_2811;
		Static69.aClass1_2923 = Static108.aClass1_2811;
		Static104.aClass1_1584 = Static109.aClass1_2878;
		Static69.aClass1_2931 = Static108.aClass1_2811;
		Static95.aClass1_2519 = Static47.aClass1_1515;
		Static69.aClass1_2933 = Static108.aClass1_2811;
		Static109.aClass1_2879 = Static82.aClass1_2279;
		Static113.aClass1_2346 = Static41.aClass1_1379;
		Static22.aClass1_853 = Static77.aClass1_2164;
		Static79.aClass1_2212 = Static33.aClass1_1219;
		Static80.aClass1_2266 = Static47.aClass1_1516;
		Static54.aClass1_1834 = Static101.aClass1_2682;
		Static102.aClass1_2687 = Static89.aClass1_2439;
		Static84.aClass1_2365 = Static111.aClass1_2889;
		Static61.aClass1_1900 = Static112.aClass1_2903;
		Static64.aClass1_1968 = Static81.aClass1_2277;
		Static107.aClass1_2860 = Static101.aClass1_2685;
		Static4.aClass1_284 = Static1.aClass1_4;
		Static37.aClass1_1312 = Static88.aClass1_2438;
		Static40.aClass1_1577 = Static93.aClass1_2463;
		Static112.aClass1_2904 = Static65.aClass1_1971;
		Static109.aClass1_2875 = Static33.aClass1_1233;
		Static46.aClass1_1502 = Static45.aClass1_1489;
		Static69.aClass1_2921 = Static65.aClass1_1976;
		Static25.aClass1_1000 = Static51.aClass1_1746;
		Static52.aClass1_1773 = Static40.aClass1_1579;
		Static57.aClass1_1844 = Static63.aClass1_1915;
		Static71.aClass1_2033 = Static25.aClass1_997;
		Static68.aClass1_1981 = Static91.aClass1_2448;
		Static102.aClass1_2686 = Static34.aClass1_1242;
		Static13.aClass1_596 = Static39.aClass1_2858;
		Static83.aClass1_2345 = Static51.aClass1_1750;
		Static71.aClass1_2035 = Static82.aClass1_2283;
		Static38.aClass1_1327 = Static7.aClass1_1204;
		Static85.aClass1_2369 = Static63.aClass1_1914;
		Static111.aClass1_2899 = Static66.aClass1_2459;
		Static13.aClass1_603 = Static21.aClass1_844;
		Static85.aClass1_2372 = Static108.aClass1_2809;
		Static69.aClass1_2930 = Static108.aClass1_2811;
		Static69.aClass1_2915 = Static31.aClass1_1208;
		Static17.aClass1_675 = Static104.aClass1_1592;
		Static7.aClass1_1202 = Static29.aClass1_1108;
		Static84.aClass1_2360 = Static108.aClass1_2808;
		Static28.aClass1_1058 = Static107.aClass1_2862;
		Static25.aClass1_994 = Static68.aClass1_1984;
		Static28.aClass1_1056 = Static65.aClass1_1970;
		Static69.aClass1_2945 = Static108.aClass1_2811;
		Static69.aClass1_2918 = Static108.aClass1_2811;
		Static41.aClass1_1382 = Static17.aClass1_672;
		Static77.aClass1_2157 = Static67.aClass1_2868;
		Static79.aClass1_2215 = Static33.aClass1_1219;
		Static2.aClass1_266 = Static79.aClass1_2217;
		Static69.aClass1_2947 = Static108.aClass1_2811;
		Static46.aClass1_1501 = Static46.aClass1_1508;
		Static2.aClass1_260 = Static109.aClass1_2877;
		Static14.aClass1_650 = Static82.aClass1_2281;
		Static12.aClass1_2745 = Static22.aClass1_854;
		Static87.aClass1_2422 = Static79.aClass1_2214;
		Static69.aClass1_2934 = Static108.aClass1_2811;
		Static98.aClass1_2628 = Static87.aClass1_2424;
		Static33.aClass1_1223 = Static55.aClass1_671;
		Static69.aClass1_2929 = Static54.aClass1_1830;
		Static41.aClass1_1384 = Static104.aClass1_1589;
		Static106.aClass1_2805 = Static101.aClass1_2684;
		Static71.aClass1_2036 = Static25.aClass1_997;
		Static52.aClass1_1771 = Static88.aClass1_2430;
		Static69.aClass1_2936 = Static54.aClass1_1831;
		Static66.aClass1_2453 = Static59.aClass1_1847;
		Static33.aClass1_1224 = Static21.aClass1_839;
		Static53.aClass1_1823 = Static95.aClass1_2525;
		Static69.aClass1_2946 = Static65.aClass1_1970;
		Static47.aClass1_1510 = Static61.aClass1_1902;
		Static54.aClass1_1836 = Static11.aClass1_582;
		Static37.aClass1_1323 = Static30.aClass1_1158;
		Static80.aClass1_2270 = Static34.aClass1_1239;
		Static28.aClass1_1052 = Static88.aClass1_2435;
		Static69.aClass1_2948 = Static13.aClass1_598;
		Static104.aClass1_1594 = Static68.aClass1_1979;
		Static111.aClass1_2891 = Static28.aClass1_1054;
		Static69.aClass1_2950 = Static108.aClass1_2811;
		Static69.aClass1_2924 = Static99.aClass1_2630;
		Static69.aClass1_2914 = Static108.aClass1_2811;
		Static41.aClass1_1374 = Static69.aClass1_2942;
		Static66.aClass1_2451 = Static2.aClass1_265;
		Static61.aClass1_1905 = Static21.aClass1_847;
		Static53.aClass1_1822 = Static109.aClass1_2874;
		Static93.aClass1_2462 = Static1.aClass1_6;
		Static84.aClass1_2361 = Static108.aClass1_2812;
		Static66.aClass1_2452 = Static95.aClass1_2520;
		Static33.aClass1_1228 = Static84.aClass1_2354;
		Static69.aClass1_2935 = Static54.aClass1_1830;
		Static83.aClass1_2334 = Static111.aClass1_2895;
		Static72.aClass1_2041 = Static101.aClass1_2681;
		Static41.aClass1_1377 = Static4.aClass1_283;
		Static83.aClass1_2338 = Static25.aClass1_996;
		Static54.aClass1_1835 = Static25.aClass1_999;
		Static81.aClass1_2274 = Static103.aClass1_2702;
		Static8.aClass1_421 = Static84.aClass1_2355;
		Static82.aClass1_2280 = Static14.aClass1_652;
		Static60.aClass1_1857 = Static109.aClass1_2876;
		Static6.aClass1_292 = Static62.aClass1_1906;
		Static95.aClass1_2521 = Static101.aClass1_2683;
		Static48.aClass1_1571 = Static12.aClass1_2749;
		Static18.aClass1_743 = Static17.aClass1_678;
		Static48.aClass1_1570 = Static68.aClass1_1983;
		Static27.aClass1_1007 = Static38.aClass1_1324;
		Static71.aClass1_2029 = Static106.aClass1_2803;
		Static94.aClass1_2468 = Static2.aClass1_262;
		Static33.aClass1_1229 = Static38.aClass1_1325;
		Static102.aClass1_2691 = Static28.aClass1_1057;
		Static83.aClass1_2335 = Static60.aClass1_1855;
		Static57.aClass1_1840 = Static31.aClass1_1206;
		Static37.aClass1_1320 = Static55.aClass1_667;
		Static64.aClass1_1966 = Static46.aClass1_1505;
		Static69.aClass1_2925 = Static108.aClass1_2811;
		Static31.aClass1_1205 = Static82.aClass1_2282;
		Static77.aClass1_2159 = Static106.aClass1_2801;
		Static71.aClass1_2039 = Static67.aClass1_2870;
		Static33.aClass1_1232 = Static82.aClass1_2278;
		Static103.aClass1_2703 = Static12.aClass1_2752;
		Static69.aClass1_2919 = Static108.aClass1_2811;
		Static77.aClass1_2152 = Static72.aClass1_2044;
		Static37.aClass1_1317 = Static55.aClass1_667;
		Static69.aClass1_2944 = Static15.aClass1_654;
		Static110.aClass1_2884 = Static48.aClass1_1573;
		Static37.aClass1_1314 = Static28.aClass1_1053;
		Static77.aClass1_2155 = Static33.aClass1_1222;
		Static50.aClass1_1640 = Static42.aClass1_1433;
		Static112.aClass1_2901 = Static102.aClass1_2689;
		Static1.aClass1_5 = Static21.aClass1_842;
		Static77.aClass1_2150 = Static47.aClass1_1517;
		Static76.aClass1_2143 = Static44.aClass1_1487;
		Static62.aClass1_1909 = Static55.aClass1_668;
		Static5.aClass1_287 = Static47.aClass1_1514;
		Static84.aClass1_2363 = Static10.aClass1_2680;
		Static102.aClass1_2693 = Static73.aClass1_2048;
		Static69.aClass1_2922 = Static108.aClass1_2811;
		Static47.aClass1_1518 = Static64.aClass1_1965;
		Static88.aClass1_2433 = Static21.aClass1_848;
		Static30.aClass1_1156 = Static6.aClass1_293;
		Static33.aClass1_1225 = Static21.aClass1_840;
		Static10.aClass1_2679 = Static42.aClass1_1432;
		Static63.aClass1_1919 = Static76.aClass1_2146;
		Static60.aClass1_1851 = Static71.aClass1_2037;
		Static79.aClass1_2219 = Static43.aClass1_1437;
		Static17.aClass1_673 = Static27.aClass1_1009;
		Static52.aClass1_1777 = Static21.aClass1_843;
		Static73.aClass1_2049 = Static76.aClass1_2142;
		Static51.aClass1_1742 = Static91.aClass1_2449;
		Static50.aClass1_1644 = Static77.aClass1_2165;
		Static68.aClass1_1987 = Static48.aClass1_1569;
		Static21.aClass1_849 = Static2.aClass1_267;
		Static84.aClass1_2364 = Static11.aClass1_583;
		Static40.aClass1_1580 = Static81.aClass1_2277;
		Static27.aClass1_1008 = Static31.aClass1_1209;
		Static69.aClass1_2911 = aClass1_2443;
		aClass1_2445 = Static51.aClass1_1744;
		Static67.aClass1_2866 = Static76.aClass1_2148;
		Static99.aClass1_2633 = Static83.aClass1_2343;
		Static71.aClass1_2034 = Static5.aClass1_286;
		Static34.aClass1_1240 = Static22.aClass1_857;
		Static69.aClass1_2940 = Static76.aClass1_2145;
		Static51.aClass1_1749 = Static34.aClass1_1237;
		Static81.aClass1_2272 = Static13.aClass1_601;
		Static18.aClass1_746 = Static87.aClass1_2428;
		Static73.aClass1_2046 = Static76.aClass1_2142;
		Static30.aClass1_1159 = Static2.aClass1_263;
		Static12.aClass1_2750 = Static97.aClass1_2621;
		Static69.aClass1_2941 = Static108.aClass1_2811;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IBI)I")
	public static int method1575(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(25) int local25 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local25;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V")
	public static void method1576() {
		try {
			@Pc(2) Graphics local2 = Static103.aCanvas1.getGraphics();
			Static39.aClass4_62.method1525(553, local2, 205);
		} catch (@Pc(10) Exception local10) {
			Static103.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1577(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static48.aClass63_1);
		arg0.removeMouseMotionListener(Static48.aClass63_1);
		arg0.removeFocusListener(Static48.aClass63_1);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!bd;Lclient!bd;)V")
	public static void method1578(@OriginalArg(1) Class8 arg0, @OriginalArg(2) Class8 arg1) {
		Static64.aClass8_21 = arg0;
		Static32.aClass8_11 = arg1;
	}
}
