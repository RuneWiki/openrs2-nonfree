import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "[I")
	public static final int[] anIntArray135 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)Lclient!bp;")
	public static Class3_Sub3 method1409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class270 local7 = Static309.aClass270ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass3_Sub3_3;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII)V")
	public static void method1411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = Static2.aClass148_Sub1_1.anInt3792 * arg1 >> 8;
		if (arg2 == -1 && !Static372.aBoolean448) {
			Static334.method4466();
		} else if (arg2 != -1 && (arg2 != Static246.anInt3968 || !Static208.method2800()) && local10 != 0 && !Static372.aBoolean448) {
			Static174.method2462(arg0, Static120.aClass54_36, local10, arg2);
		}
		Static246.anInt3968 = arg2;
	}
}
