package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/ct")
public final class ct extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/ct", name = "<init>", descriptor = "()V")
	public ct() {
	}

	@OriginalMember(owner = "client!jagdx/ct", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public ct(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
