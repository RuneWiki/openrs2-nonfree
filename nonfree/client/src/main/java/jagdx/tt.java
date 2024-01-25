package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/tt")
public final class tt extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/tt", name = "<init>", descriptor = "()V")
	public tt() {
	}

	@OriginalMember(owner = "client!jagdx/tt", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public tt(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
