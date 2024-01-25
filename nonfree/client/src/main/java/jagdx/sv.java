package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/sv")
public final class sv extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/sv", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public sv(@OriginalArg(0) String arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/sv", name = "<init>", descriptor = "()V")
	public sv() {
	}
}
