import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public final class k extends Class4_Sub18 implements Interface10 {

	@OriginalMember(owner = "client!k", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!c;I)V")
	public k(@OriginalArg(0) c arg0, @OriginalArg(1) int arg1) {
		this.ta(arg0, arg1);
	}

	@OriginalMember(owner = "client!k", name = "KA", descriptor = "()V")
	public native void KA();

	@OriginalMember(owner = "client!k", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static36.method525(this);
		}
	}

	@OriginalMember(owner = "client!k", name = "ta", descriptor = "(Lclient!c;I)V")
	private native void ta(@OriginalArg(0) c arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!k", name = "d", descriptor = "()V")
	public native void d();

	@OriginalMember(owner = "client!k", name = "pa", descriptor = "()V")
	public native void pa();
}
