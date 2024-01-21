import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!kh", name = "p", descriptor = "J")
	public static long aLong128;

	@OriginalMember(owner = "client!kh", name = "q", descriptor = "Lclient!c;")
	public static Class10 aClass10_73;

	@OriginalMember(owner = "client!kh", name = "s", descriptor = "Lclient!dd;")
	public static Class17 aClass17_12 = new Class17(64);

	@OriginalMember(owner = "client!kh", name = "z", descriptor = "Lclient!ai;")
	public static Class6 aClass6_654 = Static38.method685("leuchten3:");

	@OriginalMember(owner = "client!kh", name = "D", descriptor = "Lclient!ai;")
	public static Class6 aClass6_655 = Static38.method685("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
	public static void method1470() {
		aClass6_655 = null;
		aClass17_12 = null;
		aClass6_654 = null;
		aClass10_73 = null;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLclient!mb;I)V")
	public static void method1471(@OriginalArg(1) Class10_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (Static104.aClass2_Sub13_4 == null) {
			Static84.method1453(0, 255, true, (byte) 0, null, 255);
			Static2.aClass10_Sub1Array1[arg1] = arg0;
		} else {
			Static104.aClass2_Sub13_4.anInt2154 = arg1 * 8 + 5;
			@Pc(16) int local16 = Static104.aClass2_Sub13_4.method1396();
			@Pc(20) int local20 = Static104.aClass2_Sub13_4.method1396();
			arg0.method1611(local16, local20);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!wa;III)V")
	public static void method1472(@OriginalArg(0) Class87 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt4120 == 1) {
			Static95.method1546(Static9.aClass6_71, 44, arg0.anInt4085, 0, 0, arg0.aClass6_1216);
		}
		if (arg0.anInt4120 == 2 && !Static26.aBoolean28) {
			@Pc(35) Class6 local35 = Static94.method1534(arg0);
			if (local35 != null) {
				Static95.method1546(Static58.method956(new Class6[] { Static1.aClass6_2, arg0.aClass6_1232 }), 47, arg0.anInt4085, 0, -1, local35);
			}
		}
		if (arg0.anInt4120 == 3) {
			Static95.method1546(Static9.aClass6_71, 38, arg0.anInt4085, 0, 0, Static33.aClass6_249);
		}
		if (arg0.anInt4120 == 4) {
			Static95.method1546(Static9.aClass6_71, 50, arg0.anInt4085, 0, 0, arg0.aClass6_1216);
		}
		if (arg0.anInt4120 == 5) {
			Static95.method1546(Static9.aClass6_71, 31, arg0.anInt4085, 0, 0, arg0.aClass6_1216);
		}
		if (arg0.anInt4120 == 6 && Static124.aClass87_9 == null) {
			Static95.method1546(Static9.aClass6_71, 41, arg0.anInt4085, 0, -1, arg0.aClass6_1216);
		}
		@Pc(153) int local153;
		@Pc(147) int local147;
		if (arg0.anInt4116 == 2) {
			local147 = 0;
			for (@Pc(149) int local149 = 0; local149 < arg0.anInt4133; local149++) {
				for (local153 = 0; local153 < arg0.anInt4092; local153++) {
					@Pc(163) int local163 = local149 * (arg0.anInt4082 + 32);
					@Pc(171) int local171 = (arg0.anInt4110 + 32) * local153;
					if (local147 < 20) {
						local171 += arg0.anIntArray391[local147];
						local163 += arg0.anIntArray398[local147];
					}
					if (local171 <= arg2 && local163 <= arg1 && arg2 < local171 + 32 && arg1 < local163 + 32) {
						Static182.aClass87_15 = arg0;
						Static83.anInt2043 = local147;
						if (arg0.anIntArray396[local147] > 0) {
							@Pc(238) Class2_Sub3_Sub10 local238 = Static92.method1502(arg0.anIntArray396[local147] - 1);
							if (Static122.anInt2841 == 1 && Static74.method1152(Static179.method2802(arg0))) {
								if (arg0.anInt4085 != Static164.anInt3857 || Static163.anInt3838 != local147) {
									Static95.method1546(Static58.method956(new Class6[] { Static128.aClass6_856, Static36.aClass6_274, local238.aClass6_612 }), 15, arg0.anInt4085, local238.anInt2012, local147, Static28.aClass6_201);
								}
							} else if (!Static26.aBoolean28 || !Static74.method1152(Static179.method2802(arg0))) {
								@Pc(266) Class6[] local266 = local238.aClass6Array10;
								if (Static167.aBoolean158) {
									local266 = Static116.method1872(local266);
								}
								@Pc(280) int local280;
								@Pc(295) byte local295;
								if (Static74.method1152(Static179.method2802(arg0))) {
									for (local280 = 4; local280 >= 3; local280--) {
										if (local266 != null && local266[local280] != null) {
											if (local280 == 3) {
												local295 = 18;
											} else {
												local295 = 21;
											}
											Static95.method1546(Static58.method956(new Class6[] { Static103.aClass6_714, local238.aClass6_612 }), local295, arg0.anInt4085, local238.anInt2012, local147, local266[local280]);
										} else if (local280 == 4) {
											Static95.method1546(Static58.method956(new Class6[] { Static103.aClass6_714, local238.aClass6_612 }), 21, arg0.anInt4085, local238.anInt2012, local147, Static110.aClass6_752);
										}
									}
								}
								if (Static182.method2815(Static179.method2802(arg0))) {
									Static95.method1546(Static58.method956(new Class6[] { Static103.aClass6_714, local238.aClass6_612 }), 20, arg0.anInt4085, local238.anInt2012, local147, Static28.aClass6_201);
								}
								if (Static74.method1152(Static179.method2802(arg0)) && local266 != null) {
									for (local280 = 2; local280 >= 0; local280--) {
										if (local266[local280] != null) {
											local295 = 0;
											if (local280 == 0) {
												local295 = 8;
											}
											if (local280 == 1) {
												local295 = 24;
											}
											if (local280 == 2) {
												local295 = 43;
											}
											Static95.method1546(Static58.method956(new Class6[] { Static103.aClass6_714, local238.aClass6_612 }), local295, arg0.anInt4085, local238.anInt2012, local147, local266[local280]);
										}
									}
								}
								local266 = arg0.aClass6Array26;
								if (Static167.aBoolean158) {
									local266 = Static116.method1872(local266);
								}
								if (local266 != null) {
									for (local280 = 4; local280 >= 0; local280--) {
										if (local266[local280] != null) {
											local295 = 0;
											if (local280 == 0) {
												local295 = 12;
											}
											if (local280 == 1) {
												local295 = 17;
											}
											if (local280 == 2) {
												local295 = 45;
											}
											if (local280 == 3) {
												local295 = 22;
											}
											if (local280 == 4) {
												local295 = 10;
											}
											Static95.method1546(Static58.method956(new Class6[] { Static103.aClass6_714, local238.aClass6_612 }), local295, arg0.anInt4085, local238.anInt2012, local147, local266[local280]);
										}
									}
								}
								Static95.method1546(Static58.method956(new Class6[] { Static103.aClass6_714, local238.aClass6_612 }), 1004, arg0.anInt4085, local238.anInt2012, local147, Static30.aClass6_213);
							} else if ((Static42.anInt1291 & 0x10) == 16) {
								Static95.method1546(Static58.method956(new Class6[] { Static27.aClass6_194, Static36.aClass6_274, local238.aClass6_612 }), 42, arg0.anInt4085, local238.anInt2012, local147, Static3.aClass6_29);
							}
						}
					}
					local147++;
				}
			}
		}
		if (!arg0.aBoolean174) {
			return;
		}
		if (!Static26.aBoolean28) {
			@Pc(695) Class6 local695;
			for (local147 = 9; local147 >= 5; local147--) {
				local695 = Static180.method2810(local147, arg0);
				if (local695 != null) {
					Static95.method1546(arg0.aClass6_1217, 1002, arg0.anInt4085, local147 + 1, arg0.anInt4105, local695);
				}
			}
			local695 = Static94.method1534(arg0);
			if (local695 != null) {
				Static95.method1546(arg0.aClass6_1217, 47, arg0.anInt4085, 0, arg0.anInt4105, local695);
			}
			for (local153 = 4; local153 >= 0; local153--) {
				@Pc(748) Class6 local748 = Static180.method2810(local153, arg0);
				if (local748 != null) {
					Static95.method1546(arg0.aClass6_1217, 9, arg0.anInt4085, local153 + 1, arg0.anInt4105, local748);
				}
			}
			if (Static138.method2138(Static179.method2802(arg0))) {
				Static95.method1546(Static9.aClass6_71, 41, arg0.anInt4085, 0, arg0.anInt4105, Static4.aClass6_32);
				return;
			}
			return;
		}
		if (Static124.method1933(Static179.method2802(arg0)) && (Static42.anInt1291 & 0x20) == 32) {
			Static95.method1546(Static58.method956(new Class6[] { Static27.aClass6_194, Static89.aClass6_662, arg0.aClass6_1217 }), 19, arg0.anInt4085, 0, arg0.anInt4105, Static3.aClass6_29);
			return;
		}
	}
}
