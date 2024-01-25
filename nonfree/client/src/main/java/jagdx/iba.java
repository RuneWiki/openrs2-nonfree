package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/iba")
public final class iba extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/iba", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public iba(@OriginalArg(0) String arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/iba", name = "<init>", descriptor = "()V")
	public iba() {
	}
}
