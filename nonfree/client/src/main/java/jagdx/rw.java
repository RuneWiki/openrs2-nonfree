package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/rw")
public final class rw extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/rw", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public rw(@OriginalArg(0) String arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/rw", name = "<init>", descriptor = "()V")
	public rw() {
	}
}
