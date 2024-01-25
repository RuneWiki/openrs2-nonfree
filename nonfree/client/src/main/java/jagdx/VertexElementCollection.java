package jagdx;

import jaclib.peer.vl;
import jaclib.peer.wl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/VertexElementCollection")
public final class VertexElementCollection extends vl {

	@OriginalMember(owner = "client!jagdx/VertexElementCollection", name = "<init>", descriptor = "(Lclient!jaclib/peer/wl;)V")
	public VertexElementCollection(@OriginalArg(0) wl arg0) {
		super(arg0);
		this.init();
	}

	@OriginalMember(owner = "client!jagdx/VertexElementCollection", name = "addElement", descriptor = "(IIIIII)V")
	public native void addElement(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!jagdx/VertexElementCollection", name = "finish", descriptor = "()V")
	public native void finish();

	@OriginalMember(owner = "client!jagdx/VertexElementCollection", name = "reset", descriptor = "()V")
	private native void reset();

	@OriginalMember(owner = "client!jagdx/VertexElementCollection", name = "init", descriptor = "()V")
	private native void init();
}
