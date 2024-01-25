package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/gh")
public final class gh extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/gh", name = "<init>", descriptor = "()V")
	public gh() {
	}

	@OriginalMember(owner = "client!jagdx/gh", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public gh(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
