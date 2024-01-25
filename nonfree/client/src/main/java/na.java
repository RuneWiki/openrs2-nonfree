import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public final class na extends Class2 implements Interface12 {

	@OriginalMember(owner = "client!na", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lclient!c;Lclient!k;[IIIII)V")
	public na(@OriginalArg(0) c arg0, @OriginalArg(1) k arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.JA(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lclient!c;Lclient!k;IIII)V")
	public na(@OriginalArg(0) c arg0, @OriginalArg(1) k arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.BA(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!na", name = "D", descriptor = "(IIIIII)V")
	public native void D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!na", name = "XA", descriptor = "(IIIIIII)V")
	public native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!na", name = "ta", descriptor = "(FFFFFFIII)V")
	protected native void ta(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!na", name = "BA", descriptor = "(Lclient!c;Lclient!k;IIII)V")
	private native void BA(@OriginalArg(0) c arg0, @OriginalArg(1) k arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!na", name = "l", descriptor = "(IIII)V")
	public native void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!na", name = "JA", descriptor = "(Lclient!c;Lclient!k;[IIIII)V")
	private native void JA(@OriginalArg(0) c arg0, @OriginalArg(1) k arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!na", name = "TA", descriptor = "()I")
	public native int TA();

	@OriginalMember(owner = "client!na", name = "E", descriptor = "(IIIII)V")
	public native void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!na", name = "PA", descriptor = "(IIIIIII)V")
	public native void PA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!na", name = "ya", descriptor = "(IILclient!i;II)V")
	private native void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(FFFFFFLclient!i;II)V")
	@Override
	protected void method5836(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class14 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.ja(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!na", name = "ja", descriptor = "(FFFFFFLclient!i;II)V")
	private native void ja(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class14 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!na", name = "d", descriptor = "()I")
	public native int d();

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IILclient!i;II)V")
	@Override
	public void method5833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.ya(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!na", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!na", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!na", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static115.method1851(this);
		}
	}

	@OriginalMember(owner = "client!na", name = "ga", descriptor = "()I")
	public native int ga();

	@OriginalMember(owner = "client!na", name = "J", descriptor = "(III)V")
	public native void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
