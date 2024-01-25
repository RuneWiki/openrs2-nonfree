import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class ca extends Class37 implements Interface18 {

	@OriginalMember(owner = "client!ca", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!l;Lclient!m;Lclient!fo;[Lclient!ut;[Lclient!f;)V")
	public ca(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) Class112 arg2, @OriginalArg(3) Class344[] arg3, @OriginalArg(4) Class38[] arg4) {
		super(arg0, arg2);
		@Pc(7) byte[][] local7 = new byte[arg3.length][];
		@Pc(11) int[] local11 = new int[arg3.length];
		@Pc(15) int[] local15 = new int[arg3.length];
		@Pc(19) int[] local19 = new int[arg3.length];
		@Pc(23) int[] local23 = new int[arg3.length];
		for (@Pc(25) int local25 = 0; local25 < arg3.length; local25++) {
			local7[local25] = arg3[local25].aByteArray94;
			local11[local25] = arg3[local25].anInt8947;
			local15[local25] = arg3[local25].anInt8946;
			local19[local25] = arg3[local25].anInt8948;
			local23[local25] = arg3[local25].anInt8950;
		}
		this.l(arg0, arg1, local7, arg3[0].anIntArray585, local11, local15, local19, local23);
	}

	@OriginalMember(owner = "client!ca", name = "OA", descriptor = "(CIIIZ)V")
	protected native void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ca", name = "t", descriptor = "(CIIIZLclient!ua;II)V")
	private native void t(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class84 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(CIIIZLclient!ua;II)V")
	@Override
	protected void method7722(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class84 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.t(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "(Lclient!l;Lclient!m;[[B[I[I[I[I[I)V")
	private native void l(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static356.method5080(this);
		}
	}

	@OriginalMember(owner = "client!ca", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);
}
