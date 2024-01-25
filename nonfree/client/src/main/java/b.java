import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class b extends Class18 implements Interface10 {

	@OriginalMember(owner = "client!b", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!c;Lclient!k;Lclient!gg;[Lclient!ho;[Lclient!aa;)V")
	public b(@OriginalArg(0) c arg0, @OriginalArg(1) k arg1, @OriginalArg(2) Class84 arg2, @OriginalArg(3) Class98[] arg3, @OriginalArg(4) Class2[] arg4) {
		super(arg0, arg2);
		@Pc(7) byte[][] local7 = new byte[arg3.length][];
		@Pc(11) int[] local11 = new int[arg3.length];
		@Pc(15) int[] local15 = new int[arg3.length];
		@Pc(19) int[] local19 = new int[arg3.length];
		@Pc(23) int[] local23 = new int[arg3.length];
		for (@Pc(25) int local25 = 0; local25 < arg3.length; local25++) {
			local7[local25] = arg3[local25].aByteArray33;
			local11[local25] = arg3[local25].anInt3171;
			local15[local25] = arg3[local25].anInt3175;
			local19[local25] = arg3[local25].anInt3173;
			local23[local25] = arg3[local25].anInt3176;
		}
		this.MA(arg0, arg1, local7, local11, local15, local19, local23);
	}

	@OriginalMember(owner = "client!b", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(CIIIZLclient!i;II)V")
	@Override
	protected void method5756(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class74 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.w(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!b", name = "g", descriptor = "(CIIIZ)V")
	protected native void g(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static36.method525(this);
		}
	}

	@OriginalMember(owner = "client!b", name = "w", descriptor = "(CIIIZLclient!i;II)V")
	private native void w(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class74 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!b", name = "MA", descriptor = "(Lclient!c;Lclient!k;[[B[I[I[I[I)V")
	private native void MA(@OriginalArg(0) c arg0, @OriginalArg(1) k arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6);
}
