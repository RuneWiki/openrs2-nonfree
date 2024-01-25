import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class c extends Class35 implements Interface19 {

	@OriginalMember(owner = "client!c", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lclient!l;Lclient!m;Lclient!aga;[Lclient!tq;[Lclient!f;)V")
	public c(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) Class13 arg2, @OriginalArg(3) Class318[] arg3, @OriginalArg(4) Class10[] arg4) {
		super(arg0, arg2);
		@Pc(7) byte[][] local7 = new byte[arg3.length][];
		@Pc(11) int[] local11 = new int[arg3.length];
		@Pc(15) int[] local15 = new int[arg3.length];
		@Pc(19) int[] local19 = new int[arg3.length];
		@Pc(23) int[] local23 = new int[arg3.length];
		for (@Pc(25) int local25 = 0; local25 < arg3.length; local25++) {
			local7[local25] = arg3[local25].aByteArray94;
			local11[local25] = arg3[local25].anInt8537;
			local15[local25] = arg3[local25].anInt8535;
			local19[local25] = arg3[local25].anInt8533;
			local23[local25] = arg3[local25].anInt8534;
		}
		this.e(arg0, arg1, local7, local11, local15, local19, local23);
	}

	@OriginalMember(owner = "client!c", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!c", name = "GA", descriptor = "(CIIIZLclient!ua;II)V")
	private native void GA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class200 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(Lclient!l;Lclient!m;[[B[I[I[I[I)V")
	private native void e(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6);

	@OriginalMember(owner = "client!c", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static223.method3676(this);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(CIIIZLclient!ua;II)V")
	@Override
	protected void method4950(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class200 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.GA(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!c", name = "OA", descriptor = "(CIIIZ)V")
	protected native void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);
}
