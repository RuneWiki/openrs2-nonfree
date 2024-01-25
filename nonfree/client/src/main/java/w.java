import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class w extends Class80 implements Interface12 {

	@OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!a;Lclient!c;Lclient!pu;[Lclient!bt;[Lclient!ha;)V")
	public w(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) Class244 arg2, @OriginalArg(3) Class40[] arg3, @OriginalArg(4) Class84[] arg4) {
		super(arg0, arg2);
		@Pc(7) byte[][] local7 = new byte[arg3.length][];
		@Pc(11) int[] local11 = new int[arg3.length];
		@Pc(15) int[] local15 = new int[arg3.length];
		@Pc(19) int[] local19 = new int[arg3.length];
		@Pc(23) int[] local23 = new int[arg3.length];
		for (@Pc(25) int local25 = 0; local25 < arg3.length; local25++) {
			local7[local25] = arg3[local25].aByteArray21;
			local11[local25] = arg3[local25].anInt895;
			local15[local25] = arg3[local25].anInt894;
			local19[local25] = arg3[local25].anInt897;
			local23[local25] = arg3[local25].anInt896;
		}
		this.TA(arg0, arg1, local7, local11, local15, local19, local23);
	}

	@OriginalMember(owner = "client!w", name = "HA", descriptor = "(CIIIZ)V")
	protected native void HA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static229.method4115(this);
		}
	}

	@OriginalMember(owner = "client!w", name = "NA", descriptor = "(Z)V")
	public native void NA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(CIIIZLclient!pa;II)V")
	@Override
	protected void method7777(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class145 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.A(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!w", name = "A", descriptor = "(CIIIZLclient!pa;II)V")
	private native void A(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class145 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!w", name = "TA", descriptor = "(Lclient!a;Lclient!c;[[B[I[I[I[I)V")
	private native void TA(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6);
}
