import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "Lclient!dp;")
	public static Class53 aClass53_42;

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
	public static int anInt1612;

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)I")
	public static int method1481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(54) int local54 = Static94.method1713(arg1 - 1, arg0 + -1) + Static94.method1713(arg1 + 1, arg0 - 1) + Static94.method1713(arg1 - 1, arg0 - -1) + Static94.method1713(arg1 + 1, arg0 + 1);
		@Pc(85) int local85 = Static94.method1713(arg1 - 1, arg0) + Static94.method1713(arg1 + 1, arg0) + Static94.method1713(arg1, arg0 + -1) + Static94.method1713(arg1, arg0 - -1);
		@Pc(92) int local92 = Static94.method1713(arg1, arg0);
		return local54 / 16 + local85 / 8 + local92 / 4;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBIIIII)I")
	public static int method1482(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = arg3 & 0x3;
		if ((arg5 & 0x1) == 1) {
			@Pc(24) int local24 = arg1;
			arg1 = arg4;
			arg4 = local24;
		}
		if (local15 == 0) {
			return arg0;
		} else if (local15 == 1) {
			return 1 + 7 - arg1 - arg2;
		} else if (local15 == 2) {
			return 7 + 1 - arg0 - arg4;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1484(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static159.method3147("\n", "%0a", arg0));
	}
}
