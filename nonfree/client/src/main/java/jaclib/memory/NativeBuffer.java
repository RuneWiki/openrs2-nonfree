package jaclib.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/NativeBuffer")
public class NativeBuffer implements Buffer, Source {

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "J")
	private long a;

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "p", descriptor = "I")
	private int p = 579012979;

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "<init>", descriptor = "()V", line = 11)
	protected NativeBuffer() {
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "p", descriptor = "()I", line = 14)
	@Override
	public final int p() {
		return this.p * 835370053;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "s", descriptor = "()I", line = 14)
	@Override
	public final int s() {
		return this.p * 835370053;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "u", descriptor = "()I", line = 14)
	@Override
	public final int u() {
		return this.p * 835370053;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "y", descriptor = "()I", line = 14)
	@Override
	public final int y() {
		return this.p * 835370053;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "()J", line = 18)
	@Override
	public final long a() {
		return this.a * 3819336783877552111L;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "b", descriptor = "()J", line = 18)
	@Override
	public final long b() {
		return this.a * 3819336783877552111L;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "c", descriptor = "()J", line = 18)
	@Override
	public final long c() {
		return this.a * 3819336783877552111L;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "z", descriptor = "()J", line = 18)
	@Override
	public final long z() {
		return this.a * 3819336783877552111L;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "g", descriptor = "([BIII)V", line = 22)
	@Override
	public void g(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.a * 3819336783877552111L == 0L | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.p * 835370053) {
			throw new RuntimeException();
		}
		this.put(this.a * 3819336783877552111L, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "l", descriptor = "([BIII)V", line = 22)
	@Override
	public void l(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.a * 3819336783877552111L == 0L | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.p * 835370053) {
			throw new RuntimeException();
		}
		this.put(this.a * 3819336783877552111L, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "h", descriptor = "([BIII)V", line = 22)
	@Override
	public void h(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.a * 3819336783877552111L == 0L | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.p * 835370053) {
			throw new RuntimeException();
		}
		this.put(this.a * 3819336783877552111L, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "x", descriptor = "([BIII)V", line = 22)
	@Override
	public void x(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.a * 3819336783877552111L == 0L | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.p * 835370053) {
			throw new RuntimeException();
		}
		this.put(this.a * 3819336783877552111L, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "get", descriptor = "(J[BIII)V")
	private final native void get(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "put", descriptor = "(J[BIII)V")
	private final native void put(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
