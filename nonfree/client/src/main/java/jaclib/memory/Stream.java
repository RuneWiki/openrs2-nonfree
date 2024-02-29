package jaclib.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/memory/Stream")
public final class Stream {

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "w", descriptor = "Z")
	private static final boolean w = getLSB(-65536) == -1;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "p", descriptor = "Lclient!jaclib/memory/Buffer;")
	private Buffer p;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
	private int c;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "v", descriptor = "I")
	private int v;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "l", descriptor = "I")
	private int l;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "y", descriptor = "[B")
	private final byte[] y;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V", line = 16)
	public Stream() {
		this(4096);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V", line = 19)
	private Stream(@OriginalArg(0) int arg0) {
		this.y = new byte[arg0];
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
		this.t();
		this.p = arg0;
		this.v = arg1 * 1013405667;
		this.c = (arg2 + arg1) * 211248213;
		if (this.c * -1007519491 > arg0.p()) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "x", descriptor = "(Lclient!jaclib/memory/Buffer;II)V", line = 33)
	private void x(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.t();
		this.p = arg0;
		this.v = arg1 * 1013405667;
		this.c = (arg2 + arg1) * 211248213;
		if (this.c * -1007519491 > arg0.p()) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(Lclient!jaclib/memory/Buffer;II)V", line = 33)
	private void d(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.t();
		this.p = arg0;
		this.v = arg1 * 1013405667;
		this.c = (arg2 + arg1) * 211248213;
		if (this.c * -1007519491 > arg0.p()) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "s", descriptor = "(Lclient!jaclib/memory/Buffer;II)V", line = 33)
	private void s(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.t();
		this.p = arg0;
		this.v = arg1 * 1013405667;
		this.c = (arg2 + arg1) * 211248213;
		if (this.c * -1007519491 > arg0.p()) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()I", line = 41)
	public int c() {
		return this.v * 1148757451 + this.l * 1868891865;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "r", descriptor = "()I", line = 41)
	public int r() {
		return this.v * 1148757451 + this.l * 1868891865;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "g", descriptor = "()I", line = 41)
	public int g() {
		return this.v * 1148757451 + this.l * 1868891865;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "v", descriptor = "(I)V", line = 45)
	public void v(@OriginalArg(0) int arg0) {
		this.t();
		this.v = arg0 * 1013405667;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "z", descriptor = "(I)V", line = 45)
	public void z(@OriginalArg(0) int arg0) {
		this.t();
		this.v = arg0 * 1013405667;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "j", descriptor = "(I)V", line = 45)
	public void j(@OriginalArg(0) int arg0) {
		this.t();
		this.v = arg0 * 1013405667;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "l", descriptor = "(I)V", line = 50)
	public void l(@OriginalArg(0) int arg0) {
		if (this.l * 1868891865 >= this.y.length) {
			this.t();
		}
		this.y[(this.l += 334305641) * 1868891865 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "i", descriptor = "(I)V", line = 50)
	public void i(@OriginalArg(0) int arg0) {
		if (this.l * 1868891865 >= this.y.length) {
			this.t();
		}
		this.y[(this.l += 334305641) * 1868891865 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "k", descriptor = "(I)V", line = 50)
	public void k(@OriginalArg(0) int arg0) {
		if (this.l * 1868891865 >= this.y.length) {
			this.t();
		}
		this.y[(this.l += 334305641) * 1868891865 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "u", descriptor = "(I)V", line = 50)
	public void u(@OriginalArg(0) int arg0) {
		if (this.l * 1868891865 >= this.y.length) {
			this.t();
		}
		this.y[(this.l += 334305641) * 1868891865 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V", line = 50)
	public void e(@OriginalArg(0) int arg0) {
		if (this.l * 1868891865 >= this.y.length) {
			this.t();
		}
		this.y[(this.l += 334305641) * 1868891865 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "y", descriptor = "(F)V", line = 55)
	public void y(@OriginalArg(0) float arg0) {
		if (this.l * 1868891865 + 3 >= this.y.length) {
			this.t();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.y[(this.l += 334305641) * 1868891865 - 1] = (byte) (local14 >> 24);
		this.y[(this.l += 334305641) * 1868891865 - 1] = (byte) (local14 >> 16);
		this.y[(this.l += 334305641) * 1868891865 - 1] = (byte) (local14 >> 8);
		this.y[(this.l += 334305641) * 1868891865 - 1] = (byte) local14;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(F)V", line = 55)
	public void f(@OriginalArg(0) float arg0) {
		if (this.l * 1868891865 + 3 >= this.y.length) {
			this.t();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.y[(this.l += 334305641) * 1868891865 - 1] = (byte) (local14 >> 24);
		this.y[(this.l += 334305641) * 1868891865 - 1] = (byte) (local14 >> 16);
		this.y[(this.l += 334305641) * 1868891865 - 1] = (byte) (local14 >> 8);
		this.y[(this.l += 334305641) * 1868891865 - 1] = (byte) local14;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "w", descriptor = "(F)V", line = 64)
	public void w(@OriginalArg(0) float arg0) {
		if (this.l * 1868891865 + 3 >= this.y.length) {
			this.t();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.y[(this.l += 334305641) * 1868891865 - 1] = (byte) local14;
		this.y[(this.l += 334305641) * 1868891865 - 1] = (byte) (local14 >> 8);
		this.y[(this.l += 334305641) * 1868891865 - 1] = (byte) (local14 >> 16);
		this.y[(this.l += 334305641) * 1868891865 - 1] = (byte) (local14 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "o", descriptor = "(F)V", line = 64)
	public void o(@OriginalArg(0) float arg0) {
		if (this.l * 1868891865 + 3 >= this.y.length) {
			this.t();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.y[(this.l += 334305641) * 1868891865 - 1] = (byte) local14;
		this.y[(this.l += 334305641) * 1868891865 - 1] = (byte) (local14 >> 8);
		this.y[(this.l += 334305641) * 1868891865 - 1] = (byte) (local14 >> 16);
		this.y[(this.l += 334305641) * 1868891865 - 1] = (byte) (local14 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "t", descriptor = "()V", line = 73)
	public void t() {
		if (this.l * 1868891865 <= 0) {
			return;
		}
		if (this.l * 1868891865 + this.v * 1148757451 > this.c * -1007519491) {
			throw new RuntimeException();
		}
		this.p.v(this.y, 0, this.v * 1148757451, this.l * 1868891865);
		this.v += this.l * -1187524245;
		this.l = 0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "q", descriptor = "()Z", line = 82)
	public static final boolean q() {
		return w;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()Z", line = 82)
	public static final boolean b() {
		return w;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "n", descriptor = "()Z", line = 82)
	public static final boolean n() {
		return w;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()Z", line = 82)
	public static final boolean a() {
		return w;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
	public static native int floatToRawIntBits(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
	private static final native byte getLSB(@OriginalArg(0) int arg0);
}
