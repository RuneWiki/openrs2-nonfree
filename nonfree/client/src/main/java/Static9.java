import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ai", name = "U", descriptor = "[J")
	public static long[] aLongArray1;

	@OriginalMember(owner = "client!ai", name = "W", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!ai", name = "X", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!ai", name = "eb", descriptor = "F")
	public static float aFloat3;

	@OriginalMember(owner = "client!ai", name = "gb", descriptor = "F")
	public static float aFloat4;

	@OriginalMember(owner = "client!ai", name = "rb", descriptor = "F")
	public static float aFloat5;

	@OriginalMember(owner = "client!ai", name = "ub", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!ai", name = "Cb", descriptor = "Z")
	public static boolean aBoolean16;

	@OriginalMember(owner = "client!ai", name = "Db", descriptor = "I")
	public static int anInt202;

	@OriginalMember(owner = "client!ai", name = "Ib", descriptor = "I")
	public static int anInt203;

	@OriginalMember(owner = "client!ai", name = "Kb", descriptor = "I")
	public static int anInt204;

	@OriginalMember(owner = "client!ai", name = "H", descriptor = "Lclient!pq;")
	public static Class2_Sub10_Sub2 aClass2_Sub10_Sub2_1 = new Class2_Sub10_Sub2(8192);

	@OriginalMember(owner = "client!ai", name = "Ab", descriptor = "[I")
	public static int[] anIntArray15 = new int[1];

	@OriginalMember(owner = "client!ai", name = "Bb", descriptor = "[I")
	public static final int[] anIntArray16 = new int[8];

	@OriginalMember(owner = "client!ai", name = "Fb", descriptor = "[I")
	public static int[] anIntArray17 = new int[1];

	@OriginalMember(owner = "client!ai", name = "Gb", descriptor = "[I")
	public static final int[] anIntArray18 = new int[8];

	@OriginalMember(owner = "client!ai", name = "Jb", descriptor = "[I")
	public static final int[] anIntArray19 = new int[8];

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "([FII)[F")
	public static float[] method319(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		Static359.method688(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I[BI)[B")
	public static byte[] method321(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		Static359.method687(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IFIIIFFI)[F")
	public static float[] method323(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg0 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg0 * 0.024543693F));
		local2[6] = -local21;
		local2[1] = 0.0F;
		local2[4] = 1.0F;
		local2[5] = 0.0F;
		local2[8] = local13;
		local2[2] = local21;
		local2[3] = 0.0F;
		local2[0] = local13;
		local2[7] = 0.0F;
		@Pc(66) float[] local66 = new float[9];
		@Pc(68) float local68 = 1.0F;
		@Pc(70) float local70 = 0.0F;
		@Pc(75) float local75 = (float) arg6 / 32767.0F;
		@Pc(79) float local79 = 1.0F - local75;
		@Pc(89) float local89 = -((float) Math.sqrt((double) (1.0F - local75 * local75)));
		@Pc(100) float local100 = (float) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3));
		if (local100 == 0.0F && local75 == 0.0F) {
			local5 = local2;
		} else {
			if (local100 != 0.0F) {
				local70 = (float) arg3 / local100;
				local68 = (float) -arg2 / local100;
			}
			local66[0] = local79 * local68 * local68 + local75;
			local66[6] = local79 * local70 * local68;
			local66[5] = local89 * local68;
			local66[8] = local75 + local79 * local70 * local70;
			local66[2] = local70 * local68 * local79;
			local66[1] = local70 * local89;
			local66[7] = local89 * -local68;
			local66[4] = local75;
			local66[3] = local89 * -local70;
			local5[0] = local66[6] * local2[2] + local2[0] * local66[0] + local2[1] * local66[3];
			local5[1] = local66[7] * local2[2] + local2[0] * local66[1] + local2[1] * local66[4];
			local5[2] = local2[2] * local66[8] + local2[1] * local66[5] + local66[2] * local2[0];
			local5[3] = local2[3] * local66[0] + local66[3] * local2[4] + local66[6] * local2[5];
			local5[4] = local2[5] * local66[7] + local2[4] * local66[4] + local2[3] * local66[1];
			local5[6] = local2[8] * local66[6] + local66[3] * local2[7] + local2[6] * local66[0];
			local5[5] = local66[2] * local2[3] + local2[4] * local66[5] + local66[8] * local2[5];
			local5[7] = local66[7] * local2[8] + local2[6] * local66[1] + local2[7] * local66[4];
			local5[8] = local66[2] * local2[6] + local2[7] * local66[5] + local66[8] * local2[8];
		}
		local5[8] *= arg5;
		local5[5] *= arg4;
		local5[0] *= arg1;
		local5[6] *= arg5;
		local5[2] *= arg1;
		local5[4] *= arg4;
		local5[3] *= arg4;
		local5[1] *= arg1;
		local5[7] *= arg5;
		return local5;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "([FIIIIIIIIF)V")
	public static void method324(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8) {
		@Pc(3) int local3 = arg3 - arg6;
		@Pc(7) int local7 = arg5 - arg7;
		@Pc(11) int local11 = arg4 - arg1;
		@Pc(32) float local32 = (float) local11 * arg0[1] + arg0[0] * (float) local7 + arg0[2] * (float) local3;
		@Pc(53) float local53 = (float) local3 * arg0[5] + arg0[4] * (float) local11 + arg0[3] * (float) local7;
		@Pc(74) float local74 = arg0[8] * (float) local3 + (float) local11 * arg0[7] + arg0[6] * (float) local7;
		@Pc(89) float local89 = (float) Math.sqrt((double) (local53 * local53 + local32 * local32 + local74 * local74));
		@Pc(100) float local100 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		@Pc(113) float local113 = arg8 + (float) Math.asin((double) (local53 / local89)) / 3.1415927F + 0.5F;
		@Pc(118) float local118;
		if (arg2 == 1) {
			local118 = local100;
			local100 = -local113;
			local113 = local118;
		} else if (arg2 == 2) {
			local100 = -local100;
			local113 = -local113;
		} else if (arg2 == 3) {
			local118 = local100;
			local100 = local113;
			local113 = -local118;
		}
		aFloat5 = local113;
		aFloat1 = local100;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IB[S)[S")
	public static short[] method325(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(10) short[] local10 = new short[arg0];
		Static359.method690(arg1, 0, local10, 0, arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BFFF)I")
	public static int method327(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(8) float local8 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(17) float local17 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(31) float local31 = arg1 < 0.0F ? -arg1 : arg1;
		if (local8 < local17 && local17 > local31) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local31 > local8 && local31 > local17) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(III)I")
	public static int method332(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIBFI[FFI)V")
	public static void method333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9) {
		@Pc(3) int local3 = arg4 - arg3;
		@Pc(7) int local7 = arg1 - arg6;
		@Pc(11) int local11 = arg9 - arg2;
		@Pc(32) float local32 = arg7[2] * (float) local7 + (float) local3 * arg7[0] + (float) local11 * arg7[1];
		@Pc(53) float local53 = arg7[3] * (float) local3 + arg7[4] * (float) local11 + arg7[5] * (float) local7;
		@Pc(74) float local74 = (float) local7 * arg7[8] + (float) local3 * arg7[6] + arg7[7] * (float) local11;
		@Pc(85) float local85 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		if (arg5 != 1.0F) {
			local85 *= arg5;
		}
		@Pc(107) float local107 = arg8 + local53 + 0.5F;
		@Pc(130) float local130;
		if (arg0 == 1) {
			local130 = local85;
			local85 = -local107;
			local107 = local130;
		} else if (arg0 == 2) {
			local85 = -local85;
			local107 = -local107;
		} else if (arg0 == 3) {
			local130 = local85;
			local85 = local107;
			local107 = -local130;
		}
		aFloat2 = local85;
		aFloat6 = local107;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II[FIFIIIFIIIF)V")
	public static void method335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float arg11) {
		@Pc(3) int local3 = arg6 - arg4;
		@Pc(7) int local7 = arg0 - arg10;
		@Pc(11) int local11 = arg8 - arg1;
		@Pc(32) float local32 = (float) local11 * arg2[2] + (float) local3 * arg2[0] + (float) local7 * arg2[1];
		@Pc(53) float local53 = (float) local7 * arg2[4] + (float) local3 * arg2[3] + (float) local11 * arg2[5];
		@Pc(74) float local74 = (float) local11 * arg2[8] + (float) local3 * arg2[6] + arg2[7] * (float) local7;
		@Pc(85) float local85;
		@Pc(92) float local92;
		if (arg9 == 0) {
			local85 = local32 + arg7 + 0.5F;
			local92 = arg3 + 0.5F - local74;
		} else if (arg9 == 1) {
			local85 = local32 + arg7 + 0.5F;
			local92 = local74 + arg3 + 0.5F;
		} else if (arg9 == 2) {
			local92 = arg11 + 0.5F - local53;
			local85 = arg7 + 0.5F - local32;
		} else if (arg9 == 3) {
			local85 = local32 + arg7 + 0.5F;
			local92 = arg11 + 0.5F - local53;
		} else if (arg9 == 4) {
			local92 = arg11 + 0.5F - local53;
			local85 = local74 + arg3 + 0.5F;
		} else {
			local92 = arg11 + 0.5F - local53;
			local85 = arg3 + 0.5F - local74;
		}
		@Pc(200) float local200;
		if (arg5 == 1) {
			local200 = local85;
			local85 = -local92;
			local92 = local200;
		} else if (arg5 == 2) {
			local92 = -local92;
			local85 = -local85;
		} else if (arg5 == 3) {
			local200 = local85;
			local85 = local92;
			local92 = -local200;
		}
		aFloat4 = local85;
		aFloat3 = local92;
	}
}
