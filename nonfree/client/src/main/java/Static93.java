import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!ih", name = "Z", descriptor = "Lclient!bj;")
	public static Class17 aClass17_2;

	@OriginalMember(owner = "client!ih", name = "bb", descriptor = "[Lclient!pg;")
	public static Class64[] aClass64Array2;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(III)Lclient!qc;")
	public static Class97 method2039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub9 local7 = Static174.aClass1_Sub9ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class97 local14 = local7.aClass97_1;
			local7.aClass97_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIIBII[Lclient!o;)V")
	public static void method2040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class86[] arg8) {
		Static205.method3251(arg1, arg6, arg3, arg5);
		Static74.method1327();
		for (@Pc(23) int local23 = 0; local23 < arg8.length; local23++) {
			@Pc(29) Class86 local29 = arg8[local23];
			if (local29 != null && (arg2 == local29.anInt3225 || arg2 == -1412584499 && Static54.aClass86_1 == local29)) {
				@Pc(82) int local82;
				if (arg0 == -1) {
					Static25.anIntArray45[Static14.anInt333] = local29.anInt3215 + arg4;
					Static189.anIntArray347[Static14.anInt333] = arg7 + local29.anInt3268;
					Static170.anIntArray328[Static14.anInt333] = local29.anInt3280;
					Static204.anIntArray232[Static14.anInt333] = local29.anInt3270;
					local82 = Static14.anInt333++;
				} else {
					local82 = arg0;
				}
				local29.anInt3254 = Static128.anInt2802;
				local29.anInt3234 = local82;
				if (!local29.aBoolean280 || !Static34.method677(local29)) {
					if (local29.anInt3285 > 0) {
						Static195.method3185(local29);
					}
					@Pc(107) int local107 = local29.anInt3277;
					@Pc(112) int local112 = arg4 + local29.anInt3215;
					@Pc(118) int local118 = local29.anInt3268 + arg7;
					if (Static219.aBoolean426 && (Static34.method676(local29) != 0 || local29.anInt3286 == 0) && local107 > 127) {
						local107 = 127;
					}
					@Pc(159) int local159;
					@Pc(170) int local170;
					if (Static54.aClass86_1 == local29) {
						if (arg2 != -1412584499 && !local29.aBoolean273) {
							Static201.aClass86Array2 = arg8;
							Static202.anInt4379 = arg4;
							Static13.anInt321 = arg7;
							continue;
						}
						if (Static157.aBoolean305 && Static185.aBoolean438) {
							local159 = Static220.anInt4822;
							local159 -= Static199.anInt4324;
							if (local159 < Static61.anInt1488) {
								local159 = Static61.anInt1488;
							}
							local170 = Static181.anInt4311;
							if (Static61.anInt1488 + Static83.aClass86_5.anInt3280 < local159 - -local29.anInt3280) {
								local159 = Static61.anInt1488 + Static83.aClass86_5.anInt3280 - local29.anInt3280;
							}
							local112 = local159;
							local170 -= Static163.anInt3550;
							if (Static204.anInt2499 > local170) {
								local170 = Static204.anInt2499;
							}
							if (Static204.anInt2499 + Static83.aClass86_5.anInt3270 < local170 - -local29.anInt3270) {
								local170 = Static204.anInt2499 + Static83.aClass86_5.anInt3270 - local29.anInt3270;
							}
							local118 = local170;
						}
						if (!local29.aBoolean273) {
							local107 = 128;
						}
					}
					@Pc(240) int local240;
					@Pc(234) int local234;
					@Pc(261) int local261;
					@Pc(266) int local266;
					if (local29.anInt3286 == 2) {
						local234 = arg5;
						local170 = arg6;
						local159 = arg1;
						local240 = arg3;
					} else {
						local170 = local118 > arg6 ? local118 : arg6;
						local159 = arg1 < local112 ? local112 : arg1;
						local261 = local112 + local29.anInt3280;
						local266 = local29.anInt3270 + local118;
						if (local29.anInt3286 == 9) {
							local266++;
							local261++;
						}
						local234 = local266 < arg5 ? local266 : arg5;
						local240 = local261 < arg3 ? local261 : arg3;
					}
					if (!local29.aBoolean280 || local240 > local159 && local170 < local234) {
						@Pc(543) int local543;
						@Pc(545) int local545;
						if (local29.anInt3285 != 0) {
							if (local29.anInt3285 == 1337) {
								Static122.anInt2673 = local118;
								Static168.anInt3626 = local112;
								Static158.aClass86_11 = local29;
								Static212.method3406(local112, local29.anInt3270, local29.anInt3285 == 1403, local118, local29.anInt3280);
								Static205.method3251(arg1, arg6, arg3, arg5);
								continue;
							}
							if (local29.anInt3285 == 1338) {
								if (local29.method2433()) {
									Static186.method3042(local82, local118, local112, local29);
									Static205.method3251(arg1, arg6, arg3, arg5);
								}
								continue;
							}
							if (local29.anInt3285 == 1339) {
								if (local29.method2433()) {
									Static162.method2606(local112, local29, local118, local82);
									Static205.method3251(arg1, arg6, arg3, arg5);
								}
								continue;
							}
							if (local29.anInt3285 == 1400) {
								Static76.method1344(local29.anInt3280, local112, local29.anInt3270, local118);
								Static39.aBooleanArray5[local82] = true;
								Static175.aBooleanArray24[local82] = true;
								Static205.method3251(arg1, arg6, arg3, arg5);
								continue;
							}
							if (local29.anInt3285 == 1401) {
								Static47.method925(local112, local29.anInt3270, local118, local29.anInt3280);
								Static39.aBooleanArray5[local82] = true;
								Static175.aBooleanArray24[local82] = true;
								Static205.method3251(arg1, arg6, arg3, arg5);
								continue;
							}
							if (local29.anInt3285 == 1402) {
								Static106.method1853(local112, local118);
								Static39.aBooleanArray5[local82] = true;
								Static175.aBooleanArray24[local82] = true;
								continue;
							}
							if (local29.anInt3285 == 1404) {
								Static212.method3408(Static175.aClass1_Sub2_Sub15_3, local29, local118, local29.anInt3280, local112, local29.anInt3270, Static64.aClass1_Sub2_Sub15_2);
								Static39.aBooleanArray5[local82] = true;
								Static175.aBooleanArray24[local82] = true;
								continue;
							}
							if (local29.anInt3285 == 1405) {
								if (Static25.aBoolean39) {
									local261 = local29.anInt3280 + local112;
									local266 = local118 + 15;
									Static23.aClass1_Sub2_Sub15_1.method3330(Static149.method2437(new Class107[] { Static175.aClass107_1035, Static115.method2001(Static124.anInt2696) }), local261, local266, 16776960, -1);
									@Pc(533) Runtime local533 = Runtime.getRuntime();
									local266 += 15;
									local543 = (int) ((local533.totalMemory() - local533.freeMemory()) / 1024L);
									local545 = 16776960;
									if (local543 > 65536) {
										local545 = 16711680;
									}
									Static23.aClass1_Sub2_Sub15_1.method3330(Static149.method2437(new Class107[] { Static223.aClass107_1315, Static115.method2001(local543), Static55.aClass107_389 }), local261, local266, local545, -1);
									Static39.aBooleanArray5[local82] = true;
									Static175.aBooleanArray24[local82] = true;
									local266 += 15;
								}
								continue;
							}
						}
						local261 = Static32.anInt604;
						local266 = Static11.anInt298;
						if (local29.anInt3286 == 0 && local29.aBoolean286 && local159 <= local261 && local170 <= local266 && local261 < local240 && local234 > local266 && !Static40.aBoolean81 && !Static219.aBoolean426) {
							Static210.aClass107Array28[0] = Static102.aClass107_604;
							Static8.anInt259 = 1;
							Static168.aClass107Array21[0] = Static63.aClass107_427;
							Static106.aShortArray30[0] = 1003;
						}
						if (!Static40.aBoolean81 && local159 <= local261 && local266 >= local170 && local261 < local240 && local234 > local266) {
							Static10.method303(local29, local266 - local118, -local112 + local261);
						}
						if (local29.anInt3286 == 0) {
							if (!local29.aBoolean280 && Static34.method677(local29) && local29 != Static215.aClass86_16) {
								continue;
							}
							if (!local29.aBoolean280) {
								if (local29.anInt3222 > local29.anInt3266 - local29.anInt3270) {
									local29.anInt3222 = local29.anInt3266 - local29.anInt3270;
								}
								if (local29.anInt3222 < 0) {
									local29.anInt3222 = 0;
								}
							}
							method2040(local82, local159, local29.anInt3239, local240, local112 - local29.anInt3256, local234, local170, local118 - local29.anInt3222, arg8);
							if (local29.aClass86Array1 != null) {
								method2040(local82, local159, local29.anInt3239, local240, local112 - local29.anInt3256, local234, local170, local118 - local29.anInt3222, local29.aClass86Array1);
							}
							@Pc(764) Class1_Sub11 local764 = (Class1_Sub11) Static154.aClass50_18.method1364((long) local29.anInt3239);
							if (local764 != null) {
								if (local764.anInt1576 == 0 && local261 >= local159 && local170 <= local266 && local240 > local261 && local234 > local266 && !Static40.aBoolean81 && !Static219.aBoolean426) {
									Static210.aClass107Array28[0] = Static102.aClass107_604;
									Static168.aClass107Array21[0] = Static63.aClass107_427;
									Static8.anInt259 = 1;
									Static106.aShortArray30[0] = 1003;
								}
								Static84.method1419(local82, local159, local170, local112, local764.anInt1575, local234, local118, local240);
							}
							Static205.method3251(arg1, arg6, arg3, arg5);
							Static74.method1327();
						}
						if (Static20.aBooleanArray18[local82] || Static163.anInt3554 > 1) {
							if (local29.anInt3286 == 0 && !local29.aBoolean280 && local29.anInt3270 < local29.anInt3266) {
								Static108.method1891(local29.anInt3266, local29.anInt3270, local112 + local29.anInt3280, local118, local29.anInt3222);
							}
							if (local29.anInt3286 != 1) {
								@Pc(883) int local883;
								@Pc(1023) int local1023;
								@Pc(932) int local932;
								@Pc(865) int local865;
								@Pc(1036) int local1036;
								@Pc(894) int local894;
								if (local29.anInt3286 == 2) {
									local865 = 0;
									for (local543 = 0; local543 < local29.anInt3244; local543++) {
										for (local545 = 0; local545 < local29.anInt3288; local545++) {
											local883 = local112 + (local29.anInt3247 + 32) * local545;
											local894 = local118 + (local29.anInt3238 + 32) * local543;
											if (local865 < 20) {
												local883 += local29.anIntArray284[local865];
												local894 += local29.anIntArray279[local865];
											}
											if (local29.anIntArray285[local865] > 0) {
												local932 = local29.anIntArray285[local865] - 1;
												if (local883 + 32 > arg1 && local883 < arg3 && arg6 < local894 + 32 && local894 < arg5 || Static67.aClass86_4 == local29 && local865 == Static15.anInt340) {
													@Pc(986) Class1_Sub2_Sub2 local986;
													if (Static167.anInt3590 == 1 && Static49.anInt1274 == local865 && local29.anInt3239 == Static218.anInt4759) {
														local986 = Static157.method2538(local29.aBoolean283, 2, local29.anIntArray275[local865], 0, local932);
													} else {
														local986 = Static157.method2538(local29.aBoolean283, 1, local29.anIntArray275[local865], 3153952, local932);
													}
													if (Static74.aBoolean153) {
														Static39.aBooleanArray5[local82] = true;
													}
													if (local986 == null) {
														Static16.method354(local29);
													} else if (Static67.aClass86_4 == local29 && Static15.anInt340 == local865) {
														local1023 = Static181.anInt4311 - Static56.anInt1412;
														if (local1023 < 5 && local1023 > -5) {
															local1023 = 0;
														}
														local1036 = Static220.anInt4822 - Static67.anInt1559;
														if (local1036 < 5 && local1036 > -5) {
															local1036 = 0;
														}
														if (Static130.anInt2833 < 5) {
															local1023 = 0;
															local1036 = 0;
														}
														local986.method188(local883 + local1036, local1023 + local894, 128);
														if (arg2 != -1) {
															@Pc(1072) Class86 local1072 = arg8[arg2 & 0xFFFF];
															@Pc(1074) int local1074 = Static205.anInt4390;
															@Pc(1076) int local1076 = Static205.anInt4393;
															@Pc(1102) int local1102;
															if (local1023 + local894 < local1076 && local1072.anInt3222 > 0) {
																local1102 = (local1076 - local1023 - local894) * Static204.anInt2498 / 3;
																if (local1102 > Static204.anInt2498 * 10) {
																	local1102 = Static204.anInt2498 * 10;
																}
																if (local1072.anInt3222 < local1102) {
																	local1102 = local1072.anInt3222;
																}
																Static56.anInt1412 += local1102;
																local1072.anInt3222 -= local1102;
																Static16.method354(local1072);
															}
															if (local1074 < local894 + local1023 + 32 && local1072.anInt3222 < local1072.anInt3266 - local1072.anInt3270) {
																local1102 = Static204.anInt2498 * (local1023 + local894 + 32 - local1074) / 3;
																if (Static204.anInt2498 * 10 < local1102) {
																	local1102 = Static204.anInt2498 * 10;
																}
																if (local1102 > local1072.anInt3266 - local1072.anInt3222 - local1072.anInt3270) {
																	local1102 = local1072.anInt3266 - local1072.anInt3222 - local1072.anInt3270;
																}
																local1072.anInt3222 += local1102;
																Static56.anInt1412 -= local1102;
																Static16.method354(local1072);
															}
														}
													} else if (Static213.aClass86_15 == local29 && Static227.anInt4919 == local865) {
														local986.method188(local883, local894, 128);
													} else {
														local986.method189(local883, local894);
													}
												}
											} else if (local29.anIntArray287 != null && local865 < 20) {
												@Pc(1266) Class1_Sub2_Sub2 local1266 = local29.method2448(local865);
												if (local1266 != null) {
													local1266.method189(local883, local894);
												} else if (Static63.aBoolean137) {
													Static16.method354(local29);
												}
											}
											local865++;
										}
									}
								} else if (local29.anInt3286 == 3) {
									if (Static128.method2148(local29)) {
										local865 = local29.anInt3274;
										if (local29 == Static215.aClass86_16 && local29.anInt3236 != 0) {
											local865 = local29.anInt3236;
										}
									} else {
										local865 = local29.anInt3230;
										if (local29 == Static215.aClass86_16 && local29.anInt3271 != 0) {
											local865 = local29.anInt3271;
										}
									}
									if (local107 == 0) {
										if (local29.aBoolean285) {
											Static205.method3250(local112, local118, local29.anInt3280, local29.anInt3270, local865);
										} else {
											Static205.method3249(local112, local118, local29.anInt3280, local29.anInt3270, local865);
										}
									} else if (local29.aBoolean285) {
										Static205.method3258(local112, local118, local29.anInt3280, local29.anInt3270, local865, 256 - (local107 & 0xFF));
									} else {
										Static205.method3244(local112, local118, local29.anInt3280, local29.anInt3270, local865, 256 - (local107 & 0xFF));
									}
								} else {
									@Pc(1408) Class1_Sub2_Sub15 local1408;
									if (local29.anInt3286 == 4) {
										local1408 = local29.method2443(aClass64Array2);
										if (local1408 != null) {
											@Pc(1420) Class107 local1420 = local29.aClass107_867;
											if (Static128.method2148(local29)) {
												local543 = local29.anInt3274;
												if (local29 == Static215.aClass86_16 && local29.anInt3236 != 0) {
													local543 = local29.anInt3236;
												}
												if (local29.aClass107_866.method3095() > 0) {
													local1420 = local29.aClass107_866;
												}
											} else {
												local543 = local29.anInt3230;
												if (Static215.aClass86_16 == local29 && local29.anInt3271 != 0) {
													local543 = local29.anInt3271;
												}
											}
											if (local29.aBoolean280 && local29.anInt3233 != -1) {
												@Pc(1476) Class75 local1476 = Static128.method2147(local29.anInt3233);
												local1420 = local1476.aClass107_737;
												if (local1420 == null) {
													local1420 = Static35.aClass107_245;
												}
												if ((local1476.anInt2741 == 1 || local29.anInt3291 != 1) && local29.anInt3291 != -1) {
													local1420 = Static149.method2437(new Class107[] { Static132.aClass107_768, local1420, Static5.aClass107_94, Static106.method1856(local29.anInt3291) });
												}
											}
											if (Static184.aClass86_14 == local29) {
												local543 = local29.anInt3230;
												local1420 = Static130.aClass107_759;
											}
											if (!local29.aBoolean280) {
												local1420 = Static127.method2120(local29, local1420);
											}
											local1408.method3335(local1420, local112, local118, local29.anInt3280, local29.anInt3270, local543, local29.aBoolean274 ? 0 : -1, local29.anInt3267, local29.anInt3261, local29.anInt3278);
										} else if (Static63.aBoolean137) {
											Static16.method354(local29);
										}
									} else if (local29.anInt3286 == 5) {
										@Pc(1580) Class1_Sub2_Sub2 local1580;
										if (local29.aBoolean280) {
											if (local29.anInt3233 == -1) {
												local1580 = local29.method2446(false);
											} else {
												local1580 = Static157.method2538(local29.aBoolean283, local29.anInt3258, local29.anInt3291, local29.anInt3279, local29.anInt3233);
											}
											if (local1580 != null) {
												local543 = local1580.anInt205;
												local545 = local1580.anInt210;
												if (local29.aBoolean281) {
													local894 = (local29.anInt3270 + local545 - 1) / local545;
													local883 = (local543 + local29.anInt3280 - 1) / local543;
													Static205.method3255(local112, local118, local29.anInt3280 + local112, local29.anInt3270 + local118);
													for (local1036 = 0; local1036 < local883; local1036++) {
														for (local1023 = 0; local1023 < local894; local1023++) {
															if (local29.anInt3212 != 0) {
																local1580.method183(4096, local543 * local1036 + local112 + local543 / 2, local29.anInt3212, local545 / 2 + local118 + local545 * local1023);
															} else if (local107 == 0) {
																local1580.method189(local1036 * local543 + local112, local118 - -(local545 * local1023));
															} else {
																local1580.method188(local543 * local1036 + local112, local118 - -(local1023 * local545), 256 - (local107 & 0xFF));
															}
														}
													}
													Static205.method3251(arg1, arg6, arg3, arg5);
												} else {
													local883 = local29.anInt3280 * 4096 / local543;
													if (local29.anInt3212 != 0) {
														local1580.method183(local883, local112 + local29.anInt3280 / 2, local29.anInt3212, local118 + local29.anInt3270 / 2);
													} else if (local107 != 0) {
														local1580.method186(local112, local118, local29.anInt3280, local29.anInt3270, 256 - (local107 & 0xFF));
													} else if (local543 == local29.anInt3280 && local29.anInt3270 == local545) {
														local1580.method189(local112, local118);
													} else {
														local1580.method194(local112, local118, local29.anInt3280, local29.anInt3270);
													}
												}
											} else if (Static63.aBoolean137) {
												Static16.method354(local29);
											}
										} else {
											local1580 = local29.method2446(Static128.method2148(local29));
											if (local1580 != null) {
												local1580.method189(local112, local118);
											} else if (Static63.aBoolean137) {
												Static16.method354(local29);
											}
										}
									} else {
										@Pc(1872) Class75 local1872;
										@Pc(2104) int local2104;
										if (local29.anInt3286 == 6) {
											@Pc(1847) boolean local1847 = Static128.method2148(local29);
											if (local1847) {
												local543 = local29.anInt3276;
											} else {
												local543 = local29.anInt3283;
											}
											@Pc(1859) Class5_Sub3 local1859 = null;
											local883 = 0;
											if (local29.anInt3233 != -1) {
												local1872 = Static128.method2147(local29.anInt3233);
												if (local1872 != null) {
													local1872 = local1872.method2104(local29.anInt3291);
													@Pc(1894) Class96 local1894 = local543 == -1 ? null : Static2.method88(local543);
													local1859 = local1872.method2105(1, local29.anInt3269, local1894);
													if (local1859 == null) {
														Static16.method354(local29);
													} else {
														local883 = -local1859.method2297() / 2;
													}
												}
											} else if (local29.anInt3257 == 5) {
												if (local29.anInt3228 == -1) {
													local1859 = Static185.aClass56_26.method1545(-1, null, null, -1);
												} else {
													local894 = local29.anInt3228 & 0x7FF;
													if (Static137.anInt2980 == local894) {
														local894 = 2047;
													}
													@Pc(1985) Class5_Sub5_Sub1 local1985 = Static198.aClass5_Sub5_Sub1Array1[local894];
													@Pc(1995) Class96 local1995 = local543 == -1 ? null : Static2.method88(local543);
													if (local1985 != null && (int) local1985.aClass107_351.method3066() << 11 == (local29.anInt3228 & 0xFFFFF800)) {
														local1859 = local1985.aClass56_10.method1545(local29.anInt3269, local1995, null, 0);
													}
												}
											} else if (local543 == -1) {
												local1859 = local29.method2440(Static204.aClass5_Sub5_Sub1_2.aClass56_10, -1, local1847, null);
												if (local1859 == null && Static63.aBoolean137) {
													Static16.method354(local29);
												}
											} else {
												@Pc(1944) Class96 local1944 = Static2.method88(local543);
												local1859 = local29.method2440(Static204.aClass5_Sub5_Sub1_2.aClass56_10, local29.anInt3269, local1847, local1944);
												if (local1859 == null && Static63.aBoolean137) {
													Static16.method354(local29);
												}
											}
											if (local1859 != null) {
												if (local29.anInt3264 <= 0) {
													local894 = 256;
												} else {
													local894 = (local29.anInt3280 << 8) / local29.anInt3264;
												}
												local1023 = (local29.anInt3294 * local894 >> 8) + local112 + local29.anInt3280 / 2;
												if (local29.anInt3292 > 0) {
													local1036 = (local29.anInt3270 << 8) / local29.anInt3292;
												} else {
													local1036 = 256;
												}
												local932 = (local29.anInt3253 * local1036 >> 8) + local29.anInt3270 / 2 + local118;
												Static74.method1332(local1023, local932);
												local2104 = Class45.anIntArray159[local29.anInt3229] * local29.anInt3214 >> 16;
												@Pc(2114) int local2114 = local29.anInt3214 * Class45.anIntArray156[local29.anInt3229] >> 16;
												if (!local29.aBoolean280) {
													local1859.method540(local29.anInt3275, 0, local29.anInt3229, 0, local2104, local2114);
												} else if (local29.aBoolean276) {
													((Class5_Sub3_Sub1) local1859).method557(local29.anInt3275, local29.anInt3217, local29.anInt3229, local29.anInt3252, local883 + local2104 + local29.anInt3226, local29.anInt3226 + local2114, local29.anInt3214);
												} else {
													local1859.method540(local29.anInt3275, local29.anInt3217, local29.anInt3229, local29.anInt3252, local29.anInt3226 + local2104 + local883, local2114 + local29.anInt3226);
												}
												Static74.method1328();
											}
										} else {
											if (local29.anInt3286 == 7) {
												local1408 = local29.method2443(aClass64Array2);
												if (local1408 == null) {
													if (Static63.aBoolean137) {
														Static16.method354(local29);
													}
													continue;
												}
												local543 = 0;
												for (local545 = 0; local545 < local29.anInt3244; local545++) {
													for (local883 = 0; local883 < local29.anInt3288; local883++) {
														if (local29.anIntArray285[local543] > 0) {
															local1872 = Static128.method2147(local29.anIntArray285[local543] - 1);
															@Pc(2263) Class107 local2263;
															if (local1872.anInt2741 != 1 && local29.anIntArray275[local543] == 1) {
																local2263 = Static149.method2437(new Class107[] { Static132.aClass107_768, local1872.aClass107_737, Static104.aClass107_858 });
															} else {
																local2263 = Static149.method2437(new Class107[] { Static132.aClass107_768, local1872.aClass107_737, Static5.aClass107_94, Static106.method1856(local29.anIntArray275[local543]) });
															}
															local1023 = local883 * (local29.anInt3247 + 115) + local112;
															local932 = local118 + (local29.anInt3238 + 12) * local545;
															if (local29.anInt3267 == 0) {
																local1408.method3331(local2263, local1023, local932, local29.anInt3230, local29.aBoolean274 ? 0 : -1);
															} else if (local29.anInt3267 == 1) {
																local1408.method3327(local2263, local1023 + 57, local932, local29.anInt3230, local29.aBoolean274 ? 0 : -1);
															} else {
																local1408.method3330(local2263, local1023 + 114, local932, local29.anInt3230, local29.aBoolean274 ? 0 : -1);
															}
														}
														local543++;
													}
												}
											}
											if (local29.anInt3286 == 8 && Static146.aClass86_7 == local29 && Static92.anInt1989 == Static47.anInt1062) {
												local865 = 0;
												local543 = 0;
												@Pc(2395) Class1_Sub2_Sub15 local2395 = Static23.aClass1_Sub2_Sub15_1;
												@Pc(2398) Class107 local2398 = local29.aClass107_867;
												local2398 = Static127.method2120(local29, local2398);
												@Pc(2415) Class107 local2415;
												while (local2398.method3095() > 0) {
													local1036 = local2398.method3089(Static56.aClass107_396);
													if (local1036 == -1) {
														local2415 = local2398;
														local2398 = Static63.aClass107_427;
													} else {
														local2415 = local2398.method3104(0, local1036);
														local2398 = local2398.method3084(local1036 + 4);
													}
													local1023 = local2395.method3350(local2415);
													local543 += local2395.anInt4481 + 1;
													if (local865 < local1023) {
														local865 = local1023;
													}
												}
												local543 += 7;
												local865 += 6;
												local1023 = local29.anInt3270 + local118 + 5;
												local1036 = local29.anInt3280 + local112 - local865 - 5;
												if (local1036 < local112 + 5) {
													local1036 = local112 + 5;
												}
												if (local1036 + local865 > arg3) {
													local1036 = arg3 - local865;
												}
												if (local543 + local1023 > arg5) {
													local1023 = arg5 - local543;
												}
												Static205.method3250(local1036, local1023, local865, local543, 16777120);
												Static205.method3249(local1036, local1023, local865, local543, 0);
												local2398 = local29.aClass107_867;
												local932 = local2395.anInt4481 + local1023 + 2;
												local2398 = Static127.method2120(local29, local2398);
												while (local2398.method3095() > 0) {
													local2104 = local2398.method3089(Static56.aClass107_396);
													if (local2104 == -1) {
														local2415 = local2398;
														local2398 = Static63.aClass107_427;
													} else {
														local2415 = local2398.method3104(0, local2104);
														local2398 = local2398.method3084(local2104 + 4);
													}
													local2395.method3331(local2415, local1036 + 3, local932, 0, -1);
													local932 += local2395.anInt4481 + 1;
												}
											}
											if (local29.anInt3286 == 9) {
												if (local29.aBoolean272) {
													local543 = local118 + local29.anInt3270;
													local883 = local118;
													local545 = local112 + local29.anInt3280;
												} else {
													local883 = local118 + local29.anInt3270;
													local543 = local118;
													local545 = local29.anInt3280 + local112;
												}
												if (local29.anInt3249 == 1) {
													Static205.method3238(local112, local543, local545, local883, local29.anInt3230);
												} else {
													Static205.method3252(local112, local543, local545, local883, local29.anInt3230, local29.anInt3249);
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
}
