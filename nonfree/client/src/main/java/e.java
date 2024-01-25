import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public final class e extends Class1_Sub2_Sub2 implements Interface14 {

	@OriginalMember(owner = "client!e", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lclient!a;)V")
	public e(@OriginalArg(0) a arg0) {
	}

	@OriginalMember(owner = "client!e", name = "NA", descriptor = "(Z)V")
	public native void NA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!e", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static300.method5316(this);
		}
	}
}
