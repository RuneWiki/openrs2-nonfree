package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/ica")
public final class ica {

	@OriginalMember(owner = "client!jagdx/ica", name = "a", descriptor = "(II)Z")
	public static boolean a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 < 0;
	}

	@OriginalMember(owner = "client!jagdx/ica", name = "b", descriptor = "(II)Z")
	public static boolean b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 >= 0;
	}
}
