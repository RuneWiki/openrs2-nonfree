import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
	public static int anInt55;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
	public static int anInt59;

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
	public static int anInt60;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_5 = new Class55("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
	public static int anInt57 = 20;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIZB[[[Lclient!rr;I)Z")
	public static boolean method48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class223[][][] arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg2 ? 1 : (byte) (Static143.anInt2745 & 0xFF);
		if (local14 == Static351.aByteArrayArrayArray17[Static268.anInt4539][arg4][arg0]) {
			return false;
		} else if ((Static347.aByteArrayArrayArray16[Static268.anInt4539][arg4][arg0] & 0x4) == 0) {
			return false;
		} else {
			@Pc(42) byte local42 = 0;
			@Pc(49) int local49 = 0;
			Static217.anIntArray336[0] = arg4;
			@Pc(56) int local56 = local42 + 1;
			Static434.anIntArray608[0] = arg0;
			Static351.aByteArrayArrayArray17[Static268.anInt4539][arg4][arg0] = local14;
			while (local56 != local49) {
				@Pc(74) int local74 = Static217.anIntArray336[local49] & 0xFFFF;
				@Pc(82) int local82 = Static217.anIntArray336[local49] >> 16 & 0xFF;
				@Pc(90) int local90 = Static217.anIntArray336[local49] >> 24 & 0xFF;
				@Pc(96) int local96 = Static434.anIntArray608[local49] & 0xFFFF;
				@Pc(104) int local104 = Static434.anIntArray608[local49] >> 16 & 0xFF;
				local49 = local49 + 1 & 0xFFF;
				@Pc(112) boolean local112 = false;
				if ((Static347.aByteArrayArrayArray16[Static268.anInt4539][local74][local96] & 0x4) == 0) {
					local112 = true;
				}
				@Pc(129) boolean local129 = false;
				@Pc(171) int local171;
				@Pc(217) int local217;
				label231: for (@Pc(133) int local133 = Static268.anInt4539 + 1; local133 <= 3; local133++) {
					if ((Static347.aByteArrayArrayArray16[local133][local74][local96] & 0x8) == 0) {
						@Pc(312) Class26_Sub2 local312;
						@Pc(322) int local322;
						@Pc(301) Class223 local301;
						@Pc(307) Class270 local307;
						if (local112 && arg3[local133][local74][local96] != null) {
							if (arg3[local133][local74][local96].aClass26_Sub3_2 != null) {
								local171 = Static78.method1382(local82);
								if (arg3[local133][local74][local96].aClass26_Sub3_2.anInt5724 == local171 || arg3[local133][local74][local96].aClass26_Sub3_1 != null && local171 == arg3[local133][local74][local96].aClass26_Sub3_1.anInt5724) {
									continue;
								}
								if (local90 != 0) {
									local217 = Static78.method1382(local90);
									if (arg3[local133][local74][local96].aClass26_Sub3_2.anInt5724 == local217 || arg3[local133][local74][local96].aClass26_Sub3_1 != null && arg3[local133][local74][local96].aClass26_Sub3_1.anInt5724 == local217) {
										continue;
									}
								}
								if (local104 != 0) {
									local217 = Static78.method1382(local104);
									if (local217 == arg3[local133][local74][local96].aClass26_Sub3_2.anInt5724 || arg3[local133][local74][local96].aClass26_Sub3_1 != null && arg3[local133][local74][local96].aClass26_Sub3_1.anInt5724 == local217) {
										continue;
									}
								}
							}
							local301 = arg3[local133][local74][local96];
							if (local301.aClass270_1 != null) {
								for (local307 = local301.aClass270_1; local307 != null; local307 = local307.aClass270_3) {
									local312 = local307.aClass26_Sub2_2;
									if (local312 instanceof Interface5) {
										@Pc(318) Interface5 local318 = (Interface5) local312;
										local322 = local318.method5732();
										@Pc(326) int local326 = local318.method5729();
										if (local322 == 21) {
											local322 = 19;
										}
										@Pc(339) int local339 = local326 << 6 | local322;
										if (local82 == local339 || local90 != 0 && local90 == local339 || local104 != 0 && local104 == local339) {
											continue label231;
										}
									}
								}
							}
						}
						local301 = arg3[local133][local74][local96];
						if (local301 != null && local301.aClass270_1 != null) {
							for (local307 = local301.aClass270_1; local307 != null; local307 = local307.aClass270_3) {
								local312 = local307.aClass26_Sub2_2;
								if (local312.aShort105 != local312.aShort104 || local312.aShort102 != local312.aShort103) {
									for (@Pc(401) int local401 = local312.aShort105; local401 <= local312.aShort104; local401++) {
										for (local322 = local312.aShort103; local322 <= local312.aShort102; local322++) {
											Static351.aByteArrayArrayArray17[local133][local401][local322] = local14;
										}
									}
								}
							}
						}
						local129 = true;
						Static351.aByteArrayArrayArray17[local133][local74][local96] = local14;
					}
				}
				if (local129) {
					local171 = Static244.aClass165Array8[Static268.anInt4539 + 1].l(local74, local96);
					if (local171 > Static315.anIntArray465[arg1]) {
						Static315.anIntArray465[arg1] = local171;
					}
					local217 = local74 << 7;
					@Pc(475) int local475 = local96 << 7;
					if (local217 < Static313.anIntArray464[arg1]) {
						Static313.anIntArray464[arg1] = local217;
					} else if (local217 > Static382.anIntArray554[arg1]) {
						Static382.anIntArray554[arg1] = local217;
					}
					if (Static4.anIntArray626[arg1] > local475) {
						Static4.anIntArray626[arg1] = local475;
					} else if (local475 > Static203.anIntArray321[arg1]) {
						Static203.anIntArray321[arg1] = local475;
					}
				}
				if (!local112) {
					if (local74 >= 1 && Static351.aByteArrayArrayArray17[Static268.anInt4539][local74 - 1][local96] != local14) {
						Static217.anIntArray336[local56] = local74 - 1 | 0xD3000000 | 0x120000;
						Static434.anIntArray608[local56] = local96 | 0x130000;
						Static351.aByteArrayArrayArray17[Static268.anInt4539][local74 - 1][local96] = local14;
						local56 = local56 + 1 & 0xFFF;
					}
					@Pc(576) int local576 = ~Static102.anInt2086;
					local96++;
					if (local576 < ~local96) {
						if (local74 - 1 >= 0 && Static351.aByteArrayArrayArray17[Static268.anInt4539][local74 - 1][local96] != local14 && (Static347.aByteArrayArrayArray16[Static268.anInt4539][local74][local96] & 0x4) == 0 && (Static347.aByteArrayArrayArray16[Static268.anInt4539][local74 - 1][local96 - 1] & 0x4) == 0) {
							Static217.anIntArray336[local56] = 0x52000000 | 0x120000 | local74 - 1;
							Static434.anIntArray608[local56] = local96 | 0x130000;
							local56 = local56 + 1 & 0xFFF;
							Static351.aByteArrayArrayArray17[Static268.anInt4539][local74 - 1][local96] = local14;
						}
						if (Static351.aByteArrayArrayArray17[Static268.anInt4539][local74][local96] != local14) {
							Static217.anIntArray336[local56] = local74 | 0x520000 | 0x13000000;
							Static434.anIntArray608[local56] = local96 | 0x530000;
							Static351.aByteArrayArrayArray17[Static268.anInt4539][local74][local96] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
						if (local74 + 1 < Static333.anInt3375 && Static351.aByteArrayArrayArray17[Static268.anInt4539][local74 + 1][local96] != local14 && (Static347.aByteArrayArrayArray16[Static268.anInt4539][local74][local96] & 0x4) == 0 && (Static347.aByteArrayArrayArray16[Static268.anInt4539][local74 + 1][local96 - 1] & 0x4) == 0) {
							Static217.anIntArray336[local56] = local74 + 1 | 0x520000 | 0x92000000;
							Static434.anIntArray608[local56] = local96 | 0x530000;
							local56 = local56 + 1 & 0xFFF;
							Static351.aByteArrayArrayArray17[Static268.anInt4539][local74 + 1][local96] = local14;
						}
					}
					local96--;
					if (local74 + 1 < Static333.anInt3375 && Static351.aByteArrayArrayArray17[Static268.anInt4539][local74 + 1][local96] != local14) {
						Static217.anIntArray336[local56] = 0x53000000 | 0x920000 | local74 + 1;
						Static434.anIntArray608[local56] = local96 | 0x930000;
						Static351.aByteArrayArrayArray17[Static268.anInt4539][local74 + 1][local96] = local14;
						local56 = local56 + 1 & 0xFFF;
					}
					local96--;
					if (local96 >= 0) {
						if (local74 - 1 >= 0 && Static351.aByteArrayArrayArray17[Static268.anInt4539][local74 - 1][local96] != local14 && (Static347.aByteArrayArrayArray16[Static268.anInt4539][local74][local96] & 0x4) == 0 && (Static347.aByteArrayArrayArray16[Static268.anInt4539][local74 - 1][local96 + 1] & 0x4) == 0) {
							Static217.anIntArray336[local56] = 0x12000000 | 0xD20000 | local74 - 1;
							Static434.anIntArray608[local56] = local96 | 0xD30000;
							local56 = local56 + 1 & 0xFFF;
							Static351.aByteArrayArrayArray17[Static268.anInt4539][local74 - 1][local96] = local14;
						}
						if (local14 != Static351.aByteArrayArrayArray17[Static268.anInt4539][local74][local96]) {
							Static217.anIntArray336[local56] = local74 | 0xD20000 | 0x93000000;
							Static434.anIntArray608[local56] = local96 | 0xD30000;
							Static351.aByteArrayArrayArray17[Static268.anInt4539][local74][local96] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
						if (local74 + 1 < Static333.anInt3375 && local14 != Static351.aByteArrayArrayArray17[Static268.anInt4539][local74 + 1][local96] && (Static347.aByteArrayArrayArray16[Static268.anInt4539][local74][local96] & 0x4) == 0 && (Static347.aByteArrayArrayArray16[Static268.anInt4539][local74 + 1][local96 + 1] & 0x4) == 0) {
							Static217.anIntArray336[local56] = local74 + 1 | 0x920000 | 0xD2000000;
							Static434.anIntArray608[local56] = local96 | 0x930000;
							local56 = local56 + 1 & 0xFFF;
							Static351.aByteArrayArrayArray17[Static268.anInt4539][local74 + 1][local96] = local14;
						}
					}
				}
			}
			if (Static315.anIntArray465[arg1] != -1000000) {
				Static315.anIntArray465[arg1] += 10;
				Static313.anIntArray464[arg1] -= 50;
				Static382.anIntArray554[arg1] += 50;
				Static203.anIntArray321[arg1] += 50;
				Static4.anIntArray626[arg1] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIBI)V")
	public static void method50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(17) Class7_Sub13 local17 = (Class7_Sub13) Static423.aClass85_47.method2010(); local17 != null; local17 = (Class7_Sub13) Static423.aClass85_47.method2000()) {
			Static114.method1942(arg0, arg2, arg1, arg3, local17);
		}
		for (@Pc(38) Class7_Sub13 local38 = (Class7_Sub13) Static26.aClass85_4.method2010(); local38 != null; local38 = (Class7_Sub13) Static26.aClass85_4.method2000()) {
			@Pc(42) byte local42 = 1;
			@Pc(49) Class78 local49 = local38.aClass26_Sub2_Sub4_Sub1_1.method5507();
			if (local38.aClass26_Sub2_Sub4_Sub1_1.aBoolean475) {
				local42 = 0;
			} else if (local38.aClass26_Sub2_Sub4_Sub1_1.anInt7103 == local49.anInt2289 || local38.aClass26_Sub2_Sub4_Sub1_1.anInt7103 == local49.anInt2291 || local49.anInt2263 == local38.aClass26_Sub2_Sub4_Sub1_1.anInt7103 || local49.anInt2274 == local38.aClass26_Sub2_Sub4_Sub1_1.anInt7103) {
				local42 = 2;
			} else if (local38.aClass26_Sub2_Sub4_Sub1_1.anInt7103 == local49.anInt2273 || local38.aClass26_Sub2_Sub4_Sub1_1.anInt7103 == local49.anInt2268 || local38.aClass26_Sub2_Sub4_Sub1_1.anInt7103 == local49.anInt2272 || local38.aClass26_Sub2_Sub4_Sub1_1.anInt7103 == local49.anInt2296) {
				local42 = 3;
			}
			if (local38.anInt1396 != local42) {
				@Pc(140) int local140 = Static27.method306(local38.aClass26_Sub2_Sub4_Sub1_1);
				if (local140 != local38.anInt1404) {
					if (local38.aClass7_Sub8_Sub4_3 != null) {
						Static452.aClass7_Sub8_Sub1_2.method2428(local38.aClass7_Sub8_Sub4_3);
						local38.aClass7_Sub8_Sub4_3 = null;
					}
					local38.anInt1404 = local140;
				}
				local38.anInt1396 = local42;
			}
			local38.anInt1402 = local38.aClass26_Sub2_Sub4_Sub1_1.anInt7388;
			local38.anInt1398 = local38.aClass26_Sub2_Sub4_Sub1_1.anInt7388 + (local38.aClass26_Sub2_Sub4_Sub1_1.method5512() << 6);
			local38.anInt1395 = local38.aClass26_Sub2_Sub4_Sub1_1.anInt7383;
			local38.anInt1391 = local38.aClass26_Sub2_Sub4_Sub1_1.anInt7383 + (local38.aClass26_Sub2_Sub4_Sub1_1.method5512() << 6);
			Static114.method1942(arg0, arg2, arg1, arg3, local38);
		}
		for (@Pc(215) Class7_Sub13 local215 = (Class7_Sub13) Static338.aClass164_31.method3514(); local215 != null; local215 = (Class7_Sub13) Static338.aClass164_31.method3519()) {
			@Pc(219) byte local219 = 1;
			@Pc(224) Class78 local224 = local215.aClass26_Sub2_Sub4_Sub2_1.method5507();
			if (local215.aClass26_Sub2_Sub4_Sub2_1.aBoolean475) {
				local219 = 0;
			} else if (local224.anInt2289 == local215.aClass26_Sub2_Sub4_Sub2_1.anInt7103 || local215.aClass26_Sub2_Sub4_Sub2_1.anInt7103 == local224.anInt2291 || local215.aClass26_Sub2_Sub4_Sub2_1.anInt7103 == local224.anInt2263 || local215.aClass26_Sub2_Sub4_Sub2_1.anInt7103 == local224.anInt2274) {
				local219 = 2;
			} else if (local215.aClass26_Sub2_Sub4_Sub2_1.anInt7103 == local224.anInt2273 || local224.anInt2268 == local215.aClass26_Sub2_Sub4_Sub2_1.anInt7103 || local215.aClass26_Sub2_Sub4_Sub2_1.anInt7103 == local224.anInt2272 || local215.aClass26_Sub2_Sub4_Sub2_1.anInt7103 == local224.anInt2296) {
				local219 = 3;
			}
			if (local215.anInt1396 != local219) {
				@Pc(319) int local319 = Static362.method4647(local215.aClass26_Sub2_Sub4_Sub2_1);
				if (local215.anInt1404 != local319) {
					if (local215.aClass7_Sub8_Sub4_3 != null) {
						Static452.aClass7_Sub8_Sub1_2.method2428(local215.aClass7_Sub8_Sub4_3);
						local215.aClass7_Sub8_Sub4_3 = null;
					}
					local215.anInt1404 = local319;
				}
				local215.anInt1396 = local219;
			}
			local215.anInt1402 = local215.aClass26_Sub2_Sub4_Sub2_1.anInt7388;
			local215.anInt1398 = local215.aClass26_Sub2_Sub4_Sub2_1.anInt7388 + (local215.aClass26_Sub2_Sub4_Sub2_1.method5512() << 6);
			local215.anInt1395 = local215.aClass26_Sub2_Sub4_Sub2_1.anInt7383;
			local215.anInt1391 = local215.aClass26_Sub2_Sub4_Sub2_1.anInt7383 + (local215.aClass26_Sub2_Sub4_Sub2_1.method5512() << 6);
			Static114.method1942(arg0, arg2, arg1, arg3, local215);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IBII)I")
	public static int method51(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg1 >> 5 << 7) + ((arg0 >> 2 & 0x3F) << 10) + (arg2 >> 1);
	}
}
