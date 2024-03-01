package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/vorbis/VorbisBlock")
public class VorbisBlock extends SimplePeer {

	@OriginalMember(owner = "client!jagtheora/vorbis/VorbisBlock", name = "<init>", descriptor = "(Lclient!jagtheora/vorbis/DSPState;)V", line = 11)
	public VorbisBlock(@OriginalArg(0) DSPState arg0) {
		this.init(arg0);
		if (this.method25191()) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!jagtheora/vorbis/VorbisBlock", name = "init", descriptor = "(Lclient!jagtheora/vorbis/DSPState;)V")
	private native void init(@OriginalArg(0) DSPState arg0);

	@OriginalMember(owner = "client!jagtheora/vorbis/VorbisBlock", name = "synthesis", descriptor = "(Lclient!jagtheora/ogg/OggPacket;)I")
	public native int synthesis(@OriginalArg(0) OggPacket arg0);

	@OriginalMember(owner = "client!jagtheora/vorbis/VorbisBlock", name = "clear", descriptor = "()V")
	protected native void clear();

	@OriginalMember(owner = "client!jagtheora/vorbis/VorbisBlock", name = "h", descriptor = "()V")
	protected native void h();

	@OriginalMember(owner = "client!jagtheora/vorbis/VorbisBlock", name = "x", descriptor = "()V")
	protected native void x();
}
