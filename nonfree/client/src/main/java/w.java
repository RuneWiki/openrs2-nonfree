import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class w extends Class129 implements Interface5 {

	@OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!h;Lclient!ba;Lclient!gv;[Lclient!mp;[Lclient!f;)V")
	public w(@OriginalArg(0) h arg0, @OriginalArg(1) ba arg1, @OriginalArg(2) Class101 arg2, @OriginalArg(3) Class159[] arg3, @OriginalArg(4) Class80[] arg4) {
		super(arg0, arg2);
		@Pc(7) byte[][] local7 = new byte[arg3.length][];
		@Pc(11) int[] local11 = new int[arg3.length];
		@Pc(15) int[] local15 = new int[arg3.length];
		@Pc(19) int[] local19 = new int[arg3.length];
		@Pc(23) int[] local23 = new int[arg3.length];
		for (@Pc(25) int local25 = 0; local25 < arg3.length; local25++) {
			local7[local25] = arg3[local25].aByteArray58;
			local11[local25] = arg3[local25].anInt4573;
			local15[local25] = arg3[local25].anInt4569;
			local19[local25] = arg3[local25].anInt4568;
			local23[local25] = arg3[local25].anInt4572;
		}
		this.ca(arg0, arg1, local7, local11, local15, local19, local23);
	}

	@OriginalMember(owner = "client!w", name = "B", descriptor = "(CIIIZ)V")
	protected native void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!w", name = "ca", descriptor = "(Lclient!h;Lclient!ba;[[B[I[I[I[I)V")
	private native void ca(@OriginalArg(0) h arg0, @OriginalArg(1) ba arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6);

	@OriginalMember(owner = "client!w", name = "K", descriptor = "(CIIIZLclient!ea;II)V")
	private native void K(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class62 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(CIIIZLclient!ea;II)V")
	@Override
	protected void method5824(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class62 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.K(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!w", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static308.method4437(this);
	}
}
