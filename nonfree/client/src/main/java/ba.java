import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public final class ba extends Class3_Sub29 implements Interface2 {

	@OriginalMember(owner = "client!ba", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lclient!h;I)V")
	public ba(@OriginalArg(0) h arg0, @OriginalArg(1) int arg1) {
		this.ta(arg0, arg1);
	}

	@OriginalMember(owner = "client!ba", name = "ka", descriptor = "()V")
	public native void ka();

	@OriginalMember(owner = "client!ba", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static243.method3666(this);
	}

	@OriginalMember(owner = "client!ba", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!ba", name = "KA", descriptor = "()V")
	public native void KA();

	@OriginalMember(owner = "client!ba", name = "ta", descriptor = "(Lclient!h;I)V")
	private native void ta(@OriginalArg(0) h arg0, @OriginalArg(1) int arg1);
}
