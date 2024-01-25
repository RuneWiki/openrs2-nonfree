import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!fe", name = "H", descriptor = "Lclient!wn;")
	public static Class95 aClass95_5;

	@OriginalMember(owner = "client!fe", name = "I", descriptor = "[Lclient!ip;")
	public static Class96[] aClass96Array1;

	@OriginalMember(owner = "client!fe", name = "V", descriptor = "Lclient!wn;")
	public static Class95 aClass95_6;

	@OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
	public static int anInt1607 = 0;

	@OriginalMember(owner = "client!fe", name = "R", descriptor = "[I")
	public static final int[] anIntArray135 = new int[1000];

	@OriginalMember(owner = "client!fe", name = "S", descriptor = "I")
	public static int anInt1610 = 0;

	@OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
	public static int anInt1611 = 0;

	@OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
	public static int anInt1612 = 2;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!bm;IIIIIZIIIILclient!ea;Z)V")
	public static void method1554(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class55 arg10, @OriginalArg(12) boolean arg11) {
		if (!Static288.method5007() && !Static64.method1603(arg7, arg9, Static322.anInt611, arg1)) {
			return;
		}
		if (arg7 < Static339.anInt6583) {
			Static339.anInt6583 = arg7;
		}
		@Pc(29) Class156 local29 = Static111.method1967(arg3);
		if (Static342.anInt6605 == 1 && local29.aBoolean392) {
			return;
		}
		@Pc(50) int local50;
		@Pc(47) int local47;
		if (arg2 == 1 || arg2 == 3) {
			local50 = local29.anInt4769;
			local47 = local29.anInt4775;
		} else {
			local47 = local29.anInt4769;
			local50 = local29.anInt4775;
		}
		@Pc(78) int local78;
		@Pc(71) int local71;
		if (local50 + arg9 <= Static22.anInt481) {
			local71 = (local50 + 1 >> 1) + arg9;
			local78 = arg9 + (local50 >> 1);
		} else {
			local71 = arg9 + 1;
			local78 = arg9;
		}
		@Pc(110) int local110;
		@Pc(103) int local103;
		if (arg1 + local47 <= Static269.anInt5281) {
			local103 = (local47 + 1 >> 1) + arg1;
			local110 = arg1 + (local47 >> 1);
		} else {
			local110 = arg1;
			local103 = arg1 + 1;
		}
		@Pc(122) Class51 local122 = Static8.aClass51Array1[arg4];
		@Pc(145) int local145 = local122.method1856(local78, local110) + local122.method1856(local71, local110) + local122.method1856(local78, local103) + local122.method1856(local71, local103) >> 2;
		@Pc(153) int local153 = (local50 << 6) + (arg9 << 7);
		@Pc(162) int local162 = (arg1 << 7) + (local47 << 6);
		@Pc(173) boolean local173 = arg11 && !arg5 && local29.aBoolean390;
		if (local29.method4227()) {
			Static114.method1985(local29, arg2, arg1, null, null, arg9, arg7);
		}
		@Pc(208) boolean local208 = arg8 == -1 && local29.anInt4736 == -1 && local29.anIntArray434 == null && local29.anIntArray437 == null && !local29.aBoolean397;
		if (Static113.aBoolean160 && local29.anInt4751 != 1) {
			return;
		}
		if (arg6 != 22) {
			@Pc(332) Class4_Sub5 local332;
			@Pc(301) Class4_Sub5_Sub4 local301;
			@Pc(305) int local305;
			@Pc(397) int local397;
			if (arg6 == 10 || arg6 == 11) {
				local301 = null;
				if (local208) {
					@Pc(361) Class4_Sub5_Sub4 local361 = new Class4_Sub5_Sub4(arg10, local29, arg7, arg4, local153, local145, local162, arg5, arg9, local50 + arg9 - 1, arg1, arg1 + local47 - 1, arg6, arg2, local173);
					local332 = local361;
					local305 = local361.method5381();
					local301 = local361;
				} else {
					local305 = 15;
					local332 = new Class4_Sub5_Sub5(arg10, local29, arg6, arg2, arg7, arg4, local153, local145, local162, arg5, arg9, local50 + arg9 - 1, arg1, local47 + arg1 - 1, arg8);
				}
				if (Static78.method1418(local332, false)) {
					if (local301 != null && local301.method5909()) {
						local301.method5911(arg10);
					}
					if (local29.aBoolean398 && arg11) {
						if (local305 > 30) {
							local305 = 30;
						}
						for (local397 = 0; local397 <= local50; local397++) {
							for (@Pc(401) int local401 = 0; local401 <= local47; local401++) {
								local122.method1841(arg9 + local397, local401 + arg1, local305);
							}
						}
					}
				}
				if (local29.anInt4779 != 0 && arg0 != null) {
					arg0.method490(local29.aBoolean391, !local29.aBoolean387, local50, arg1, local47, arg9);
				}
			} else if (arg6 >= 12 && arg6 <= 17 || arg6 >= 18 && arg6 <= 21) {
				if (local208) {
					local301 = new Class4_Sub5_Sub4(arg10, local29, arg7, arg4, local153, local145, local162, arg5, arg9, local50 + arg9 - 1, arg1, arg1 + local47 - 1, arg6, arg2, local173);
					local332 = local301;
					if (local301.method5909()) {
						local301.method5911(arg10);
					}
				} else {
					local332 = new Class4_Sub5_Sub5(arg10, local29, arg6, arg2, arg7, arg4, local153, local145, local162, arg5, arg9, arg9 + local50 - 1, arg1, local47 + arg1 - 1, arg8);
				}
				Static78.method1418(local332, false);
				if (arg11 && !arg5 && arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg7 > 0 && local29.anInt4751 != 0) {
					Static8.aByteArrayArrayArray3[arg7][arg9][arg1] = (byte) (Static8.aByteArrayArrayArray3[arg7][arg9][arg1] | 0x4);
				}
				if (local29.anInt4779 != 0 && arg0 != null) {
					arg0.method490(local29.aBoolean391, !local29.aBoolean387, local50, arg1, local47, arg9);
				}
			} else {
				@Pc(640) Class4_Sub3_Sub2 local640;
				@Pc(624) Class4_Sub3 local624;
				if (arg6 == 0) {
					if (local208) {
						local640 = new Class4_Sub3_Sub2(arg10, local29, arg4, local153, local145, local162, arg5, arg6, arg2, local173);
						if (local640.method5909()) {
							local640.method5911(arg10);
						}
						local624 = local640;
					} else {
						local624 = new Class4_Sub3_Sub1(arg10, local29, 0, arg2, arg7, arg4, local153, local145, local162, arg5, arg8);
					}
					Static119.method3397(arg7, arg9, arg1, local624, null);
					if (arg11) {
						if (arg2 == 0) {
							if (local29.aBoolean398) {
								local122.method1841(arg9, arg1, 50);
								local122.method1841(arg9, arg1 + 1, 50);
							}
							if (local29.anInt4751 == 1 && !arg5) {
								Static8.aByteArrayArrayArray3[arg7][arg9][arg1] = (byte) (Static8.aByteArrayArrayArray3[arg7][arg9][arg1] | 0x1);
							}
						} else if (arg2 == 1) {
							if (local29.aBoolean398) {
								local122.method1841(arg9, arg1 + 1, 50);
								local122.method1841(arg9 + 1, arg1 - -1, 50);
							}
							if (local29.anInt4751 == 1 && !arg5) {
								Static8.aByteArrayArrayArray3[arg7][arg9][arg1 + 1] = (byte) (Static8.aByteArrayArrayArray3[arg7][arg9][arg1 + 1] | 0x2);
							}
						} else if (arg2 == 2) {
							if (local29.aBoolean398) {
								local122.method1841(arg9 + 1, arg1, 50);
								local122.method1841(arg9 + 1, arg1 + 1, 50);
							}
							if (local29.anInt4751 == 1 && !arg5) {
								Static8.aByteArrayArrayArray3[arg7][arg9 + 1][arg1] = (byte) (Static8.aByteArrayArrayArray3[arg7][arg9 + 1][arg1] | 0x1);
							}
						} else if (arg2 == 3) {
							if (local29.aBoolean398) {
								local122.method1841(arg9, arg1, 50);
								local122.method1841(arg9 + 1, arg1, 50);
							}
							if (local29.anInt4751 == 1 && !arg5) {
								Static8.aByteArrayArrayArray3[arg7][arg9][arg1] = (byte) (Static8.aByteArrayArrayArray3[arg7][arg9][arg1] | 0x2);
							}
						}
					}
					if (local29.anInt4779 != 0 && arg0 != null) {
						arg0.method491(arg2, arg1, local29.aBoolean391, arg9, arg6, !local29.aBoolean387);
					}
					if (local29.anInt4741 != 16) {
						Static297.method5153(arg7, arg9, arg1, local29.anInt4741);
					}
				} else if (arg6 == 1) {
					if (local208) {
						local640 = new Class4_Sub3_Sub2(arg10, local29, arg4, local153, local145, local162, arg5, arg6, arg2, local173);
						if (local640.method5909()) {
							local640.method5911(arg10);
						}
						local624 = local640;
					} else {
						local624 = new Class4_Sub3_Sub1(arg10, local29, 1, arg2, arg7, arg4, local153, local145, local162, arg5, arg8);
					}
					Static119.method3397(arg7, arg9, arg1, local624, null);
					if (local29.aBoolean398 && arg11) {
						if (arg2 == 0) {
							local122.method1841(arg9, arg1 + 1, 50);
						} else if (arg2 == 1) {
							local122.method1841(arg9 + 1, arg1 + 1, 50);
						} else if (arg2 == 2) {
							local122.method1841(arg9 + 1, arg1, 50);
						} else if (arg2 == 3) {
							local122.method1841(arg9, arg1, 50);
						}
					}
					if (local29.anInt4779 != 0 && arg0 != null) {
						arg0.method491(arg2, arg1, local29.aBoolean391, arg9, arg6, !local29.aBoolean387);
					}
				} else if (arg6 == 2) {
					local305 = arg2 + 1 & 0x3;
					@Pc(1064) Class4_Sub3 local1064;
					if (local208) {
						@Pc(1082) Class4_Sub3_Sub2 local1082 = new Class4_Sub3_Sub2(arg10, local29, arg4, local153, local145, local162, arg5, arg6, arg2 + 4, local173);
						@Pc(1096) Class4_Sub3_Sub2 local1096 = new Class4_Sub3_Sub2(arg10, local29, arg4, local153, local145, local162, arg5, arg6, local305, local173);
						if (local1082.method5909()) {
							local1082.method5911(arg10);
						}
						local624 = local1082;
						local1064 = local1096;
						if (local1096.method5909()) {
							local1096.method5911(arg10);
						}
					} else {
						local624 = new Class4_Sub3_Sub1(arg10, local29, 2, arg2 + 4, arg7, arg4, local153, local145, local162, arg5, arg8);
						local1064 = new Class4_Sub3_Sub1(arg10, local29, 2, local305, arg7, arg4, local153, local145, local162, arg5, arg8);
					}
					Static119.method3397(arg7, arg9, arg1, local624, local1064);
					if (local29.anInt4751 == 1 && arg11 && !arg5) {
						if (arg2 == 0) {
							Static8.aByteArrayArrayArray3[arg7][arg9][arg1] = (byte) (Static8.aByteArrayArrayArray3[arg7][arg9][arg1] | 0x1);
							Static8.aByteArrayArrayArray3[arg7][arg9][arg1 + 1] = (byte) (Static8.aByteArrayArrayArray3[arg7][arg9][arg1 + 1] | 0x2);
						} else if (arg2 == 1) {
							Static8.aByteArrayArrayArray3[arg7][arg9][arg1 + 1] = (byte) (Static8.aByteArrayArrayArray3[arg7][arg9][arg1 + 1] | 0x2);
							Static8.aByteArrayArrayArray3[arg7][arg9 + 1][arg1] = (byte) (Static8.aByteArrayArrayArray3[arg7][arg9 + 1][arg1] | 0x1);
						} else if (arg2 == 2) {
							Static8.aByteArrayArrayArray3[arg7][arg9 + 1][arg1] = (byte) (Static8.aByteArrayArrayArray3[arg7][arg9 + 1][arg1] | 0x1);
							Static8.aByteArrayArrayArray3[arg7][arg9][arg1] = (byte) (Static8.aByteArrayArrayArray3[arg7][arg9][arg1] | 0x2);
						} else if (arg2 == 3) {
							Static8.aByteArrayArrayArray3[arg7][arg9][arg1] = (byte) (Static8.aByteArrayArrayArray3[arg7][arg9][arg1] | 0x2);
							Static8.aByteArrayArrayArray3[arg7][arg9][arg1] = (byte) (Static8.aByteArrayArrayArray3[arg7][arg9][arg1] | 0x1);
						}
					}
					if (local29.anInt4779 != 0 && arg0 != null) {
						arg0.method491(arg2, arg1, local29.aBoolean391, arg9, arg6, !local29.aBoolean387);
					}
					if (local29.anInt4741 != 16) {
						Static297.method5153(arg7, arg9, arg1, local29.anInt4741);
					}
				} else if (arg6 == 3) {
					if (local208) {
						local640 = new Class4_Sub3_Sub2(arg10, local29, arg4, local153, local145, local162, arg5, arg6, arg2, local173);
						if (local640.method5909()) {
							local640.method5911(arg10);
						}
						local624 = local640;
					} else {
						local624 = new Class4_Sub3_Sub1(arg10, local29, 3, arg2, arg7, arg4, local153, local145, local162, arg5, arg8);
					}
					Static119.method3397(arg7, arg9, arg1, local624, null);
					if (local29.aBoolean398 && arg11) {
						if (arg2 == 0) {
							local122.method1841(arg9, arg1 + 1, 50);
						} else if (arg2 == 1) {
							local122.method1841(arg9 + 1, arg1 + 1, 50);
						} else if (arg2 == 2) {
							local122.method1841(arg9 + 1, arg1, 50);
						} else if (arg2 == 3) {
							local122.method1841(arg9, arg1, 50);
						}
					}
					if (local29.anInt4779 != 0 && arg0 != null) {
						arg0.method491(arg2, arg1, local29.aBoolean391, arg9, arg6, !local29.aBoolean387);
					}
				} else if (arg6 == 9) {
					if (local208) {
						local301 = new Class4_Sub5_Sub4(arg10, local29, arg7, arg4, local153, local145, local162, arg5, arg9, arg9, arg1, arg1, arg6, arg2, local173);
						local332 = local301;
						if (local301.method5909()) {
							local301.method5911(arg10);
						}
					} else {
						local332 = new Class4_Sub5_Sub5(arg10, local29, arg6, arg2, arg7, arg4, local153, local145, local162, arg5, arg9, local50 + arg9 - 1, arg1, arg1 + local47 - 1, arg8);
					}
					Static78.method1418(local332, false);
					if (local29.anInt4779 != 0 && arg0 != null) {
						arg0.method490(local29.aBoolean391, !local29.aBoolean387, local50, arg1, local47, arg9);
					}
					if (local29.anInt4741 != 16) {
						Static297.method5153(arg7, arg9, arg1, local29.anInt4741);
					}
				} else {
					@Pc(1588) Class4_Sub1 local1588;
					if (arg6 == 4) {
						if (local208) {
							@Pc(1586) Class4_Sub1_Sub2 local1586 = new Class4_Sub1_Sub2(arg10, local29, arg4, local153, local145, local162, arg5, 0, 0, 0, arg6, arg2);
							local1588 = local1586;
							if (local1586.method5909()) {
								local1586.method5911(arg10);
							}
						} else {
							local1588 = new Class4_Sub1_Sub1(arg10, local29, arg6, arg2, arg7, arg4, local153, local145, local162, arg5, 0, 0, 0, arg8);
						}
						Static192.method3437(arg7, arg9, arg1, local1588, null);
					} else {
						@Pc(1630) int local1630;
						@Pc(1636) Interface5 local1636;
						@Pc(1699) Class4_Sub1_Sub2 local1699;
						if (arg6 == 5) {
							local1630 = 16;
							local1636 = (Interface5) Static330.method5730(arg7, arg9, arg1);
							if (local1636 != null) {
								local1630 = Static111.method1967(local1636.method5910()).anInt4741;
							}
							if (local208) {
								local1699 = new Class4_Sub1_Sub2(arg10, local29, arg4, local153, local145, local162, arg5, 0, local1630 * Static259.anIntArray492[arg2], Static97.anIntArray163[arg2] * local1630, arg6, arg2);
								if (local1699.method5909()) {
									local1699.method5911(arg10);
								}
								local1588 = local1699;
							} else {
								local1588 = new Class4_Sub1_Sub1(arg10, local29, arg6, arg2, arg7, arg4, local153, local145, local162, arg5, 0, Static259.anIntArray492[arg2] * local1630, local1630 * Static97.anIntArray163[arg2], arg8);
							}
							Static192.method3437(arg7, arg9, arg1, local1588, null);
						} else if (arg6 == 6) {
							local1630 = 8;
							local1636 = (Interface5) Static330.method5730(arg7, arg9, arg1);
							if (local1636 != null) {
								local1630 = Static111.method1967(local1636.method5910()).anInt4741 / 2;
							}
							if (local208) {
								local1699 = new Class4_Sub1_Sub2(arg10, local29, arg4, local153, local145, local162, arg5, arg2, Static259.anIntArray492[arg2] * local1630, Static97.anIntArray163[arg2] * local1630, arg6, arg2 + 4);
								local1588 = local1699;
								if (local1699.method5909()) {
									local1699.method5911(arg10);
								}
							} else {
								local1588 = new Class4_Sub1_Sub1(arg10, local29, arg6, arg2 + 4, arg7, arg4, local153, local145, local162, arg5, arg2, local1630 * Static250.anIntArray484[arg2], local1630 * Static276.anIntArray562[arg2], arg8);
							}
							Static192.method3437(arg7, arg9, arg1, local1588, null);
						} else if (arg6 == 7) {
							local1630 = arg2 + 2 & 0x3;
							if (local208) {
								@Pc(1866) Class4_Sub1_Sub2 local1866 = new Class4_Sub1_Sub2(arg10, local29, arg4, local153, local145, local162, arg5, local1630, 0, 0, arg6, local1630 + 4);
								if (local1866.method5909()) {
									local1866.method5911(arg10);
								}
								local1588 = local1866;
							} else {
								local1588 = new Class4_Sub1_Sub1(arg10, local29, arg6, local1630 + 4, arg7, arg4, local153, local145, local162, arg5, local1630, 0, 0, arg8);
							}
							Static192.method3437(arg7, arg9, arg1, local1588, null);
						} else if (arg6 == 8) {
							local305 = arg2 + 2 & 0x3;
							local397 = 8;
							@Pc(1902) Interface5 local1902 = (Interface5) Static330.method5730(arg7, arg9, arg1);
							if (local1902 != null) {
								local397 = Static111.method1967(local1902.method5910()).anInt4741 / 2;
							}
							@Pc(1943) Class4_Sub1 local1943;
							@Pc(1963) Class4_Sub1 local1963;
							if (local208) {
								local1943 = new Class4_Sub1_Sub2(arg10, local29, arg4, local153, local145, local162, arg5, arg2, local397 * Static250.anIntArray484[arg2], Static276.anIntArray562[arg2] * local397, arg6, arg2 + 4);
								local1963 = new Class4_Sub1_Sub2(arg10, local29, arg4, local153, local145, local162, arg5, arg2, 0, 0, arg6, local305 + 4);
								if (local1943.method5909()) {
									local1943.method5911(arg10);
								}
								if (local1963.method5909()) {
									local1963.method5911(arg10);
								}
							} else {
								local1943 = new Class4_Sub1_Sub1(arg10, local29, arg6, arg2 + 4, arg7, arg4, local153, local145, local162, arg5, arg2, local397 * Static250.anIntArray484[arg2], local397 * Static276.anIntArray562[arg2], arg8);
								local1963 = new Class4_Sub1_Sub1(arg10, local29, arg6, local305 + 4, arg7, arg4, local153, local145, local162, arg5, arg2, 0, 0, arg8);
							}
							Static192.method3437(arg7, arg9, arg1, local1943, local1963);
						}
					}
				}
			}
		} else if (Static323.aBoolean522 || local29.anInt4756 != 0 || local29.anInt4779 == 1 || local29.aBoolean394) {
			@Pc(249) Class4_Sub4 local249;
			if (local208) {
				@Pc(264) Class4_Sub4_Sub1 local264 = new Class4_Sub4_Sub1(arg10, local29, arg4, local153, local145, local162, arg5, arg2, local173);
				if (local264.method5909()) {
					local264.method5911(arg10);
				}
				local249 = local264;
			} else {
				local249 = new Class4_Sub4_Sub2(arg10, local29, arg2, arg7, arg4, local153, local145, local162, arg5, arg8);
			}
			Static24.method5485(arg7, arg9, arg1, local249);
			if (local29.anInt4779 == 1 && arg0 != null) {
				arg0.method484(arg9, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)V")
	public static void method1555() {
		Static1.aClass109_1.method2859(5);
		Static69.aClass109_18.method2859(5);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II[ILclient!bm;I[IIIIZIBIII)I")
	public static int method1556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class24 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static107.anIntArrayArray75[local7][local11] = 0;
				Static240.anIntArrayArray76[local7][local11] = 99999999;
			}
		}
		@Pc(66) boolean local66;
		if (arg4 == 1) {
			local66 = Static248.method4431(arg10, arg11, arg1, arg13, arg8, arg3, arg6, arg12, arg7, arg0);
		} else if (arg4 == 2) {
			local66 = Static177.method3178(arg11, arg12, arg6, arg1, arg7, arg0, arg13, arg10, arg8, arg3);
		} else {
			local66 = Static10.method176(arg8, arg4, arg11, arg0, arg12, arg7, arg10, arg3, arg1, arg6, arg13);
		}
		@Pc(101) int local101 = arg1 - 64;
		@Pc(105) int local105 = arg13 - 64;
		@Pc(107) int local107 = Static42.anInt742;
		@Pc(109) int local109 = Static63.anInt5184;
		@Pc(117) int local117;
		@Pc(119) int local119;
		@Pc(126) int local126;
		if (!local66) {
			if (!arg9) {
				return -1;
			}
			local117 = Integer.MAX_VALUE;
			local119 = Integer.MAX_VALUE;
			for (local126 = arg11 - 10; local126 <= arg11 + 10; local126++) {
				for (@Pc(133) int local133 = arg10 - 10; local133 <= arg10 + 10; local133++) {
					@Pc(139) int local139 = local126 - local101;
					@Pc(144) int local144 = local133 - local105;
					if (local139 >= 0 && local144 >= 0 && local139 < 128 && local144 < 128 && Static240.anIntArrayArray76[local139][local144] < 100) {
						@Pc(172) int local172 = 0;
						if (local126 < arg11) {
							local172 = arg11 - local126;
						} else if (arg7 + arg11 - 1 < local126) {
							local172 = local126 + 1 - arg7 - arg11;
						}
						@Pc(203) int local203 = 0;
						if (arg10 > local133) {
							local203 = arg10 - local133;
						} else if (local133 > arg10 + arg8 - 1) {
							local203 = local133 + 1 - arg8 - arg10;
						}
						@Pc(241) int local241 = local172 * local172 + local203 * local203;
						if (local241 < local117 || local241 == local117 && local119 > Static240.anIntArrayArray76[local139][local144]) {
							local119 = Static240.anIntArrayArray76[local139][local144];
							local117 = local241;
							local109 = local133;
							local107 = local126;
						}
					}
				}
			}
			if (local117 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (local107 == arg1 && local109 == arg13) {
			return 0;
		}
		@Pc(301) byte local301 = 0;
		Static85.anIntArray131[0] = local107;
		local117 = local301 + 1;
		Static352.anIntArray637[0] = local109;
		@Pc(323) int local323;
		local119 = local323 = Static107.anIntArrayArray75[local107 - local101][local109 - local105];
		while (arg1 != local107 || arg13 != local109) {
			if (local323 != local119) {
				local323 = local119;
				Static85.anIntArray131[local117] = local107;
				Static352.anIntArray637[local117++] = local109;
			}
			if ((local119 & 0x1) != 0) {
				local109++;
			} else if ((local119 & 0x4) != 0) {
				local109--;
			}
			if ((local119 & 0x2) != 0) {
				local107++;
			} else if ((local119 & 0x8) != 0) {
				local107--;
			}
			local119 = Static107.anIntArrayArray75[local107 - local101][local109 - local105];
		}
		local126 = 0;
		while (local117-- > 0) {
			arg2[local126] = Static85.anIntArray131[local117];
			arg5[local126++] = Static352.anIntArray637[local117];
			if (local126 >= arg2.length) {
				break;
			}
		}
		return local126;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZLclient!ok;Ljava/lang/String;)V")
	public static void method1557(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class18 arg1, @OriginalArg(3) String arg2) {
		@Pc(20) int local20 = Static92.aClass36_4.method642(arg2, null, 250);
		@Pc(29) int local29 = Static92.aClass36_4.method643(250, null, arg2) * 13;
		Static236.aClass55_9.method5205(6, 6, local20 + 4 + 4, local29 - -4 + 4, -16777216, 0);
		Static236.aClass55_9.method5204(6, 6, local20 + 4 + 4, local29 + 4 + 4, -1, 0);
		arg1.method4178(-1, 1, arg2, -1, 0, local29, 1, null, 10, null, null, 10, 0, 0, local20);
		Static184.method5033(6, local29 + 4 + 4, local20 + 4 + 4, 6);
		if (arg0) {
			Static236.aClass55_9.method5159();
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)V")
	public static void method1558() {
		@Pc(1) Class109 local1 = Static28.aClass109_13;
		synchronized (Static28.aClass109_13) {
			Static28.aClass109_13.method2859(5);
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(IB)Lclient!rr;")
	public static Class5_Sub1_Sub17 method1559(@OriginalArg(0) int arg0) {
		@Pc(15) Class5_Sub1_Sub17 local15 = (Class5_Sub1_Sub17) Static151.aClass122_7.method3177((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static310.aClass93_126.method2410(arg0, 11);
		local15 = new Class5_Sub1_Sub17();
		if (local25 != null) {
			local15.method4950(new Class5_Sub12(local25));
		}
		Static151.aClass122_7.method3181((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "(B)V")
	public static void method1560() {
		if (Static278.anInt5495 == 10 || Static278.anInt5495 == 28) {
			Static332.method6048(Static271.anInt5301 >> 10, Static21.anInt466 >> 10);
		} else {
			Static332.method6048(Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0] >> 3, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0] >> 3);
		}
		Static102.method1832();
		Static96.method1760();
		Static14.method283();
		Static48.method801();
	}
}
