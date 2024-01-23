import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!gk", name = "v", descriptor = "Lclient!nj;")
	public static Class113 aClass113_2;

	@OriginalMember(owner = "client!gk", name = "w", descriptor = "F")
	public static float aFloat11;

	@OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
	public static int anInt2022;

	@OriginalMember(owner = "client!gk", name = "B", descriptor = "I")
	public static int anInt2026 = 0;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "([BB)[B")
	public static byte[] method1584(@OriginalArg(0) byte[] arg0) {
		@Pc(14) int local14 = arg0.length;
		@Pc(17) byte[] local17 = new byte[local14];
		Static304.method2609(arg0, 0, local17, 0, local14);
		return local17;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "()V")
	public static void method1585() {
		Static95.anInt2222 = 0;
		label194: for (@Pc(3) int local3 = 0; local3 < Static154.anInt3331; local3++) {
			@Pc(10) Class165 local10 = Static126.aClass165Array3[local3];
			@Pc(14) int local14;
			if (Static200.anIntArray363 != null) {
				for (local14 = 0; local14 < Static200.anIntArray363.length; local14++) {
					if (Static200.anIntArray363[local14] != -1000000 && (local10.anInt5229 <= Static200.anIntArray363[local14] || local10.anInt5232 <= Static200.anIntArray363[local14]) && (local10.anInt5239 <= Static274.anIntArray508[local14] || local10.anInt5246 <= Static274.anIntArray508[local14]) && (local10.anInt5239 >= Static9.anIntArray22[local14] || local10.anInt5246 >= Static9.anIntArray22[local14]) && (local10.anInt5242 <= Static204.anIntArray370[local14] || local10.anInt5234 <= Static204.anIntArray370[local14]) && (local10.anInt5242 >= Static162.anIntArray308[local14] || local10.anInt5234 >= Static162.anIntArray308[local14])) {
						continue label194;
					}
				}
			}
			@Pc(115) int local115;
			@Pc(126) int local126;
			@Pc(158) int local158;
			@Pc(137) boolean local137;
			if (local10.anInt5228 == 1) {
				local14 = local10.anInt5243 + Static171.anInt3641 - Static186.anInt3849;
				if (local14 >= 0 && local14 <= Static171.anInt3641 + Static171.anInt3641) {
					local115 = local10.anInt5248 + Static171.anInt3641 - Static204.anInt4137;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt5233 + Static171.anInt3641 - Static204.anInt4137;
					if (local126 > Static171.anInt3641 + Static171.anInt3641) {
						local126 = Static171.anInt3641 + Static171.anInt3641;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static260.aBooleanArrayArray8[local14][local115++]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static215.anInt4270 - local10.anInt5239;
						if (local158 > 32) {
							local10.anInt5231 = 1;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt5231 = 2;
							local158 = -local158;
						}
						local10.anInt5245 = (local10.anInt5242 - Static273.anInt5322 << 8) / local158;
						local10.anInt5241 = (local10.anInt5234 - Static273.anInt5322 << 8) / local158;
						local10.anInt5240 = (local10.anInt5229 - Static197.anInt4046 << 8) / local158;
						local10.anInt5236 = (local10.anInt5232 - Static197.anInt4046 << 8) / local158;
						Static67.aClass165Array1[Static95.anInt2222++] = local10;
					}
				}
			} else if (local10.anInt5228 == 2) {
				local14 = local10.anInt5248 + Static171.anInt3641 - Static204.anInt4137;
				if (local14 >= 0 && local14 <= Static171.anInt3641 + Static171.anInt3641) {
					local115 = local10.anInt5243 + Static171.anInt3641 - Static186.anInt3849;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt5230 + Static171.anInt3641 - Static186.anInt3849;
					if (local126 > Static171.anInt3641 + Static171.anInt3641) {
						local126 = Static171.anInt3641 + Static171.anInt3641;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static260.aBooleanArrayArray8[local115++][local14]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static273.anInt5322 - local10.anInt5242;
						if (local158 > 32) {
							local10.anInt5231 = 3;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt5231 = 4;
							local158 = -local158;
						}
						local10.anInt5244 = (local10.anInt5239 - Static215.anInt4270 << 8) / local158;
						local10.anInt5238 = (local10.anInt5246 - Static215.anInt4270 << 8) / local158;
						local10.anInt5240 = (local10.anInt5229 - Static197.anInt4046 << 8) / local158;
						local10.anInt5236 = (local10.anInt5232 - Static197.anInt4046 << 8) / local158;
						Static67.aClass165Array1[Static95.anInt2222++] = local10;
					}
				}
			} else if (local10.anInt5228 == 4) {
				local14 = local10.anInt5229 - Static197.anInt4046;
				if (local14 > 128) {
					local115 = local10.anInt5248 + Static171.anInt3641 - Static204.anInt4137;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt5233 + Static171.anInt3641 - Static204.anInt4137;
					if (local126 > Static171.anInt3641 + Static171.anInt3641) {
						local126 = Static171.anInt3641 + Static171.anInt3641;
					}
					if (local115 <= local126) {
						@Pc(408) int local408 = local10.anInt5243 + Static171.anInt3641 - Static186.anInt3849;
						if (local408 < 0) {
							local408 = 0;
						}
						local158 = local10.anInt5230 + Static171.anInt3641 - Static186.anInt3849;
						if (local158 > Static171.anInt3641 + Static171.anInt3641) {
							local158 = Static171.anInt3641 + Static171.anInt3641;
						}
						@Pc(430) boolean local430 = false;
						label166: for (@Pc(432) int local432 = local408; local432 <= local158; local432++) {
							for (@Pc(437) int local437 = local115; local437 <= local126; local437++) {
								if (Static260.aBooleanArrayArray8[local432][local437]) {
									local430 = true;
									break label166;
								}
							}
						}
						if (local430) {
							local10.anInt5231 = 5;
							local10.anInt5244 = (local10.anInt5239 - Static215.anInt4270 << 8) / local14;
							local10.anInt5238 = (local10.anInt5246 - Static215.anInt4270 << 8) / local14;
							local10.anInt5245 = (local10.anInt5242 - Static273.anInt5322 << 8) / local14;
							local10.anInt5241 = (local10.anInt5234 - Static273.anInt5322 << 8) / local14;
							Static67.aClass165Array1[Static95.anInt2222++] = local10;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZ[[I[[FB[[IIIILclient!tk;III[[FIFI[[F)I")
	public static int method1586(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) float[][] arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class1_Sub32 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) float[][] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) float arg14, @OriginalArg(16) int arg15, @OriginalArg(17) float[][] arg16) {
		@Pc(32) int local32;
		if (arg5 == 1) {
			local32 = arg7;
			arg7 = arg10;
			arg10 = 128 - local32;
		} else if (arg5 == 2) {
			arg7 = 128 - arg7;
			arg10 = 128 - arg10;
		} else if (arg5 == 3) {
			local32 = arg7;
			arg7 = 128 - arg10;
			arg10 = local32;
		}
		@Pc(110) float local110;
		@Pc(98) float local98;
		@Pc(282) int local282;
		@Pc(104) float local104;
		if (arg7 == 0 && arg10 == 0) {
			local98 = arg12[arg6][arg0];
			local282 = arg13;
			local110 = arg3[arg6][arg0];
			local104 = arg16[arg6][arg0];
		} else if (arg7 == 128 && arg10 == 0) {
			local110 = arg3[arg6 + 1][arg0];
			local98 = arg12[arg6 + 1][arg0];
			local104 = arg16[arg6 + 1][arg0];
			local282 = arg15;
		} else if (arg7 == 128 && arg10 == 128) {
			local110 = arg3[arg6 + 1][arg0 + 1];
			local98 = arg12[arg6 + 1][arg0 + 1];
			local282 = arg11;
			local104 = arg16[arg6 + 1][arg0 + 1];
		} else if (arg7 == 0 && arg10 == 128) {
			local98 = arg12[arg6][arg0 + 1];
			local110 = arg3[arg6][arg0 + 1];
			local104 = arg16[arg6][arg0 + 1];
			local282 = arg9;
		} else {
			local98 = arg12[arg6][arg0];
			local104 = arg16[arg6][arg0];
			local110 = arg3[arg6][arg0];
			@Pc(118) float local118 = arg16[arg6][arg0 + 1];
			@Pc(123) float local123 = (float) arg10 / 128.0F;
			@Pc(128) float local128 = (float) arg7 / 128.0F;
			@Pc(143) float local143 = local104 + (arg16[arg6 + 1][arg0] - local104) * local128;
			@Pc(160) float local160 = local118 + (arg16[arg6 + 1][arg0 + 1] - local118) * local128;
			@Pc(168) float local168 = arg12[arg6][arg0 + 1];
			local104 = local143 + local123 * (local160 - local143);
			@Pc(185) float local185 = arg3[arg6][arg0 + 1];
			@Pc(201) float local201 = local168 + (arg12[arg6 + 1][arg0 + 1] - local168) * local128;
			@Pc(216) float local216 = local98 + (arg12[arg6 + 1][arg0] - local98) * local128;
			local98 = local216 + local123 * (local201 - local216);
			@Pc(241) float local241 = local185 + (arg3[arg6 + 1][arg0 + 1] - local185) * local128;
			@Pc(256) float local256 = local110 + (arg3[arg6 + 1][arg0] - local110) * local128;
			local110 = local256 + (local241 - local256) * local123;
			@Pc(270) int local270 = Static148.method2593(arg7, arg13, arg15);
			@Pc(276) int local276 = Static148.method2593(arg7, arg9, arg11);
			local282 = Static148.method2593(arg10, local270, local276);
		}
		@Pc(400) int local400 = arg10 + (arg0 << 7);
		@Pc(406) int local406 = arg7 + (arg6 << 7);
		@Pc(414) int local414 = Static30.method2649(arg6, arg7, arg10, arg2, arg0);
		return arg8.method3951(local406, local414, local400, local104, local110, local98, arg1 ? local282 & 0xFFFFFF00 : local282, arg4 == null ? 0.0F : (float) (local414 - Static30.method2649(arg6, arg7, arg10, arg4, arg0)) / arg14);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V")
	public static void method1588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static108.method1987(arg1)) {
			Static199.method3241(Static77.aClass71ArrayArray1[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(III)Lclient!co;")
	public static Class25 method1590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub26 local7 = Static74.aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt4090; local13++) {
			@Pc(22) Class25 local22 = local7.aClass25Array4[local13];
			if ((local22.aLong39 >> 29 & 0x3L) == 2L && local22.anInt1003 == arg1 && local22.anInt1000 == arg2) {
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZI)Lclient!om;")
	public static Class125 method1591(@OriginalArg(1) int arg0) {
		@Pc(16) Class125 local16 = (Class125) Static180.aClass135_17.method3316((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(30) byte[] local30 = Static258.aClass91_186.method2495(Static156.method1243(arg0), Static113.method2073(arg0));
		local16 = new Class125();
		local16.anInt3945 = arg0;
		if (local30 != null) {
			local16.method3173(new Class1_Sub11(local30));
		}
		local16.method3164();
		Static180.aClass135_17.method3321((long) arg0, local16);
		return local16;
	}
}
