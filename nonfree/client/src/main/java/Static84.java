import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!cla", name = "j", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_30 = new Class397(11, -1);

	@OriginalMember(owner = "client!cla", name = "a", descriptor = "(III)Lclient!ija;")
	public static Class181 method1819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class364 local7 = Static448.aClass364ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass181_3;
	}

	@OriginalMember(owner = "client!cla", name = "a", descriptor = "(IIBIIII)Z")
	public static boolean method1820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg2 + arg3;
		@Pc(11) int local11 = arg5 + arg4;
		@Pc(15) int local15 = arg0 + arg1;
		if (!Static574.method7434(local11, local11, local7, arg3, local15, arg0, arg3, local11, local15)) {
			return false;
		} else if (Static574.method7434(local11, local11, local7, arg3, arg0, arg0, local7, local11, local15)) {
			if (arg3 < Static142.anInt2646) {
				if (!Static574.method7434(arg5, local11, arg3, arg3, arg0, local15, arg3, local11, local15)) {
					return false;
				}
				if (!Static574.method7434(arg5, local11, arg3, arg3, arg0, local15, arg3, arg5, arg0)) {
					return false;
				}
			} else if (!Static574.method7434(arg5, local11, local7, local7, arg0, local15, local7, local11, local15)) {
				return false;
			} else if (!Static574.method7434(arg5, local11, local7, local7, arg0, local15, local7, arg5, arg0)) {
				return false;
			}
			if (arg0 < Static664.anInt10179) {
				if (!Static574.method7434(arg5, local11, local7, arg3, arg0, arg0, arg3, local11, arg0)) {
					return false;
				}
				if (!Static574.method7434(arg5, local11, local7, arg3, arg0, arg0, local7, arg5, arg0)) {
					return false;
				}
			} else if (!Static574.method7434(arg5, local11, local7, arg3, local15, local15, arg3, local11, local15)) {
				return false;
			} else if (!Static574.method7434(arg5, local11, local7, arg3, local15, local15, local7, arg5, local15)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}
