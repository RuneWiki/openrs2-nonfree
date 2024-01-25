package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/bm")
public final class bm extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/bm", name = "<init>", descriptor = "()V")
	public bm() {
	}

	@OriginalMember(owner = "client!jagdx/bm", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public bm(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
