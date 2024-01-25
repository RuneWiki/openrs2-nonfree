package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/ln")
public final class ln extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/ln", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public ln(@OriginalArg(0) String arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/ln", name = "<init>", descriptor = "()V")
	public ln() {
	}
}
