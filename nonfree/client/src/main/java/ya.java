import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public final class ya extends Class4_Sub13 implements Interface10 {

	@OriginalMember(owner = "client!ya", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(Lclient!oa;I)V")
	public ya(@OriginalArg(0) oa arg0, @OriginalArg(1) int arg1) {
		this.aa(arg0, arg1);
	}

	@OriginalMember(owner = "client!ya", name = "aa", descriptor = "(Lclient!oa;I)V")
	private native void aa(@OriginalArg(0) oa arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
	public native void r();

	@OriginalMember(owner = "client!ya", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static12.method230(this);
		}
	}

	@OriginalMember(owner = "client!ya", name = "ga", descriptor = "()V")
	public native void ga();
}
