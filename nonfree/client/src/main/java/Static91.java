import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "Lclient!tq;")
	public static Class191 aClass191_59;

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "J")
	public static long aLong58 = 0L;

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "Lclient!wq;")
	public static final Class216 aClass216_22 = new Class216();

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIII)V")
	public static void method2096(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg0 - arg4;
		@Pc(14) int local14 = arg4 + arg2;
		for (@Pc(16) int local16 = arg2; local16 < local14; local16++) {
			Static205.method3670(arg3, arg1, Static146.anIntArrayArray91[local16], arg5);
		}
		@Pc(37) int local37 = arg1 - arg4;
		for (@Pc(49) int local49 = arg0; local49 > local10; local49--) {
			Static205.method3670(arg3, arg1, Static146.anIntArrayArray91[local49], arg5);
		}
		@Pc(67) int local67 = arg4 + arg5;
		for (@Pc(69) int local69 = local14; local69 <= local10; local69++) {
			@Pc(75) int[] local75 = Static146.anIntArrayArray91[local69];
			Static205.method3670(arg3, local67, local75, arg5);
			Static205.method3670(arg3, arg1, local75, local37);
		}
	}
}
