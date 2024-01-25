package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/hb")
public final class hb {

	@OriginalMember(owner = "client!jagdx/hb", name = "a", descriptor = "(IB)Z")
	public static boolean a(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return arg0 >= 0;
	}

	@OriginalMember(owner = "client!jagdx/hb", name = "b", descriptor = "(IB)Z")
	public static boolean b(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return arg0 < 0;
	}
}
