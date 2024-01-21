import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!mb", name = "bb", descriptor = "[I")
	public static int[] anIntArray238;

	@OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
	public static int anInt2348 = 0;

	@OriginalMember(owner = "client!mb", name = "N", descriptor = "Lclient!kb;")
	public static Class46 aClass46_784 = Static65.method1172("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!mb", name = "Q", descriptor = "[[I")
	public static int[][] anIntArrayArray21 = new int[104][104];

	@OriginalMember(owner = "client!mb", name = "R", descriptor = "Lclient!kb;")
	public static Class46 aClass46_785 = Static65.method1172("VOLL");

	@OriginalMember(owner = "client!mb", name = "T", descriptor = "I")
	public static int anInt2352 = 0;

	@OriginalMember(owner = "client!mb", name = "U", descriptor = "Lclient!kb;")
	public static Class46 aClass46_786 = Static65.method1172("title_mute");

	@OriginalMember(owner = "client!mb", name = "X", descriptor = "Lclient!kb;")
	public static Class46 aClass46_787 = Static65.method1172("_");

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZJ)V")
	private static void method1593(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static25.anInt3983; local14++) {
			if (Static146.aLongArray3[local14] == arg0) {
				Static25.anInt3983--;
				for (@Pc(32) int local32 = local14; local32 < Static25.anInt3983; local32++) {
					Static146.aLongArray3[local32] = Static146.aLongArray3[local32 + 1];
					Static120.aClass46Array17[local32] = Static120.aClass46Array17[local32 + 1];
				}
				Static16.anInt418 = Static178.anInt3928;
				Static133.aClass3_Sub4_Sub1_3.method233(235);
				Static133.aClass3_Sub4_Sub1_3.method201(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!ld;I)V")
	public static void method1594(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub14 arg1) {
		@Pc(8) Object[] local8 = arg1.anObjectArray28;
		@Pc(22) int local22 = (Integer) local8[0];
		@Pc(26) Class3_Sub2_Sub6 local26 = Static41.method2657(local22);
		if (local26 == null) {
			return;
		}
		Static46.anInt1262 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = -1;
		@Pc(40) int[] local40 = local26.anIntArray132;
		@Pc(43) int[] local43 = local26.anIntArray135;
		@Pc(45) byte local45 = -1;
		@Pc(59) int local59;
		@Pc(72) int local72;
		try {
			@Pc(47) int local47 = 0;
			Static84.aClass46Array12 = new Class46[local26.anInt1415];
			Static63.anIntArray154 = new int[local26.anInt1410];
			@Pc(57) int local57 = 0;
			for (local59 = 1; local59 < local8.length; local59++) {
				if (local8[local59] instanceof Integer) {
					local72 = (Integer) local8[local59];
					if (local72 == -2147483647) {
						local72 = arg1.anInt2221;
					}
					if (local72 == -2147483646) {
						local72 = arg1.anInt2225;
					}
					if (local72 == -2147483645) {
						local72 = arg1.aClass33_10 == null ? -1 : arg1.aClass33_10.anInt1434;
					}
					if (local72 == -2147483644) {
						local72 = arg1.anInt2222;
					}
					if (local72 == -2147483643) {
						local72 = arg1.aClass33_10 == null ? -1 : arg1.aClass33_10.anInt1468;
					}
					if (local72 == -2147483642) {
						local72 = arg1.aClass33_9 == null ? -1 : arg1.aClass33_9.anInt1434;
					}
					if (local72 == -2147483641) {
						local72 = arg1.aClass33_9 == null ? -1 : arg1.aClass33_9.anInt1468;
					}
					if (local72 == -2147483640) {
						local72 = arg1.anInt2223;
					}
					if (local72 == -2147483639) {
						local72 = arg1.anInt2226;
					}
					Static63.anIntArray154[local47++] = local72;
				} else if (local8[local59] instanceof Class46) {
					@Pc(171) Class46 local171 = (Class46) local8[local59];
					if (local171.method1351(Static4.aClass46_1335)) {
						local171 = arg1.aClass46_756;
					}
					Static84.aClass46Array12[local57++] = local171;
				}
			}
			local72 = 0;
			label2190: while (true) {
				local72++;
				if (local72 > arg0) {
					throw new RuntimeException("slow");
				}
				local37++;
				@Pc(209) int local209 = local40[local37];
				@Pc(777) int local777;
				@Pc(629) int local629;
				@Pc(650) int local650;
				@Pc(772) int local772;
				@Pc(585) Class46 local585;
				if (local209 < 100) {
					if (local209 == 0) {
						Static179.anIntArray438[local33++] = local43[local37];
						continue;
					}
					@Pc(230) int local230;
					if (local209 == 1) {
						local230 = local43[local37];
						Static179.anIntArray438[local33++] = Static41.anIntArray419[local230];
						continue;
					}
					if (local209 == 2) {
						local230 = local43[local37];
						local33--;
						Static41.anIntArray419[local230] = Static179.anIntArray438[local33];
						continue;
					}
					if (local209 == 3) {
						Static116.aClass46Array16[local35++] = local26.aClass46Array8[local37];
						continue;
					}
					if (local209 == 6) {
						local37 += local43[local37];
						continue;
					}
					if (local209 == 7) {
						local33 -= 2;
						if (Static179.anIntArray438[local33] != Static179.anIntArray438[local33 + 1]) {
							local37 += local43[local37];
						}
						continue;
					}
					if (local209 == 8) {
						local33 -= 2;
						if (Static179.anIntArray438[local33 + 1] == Static179.anIntArray438[local33]) {
							local37 += local43[local37];
						}
						continue;
					}
					if (local209 == 9) {
						local33 -= 2;
						if (Static179.anIntArray438[local33 + 1] > Static179.anIntArray438[local33]) {
							local37 += local43[local37];
						}
						continue;
					}
					if (local209 == 10) {
						local33 -= 2;
						if (Static179.anIntArray438[local33 + 1] < Static179.anIntArray438[local33]) {
							local37 += local43[local37];
						}
						continue;
					}
					if (local209 == 21) {
						if (Static46.anInt1262 == 0) {
							return;
						}
						@Pc(406) Class52 local406 = Static107.aClass52Array1[--Static46.anInt1262];
						local37 = local406.anInt2294;
						Static63.anIntArray154 = local406.anIntArray233;
						local26 = local406.aClass3_Sub2_Sub6_1;
						Static84.aClass46Array12 = local406.aClass46Array13;
						local40 = local26.anIntArray132;
						local43 = local26.anIntArray135;
						continue;
					}
					if (local209 == 25) {
						local230 = local43[local37];
						Static179.anIntArray438[local33++] = Static20.method401(local230);
						continue;
					}
					if (local209 == 27) {
						local230 = local43[local37];
						local33--;
						Static49.method993(Static179.anIntArray438[local33], local230);
						continue;
					}
					if (local209 == 31) {
						local33 -= 2;
						if (Static179.anIntArray438[local33 + 1] >= Static179.anIntArray438[local33]) {
							local37 += local43[local37];
						}
						continue;
					}
					if (local209 == 32) {
						local33 -= 2;
						if (Static179.anIntArray438[local33 + 1] <= Static179.anIntArray438[local33]) {
							local37 += local43[local37];
						}
						continue;
					}
					if (local209 == 33) {
						Static179.anIntArray438[local33++] = Static63.anIntArray154[local43[local37]];
						continue;
					}
					@Pc(529) int local529;
					if (local209 == 34) {
						local529 = local43[local37];
						local33--;
						Static63.anIntArray154[local529] = Static179.anIntArray438[local33];
						continue;
					}
					if (local209 == 35) {
						Static116.aClass46Array16[local35++] = Static84.aClass46Array12[local43[local37]];
						continue;
					}
					if (local209 == 36) {
						local529 = local43[local37];
						local35--;
						Static84.aClass46Array12[local529] = Static116.aClass46Array16[local35];
						continue;
					}
					if (local209 == 37) {
						local230 = local43[local37];
						local35 -= local230;
						local585 = Static62.method1138(local35, Static116.aClass46Array16, local230);
						Static116.aClass46Array16[local35++] = local585;
						continue;
					}
					if (local209 == 38) {
						local33--;
						continue;
					}
					if (local209 == 39) {
						local35--;
						continue;
					}
					if (local209 == 40) {
						local230 = local43[local37];
						@Pc(619) Class3_Sub2_Sub6 local619 = Static41.method2657(local230);
						@Pc(623) Class46[] local623 = new Class46[local619.anInt1415];
						@Pc(627) int[] local627 = new int[local619.anInt1410];
						for (local629 = 0; local629 < local619.anInt1406; local629++) {
							local627[local629] = Static179.anIntArray438[local33 + local629 - local619.anInt1406];
						}
						for (local650 = 0; local650 < local619.anInt1409; local650++) {
							local623[local650] = Static116.aClass46Array16[local650 + local35 - local619.anInt1409];
						}
						local35 -= local619.anInt1409;
						local33 -= local619.anInt1406;
						@Pc(683) Class52 local683 = new Class52();
						local683.anInt2294 = local37;
						local683.aClass46Array13 = Static84.aClass46Array12;
						local683.aClass3_Sub2_Sub6_1 = local26;
						local683.anIntArray233 = Static63.anIntArray154;
						if (Static46.anInt1262 >= Static107.aClass52Array1.length) {
							throw new RuntimeException();
						}
						local37 = -1;
						local26 = local619;
						Static107.aClass52Array1[Static46.anInt1262++] = local683;
						local43 = local619.anIntArray135;
						Static63.anIntArray154 = local627;
						local40 = local619.anIntArray132;
						Static84.aClass46Array12 = local623;
						continue;
					}
					if (local209 == 42) {
						Static179.anIntArray438[local33++] = Static90.anIntArray227[local43[local37]];
						continue;
					}
					if (local209 == 43) {
						local529 = local43[local37];
						local33--;
						Static90.anIntArray227[local529] = Static179.anIntArray438[local33];
						continue;
					}
					if (local209 == 44) {
						local230 = local43[local37] >> 16;
						local772 = local43[local37] & 0xFFFF;
						local33--;
						local777 = Static179.anIntArray438[local33];
						if (local777 >= 0 && local777 <= 5000) {
							Static137.anIntArray369[local230] = local777;
							@Pc(792) byte local792 = -1;
							if (local772 == 105) {
								local792 = 0;
							}
							local629 = 0;
							while (true) {
								if (local777 <= local629) {
									continue label2190;
								}
								Static118.anIntArrayArray32[local230][local629] = local792;
								local629++;
							}
						}
						throw new RuntimeException();
					}
					if (local209 == 45) {
						local230 = local43[local37];
						local33--;
						local772 = Static179.anIntArray438[local33];
						if (local772 >= 0 && local772 < Static137.anIntArray369[local230]) {
							Static179.anIntArray438[local33++] = Static118.anIntArrayArray32[local230][local772];
							continue;
						}
						throw new RuntimeException();
					}
					if (local209 == 46) {
						local230 = local43[local37];
						local33 -= 2;
						local772 = Static179.anIntArray438[local33];
						if (local772 >= 0 && Static137.anIntArray369[local230] > local772) {
							Static118.anIntArrayArray32[local230][local772] = Static179.anIntArray438[local33 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local209 == 47) {
						@Pc(911) Class46 local911 = Static167.aClass46Array3[local43[local37]];
						if (local911 == null) {
							local911 = Static40.aClass46_371;
						}
						Static116.aClass46Array16[local35++] = local911;
						continue;
					}
					if (local209 == 48) {
						local529 = local43[local37];
						local35--;
						Static167.aClass46Array3[local529] = Static116.aClass46Array16[local35];
						continue;
					}
				}
				@Pc(947) boolean local947;
				if (local43[local37] == 1) {
					local947 = true;
				} else {
					local947 = false;
				}
				@Pc(1099) Class33 local1099;
				@Pc(976) int local976;
				@Pc(1007) int local1007;
				@Pc(986) Class33 local986;
				@Pc(1169) Class33 local1169;
				if (local209 < 1000) {
					if (local209 == 100) {
						local33 -= 3;
						local772 = Static179.anIntArray438[local33];
						local777 = Static179.anIntArray438[local33 + 1];
						local976 = Static179.anIntArray438[local33 + 2];
						if (local777 == 0) {
							throw new RuntimeException();
						}
						local986 = Static179.method2873(local772);
						if (local986.aClass33Array2 == null) {
							local986.aClass33Array2 = new Class33[local976 + 1];
						}
						if (local976 >= local986.aClass33Array2.length) {
							@Pc(1005) Class33[] local1005 = new Class33[local976 + 1];
							for (local1007 = 0; local1007 < local986.aClass33Array2.length; local1007++) {
								local1005[local1007] = local986.aClass33Array2[local1007];
							}
							local986.aClass33Array2 = local1005;
						}
						if (local976 > 0 && local986.aClass33Array2[local976 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local976 - 1));
						}
						@Pc(1054) Class33 local1054 = new Class33();
						local1054.anInt1479 = local1054.anInt1434 = local986.anInt1434;
						local1054.anInt1441 = local777;
						local1054.aBoolean50 = true;
						local1054.anInt1468 = local976;
						local986.aClass33Array2[local976] = local1054;
						if (local947) {
							Static74.aClass33_8 = local1054;
						} else {
							Static162.aClass33_14 = local1054;
						}
						Static142.method2373(local986);
						continue;
					}
					@Pc(1121) Class33 local1121;
					if (local209 == 101) {
						local1099 = local947 ? Static74.aClass33_8 : Static162.aClass33_14;
						if (local1099.anInt1468 == -1) {
							if (!local947) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local1121 = Static179.method2873(local1099.anInt1434);
						local1121.aClass33Array2[local1099.anInt1468] = null;
						Static142.method2373(local1121);
						continue;
					}
					if (local209 == 102) {
						local33--;
						local1099 = Static179.method2873(Static179.anIntArray438[local33]);
						local1099.aClass33Array2 = null;
						Static142.method2373(local1099);
						continue;
					}
					if (local209 == 200) {
						local33 -= 2;
						local772 = Static179.anIntArray438[local33];
						local777 = Static179.anIntArray438[local33 + 1];
						local1169 = Static98.method1607(local777, local772);
						if (local1169 != null && local777 != -1) {
							Static179.anIntArray438[local33++] = 1;
							if (local947) {
								Static74.aClass33_8 = local1169;
							} else {
								Static162.aClass33_14 = local1169;
							}
							continue;
						}
						Static179.anIntArray438[local33++] = 0;
						continue;
					}
					if (local209 == 201) {
						local33--;
						local772 = Static179.anIntArray438[local33];
						local1121 = Static179.method2873(local772);
						if (local1121 == null) {
							Static179.anIntArray438[local33++] = 0;
						} else {
							Static179.anIntArray438[local33++] = 1;
							if (local947) {
								Static74.aClass33_8 = local1121;
							} else {
								Static162.aClass33_14 = local1121;
							}
						}
						continue;
					}
				} else if ((local209 < 1000 || local209 >= 1100) && (local209 < 2000 || local209 >= 2100)) {
					@Pc(1438) Class46 local1438;
					if (local209 >= 1100 && local209 < 1200 || local209 >= 2100 && local209 < 2200) {
						if (local209 >= 2000) {
							local209 -= 1000;
							local33--;
							local1099 = Static179.method2873(Static179.anIntArray438[local33]);
						} else {
							local1099 = local947 ? Static74.aClass33_8 : Static162.aClass33_14;
						}
						if (local209 == 1100) {
							local33 -= 2;
							local1099.anInt1465 = Static179.anIntArray438[local33];
							if (local1099.anInt1465 > local1099.anInt1484 - local1099.anInt1424) {
								local1099.anInt1465 = local1099.anInt1484 - local1099.anInt1424;
							}
							if (local1099.anInt1465 < 0) {
								local1099.anInt1465 = 0;
							}
							local1099.anInt1486 = Static179.anIntArray438[local33 + 1];
							if (local1099.anInt1486 > local1099.anInt1455 - local1099.anInt1428) {
								local1099.anInt1486 = local1099.anInt1455 - local1099.anInt1428;
							}
							if (local1099.anInt1486 < 0) {
								local1099.anInt1486 = 0;
							}
							Static142.method2373(local1099);
							continue;
						}
						if (local209 == 1101) {
							local33--;
							local1099.anInt1488 = Static179.anIntArray438[local33];
							Static142.method2373(local1099);
							continue;
						}
						if (local209 == 1102) {
							local33--;
							local1099.aBoolean47 = Static179.anIntArray438[local33] == 1;
							Static142.method2373(local1099);
							continue;
						}
						if (local209 == 1103) {
							local33--;
							local1099.anInt1492 = Static179.anIntArray438[local33];
							Static142.method2373(local1099);
							continue;
						}
						if (local209 == 1104) {
							local33--;
							local1099.anInt1439 = Static179.anIntArray438[local33];
							Static142.method2373(local1099);
							continue;
						}
						if (local209 == 1105) {
							local33--;
							local1099.anInt1448 = Static179.anIntArray438[local33];
							Static142.method2373(local1099);
							continue;
						}
						if (local209 == 1106) {
							local33--;
							local1099.anInt1475 = Static179.anIntArray438[local33];
							Static142.method2373(local1099);
							continue;
						}
						if (local209 == 1107) {
							local33--;
							local1099.aBoolean45 = Static179.anIntArray438[local33] == 1;
							Static142.method2373(local1099);
							continue;
						}
						if (local209 == 1108) {
							local1099.anInt1494 = 1;
							local33--;
							local1099.anInt1418 = Static179.anIntArray438[local33];
							Static142.method2373(local1099);
							continue;
						}
						if (local209 == 1109) {
							local33 -= 6;
							local1099.anInt1477 = Static179.anIntArray438[local33];
							local1099.anInt1430 = Static179.anIntArray438[local33 + 1];
							local1099.anInt1460 = Static179.anIntArray438[local33 + 2];
							local1099.anInt1485 = Static179.anIntArray438[local33 + 3];
							local1099.anInt1496 = Static179.anIntArray438[local33 + 4];
							local1099.anInt1444 = Static179.anIntArray438[local33 + 5];
							Static142.method2373(local1099);
							continue;
						}
						if (local209 == 1110) {
							local33--;
							local777 = Static179.anIntArray438[local33];
							if (local1099.anInt1493 != local777) {
								local1099.anInt1493 = local777;
								local1099.anInt1423 = 0;
								local1099.anInt1483 = 0;
								Static142.method2373(local1099);
							}
							continue;
						}
						if (local209 == 1111) {
							local33--;
							local1099.aBoolean51 = Static179.anIntArray438[local33] == 1;
							Static142.method2373(local1099);
							continue;
						}
						if (local209 == 1112) {
							local35--;
							local1438 = Static116.aClass46Array16[local35];
							if (!local1438.method1351(local1099.aClass46_486)) {
								local1099.aClass46_486 = local1438;
								Static142.method2373(local1099);
							}
							continue;
						}
						if (local209 == 1113) {
							local33--;
							local1099.anInt1427 = Static179.anIntArray438[local33];
							Static142.method2373(local1099);
							continue;
						}
						if (local209 == 1114) {
							local33 -= 3;
							local1099.anInt1454 = Static179.anIntArray438[local33];
							local1099.anInt1478 = Static179.anIntArray438[local33 + 1];
							local1099.anInt1452 = Static179.anIntArray438[local33 + 2];
							Static142.method2373(local1099);
							continue;
						}
						if (local209 == 1115) {
							local33--;
							local1099.aBoolean44 = Static179.anIntArray438[local33] == 1;
							Static142.method2373(local1099);
							continue;
						}
						if (local209 == 1116) {
							local33--;
							local1099.anInt1426 = Static179.anIntArray438[local33];
							Static142.method2373(local1099);
							continue;
						}
						if (local209 == 1117) {
							local33--;
							local1099.anInt1482 = Static179.anIntArray438[local33];
							Static142.method2373(local1099);
							continue;
						}
						if (local209 == 1118) {
							local33--;
							local1099.aBoolean48 = Static179.anIntArray438[local33] == 1;
							Static142.method2373(local1099);
							continue;
						}
						if (local209 == 1119) {
							local33--;
							local1099.aBoolean43 = Static179.anIntArray438[local33] == 1;
							Static142.method2373(local1099);
							continue;
						}
						if (local209 == 1120) {
							local33 -= 2;
							local1099.anInt1484 = Static179.anIntArray438[local33];
							local1099.anInt1455 = Static179.anIntArray438[local33 + 1];
							Static142.method2373(local1099);
							continue;
						}
					} else if (local209 >= 1200 && local209 < 1300 || !(local209 < 2200 || local209 >= 2300)) {
						if (local209 < 2000) {
							local1099 = local947 ? Static74.aClass33_8 : Static162.aClass33_14;
						} else {
							local209 -= 1000;
							local33--;
							local1099 = Static179.method2873(Static179.anIntArray438[local33]);
						}
						Static142.method2373(local1099);
						if (local209 == 1200) {
							local33 -= 2;
							local777 = Static179.anIntArray438[local33];
							local976 = Static179.anIntArray438[local33 + 1];
							local1099.anInt1471 = local976;
							local1099.anInt1419 = local777;
							@Pc(7203) Class3_Sub2_Sub14 local7203 = Static146.method2432(local777);
							local1099.anInt1496 = local7203.anInt3316;
							local1099.anInt1430 = local7203.anInt3314;
							local1099.anInt1477 = local7203.anInt3346;
							local1099.anInt1444 = local7203.anInt3309;
							if (local1099.anInt1424 > 0) {
								local1099.anInt1444 = local1099.anInt1444 * 32 / local1099.anInt1424;
							}
							local1099.anInt1460 = local7203.anInt3323;
							local1099.anInt1485 = local7203.anInt3322;
							continue;
						}
						if (local209 == 1201) {
							local1099.anInt1494 = 2;
							local33--;
							local1099.anInt1418 = Static179.anIntArray438[local33];
							continue;
						}
						if (local209 == 1202) {
							local1099.anInt1494 = 3;
							local1099.anInt1418 = Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.aClass64_1.method2118();
							continue;
						}
						if (local209 == 1203) {
							local1099.anInt1494 = 6;
							local33--;
							local1099.anInt1418 = Static179.anIntArray438[local33];
							continue;
						}
						if (local209 == 1204) {
							local1099.anInt1494 = 5;
							local33--;
							local1099.anInt1418 = Static179.anIntArray438[local33];
							continue;
						}
					} else if ((local209 < 1300 || local209 >= 1400) && (local209 < 2300 || local209 >= 2400)) {
						if (local209 >= 1400 && local209 < 1500 || local209 >= 2400 && local209 < 2500) {
							if (local209 < 2000) {
								local1099 = local947 ? Static74.aClass33_8 : Static162.aClass33_14;
							} else {
								local33--;
								local1099 = Static179.method2873(Static179.anIntArray438[local33]);
								local209 -= 1000;
							}
							local35--;
							local1438 = Static116.aClass46Array16[local35];
							@Pc(1440) int[] local1440 = null;
							if (local1438.method1376() > 0 && local1438.method1357(local1438.method1376() - 1) == 89) {
								local33--;
								local629 = Static179.anIntArray438[local33];
								if (local629 > 0) {
									local1440 = new int[local629];
									while (local629-- > 0) {
										local33--;
										local1440[local629] = Static179.anIntArray438[local33];
									}
								}
								local1438 = local1438.method1363(local1438.method1376() - 1, 0);
							}
							@Pc(1496) Object[] local1496 = new Object[local1438.method1376() + 1];
							for (local650 = local1496.length - 1; local650 >= 1; local650--) {
								if (local1438.method1357(local650 - 1) == 115) {
									local35--;
									local1496[local650] = Static116.aClass46Array16[local35];
								} else {
									local33--;
									local1496[local650] = Integer.valueOf(Static179.anIntArray438[local33]);
								}
							}
							local33--;
							local1007 = Static179.anIntArray438[local33];
							if (local1007 == -1) {
								local1496 = null;
							} else {
								local1496[0] = Integer.valueOf(local1007);
							}
							if (local209 == 1414) {
								local1099.anIntArray140 = local1440;
								local1099.anObjectArray2 = local1496;
							}
							if (local209 == 1423) {
								local1099.anObjectArray15 = local1496;
							}
							if (local209 == 1418) {
								local1099.anObjectArray11 = local1496;
							}
							if (local209 == 1425) {
								local1099.anObjectArray3 = local1496;
							}
							if (local209 == 1416) {
								local1099.anObjectArray20 = local1496;
							}
							if (local209 == 1421) {
								local1099.anObjectArray6 = local1496;
							}
							if (local209 == 1406) {
								local1099.anObjectArray18 = local1496;
							}
							if (local209 == 1424) {
								local1099.anObjectArray4 = local1496;
							}
							if (local209 == 1419) {
								local1099.anObjectArray12 = local1496;
							}
							local1099.aBoolean52 = true;
							if (local209 == 1422) {
								local1099.anObjectArray17 = local1496;
							}
							if (local209 == 1403) {
								local1099.anObjectArray21 = local1496;
							}
							if (local209 == 1408) {
								local1099.anObjectArray1 = local1496;
							}
							if (local209 == 1420) {
								local1099.anObjectArray10 = local1496;
							}
							if (local209 == 1409) {
								local1099.anObjectArray7 = local1496;
							}
							if (local209 == 1411) {
								local1099.anObjectArray9 = local1496;
							}
							if (local209 == 1417) {
								local1099.anObjectArray19 = local1496;
							}
							if (local209 == 1404) {
								local1099.anObjectArray22 = local1496;
							}
							if (local209 == 1415) {
								local1099.anObjectArray5 = local1496;
								local1099.anIntArray139 = local1440;
							}
							if (local209 == 1405) {
								local1099.anObjectArray25 = local1496;
							}
							if (local209 == 1402) {
								local1099.anObjectArray8 = local1496;
							}
							if (local209 == 1410) {
								local1099.anObjectArray14 = local1496;
							}
							if (local209 == 1412) {
								local1099.anObjectArray13 = local1496;
							}
							if (local209 == 1407) {
								local1099.anIntArray137 = local1440;
								local1099.anObjectArray16 = local1496;
							}
							if (local209 == 1401) {
								local1099.anObjectArray24 = local1496;
							}
							if (local209 == 1400) {
								local1099.anObjectArray26 = local1496;
							}
							continue;
						}
						if (local209 < 1600) {
							local1099 = local947 ? Static74.aClass33_8 : Static162.aClass33_14;
							if (local209 == 1500) {
								Static179.anIntArray438[local33++] = local1099.anInt1461;
								continue;
							}
							if (local209 == 1501) {
								Static179.anIntArray438[local33++] = local1099.anInt1449;
								continue;
							}
							if (local209 == 1502) {
								Static179.anIntArray438[local33++] = local1099.anInt1424;
								continue;
							}
							if (local209 == 1503) {
								Static179.anIntArray438[local33++] = local1099.anInt1428;
								continue;
							}
							if (local209 == 1504) {
								Static179.anIntArray438[local33++] = local1099.aBoolean46 ? 1 : 0;
								continue;
							}
							if (local209 == 1505) {
								Static179.anIntArray438[local33++] = local1099.anInt1479;
								continue;
							}
						} else if (local209 < 1700) {
							local1099 = local947 ? Static74.aClass33_8 : Static162.aClass33_14;
							if (local209 == 1600) {
								Static179.anIntArray438[local33++] = local1099.anInt1465;
								continue;
							}
							if (local209 == 1601) {
								Static179.anIntArray438[local33++] = local1099.anInt1486;
								continue;
							}
							if (local209 == 1602) {
								Static116.aClass46Array16[local35++] = local1099.aClass46_486;
								continue;
							}
							if (local209 == 1603) {
								Static179.anIntArray438[local33++] = local1099.anInt1484;
								continue;
							}
							if (local209 == 1604) {
								Static179.anIntArray438[local33++] = local1099.anInt1455;
								continue;
							}
							if (local209 == 1605) {
								Static179.anIntArray438[local33++] = local1099.anInt1444;
								continue;
							}
							if (local209 == 1606) {
								Static179.anIntArray438[local33++] = local1099.anInt1460;
								continue;
							}
							if (local209 == 1607) {
								Static179.anIntArray438[local33++] = local1099.anInt1496;
								continue;
							}
							if (local209 == 1608) {
								Static179.anIntArray438[local33++] = local1099.anInt1485;
								continue;
							}
							if (local209 == 1609) {
								Static179.anIntArray438[local33++] = local1099.anInt1492;
								continue;
							}
						} else if (local209 < 1800) {
							local1099 = local947 ? Static74.aClass33_8 : Static162.aClass33_14;
							if (local209 == 1700) {
								Static179.anIntArray438[local33++] = local1099.anInt1419;
								continue;
							}
							if (local209 == 1701) {
								if (local1099.anInt1419 == -1) {
									Static179.anIntArray438[local33++] = 0;
								} else {
									Static179.anIntArray438[local33++] = local1099.anInt1471;
								}
								continue;
							}
							if (local209 == 1702) {
								Static179.anIntArray438[local33++] = local1099.anInt1468;
								continue;
							}
						} else if (local209 < 1900) {
							local1099 = local947 ? Static74.aClass33_8 : Static162.aClass33_14;
							if (local209 == 1800) {
								Static179.anIntArray438[local33++] = Static140.method221(Static157.method2541(local1099));
								continue;
							}
							if (local209 == 1801) {
								local33--;
								local777 = Static179.anIntArray438[local33];
								local777--;
								if (local1099.aClass46Array10 != null && local777 < local1099.aClass46Array10.length && local1099.aClass46Array10[local777] != null) {
									Static116.aClass46Array16[local35++] = local1099.aClass46Array10[local777];
									continue;
								}
								Static116.aClass46Array16[local35++] = Static47.aClass46_419;
								continue;
							}
							if (local209 == 1802) {
								if (local1099.aClass46_482 == null) {
									Static116.aClass46Array16[local35++] = Static47.aClass46_419;
								} else {
									Static116.aClass46Array16[local35++] = local1099.aClass46_482;
								}
								continue;
							}
						} else if (local209 < 2600) {
							local33--;
							local1099 = Static179.method2873(Static179.anIntArray438[local33]);
							if (local209 == 2500) {
								Static179.anIntArray438[local33++] = local1099.anInt1461;
								continue;
							}
							if (local209 == 2501) {
								Static179.anIntArray438[local33++] = local1099.anInt1449;
								continue;
							}
							if (local209 == 2502) {
								Static179.anIntArray438[local33++] = local1099.anInt1424;
								continue;
							}
							if (local209 == 2503) {
								Static179.anIntArray438[local33++] = local1099.anInt1428;
								continue;
							}
							if (local209 == 2504) {
								Static179.anIntArray438[local33++] = local1099.aBoolean46 ? 1 : 0;
								continue;
							}
							if (local209 == 2505) {
								Static179.anIntArray438[local33++] = local1099.anInt1479;
								continue;
							}
						} else if (local209 < 2700) {
							local33--;
							local1099 = Static179.method2873(Static179.anIntArray438[local33]);
							if (local209 == 2600) {
								Static179.anIntArray438[local33++] = local1099.anInt1465;
								continue;
							}
							if (local209 == 2601) {
								Static179.anIntArray438[local33++] = local1099.anInt1486;
								continue;
							}
							if (local209 == 2602) {
								Static116.aClass46Array16[local35++] = local1099.aClass46_486;
								continue;
							}
							if (local209 == 2603) {
								Static179.anIntArray438[local33++] = local1099.anInt1484;
								continue;
							}
							if (local209 == 2604) {
								Static179.anIntArray438[local33++] = local1099.anInt1455;
								continue;
							}
							if (local209 == 2605) {
								Static179.anIntArray438[local33++] = local1099.anInt1444;
								continue;
							}
							if (local209 == 2606) {
								Static179.anIntArray438[local33++] = local1099.anInt1460;
								continue;
							}
							if (local209 == 2607) {
								Static179.anIntArray438[local33++] = local1099.anInt1496;
								continue;
							}
							if (local209 == 2608) {
								Static179.anIntArray438[local33++] = local1099.anInt1485;
								continue;
							}
							if (local209 == 2609) {
								Static179.anIntArray438[local33++] = local1099.anInt1492;
								continue;
							}
						} else if (local209 < 2800) {
							if (local209 == 2700) {
								local33--;
								local1099 = Static179.method2873(Static179.anIntArray438[local33]);
								Static179.anIntArray438[local33++] = local1099.anInt1419;
								continue;
							}
							if (local209 == 2701) {
								local33--;
								local1099 = Static179.method2873(Static179.anIntArray438[local33]);
								if (local1099.anInt1419 == -1) {
									Static179.anIntArray438[local33++] = 0;
								} else {
									Static179.anIntArray438[local33++] = local1099.anInt1471;
								}
								continue;
							}
							if (local209 == 2702) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								@Pc(2009) Class3_Sub12 local2009 = (Class3_Sub12) Static129.aClass54_10.method1602((long) local772);
								if (local2009 == null) {
									Static179.anIntArray438[local33++] = 0;
								} else {
									Static179.anIntArray438[local33++] = 1;
								}
								continue;
							}
							if (local209 == 2703) {
								local33--;
								local1099 = Static179.method2873(Static179.anIntArray438[local33]);
								if (local1099.aClass33Array2 == null) {
									Static179.anIntArray438[local33++] = 0;
									continue;
								}
								local777 = local1099.aClass33Array2.length;
								for (local976 = 0; local976 < local1099.aClass33Array2.length; local976++) {
									if (local1099.aClass33Array2[local976] == null) {
										local777 = local976;
										break;
									}
								}
								Static179.anIntArray438[local33++] = local777;
								continue;
							}
							if (local209 == 2704 || local209 == 2705) {
								local33 -= 2;
								local772 = Static179.anIntArray438[local33];
								local777 = Static179.anIntArray438[local33 + 1];
								@Pc(2107) Class3_Sub12 local2107 = (Class3_Sub12) Static129.aClass54_10.method1602((long) local772);
								if (local2107 != null && local2107.anInt1766 == local777) {
									Static179.anIntArray438[local33++] = 1;
									continue;
								}
								Static179.anIntArray438[local33++] = 0;
								continue;
							}
						} else if (local209 < 2900) {
							local33--;
							local1099 = Static179.method2873(Static179.anIntArray438[local33]);
							if (local209 == 2800) {
								Static179.anIntArray438[local33++] = Static140.method221(Static157.method2541(local1099));
								continue;
							}
							if (local209 == 2801) {
								local33--;
								local777 = Static179.anIntArray438[local33];
								local777--;
								if (local1099.aClass46Array10 != null && local777 < local1099.aClass46Array10.length && local1099.aClass46Array10[local777] != null) {
									Static116.aClass46Array16[local35++] = local1099.aClass46Array10[local777];
									continue;
								}
								Static116.aClass46Array16[local35++] = Static47.aClass46_419;
								continue;
							}
							if (local209 == 2802) {
								if (local1099.aClass46_482 == null) {
									Static116.aClass46Array16[local35++] = Static47.aClass46_419;
								} else {
									Static116.aClass46Array16[local35++] = local1099.aClass46_482;
								}
								continue;
							}
						} else if (local209 < 3200) {
							if (local209 == 3100) {
								local35--;
								local585 = Static116.aClass46Array16[local35];
								Static168.method2686(0, Static47.aClass46_419, local585);
								continue;
							}
							if (local209 == 3101) {
								local33 -= 2;
								Static163.method2611(Static179.anIntArray438[local33 + 1], Static179.anIntArray438[local33], Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1);
								continue;
							}
							if (local209 == 3103) {
								Static16.method323();
								continue;
							}
							if (local209 == 3104) {
								local35--;
								local585 = Static116.aClass46Array16[local35];
								local777 = 0;
								if (local585.method1356()) {
									local777 = local585.method1386();
								}
								Static133.aClass3_Sub4_Sub1_3.method233(254);
								Static133.aClass3_Sub4_Sub1_3.method188(local777);
								continue;
							}
							if (local209 == 3105) {
								local35--;
								local585 = Static116.aClass46Array16[local35];
								Static133.aClass3_Sub4_Sub1_3.method233(76);
								Static133.aClass3_Sub4_Sub1_3.method201(local585.method1348());
								continue;
							}
							if (local209 == 3106) {
								local35--;
								local585 = Static116.aClass46Array16[local35];
								Static133.aClass3_Sub4_Sub1_3.method233(141);
								Static133.aClass3_Sub4_Sub1_3.method206(local585.method1376() + 1);
								Static133.aClass3_Sub4_Sub1_3.method189(local585);
								continue;
							}
							if (local209 == 3107) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								local35--;
								local1438 = Static116.aClass46Array16[local35];
								Static19.method365(local772, local1438);
								continue;
							}
							if (local209 == 3108) {
								local33 -= 3;
								local777 = Static179.anIntArray438[local33 + 1];
								local772 = Static179.anIntArray438[local33];
								local976 = Static179.anIntArray438[local33 + 2];
								local986 = Static179.method2873(local976);
								Static33.method584(local777, local986, local772);
								continue;
							}
							if (local209 == 3109) {
								local33 -= 2;
								local772 = Static179.anIntArray438[local33];
								local1169 = local947 ? Static74.aClass33_8 : Static162.aClass33_14;
								local777 = Static179.anIntArray438[local33 + 1];
								Static33.method584(local777, local1169, local772);
								continue;
							}
							if (local209 == 3110) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								Static133.aClass3_Sub4_Sub1_3.method233(225);
								Static133.aClass3_Sub4_Sub1_3.method198(local772);
								continue;
							}
						} else if (local209 < 3300) {
							if (local209 == 3200) {
								local33 -= 3;
								Static13.method292(Static179.anIntArray438[local33 + 1], Static179.anIntArray438[local33 + 2], Static179.anIntArray438[local33]);
								continue;
							}
							if (local209 == 3201) {
								local33--;
								Static60.method1125(Static179.anIntArray438[local33]);
								continue;
							}
							if (local209 == 3202) {
								local33 -= 2;
								Static21.method2166(Static179.anIntArray438[local33], Static179.anIntArray438[local33 + 1]);
								continue;
							}
						} else if (local209 < 3400) {
							if (local209 == 3300) {
								Static179.anIntArray438[local33++] = Static20.anInt512;
								continue;
							}
							if (local209 == 3301) {
								local33 -= 2;
								local772 = Static179.anIntArray438[local33];
								local777 = Static179.anIntArray438[local33 + 1];
								Static179.anIntArray438[local33++] = Static30.method518(local777, local772);
								continue;
							}
							if (local209 == 3302) {
								local33 -= 2;
								local772 = Static179.anIntArray438[local33];
								local777 = Static179.anIntArray438[local33 + 1];
								Static179.anIntArray438[local33++] = Static175.method2758(local777, local772);
								continue;
							}
							if (local209 == 3303) {
								local33 -= 2;
								local772 = Static179.anIntArray438[local33];
								local777 = Static179.anIntArray438[local33 + 1];
								Static179.anIntArray438[local33++] = Static60.method1126(local772, local777);
								continue;
							}
							if (local209 == 3304) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								Static179.anIntArray438[local33++] = Static97.method1169(local772).anInt3969;
								continue;
							}
							if (local209 == 3305) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								Static179.anIntArray438[local33++] = Static159.anIntArray403[local772];
								continue;
							}
							if (local209 == 3306) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								Static179.anIntArray438[local33++] = Static12.anIntArray440[local772];
								continue;
							}
							if (local209 == 3307) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								Static179.anIntArray438[local33++] = Static163.anIntArray409[local772];
								continue;
							}
							if (local209 == 3308) {
								local976 = (Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1711 >> 7) + Static58.anInt1578;
								local777 = (Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1700 >> 7) + Static42.anInt1173;
								local772 = Static99.anInt2422;
								Static179.anIntArray438[local33++] = (local772 << 28) + (local777 << 14) + local976;
								continue;
							}
							if (local209 == 3309) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								Static179.anIntArray438[local33++] = local772 >> 14 & 0x3FFF;
								continue;
							}
							if (local209 == 3310) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								Static179.anIntArray438[local33++] = local772 >> 28;
								continue;
							}
							if (local209 == 3311) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								Static179.anIntArray438[local33++] = local772 & 0x3FFF;
								continue;
							}
							if (local209 == 3312) {
								Static179.anIntArray438[local33++] = Static52.aBoolean41 ? 1 : 0;
								continue;
							}
							if (local209 == 3313) {
								local33 -= 2;
								local772 = Static179.anIntArray438[local33] + 32768;
								local777 = Static179.anIntArray438[local33 + 1];
								Static179.anIntArray438[local33++] = Static30.method518(local777, local772);
								continue;
							}
							if (local209 == 3314) {
								local33 -= 2;
								local777 = Static179.anIntArray438[local33 + 1];
								local772 = Static179.anIntArray438[local33] + 32768;
								Static179.anIntArray438[local33++] = Static175.method2758(local777, local772);
								continue;
							}
							if (local209 == 3315) {
								local33 -= 2;
								local772 = Static179.anIntArray438[local33] + 32768;
								local777 = Static179.anIntArray438[local33 + 1];
								Static179.anIntArray438[local33++] = Static60.method1126(local772, local777);
								continue;
							}
							if (local209 == 3316) {
								if (Static38.anInt1076 >= 2) {
									Static179.anIntArray438[local33++] = Static38.anInt1076;
								} else {
									Static179.anIntArray438[local33++] = 0;
								}
								continue;
							}
							if (local209 == 3317) {
								Static179.anIntArray438[local33++] = Static163.anInt3623;
								continue;
							}
							if (local209 == 3318) {
								Static179.anIntArray438[local33++] = Static179.anInt3950;
								continue;
							}
							if (local209 == 3321) {
								Static179.anIntArray438[local33++] = Static16.anInt413;
								continue;
							}
							if (local209 == 3322) {
								Static179.anIntArray438[local33++] = Static26.anInt600;
								continue;
							}
							if (local209 == 3323) {
								if (Static38.anInt1076 == 1) {
									Static179.anIntArray438[local33++] = 1;
								} else {
									Static179.anIntArray438[local33++] = 0;
								}
								continue;
							}
							if (local209 == 3324) {
								if (Static106.anInt2534 >= 5 && Static106.anInt2534 <= 9) {
									Static179.anIntArray438[local33++] = Static106.anInt2534;
									continue;
								}
								Static179.anIntArray438[local33++] = 0;
								continue;
							}
							if (local209 == 3325) {
								if (Static101.anInt2435 > 0) {
									Static179.anIntArray438[local33++] = 1;
								} else {
									Static179.anIntArray438[local33++] = 0;
								}
								continue;
							}
							if (local209 == 3326) {
								Static179.anIntArray438[local33++] = Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt889;
								continue;
							}
						} else if (local209 < 3500) {
							if (local209 == 3400) {
								local33 -= 2;
								local772 = Static179.anIntArray438[local33];
								local777 = Static179.anIntArray438[local33 + 1];
								@Pc(2668) Class3_Sub2_Sub10 local2668 = Static170.method2717(local772);
								for (local629 = 0; local629 < local2668.anInt2635; local629++) {
									if (local777 == local2668.anIntArray289[local629]) {
										Static116.aClass46Array16[local35++] = local2668.aClass46Array14[local629];
										local2668 = null;
										break;
									}
								}
								if (local2668 != null) {
									Static116.aClass46Array16[local35++] = local2668.aClass46_889;
								}
								continue;
							}
							if (local209 == 3408) {
								local33 -= 4;
								local772 = Static179.anIntArray438[local33];
								local976 = Static179.anIntArray438[local33 + 2];
								local629 = Static179.anIntArray438[local33 + 3];
								local777 = Static179.anIntArray438[local33 + 1];
								@Pc(2738) Class3_Sub2_Sub10 local2738 = Static170.method2717(local976);
								if (local772 == local2738.anInt2631 && local2738.anInt2627 == local777) {
									for (local1007 = 0; local1007 < local2738.anInt2635; local1007++) {
										if (local2738.anIntArray289[local1007] == local629) {
											if (local777 == 115) {
												Static116.aClass46Array16[local35++] = local2738.aClass46Array14[local1007];
											} else {
												Static179.anIntArray438[local33++] = local2738.anIntArray290[local1007];
											}
											local2738 = null;
											break;
										}
									}
									if (local2738 != null) {
										if (local777 == 115) {
											Static116.aClass46Array16[local35++] = local2738.aClass46_889;
										} else {
											Static179.anIntArray438[local33++] = local2738.anInt2634;
										}
									}
									continue;
								}
								if (local777 == 115) {
									Static116.aClass46Array16[local35++] = Static40.aClass46_371;
								} else {
									Static179.anIntArray438[local33++] = 0;
								}
								continue;
							}
						} else if (local209 < 3700) {
							if (local209 == 3600) {
								if (Static34.anInt954 == 0) {
									Static179.anIntArray438[local33++] = -2;
								} else if (Static34.anInt954 == 1) {
									Static179.anIntArray438[local33++] = -1;
								} else {
									Static179.anIntArray438[local33++] = Static52.anInt1391;
								}
								continue;
							}
							if (local209 == 3601) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								if (Static34.anInt954 == 2 && Static52.anInt1391 > local772) {
									Static116.aClass46Array16[local35++] = Static158.aClass46Array23[local772];
									continue;
								}
								Static116.aClass46Array16[local35++] = Static47.aClass46_419;
								continue;
							}
							if (local209 == 3602) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								if (Static34.anInt954 == 2 && Static52.anInt1391 > local772) {
									Static179.anIntArray438[local33++] = Static99.anIntArray246[local772];
									continue;
								}
								Static179.anIntArray438[local33++] = 0;
								continue;
							}
							if (local209 == 3603) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								if (Static34.anInt954 == 2 && Static52.anInt1391 > local772) {
									Static179.anIntArray438[local33++] = Static180.anIntArray441[local772];
									continue;
								}
								Static179.anIntArray438[local33++] = 0;
								continue;
							}
							if (local209 == 3604) {
								local33--;
								local777 = Static179.anIntArray438[local33];
								local35--;
								local585 = Static116.aClass46Array16[local35];
								Static10.method277(local777, local585);
								continue;
							}
							if (local209 == 3605) {
								local35--;
								local585 = Static116.aClass46Array16[local35];
								Static29.method490(local585.method1348());
								continue;
							}
							if (local209 == 3606) {
								local35--;
								local585 = Static116.aClass46Array16[local35];
								Static139.method2341(local585.method1348());
								continue;
							}
							if (local209 == 3607) {
								local35--;
								local585 = Static116.aClass46Array16[local35];
								Static147.method2435(local585.method1348());
								continue;
							}
							if (local209 == 3608) {
								local35--;
								local585 = Static116.aClass46Array16[local35];
								method1593(local585.method1348());
								continue;
							}
							if (local209 == 3609) {
								local35--;
								local585 = Static116.aClass46Array16[local35];
								if (local585.method1367(Static97.aClass46_592) || local585.method1367(Static46.aClass46_401)) {
									local585 = local585.method1380(7);
								}
								Static179.anIntArray438[local33++] = Static39.method2899(local585) ? 1 : 0;
								continue;
							}
							if (local209 == 3611) {
								if (Static173.aClass46_1358 == null) {
									Static116.aClass46Array16[local35++] = Static47.aClass46_419;
								} else {
									Static116.aClass46Array16[local35++] = Static173.aClass46_1358.method1371();
								}
								continue;
							}
							if (local209 == 3612) {
								if (Static173.aClass46_1358 == null) {
									Static179.anIntArray438[local33++] = 0;
								} else {
									Static179.anIntArray438[local33++] = Static90.anInt2207;
								}
								continue;
							}
							if (local209 == 3613) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								if (Static173.aClass46_1358 != null && Static90.anInt2207 > local772) {
									Static116.aClass46Array16[local35++] = Static86.aClass3_Sub17Array1[local772].aClass46_974.method1371();
									continue;
								}
								Static116.aClass46Array16[local35++] = Static47.aClass46_419;
								continue;
							}
							if (local209 == 3614) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								if (Static173.aClass46_1358 != null && local772 < Static90.anInt2207) {
									Static179.anIntArray438[local33++] = Static86.aClass3_Sub17Array1[local772].anInt2819;
									continue;
								}
								Static179.anIntArray438[local33++] = 0;
								continue;
							}
							if (local209 == 3615) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								if (Static173.aClass46_1358 != null && local772 < Static90.anInt2207) {
									Static179.anIntArray438[local33++] = Static86.aClass3_Sub17Array1[local772].aByte6;
									continue;
								}
								Static179.anIntArray438[local33++] = 0;
								continue;
							}
							if (local209 == 3616) {
								Static179.anIntArray438[local33++] = Static160.aByte9;
								continue;
							}
							if (local209 == 3617) {
								local35--;
								local585 = Static116.aClass46Array16[local35];
								Static116.method1963(local585);
								continue;
							}
							if (local209 == 3618) {
								Static179.anIntArray438[local33++] = Static119.aByte7;
								continue;
							}
							if (local209 == 3619) {
								local35--;
								local585 = Static116.aClass46Array16[local35];
								Static35.method626(local585.method1348());
								continue;
							}
							if (local209 == 3620) {
								Static54.method1021();
								continue;
							}
							if (local209 == 3621) {
								if (Static34.anInt954 == 0) {
									Static179.anIntArray438[local33++] = -1;
								} else {
									Static179.anIntArray438[local33++] = Static25.anInt3983;
								}
								continue;
							}
							if (local209 == 3622) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								if (Static34.anInt954 != 0 && local772 < Static25.anInt3983) {
									Static116.aClass46Array16[local35++] = Static116.method1961(Static146.aLongArray3[local772]).method1371();
									continue;
								}
								Static116.aClass46Array16[local35++] = Static47.aClass46_419;
								continue;
							}
							if (local209 == 3623) {
								local35--;
								local585 = Static116.aClass46Array16[local35];
								if (local585.method1367(Static97.aClass46_592) || local585.method1367(Static46.aClass46_401)) {
									local585 = local585.method1380(7);
								}
								Static179.anIntArray438[local33++] = Static81.method1359(local585) ? 1 : 0;
								continue;
							}
							if (local209 == 3624) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								if (Static86.aClass3_Sub17Array1 != null && Static90.anInt2207 > local772 && Static86.aClass3_Sub17Array1[local772].aClass46_974.method1389(Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.aClass46_233)) {
									Static179.anIntArray438[local33++] = 1;
									continue;
								}
								Static179.anIntArray438[local33++] = 0;
								continue;
							}
							if (local209 == 3625) {
								if (Static22.aClass46_149 == null) {
									Static116.aClass46Array16[local35++] = Static47.aClass46_419;
								} else {
									Static116.aClass46Array16[local35++] = Static22.aClass46_149.method1371();
								}
								continue;
							}
						} else if (local209 < 4000) {
							if (local209 == 3903) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								Static179.anIntArray438[local33++] = Static53.aClass29Array1[local772].method996();
								continue;
							}
							if (local209 == 3904) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								Static179.anIntArray438[local33++] = Static53.aClass29Array1[local772].anInt1377;
								continue;
							}
							if (local209 == 3905) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								Static179.anIntArray438[local33++] = Static53.aClass29Array1[local772].anInt1373;
								continue;
							}
							if (local209 == 3906) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								Static179.anIntArray438[local33++] = Static53.aClass29Array1[local772].anInt1371;
								continue;
							}
							if (local209 == 3907) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								Static179.anIntArray438[local33++] = Static53.aClass29Array1[local772].anInt1374;
								continue;
							}
							if (local209 == 3908) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								Static179.anIntArray438[local33++] = Static53.aClass29Array1[local772].anInt1375;
								continue;
							}
							if (local209 == 3910) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								local777 = Static53.aClass29Array1[local772].method997();
								Static179.anIntArray438[local33++] = local777 == 0 ? 1 : 0;
								continue;
							}
							if (local209 == 3911) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								local777 = Static53.aClass29Array1[local772].method997();
								Static179.anIntArray438[local33++] = local777 == 2 ? 1 : 0;
								continue;
							}
							if (local209 == 3912) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								local777 = Static53.aClass29Array1[local772].method997();
								Static179.anIntArray438[local33++] = local777 == 5 ? 1 : 0;
								continue;
							}
							if (local209 == 3913) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								local777 = Static53.aClass29Array1[local772].method997();
								Static179.anIntArray438[local33++] = local777 == 1 ? 1 : 0;
								continue;
							}
						} else if (local209 < 4100) {
							if (local209 == 4000) {
								local33 -= 2;
								local772 = Static179.anIntArray438[local33];
								local777 = Static179.anIntArray438[local33 + 1];
								Static179.anIntArray438[local33++] = local772 + local777;
								continue;
							}
							if (local209 == 4001) {
								local33 -= 2;
								local772 = Static179.anIntArray438[local33];
								local777 = Static179.anIntArray438[local33 + 1];
								Static179.anIntArray438[local33++] = local772 - local777;
								continue;
							}
							if (local209 == 4002) {
								local33 -= 2;
								local777 = Static179.anIntArray438[local33 + 1];
								local772 = Static179.anIntArray438[local33];
								Static179.anIntArray438[local33++] = local772 * local777;
								continue;
							}
							if (local209 == 4003) {
								local33 -= 2;
								local772 = Static179.anIntArray438[local33];
								local777 = Static179.anIntArray438[local33 + 1];
								Static179.anIntArray438[local33++] = local772 / local777;
								continue;
							}
							if (local209 == 4004) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								Static179.anIntArray438[local33++] = (int) ((double) local772 * Math.random());
								continue;
							}
							if (local209 == 4005) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								Static179.anIntArray438[local33++] = (int) ((double) (local772 + 1) * Math.random());
								continue;
							}
							if (local209 == 4006) {
								local33 -= 5;
								local772 = Static179.anIntArray438[local33];
								local777 = Static179.anIntArray438[local33 + 1];
								local976 = Static179.anIntArray438[local33 + 2];
								local629 = Static179.anIntArray438[local33 + 3];
								local650 = Static179.anIntArray438[local33 + 4];
								Static179.anIntArray438[local33++] = (local650 - local976) * (-local772 + local777) / (local629 - local976) + local772;
								continue;
							}
							if (local209 == 4007) {
								local33 -= 2;
								local777 = Static179.anIntArray438[local33 + 1];
								local772 = Static179.anIntArray438[local33];
								Static179.anIntArray438[local33++] = local772 + local777 * local772 / 100;
								continue;
							}
							if (local209 == 4008) {
								local33 -= 2;
								local772 = Static179.anIntArray438[local33];
								local777 = Static179.anIntArray438[local33 + 1];
								Static179.anIntArray438[local33++] = 0x1 << local777 | local772;
								continue;
							}
							if (local209 == 4009) {
								local33 -= 2;
								local772 = Static179.anIntArray438[local33];
								local777 = Static179.anIntArray438[local33 + 1];
								Static179.anIntArray438[local33++] = local772 & -(0x1 << local777) - 1;
								continue;
							}
							if (local209 == 4010) {
								local33 -= 2;
								local777 = Static179.anIntArray438[local33 + 1];
								local772 = Static179.anIntArray438[local33];
								Static179.anIntArray438[local33++] = (local772 & 0x1 << local777) == 0 ? 0 : 1;
								continue;
							}
							if (local209 == 4011) {
								local33 -= 2;
								local772 = Static179.anIntArray438[local33];
								local777 = Static179.anIntArray438[local33 + 1];
								Static179.anIntArray438[local33++] = local772 % local777;
								continue;
							}
							if (local209 == 4012) {
								local33 -= 2;
								local777 = Static179.anIntArray438[local33 + 1];
								local772 = Static179.anIntArray438[local33];
								if (local772 == 0) {
									Static179.anIntArray438[local33++] = 0;
								} else {
									Static179.anIntArray438[local33++] = (int) Math.pow((double) local772, (double) local777);
								}
								continue;
							}
							if (local209 == 4013) {
								local33 -= 2;
								local777 = Static179.anIntArray438[local33 + 1];
								local772 = Static179.anIntArray438[local33];
								if (local772 == 0) {
									Static179.anIntArray438[local33++] = 0;
								} else if (local777 == 0) {
									Static179.anIntArray438[local33++] = Integer.MAX_VALUE;
								} else {
									Static179.anIntArray438[local33++] = (int) Math.pow((double) local772, 1.0D / (double) local777);
								}
								continue;
							}
							if (local209 == 4014) {
								local33 -= 2;
								local772 = Static179.anIntArray438[local33];
								local777 = Static179.anIntArray438[local33 + 1];
								Static179.anIntArray438[local33++] = local772 & local777;
								continue;
							}
							if (local209 == 4015) {
								local33 -= 2;
								local772 = Static179.anIntArray438[local33];
								local777 = Static179.anIntArray438[local33 + 1];
								Static179.anIntArray438[local33++] = local772 | local777;
								continue;
							}
							if (local209 == 4016) {
								local33 -= 2;
								local772 = Static179.anIntArray438[local33];
								local777 = Static179.anIntArray438[local33 + 1];
								Static179.anIntArray438[local33++] = local777 <= local772 ? local777 : local772;
								continue;
							}
							if (local209 == 4017) {
								local33 -= 2;
								local772 = Static179.anIntArray438[local33];
								local777 = Static179.anIntArray438[local33 + 1];
								Static179.anIntArray438[local33++] = local777 >= local772 ? local777 : local772;
								continue;
							}
							if (local209 == 4018) {
								local33 -= 3;
								@Pc(4234) long local4234 = (long) Static179.anIntArray438[local33 + 1];
								@Pc(4239) long local4239 = (long) Static179.anIntArray438[local33];
								@Pc(4246) long local4246 = (long) Static179.anIntArray438[local33 + 2];
								Static179.anIntArray438[local33++] = (int) (local4239 * local4246 / local4234);
								continue;
							}
						} else if (local209 < 4200) {
							if (local209 == 4100) {
								local33--;
								local777 = Static179.anIntArray438[local33];
								local35--;
								local585 = Static116.aClass46Array16[local35];
								Static116.aClass46Array16[local35++] = Static178.method2860(new Class46[] { local585, Static57.method1068(local777) });
								continue;
							}
							if (local209 == 4101) {
								local35 -= 2;
								local1438 = Static116.aClass46Array16[local35 + 1];
								local585 = Static116.aClass46Array16[local35];
								Static116.aClass46Array16[local35++] = Static178.method2860(new Class46[] { local585, local1438 });
								continue;
							}
							if (local209 == 4102) {
								local35--;
								local585 = Static116.aClass46Array16[local35];
								local33--;
								local777 = Static179.anIntArray438[local33];
								Static116.aClass46Array16[local35++] = Static178.method2860(new Class46[] { local585, Static67.method1184(local777) });
								continue;
							}
							if (local209 == 4103) {
								local35--;
								local585 = Static116.aClass46Array16[local35];
								Static116.aClass46Array16[local35++] = local585.method1353();
								continue;
							}
							if (local209 == 4104) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								@Pc(4400) long local4400 = ((long) local772 + 11745L) * 86400000L;
								Static59.aCalendar1.setTime(new Date(local4400));
								local629 = Static59.aCalendar1.get(5);
								local650 = Static59.aCalendar1.get(2);
								local1007 = Static59.aCalendar1.get(1);
								Static116.aClass46Array16[local35++] = Static178.method2860(new Class46[] { Static57.method1068(local629), Static145.aClass46_1151, Static180.aClass46Array25[local650], Static145.aClass46_1151, Static57.method1068(local1007) });
								continue;
							}
							if (local209 == 4105) {
								local35 -= 2;
								local585 = Static116.aClass46Array16[local35];
								local1438 = Static116.aClass46Array16[local35 + 1];
								if (Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.aClass64_1 != null && Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.aClass64_1.aBoolean123) {
									Static116.aClass46Array16[local35++] = local1438;
									continue;
								}
								Static116.aClass46Array16[local35++] = local585;
								continue;
							}
							if (local209 == 4106) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								Static116.aClass46Array16[local35++] = Static57.method1068(local772);
								continue;
							}
							if (local209 == 4107) {
								local35 -= 2;
								Static179.anIntArray438[local33++] = Static116.aClass46Array16[local35].method1373(Static116.aClass46Array16[local35 + 1]);
								continue;
							}
							@Pc(4553) byte[] local4553;
							@Pc(4558) Class3_Sub2_Sub3_Sub1_Sub1 local4558;
							if (local209 == 4108) {
								local33 -= 2;
								local35--;
								local585 = Static116.aClass46Array16[local35];
								local976 = Static179.anIntArray438[local33 + 1];
								local777 = Static179.anIntArray438[local33];
								local4553 = Static42.aClass44_Sub1_2.method1624(local976, 0);
								local4558 = new Class3_Sub2_Sub3_Sub1_Sub1(local4553);
								Static179.anIntArray438[local33++] = local4558.method829(local585, local777);
								continue;
							}
							if (local209 == 4109) {
								local35--;
								local585 = Static116.aClass46Array16[local35];
								local33 -= 2;
								local777 = Static179.anIntArray438[local33];
								local976 = Static179.anIntArray438[local33 + 1];
								local4553 = Static42.aClass44_Sub1_2.method1624(local976, 0);
								local4558 = new Class3_Sub2_Sub3_Sub1_Sub1(local4553);
								Static179.anIntArray438[local33++] = local4558.method811(local585, local777);
								continue;
							}
							if (local209 == 4110) {
								local35 -= 2;
								local585 = Static116.aClass46Array16[local35];
								local1438 = Static116.aClass46Array16[local35 + 1];
								local33--;
								if (Static179.anIntArray438[local33] == 1) {
									Static116.aClass46Array16[local35++] = local585;
								} else {
									Static116.aClass46Array16[local35++] = local1438;
								}
								continue;
							}
							if (local209 == 4111) {
								local35--;
								local585 = Static116.aClass46Array16[local35];
								Static116.aClass46Array16[local35++] = Static138.method815(local585);
								continue;
							}
							if (local209 == 4112) {
								local33--;
								local777 = Static179.anIntArray438[local33];
								local35--;
								local585 = Static116.aClass46Array16[local35];
								Static116.aClass46Array16[local35++] = local585.method1358(local777);
								continue;
							}
							if (local209 == 4113) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								Static179.anIntArray438[local33++] = Static113.method1447(local772) ? 1 : 0;
								continue;
							}
							if (local209 == 4114) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								Static179.anIntArray438[local33++] = Static39.method2901(local772) ? 1 : 0;
								continue;
							}
							if (local209 == 4115) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								Static179.anIntArray438[local33++] = Static95.method1570(local772) ? 1 : 0;
								continue;
							}
							if (local209 == 4116) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								Static179.anIntArray438[local33++] = Static36.method650(local772) ? 1 : 0;
								continue;
							}
							if (local209 == 4117) {
								local35--;
								local585 = Static116.aClass46Array16[local35];
								if (local585 == null) {
									Static179.anIntArray438[local33++] = 0;
								} else {
									Static179.anIntArray438[local33++] = local585.method1376();
								}
								continue;
							}
							if (local209 == 4118) {
								local33 -= 2;
								local35--;
								local585 = Static116.aClass46Array16[local35];
								local777 = Static179.anIntArray438[local33];
								local976 = Static179.anIntArray438[local33 + 1];
								Static116.aClass46Array16[local35++] = local585.method1363(local976, local777);
								continue;
							}
							if (local209 == 4119) {
								local35--;
								local585 = Static116.aClass46Array16[local35];
								@Pc(4843) boolean local4843 = false;
								local1438 = Static94.method1564(local585.method1376());
								for (local629 = 0; local629 < local585.method1376(); local629++) {
									local650 = local585.method1357(local629);
									if (local650 == 60) {
										local4843 = true;
									} else if (local650 == 62) {
										local4843 = false;
									} else if (!local4843) {
										local1438.method1361(local650);
									}
								}
								local1438.method1390();
								Static116.aClass46Array16[local35++] = local1438;
								continue;
							}
							if (local209 == 4120) {
								local33 -= 2;
								local35--;
								local585 = Static116.aClass46Array16[local35];
								local777 = Static179.anIntArray438[local33];
								local976 = Static179.anIntArray438[local33 + 1];
								Static179.anIntArray438[local33++] = local585.method1368(local976, local777);
								continue;
							}
							if (local209 == 4121) {
								local35 -= 2;
								local585 = Static116.aClass46Array16[local35];
								local33--;
								local976 = Static179.anIntArray438[local33];
								local1438 = Static116.aClass46Array16[local35 + 1];
								Static179.anIntArray438[local33++] = local585.method1383(local1438, local976);
								continue;
							}
						} else if (local209 < 4300) {
							if (local209 == 4200) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								Static116.aClass46Array16[local35++] = Static146.method2432(local772).aClass46_1163;
								continue;
							}
							@Pc(5007) Class3_Sub2_Sub14 local5007;
							if (local209 == 4201) {
								local33 -= 2;
								local772 = Static179.anIntArray438[local33];
								local777 = Static179.anIntArray438[local33 + 1];
								local5007 = Static146.method2432(local772);
								if (local777 >= 1 && local777 <= 5 && local5007.aClass46Array21[local777 - 1] != null) {
									Static116.aClass46Array16[local35++] = local5007.aClass46Array21[local777 - 1];
									continue;
								}
								Static116.aClass46Array16[local35++] = Static47.aClass46_419;
								continue;
							}
							if (local209 == 4202) {
								local33 -= 2;
								local772 = Static179.anIntArray438[local33];
								local777 = Static179.anIntArray438[local33 + 1];
								local5007 = Static146.method2432(local772);
								if (local777 >= 1 && local777 <= 5 && local5007.aClass46Array20[local777 - 1] != null) {
									Static116.aClass46Array16[local35++] = local5007.aClass46Array20[local777 - 1];
									continue;
								}
								Static116.aClass46Array16[local35++] = Static47.aClass46_419;
								continue;
							}
							if (local209 == 4203) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								Static179.anIntArray438[local33++] = Static146.method2432(local772).anInt3327;
								continue;
							}
							if (local209 == 4204) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								Static179.anIntArray438[local33++] = Static146.method2432(local772).anInt3324 == 1 ? 1 : 0;
								continue;
							}
							@Pc(5152) Class3_Sub2_Sub14 local5152;
							if (local209 == 4205) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								local5152 = Static146.method2432(local772);
								if (local5152.anInt3337 == -1 && local5152.anInt3336 >= 0) {
									Static179.anIntArray438[local33++] = local5152.anInt3336;
									continue;
								}
								Static179.anIntArray438[local33++] = local772;
								continue;
							}
							if (local209 == 4206) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								local5152 = Static146.method2432(local772);
								if (local5152.anInt3337 >= 0 && local5152.anInt3336 >= 0) {
									Static179.anIntArray438[local33++] = local5152.anInt3336;
									continue;
								}
								Static179.anIntArray438[local33++] = local772;
								continue;
							}
							if (local209 == 4207) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								Static179.anIntArray438[local33++] = Static146.method2432(local772).aBoolean138 ? 1 : 0;
								continue;
							}
							if (local209 == 4210) {
								local35--;
								local585 = Static116.aClass46Array16[local35];
								local33--;
								local777 = Static179.anIntArray438[local33];
								Static160.method2577(local777 == 1, local585);
								Static179.anIntArray438[local33++] = Static140.anInt229;
								continue;
							}
							if (local209 == 4211) {
								if (Static120.aShortArray25 != null && Static140.anInt229 > Static178.anInt3929) {
									Static179.anIntArray438[local33++] = Static120.aShortArray25[Static178.anInt3929++] & 0xFFFF;
									continue;
								}
								Static179.anIntArray438[local33++] = -1;
								continue;
							}
							if (local209 == 4212) {
								Static178.anInt3929 = 0;
								continue;
							}
						} else if (local209 < 5100) {
							if (local209 == 5000) {
								Static179.anIntArray438[local33++] = Static151.anInt3416;
								continue;
							}
							if (local209 == 5001) {
								local33 -= 3;
								Static151.anInt3416 = Static179.anIntArray438[local33];
								Static69.anInt1778 = Static179.anIntArray438[local33 + 1];
								Static140.anInt217 = Static179.anIntArray438[local33 + 2];
								Static133.aClass3_Sub4_Sub1_3.method233(66);
								Static133.aClass3_Sub4_Sub1_3.method206(Static151.anInt3416);
								Static133.aClass3_Sub4_Sub1_3.method206(Static69.anInt1778);
								Static133.aClass3_Sub4_Sub1_3.method206(Static140.anInt217);
								continue;
							}
							if (local209 == 5002) {
								local33 -= 2;
								local976 = Static179.anIntArray438[local33 + 1];
								local35--;
								local585 = Static116.aClass46Array16[local35];
								local777 = Static179.anIntArray438[local33];
								Static133.aClass3_Sub4_Sub1_3.method233(41);
								Static133.aClass3_Sub4_Sub1_3.method201(local585.method1348());
								Static133.aClass3_Sub4_Sub1_3.method206(local777 - 1);
								Static133.aClass3_Sub4_Sub1_3.method206(local976);
								continue;
							}
							if (local209 == 5003) {
								local1438 = null;
								local33--;
								local772 = Static179.anIntArray438[local33];
								if (local772 < 100) {
									local1438 = Static143.aClass46Array19[local772];
								}
								if (local1438 == null) {
									local1438 = Static47.aClass46_419;
								}
								Static116.aClass46Array16[local35++] = local1438;
								continue;
							}
							if (local209 == 5004) {
								local777 = -1;
								local33--;
								local772 = Static179.anIntArray438[local33];
								if (local772 < 100 && Static143.aClass46Array19[local772] != null) {
									local777 = Static71.anIntArray173[local772];
								}
								Static179.anIntArray438[local33++] = local777;
								continue;
							}
							if (local209 == 5005) {
								Static179.anIntArray438[local33++] = Static69.anInt1778;
								continue;
							}
							if (local209 == 5008) {
								local35--;
								local585 = Static116.aClass46Array16[local35];
								if (local585.method1367(Static20.aClass46_144)) {
									Static61.method1131(local585);
								} else {
									local1438 = local585.method1353();
									@Pc(5500) byte local5500 = 0;
									@Pc(5502) byte local5502 = 0;
									if (local1438.method1367(Static89.aClass46_742)) {
										local5502 = 0;
										local585 = local585.method1380(Static89.aClass46_742.method1376());
									} else if (local1438.method1367(Static69.aClass46_616)) {
										local5502 = 1;
										local585 = local585.method1380(Static69.aClass46_616.method1376());
									} else if (local1438.method1367(Static177.aClass46_1392)) {
										local585 = local585.method1380(Static177.aClass46_1392.method1376());
										local5502 = 2;
									} else if (local1438.method1367(Static65.aClass46_595)) {
										local5502 = 3;
										local585 = local585.method1380(Static65.aClass46_595.method1376());
									} else if (local1438.method1367(Static156.aClass46_1256)) {
										local5502 = 4;
										local585 = local585.method1380(Static156.aClass46_1256.method1376());
									} else if (local1438.method1367(Static157.aClass46_1264)) {
										local585 = local585.method1380(Static157.aClass46_1264.method1376());
										local5502 = 5;
									} else if (local1438.method1367(Static32.aClass46_239)) {
										local585 = local585.method1380(Static32.aClass46_239.method1376());
										local5502 = 6;
									} else if (local1438.method1367(Static156.aClass46_1262)) {
										local585 = local585.method1380(Static156.aClass46_1262.method1376());
										local5502 = 7;
									} else if (local1438.method1367(Static118.aClass46_966)) {
										local5502 = 8;
										local585 = local585.method1380(Static118.aClass46_966.method1376());
									} else if (local1438.method1367(Static99.aClass46_798)) {
										local585 = local585.method1380(Static99.aClass46_798.method1376());
										local5502 = 9;
									} else if (local1438.method1367(Static63.aClass46_569)) {
										local5502 = 10;
										local585 = local585.method1380(Static63.aClass46_569.method1376());
									} else if (local1438.method1367(Static124.aClass46_1025)) {
										local585 = local585.method1380(Static124.aClass46_1025.method1376());
										local5502 = 11;
									} else if (Static122.anInt2902 != 0) {
										if (local1438.method1367(Static89.aClass46_741)) {
											local585 = local585.method1380(Static89.aClass46_741.method1376());
											local5502 = 0;
										} else if (local1438.method1367(Static69.aClass46_615)) {
											local585 = local585.method1380(Static69.aClass46_615.method1376());
											local5502 = 1;
										} else if (local1438.method1367(Static177.aClass46_1394)) {
											local585 = local585.method1380(Static177.aClass46_1394.method1376());
											local5502 = 2;
										} else if (local1438.method1367(Static65.aClass46_594)) {
											local5502 = 3;
											local585 = local585.method1380(Static65.aClass46_594.method1376());
										} else if (local1438.method1367(Static156.aClass46_1255)) {
											local585 = local585.method1380(Static156.aClass46_1255.method1376());
											local5502 = 4;
										} else if (local1438.method1367(Static157.aClass46_1265)) {
											local5502 = 5;
											local585 = local585.method1380(Static157.aClass46_1265.method1376());
										} else if (local1438.method1367(Static32.aClass46_238)) {
											local585 = local585.method1380(Static32.aClass46_238.method1376());
											local5502 = 6;
										} else if (local1438.method1367(Static156.aClass46_1261)) {
											local585 = local585.method1380(Static156.aClass46_1261.method1376());
											local5502 = 7;
										} else if (local1438.method1367(Static118.aClass46_964)) {
											local5502 = 8;
											local585 = local585.method1380(Static118.aClass46_964.method1376());
										} else if (local1438.method1367(Static99.aClass46_797)) {
											local585 = local585.method1380(Static99.aClass46_797.method1376());
											local5502 = 9;
										} else if (local1438.method1367(Static63.aClass46_567)) {
											local5502 = 10;
											local585 = local585.method1380(Static63.aClass46_567.method1376());
										} else if (local1438.method1367(Static124.aClass46_1022)) {
											local5502 = 11;
											local585 = local585.method1380(Static124.aClass46_1022.method1376());
										}
									}
									local1438 = local585.method1353();
									if (local1438.method1367(Static120.aClass46_976)) {
										local5500 = 1;
										local585 = local585.method1380(Static120.aClass46_976.method1376());
									} else if (local1438.method1367(Static140.aClass46_66)) {
										local5500 = 2;
										local585 = local585.method1380(Static140.aClass46_66.method1376());
									} else if (local1438.method1367(Static158.aClass46_1278)) {
										local5500 = 3;
										local585 = local585.method1380(Static158.aClass46_1278.method1376());
									} else if (local1438.method1367(Static146.aClass46_1168)) {
										local5500 = 4;
										local585 = local585.method1380(Static146.aClass46_1168.method1376());
									} else if (local1438.method1367(Static122.aClass46_1000)) {
										local585 = local585.method1380(Static122.aClass46_1000.method1376());
										local5500 = 5;
									} else if (Static122.anInt2902 != 0) {
										if (local1438.method1367(Static120.aClass46_977)) {
											local585 = local585.method1380(Static120.aClass46_977.method1376());
											local5500 = 1;
										} else if (local1438.method1367(Static140.aClass46_63)) {
											local585 = local585.method1380(Static140.aClass46_63.method1376());
											local5500 = 2;
										} else if (local1438.method1367(Static158.aClass46_1280)) {
											local5500 = 3;
											local585 = local585.method1380(Static158.aClass46_1280.method1376());
										} else if (local1438.method1367(Static146.aClass46_1165)) {
											local5500 = 4;
											local585 = local585.method1380(Static146.aClass46_1165.method1376());
										} else if (local1438.method1367(Static122.aClass46_1001)) {
											local585 = local585.method1380(Static122.aClass46_1001.method1376());
											local5500 = 5;
										}
									}
									Static133.aClass3_Sub4_Sub1_3.method233(54);
									Static133.aClass3_Sub4_Sub1_3.method206(0);
									local650 = Static133.aClass3_Sub4_Sub1_3.anInt232;
									Static133.aClass3_Sub4_Sub1_3.method206(local5502);
									Static133.aClass3_Sub4_Sub1_3.method206(local5500);
									Static71.method1216(local585, Static133.aClass3_Sub4_Sub1_3);
									Static133.aClass3_Sub4_Sub1_3.method222(Static133.aClass3_Sub4_Sub1_3.anInt232 - local650);
								}
								continue;
							}
							if (local209 == 5009) {
								local35 -= 2;
								local1438 = Static116.aClass46Array16[local35 + 1];
								local585 = Static116.aClass46Array16[local35];
								Static133.aClass3_Sub4_Sub1_3.method233(184);
								Static133.aClass3_Sub4_Sub1_3.method206(0);
								local976 = Static133.aClass3_Sub4_Sub1_3.anInt232;
								Static133.aClass3_Sub4_Sub1_3.method201(local585.method1348());
								Static71.method1216(local1438, Static133.aClass3_Sub4_Sub1_3);
								Static133.aClass3_Sub4_Sub1_3.method222(Static133.aClass3_Sub4_Sub1_3.anInt232 - local976);
								continue;
							}
							if (local209 == 5010) {
								local1438 = null;
								local33--;
								local772 = Static179.anIntArray438[local33];
								if (local772 < 100) {
									local1438 = Static31.aClass46Array4[local772];
								}
								if (local1438 == null) {
									local1438 = Static47.aClass46_419;
								}
								Static116.aClass46Array16[local35++] = local1438;
								continue;
							}
							if (local209 == 5011) {
								local33--;
								local772 = Static179.anIntArray438[local33];
								local1438 = null;
								if (local772 < 100) {
									local1438 = Static181.aClass46Array26[local772];
								}
								if (local1438 == null) {
									local1438 = Static47.aClass46_419;
								}
								Static116.aClass46Array16[local35++] = local1438;
								continue;
							}
							if (local209 == 5015) {
								if (Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1 == null || Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.aClass46_233 == null) {
									local585 = Static130.aClass46_1066;
								} else {
									local585 = Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.aClass46_233;
								}
								Static116.aClass46Array16[local35++] = local585;
								continue;
							}
							if (local209 == 5016) {
								Static179.anIntArray438[local33++] = Static140.anInt217;
								continue;
							}
							if (local209 == 5017) {
								Static179.anIntArray438[local33++] = Static69.anInt1777;
								continue;
							}
						}
					} else {
						if (local209 >= 2000) {
							local209 -= 1000;
							local33--;
							local1099 = Static179.method2873(Static179.anIntArray438[local33]);
						} else {
							local1099 = local947 ? Static74.aClass33_8 : Static162.aClass33_14;
						}
						if (local209 == 1300) {
							local33--;
							local777 = Static179.anIntArray438[local33] - 1;
							if (local777 >= 0 && local777 <= 9) {
								local35--;
								local1099.method1026(local777, Static116.aClass46Array16[local35]);
								continue;
							}
							local35--;
							continue;
						}
						if (local209 == 1301) {
							local33 -= 2;
							local777 = Static179.anIntArray438[local33];
							local976 = Static179.anIntArray438[local33 + 1];
							local1099.aClass33_4 = Static98.method1607(local976, local777);
							continue;
						}
						if (local209 == 1302) {
							local33--;
							local1099.aBoolean53 = Static179.anIntArray438[local33] == 1;
							continue;
						}
						if (local209 == 1303) {
							local33--;
							local1099.anInt1446 = Static179.anIntArray438[local33];
							continue;
						}
						if (local209 == 1304) {
							local33--;
							local1099.anInt1467 = Static179.anIntArray438[local33];
							continue;
						}
						if (local209 == 1305) {
							local35--;
							local1099.aClass46_482 = Static116.aClass46Array16[local35];
							continue;
						}
						if (local209 == 1306) {
							local35--;
							local1099.aClass46_489 = Static116.aClass46Array16[local35];
							continue;
						}
						if (local209 == 1307) {
							local1099.aClass46Array10 = null;
							continue;
						}
					}
				} else {
					if (local209 < 2000) {
						local1099 = local947 ? Static74.aClass33_8 : Static162.aClass33_14;
					} else {
						local33--;
						local1099 = Static179.method2873(Static179.anIntArray438[local33]);
						local209 -= 1000;
					}
					if (local209 == 1000) {
						local33 -= 2;
						local1099.anInt1461 = Static179.anIntArray438[local33];
						local1099.anInt1449 = Static179.anIntArray438[local33 + 1];
						Static142.method2373(local1099);
						continue;
					}
					if (local209 == 1001) {
						local33 -= 2;
						local1099.anInt1424 = Static179.anIntArray438[local33];
						local1099.anInt1428 = Static179.anIntArray438[local33 + 1];
						Static142.method2373(local1099);
						continue;
					}
					if (local209 == 1003) {
						local33--;
						@Pc(1330) boolean local1330 = Static179.anIntArray438[local33] == 1;
						if (local1099.aBoolean46 != local1330) {
							local1099.aBoolean46 = local1330;
							Static142.method2373(local1099);
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(7833) Exception local7833) {
			if (local26.aClass46_477 == null) {
				if (Static114.anInt2715 != 0) {
					Static168.method2686(0, Static47.aClass46_419, Static149.aClass46_1299);
				}
				Static124.method2117("CS2 - scr:" + local26.aLong143 + " op:" + local45, local7833);
			} else {
				@Pc(7840) Class46 local7840 = Static94.method1564(30);
				local7840.method1382(Static23.aClass46_150).method1382(local26.aClass46_477);
				for (local59 = Static46.anInt1262 - 1; local59 >= 0; local59--) {
					local7840.method1382(Static134.aClass46_1083).method1382(Static107.aClass52Array1[local59].aClass3_Sub2_Sub6_1.aClass46_477);
				}
				if (local45 == 40) {
					local72 = local43[local37];
					local7840.method1382(Static136.aClass46_1099).method1382(Static57.method1068(local72));
				}
				if (Static114.anInt2715 != 0) {
					Static168.method2686(0, Static47.aClass46_419, Static178.method2860(new Class46[] { Static86.aClass46_717, local26.aClass46_477 }));
				}
				Static124.method2117("CS2 - scr:" + local26.aLong143 + " op:" + local45 + new String(local7840.method1349()), local7833);
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
	public static void method1595() {
		anIntArray238 = null;
		aClass46_784 = null;
		anIntArrayArray21 = null;
		aClass46_787 = null;
		aClass46_786 = null;
		aClass46_785 = null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[Lclient!ig;[II[II)V")
	public static void method1597(@OriginalArg(1) Class38[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if (arg2 <= arg4) {
			return;
		}
		@Pc(8) int local8 = arg4 - 1;
		@Pc(12) int local12 = arg2 + 1;
		@Pc(18) int local18 = (arg4 + arg2) / 2;
		@Pc(22) Class38 local22 = arg0[local18];
		arg0[local18] = arg0[arg4];
		arg0[arg4] = local22;
		while (local8 < local12) {
			@Pc(36) boolean local36 = true;
			@Pc(39) int local39;
			@Pc(56) int local56;
			@Pc(51) int local51;
			do {
				local12--;
				for (local39 = 0; local39 < 4; local39++) {
					if (arg3[local39] == 2) {
						local51 = local22.anInt1780;
						local56 = arg0[local12].anInt1780;
					} else if (arg3[local39] == 1) {
						local56 = arg0[local12].anInt1781;
						local51 = local22.anInt1781;
						if (local56 == -1 && arg1[local39] == 1) {
							local56 = 2001;
						}
						if (local51 == -1 && arg1[local39] == 1) {
							local51 = 2001;
						}
					} else if (arg3[local39] == 3) {
						local56 = arg0[local12].aBoolean68 ? 1 : 0;
						local51 = local22.aBoolean68 ? 1 : 0;
					} else {
						local51 = local22.anInt1776;
						local56 = arg0[local12].anInt1776;
					}
					if (local51 != local56) {
						if ((arg1[local39] != 1 || local51 >= local56) && (arg1[local39] != 0 || local56 >= local51)) {
							local36 = false;
						}
						break;
					}
					if (local39 == 3) {
						local36 = false;
					}
				}
			} while (local36);
			local36 = true;
			do {
				local8++;
				for (local39 = 0; local39 < 4; local39++) {
					if (arg3[local39] == 2) {
						local56 = arg0[local8].anInt1780;
						local51 = local22.anInt1780;
					} else if (arg3[local39] == 1) {
						local51 = local22.anInt1781;
						if (local51 == -1 && arg1[local39] == 1) {
							local51 = 2001;
						}
						local56 = arg0[local8].anInt1781;
						if (local56 == -1 && arg1[local39] == 1) {
							local56 = 2001;
						}
					} else if (arg3[local39] == 3) {
						local51 = local22.aBoolean68 ? 1 : 0;
						local56 = arg0[local8].aBoolean68 ? 1 : 0;
					} else {
						local51 = local22.anInt1776;
						local56 = arg0[local8].anInt1776;
					}
					if (local56 != local51) {
						if ((arg1[local39] != 1 || local51 <= local56) && (arg1[local39] != 0 || local56 <= local51)) {
							local36 = false;
						}
						break;
					}
					if (local39 == 3) {
						local36 = false;
					}
				}
			} while (local36);
			if (local12 > local8) {
				@Pc(326) Class38 local326 = arg0[local8];
				arg0[local8] = arg0[local12];
				arg0[local12] = local326;
			}
		}
		method1597(arg0, arg1, local12, arg3, arg4);
		method1597(arg0, arg1, arg2, arg3, local12 + 1);
	}
}
