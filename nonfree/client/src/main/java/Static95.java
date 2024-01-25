import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!dh", name = "s", descriptor = "[I")
	public static final int[] anIntArray80 = new int[25];

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZIIII)Z")
	public static boolean method1998(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg4; local7 <= arg2; local7++) {
			for (@Pc(11) int local11 = arg3; local11 <= arg1; local11++) {
				if (Static212.anIntArrayArray58[local7][local11] == arg0 && Static348.anIntArrayArray32[local7][local11] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIII)V")
	public static void method1999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static348.aClass3_Sub51_Sub1_5.anInt9949 != 0 && arg1 != 0 && Static345.anInt6219 < 50 && arg4 != -1) {
			Static73.aClass367Array4[Static345.anInt6219++] = new Class367((byte) 1, arg4, arg1, arg0, arg5, arg2, arg3, null);
		}
	}
}
