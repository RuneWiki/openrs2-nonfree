package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/mc")
public final class mc extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/mc", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public mc(@OriginalArg(0) String arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/mc", name = "<init>", descriptor = "()V")
	public mc() {
	}
}
