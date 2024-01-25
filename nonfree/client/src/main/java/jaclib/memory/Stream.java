package jaclib.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/memory/Stream")
public final class Stream {

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
	private int c;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "[B")
	private final byte[] b;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "Lclient!jaclib/memory/Buffer;")
	private Buffer d;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
	private int a;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
	private int e;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()Z")
	public static boolean b() {
		return getLSB(-65536) == -1;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
	public static native int floatToRawIntBits(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
	private static native byte getLSB(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
	public Stream() {
		this(4096);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Lclient!jaclib/memory/Buffer;)V")
	public Stream(@OriginalArg(0) Buffer arg0) {
		this(arg0, 0, arg0.getSize());
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Lclient!jaclib/memory/Buffer;II)V")
	public Stream(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
		this.a(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
	private Stream(@OriginalArg(0) int arg0) {
		this.b = new byte[arg0];
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()I")
	public int c() {
		return this.a + this.e;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
	public void e(@OriginalArg(0) int arg0) {
		if (this.b.length <= this.a + 3) {
			this.a();
		}
		this.b[this.a++] = (byte) (arg0 >> 16);
		this.b[this.a++] = (byte) (arg0 >> 8);
		this.b[this.a++] = (byte) arg0;
		this.b[this.a++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
	public void b(@OriginalArg(0) int arg0) {
		if (this.b.length <= this.a + 1) {
			this.a();
		}
		this.b[this.a++] = (byte) (arg0 >> 8);
		this.b[this.a++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
	public void d(@OriginalArg(0) int arg0) {
		this.a();
		this.e = arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;II)V")
	private void a(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.a();
		this.c = arg1 + arg2;
		this.e = arg1;
		this.d = arg0;
		if (this.c > arg0.getSize()) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		if (this.a + 1 >= this.b.length) {
			this.a();
		}
		this.b[this.a++] = (byte) arg0;
		this.b[this.a++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()V")
	public void a() {
		if (this.a <= 0) {
			return;
		}
		if (this.a + this.e > this.c) {
			throw new RuntimeException();
		}
		this.d.a(this.b, 0, this.e, this.a);
		this.e += this.a;
		this.a = 0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.b.length <= this.a + 3) {
			this.a();
		}
		this.b[this.a++] = (byte) arg0;
		this.b[this.a++] = (byte) arg1;
		this.b[this.a++] = (byte) arg2;
		this.b[this.a++] = (byte) arg3;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
	public void a(@OriginalArg(0) float arg0) {
		if (this.a + 3 >= this.b.length) {
			this.a();
		}
		@Pc(18) int local18 = floatToRawIntBits(arg0);
		this.b[this.a++] = (byte) (local18 >> 24);
		this.b[this.a++] = (byte) (local18 >> 16);
		this.b[this.a++] = (byte) (local18 >> 8);
		this.b[this.a++] = (byte) local18;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
	public void c(@OriginalArg(0) int arg0) {
		if (this.a >= this.b.length) {
			this.a();
		}
		this.b[this.a++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.a + 3 >= this.b.length) {
			this.a();
		}
		this.b[this.a++] = (byte) arg2;
		this.b[this.a++] = (byte) arg1;
		this.b[this.a++] = (byte) arg0;
		this.b[this.a++] = (byte) arg3;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
	public void f(@OriginalArg(0) int arg0) {
		if (this.b.length <= this.a + 3) {
			this.a();
		}
		this.b[this.a++] = (byte) arg0;
		this.b[this.a++] = (byte) (arg0 >> 8);
		this.b[this.a++] = (byte) (arg0 >> 16);
		this.b[this.a++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
	public void b(@OriginalArg(0) float arg0) {
		if (this.b.length <= this.a + 3) {
			this.a();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.b[this.a++] = (byte) local14;
		this.b[this.a++] = (byte) (local14 >> 8);
		this.b[this.a++] = (byte) (local14 >> 16);
		this.b[this.a++] = (byte) (local14 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;)V")
	public void a(@OriginalArg(0) Buffer arg0) {
		this.a(arg0, 0, arg0.getSize());
	}
}
