import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!ds", name = "I", descriptor = "I")
	public static int anInt2365;

	@OriginalMember(owner = "client!ds", name = "v", descriptor = "I")
	public static int anInt2358 = 0;

	@OriginalMember(owner = "client!ds", name = "A", descriptor = "J")
	public static long aLong58 = 0L;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)Lclient!fr;")
	public static Class93 method2182() {
		try {
			return (Class93) Class.forName("Class93_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(13) Throwable local13) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZIIIIII)V")
	public static void method2183(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 >= anInt2358 && Static299.anInt4491 >= arg2 && arg0 >= Static92.anInt2338 && Static341.anInt6379 >= arg3) {
			if (arg4 == 1) {
				Static402.method7865(arg1, arg2, arg0, arg3, arg5);
			} else {
				Static326.method5321(arg5, arg0, arg1, arg2, arg4, arg3);
			}
		} else if (arg4 == 1) {
			Static521.method7434(arg1, arg3, arg0, arg2, arg5);
		} else {
			Static181.method3478(arg3, arg1, arg4, arg0, arg2, arg5);
		}
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)V")
	public static void method2184() {
		if (Static283.anInt5580 == 2) {
			Static318.anInt6040 = 96;
			return;
		}
		try {
			@Pc(22) Method local22 = Runtime.class.getMethod("maxMemory");
			if (local22 != null) {
				try {
					@Pc(26) Runtime local26 = Runtime.getRuntime();
					@Pc(32) Long local32 = (Long) local22.invoke(local26, (Object[]) null);
					Static318.anInt6040 = (int) (local32 / 1048576L) + 1;
				} catch (@Pc(42) Throwable local42) {
				}
			}
		} catch (@Pc(44) Exception local44) {
		}
	}
}
