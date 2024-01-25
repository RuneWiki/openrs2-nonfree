import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class c extends Class167 implements Interface12 {

	@OriginalMember(owner = "client!c", name = "u", descriptor = "Lclient!k;")
	private k aK1;

	@OriginalMember(owner = "client!c", name = "M", descriptor = "Lclient!ca;")
	private ca aCa1;

	@OriginalMember(owner = "client!c", name = "O", descriptor = "I")
	private int anInt697;

	@OriginalMember(owner = "client!c", name = "P", descriptor = "[Lclient!wa;")
	private wa[] aWaArray1;

	@OriginalMember(owner = "client!c", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!c", name = "F", descriptor = "Lclient!ps;")
	private final Class193 aClass193_5 = new Class193();

	@OriginalMember(owner = "client!c", name = "L", descriptor = "I")
	private final int anInt695 = 4096;

	@OriginalMember(owner = "client!c", name = "N", descriptor = "I")
	private final int anInt696 = 4096;

	@OriginalMember(owner = "client!c", name = "J", descriptor = "Lclient!lp;")
	private final Class140 aClass140_6 = new Class140(4);

	@OriginalMember(owner = "client!c", name = "Q", descriptor = "Z")
	private boolean aBoolean38 = false;

	@OriginalMember(owner = "client!c", name = "K", descriptor = "Lclient!n;")
	private Class11 aClass11_1;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;Lclient!dq;)V")
	public c(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) Class51 arg3) {
		super(arg0, arg2);
		try {
			if (!Static41.aBoolean37) {
				if (arg3 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("sw3d");
					Static41.aBoolean37 = Boolean.TRUE;
				} else {
					arg3.method1361(this.getClass());
					Static41.aBoolean37 = Boolean.TRUE;
				}
			}
			if (!Static41.aBoolean37) {
				throw new RuntimeException("");
			}
			this.OA(super.anInterface7_8, 0, 0);
			Static176.method2835(false, true);
			this.aBoolean38 = true;
			this.aClass11_1 = new ja();
			this.method6012(new ja());
			this.method6022(1);
			this.method6000(0);
			if (arg1 != null) {
				this.method5959(arg1);
				this.method6023(arg1);
			}
		} catch (@Pc(95) Throwable local95) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "w", descriptor = "(IIII)V")
	public native void w(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V")
	@Override
	public void method6000(@OriginalArg(0) int arg0) {
		this.aWaArray1[arg0].method6077();
	}

	@OriginalMember(owner = "client!c", name = "s", descriptor = "()F")
	public native float s();

	@OriginalMember(owner = "client!c", name = "S", descriptor = "(IIIII)V")
	protected native void S(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!c", name = "va", descriptor = "(Lclient!n;)V")
	private native void va(@OriginalArg(0) Class11 arg0);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5959(@OriginalArg(0) Canvas arg0) {
		@Pc(8) ca local8 = (ca) this.aClass140_6.method3490((long) arg0.hashCode());
		if (local8 != null) {
			return;
		}
		try {
			@Pc(13) Class local13 = Class.forName("java.awt.Canvas");
			@Pc(23) Method local23 = local13.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local23.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(35) Exception local35) {
		}
		local8 = new ca(this, arg0);
		this.aClass140_6.method3494((long) arg0.hashCode(), local8);
	}

	@OriginalMember(owner = "client!c", name = "da", descriptor = "(IIIIIILclient!i;II)V")
	private native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class14 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIII)Lclient!lo;")
	@Override
	public Class139 method5980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!c", name = "M", descriptor = "(IIIIII)V")
	public native void M(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!c", name = "PA", descriptor = "(FF)V")
	public native void PA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(I)Lclient!w;")
	@Override
	public Class3_Sub26 method6004(@OriginalArg(0) int arg0) {
		@Pc(5) k local5 = new k(this, arg0);
		this.aClass193_5.method4527(local5);
		return local5;
	}

	@OriginalMember(owner = "client!c", name = "ga", descriptor = "(Lclient!ca;)V")
	private native void ga(@OriginalArg(0) ca arg0);

	@OriginalMember(owner = "client!c", name = "o", descriptor = "()Lclient!n;")
	@Override
	public Class11 method5989() {
		return this.aClass11_1;
	}

	@OriginalMember(owner = "client!c", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method5958();
		if (this.nativeid != 0L) {
			Static115.method1851(this);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[[I[[IIII)Lclient!o;")
	@Override
	public Class55 method6017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new da(this, this.aK1, arg0, arg1, arg2, arg3, 128, arg4, arg5);
	}

	@OriginalMember(owner = "client!c", name = "H", descriptor = "()V")
	public native void H();

	@OriginalMember(owner = "client!c", name = "KA", descriptor = "(IIII)V")
	public native void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "z", descriptor = "()Z")
	@Override
	public boolean method6024() {
		return false;
	}

	@OriginalMember(owner = "client!c", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!c", name = "u", descriptor = "()V")
	@Override
	public void method5994() {
		if (this.aCa1 == null) {
			throw new IllegalStateException("off");
		}
		this.aCa1.method815();
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(IIIII)V")
	public native void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!c", name = "la", descriptor = "(IFFFFF)V")
	public native void la(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!c", name = "ha", descriptor = "(III)V")
	public native void ha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "h", descriptor = "(II)V")
	public native void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IIII)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "k", descriptor = "()Z")
	@Override
	public boolean method5978() {
		return true;
	}

	@OriginalMember(owner = "client!c", name = "ba", descriptor = "(I)V")
	private native void ba(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "A", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void A(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!c", name = "f", descriptor = "(I)V")
	@Override
	public void method6007(@OriginalArg(0) int arg0) {
		Static115.method1850();
		this.ba(arg0);
		for (@Pc(10) k local10 = (k) this.aClass193_5.method4519(); local10 != null; local10 = (k) this.aClass193_5.method4525()) {
			local10.d();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([IIIII)Lclient!aa;")
	@Override
	public Class2 method6021(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new na(this, this.aK1, arg0, 0, arg1, arg2, arg3) : new q(this, this.aK1, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new na(this, this.aK1, arg0, 0, arg1, arg2, arg3) : new q(this, this.aK1, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!c", name = "ZA", descriptor = "()V")
	private void method803() {
		System.gc();
		System.runFinalization();
		Static115.method1850();
	}

	@OriginalMember(owner = "client!c", name = "K", descriptor = "(I)V")
	public native void K(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "ua", descriptor = "(IIIIII[BII)V")
	public native void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!c", name = "g", descriptor = "()Z")
	@Override
	public boolean method5971() {
		return false;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method5997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.LA(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!c", name = "C", descriptor = "()Lclient!wa;")
	public wa method804() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt697; local1++) {
			if (this.aWaArray1[local1].aRunnable2 == Thread.currentThread()) {
				return this.aWaArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!mn;Z)Lclient!aa;")
	@Override
	public Class2 method5993(@OriginalArg(0) Class154 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray287;
		@Pc(5) byte[] local5 = arg0.aByteArray73;
		@Pc(8) int local8 = arg0.anInt4358;
		@Pc(11) int local11 = arg0.anInt4359;
		@Pc(32) Class2 local32;
		if (arg0.aByteArray74 == null) {
			local32 = new va(this, this.aK1, local2, local5, 0, arg0.anInt4358, arg0.anInt4358, arg0.anInt4359);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray74;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray287[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new na(this, this.aK1, local40, 0, arg0.anInt4358, arg0.anInt4358, arg0.anInt4359);
				} else {
					local32 = new q(this, this.aK1, local40, 0, arg0.anInt4358, arg0.anInt4358, arg0.anInt4359);
				}
			} else {
				for (@Pc(47) int local47 = 0; local47 < local11; local47++) {
					local52 = local47 * local8;
					for (local54 = 0; local54 < local8; local54++) {
						local40[local52 + local54] = local2[local5[local52 + local54] & 0xFF] | local43[local52 + local54] << 24;
					}
				}
				local32 = new na(this, this.aK1, local40, 0, local8, local8, local11);
			}
		}
		local32.l(arg0.anInt4356, arg0.anInt4354, arg0.anInt4357, arg0.anInt4355);
		return local32;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)I")
	@Override
	public int method6006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!c", name = "ja", descriptor = "()V")
	private native void ja();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method804().U(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!c", name = "i", descriptor = "()Z")
	@Override
	public boolean method5977() {
		return false;
	}

	@OriginalMember(owner = "client!c", name = "GA", descriptor = "(ILclient!i;II)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V")
	@Override
	public void method6022(@OriginalArg(0) int arg0) {
		this.anInt697 = arg0;
		this.aWaArray1 = new wa[this.anInt697];
		for (@Pc(9) int local9 = 0; local9 < this.anInt697; local9++) {
			this.aWaArray1[local9] = new wa(this, this.anInt696, this.anInt695);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
	@Override
	public int method5967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[I[I)Lclient!i;")
	@Override
	public Class14 method5964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new g(this, this.aK1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!fq;Z)V")
	private void method805(@OriginalArg(0) Class77 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class23_Sub1_Sub2 local15 = (Class23_Sub1_Sub2) arg0.aClass222_1.method5210(); local15 != null; local15 = (Class23_Sub1_Sub2) arg0.aClass222_1.method5212()) {
			Static41.anIntArray37[local1++] = local15.anInt4414;
			Static41.anIntArray37[local1++] = local15.anInt4417;
			Static41.anIntArray37[local1++] = local15.anInt4421;
			Static41.anIntArray36[local3++] = local15.anInt4420;
			Static41.aShortArray9[local7++] = (short) local15.anInt4416;
			Static41.anIntArray39[local5++] = local15.anInt4413;
			if (arg1) {
				Static41.aByteArray18[local9++] = local15.aByte50;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "I", descriptor = "()F")
	public native float I();

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
	@Override
	public void method5983(@OriginalArg(0) int arg0) {
		this.aWaArray1[arg0].method6078();
	}

	@OriginalMember(owner = "client!c", name = "f", descriptor = "()Z")
	@Override
	public boolean method5969() {
		return true;
	}

	@OriginalMember(owner = "client!c", name = "BA", descriptor = "(IIIII)V")
	public native void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!c", name = "r", descriptor = "()V")
	public native void r();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5998(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5970(@OriginalArg(0) Canvas arg0) {
		@Pc(8) ca local8 = (ca) this.aClass140_6.method3490((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.b(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aCa1.aCanvas1) {
			this.method6023(arg0);
		}
	}

	@OriginalMember(owner = "client!c", name = "w", descriptor = "()V")
	@Override
	public void method6008() {
	}

	@OriginalMember(owner = "client!c", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!c", name = "XA", descriptor = "(III[I)V")
	public native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	@Override
	public void method5953(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!c", name = "h", descriptor = "()Lclient!n;")
	@Override
	public Class11 method5975() {
		return new ja();
	}

	@OriginalMember(owner = "client!c", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!c", name = "d", descriptor = "()Z")
	@Override
	public boolean method5962() {
		return true;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!fq;)V")
	@Override
	public void method5976(@OriginalArg(0) Class77 arg0) {
		this.method805(arg0, false);
		this.method804().ha(this, Static41.anIntArray37, Static41.anIntArray36, Static41.anIntArray39, Static41.aShortArray9, arg0.aClass222_1.method5208());
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!lo;)V")
	@Override
	public void method5982(@OriginalArg(0) Class139 arg0) {
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!w;)V")
	@Override
	public void method5965(@OriginalArg(0) Class3_Sub26 arg0) {
		this.aK1 = (k) arg0;
		this.ta(arg0);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
	@Override
	public void method5955(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!c", name = "x", descriptor = "()V")
	@Override
	protected void method6014() {
		if (this.aBoolean36) {
			return;
		}
		this.aWaArray1 = null;
		this.aCa1 = null;
		this.aK1 = null;
		this.aClass11_1 = null;
		this.aClass140_6.method3488();
		for (@Pc(25) k local25 = (k) this.aClass193_5.method4519(); local25 != null; local25 = (k) this.aClass193_5.method4525()) {
			local25.KA();
		}
		this.aClass193_5.method4524();
		this.ja();
		if (this.aBoolean38) {
			Static80.method1439(false, true);
			this.aBoolean38 = false;
		}
		this.method803();
		Static115.method1849();
		this.aBoolean36 = true;
	}

	@OriginalMember(owner = "client!c", name = "A", descriptor = "()Z")
	@Override
	public boolean method6027() {
		return true;
	}

	@OriginalMember(owner = "client!c", name = "TA", descriptor = "(IIIIII)Z")
	public native boolean TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6002() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!c", name = "OA", descriptor = "(Lclient!l;II)V")
	private native void OA(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([Lclient!ka;Lclient!fq;Lclient!n;[Lclient!st;I)V")
	@Override
	public void method5950(@OriginalArg(0) Class108[] arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(3) Class23_Sub6[] arg3, @OriginalArg(4) int arg4) {
		this.method805(arg1, true);
		if (arg3 == null) {
			this.method804().a(this, arg0, arg2, null, arg4, Static41.anIntArray37, Static41.anIntArray36, Static41.anIntArray39, Static41.aShortArray9, Static41.aByteArray18, arg1.aClass222_1.method5208(), Static41.anIntArray38);
		} else {
			@Pc(28) Class23_Sub6 local28 = arg3[0];
			Static41.anIntArray35[5] = 0;
			this.method804().a(this, arg0, arg2, Static41.anIntArray35, arg4, Static41.anIntArray37, Static41.anIntArray36, Static41.anIntArray39, Static41.aShortArray9, Static41.aByteArray18, arg1.aClass222_1.method5208(), Static41.anIntArray38);
			local28.anInt6475 = Static41.anIntArray35[0];
			local28.anInt6476 = Static41.anIntArray35[1];
			local28.anInt6478 = Static41.anIntArray35[2];
			local28.anInt6474 = Static41.anIntArray35[3];
			local28.anInt6477 = Static41.anIntArray35[4];
			local28.aBoolean442 = Static41.anIntArray35[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) fa local98 = (fa) arg0[local88];
				local98.method1764(local86, arg2);
				if (local98.aClass141Array1 != null) {
					local86 += local98.aClass141Array1.length * 9;
				}
				if (local98.aClass95Array1 != null) {
					local86 += local98.aClass95Array1.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "k", descriptor = "(S)Z")
	private boolean method806(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class105 local9 = super.anInterface7_8.method4417(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.R(arg0, local9.aByte39, local9.aByte36, local9.aBoolean235, local9.aBoolean231, local9.aBoolean233, local9.aByte40, local9.aByte38, local9.aByte37, local9.aShort40, local9.anInt3012, local9.aBoolean228, local9.aBoolean230);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([Lclient!ka;Lclient!n;[Lclient!st;I)V")
	@Override
	public void method6015(@OriginalArg(0) Class108[] arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) Class23_Sub6[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method804().T(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class23_Sub6 local15 = arg2[0];
		Static41.anIntArray35[5] = 0;
		this.method804().T(this, arg0, arg1, Static41.anIntArray35, -1, arg3);
		local15.anInt6475 = Static41.anIntArray35[0];
		local15.anInt6476 = Static41.anIntArray35[1];
		local15.anInt6478 = Static41.anIntArray35[2];
		local15.anInt6474 = Static41.anIntArray35[3];
		local15.anInt6477 = Static41.anIntArray35[4];
		local15.aBoolean442 = Static41.anIntArray35[5] != 0;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method5996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.d(arg0, arg1, arg2, arg4, arg5);
		this.d(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.BA(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.BA(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!c", name = "l", descriptor = "()I")
	@Override
	public int method5986() {
		return 4;
	}

	@OriginalMember(owner = "client!c", name = "wa", descriptor = "(S)Z")
	private boolean method807(@OriginalArg(0) short arg0) {
		@Pc(2) Interface7 local2 = super.anInterface7_8;
		synchronized (super.anInterface7_8) {
			if (!super.anInterface7_8.method4420(arg0)) {
				return false;
			}
			@Pc(22) Class105 local22 = super.anInterface7_8.method4417(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(46) int[] local46;
			if (local22.aBoolean231 && local22.aBoolean235) {
				local46 = super.anInterface7_8.method4416(arg0, true, 128, 128, 0.7F);
			} else {
				local46 = super.anInterface7_8.method4418(arg0, 128, 128, 0.7F);
			}
			this.A(arg0, local22.aByte39, local22.aByte36, local22.aBoolean235, local22.aBoolean231, local22.aBoolean233, local22.aByte40, local22.aByte38, local22.aByte37, local22.aShort40, local22.anInt3012, local22.aBoolean228, local22.aBoolean230, local46);
			return true;
		}
	}

	@OriginalMember(owner = "client!c", name = "N", descriptor = "(IIII)[I")
	public native int[] N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)V")
	@Override
	public void method6011(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIF)Lclient!be;")
	@Override
	public Class3_Sub7 method6025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub7_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIZ)Lclient!aa;")
	@Override
	public Class2 method5974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new na(this, this.aK1, arg0, arg1, arg2, arg3) : new q(this, this.aK1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!c", name = "q", descriptor = "()V")
	@Override
	public void method5991() {
	}

	@OriginalMember(owner = "client!c", name = "p", descriptor = "()Z")
	@Override
	public boolean method5990() {
		return true;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIILclient!i;II)V")
	@Override
	public void method5954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class14 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.da(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!c", name = "sa", descriptor = "()I")
	public native int sa();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method6012(@OriginalArg(0) Class11 arg0) {
		this.va(arg0);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5968(@OriginalArg(0) Canvas arg0) {
		if (this.aCa1.aCanvas1 == arg0) {
			this.method6023(null);
		}
		@Pc(16) ca local16 = (ca) this.aClass140_6.method3490((long) arg0.hashCode());
		if (local16 != null) {
			local16.method6288();
			local16.method816();
		}
	}

	@OriginalMember(owner = "client!c", name = "y", descriptor = "()Z")
	@Override
	public boolean method6019() {
		return false;
	}

	@OriginalMember(owner = "client!c", name = "Z", descriptor = "()I")
	public native int Z();

	@OriginalMember(owner = "client!c", name = "R", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void R(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6023(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCa1 = null;
			this.ga(null);
		} else {
			@Pc(10) ca local10 = (ca) this.aClass140_6.method3490((long) arg0.hashCode());
			this.aCa1 = local10;
			this.ga(local10);
		}
	}

	@OriginalMember(owner = "client!c", name = "t", descriptor = "()Z")
	@Override
	public boolean method5992() {
		return false;
	}

	@OriginalMember(owner = "client!c", name = "IA", descriptor = "(IIII)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "MA", descriptor = "(F)V")
	public native void MA(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!c", name = "q", descriptor = "(IIII)V")
	public native void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "v", descriptor = "()V")
	@Override
	public void method6005() {
	}

	@OriginalMember(owner = "client!c", name = "ta", descriptor = "(Lclient!w;)V")
	private native void ta(@OriginalArg(0) Class3_Sub26 arg0);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!nd;IIII)Lclient!ka;")
	@Override
	public Class108 method5984(@OriginalArg(0) Class160 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new fa(this, this.aK1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!c", name = "l", descriptor = "(I)V")
	public native void l(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "F", descriptor = "(I[I[F)V")
	private native void F(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!c", name = "e", descriptor = "()Z")
	@Override
	public boolean method5963() {
		return true;
	}

	@OriginalMember(owner = "client!c", name = "xa", descriptor = "()I")
	public native int xa();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "()Z")
	@Override
	public boolean method5949() {
		return true;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ju;[Lclient!mn;Z)Lclient!ba;")
	@Override
	public Class18 method5995(@OriginalArg(0) Class124 arg0, @OriginalArg(1) Class154[] arg1) {
		return new b(this, this.aK1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ka;Lclient!fq;Lclient!n;Lclient!st;I)V")
	@Override
	public void method5999(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(3) Class23_Sub6 arg3) {
		this.method805(arg1, true);
		if (arg3 == null) {
			this.method804().FA(this, arg0, arg2, null, 0, Static41.anIntArray37, Static41.anIntArray36, Static41.anIntArray39, Static41.aShortArray9, Static41.aByteArray18, arg1.aClass222_1.method5208(), Static41.anIntArray38);
		} else {
			Static41.anIntArray35[5] = 0;
			this.method804().FA(this, arg0, arg2, Static41.anIntArray35, 0, Static41.anIntArray37, Static41.anIntArray36, Static41.anIntArray39, Static41.aShortArray9, Static41.aByteArray18, arg1.aClass222_1.method5208(), Static41.anIntArray38);
			arg3.anInt6475 = Static41.anIntArray35[0];
			arg3.anInt6476 = Static41.anIntArray35[1];
			arg3.anInt6478 = Static41.anIntArray35[2];
			arg3.anInt6474 = Static41.anIntArray35[3];
			arg3.anInt6477 = Static41.anIntArray35[4];
			arg3.aBoolean442 = Static41.anIntArray35[5] != 0;
		}
		@Pc(83) fa local83 = (fa) arg0;
		local83.method1764(0, arg2);
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "()Z")
	@Override
	public boolean method5961() {
		return true;
	}

	@OriginalMember(owner = "client!c", name = "LA", descriptor = "(IIIIII)V")
	private native void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(Z)V")
	@Override
	public void method6020(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!lo;Lclient!lo;FLclient!lo;)Lclient!lo;")
	@Override
	public Class139 method5973(@OriginalArg(0) Class139 arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class139 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "()V")
	@Override
	public void method5957() {
	}

	@OriginalMember(owner = "client!c", name = "n", descriptor = "()Z")
	@Override
	public boolean method5988() {
		return false;
	}

	@OriginalMember(owner = "client!c", name = "j", descriptor = "()Ljava/lang/Object;")
	private Object method808() {
		return new d(this);
	}

	@OriginalMember(owner = "client!c", name = "B", descriptor = "()Z")
	@Override
	public boolean method6028() {
		return false;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[Lclient!be;)V")
	@Override
	public void method5985(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static41.anIntArray40[local1++] = arg1[local3].method2483();
			Static41.anIntArray40[local1++] = arg1[local3].method2476();
			Static41.anIntArray40[local1++] = arg1[local3].method2481();
			Static41.anIntArray40[local1++] = arg1[local3].method2478();
			Static41.aFloatArray3[local3] = arg1[local3].method2479();
			Static41.anIntArray40[local1++] = arg1[local3].method2480();
		}
		this.F(arg0, Static41.anIntArray40, Static41.aFloatArray3);
	}

	@OriginalMember(owner = "client!c", name = "p", descriptor = "([I)V")
	public native void p(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6013(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCa1 == null) {
			throw new IllegalStateException("off");
		}
		this.aCa1.method817(arg0, arg1);
	}

	@OriginalMember(owner = "client!c", name = "m", descriptor = "()V")
	@Override
	public void method5987() {
	}
}
