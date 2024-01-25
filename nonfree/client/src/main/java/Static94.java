import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!df", name = "J", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_61 = new Class288(119, 2);

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I[B)Lclient!nfa;")
	public static Class2_Sub2_Sub16 method1465(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class2_Sub2_Sub16 local9 = new Class2_Sub2_Sub16();
		@Pc(14) Class2_Sub22 local14 = new Class2_Sub22(arg0);
		local14.anInt10247 = local14.aByteArray115.length - 2;
		@Pc(25) int local25 = local14.method8546();
		@Pc(35) int local35 = local14.aByteArray115.length - local25 - 12 - 2;
		local14.anInt10247 = local35;
		@Pc(44) int local44 = local14.method8542();
		local9.anInt5868 = local14.method8546();
		local9.anInt5866 = local14.method8546();
		local9.anInt5864 = local14.method8546();
		local9.anInt5870 = local14.method8546();
		@Pc(73) int local73 = local14.method8547();
		@Pc(81) int local81;
		@Pc(87) int local87;
		if (local73 > 0) {
			local9.aClass118Array1 = new Class118[local73];
			for (local81 = 0; local81 < local73; local81++) {
				local87 = local14.method8546();
				@Pc(96) Class118 local96 = new Class118(Static350.method4699(local87));
				local9.aClass118Array1[local81] = local96;
				while (local87-- > 0) {
					@Pc(107) int local107 = local14.method8542();
					@Pc(111) int local111 = local14.method8542();
					local96.method2601(new Class2_Sub30(local111), (long) local107);
				}
			}
		}
		local14.anInt10247 = 0;
		local9.aString76 = local14.method8535();
		local9.aStringArray31 = new String[local44];
		local9.anIntArray430 = new int[local44];
		local9.anIntArray429 = new int[local44];
		local81 = 0;
		while (local35 > local14.anInt10247) {
			local87 = local14.method8546();
			if (local87 == 3) {
				local9.aStringArray31[local81] = local14.method8549().intern();
			} else if (local87 >= 100 || local87 == 21 || local87 == 38 || local87 == 39) {
				local9.anIntArray430[local81] = local14.method8547();
			} else {
				local9.anIntArray430[local81] = local14.method8542();
			}
			local9.anIntArray429[local81++] = local87;
		}
		return local9;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B[[BLclient!tp;)V")
	public static void method1466(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class275_Sub1 arg1) {
		@Pc(19) int[] local19 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(22) int local22 = arg0.length;
		@Pc(43) int local43;
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(30) byte[] local30 = arg0[local24];
			if (local30 != null) {
				@Pc(37) Class2_Sub22 local37 = new Class2_Sub22(local30);
				local43 = Static407.anIntArray620[local24] >> 8;
				@Pc(49) int local49 = Static407.anIntArray620[local24] & 0xFF;
				@Pc(56) int local56 = local43 * 64 - Static132.anInt2246;
				@Pc(63) int local63 = local49 * 64 - Static123.anInt2176;
				Static48.method803();
				arg1.method7617(local63, local56, Static230.aClass240Array1, local37, Static123.anInt2176, Static132.anInt2246);
				arg1.method7628(local56, Static192.aClass95_4, local37, local63, local19);
				if (!arg1.aBoolean674 && Static22.anInt551 / 8 == local43 && local49 == Static8.anInt114 / 8 && local19[0] != -1) {
					Static382.aClass160_1 = Static355.aClass157_1.method3384(local19[2], Static263.aClass224_1, local19[1], local19[3], local19[0]);
					Static222.anInt3623 = local19[4];
				}
			}
		}
		for (@Pc(133) int local133 = 0; local133 < local22; local133++) {
			@Pc(146) int local146 = (Static407.anIntArray620[local133] >> 8) * 64 - Static132.anInt2246;
			local43 = (Static407.anIntArray620[local133] & 0xFF) * 64 - Static123.anInt2176;
			@Pc(161) byte[] local161 = arg0[local133];
			if (local161 == null && Static8.anInt114 < 800) {
				Static48.method803();
				arg1.method7609(local43, local146);
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "([ILclient!kc;BI)V")
	public static void method1467(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class13_Sub1_Sub1_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(25) boolean local25;
		@Pc(27) int local27;
		if (arg1.anIntArray300 != null) {
			local25 = true;
			for (local27 = 0; local27 < arg1.anIntArray300.length; local27++) {
				if (arg0[local27] != arg1.anIntArray300[local27]) {
					local25 = false;
					break;
				}
			}
			if (local25 && arg1.anInt4559 != -1) {
				@Pc(67) Class81 local67 = Static540.aClass173_2.method3791(arg1.anInt4559);
				@Pc(70) int local70 = local67.anInt2141;
				if (local70 == 1) {
					arg1.anInt4567 = 0;
					arg1.anInt4634 = 1;
					arg1.anInt4564 = 0;
					arg1.anInt4591 = 0;
					arg1.anInt4622 = arg2;
					if (!arg1.aBoolean317) {
						Static589.method8022(arg1.anInt4591, local67, arg1);
					}
				}
				if (local70 == 2) {
					arg1.anInt4567 = 0;
				}
			}
		}
		local25 = true;
		for (local27 = 0; local27 < arg0.length; local27++) {
			if (arg0[local27] != -1) {
				local25 = false;
			}
			if (arg1.anIntArray300 == null || arg1.anIntArray300[local27] == -1 || Static540.aClass173_2.method3791(arg0[local27]).anInt2151 >= Static540.aClass173_2.method3791(arg1.anIntArray300[local27]).anInt2151) {
				arg1.anInt4622 = arg2;
				arg1.anIntArray300 = arg0;
				break;
			}
		}
		if (local25) {
			arg1.anIntArray300 = arg0;
			arg1.anInt4622 = arg2;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "([FBIII[FFIIII)V")
	public static void method1469(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(9) int local9 = arg8 - arg3;
		@Pc(13) int local13 = arg1 - arg2;
		@Pc(25) int local25 = arg6 - arg7;
		@Pc(46) float local46 = arg4[0] * (float) local13 + (float) local9 * arg4[1] + arg4[2] * (float) local25;
		@Pc(67) float local67 = arg4[3] * (float) local13 + (float) local9 * arg4[4] + (float) local25 * arg4[5];
		@Pc(88) float local88 = (float) local9 * arg4[7] + arg4[6] * (float) local13 + arg4[8] * (float) local25;
		@Pc(103) float local103 = (float) Math.sqrt((double) (local46 * local46 + local67 * local67 + local88 * local88));
		@Pc(114) float local114 = (float) Math.atan2((double) local46, (double) local88) / 6.2831855F + 0.5F;
		@Pc(127) float local127 = (float) Math.asin((double) (local67 / local103)) / 3.1415927F + arg5 + 0.5F;
		@Pc(144) float local144;
		if (arg9 == 1) {
			local144 = local114;
			local114 = -local127;
			local127 = local144;
		} else if (arg9 == 2) {
			local114 = -local114;
			local127 = -local127;
		} else if (arg9 == 3) {
			local144 = local114;
			local114 = local127;
			local127 = -local144;
		}
		arg0[0] = local114;
		arg0[1] = local127;
	}
}
