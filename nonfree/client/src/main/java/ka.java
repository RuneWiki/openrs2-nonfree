import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public final class ka extends Class3_Sub4_Sub4 implements Interface2 {

	@OriginalMember(owner = "client!ka", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ka", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static243.method3666(this);
	}

	@OriginalMember(owner = "client!ka", name = "ya", descriptor = "()V")
	public native void ya();
}
