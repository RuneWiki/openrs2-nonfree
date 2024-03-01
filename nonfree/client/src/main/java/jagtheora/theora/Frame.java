package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/theora/Frame")
public class Frame extends SimplePeer {

	@OriginalMember(owner = "client!jagtheora/theora/Frame", name = "p", descriptor = "I")
	public final int anInt4166;

	@OriginalMember(owner = "client!jagtheora/theora/Frame", name = "a", descriptor = "I")
	public final int anInt4167;

	@OriginalMember(owner = "client!jagtheora/theora/Frame", name = "pixels", descriptor = "[I")
	public int[] anIntArray400;

	static {
		init();
	}

	@OriginalMember(owner = "client!jagtheora/theora/Frame", name = "<init>", descriptor = "(II)V", line = 20)
	public Frame(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4166 = arg0 * -1795289319;
		this.anInt4167 = arg1 * 821966689;
		this.anIntArray400 = new int[this.anInt4166 * -1503666903 * this.anInt4167 * 1831513249];
	}

	@OriginalMember(owner = "client!jagtheora/theora/Frame", name = "init", descriptor = "()V")
	private static native void init();

	@OriginalMember(owner = "client!jagtheora/theora/Frame", name = "clear", descriptor = "()V")
	protected native void clear();

	@OriginalMember(owner = "client!jagtheora/theora/Frame", name = "h", descriptor = "()V")
	protected native void h();

	@OriginalMember(owner = "client!jagtheora/theora/Frame", name = "x", descriptor = "()V")
	protected native void x();
}
