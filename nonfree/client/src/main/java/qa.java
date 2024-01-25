import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class qa extends Class39 implements Interface2 {

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "Lclient!na;")
	private na aNa2;

	@OriginalMember(owner = "client!qa", name = "F", descriptor = "Lclient!za;")
	private za aZa1;

	@OriginalMember(owner = "client!qa", name = "J", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!qa", name = "L", descriptor = "I")
	private int anInt5467;

	@OriginalMember(owner = "client!qa", name = "M", descriptor = "[Lclient!n;")
	private n[] aNArray1;

	@OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "Lclient!oe;")
	private final Class181 aClass181_53 = new Class181();

	@OriginalMember(owner = "client!qa", name = "G", descriptor = "I")
	private final int anInt5465 = 4096;

	@OriginalMember(owner = "client!qa", name = "I", descriptor = "I")
	private final int anInt5466 = 4096;

	@OriginalMember(owner = "client!qa", name = "K", descriptor = "Lclient!gu;")
	private final Class96 aClass96_34 = new Class96(4);

	@OriginalMember(owner = "client!qa", name = "N", descriptor = "Z")
	private boolean aBoolean391 = false;

	@OriginalMember(owner = "client!qa", name = "H", descriptor = "Lclient!c;")
	private Class33 aClass33_5;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!ga;Lclient!od;)V")
	public qa(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) Class180 arg3) {
		super(arg0, arg2);
		try {
			if (!Static318.aBoolean390) {
				if (arg3 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("sw3d");
					Static318.aBoolean390 = Boolean.TRUE;
				} else {
					arg3.method4089(this.getClass());
					Static318.aBoolean390 = Boolean.TRUE;
				}
			}
			if (!Static318.aBoolean390) {
				throw new RuntimeException("");
			}
			this.K(super.anInterface4_12, 0, 0);
			Static214.method4408(false, true);
			this.aBoolean391 = true;
			this.aClass33_5 = new i();
			this.ea(new i());
			this.method4543(1);
			this.method4531(0);
			if (arg1 != null) {
				this.method4519(arg1);
				this.method4496(arg1);
			}
		} catch (@Pc(92) Throwable local92) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4506() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qa", name = "W", descriptor = "()F")
	public native float W();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!t;Lclient!kp;Lclient!c;[Lclient!ju;I)V")
	@Override
	public void method4502(@OriginalArg(0) Class105[] arg0, @OriginalArg(1) Class140 arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(3) Class4_Sub5[] arg3, @OriginalArg(4) int arg4) {
		this.method4573(arg1, true);
		if (arg3 == null) {
			this.method4571().Y(this, arg0, arg2, null, arg4, Static318.anIntArray502, Static318.anIntArray505, Static318.anIntArray506, Static318.aShortArray88, Static318.aByteArray73, arg1.aClass232_1.method5226(), Static318.anIntArray501);
		} else {
			@Pc(28) Class4_Sub5 local28 = arg3[0];
			Static318.anIntArray503[5] = 0;
			this.method4571().Y(this, arg0, arg2, Static318.anIntArray503, arg4, Static318.anIntArray502, Static318.anIntArray505, Static318.anIntArray506, Static318.aShortArray88, Static318.aByteArray73, arg1.aClass232_1.method5226(), Static318.anIntArray501);
			local28.anInt3546 = Static318.anIntArray503[0];
			local28.anInt3548 = Static318.anIntArray503[1];
			local28.anInt3545 = Static318.anIntArray503[2];
			local28.anInt3547 = Static318.anIntArray503[3];
			local28.anInt3544 = Static318.anIntArray503[4];
			local28.aBoolean227 = Static318.anIntArray503[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) da local98 = (da) arg0[local88];
				local98.method1372(local86, arg2);
				if (local98.aClass244Array1 != null) {
					local86 += local98.aClass244Array1.length * 9;
				}
				if (local98.aClass57Array1 != null) {
					local86 += local98.aClass57Array1.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "da", descriptor = "([I)V")
	public native void da(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!qa", name = "FA", descriptor = "()V")
	private native void FA();

	@OriginalMember(owner = "client!qa", name = "UA", descriptor = "(III)V")
	public native void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "T", descriptor = "(IFFFFF)V")
	public native void T(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()Z")
	@Override
	public boolean method4505() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()I")
	public native int a();

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "(IIIIIILclient!ma;II)V")
	private native void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class133 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!qa", name = "sa", descriptor = "(S)Z")
	private boolean method4569(@OriginalArg(0) short arg0) {
		@Pc(2) Interface4 local2 = super.anInterface4_12;
		synchronized (super.anInterface4_12) {
			if (!super.anInterface4_12.method2454(arg0)) {
				return false;
			}
			@Pc(22) Class183 local22 = super.anInterface4_12.method2450(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(46) int[] local46;
			if (local22.aBoolean332 && local22.aBoolean337) {
				local46 = super.anInterface4_12.method2451(128, 128, arg0, 0.7F, true);
			} else {
				local46 = super.anInterface4_12.method2452(arg0, 128, 128, 0.7F);
			}
			this.q(arg0, local22.aByte80, local22.aByte79, local22.aBoolean337, local22.aBoolean332, local22.aBoolean330, local22.aByte78, local22.aByte81, local22.aByte76, local22.aShort75, local22.anInt4981, local22.aBoolean335, local22.aBoolean333, local46);
			return true;
		}
	}

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "()Z")
	@Override
	public boolean method4525() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "aa", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	@Override
	public void method4493(@OriginalArg(0) int arg0) {
		this.aNArray1[arg0].method3840();
	}

	@OriginalMember(owner = "client!qa", name = "I", descriptor = "(Lclient!u;)V")
	private native void I(@OriginalArg(0) Class1_Sub41 arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lclient!qp;)V")
	@Override
	public void method4560(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub31[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static318.anIntArray504[local1++] = arg1[local3].method5906();
			Static318.anIntArray504[local1++] = arg1[local3].method5902();
			Static318.anIntArray504[local1++] = arg1[local3].method5904();
			Static318.anIntArray504[local1++] = arg1[local3].method5910();
			Static318.aFloatArray25[local3] = arg1[local3].method5905();
			Static318.anIntArray504[local1++] = arg1[local3].method5907();
		}
		this.za(arg0, Static318.anIntArray504, Static318.aFloatArray25);
	}

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z")
	@Override
	public boolean method4535() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "H", descriptor = "(IIII)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4514(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas7 == arg0) {
			this.method4496(null);
		}
		@Pc(15) za local15 = (za) this.aClass96_34.method2335((long) arg0.hashCode());
		if (local15 != null) {
			local15.method6020();
			local15.method6022();
		}
	}

	@OriginalMember(owner = "client!qa", name = "AA", descriptor = "(IIII)V")
	public native void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!pc;Lclient!pc;FLclient!pc;)Lclient!pc;")
	@Override
	public Class16 method4545(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class16 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lclient!qp;")
	@Override
	public Class1_Sub31 method4534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub31_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
	@Override
	public void method4521(@OriginalArg(0) int arg0) {
		Static382.method5155();
		this.ma(arg0);
		for (@Pc(10) na local10 = (na) this.aClass181_53.method4112(); local10 != null; local10 = (na) this.aClass181_53.method4104()) {
			local10.a();
		}
	}

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method4555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.RA(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "()V")
	@Override
	public void method4558() {
		@Pc(1) int local1 = 0;
		while (local1 < 9) {
			try {
				synchronized (this.aCanvas7.getTreeLock()) {
					this.aZa1.ka();
					return;
				}
			} catch (@Pc(18) Exception local18) {
				Static224.method3441(200L);
				local1++;
			}
		}
		synchronized (this.aCanvas7.getTreeLock()) {
			this.aZa1.ka();
		}
	}

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "()V")
	public native void l();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)I")
	@Override
	public int method4530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!qa", name = "K", descriptor = "(Lclient!ga;II)V")
	private native void K(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILclient!ma;II)V")
	@Override
	public void method4494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class133 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.A(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
	@Override
	public void method4531(@OriginalArg(0) int arg0) {
		this.aNArray1[arg0].method3841();
	}

	@OriginalMember(owner = "client!qa", name = "NA", descriptor = "(IIIII)V")
	protected native void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "xa", descriptor = "()F")
	public native float xa();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4571().va(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "(I)V")
	public native void p(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "()Z")
	@Override
	public boolean method4556() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "(F)V")
	public native void B(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!qa", name = "fa", descriptor = "(IIII)V")
	public native void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "ea", descriptor = "(Lclient!c;)V")
	public native void ea(@OriginalArg(0) Class33 arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lclient!ta;")
	@Override
	public Class149 method4561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new ha(this, this.aNa2, arg0, arg1, arg2, arg3, 128, arg4, arg5);
	}

	@OriginalMember(owner = "client!qa", name = "YA", descriptor = "()I")
	public native int YA();

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "()V")
	@Override
	public void method4533() {
	}

	@OriginalMember(owner = "client!qa", name = "O", descriptor = "(IIIIII)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(FF)V")
	public native void g(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!qa", name = "ca", descriptor = "(ILclient!ma;II)V")
	public native void ca(@OriginalArg(0) int arg0, @OriginalArg(1) Class133 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "()Z")
	@Override
	public boolean method4547() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!t;Lclient!kp;Lclient!c;Lclient!ju;I)V")
	@Override
	public void method4526(@OriginalArg(0) Class105 arg0, @OriginalArg(1) Class140 arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(3) Class4_Sub5 arg3) {
		this.method4573(arg1, true);
		if (arg3 == null) {
			this.method4571().ba(this, arg0, arg2, null, 0, Static318.anIntArray502, Static318.anIntArray505, Static318.anIntArray506, Static318.aShortArray88, Static318.aByteArray73, arg1.aClass232_1.method5226(), Static318.anIntArray501);
		} else {
			Static318.anIntArray503[5] = 0;
			this.method4571().ba(this, arg0, arg2, Static318.anIntArray503, 0, Static318.anIntArray502, Static318.anIntArray505, Static318.anIntArray506, Static318.aShortArray88, Static318.aByteArray73, arg1.aClass232_1.method5226(), Static318.anIntArray501);
			arg3.anInt3546 = Static318.anIntArray503[0];
			arg3.anInt3548 = Static318.anIntArray503[1];
			arg3.anInt3545 = Static318.anIntArray503[2];
			arg3.anInt3547 = Static318.anIntArray503[3];
			arg3.anInt3544 = Static318.anIntArray503[4];
			arg3.aBoolean227 = Static318.anIntArray503[5] != 0;
		}
		@Pc(83) da local83 = (da) arg0;
		local83.method1372(0, arg2);
	}

	@OriginalMember(owner = "client!qa", name = "SA", descriptor = "()Ljava/lang/Object;")
	private Object method4570() {
		return new p();
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "()Z")
	@Override
	public boolean method4515() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Lclient!l;")
	@Override
	public Class143 method4495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new ra(this, this.aNa2, arg0, arg1, arg2, arg3) : new ia(this, this.aNa2, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "()Lclient!c;")
	@Override
	public Class33 method4512() {
		return new i();
	}

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "()I")
	public native int w();

	@OriginalMember(owner = "client!qa", name = "EA", descriptor = "()V")
	public native void EA();

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z")
	@Override
	public boolean method4551() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "()V")
	@Override
	public void method4517() {
	}

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "()V")
	@Override
	protected void method4553() {
		this.aNArray1 = null;
		this.aZa1 = null;
		this.aCanvas7 = null;
		this.aNa2 = null;
		this.aClass33_5 = null;
		this.aClass96_34.method2338();
		for (@Pc(24) na local24 = (na) this.aClass181_53.method4112(); local24 != null; local24 = (na) this.aClass181_53.method4104()) {
			local24.H();
		}
		this.aClass181_53.method4101();
		this.method4574();
		this.FA();
		if (this.aBoolean391) {
			Static236.method3583(true, false);
			this.aBoolean391 = false;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public void method4503(@OriginalArg(0) Class1_Sub41 arg0) {
		this.aNa2 = (na) arg0;
		this.I(arg0);
	}

	@OriginalMember(owner = "client!qa", name = "D", descriptor = "()Lclient!n;")
	public n method4571() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5467; local1++) {
			if (this.aNArray1[local1].aRunnable1 == Thread.currentThread()) {
				return this.aNArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "R", descriptor = "(S)Z")
	private boolean method4572(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class183 local9 = super.anInterface4_12.method2450(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.aa(arg0, local9.aByte80, local9.aByte79, local9.aBoolean337, local9.aBoolean332, local9.aBoolean330, local9.aByte78, local9.aByte81, local9.aByte76, local9.aShort75, local9.anInt4981, local9.aBoolean335, local9.aBoolean333);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "()Z")
	@Override
	public boolean method4538() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "ZA", descriptor = "()I")
	public native int ZA();

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
	@Override
	public void method4543(@OriginalArg(0) int arg0) {
		this.anInt5467 = arg0;
		this.aNArray1 = new n[this.anInt5467];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5467; local9++) {
			this.aNArray1[local9] = new n(this, this.anInt5466, this.anInt5465);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!kp;Z)V")
	private void method4573(@OriginalArg(0) Class140 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class4_Sub2_Sub1 local15 = (Class4_Sub2_Sub1) arg0.aClass232_1.method5223(); local15 != null; local15 = (Class4_Sub2_Sub1) arg0.aClass232_1.method5222()) {
			Static318.anIntArray502[local1++] = local15.anInt6945;
			Static318.anIntArray502[local1++] = local15.anInt6947;
			Static318.anIntArray502[local1++] = local15.anInt6951;
			Static318.anIntArray505[local3++] = local15.anInt6952;
			Static318.aShortArray88[local7++] = (short) local15.anInt6950;
			Static318.anIntArray506[local5++] = local15.anInt6946;
			if (arg1) {
				Static318.aByteArray73[local9++] = local15.aByte99;
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!kp;)V")
	@Override
	public void method4566(@OriginalArg(0) Class140 arg0) {
		this.method4573(arg0, false);
		this.method4571().G(this, Static318.anIntArray502, Static318.anIntArray505, Static318.anIntArray506, Static318.aShortArray88, arg0.aClass232_1.method5226());
	}

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "()Z")
	@Override
	public boolean method4559() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "DA", descriptor = "(IIIIII[BII)V")
	public native void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!qa", name = "IA", descriptor = "()I")
	public native int IA();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!pc;)V")
	@Override
	public void method4567(@OriginalArg(0) Class16 arg0) {
	}

	@OriginalMember(owner = "client!qa", name = "ha", descriptor = "()V")
	private void method4574() {
		System.gc();
		System.runFinalization();
		Static382.method5155();
	}

	@OriginalMember(owner = "client!qa", name = "JA", descriptor = "(IIIIII)Z")
	public native boolean JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "OA", descriptor = "(IIII)V")
	public native void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lclient!ma;")
	@Override
	public Class133 method4536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new sa(this, this.aNa2, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "()V")
	@Override
	public void method4524() {
	}

	@OriginalMember(owner = "client!qa", name = "ia", descriptor = "(II)V")
	public native void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "()Z")
	@Override
	public boolean method4550() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!lm;[Lclient!di;Z)Lclient!la;")
	@Override
	public Class71 method4564(@OriginalArg(0) Class151 arg0, @OriginalArg(1) Class51[] arg1) {
		return new s(this, this.aNa2, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "()Z")
	@Override
	public boolean method4537() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!t;Lclient!c;[Lclient!ju;I)V")
	@Override
	public void method4497(@OriginalArg(0) Class105[] arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) Class4_Sub5[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method4571().TA(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class4_Sub5 local15 = arg2[0];
		Static318.anIntArray503[5] = 0;
		this.method4571().TA(this, arg0, arg1, Static318.anIntArray503, -1, arg3);
		local15.anInt3546 = Static318.anIntArray503[0];
		local15.anInt3548 = Static318.anIntArray503[1];
		local15.anInt3545 = Static318.anIntArray503[2];
		local15.anInt3547 = Static318.anIntArray503[3];
		local15.anInt3544 = Static318.anIntArray503[4];
		local15.aBoolean227 = Static318.anIntArray503[5] != 0;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
	@Override
	public int method4528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "()Z")
	@Override
	public boolean method4568() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "()Z")
	@Override
	public boolean method4552() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)Lclient!pc;")
	@Override
	public Class16 method4518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "za", descriptor = "(I[I[F)V")
	private native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
	@Override
	public void method4510(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qa", name = "PA", descriptor = "(Lclient!za;)V")
	private native void PA(@OriginalArg(0) za arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Lclient!l;")
	@Override
	public Class143 method4554(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new ra(this, this.aNa2, arg0, 0, arg1, arg2, arg3) : new ia(this, this.aNa2, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new ra(this, this.aNa2, arg0, 0, arg1, arg2, arg3) : new ia(this, this.aNa2, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qa", name = "GA", descriptor = "(IIII)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4492(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(4) int local4;
		@Pc(9) Rectangle local9;
		while (local1 < 9) {
			try {
				for (local4 = 0; local4 < arg1; local4++) {
					local9 = arg0[local4];
					if (local9.width > 0 && local9.height > 0) {
						synchronized (this.aCanvas7.getTreeLock()) {
							this.aZa1.d(local9.x, local9.y, local9.width, local9.height);
						}
					}
				}
				return;
			} catch (@Pc(44) Exception local44) {
				Static224.method3441(200L);
				local1++;
			}
		}
		for (local4 = 0; local4 < arg1; local4++) {
			local9 = arg0[local4];
			if (local9.width > 0 && local9.height > 0) {
				synchronized (this.aCanvas7.getTreeLock()) {
					this.aZa1.d(local9.x, local9.y, local9.width, local9.height);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4496(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas7 = null;
			this.aZa1 = null;
			this.PA(null);
		} else {
			@Pc(10) za local10 = (za) this.aClass96_34.method2335((long) arg0.hashCode());
			this.aCanvas7 = arg0;
			this.aZa1 = local10;
			this.PA(local10);
		}
	}

	@OriginalMember(owner = "client!qa", name = "F", descriptor = "(IIII)[I")
	public native int[] F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4519(@OriginalArg(0) Canvas arg0) {
		@Pc(8) za local8 = (za) this.aClass96_34.method2335((long) arg0.hashCode());
		if (local8 != null) {
			return;
		}
		try {
			@Pc(13) Class local13 = Class.forName("java.awt.Canvas");
			@Pc(23) Method local23 = local13.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local23.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(35) Exception local35) {
		}
		local8 = new za(this, arg0);
		this.aClass96_34.method2341((long) arg0.hashCode(), local8);
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
	@Override
	public void method4539(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qa", name = "RA", descriptor = "(IIIIII)V")
	private native void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "X", descriptor = "(III[I)V")
	public native void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!di;Z)Lclient!l;")
	@Override
	public Class143 method4549(@OriginalArg(0) Class51 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray123;
		@Pc(5) byte[] local5 = arg0.aByteArray42;
		@Pc(8) int local8 = arg0.anInt1635;
		@Pc(11) int local11 = arg0.anInt1638;
		@Pc(32) Class143 local32;
		if (arg0.aByteArray41 == null) {
			local32 = new k(this, this.aNa2, local2, local5, 0, arg0.anInt1635, arg0.anInt1635, arg0.anInt1638);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray41;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray123[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new ra(this, this.aNa2, local40, 0, arg0.anInt1635, arg0.anInt1635, arg0.anInt1638);
				} else {
					local32 = new ia(this, this.aNa2, local40, 0, arg0.anInt1635, arg0.anInt1635, arg0.anInt1638);
				}
			} else {
				for (@Pc(47) int local47 = 0; local47 < local11; local47++) {
					local52 = local47 * local8;
					for (local54 = 0; local54 < local8; local54++) {
						local40[local52 + local54] = local2[local5[local52 + local54] & 0xFF] | local43[local52 + local54] << 24;
					}
				}
				local32 = new ra(this, this.aNa2, local40, 0, local8, local8, local11);
			}
		}
		local32.MA(arg0.anInt1636, arg0.anInt1639, arg0.anInt1637, arg0.anInt1640);
		return local32;
	}

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)Lclient!u;")
	@Override
	public Class1_Sub41 method4544(@OriginalArg(0) int arg0) {
		@Pc(5) na local5 = new na(this, arg0);
		this.aClass181_53.method4102(local5);
		return local5;
	}

	@OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.EA();
	}

	@OriginalMember(owner = "client!qa", name = "TA", descriptor = "(IIIII)V")
	public native void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void q(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "()V")
	@Override
	public void method4548() {
	}

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "()I")
	@Override
	public int method4520() {
		return 4;
	}

	@OriginalMember(owner = "client!qa", name = "MA", descriptor = "(I)V")
	public native void MA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "()V")
	public native void e();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
	@Override
	public void method4504(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4546(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!tp;IIII)Lclient!t;")
	@Override
	public Class105 method4540(@OriginalArg(0) Class236 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new da(this, this.aNa2, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "()Lclient!c;")
	@Override
	public Class33 method4516() {
		return this.aClass33_5;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method4513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.b(arg0, arg1, arg2, arg4, arg5);
		this.b(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.TA(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.TA(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4498(@OriginalArg(0) Canvas arg0) {
		@Pc(8) za local8 = (za) this.aClass96_34.method2335((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.H(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aCanvas7) {
			this.method4496(arg0);
		}
	}

	@OriginalMember(owner = "client!qa", name = "ma", descriptor = "(I)V")
	private native void ma(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	@Override
	public void method4511(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "()V")
	@Override
	public void method4565() {
	}

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z")
	@Override
	public boolean method4542() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "()Z")
	@Override
	public boolean method4557() {
		return false;
	}
}
