import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray12;

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
	public static int anInt1948;

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
	public static int anInt1946 = 0;

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "Lclient!bd;")
	public static final Class17 aClass17_8 = new Class17(10, 6);

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BII)V")
	public static void method1775(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static302.aFloat7 < Static302.aFloat6) {
			Static302.aFloat7 = (float) ((double) Static302.aFloat7 + (double) Static302.aFloat7 / 30.0D);
			if (Static302.aFloat6 < Static302.aFloat7) {
				Static302.aFloat7 = Static302.aFloat6;
			}
			Static149.method2528();
			Static302.anInt385 = (int) Static302.aFloat7 >> 1;
			Static302.aByteArrayArrayArray2 = Static342.method5240(Static302.anInt385);
		} else if (Static302.aFloat7 > Static302.aFloat6) {
			Static302.aFloat7 = (float) ((double) Static302.aFloat7 - (double) Static302.aFloat7 / 30.0D);
			if (Static302.aFloat6 > Static302.aFloat7) {
				Static302.aFloat7 = Static302.aFloat6;
			}
			Static149.method2528();
			Static302.anInt385 = (int) Static302.aFloat7 >> 1;
			Static302.aByteArrayArrayArray2 = Static342.method5240(Static302.anInt385);
		}
		if (Static76.anInt1481 != -1 && Static203.anInt3731 != -1) {
			@Pc(79) int local79 = Static76.anInt1481 - Static284.anInt5040;
			if (local79 < 2 || local79 > 2) {
				local79 /= 8;
			}
			@Pc(96) int local96 = Static203.anInt3731 - Static318.anInt4656;
			Static284.anInt5040 += local79;
			if (local96 < 2 || local96 > 2) {
				local96 /= 8;
			}
			Static318.anInt4656 += local96;
			if (local79 == 0 && local96 == 0) {
				Static76.anInt1481 = -1;
				Static203.anInt3731 = -1;
			}
			Static149.method2528();
		}
		if (Static276.anInt4916 <= 0) {
			Static10.anInt307 = -1;
			Static358.anInt6273 = -1;
		} else {
			Static269.anInt4775--;
			if (Static269.anInt4775 == 0) {
				Static269.anInt4775 = 100;
				Static276.anInt4916--;
			}
		}
		if (!Static388.aBoolean303 || Static100.aClass210_16 == null) {
			return;
		}
		for (@Pc(167) Class2_Sub39 local167 = (Class2_Sub39) Static100.aClass210_16.method5035(); local167 != null; local167 = (Class2_Sub39) Static100.aClass210_16.method5037()) {
			@Pc(176) Class80 local176 = Static302.aClass211_2.method5049(local167.aClass2_Sub20_1.anInt3000);
			if (Static388.anInt4033 == 0 && local167.method5346(arg0, arg1)) {
				if (local176.aStringArray13 != null) {
					if (local176.aStringArray13[4] != null) {
						Static163.method2688(false, local176.anInt2039, local176.aString24, 0, 1012, (long) local167.aClass2_Sub20_1.anInt3000, -1, -1, local176.aStringArray13[4], true);
					}
					if (local176.aStringArray13[3] != null) {
						Static163.method2688(false, local176.anInt2039, local176.aString24, 0, 1008, (long) local167.aClass2_Sub20_1.anInt3000, -1, -1, local176.aStringArray13[3], true);
					}
					if (local176.aStringArray13[2] != null) {
						Static163.method2688(false, local176.anInt2039, local176.aString24, 0, 1006, (long) local167.aClass2_Sub20_1.anInt3000, -1, -1, local176.aStringArray13[2], true);
					}
					if (local176.aStringArray13[1] != null) {
						Static163.method2688(false, local176.anInt2039, local176.aString24, 0, 1003, (long) local167.aClass2_Sub20_1.anInt3000, -1, -1, local176.aStringArray13[1], true);
					}
					if (local176.aStringArray13[0] != null) {
						Static163.method2688(false, local176.anInt2039, local176.aString24, 0, 1009, (long) local167.aClass2_Sub20_1.anInt3000, -1, -1, local176.aStringArray13[0], true);
					}
				}
				if (!local167.aClass2_Sub20_1.aBoolean223) {
					local167.aClass2_Sub20_1.aBoolean223 = true;
					Static157.method2605(Static26.aClass144_1, local167.aClass2_Sub20_1.anInt3000, local176.anInt2039);
				}
				if (local167.aClass2_Sub20_1.aBoolean223) {
					Static157.method2605(Static101.aClass144_4, local167.aClass2_Sub20_1.anInt3000, local176.anInt2039);
				}
			} else if (local167.aClass2_Sub20_1.aBoolean223) {
				local167.aClass2_Sub20_1.aBoolean223 = false;
				Static157.method2605(Static215.aClass144_7, local167.aClass2_Sub20_1.anInt3000, local176.anInt2039);
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!vk;IIIIIIIIIII)Z")
	public static boolean method1776(@OriginalArg(0) Class239 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg4;
		@Pc(18) int local18 = arg2 - 64;
		@Pc(23) int local23 = arg4 - 64;
		Static287.anIntArrayArray44[64][64] = 99;
		Static203.anIntArrayArray22[64][64] = 0;
		@Pc(43) byte local43 = 0;
		@Pc(45) int local45 = 0;
		Static5.anIntArray808[0] = arg2;
		@Pc(52) int local52 = local43 + 1;
		Static327.anIntArray702[0] = arg4;
		@Pc(57) int[][] local57 = arg0.anIntArrayArray54;
		while (true) {
			label282: while (true) {
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(88) int local88;
				@Pc(94) int local94;
				@Pc(246) int local246;
				@Pc(286) int local286;
				do {
					do {
						do {
							label259: do {
								if (local45 == local52) {
									Static58.anInt5539 = local7;
									Static168.anInt2996 = local9;
									return false;
								}
								local9 = Static327.anIntArray702[local45];
								local7 = Static5.anIntArray808[local45];
								local71 = local7 - local18;
								local76 = local9 - local23;
								local45 = local45 + 1 & 0xFFF;
								local88 = local7 - arg0.anInt6436;
								local94 = local9 - arg0.anInt6445;
								if (arg9 == -4) {
									if (local7 == arg8 && arg5 == local9) {
										Static168.anInt2996 = local9;
										Static58.anInt5539 = local7;
										return true;
									}
								} else if (arg9 == -3) {
									if (Static159.method2669(arg1, arg1, arg3, arg5, local7, arg8, local9, arg10)) {
										Static168.anInt2996 = local9;
										Static58.anInt5539 = local7;
										return true;
									}
								} else if (arg9 == -2) {
									if (arg0.method5556(arg1, arg1, arg10, arg5, arg3, arg6, arg8, local9, local7)) {
										Static58.anInt5539 = local7;
										Static168.anInt2996 = local9;
										return true;
									}
								} else if (arg9 == -1) {
									if (arg0.method5550(arg8, arg10, local7, arg3, local9, arg6, arg5, arg1)) {
										Static58.anInt5539 = local7;
										Static168.anInt2996 = local9;
										return true;
									}
								} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
									if (arg0.method5564(local9, arg7, arg1, arg5, arg9, arg8, local7)) {
										Static58.anInt5539 = local7;
										Static168.anInt2996 = local9;
										return true;
									}
								} else if (arg0.method5548(arg5, arg8, local7, arg9, local9, arg7, arg1)) {
									Static58.anInt5539 = local7;
									Static168.anInt2996 = local9;
									return true;
								}
								local246 = Static203.anIntArrayArray22[local71][local76] + 1;
								if (local71 > 0 && Static287.anIntArrayArray44[local71 - 1][local76] == 0 && (local57[local88 - 1][local94] & 0x43A40000) == 0 && (local57[local88 - 1][local94 + arg1 - 1] & 0x4E240000) == 0) {
									local286 = 1;
									while (true) {
										if (local286 >= arg1 - 1) {
											Static5.anIntArray808[local52] = local7 - 1;
											Static327.anIntArray702[local52] = local9;
											local52 = local52 + 1 & 0xFFF;
											Static287.anIntArrayArray44[local71 - 1][local76] = 2;
											Static203.anIntArrayArray22[local71 - 1][local76] = local246;
											break;
										}
										if ((local57[local88 - 1][local94 + local286] & 0x4FA40000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local71 < 128 - arg1 && Static287.anIntArrayArray44[local71 + 1][local76] == 0 && (local57[arg1 + local88][local94] & 0x60E40000) == 0 && (local57[arg1 + local88][arg1 + local94 - 1] & 0x78240000) == 0) {
									local286 = 1;
									while (true) {
										if (local286 >= arg1 - 1) {
											Static5.anIntArray808[local52] = local7 + 1;
											Static327.anIntArray702[local52] = local9;
											Static287.anIntArrayArray44[local71 + 1][local76] = 8;
											local52 = local52 + 1 & 0xFFF;
											Static203.anIntArrayArray22[local71 + 1][local76] = local246;
											break;
										}
										if ((local57[local88 + arg1][local286 + local94] & 0x78E40000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local76 > 0 && Static287.anIntArrayArray44[local71][local76 - 1] == 0 && (local57[local88][local94 - 1] & 0x43A40000) == 0 && (local57[arg1 + local88 - 1][local94 - 1] & 0x60E40000) == 0) {
									local286 = 1;
									while (true) {
										if (local286 >= arg1 - 1) {
											Static5.anIntArray808[local52] = local7;
											Static327.anIntArray702[local52] = local9 - 1;
											local52 = local52 + 1 & 0xFFF;
											Static287.anIntArrayArray44[local71][local76 - 1] = 1;
											Static203.anIntArrayArray22[local71][local76 - 1] = local246;
											break;
										}
										if ((local57[local88 + local286][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local76 < 128 - arg1 && Static287.anIntArrayArray44[local71][local76 + 1] == 0 && (local57[local88][arg1 + local94] & 0x4E240000) == 0 && (local57[local88 + arg1 - 1][local94 + arg1] & 0x78240000) == 0) {
									local286 = 1;
									while (true) {
										if (arg1 - 1 <= local286) {
											Static5.anIntArray808[local52] = local7;
											Static327.anIntArray702[local52] = local9 + 1;
											Static287.anIntArrayArray44[local71][local76 + 1] = 4;
											local52 = local52 + 1 & 0xFFF;
											Static203.anIntArrayArray22[local71][local76 + 1] = local246;
											break;
										}
										if ((local57[local88 + local286][arg1 + local94] & 0x7E240000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local71 > 0 && local76 > 0 && Static287.anIntArrayArray44[local71 - 1][local76 - 1] == 0 && (local57[local88 - 1][local94 - 1] & 0x43A40000) == 0) {
									local286 = 1;
									while (true) {
										if (local286 >= arg1) {
											Static5.anIntArray808[local52] = local7 - 1;
											Static327.anIntArray702[local52] = local9 - 1;
											local52 = local52 + 1 & 0xFFF;
											Static287.anIntArrayArray44[local71 - 1][local76 - 1] = 3;
											Static203.anIntArrayArray22[local71 - 1][local76 - 1] = local246;
											break;
										}
										if ((local57[local88 - 1][local94 + local286 - 1] & 0x4FA40000) != 0 || (local57[local88 + local286 - 1][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local71 < 128 - arg1 && local76 > 0 && Static287.anIntArrayArray44[local71 + 1][local76 - 1] == 0 && (local57[local88 + arg1][local94 - 1] & 0x60E40000) == 0) {
									local286 = 1;
									while (true) {
										if (arg1 <= local286) {
											Static5.anIntArray808[local52] = local7 + 1;
											Static327.anIntArray702[local52] = local9 - 1;
											Static287.anIntArrayArray44[local71 + 1][local76 - 1] = 9;
											local52 = local52 + 1 & 0xFFF;
											Static203.anIntArrayArray22[local71 + 1][local76 - 1] = local246;
											break;
										}
										if ((local57[local88 + arg1][local94 + local286 - 1] & 0x78E40000) != 0 || (local57[local286 + local88][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local71 > 0 && 128 - arg1 > local76 && Static287.anIntArrayArray44[local71 - 1][local76 + 1] == 0 && (local57[local88 - 1][local94 + arg1] & 0x4E240000) == 0) {
									for (local286 = 1; local286 < arg1; local286++) {
										if ((local57[local88 - 1][local286 + local94] & 0x4FA40000) != 0 || (local57[local286 + local88 - 1][arg1 + local94] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static5.anIntArray808[local52] = local7 - 1;
									Static327.anIntArray702[local52] = local9 + 1;
									Static287.anIntArrayArray44[local71 - 1][local76 + 1] = 6;
									local52 = local52 + 1 & 0xFFF;
									Static203.anIntArrayArray22[local71 - 1][local76 + 1] = local246;
								}
							} while (local71 >= 128 - arg1);
						} while (128 - arg1 <= local76);
					} while (Static287.anIntArrayArray44[local71 + 1][local76 + 1] != 0);
				} while ((local57[arg1 + local88][local94 + arg1] & 0x78240000) != 0);
				for (local286 = 1; local286 < arg1; local286++) {
					if ((local57[local88 + local286][arg1 + local94] & 0x7E240000) != 0 || (local57[local88 + arg1][local286 + local94] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static5.anIntArray808[local52] = local7 + 1;
				Static327.anIntArray702[local52] = local9 + 1;
				local52 = local52 + 1 & 0xFFF;
				Static287.anIntArrayArray44[local71 + 1][local76 + 1] = 12;
				Static203.anIntArrayArray22[local71 + 1][local76 + 1] = local246;
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!km;I)V")
	public static void method1778(@OriginalArg(0) Class82 arg0) {
		@Pc(7) int local7 = Static8.anInt189;
		@Pc(9) int local9 = Static40.anInt6591;
		@Pc(11) int local11 = Static300.anInt5403;
		@Pc(15) int local15 = Static71.anInt1351 - 3;
		if (Static359.aClass5_15 == null || Static284.aClass5_8 == null) {
			if (Static119.aClass71_25.method1560(Static172.anInt3061) && Static119.aClass71_25.method1560(Static178.anInt3184)) {
				Static359.aClass5_15 = arg0.method4514(Static404.method5304(Static119.aClass71_25, Static172.anInt3061, 0));
				@Pc(61) Class224 local61 = Static404.method5304(Static119.aClass71_25, Static178.anInt3184, 0);
				Static284.aClass5_8 = arg0.method4514(local61);
				local61.method5311();
				Static245.aClass5_5 = arg0.method4514(local61);
			} else {
				arg0.method4482(local7, local9, local11, 20, 255 - Static307.anInt5483 << 24 | Static267.anInt4716, 1);
			}
		}
		@Pc(90) int local90;
		@Pc(88) int local88;
		if (Static359.aClass5_15 != null && Static284.aClass5_8 != null) {
			local88 = (local11 - Static284.aClass5_8.method5002() * 2) / Static359.aClass5_15.method5002();
			for (local90 = 0; local90 < local88; local90++) {
				Static359.aClass5_15.method5004(Static284.aClass5_8.method5002() + local7 + local90 * Static359.aClass5_15.method5002(), local9);
			}
			Static284.aClass5_8.method5004(local7, local9);
			Static245.aClass5_5.method5004(local11 + local7 - Static245.aClass5_5.method5002(), local9);
		}
		Static34.aClass13_1.method5602(local9 + 14, Static5.aClass221_239.method5229(Static189.anInt5185), Static175.anInt5035 | 0xFF000000, -1, local7 + 3);
		arg0.method4482(local7, local9 + 20, local11, local15 - 20, Static267.anInt4716 | -Static307.anInt5483 + 255 << 24, 1);
		local88 = Static138.aClass78_1.method1804();
		local90 = Static138.aClass78_1.method1808();
		@Pc(172) int local172 = 0;
		@Pc(199) int local199;
		for (@Pc(181) Class2_Sub7 local181 = (Class2_Sub7) Static66.aClass210_43.method5035(); local181 != null; local181 = (Class2_Sub7) Static66.aClass210_43.method5037()) {
			local199 = local9 + (-1 + Static379.anInt1192 + -local172) * 16 + 20 + 13;
			if (local7 < local88 && local88 < local7 + local11 && local199 - 13 < local90 && local199 + 4 > local90 && local181.aBoolean39) {
				arg0.method4482(local7, local199 - 12, local11, 16, 255 - Static207.anInt3849 << 24 | Static195.anInt3566, 1);
			}
			local172++;
		}
		if ((Static213.aClass5_4 == null || Static284.aClass5_7 == null || Static91.aClass5_2 == null) && Static119.aClass71_25.method1560(Static342.anInt6049) && Static119.aClass71_25.method1560(Static110.anInt2201) && Static119.aClass71_25.method1560(Static10.anInt312)) {
			@Pc(276) Class224 local276 = Static404.method5304(Static119.aClass71_25, Static110.anInt2201, 0);
			Static284.aClass5_7 = arg0.method4514(local276);
			local276.method5311();
			Static306.aClass5_10 = arg0.method4514(local276);
			Static213.aClass5_4 = arg0.method4514(Static404.method5304(Static119.aClass71_25, Static342.anInt6049, 0));
			@Pc(301) Class224 local301 = Static404.method5304(Static119.aClass71_25, Static10.anInt312, 0);
			Static91.aClass5_2 = arg0.method4514(local301);
			local301.method5311();
			Class2_Sub6_Sub4_Sub1.lb = arg0.method4514(local301);
		}
		@Pc(369) int local369;
		@Pc(332) int local332;
		if (Static213.aClass5_4 != null && Static284.aClass5_7 != null && Static91.aClass5_2 != null) {
			local199 = (local11 - Static91.aClass5_2.method5002() * 2) / Static213.aClass5_4.method5002();
			for (local332 = 0; local332 < local199; local332++) {
				Static213.aClass5_4.method5004(local7 + Static91.aClass5_2.method5002() + local332 * Static213.aClass5_4.method5002(), -Static213.aClass5_4.method4999() + local9 + local15);
			}
			local369 = (local15 - Static91.aClass5_2.method4999() - 20) / Static284.aClass5_7.method4999();
			for (@Pc(371) int local371 = 0; local371 < local369; local371++) {
				Static284.aClass5_7.method5004(local7, local9 + Static284.aClass5_7.method4999() * local371 + 20);
				Static306.aClass5_10.method5004(local11 + local7 - Static306.aClass5_10.method5002(), local371 * Static284.aClass5_7.method4999() + 20 + local9);
			}
			Static91.aClass5_2.method5004(local7, local9 + local15 - Static91.aClass5_2.method4999());
			Class2_Sub6_Sub4_Sub1.lb.method5004(local11 + local7 - Static91.aClass5_2.method5002(), -Static91.aClass5_2.method4999() + local15 + local9);
		}
		local172 = 0;
		for (@Pc(437) Class2_Sub7 local437 = (Class2_Sub7) Static66.aClass210_43.method5035(); local437 != null; local437 = (Class2_Sub7) Static66.aClass210_43.method5037()) {
			local332 = (Static379.anInt1192 - local172 - 1) * 16 + local9 + 13 + 20;
			local369 = Static175.anInt5035 | 0xFF000000;
			if (local7 < local88 && local11 + local7 > local88 && local332 - 13 < local90 && local90 < local332 + 4 && local437.aBoolean39) {
				local369 = Static383.anInt6652 | 0xFF000000;
			}
			@Pc(492) int[] local492 = null;
			if (Static79.method1414(local437.anInt541)) {
				local492 = Static106.aClass250_1.method5735((int) local437.aLong22).anIntArray326;
			} else if (local437.anInt546 != -1) {
				local492 = Static106.aClass250_1.method5735(local437.anInt546).anIntArray326;
			} else if (Static27.method683(local437.anInt541)) {
				@Pc(567) Class12_Sub1_Sub2_Sub1 local567 = Static107.aClass12_Sub1_Sub2_Sub1Array1[(int) local437.aLong22];
				if (local567 != null) {
					@Pc(572) Class240 local572 = local567.aClass240_1;
					if (local572.anIntArray781 != null) {
						local572 = local572.method5567(Static248.aClass125_1);
					}
					if (local572 != null) {
						local492 = local572.anIntArray783;
					}
				}
			} else if (Static173.method2826(local437.anInt541)) {
				@Pc(539) Class34 local539;
				if (local437.anInt541 == 1007) {
					local539 = Static11.aClass123_5.method2703((int) local437.aLong22);
				} else {
					local539 = Static11.aClass123_5.method2703((int) (local437.aLong22 >>> 32 & 0x7FFFFFFFL));
				}
				if (local539.anIntArray122 != null) {
					local539 = local539.method831(Static248.aClass125_1);
				}
				if (local539 != null) {
					local492 = local539.anIntArray120;
				}
			}
			@Pc(598) String local598 = Static58.method4853(local437);
			if (local492 != null) {
				local598 = local598 + Static254.method4014(local492);
			}
			Static34.aClass13_1.method5620(Static215.anIntArray491, local598, local7 + 3, local369, Static52.aClass5Array11, local332);
			local172++;
			if (local437.aBoolean38) {
				Static372.aClass5_16.method5004(local7 + Static60.aClass216_3.method5073(local598) + 5, local332 + -12);
			}
		}
		Static380.method5676(Static300.anInt5403, Static8.anInt189, Static40.anInt6591, Static71.anInt1351);
	}
}
