import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!t", name = "mb", descriptor = "I")
	public static int anInt2396;

	@OriginalMember(owner = "client!t", name = "nb", descriptor = "I")
	public static int anInt2397;

	@OriginalMember(owner = "client!t", name = "qb", descriptor = "I")
	public static int anInt2398;

	@OriginalMember(owner = "client!t", name = "sb", descriptor = "I")
	public static int anInt2399;

	@OriginalMember(owner = "client!t", name = "vb", descriptor = "I")
	public static int anInt2400;

	@OriginalMember(owner = "client!t", name = "wb", descriptor = "[I")
	private static int[] anIntArray297;

	@OriginalMember(owner = "client!t", name = "zb", descriptor = "I")
	public static int anInt2401;

	@OriginalMember(owner = "client!t", name = "Ab", descriptor = "Lclient!md;")
	public static Interface2 anInterface2_1;

	@OriginalMember(owner = "client!t", name = "Bb", descriptor = "I")
	public static int anInt2402;

	@OriginalMember(owner = "client!t", name = "Cb", descriptor = "I")
	public static int anInt2403;

	@OriginalMember(owner = "client!t", name = "pb", descriptor = "[I")
	public static int[] anIntArray294 = new int[65536];

	@OriginalMember(owner = "client!t", name = "kb", descriptor = "I")
	public static int anInt2395 = 0;

	@OriginalMember(owner = "client!t", name = "lb", descriptor = "Z")
	private static boolean aBoolean199 = false;

	@OriginalMember(owner = "client!t", name = "ob", descriptor = "Z")
	public static boolean aBoolean200 = true;

	@OriginalMember(owner = "client!t", name = "rb", descriptor = "Z")
	public static boolean aBoolean201 = false;

	@OriginalMember(owner = "client!t", name = "yb", descriptor = "Z")
	private static boolean aBoolean202 = false;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "([I[IIIIIIIIIIIIII)V")
	private static void method1588(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg5 >= arg6) {
			return;
		}
		@Pc(13) int local13;
		@Pc(38) int local38;
		if (aBoolean201) {
			local13 = (arg8 - arg7) / (arg6 - arg5);
			if (arg6 > anInt2399) {
				arg6 = anInt2399;
			}
			if (arg5 < 0) {
				arg7 -= arg5 * local13;
				arg5 = 0;
			}
			if (arg5 >= arg6) {
				return;
			}
			local38 = arg6 - arg5 >> 3;
			local13 <<= 0xC;
			arg7 <<= 0x9;
		} else {
			if (arg6 - arg5 > 7) {
				local38 = arg6 - arg5 >> 3;
				local13 = (arg8 - arg7) * Class3_Sub1_Sub4_Sub1.anIntArray296[local38] >> 6;
			} else {
				local38 = 0;
				local13 = 0;
			}
			arg7 <<= 0x9;
		}
		arg4 += arg5;
		@Pc(85) int local85;
		@Pc(87) int local87;
		@Pc(119) int local119;
		@Pc(91) int local91;
		@Pc(182) int local182;
		@Pc(188) int local188;
		@Pc(200) int local200;
		@Pc(206) int local206;
		@Pc(99) int local99;
		@Pc(107) int local107;
		@Pc(115) int local115;
		if (aBoolean199) {
			local85 = 0;
			local87 = 0;
			local91 = arg5 - anInt2402;
			local99 = arg9 + (arg12 >> 3) * local91;
			local107 = arg10 + (arg13 >> 3) * local91;
			local115 = arg11 + (arg14 >> 3) * local91;
			local119 = local115 >> 12;
			if (local119 != 0) {
				arg2 = local99 / local119;
				arg3 = local107 / local119;
				if (arg2 < 0) {
					arg2 = 0;
				} else if (arg2 > 4032) {
					arg2 = 4032;
				}
			}
			arg9 = local99 + arg12;
			arg10 = local107 + arg13;
			arg11 = local115 + arg14;
			local119 = arg11 >> 12;
			if (local119 != 0) {
				local85 = arg9 / local119;
				local87 = arg10 / local119;
				if (local85 < 7) {
					local85 = 7;
				} else if (local85 > 4032) {
					local85 = 4032;
				}
			}
			local182 = local85 - arg2 >> 3;
			local188 = local87 - arg3 >> 3;
			arg2 += arg7 >> 3 & 0xC0000;
			local200 = arg7 >> 23;
			if (aBoolean202) {
				while (local38-- > 0) {
					local206 = arg4 + 1;
					arg0[arg4] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200;
					arg2 += local182;
					arg3 += local188;
					arg0[local206++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200;
					arg2 += local182;
					arg3 += local188;
					arg0[local206++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200;
					arg2 += local182;
					arg3 += local188;
					arg0[local206++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200;
					arg2 += local182;
					arg3 += local188;
					arg0[local206++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200;
					arg2 += local182;
					arg3 += local188;
					arg0[local206++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200;
					arg2 += local182;
					arg3 += local188;
					arg0[local206++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200;
					arg2 += local182;
					arg3 += local188;
					arg4 = local206 + 1;
					arg0[local206] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200;
					arg2 = local85;
					arg3 = local87;
					arg9 += arg12;
					arg10 += arg13;
					arg11 += arg14;
					local119 = arg11 >> 12;
					if (local119 != 0) {
						local85 = arg9 / local119;
						local87 = arg10 / local119;
						if (local85 < 7) {
							local85 = 7;
						} else if (local85 > 4032) {
							local85 = 4032;
						}
					}
					local182 = local85 - arg2 >> 3;
					local188 = local87 - arg3 >> 3;
					arg7 += local13;
					arg2 += arg7 >> 3 & 0xC0000;
					local200 = arg7 >> 23;
				}
				local38 = arg6 - arg5 & 0x7;
				while (local38-- > 0) {
					arg0[arg4++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200;
					arg2 += local182;
					arg3 += local188;
				}
			} else {
				while (local38-- > 0) {
					@Pc(498) int local498;
					if ((local498 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200) != 0) {
						arg0[arg4] = local498;
					}
					local206 = arg4 + 1;
					arg2 += local182;
					arg3 += local188;
					@Pc(525) int local525;
					if ((local525 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200) != 0) {
						arg0[local206] = local525;
					}
					local206++;
					arg2 += local182;
					arg3 += local188;
					@Pc(552) int local552;
					if ((local552 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200) != 0) {
						arg0[local206] = local552;
					}
					local206++;
					arg2 += local182;
					arg3 += local188;
					@Pc(579) int local579;
					if ((local579 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200) != 0) {
						arg0[local206] = local579;
					}
					local206++;
					arg2 += local182;
					arg3 += local188;
					@Pc(606) int local606;
					if ((local606 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200) != 0) {
						arg0[local206] = local606;
					}
					local206++;
					arg2 += local182;
					arg3 += local188;
					@Pc(633) int local633;
					if ((local633 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200) != 0) {
						arg0[local206] = local633;
					}
					local206++;
					arg2 += local182;
					arg3 += local188;
					@Pc(660) int local660;
					if ((local660 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200) != 0) {
						arg0[local206] = local660;
					}
					local206++;
					arg2 += local182;
					arg3 += local188;
					@Pc(687) int local687;
					if ((local687 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200) != 0) {
						arg0[local206] = local687;
					}
					arg4 = local206 + 1;
					arg2 = local85;
					arg3 = local87;
					arg9 += arg12;
					arg10 += arg13;
					arg11 += arg14;
					local119 = arg11 >> 12;
					if (local119 != 0) {
						local85 = arg9 / local119;
						local87 = arg10 / local119;
						if (local85 < 7) {
							local85 = 7;
						} else if (local85 > 4032) {
							local85 = 4032;
						}
					}
					local182 = local85 - arg2 >> 3;
					local188 = local87 - arg3 >> 3;
					arg7 += local13;
					arg2 += arg7 >> 3 & 0xC0000;
					local200 = arg7 >> 23;
				}
				local38 = arg6 - arg5 & 0x7;
				while (local38-- > 0) {
					@Pc(785) int local785;
					if ((local785 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200) != 0) {
						arg0[arg4] = local785;
					}
					arg4++;
					arg2 += local182;
					arg3 += local188;
				}
			}
			return;
		}
		local85 = 0;
		local87 = 0;
		local91 = arg5 - anInt2402;
		local99 = arg9 + (arg12 >> 3) * local91;
		local107 = arg10 + (arg13 >> 3) * local91;
		local115 = arg11 + (arg14 >> 3) * local91;
		local119 = local115 >> 14;
		if (local119 != 0) {
			arg2 = local99 / local119;
			arg3 = local107 / local119;
			if (arg2 < 0) {
				arg2 = 0;
			} else if (arg2 > 16256) {
				arg2 = 16256;
			}
		}
		arg9 = local99 + arg12;
		arg10 = local107 + arg13;
		arg11 = local115 + arg14;
		local119 = arg11 >> 14;
		if (local119 != 0) {
			local85 = arg9 / local119;
			local87 = arg10 / local119;
			if (local85 < 7) {
				local85 = 7;
			} else if (local85 > 16256) {
				local85 = 16256;
			}
		}
		local182 = local85 - arg2 >> 3;
		local188 = local87 - arg3 >> 3;
		arg2 += arg7 & 0x600000;
		local200 = arg7 >> 23;
		if (aBoolean202) {
			while (local38-- > 0) {
				local206 = arg4 + 1;
				arg0[arg4] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200;
				arg2 += local182;
				arg3 += local188;
				@Pc(947) int local947 = local206 + 1;
				arg0[local206] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200;
				arg2 += local182;
				arg3 += local188;
				@Pc(970) int local970 = local947 + 1;
				arg0[local947] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200;
				arg2 += local182;
				arg3 += local188;
				@Pc(993) int local993 = local970 + 1;
				arg0[local970] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200;
				arg2 += local182;
				arg3 += local188;
				@Pc(1016) int local1016 = local993 + 1;
				arg0[local993] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200;
				arg2 += local182;
				arg3 += local188;
				@Pc(1039) int local1039 = local1016 + 1;
				arg0[local1016] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200;
				arg2 += local182;
				arg3 += local188;
				@Pc(1062) int local1062 = local1039 + 1;
				arg0[local1039] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200;
				arg2 += local182;
				arg3 += local188;
				arg4 = local1062 + 1;
				arg0[local1062] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200;
				arg2 = local85;
				arg3 = local87;
				arg9 += arg12;
				arg10 += arg13;
				arg11 += arg14;
				local119 = arg11 >> 14;
				if (local119 != 0) {
					local85 = arg9 / local119;
					local87 = arg10 / local119;
					if (local85 < 7) {
						local85 = 7;
					} else if (local85 > 16256) {
						local85 = 16256;
					}
				}
				local182 = local85 - arg2 >> 3;
				local188 = local87 - arg3 >> 3;
				arg7 += local13;
				arg2 += arg7 & 0x600000;
				local200 = arg7 >> 23;
			}
			local38 = arg6 - arg5 & 0x7;
			while (local38-- > 0) {
				arg0[arg4++] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200;
				arg2 += local182;
				arg3 += local188;
			}
			return;
		}
		while (local38-- > 0) {
			@Pc(1214) int local1214;
			if ((local1214 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200) != 0) {
				arg0[arg4] = local1214;
			}
			local206 = arg4 + 1;
			arg2 += local182;
			arg3 += local188;
			@Pc(1241) int local1241;
			if ((local1241 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200) != 0) {
				arg0[local206] = local1241;
			}
			local206++;
			arg2 += local182;
			arg3 += local188;
			@Pc(1268) int local1268;
			if ((local1268 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200) != 0) {
				arg0[local206] = local1268;
			}
			local206++;
			arg2 += local182;
			arg3 += local188;
			@Pc(1295) int local1295;
			if ((local1295 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200) != 0) {
				arg0[local206] = local1295;
			}
			local206++;
			arg2 += local182;
			arg3 += local188;
			@Pc(1322) int local1322;
			if ((local1322 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200) != 0) {
				arg0[local206] = local1322;
			}
			local206++;
			arg2 += local182;
			arg3 += local188;
			@Pc(1349) int local1349;
			if ((local1349 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200) != 0) {
				arg0[local206] = local1349;
			}
			local206++;
			arg2 += local182;
			arg3 += local188;
			@Pc(1376) int local1376;
			if ((local1376 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200) != 0) {
				arg0[local206] = local1376;
			}
			local206++;
			arg2 += local182;
			arg3 += local188;
			@Pc(1403) int local1403;
			if ((local1403 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200) != 0) {
				arg0[local206] = local1403;
			}
			arg4 = local206 + 1;
			arg2 = local85;
			arg3 = local87;
			arg9 += arg12;
			arg10 += arg13;
			arg11 += arg14;
			local119 = arg11 >> 14;
			if (local119 != 0) {
				local85 = arg9 / local119;
				local87 = arg10 / local119;
				if (local85 < 7) {
					local85 = 7;
				} else if (local85 > 16256) {
					local85 = 16256;
				}
			}
			local182 = local85 - arg2 >> 3;
			local188 = local87 - arg3 >> 3;
			arg7 += local13;
			arg2 += arg7 & 0x600000;
			local200 = arg7 >> 23;
		}
		local38 = arg6 - arg5 & 0x7;
		while (local38-- > 0) {
			@Pc(1499) int local1499;
			if ((local1499 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200) != 0) {
				arg0[arg4] = local1499;
			}
			arg4++;
			arg2 += local182;
			arg3 += local188;
		}
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "()[I")
	public static int[] method1589() {
		return anIntArray297;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "([IIIIIIII)V")
	private static void method1590(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		@Pc(16) int local16;
		@Pc(143) int local143;
		@Pc(147) int local147;
		@Pc(48) int local48;
		@Pc(91) int local91;
		if (aBoolean200) {
			if (aBoolean201) {
				if (arg3 - arg2 > 3) {
					local16 = (arg5 - arg4) / (arg3 - arg2);
				} else {
					local16 = 0;
				}
				if (arg3 > anInt2399) {
					arg3 = anInt2399;
				}
				if (arg2 < 0) {
					arg4 -= arg2 * local16;
					arg2 = 0;
				}
				if (arg2 >= arg3) {
					return;
				}
				arg1 += arg2;
				local48 = arg3 - arg2 >> 2;
				local16 <<= 0x2;
			} else if (arg2 < arg3) {
				arg1 += arg2;
				local48 = arg3 - arg2 >> 2;
				if (local48 > 0) {
					local16 = (arg5 - arg4) * Class3_Sub1_Sub4_Sub1.anIntArray296[local48] >> 15;
				} else {
					local16 = 0;
				}
			} else {
				return;
			}
			@Pc(98) int local98;
			if (anInt2395 == 0) {
				while (true) {
					local48--;
					if (local48 < 0) {
						local48 = arg3 - arg2 & 0x3;
						if (local48 > 0) {
							local91 = anIntArray294[arg4 >> 8];
							do {
								arg0[arg1++] = local91;
								local48--;
							} while (local48 > 0);
							return;
						}
						break;
					}
					local91 = anIntArray294[arg4 >> 8];
					arg4 += local16;
					local98 = arg1 + 1;
					arg0[arg1] = local91;
					@Pc(103) int local103 = local98 + 1;
					arg0[local98] = local91;
					@Pc(108) int local108 = local103 + 1;
					arg0[local103] = local91;
					arg1 = local108 + 1;
					arg0[local108] = local91;
				}
			} else {
				local143 = anInt2395;
				local147 = 256 - anInt2395;
				while (true) {
					local48--;
					if (local48 < 0) {
						local48 = arg3 - arg2 & 0x3;
						if (local48 > 0) {
							local91 = anIntArray294[arg4 >> 8];
							local91 = ((local91 & 0xFF00FF) * local147 >> 8 & 0xFF00FF) + ((local91 & 0xFF00) * local147 >> 8 & 0xFF00);
							do {
								arg0[arg1++] = local91 + ((arg0[arg1] & 0xFF00FF) * local143 >> 8 & 0xFF00FF) + ((arg0[arg1] & 0xFF00) * local143 >> 8 & 0xFF00);
								local48--;
							} while (local48 > 0);
						}
						break;
					}
					local91 = anIntArray294[arg4 >> 8];
					arg4 += local16;
					local91 = ((local91 & 0xFF00FF) * local147 >> 8 & 0xFF00FF) + ((local91 & 0xFF00) * local147 >> 8 & 0xFF00);
					local98 = arg1 + 1;
					arg0[arg1] = local91 + ((arg0[local98] & 0xFF00FF) * local143 >> 8 & 0xFF00FF) + ((arg0[local98] & 0xFF00) * local143 >> 8 & 0xFF00);
					arg0[local98++] = local91 + ((arg0[local98] & 0xFF00FF) * local143 >> 8 & 0xFF00FF) + ((arg0[local98] & 0xFF00) * local143 >> 8 & 0xFF00);
					arg0[local98++] = local91 + ((arg0[local98] & 0xFF00FF) * local143 >> 8 & 0xFF00FF) + ((arg0[local98] & 0xFF00) * local143 >> 8 & 0xFF00);
					arg1 = local98 + 1;
					arg0[local98] = local91 + ((arg0[arg1] & 0xFF00FF) * local143 >> 8 & 0xFF00FF) + ((arg0[arg1] & 0xFF00) * local143 >> 8 & 0xFF00);
				}
			}
		} else if (arg2 < arg3) {
			local16 = (arg5 - arg4) / (arg3 - arg2);
			if (aBoolean201) {
				if (arg3 > anInt2399) {
					arg3 = anInt2399;
				}
				if (arg2 < 0) {
					arg4 -= arg2 * local16;
					arg2 = 0;
				}
				if (arg2 >= arg3) {
					return;
				}
			}
			@Pc(401) int local401 = arg1 + arg2;
			local48 = arg3 - arg2;
			if (anInt2395 == 0) {
				do {
					arg0[local401++] = anIntArray294[arg4 >> 8];
					arg4 += local16;
					local48--;
				} while (local48 > 0);
			} else {
				local143 = anInt2395;
				local147 = 256 - anInt2395;
				do {
					local91 = anIntArray294[arg4 >> 8];
					arg4 += local16;
					@Pc(460) int local460 = ((local91 & 0xFF00FF) * local147 >> 8 & 0xFF00FF) + ((local91 & 0xFF00) * local147 >> 8 & 0xFF00);
					arg0[local401++] = local460 + ((arg0[local401] & 0xFF00FF) * local143 >> 8 & 0xFF00FF) + ((arg0[local401] & 0xFF00) * local143 >> 8 & 0xFF00);
					local48--;
				} while (local48 > 0);
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(D)V")
	public static void method1591(@OriginalArg(0) double arg0) {
		method1600(arg0);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "([I)[I")
	public static int[] method1592(@OriginalArg(0) int[] arg0) {
		return method1603(Static50.anInt2727, Static50.anInt2725, Static50.anInt2729, Static50.anInt2728, arg0);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(II)I")
	private static int method1593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = (127 - arg1) * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(II)V")
	public static void method1594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = anIntArray297[0];
		@Pc(7) int local7 = local3 / Static50.anInt2730;
		@Pc(13) int local13 = local3 - local7 * Static50.anInt2730;
		anInt2402 = arg0 - local13;
		anInt2403 = arg1 - local7;
		anInt2398 = -anInt2402;
		anInt2401 = anInt2399 - anInt2402;
		anInt2396 = -anInt2403;
		anInt2400 = anInt2397 - anInt2403;
	}

	@OriginalMember(owner = "client!t", name = "e", descriptor = "()V")
	public static void method1595() {
		anInt2402 = anInt2399 / 2;
		anInt2403 = anInt2397 / 2;
		anInt2398 = -anInt2402;
		anInt2401 = anInt2399 - anInt2402;
		anInt2396 = -anInt2403;
		anInt2400 = anInt2397 - anInt2403;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "([IIIIII)V")
	private static void method1596(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (aBoolean201) {
			if (arg4 > anInt2399) {
				arg4 = anInt2399;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		arg1 += arg3;
		@Pc(24) int local24 = arg4 - arg3 >> 2;
		@Pc(30) int local30;
		if (anInt2395 == 0) {
			while (true) {
				local24--;
				if (local24 < 0) {
					local24 = arg4 - arg3 & 0x3;
					while (true) {
						local24--;
						if (local24 < 0) {
							return;
						}
						arg0[arg1++] = arg2;
					}
				}
				local30 = arg1 + 1;
				arg0[arg1] = arg2;
				arg0[local30++] = arg2;
				arg0[local30++] = arg2;
				arg1 = local30 + 1;
				arg0[local30] = arg2;
			}
			return;
		}
		@Pc(68) int local68 = anInt2395;
		@Pc(72) int local72 = 256 - anInt2395;
		@Pc(92) int local92 = ((arg2 & 0xFF00FF) * local72 >> 8 & 0xFF00FF) + ((arg2 & 0xFF00) * local72 >> 8 & 0xFF00);
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg4 - arg3 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg0[arg1++] = local92 + ((arg0[arg1] & 0xFF00FF) * local68 >> 8 & 0xFF00FF) + ((arg0[arg1] & 0xFF00) * local68 >> 8 & 0xFF00);
				}
			}
			local30 = arg1 + 1;
			arg0[arg1] = local92 + ((arg0[local30] & 0xFF00FF) * local68 >> 8 & 0xFF00FF) + ((arg0[local30] & 0xFF00) * local68 >> 8 & 0xFF00);
			@Pc(125) int local125 = local30 + 1;
			arg0[local30] = local92 + ((arg0[local125] & 0xFF00FF) * local68 >> 8 & 0xFF00FF) + ((arg0[local125] & 0xFF00) * local68 >> 8 & 0xFF00);
			@Pc(154) int local154 = local125 + 1;
			arg0[local125] = local92 + ((arg0[local154] & 0xFF00FF) * local68 >> 8 & 0xFF00FF) + ((arg0[local154] & 0xFF00) * local68 >> 8 & 0xFF00);
			arg1 = local154 + 1;
			arg0[local154] = local92 + ((arg0[arg1] & 0xFF00FF) * local68 >> 8 & 0xFF00FF) + ((arg0[arg1] & 0xFF00) * local68 >> 8 & 0xFF00);
		}
	}

	@OriginalMember(owner = "client!t", name = "f", descriptor = "()V")
	public static void method1597() {
		anIntArray297 = null;
		anIntArray294 = null;
		anInterface2_1 = null;
		Class3_Sub1_Sub4_Sub1.anIntArray296 = null;
		Class3_Sub1_Sub4_Sub1.anIntArray293 = null;
		Class3_Sub1_Sub4_Sub1.anIntArray295 = null;
		Class3_Sub1_Sub4_Sub1.anIntArray298 = null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIII)V")
	public static void method1598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) int local1 = 0;
		if (arg1 != arg0) {
			local1 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(16) int local16 = 0;
		if (arg2 != arg1) {
			local16 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(31) int local31 = 0;
		if (arg2 != arg0) {
			local31 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < anInt2397) {
				if (arg1 > anInt2397) {
					arg1 = anInt2397;
				}
				if (arg2 > anInt2397) {
					arg2 = anInt2397;
				}
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local31 * arg0;
						arg3 -= local1 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local16 * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && local31 < local1 || arg0 == arg1 && local31 > local16) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray297[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method1596(Static50.anIntArray332, arg0, arg6, arg5 >> 16, arg4 >> 16);
									arg5 += local31;
									arg4 += local16;
									arg0 += Static50.anInt2730;
								}
							}
							method1596(Static50.anIntArray332, arg0, arg6, arg5 >> 16, arg3 >> 16);
							arg5 += local31;
							arg3 += local1;
							arg0 += Static50.anInt2730;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray297[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method1596(Static50.anIntArray332, arg0, arg6, arg4 >> 16, arg5 >> 16);
									arg5 += local31;
									arg4 += local16;
									arg0 += Static50.anInt2730;
								}
							}
							method1596(Static50.anIntArray332, arg0, arg6, arg3 >> 16, arg5 >> 16);
							arg5 += local31;
							arg3 += local1;
							arg0 += Static50.anInt2730;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local31 * arg0;
						arg3 -= local1 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local16 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local31 < local1 || arg0 == arg2 && local16 > local1) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray297[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method1596(Static50.anIntArray332, arg0, arg6, arg5 >> 16, arg3 >> 16);
									arg5 += local16;
									arg3 += local1;
									arg0 += Static50.anInt2730;
								}
							}
							method1596(Static50.anIntArray332, arg0, arg6, arg4 >> 16, arg3 >> 16);
							arg4 += local31;
							arg3 += local1;
							arg0 += Static50.anInt2730;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray297[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method1596(Static50.anIntArray332, arg0, arg6, arg3 >> 16, arg5 >> 16);
									arg5 += local16;
									arg3 += local1;
									arg0 += Static50.anInt2730;
								}
							}
							method1596(Static50.anIntArray332, arg0, arg6, arg3 >> 16, arg4 >> 16);
							arg4 += local31;
							arg3 += local1;
							arg0 += Static50.anInt2730;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < anInt2397) {
				if (arg2 > anInt2397) {
					arg2 = anInt2397;
				}
				if (arg0 > anInt2397) {
					arg0 = anInt2397;
				}
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local1 * arg1;
						arg4 -= local16 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local31 * arg2;
						arg2 = 0;
					}
					if (arg1 != arg2 && local1 < local16 || arg1 == arg2 && local1 > local31) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray297[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method1596(Static50.anIntArray332, arg1, arg6, arg3 >> 16, arg5 >> 16);
									arg3 += local1;
									arg5 += local31;
									arg1 += Static50.anInt2730;
								}
							}
							method1596(Static50.anIntArray332, arg1, arg6, arg3 >> 16, arg4 >> 16);
							arg3 += local1;
							arg4 += local16;
							arg1 += Static50.anInt2730;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray297[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method1596(Static50.anIntArray332, arg1, arg6, arg5 >> 16, arg3 >> 16);
									arg3 += local1;
									arg5 += local31;
									arg1 += Static50.anInt2730;
								}
							}
							method1596(Static50.anIntArray332, arg1, arg6, arg4 >> 16, arg3 >> 16);
							arg3 += local1;
							arg4 += local16;
							arg1 += Static50.anInt2730;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local1 * arg1;
						arg4 -= local16 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local31 * arg0;
						arg0 = 0;
					}
					if (local1 < local16) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray297[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method1596(Static50.anIntArray332, arg1, arg6, arg3 >> 16, arg4 >> 16);
									arg3 += local31;
									arg4 += local16;
									arg1 += Static50.anInt2730;
								}
							}
							method1596(Static50.anIntArray332, arg1, arg6, arg5 >> 16, arg4 >> 16);
							arg5 += local1;
							arg4 += local16;
							arg1 += Static50.anInt2730;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray297[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method1596(Static50.anIntArray332, arg1, arg6, arg4 >> 16, arg3 >> 16);
									arg3 += local31;
									arg4 += local16;
									arg1 += Static50.anInt2730;
								}
							}
							method1596(Static50.anIntArray332, arg1, arg6, arg4 >> 16, arg5 >> 16);
							arg5 += local1;
							arg4 += local16;
							arg1 += Static50.anInt2730;
						}
					}
				}
			}
		} else if (arg2 < anInt2397) {
			if (arg0 > anInt2397) {
				arg0 = anInt2397;
			}
			if (arg1 > anInt2397) {
				arg1 = anInt2397;
			}
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local16 * arg2;
					arg5 -= local31 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local1 * arg0;
					arg0 = 0;
				}
				if (local16 < local31) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray297[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method1596(Static50.anIntArray332, arg2, arg6, arg4 >> 16, arg3 >> 16);
								arg4 += local16;
								arg3 += local1;
								arg2 += Static50.anInt2730;
							}
						}
						method1596(Static50.anIntArray332, arg2, arg6, arg4 >> 16, arg5 >> 16);
						arg4 += local16;
						arg5 += local31;
						arg2 += Static50.anInt2730;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray297[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method1596(Static50.anIntArray332, arg2, arg6, arg3 >> 16, arg4 >> 16);
								arg4 += local16;
								arg3 += local1;
								arg2 += Static50.anInt2730;
							}
						}
						method1596(Static50.anIntArray332, arg2, arg6, arg5 >> 16, arg4 >> 16);
						arg4 += local16;
						arg5 += local31;
						arg2 += Static50.anInt2730;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local16 * arg2;
					arg5 -= local31 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local1 * arg1;
					arg1 = 0;
				}
				if (local16 < local31) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray297[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method1596(Static50.anIntArray332, arg2, arg6, arg4 >> 16, arg5 >> 16);
								arg4 += local1;
								arg5 += local31;
								arg2 += Static50.anInt2730;
							}
						}
						method1596(Static50.anIntArray332, arg2, arg6, arg3 >> 16, arg5 >> 16);
						arg3 += local16;
						arg5 += local31;
						arg2 += Static50.anInt2730;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray297[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method1596(Static50.anIntArray332, arg2, arg6, arg5 >> 16, arg4 >> 16);
								arg4 += local1;
								arg5 += local31;
								arg2 += Static50.anInt2730;
							}
						}
						method1596(Static50.anIntArray332, arg2, arg6, arg5 >> 16, arg3 >> 16);
						arg3 += local16;
						arg5 += local31;
						arg2 += Static50.anInt2730;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!md;)V")
	public static void method1599(@OriginalArg(0) Interface2 arg0) {
		anInterface2_1 = arg0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(DII)V")
	private static void method1600(@OriginalArg(0) double arg0) {
		@Pc(7) double local7 = arg0 + Math.random() * 0.03D - 0.015D;
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < 512; local13++) {
			@Pc(23) double local23 = (double) (local13 >> 3) / 64.0D + 0.0078125D;
			@Pc(32) double local32 = (double) (local13 & 0x7) / 8.0D + 0.0625D;
			for (@Pc(34) int local34 = 0; local34 < 128; local34++) {
				@Pc(40) double local40 = (double) local34 / 128.0D;
				@Pc(42) double local42 = local40;
				@Pc(44) double local44 = local40;
				@Pc(46) double local46 = local40;
				if (local32 != 0.0D) {
					@Pc(60) double local60;
					if (local40 < 0.5D) {
						local60 = local40 * (local32 + 1.0D);
					} else {
						local60 = local40 + local32 - local40 * local32;
					}
					@Pc(75) double local75 = local40 * 2.0D - local60;
					@Pc(79) double local79 = local23 + 0.3333333333333333D;
					if (local79 > 1.0D) {
						local79--;
					}
					@Pc(93) double local93 = local23 - 0.3333333333333333D;
					if (local93 < 0.0D) {
						local93++;
					}
					if (local79 * 6.0D < 1.0D) {
						local42 = local75 + (local60 - local75) * 6.0D * local79;
					} else if (local79 * 2.0D < 1.0D) {
						local42 = local60;
					} else if (local79 * 3.0D < 2.0D) {
						local42 = local75 + (local60 - local75) * (0.6666666666666666D - local79) * 6.0D;
					} else {
						local42 = local75;
					}
					if (local23 * 6.0D < 1.0D) {
						local44 = local75 + (local60 - local75) * 6.0D * local23;
					} else if (local23 * 2.0D < 1.0D) {
						local44 = local60;
					} else if (local23 * 3.0D < 2.0D) {
						local44 = local75 + (local60 - local75) * (0.6666666666666666D - local23) * 6.0D;
					} else {
						local44 = local75;
					}
					if (local93 * 6.0D < 1.0D) {
						local46 = local75 + (local60 - local75) * 6.0D * local93;
					} else if (local93 * 2.0D < 1.0D) {
						local46 = local60;
					} else if (local93 * 3.0D < 2.0D) {
						local46 = local75 + (local60 - local75) * (0.6666666666666666D - local93) * 6.0D;
					} else {
						local46 = local75;
					}
				}
				@Pc(247) int local247 = (int) (local42 * 256.0D);
				@Pc(252) int local252 = (int) (local44 * 256.0D);
				@Pc(257) int local257 = (int) (local46 * 256.0D);
				@Pc(267) int local267 = (local247 << 16) + (local252 << 8) + local257;
				local267 = method1601(local267, local7);
				if (local267 == 0) {
					local267 = 1;
				}
				anIntArray294[local11++] = local267;
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ID)I")
	public static int method1601(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1) {
		@Pc(6) double local6 = (double) (arg0 >> 16) / 256.0D;
		@Pc(15) double local15 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(22) double local22 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = Math.pow(local6, arg1);
		@Pc(30) double local30 = Math.pow(local15, arg1);
		@Pc(34) double local34 = Math.pow(local22, arg1);
		@Pc(39) int local39 = (int) (local26 * 256.0D);
		@Pc(44) int local44 = (int) (local30 * 256.0D);
		@Pc(49) int local49 = (int) (local34 * 256.0D);
		return (local39 << 16) + (local44 << 8) + local49;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		if (arg1 != arg0) {
			local1 = (arg4 - arg3 << 16) / (arg1 - arg0);
			local3 = (arg7 - arg6 << 15) / (arg1 - arg0);
		}
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		if (arg2 != arg1) {
			local28 = (arg5 - arg4 << 16) / (arg2 - arg1);
			local30 = (arg8 - arg7 << 15) / (arg2 - arg1);
		}
		@Pc(55) int local55 = 0;
		@Pc(57) int local57 = 0;
		if (arg2 != arg0) {
			local55 = (arg3 - arg5 << 16) / (arg0 - arg2);
			local57 = (arg6 - arg8 << 15) / (arg0 - arg2);
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < anInt2397) {
				if (arg1 > anInt2397) {
					arg1 = anInt2397;
				}
				if (arg2 > anInt2397) {
					arg2 = anInt2397;
				}
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					arg8 = arg6 <<= 0xF;
					if (arg0 < 0) {
						arg5 -= local55 * arg0;
						arg3 -= local1 * arg0;
						arg8 -= local57 * arg0;
						arg6 -= local3 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					arg7 <<= 0xF;
					if (arg1 < 0) {
						arg4 -= local28 * arg1;
						arg7 -= local30 * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && local55 < local1 || arg0 == arg1 && local55 > local28) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray297[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method1590(Static50.anIntArray332, arg0, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
									arg5 += local55;
									arg4 += local28;
									arg8 += local57;
									arg7 += local30;
									arg0 += Static50.anInt2730;
								}
							}
							method1590(Static50.anIntArray332, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
							arg5 += local55;
							arg3 += local1;
							arg8 += local57;
							arg6 += local3;
							arg0 += Static50.anInt2730;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray297[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method1590(Static50.anIntArray332, arg0, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
									arg5 += local55;
									arg4 += local28;
									arg8 += local57;
									arg7 += local30;
									arg0 += Static50.anInt2730;
								}
							}
							method1590(Static50.anIntArray332, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
							arg5 += local55;
							arg3 += local1;
							arg8 += local57;
							arg6 += local3;
							arg0 += Static50.anInt2730;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					arg7 = arg6 <<= 0xF;
					if (arg0 < 0) {
						arg4 -= local55 * arg0;
						arg3 -= local1 * arg0;
						arg7 -= local57 * arg0;
						arg6 -= local3 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					arg8 <<= 0xF;
					if (arg2 < 0) {
						arg5 -= local28 * arg2;
						arg8 -= local30 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local55 < local1 || arg0 == arg2 && local28 > local1) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray297[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method1590(Static50.anIntArray332, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
									arg5 += local28;
									arg3 += local1;
									arg8 += local30;
									arg6 += local3;
									arg0 += Static50.anInt2730;
								}
							}
							method1590(Static50.anIntArray332, arg0, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
							arg4 += local55;
							arg3 += local1;
							arg7 += local57;
							arg6 += local3;
							arg0 += Static50.anInt2730;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray297[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method1590(Static50.anIntArray332, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
									arg5 += local28;
									arg3 += local1;
									arg8 += local30;
									arg6 += local3;
									arg0 += Static50.anInt2730;
								}
							}
							method1590(Static50.anIntArray332, arg0, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
							arg4 += local55;
							arg3 += local1;
							arg7 += local57;
							arg6 += local3;
							arg0 += Static50.anInt2730;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < anInt2397) {
				if (arg2 > anInt2397) {
					arg2 = anInt2397;
				}
				if (arg0 > anInt2397) {
					arg0 = anInt2397;
				}
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					arg6 = arg7 <<= 0xF;
					if (arg1 < 0) {
						arg3 -= local1 * arg1;
						arg4 -= local28 * arg1;
						arg6 -= local3 * arg1;
						arg7 -= local30 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					arg8 <<= 0xF;
					if (arg2 < 0) {
						arg5 -= local55 * arg2;
						arg8 -= local57 * arg2;
						arg2 = 0;
					}
					if (arg1 != arg2 && local1 < local28 || arg1 == arg2 && local1 > local55) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray297[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method1590(Static50.anIntArray332, arg1, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
									arg3 += local1;
									arg5 += local55;
									arg6 += local3;
									arg8 += local57;
									arg1 += Static50.anInt2730;
								}
							}
							method1590(Static50.anIntArray332, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
							arg3 += local1;
							arg4 += local28;
							arg6 += local3;
							arg7 += local30;
							arg1 += Static50.anInt2730;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray297[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method1590(Static50.anIntArray332, arg1, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
									arg3 += local1;
									arg5 += local55;
									arg6 += local3;
									arg8 += local57;
									arg1 += Static50.anInt2730;
								}
							}
							method1590(Static50.anIntArray332, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
							arg3 += local1;
							arg4 += local28;
							arg6 += local3;
							arg7 += local30;
							arg1 += Static50.anInt2730;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					arg8 = arg7 <<= 0xF;
					if (arg1 < 0) {
						arg5 -= local1 * arg1;
						arg4 -= local28 * arg1;
						arg8 -= local3 * arg1;
						arg7 -= local30 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					arg6 <<= 0xF;
					if (arg0 < 0) {
						arg3 -= local55 * arg0;
						arg6 -= local57 * arg0;
						arg0 = 0;
					}
					if (local1 < local28) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray297[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method1590(Static50.anIntArray332, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
									arg3 += local55;
									arg4 += local28;
									arg6 += local57;
									arg7 += local30;
									arg1 += Static50.anInt2730;
								}
							}
							method1590(Static50.anIntArray332, arg1, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
							arg5 += local1;
							arg4 += local28;
							arg8 += local3;
							arg7 += local30;
							arg1 += Static50.anInt2730;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray297[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method1590(Static50.anIntArray332, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
									arg3 += local55;
									arg4 += local28;
									arg6 += local57;
									arg7 += local30;
									arg1 += Static50.anInt2730;
								}
							}
							method1590(Static50.anIntArray332, arg1, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
							arg5 += local1;
							arg4 += local28;
							arg8 += local3;
							arg7 += local30;
							arg1 += Static50.anInt2730;
						}
					}
				}
			}
		} else if (arg2 < anInt2397) {
			if (arg0 > anInt2397) {
				arg0 = anInt2397;
			}
			if (arg1 > anInt2397) {
				arg1 = anInt2397;
			}
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				arg7 = arg8 <<= 0xF;
				if (arg2 < 0) {
					arg4 -= local28 * arg2;
					arg5 -= local55 * arg2;
					arg7 -= local30 * arg2;
					arg8 -= local57 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				arg6 <<= 0xF;
				if (arg0 < 0) {
					arg3 -= local1 * arg0;
					arg6 -= local3 * arg0;
					arg0 = 0;
				}
				if (local28 < local55) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray297[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method1590(Static50.anIntArray332, arg2, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
								arg4 += local28;
								arg3 += local1;
								arg7 += local30;
								arg6 += local3;
								arg2 += Static50.anInt2730;
							}
						}
						method1590(Static50.anIntArray332, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
						arg4 += local28;
						arg5 += local55;
						arg7 += local30;
						arg8 += local57;
						arg2 += Static50.anInt2730;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray297[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method1590(Static50.anIntArray332, arg2, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
								arg4 += local28;
								arg3 += local1;
								arg7 += local30;
								arg6 += local3;
								arg2 += Static50.anInt2730;
							}
						}
						method1590(Static50.anIntArray332, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
						arg4 += local28;
						arg5 += local55;
						arg7 += local30;
						arg8 += local57;
						arg2 += Static50.anInt2730;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				arg6 = arg8 <<= 0xF;
				if (arg2 < 0) {
					arg3 -= local28 * arg2;
					arg5 -= local55 * arg2;
					arg6 -= local30 * arg2;
					arg8 -= local57 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				arg7 <<= 0xF;
				if (arg1 < 0) {
					arg4 -= local1 * arg1;
					arg7 -= local3 * arg1;
					arg1 = 0;
				}
				if (local28 < local55) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray297[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method1590(Static50.anIntArray332, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
								arg4 += local1;
								arg5 += local55;
								arg7 += local3;
								arg8 += local57;
								arg2 += Static50.anInt2730;
							}
						}
						method1590(Static50.anIntArray332, arg2, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
						arg3 += local28;
						arg5 += local55;
						arg6 += local30;
						arg8 += local57;
						arg2 += Static50.anInt2730;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray297[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method1590(Static50.anIntArray332, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
								arg4 += local1;
								arg5 += local55;
								arg7 += local3;
								arg8 += local57;
								arg2 += Static50.anInt2730;
							}
						}
						method1590(Static50.anIntArray332, arg2, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
						arg3 += local28;
						arg5 += local55;
						arg6 += local30;
						arg8 += local57;
						arg2 += Static50.anInt2730;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIII[I)[I")
	private static int[] method1603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		anInt2399 = arg2 - arg0;
		anInt2397 = arg3 - arg1;
		if (arg4 == null) {
			@Pc(11) int local11 = anInt2397;
			if (local11 == 0) {
				local11++;
			}
			anIntArray297 = new int[local11];
			for (@Pc(19) int local19 = 0; local19 < local11; local19++) {
				anIntArray297[local19] = (arg1 + local19) * Static50.anInt2730 + arg0;
			}
		} else {
			anIntArray297 = arg4;
		}
		method1595();
		return anIntArray297;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
	public static void method1604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18) {
		@Pc(4) int[] local4 = anInterface2_1.method961(arg18);
		@Pc(11) int local11;
		if (local4 == null) {
			local11 = anInterface2_1.method960(arg18);
			method1602(arg0, arg1, arg2, arg3, arg4, arg5, method1593(local11, arg6), method1593(local11, arg7), method1593(local11, arg8));
			return;
		}
		aBoolean199 = anInterface2_1.method959(arg18);
		aBoolean202 = anInterface2_1.method962(arg18);
		@Pc(42) int local42 = arg9 - arg10;
		@Pc(46) int local46 = arg12 - arg13;
		@Pc(50) int local50 = arg15 - arg16;
		@Pc(54) int local54 = arg11 - arg9;
		@Pc(58) int local58 = arg14 - arg12;
		@Pc(62) int local62 = arg17 - arg15;
		local11 = local54 * arg12 - local58 * arg9 << 14;
		@Pc(82) int local82 = local58 * arg15 - local62 * arg12 << 8;
		@Pc(92) int local92 = local62 * arg9 - local54 * arg15 << 5;
		@Pc(102) int local102 = local42 * arg12 - local46 * arg9 << 14;
		@Pc(112) int local112 = local46 * arg15 - local50 * arg12 << 8;
		@Pc(122) int local122 = local50 * arg9 - local42 * arg15 << 5;
		@Pc(132) int local132 = local46 * local54 - local42 * local58 << 14;
		@Pc(142) int local142 = local50 * local58 - local46 * local62 << 8;
		@Pc(152) int local152 = local42 * local62 - local50 * local54 << 5;
		@Pc(154) int local154 = 0;
		@Pc(156) int local156 = 0;
		if (arg1 != arg0) {
			local154 = (arg4 - arg3 << 16) / (arg1 - arg0);
			local156 = (arg7 - arg6 << 16) / (arg1 - arg0);
		}
		@Pc(181) int local181 = 0;
		@Pc(183) int local183 = 0;
		if (arg2 != arg1) {
			local181 = (arg5 - arg4 << 16) / (arg2 - arg1);
			local183 = (arg8 - arg7 << 16) / (arg2 - arg1);
		}
		@Pc(208) int local208 = 0;
		@Pc(210) int local210 = 0;
		if (arg2 != arg0) {
			local208 = (arg3 - arg5 << 16) / (arg0 - arg2);
			local210 = (arg6 - arg8 << 16) / (arg0 - arg2);
		}
		@Pc(324) int local324;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < anInt2397) {
				if (arg1 > anInt2397) {
					arg1 = anInt2397;
				}
				if (arg2 > anInt2397) {
					arg2 = anInt2397;
				}
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					arg8 = arg6 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local208 * arg0;
						arg3 -= local154 * arg0;
						arg8 -= local210 * arg0;
						arg6 -= local156 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					arg7 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local181 * arg1;
						arg7 -= local183 * arg1;
						arg1 = 0;
					}
					local324 = arg0 - anInt2403;
					local11 += local92 * local324;
					local102 += local122 * local324;
					local132 += local152 * local324;
					if (arg0 != arg1 && local208 < local154 || arg0 == arg1 && local208 > local181) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray297[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method1588(Static50.anIntArray332, local4, 0, 0, arg0, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, local11, local102, local132, local82, local112, local142);
									arg5 += local208;
									arg4 += local181;
									arg8 += local210;
									arg7 += local183;
									arg0 += Static50.anInt2730;
									local11 += local92;
									local102 += local122;
									local132 += local152;
								}
							}
							method1588(Static50.anIntArray332, local4, 0, 0, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, local11, local102, local132, local82, local112, local142);
							arg5 += local208;
							arg3 += local154;
							arg8 += local210;
							arg6 += local156;
							arg0 += Static50.anInt2730;
							local11 += local92;
							local102 += local122;
							local132 += local152;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray297[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method1588(Static50.anIntArray332, local4, 0, 0, arg0, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, local11, local102, local132, local82, local112, local142);
									arg5 += local208;
									arg4 += local181;
									arg8 += local210;
									arg7 += local183;
									arg0 += Static50.anInt2730;
									local11 += local92;
									local102 += local122;
									local132 += local152;
								}
							}
							method1588(Static50.anIntArray332, local4, 0, 0, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, local11, local102, local132, local82, local112, local142);
							arg5 += local208;
							arg3 += local154;
							arg8 += local210;
							arg6 += local156;
							arg0 += Static50.anInt2730;
							local11 += local92;
							local102 += local122;
							local132 += local152;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					arg7 = arg6 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local208 * arg0;
						arg3 -= local154 * arg0;
						arg7 -= local210 * arg0;
						arg6 -= local156 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					arg8 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local181 * arg2;
						arg8 -= local183 * arg2;
						arg2 = 0;
					}
					local324 = arg0 - anInt2403;
					local11 += local92 * local324;
					local102 += local122 * local324;
					local132 += local152 * local324;
					if (arg0 != arg2 && local208 < local154 || arg0 == arg2 && local181 > local154) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray297[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method1588(Static50.anIntArray332, local4, 0, 0, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, local11, local102, local132, local82, local112, local142);
									arg5 += local181;
									arg3 += local154;
									arg8 += local183;
									arg6 += local156;
									arg0 += Static50.anInt2730;
									local11 += local92;
									local102 += local122;
									local132 += local152;
								}
							}
							method1588(Static50.anIntArray332, local4, 0, 0, arg0, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, local11, local102, local132, local82, local112, local142);
							arg4 += local208;
							arg3 += local154;
							arg7 += local210;
							arg6 += local156;
							arg0 += Static50.anInt2730;
							local11 += local92;
							local102 += local122;
							local132 += local152;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray297[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method1588(Static50.anIntArray332, local4, 0, 0, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, local11, local102, local132, local82, local112, local142);
									arg5 += local181;
									arg3 += local154;
									arg8 += local183;
									arg6 += local156;
									arg0 += Static50.anInt2730;
									local11 += local92;
									local102 += local122;
									local132 += local152;
								}
							}
							method1588(Static50.anIntArray332, local4, 0, 0, arg0, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, local11, local102, local132, local82, local112, local142);
							arg4 += local208;
							arg3 += local154;
							arg7 += local210;
							arg6 += local156;
							arg0 += Static50.anInt2730;
							local11 += local92;
							local102 += local122;
							local132 += local152;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < anInt2397) {
				if (arg2 > anInt2397) {
					arg2 = anInt2397;
				}
				if (arg0 > anInt2397) {
					arg0 = anInt2397;
				}
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					arg6 = arg7 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local154 * arg1;
						arg4 -= local181 * arg1;
						arg6 -= local156 * arg1;
						arg7 -= local183 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					arg8 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local208 * arg2;
						arg8 -= local210 * arg2;
						arg2 = 0;
					}
					local324 = arg1 - anInt2403;
					local11 += local92 * local324;
					local102 += local122 * local324;
					local132 += local152 * local324;
					if (arg1 != arg2 && local154 < local181 || arg1 == arg2 && local154 > local208) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray297[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method1588(Static50.anIntArray332, local4, 0, 0, arg1, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, local11, local102, local132, local82, local112, local142);
									arg3 += local154;
									arg5 += local208;
									arg6 += local156;
									arg8 += local210;
									arg1 += Static50.anInt2730;
									local11 += local92;
									local102 += local122;
									local132 += local152;
								}
							}
							method1588(Static50.anIntArray332, local4, 0, 0, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, local11, local102, local132, local82, local112, local142);
							arg3 += local154;
							arg4 += local181;
							arg6 += local156;
							arg7 += local183;
							arg1 += Static50.anInt2730;
							local11 += local92;
							local102 += local122;
							local132 += local152;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray297[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method1588(Static50.anIntArray332, local4, 0, 0, arg1, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, local11, local102, local132, local82, local112, local142);
									arg3 += local154;
									arg5 += local208;
									arg6 += local156;
									arg8 += local210;
									arg1 += Static50.anInt2730;
									local11 += local92;
									local102 += local122;
									local132 += local152;
								}
							}
							method1588(Static50.anIntArray332, local4, 0, 0, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, local11, local102, local132, local82, local112, local142);
							arg3 += local154;
							arg4 += local181;
							arg6 += local156;
							arg7 += local183;
							arg1 += Static50.anInt2730;
							local11 += local92;
							local102 += local122;
							local132 += local152;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					arg8 = arg7 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local154 * arg1;
						arg4 -= local181 * arg1;
						arg8 -= local156 * arg1;
						arg7 -= local183 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					arg6 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local208 * arg0;
						arg6 -= local210 * arg0;
						arg0 = 0;
					}
					local324 = arg1 - anInt2403;
					local11 += local92 * local324;
					local102 += local122 * local324;
					local132 += local152 * local324;
					if (local154 < local181) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray297[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method1588(Static50.anIntArray332, local4, 0, 0, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, local11, local102, local132, local82, local112, local142);
									arg3 += local208;
									arg4 += local181;
									arg6 += local210;
									arg7 += local183;
									arg1 += Static50.anInt2730;
									local11 += local92;
									local102 += local122;
									local132 += local152;
								}
							}
							method1588(Static50.anIntArray332, local4, 0, 0, arg1, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, local11, local102, local132, local82, local112, local142);
							arg5 += local154;
							arg4 += local181;
							arg8 += local156;
							arg7 += local183;
							arg1 += Static50.anInt2730;
							local11 += local92;
							local102 += local122;
							local132 += local152;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray297[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method1588(Static50.anIntArray332, local4, 0, 0, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, local11, local102, local132, local82, local112, local142);
									arg3 += local208;
									arg4 += local181;
									arg6 += local210;
									arg7 += local183;
									arg1 += Static50.anInt2730;
									local11 += local92;
									local102 += local122;
									local132 += local152;
								}
							}
							method1588(Static50.anIntArray332, local4, 0, 0, arg1, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, local11, local102, local132, local82, local112, local142);
							arg5 += local154;
							arg4 += local181;
							arg8 += local156;
							arg7 += local183;
							arg1 += Static50.anInt2730;
							local11 += local92;
							local102 += local122;
							local132 += local152;
						}
					}
				}
			}
		} else if (arg2 < anInt2397) {
			if (arg0 > anInt2397) {
				arg0 = anInt2397;
			}
			if (arg1 > anInt2397) {
				arg1 = anInt2397;
			}
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				arg7 = arg8 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local181 * arg2;
					arg5 -= local208 * arg2;
					arg7 -= local183 * arg2;
					arg8 -= local210 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				arg6 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local154 * arg0;
					arg6 -= local156 * arg0;
					arg0 = 0;
				}
				local324 = arg2 - anInt2403;
				local11 += local92 * local324;
				local102 += local122 * local324;
				local132 += local152 * local324;
				if (local181 < local208) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray297[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method1588(Static50.anIntArray332, local4, 0, 0, arg2, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, local11, local102, local132, local82, local112, local142);
								arg4 += local181;
								arg3 += local154;
								arg7 += local183;
								arg6 += local156;
								arg2 += Static50.anInt2730;
								local11 += local92;
								local102 += local122;
								local132 += local152;
							}
						}
						method1588(Static50.anIntArray332, local4, 0, 0, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, local11, local102, local132, local82, local112, local142);
						arg4 += local181;
						arg5 += local208;
						arg7 += local183;
						arg8 += local210;
						arg2 += Static50.anInt2730;
						local11 += local92;
						local102 += local122;
						local132 += local152;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray297[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method1588(Static50.anIntArray332, local4, 0, 0, arg2, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, local11, local102, local132, local82, local112, local142);
								arg4 += local181;
								arg3 += local154;
								arg7 += local183;
								arg6 += local156;
								arg2 += Static50.anInt2730;
								local11 += local92;
								local102 += local122;
								local132 += local152;
							}
						}
						method1588(Static50.anIntArray332, local4, 0, 0, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, local11, local102, local132, local82, local112, local142);
						arg4 += local181;
						arg5 += local208;
						arg7 += local183;
						arg8 += local210;
						arg2 += Static50.anInt2730;
						local11 += local92;
						local102 += local122;
						local132 += local152;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				arg6 = arg8 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local181 * arg2;
					arg5 -= local208 * arg2;
					arg6 -= local183 * arg2;
					arg8 -= local210 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				arg7 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local154 * arg1;
					arg7 -= local156 * arg1;
					arg1 = 0;
				}
				local324 = arg2 - anInt2403;
				local11 += local92 * local324;
				local102 += local122 * local324;
				local132 += local152 * local324;
				if (local181 < local208) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray297[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method1588(Static50.anIntArray332, local4, 0, 0, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, local11, local102, local132, local82, local112, local142);
								arg4 += local154;
								arg5 += local208;
								arg7 += local156;
								arg8 += local210;
								arg2 += Static50.anInt2730;
								local11 += local92;
								local102 += local122;
								local132 += local152;
							}
						}
						method1588(Static50.anIntArray332, local4, 0, 0, arg2, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, local11, local102, local132, local82, local112, local142);
						arg3 += local181;
						arg5 += local208;
						arg6 += local183;
						arg8 += local210;
						arg2 += Static50.anInt2730;
						local11 += local92;
						local102 += local122;
						local132 += local152;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray297[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method1588(Static50.anIntArray332, local4, 0, 0, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, local11, local102, local132, local82, local112, local142);
								arg4 += local154;
								arg5 += local208;
								arg7 += local156;
								arg8 += local210;
								arg2 += Static50.anInt2730;
								local11 += local92;
								local102 += local122;
								local132 += local152;
							}
						}
						method1588(Static50.anIntArray332, local4, 0, 0, arg2, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, local11, local102, local132, local82, local112, local142);
						arg3 += local181;
						arg5 += local208;
						arg6 += local183;
						arg8 += local210;
						arg2 += Static50.anInt2730;
						local11 += local92;
						local102 += local122;
						local132 += local152;
					}
				}
			}
		}
	}
}
