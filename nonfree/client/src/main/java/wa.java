import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public final class wa implements Interface7 {

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "J")
	private long aLong268 = 0L;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "Lclient!j;")
	public final j aJ1;

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "Lclient!xa;")
	public final xa aXa1;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lclient!oa;Lclient!j;Lclient!xa;)V")
	public wa(@OriginalArg(0) oa arg0, @OriginalArg(1) j arg1, @OriginalArg(2) xa arg2) {
		this.aLong268 = arg0.nativeid;
		this.aJ1 = arg1;
		this.aXa1 = arg2;
	}

	@OriginalMember(owner = "client!wa", name = "Z", descriptor = "(JJJIIIIIIZZ)V")
	private native void Z(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10);

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.Z(this.aLong268, this.aJ1.nativeid, this.aXa1.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, true, true);
	}

	@OriginalMember(owner = "client!wa", name = "X", descriptor = "(JJJIIIIIIZZ)V")
	private native void X(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10);

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		this.X(this.aLong268, this.aJ1.nativeid, this.aXa1.nativeid, arg0, arg1, arg2, arg3, 0, 0, arg4, true);
	}
}
