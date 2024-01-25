import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public final class q extends Class2 implements Interface10 {

	@OriginalMember(owner = "client!q", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!c;Lclient!k;[IIIII)V")
	public q(@OriginalArg(0) c arg0, @OriginalArg(1) k arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.da(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!c;Lclient!k;IIII)V")
	public q(@OriginalArg(0) c arg0, @OriginalArg(1) k arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.b(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!q", name = "TA", descriptor = "()I")
	public native int TA();

	@OriginalMember(owner = "client!q", name = "W", descriptor = "(IILclient!i;II)V")
	private native void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class74 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!q", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static36.method525(this);
		}
	}

	@OriginalMember(owner = "client!q", name = "d", descriptor = "()I")
	public native int d();

	@OriginalMember(owner = "client!q", name = "l", descriptor = "(IIII)V")
	public native void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!q", name = "XA", descriptor = "(IIIIIII)V")
	public native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!q", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!q", name = "MA", descriptor = "(FFFFFFLclient!i;II)V")
	private native void MA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class74 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!q", name = "ga", descriptor = "()I")
	public native int ga();

	@OriginalMember(owner = "client!q", name = "D", descriptor = "(IIIIII)V")
	public native void D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!q", name = "J", descriptor = "(III)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IILclient!i;II)V")
	@Override
	public void method5916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class74 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.W(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(FFFFFFLclient!i;II)V")
	@Override
	protected void method5913(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class74 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.MA(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!q", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!q", name = "PA", descriptor = "(IIIIIII)V")
	public native void PA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(Lclient!c;Lclient!k;IIII)V")
	private native void b(@OriginalArg(0) c arg0, @OriginalArg(1) k arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!q", name = "E", descriptor = "(IIIII)V")
	public native void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!q", name = "ta", descriptor = "(FFFFFFIII)V")
	protected native void ta(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!q", name = "da", descriptor = "(Lclient!c;Lclient!k;[IIIII)V")
	private native void da(@OriginalArg(0) c arg0, @OriginalArg(1) k arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);
}
