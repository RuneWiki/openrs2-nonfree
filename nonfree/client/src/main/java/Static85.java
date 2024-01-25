import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static85 {

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "F")
	public static float aFloat53;

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray9 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
	public static int anInt2172 = 0;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method1799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == arg4) {
			Static508.method7064(arg1, arg6, arg2, arg3, arg5, arg0);
		} else if (arg5 - arg1 >= Static566.anInt9279 && arg5 + arg1 <= Static392.anInt6753 && arg6 - arg4 >= Static346.anInt5494 && Static640.anInt10333 >= arg6 + arg4) {
			Static20.method554(arg2, arg3, arg1, arg6, arg0, arg4, arg5);
		} else {
			Static328.method4991(arg4, arg2, arg3, arg0, arg5, arg6, arg1);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IZ)Z")
	public static boolean method1801(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}
}
