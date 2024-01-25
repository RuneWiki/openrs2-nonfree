import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!cw", name = "j", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_41 = new Class381(62, 5);

	@OriginalMember(owner = "client!cw", name = "d", descriptor = "Lclient!at;")
	public static final Class20 aClass20_5 = new Class20();

	@OriginalMember(owner = "client!cw", name = "f", descriptor = "[I")
	public static final int[] anIntArray74 = new int[500];

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "(I)V")
	public static void method1341() {
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub27_2, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub27_1, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub19_1, 2);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub19_2, 2);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub16_1, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub7_1, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub22_1, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub14_1, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub8_1, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub21_1, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub3_1, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub23_1, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub10_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub28_1, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub29_2, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub29_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub12_1, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub20_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub17_1, 0);
		Static534.method7354();
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub26_1, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub1_1, 3);
		Static569.method7681();
		Static8.method134();
		Static27.aBoolean20 = true;
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)[Lclient!pf;")
	public static Class284[] method1342() {
		if (Static256.aClass284Array1 == null) {
			@Pc(11) Class284[] local11 = Static418.method6134(Static681.aClass349_6);
			@Pc(15) Class284[] local15 = new Class284[local11.length];
			@Pc(17) int local17 = 0;
			@Pc(22) int local22 = Static577.aClass5_Sub19_25.aClass17_Sub26_1.method8454();
			@Pc(105) int local105;
			@Pc(111) Class284 local111;
			label69: for (@Pc(24) int local24 = 0; local24 < local11.length; local24++) {
				@Pc(32) Class284 local32 = local11[local24];
				if ((local32.anInt7347 <= 0 || local32.anInt7347 >= 24) && local32.anInt7350 >= 800 && local32.anInt7345 >= 600 && (local22 != 2 || local32.anInt7350 <= 800 && local32.anInt7345 <= 600) && (local22 != 1 || local32.anInt7350 <= 1024 && local32.anInt7345 <= 768)) {
					for (local105 = 0; local105 < local17; local105++) {
						local111 = local15[local105];
						if (local111.anInt7350 == local32.anInt7350 && local111.anInt7345 == local32.anInt7345) {
							if (local111.anInt7347 < local32.anInt7347) {
								local15[local105] = local32;
							}
							continue label69;
						}
					}
					local15[local17] = local32;
					local17++;
				}
			}
			Static256.aClass284Array1 = new Class284[local17];
			Static693.method8316(local15, 0, Static256.aClass284Array1, 0, local17);
			@Pc(197) int[] local197 = new int[Static256.aClass284Array1.length];
			for (local105 = 0; local105 < Static256.aClass284Array1.length; local105++) {
				local111 = Static256.aClass284Array1[local105];
				local197[local105] = local111.anInt7345 * local111.anInt7350;
			}
			Static334.method8475(local197, Static256.aClass284Array1);
		}
		return Static256.aClass284Array1;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(B[B)Lclient!kca;")
	public static Class5_Sub1_Sub10 method1344(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class5_Sub1_Sub10 local9 = new Class5_Sub1_Sub10();
		@Pc(14) Class5_Sub36 local14 = new Class5_Sub36(arg0);
		local14.anInt8456 = local14.aByteArray89.length - 2;
		@Pc(25) int local25 = local14.method7333();
		@Pc(34) int local34 = local14.aByteArray89.length - local25 - 18;
		local14.anInt8456 = local34;
		@Pc(41) int local41 = local14.method7268();
		local9.anInt5145 = local14.method7333();
		local9.anInt5147 = local14.method7333();
		local9.anInt5146 = local14.method7333();
		local9.anInt5142 = local14.method7333();
		local9.anInt5143 = local14.method7333();
		local9.anInt5144 = local14.method7333();
		@Pc(82) int local82 = local14.method7291();
		@Pc(93) int local93;
		@Pc(99) int local99;
		if (local82 > 0) {
			local9.aClass306Array1 = new Class306[local82];
			for (local93 = 0; local93 < local82; local93++) {
				local99 = local14.method7333();
				@Pc(106) Class306 local106 = new Class306(Static146.method2737(local99));
				local9.aClass306Array1[local93] = local106;
				while (local99-- > 0) {
					@Pc(117) int local117 = local14.method7268();
					@Pc(121) int local121 = local14.method7268();
					local106.method6944(new Class5_Sub43(local121), (long) local117, -12002);
				}
			}
		}
		local14.anInt8456 = 0;
		local9.aString57 = local14.method7312();
		local9.anIntArray309 = new int[local41];
		local93 = 0;
		while (local34 > local14.anInt8456) {
			local99 = local14.method7333();
			if (local99 == 3) {
				if (local9.aStringArray26 == null) {
					local9.aStringArray26 = new String[local41];
				}
				local9.aStringArray26[local93] = local14.method7281().intern();
			} else if (local99 == 54) {
				if (local9.aLongArray16 == null) {
					local9.aLongArray16 = new long[local41];
				}
				local9.aLongArray16[local93] = local14.method7304();
			} else {
				if (local9.anIntArray310 == null) {
					local9.anIntArray310 = new int[local41];
				}
				if (local99 >= 150 || local99 == 21 || local99 == 38 || local99 == 39) {
					local9.anIntArray310[local93] = local14.method7291();
				} else {
					local9.anIntArray310[local93] = local14.method7268();
				}
			}
			local9.anIntArray309[local93++] = local99;
		}
		return local9;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILclient!rv;IILclient!ip;)V")
	public static void method1345(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub36_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class4_Sub1_Sub1_Sub2_Sub1 arg3) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(32) int local32;
		@Pc(24) int local24;
		@Pc(26) int local26;
		@Pc(28) int local28;
		if ((arg0 & 0x20) != 0) {
			local16 = arg1.method7280();
			if (local16 > 0) {
				for (local20 = 0; local20 < local16; local20++) {
					local24 = -1;
					local26 = -1;
					local28 = -1;
					local32 = arg1.method7306();
					if (local32 == 32767) {
						local32 = arg1.method7306();
						local26 = arg1.method7306();
						local24 = arg1.method7306();
						local28 = arg1.method7306();
					} else if (local32 == 32766) {
						local32 = -1;
					} else {
						local26 = arg1.method7306();
					}
					@Pc(70) int local70 = arg1.method7306();
					@Pc(74) int local74 = arg1.method7290();
					arg3.method5939(local70, local32, local74, Static565.anInt8921, local24, local28, local26);
				}
			}
		}
		@Pc(90) byte local90 = -1;
		if ((arg0 & 0x40) != 0) {
			local16 = arg1.method7333();
			local20 = arg1.method7274();
			if (local16 == 65535) {
				local16 = -1;
			}
			local32 = arg1.method7291();
			local24 = local32 & 0x7;
			local26 = local32 >> 3 & 0xF;
			if (local26 == 15) {
				local26 = -1;
			}
			arg3.method5923(local24, 0, local20, local26, local16);
		}
		if ((arg0 & 0x1) != 0) {
			Static298.aByteArray56[arg2] = arg1.method7272();
		}
		@Pc(167) int[] local167;
		@Pc(170) int[] local170;
		if ((arg0 & 0x200) != 0) {
			local16 = arg1.method7291();
			local167 = new int[local16];
			local170 = new int[local16];
			@Pc(173) int[] local173 = new int[local16];
			for (local26 = 0; local26 < local16; local26++) {
				local28 = arg1.method7300();
				if (local28 == 65535) {
					local28 = -1;
				}
				local167[local26] = local28;
				local170[local26] = arg1.method7291();
				local173[local26] = arg1.method7333();
			}
			Static163.method3000(local173, local167, local170, arg3);
		}
		if ((arg0 & 0x1000) != 0) {
			arg3.aString79 = arg1.method7281();
			if (arg3.aString79.charAt(0) == '~') {
				arg3.aString79 = arg3.aString79.substring(1);
				Static464.method6554(arg3.method4077(), arg3.aString43, 2, arg3.method4084(), arg3.aString79, 0);
			} else if (arg3 == Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4) {
				Static464.method6554(arg3.method4077(), arg3.aString43, 2, arg3.method4084(), arg3.aString79, 0);
			}
			arg3.anInt6846 = 0;
			arg3.anInt6860 = 0;
			arg3.anInt6873 = 150;
		}
		if ((arg0 & 0x10) != 0) {
			arg3.anInt4558 = arg1.method7282();
			if (arg3.anInt6895 == 0) {
				arg3.method5928(arg3.anInt4558);
				arg3.anInt4558 = -1;
			}
		}
		if ((arg0 & 0x40000) != 0) {
			arg3.aBoolean304 = arg1.method7291() == 1;
		}
		if ((arg0 & 0x8) != 0) {
			local16 = arg1.method7280();
			@Pc(370) byte[] local370 = new byte[local16];
			@Pc(375) Class5_Sub36 local375 = new Class5_Sub36(local370);
			arg1.method7271(local16, local370);
			Static74.aClass5_Sub36Array1[arg2] = local375;
			arg3.method4091(local375);
		}
		if ((arg0 & 0x800) != 0) {
			arg3.aBoolean303 = arg1.method7330() == 1;
		}
		if ((arg0 & 0x100) != 0) {
			local16 = arg1.method7316();
			arg3.anInt6882 = arg1.method7291();
			arg3.anInt6884 = arg1.method7291();
			arg3.anInt6847 = local16 & 0x7FFF;
			arg3.aBoolean457 = (local16 & 0x8000) != 0;
			arg3.anInt6868 = Static565.anInt8921 + arg3.anInt6847 + arg3.anInt6882;
		}
		if ((arg0 & 0x2) != 0) {
			@Pc(460) int[] local460 = new int[4];
			for (local20 = 0; local20 < 4; local20++) {
				local460[local20] = arg1.method7333();
				if (local460[local20] == 65535) {
					local460[local20] = -1;
				}
			}
			local32 = arg1.method7290();
			Static370.method5511(local460, arg3, (byte) 17, local32);
		}
		if ((arg0 & 0x400) != 0) {
			local16 = arg1.method7300();
			if (local16 == 65535) {
				local16 = -1;
			}
			local20 = arg1.method7274();
			local32 = arg1.method7330();
			local24 = local32 & 0x7;
			local26 = local32 >> 3 & 0xF;
			if (local26 == 15) {
				local26 = -1;
			}
			arg3.method5923(local24, 1, local20, local26, local16);
		}
		if ((arg0 & 0x4000) != 0) {
			local90 = arg1.method7318();
		}
		if ((arg0 & 0x80) != 0) {
			local16 = arg1.method7316();
			if (local16 == 65535) {
				local16 = -1;
			}
			arg3.anInt6863 = local16;
		}
		if ((arg0 & 0x10000) != 0) {
			arg3.aByte100 = arg1.method7302();
			arg3.aByte103 = arg1.method7272();
			arg3.aByte104 = arg1.method7302();
			arg3.aByte102 = (byte) arg1.method7291();
			arg3.anInt6856 = Static565.anInt8921 + arg1.method7300();
			arg3.anInt6832 = Static565.anInt8921 + arg1.method7300();
		}
		if ((arg0 & 0x20000) != 0) {
			local16 = arg1.method7316();
			local20 = arg1.method7292();
			if (local16 == 65535) {
				local16 = -1;
			}
			local32 = arg1.method7290();
			local24 = local32 & 0x7;
			local26 = local32 >> 3 & 0xF;
			if (local26 == 15) {
				local26 = -1;
			}
			arg3.method5923(local24, 2, local20, local26, local16);
		}
		if ((arg0 & 0x80000) != 0) {
			local16 = arg1.method7291();
			local167 = new int[local16];
			local170 = new int[local16];
			for (local24 = 0; local24 < local16; local24++) {
				local26 = arg1.method7333();
				if ((local26 & 0xC000) == 49152) {
					local28 = arg1.method7282();
					local167[local24] = local26 << 16 | local28;
				} else {
					local167[local24] = local26;
				}
				local170[local24] = arg1.method7316();
			}
			arg3.method5925(local167, local170);
		}
		if ((arg0 & 0x2000) != 0) {
			arg3.anInt6887 = arg1.method7302();
			arg3.anInt6828 = arg1.method7318();
			arg3.anInt6861 = arg1.method7272();
			arg3.anInt6848 = arg1.method7272();
			arg3.anInt6893 = arg1.method7300() + Static565.anInt8921;
			arg3.anInt6835 = arg1.method7282() + Static565.anInt8921;
			arg3.anInt6875 = arg1.method7330();
			if (arg3.aBoolean302) {
				arg3.anInt6861 += arg3.anInt4537;
				arg3.anInt6828 += arg3.anInt4549;
				arg3.anInt6895 = 0;
				arg3.anInt6887 += arg3.anInt4537;
				arg3.anInt6848 += arg3.anInt4549;
			} else {
				arg3.anInt6895 = 1;
				arg3.anInt6828 += arg3.anIntArray404[0];
				arg3.anInt6861 += arg3.anIntArray405[0];
				arg3.anInt6848 += arg3.anIntArray404[0];
				arg3.anInt6887 += arg3.anIntArray405[0];
			}
			arg3.anInt6897 = 0;
		}
		if (!arg3.aBoolean302) {
			return;
		}
		if (local90 == 127) {
			arg3.method4085(arg3.anInt4537, arg3.anInt4549);
			return;
		}
		@Pc(892) byte local892;
		if (local90 == -1) {
			local892 = Static298.aByteArray56[arg2];
		} else {
			local892 = local90;
		}
		Static536.method7362(local892, arg3);
		arg3.method4086(local892, arg3.anInt4537, arg3.anInt4549, (byte) -99);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(III)I")
	public static int method1346(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
