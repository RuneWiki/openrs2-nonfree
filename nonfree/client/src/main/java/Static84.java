import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "Lclient!ia;")
	private static Class51 aClass51_621 = Static64.method1101(" from your friend list first)3");

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "Lclient!ia;")
	public static Class51 aClass51_620 = aClass51_621;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
	public static int anInt1961 = 127;

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "S")
	public static short aShort9 = 320;

	@OriginalMember(owner = "client!ic", name = "s", descriptor = "[I")
	public static int[] anIntArray124 = new int[100];

	@OriginalMember(owner = "client!ic", name = "t", descriptor = "Lclient!ia;")
	public static Class51 aClass51_622 = Static64.method1101(":duelfriend:");

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)Lclient!mj;")
	public static Class1_Sub2_Sub13 method1464(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub13 local10 = (Class1_Sub2_Sub13) Static81.aClass123_5.method3640((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = Static51.aClass70_15.method3509(arg0 & 0x7FFF, 1);
		} else {
			local27 = Static59.aClass70_16.method3509(arg0, 1);
		}
		local10 = new Class1_Sub2_Sub13();
		if (local27 != null) {
			local10.method2282(new Class1_Sub16(local27));
		}
		if (arg0 >= 32768) {
			local10.method2284();
		}
		Static81.aClass123_5.method3644(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method1468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}
}
