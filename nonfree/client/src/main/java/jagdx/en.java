package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/en")
public final class en extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/en", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public en(@OriginalArg(0) String arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/en", name = "<init>", descriptor = "()V")
	public en() {
	}
}
