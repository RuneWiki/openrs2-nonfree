package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/theora/TheoraComment")
public final class TheoraComment extends SimplePeer {

	@OriginalMember(owner = "client!jagtheora/theora/TheoraComment", name = "<init>", descriptor = "()V")
	public TheoraComment() {
		this.init();
		if (this.a()) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!jagtheora/theora/TheoraComment", name = "clear", descriptor = "()V")
	protected native void clear();

	@OriginalMember(owner = "client!jagtheora/theora/TheoraComment", name = "init", descriptor = "()V")
	protected native void init();
}
