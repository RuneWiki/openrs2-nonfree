package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/lq")
public final class lq extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/lq", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public lq(@OriginalArg(0) String arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/lq", name = "<init>", descriptor = "()V")
	public lq() {
	}
}
