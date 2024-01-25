import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public final class h extends Class2_Sub2_Sub8 implements Interface18 {

	@OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lclient!l;)V")
	public h(@OriginalArg(0) l arg0) {
	}

	@OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static356.method5080(this);
		}
	}

	@OriginalMember(owner = "client!h", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);
}
