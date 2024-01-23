import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
	public static int anInt2128 = 0;

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString119 = "Prepared sound engine";

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIII)I")
	public static int method1576(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static46.anIntArrayArrayArray1 == null) {
			return 0;
		}
		@Pc(12) int local12 = arg1 >> 7;
		@Pc(16) int local16 = arg0 >> 7;
		if (local12 < 0 || local16 < 0 || local12 > 103 || local16 > 103) {
			return 0;
		}
		@Pc(41) int local41 = arg1 & 0x7F;
		@Pc(43) int local43 = arg2;
		@Pc(47) int local47 = arg0 & 0x7F;
		if (arg2 < 3 && (Static303.aByteArrayArrayArray19[1][local12][local16] & 0x2) == 2) {
			local43 = arg2 + 1;
		}
		@Pc(92) int local92 = local41 * Static46.anIntArrayArrayArray1[local43][local12 + 1][local16] + (128 - local41) * Static46.anIntArrayArrayArray1[local43][local12][local16] >> 7;
		@Pc(123) int local123 = local41 * Static46.anIntArrayArrayArray1[local43][local12 + 1][local16 + 1] + (128 - local41) * Static46.anIntArrayArrayArray1[local43][local12][local16 + 1] >> 7;
		return (128 - local47) * local92 + local123 * local47 >> 7;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BIIIIZIIIII)V")
	public static void method1578(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		@Pc(16) int local16;
		@Pc(23) int local23;
		for (local16 = 0; local16 < 104; local16++) {
			for (local23 = 0; local23 < 104; local23++) {
				Static145.anIntArrayArray77[local16][local23] = 0;
				Static133.anIntArrayArray36[local16][local23] = 99999999;
			}
		}
		local16 = arg2;
		Static145.anIntArrayArray77[arg2][arg1] = 99;
		Static133.anIntArrayArray36[arg2][arg1] = 0;
		local23 = arg1;
		@Pc(62) byte local62 = 0;
		Static78.anIntArray189[0] = arg2;
		@Pc(69) int local69 = local62 + 1;
		Static134.anIntArray290[0] = arg1;
		@Pc(73) int local73 = 0;
		@Pc(75) boolean local75 = false;
		@Pc(80) int[][] local80 = Static82.aClass75Array1[Static185.anInt4085].anIntArrayArray30;
		@Pc(203) int local203;
		while (local69 != local73) {
			local23 = Static134.anIntArray290[local73];
			local16 = Static78.anIntArray189[local73];
			local73 = local73 + 1 & 0xFFF;
			if (arg0 == local16 && local23 == arg4) {
				local75 = true;
				break;
			}
			if (arg8 != 0) {
				if ((arg8 < 5 || arg8 == 10) && Static82.aClass75Array1[Static185.anInt4085].method1826(arg4, arg8 - 1, 2, arg0, arg5, local23, local16)) {
					local75 = true;
					break;
				}
				if (arg8 < 10 && Static82.aClass75Array1[Static185.anInt4085].method1825(arg0, arg4, arg8 - 1, local16, local23, arg5, 2)) {
					local75 = true;
					break;
				}
			}
			if (arg3 != 0 && arg7 != 0 && Static82.aClass75Array1[Static185.anInt4085].method1824(arg7, arg0, local16, arg4, arg3, 2, arg6, local23)) {
				local75 = true;
				break;
			}
			local203 = Static133.anIntArrayArray36[local16][local23] + 1;
			if (local16 > 0 && Static145.anIntArrayArray77[local16 - 1][local23] == 0 && (local80[local16 - 1][local23] & 0x2C010E) == 0 && (local80[local16 - 1][local23 + 1] & 0x2C0138) == 0) {
				Static78.anIntArray189[local69] = local16 - 1;
				Static134.anIntArray290[local69] = local23;
				Static145.anIntArrayArray77[local16 - 1][local23] = 2;
				local69 = local69 + 1 & 0xFFF;
				Static133.anIntArrayArray36[local16 - 1][local23] = local203;
			}
			if (local16 < 102 && Static145.anIntArrayArray77[local16 + 1][local23] == 0 && (local80[local16 + 2][local23] & 0x2C0183) == 0 && (local80[local16 + 2][local23 + 1] & 0x2C01E0) == 0) {
				Static78.anIntArray189[local69] = local16 + 1;
				Static134.anIntArray290[local69] = local23;
				local69 = local69 + 1 & 0xFFF;
				Static145.anIntArrayArray77[local16 + 1][local23] = 8;
				Static133.anIntArrayArray36[local16 + 1][local23] = local203;
			}
			if (local23 > 0 && Static145.anIntArrayArray77[local16][local23 - 1] == 0 && (local80[local16][local23 - 1] & 0x2C010E) == 0 && (local80[local16 + 1][local23 - 1] & 0x2C0183) == 0) {
				Static78.anIntArray189[local69] = local16;
				Static134.anIntArray290[local69] = local23 - 1;
				local69 = local69 + 1 & 0xFFF;
				Static145.anIntArrayArray77[local16][local23 - 1] = 1;
				Static133.anIntArrayArray36[local16][local23 - 1] = local203;
			}
			if (local23 < 102 && Static145.anIntArrayArray77[local16][local23 + 1] == 0 && (local80[local16][local23 + 2] & 0x2C0138) == 0 && (local80[local16 + 1][local23 + 2] & 0x2C01E0) == 0) {
				Static78.anIntArray189[local69] = local16;
				Static134.anIntArray290[local69] = local23 + 1;
				local69 = local69 + 1 & 0xFFF;
				Static145.anIntArrayArray77[local16][local23 + 1] = 4;
				Static133.anIntArrayArray36[local16][local23 + 1] = local203;
			}
			if (local16 > 0 && local23 > 0 && Static145.anIntArrayArray77[local16 - 1][local23 - 1] == 0 && (local80[local16 - 1][local23] & 0x2C013E) == 0 && (local80[local16 - 1][local23 - 1] & 0x2C010E) == 0 && (local80[local16][local23 - 1] & 0x2C018F) == 0) {
				Static78.anIntArray189[local69] = local16 - 1;
				Static134.anIntArray290[local69] = local23 - 1;
				Static145.anIntArrayArray77[local16 - 1][local23 - 1] = 3;
				local69 = local69 + 1 & 0xFFF;
				Static133.anIntArrayArray36[local16 - 1][local23 - 1] = local203;
			}
			if (local16 < 102 && local23 > 0 && Static145.anIntArrayArray77[local16 + 1][local23 - 1] == 0 && (local80[local16 + 1][local23 - 1] & 0x2C018F) == 0 && (local80[local16 + 2][local23 - 1] & 0x2C0183) == 0 && (local80[local16 + 2][local23] & 0x2C01E3) == 0) {
				Static78.anIntArray189[local69] = local16 + 1;
				Static134.anIntArray290[local69] = local23 - 1;
				local69 = local69 + 1 & 0xFFF;
				Static145.anIntArrayArray77[local16 + 1][local23 - 1] = 9;
				Static133.anIntArrayArray36[local16 + 1][local23 - 1] = local203;
			}
			if (local16 > 0 && local23 < 102 && Static145.anIntArrayArray77[local16 - 1][local23 + 1] == 0 && (local80[local16 - 1][local23 + 1] & 0x2C013E) == 0 && (local80[local16 - 1][local23 + 2] & 0x2C0138) == 0 && (local80[local16][local23 + 2] & 0x2C01F8) == 0) {
				Static78.anIntArray189[local69] = local16 - 1;
				Static134.anIntArray290[local69] = local23 + 1;
				local69 = local69 + 1 & 0xFFF;
				Static145.anIntArrayArray77[local16 - 1][local23 + 1] = 6;
				Static133.anIntArrayArray36[local16 - 1][local23 + 1] = local203;
			}
			if (local16 < 102 && local23 < 102 && Static145.anIntArrayArray77[local16 + 1][local23 + 1] == 0 && (local80[local16 + 1][local23 + 2] & 0x2C01F8) == 0 && (local80[local16 + 2][local23 + 2] & 0x2C01E0) == 0 && (local80[local16 + 2][local23 + 1] & 0x2C01E3) == 0) {
				Static78.anIntArray189[local69] = local16 + 1;
				Static134.anIntArray290[local69] = local23 + 1;
				local69 = local69 + 1 & 0xFFF;
				Static145.anIntArrayArray77[local16 + 1][local23 + 1] = 12;
				Static133.anIntArrayArray36[local16 + 1][local23 + 1] = local203;
			}
		}
		if (!local75) {
			@Pc(916) int local916 = 100;
			local203 = 1000;
			for (@Pc(925) int local925 = arg0 - 10; local925 <= arg0 + 10; local925++) {
				for (@Pc(934) int local934 = arg4 - 10; local934 <= arg4 + 10; local934++) {
					if (local925 >= 0 && local934 >= 0 && local925 < 104 && local934 < 104 && Static133.anIntArrayArray36[local925][local934] < 100) {
						@Pc(962) int local962 = 0;
						@Pc(964) int local964 = 0;
						if (local934 < arg4) {
							local964 = arg4 - local934;
						} else if (local934 > arg4 + arg7 - 1) {
							local964 = local934 + 1 - arg7 - arg4;
						}
						if (local925 < arg0) {
							local962 = arg0 - local925;
						} else if (local925 > arg0 + arg3 - 1) {
							local962 = local925 + 1 - arg0 - arg3;
						}
						@Pc(1036) int local1036 = local962 * local962 + local964 * local964;
						if (local203 > local1036 || local1036 == local203 && local916 > Static133.anIntArrayArray36[local925][local934]) {
							local16 = local925;
							local23 = local934;
							local203 = local1036;
							local916 = Static133.anIntArrayArray36[local925][local934];
						}
					}
				}
			}
			if (local203 == 1000) {
				return;
			}
			if (arg2 == local16 && local23 == arg1) {
				return;
			}
		}
		Static280.anInt5624 = local16;
		Static240.aBoolean314 = false;
		Static259.anInt5240 = local23;
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V")
	public static void method1579() {
		Static215.method3449(false);
		@Pc(6) boolean local6 = true;
		Static144.anInt3282 = 0;
		@Pc(14) int local14;
		for (local14 = 0; local14 < Static230.aByteArrayArray13.length; local14++) {
			if (Static271.anIntArray488[local14] != -1 && Static230.aByteArrayArray13[local14] == null) {
				Static230.aByteArrayArray13[local14] = Static124.aClass168_93.method4058(0, Static271.anIntArray488[local14]);
				if (Static230.aByteArrayArray13[local14] == null) {
					local6 = false;
					Static144.anInt3282++;
				}
			}
			if (Static1.anIntArray564[local14] != -1 && Static24.aByteArrayArray4[local14] == null) {
				Static24.aByteArrayArray4[local14] = Static124.aClass168_93.method4056(Static1.anIntArray564[local14], 0, Static262.anIntArrayArray66[local14]);
				if (Static24.aByteArrayArray4[local14] == null) {
					local6 = false;
					Static144.anInt3282++;
				}
			}
			if (Static294.aBoolean367) {
				if (Static124.anIntArray275[local14] != -1 && Static72.aByteArrayArray10[local14] == null) {
					Static72.aByteArrayArray10[local14] = Static124.aClass168_93.method4058(0, Static124.anIntArray275[local14]);
					if (Static72.aByteArrayArray10[local14] == null) {
						local6 = false;
						Static144.anInt3282++;
					}
				}
				if (Static68.anIntArray170[local14] != -1 && Static129.aByteArrayArray11[local14] == null) {
					Static129.aByteArrayArray11[local14] = Static124.aClass168_93.method4058(0, Static68.anIntArray170[local14]);
					if (Static129.aByteArrayArray11[local14] == null) {
						Static144.anInt3282++;
						local6 = false;
					}
				}
			}
			if (Static153.anIntArray315 != null && Static175.aByteArrayArray2[local14] == null && Static153.anIntArray315[local14] != -1) {
				Static175.aByteArrayArray2[local14] = Static124.aClass168_93.method4056(Static153.anIntArray315[local14], 0, Static262.anIntArrayArray66[local14]);
				if (Static175.aByteArrayArray2[local14] == null) {
					local6 = false;
					Static144.anInt3282++;
				}
			}
		}
		if (Static309.aClass174_3 == null) {
			if (Static186.aClass1_Sub3_Sub15_3 == null || !Static280.aClass168_191.method4045(Static186.aClass1_Sub3_Sub15_3.aString267 + "_labels")) {
				Static309.aClass174_3 = new Class174(0);
			} else if (Static280.aClass168_191.method4061(Static186.aClass1_Sub3_Sub15_3.aString267 + "_labels")) {
				Static309.aClass174_3 = Static267.method4026(Static186.aClass1_Sub3_Sub15_3.aString267 + "_labels", Static280.aClass168_191, Static160.aBoolean229);
			} else {
				Static144.anInt3282++;
				local6 = false;
			}
		}
		if (!local6) {
			Static186.anInt4095 = 1;
			return;
		}
		Static222.anInt4707 = 0;
		local6 = true;
		@Pc(287) int local287;
		@Pc(298) int local298;
		for (local14 = 0; local14 < Static230.aByteArrayArray13.length; local14++) {
			@Pc(272) byte[] local272 = Static24.aByteArrayArray4[local14];
			if (local272 != null) {
				local287 = (Static234.anIntArray456[local14] >> 8) * 64 - Static159.anInt3527;
				local298 = (Static234.anIntArray456[local14] & 0xFF) * 64 - Static217.anInt4673;
				if (Static199.aBoolean418) {
					local298 = 10;
					local287 = 10;
				}
				local6 &= Static271.method4107(local287, local272, local298);
			}
			if (Static294.aBoolean367) {
				local272 = Static129.aByteArrayArray11[local14];
				if (local272 != null) {
					local298 = (Static234.anIntArray456[local14] & 0xFF) * 64 - Static217.anInt4673;
					local287 = (Static234.anIntArray456[local14] >> 8) * 64 - Static159.anInt3527;
					if (Static199.aBoolean418) {
						local298 = 10;
						local287 = 10;
					}
					local6 &= Static271.method4107(local287, local272, local298);
				}
			}
		}
		if (!local6) {
			Static186.anInt4095 = 2;
			return;
		}
		if (Static186.anInt4095 != 0) {
			Static182.method2957(Static115.aString149 + "<br>(100%)", true);
		}
		Static248.method3834();
		Static136.method2297();
		@Pc(391) boolean local391 = false;
		@Pc(398) int local398;
		if (Static294.aBoolean367 && Static255.aBoolean321) {
			for (local398 = 0; local398 < Static230.aByteArrayArray13.length; local398++) {
				if (Static129.aByteArrayArray11[local398] != null || Static72.aByteArrayArray10[local398] != null) {
					local391 = true;
					break;
				}
			}
		}
		Static255.method3937(Static294.aBoolean367 ? 28 : 25, local391);
		for (local398 = 0; local398 < 4; local398++) {
			Static82.aClass75Array1[local398].method1817();
		}
		for (local398 = 0; local398 < 4; local398++) {
			for (local287 = 0; local287 < 104; local287++) {
				for (local298 = 0; local298 < 104; local298++) {
					Static303.aByteArrayArrayArray19[local398][local287][local298] = 0;
				}
			}
		}
		Static167.method2736(false);
		if (Static294.aBoolean367) {
			Static177.aClass46_Sub1_3.method2479();
			for (local398 = 0; local398 < 13; local398++) {
				for (local287 = 0; local287 < 13; local287++) {
					Static177.aClass48ArrayArray1[local398][local287].aBoolean97 = true;
				}
			}
		}
		if (Static294.aBoolean367) {
			Static191.method3087();
		}
		if (Static294.aBoolean367) {
			Static267.method4034();
		}
		Static248.method3834();
		System.gc();
		Static215.method3449(true);
		Static266.method4023(false);
		if (!Static199.aBoolean418) {
			Static129.method2073(false);
			Static215.method3449(true);
			if (Static294.aBoolean367) {
				local398 = Static56.aClass2_Sub4_Sub2_1.anIntArray283[0] >> 3;
				local287 = Static56.aClass2_Sub4_Sub2_1.anIntArray286[0] >> 3;
				Static196.method3128(local287, local398);
			}
			Static124.method2041(false);
			if (Static175.aByteArrayArray2 != null) {
				Static295.method4527();
			}
		}
		if (Static199.aBoolean418) {
			Static209.method3353(false);
			Static215.method3449(true);
			if (Static294.aBoolean367) {
				local398 = Static56.aClass2_Sub4_Sub2_1.anIntArray283[0] >> 3;
				local287 = Static56.aClass2_Sub4_Sub2_1.anIntArray286[0] >> 3;
				Static196.method3128(local287, local398);
			}
			Static190.method3077(false);
		}
		Static136.method2297();
		Static215.method3449(true);
		Static41.method824(false, Static82.aClass75Array1, Static199.aBoolean418 ? Static309.anIntArrayArrayArray15 : (int[][][]) null);
		if (Static294.aBoolean367) {
			Static191.method3097();
		}
		Static215.method3449(true);
		local398 = Static75.anInt1755;
		if (local398 > Static185.anInt4085) {
			local398 = Static185.anInt4085;
		}
		if (local398 < Static185.anInt4085 - 1) {
		}
		if (Static241.method3782()) {
			Static160.method2559(0);
		} else {
			Static160.method2559(Static75.anInt1755);
		}
		Static2.method34();
		if (Static294.aBoolean367 && local391) {
			Static38.method796(true);
			Static266.method4023(true);
			if (!Static199.aBoolean418) {
				Static129.method2073(true);
				Static215.method3449(true);
				Static124.method2041(true);
			}
			if (Static199.aBoolean418) {
				Static209.method3353(true);
				Static215.method3449(true);
				Static190.method3077(true);
			}
			Static136.method2297();
			Static215.method3449(true);
			Static41.method824(true, Static82.aClass75Array1, Static199.aBoolean418 ? Static309.anIntArrayArrayArray15 : (int[][][]) null);
			Static215.method3449(true);
			Static2.method34();
			Static38.method796(false);
		}
		if (Static294.aBoolean367) {
			for (local287 = 0; local287 < 13; local287++) {
				for (local298 = 0; local298 < 13; local298++) {
					Static177.aClass48ArrayArray1[local287][local298].method1153(Static46.anIntArrayArrayArray1[0], local287 * 8, local298 * 8);
				}
			}
		}
		for (local287 = 0; local287 < 104; local287++) {
			for (local298 = 0; local298 < 104; local298++) {
				Static129.method2068(local287, local298);
			}
		}
		Static254.method3876();
		Static248.method3834();
		Static49.method975();
		Static136.method2297();
		Static236.aBoolean120 = false;
		if (Static294.aBoolean367) {
			Static207.method3278(true);
		}
		if (Static280.aFrame2 != null && Static5.aClass104_5 != null && Static96.anInt2212 == 25) {
			Static2.aClass1_Sub14_Sub1_1.method2252(34);
			Static2.aClass1_Sub14_Sub1_1.method2236(1057001181);
		}
		if (!Static199.aBoolean418) {
			local298 = (Static288.anInt5790 + 6) / 8;
			@Pc(820) int local820 = (Static279.anInt5604 - 6) / 8;
			@Pc(826) int local826 = (Static279.anInt5604 + 6) / 8;
			local287 = (Static288.anInt5790 - 6) / 8;
			for (@Pc(836) int local836 = local287 - 1; local836 <= local298 + 1; local836++) {
				for (@Pc(849) int local849 = local820 - 1; local849 <= local826 + 1; local849++) {
					if (local836 < local287 || local298 < local836 || local849 < local820 || local849 > local826) {
						Static124.aClass168_93.method4048("m" + local836 + "_" + local849);
						Static124.aClass168_93.method4048("l" + local836 + "_" + local849);
					}
				}
			}
		}
		if (Static96.anInt2212 == 28) {
			Static112.method1823(10);
		} else {
			Static112.method1823(30);
			if (Static5.aClass104_5 != null) {
				Static2.aClass1_Sub14_Sub1_1.method2252(207);
			}
		}
		Static215.method3444();
		Static248.method3834();
		Static214.method3430();
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(JI)V")
	public static void method1580(@OriginalArg(0) long arg0) {
		if (Static106.anInt2378 == 1 || Static106.anInt2378 == 5) {
			Static216.method3453(arg0);
		} else if (Static106.anInt2378 == 2) {
			Static109.method1793();
		} else if (Static106.anInt2378 == 4) {
			Static6.method218(arg0);
		} else {
			Static82.method1412();
		}
		if (!Static128.aBoolean171) {
			Static112.aStringArray24[0] = Static181.aString266;
			Static86.aShortArray64[0] = 1003;
			Static190.aStringArray34[0] = "";
			Static144.anIntArray304[0] = Static263.anInt5294;
			if (Static163.anInt3550 != 0) {
				Static57.anInt6304 = Static114.anInt2473;
				Static107.anInt1674 = Static63.anInt1366;
			} else if (Static17.anInt472 == 0) {
				Static57.anInt6304 = Static89.anInt5974;
				Static107.anInt1674 = Static289.anInt5816;
			} else {
				Static57.anInt6304 = Static89.anInt5976;
				Static107.anInt1674 = Static94.anInt2165;
			}
			Static181.anInt3973 = 1;
		}
		Static42.method864((long) Static133.anInt3061);
		if (Static36.anInt902 != -1) {
			Static114.method1844(Static36.anInt902);
		}
		@Pc(103) int local103;
		for (local103 = 0; local103 < Static203.anInt5700; local103++) {
			if (Static29.aBooleanArray6[local103]) {
				Static55.aBooleanArray15[local103] = true;
			}
			Static207.aBooleanArray22[local103] = Static29.aBooleanArray6[local103];
			Static29.aBooleanArray6[local103] = false;
		}
		Static236.anInt1714 = -1;
		Static281.anInt2781 = -1;
		if (Static294.aBoolean367) {
			Static182.aBoolean252 = true;
		}
		Static210.aClass191_9 = null;
		Static21.aClass191_3 = null;
		Static9.anInt283 = Static133.anInt3061;
		if (Static36.anInt902 != -1) {
			Static203.anInt5700 = 0;
			Static102.method728();
		}
		if (Static294.aBoolean367) {
			Static156.method2538();
		} else {
			Static231.method3632();
		}
		Static124.method2034();
		if (Static128.aBoolean171) {
			if (Static161.aBoolean230) {
				Static22.method472();
			} else {
				Static36.method767();
			}
		} else if (Static21.aClass191_3 != null) {
			Static242.method3789(Static192.anInt4222, Static21.aClass191_3, Static296.anInt5899);
		} else if (Static281.anInt2781 != -1) {
			Static242.method3789(Static281.anInt2781, null, Static236.anInt1714);
		}
		local103 = Static128.aBoolean171 ? -1 : Static234.method3704();
		if (local103 == -1) {
			local103 = Static189.anInt4171;
		}
		Static281.method2101(local103);
		if (Static65.anInt1391 == 1) {
			Static65.anInt1391 = 2;
		}
		if (Static38.anInt957 == 1) {
			Static38.anInt957 = 2;
		}
		if (Static206.anInt4453 == 3) {
			for (@Pc(225) int local225 = 0; local225 < Static203.anInt5700; local225++) {
				if (Static207.aBooleanArray22[local225]) {
					if (Static294.aBoolean367) {
						Static156.method2547(Static117.anIntArray424[local225], Static103.anIntArray231[local225], Static197.anIntArray379[local225], Static128.anIntArray278[local225], 16711935, 128);
					} else {
						Static231.method3650(Static117.anIntArray424[local225], Static103.anIntArray231[local225], Static197.anIntArray379[local225], Static128.anIntArray278[local225], 16711935, 128);
					}
				} else if (Static55.aBooleanArray15[local225]) {
					if (Static294.aBoolean367) {
						Static156.method2547(Static117.anIntArray424[local225], Static103.anIntArray231[local225], Static197.anIntArray379[local225], Static128.anIntArray278[local225], 16711680, 128);
					} else {
						Static231.method3650(Static117.anIntArray424[local225], Static103.anIntArray231[local225], Static197.anIntArray379[local225], Static128.anIntArray278[local225], 16711680, 128);
					}
				}
			}
		}
		Static120.method4729(Static56.aClass2_Sub4_Sub2_1.anInt2846, Static185.anInt4085, Static56.aClass2_Sub4_Sub2_1.anInt2794, Static286.anInt5740);
		Static286.anInt5740 = 0;
	}
}
