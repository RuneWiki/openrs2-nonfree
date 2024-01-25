import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public final class k extends Class143 implements Interface2 {

	@OriginalMember(owner = "client!k", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!qa;Lclient!na;[I[BIIII)V")
	public k(@OriginalArg(0) qa arg0, @OriginalArg(1) na arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.ra(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!k", name = "EA", descriptor = "()V")
	public native void EA();

	@OriginalMember(owner = "client!k", name = "j", descriptor = "()I")
	public native int j();

	@OriginalMember(owner = "client!k", name = "r", descriptor = "(IIIII)V")
	public native void r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!k", name = "s", descriptor = "(IIIIIII)V")
	public native void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!k", name = "T", descriptor = "()I")
	public native int T();

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(FFFFFFIII)V")
	protected native void a(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!k", name = "BA", descriptor = "(III)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!k", name = "JA", descriptor = "(IIIIIII)V")
	public native void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!k", name = "ra", descriptor = "(Lclient!qa;Lclient!na;[I[BIIII)V")
	private native void ra(@OriginalArg(0) qa arg0, @OriginalArg(1) na arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!k", name = "S", descriptor = "(FFFFFFLclient!ma;II)V")
	private native void S(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class133 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(FFFFFFLclient!ma;II)V")
	@Override
	protected void method5716(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class133 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.S(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!k", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!k", name = "la", descriptor = "()I")
	public native int la();

	@OriginalMember(owner = "client!k", name = "MA", descriptor = "(IIII)V")
	public native void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!k", name = "t", descriptor = "(IIIIII)V")
	@Override
	public void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!k", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static382.method5154(this);
	}

	@OriginalMember(owner = "client!k", name = "Z", descriptor = "(IILclient!ma;II)V")
	private native void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class133 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IILclient!ma;II)V")
	@Override
	public void method5720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class133 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.Z(arg0, arg1, arg2, arg3, arg4);
	}
}
