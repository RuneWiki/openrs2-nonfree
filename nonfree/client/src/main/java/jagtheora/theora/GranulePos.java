package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/theora/GranulePos")
public class GranulePos extends SimplePeer {

	@OriginalMember(owner = "client!jagtheora/theora/GranulePos", name = "position", descriptor = "J")
	public long aLong253;

	static {
		init();
	}

	@OriginalMember(owner = "client!jagtheora/theora/GranulePos", name = "init", descriptor = "()V")
	private static native void init();

	@OriginalMember(owner = "client!jagtheora/theora/GranulePos", name = "clear", descriptor = "()V")
	protected native void clear();

	@OriginalMember(owner = "client!jagtheora/theora/GranulePos", name = "h", descriptor = "()V")
	protected native void h();

	@OriginalMember(owner = "client!jagtheora/theora/GranulePos", name = "x", descriptor = "()V")
	protected native void x();
}
