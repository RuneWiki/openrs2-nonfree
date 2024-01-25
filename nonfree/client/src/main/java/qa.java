import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class qa extends Class51 implements Interface3 {

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "Lclient!na;")
	private na aNa2;

	@OriginalMember(owner = "client!qa", name = "I", descriptor = "Lclient!za;")
	private za aZa1;

	@OriginalMember(owner = "client!qa", name = "M", descriptor = "I")
	private int anInt5219;

	@OriginalMember(owner = "client!qa", name = "N", descriptor = "[Lclient!n;")
	private n[] aNArray1;

	@OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "Lclient!fr;")
	private final Class85 aClass85_34 = new Class85();

	@OriginalMember(owner = "client!qa", name = "G", descriptor = "I")
	private final int anInt5217 = 4096;

	@OriginalMember(owner = "client!qa", name = "J", descriptor = "I")
	private final int anInt5218 = 4096;

	@OriginalMember(owner = "client!qa", name = "H", descriptor = "Lclient!mt;")
	private final Class164 aClass164_30 = new Class164(4);

	@OriginalMember(owner = "client!qa", name = "O", descriptor = "Z")
	private boolean aBoolean335 = false;

	@OriginalMember(owner = "client!qa", name = "L", descriptor = "Lclient!c;")
	private Class33 aClass33_7;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!ga;Lclient!ec;)V")
	public qa(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) Class61 arg3) {
		super(arg0, arg2);
		try {
			if (!Static319.aBoolean334) {
				if (arg3 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("sw3d");
					Static319.aBoolean334 = Boolean.TRUE;
				} else {
					arg3.method1472(this.getClass());
					Static319.aBoolean334 = Boolean.TRUE;
				}
			}
			if (!Static319.aBoolean334) {
				throw new RuntimeException("");
			}
			this.K(super.anInterface4_8, 0, 0);
			Static394.method5010(true, false);
			this.aBoolean335 = true;
			this.aClass33_7 = new i();
			this.ea(new i());
			this.method5340(1);
			this.method5341(0);
			if (arg1 != null) {
				this.method5330(arg1);
				this.method5314(arg1);
			}
		} catch (@Pc(92) Throwable local92) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "()Z")
	@Override
	public boolean method5337() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "OA", descriptor = "(IIII)V")
	public native void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	@Override
	public void method5306(@OriginalArg(0) int arg0) {
		this.aNArray1[arg0].method3535();
	}

	@OriginalMember(owner = "client!qa", name = "I", descriptor = "(Lclient!u;)V")
	private native void I(@OriginalArg(0) Class7_Sub40 arg0);

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "()Z")
	@Override
	public boolean method5321() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!du;[Lclient!ul;Z)Lclient!la;")
	@Override
	public Class63 method5281(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class246[] arg1) {
		return new s(this, this.aNa2, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public void method5336(@OriginalArg(0) Class7_Sub40 arg0) {
		this.aNa2 = (na) arg0;
		this.I(arg0);
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method5289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.RA(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!io;IIII)Lclient!t;")
	@Override
	public Class163 method5346(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new da(this, this.aNa2, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void q(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!qa", name = "F", descriptor = "(IIII)[I")
	public native int[] F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "T", descriptor = "(IFFFFF)V")
	public native void T(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "()Z")
	@Override
	public boolean method5305() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "UA", descriptor = "(III)V")
	public native void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "ma", descriptor = "(I)V")
	private native void ma(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "()Z")
	@Override
	public boolean method5327() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Lclient!l;")
	@Override
	public Class11 method5349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new ra(this, this.aNa2, arg0, arg1, arg2, arg3) : new ia(this, this.aNa2, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qa", name = "JA", descriptor = "(IIIIII)Z")
	public native boolean JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5298(@OriginalArg(0) Canvas arg0) {
		if (this.aZa1.aCanvas7 == arg0) {
			this.method5314(null);
		}
		@Pc(16) za local16 = (za) this.aClass164_30.method3512((long) arg0.hashCode());
		if (local16 != null) {
			local16.method5802();
			local16.method5804();
		}
	}

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "()V")
	public native void l();

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
	@Override
	public void method5340(@OriginalArg(0) int arg0) {
		this.anInt5219 = arg0;
		this.aNArray1 = new n[this.anInt5219];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5219; local9++) {
			this.aNArray1[local9] = new n(this, this.anInt5217, this.anInt5218);
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
	@Override
	public void method5331(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "()V")
	@Override
	public void method5292() {
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lclient!ma;")
	@Override
	public Class119 method5296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new sa(this, this.aNa2, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!pv;)V")
	@Override
	public void method5311(@OriginalArg(0) Class201 arg0) {
		this.method4203(arg0, false);
		this.method4205().G(this, Static319.anIntArray470, Static319.anIntArray472, Static319.anIntArray473, Static319.aShortArray94, arg0.aClass232_1.method4836());
	}

	@OriginalMember(owner = "client!qa", name = "GA", descriptor = "(IIII)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "(IIIIIILclient!ma;II)V")
	private native void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class119 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5282(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "()V")
	@Override
	public void method5302() {
	}

	@OriginalMember(owner = "client!qa", name = "TA", descriptor = "(IIIII)V")
	public native void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5343(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aZa1 == null) {
			throw new IllegalStateException("off");
		}
		this.aZa1.method5803(arg0, arg1);
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
	@Override
	public int method5323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5330(@OriginalArg(0) Canvas arg0) {
		@Pc(8) za local8 = (za) this.aClass164_30.method3512((long) arg0.hashCode());
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
		this.aClass164_30.method3508((long) arg0.hashCode(), local8);
	}

	@OriginalMember(owner = "client!qa", name = "RA", descriptor = "(IIIIII)V")
	private native void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "(I)V")
	public native void p(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.EA();
	}

	@OriginalMember(owner = "client!qa", name = "W", descriptor = "()F")
	public native float W();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5314(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aZa1 = null;
			this.PA(null);
		} else {
			@Pc(10) za local10 = (za) this.aClass164_30.method3512((long) arg0.hashCode());
			this.aZa1 = local10;
			this.PA(local10);
		}
	}

	@OriginalMember(owner = "client!qa", name = "FA", descriptor = "()V")
	private native void FA();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!t;Lclient!pv;Lclient!c;Lclient!qb;I)V")
	@Override
	public void method5291(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class201 arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(3) Class28_Sub6 arg3) {
		this.method4203(arg1, true);
		if (arg3 == null) {
			this.method4205().ba(this, arg0, arg2, null, 0, Static319.anIntArray470, Static319.anIntArray472, Static319.anIntArray473, Static319.aShortArray94, Static319.aByteArray80, arg1.aClass232_1.method4836(), Static319.anIntArray469);
		} else {
			Static319.anIntArray471[5] = 0;
			this.method4205().ba(this, arg0, arg2, Static319.anIntArray471, 0, Static319.anIntArray470, Static319.anIntArray472, Static319.anIntArray473, Static319.aShortArray94, Static319.aByteArray80, arg1.aClass232_1.method4836(), Static319.anIntArray469);
			arg3.anInt5225 = Static319.anIntArray471[0];
			arg3.anInt5228 = Static319.anIntArray471[1];
			arg3.anInt5224 = Static319.anIntArray471[2];
			arg3.anInt5227 = Static319.anIntArray471[3];
			arg3.anInt5226 = Static319.anIntArray471[4];
			arg3.aBoolean336 = Static319.anIntArray471[5] != 0;
		}
		@Pc(83) da local83 = (da) arg0;
		local83.method903(0, arg2);
	}

	@OriginalMember(owner = "client!qa", name = "da", descriptor = "([I)V")
	public native void da(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lclient!wr;")
	@Override
	public Class7_Sub30 method5335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class7_Sub30_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!pv;Z)V")
	private void method4203(@OriginalArg(0) Class201 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class28_Sub1_Sub1 local15 = (Class28_Sub1_Sub1) arg0.aClass232_1.method4838(); local15 != null; local15 = (Class28_Sub1_Sub1) arg0.aClass232_1.method4841()) {
			Static319.anIntArray470[local1++] = local15.anInt4770;
			Static319.anIntArray470[local1++] = local15.anInt4763;
			Static319.anIntArray470[local1++] = local15.anInt4765;
			Static319.anIntArray472[local3++] = local15.anInt4767;
			Static319.aShortArray94[local7++] = (short) local15.anInt4771;
			Static319.anIntArray473[local5++] = local15.anInt4760;
			if (arg1) {
				Static319.aByteArray80[local9++] = local15.aByte49;
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIIII)Lclient!qs;")
	@Override
	public Class96 method5351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "()Z")
	@Override
	public boolean method5342() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)I")
	@Override
	public int method5352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!qa", name = "NA", descriptor = "(IIIII)V")
	protected native void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "R", descriptor = "(S)Z")
	private boolean method4204(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class203 local9 = super.anInterface4_8.method3138(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.aa(arg0, local9.aByte62, local9.aByte57, local9.aBoolean361, local9.aBoolean360, local9.aBoolean366, local9.aByte58, local9.aByte56, local9.aByte59, local9.aShort67, local9.anInt5348, local9.aBoolean362, local9.aBoolean359);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "aa", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "()V")
	@Override
	public void method5283() {
	}

	@OriginalMember(owner = "client!qa", name = "PA", descriptor = "(Lclient!za;)V")
	private native void PA(@OriginalArg(0) za arg0);

	@OriginalMember(owner = "client!qa", name = "DA", descriptor = "(IIIIII[BII)V")
	public native void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z")
	@Override
	public boolean method5307() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "()V")
	@Override
	public void method5300() {
	}

	@OriginalMember(owner = "client!qa", name = "X", descriptor = "(III[I)V")
	public native void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "ca", descriptor = "(ILclient!ma;II)V")
	public native void ca(@OriginalArg(0) int arg0, @OriginalArg(1) Class119 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "(I)Lclient!u;")
	@Override
	public Class7_Sub40 method5347(@OriginalArg(0) int arg0) {
		@Pc(5) na local5 = new na(this, arg0);
		this.aClass85_34.method2011(local5);
		return local5;
	}

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "()Lclient!c;")
	@Override
	public Class33 method5285() {
		return this.aClass33_7;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Lclient!l;")
	@Override
	public Class11 method5310(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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

	@OriginalMember(owner = "client!qa", name = "H", descriptor = "(IIII)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "()I")
	@Override
	public int method5290() {
		return 4;
	}

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z")
	@Override
	public boolean method5301() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()V")
	@Override
	public void method5278() {
	}

	@OriginalMember(owner = "client!qa", name = "D", descriptor = "()Lclient!n;")
	public n method4205() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5219; local1++) {
			if (this.aNArray1[local1].aRunnable2 == Thread.currentThread()) {
				return this.aNArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "YA", descriptor = "()I")
	public native int YA();

	@OriginalMember(owner = "client!qa", name = "IA", descriptor = "()I")
	public native int IA();

	@OriginalMember(owner = "client!qa", name = "ZA", descriptor = "()I")
	public native int ZA();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method5287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.b(arg0, arg1, arg2, arg4, arg5);
		this.b(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.TA(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.TA(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
	@Override
	public void method5341(@OriginalArg(0) int arg0) {
		this.aNArray1[arg0].method3537();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	@Override
	public void method5299(@OriginalArg(0) int arg0) {
		Static125.method2024();
		this.ma(arg0);
		for (@Pc(10) na local10 = (na) this.aClass85_34.method2010(); local10 != null; local10 = (na) this.aClass85_34.method2000()) {
			local10.a();
		}
	}

	@OriginalMember(owner = "client!qa", name = "K", descriptor = "(Lclient!ga;II)V")
	private native void K(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "sa", descriptor = "(S)Z")
	private boolean method4206(@OriginalArg(0) short arg0) {
		@Pc(2) Interface4 local2 = super.anInterface4_8;
		synchronized (super.anInterface4_8) {
			if (!super.anInterface4_8.method3140(arg0)) {
				return false;
			}
			@Pc(22) Class203 local22 = super.anInterface4_8.method3138(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(46) int[] local46;
			if (local22.aBoolean360 && local22.aBoolean361) {
				local46 = super.anInterface4_8.method3142(true, 128, 0.7F, arg0, 128);
			} else {
				local46 = super.anInterface4_8.method3139(0.7F, arg0, 128, 128);
			}
			this.q(arg0, local22.aByte62, local22.aByte57, local22.aBoolean361, local22.aBoolean360, local22.aBoolean366, local22.aByte58, local22.aByte56, local22.aByte59, local22.aShort67, local22.anInt5348, local22.aBoolean362, local22.aBoolean359, local46);
			return true;
		}
	}

	@OriginalMember(owner = "client!qa", name = "MA", descriptor = "(I)V")
	public native void MA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ul;Z)Lclient!l;")
	@Override
	public Class11 method5308(@OriginalArg(0) Class246 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray578;
		@Pc(5) byte[] local5 = arg0.aByteArray90;
		@Pc(8) int local8 = arg0.anInt6476;
		@Pc(11) int local11 = arg0.anInt6475;
		@Pc(32) Class11 local32;
		if (arg0.aByteArray89 == null) {
			local32 = new k(this, this.aNa2, local2, local5, 0, arg0.anInt6476, arg0.anInt6476, arg0.anInt6475);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray89;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray578[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new ra(this, this.aNa2, local40, 0, arg0.anInt6476, arg0.anInt6476, arg0.anInt6475);
				} else {
					local32 = new ia(this, this.aNa2, local40, 0, arg0.anInt6476, arg0.anInt6476, arg0.anInt6475);
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
		local32.MA(arg0.anInt6473, arg0.anInt6478, arg0.anInt6474, arg0.anInt6477);
		return local32;
	}

	@OriginalMember(owner = "client!qa", name = "fa", descriptor = "(IIII)V")
	public native void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "()Z")
	@Override
	public boolean method5328() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "()Z")
	@Override
	public boolean method5316() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "()Z")
	@Override
	public boolean method5317() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "EA", descriptor = "()V")
	public native void EA();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "za", descriptor = "(I[I[F)V")
	private native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lclient!wr;)V")
	@Override
	public void method5318(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub30[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static319.anIntArray474[local1++] = arg1[local3].method5032();
			Static319.anIntArray474[local1++] = arg1[local3].method5029();
			Static319.anIntArray474[local1++] = arg1[local3].method5023();
			Static319.anIntArray474[local1++] = arg1[local3].method5031();
			Static319.aFloatArray21[local3] = arg1[local3].method5024();
			Static319.anIntArray474[local1++] = arg1[local3].method5025();
		}
		this.za(arg0, Static319.anIntArray474, Static319.aFloatArray21);
	}

	@OriginalMember(owner = "client!qa", name = "ea", descriptor = "(Lclient!c;)V")
	public native void ea(@OriginalArg(0) Class33 arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILclient!ma;II)V")
	@Override
	public void method5339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class119 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.A(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
	@Override
	public void method5279(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qa", name = "AA", descriptor = "(IIII)V")
	public native void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(FF)V")
	public native void g(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "()Z")
	@Override
	public boolean method5284() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "ha", descriptor = "()V")
	private void method4207() {
		System.gc();
		System.runFinalization();
		Static125.method2024();
	}

	@OriginalMember(owner = "client!qa", name = "xa", descriptor = "()F")
	public native float xa();

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "()Z")
	@Override
	public boolean method5350() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "()Lclient!c;")
	@Override
	public Class33 method5293() {
		return new i();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!t;Lclient!pv;Lclient!c;[Lclient!qb;I)V")
	@Override
	public void method5322(@OriginalArg(0) Class163[] arg0, @OriginalArg(1) Class201 arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(3) Class28_Sub6[] arg3, @OriginalArg(4) int arg4) {
		this.method4203(arg1, true);
		if (arg3 == null) {
			this.method4205().Y(this, arg0, arg2, null, arg4, Static319.anIntArray470, Static319.anIntArray472, Static319.anIntArray473, Static319.aShortArray94, Static319.aByteArray80, arg1.aClass232_1.method4836(), Static319.anIntArray469);
		} else {
			@Pc(28) Class28_Sub6 local28 = arg3[0];
			Static319.anIntArray471[5] = 0;
			this.method4205().Y(this, arg0, arg2, Static319.anIntArray471, arg4, Static319.anIntArray470, Static319.anIntArray472, Static319.anIntArray473, Static319.aShortArray94, Static319.aByteArray80, arg1.aClass232_1.method4836(), Static319.anIntArray469);
			local28.anInt5225 = Static319.anIntArray471[0];
			local28.anInt5228 = Static319.anIntArray471[1];
			local28.anInt5224 = Static319.anIntArray471[2];
			local28.anInt5227 = Static319.anIntArray471[3];
			local28.anInt5226 = Static319.anIntArray471[4];
			local28.aBoolean336 = Static319.anIntArray471[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) da local98 = (da) arg0[local88];
				local98.method903(local86, arg2);
				if (local98.aClass167Array1 != null) {
					local86 += local98.aClass167Array1.length * 9;
				}
				if (local98.aClass52Array1 != null) {
					local86 += local98.aClass52Array1.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "O", descriptor = "(IIIIII)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()I")
	public native int a();

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "()V")
	@Override
	public void method5353() {
		if (this.aZa1 == null) {
			throw new IllegalStateException("off");
		}
		this.aZa1.method5805();
	}

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "()I")
	public native int w();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5297() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "()V")
	public native void e();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!qs;)V")
	@Override
	public void method5344(@OriginalArg(0) Class96 arg0) {
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4205().va(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "(F)V")
	public native void B(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z")
	@Override
	public boolean method5326() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "ia", descriptor = "(II)V")
	public native void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "()Z")
	@Override
	public boolean method5295() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "()Z")
	@Override
	public boolean method5348() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "()V")
	@Override
	protected void method5338() {
		this.aNArray1 = null;
		this.aZa1 = null;
		this.aNa2 = null;
		this.aClass33_7 = null;
		this.aClass164_30.method3509();
		for (@Pc(21) na local21 = (na) this.aClass85_34.method2010(); local21 != null; local21 = (na) this.aClass85_34.method2000()) {
			local21.H();
		}
		this.aClass85_34.method2008();
		this.method4207();
		this.FA();
		if (this.aBoolean335) {
			Static388.method4970(false, true);
			this.aBoolean335 = false;
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5309(@OriginalArg(0) Canvas arg0) {
		@Pc(8) za local8 = (za) this.aClass164_30.method3512((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.H(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aZa1.aCanvas7) {
			this.method5314(arg0);
		}
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
	@Override
	public void method5333(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qa", name = "SA", descriptor = "()Ljava/lang/Object;")
	private Object method4208() {
		return new p();
	}

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
	@Override
	public void method5345(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!qs;Lclient!qs;FLclient!qs;)Lclient!qs;")
	@Override
	public Class96 method5320(@OriginalArg(0) Class96 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class96 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!t;Lclient!c;[Lclient!qb;I)V")
	@Override
	public void method5334(@OriginalArg(0) Class163[] arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) Class28_Sub6[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method4205().TA(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class28_Sub6 local15 = arg2[0];
		Static319.anIntArray471[5] = 0;
		this.method4205().TA(this, arg0, arg1, Static319.anIntArray471, -1, arg3);
		local15.anInt5225 = Static319.anIntArray471[0];
		local15.anInt5228 = Static319.anIntArray471[1];
		local15.anInt5224 = Static319.anIntArray471[2];
		local15.anInt5227 = Static319.anIntArray471[3];
		local15.anInt5226 = Static319.anIntArray471[4];
		local15.aBoolean336 = Static319.anIntArray471[5] != 0;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lclient!ta;")
	@Override
	public Class165 method5288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new ha(this, this.aNa2, arg0, arg1, arg2, arg3, 128, arg4, arg5);
	}
}
