package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/p")
public class p {

	@OriginalMember(owner = "client!jagdx/p", name = "p", descriptor = "I")
	private static final int anInt4137 = 2166;

	@OriginalMember(owner = "client!jagdx/p", name = "c", descriptor = "I")
	public static final int anInt4138 = 0;

	@OriginalMember(owner = "client!jagdx/p", name = "v", descriptor = "I")
	public static final int anInt4139 = -2005530519;

	@OriginalMember(owner = "client!jagdx/p", name = "l", descriptor = "I")
	public static final int anInt4140 = 1;

	@OriginalMember(owner = "client!jagdx/p", name = "<init>", descriptor = "()V", line = 13)
	private p() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!jagdx/p", name = "p", descriptor = "(I)Z", line = 18)
	public static final boolean method27707(@OriginalArg(0) int arg0) {
		return arg0 < 0;
	}

	@OriginalMember(owner = "client!jagdx/p", name = "v", descriptor = "(I)Z", line = 18)
	public static final boolean method27708(@OriginalArg(0) int arg0) {
		return arg0 < 0;
	}

	@OriginalMember(owner = "client!jagdx/p", name = "l", descriptor = "(I)Z", line = 18)
	public static final boolean method27709(@OriginalArg(0) int arg0) {
		return arg0 < 0;
	}

	@OriginalMember(owner = "client!jagdx/p", name = "c", descriptor = "(I)Z", line = 22)
	public static final boolean method27710(@OriginalArg(0) int arg0) {
		return arg0 >= 0;
	}
}
