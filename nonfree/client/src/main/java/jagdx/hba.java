package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/hba")
public final class hba extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/hba", name = "<init>", descriptor = "()V")
	public hba() {
	}

	@OriginalMember(owner = "client!jagdx/hba", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public hba(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
