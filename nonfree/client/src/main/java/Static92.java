import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_24 = new Class98(98, 6);

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)I")
	public static int method1385(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)V")
	public static void method1387(@OriginalArg(1) int arg0) {
		if (Static528.anIntArray643 == null || arg0 > Static528.anIntArray643.length) {
			Static528.anIntArray643 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method1388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(7) int local7 = arg2; local7 <= arg1; local7++) {
			for (@Pc(11) int local11 = arg3; local11 <= arg4; local11++) {
				if (arg0 == Static291.anIntArrayArray45[local7][local11] && Static129.anIntArrayArray17[local7][local11] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
