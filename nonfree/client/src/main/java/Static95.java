import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!ds", name = "A", descriptor = "I")
	public static int anInt2005;

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_64 = new Class235(7, -2);

	@OriginalMember(owner = "client!ds", name = "w", descriptor = "[I")
	public static final int[] anIntArray178 = new int[16];

	@OriginalMember(owner = "client!ds", name = "z", descriptor = "[I")
	public static int[] anIntArray179 = new int[1];

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
	public static void method1633() {
		Static136.aClass187_13.method3801();
		Static106.aClass125_5.method2420();
		Static264.aClass125_7.method2420();
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIZI)V")
	public static void method1634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 - arg1;
		@Pc(14) int local14 = arg2 - arg3;
		if (local14 == 0) {
			if (local10 != 0) {
				Static274.method268(arg4, arg1, arg3, arg0);
			}
		} else if (local10 == 0) {
			Static75.method7416(arg3, arg4, arg1, arg2);
		} else {
			if (local14 < 0) {
				local14 = -local14;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(63) boolean local63 = local10 > local14;
			@Pc(67) int local67;
			@Pc(69) int local69;
			if (local63) {
				local67 = arg3;
				local69 = arg2;
				arg3 = arg1;
				arg1 = local67;
				arg2 = arg0;
				arg0 = local69;
			}
			if (arg2 < arg3) {
				local67 = arg3;
				arg3 = arg2;
				local69 = arg1;
				arg1 = arg0;
				arg2 = local67;
				arg0 = local69;
			}
			local67 = arg1;
			local69 = arg2 - arg3;
			@Pc(107) int local107 = arg0 - arg1;
			@Pc(112) int local112 = -(local69 >> 1);
			@Pc(119) int local119 = arg0 > arg1 ? 1 : -1;
			if (local107 < 0) {
				local107 = -local107;
			}
			@Pc(131) int local131;
			if (local63) {
				for (local131 = arg3; local131 <= arg2; local131++) {
					Static171.anIntArrayArray79[local131][local67] = arg4;
					local112 += local107;
					if (local112 > 0) {
						local67 += local119;
						local112 -= local69;
					}
				}
			} else {
				for (local131 = arg3; local131 <= arg2; local131++) {
					local112 += local107;
					Static171.anIntArrayArray79[local67][local131] = arg4;
					if (local112 > 0) {
						local112 -= local69;
						local67 += local119;
					}
				}
			}
		}
	}
}
