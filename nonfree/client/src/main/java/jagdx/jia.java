package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/jia")
public final class jia extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/jia", name = "<init>", descriptor = "()V")
	public jia() {
	}

	@OriginalMember(owner = "client!jagdx/jia", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public jia(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
