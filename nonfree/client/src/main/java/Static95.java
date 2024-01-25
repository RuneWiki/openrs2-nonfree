import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!fs", name = "v", descriptor = "F")
	public static float aFloat17;

	@OriginalMember(owner = "client!fs", name = "M", descriptor = "F")
	public static float aFloat18;

	@OriginalMember(owner = "client!fs", name = "X", descriptor = "F")
	public static float aFloat19;

	@OriginalMember(owner = "client!fs", name = "ab", descriptor = "[J")
	public static long[] aLongArray5;

	@OriginalMember(owner = "client!fs", name = "mb", descriptor = "F")
	public static float aFloat20;

	@OriginalMember(owner = "client!fs", name = "vb", descriptor = "F")
	public static float aFloat21;

	@OriginalMember(owner = "client!fs", name = "wb", descriptor = "F")
	public static float aFloat22;

	@OriginalMember(owner = "client!fs", name = "xb", descriptor = "Z")
	public static boolean aBoolean161;

	@OriginalMember(owner = "client!fs", name = "zb", descriptor = "I")
	public static int anInt2348;

	@OriginalMember(owner = "client!fs", name = "Cb", descriptor = "I")
	public static int anInt2349;

	@OriginalMember(owner = "client!fs", name = "Eb", descriptor = "I")
	public static int anInt2350;

	@OriginalMember(owner = "client!fs", name = "z", descriptor = "Lclient!fb;")
	public static Class7_Sub3_Sub1 aClass7_Sub3_Sub1_3 = new Class7_Sub3_Sub1(8192);

	@OriginalMember(owner = "client!fs", name = "yb", descriptor = "[I")
	public static final int[] anIntArray317 = new int[8];

	@OriginalMember(owner = "client!fs", name = "Ab", descriptor = "[I")
	public static final int[] anIntArray318 = new int[8];

	@OriginalMember(owner = "client!fs", name = "Bb", descriptor = "[I")
	public static int[] anIntArray319 = new int[1];

	@OriginalMember(owner = "client!fs", name = "Gb", descriptor = "[I")
	public static final int[] anIntArray320 = new int[8];

	@OriginalMember(owner = "client!fs", name = "Hb", descriptor = "[I")
	public static int[] anIntArray321 = new int[1];

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(III)I")
	public static int method1958(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IB[S)[S")
	public static short[] method1959(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(2) short[] local2 = new short[arg0];
		Static366.method4206(arg1, 0, local2, 0, arg0);
		return local2;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(FFBF)I")
	public static int method1963(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		@Pc(8) float local8 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(17) float local17 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(32) float local32 = arg1 < 0.0F ? -arg1 : arg1;
		if (local17 > local8 && local32 < local17) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local32 > local8 && local17 < local32) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "([BII)[B")
	public static byte[] method1964(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(8) byte[] local8 = new byte[arg1];
		Static366.method4202(arg0, 0, local8, 0, arg1);
		return local8;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(FZIIIFI[FIII)V")
	public static void method1965(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(3) int local3 = arg2 - arg1;
		@Pc(7) int local7 = arg9 - arg7;
		@Pc(11) int local11 = arg3 - arg8;
		@Pc(32) float local32 = (float) local11 * arg6[2] + arg6[0] * (float) local7 + (float) local3 * arg6[1];
		@Pc(53) float local53 = (float) local3 * arg6[4] + arg6[3] * (float) local7 + (float) local11 * arg6[5];
		@Pc(74) float local74 = arg6[6] * (float) local7 + arg6[7] * (float) local3 + (float) local11 * arg6[8];
		@Pc(85) float local85 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		if (arg4 != 1.0F) {
			local85 *= arg4;
		}
		@Pc(100) float local100 = local53 + arg0 + 0.5F;
		@Pc(105) float local105;
		if (arg5 == 1) {
			local105 = local85;
			local85 = -local100;
			local100 = local105;
		} else if (arg5 == 2) {
			local100 = -local100;
			local85 = -local85;
		} else if (arg5 == 3) {
			local105 = local85;
			local85 = local100;
			local100 = -local105;
		}
		aFloat17 = local100;
		aFloat20 = local85;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IFI[FIIIIII)V")
	public static void method1969(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(3) int local3 = arg2 - arg8;
		@Pc(7) int local7 = arg5 - arg7;
		@Pc(11) int local11 = arg6 - arg4;
		@Pc(32) float local32 = arg3[1] * (float) local7 + arg3[0] * (float) local11 + (float) local3 * arg3[2];
		@Pc(53) float local53 = arg3[5] * (float) local3 + arg3[4] * (float) local7 + (float) local11 * arg3[3];
		@Pc(74) float local74 = arg3[6] * (float) local11 + (float) local7 * arg3[7] + arg3[8] * (float) local3;
		@Pc(89) float local89 = (float) Math.sqrt((double) (local74 * local74 + local53 * local53 + local32 * local32));
		@Pc(104) float local104 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		@Pc(117) float local117 = arg1 + (float) Math.asin((double) (local53 / local89)) / 3.1415927F + 0.5F;
		@Pc(124) float local124;
		if (arg0 == 1) {
			local124 = local104;
			local104 = -local117;
			local117 = local124;
		} else if (arg0 == 2) {
			local117 = -local117;
			local104 = -local104;
		} else if (arg0 == 3) {
			local124 = local104;
			local104 = local117;
			local117 = -local124;
		}
		aFloat18 = local117;
		aFloat21 = local104;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IFIIIFIF)[F")
	public static float[] method1971(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(8) float[] local8 = new float[9];
		@Pc(11) float[] local11 = new float[9];
		@Pc(19) float local19 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
		@Pc(27) float local27 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
		local8[0] = local19;
		local8[2] = local27;
		local8[4] = 1.0F;
		local8[3] = 0.0F;
		local8[7] = 0.0F;
		local8[1] = 0.0F;
		local8[5] = 0.0F;
		local8[8] = local19;
		local8[6] = -local27;
		@Pc(72) float[] local72 = new float[9];
		@Pc(74) float local74 = 1.0F;
		@Pc(76) float local76 = 0.0F;
		@Pc(81) float local81 = (float) arg3 / 32767.0F;
		@Pc(86) float local86 = 1.0F - local81;
		@Pc(96) float local96 = -((float) Math.sqrt((double) (1.0F - local81 * local81)));
		@Pc(108) float local108 = (float) Math.sqrt((double) (arg5 * arg5 + arg0 * arg0));
		if (local108 == 0.0F && local81 == 0.0F) {
			local11 = local8;
		} else {
			if (local108 != 0.0F) {
				local76 = (float) arg5 / local108;
				local74 = (float) -arg0 / local108;
			}
			local72[4] = local81;
			local72[1] = local96 * local76;
			local72[8] = local81 + local86 * local76 * local76;
			local72[5] = local96 * local74;
			local72[2] = local74 * local76 * local86;
			local72[6] = local86 * local76 * local74;
			local72[7] = -local74 * local96;
			local72[3] = local96 * -local76;
			local72[0] = local86 * local74 * local74 + local81;
			local11[0] = local72[3] * local8[1] + local8[0] * local72[0] + local72[6] * local8[2];
			local11[1] = local8[0] * local72[1] + local72[4] * local8[1] + local72[7] * local8[2];
			local11[3] = local72[6] * local8[5] + local72[0] * local8[3] + local72[3] * local8[4];
			local11[2] = local8[0] * local72[2] + local8[1] * local72[5] + local72[8] * local8[2];
			local11[4] = local72[4] * local8[4] + local8[3] * local72[1] + local72[7] * local8[5];
			local11[5] = local72[2] * local8[3] + local72[5] * local8[4] + local8[5] * local72[8];
			local11[6] = local8[7] * local72[3] + local8[6] * local72[0] + local8[8] * local72[6];
			local11[7] = local8[7] * local72[4] + local72[1] * local8[6] + local72[7] * local8[8];
			local11[8] = local72[8] * local8[8] + local72[5] * local8[7] + local72[2] * local8[6];
		}
		local11[4] *= arg4;
		local11[7] *= arg1;
		local11[6] *= arg1;
		local11[3] *= arg4;
		local11[0] *= arg6;
		local11[8] *= arg1;
		local11[1] *= arg6;
		local11[5] *= arg4;
		local11[2] *= arg6;
		return local11;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I[FB)[F")
	public static float[] method1973(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1) {
		@Pc(20) float[] local20 = new float[arg0];
		Static366.method4207(arg1, 0, local20, 0, arg0);
		return local20;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIFFIIIFIIII[F)V")
	public static void method1977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float[] arg11) {
		@Pc(3) int local3 = arg9 - arg5;
		@Pc(7) int local7 = arg10 - arg0;
		@Pc(11) int local11 = arg6 - arg8;
		@Pc(32) float local32 = (float) local11 * arg11[0] + arg11[1] * (float) local7 + arg11[2] * (float) local3;
		@Pc(53) float local53 = arg11[4] * (float) local7 + arg11[3] * (float) local11 + (float) local3 * arg11[5];
		@Pc(74) float local74 = arg11[7] * (float) local7 + arg11[6] * (float) local11 + (float) local3 * arg11[8];
		@Pc(98) float local98;
		@Pc(92) float local92;
		if (arg1 == 0) {
			local98 = local32 + arg2 + 0.5F;
			local92 = arg7 + 0.5F - local74;
		} else if (arg1 == 1) {
			local98 = arg2 + local32 + 0.5F;
			local92 = arg7 + local74 + 0.5F;
		} else if (arg1 == 2) {
			local92 = arg3 + 0.5F - local53;
			local98 = arg2 + 0.5F - local32;
		} else if (arg1 == 3) {
			local92 = arg3 + 0.5F - local53;
			local98 = arg2 + local32 + 0.5F;
		} else if (arg1 == 4) {
			local98 = local74 + arg7 + 0.5F;
			local92 = arg3 + 0.5F - local53;
		} else {
			local98 = arg7 + 0.5F - local74;
			local92 = arg3 + 0.5F - local53;
		}
		@Pc(179) float local179;
		if (arg4 == 1) {
			local179 = local98;
			local98 = -local92;
			local92 = local179;
		} else if (arg4 == 2) {
			local98 = -local98;
			local92 = -local92;
		} else if (arg4 == 3) {
			local179 = local98;
			local98 = local92;
			local92 = -local179;
		}
		aFloat22 = local98;
		aFloat19 = local92;
	}
}
