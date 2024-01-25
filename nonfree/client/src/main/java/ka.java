import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public final class ka extends Class1_Sub2_Sub11 implements Interface5 {

	@OriginalMember(owner = "client!ka", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ka", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static308.method4437(this);
	}

	@OriginalMember(owner = "client!ka", name = "ya", descriptor = "()V")
	public native void ya();
}
