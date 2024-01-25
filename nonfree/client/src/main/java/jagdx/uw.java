package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/uw")
public final class uw extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/uw", name = "<init>", descriptor = "()V")
	public uw() {
	}

	@OriginalMember(owner = "client!jagdx/uw", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public uw(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
