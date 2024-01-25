import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public final class ia extends Class17 implements Interface2 {

	@OriginalMember(owner = "client!ia", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!qa;Lclient!na;[IIIII)V")
	public ia(@OriginalArg(0) qa arg0, @OriginalArg(1) na arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.I(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!qa;Lclient!na;IIII)V")
	public ia(@OriginalArg(0) qa arg0, @OriginalArg(1) na arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.H(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ia", name = "T", descriptor = "()I")
	public native int T();

	@OriginalMember(owner = "client!ia", name = "BA", descriptor = "(III)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILclient!ma;II)V")
	@Override
	public void method5773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class73 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.WA(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "(IIIIII)V")
	public native void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ia", name = "EA", descriptor = "()V")
	public native void EA();

	@OriginalMember(owner = "client!ia", name = "la", descriptor = "()I")
	public native int la();

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(FFFFFFIII)V")
	protected native void a(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "(IIIII)V")
	public native void r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ia", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static409.method5378(this);
	}

	@OriginalMember(owner = "client!ia", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "(IIIIIII)V")
	public native void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ia", name = "H", descriptor = "(Lclient!qa;Lclient!na;IIII)V")
	private native void H(@OriginalArg(0) qa arg0, @OriginalArg(1) na arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(FFFFFFLclient!ma;II)V")
	@Override
	protected void method5768(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class73 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.A(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!ia", name = "I", descriptor = "(Lclient!qa;Lclient!na;[IIIII)V")
	private native void I(@OriginalArg(0) qa arg0, @OriginalArg(1) na arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ia", name = "JA", descriptor = "(IIIIIII)V")
	public native void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ia", name = "A", descriptor = "(FFFFFFLclient!ma;II)V")
	private native void A(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class73 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "()I")
	public native int j();

	@OriginalMember(owner = "client!ia", name = "MA", descriptor = "(IIII)V")
	public native void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ia", name = "WA", descriptor = "(IILclient!ma;II)V")
	private native void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class73 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
