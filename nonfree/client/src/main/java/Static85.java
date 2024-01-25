import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!dd", name = "A", descriptor = "[[B")
	public static byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!dd", name = "D", descriptor = "[I")
	public static final int[] anIntArray174 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[[[BIBII)V")
	private static void method1486(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static108.anInt2350++;
		Static432.anInt7595 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static179.anInt3489; local7 < Static460.anInt7893; local7++) {
			@Pc(12) Class37[][] local12 = Static152.aClass37ArrayArrayArray1[local7];
			for (local14 = Static45.anInt1000; local14 < Static546.anInt9152; local14++) {
				for (@Pc(17) int local17 = Static226.anInt5120; local17 < Static243.anInt4911; local17++) {
					@Pc(24) Class37 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static398.aBooleanArrayArray4[local14 + Static479.anInt8261 - Static489.anInt8410][local17 + Static479.anInt8261 - Static461.anInt7924] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean57 = true;
							local24.aBoolean58 = true;
							if (local24.aClass108_1 == null) {
								local24.aBoolean59 = false;
							} else {
								local24.aBoolean59 = true;
							}
							Static432.anInt7595++;
						} else {
							local24.aBoolean57 = false;
							local24.aBoolean58 = false;
							local24.aByte28 = 0;
							if (local14 >= Static489.anInt8410 - 16 && local14 <= Static489.anInt8410 + 16 && local17 >= Static461.anInt7924 - 16 && local17 <= Static461.anInt7924 + 16 && (local24.aClass15_Sub3_3 != null || local24.aClass15_Sub3_2 != null || local24.aClass15_Sub1_3 != null || local24.aClass15_Sub1_2 != null || local24.aClass15_Sub5_1 != null || local24.aClass108_1 != null)) {
								Static535.aClass2_1.method3046(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static511.aClass131Array6 == Static248.aClass131Array4;
		for (local14 = Static179.anInt3489; local14 < Static460.anInt7893; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static60.aClass62_37.method7062() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static398.aBooleanArrayArray4.length;
				if (Static45.anInt1000 + Static398.aBooleanArrayArray4.length > Static374.anInt6925) {
					local172 -= Static45.anInt1000 + Static398.aBooleanArrayArray4.length - Static374.anInt6925;
				}
				@Pc(192) int local192 = Static398.aBooleanArrayArray4[0].length;
				if (Static226.anInt5120 + Static398.aBooleanArrayArray4[0].length > Static430.anInt7565) {
					local192 -= Static226.anInt5120 + Static398.aBooleanArrayArray4[0].length - Static430.anInt7565;
				}
				@Pc(213) int local213 = Static537.anInt9017;
				while (true) {
					if (local213 >= local172) {
						Static535.aClass2_1.method3042(true, Static248.aClass131Array4[local14], local161, local14);
						break;
					}
					@Pc(220) int local220 = local213 + Static45.anInt1000 - Static537.anInt9017;
					for (@Pc(222) int local222 = Static318.anInt6150; local222 < local192; local222++) {
						Static527.aBooleanArrayArray6[local213][local222] = false;
						if (Static398.aBooleanArrayArray4[local213][local222]) {
							@Pc(241) int local241 = local222 + Static226.anInt5120 - Static318.anInt6150;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static152.aClass37ArrayArrayArray1[local243][local220][local241] != null && Static152.aClass37ArrayArrayArray1[local243][local220][local241].aByte26 == local14) {
									Static527.aBooleanArrayArray6[local213][local222] = Static152.aClass37ArrayArrayArray1[local243][local220][local241].aBoolean57;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static535.aClass2_1.method3042(false, Static248.aClass131Array4[local14], local161, local14);
			}
			Static535.aClass2_1.method3039();
		}
		if (!Static424.method6086(true)) {
			Static424.method6086(false);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!qa;IILclient!m;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method1488(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class78 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static60.aClass62_37 = arg0;
		Static146.anInt3069 = arg1;
		Static339.aClass78_4 = arg3;
		Static537.aBoolean655 = Static60.aClass62_37.method7034() > 0;
		Static489.anInt8410 = arg4 >> Static270.anInt5288;
		Static461.anInt7924 = arg6 >> Static270.anInt5288;
		Static287.anInt5832 = arg4;
		Static500.anInt8550 = arg6;
		Static90.anInt2124 = arg5;
		Static45.anInt1000 = Static489.anInt8410 - Static479.anInt8261;
		if (Static45.anInt1000 < 0) {
			Static537.anInt9017 = -Static45.anInt1000;
			Static45.anInt1000 = 0;
		} else {
			Static537.anInt9017 = 0;
		}
		Static226.anInt5120 = Static461.anInt7924 - Static479.anInt8261;
		if (Static226.anInt5120 < 0) {
			Static318.anInt6150 = -Static226.anInt5120;
			Static226.anInt5120 = 0;
		} else {
			Static318.anInt6150 = 0;
		}
		Static546.anInt9152 = Static489.anInt8410 + Static479.anInt8261;
		if (Static546.anInt9152 > Static374.anInt6925) {
			Static546.anInt9152 = Static374.anInt6925;
		}
		Static243.anInt4911 = Static461.anInt7924 + Static479.anInt8261;
		if (Static243.anInt4911 > Static430.anInt7565) {
			Static243.anInt4911 = Static430.anInt7565;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static479.anInt8261 + Static479.anInt8261 + 2; local74++) {
			for (local77 = 0; local77 < Static479.anInt8261 + Static479.anInt8261 + 2; local77++) {
				local84 = Static489.anInt8410 + local74 - Static479.anInt8261;
				local90 = Static461.anInt7924 + local77 - Static479.anInt8261;
				if (local84 >= 0 && local90 >= 0 && local84 < Static374.anInt6925 && local90 < Static430.anInt7565) {
					@Pc(104) int local104 = local84 << Static270.anInt5288;
					@Pc(108) int local108 = local90 << Static270.anInt5288;
					@Pc(124) int local124 = Static493.aClass131Array5[Static493.aClass131Array5.length - 1].ba(local84, local90) - (0x3E8 << Static270.anInt5288 - 7);
					@Pc(144) int local144 = Static511.aClass131Array6 == null ? Static493.aClass131Array5[0].ba(local84, local90) + Static58.anInt1202 : Static511.aClass131Array6[0].ba(local84, local90) + Static58.anInt1202;
					Static527.aBooleanArrayArray6[local74][local77] = Static60.aClass62_37.B(local104, local124, local108, local104, local144, local108);
				} else {
					Static527.aBooleanArrayArray6[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static479.anInt8261 + Static479.anInt8261 + 1; local77++) {
			for (local84 = 0; local84 < Static479.anInt8261 + Static479.anInt8261 + 1; local84++) {
				Static398.aBooleanArrayArray4[local77][local84] = Static527.aBooleanArrayArray6[local77][local84] || Static527.aBooleanArrayArray6[local77 + 1][local84] || Static527.aBooleanArrayArray6[local77][local84 + 1] || Static527.aBooleanArrayArray6[local77 + 1][local84 + 1];
			}
		}
		Static379.anIntArray548 = arg8;
		Static173.anIntArray254 = arg9;
		Static137.anIntArray163 = arg10;
		Static133.anIntArray232 = arg11;
		Static337.anIntArray472 = arg12;
		Static515.method2862();
		Static134.method2522(Static60.aClass62_37);
		for (@Pc(261) Class30_Sub1 local261 = (Class30_Sub1) Static541.aClass77_13.method2157(); local261 != null; local261 = (Class30_Sub1) Static541.aClass77_13.method2160()) {
			local261.method6004();
			Static431.method6138(local261);
		}
		if (Static537.aBoolean655) {
			for (local90 = 0; local90 < Static511.anInt8700; local90++) {
				Static24.aClass250Array3[local90].method5996(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static60.aClass62_37.method7060(0);
			if (Static535.aClass2_1 == null || Static535.aClass2_1 instanceof Class2_Sub2) {
				Static535.aClass2_1 = new Class2_Sub1();
			}
		} else if (Static535.aClass2_1 == null || Static535.aClass2_1 instanceof Class2_Sub1) {
			Static535.aClass2_1 = new Class2_Sub2();
		}
		Static535.aClass2_1.method3044(arg2);
		Static535.aClass2_1.method3039();
		if (Static231.aClass37ArrayArrayArray2 != null) {
			Static193.method3237(true);
			Static535.aClass2_1.method3043(22);
			method1486(arg2, null, 0, (byte) 0, arg15, arg16);
			Static535.aClass2_1.method3039();
			Static535.aClass2_1.method3043(23);
			Static193.method3237(false);
		}
		method1486(arg2, arg7, arg13, arg14, arg15, arg16);
		Static535.aClass2_1.method3039();
		Static535.aClass2_1.method3037();
		Static535.aClass2_1.method3039();
		if (arg2 > 1) {
			Static60.aClass62_37.method7001(0);
		}
		Static60.aClass62_37.method7059(0, null);
	}
}
