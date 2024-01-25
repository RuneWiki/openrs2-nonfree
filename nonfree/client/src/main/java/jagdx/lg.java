package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/lg")
public final class lg extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/lg", name = "<init>", descriptor = "()V")
	public lg() {
	}

	@OriginalMember(owner = "client!jagdx/lg", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public lg(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
