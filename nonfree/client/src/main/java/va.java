import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public final class va extends Class2 implements Interface10 {

	@OriginalMember(owner = "client!va", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!c;Lclient!k;[I[BIIII)V")
	public va(@OriginalArg(0) c arg0, @OriginalArg(1) k arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.sa(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!va", name = "D", descriptor = "(IIIIII)V")
	@Override
	public void D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!va", name = "XA", descriptor = "(IIIIIII)V")
	public native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(FFFFFFLclient!i;II)V")
	@Override
	protected void method5913(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class74 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.G(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!va", name = "ta", descriptor = "(FFFFFFIII)V")
	protected native void ta(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!va", name = "ga", descriptor = "()I")
	public native int ga();

	@OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static36.method525(this);
		}
	}

	@OriginalMember(owner = "client!va", name = "G", descriptor = "(FFFFFFLclient!i;II)V")
	private native void G(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class74 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!va", name = "d", descriptor = "()I")
	public native int d();

	@OriginalMember(owner = "client!va", name = "LA", descriptor = "(IILclient!i;II)V")
	private native void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class74 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!va", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!va", name = "E", descriptor = "(IIIII)V")
	public native void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!va", name = "sa", descriptor = "(Lclient!c;Lclient!k;[I[BIIII)V")
	private native void sa(@OriginalArg(0) c arg0, @OriginalArg(1) k arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!va", name = "TA", descriptor = "()I")
	public native int TA();

	@OriginalMember(owner = "client!va", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!va", name = "J", descriptor = "(III)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!va", name = "PA", descriptor = "(IIIIIII)V")
	public native void PA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IILclient!i;II)V")
	@Override
	public void method5916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class74 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.LA(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!va", name = "l", descriptor = "(IIII)V")
	public native void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
