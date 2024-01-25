import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class qa extends Class34 implements Interface5 {

	@OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
	public qa() {
		this.pa();
	}

	@OriginalMember(owner = "client!qa", name = "U", descriptor = "(III)V")
	public native void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "W", descriptor = "(III)V")
	public native void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "YA", descriptor = "(IIIIII)V")
	public native void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "(I)V")
	public native void A(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "ha", descriptor = "(Lclient!c;)V")
	public native void ha(@OriginalArg(0) Class34 arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.oa(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qa", name = "wa", descriptor = "([I)V")
	public native void wa(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!qa", name = "ea", descriptor = "(I)V")
	public native void ea(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "()V")
	public native void p();

	@OriginalMember(owner = "client!qa", name = "K", descriptor = "(III[I)V")
	public native void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static280.method3757(this);
		}
	}

	@OriginalMember(owner = "client!qa", name = "EA", descriptor = "(I)V")
	public native void EA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "pa", descriptor = "()V")
	private native void pa();

	@OriginalMember(owner = "client!qa", name = "ca", descriptor = "(I)V")
	public native void ca(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
	public native void g(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()Lclient!c;")
	@Override
	public Class34 method4361() {
		@Pc(3) qa local3 = new qa();
		local3.ha(this);
		return local3;
	}

	@OriginalMember(owner = "client!qa", name = "oa", descriptor = "(III[I)V")
	private native void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);
}
