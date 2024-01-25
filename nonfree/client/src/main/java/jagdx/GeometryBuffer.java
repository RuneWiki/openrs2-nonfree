package jagdx;

import jaclib.memory.Buffer;
import jaclib.peer.cha;
import jaclib.peer.vv;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/GeometryBuffer")
public final class GeometryBuffer extends cha implements Buffer {

	@OriginalMember(owner = "client!jagdx/GeometryBuffer", name = "<init>", descriptor = "(Lclient!jaclib/peer/vv;)V")
	public GeometryBuffer(@OriginalArg(0) vv arg0) {
		super(arg0);
		this.init();
	}

	@OriginalMember(owner = "client!jagdx/GeometryBuffer", name = "a", descriptor = "([BIII)V")
	@Override
	public void a(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null | arg1 < 0 | arg1 + arg3 > arg0.length | arg2 < 0 || this.getSize() < arg2 + arg3) {
			throw new ws();
		}
		this.putub(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jagdx/GeometryBuffer", name = "putub", descriptor = "([BIII)V")
	private native void putub(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jagdx/GeometryBuffer", name = "init", descriptor = "()V")
	private native void init();

	@OriginalMember(owner = "client!jagdx/GeometryBuffer", name = "getub", descriptor = "([BIII)V")
	private native void getub(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jagdx/GeometryBuffer", name = "getSize", descriptor = "()I")
	public native int getSize();

	@OriginalMember(owner = "client!jagdx/GeometryBuffer", name = "getAddress", descriptor = "()J")
	public native long getAddress();
}
