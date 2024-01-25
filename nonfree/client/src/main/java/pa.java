import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public final class pa extends Class6_Sub5_Sub10 implements Interface4 {

	@OriginalMember(owner = "client!pa", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lclient!da;)V")
	public pa(@OriginalArg(0) da arg0) {
	}

	@OriginalMember(owner = "client!pa", name = "H", descriptor = "(Z)V")
	public native void H(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!pa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static489.method6851(this);
		}
	}
}
