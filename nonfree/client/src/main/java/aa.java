import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public final class aa extends Class4 implements Interface9 {

	@OriginalMember(owner = "client!aa", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!da;Lclient!a;[IIIII)V")
	public aa(@OriginalArg(0) da arg0, @OriginalArg(1) a arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.WA(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!da;Lclient!a;IIII)V")
	public aa(@OriginalArg(0) da arg0, @OriginalArg(1) a arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.E(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "()I")
	public native int b();

	@OriginalMember(owner = "client!aa", name = "QA", descriptor = "()I")
	public native int QA();

	@OriginalMember(owner = "client!aa", name = "E", descriptor = "(Lclient!da;Lclient!a;IIII)V")
	private native void E(@OriginalArg(0) da arg0, @OriginalArg(1) a arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!aa", name = "va", descriptor = "(IILclient!fa;II)V")
	private native void va(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(FFFFFFLclient!fa;II)V")
	@Override
	protected void method6508(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class16 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.JA(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!aa", name = "ba", descriptor = "(IIIIIII)V")
	public native void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!aa", name = "H", descriptor = "(Z)V")
	public native void H(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!aa", name = "EA", descriptor = "(IIII)V")
	public native void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!aa", name = "t", descriptor = "(III)V")
	public native void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!aa", name = "AA", descriptor = "()I")
	public native int AA();

	@OriginalMember(owner = "client!aa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static211.method3132(this);
		}
	}

	@OriginalMember(owner = "client!aa", name = "GA", descriptor = "(IIIIII)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!aa", name = "I", descriptor = "(IIIII)V")
	public native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "()I")
	public native int a();

	@OriginalMember(owner = "client!aa", name = "sa", descriptor = "(FFFFFFIII)V")
	protected native void sa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILclient!fa;II)V")
	@Override
	public void method6510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.va(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aa", name = "KA", descriptor = "(IIIIIII)V")
	public native void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!aa", name = "WA", descriptor = "(Lclient!da;Lclient!a;[IIIII)V")
	private native void WA(@OriginalArg(0) da arg0, @OriginalArg(1) a arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!aa", name = "JA", descriptor = "(FFFFFFLclient!fa;II)V")
	private native void JA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class16 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);
}
