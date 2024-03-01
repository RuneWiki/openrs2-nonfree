package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/theora/TheoraInfo")
public class TheoraInfo extends SimplePeer {

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "versionMajor", descriptor = "B")
	public byte aByte150;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "versionMinor", descriptor = "B")
	public byte aByte151;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "versionSubMinor", descriptor = "B")
	public byte aByte152;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "frameWidth", descriptor = "I")
	public int anInt4168;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "frameHeight", descriptor = "I")
	public int anInt4169;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "picWidth", descriptor = "I")
	public int anInt4170;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "picHeight", descriptor = "I")
	public int anInt4171;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "picX", descriptor = "I")
	public int anInt4172;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "picY", descriptor = "I")
	public int anInt4173;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "fpsNumerator", descriptor = "I")
	public int anInt4174;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "fpsDenominator", descriptor = "I")
	public int anInt4175;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "aspectNumerator", descriptor = "I")
	public int anInt4176;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "aspectDenominator", descriptor = "I")
	public int anInt4177;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "colourSpace", descriptor = "I")
	public int anInt4178;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "pixelFormat", descriptor = "I")
	public int anInt4179;

	static {
		initFields();
	}

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "<init>", descriptor = "()V", line = 59)
	public TheoraInfo() {
		this.init();
		if (this.method25191()) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "initFields", descriptor = "()V")
	private static native void initFields();

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "init", descriptor = "()V")
	private native void init();

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "clear", descriptor = "()V")
	protected native void clear();

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "h", descriptor = "()V")
	protected native void h();

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "x", descriptor = "()V")
	protected native void x();
}
