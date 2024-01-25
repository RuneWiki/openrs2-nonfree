import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class h extends Class109 implements Interface5 {

	@OriginalMember(owner = "client!h", name = "t", descriptor = "Lclient!ba;")
	private ba aBa1;

	@OriginalMember(owner = "client!h", name = "H", descriptor = "Lclient!la;")
	private la aLa1;

	@OriginalMember(owner = "client!h", name = "I", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!h", name = "N", descriptor = "[Lclient!ma;")
	private ma[] aMaArray1;

	@OriginalMember(owner = "client!h", name = "O", descriptor = "I")
	private int anInt2413;

	@OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!h", name = "u", descriptor = "Lclient!wo;")
	private final Class266 aClass266_17 = new Class266();

	@OriginalMember(owner = "client!h", name = "K", descriptor = "I")
	private final int anInt2411 = 4096;

	@OriginalMember(owner = "client!h", name = "M", descriptor = "I")
	private final int anInt2412 = 4096;

	@OriginalMember(owner = "client!h", name = "J", descriptor = "Lclient!bj;")
	private final Class27 aClass27_18 = new Class27(4);

	@OriginalMember(owner = "client!h", name = "L", descriptor = "Lclient!ia;")
	private final Class18 aClass18_2;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!m;Lclient!kj;)V")
	public h(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) Class138 arg3) {
		super(arg0, arg2);
		try {
			if (!Static142.aBoolean130) {
				if (arg3 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("sw3d");
					Static142.aBoolean130 = Boolean.TRUE;
				} else {
					arg3.method3211(this.getClass());
					Static142.aBoolean130 = Boolean.TRUE;
				}
			}
			if (!Static142.aBoolean130) {
				throw new RuntimeException("");
			}
			this.B(super.anInterface7_9, 0, 0);
			if (arg1 != null) {
				this.method4707(arg1);
				this.method4752(arg1);
			}
			this.aClass18_2 = new sa();
			this.m(new sa());
			this.method4717(1);
			this.method4725(0);
		} catch (@Pc(82) Throwable local82) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "EA", descriptor = "(S)Z")
	private boolean method2128(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class151 local9 = super.anInterface7_9.method4836(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.l(arg0, local9.aByte53, local9.aByte51, local9.aBoolean296, local9.aBoolean291, local9.aBoolean289, local9.aByte55, local9.aByte50, local9.aByte52, local9.aShort49, local9.anInt4297, local9.aBoolean288, local9.aBoolean290);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	@Override
	public void method4679(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!h", name = "P", descriptor = "(Lclient!la;)V")
	private native void P(@OriginalArg(0) la arg0);

	@OriginalMember(owner = "client!h", name = "D", descriptor = "()Lclient!ma;")
	public ma method2129() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2413; local1++) {
			if (this.aMaArray1[local1].aRunnable1 == Thread.currentThread()) {
				return this.aMaArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!h", name = "S", descriptor = "()V")
	public native void S();

	@OriginalMember(owner = "client!h", name = "ZA", descriptor = "()V")
	private void method2130() {
		System.gc();
		System.runFinalization();
		Static308.method4436();
	}

	@OriginalMember(owner = "client!h", name = "va", descriptor = "()V")
	public native void va();

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(IIIIII)Lclient!pv;")
	@Override
	public Class78 method4695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!gv;[Lclient!mp;Z)Lclient!oa;")
	@Override
	public Class129 method4719(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class159[] arg1) {
		return new w(this, this.aBa1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!h", name = "ua", descriptor = "(F)V")
	public native void ua(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!h", name = "GA", descriptor = "(IIII)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4728(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas2 == arg0) {
			this.method4752(null);
		}
		@Pc(15) la local15 = (la) this.aClass27_18.method553((long) arg0.hashCode());
		if (local15 != null) {
			local15.method6071();
		}
		local15.method3343();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([Lclient!c;Lclient!qb;Lclient!ia;[Lclient!nh;I)V")
	@Override
	public void method4688(@OriginalArg(0) Class37[] arg0, @OriginalArg(1) Class185 arg1, @OriginalArg(2) Class18 arg2, @OriginalArg(3) Class39_Sub7[] arg3, @OriginalArg(4) int arg4) {
		this.method2133(arg1, true);
		if (arg3 == null) {
			this.method2129().pa(this, arg0, arg2, null, arg4, Static142.anIntArray225, Static142.anIntArray229, Static142.anIntArray228, Static142.aShortArray43, Static142.aByteArray37, arg1.aClass212_1.method4964(), Static142.anIntArray227);
		} else {
			@Pc(28) Class39_Sub7 local28 = arg3[0];
			Static142.anIntArray226[5] = 0;
			this.method2129().pa(this, arg0, arg2, Static142.anIntArray226, arg4, Static142.anIntArray225, Static142.anIntArray229, Static142.anIntArray228, Static142.aShortArray43, Static142.aByteArray37, arg1.aClass212_1.method4964(), Static142.anIntArray227);
			local28.anInt4794 = Static142.anIntArray226[0];
			local28.anInt4797 = Static142.anIntArray226[1];
			local28.anInt4793 = Static142.anIntArray226[2];
			local28.anInt4795 = Static142.anIntArray226[3];
			local28.anInt4796 = Static142.anIntArray226[4];
			local28.aBoolean325 = Static142.anIntArray226[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) p local98 = (p) arg0[local88];
				local98.method4241(local86, arg2);
				if (local98.aClass252Array3 != null) {
					local86 += local98.aClass252Array3.length * 9;
				}
				if (local98.aClass122Array3 != null) {
					local86 += local98.aClass122Array3.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void f(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4691(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!l;)V")
	@Override
	public void method4730(@OriginalArg(0) Class1_Sub23 arg0) {
		this.aBa1 = (ba) arg0;
		this.Y(arg0);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([Lclient!c;Lclient!ia;[Lclient!nh;I)V")
	@Override
	public void method4718(@OriginalArg(0) Class37[] arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) Class39_Sub7[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method2129().za(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class39_Sub7 local15 = arg2[0];
		Static142.anIntArray226[5] = 0;
		this.method2129().za(this, arg0, arg1, Static142.anIntArray226, -1, arg3);
		local15.anInt4794 = Static142.anIntArray226[0];
		local15.anInt4797 = Static142.anIntArray226[1];
		local15.anInt4793 = Static142.anIntArray226[2];
		local15.anInt4795 = Static142.anIntArray226[3];
		local15.anInt4796 = Static142.anIntArray226[4];
		local15.aBoolean325 = Static142.anIntArray226[5] != 0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!pv;Lclient!pv;FLclient!pv;)Lclient!pv;")
	@Override
	public Class78 method4735(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class78 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!mp;Z)Lclient!f;")
	@Override
	public Class80 method4684(@OriginalArg(0) Class159 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray369;
		@Pc(5) byte[] local5 = arg0.aByteArray58;
		@Pc(8) int local8 = arg0.anInt4573;
		@Pc(11) int local11 = arg0.anInt4569;
		@Pc(32) Class80 local32;
		if (arg0.aByteArray57 == null) {
			local32 = new xa(this, this.aBa1, local2, local5, 0, arg0.anInt4573, arg0.anInt4573, arg0.anInt4569);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray57;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray369[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new k(this, this.aBa1, local40, 0, arg0.anInt4573, arg0.anInt4573, arg0.anInt4569);
				} else {
					local32 = new n(this, this.aBa1, local40, 0, arg0.anInt4573, arg0.anInt4573, arg0.anInt4569);
				}
			} else {
				for (@Pc(47) int local47 = 0; local47 < local11; local47++) {
					local52 = local47 * local8;
					for (local54 = 0; local54 < local8; local54++) {
						local40[local52 + local54] = local2[local5[local52 + local54] & 0xFF] | local43[local52 + local54] << 24;
					}
				}
				local32 = new k(this, this.aBa1, local40, 0, local8, local8, local11);
			}
		}
		local32.ka(arg0.anInt4568, arg0.anInt4572, arg0.anInt4570, arg0.anInt4571);
		return local32;
	}

	@OriginalMember(owner = "client!h", name = "V", descriptor = "(III)V")
	public native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!h", name = "xa", descriptor = "()I")
	public native int xa();

	@OriginalMember(owner = "client!h", name = "A", descriptor = "()Ljava/lang/Object;")
	private Object method2131() {
		return new ka();
	}

	@OriginalMember(owner = "client!h", name = "y", descriptor = "()Z")
	@Override
	public boolean method4744() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "o", descriptor = "()Z")
	@Override
	public boolean method4716() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "n", descriptor = "()Lclient!ia;")
	@Override
	public Class18 method4715() {
		return new sa();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
	@Override
	public void method4682(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!h", name = "aa", descriptor = "(IIIIII[BII)V")
	public native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!h", name = "ja", descriptor = "(I)V")
	private native void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!h", name = "pa", descriptor = "(IIII)V")
	public native void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)I")
	@Override
	public int method4699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "()V")
	@Override
	protected void method4694() {
		for (@Pc(5) ba local5 = (ba) this.aClass266_17.method6000(); local5 != null; local5 = (ba) this.aClass266_17.method5994()) {
			local5.ka();
		}
		this.aClass266_17.method6004();
		this.I();
	}

	@OriginalMember(owner = "client!h", name = "w", descriptor = "()F")
	public native float w();

	@OriginalMember(owner = "client!h", name = "O", descriptor = "(IIIII)V")
	protected native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!h", name = "IA", descriptor = "(IIII)[I")
	public native int[] IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!c;Lclient!qb;Lclient!ia;Lclient!nh;I)V")
	@Override
	public void method4736(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class185 arg1, @OriginalArg(2) Class18 arg2, @OriginalArg(3) Class39_Sub7 arg3) {
		this.method2133(arg1, true);
		if (arg3 == null) {
			this.method2129().f(this, arg0, arg2, null, 0, Static142.anIntArray225, Static142.anIntArray229, Static142.anIntArray228, Static142.aShortArray43, Static142.aByteArray37, arg1.aClass212_1.method4964(), Static142.anIntArray227);
		} else {
			Static142.anIntArray226[5] = 0;
			this.method2129().f(this, arg0, arg2, Static142.anIntArray226, 0, Static142.anIntArray225, Static142.anIntArray229, Static142.anIntArray228, Static142.aShortArray43, Static142.aByteArray37, arg1.aClass212_1.method4964(), Static142.anIntArray227);
			arg3.anInt4794 = Static142.anIntArray226[0];
			arg3.anInt4797 = Static142.anIntArray226[1];
			arg3.anInt4793 = Static142.anIntArray226[2];
			arg3.anInt4795 = Static142.anIntArray226[3];
			arg3.anInt4796 = Static142.anIntArray226[4];
			arg3.aBoolean325 = Static142.anIntArray226[5] != 0;
		}
		@Pc(83) p local83 = (p) arg0;
		local83.method4241(0, arg2);
	}

	@OriginalMember(owner = "client!h", name = "t", descriptor = "()Z")
	@Override
	public boolean method4732() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!wk;IIII)Lclient!c;")
	@Override
	public Class37 method4697(@OriginalArg(0) Class264 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new p(this, this.aBa1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!h", name = "h", descriptor = "()Z")
	@Override
	public boolean method4701() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2129().sa(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class80 method4714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new k(this, this.aBa1, arg0, arg1, arg2, arg3) : new n(this, this.aBa1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!h", name = "p", descriptor = "()Z")
	@Override
	public boolean method4721() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "C", descriptor = "()I")
	@Override
	public int method4755() {
		return 4;
	}

	@OriginalMember(owner = "client!h", name = "MA", descriptor = "(S)Z")
	private boolean method2132(@OriginalArg(0) short arg0) {
		@Pc(2) Interface7 local2 = super.anInterface7_9;
		synchronized (super.anInterface7_9) {
			if (!super.anInterface7_9.method4837(arg0)) {
				return false;
			}
			@Pc(22) Class151 local22 = super.anInterface7_9.method4836(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(46) int[] local46;
			if (local22.aBoolean291 && local22.aBoolean296) {
				local46 = super.anInterface7_9.method4839(true, 128, 0.7F, 128, arg0);
			} else {
				local46 = super.anInterface7_9.method4840(0.7F, arg0, 128, 128);
			}
			this.f(arg0, local22.aByte53, local22.aByte51, local22.aBoolean296, local22.aBoolean291, local22.aBoolean289, local22.aByte55, local22.aByte50, local22.aByte52, local22.aShort49, local22.anInt4297, local22.aBoolean288, local22.aBoolean290, local46);
			return true;
		}
	}

	@OriginalMember(owner = "client!h", name = "JA", descriptor = "(II)V")
	public native void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!h", name = "k", descriptor = "()Z")
	@Override
	public boolean method4706() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!qb;)V")
	@Override
	public void method4702(@OriginalArg(0) Class185 arg0) {
		this.method2133(arg0, false);
		this.method2129().S(this, Static142.anIntArray225, Static142.anIntArray229, Static142.anIntArray228, Static142.aShortArray43, arg0.aClass212_1.method4964());
	}

	@OriginalMember(owner = "client!h", name = "j", descriptor = "()V")
	@Override
	public void method4704() {
		for (@Pc(1) int local1 = 0; local1 < 7; local1++) {
			if (local1 == 6) {
				throw new RuntimeException();
			}
			if (this.aCanvas2.getPeer() != null) {
				break;
			}
			Static67.method1189(300L);
		}
		this.aLa1.SA();
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V")
	@Override
	public void method4698(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "()V")
	@Override
	public void method4696() {
	}

	@OriginalMember(owner = "client!h", name = "ba", descriptor = "(IIII)V")
	public native void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "u", descriptor = "()Z")
	@Override
	public boolean method4734() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "m", descriptor = "()Z")
	@Override
	public boolean method4712() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "U", descriptor = "(IIIII)V")
	public native void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!h", name = "Z", descriptor = "(IIII)V")
	public native void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "x", descriptor = "()V")
	@Override
	public void method4740() {
	}

	@OriginalMember(owner = "client!h", name = "M", descriptor = "(I)V")
	public native void M(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!qb;Z)V")
	private void method2133(@OriginalArg(0) Class185 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class39_Sub2_Sub1 local15 = (Class39_Sub2_Sub1) arg0.aClass212_1.method4960(); local15 != null; local15 = (Class39_Sub2_Sub1) arg0.aClass212_1.method4959()) {
			Static142.anIntArray225[local1++] = local15.anInt7204;
			Static142.anIntArray225[local1++] = local15.anInt7206;
			Static142.anIntArray225[local1++] = local15.anInt7210;
			Static142.anIntArray229[local3++] = local15.anInt7207;
			Static142.aShortArray43[local7++] = (short) local15.anInt7208;
			Static142.anIntArray228[local5++] = local15.anInt7212;
			if (arg1) {
				Static142.aByteArray37[local9++] = local15.aByte100;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4681(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < 7; local1++) {
			if (local1 == 6) {
				throw new RuntimeException();
			}
			if (this.aCanvas2.getPeer() != null) {
				break;
			}
			Static67.method1189(300L);
		}
		for (@Pc(23) int local23 = 0; local23 < arg1; local23++) {
			@Pc(28) Rectangle local28 = arg0[local23];
			if (local28.width > 0 && local28.height > 0) {
				this.aLa1.xa(local28.x, local28.y, local28.width, local28.height);
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "i", descriptor = "()Z")
	@Override
	public boolean method4703() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
	@Override
	public void method4708(@OriginalArg(0) int arg0) {
		this.aMaArray1[arg0].method3564();
	}

	@OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.ya();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.da(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.da(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "r", descriptor = "()Z")
	@Override
	public boolean method4724() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
	@Override
	public void method4717(@OriginalArg(0) int arg0) {
		this.anInt2413 = arg0;
		this.aMaArray1 = new ma[this.anInt2413];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2413; local9++) {
			this.aMaArray1[local9] = new ma(this, this.anInt2412, this.anInt2411);
		}
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(Z)V")
	@Override
	public void method4733(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "()Z")
	@Override
	public boolean method4687() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIF)Lclient!pe;")
	@Override
	public Class1_Sub5 method4692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub5_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "VA", descriptor = "(I[I[F)V")
	private native void VA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!h", name = "u", descriptor = "([I)V")
	public native void u(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!h", name = "m", descriptor = "(Lclient!ia;)V")
	public native void m(@OriginalArg(0) Class18 arg0);

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4731(@OriginalArg(0) Canvas arg0) {
		@Pc(8) la local8 = (la) this.aClass27_18.method553((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.ZA(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aCanvas2) {
			this.method4752(arg0);
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(I)Lclient!l;")
	@Override
	public Class1_Sub23 method4690() {
		@Pc(5) ba local5 = new ba(this, 78643200);
		this.aClass266_17.method5998(local5);
		return local5;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "()Z")
	@Override
	public boolean method4686() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "K", descriptor = "(IIIIII)V")
	private native void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!pv;)V")
	@Override
	public void method4711(@OriginalArg(0) Class78 arg0) {
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method4705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.K(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "B", descriptor = "(Lclient!m;II)V")
	private native void B(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!h", name = "ta", descriptor = "(IIIIIILclient!ea;II)V")
	private native void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class62 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!h", name = "q", descriptor = "()V")
	@Override
	public void method4722() {
	}

	@OriginalMember(owner = "client!h", name = "ia", descriptor = "(III[I)V")
	public native void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!h", name = "da", descriptor = "(IIIII)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II[[I[[IIII)Lclient!na;")
	@Override
	public Class136 method4750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new b(this, this.aBa1, arg0, arg1, arg2, arg3, 128, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "()V")
	@Override
	public void method4693() {
	}

	@OriginalMember(owner = "client!h", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void l(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIILclient!ea;II)V")
	@Override
	public void method4680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class62 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.ta(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)I")
	@Override
	public int method4710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!h", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!h", name = "d", descriptor = "()I")
	public native int d();

	@OriginalMember(owner = "client!h", name = "l", descriptor = "()Lclient!ia;")
	@Override
	public Class18 method4709() {
		return this.aClass18_2;
	}

	@OriginalMember(owner = "client!h", name = "j", descriptor = "(ILclient!ea;II)V")
	public native void j(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "la", descriptor = "()F")
	public native float la();

	@OriginalMember(owner = "client!h", name = "I", descriptor = "()V")
	private native void I();

	@OriginalMember(owner = "client!h", name = "o", descriptor = "(FF)V")
	public native void o(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!h", name = "na", descriptor = "(I)V")
	public native void na(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!h", name = "fa", descriptor = "(IIII)V")
	public native void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "NA", descriptor = "(IIIIII)V")
	public native void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!h", name = "z", descriptor = "()Z")
	@Override
	public boolean method4748() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "Y", descriptor = "(Lclient!l;)V")
	private native void Y(@OriginalArg(0) Class1_Sub23 arg0);

	@OriginalMember(owner = "client!h", name = "SA", descriptor = "(IIIIII)Z")
	public native boolean SA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4707(@OriginalArg(0) Canvas arg0) {
		@Pc(8) la local8 = (la) this.aClass27_18.method553((long) arg0.hashCode());
		if (local8 == null) {
			local8 = new la(this, arg0);
			this.aClass27_18.method564((long) arg0.hashCode(), local8);
		}
	}

	@OriginalMember(owner = "client!h", name = "XA", descriptor = "(IFFFFF)V")
	public native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II[I[I)Lclient!ea;")
	@Override
	public Class62 method4746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new ca(this, this.aBa1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!h", name = "v", descriptor = "()V")
	@Override
	public void method4737() {
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class80 method4739(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new k(this, this.aBa1, arg0, 0, arg1, arg2, arg3) : new n(this, this.aBa1, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new k(this, this.aBa1, arg0, 0, arg1, arg2, arg3) : new n(this, this.aBa1, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4752(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas2 = null;
			this.aLa1 = null;
			this.P(null);
		} else {
			@Pc(10) la local10 = (la) this.aClass27_18.method553((long) arg0.hashCode());
			this.aCanvas2 = arg0;
			this.aLa1 = local10;
			this.P(local10);
		}
	}

	@OriginalMember(owner = "client!h", name = "s", descriptor = "()Z")
	@Override
	public boolean method4729() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "FA", descriptor = "()I")
	public native int FA();

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I[Lclient!pe;)V")
	@Override
	public void method4726(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static142.anIntArray224[local1++] = arg1[local3].method3333();
			Static142.anIntArray224[local1++] = arg1[local3].method3326();
			Static142.anIntArray224[local1++] = arg1[local3].method3325();
			Static142.anIntArray224[local1++] = arg1[local3].method3327();
			Static142.aFloatArray17[local3] = arg1[local3].method3328();
			Static142.anIntArray224[local1++] = arg1[local3].method3331();
		}
		this.VA(arg0, Static142.anIntArray224, Static142.aFloatArray17);
	}

	@OriginalMember(owner = "client!h", name = "B", descriptor = "()Z")
	@Override
	public boolean method4754() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4747() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V")
	@Override
	public void method4738(@OriginalArg(0) int arg0) {
		Static308.method4436();
		this.ja(arg0);
		for (@Pc(10) ba local10 = (ba) this.aClass266_17.method6000(); local10 != null; local10 = (ba) this.aClass266_17.method5994()) {
			local10.KA();
		}
	}

	@OriginalMember(owner = "client!h", name = "W", descriptor = "()I")
	public native int W();

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
	@Override
	public void method4725(@OriginalArg(0) int arg0) {
		this.aMaArray1[arg0].method3565();
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "()I")
	public native int g();
}
