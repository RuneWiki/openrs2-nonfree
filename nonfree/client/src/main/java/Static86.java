import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
	public static int anInt1928;

	@OriginalMember(owner = "client!dk", name = "m", descriptor = "F")
	public static float aFloat43;

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "[I")
	public static int[] anIntArray131 = new int[1];

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILclient!vv;)V")
	public static void method1835(@OriginalArg(1) Class1_Sub4 arg0) {
		arg0.aBoolean691 = false;
		if (arg0.aClass1_Sub30_5 != null) {
			arg0.aClass1_Sub30_5.anInt5919 = 0;
		}
		for (@Pc(18) Class1_Sub4 local18 = arg0.method7983(); local18 != null; local18 = arg0.method7984()) {
			method1835(local18);
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(II[FFIIFIBII)V")
	public static void method1836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(9) int local9 = arg8 - arg0;
		@Pc(13) int local13 = arg7 - arg4;
		@Pc(17) int local17 = arg5 - arg9;
		@Pc(38) float local38 = (float) local13 * arg2[2] + (float) local17 * arg2[1] + arg2[0] * (float) local9;
		@Pc(59) float local59 = (float) local13 * arg2[5] + (float) local17 * arg2[4] + arg2[3] * (float) local9;
		@Pc(80) float local80 = (float) local13 * arg2[8] + arg2[7] * (float) local17 + arg2[6] * (float) local9;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg6 != 1.0F) {
			local91 *= arg6;
		}
		@Pc(105) float local105 = local59 + arg3 + 0.5F;
		@Pc(117) float local117;
		if (arg1 == 1) {
			local117 = local91;
			local91 = -local105;
			local105 = local117;
		} else if (arg1 == 2) {
			local91 = -local91;
			local105 = -local105;
		} else if (arg1 == 3) {
			local117 = local91;
			local91 = local105;
			local105 = -local117;
		}
		Static7.aFloat5 = local91;
		Static186.aFloat81 = local105;
	}
}
