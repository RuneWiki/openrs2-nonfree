package jaggl.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaggl/memory/NativeStream")
public final class NativeStream {

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "[B")
	private final byte[] a;

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "I")
	private int b;

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private final NativeBuffer c;

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "I")
	private int d;

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
	private static native byte getLSB(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
	public static native int floatToRawIntBits(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()Z")
	public static boolean c() {
		return getLSB(-65536) == -1;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Lclient!jaggl/memory/NativeBuffer;)V")
	public NativeStream(@OriginalArg(0) NativeBuffer arg0) {
		this(arg0, arg0.b < 4096 ? arg0.b : 4096);
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Lclient!jaggl/memory/NativeBuffer;I)V")
	private NativeStream(@OriginalArg(0) NativeBuffer arg0, @OriginalArg(1) int arg1) {
		this.c = arg0;
		this.a = new byte[arg1];
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()I")
	public int a() {
		return this.b + this.d;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		if (this.b >= this.a.length) {
			this.b();
		}
		this.a[this.b++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V")
	public void b(@OriginalArg(0) int arg0) {
		this.b();
		this.d = arg0;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V")
	public void a(@OriginalArg(0) float arg0) {
		if (this.a.length <= this.b + 3) {
			this.b();
		}
		@Pc(16) int local16 = floatToRawIntBits(arg0);
		this.a[this.b++] = (byte) local16;
		this.a[this.b++] = (byte) (local16 >> 8);
		this.a[this.b++] = (byte) (local16 >> 16);
		this.a[this.b++] = (byte) (local16 >> 24);
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V")
	public void b(@OriginalArg(0) float arg0) {
		if (this.a.length <= this.b + 3) {
			this.b();
		}
		@Pc(12) int local12 = floatToRawIntBits(arg0);
		this.a[this.b++] = (byte) (local12 >> 24);
		this.a[this.b++] = (byte) (local12 >> 16);
		this.a[this.b++] = (byte) (local12 >> 8);
		this.a[this.b++] = (byte) local12;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()V")
	public void b() {
		if (this.b > 0) {
			this.c.a(this.a, this.d, this.b);
			this.d += this.b;
			this.b = 0;
		}
	}
}
