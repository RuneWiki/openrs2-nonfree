package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/mk")
public final class mk {

	@OriginalMember(owner = "client!jagdx/mk", name = "a", descriptor = "(II)Z")
	public static boolean a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 < 0;
	}

	@OriginalMember(owner = "client!jagdx/mk", name = "b", descriptor = "(II)Z")
	public static boolean b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= 0;
	}
}
