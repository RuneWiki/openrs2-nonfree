import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!df", name = "a", descriptor = "I")
	public static int anInt2199;

	@OriginalMember(owner = "client!df", name = "c", descriptor = "[I")
	public static int[] anIntArray178;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "F")
	public static float aFloat73;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "I")
	public static int anInt2201 = -1;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!qa;Lclient!oa;ILclient!jj;ILclient!bc;II)V")
	public static void method2081(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub25 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class24 arg5, @OriginalArg(6) int arg6) {
		@Pc(12) int local12 = arg3.anInt4559 - arg2 / 2 - 5;
		@Pc(16) int local16 = arg4 + 2;
		if (arg5.anInt1146 != 0) {
			arg0.method7632(local12, arg5.anInt1146, arg2 + 10, -local16 + (arg4 - (-(arg6 * arg1.method5452()) + -1)), local16);
		}
		if (arg5.anInt1149 != 0) {
			arg0.method7599(arg4 + arg1.method5452() * arg6 + 1 - local16, arg2 + 10, arg5.anInt1149, local12, local16);
		}
		@Pc(71) int local71 = arg5.anInt1172;
		if (arg3.aBoolean277 && arg5.anInt1151 != -1) {
			local71 = arg5.anInt1151;
		}
		for (@Pc(83) int local83 = 0; local83 < arg6; local83++) {
			@Pc(88) String local88 = Static294.aStringArray22[local83];
			if (arg6 - 1 > local83) {
				local88 = local88.substring(0, local88.length() - 4);
			}
			arg1.method5454(arg0, local88, arg3.anInt4559, arg4, local71);
			arg4 += arg1.method5452();
		}
	}
}
