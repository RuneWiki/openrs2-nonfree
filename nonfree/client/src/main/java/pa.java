import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public final class pa extends Class2_Sub5_Sub7 implements Interface8 {

	@OriginalMember(owner = "client!pa", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lclient!w;)V")
	public pa(@OriginalArg(0) w arg0) {
	}

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "()V")
	public native void p();

	@OriginalMember(owner = "client!pa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static1.method4(this);
		}
	}
}
