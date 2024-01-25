package jaclib.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/memory/Stream")
public final class Stream {

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	private Buffer a;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
	private int b;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
	private int c;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "[B")
	private final byte[] d;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
	private int e;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
	private static native byte getLSB(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()Z")
	public static boolean b() {
		return getLSB(-65536) == -1;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
	public static native int floatToRawIntBits(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Lclient!jaclib/memory/Buffer;)V")
	public Stream(@OriginalArg(0) Buffer arg0) {
		this(arg0, 0, arg0.getSize());
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
	public Stream() {
		this(4096);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Lclient!jaclib/memory/Buffer;II)V")
	public Stream(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this(arg0.getSize() < 4096 ? arg0.getSize() : 4096);
		this.a(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
	private Stream(@OriginalArg(0) int arg0) {
		this.d = new byte[arg0];
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		if (this.c + 3 >= this.d.length) {
			this.a();
		}
		this.d[this.c++] = (byte) arg0;
		this.d[this.c++] = (byte) (arg0 >> 8);
		this.d[this.c++] = (byte) (arg0 >> 16);
		this.d[this.c++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
	public void b(@OriginalArg(0) int arg0) {
		if (this.d.length <= this.c + 1) {
			this.a();
		}
		this.d[this.c++] = (byte) (arg0 >> 8);
		this.d[this.c++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()V")
	public void a() {
		if (this.c <= 0) {
			return;
		}
		if (this.b < this.e + this.c) {
			throw new RuntimeException();
		}
		this.a.a(this.d, 0, this.e, this.c);
		this.e += this.c;
		this.c = 0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
	public void a(@OriginalArg(0) float arg0) {
		if (this.c + 3 >= this.d.length) {
			this.a();
		}
		@Pc(16) int local16 = floatToRawIntBits(arg0);
		this.d[this.c++] = (byte) local16;
		this.d[this.c++] = (byte) (local16 >> 8);
		this.d[this.c++] = (byte) (local16 >> 16);
		this.d[this.c++] = (byte) (local16 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
	public void c(@OriginalArg(0) int arg0) {
		if (this.d.length <= this.c + 1) {
			this.a();
		}
		this.d[this.c++] = (byte) arg0;
		this.d[this.c++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
	public void d(@OriginalArg(0) int arg0) {
		this.a();
		this.e = arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
	public void e(@OriginalArg(0) int arg0) {
		if (this.d.length <= this.c) {
			this.a();
		}
		this.d[this.c++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
	public void f(@OriginalArg(0) int arg0) {
		if (this.d.length <= this.c + 3) {
			this.a();
		}
		this.d[this.c++] = (byte) (arg0 >> 16);
		this.d[this.c++] = (byte) (arg0 >> 8);
		this.d[this.c++] = (byte) arg0;
		this.d[this.c++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;II)V")
	private void a(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.a();
		this.a = arg0;
		this.e = arg1;
		this.b = arg2 + arg1;
		if (this.b > arg0.getSize()) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()I")
	public int c() {
		return this.e + this.c;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
	public void b(@OriginalArg(0) float arg0) {
		if (this.c + 3 >= this.d.length) {
			this.a();
		}
		@Pc(12) int local12 = floatToRawIntBits(arg0);
		this.d[this.c++] = (byte) (local12 >> 24);
		this.d[this.c++] = (byte) (local12 >> 16);
		this.d[this.c++] = (byte) (local12 >> 8);
		this.d[this.c++] = (byte) local12;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.d.length <= this.c + 3) {
			this.a();
		}
		this.d[this.c++] = (byte) arg0;
		this.d[this.c++] = (byte) arg1;
		this.d[this.c++] = (byte) arg2;
		this.d[this.c++] = (byte) arg3;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;)V")
	public void a(@OriginalArg(0) Buffer arg0) {
		this.a(arg0, 0, arg0.getSize());
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.d.length <= this.c + 3) {
			this.a();
		}
		this.d[this.c++] = (byte) arg2;
		this.d[this.c++] = (byte) arg1;
		this.d[this.c++] = (byte) arg0;
		this.d[this.c++] = (byte) arg3;
	}
}
