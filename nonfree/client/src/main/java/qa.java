import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class qa implements Interface16 {

	@OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "Ljava/lang/Runnable;")
	public Runnable aRunnable2;

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "Lclient!l;")
	private final l aL1;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "Lclient!v;")
	private final v aV2;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "Lclient!v;")
	private final v aV10;

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "Lclient!v;")
	private final v aV8;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "Lclient!v;")
	private final v aV1;

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "Lclient!v;")
	private final v aV6;

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "Lclient!v;")
	private final v aV7;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "Lclient!v;")
	private final v aV5;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "Lclient!v;")
	private final v aV3;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "Lclient!v;")
	private final v aV4;

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "Lclient!v;")
	private final v aV9;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lclient!l;II)V")
	public qa(@OriginalArg(0) l arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aL1 = arg0;
		this.aV2 = new v(this.aL1);
		this.aV10 = new v(this.aL1);
		this.aV8 = new v(this.aL1);
		this.aV1 = new v(this.aL1);
		this.aV6 = new v(this.aL1);
		this.aV7 = new v(this.aL1);
		this.aV5 = new v(this.aL1);
		this.aV3 = new v(this.aL1);
		this.aV4 = new v(this.aL1);
		this.aV9 = new v(this.aL1);
		this.DA(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qa", name = "GA", descriptor = "()V")
	private native void GA();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!v;BIZ)Lclient!da;")
	public Class60 method6003(@OriginalArg(0) v arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) v local8;
		@Pc(5) v local5;
		if (arg1 == 1) {
			local5 = this.aV7;
			local8 = this.aV2;
		} else if (arg1 == 2) {
			local5 = this.aV5;
			local8 = this.aV10;
		} else if (arg1 == 3) {
			local5 = this.aV3;
			local8 = this.aV8;
		} else if (arg1 == 4) {
			local5 = this.aV4;
			local8 = this.aV1;
		} else if (arg1 == 5) {
			local5 = this.aV9;
			local8 = this.aV6;
		} else {
			local8 = local5 = new v(this.aL1);
		}
		arg0.n(local8, local5, arg2, arg1 != 0, arg3);
		local8.aClass248Array5 = arg0.aClass248Array5;
		local8.aClass281Array5 = arg0.aClass281Array5;
		return local8;
	}

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "(Lclient!da;[ILclient!q;)V")
	public native void s(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class11 arg2);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
	public void method6004() {
		this.aRunnable2 = Thread.currentThread();
		this.GA();
	}

	@OriginalMember(owner = "client!qa", name = "HA", descriptor = "(Lclient!r;[I[I[I[SI)V")
	public native void HA(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) short[] arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "ZA", descriptor = "(Lclient!i;II)V")
	public native void ZA(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static388.method5743(this);
		}
	}

	@OriginalMember(owner = "client!qa", name = "J", descriptor = "(Lclient!da;Lclient!q;[III)V")
	public native void J(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "LA", descriptor = "(Lclient!da;Lclient!q;[II)V")
	public native void LA(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "(Lclient!da;Lclient!da;IIIZ)V")
	public native void i(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!qa", name = "E", descriptor = "()V")
	private native void E();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()V")
	public void method6005() {
		this.aRunnable2 = null;
		this.E();
	}

	@OriginalMember(owner = "client!qa", name = "XA", descriptor = "(Lclient!da;IILclient!q;Z)Z")
	public native boolean XA(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11 arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!qa", name = "G", descriptor = "(Lclient!r;IIIIIII)V")
	public native void G(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!qa", name = "DA", descriptor = "(Lclient!r;II)V")
	private native void DA(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "la", descriptor = "(Lclient!i;IIIIIII[[Z)V")
	public native void la(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean[][] arg8);
}
