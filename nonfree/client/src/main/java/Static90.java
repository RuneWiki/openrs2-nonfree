import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "Lclient!wa;")
	public static Class87 aClass87_12;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "[Lclient!bf;")
	public static Class2_Sub3_Sub2_Sub1[] aClass2_Sub3_Sub2_Sub1Array8;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "[I")
	public static int[] anIntArray379 = new int[5];

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
	public static volatile int anInt3878 = 0;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	public static void method2630() {
		aClass2_Sub3_Sub2_Sub1Array8 = null;
		aClass87_12 = null;
		anIntArray379 = null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III[Lclient!wa;BIIIII)V")
	public static void method2632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class87[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static53.method2493(arg1, arg2, arg7, arg0);
		Static100.method1680();
		for (@Pc(17) int local17 = 0; local17 < arg3.length; local17++) {
			@Pc(23) Class87 local23 = arg3[local17];
			if (local23 != null && (arg6 == local23.anInt4074 || arg6 == -1412584499 && Static88.aClass87_6 == local23)) {
				@Pc(70) int local70;
				if (arg8 == -1) {
					Static58.anIntArray97[Static10.anInt232] = arg4 + local23.anInt4079;
					Static27.anIntArray30[Static10.anInt232] = arg5 + local23.anInt4091;
					Static60.anIntArray92[Static10.anInt232] = local23.anInt4092;
					Static4.anIntArray1[Static10.anInt232] = local23.anInt4133;
					local70 = Static10.anInt232++;
				} else {
					local70 = arg8;
				}
				local23.anInt4068 = local70;
				local23.anInt4075 = Static107.anInt2559;
				if (!local23.aBoolean174 || !Static164.method2623(local23)) {
					if (local23.anInt4101 > 0) {
						Static112.method1807(local23);
					}
					@Pc(101) int local101 = local23.anInt4091 + arg5;
					@Pc(106) int local106 = arg4 + local23.anInt4079;
					@Pc(109) int local109 = local23.anInt4121;
					@Pc(137) int local137;
					@Pc(167) int local167;
					if (Static88.aClass87_6 == local23) {
						if (arg6 != -1412584499 && !local23.aBoolean172) {
							Static40.aClass87Array1 = arg3;
							Static135.anInt3140 = arg4;
							Static86.anInt2204 = arg5;
							continue;
						}
						if (!local23.aBoolean172) {
							local109 = 128;
						}
						if (Static163.aBoolean152 && Static11.aBoolean9) {
							local137 = Static69.anInt1736;
							local137 -= Static96.anInt2395;
							if (local137 < Static172.anInt4040) {
								local137 = Static172.anInt4040;
							}
							if (local137 + local23.anInt4092 > Static172.anInt4040 - -Static10.aClass87_3.anInt4092) {
								local137 = Static10.aClass87_3.anInt4092 + Static172.anInt4040 - local23.anInt4092;
							}
							local167 = Static77.anInt1906;
							local167 -= Static97.anInt2406;
							if (local167 < Static42.anInt1279) {
								local167 = Static42.anInt1279;
							}
							local106 = local137;
							if (local167 + local23.anInt4133 > Static42.anInt1279 - -Static10.aClass87_3.anInt4133) {
								local167 = Static42.anInt1279 + Static10.aClass87_3.anInt4133 - local23.anInt4133;
							}
							local101 = local167;
						}
					}
					@Pc(218) int local218;
					@Pc(214) int local214;
					@Pc(229) int local229;
					@Pc(260) int local260;
					@Pc(287) int local287;
					@Pc(282) int local282;
					if (local23.anInt4116 == 2) {
						local167 = arg2;
						local214 = arg0;
						local137 = arg1;
						local218 = arg7;
					} else if (local23.anInt4116 == 9) {
						local229 = local106;
						local260 = local101;
						local282 = local23.anInt4133 + local101;
						local287 = local23.anInt4092 + local106;
						if (local287 < local106) {
							local229 = local287;
							local287 = local106;
						}
						local137 = local229 <= arg1 ? arg1 : local229;
						local287++;
						local218 = local287 < arg7 ? local287 : arg7;
						if (local101 > local282) {
							local260 = local282;
							local282 = local101;
						}
						local167 = local260 > arg2 ? local260 : arg2;
						local282++;
						local214 = local282 < arg0 ? local282 : arg0;
					} else {
						local229 = local23.anInt4092 + local106;
						local137 = arg1 >= local106 ? arg1 : local106;
						local167 = arg2 >= local101 ? arg2 : local101;
						local218 = local229 >= arg7 ? arg7 : local229;
						local260 = local101 + local23.anInt4133;
						local214 = arg0 > local260 ? local260 : arg0;
					}
					if (!local23.aBoolean174 || local137 < local218 && local167 < local214) {
						if (local23.anInt4101 != 0) {
							if (local23.anInt4101 == 1337) {
								Static136.anInt3178 = local106;
								Static65.anInt1615 = local101;
								Static30.method531(local23.anInt4092, local23.anInt4133, local101, local106);
								Static53.method2493(arg1, arg2, arg7, arg0);
								continue;
							}
							if (local23.anInt4101 == 1338) {
								Static63.method1010(local101, local70, local106);
								Static53.method2493(arg1, arg2, arg7, arg0);
								continue;
							}
						}
						local229 = Static69.anInt1736;
						local260 = Static77.anInt1906;
						if (!Static160.aBoolean24 && local229 >= local137 && local167 <= local260 && local218 > local229 && local214 > local260) {
							Static87.method1472(local23, local260 - local101, -local106 + local229);
						}
						if (local23.anInt4116 == 0) {
							if (!local23.aBoolean174 && Static164.method2623(local23) && Static67.aClass87_5 != local23) {
								continue;
							}
							if (!local23.aBoolean174) {
								if (local23.anInt4106 - local23.anInt4133 < local23.anInt4124) {
									local23.anInt4124 = local23.anInt4106 - local23.anInt4133;
								}
								if (local23.anInt4124 < 0) {
									local23.anInt4124 = 0;
								}
							}
							method2632(local214, local137, local167, arg3, local106 - local23.anInt4083, -local23.anInt4124 + local101, local23.anInt4085, local218, local70);
							if (local23.aClass87Array2 != null) {
								method2632(local214, local137, local167, local23.aClass87Array2, local106 - local23.anInt4083, -local23.anInt4124 + local101, local23.anInt4085, local218, local70);
							}
							@Pc(547) Class2_Sub16 local547 = (Class2_Sub16) Static148.aClass16_10.method479((long) local23.anInt4085);
							if (local547 != null) {
								if (local547.anInt2555 == 0 && local137 <= Static69.anInt1736 && Static77.anInt1906 >= local167 && local218 > Static69.anInt1736 && Static77.anInt1906 < local214 && !Static160.aBoolean24 && !Static181.aBoolean89) {
									Static46.anInt1322 = 1;
									Static103.aClass6Array13[0] = Static66.aClass6_486;
									Static134.aClass6Array17[0] = Static9.aClass6_71;
									Static65.anIntArray104[0] = 1005;
								}
								Static139.method2154(local547.anInt2551, local101, local214, local137, local167, local70, local106, local218);
							}
							Static53.method2493(arg1, arg2, arg7, arg0);
							Static100.method1680();
						}
						if (Static36.aBooleanArray3[local70] || Static81.anInt1980 > 1) {
							if (local23.anInt4116 == 0 && !local23.aBoolean174 && local23.anInt4133 < local23.anInt4106) {
								Static26.method476(local101, local106 + local23.anInt4092, local23.anInt4133, local23.anInt4124, local23.anInt4106);
							}
							if (local23.anInt4116 != 1) {
								@Pc(659) int local659;
								@Pc(680) int local680;
								@Pc(852) int local852;
								@Pc(741) int local741;
								@Pc(905) int local905;
								@Pc(907) int local907;
								@Pc(925) int local925;
								@Pc(670) int local670;
								@Pc(867) int local867;
								if (local23.anInt4116 == 2) {
									local287 = 0;
									for (local282 = 0; local282 < local23.anInt4133; local282++) {
										for (local659 = 0; local659 < local23.anInt4092; local659++) {
											local670 = local282 * (local23.anInt4082 + 32) + local101;
											local680 = local106 + (local23.anInt4110 + 32) * local659;
											if (local287 < 20) {
												local680 += local23.anIntArray391[local287];
												local670 += local23.anIntArray398[local287];
											}
											if (local23.anIntArray396[local287] > 0) {
												local741 = local23.anIntArray396[local287] - 1;
												if (local680 + 32 > arg1 && arg7 > local680 && arg2 < local670 + 32 && local670 < arg0 || Static27.aClass87_4 == local23 && Static70.anInt1745 == local287) {
													@Pc(804) Class2_Sub3_Sub2_Sub1 local804;
													if (Static122.anInt2841 == 1 && Static163.anInt3838 == local287 && local23.anInt4085 == Static164.anInt3857) {
														local804 = Static104.method1726(2, local23.anIntArray399[local287], 0, false, local741);
													} else {
														local804 = Static104.method1726(1, local23.anIntArray399[local287], 3153952, false, local741);
													}
													if (local804 == null) {
														Static151.method2327(local23);
													} else if (local23 == Static27.aClass87_4 && local287 == Static70.anInt1745) {
														local852 = Static77.anInt1906 - Static163.anInt3830;
														if (local852 < 5 && local852 > -5) {
															local852 = 0;
														}
														local867 = Static69.anInt1736 - Static174.anInt4035;
														if (local867 < 5 && local867 > -5) {
															local867 = 0;
														}
														if (Static116.anInt2793 < 5) {
															local867 = 0;
															local852 = 0;
														}
														local804.method279(local680 + local867, local670 + local852, 128);
														if (arg6 != -1) {
															@Pc(903) Class87 local903 = arg3[arg6 & 0xFFFF];
															local905 = Static53.anInt3698;
															local907 = Static53.anInt3697;
															if (local670 + local852 < local905 && local903.anInt4124 > 0) {
																local925 = (local905 - local670 - local852) * Static131.anInt3038 / 3;
																if (local925 > Static131.anInt3038 * 10) {
																	local925 = Static131.anInt3038 * 10;
																}
																if (local903.anInt4124 < local925) {
																	local925 = local903.anInt4124;
																}
																Static163.anInt3830 += local925;
																local903.anInt4124 -= local925;
																Static151.method2327(local903);
															}
															if (local852 + local670 + 32 > local907 && local903.anInt4106 - local903.anInt4133 > local903.anInt4124) {
																local925 = (local670 + local852 + 32 - local907) * Static131.anInt3038 / 3;
																if (Static131.anInt3038 * 10 < local925) {
																	local925 = Static131.anInt3038 * 10;
																}
																if (local925 > local903.anInt4106 - local903.anInt4124 - local903.anInt4133) {
																	local925 = local903.anInt4106 - local903.anInt4124 - local903.anInt4133;
																}
																local903.anInt4124 += local925;
																Static163.anInt3830 -= local925;
																Static151.method2327(local903);
															}
														}
													} else if (local23 == Static152.aClass87_11 && local287 == Static116.anInt2782) {
														local804.method279(local680, local670, 128);
													} else {
														local804.method280(local680, local670);
													}
												}
											} else if (local23.anIntArray392 != null && local287 < 20) {
												@Pc(715) Class2_Sub3_Sub2_Sub1 local715 = local23.method2761(local287);
												if (local715 != null) {
													local715.method280(local680, local670);
												} else if (Static116.aBoolean114) {
													Static151.method2327(local23);
												}
											}
											local287++;
										}
									}
								} else if (local23.anInt4116 == 3) {
									if (Static181.method1519(local23)) {
										local287 = local23.anInt4130;
										if (local23 == Static67.aClass87_5 && local23.anInt4064 != 0) {
											local287 = local23.anInt4064;
										}
									} else {
										local287 = local23.anInt4076;
										if (local23 == Static67.aClass87_5 && local23.anInt4062 != 0) {
											local287 = local23.anInt4062;
										}
									}
									if (local109 == 0) {
										if (local23.aBoolean164) {
											Static53.method2496(local106, local101, local23.anInt4092, local23.anInt4133, local287);
										} else {
											Static53.method2501(local106, local101, local23.anInt4092, local23.anInt4133, local287);
										}
									} else if (local23.aBoolean164) {
										Static53.method2490(local106, local101, local23.anInt4092, local23.anInt4133, local287, 256 - (local109 & 0xFF));
									} else {
										Static53.method2500(local106, local101, local23.anInt4092, local23.anInt4133, local287, 256 - (local109 & 0xFF));
									}
								} else {
									@Pc(1178) Class2_Sub3_Sub2_Sub4_Sub1 local1178;
									if (local23.anInt4116 == 4) {
										local1178 = local23.method2755();
										if (local1178 != null) {
											@Pc(1190) Class6 local1190 = local23.aClass6_1242;
											if (Static181.method1519(local23)) {
												local282 = local23.anInt4130;
												if (local23 == Static67.aClass87_5 && local23.anInt4064 != 0) {
													local282 = local23.anInt4064;
												}
												if (local23.aClass6_1236.method107() > 0) {
													local1190 = local23.aClass6_1236;
												}
											} else {
												local282 = local23.anInt4076;
												if (local23 == Static67.aClass87_5 && local23.anInt4062 != 0) {
													local282 = local23.anInt4062;
												}
											}
											if (local23.aBoolean174 && local23.anInt4060 != -1) {
												@Pc(1245) Class2_Sub3_Sub10 local1245 = Static92.method1502(local23.anInt4060);
												local1190 = local1245.aClass6_612;
												if (local1190 == null) {
													local1190 = Static33.aClass6_252;
												}
												if ((local1245.anInt2000 == 1 || local23.anInt4131 != 1) && local23.anInt4131 != -1) {
													local1190 = Static58.method956(new Class6[] { Static103.aClass6_714, local1190, Static39.aClass6_301, Static74.method1149(local23.anInt4131) });
												}
											}
											if (Static124.aClass87_9 == local23) {
												local282 = local23.anInt4076;
												local1190 = Static128.aClass6_855;
											}
											if (!local23.aBoolean174) {
												local1190 = Static83.method1329(local23, local1190);
											}
											local1178.method2522(local1190, local106, local101, local23.anInt4092, local23.anInt4133, local282, local23.aBoolean166 ? 0 : -1, local23.anInt4103, local23.anInt4093, local23.anInt4107);
										} else if (Static116.aBoolean114) {
											Static151.method2327(local23);
										}
									} else if (local23.anInt4116 == 5) {
										@Pc(1350) Class2_Sub3_Sub2_Sub1 local1350;
										if (local23.aBoolean174) {
											if (local23.anInt4060 == -1) {
												local1350 = local23.method2768(false);
											} else {
												local1350 = Static104.method1726(local23.anInt4100, local23.anInt4131, local23.anInt4086, false, local23.anInt4060);
											}
											if (local1350 != null) {
												local282 = local1350.anInt383;
												local659 = local1350.anInt386;
												if (local23.aBoolean171) {
													Static53.method2498(local106, local101, local106 + local23.anInt4092, local23.anInt4133 + local101);
													local680 = (local23.anInt4092 + local282 - 1) / local282;
													local670 = (local23.anInt4133 + local659 - 1) / local659;
													for (local867 = 0; local867 < local680; local867++) {
														for (local852 = 0; local852 < local670; local852++) {
															if (local23.anInt4108 != 0) {
																local1350.method277(local867 * local282 + local106 + local282 / 2, local659 * local852 + (local101 - -(local659 / 2)), local23.anInt4108, 4096);
															} else if (local109 == 0) {
																local1350.method280(local867 * local282 + local106, local101 - -(local659 * local852));
															} else {
																local1350.method279(local106 + local867 * local282, local852 * local659 + local101, 256 - (local109 & 0xFF));
															}
														}
													}
													Static53.method2493(arg1, arg2, arg7, arg0);
												} else {
													local680 = local23.anInt4092 * 4096 / local282;
													if (local23.anInt4108 != 0) {
														local1350.method277(local106 + local23.anInt4092 / 2, local101 - -(local23.anInt4133 / 2), local23.anInt4108, local680);
													} else if (local109 != 0) {
														local1350.method281(local106, local101, local23.anInt4092, local23.anInt4133, 256 - (local109 & 0xFF));
													} else if (local282 == local23.anInt4092 && local23.anInt4133 == local659) {
														local1350.method280(local106, local101);
													} else {
														local1350.method287(local106, local101, local23.anInt4092, local23.anInt4133);
													}
												}
											} else if (Static116.aBoolean114) {
												Static151.method2327(local23);
											}
										} else {
											local1350 = local23.method2768(Static181.method1519(local23));
											if (local1350 != null) {
												local1350.method280(local106, local101);
											} else if (Static116.aBoolean114) {
												Static151.method2327(local23);
											}
										}
									} else {
										@Pc(1746) Class2_Sub3_Sub10 local1746;
										if (local23.anInt4116 == 6) {
											@Pc(1609) boolean local1609 = Static181.method1519(local23);
											@Pc(1611) Class2_Sub3_Sub5_Sub7 local1611 = null;
											if (local1609) {
												local282 = local23.anInt4059;
											} else {
												local282 = local23.anInt4132;
											}
											local680 = 0;
											if (local23.anInt4060 != -1) {
												local1746 = Static92.method1502(local23.anInt4060);
												if (local1746 != null) {
													local1746 = local1746.method1315(local23.anInt4131);
													local1611 = local1746.method1322(1, null, 0);
													if (local1611 == null) {
														Static151.method2327(local23);
													} else {
														local1611.method2312();
														local680 = -local1611.aShort25 / 2;
													}
												}
											} else if (local23.anInt4090 == 5) {
												if (local23.anInt4071 == -1) {
													local1611 = Static144.aClass55_2.method1704(null, null, -1, -1);
												} else {
													local670 = local23.anInt4071 & 0x7FF;
													if (local670 == Static68.anInt1727) {
														local670 = 2047;
													}
													@Pc(1698) Class2_Sub3_Sub5_Sub1_Sub1 local1698 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local670];
													@Pc(1707) Class2_Sub3_Sub8 local1707 = local282 == -1 ? null : Static129.method2790(local282);
													if (local1698 != null && (int) local1698.aClass6_244.method129() << 11 == (local23.anInt4071 & 0xFFFFF800)) {
														local1611 = local1698.aClass55_1.method1704(null, local1707, local23.anInt4119, 0);
													}
												}
											} else if (local282 == -1) {
												local1611 = local23.method2760(local1609, null, -1, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.aClass55_1);
												if (local1611 == null && Static116.aBoolean114) {
													Static151.method2327(local23);
												}
											} else {
												@Pc(1656) Class2_Sub3_Sub8 local1656 = Static129.method2790(local282);
												local1611 = local23.method2760(local1609, local1656, local23.anInt4119, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.aClass55_1);
												if (local1611 == null && Static116.aBoolean114) {
													Static151.method2327(local23);
												}
											}
											if (local1611 != null) {
												Static100.method1687(local23.anInt4069 + local106 + local23.anInt4092 / 2, local23.anInt4133 / 2 + local101 - -local23.anInt4115);
												local867 = Class2_Sub3_Sub2_Sub2.anIntArray207[local23.anInt4081] * local23.anInt4078 >> 16;
												local670 = Class2_Sub3_Sub2_Sub2.anIntArray208[local23.anInt4081] * local23.anInt4078 >> 16;
												if (!local23.aBoolean174) {
													local1611.method2314(local23.anInt4126, 0, local23.anInt4081, 0, local670, local867);
												} else if (local23.aBoolean170) {
													local1611.method2300(local23.anInt4126, local23.anInt4080, local23.anInt4081, local23.anInt4099, local23.anInt4123 + local680 + local670, local23.anInt4123 + local867, local23.anInt4078);
												} else {
													local1611.method2314(local23.anInt4126, local23.anInt4080, local23.anInt4081, local23.anInt4099, local23.anInt4123 + local670 + local680, local867 - -local23.anInt4123);
												}
												Static100.method1689();
											}
										} else {
											if (local23.anInt4116 == 7) {
												local1178 = local23.method2755();
												if (local1178 == null) {
													if (Static116.aBoolean114) {
														Static151.method2327(local23);
													}
													continue;
												}
												local282 = 0;
												for (local659 = 0; local659 < local23.anInt4133; local659++) {
													for (local680 = 0; local680 < local23.anInt4092; local680++) {
														if (local23.anIntArray396[local282] > 0) {
															local1746 = Static92.method1502(local23.anIntArray396[local282] - 1);
															@Pc(1960) Class6 local1960;
															if (local1746.anInt2000 != 1 && local23.anIntArray399[local282] == 1) {
																local1960 = Static58.method956(new Class6[] { Static103.aClass6_714, local1746.aClass6_612, Static163.aClass6_1140 });
															} else {
																local1960 = Static58.method956(new Class6[] { Static103.aClass6_714, local1746.aClass6_612, Static39.aClass6_301, Static74.method1149(local23.anIntArray399[local282]) });
															}
															local852 = local106 + (local23.anInt4110 + 115) * local680;
															local741 = local101 + local659 * (local23.anInt4082 + 12);
															if (local23.anInt4103 == 0) {
																local1178.method2512(local1960, local852, local741, local23.anInt4076, local23.aBoolean166 ? 0 : -1);
															} else if (local23.anInt4103 == 1) {
																local1178.method2508(local1960, local852 + local23.anInt4092 / 2, local741, local23.anInt4076, local23.aBoolean166 ? 0 : -1);
															} else {
																local1178.method2511(local1960, local23.anInt4092 + local852 - 1, local741, local23.anInt4076, local23.aBoolean166 ? 0 : -1);
															}
														}
														local282++;
													}
												}
											}
											@Pc(2253) int local2253;
											if (local23.anInt4116 == 8 && local23 == aClass87_12 && Static51.anInt1415 == Static140.anInt3276) {
												local287 = 0;
												@Pc(2101) Class2_Sub3_Sub2_Sub4_Sub1 local2101 = Static120.aClass2_Sub3_Sub2_Sub4_Sub1_6;
												local282 = 0;
												@Pc(2106) Class6 local2106 = local23.aClass6_1242;
												local2106 = Static83.method1329(local23, local2106);
												@Pc(2127) Class6 local2127;
												while (local2106.method107() > 0) {
													local867 = local2106.method120(Static115.aClass6_798);
													if (local867 == -1) {
														local2127 = local2106;
														local2106 = Static9.aClass6_71;
													} else {
														local2127 = local2106.method111(local867, 0);
														local2106 = local2106.method119(local867 + 4);
													}
													local852 = local2101.method2516(local2127);
													local282 += local2101.anInt3712 + 1;
													if (local852 > local287) {
														local287 = local852;
													}
												}
												local287 += 6;
												local282 += 7;
												local867 = local106 + local23.anInt4092 - local287 - 5;
												local852 = local101 + local23.anInt4133 + 5;
												if (arg0 < local282 + local852) {
													local852 = arg0 - local282;
												}
												if (local106 + 5 > local867) {
													local867 = local106 + 5;
												}
												if (local867 + local287 > arg7) {
													local867 = arg7 - local287;
												}
												Static53.method2496(local867, local852, local287, local282, 16777120);
												Static53.method2501(local867, local852, local287, local282, 0);
												local2106 = local23.aClass6_1242;
												local741 = local2101.anInt3712 + local852 + 2;
												local2106 = Static83.method1329(local23, local2106);
												while (local2106.method107() > 0) {
													local2253 = local2106.method120(Static115.aClass6_798);
													if (local2253 == -1) {
														local2127 = local2106;
														local2106 = Static9.aClass6_71;
													} else {
														local2127 = local2106.method111(local2253, 0);
														local2106 = local2106.method119(local2253 + 4);
													}
													local2101.method2512(local2127, local867 + 3, local741, 0, -1);
													local741 += local2101.anInt3712 + 1;
												}
											}
											if (local23.anInt4116 == 9) {
												if (local23.anInt4111 == 1) {
													Static53.method2497(local106, local101, local106 + local23.anInt4092, local101 - -local23.anInt4133, local23.anInt4076);
												} else {
													local287 = local23.anInt4092 < 0 ? -local23.anInt4092 : local23.anInt4092;
													local282 = local23.anInt4133 < 0 ? -local23.anInt4133 : local23.anInt4133;
													local659 = local287;
													if (local282 > local287) {
														local659 = local282;
													}
													if (local659 != 0) {
														local680 = (local23.anInt4092 << 16) / local659;
														local670 = (local23.anInt4133 << 16) / local659;
														if (local670 > local680) {
															local670 = -local670;
														} else {
															local680 = -local680;
														}
														local852 = local670 * local23.anInt4111 + 1 >> 17;
														local867 = local670 * local23.anInt4111 >> 17;
														local741 = local680 * local23.anInt4111 >> 17;
														local2253 = local680 * local23.anInt4111 + 1 >> 17;
														@Pc(2425) int local2425 = local106 - arg1;
														local905 = local101 - arg2;
														local907 = local2425 + local867;
														@Pc(2444) int local2444 = local2425 + local23.anInt4092 - local852;
														@Pc(2451) int local2451 = local23.anInt4092 + local2425 + local867;
														local925 = local2425 - local852;
														@Pc(2459) int local2459 = local741 + local905;
														@Pc(2464) int local2464 = local905 - local2253;
														@Pc(2472) int local2472 = local741 + local905 + local23.anInt4133;
														@Pc(2480) int local2480 = local905 + local23.anInt4133 - local2253;
														Static100.method1686(local907, local925, local2444);
														Static100.method1693(local2459, local2464, local2480, local907, local925, local2444, local23.anInt4076);
														Static100.method1686(local907, local2444, local2451);
														Static100.method1693(local2459, local2480, local2472, local907, local2444, local2451, local23.anInt4076);
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

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!ai;BLclient!ai;Lclient!c;)[Lclient!ta;")
	public static Class2_Sub3_Sub2_Sub3[] method2633(@OriginalArg(0) Class6 arg0, @OriginalArg(2) Class6 arg1, @OriginalArg(3) Class10 arg2) {
		@Pc(13) int local13 = arg2.method1602(arg0);
		@Pc(19) int local19 = arg2.method1600(local13, arg1);
		return Static113.method1832(local19, local13, arg2);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZB)V")
	public static void method2635(@OriginalArg(0) boolean arg0) {
		if (Static16.aClass43_1 == null) {
			return;
		}
		try {
			@Pc(11) Class2_Sub13 local11 = new Class2_Sub13(4);
			local11.method1416(arg0 ? 2 : 3);
			local11.method1440(0);
			Static16.aClass43_1.method1241(4, local11.aByteArray14);
		} catch (@Pc(37) IOException local37) {
			try {
				Static16.aClass43_1.method1236();
			} catch (@Pc(42) Exception local42) {
			}
			Static55.anInt1442++;
			Static16.aClass43_1 = null;
		}
	}
}
