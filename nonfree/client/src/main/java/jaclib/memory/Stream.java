package jaclib.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/memory/Stream")
public final class Stream {

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "[B")
	private final byte[] a;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "Lclient!jaclib/memory/Buffer;")
	private Buffer b;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
	private int c;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
	private int d;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
	private int e;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()Z")
	public static boolean c() {
		return getLSB(-65536) == -1;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
	public static native int floatToRawIntBits(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
	private static native byte getLSB(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Lclient!jaclib/memory/Buffer;II)V")
	public Stream(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
		this.a(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Lclient!jaclib/memory/Buffer;)V")
	public Stream(@OriginalArg(0) Buffer arg0) {
		this(arg0, 0, arg0.getSize());
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
	public Stream() {
		this(4096);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
	private Stream(@OriginalArg(0) int arg0) {
		this.a = new byte[arg0];
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		if (this.a.length <= this.d + 1) {
			this.b();
		}
		this.a[this.d++] = (byte) arg0;
		this.a[this.d++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
	public void b(@OriginalArg(0) int arg0) {
		if (this.a.length <= this.d + 3) {
			this.b();
		}
		this.a[this.d++] = (byte) arg0;
		this.a[this.d++] = (byte) (arg0 >> 8);
		this.a[this.d++] = (byte) (arg0 >> 16);
		this.a[this.d++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()I")
	public int a() {
		return this.e + this.d;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
	public void c(@OriginalArg(0) int arg0) {
		this.b();
		this.e = arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
	public void d(@OriginalArg(0) int arg0) {
		if (this.a.length <= this.d) {
			this.b();
		}
		this.a[this.d++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;)V")
	public void a(@OriginalArg(0) Buffer arg0) {
		this.a(arg0, 0, arg0.getSize());
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
	public void e(@OriginalArg(0) int arg0) {
		if (this.d + 1 >= this.a.length) {
			this.b();
		}
		this.a[this.d++] = (byte) (arg0 >> 8);
		this.a[this.d++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
	public void f(@OriginalArg(0) int arg0) {
		if (this.a.length <= this.d + 3) {
			this.b();
		}
		this.a[this.d++] = (byte) (arg0 >> 16);
		this.a[this.d++] = (byte) (arg0 >> 8);
		this.a[this.d++] = (byte) arg0;
		this.a[this.d++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()V")
	public void b() {
		if (this.d <= 0) {
			return;
		}
		if (this.c < this.d + this.e) {
			throw new RuntimeException();
		}
		this.b.a(this.a, 0, this.e, this.d);
		this.e += this.d;
		this.d = 0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
	public void a(@OriginalArg(0) float arg0) {
		if (this.d + 3 >= this.a.length) {
			this.b();
		}
		@Pc(16) int local16 = floatToRawIntBits(arg0);
		this.a[this.d++] = (byte) local16;
		this.a[this.d++] = (byte) (local16 >> 8);
		this.a[this.d++] = (byte) (local16 >> 16);
		this.a[this.d++] = (byte) (local16 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;II)V")
	private void a(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.b();
		this.b = arg0;
		this.c = arg2 + arg1;
		this.e = arg1;
		if (this.c > arg0.getSize()) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
	public void b(@OriginalArg(0) float arg0) {
		if (this.a.length <= this.d + 3) {
			this.b();
		}
		@Pc(12) int local12 = floatToRawIntBits(arg0);
		this.a[this.d++] = (byte) (local12 >> 24);
		this.a[this.d++] = (byte) (local12 >> 16);
		this.a[this.d++] = (byte) (local12 >> 8);
		this.a[this.d++] = (byte) local12;
	}
}
