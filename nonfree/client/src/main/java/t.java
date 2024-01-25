import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class t implements Interface8 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "Ljava/lang/Runnable;")
	public Runnable aRunnable4;

	@OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!t", name = "h", descriptor = "Lclient!da;")
	private final da aDa2;

	@OriginalMember(owner = "client!t", name = "i", descriptor = "Lclient!j;")
	private final j aJ7;

	@OriginalMember(owner = "client!t", name = "e", descriptor = "Lclient!j;")
	private final j aJ4;

	@OriginalMember(owner = "client!t", name = "f", descriptor = "Lclient!j;")
	private final j aJ5;

	@OriginalMember(owner = "client!t", name = "j", descriptor = "Lclient!j;")
	private final j aJ8;

	@OriginalMember(owner = "client!t", name = "g", descriptor = "Lclient!j;")
	private final j aJ6;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "Lclient!j;")
	private final j aJ2;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "Lclient!j;")
	private final j aJ3;

	@OriginalMember(owner = "client!t", name = "l", descriptor = "Lclient!j;")
	private final j aJ10;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "Lclient!j;")
	private final j aJ1;

	@OriginalMember(owner = "client!t", name = "k", descriptor = "Lclient!j;")
	private final j aJ9;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!da;II)V")
	public t(@OriginalArg(0) da arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aDa2 = arg0;
		this.aJ7 = new j(this.aDa2);
		this.aJ4 = new j(this.aDa2);
		this.aJ5 = new j(this.aDa2);
		this.aJ8 = new j(this.aDa2);
		this.aJ6 = new j(this.aDa2);
		this.aJ2 = new j(this.aDa2);
		this.aJ3 = new j(this.aDa2);
		this.aJ10 = new j(this.aDa2);
		this.aJ1 = new j(this.aDa2);
		this.aJ9 = new j(this.aDa2);
		this.QA(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!t", name = "IA", descriptor = "(Lclient!oa;IIIIIII)V")
	public native void IA(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!t", name = "N", descriptor = "(Lclient!ba;Lclient!q;[III)V")
	public native void N(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class205 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static354.method5572(this);
		}
	}

	@OriginalMember(owner = "client!t", name = "ja", descriptor = "()V")
	private native void ja();

	@OriginalMember(owner = "client!t", name = "J", descriptor = "(Lclient!d;IIIIIII[[Z)V")
	public native void J(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean[][] arg8);

	@OriginalMember(owner = "client!t", name = "w", descriptor = "(Lclient!ba;Lclient!q;[II)V")
	public native void w(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class205 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!t", name = "WA", descriptor = "(Lclient!oa;[I[I[I[SI)V")
	public native void WA(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) short[] arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
	public void method6843() {
		this.aRunnable4 = Thread.currentThread();
		this.Q();
	}

	@OriginalMember(owner = "client!t", name = "QA", descriptor = "(Lclient!oa;II)V")
	private native void QA(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!t", name = "JA", descriptor = "(Lclient!ba;[ILclient!q;)V")
	public native void JA(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class205 arg2);

	@OriginalMember(owner = "client!t", name = "v", descriptor = "(Lclient!oa;[Lclient!ba;Lclient!q;[II[I[I[I[S[BI[I)V")
	public native void v(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class2[] arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11);

	@OriginalMember(owner = "client!t", name = "H", descriptor = "(Z)V")
	public native void H(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!t", name = "ma", descriptor = "(Lclient!d;II)V")
	public native void ma(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!t", name = "b", descriptor = "()V")
	public void method6844() {
		this.aRunnable4 = null;
		this.ja();
	}

	@OriginalMember(owner = "client!t", name = "n", descriptor = "(Lclient!oa;[Lclient!ba;Lclient!q;[III)V")
	public native void n(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class2[] arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!t", name = "m", descriptor = "(Lclient!oa;Lclient!ba;Lclient!q;[II[I[I[I[S[BI[I)V")
	public native void m(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class2 arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!j;BIZ)Lclient!ba;")
	public Class2 method6845(@OriginalArg(0) j arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) j local8;
		@Pc(5) j local5;
		if (arg1 == 1) {
			local5 = this.aJ2;
			local8 = this.aJ7;
		} else if (arg1 == 2) {
			local5 = this.aJ3;
			local8 = this.aJ4;
		} else if (arg1 == 3) {
			local5 = this.aJ10;
			local8 = this.aJ5;
		} else if (arg1 == 4) {
			local5 = this.aJ1;
			local8 = this.aJ8;
		} else if (arg1 == 5) {
			local5 = this.aJ9;
			local8 = this.aJ6;
		} else {
			local8 = local5 = new j(this.aDa2);
		}
		arg0.L(local8, local5, arg2, arg1 != 0, arg3);
		local8.aClass83Array4 = arg0.aClass83Array4;
		local8.aClass109Array4 = arg0.aClass109Array4;
		return local8;
	}

	@OriginalMember(owner = "client!t", name = "Q", descriptor = "()V")
	private native void Q();

	@OriginalMember(owner = "client!t", name = "o", descriptor = "(Lclient!ba;Lclient!ba;IIIZ)V")
	public native void o(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!ba;IILclient!q;Z)Z")
	public native boolean a(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class205 arg3, @OriginalArg(4) boolean arg4);
}
