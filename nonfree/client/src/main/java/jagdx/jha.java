package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/jha")
public final class jha extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/jha", name = "<init>", descriptor = "()V")
	public jha() {
	}

	@OriginalMember(owner = "client!jagdx/jha", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public jha(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
