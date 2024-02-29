package jaclib.memory.heap;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeap")
public final class NativeHeap {

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "peer", descriptor = "J")
	long peer;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "p", descriptor = "I")
	private final int p;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "c", descriptor = "Z")
	private boolean c;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "<init>", descriptor = "(I)V", line = 14)
	public NativeHeap(@OriginalArg(0) int arg0) {
		this.p = arg0 * 755089349;
		this.allocateHeap(this.p * -892508403);
		this.c = true;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "p", descriptor = "()Z", line = 21)
	synchronized boolean p() {
		return this.c;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "l", descriptor = "()Z", line = 21)
	synchronized boolean l() {
		return this.c;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "c", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;", line = 25)
	public NativeHeapBuffer c(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.c) {
			throw new IllegalStateException();
		}
		return new NativeHeapBuffer(this, this.allocateBuffer(arg0, arg1), arg0);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "y", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;", line = 25)
	public NativeHeapBuffer y(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.c) {
			throw new IllegalStateException();
		}
		return new NativeHeapBuffer(this, this.allocateBuffer(arg0, arg1), arg0);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "w", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;", line = 25)
	public NativeHeapBuffer w(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.c) {
			throw new IllegalStateException();
		}
		return new NativeHeapBuffer(this, this.allocateBuffer(arg0, arg1), arg0);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "t", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;", line = 25)
	public NativeHeapBuffer t(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.c) {
			throw new IllegalStateException();
		}
		return new NativeHeapBuffer(this, this.allocateBuffer(arg0, arg1), arg0);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "v", descriptor = "()V", line = 30)
	public synchronized void v() {
		if (this.c) {
			this.deallocateHeap();
		}
		this.c = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "q", descriptor = "()V", line = 30)
	public synchronized void q() {
		if (this.c) {
			this.deallocateHeap();
		}
		this.c = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "x", descriptor = "()V", line = 30)
	public synchronized void x() {
		if (this.c) {
			this.deallocateHeap();
		}
		this.c = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "finalize", descriptor = "()V", line = 59)
	@Override
	protected synchronized void finalize() throws Throwable {
		super.finalize();
		this.v();
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "hc", descriptor = "()V", line = 59)
	protected synchronized void hc() throws Throwable {
		super.finalize();
		this.v();
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "hd", descriptor = "()V", line = 59)
	protected synchronized void hd() throws Throwable {
		super.finalize();
		this.v();
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "hp", descriptor = "()V", line = 59)
	protected synchronized void hp() throws Throwable {
		super.finalize();
		this.v();
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "allocateHeap", descriptor = "(I)V")
	private native void allocateHeap(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "deallocateHeap", descriptor = "()V")
	private native void deallocateHeap();

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "allocateBuffer", descriptor = "(IZ)I")
	synchronized native int allocateBuffer(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "getBufferAddress", descriptor = "(I)J")
	synchronized native long getBufferAddress(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "get", descriptor = "(I[BIII)V")
	synchronized native void get(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "put", descriptor = "(I[BIII)V")
	synchronized native void put(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "deallocateBuffer", descriptor = "(I)V")
	synchronized native void deallocateBuffer(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "copy", descriptor = "(JJI)V")
	public synchronized native void copy(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2);
}
