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

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "a", descriptor = "Z")
	private boolean a;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "<init>", descriptor = "(I)V", line = 14)
	public NativeHeap(@OriginalArg(0) int arg0) {
		this.p = arg0 * 1058983977;
		this.allocateHeap(this.p * 651545625);
		this.a = true;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "p", descriptor = "()Z", line = 21)
	synchronized boolean p() {
		return this.a;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "l", descriptor = "()Z", line = 21)
	synchronized boolean l() {
		return this.a;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;", line = 25)
	public NativeHeapBuffer a(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.a) {
			throw new IllegalStateException();
		}
		return new NativeHeapBuffer(this, this.allocateBuffer(arg0, arg1), arg0);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "h", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;", line = 25)
	public NativeHeapBuffer h(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.a) {
			throw new IllegalStateException();
		}
		return new NativeHeapBuffer(this, this.allocateBuffer(arg0, arg1), arg0);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "x", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;", line = 25)
	public NativeHeapBuffer x(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.a) {
			throw new IllegalStateException();
		}
		return new NativeHeapBuffer(this, this.allocateBuffer(arg0, arg1), arg0);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "g", descriptor = "()V", line = 30)
	public synchronized void g() {
		if (this.a) {
			this.deallocateHeap();
		}
		this.a = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "s", descriptor = "()V", line = 30)
	public synchronized void s() {
		if (this.a) {
			this.deallocateHeap();
		}
		this.a = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "u", descriptor = "()V", line = 30)
	public synchronized void u() {
		if (this.a) {
			this.deallocateHeap();
		}
		this.a = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "y", descriptor = "()V", line = 30)
	public synchronized void y() {
		if (this.a) {
			this.deallocateHeap();
		}
		this.a = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "b", descriptor = "()V", line = 30)
	public synchronized void b() {
		if (this.a) {
			this.deallocateHeap();
		}
		this.a = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "finalize", descriptor = "()V", line = 59)
	@Override
	protected synchronized void finalize() throws Throwable {
		super.finalize();
		this.g();
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "hh", descriptor = "()V", line = 59)
	protected synchronized void hh() throws Throwable {
		super.finalize();
		this.g();
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
