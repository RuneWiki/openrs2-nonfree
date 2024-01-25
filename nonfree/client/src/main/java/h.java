import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public final class h extends Class3_Sub7_Sub13 implements Interface16 {

	@OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lclient!l;)V")
	public h(@OriginalArg(0) l arg0) {
	}

	@OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static388.method5743(this);
		}
	}

	@OriginalMember(owner = "client!h", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);
}
