import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public final class f extends Class86 implements Interface9 {

	@OriginalMember(owner = "client!f", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!da;Lclient!a;II[I[I)V")
	public f(@OriginalArg(0) da arg0, @OriginalArg(1) a arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		this.ba(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!f", name = "H", descriptor = "(Z)V")
	public native void H(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!f", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static184.method3380(this);
		}
	}

	@OriginalMember(owner = "client!f", name = "ba", descriptor = "(Lclient!da;Lclient!a;II[I[I)V")
	private native void ba(@OriginalArg(0) da arg0, @OriginalArg(1) a arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5);
}
