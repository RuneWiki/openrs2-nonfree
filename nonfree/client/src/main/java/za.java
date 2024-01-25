import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public final class za extends Class146 implements Interface18 {

	@OriginalMember(owner = "client!za", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!za", name = "<init>", descriptor = "(Lclient!l;Lclient!m;II[I[I)V")
	public za(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		this.BA(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!za", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static401.method5840(this);
		}
	}

	@OriginalMember(owner = "client!za", name = "BA", descriptor = "(Lclient!l;Lclient!m;II[I[I)V")
	private native void BA(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5);

	@OriginalMember(owner = "client!za", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);
}
