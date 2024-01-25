import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public final class na extends Class4_Sub39 implements Interface1 {

	@OriginalMember(owner = "client!na", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lclient!qa;I)V")
	public na(@OriginalArg(0) qa arg0, @OriginalArg(1) int arg1) {
		this.T(arg0, arg1);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "()V")
	public native void a();

	@OriginalMember(owner = "client!na", name = "EA", descriptor = "()V")
	public native void EA();

	@OriginalMember(owner = "client!na", name = "T", descriptor = "(Lclient!qa;I)V")
	private native void T(@OriginalArg(0) qa arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!na", name = "H", descriptor = "()V")
	public native void H();

	@OriginalMember(owner = "client!na", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static422.method5678(this);
	}
}
