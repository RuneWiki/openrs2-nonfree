import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static9 {

	@OriginalMember(owner = "client!af", name = "o", descriptor = "I")
	public static int anInt129 = -1;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I")
	public static int method130(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
