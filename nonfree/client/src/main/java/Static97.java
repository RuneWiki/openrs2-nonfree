import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
	public static int anInt1998;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
	public static int anInt1999;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
	public static int anInt2001;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
	public static int anInt2004;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "Lclient!pk;")
	public static Class132 aClass132_38;

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
	public static int anInt2006;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
	public static int anInt2003 = 0;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString76 = "scroll:";

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray10 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[[B[[I[[[B[[[I[[II[[B[[F[[I[[I[[I[[B[[F[[F[[B)[Lclient!td;")
	public static Class8_Sub29[] method1543(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int[][][] arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) float[][] arg7, @OriginalArg(9) int[][] arg8, @OriginalArg(10) int[][] arg9, @OriginalArg(11) int[][] arg10, @OriginalArg(12) byte[][] arg11, @OriginalArg(13) float[][] arg12, @OriginalArg(14) float[][] arg13, @OriginalArg(15) byte[][] arg14) {
		@Pc(9) int[][] local9 = new int[105][105];
		@Pc(18) int local18;
		@Pc(25) int local25;
		@Pc(73) byte local73;
		for (@Pc(11) int local11 = 1; local11 <= 103; local11++) {
			for (local18 = 1; local18 <= 103; local18++) {
				local25 = 0;
				if (arg4 != null) {
					@Pc(40) int local40 = arg4[arg0][local11 >> 3][local18 >> 3];
					local25 = local40 >> 1 & 0x3;
				}
				if (local25 == 0) {
					local73 = arg1[local11][local18];
					if (local73 == 0) {
						local73 = arg1[local11 - 1][local18];
					}
					if (local73 == 0) {
						local73 = arg1[local11][local18 - 1];
					}
					if (local73 == 0) {
						local73 = arg1[local11 - 1][local18 - 1];
					}
				} else if (local25 == 1) {
					local73 = arg1[local11][local18 - 1];
					if (local73 == 0) {
						local73 = arg1[local11][local18];
					}
					if (local73 == 0) {
						local73 = arg1[local11 - 1][local18 - 1];
					}
					if (local73 == 0) {
						local73 = arg1[local11 - 1][local18];
					}
				} else if (local25 == 2) {
					local73 = arg1[local11 - 1][local18 - 1];
					if (local73 == 0) {
						local73 = arg1[local11][local18 - 1];
					}
					if (local73 == 0) {
						local73 = arg1[local11 - 1][local18];
					}
					if (local73 == 0) {
						local73 = arg1[local11][local18];
					}
				} else {
					local73 = arg1[local11 - 1][local18];
					if (local73 == 0) {
						local73 = arg1[local11 - 1][local18 - 1];
					}
					if (local73 == 0) {
						local73 = arg1[local11][local18];
					}
					if (local73 == 0) {
						local73 = arg1[local11][local18 - 1];
					}
				}
				if (local73 != 0) {
					@Pc(267) Class97 local267 = Static200.method3092((local73 & 0xFF) - 1);
					local9[local11][local18] = local267.anInt2795 + (local267.anInt2807 + 1 << 16);
				}
			}
		}
		@Pc(292) Class129 local292 = new Class129(128);
		@Pc(388) int local388;
		@Pc(364) int local364;
		@Pc(345) int local345;
		for (local18 = 1; local18 <= 102; local18++) {
			for (local25 = 1; local25 <= 102; local25++) {
				if (arg1[local18][local25] != 0) {
					@Pc(333) int[] local333;
					if (arg11[local18][local25] == 0) {
						local333 = Static136.anIntArrayArray13[0];
					} else {
						local333 = anIntArrayArray10[arg6[local18][local25]];
						if (local333.length == 0) {
							continue;
						}
					}
					local345 = 0;
					if (arg10 != null) {
						local345 = arg10[local18][local25] & 0xFFFFFF;
					}
					local364 = local9[local18 + 1][local25];
					@Pc(372) int local372 = local9[local18][local25 + 1];
					@Pc(382) int local382 = local9[local18 + 1][local25 + 1];
					local388 = local9[local18][local25];
					@Pc(396) long local396 = (long) local388 << 32 | (long) local345;
					@Pc(401) int local401 = local333.length / 2;
					@Pc(409) long local409 = (long) local345 | (long) local372 << 32;
					@Pc(417) long local417 = (long) local345 | (long) local364 << 32;
					@Pc(425) long local425 = (long) local345 | (long) local382 << 32;
					@Pc(431) Class8_Sub29 local431 = (Class8_Sub29) local292.method3043(local396);
					if (local431 == null) {
						local431 = new Class8_Sub29((local388 >> 16) - 1, (float) (local388 & 0xFFFF), false, arg8 != null, local345);
						local292.method3039(local431, local396);
					}
					local431.anInt4980 += local401;
					local431.anInt4986++;
					if (local396 != local417) {
						local431 = (Class8_Sub29) local292.method3043(local417);
						if (local431 == null) {
							local431 = new Class8_Sub29((local364 >> 16) - 1, (float) (local364 & 0xFFFF), false, arg8 != null, local345);
							local292.method3039(local431, local417);
						}
						local431.anInt4986++;
						local431.anInt4980 += local401;
					}
					if (local425 != local396 && local417 != local425) {
						local431 = (Class8_Sub29) local292.method3043(local425);
						if (local431 == null) {
							local431 = new Class8_Sub29((local382 >> 16) - 1, (float) (local382 & 0xFFFF), false, arg8 != null, local345);
							local292.method3039(local431, local425);
						}
						local431.anInt4986++;
						local431.anInt4980 += local401;
					}
					if (local396 != local409 && local409 != local417 && local425 != local409) {
						local431 = (Class8_Sub29) local292.method3043(local409);
						if (local431 == null) {
							local431 = new Class8_Sub29((local372 >> 16) - 1, (float) (local372 & 0xFFFF), false, arg8 != null, local345);
							local292.method3039(local431, local409);
						}
						local431.anInt4980 += local401;
						local431.anInt4986++;
					}
				}
			}
		}
		@Pc(664) Class8_Sub29 local664;
		for (local664 = (Class8_Sub29) local292.method3035(); local664 != null; local664 = (Class8_Sub29) local292.method3048()) {
			local664.method3783();
		}
		for (local18 = 1; local18 <= 102; local18++) {
			for (local25 = 1; local25 <= 102; local25++) {
				local73 = arg1[local18][local25];
				if (local73 != 0) {
					if ((arg3[arg0][local18][local25] & 0x8) != 0) {
						local345 = 0;
					} else if ((arg3[1][local18][local25] & 0x2) == 2 && arg0 > 0) {
						local345 = arg0 - 1;
					} else {
						local345 = arg0;
					}
					local364 = 128;
					local388 = 0;
					if (arg10 != null) {
						local364 = arg10[local18][local25] >>> 24 << 3;
						local388 = arg10[local18][local25] & 0xFFFFFF;
					}
					@Pc(768) boolean[] local768 = null;
					@Pc(849) int local849;
					@Pc(870) int local870;
					@Pc(782) int[] local782;
					@Pc(788) byte local788;
					@Pc(891) int local891;
					@Pc(830) int local830;
					if (arg11[local18][local25] == 0) {
						local782 = Static136.anIntArrayArray13[0];
						local830 = arg1[local18 - 1][local25 + 1] == local73 ? 1 : -1;
						local849 = arg1[local18 - 1][local25 - 1] == local73 ? 1 : -1;
						local870 = arg1[local18 + 1][local25 + 1] == local73 ? 1 : -1;
						local891 = arg1[local18 + 1][local25 - 1] == local73 ? 1 : -1;
						if (local73 == arg1[local18][local25 - 1]) {
							local891++;
							local849++;
						} else {
							local849--;
							local891--;
						}
						if (arg1[local18 + 1][local25] == local73) {
							local891++;
							local870++;
						} else {
							local891--;
							local870--;
						}
						if (local73 == arg1[local18][local25 + 1]) {
							local830++;
							local870++;
						} else {
							local830--;
							local870--;
						}
						if (local73 == arg1[local18 - 1][local25]) {
							local830++;
							local849++;
						} else {
							local849--;
							local830--;
						}
						@Pc(960) int local960 = local849 - local870;
						if (local960 < 0) {
							local960 = -local960;
						}
						@Pc(971) int local971 = local891 - local830;
						if (local971 < 0) {
							local971 = -local971;
						}
						local788 = (byte) (local971 <= local960 ? 0 : 1);
						arg14[local18][local25] = local788;
					} else {
						local782 = anIntArrayArray10[arg6[local18][local25]];
						local788 = arg14[local18][local25];
						local768 = Static47.aBooleanArrayArray3[arg6[local18][local25]];
						if (local782.length == 0) {
							continue;
						}
					}
					local891 = local9[local18 + 1][local25];
					local830 = local9[local18][local25 + 1];
					local849 = local9[local18][local25];
					local870 = local9[local18 + 1][local25 + 1];
					@Pc(1035) long local1035 = (long) local849 << 32 | (long) local388;
					@Pc(1043) long local1043 = (long) local891 << 32 | (long) local388;
					@Pc(1051) long local1051 = (long) local388 | (long) local830 << 32;
					@Pc(1059) int local1059 = arg5[local18 + 1][local25];
					@Pc(1069) int local1069 = arg5[local18 + 1][local25 + 1];
					@Pc(1075) int local1075 = arg5[local18][local25];
					@Pc(1083) long local1083 = (long) local870 << 32 | (long) local388;
					@Pc(1091) int local1091 = arg5[local18][local25 + 1];
					@Pc(1097) int local1097 = arg2[local18][local25];
					@Pc(1105) int local1105 = arg2[local18 + 1][local25];
					@Pc(1113) int local1113 = arg2[local18][local25 + 1];
					@Pc(1123) int local1123 = arg2[local18 + 1][local25 + 1];
					@Pc(1129) int local1129 = (local849 >> 16) - 1;
					@Pc(1135) int local1135 = (local891 >> 16) - 1;
					@Pc(1141) Class8_Sub29 local1141 = (Class8_Sub29) local292.method3043(local1035);
					@Pc(1147) int local1147 = (local870 >> 16) - 1;
					@Pc(1153) int local1153 = (local830 >> 16) - 1;
					Static60.method940(local768, arg12, arg7, local782, arg8, local364, local25, local788, Static4.method37(local1129, local1105, local1059), local870 >= local849, local830 >= local849, Static4.method37(local1129, local1097, local1075), Static4.method37(local1129, local1123, local1069), arg9, local891 >= local849, local18, local849 >= local849, Static4.method37(local1129, local1113, local1091), arg13, local1141, local345);
					if (local1043 != local1035) {
						local1141 = (Class8_Sub29) local292.method3043(local1043);
						Static60.method940(local768, arg12, arg7, local782, arg8, local364, local25, local788, Static4.method37(local1135, local1105, local1059), local891 <= local870, local891 <= local830, Static4.method37(local1135, local1097, local1075), Static4.method37(local1135, local1123, local1069), arg9, local891 >= local891, local18, local849 >= local891, Static4.method37(local1135, local1113, local1091), arg13, local1141, local345);
					}
					if (local1083 != local1035 && local1043 != local1083) {
						local1141 = (Class8_Sub29) local292.method3043(local1083);
						Static60.method940(local768, arg12, arg7, local782, arg8, local364, local25, local788, Static4.method37(local1147, local1105, local1059), local870 >= local870, local870 <= local830, Static4.method37(local1147, local1097, local1075), Static4.method37(local1147, local1123, local1069), arg9, local891 >= local870, local18, local870 <= local849, Static4.method37(local1147, local1113, local1091), arg13, local1141, local345);
					}
					if (local1051 != local1035 && local1043 != local1051 && local1051 != local1083) {
						local1141 = (Class8_Sub29) local292.method3043(local1051);
						Static60.method940(local768, arg12, arg7, local782, arg8, local364, local25, local788, Static4.method37(local1153, local1105, local1059), local870 >= local830, local830 <= local830, Static4.method37(local1153, local1097, local1075), Static4.method37(local1153, local1123, local1069), arg9, local891 >= local830, local18, local849 >= local830, Static4.method37(local1153, local1113, local1091), arg13, local1141, local345);
					}
				}
			}
		}
		for (local664 = (Class8_Sub29) local292.method3035(); local664 != null; local664 = (Class8_Sub29) local292.method3048()) {
			if (local664.anInt4985 == 0) {
				local664.method4273();
			} else {
				local664.method3786();
			}
		}
		local18 = local292.method3040();
		@Pc(1516) Class8_Sub29[] local1516 = new Class8_Sub29[local18];
		@Pc(1519) long[] local1519 = new long[local18];
		local292.method3045(local1516);
		for (local345 = 0; local345 < local18; local345++) {
			local1519[local345] = local1516[local345].aLong203;
		}
		Static289.method4261(local1516, local1519);
		return local1516;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLclient!kn;)V")
	public static void method1544(@OriginalArg(1) Class8_Sub8 arg0) {
		arg0.aBoolean397 = false;
		if (arg0.aClass8_Sub20_5 != null) {
			arg0.aClass8_Sub20_5.anInt4697 = 0;
		}
		for (@Pc(19) Class8_Sub8 local19 = arg0.method3706(); local19 != null; local19 = arg0.method3704()) {
			method1544(local19);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)I")
	public static int method1545(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static299.method4318(4, arg1 + 45365, arg0 + 91923) + (Static299.method4318(2, arg1 + 10294, arg0 + 37821) - 128 >> 1) + (Static299.method4318(1, arg1, arg0) + -128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}
}
