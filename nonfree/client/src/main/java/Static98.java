import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!ke", name = "gb", descriptor = "I")
	public static int anInt2124 = 0;

	@OriginalMember(owner = "client!ke", name = "kb", descriptor = "[Lclient!qe;")
	public static final Class83[] aClass83Array36 = new Class83[100];

	@OriginalMember(owner = "client!ke", name = "lb", descriptor = "I")
	public static int anInt2128 = 0;

	@OriginalMember(owner = "client!ke", name = "rb", descriptor = "I")
	public static int anInt2134 = 0;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IJ)V")
	public static void method1679(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static85.anInt1875; local12++) {
			if (Static211.aLongArray8[local12] == arg0) {
				Static85.anInt1875--;
				for (@Pc(26) int local26 = local12; local26 < Static85.anInt1875; local26++) {
					Static211.aLongArray8[local26] = Static211.aLongArray8[local26 + 1];
					Static57.aClass83Array28[local26] = Static57.aClass83Array28[local26 + 1];
				}
				Static38.anInt976 = Static29.anInt739;
				Static69.aClass2_Sub3_Sub1_2.method284(197);
				Static69.aClass2_Sub3_Sub1_2.method249(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILclient!ae;IB)V")
	public static void method1680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) int arg3) {
		Static192.method2892();
		Static126.method2119(arg3, arg1, arg3 + arg2.anInt157, arg1 - -arg2.anInt100);
		if (Static170.anInt3526 == 2 || Static170.anInt3526 == 5) {
			Static126.method2122(arg3, arg1, arg2.anIntArray16, arg2.anIntArray6);
		} else {
			@Pc(44) int local44 = Static124.anInt2528 + Static210.anInt4184 & 0x7FF;
			@Pc(51) int local51 = Static54.aClass24_Sub4_Sub1_1.anInt3316 / 32 + 48;
			@Pc(59) int local59 = 464 - Static54.aClass24_Sub4_Sub1_1.anInt3349 / 32;
			((Class2_Sub2_Sub17_Sub1) Static108.aClass2_Sub2_Sub17_3).method1922(arg3, arg1, arg2.anInt157, arg2.anInt100, local51, local59, local44, Static59.anInt1449 + 256, arg2.anIntArray16, arg2.anIntArray6);
			@Pc(96) int local96;
			@Pc(110) int local110;
			for (@Pc(80) int local80 = 0; local80 < Static67.anInt1607; local80++) {
				local96 = Static142.anIntArray295[local80] * 4 + 2 - Static54.aClass24_Sub4_Sub1_1.anInt3316 / 32;
				local110 = Static196.anIntArray376[local80] * 4 + 2 - Static54.aClass24_Sub4_Sub1_1.anInt3349 / 32;
				@Pc(116) Class2_Sub2_Sub20 local116 = Static99.method1689(Static147.anIntArray401[local80]);
				if (local116.anIntArray264 != null) {
					local116 = local116.method2050();
					if (local116 == null || local116.anInt2659 == -1) {
						continue;
					}
				}
				Static120.method2084(arg2, local110, arg3, arg1, Static52.aClass2_Sub2_Sub17Array4[local116.anInt2659], local96);
			}
			@Pc(189) int local189;
			for (local96 = 0; local96 < 104; local96++) {
				for (local110 = 0; local110 < 104; local110++) {
					@Pc(163) Class19 local163 = Static93.aClass19ArrayArrayArray1[Static43.anInt1126][local96][local110];
					if (local163 != null) {
						@Pc(177) int local177 = local96 * 4 + 2 - Static54.aClass24_Sub4_Sub1_1.anInt3316 / 32;
						local189 = local110 * 4 + 2 - Static54.aClass24_Sub4_Sub1_1.anInt3349 / 32;
						Static120.method2084(arg2, local189, arg3, arg1, Static23.aClass2_Sub2_Sub17Array2[0], local177);
					}
				}
			}
			@Pc(269) int local269;
			for (local110 = 0; local110 < Static162.anInt3930; local110++) {
				@Pc(221) Class24_Sub4_Sub2 local221 = Static47.aClass24_Sub4_Sub2Array1[Static207.anIntArray402[local110]];
				if (local221 != null && local221.method2521()) {
					@Pc(230) Class2_Sub2_Sub24 local230 = local221.aClass2_Sub2_Sub24_1;
					if (local230 != null && local230.anIntArray309 != null) {
						local230 = local230.method2447();
					}
					if (local230 != null && local230.aBoolean147 && local230.aBoolean151) {
						local189 = local221.anInt3316 / 32 - Static54.aClass24_Sub4_Sub1_1.anInt3316 / 32;
						local269 = local221.anInt3349 / 32 - Static54.aClass24_Sub4_Sub1_1.anInt3349 / 32;
						Static120.method2084(arg2, local269, arg3, arg1, Static23.aClass2_Sub2_Sub17Array2[1], local189);
					}
				}
			}
			for (@Pc(285) int local285 = 0; local285 < Static21.anInt572; local285++) {
				@Pc(293) Class24_Sub4_Sub1 local293 = Static22.aClass24_Sub4_Sub1Array1[Static10.anIntArray18[local285]];
				if (local293 != null && local293.method2521()) {
					local269 = local293.anInt3349 / 32 - Static54.aClass24_Sub4_Sub1_1.anInt3349 / 32;
					local189 = local293.anInt3316 / 32 - Static54.aClass24_Sub4_Sub1_1.anInt3316 / 32;
					@Pc(323) boolean local323 = false;
					@Pc(328) long local328 = local293.aClass83_664.method2397();
					for (@Pc(330) int local330 = 0; local330 < Static177.anInt3618; local330++) {
						if (local328 == Static139.aLongArray3[local330] && Static10.anIntArray19[local330] != 0) {
							local323 = true;
							break;
						}
					}
					@Pc(363) boolean local363 = false;
					if (Static54.aClass24_Sub4_Sub1_1.anInt2307 != 0 && local293.anInt2307 != 0 && local293.anInt2307 == Static54.aClass24_Sub4_Sub1_1.anInt2307) {
						local363 = true;
					}
					if (local323) {
						Static120.method2084(arg2, local269, arg3, arg1, Static23.aClass2_Sub2_Sub17Array2[3], local189);
					} else if (local363) {
						Static120.method2084(arg2, local269, arg3, arg1, Static23.aClass2_Sub2_Sub17Array2[4], local189);
					} else {
						Static120.method2084(arg2, local269, arg3, arg1, Static23.aClass2_Sub2_Sub17Array2[2], local189);
					}
				}
			}
			@Pc(427) Class76[] local427 = Static163.aClass76Array1;
			@Pc(526) int local526;
			for (local189 = 0; local189 < local427.length; local189++) {
				@Pc(435) Class76 local435 = local427[local189];
				if (local435 != null && local435.anInt3018 != 0 && Static13.anInt386 % 20 < 10) {
					@Pc(496) int local496;
					@Pc(485) int local485;
					if (local435.anInt3018 == 1 && local435.anInt3019 >= 0 && local435.anInt3019 < Static47.aClass24_Sub4_Sub2Array1.length) {
						@Pc(472) Class24_Sub4_Sub2 local472 = Static47.aClass24_Sub4_Sub2Array1[local435.anInt3019];
						if (local472 != null) {
							local485 = local472.anInt3316 / 32 - Static54.aClass24_Sub4_Sub1_1.anInt3316 / 32;
							local496 = local472.anInt3349 / 32 - Static54.aClass24_Sub4_Sub1_1.anInt3349 / 32;
							Static148.method2317(arg3, local435.anInt3013, arg1, arg2, local496, local485);
						}
					}
					if (local435.anInt3018 == 2) {
						local526 = (local435.anInt3017 - Static2.anInt57) * 4 + 2 - Static54.aClass24_Sub4_Sub1_1.anInt3316 / 32;
						local485 = (local435.anInt3015 + -Static123.anInt2755) * 4 + 2 - Static54.aClass24_Sub4_Sub1_1.anInt3349 / 32;
						Static148.method2317(arg3, local435.anInt3013, arg1, arg2, local485, local526);
					}
					if (local435.anInt3018 == 10 && local435.anInt3019 >= 0 && local435.anInt3019 < Static22.aClass24_Sub4_Sub1Array1.length) {
						@Pc(570) Class24_Sub4_Sub1 local570 = Static22.aClass24_Sub4_Sub1Array1[local435.anInt3019];
						if (local570 != null) {
							local485 = local570.anInt3316 / 32 - Static54.aClass24_Sub4_Sub1_1.anInt3316 / 32;
							local496 = local570.anInt3349 / 32 - Static54.aClass24_Sub4_Sub1_1.anInt3349 / 32;
							Static148.method2317(arg3, local435.anInt3013, arg1, arg2, local496, local485);
						}
					}
				}
			}
			if (Static121.anInt2747 != 0) {
				local526 = Static175.anInt3598 * 4 + 2 - Static54.aClass24_Sub4_Sub1_1.anInt3349 / 32;
				local269 = Static121.anInt2747 * 4 + 2 - Static54.aClass24_Sub4_Sub1_1.anInt3316 / 32;
				Static120.method2084(arg2, local526, arg3, arg1, Static110.aClass2_Sub2_Sub17_4, local269);
			}
			Static126.method2138(arg2.anInt157 / 2 + arg3 - 1, arg2.anInt100 / 2 + arg1 + -1, 3, 3, 16777215);
		}
		Static162.aBooleanArray28[arg0] = true;
	}

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "(I)V")
	public static void method1681() {
		if (Static158.aBoolean148 && Static159.anInt3223 != Static43.anInt1126) {
			Static177.method2712(Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], Static2.anInt63, Static101.anInt2323, Static43.anInt1126, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0]);
		} else if (Static201.anInt4000 != Static43.anInt1126) {
			Static201.anInt4000 = Static43.anInt1126;
			Static151.method2346(Static43.anInt1126);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIILclient!rb;IJZ)Z")
	public static boolean method1682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class24 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static213.method3227(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBII)I")
	public static int method1684(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static9.aByteArrayArrayArray7[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static9.aByteArrayArrayArray7[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}
}
