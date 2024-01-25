package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/pq")
public final class pq extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/pq", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public pq(@OriginalArg(0) String arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/pq", name = "<init>", descriptor = "()V")
	public pq() {
	}
}
