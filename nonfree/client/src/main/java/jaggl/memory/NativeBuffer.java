package jaggl.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public final class NativeBuffer {

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "Z")
	private boolean a = true;

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	private final NativeHeap d;

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "I")
	private final int c;

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "I")
	public final int b;

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Lclient!jaggl/memory/NativeHeap;II)V")
	public NativeBuffer(@OriginalArg(0) NativeHeap arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.d = arg0;
		this.c = arg1;
		this.b = arg2;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()J")
	public long a() {
		return this.d.getBufferAddress(this.c);
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() throws Throwable {
		super.finalize();
		this.b();
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V")
	public synchronized void a(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null | !this.c() | arg2 > arg0.length | arg1 < 0 | this.b < arg1 + arg2) {
			throw new RuntimeException();
		}
		this.d.put(this.c, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()V")
	private synchronized void b() {
		if (this.c()) {
			this.d.deallocateBuffer(this.c);
		}
		this.a = false;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()Z")
	private synchronized boolean c() {
		return this.d.a() && this.a;
	}
}
