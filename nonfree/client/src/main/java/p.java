import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public final class p extends Class7_Sub4_Sub2 implements Interface3 {

	@OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static125.method2025(this);
	}

	@OriginalMember(owner = "client!p", name = "EA", descriptor = "()V")
	public native void EA();
}
