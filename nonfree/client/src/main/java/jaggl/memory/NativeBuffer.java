package jaggl.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public final class NativeBuffer {

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "Z")
	private boolean b = true;

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	private final NativeHeap d;

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "I")
	public final int a;

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "I")
	private final int c;

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Lclient!jaggl/memory/NativeHeap;II)V")
	public NativeBuffer(@OriginalArg(0) NativeHeap arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.d = arg0;
		this.a = arg2;
		this.c = arg1;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()J")
	public long a() {
		return this.d.getBufferAddress(this.c);
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()Z")
	private synchronized boolean b() {
		return this.d.b() && this.b;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V")
	public synchronized void a(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < 0 | !this.b() | arg0 == null | arg2 > arg0.length | arg2 + arg1 > this.a) {
			throw new RuntimeException();
		}
		this.d.put(this.c, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()V")
	private synchronized void c() {
		if (this.b()) {
			this.d.deallocateBuffer(this.c);
		}
		this.b = false;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() throws Throwable {
		super.finalize();
		this.c();
	}
}
