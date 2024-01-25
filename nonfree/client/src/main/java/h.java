import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class h extends Class26 implements Interface3 {

	@OriginalMember(owner = "client!h", name = "w", descriptor = "Lclient!ba;")
	private ba aBa1;

	@OriginalMember(owner = "client!h", name = "K", descriptor = "Lclient!la;")
	private la aLa1;

	@OriginalMember(owner = "client!h", name = "M", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!h", name = "N", descriptor = "[Lclient!ma;")
	private ma[] aMaArray1;

	@OriginalMember(owner = "client!h", name = "O", descriptor = "I")
	private int anInt2768;

	@OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!h", name = "u", descriptor = "Lclient!wl;")
	private final Class265 aClass265_23 = new Class265();

	@OriginalMember(owner = "client!h", name = "I", descriptor = "I")
	private final int anInt2767 = 4096;

	@OriginalMember(owner = "client!h", name = "H", descriptor = "I")
	private final int anInt2766 = 4096;

	@OriginalMember(owner = "client!h", name = "G", descriptor = "Lclient!ub;")
	private final Class240 aClass240_10 = new Class240(4);

	@OriginalMember(owner = "client!h", name = "L", descriptor = "Lclient!ia;")
	private final Class102 aClass102_2;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!m;Lclient!js;)V")
	public h(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface8 arg2, @OriginalArg(3) Class131 arg3) {
		super(arg0, arg2);
		try {
			if (!Static144.aBoolean244) {
				if (arg3 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("sw3d");
					Static144.aBoolean244 = Boolean.TRUE;
				} else {
					arg3.method3071(this.getClass());
					Static144.aBoolean244 = Boolean.TRUE;
				}
			}
			if (!Static144.aBoolean244) {
				throw new RuntimeException("");
			}
			this.B(super.anInterface8_5, 0, 0);
			if (arg1 != null) {
				this.method2221(arg1);
				this.method2229(arg1);
			}
			this.aClass102_2 = new sa();
			this.m(new sa());
			this.method2234(1);
			this.method2256(0);
		} catch (@Pc(82) Throwable local82) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "Y", descriptor = "(Lclient!l;)V")
	private native void Y(@OriginalArg(0) Class2_Sub3 arg0);

	@OriginalMember(owner = "client!h", name = "m", descriptor = "()Z")
	@Override
	public boolean method2261() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(Z)V")
	@Override
	public void method2255(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)I")
	@Override
	public int method2285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!h", name = "NA", descriptor = "(IIIIII)V")
	public native void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!h", name = "D", descriptor = "()Lclient!ma;")
	public ma method2122() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2768; local1++) {
			if (this.aMaArray1[local1].aRunnable2 == Thread.currentThread()) {
				return this.aMaArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!h", name = "u", descriptor = "()Z")
	@Override
	public boolean method2276() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V")
	@Override
	public void method2253(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!h", name = "z", descriptor = "()Lclient!ia;")
	@Override
	public Class102 method2286() {
		return new sa();
	}

	@OriginalMember(owner = "client!h", name = "XA", descriptor = "(IFFFFF)V")
	public native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!h", name = "B", descriptor = "()Z")
	@Override
	public boolean method2290() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "EA", descriptor = "(S)Z")
	private boolean method2123(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class178 local9 = super.anInterface8_5.method3836(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.l(arg0, local9.aByte57, local9.aByte54, local9.aBoolean435, local9.aBoolean436, local9.aBoolean439, local9.aByte56, local9.aByte55, local9.aByte59, local9.aShort60, local9.anInt5078, local9.aBoolean434, local9.aBoolean437);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II[I[I)Lclient!ea;")
	@Override
	public Class14 method2232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new ca(this, this.aBa1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!h", name = "M", descriptor = "(I)V")
	public native void M(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!h", name = "GA", descriptor = "(IIII)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "j", descriptor = "()Z")
	@Override
	public boolean method2240() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "SA", descriptor = "(IIIIII)Z")
	public native boolean SA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	@Override
	public void method2234(@OriginalArg(0) int arg0) {
		this.anInt2768 = arg0;
		this.aMaArray1 = new ma[this.anInt2768];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2768; local9++) {
			this.aMaArray1[local9] = new ma(this, this.anInt2767, this.anInt2766);
		}
	}

	@OriginalMember(owner = "client!h", name = "B", descriptor = "(Lclient!m;II)V")
	private native void B(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!h", name = "b", descriptor = "()Lclient!ia;")
	@Override
	public Class102 method2223() {
		return this.aClass102_2;
	}

	@OriginalMember(owner = "client!h", name = "xa", descriptor = "()I")
	public native int xa();

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method2217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2122().sa(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!h", name = "q", descriptor = "()V")
	@Override
	protected void method2269() {
		for (@Pc(5) ba local5 = (ba) this.aClass265_23.method6005(); local5 != null; local5 = (ba) this.aClass265_23.method6001()) {
			local5.ka();
		}
		this.aClass265_23.method6003();
		this.I();
	}

	@OriginalMember(owner = "client!h", name = "va", descriptor = "()V")
	public native void va();

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2287(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas4 == arg0) {
			this.method2229(null);
		}
		@Pc(15) la local15 = (la) this.aClass240_10.method5439((long) arg0.hashCode());
		if (local15 != null) {
			local15.method6072();
		}
		local15.method3361();
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(IIIIII)Lclient!to;")
	@Override
	public Class21 method2289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!h", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!h", name = "da", descriptor = "(IIIII)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!h", name = "f", descriptor = "()Z")
	@Override
	public boolean method2228() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method2260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.K(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "aa", descriptor = "(IIIIII[BII)V")
	public native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!h", name = "r", descriptor = "()V")
	@Override
	public void method2271() {
	}

	@OriginalMember(owner = "client!h", name = "ta", descriptor = "(IIIIIILclient!ea;II)V")
	private native void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class14 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!re;[Lclient!fq;Z)Lclient!oa;")
	@Override
	public Class56 method2231(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class89[] arg1) {
		return new w(this, this.aBa1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "()Z")
	@Override
	public boolean method2225() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "u", descriptor = "([I)V")
	public native void u(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!h", name = "ZA", descriptor = "()V")
	private void method2124() {
		System.gc();
		System.runFinalization();
		Static234.method3564();
	}

	@OriginalMember(owner = "client!h", name = "W", descriptor = "()I")
	public native int W();

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!to;Lclient!to;FLclient!to;)Lclient!to;")
	@Override
	public Class21 method2251(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class21 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!h", name = "ja", descriptor = "(I)V")
	private native void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)V")
	@Override
	public void method2249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!c;Lclient!pm;Lclient!ia;Lclient!fo;I)V")
	@Override
	public void method2218(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) Class102 arg2, @OriginalArg(3) Class38_Sub4 arg3) {
		this.method2125(arg1, true);
		if (arg3 == null) {
			this.method2122().f(this, arg0, arg2, null, 0, Static144.anIntArray159, Static144.anIntArray157, Static144.anIntArray158, Static144.aShortArray30, Static144.aByteArray74, arg1.aClass114_1.method2572(), Static144.anIntArray155);
		} else {
			Static144.anIntArray154[5] = 0;
			this.method2122().f(this, arg0, arg2, Static144.anIntArray154, 0, Static144.anIntArray159, Static144.anIntArray157, Static144.anIntArray158, Static144.aShortArray30, Static144.aByteArray74, arg1.aClass114_1.method2572(), Static144.anIntArray155);
			arg3.anInt2397 = Static144.anIntArray154[0];
			arg3.anInt2399 = Static144.anIntArray154[1];
			arg3.anInt2401 = Static144.anIntArray154[2];
			arg3.anInt2400 = Static144.anIntArray154[3];
			arg3.anInt2398 = Static144.anIntArray154[4];
			arg3.aBoolean201 = Static144.anIntArray154[5] != 0;
		}
		@Pc(83) p local83 = (p) arg0;
		local83.method4254(0, arg2);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([Lclient!c;Lclient!pm;Lclient!ia;[Lclient!fo;I)V")
	@Override
	public void method2241(@OriginalArg(0) Class32[] arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) Class102 arg2, @OriginalArg(3) Class38_Sub4[] arg3, @OriginalArg(4) int arg4) {
		this.method2125(arg1, true);
		if (arg3 == null) {
			this.method2122().pa(this, arg0, arg2, null, arg4, Static144.anIntArray159, Static144.anIntArray157, Static144.anIntArray158, Static144.aShortArray30, Static144.aByteArray74, arg1.aClass114_1.method2572(), Static144.anIntArray155);
		} else {
			@Pc(28) Class38_Sub4 local28 = arg3[0];
			Static144.anIntArray154[5] = 0;
			this.method2122().pa(this, arg0, arg2, Static144.anIntArray154, arg4, Static144.anIntArray159, Static144.anIntArray157, Static144.anIntArray158, Static144.aShortArray30, Static144.aByteArray74, arg1.aClass114_1.method2572(), Static144.anIntArray155);
			local28.anInt2397 = Static144.anIntArray154[0];
			local28.anInt2399 = Static144.anIntArray154[1];
			local28.anInt2401 = Static144.anIntArray154[2];
			local28.anInt2400 = Static144.anIntArray154[3];
			local28.anInt2398 = Static144.anIntArray154[4];
			local28.aBoolean201 = Static144.anIntArray154[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) p local98 = (p) arg0[local88];
				local98.method4254(local86, arg2);
				if (local98.aClass202Array2 != null) {
					local86 += local98.aClass202Array2.length * 9;
				}
				if (local98.aClass17Array2 != null) {
					local86 += local98.aClass17Array2.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "K", descriptor = "(IIIIII)V")
	private native void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!wp;IIII)Lclient!c;")
	@Override
	public Class32 method2227(@OriginalArg(0) Class266 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new p(this, this.aBa1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2229(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas4 = null;
			this.aLa1 = null;
			this.P(null);
		} else {
			@Pc(10) la local10 = (la) this.aClass240_10.method5439((long) arg0.hashCode());
			this.aCanvas4 = arg0;
			this.aLa1 = local10;
			this.P(local10);
		}
	}

	@OriginalMember(owner = "client!h", name = "Z", descriptor = "(IIII)V")
	public native void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "p", descriptor = "()V")
	@Override
	public void method2268() {
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!to;)V")
	@Override
	public void method2283(@OriginalArg(0) Class21 arg0) {
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
	@Override
	public void method2256(@OriginalArg(0) int arg0) {
		this.aMaArray1[arg0].method3577();
	}

	@OriginalMember(owner = "client!h", name = "t", descriptor = "()Z")
	@Override
	public boolean method2273() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "()I")
	public native int g();

	@OriginalMember(owner = "client!h", name = "d", descriptor = "()I")
	public native int d();

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class76 method2257(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
	@Override
	public void method2250(@OriginalArg(0) int arg0) {
		Static234.method3564();
		this.ja(arg0);
		for (@Pc(10) ba local10 = (ba) this.aClass265_23.method6005(); local10 != null; local10 = (ba) this.aClass265_23.method6001()) {
			local10.KA();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2221(@OriginalArg(0) Canvas arg0) {
		@Pc(8) la local8 = (la) this.aClass240_10.method5439((long) arg0.hashCode());
		if (local8 == null) {
			local8 = new la(this, arg0);
			this.aClass240_10.method5430((long) arg0.hashCode(), local8);
		}
	}

	@OriginalMember(owner = "client!h", name = "C", descriptor = "()V")
	@Override
	public void method2292() {
	}

	@OriginalMember(owner = "client!h", name = "x", descriptor = "()I")
	@Override
	public int method2281() {
		return 4;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II[[I[[IIII)Lclient!na;")
	@Override
	public Class106 method2280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new b(this, this.aBa1, arg0, arg1, arg2, arg3, 128, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void f(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!fq;Z)Lclient!f;")
	@Override
	public Class76 method2230(@OriginalArg(0) Class89 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray139;
		@Pc(5) byte[] local5 = arg0.aByteArray66;
		@Pc(8) int local8 = arg0.anInt2413;
		@Pc(11) int local11 = arg0.anInt2412;
		@Pc(32) Class76 local32;
		if (arg0.aByteArray65 == null) {
			local32 = new xa(this, this.aBa1, local2, local5, 0, arg0.anInt2413, arg0.anInt2413, arg0.anInt2412);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray65;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray139[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new k(this, this.aBa1, local40, 0, arg0.anInt2413, arg0.anInt2413, arg0.anInt2412);
				} else {
					local32 = new n(this, this.aBa1, local40, 0, arg0.anInt2413, arg0.anInt2413, arg0.anInt2412);
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
		local32.ka(arg0.anInt2409, arg0.anInt2410, arg0.anInt2411, arg0.anInt2408);
		return local32;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2264(@OriginalArg(0) Canvas arg0) {
		@Pc(8) la local8 = (la) this.aClass240_10.method5439((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.ZA(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aCanvas4) {
			this.method2229(arg0);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I[Lclient!or;)V")
	@Override
	public void method2265(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static144.anIntArray156[local1++] = arg1[local3].method2991();
			Static144.anIntArray156[local1++] = arg1[local3].method2996();
			Static144.anIntArray156[local1++] = arg1[local3].method2997();
			Static144.anIntArray156[local1++] = arg1[local3].method2992();
			Static144.aFloatArray19[local3] = arg1[local3].method2994();
			Static144.anIntArray156[local1++] = arg1[local3].method2993();
		}
		this.VA(arg0, Static144.anIntArray156, Static144.aFloatArray19);
	}

	@OriginalMember(owner = "client!h", name = "l", descriptor = "()Z")
	@Override
	public boolean method2246() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method2233(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			@Pc(6) Rectangle local6 = arg0[local1];
			if (local6.width > 0 && local6.height > 0) {
				this.aLa1.xa(local6.x, local6.y, local6.width, local6.height);
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)I")
	@Override
	public int method2259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!pm;Z)V")
	private void method2125(@OriginalArg(0) Class192 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class38_Sub2_Sub1 local15 = (Class38_Sub2_Sub1) arg0.aClass114_1.method2570(); local15 != null; local15 = (Class38_Sub2_Sub1) arg0.aClass114_1.method2569()) {
			Static144.anIntArray159[local1++] = local15.anInt1739;
			Static144.anIntArray159[local1++] = local15.anInt1737;
			Static144.anIntArray159[local1++] = local15.anInt1734;
			Static144.anIntArray157[local3++] = local15.anInt1735;
			Static144.aShortArray30[local7++] = (short) local15.anInt1736;
			Static144.anIntArray158[local5++] = local15.anInt1738;
			if (arg1) {
				Static144.aByteArray74[local9++] = local15.aByte14;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "y", descriptor = "()V")
	@Override
	public void method2284() {
	}

	@OriginalMember(owner = "client!h", name = "JA", descriptor = "(II)V")
	public native void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!h", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void l(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!pm;)V")
	@Override
	public void method2252(@OriginalArg(0) Class192 arg0) {
		this.method2125(arg0, false);
		this.method2122().S(this, Static144.anIntArray159, Static144.anIntArray157, Static144.anIntArray158, Static144.aShortArray30, arg0.aClass114_1.method2572());
	}

	@OriginalMember(owner = "client!h", name = "fa", descriptor = "(IIII)V")
	public native void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.ya();
	}

	@OriginalMember(owner = "client!h", name = "IA", descriptor = "(IIII)[I")
	public native int[] IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "i", descriptor = "()V")
	@Override
	public void method2239() {
	}

	@OriginalMember(owner = "client!h", name = "la", descriptor = "()F")
	public native float la();

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method2247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.da(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.da(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "o", descriptor = "(FF)V")
	public native void o(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!h", name = "S", descriptor = "()V")
	public native void S();

	@OriginalMember(owner = "client!h", name = "o", descriptor = "()Z")
	@Override
	public boolean method2267() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "U", descriptor = "(IIIII)V")
	public native void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!h", name = "ba", descriptor = "(IIII)V")
	public native void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "I", descriptor = "()V")
	private native void I();

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
	@Override
	public void method2248(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
	@Override
	public void method2235(@OriginalArg(0) int arg0) {
		this.aMaArray1[arg0].method3576();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([Lclient!c;Lclient!ia;[Lclient!fo;I)V")
	@Override
	public void method2291(@OriginalArg(0) Class32[] arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) Class38_Sub4[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method2122().za(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class38_Sub4 local15 = arg2[0];
		Static144.anIntArray154[5] = 0;
		this.method2122().za(this, arg0, arg1, Static144.anIntArray154, -1, arg3);
		local15.anInt2397 = Static144.anIntArray154[0];
		local15.anInt2399 = Static144.anIntArray154[1];
		local15.anInt2401 = Static144.anIntArray154[2];
		local15.anInt2400 = Static144.anIntArray154[3];
		local15.anInt2398 = Static144.anIntArray154[4];
		local15.aBoolean201 = Static144.anIntArray154[5] != 0;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "()Z")
	@Override
	public boolean method2224() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(I)Lclient!l;")
	@Override
	public Class2_Sub3 method2242() {
		@Pc(5) ba local5 = new ba(this, 78643200);
		this.aClass265_23.method5999(local5);
		return local5;
	}

	@OriginalMember(owner = "client!h", name = "n", descriptor = "()Z")
	@Override
	public boolean method2263() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "pa", descriptor = "(IIII)V")
	public native void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "j", descriptor = "(ILclient!ea;II)V")
	public native void j(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V")
	@Override
	public void method2270(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!h", name = "m", descriptor = "(Lclient!ia;)V")
	public native void m(@OriginalArg(0) Class102 arg0);

	@OriginalMember(owner = "client!h", name = "h", descriptor = "()Z")
	@Override
	public boolean method2238() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "w", descriptor = "()F")
	public native float w();

	@OriginalMember(owner = "client!h", name = "FA", descriptor = "()I")
	public native int FA();

	@OriginalMember(owner = "client!h", name = "MA", descriptor = "(S)Z")
	private boolean method2126(@OriginalArg(0) short arg0) {
		@Pc(2) Interface8 local2 = super.anInterface8_5;
		synchronized (super.anInterface8_5) {
			if (!super.anInterface8_5.method3835(arg0)) {
				return false;
			}
			@Pc(22) Class178 local22 = super.anInterface8_5.method3836(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(46) int[] local46;
			if (local22.aBoolean436 && local22.aBoolean435) {
				local46 = super.anInterface8_5.method3832(0.7F, arg0, true, 128, 128);
			} else {
				local46 = super.anInterface8_5.method3834(0.7F, 128, 128, arg0);
			}
			this.f(arg0, local22.aByte57, local22.aByte54, local22.aBoolean435, local22.aBoolean436, local22.aBoolean439, local22.aByte56, local22.aByte55, local22.aByte59, local22.aShort60, local22.anInt5078, local22.aBoolean434, local22.aBoolean437, local46);
			return true;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIF)Lclient!or;")
	@Override
	public Class2_Sub7 method2275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub7_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "V", descriptor = "(III)V")
	public native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!h", name = "ua", descriptor = "(F)V")
	public native void ua(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!h", name = "ia", descriptor = "(III[I)V")
	public native void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIILclient!ea;II)V")
	@Override
	public void method2222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class14 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.ta(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "()V")
	@Override
	public void method2220() {
		if (this.aCanvas4.getPeer() == null) {
			throw new RuntimeException();
		}
		this.aLa1.SA();
	}

	@OriginalMember(owner = "client!h", name = "k", descriptor = "()Z")
	@Override
	public boolean method2243() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method2262() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!h", name = "na", descriptor = "(I)V")
	public native void na(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!h", name = "P", descriptor = "(Lclient!la;)V")
	private native void P(@OriginalArg(0) la arg0);

	@OriginalMember(owner = "client!h", name = "O", descriptor = "(IIIII)V")
	protected native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!h", name = "A", descriptor = "()Ljava/lang/Object;")
	private Object method2127() {
		return new ka();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class76 method2244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new k(this, this.aBa1, arg0, arg1, arg2, arg3) : new n(this, this.aBa1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!h", name = "s", descriptor = "()Z")
	@Override
	public boolean method2272() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(FFF)V")
	@Override
	public void method2219(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!h", name = "v", descriptor = "()Z")
	@Override
	public boolean method2279() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "VA", descriptor = "(I[I[F)V")
	private native void VA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!l;)V")
	@Override
	public void method2226(@OriginalArg(0) Class2_Sub3 arg0) {
		this.aBa1 = (ba) arg0;
		this.Y(arg0);
	}
}
