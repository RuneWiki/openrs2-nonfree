import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!ik", name = "K", descriptor = "Lclient!ia;")
	public static Class51 aClass51_652 = Static64.method1101("blaugr-Un:");

	@OriginalMember(owner = "client!ik", name = "L", descriptor = "Lclient!ia;")
	private static Class51 aClass51_653 = Static64.method1101("World");

	@OriginalMember(owner = "client!ik", name = "O", descriptor = "Lclient!ia;")
	public static Class51 aClass51_655 = aClass51_653;

	@OriginalMember(owner = "client!ik", name = "P", descriptor = "Lclient!ia;")
	public static Class51 aClass51_656 = Static64.method1101("AUS");

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!ia;Z)Z")
	public static boolean method1527(@OriginalArg(0) Class51 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static113.anInt2474; local16++) {
			if (arg0.method1401(Static7.aClass51Array1[local16])) {
				return true;
			}
		}
		return false;
	}
}
