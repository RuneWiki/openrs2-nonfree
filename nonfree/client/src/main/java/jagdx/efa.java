package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/efa")
public final class efa extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/efa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public efa(@OriginalArg(0) String arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/efa", name = "<init>", descriptor = "()V")
	public efa() {
	}
}
