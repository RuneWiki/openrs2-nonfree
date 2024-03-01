package jagtheora.ogg;

import jagtheora.misc.SimplePeer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/ogg/OggPacket")
public class OggPacket extends SimplePeer {

	@OriginalMember(owner = "client!jagtheora/ogg/OggPacket", name = "isHeader", descriptor = "()I")
	public native int isHeader();

	@OriginalMember(owner = "client!jagtheora/ogg/OggPacket", name = "isKeyFrame", descriptor = "()I")
	public native int isKeyFrame();

	@OriginalMember(owner = "client!jagtheora/ogg/OggPacket", name = "isTheora", descriptor = "()Z")
	public native boolean isTheora();

	@OriginalMember(owner = "client!jagtheora/ogg/OggPacket", name = "isVorbis", descriptor = "()Z")
	public native boolean isVorbis();

	@OriginalMember(owner = "client!jagtheora/ogg/OggPacket", name = "getData", descriptor = "()[B")
	public native byte[] getData();

	@OriginalMember(owner = "client!jagtheora/ogg/OggPacket", name = "clear", descriptor = "()V")
	protected native void clear();

	@OriginalMember(owner = "client!jagtheora/ogg/OggPacket", name = "h", descriptor = "()V")
	protected native void h();

	@OriginalMember(owner = "client!jagtheora/ogg/OggPacket", name = "x", descriptor = "()V")
	protected native void x();
}
