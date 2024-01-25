import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public final class ka extends Class2_Sub2_Sub9 implements Interface3 {

	@OriginalMember(owner = "client!ka", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ka", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static234.method3563(this);
	}

	@OriginalMember(owner = "client!ka", name = "ya", descriptor = "()V")
	public native void ya();
}
