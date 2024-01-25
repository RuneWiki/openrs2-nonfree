package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/ue")
public final class ue {

	@OriginalMember(owner = "client!jagdx/ue", name = "a", descriptor = "(BI)Z")
	public static boolean a(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		return arg1 < 0;
	}

	@OriginalMember(owner = "client!jagdx/ue", name = "a", descriptor = "(IZ)Z")
	public static boolean a(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return arg0 >= 0;
	}
}
