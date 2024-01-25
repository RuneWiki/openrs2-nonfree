package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/pl")
public final class pl extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/pl", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public pl(@OriginalArg(0) String arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/pl", name = "<init>", descriptor = "()V")
	public pl() {
	}
}
