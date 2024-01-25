package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/tb")
public final class tb extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/tb", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public tb(@OriginalArg(0) String arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/tb", name = "<init>", descriptor = "()V")
	public tb() {
	}
}
