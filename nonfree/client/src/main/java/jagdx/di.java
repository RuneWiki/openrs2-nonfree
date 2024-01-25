package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/di")
public final class di extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/di", name = "<init>", descriptor = "()V")
	public di() {
	}

	@OriginalMember(owner = "client!jagdx/di", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public di(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
