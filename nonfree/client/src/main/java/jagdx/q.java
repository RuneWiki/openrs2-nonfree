package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/q")
public final class q extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/q", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public q(@OriginalArg(0) String arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/q", name = "<init>", descriptor = "()V")
	public q() {
	}
}
