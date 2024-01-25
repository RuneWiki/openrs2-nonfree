import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public final class d extends Class4_Sub1_Sub6 implements Interface10 {

	@OriginalMember(owner = "client!d", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lclient!c;)V")
	public d(@OriginalArg(0) c arg0) {
	}

	@OriginalMember(owner = "client!d", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!d", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static36.method525(this);
		}
	}
}
