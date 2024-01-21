import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!r", name = "r", descriptor = "J")
	public static long aLong85;

	@OriginalMember(owner = "client!r", name = "t", descriptor = "Lclient!lc;")
	public static Class40 aClass40_71;

	@OriginalMember(owner = "client!r", name = "u", descriptor = "Lclient!qc;")
	public static Class60 aClass60_980 = Static121.method2047("<br>(X100(U(Y");

	@OriginalMember(owner = "client!r", name = "v", descriptor = "Lclient!qc;")
	private static Class60 aClass60_981 = Static121.method2047(" from your friend list first");

	@OriginalMember(owner = "client!r", name = "z", descriptor = "Lclient!qc;")
	public static Class60 aClass60_982 = aClass60_981;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIILclient!ha;BIILclient!m;)V")
	public static void method1754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class28 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class45 arg8) {
		@Pc(13) int local13 = Static58.anIntArrayArrayArray5[arg4][arg2][arg6];
		@Pc(23) int local23 = Static58.anIntArrayArrayArray5[arg4][arg2 + 1][arg6];
		@Pc(33) int local33 = Static58.anIntArrayArrayArray5[arg4][arg2][arg6 + 1];
		@Pc(53) int local53 = Static58.anIntArrayArrayArray5[arg4][arg2 + 1][arg6 + 1];
		@Pc(67) int local67 = arg2 + (arg6 << 7) + (arg7 << 14) + 1073741824;
		@Pc(73) int local73 = arg3 + (arg0 << 6);
		@Pc(77) Class4_Sub4_Sub5 local77 = Static24.method477(arg7);
		if (local77.anInt1102 == 0) {
			local67 += Integer.MIN_VALUE;
		}
		if (local77.anInt1086 == 1) {
			local73 += 256;
		}
		@Pc(105) int local105 = local13 + local23 + local53 + local33 >> 2;
		@Pc(128) Class4_Sub4_Sub1 local128;
		if (arg3 == 22) {
			if (local77.anInt1078 == -1 && local77.anIntArray94 == null) {
				local128 = local77.method728(arg0, local23, local53, 22, local13, local33);
			} else {
				local128 = new Class4_Sub4_Sub1_Sub3(arg7, 22, arg0, local13, local23, local53, local33, local77.anInt1078, true, null);
			}
			arg5.method790(arg1, arg2, arg6, local105, local128, local67, local73);
			if (local77.anInt1080 == 1) {
				arg8.method1334(arg6, arg2);
			}
			return;
		}
		@Pc(218) int local218;
		if (arg3 == 10 || arg3 == 11) {
			if (local77.anInt1078 == -1 && local77.anIntArray94 == null) {
				local128 = local77.method728(arg0, local23, local53, 10, local13, local33);
			} else {
				local128 = new Class4_Sub4_Sub1_Sub3(arg7, 10, arg0, local13, local23, local53, local33, local77.anInt1078, true, null);
			}
			if (local128 != null) {
				@Pc(221) int local221;
				if (arg0 == 1 || arg0 == 3) {
					local221 = local77.anInt1075;
					local218 = local77.anInt1085;
				} else {
					local218 = local77.anInt1075;
					local221 = local77.anInt1085;
				}
				@Pc(231) int local231 = 0;
				if (arg3 == 11) {
					local231 += 256;
				}
				arg5.method785(arg1, arg2, arg6, local105, local218, local221, local128, local231, local67, local73);
			}
			if (local77.anInt1080 != 0) {
				arg8.method1325(local77.anInt1075, arg0, arg6, arg2, local77.aBoolean38, local77.anInt1085);
			}
		} else if (arg3 >= 12) {
			if (local77.anInt1078 == -1 && local77.anIntArray94 == null) {
				local128 = local77.method728(arg0, local23, local53, arg3, local13, local33);
			} else {
				local128 = new Class4_Sub4_Sub1_Sub3(arg7, arg3, arg0, local13, local23, local53, local33, local77.anInt1078, true, null);
			}
			arg5.method785(arg1, arg2, arg6, local105, 1, 1, local128, 0, local67, local73);
			if (local77.anInt1080 != 0) {
				arg8.method1325(local77.anInt1075, arg0, arg6, arg2, local77.aBoolean38, local77.anInt1085);
			}
		} else if (arg3 == 0) {
			if (local77.anInt1078 == -1 && local77.anIntArray94 == null) {
				local128 = local77.method728(arg0, local23, local53, 0, local13, local33);
			} else {
				local128 = new Class4_Sub4_Sub1_Sub3(arg7, 0, arg0, local13, local23, local53, local33, local77.anInt1078, true, null);
			}
			arg5.method795(arg1, arg2, arg6, local105, local128, null, Static99.anIntArray244[arg0], 0, local67, local73);
			if (local77.anInt1080 != 0) {
				arg8.method1337(arg0, arg3, local77.aBoolean38, arg2, arg6);
			}
		} else if (arg3 == 1) {
			if (local77.anInt1078 == -1 && local77.anIntArray94 == null) {
				local128 = local77.method728(arg0, local23, local53, 1, local13, local33);
			} else {
				local128 = new Class4_Sub4_Sub1_Sub3(arg7, 1, arg0, local13, local23, local53, local33, local77.anInt1078, true, null);
			}
			arg5.method795(arg1, arg2, arg6, local105, local128, null, Static18.anIntArray30[arg0], 0, local67, local73);
			if (local77.anInt1080 != 0) {
				arg8.method1337(arg0, arg3, local77.aBoolean38, arg2, arg6);
			}
		} else {
			@Pc(477) int local477;
			@Pc(517) Class4_Sub4_Sub1 local517;
			if (arg3 == 2) {
				local477 = arg0 + 1 & 0x3;
				@Pc(502) Class4_Sub4_Sub1 local502;
				if (local77.anInt1078 == -1 && local77.anIntArray94 == null) {
					local502 = local77.method728(arg0 + 4, local23, local53, 2, local13, local33);
					local517 = local77.method728(local477, local23, local53, 2, local13, local33);
				} else {
					local502 = new Class4_Sub4_Sub1_Sub3(arg7, 2, arg0 + 4, local13, local23, local53, local33, local77.anInt1078, true, null);
					local517 = new Class4_Sub4_Sub1_Sub3(arg7, 2, local477, local13, local23, local53, local33, local77.anInt1078, true, null);
				}
				arg5.method795(arg1, arg2, arg6, local105, local502, local517, Static99.anIntArray244[arg0], Static99.anIntArray244[local477], local67, local73);
				if (local77.anInt1080 != 0) {
					arg8.method1337(arg0, arg3, local77.aBoolean38, arg2, arg6);
				}
			} else if (arg3 == 3) {
				if (local77.anInt1078 == -1 && local77.anIntArray94 == null) {
					local128 = local77.method728(arg0, local23, local53, 3, local13, local33);
				} else {
					local128 = new Class4_Sub4_Sub1_Sub3(arg7, 3, arg0, local13, local23, local53, local33, local77.anInt1078, true, null);
				}
				arg5.method795(arg1, arg2, arg6, local105, local128, null, Static18.anIntArray30[arg0], 0, local67, local73);
				if (local77.anInt1080 != 0) {
					arg8.method1337(arg0, arg3, local77.aBoolean38, arg2, arg6);
				}
			} else if (arg3 == 9) {
				if (local77.anInt1078 == -1 && local77.anIntArray94 == null) {
					local128 = local77.method728(arg0, local23, local53, arg3, local13, local33);
				} else {
					local128 = new Class4_Sub4_Sub1_Sub3(arg7, arg3, arg0, local13, local23, local53, local33, local77.anInt1078, true, null);
				}
				arg5.method785(arg1, arg2, arg6, local105, 1, 1, local128, 0, local67, local73);
				if (local77.anInt1080 != 0) {
					arg8.method1325(local77.anInt1075, arg0, arg6, arg2, local77.aBoolean38, local77.anInt1085);
				}
			} else {
				if (local77.aBoolean37) {
					if (arg0 == 1) {
						local477 = local33;
						local33 = local53;
						local53 = local23;
						local23 = local13;
						local13 = local477;
					} else if (arg0 == 2) {
						local477 = local33;
						local33 = local23;
						local23 = local477;
						local477 = local53;
						local53 = local13;
						local13 = local477;
					} else if (arg0 == 3) {
						local477 = local33;
						local33 = local13;
						local13 = local23;
						local23 = local53;
						local53 = local477;
					}
				}
				if (arg3 == 4) {
					if (local77.anInt1078 == -1 && local77.anIntArray94 == null) {
						local128 = local77.method728(0, local23, local53, 4, local13, local33);
					} else {
						local128 = new Class4_Sub4_Sub1_Sub3(arg7, 4, 0, local13, local23, local53, local33, local77.anInt1078, true, null);
					}
					arg5.method765(arg1, arg2, arg6, local105, local128, Static99.anIntArray244[arg0], arg0 * 512, 0, 0, local67, local73);
				} else if (arg3 == 5) {
					local477 = 16;
					local218 = arg5.method796(arg1, arg2, arg6);
					if (local218 != 0) {
						local477 = Static24.method477(local218 >> 14 & 0x7FFF).anInt1113;
					}
					if (local77.anInt1078 == -1 && local77.anIntArray94 == null) {
						local517 = local77.method728(0, local23, local53, 4, local13, local33);
					} else {
						local517 = new Class4_Sub4_Sub1_Sub3(arg7, 4, 0, local13, local23, local53, local33, local77.anInt1078, true, null);
					}
					arg5.method765(arg1, arg2, arg6, local105, local517, Static99.anIntArray244[arg0], arg0 * 512, Static26.anIntArray46[arg0] * local477, local477 * Static8.anIntArray11[arg0], local67, local73);
				} else if (arg3 == 6) {
					if (local77.anInt1078 == -1 && local77.anIntArray94 == null) {
						local128 = local77.method728(0, local23, local53, 4, local13, local33);
					} else {
						local128 = new Class4_Sub4_Sub1_Sub3(arg7, 4, 0, local13, local23, local53, local33, local77.anInt1078, true, null);
					}
					arg5.method765(arg1, arg2, arg6, local105, local128, 256, arg0, 0, 0, local67, local73);
				} else if (arg3 == 7) {
					if (local77.anInt1078 == -1 && local77.anIntArray94 == null) {
						local128 = local77.method728(0, local23, local53, 4, local13, local33);
					} else {
						local128 = new Class4_Sub4_Sub1_Sub3(arg7, 4, 0, local13, local23, local53, local33, local77.anInt1078, true, null);
					}
					arg5.method765(arg1, arg2, arg6, local105, local128, 512, arg0, 0, 0, local67, local73);
				} else if (arg3 == 8) {
					if (local77.anInt1078 == -1 && local77.anIntArray94 == null) {
						local128 = local77.method728(0, local23, local53, 4, local13, local33);
					} else {
						local128 = new Class4_Sub4_Sub1_Sub3(arg7, 4, 0, local13, local23, local53, local33, local77.anInt1078, true, null);
					}
					arg5.method765(arg1, arg2, arg6, local105, local128, 768, arg0, 0, 0, local67, local73);
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!q;II)V")
	public static void method1755(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub17 arg1, @OriginalArg(2) int arg2) {
		if (arg1.anInt2188 == 1) {
			Static41.method698(0, arg1.anInt2203, Static22.aClass60_241, 25, 0, arg1.aClass60_897);
		}
		if (arg1.anInt2188 == 2 && !Static71.aBoolean70) {
			@Pc(29) Class60 local29 = Static108.method1848(arg1);
			if (local29 != null) {
				Static41.method698(-1, arg1.anInt2203, Static125.method2072(new Class60[] { Static88.aClass60_849, arg1.aClass60_893 }), 32, 0, local29);
			}
		}
		if (arg1.anInt2188 == 3) {
			Static41.method698(0, arg1.anInt2203, Static22.aClass60_241, 43, 0, Static39.aClass60_420);
		}
		if (arg1.anInt2188 == 4) {
			Static41.method698(0, arg1.anInt2203, Static22.aClass60_241, 5, 0, arg1.aClass60_897);
		}
		if (arg1.anInt2188 == 5) {
			Static41.method698(0, arg1.anInt2203, Static22.aClass60_241, 2, 0, arg1.aClass60_897);
		}
		if (arg1.anInt2188 == 6 && Static11.aClass4_Sub17_1 == null) {
			Static41.method698(-1, arg1.anInt2203, Static22.aClass60_241, 10, 0, arg1.aClass60_897);
		}
		@Pc(153) int local153;
		@Pc(147) int local147;
		if (arg1.anInt2231 == 2) {
			local147 = 0;
			for (@Pc(149) int local149 = 0; local149 < arg1.anInt2186; local149++) {
				for (local153 = 0; local153 < arg1.anInt2184; local153++) {
					@Pc(162) int local162 = (arg1.anInt2229 + 32) * local153;
					@Pc(169) int local169 = local149 * (arg1.anInt2240 + 32);
					if (local147 < 20) {
						local169 += arg1.anIntArray219[local147];
						local162 += arg1.anIntArray223[local147];
					}
					if (local162 <= arg2 && arg0 >= local169 && local162 + 32 > arg2 && local169 + 32 > arg0) {
						Static11.anInt248 = local147;
						Static30.aClass4_Sub17_3 = arg1;
						if (arg1.anIntArray224[local147] > 0) {
							@Pc(231) Class4_Sub4_Sub13 local231 = Static24.method475(arg1.anIntArray224[local147] - 1);
							if (Static26.anInt724 == 1 && Static123.method2064(Static73.method1384(arg1))) {
								if (Static87.anInt2046 != arg1.anInt2203 || Static117.anInt2792 != local147) {
									Static41.method698(local147, arg1.anInt2203, Static125.method2072(new Class60[] { Static90.aClass60_874, Static81.aClass60_792, local231.aClass60_870 }), 34, local231.anInt2128, Static34.aClass60_372);
								}
							} else if (!Static71.aBoolean70 || !Static123.method2064(Static73.method1384(arg1))) {
								@Pc(290) Class60[] local290 = local231.aClass60Array17;
								if (Static2.aBoolean49) {
									local290 = Static28.method558(local290);
								}
								@Pc(308) int local308;
								@Pc(325) byte local325;
								if (Static123.method2064(Static73.method1384(arg1))) {
									for (local308 = 4; local308 >= 3; local308--) {
										if (local290 != null && local290[local308] != null) {
											if (local308 == 3) {
												local325 = 39;
											} else {
												local325 = 12;
											}
											Static41.method698(local147, arg1.anInt2203, Static125.method2072(new Class60[] { Static125.aClass60_1173, local231.aClass60_870 }), local325, local231.anInt2128, local290[local308]);
										} else if (local308 == 4) {
											Static41.method698(local147, arg1.anInt2203, Static125.method2072(new Class60[] { Static125.aClass60_1173, local231.aClass60_870 }), 12, local231.anInt2128, Static75.aClass60_733);
										}
									}
								}
								if (Static37.method638(Static73.method1384(arg1))) {
									Static41.method698(local147, arg1.anInt2203, Static125.method2072(new Class60[] { Static125.aClass60_1173, local231.aClass60_870 }), 44, local231.anInt2128, Static34.aClass60_372);
								}
								if (Static123.method2064(Static73.method1384(arg1)) && local290 != null) {
									for (local308 = 2; local308 >= 0; local308--) {
										if (local290[local308] != null) {
											local325 = 0;
											if (local308 == 0) {
												local325 = 40;
											}
											if (local308 == 1) {
												local325 = 30;
											}
											if (local308 == 2) {
												local325 = 3;
											}
											Static41.method698(local147, arg1.anInt2203, Static125.method2072(new Class60[] { Static125.aClass60_1173, local231.aClass60_870 }), local325, local231.anInt2128, local290[local308]);
										}
									}
								}
								local290 = arg1.aClass60Array19;
								if (Static2.aBoolean49) {
									local290 = Static28.method558(local290);
								}
								if (local290 != null) {
									for (local308 = 4; local308 >= 0; local308--) {
										if (local290[local308] != null) {
											local325 = 0;
											if (local308 == 0) {
												local325 = 42;
											}
											if (local308 == 1) {
												local325 = 45;
											}
											if (local308 == 2) {
												local325 = 48;
											}
											if (local308 == 3) {
												local325 = 20;
											}
											if (local308 == 4) {
												local325 = 16;
											}
											Static41.method698(local147, arg1.anInt2203, Static125.method2072(new Class60[] { Static125.aClass60_1173, local231.aClass60_870 }), local325, local231.anInt2128, local290[local308]);
										}
									}
								}
								Static41.method698(local147, arg1.anInt2203, Static125.method2072(new Class60[] { Static125.aClass60_1173, local231.aClass60_870 }), 1007, local231.anInt2128, Static10.aClass60_97);
							} else if ((Static85.anInt2034 & 0x10) == 16) {
								Static41.method698(local147, arg1.anInt2203, Static125.method2072(new Class60[] { Static94.aClass60_916, Static81.aClass60_792, local231.aClass60_870 }), 22, local231.anInt2128, Static92.aClass60_891);
							}
						}
					}
					local147++;
				}
			}
		}
		if (!arg1.aBoolean103) {
			return;
		}
		if (Static71.aBoolean70) {
			if (Static31.method594(Static73.method1384(arg1)) && (Static85.anInt2034 & 0x20) == 32) {
				Static41.method698(arg1.anInt2241, arg1.anInt2203, Static125.method2072(new Class60[] { Static94.aClass60_916, Static36.aClass60_388, arg1.aClass60_892 }), 9, 0, Static92.aClass60_891);
				return;
			}
			return;
		}
		@Pc(716) Class60 local716;
		for (local147 = 9; local147 >= 5; local147--) {
			local716 = Static81.method1452(arg1, local147);
			if (local716 != null) {
				Static41.method698(arg1.anInt2241, arg1.anInt2203, arg1.aClass60_892, 1002, local147 + 1, local716);
			}
		}
		local716 = Static108.method1848(arg1);
		if (local716 != null) {
			Static41.method698(arg1.anInt2241, arg1.anInt2203, arg1.aClass60_892, 32, 0, local716);
		}
		for (local153 = 4; local153 >= 0; local153--) {
			@Pc(769) Class60 local769 = Static81.method1452(arg1, local153);
			if (local769 != null) {
				Static41.method698(arg1.anInt2241, arg1.anInt2203, arg1.aClass60_892, 14, local153 + 1, local769);
			}
		}
		if (Static84.method1486(Static73.method1384(arg1))) {
			Static41.method698(arg1.anInt2241, arg1.anInt2203, Static22.aClass60_241, 10, 0, Static86.aClass60_272);
			return;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ha;[Lclient!m;I)V")
	public static void method1756(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class45[] arg1) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(30) int local30;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static95.aByteArrayArrayArray5[local7][local11][local15] & 0x1) == 1) {
						local30 = local7;
						if ((Static95.aByteArrayArrayArray5[1][local11][local15] & 0x2) == 2) {
							local30 = local7 - 1;
						}
						if (local30 >= 0) {
							arg1[local30].method1322(local11, local15);
						}
					}
				}
			}
		}
		Static46.anInt1194 += (int) (Math.random() * 5.0D) - 2;
		if (Static46.anInt1194 < -8) {
			Static46.anInt1194 = -8;
		}
		Static61.anInt1540 += (int) (Math.random() * 5.0D) - 2;
		if (Static46.anInt1194 > 8) {
			Static46.anInt1194 = 8;
		}
		if (Static61.anInt1540 < -16) {
			Static61.anInt1540 = -16;
		}
		if (Static61.anInt1540 > 16) {
			Static61.anInt1540 = 16;
		}
		@Pc(141) int local141;
		@Pc(143) int local143;
		@Pc(147) int local147;
		@Pc(170) int local170;
		@Pc(190) int local190;
		@Pc(203) int local203;
		@Pc(209) int local209;
		@Pc(213) int local213;
		@Pc(219) int local219;
		@Pc(237) int local237;
		@Pc(287) int local287;
		@Pc(514) int local514;
		@Pc(555) int local555;
		@Pc(657) int local657;
		@Pc(667) int local667;
		@Pc(682) int local682;
		for (local11 = 0; local11 < 4; local11++) {
			@Pc(131) byte[][] local131 = Static36.aByteArrayArrayArray2[local11];
			local30 = (int) Math.sqrt(5100.0D);
			local141 = local30 * 768 >> 8;
			for (local143 = 1; local143 < 103; local143++) {
				for (local147 = 1; local147 < 103; local147++) {
					local170 = Static58.anIntArrayArrayArray5[local11][local147 + 1][local143] - Static58.anIntArrayArrayArray5[local11][local147 - 1][local143];
					local190 = Static58.anIntArrayArrayArray5[local11][local147][local143 + 1] - Static58.anIntArrayArrayArray5[local11][local147][local143 - 1];
					local203 = (int) Math.sqrt((double) (local170 * local170 + local190 * local190 + 65536));
					local209 = (local170 << 8) / local203;
					local213 = 65536 / local203;
					local219 = (local190 << 8) / local203;
					local237 = (local219 * -50 + local209 * -50 + local213 * -10) / local141 + 96;
					local287 = (local131[local147][local143] >> 1) + ((local131[local147 + 1][local143] >> 3) + (local131[local147 - 1][local143] >> 2) + (local131[local147][local143 - 1] >> 2)) + (local131[local147][local143 + 1] >> 3);
					Static89.anIntArrayArray19[local147][local143] = local237 - local287;
				}
			}
			for (local147 = 0; local147 < 104; local147++) {
				Static71.anIntArray185[local147] = 0;
				Static101.anIntArray278[local147] = 0;
				Static83.anIntArray199[local147] = 0;
				Static72.anIntArray188[local147] = 0;
				Static39.anIntArray74[local147] = 0;
			}
			for (local170 = -5; local170 < 109; local170++) {
				for (local190 = 0; local190 < 104; local190++) {
					local203 = local170 + 5;
					@Pc(411) int local411;
					if (local203 >= 0 && local203 < 104) {
						local209 = Static84.aByteArrayArrayArray4[local11][local203][local190] & 0xFF;
						if (local209 > 0) {
							@Pc(375) Class4_Sub4_Sub9 local375 = Static121.method2045(local209 - 1);
							Static71.anIntArray185[local190] += local375.anInt1801;
							Static101.anIntArray278[local190] += local375.anInt1799;
							Static83.anIntArray199[local190] += local375.anInt1803;
							Static72.anIntArray188[local190] += local375.anInt1805;
							local411 = Static39.anIntArray74[local190]++;
						}
					}
					local209 = local170 - 5;
					if (local209 >= 0 && local209 < 104) {
						local213 = Static84.aByteArrayArrayArray4[local11][local209][local190] & 0xFF;
						if (local213 > 0) {
							@Pc(443) Class4_Sub4_Sub9 local443 = Static121.method2045(local213 - 1);
							Static71.anIntArray185[local190] -= local443.anInt1801;
							Static101.anIntArray278[local190] -= local443.anInt1799;
							Static83.anIntArray199[local190] -= local443.anInt1803;
							Static72.anIntArray188[local190] -= local443.anInt1805;
							local411 = Static39.anIntArray74[local190]--;
						}
					}
				}
				if (local170 >= 1 && local170 < 103) {
					local203 = 0;
					local213 = 0;
					local237 = 0;
					local209 = 0;
					local219 = 0;
					for (local287 = -5; local287 < 109; local287++) {
						local514 = local287 + 5;
						if (local514 >= 0 && local514 < 104) {
							local219 += Static72.anIntArray188[local514];
							local209 += Static101.anIntArray278[local514];
							local213 += Static83.anIntArray199[local514];
							local237 += Static39.anIntArray74[local514];
							local203 += Static71.anIntArray185[local514];
						}
						local555 = local287 - 5;
						if (local555 >= 0 && local555 < 104) {
							local237 -= Static39.anIntArray74[local555];
							local209 -= Static101.anIntArray278[local555];
							local213 -= Static83.anIntArray199[local555];
							local203 -= Static71.anIntArray185[local555];
							local219 -= Static72.anIntArray188[local555];
						}
						if (local287 >= 1 && local287 < 103 && (!Static61.aBoolean57 || (Static95.aByteArrayArrayArray5[0][local170][local287] & 0x2) != 0 || (Static95.aByteArrayArrayArray5[local11][local170][local287] & 0x10) == 0 && Static62.method1264(local170, local287, local11) == Static127.anInt2976)) {
							if (Static128.anInt2644 > local11) {
								Static128.anInt2644 = local11;
							}
							local657 = Static84.aByteArrayArrayArray4[local11][local170][local287] & 0xFF;
							local667 = Static58.aByteArrayArrayArray3[local11][local170][local287] & 0xFF;
							if (local657 > 0 || local667 > 0) {
								local682 = Static58.anIntArrayArrayArray5[local11][local170][local287];
								@Pc(692) int local692 = Static58.anIntArrayArrayArray5[local11][local170 + 1][local287];
								@Pc(698) int local698 = Static89.anIntArrayArray19[local170][local287];
								@Pc(708) int local708 = Static58.anIntArrayArrayArray5[local11][local170][local287 + 1];
								@Pc(720) int local720 = Static58.anIntArrayArrayArray5[local11][local170 + 1][local287 + 1];
								@Pc(728) int local728 = Static89.anIntArrayArray19[local170 + 1][local287];
								@Pc(736) int local736 = Static89.anIntArrayArray19[local170][local287 + 1];
								@Pc(738) int local738 = -1;
								@Pc(748) int local748 = Static89.anIntArrayArray19[local170 + 1][local287 + 1];
								@Pc(750) int local750 = -1;
								@Pc(758) int local758;
								@Pc(766) int local766;
								if (local657 > 0) {
									local758 = local203 * 256 / local219;
									@Pc(762) int local762 = local213 / local237;
									local766 = local209 / local237;
									local738 = Static117.method1954(local762, local766, local758);
									local762 += Static61.anInt1540;
									@Pc(782) int local782 = Static46.anInt1194 + local758 & 0xFF;
									if (local762 < 0) {
										local762 = 0;
									} else if (local762 > 255) {
										local762 = 255;
									}
									local750 = Static117.method1954(local762, local766, local782);
								}
								if (local11 > 0) {
									@Pc(811) boolean local811 = true;
									if (local657 == 0 && Static122.aByteArrayArrayArray7[local11][local170][local287] != 0) {
										local811 = false;
									}
									if (local667 > 0 && !Static32.method606(local667 - 1).aBoolean19) {
										local811 = false;
									}
									if (local811 && local692 == local682 && local720 == local682 && local682 == local708) {
										Static123.anIntArrayArrayArray7[local11][local170][local287] |= 0x924;
									}
								}
								local758 = 0;
								if (local750 != -1) {
									local758 = Static91.anIntArray216[Static109.method1890(96, local750)];
								}
								if (local667 == 0) {
									arg0.method803(local11, local170, local287, 0, 0, -1, local682, local692, local720, local708, Static109.method1890(local698, local738), Static109.method1890(local728, local738), Static109.method1890(local748, local738), Static109.method1890(local736, local738), 0, 0, 0, 0, local758, 0);
								} else {
									@Pc(935) byte local935 = Static10.aByteArrayArrayArray1[local11][local170][local287];
									local766 = Static122.aByteArrayArrayArray7[local11][local170][local287] + 1;
									@Pc(953) Class4_Sub4_Sub2 local953 = Static32.method606(local667 - 1);
									@Pc(956) int local956 = local953.anInt581;
									@Pc(964) int local964;
									@Pc(968) int local968;
									@Pc(987) int local987;
									@Pc(993) int local993;
									if (local956 >= 0) {
										local964 = -1;
										local968 = Static91.anInterface2_1.method620(local956);
									} else if (local953.anInt586 == 16711935) {
										local964 = -2;
										local956 = -1;
										local968 = -2;
									} else {
										local964 = Static117.method1954(local953.anInt580, local953.anInt587, local953.anInt571);
										local987 = local953.anInt571 + Static46.anInt1194 & 0xFF;
										local993 = local953.anInt580 + Static61.anInt1540;
										if (local993 < 0) {
											local993 = 0;
										} else if (local993 > 255) {
											local993 = 255;
										}
										local968 = Static117.method1954(local993, local953.anInt587, local987);
									}
									local987 = 0;
									if (local968 != -2) {
										local987 = Static91.anIntArray216[Static63.method1270(96, local968)];
									}
									if (local953.anInt576 != -1) {
										local993 = local953.anInt588 + Static46.anInt1194 & 0xFF;
										@Pc(1055) int local1055 = local953.anInt572 + Static61.anInt1540;
										if (local1055 < 0) {
											local1055 = 0;
										} else if (local1055 > 255) {
											local1055 = 255;
										}
										local968 = Static117.method1954(local1055, local953.anInt583, local993);
										local987 = Static91.anIntArray216[Static63.method1270(96, local968)];
									}
									arg0.method803(local11, local170, local287, local766, local935, local956, local682, local692, local720, local708, Static109.method1890(local698, local738), Static109.method1890(local728, local738), Static109.method1890(local748, local738), Static109.method1890(local736, local738), Static63.method1270(local698, local964), Static63.method1270(local728, local964), Static63.method1270(local748, local964), Static63.method1270(local736, local964), local758, local987);
								}
							}
						}
					}
				}
			}
			for (local190 = 1; local190 < 103; local190++) {
				for (local203 = 1; local203 < 103; local203++) {
					arg0.method802(local11, local203, local190, Static62.method1264(local203, local190, local11));
				}
			}
			Static84.aByteArrayArrayArray4[local11] = null;
			Static58.aByteArrayArrayArray3[local11] = null;
			Static122.aByteArrayArrayArray7[local11] = null;
			Static10.aByteArrayArrayArray1[local11] = null;
			Static36.aByteArrayArrayArray2[local11] = null;
		}
		arg0.method793();
		for (local15 = 0; local15 < 104; local15++) {
			for (local30 = 0; local30 < 104; local30++) {
				if ((Static95.aByteArrayArrayArray5[1][local15][local30] & 0x2) == 2) {
					arg0.method801(local15, local30);
				}
			}
		}
		local141 = 2;
		local30 = 1;
		local143 = 4;
		for (local147 = 0; local147 < 4; local147++) {
			if (local147 > 0) {
				local143 <<= 0x3;
				local141 <<= 0x3;
				local30 <<= 0x3;
			}
			for (local170 = 0; local170 <= local147; local170++) {
				for (local190 = 0; local190 <= 104; local190++) {
					for (local203 = 0; local203 <= 104; local203++) {
						if ((local30 & Static123.anIntArrayArrayArray7[local170][local203][local190]) != 0) {
							local209 = local190;
							local219 = local170;
							local237 = local170;
							while (local209 > 0 && (local30 & Static123.anIntArrayArrayArray7[local170][local203][local209 - 1]) != 0) {
								local209--;
							}
							for (local213 = local190; local213 < 104 && (local30 & Static123.anIntArrayArrayArray7[local170][local203][local213 + 1]) != 0; local213++) {
							}
							label347: while (local219 > 0) {
								for (local287 = local209; local287 <= local213; local287++) {
									if ((local30 & Static123.anIntArrayArrayArray7[local219 - 1][local203][local287]) == 0) {
										break label347;
									}
								}
								local219--;
							}
							label336: while (local237 < local147) {
								for (local287 = local209; local287 <= local213; local287++) {
									if ((local30 & Static123.anIntArrayArrayArray7[local237 + 1][local203][local287]) == 0) {
										break label336;
									}
								}
								local237++;
							}
							local287 = (local213 + 1 - local209) * (local237 + 1 - local219);
							if (local287 >= 8) {
								local555 = Static58.anIntArrayArrayArray5[local237][local203][local209] - 240;
								local657 = Static58.anIntArrayArrayArray5[local219][local203][local209];
								Static44.method800(local147, 1, local203 * 128, local203 * 128, local209 * 128, local213 * 128 + 128, local555, local657);
								for (local667 = local219; local667 <= local237; local667++) {
									for (local682 = local209; local682 <= local213; local682++) {
										Static123.anIntArrayArrayArray7[local667][local203][local682] &= ~local30;
									}
								}
							}
						}
						if ((local141 & Static123.anIntArrayArrayArray7[local170][local203][local190]) != 0) {
							local213 = local203;
							for (local209 = local203; local209 > 0 && (Static123.anIntArrayArrayArray7[local170][local209 - 1][local190] & local141) != 0; local209--) {
							}
							local237 = local170;
							while (local213 < 104 && (Static123.anIntArrayArrayArray7[local170][local213 + 1][local190] & local141) != 0) {
								local213++;
							}
							label401: for (local219 = local170; local219 > 0; local219--) {
								for (local287 = local209; local287 <= local213; local287++) {
									if ((Static123.anIntArrayArrayArray7[local219 - 1][local287][local190] & local141) == 0) {
										break label401;
									}
								}
							}
							label390: while (local237 < local147) {
								for (local287 = local209; local287 <= local213; local287++) {
									if ((Static123.anIntArrayArrayArray7[local237 + 1][local287][local190] & local141) == 0) {
										break label390;
									}
								}
								local237++;
							}
							local287 = (local213 + 1 - local209) * (local237 + 1 - local219);
							if (local287 >= 8) {
								local657 = Static58.anIntArrayArrayArray5[local219][local209][local190];
								local555 = Static58.anIntArrayArrayArray5[local237][local209][local190] - 240;
								Static44.method800(local147, 2, local209 * 128, local213 * 128 + 128, local190 * 128, local190 * 128, local555, local657);
								for (local667 = local219; local667 <= local237; local667++) {
									for (local682 = local209; local682 <= local213; local682++) {
										Static123.anIntArrayArrayArray7[local667][local682][local190] &= ~local141;
									}
								}
							}
						}
						if ((Static123.anIntArrayArrayArray7[local170][local203][local190] & local143) != 0) {
							local213 = local203;
							local209 = local203;
							local237 = local190;
							local219 = local190;
							while (local237 < 104 && (Static123.anIntArrayArrayArray7[local170][local203][local237 + 1] & local143) != 0) {
								local237++;
							}
							while (local219 > 0 && (local143 & Static123.anIntArrayArrayArray7[local170][local203][local219 - 1]) != 0) {
								local219--;
							}
							label456: while (local209 > 0) {
								for (local287 = local219; local287 <= local237; local287++) {
									if ((Static123.anIntArrayArrayArray7[local170][local209 - 1][local287] & local143) == 0) {
										break label456;
									}
								}
								local209--;
							}
							label445: while (local213 < 104) {
								for (local287 = local219; local287 <= local237; local287++) {
									if ((Static123.anIntArrayArrayArray7[local170][local213 + 1][local287] & local143) == 0) {
										break label445;
									}
								}
								local213++;
							}
							if ((local237 + 1 - local219) * ((local213 - local209) + 1) >= 4) {
								local287 = Static58.anIntArrayArrayArray5[local170][local209][local219];
								Static44.method800(local147, 4, local209 * 128, local213 * 128 + 128, local219 * 128, local237 * 128 + 128, local287, local287);
								for (local514 = local209; local514 <= local213; local514++) {
									for (local555 = local219; local555 <= local237; local555++) {
										Static123.anIntArrayArrayArray7[local170][local514][local555] &= ~local143;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public static void method1757() {
		aClass60_980 = null;
		aClass60_981 = null;
		aClass60_982 = null;
		aClass40_71 = null;
	}
}
