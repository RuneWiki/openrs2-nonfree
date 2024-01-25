import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class ra extends Class34 implements Interface19 {

	@OriginalMember(owner = "client!ra", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
	public ra() {
		this.ja();
	}

	@OriginalMember(owner = "client!ra", name = "AA", descriptor = "(I)V")
	public native void AA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ra", name = "ZA", descriptor = "(I)V")
	public native void ZA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ra", name = "M", descriptor = "(Lclient!q;)V")
	public native void M(@OriginalArg(0) Class34 arg0);

	@OriginalMember(owner = "client!ra", name = "B", descriptor = "(III[I)V")
	public native void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static37.method673(this);
		}
	}

	@OriginalMember(owner = "client!ra", name = "YA", descriptor = "([I)V")
	public native void YA(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ra", name = "oa", descriptor = "(I)V")
	public native void oa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ra", name = "Y", descriptor = "()V")
	public native void Y();

	@OriginalMember(owner = "client!ra", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ra", name = "na", descriptor = "(IIIIII)V")
	public native void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class34 method6215() {
		@Pc(3) ra local3 = new ra();
		local3.M(this);
		return local3;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.S(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ra", name = "ja", descriptor = "()V")
	private native void ja();

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "(I)V")
	public native void w(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "(I)V")
	public native void o(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ra", name = "J", descriptor = "(I)V")
	public native void J(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ra", name = "U", descriptor = "(III)V")
	public native void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ra", name = "S", descriptor = "(III[I)V")
	private native void S(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ra", name = "NA", descriptor = "(III)V")
	public native void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ra", name = "wa", descriptor = "(III[I)V")
	public native void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);
}
