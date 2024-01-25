package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/oea")
public final class oea extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/oea", name = "<init>", descriptor = "()V")
	public oea() {
	}

	@OriginalMember(owner = "client!jagdx/oea", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public oea(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
