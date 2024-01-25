import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public final class n extends Class80 implements Interface5 {

	@OriginalMember(owner = "client!n", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lclient!h;Lclient!ba;[IIIII)V")
	public n(@OriginalArg(0) h arg0, @OriginalArg(1) ba arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.w(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lclient!h;Lclient!ba;IIII)V")
	public n(@OriginalArg(0) h arg0, @OriginalArg(1) ba arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.ia(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!n", name = "W", descriptor = "(IIIIII)V")
	public native void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!n", name = "na", descriptor = "(IILclient!ea;II)V")
	private native void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class62 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!n", name = "ka", descriptor = "(IIII)V")
	public native void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static308.method4437(this);
	}

	@OriginalMember(owner = "client!n", name = "M", descriptor = "(IIIIIII)V")
	public native void M(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!n", name = "w", descriptor = "(Lclient!h;Lclient!ba;[IIIII)V")
	private native void w(@OriginalArg(0) h arg0, @OriginalArg(1) ba arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!n", name = "JA", descriptor = "()I")
	public native int JA();

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IILclient!ea;II)V")
	@Override
	public void method6096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class62 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.na(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!n", name = "aa", descriptor = "(FFFFFFIII)V")
	protected native void aa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!n", name = "D", descriptor = "(IIIIIII)V")
	public native void D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!n", name = "UA", descriptor = "()I")
	public native int UA();

	@OriginalMember(owner = "client!n", name = "ja", descriptor = "()I")
	public native int ja();

	@OriginalMember(owner = "client!n", name = "EA", descriptor = "(FFFFFFLclient!ea;II)V")
	private native void EA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class62 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!n", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!n", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!n", name = "qa", descriptor = "()I")
	public native int qa();

	@OriginalMember(owner = "client!n", name = "YA", descriptor = "(IIIII)V")
	public native void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!n", name = "ia", descriptor = "(Lclient!h;Lclient!ba;IIII)V")
	private native void ia(@OriginalArg(0) h arg0, @OriginalArg(1) ba arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(FFFFFFLclient!ea;II)V")
	@Override
	protected void method6091(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class62 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.EA(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}
}
