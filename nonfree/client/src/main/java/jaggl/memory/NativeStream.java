package jaggl.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaggl/memory/NativeStream")
public final class NativeStream {

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "I")
	private int a;

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "I")
	private int b;

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "[B")
	private final byte[] c;

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private final NativeBuffer d;

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
	private static native byte getLSB(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()Z")
	public static boolean b() {
		return getLSB(-65536) == -1;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
	public static native int floatToRawIntBits(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Lclient!jaggl/memory/NativeBuffer;)V")
	public NativeStream(@OriginalArg(0) NativeBuffer arg0) {
		this(arg0, arg0.c >= 4096 ? 4096 : arg0.c);
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Lclient!jaggl/memory/NativeBuffer;I)V")
	private NativeStream(@OriginalArg(0) NativeBuffer arg0, @OriginalArg(1) int arg1) {
		this.d = arg0;
		this.c = new byte[arg1];
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V")
	public void a(@OriginalArg(0) float arg0) {
		if (this.c.length <= this.b + 3) {
			this.c();
		}
		@Pc(16) int local16 = floatToRawIntBits(arg0);
		this.c[this.b++] = (byte) local16;
		this.c[this.b++] = (byte) (local16 >> 8);
		this.c[this.b++] = (byte) (local16 >> 16);
		this.c[this.b++] = (byte) (local16 >> 24);
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()I")
	public int a() {
		return this.a + this.b;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		this.c();
		this.a = arg0;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V")
	public void b(@OriginalArg(0) float arg0) {
		if (this.b + 3 >= this.c.length) {
			this.c();
		}
		@Pc(16) int local16 = floatToRawIntBits(arg0);
		this.c[this.b++] = (byte) (local16 >> 24);
		this.c[this.b++] = (byte) (local16 >> 16);
		this.c[this.b++] = (byte) (local16 >> 8);
		this.c[this.b++] = (byte) local16;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V")
	public void b(@OriginalArg(0) int arg0) {
		if (this.c.length <= this.b) {
			this.c();
		}
		this.c[this.b++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()V")
	public void c() {
		if (this.b > 0) {
			this.d.a(this.c, this.a, this.b);
			this.a += this.b;
			this.b = 0;
		}
	}
}
