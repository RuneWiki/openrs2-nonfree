import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!kd", name = "zc", descriptor = "Lclient!o;")
	public static Class4_Sub1 aClass4_Sub1_34;

	@OriginalMember(owner = "client!kd", name = "Oc", descriptor = "I")
	public static int anInt2621;

	@OriginalMember(owner = "client!kd", name = "Qc", descriptor = "I")
	public static int anInt2623;

	@OriginalMember(owner = "client!kd", name = "ad", descriptor = "Z")
	public static boolean aBoolean193;

	@OriginalMember(owner = "client!kd", name = "dd", descriptor = "I")
	public static int anInt2630;

	@OriginalMember(owner = "client!kd", name = "ed", descriptor = "[I")
	public static int[] anIntArray252;

	@OriginalMember(owner = "client!kd", name = "wc", descriptor = "Z")
	public static boolean aBoolean192 = false;

	@OriginalMember(owner = "client!kd", name = "Sc", descriptor = "Lclient!dd;")
	public static Class13 aClass13_848 = Static161.method2971("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!kd", name = "Tc", descriptor = "Lclient!dd;")
	public static Class13 aClass13_849 = Static161.method2971("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!kd", name = "Yc", descriptor = "[[I")
	public static int[][] anIntArrayArray21 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!kd", name = "cd", descriptor = "Lclient!dd;")
	public static Class13 aClass13_850 = Static161.method2971("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
	public static void method1891() {
		anIntArray252 = null;
		aClass13_850 = null;
		aClass13_848 = null;
		aClass4_Sub1_34 = null;
		anIntArrayArray21 = null;
		aClass13_849 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method1892(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local10 = local15.aString5 + " | ";
			arg0 = local15.aThrowable1;
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			while (true) {
				@Pc(64) String local64 = local53.readLine();
				if (local64 == null) {
					return local10 + "| " + local56;
				}
				@Pc(70) int local70 = local64.indexOf(40);
				@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(94) String local94 = local64.substring(local70 + 1, local77);
					@Pc(98) int local98 = local94.indexOf(".java:");
					if (local98 >= 0) {
						local94 = local94.substring(0, local98) + local94.substring(local98 + 5);
						local10 = local10 + local94 + ' ';
						continue;
					}
					local64 = local64.substring(0, local70);
				}
				local64 = local64.trim();
				local64 = local64.substring(local64.lastIndexOf(32) + 1);
				local64 = local64.substring(local64.lastIndexOf(9) + 1);
				local10 = local10 + local64 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIII[Lclient!fd;III)V")
	public static void method1893(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class20[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static128.method553(arg2, arg1, arg4, arg7);
		Static9.method363();
		for (@Pc(13) int local13 = 0; local13 < arg5.length; local13++) {
			@Pc(27) Class20 local27 = arg5[local13];
			if (local27 != null && (arg6 == local27.anInt1623 || arg6 == -1412584499 && local27 == Static162.aClass20_11)) {
				@Pc(79) int local79;
				if (arg3 == -1) {
					Static181.anIntArray448[Static125.anInt3241] = local27.anInt1613 + arg0;
					Static123.anIntArray308[Static125.anInt3241] = local27.anInt1594 + arg8;
					Static132.anIntArray330[Static125.anInt3241] = local27.anInt1559;
					Static26.anIntArray111[Static125.anInt3241] = local27.anInt1603;
					local79 = Static125.anInt3241++;
				} else {
					local79 = arg3;
				}
				local27.anInt1561 = Static78.anInt2168;
				local27.anInt1618 = local79;
				if (!local27.aBoolean118 || !Static180.method2980(local27)) {
					if (local27.anInt1586 > 0) {
						Static82.method1709(local27);
					}
					@Pc(105) int local105 = local27.anInt1552;
					@Pc(111) int local111 = local27.anInt1594 + arg8;
					@Pc(116) int local116 = arg0 + local27.anInt1613;
					@Pc(141) int local141;
					@Pc(174) int local174;
					if (local27 == Static162.aClass20_11) {
						if (arg6 != -1412584499 && !local27.aBoolean116) {
							Static67.anInt1952 = arg0;
							anInt2630 = arg8;
							Static82.aClass20Array2 = arg5;
							continue;
						}
						if (Static12.aBoolean39 && Static178.aBoolean312) {
							local141 = Static14.anInt481;
							local141 -= Static148.anInt3590;
							if (Static45.anInt1489 > local141) {
								local141 = Static45.anInt1489;
							}
							if (local141 + local27.anInt1559 > Static83.aClass20_6.anInt1559 + Static45.anInt1489) {
								local141 = Static83.aClass20_6.anInt1559 + Static45.anInt1489 - local27.anInt1559;
							}
							local174 = Static86.anInt2447;
							local116 = local141;
							local174 -= Static143.anInt3530;
							if (Static109.anInt2974 > local174) {
								local174 = Static109.anInt2974;
							}
							if (local174 + local27.anInt1603 > Static83.aClass20_6.anInt1603 + Static109.anInt2974) {
								local174 = Static83.aClass20_6.anInt1603 + Static109.anInt2974 - local27.anInt1603;
							}
							local111 = local174;
						}
						if (!local27.aBoolean116) {
							local105 = 128;
						}
					}
					@Pc(218) int local218;
					@Pc(222) int local222;
					@Pc(256) int local256;
					@Pc(273) int local273;
					@Pc(295) int local295;
					@Pc(301) int local301;
					if (local27.anInt1619 == 2) {
						local218 = arg4;
						local141 = arg2;
						local222 = arg7;
						local174 = arg1;
					} else if (local27.anInt1619 == 9) {
						local256 = local116;
						local273 = local111;
						local295 = local27.anInt1559 + local116;
						local301 = local111 + local27.anInt1603;
						if (local116 > local295) {
							local256 = local295;
							local295 = local116;
						}
						if (local111 > local301) {
							local273 = local301;
							local301 = local111;
						}
						local295++;
						local218 = arg4 <= local295 ? arg4 : local295;
						local141 = arg2 >= local256 ? arg2 : local256;
						local301++;
						local222 = arg7 <= local301 ? arg7 : local301;
						local174 = arg1 >= local273 ? arg1 : local273;
					} else {
						local174 = local111 > arg1 ? local111 : arg1;
						local141 = local116 > arg2 ? local116 : arg2;
						local256 = local116 + local27.anInt1559;
						local218 = local256 >= arg4 ? arg4 : local256;
						local273 = local111 + local27.anInt1603;
						local222 = arg7 <= local273 ? arg7 : local273;
					}
					if (!local27.aBoolean118 || local141 < local218 && local174 < local222) {
						if (local27.anInt1586 != 0) {
							if (local27.anInt1586 == 1337) {
								Static63.anInt1919 = local116;
								Static77.anInt2153 = local111;
								Static85.method1820(local27.anInt1603, local111, local116, local27.anInt1559);
								Static128.method553(arg2, arg1, arg4, arg7);
								continue;
							}
							if (local27.anInt1586 == 1338) {
								if (local27.method1239()) {
									Static75.method1568(local116, local27, local111, local79);
									Static128.method553(arg2, arg1, arg4, arg7);
								}
								continue;
							}
							if (local27.anInt1586 == 1339) {
								if (local27.method1239()) {
									Static31.method931(local27, local79, local111, local116);
									Static128.method553(arg2, arg1, arg4, arg7);
								}
								continue;
							}
						}
						local256 = Static14.anInt481;
						local273 = Static86.anInt2447;
						if (!Static46.aBoolean106 && local141 <= local256 && local273 >= local174 && local256 < local218 && local222 > local273) {
							Static4.method76(local273 - local111, local256 - local116, local27);
						}
						if (local27.anInt1619 == 0) {
							if (!local27.aBoolean118 && Static180.method2980(local27) && local27 != Static120.aClass20_9) {
								continue;
							}
							if (!local27.aBoolean118) {
								if (local27.anInt1563 - local27.anInt1603 < local27.anInt1592) {
									local27.anInt1592 = local27.anInt1563 - local27.anInt1603;
								}
								if (local27.anInt1592 < 0) {
									local27.anInt1592 = 0;
								}
							}
							method1893(local116 - local27.anInt1604, local174, local141, local79, local218, arg5, local27.anInt1630, local222, local111 - local27.anInt1592);
							if (local27.aClass20Array1 != null) {
								method1893(local116 - local27.anInt1604, local174, local141, local79, local218, local27.aClass20Array1, local27.anInt1630, local222, local111 - local27.anInt1592);
							}
							@Pc(567) Class1_Sub22 local567 = (Class1_Sub22) Static18.aClass45_3.method1988((long) local27.anInt1630);
							if (local567 != null) {
								if (local567.anInt3979 == 0 && Static14.anInt481 >= local141 && local174 <= Static86.anInt2447 && local218 > Static14.anInt481 && local222 > Static86.anInt2447 && !Static46.aBoolean106 && !Static184.aBoolean317) {
									Static58.aClass13Array15[0] = Static133.aClass13_1125;
									Static53.anInt1722 = 1;
									Static147.aShortArray41[0] = 1001;
									Static164.aClass13Array27[0] = Static16.aClass13_253;
								}
								Static18.method659(local111, local141, local79, local116, local222, local174, local567.anInt3978, local218);
							}
							Static128.method553(arg2, arg1, arg4, arg7);
							Static9.method363();
						}
						if (Static170.aBooleanArray52[local79] || Static139.anInt3458 > 1) {
							if (local27.anInt1619 == 0 && !local27.aBoolean118 && local27.anInt1603 < local27.anInt1563) {
								Static44.method1168(local27.anInt1559 + local116, local27.anInt1592, local111, local27.anInt1563, local27.anInt1603);
							}
							if (local27.anInt1619 != 1) {
								@Pc(671) int local671;
								@Pc(682) int local682;
								@Pc(863) int local863;
								@Pc(755) int local755;
								@Pc(918) int local918;
								@Pc(920) int local920;
								@Pc(943) int local943;
								@Pc(691) int local691;
								@Pc(868) int local868;
								if (local27.anInt1619 == 2) {
									local295 = 0;
									for (local301 = 0; local301 < local27.anInt1603; local301++) {
										for (local671 = 0; local671 < local27.anInt1559; local671++) {
											local682 = local671 * (local27.anInt1617 + 32) + local116;
											local691 = local301 * (local27.anInt1591 + 32) + local111;
											if (local295 < 20) {
												local682 += local27.anIntArray164[local295];
												local691 += local27.anIntArray166[local295];
											}
											if (local27.anIntArray168[local295] > 0) {
												local755 = local27.anIntArray168[local295] - 1;
												if (arg2 < local682 + 32 && local682 < arg4 && arg1 < local691 + 32 && arg7 > local691 || local27 == Static37.aClass20_2 && local295 == Static171.anInt3964) {
													@Pc(814) Class1_Sub2_Sub1_Sub3 local814;
													if (Static116.anInt3103 == 1 && local295 == Static156.anInt3693 && Static140.anInt3474 == local27.anInt1630) {
														local814 = Static143.method2548(false, local755, 2, 0, local27.anIntArray163[local295]);
													} else {
														local814 = Static143.method2548(false, local755, 1, 3153952, local27.anIntArray163[local295]);
													}
													if (local814 == null) {
														Static125.method2300(local27);
													} else if (local27 == Static37.aClass20_2 && local295 == Static171.anInt3964) {
														local863 = Static86.anInt2447 - Static117.anInt3109;
														local868 = Static14.anInt481 - Static179.anInt4049;
														if (local863 < 5 && local863 > -5) {
															local863 = 0;
														}
														if (local868 < 5 && local868 > -5) {
															local868 = 0;
														}
														if (Static93.anInt2713 < 5) {
															local868 = 0;
															local863 = 0;
														}
														local814.method403(local868 + local682, local863 + local691, 128);
														if (arg6 != -1) {
															@Pc(916) Class20 local916 = arg5[arg6 & 0xFFFF];
															local918 = Static128.anInt507;
															local920 = Static128.anInt510;
															if (local863 + local691 < local918 && local916.anInt1592 > 0) {
																local943 = (local918 - local863 - local691) * Static117.anInt3116 / 3;
																if (Static117.anInt3116 * 10 < local943) {
																	local943 = Static117.anInt3116 * 10;
																}
																if (local916.anInt1592 < local943) {
																	local943 = local916.anInt1592;
																}
																Static117.anInt3109 += local943;
																local916.anInt1592 -= local943;
																Static125.method2300(local916);
															}
															if (local920 < local863 + local691 + 32 && local916.anInt1592 < local916.anInt1563 - local916.anInt1603) {
																local943 = (local863 + local691 + 32 - local920) * Static117.anInt3116 / 3;
																if (local943 > Static117.anInt3116 * 10) {
																	local943 = Static117.anInt3116 * 10;
																}
																if (local943 > local916.anInt1563 - local916.anInt1592 - local916.anInt1603) {
																	local943 = local916.anInt1563 - local916.anInt1603 - local916.anInt1592;
																}
																local916.anInt1592 += local943;
																Static117.anInt3109 -= local943;
																Static125.method2300(local916);
															}
														}
													} else if (local27 == Static46.aClass20_3 && local295 == Static69.anInt1983) {
														local814.method403(local682, local691, 128);
													} else {
														local814.method422(local682, local691);
													}
												}
											} else if (local27.anIntArray167 != null && local295 < 20) {
												@Pc(729) Class1_Sub2_Sub1_Sub3 local729 = local27.method1228(local295);
												if (local729 != null) {
													local729.method422(local682, local691);
												} else if (Static29.aBoolean70) {
													Static125.method2300(local27);
												}
											}
											local295++;
										}
									}
								} else if (local27.anInt1619 == 3) {
									if (Static163.method2800(local27)) {
										local295 = local27.anInt1625;
										if (Static120.aClass20_9 == local27 && local27.anInt1629 != 0) {
											local295 = local27.anInt1629;
										}
									} else {
										local295 = local27.anInt1579;
										if (Static120.aClass20_9 == local27 && local27.anInt1584 != 0) {
											local295 = local27.anInt1584;
										}
									}
									if (local105 == 0) {
										if (local27.aBoolean126) {
											Static128.method565(local116, local111, local27.anInt1559, local27.anInt1603, local295);
										} else {
											Static128.method554(local116, local111, local27.anInt1559, local27.anInt1603, local295);
										}
									} else if (local27.aBoolean126) {
										Static128.method551(local116, local111, local27.anInt1559, local27.anInt1603, local295, 256 - (local105 & 0xFF));
									} else {
										Static128.method550(local116, local111, local27.anInt1559, local27.anInt1603, local295, 256 - (local105 & 0xFF));
									}
								} else {
									@Pc(1173) Class1_Sub2_Sub1_Sub1_Sub1 local1173;
									if (local27.anInt1619 == 4) {
										local1173 = local27.method1225(Static45.aClass1_Sub2_Sub1_Sub4Array7);
										if (local1173 != null) {
											@Pc(1185) Class13 local1185 = local27.aClass13_544;
											if (Static163.method2800(local27)) {
												local301 = local27.anInt1625;
												if (local27 == Static120.aClass20_9 && local27.anInt1629 != 0) {
													local301 = local27.anInt1629;
												}
												if (local27.aClass13_543.method904() > 0) {
													local1185 = local27.aClass13_543;
												}
											} else {
												local301 = local27.anInt1579;
												if (Static120.aClass20_9 == local27 && local27.anInt1584 != 0) {
													local301 = local27.anInt1584;
												}
											}
											if (local27.aBoolean118 && local27.anInt1564 != -1) {
												@Pc(1242) Class1_Sub2_Sub6 local1242 = Static184.method2994(local27.anInt1564);
												local1185 = local1242.aClass13_463;
												if (local1185 == null) {
													local1185 = Static4.aClass13_39;
												}
												if ((local1242.anInt1287 == 1 || local27.anInt1562 != 1) && local27.anInt1562 != -1) {
													local1185 = Static57.method1349(new Class13[] { Static185.aClass13_1419, local1185, Static103.aClass13_952, Static59.method1373(local27.anInt1562) });
												}
											}
											if (local27 == Static89.aClass20_7) {
												local1185 = Static66.aClass13_667;
												local301 = local27.anInt1579;
											}
											if (!local27.aBoolean118) {
												local1185 = Static125.method2299(local27, local1185);
											}
											local1173.method245(local1185, local116, local111, local27.anInt1559, local27.anInt1603, local301, local27.aBoolean121 ? 0 : -1, local27.anInt1612, local27.anInt1581, local27.anInt1628);
										} else if (Static29.aBoolean70) {
											Static125.method2300(local27);
										}
									} else if (local27.anInt1619 == 5) {
										@Pc(1346) Class1_Sub2_Sub1_Sub3 local1346;
										if (local27.aBoolean118) {
											if (local27.anInt1564 == -1) {
												local1346 = local27.method1227(false);
											} else {
												local1346 = Static143.method2548(false, local27.anInt1564, local27.anInt1566, local27.anInt1555, local27.anInt1562);
											}
											if (local1346 != null) {
												local301 = local1346.anInt354;
												local671 = local1346.anInt356;
												if (local27.aBoolean122) {
													Static128.method549(local116, local111, local116 + local27.anInt1559, local111 - -local27.anInt1603);
													local691 = (local671 + local27.anInt1603 - 1) / local671;
													local682 = (local301 + local27.anInt1559 - 1) / local301;
													for (local868 = 0; local868 < local682; local868++) {
														for (local863 = 0; local863 < local691; local863++) {
															if (local27.anInt1577 != 0) {
																local1346.method414(local301 / 2 + local116 + local301 * local868, local863 * local671 + (local111 - -(local671 / 2)), local27.anInt1577, 4096);
															} else if (local105 == 0) {
																local1346.method422(local116 + local868 * local301, local111 + local863 * local671);
															} else {
																local1346.method403(local301 * local868 + local116, local111 + local671 * local863, 256 - (local105 & 0xFF));
															}
														}
													}
													Static128.method553(arg2, arg1, arg4, arg7);
												} else {
													local682 = local27.anInt1559 * 4096 / local301;
													if (local27.anInt1577 != 0) {
														local1346.method414(local27.anInt1559 / 2 + local116, local111 - -(local27.anInt1603 / 2), local27.anInt1577, local682);
													} else if (local105 != 0) {
														local1346.method408(local116, local111, local27.anInt1559, local27.anInt1603, 256 - (local105 & 0xFF));
													} else if (local27.anInt1559 == local301 && local27.anInt1603 == local671) {
														local1346.method422(local116, local111);
													} else {
														local1346.method413(local116, local111, local27.anInt1559, local27.anInt1603);
													}
												}
											} else if (Static29.aBoolean70) {
												Static125.method2300(local27);
											}
										} else {
											local1346 = local27.method1227(Static163.method2800(local27));
											if (local1346 != null) {
												local1346.method422(local116, local111);
											} else if (Static29.aBoolean70) {
												Static125.method2300(local27);
											}
										}
									} else {
										@Pc(1637) Class1_Sub2_Sub6 local1637;
										if (local27.anInt1619 == 6) {
											@Pc(1614) boolean local1614 = Static163.method2800(local27);
											if (local1614) {
												local301 = local27.anInt1610;
											} else {
												local301 = local27.anInt1588;
											}
											@Pc(1626) Class1_Sub2_Sub2_Sub5 local1626 = null;
											local682 = 0;
											if (local27.anInt1564 != -1) {
												local1637 = Static184.method2994(local27.anInt1564);
												if (local1637 != null) {
													local1637 = local1637.method1063(local27.anInt1562);
													local1626 = local1637.method1060(1, 0, null);
													if (local1626 == null) {
														Static125.method2300(local27);
													} else {
														local1626.method2714();
														local682 = -local1626.aShort27 / 2;
													}
												}
											} else if (local27.anInt1595 == 5) {
												if (local27.anInt1556 == -1) {
													local1626 = Static35.aClass6_1.method635(null, -1, null, -1);
												} else {
													local691 = local27.anInt1556 & 0x7FF;
													if (local691 == Static26.anInt947) {
														local691 = 2047;
													}
													@Pc(1704) Class1_Sub2_Sub2_Sub2_Sub2 local1704 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[local691];
													@Pc(1713) Class1_Sub2_Sub8 local1713 = local301 == -1 ? null : Static142.method2538(local301);
													if (local1704 != null && (int) local1704.aClass13_847.method878() << 11 == (local27.anInt1556 & 0xFFFFF800)) {
														local1626 = local1704.aClass6_2.method635(local1713, 0, null, local27.anInt1553);
													}
												}
											} else if (local301 == -1) {
												local1626 = local27.method1241(-1, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.aClass6_2, null, local1614);
												if (local1626 == null && Static29.aBoolean70) {
													Static125.method2300(local27);
												}
											} else {
												@Pc(1767) Class1_Sub2_Sub8 local1767 = Static142.method2538(local301);
												local1626 = local27.method1241(local27.anInt1553, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.aClass6_2, local1767, local1614);
												if (local1626 == null && Static29.aBoolean70) {
													Static125.method2300(local27);
												}
											}
											if (local1626 != null) {
												Static9.method354(local27.anInt1559 / 2 + local116 + local27.anInt1615, local27.anInt1627 + local111 + local27.anInt1603 / 2);
												local691 = Class1_Sub2_Sub1_Sub2.anIntArray41[local27.anInt1589] * local27.anInt1560 >> 16;
												local868 = Class1_Sub2_Sub1_Sub2.anIntArray38[local27.anInt1589] * local27.anInt1560 >> 16;
												if (!local27.aBoolean118) {
													local1626.method2723(local27.anInt1600, 0, local27.anInt1589, 0, local691, local868);
												} else if (local27.aBoolean117) {
													local1626.method2725(local27.anInt1600, local27.anInt1606, local27.anInt1589, local27.anInt1583, local682 + local691 + local27.anInt1590, local868 + local27.anInt1590, local27.anInt1560);
												} else {
													local1626.method2723(local27.anInt1600, local27.anInt1606, local27.anInt1589, local27.anInt1583, local691 + local682 + local27.anInt1590, local27.anInt1590 + local868);
												}
												Static9.method349();
											}
										} else {
											if (local27.anInt1619 == 7) {
												local1173 = local27.method1225(Static45.aClass1_Sub2_Sub1_Sub4Array7);
												if (local1173 == null) {
													if (Static29.aBoolean70) {
														Static125.method2300(local27);
													}
													continue;
												}
												local301 = 0;
												for (local671 = 0; local671 < local27.anInt1603; local671++) {
													for (local682 = 0; local682 < local27.anInt1559; local682++) {
														if (local27.anIntArray168[local301] > 0) {
															local1637 = Static184.method2994(local27.anIntArray168[local301] - 1);
															@Pc(1968) Class13 local1968;
															if (local1637.anInt1287 != 1 && local27.anIntArray163[local301] == 1) {
																local1968 = Static57.method1349(new Class13[] { Static185.aClass13_1419, local1637.aClass13_463, Static56.aClass13_606 });
															} else {
																local1968 = Static57.method1349(new Class13[] { Static185.aClass13_1419, local1637.aClass13_463, Static103.aClass13_952, Static59.method1373(local27.anIntArray163[local301]) });
															}
															local863 = local682 * (local27.anInt1617 + 115) + local116;
															local755 = (local27.anInt1591 + 12) * local671 + local111;
															if (local27.anInt1612 == 0) {
																local1173.method254(local1968, local863, local755, local27.anInt1579, local27.aBoolean121 ? 0 : -1);
															} else if (local27.anInt1612 == 1) {
																local1173.method258(local1968, local27.anInt1559 / 2 + local863, local755, local27.anInt1579, local27.aBoolean121 ? 0 : -1);
															} else {
																local1173.method255(local1968, local27.anInt1559 + local863 - 1, local755, local27.anInt1579, local27.aBoolean121 ? 0 : -1);
															}
														}
														local301++;
													}
												}
											}
											@Pc(2274) int local2274;
											if (local27.anInt1619 == 8 && local27 == Static145.aClass20_10 && Static144.anInt3536 == Static104.anInt2872) {
												local295 = 0;
												@Pc(2116) Class1_Sub2_Sub1_Sub1_Sub1 local2116 = Static22.aClass1_Sub2_Sub1_Sub1_Sub1_5;
												local301 = 0;
												@Pc(2121) Class13 local2121 = local27.aClass13_544;
												local2121 = Static125.method2299(local27, local2121);
												@Pc(2142) Class13 local2142;
												while (local2121.method904() > 0) {
													local868 = local2121.method884(Static170.aClass13_1318);
													if (local868 == -1) {
														local2142 = local2121;
														local2121 = Static16.aClass13_253;
													} else {
														local2142 = local2121.method883(0, local868);
														local2121 = local2121.method901(local868 + 4);
													}
													local863 = local2116.method246(local2142);
													local301 += local2116.anInt225 + 1;
													if (local863 > local295) {
														local295 = local863;
													}
												}
												local295 += 6;
												local301 += 7;
												local868 = local116 + local27.anInt1559 - local295 - 5;
												if (local868 < local116 + 5) {
													local868 = local116 + 5;
												}
												if (local295 + local868 > arg4) {
													local868 = arg4 - local295;
												}
												local863 = local27.anInt1603 + local111 + 5;
												if (local863 + local301 > arg7) {
													local863 = arg7 - local301;
												}
												Static128.method565(local868, local863, local295, local301, 16777120);
												Static128.method554(local868, local863, local295, local301, 0);
												local2121 = local27.aClass13_544;
												local755 = local863 + local2116.anInt225 + 2;
												local2121 = Static125.method2299(local27, local2121);
												while (local2121.method904() > 0) {
													local2274 = local2121.method884(Static170.aClass13_1318);
													if (local2274 == -1) {
														local2142 = local2121;
														local2121 = Static16.aClass13_253;
													} else {
														local2142 = local2121.method883(0, local2274);
														local2121 = local2121.method901(local2274 + 4);
													}
													local2116.method254(local2142, local868 + 3, local755, 0, -1);
													local755 += local2116.anInt225 + 1;
												}
											}
											if (local27.anInt1619 == 9) {
												if (local27.anInt1597 == 1) {
													Static128.method560(local116, local111, local116 + local27.anInt1559, local27.anInt1603 + local111, local27.anInt1579);
												} else {
													local295 = local27.anInt1559 >= 0 ? local27.anInt1559 : -local27.anInt1559;
													local301 = local27.anInt1603 < 0 ? -local27.anInt1603 : local27.anInt1603;
													local671 = local295;
													if (local301 > local295) {
														local671 = local301;
													}
													if (local671 != 0) {
														local682 = (local27.anInt1559 << 16) / local671;
														local691 = (local27.anInt1603 << 16) / local671;
														if (local691 > local682) {
															local691 = -local691;
														} else {
															local682 = -local682;
														}
														local2274 = local682 * local27.anInt1597 + 1 >> 17;
														local755 = local682 * local27.anInt1597 >> 17;
														local868 = local691 * local27.anInt1597 >> 17;
														@Pc(2433) int local2433 = local116 - arg2;
														local863 = local27.anInt1597 * local691 + 1 >> 17;
														local918 = local111 - arg1;
														local920 = local868 + local2433;
														local943 = local2433 - local863;
														@Pc(2463) int local2463 = local868 + local27.anInt1559 + local2433;
														@Pc(2467) int local2467 = local755 + local918;
														@Pc(2475) int local2475 = local27.anInt1559 + local2433 - local863;
														@Pc(2483) int local2483 = local918 + local27.anInt1603 - local2274;
														@Pc(2491) int local2491 = local27.anInt1603 + local918 + local755;
														Static9.method350(local920, local943, local2475);
														@Pc(2500) int local2500 = local918 - local2274;
														Static9.method357(local2467, local2500, local2483, local920, local943, local2475, local27.anInt1579);
														Static9.method350(local920, local2475, local2463);
														Static9.method357(local2467, local2483, local2491, local920, local2475, local2463, local27.anInt1579);
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

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V")
	public static void method1895() {
		Static166.aClass47_29.method1995();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII)V")
	public static void method1896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static116.anInt3103 == 0 && !Static118.aBoolean233) {
			Static12.method462(arg3 - arg1, Static16.aClass13_253, Static17.aClass13_263, (short) 4, arg0 - arg2, 0L);
		}
		@Pc(31) long local31 = -1L;
		for (@Pc(33) int local33 = 0; local33 < Static72.anInt3748; local33++) {
			@Pc(39) long local39 = Static72.aLongArray9[local33];
			@Pc(44) int local44 = (int) local39 & 0x7F;
			@Pc(51) int local51 = (int) local39 >> 29 & 0x3;
			@Pc(58) int local58 = (int) local39 >> 7 & 0x7F;
			@Pc(65) int local65 = (int) (local39 >>> 32) & Integer.MAX_VALUE;
			if (local31 != local39) {
				local31 = local39;
				@Pc(154) int local154;
				if (local51 == 2 && Static96.method1990(Static156.anInt3696, local44, local58, local39)) {
					@Pc(86) Class1_Sub2_Sub14 local86 = Static4.method79(local65);
					if (local86.anIntArray326 != null) {
						local86 = local86.method2385();
					}
					if (local86 == null) {
						continue;
					}
					if (Static116.anInt3103 == 1) {
						Static12.method462(local58, Static57.method1349(new Class13[] { Static141.aClass13_1202, Static164.aClass13_1333, local86.aClass13_1114 }), Static57.aClass13_608, (short) 57, local44, local39);
					} else if (!Static118.aBoolean233) {
						@Pc(140) Class13[] local140 = local86.aClass13Array23;
						if (Static7.aBoolean235) {
							local140 = Static176.method2935(local140);
						}
						if (local140 != null) {
							for (local154 = 4; local154 >= 0; local154--) {
								if (local140[local154] != null) {
									@Pc(166) short local166 = 0;
									if (local154 == 0) {
										local166 = 35;
									}
									if (local154 == 1) {
										local166 = 48;
									}
									if (local154 == 2) {
										local166 = 15;
									}
									if (local154 == 3) {
										local166 = 14;
									}
									if (local154 == 4) {
										local166 = 1003;
									}
									Static12.method462(local58, Static57.method1349(new Class13[] { Static112.aClass13_1019, local86.aClass13_1114 }), local140[local154], local166, local44, local39);
								}
							}
						}
						Static12.method462(local58, Static57.method1349(new Class13[] { Static112.aClass13_1019, local86.aClass13_1114 }), Static46.aClass13_529, (short) 1002, local44, (long) local86.anInt3329);
					} else if ((Static111.anInt3019 & 0x4) == 4) {
						Static12.method462(local58, Static57.method1349(new Class13[] { Static147.aClass13_1236, Static164.aClass13_1333, local86.aClass13_1114 }), Static113.aClass13_1022, (short) 40, local44, local39);
					}
				}
				@Pc(303) int local303;
				@Pc(311) Class1_Sub2_Sub2_Sub2_Sub1 local311;
				@Pc(358) Class1_Sub2_Sub2_Sub2_Sub2 local358;
				if (local51 == 1) {
					@Pc(280) Class1_Sub2_Sub2_Sub2_Sub1 local280 = Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[local65];
					if (local280.aClass1_Sub2_Sub19_1.anInt3836 == 1 && (local280.anInt2596 & 0x7F) == 64 && (local280.anInt2606 & 0x7F) == 64) {
						for (local303 = 0; local303 < Static74.anInt2127; local303++) {
							local311 = Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[Static66.anIntArray202[local303]];
							if (local311 != null && local280 != local311 && local311.aClass1_Sub2_Sub19_1.anInt3836 == 1 && local311.anInt2596 == local280.anInt2596 && local280.anInt2606 == local311.anInt2606) {
								Static73.method1542(local58, local311.aClass1_Sub2_Sub19_1, local44, Static66.anIntArray202[local303]);
							}
						}
						for (local154 = 0; local154 < Static65.anInt1929; local154++) {
							local358 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[Static30.anIntArray116[local154]];
							if (local358 != null && local358.anInt2596 == local280.anInt2596 && local358.anInt2606 == local280.anInt2606) {
								Static58.method1372(Static30.anIntArray116[local154], local58, local358, local44);
							}
						}
					}
					Static73.method1542(local58, local280.aClass1_Sub2_Sub19_1, local44, local65);
				}
				if (local51 == 0) {
					@Pc(406) Class1_Sub2_Sub2_Sub2_Sub2 local406 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[local65];
					if ((local406.anInt2596 & 0x7F) == 64 && (local406.anInt2606 & 0x7F) == 64) {
						for (local303 = 0; local303 < Static74.anInt2127; local303++) {
							local311 = Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[Static66.anIntArray202[local303]];
							if (local311 != null && local311.aClass1_Sub2_Sub19_1.anInt3836 == 1 && local311.anInt2596 == local406.anInt2596 && local311.anInt2606 == local406.anInt2606) {
								Static73.method1542(local58, local311.aClass1_Sub2_Sub19_1, local44, Static66.anIntArray202[local303]);
							}
						}
						for (local154 = 0; local154 < Static65.anInt1929; local154++) {
							local358 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[Static30.anIntArray116[local154]];
							if (local358 != null && local406 != local358 && local358.anInt2596 == local406.anInt2596 && local406.anInt2606 == local358.anInt2606) {
								Static58.method1372(Static30.anIntArray116[local154], local58, local358, local44);
							}
						}
					}
					Static58.method1372(local65, local58, local406, local44);
				}
				if (local51 == 3) {
					@Pc(522) Class82 local522 = Static131.aClass82ArrayArrayArray1[Static156.anInt3696][local44][local58];
					if (local522 != null) {
						for (@Pc(529) Class1_Sub2_Sub2_Sub7 local529 = (Class1_Sub2_Sub2_Sub7) local522.method2858(); local529 != null; local529 = (Class1_Sub2_Sub2_Sub7) local522.method2848()) {
							@Pc(536) Class1_Sub2_Sub6 local536 = Static184.method2994(local529.anInt3717);
							if (Static116.anInt3103 == 1) {
								Static12.method462(local58, Static57.method1349(new Class13[] { Static141.aClass13_1202, Static132.aClass13_1117, local536.aClass13_463 }), Static57.aClass13_608, (short) 11, local44, (long) local529.anInt3717);
							} else if (!Static118.aBoolean233) {
								@Pc(584) Class13[] local584 = local536.aClass13Array8;
								if (Static7.aBoolean235) {
									local584 = Static176.method2935(local584);
								}
								for (@Pc(592) int local592 = 4; local592 >= 0; local592--) {
									if (local584 != null && local584[local592] != null) {
										@Pc(639) byte local639 = 0;
										if (local592 == 0) {
											local639 = 49;
										}
										if (local592 == 1) {
											local639 = 19;
										}
										if (local592 == 2) {
											local639 = 21;
										}
										if (local592 == 3) {
											local639 = 46;
										}
										if (local592 == 4) {
											local639 = 18;
										}
										Static12.method462(local58, Static57.method1349(new Class13[] { Static185.aClass13_1419, local536.aClass13_463 }), local584[local592], local639, local44, (long) local529.anInt3717);
									} else if (local592 == 2) {
										Static12.method462(local58, Static57.method1349(new Class13[] { Static185.aClass13_1419, local536.aClass13_463 }), Static62.aClass13_844, (short) 21, local44, (long) local529.anInt3717);
									}
								}
								Static12.method462(local58, Static57.method1349(new Class13[] { Static185.aClass13_1419, local536.aClass13_463 }), Static46.aClass13_529, (short) 1005, local44, (long) local529.anInt3717);
							} else if ((Static111.anInt3019 & 0x1) == 1) {
								Static12.method462(local58, Static57.method1349(new Class13[] { Static147.aClass13_1236, Static132.aClass13_1117, local536.aClass13_463 }), Static113.aClass13_1022, (short) 41, local44, (long) local529.anInt3717);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)V")
	public static void method1897() {
		if (Static37.aClass20_2 != null || Static162.aClass20_11 != null) {
			return;
		}
		@Pc(17) int local17 = Static109.anInt2976;
		@Pc(92) int local92;
		@Pc(86) int local86;
		if (Static46.aBoolean106) {
			@Pc(180) int local180;
			if (local17 != 1) {
				local180 = Static14.anInt481;
				local92 = Static86.anInt2447;
				if (local180 < Static85.anInt2436 - 10 || local180 > Static51.anInt1676 + Static85.anInt2436 + 10 || local92 < Static101.anInt2829 - 10 || local92 > Static164.anInt3861 + Static101.anInt2829 + 10) {
					Static46.aBoolean106 = false;
					Static186.method3019(Static164.anInt3861, Static51.anInt1676, Static85.anInt2436, Static101.anInt2829);
				}
			}
			if (local17 != 1) {
				return;
			}
			local180 = Static85.anInt2436;
			local86 = Static51.anInt1676;
			local92 = Static101.anInt2829;
			@Pc(239) int local239 = Static122.anInt3191;
			@Pc(241) int local241 = -1;
			@Pc(243) int local243 = Static8.anInt293;
			for (@Pc(245) int local245 = 0; local245 < Static53.anInt1722; local245++) {
				@Pc(259) int local259 = (Static53.anInt1722 - local245 - 1) * 15 + local92 + 31;
				if (local180 < local239 && local180 + local86 > local239 && local243 > local259 - 13 && local259 + 3 > local243) {
					local241 = local245;
				}
			}
			if (local241 != -1) {
				Static17.method651(local241);
			}
			Static46.aBoolean106 = false;
			Static186.method3019(Static164.anInt3861, Static51.anInt1676, Static85.anInt2436, Static101.anInt2829);
			return;
		}
		if (local17 == 1 && Static53.anInt1722 > 0) {
			@Pc(30) short local30 = Static147.aShortArray41[Static53.anInt1722 - 1];
			if (local30 == 13 || local30 == 44 || local30 == 42 || local30 == 51 || local30 == 38 || local30 == 9 || local30 == 8 || local30 == 5 || local30 == 10 || local30 == 28 || local30 == 25 || local30 == 1004) {
				local86 = Static65.anIntArray199[Static53.anInt1722 - 1];
				local92 = Static29.anIntArray115[Static53.anInt1722 - 1];
				@Pc(96) Class20 local96 = Static119.method2230(local86);
				if (Static111.method2161(Static53.method1292(local96)) || Static17.method653(Static53.method1292(local96))) {
					Static38.aBoolean80 = false;
					Static93.anInt2713 = 0;
					if (Static37.aClass20_2 != null) {
						Static125.method2300(Static37.aClass20_2);
					}
					Static37.aClass20_2 = Static119.method2230(local86);
					Static179.anInt4049 = Static122.anInt3191;
					Static171.anInt3964 = local92;
					Static117.anInt3109 = Static8.anInt293;
					Static125.method2300(Static37.aClass20_2);
					return;
				}
			}
		}
		if (local17 == 1 && (Static187.anInt4123 == 1 && Static53.anInt1722 > 2 || Static145.method2574(Static53.anInt1722 - 1))) {
			local17 = 2;
		}
		if (local17 == 1 && Static53.anInt1722 > 0) {
			Static17.method651(Static53.anInt1722 - 1);
		}
		if (local17 == 2 && Static53.anInt1722 > 0) {
			Static69.method1458();
			return;
		}
	}
}
