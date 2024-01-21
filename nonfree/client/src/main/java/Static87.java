import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!o", name = "z", descriptor = "I")
	public static int anInt2340;

	@OriginalMember(owner = "client!o", name = "w", descriptor = "Lclient!ge;")
	public static Class29 aClass29_22 = new Class29(20);

	@OriginalMember(owner = "client!o", name = "C", descriptor = "Lclient!r;")
	public static Class61 aClass61_681 = Static129.method2060("<col=80ff00>");

	@OriginalMember(owner = "client!o", name = "H", descriptor = "Lclient!r;")
	private static Class61 aClass61_686 = Static129.method2060("Please remove ");

	@OriginalMember(owner = "client!o", name = "D", descriptor = "Lclient!r;")
	public static Class61 aClass61_682 = aClass61_686;

	@OriginalMember(owner = "client!o", name = "E", descriptor = "Lclient!r;")
	public static Class61 aClass61_683 = Static129.method2060("Lade)3)3)3");

	@OriginalMember(owner = "client!o", name = "F", descriptor = "Lclient!r;")
	public static Class61 aClass61_684 = Static129.method2060("<)4col> x");

	@OriginalMember(owner = "client!o", name = "J", descriptor = "Lclient!r;")
	private static Class61 aClass61_688 = Static129.method2060("Could not complete login)3");

	@OriginalMember(owner = "client!o", name = "G", descriptor = "Lclient!r;")
	public static Class61 aClass61_685 = aClass61_688;

	@OriginalMember(owner = "client!o", name = "I", descriptor = "Lclient!r;")
	public static Class61 aClass61_687 = aClass61_686;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V")
	public static void method1546() {
		Static67.aByteArrayArray7 = null;
		Static129.anIntArray393 = null;
		Static48.anIntArray190 = null;
		Static108.anIntArray19 = null;
		Static50.anIntArray191 = null;
		Static58.anIntArray212 = null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III)I")
	public static int method1547(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) (arg1 + (arg0 << 16));
		return Static127.aClass5_Sub2_Sub4_1 != null && local10 == Static127.aClass5_Sub2_Sub4_1.aLong100 ? Static47.aClass5_Sub14_4.anInt2199 * 99 / (Static47.aClass5_Sub14_4.aByteArray33.length - Static127.aClass5_Sub2_Sub4_1.aByte2) + 1 : 0;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I[Lclient!sc;Lclient!wa;)V")
	public static void method1548(@OriginalArg(1) Class66[] arg0, @OriginalArg(2) Class81 arg1) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(32) int local32;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static30.aByteArrayArrayArray2[local7][local11][local15] & 0x1) == 1) {
						local32 = local7;
						if ((Static30.aByteArrayArrayArray2[1][local11][local15] & 0x2) == 2) {
							local32 = local7 - 1;
						}
						if (local32 >= 0) {
							arg0[local32].method1808(local15, local11);
						}
					}
				}
			}
		}
		Static95.anInt2441 += (int) (Math.random() * 5.0D) - 2;
		if (Static95.anInt2441 < -16) {
			Static95.anInt2441 = -16;
		}
		Static91.anInt2423 += (int) (Math.random() * 5.0D) - 2;
		if (Static95.anInt2441 > 16) {
			Static95.anInt2441 = 16;
		}
		if (Static91.anInt2423 < -8) {
			Static91.anInt2423 = -8;
		}
		if (Static91.anInt2423 > 8) {
			Static91.anInt2423 = 8;
		}
		@Pc(128) int local128;
		@Pc(130) int local130;
		@Pc(134) int local134;
		@Pc(157) int local157;
		@Pc(177) int local177;
		@Pc(190) int local190;
		@Pc(196) int local196;
		@Pc(200) int local200;
		@Pc(256) int local256;
		@Pc(272) int local272;
		@Pc(250) int local250;
		@Pc(508) int local508;
		@Pc(549) int local549;
		@Pc(641) int local641;
		@Pc(651) int local651;
		@Pc(669) int local669;
		for (local11 = 0; local11 < 4; local11++) {
			@Pc(118) byte[][] local118 = Static20.aByteArrayArrayArray1[local11];
			local32 = (int) Math.sqrt(5100.0D);
			local128 = local32 * 768 >> 8;
			for (local130 = 1; local130 < 103; local130++) {
				for (local134 = 1; local134 < 103; local134++) {
					local157 = Static65.anIntArrayArrayArray3[local11][local134 + 1][local130] - Static65.anIntArrayArrayArray3[local11][local134 - 1][local130];
					local177 = Static65.anIntArrayArrayArray3[local11][local134][local130 + 1] - Static65.anIntArrayArrayArray3[local11][local134][local130 - 1];
					local190 = (int) Math.sqrt((double) (local177 * local177 + local157 * local157 + 65536));
					local196 = (local157 << 8) / local190;
					local200 = 65536 / local190;
					local250 = (local118[local134][local130] >> 1) + (local118[local134][local130 - 1] >> 2) + (local118[local134 - 1][local130] >> 2) - (-(local118[local134 + 1][local130] >> 3) + -(local118[local134][local130 + 1] >> 3));
					local256 = (local177 << 8) / local190;
					local272 = (local256 * -50 + local200 * -10 + local196 * -50) / local128 + 96;
					Static50.anIntArrayArray12[local134][local130] = local272 - local250;
				}
			}
			for (local134 = 0; local134 < 104; local134++) {
				Static129.anIntArray394[local134] = 0;
				Static70.anIntArray253[local134] = 0;
				Static125.anIntArray379[local134] = 0;
				Static32.anIntArray155[local134] = 0;
				Static126.anIntArray382[local134] = 0;
			}
			for (local157 = -5; local157 < 109; local157++) {
				for (local177 = 0; local177 < 104; local177++) {
					local190 = local157 + 5;
					@Pc(399) int local399;
					if (local190 >= 0 && local190 < 104) {
						local196 = Static75.aByteArrayArrayArray4[local11][local190][local177] & 0xFF;
						if (local196 > 0) {
							@Pc(363) Class5_Sub2_Sub5 local363 = Static77.method1248(local196 - 1);
							Static129.anIntArray394[local177] += local363.anInt988;
							Static70.anIntArray253[local177] += local363.anInt991;
							Static125.anIntArray379[local177] += local363.anInt997;
							Static32.anIntArray155[local177] += local363.anInt989;
							local399 = Static126.anIntArray382[local177]++;
						}
					}
					local196 = local157 - 5;
					if (local196 >= 0 && local196 < 104) {
						local200 = Static75.aByteArrayArrayArray4[local11][local196][local177] & 0xFF;
						if (local200 > 0) {
							@Pc(437) Class5_Sub2_Sub5 local437 = Static77.method1248(local200 - 1);
							Static129.anIntArray394[local177] -= local437.anInt988;
							Static70.anIntArray253[local177] -= local437.anInt991;
							Static125.anIntArray379[local177] -= local437.anInt997;
							Static32.anIntArray155[local177] -= local437.anInt989;
							local399 = Static126.anIntArray382[local177]--;
						}
					}
				}
				if (local157 >= 1 && local157 < 103) {
					local190 = 0;
					local256 = 0;
					local196 = 0;
					local200 = 0;
					local272 = 0;
					for (local250 = -5; local250 < 109; local250++) {
						local508 = local250 + 5;
						if (local508 >= 0 && local508 < 104) {
							local196 += Static70.anIntArray253[local508];
							local190 += Static129.anIntArray394[local508];
							local256 += Static32.anIntArray155[local508];
							local200 += Static125.anIntArray379[local508];
							local272 += Static126.anIntArray382[local508];
						}
						local549 = local250 - 5;
						if (local549 >= 0 && local549 < 104) {
							local200 -= Static125.anIntArray379[local549];
							local272 -= Static126.anIntArray382[local549];
							local190 -= Static129.anIntArray394[local549];
							local196 -= Static70.anIntArray253[local549];
							local256 -= Static32.anIntArray155[local549];
						}
						if (local250 >= 1 && local250 < 103 && (!Static61.aBoolean57 || (Static30.aByteArrayArrayArray2[0][local157][local250] & 0x2) != 0 || (Static30.aByteArrayArrayArray2[local11][local157][local250] & 0x10) == 0 && Static28.method619(local11, local157, local250) == Static55.anInt1403)) {
							if (Static36.anInt1012 > local11) {
								Static36.anInt1012 = local11;
							}
							local641 = Static75.aByteArrayArrayArray4[local11][local157][local250] & 0xFF;
							local651 = Static109.aByteArrayArrayArray7[local11][local157][local250] & 0xFF;
							if (local641 > 0 || local651 > 0) {
								local669 = Static65.anIntArrayArrayArray3[local11][local157][local250];
								@Pc(679) int local679 = Static65.anIntArrayArrayArray3[local11][local157 + 1][local250];
								@Pc(691) int local691 = Static65.anIntArrayArrayArray3[local11][local157 + 1][local250 + 1];
								@Pc(701) int local701 = Static65.anIntArrayArrayArray3[local11][local157][local250 + 1];
								@Pc(707) int local707 = Static50.anIntArrayArray12[local157][local250];
								@Pc(715) int local715 = Static50.anIntArrayArray12[local157 + 1][local250];
								@Pc(725) int local725 = Static50.anIntArrayArray12[local157 + 1][local250 + 1];
								@Pc(727) int local727 = -1;
								@Pc(729) int local729 = -1;
								@Pc(737) int local737 = Static50.anIntArrayArray12[local157][local250 + 1];
								@Pc(748) int local748;
								@Pc(752) int local752;
								if (local641 > 0) {
									local748 = local190 * 256 / local256;
									local752 = local196 / local272;
									@Pc(756) int local756 = local200 / local272;
									local727 = Static47.method859(local756, local748, local752);
									@Pc(768) int local768 = Static91.anInt2423 + local748 & 0xFF;
									local756 += Static95.anInt2441;
									if (local756 < 0) {
										local756 = 0;
									} else if (local756 > 255) {
										local756 = 255;
									}
									local729 = Static47.method859(local756, local768, local752);
								}
								if (local11 > 0) {
									@Pc(799) boolean local799 = true;
									if (local641 == 0 && Static79.aByteArrayArrayArray5[local11][local157][local250] != 0) {
										local799 = false;
									}
									if (local651 > 0 && !Static57.method1006(local651 - 1).aBoolean46) {
										local799 = false;
									}
									if (local799 && local669 == local679 && local691 == local669 && local669 == local701) {
										Static61.anIntArrayArrayArray2[local11][local157][local250] |= 0x924;
									}
								}
								local748 = 0;
								if (local729 != -1) {
									local748 = Static51.anIntArray196[Static68.method1134(local729, 96)];
								}
								if (local651 == 0) {
									arg1.method2072(local11, local157, local250, 0, 0, -1, local669, local679, local691, local701, Static68.method1134(local727, local707), Static68.method1134(local727, local715), Static68.method1134(local727, local725), Static68.method1134(local727, local737), 0, 0, 0, 0, local748, 0);
								} else {
									local752 = Static79.aByteArrayArrayArray5[local11][local157][local250] + 1;
									@Pc(936) byte local936 = Static48.aByteArrayArrayArray3[local11][local157][local250];
									@Pc(942) Class5_Sub2_Sub8 local942 = Static57.method1006(local651 - 1);
									@Pc(945) int local945 = local942.anInt1372;
									if (local945 >= 0 && !Static51.anInterface1_1.method1150(local945)) {
										local945 = -1;
									}
									@Pc(973) int local973;
									@Pc(1006) int local1006;
									@Pc(981) int local981;
									@Pc(986) int local986;
									if (local945 >= 0) {
										local1006 = Static51.anInterface1_1.method1153(local945);
										local973 = -1;
									} else if (local942.anInt1383 == 16711935) {
										local945 = -1;
										local1006 = -2;
										local973 = -2;
									} else {
										local973 = Static47.method859(local942.anInt1376, local942.anInt1377, local942.anInt1381);
										local981 = local942.anInt1377 + Static91.anInt2423 & 0xFF;
										local986 = Static95.anInt2441 + local942.anInt1376;
										if (local986 < 0) {
											local986 = 0;
										} else if (local986 > 255) {
											local986 = 255;
										}
										local1006 = Static47.method859(local986, local981, local942.anInt1381);
									}
									local981 = 0;
									if (local1006 != -2) {
										local981 = Static51.anIntArray196[Static57.method1005(local1006, 96)];
									}
									if (local942.anInt1375 != -1) {
										local986 = Static91.anInt2423 + local942.anInt1371 & 0xFF;
										@Pc(1051) int local1051 = local942.anInt1369 + Static95.anInt2441;
										if (local1051 < 0) {
											local1051 = 0;
										} else if (local1051 > 255) {
											local1051 = 255;
										}
										local1006 = Static47.method859(local1051, local986, local942.anInt1373);
										local981 = Static51.anIntArray196[Static57.method1005(local1006, 96)];
									}
									arg1.method2072(local11, local157, local250, local752, local936, local945, local669, local679, local691, local701, Static68.method1134(local727, local707), Static68.method1134(local727, local715), Static68.method1134(local727, local725), Static68.method1134(local727, local737), Static57.method1005(local973, local707), Static57.method1005(local973, local715), Static57.method1005(local973, local725), Static57.method1005(local973, local737), local748, local981);
								}
							}
						}
					}
				}
			}
			for (local177 = 1; local177 < 103; local177++) {
				for (local190 = 1; local190 < 103; local190++) {
					arg1.method2088(local11, local190, local177, Static28.method619(local11, local190, local177));
				}
			}
			Static75.aByteArrayArrayArray4[local11] = null;
			Static109.aByteArrayArrayArray7[local11] = null;
			Static79.aByteArrayArrayArray5[local11] = null;
			Static48.aByteArrayArrayArray3[local11] = null;
			Static20.aByteArrayArrayArray1[local11] = null;
		}
		arg1.method2087();
		for (local15 = 0; local15 < 104; local15++) {
			for (local32 = 0; local32 < 104; local32++) {
				if ((Static30.aByteArrayArrayArray2[1][local15][local32] & 0x2) == 2) {
					arg1.method2085(local15, local32);
				}
			}
		}
		local32 = 1;
		local128 = 2;
		local130 = 4;
		for (local134 = 0; local134 < 4; local134++) {
			if (local134 > 0) {
				local32 <<= 0x3;
				local130 <<= 0x3;
				local128 <<= 0x3;
			}
			for (local157 = 0; local157 <= local134; local157++) {
				for (local177 = 0; local177 <= 104; local177++) {
					for (local190 = 0; local190 <= 104; local190++) {
						if ((local32 & Static61.anIntArrayArrayArray2[local157][local190][local177]) != 0) {
							local200 = local177;
							local196 = local177;
							local272 = local157;
							while (local196 > 0 && (local32 & Static61.anIntArrayArrayArray2[local157][local190][local196 - 1]) != 0) {
								local196--;
							}
							while (local200 < 104 && (Static61.anIntArrayArrayArray2[local157][local190][local200 + 1] & local32) != 0) {
								local200++;
							}
							label353: for (local256 = local157; local256 > 0; local256--) {
								for (local250 = local196; local250 <= local200; local250++) {
									if ((Static61.anIntArrayArrayArray2[local256 - 1][local190][local250] & local32) == 0) {
										break label353;
									}
								}
							}
							label342: while (local272 < local134) {
								for (local250 = local196; local250 <= local200; local250++) {
									if ((local32 & Static61.anIntArrayArrayArray2[local272 + 1][local190][local250]) == 0) {
										break label342;
									}
								}
								local272++;
							}
							local250 = (local272 + 1 - local256) * (local200 - (local196 - 1));
							if (local250 >= 8) {
								local549 = Static65.anIntArrayArrayArray3[local272][local190][local196] - 240;
								local641 = Static65.anIntArrayArrayArray3[local256][local190][local196];
								Static130.method2077(local134, 1, local190 * 128, local190 * 128, local196 * 128, local200 * 128 + 128, local549, local641);
								for (local651 = local256; local651 <= local272; local651++) {
									for (local669 = local196; local669 <= local200; local669++) {
										Static61.anIntArrayArrayArray2[local651][local190][local669] &= ~local32;
									}
								}
							}
						}
						if ((local128 & Static61.anIntArrayArrayArray2[local157][local190][local177]) != 0) {
							local200 = local190;
							local196 = local190;
							local256 = local157;
							local272 = local157;
							while (local200 < 104 && (Static61.anIntArrayArrayArray2[local157][local200 + 1][local177] & local128) != 0) {
								local200++;
							}
							while (local196 > 0 && (Static61.anIntArrayArrayArray2[local157][local196 - 1][local177] & local128) != 0) {
								local196--;
							}
							label407: while (local256 > 0) {
								for (local250 = local196; local250 <= local200; local250++) {
									if ((local128 & Static61.anIntArrayArrayArray2[local256 - 1][local250][local177]) == 0) {
										break label407;
									}
								}
								local256--;
							}
							label396: while (local134 > local272) {
								for (local250 = local196; local250 <= local200; local250++) {
									if ((local128 & Static61.anIntArrayArrayArray2[local272 + 1][local250][local177]) == 0) {
										break label396;
									}
								}
								local272++;
							}
							local250 = (local200 + 1 - local196) * (local272 + 1 - local256);
							if (local250 >= 8) {
								local549 = Static65.anIntArrayArrayArray3[local272][local196][local177] - 240;
								local641 = Static65.anIntArrayArrayArray3[local256][local196][local177];
								Static130.method2077(local134, 2, local196 * 128, local200 * 128 + 128, local177 * 128, local177 * 128, local549, local641);
								for (local651 = local256; local651 <= local272; local651++) {
									for (local669 = local196; local669 <= local200; local669++) {
										Static61.anIntArrayArrayArray2[local651][local669][local177] &= ~local128;
									}
								}
							}
						}
						if ((Static61.anIntArrayArrayArray2[local157][local190][local177] & local130) != 0) {
							local196 = local190;
							local200 = local190;
							for (local256 = local177; local256 > 0 && (local130 & Static61.anIntArrayArrayArray2[local157][local190][local256 - 1]) != 0; local256--) {
							}
							for (local272 = local177; local272 < 104 && (Static61.anIntArrayArrayArray2[local157][local190][local272 + 1] & local130) != 0; local272++) {
							}
							label460: while (local196 > 0) {
								for (local250 = local256; local250 <= local272; local250++) {
									if ((local130 & Static61.anIntArrayArrayArray2[local157][local196 - 1][local250]) == 0) {
										break label460;
									}
								}
								local196--;
							}
							label449: while (local200 < 104) {
								for (local250 = local256; local250 <= local272; local250++) {
									if ((Static61.anIntArrayArrayArray2[local157][local200 + 1][local250] & local130) == 0) {
										break label449;
									}
								}
								local200++;
							}
							if ((local272 + 1 - local256) * (local200 + 1 - local196) >= 4) {
								local250 = Static65.anIntArrayArrayArray3[local157][local196][local256];
								Static130.method2077(local134, 4, local196 * 128, local200 * 128 + 128, local256 * 128, local272 * 128 + 128, local250, local250);
								for (local508 = local196; local508 <= local200; local508++) {
									for (local549 = local256; local549 <= local272; local549++) {
										Static61.anIntArrayArrayArray2[local157][local508][local549] &= ~local130;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
	public static void method1549() {
		aClass61_681 = null;
		aClass61_684 = null;
		aClass29_22 = null;
		aClass61_685 = null;
		aClass61_687 = null;
		aClass61_686 = null;
		aClass61_683 = null;
		aClass61_682 = null;
		aClass61_688 = null;
	}
}
