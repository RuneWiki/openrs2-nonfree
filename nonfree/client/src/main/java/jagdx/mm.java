package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/mm")
public final class mm extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/mm", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public mm(@OriginalArg(0) String arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/mm", name = "<init>", descriptor = "()V")
	public mm() {
	}
}
