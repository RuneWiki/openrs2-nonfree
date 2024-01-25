import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static90 {

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "Lclient!q;")
	public static Class34 aClass34_8;

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
	public static int anInt1535;

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
	public static int anInt1536 = 0;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)Z")
	public static boolean method1435(@OriginalArg(0) int arg0) {
		if (arg0 == 17 || arg0 == 45 || arg0 == 44 || arg0 == 8 || arg0 == 1012) {
			return true;
		} else {
			return arg0 == 16 || arg0 == 1006;
		}
	}
}
