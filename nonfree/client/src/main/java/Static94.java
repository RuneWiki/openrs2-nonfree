import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!jj", name = "t", descriptor = "[I")
	public static int[] anIntArray191;

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_742 = Static161.method2452("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "Lclient!oa;")
	public static Class75 aClass75_10 = new Class75(512);

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_744 = Static161.method2452("Loaded input handler");

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "Lclient!dc;")
	public static Class20 aClass20_743 = aClass20_744;

	@OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
	public static int anInt2005 = 0;

	@OriginalMember(owner = "client!jj", name = "v", descriptor = "I")
	public static int anInt2006 = 0;

	@OriginalMember(owner = "client!jj", name = "w", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_745 = Static161.method2452(":trade:");

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!mf;I)I")
	public static int method1538(@OriginalArg(0) Class69 arg0) {
		@Pc(22) Class5_Sub20 local22 = (Class5_Sub20) aClass75_10.method2072((long) arg0.anInt2475 + ((long) arg0.anInt2523 << 32));
		return local22 == null ? arg0.anInt2497 : local22.anInt2605;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V")
	public static void method1539() {
		Static37.anIntArrayArrayArray5 = Static68.anIntArrayArrayArray6;
		Static157.aClass5_Sub3ArrayArrayArray2 = Static169.aClass5_Sub3ArrayArrayArray3;
		Static83.anInt1853 = Static157.aClass5_Sub3ArrayArrayArray2.length;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIII[Lclient!mf;IIII)V")
	public static void method1540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class69[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(11) int local11 = 0; local11 < arg4.length; local11++) {
			@Pc(17) Class69 local17 = arg4[local11];
			if (local17 != null && (!local17.aBoolean103 || local17.anInt2474 == 0 || local17.aBoolean111 || method1538(local17) != 0 || local17 == Static119.aClass69_9 || local17.anInt2550 == 1338) && local17.anInt2498 == arg0 && (!local17.aBoolean103 || !Static23.method326(local17))) {
				@Pc(64) int local64 = arg7 + local17.anInt2536;
				@Pc(69) int local69 = arg1 + local17.anInt2539;
				@Pc(93) int local93;
				@Pc(82) int local82;
				@Pc(125) int local125;
				@Pc(118) int local118;
				if (local17.anInt2474 == 2) {
					local93 = arg3;
					local82 = arg6;
					local125 = arg2;
					local118 = arg5;
				} else {
					local82 = arg6 >= local69 ? arg6 : local69;
					local93 = arg3 < local64 ? local64 : arg3;
					@Pc(98) int local98 = local17.anInt2541 + local64;
					@Pc(103) int local103 = local69 + local17.anInt2471;
					if (local17.anInt2474 == 9) {
						local103++;
						local98++;
					}
					local118 = arg5 <= local103 ? arg5 : local103;
					local125 = local98 < arg2 ? local98 : arg2;
				}
				if (Static48.aClass69_4 == local17) {
					Static38.anInt831 = local64;
					Static217.aBoolean190 = true;
					Static207.anInt4074 = local69;
				}
				if (!local17.aBoolean103 || local125 > local93 && local82 < local118) {
					if (local17.anInt2474 == 0) {
						if (!local17.aBoolean103 && Static23.method326(local17) && Static86.aClass69_6 != local17) {
							continue;
						}
						if (local17.aBoolean116 && local93 <= Static70.anInt1549 && local82 <= Static207.anInt4069 && local125 > Static70.anInt1549 && Static207.anInt4069 < local118) {
							for (@Pc(200) Class5_Sub10 local200 = (Class5_Sub10) Static54.aClass91_8.method2684(); local200 != null; local200 = (Class5_Sub10) Static54.aClass91_8.method2678()) {
								if (local200.aBoolean61) {
									local200.method3207();
								}
							}
							for (@Pc(220) Class5_Sub10 local220 = (Class5_Sub10) Static11.aClass91_2.method2684(); local220 != null; local220 = (Class5_Sub10) Static11.aClass91_2.method2678()) {
								if (local220.aBoolean61) {
									local220.method3207();
								}
							}
							if (Static37.anInt1355 == 0) {
								Static48.aClass69_4 = null;
								Static119.aClass69_9 = null;
							}
							Static27.aBoolean23 = false;
						}
					}
					if (local17.aBoolean103) {
						@Pc(251) boolean local251 = false;
						@Pc(253) boolean local253 = false;
						@Pc(271) boolean local271;
						if (Static70.anInt1549 >= local93 && Static207.anInt4069 >= local82 && local125 > Static70.anInt1549 && local118 > Static207.anInt4069) {
							local271 = true;
						} else {
							local271 = false;
						}
						if (Static85.anInt1876 == 1 && Static179.anInt3572 >= local93 && local82 <= Static175.anInt3521 && local125 > Static179.anInt3572 && Static175.anInt3521 < local118) {
							local251 = true;
						}
						if (Static18.anInt352 == 1 && local271) {
							local253 = true;
						}
						if (local251) {
							Static3.method99(local17, Static175.anInt3521 - local69, -local64 + Static179.anInt3572);
						}
						if (Static48.aClass69_4 != null && local17 != Static48.aClass69_4 && local271 && Static91.method1511(method1538(local17))) {
							Static175.aClass69_13 = local17;
						}
						if (local17 == Static119.aClass69_9) {
							Static119.anInt2513 = local69;
							Static143.aBoolean128 = true;
							Static95.anInt2011 = local64;
						}
						if (local17.aBoolean111 || local17.anInt2550 != 0) {
							@Pc(368) Class5_Sub10 local368;
							if (local271 && Static95.anInt2009 != 0 && local17.anObjectArray15 != null) {
								local368 = new Class5_Sub10();
								local368.anObjectArray3 = local17.anObjectArray15;
								local368.anInt1026 = Static95.anInt2009;
								local368.aClass69_3 = local17;
								local368.aBoolean61 = true;
								Static54.aClass91_8.method2686(local368);
							}
							if (Static48.aClass69_4 != null || Static101.aClass69_7 != null || Static104.aBoolean95 || local17.anInt2550 != 1400 && Static27.aBoolean23) {
								local253 = false;
								local271 = false;
								local251 = false;
							}
							if (local17.anInt2550 == 1337) {
								Static184.method2779(local17);
								continue;
							}
							if (local17.anInt2550 == 1338) {
								if (local251) {
									Static185.method2812(Static175.anInt3521 - local69, Static179.anInt3572 + -local64, local17);
								}
								continue;
							}
							@Pc(493) int local493;
							@Pc(468) int local468;
							if (local17.anInt2550 == 1400) {
								Static122.aClass69_11 = local17;
								if (local251) {
									if (Static201.aBooleanArray22[82] && Static80.anInt1803 > 0) {
										local468 = Static212.anInt4113 + (int) ((double) (Static179.anInt3572 - local17.anInt2541 / 2 - local64) * 2.0D / Static216.aDouble11) + Static207.anInt4070;
										local493 = Static59.anInt1331 + Static165.anInt2257 - Static18.anInt354 - (int) ((double) (Static175.anInt3521 - local69 - local17.anInt2471 / 2) * 2.0D / Static216.aDouble11);
										@Pc(546) Class20 local546 = Static70.method1166(new Class20[] { Static105.aClass20_813, Static132.method2805(local468 >> 6), Static192.aClass20_1405, Static132.method2805(local493 >> 6), Static192.aClass20_1405, Static132.method2805(local468 & 0x3F), Static192.aClass20_1405, Static132.method2805(local493 & 0x3F) });
										local546.method569();
										Static104.method1712(local546);
										Static26.method3045();
										continue;
									}
									Static27.aBoolean23 = true;
									Static65.anInt1420 = Static70.anInt1549;
									Static140.anInt2922 = Static207.anInt4069;
									Static110.anInt2296 = Static18.anInt354;
									Static153.anInt3121 = Static212.anInt4113;
									continue;
								}
								if (local253 && Static27.aBoolean23) {
									Static62.method1031((int) ((double) (Static65.anInt1420 - Static70.anInt1549) * 2.0D / Static29.aDouble1) + Static153.anInt3121);
									Static174.method2651((int) ((double) (Static140.anInt2922 - Static207.anInt4069) * 2.0D / Static29.aDouble1) + Static110.anInt2296);
									continue;
								}
								Static27.aBoolean23 = false;
								continue;
							}
							if (local17.anInt2550 == 1401) {
								if (local253) {
									Static165.method1747(Static207.anInt4069 - local69, local17.anInt2471, Static70.anInt1549 - local64, local17.anInt2541);
								}
								continue;
							}
							if (!local17.aBoolean105 && local251) {
								local17.aBoolean105 = true;
								if (local17.anObjectArray6 != null) {
									local368 = new Class5_Sub10();
									local368.anInt1028 = Static179.anInt3572 - local64;
									local368.anObjectArray3 = local17.anObjectArray6;
									local368.aBoolean61 = true;
									local368.anInt1026 = Static175.anInt3521 - local69;
									local368.aClass69_3 = local17;
									Static54.aClass91_8.method2686(local368);
								}
							}
							if (local17.aBoolean105 && local253 && local17.anObjectArray23 != null) {
								local368 = new Class5_Sub10();
								local368.aClass69_3 = local17;
								local368.anInt1028 = Static70.anInt1549 - local64;
								local368.anObjectArray3 = local17.anObjectArray23;
								local368.anInt1026 = Static207.anInt4069 - local69;
								local368.aBoolean61 = true;
								Static54.aClass91_8.method2686(local368);
							}
							if (local17.aBoolean105 && !local253) {
								local17.aBoolean105 = false;
								if (local17.anObjectArray10 != null) {
									local368 = new Class5_Sub10();
									local368.anObjectArray3 = local17.anObjectArray10;
									local368.aBoolean61 = true;
									local368.anInt1026 = Static207.anInt4069 - local69;
									local368.aClass69_3 = local17;
									local368.anInt1028 = Static70.anInt1549 - local64;
									Static11.aClass91_2.method2686(local368);
								}
							}
							if (local253 && local17.anObjectArray9 != null) {
								local368 = new Class5_Sub10();
								local368.anObjectArray3 = local17.anObjectArray9;
								local368.aBoolean61 = true;
								local368.anInt1026 = Static207.anInt4069 - local69;
								local368.aClass69_3 = local17;
								local368.anInt1028 = Static70.anInt1549 - local64;
								Static54.aClass91_8.method2686(local368);
							}
							if (!local17.aBoolean113 && local271) {
								local17.aBoolean113 = true;
								if (local17.anObjectArray14 != null) {
									local368 = new Class5_Sub10();
									local368.anInt1028 = Static70.anInt1549 - local64;
									local368.anInt1026 = Static207.anInt4069 - local69;
									local368.anObjectArray3 = local17.anObjectArray14;
									local368.aBoolean61 = true;
									local368.aClass69_3 = local17;
									Static54.aClass91_8.method2686(local368);
								}
							}
							if (local17.aBoolean113 && local271 && local17.anObjectArray5 != null) {
								local368 = new Class5_Sub10();
								local368.anObjectArray3 = local17.anObjectArray5;
								local368.anInt1026 = Static207.anInt4069 - local69;
								local368.anInt1028 = Static70.anInt1549 - local64;
								local368.aClass69_3 = local17;
								local368.aBoolean61 = true;
								Static54.aClass91_8.method2686(local368);
							}
							if (local17.aBoolean113 && !local271) {
								local17.aBoolean113 = false;
								if (local17.anObjectArray21 != null) {
									local368 = new Class5_Sub10();
									local368.anObjectArray3 = local17.anObjectArray21;
									local368.anInt1026 = Static207.anInt4069 - local69;
									local368.anInt1028 = Static70.anInt1549 - local64;
									local368.aClass69_3 = local17;
									local368.aBoolean61 = true;
									Static11.aClass91_2.method2686(local368);
								}
							}
							if (local17.anObjectArray4 != null) {
								local368 = new Class5_Sub10();
								local368.aClass69_3 = local17;
								local368.anObjectArray3 = local17.anObjectArray4;
								Static23.aClass91_4.method2686(local368);
							}
							@Pc(949) int local949;
							@Pc(961) Class5_Sub10 local961;
							if (local17.anObjectArray16 != null && local17.anInt2489 < Static138.anInt3859) {
								if (local17.anIntArray285 == null || Static138.anInt3859 - local17.anInt2489 > 32) {
									local368 = new Class5_Sub10();
									local368.anObjectArray3 = local17.anObjectArray16;
									local368.aClass69_3 = local17;
									Static54.aClass91_8.method2686(local368);
								} else {
									label426: for (local468 = local17.anInt2489; local468 < Static138.anInt3859; local468++) {
										local493 = Static100.anIntArray211[local468 & 0x1F];
										for (local949 = 0; local949 < local17.anIntArray285.length; local949++) {
											if (local17.anIntArray285[local949] == local493) {
												local961 = new Class5_Sub10();
												local961.aClass69_3 = local17;
												local961.anObjectArray3 = local17.anObjectArray16;
												Static54.aClass91_8.method2686(local961);
												break label426;
											}
										}
									}
								}
								local17.anInt2489 = Static138.anInt3859;
							}
							if (local17.anObjectArray13 != null && Static121.anInt2574 > local17.anInt2503) {
								if (local17.anIntArray281 == null || Static121.anInt2574 - local17.anInt2503 > 32) {
									local368 = new Class5_Sub10();
									local368.anObjectArray3 = local17.anObjectArray13;
									local368.aClass69_3 = local17;
									Static54.aClass91_8.method2686(local368);
								} else {
									label402: for (local468 = local17.anInt2503; local468 < Static121.anInt2574; local468++) {
										local493 = Static159.anIntArray348[local468 & 0x1F];
										for (local949 = 0; local949 < local17.anIntArray281.length; local949++) {
											if (local17.anIntArray281[local949] == local493) {
												local961 = new Class5_Sub10();
												local961.aClass69_3 = local17;
												local961.anObjectArray3 = local17.anObjectArray13;
												Static54.aClass91_8.method2686(local961);
												break label402;
											}
										}
									}
								}
								local17.anInt2503 = Static121.anInt2574;
							}
							if (local17.anObjectArray12 != null && local17.anInt2521 < Static177.anInt3542) {
								if (local17.anIntArray284 == null || Static177.anInt3542 - local17.anInt2521 > 32) {
									local368 = new Class5_Sub10();
									local368.aClass69_3 = local17;
									local368.anObjectArray3 = local17.anObjectArray12;
									Static54.aClass91_8.method2686(local368);
								} else {
									label378: for (local468 = local17.anInt2521; local468 < Static177.anInt3542; local468++) {
										local493 = Static153.anIntArray339[local468 & 0x1F];
										for (local949 = 0; local949 < local17.anIntArray284.length; local949++) {
											if (local17.anIntArray284[local949] == local493) {
												local961 = new Class5_Sub10();
												local961.anObjectArray3 = local17.anObjectArray12;
												local961.aClass69_3 = local17;
												Static54.aClass91_8.method2686(local961);
												break label378;
											}
										}
									}
								}
								local17.anInt2521 = Static177.anInt3542;
							}
							if (local17.anInt2491 < Static195.anInt3812 && local17.anObjectArray19 != null) {
								local368 = new Class5_Sub10();
								local368.aClass69_3 = local17;
								local368.anObjectArray3 = local17.anObjectArray19;
								Static54.aClass91_8.method2686(local368);
							}
							if (local17.anInt2491 < Static148.anInt3054 && local17.anObjectArray25 != null) {
								local368 = new Class5_Sub10();
								local368.anObjectArray3 = local17.anObjectArray25;
								local368.aClass69_3 = local17;
								Static54.aClass91_8.method2686(local368);
							}
							if (local17.anInt2491 < Static173.anInt3465 && local17.anObjectArray29 != null) {
								local368 = new Class5_Sub10();
								local368.aClass69_3 = local17;
								local368.anObjectArray3 = local17.anObjectArray29;
								Static54.aClass91_8.method2686(local368);
							}
							if (Static82.anInt1815 > local17.anInt2491 && local17.anObjectArray22 != null) {
								local368 = new Class5_Sub10();
								local368.anObjectArray3 = local17.anObjectArray22;
								local368.aClass69_3 = local17;
								Static54.aClass91_8.method2686(local368);
							}
							if (local17.anInt2491 < Static173.anInt3462 && local17.anObjectArray24 != null) {
								local368 = new Class5_Sub10();
								local368.anObjectArray3 = local17.anObjectArray24;
								local368.aClass69_3 = local17;
								Static54.aClass91_8.method2686(local368);
							}
							local17.anInt2491 = Static98.anInt2085;
							if (local17.anObjectArray17 != null) {
								for (local468 = 0; local468 < Static165.anInt2227; local468++) {
									@Pc(1324) Class5_Sub10 local1324 = new Class5_Sub10();
									local1324.aClass69_3 = local17;
									local1324.anInt1027 = Static45.anIntArray95[local468];
									local1324.anInt1029 = Static37.anIntArray127[local468];
									local1324.anObjectArray3 = local17.anObjectArray17;
									Static54.aClass91_8.method2686(local1324);
								}
							}
						}
					}
					if (!local17.aBoolean103 && Static48.aClass69_4 == null && Static101.aClass69_7 == null && !Static104.aBoolean95) {
						if ((local17.anInt2485 >= 0 || local17.anInt2528 != 0) && local93 <= Static70.anInt1549 && Static207.anInt4069 >= local82 && Static70.anInt1549 < local125 && local118 > Static207.anInt4069) {
							if (local17.anInt2485 >= 0) {
								Static86.aClass69_6 = arg4[local17.anInt2485];
							} else {
								Static86.aClass69_6 = local17;
							}
						}
						if (local17.anInt2474 == 8 && Static70.anInt1549 >= local93 && local82 <= Static207.anInt4069 && local125 > Static70.anInt1549 && Static207.anInt4069 < local118) {
							Static186.aClass69_14 = local17;
						}
						if (local17.anInt2471 < local17.anInt2517) {
							Static178.method2699(local17, local64 + local17.anInt2541, local17.anInt2471, Static70.anInt1549, local69, Static207.anInt4069, local17.anInt2517);
						}
					}
					if (local17.anInt2474 == 0) {
						method1540(local17.anInt2523, local69 - local17.anInt2514, local125, local93, arg4, local118, local82, local64 - local17.anInt2478);
						if (local17.aClass69Array2 != null) {
							method1540(local17.anInt2523, local69 - local17.anInt2514, local125, local93, local17.aClass69Array2, local118, local82, local64 - local17.anInt2478);
						}
						@Pc(1516) Class5_Sub25 local1516 = (Class5_Sub25) Static75.aClass75_7.method2072((long) local17.anInt2523);
						if (local1516 != null) {
							Static52.method913(local125, local1516.anInt3526, local64, local93, local82, local69, local118);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)V")
	public static void method1541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class5_Sub3 local7 = Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass73_1 = null;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!wa;ZI)Lclient!ji;")
	public static Class5_Sub2_Sub10 method1542(@OriginalArg(0) int arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(3) int arg2) {
		return Static167.method2532(arg1, arg0, arg2) ? Static182.method2753() : null;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZIIZIZIZ)Lclient!ji;")
	public static Class5_Sub2_Sub10 method1543(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) Class5_Sub2_Sub11 local9 = Static196.method2908(arg2);
		if (arg5 > 1 && local9.anIntArray257 != null) {
			@Pc(17) int local17 = -1;
			for (@Pc(19) int local19 = 0; local19 < 10; local19++) {
				if (local9.anIntArray258[local19] <= arg5 && local9.anIntArray258[local19] != 0) {
					local17 = local9.anIntArray257[local19];
				}
			}
			if (local17 != -1) {
				local9 = Static196.method2908(local17);
			}
		}
		@Pc(57) Class1_Sub1_Sub1 local57 = local9.method1778();
		if (local57 == null) {
			return null;
		}
		@Pc(63) Class5_Sub2_Sub10 local63 = null;
		if (local9.anInt2356 != -1) {
			local63 = method1543(false, 1, local9.anInt2361, true, 0, 10);
			if (local63 == null) {
				return null;
			}
		} else if (local9.anInt2326 != -1) {
			local63 = method1543(false, arg1, local9.anInt2313, false, arg4, arg5);
			if (local63 == null) {
				return null;
			}
		}
		@Pc(104) int[] local104 = Static42.anIntArray92;
		@Pc(106) int local106 = Static42.anInt971;
		@Pc(108) int local108 = Static42.anInt969;
		@Pc(111) int[] local111 = new int[4];
		Static42.method819(local111);
		@Pc(119) Class5_Sub2_Sub10_Sub1 local119 = new Class5_Sub2_Sub10_Sub1(36, 32);
		Static42.method804(local119.anIntArray347, 36, 32);
		Static149.method2267();
		Static149.method2266(16, 16);
		@Pc(131) int local131 = local9.anInt2315;
		if (arg3) {
			local131 = (int) ((double) local131 * 1.5D);
		} else if (arg1 == 2) {
			local131 = (int) ((double) local131 * 1.04D);
		}
		Static149.aBoolean134 = false;
		@Pc(163) int local163 = Class80.anIntArray324[local9.anInt2310] * local131 >> 16;
		@Pc(172) int local172 = local131 * Class80.anIntArray327[local9.anInt2310] >> 16;
		local57.method673(local9.anInt2349, local9.anInt2316, local9.anInt2310, local9.anInt2332, local163 + local9.anInt2317 - local57.method2449() / 2, local172 - -local9.anInt2317);
		if (arg1 >= 1) {
			local119.method2417(1);
		}
		if (arg1 >= 2) {
			local119.method2417(16777215);
		}
		if (arg4 != 0) {
			local119.method2433(arg4);
		}
		if (local9.anInt2326 != -1) {
			@Pc(229) Class5_Sub2_Sub10_Sub1 local229 = new Class5_Sub2_Sub10_Sub1(36, 32);
			Static42.method804(local229.anIntArray347, 36, 32);
			local63.method2403(0, 0);
			local119.method2403(0, 0);
			local119 = local229;
		}
		Static42.method804(local119.anIntArray347, 36, 32);
		if (local9.anInt2356 != -1) {
			local63.method2403(0, 0);
		}
		if (arg0 && (local9.anInt2314 == 1 || arg5 != 1) && arg5 != -1) {
			Static105.aClass5_Sub2_Sub8_Sub1_Sub1_1.method1334(Static184.method2780(arg5), 0, 9, 16776960, 1);
		}
		Static42.method804(local104, local108, local106);
		Static42.method820(local111);
		Static149.method2267();
		Static149.aBoolean134 = true;
		return local119;
	}
}
