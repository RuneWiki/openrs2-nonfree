import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_12 = new Class186(26, -2);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II[FIIIFFIII)V")
	public static void method277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg4 - arg0;
		@Pc(9) int local9 = arg1 - arg7;
		@Pc(17) int local17 = arg8 - arg9;
		@Pc(38) float local38 = arg2[2] * (float) local5 + arg2[1] * (float) local17 + arg2[0] * (float) local9;
		@Pc(59) float local59 = (float) local5 * arg2[5] + arg2[3] * (float) local9 + arg2[4] * (float) local17;
		@Pc(80) float local80 = arg2[7] * (float) local17 + (float) local9 * arg2[6] + (float) local5 * arg2[8];
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg6 != 1.0F) {
			local91 *= arg6;
		}
		@Pc(105) float local105 = local59 + arg5 + 0.5F;
		@Pc(112) float local112;
		if (arg3 == 1) {
			local112 = local91;
			local91 = -local105;
			local105 = local112;
		} else if (arg3 == 2) {
			local105 = -local105;
			local91 = -local91;
		} else if (arg3 == 3) {
			local112 = local91;
			local91 = local105;
			local105 = -local112;
		}
		Static230.aFloat118 = local105;
		Static338.aFloat178 = local91;
	}
}
