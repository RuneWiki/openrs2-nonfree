import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class35 implements Interface1 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
	public i() {
		this.Q();
	}

	@OriginalMember(owner = "client!i", name = "xa", descriptor = "()V")
	public native void xa();

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(IIIIII)V")
	public native void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(I)V")
	public native void O(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "ja", descriptor = "(I)V")
	public native void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "Q", descriptor = "()V")
	private native void Q();

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(III[I)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!i", name = "j", descriptor = "(III)V")
	public native void j(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()Lclient!c;")
	@Override
	public Class35 method2897() {
		@Pc(3) i local3 = new i();
		local3.za(this);
		return local3;
	}

	@OriginalMember(owner = "client!i", name = "o", descriptor = "(III)V")
	public native void o(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "N", descriptor = "(I)V")
	public native void N(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "ra", descriptor = "(I)V")
	public native void ra(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "ka", descriptor = "(I)V")
	public native void ka(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "M", descriptor = "(III[I)V")
	private native void M(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III[I)V")
	@Override
	public void method2898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.M(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static422.method5678(this);
	}

	@OriginalMember(owner = "client!i", name = "za", descriptor = "(Lclient!c;)V")
	public native void za(@OriginalArg(0) Class35 arg0);

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()V")
	public native void EA();

	@OriginalMember(owner = "client!i", name = "m", descriptor = "([I)V")
	public native void m(@OriginalArg(0) int[] arg0);
}
