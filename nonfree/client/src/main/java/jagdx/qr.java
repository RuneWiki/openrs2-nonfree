package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/qr")
public final class qr {

	@OriginalMember(owner = "client!jagdx/qr", name = "a", descriptor = "(ZI)Z")
	public static boolean a(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		return arg1 < 0;
	}

	@OriginalMember(owner = "client!jagdx/qr", name = "a", descriptor = "(II)Z")
	public static boolean a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= 0;
	}
}
