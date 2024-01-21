import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!rb", name = "kb", descriptor = "Lclient!id;")
	public static Class3_Sub1_Sub1_Sub2 aClass3_Sub1_Sub1_Sub2_5;

	@OriginalMember(owner = "client!rb", name = "mb", descriptor = "I")
	public static int anInt2547;

	@OriginalMember(owner = "client!rb", name = "ob", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1395 = Static33.method650("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!rb", name = "Y", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1391 = aClass56_1395;

	@OriginalMember(owner = "client!rb", name = "pb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1396 = Static33.method650("Please try using a different world)3");

	@OriginalMember(owner = "client!rb", name = "bb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1392 = aClass56_1396;

	@OriginalMember(owner = "client!rb", name = "eb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1393 = Static33.method650(":duelreq:");

	@OriginalMember(owner = "client!rb", name = "ib", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1394 = aClass56_1396;

	@OriginalMember(owner = "client!rb", name = "jb", descriptor = "I")
	public static int anInt2545 = 0;

	@OriginalMember(owner = "client!rb", name = "nb", descriptor = "I")
	public static int anInt2548 = 0;

	@OriginalMember(owner = "client!rb", name = "qb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1397 = Static33.method650("redstone1");

	@OriginalMember(owner = "client!rb", name = "rb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1398 = aClass56_1396;

	@OriginalMember(owner = "client!rb", name = "wb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1399 = aClass56_1396;

	@OriginalMember(owner = "client!rb", name = "xb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1400 = aClass56_1396;

	@OriginalMember(owner = "client!rb", name = "yb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1401 = aClass56_1396;

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V")
	public static void method1701() {
		aClass56_1396 = null;
		aClass56_1392 = null;
		aClass56_1391 = null;
		aClass56_1393 = null;
		aClass56_1398 = null;
		aClass56_1399 = null;
		aClass56_1400 = null;
		aClass56_1394 = null;
		aClass56_1395 = null;
		aClass56_1397 = null;
		aClass56_1401 = null;
		aClass3_Sub1_Sub1_Sub2_5 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!oa;IIILclient!oa;I)V")
	public static void method1702(@OriginalArg(0) int arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class56 arg4, @OriginalArg(6) int arg5) {
		if (Static66.anInt559 >= 500) {
			return;
		}
		if (arg4.method1426() <= 0) {
			Static28.aClass56Array2[Static66.anInt559] = arg1;
		} else {
			Static28.aClass56Array2[Static66.anInt559] = Static84.method1524(new Class56[] { arg1, Static53.aClass56_856, arg4 });
		}
		Static9.anIntArray9[Static66.anInt559] = arg2;
		Static22.anIntArray47[Static66.anInt559] = arg5;
		Static117.anIntArray303[Static66.anInt559] = arg3;
		Static93.anIntArray219[Static66.anInt559] = arg0;
		Static66.anInt559++;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIII)V")
	public static void method1703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static68.aClass3_Sub1_Sub1_Sub4Array37[0].method1504(arg4, arg1);
		Static68.aClass3_Sub1_Sub1_Sub4Array37[1].method1504(arg4, arg0 + arg1 - 16);
		Static6.method1487(arg4, arg1 + 16, 16, arg0 - 32, Static64.anInt1825);
		@Pc(52) int local52 = (arg0 - 32) * arg0 / arg2;
		if (local52 < 8) {
			local52 = 8;
		}
		@Pc(71) int local71 = (arg0 - local52 - 32) * arg3 / (arg2 - arg0);
		Static6.method1487(arg4, local71 + arg1 + 16, 16, local52, Static72.anInt1167);
		Static6.method1484(arg4, local71 + arg1 + 16, local52, Static116.anInt2945);
		Static6.method1484(arg4 + 1, arg1 + 16 + local71, local52, Static116.anInt2945);
		Static6.method1489(arg4, arg1 + local71 + 16, 16, Static116.anInt2945);
		Static6.method1489(arg4, arg1 + local71 + 17, 16, Static116.anInt2945);
		Static6.method1484(arg4 + 15, arg1 + 16 + local71, local52, Static29.anInt874);
		Static6.method1484(arg4 + 14, arg1 - -local71 + 17, local52 - 1, Static29.anInt874);
		Static6.method1489(arg4, local52 + local71 + arg1 + 15, 16, Static29.anInt874);
		Static6.method1489(arg4 + 1, local52 + local71 + arg1 - -14, 15, Static29.anInt874);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
	public static void method1704() {
		Static102.aClass56_1745 = Static103.aClass56_1419;
		Static22.aClass56_333 = Static13.aClass56_183;
		aClass56_1401 = Static73.aClass56_1077;
		Static123.aClass56_1658 = Static72.aClass56_701;
		Static19.aClass56_281 = Static11.aClass56_171;
		Static1.aClass56_1 = Static35.aClass56_551;
		Static64.aClass56_979 = Static108.aClass56_1492;
		Static29.aClass56_456 = Static104.aClass56_1421;
		aClass56_1398 = Static73.aClass56_1077;
		Static19.aClass56_280 = Static11.aClass56_169;
		Static77.aClass56_1727 = Static31.aClass56_504;
		Static113.aClass56_1559 = Static8.aClass56_111;
		Static29.aClass56_441 = Static2.aClass56_16;
		Static9.aClass56_118 = Static111.aClass56_1543;
		Static23.aClass56_343 = Static60.aClass56_942;
		Static36.aClass56_573 = Static95.aClass56_1343;
		Static93.aClass56_1298 = Static59.aClass56_923;
		Static99.aClass56_481 = Static56.aClass56_889;
		Static115.aClass56_1590 = Static13.aClass56_184;
		Static110.aClass56_1515 = Static24.aClass56_351;
		Static127.aClass56_1736 = Static113.aClass56_1552;
		Static40.aClass56_621 = Static80.aClass56_1161;
		Static86.aClass56_1238 = Static79.aClass56_1137;
		Static29.aClass56_437 = Static7.aClass56_205;
		Static8.aClass56_112 = Static45.aClass56_709;
		Static66.aClass56_276 = Static42.aClass56_672;
		Static47.aClass56_763 = Static105.aClass56_1443;
		Static29.aClass56_471 = Static103.aClass56_1419;
		Static65.aClass56_980 = Static68.aClass56_1001;
		Static118.aClass56_1622 = Static35.aClass56_552;
		Static66.aClass56_268 = Static51.aClass56_845;
		Static99.aClass56_477 = Static98.aClass56_1409;
		Static123.aClass56_1662 = Static114.aClass56_1566;
		Static122.aClass56_1645 = Static28.aClass56_407;
		Static29.aClass56_442 = Static103.aClass56_1419;
		Static72.aClass56_696 = Static84.aClass56_1219;
		Static100.aClass56_1414 = Static7.aClass56_208;
		Static4.aClass56_50 = Static9.aClass56_120;
		Static108.aClass56_1498 = Static82.aClass56_1191;
		Static113.aClass56_1553 = Static122.aClass56_1641;
		Static49.aClass56_839 = Static54.aClass56_868;
		Static23.aClass56_340 = Static32.aClass56_519;
		Static44.aClass56_693 = Static4.aClass56_51;
		Static124.aClass56_1697 = Static91.aClass56_1271;
		Static25.aClass56_370 = Static76.aClass56_1116;
		Static50.aClass56_804 = Static108.aClass56_1494;
		Static29.aClass56_436 = Static103.aClass56_1419;
		Static29.aClass56_467 = Static103.aClass56_1419;
		Static29.aClass56_460 = Static103.aClass56_1419;
		Static26.aClass56_377 = Static54.aClass56_870;
		Static123.aClass56_1667 = Static22.aClass56_338;
		Static83.aClass56_1210 = Static94.aClass56_1334;
		Static17.aClass56_237 = Static122.aClass56_1644;
		Static59.aClass56_918 = Static3.aClass56_1719;
		Static93.aClass56_1300 = Static88.aClass56_1253;
		Static14.aClass56_186 = Static35.aClass56_555;
		Static61.aClass56_950 = Static14.aClass56_190;
		Static29.aClass56_466 = Static104.aClass56_1420;
		Static59.aClass56_924 = Static51.aClass56_844;
		Static67.aClass56_1220 = Static75.aClass56_1081;
		aClass56_1399 = Static80.aClass56_1162;
		Static3.aClass56_1720 = Static109.aClass56_915;
		Static117.aClass56_1617 = Static7.aClass56_204;
		Static116.aClass56_1600 = Static70.aClass56_1029;
		Static109.aClass56_908 = Static94.aClass56_1337;
		Static22.aClass56_335 = Static4.aClass56_52;
		Static62.aClass56_960 = Static49.aClass56_841;
		Static63.aClass56_971 = Static93.aClass56_1299;
		Static1.aClass56_5 = Static127.aClass56_1738;
		Static29.aClass56_430 = Static103.aClass56_1419;
		Static92.aClass56_1288 = Static106.aClass56_1451;
		Static29.aClass56_432 = Static103.aClass56_1419;
		Static79.aClass56_1131 = Static8.aClass56_116;
		Static114.aClass56_1569 = Static2.aClass56_20;
		Static122.aClass56_1637 = Static33.aClass56_527;
		Static79.aClass56_1134 = Static111.aClass56_1537;
		Static77.aClass56_1725 = Static93.aClass56_1305;
		Static15.aClass56_217 = Static9.aClass56_117;
		Static86.aClass56_1237 = Static29.aClass56_443;
		Static53.aClass56_853 = Static25.aClass56_371;
		Static86.aClass56_1246 = Static72.aClass56_700;
		Static76.aClass56_1107 = Static75.aClass56_1082;
		Static40.aClass56_619 = Static80.aClass56_1161;
		Static32.aClass56_524 = Static92.aClass56_1294;
		Static87.aClass56_1248 = Static105.aClass56_1437;
		Static72.aClass56_702 = Static118.aClass56_1621;
		Static18.aClass56_241 = Static81.aClass56_1173;
		Static44.aClass56_690 = Static18.aClass56_239;
		Static66.aClass56_269 = Static14.aClass56_189;
		Static29.aClass56_468 = Static27.aClass56_404;
		Static81.aClass56_1168 = Static122.aClass56_1628;
		Static73.aClass56_1074 = Static11.aClass56_173;
		Static86.aClass56_1239 = Static115.aClass56_1591;
		Static29.aClass56_454 = Static103.aClass56_1419;
		Static61.aClass56_954 = Static116.aClass56_1597;
		Static127.aClass56_1737 = Static23.aClass56_342;
		aClass56_1391 = Static123.aClass56_1660;
		Static61.aClass56_956 = Static26.aClass56_378;
		Static52.aClass56_849 = Static26.aClass56_381;
		Static108.aClass56_1496 = Static31.aClass56_502;
		Static50.aClass56_802 = Static98.aClass56_1411;
		Static2.aClass56_13 = Static40.aClass56_625;
		Static15.aClass56_211 = Static86.aClass56_1245;
		aClass56_1392 = Static73.aClass56_1077;
		Static18.aClass56_244 = Static68.aClass56_1002;
		Static80.aClass56_1164 = Static22.aClass56_330;
		Static70.aClass56_1018 = Static127.aClass56_1739;
		Static60.aClass56_947 = Static63.aClass56_969;
		Static29.aClass56_448 = Static27.aClass56_404;
		Static2.aClass56_17 = Static61.aClass56_957;
		Static38.aClass56_575 = Static56.aClass56_888;
		Static19.aClass56_285 = Static93.aClass56_1304;
		Static29.aClass56_469 = Static40.aClass56_623;
		Static24.aClass56_349 = Static9.aClass56_123;
		Static109.aClass56_911 = Static75.aClass56_1083;
		Static116.aClass56_1595 = Static12.aClass56_179;
		Static64.aClass56_976 = Static40.aClass56_620;
		Static14.aClass56_187 = Static88.aClass56_1254;
		Static22.aClass56_328 = Static9.aClass56_119;
		Static29.aClass56_450 = Static73.aClass56_1077;
		Static29.aClass56_433 = Static67.aClass56_1222;
		Static61.aClass56_959 = Static7.aClass56_206;
		Static122.aClass56_1635 = Static95.aClass56_1342;
		Static25.aClass56_367 = Static71.aClass56_1045;
		Static41.aClass56_651 = Static53.aClass56_851;
		Static79.aClass56_1138 = Static98.aClass56_1402;
		Static62.aClass56_963 = Static105.aClass56_1436;
		Static116.aClass56_1598 = Static9.aClass56_117;
		aClass56_1394 = Static80.aClass56_1162;
		Static102.aClass56_1744 = Static103.aClass56_1417;
		Static36.aClass56_572 = Static49.aClass56_834;
		Static49.aClass56_833 = Static127.aClass56_1732;
		Static29.aClass56_452 = Static106.aClass56_1449;
		Static29.aClass56_465 = Static103.aClass56_1419;
		Static29.aClass56_439 = Static103.aClass56_1419;
		Static63.aClass56_970 = Static1.aClass56_4;
		Static1.aClass56_3 = Static75.aClass56_1087;
		Static25.aClass56_364 = Static105.aClass56_1441;
		Static115.aClass56_1586 = Static66.aClass56_274;
		Static70.aClass56_1027 = Static81.aClass56_1171;
		Static53.aClass56_856 = Static31.aClass56_506;
		Static57.aClass56_890 = Static104.aClass56_1422;
		Static109.aClass56_913 = Static1.aClass56_10;
		Static65.aClass56_987 = Static30.aClass56_497;
		Static105.aClass56_1438 = Static81.aClass56_1169;
		Static48.aClass56_772 = Static22.aClass56_331;
		Static123.aClass56_1668 = Static32.aClass56_525;
		Static22.aClass56_332 = Static70.aClass56_1017;
		Static29.aClass56_457 = Static103.aClass56_1419;
		Static26.aClass56_376 = Static65.aClass56_988;
		Static35.aClass56_550 = Static119.aClass56_1626;
		Static49.aClass56_836 = Static102.aClass56_1741;
		Static48.aClass56_771 = Static115.aClass56_1594;
		Static98.aClass56_1406 = Static21.aClass56_300;
		Static29.aClass56_444 = Static109.aClass56_916;
		Static96.aClass56_1370 = Static82.aClass56_1190;
		Static117.aClass56_1613 = Static25.aClass56_368;
		Static29.aClass56_435 = Static103.aClass56_1419;
		Static38.aClass56_574 = Static88.aClass56_1256;
		Static25.aClass56_366 = Static124.aClass56_1701;
		Static15.aClass56_213 = Static64.aClass56_973;
		Static73.aClass56_1075 = Static96.aClass56_1372;
		Static42.aClass56_673 = Static124.aClass56_1694;
		Static65.aClass56_982 = Static70.aClass56_1019;
		Static29.aClass56_464 = Static103.aClass56_1419;
		Static126.aClass56_1706 = Static80.aClass56_1163;
		Static105.aClass56_1435 = Static75.aClass56_1089;
		Static87.aClass56_1251 = Static94.aClass56_1338;
		Static59.aClass56_920 = Static51.aClass56_844;
		aClass56_1400 = Static72.aClass56_703;
		Static94.aClass56_1336 = Static21.aClass56_303;
		Static28.aClass56_408 = Static62.aClass56_964;
		Static29.aClass56_434 = Static104.aClass56_1421;
		Static29.aClass56_455 = Static71.aClass56_1046;
		Static70.aClass56_1021 = Static88.aClass56_1255;
		Static32.aClass56_520 = Static67.aClass56_1222;
		Static95.aClass56_1344 = Static35.aClass56_554;
		Static32.aClass56_523 = Static45.aClass56_708;
		Static30.aClass56_495 = Static113.aClass56_1555;
		Static76.aClass56_1119 = Static105.aClass56_1444;
		Static72.aClass56_699 = Static25.aClass56_372;
		Static75.aClass56_1086 = Static60.aClass56_946;
		Static102.aClass56_1749 = Static54.aClass56_871;
		Static76.aClass56_1108 = Static95.aClass56_1341;
		Static76.aClass56_1113 = Static70.aClass56_1024;
		Static71.aClass56_1044 = Static79.aClass56_1133;
		Static110.aClass56_1518 = Static24.aClass56_351;
		Static7.aClass56_207 = Static54.aClass56_869;
		Static35.aClass56_549 = Static124.aClass56_1693;
		Static15.aClass56_215 = Static36.aClass56_567;
		Static76.aClass56_1115 = Static61.aClass56_955;
		Static49.aClass56_840 = Static54.aClass56_868;
		Static46.aClass56_1214 = Static82.aClass56_1193;
		Static15.aClass56_212 = Static103.aClass56_1416;
		Static73.aClass56_1078 = Static41.aClass56_652;
		Static1.aClass56_2 = Static13.aClass56_182;
		Static100.aClass56_1413 = Static30.aClass56_499;
		Static110.aClass56_1516 = Static96.aClass56_1374;
		Static98.aClass56_1405 = Static30.aClass56_500;
		Static106.aClass56_1452 = Static19.aClass56_277;
		Static48.aClass56_767 = Static23.aClass56_347;
		Static73.aClass56_1071 = Static83.aClass56_1211;
		Static93.aClass56_1297 = Static67.aClass56_1224;
		Static110.aClass56_1511 = Static88.aClass56_1255;
		Static118.aClass56_1623 = Static8.aClass56_113;
		Static106.aClass56_1448 = Static109.aClass56_917;
		Static29.aClass56_431 = Static91.aClass56_1269;
		Static29.aClass56_453 = Static103.aClass56_1419;
		Static29.aClass56_451 = Static103.aClass56_1419;
		Static21.aClass56_299 = Static82.aClass56_1192;
		Static29.aClass56_445 = Static126.aClass56_1705;
		Static29.aClass56_440 = Static40.aClass56_623;
		Static102.aClass56_1742 = Static42.aClass56_675;
		Static29.aClass56_462 = Static76.aClass56_1117;
		Static109.aClass56_907 = Static88.aClass56_1252;
		Static2.aClass56_14 = Static105.aClass56_1446;
		Static86.aClass56_1242 = Static87.aClass56_1249;
		Static29.aClass56_458 = Static103.aClass56_1419;
		Static113.aClass56_1556 = Static113.aClass56_1557;
		Static102.aClass56_1746 = Static80.aClass56_1166;
		Static124.aClass56_1695 = Static64.aClass56_975;
		Static81.aClass56_1170 = Static33.aClass56_528;
		Static29.aClass56_438 = Static4.aClass56_53;
		Static75.aClass56_1088 = Static29.aClass56_449;
		Static92.aClass56_1292 = Static53.aClass56_854;
		Static29.aClass56_463 = Static103.aClass56_1419;
		Static12.aClass56_176 = Static110.aClass56_1520;
		Static59.aClass56_925 = Static68.aClass56_1003;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)Z")
	public static boolean method1705(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V")
	public static void method1706() {
		if (Static61.anInt1799 > 0) {
			Static46.method1518();
		} else {
			Static79.method1393(40);
			Static48.aClass17_2 = Static117.aClass17_4;
			Static117.aClass17_4 = null;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IJ)V")
	public static void method1707(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static42.anInt1124; local17++) {
			if (Static3.aLongArray36[local17] == arg0) {
				Static115.aBoolean157 = true;
				Static42.anInt1124--;
				for (@Pc(37) int local37 = local17; local37 < Static42.anInt1124; local37++) {
					Static113.aClass56Array15[local37] = Static113.aClass56Array15[local37 + 1];
					Static86.anIntArray195[local37] = Static86.anIntArray195[local37 + 1];
					Static3.aLongArray36[local37] = Static3.aLongArray36[local37 + 1];
					Static59.anIntArray133[local37] = Static59.anIntArray133[local37 + 1];
				}
				Static5.anInt69 = Static98.anInt2566 + 1;
				Static111.aClass3_Sub2_Sub1_4.method325(115);
				Static111.aClass3_Sub2_Sub1_4.method300(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIII[Lclient!td;IIIII)V")
	public static void method1708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class3_Sub1_Sub16[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		for (@Pc(3) int local3 = 0; local3 < arg4.length; local3++) {
			@Pc(9) Class3_Sub1_Sub16 local9 = arg4[local3];
			if (local9 != null && (local9.anInt2857 == 0 || local9.aBoolean142) && local9 != null && local9.anInt2845 == arg9 && !Static109.method1157(local9)) {
				@Pc(42) int local42 = local9.anInt2855 + arg5 - arg7;
				@Pc(50) int local50 = arg1 + local9.anInt2797 - arg0;
				@Pc(55) int local55 = local9.anInt2854 + local42;
				@Pc(62) int local62 = local42 > arg5 ? local42 : arg5;
				@Pc(67) int local67 = local9.anInt2827 + local50;
				@Pc(74) int local74 = arg1 < local50 ? local50 : arg1;
				@Pc(85) int local85 = arg6 > local55 ? local55 : arg6;
				@Pc(92) int local92 = local67 < arg3 ? local67 : arg3;
				if (local9.anInt2857 == 0) {
					method1708(local74 + local9.anInt2806 - local50, local74, arg2, local92, arg4, local62, local85, local62 + local9.anInt2842 - local42, arg8, local9.anInt2817);
					if (local9.aClass3_Sub1_Sub16Array2 != null) {
						method1708(local9.anInt2806 + local74 - local50, local74, arg2, local92, local9.aClass3_Sub1_Sub16Array2, local62, local85, local62 + local9.anInt2842 - local42, arg8, local9.anInt2817);
					}
				}
				if (local9.aBoolean142) {
					@Pc(165) boolean local165;
					if (Static36.anInt1021 >= local62 && local74 <= Static102.anInt3222 && local85 > Static36.anInt1021 && local92 > Static102.anInt3222) {
						local165 = true;
					} else {
						local165 = false;
					}
					@Pc(171) boolean local171 = false;
					if (Static31.anInt928 == 1 && local165) {
						local171 = true;
					}
					@Pc(180) boolean local180 = false;
					if (Static36.anInt1014 == 1 && local62 <= Static127.anInt3209 && Static71.anInt1970 >= local74 && Static127.anInt3209 < local85 && Static71.anInt1970 < local92) {
						local180 = true;
					}
					if (local180 && Static13.aClass3_Sub1_Sub16_1 == null && (arg8 & 0x200) != 0 && !Static122.aBoolean163 && Static50.method905(local9) != null) {
						Static25.aBoolean38 = false;
						Static27.anInt811 = Static127.anInt3209 - local62;
						Static16.anInt469 = 0;
						Static13.aClass3_Sub1_Sub16_1 = local9;
						Static43.anInt1150 = arg2;
						Static52.anInt1511 = Static71.anInt1970 - local74;
					}
					if (Static13.aClass3_Sub1_Sub16_1 != null || Static122.aBoolean163) {
						local171 = false;
						local180 = false;
						local165 = false;
					}
					if (!local9.aBoolean144 && local180 && (arg8 & 0x1) != 0) {
						local9.aBoolean144 = true;
						if (local9.anObjectArray12 != null) {
							Static56.method1067(local9, 0, null, local9.anObjectArray12, Static71.anInt1970 - local50, Static127.anInt3209 + -local42);
						}
					}
					if (local9.aBoolean144 && local171 && (arg8 & 0x4) != 0 && local9.anObjectArray5 != null) {
						Static56.method1067(local9, 0, null, local9.anObjectArray5, Static102.anInt3222 - local50, -local42 + Static36.anInt1021);
					}
					if (local9.aBoolean144 && !local171 && (arg8 & 0x2) != 0) {
						local9.aBoolean144 = false;
						if (local9.anObjectArray18 != null) {
							Static56.method1067(local9, 0, null, local9.anObjectArray18, Static102.anInt3222 - local50, -local42 + Static36.anInt1021);
						}
					}
					if (local171 && (arg8 & 0x8) != 0 && local9.anObjectArray3 != null) {
						Static56.method1067(local9, 0, null, local9.anObjectArray3, Static102.anInt3222 - local50, Static36.anInt1021 - local42);
					}
					if (!local9.aBoolean143 && local165 && (arg8 & 0x10) != 0) {
						local9.aBoolean143 = true;
						if (local9.anObjectArray20 != null) {
							Static56.method1067(local9, 0, null, local9.anObjectArray20, Static102.anInt3222 - local50, -local42 + Static36.anInt1021);
						}
					}
					if (local9.aBoolean143 && local165 && (arg8 & 0x40) != 0 && local9.anObjectArray11 != null) {
						Static56.method1067(local9, 0, null, local9.anObjectArray11, Static102.anInt3222 - local50, -local42 + Static36.anInt1021);
					}
					if (local9.aBoolean143 && !local165 && (arg8 & 0x20) != 0) {
						local9.aBoolean143 = false;
						if (local9.anObjectArray8 != null) {
							Static56.method1067(local9, 0, null, local9.anObjectArray8, Static102.anInt3222 - local50, Static36.anInt1021 - local42);
						}
					}
					if (local9.anObjectArray6 != null && (arg8 & 0x80) != 0) {
						Static56.method1067(local9, 0, null, local9.anObjectArray6, 0, 0);
					}
					if (local165 && Static71.anInt1968 != 0 && local9.anObjectArray13 != null && (arg8 & 0x400) != 0) {
						Static56.method1067(local9, 0, null, local9.anObjectArray13, Static71.anInt1968, 0);
					}
					if ((arg8 & 0x100) != 0) {
						if (Static5.anInt69 > local9.anInt2824 && local9.anObjectArray7 != null) {
							Static56.method1067(local9, 0, null, local9.anObjectArray7, 0, 0);
						}
						if (Static80.anInt2149 > local9.anInt2824 && local9.anObjectArray10 != null) {
							Static56.method1067(local9, 0, null, local9.anObjectArray10, 0, 0);
						}
						if (local9.anInt2824 < Static93.anInt2432 && local9.anObjectArray16 != null) {
							Static56.method1067(local9, 0, null, local9.anObjectArray16, 0, 0);
						}
						local9.anInt2824 = Static98.anInt2566;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIII)V")
	public static void method1709(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) Class3_Sub1_Sub16 local4 = Static42.method784(arg1, arg0);
		if (local4 != null && local4.anObjectArray17 != null) {
			Static56.method1067(local4, 0, null, local4.anObjectArray17, 0, 0);
		}
		Static18.anInt498 = arg1;
		Static93.aBoolean114 = true;
		Static34.anInt968 = arg0;
		Static63.anInt1819 = arg2;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)V")
	public static void method1710(@OriginalArg(1) int arg0) {
		if (Static57.anInt1621 == 0) {
			Static48.aClass3_Sub3_Sub2_2.method1233(arg0);
		} else {
			Static57.anInt1619 = arg0;
		}
	}
}
