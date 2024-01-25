package jagdx;

import jaclib.memory.Buffer;
import jaclib.peer.bda;
import jaclib.peer.od;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/GeometryBuffer")
public final class GeometryBuffer extends od implements Buffer {

	@OriginalMember(owner = "client!jagdx/GeometryBuffer", name = "<init>", descriptor = "(Lclient!jaclib/peer/bda;)V")
	public GeometryBuffer(@OriginalArg(0) bda arg0) {
		super(arg0);
		this.init();
	}

	@OriginalMember(owner = "client!jagdx/GeometryBuffer", name = "putub", descriptor = "([BIII)V")
	private native void putub(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jagdx/GeometryBuffer", name = "a", descriptor = "([BIII)V")
	@Override
	public void a(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 0 | arg0 == null | arg3 + arg1 > arg0.length | arg2 < 0 || this.getSize() < arg2 + arg3) {
			throw new lq();
		}
		this.putub(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jagdx/GeometryBuffer", name = "getSize", descriptor = "()I")
	public native int getSize();

	@OriginalMember(owner = "client!jagdx/GeometryBuffer", name = "getAddress", descriptor = "()J")
	public native long getAddress();

	@OriginalMember(owner = "client!jagdx/GeometryBuffer", name = "init", descriptor = "()V")
	private native void init();

	@OriginalMember(owner = "client!jagdx/GeometryBuffer", name = "getub", descriptor = "([BIII)V")
	private native void getub(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
