package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public final class NativeHeapBuffer implements Buffer, Source {

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "l", descriptor = "Z")
	private boolean l = true;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap c;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "v", descriptor = "I")
	private final int v;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "p", descriptor = "I")
	private final int p;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Lclient!jaclib/memory/heap/NativeHeap;II)V", line = 15)
	NativeHeapBuffer(@OriginalArg(0) NativeHeap arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.c = arg0;
		this.v = arg1 * 1330967921;
		this.p = arg2 * -1464090437;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "z", descriptor = "()Z", line = 22)
	private final synchronized boolean z() {
		return this.c.p() && this.l;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "i", descriptor = "()Z", line = 22)
	private final synchronized boolean i() {
		return this.c.p() && this.l;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "k", descriptor = "()Z", line = 22)
	private final synchronized boolean k() {
		return this.c.p() && this.l;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "()J", line = 26)
	@Override
	public final long c() {
		return this.c.getBufferAddress(this.v * 1721183121);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "()J", line = 26)
	@Override
	public final long d() {
		return this.c.getBufferAddress(this.v * 1721183121);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "s", descriptor = "()J", line = 26)
	@Override
	public final long s() {
		return this.c.getBufferAddress(this.v * 1721183121);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "r", descriptor = "()J", line = 26)
	@Override
	public final long r() {
		return this.c.getBufferAddress(this.v * 1721183121);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "g", descriptor = "()J", line = 26)
	@Override
	public final long g() {
		return this.c.getBufferAddress(this.v * 1721183121);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "p", descriptor = "()I", line = 30)
	@Override
	public final int p() {
		return this.p * 743998579;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "q", descriptor = "()I", line = 30)
	@Override
	public final int q() {
		return this.p * 743998579;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "x", descriptor = "()I", line = 30)
	@Override
	public final int x() {
		return this.p * 743998579;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "v", descriptor = "([BIII)V", line = 34)
	@Override
	public final synchronized void v(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.z() | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.p * 743998579) {
			throw new RuntimeException();
		}
		this.c.put(this.v * 1721183121, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "l", descriptor = "([BIII)V", line = 34)
	@Override
	public final synchronized void l(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.z() | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.p * 743998579) {
			throw new RuntimeException();
		}
		this.c.put(this.v * 1721183121, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "y", descriptor = "([BIII)V", line = 34)
	@Override
	public final synchronized void y(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.z() | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.p * 743998579) {
			throw new RuntimeException();
		}
		this.c.put(this.v * 1721183121, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "w", descriptor = "([BIII)V", line = 34)
	@Override
	public final synchronized void w(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.z() | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.p * 743998579) {
			throw new RuntimeException();
		}
		this.c.put(this.v * 1721183121, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "t", descriptor = "([BIII)V", line = 34)
	@Override
	public final synchronized void t(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.z() | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.p * 743998579) {
			throw new RuntimeException();
		}
		this.c.put(this.v * 1721183121, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "j", descriptor = "()V", line = 39)
	public final synchronized void j() {
		if (this.z()) {
			this.c.deallocateBuffer(this.v * 1721183121);
		}
		this.l = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "u", descriptor = "()V", line = 39)
	public final synchronized void u() {
		if (this.z()) {
			this.c.deallocateBuffer(this.v * 1721183121);
		}
		this.l = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "e", descriptor = "()V", line = 39)
	public final synchronized void e() {
		if (this.z()) {
			this.c.deallocateBuffer(this.v * 1721183121);
		}
		this.l = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V", line = 44)
	@Override
	protected final synchronized void finalize() throws Throwable {
		super.finalize();
		this.j();
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "hc", descriptor = "()V", line = 44)
	protected final synchronized void hc() throws Throwable {
		super.finalize();
		this.j();
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "hd", descriptor = "()V", line = 44)
	protected final synchronized void hd() throws Throwable {
		super.finalize();
		this.j();
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "hp", descriptor = "()V", line = 44)
	protected final synchronized void hp() throws Throwable {
		super.finalize();
		this.j();
	}
}
