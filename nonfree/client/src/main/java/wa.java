import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class wa extends Class134 implements Interface9 {

	@OriginalMember(owner = "client!wa", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
	public wa() {
		this.m();
	}

	@OriginalMember(owner = "client!wa", name = "S", descriptor = "(I)V")
	public native void S(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wa", name = "R", descriptor = "(III[I)V")
	public native void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!wa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static111.method2327(this);
		}
	}

	@OriginalMember(owner = "client!wa", name = "la", descriptor = "(Lclient!q;)V")
	public native void la(@OriginalArg(0) Class134 arg0);

	@OriginalMember(owner = "client!wa", name = "pa", descriptor = "(IIIIII)V")
	public native void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!wa", name = "G", descriptor = "(III)V")
	public native void G(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!wa", name = "GA", descriptor = "(III)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "()V")
	private native void m();

	@OriginalMember(owner = "client!wa", name = "O", descriptor = "([I)V")
	public native void O(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!wa", name = "XA", descriptor = "(I)V")
	public native void XA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class134 method7825() {
		@Pc(3) wa local3 = new wa();
		local3.la(this);
		return local3;
	}

	@OriginalMember(owner = "client!wa", name = "K", descriptor = "(III[I)V")
	private native void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.K(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!wa", name = "Y", descriptor = "()V")
	public native void Y();

	@OriginalMember(owner = "client!wa", name = "H", descriptor = "(Z)V")
	public native void H(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!wa", name = "P", descriptor = "(I)V")
	public native void P(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wa", name = "ra", descriptor = "(I)V")
	public native void ra(@OriginalArg(0) int arg0);
}
