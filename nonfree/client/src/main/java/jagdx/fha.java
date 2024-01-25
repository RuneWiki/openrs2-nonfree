package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/fha")
public final class fha extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/fha", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public fha(@OriginalArg(0) String arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/fha", name = "<init>", descriptor = "()V")
	public fha() {
	}
}
