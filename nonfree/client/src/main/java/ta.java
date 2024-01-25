import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public final class ta extends Class145 implements Interface12 {

	@OriginalMember(owner = "client!ta", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!a;Lclient!c;II[I[I)V")
	public ta(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		this.DA(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static229.method4115(this);
		}
	}

	@OriginalMember(owner = "client!ta", name = "DA", descriptor = "(Lclient!a;Lclient!c;II[I[I)V")
	private native void DA(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5);

	@OriginalMember(owner = "client!ta", name = "NA", descriptor = "(Z)V")
	public native void NA(@OriginalArg(0) boolean arg0);
}
