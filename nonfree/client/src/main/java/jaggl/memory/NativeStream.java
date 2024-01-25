package jaggl.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaggl/memory/NativeStream")
public final class NativeStream {

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "[B")
	private final byte[] a;

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private final NativeBuffer b;

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "I")
	private int c;

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "I")
	private int d;

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
	public static native int floatToRawIntBits(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
	private static native byte getLSB(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()Z")
	public static boolean c() {
		return getLSB(-65536) == -1;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Lclient!jaggl/memory/NativeBuffer;)V")
	public NativeStream(@OriginalArg(0) NativeBuffer arg0) {
		this(arg0, arg0.a >= 4096 ? 4096 : arg0.a);
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Lclient!jaggl/memory/NativeBuffer;I)V")
	private NativeStream(@OriginalArg(0) NativeBuffer arg0, @OriginalArg(1) int arg1) {
		this.b = arg0;
		this.a = new byte[arg1];
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()V")
	public void a() {
		if (this.c > 0) {
			this.b.a(this.a, this.d, this.c);
			this.d += this.c;
			this.c = 0;
		}
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V")
	public void a(@OriginalArg(0) float arg0) {
		if (this.c + 3 >= this.a.length) {
			this.a();
		}
		@Pc(12) int local12 = floatToRawIntBits(arg0);
		this.a[this.c++] = (byte) (local12 >> 24);
		this.a[this.c++] = (byte) (local12 >> 16);
		this.a[this.c++] = (byte) (local12 >> 8);
		this.a[this.c++] = (byte) local12;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		this.a();
		this.d = arg0;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V")
	public void b(@OriginalArg(0) int arg0) {
		if (this.a.length <= this.c) {
			this.a();
		}
		this.a[this.c++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()I")
	public int b() {
		return this.d + this.c;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V")
	public void b(@OriginalArg(0) float arg0) {
		if (this.a.length <= this.c + 3) {
			this.a();
		}
		@Pc(16) int local16 = floatToRawIntBits(arg0);
		this.a[this.c++] = (byte) local16;
		this.a[this.c++] = (byte) (local16 >> 8);
		this.a[this.c++] = (byte) (local16 >> 16);
		this.a[this.c++] = (byte) (local16 >> 24);
	}
}
