import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public final class ba extends Class3_Sub4_Sub13 implements Interface4 {

	@OriginalMember(owner = "client!ba", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lclient!oa;)V")
	public ba(@OriginalArg(0) oa arg0) {
	}

	@OriginalMember(owner = "client!ba", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static253.method3959(this);
		}
	}

	@OriginalMember(owner = "client!ba", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);
}
