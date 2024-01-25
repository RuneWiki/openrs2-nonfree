import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public final class p extends Class4_Sub2_Sub3 implements Interface1 {

	@OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!p", name = "EA", descriptor = "()V")
	public native void EA();

	@OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static422.method5678(this);
	}
}
