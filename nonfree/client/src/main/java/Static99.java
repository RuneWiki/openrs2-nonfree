import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!dw", name = "Dc", descriptor = "F")
	public static float aFloat18;

	@OriginalMember(owner = "client!dw", name = "Uc", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray6;

	@OriginalMember(owner = "client!dw", name = "Oc", descriptor = "[I")
	public static final int[] anIntArray251 = new int[1];

	@OriginalMember(owner = "client!dw", name = "Rc", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_43 = new Class40(68, 8);

	@OriginalMember(owner = "client!dw", name = "Vc", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[5];

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IZIIIII)V")
	public static void method1590(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = Static199.anInt3448;
		Static538.anInt9111 = 0;
		@Pc(11) int[] local11 = Static272.anIntArray443;
		@Pc(180) int local180;
		@Pc(201) int local201;
		@Pc(256) int local256;
		@Pc(335) int local335;
		@Pc(424) int local424;
		@Pc(868) int local868;
		@Pc(525) int local525;
		for (@Pc(13) int local13 = 0; local13 < local7 + Static516.anInt8936; local13++) {
			@Pc(17) Class257 local17 = null;
			@Pc(37) Class29_Sub2_Sub1 local37;
			if (local7 <= local13) {
				local37 = ((Class6_Sub28) Static31.aClass212_1.method5106((long) Static274.anIntArray385[local13 - local7])).aClass29_Sub2_Sub1_Sub1_2;
				local17 = ((Class29_Sub2_Sub1_Sub1) local37).aClass257_1;
				if (local17.anIntArray571 != null) {
					local17 = local17.method5935(Static505.aClass30_1);
					if (local17 == null) {
						continue;
					}
				}
			} else {
				local37 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local11[local13]];
			}
			if (local37.anInt8518 >= 0 && (local37.anInt8573 == Static43.anInt710 || Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103 == local37.aByte103)) {
				Static573.method7836(local37.method7010(), arg0 >> 1, local37, arg1 >> 1);
				if (Static550.anIntArray695[0] >= 0) {
					if (local37.aString106 != null && (local13 >= local7 || Static25.anInt481 == 0 || Static25.anInt481 == 3 || Static25.anInt481 == 1 && Static325.method5027(((Class29_Sub2_Sub1_Sub2) local37).aString108)) && Static538.anInt9111 < Static503.anInt1090) {
						Static503.anIntArray78[Static538.anInt9111] = Static338.aClass146_7.method3173(local37.aString106) / 2;
						Static503.anIntArray80[Static538.anInt9111] = Static550.anIntArray695[0];
						Static503.anIntArray79[Static538.anInt9111] = Static550.anIntArray695[1];
						Static503.anIntArray76[Static538.anInt9111] = local37.anInt8533;
						Static503.anIntArray77[Static538.anInt9111] = local37.anInt8521;
						Static503.anIntArray81[Static538.anInt9111] = local37.anInt8524;
						Static503.aStringArray3[Static538.anInt9111] = local37.aString106;
						Static538.anInt9111++;
					}
					local180 = Static550.anIntArray695[1] + arg2;
					@Pc(241) Class4[] local241;
					@Pc(248) Class196[] local248;
					@Pc(308) Class4 local308;
					if (local37.aBoolean598 || Static358.anInt6263 >= local37.anInt8514) {
						local180 -= Math.max(Static338.aClass146_7.anInt3688, Static277.aClass4Array10[0].b());
					} else {
						@Pc(191) byte local191 = 1;
						if (local7 <= local13) {
							local201 = local17.anInt7138;
							if (local201 == -1) {
								local201 = local37.method7009().anInt2897;
							}
						} else {
							@Pc(218) Class29_Sub2_Sub1_Sub2 local218 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local11[local13]];
							local201 = local37.method7009().anInt2897;
							if (local218.aBoolean601) {
								local191 = 2;
							}
						}
						@Pc(230) Class4[] local230 = Static277.aClass4Array10;
						if (local201 != -1) {
							local241 = (Class4[]) Static574.aClass332_152.method7502((long) local201);
							if (local241 == null) {
								local248 = Static589.method4748(Static447.aClass251_141, local201);
								if (local248 != null) {
									local241 = new Class4[local248.length];
									for (local256 = 0; local256 < local248.length; local256++) {
										local241[local256] = Static176.aClass121_5.method7157(local248[local256]);
									}
									Static574.aClass332_152.method7498((long) local201, local241);
								}
							}
							if (local241 != null && local241.length >= 2) {
								local230 = local241;
							}
						}
						if (local191 >= local230.length) {
							local191 = 1;
						}
						@Pc(304) Class4 local304 = local230[0];
						local308 = local230[local191];
						local180 -= Math.max(Static338.aClass146_7.anInt3688, local304.b());
						local256 = Static550.anIntArray695[0] + arg3 - (local304.QA() >> 1);
						local335 = local304.QA() * local37.anInt8564 / 255;
						if (local37.anInt8564 > 0 && local335 < 2) {
							local335 = 2;
						}
						local304.method6514(local256, local180);
						Static176.aClass121_5.Q(local256, local180, local256 + local335, local180 - -local304.b());
						local308.method6514(local256, local180);
						Static176.aClass121_5.ca(arg3, arg2, arg3 + arg1, arg2 - -arg0);
					}
					local180 -= 2;
					if (!local37.aBoolean598) {
						@Pc(407) Class4 local407;
						if (local37.anInt8575 > Static358.anInt6263) {
							local407 = Static567.aClass4Array15[local37.aBoolean599 ? 2 : 0];
							@Pc(416) Class4 local416 = Static567.aClass4Array15[local37.aBoolean599 ? 3 : 1];
							if (local37 instanceof Class29_Sub2_Sub1_Sub1) {
								local424 = local17.anInt7129;
								if (local424 == -1) {
									local424 = local37.method7009().anInt2896;
								}
							} else {
								local424 = local37.method7009().anInt2896;
							}
							if (local424 != -1) {
								local241 = (Class4[]) Static292.aClass332_123.method7502((long) local424);
								if (local241 == null) {
									local248 = Static589.method4748(Static447.aClass251_141, local424);
									if (local248 != null) {
										local241 = new Class4[local248.length];
										for (local256 = 0; local256 < local248.length; local256++) {
											local241[local256] = Static176.aClass121_5.method7157(local248[local256]);
										}
										Static292.aClass332_123.method7498((long) local424, local241);
									}
								}
								if (local241 != null && local241.length == 4) {
									local416 = local241[local37.aBoolean599 ? 3 : 1];
									local407 = local241[local37.aBoolean599 ? 2 : 0];
								}
							}
							@Pc(518) int local518 = local37.anInt8575 - Static358.anInt6263;
							if (local37.anInt8579 >= local518) {
								local525 = local407.QA();
							} else {
								local518 -= local37.anInt8579;
								local256 = local37.anInt8554 == 0 ? 0 : local37.anInt8554 * ((local37.anInt8522 - local518) / local37.anInt8554);
								local525 = local256 * local407.QA() / local37.anInt8522;
							}
							local256 = local407.b();
							local180 -= local256;
							local335 = arg3 + Static550.anIntArray695[0] - (local407.QA() >> 1);
							local407.method6514(local335, local180);
							Static176.aClass121_5.Q(local335, local180, local335 + local525, local180 - -local256);
							local416.method6514(local335, local180);
							local180 -= 2;
							Static176.aClass121_5.ca(arg3, arg2, arg3 + arg1, arg0 + arg2);
						}
						if (local13 < local7) {
							@Pc(648) Class29_Sub2_Sub1_Sub2 local648 = (Class29_Sub2_Sub1_Sub2) local37;
							if (local648.anInt8622 != -1) {
								local180 -= 25;
								Static193.aClass4Array7[local648.anInt8622].method6514(arg3 + Static550.anIntArray695[0] - 12, local180);
								local180 -= 2;
							}
							if (local648.anInt8594 != -1) {
								local180 -= 25;
								Static247.aClass4Array8[local648.anInt8594].method6514(Static550.anIntArray695[0] + arg3 - 12, local180);
								local180 -= 2;
							}
						} else if (local17.anInt7156 >= 0 && Static247.aClass4Array8.length > local17.anInt7156) {
							local407 = Static247.aClass4Array8[local17.anInt7156];
							local180 -= 25;
							local407.method6514(arg3 + Static550.anIntArray695[0] - (local407.QA() >> 1), local180);
							local180 -= 2;
						}
					}
					@Pc(696) Class129[] local696;
					@Pc(704) Class129 local704;
					if (!(local37 instanceof Class29_Sub2_Sub1_Sub2)) {
						local201 = 0;
						local696 = Static34.aClass129Array4;
						for (local424 = 0; local424 < local696.length; local424++) {
							local704 = local696[local424];
							if (local704 != null && local704.anInt3170 == 1 && local704.anInt3177 == Static274.anIntArray385[local13 - local7]) {
								local308 = Static248.aClass4Array9[local704.anInt3171];
								if (local308.b() > local201) {
									local201 = local308.b();
								}
								if (Static358.anInt6263 % 20 < 10) {
									local308.method6514(arg3 + Static550.anIntArray695[0] - 12, local180 + -local308.b());
								}
							}
						}
						if (local201 > 0) {
						}
					} else if (local13 >= 0) {
						local201 = 0;
						local696 = Static34.aClass129Array4;
						for (local424 = 0; local424 < local696.length; local424++) {
							local704 = local696[local424];
							if (local704 != null && local704.anInt3170 == 10 && local11[local13] == local704.anInt3177) {
								local308 = Static248.aClass4Array9[local704.anInt3171];
								if (local308.b() > local201) {
									local201 = local308.b();
								}
								local308.method6514(arg3 + Static550.anIntArray695[0] - 12, -local308.b() + local180);
							}
						}
						if (local201 > 0) {
						}
					}
					for (local201 = 0; local201 < 4; local201++) {
						if (Static358.anInt6263 < local37.anIntArray658[local201]) {
							local868 = local37.method7010() / 2;
							Static573.method7836(local868, arg0 >> 1, local37, arg1 >> 1);
							if (Static550.anIntArray695[0] > -1) {
								local424 = Static174.aClass4Array6[local37.anIntArray659[local201]].QA();
								if (local201 == 1) {
									Static550.anIntArray695[1] -= 20;
								}
								if (local201 == 2) {
									Static550.anIntArray695[0] -= local424 - 9;
									Static550.anIntArray695[1] -= 10;
								}
								if (local201 == 3) {
									Static550.anIntArray695[0] += local424 - 9;
									Static550.anIntArray695[1] -= 10;
								}
								Static174.aClass4Array6[local37.anIntArray659[local201]].method6514(arg3 + Static550.anIntArray695[0] - (local424 >> 1), Static550.anIntArray695[1] + arg2 + -12);
								Static43.aClass56_1.method7866(arg3 + Static550.anIntArray695[0] - 1, 0, Integer.toString(local37.anIntArray657[local201]), Static550.anIntArray695[1] + arg2 + 3, -1);
							}
						}
					}
				}
			}
		}
		@Pc(1023) int local1023;
		for (@Pc(1017) int local1017 = 0; local1017 < Static154.anInt2738; local1017++) {
			local1023 = Static292.anIntArray456[local1017];
			@Pc(1032) Class29_Sub2_Sub1 local1032;
			if (local1023 < 2048) {
				local1032 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local1023];
			} else {
				local1032 = ((Class6_Sub28) Static31.aClass212_1.method5106((long) (local1023 - 2048))).aClass29_Sub2_Sub1_Sub1_2;
			}
			local201 = Static25.anIntArray36[local1017];
			@Pc(1063) Class29_Sub2_Sub1 local1063;
			if (local201 >= 2048) {
				local1063 = ((Class6_Sub28) Static31.aClass212_1.method5106((long) (local201 - 2048))).aClass29_Sub2_Sub1_Sub1_2;
			} else {
				local1063 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local201];
			}
			Static136.method2052(local1063, arg1, arg0, local1032, --local1032.anInt8510, arg3, arg2);
		}
		local1023 = Static338.aClass146_7.anInt3688 + Static338.aClass146_7.anInt3689 + 2;
		for (local180 = 0; local180 < Static538.anInt9111; local180++) {
			local201 = Static503.anIntArray80[local180];
			local868 = Static503.anIntArray79[local180];
			local424 = Static503.anIntArray78[local180];
			@Pc(1116) boolean local1116 = true;
			while (local1116) {
				local1116 = false;
				for (local525 = 0; local525 < local180; local525++) {
					if (Static503.anIntArray79[local525] - local1023 < local868 + 2 && Static503.anIntArray79[local525] + 2 > local868 - local1023 && local201 - local424 < Static503.anIntArray80[local525] - -Static503.anIntArray78[local525] && local201 + local424 > Static503.anIntArray80[local525] + -Static503.anIntArray78[local525] && Static503.anIntArray79[local525] - local1023 < local868) {
						local1116 = true;
						local868 = Static503.anIntArray79[local525] - local1023;
					}
				}
			}
			Static503.anIntArray79[local180] = local868;
			@Pc(1209) String local1209 = Static503.aStringArray3[local180];
			if (Static181.anInt3203 == 0) {
				local256 = 16776960;
				if (Static503.anIntArray76[local180] < 6) {
					local256 = Static19.anIntArray384[Static503.anIntArray76[local180]];
				}
				if (Static503.anIntArray76[local180] == 6) {
					local256 = Static43.anInt710 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static503.anIntArray76[local180] == 7) {
					local256 = Static43.anInt710 % 20 < 10 ? 255 : 65535;
				}
				if (Static503.anIntArray76[local180] == 8) {
					local256 = Static43.anInt710 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static503.anIntArray76[local180] == 9) {
					local335 = 150 - Static503.anIntArray81[local180];
					if (local335 < 50) {
						local256 = local335 * 1280 + 16711680;
					} else if (local335 < 100) {
						local256 = 16776960 - (local335 - 50) * 327680;
					} else if (local335 < 150) {
						local256 = (local335 - 100) * 5 + 65280;
					}
				}
				if (Static503.anIntArray76[local180] == 10) {
					local335 = 150 - Static503.anIntArray81[local180];
					if (local335 < 50) {
						local256 = local335 * 5 + 16711680;
					} else if (local335 < 100) {
						local256 = 16711935 + 16384000 - local335 * 327680;
					} else if (local335 < 150) {
						local256 = (local335 - 100) * 327680 + 500 + 255 - local335 * 5;
					}
				}
				if (Static503.anIntArray76[local180] == 11) {
					local335 = 150 - Static503.anIntArray81[local180];
					if (local335 < 50) {
						local256 = 16777215 - local335 * 327685;
					} else if (local335 < 100) {
						local256 = (local335 - 50) * 327685 + 65280;
					} else if (local335 < 150) {
						local256 = 16777215 + 32768000 - local335 * 327680;
					}
				}
				local335 = local256 | 0xFF000000;
				if (Static503.anIntArray77[local180] == 0) {
					Static408.aClass56_4.method7866(arg3 + local201, -16777216, local1209, arg2 + local868, local335);
				}
				if (Static503.anIntArray77[local180] == 1) {
					Static408.aClass56_4.method7865(Static43.anInt710, local335, local1209, local201 + arg3, arg2 - -local868);
				}
				if (Static503.anIntArray77[local180] == 2) {
					Static408.aClass56_4.method7883(local1209, arg2 + local868, local335, arg3 + local201, Static43.anInt710);
				}
				if (Static503.anIntArray77[local180] == 3) {
					Static408.aClass56_4.method7869(Static43.anInt710, local201 + arg3, local335, 150 - Static503.anIntArray81[local180], arg2 - -local868, local1209);
				}
				@Pc(1554) int local1554;
				if (Static503.anIntArray77[local180] == 4) {
					local1554 = (150 - Static503.anIntArray81[local180]) * (Static338.aClass146_7.method3173(local1209) + 100) / 150;
					Static176.aClass121_5.Q(arg3 + local201 - 50, arg2, local201 + arg3 + 50, arg2 + arg0);
					Static408.aClass56_4.method7879(local1209, local201 + arg3 + 50 - local1554, local335, local868 + arg2, -16777216);
					Static176.aClass121_5.ca(arg3, arg2, arg1 + arg3, arg2 - -arg0);
				}
				if (Static503.anIntArray77[local180] == 5) {
					local1554 = 150 - Static503.anIntArray81[local180];
					@Pc(1614) int local1614 = 0;
					if (local1554 < 25) {
						local1614 = local1554 - 25;
					} else if (local1554 > 125) {
						local1614 = local1554 - 125;
					}
					@Pc(1641) int local1641 = Static338.aClass146_7.anInt3688 + Static338.aClass146_7.anInt3689;
					Static176.aClass121_5.Q(arg3, local868 + arg2 - local1641 - 1, arg1 + arg3, arg2 + local868 + 5);
					Static408.aClass56_4.method7866(local201 + arg3, -16777216, local1209, arg2 + local868 + local1614, local335);
					Static176.aClass121_5.ca(arg3, arg2, arg3 + arg1, arg0 + arg2);
				}
			} else {
				Static408.aClass56_4.method7866(arg3 + local201, -16777216, local1209, arg2 + local868, -256);
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(II)V")
	public static void method1593(@OriginalArg(1) int arg0) {
		if (Static146.anInt2581 == arg0) {
			return;
		}
		if (arg0 == 13) {
			if (Static89.aString25 == null) {
				Static293.method4107(Static177.anInt3167, Static442.aString89, Static87.aString23);
			} else {
				Static416.method6100(Static177.anInt3167);
			}
		}
		if (arg0 != 13 && Static291.aClass71_2 != null) {
			Static291.aClass71_2.method5970();
			Static291.aClass71_2 = null;
		}
		if (arg0 == 3) {
			Static139.method2083(Static563.anInt9402 != Static487.anInt8139);
		}
		if (arg0 == 7) {
			Static566.method7759(Static379.anInt6551 != Static487.anInt8139);
		}
		if (arg0 == 5) {
			if (Static89.aString25 == null) {
				Static575.method7842(Static442.aString89, Static87.aString23);
			} else {
				Static390.method5798();
			}
		} else if (arg0 == 6) {
			if (Static89.aString25 == null) {
				Static293.method4107(Static177.anInt3167, Static442.aString89, Static87.aString23);
			} else {
				Static416.method6100(Static177.anInt3167);
			}
		} else if (arg0 == 9) {
			if (Static89.aString25 == null) {
				Static293.method4107(Static177.anInt3167, Static442.aString89, Static87.aString23);
			} else {
				Static416.method6100(Static177.anInt3167);
			}
		} else if (arg0 == 12) {
			if (Static89.aString25 == null) {
				Static575.method7842(Static442.aString89, Static87.aString23);
			} else {
				Static390.method5798();
			}
		}
		if (Static425.method7745(Static146.anInt2581)) {
			Static28.aClass251_7.anInt6998 = 2;
			Static45.aClass251_17.anInt6998 = 2;
			Static543.aClass251_151.anInt6998 = 2;
			Static529.aClass251_148.anInt6998 = 2;
			Static543.aClass251_150.anInt6998 = 2;
			Static505.aClass251_138.anInt6998 = 2;
			Static310.aClass251_94.anInt6998 = 2;
		}
		if (Static425.method7745(arg0)) {
			Static535.anInt6091 = 1;
			Static274.anInt3318 = 0;
			Static66.anInt1118 = 0;
			Static235.anInt3967 = 0;
			Static79.anInt1330 = 1;
			Static544.method7513(true);
			Static28.aClass251_7.anInt6998 = 1;
			Static45.aClass251_17.anInt6998 = 1;
			Static543.aClass251_151.anInt6998 = 1;
			Static529.aClass251_148.anInt6998 = 1;
			Static543.aClass251_150.anInt6998 = 1;
			Static505.aClass251_138.anInt6998 = 1;
			Static310.aClass251_94.anInt6998 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static32.method457();
		}
		@Pc(237) boolean local237 = arg0 == 2 || Static243.method6089(arg0) || Static21.method291(arg0);
		@Pc(252) boolean local252 = Static146.anInt2581 == 2 || Static243.method6089(Static146.anInt2581) || Static21.method291(Static146.anInt2581);
		if (local252 != local237) {
			if (local237) {
				Static524.anInt8993 = Static318.anInt5763;
				if (Static480.aClass6_Sub37_Sub1_1.anInt6056 == 0) {
					Static244.method3520();
				} else {
					Static453.method6451(Static318.anInt5763, Static375.aClass251_107, Static480.aClass6_Sub37_Sub1_1.anInt6056);
				}
				Static294.aClass175_3.method3742(false);
			} else {
				Static244.method3520();
				Static294.aClass175_3.method3742(true);
			}
		}
		if (Static425.method7745(arg0) || arg0 == 13) {
			Static176.aClass121_5.method7147();
		}
		Static146.anInt2581 = arg0;
	}
}
