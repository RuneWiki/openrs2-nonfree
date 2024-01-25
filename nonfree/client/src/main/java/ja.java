import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class ja extends Class59 implements Interface2 {

	@OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lclient!h;Lclient!ba;Lclient!eu;[Lclient!we;[Lclient!f;)V")
	public ja(@OriginalArg(0) h arg0, @OriginalArg(1) ba arg1, @OriginalArg(2) Class70 arg2, @OriginalArg(3) Class264[] arg3, @OriginalArg(4) Class8[] arg4) {
		super(arg0, arg2);
		@Pc(7) byte[][] local7 = new byte[arg3.length][];
		@Pc(11) int[] local11 = new int[arg3.length];
		@Pc(15) int[] local15 = new int[arg3.length];
		@Pc(19) int[] local19 = new int[arg3.length];
		@Pc(23) int[] local23 = new int[arg3.length];
		for (@Pc(25) int local25 = 0; local25 < arg3.length; local25++) {
			local7[local25] = arg3[local25].aByteArray94;
			local11[local25] = arg3[local25].anInt7502;
			local15[local25] = arg3[local25].anInt7501;
			local19[local25] = arg3[local25].anInt7503;
			local23[local25] = arg3[local25].anInt7504;
		}
		this.j(arg0, arg1, local7, arg3[0].anIntArray523, local11, local15, local19, local23);
	}

	@OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static243.method3666(this);
	}

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "(Lclient!h;Lclient!ba;[[B[I[I[I[I[I)V")
	private native void j(@OriginalArg(0) h arg0, @OriginalArg(1) ba arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ja", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!ja", name = "B", descriptor = "(CIIIZ)V")
	protected native void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(CIIIZLclient!ea;II)V")
	@Override
	protected void method5777(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class58 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.S(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!ja", name = "S", descriptor = "(CIIIZLclient!ea;II)V")
	private native void S(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class58 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);
}
