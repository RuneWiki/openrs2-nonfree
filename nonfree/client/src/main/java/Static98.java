import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!la", name = "m", descriptor = "[Lclient!rf;")
	public static Class4_Sub1_Sub7_Sub2[] aClass4_Sub1_Sub7_Sub2Array8;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "I")
	public static int anInt2508 = 0;

	@OriginalMember(owner = "client!la", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray18 = new int[104][104];

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
	public static void method1895() {
		if (Static59.aClass32_1 != null) {
			@Pc(11) Class32 local11 = Static59.aClass32_1;
			synchronized (Static59.aClass32_1) {
				Static59.aClass32_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIII)V")
	public static void method1898(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static30.anInt771 = 0;
		@Pc(137) int local137;
		@Pc(66) int local66;
		@Pc(241) int local241;
		for (@Pc(5) int local5 = -1; local5 < Static126.anInt3006 + Static87.anInt2219; local5++) {
			@Pc(23) Class4_Sub1_Sub1_Sub1 local23;
			if (local5 == -1) {
				local23 = Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1;
			} else if (Static126.anInt3006 <= local5) {
				local23 = Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[Static35.anIntArray82[local5 - Static126.anInt3006]];
			} else {
				local23 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[Static167.anIntArray369[local5]];
			}
			if (local23 != null && local23.method2111()) {
				@Pc(50) Class4_Sub1_Sub11 local50;
				if (local23 instanceof Class4_Sub1_Sub1_Sub1_Sub2) {
					local50 = ((Class4_Sub1_Sub1_Sub1_Sub2) local23).aClass4_Sub1_Sub11_1;
					if (local50.anIntArray210 != null) {
						local50 = local50.method1742();
					}
					if (local50 == null) {
						continue;
					}
				}
				if (Static126.anInt3006 <= local5) {
					local50 = ((Class4_Sub1_Sub1_Sub1_Sub2) local23).aClass4_Sub1_Sub11_1;
					if (local50.anIntArray210 != null) {
						local50 = local50.method1742();
					}
					if (local50.anInt2255 >= 0 && Static109.aClass4_Sub1_Sub7_Sub2Array9.length > local50.anInt2255) {
						Static35.method612(local23.method2120() + 15, local23);
						if (Static162.anInt3591 > -1) {
							Static109.aClass4_Sub1_Sub7_Sub2Array9[local50.anInt2255].method2538(arg0 + Static162.anInt3591 - 12, arg2 + Static48.anInt1228 + -30);
						}
					}
					local241 = 0;
					@Pc(243) Class92[] local243 = Static121.aClass92Array1;
					while (local243.length > local241) {
						@Pc(249) Class92 local249 = local243[local241];
						if (local249 != null && local249.anInt4005 == 1 && local249.anInt4007 == Static35.anIntArray82[local5 - Static126.anInt3006] && Static142.anInt3325 % 20 < 10) {
							Static35.method612(local23.method2120() + 15, local23);
							if (Static162.anInt3591 > -1) {
								Static186.aClass4_Sub1_Sub7_Sub2Array12[local249.anInt4001].method2538(arg0 + Static162.anInt3591 - 12, arg2 - (-Static48.anInt1228 - -28));
							}
						}
						local241++;
					}
				} else {
					local66 = 30;
					@Pc(69) Class4_Sub1_Sub1_Sub1_Sub1 local69 = (Class4_Sub1_Sub1_Sub1_Sub1) local23;
					if (local69.anInt2108 != -1 || local69.anInt2097 != -1) {
						Static35.method612(local23.method2120() + 15, local23);
						if (Static162.anInt3591 > -1) {
							if (local69.anInt2108 != -1) {
								Static82.aClass4_Sub1_Sub7_Sub2Array6[local69.anInt2108].method2538(Static162.anInt3591 + arg0 - 12, arg2 + -30 + Static48.anInt1228);
								local66 += 25;
							}
							if (local69.anInt2097 != -1) {
								Static109.aClass4_Sub1_Sub7_Sub2Array9[local69.anInt2097].method2538(arg0 + Static162.anInt3591 - 12, Static48.anInt1228 + (arg2 - local66));
								local66 += 25;
							}
						}
					}
					if (local5 >= 0) {
						@Pc(135) Class92[] local135 = Static121.aClass92Array1;
						for (local137 = 0; local137 < local135.length; local137++) {
							@Pc(143) Class92 local143 = local135[local137];
							if (local143 != null && local143.anInt4005 == 10 && local143.anInt4007 == Static167.anIntArray369[local5]) {
								Static35.method612(local23.method2120() + 15, local23);
								if (Static162.anInt3591 > -1) {
									Static186.aClass4_Sub1_Sub7_Sub2Array12[local143.anInt4001].method2538(Static162.anInt3591 + arg0 - 12, -local66 + arg2 + Static48.anInt1228);
								}
							}
						}
					}
				}
				if (local23.aClass46_1037 != null && (Static126.anInt3006 <= local5 || Static58.anInt1415 == 0 || Static58.anInt1415 == 3 || Static58.anInt1415 == 1 && Static68.method1475(((Class4_Sub1_Sub1_Sub1_Sub1) local23).aClass46_796))) {
					Static35.method612(local23.method2120(), local23);
					if (Static162.anInt3591 > -1 && Static30.anInt771 < Static46.anInt1218) {
						Static46.anIntArray118[Static30.anInt771] = Static4.aClass4_Sub1_Sub7_Sub1_Sub1_5.method903(local23.aClass46_1037) / 2;
						Static46.anIntArray113[Static30.anInt771] = Static4.aClass4_Sub1_Sub7_Sub1_Sub1_5.anInt1206;
						Static46.anIntArray114[Static30.anInt771] = Static162.anInt3591;
						Static46.anIntArray115[Static30.anInt771] = Static48.anInt1228;
						Static46.anIntArray112[Static30.anInt771] = local23.anInt2828;
						Static46.anIntArray117[Static30.anInt771] = local23.anInt2811;
						Static46.anIntArray116[Static30.anInt771] = local23.anInt2826;
						Static46.aClass46Array10[Static30.anInt771] = local23.aClass46_1037;
						Static30.anInt771++;
					}
				}
				if (Static142.anInt3325 < local23.anInt2831) {
					Static35.method612(local23.method2120() + 15, local23);
					if (Static162.anInt3591 > -1) {
						Static145.method2941(arg0 + Static162.anInt3591 - 15, Static48.anInt1228 + arg2 + -3, local23.anInt2845, 5, 65280);
						Static145.method2941(local23.anInt2845 + Static162.anInt3591 + arg0 - 15, arg2 - -Static48.anInt1228 + -3, 30 - local23.anInt2845, 5, 16711680);
					}
				}
				for (local66 = 0; local66 < 4; local66++) {
					if (local23.anIntArray260[local66] > Static142.anInt3325) {
						Static35.method612(local23.method2120() / 2, local23);
						if (Static162.anInt3591 > -1) {
							if (local66 == 1) {
								Static48.anInt1228 -= 20;
							}
							if (local66 == 2) {
								Static48.anInt1228 -= 10;
								Static162.anInt3591 -= 15;
							}
							if (local66 == 3) {
								Static162.anInt3591 += 15;
								Static48.anInt1228 -= 10;
							}
							Static5.aClass4_Sub1_Sub7_Sub2Array1[local23.anIntArray261[local66]].method2538(arg0 + Static162.anInt3591 - 12, arg2 + Static48.anInt1228 + -12);
							Static160.aClass4_Sub1_Sub7_Sub1_Sub1_7.method906(Static127.method2240(local23.anIntArray263[local66]), arg0 + Static162.anInt3591 - 1, Static48.anInt1228 + arg2 - -3, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(554) int local554 = 0; local554 < Static30.anInt771; local554++) {
			local66 = Static46.anIntArray114[local554];
			@Pc(564) int local564 = Static46.anIntArray115[local554];
			local241 = Static46.anIntArray118[local554];
			@Pc(570) boolean local570 = true;
			local137 = Static46.anIntArray113[local554];
			while (local570) {
				local570 = false;
				for (@Pc(580) int local580 = 0; local580 < local554; local580++) {
					if (local564 + 2 > Static46.anIntArray115[local580] + -Static46.anIntArray113[local580] && Static46.anIntArray115[local580] + 2 > local564 - local137 && Static46.anIntArray118[local580] + Static46.anIntArray114[local580] > local66 + -local241 && local241 + local66 > Static46.anIntArray114[local580] - Static46.anIntArray118[local580] && Static46.anIntArray115[local580] - Static46.anIntArray113[local580] < local564) {
						local570 = true;
						local564 = Static46.anIntArray115[local580] - Static46.anIntArray113[local580];
					}
				}
			}
			Static162.anInt3591 = Static46.anIntArray114[local554];
			Static48.anInt1228 = Static46.anIntArray115[local554] = local564;
			@Pc(675) Class46 local675 = Static46.aClass46Array10[local554];
			if (Static28.anInt752 == 0) {
				@Pc(692) int local692 = 16776960;
				if (Static46.anIntArray112[local554] < 6) {
					local692 = Static9.anIntArray31[Static46.anIntArray112[local554]];
				}
				if (Static46.anIntArray112[local554] == 6) {
					local692 = Static113.anInt2757 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static46.anIntArray112[local554] == 7) {
					local692 = Static113.anInt2757 % 20 >= 10 ? 65535 : 255;
				}
				if (Static46.anIntArray112[local554] == 8) {
					local692 = Static113.anInt2757 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(767) int local767;
				if (Static46.anIntArray112[local554] == 9) {
					local767 = 150 - Static46.anIntArray116[local554];
					if (local767 < 50) {
						local692 = local767 * 1280 + 16711680;
					} else if (local767 < 100) {
						local692 = 16776960 - (local767 - 50) * 327680;
					} else if (local767 < 150) {
						local692 = local767 * 5 + 65280 - 500;
					}
				}
				if (Static46.anIntArray112[local554] == 10) {
					local767 = 150 - Static46.anIntArray116[local554];
					if (local767 < 50) {
						local692 = local767 * 5 + 16711680;
					} else if (local767 < 100) {
						local692 = 16711935 - (local767 - 50) * 327680;
					} else if (local767 < 150) {
						local692 = (local767 - 100) * 327680 + 255 - (local767 - 100) * 5;
					}
				}
				if (Static46.anIntArray112[local554] == 11) {
					local767 = 150 - Static46.anIntArray116[local554];
					if (local767 < 50) {
						local692 = 16777215 - local767 * 327685;
					} else if (local767 < 100) {
						local692 = local767 * 327685 + 65280 - 16384250;
					} else if (local767 < 150) {
						local692 = 16777215 - (local767 - 100) * 327680;
					}
				}
				if (Static46.anIntArray117[local554] == 0) {
					Static4.aClass4_Sub1_Sub7_Sub1_Sub1_5.method906(local675, Static162.anInt3591 + arg0, arg2 + Static48.anInt1228, local692, 0);
				}
				if (Static46.anIntArray117[local554] == 1) {
					Static4.aClass4_Sub1_Sub7_Sub1_Sub1_5.method913(local675, arg0 + Static162.anInt3591, Static48.anInt1228 + arg2, local692, Static113.anInt2757);
				}
				if (Static46.anIntArray117[local554] == 2) {
					Static4.aClass4_Sub1_Sub7_Sub1_Sub1_5.method907(local675, arg0 + Static162.anInt3591, arg2 + Static48.anInt1228, local692, Static113.anInt2757);
				}
				if (Static46.anIntArray117[local554] == 3) {
					Static4.aClass4_Sub1_Sub7_Sub1_Sub1_5.method895(local675, Static162.anInt3591 + arg0, arg2 - -Static48.anInt1228, local692, Static113.anInt2757, 150 - Static46.anIntArray116[local554]);
				}
				if (Static46.anIntArray117[local554] == 4) {
					local767 = (150 - Static46.anIntArray116[local554]) * (Static4.aClass4_Sub1_Sub7_Sub1_Sub1_5.method903(local675) + 100) / 150;
					Static145.method2930(Static162.anInt3591 + arg0 - 50, arg2, Static162.anInt3591 + arg0 + 50, arg1 + arg2);
					Static4.aClass4_Sub1_Sub7_Sub1_Sub1_5.method890(local675, Static162.anInt3591 + arg0 + 50 - local767, Static48.anInt1228 + arg2, local692, 0);
					Static145.method2932(arg0, arg2, arg3 + arg0, arg1 + arg2);
				}
				if (Static46.anIntArray117[local554] == 5) {
					@Pc(1059) int local1059 = 0;
					local767 = 150 - Static46.anIntArray116[local554];
					if (local767 < 25) {
						local1059 = local767 - 25;
					} else if (local767 > 125) {
						local1059 = local767 - 125;
					}
					Static145.method2930(arg0, Static48.anInt1228 + arg2 - Static4.aClass4_Sub1_Sub7_Sub1_Sub1_5.anInt1206 - 1, arg0 + arg3, arg2 + Static48.anInt1228 + 5);
					Static4.aClass4_Sub1_Sub7_Sub1_Sub1_5.method906(local675, arg0 + Static162.anInt3591, Static48.anInt1228 + (arg2 - -local1059), local692, 0);
					Static145.method2932(arg0, arg2, arg3 + arg0, arg1 + arg2);
				}
			} else {
				Static4.aClass4_Sub1_Sub7_Sub1_Sub1_5.method906(local675, Static162.anInt3591 + arg0, Static48.anInt1228 + arg2, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!eb;Z)V")
	public static void method1899(@OriginalArg(0) Class4_Sub7 arg0, @OriginalArg(1) boolean arg1) {
		Static186.aClass11_17.method272(arg0);
		while (true) {
			@Pc(8) Class4_Sub7 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(30) Class4_Sub7[][] local30;
			@Pc(47) Class4_Sub7 local47;
			@Pc(245) int local245;
			@Pc(579) int local579;
			@Pc(584) int local584;
			@Pc(589) int local589;
			@Pc(906) Class24 local906;
			@Pc(1079) int local1079;
			@Pc(964) int local964;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(251) Class86 var11;
										@Pc(592) int var16;
										@Pc(601) int var17;
										@Pc(613) int var18;
										@Pc(335) int var20;
										@Pc(283) boolean var21;
										@Pc(787) Class4_Sub7 var32;
										while (true) {
											do {
												local8 = (Class4_Sub7) Static186.aClass11_17.method276();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean53);
											local17 = local8.anInt1032;
											local20 = local8.anInt1035;
											local23 = local8.anInt1033;
											local26 = local8.anInt1030;
											local30 = Static28.aClass4_Sub7ArrayArrayArray1[local23];
											if (!local8.aBoolean55) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local47 = Static28.aClass4_Sub7ArrayArrayArray1[local23 - 1][local17][local20];
													if (local47 != null && local47.aBoolean53) {
														continue;
													}
												}
												if (local17 <= Static100.anInt2542 && local17 > Static92.anInt2366) {
													local47 = local30[local17 - 1][local20];
													if (local47 != null && local47.aBoolean53 && (local47.aBoolean55 || (local8.anInt1042 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static100.anInt2542 && local17 < Static158.anInt3539 - 1) {
													local47 = local30[local17 + 1][local20];
													if (local47 != null && local47.aBoolean53 && (local47.aBoolean55 || (local8.anInt1042 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static63.anInt1572 && local20 > Static31.anInt804) {
													local47 = local30[local17][local20 - 1];
													if (local47 != null && local47.aBoolean53 && (local47.aBoolean55 || (local8.anInt1042 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static63.anInt1572 && local20 < Static85.anInt2192 - 1) {
													local47 = local30[local17][local20 + 1];
													if (local47 != null && local47.aBoolean53 && (local47.aBoolean55 || (local8.anInt1042 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean55 = false;
											if (local8.aClass4_Sub7_1 != null) {
												local47 = local8.aClass4_Sub7_1;
												if (local47.aClass29_1 == null) {
													if (local47.aClass40_1 != null && !Static13.method263(0, local17, local20)) {
														Static140.method2404(local47.aClass40_1, Static52.anInt1322, Static80.anInt2008, Static55.anInt1367, Static177.anInt3970, local17, local20);
													}
												} else if (!Static13.method263(0, local17, local20)) {
													Static1.method2(local47.aClass29_1, 0, Static52.anInt1322, Static80.anInt2008, Static55.anInt1367, Static177.anInt3970, local17, local20);
												}
												@Pc(219) Class24 local219 = local47.aClass24_1;
												if (local219 != null) {
													local219.aClass4_Sub1_Sub1_2.method2821(0, Static52.anInt1322, Static80.anInt2008, Static55.anInt1367, Static177.anInt3970, local219.anInt1096 - Static116.anInt2858, local219.anInt1095 - Static90.anInt2341, local219.anInt1094 - Static83.anInt2133, local219.aLong36);
												}
												for (local245 = 0; local245 < local47.anInt1040; local245++) {
													var11 = local47.aClass86Array1[local245];
													if (var11 != null) {
														var11.aClass4_Sub1_Sub1_10.method2821(var11.anInt3592, Static52.anInt1322, Static80.anInt2008, Static55.anInt1367, Static177.anInt3970, var11.anInt3590 - Static116.anInt2858, var11.anInt3587 - Static90.anInt2341, var11.anInt3585 - Static83.anInt2133, var11.aLong129);
													}
												}
											}
											var21 = false;
											if (local8.aClass29_1 == null) {
												if (local8.aClass40_1 != null && !Static13.method263(local26, local17, local20)) {
													var21 = true;
													Static140.method2404(local8.aClass40_1, Static52.anInt1322, Static80.anInt2008, Static55.anInt1367, Static177.anInt3970, local17, local20);
												}
											} else if (!Static13.method263(local26, local17, local20)) {
												var21 = true;
												if (local8.aClass29_1.anInt1327 != 12345678 || Static28.aBoolean38 && local23 <= Static26.anInt651) {
													Static1.method2(local8.aClass29_1, local26, Static52.anInt1322, Static80.anInt2008, Static55.anInt1367, Static177.anInt3970, local17, local20);
												}
											}
											var20 = 0;
											local245 = 0;
											@Pc(340) Class24 local340 = local8.aClass24_1;
											@Pc(343) Class65 local343 = local8.aClass65_1;
											if (local340 != null || local343 != null) {
												if (Static100.anInt2542 == local17) {
													var20++;
												} else if (Static100.anInt2542 < local17) {
													var20 += 2;
												}
												if (Static63.anInt1572 == local20) {
													var20 += 3;
												} else if (Static63.anInt1572 > local20) {
													var20 += 6;
												}
												local245 = Static13.anIntArray40[var20];
												local8.anInt1034 = Static57.anIntArray148[var20];
											}
											if (local340 != null) {
												if ((local340.anInt1089 & Static6.anIntArray21[var20]) == 0) {
													local8.anInt1041 = 0;
												} else if (local340.anInt1089 == 16) {
													local8.anInt1041 = 3;
													local8.anInt1038 = Static55.anIntArray145[var20];
													local8.anInt1031 = 3 - local8.anInt1038;
												} else if (local340.anInt1089 == 32) {
													local8.anInt1041 = 6;
													local8.anInt1038 = Static114.anIntArray257[var20];
													local8.anInt1031 = 6 - local8.anInt1038;
												} else if (local340.anInt1089 == 64) {
													local8.anInt1041 = 12;
													local8.anInt1038 = Static60.anIntArray153[var20];
													local8.anInt1031 = 12 - local8.anInt1038;
												} else {
													local8.anInt1041 = 9;
													local8.anInt1038 = Static177.anIntArray429[var20];
													local8.anInt1031 = 9 - local8.anInt1038;
												}
												if ((local340.anInt1089 & local245) != 0 && !Static48.method927(local26, local17, local20, local340.anInt1089)) {
													local340.aClass4_Sub1_Sub1_2.method2821(0, Static52.anInt1322, Static80.anInt2008, Static55.anInt1367, Static177.anInt3970, local340.anInt1096 - Static116.anInt2858, local340.anInt1095 - Static90.anInt2341, local340.anInt1094 - Static83.anInt2133, local340.aLong36);
												}
												if ((local340.anInt1088 & local245) != 0 && !Static48.method927(local26, local17, local20, local340.anInt1088)) {
													local340.aClass4_Sub1_Sub1_3.method2821(0, Static52.anInt1322, Static80.anInt2008, Static55.anInt1367, Static177.anInt3970, local340.anInt1096 - Static116.anInt2858, local340.anInt1095 - Static90.anInt2341, local340.anInt1094 - Static83.anInt2133, local340.aLong36);
												}
											}
											if (local343 != null && !Static111.method2065(local26, local17, local20, local343.aClass4_Sub1_Sub1_6.aShort29)) {
												if ((local343.anInt2978 & local245) != 0) {
													local343.aClass4_Sub1_Sub1_6.method2821(0, Static52.anInt1322, Static80.anInt2008, Static55.anInt1367, Static177.anInt3970, local343.anInt2980 + local343.anInt2976 - Static116.anInt2858, local343.anInt2979 - Static90.anInt2341, local343.anInt2977 + local343.anInt2984 - Static83.anInt2133, local343.aLong107);
												} else if (local343.anInt2978 == 256) {
													local579 = local343.anInt2980 - Static116.anInt2858;
													local584 = local343.anInt2979 - Static90.anInt2341;
													local589 = local343.anInt2977 - Static83.anInt2133;
													var16 = local343.anInt2983;
													if (var16 == 1 || var16 == 2) {
														var17 = -local579;
													} else {
														var17 = local579;
													}
													if (var16 == 2 || var16 == 3) {
														var18 = -local589;
													} else {
														var18 = local589;
													}
													if (var18 < var17) {
														local343.aClass4_Sub1_Sub1_6.method2821(0, Static52.anInt1322, Static80.anInt2008, Static55.anInt1367, Static177.anInt3970, local579 + local343.anInt2976, local584, local589 + local343.anInt2984, local343.aLong107);
													} else if (local343.aClass4_Sub1_Sub1_5 != null) {
														local343.aClass4_Sub1_Sub1_5.method2821(0, Static52.anInt1322, Static80.anInt2008, Static55.anInt1367, Static177.anInt3970, local579, local584, local589, local343.aLong107);
													}
												}
											}
											if (var21) {
												@Pc(660) Class17 local660 = local8.aClass17_1;
												if (local660 != null) {
													local660.aClass4_Sub1_Sub1_1.method2821(0, Static52.anInt1322, Static80.anInt2008, Static55.anInt1367, Static177.anInt3970, local660.anInt594 - Static116.anInt2858, local660.anInt597 - Static90.anInt2341, local660.anInt599 - Static83.anInt2133, local660.aLong19);
												}
												@Pc(687) Class70 local687 = local8.aClass70_1;
												if (local687 != null && local687.anInt3134 == 0) {
													if (local687.aClass4_Sub1_Sub1_9 != null) {
														local687.aClass4_Sub1_Sub1_9.method2821(0, Static52.anInt1322, Static80.anInt2008, Static55.anInt1367, Static177.anInt3970, local687.anInt3138 - Static116.anInt2858, local687.anInt3135 - Static90.anInt2341, local687.anInt3141 - Static83.anInt2133, local687.aLong112);
													}
													if (local687.aClass4_Sub1_Sub1_7 != null) {
														local687.aClass4_Sub1_Sub1_7.method2821(0, Static52.anInt1322, Static80.anInt2008, Static55.anInt1367, Static177.anInt3970, local687.anInt3138 - Static116.anInt2858, local687.anInt3135 - Static90.anInt2341, local687.anInt3141 - Static83.anInt2133, local687.aLong112);
													}
													if (local687.aClass4_Sub1_Sub1_8 != null) {
														local687.aClass4_Sub1_Sub1_8.method2821(0, Static52.anInt1322, Static80.anInt2008, Static55.anInt1367, Static177.anInt3970, local687.anInt3138 - Static116.anInt2858, local687.anInt3135 - Static90.anInt2341, local687.anInt3141 - Static83.anInt2133, local687.aLong112);
													}
												}
											}
											local579 = local8.anInt1042;
											if (local579 != 0) {
												if (local17 < Static100.anInt2542 && (local579 & 0x4) != 0) {
													var32 = local30[local17 + 1][local20];
													if (var32 != null && var32.aBoolean53) {
														Static186.aClass11_17.method272(var32);
													}
												}
												if (local20 < Static63.anInt1572 && (local579 & 0x2) != 0) {
													var32 = local30[local17][local20 + 1];
													if (var32 != null && var32.aBoolean53) {
														Static186.aClass11_17.method272(var32);
													}
												}
												if (local17 > Static100.anInt2542 && (local579 & 0x1) != 0) {
													var32 = local30[local17 - 1][local20];
													if (var32 != null && var32.aBoolean53) {
														Static186.aClass11_17.method272(var32);
													}
												}
												if (local20 > Static63.anInt1572 && (local579 & 0x8) != 0) {
													var32 = local30[local17][local20 - 1];
													if (var32 != null && var32.aBoolean53) {
														Static186.aClass11_17.method272(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt1041 != 0) {
											var21 = true;
											for (var20 = 0; var20 < local8.anInt1040; var20++) {
												if (local8.aClass86Array1[var20].anInt3588 != Static87.anInt2220 && (local8.anIntArray90[var20] & local8.anInt1041) == local8.anInt1038) {
													var21 = false;
													break;
												}
											}
											if (var21) {
												local906 = local8.aClass24_1;
												if (!Static48.method927(local26, local17, local20, local906.anInt1089)) {
													local906.aClass4_Sub1_Sub1_2.method2821(0, Static52.anInt1322, Static80.anInt2008, Static55.anInt1367, Static177.anInt3970, local906.anInt1096 - Static116.anInt2858, local906.anInt1095 - Static90.anInt2341, local906.anInt1094 - Static83.anInt2133, local906.aLong36);
												}
												local8.anInt1041 = 0;
											}
										}
										if (!local8.aBoolean54) {
											break;
										}
										try {
											@Pc(944) int local944 = local8.anInt1040;
											local8.aBoolean54 = false;
											var20 = 0;
											label558: for (local245 = 0; local245 < local944; local245++) {
												var11 = local8.aClass86Array1[local245];
												if (var11.anInt3588 != Static87.anInt2220) {
													for (local964 = var11.anInt3583; local964 <= var11.anInt3584; local964++) {
														for (local579 = var11.anInt3581; local579 <= var11.anInt3595; local579++) {
															var32 = local30[local964][local579];
															if (var32.aBoolean55) {
																local8.aBoolean54 = true;
																continue label558;
															}
															if (var32.anInt1041 != 0) {
																local589 = 0;
																if (local964 > var11.anInt3583) {
																	local589++;
																}
																if (local964 < var11.anInt3584) {
																	local589 += 4;
																}
																if (local579 > var11.anInt3581) {
																	local589 += 8;
																}
																if (local579 < var11.anInt3595) {
																	local589 += 2;
																}
																if ((local589 & var32.anInt1041) == local8.anInt1031) {
																	local8.aBoolean54 = true;
																	continue label558;
																}
															}
														}
													}
													Static154.aClass86Array5[var20++] = var11;
													local579 = Static100.anInt2542 - var11.anInt3583;
													local584 = var11.anInt3584 - Static100.anInt2542;
													if (local584 > local579) {
														local579 = local584;
													}
													local589 = Static63.anInt1572 - var11.anInt3581;
													var16 = var11.anInt3595 - Static63.anInt1572;
													if (var16 > local589) {
														var11.anInt3586 = local579 + var16;
													} else {
														var11.anInt3586 = local579 + local589;
													}
												}
											}
											while (var20 > 0) {
												local1079 = -50;
												local964 = -1;
												@Pc(1088) Class86 local1088;
												for (local579 = 0; local579 < var20; local579++) {
													local1088 = Static154.aClass86Array5[local579];
													if (local1088.anInt3588 != Static87.anInt2220) {
														if (local1088.anInt3586 > local1079) {
															local1079 = local1088.anInt3586;
															local964 = local579;
														} else if (local1088.anInt3586 == local1079) {
															local589 = local1088.anInt3590 - Static116.anInt2858;
															var16 = local1088.anInt3585 - Static83.anInt2133;
															var17 = Static154.aClass86Array5[local964].anInt3590 - Static116.anInt2858;
															var18 = Static154.aClass86Array5[local964].anInt3585 - Static83.anInt2133;
															if (local589 * local589 + var16 * var16 > var17 * var17 + var18 * var18) {
																local964 = local579;
															}
														}
													}
												}
												if (local964 == -1) {
													break;
												}
												local1088 = Static154.aClass86Array5[local964];
												local1088.anInt3588 = Static87.anInt2220;
												if (!Static81.method1610(local26, local1088.anInt3583, local1088.anInt3584, local1088.anInt3581, local1088.anInt3595, local1088.aClass4_Sub1_Sub1_10.aShort29)) {
													local1088.aClass4_Sub1_Sub1_10.method2821(local1088.anInt3592, Static52.anInt1322, Static80.anInt2008, Static55.anInt1367, Static177.anInt3970, local1088.anInt3590 - Static116.anInt2858, local1088.anInt3587 - Static90.anInt2341, local1088.anInt3585 - Static83.anInt2133, local1088.aLong129);
												}
												for (local589 = local1088.anInt3583; local589 <= local1088.anInt3584; local589++) {
													for (var16 = local1088.anInt3581; var16 <= local1088.anInt3595; var16++) {
														@Pc(1212) Class4_Sub7 local1212 = local30[local589][var16];
														if (local1212.anInt1041 != 0) {
															Static186.aClass11_17.method272(local1212);
														} else if ((local589 != local17 || var16 != local20) && local1212.aBoolean53) {
															Static186.aClass11_17.method272(local1212);
														}
													}
												}
											}
											if (!local8.aBoolean54) {
												break;
											}
										} catch (@Pc(1250) Exception local1250) {
											local8.aBoolean54 = false;
											break;
										}
									}
								} while (!local8.aBoolean53);
							} while (local8.anInt1041 != 0);
							if (local17 > Static100.anInt2542 || local17 <= Static92.anInt2366) {
								break;
							}
							local47 = local30[local17 - 1][local20];
						} while (local47 != null && local47.aBoolean53);
						if (local17 < Static100.anInt2542 || local17 >= Static158.anInt3539 - 1) {
							break;
						}
						local47 = local30[local17 + 1][local20];
					} while (local47 != null && local47.aBoolean53);
					if (local20 > Static63.anInt1572 || local20 <= Static31.anInt804) {
						break;
					}
					local47 = local30[local17][local20 - 1];
				} while (local47 != null && local47.aBoolean53);
				if (local20 < Static63.anInt1572 || local20 >= Static85.anInt2192 - 1) {
					break;
				}
				local47 = local30[local17][local20 + 1];
			} while (local47 != null && local47.aBoolean53);
			local8.aBoolean53 = false;
			Static129.anInt3090--;
			@Pc(1354) Class70 local1354 = local8.aClass70_1;
			if (local1354 != null && local1354.anInt3134 != 0) {
				if (local1354.aClass4_Sub1_Sub1_9 != null) {
					local1354.aClass4_Sub1_Sub1_9.method2821(0, Static52.anInt1322, Static80.anInt2008, Static55.anInt1367, Static177.anInt3970, local1354.anInt3138 - Static116.anInt2858, local1354.anInt3135 - Static90.anInt2341 - local1354.anInt3134, local1354.anInt3141 - Static83.anInt2133, local1354.aLong112);
				}
				if (local1354.aClass4_Sub1_Sub1_7 != null) {
					local1354.aClass4_Sub1_Sub1_7.method2821(0, Static52.anInt1322, Static80.anInt2008, Static55.anInt1367, Static177.anInt3970, local1354.anInt3138 - Static116.anInt2858, local1354.anInt3135 - Static90.anInt2341 - local1354.anInt3134, local1354.anInt3141 - Static83.anInt2133, local1354.aLong112);
				}
				if (local1354.aClass4_Sub1_Sub1_8 != null) {
					local1354.aClass4_Sub1_Sub1_8.method2821(0, Static52.anInt1322, Static80.anInt2008, Static55.anInt1367, Static177.anInt3970, local1354.anInt3138 - Static116.anInt2858, local1354.anInt3135 - Static90.anInt2341 - local1354.anInt3134, local1354.anInt3141 - Static83.anInt2133, local1354.aLong112);
				}
			}
			if (local8.anInt1034 != 0) {
				@Pc(1449) Class65 local1449 = local8.aClass65_1;
				if (local1449 != null && !Static111.method2065(local26, local17, local20, local1449.aClass4_Sub1_Sub1_6.aShort29)) {
					if ((local1449.anInt2978 & local8.anInt1034) != 0) {
						local1449.aClass4_Sub1_Sub1_6.method2821(0, Static52.anInt1322, Static80.anInt2008, Static55.anInt1367, Static177.anInt3970, local1449.anInt2980 + local1449.anInt2976 - Static116.anInt2858, local1449.anInt2979 - Static90.anInt2341, local1449.anInt2977 + local1449.anInt2984 - Static83.anInt2133, local1449.aLong107);
					} else if (local1449.anInt2978 == 256) {
						local245 = local1449.anInt2980 - Static116.anInt2858;
						local1079 = local1449.anInt2979 - Static90.anInt2341;
						local964 = local1449.anInt2977 - Static83.anInt2133;
						local579 = local1449.anInt2983;
						if (local579 == 1 || local579 == 2) {
							local584 = -local245;
						} else {
							local584 = local245;
						}
						if (local579 == 2 || local579 == 3) {
							local589 = -local964;
						} else {
							local589 = local964;
						}
						if (local589 >= local584) {
							local1449.aClass4_Sub1_Sub1_6.method2821(0, Static52.anInt1322, Static80.anInt2008, Static55.anInt1367, Static177.anInt3970, local245 + local1449.anInt2976, local1079, local964 + local1449.anInt2984, local1449.aLong107);
						} else if (local1449.aClass4_Sub1_Sub1_5 != null) {
							local1449.aClass4_Sub1_Sub1_5.method2821(0, Static52.anInt1322, Static80.anInt2008, Static55.anInt1367, Static177.anInt3970, local245, local1079, local964, local1449.aLong107);
						}
					}
				}
				local906 = local8.aClass24_1;
				if (local906 != null) {
					if ((local906.anInt1088 & local8.anInt1034) != 0 && !Static48.method927(local26, local17, local20, local906.anInt1088)) {
						local906.aClass4_Sub1_Sub1_3.method2821(0, Static52.anInt1322, Static80.anInt2008, Static55.anInt1367, Static177.anInt3970, local906.anInt1096 - Static116.anInt2858, local906.anInt1095 - Static90.anInt2341, local906.anInt1094 - Static83.anInt2133, local906.aLong36);
					}
					if ((local906.anInt1089 & local8.anInt1034) != 0 && !Static48.method927(local26, local17, local20, local906.anInt1089)) {
						local906.aClass4_Sub1_Sub1_2.method2821(0, Static52.anInt1322, Static80.anInt2008, Static55.anInt1367, Static177.anInt3970, local906.anInt1096 - Static116.anInt2858, local906.anInt1095 - Static90.anInt2341, local906.anInt1094 - Static83.anInt2133, local906.aLong36);
					}
				}
			}
			@Pc(1669) Class4_Sub7 local1669;
			if (local23 < Static135.anInt3222 - 1) {
				local1669 = Static28.aClass4_Sub7ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1669 != null && local1669.aBoolean53) {
					Static186.aClass11_17.method272(local1669);
				}
			}
			if (local17 < Static100.anInt2542) {
				local1669 = local30[local17 + 1][local20];
				if (local1669 != null && local1669.aBoolean53) {
					Static186.aClass11_17.method272(local1669);
				}
			}
			if (local20 < Static63.anInt1572) {
				local1669 = local30[local17][local20 + 1];
				if (local1669 != null && local1669.aBoolean53) {
					Static186.aClass11_17.method272(local1669);
				}
			}
			if (local17 > Static100.anInt2542) {
				local1669 = local30[local17 - 1][local20];
				if (local1669 != null && local1669.aBoolean53) {
					Static186.aClass11_17.method272(local1669);
				}
			}
			if (local20 > Static63.anInt1572) {
				local1669 = local30[local17][local20 - 1];
				if (local1669 != null && local1669.aBoolean53) {
					Static186.aClass11_17.method272(local1669);
				}
			}
		}
	}
}
