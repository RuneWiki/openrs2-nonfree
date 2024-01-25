package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/pea")
public final class pea extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/pea", name = "<init>", descriptor = "()V")
	public pea() {
	}

	@OriginalMember(owner = "client!jagdx/pea", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public pea(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
