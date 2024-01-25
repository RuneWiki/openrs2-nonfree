package jaggl.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeHeap")
public final class NativeHeap {

	@OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "b", descriptor = "I")
	private final int b;

	@OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "a", descriptor = "Z")
	private boolean a;

	@OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "<init>", descriptor = "(I)V")
	public NativeHeap(@OriginalArg(0) int arg0) {
		this.b = arg0;
		this.allocateHeap(this.b);
		this.a = true;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "a", descriptor = "(I)Lclient!jaggl/memory/NativeBuffer;")
	public NativeBuffer a(@OriginalArg(0) int arg0) {
		if (!this.a) {
			throw new IllegalStateException();
		}
		return new NativeBuffer(this, this.allocateBuffer(arg0), arg0);
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "put", descriptor = "(I[BII)V")
	public synchronized native void put(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "a", descriptor = "()Z")
	public synchronized boolean a() {
		return this.a;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "deallocateBuffer", descriptor = "(I)V")
	public synchronized native void deallocateBuffer(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "deallocateHeap", descriptor = "()V")
	private native void deallocateHeap();

	@OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "allocateHeap", descriptor = "(I)V")
	private native void allocateHeap(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "allocateBuffer", descriptor = "(I)I")
	private synchronized native int allocateBuffer(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() throws Throwable {
		super.finalize();
		this.b();
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "get", descriptor = "(I[BII)V")
	private synchronized native void get(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "b", descriptor = "()V")
	public synchronized void b() {
		if (this.a) {
			this.deallocateHeap();
		}
		this.a = false;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "getBufferAddress", descriptor = "(I)J")
	public synchronized native long getBufferAddress(@OriginalArg(0) int arg0);
}
