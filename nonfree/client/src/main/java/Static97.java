import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "[S")
	public static short[] aShortArray25;

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
	public static int anInt2014;

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "Lclient!cg;")
	public static Class18 aClass18_1;

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "Lclient!ke;")
	public static Class52 aClass52_21;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "Z")
	public static boolean aBoolean104 = false;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
	public static int anInt2012 = 2;

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_994 = Static193.method3027("<br>");

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "Z")
	public static boolean aBoolean105 = false;

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
	public static int anInt2019 = 128;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!dg;Z)V")
	public static void method1401(@OriginalArg(0) Class3_Sub6 arg0, @OriginalArg(1) boolean arg1) {
		Static153.aClass10_84.method261(arg0);
		while (true) {
			@Pc(8) Class3_Sub6 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(30) Class3_Sub6[][] local30;
			@Pc(47) Class3_Sub6 local47;
			@Pc(245) int local245;
			@Pc(579) int local579;
			@Pc(584) int local584;
			@Pc(589) int local589;
			@Pc(906) Class36 local906;
			@Pc(1079) int local1079;
			@Pc(964) int local964;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(251) Class99 var11;
										@Pc(592) int var16;
										@Pc(601) int var17;
										@Pc(613) int var18;
										@Pc(335) int var20;
										@Pc(283) boolean var21;
										@Pc(787) Class3_Sub6 var32;
										while (true) {
											do {
												local8 = (Class3_Sub6) Static153.aClass10_84.method270();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean45);
											local17 = local8.anInt831;
											local20 = local8.anInt823;
											local23 = local8.anInt822;
											local26 = local8.anInt832;
											local30 = Static118.aClass3_Sub6ArrayArrayArray1[local23];
											if (!local8.aBoolean44) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local47 = Static118.aClass3_Sub6ArrayArrayArray1[local23 - 1][local17][local20];
													if (local47 != null && local47.aBoolean45) {
														continue;
													}
												}
												if (local17 <= Static145.anInt2993 && local17 > Static81.anInt1615) {
													local47 = local30[local17 - 1][local20];
													if (local47 != null && local47.aBoolean45 && (local47.aBoolean44 || (local8.anInt829 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static145.anInt2993 && local17 < Static105.anInt2110 - 1) {
													local47 = local30[local17 + 1][local20];
													if (local47 != null && local47.aBoolean45 && (local47.aBoolean44 || (local8.anInt829 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static31.anInt701 && local20 > Static47.anInt969) {
													local47 = local30[local17][local20 - 1];
													if (local47 != null && local47.aBoolean45 && (local47.aBoolean44 || (local8.anInt829 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static31.anInt701 && local20 < Static119.anInt2415 - 1) {
													local47 = local30[local17][local20 + 1];
													if (local47 != null && local47.aBoolean45 && (local47.aBoolean44 || (local8.anInt829 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean44 = false;
											if (local8.aClass3_Sub6_1 != null) {
												local47 = local8.aClass3_Sub6_1;
												if (local47.aClass45_1 == null) {
													if (local47.aClass60_1 != null && !Static137.method1962(0, local17, local20)) {
														Static181.method2819(local47.aClass60_1, Static113.anInt2292, Static204.anInt4161, Static77.anInt1522, Static71.anInt1416, local17, local20);
													}
												} else if (!Static137.method1962(0, local17, local20)) {
													Static184.method2898(local47.aClass45_1, 0, Static113.anInt2292, Static204.anInt4161, Static77.anInt1522, Static71.anInt1416, local17, local20);
												}
												@Pc(219) Class36 local219 = local47.aClass36_1;
												if (local219 != null) {
													local219.aClass26_4.method2993(0, Static113.anInt2292, Static204.anInt4161, Static77.anInt1522, Static71.anInt1416, local219.anInt1309 - Static116.anInt3348, local219.anInt1306 - Static198.anInt4037, local219.anInt1304 - Static146.anInt3006, local219.aLong37);
												}
												for (local245 = 0; local245 < local47.anInt827; local245++) {
													var11 = local47.aClass99Array1[local245];
													if (var11 != null) {
														var11.aClass26_11.method2993(var11.anInt4232, Static113.anInt2292, Static204.anInt4161, Static77.anInt1522, Static71.anInt1416, var11.anInt4235 - Static116.anInt3348, var11.anInt4231 - Static198.anInt4037, var11.anInt4236 - Static146.anInt3006, var11.aLong144);
													}
												}
											}
											var21 = false;
											if (local8.aClass45_1 == null) {
												if (local8.aClass60_1 != null && !Static137.method1962(local26, local17, local20)) {
													var21 = true;
													Static181.method2819(local8.aClass60_1, Static113.anInt2292, Static204.anInt4161, Static77.anInt1522, Static71.anInt1416, local17, local20);
												}
											} else if (!Static137.method1962(local26, local17, local20)) {
												var21 = true;
												if (local8.aClass45_1.anInt1711 != 12345678 || Static1.aBoolean96 && local23 <= Static95.anInt1976) {
													Static184.method2898(local8.aClass45_1, local26, Static113.anInt2292, Static204.anInt4161, Static77.anInt1522, Static71.anInt1416, local17, local20);
												}
											}
											var20 = 0;
											local245 = 0;
											@Pc(340) Class36 local340 = local8.aClass36_1;
											@Pc(343) Class83 local343 = local8.aClass83_1;
											if (local340 != null || local343 != null) {
												if (Static145.anInt2993 == local17) {
													var20++;
												} else if (Static145.anInt2993 < local17) {
													var20 += 2;
												}
												if (Static31.anInt701 == local20) {
													var20 += 3;
												} else if (Static31.anInt701 > local20) {
													var20 += 6;
												}
												local245 = Static149.anIntArray222[var20];
												local8.anInt826 = Static99.anIntArray112[var20];
											}
											if (local340 != null) {
												if ((local340.anInt1305 & Static176.anIntArray297[var20]) == 0) {
													local8.anInt825 = 0;
												} else if (local340.anInt1305 == 16) {
													local8.anInt825 = 3;
													local8.anInt821 = Static88.anIntArray92[var20];
													local8.anInt828 = 3 - local8.anInt821;
												} else if (local340.anInt1305 == 32) {
													local8.anInt825 = 6;
													local8.anInt821 = Static31.anIntArray36[var20];
													local8.anInt828 = 6 - local8.anInt821;
												} else if (local340.anInt1305 == 64) {
													local8.anInt825 = 12;
													local8.anInt821 = Static110.anIntArray134[var20];
													local8.anInt828 = 12 - local8.anInt821;
												} else {
													local8.anInt825 = 9;
													local8.anInt821 = Static88.anIntArray91[var20];
													local8.anInt828 = 9 - local8.anInt821;
												}
												if ((local340.anInt1305 & local245) != 0 && !Static23.method391(local26, local17, local20, local340.anInt1305)) {
													local340.aClass26_4.method2993(0, Static113.anInt2292, Static204.anInt4161, Static77.anInt1522, Static71.anInt1416, local340.anInt1309 - Static116.anInt3348, local340.anInt1306 - Static198.anInt4037, local340.anInt1304 - Static146.anInt3006, local340.aLong37);
												}
												if ((local340.anInt1311 & local245) != 0 && !Static23.method391(local26, local17, local20, local340.anInt1311)) {
													local340.aClass26_5.method2993(0, Static113.anInt2292, Static204.anInt4161, Static77.anInt1522, Static71.anInt1416, local340.anInt1309 - Static116.anInt3348, local340.anInt1306 - Static198.anInt4037, local340.anInt1304 - Static146.anInt3006, local340.aLong37);
												}
											}
											if (local343 != null && !Static9.method232(local26, local17, local20, local343.aClass26_8.method2995())) {
												if ((local343.anInt3369 & local245) != 0) {
													local343.aClass26_8.method2993(0, Static113.anInt2292, Static204.anInt4161, Static77.anInt1522, Static71.anInt1416, local343.anInt3367 + local343.anInt3362 - Static116.anInt3348, local343.anInt3360 - Static198.anInt4037, local343.anInt3364 + local343.anInt3363 - Static146.anInt3006, local343.aLong111);
												} else if (local343.anInt3369 == 256) {
													local579 = local343.anInt3367 - Static116.anInt3348;
													local584 = local343.anInt3360 - Static198.anInt4037;
													local589 = local343.anInt3364 - Static146.anInt3006;
													var16 = local343.anInt3365;
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
														local343.aClass26_8.method2993(0, Static113.anInt2292, Static204.anInt4161, Static77.anInt1522, Static71.anInt1416, local579 + local343.anInt3362, local584, local589 + local343.anInt3363, local343.aLong111);
													} else if (local343.aClass26_9 != null) {
														local343.aClass26_9.method2993(0, Static113.anInt2292, Static204.anInt4161, Static77.anInt1522, Static71.anInt1416, local579, local584, local589, local343.aLong111);
													}
												}
											}
											if (var21) {
												@Pc(660) Class64 local660 = local8.aClass64_1;
												if (local660 != null) {
													local660.aClass26_6.method2993(0, Static113.anInt2292, Static204.anInt4161, Static77.anInt1522, Static71.anInt1416, local660.anInt2571 - Static116.anInt3348, local660.anInt2578 - Static198.anInt4037, local660.anInt2577 - Static146.anInt3006, local660.aLong78);
												}
												@Pc(687) Class35 local687 = local8.aClass35_1;
												if (local687 != null && local687.anInt1293 == 0) {
													if (local687.aClass26_2 != null) {
														local687.aClass26_2.method2993(0, Static113.anInt2292, Static204.anInt4161, Static77.anInt1522, Static71.anInt1416, local687.anInt1300 - Static116.anInt3348, local687.anInt1294 - Static198.anInt4037, local687.anInt1302 - Static146.anInt3006, local687.aLong36);
													}
													if (local687.aClass26_3 != null) {
														local687.aClass26_3.method2993(0, Static113.anInt2292, Static204.anInt4161, Static77.anInt1522, Static71.anInt1416, local687.anInt1300 - Static116.anInt3348, local687.anInt1294 - Static198.anInt4037, local687.anInt1302 - Static146.anInt3006, local687.aLong36);
													}
													if (local687.aClass26_1 != null) {
														local687.aClass26_1.method2993(0, Static113.anInt2292, Static204.anInt4161, Static77.anInt1522, Static71.anInt1416, local687.anInt1300 - Static116.anInt3348, local687.anInt1294 - Static198.anInt4037, local687.anInt1302 - Static146.anInt3006, local687.aLong36);
													}
												}
											}
											local579 = local8.anInt829;
											if (local579 != 0) {
												if (local17 < Static145.anInt2993 && (local579 & 0x4) != 0) {
													var32 = local30[local17 + 1][local20];
													if (var32 != null && var32.aBoolean45) {
														Static153.aClass10_84.method261(var32);
													}
												}
												if (local20 < Static31.anInt701 && (local579 & 0x2) != 0) {
													var32 = local30[local17][local20 + 1];
													if (var32 != null && var32.aBoolean45) {
														Static153.aClass10_84.method261(var32);
													}
												}
												if (local17 > Static145.anInt2993 && (local579 & 0x1) != 0) {
													var32 = local30[local17 - 1][local20];
													if (var32 != null && var32.aBoolean45) {
														Static153.aClass10_84.method261(var32);
													}
												}
												if (local20 > Static31.anInt701 && (local579 & 0x8) != 0) {
													var32 = local30[local17][local20 - 1];
													if (var32 != null && var32.aBoolean45) {
														Static153.aClass10_84.method261(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt825 != 0) {
											var21 = true;
											for (var20 = 0; var20 < local8.anInt827; var20++) {
												if (local8.aClass99Array1[var20].anInt4223 != Static90.anInt1778 && (local8.anIntArray40[var20] & local8.anInt825) == local8.anInt821) {
													var21 = false;
													break;
												}
											}
											if (var21) {
												local906 = local8.aClass36_1;
												if (!Static23.method391(local26, local17, local20, local906.anInt1305)) {
													local906.aClass26_4.method2993(0, Static113.anInt2292, Static204.anInt4161, Static77.anInt1522, Static71.anInt1416, local906.anInt1309 - Static116.anInt3348, local906.anInt1306 - Static198.anInt4037, local906.anInt1304 - Static146.anInt3006, local906.aLong37);
												}
												local8.anInt825 = 0;
											}
										}
										if (!local8.aBoolean46) {
											break;
										}
										try {
											@Pc(944) int local944 = local8.anInt827;
											local8.aBoolean46 = false;
											var20 = 0;
											label558: for (local245 = 0; local245 < local944; local245++) {
												var11 = local8.aClass99Array1[local245];
												if (var11.anInt4223 != Static90.anInt1778) {
													for (local964 = var11.anInt4226; local964 <= var11.anInt4224; local964++) {
														for (local579 = var11.anInt4239; local579 <= var11.anInt4230; local579++) {
															var32 = local30[local964][local579];
															if (var32.aBoolean44) {
																local8.aBoolean46 = true;
																continue label558;
															}
															if (var32.anInt825 != 0) {
																local589 = 0;
																if (local964 > var11.anInt4226) {
																	local589++;
																}
																if (local964 < var11.anInt4224) {
																	local589 += 4;
																}
																if (local579 > var11.anInt4239) {
																	local589 += 8;
																}
																if (local579 < var11.anInt4230) {
																	local589 += 2;
																}
																if ((local589 & var32.anInt825) == local8.anInt828) {
																	local8.aBoolean46 = true;
																	continue label558;
																}
															}
														}
													}
													Static119.aClass99Array3[var20++] = var11;
													local579 = Static145.anInt2993 - var11.anInt4226;
													local584 = var11.anInt4224 - Static145.anInt2993;
													if (local584 > local579) {
														local579 = local584;
													}
													local589 = Static31.anInt701 - var11.anInt4239;
													var16 = var11.anInt4230 - Static31.anInt701;
													if (var16 > local589) {
														var11.anInt4229 = local579 + var16;
													} else {
														var11.anInt4229 = local579 + local589;
													}
												}
											}
											while (var20 > 0) {
												local1079 = -50;
												local964 = -1;
												@Pc(1088) Class99 local1088;
												for (local579 = 0; local579 < var20; local579++) {
													local1088 = Static119.aClass99Array3[local579];
													if (local1088.anInt4223 != Static90.anInt1778) {
														if (local1088.anInt4229 > local1079) {
															local1079 = local1088.anInt4229;
															local964 = local579;
														} else if (local1088.anInt4229 == local1079) {
															local589 = local1088.anInt4235 - Static116.anInt3348;
															var16 = local1088.anInt4236 - Static146.anInt3006;
															var17 = Static119.aClass99Array3[local964].anInt4235 - Static116.anInt3348;
															var18 = Static119.aClass99Array3[local964].anInt4236 - Static146.anInt3006;
															if (local589 * local589 + var16 * var16 > var17 * var17 + var18 * var18) {
																local964 = local579;
															}
														}
													}
												}
												if (local964 == -1) {
													break;
												}
												local1088 = Static119.aClass99Array3[local964];
												local1088.anInt4223 = Static90.anInt1778;
												if (!Static67.method2288(local26, local1088.anInt4226, local1088.anInt4224, local1088.anInt4239, local1088.anInt4230, local1088.aClass26_11.method2995())) {
													local1088.aClass26_11.method2993(local1088.anInt4232, Static113.anInt2292, Static204.anInt4161, Static77.anInt1522, Static71.anInt1416, local1088.anInt4235 - Static116.anInt3348, local1088.anInt4231 - Static198.anInt4037, local1088.anInt4236 - Static146.anInt3006, local1088.aLong144);
												}
												for (local589 = local1088.anInt4226; local589 <= local1088.anInt4224; local589++) {
													for (var16 = local1088.anInt4239; var16 <= local1088.anInt4230; var16++) {
														@Pc(1212) Class3_Sub6 local1212 = local30[local589][var16];
														if (local1212.anInt825 != 0) {
															Static153.aClass10_84.method261(local1212);
														} else if ((local589 != local17 || var16 != local20) && local1212.aBoolean45) {
															Static153.aClass10_84.method261(local1212);
														}
													}
												}
											}
											if (!local8.aBoolean46) {
												break;
											}
										} catch (@Pc(1250) Exception local1250) {
											local8.aBoolean46 = false;
											break;
										}
									}
								} while (!local8.aBoolean45);
							} while (local8.anInt825 != 0);
							if (local17 > Static145.anInt2993 || local17 <= Static81.anInt1615) {
								break;
							}
							local47 = local30[local17 - 1][local20];
						} while (local47 != null && local47.aBoolean45);
						if (local17 < Static145.anInt2993 || local17 >= Static105.anInt2110 - 1) {
							break;
						}
						local47 = local30[local17 + 1][local20];
					} while (local47 != null && local47.aBoolean45);
					if (local20 > Static31.anInt701 || local20 <= Static47.anInt969) {
						break;
					}
					local47 = local30[local17][local20 - 1];
				} while (local47 != null && local47.aBoolean45);
				if (local20 < Static31.anInt701 || local20 >= Static119.anInt2415 - 1) {
					break;
				}
				local47 = local30[local17][local20 + 1];
			} while (local47 != null && local47.aBoolean45);
			local8.aBoolean45 = false;
			Static38.anInt819--;
			@Pc(1354) Class35 local1354 = local8.aClass35_1;
			if (local1354 != null && local1354.anInt1293 != 0) {
				if (local1354.aClass26_2 != null) {
					local1354.aClass26_2.method2993(0, Static113.anInt2292, Static204.anInt4161, Static77.anInt1522, Static71.anInt1416, local1354.anInt1300 - Static116.anInt3348, local1354.anInt1294 - Static198.anInt4037 - local1354.anInt1293, local1354.anInt1302 - Static146.anInt3006, local1354.aLong36);
				}
				if (local1354.aClass26_3 != null) {
					local1354.aClass26_3.method2993(0, Static113.anInt2292, Static204.anInt4161, Static77.anInt1522, Static71.anInt1416, local1354.anInt1300 - Static116.anInt3348, local1354.anInt1294 - Static198.anInt4037 - local1354.anInt1293, local1354.anInt1302 - Static146.anInt3006, local1354.aLong36);
				}
				if (local1354.aClass26_1 != null) {
					local1354.aClass26_1.method2993(0, Static113.anInt2292, Static204.anInt4161, Static77.anInt1522, Static71.anInt1416, local1354.anInt1300 - Static116.anInt3348, local1354.anInt1294 - Static198.anInt4037 - local1354.anInt1293, local1354.anInt1302 - Static146.anInt3006, local1354.aLong36);
				}
			}
			if (local8.anInt826 != 0) {
				@Pc(1449) Class83 local1449 = local8.aClass83_1;
				if (local1449 != null && !Static9.method232(local26, local17, local20, local1449.aClass26_8.method2995())) {
					if ((local1449.anInt3369 & local8.anInt826) != 0) {
						local1449.aClass26_8.method2993(0, Static113.anInt2292, Static204.anInt4161, Static77.anInt1522, Static71.anInt1416, local1449.anInt3367 + local1449.anInt3362 - Static116.anInt3348, local1449.anInt3360 - Static198.anInt4037, local1449.anInt3364 + local1449.anInt3363 - Static146.anInt3006, local1449.aLong111);
					} else if (local1449.anInt3369 == 256) {
						local245 = local1449.anInt3367 - Static116.anInt3348;
						local1079 = local1449.anInt3360 - Static198.anInt4037;
						local964 = local1449.anInt3364 - Static146.anInt3006;
						local579 = local1449.anInt3365;
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
							local1449.aClass26_8.method2993(0, Static113.anInt2292, Static204.anInt4161, Static77.anInt1522, Static71.anInt1416, local245 + local1449.anInt3362, local1079, local964 + local1449.anInt3363, local1449.aLong111);
						} else if (local1449.aClass26_9 != null) {
							local1449.aClass26_9.method2993(0, Static113.anInt2292, Static204.anInt4161, Static77.anInt1522, Static71.anInt1416, local245, local1079, local964, local1449.aLong111);
						}
					}
				}
				local906 = local8.aClass36_1;
				if (local906 != null) {
					if ((local906.anInt1311 & local8.anInt826) != 0 && !Static23.method391(local26, local17, local20, local906.anInt1311)) {
						local906.aClass26_5.method2993(0, Static113.anInt2292, Static204.anInt4161, Static77.anInt1522, Static71.anInt1416, local906.anInt1309 - Static116.anInt3348, local906.anInt1306 - Static198.anInt4037, local906.anInt1304 - Static146.anInt3006, local906.aLong37);
					}
					if ((local906.anInt1305 & local8.anInt826) != 0 && !Static23.method391(local26, local17, local20, local906.anInt1305)) {
						local906.aClass26_4.method2993(0, Static113.anInt2292, Static204.anInt4161, Static77.anInt1522, Static71.anInt1416, local906.anInt1309 - Static116.anInt3348, local906.anInt1306 - Static198.anInt4037, local906.anInt1304 - Static146.anInt3006, local906.aLong37);
					}
				}
			}
			@Pc(1669) Class3_Sub6 local1669;
			if (local23 < Static76.anInt1501 - 1) {
				local1669 = Static118.aClass3_Sub6ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1669 != null && local1669.aBoolean45) {
					Static153.aClass10_84.method261(local1669);
				}
			}
			if (local17 < Static145.anInt2993) {
				local1669 = local30[local17 + 1][local20];
				if (local1669 != null && local1669.aBoolean45) {
					Static153.aClass10_84.method261(local1669);
				}
			}
			if (local20 < Static31.anInt701) {
				local1669 = local30[local17][local20 + 1];
				if (local1669 != null && local1669.aBoolean45) {
					Static153.aClass10_84.method261(local1669);
				}
			}
			if (local17 > Static145.anInt2993) {
				local1669 = local30[local17 - 1][local20];
				if (local1669 != null && local1669.aBoolean45) {
					Static153.aClass10_84.method261(local1669);
				}
			}
			if (local20 > Static31.anInt701) {
				local1669 = local30[local17][local20 - 1];
				if (local1669 != null && local1669.aBoolean45) {
					Static153.aClass10_84.method261(local1669);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIZII)Lclient!ah;")
	public static Class3_Sub3_Sub2_Sub1 method1402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(23) long local23 = ((long) arg1 << 38) + ((long) arg4 << 16) + (long) arg2 + (arg3 ? 137438953472L : 0L) + ((long) arg0 << 40);
		@Pc(41) Class3_Sub3_Sub2_Sub1 local41 = (Class3_Sub3_Sub2_Sub1) Static54.aClass85_10.method2558(local23);
		if (local41 != null) {
			return local41;
		}
		local41 = Static13.method271(arg4, arg3, arg0, false, arg2, arg1);
		if (local41 != null) {
			Static54.aClass85_10.method2560(local41, local23);
		}
		return local41;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1403(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = Static130.method1827(Static52.anInt1117, arg4, Static26.anInt554);
		@Pc(15) int local15 = Static130.method1827(Static52.anInt1117, arg2, Static26.anInt554);
		@Pc(21) int local21 = Static130.method1827(Static200.anInt4074, arg5, Static119.anInt2428);
		@Pc(27) int local27 = Static130.method1827(Static200.anInt4074, arg1, Static119.anInt2428);
		@Pc(35) int local35 = Static130.method1827(Static52.anInt1117, arg4 + arg0, Static26.anInt554);
		@Pc(44) int local44 = Static130.method1827(Static52.anInt1117, arg2 - arg0, Static26.anInt554);
		for (@Pc(46) int local46 = local9; local46 < local35; local46++) {
			Static16.method302(arg3, local21, local27, Static157.anIntArrayArray24[local46]);
		}
		for (@Pc(65) int local65 = local15; local65 > local44; local65--) {
			Static16.method302(arg3, local21, local27, Static157.anIntArrayArray24[local65]);
		}
		@Pc(86) int local86 = Static130.method1827(Static200.anInt4074, arg0 + arg5, Static119.anInt2428);
		@Pc(95) int local95 = Static130.method1827(Static200.anInt4074, arg1 - arg0, Static119.anInt2428);
		for (@Pc(97) int local97 = local35; local97 <= local44; local97++) {
			@Pc(102) int[] local102 = Static157.anIntArrayArray24[local97];
			Static16.method302(arg3, local21, local86, local102);
			Static16.method302(arg6, local86, local95, local102);
			Static16.method302(arg3, local95, local27, local102);
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public static void method1404() {
		if (Static167.aClass33_3 != null) {
			Static167.aClass33_3.method925();
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IJ)V")
	public static void method1405(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static13.anInt318 >= 100 && Static55.anInt1173 != 1 || Static13.anInt318 >= 200) {
			Static135.method1934(Static134.aClass70_1271, 0, Static61.aClass70_596);
			return;
		}
		@Pc(35) Class70 local35 = Static113.method1641(arg0).method2033();
		for (@Pc(49) int local49 = 0; local49 < Static13.anInt318; local49++) {
			if (Static70.aLongArray1[local49] == arg0) {
				Static135.method1934(Static207.method3296(new Class70[] { local35, Static147.aClass70_1425 }), 0, Static61.aClass70_596);
				return;
			}
		}
		for (@Pc(87) int local87 = 0; local87 < Static61.anInt1297; local87++) {
			if (Static183.aLongArray6[local87] == arg0) {
				Static135.method1934(Static207.method3296(new Class70[] { Static106.aClass70_1073, local35, Static127.aClass70_1192 }), 0, Static61.aClass70_596);
				return;
			}
		}
		if (local35.method2032(Static144.aClass26_Sub2_Sub1_1.aClass70_952)) {
			Static135.method1934(Static47.aClass70_474, 0, Static61.aClass70_596);
			return;
		}
		Static52.aClass70Array24[Static13.anInt318] = local35;
		Static70.aLongArray1[Static13.anInt318] = arg0;
		Static179.anIntArray74[Static13.anInt318] = 0;
		Static81.aClass70Array32[Static13.anInt318] = Static61.aClass70_596;
		Static42.anIntArray46[Static13.anInt318] = 0;
		Static13.anInt318++;
		Static33.anInt719 = Static86.anInt1703;
		Static93.aClass3_Sub4_Sub1_18.method1298(207);
		Static93.aClass3_Sub4_Sub1_18.method1250(arg0);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!ke;I)Lclient!r;")
	public static Class3_Sub21 method1406(@OriginalArg(1) Class52 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method1557(arg1);
		return local8 == null ? null : new Class3_Sub21(local8);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)I")
	public static int method1407(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class3_Sub7 local15 = (Class3_Sub7) Static145.aClass40_10.method1029((long) arg1);
		if (local15 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local15.anIntArray61.length) {
			return local15.anIntArray61[arg0];
		} else {
			return -1;
		}
	}
}
