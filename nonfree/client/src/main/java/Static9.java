import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!aj", name = "F", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!aj", name = "N", descriptor = "Lclient!pi;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!aj", name = "I", descriptor = "[I")
	public static int[] anIntArray22 = new int[8];

	@OriginalMember(owner = "client!aj", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString7 = "Unable to find ";

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
	public static void method163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static220.anInt4129 * 128) {
			arg0 = Static220.anInt4129 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static298.anInt5372 * 128) {
			arg2 = Static298.anInt5372 * 128 - 1;
		}
		Static304.anInt5481 = Class87.anIntArray173[arg3];
		Static3.anInt112 = Class87.anIntArray177[arg3];
		Static262.anInt4838 = Class87.anIntArray173[arg4];
		Static43.anInt976 = Class87.anIntArray177[arg4];
		Static156.anInt3124 = arg0;
		Static215.anInt4033 = arg1;
		Static292.anInt5278 = arg2;
		Static66.anInt1366 = arg0 / 128;
		Static196.anInt3902 = arg2 / 128;
		Static230.anInt4306 = Static66.anInt1366 - Static161.anInt3224;
		if (Static230.anInt4306 < 0) {
			Static230.anInt4306 = 0;
		}
		Static226.anInt4247 = Static196.anInt3902 - Static161.anInt3224;
		if (Static226.anInt4247 < 0) {
			Static226.anInt4247 = 0;
		}
		Static82.anInt1810 = Static66.anInt1366 + Static161.anInt3224;
		if (Static82.anInt1810 > Static220.anInt4129) {
			Static82.anInt1810 = Static220.anInt4129;
		}
		Static41.anInt850 = Static196.anInt3902 + Static161.anInt3224;
		if (Static41.anInt850 > Static298.anInt5372) {
			Static41.anInt850 = Static298.anInt5372;
		}
		@Pc(99) short local99;
		if (Static71.aBoolean165) {
			local99 = 3584;
		} else {
			local99 = 3500;
		}
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (local104 = 0; local104 < Static161.anInt3224 + Static161.anInt3224 + 2; local104++) {
			for (local113 = 0; local113 < Static161.anInt3224 + Static161.anInt3224 + 2; local113++) {
				@Pc(130) int local130 = (local104 - Static161.anInt3224 << 7) - (Static156.anInt3124 & 0x7F);
				@Pc(140) int local140 = (local113 - Static161.anInt3224 << 7) - (Static292.anInt5278 & 0x7F);
				@Pc(146) int local146 = Static66.anInt1366 + local104 - Static161.anInt3224;
				@Pc(152) int local152 = Static196.anInt3902 + local113 - Static161.anInt3224;
				if (local146 >= 0 && local152 >= 0 && local146 < Static220.anInt4129 && local152 < Static298.anInt5372) {
					@Pc(176) int local176;
					if (Static124.anIntArrayArrayArray5 == null) {
						local176 = Static24.anIntArrayArrayArray3[0][local146][local152] + 128 - Static215.anInt4033;
					} else {
						local176 = Static124.anIntArrayArrayArray5[0][local146][local152] + 128 - Static215.anInt4033;
					}
					@Pc(201) int local201 = Static24.anIntArrayArrayArray3[3][local146][local152] - Static215.anInt4033 - 1000;
					Static142.aBooleanArrayArray2[local104][local113] = Static54.method988(local130, local201, local176, local140, local99);
				} else {
					Static142.aBooleanArrayArray2[local104][local113] = false;
				}
			}
		}
		for (local104 = 0; local104 < Static161.anInt3224 + Static161.anInt3224 + 1; local104++) {
			for (local113 = 0; local113 < Static161.anInt3224 + Static161.anInt3224 + 1; local113++) {
				Static279.aBooleanArrayArray3[local104][local113] = Static142.aBooleanArrayArray2[local104][local113] || Static142.aBooleanArrayArray2[local104 + 1][local113] || Static142.aBooleanArrayArray2[local104][local113 + 1] || Static142.aBooleanArrayArray2[local104 + 1][local113 + 1];
			}
		}
		Static18.anIntArray37 = arg6;
		Static250.anIntArray511 = arg7;
		Static194.anIntArray408 = arg8;
		Static66.anIntArray109 = arg9;
		Static136.anIntArray213 = arg10;
		Static21.method444();
		if (Static184.aClass1_Sub16ArrayArrayArray1 != null) {
			Static47.method896(true);
			Static238.method3344(arg0, arg1, arg2, null, 0, (byte) 0, arg13, arg14);
			if (Static71.aBoolean165) {
				Static213.aBoolean520 = false;
				Static165.method4612(0, 0);
				Static65.method1148(null);
				Static151.method2644();
			}
			Static47.method896(false);
		}
		Static238.method3344(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!el;)V")
	public static void method164(@OriginalArg(0) Class45 arg0) {
		for (@Pc(2) int local2 = arg0.anInt1360; local2 <= arg0.anInt1362; local2++) {
			for (@Pc(9) int local9 = arg0.anInt1359; local9 <= arg0.anInt1355; local9++) {
				@Pc(22) Class1_Sub16 local22 = Static254.aClass1_Sub16ArrayArrayArray3[arg0.anInt1363][local2][local9];
				if (local22 != null) {
					@Pc(26) int local26;
					for (local26 = 0; local26 < local22.anInt2573; local26++) {
						if (local22.aClass45Array2[local26] == arg0) {
							local22.anInt2573--;
							for (@Pc(44) int local44 = local26; local44 < local22.anInt2573; local44++) {
								local22.aClass45Array2[local44] = local22.aClass45Array2[local44 + 1];
								local22.anIntArray201[local44] = local22.anIntArray201[local44 + 1];
							}
							local22.aClass45Array2[local22.anInt2573] = null;
							break;
						}
					}
					local22.anInt2574 = 0;
					for (local26 = 0; local26 < local22.anInt2573; local26++) {
						local22.anInt2574 |= local22.anIntArray201[local26];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)V")
	public static void method165(@OriginalArg(0) int arg0) {
		Static65.method1149(Static65.anInt1351, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
		Static65.method1146(-50.0F, -60.0F, -50.0F);
		Static65.method1145(Static65.anInt1348, 0, false);
		Static65.method1150();
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIII)V")
	public static void method166(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13;
		@Pc(48) int local48;
		if (Static101.anInt2152 == 0) {
			local13 = Static196.anInt3909;
			@Pc(15) int local15 = Static143.anInt2793;
			@Pc(17) int local17 = Static163.anInt3267;
			@Pc(19) int local19 = Static264.anInt4880;
			@Pc(33) int local33 = (arg2 - arg1) * (local19 - local17) / arg0 + local17;
			local48 = (local15 - local13) * (arg3 - arg4) / arg5 + local13;
			if (Static187.aBoolean318 && (Static96.anInt2071 & 0x40) != 0) {
				@Pc(62) Class157 local62 = Static209.method3469(Static315.anInt5631, Static75.anInt1991);
				if (local62 == null) {
					Static230.method3684();
				} else {
					Static69.method1328(" ->", local33, (short) 40, Static144.anInt2797, Static132.aString88, local48, 0L);
				}
			} else {
				if (Static272.anInt5005 == 1) {
					Static69.method1328("", local33, (short) 14, -1, Static274.aString194, local48, 0L);
				}
				Static69.method1328("", local33, (short) 38, -1, Static84.aString65, local48, 0L);
			}
		}
		@Pc(107) long local107 = -1L;
		for (local13 = 0; local13 < Static256.anInt4784; local13++) {
			@Pc(116) long local116 = Static273.aLongArray11[local13];
			local48 = (int) local116 & 0x7F;
			@Pc(128) int local128 = (int) local116 >> 29 & 0x3;
			@Pc(135) int local135 = (int) local116 >> 7 & 0x7F;
			@Pc(142) int local142 = (int) (local116 >>> 32) & Integer.MAX_VALUE;
			if (local116 != local107) {
				local107 = local116;
				@Pc(228) int local228;
				if (local128 == 2 && Static231.method3703(Static132.anInt2608, local48, local135, local116)) {
					@Pc(169) Class150 local169 = Static160.method2744(local142);
					if (local169.anIntArray507 != null) {
						local169 = local169.method3884();
					}
					if (local169 == null) {
						continue;
					}
					if (Static101.anInt2152 == 1) {
						Static69.method1328(Static199.aString133 + " -> <col=00ffff>" + local169.aString163, local48, (short) 23, Static150.anInt3066, Static253.aString167, local135, local116);
					} else if (Static187.aBoolean318) {
						@Pc(351) Class1_Sub5_Sub2 local351 = Static273.anInt5036 == -1 ? null : Static283.method4279(Static273.anInt5036);
						if ((Static96.anInt2071 & 0x4) != 0 && (local351 == null || local169.method3882(Static273.anInt5036, local351.anInt484) != local351.anInt484)) {
							Static69.method1328(Static176.aString113 + " -> <col=00ffff>" + local169.aString163, local48, (short) 45, Static144.anInt2797, Static132.aString88, local135, local116);
						}
					} else {
						@Pc(217) String[] local217 = local169.aStringArray29;
						if (Static13.aBoolean26) {
							local217 = Static181.method3085(local217);
						}
						if (local217 != null) {
							for (local228 = 4; local228 >= 0; local228--) {
								if (local217[local228] != null) {
									@Pc(242) short local242 = 0;
									if (local228 == 0) {
										local242 = 32;
									}
									if (local228 == 1) {
										local242 = 8;
									}
									@Pc(256) int local256 = -1;
									if (local169.anInt4565 == local228) {
										local256 = local169.anInt4566;
									}
									if (local228 == local169.anInt4564) {
										local256 = local169.anInt4539;
									}
									if (local228 == 2) {
										local242 = 29;
									}
									if (local228 == 3) {
										local242 = 51;
									}
									if (local228 == 4) {
										local242 = 1006;
									}
									Static69.method1328("<col=00ffff>" + local169.aString163, local48, local242, local256, local217[local228], local135, local116);
								}
							}
						}
						Static69.method1328("<col=00ffff>" + local169.aString163, local48, (short) 1010, Static314.anInt5630, Static34.aString26, local135, (long) local169.anInt4558);
					}
				}
				@Pc(502) int local502;
				@Pc(513) int local513;
				@Pc(451) int local451;
				@Pc(465) int local465;
				@Pc(478) Class11_Sub4_Sub2 local478;
				@Pc(584) Class11_Sub4_Sub1 local584;
				if (local128 == 1) {
					@Pc(403) Class11_Sub4_Sub2 local403 = Static138.aClass11_Sub4_Sub2Array2[local142];
					if ((local403.aClass183_1.anInt5436 & 0x1) == 0 && (local403.anInt3865 & 0x7F) == 0 && (local403.anInt3856 & 0x7F) == 0 || (local403.aClass183_1.anInt5436 & 0x1) == 1 && (local403.anInt3865 & 0x7F) == 64 && (local403.anInt3856 & 0x7F) == 64) {
						local451 = local403.anInt3865 - (local403.aClass183_1.anInt5436 - 1) * 64;
						local228 = local403.anInt3856 + 64 - local403.aClass183_1.anInt5436 * 64;
						for (local465 = 0; local465 < Static1.anInt48; local465++) {
							local478 = Static138.aClass11_Sub4_Sub2Array2[Static288.anIntArray572[local465]];
							if (local478 != null && !local478.aBoolean333 && local478 != local403 && local478.aBoolean332) {
								local502 = local478.anInt3865 + 64 - local478.aClass183_1.anInt5436 * 64;
								local513 = local478.anInt3856 - (local478.aClass183_1.anInt5436 - 1) * 64;
								if (local502 >= local451 && local478.aClass183_1.anInt5436 <= local403.aClass183_1.anInt5436 - (local502 - local451 >> 7) && local513 >= local228 && local478.aClass183_1.anInt5436 <= local403.aClass183_1.anInt5436 - (local513 - local228 >> 7)) {
									Static131.method2288(local478.aClass183_1, Static288.anIntArray572[local465], local48, local135);
									local478.aBoolean333 = true;
								}
							}
						}
						for (local465 = 0; local465 < Static275.anInt5043; local465++) {
							local584 = Static14.aClass11_Sub4_Sub1Array1[Static135.anIntArray210[local465]];
							if (local584 != null && !local584.aBoolean333 && local584.aBoolean332) {
								local502 = local584.anInt3865 + 64 - local584.method3347() * 64;
								local513 = local584.anInt3856 - (local584.method3347() - 1) * 64;
								if (local502 >= local451 && local584.method3347() <= local403.aClass183_1.anInt5436 - (local502 - local451 >> 7) && local513 >= local228 && local584.method3347() <= local403.aClass183_1.anInt5436 - (local513 - local228 >> 7)) {
									Static41.method731(local584, Static135.anIntArray210[local465], local135, local48);
									local584.aBoolean333 = true;
								}
							}
						}
					}
					if (local403.aBoolean333) {
						continue;
					}
					Static131.method2288(local403.aClass183_1, local142, local48, local135);
					local403.aBoolean333 = true;
				}
				if (local128 == 0) {
					@Pc(689) Class11_Sub4_Sub1 local689 = Static14.aClass11_Sub4_Sub1Array1[local142];
					if ((local689.anInt3865 & 0x7F) == 64 && (local689.anInt3856 & 0x7F) == 64) {
						local451 = local689.anInt3865 - (local689.method3347() - 1) * 64;
						local228 = local689.anInt3856 - (local689.method3347() - 1) * 64;
						for (local465 = 0; local465 < Static1.anInt48; local465++) {
							local478 = Static138.aClass11_Sub4_Sub2Array2[Static288.anIntArray572[local465]];
							if (local478 != null && !local478.aBoolean333 && local478.aBoolean332) {
								local502 = local478.anInt3865 + 64 - local478.aClass183_1.anInt5436 * 64;
								local513 = local478.anInt3856 - (local478.aClass183_1.anInt5436 - 1) * 64;
								if (local502 >= local451 && local478.aClass183_1.anInt5436 <= local689.method3347() - (local502 - local451 >> 7) && local513 >= local228 && local478.aClass183_1.anInt5436 <= local689.method3347() - (local513 - local228 >> 7)) {
									Static131.method2288(local478.aClass183_1, Static288.anIntArray572[local465], local48, local135);
									local478.aBoolean333 = true;
								}
							}
						}
						for (local465 = 0; local465 < Static275.anInt5043; local465++) {
							local584 = Static14.aClass11_Sub4_Sub1Array1[Static135.anIntArray210[local465]];
							if (local584 != null && !local584.aBoolean333 && local689 != local584 && local584.aBoolean332) {
								local502 = local584.anInt3865 - (local584.method3347() - 1) * 64;
								local513 = local584.anInt3856 + 64 - local584.method3347() * 64;
								if (local451 <= local502 && local584.method3347() <= local689.method3347() - (local502 - local451 >> 7) && local513 >= local228 && local584.method3347() <= local689.method3347() - (local513 - local228 >> 7)) {
									Static41.method731(local584, Static135.anIntArray210[local465], local135, local48);
									local584.aBoolean333 = true;
								}
							}
						}
					}
					if (local689.aBoolean333) {
						continue;
					}
					Static41.method731(local689, local142, local135, local48);
					local689.aBoolean333 = true;
				}
				if (local128 == 3) {
					@Pc(962) Class96 local962 = Static203.aClass96ArrayArrayArray5[Static132.anInt2608][local48][local135];
					if (local962 != null) {
						for (@Pc(970) Class1_Sub5_Sub11 local970 = (Class1_Sub5_Sub11) local962.method2345(); local970 != null; local970 = (Class1_Sub5_Sub11) local962.method2347()) {
							local228 = local970.aClass11_Sub7_1.anInt5178;
							@Pc(981) Class3 local981 = Static69.method1330(local228);
							if (Static101.anInt2152 == 1) {
								Static69.method1328(Static199.aString133 + " -> <col=ff9040>" + local981.aString3, local48, (short) 58, Static150.anInt3066, Static253.aString167, local135, (long) local228);
							} else if (Static187.aBoolean318) {
								@Pc(1147) Class1_Sub5_Sub2 local1147 = Static273.anInt5036 == -1 ? null : Static283.method4279(Static273.anInt5036);
								if ((Static96.anInt2071 & 0x1) != 0 && (local1147 == null || local981.method76(Static273.anInt5036, local1147.anInt484) != local1147.anInt484)) {
									Static69.method1328(Static176.aString113 + " -> <col=ff9040>" + local981.aString3, local48, (short) 59, Static144.anInt2797, Static132.aString88, local135, (long) local228);
								}
							} else {
								@Pc(1015) String[] local1015 = local981.aStringArray2;
								if (Static13.aBoolean26) {
									local1015 = Static181.method3085(local1015);
								}
								for (local502 = 4; local502 >= 0; local502--) {
									if (local1015 != null && local1015[local502] != null) {
										@Pc(1039) int local1039 = -1;
										@Pc(1041) byte local1041 = 0;
										if (local502 == 0) {
											local1041 = 10;
										}
										if (local502 == local981.anInt176) {
											local1039 = local981.anInt156;
										}
										if (local502 == 1) {
											local1041 = 6;
										}
										if (local502 == local981.anInt153) {
											local1039 = local981.anInt162;
										}
										if (local502 == 2) {
											local1041 = 37;
										}
										if (local502 == 3) {
											local1041 = 43;
										}
										if (local502 == 4) {
											local1041 = 48;
										}
										Static69.method1328("<col=ff9040>" + local981.aString3, local48, local1041, local1039, local1015[local502], local135, (long) local228);
									}
								}
								Static69.method1328("<col=ff9040>" + local981.aString3, local48, (short) 1007, Static314.anInt5630, Static34.aString26, local135, (long) local228);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "([BII)I")
	public static int method168(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static220.method3564(arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLclient!fh;)Lclient!gk;")
	public static Class67 method169(@OriginalArg(1) Class1_Sub13 arg0) {
		@Pc(13) Class67 local13 = new Class67();
		local13.anInt1904 = arg0.method1879();
		local13.aClass1_Sub5_Sub19_1 = Static271.method4175(local13.anInt1904);
		return local13;
	}

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "(B)V")
	public static void method170() {
		Static273.aClass175_41.method4287();
	}
}
