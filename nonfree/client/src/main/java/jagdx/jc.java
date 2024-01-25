package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/jc")
public final class jc extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/jc", name = "<init>", descriptor = "()V")
	public jc() {
	}

	@OriginalMember(owner = "client!jagdx/jc", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public jc(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
