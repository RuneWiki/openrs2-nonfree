import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "[I")
	public static int[] anIntArray43 = new int[2];

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "[Lclient!lda;")
	public static final Class6_Sub33[] aClass6_Sub33Array1 = new Class6_Sub33[1024];

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIIIFZIIFI[F)V")
	public static void method616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float[] arg9) {
		@Pc(5) int local5 = arg5 - arg0;
		@Pc(9) int local9 = arg8 - arg1;
		@Pc(13) int local13 = arg2 - arg6;
		@Pc(38) float local38 = (float) local5 * arg9[2] + arg9[1] * (float) local9 + (float) local13 * arg9[0];
		@Pc(64) float local64 = (float) local5 * arg9[5] + arg9[3] * (float) local13 + (float) local9 * arg9[4];
		@Pc(85) float local85 = (float) local13 * arg9[6] + arg9[7] * (float) local9 + arg9[8] * (float) local5;
		@Pc(96) float local96 = (float) Math.atan2((double) local38, (double) local85) / 6.2831855F + 0.5F;
		if (arg7 != 1.0F) {
			local96 *= arg7;
		}
		@Pc(110) float local110 = arg4 + local64 + 0.5F;
		@Pc(121) float local121;
		if (arg3 == 1) {
			local121 = local96;
			local96 = -local110;
			local110 = local121;
		} else if (arg3 == 2) {
			local110 = -local110;
			local96 = -local96;
		} else if (arg3 == 3) {
			local121 = local96;
			local96 = local110;
			local110 = -local121;
		}
		Static298.aFloat123 = local110;
		Static568.aFloat195 = local96;
	}
}
