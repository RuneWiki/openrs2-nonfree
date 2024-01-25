import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class ma implements Interface3 {

	@OriginalMember(owner = "client!ma", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "Ljava/lang/Runnable;")
	public Runnable aRunnable2;

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "Lclient!h;")
	private final h aH2;

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "Lclient!p;")
	private final p aP3;

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "Lclient!p;")
	private final p aP4;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "Lclient!p;")
	private final p aP1;

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "Lclient!p;")
	private final p aP7;

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "Lclient!p;")
	private final p aP9;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "Lclient!p;")
	private final p aP2;

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "Lclient!p;")
	private final p aP10;

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "Lclient!p;")
	private final p aP8;

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "Lclient!p;")
	private final p aP6;

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "Lclient!p;")
	private final p aP5;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!h;II)V")
	public ma(@OriginalArg(0) h arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aH2 = arg0;
		this.aP3 = new p(this.aH2);
		this.aP4 = new p(this.aH2);
		this.aP1 = new p(this.aH2);
		this.aP7 = new p(this.aH2);
		this.aP9 = new p(this.aH2);
		this.aP2 = new p(this.aH2);
		this.aP10 = new p(this.aH2);
		this.aP8 = new p(this.aH2);
		this.aP6 = new p(this.aH2);
		this.aP5 = new p(this.aH2);
		this.w(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ma", name = "sa", descriptor = "(Lclient!qa;IIIIIII)V")
	public native void sa(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ma", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
	public void method3778() {
		this.aRunnable2 = null;
		this.Y();
	}

	@OriginalMember(owner = "client!ma", name = "pa", descriptor = "(Lclient!qa;[Lclient!c;Lclient!ia;[II[I[I[I[S[BI[I)V")
	public native void pa(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class31[] arg1, @OriginalArg(2) Class106 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11);

	@OriginalMember(owner = "client!ma", name = "w", descriptor = "(Lclient!qa;II)V")
	private native void w(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ma", name = "Y", descriptor = "()V")
	private native void Y();

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "(Lclient!qa;Lclient!c;Lclient!ia;[II[I[I[I[S[BI[I)V")
	public native void f(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class106 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11);

	@OriginalMember(owner = "client!ma", name = "Z", descriptor = "()V")
	private native void Z();

	@OriginalMember(owner = "client!ma", name = "ua", descriptor = "(Lclient!c;IILclient!ia;Z)Z")
	public native boolean ua(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class106 arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ma", name = "fa", descriptor = "(Lclient!c;Lclient!ia;[II)V")
	public native void fa(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static280.method4134(this);
	}

	@OriginalMember(owner = "client!ma", name = "S", descriptor = "(Lclient!qa;[I[I[I[SI)V")
	public native void S(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) short[] arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(Lclient!c;Lclient!ia;[III)V")
	public native void d(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ma", name = "ka", descriptor = "(Lclient!na;II)V")
	public native void ka(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ma", name = "I", descriptor = "(Lclient!c;Lclient!c;IIIZ)V")
	public native void I(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!ma", name = "J", descriptor = "(Lclient!na;IIIIIII[[Z)V")
	public native void J(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean[][] arg8);

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "()V")
	public void method3779() {
		this.aRunnable2 = Thread.currentThread();
		this.Z();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!p;BIZ)Lclient!c;")
	public Class31 method3780(@OriginalArg(0) p arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) p local8;
		@Pc(5) p local5;
		if (arg1 == 1) {
			local5 = this.aP2;
			local8 = this.aP3;
		} else if (arg1 == 2) {
			local5 = this.aP10;
			local8 = this.aP4;
		} else if (arg1 == 3) {
			local5 = this.aP8;
			local8 = this.aP1;
		} else if (arg1 == 4) {
			local5 = this.aP6;
			local8 = this.aP7;
		} else if (arg1 == 5) {
			local5 = this.aP5;
			local8 = this.aP9;
		} else {
			local8 = local5 = new p(this.aH2);
		}
		arg0.j(local8, local5, arg2, arg1 != 0, arg3);
		local8.aClass209Array2 = arg0.aClass209Array2;
		local8.aClass178Array2 = arg0.aClass178Array2;
		return local8;
	}

	@OriginalMember(owner = "client!ma", name = "za", descriptor = "(Lclient!qa;[Lclient!c;Lclient!ia;[III)V")
	public native void za(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class31[] arg1, @OriginalArg(2) Class106 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);
}
