package jaclib.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/memory/Stream")
public final class Stream {

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "x", descriptor = "Z")
	private static final boolean x = getLSB(-65536) == -1;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "p", descriptor = "Lclient!jaclib/memory/Buffer;")
	private Buffer p;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
	private int a;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "g", descriptor = "I")
	private int g;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "l", descriptor = "I")
	private int l;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "h", descriptor = "[B")
	private final byte[] h;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V", line = 16)
	public Stream() {
		this(4096);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V", line = 19)
	private Stream(@OriginalArg(0) int arg0) {
		this.h = new byte[arg0];
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Lclient!jaclib/memory/Buffer;)V", line = 24)
	public Stream(@OriginalArg(0) Buffer arg0) {
		this(arg0, 0, arg0.p());
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Lclient!jaclib/memory/Buffer;II)V", line = 28)
	private Stream(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this(arg0.p() < 4096 ? arg0.p() : 4096);
		this.p(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "p", descriptor = "(Lclient!jaclib/memory/Buffer;II)V", line = 33)
	private void p(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.s();
		this.p = arg0;
		this.g = arg1 * -341042867;
		this.a = (arg2 + arg1) * -1830548123;
		if (this.a * 1902009453 > arg0.p()) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "y", descriptor = "(Lclient!jaclib/memory/Buffer;II)V", line = 33)
	private void y(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.s();
		this.p = arg0;
		this.g = arg1 * -341042867;
		this.a = (arg2 + arg1) * -1830548123;
		if (this.a * 1902009453 > arg0.p()) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(Lclient!jaclib/memory/Buffer;II)V", line = 33)
	private void b(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.s();
		this.p = arg0;
		this.g = arg1 * -341042867;
		this.a = (arg2 + arg1) * -1830548123;
		if (this.a * 1902009453 > arg0.p()) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()I", line = 41)
	public int a() {
		return this.l * -1041214267 + this.g * 1369229189;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()I", line = 41)
	public int c() {
		return this.l * -1041214267 + this.g * 1369229189;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "g", descriptor = "(I)V", line = 45)
	public void g(@OriginalArg(0) int arg0) {
		this.s();
		this.g = arg0 * -341042867;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "z", descriptor = "(I)V", line = 45)
	public void z(@OriginalArg(0) int arg0) {
		this.s();
		this.g = arg0 * -341042867;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "l", descriptor = "(I)V", line = 50)
	public void l(@OriginalArg(0) int arg0) {
		if (this.l * -1041214267 >= this.h.length) {
			this.s();
		}
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "j", descriptor = "(I)V", line = 50)
	public void j(@OriginalArg(0) int arg0) {
		if (this.l * -1041214267 >= this.h.length) {
			this.s();
		}
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "n", descriptor = "(I)V", line = 50)
	public void n(@OriginalArg(0) int arg0) {
		if (this.l * -1041214267 >= this.h.length) {
			this.s();
		}
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V", line = 50)
	public void e(@OriginalArg(0) int arg0) {
		if (this.l * -1041214267 >= this.h.length) {
			this.s();
		}
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "h", descriptor = "(F)V", line = 55)
	public void h(@OriginalArg(0) float arg0) {
		if (this.l * -1041214267 + 3 >= this.h.length) {
			this.s();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) (local14 >> 24);
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) (local14 >> 16);
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) (local14 >> 8);
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) local14;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "r", descriptor = "(F)V", line = 55)
	public void r(@OriginalArg(0) float arg0) {
		if (this.l * -1041214267 + 3 >= this.h.length) {
			this.s();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) (local14 >> 24);
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) (local14 >> 16);
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) (local14 >> 8);
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) local14;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(F)V", line = 55)
	public void d(@OriginalArg(0) float arg0) {
		if (this.l * -1041214267 + 3 >= this.h.length) {
			this.s();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) (local14 >> 24);
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) (local14 >> 16);
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) (local14 >> 8);
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) local14;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "x", descriptor = "(F)V", line = 64)
	public void x(@OriginalArg(0) float arg0) {
		if (this.l * -1041214267 + 3 >= this.h.length) {
			this.s();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) local14;
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) (local14 >> 8);
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) (local14 >> 16);
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) (local14 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "q", descriptor = "(F)V", line = 64)
	public void q(@OriginalArg(0) float arg0) {
		if (this.l * -1041214267 + 3 >= this.h.length) {
			this.s();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) local14;
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) (local14 >> 8);
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) (local14 >> 16);
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) (local14 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "m", descriptor = "(F)V", line = 64)
	public void m(@OriginalArg(0) float arg0) {
		if (this.l * -1041214267 + 3 >= this.h.length) {
			this.s();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) local14;
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) (local14 >> 8);
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) (local14 >> 16);
		this.h[(this.l += -984872435) * -1041214267 - 1] = (byte) (local14 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "s", descriptor = "()V", line = 73)
	public void s() {
		if (this.l * -1041214267 <= 0) {
			return;
		}
		if (this.l * -1041214267 + this.g * 1369229189 > this.a * 1902009453) {
			throw new RuntimeException();
		}
		this.p.g(this.h, 0, this.g * 1369229189, this.l * -1041214267);
		this.g += this.l * -1729315775;
		this.l = 0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "v", descriptor = "()V", line = 73)
	public void v() {
		if (this.l * -1041214267 <= 0) {
			return;
		}
		if (this.l * -1041214267 + this.g * 1369229189 > this.a * 1902009453) {
			throw new RuntimeException();
		}
		this.p.g(this.h, 0, this.g * 1369229189, this.l * -1041214267);
		this.g += this.l * -1729315775;
		this.l = 0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "t", descriptor = "()V", line = 73)
	public void t() {
		if (this.l * -1041214267 <= 0) {
			return;
		}
		if (this.l * -1041214267 + this.g * 1369229189 > this.a * 1902009453) {
			throw new RuntimeException();
		}
		this.p.g(this.h, 0, this.g * 1369229189, this.l * -1041214267);
		this.g += this.l * -1729315775;
		this.l = 0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "u", descriptor = "()Z", line = 82)
	public static final boolean u() {
		return x;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "w", descriptor = "()Z", line = 82)
	public static final boolean w() {
		return x;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "o", descriptor = "()Z", line = 82)
	public static final boolean o() {
		return x;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "i", descriptor = "()Z", line = 82)
	public static final boolean i() {
		return x;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "()Z", line = 82)
	public static final boolean f() {
		return x;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
	public static native int floatToRawIntBits(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
	private static final native byte getLSB(@OriginalArg(0) int arg0);
}
