import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "[J")
	public static long[] aLongArray3;

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "F")
	public static float aFloat10;

	@OriginalMember(owner = "client!fa", name = "J", descriptor = "F")
	public static float aFloat11;

	@OriginalMember(owner = "client!fa", name = "jb", descriptor = "F")
	public static float aFloat12;

	@OriginalMember(owner = "client!fa", name = "ob", descriptor = "F")
	public static float aFloat13;

	@OriginalMember(owner = "client!fa", name = "rb", descriptor = "F")
	public static float aFloat14;

	@OriginalMember(owner = "client!fa", name = "sb", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!fa", name = "vb", descriptor = "I")
	public static int anInt1679;

	@OriginalMember(owner = "client!fa", name = "wb", descriptor = "I")
	public static int anInt1680;

	@OriginalMember(owner = "client!fa", name = "xb", descriptor = "I")
	public static int anInt1681;

	@OriginalMember(owner = "client!fa", name = "Ab", descriptor = "Z")
	public static boolean aBoolean125;

	@OriginalMember(owner = "client!fa", name = "db", descriptor = "Lclient!fi;")
	public static Class2_Sub16_Sub1 aClass2_Sub16_Sub1_3 = new Class2_Sub16_Sub1(8192);

	@OriginalMember(owner = "client!fa", name = "yb", descriptor = "[I")
	public static final int[] anIntArray367 = new int[8];

	@OriginalMember(owner = "client!fa", name = "zb", descriptor = "[I")
	public static final int[] anIntArray368 = new int[8];

	@OriginalMember(owner = "client!fa", name = "Bb", descriptor = "[I")
	public static int[] anIntArray369 = new int[1];

	@OriginalMember(owner = "client!fa", name = "Cb", descriptor = "[I")
	public static final int[] anIntArray370 = new int[8];

	@OriginalMember(owner = "client!fa", name = "Db", descriptor = "[I")
	public static int[] anIntArray371 = new int[1];

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BFFF)I")
	public static int method1634(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(13) float local13 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(22) float local22 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(31) float local31 = arg1 < 0.0F ? -arg1 : arg1;
		if (local22 > local13 && local31 < local22) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local31 > local13 && local22 < local31) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIB)I")
	public static int method1635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIFFIIII[FII)V")
	public static void method1640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(3) int local3 = arg0 - arg5;
		@Pc(7) int local7 = arg9 - arg6;
		@Pc(11) int local11 = arg4 - arg8;
		@Pc(32) float local32 = (float) local3 * arg7[0] + (float) local7 * arg7[1] + (float) local11 * arg7[2];
		@Pc(53) float local53 = arg7[3] * (float) local3 + (float) local7 * arg7[4] + arg7[5] * (float) local11;
		@Pc(82) float local82 = arg7[8] * (float) local11 + arg7[6] * (float) local3 + arg7[7] * (float) local7;
		@Pc(93) float local93 = (float) Math.atan2((double) local32, (double) local82) / 6.2831855F + 0.5F;
		if (arg3 != 1.0F) {
			local93 *= arg3;
		}
		@Pc(107) float local107 = local53 + arg2 + 0.5F;
		@Pc(120) float local120;
		if (arg1 == 1) {
			local120 = local93;
			local93 = -local107;
			local107 = local120;
		} else if (arg1 == 2) {
			local93 = -local93;
			local107 = -local107;
		} else if (arg1 == 3) {
			local120 = local93;
			local93 = local107;
			local107 = -local120;
		}
		aFloat11 = local93;
		aFloat12 = local107;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II[F)[F")
	public static float[] method1641(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(2) float[] local2 = new float[arg0];
		Static399.method2491(arg1, 0, local2, 0, arg0);
		return local2;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III[FBIFIII)V")
	public static void method1642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg8 - arg4;
		@Pc(13) int local13 = arg1 - arg7;
		@Pc(17) int local17 = arg0 - arg2;
		@Pc(38) float local38 = arg3[1] * (float) local13 + arg3[0] * (float) local9 + (float) local17 * arg3[2];
		@Pc(59) float local59 = (float) local13 * arg3[4] + arg3[3] * (float) local9 + (float) local17 * arg3[5];
		@Pc(80) float local80 = (float) local17 * arg3[8] + (float) local13 * arg3[7] + (float) local9 * arg3[6];
		@Pc(95) float local95 = (float) Math.sqrt((double) (local59 * local59 + local38 * local38 + local80 * local80));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = arg5 + (float) Math.asin((double) (local59 / local95)) / 3.1415927F + 0.5F;
		@Pc(124) float local124;
		if (arg6 == 1) {
			local124 = local106;
			local106 = -local119;
			local119 = local124;
		} else if (arg6 == 2) {
			local119 = -local119;
			local106 = -local106;
		} else if (arg6 == 3) {
			local124 = local106;
			local106 = local119;
			local119 = -local124;
		}
		aFloat13 = local106;
		aFloat15 = local119;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II[FFIIIIFIIFI)V")
	public static void method1643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(11) float arg10, @OriginalArg(12) int arg11) {
		@Pc(3) int local3 = arg11 - arg4;
		@Pc(7) int local7 = arg0 - arg9;
		@Pc(11) int local11 = arg1 - arg5;
		@Pc(32) float local32 = arg2[1] * (float) local11 + (float) local3 * arg2[0] + (float) local7 * arg2[2];
		@Pc(53) float local53 = arg2[5] * (float) local7 + (float) local3 * arg2[3] + (float) local11 * arg2[4];
		@Pc(74) float local74 = arg2[8] * (float) local7 + (float) local11 * arg2[7] + (float) local3 * arg2[6];
		@Pc(83) float local83;
		@Pc(90) float local90;
		if (arg6 == 0) {
			local83 = local32 + arg8 + 0.5F;
			local90 = arg10 + 0.5F - local74;
		} else if (arg6 == 1) {
			local83 = local32 + arg8 + 0.5F;
			local90 = local74 + arg10 + 0.5F;
		} else if (arg6 == 2) {
			local90 = arg3 + 0.5F - local53;
			local83 = arg8 + 0.5F - local32;
		} else if (arg6 == 3) {
			local83 = arg8 + local32 + 0.5F;
			local90 = arg3 + 0.5F - local53;
		} else if (arg6 == 4) {
			local90 = arg3 + 0.5F - local53;
			local83 = arg10 + local74 + 0.5F;
		} else {
			local83 = arg10 + 0.5F - local74;
			local90 = arg3 + 0.5F - local53;
		}
		@Pc(190) float local190;
		if (arg7 == 1) {
			local190 = local83;
			local83 = -local90;
			local90 = local190;
		} else if (arg7 == 2) {
			local83 = -local83;
			local90 = -local90;
		} else if (arg7 == 3) {
			local190 = local83;
			local83 = local90;
			local90 = -local190;
		}
		aFloat10 = local83;
		aFloat14 = local90;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II[B)[B")
	public static byte[] method1645(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(8) byte[] local8 = new byte[arg0];
		Static399.method2487(arg1, 0, local8, 0, arg0);
		return local8;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IFIIIFFI)[F")
	public static float[] method1648(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		local2[6] = -local21;
		local2[4] = 1.0F;
		local2[2] = local21;
		local2[3] = 0.0F;
		local2[8] = local13;
		local2[1] = 0.0F;
		local2[5] = 0.0F;
		local2[7] = 0.0F;
		local2[0] = local13;
		@Pc(66) float[] local66 = new float[9];
		@Pc(68) float local68 = 1.0F;
		@Pc(73) float local73 = (float) arg2 / 32767.0F;
		@Pc(75) float local75 = 0.0F;
		@Pc(79) float local79 = 1.0F - local73;
		@Pc(89) float local89 = -((float) Math.sqrt((double) (1.0F - local73 * local73)));
		@Pc(100) float local100 = (float) Math.sqrt((double) (arg0 * arg0 + arg6 * arg6));
		if (local100 == 0.0F && local73 == 0.0F) {
			local5 = local2;
		} else {
			if (local100 != 0.0F) {
				local68 = (float) -arg0 / local100;
				local75 = (float) arg6 / local100;
			}
			local66[8] = local79 * local75 * local75 + local73;
			local66[7] = local89 * -local68;
			local66[5] = local89 * local68;
			local66[3] = -local75 * local89;
			local66[4] = local73;
			local66[2] = local75 * local68 * local79;
			local66[0] = local73 + local68 * local68 * local79;
			local66[1] = local75 * local89;
			local66[6] = local79 * local68 * local75;
			local5[0] = local66[0] * local2[0] + local2[1] * local66[3] + local66[6] * local2[2];
			local5[1] = local2[2] * local66[7] + local66[1] * local2[0] + local66[4] * local2[1];
			local5[3] = local2[3] * local66[0] + local66[3] * local2[4] + local66[6] * local2[5];
			local5[2] = local2[1] * local66[5] + local2[0] * local66[2] + local2[2] * local66[8];
			local5[4] = local66[1] * local2[3] + local66[4] * local2[4] + local66[7] * local2[5];
			local5[5] = local2[5] * local66[8] + local2[3] * local66[2] + local2[4] * local66[5];
			local5[6] = local2[6] * local66[0] + local2[7] * local66[3] + local2[8] * local66[6];
			local5[7] = local66[4] * local2[7] + local2[6] * local66[1] + local66[7] * local2[8];
			local5[8] = local66[5] * local2[7] + local66[2] * local2[6] + local66[8] * local2[8];
		}
		local5[3] *= arg5;
		local5[2] *= arg1;
		local5[7] *= arg4;
		local5[4] *= arg5;
		local5[5] *= arg5;
		local5[8] *= arg4;
		local5[0] *= arg1;
		local5[1] *= arg1;
		local5[6] *= arg4;
		return local5;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z[SI)[S")
	public static short[] method1649(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static399.method2485(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
