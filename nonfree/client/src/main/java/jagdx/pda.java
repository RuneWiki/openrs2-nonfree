package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/pda")
public final class pda {

	@OriginalMember(owner = "client!jagdx/pda", name = "a", descriptor = "(II)Z")
	public static boolean a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= 0;
	}

	@OriginalMember(owner = "client!jagdx/pda", name = "b", descriptor = "(II)Z")
	public static boolean b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 < 0;
	}
}
