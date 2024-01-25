import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class q extends Class78 implements Interface9 {

	@OriginalMember(owner = "client!q", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
	public q() {
		this.i();
	}

	@OriginalMember(owner = "client!q", name = "ha", descriptor = "()V")
	public native void ha();

	@OriginalMember(owner = "client!q", name = "NA", descriptor = "(Z)V")
	public native void NA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!q", name = "va", descriptor = "([I)V")
	public native void va(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!q", name = "B", descriptor = "(IIIIII)V")
	public native void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!q", name = "a", descriptor = "()Lclient!m;")
	@Override
	public Class78 method5707() {
		@Pc(3) q local3 = new q();
		local3.EA(this);
		return local3;
	}

	@OriginalMember(owner = "client!q", name = "ma", descriptor = "(I)V")
	public native void ma(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!q", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!q", name = "i", descriptor = "()V")
	private native void i();

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.c(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!q", name = "oa", descriptor = "(III)V")
	public native void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!q", name = "KA", descriptor = "(I)V")
	public native void KA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!q", name = "ta", descriptor = "(I)V")
	public native void ta(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!q", name = "EA", descriptor = "(Lclient!m;)V")
	public native void EA(@OriginalArg(0) Class78 arg0);

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(III[I)V")
	private native void c(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!q", name = "XA", descriptor = "(I)V")
	public native void XA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!q", name = "TA", descriptor = "(III)V")
	public native void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!q", name = "I", descriptor = "(III[I)V")
	public native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!q", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static351.method5441(this);
		}
	}
}
