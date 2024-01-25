import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!df", name = "L", descriptor = "Ljava/lang/Object;")
	public static Object anObject2;

	@OriginalMember(owner = "client!df", name = "H", descriptor = "Lclient!cb;")
	public static final Class51 aClass51_3 = new Class51();

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIII[FII[FF)V")
	public static void method1396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float[] arg8, @OriginalArg(10) float arg9) {
		@Pc(5) int local5 = arg1 - arg0;
		@Pc(9) int local9 = arg4 - arg2;
		@Pc(13) int local13 = arg7 - arg3;
		@Pc(38) float local38 = arg5[2] * (float) local9 + arg5[0] * (float) local5 + arg5[1] * (float) local13;
		@Pc(59) float local59 = arg5[5] * (float) local9 + arg5[3] * (float) local5 + arg5[4] * (float) local13;
		@Pc(80) float local80 = (float) local9 * arg5[8] + arg5[6] * (float) local5 + arg5[7] * (float) local13;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local38 * local38 + local59 * local59 + local80 * local80));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(136) float local136 = arg9 + (float) Math.asin((double) (local59 / local95)) / 3.1415927F + 0.5F;
		@Pc(141) float local141;
		if (arg6 == 1) {
			local141 = local106;
			local106 = -local136;
			local136 = local141;
		} else if (arg6 == 2) {
			local106 = -local106;
			local136 = -local136;
		} else if (arg6 == 3) {
			local141 = local106;
			local106 = local136;
			local136 = -local141;
		}
		arg8[1] = local136;
		arg8[0] = local106;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(III)V")
	public static void method1397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class243 local7 = Static334.aClass243ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static165.method3262(local7.aClass60_Sub1_Sub3_1);
		Static165.method3262(local7.aClass60_Sub1_Sub3_2);
		if (local7.aClass60_Sub1_Sub3_1 != null) {
			local7.aClass60_Sub1_Sub3_1 = null;
		}
		if (local7.aClass60_Sub1_Sub3_2 != null) {
			local7.aClass60_Sub1_Sub3_2 = null;
		}
	}
}
