package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/rl")
public final class rl extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/rl", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public rl(@OriginalArg(0) String arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/rl", name = "<init>", descriptor = "()V")
	public rl() {
	}
}
