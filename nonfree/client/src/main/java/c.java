import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public final class c extends Class1_Sub16 implements Interface13 {

	@OriginalMember(owner = "client!c", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lclient!a;I)V")
	public c(@OriginalArg(0) a arg0, @OriginalArg(1) int arg1) {
		this.v(arg0, arg1);
	}

	@OriginalMember(owner = "client!c", name = "za", descriptor = "()V")
	public native void za();

	@OriginalMember(owner = "client!c", name = "NA", descriptor = "(Z)V")
	public native void NA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!c", name = "v", descriptor = "(Lclient!a;I)V")
	private native void v(@OriginalArg(0) a arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!c", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static431.method6347(this);
		}
	}

	@OriginalMember(owner = "client!c", name = "O", descriptor = "()V")
	public native void O();
}
