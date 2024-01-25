package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/oo")
public final class oo {

	@OriginalMember(owner = "client!jagdx/oo", name = "a", descriptor = "(ZI)Z")
	public static boolean a(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		return arg1 >= 0;
	}

	@OriginalMember(owner = "client!jagdx/oo", name = "a", descriptor = "(BI)Z")
	public static boolean a(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		return arg1 < 0;
	}
}
