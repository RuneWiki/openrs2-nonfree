import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ah", name = "p", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray2;

	@OriginalMember(owner = "client!ah", name = "w", descriptor = "Lclient!rn;")
	public static Class155 aClass155_4;

	@OriginalMember(owner = "client!ah", name = "x", descriptor = "I")
	public static int anInt188;

	@OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
	public static int anInt189;

	@OriginalMember(owner = "client!ah", name = "o", descriptor = "[I")
	public static int[] anIntArray16 = new int[200];

	@OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
	public static int anInt187 = -1;

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)I")
	public static int method149(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIBI)I")
	public static int method150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0) {
			return arg1;
		} else {
			@Pc(22) int local22 = 128 - arg2;
			@Pc(40) int local40 = (arg1 >>> 7 & 0x1FE01FE) * local22 + arg2 * (arg0 >>> 7 & 0x1FE01FE) & 0xFF00FF00;
			@Pc(54) int local54 = local22 * (arg1 & 0xFF00FF) + (arg0 & 0xFF00FF) * arg2 & 0xFF00FF00;
			return (local54 >> 7) + local40;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "([[FI[[F[[I[[FIIZIBBLclient!mi;IIBI)V")
	public static void method151(@OriginalArg(0) float[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(10) byte arg9, @OriginalArg(11) Class3_Sub21 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) byte arg13, @OriginalArg(15) int arg14) {
		@Pc(7) int local7 = (arg1 << 8) + 255;
		@Pc(13) int local13 = (arg5 << 8) + 255;
		@Pc(23) int local23 = (arg14 << 8) + 255;
		@Pc(29) int local29 = (arg6 << 8) + 255;
		@Pc(33) int[] local33 = Static29.anIntArrayArray5[arg9];
		@Pc(35) int[] local35 = null;
		@Pc(41) int[] local41 = new int[local33.length >> 1];
		@Pc(43) int local43;
		for (local43 = 0; local43 < local41.length; local43++) {
			local41[local43] = Static41.method566(arg13, null, local29, arg3, arg2, arg4, false, arg12, local33[local43 + local43 + 1], local7, arg8, local33[local43 + local43], arg0, local23, arg10, 0.0F, local13);
		}
		if (arg7) {
			@Pc(194) int local194;
			if (arg9 == 1) {
				local43 = Static41.method566(arg13, null, local29, arg3, arg2, arg4, true, arg12, 128, local7, arg8, 64, arg0, local23, arg10, 0.0F, local13);
				local35 = new int[6];
				local194 = Static41.method566(arg13, null, local29, arg3, arg2, arg4, true, arg12, 64, local7, arg8, 128, arg0, local23, arg10, 0.0F, local13);
				local35[0] = local194;
				local35[3] = local43;
				local35[1] = local43;
				local35[4] = local41[0];
				local35[2] = local41[2];
				local35[5] = local41[2];
			} else if (arg9 == 2) {
				local35 = new int[6];
				local43 = Static41.method566(arg13, null, local29, arg3, arg2, arg4, true, arg12, 128, local7, arg8, 128, arg0, local23, arg10, 0.0F, local13);
				local194 = Static41.method566(arg13, null, local29, arg3, arg2, arg4, true, arg12, 0, local7, arg8, 64, arg0, local23, arg10, 0.0F, local13);
				local35[3] = local43;
				local35[1] = local194;
				local35[2] = local43;
				local35[0] = local41[0];
				local35[4] = local41[1];
				local35[5] = local41[0];
			} else if (arg9 == 3) {
				local35 = new int[6];
				local43 = Static41.method566(arg13, null, local29, arg3, arg2, arg4, true, arg12, 128, local7, arg8, 0, arg0, local23, arg10, 0.0F, local13);
				local194 = Static41.method566(arg13, null, local29, arg3, arg2, arg4, true, arg12, 0, local7, arg8, 64, arg0, local23, arg10, 0.0F, local13);
				local35[4] = local194;
				local35[1] = local41[1];
				local35[3] = local43;
				local35[0] = local41[2];
				local35[2] = local43;
				local35[5] = local41[2];
			} else if (arg9 == 4) {
				local35 = new int[3];
				local43 = Static41.method566(arg13, null, local29, arg3, arg2, arg4, true, arg12, 128, local7, arg8, 0, arg0, local23, arg10, 0.0F, local13);
				local35[0] = local41[3];
				local35[2] = local41[0];
				local35[1] = local43;
			} else if (arg9 == 5) {
				local35 = new int[3];
				local43 = Static41.method566(arg13, null, local29, arg3, arg2, arg4, true, arg12, 128, local7, arg8, 128, arg0, local23, arg10, 0.0F, local13);
				local35[0] = local41[2];
				local35[2] = local41[3];
				local35[1] = local43;
			} else if (arg9 == 6) {
				local35 = new int[6];
				local43 = Static41.method566(arg13, null, local29, arg3, arg2, arg4, true, arg12, 0, local7, arg8, 128, arg0, local23, arg10, 0.0F, local13);
				local194 = Static41.method566(arg13, null, local29, arg3, arg2, arg4, true, arg12, 128, local7, arg8, 128, arg0, local23, arg10, 0.0F, local13);
				local35[1] = local43;
				local35[0] = local41[3];
				local35[2] = local194;
				local35[3] = local194;
				local35[4] = local41[0];
				local35[5] = local41[3];
			} else if (arg9 == 7) {
				local35 = new int[6];
				local43 = Static41.method566(arg13, null, local29, arg3, arg2, arg4, true, arg12, 128, local7, arg8, 0, arg0, local23, arg10, 0.0F, local13);
				local194 = Static41.method566(arg13, null, local29, arg3, arg2, arg4, true, arg12, 0, local7, arg8, 128, arg0, local23, arg10, 0.0F, local13);
				local35[3] = local43;
				local35[2] = local43;
				local35[0] = local41[1];
				local35[1] = local194;
				local35[4] = local41[2];
				local35[5] = local41[1];
			} else if (arg9 == 8) {
				local35 = new int[3];
				local43 = Static41.method566(arg13, null, local29, arg3, arg2, arg4, true, arg12, 0, local7, arg8, 0, arg0, local23, arg10, 0.0F, local13);
				local35[0] = local41[3];
				local35[2] = local41[4];
				local35[1] = local43;
			} else if (arg9 == 9) {
				local35 = new int[15];
				local43 = Static41.method566(arg13, null, local29, arg3, arg2, arg4, true, arg12, 64, local7, arg8, 128, arg0, local23, arg10, 0.0F, local13);
				local194 = Static41.method566(arg13, null, local29, arg3, arg2, arg4, true, arg12, 32, local7, arg8, 96, arg0, local23, arg10, 0.0F, local13);
				@Pc(728) int local728 = Static41.method566(arg13, null, local29, arg3, arg2, arg4, true, arg12, 0, local7, arg8, 64, arg0, local23, arg10, 0.0F, local13);
				local35[12] = local194;
				local35[9] = local194;
				local35[0] = local194;
				local35[2] = local41[4];
				local35[4] = local41[4];
				local35[8] = local41[2];
				local35[3] = local194;
				local35[1] = local43;
				local35[5] = local41[3];
				local35[10] = local41[2];
				local35[7] = local41[3];
				local35[14] = local728;
				local35[6] = local194;
				local35[11] = local41[1];
				local35[13] = local41[1];
			} else if (arg9 == 10) {
				local35 = new int[9];
				local43 = Static41.method566(arg13, null, local29, arg3, arg2, arg4, true, arg12, 128, local7, arg8, 0, arg0, local23, arg10, 0.0F, local13);
				local35[7] = local43;
				local35[0] = local41[2];
				local35[1] = local43;
				local35[4] = local43;
				local35[2] = local41[3];
				local35[6] = local41[4];
				local35[3] = local41[3];
				local35[5] = local41[4];
				local35[8] = local41[0];
			} else if (arg9 == 11) {
				local43 = Static41.method566(arg13, null, local29, arg3, arg2, arg4, true, arg12, 64, local7, arg8, 0, arg0, local23, arg10, 0.0F, local13);
				local35 = new int[12];
				local194 = Static41.method566(arg13, null, local29, arg3, arg2, arg4, true, arg12, 64, local7, arg8, 128, arg0, local23, arg10, 0.0F, local13);
				local35[0] = local41[3];
				local35[3] = local41[3];
				local35[7] = local194;
				local35[5] = local43;
				local35[11] = local194;
				local35[8] = local43;
				local35[2] = local41[0];
				local35[9] = local41[2];
				local35[1] = local43;
				local35[4] = local41[2];
				local35[6] = local41[2];
				local35[10] = local41[1];
			}
		}
		arg10.method2860(arg11, arg12, arg8, local41, local35, false);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)V")
	public static void method152() {
		Static177.aClass98_28.method2565(5);
		Static21.aClass98_4.method2565(5);
	}
}
