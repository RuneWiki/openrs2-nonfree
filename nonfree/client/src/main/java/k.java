import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public final class k extends Class80 implements Interface5 {

	@OriginalMember(owner = "client!k", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!h;Lclient!ba;[IIIII)V")
	public k(@OriginalArg(0) h arg0, @OriginalArg(1) ba arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.s(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!h;Lclient!ba;IIII)V")
	public k(@OriginalArg(0) h arg0, @OriginalArg(1) ba arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.O(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!k", name = "W", descriptor = "(IIIIII)V")
	public native void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!k", name = "aa", descriptor = "(FFFFFFIII)V")
	protected native void aa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(FFFFFFLclient!ea;II)V")
	@Override
	protected void method6091(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class62 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.n(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!k", name = "V", descriptor = "(III)V")
	public native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!k", name = "ja", descriptor = "()I")
	public native int ja();

	@OriginalMember(owner = "client!k", name = "JA", descriptor = "()I")
	public native int JA();

	@OriginalMember(owner = "client!k", name = "s", descriptor = "(Lclient!h;Lclient!ba;[IIIII)V")
	private native void s(@OriginalArg(0) h arg0, @OriginalArg(1) ba arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!k", name = "M", descriptor = "(IIIIIII)V")
	public native void M(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!k", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static308.method4437(this);
	}

	@OriginalMember(owner = "client!k", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!k", name = "O", descriptor = "(Lclient!h;Lclient!ba;IIII)V")
	private native void O(@OriginalArg(0) h arg0, @OriginalArg(1) ba arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!k", name = "n", descriptor = "(FFFFFFLclient!ea;II)V")
	private native void n(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class62 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!k", name = "D", descriptor = "(IIIIIII)V")
	public native void D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!k", name = "qa", descriptor = "()I")
	public native int qa();

	@OriginalMember(owner = "client!k", name = "r", descriptor = "(IILclient!ea;II)V")
	private native void r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class62 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!k", name = "UA", descriptor = "()I")
	public native int UA();

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IILclient!ea;II)V")
	@Override
	public void method6096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class62 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.r(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!k", name = "YA", descriptor = "(IIIII)V")
	public native void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!k", name = "ka", descriptor = "(IIII)V")
	public native void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
