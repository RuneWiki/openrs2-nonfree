import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!of", name = "O", descriptor = "Lclient!jb;")
	public static Class25 aClass25_26;

	@OriginalMember(owner = "client!of", name = "P", descriptor = "Lclient!mf;")
	public static Class3_Sub15 aClass3_Sub15_3;

	@OriginalMember(owner = "client!of", name = "T", descriptor = "Lclient!dd;")
	public static Class3_Sub1_Sub4 aClass3_Sub1_Sub4_1;

	@OriginalMember(owner = "client!of", name = "W", descriptor = "Lclient!df;")
	public static Class16 aClass16_62;

	@OriginalMember(owner = "client!of", name = "Y", descriptor = "[I")
	public static int[] anIntArray270;

	@OriginalMember(owner = "client!of", name = "ab", descriptor = "Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_10;

	@OriginalMember(owner = "client!of", name = "w", descriptor = "Lclient!eb;")
	public static Class17 aClass17_44 = new Class17(64);

	@OriginalMember(owner = "client!of", name = "D", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1128 = Static59.method1195("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!of", name = "M", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1129 = Static59.method1195("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!of", name = "bb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1135 = Static59.method1195("wishes to duel with you)3");

	@OriginalMember(owner = "client!of", name = "Q", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1130 = aClass60_1135;

	@OriginalMember(owner = "client!of", name = "R", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1131 = Static59.method1195("Unable to connect)3");

	@OriginalMember(owner = "client!of", name = "S", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1132 = aClass60_1131;

	@OriginalMember(owner = "client!of", name = "U", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1133 = aClass60_1131;

	@OriginalMember(owner = "client!of", name = "V", descriptor = "Z")
	public static boolean aBoolean91 = false;

	@OriginalMember(owner = "client!of", name = "X", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1134 = Static59.method1195(" )2>");

	@OriginalMember(owner = "client!of", name = "Z", descriptor = "[I")
	public static int[] anIntArray271 = new int[32];

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIZII[Lclient!mf;IIII)Z")
	public static boolean method1670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class3_Sub15[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static40.method1891(arg8, arg3, arg0, arg1);
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < arg4.length; local14++) {
			@Pc(20) Class3_Sub15 local20 = arg4[local14];
			if (local20 != null && (arg2 == local20.anInt2306 || arg2 == -1412584499 && Static100.anInt2955 == local20.anInt2286 && Static24.anInt931 == local20.anInt2283)) {
				if (local20.anInt2293 > 0) {
					Static82.method1659(local20);
				}
				@Pc(65) int local65 = local20.anInt2243 + arg3 - arg5;
				@Pc(68) int local68 = local20.anInt2288;
				@Pc(76) int local76 = arg8 + local20.anInt2291 - arg6;
				@Pc(114) int local114;
				@Pc(116) int local116;
				@Pc(146) int[] local146;
				@Pc(249) int local249;
				@Pc(239) int local239;
				@Pc(254) int local254;
				@Pc(259) int local259;
				if (local20.anInt2286 == Static100.anInt2955 && local20.anInt2283 == Static24.anInt931) {
					if (arg2 != -1412584499 && !local20.aBoolean73) {
						Static46.anInt1448 = arg5 - arg3;
						Static86.anInt1612 = arg6 - arg8;
						Static31.aClass3_Sub15Array1 = arg4;
						continue;
					}
					@Pc(110) Class3_Sub15 local110 = Static86.method1065(local20);
					if (local110 == null) {
						Static24.anInt931 = -1;
						Static100.anInt2955 = -1;
					} else {
						local114 = Static122.anInt720;
						local116 = Static12.anInt374;
						if (Static29.anInt1009 == 0) {
							local116 -= 4;
							local114 -= 4;
						}
						if (Static29.anInt1009 == 1) {
							local114 -= 553;
							local116 -= 205;
						}
						if (Static29.anInt1009 == 2) {
							local114 -= 17;
							local116 -= 357;
						}
						local116 -= Static53.anInt1742;
						local114 -= Static54.anInt1751;
						local146 = Static66.method1356(local110);
						if (local114 < local146[0]) {
							local114 = local146[0];
						}
						if (local116 < local146[1]) {
							local116 = local146[1];
						}
						if (local146[1] + local110.anInt2270 < local20.anInt2270 + local116) {
							local116 = local110.anInt2270 + local146[1] - local20.anInt2270;
						}
						if (local20.anInt2304 + local114 > local110.anInt2304 + local146[0]) {
							local114 = local110.anInt2304 + local146[0] - local20.anInt2304;
						}
						@Pc(220) Class3_Sub15 local220 = Static120.aClass3_Sub15ArrayArray1[local20.anInt2286 >> 16][local20.anInt2306 & 0xFFFF];
						@Pc(224) int[] local224 = Static66.method1356(local220);
						if (!local20.aBoolean73) {
							local68 = 128;
						}
						local239 = local116 + local220.anInt2241 - local224[1];
						local249 = local220.anInt2273 + local114 - local224[0];
						local254 = local249 - local20.anInt2291;
						local259 = local239 - local20.anInt2243;
						if (local20.anInt2262 >= local254 && -local20.anInt2262 <= local254 && local259 <= local20.anInt2262 && local259 >= -local20.anInt2262 && !Static22.aBoolean28) {
							local254 = 0;
							local259 = 0;
						} else if (Static83.anInt2569 <= local20.anInt2294 && !Static22.aBoolean28) {
							local254 = 0;
							local259 = 0;
						}
						local65 += local259;
						local76 += local254;
					}
				}
				if ((!local20.aBoolean81 || Static40.anInt2856 >= local76 && local65 <= Static40.anInt2851 && Static40.anInt2855 <= local20.anInt2304 + local76 && Static40.anInt2852 <= local20.anInt2270 + local65) && (!local20.aBoolean81 || !Static115.method2119(local20))) {
					if (local20.anInt2296 == 0) {
						if (!local20.aBoolean81 && Static115.method2119(local20) && !Static68.method1393(local14, arg7)) {
							continue;
						}
						if (!local20.aBoolean81) {
							if (local20.anInt2241 > local20.anInt2284 - local20.anInt2270) {
								local20.anInt2241 = local20.anInt2284 - local20.anInt2270;
							}
							if (local20.anInt2241 < 0) {
								local20.anInt2241 = 0;
							}
						}
						local12 &= method1670(local76 + local20.anInt2304, local20.anInt2270 + local65, local20.anInt2286, local65, arg4, local20.anInt2241, local20.anInt2273, arg7, local76);
						if (local20.aClass3_Sub15Array2 != null) {
							local12 &= method1670(local20.anInt2304 + local76, local20.anInt2270 + local65, local20.anInt2286, local65, local20.aClass3_Sub15Array2, local20.anInt2241, local20.anInt2273, arg7, local76);
						}
						Static40.method1891(arg8, arg3, arg0, arg1);
						if (local20.anInt2270 < local20.anInt2284 && !local20.aBoolean81) {
							Static74.method1552(local20.anInt2270, local76 + local20.anInt2304, local20.anInt2241, local65, local20.anInt2284);
						}
					}
					if (local20.anInt2296 != 1) {
						@Pc(721) int local721;
						@Pc(485) int local485;
						@Pc(503) int local503;
						@Pc(512) int local512;
						@Pc(661) int local661;
						if (local20.anInt2296 == 2) {
							local485 = 0;
							for (local114 = 0; local114 < local20.anInt2270; local114++) {
								for (local116 = 0; local116 < local20.anInt2304; local116++) {
									local503 = local76 + (local20.anInt2261 + 32) * local116;
									local512 = (local20.anInt2266 + 32) * local114 + local65;
									if (local485 < 20) {
										local512 += local20.anIntArray233[local485];
										local503 += local20.anIntArray227[local485];
									}
									if (local20.anIntArray235[local485] > 0) {
										local239 = local20.anIntArray235[local485] - 1;
										if (local503 > Static40.anInt2855 - 32 && Static40.anInt2856 > local503 && Static40.anInt2852 - 32 < local512 && local512 < Static40.anInt2851 || Static101.anInt2962 != 0 && Static69.anInt2150 == local485) {
											@Pc(598) Class3_Sub1_Sub2_Sub3 local598;
											if (Static73.anInt2349 == 1 && local485 == Static53.anInt1745 && local20.anInt2286 == Static82.anInt2568) {
												local598 = Static39.method883(local239, 0, false, 2, local20.anIntArray230[local485]);
											} else {
												local598 = Static39.method883(local239, 3153952, false, 1, local20.anIntArray230[local485]);
											}
											if (local598 == null) {
												local12 = false;
											} else if (Static101.anInt2962 != 0 && local485 == Static69.anInt2150 && local20.anInt2286 == Static69.anInt2144) {
												local249 = Static12.anInt374 - Static11.anInt350;
												local661 = Static122.anInt720 - Static89.anInt2622;
												if (local249 < 5 && local249 > -5) {
													local249 = 0;
												}
												if (local661 < 5 && local661 > -5) {
													local661 = 0;
												}
												if (Static52.anInt1715 < 5) {
													local249 = 0;
													local661 = 0;
												}
												local598.method1458(local503 + local661, local512 - -local249, 128);
												if (arg2 != -1) {
													@Pc(703) Class3_Sub15 local703 = arg4[arg2 & 0xFFFF];
													if (local249 + local512 < Static40.anInt2852 && local703.anInt2241 > 0) {
														local721 = (Static40.anInt2852 - local512 - local249) * Static69.anInt2153 / 3;
														if (Static69.anInt2153 * 10 < local721) {
															local721 = Static69.anInt2153 * 10;
														}
														if (local721 > local703.anInt2241) {
															local721 = local703.anInt2241;
														}
														local703.anInt2241 -= local721;
														Static11.anInt350 += local721;
													}
													if (local512 + local249 + 32 > Static40.anInt2851 && local703.anInt2241 < local703.anInt2284 - local703.anInt2270) {
														local721 = (local249 + local512 + 32 - Static40.anInt2851) * Static69.anInt2153 / 3;
														if (local721 > Static69.anInt2153 * 10) {
															local721 = Static69.anInt2153 * 10;
														}
														if (local703.anInt2284 - local703.anInt2270 - local703.anInt2241 < local721) {
															local721 = local703.anInt2284 - local703.anInt2270 - local703.anInt2241;
														}
														local703.anInt2241 += local721;
														Static11.anInt350 -= local721;
													}
												}
											} else if (Static28.anInt3336 != 0 && local485 == Static108.anInt3055 && local20.anInt2286 == Static32.anInt1113) {
												local598.method1458(local503, local512, 128);
											} else {
												local598.method1439(local503, local512);
											}
										}
									} else if (local20.anIntArray231 != null && local485 < 20) {
										@Pc(842) Class3_Sub1_Sub2_Sub3 local842 = local20.method1490(local485);
										if (local842 != null) {
											local842.method1439(local503, local512);
										} else if (Static49.aBoolean51) {
											local12 = false;
										}
									}
									local485++;
								}
							}
						} else if (local20.anInt2296 == 3) {
							if (Static26.method652(local20)) {
								local485 = local20.anInt2265;
								if (Static68.method1393(local14, arg7) && local20.anInt2240 != 0) {
									local485 = local20.anInt2240;
								}
							} else {
								local485 = local20.anInt2272;
								if (Static68.method1393(local14, arg7) && local20.anInt2305 != 0) {
									local485 = local20.anInt2305;
								}
							}
							if (local68 == 0) {
								if (local20.aBoolean72) {
									Static40.method1893(local76, local65, local20.anInt2304, local20.anInt2270, local485);
								} else {
									Static40.method1884(local76, local65, local20.anInt2304, local20.anInt2270, local485);
								}
							} else if (local20.aBoolean72) {
								Static40.method1894(local76, local65, local20.anInt2304, local20.anInt2270, local485, 256 - (local68 & 0xFF));
							} else {
								Static40.method1889(local76, local65, local20.anInt2304, local20.anInt2270, local485, 256 - (local68 & 0xFF));
							}
						} else {
							@Pc(977) Class3_Sub1_Sub2_Sub2 local977;
							if (local20.anInt2296 == 4) {
								local977 = local20.method1491();
								if (local977 != null) {
									@Pc(988) Class60 local988 = local20.aClass60_969;
									if (Static26.method652(local20)) {
										local114 = local20.anInt2265;
										if (Static68.method1393(local14, arg7) && local20.anInt2240 != 0) {
											local114 = local20.anInt2240;
										}
										if (local20.aClass60_965.method1836() > 0) {
											local988 = local20.aClass60_965;
										}
									} else {
										local114 = local20.anInt2272;
										if (Static68.method1393(local14, arg7) && local20.anInt2305 != 0) {
											local114 = local20.anInt2305;
										}
									}
									if (local20.aBoolean81 && local20.anInt2254 != -1) {
										@Pc(1052) Class3_Sub1_Sub11 local1052 = Static22.method568(local20.anInt2254);
										local988 = local1052.aClass60_816;
										if (local988 == null) {
											local988 = Static95.aClass60_1172;
										}
										if ((local1052.anInt1878 == 1 || local20.anInt2253 != 1) && local20.anInt2253 != -1) {
											local988 = Static60.method1211(new Class60[] { Static46.aClass60_633, local988, Static129.aClass60_1444, Static39.method877(local20.anInt2253) });
										}
									}
									if (local20.anInt2286 == Static96.anInt2745 && local20.anInt2283 == Static130.anInt3485) {
										local114 = local20.anInt2272;
										local988 = Static2.aClass60_66;
									}
									if (Static40.anInt2854 == 479) {
										if (local114 == 16776960) {
											local114 = 255;
										}
										if (local114 == 49152) {
											local114 = 16777215;
										}
									}
									local988 = Static18.method518(local988, local20);
									local977.method836(local988, local76, local65, local20.anInt2304, local20.anInt2270, local114, local20.aBoolean82 ? 0 : -1, local20.anInt2246, local20.anInt2250, local20.anInt2238);
								} else if (Static49.aBoolean51) {
									local12 = false;
								}
							} else {
								@Pc(1384) int local1384;
								if (local20.anInt2296 == 5) {
									@Pc(1182) Class3_Sub1_Sub2_Sub3 local1182;
									if (local20.aBoolean81) {
										if (local20.anInt2254 == -1) {
											local1182 = local20.method1497(false);
										} else {
											local1182 = Static39.method883(local20.anInt2254, local20.anInt2289, false, local20.anInt2280, local20.anInt2253);
										}
										if (local1182 != null) {
											local114 = local1182.anInt2192;
											local116 = local1182.anInt2190;
											if (local20.aBoolean83) {
												local661 = local65;
												local146 = new int[4];
												local512 = local76;
												Static40.method1882(local146);
												local239 = local20.anInt2270 + local65;
												if (local239 > local146[3]) {
													local239 = local146[3];
												}
												if (local76 < local146[0]) {
													local512 = local146[0];
												}
												if (local65 < local146[1]) {
													local661 = local146[1];
												}
												local249 = local76 + local20.anInt2304;
												if (local146[2] < local249) {
													local249 = local146[2];
												}
												Static40.method1891(local512, local661, local249, local239);
												local254 = (local114 + local20.anInt2304 - 1) / local114;
												local259 = (local20.anInt2270 + local116 - 1) / local116;
												for (local721 = 0; local721 < local254; local721++) {
													for (local1384 = 0; local1384 < local259; local1384++) {
														if (local20.anInt2242 != 0) {
															local1182.method1449(local114 / 2 + local114 * local721 + local76, local65 - -(local1384 * local116) + local116 / 2, local20.anInt2242, 4096);
														} else if (local68 == 0) {
															local1182.method1439(local76 + local114 * local721, local65 + local116 * local1384);
														} else {
															local1182.method1458(local76 + local721 * local114, local1384 * local116 + local65, 256 - (local68 & 0xFF));
														}
													}
												}
												Static40.method1888(local146);
											} else {
												local503 = local20.anInt2304 * 4096 / local114;
												if (local20.anInt2242 != 0) {
													local1182.method1449(local76 + local20.anInt2304 / 2, local65 - -(local20.anInt2270 / 2), local20.anInt2242, local503);
												} else if (local68 != 0) {
													local1182.method1440(local76, local65, local20.anInt2304, local20.anInt2270, 256 - (local68 & 0xFF));
												} else if (local114 == local20.anInt2304 && local20.anInt2270 == local116) {
													local1182.method1439(local76, local65);
												} else {
													local1182.method1457(local76, local65, local20.anInt2304, local20.anInt2270);
												}
											}
										} else if (Static49.aBoolean51) {
											local12 = false;
										}
									} else {
										local1182 = local20.method1497(Static26.method652(local20));
										if (local1182 != null) {
											local1182.method1439(local76, local65);
										} else if (Static49.aBoolean51) {
											local12 = false;
										}
									}
								} else {
									@Pc(1524) Class3_Sub1_Sub11 local1524;
									if (local20.anInt2296 == 6) {
										@Pc(1500) boolean local1500 = Static26.method652(local20);
										@Pc(1502) Class3_Sub1_Sub1_Sub4 local1502 = null;
										local503 = 0;
										if (local1500) {
											local114 = local20.anInt2249;
										} else {
											local114 = local20.anInt2252;
										}
										if (local20.anInt2254 != -1) {
											local1524 = Static22.method568(local20.anInt2254);
											if (local1524 != null) {
												local1524 = local1524.method1193(local20.anInt2253);
												local1502 = local1524.method1191(1);
												if (local1502 == null) {
													local12 = false;
												} else {
													local1502.method628();
													local503 = local1502.anInt3333 / 2;
												}
											}
										} else if (local20.anInt2267 == 5) {
											if (local20.anInt2279 == 0) {
												local1502 = Static65.aClass50_2.method1639(-1, null, -1, null);
											} else {
												local1502 = Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.method2225();
											}
										} else if (local114 == -1) {
											local1502 = local20.method1496(local1500, null, -1, Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.aClass50_1);
											if (local1502 == null && Static49.aBoolean51) {
												local12 = false;
											}
										} else {
											@Pc(1582) Class3_Sub1_Sub14 local1582 = Static109.method2054(local114);
											local1502 = local20.method1496(local1500, local1582, local20.anInt2277, Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.aClass50_1);
											if (local1502 == null && Static49.aBoolean51) {
												local12 = false;
											}
										}
										Static7.method276(local20.anInt2304 / 2 + local76, local20.anInt2270 / 2 + local65);
										local512 = Class3_Sub1_Sub2_Sub1.anIntArray41[local20.anInt2259] * local20.anInt2300 >> 16;
										local661 = Class3_Sub1_Sub2_Sub1.anIntArray39[local20.anInt2259] * local20.anInt2300 >> 16;
										if (local1502 != null) {
											if (local20.aBoolean81) {
												local1502.method628();
												if (local20.aBoolean75) {
													local1502.method620(local20.anInt2302, local20.anInt2295, local20.anInt2259, local20.anInt2255, local503 + local512 + local20.anInt2301, local20.anInt2301 + local661, local20.anInt2300);
												} else {
													local1502.method639(local20.anInt2302, local20.anInt2295, local20.anInt2259, local20.anInt2255, local20.anInt2301 + local503 + local512, local661 + local20.anInt2301);
												}
											} else {
												local1502.method639(local20.anInt2302, 0, local20.anInt2259, 0, local512, local661);
											}
										}
										Static7.method271();
									} else {
										if (local20.anInt2296 == 7) {
											local977 = local20.method1491();
											if (local977 == null) {
												if (Static49.aBoolean51) {
													local12 = false;
												}
												continue;
											}
											local114 = 0;
											for (local116 = 0; local116 < local20.anInt2270; local116++) {
												for (local503 = 0; local503 < local20.anInt2304; local503++) {
													if (local20.anIntArray235[local114] > 0) {
														local1524 = Static22.method568(local20.anIntArray235[local114] - 1);
														@Pc(1768) Class60 local1768 = local1524.aClass60_816;
														if (local1768 == null) {
															local1768 = Static95.aClass60_1172;
														}
														if (local1524.anInt1878 == 1 || local20.anIntArray230[local114] != 1) {
															local1768 = Static60.method1211(new Class60[] { Static46.aClass60_633, local1768, Static129.aClass60_1444, Static39.method877(local20.anIntArray230[local114]) });
														}
														local249 = local503 * (local20.anInt2261 + 115) + local76;
														local239 = (local20.anInt2266 + 12) * local116 + local65;
														if (local20.anInt2246 == 0) {
															local977.method847(local1768, local249, local239, local20.anInt2272, local20.aBoolean82 ? 0 : -1);
														} else if (local20.anInt2246 == 1) {
															local977.method842(local1768, local249 + local20.anInt2304 / 2, local239, local20.anInt2272, local20.aBoolean82 ? 0 : -1);
														} else {
															local977.method832(local1768, local20.anInt2304 + local249 - 1, local239, local20.anInt2272, local20.aBoolean82 ? 0 : -1);
														}
													}
													local114++;
												}
											}
										}
										if (local20.anInt2296 == 8 && Static97.method1825(arg7, local14) && Static89.anInt2620 == Static4.anInt136) {
											@Pc(1922) Class60 local1922 = local20.aClass60_969;
											local114 = 0;
											local485 = 0;
											@Pc(1928) Class3_Sub1_Sub2_Sub2 local1928 = Static20.aClass3_Sub1_Sub2_Sub2_2;
											local1922 = Static18.method518(local1922, local20);
											@Pc(1949) Class60 local1949;
											while (local1922.method1836() > 0) {
												local661 = local1922.method1847(Static30.aClass60_404);
												if (local661 == -1) {
													local1949 = local1922;
													local1922 = Static120.aClass60_1369;
												} else {
													local1949 = local1922.method1864(0, local661);
													local1922 = local1922.method1829(local661 + 4);
												}
												local249 = local1928.method848(local1949);
												local114 += local1928.anInt1258 + 1;
												if (local485 < local249) {
													local485 = local249;
												}
											}
											local485 += 6;
											local114 += 7;
											local661 = local76 + local20.anInt2304 - local485 - 5;
											if (local661 < local76 + 5) {
												local661 = local76 + 5;
											}
											if (local661 + local485 > arg0) {
												local661 = arg0 - local485;
											}
											local249 = local65 + local20.anInt2270 + 5;
											if (arg1 < local114 + local249) {
												local249 = arg1 - local114;
											}
											Static40.method1893(local661, local249, local485, local114, 16777120);
											Static40.method1884(local661, local249, local485, local114, 0);
											local239 = local249 + local1928.anInt1258 + 2;
											local1922 = local20.aClass60_969;
											local1922 = Static18.method518(local1922, local20);
											while (local1922.method1836() > 0) {
												local254 = local1922.method1847(Static30.aClass60_404);
												if (local254 == -1) {
													local1949 = local1922;
													local1922 = Static120.aClass60_1369;
												} else {
													local1949 = local1922.method1864(0, local254);
													local1922 = local1922.method1829(local254 + 4);
												}
												local1928.method847(local1949, local661 + 3, local239, 0, -1);
												local239 += local1928.anInt1258 + 1;
											}
										}
										if (local20.anInt2296 == 9) {
											if (local20.anInt2264 == 1) {
												Static40.method1887(local76, local65, local76 + local20.anInt2304, local20.anInt2270 + local65, local20.anInt2272);
											} else {
												local114 = local20.anInt2270 < 0 ? -local20.anInt2270 : local20.anInt2270;
												local485 = local20.anInt2304 >= 0 ? local20.anInt2304 : -local20.anInt2304;
												local116 = local485;
												if (local485 < local114) {
													local116 = local114;
												}
												if (local116 != 0) {
													local503 = (local20.anInt2304 << 16) / local116;
													local512 = (local20.anInt2270 << 16) / local116;
													if (local503 < local512) {
														local512 = -local512;
													} else {
														local503 = -local503;
													}
													local249 = local20.anInt2264 * local512 + 1 >> 17;
													local661 = local20.anInt2264 * local512 >> 17;
													local239 = local20.anInt2264 * local503 >> 17;
													local254 = local20.anInt2264 * local503 + 1 >> 17;
													local721 = local76 - local249;
													local259 = local661 + local76;
													local1384 = local20.anInt2304 + local76 - local249;
													@Pc(2246) int local2246 = local661 + local76 + local20.anInt2304;
													@Pc(2251) int local2251 = local65 + local239;
													@Pc(2258) int local2258 = local65 + local20.anInt2270 - local254;
													@Pc(2262) int local2262 = local65 - local254;
													@Pc(2269) int local2269 = local239 + local20.anInt2270 + local65;
													Static7.method282(local259, local721, local1384);
													Static7.method277(local2251, local2262, local2258, local259, local721, local1384, local20.anInt2272);
													Static7.method282(local259, local1384, local2246);
													Static7.method277(local2251, local2258, local2269, local259, local1384, local2246, local20.anInt2272);
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
		return local12;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IILjava/awt/Component;Lclient!u;I)Lclient!w;")
	public static Class34 method1671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) Class74 arg3) {
		if (Static68.anInt2134 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(32) Class34 local32 = (Class34) Class.forName("Class34_Sub1").getDeclaredConstructor().newInstance();
			local32.anIntArray284 = new int[(Static68.aBoolean70 ? 2 : 1) * 256];
			local32.anInt2667 = arg1;
			local32.method1713(arg2);
			local32.anInt2668 = (arg1 & 0xFFFFFC00) + 1024;
			if (local32.anInt2668 > 16384) {
				local32.anInt2668 = 16384;
			}
			local32.method1719(local32.anInt2668);
			if (Static51.anInt1355 > 0 && Static13.aClass38_1 == null) {
				Static13.aClass38_1 = new Class38();
				Static13.aClass38_1.aClass74_2 = arg3;
				arg3.method2122(Static13.aClass38_1, Static51.anInt1355);
			}
			if (Static13.aClass38_1 != null) {
				if (Static13.aClass38_1.aClass34Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static13.aClass38_1.aClass34Array1[arg0] = local32;
			}
			return local32;
		} catch (@Pc(105) Throwable local105) {
			try {
				@Pc(116) Class34_Sub2 local116 = new Class34_Sub2(arg3, arg0);
				local116.anInt2667 = arg1;
				local116.anIntArray284 = new int[(Static68.aBoolean70 ? 2 : 1) * 256];
				local116.method1713(arg2);
				local116.anInt2668 = 16384;
				local116.method1719(local116.anInt2668);
				if (Static51.anInt1355 > 0 && Static13.aClass38_1 == null) {
					Static13.aClass38_1 = new Class38();
					Static13.aClass38_1.aClass74_2 = arg3;
					arg3.method2122(Static13.aClass38_1, Static51.anInt1355);
				}
				if (Static13.aClass38_1 != null) {
					if (Static13.aClass38_1.aClass34Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static13.aClass38_1.aClass34Array1[arg0] = local116;
				}
				return local116;
			} catch (@Pc(178) Throwable local178) {
				return new Class34();
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
	public static void method1672() {
		aClass60_1132 = null;
		aClass60_1133 = null;
		aClass60_1135 = null;
		aClass60_1129 = null;
		anIntArray270 = null;
		anIntArray271 = null;
		aClass60_1130 = null;
		aClass16_62 = null;
		aClass60_1134 = null;
		aClass17_44 = null;
		aClass3_Sub15_3 = null;
		aClass60_1131 = null;
		aClass3_Sub1_Sub4_1 = null;
		aClass60_1128 = null;
		aClass3_Sub1_Sub2_Sub4_10 = null;
		aClass25_26 = null;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)Z")
	public static boolean method1673(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BIII)V")
	public static void method1674(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static58.anInt1807 == 0 || arg1 == 0 || Static58.anInt1802 >= 50) {
			return;
		}
		Static32.anIntArray135[Static58.anInt1802] = arg0;
		Static128.anIntArray389[Static58.anInt1802] = arg1;
		Static78.anIntArray241[Static58.anInt1802] = arg2;
		Static96.aClass63Array1[Static58.anInt1802] = null;
		Static103.anIntArray311[Static58.anInt1802] = 0;
		Static58.anInt1802++;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
	public static void method1675() {
		if (Static86.anInt1611 == 104) {
			@Pc(14) int local14;
			if (Static6.anInt197 == -1) {
				local14 = Static124.anInt3221;
			} else {
				local14 = Static6.anInt197;
			}
			if (Static124.anInt3221 != Static6.anInt197) {
				local14--;
				if (local14 < 0) {
					local14 = 19;
				}
				if (Static77.aClass60Array15[local14] != null) {
					Static120.aClass60_1376 = Static77.aClass60Array15[local14];
					Static71.aBoolean49 = true;
					Static6.anInt197 = local14;
				}
			}
		}
		if (Static86.anInt1611 != 105 || Static6.anInt197 == -1) {
			return;
		}
		Static6.anInt197++;
		if (Static6.anInt197 >= 20) {
			Static6.anInt197 = 0;
		}
		if (Static6.anInt197 == Static124.anInt3221) {
			Static120.aClass60_1376 = Static120.aClass60_1369;
			Static71.aBoolean49 = true;
			Static6.anInt197 = -1;
		} else if (Static77.aClass60Array15[Static6.anInt197] != null) {
			Static120.aClass60_1376 = Static77.aClass60Array15[Static6.anInt197];
			Static71.aBoolean49 = true;
		}
	}
}
