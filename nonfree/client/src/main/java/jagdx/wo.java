package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/wo")
public final class wo extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/wo", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public wo(@OriginalArg(0) String arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/wo", name = "<init>", descriptor = "()V")
	public wo() {
	}
}
