import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray6 = new boolean[200];

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "Z")
	public static boolean aBoolean108 = false;

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray7 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "[I")
	public static final int[] anIntArray82 = new int[3];

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIZZ)I")
	public static int method1327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class3_Sub21 local8 = Static586.method7782(arg1, arg2);
		if (local8 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray174.length) {
			return local8.anIntArray174[arg0];
		} else {
			return -1;
		}
	}
}
