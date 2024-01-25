import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public final class g extends Class74 implements Interface10 {

	@OriginalMember(owner = "client!g", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!c;Lclient!k;II[I[I)V")
	public g(@OriginalArg(0) c arg0, @OriginalArg(1) k arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		this.na(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!g", name = "na", descriptor = "(Lclient!c;Lclient!k;II[I[I)V")
	private native void na(@OriginalArg(0) c arg0, @OriginalArg(1) k arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5);

	@OriginalMember(owner = "client!g", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!g", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static36.method525(this);
		}
	}
}
