import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public final class va extends Class35 implements Interface14 {

	@OriginalMember(owner = "client!va", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!a;Lclient!c;[IIIII)V")
	public va(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.b(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!a;Lclient!c;IIII)V")
	public va(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.a(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!va", name = "ea", descriptor = "(IILclient!pa;II)V")
	private native void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class209 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!va", name = "P", descriptor = "(IIIIII)V")
	public native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!va", name = "DA", descriptor = "(IIIII)V")
	public native void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!va", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!va", name = "KA", descriptor = "(IIII)V")
	public native void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(Lclient!a;Lclient!c;[IIIII)V")
	private native void b(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!va", name = "NA", descriptor = "(Z)V")
	public native void NA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(FFFFFFLclient!pa;II)V")
	@Override
	protected void method7344(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class209 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.v(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!va", name = "CA", descriptor = "(FFFFFFIII)V")
	protected native void CA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!va", name = "c", descriptor = "()I")
	public native int c();

	@OriginalMember(owner = "client!va", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!va", name = "i", descriptor = "(IIIIIII)V")
	public native void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static508.method7434(this);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!a;Lclient!c;IIII)V")
	private native void a(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!va", name = "la", descriptor = "()I")
	public native int la();

	@OriginalMember(owner = "client!va", name = "v", descriptor = "(FFFFFFLclient!pa;II)V")
	private native void v(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class209 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IILclient!pa;II)V")
	@Override
	public void method7345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class209 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.ea(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!va", name = "ra", descriptor = "(IIIIIII)V")
	public native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!va", name = "BA", descriptor = "(III)V")
	public native void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
