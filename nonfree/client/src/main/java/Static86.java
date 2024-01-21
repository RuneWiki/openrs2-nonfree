import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "Lclient!c;")
	public static Class10 aClass10_25;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "Lclient!qe;")
	public static Class4_Sub3_Sub6_Sub2 aClass4_Sub3_Sub6_Sub2_3;

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "[I")
	public static int[] anIntArray231;

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "Lclient!nc;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "[J")
	public static long[] aLongArray5 = new long[100];

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "Lclient!cb;")
	public static Class12 aClass12_18 = new Class12(64);

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "Z")
	public static boolean aBoolean71 = false;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "Lclient!od;")
	public static Class60 aClass60_839 = Static41.method597(": ");

	@OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
	public static int anInt2031 = 2;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public static void method1375() {
		aLongArray5 = null;
		Class63.anIntArray230 = null;
		aClass60_839 = null;
		anIntArray231 = null;
		aClass12_18 = null;
		aClass4_Sub3_Sub6_Sub2_3 = null;
		aClass14_1 = null;
		aClass10_25 = null;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)I")
	public static int method1376() {
		return 6;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
	public static void method1378() {
		Static59.method974();
		Static85.method1367();
		Static5.method53();
		Static107.method1753();
		Static76.method1248();
		Static83.method1312();
		Static43.method618();
		Static38.method579();
		Static18.method352();
		Static131.method1981();
		Static61.method981();
		Static44.method1488();
		((Class68) Static100.anInterface3_1).method1569();
		Static16.aClass12_6.method284();
		Static42.aClass10_Sub1_7.method1763();
		Static24.aClass10_Sub1_5.method1763();
		Static125.aClass10_Sub1_20.method1763();
		Static116.aClass10_Sub1_19.method1763();
		Static127.aClass10_Sub1_8.method1763();
		Static10.aClass10_Sub1_3.method1763();
		Static28.aClass10_Sub1_15.method1763();
		Static16.aClass10_Sub1_4.method1763();
		Static48.aClass10_Sub1_9.method1763();
		Static68.aClass10_Sub1_11.method1763();
		Static79.aClass10_Sub1_14.method1763();
		Static106.aClass10_Sub1_16.method1763();
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)Z")
	public static boolean method1379(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLclient!le;[Lclient!ge;)V")
	public static void method1380(@OriginalArg(1) Class48 arg0, @OriginalArg(2) Class28[] arg1) {
		@Pc(15) int local15;
		@Pc(32) int local32;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static69.aByteArrayArrayArray5[local7][local11][local15] & 0x1) == 1) {
						local32 = local7;
						if ((Static69.aByteArrayArrayArray5[1][local11][local15] & 0x2) == 2) {
							local32 = local7 - 1;
						}
						if (local32 >= 0) {
							arg1[local32].method599(local15, local11);
						}
					}
				}
			}
		}
		Static112.anInt2686 += (int) (Math.random() * 5.0D) - 2;
		if (Static112.anInt2686 < -16) {
			Static112.anInt2686 = -16;
		}
		if (Static112.anInt2686 > 16) {
			Static112.anInt2686 = 16;
		}
		Static67.anInt1670 += (int) (Math.random() * 5.0D) - 2;
		if (Static67.anInt1670 < -8) {
			Static67.anInt1670 = -8;
		}
		if (Static67.anInt1670 > 8) {
			Static67.anInt1670 = 8;
		}
		@Pc(129) int local129;
		@Pc(135) int local135;
		@Pc(137) int local137;
		@Pc(141) int local141;
		@Pc(164) int local164;
		@Pc(184) int local184;
		@Pc(197) int local197;
		@Pc(213) int local213;
		@Pc(207) int local207;
		@Pc(203) int local203;
		@Pc(231) int local231;
		@Pc(280) int local280;
		@Pc(507) int local507;
		@Pc(548) int local548;
		@Pc(651) int local651;
		@Pc(641) int local641;
		@Pc(669) int local669;
		for (local15 = 0; local15 < 4; local15++) {
			@Pc(125) byte[][] local125 = Static66.aByteArrayArrayArray4[local15];
			local129 = (int) Math.sqrt(5100.0D);
			local135 = local129 * 768 >> 8;
			for (local137 = 1; local137 < 103; local137++) {
				for (local141 = 1; local141 < 103; local141++) {
					local164 = Static16.anIntArrayArrayArray1[local15][local141 + 1][local137] - Static16.anIntArrayArrayArray1[local15][local141 - 1][local137];
					local184 = Static16.anIntArrayArrayArray1[local15][local141][local137 + 1] - Static16.anIntArrayArrayArray1[local15][local141][local137 - 1];
					local197 = (int) Math.sqrt((double) (local184 * local184 + local164 * local164 + 65536));
					local203 = (local184 << 8) / local197;
					local207 = 65536 / local197;
					local213 = (local164 << 8) / local197;
					local231 = (local213 * -50 + local207 * -10 + local203 * -50) / local135 + 96;
					local280 = (local125[local141][local137] >> 1) + (local125[local141][local137 + 1] >> 3) + (local125[local141 + 1][local137] >> 3) + (local125[local141 + -1][local137] >> 2) + (local125[local141][local137 + -1] >> 2);
					Static32.anIntArrayArray22[local141][local137] = local231 - local280;
				}
			}
			for (local141 = 0; local141 < 104; local141++) {
				Static49.anIntArray121[local141] = 0;
				Static94.anIntArray283[local141] = 0;
				Static55.anIntArray147[local141] = 0;
				Static39.anIntArray108[local141] = 0;
				Static20.anIntArray78[local141] = 0;
			}
			for (local164 = -5; local164 < 109; local164++) {
				for (local184 = 0; local184 < 104; local184++) {
					local197 = local164 + 5;
					@Pc(404) int local404;
					if (local197 >= 0 && local197 < 104) {
						local213 = Static112.aByteArrayArrayArray6[local15][local197][local184] & 0xFF;
						if (local213 > 0) {
							@Pc(368) Class4_Sub3_Sub8 local368 = Static112.method1857(local213 - 1);
							Static49.anIntArray121[local184] += local368.anInt1186;
							Static94.anIntArray283[local184] += local368.anInt1176;
							Static55.anIntArray147[local184] += local368.anInt1172;
							Static39.anIntArray108[local184] += local368.anInt1191;
							local404 = Static20.anIntArray78[local184]++;
						}
					}
					local213 = local164 - 5;
					if (local213 >= 0 && local213 < 104) {
						local207 = Static112.aByteArrayArrayArray6[local15][local213][local184] & 0xFF;
						if (local207 > 0) {
							@Pc(440) Class4_Sub3_Sub8 local440 = Static112.method1857(local207 - 1);
							Static49.anIntArray121[local184] -= local440.anInt1186;
							Static94.anIntArray283[local184] -= local440.anInt1176;
							Static55.anIntArray147[local184] -= local440.anInt1172;
							Static39.anIntArray108[local184] -= local440.anInt1191;
							local404 = Static20.anIntArray78[local184]--;
						}
					}
				}
				if (local164 >= 1 && local164 < 103) {
					local213 = 0;
					local207 = 0;
					local197 = 0;
					local203 = 0;
					local231 = 0;
					for (local280 = -5; local280 < 109; local280++) {
						local507 = local280 + 5;
						if (local507 >= 0 && local507 < 104) {
							local213 += Static94.anIntArray283[local507];
							local203 += Static39.anIntArray108[local507];
							local231 += Static20.anIntArray78[local507];
							local197 += Static49.anIntArray121[local507];
							local207 += Static55.anIntArray147[local507];
						}
						local548 = local280 - 5;
						if (local548 >= 0 && local548 < 104) {
							local213 -= Static94.anIntArray283[local548];
							local231 -= Static20.anIntArray78[local548];
							local203 -= Static39.anIntArray108[local548];
							local207 -= Static55.anIntArray147[local548];
							local197 -= Static49.anIntArray121[local548];
						}
						if (local280 >= 1 && local280 < 103 && (!Static8.aBoolean3 || (Static69.aByteArrayArrayArray5[0][local164][local280] & 0x2) != 0 || (Static69.aByteArrayArrayArray5[local15][local164][local280] & 0x10) == 0 && Static63.method998(local15, local164, local280) == Static91.anInt2145)) {
							if (Static31.anInt909 > local15) {
								Static31.anInt909 = local15;
							}
							local641 = Static9.aByteArrayArrayArray1[local15][local164][local280] & 0xFF;
							local651 = Static112.aByteArrayArrayArray6[local15][local164][local280] & 0xFF;
							if (local651 > 0 || local641 > 0) {
								local669 = Static16.anIntArrayArrayArray1[local15][local164][local280];
								@Pc(679) int local679 = Static16.anIntArrayArrayArray1[local15][local164 + 1][local280];
								@Pc(691) int local691 = Static16.anIntArrayArrayArray1[local15][local164 + 1][local280 + 1];
								@Pc(701) int local701 = Static16.anIntArrayArrayArray1[local15][local164][local280 + 1];
								@Pc(709) int local709 = Static32.anIntArrayArray22[local164 + 1][local280];
								@Pc(719) int local719 = Static32.anIntArrayArray22[local164 + 1][local280 + 1];
								@Pc(721) int local721 = -1;
								@Pc(723) int local723 = -1;
								@Pc(729) int local729 = Static32.anIntArrayArray22[local164][local280];
								@Pc(737) int local737 = Static32.anIntArrayArray22[local164][local280 + 1];
								@Pc(745) int local745;
								@Pc(749) int local749;
								if (local651 > 0) {
									local745 = local197 * 256 / local203;
									local749 = local213 / local231;
									@Pc(753) int local753 = local207 / local231;
									local721 = Static41.method593(local753, local749, local745);
									local753 += Static112.anInt2686;
									@Pc(769) int local769 = Static67.anInt1670 + local745 & 0xFF;
									if (local753 < 0) {
										local753 = 0;
									} else if (local753 > 255) {
										local753 = 255;
									}
									local723 = Static41.method593(local753, local749, local769);
								}
								if (local15 > 0) {
									@Pc(790) boolean local790 = true;
									if (local651 == 0 && Static53.aByteArrayArrayArray3[local15][local164][local280] != 0) {
										local790 = false;
									}
									if (local641 > 0 && !Static127.method631(local641 - 1).aBoolean106) {
										local790 = false;
									}
									if (local790 && local669 == local679 && local669 == local691 && local701 == local669) {
										Static113.anIntArrayArrayArray3[local15][local164][local280] |= 0x924;
									}
								}
								local745 = 0;
								if (local723 != -1) {
									local745 = Static100.anIntArray299[Static109.method1806(96, local723)];
								}
								if (local641 == 0) {
									arg0.method1048(local15, local164, local280, 0, 0, -1, local669, local679, local691, local701, Static109.method1806(local729, local721), Static109.method1806(local709, local721), Static109.method1806(local719, local721), Static109.method1806(local737, local721), 0, 0, 0, 0, local745, 0);
								} else {
									local749 = Static53.aByteArrayArrayArray3[local15][local164][local280] + 1;
									@Pc(915) byte local915 = Static119.aByteArrayArrayArray7[local15][local164][local280];
									@Pc(921) Class4_Sub3_Sub14 local921 = Static127.method631(local641 - 1);
									@Pc(924) int local924 = local921.anInt2515;
									@Pc(944) int local944;
									@Pc(977) int local977;
									@Pc(957) int local957;
									@Pc(949) int local949;
									if (local924 >= 0) {
										local944 = -1;
										local977 = Static100.anInterface3_1.method1563(local924);
									} else if (local921.anInt2514 == 16711935) {
										local924 = -1;
										local977 = -2;
										local944 = -2;
									} else {
										local944 = Static41.method593(local921.anInt2522, local921.anInt2512, local921.anInt2513);
										local949 = Static112.anInt2686 + local921.anInt2522;
										local957 = local921.anInt2513 + Static67.anInt1670 & 0xFF;
										if (local949 < 0) {
											local949 = 0;
										} else if (local949 > 255) {
											local949 = 255;
										}
										local977 = Static41.method593(local949, local921.anInt2512, local957);
									}
									local957 = 0;
									if (local977 != -2) {
										local957 = Static100.anIntArray299[Static59.method976(96, local977)];
									}
									if (local921.anInt2519 != -1) {
										local949 = local921.anInt2526 + Static67.anInt1670 & 0xFF;
										@Pc(1024) int local1024 = local921.anInt2527 + Static112.anInt2686;
										if (local1024 < 0) {
											local1024 = 0;
										} else if (local1024 > 255) {
											local1024 = 255;
										}
										local977 = Static41.method593(local1024, local921.anInt2523, local949);
										local957 = Static100.anIntArray299[Static59.method976(96, local977)];
									}
									arg0.method1048(local15, local164, local280, local749, local915, local924, local669, local679, local691, local701, Static109.method1806(local729, local721), Static109.method1806(local709, local721), Static109.method1806(local719, local721), Static109.method1806(local737, local721), Static59.method976(local729, local944), Static59.method976(local709, local944), Static59.method976(local719, local944), Static59.method976(local737, local944), local745, local957);
								}
							}
						}
					}
				}
			}
			for (local184 = 1; local184 < 103; local184++) {
				for (local197 = 1; local197 < 103; local197++) {
					arg0.method1029(local15, local197, local184, Static63.method998(local15, local197, local184));
				}
			}
			Static112.aByteArrayArrayArray6[local15] = null;
			Static9.aByteArrayArrayArray1[local15] = null;
			Static53.aByteArrayArrayArray3[local15] = null;
			Static119.aByteArrayArrayArray7[local15] = null;
			Static66.aByteArrayArrayArray4[local15] = null;
		}
		arg0.method1021();
		for (local32 = 0; local32 < 104; local32++) {
			for (local129 = 0; local129 < 104; local129++) {
				if ((Static69.aByteArrayArrayArray5[1][local32][local129] & 0x2) == 2) {
					arg0.method1003(local32, local129);
				}
			}
		}
		local129 = 1;
		local135 = 2;
		local137 = 4;
		for (local141 = 0; local141 < 4; local141++) {
			if (local141 > 0) {
				local135 <<= 0x3;
				local129 <<= 0x3;
				local137 <<= 0x3;
			}
			for (local164 = 0; local164 <= local141; local164++) {
				for (local184 = 0; local184 <= 104; local184++) {
					for (local197 = 0; local197 <= 104; local197++) {
						if ((Static113.anIntArrayArrayArray3[local164][local197][local184] & local129) != 0) {
							for (local207 = local184; local207 < 104 && (local129 & Static113.anIntArrayArrayArray3[local164][local197][local207 + 1]) != 0; local207++) {
							}
							local203 = local164;
							local213 = local184;
							local231 = local164;
							while (local213 > 0 && (Static113.anIntArrayArrayArray3[local164][local197][local213 - 1] & local129) != 0) {
								local213--;
							}
							label347: while (local203 > 0) {
								for (local280 = local213; local280 <= local207; local280++) {
									if ((local129 & Static113.anIntArrayArrayArray3[local203 - 1][local197][local280]) == 0) {
										break label347;
									}
								}
								local203--;
							}
							label336: while (local141 > local231) {
								for (local280 = local213; local280 <= local207; local280++) {
									if ((local129 & Static113.anIntArrayArrayArray3[local231 + 1][local197][local280]) == 0) {
										break label336;
									}
								}
								local231++;
							}
							local280 = (local207 + 1 - local213) * (local231 + 1 - local203);
							if (local280 >= 8) {
								local548 = Static16.anIntArrayArrayArray1[local231][local197][local213] - 240;
								local651 = Static16.anIntArrayArrayArray1[local203][local197][local213];
								Static64.method1030(local141, 1, local197 * 128, local197 * 128, local213 * 128, local207 * 128 + 128, local548, local651);
								for (local641 = local203; local641 <= local231; local641++) {
									for (local669 = local213; local669 <= local207; local669++) {
										Static113.anIntArrayArrayArray3[local641][local197][local669] &= ~local129;
									}
								}
							}
						}
						if ((local135 & Static113.anIntArrayArrayArray3[local164][local197][local184]) != 0) {
							for (local213 = local197; local213 > 0 && (Static113.anIntArrayArrayArray3[local164][local213 - 1][local184] & local135) != 0; local213--) {
							}
							local207 = local197;
							local231 = local164;
							local203 = local164;
							while (local207 < 104 && (local135 & Static113.anIntArrayArrayArray3[local164][local207 + 1][local184]) != 0) {
								local207++;
							}
							label401: while (local203 > 0) {
								for (local280 = local213; local280 <= local207; local280++) {
									if ((Static113.anIntArrayArrayArray3[local203 - 1][local280][local184] & local135) == 0) {
										break label401;
									}
								}
								local203--;
							}
							label390: while (local141 > local231) {
								for (local280 = local213; local280 <= local207; local280++) {
									if ((local135 & Static113.anIntArrayArrayArray3[local231 + 1][local280][local184]) == 0) {
										break label390;
									}
								}
								local231++;
							}
							local280 = (local231 + 1 - local203) * ((local207 + 1) - local213);
							if (local280 >= 8) {
								local548 = Static16.anIntArrayArrayArray1[local231][local213][local184] - 240;
								local651 = Static16.anIntArrayArrayArray1[local203][local213][local184];
								Static64.method1030(local141, 2, local213 * 128, local207 * 128 + 128, local184 * 128, local184 * 128, local548, local651);
								for (local641 = local203; local641 <= local231; local641++) {
									for (local669 = local213; local669 <= local207; local669++) {
										Static113.anIntArrayArrayArray3[local641][local669][local184] &= ~local135;
									}
								}
							}
						}
						if ((Static113.anIntArrayArrayArray3[local164][local197][local184] & local137) != 0) {
							local213 = local197;
							local231 = local184;
							local203 = local184;
							while (local231 < 104 && (local137 & Static113.anIntArrayArrayArray3[local164][local197][local231 + 1]) != 0) {
								local231++;
							}
							local207 = local197;
							while (local203 > 0 && (local137 & Static113.anIntArrayArrayArray3[local164][local197][local203 - 1]) != 0) {
								local203--;
							}
							label455: while (local213 > 0) {
								for (local280 = local203; local280 <= local231; local280++) {
									if ((local137 & Static113.anIntArrayArrayArray3[local164][local213 - 1][local280]) == 0) {
										break label455;
									}
								}
								local213--;
							}
							label444: while (local207 < 104) {
								for (local280 = local203; local280 <= local231; local280++) {
									if ((local137 & Static113.anIntArrayArrayArray3[local164][local207 + 1][local280]) == 0) {
										break label444;
									}
								}
								local207++;
							}
							if ((local207 + 1 - local213) * (local231 + 1 - local203) >= 4) {
								local280 = Static16.anIntArrayArrayArray1[local164][local213][local203];
								Static64.method1030(local141, 4, local213 * 128, local207 * 128 + 128, local203 * 128, local231 * 128 + 128, local280, local280);
								for (local507 = local213; local507 <= local207; local507++) {
									for (local548 = local203; local548 <= local231; local548++) {
										Static113.anIntArrayArrayArray3[local164][local507][local548] &= ~local137;
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
