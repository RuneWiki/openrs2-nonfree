package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/dga")
public final class dga extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/dga", name = "<init>", descriptor = "()V")
	public dga() {
	}

	@OriginalMember(owner = "client!jagdx/dga", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public dga(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
