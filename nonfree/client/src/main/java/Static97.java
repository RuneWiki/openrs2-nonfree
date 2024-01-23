import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!hf", name = "cb", descriptor = "I")
	public static int anInt2270;

	@OriginalMember(owner = "client!hf", name = "A", descriptor = "I")
	public static int anInt2247 = 0;

	@OriginalMember(owner = "client!hf", name = "F", descriptor = "Lclient!qc;")
	public static Class135 aClass135_9 = new Class135(4);

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
	public static void method1784() {
		while (true) {
			@Pc(9) Class1_Sub28 local9 = (Class1_Sub28) Static260.aClass61_33.method1850();
			if (local9 == null) {
				return;
			}
			@Pc(24) Class14_Sub2 local24;
			@Pc(20) int local20;
			if (local9.anInt4761 >= 0) {
				local20 = local9.anInt4761 - 1;
				local24 = Static254.aClass14_Sub2_Sub2Array1[local20];
			} else {
				local20 = -local9.anInt4761 - 1;
				if (local20 == Static71.anInt1526) {
					local24 = Static197.aClass14_Sub2_Sub1_2;
				} else {
					local24 = Static98.aClass14_Sub2_Sub1Array1[local20];
				}
			}
			if (local24 != null) {
				@Pc(54) Class181 local54 = Static183.method3511(local9.anInt4760);
				@Pc(70) int local70;
				@Pc(67) int local67;
				if (local9.anInt4757 == 1 || local9.anInt4757 == 3) {
					local67 = local54.anInt5559;
					local70 = local54.anInt5534;
				} else {
					local67 = local54.anInt5534;
					local70 = local54.anInt5559;
				}
				@Pc(86) int local86 = local9.anInt4754 + (local70 >> 1);
				if (Static140.anInt3034 >= 3) {
				}
				@Pc(98) int local98 = (local67 >> 1) + local9.anInt4763;
				@Pc(108) int local108 = local9.anInt4754 + (local70 + 1 >> 1);
				@Pc(117) int local117 = (local67 + 1 >> 1) + local9.anInt4763;
				@Pc(121) int[][] local121 = Static55.anIntArrayArrayArray3[Static140.anInt3034];
				@Pc(148) int local148 = local121[local108][local117] + local121[local108][local98] + local121[local86][local98] + local121[local86][local117] >> 2;
				@Pc(150) Class14 local150 = null;
				@Pc(155) int local155 = Static23.anIntArray58[local9.anInt4764];
				if (local155 == 0) {
					@Pc(223) Class72 local223 = Static126.method1527(Static140.anInt3034, local9.anInt4754, local9.anInt4763);
					if (local223 != null) {
						local150 = local223.aClass14_10;
					}
				} else if (local155 == 1) {
					@Pc(210) Class67 local210 = Static118.method2117(Static140.anInt3034, local9.anInt4754, local9.anInt4763);
					if (local210 != null) {
						local150 = local210.aClass14_7;
					}
				} else if (local155 == 2) {
					@Pc(196) Class25 local196 = Static90.method1590(Static140.anInt3034, local9.anInt4754, local9.anInt4763);
					if (local196 != null) {
						local150 = local196.aClass14_1;
					}
				} else if (local155 == 3) {
					@Pc(181) Class44 local181 = Static117.method2110(Static140.anInt3034, local9.anInt4754, local9.anInt4763);
					if (local181 != null) {
						local150 = local181.aClass14_6;
					}
				}
				if (local150 != null) {
					Static1.method3387(local155, local9.anInt4763, local9.anInt4756 + 1, local9.anInt4754, 0, 0, local9.anInt4768 + 1, Static140.anInt3034, -1);
					local24.anInt4700 = local148;
					local24.anInt4654 = local9.anInt4763 * 128 + local67 * 64;
					local24.anInt4625 = local9.anInt4754 * 128 + local70 * 64;
					local24.anObject6 = local150;
					@Pc(279) int local279 = local9.anInt4752;
					@Pc(282) int local282 = local9.anInt4758;
					@Pc(285) int local285 = local9.anInt4759;
					@Pc(295) int local295;
					if (local279 < local285) {
						local295 = local285;
						local285 = local279;
						local279 = local295;
					}
					local24.anInt4688 = local9.anInt4754 + local285;
					local24.anInt4640 = local9.anInt4756 + Static237.anInt4710;
					local24.anInt4682 = local279 + local9.anInt4754;
					@Pc(322) int local322 = local9.anInt4767;
					local24.anInt4683 = local9.anInt4768 + Static237.anInt4710;
					if (local322 < local282) {
						local295 = local282;
						local282 = local322;
						local322 = local295;
					}
					local24.anInt4697 = local282 + local9.anInt4763;
					local24.anInt4667 = local9.anInt4763 + local322;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIII[Lclient!in;ZIIII)V")
	public static void method1786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class71[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static277.aBoolean412) {
			Static41.method847(arg1, arg5, arg8, arg6);
		} else {
			Static50.method950(arg1, arg5, arg8, arg6);
			Static110.method2030();
		}
		for (@Pc(26) int local26 = 0; local26 < arg4.length; local26++) {
			@Pc(34) Class71 local34 = arg4[local26];
			if (local34 != null && (local34.anInt2674 == arg0 || arg0 == -1412584499 && local34 == Static84.aClass71_11)) {
				@Pc(55) int local55;
				if (arg3 == -1) {
					Static55.anIntArray127[Static270.anInt5273] = local34.anInt2641 + arg2;
					Static62.anIntArray136[Static270.anInt5273] = arg7 + local34.anInt2711;
					Static189.anIntArray351[Static270.anInt5273] = local34.anInt2722;
					Static215.anIntArray382[Static270.anInt5273] = local34.anInt2698;
					local55 = Static270.anInt5273++;
				} else {
					local55 = arg3;
				}
				local34.anInt2667 = local55;
				local34.anInt2724 = Static237.anInt4710;
				if (!local34.aBoolean196 || !Static36.method763(local34)) {
					if (local34.anInt2713 > 0) {
						Static203.method3282(local34);
					}
					@Pc(112) int local112 = arg2 + local34.anInt2641;
					@Pc(118) int local118 = local34.anInt2711 + arg7;
					@Pc(121) int local121 = local34.anInt2696;
					if (Static178.aBoolean303 && (Static36.method769(local34).anInt1759 != 0 || local34.anInt2712 == 0) && local121 > 127) {
						local121 = 127;
					}
					@Pc(172) int local172;
					@Pc(174) int local174;
					if (Static84.aClass71_11 == local34) {
						if (arg0 != -1412584499 && !local34.aBoolean206) {
							Static253.aClass71Array2 = arg4;
							Static220.anInt4374 = arg2;
							Static258.anInt5076 = arg7;
							continue;
						}
						if (!local34.aBoolean206) {
							local121 = 128;
						}
						if (Static264.aBoolean389 && Static62.aBoolean94) {
							local172 = Static224.anInt4445;
							local174 = Static8.anInt226;
							local172 -= Static9.anInt238;
							local174 -= Static10.anInt245;
							if (Static52.anInt1186 > local172) {
								local172 = Static52.anInt1186;
							}
							if (Static142.anInt3049 > local174) {
								local174 = Static142.anInt3049;
							}
							if (local172 + local34.anInt2722 > Static52.anInt1186 + Static100.aClass71_12.anInt2722) {
								local172 = Static52.anInt1186 + Static100.aClass71_12.anInt2722 - local34.anInt2722;
							}
							if (local34.anInt2698 + local174 > Static100.aClass71_12.anInt2698 + Static142.anInt3049) {
								local174 = Static100.aClass71_12.anInt2698 + Static142.anInt3049 - local34.anInt2698;
							}
							local118 = local174;
							local112 = local172;
						}
					}
					@Pc(282) int local282;
					@Pc(289) int local289;
					@Pc(269) int local269;
					@Pc(264) int local264;
					if (local34.anInt2712 == 2) {
						local282 = arg8;
						local172 = arg1;
						local289 = arg6;
						local174 = arg5;
					} else {
						local174 = arg5 < local118 ? local118 : arg5;
						local172 = local112 > arg1 ? local112 : arg1;
						local264 = local118 + local34.anInt2698;
						local269 = local34.anInt2722 + local112;
						if (local34.anInt2712 == 9) {
							local264++;
							local269++;
						}
						local282 = local269 >= arg8 ? arg8 : local269;
						local289 = arg6 > local264 ? local264 : arg6;
					}
					if (!local34.aBoolean196 || local282 > local172 && local289 > local174) {
						@Pc(446) int local446;
						@Pc(484) int local484;
						@Pc(518) int local518;
						@Pc(544) int local544;
						@Pc(533) int local533;
						@Pc(559) int local559;
						@Pc(500) int local500;
						@Pc(488) int local488;
						if (local34.anInt2713 != 0) {
							if (local34.anInt2713 == 1337 || local34.anInt2713 == 1403) {
								Static104.anInt2455 = local112;
								Static69.aClass71_9 = local34;
								Static183.anInt4433 = local118;
								Static102.method1903(local34.anInt2722, local34.anInt2698, local34.anInt2713 == 1403, local112, local118);
								Static272.aBooleanArray50[local55] = true;
								if (Static277.aBoolean412) {
									Static41.method847(arg1, arg5, arg8, arg6);
								} else {
									Static50.method950(arg1, arg5, arg8, arg6);
								}
								continue;
							}
							if (local34.anInt2713 == 1338) {
								if (!local34.method2096()) {
									continue;
								}
								method1789(local112, local118, local34, local55);
								if (Static277.aBoolean412) {
									Static41.method847(arg1, arg5, arg8, arg6);
								} else {
									Static50.method950(arg1, arg5, arg8, arg6);
								}
								if (Static147.anInt3196 != 0 && Static147.anInt3196 != 3 || Static14.aBoolean23 || Static137.anInt3016 < local172 || Static29.anInt661 < local174 || local282 <= Static137.anInt3016 || Static29.anInt661 >= local289) {
									continue;
								}
								local269 = Static137.anInt3016 - local112;
								local264 = Static29.anInt661 - local118;
								local446 = local34.anIntArray244[local264];
								if (local269 < local446 || local446 + local34.anIntArray233[local264] < local269) {
									continue;
								}
								local269 -= local34.anInt2722 / 2;
								local264 -= local34.anInt2698 / 2;
								local484 = (int) Static298.aFloat58 + Static245.anInt4881 & 0x7FF;
								local488 = Class68.anIntArray229[local484];
								local488 = local488 * (Static1.anInt4245 + 256) >> 8;
								local500 = Class68.anIntArray226[local484];
								local500 = local500 * (Static1.anInt4245 + 256) >> 8;
								local518 = local488 * local264 + local269 * local500 >> 11;
								local533 = local518 + Static197.aClass14_Sub2_Sub1_2.anInt4680 - (Static197.aClass14_Sub2_Sub1_2.method3656() - 1) * 64 >> 7;
								local544 = local264 * local500 - local488 * local269 >> 11;
								local559 = Static197.aClass14_Sub2_Sub1_2.anInt4630 + 64 - local544 - Static197.aClass14_Sub2_Sub1_2.method3656() * 64 >> 7;
								if (Static125.aBoolean209 && (Static10.anInt246 & 0x40) != 0) {
									@Pc(595) Class71 local595 = Static164.method2829(Static90.anInt2022, Static291.anInt5525);
									if (local595 == null) {
										Static197.method3237();
									} else {
										Static181.method3039((short) 47, Static54.anInt1188, Static8.aString15, local559, 1L, " ->", local533);
									}
									continue;
								}
								if (Static87.anInt1946 == 1) {
									Static181.method3039((short) 60, -1, Static289.aString330, local559, 1L, "", local533);
								}
								Static181.method3039((short) 43, -1, Static118.aString159, local559, 1L, "", local533);
								continue;
							}
							if (local34.anInt2713 == 1339) {
								if (local34.method2096()) {
									Static123.method2164(local34, local112, local55, local118);
									if (Static277.aBoolean412) {
										Static41.method847(arg1, arg5, arg8, arg6);
									} else {
										Static50.method950(arg1, arg5, arg8, arg6);
									}
								}
								continue;
							}
							if (local34.anInt2713 == 1400) {
								Static112.method2059(local112, local34.anInt2698, local118, local34.anInt2722);
								Static272.aBooleanArray50[local55] = true;
								Static78.aBooleanArray17[local55] = true;
								if (Static277.aBoolean412) {
									Static41.method847(arg1, arg5, arg8, arg6);
								} else {
									Static50.method950(arg1, arg5, arg8, arg6);
								}
								continue;
							}
							if (local34.anInt2713 == 1401) {
								Static22.method424(local118, local112, local34.anInt2698, local34.anInt2722);
								Static272.aBooleanArray50[local55] = true;
								Static78.aBooleanArray17[local55] = true;
								if (Static277.aBoolean412) {
									Static41.method847(arg1, arg5, arg8, arg6);
								} else {
									Static50.method950(arg1, arg5, arg8, arg6);
								}
								continue;
							}
							if (local34.anInt2713 == 1402) {
								if (!Static277.aBoolean412) {
									Static286.method4311(local118, local112);
									Static272.aBooleanArray50[local55] = true;
									Static78.aBooleanArray17[local55] = true;
								}
								continue;
							}
							if (local34.anInt2713 == 1405) {
								if (!Static85.aBoolean135) {
									continue;
								}
								local269 = local34.anInt2722 + local112;
								local264 = local118 + 15;
								Static88.aClass1_Sub2_Sub1_2.method445("Fps:" + Static67.anInt1416, local269, local264, 16776960, -1);
								@Pc(775) Runtime local775 = Runtime.getRuntime();
								local264 += 15;
								local484 = (int) ((local775.totalMemory() - local775.freeMemory()) / 1024L);
								local488 = 16776960;
								if (local484 > 65536) {
									local488 = 16711680;
								}
								Static88.aClass1_Sub2_Sub1_2.method445("Mem:" + local484 + "k", local269, local264, local488, -1);
								local264 += 15;
								if (Static277.aBoolean412) {
									local488 = 16776960;
									local500 = (Static94.anInt2208 + Static94.anInt2205 + Static94.anInt2206) / 1024;
									if (local500 > 65536) {
										local488 = 16711680;
									}
									Static88.aClass1_Sub2_Sub1_2.method445("Card:" + local500 + "k", local269, local264, local488, -1);
									local264 += 15;
								}
								local500 = 0;
								local518 = 0;
								local544 = 0;
								for (local533 = 0; local533 < 29; local533++) {
									local500 += Static67.aClass63_Sub1Array2[local533].method1935();
									local518 += Static67.aClass63_Sub1Array2[local533].method1937();
									local544 += Static67.aClass63_Sub1Array2[local533].method1941();
								}
								local533 = local544 * 100 / local500;
								local559 = local518 * 10000 / local500;
								@Pc(922) String local922 = "Cache:" + Static193.method3189(2, 0, (long) local559, true) + "% (" + local533 + "%)";
								Static39.aClass1_Sub2_Sub1_1.method445(local922, local269, local264, 16776960, -1);
								Static272.aBooleanArray50[local55] = true;
								Static78.aBooleanArray17[local55] = true;
								local264 += 12;
								continue;
							}
							if (local34.anInt2713 == 1406) {
								Static59.aClass71_17 = local34;
								Static5.anInt174 = local112;
								Static95.anInt2225 = local118;
								continue;
							}
						}
						if (!Static14.aBoolean23) {
							if (local34.anInt2712 == 0 && local34.aBoolean193 && local172 <= Static137.anInt3016 && Static29.anInt661 >= local174 && local282 > Static137.anInt3016 && local289 > Static29.anInt661 && !Static178.aBoolean303) {
								Static134.anInt2945 = 1;
								Static92.aStringArray26[0] = Static140.aString176;
								Static61.aShortArray23[0] = 1004;
								Static20.anIntArray44[0] = Static254.anInt4981;
								Static266.aStringArray50[0] = "";
							}
							if (Static137.anInt3016 >= local172 && Static29.anInt661 >= local174 && local282 > Static137.anInt3016 && local289 > Static29.anInt661) {
								Static45.method911(Static137.anInt3016 - local112, local34, Static29.anInt661 - local118);
							}
						}
						if (local34.anInt2712 == 0) {
							if (!local34.aBoolean196 && Static36.method763(local34) && local34 != Static247.aClass71_21) {
								continue;
							}
							if (!local34.aBoolean196) {
								if (local34.anInt2650 - local34.anInt2698 < local34.anInt2646) {
									local34.anInt2646 = local34.anInt2650 - local34.anInt2698;
								}
								if (local34.anInt2646 < 0) {
									local34.anInt2646 = 0;
								}
							}
							if (Static277.aBoolean412 && local34.anInt2713 == 1407) {
								Static167.method2904(local112, local118, local34.anInt2722, local34.anInt2698);
							}
							method1786(local34.anInt2655, local172, local112 - local34.anInt2652, local55, arg4, local174, local289, local118 - local34.anInt2646, local282);
							if (local34.aClass71Array1 != null) {
								method1786(local34.anInt2655, local172, local112 - local34.anInt2652, local55, local34.aClass71Array1, local174, local289, local118 - local34.anInt2646, local282);
							}
							@Pc(1153) Class1_Sub17 local1153 = (Class1_Sub17) Static256.aClass70_17.method2075((long) local34.anInt2655);
							if (local1153 != null) {
								if (local1153.anInt2430 == 0 && !Static14.aBoolean23 && local172 <= Static137.anInt3016 && Static29.anInt661 >= local174 && local282 > Static137.anInt3016 && local289 > Static29.anInt661 && !Static178.aBoolean303) {
									Static92.aStringArray26[0] = Static140.aString176;
									Static266.aStringArray50[0] = "";
									Static61.aShortArray23[0] = 1004;
									Static134.anInt2945 = 1;
									Static20.anIntArray44[0] = Static254.anInt4981;
								}
								Static85.method1489(local112, local118, local55, local172, local289, local1153.anInt2431, local174, local282);
							}
							if (Static277.aBoolean412 && local34.anInt2713 == 1407) {
								Static167.method2907();
							}
							if (Static277.aBoolean412) {
								Static41.method847(arg1, arg5, arg8, arg6);
							} else {
								Static50.method950(arg1, arg5, arg8, arg6);
								Static110.method2030();
							}
						}
						if (Static44.aBooleanArray15[local55] || Static267.anInt5202 > 1) {
							if (local34.anInt2712 == 0 && !local34.aBoolean196 && local34.anInt2698 < local34.anInt2650) {
								Static175.method2986(local112 + local34.anInt2722, local34.anInt2646, local34.anInt2650, local118, local34.anInt2698);
							}
							if (local34.anInt2712 != 1) {
								if (local34.anInt2712 == 2) {
									local269 = 0;
									for (local264 = 0; local264 < local34.anInt2669; local264++) {
										for (local446 = 0; local446 < local34.anInt2706; local446++) {
											local488 = (local34.anInt2679 + 32) * local264 + local118;
											local484 = (local34.anInt2648 + 32) * local446 + local112;
											if (local269 < 20) {
												local488 += local34.anIntArray249[local269];
												local484 += local34.anIntArray238[local269];
											}
											if (local34.anIntArray243[local269] > 0) {
												local544 = local34.anIntArray243[local269] - 1;
												if (arg1 < local484 + 32 && arg8 > local484 && local488 + 32 > arg5 && arg6 > local488 || local34 == Static185.aClass71_16 && Static242.anInt4793 == local269) {
													@Pc(1454) Class1_Sub2_Sub11 local1454;
													if (Static191.anInt3934 == 1 && Static91.anInt2041 == local269 && local34.anInt2655 == Static105.anInt2467) {
														local1454 = Static5.method203(local544, null, local34.aBoolean192, 2, local34.anIntArray239[local269], 0);
													} else {
														local1454 = Static5.method203(local544, null, local34.aBoolean192, 1, local34.anIntArray239[local269], 3153952);
													}
													if (Static110.aBoolean183) {
														Static272.aBooleanArray50[local55] = true;
													}
													if (local1454 == null) {
														Static160.method2779(local34);
													} else if (Static185.aClass71_16 == local34 && Static242.anInt4793 == local269) {
														local518 = Static8.anInt226 - Static191.anInt3931;
														if (local518 < 5 && local518 > -5) {
															local518 = 0;
														}
														local500 = Static224.anInt4445 - Static258.anInt5075;
														if (local500 < 5 && local500 > -5) {
															local500 = 0;
														}
														if (Static190.anInt3912 < 5) {
															local500 = 0;
															local518 = 0;
														}
														local1454.method3779(local500 + local484, local518 + local488, 128);
														if (arg0 != -1) {
															@Pc(1539) Class71 local1539 = arg4[arg0 & 0xFFFF];
															@Pc(1545) int local1545;
															@Pc(1543) int local1543;
															if (Static277.aBoolean412) {
																local1543 = Static41.anInt1030;
																local1545 = Static41.anInt1031;
															} else {
																local1543 = Static50.anInt1136;
																local1545 = Static50.anInt1135;
															}
															@Pc(1574) int local1574;
															if (local1545 > local488 + local518 && local1539.anInt2646 > 0) {
																local1574 = (local1545 - local518 - local488) * Static129.anInt2881 / 3;
																if (local1574 > Static129.anInt2881 * 10) {
																	local1574 = Static129.anInt2881 * 10;
																}
																if (local1539.anInt2646 < local1574) {
																	local1574 = local1539.anInt2646;
																}
																local1539.anInt2646 -= local1574;
																Static191.anInt3931 += local1574;
																Static160.method2779(local1539);
															}
															if (local488 + local518 + 32 > local1543 && local1539.anInt2646 < local1539.anInt2650 - local1539.anInt2698) {
																local1574 = Static129.anInt2881 * (local488 + local518 + 32 - local1543) / 3;
																if (local1574 > Static129.anInt2881 * 10) {
																	local1574 = Static129.anInt2881 * 10;
																}
																if (local1539.anInt2650 - local1539.anInt2646 - local1539.anInt2698 < local1574) {
																	local1574 = local1539.anInt2650 - local1539.anInt2646 - local1539.anInt2698;
																}
																Static191.anInt3931 -= local1574;
																local1539.anInt2646 += local1574;
																Static160.method2779(local1539);
															}
														}
													} else if (Static199.aClass71_18 == local34 && local269 == Static238.anInt3830) {
														local1454.method3779(local484, local488, 128);
													} else {
														local1454.method3781(local484, local488);
													}
												}
											} else if (local34.anIntArray248 != null && local269 < 20) {
												@Pc(1361) Class1_Sub2_Sub11 local1361 = local34.method2101(local269);
												if (local1361 != null) {
													local1361.method3781(local484, local488);
												} else if (Static26.aBoolean48) {
													Static160.method2779(local34);
												}
											}
											local269++;
										}
									}
								} else if (local34.anInt2712 == 3) {
									if (Static246.method3815(local34)) {
										local269 = local34.anInt2719;
										if (local34 == Static247.aClass71_21 && local34.anInt2709 != 0) {
											local269 = local34.anInt2709;
										}
									} else {
										local269 = local34.anInt2691;
										if (local34 == Static247.aClass71_21 && local34.anInt2694 != 0) {
											local269 = local34.anInt2694;
										}
									}
									if (local121 == 0) {
										if (local34.aBoolean201) {
											if (Static277.aBoolean412) {
												Static41.method832(local112, local118, local34.anInt2722, local34.anInt2698, local269);
											} else {
												Static50.method954(local112, local118, local34.anInt2722, local34.anInt2698, local269);
											}
										} else if (Static277.aBoolean412) {
											Static41.method844(local112, local118, local34.anInt2722, local34.anInt2698, local269);
										} else {
											Static50.method946(local112, local118, local34.anInt2722, local34.anInt2698, local269);
										}
									} else if (local34.aBoolean201) {
										if (Static277.aBoolean412) {
											Static41.method839(local112, local118, local34.anInt2722, local34.anInt2698, local269, 256 - (local121 & 0xFF));
										} else {
											Static50.method961(local112, local118, local34.anInt2722, local34.anInt2698, local269, 256 - (local121 & 0xFF));
										}
									} else if (Static277.aBoolean412) {
										Static41.method849(local112, local118, local34.anInt2722, local34.anInt2698, local269, 256 - (local121 & 0xFF));
									} else {
										Static50.method944(local112, local118, local34.anInt2722, local34.anInt2698, local269, 256 - (local121 & 0xFF));
									}
								} else {
									@Pc(1894) Class1_Sub2_Sub1 local1894;
									if (local34.anInt2712 == 4) {
										local1894 = local34.method2102(Static221.aClass12Array6);
										if (local1894 != null) {
											@Pc(1906) String local1906 = local34.aString157;
											if (Static246.method3815(local34)) {
												local264 = local34.anInt2719;
												if (local34 == Static247.aClass71_21 && local34.anInt2709 != 0) {
													local264 = local34.anInt2709;
												}
												if (local34.aString156.length() > 0) {
													local1906 = local34.aString156;
												}
											} else {
												local264 = local34.anInt2691;
												if (local34 == Static247.aClass71_21 && local34.anInt2694 != 0) {
													local264 = local34.anInt2694;
												}
											}
											if (local34.aBoolean196 && local34.anInt2703 != -1) {
												@Pc(1959) Class42 local1959 = Static112.method2060(local34.anInt2703);
												local1906 = local1959.aString87;
												if (local1906 == null) {
													local1906 = "null";
												}
												if ((local1959.anInt1502 == 1 || local34.anInt2661 != 1) && local34.anInt2661 != -1) {
													local1906 = "<col=ff9040>" + local1906 + "</col> x" + Static164.method2827(local34.anInt2661);
												}
											}
											if (local34 == Static3.aClass71_1) {
												local264 = local34.anInt2691;
												local1906 = Static143.aString180;
											}
											if (!local34.aBoolean196) {
												local1906 = Static287.method4348(local34, local1906);
											}
											local1894.method449(local1906, local112, local118, local34.anInt2722, local34.anInt2698, local264, local34.aBoolean199 ? 0 : -1, local34.anInt2660, local34.anInt2639, local34.anInt2643);
										} else if (Static26.aBoolean48) {
											Static160.method2779(local34);
										}
									} else if (local34.anInt2712 == 5) {
										@Pc(2081) Class1_Sub2_Sub11 local2081;
										if (!local34.aBoolean196) {
											local2081 = local34.method2100(Static246.method3815(local34));
											if (local2081 != null) {
												local2081.method3781(local112, local118);
											} else if (Static26.aBoolean48) {
												Static160.method2779(local34);
											}
										} else if (local34.anInt2656 >= 0) {
											@Pc(2551) Class100 local2551 = local34.method2099();
											if (Static277.aBoolean412) {
												local2551.method2742(0, local112, local118, local34.anInt2722, local34.anInt2698, local34.anInt2676, local34.anInt2682, 0);
											} else {
												local2551.method2737(0, local112, local118, local34.anInt2722, local34.anInt2698, local34.anInt2676, local34.anInt2682);
											}
										} else {
											if (local34.anInt2703 == -1) {
												local2081 = local34.method2100(false);
											} else if (local34.aBoolean194 && Static197.aClass14_Sub2_Sub1_2.aClass93_1 != null) {
												local2081 = Static5.method203(local34.anInt2703, Static197.aClass14_Sub2_Sub1_2.aClass93_1, local34.aBoolean192, local34.anInt2653, local34.anInt2661, local34.anInt2690);
											} else {
												local2081 = Static5.method203(local34.anInt2703, null, local34.aBoolean192, local34.anInt2653, local34.anInt2661, local34.anInt2690);
											}
											if (local2081 != null) {
												local264 = local2081.anInt4871;
												local446 = local2081.anInt4875;
												if (local34.aBoolean202) {
													local484 = (local34.anInt2722 + local264 - 1) / local264;
													local488 = (local34.anInt2698 + local446 - 1) / local446;
													if (Static277.aBoolean412) {
														Static41.method836(local112, local118, local112 + local34.anInt2722, local34.anInt2698 + local118);
														@Pc(2164) Class1_Sub2_Sub11_Sub1 local2164 = (Class1_Sub2_Sub11_Sub1) local2081;
														@Pc(2169) boolean local2169 = Static220.method3472(local2081.anInt4874);
														@Pc(2174) boolean local2174 = Static220.method3472(local2081.anInt4869);
														if (local2169 && local2174) {
															if (local121 == 0) {
																local2164.method3125(local112, local118, local484, local488);
															} else {
																local2164.method3121(local112, local118, 256 - (local121 & 0xFF), local484, local488);
															}
														} else if (local2169) {
															for (local533 = 0; local533 < local488; local533++) {
																if (local121 == 0) {
																	local2164.method3125(local112, local446 * local533 + local118, local484, 1);
																} else {
																	local2164.method3121(local112, local446 * local533 + local118, -(local121 & 0xFF) + 256, local484, 1);
																}
															}
														} else if (local2174) {
															for (local533 = 0; local533 < local484; local533++) {
																if (local121 == 0) {
																	local2164.method3125(local112 + local533 * local264, local118, 1, local488);
																} else {
																	local2164.method3121(local112 + local533 * local264, local118, 256 - (local121 & 0xFF), 1, local488);
																}
															}
														} else {
															for (local533 = 0; local533 < local484; local533++) {
																for (local559 = 0; local559 < local488; local559++) {
																	if (local121 == 0) {
																		local2081.method3781(local112 + local533 * local264, local446 * local559 + local118);
																	} else {
																		local2081.method3779(local533 * local264 + local112, local118 - -(local446 * local559), 256 - (local121 & 0xFF));
																	}
																}
															}
														}
														Static41.method847(arg1, arg5, arg8, arg6);
													} else {
														Static50.method947(local112, local118, local112 + local34.anInt2722, local118 - -local34.anInt2698);
														for (local500 = 0; local500 < local484; local500++) {
															for (local518 = 0; local518 < local488; local518++) {
																if (local34.anInt2697 != 0) {
																	local2081.method3776(local34.anInt2697, local264 / 2 + local112 + local500 * local264, local446 / 2 + (local118 - -(local518 * local446)), 4096);
																} else if (local121 == 0) {
																	local2081.method3781(local112 + local264 * local500, local518 * local446 + local118);
																} else {
																	local2081.method3779(local264 * local500 + local112, local118 - -(local518 * local446), 256 - (local121 & 0xFF));
																}
															}
														}
														Static50.method950(arg1, arg5, arg8, arg6);
													}
												} else {
													local484 = local34.anInt2722 * 4096 / local264;
													if (local34.anInt2697 != 0) {
														local2081.method3776(local34.anInt2697, local112 + local34.anInt2722 / 2, local118 + local34.anInt2698 / 2, local484);
													} else if (local121 != 0) {
														local2081.method3780(local112, local118, local34.anInt2722, local34.anInt2698, 256 - (local121 & 0xFF));
													} else if (local264 == local34.anInt2722 && local446 == local34.anInt2698) {
														local2081.method3781(local112, local118);
													} else {
														local2081.method3778(local112, local118, local34.anInt2722, local34.anInt2698);
													}
												}
											} else if (Static26.aBoolean48) {
												Static160.method2779(local34);
											}
										}
									} else {
										@Pc(2644) Class42 local2644;
										if (local34.anInt2712 == 6) {
											@Pc(2619) boolean local2619 = Static246.method3815(local34);
											@Pc(2621) Class14_Sub6 local2621 = null;
											if (local2619) {
												local264 = local34.anInt2678;
											} else {
												local264 = local34.anInt2687;
											}
											local484 = 0;
											if (local34.anInt2703 != -1) {
												local2644 = Static112.method2060(local34.anInt2703);
												if (local2644 != null) {
													local2644 = local2644.method1253(local34.anInt2661);
													@Pc(2661) Class125 local2661 = local264 == -1 ? null : Static90.method1591(local264);
													if (local34.aBoolean194 && Static197.aClass14_Sub2_Sub1_2.aClass93_1 != null) {
														local2621 = local2644.method1260(local34.anInt2668, 1, Static197.aClass14_Sub2_Sub1_2.aClass93_1, local2661, local34.anInt2654, local34.anInt2717);
													} else {
														local2621 = local2644.method1260(local34.anInt2668, 1, null, local2661, local34.anInt2654, local34.anInt2717);
													}
													if (local2621 == null) {
														Static160.method2779(local34);
													} else {
														local484 = -local2621.method4091() / 2;
													}
												}
											} else if (local34.anInt2705 == 5) {
												if (local34.anInt2651 == -1) {
													local2621 = Static170.aClass93_2.method2589(0, null, null, -1, -1, -1, null, 0, -1);
												} else {
													local488 = local34.anInt2651 & 0x7FF;
													if (Static71.anInt1526 == local488) {
														local488 = 2047;
													}
													@Pc(2737) Class14_Sub2_Sub1 local2737 = Static98.aClass14_Sub2_Sub1Array1[local488];
													@Pc(2746) Class125 local2746 = local264 == -1 ? null : Static90.method1591(local264);
													if (local2737 != null && (int) Static93.method1658(local2737.aString99) << 11 == (local34.anInt2651 & 0xFFFFF800)) {
														local2621 = local2737.aClass93_1.method2589(0, local2746, null, -1, -1, 0, null, 0, local34.anInt2654);
													}
												}
											} else if (local264 == -1) {
												local2621 = local34.method2095(local2619, Static197.aClass14_Sub2_Sub1_2.aClass93_1, -1, -1, null, 0);
												if (local2621 == null && Static26.aBoolean48) {
													Static160.method2779(local34);
												}
											} else {
												@Pc(2805) Class125 local2805 = Static90.method1591(local264);
												local2621 = local34.method2095(local2619, Static197.aClass14_Sub2_Sub1_2.aClass93_1, local34.anInt2654, local34.anInt2717, local2805, local34.anInt2668);
												if (local2621 == null && Static26.aBoolean48) {
													Static160.method2779(local34);
												}
											}
											if (local2621 != null) {
												if (local34.anInt2645 > 0) {
													local488 = (local34.anInt2722 << 8) / local34.anInt2645;
												} else {
													local488 = 256;
												}
												if (local34.anInt2636 <= 0) {
													local500 = 256;
												} else {
													local500 = (local34.anInt2698 << 8) / local34.anInt2636;
												}
												local518 = local112 + local34.anInt2722 / 2 + (local488 * local34.anInt2688 >> 8);
												local544 = local118 + local34.anInt2698 / 2 + (local500 * local34.anInt2699 >> 8);
												if (Static277.aBoolean412) {
													if (local34.aBoolean189) {
														Static277.method4199(local518, local544, local34.anInt2634, local34.aShort20, local488, local500);
													} else {
														Static277.method4198(local518, local544, local488, local500);
														Static277.method4224((float) local34.aShort21, (float) local34.aShort20 * 1.5F);
													}
													Static277.method4216();
													Static277.method4192(true);
													Static277.method4209(false);
													Static61.method1094(Static285.anInt5431);
													if (Static129.aBoolean215) {
														Static41.method842();
														Static277.method4220();
														Static41.method847(arg1, arg5, arg8, arg6);
														Static129.aBoolean215 = false;
													}
													if (local34.aBoolean190) {
														Static277.method4208();
													}
													local559 = Class68.anIntArray226[local34.anInt2635] * local34.anInt2634 >> 16;
													local533 = Class68.anIntArray229[local34.anInt2635] * local34.anInt2634 >> 16;
													if (local34.aBoolean196) {
														local2621.method4113(local34.anInt2672, local34.anInt2637, local34.anInt2635, local34.anInt2718, local34.anInt2728 + local484 + local533, local559 + local34.anInt2728, -1L);
													} else {
														local2621.method4113(local34.anInt2672, 0, local34.anInt2635, 0, local533, local559, -1L);
													}
													if (local34.aBoolean190) {
														Static277.method4215();
													}
												} else {
													Static110.method2027(local518, local544);
													local559 = Class68.anIntArray226[local34.anInt2635] * local34.anInt2634 >> 16;
													local533 = local34.anInt2634 * Class68.anIntArray229[local34.anInt2635] >> 16;
													if (!local34.aBoolean196) {
														local2621.method4113(local34.anInt2672, 0, local34.anInt2635, 0, local533, local559, -1L);
													} else if (local34.aBoolean189) {
														((Class14_Sub6_Sub2) local2621).method4139(local34.anInt2672, local34.anInt2637, local34.anInt2635, local34.anInt2718, local533 + local484 + local34.anInt2728, local559 + local34.anInt2728, local34.anInt2634);
													} else {
														local2621.method4113(local34.anInt2672, local34.anInt2637, local34.anInt2635, local34.anInt2718, local484 + local533 + local34.anInt2728, local559 + local34.anInt2728, -1L);
													}
													Static110.method2035();
												}
											}
										} else {
											if (local34.anInt2712 == 7) {
												local1894 = local34.method2102(Static221.aClass12Array6);
												if (local1894 == null) {
													if (Static26.aBoolean48) {
														Static160.method2779(local34);
													}
													continue;
												}
												local264 = 0;
												for (local446 = 0; local446 < local34.anInt2669; local446++) {
													for (local484 = 0; local484 < local34.anInt2706; local484++) {
														if (local34.anIntArray243[local264] > 0) {
															local2644 = Static112.method2060(local34.anIntArray243[local264] - 1);
															@Pc(3226) String local3226;
															if (local2644.anInt1502 != 1 && local34.anIntArray239[local264] == 1) {
																local3226 = "<col=ff9040>" + local2644.aString87 + "</col>";
															} else {
																local3226 = "<col=ff9040>" + local2644.aString87 + "</col> x" + Static164.method2827(local34.anIntArray239[local264]);
															}
															local518 = (local34.anInt2648 + 115) * local484 + local112;
															local544 = local118 + local446 * (local34.anInt2679 + 12);
															if (local34.anInt2660 == 0) {
																local1894.method458(local3226, local518, local544, local34.anInt2691, local34.aBoolean199 ? 0 : -1);
															} else if (local34.anInt2660 == 1) {
																local1894.method456(local3226, local518 + 57, local544, local34.anInt2691, local34.aBoolean199 ? 0 : -1);
															} else {
																local1894.method445(local3226, local518 + 114, local544, local34.anInt2691, local34.aBoolean199 ? 0 : -1);
															}
														}
														local264++;
													}
												}
											}
											if (local34.anInt2712 == 8 && local34 == Static48.aClass71_6 && Static176.anInt3731 == Static212.anInt4225) {
												local264 = 0;
												local269 = 0;
												@Pc(3342) String local3342 = local34.aString157;
												@Pc(3344) Class1_Sub2_Sub1 local3344 = Static88.aClass1_Sub2_Sub1_2;
												local3342 = Static287.method4348(local34, local3342);
												@Pc(3367) String local3367;
												while (local3342.length() > 0) {
													local500 = local3342.indexOf("<br>");
													if (local500 == -1) {
														local3367 = local3342;
														local3342 = "";
													} else {
														local3367 = local3342.substring(0, local500);
														local3342 = local3342.substring(local500 + 4);
													}
													local518 = local3344.method451(local3367);
													local264 += local3344.anInt486 + 1;
													if (local518 > local269) {
														local269 = local518;
													}
												}
												local264 += 7;
												local269 += 6;
												local518 = local118 + local34.anInt2698 + 5;
												if (local264 + local518 > arg6) {
													local518 = arg6 - local264;
												}
												local500 = local34.anInt2722 + local112 - local269 - 5;
												if (local112 + 5 > local500) {
													local500 = local112 + 5;
												}
												if (local500 + local269 > arg8) {
													local500 = arg8 - local269;
												}
												if (Static277.aBoolean412) {
													Static41.method832(local500, local518, local269, local264, 16777120);
													Static41.method844(local500, local518, local269, local264, 0);
												} else {
													Static50.method954(local500, local518, local269, local264, 16777120);
													Static50.method946(local500, local518, local269, local264, 0);
												}
												local544 = local3344.anInt486 + local518 + 2;
												local3342 = local34.aString157;
												local3342 = Static287.method4348(local34, local3342);
												while (local3342.length() > 0) {
													local533 = local3342.indexOf("<br>");
													if (local533 == -1) {
														local3367 = local3342;
														local3342 = "";
													} else {
														local3367 = local3342.substring(0, local533);
														local3342 = local3342.substring(local533 + 4);
													}
													local3344.method458(local3367, local500 + 3, local544, 0, -1);
													local544 += local3344.anInt486 + 1;
												}
											}
											if (local34.anInt2712 == 9) {
												if (local34.aBoolean198) {
													local264 = local34.anInt2698 + local118;
													local484 = local118;
													local446 = local34.anInt2722 + local112;
												} else {
													local446 = local112 + local34.anInt2722;
													local484 = local34.anInt2698 + local118;
													local264 = local118;
												}
												if (local34.anInt2638 == 1) {
													if (Static277.aBoolean412) {
														Static41.method846(local112, local264, local446, local484, local34.anInt2691);
													} else {
														Static50.method959(local112, local264, local446, local484, local34.anInt2691);
													}
												} else if (Static277.aBoolean412) {
													Static41.method840(local112, local264, local446, local484, local34.anInt2691, local34.anInt2638);
												} else {
													Static50.method945(local112, local264, local446, local484, local34.anInt2691, local34.anInt2638);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIILclient!in;I)V")
	private static void method1789(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class71 arg2, @OriginalArg(4) int arg3) {
		Static105.method1947();
		if (Static277.aBoolean412) {
			Static41.method847(arg0, arg1, arg0 + arg2.anInt2722, arg1 + arg2.anInt2698);
		} else {
			Static50.method950(arg0, arg1, arg0 + arg2.anInt2722, arg1 - -arg2.anInt2698);
		}
		if (Static147.anInt3196 != 2 && Static147.anInt3196 != 5 && Static24.aClass1_Sub2_Sub11_18 != null) {
			@Pc(58) int local58 = Static197.aClass14_Sub2_Sub1_2.anInt4680 / 32 + 48;
			@Pc(68) int local68 = 464 - Static197.aClass14_Sub2_Sub1_2.anInt4630 / 32;
			@Pc(75) int local75 = Static245.anInt4881 + (int) Static298.aFloat58 & 0x7FF;
			if (Static277.aBoolean412) {
				((Class1_Sub2_Sub11_Sub1) Static24.aClass1_Sub2_Sub11_18).method3122(arg0, arg1, arg2.anInt2722, arg2.anInt2698, local58, local68, local75, Static1.anInt4245 + 256, (Class1_Sub2_Sub11_Sub1) arg2.method2100(false));
			} else {
				((Class1_Sub2_Sub11_Sub2) Static24.aClass1_Sub2_Sub11_18).method3786(arg0, arg1, arg2.anInt2722, arg2.anInt2698, local58, local68, local75, Static1.anInt4245 + 256, arg2.anIntArray244, arg2.anIntArray233);
			}
			@Pc(162) int local162;
			@Pc(182) int local182;
			@Pc(198) int local198;
			@Pc(186) int local186;
			@Pc(227) int local227;
			@Pc(217) int local217;
			@Pc(261) int local261;
			@Pc(295) int local295;
			if (Static92.aClass82_6 != null) {
				for (@Pc(125) int local125 = 0; local125 < Static92.aClass82_6.anInt2893; local125++) {
					if (Static92.aClass82_6.method2233(local125)) {
						local162 = ((Static92.aClass82_6.anIntArray262[local125] >> 14 & 0x3FFF) - Static53.anInt5288) * 4 + 2 - Static197.aClass14_Sub2_Sub1_2.anInt4680 / 32;
						local182 = ((Static92.aClass82_6.anIntArray262[local125] & 0x3FFF) - Static83.anInt1875) * 4 + 2 - Static197.aClass14_Sub2_Sub1_2.anInt4630 / 32;
						local186 = Class68.anIntArray226[local75];
						@Pc(194) int local194 = local186 * 256 / (Static1.anInt4245 + 256);
						local198 = Class68.anIntArray229[local75];
						@Pc(206) int local206 = local198 * 256 / (Static1.anInt4245 + 256);
						local217 = local194 * local182 - local206 * local162 >> 16;
						local227 = local194 * local162 + local182 * local206 >> 16;
						@Pc(229) Class1_Sub2_Sub1 local229 = Static39.aClass1_Sub2_Sub1_1;
						if (Static92.aClass82_6.method2229(local125) == 1) {
							local229 = Static88.aClass1_Sub2_Sub1_2;
						}
						if (Static92.aClass82_6.method2229(local125) == 2) {
							local229 = Static134.aClass1_Sub2_Sub1_3;
						}
						local261 = local229.method466(Static92.aClass82_6.aStringArray38[local125], 100);
						local227 -= local261 / 2;
						if (-arg2.anInt2722 <= local227 && local227 <= arg2.anInt2722 && -arg2.anInt2698 <= local217 && arg2.anInt2698 >= local217) {
							local295 = 16777215;
							if (Static92.aClass82_6.anIntArray264[local125] != -1) {
								local295 = Static92.aClass82_6.anIntArray264[local125];
							}
							if (Static277.aBoolean412) {
								Static41.method845((Class1_Sub2_Sub11_Sub1) arg2.method2100(false));
							} else {
								Static50.method957(arg2.anIntArray244, arg2.anIntArray233);
							}
							local229.method465(Static92.aClass82_6.aStringArray38[local125], arg0 + local227 + arg2.anInt2722 / 2, arg2.anInt2698 / 2 + arg1 + -local217, local261, 50, local295, 0, 1, 0, 0);
							if (Static277.aBoolean412) {
								Static41.method833();
							} else {
								Static50.method955();
							}
						}
					}
				}
			}
			for (local162 = 0; local162 < Static55.anInt1210; local162++) {
				local198 = Static171.anIntArray328[local162] * 4 + 2 - Static197.aClass14_Sub2_Sub1_2.anInt4630 / 32;
				local182 = Static85.anIntArray176[local162] * 4 + 2 - Static197.aClass14_Sub2_Sub1_2.anInt4680 / 32;
				@Pc(412) Class181 local412 = Static183.method3511(Static52.anIntArray125[local162]);
				if (local412.anIntArray552 != null) {
					local412 = local412.method4427();
					if (local412 == null || local412.anInt5567 == -1) {
						continue;
					}
				}
				Static32.method3625(Static194.aClass1_Sub2_Sub11Array6[local412.anInt5567], arg0, arg1, arg2, local198, local182);
			}
			for (local162 = 0; local162 < 104; local162++) {
				for (local182 = 0; local182 < 104; local182++) {
					@Pc(465) Class61 local465 = Static229.aClass61ArrayArrayArray1[Static140.anInt3034][local162][local182];
					if (local465 != null) {
						local227 = local182 * 4 + 2 - Static197.aClass14_Sub2_Sub1_2.anInt4630 / 32;
						local186 = local162 * 4 + 2 - Static197.aClass14_Sub2_Sub1_2.anInt4680 / 32;
						Static32.method3625(Static262.aClass1_Sub2_Sub11Array11[0], arg0, arg1, arg2, local227, local186);
					}
				}
			}
			for (local162 = 0; local162 < Static233.anInt4582; local162++) {
				@Pc(522) Class14_Sub2_Sub2 local522 = Static254.aClass14_Sub2_Sub2Array1[Static281.anIntArray464[local162]];
				if (local522 != null && local522.method3647()) {
					@Pc(532) Class46 local532 = local522.aClass46_1;
					if (local532 != null && local532.anIntArray148 != null) {
						local532 = local532.method1283();
					}
					if (local532 != null && local532.aBoolean112 && local532.aBoolean111) {
						local186 = local522.anInt4680 / 32 - Static197.aClass14_Sub2_Sub1_2.anInt4680 / 32;
						local227 = local522.anInt4630 / 32 - Static197.aClass14_Sub2_Sub1_2.anInt4630 / 32;
						if (local532.anInt1570 == -1) {
							Static32.method3625(Static262.aClass1_Sub2_Sub11Array11[1], arg0, arg1, arg2, local227, local186);
						} else {
							Static32.method3625(Static194.aClass1_Sub2_Sub11Array6[local532.anInt1570], arg0, arg1, arg2, local227, local186);
						}
					}
				}
			}
			for (local162 = 0; local162 < Static278.anInt5374; local162++) {
				@Pc(617) Class14_Sub2_Sub1 local617 = Static98.aClass14_Sub2_Sub1Array1[Static17.anIntArray444[local162]];
				if (local617 != null && local617.method3647()) {
					local186 = local617.anInt4630 / 32 - Static197.aClass14_Sub2_Sub1_2.anInt4630 / 32;
					local198 = local617.anInt4680 / 32 - Static197.aClass14_Sub2_Sub1_2.anInt4680 / 32;
					@Pc(646) boolean local646 = false;
					@Pc(651) long local651 = Static93.method1658(local617.aString99);
					for (local261 = 0; local261 < Static49.anInt1128; local261++) {
						if (local651 == Static298.aLongArray11[local261] && Static117.anIntArray242[local261] != 0) {
							local646 = true;
							break;
						}
					}
					@Pc(676) boolean local676 = false;
					for (local295 = 0; local295 < Static128.anInt2850; local295++) {
						if (local651 == Static117.aClass1_Sub4Array1[local295].aLong205) {
							local676 = true;
							break;
						}
					}
					@Pc(706) boolean local706 = false;
					if (Static197.aClass14_Sub2_Sub1_2.anInt1743 != 0 && local617.anInt1743 != 0 && local617.anInt1743 == Static197.aClass14_Sub2_Sub1_2.anInt1743) {
						local706 = true;
					}
					if (local646) {
						Static32.method3625(Static262.aClass1_Sub2_Sub11Array11[3], arg0, arg1, arg2, local186, local198);
					} else if (local676) {
						Static32.method3625(Static262.aClass1_Sub2_Sub11Array11[5], arg0, arg1, arg2, local186, local198);
					} else if (local706) {
						Static32.method3625(Static262.aClass1_Sub2_Sub11Array11[4], arg0, arg1, arg2, local186, local198);
					} else {
						Static32.method3625(Static262.aClass1_Sub2_Sub11Array11[2], arg0, arg1, arg2, local186, local198);
					}
				}
			}
			@Pc(781) Class80[] local781 = Static198.aClass80Array2;
			for (local182 = 0; local182 < local781.length; local182++) {
				@Pc(791) Class80 local791 = local781[local182];
				if (local791 != null && local791.anInt2843 != 0 && Static237.anInt4710 % 20 < 10) {
					if (local791.anInt2843 == 1 && local791.anInt2839 >= 0 && local791.anInt2839 < Static254.aClass14_Sub2_Sub2Array1.length) {
						@Pc(833) Class14_Sub2_Sub2 local833 = Static254.aClass14_Sub2_Sub2Array1[local791.anInt2839];
						if (local833 != null) {
							local227 = local833.anInt4680 / 32 - Static197.aClass14_Sub2_Sub1_2.anInt4680 / 32;
							local217 = local833.anInt4630 / 32 - Static197.aClass14_Sub2_Sub1_2.anInt4630 / 32;
							Static193.method3188(arg2, local791.anInt2848, 360000, arg0, arg1, local217, local227);
						}
					}
					if (local791.anInt2843 == 2) {
						local186 = (local791.anInt2847 - Static53.anInt5288) * 4 + 2 - Static197.aClass14_Sub2_Sub1_2.anInt4680 / 32;
						local217 = local791.anInt2838 * 4;
						local217 *= local217;
						local227 = (local791.anInt2855 - Static83.anInt1875) * 4 + 2 - Static197.aClass14_Sub2_Sub1_2.anInt4630 / 32;
						Static193.method3188(arg2, local791.anInt2848, local217, arg0, arg1, local227, local186);
					}
					if (local791.anInt2843 == 10 && local791.anInt2839 >= 0 && local791.anInt2839 < Static98.aClass14_Sub2_Sub1Array1.length) {
						@Pc(942) Class14_Sub2_Sub1 local942 = Static98.aClass14_Sub2_Sub1Array1[local791.anInt2839];
						if (local942 != null) {
							local217 = local942.anInt4630 / 32 - Static197.aClass14_Sub2_Sub1_2.anInt4630 / 32;
							local227 = local942.anInt4680 / 32 - Static197.aClass14_Sub2_Sub1_2.anInt4680 / 32;
							Static193.method3188(arg2, local791.anInt2848, 360000, arg0, arg1, local217, local227);
						}
					}
				}
			}
			if (Static45.anInt1101 != 0) {
				local162 = Static45.anInt1101 * 4 + Static197.aClass14_Sub2_Sub1_2.method3656() * 2 + 2 - Static197.aClass14_Sub2_Sub1_2.anInt4680 / 32 - 2;
				local182 = Static44.anInt1074 * 4 + (Static197.aClass14_Sub2_Sub1_2.method3656() + -1) * 2 + 2 - Static197.aClass14_Sub2_Sub1_2.anInt4630 / 32;
				Static32.method3625(Static171.aClass1_Sub2_Sub11_15, arg0, arg1, arg2, local182, local162);
			}
			if (Static277.aBoolean412) {
				Static41.method832(arg2.anInt2722 / 2 + arg0 - 1, arg2.anInt2698 / 2 + -1 + arg1, 3, 3, 16777215);
			} else {
				Static50.method954(arg2.anInt2722 / 2 + arg0 - 1, arg1 + arg2.anInt2698 / 2 + -1, 3, 3, 16777215);
			}
		} else if (Static277.aBoolean412) {
			@Pc(1094) Class1_Sub2_Sub11 local1094 = arg2.method2100(false);
			if (local1094 != null) {
				local1094.method3781(arg0, arg1);
			}
		} else {
			Static50.method942(arg0, arg1, arg2.anIntArray244, arg2.anIntArray233);
		}
		Static78.aBooleanArray17[arg3] = true;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIILclient!fj;)V")
	public static void method1790(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class14_Sub2_Sub1 arg3) {
		if (arg3 == Static197.aClass14_Sub2_Sub1_2 || Static134.anInt2945 >= 400) {
			return;
		}
		@Pc(40) String local40;
		if (arg3.anInt1717 == 0) {
			@Pc(44) boolean local44 = true;
			if (Static197.aClass14_Sub2_Sub1_2.anInt1738 != -1 && arg3.anInt1738 != -1) {
				@Pc(65) int local65 = arg3.anInt1719 >= Static197.aClass14_Sub2_Sub1_2.anInt1719 ? arg3.anInt1719 : Static197.aClass14_Sub2_Sub1_2.anInt1719;
				@Pc(72) int local72 = Static197.aClass14_Sub2_Sub1_2.anInt1719 - arg3.anInt1719;
				@Pc(83) int local83 = Static197.aClass14_Sub2_Sub1_2.anInt1738 >= arg3.anInt1738 ? arg3.anInt1738 : Static197.aClass14_Sub2_Sub1_2.anInt1738;
				@Pc(93) int local93 = local83 + local65 * 10 / 100 + 5;
				if (local72 < 0) {
					local72 = -local72;
				}
				if (local72 > local93) {
					local44 = false;
				}
			}
			@Pc(114) String local114 = Static87.anInt1946 == 1 ? Static146.aString185 : Static25.aString37;
			if (arg3.anInt1734 <= arg3.anInt1719) {
				local40 = arg3.method1357() + (local44 ? Static207.method3774(arg3.anInt1719, Static197.aClass14_Sub2_Sub1_2.anInt1719) : "<col=ffffff>") + " (" + local114 + arg3.anInt1719 + ")";
			} else {
				local40 = arg3.method1357() + (local44 ? Static207.method3774(arg3.anInt1719, Static197.aClass14_Sub2_Sub1_2.anInt1719) : "<col=ffffff>") + " (" + local114 + arg3.anInt1719 + "+" + (arg3.anInt1734 - arg3.anInt1719) + ")";
			}
		} else {
			local40 = arg3.method1357() + " (" + Static246.aString286 + arg3.anInt1717 + ")";
		}
		@Pc(253) int local253;
		if (Static191.anInt3934 == 1) {
			Static181.method3039((short) 26, Static162.anInt3469, Static163.aString203, arg0, (long) arg2, Static194.aString237 + " -> <col=ffffff>" + local40, arg1);
		} else if (!Static125.aBoolean209) {
			for (local253 = 7; local253 >= 0; local253--) {
				if (Static258.aStringArray53[local253] != null) {
					@Pc(271) short local271 = 0;
					if (Static87.anInt1946 == 0 && Static258.aStringArray53[local253].equalsIgnoreCase(Static141.aString177)) {
						if (Static197.aClass14_Sub2_Sub1_2.anInt1719 < arg3.anInt1719) {
							local271 = 2000;
						}
						if (Static197.aClass14_Sub2_Sub1_2.anInt1743 != 0 && arg3.anInt1743 != 0) {
							if (Static197.aClass14_Sub2_Sub1_2.anInt1743 == arg3.anInt1743) {
								local271 = 2000;
							} else {
								local271 = 0;
							}
						}
					} else if (Static131.aBooleanArray30[local253]) {
						local271 = 2000;
					}
					@Pc(327) short local327 = Static199.aShortArray73[local253];
					@Pc(332) short local332 = (short) (local327 + local271);
					Static181.method3039(local332, Static75.anIntArray153[local253], Static258.aStringArray53[local253], arg0, (long) arg2, "<col=ffffff>" + local40, arg1);
				}
			}
		} else if ((Static10.anInt246 & 0x8) != 0) {
			Static181.method3039((short) 20, Static54.anInt1188, Static8.aString15, arg0, (long) arg2, Static170.aString213 + " -> <col=ffffff>" + local40, arg1);
		}
		for (local253 = 0; local253 < Static134.anInt2945; local253++) {
			if (Static61.aShortArray23[local253] == 43) {
				Static266.aStringArray50[local253] = "<col=ffffff>" + local40;
				break;
			}
		}
	}
}
