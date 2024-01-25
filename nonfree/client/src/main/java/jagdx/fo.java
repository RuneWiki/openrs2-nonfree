package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/fo")
public final class fo {

	@OriginalMember(owner = "client!jagdx/fo", name = "a", descriptor = "(IZ)Z")
	public static boolean a(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return arg0 < 0;
	}

	@OriginalMember(owner = "client!jagdx/fo", name = "a", descriptor = "(IB)Z")
	public static boolean a(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return arg0 >= 0;
	}
}
