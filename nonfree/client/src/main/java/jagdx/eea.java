package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/eea")
public final class eea extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/eea", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public eea(@OriginalArg(0) String arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/eea", name = "<init>", descriptor = "()V")
	public eea() {
	}
}
