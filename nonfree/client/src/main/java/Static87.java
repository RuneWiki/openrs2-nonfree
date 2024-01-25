import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIZI)I")
	public static int method1654(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class6_Sub49 local10 = Static84.method1640(arg2, arg1);
		if (local10 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(21) int local21 = 0;
			for (@Pc(23) int local23 = 0; local23 < local10.anIntArray696.length; local23++) {
				if (arg0 == local10.anIntArray697[local23]) {
					local21 += local10.anIntArray696[local23];
				}
			}
			return local21;
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BI)Z")
	public static boolean method1655(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
