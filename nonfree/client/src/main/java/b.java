import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class b extends Class59 implements Interface8 {

	@OriginalMember(owner = "client!b", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!da;Lclient!a;Lclient!cq;[Lclient!af;[Lclient!xa;)V")
	public b(@OriginalArg(0) da arg0, @OriginalArg(1) a arg1, @OriginalArg(2) Class53 arg2, @OriginalArg(3) Class9[] arg3, @OriginalArg(4) Class119[] arg4) {
		super(arg0, arg2);
		@Pc(7) byte[][] local7 = new byte[arg3.length][];
		@Pc(11) int[] local11 = new int[arg3.length];
		@Pc(15) int[] local15 = new int[arg3.length];
		@Pc(19) int[] local19 = new int[arg3.length];
		@Pc(23) int[] local23 = new int[arg3.length];
		for (@Pc(25) int local25 = 0; local25 < arg3.length; local25++) {
			local7[local25] = arg3[local25].aByteArray13;
			local11[local25] = arg3[local25].anInt478;
			local15[local25] = arg3[local25].anInt481;
			local19[local25] = arg3[local25].anInt476;
			local23[local25] = arg3[local25].anInt477;
		}
		this.p(arg0, arg1, local7, local11, local15, local19, local23);
	}

	@OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static354.method5572(this);
		}
	}

	@OriginalMember(owner = "client!b", name = "p", descriptor = "(Lclient!da;Lclient!a;[[B[I[I[I[I)V")
	private native void p(@OriginalArg(0) da arg0, @OriginalArg(1) a arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6);

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(CIIIZLclient!fa;II)V")
	@Override
	protected void method7273(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class10 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.T(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!b", name = "T", descriptor = "(CIIIZLclient!fa;II)V")
	private native void T(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class10 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!b", name = "H", descriptor = "(Z)V")
	public native void H(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!b", name = "q", descriptor = "(CIIIZ)V")
	protected native void q(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);
}
