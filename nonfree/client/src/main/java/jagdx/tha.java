package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/tha")
public final class tha extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/tha", name = "<init>", descriptor = "()V")
	public tha() {
	}

	@OriginalMember(owner = "client!jagdx/tha", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public tha(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
