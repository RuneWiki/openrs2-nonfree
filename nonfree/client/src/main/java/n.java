import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class n implements Interface2 {

	@OriginalMember(owner = "client!n", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!n", name = "k", descriptor = "Ljava/lang/Runnable;")
	public Runnable aRunnable2;

	@OriginalMember(owner = "client!n", name = "l", descriptor = "Lclient!qa;")
	private final qa aQa3;

	@OriginalMember(owner = "client!n", name = "b", descriptor = "Lclient!da;")
	private final da aDa2;

	@OriginalMember(owner = "client!n", name = "j", descriptor = "Lclient!da;")
	private final da aDa10;

	@OriginalMember(owner = "client!n", name = "c", descriptor = "Lclient!da;")
	private final da aDa3;

	@OriginalMember(owner = "client!n", name = "e", descriptor = "Lclient!da;")
	private final da aDa5;

	@OriginalMember(owner = "client!n", name = "f", descriptor = "Lclient!da;")
	private final da aDa6;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "Lclient!da;")
	private final da aDa1;

	@OriginalMember(owner = "client!n", name = "h", descriptor = "Lclient!da;")
	private final da aDa8;

	@OriginalMember(owner = "client!n", name = "g", descriptor = "Lclient!da;")
	private final da aDa7;

	@OriginalMember(owner = "client!n", name = "d", descriptor = "Lclient!da;")
	private final da aDa4;

	@OriginalMember(owner = "client!n", name = "i", descriptor = "Lclient!da;")
	private final da aDa9;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lclient!qa;II)V")
	public n(@OriginalArg(0) qa arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aQa3 = arg0;
		this.aDa2 = new da(this.aQa3);
		this.aDa10 = new da(this.aQa3);
		this.aDa3 = new da(this.aQa3);
		this.aDa5 = new da(this.aQa3);
		this.aDa6 = new da(this.aQa3);
		this.aDa1 = new da(this.aQa3);
		this.aDa8 = new da(this.aQa3);
		this.aDa7 = new da(this.aQa3);
		this.aDa4 = new da(this.aQa3);
		this.aDa9 = new da(this.aQa3);
		this.O(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!n", name = "ta", descriptor = "(Lclient!t;Lclient!c;[III)V")
	public native void ta(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!n", name = "IA", descriptor = "()V")
	private native void IA();

	@OriginalMember(owner = "client!n", name = "EA", descriptor = "()V")
	public native void EA();

	@OriginalMember(owner = "client!n", name = "v", descriptor = "(Lclient!ta;IIIIIII[[Z)V")
	public native void v(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean[][] arg8);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "()V")
	public void method3860() {
		this.aRunnable2 = Thread.currentThread();
		this.IA();
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "()V")
	public void method3861() {
		this.aRunnable2 = null;
		this.c();
	}

	@OriginalMember(owner = "client!n", name = "G", descriptor = "(Lclient!ya;[I[I[I[SI)V")
	public native void G(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) short[] arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!n", name = "B", descriptor = "(Lclient!t;IILclient!c;Z)Z")
	public native boolean B(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class35 arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!n", name = "A", descriptor = "(Lclient!ta;II)V")
	public native void A(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!n", name = "TA", descriptor = "(Lclient!ya;[Lclient!t;Lclient!c;[III)V")
	public native void TA(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class91[] arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!n", name = "ea", descriptor = "(Lclient!t;Lclient!c;[II)V")
	public native void ea(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!n", name = "Y", descriptor = "(Lclient!ya;[Lclient!t;Lclient!c;[II[I[I[I[S[BI[I)V")
	public native void Y(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class91[] arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11);

	@OriginalMember(owner = "client!n", name = "U", descriptor = "(Lclient!t;Lclient!t;IIIZ)V")
	public native void U(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static409.method5378(this);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!da;BIZ)Lclient!t;")
	public Class91 method3862(@OriginalArg(0) da arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) da local8;
		@Pc(5) da local5;
		if (arg1 == 1) {
			local5 = this.aDa1;
			local8 = this.aDa2;
		} else if (arg1 == 2) {
			local5 = this.aDa8;
			local8 = this.aDa10;
		} else if (arg1 == 3) {
			local5 = this.aDa7;
			local8 = this.aDa3;
		} else if (arg1 == 4) {
			local5 = this.aDa4;
			local8 = this.aDa5;
		} else if (arg1 == 5) {
			local5 = this.aDa9;
			local8 = this.aDa6;
		} else {
			local8 = local5 = new da(this.aQa3);
		}
		arg0.ya(local8, local5, arg2, arg1 != 0, arg3);
		local8.aClass200Array1 = arg0.aClass200Array1;
		local8.aClass189Array1 = arg0.aClass189Array1;
		return local8;
	}

	@OriginalMember(owner = "client!n", name = "va", descriptor = "(Lclient!ya;IIIIIII)V")
	public native void va(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!n", name = "O", descriptor = "(Lclient!ya;II)V")
	private native void O(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!n", name = "c", descriptor = "()V")
	private native void c();

	@OriginalMember(owner = "client!n", name = "ba", descriptor = "(Lclient!ya;Lclient!t;Lclient!c;[II[I[I[I[S[BI[I)V")
	public native void ba(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11);
}
