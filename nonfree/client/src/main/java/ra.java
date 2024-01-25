import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public final class ra extends Class11 implements Interface3 {

	@OriginalMember(owner = "client!ra", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!qa;Lclient!na;[IIIII)V")
	public ra(@OriginalArg(0) qa arg0, @OriginalArg(1) na arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.p(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!qa;Lclient!na;IIII)V")
	public ra(@OriginalArg(0) qa arg0, @OriginalArg(1) na arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.X(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ra", name = "la", descriptor = "()I")
	public native int la();

	@OriginalMember(owner = "client!ra", name = "JA", descriptor = "(IIIIIII)V")
	public native void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ra", name = "T", descriptor = "()I")
	public native int T();

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILclient!ma;II)V")
	@Override
	public void method4396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class119 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.f(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ra", name = "X", descriptor = "(Lclient!qa;Lclient!na;IIII)V")
	private native void X(@OriginalArg(0) qa arg0, @OriginalArg(1) na arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(FFFFFFLclient!ma;II)V")
	@Override
	protected void method4395(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class119 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.g(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "(IIIII)V")
	public native void r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ra", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!ra", name = "MA", descriptor = "(IIII)V")
	public native void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "(IILclient!ma;II)V")
	private native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class119 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "()I")
	public native int j();

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "(IIIIIII)V")
	public native void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "(IIIIII)V")
	public native void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "(FFFFFFLclient!ma;II)V")
	private native void g(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class119 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!ra", name = "BA", descriptor = "(III)V")
	public native void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static125.method2025(this);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(FFFFFFIII)V")
	protected native void a(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "(Lclient!qa;Lclient!na;[IIIII)V")
	private native void p(@OriginalArg(0) qa arg0, @OriginalArg(1) na arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ra", name = "EA", descriptor = "()V")
	public native void EA();
}
