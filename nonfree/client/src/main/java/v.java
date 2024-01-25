import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class v implements Interface11 {

	@OriginalMember(owner = "client!v", name = "c", descriptor = "Ljava/lang/Runnable;")
	public Runnable aRunnable3;

	@OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!v", name = "f", descriptor = "Lclient!a;")
	private final a anA3;

	@OriginalMember(owner = "client!v", name = "i", descriptor = "Lclient!ma;")
	private final ma aMa7;

	@OriginalMember(owner = "client!v", name = "h", descriptor = "Lclient!ma;")
	private final ma aMa6;

	@OriginalMember(owner = "client!v", name = "g", descriptor = "Lclient!ma;")
	private final ma aMa5;

	@OriginalMember(owner = "client!v", name = "j", descriptor = "Lclient!ma;")
	private final ma aMa8;

	@OriginalMember(owner = "client!v", name = "k", descriptor = "Lclient!ma;")
	private final ma aMa9;

	@OriginalMember(owner = "client!v", name = "d", descriptor = "Lclient!ma;")
	private final ma aMa3;

	@OriginalMember(owner = "client!v", name = "l", descriptor = "Lclient!ma;")
	private final ma aMa10;

	@OriginalMember(owner = "client!v", name = "b", descriptor = "Lclient!ma;")
	private final ma aMa2;

	@OriginalMember(owner = "client!v", name = "e", descriptor = "Lclient!ma;")
	private final ma aMa4;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "Lclient!ma;")
	private final ma aMa1;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!a;II)V")
	public v(@OriginalArg(0) a arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anA3 = arg0;
		this.aMa7 = new ma(this.anA3);
		this.aMa6 = new ma(this.anA3);
		this.aMa5 = new ma(this.anA3);
		this.aMa8 = new ma(this.anA3);
		this.aMa9 = new ma(this.anA3);
		this.aMa3 = new ma(this.anA3);
		this.aMa10 = new ma(this.anA3);
		this.aMa2 = new ma(this.anA3);
		this.aMa4 = new ma(this.anA3);
		this.aMa1 = new ma(this.anA3);
		this.FA(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!v", name = "ka", descriptor = "(Lclient!r;Lclient!m;[II)V")
	public native void ka(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static79.method1341(this);
		}
	}

	@OriginalMember(owner = "client!v", name = "RA", descriptor = "(Lclient!r;IILclient!m;Z)Z")
	public native boolean RA(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class118 arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!v", name = "k", descriptor = "(Lclient!sa;II)V")
	public native void k(@OriginalArg(0) Class205 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!v", name = "wa", descriptor = "(Lclient!qa;[Lclient!r;Lclient!m;[III)V")
	public native void wa(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class145[] arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!v", name = "G", descriptor = "(Lclient!qa;Lclient!r;Lclient!m;[II[I[I[I[S[BI[I)V")
	public native void G(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11);

	@OriginalMember(owner = "client!v", name = "NA", descriptor = "(Z)V")
	public native void NA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!v", name = "FA", descriptor = "(Lclient!qa;II)V")
	private native void FA(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!v", name = "O", descriptor = "(Lclient!qa;[I[I[I[SI)V")
	public native void O(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) short[] arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!v", name = "PA", descriptor = "(Lclient!r;Lclient!r;IIIZ)V")
	public native void PA(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
	public void method6989() {
		this.aRunnable3 = null;
		this.na();
	}

	@OriginalMember(owner = "client!v", name = "na", descriptor = "()V")
	private native void na();

	@OriginalMember(owner = "client!v", name = "Y", descriptor = "(Lclient!sa;IIIIIII[[Z)V")
	public native void Y(@OriginalArg(0) Class205 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean[][] arg8);

	@OriginalMember(owner = "client!v", name = "N", descriptor = "(Lclient!qa;[Lclient!r;Lclient!m;[II[I[I[I[S[BI[I)V")
	public native void N(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class145[] arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11);

	@OriginalMember(owner = "client!v", name = "b", descriptor = "()V")
	public void method6990() {
		this.aRunnable3 = Thread.currentThread();
		this.u();
	}

	@OriginalMember(owner = "client!v", name = "u", descriptor = "()V")
	private native void u();

	@OriginalMember(owner = "client!v", name = "da", descriptor = "(Lclient!qa;IIIIIII)V")
	public native void da(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!ma;BIZ)Lclient!r;")
	public Class145 method6991(@OriginalArg(0) ma arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) ma local8;
		@Pc(5) ma local5;
		if (arg1 == 1) {
			local5 = this.aMa3;
			local8 = this.aMa7;
		} else if (arg1 == 2) {
			local5 = this.aMa10;
			local8 = this.aMa6;
		} else if (arg1 == 3) {
			local5 = this.aMa2;
			local8 = this.aMa5;
		} else if (arg1 == 4) {
			local5 = this.aMa4;
			local8 = this.aMa8;
		} else if (arg1 == 5) {
			local5 = this.aMa1;
			local8 = this.aMa9;
		} else {
			local8 = local5 = new ma(this.anA3);
		}
		arg0.WA(local8, local5, arg2, arg1 != 0, arg3);
		local8.aClass161Array6 = arg0.aClass161Array6;
		local8.aClass93Array6 = arg0.aClass93Array6;
		return local8;
	}

	@OriginalMember(owner = "client!v", name = "m", descriptor = "(Lclient!r;Lclient!m;[III)V")
	public native void m(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
