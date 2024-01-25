import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public final class q extends Class13 implements Interface8 {

	@OriginalMember(owner = "client!q", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!w;Lclient!g;[I[BIIII)V")
	public q(@OriginalArg(0) w arg0, @OriginalArg(1) g arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.DA(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!q", name = "p", descriptor = "()V")
	public native void p();

	@OriginalMember(owner = "client!q", name = "YA", descriptor = "()I")
	public native int YA();

	@OriginalMember(owner = "client!q", name = "W", descriptor = "(IIIII)V")
	public native void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!q", name = "ha", descriptor = "(IIII)V")
	public native void ha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!q", name = "XA", descriptor = "(IIIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!q", name = "DA", descriptor = "(Lclient!w;Lclient!g;[I[BIIII)V")
	private native void DA(@OriginalArg(0) w arg0, @OriginalArg(1) g arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!q", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static1.method4(this);
		}
	}

	@OriginalMember(owner = "client!q", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!q", name = "XA", descriptor = "(IILclient!ta;II)V")
	private native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!q", name = "Q", descriptor = "()I")
	public native int Q();

	@OriginalMember(owner = "client!q", name = "Z", descriptor = "(FFFFFFLclient!ta;II)V")
	private native void Z(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class35 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!q", name = "H", descriptor = "(FFFFFFIII)V")
	protected native void H(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(FFFFFFLclient!ta;II)V")
	@Override
	protected void method5663(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class35 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.Z(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!q", name = "la", descriptor = "(IIIIIII)V")
	public native void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IILclient!ta;II)V")
	@Override
	public void method5666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.XA(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!q", name = "ZA", descriptor = "()I")
	public native int ZA();

	@OriginalMember(owner = "client!q", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!q", name = "ya", descriptor = "(IIIIIII)V")
	public native void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);
}
