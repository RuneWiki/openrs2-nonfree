import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class h extends Class121 implements Interface4 {

	@OriginalMember(owner = "client!h", name = "t", descriptor = "Lclient!ba;")
	private ba aBa1;

	@OriginalMember(owner = "client!h", name = "G", descriptor = "Lclient!la;")
	private la aLa1;

	@OriginalMember(owner = "client!h", name = "J", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!h", name = "L", descriptor = "I")
	private int anInt2522;

	@OriginalMember(owner = "client!h", name = "N", descriptor = "[Lclient!ma;")
	private ma[] aMaArray1;

	@OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!h", name = "s", descriptor = "Lclient!ko;")
	private final Class142 aClass142_17 = new Class142();

	@OriginalMember(owner = "client!h", name = "I", descriptor = "I")
	private final int anInt2520 = 4096;

	@OriginalMember(owner = "client!h", name = "K", descriptor = "I")
	private final int anInt2521 = 4096;

	@OriginalMember(owner = "client!h", name = "D", descriptor = "Lclient!cv;")
	private final Class51 aClass51_10 = new Class51(4);

	@OriginalMember(owner = "client!h", name = "M", descriptor = "Z")
	private boolean aBoolean203 = false;

	@OriginalMember(owner = "client!h", name = "H", descriptor = "Lclient!ia;")
	private final Class43 aClass43_1;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!m;Lclient!ci;)V")
	public h(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface5 arg2, @OriginalArg(3) Class42 arg3) {
		super(arg0, arg2);
		try {
			if (!Static137.aBoolean202) {
				if (arg3 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("sw3d");
					Static137.aBoolean202 = Boolean.TRUE;
				} else {
					arg3.method669(this.getClass());
					Static137.aBoolean202 = Boolean.TRUE;
				}
			}
			if (!Static137.aBoolean202) {
				throw new RuntimeException("");
			}
			this.B(super.anInterface5_16, 0, 0);
			Static111.method1746(true, false);
			this.aBoolean203 = true;
			if (arg1 != null) {
				this.method4625(arg1);
				this.method4620(arg1);
			}
			this.aClass43_1 = new sa();
			this.m(new sa());
			this.method4577(1);
			this.method4609(0);
		} catch (@Pc(92) Throwable local92) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "K", descriptor = "(IIIIII)V")
	private native void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!h", name = "va", descriptor = "()V")
	public native void va();

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!md;Lclient!md;FLclient!md;)Lclient!md;")
	@Override
	public Class89 method4637(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class89 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	@Override
	public void method4577(@OriginalArg(0) int arg0) {
		this.anInt2522 = arg0;
		this.aMaArray1 = new ma[this.anInt2522];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2522; local9++) {
			this.aMaArray1[local9] = new ma(this, this.anInt2520, this.anInt2521);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)I")
	@Override
	public int method4634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!h", name = "M", descriptor = "(I)V")
	public native void M(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!h", name = "I", descriptor = "()V")
	private native void I();

	@OriginalMember(owner = "client!h", name = "a", descriptor = "()V")
	@Override
	public void method4570() {
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!gn;Z)V")
	private void method2247(@OriginalArg(0) Class101 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class36_Sub3_Sub1 local15 = (Class36_Sub3_Sub1) arg0.aClass95_1.method1884(); local15 != null; local15 = (Class36_Sub3_Sub1) arg0.aClass95_1.method1885()) {
			Static137.anIntArray197[local1++] = local15.anInt2038;
			Static137.anIntArray197[local1++] = local15.anInt2031;
			Static137.anIntArray197[local1++] = local15.anInt2028;
			Static137.anIntArray196[local3++] = local15.anInt2029;
			Static137.aShortArray50[local7++] = (short) local15.anInt2036;
			Static137.anIntArray199[local5++] = local15.anInt2034;
			if (arg1) {
				Static137.aByteArray27[local9++] = local15.aByte26;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "Z", descriptor = "(IIII)V")
	public native void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "EA", descriptor = "(S)Z")
	private boolean method2248(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class132 local9 = super.anInterface5_16.method3920(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.l(arg0, local9.aByte42, local9.aByte38, local9.aBoolean277, local9.aBoolean284, local9.aBoolean278, local9.aByte37, local9.aByte41, local9.aByte40, local9.aShort63, local9.anInt3547, local9.aBoolean286, local9.aBoolean281);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "()I")
	@Override
	public int method4572() {
		return 4;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)I")
	@Override
	public int method4643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!h", name = "W", descriptor = "()I")
	public native int W();

	@OriginalMember(owner = "client!h", name = "l", descriptor = "()Z")
	@Override
	public boolean method4604() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4625(@OriginalArg(0) Canvas arg0) {
		@Pc(8) la local8 = (la) this.aClass51_10.method930((long) arg0.hashCode());
		if (local8 != null) {
			return;
		}
		try {
			@Pc(13) Class local13 = Class.forName("java.awt.Canvas");
			@Pc(23) Method local23 = local13.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local23.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(35) Exception local35) {
		}
		local8 = new la(this, arg0);
		this.aClass51_10.method931(local8, (long) arg0.hashCode());
	}

	@OriginalMember(owner = "client!h", name = "V", descriptor = "(III)V")
	public native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
	@Override
	public void method4571(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!h", name = "ZA", descriptor = "()V")
	private void method2249() {
		System.gc();
		System.runFinalization();
		Static227.method3280();
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4620(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas1 = null;
			this.aLa1 = null;
			this.P(null);
		} else {
			@Pc(10) la local10 = (la) this.aClass51_10.method930((long) arg0.hashCode());
			this.aCanvas1 = arg0;
			this.aLa1 = local10;
			this.P(local10);
		}
	}

	@OriginalMember(owner = "client!h", name = "B", descriptor = "()Z")
	@Override
	public boolean method4640() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "GA", descriptor = "(IIII)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "m", descriptor = "()Z")
	@Override
	public boolean method4605() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "VA", descriptor = "(I[I[F)V")
	private native void VA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!h", name = "q", descriptor = "()V")
	@Override
	public void method4619() {
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ds;[Lclient!dt;Z)Lclient!oa;")
	@Override
	public Class4 method4612(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class63[] arg1) {
		return new w(this, this.aBa1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!h", name = "i", descriptor = "()Lclient!ia;")
	@Override
	public Class43 method4588() {
		return this.aClass43_1;
	}

	@OriginalMember(owner = "client!h", name = "JA", descriptor = "(II)V")
	public native void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method4611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.K(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "h", descriptor = "()Z")
	@Override
	public boolean method4582() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4599(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas1 == arg0) {
			this.method4620(null);
		}
		@Pc(15) la local15 = (la) this.aClass51_10.method930((long) arg0.hashCode());
		if (local15 != null) {
			local15.method5965();
		}
		local15.method3255();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!c;Lclient!gn;Lclient!ia;Lclient!sf;I)V")
	@Override
	public void method4574(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) Class43 arg2, @OriginalArg(3) Class36_Sub8 arg3) {
		this.method2247(arg1, true);
		if (arg3 == null) {
			this.method2252().f(this, arg0, arg2, null, 0, Static137.anIntArray197, Static137.anIntArray196, Static137.anIntArray199, Static137.aShortArray50, Static137.aByteArray27, arg1.aClass95_1.method1888(), Static137.anIntArray200);
		} else {
			Static137.anIntArray198[5] = 0;
			this.method2252().f(this, arg0, arg2, Static137.anIntArray198, 0, Static137.anIntArray197, Static137.anIntArray196, Static137.anIntArray199, Static137.aShortArray50, Static137.aByteArray27, arg1.aClass95_1.method1888(), Static137.anIntArray200);
			arg3.anInt6562 = Static137.anIntArray198[0];
			arg3.anInt6561 = Static137.anIntArray198[1];
			arg3.anInt6564 = Static137.anIntArray198[2];
			arg3.anInt6563 = Static137.anIntArray198[3];
			arg3.anInt6565 = Static137.anIntArray198[4];
			arg3.aBoolean534 = Static137.anIntArray198[5] != 0;
		}
		@Pc(83) p local83 = (p) arg0;
		local83.method4091(0, arg2);
	}

	@OriginalMember(owner = "client!h", name = "m", descriptor = "(Lclient!ia;)V")
	public native void m(@OriginalArg(0) Class43 arg0);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([Lclient!c;Lclient!ia;[Lclient!sf;I)V")
	@Override
	public void method4585(@OriginalArg(0) Class37[] arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) Class36_Sub8[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method2252().za(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class36_Sub8 local15 = arg2[0];
		Static137.anIntArray198[5] = 0;
		this.method2252().za(this, arg0, arg1, Static137.anIntArray198, -1, arg3);
		local15.anInt6562 = Static137.anIntArray198[0];
		local15.anInt6561 = Static137.anIntArray198[1];
		local15.anInt6564 = Static137.anIntArray198[2];
		local15.anInt6563 = Static137.anIntArray198[3];
		local15.anInt6565 = Static137.anIntArray198[4];
		local15.aBoolean534 = Static137.anIntArray198[5] != 0;
	}

	@OriginalMember(owner = "client!h", name = "aa", descriptor = "(IIIIII[BII)V")
	public native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!h", name = "f", descriptor = "()Z")
	@Override
	public boolean method4581() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "xa", descriptor = "()I")
	public native int xa();

	@OriginalMember(owner = "client!h", name = "k", descriptor = "()V")
	@Override
	public void method4602() {
		@Pc(1) int local1 = 0;
		while (local1 < 9) {
			try {
				this.aLa1.SA();
				return;
			} catch (@Pc(7) Exception local7) {
				Static366.method5214(200L);
				local1++;
			}
		}
		this.aLa1.SA();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class78 method4575(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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
	public void method4609(@OriginalArg(0) int arg0) {
		this.aMaArray1[arg0].method3514();
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "()I")
	public native int d();

	@OriginalMember(owner = "client!h", name = "ba", descriptor = "(IIII)V")
	public native void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "e", descriptor = "()V")
	@Override
	protected void method4578() {
		for (@Pc(5) ba local5 = (ba) this.aClass142_17.method3199(); local5 != null; local5 = (ba) this.aClass142_17.method3198()) {
			local5.ka();
		}
		this.aClass142_17.method3206();
		this.I();
		if (this.aBoolean203) {
			Static201.method3105(false, true);
			this.aBoolean203 = false;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class78 method4627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new k(this, this.aBa1, arg0, arg1, arg2, arg3) : new n(this, this.aBa1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!h", name = "p", descriptor = "()Z")
	@Override
	public boolean method4613() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4628(@OriginalArg(0) Canvas arg0) {
		@Pc(8) la local8 = (la) this.aClass51_10.method930((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.ZA(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aCanvas1) {
			this.method4620(arg0);
		}
	}

	@OriginalMember(owner = "client!h", name = "x", descriptor = "()V")
	@Override
	public void method4633() {
	}

	@OriginalMember(owner = "client!h", name = "FA", descriptor = "()I")
	public native int FA();

	@OriginalMember(owner = "client!h", name = "n", descriptor = "()Z")
	@Override
	public boolean method4607() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "MA", descriptor = "(S)Z")
	private boolean method2250(@OriginalArg(0) short arg0) {
		@Pc(2) Interface5 local2 = super.anInterface5_16;
		synchronized (super.anInterface5_16) {
			if (!super.anInterface5_16.method3922(arg0)) {
				return false;
			}
			@Pc(22) Class132 local22 = super.anInterface5_16.method3920(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(46) int[] local46;
			if (local22.aBoolean284 && local22.aBoolean277) {
				local46 = super.anInterface5_16.method3923(arg0, true, 0.7F, 128, 128);
			} else {
				local46 = super.anInterface5_16.method3921(arg0, 128, 128, 0.7F);
			}
			this.f(arg0, local22.aByte42, local22.aByte38, local22.aBoolean277, local22.aBoolean284, local22.aBoolean278, local22.aByte37, local22.aByte41, local22.aByte40, local22.aShort63, local22.anInt3547, local22.aBoolean286, local22.aBoolean281, local46);
			return true;
		}
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void f(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!h", name = "Y", descriptor = "(Lclient!l;)V")
	private native void Y(@OriginalArg(0) Class1_Sub27 arg0);

	@OriginalMember(owner = "client!h", name = "z", descriptor = "()Z")
	@Override
	public boolean method4638() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "()Z")
	@Override
	public boolean method4576() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!dt;Z)Lclient!f;")
	@Override
	public Class78 method4589(@OriginalArg(0) Class63 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray71;
		@Pc(5) byte[] local5 = arg0.aByteArray11;
		@Pc(8) int local8 = arg0.anInt1472;
		@Pc(11) int local11 = arg0.anInt1470;
		@Pc(32) Class78 local32;
		if (arg0.aByteArray12 == null) {
			local32 = new xa(this, this.aBa1, local2, local5, 0, arg0.anInt1472, arg0.anInt1472, arg0.anInt1470);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray12;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray71[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new k(this, this.aBa1, local40, 0, arg0.anInt1472, arg0.anInt1472, arg0.anInt1470);
				} else {
					local32 = new n(this, this.aBa1, local40, 0, arg0.anInt1472, arg0.anInt1472, arg0.anInt1470);
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
		local32.ka(arg0.anInt1473, arg0.anInt1468, arg0.anInt1469, arg0.anInt1471);
		return local32;
	}

	@OriginalMember(owner = "client!h", name = "u", descriptor = "([I)V")
	public native void u(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!l;)V")
	@Override
	public void method4618(@OriginalArg(0) Class1_Sub27 arg0) {
		this.aBa1 = (ba) arg0;
		this.Y(arg0);
	}

	@OriginalMember(owner = "client!h", name = "NA", descriptor = "(IIIIII)V")
	public native void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!h", name = "r", descriptor = "()V")
	@Override
	public void method4621() {
	}

	@OriginalMember(owner = "client!h", name = "SA", descriptor = "(IIIIII)Z")
	public native boolean SA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V")
	@Override
	public void method4596(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V")
	@Override
	public void method4632(@OriginalArg(0) int arg0) {
		this.aMaArray1[arg0].method3513();
	}

	@OriginalMember(owner = "client!h", name = "u", descriptor = "()Z")
	@Override
	public boolean method4630() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "pa", descriptor = "(IIII)V")
	public native void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I[Lclient!tj;)V")
	@Override
	public void method4591(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub12[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static137.anIntArray195[local1++] = arg1[local3].method3182();
			Static137.anIntArray195[local1++] = arg1[local3].method3186();
			Static137.anIntArray195[local1++] = arg1[local3].method3181();
			Static137.anIntArray195[local1++] = arg1[local3].method3180();
			Static137.aFloatArray7[local3] = arg1[local3].method3183();
			Static137.anIntArray195[local1++] = arg1[local3].method3184();
		}
		this.VA(arg0, Static137.anIntArray195, Static137.aFloatArray7);
	}

	@OriginalMember(owner = "client!h", name = "ia", descriptor = "(III[I)V")
	public native void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method4639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.da(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.da(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!gn;)V")
	@Override
	public void method4614(@OriginalArg(0) Class101 arg0) {
		this.method2247(arg0, false);
		this.method2252().S(this, Static137.anIntArray197, Static137.anIntArray196, Static137.anIntArray199, Static137.aShortArray50, arg0.aClass95_1.method1888());
	}

	@OriginalMember(owner = "client!h", name = "ta", descriptor = "(IIIIIILclient!ea;II)V")
	private native void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class34 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II[I[I)Lclient!ea;")
	@Override
	public Class34 method4595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new ca(this, this.aBa1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2252().sa(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!h", name = "w", descriptor = "()F")
	public native float w();

	@OriginalMember(owner = "client!h", name = "da", descriptor = "(IIIII)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!h", name = "ua", descriptor = "(F)V")
	public native void ua(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4616(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!h", name = "j", descriptor = "()Lclient!ia;")
	@Override
	public Class43 method4592() {
		return new sa();
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "()I")
	public native int g();

	@OriginalMember(owner = "client!h", name = "j", descriptor = "(ILclient!ea;II)V")
	public native void j(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(IIIIII)Lclient!md;")
	@Override
	public Class89 method4623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!md;)V")
	@Override
	public void method4597(@OriginalArg(0) Class89 arg0) {
	}

	@OriginalMember(owner = "client!h", name = "na", descriptor = "(I)V")
	public native void na(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!h", name = "s", descriptor = "()Z")
	@Override
	public boolean method4622() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "XA", descriptor = "(IFFFFF)V")
	public native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!h", name = "S", descriptor = "()V")
	public native void S();

	@OriginalMember(owner = "client!h", name = "A", descriptor = "()Ljava/lang/Object;")
	private Object method2251() {
		return new ka();
	}

	@OriginalMember(owner = "client!h", name = "fa", descriptor = "(IIII)V")
	public native void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "P", descriptor = "(Lclient!la;)V")
	private native void P(@OriginalArg(0) la arg0);

	@OriginalMember(owner = "client!h", name = "C", descriptor = "()Z")
	@Override
	public boolean method4645() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "h", descriptor = "(I)V")
	@Override
	public void method4642(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!h", name = "D", descriptor = "()Lclient!ma;")
	public ma method2252() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2522; local1++) {
			if (this.aMaArray1[local1].aRunnable2 == Thread.currentThread()) {
				return this.aMaArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!h", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!h", name = "v", descriptor = "()V")
	@Override
	public void method4631() {
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II[[I[[IIII)Lclient!na;")
	@Override
	public Class70 method4580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new b(this, this.aBa1, arg0, arg1, arg2, arg3, 128, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([Lclient!c;Lclient!gn;Lclient!ia;[Lclient!sf;I)V")
	@Override
	public void method4593(@OriginalArg(0) Class37[] arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) Class43 arg2, @OriginalArg(3) Class36_Sub8[] arg3, @OriginalArg(4) int arg4) {
		this.method2247(arg1, true);
		if (arg3 == null) {
			this.method2252().pa(this, arg0, arg2, null, arg4, Static137.anIntArray197, Static137.anIntArray196, Static137.anIntArray199, Static137.aShortArray50, Static137.aByteArray27, arg1.aClass95_1.method1888(), Static137.anIntArray200);
		} else {
			@Pc(28) Class36_Sub8 local28 = arg3[0];
			Static137.anIntArray198[5] = 0;
			this.method2252().pa(this, arg0, arg2, Static137.anIntArray198, arg4, Static137.anIntArray197, Static137.anIntArray196, Static137.anIntArray199, Static137.aShortArray50, Static137.aByteArray27, arg1.aClass95_1.method1888(), Static137.anIntArray200);
			local28.anInt6562 = Static137.anIntArray198[0];
			local28.anInt6561 = Static137.anIntArray198[1];
			local28.anInt6564 = Static137.anIntArray198[2];
			local28.anInt6563 = Static137.anIntArray198[3];
			local28.anInt6565 = Static137.anIntArray198[4];
			local28.aBoolean534 = Static137.anIntArray198[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) p local98 = (p) arg0[local88];
				local98.method4091(local86, arg2);
				if (local98.aClass203Array3 != null) {
					local86 += local98.aClass203Array3.length * 9;
				}
				if (local98.aClass265Array3 != null) {
					local86 += local98.aClass265Array3.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.ya();
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(I)Lclient!l;")
	@Override
	public Class1_Sub27 method4615() {
		@Pc(5) ba local5 = new ba(this, 78643200);
		this.aClass142_17.method3212(local5);
		return local5;
	}

	@OriginalMember(owner = "client!h", name = "o", descriptor = "()Z")
	@Override
	public boolean method4610() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void l(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!h", name = "IA", descriptor = "(IIII)[I")
	public native int[] IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIF)Lclient!tj;")
	@Override
	public Class1_Sub12 method4641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub12_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "B", descriptor = "(Lclient!m;II)V")
	private native void B(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!h", name = "U", descriptor = "(IIIII)V")
	public native void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!lo;IIII)Lclient!c;")
	@Override
	public Class37 method4617(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new p(this, this.aBa1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!h", name = "t", descriptor = "()Z")
	@Override
	public boolean method4626() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIILclient!ea;II)V")
	@Override
	public void method4603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class34 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.ta(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!h", name = "la", descriptor = "()F")
	public native float la();

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4590(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(4) int local4;
		@Pc(9) Rectangle local9;
		while (local1 < 9) {
			try {
				for (local4 = 0; local4 < arg1; local4++) {
					local9 = arg0[local4];
					if (local9.width > 0 && local9.height > 0) {
						this.aLa1.xa(local9.x, local9.y, local9.width, local9.height);
					}
				}
				return;
			} catch (@Pc(32) Exception local32) {
				Static366.method5214(200L);
				local1++;
			}
		}
		for (local4 = 0; local4 < arg1; local4++) {
			local9 = arg0[local4];
			if (local9.width > 0 && local9.height > 0) {
				this.aLa1.xa(local9.x, local9.y, local9.width, local9.height);
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4608() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!h", name = "o", descriptor = "(FF)V")
	public native void o(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!h", name = "y", descriptor = "()Z")
	@Override
	public boolean method4635() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "O", descriptor = "(IIIII)V")
	protected native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!h", name = "ja", descriptor = "(I)V")
	private native void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(Z)V")
	@Override
	public void method4624(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
	@Override
	public void method4579(@OriginalArg(0) int arg0) {
		Static227.method3280();
		this.ja(arg0);
		for (@Pc(10) ba local10 = (ba) this.aClass142_17.method3199(); local10 != null; local10 = (ba) this.aClass142_17.method3198()) {
			local10.KA();
		}
	}
}
