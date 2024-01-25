import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public final class g extends Class1_Sub12 implements Interface12 {

	@OriginalMember(owner = "client!g", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!w;I)V")
	public g(@OriginalArg(0) w arg0, @OriginalArg(1) int arg1) {
		this.TA(arg0, arg1);
	}

	@OriginalMember(owner = "client!g", name = "TA", descriptor = "(Lclient!w;I)V")
	private native void TA(@OriginalArg(0) w arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!g", name = "T", descriptor = "()V")
	public native void T();

	@OriginalMember(owner = "client!g", name = "IA", descriptor = "()V")
	public native void IA();

	@OriginalMember(owner = "client!g", name = "p", descriptor = "()V")
	public native void p();

	@OriginalMember(owner = "client!g", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static314.method4249(this);
		}
	}
}
