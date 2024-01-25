package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/hl")
public final class hl extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/hl", name = "<init>", descriptor = "()V")
	public hl() {
	}

	@OriginalMember(owner = "client!jagdx/hl", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public hl(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
