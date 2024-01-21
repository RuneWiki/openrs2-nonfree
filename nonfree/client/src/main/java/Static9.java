import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ah", name = "M", descriptor = "I")
	public static int anInt226;

	@OriginalMember(owner = "client!ah", name = "V", descriptor = "Lclient!pj;")
	public static Class82 aClass82_1;

	@OriginalMember(owner = "client!ah", name = "Q", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_55 = Static181.method2795("cookiehost");

	@OriginalMember(owner = "client!ah", name = "R", descriptor = "Lclient!me;")
	public static final Class2_Sub19 aClass2_Sub19_1 = new Class2_Sub19(0, 0);

	@OriginalMember(owner = "client!ah", name = "T", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_56 = Static181.method2795("Ablegen");

	@OriginalMember(owner = "client!ah", name = "U", descriptor = "[[[B")
	public static final byte[][][] aByteArrayArrayArray7 = new byte[4][104][104];

	@OriginalMember(owner = "client!ah", name = "W", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_57 = Static181.method2795("Eingabeprozedur geladen)3");

	@OriginalMember(owner = "client!ah", name = "X", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_58 = Static181.method2795(" <col=ffffff>");

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIIIIB)V")
	public static void method146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = arg6 - arg5;
		@Pc(15) int local15 = arg3 - arg1;
		@Pc(24) int local24 = (arg4 - arg2 << 16) / local15;
		@Pc(37) int local37 = (arg0 - arg7 << 16) / local10;
		@Pc(49) boolean local49;
		if (Static206.anInt4068 > 0 && Static206.anInt4068 % 10 < 5) {
			local49 = true;
		} else {
			local49 = false;
		}
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(96) int local96;
		@Pc(104) int local104;
		@Pc(112) int local112;
		@Pc(151) int local151;
		@Pc(157) int local157;
		for (@Pc(55) int local55 = 0; local55 < local15; local55++) {
			@Pc(63) int local63 = local24 * local55 >> 16;
			local71 = local24 * (local55 + 1) >> 16;
			local75 = local71 - local63;
			if (local75 > 0) {
				local63 += arg2;
				@Pc(94) int[][] local94 = Static29.anIntArrayArrayArray2[local55 + arg1 >> 6];
				for (local96 = 0; local96 < local10; local96++) {
					local104 = local37 * local96 >> 16;
					local112 = local37 * (local96 + 1) >> 16;
					@Pc(117) int local117 = local112 - local104;
					if (local117 > 0) {
						@Pc(125) int local125 = arg5 + local96 >> 6;
						local104 += arg7;
						if (local94[local125] != null) {
							local151 = (arg1 + local55 & 0x3F) + ((arg5 + local96 & 0x3F) << 6);
							local157 = local94[local125][local151];
							if (local157 != 0) {
								@Pc(165) Class2_Sub2_Sub20 local165 = Static99.method1689(local157 - 1);
								if (local49 && Static127.anInt2806 == local165.anInt2659) {
									@Pc(175) Class2_Sub12 local175 = new Class2_Sub12();
									local175.anInt1424 = local104;
									local175.anInt1432 = local63;
									local175.anInt1425 = local165.anInt2659;
									Static189.aClass19_19.method684(local175);
								}
								Static130.aClass2_Sub2_Sub17_Sub1Array1[local165.anInt2659].method1905(local63 - 7, local104 + -7);
							}
						}
					}
				}
			}
		}
		if (Static131.aDouble11 == Static49.aDouble10) {
			for (@Pc(221) Class2_Sub7 local221 = (Class2_Sub7) Static118.aClass19_12.method691(); local221 != null; local221 = (Class2_Sub7) Static118.aClass19_12.method686()) {
				local71 = local221.anInt617;
				local71 -= Static154.anInt3114;
				local75 = local221.anInt618;
				local75 = Static177.anInt3615 + Static57.anInt1431 - local75;
				@Pc(256) int local256 = (local71 - arg1) * (arg4 - arg2) / (arg3 - arg1) + arg2;
				local96 = (local75 - arg5) * (arg0 - arg7) / (arg6 - arg5) + arg7;
				local104 = local221.anInt621;
				@Pc(277) Class77 local277 = null;
				if (local104 == 0) {
					if (Static131.aDouble11 == 3.0D) {
						local277 = Static76.aClass77_110;
					}
					if (Static131.aDouble11 == 4.0D) {
						local277 = Static109.aClass77_63;
					}
					if (Static131.aDouble11 == 6.0D) {
						local277 = Static113.aClass77_67;
					}
					if (Static131.aDouble11 == 8.0D) {
						local277 = Static115.aClass77_70;
					}
				}
				local112 = 16777215;
				if (local104 == 1) {
					if (Static131.aDouble11 == 3.0D) {
						local277 = Static113.aClass77_67;
					}
					if (Static131.aDouble11 == 4.0D) {
						local277 = Static115.aClass77_70;
					}
					if (Static131.aDouble11 == 6.0D) {
						local277 = Static105.aClass77_57;
					}
					if (Static131.aDouble11 == 8.0D) {
						local277 = Static196.aClass77_98;
					}
				}
				if (local104 == 2) {
					local112 = 16755200;
					if (Static131.aDouble11 == 3.0D) {
						local277 = Static105.aClass77_57;
					}
					if (Static131.aDouble11 == 4.0D) {
						local277 = Static196.aClass77_98;
					}
					if (Static131.aDouble11 == 6.0D) {
						local277 = Static36.aClass77_25;
					}
					if (Static131.aDouble11 == 8.0D) {
						local277 = Static128.aClass77_75;
					}
				}
				if (local277 != null) {
					@Pc(370) Class83[] local370 = local221.aClass83Array13;
					local151 = local370.length;
					local96 -= local277.method2312() * (local151 - 1) / 2;
					local96 += local277.method2311() / 2;
					for (local157 = 0; local157 < local151; local157++) {
						local277.method2307(local370[local157], local256, local96, local112);
						local96 += local277.method2312();
					}
				}
			}
		}
		for (@Pc(429) Class2_Sub12 local429 = (Class2_Sub12) Static189.aClass19_19.method691(); local429 != null; local429 = (Class2_Sub12) Static189.aClass19_19.method686()) {
			Static130.aClass2_Sub2_Sub17_Sub1Array1[local429.anInt1425].method1905(local429.anInt1432 - 7, local429.anInt1424 - 7);
			Static126.method2127(local429.anInt1432, local429.anInt1424, 15, 16776960, 128);
			Static126.method2127(local429.anInt1432, local429.anInt1424, 7, 16777215, 256);
		}
		Static189.aClass19_19.method685();
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIILclient!qe;I)V")
	public static void method148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class83 arg3) {
		@Pc(4) Class5 local4 = Static201.method3053(arg1, arg0);
		if (local4 == null) {
			return;
		}
		if (local4.anObjectArray11 != null) {
			@Pc(18) Class2_Sub4 local18 = new Class2_Sub4();
			local18.aClass5_3 = local4;
			local18.aClass83_120 = arg3;
			local18.anInt539 = arg2;
			local18.anObjectArray27 = local4.anObjectArray11;
			Static89.method3267(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local4.anInt180 > 0) {
			local36 = Static200.method3031(local4);
		}
		if (!local36 || !Static101.method1744(arg2 - 1, Static138.method2242(local4))) {
			return;
		}
		if (arg2 == 1) {
			Static69.aClass2_Sub3_Sub1_2.method284(137);
			Static69.aClass2_Sub3_Sub1_2.method246(arg0);
			Static69.aClass2_Sub3_Sub1_2.method239(arg1);
		}
		if (arg2 == 2) {
			Static69.aClass2_Sub3_Sub1_2.method284(248);
			Static69.aClass2_Sub3_Sub1_2.method246(arg0);
			Static69.aClass2_Sub3_Sub1_2.method239(arg1);
		}
		if (arg2 == 3) {
			Static69.aClass2_Sub3_Sub1_2.method284(250);
			Static69.aClass2_Sub3_Sub1_2.method246(arg0);
			Static69.aClass2_Sub3_Sub1_2.method239(arg1);
		}
		if (arg2 == 4) {
			Static69.aClass2_Sub3_Sub1_2.method284(6);
			Static69.aClass2_Sub3_Sub1_2.method246(arg0);
			Static69.aClass2_Sub3_Sub1_2.method239(arg1);
		}
		if (arg2 == 5) {
			Static69.aClass2_Sub3_Sub1_2.method284(91);
			Static69.aClass2_Sub3_Sub1_2.method246(arg0);
			Static69.aClass2_Sub3_Sub1_2.method239(arg1);
		}
		if (arg2 == 6) {
			Static69.aClass2_Sub3_Sub1_2.method284(140);
			Static69.aClass2_Sub3_Sub1_2.method246(arg0);
			Static69.aClass2_Sub3_Sub1_2.method239(arg1);
		}
		if (arg2 == 7) {
			Static69.aClass2_Sub3_Sub1_2.method284(225);
			Static69.aClass2_Sub3_Sub1_2.method246(arg0);
			Static69.aClass2_Sub3_Sub1_2.method239(arg1);
		}
		if (arg2 == 8) {
			Static69.aClass2_Sub3_Sub1_2.method284(58);
			Static69.aClass2_Sub3_Sub1_2.method246(arg0);
			Static69.aClass2_Sub3_Sub1_2.method239(arg1);
		}
		if (arg2 == 9) {
			Static69.aClass2_Sub3_Sub1_2.method284(52);
			Static69.aClass2_Sub3_Sub1_2.method246(arg0);
			Static69.aClass2_Sub3_Sub1_2.method239(arg1);
		}
		if (arg2 == 10) {
			Static69.aClass2_Sub3_Sub1_2.method284(122);
			Static69.aClass2_Sub3_Sub1_2.method246(arg0);
			Static69.aClass2_Sub3_Sub1_2.method239(arg1);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!ae;IBI)V")
	public static void method149(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt160 == 1) {
			Static43.method884(arg0.aClass83_26, 0, arg0.anInt159, Static182.aClass83_1067, (short) 26, 0L);
		}
		if (arg0.anInt160 == 2 && !Static142.aBoolean141) {
			@Pc(29) Class83 local29 = Static93.method1605(arg0);
			if (local29 != null) {
				Static43.method884(local29, -1, arg0.anInt159, Static67.method1268(new Class83[] { Static116.aClass83_784, arg0.aClass83_34 }), (short) 50, 0L);
			}
		}
		if (arg0.anInt160 == 3) {
			Static43.method884(Static61.aClass83_476, 0, arg0.anInt159, Static182.aClass83_1067, (short) 7, 0L);
		}
		if (arg0.anInt160 == 4) {
			Static43.method884(arg0.aClass83_26, 0, arg0.anInt159, Static182.aClass83_1067, (short) 36, 0L);
		}
		if (arg0.anInt160 == 5) {
			Static43.method884(arg0.aClass83_26, 0, arg0.anInt159, Static182.aClass83_1067, (short) 24, 0L);
		}
		if (arg0.anInt160 == 6 && Static104.aClass5_11 == null) {
			Static43.method884(arg0.aClass83_26, -1, arg0.anInt159, Static182.aClass83_1067, (short) 14, 0L);
		}
		@Pc(153) int local153;
		@Pc(147) int local147;
		if (arg0.anInt130 == 2) {
			local147 = 0;
			for (@Pc(149) int local149 = 0; local149 < arg0.anInt108; local149++) {
				for (local153 = 0; local153 < arg0.anInt111; local153++) {
					@Pc(162) int local162 = (arg0.anInt104 + 32) * local153;
					@Pc(169) int local169 = local149 * (arg0.anInt118 + 32);
					if (local147 < 20) {
						local162 += arg0.anIntArray14[local147];
						local169 += arg0.anIntArray10[local147];
					}
					if (arg2 >= local162 && local169 <= arg1 && local162 + 32 > arg2 && local169 + 32 > arg1) {
						Static67.anInt1609 = local147;
						Static87.aClass5_10 = arg0;
						if (arg0.anIntArray9[local147] > 0) {
							@Pc(234) Class2_Sub2_Sub3 local234 = Static113.method1987(arg0.anIntArray9[local147] - 1);
							if (Static150.anInt3074 == 1 && Static170.method2645(Static138.method2242(arg0))) {
								if (arg0.anInt159 != Static63.anInt3436 || local147 != Static183.anInt803) {
									Static43.method884(Static206.aClass83_1171, local147, arg0.anInt159, Static67.method1268(new Class83[] { Static99.aClass83_646, Static87.aClass83_598, local234.aClass83_87 }), (short) 18, (long) local234.anInt453);
								}
							} else if (!Static142.aBoolean141 || !Static170.method2645(Static138.method2242(arg0))) {
								@Pc(260) Class83[] local260 = local234.aClass83Array8;
								if (Static78.aBoolean93) {
									local260 = Static71.method1372(local260);
								}
								@Pc(274) int local274;
								@Pc(293) byte local293;
								if (Static170.method2645(Static138.method2242(arg0))) {
									for (local274 = 4; local274 >= 3; local274--) {
										if (local260 != null && local260[local274] != null) {
											if (local274 == 3) {
												local293 = 35;
											} else {
												local293 = 43;
											}
											Static43.method884(local260[local274], local147, arg0.anInt159, Static67.method1268(new Class83[] { Static182.aClass83_1066, local234.aClass83_87 }), local293, (long) local234.anInt453);
										} else if (local274 == 4) {
											Static43.method884(Static31.aClass83_231, local147, arg0.anInt159, Static67.method1268(new Class83[] { Static182.aClass83_1066, local234.aClass83_87 }), (short) 43, (long) local234.anInt453);
										}
									}
								}
								if (Static210.method3194(Static138.method2242(arg0))) {
									Static43.method884(Static206.aClass83_1171, local147, arg0.anInt159, Static67.method1268(new Class83[] { Static182.aClass83_1066, local234.aClass83_87 }), (short) 19, (long) local234.anInt453);
								}
								if (Static170.method2645(Static138.method2242(arg0)) && local260 != null) {
									for (local274 = 2; local274 >= 0; local274--) {
										if (local260[local274] != null) {
											local293 = 0;
											if (local274 == 0) {
												local293 = 46;
											}
											if (local274 == 1) {
												local293 = 25;
											}
											if (local274 == 2) {
												local293 = 34;
											}
											Static43.method884(local260[local274], local147, arg0.anInt159, Static67.method1268(new Class83[] { Static182.aClass83_1066, local234.aClass83_87 }), local293, (long) local234.anInt453);
										}
									}
								}
								local260 = arg0.aClass83Array3;
								if (Static78.aBoolean93) {
									local260 = Static71.method1372(local260);
								}
								if (local260 != null) {
									for (local274 = 4; local274 >= 0; local274--) {
										if (local260[local274] != null) {
											local293 = 0;
											if (local274 == 0) {
												local293 = 16;
											}
											if (local274 == 1) {
												local293 = 51;
											}
											if (local274 == 2) {
												local293 = 41;
											}
											if (local274 == 3) {
												local293 = 22;
											}
											if (local274 == 4) {
												local293 = 29;
											}
											Static43.method884(local260[local274], local147, arg0.anInt159, Static67.method1268(new Class83[] { Static182.aClass83_1066, local234.aClass83_87 }), local293, (long) local234.anInt453);
										}
									}
								}
								Static43.method884(Static104.aClass83_690, local147, arg0.anInt159, Static67.method1268(new Class83[] { Static182.aClass83_1066, local234.aClass83_87 }), (short) 1002, (long) local234.anInt453);
							} else if ((Static75.anInt1757 & 0x10) == 16) {
								Static43.method884(Static171.aClass83_1013, local147, arg0.anInt159, Static67.method1268(new Class83[] { Static163.aClass83_962, Static87.aClass83_598, local234.aClass83_87 }), (short) 28, (long) local234.anInt453);
							}
						}
					}
					local147++;
				}
			}
		}
		if (!arg0.aBoolean7) {
			return;
		}
		if (!Static142.aBoolean141) {
			@Pc(676) Class83 local676;
			for (local147 = 9; local147 >= 5; local147--) {
				local676 = Static16.method1828(local147, arg0);
				if (local676 != null) {
					Static43.method884(local676, arg0.anInt131, arg0.anInt159, arg0.aClass83_35, (short) 1003, (long) (local147 + 1));
				}
			}
			local676 = Static93.method1605(arg0);
			if (local676 != null) {
				Static43.method884(local676, arg0.anInt131, arg0.anInt159, arg0.aClass83_35, (short) 50, 0L);
			}
			for (local153 = 4; local153 >= 0; local153--) {
				@Pc(730) Class83 local730 = Static16.method1828(local153, arg0);
				if (local730 != null) {
					Static43.method884(local730, arg0.anInt131, arg0.anInt159, arg0.aClass83_35, (short) 9, (long) (local153 + 1));
				}
			}
			if (Static102.method1766(Static138.method2242(arg0))) {
				Static43.method884(Static116.aClass83_781, arg0.anInt131, arg0.anInt159, Static182.aClass83_1067, (short) 14, 0L);
			}
		} else if (Static59.method1141(Static138.method2242(arg0)) && (Static75.anInt1757 & 0x20) == 32) {
			Static43.method884(Static171.aClass83_1013, arg0.anInt131, arg0.anInt159, Static67.method1268(new Class83[] { Static163.aClass83_962, Static73.aClass83_534, arg0.aClass83_35 }), (short) 15, 0L);
		}
	}
}
