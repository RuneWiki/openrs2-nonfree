import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public final class ka extends Class1_Sub1_Sub3 implements Interface4 {

	@OriginalMember(owner = "client!ka", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ka", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!ka", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static227.method3281(this);
	}
}
