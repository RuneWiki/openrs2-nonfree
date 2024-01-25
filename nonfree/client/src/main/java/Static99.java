import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!e", name = "q", descriptor = "I")
	public static int anInt5668;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "[I")
	public static final int[] anIntArray456 = new int[3];

	@OriginalMember(owner = "client!e", name = "l", descriptor = "[J")
	public static final long[] aLongArray18 = new long[32];

	@OriginalMember(owner = "client!e", name = "n", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_181 = new Class235(81, 3);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIII)V")
	public static void method4651(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg0 - arg4;
		@Pc(18) int local18 = arg4 + arg3;
		for (@Pc(20) int local20 = arg3; local20 < local18; local20++) {
			Static433.method6039(arg1, arg5, Static171.anIntArrayArray79[local20], arg2);
		}
		@Pc(38) int local38 = arg5 - arg4;
		for (@Pc(40) int local40 = arg0; local40 > local10; local40--) {
			Static433.method6039(arg1, arg5, Static171.anIntArrayArray79[local40], arg2);
		}
		@Pc(58) int local58 = arg4 + arg2;
		for (@Pc(60) int local60 = local18; local60 <= local10; local60++) {
			@Pc(66) int[] local66 = Static171.anIntArrayArray79[local60];
			Static433.method6039(arg1, local58, local66, arg2);
			Static433.method6039(arg1, arg5, local66, local38);
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
	public static void method4653() {
		Static145.method2157();
		for (@Pc(12) int local12 = 0; local12 < 4; local12++) {
			Static478.aClass59Array2[local12].method1192();
		}
		Static376.method5050();
		Static283.method3948();
		System.gc();
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(Z)Lclient!dw;")
	public static Class78 method4654() {
		try {
			return (Class78) Class.forName("Class78_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
