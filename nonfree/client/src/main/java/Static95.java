import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "Lclient!kg;")
	public static Class112 aClass112_7 = null;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BLclient!fp;II)V")
	public static void method1827(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 0 || arg2 < 0 || Static46.anInt1184 == 0 || Static356.anInt6801 == 0) {
			return;
		}
		arg0.method4590(Static181.anInt3700, Static199.anInt4041, Static46.anInt1184, Static356.anInt6801);
		arg0.method4566(Static33.anInt829, Static342.anInt6501, Static46.anInt1184, Static356.anInt6801);
		@Pc(38) Class129 local38 = arg0.method4573();
		local38.method5780(Static29.anInt673, Static270.anInt5275, Static207.anInt4089, Static244.anInt4998, Static264.anInt5207, Static281.anInt5477);
		arg0.method4596(local38);
		@Pc(66) int local66;
		@Pc(75) int local75;
		@Pc(78) int local78;
		@Pc(87) int local87;
		@Pc(96) int local96;
		@Pc(111) int[] local111;
		@Pc(142) int local142;
		@Pc(151) int local151;
		if (Static50.aClass36Array3 != null) {
			@Pc(53) int local53 = -1;
			@Pc(55) int local55 = -1;
			@Pc(58) int local58 = arg0.method4593();
			local66 = (arg1 - Static181.anInt3700) * local58 / Static46.anInt1184;
			local75 = local58 * (arg2 - Static199.anInt4041) / Static356.anInt6801;
			local78 = arg0.method4569();
			local87 = (arg1 - Static181.anInt3700) * local78 / Static46.anInt1184;
			local96 = (arg2 - Static199.anInt4041) * local78 / Static356.anInt6801;
			local111 = new int[] { local66, local75, local58 };
			local38.method5785(local111);
			@Pc(129) int[] local129 = new int[] { local87, local96, local78 };
			local38.method5785(local129);
			@Pc(134) float local134 = 0.0F;
			local142 = local129[0] - local111[0];
			local151 = local129[1] - local111[1];
			@Pc(160) int local160 = local129[2] - local111[2];
			while (local134 < 1.0F) {
				@Pc(173) int local173 = (int) ((float) local142 * local134 + (float) local111[0]);
				@Pc(177) int local177 = local173 >> 7;
				@Pc(188) int local188 = (int) ((float) local111[2] + local134 * (float) local160);
				@Pc(192) int local192 = local188 >> 7;
				if (local177 > 0 && local192 > 0 && local177 < Static311.anInt5653 && Static189.anInt3820 > local192) {
					@Pc(211) int local211 = Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79;
					if (local211 < 3 && (Static264.aByteArrayArrayArray7[1][local177][local192] & 0x2) != 0) {
						local211++;
					}
					if ((float) Static50.aClass36Array3[local211].method4433(local173, local188) < (float) local151 * local134 + (float) local111[1]) {
						local53 = local173 + Static191.aClass11_Sub2_Sub6_Sub1_4.method5894() * 64 - 64 >> 7;
						local55 = local188 + (Static191.aClass11_Sub2_Sub6_Sub1_4.method5894() - 1) * 64 >> 7;
						break;
					}
				}
				local134 = (float) ((double) local134 + 0.01D);
			}
			if (local53 != -1 && local55 != -1) {
				if (Static77.aBoolean119 && (Static127.anInt2772 & 0x40) != 0) {
					@Pc(339) Class112 local339 = Static147.method2868(Static166.anInt3467, Static9.anInt239);
					if (local339 == null) {
						Static89.method1874();
					} else {
						Static295.method5151(Static62.anInt1506, local55, false, true, Static365.aString65, 0L, " ->", 45, local53);
					}
				} else {
					if (Static215.aClass81_2 == Static285.aClass81_4) {
						Static295.method5151(-1, local55, false, true, Static101.aClass106_79.method2927(Static254.anInt5172), 0L, "", 49, local53);
					}
					Static295.method5151(-1, local55, false, true, Static325.aString48, 0L, "", 18, local53);
				}
			}
		}
		@Pc(358) Class195 local358 = Static40.aClass195_2;
		for (@Pc(363) Class32_Sub7 local363 = (Class32_Sub7) local358.method5302(); local363 != null; local363 = (Class32_Sub7) local358.method5298()) {
			if (local363.anInt6246 == Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79 && local363.method5578(arg0, arg2, arg1)) {
				@Pc(482) int local482;
				if (local363.aClass11_1 instanceof Class11_Sub2_Sub6_Sub1) {
					@Pc(385) Class11_Sub2_Sub6_Sub1 local385 = (Class11_Sub2_Sub6_Sub1) local363.aClass11_1;
					local66 = local385.method5894();
					if ((local66 & 0x1) == 0 && (local385.anInt6729 & 0x7F) == 0 && (local385.anInt6726 & 0x7F) == 0 || (local66 & 0x1) == 1 && (local385.anInt6729 & 0x7F) == 64 && (local385.anInt6726 & 0x7F) == 64) {
						local75 = local385.anInt6729 + 64 - local385.method5894() * 64;
						local78 = local385.anInt6726 + 64 - local385.method5894() * 64;
						@Pc(493) int local493;
						for (local87 = 0; local87 < Static277.anInt5394; local87++) {
							@Pc(459) Class11_Sub2_Sub6_Sub2 local459 = Static231.aClass11_Sub2_Sub6_Sub2Array1[Static81.anIntArray143[local87]];
							if (local459 != null && Static51.anInt1301 != local459.anInt6754 && local459.aBoolean502) {
								local482 = local459.anInt6729 - (local459.aClass208_1.anInt6162 - 1) * 64;
								local493 = local459.anInt6726 - (local459.aClass208_1.anInt6162 - 1) * 64;
								if (local482 >= local75 && local459.aClass208_1.anInt6162 <= local385.method5894() - (local482 - local75 >> 7) && local493 >= local78 && local459.aClass208_1.anInt6162 <= local385.method5894() - (local493 - local78 >> 7)) {
									Static171.method3203(local363.anInt6246 != Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79, local459);
									local459.anInt6754 = Static51.anInt1301;
								}
							}
						}
						local96 = Static99.anInt2276;
						local111 = Static238.anIntArray382;
						for (local493 = 0; local493 < local96; local493++) {
							@Pc(566) Class11_Sub2_Sub6_Sub1 local566 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local111[local493]];
							if (local566 != null && Static51.anInt1301 != local566.anInt6754 && local385 != local566 && local566.aBoolean502) {
								local142 = local566.anInt6729 - (local566.method5894() - 1) * 64;
								local151 = local566.anInt6726 + 64 - local566.method5894() * 64;
								if (local75 <= local142 && local566.method5894() <= local385.method5894() - (local142 - local75 >> 7) && local151 >= local78 && local566.method5894() <= local385.method5894() - (local151 - local78 >> 7)) {
									Static243.method4538(local363.anInt6246 != Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79, local566);
									local566.anInt6754 = Static51.anInt1301;
								}
							}
						}
					}
					if (local385.anInt6754 == Static51.anInt1301) {
						continue;
					}
					Static243.method4538(local363.anInt6246 != Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79, local385);
					local385.anInt6754 = Static51.anInt1301;
				}
				if (local363.aClass11_1 instanceof Class11_Sub2_Sub6_Sub2) {
					@Pc(698) Class11_Sub2_Sub6_Sub2 local698 = (Class11_Sub2_Sub6_Sub2) local363.aClass11_1;
					if (local698.aClass208_1 != null) {
						if ((local698.aClass208_1.anInt6162 & 0x1) == 0 && (local698.anInt6729 & 0x7F) == 0 && (local698.anInt6726 & 0x7F) == 0 || (local698.aClass208_1.anInt6162 & 0x1) == 1 && (local698.anInt6729 & 0x7F) == 64 && (local698.anInt6726 & 0x7F) == 64) {
							local66 = local698.anInt6729 - (local698.aClass208_1.anInt6162 - 1) * 64;
							local75 = local698.anInt6726 - (local698.aClass208_1.anInt6162 - 1) * 64;
							for (local78 = 0; local78 < Static277.anInt5394; local78++) {
								@Pc(773) Class11_Sub2_Sub6_Sub2 local773 = Static231.aClass11_Sub2_Sub6_Sub2Array1[Static81.anIntArray143[local78]];
								if (local773 != null && Static51.anInt1301 != local773.anInt6754 && local698 != local773 && local773.aBoolean502) {
									local96 = local773.anInt6729 + 64 - local773.aClass208_1.anInt6162 * 64;
									local482 = local773.anInt6726 + 64 - local773.aClass208_1.anInt6162 * 64;
									if (local96 >= local66 && local773.aClass208_1.anInt6162 <= local698.aClass208_1.anInt6162 - (local96 - local66 >> 7) && local482 >= local75 && local698.aClass208_1.anInt6162 - (local482 - local75 >> 7) >= local773.aClass208_1.anInt6162) {
										Static171.method3203(local363.anInt6246 != Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79, local773);
										local773.anInt6754 = Static51.anInt1301;
									}
								}
							}
							local87 = Static99.anInt2276;
							@Pc(889) int[] local889 = Static238.anIntArray382;
							for (local482 = 0; local482 < local87; local482++) {
								@Pc(899) Class11_Sub2_Sub6_Sub1 local899 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local889[local482]];
								if (local899 != null && Static51.anInt1301 != local899.anInt6754 && local899.aBoolean502) {
									@Pc(925) int local925 = local899.anInt6729 - (local899.method5894() - 1) * 64;
									local142 = local899.anInt6726 + 64 - local899.method5894() * 64;
									if (local66 <= local925 && local899.method5894() <= local698.aClass208_1.anInt6162 - (local925 - local66 >> 7) && local142 >= local75 && local899.method5894() <= local698.aClass208_1.anInt6162 - (local142 - local75 >> 7)) {
										Static243.method4538(Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79 != local363.anInt6246, local899);
										local899.anInt6754 = Static51.anInt1301;
									}
								}
							}
						}
						if (local698.anInt6754 == Static51.anInt1301) {
							continue;
						}
						Static171.method3203(Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79 != local363.anInt6246, local698);
						local698.anInt6754 = Static51.anInt1301;
					}
				}
				if (local363.aClass11_1 instanceof Class11_Sub3_Sub1) {
					@Pc(1043) Class1_Sub3 local1043 = (Class1_Sub3) Static46.aClass38_4.method1475((long) (local363.anInt6248 | local363.anInt6246 << 28 | local363.anInt6247 << 14));
					if (local1043 != null) {
						for (@Pc(1051) Class1_Sub23 local1051 = (Class1_Sub23) local1043.aClass42_1.method1544(); local1051 != null; local1051 = (Class1_Sub23) local1043.aClass42_1.method1547()) {
							@Pc(1059) Class22 local1059 = Static243.aClass220_2.method5972(local1051.anInt2967);
							if (!Static77.aBoolean119) {
								if (local363.anInt6246 == Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79) {
									@Pc(1137) String[] local1137 = local1059.aStringArray3;
									for (local87 = 4; local87 >= 0; local87--) {
										if (local1137 != null && local1137[local87] != null) {
											@Pc(1149) byte local1149 = 0;
											if (local87 == 0) {
												local1149 = 30;
											}
											local482 = Static324.anInt6150;
											if (local87 == 1) {
												local1149 = 5;
											}
											if (local87 == 2) {
												local1149 = 19;
											}
											if (local87 == 3) {
												local1149 = 58;
											}
											if (local1059.anInt916 == local87) {
												local482 = local1059.anInt884;
											}
											if (local87 == 4) {
												local1149 = 46;
											}
											if (local1059.anInt858 == local87) {
												local482 = local1059.anInt895;
											}
											Static295.method5151(local482, local363.anInt6247, false, true, local1137[local87], (long) local1051.anInt2967, "<col=ff9040>" + local1059.aString2, local1149, local363.anInt6248);
										}
									}
								}
								Static295.method5151(Static270.anInt5273, local363.anInt6247, local363.anInt6246 != Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79, true, Static351.aClass106_95.method2927(Static254.anInt5172), (long) local1051.anInt2967, "<col=ff9040>" + local1059.aString2, 1010, local363.anInt6248);
							} else if (local363.anInt6246 == Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79) {
								@Pc(1075) Class1_Sub4_Sub6 local1075 = Static37.anInt936 == -1 ? null : Static296.method5175(Static37.anInt936);
								if ((Static127.anInt2772 & 0x1) != 0 && (local1075 == null || local1059.method893(local1075.anInt1431, Static37.anInt936) != local1075.anInt1431)) {
									Static295.method5151(Static62.anInt1506, local363.anInt6247, false, true, Static365.aString65, (long) local1051.anInt2967, Static196.aString39 + " -> <col=ff9040>" + local1059.aString2, 59, local363.anInt6248);
								}
							}
						}
					}
				}
				if (local363.aClass11_1 instanceof Interface4) {
					@Pc(1286) Interface4 local1286 = (Interface4) local363.aClass11_1;
					@Pc(1292) Class71 local1292 = Static219.method4081(local1286.method5927());
					if (local1292.anIntArray178 != null) {
						local1292 = local1292.method2282();
					}
					if (local1292 != null) {
						if (!Static77.aBoolean119) {
							if (local363.anInt6246 == Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79) {
								@Pc(1315) String[] local1315 = local1292.aStringArray7;
								if (local1315 != null) {
									for (local78 = 4; local78 >= 0; local78--) {
										if (local1315[local78] != null) {
											@Pc(1327) short local1327 = 0;
											if (local78 == 0) {
												local1327 = 17;
											}
											local96 = Static324.anInt6150;
											if (local78 == 1) {
												local1327 = 3;
											}
											if (local78 == 2) {
												local1327 = 11;
											}
											if (local78 == 3) {
												local1327 = 21;
											}
											if (local78 == 4) {
												local1327 = 1001;
											}
											if (local1292.anInt2390 == local78) {
												local96 = local1292.anInt2395;
											}
											if (local1292.anInt2373 == local78) {
												local96 = local1292.anInt2385;
											}
											Static295.method5151(local96, local363.anInt6247, false, true, local1315[local78], Static290.method5226(local363.anInt6248, local1286, local363.anInt6247), "<col=00ffff>" + local1292.aString11, local1327, local363.anInt6248);
										}
									}
								}
							}
							Static295.method5151(Static270.anInt5273, local363.anInt6247, local363.anInt6246 != Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79, true, Static351.aClass106_95.method2927(Static254.anInt5172), (long) local1292.anInt2365, "<col=00ffff>" + local1292.aString11, 1006, local363.anInt6248);
						} else if (Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79 == local363.anInt6246) {
							@Pc(1470) Class1_Sub4_Sub6 local1470 = Static37.anInt936 == -1 ? null : Static296.method5175(Static37.anInt936);
							if ((Static127.anInt2772 & 0x4) != 0 && (local1470 == null || local1292.method2274(Static37.anInt936, local1470.anInt1431) != local1470.anInt1431)) {
								Static295.method5151(Static62.anInt1506, local363.anInt6247, false, true, Static365.aString65, Static290.method5226(local363.anInt6248, local1286, local363.anInt6247), Static196.aString39 + " -> <col=00ffff>" + local1292.aString11, 48, local363.anInt6248);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BLclient!ct;ZILclient!ct;)V")
	public static void method1828(@OriginalArg(1) Class30 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class30 arg2) {
		Static80.aClass30_20 = arg2;
		Static239.aBoolean362 = true;
		Static101.aClass30_31 = arg0;
		Static232.anInt4676 = arg1;
	}
}
