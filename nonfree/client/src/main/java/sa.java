import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class sa extends Class102 implements Interface3 {

	@OriginalMember(owner = "client!sa", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
	public sa() {
		this.f();
	}

	@OriginalMember(owner = "client!sa", name = "Q", descriptor = "(IIIIII)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!sa", name = "O", descriptor = "(I)V")
	public native void O(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sa", name = "ba", descriptor = "(Lclient!ia;)V")
	public native void ba(@OriginalArg(0) Class102 arg0);

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
	public native void c(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "()Lclient!ia;")
	@Override
	public Class102 method4931() {
		@Pc(3) sa local3 = new sa();
		local3.ba(this);
		return local3;
	}

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "()V")
	private native void f();

	@OriginalMember(owner = "client!sa", name = "HA", descriptor = "()V")
	public native void HA();

	@OriginalMember(owner = "client!sa", name = "ea", descriptor = "(III[I)V")
	private native void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!sa", name = "na", descriptor = "(I)V")
	public native void na(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sa", name = "YA", descriptor = "(I)V")
	public native void YA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.ea(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!sa", name = "ma", descriptor = "(I)V")
	public native void ma(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sa", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!sa", name = "ZA", descriptor = "(III)V")
	public native void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!sa", name = "R", descriptor = "(III)V")
	public native void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!sa", name = "E", descriptor = "(III[I)V")
	public native void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!sa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static234.method3563(this);
	}

	@OriginalMember(owner = "client!sa", name = "X", descriptor = "([I)V")
	public native void X(@OriginalArg(0) int[] arg0);
}
