import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public final class t extends Class39 implements Interface21 {

	@OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!l;Lclient!m;II)V")
	public t(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.HA(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!l;Lclient!m;[IIIII)V")
	public t(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.d(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!l;Lclient!m;IIII)V")
	public t(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.l(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!t", name = "xa", descriptor = "(III)V")
	public native void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!t", name = "u", descriptor = "()I")
	public native int u();

	@OriginalMember(owner = "client!t", name = "l", descriptor = "(Lclient!l;Lclient!m;IIII)V")
	private native void l(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!t", name = "ca", descriptor = "()I")
	public native int ca();

	@OriginalMember(owner = "client!t", name = "Q", descriptor = "(IIII)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!t", name = "HA", descriptor = "(Lclient!l;Lclient!m;II)V")
	private native void HA(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!t", name = "A", descriptor = "()I")
	public native int A();

	@OriginalMember(owner = "client!t", name = "DA", descriptor = "(IIIIIII)V")
	public native void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IILclient!ua;II)V")
	@Override
	public void method7859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.JA(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!t", name = "W", descriptor = "(FFFFFFLclient!ua;II)V")
	private native void W(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class20 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static214.method3448(this);
		}
	}

	@OriginalMember(owner = "client!t", name = "V", descriptor = "(IIIII)V")
	public native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!t", name = "YA", descriptor = "(IIIIIIII)V")
	protected native void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!t", name = "JA", descriptor = "(IILclient!ua;II)V")
	private native void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected void method7856(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class20 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		this.W(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!t", name = "qa", descriptor = "(FFFFFFIIII)V")
	protected native void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9);

	@OriginalMember(owner = "client!t", name = "da", descriptor = "(IIIIII)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(Lclient!l;Lclient!m;[IIIII)V")
	private native void d(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!t", name = "E", descriptor = "()I")
	public native int E();

	@OriginalMember(owner = "client!t", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);
}
