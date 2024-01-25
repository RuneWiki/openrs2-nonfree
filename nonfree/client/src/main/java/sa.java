import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public final class sa extends Class71 implements Interface1 {

	@OriginalMember(owner = "client!sa", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!qa;Lclient!na;II[I[I)V")
	public sa(@OriginalArg(0) qa arg0, @OriginalArg(1) na arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		this.E(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!sa", name = "E", descriptor = "(Lclient!qa;Lclient!na;II[I[I)V")
	private native void E(@OriginalArg(0) qa arg0, @OriginalArg(1) na arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5);

	@OriginalMember(owner = "client!sa", name = "EA", descriptor = "()V")
	public native void EA();

	@OriginalMember(owner = "client!sa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static422.method5678(this);
	}
}
