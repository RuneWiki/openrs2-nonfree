import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class ca extends Class32 implements Interface3 {

	@OriginalMember(owner = "client!ca", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!h;Lclient!ba;II[I[I)V")
	public ca(@OriginalArg(0) h arg0, @OriginalArg(1) ba arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		this.FA(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ca", name = "FA", descriptor = "(Lclient!h;Lclient!ba;II[I[I)V")
	private native void FA(@OriginalArg(0) h arg0, @OriginalArg(1) ba arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5);

	@OriginalMember(owner = "client!ca", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static280.method4134(this);
	}
}
