package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/kh")
public final class kh extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/kh", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public kh(@OriginalArg(0) String arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/kh", name = "<init>", descriptor = "()V")
	public kh() {
	}
}
