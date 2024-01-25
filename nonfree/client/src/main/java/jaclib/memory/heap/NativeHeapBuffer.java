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

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "I")
	public final int a;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	private final NativeHeap d;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "I")
	private final int c;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Lclient!jaclib/memory/heap/NativeHeap;II)V")
	public NativeHeapBuffer(@OriginalArg(0) NativeHeap arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.a = arg2;
		this.d = arg0;
		this.c = arg1;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() throws Throwable {
		super.finalize();
		this.a();
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getSize", descriptor = "()I")
	@Override
	public int getSize() {
		return this.a;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "([BIII)V")
	@Override
	public synchronized void a(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 < 0 | !this.b() | arg0 == null | arg1 < 0 | arg0.length < arg1 + arg3 | this.a < arg2 + arg3) {
			throw new RuntimeException();
		}
		this.d.put(this.c, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "()V")
	private synchronized void a() {
		if (this.b()) {
			this.d.deallocateBuffer(this.c);
		}
		this.b = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getAddress", descriptor = "()J")
	@Override
	public long getAddress() {
		return this.d.getBufferAddress(this.c);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "()Z")
	private synchronized boolean b() {
		return this.d.b() && this.b;
	}
}
