package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/wea")
public final class wea extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/wea", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public wea(@OriginalArg(0) String arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/wea", name = "<init>", descriptor = "()V")
	public wea() {
	}
}
