import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!be", name = "eb", descriptor = "Lclient!be;")
	public static Class11_Sub1 aClass11_Sub1_1;

	@OriginalMember(owner = "client!be", name = "ib", descriptor = "Lclient!he;")
	public static Class11 aClass11_9;

	@OriginalMember(owner = "client!be", name = "kb", descriptor = "Lclient!w;")
	public static Class15 aClass15_7;

	@OriginalMember(owner = "client!be", name = "Hb", descriptor = "Lclient!ic;")
	public static Class10_Sub5 aClass10_Sub5_1;

	@OriginalMember(owner = "client!be", name = "bb", descriptor = "J")
	public static long aLong13 = 0L;

	@OriginalMember(owner = "client!be", name = "db", descriptor = "Lclient!va;")
	public static Class61 aClass61_79 = Static88.method1421("null");

	@OriginalMember(owner = "client!be", name = "mb", descriptor = "I")
	public static int anInt289 = 0;

	@OriginalMember(owner = "client!be", name = "nb", descriptor = "I")
	public static int anInt290 = 99;

	@OriginalMember(owner = "client!be", name = "rb", descriptor = "I")
	public static int anInt293 = 1;

	@OriginalMember(owner = "client!be", name = "sb", descriptor = "Lclient!qa;")
	public static Class50 aClass50_1 = new Class50(4096);

	@OriginalMember(owner = "client!be", name = "Bb", descriptor = "Lclient!va;")
	private static Class61 aClass61_81 = Static88.method1421("On");

	@OriginalMember(owner = "client!be", name = "ub", descriptor = "Lclient!va;")
	public static Class61 aClass61_80 = aClass61_81;

	@OriginalMember(owner = "client!be", name = "Gb", descriptor = "I")
	public static int anInt302 = 1;

	@OriginalMember(owner = "client!be", name = "Ib", descriptor = "I")
	public static int anInt303 = 0;

	@OriginalMember(owner = "client!be", name = "Jb", descriptor = "I")
	public static int anInt304 = 0;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V")
	public static void method234() {
		aClass61_80 = null;
		aClass50_1 = null;
		aClass61_81 = null;
		aClass11_9 = null;
		aClass61_79 = null;
		aClass11_Sub1_1 = null;
		aClass10_Sub5_1 = null;
		aClass15_7 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([Lclient!cb;Lclient!rc;I)V")
	public static void method236(@OriginalArg(0) Class12[] arg0, @OriginalArg(1) Class54 arg1) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(26) int local26;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					if ((Static21.aByteArrayArrayArray4[local3][local7][local11] & 0x1) == 1) {
						local26 = local3;
						if ((Static21.aByteArrayArrayArray4[1][local7][local11] & 0x2) == 2) {
							local26 = local3 - 1;
						}
						if (local26 >= 0) {
							arg0[local26].method263(local7, local11);
						}
					}
				}
			}
		}
		Static98.anInt2483 += (int) (Math.random() * 5.0D) - 2;
		Static29.anInt896 += (int) (Math.random() * 5.0D) - 2;
		if (Static29.anInt896 < -8) {
			Static29.anInt896 = -8;
		}
		if (Static29.anInt896 > 8) {
			Static29.anInt896 = 8;
		}
		if (Static98.anInt2483 < -16) {
			Static98.anInt2483 = -16;
		}
		if (Static98.anInt2483 > 16) {
			Static98.anInt2483 = 16;
		}
		@Pc(128) int local128;
		@Pc(130) int local130;
		@Pc(134) int local134;
		@Pc(157) int local157;
		@Pc(178) int local178;
		@Pc(192) int local192;
		@Pc(202) int local202;
		@Pc(196) int local196;
		@Pc(208) int local208;
		@Pc(225) int local225;
		@Pc(274) int local274;
		@Pc(499) int local499;
		@Pc(540) int local540;
		@Pc(638) int local638;
		@Pc(648) int local648;
		@Pc(701) int local701;
		for (local7 = 0; local7 < 4; local7++) {
			@Pc(118) byte[][] local118 = Static18.aByteArrayArrayArray3[local7];
			local26 = (int) Math.sqrt(5100.0D);
			local128 = local26 * 768 >> 8;
			for (local130 = 1; local130 < 103; local130++) {
				for (local134 = 1; local134 < 103; local134++) {
					local157 = Static37.anIntArrayArrayArray1[local7][local134 + 1][local130] - Static37.anIntArrayArrayArray1[local7][local134 - 1][local130];
					local178 = Static37.anIntArrayArrayArray1[local7][local134][local130 + 1] - Static37.anIntArrayArrayArray1[local7][local134][local130 - 1];
					local192 = (int) Math.sqrt((double) (local157 * local157 + local178 * local178 + 65536));
					local196 = 65536 / local192;
					local202 = (local157 << 8) / local192;
					local208 = (local178 << 8) / local192;
					local225 = (local202 * -50 + local196 * -10 + local208 * -50) / local128 + 96;
					local274 = (local118[local134][local130] >> 1) + (local118[local134 + 1][local130] >> 3) + (local118[local134 + -1][local130] >> 2) + (local118[local134][local130 + -1] >> 2) + (local118[local134][local130 + 1] >> 3);
					Static11.anIntArrayArray5[local134][local130] = local225 - local274;
				}
			}
			for (local134 = 0; local134 < 104; local134++) {
				Static95.anIntArray319[local134] = 0;
				Static82.anIntArray246[local134] = 0;
				Static22.anIntArray77[local134] = 0;
				Static28.anIntArray94[local134] = 0;
				Static65.anIntArray193[local134] = 0;
			}
			for (local157 = -5; local157 < 109; local157++) {
				for (local178 = 0; local178 < 104; local178++) {
					local192 = local157 + 5;
					@Pc(395) int local395;
					if (local192 >= 0 && local192 < 104) {
						local202 = Static33.aByteArrayArrayArray6[local7][local192][local178] & 0xFF;
						if (local202 > 0) {
							@Pc(359) Class10_Sub1_Sub13 local359 = Static49.method766(local202 - 1);
							Static95.anIntArray319[local178] += local359.anInt2117;
							Static82.anIntArray246[local178] += local359.anInt2116;
							Static22.anIntArray77[local178] += local359.anInt2113;
							Static28.anIntArray94[local178] += local359.anInt2133;
							local395 = Static65.anIntArray193[local178]++;
						}
					}
					local202 = local157 - 5;
					if (local202 >= 0 && local202 < 104) {
						local196 = Static33.aByteArrayArrayArray6[local7][local202][local178] & 0xFF;
						if (local196 > 0) {
							@Pc(428) Class10_Sub1_Sub13 local428 = Static49.method766(local196 - 1);
							Static95.anIntArray319[local178] -= local428.anInt2117;
							Static82.anIntArray246[local178] -= local428.anInt2116;
							Static22.anIntArray77[local178] -= local428.anInt2113;
							Static28.anIntArray94[local178] -= local428.anInt2133;
							local395 = Static65.anIntArray193[local178]--;
						}
					}
				}
				if (local157 >= 1 && local157 < 103) {
					local192 = 0;
					local202 = 0;
					local196 = 0;
					local208 = 0;
					local225 = 0;
					for (local274 = -5; local274 < 109; local274++) {
						local499 = local274 + 5;
						if (local499 >= 0 && local499 < 104) {
							local196 += Static22.anIntArray77[local499];
							local192 += Static95.anIntArray319[local499];
							local208 += Static28.anIntArray94[local499];
							local225 += Static65.anIntArray193[local499];
							local202 += Static82.anIntArray246[local499];
						}
						local540 = local274 - 5;
						if (local540 >= 0 && local540 < 104) {
							local225 -= Static65.anIntArray193[local540];
							local208 -= Static28.anIntArray94[local540];
							local196 -= Static22.anIntArray77[local540];
							local192 -= Static95.anIntArray319[local540];
							local202 -= Static82.anIntArray246[local540];
						}
						if (local274 >= 1 && local274 < 103 && (!Static31.aBoolean43 || (Static21.aByteArrayArrayArray4[0][local157][local274] & 0x2) != 0 || (Static21.aByteArrayArrayArray4[local7][local157][local274] & 0x10) == 0 && Static30.method551(local157, local7, local274) == Static61.anInt1599)) {
							if (local7 < anInt290) {
								anInt290 = local7;
							}
							local638 = Static33.aByteArrayArrayArray6[local7][local157][local274] & 0xFF;
							local648 = Static40.aByteArrayArrayArray7[local7][local157][local274] & 0xFF;
							if (local638 > 0 || local648 > 0) {
								@Pc(665) int local665 = Static37.anIntArrayArrayArray1[local7][local157 + 1][local274];
								@Pc(677) int local677 = Static37.anIntArrayArrayArray1[local7][local157 + 1][local274 + 1];
								@Pc(687) int local687 = Static37.anIntArrayArrayArray1[local7][local157][local274 + 1];
								@Pc(693) int local693 = Static11.anIntArrayArray5[local157][local274];
								local701 = Static37.anIntArrayArrayArray1[local7][local157][local274];
								@Pc(709) int local709 = Static11.anIntArrayArray5[local157][local274 + 1];
								@Pc(719) int local719 = Static11.anIntArrayArray5[local157 + 1][local274 + 1];
								@Pc(721) int local721 = -1;
								@Pc(723) int local723 = -1;
								@Pc(731) int local731 = Static11.anIntArrayArray5[local157 + 1][local274];
								@Pc(739) int local739;
								@Pc(743) int local743;
								if (local638 > 0) {
									local739 = local192 * 256 / local208;
									local743 = local202 / local225;
									@Pc(747) int local747 = local196 / local225;
									local723 = Static56.method822(local743, local739, local747);
									@Pc(759) int local759 = Static29.anInt896 + local739 & 0xFF;
									local747 += Static98.anInt2483;
									if (local747 < 0) {
										local747 = 0;
									} else if (local747 > 255) {
										local747 = 255;
									}
									local721 = Static56.method822(local743, local759, local747);
								}
								if (local7 > 0) {
									@Pc(787) boolean local787 = true;
									if (local638 == 0 && Static95.aByteArrayArrayArray9[local7][local157][local274] != 0) {
										local787 = false;
									}
									if (local648 > 0 && !Static7.method76(local648 - 1).aBoolean4) {
										local787 = false;
									}
									if (local787 && local665 == local701 && local677 == local701 && local687 == local701) {
										Static51.anIntArrayArrayArray3[local7][local157][local274] |= 0x924;
									}
								}
								local739 = 0;
								if (local721 != -1) {
									local739 = Static68.anIntArray205[Static13.method277(96, local721)];
								}
								if (local648 == 0) {
									arg1.method1380(local7, local157, local274, 0, 0, -1, local701, local665, local677, local687, Static13.method277(local693, local723), Static13.method277(local731, local723), Static13.method277(local719, local723), Static13.method277(local709, local723), 0, 0, 0, 0, local739, 0);
								} else {
									@Pc(872) byte local872 = Static27.aByteArrayArrayArray5[local7][local157][local274];
									local743 = Static95.aByteArrayArrayArray9[local7][local157][local274] + 1;
									@Pc(890) Class10_Sub1_Sub2 local890 = Static7.method76(local648 - 1);
									@Pc(893) int local893 = local890.anInt214;
									@Pc(897) int local897;
									@Pc(902) int local902;
									@Pc(925) int local925;
									@Pc(931) int local931;
									if (local893 >= 0) {
										local897 = -1;
										local902 = Static68.anInterface3_1.method59(local893);
									} else if (local890.anInt207 == 16711935) {
										local897 = -2;
										local902 = -2;
										local893 = -1;
									} else {
										local897 = Static56.method822(local890.anInt211, local890.anInt206, local890.anInt217);
										local925 = local890.anInt206 + Static29.anInt896 & 0xFF;
										local931 = local890.anInt217 + Static98.anInt2483;
										if (local931 < 0) {
											local931 = 0;
										} else if (local931 > 255) {
											local931 = 255;
										}
										local902 = Static56.method822(local890.anInt211, local925, local931);
									}
									local925 = 0;
									if (local902 != -2) {
										local925 = Static68.anIntArray205[Static8.method164(96, local902)];
									}
									if (local890.anInt199 != -1) {
										local931 = local890.anInt205 + Static29.anInt896 & 0xFF;
										@Pc(987) int local987 = local890.anInt202 + Static98.anInt2483;
										if (local987 < 0) {
											local987 = 0;
										} else if (local987 > 255) {
											local987 = 255;
										}
										local902 = Static56.method822(local890.anInt215, local931, local987);
										local925 = Static68.anIntArray205[Static8.method164(96, local902)];
									}
									arg1.method1380(local7, local157, local274, local743, local872, local893, local701, local665, local677, local687, Static13.method277(local693, local723), Static13.method277(local731, local723), Static13.method277(local719, local723), Static13.method277(local709, local723), Static8.method164(local693, local897), Static8.method164(local731, local897), Static8.method164(local719, local897), Static8.method164(local709, local897), local739, local925);
								}
							}
						}
					}
				}
			}
			for (local178 = 1; local178 < 103; local178++) {
				for (local192 = 1; local192 < 103; local192++) {
					arg1.method1341(local7, local192, local178, Static30.method551(local192, local7, local178));
				}
			}
			Static33.aByteArrayArrayArray6[local7] = null;
			Static40.aByteArrayArrayArray7[local7] = null;
			Static95.aByteArrayArrayArray9[local7] = null;
			Static27.aByteArrayArrayArray5[local7] = null;
			Static18.aByteArrayArrayArray3[local7] = null;
		}
		arg1.method1377();
		for (local11 = 0; local11 < 104; local11++) {
			for (local26 = 0; local26 < 104; local26++) {
				if ((Static21.aByteArrayArrayArray4[1][local11][local26] & 0x2) == 2) {
					arg1.method1370(local11, local26);
				}
			}
		}
		local26 = 1;
		local128 = 2;
		local130 = 4;
		for (local134 = 0; local134 < 4; local134++) {
			if (local134 > 0) {
				local128 <<= 0x3;
				local26 <<= 0x3;
				local130 <<= 0x3;
			}
			for (local157 = 0; local157 <= local134; local157++) {
				for (local178 = 0; local178 <= 104; local178++) {
					for (local192 = 0; local192 <= 104; local192++) {
						if ((local26 & Static51.anIntArrayArrayArray3[local157][local192][local178]) != 0) {
							local202 = local178;
							local196 = local178;
							while (local202 > 0 && (Static51.anIntArrayArrayArray3[local157][local192][local202 - 1] & local26) != 0) {
								local202--;
							}
							local208 = local157;
							while (local196 < 104 && (Static51.anIntArrayArrayArray3[local157][local192][local196 + 1] & local26) != 0) {
								local196++;
							}
							local225 = local157;
							label347: while (local208 > 0) {
								for (local274 = local202; local274 <= local196; local274++) {
									if ((Static51.anIntArrayArrayArray3[local208 - 1][local192][local274] & local26) == 0) {
										break label347;
									}
								}
								local208--;
							}
							label336: while (local134 > local225) {
								for (local274 = local202; local274 <= local196; local274++) {
									if ((local26 & Static51.anIntArrayArrayArray3[local225 + 1][local192][local274]) == 0) {
										break label336;
									}
								}
								local225++;
							}
							local274 = (local225 + 1 - local208) * (local196 + 1 - local202);
							if (local274 >= 8) {
								local638 = Static37.anIntArrayArrayArray1[local208][local192][local202];
								local540 = Static37.anIntArrayArrayArray1[local225][local192][local202] - 240;
								Static85.method1356(local134, 1, local192 * 128, local192 * 128, local202 * 128, local196 * 128 + 128, local540, local638);
								for (local648 = local208; local648 <= local225; local648++) {
									for (local701 = local202; local701 <= local196; local701++) {
										Static51.anIntArrayArrayArray3[local648][local192][local701] &= ~local26;
									}
								}
							}
						}
						if ((Static51.anIntArrayArrayArray3[local157][local192][local178] & local128) != 0) {
							for (local202 = local192; local202 > 0 && (local128 & Static51.anIntArrayArrayArray3[local157][local202 - 1][local178]) != 0; local202--) {
							}
							local196 = local192;
							local208 = local157;
							while (local196 < 104 && (local128 & Static51.anIntArrayArrayArray3[local157][local196 + 1][local178]) != 0) {
								local196++;
							}
							local225 = local157;
							label402: while (local208 > 0) {
								for (local274 = local202; local274 <= local196; local274++) {
									if ((local128 & Static51.anIntArrayArrayArray3[local208 - 1][local274][local178]) == 0) {
										break label402;
									}
								}
								local208--;
							}
							label391: while (local225 < local134) {
								for (local274 = local202; local274 <= local196; local274++) {
									if ((local128 & Static51.anIntArrayArrayArray3[local225 + 1][local274][local178]) == 0) {
										break label391;
									}
								}
								local225++;
							}
							local274 = (local196 + 1 - local202) * (local225 + (1 - local208));
							if (local274 >= 8) {
								local540 = Static37.anIntArrayArrayArray1[local225][local202][local178] - 240;
								local638 = Static37.anIntArrayArrayArray1[local208][local202][local178];
								Static85.method1356(local134, 2, local202 * 128, local196 * 128 + 128, local178 * 128, local178 * 128, local540, local638);
								for (local648 = local208; local648 <= local225; local648++) {
									for (local701 = local202; local701 <= local196; local701++) {
										Static51.anIntArrayArrayArray3[local648][local701][local178] &= ~local128;
									}
								}
							}
						}
						if ((Static51.anIntArrayArrayArray3[local157][local192][local178] & local130) != 0) {
							local196 = local192;
							for (local208 = local178; local208 > 0 && (Static51.anIntArrayArrayArray3[local157][local192][local208 - 1] & local130) != 0; local208--) {
							}
							local202 = local192;
							for (local225 = local178; local225 < 104 && (local130 & Static51.anIntArrayArrayArray3[local157][local192][local225 + 1]) != 0; local225++) {
							}
							label457: while (local202 > 0) {
								for (local274 = local208; local274 <= local225; local274++) {
									if ((Static51.anIntArrayArrayArray3[local157][local202 - 1][local274] & local130) == 0) {
										break label457;
									}
								}
								local202--;
							}
							label446: while (local196 < 104) {
								for (local274 = local208; local274 <= local225; local274++) {
									if ((Static51.anIntArrayArrayArray3[local157][local196 + 1][local274] & local130) == 0) {
										break label446;
									}
								}
								local196++;
							}
							if ((local196 + 1 - local202) * (local225 + 1 - local208) >= 4) {
								local274 = Static37.anIntArrayArrayArray1[local157][local202][local208];
								Static85.method1356(local134, 4, local202 * 128, local196 * 128 + 128, local208 * 128, local225 * 128 + 128, local274, local274);
								for (local499 = local202; local499 <= local196; local499++) {
									for (local540 = local208; local540 <= local225; local540++) {
										Static51.anIntArrayArrayArray3[local157][local499][local540] &= ~local130;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!he;I)V")
	public static void method240(@OriginalArg(0) Class11 arg0) {
		Static28.aClass11_24 = arg0;
		Static66.anInt1760 = Static28.aClass11_24.method217(16);
	}
}
