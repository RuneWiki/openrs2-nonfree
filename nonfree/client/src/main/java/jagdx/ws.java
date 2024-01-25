package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/ws")
public final class ws extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/ws", name = "<init>", descriptor = "()V")
	public ws() {
	}

	@OriginalMember(owner = "client!jagdx/ws", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public ws(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
