package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/sh")
public final class sh extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/sh", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public sh(@OriginalArg(0) String arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/sh", name = "<init>", descriptor = "()V")
	public sh() {
	}
}
