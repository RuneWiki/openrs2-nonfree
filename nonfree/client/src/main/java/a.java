import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public final class a extends Class6_Sub24 implements Interface9 {

	@OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lclient!da;I)V")
	public a(@OriginalArg(0) da arg0, @OriginalArg(1) int arg1) {
		this.wa(arg0, arg1);
	}

	@OriginalMember(owner = "client!a", name = "ZA", descriptor = "()V")
	public native void ZA();

	@OriginalMember(owner = "client!a", name = "P", descriptor = "()V")
	public native void P();

	@OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static211.method3132(this);
		}
	}

	@OriginalMember(owner = "client!a", name = "wa", descriptor = "(Lclient!da;I)V")
	private native void wa(@OriginalArg(0) da arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!a", name = "H", descriptor = "(Z)V")
	public native void H(@OriginalArg(0) boolean arg0);
}
