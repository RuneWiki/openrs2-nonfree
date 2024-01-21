import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!qb", name = "M", descriptor = "Lclient!b;")
	public static Class1_Sub2_Sub2_Sub1 aClass1_Sub2_Sub2_Sub1_16;

	@OriginalMember(owner = "client!qb", name = "N", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1366 = Static78.method1313("skill)2");

	@OriginalMember(owner = "client!qb", name = "P", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1367 = Static78.method1313(" loggt sich ein)3");

	@OriginalMember(owner = "client!qb", name = "T", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1368 = Static78.method1313("Attack");

	@OriginalMember(owner = "client!qb", name = "U", descriptor = "I")
	public static int anInt2779 = 0;

	@OriginalMember(owner = "client!qb", name = "V", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1369 = aClass25_1368;

	@OriginalMember(owner = "client!qb", name = "X", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1370 = aClass25_1366;

	@OriginalMember(owner = "client!qb", name = "Y", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1371 = Static78.method1313("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!qb", name = "Z", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1372 = Static78.method1313("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)V")
	public static void method1965() {
		try {
			if (Static88.anInt1984 == 1) {
				@Pc(17) int local17 = Static89.aClass1_Sub3_Sub1_2.method344();
				if (local17 > 0 && Static89.aClass1_Sub3_Sub1_2.method336()) {
					local17 -= Static1.anInt19;
					if (local17 < 0) {
						local17 = 0;
					}
					Static89.aClass1_Sub3_Sub1_2.method340(local17);
				} else {
					Static89.aClass1_Sub3_Sub1_2.method317();
					Static89.aClass1_Sub3_Sub1_2.method335();
					Static120.aClass18_1 = null;
					if (Static53.aClass56_78 == null) {
						Static88.anInt1984 = 0;
					} else {
						Static88.anInt1984 = 2;
					}
					Static100.aClass1_Sub10_1 = null;
				}
			}
		} catch (@Pc(56) Exception local56) {
			local56.printStackTrace();
			Static89.aClass1_Sub3_Sub1_2.method317();
			Static53.aClass56_78 = null;
			Static120.aClass18_1 = null;
			Static88.anInt1984 = 0;
			Static100.aClass1_Sub10_1 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "(B)V")
	public static void method1966() {
		aClass25_1370 = null;
		aClass25_1369 = null;
		aClass25_1366 = null;
		aClass25_1367 = null;
		aClass25_1372 = null;
		aClass1_Sub2_Sub2_Sub1_16 = null;
		aClass25_1368 = null;
		aClass25_1371 = null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!ob;BI)I")
	public static int method1967(@OriginalArg(0) Class1_Sub2_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray21 == null || arg1 >= arg0.anIntArrayArray21.length) {
			return -2;
		}
		try {
			@Pc(20) int[] local20 = arg0.anIntArrayArray21[arg1];
			@Pc(27) int local27 = 0;
			@Pc(29) byte local29 = 0;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(36) int local36 = local20[local31++];
				@Pc(38) int local38 = 0;
				@Pc(40) byte local40 = 0;
				if (local36 == 0) {
					return local27;
				}
				if (local36 == 1) {
					local38 = Static15.anIntArray79[local20[local31++]];
				}
				if (local36 == 2) {
					local38 = Static50.anIntArray245[local20[local31++]];
				}
				if (local36 == 15) {
					local40 = 1;
				}
				if (local36 == 16) {
					local40 = 2;
				}
				if (local36 == 17) {
					local40 = 3;
				}
				if (local36 == 3) {
					local38 = Static120.anIntArray487[local20[local31++]];
				}
				@Pc(109) int local109;
				@Pc(120) Class1_Sub2_Sub14 local120;
				@Pc(125) int local125;
				@Pc(137) int local137;
				if (local36 == 4) {
					local109 = local20[local31++] << 16;
					@Pc(116) int local116 = local109 + local20[local31++];
					local120 = Static46.method968(local116);
					local125 = local20[local31++];
					if (local125 != -1 && (!Static33.method736(local125).aBoolean104 || Static23.aBoolean21)) {
						for (local137 = 0; local137 < local120.anIntArray341.length; local137++) {
							if (local125 + 1 == local120.anIntArray341[local137]) {
								local38 += local120.anIntArray344[local137];
							}
						}
					}
				}
				if (local36 == 5) {
					local38 = Static95.anIntArray385[local20[local31++]];
				}
				if (local36 == 6) {
					local38 = Class68.anIntArray412[Static50.anIntArray245[local20[local31++]] - 1];
				}
				if (local36 == 7) {
					local38 = Static95.anIntArray385[local20[local31++]] * 100 / 46875;
				}
				if (local36 == 8) {
					local38 = Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2840;
				}
				if (local36 == 9) {
					for (local109 = 0; local109 < 25; local109++) {
						if (Static129.aBooleanArray15[local109]) {
							local38 += Static50.anIntArray245[local109];
						}
					}
				}
				if (local36 == 10) {
					local109 = local20[local31++] << 16;
					local109 += local20[local31++];
					local120 = Static46.method968(local109);
					local125 = local20[local31++];
					if (local125 != -1 && (!Static33.method736(local125).aBoolean104 || Static23.aBoolean21)) {
						for (local137 = 0; local137 < local120.anIntArray341.length; local137++) {
							if (local125 + 1 == local120.anIntArray341[local137]) {
								local38 = 999999999;
								break;
							}
						}
					}
				}
				if (local36 == 11) {
					local38 = Static47.anInt1209;
				}
				if (local36 == 12) {
					local38 = Static39.anInt1095;
				}
				if (local36 == 13) {
					local109 = Static95.anIntArray385[local20[local31++]];
					@Pc(324) int local324 = local20[local31++];
					local38 = (local109 & 0x1 << local324) == 0 ? 0 : 1;
				}
				if (local36 == 14) {
					local109 = local20[local31++];
					local38 = Static49.method984(local109);
				}
				if (local36 == 18) {
					local38 = (Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2832 >> 7) + Static46.anInt1190;
				}
				if (local36 == 19) {
					local38 = Static47.anInt1211 + (Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2827 >> 7);
				}
				if (local36 == 20) {
					local38 = local20[local31++];
				}
				if (local40 == 0) {
					if (local29 == 0) {
						local27 += local38;
					}
					if (local29 == 1) {
						local27 -= local38;
					}
					if (local29 == 2 && local38 != 0) {
						local27 /= local38;
					}
					if (local29 == 3) {
						local27 *= local38;
					}
					local29 = 0;
				} else {
					local29 = local40;
				}
			}
		} catch (@Pc(433) Exception local433) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIBII)V")
	public static void method1970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static35.aClass1_Sub2_Sub2_Sub4Array1[0].method1953(arg1, arg3);
		Static35.aClass1_Sub2_Sub2_Sub4Array1[1].method1953(arg1, arg3 + arg4 - 16);
		@Pc(24) int local24 = arg4 * (arg4 - 32) / arg2;
		if (local24 < 8) {
			local24 = 8;
		}
		@Pc(45) int local45 = (arg4 - local24 - 32) * arg0 / (arg2 - arg4);
		Static128.method1935(arg1, arg3 + 16, 16, arg4 - 32, Static120.anInt2859);
		Static128.method1935(arg1, local45 + arg3 + 16, 16, local24, Static109.anInt2508);
		Static128.method1947(arg1, arg3 + local45 + 16, local24, Static83.anInt1836);
		Static128.method1947(arg1 + 1, local45 + (arg3 - -16), local24, Static83.anInt1836);
		Static128.method1944(arg1, arg3 + local45 + 16, 16, Static83.anInt1836);
		Static128.method1944(arg1, local45 + arg3 + 17, 16, Static83.anInt1836);
		Static128.method1947(arg1 + 15, arg3 + 16 + local45, local24, Static16.anInt441);
		Static128.method1947(arg1 + 14, local45 + 17 + arg3, local24 - 1, Static16.anInt441);
		Static128.method1944(arg1, arg3 + local45 + local24 + 15, 16, Static16.anInt441);
		Static128.method1944(arg1 + 1, local24 + arg3 - (-14 - local45), 15, Static16.anInt441);
	}
}
