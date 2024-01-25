package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/bl")
public final class bl extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/bl", name = "<init>", descriptor = "()V")
	public bl() {
	}

	@OriginalMember(owner = "client!jagdx/bl", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public bl(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
