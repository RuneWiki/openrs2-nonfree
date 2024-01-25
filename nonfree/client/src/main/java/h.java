import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class h extends Class62 implements Interface7 {

	@OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!oq;[Lclient!tba;[Lclient!cw;)V")
	public h(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class256 arg2, @OriginalArg(3) Class329[] arg3, @OriginalArg(4) Class61[] arg4) {
		super(arg0, arg2);
		@Pc(7) byte[][] local7 = new byte[arg3.length][];
		@Pc(11) int[] local11 = new int[arg3.length];
		@Pc(15) int[] local15 = new int[arg3.length];
		@Pc(19) int[] local19 = new int[arg3.length];
		@Pc(23) int[] local23 = new int[arg3.length];
		for (@Pc(25) int local25 = 0; local25 < arg3.length; local25++) {
			local7[local25] = arg3[local25].aByteArray101;
			local11[local25] = arg3[local25].anInt8813;
			local15[local25] = arg3[local25].anInt8812;
			local19[local25] = arg3[local25].anInt8816;
			local23[local25] = arg3[local25].anInt8814;
		}
		this.JA(arg0, arg1, local7, local11, local15, local19, local23);
	}

	@OriginalMember(owner = "client!h", name = "fa", descriptor = "(CIIIZ)V")
	protected native void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!h", name = "JA", descriptor = "(Lclient!oa;Lclient!ya;[[B[I[I[I[I)V")
	private native void JA(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6);

	@OriginalMember(owner = "client!h", name = "NA", descriptor = "(CIIIZLclient!aa;II)V")
	private native void NA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static400.method5448(this);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method5696(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.NA(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!h", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);
}
