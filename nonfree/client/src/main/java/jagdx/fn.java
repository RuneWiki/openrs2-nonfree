package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/fn")
public final class fn extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/fn", name = "<init>", descriptor = "()V")
	public fn() {
	}

	@OriginalMember(owner = "client!jagdx/fn", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public fn(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
