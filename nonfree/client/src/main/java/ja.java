import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class ja extends Class11 implements Interface12 {

	@OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
	public ja() {
		this.Y();
	}

	@OriginalMember(owner = "client!ja", name = "J", descriptor = "(III)V")
	public native void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ja", name = "ya", descriptor = "(Lclient!n;)V")
	public native void ya(@OriginalArg(0) Class11 arg0);

	@OriginalMember(owner = "client!ja", name = "M", descriptor = "([I)V")
	public native void M(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ja", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ja", name = "ba", descriptor = "(I)V")
	public native void ba(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "()Lclient!n;")
	@Override
	public Class11 method2905() {
		@Pc(3) ja local3 = new ja();
		local3.ya(this);
		return local3;
	}

	@OriginalMember(owner = "client!ja", name = "C", descriptor = "(III)V")
	public native void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ja", name = "SA", descriptor = "(I)V")
	public native void SA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ja", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!ja", name = "CA", descriptor = "(I)V")
	public native void CA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ja", name = "IA", descriptor = "(IIIIII)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ja", name = "KA", descriptor = "(III[I)V")
	private native void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static115.method1851(this);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V")
	@Override
	public void method2902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.KA(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ja", name = "WA", descriptor = "(I)V")
	public native void WA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ja", name = "N", descriptor = "(III[I)V")
	public native void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ja", name = "Y", descriptor = "()V")
	private native void Y();

	@OriginalMember(owner = "client!ja", name = "K", descriptor = "()V")
	public native void K();
}
