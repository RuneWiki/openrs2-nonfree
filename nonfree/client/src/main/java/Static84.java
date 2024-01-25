import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!cn", name = "k", descriptor = "Lclient!ot;")
	public static final Class270 aClass270_23 = new Class270(2);

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II[BIIII)V")
	public static void method8591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 > 0 && !Static9.method94(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static9.method94(arg4)) {
			@Pc(36) int local36 = Static517.method7338(arg0);
			@Pc(38) int local38 = 0;
			@Pc(49) int local49 = arg4 > arg1 ? arg1 : arg4;
			@Pc(53) int local53 = arg1 >> 1;
			@Pc(57) int local57 = arg4 >> 1;
			@Pc(59) byte[] local59 = arg2;
			@Pc(70) byte[] local70 = new byte[local53 * local57 * local36];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local38, arg5, arg1, arg4, 0, arg0, 5121, local59, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(89) int local89 = arg1 * local36;
				@Pc(91) byte[] local91 = local70;
				for (@Pc(93) int local93 = 0; local93 < local36; local93++) {
					@Pc(97) int local97 = local93;
					@Pc(99) int local99 = local93;
					@Pc(103) int local103 = local89 + local93;
					for (@Pc(105) int local105 = 0; local105 < local57; local105++) {
						for (@Pc(109) int local109 = 0; local109 < local53; local109++) {
							@Pc(115) byte local115 = local59[local99];
							local99 += local36;
							@Pc(125) int local125 = local115 + local59[local99];
							local99 += local36;
							@Pc(135) int local135 = local125 + local59[local103];
							local103 += local36;
							@Pc(145) int local145 = local135 + local59[local103];
							local103 += local36;
							local70[local97] = (byte) (local145 >> 2);
							local97 += local36;
						}
						local103 += local89;
						local99 += local89;
					}
				}
				local70 = local59;
				arg1 = local53;
				arg4 = local57;
				local59 = local91;
				local53 >>= 0x1;
				local57 >>= 0x1;
				local38++;
				local49 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)I")
	public static int method8597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return local7 * arg1;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!jo;IIIIIIIIII)Z")
	public static boolean method8604(@OriginalArg(0) Class198 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg5;
		@Pc(9) int local9 = arg1;
		@Pc(18) int local18 = arg5 - 64;
		@Pc(23) int local23 = arg1 - 64;
		Static638.anIntArrayArray106[64][64] = 99;
		Static376.anIntArrayArray70[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static476.anIntArray503[0] = arg5;
		@Pc(46) int local46 = local37 + 1;
		Static331.anIntArray638[0] = arg1;
		@Pc(51) int[][] local51 = arg0.anIntArrayArray57;
		while (local46 != local39) {
			local9 = Static331.anIntArray638[local39];
			local7 = Static476.anIntArray503[local39];
			@Pc(65) int local65 = local7 - local18;
			@Pc(70) int local70 = local9 - local23;
			local39 = local39 + 1 & 0xFFF;
			@Pc(82) int local82 = local7 - arg0.anInt5352;
			@Pc(87) int local87 = local9 - arg0.anInt5350;
			if (arg3 == -4) {
				if (local7 == arg9 && arg7 == local9) {
					Static77.anInt1744 = local7;
					Static502.anInt8448 = local9;
					return true;
				}
			} else if (arg3 == -3) {
				if (Static263.method4139(arg2, arg9, arg7, local7, 2, local9, arg4, 2)) {
					Static77.anInt1744 = local7;
					Static502.anInt8448 = local9;
					return true;
				}
			} else if (arg3 == -2) {
				if (arg0.method4543(arg9, local9, 2, local7, arg8, arg4, arg7, 2, arg2)) {
					Static502.anInt8448 = local9;
					Static77.anInt1744 = local7;
					return true;
				}
			} else if (arg3 == -1) {
				if (arg0.method4538(local9, arg2, arg7, arg4, arg8, arg9, 2, local7)) {
					Static502.anInt8448 = local9;
					Static77.anInt1744 = local7;
					return true;
				}
			} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
				if (arg0.method4534(arg3, 2, local9, arg7, arg9, arg6, local7)) {
					Static502.anInt8448 = local9;
					Static77.anInt1744 = local7;
					return true;
				}
			} else if (arg0.method4541(local7, arg3, 2, arg9, arg6, local9, arg7)) {
				Static502.anInt8448 = local9;
				Static77.anInt1744 = local7;
				return true;
			}
			@Pc(242) int local242 = Static376.anIntArrayArray70[local65][local70] + 1;
			if (local65 > 0 && Static638.anIntArrayArray106[local65 - 1][local70] == 0 && (local51[local82 - 1][local87] & 0x43A40000) == 0 && (local51[local82 - 1][local87 + 1] & 0x4E240000) == 0) {
				Static476.anIntArray503[local46] = local7 - 1;
				Static331.anIntArray638[local46] = local9;
				Static638.anIntArrayArray106[local65 - 1][local70] = 2;
				local46 = local46 + 1 & 0xFFF;
				Static376.anIntArrayArray70[local65 - 1][local70] = local242;
			}
			if (local65 < 126 && Static638.anIntArrayArray106[local65 + 1][local70] == 0 && (local51[local82 + 2][local87] & 0x60E40000) == 0 && (local51[local82 + 2][local87 + 1] & 0x78240000) == 0) {
				Static476.anIntArray503[local46] = local7 + 1;
				Static331.anIntArray638[local46] = local9;
				local46 = local46 + 1 & 0xFFF;
				Static638.anIntArrayArray106[local65 + 1][local70] = 8;
				Static376.anIntArrayArray70[local65 + 1][local70] = local242;
			}
			if (local70 > 0 && Static638.anIntArrayArray106[local65][local70 - 1] == 0 && (local51[local82][local87 - 1] & 0x43A40000) == 0 && (local51[local82 + 1][local87 - 1] & 0x60E40000) == 0) {
				Static476.anIntArray503[local46] = local7;
				Static331.anIntArray638[local46] = local9 - 1;
				Static638.anIntArrayArray106[local65][local70 - 1] = 1;
				local46 = local46 + 1 & 0xFFF;
				Static376.anIntArrayArray70[local65][local70 - 1] = local242;
			}
			if (local70 < 126 && Static638.anIntArrayArray106[local65][local70 + 1] == 0 && (local51[local82][local87 + 2] & 0x4E240000) == 0 && (local51[local82 + 1][local87 + 2] & 0x78240000) == 0) {
				Static476.anIntArray503[local46] = local7;
				Static331.anIntArray638[local46] = local9 + 1;
				Static638.anIntArrayArray106[local65][local70 + 1] = 4;
				local46 = local46 + 1 & 0xFFF;
				Static376.anIntArrayArray70[local65][local70 + 1] = local242;
			}
			if (local65 > 0 && local70 > 0 && Static638.anIntArrayArray106[local65 - 1][local70 - 1] == 0 && (local51[local82 - 1][local87] & 0x4FA40000) == 0 && (local51[local82 - 1][local87 - 1] & 0x43A40000) == 0 && (local51[local82][local87 - 1] & 0x63E40000) == 0) {
				Static476.anIntArray503[local46] = local7 - 1;
				Static331.anIntArray638[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static638.anIntArrayArray106[local65 - 1][local70 - 1] = 3;
				Static376.anIntArrayArray70[local65 - 1][local70 - 1] = local242;
			}
			if (local65 < 126 && local70 > 0 && Static638.anIntArrayArray106[local65 + 1][local70 - 1] == 0 && (local51[local82 + 1][local87 - 1] & 0x63E40000) == 0 && (local51[local82 + 2][local87 - 1] & 0x60E40000) == 0 && (local51[local82 + 2][local87] & 0x78E40000) == 0) {
				Static476.anIntArray503[local46] = local7 + 1;
				Static331.anIntArray638[local46] = local9 - 1;
				Static638.anIntArrayArray106[local65 + 1][local70 - 1] = 9;
				local46 = local46 + 1 & 0xFFF;
				Static376.anIntArrayArray70[local65 + 1][local70 - 1] = local242;
			}
			if (local65 > 0 && local70 < 126 && Static638.anIntArrayArray106[local65 - 1][local70 + 1] == 0 && (local51[local82 - 1][local87 + 1] & 0x4FA40000) == 0 && (local51[local82 - 1][local87 + 2] & 0x4E240000) == 0 && (local51[local82][local87 + 2] & 0x7E240000) == 0) {
				Static476.anIntArray503[local46] = local7 - 1;
				Static331.anIntArray638[local46] = local9 + 1;
				Static638.anIntArrayArray106[local65 - 1][local70 + 1] = 6;
				local46 = local46 + 1 & 0xFFF;
				Static376.anIntArrayArray70[local65 - 1][local70 + 1] = local242;
			}
			if (local65 < 126 && local70 < 126 && Static638.anIntArrayArray106[local65 + 1][local70 + 1] == 0 && (local51[local82 + 1][local87 + 2] & 0x7E240000) == 0 && (local51[local82 + 2][local87 + 2] & 0x78240000) == 0 && (local51[local82 + 2][local87 + 1] & 0x78E40000) == 0) {
				Static476.anIntArray503[local46] = local7 + 1;
				Static331.anIntArray638[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static638.anIntArrayArray106[local65 + 1][local70 + 1] = 12;
				Static376.anIntArrayArray70[local65 + 1][local70 + 1] = local242;
			}
		}
		Static77.anInt1744 = local7;
		Static502.anInt8448 = local9;
		return false;
	}
}
