import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public final class p extends Class1_Sub2_Sub1 implements Interface2 {

	@OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static382.method5154(this);
	}

	@OriginalMember(owner = "client!p", name = "EA", descriptor = "()V")
	public native void EA();
}
