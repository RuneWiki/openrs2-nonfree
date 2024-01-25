import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static98 {

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
	public static int anInt2031 = 0;

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
	public static int anInt2032 = -1;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1485(@OriginalArg(1) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)Z")
	public static boolean method1487(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
