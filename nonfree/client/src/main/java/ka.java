import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class ka extends Class46 implements Interface4 {

	@OriginalMember(owner = "client!ka", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lclient!qa;Lclient!na;Lclient!gt;[Lclient!bb;[Lclient!l;)V")
	public ka(@OriginalArg(0) qa arg0, @OriginalArg(1) na arg1, @OriginalArg(2) Class89 arg2, @OriginalArg(3) Class18[] arg3, @OriginalArg(4) Class57[] arg4) {
		super(arg0, arg2);
		@Pc(7) byte[][] local7 = new byte[arg3.length][];
		@Pc(11) int[] local11 = new int[arg3.length];
		@Pc(15) int[] local15 = new int[arg3.length];
		@Pc(19) int[] local19 = new int[arg3.length];
		@Pc(23) int[] local23 = new int[arg3.length];
		for (@Pc(25) int local25 = 0; local25 < arg3.length; local25++) {
			local7[local25] = arg3[local25].aByteArray4;
			local11[local25] = arg3[local25].anInt367;
			local15[local25] = arg3[local25].anInt366;
			local19[local25] = arg3[local25].anInt368;
			local23[local25] = arg3[local25].anInt370;
		}
		this.ta(arg0, arg1, local7, arg3[0].anIntArray25, local11, local15, local19, local23);
	}

	@OriginalMember(owner = "client!ka", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static404.method5220(this);
	}

	@OriginalMember(owner = "client!ka", name = "ya", descriptor = "(CIIIZLclient!ma;II)V")
	private native void ya(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class145 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()V")
	public native void EA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(CIIIZLclient!ma;II)V")
	@Override
	protected void method5051(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class145 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.ya(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!ka", name = "ta", descriptor = "(Lclient!qa;Lclient!na;[[B[I[I[I[I[I)V")
	private native void ta(@OriginalArg(0) qa arg0, @OriginalArg(1) na arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "OA", descriptor = "(CIIIZ)V")
	protected native void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);
}
