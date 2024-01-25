import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "Lclient!jn;")
	public static Class176 aClass176_33;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_49 = new Class362(113, 2);

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString8 = "";

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)Z")
	public static boolean method2168(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIFII[FII)V")
	public static void method2169(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg1 - arg8;
		@Pc(9) int local9 = arg4 - arg5;
		@Pc(17) int local17 = arg0 - arg7;
		@Pc(38) float local38 = (float) local9 * arg6[2] + (float) local17 * arg6[1] + arg6[0] * (float) local5;
		@Pc(63) float local63 = arg6[5] * (float) local9 + arg6[4] * (float) local17 + arg6[3] * (float) local5;
		@Pc(84) float local84 = (float) local9 * arg6[8] + arg6[7] * (float) local17 + arg6[6] * (float) local5;
		@Pc(99) float local99 = (float) Math.sqrt((double) (local84 * local84 + local63 * local63 + local38 * local38));
		@Pc(110) float local110 = (float) Math.atan2((double) local38, (double) local84) / 6.2831855F + 0.5F;
		@Pc(123) float local123 = (float) Math.asin((double) (local63 / local99)) / 3.1415927F + arg3 + 0.5F;
		@Pc(128) float local128;
		if (arg2 == 1) {
			local128 = local110;
			local110 = -local123;
			local123 = local128;
		} else if (arg2 == 2) {
			local123 = -local123;
			local110 = -local110;
		} else if (arg2 == 3) {
			local128 = local110;
			local110 = local123;
			local123 = -local128;
		}
		Static31.aFloat16 = local110;
		Static87.aFloat85 = local123;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIZIB)V")
	public static void method2170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		Static264.aLong140 = 0L;
		@Pc(8) int local8 = Static4.method130();
		if (arg1 == 3 || local8 == 3) {
			arg2 = true;
		}
		if (!Static440.aClass44_12.method5028()) {
			arg2 = true;
		}
		Static288.method8171(arg0, local8, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BIIII)V")
	public static void method2171(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static156.anInt3242 = arg3;
		Static530.anInt9435 = arg2;
		Static534.anInt9515 = arg0;
		Static107.anInt8425 = arg1;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "([I[IIII)V")
	public static void method2173(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(14) int local14 = (arg2 + arg3) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) int local20 = arg1[local14];
		arg1[local14] = arg1[arg3];
		arg1[arg3] = local20;
		@Pc(34) int local34 = arg0[local14];
		arg0[local14] = arg0[arg3];
		arg0[arg3] = local34;
		@Pc(51) int local51 = local20 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(53) int local53 = arg2; local53 < arg3; local53++) {
			if ((local53 & local51) + local20 > arg1[local53]) {
				@Pc(72) int local72 = arg1[local53];
				arg1[local53] = arg1[local16];
				arg1[local16] = local72;
				@Pc(86) int local86 = arg0[local53];
				arg0[local53] = arg0[local16];
				arg0[local16++] = local86;
			}
		}
		arg1[arg3] = arg1[local16];
		arg1[local16] = local20;
		arg0[arg3] = arg0[local16];
		arg0[local16] = local34;
		method2173(arg0, arg1, arg2, local16 - 1);
		method2173(arg0, arg1, local16 + 1, arg3);
	}
}
