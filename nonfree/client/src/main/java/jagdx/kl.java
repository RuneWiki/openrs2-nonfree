package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/kl")
public final class kl extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/kl", name = "<init>", descriptor = "()V")
	public kl() {
	}

	@OriginalMember(owner = "client!jagdx/kl", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public kl(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
