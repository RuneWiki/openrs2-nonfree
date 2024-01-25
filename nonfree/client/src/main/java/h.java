import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class h extends Class18 implements Interface12 {

	@OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lclient!c;Lclient!k;Lclient!ju;[Lclient!mn;[Lclient!aa;)V")
	public h(@OriginalArg(0) c arg0, @OriginalArg(1) k arg1, @OriginalArg(2) Class124 arg2, @OriginalArg(3) Class154[] arg3, @OriginalArg(4) Class2[] arg4) {
		super(arg0, arg2);
		@Pc(7) byte[][] local7 = new byte[arg3.length][];
		@Pc(11) int[] local11 = new int[arg3.length];
		@Pc(15) int[] local15 = new int[arg3.length];
		@Pc(19) int[] local19 = new int[arg3.length];
		@Pc(23) int[] local23 = new int[arg3.length];
		for (@Pc(25) int local25 = 0; local25 < arg3.length; local25++) {
			local7[local25] = arg3[local25].aByteArray73;
			local11[local25] = arg3[local25].anInt4358;
			local15[local25] = arg3[local25].anInt4359;
			local19[local25] = arg3[local25].anInt4356;
			local23[local25] = arg3[local25].anInt4354;
		}
		this.U(arg0, arg1, local7, arg3[0].anIntArray287, local11, local15, local19, local23);
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "(CIIIZ)V")
	protected native void g(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!h", name = "U", descriptor = "(Lclient!c;Lclient!k;[[B[I[I[I[I[I)V")
	private native void U(@OriginalArg(0) c arg0, @OriginalArg(1) k arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(CIIIZLclient!i;II)V")
	@Override
	protected void method5162(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class14 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.ma(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static115.method1851(this);
		}
	}

	@OriginalMember(owner = "client!h", name = "ma", descriptor = "(CIIIZLclient!i;II)V")
	private native void ma(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class14 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!h", name = "pa", descriptor = "()V")
	public native void pa();
}
