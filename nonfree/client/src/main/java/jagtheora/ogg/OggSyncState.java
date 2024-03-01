package jagtheora.ogg;

import jagtheora.misc.SimplePeer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/ogg/OggSyncState")
public class OggSyncState extends SimplePeer {

	@OriginalMember(owner = "client!jagtheora/ogg/OggSyncState", name = "<init>", descriptor = "()V", line = 10)
	public OggSyncState() {
		this.init();
		if (this.method25191()) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!jagtheora/ogg/OggSyncState", name = "init", descriptor = "()V")
	private native void init();

	@OriginalMember(owner = "client!jagtheora/ogg/OggSyncState", name = "write", descriptor = "([BI)Z")
	public native boolean write(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jagtheora/ogg/OggSyncState", name = "pageSeek", descriptor = "(Lclient!jagtheora/ogg/OggPage;)J")
	public native long pageSeek(@OriginalArg(0) OggPage arg0);

	@OriginalMember(owner = "client!jagtheora/ogg/OggSyncState", name = "pageOut", descriptor = "(Lclient!jagtheora/ogg/OggPage;)I")
	public native int pageOut(@OriginalArg(0) OggPage arg0);

	@OriginalMember(owner = "client!jagtheora/ogg/OggSyncState", name = "reset", descriptor = "()Z")
	public native boolean reset();

	@OriginalMember(owner = "client!jagtheora/ogg/OggSyncState", name = "clear", descriptor = "()V")
	protected native void clear();

	@OriginalMember(owner = "client!jagtheora/ogg/OggSyncState", name = "h", descriptor = "()V")
	protected native void h();

	@OriginalMember(owner = "client!jagtheora/ogg/OggSyncState", name = "x", descriptor = "()V")
	protected native void x();
}
