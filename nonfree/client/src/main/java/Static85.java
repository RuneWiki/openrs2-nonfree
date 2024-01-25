import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!da", name = "q", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_112 = new Class71(83, 10);

	@OriginalMember(owner = "client!da", name = "t", descriptor = "I")
	public static int anInt8479 = 0;

	@OriginalMember(owner = "client!da", name = "w", descriptor = "[I")
	public static final int[] anIntArray454 = new int[256];

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIII)V")
	public static void method6995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(11) int local11 = arg1; local11 <= arg3; local11++) {
			Static36.method1264(Static632.anIntArrayArray65[local11], arg2, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)Z")
	public static boolean method7007(@OriginalArg(1) int arg0) {
		if (arg0 == 20 || arg0 == 46 || arg0 == 10 || arg0 == 19 || arg0 == 1009) {
			return true;
		} else {
			return arg0 == 50 || arg0 == 1003;
		}
	}
}
