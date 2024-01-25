package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/fda")
public final class fda extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/fda", name = "<init>", descriptor = "()V")
	public fda() {
	}

	@OriginalMember(owner = "client!jagdx/fda", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public fda(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
