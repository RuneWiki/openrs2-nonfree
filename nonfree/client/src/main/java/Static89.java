import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "Lclient!ov;")
	public static Class226 aClass226_2;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_25 = new Class306("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_84 = new Class296(1, 15);

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(FIFIIII[FBII)V")
	public static void method1541(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(13) int local13 = arg4 - arg5;
		@Pc(21) int local21 = arg8 - arg1;
		@Pc(25) int local25 = arg9 - arg6;
		@Pc(46) float local46 = (float) local25 * arg7[2] + arg7[0] * (float) local21 + arg7[1] * (float) local13;
		@Pc(67) float local67 = (float) local25 * arg7[5] + (float) local13 * arg7[4] + arg7[3] * (float) local21;
		@Pc(88) float local88 = (float) local21 * arg7[6] + arg7[7] * (float) local13 + arg7[8] * (float) local25;
		@Pc(99) float local99 = (float) Math.atan2((double) local46, (double) local88) / 6.2831855F + 0.5F;
		if (arg2 != 1.0F) {
			local99 *= arg2;
		}
		@Pc(113) float local113 = local67 + arg0 + 0.5F;
		@Pc(124) float local124;
		if (arg3 == 1) {
			local124 = local99;
			local99 = -local113;
			local113 = local124;
		} else if (arg3 == 2) {
			local99 = -local99;
			local113 = -local113;
		} else if (arg3 == 3) {
			local124 = local99;
			local99 = local113;
			local113 = -local124;
		}
		Static110.aFloat19 = local99;
		Static274.aFloat105 = local113;
	}
}
