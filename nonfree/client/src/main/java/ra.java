import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class ra extends Class76 implements Interface12 {

	@OriginalMember(owner = "client!ra", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!w;Lclient!g;Lclient!gf;[Lclient!ev;[Lclient!o;)V")
	public ra(@OriginalArg(0) w arg0, @OriginalArg(1) g arg1, @OriginalArg(2) Class89 arg2, @OriginalArg(3) Class72[] arg3, @OriginalArg(4) Class6[] arg4) {
		super(arg0, arg2);
		@Pc(7) byte[][] local7 = new byte[arg3.length][];
		@Pc(11) int[] local11 = new int[arg3.length];
		@Pc(15) int[] local15 = new int[arg3.length];
		@Pc(19) int[] local19 = new int[arg3.length];
		@Pc(23) int[] local23 = new int[arg3.length];
		for (@Pc(25) int local25 = 0; local25 < arg3.length; local25++) {
			local7[local25] = arg3[local25].aByteArray17;
			local11[local25] = arg3[local25].anInt1855;
			local15[local25] = arg3[local25].anInt1851;
			local19[local25] = arg3[local25].anInt1854;
			local23[local25] = arg3[local25].anInt1856;
		}
		this.va(arg0, arg1, local7, local11, local15, local19, local23);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(CIIIZLclient!ta;II)V")
	@Override
	protected void method4580(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class104 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.OA(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!ra", name = "B", descriptor = "(CIIIZ)V")
	protected native void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static314.method4249(this);
		}
	}

	@OriginalMember(owner = "client!ra", name = "OA", descriptor = "(CIIIZLclient!ta;II)V")
	private native void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class104 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ra", name = "va", descriptor = "(Lclient!w;Lclient!g;[[B[I[I[I[I)V")
	private native void va(@OriginalArg(0) w arg0, @OriginalArg(1) g arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6);

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "()V")
	public native void p();
}
