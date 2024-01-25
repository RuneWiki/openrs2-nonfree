package jaggl.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaggl/memory/NativeStream")
public final class NativeStream {

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private final NativeBuffer a;

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "I")
	private int b;

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "I")
	private int c;

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "[B")
	private final byte[] d;

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
	private static native byte getLSB(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
	public static native int floatToRawIntBits(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()Z")
	public static boolean a() {
		return getLSB(-65536) == -1;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Lclient!jaggl/memory/NativeBuffer;)V")
	public NativeStream(@OriginalArg(0) NativeBuffer arg0) {
		this(arg0, arg0.a >= 4096 ? 4096 : arg0.a);
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Lclient!jaggl/memory/NativeBuffer;I)V")
	private NativeStream(@OriginalArg(0) NativeBuffer arg0, @OriginalArg(1) int arg1) {
		this.d = new byte[arg1];
		this.a = arg0;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		this.b();
		this.b = arg0;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V")
	public void a(@OriginalArg(0) float arg0) {
		if (this.d.length <= this.c + 3) {
			this.b();
		}
		@Pc(12) int local12 = floatToRawIntBits(arg0);
		this.d[this.c++] = (byte) (local12 >> 24);
		this.d[this.c++] = (byte) (local12 >> 16);
		this.d[this.c++] = (byte) (local12 >> 8);
		this.d[this.c++] = (byte) local12;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V")
	public void b(@OriginalArg(0) float arg0) {
		if (this.c + 3 >= this.d.length) {
			this.b();
		}
		@Pc(16) int local16 = floatToRawIntBits(arg0);
		this.d[this.c++] = (byte) local16;
		this.d[this.c++] = (byte) (local16 >> 8);
		this.d[this.c++] = (byte) (local16 >> 16);
		this.d[this.c++] = (byte) (local16 >> 24);
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V")
	public void b(@OriginalArg(0) int arg0) {
		if (this.d.length <= this.c) {
			this.b();
		}
		this.d[this.c++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()V")
	public void b() {
		if (this.c > 0) {
			this.a.a(this.d, this.b, this.c);
			this.b += this.c;
			this.c = 0;
		}
	}

	@OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()I")
	public int c() {
		return this.c + this.b;
	}
}
