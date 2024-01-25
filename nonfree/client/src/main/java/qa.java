import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class qa extends Class135 implements Interface1 {

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "Lclient!na;")
	private na aNa2;

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "Lclient!za;")
	private za aZa1;

	@OriginalMember(owner = "client!qa", name = "J", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!qa", name = "N", descriptor = "I")
	private int anInt5187;

	@OriginalMember(owner = "client!qa", name = "O", descriptor = "[Lclient!n;")
	private n[] aNArray1;

	@OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "Lclient!ub;")
	private final Class244 aClass244_30 = new Class244();

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "I")
	private final int anInt5185 = 4096;

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "I")
	private final int anInt5186 = 4096;

	@OriginalMember(owner = "client!qa", name = "E", descriptor = "Lclient!ek;")
	private final Class67 aClass67_28 = new Class67(4);

	@OriginalMember(owner = "client!qa", name = "P", descriptor = "Z")
	private boolean aBoolean373 = false;

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "Lclient!c;")
	private Class35 aClass35_3;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!ga;Lclient!pc;)V")
	public qa(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface5 arg2, @OriginalArg(3) Class196 arg3) {
		super(arg0, arg2);
		try {
			if (!Static319.aBoolean372) {
				if (arg3 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("sw3d");
					Static319.aBoolean372 = Boolean.TRUE;
				} else {
					arg3.method3922(this.getClass());
					Static319.aBoolean372 = Boolean.TRUE;
				}
			}
			if (!Static319.aBoolean372) {
				throw new RuntimeException("");
			}
			this.K(super.anInterface5_7, 0, 0);
			Static155.method2193(false, true);
			this.aBoolean373 = true;
			this.aClass35_3 = new i();
			this.ea(new i());
			this.method5373(1);
			this.method5335(0);
			if (arg1 != null) {
				this.method5329(arg1);
				this.method5377(arg1);
			}
		} catch (@Pc(92) Throwable local92) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "()V")
	@Override
	public void method5385() {
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	@Override
	public void method5335(@OriginalArg(0) int arg0) {
		this.aNArray1[arg0].method3400();
	}

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "()V")
	@Override
	public void method5361() {
	}

	@OriginalMember(owner = "client!qa", name = "NA", descriptor = "(IIIII)V")
	protected native void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5334(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas4 == arg0) {
			this.method5377(null);
		}
		@Pc(15) za local15 = (za) this.aClass67_28.method1429((long) arg0.hashCode());
		if (local15 != null) {
			local15.method6059();
			local15.method6063();
		}
	}

	@OriginalMember(owner = "client!qa", name = "sa", descriptor = "(S)Z")
	private boolean method4219(@OriginalArg(0) short arg0) {
		@Pc(2) Interface5 local2 = super.anInterface5_7;
		synchronized (super.anInterface5_7) {
			if (!super.anInterface5_7.method4075(arg0)) {
				return false;
			}
			@Pc(22) Class112 local22 = super.anInterface5_7.method4079(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(46) int[] local46;
			if (local22.aBoolean189 && local22.aBoolean194) {
				local46 = super.anInterface5_7.method4078(true, 128, 0.7F, 128, arg0);
			} else {
				local46 = super.anInterface5_7.method4077(128, 0.7F, 128, arg0);
			}
			this.q(arg0, local22.aByte51, local22.aByte53, local22.aBoolean194, local22.aBoolean189, local22.aBoolean192, local22.aByte56, local22.aByte54, local22.aByte57, local22.aShort41, local22.anInt2731, local22.aBoolean195, local22.aBoolean191, local46);
			return true;
		}
	}

	@OriginalMember(owner = "client!qa", name = "za", descriptor = "(I[I[F)V")
	private native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILclient!ma;II)V")
	@Override
	public void method5370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class71 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.A(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!qa", name = "SA", descriptor = "()Ljava/lang/Object;")
	private Object method4220() {
		return new p();
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "()V")
	@Override
	public void method5341() {
		@Pc(1) int local1 = 0;
		while (local1 < 9) {
			try {
				synchronized (this.aCanvas4.getTreeLock()) {
					this.aZa1.ka();
					return;
				}
			} catch (@Pc(18) Exception local18) {
				Static435.method5777(200L);
				local1++;
			}
		}
		synchronized (this.aCanvas4.getTreeLock()) {
			this.aZa1.ka();
		}
	}

	@OriginalMember(owner = "client!qa", name = "PA", descriptor = "(Lclient!za;)V")
	private native void PA(@OriginalArg(0) za arg0);

	@OriginalMember(owner = "client!qa", name = "ha", descriptor = "()V")
	private void method4221() {
		System.gc();
		System.runFinalization();
		Static422.method5677();
	}

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "()Z")
	@Override
	public boolean method5392() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!t;Lclient!fm;Lclient!c;[Lclient!vs;I)V")
	@Override
	public void method5358(@OriginalArg(0) Class116[] arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) Class20_Sub8[] arg3, @OriginalArg(4) int arg4) {
		this.method4222(arg1, true);
		if (arg3 == null) {
			this.method4224().Y(this, arg0, arg2, null, arg4, Static319.anIntArray423, Static319.anIntArray424, Static319.anIntArray421, Static319.aShortArray88, Static319.aByteArray68, arg1.aClass203_1.method4065(), Static319.anIntArray419);
		} else {
			@Pc(28) Class20_Sub8 local28 = arg3[0];
			Static319.anIntArray420[5] = 0;
			this.method4224().Y(this, arg0, arg2, Static319.anIntArray420, arg4, Static319.anIntArray423, Static319.anIntArray424, Static319.anIntArray421, Static319.aShortArray88, Static319.aByteArray68, arg1.aClass203_1.method4065(), Static319.anIntArray419);
			local28.anInt7195 = Static319.anIntArray420[0];
			local28.anInt7191 = Static319.anIntArray420[1];
			local28.anInt7194 = Static319.anIntArray420[2];
			local28.anInt7192 = Static319.anIntArray420[3];
			local28.anInt7193 = Static319.anIntArray420[4];
			local28.aBoolean508 = Static319.anIntArray420[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) da local98 = (da) arg0[local88];
				local98.method923(local86, arg2);
				if (local98.aClass76Array1 != null) {
					local86 += local98.aClass76Array1.length * 9;
				}
				if (local98.aClass88Array1 != null) {
					local86 += local98.aClass88Array1.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "()Z")
	@Override
	public boolean method5397() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Lclient!l;")
	@Override
	public Class95 method5351(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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

	@OriginalMember(owner = "client!qa", name = "MA", descriptor = "(I)V")
	public native void MA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "IA", descriptor = "()I")
	public native int IA();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!kc;Lclient!kc;FLclient!kc;)Lclient!kc;")
	@Override
	public Class3 method5331(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class3 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "F", descriptor = "(IIII)[I")
	public native int[] F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "()Z")
	@Override
	public boolean method5355() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "xa", descriptor = "()F")
	public native float xa();

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "()Z")
	@Override
	public boolean method5403() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public void method5333(@OriginalArg(0) Class4_Sub39 arg0) {
		this.aNa2 = (na) arg0;
		this.I(arg0);
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
	@Override
	public int method5399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
	@Override
	public int method5356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!qa", name = "T", descriptor = "(IFFFFF)V")
	public native void T(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "I", descriptor = "(Lclient!u;)V")
	private native void I(@OriginalArg(0) Class4_Sub39 arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()V")
	@Override
	public void method5330() {
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()I")
	public native int a();

	@OriginalMember(owner = "client!qa", name = "RA", descriptor = "(IIIIII)V")
	private native void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "()Z")
	@Override
	public boolean method5337() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "OA", descriptor = "(IIII)V")
	public native void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!qv;Z)Lclient!l;")
	@Override
	public Class95 method5379(@OriginalArg(0) Class216 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray441;
		@Pc(5) byte[] local5 = arg0.aByteArray70;
		@Pc(8) int local8 = arg0.anInt5508;
		@Pc(11) int local11 = arg0.anInt5512;
		@Pc(32) Class95 local32;
		if (arg0.aByteArray69 == null) {
			local32 = new k(this, this.aNa2, local2, local5, 0, arg0.anInt5508, arg0.anInt5508, arg0.anInt5512);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray69;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray441[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new ra(this, this.aNa2, local40, 0, arg0.anInt5508, arg0.anInt5508, arg0.anInt5512);
				} else {
					local32 = new ia(this, this.aNa2, local40, 0, arg0.anInt5508, arg0.anInt5508, arg0.anInt5512);
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
		local32.MA(arg0.anInt5510, arg0.anInt5511, arg0.anInt5507, arg0.anInt5509);
		return local32;
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
	@Override
	public void method5380(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qa", name = "ca", descriptor = "(ILclient!ma;II)V")
	public native void ca(@OriginalArg(0) int arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "()V")
	@Override
	protected void method5357() {
		this.aNArray1 = null;
		this.aZa1 = null;
		this.aCanvas4 = null;
		this.aNa2 = null;
		this.aClass35_3 = null;
		this.aClass67_28.method1431();
		for (@Pc(24) na local24 = (na) this.aClass244_30.method5263(); local24 != null; local24 = (na) this.aClass244_30.method5271()) {
			local24.H();
		}
		this.aClass244_30.method5264();
		this.method4221();
		this.FA();
		if (this.aBoolean373) {
			Static246.method3241(false, true);
			this.aBoolean373 = false;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Lclient!l;")
	@Override
	public Class95 method5349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new ra(this, this.aNa2, arg0, arg1, arg2, arg3) : new ia(this, this.aNa2, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z")
	@Override
	public boolean method5387() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "K", descriptor = "(Lclient!ga;II)V")
	private native void K(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "YA", descriptor = "()I")
	public native int YA();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	@Override
	public void method5340(@OriginalArg(0) int arg0) {
		this.aNArray1[arg0].method3399();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!li;[Lclient!qv;Z)Lclient!la;")
	@Override
	public Class123 method5352(@OriginalArg(0) Class158 arg0, @OriginalArg(1) Class216[] arg1) {
		return new s(this, this.aNa2, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "()I")
	public native int w();

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z")
	@Override
	public boolean method5367() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)Lclient!u;")
	@Override
	public Class4_Sub39 method5381(@OriginalArg(0) int arg0) {
		@Pc(5) na local5 = new na(this, arg0);
		this.aClass244_30.method5273(local5);
		return local5;
	}

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "()I")
	@Override
	public int method5362() {
		return 4;
	}

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "(IIIIIILclient!ma;II)V")
	private native void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class71 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "()Z")
	@Override
	public boolean method5386() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "O", descriptor = "(IIIIII)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5365(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(4) int local4;
		@Pc(9) Rectangle local9;
		while (local1 < 9) {
			try {
				for (local4 = 0; local4 < arg1; local4++) {
					local9 = arg0[local4];
					if (local9.width > 0 && local9.height > 0) {
						synchronized (this.aCanvas4.getTreeLock()) {
							this.aZa1.d(local9.x, local9.y, local9.width, local9.height);
						}
					}
				}
				return;
			} catch (@Pc(44) Exception local44) {
				Static435.method5777(200L);
				local1++;
			}
		}
		for (local4 = 0; local4 < arg1; local4++) {
			local9 = arg0[local4];
			if (local9.width > 0 && local9.height > 0) {
				synchronized (this.aCanvas4.getTreeLock()) {
					this.aZa1.d(local9.x, local9.y, local9.width, local9.height);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "()V")
	public native void l();

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "()V")
	@Override
	public void method5353() {
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5377(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas4 = null;
			this.aZa1 = null;
			this.PA(null);
		} else {
			@Pc(10) za local10 = (za) this.aClass67_28.method1429((long) arg0.hashCode());
			this.aCanvas4 = arg0;
			this.aZa1 = local10;
			this.PA(local10);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
	@Override
	public void method5336(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!kc;)V")
	@Override
	public void method5347(@OriginalArg(0) Class3 arg0) {
	}

	@OriginalMember(owner = "client!qa", name = "ia", descriptor = "(II)V")
	public native void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "GA", descriptor = "(IIII)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.RA(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!qa", name = "FA", descriptor = "()V")
	private native void FA();

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "()Z")
	@Override
	public boolean method5390() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "()Z")
	@Override
	public boolean method5346() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
	@Override
	public void method5371(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qa", name = "aa", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!qa", name = "da", descriptor = "([I)V")
	public native void da(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "()Z")
	@Override
	public boolean method5342() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "JA", descriptor = "(IIIIII)Z")
	public native boolean JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "TA", descriptor = "(IIIII)V")
	public native void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!mb;IIII)Lclient!t;")
	@Override
	public Class116 method5391(@OriginalArg(0) Class166 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new da(this, this.aNa2, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "()Z")
	@Override
	public boolean method5375() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!fm;Z)V")
	private void method4222(@OriginalArg(0) Class83 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class20_Sub1_Sub1 local15 = (Class20_Sub1_Sub1) arg0.aClass203_1.method4069(); local15 != null; local15 = (Class20_Sub1_Sub1) arg0.aClass203_1.method4067()) {
			Static319.anIntArray423[local1++] = local15.anInt633;
			Static319.anIntArray423[local1++] = local15.anInt632;
			Static319.anIntArray423[local1++] = local15.anInt629;
			Static319.anIntArray424[local3++] = local15.anInt628;
			Static319.aShortArray88[local7++] = (short) local15.anInt630;
			Static319.anIntArray421[local5++] = local15.anInt631;
			if (arg1) {
				Static319.aByteArray68[local9++] = local15.aByte13;
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
	@Override
	public void method5339(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lclient!ta;")
	@Override
	public Class41 method5378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new ha(this, this.aNa2, arg0, arg1, arg2, arg3, 128, arg4, arg5);
	}

	@OriginalMember(owner = "client!qa", name = "ea", descriptor = "(Lclient!c;)V")
	public native void ea(@OriginalArg(0) Class35 arg0);

	@OriginalMember(owner = "client!qa", name = "X", descriptor = "(III[I)V")
	public native void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!t;Lclient!c;[Lclient!vs;I)V")
	@Override
	public void method5372(@OriginalArg(0) Class116[] arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) Class20_Sub8[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method4224().TA(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class20_Sub8 local15 = arg2[0];
		Static319.anIntArray420[5] = 0;
		this.method4224().TA(this, arg0, arg1, Static319.anIntArray420, -1, arg3);
		local15.anInt7195 = Static319.anIntArray420[0];
		local15.anInt7191 = Static319.anIntArray420[1];
		local15.anInt7194 = Static319.anIntArray420[2];
		local15.anInt7192 = Static319.anIntArray420[3];
		local15.anInt7193 = Static319.anIntArray420[4];
		local15.aBoolean508 = Static319.anIntArray420[5] != 0;
	}

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "()Z")
	@Override
	public boolean method5350() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lclient!ku;)V")
	@Override
	public void method5359(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub7[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static319.anIntArray422[local1++] = arg1[local3].method4451();
			Static319.anIntArray422[local1++] = arg1[local3].method4448();
			Static319.anIntArray422[local1++] = arg1[local3].method4449();
			Static319.anIntArray422[local1++] = arg1[local3].method4446();
			Static319.aFloatArray24[local3] = arg1[local3].method4454();
			Static319.anIntArray422[local1++] = arg1[local3].method4445();
		}
		this.za(arg0, Static319.anIntArray422, Static319.aFloatArray24);
	}

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "()V")
	public native void e();

	@OriginalMember(owner = "client!qa", name = "UA", descriptor = "(III)V")
	public native void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "()Lclient!c;")
	@Override
	public Class35 method5400() {
		return new i();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lclient!ku;")
	@Override
	public Class4_Sub7 method5348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class4_Sub7_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(FF)V")
	public native void g(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void q(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "(F)V")
	public native void B(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)Lclient!kc;")
	@Override
	public Class3 method5345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "()Lclient!c;")
	@Override
	public Class35 method5398() {
		return this.aClass35_3;
	}

	@OriginalMember(owner = "client!qa", name = "H", descriptor = "(IIII)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method5354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.b(arg0, arg1, arg2, arg4, arg5);
		this.b(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.TA(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.TA(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4224().va(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!qa", name = "DA", descriptor = "(IIIIII[BII)V")
	public native void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!qa", name = "ma", descriptor = "(I)V")
	private native void ma(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "()Z")
	@Override
	public boolean method5393() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "W", descriptor = "()F")
	public native float W();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5329(@OriginalArg(0) Canvas arg0) {
		@Pc(8) za local8 = (za) this.aClass67_28.method1429((long) arg0.hashCode());
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
		this.aClass67_28.method1426(local8, (long) arg0.hashCode());
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lclient!ma;")
	@Override
	public Class71 method5343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new sa(this, this.aNa2, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "()Z")
	@Override
	public boolean method5364() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
	@Override
	public void method5389(@OriginalArg(0) int arg0) {
		Static422.method5677();
		this.ma(arg0);
		for (@Pc(10) na local10 = (na) this.aClass244_30.method5263(); local10 != null; local10 = (na) this.aClass244_30.method5271()) {
			local10.a();
		}
	}

	@OriginalMember(owner = "client!qa", name = "fa", descriptor = "(IIII)V")
	public native void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "(I)V")
	public native void p(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "R", descriptor = "(S)Z")
	private boolean method4223(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class112 local9 = super.anInterface5_7.method4079(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.aa(arg0, local9.aByte51, local9.aByte53, local9.aBoolean194, local9.aBoolean189, local9.aBoolean192, local9.aByte56, local9.aByte54, local9.aByte57, local9.aShort41, local9.anInt2731, local9.aBoolean195, local9.aBoolean191);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "()V")
	@Override
	public void method5395() {
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5363(@OriginalArg(0) Canvas arg0) {
		@Pc(8) za local8 = (za) this.aClass67_28.method1429((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.H(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aCanvas4) {
			this.method5377(arg0);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!fm;)V")
	@Override
	public void method5384(@OriginalArg(0) Class83 arg0) {
		this.method4222(arg0, false);
		this.method4224().G(this, Static319.anIntArray423, Static319.anIntArray424, Static319.anIntArray421, Static319.aShortArray88, arg0.aClass203_1.method4065());
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "AA", descriptor = "(IIII)V")
	public native void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "ZA", descriptor = "()I")
	public native int ZA();

	@OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.EA();
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
	@Override
	public void method5373(@OriginalArg(0) int arg0) {
		this.anInt5187 = arg0;
		this.aNArray1 = new n[this.anInt5187];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5187; local9++) {
			this.aNArray1[local9] = new n(this, this.anInt5185, this.anInt5186);
		}
	}

	@OriginalMember(owner = "client!qa", name = "E", descriptor = "()Lclient!n;")
	public n method4224() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5187; local1++) {
			if (this.aNArray1[local1].aRunnable2 == Thread.currentThread()) {
				return this.aNArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "EA", descriptor = "()V")
	public native void EA();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!t;Lclient!fm;Lclient!c;Lclient!vs;I)V")
	@Override
	public void method5396(@OriginalArg(0) Class116 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) Class20_Sub8 arg3) {
		this.method4222(arg1, true);
		if (arg3 == null) {
			this.method4224().ba(this, arg0, arg2, null, 0, Static319.anIntArray423, Static319.anIntArray424, Static319.anIntArray421, Static319.aShortArray88, Static319.aByteArray68, arg1.aClass203_1.method4065(), Static319.anIntArray419);
		} else {
			Static319.anIntArray420[5] = 0;
			this.method4224().ba(this, arg0, arg2, Static319.anIntArray420, 0, Static319.anIntArray423, Static319.anIntArray424, Static319.anIntArray421, Static319.aShortArray88, Static319.aByteArray68, arg1.aClass203_1.method4065(), Static319.anIntArray419);
			arg3.anInt7195 = Static319.anIntArray420[0];
			arg3.anInt7191 = Static319.anIntArray420[1];
			arg3.anInt7194 = Static319.anIntArray420[2];
			arg3.anInt7192 = Static319.anIntArray420[3];
			arg3.anInt7193 = Static319.anIntArray420[4];
			arg3.aBoolean508 = Static319.anIntArray420[5] != 0;
		}
		@Pc(83) da local83 = (da) arg0;
		local83.method923(0, arg2);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5360() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5382(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}
}
