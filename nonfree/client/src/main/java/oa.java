import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class oa extends Class87 implements Interface8 {

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "Lclient!ya;")
	private ya aYa2;

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "Lclient!kd;")
	private Class6 aClass6_28;

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "Lclient!p;")
	private p aP1;

	@OriginalMember(owner = "client!oa", name = "W", descriptor = "I")
	public int anInt7046;

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "[Lclient!a;")
	private a[] anAArray1;

	@OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
	public final long nativeid = 0L;

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "Z")
	private boolean aBoolean524 = false;

	@OriginalMember(owner = "client!oa", name = "J", descriptor = "Lclient!nt;")
	private final Class238 aClass238_42 = new Class238();

	@OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
	private int anInt7044 = 4096;

	@OriginalMember(owner = "client!oa", name = "V", descriptor = "I")
	private int anInt7045 = 4096;

	@OriginalMember(owner = "client!oa", name = "S", descriptor = "Lclient!mp;")
	private final Class222 aClass222_29 = new Class222(4);

	@OriginalMember(owner = "client!oa", name = "Y", descriptor = "Z")
	private boolean aBoolean525 = false;

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "Lclient!kd;")
	private Class6 aClass6_29;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public oa(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg1);
		try {
			if (!Static472.method6791("sw3d")) {
				throw new RuntimeException("");
			}
			Static46.method927();
			this.MA(super.anInterface6_11, 0, 0);
			Static240.method3965(false, true);
			this.aBoolean525 = true;
			this.aClass6_29 = new ja();
			this.method7896(new ja());
			this.method7938(1);
			this.method7890(0);
			if (arg0 != null) {
				this.method7974(arg0, arg2, arg3);
				this.method7891(arg0);
			}
		} catch (@Pc(80) Throwable local80) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()Lclient!kd;")
	@Override
	public Class6 method7892() {
		return this.aClass6_29;
	}

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
	private native void n(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()V")
	@Override
	public void method7893() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7891(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aP1 = null;
			this.t(null);
		} else {
			@Pc(10) p local10 = (p) this.aClass222_29.method5468((long) arg0.hashCode());
			this.aP1 = local10;
			this.t(local10);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lclient!bh;)V")
	@Override
	public void method7926(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static393.anIntArray476[local1++] = arg1[local3].method8150();
			Static393.anIntArray476[local1++] = arg1[local3].method8158();
			Static393.anIntArray476[local1++] = arg1[local3].method8151();
			Static393.anIntArray476[local1++] = arg1[local3].method8154();
			Static393.aFloatArray59[local3] = arg1[local3].method8156();
			Static393.anIntArray476[local1++] = arg1[local3].method8152();
		}
		this.N(arg0, Static393.anIntArray476, Static393.aFloatArray59);
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)I")
	@Override
	public int method7952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "()Z")
	@Override
	public boolean method7912() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
	public native int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
	private native void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)Lclient!c;")
	@Override
	public Interface2 method7973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method7931(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!fp;[Lclient!fw;Z)Lclient!da;")
	@Override
	public Class64 method7965(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Class120[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt3710;
			local7[local11] = arg1[local11].anInt3707;
			if (arg1[local11].aByteArray35 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new h(this, this.aYa2, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
	public native void xa(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "()Z")
	@Override
	public boolean method7968() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()Lclient!kd;")
	@Override
	public Class6 method7910() {
		return new ja();
	}

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
	public native void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
	public native int[] Y();

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)Lclient!za;")
	@Override
	public Class2_Sub11 method7920(@OriginalArg(0) int arg0) {
		@Pc(5) ya local5 = new ya(this, arg0);
		this.aClass238_42.method5837(local5);
		return local5;
	}

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
	public native void K(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
	public native void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
	private native void N(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lclient!p;)V")
	private native void t(@OriginalArg(0) p arg0);

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "()V")
	@Override
	public void method7937() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5964().method4(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7963(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6383(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lclient!vi;")
	@Override
	public Interface25 method7905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new xa(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
	private native void CA(@OriginalArg(0) short arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) boolean arg16, @OriginalArg(17) byte arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) boolean arg19, @OriginalArg(20) int arg20);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7974(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass222_29.method5468((long) arg0.hashCode());
		if (local8 == null) {
			try {
				@Pc(13) Class local13 = Class.forName("java.awt.Canvas");
				@Pc(23) Method local23 = local13.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local23.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(35) Exception local35) {
			}
			local8 = new p(this, arg0, arg1, arg2);
			this.aClass222_29.method5476(local8, (long) arg0.hashCode());
		} else if (local8.anInt7630 != arg1 || local8.anInt7631 != arg2) {
			local8.method6385(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
	@Override
	public boolean method7943() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
	public native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)V")
	@Override
	public void method7938(@OriginalArg(0) int arg0) {
		this.anInt7046 = arg0;
		this.anAArray1 = new a[this.anInt7046];
		for (@Pc(9) int local9 = 0; local9 < this.anInt7046; local9++) {
			this.anAArray1[local9] = new a(this, this.anInt7044, this.anInt7045);
		}
	}

	@OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
	public native void la();

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "()Lclient!kd;")
	@Override
	public Class6 method7951() {
		return this.aClass6_28;
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "()Z")
	@Override
	public boolean method7914() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
	private void method5959() {
		System.gc();
		System.runFinalization();
		Static46.method929();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
	@Override
	public void method7887(@OriginalArg(0) int[] arg0) {
		@Pc(4) Dimension local4 = this.aP1.aCanvas12.getSize();
		arg0[0] = local4.width;
		arg0[1] = local4.height;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method7929(@OriginalArg(0) Class2_Sub11 arg0) {
		this.aYa2 = (ya) arg0;
		this.va(arg0);
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
	private boolean method5960(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class199 local9 = super.anInterface6_11.method6357(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.AA(arg0, local9.aShort83, local9.anInt5691, local9.aByte86, local9.aByte82, local9.anInt5688, local9.aBoolean428, local9.aByte84, local9.aByte83, local9.aByte88, local9.aByte87, local9.aBoolean427, local9.aBoolean429, local9.aBoolean430, local9.aBoolean426, local9.aBoolean425, local9.aByte85, local9.aBoolean424, local9.aBoolean431, local9.anInt5687);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
	public native int XA();

	@OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lclient!za;)V")
	private native void va(@OriginalArg(0) Class2_Sub11 arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lclient!kr;")
	@Override
	public Class20 method7927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new j(this, arg0, arg1, arg2, arg3, !arg4);
	}

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
	public native void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
	@Override
	public void method7916(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7946(@OriginalArg(0) Canvas arg0) {
		if (this.aP1.aCanvas12 == arg0) {
			this.method7891(null);
		}
		@Pc(16) p local16 = (p) this.aClass222_29.method5468((long) arg0.hashCode());
		if (local16 != null) {
			local16.method8599();
			local16.method6384();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	@Override
	public void method7890(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method3();
	}

	@OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
	public native void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "()Z")
	@Override
	public boolean method7962() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z")
	@Override
	public boolean method7944() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
	@Override
	public void method7922(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method15();
	}

	@OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
	public native int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)I")
	@Override
	public int method7950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIIII)Lclient!sfa;")
	@Override
	public Class22 method7948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
	public native void GA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
	private boolean method5961(@OriginalArg(0) short arg0) {
		@Pc(2) Interface6 local2 = super.anInterface6_11;
		synchronized (super.anInterface6_11) {
			if (!super.anInterface6_11.method6355(arg0)) {
				return false;
			}
			@Pc(22) Class199 local22 = super.anInterface6_11.method6357(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(44) int[] local44;
			if (local22.anInt5691 == 2) {
				local44 = super.anInterface6_11.method6358(128, arg0, 0.7F, 128);
			} else {
				local44 = super.anInterface6_11.method6354(0.7F, 128, true, arg0, 128);
			}
			this.CA(arg0, local44, local22.aShort83, local22.anInt5691, local22.aByte86, local22.aByte82, local22.anInt5688, local22.aBoolean428, local22.aByte84, local22.aByte83, local22.aByte88, local22.aByte87, local22.aBoolean427, local22.aBoolean429, local22.aBoolean430, local22.aBoolean426, local22.aBoolean425, local22.aByte85, local22.aBoolean424, local22.aBoolean431, local22.anInt5687);
			return true;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!oo;Z)V")
	private void method5962(@OriginalArg(0) Class247 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class11_Sub5_Sub1 local15 = (Class11_Sub5_Sub1) arg0.aClass34_1.method813(); local15 != null; local15 = (Class11_Sub5_Sub1) arg0.aClass34_1.method819()) {
			Static393.anIntArray478[local1++] = local15.anInt4043;
			Static393.anIntArray478[local1++] = local15.anInt4041;
			Static393.anIntArray478[local1++] = local15.anInt4044;
			Static393.anIntArray479[local3++] = local15.anInt4045;
			Static393.aShortArray92[local7++] = (short) local15.anInt4046;
			Static393.anIntArray477[local5++] = local15.anInt4047;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method7889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
	@Override
	public void method7911(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!oo;)V")
	@Override
	public void method7939(@OriginalArg(0) Class247 arg0) {
		if (arg0.aClass34_1.method817() != 0) {
			this.method5962(arg0);
			this.method5964().method9(this, Static393.anIntArray478, Static393.anIntArray479, Static393.anIntArray477, Static393.aShortArray92, arg0.aClass34_1.method817());
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7924(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass222_29.method5468((long) arg0.hashCode());
		local8.method6385(arg0, arg1, arg2);
		if (arg0 != null && arg0 == this.aP1.aCanvas12) {
			this.method7891(arg0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lclient!kr;")
	@Override
	public Class20 method7931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new j(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lclient!bh;")
	@Override
	public Class2_Sub4 method7928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub4_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
	public native void C(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
	public native void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
	public native int i();

	@OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
	private Object method5963() {
		return new ba(this);
	}

	@OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
	protected native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
	@Override
	public void method7918(@OriginalArg(0) int arg0) {
		Static46.method929();
		this.d(arg0);
		for (@Pc(10) ya local10 = (ya) this.aClass238_42.method5833(); local10 != null; local10 = (ya) this.aClass238_42.method5838()) {
			local10.r();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ww;IIII)Lclient!ka;")
	@Override
	public Class25 method7975(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new i(this, this.aYa2, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILclient!aa;II)V")
	public native void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	private native void d(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
	public native void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()V")
	@Override
	public void method7895() {
		this.method7891(this.aP1.aCanvas12);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!oo;I)V")
	@Override
	public void method7972(@OriginalArg(0) Class247 arg0, @OriginalArg(1) int arg1) {
		this.method5962(arg0);
		this.method5964().method9(this, Static393.anIntArray478, Static393.anIntArray479, Static393.anIntArray477, Static393.aShortArray92, arg0.aClass34_1.method817());
	}

	@OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
	private native void FA();

	@OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
	public native void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	@Override
	public void method7902(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "()V")
	@Override
	protected void method7970() {
		if (this.aBoolean524) {
			return;
		}
		this.anAArray1 = null;
		this.aP1 = null;
		this.aYa2 = null;
		this.aClass6_29 = null;
		this.aClass222_29.method5469();
		for (@Pc(25) ya local25 = (ya) this.aClass238_42.method5833(); local25 != null; local25 = (ya) this.aClass238_42.method5838()) {
			local25.ga();
		}
		this.aClass238_42.method5841();
		this.FA();
		if (this.aBoolean525) {
			Static410.method6301(false, true);
			this.aBoolean525 = false;
		}
		this.method5959();
		Static46.method931();
		this.aBoolean524 = true;
	}

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
	@Override
	public boolean method7958() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method7935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.Z(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)V")
	@Override
	public void method7907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6386(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7945(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lclient!kr;")
	@Override
	public Class20 method7956(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new j(this, arg0, 0, arg1, arg2, arg3, false);
	}

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "()I")
	@Override
	public int method7953() {
		return 4;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method7906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.wa(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!sfa;)V")
	@Override
	public void method7934(@OriginalArg(0) Class22 arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
	public native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class112 method7957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new t(this, this.aYa2, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void method7954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method7976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
	public native void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method7894() {
	}

	@OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
	public native void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
	public native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
	@Override
	public boolean method7967() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method7925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new na(this, this.aYa2, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "()Z")
	@Override
	public boolean method7936() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
	public native int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
	public native void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "()Lclient!sia;")
	@Override
	public Class306 method7942() {
		return new Class306(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "()V")
	@Override
	public void method7917() {
	}

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
	public native int I();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!kd;)V")
	@Override
	public void method7896(@OriginalArg(0) Class6 arg0) {
		this.aClass6_28 = arg0;
		this.ma(((ja) arg0).nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "()V")
	@Override
	public void method7940() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!c;Lclient!vi;)Lclient!uaa;")
	@Override
	public Interface24 method7900(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Interface25 arg1) {
		return new wa(this, (j) arg0, (xa) arg1);
	}

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z")
	@Override
	public boolean method7915() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "()Lclient!a;")
	public a method5964() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7046; local1++) {
			if (this.anAArray1[local1].aRunnable1 == Thread.currentThread()) {
				return this.anAArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method7959();
		if (this.nativeid != 0L) {
			Static46.method930(this);
		}
	}

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "(I)V")
	@Override
	public void method7947() {
		this.anInt7044 = this.anInt7045 = 10000;
		if (this.anInt7046 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method7938(this.anInt7046);
		this.method7890(0);
	}

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!fw;Z)Lclient!kr;")
	@Override
	public Class20 method7969(@OriginalArg(0) Class120 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) j local17 = new j(this, arg0.anIntArray261, arg0.aByteArray36, arg0.aByteArray35, 0, arg0.anInt3710, arg0.anInt3710, arg0.anInt3707);
		local17.method4592(arg0.anInt3708, arg0.anInt3705, arg0.anInt3706, arg0.anInt3709);
		return local17;
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z")
	@Override
	public boolean method7904() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "()V")
	@Override
	public void method7919() {
	}

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
	public native int E();

	@OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
	public native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILclient!aa;II)V")
	private native void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Lclient!d;II)V")
	private native void MA(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
	private native void AA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) byte arg16, @OriginalArg(17) boolean arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) int arg19);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!sfa;Lclient!sfa;FLclient!sfa;)Lclient!sfa;")
	@Override
	public Class22 method7923(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class22 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "()Z")
	@Override
	public boolean method7955() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
	private native void ma(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z")
	@Override
	public boolean method7930() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!uaa;)V")
	@Override
	public void method7949(@OriginalArg(0) Interface24 arg0) {
		@Pc(2) wa local2 = (wa) arg0;
		this.n(local2.aJ1.nativeid, local2.aXa1.nativeid);
	}
}
