package jaggl.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public final class NativeBuffer {

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "Z")
	private boolean d = true;

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "I")
	private final int a;

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "I")
	public final int c;

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	private final NativeHeap b;

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Lclient!jaggl/memory/NativeHeap;II)V")
	public NativeBuffer(@OriginalArg(0) NativeHeap arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.a = arg1;
		this.c = arg2;
		this.b = arg0;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V")
	public synchronized void a(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.c() | arg0 == null | arg0.length < arg2 | arg1 < 0 | this.c < arg1 + arg2) {
			throw new RuntimeException();
		}
		this.b.put(this.a, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() throws Throwable {
		super.finalize();
		this.b();
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()J")
	public long a() {
		return this.b.getBufferAddress(this.a);
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()V")
	private synchronized void b() {
		if (this.c()) {
			this.b.deallocateBuffer(this.a);
		}
		this.d = false;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()Z")
	private synchronized boolean c() {
		return this.b.a() && this.d;
	}
}
