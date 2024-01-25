import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public final class m extends Class1_Sub5 implements Interface15 {

	@OriginalMember(owner = "client!m", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!l;I)V")
	public m(@OriginalArg(0) l arg0, @OriginalArg(1) int arg1) {
		this.MA(arg0, arg1);
	}

	@OriginalMember(owner = "client!m", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!m", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static289.method4087(this);
		}
	}

	@OriginalMember(owner = "client!m", name = "MA", descriptor = "(Lclient!l;I)V")
	private native void MA(@OriginalArg(0) l arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!m", name = "D", descriptor = "()V")
	public native void D();

	@OriginalMember(owner = "client!m", name = "Z", descriptor = "()V")
	public native void Z();
}
