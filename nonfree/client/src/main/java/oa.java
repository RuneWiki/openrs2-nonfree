import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class oa extends Class22 implements Interface6 {

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "Lclient!ya;")
	private ya aYa2;

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "Lclient!cl;")
	private Class58 aClass58_6;

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "Lclient!p;")
	private p aP1;

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "[Lclient!a;")
	private a[] anAArray1;

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "I")
	public int anInt7156;

	@OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
	public final long nativeid = 0L;

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "Z")
	private boolean aBoolean483 = false;

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "Lclient!sja;")
	private final Class342 aClass342_56 = new Class342();

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
	private int anInt7154 = 4096;

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
	private int anInt7155 = 4096;

	@OriginalMember(owner = "client!oa", name = "J", descriptor = "Lclient!qn;")
	private final Class313 aClass313_37 = new Class313(4);

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "Z")
	private boolean aBoolean484 = false;

	@OriginalMember(owner = "client!oa", name = "O", descriptor = "Lclient!cl;")
	private Class58 aClass58_7;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public oa(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg1);
		try {
			if (!Static67.method1514("sw3d")) {
				throw new RuntimeException("");
			}
			Static199.method3052();
			this.MA(super.anInterface4_14, 0, 0);
			Static633.method8323(true, false);
			this.aBoolean484 = true;
			this.aClass58_7 = new ja();
			this.method9405(new ja());
			this.method9373(1);
			this.method9357(0);
			if (arg0 != null) {
				this.method9370(arg0, arg2, arg3);
				this.method9347(arg0);
			}
		} catch (@Pc(82) Throwable local82) {
			this.method9397();
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z")
	@Override
	public boolean method9380() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
	public native int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method9395(@OriginalArg(0) Canvas arg0) {
		if (this.aP1.aCanvas7 == arg0) {
			this.method9347((Canvas) null);
		}
		@Pc(18) p local18 = (p) this.aClass313_37.method7104((long) arg0.hashCode());
		if (local18 != null) {
			local18.method9596();
			local18.method6522();
		}
	}

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
	private native void n(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
	public native void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "()I")
	@Override
	public int method9362() {
		return 4;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!gt;IIII)Lclient!ka;")
	@Override
	public Class170 method9382(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new i(this, this.aYa2, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
	public native void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method9385(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6524(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
	@Override
	public void method9387(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method16();
	}

	@OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
	private native void ma(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
	private native void AA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) byte arg16, @OriginalArg(17) boolean arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) int arg19);

	@OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
	public native void xa(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "()Z")
	@Override
	public boolean method9332() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

	@OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
	public native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "(I)V")
	@Override
	public void method9343() {
		this.anInt7154 = this.anInt7155 = 10000;
		if (this.anInt7156 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method9373(this.anInt7156);
		this.method9357(0);
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
	public native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
	private void method6203() {
		System.gc();
		System.runFinalization();
		Static199.method3053();
	}

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method9401(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass313_37.method7104((long) arg0.hashCode());
		local8.method6523(arg0, arg1, arg2);
		if (arg0 != null && arg0 == this.aP1.aCanvas7) {
			this.method9347(arg0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "()Lclient!cl;")
	@Override
	public Class58 method9376() {
		return new ja();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method9370(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass313_37.method7104((long) arg0.hashCode());
		if (local8 == null) {
			try {
				@Pc(15) Class local15 = Class.forName("java.awt.Canvas");
				@Pc(27) Method local27 = local15.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local27.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(39) Exception local39) {
			}
			local8 = new p(this, arg0, arg1, arg2);
			this.aClass313_37.method7107((long) arg0.hashCode(), local8);
		} else if (local8.anInt7552 != arg1 || local8.anInt7551 != arg2) {
			local8.method6523(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Lclient!d;II)V")
	private native void MA(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!hw;[Lclient!tm;Z)Lclient!da;")
	@Override
	public Class57 method9353(@OriginalArg(0) Class169 arg0, @OriginalArg(1) Class361[] arg1, @OriginalArg(2) boolean arg2) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt9706;
			local7[local11] = arg1[local11].anInt9707;
			if (arg1[local11].aByteArray91 != null) {
				local9 = true;
			}
		}
		if (arg2) {
			if (local9) {
				throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
			}
			return new h(this, this.aYa2, arg0, arg1, (Class178[]) null);
		} else if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		} else {
			return new n(this, this.aYa2, arg0, arg1, (Class178[]) null);
		}
	}

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "()Lclient!cl;")
	@Override
	public Class58 method9354() {
		return this.aClass58_7;
	}

	@OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
	public native void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "()Lclient!an;")
	@Override
	public Class19 method9364() {
		return new Class19(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z")
	@Override
	public boolean method9335() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z")
	@Override
	public boolean method9346() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
	public native void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
	public native int E();

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z")
	@Override
	public boolean method9340() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lclient!si;")
	@Override
	public Interface23 method9381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method9361(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILclient!aa;II)V")
	private native void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class259 method9407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new t(this, this.aYa2, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
	public native int XA();

	@OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
	protected native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)I")
	@Override
	public int method9375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lclient!kw;")
	@Override
	public Class178 method9322(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new j(this, arg0, 0, arg1, arg2, arg3, false);
	}

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "()V")
	@Override
	public void method9345() {
	}

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "()V")
	@Override
	public void method9351() {
		this.method9347(this.aP1.aCanvas7);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ih;Lclient!ih;FLclient!ih;)Lclient!ih;")
	@Override
	public Class113 method9334(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class113 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class113 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "()V")
	@Override
	public void method9389() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!so;I)V")
	@Override
	public void method9360(@OriginalArg(0) Class346 arg0, @OriginalArg(1) int arg1) {
		this.method6205(arg0);
		this.method6204().method3(this, Static457.anIntArray531, Static457.anIntArray528, Static457.anIntArray527, Static457.aShortArray98, arg0.aClass357_1.method8206());
	}

	@OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
	private native void CA(@OriginalArg(0) short arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) boolean arg16, @OriginalArg(17) byte arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) boolean arg19, @OriginalArg(20) int arg20);

	@OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
	public native void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!si;Lclient!es;)Lclient!vv;")
	@Override
	public Interface25 method9359(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) Interface8 arg1) {
		return new wa(this, (j) arg0, (xa) arg1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method9377() {
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)I")
	@Override
	public int method9324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!vv;)V")
	@Override
	public void method9398(@OriginalArg(0) Interface25 arg0) {
		@Pc(2) wa local2 = (wa) arg0;
		this.n(local2.aJ1.nativeid, local2.aXa1.nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	@Override
	public void method9393(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ih;)V")
	@Override
	public void method9333(@OriginalArg(0) Class113 arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
	@Override
	public void method9394(@OriginalArg(0) int arg0) {
		Static199.method3053();
		this.d(arg0);
		for (@Pc(10) ya local10 = (ya) this.aClass342_56.method7644(); local10 != null; local10 = (ya) this.aClass342_56.method7650()) {
			local10.r();
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
	@Override
	public void method9374(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method9397();
		if (this.nativeid != 0L) {
			Static199.method3055(this);
		}
	}

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
	public native int I();

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)Lclient!es;")
	@Override
	public Interface8 method9383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new xa(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
	public native void C(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILclient!aa;II)V")
	public native void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
	public native void GA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lclient!kw;")
	@Override
	public Class178 method9356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new j(this, arg0, arg1, arg2, arg3, !arg4);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lclient!kw;")
	@Override
	public Class178 method9361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new j(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lclient!jw;")
	@Override
	public Class3_Sub5 method9337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub5_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "()Lclient!cl;")
	@Override
	public Class58 method9369() {
		return this.aClass58_6;
	}

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
	public native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
	public native void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
	public native void K(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "()V")
	@Override
	public void method9328() {
	}

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
	public native void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lclient!jw;)V")
	@Override
	public void method9350(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub5[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static457.anIntArray529[local1++] = arg1[local3].method7174();
			Static457.anIntArray529[local1++] = arg1[local3].method7175();
			Static457.anIntArray529[local1++] = arg1[local3].method7177();
			Static457.anIntArray529[local1++] = arg1[local3].method7173();
			Static457.aFloatArray51[local3] = arg1[local3].method7176();
			Static457.anIntArray529[local1++] = arg1[local3].method7172();
		}
		this.N(arg0, Static457.anIntArray529, Static457.aFloatArray51);
	}

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
	private native void N(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method9341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.Z(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method9326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6526(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method9331(@OriginalArg(0) Class3_Sub16 arg0) {
		this.aYa2 = (ya) arg0;
		this.va(arg0);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method9355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new na(this, this.aYa2, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
	public native void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "()Z")
	@Override
	public boolean method9342() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
	public native void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method9390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
	@Override
	public void method9371(@OriginalArg(0) int[] arg0) {
		@Pc(4) Dimension local4 = this.aP1.aCanvas7.getSize();
		arg0[0] = local4.width;
		arg0[1] = local4.height;
	}

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "()V")
	@Override
	protected void method9339() {
		if (this.aBoolean483) {
			return;
		}
		this.anAArray1 = null;
		this.aP1 = null;
		this.aYa2 = null;
		this.aClass58_7 = null;
		this.aClass313_37.method7101();
		for (@Pc(26) ya local26 = (ya) this.aClass342_56.method7644(); local26 != null; local26 = (ya) this.aClass342_56.method7650()) {
			local26.ga();
		}
		this.aClass342_56.method7655();
		this.FA();
		if (this.aBoolean484) {
			Static134.method2374(false, true);
			this.aBoolean484 = false;
		}
		this.method6203();
		Static199.method3056();
		this.aBoolean483 = true;
	}

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z")
	@Override
	public boolean method9323() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
	@Override
	public void method9338(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "()Lclient!a;")
	public a method6204() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7156; local1++) {
			if (this.anAArray1[local1].aRunnable1 == Thread.currentThread()) {
				return this.anAArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
	@Override
	public void method9357(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method6();
	}

	@OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
	public native void la();

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "()Z")
	@Override
	public boolean method9408() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "()V")
	@Override
	public void method9372() {
	}

	@OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
	public native int[] Y();

	@OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)Lclient!ih;")
	@Override
	public Class113 method9366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
	public native int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z")
	@Override
	public boolean method9379() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "()Z")
	@Override
	public boolean method9388() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)Lclient!za;")
	@Override
	public Class3_Sub16 method9329(@OriginalArg(0) int arg0) {
		@Pc(5) ya local5 = new ya(this, arg0);
		this.aClass342_56.method7654(local5);
		return local5;
	}

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z")
	@Override
	public boolean method9386() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method9404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.wa(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method9403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()V")
	@Override
	public void method9396() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!cl;)V")
	@Override
	public void method9405(@OriginalArg(0) Class58 arg0) {
		this.aClass58_6 = arg0;
		this.ma(((ja) arg0).nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lclient!p;)V")
	private native void t(@OriginalArg(0) p arg0);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	@Override
	public void method9373(@OriginalArg(0) int arg0) {
		this.anInt7156 = arg0;
		this.anAArray1 = new a[this.anInt7156];
		for (@Pc(9) int local9 = 0; local9 < this.anInt7156; local9++) {
			this.anAArray1[local9] = new a(this, this.anInt7154, this.anInt7155);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!so;Z)V")
	private void method6205(@OriginalArg(0) Class346 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class9_Sub2_Sub1 local15 = (Class9_Sub2_Sub1) arg0.aClass357_1.method8210(); local15 != null; local15 = (Class9_Sub2_Sub1) arg0.aClass357_1.method8208()) {
			Static457.anIntArray531[local1++] = local15.anInt1777;
			Static457.anIntArray531[local1++] = local15.anInt1772;
			Static457.anIntArray531[local1++] = local15.anInt1776;
			Static457.anIntArray528[local3++] = local15.anInt1780;
			Static457.aShortArray98[local7++] = (short) local15.anInt1774;
			Static457.anIntArray527[local5++] = local15.anInt1775;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!tm;Z)Lclient!kw;")
	@Override
	public Class178 method9363(@OriginalArg(0) Class361 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) j local17 = new j(this, arg0.anIntArray701, arg0.aByteArray90, arg0.aByteArray91, 0, arg0.anInt9706, arg0.anInt9706, arg0.anInt9707);
		local17.method7631(arg0.anInt9703, arg0.anInt9704, arg0.anInt9708, arg0.anInt9705);
		return local17;
	}

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
	@Override
	public boolean method9406() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
	public native int i();

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
	public native int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "()Z")
	@Override
	public boolean method9365() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method9349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6204().method2(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
	private native void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "()Z")
	@Override
	public boolean method9392() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method9347(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aP1 = null;
			this.t((p) null);
		} else {
			@Pc(10) p local10 = (p) this.aClass313_37.method7104((long) arg0.hashCode());
			this.aP1 = local10;
			this.t(local10);
		}
	}

	@OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lclient!za;)V")
	private native void va(@OriginalArg(0) Class3_Sub16 arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method9344(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
	private boolean method6206(@OriginalArg(0) short arg0) {
		@Pc(2) Interface4 local2 = super.anInterface4_14;
		synchronized (super.anInterface4_14) {
			if (!super.anInterface4_14.method5758(arg0)) {
				return false;
			}
			@Pc(22) Class406 local22 = super.anInterface4_14.method5761(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(44) int[] local44;
			if (local22.anInt11143 == 2) {
				local44 = super.anInterface4_14.method5757(128, 128, arg0, 0.7F);
			} else {
				local44 = super.anInterface4_14.method5760(128, 128, true, 0.7F, arg0);
			}
			this.CA(arg0, local44, local22.aShort127, local22.anInt11143, local22.aByte149, local22.aByte147, local22.anInt11146, local22.aBoolean762, local22.aByte144, local22.aByte146, local22.aByte145, local22.aByte150, local22.aBoolean761, local22.aBoolean765, local22.aBoolean764, local22.aBoolean766, local22.aBoolean759, local22.aByte148, local22.aBoolean763, local22.aBoolean760, local22.anInt11144);
			return true;
		}
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
	private boolean method6207(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class406 local9 = super.anInterface4_14.method5761(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.AA(arg0, local9.aShort127, local9.anInt11143, local9.aByte149, local9.aByte147, local9.anInt11146, local9.aBoolean762, local9.aByte144, local9.aByte146, local9.aByte145, local9.aByte150, local9.aBoolean761, local9.aBoolean765, local9.aBoolean764, local9.aBoolean766, local9.aBoolean759, local9.aByte148, local9.aBoolean763, local9.aBoolean760, local9.anInt11144);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
	private Object method6208() {
		return new ba(this);
	}

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
	public native void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
	private native void FA();

	@OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
	public native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	private native void d(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method9352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!so;)V")
	@Override
	public void method9384(@OriginalArg(0) Class346 arg0) {
		if (arg0.aClass357_1.method8206() != 0) {
			this.method6205(arg0);
			this.method6204().method3(this, Static457.anIntArray531, Static457.anIntArray528, Static457.anIntArray527, Static457.aShortArray98, arg0.aClass357_1.method8206());
		}
	}
}
