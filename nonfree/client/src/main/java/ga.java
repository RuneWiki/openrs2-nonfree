import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class ga extends Class57 implements Interface11 {

	@OriginalMember(owner = "client!ga", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!w;Lclient!g;Lclient!fj;[Lclient!ef;[Lclient!o;)V")
	public ga(@OriginalArg(0) w arg0, @OriginalArg(1) g arg1, @OriginalArg(2) Class79 arg2, @OriginalArg(3) Class66[] arg3, @OriginalArg(4) Class80[] arg4) {
		super(arg0, arg2);
		@Pc(7) byte[][] local7 = new byte[arg3.length][];
		@Pc(11) int[] local11 = new int[arg3.length];
		@Pc(15) int[] local15 = new int[arg3.length];
		@Pc(19) int[] local19 = new int[arg3.length];
		@Pc(23) int[] local23 = new int[arg3.length];
		for (@Pc(25) int local25 = 0; local25 < arg3.length; local25++) {
			local7[local25] = arg3[local25].aByteArray15;
			local11[local25] = arg3[local25].anInt1861;
			local15[local25] = arg3[local25].anInt1862;
			local19[local25] = arg3[local25].anInt1865;
			local23[local25] = arg3[local25].anInt1864;
		}
		this.X(arg0, arg1, local7, arg3[0].anIntArray150, local11, local15, local19, local23);
	}

	@OriginalMember(owner = "client!ga", name = "X", descriptor = "(Lclient!w;Lclient!g;[[B[I[I[I[I[I)V")
	private native void X(@OriginalArg(0) w arg0, @OriginalArg(1) g arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(CIIIZLclient!ta;II)V")
	@Override
	protected void method5945(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class49 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.v(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "()V")
	public native void p();

	@OriginalMember(owner = "client!ga", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static408.method5372(this);
		}
	}

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "(CIIIZLclient!ta;II)V")
	private native void v(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class49 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ga", name = "B", descriptor = "(CIIIZ)V")
	protected native void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);
}
