package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/fh")
public final class fh extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/fh", name = "<init>", descriptor = "()V")
	public fh() {
	}

	@OriginalMember(owner = "client!jagdx/fh", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public fh(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
