import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class h extends Class75 implements Interface3 {

	@OriginalMember(owner = "client!h", name = "s", descriptor = "Lclient!ba;")
	private ba aBa1;

	@OriginalMember(owner = "client!h", name = "E", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!h", name = "I", descriptor = "Lclient!la;")
	private la aLa1;

	@OriginalMember(owner = "client!h", name = "L", descriptor = "I")
	private int anInt3244;

	@OriginalMember(owner = "client!h", name = "M", descriptor = "[Lclient!ma;")
	private ma[] aMaArray1;

	@OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!h", name = "t", descriptor = "Lclient!tu;")
	private final Class229 aClass229_25 = new Class229();

	@OriginalMember(owner = "client!h", name = "F", descriptor = "I")
	private final int anInt3242 = 4096;

	@OriginalMember(owner = "client!h", name = "G", descriptor = "I")
	private final int anInt3243 = 4096;

	@OriginalMember(owner = "client!h", name = "C", descriptor = "Lclient!jr;")
	private final Class127 aClass127_14 = new Class127(4);

	@OriginalMember(owner = "client!h", name = "H", descriptor = "Lclient!ia;")
	private final Class106 aClass106_1;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!m;Lclient!hs;)V")
	public h(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) Class103 arg3) {
		super(arg0, arg2);
		try {
			if (!Static145.aBoolean250) {
				if (arg3 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("sw3d");
					Static145.aBoolean250 = Boolean.TRUE;
				} else {
					arg3.method2840(this.getClass());
					Static145.aBoolean250 = Boolean.TRUE;
				}
			}
			if (!Static145.aBoolean250) {
				throw new RuntimeException("");
			}
			this.B(super.anInterface7_6, 0, 0);
			if (arg1 != null) {
				this.method2621(arg1);
				this.method2638(arg1);
			}
			this.aClass106_1 = new sa();
			this.m(new sa());
			this.method2634(1);
			this.method2606(0);
		} catch (@Pc(82) Throwable local82) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V")
	@Override
	public void method2586(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!h", name = "j", descriptor = "()Z")
	@Override
	public boolean method2589() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "o", descriptor = "(FF)V")
	public native void o(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!h", name = "P", descriptor = "(Lclient!la;)V")
	private native void P(@OriginalArg(0) la arg0);

	@OriginalMember(owner = "client!h", name = "e", descriptor = "()V")
	@Override
	public void method2583() {
	}

	@OriginalMember(owner = "client!h", name = "Z", descriptor = "(IIII)V")
	public native void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "MA", descriptor = "(S)Z")
	private boolean method2643(@OriginalArg(0) short arg0) {
		@Pc(2) Interface7 local2 = super.anInterface7_6;
		synchronized (super.anInterface7_6) {
			if (!super.anInterface7_6.method2132(arg0)) {
				return false;
			}
			@Pc(22) Class62 local22 = super.anInterface7_6.method2131(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(46) int[] local46;
			if (local22.aBoolean143 && local22.aBoolean148) {
				local46 = super.anInterface7_6.method2129(0.7F, 128, 128, true, arg0);
			} else {
				local46 = super.anInterface7_6.method2128(128, 0.7F, arg0, 128);
			}
			this.f(arg0, local22.aByte24, local22.aByte27, local22.aBoolean148, local22.aBoolean143, local22.aBoolean147, local22.aByte22, local22.aByte26, local22.aByte28, local22.aShort52, local22.anInt1810, local22.aBoolean145, local22.aBoolean149, local46);
			return true;
		}
	}

	@OriginalMember(owner = "client!h", name = "pa", descriptor = "(IIII)V")
	public native void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2621(@OriginalArg(0) Canvas arg0) {
		@Pc(8) la local8 = (la) this.aClass127_14.method3246((long) arg0.hashCode());
		if (local8 == null) {
			local8 = new la(this, arg0);
			this.aClass127_14.method3257((long) arg0.hashCode(), local8);
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)I")
	@Override
	public int method2610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method2566(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			@Pc(6) Rectangle local6 = arg0[local1];
			if (local6.width > 0 && local6.height > 0) {
				this.aLa1.xa(local6.x, local6.y, local6.width, local6.height);
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "Y", descriptor = "(Lclient!l;)V")
	private native void Y(@OriginalArg(0) Class3_Sub27 arg0);

	@OriginalMember(owner = "client!h", name = "ba", descriptor = "(IIII)V")
	public native void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "ja", descriptor = "(I)V")
	private native void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method2618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.K(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "()V")
	@Override
	public void method2570() {
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "()Z")
	@Override
	public boolean method2578() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "na", descriptor = "(I)V")
	public native void na(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIILclient!ea;II)V")
	@Override
	public void method2603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class32 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.ta(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!h", name = "A", descriptor = "()Ljava/lang/Object;")
	private Object method2644() {
		return new ka();
	}

	@OriginalMember(owner = "client!h", name = "t", descriptor = "()Z")
	@Override
	public boolean method2623() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "h", descriptor = "(I)V")
	@Override
	public void method2630(@OriginalArg(0) int arg0) {
		this.aMaArray1[arg0].method3778();
	}

	@OriginalMember(owner = "client!h", name = "j", descriptor = "(ILclient!ea;II)V")
	public native void j(@OriginalArg(0) int arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "y", descriptor = "()Z")
	@Override
	public boolean method2635() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "aa", descriptor = "(IIIIII[BII)V")
	public native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method2580() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "()I")
	public native int d();

	@OriginalMember(owner = "client!h", name = "NA", descriptor = "(IIIIII)V")
	public native void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!h", name = "V", descriptor = "(III)V")
	public native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!h", name = "m", descriptor = "()Z")
	@Override
	public boolean method2609() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "M", descriptor = "(I)V")
	public native void M(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!uu;IIII)Lclient!c;")
	@Override
	public Class31 method2616(@OriginalArg(0) Class242 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new p(this, this.aBa1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!h", name = "n", descriptor = "()Z")
	@Override
	public boolean method2612() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "u", descriptor = "([I)V")
	public native void u(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!c;Lclient!iv;Lclient!ia;Lclient!aq;I)V")
	@Override
	public void method2571(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class116 arg1, @OriginalArg(2) Class106 arg2, @OriginalArg(3) Class13_Sub1 arg3) {
		this.method2645(arg1, true);
		if (arg3 == null) {
			this.method2648().f(this, arg0, arg2, null, 0, Static145.anIntArray249, Static145.anIntArray251, Static145.anIntArray247, Static145.aShortArray42, Static145.aByteArray38, arg1.aClass236_1.method5461(), Static145.anIntArray248);
		} else {
			Static145.anIntArray250[5] = 0;
			this.method2648().f(this, arg0, arg2, Static145.anIntArray250, 0, Static145.anIntArray249, Static145.anIntArray251, Static145.anIntArray247, Static145.aShortArray42, Static145.aByteArray38, arg1.aClass236_1.method5461(), Static145.anIntArray248);
			arg3.anInt557 = Static145.anIntArray250[0];
			arg3.anInt556 = Static145.anIntArray250[1];
			arg3.anInt555 = Static145.anIntArray250[2];
			arg3.anInt559 = Static145.anIntArray250[3];
			arg3.anInt558 = Static145.anIntArray250[4];
			arg3.aBoolean23 = Static145.anIntArray250[5] != 0;
		}
		@Pc(83) p local83 = (p) arg0;
		local83.method4415(0, arg2);
	}

	@OriginalMember(owner = "client!h", name = "l", descriptor = "()V")
	@Override
	public void method2594() {
		if (this.aCanvas5.getPeer() == null) {
			throw new RuntimeException();
		}
		this.aLa1.SA();
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "()I")
	@Override
	public int method2584() {
		return 4;
	}

	@OriginalMember(owner = "client!h", name = "la", descriptor = "()F")
	public native float la();

	@OriginalMember(owner = "client!h", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void l(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!h", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(Z)V")
	@Override
	public void method2592(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	@Override
	public void method2567(@OriginalArg(0) int arg0) {
		Static280.method4133();
		this.ja(arg0);
		for (@Pc(10) ba local10 = (ba) this.aClass229_25.method5328(); local10 != null; local10 = (ba) this.aClass229_25.method5325()) {
			local10.KA();
		}
	}

	@OriginalMember(owner = "client!h", name = "B", descriptor = "()Z")
	@Override
	public boolean method2641() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!vh;Lclient!vh;FLclient!vh;)Lclient!vh;")
	@Override
	public Class7 method2598(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class7 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([Lclient!c;Lclient!ia;[Lclient!aq;I)V")
	@Override
	public void method2605(@OriginalArg(0) Class31[] arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) Class13_Sub1[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method2648().za(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class13_Sub1 local15 = arg2[0];
		Static145.anIntArray250[5] = 0;
		this.method2648().za(this, arg0, arg1, Static145.anIntArray250, -1, arg3);
		local15.anInt557 = Static145.anIntArray250[0];
		local15.anInt556 = Static145.anIntArray250[1];
		local15.anInt555 = Static145.anIntArray250[2];
		local15.anInt559 = Static145.anIntArray250[3];
		local15.anInt558 = Static145.anIntArray250[4];
		local15.aBoolean23 = Static145.anIntArray250[5] != 0;
	}

	@OriginalMember(owner = "client!h", name = "ua", descriptor = "(F)V")
	public native void ua(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!h", name = "p", descriptor = "()Z")
	@Override
	public boolean method2615() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "i", descriptor = "(I)V")
	@Override
	public void method2634(@OriginalArg(0) int arg0) {
		this.anInt3244 = arg0;
		this.aMaArray1 = new ma[this.anInt3244];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3244; local9++) {
			this.aMaArray1[local9] = new ma(this, this.anInt3242, this.anInt3243);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class22 method2640(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2591(@OriginalArg(0) Canvas arg0) {
		@Pc(8) la local8 = (la) this.aClass127_14.method3246((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.ZA(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aCanvas5) {
			this.method2638(arg0);
		}
	}

	@OriginalMember(owner = "client!h", name = "fa", descriptor = "(IIII)V")
	public native void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!iv;Z)V")
	private void method2645(@OriginalArg(0) Class116 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class13_Sub3_Sub1 local15 = (Class13_Sub3_Sub1) arg0.aClass236_1.method5462(); local15 != null; local15 = (Class13_Sub3_Sub1) arg0.aClass236_1.method5465()) {
			Static145.anIntArray249[local1++] = local15.anInt6869;
			Static145.anIntArray249[local1++] = local15.anInt6863;
			Static145.anIntArray249[local1++] = local15.anInt6868;
			Static145.anIntArray251[local3++] = local15.anInt6870;
			Static145.aShortArray42[local7++] = (short) local15.anInt6867;
			Static145.anIntArray247[local5++] = local15.anInt6864;
			if (arg1) {
				Static145.aByteArray38[local9++] = local15.aByte97;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "z", descriptor = "()Lclient!ia;")
	@Override
	public Class106 method2636() {
		return new sa();
	}

	@OriginalMember(owner = "client!h", name = "B", descriptor = "(Lclient!m;II)V")
	private native void B(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2638(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas5 = null;
			this.aLa1 = null;
			this.P(null);
		} else {
			@Pc(10) la local10 = (la) this.aClass127_14.method3246((long) arg0.hashCode());
			this.aCanvas5 = arg0;
			this.aLa1 = local10;
			this.P(local10);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!vh;)V")
	@Override
	public void method2599(@OriginalArg(0) Class7 arg0) {
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "()V")
	@Override
	public void method2579() {
	}

	@OriginalMember(owner = "client!h", name = "k", descriptor = "()Z")
	@Override
	public boolean method2593() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIF)Lclient!ve;")
	@Override
	public Class3_Sub23 method2604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub23_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ne;Z)Lclient!f;")
	@Override
	public Class22 method2590(@OriginalArg(0) Class166 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray385;
		@Pc(5) byte[] local5 = arg0.aByteArray57;
		@Pc(8) int local8 = arg0.anInt4973;
		@Pc(11) int local11 = arg0.anInt4969;
		@Pc(32) Class22 local32;
		if (arg0.aByteArray56 == null) {
			local32 = new xa(this, this.aBa1, local2, local5, 0, arg0.anInt4973, arg0.anInt4973, arg0.anInt4969);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray56;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray385[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new k(this, this.aBa1, local40, 0, arg0.anInt4973, arg0.anInt4973, arg0.anInt4969);
				} else {
					local32 = new n(this, this.aBa1, local40, 0, arg0.anInt4973, arg0.anInt4973, arg0.anInt4969);
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
		local32.ka(arg0.anInt4971, arg0.anInt4970, arg0.anInt4974, arg0.anInt4972);
		return local32;
	}

	@OriginalMember(owner = "client!h", name = "r", descriptor = "()V")
	@Override
	public void method2619() {
	}

	@OriginalMember(owner = "client!h", name = "w", descriptor = "()F")
	public native float w();

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method2575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2648().sa(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.ya();
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void f(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!h", name = "JA", descriptor = "(II)V")
	public native void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!h", name = "o", descriptor = "()Z")
	@Override
	public boolean method2613() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II[I[I)Lclient!ea;")
	@Override
	public Class32 method2622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new ca(this, this.aBa1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V")
	@Override
	public void method2606(@OriginalArg(0) int arg0) {
		this.aMaArray1[arg0].method3779();
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "()I")
	public native int g();

	@OriginalMember(owner = "client!h", name = "FA", descriptor = "()I")
	public native int FA();

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(I)Lclient!l;")
	@Override
	public Class3_Sub27 method2588() {
		@Pc(5) ba local5 = new ba(this, 78643200);
		this.aClass229_25.method5321(local5);
		return local5;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2607(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas5 == arg0) {
			this.method2638(null);
		}
		@Pc(15) la local15 = (la) this.aClass127_14.method3246((long) arg0.hashCode());
		if (local15 != null) {
			local15.method5987();
		}
		local15.method3525();
	}

	@OriginalMember(owner = "client!h", name = "C", descriptor = "()Z")
	@Override
	public boolean method2642() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "K", descriptor = "(IIIIII)V")
	private native void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([Lclient!c;Lclient!iv;Lclient!ia;[Lclient!aq;I)V")
	@Override
	public void method2602(@OriginalArg(0) Class31[] arg0, @OriginalArg(1) Class116 arg1, @OriginalArg(2) Class106 arg2, @OriginalArg(3) Class13_Sub1[] arg3, @OriginalArg(4) int arg4) {
		this.method2645(arg1, true);
		if (arg3 == null) {
			this.method2648().pa(this, arg0, arg2, null, arg4, Static145.anIntArray249, Static145.anIntArray251, Static145.anIntArray247, Static145.aShortArray42, Static145.aByteArray38, arg1.aClass236_1.method5461(), Static145.anIntArray248);
		} else {
			@Pc(28) Class13_Sub1 local28 = arg3[0];
			Static145.anIntArray250[5] = 0;
			this.method2648().pa(this, arg0, arg2, Static145.anIntArray250, arg4, Static145.anIntArray249, Static145.anIntArray251, Static145.anIntArray247, Static145.aShortArray42, Static145.aByteArray38, arg1.aClass236_1.method5461(), Static145.anIntArray248);
			local28.anInt557 = Static145.anIntArray250[0];
			local28.anInt556 = Static145.anIntArray250[1];
			local28.anInt555 = Static145.anIntArray250[2];
			local28.anInt559 = Static145.anIntArray250[3];
			local28.anInt558 = Static145.anIntArray250[4];
			local28.aBoolean23 = Static145.anIntArray250[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) p local98 = (p) arg0[local88];
				local98.method4415(local86, arg2);
				if (local98.aClass209Array2 != null) {
					local86 += local98.aClass209Array2.length * 9;
				}
				if (local98.aClass178Array2 != null) {
					local86 += local98.aClass178Array2.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(FFF)V")
	@Override
	public void method2595(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!h", name = "x", descriptor = "()V")
	@Override
	public void method2633() {
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II[[I[[IIII)Lclient!na;")
	@Override
	public Class64 method2631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new b(this, this.aBa1, arg0, arg1, arg2, arg3, 128, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "W", descriptor = "()I")
	public native int W();

	@OriginalMember(owner = "client!h", name = "s", descriptor = "()V")
	@Override
	protected void method2620() {
		for (@Pc(5) ba local5 = (ba) this.aClass229_25.method5328(); local5 != null; local5 = (ba) this.aClass229_25.method5325()) {
			local5.ka();
		}
		this.aClass229_25.method5326();
		this.I();
	}

	@OriginalMember(owner = "client!h", name = "XA", descriptor = "(IFFFFF)V")
	public native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!h", name = "U", descriptor = "(IIIII)V")
	public native void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!h", name = "xa", descriptor = "()I")
	public native int xa();

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
	@Override
	public void method2569(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(II)I")
	@Override
	public int method2614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)V")
	@Override
	public void method2577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!h", name = "q", descriptor = "()Z")
	@Override
	public boolean method2617() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!iv;)V")
	@Override
	public void method2581(@OriginalArg(0) Class116 arg0) {
		this.method2645(arg0, false);
		this.method2648().S(this, Static145.anIntArray249, Static145.anIntArray251, Static145.anIntArray247, Static145.aShortArray42, arg0.aClass236_1.method5461());
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
	@Override
	public void method2572(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!h", name = "ZA", descriptor = "()V")
	private void method2646() {
		System.gc();
		System.runFinalization();
		Static280.method4133();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ov;[Lclient!ne;Z)Lclient!oa;")
	@Override
	public Class65 method2601(@OriginalArg(0) Class179 arg0, @OriginalArg(1) Class166[] arg1) {
		return new w(this, this.aBa1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!h", name = "v", descriptor = "()Z")
	@Override
	public boolean method2626() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "u", descriptor = "()Z")
	@Override
	public boolean method2624() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!l;)V")
	@Override
	public void method2576(@OriginalArg(0) Class3_Sub27 arg0) {
		this.aBa1 = (ba) arg0;
		this.Y(arg0);
	}

	@OriginalMember(owner = "client!h", name = "EA", descriptor = "(S)Z")
	private boolean method2647(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class62 local9 = super.anInterface7_6.method2131(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.l(arg0, local9.aByte24, local9.aByte27, local9.aBoolean148, local9.aBoolean143, local9.aBoolean147, local9.aByte22, local9.aByte26, local9.aByte28, local9.aShort52, local9.anInt1810, local9.aBoolean145, local9.aBoolean149);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "ia", descriptor = "(III[I)V")
	public native void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!h", name = "da", descriptor = "(IIIII)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!h", name = "i", descriptor = "()Lclient!ia;")
	@Override
	public Class106 method2587() {
		return this.aClass106_1;
	}

	@OriginalMember(owner = "client!h", name = "VA", descriptor = "(I[I[F)V")
	private native void VA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void method2637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.da(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.da(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "IA", descriptor = "(IIII)[I")
	public native int[] IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "D", descriptor = "()Lclient!ma;")
	public ma method2648() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3244; local1++) {
			if (this.aMaArray1[local1].aRunnable2 == Thread.currentThread()) {
				return this.aMaArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!h", name = "I", descriptor = "()V")
	private native void I();

	@OriginalMember(owner = "client!h", name = "O", descriptor = "(IIIII)V")
	protected native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class22 method2627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new k(this, this.aBa1, arg0, arg1, arg2, arg3) : new n(this, this.aBa1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!h", name = "va", descriptor = "()V")
	public native void va();

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIII)Lclient!vh;")
	@Override
	public Class7 method2597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!h", name = "ta", descriptor = "(IIIIIILclient!ea;II)V")
	private native void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class32 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!h", name = "S", descriptor = "()V")
	public native void S();

	@OriginalMember(owner = "client!h", name = "SA", descriptor = "(IIIIII)Z")
	public native boolean SA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!h", name = "m", descriptor = "(Lclient!ia;)V")
	public native void m(@OriginalArg(0) Class106 arg0);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I[Lclient!ve;)V")
	@Override
	public void method2628(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub23[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static145.anIntArray246[local1++] = arg1[local3].method3679();
			Static145.anIntArray246[local1++] = arg1[local3].method3675();
			Static145.anIntArray246[local1++] = arg1[local3].method3678();
			Static145.anIntArray246[local1++] = arg1[local3].method3670();
			Static145.aFloatArray29[local3] = arg1[local3].method3677();
			Static145.anIntArray246[local1++] = arg1[local3].method3674();
		}
		this.VA(arg0, Static145.anIntArray246, Static145.aFloatArray29);
	}

	@OriginalMember(owner = "client!h", name = "GA", descriptor = "(IIII)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "h", descriptor = "()Z")
	@Override
	public boolean method2585() {
		return true;
	}
}
