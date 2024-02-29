package jaclib.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/NativeBuffer")
public class NativeBuffer implements Buffer, Source {

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "c", descriptor = "J")
	private long c;

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "p", descriptor = "I")
	private int p = -869010697;

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "<init>", descriptor = "()V", line = 11)
	protected NativeBuffer() {
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "p", descriptor = "()I", line = 14)
	@Override
	public final int p() {
		return this.p * 1836552505;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "q", descriptor = "()I", line = 14)
	@Override
	public final int q() {
		return this.p * 1836552505;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "x", descriptor = "()I", line = 14)
	@Override
	public final int x() {
		return this.p * 1836552505;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "c", descriptor = "()J", line = 18)
	@Override
	public final long c() {
		return this.c * -3156321065228414913L;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "d", descriptor = "()J", line = 18)
	@Override
	public final long d() {
		return this.c * -3156321065228414913L;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "s", descriptor = "()J", line = 18)
	@Override
	public final long s() {
		return this.c * -3156321065228414913L;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "r", descriptor = "()J", line = 18)
	@Override
	public final long r() {
		return this.c * -3156321065228414913L;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "g", descriptor = "()J", line = 18)
	@Override
	public final long g() {
		return this.c * -3156321065228414913L;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "v", descriptor = "([BIII)V", line = 22)
	@Override
	public void v(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.c * -3156321065228414913L == 0L | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.p * 1836552505) {
			throw new RuntimeException();
		}
		this.put(this.c * -3156321065228414913L, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "l", descriptor = "([BIII)V", line = 22)
	@Override
	public void l(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.c * -3156321065228414913L == 0L | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.p * 1836552505) {
			throw new RuntimeException();
		}
		this.put(this.c * -3156321065228414913L, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "y", descriptor = "([BIII)V", line = 22)
	@Override
	public void y(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.c * -3156321065228414913L == 0L | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.p * 1836552505) {
			throw new RuntimeException();
		}
		this.put(this.c * -3156321065228414913L, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "w", descriptor = "([BIII)V", line = 22)
	@Override
	public void w(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.c * -3156321065228414913L == 0L | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.p * 1836552505) {
			throw new RuntimeException();
		}
		this.put(this.c * -3156321065228414913L, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "t", descriptor = "([BIII)V", line = 22)
	@Override
	public void t(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.c * -3156321065228414913L == 0L | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.p * 1836552505) {
			throw new RuntimeException();
		}
		this.put(this.c * -3156321065228414913L, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "get", descriptor = "(J[BIII)V")
	private final native void get(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "put", descriptor = "(J[BIII)V")
	private final native void put(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
