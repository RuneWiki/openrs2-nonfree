package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/vorbis/VorbisComment")
public class VorbisComment extends SimplePeer {

	@OriginalMember(owner = "client!jagtheora/vorbis/VorbisComment", name = "<init>", descriptor = "()V", line = 10)
	public VorbisComment() {
		this.init();
		if (this.method25191()) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!jagtheora/vorbis/VorbisComment", name = "init", descriptor = "()V")
	private native void init();

	@OriginalMember(owner = "client!jagtheora/vorbis/VorbisComment", name = "clear", descriptor = "()V")
	protected native void clear();

	@OriginalMember(owner = "client!jagtheora/vorbis/VorbisComment", name = "h", descriptor = "()V")
	protected native void h();

	@OriginalMember(owner = "client!jagtheora/vorbis/VorbisComment", name = "x", descriptor = "()V")
	protected native void x();
}
