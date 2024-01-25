package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/ow")
public final class ow extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/ow", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public ow(@OriginalArg(0) String arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/ow", name = "<init>", descriptor = "()V")
	public ow() {
	}
}
