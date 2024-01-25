package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/rm")
public final class rm extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/rm", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public rm(@OriginalArg(0) String arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/rm", name = "<init>", descriptor = "()V")
	public rm() {
	}
}
