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

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap a;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "g", descriptor = "I")
	private final int g;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "p", descriptor = "I")
	private final int p;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Lclient!jaclib/memory/heap/NativeHeap;II)V", line = 15)
	NativeHeapBuffer(@OriginalArg(0) NativeHeap arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.a = arg0;
		this.g = arg1 * -2108397901;
		this.p = arg2 * -589993793;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "j", descriptor = "()Z", line = 22)
	private final synchronized boolean j() {
		return this.a.p() && this.l;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "()J", line = 26)
	@Override
	public final long a() {
		return this.a.getBufferAddress(this.g * -1428768645);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "()J", line = 26)
	@Override
	public final long b() {
		return this.a.getBufferAddress(this.g * -1428768645);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "()J", line = 26)
	@Override
	public final long c() {
		return this.a.getBufferAddress(this.g * -1428768645);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "z", descriptor = "()J", line = 26)
	@Override
	public final long z() {
		return this.a.getBufferAddress(this.g * -1428768645);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "p", descriptor = "()I", line = 30)
	@Override
	public final int p() {
		return this.p * -404617409;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "s", descriptor = "()I", line = 30)
	@Override
	public final int s() {
		return this.p * -404617409;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "u", descriptor = "()I", line = 30)
	@Override
	public final int u() {
		return this.p * -404617409;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "y", descriptor = "()I", line = 30)
	@Override
	public final int y() {
		return this.p * -404617409;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "g", descriptor = "([BIII)V", line = 34)
	@Override
	public final synchronized void g(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.j() | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.p * -404617409) {
			throw new RuntimeException();
		}
		this.a.put(this.g * -1428768645, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "l", descriptor = "([BIII)V", line = 34)
	@Override
	public final synchronized void l(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.j() | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.p * -404617409) {
			throw new RuntimeException();
		}
		this.a.put(this.g * -1428768645, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "h", descriptor = "([BIII)V", line = 34)
	@Override
	public final synchronized void h(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.j() | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.p * -404617409) {
			throw new RuntimeException();
		}
		this.a.put(this.g * -1428768645, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "x", descriptor = "([BIII)V", line = 34)
	@Override
	public final synchronized void x(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.j() | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.p * -404617409) {
			throw new RuntimeException();
		}
		this.a.put(this.g * -1428768645, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "n", descriptor = "()V", line = 39)
	public final synchronized void n() {
		if (this.j()) {
			this.a.deallocateBuffer(this.g * -1428768645);
		}
		this.l = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "e", descriptor = "()V", line = 39)
	public final synchronized void e() {
		if (this.j()) {
			this.a.deallocateBuffer(this.g * -1428768645);
		}
		this.l = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V", line = 44)
	@Override
	protected final synchronized void finalize() throws Throwable {
		super.finalize();
		this.n();
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "hh", descriptor = "()V", line = 44)
	protected final synchronized void hh() throws Throwable {
		super.finalize();
		this.n();
	}
}
