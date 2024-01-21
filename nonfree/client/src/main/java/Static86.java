import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1233 = Static118.method2249("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1234 = Static118.method2249("title_mute");

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray19 = new int[104][104];

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "[I")
	public static final int[] anIntArray240 = new int[100];

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1235 = aClass65_1233;

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1236 = Static118.method2249("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
	public static int anInt2066 = 0;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([Lclient!wd;IIIIIIII)V")
	public static void method1464(@OriginalArg(0) Class97[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(23) Class97 local23 = arg0[local18];
			if (local23 != null && (!local23.aBoolean181 || local23.anInt4329 == 0 || local23.aBoolean177 || Static153.method2677(local23) != 0 || Static57.aClass97_5 == local23 || local23.anInt4314 == 1338) && local23.anInt4319 == arg3 && (!local23.aBoolean181 || !Static16.method300(local23))) {
				@Pc(68) int local68 = local23.anInt4318 + arg1;
				@Pc(74) int local74 = local23.anInt4339 + arg4;
				if (local23 == Static195.aClass97_13) {
					Static178.anInt4025 = local68;
					Static107.aBoolean105 = true;
					Static190.anInt4158 = local74;
				}
				@Pc(113) int local113;
				@Pc(100) int local100;
				@Pc(137) int local137;
				@Pc(144) int local144;
				if (local23.anInt4329 == 2) {
					local144 = arg6;
					local137 = arg7;
					local113 = arg5;
					local100 = arg2;
				} else {
					local100 = local68 > arg2 ? local68 : arg2;
					@Pc(106) int local106 = local74 + local23.anInt4353;
					local113 = local74 > arg5 ? local74 : arg5;
					@Pc(118) int local118 = local68 + local23.anInt4354;
					if (local23.anInt4329 == 9) {
						local106++;
						local118++;
					}
					local137 = arg7 > local106 ? local106 : arg7;
					local144 = arg6 > local118 ? local118 : arg6;
				}
				if (!local23.aBoolean181 || local137 > local113 && local144 > local100) {
					if (local23.anInt4314 == 1337) {
						Static25.method448(local23);
					} else {
						if (local23.anInt4314 == 1400) {
							Static132.aClass97_11 = local23;
						}
						if (local23.anInt4329 == 0) {
							if (local23.anInt4314 == 1400) {
								Static89.aBoolean95 = false;
							}
							if (!local23.aBoolean181 && Static16.method300(local23) && Static204.aClass97_16 != local23) {
								continue;
							}
							method1464(arg0, local68 - local23.anInt4342, local100, local23.anInt4376, local74 - local23.anInt4310, local113, local144, local137);
							if (local23.aClass97Array2 != null) {
								method1464(local23.aClass97Array2, local68 - local23.anInt4342, local100, local23.anInt4376, local74 - local23.anInt4310, local113, local144, local137);
							}
							@Pc(255) Class1_Sub20 local255 = (Class1_Sub20) Static200.aClass99_14.method3292((long) local23.anInt4376);
							if (local255 != null) {
								Static158.method2748(local68, local100, local144, local137, local255.anInt3111, local113, local74);
							}
							if (local23.anInt4314 == 1400 && Static89.aBoolean95) {
								return;
							}
						}
						if (local23.aBoolean181) {
							@Pc(305) boolean local305;
							if (local113 <= Static53.anInt1441 && local100 <= Static38.anInt1051 && Static53.anInt1441 < local137 && local144 > Static38.anInt1051) {
								local305 = true;
							} else {
								local305 = false;
							}
							if (local305) {
								Static89.aBoolean95 = true;
							}
							@Pc(314) boolean local314 = false;
							@Pc(316) boolean local316 = false;
							if (Static96.anInt2403 == 1 && local113 <= Static2.anInt67 && Static182.anInt4065 >= local100 && Static2.anInt67 < local137 && Static182.anInt4065 < local144) {
								local314 = true;
							}
							if (Static122.anInt3456 == 1 && local305) {
								local316 = true;
							}
							if (local23.anInt4314 == 1338) {
								if (local314) {
									Static48.method824(Static182.anInt4065 - local68, local23, Static2.anInt67 - local74);
								}
								continue;
							}
							@Pc(433) int local433;
							@Pc(410) int local410;
							if (local23.anInt4314 == 1400) {
								if (local314) {
									if (Static204.aBooleanArray19[82] && Static129.anInt3184 > 0) {
										local410 = Static94.anInt2345 + (int) ((double) (Static2.anInt67 - local23.anInt4353 / 2 - local74) * 2.0D / Static164.aDouble11) + Static57.anInt1532;
										local433 = Static25.anInt737 + Static33.anInt974 - (int) ((double) (-(local23.anInt4354 / 2) + Static182.anInt4065 + -local68) * 2.0D / Static164.aDouble11) - Static23.anInt692;
										@Pc(488) Class65 local488 = Static109.method2004(new Class65[] { Static97.aClass65_1446, Static118.method2250(local410 >> 6), Static200.aClass65_2557, Static118.method2250(local433 >> 6), Static200.aClass65_2557, Static118.method2250(local410 & 0x3F), Static200.aClass65_2557, Static118.method2250(local433 & 0x3F) });
										local488.method2455();
										Static81.method1429(local488);
										Static157.method3230();
									} else {
										Static28.anInt854 = Static38.anInt1051;
										Static172.aBoolean155 = true;
										Static195.anInt4210 = Static23.anInt692;
										Static2.anInt66 = Static53.anInt1441;
										Static157.anInt4279 = Static94.anInt2345;
									}
									continue;
								}
								if (local316 && Static172.aBoolean155) {
									Static181.method3053((int) ((double) (Static2.anInt66 - Static53.anInt1441) * 2.0D / Static119.aDouble9) + Static157.anInt4279);
									Static19.method380(Static195.anInt4210 + (int) ((double) (Static28.anInt854 - Static38.anInt1051) * 2.0D / Static119.aDouble9));
									continue;
								}
								Static172.aBoolean155 = false;
							}
							if (local23.anInt4314 == 1401 && local316) {
								Static126.method2387(local23.anInt4354, Static38.anInt1051 - local68, Static53.anInt1441 + -local74, local23.anInt4353);
							}
							if (local314) {
								Static170.method2880(Static2.anInt67 - local74, local23, Static182.anInt4065 - local68);
							}
							if (Static195.aClass97_13 != null && Static195.aClass97_13 != local23 && local305 && Static101.method1908(Static153.method2677(local23))) {
								Static66.aClass97_7 = local23;
							}
							if (Static57.aClass97_5 == local23) {
								Static188.anInt4137 = local68;
								Static124.anInt3083 = local74;
								Static195.aBoolean167 = true;
							}
							if (local23.aBoolean177) {
								@Pc(616) Class1_Sub26 local616;
								if (local305 && Static11.anInt261 != 0 && local23.anObjectArray11 != null) {
									local616 = new Class1_Sub26();
									local616.aClass97_14 = local23;
									local616.anInt4254 = Static11.anInt261;
									local616.anObjectArray3 = local23.anObjectArray11;
									Static158.aClass91_18.method3151(local616);
								}
								if (Static195.aClass97_13 != null || Static130.aClass97_10 != null || Static198.aBoolean168 || Static172.aBoolean155) {
									local314 = false;
									local316 = false;
									local305 = false;
								}
								if (!local23.aBoolean178 && local314) {
									local23.aBoolean178 = true;
									if (local23.anObjectArray20 != null) {
										local616 = new Class1_Sub26();
										local616.anObjectArray3 = local23.anObjectArray20;
										local616.aClass97_14 = local23;
										local616.anInt4256 = Static2.anInt67 - local74;
										local616.anInt4254 = Static182.anInt4065 - local68;
										Static158.aClass91_18.method3151(local616);
									}
								}
								if (local23.aBoolean178 && local316 && local23.anObjectArray26 != null) {
									local616 = new Class1_Sub26();
									local616.anObjectArray3 = local23.anObjectArray26;
									local616.aClass97_14 = local23;
									local616.anInt4256 = Static53.anInt1441 - local74;
									local616.anInt4254 = Static38.anInt1051 - local68;
									Static158.aClass91_18.method3151(local616);
								}
								if (local23.aBoolean178 && !local316) {
									local23.aBoolean178 = false;
									if (local23.anObjectArray10 != null) {
										local616 = new Class1_Sub26();
										local616.anInt4256 = Static53.anInt1441 - local74;
										local616.aClass97_14 = local23;
										local616.anObjectArray3 = local23.anObjectArray10;
										local616.anInt4254 = Static38.anInt1051 - local68;
										Static156.aClass91_17.method3151(local616);
									}
								}
								if (local316 && local23.anObjectArray27 != null) {
									local616 = new Class1_Sub26();
									local616.anInt4256 = Static53.anInt1441 - local74;
									local616.aClass97_14 = local23;
									local616.anObjectArray3 = local23.anObjectArray27;
									local616.anInt4254 = Static38.anInt1051 - local68;
									Static158.aClass91_18.method3151(local616);
								}
								if (!local23.aBoolean175 && local305) {
									local23.aBoolean175 = true;
									if (local23.anObjectArray6 != null) {
										local616 = new Class1_Sub26();
										local616.aClass97_14 = local23;
										local616.anInt4254 = Static38.anInt1051 - local68;
										local616.anObjectArray3 = local23.anObjectArray6;
										local616.anInt4256 = Static53.anInt1441 - local74;
										Static158.aClass91_18.method3151(local616);
									}
								}
								if (local23.aBoolean175 && local305 && local23.anObjectArray12 != null) {
									local616 = new Class1_Sub26();
									local616.aClass97_14 = local23;
									local616.anObjectArray3 = local23.anObjectArray12;
									local616.anInt4254 = Static38.anInt1051 - local68;
									local616.anInt4256 = Static53.anInt1441 - local74;
									Static158.aClass91_18.method3151(local616);
								}
								if (local23.aBoolean175 && !local305) {
									local23.aBoolean175 = false;
									if (local23.anObjectArray24 != null) {
										local616 = new Class1_Sub26();
										local616.anObjectArray3 = local23.anObjectArray24;
										local616.anInt4256 = Static53.anInt1441 - local74;
										local616.aClass97_14 = local23;
										local616.anInt4254 = Static38.anInt1051 - local68;
										Static156.aClass91_17.method3151(local616);
									}
								}
								if (local23.anObjectArray19 != null) {
									local616 = new Class1_Sub26();
									local616.anObjectArray3 = local23.anObjectArray19;
									local616.aClass97_14 = local23;
									Static112.aClass91_10.method3151(local616);
								}
								@Pc(960) int local960;
								@Pc(975) Class1_Sub26 local975;
								if (local23.anObjectArray16 != null && local23.anInt4326 < Static158.anInt3609) {
									if (local23.anIntArray510 == null || Static158.anInt3609 - local23.anInt4326 > 32) {
										local616 = new Class1_Sub26();
										local616.aClass97_14 = local23;
										local616.anObjectArray3 = local23.anObjectArray16;
										Static158.aClass91_18.method3151(local616);
									} else {
										label398: for (local410 = local23.anInt4326; local410 < Static158.anInt3609; local410++) {
											local433 = Static47.anIntArray118[local410 & 0x1F];
											for (local960 = 0; local960 < local23.anIntArray510.length; local960++) {
												if (local23.anIntArray510[local960] == local433) {
													local975 = new Class1_Sub26();
													local975.anObjectArray3 = local23.anObjectArray16;
													local975.aClass97_14 = local23;
													Static158.aClass91_18.method3151(local975);
													break label398;
												}
											}
										}
									}
									local23.anInt4326 = Static158.anInt3609;
								}
								if (local23.anObjectArray13 != null && Static148.anInt3485 > local23.anInt4361) {
									if (local23.anIntArray513 == null || Static148.anInt3485 - local23.anInt4361 > 32) {
										local616 = new Class1_Sub26();
										local616.aClass97_14 = local23;
										local616.anObjectArray3 = local23.anObjectArray13;
										Static158.aClass91_18.method3151(local616);
									} else {
										label374: for (local410 = local23.anInt4361; local410 < Static148.anInt3485; local410++) {
											local433 = Static105.anIntArray296[local410 & 0x1F];
											for (local960 = 0; local960 < local23.anIntArray513.length; local960++) {
												if (local433 == local23.anIntArray513[local960]) {
													local975 = new Class1_Sub26();
													local975.aClass97_14 = local23;
													local975.anObjectArray3 = local23.anObjectArray13;
													Static158.aClass91_18.method3151(local975);
													break label374;
												}
											}
										}
									}
									local23.anInt4361 = Static148.anInt3485;
								}
								if (local23.anObjectArray5 != null && Static100.anInt2519 > local23.anInt4321) {
									if (local23.anIntArray506 == null || Static100.anInt2519 - local23.anInt4321 > 32) {
										local616 = new Class1_Sub26();
										local616.anObjectArray3 = local23.anObjectArray5;
										local616.aClass97_14 = local23;
										Static158.aClass91_18.method3151(local616);
									} else {
										label350: for (local410 = local23.anInt4321; local410 < Static100.anInt2519; local410++) {
											local433 = Static178.anIntArray458[local410 & 0x1F];
											for (local960 = 0; local960 < local23.anIntArray506.length; local960++) {
												if (local23.anIntArray506[local960] == local433) {
													local975 = new Class1_Sub26();
													local975.anObjectArray3 = local23.anObjectArray5;
													local975.aClass97_14 = local23;
													Static158.aClass91_18.method3151(local975);
													break label350;
												}
											}
										}
									}
									local23.anInt4321 = Static100.anInt2519;
								}
								if (local23.anInt4305 < Static40.anInt1074 && local23.anObjectArray25 != null) {
									local616 = new Class1_Sub26();
									local616.aClass97_14 = local23;
									local616.anObjectArray3 = local23.anObjectArray25;
									Static158.aClass91_18.method3151(local616);
								}
								if (Static68.anInt1494 > local23.anInt4305 && local23.anObjectArray17 != null) {
									local616 = new Class1_Sub26();
									local616.aClass97_14 = local23;
									local616.anObjectArray3 = local23.anObjectArray17;
									Static158.aClass91_18.method3151(local616);
								}
								if (Static131.anInt3262 > local23.anInt4305 && local23.anObjectArray18 != null) {
									local616 = new Class1_Sub26();
									local616.anObjectArray3 = local23.anObjectArray18;
									local616.aClass97_14 = local23;
									Static158.aClass91_18.method3151(local616);
								}
								if (local23.anInt4305 < Static123.anInt3062 && local23.anObjectArray4 != null) {
									local616 = new Class1_Sub26();
									local616.aClass97_14 = local23;
									local616.anObjectArray3 = local23.anObjectArray4;
									Static158.aClass91_18.method3151(local616);
								}
								if (local23.anInt4305 < Static26.anInt783 && local23.anObjectArray28 != null) {
									local616 = new Class1_Sub26();
									local616.anObjectArray3 = local23.anObjectArray28;
									local616.aClass97_14 = local23;
									Static158.aClass91_18.method3151(local616);
								}
								local23.anInt4305 = Static1.anInt4459;
								if (local23.anObjectArray7 != null) {
									for (local410 = 0; local410 < Static60.anInt1557; local410++) {
										@Pc(1328) Class1_Sub26 local1328 = new Class1_Sub26();
										local1328.aClass97_14 = local23;
										local1328.anInt4252 = Static33.anIntArray88[local410];
										local1328.anInt4255 = Static49.anIntArray122[local410];
										local1328.anObjectArray3 = local23.anObjectArray7;
										Static158.aClass91_18.method3151(local1328);
									}
								}
							}
						}
						if (!local23.aBoolean181) {
							if (Static195.aClass97_13 != null || Static130.aClass97_10 != null || Static198.aBoolean168) {
								return;
							}
							if ((local23.anInt4343 >= 0 || local23.anInt4345 != 0) && Static53.anInt1441 >= local113 && local100 <= Static38.anInt1051 && local137 > Static53.anInt1441 && local144 > Static38.anInt1051) {
								if (local23.anInt4343 < 0) {
									Static204.aClass97_16 = local23;
								} else {
									Static204.aClass97_16 = arg0[local23.anInt4343];
								}
							}
							if (local23.anInt4329 == 8 && Static53.anInt1441 >= local113 && local100 <= Static38.anInt1051 && local137 > Static53.anInt1441 && local144 > Static38.anInt1051) {
								Static71.aClass97_8 = local23;
							}
							if (local23.anInt4354 < local23.anInt4341) {
								Static34.method660(Static38.anInt1051, local23.anInt4354, local23, local23.anInt4353 + local74, local23.anInt4341, Static53.anInt1441, local68);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)Z")
	public static boolean method1466(@OriginalArg(0) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}
}
