import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class s extends Class116 implements Interface2 {

	@OriginalMember(owner = "client!s", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lclient!qa;Lclient!na;Lclient!dq;[Lclient!ft;[Lclient!l;)V")
	public s(@OriginalArg(0) qa arg0, @OriginalArg(1) na arg1, @OriginalArg(2) Class58 arg2, @OriginalArg(3) Class85[] arg3, @OriginalArg(4) Class17[] arg4) {
		super(arg0, arg2);
		@Pc(7) byte[][] local7 = new byte[arg3.length][];
		@Pc(11) int[] local11 = new int[arg3.length];
		@Pc(15) int[] local15 = new int[arg3.length];
		@Pc(19) int[] local19 = new int[arg3.length];
		@Pc(23) int[] local23 = new int[arg3.length];
		for (@Pc(25) int local25 = 0; local25 < arg3.length; local25++) {
			local7[local25] = arg3[local25].aByteArray51;
			local11[local25] = arg3[local25].anInt2652;
			local15[local25] = arg3[local25].anInt2649;
			local19[local25] = arg3[local25].anInt2650;
			local23[local25] = arg3[local25].anInt2647;
		}
		this.NA(arg0, arg1, local7, local11, local15, local19, local23);
	}

	@OriginalMember(owner = "client!s", name = "A", descriptor = "(CIIIZLclient!ma;II)V")
	private native void A(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class73 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!s", name = "NA", descriptor = "(Lclient!qa;Lclient!na;[[B[I[I[I[I)V")
	private native void NA(@OriginalArg(0) qa arg0, @OriginalArg(1) na arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6);

	@OriginalMember(owner = "client!s", name = "EA", descriptor = "()V")
	public native void EA();

	@OriginalMember(owner = "client!s", name = "OA", descriptor = "(CIIIZ)V")
	protected native void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(CIIIZLclient!ma;II)V")
	@Override
	protected void method4809(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class73 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.A(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!s", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static409.method5378(this);
	}
}
