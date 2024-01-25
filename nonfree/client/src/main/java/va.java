import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public final class va extends Class102 implements Interface13 {

	@OriginalMember(owner = "client!va", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!w;Lclient!g;II[I[I)V")
	public va(@OriginalArg(0) w arg0, @OriginalArg(1) g arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		this.BA(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!va", name = "p", descriptor = "()V")
	public native void p();

	@OriginalMember(owner = "client!va", name = "BA", descriptor = "(Lclient!w;Lclient!g;II[I[I)V")
	private native void BA(@OriginalArg(0) w arg0, @OriginalArg(1) g arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5);

	@OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static60.method970(this);
		}
	}
}
