package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/theora/TheoraComment")
public class TheoraComment extends SimplePeer {

	@OriginalMember(owner = "client!jagtheora/theora/TheoraComment", name = "<init>", descriptor = "()V", line = 10)
	public TheoraComment() {
		this.init();
		if (this.method25191()) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!jagtheora/theora/TheoraComment", name = "init", descriptor = "()V")
	private native void init();

	@OriginalMember(owner = "client!jagtheora/theora/TheoraComment", name = "clear", descriptor = "()V")
	protected native void clear();

	@OriginalMember(owner = "client!jagtheora/theora/TheoraComment", name = "h", descriptor = "()V")
	protected native void h();

	@OriginalMember(owner = "client!jagtheora/theora/TheoraComment", name = "x", descriptor = "()V")
	protected native void x();
}
