import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public final class t extends Class104 implements Interface14 {

	@OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!a;Lclient!c;[IIIII)V")
	public t(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.b(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!a;Lclient!c;IIII)V")
	public t(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.va(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!t", name = "aa", descriptor = "(FFFFFFLclient!pa;II)V")
	private native void aa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class28 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IILclient!pa;II)V")
	@Override
	public void method7711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class28 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.j(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "()I")
	public native int c();

	@OriginalMember(owner = "client!t", name = "NA", descriptor = "(Z)V")
	public native void NA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!t", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static300.method5316(this);
		}
	}

	@OriginalMember(owner = "client!t", name = "la", descriptor = "()I")
	public native int la();

	@OriginalMember(owner = "client!t", name = "BA", descriptor = "(III)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!t", name = "CA", descriptor = "(FFFFFFIII)V")
	protected native void CA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!t", name = "ra", descriptor = "(IIIIIII)V")
	public native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!t", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(Lclient!a;Lclient!c;[IIIII)V")
	private native void b(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!t", name = "KA", descriptor = "(IIII)V")
	public native void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(FFFFFFLclient!pa;II)V")
	@Override
	protected void method7715(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class28 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.aa(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!t", name = "i", descriptor = "(IIIIIII)V")
	public native void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!t", name = "va", descriptor = "(Lclient!a;Lclient!c;IIII)V")
	private native void va(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!t", name = "DA", descriptor = "(IIIII)V")
	public native void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!t", name = "j", descriptor = "(IILclient!pa;II)V")
	private native void j(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class28 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!t", name = "P", descriptor = "(IIIIII)V")
	public native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);
}
