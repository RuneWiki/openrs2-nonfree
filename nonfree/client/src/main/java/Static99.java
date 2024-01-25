import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIII)V")
	public static void method2090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static287.anIntArrayArray52 != null) {
			Static287.anIntArrayArray52[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static119.aShortArrayArray1 != null) {
			Static119.aShortArrayArray1[arg0][arg1] = (short) arg3;
		}
		if (Static51.aByteArrayArray28 != null) {
			Static51.aByteArrayArray28[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIB)V")
	public static void method2091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class12_Sub4_Sub1 local12 = Static389.method6156(6, arg0);
		local12.method820();
		local12.anInt806 = arg1;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BII[FIIIFIIIFF)V")
	public static void method2092(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float arg10, @OriginalArg(12) float arg11) {
		@Pc(9) int local9 = arg8 - arg9;
		@Pc(13) int local13 = arg7 - arg5;
		@Pc(21) int local21 = arg1 - arg0;
		@Pc(42) float local42 = (float) local21 * arg2[2] + (float) local9 * arg2[0] + (float) local13 * arg2[1];
		@Pc(63) float local63 = (float) local21 * arg2[5] + (float) local13 * arg2[4] + arg2[3] * (float) local9;
		@Pc(84) float local84 = arg2[8] * (float) local21 + arg2[6] * (float) local9 + arg2[7] * (float) local13;
		@Pc(95) float local95;
		@Pc(101) float local101;
		if (arg4 == 0) {
			local95 = arg11 + local42 + 0.5F;
			local101 = arg6 + 0.5F - local84;
		} else if (arg4 == 1) {
			local95 = arg11 + local42 + 0.5F;
			local101 = arg6 + local84 + 0.5F;
		} else if (arg4 == 2) {
			local95 = arg11 + 0.5F - local42;
			local101 = arg10 + 0.5F - local63;
		} else if (arg4 == 3) {
			local95 = local42 + arg11 + 0.5F;
			local101 = arg10 + 0.5F - local63;
		} else if (arg4 == 4) {
			local95 = local84 + arg6 + 0.5F;
			local101 = arg10 + 0.5F - local63;
		} else {
			local95 = arg6 + 0.5F - local84;
			local101 = arg10 + 0.5F - local63;
		}
		@Pc(196) float local196;
		if (arg3 == 1) {
			local196 = local95;
			local95 = -local101;
			local101 = local196;
		} else if (arg3 == 2) {
			local95 = -local95;
			local101 = -local101;
		} else if (arg3 == 3) {
			local196 = local95;
			local95 = local101;
			local101 = -local196;
		}
		Static532.aFloat196 = local101;
		Static447.aFloat181 = local95;
	}
}
