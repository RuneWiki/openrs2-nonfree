import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class ja extends Class36 implements Interface14 {

	@OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lclient!a;Lclient!c;Lclient!fc;[Lclient!dp;[Lclient!ha;)V")
	public ja(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(3) Class70[] arg3, @OriginalArg(4) Class104[] arg4) {
		super(arg0, arg2);
		@Pc(7) byte[][] local7 = new byte[arg3.length][];
		@Pc(11) int[] local11 = new int[arg3.length];
		@Pc(15) int[] local15 = new int[arg3.length];
		@Pc(19) int[] local19 = new int[arg3.length];
		@Pc(23) int[] local23 = new int[arg3.length];
		for (@Pc(25) int local25 = 0; local25 < arg3.length; local25++) {
			local7[local25] = arg3[local25].aByteArray19;
			local11[local25] = arg3[local25].anInt2013;
			local15[local25] = arg3[local25].anInt2012;
			local19[local25] = arg3[local25].anInt2011;
			local23[local25] = arg3[local25].anInt2010;
		}
		this.da(arg0, arg1, local7, arg3[0].anIntArray142, local11, local15, local19, local23);
	}

	@OriginalMember(owner = "client!ja", name = "NA", descriptor = "(Z)V")
	public native void NA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(CIIIZLclient!pa;II)V")
	@Override
	protected void method7956(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class28 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.DA(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!ja", name = "DA", descriptor = "(CIIIZLclient!pa;II)V")
	private native void DA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class28 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static300.method5316(this);
		}
	}

	@OriginalMember(owner = "client!ja", name = "HA", descriptor = "(CIIIZ)V")
	protected native void HA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ja", name = "da", descriptor = "(Lclient!a;Lclient!c;[[B[I[I[I[I[I)V")
	private native void da(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7);
}
