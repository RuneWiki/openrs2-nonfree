package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/jw")
public final class jw extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/jw", name = "<init>", descriptor = "()V")
	public jw() {
	}

	@OriginalMember(owner = "client!jagdx/jw", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public jw(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
