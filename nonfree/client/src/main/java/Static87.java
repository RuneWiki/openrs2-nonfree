import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!hc", name = "X", descriptor = "I")
	public static int anInt2470;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "Lclient!ab;")
	public static Class3 aClass3_10 = new Class3();

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "Z")
	public static boolean aBoolean135 = false;

	@OriginalMember(owner = "client!hc", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString153 = "Please wait - attempting to reestablish.";

	@OriginalMember(owner = "client!hc", name = "E", descriptor = "I")
	public static int anInt2459 = -1;

	@OriginalMember(owner = "client!hc", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString154 = " from your ignore list first.";

	@OriginalMember(owner = "client!hc", name = "V", descriptor = "Lclient!lc;")
	public static Class79 aClass79_13 = new Class79(64);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZI)Lclient!s;")
	public static Class115_Sub1 method1847(@OriginalArg(1) int arg0) {
		return Static65.aBoolean101 && arg0 >= Static97.anInt3555 && Static108.anInt2877 >= arg0 ? Static62.aClass115_Sub1Array2[arg0 - Static97.anInt3555] : null;
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
	public static void method1861() {
		for (@Pc(7) int local7 = -1; local7 < Static238.anInt5146; local7++) {
			@Pc(14) int local14;
			if (local7 == -1) {
				local14 = 2047;
			} else {
				local14 = Static237.anIntArray447[local7];
			}
			@Pc(24) Class9_Sub1_Sub1 local24 = Static147.aClass9_Sub1_Sub1Array1[local14];
			if (local24 != null) {
				Static223.method3707(local24.method208(), local24);
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIBIIIIIIII)V")
	public static void method1873(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7) {
		@Pc(10) int local10 = arg2 - arg7;
		if (Static174.anInt3997 > arg2) {
			local10++;
		}
		@Pc(23) int local23 = arg6 - arg1;
		if (arg6 < Static124.anInt3160) {
			local23++;
		}
		@Pc(57) int local57;
		@Pc(49) int local49;
		@Pc(62) int local62;
		@Pc(70) int local70;
		@Pc(95) int local95;
		@Pc(155) int local155;
		@Pc(141) int local141;
		@Pc(160) int local160;
		@Pc(206) int local206;
		@Pc(216) int local216;
		@Pc(226) int local226;
		@Pc(231) int local231;
		@Pc(253) int local253;
		@Pc(283) int local283;
		@Pc(378) int local378;
		@Pc(362) int local362;
		@Pc(527) int local527;
		for (@Pc(37) int local37 = 0; local37 < local23; local37++) {
			local49 = arg0 * (local37 + 1) >> 16;
			local57 = arg0 * local37 >> 16;
			local62 = local49 - local57;
			if (local62 > 0) {
				local70 = arg1 + local37 >> 6;
				if (local70 >= 0 && Static5.anIntArrayArrayArray2.length - 1 >= local70) {
					local49 += arg5;
					@Pc(180) byte[][] local180 = Static117.aByteArrayArrayArray8[local70];
					@Pc(184) int[][] local184 = Static5.anIntArrayArrayArray2[local70];
					@Pc(188) byte[][] local188 = Static138.aByteArrayArrayArray11[local70];
					local57 += arg5;
					@Pc(196) byte[][] local196 = Static67.aByteArrayArrayArray6[local70];
					@Pc(200) byte[][] local200 = Static191.aByteArrayArrayArray14[local70];
					@Pc(204) byte[][] local204 = Static45.aByteArrayArrayArray5[local70];
					for (local206 = 0; local206 < local10; local206++) {
						local216 = local206 * arg4 >> 16;
						local226 = (local206 + 1) * arg4 >> 16;
						local231 = local226 - local216;
						if (local231 > 0) {
							local226 += arg3;
							local216 += arg3;
							@Pc(247) int local247 = arg7 + local206 >> 6;
							local253 = arg7 + local206 & 0x3F;
							@Pc(259) int local259 = arg1 + local37 & 0x3F;
							@Pc(265) int local265 = local259 + (local253 << 6);
							if (local247 < 0 || local247 > local184.length - 1 || local184[local247] == null) {
								if (Static122.aClass1_Sub2_Sub11_2.anInt3841 != -1) {
									local283 = Static122.aClass1_Sub2_Sub11_2.anInt3841;
								} else if ((arg7 + local206 & 0x4) == (arg1 + local37 & 0x4)) {
									local283 = Static93.anIntArray191[Static77.anInt2098 + 1];
								} else {
									local283 = 4936552;
								}
								if (local247 < 0 || local247 > local184.length - 1) {
									if (local283 == 0) {
										local283 = 1;
									}
									Static189.method3193(local57, local216, local62, local231, local283);
									continue;
								}
							} else {
								local283 = local184[local247][local265];
							}
							if (local283 == 0) {
								local283 = 1;
							}
							local362 = local188[local247] == null ? 0 : Static93.anIntArray191[local188[local247][local265] & 0xFF];
							local378 = local180[local247] == null ? 0 : Static93.anIntArray191[local180[local247][local265] & 0xFF];
							@Pc(414) int local414;
							if (local378 == 0 && local362 == 0) {
								Static189.method3193(local57, local216, local62, local231, local283);
							} else {
								@Pc(410) byte local410;
								if (local378 != 0) {
									local410 = local200[local247] == null ? 0 : local200[local247][local265];
									local414 = local410 & 0xFC;
									if (local378 == -1) {
										local378 = 1;
									}
									if (local414 == 0 || local62 <= 1 || local231 <= 1) {
										Static189.method3193(local57, local216, local62, local231, local378);
									} else {
										Static102.method2113(local231, local378, local216, true, local414 >> 2, local283, local57, local62, local410 & 0x3, Static189.anIntArray319);
									}
								}
								if (local362 != 0) {
									if (local362 == -1) {
										local362 = local283;
									}
									local410 = local196[local247][local265];
									local414 = local410 & 0xFC;
									if (local414 == 0 || local62 <= 1 || local231 <= 1) {
										Static189.method3193(local57, local216, local62, local231, local362);
									}
									Static102.method2113(local231, local362, local216, local378 == 0, local414 >> 2, 0, local57, local62, local410 & 0x3, Static189.anIntArray319);
								}
							}
							if (local204[local247] != null) {
								local527 = local204[local247][local265] & 0xFF;
								if (local527 != 0) {
									@Pc(536) int local536;
									if (local231 == 1) {
										local536 = local216;
									} else {
										local536 = local226 - 1;
									}
									if (local62 == 1) {
										local414 = local57;
									} else {
										local414 = local49 - 1;
									}
									@Pc(555) int local555 = 13421772;
									if (local527 >= 5 && local527 <= 8 || local527 >= 13 && local527 <= 16 || local527 >= 21 && local527 <= 24 || local527 == 27 || local527 == 28) {
										local527 -= 4;
										local555 = 13369344;
									}
									if (local527 == 1) {
										Static189.method3180(local57, local216, local231, local555);
									} else if (local527 == 2) {
										Static189.method3188(local57, local216, local62, local555);
									} else if (local527 == 3) {
										Static189.method3180(local414, local216, local231, local555);
									} else if (local527 == 4) {
										Static189.method3188(local57, local536, local62, local555);
									} else if (local527 == 9) {
										Static189.method3180(local57, local216, local231, 16777215);
										Static189.method3188(local57, local216, local62, local555);
									} else if (local527 == 10) {
										Static189.method3180(local414, local216, local231, 16777215);
										Static189.method3188(local57, local216, local62, local555);
									} else if (local527 == 11) {
										Static189.method3180(local414, local216, local231, 16777215);
										Static189.method3188(local57, local536, local62, local555);
									} else if (local527 == 12) {
										Static189.method3180(local57, local216, local231, 16777215);
										Static189.method3188(local57, local536, local62, local555);
									} else if (local527 == 17) {
										Static189.method3188(local57, local216, 1, local555);
									} else if (local527 == 18) {
										Static189.method3188(local414, local216, 1, local555);
									} else if (local527 == 19) {
										Static189.method3188(local414, local536, 1, local555);
									} else if (local527 == 20) {
										Static189.method3188(local57, local536, 1, local555);
									} else {
										@Pc(690) int local690;
										if (local527 == 25) {
											for (local690 = 0; local690 < local231; local690++) {
												Static189.method3188(local57 + local690, -local690 + local536, 1, local555);
											}
										} else if (local527 == 26) {
											for (local690 = 0; local690 < local231; local690++) {
												Static189.method3188(local57 + local690, local216 + local690, 1, local555);
											}
										}
									}
								}
							}
						}
					}
				} else {
					local57 += arg5;
					for (local95 = 0; local95 < local10; local95++) {
						@Pc(115) int local115;
						if (Static122.aClass1_Sub2_Sub11_2.anInt3841 != -1) {
							local115 = Static122.aClass1_Sub2_Sub11_2.anInt3841;
						} else if ((local95 + arg7 & 0x4) == (arg1 + local37 & 0x4)) {
							local115 = Static93.anIntArray191[Static77.anInt2098 + 1];
						} else {
							local115 = 4936552;
						}
						local141 = arg3 + ((local95 + 1) * arg4 >> 16);
						if (local115 == 0) {
							local115 = 1;
						}
						local155 = (arg4 * local95 >> 16) + arg3;
						local160 = local141 - local155;
						Static189.method3193(local57, local155, local62, local160, local115);
					}
				}
			}
		}
		for (local57 = -2; local57 < local23 + 2; local57++) {
			local62 = arg0 * (local57 + 1) >> 16;
			local49 = local57 * arg0 >> 16;
			local70 = local62 - local49;
			if (local70 > 0) {
				local49 += arg5;
				local95 = local57 + arg1 >> 6;
				if (local95 >= 0 && local95 <= Static25.anIntArrayArrayArray3.length - 1) {
					@Pc(870) int[][] local870 = Static25.anIntArrayArrayArray3[local95];
					for (local155 = -2; local155 < local10 + 2; local155++) {
						local141 = arg4 * local155 >> 16;
						local160 = (local155 + 1) * arg4 >> 16;
						@Pc(897) int local897 = local160 - local141;
						if (local897 > 0) {
							local206 = arg7 + local155 >> 6;
							local141 += arg3;
							if (local206 >= 0 && local870.length - 1 >= local206) {
								local216 = ((arg7 + local155 & 0x3F) << 6) + (arg1 + local57 & 0x3F);
								if (local870[local206] != null) {
									local226 = local870[local206][local216];
									local231 = local226 & 0x1FFF;
									if (local231 != 0) {
										@Pc(965) Class56 local965 = Static154.method3007(local231 - 1);
										local253 = local226 >> 13 & 0x3;
										@Pc(982) boolean local982 = (local226 >> 15 & 0x1) == 1;
										@Pc(988) Class7_Sub1 local988 = local965.method2030(local253, local982);
										if (local988 != null) {
											local283 = local70 * local988.anInt2109 / 4;
											local378 = local897 * local988.anInt2107 / 4;
											if (local965.aBoolean143) {
												local362 = local226 >> 16 & 0xF;
												local527 = local226 >> 20 & 0xF;
												if ((local253 & 0x1) == 1) {
													local253 = local362;
													local362 = local527;
													local527 = local253;
												}
												local378 = local527 * local897;
												local283 = local362 * local70;
											}
											if (local283 != 0 && local378 != 0) {
												if (local965.anInt2638 == 0) {
													local988.method1533(local49, local141 + local897 - local378, local283, local378);
												} else {
													local988.method1531(local49, local141 + local897 - local378, local283, local378, local965.anInt2638);
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
		}
	}

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)V")
	public static void method1876() {
		Static212.aClass79_31.method2487();
	}
}
