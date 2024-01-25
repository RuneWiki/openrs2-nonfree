import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static89 {

	@OriginalMember(owner = "client!dfa", name = "k", descriptor = "[I")
	public static final int[] anIntArray164 = new int[32];

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BI)I")
	public static int method1582(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
