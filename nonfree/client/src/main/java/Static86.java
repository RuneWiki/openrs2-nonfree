import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static86 {

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IB)I")
	public static int method1256(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static117.method1727(arg0);
	}
}
