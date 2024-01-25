import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class a implements Interface3 {

	@OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "Ljava/lang/Runnable;")
	public Runnable aRunnable1;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "Lclient!oa;")
	private final oa anOa1;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "Lclient!i;")
	private final i anI9;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "Lclient!i;")
	private final i anI7;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "Lclient!i;")
	private final i anI1;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Lclient!i;")
	private final i anI5;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "Lclient!i;")
	private final i anI2;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "Lclient!i;")
	private final i anI3;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "Lclient!i;")
	private final i anI6;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "Lclient!i;")
	private final i anI10;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "Lclient!i;")
	private final i anI4;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "Lclient!i;")
	private final i anI8;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lclient!oa;II)V")
	public a(@OriginalArg(0) oa arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anOa1 = arg0;
		this.anI9 = new i(this.anOa1);
		this.anI7 = new i(this.anOa1);
		this.anI1 = new i(this.anOa1);
		this.anI5 = new i(this.anOa1);
		this.anI2 = new i(this.anOa1);
		this.anI3 = new i(this.anOa1);
		this.anI6 = new i(this.anOa1);
		this.anI10 = new i(this.anOa1);
		this.anI4 = new i(this.anOa1);
		this.anI8 = new i(this.anOa1);
		this.HA(this.nativeid, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static8.method107(this);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "()V")
	private void method1() {
		this.M(this.nativeid);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ka;IILclient!pda;ZI)Z")
	public boolean method2(@OriginalArg(0) Class193 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class51 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		return this.n(this.nativeid, ((i) arg0).nativeid, arg1, arg2, ((ja) arg3).nativeid, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ka;[ILclient!pda;)V")
	public void method3(@OriginalArg(0) Class193 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class51 arg2) {
		this.e(this.nativeid, ((i) arg0).nativeid, arg1, ((ja) arg2).nativeid);
	}

	@OriginalMember(owner = "client!a", name = "w", descriptor = "(Z)V")
	@Override
	public void w(@OriginalArg(0) boolean arg0) {
		this.E(this.nativeid, arg0);
	}

	@OriginalMember(owner = "client!a", name = "UA", descriptor = "(JJJ[II)V")
	private native void UA(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!s;IIIIIII[[Z)V")
	public void method4(@OriginalArg(0) Class91 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) boolean[][] arg5) {
		this.ta(this.nativeid, ((t) arg0).nativeid, 0, 0, 1024, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "HA", descriptor = "(JLclient!ha;II)V")
	private native void HA(@OriginalArg(0) long arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ka;IILclient!pda;Z)Z")
	public boolean method5(@OriginalArg(0) Class193 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class51 arg3, @OriginalArg(4) boolean arg4) {
		return this.R(this.nativeid, ((i) arg0).nativeid, arg1, arg2, ((ja) arg3).nativeid, arg4);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ha;[I[I[I[SI)V")
	public void method6(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) short[] arg4, @OriginalArg(5) int arg5) {
		this.O(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "()V")
	public void method7() {
		this.aRunnable1 = null;
		this.method9();
	}

	@OriginalMember(owner = "client!a", name = "M", descriptor = "(J)V")
	private native void M(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!a", name = "H", descriptor = "(JJII)V")
	private native void H(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "r", descriptor = "(JJJIIIZ)V")
	private native void r(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(JJJ[III)V")
	private native void f(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!a", name = "R", descriptor = "(JJIIJZ)Z")
	private native boolean R(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!a", name = "na", descriptor = "(JLclient!ha;IIIIIII)V")
	private native void na(@OriginalArg(0) long arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!s;III)V")
	public void method8(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.Z(this.nativeid, ((t) arg0).nativeid, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(JJ[IJ)V")
	private native void e(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "client!a", name = "c", descriptor = "()V")
	private void method9() {
		this.W(this.nativeid);
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "()V")
	public void method10() {
		this.aRunnable1 = Thread.currentThread();
		this.method1();
	}

	@OriginalMember(owner = "client!a", name = "n", descriptor = "(JJIIJZI)Z")
	private native boolean n(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!a", name = "W", descriptor = "(J)V")
	private native void W(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!i;BIZ)Lclient!ka;")
	public Class193 method11(@OriginalArg(0) i arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) i local8;
		@Pc(5) i local5;
		if (arg1 == 1) {
			local5 = this.anI3;
			local8 = this.anI9;
		} else if (arg1 == 2) {
			local5 = this.anI6;
			local8 = this.anI7;
		} else if (arg1 == 3) {
			local5 = this.anI10;
			local8 = this.anI1;
		} else if (arg1 == 4) {
			local5 = this.anI4;
			local8 = this.anI5;
		} else if (arg1 == 5) {
			local5 = this.anI8;
			local8 = this.anI2;
		} else {
			local8 = local5 = new i(this.anOa1);
		}
		arg0.ZA(local8, local5, arg2, arg1 != 0, arg3);
		local8.aClass287Array1 = arg0.aClass287Array1;
		local8.aClass156Array1 = arg0.aClass156Array1;
		return local8;
	}

	@OriginalMember(owner = "client!a", name = "ta", descriptor = "(JJIIIIIII[[Z)V")
	private native void ta(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean[][] arg9);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ka;Lclient!ka;IIIZ)V")
	public void method12(@OriginalArg(0) Class193 arg0, @OriginalArg(1) Class193 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.r(this.nativeid, ((i) arg0).nativeid, ((i) arg1).nativeid, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "E", descriptor = "(JZ)V")
	private native void E(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ka;Lclient!pda;[II)V")
	public void method13(@OriginalArg(0) Class193 arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		this.UA(this.nativeid, ((i) arg0).nativeid, ((ja) arg1).nativeid, arg2, arg3);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!s;II)V")
	public void method14(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.H(this.nativeid, ((t) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!a", name = "O", descriptor = "(JLclient!ha;[I[I[I[SI)V")
	private native void O(@OriginalArg(0) long arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ha;IIIIIII)V")
	public void method15(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.na(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, 0);
	}

	@OriginalMember(owner = "client!a", name = "Z", descriptor = "(JJIII)V")
	private native void Z(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ka;Lclient!pda;[III)V")
	public void method16(@OriginalArg(0) Class193 arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.f(this.nativeid, ((i) arg0).nativeid, ((ja) arg1).nativeid, arg2, arg3, arg4);
	}
}
