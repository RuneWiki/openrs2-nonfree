import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!dd", name = "J", descriptor = "F")
	public static float aFloat50;

	@OriginalMember(owner = "client!dd", name = "I", descriptor = "Lclient!il;")
	public static final Class162 aClass162_12 = new Class162(8);

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZIIIIII)Z")
	public static boolean method1347(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = arg4 + arg5;
		@Pc(18) int local18 = arg3 + arg1;
		@Pc(22) int local22 = arg0 + arg2;
		if (!Static56.method937(local18, local18, local22, arg2, local22, local13, local18, arg4, arg4)) {
			return false;
		} else if (Static56.method937(local18, local18, local22, arg2, arg2, local13, local18, local13, arg4)) {
			if (Static96.anInt2029 <= arg4) {
				if (!Static56.method937(local18, local18, local22, local22, arg2, local13, arg3, local13, local13)) {
					return false;
				}
				if (!Static56.method937(local18, arg3, arg2, local22, arg2, local13, arg3, local13, local13)) {
					return false;
				}
			} else if (!Static56.method937(local18, local18, local22, local22, arg2, arg4, arg3, arg4, arg4)) {
				return false;
			} else if (!Static56.method937(local18, arg3, arg2, local22, arg2, arg4, arg3, arg4, arg4)) {
				return false;
			}
			if (Static497.anInt8373 > arg2) {
				if (!Static56.method937(local18, local18, arg2, arg2, arg2, local13, arg3, arg4, arg4)) {
					return false;
				}
				if (!Static56.method937(local18, arg3, arg2, arg2, arg2, local13, arg3, local13, arg4)) {
					return false;
				}
			} else if (!Static56.method937(local18, local18, local22, local22, local22, local13, arg3, arg4, arg4)) {
				return false;
			} else if (!Static56.method937(local18, arg3, local22, local22, local22, local13, arg3, local13, arg4)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "(I)V")
	public static void method1348() {
		Static338.anInt6210 = 0;
		Static164.anInt3484 = 0;
		Static35.anInt905 = 0;
		Static517.anInt8582 = 0;
	}
}
