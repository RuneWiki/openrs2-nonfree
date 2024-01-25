package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/bs")
public final class bs extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/bs", name = "<init>", descriptor = "()V")
	public bs() {
	}

	@OriginalMember(owner = "client!jagdx/bs", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public bs(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
