import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIIIB)V")
	public static void method7340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int local10;
		if (arg0 <= arg2) {
			for (local10 = arg0; local10 < arg2; local10++) {
				Static570.anIntArrayArray100[local10][arg1] = arg3;
			}
		} else {
			for (local10 = arg2; local10 < arg0; local10++) {
				Static570.anIntArrayArray100[local10][arg1] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(II)I")
	public static int method7341(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
