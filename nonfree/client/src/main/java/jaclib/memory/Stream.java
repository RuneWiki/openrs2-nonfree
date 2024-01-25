package jaclib.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/memory/Stream")
public final class Stream {

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
	private int a;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
	private int b;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "[B")
	private final byte[] c;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
	private int d;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "Lclient!jaclib/memory/Buffer;")
	private Buffer e;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()Z")
	public static boolean a() {
		return getLSB(-65536) == -1;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
	public static native int floatToRawIntBits(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
	private static native byte getLSB(@OriginalArg(0) int arg0);

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
		this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
		this.a(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
	private Stream(@OriginalArg(0) int arg0) {
		this.c = new byte[arg0];
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()V")
	public void b() {
		if (this.b <= 0) {
			return;
		}
		if (this.b + this.a > this.d) {
			throw new RuntimeException();
		}
		this.e.a(this.c, 0, this.a, this.b);
		this.a += this.b;
		this.b = 0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		if (this.b >= this.c.length) {
			this.b();
		}
		this.c[this.b++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;)V")
	public void a(@OriginalArg(0) Buffer arg0) {
		this.a(arg0, 0, arg0.getSize());
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
	public void a(@OriginalArg(0) float arg0) {
		if (this.b + 3 >= this.c.length) {
			this.b();
		}
		@Pc(12) int local12 = floatToRawIntBits(arg0);
		this.c[this.b++] = (byte) (local12 >> 24);
		this.c[this.b++] = (byte) (local12 >> 16);
		this.c[this.b++] = (byte) (local12 >> 8);
		this.c[this.b++] = (byte) local12;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()I")
	public int c() {
		return this.a + this.b;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;II)V")
	private void a(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.b();
		this.a = arg1;
		this.e = arg0;
		this.d = arg1 + arg2;
		if (this.d > arg0.getSize()) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
	public void b(@OriginalArg(0) float arg0) {
		if (this.c.length <= this.b + 3) {
			this.b();
		}
		@Pc(16) int local16 = floatToRawIntBits(arg0);
		this.c[this.b++] = (byte) local16;
		this.c[this.b++] = (byte) (local16 >> 8);
		this.c[this.b++] = (byte) (local16 >> 16);
		this.c[this.b++] = (byte) (local16 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
	public void b(@OriginalArg(0) int arg0) {
		if (this.c.length <= this.b + 3) {
			this.b();
		}
		this.c[this.b++] = (byte) (arg0 >> 16);
		this.c[this.b++] = (byte) (arg0 >> 8);
		this.c[this.b++] = (byte) arg0;
		this.c[this.b++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
	public void c(@OriginalArg(0) int arg0) {
		this.b();
		this.a = arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.b + 3 >= this.c.length) {
			this.b();
		}
		this.c[this.b++] = (byte) arg2;
		this.c[this.b++] = (byte) arg1;
		this.c[this.b++] = (byte) arg0;
		this.c[this.b++] = (byte) arg3;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
	public void d(@OriginalArg(0) int arg0) {
		if (this.c.length <= this.b + 3) {
			this.b();
		}
		this.c[this.b++] = (byte) arg0;
		this.c[this.b++] = (byte) (arg0 >> 8);
		this.c[this.b++] = (byte) (arg0 >> 16);
		this.c[this.b++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
	public void e(@OriginalArg(0) int arg0) {
		if (this.c.length <= this.b + 1) {
			this.b();
		}
		this.c[this.b++] = (byte) arg0;
		this.c[this.b++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
	public void f(@OriginalArg(0) int arg0) {
		if (this.b + 1 >= this.c.length) {
			this.b();
		}
		this.c[this.b++] = (byte) (arg0 >> 8);
		this.c[this.b++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.c.length <= this.b + 3) {
			this.b();
		}
		this.c[this.b++] = (byte) arg0;
		this.c[this.b++] = (byte) arg1;
		this.c[this.b++] = (byte) arg2;
		this.c[this.b++] = (byte) arg3;
	}
}
