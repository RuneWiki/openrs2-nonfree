import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!rb", name = "F", descriptor = "[[I")
	public static int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!rb", name = "Y", descriptor = "[I")
	public static int[] anIntArray237;

	@OriginalMember(owner = "client!rb", name = "bb", descriptor = "[I")
	public static int[] anIntArray238;

	@OriginalMember(owner = "client!rb", name = "jb", descriptor = "I")
	public static int anInt2401;

	@OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
	public static volatile int anInt2384 = 0;

	@OriginalMember(owner = "client!rb", name = "J", descriptor = "Lclient!rc;")
	private static Class55 aClass55_991 = Static34.method846("Existing user");

	@OriginalMember(owner = "client!rb", name = "K", descriptor = "Lclient!rc;")
	public static Class55 aClass55_992 = Static34.method846("Wen m-Ochten Sie der Liste hinzuf-Ugen?");

	@OriginalMember(owner = "client!rb", name = "L", descriptor = "I")
	public static int anInt2389 = 0;

	@OriginalMember(owner = "client!rb", name = "O", descriptor = "I")
	public static int anInt2391 = 0;

	@OriginalMember(owner = "client!rb", name = "P", descriptor = "I")
	public static int anInt2392 = 0;

	@OriginalMember(owner = "client!rb", name = "R", descriptor = "I")
	public static int anInt2394 = 0;

	@OriginalMember(owner = "client!rb", name = "V", descriptor = "[I")
	public static int[] anIntArray236 = new int[5];

	@OriginalMember(owner = "client!rb", name = "X", descriptor = "Lclient!rc;")
	public static Class55 aClass55_993 = Static34.method846("sch-Utteln:");

	@OriginalMember(owner = "client!rb", name = "ab", descriptor = "Lclient!rc;")
	private static Class55 aClass55_994 = Static34.method846("glow1:");

	@OriginalMember(owner = "client!rb", name = "cb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_995 = Static34.method846("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!rb", name = "db", descriptor = "Lclient!rc;")
	public static Class55 aClass55_996 = aClass55_994;

	@OriginalMember(owner = "client!rb", name = "eb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_997 = aClass55_995;

	@OriginalMember(owner = "client!rb", name = "gb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_998 = aClass55_991;

	@OriginalMember(owner = "client!rb", name = "ib", descriptor = "I")
	public static int anInt2400 = 0;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
	public static void method1632() {
		aClass55_997 = null;
		anIntArray237 = null;
		aClass55_993 = null;
		aClass55_994 = null;
		anIntArray236 = null;
		aClass55_991 = null;
		anIntArrayArray19 = null;
		aClass55_995 = null;
		anIntArray238 = null;
		aClass55_996 = null;
		aClass55_998 = null;
		aClass55_992 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II[BIII[Lclient!sb;III)V")
	public static void method1633(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class57[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(8) int local8 = 0; local8 < 8; local8++) {
			for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
				if (arg3 + local8 > 0 && arg3 + local8 < 103 && arg2 + local12 > 0 && local12 + arg2 < 103) {
					arg5[arg0].anIntArrayArray20[local8 + arg3][local12 + arg2] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(83) Class6_Sub1 local83 = new Class6_Sub1(arg1);
		for (@Pc(85) int local85 = 0; local85 < 4; local85++) {
			for (@Pc(89) int local89 = 0; local89 < 64; local89++) {
				for (@Pc(93) int local93 = 0; local93 < 64; local93++) {
					if (arg4 == local85 && local89 >= arg7 && arg7 + 8 > local89 && local93 >= arg8 && arg8 + 8 > local93) {
						Static108.method2014(local83, 0, arg0, arg3 + Static55.method1171(arg6, local93 & 0x7, local89 & 0x7), arg6, 0, arg2 + Static28.method737(arg6, local93 & 0x7, local89 & 0x7));
					} else {
						Static108.method2014(local83, 0, 0, -1, 0, 0, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V")
	private static void method1634() {
		if (Static31.anInt1201 == 0) {
			return;
		}
		@Pc(10) Class6_Sub2_Sub2_Sub4 local10 = Static4.aClass6_Sub2_Sub2_Sub4_6;
		@Pc(12) int local12 = 0;
		if (Static19.anInt945 != 0) {
			local12 = 1;
		}
		for (@Pc(21) int local21 = 0; local21 < 100; local21++) {
			if (Static29.aClass55Array10[local21] != null) {
				@Pc(31) int local31 = Static100.anIntArray276[local21];
				@Pc(35) Class55 local35 = Static74.aClass55Array16[local21];
				@Pc(37) byte local37 = 0;
				if (local35 != null && local35.method1659(Static63.aClass55_750)) {
					local37 = 1;
					local35 = local35.method1673(5);
				}
				if (local35 != null && local35.method1659(Static34.aClass55_505)) {
					local35 = local35.method1673(5);
					local37 = 2;
				}
				@Pc(96) int local96;
				if ((local31 == 3 || local31 == 7) && (local31 == 7 || Static112.anInt3231 == 0 || Static112.anInt3231 == 1 && Static57.method1186(local35))) {
					local96 = 329 - local12 * 13;
					local10.method1303(Static7.aClass55_126, 4, local96, 0);
					local12++;
					local10.method1303(Static7.aClass55_126, 4, local96 - 1, 65535);
					@Pc(117) int local117 = local10.method1301(Static7.aClass55_126) + 4;
					local117 += local10.method1293(32);
					if (local37 == 1) {
						Static57.aClass6_Sub2_Sub2_Sub1Array29[0].method318(local117, local96 - 12);
						local117 += 14;
					}
					if (local37 == 2) {
						Static57.aClass6_Sub2_Sub2_Sub1Array29[1].method318(local117, local96 - 12);
						local117 += 14;
					}
					local10.method1303(Static89.method1698(new Class55[] { local35, Static47.aClass55_587, Static29.aClass55Array10[local21] }), local117, local96, 0);
					local10.method1303(Static89.method1698(new Class55[] { local35, Static47.aClass55_587, Static29.aClass55Array10[local21] }), local117, local96 - 1, 65535);
					if (local12 >= 5) {
						return;
					}
				}
				if (local31 == 5 && Static112.anInt3231 < 2) {
					local96 = 329 - local12 * 13;
					local12++;
					local10.method1303(Static29.aClass55Array10[local21], 4, local96, 0);
					local10.method1303(Static29.aClass55Array10[local21], 4, local96 - 1, 65535);
					if (local12 >= 5) {
						return;
					}
				}
				if (local31 == 6 && Static112.anInt3231 < 2) {
					local96 = 329 - local12 * 13;
					local10.method1303(Static89.method1698(new Class55[] { Static17.aClass55_319, Static71.aClass55_859, local35, Static47.aClass55_587, Static29.aClass55Array10[local21] }), 4, local96, 0);
					local10.method1303(Static89.method1698(new Class55[] { Static17.aClass55_319, Static71.aClass55_859, local35, Static47.aClass55_587, Static29.aClass55Array10[local21] }), 4, local96 - 1, 65535);
					local12++;
					if (local12 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)V")
	public static void method1635() {
		if (Static43.anInt1463 == 0 && Static102.anInt3029 == 0) {
			Static86.method1643(4, Static27.anInt1358, 0, Static34.aClass55_502, Static72.aClass55_864, Static58.anInt1741);
		}
		@Pc(29) int local29 = -1;
		for (@Pc(36) int local36 = 0; local36 < Static42.anInt1453; local36++) {
			@Pc(42) int local42 = Static42.anIntArray119[local36];
			@Pc(46) int local46 = local42 & 0x7F;
			@Pc(52) int local52 = local42 >> 29 & 0x3;
			@Pc(58) int local58 = local42 >> 14 & 0x7FFF;
			@Pc(64) int local64 = local42 >> 7 & 0x7F;
			if (local29 != local42) {
				local29 = local42;
				@Pc(119) int local119;
				if (local52 == 2 && Static109.aClass34_1.method1022(Static56.anInt1718, local46, local64, local42) >= 0) {
					@Pc(83) Class6_Sub2_Sub15 local83 = Static8.method333(local58);
					if (local83.anIntArray278 != null) {
						local83 = local83.method1937();
					}
					if (local83 == null) {
						continue;
					}
					if (Static43.anInt1463 == 1) {
						Static86.method1643(18, local64, local42, Static89.method1698(new Class55[] { Static22.aClass55_370, Static89.aClass55_1024, local83.aClass55_1253 }), Static34.aClass55_513, local46);
					} else if (Static102.anInt3029 != 1) {
						@Pc(109) Class55[] local109 = local83.aClass55Array25;
						if (Static107.aBoolean158) {
							local109 = Static77.method1533(local109);
						}
						if (local109 != null) {
							for (local119 = 4; local119 >= 0; local119--) {
								if (local109[local119] != null) {
									@Pc(131) short local131 = 0;
									if (local119 == 0) {
										local131 = 7;
									}
									if (local119 == 1) {
										local131 = 19;
									}
									if (local119 == 2) {
										local131 = 49;
									}
									if (local119 == 3) {
										local131 = 52;
									}
									if (local119 == 4) {
										local131 = 1004;
									}
									Static86.method1643(local131, local64, local42, Static89.method1698(new Class55[] { Static58.aClass55_678, local83.aClass55_1253 }), local109[local119], local46);
								}
							}
						}
						Static86.method1643(1002, local64, local83.anInt3013 << 14, Static89.method1698(new Class55[] { Static58.aClass55_678, local83.aClass55_1253 }), Static39.aClass55_660, local46);
					} else if ((Static66.anInt1971 & 0x4) == 4) {
						Static86.method1643(45, local64, local42, Static89.method1698(new Class55[] { Static86.aClass55_1000, Static89.aClass55_1024, local83.aClass55_1253 }), Static66.aClass55_780, local46);
					}
				}
				@Pc(309) int local309;
				@Pc(317) Class6_Sub2_Sub3_Sub1_Sub2 local317;
				@Pc(372) Class6_Sub2_Sub3_Sub1_Sub1 local372;
				if (local52 == 1) {
					@Pc(286) Class6_Sub2_Sub3_Sub1_Sub2 local286 = Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1[local58];
					if (local286.aClass6_Sub2_Sub4_1.anInt857 == 1 && (local286.anInt2710 & 0x7F) == 64 && (local286.anInt2744 & 0x7F) == 64) {
						for (local309 = 0; local309 < Static111.anInt3173; local309++) {
							local317 = Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1[Static19.anIntArray60[local309]];
							if (local317 != null && local286 != local317 && local317.aClass6_Sub2_Sub4_1.anInt857 == 1 && local286.anInt2710 == local317.anInt2710 && local317.anInt2744 == local286.anInt2744) {
								Static81.method1566(Static19.anIntArray60[local309], local46, local317.aClass6_Sub2_Sub4_1, local64);
							}
						}
						for (local119 = 0; local119 < Static78.anInt2246; local119++) {
							local372 = Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[Static101.anIntArray283[local119]];
							if (local372 != null && local372.anInt2710 == local286.anInt2710 && local286.anInt2744 == local372.anInt2744) {
								Static95.method1838(local64, local46, local372, Static101.anIntArray283[local119]);
							}
						}
					}
					Static81.method1566(local58, local46, local286.aClass6_Sub2_Sub4_1, local64);
				}
				if (local52 == 0) {
					@Pc(417) Class6_Sub2_Sub3_Sub1_Sub1 local417 = Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[local58];
					if ((local417.anInt2710 & 0x7F) == 64 && (local417.anInt2744 & 0x7F) == 64) {
						for (local309 = 0; local309 < Static111.anInt3173; local309++) {
							local317 = Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1[Static19.anIntArray60[local309]];
							if (local317 != null && local317.aClass6_Sub2_Sub4_1.anInt857 == 1 && local417.anInt2710 == local317.anInt2710 && local317.anInt2744 == local417.anInt2744) {
								Static81.method1566(Static19.anIntArray60[local309], local46, local317.aClass6_Sub2_Sub4_1, local64);
							}
						}
						for (local119 = 0; local119 < Static78.anInt2246; local119++) {
							local372 = Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[Static101.anIntArray283[local119]];
							if (local372 != null && local417 != local372 && local372.anInt2710 == local417.anInt2710 && local372.anInt2744 == local417.anInt2744) {
								Static95.method1838(local64, local46, local372, Static101.anIntArray283[local119]);
							}
						}
					}
					Static95.method1838(local64, local46, local417, local58);
				}
				if (local52 == 3) {
					@Pc(539) Class3 local539 = Static105.aClass3ArrayArrayArray1[Static56.anInt1718][local46][local64];
					if (local539 != null) {
						for (@Pc(546) Class6_Sub2_Sub3_Sub5 local546 = (Class6_Sub2_Sub3_Sub5) local539.method25(); local546 != null; local546 = (Class6_Sub2_Sub3_Sub5) local539.method32()) {
							@Pc(553) Class6_Sub2_Sub5 local553 = Static58.method1195(local546.anInt2287);
							if (Static43.anInt1463 == 1) {
								Static86.method1643(37, local64, local546.anInt2287, Static89.method1698(new Class55[] { Static22.aClass55_370, Static77.aClass55_893, local553.aClass55_392 }), Static34.aClass55_513, local46);
							} else if (Static102.anInt3029 != 1) {
								@Pc(599) Class55[] local599 = local553.aClass55Array7;
								if (Static107.aBoolean158) {
									local599 = Static77.method1533(local599);
								}
								for (@Pc(607) int local607 = 4; local607 >= 0; local607--) {
									if (local599 != null && local599[local607] != null) {
										@Pc(617) byte local617 = 0;
										if (local607 == 0) {
											local617 = 47;
										}
										if (local607 == 1) {
											local617 = 26;
										}
										if (local607 == 2) {
											local617 = 51;
										}
										if (local607 == 3) {
											local617 = 8;
										}
										if (local607 == 4) {
											local617 = 40;
										}
										Static86.method1643(local617, local64, local546.anInt2287, Static89.method1698(new Class55[] { Static112.aClass55_1353, local553.aClass55_392 }), local599[local607], local46);
									} else if (local607 == 2) {
										Static86.method1643(51, local64, local546.anInt2287, Static89.method1698(new Class55[] { Static112.aClass55_1353, local553.aClass55_392 }), Static31.aClass55_457, local46);
									}
								}
								Static86.method1643(1006, local64, local546.anInt2287, Static89.method1698(new Class55[] { Static112.aClass55_1353, local553.aClass55_392 }), Static39.aClass55_660, local46);
							} else if ((Static66.anInt1971 & 0x1) == 1) {
								Static86.method1643(54, local64, local546.anInt2287, Static89.method1698(new Class55[] { Static86.aClass55_1000, Static77.aClass55_893, local553.aClass55_392 }), Static66.aClass55_780, local46);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V")
	public static void method1636() {
		method1634();
		if (Static19.anInt946 == 1) {
			Static18.aClass6_Sub2_Sub2_Sub2Array3[Static111.anInt3172 / 100].method646(Static11.anInt696 - 12, Static64.anInt1921 + -12);
		}
		if (Static19.anInt946 == 2) {
			Static18.aClass6_Sub2_Sub2_Sub2Array3[Static111.anInt3172 / 100 + 4].method646(Static11.anInt696 - 12, Static64.anInt1921 + -8 + -4);
		}
		if (Static4.anInt2356 != -1) {
			Static96.method1856(Static4.anInt2356);
			Static69.method1383(Static4.anInt2356, 334, 512, 4);
		}
		if (Static13.anInt800 != -1) {
			Static96.method1856(Static13.anInt800);
			Static69.method1383(Static13.anInt800, 334, 512, 0);
		}
		Static83.method1595();
		if (!Static109.aBoolean163) {
			Static71.method1425();
			Static100.method1915();
		} else if (Static1.anInt6 == 0) {
			Static109.method2036();
		}
		if (Static89.anInt2485 == 1) {
			Static55.aClass6_Sub2_Sub2_Sub2_9.method646(472, 296);
		}
		@Pc(143) int local143;
		if (Static106.aBoolean111) {
			@Pc(110) byte local110 = 20;
			Static4.aClass6_Sub2_Sub2_Sub4_6.method1310(Static89.method1698(new Class55[] { Static107.aClass55_1299, Static58.method1196(Static20.anInt949) }), 20, 16776960);
			@Pc(131) Runtime local131 = Runtime.getRuntime();
			@Pc(140) int local140 = (int) ((local131.totalMemory() - local131.freeMemory()) / 1024L);
			@Pc(142) int local142 = 16776960;
			local143 = local110 + 15;
			if (local140 > 32768 && Static90.aBoolean119) {
				local142 = 16711680;
			}
			if (local140 > 65536 && !Static90.aBoolean119) {
				local142 = 16711680;
			}
			Static4.aClass6_Sub2_Sub2_Sub4_6.method1310(Static89.method1698(new Class55[] { Static114.aClass55_1380, Static58.method1196(local140), Static59.aClass55_706 }), 35, local142);
			local143 += 15;
			if (Static21.aBoolean43) {
				Static4.aClass6_Sub2_Sub2_Sub4_6.method1310(Static63.aClass55_753, 50, 16711680);
				Static21.aBoolean43 = false;
				local143 += 15;
			}
			if (Static21.aBoolean42) {
				Static4.aClass6_Sub2_Sub2_Sub4_6.method1310(Static76.aClass55_891, local143, 16711680);
				local143 += 15;
				Static21.aBoolean42 = false;
			}
			if (Static88.aBoolean166) {
				Static4.aClass6_Sub2_Sub2_Sub4_6.method1310(Static9.aClass55_161, local143, 16711680);
				local143 += 15;
				Static88.aBoolean166 = false;
			}
		}
		if (Static19.anInt945 == 0) {
			return;
		}
		@Pc(227) int local227 = Static19.anInt945 / 50;
		local143 = local227 / 60;
		@Pc(235) int local235 = local227 % 60;
		if (local235 < 10) {
			Static4.aClass6_Sub2_Sub2_Sub4_6.method1303(Static89.method1698(new Class55[] { Static44.aClass55_1167, Static58.method1196(local143), Static103.aClass55_1279, Static58.method1196(local235) }), 4, 329, 16776960);
		} else {
			Static4.aClass6_Sub2_Sub2_Sub4_6.method1303(Static89.method1698(new Class55[] { Static44.aClass55_1167, Static58.method1196(local143), Static13.aClass55_265, Static58.method1196(local235) }), 4, 329, 16776960);
		}
	}
}
