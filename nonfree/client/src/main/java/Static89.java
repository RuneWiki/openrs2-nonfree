import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
	public static int anInt1663 = 0;

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "[I")
	public static int[] anIntArray159 = new int[64];

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIII)I")
	public static int method1357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 1023 - arg2;
		} else if (local3 == 2) {
			return 1023 - arg1;
		} else {
			return arg2;
		}
	}
}
