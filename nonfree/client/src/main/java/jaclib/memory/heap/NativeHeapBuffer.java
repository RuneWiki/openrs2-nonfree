package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public final class NativeHeapBuffer implements Buffer, Source {

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "Z")
	private boolean b = true;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "I")
	private final int d;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	private final NativeHeap c;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "I")
	public final int a;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Lclient!jaclib/memory/heap/NativeHeap;II)V")
	public NativeHeapBuffer(@OriginalArg(0) NativeHeap arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.d = arg1;
		this.c = arg0;
		this.a = arg2;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getAddress", descriptor = "()J")
	@Override
	public long getAddress() {
		return this.c.getBufferAddress(this.d);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "()V")
	private synchronized void a() {
		if (this.b()) {
			this.c.deallocateBuffer(this.d);
		}
		this.b = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getSize", descriptor = "()I")
	@Override
	public int getSize() {
		return this.a;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() throws Throwable {
		super.finalize();
		this.a();
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "([BIII)V")
	@Override
	public synchronized void a(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null | !this.b() | arg1 < 0 | arg0.length < arg1 + arg3 | arg2 < 0 | this.a < arg3 + arg2) {
			throw new RuntimeException();
		}
		this.c.put(this.d, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "()Z")
	private synchronized boolean b() {
		return this.c.b() && this.b;
	}
}
