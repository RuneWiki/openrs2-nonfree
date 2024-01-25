package jaggl.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public final class NativeBuffer {

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "Z")
	private boolean b = true;

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	private final NativeHeap a;

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "I")
	private final int d;

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "I")
	public final int c;

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Lclient!jaggl/memory/NativeHeap;II)V")
	public NativeBuffer(@OriginalArg(0) NativeHeap arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.a = arg0;
		this.d = arg1;
		this.c = arg2;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V")
	public synchronized void a(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < 0 | arg0 == null | !this.b() | arg2 > arg0.length | this.c < arg1 + arg2) {
			throw new RuntimeException();
		}
		this.a.put(this.d, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()V")
	private synchronized void a() {
		if (this.b()) {
			this.a.deallocateBuffer(this.d);
		}
		this.b = false;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()Z")
	private synchronized boolean b() {
		return this.a.a() && this.b;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() throws Throwable {
		super.finalize();
		this.a();
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()J")
	public long c() {
		return this.a.getBufferAddress(this.d);
	}
}
