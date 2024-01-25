import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class k implements Interface11 {

	@OriginalMember(owner = "client!k", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!k", name = "j", descriptor = "Ljava/lang/Runnable;")
	public Runnable aRunnable1;

	@OriginalMember(owner = "client!k", name = "f", descriptor = "Lclient!w;")
	private final w aW2;

	@OriginalMember(owner = "client!k", name = "g", descriptor = "Lclient!xa;")
	private final xa aXa6;

	@OriginalMember(owner = "client!k", name = "d", descriptor = "Lclient!xa;")
	private final xa aXa4;

	@OriginalMember(owner = "client!k", name = "i", descriptor = "Lclient!xa;")
	private final xa aXa8;

	@OriginalMember(owner = "client!k", name = "l", descriptor = "Lclient!xa;")
	private final xa aXa10;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "Lclient!xa;")
	private final xa aXa2;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "Lclient!xa;")
	private final xa aXa5;

	@OriginalMember(owner = "client!k", name = "h", descriptor = "Lclient!xa;")
	private final xa aXa7;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "Lclient!xa;")
	private final xa aXa3;

	@OriginalMember(owner = "client!k", name = "k", descriptor = "Lclient!xa;")
	private final xa aXa9;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "Lclient!xa;")
	private final xa aXa1;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!w;II)V")
	public k(@OriginalArg(0) w arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aW2 = arg0;
		this.aXa6 = new xa(this.aW2);
		this.aXa4 = new xa(this.aW2);
		this.aXa8 = new xa(this.aW2);
		this.aXa10 = new xa(this.aW2);
		this.aXa2 = new xa(this.aW2);
		this.aXa5 = new xa(this.aW2);
		this.aXa7 = new xa(this.aW2);
		this.aXa3 = new xa(this.aW2);
		this.aXa9 = new xa(this.aW2);
		this.aXa1 = new xa(this.aW2);
		this.ya(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!k", name = "LA", descriptor = "(Lclient!e;Lclient!c;[III)V")
	public native void LA(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!k", name = "MA", descriptor = "(Lclient!e;Lclient!c;[II)V")
	public native void MA(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!k", name = "FA", descriptor = "(Lclient!za;Lclient!e;Lclient!c;[II[I[I[I[S[BI[I)V")
	public native void FA(@OriginalArg(0) Class200 arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) Class29 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11);

	@OriginalMember(owner = "client!k", name = "aa", descriptor = "(Lclient!ya;IIIIIII[[Z)V")
	public native void aa(@OriginalArg(0) Class125 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean[][] arg8);

	@OriginalMember(owner = "client!k", name = "D", descriptor = "(Lclient!za;[Lclient!e;Lclient!c;[II[I[I[I[S[BI[I)V")
	public native void D(@OriginalArg(0) Class200 arg0, @OriginalArg(1) Class57[] arg1, @OriginalArg(2) Class29 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11);

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!xa;BIZ)Lclient!e;")
	public Class57 method2800(@OriginalArg(0) xa arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) xa local8;
		@Pc(5) xa local5;
		if (arg1 == 1) {
			local5 = this.aXa5;
			local8 = this.aXa6;
		} else if (arg1 == 2) {
			local5 = this.aXa7;
			local8 = this.aXa4;
		} else if (arg1 == 3) {
			local5 = this.aXa3;
			local8 = this.aXa8;
		} else if (arg1 == 4) {
			local5 = this.aXa9;
			local8 = this.aXa10;
		} else if (arg1 == 5) {
			local5 = this.aXa1;
			local8 = this.aXa2;
		} else {
			local8 = local5 = new xa(this.aW2);
		}
		arg0.SA(local8, local5, arg2, arg1 != 0, arg3);
		local8.aClass179Array4 = arg0.aClass179Array4;
		local8.aClass236Array4 = arg0.aClass236Array4;
		return local8;
	}

	@OriginalMember(owner = "client!k", name = "va", descriptor = "(Lclient!za;[Lclient!e;Lclient!c;[III)V")
	public native void va(@OriginalArg(0) Class200 arg0, @OriginalArg(1) Class57[] arg1, @OriginalArg(2) Class29 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!k", name = "ia", descriptor = "(Lclient!e;IILclient!c;Z)Z")
	public native boolean ia(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class29 arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!k", name = "p", descriptor = "()V")
	public native void p();

	@OriginalMember(owner = "client!k", name = "q", descriptor = "(Lclient!za;IIIIIII)V")
	public native void q(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!k", name = "Q", descriptor = "()V")
	private native void Q();

	@OriginalMember(owner = "client!k", name = "W", descriptor = "(Lclient!ya;II)V")
	public native void W(@OriginalArg(0) Class125 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!k", name = "a", descriptor = "()V")
	public void method2801() {
		this.aRunnable1 = Thread.currentThread();
		this.Q();
	}

	@OriginalMember(owner = "client!k", name = "ya", descriptor = "(Lclient!za;II)V")
	private native void ya(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!k", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static155.method2188(this);
		}
	}

	@OriginalMember(owner = "client!k", name = "GA", descriptor = "()V")
	private native void GA();

	@OriginalMember(owner = "client!k", name = "b", descriptor = "()V")
	public void method2802() {
		this.aRunnable1 = null;
		this.GA();
	}

	@OriginalMember(owner = "client!k", name = "s", descriptor = "(Lclient!e;Lclient!e;IIIZ)V")
	public native void s(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!k", name = "J", descriptor = "(Lclient!za;[I[I[I[SI)V")
	public native void J(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) short[] arg4, @OriginalArg(5) int arg5);
}
