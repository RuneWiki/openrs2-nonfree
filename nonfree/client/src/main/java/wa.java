import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class wa implements Interface10 {

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "Ljava/lang/Runnable;")
	public Runnable aRunnable2;

	@OriginalMember(owner = "client!wa", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "Lclient!c;")
	private final c aC3;

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "Lclient!fa;")
	private final fa aFa4;

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "Lclient!fa;")
	private final fa aFa8;

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "Lclient!fa;")
	private final fa aFa3;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "Lclient!fa;")
	private final fa aFa1;

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "Lclient!fa;")
	private final fa aFa2;

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "Lclient!fa;")
	private final fa aFa9;

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "Lclient!fa;")
	private final fa aFa7;

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "Lclient!fa;")
	private final fa aFa10;

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "Lclient!fa;")
	private final fa aFa6;

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "Lclient!fa;")
	private final fa aFa5;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lclient!c;II)V")
	public wa(@OriginalArg(0) c arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aC3 = arg0;
		this.aFa4 = new fa(this.aC3);
		this.aFa8 = new fa(this.aC3);
		this.aFa3 = new fa(this.aC3);
		this.aFa1 = new fa(this.aC3);
		this.aFa2 = new fa(this.aC3);
		this.aFa9 = new fa(this.aC3);
		this.aFa7 = new fa(this.aC3);
		this.aFa10 = new fa(this.aC3);
		this.aFa6 = new fa(this.aC3);
		this.aFa5 = new fa(this.aC3);
		this.j(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wa", name = "FA", descriptor = "(Lclient!qa;Lclient!ka;Lclient!n;[II[I[I[I[S[BI[I)V")
	public native void FA(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11);

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "()V")
	public void method6147() {
		this.aRunnable2 = Thread.currentThread();
		this.na();
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!fa;BIZ)Lclient!ka;")
	public Class57 method6148(@OriginalArg(0) fa arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) fa local8;
		@Pc(5) fa local5;
		if (arg1 == 1) {
			local5 = this.aFa9;
			local8 = this.aFa4;
		} else if (arg1 == 2) {
			local5 = this.aFa7;
			local8 = this.aFa8;
		} else if (arg1 == 3) {
			local5 = this.aFa10;
			local8 = this.aFa3;
		} else if (arg1 == 4) {
			local5 = this.aFa6;
			local8 = this.aFa1;
		} else if (arg1 == 5) {
			local5 = this.aFa5;
			local8 = this.aFa2;
		} else {
			local8 = local5 = new fa(this.aC3);
		}
		arg0.k(local8, local5, arg2, arg1 != 0, arg3);
		local8.aClass61Array3 = arg0.aClass61Array3;
		local8.aClass239Array3 = arg0.aClass239Array3;
		return local8;
	}

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "()V")
	private native void q();

	@OriginalMember(owner = "client!wa", name = "ha", descriptor = "(Lclient!qa;[I[I[I[SI)V")
	public native void ha(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) short[] arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!wa", name = "K", descriptor = "(Lclient!ka;Lclient!ka;IIIZ)V")
	public native void K(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "(Lclient!qa;II)V")
	private native void j(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!wa", name = "T", descriptor = "(Lclient!qa;[Lclient!ka;Lclient!n;[III)V")
	public native void T(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class57[] arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!wa", name = "S", descriptor = "(Lclient!o;IIIIIII[[Z)V")
	public native void S(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean[][] arg8);

	@OriginalMember(owner = "client!wa", name = "U", descriptor = "(Lclient!qa;IIIIIII)V")
	public native void U(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!wa", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!wa", name = "na", descriptor = "()V")
	private native void na();

	@OriginalMember(owner = "client!wa", name = "G", descriptor = "(Lclient!ka;IILclient!n;Z)Z")
	public native boolean G(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class72 arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "(Lclient!ka;Lclient!n;[III)V")
	public native void k(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!qa;[Lclient!ka;Lclient!n;[II[I[I[I[S[BI[I)V")
	public native void a(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class57[] arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11);

	@OriginalMember(owner = "client!wa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static36.method525(this);
		}
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "()V")
	public void method6149() {
		this.aRunnable2 = null;
		this.q();
	}

	@OriginalMember(owner = "client!wa", name = "ka", descriptor = "(Lclient!o;II)V")
	public native void ka(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!wa", name = "VA", descriptor = "(Lclient!ka;Lclient!n;[II)V")
	public native void VA(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3);
}
