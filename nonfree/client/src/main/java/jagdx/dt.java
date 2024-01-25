package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/dt")
public final class dt {

	@OriginalMember(owner = "client!jagdx/dt", name = "a", descriptor = "(II)Z")
	public static boolean a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= 0;
	}

	@OriginalMember(owner = "client!jagdx/dt", name = "a", descriptor = "(BI)Z")
	public static boolean a(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		return arg1 < 0;
	}
}
