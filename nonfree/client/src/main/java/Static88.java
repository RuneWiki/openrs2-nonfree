import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!gf", name = "P", descriptor = "Lclient!db;")
	public static Class30 aClass30_1;

	@OriginalMember(owner = "client!gf", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString69 = "RuneScape is loading - please wait...";

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIILclient!uk;JLclient!uk;Lclient!uk;)V")
	public static void method1486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class13 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class13 arg6, @OriginalArg(7) Class13 arg7) {
		@Pc(3) Class127 local3 = new Class127();
		local3.aClass13_7 = arg4;
		local3.anInt4020 = arg1 * 128 + 64;
		local3.anInt4022 = arg2 * 128 + 64;
		local3.anInt4021 = arg3;
		local3.aLong145 = arg5;
		local3.aClass13_5 = arg6;
		local3.aClass13_6 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class4_Sub21 local42 = Static261.aClass4_Sub21ArrayArrayArray4[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt2694; local46++) {
				@Pc(55) Class99 local55 = local42.aClass99Array19[local46];
				if ((local55.aLong117 & 0x400000L) == 4194304L) {
					@Pc(66) int local66 = local55.aClass13_4.method4266();
					if (local66 != -32768 && local66 < local34) {
						local34 = local66;
					}
				}
			}
		}
		local3.anInt4023 = -local34;
		if (Static261.aClass4_Sub21ArrayArrayArray4[arg0][arg1][arg2] == null) {
			Static261.aClass4_Sub21ArrayArrayArray4[arg0][arg1][arg2] = new Class4_Sub21(arg0, arg1, arg2);
		}
		Static261.aClass4_Sub21ArrayArrayArray4[arg0][arg1][arg2].aClass127_1 = local3;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IBI)V")
	public static void method1487(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class4_Sub2_Sub15 local16 = Static131.method1210(arg0, 13);
		local16.method2876();
		local16.anInt3536 = arg1;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!cg;BLclient!cg;)V")
	public static void method1488(@OriginalArg(0) Class22 arg0, @OriginalArg(2) Class22 arg1) {
		Static11.aClass22_5 = arg0;
		Static292.aClass22_103 = arg1;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg3 == arg8 && arg2 == arg6 && arg0 == arg5 && arg4 == arg1) {
			Static58.method2506(arg7, arg8, arg5, arg4, arg2);
			return;
		}
		@Pc(36) int local36 = arg8;
		@Pc(40) int local40 = arg2 * 3;
		@Pc(42) int local42 = arg2;
		@Pc(46) int local46 = arg3 * 3;
		@Pc(50) int local50 = arg6 * 3;
		@Pc(54) int local54 = arg1 * 3;
		@Pc(58) int local58 = arg0 * 3;
		@Pc(62) int local62 = arg8 * 3;
		@Pc(70) int local70 = local50 + arg4 - local54 - arg2;
		@Pc(79) int local79 = local46 + arg5 - arg8 - local58;
		@Pc(88) int local88 = local62 + local58 - local46 - local46;
		@Pc(97) int local97 = local40 + local54 - local50 - local50;
		@Pc(102) int local102 = local46 - local62;
		@Pc(106) int local106 = local50 - local40;
		for (@Pc(108) int local108 = 128; local108 <= 4096; local108 += 128) {
			@Pc(119) int local119 = local108 * local108 >> 12;
			@Pc(125) int local125 = local108 * local119 >> 12;
			@Pc(129) int local129 = local125 * local79;
			@Pc(133) int local133 = local70 * local125;
			@Pc(137) int local137 = local119 * local97;
			@Pc(141) int local141 = local88 * local119;
			@Pc(145) int local145 = local102 * local108;
			@Pc(149) int local149 = local106 * local108;
			@Pc(160) int local160 = arg8 + (local145 + local141 + local129 >> 12);
			@Pc(171) int local171 = (local137 + local133 + local149 >> 12) + arg2;
			Static58.method2506(arg7, local36, local160, local171, local42);
			local42 = local171;
			local36 = local160;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "([I[IB[ILclient!qe;)V")
	public static void method1490(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class13_Sub5_Sub1 arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(15) int local15 = arg2[local7];
			@Pc(19) int local19 = arg0[local7];
			@Pc(23) int local23 = arg1[local7];
			@Pc(25) int local25 = 0;
			while (local19 != 0 && local25 < arg3.aClass170Array3.length) {
				if ((local19 & 0x1) != 0) {
					if (local15 == -1) {
						arg3.aClass170Array3[local25] = null;
					} else {
						@Pc(54) Class186 local54 = Static51.method992(local15);
						@Pc(57) int local57 = local54.anInt5814;
						@Pc(62) Class170 local62 = arg3.aClass170Array3[local25];
						if (local62 != null) {
							if (local15 == local62.anInt5446) {
								if (local57 == 0) {
									local62 = arg3.aClass170Array3[local25] = null;
								} else if (local57 == 1) {
									local62.anInt5443 = 0;
									local62.anInt5445 = 0;
									local62.anInt5448 = 0;
									local62.anInt5447 = 1;
									local62.anInt5442 = local23;
									Static229.method3598(arg3 == Static72.aClass13_Sub5_Sub1_1, arg3.anInt5294, local54, arg3.anInt5334, 0);
								} else if (local57 == 2) {
									local62.anInt5448 = 0;
								}
							} else if (local54.anInt5807 >= Static51.method992(local62.anInt5446).anInt5807) {
								local62 = arg3.aClass170Array3[local25] = null;
							}
						}
						if (local62 == null) {
							local62 = arg3.aClass170Array3[local25] = new Class170();
							local62.anInt5448 = 0;
							local62.anInt5443 = 0;
							local62.anInt5446 = local15;
							local62.anInt5447 = 1;
							local62.anInt5442 = local23;
							local62.anInt5445 = 0;
							Static229.method3598(arg3 == Static72.aClass13_Sub5_Sub1_1, arg3.anInt5294, local54, arg3.anInt5334, 0);
						}
					}
				}
				local25++;
				local19 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZI)V")
	public static void method1491(@OriginalArg(0) boolean arg0) {
		@Pc(13) byte local13;
		@Pc(11) byte[][] local11;
		if (Static251.aBoolean330 && arg0) {
			local11 = Static13.aByteArrayArray2;
			local13 = 1;
		} else {
			local11 = Static3.aByteArrayArray1;
			local13 = 4;
		}
		@Pc(22) int local22 = local11.length;
		@Pc(24) int local24;
		@Pc(49) int local49;
		@Pc(56) int local56;
		for (local24 = 0; local24 < local22; local24++) {
			@Pc(35) byte[] local35 = local11[local24];
			@Pc(37) int[] local37 = null;
			@Pc(43) int local43 = Static162.anIntArray272[local24] & 0xFF;
			local49 = Static162.anIntArray272[local24] >> 8;
			local56 = local49 * 64 - Static269.anInt5357;
			@Pc(63) int local63 = local43 * 64 - Static105.anInt2105;
			if (local35 != null) {
				Static65.method4575();
				local37 = Static237.method3671(Static105.anInt2105, Static269.anInt5357, Static223.aClass12Array1, local56, arg0, local35, local63);
			}
			if (!arg0 && local49 == Static218.anInt4196 / 8 && local43 == Static50.anInt1120 / 8) {
				if (local37 == null) {
					Static28.anInt611 = -1;
				} else {
					Static45.anInt1037 = local37[2];
					Static28.anInt611 = local37[0];
					Static266.anInt5228 = local37[1];
					Static136.anInt2698 = local37[3];
					Static185.anInt3673 = local37[4];
				}
			}
		}
		for (local24 = 0; local24 < local22; local24++) {
			@Pc(148) int local148 = (Static162.anIntArray272[local24] >> 8) * 64 - Static269.anInt5357;
			local49 = (Static162.anIntArray272[local24] & 0xFF) * 64 - Static105.anInt2105;
			@Pc(162) byte[] local162 = local11[local24];
			if (local162 == null && Static50.anInt1120 < 800) {
				Static65.method4575();
				for (local56 = 0; local56 < local13; local56++) {
					Static99.method1628(64, local49, 64, local148, local56);
				}
			}
		}
	}
}
