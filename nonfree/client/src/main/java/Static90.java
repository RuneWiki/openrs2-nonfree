import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!dca", name = "R", descriptor = "I")
	public static int anInt2169 = -1;

	@OriginalMember(owner = "client!dca", name = "db", descriptor = "I")
	public static int anInt2181 = 503;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIIIIII)V")
	public static void method2062(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static274.anInt4964;
		Static156.anInt5056 = 0;
		@Pc(11) int[] local11 = Static70.anIntArray392;
		@Pc(178) int local178;
		@Pc(199) int local199;
		@Pc(253) int local253;
		@Pc(330) int local330;
		@Pc(333) int local333;
		@Pc(432) int local432;
		@Pc(566) int local566;
		@Pc(1035) int local1035;
		for (@Pc(13) int local13 = 0; local13 < local7 + Static94.anInt2209; local13++) {
			@Pc(17) Class109 local17 = null;
			@Pc(30) Class4_Sub1_Sub2_Sub1 local30;
			if (local13 < local7) {
				local30 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local11[local13]];
			} else {
				local30 = ((Class3_Sub28) Static551.aClass280_43.method7107((long) Static520.anIntArray594[local13 - local7])).aClass4_Sub1_Sub2_Sub1_Sub1_2;
				local17 = ((Class4_Sub1_Sub2_Sub1_Sub1) local30).aClass109_1;
				if (local17.anIntArray147 != null) {
					local17 = local17.method2813(Static373.aClass150_1);
					if (local17 == null) {
						continue;
					}
				}
			}
			if (local30.anInt5724 >= 0 && (local30.anInt5732 == Static45.anInt1320 || Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123 == local30.aByte123)) {
				Static438.method6822(arg3 >> 1, local30, arg1 >> 1, local30.method5063());
				if (Static312.anIntArray311[0] >= 0) {
					if (local30.aString62 != null && (local13 >= local7 || Static368.anInt6963 == 0 || Static368.anInt6963 == 3 || Static368.anInt6963 == 1 && Static252.method4092(((Class4_Sub1_Sub2_Sub1_Sub2) local30).aString63)) && Static576.anInt9494 > Static156.anInt5056) {
						Static576.anIntArray601[Static156.anInt5056] = Static489.aClass282_12.method7135(local30.aString62) / 2;
						Static576.anIntArray602[Static156.anInt5056] = Static312.anIntArray311[0];
						Static576.anIntArray599[Static156.anInt5056] = Static312.anIntArray311[1];
						Static576.anIntArray603[Static156.anInt5056] = local30.anInt5785;
						Static576.anIntArray605[Static156.anInt5056] = local30.anInt5761;
						Static576.anIntArray600[Static156.anInt5056] = local30.anInt5747;
						Static576.aStringArray36[Static156.anInt5056] = local30.aString62;
						Static156.anInt5056++;
					}
					local178 = Static312.anIntArray311[1] + arg0;
					@Pc(238) Class24[] local238;
					@Pc(245) Class107[] local245;
					@Pc(303) Class24 local303;
					if (local30.aBoolean405 || local30.anInt5757 <= Static101.anInt2262) {
						local178 -= Math.max(Static489.aClass282_12.anInt8303, Static445.aClass24Array15[0].method8578());
					} else {
						@Pc(189) byte local189 = 1;
						if (local7 <= local13) {
							local199 = local17.anInt3048;
							if (local199 == -1) {
								local199 = local30.method5058().anInt4153;
							}
						} else {
							@Pc(215) Class4_Sub1_Sub2_Sub1_Sub2 local215 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local11[local13]];
							local199 = local30.method5058().anInt4153;
							if (local215.aBoolean408) {
								local189 = 2;
							}
						}
						@Pc(227) Class24[] local227 = Static445.aClass24Array15;
						if (local199 != -1) {
							local238 = (Class24[]) Static496.aClass102_17.method2677((long) local199);
							if (local238 == null) {
								local245 = Static645.method2767(Static474.aClass196_98, local199);
								if (local245 != null) {
									local238 = new Class24[local245.length];
									for (local253 = 0; local253 < local245.length; local253++) {
										local238[local253] = Static323.aClass5_9.method7525(local245[local253], true);
									}
									Static496.aClass102_17.method2674((long) local199, local238);
								}
							}
							if (local238 != null && local238.length >= 2) {
								local227 = local238;
							}
						}
						if (local227.length <= local189) {
							local189 = 1;
						}
						@Pc(299) Class24 local299 = local227[0];
						local303 = local227[local189];
						local178 -= Math.max(Static489.aClass282_12.anInt8303, local299.method8578());
						local253 = arg2 + Static312.anIntArray311[0] - (local299.method8558() >> 1);
						local330 = local299.method8558() * local30.anInt5722 / 255;
						local333 = local299.method8578();
						if (local30.anInt5722 > 0 && local330 < 2) {
							local330 = 2;
						}
						local299.method8559(local253, local178);
						Static323.aClass5_9.T(local253, local178, local330 + local253, local178 - -local333);
						local303.method8559(local253, local178);
						Static323.aClass5_9.KA(arg2, arg0, arg2 + arg3, arg1 + arg0);
						Static520.method8069(local253, local178, local299.method8576() + local253, local178 + local333);
					}
					local178 -= 2;
					if (!local30.aBoolean405) {
						@Pc(413) Class24 local413;
						@Pc(422) Class24 local422;
						if (Static101.anInt2262 < local30.anInt5746) {
							local413 = Static350.aClass24Array13[local30.aBoolean403 ? 2 : 0];
							local422 = Static350.aClass24Array13[local30.aBoolean403 ? 3 : 1];
							if (local30 instanceof Class4_Sub1_Sub2_Sub1_Sub1) {
								local432 = local17.anInt3049;
								if (local432 == -1) {
									local432 = local30.method5058().anInt4189;
								}
							} else {
								local432 = local30.method5058().anInt4189;
							}
							if (local432 != -1) {
								local238 = (Class24[]) Static72.aClass102_7.method2677((long) local432);
								if (local238 == null) {
									local245 = Static645.method2767(Static474.aClass196_98, local432);
									if (local245 != null) {
										local238 = new Class24[local245.length];
										for (local253 = 0; local253 < local245.length; local253++) {
											local238[local253] = Static323.aClass5_9.method7525(local245[local253], true);
										}
										Static72.aClass102_7.method2674((long) local432, local238);
									}
								}
								if (local238 != null && local238.length == 4) {
									local422 = local238[local30.aBoolean403 ? 3 : 1];
									local413 = local238[local30.aBoolean403 ? 2 : 0];
								}
							}
							@Pc(528) int local528 = local30.anInt5746 - Static101.anInt2262;
							if (local528 > local30.anInt5711) {
								local528 -= local30.anInt5711;
								local253 = local30.anInt5740 == 0 ? 0 : (local30.anInt5741 - local528) / local30.anInt5740 * local30.anInt5740;
								local566 = local413.method8558() * local253 / local30.anInt5741;
							} else {
								local566 = local413.method8558();
							}
							local253 = local413.method8578();
							local178 -= local253;
							local330 = Static312.anIntArray311[0] + arg2 - (local413.method8558() >> 1);
							local413.method8559(local330, local178);
							Static323.aClass5_9.T(local330, local178, local566 + local330, local253 + local178);
							local422.method8559(local330, local178);
							Static323.aClass5_9.KA(arg2, arg0, arg3 + arg2, arg0 - -arg1);
							Static520.method8069(local330, local178, local330 + local413.method8576(), local178 - -local253);
							local178 -= 2;
						}
						if (local13 < local7) {
							@Pc(708) Class4_Sub1_Sub2_Sub1_Sub2 local708 = (Class4_Sub1_Sub2_Sub1_Sub2) local30;
							if (local708.anInt5805 != -1) {
								local178 -= 25;
								local422 = Static2.aClass24Array1[local708.anInt5805];
								local422.method8559(arg2 + Static312.anIntArray311[0] - 12, local178);
								Static520.method8069(Static312.anIntArray311[0] + arg2 - 12, local178, arg2 + Static312.anIntArray311[0] + local422.method8576() - 12, local178 + local422.method8573());
								local178 -= 2;
							}
							if (local708.anInt5820 != -1) {
								local178 -= 25;
								local422 = Static544.aClass24Array18[local708.anInt5820];
								local422.method8559(arg2 + Static312.anIntArray311[0] - 12, local178);
								Static520.method8069(arg2 + Static312.anIntArray311[0] - 12, local178, Static312.anIntArray311[0] + arg2 + local422.method8576() - 12, local422.method8573() + local178);
								local178 -= 2;
							}
						} else if (local17.anInt3054 >= 0 && local17.anInt3054 < Static544.aClass24Array18.length) {
							local413 = Static544.aClass24Array18[local17.anInt3054];
							local178 -= 25;
							local413.method8559(Static312.anIntArray311[0] + arg2 - (local413.method8558() >> 1), local178);
							Static520.method8069(Static312.anIntArray311[0] + arg2 - (local413.method8558() >> 1), local178, arg2 + Static312.anIntArray311[0] - (local413.method8558() >> 1) + local413.method8576(), local178 + local413.method8573());
							local178 -= 2;
						}
					}
					@Pc(809) Class251[] local809;
					@Pc(817) Class251 local817;
					if (!(local30 instanceof Class4_Sub1_Sub2_Sub1_Sub2)) {
						local199 = 0;
						local809 = Static82.aClass251Array1;
						for (local432 = 0; local432 < local809.length; local432++) {
							local817 = local809[local432];
							if (local817 != null && local817.anInt7476 == 1 && Static520.anIntArray594[local13 - local7] == local817.anInt7486) {
								local303 = Static203.aClass24Array9[local817.anInt7480];
								if (local303.method8578() > local199) {
									local199 = local303.method8578();
								}
								if (Static101.anInt2262 % 20 < 10) {
									local303.method8559(arg2 + Static312.anIntArray311[0] - 12, local178 + -local303.method8578());
									Static520.method8069(arg2 + Static312.anIntArray311[0] - 12, -local303.method8578() + local178, Static312.anIntArray311[0] + arg2 + local303.method8576() - 12, local178 - (local303.method8578() + -local303.method8573()));
								}
							}
						}
						if (local199 > 0) {
						}
					} else if (local13 >= 0) {
						local199 = 0;
						local809 = Static82.aClass251Array1;
						for (local432 = 0; local432 < local809.length; local432++) {
							local817 = local809[local432];
							if (local817 != null && local817.anInt7476 == 10 && local11[local13] == local817.anInt7486) {
								local303 = Static203.aClass24Array9[local817.anInt7480];
								if (local199 < local303.method8578()) {
									local199 = local303.method8578();
								}
								local303.method8559(arg2 + Static312.anIntArray311[0] - 12, -local303.method8578() + local178);
								Static520.method8069(arg2 + Static312.anIntArray311[0] - 12, -local303.method8578() + local178, arg2 + Static312.anIntArray311[0] + local303.method8576() - 12, -local303.method8578() + local178 + local303.method8573());
							}
						}
						if (local199 > 0) {
						}
					}
					for (local199 = 0; local199 < 4; local199++) {
						if (Static101.anInt2262 < local30.anIntArray304[local199]) {
							local1035 = local30.method5063() / 2;
							Static438.method6822(arg3 >> 1, local30, arg1 >> 1, local1035);
							if (Static312.anIntArray311[0] > -1) {
								local432 = Static621.aClass24Array19[local30.anIntArray303[local199]].method8558();
								if (local199 == 1) {
									Static312.anIntArray311[1] -= 20;
								}
								if (local199 == 2) {
									Static312.anIntArray311[1] -= 10;
									Static312.anIntArray311[0] -= local432 - 9;
								}
								if (local199 == 3) {
									Static312.anIntArray311[0] += local432 - 9;
									Static312.anIntArray311[1] -= 10;
								}
								Static621.aClass24Array19[local30.anIntArray303[local199]].method8559(Static312.anIntArray311[0] + arg2 - (local432 >> 1), arg0 + -12 + Static312.anIntArray311[1]);
								Static557.aClass62_12.method8363(0, Static312.anIntArray311[1] + arg0 + 3, Static312.anIntArray311[0] + arg2 + -1, Integer.toString(local30.anIntArray308[local199]), -1);
							}
						}
					}
				}
			}
		}
		@Pc(1196) int local1196;
		for (@Pc(1190) int local1190 = 0; local1190 < Static247.anInt4559; local1190++) {
			local1196 = Static133.anIntArray130[local1190];
			@Pc(1205) Class4_Sub1_Sub2_Sub1 local1205;
			if (local1196 < 2048) {
				local1205 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local1196];
			} else {
				local1205 = ((Class3_Sub28) Static551.aClass280_43.method7107((long) (local1196 - 2048))).aClass4_Sub1_Sub2_Sub1_Sub1_2;
			}
			local199 = Static582.anIntArray613[local1190];
			@Pc(1234) Class4_Sub1_Sub2_Sub1 local1234;
			if (local199 >= 2048) {
				local1234 = ((Class3_Sub28) Static551.aClass280_43.method7107((long) (local199 - 2048))).aClass4_Sub1_Sub2_Sub1_Sub1_2;
			} else {
				local1234 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local199];
			}
			Static156.method4566(--local1205.anInt5772, arg1, arg0, local1234, arg3, arg2, local1205);
		}
		local1196 = Static489.aClass282_12.anInt8303 + Static489.aClass282_12.anInt8306 + 2;
		for (local178 = 0; local178 < Static156.anInt5056; local178++) {
			local199 = Static576.anIntArray602[local178];
			local1035 = Static576.anIntArray599[local178];
			local432 = Static576.anIntArray601[local178];
			@Pc(1292) boolean local1292 = true;
			while (local1292) {
				local1292 = false;
				for (local566 = 0; local566 < local178; local566++) {
					if (Static576.anIntArray599[local566] - local1196 < local1035 - -2 && local1035 - local1196 < Static576.anIntArray599[local566] + 2 && Static576.anIntArray602[local566] + Static576.anIntArray601[local566] > -local432 + local199 && Static576.anIntArray602[local566] - Static576.anIntArray601[local566] < local199 + local432 && local1035 > Static576.anIntArray599[local566] - local1196) {
						local1292 = true;
						local1035 = Static576.anIntArray599[local566] - local1196;
					}
				}
			}
			Static576.anIntArray599[local178] = local1035;
			@Pc(1390) String local1390 = Static576.aStringArray36[local178];
			local253 = Static489.aClass282_12.method7135(local1390);
			local330 = arg2 + local199;
			local333 = arg0 + local1035 - Static489.aClass282_12.anInt8303;
			@Pc(1412) int local1412 = local330 + local253;
			@Pc(1420) int local1420 = local1035 + arg0 + Static489.aClass282_12.anInt8306;
			if (Static276.anInt4992 == 0) {
				@Pc(1427) int local1427 = 16776960;
				if (Static576.anIntArray603[local178] < 6) {
					local1427 = Static530.anIntArray575[Static576.anIntArray603[local178]];
				}
				if (Static576.anIntArray603[local178] == 6) {
					local1427 = Static45.anInt1320 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static576.anIntArray603[local178] == 7) {
					local1427 = Static45.anInt1320 % 20 < 10 ? 255 : 65535;
				}
				if (Static576.anIntArray603[local178] == 8) {
					local1427 = Static45.anInt1320 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(1500) int local1500;
				if (Static576.anIntArray603[local178] == 9) {
					local1500 = 150 - Static576.anIntArray600[local178];
					if (local1500 < 50) {
						local1427 = local1500 * 1280 + 16711680;
					} else if (local1500 < 100) {
						local1427 = 16776960 - (local1500 - 50) * 327680;
					} else if (local1500 < 150) {
						local1427 = (local1500 - 100) * 5 + 65280;
					}
				}
				if (Static576.anIntArray603[local178] == 10) {
					local1500 = 150 - Static576.anIntArray600[local178];
					if (local1500 < 50) {
						local1427 = local1500 * 5 + 16711680;
					} else if (local1500 < 100) {
						local1427 = 16711935 - (local1500 - 50) * 327680;
					} else if (local1500 < 150) {
						local1427 = (local1500 - 100) * 327680 + 500 + 255 - local1500 * 5;
					}
				}
				if (Static576.anIntArray603[local178] == 11) {
					local1500 = 150 - Static576.anIntArray600[local178];
					if (local1500 < 50) {
						local1427 = 16777215 - local1500 * 327685;
					} else if (local1500 < 100) {
						local1427 = (local1500 - 50) * 327685 + 65280;
					} else if (local1500 < 150) {
						local1427 = 16777215 - (local1500 - 100) * 327680;
					}
				}
				local1500 = local1427 | 0xFF000000;
				if (Static576.anIntArray605[local178] == 0) {
					Static460.aClass62_9.method8363(-16777216, local1035 + arg0, local199 + arg2, local1390, local1500);
					local330 -= local253 >> 1;
					local1412 -= local253 >> 1;
				}
				if (Static576.anIntArray605[local178] == 1) {
					local330 -= local253 >> 1;
					local1420 += 5;
					local333 -= 5;
					Static460.aClass62_9.method8370(arg0 + local1035, Static45.anInt1320, local199 + arg2, local1500, local1390);
					local1412 -= local253 >> 1;
				}
				if (Static576.anIntArray605[local178] == 2) {
					local333 -= 5;
					local330 -= (local253 >> 1) + 5;
					local1412 -= (local253 >> 1) - 5;
					local1420 += 5;
					Static460.aClass62_9.method8358(local199 + arg2, local1500, Static45.anInt1320, arg0 + local1035, local1390);
				}
				if (Static576.anIntArray605[local178] == 3) {
					local330 -= local253 >> 1;
					local333 -= 7;
					local1420 += 7;
					Static460.aClass62_9.method8374(Static45.anInt1320, 150 - Static576.anIntArray600[local178], local1390, arg0 + local1035, local199 + arg2, local1500);
					local1412 -= local253 >> 1;
				}
				@Pc(1819) int local1819;
				if (Static576.anIntArray605[local178] == 4) {
					local1819 = (150 - Static576.anIntArray600[local178]) * (Static489.aClass282_12.method7135(local1390) + 100) / 150;
					Static323.aClass5_9.T(arg2 + local199 - 50, arg0, arg2 + local199 + 50, arg1 + arg0);
					Static460.aClass62_9.method8373(-16777216, local1500, local199 + arg2 + 50 - local1819, local1390, local1035 + arg0);
					local1412 += 50 - local1819;
					local330 += 50 - local1819;
					Static323.aClass5_9.KA(arg2, arg0, arg3 + arg2, arg0 - -arg1);
				}
				if (Static576.anIntArray605[local178] == 5) {
					local1819 = 150 - Static576.anIntArray600[local178];
					@Pc(1892) int local1892 = 0;
					if (local1819 < 25) {
						local1892 = local1819 - 25;
					} else if (local1819 > 125) {
						local1892 = local1819 - 125;
					}
					@Pc(1914) int local1914 = Static489.aClass282_12.anInt8303 + Static489.aClass282_12.anInt8306;
					Static323.aClass5_9.T(arg2, arg0 + local1035 - local1914 - 1, arg2 - -arg3, local1035 + arg0 + 5);
					Static460.aClass62_9.method8363(-16777216, arg0 + local1035 + local1892, local199 + arg2, local1390, local1500);
					local333 += local1892;
					local1412 -= local253 >> 1;
					local330 -= local253 >> 1;
					local1420 += local1892;
					Static323.aClass5_9.KA(arg2, arg0, arg3 + arg2, arg1 + arg0);
				}
			} else {
				Static460.aClass62_9.method8363(-16777216, local1035 + arg0, local199 + arg2, local1390, -256);
				local1412 -= local253 >> 1;
				local330 -= local253 >> 1;
			}
			Static520.method8069(local330, local333, local1412 + 1, local1420 - -1);
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(ILclient!jc;)V")
	public static void method2063(@OriginalArg(1) Class3_Sub3_Sub2 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static241.anInt4470; local7++) {
			@Pc(13) int local13 = Static586.anIntArray619[local7];
			@Pc(17) Class4_Sub1_Sub2_Sub1_Sub2 local17 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local13];
			@Pc(21) int local21 = arg0.method4225();
			if ((local21 & 0x2) != 0) {
				local21 += arg0.method4225() << 8;
			}
			if ((local21 & 0x400) != 0) {
				local21 += arg0.method4225() << 16;
			}
			Static235.method3927(arg0, local21, local13, local17);
		}
	}

	@OriginalMember(owner = "client!dca", name = "d", descriptor = "(Z)V")
	public static void method2064() {
		Static177.aClass24_4 = null;
		Static438.aClass24_26 = null;
		Static341.aClass24_31 = null;
		Static398.aClass24_24 = null;
		Static215.aClass24_14 = null;
		Static207.aClass24_13 = null;
		Static120.aClass24_3 = null;
		Static619.aClass24_36 = null;
		Static167.aClass24Array8 = null;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "([IIII[ILclient!ch;)Lclient!vb;")
	public static Class1_Sub3 method2065(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class5_Sub1 arg4) {
		@Pc(20) int local20;
		@Pc(30) int local30;
		@Pc(32) int local32;
		if (!arg4.method5602(Static355.aClass182_12, Static637.aClass376_16)) {
			@Pc(62) int[] local62 = new int[arg1 * arg2];
			for (local20 = 0; local20 < arg2; local20++) {
				local30 = arg0[local20] + local20 * arg1;
				for (local32 = 0; local32 < arg3[local20]; local32++) {
					local62[local30++] = -16777216;
				}
			}
			return new Class1_Sub3(arg4, arg1, arg2, local62);
		}
		@Pc(18) byte[] local18 = new byte[arg2 * arg1];
		for (local20 = 0; local20 < arg2; local20++) {
			local30 = arg0[local20] + arg1 * local20;
			for (local32 = 0; local32 < arg3[local20]; local32++) {
				local18[local30++] = -1;
			}
		}
		return new Class1_Sub3(arg4, arg1, arg2, local18);
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(BI)V")
	public static void method2066() {
		@Pc(5) Class102 local5 = Static613.aClass102_63;
		synchronized (Static613.aClass102_63) {
			Static613.aClass102_63.method2668(5);
		}
		local5 = Static83.aClass102_11;
		synchronized (Static83.aClass102_11) {
			Static83.aClass102_11.method2668(5);
		}
	}
}
