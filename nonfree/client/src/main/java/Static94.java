import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "Lclient!ir;")
	public static Class11_Sub1_Sub3_Sub2 aClass11_Sub1_Sub3_Sub2_1;

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
	public static int anInt1263;

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
	public static int anInt1261 = 0;

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "Lclient!le;")
	public static Class148 aClass148_3 = null;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIZ)I")
	public static int method1109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 / arg2;
		@Pc(13) int local13 = arg0 & arg2 - 1;
		@Pc(17) int local17 = arg1 / arg2;
		@Pc(28) int local28 = arg1 & arg2 - 1;
		@Pc(33) int local33 = Static445.method5630(local17, local7);
		@Pc(40) int local40 = Static445.method5630(local17, local7 + 1);
		@Pc(47) int local47 = Static445.method5630(local17 + 1, local7);
		@Pc(56) int local56 = Static445.method5630(local17 + 1, local7 + 1);
		@Pc(63) int local63 = Static240.method3456(arg2, local13, local40, local33);
		@Pc(70) int local70 = Static240.method3456(arg2, local13, local56, local47);
		return Static240.method3456(arg2, local28, local70, local63);
	}
}
