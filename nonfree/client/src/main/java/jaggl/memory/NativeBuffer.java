package jaggl.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public final class NativeBuffer {

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "Z")
	private boolean d = true;

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "I")
	public final int b;

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "I")
	private final int a;

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	private final NativeHeap c;

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Lclient!jaggl/memory/NativeHeap;II)V")
	public NativeBuffer(@OriginalArg(0) NativeHeap arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.b = arg2;
		this.a = arg1;
		this.c = arg0;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()Z")
	private synchronized boolean a() {
		return this.c.a() && this.d;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() throws Throwable {
		super.finalize();
		this.c();
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()J")
	public long b() {
		return this.c.getBufferAddress(this.a);
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V")
	public synchronized void a(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.a() | arg0 == null | arg0.length < arg2 | arg1 < 0 | this.b < arg1 + arg2) {
			throw new RuntimeException();
		}
		this.c.put(this.a, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()V")
	private synchronized void c() {
		if (this.a()) {
			this.c.deallocateBuffer(this.a);
		}
		this.d = false;
	}
}
