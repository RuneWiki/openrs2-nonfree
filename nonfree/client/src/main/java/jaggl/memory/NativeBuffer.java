package jaggl.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public final class NativeBuffer {

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "Z")
	private boolean c = true;

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	private final NativeHeap b;

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "I")
	public final int a;

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "I")
	private final int d;

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Lclient!jaggl/memory/NativeHeap;II)V")
	public NativeBuffer(@OriginalArg(0) NativeHeap arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.b = arg0;
		this.a = arg2;
		this.d = arg1;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V")
	public synchronized void a(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.b() | arg0 == null | arg0.length < arg2 | arg1 < 0 | arg1 + arg2 > this.a) {
			throw new RuntimeException();
		}
		this.b.put(this.d, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()V")
	private synchronized void a() {
		if (this.b()) {
			this.b.deallocateBuffer(this.d);
		}
		this.c = false;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()Z")
	private synchronized boolean b() {
		return this.b.a() && this.c;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()J")
	public long c() {
		return this.b.getBufferAddress(this.d);
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() throws Throwable {
		super.finalize();
		this.a();
	}
}
