package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/mo")
public final class mo {

	@OriginalMember(owner = "client!jagdx/mo", name = "a", descriptor = "(II)Z")
	public static boolean a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 < 0;
	}

	@OriginalMember(owner = "client!jagdx/mo", name = "b", descriptor = "(II)Z")
	public static boolean b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= 0;
	}
}
