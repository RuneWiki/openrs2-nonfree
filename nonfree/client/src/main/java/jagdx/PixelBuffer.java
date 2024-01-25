package jagdx;

import jaclib.memory.Buffer;
import jaclib.peer.in;
import jaclib.peer.jj;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/PixelBuffer")
public final class PixelBuffer extends jj implements Buffer {

	@OriginalMember(owner = "client!jagdx/PixelBuffer", name = "<init>", descriptor = "(Lclient!jaclib/peer/in;)V")
	public PixelBuffer(@OriginalArg(0) in arg0) {
		super(arg0);
		this.init();
	}

	@OriginalMember(owner = "client!jagdx/PixelBuffer", name = "geti", descriptor = "([IIII)V")
	private native void geti(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jagdx/PixelBuffer", name = "a", descriptor = "([IIII)V")
	public void a(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 + arg3 > arg0.length | arg1 < 0 | arg0 == null | arg2 < 0 || arg2 + arg3 * 4 > this.getSize()) {
			throw new fn();
		}
		this.puti(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jagdx/PixelBuffer", name = "puti", descriptor = "([IIII)V")
	private native void puti(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jagdx/PixelBuffer", name = "b", descriptor = "([IIII)V")
	public void b(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0.length < arg1 + arg3 | arg1 < 0 | arg0 == null | arg2 < 0 || arg2 + arg3 * 4 > this.getSize()) {
			throw new fn();
		}
		this.geti(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jagdx/PixelBuffer", name = "a", descriptor = "([BIII)V")
	@Override
	public void a(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 < 0 | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length || arg2 + arg3 > this.getSize()) {
			throw new fn();
		}
		this.putub(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jagdx/PixelBuffer", name = "getSize", descriptor = "()I")
	public native int getSize();

	@OriginalMember(owner = "client!jagdx/PixelBuffer", name = "getSlicePitch", descriptor = "()I")
	public native int getSlicePitch();

	@OriginalMember(owner = "client!jagdx/PixelBuffer", name = "putub", descriptor = "([BIII)V")
	private native void putub(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jagdx/PixelBuffer", name = "getub", descriptor = "([BIII)V")
	private native void getub(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jagdx/PixelBuffer", name = "getRowPitch", descriptor = "()I")
	public native int getRowPitch();

	@OriginalMember(owner = "client!jagdx/PixelBuffer", name = "getAddress", descriptor = "()J")
	@Override
	public long getAddress() {
		return 0L;
	}

	@OriginalMember(owner = "client!jagdx/PixelBuffer", name = "init", descriptor = "()V")
	private native void init();
}
