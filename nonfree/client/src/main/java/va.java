import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public final class va extends Class39 implements Interface21 {

	@OriginalMember(owner = "client!va", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!l;Lclient!m;II)V")
	public va(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.Z(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!l;Lclient!m;[IIIII)V")
	public va(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.FA(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!l;Lclient!m;IIII)V")
	public va(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.W(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!va", name = "E", descriptor = "()I")
	public native int E();

	@OriginalMember(owner = "client!va", name = "da", descriptor = "(IIIIII)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static214.method3448(this);
		}
	}

	@OriginalMember(owner = "client!va", name = "wa", descriptor = "(FFFFFFLclient!ua;II)V")
	private native void wa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class20 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!va", name = "YA", descriptor = "(IIIIIIII)V")
	protected native void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!va", name = "V", descriptor = "(IIIII)V")
	public native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!va", name = "W", descriptor = "(Lclient!l;Lclient!m;IIII)V")
	private native void W(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IILclient!ua;II)V")
	@Override
	public void method7859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.M(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!va", name = "DA", descriptor = "(IIIIIII)V")
	public native void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!va", name = "ca", descriptor = "()I")
	public native int ca();

	@OriginalMember(owner = "client!va", name = "M", descriptor = "(IILclient!ua;II)V")
	private native void M(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!va", name = "A", descriptor = "()I")
	public native int A();

	@OriginalMember(owner = "client!va", name = "Q", descriptor = "(IIII)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!va", name = "FA", descriptor = "(Lclient!l;Lclient!m;[IIIII)V")
	private native void FA(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!va", name = "Z", descriptor = "(Lclient!l;Lclient!m;II)V")
	private native void Z(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!va", name = "qa", descriptor = "(FFFFFFIIII)V")
	protected native void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected void method7856(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class20 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		this.wa(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!va", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!va", name = "xa", descriptor = "(III)V")
	@Override
	public void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!va", name = "u", descriptor = "()I")
	public native int u();
}
