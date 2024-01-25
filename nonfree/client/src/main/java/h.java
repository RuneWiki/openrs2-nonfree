import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class h extends Class30 implements Interface5 {

	@OriginalMember(owner = "client!h", name = "t", descriptor = "Lclient!ba;")
	private ba aBa1;

	@OriginalMember(owner = "client!h", name = "I", descriptor = "Lclient!la;")
	private la aLa1;

	@OriginalMember(owner = "client!h", name = "J", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!h", name = "O", descriptor = "[Lclient!ma;")
	private ma[] aMaArray1;

	@OriginalMember(owner = "client!h", name = "P", descriptor = "I")
	private int anInt2706;

	@OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!h", name = "u", descriptor = "Lclient!vr;")
	private final Class258 aClass258_22 = new Class258();

	@OriginalMember(owner = "client!h", name = "M", descriptor = "I")
	private final int anInt2704 = 4096;

	@OriginalMember(owner = "client!h", name = "N", descriptor = "I")
	private final int anInt2705 = 4096;

	@OriginalMember(owner = "client!h", name = "K", descriptor = "Lclient!qo;")
	private final Class196 aClass196_11 = new Class196(4);

	@OriginalMember(owner = "client!h", name = "Q", descriptor = "Z")
	private boolean aBoolean194 = false;

	@OriginalMember(owner = "client!h", name = "L", descriptor = "Lclient!ia;")
	private final Class116 aClass116_1;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!m;Lclient!hu;)V")
	public h(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface10 arg2, @OriginalArg(3) Class114 arg3) {
		super(arg0, arg2);
		try {
			if (!Static143.aBoolean193) {
				if (arg3 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("sw3d");
					Static143.aBoolean193 = Boolean.TRUE;
				} else {
					arg3.method2346(this.getClass());
					Static143.aBoolean193 = Boolean.TRUE;
				}
			}
			if (!Static143.aBoolean193) {
				throw new RuntimeException("");
			}
			this.B(super.anInterface10_7, 0, 0);
			Static13.method323(true, false);
			this.aBoolean194 = true;
			if (arg1 != null) {
				this.method4649(arg1);
				this.method4642(arg1);
			}
			this.aClass116_1 = new sa();
			this.m(new sa());
			this.method4675(1);
			this.method4673(0);
		} catch (@Pc(92) Throwable local92) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "B", descriptor = "(Lclient!m;II)V")
	private native void B(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!h", name = "d", descriptor = "()I")
	public native int d();

	@OriginalMember(owner = "client!h", name = "Y", descriptor = "(Lclient!l;)V")
	private native void Y(@OriginalArg(0) Class4_Sub27 arg0);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!vo;Z)V")
	private void method2095(@OriginalArg(0) Class256 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class41_Sub7_Sub1 local15 = (Class41_Sub7_Sub1) arg0.aClass91_1.method1941(); local15 != null; local15 = (Class41_Sub7_Sub1) arg0.aClass91_1.method1942()) {
			Static143.anIntArray180[local1++] = local15.anInt7561;
			Static143.anIntArray180[local1++] = local15.anInt7551;
			Static143.anIntArray180[local1++] = local15.anInt7552;
			Static143.anIntArray185[local3++] = local15.anInt7559;
			Static143.aShortArray33[local7++] = (short) local15.anInt7560;
			Static143.anIntArray181[local5++] = local15.anInt7557;
			if (arg1) {
				Static143.aByteArray28[local9++] = local15.aByte107;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II[I[I)Lclient!ea;")
	@Override
	public Class57 method4705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new ca(this, this.aBa1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!h", name = "u", descriptor = "()Z")
	@Override
	public boolean method4686() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "ZA", descriptor = "()V")
	private void method2096() {
		System.gc();
		System.runFinalization();
		Static131.method1935();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!vo;)V")
	@Override
	public void method4653(@OriginalArg(0) Class256 arg0) {
		this.method2095(arg0, false);
		this.method2097().S(this, Static143.anIntArray180, Static143.anIntArray185, Static143.anIntArray181, Static143.aShortArray33, arg0.aClass91_1.method1936());
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "()Z")
	@Override
	public boolean method4639() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "S", descriptor = "()V")
	public native void S();

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	@Override
	public void method4631(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!h", name = "pa", descriptor = "(IIII)V")
	public native void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!c;Lclient!vo;Lclient!ia;Lclient!mn;I)V")
	@Override
	public void method4676(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class256 arg1, @OriginalArg(2) Class116 arg2, @OriginalArg(3) Class41_Sub4 arg3) {
		this.method2095(arg1, true);
		if (arg3 == null) {
			this.method2097().f(this, arg0, arg2, null, 0, Static143.anIntArray180, Static143.anIntArray185, Static143.anIntArray181, Static143.aShortArray33, Static143.aByteArray28, arg1.aClass91_1.method1936(), Static143.anIntArray184);
		} else {
			Static143.anIntArray182[5] = 0;
			this.method2097().f(this, arg0, arg2, Static143.anIntArray182, 0, Static143.anIntArray180, Static143.anIntArray185, Static143.anIntArray181, Static143.aShortArray33, Static143.aByteArray28, arg1.aClass91_1.method1936(), Static143.anIntArray184);
			arg3.anInt4531 = Static143.anIntArray182[0];
			arg3.anInt4533 = Static143.anIntArray182[1];
			arg3.anInt4534 = Static143.anIntArray182[2];
			arg3.anInt4535 = Static143.anIntArray182[3];
			arg3.anInt4532 = Static143.anIntArray182[4];
			arg3.aBoolean334 = Static143.anIntArray182[5] != 0;
		}
		@Pc(83) p local83 = (p) arg0;
		local83.method4097(0, arg2);
	}

	@OriginalMember(owner = "client!h", name = "u", descriptor = "([I)V")
	public native void u(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4684(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas3 == arg0) {
			this.method4642(null);
		}
		@Pc(15) la local15 = (la) this.aClass196_11.method4477((long) arg0.hashCode());
		if (local15 != null) {
			local15.method5854();
		}
		local15.method3108();
	}

	@OriginalMember(owner = "client!h", name = "VA", descriptor = "(I[I[F)V")
	private native void VA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!h", name = "P", descriptor = "(Lclient!la;)V")
	private native void P(@OriginalArg(0) la arg0);

	@OriginalMember(owner = "client!h", name = "j", descriptor = "()Z")
	@Override
	public boolean method4652() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "M", descriptor = "(I)V")
	public native void M(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!h", name = "xa", descriptor = "()I")
	public native int xa();

	@OriginalMember(owner = "client!h", name = "ia", descriptor = "(III[I)V")
	public native void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!h", name = "s", descriptor = "()Z")
	@Override
	public boolean method4681() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIILclient!ea;II)V")
	@Override
	public void method4664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class57 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.ta(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!h", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!h", name = "e", descriptor = "()V")
	@Override
	public void method4637() {
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II[[I[[IIII)Lclient!na;")
	@Override
	public Class146 method4669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new b(this, this.aBa1, arg0, arg1, arg2, arg3, 128, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "D", descriptor = "()Lclient!ma;")
	public ma method2097() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2706; local1++) {
			if (this.aMaArray1[local1].aRunnable1 == Thread.currentThread()) {
				return this.aMaArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!h", name = "I", descriptor = "()V")
	private native void I();

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([Lclient!c;Lclient!ia;[Lclient!mn;I)V")
	@Override
	public void method4701(@OriginalArg(0) Class7[] arg0, @OriginalArg(1) Class116 arg1, @OriginalArg(2) Class41_Sub4[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method2097().za(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class41_Sub4 local15 = arg2[0];
		Static143.anIntArray182[5] = 0;
		this.method2097().za(this, arg0, arg1, Static143.anIntArray182, -1, arg3);
		local15.anInt4531 = Static143.anIntArray182[0];
		local15.anInt4533 = Static143.anIntArray182[1];
		local15.anInt4534 = Static143.anIntArray182[2];
		local15.anInt4535 = Static143.anIntArray182[3];
		local15.anInt4532 = Static143.anIntArray182[4];
		local15.aBoolean334 = Static143.anIntArray182[5] != 0;
	}

	@OriginalMember(owner = "client!h", name = "O", descriptor = "(IIIII)V")
	protected native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!h", name = "m", descriptor = "(Lclient!ia;)V")
	public native void m(@OriginalArg(0) Class116 arg0);

	@OriginalMember(owner = "client!h", name = "b", descriptor = "()Z")
	@Override
	public boolean method4634() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "z", descriptor = "()V")
	@Override
	public void method4700() {
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
	@Override
	public void method4646(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "()I")
	public native int g();

	@OriginalMember(owner = "client!h", name = "W", descriptor = "()I")
	public native int W();

	@OriginalMember(owner = "client!h", name = "i", descriptor = "()Z")
	@Override
	public boolean method4651() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIF)Lclient!dd;")
	@Override
	public Class4_Sub8 method4654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class4_Sub8_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V")
	@Override
	public void method4675(@OriginalArg(0) int arg0) {
		this.anInt2706 = arg0;
		this.aMaArray1 = new ma[this.anInt2706];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2706; local9++) {
			this.aMaArray1[local9] = new ma(this, this.anInt2704, this.anInt2705);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2097().sa(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method4689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.K(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "C", descriptor = "()V")
	@Override
	public void method4704() {
		@Pc(1) int local1 = 0;
		while (local1 < 9) {
			try {
				this.aLa1.SA();
				return;
			} catch (@Pc(7) Exception local7) {
				Static20.method1515(200L);
				local1++;
			}
		}
		this.aLa1.SA();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ro;IIII)Lclient!c;")
	@Override
	public Class7 method4655(@OriginalArg(0) Class208 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new p(this, this.aBa1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!h", name = "l", descriptor = "()Z")
	@Override
	public boolean method4660() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([Lclient!c;Lclient!vo;Lclient!ia;[Lclient!mn;I)V")
	@Override
	public void method4659(@OriginalArg(0) Class7[] arg0, @OriginalArg(1) Class256 arg1, @OriginalArg(2) Class116 arg2, @OriginalArg(3) Class41_Sub4[] arg3, @OriginalArg(4) int arg4) {
		this.method2095(arg1, true);
		if (arg3 == null) {
			this.method2097().pa(this, arg0, arg2, null, arg4, Static143.anIntArray180, Static143.anIntArray185, Static143.anIntArray181, Static143.aShortArray33, Static143.aByteArray28, arg1.aClass91_1.method1936(), Static143.anIntArray184);
		} else {
			@Pc(28) Class41_Sub4 local28 = arg3[0];
			Static143.anIntArray182[5] = 0;
			this.method2097().pa(this, arg0, arg2, Static143.anIntArray182, arg4, Static143.anIntArray180, Static143.anIntArray185, Static143.anIntArray181, Static143.aShortArray33, Static143.aByteArray28, arg1.aClass91_1.method1936(), Static143.anIntArray184);
			local28.anInt4531 = Static143.anIntArray182[0];
			local28.anInt4533 = Static143.anIntArray182[1];
			local28.anInt4534 = Static143.anIntArray182[2];
			local28.anInt4535 = Static143.anIntArray182[3];
			local28.anInt4532 = Static143.anIntArray182[4];
			local28.aBoolean334 = Static143.anIntArray182[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) p local98 = (p) arg0[local88];
				local98.method4097(local86, arg2);
				if (local98.aClass56Array3 != null) {
					local86 += local98.aClass56Array3.length * 9;
				}
				if (local98.aClass120Array3 != null) {
					local86 += local98.aClass120Array3.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "da", descriptor = "(IIIII)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!h", name = "j", descriptor = "(ILclient!ea;II)V")
	public native void j(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!mc;Lclient!mc;FLclient!mc;)Lclient!mc;")
	@Override
	public Class59 method4641(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class59 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4642(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas3 = null;
			this.aLa1 = null;
			this.P(null);
		} else {
			@Pc(10) la local10 = (la) this.aClass196_11.method4477((long) arg0.hashCode());
			this.aCanvas3 = arg0;
			this.aLa1 = local10;
			this.P(local10);
		}
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4650(@OriginalArg(0) Canvas arg0) {
		@Pc(8) la local8 = (la) this.aClass196_11.method4477((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.ZA(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aCanvas3) {
			this.method4642(arg0);
		}
	}

	@OriginalMember(owner = "client!h", name = "k", descriptor = "()I")
	@Override
	public int method4657() {
		return 4;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "()V")
	@Override
	public void method4635() {
	}

	@OriginalMember(owner = "client!h", name = "aa", descriptor = "(IIIIII[BII)V")
	public native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!h", name = "o", descriptor = "(FF)V")
	public native void o(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!h", name = "p", descriptor = "()Lclient!ia;")
	@Override
	public Class116 method4678() {
		return this.aClass116_1;
	}

	@OriginalMember(owner = "client!h", name = "r", descriptor = "()Z")
	@Override
	public boolean method4680() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4649(@OriginalArg(0) Canvas arg0) {
		@Pc(8) la local8 = (la) this.aClass196_11.method4477((long) arg0.hashCode());
		if (local8 != null) {
			return;
		}
		if (!arg0.isShowing()) {
			throw new RuntimeException();
		}
		try {
			@Pc(20) Class local20 = Class.forName("java.awt.Canvas");
			@Pc(30) Method local30 = local20.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local30.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(42) Exception local42) {
		}
		local8 = new la(this, arg0);
		this.aClass196_11.method4474((long) arg0.hashCode(), local8);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4707(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
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
				Static20.method1515(200L);
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

	@OriginalMember(owner = "client!h", name = "a", descriptor = "()Lclient!ia;")
	@Override
	public Class116 method4632() {
		return new sa();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!mc;)V")
	@Override
	public void method4667(@OriginalArg(0) Class59 arg0) {
	}

	@OriginalMember(owner = "client!h", name = "h", descriptor = "()Z")
	@Override
	public boolean method4643() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!se;[Lclient!rl;Z)Lclient!oa;")
	@Override
	public Class105 method4690(@OriginalArg(0) Class215 arg0, @OriginalArg(1) Class205[] arg1) {
		return new w(this, this.aBa1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!h", name = "ua", descriptor = "(F)V")
	public native void ua(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class3 method4672(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4638() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!h", name = "B", descriptor = "()V")
	@Override
	protected void method4703() {
		for (@Pc(5) ba local5 = (ba) this.aClass258_22.method5538(); local5 != null; local5 = (ba) this.aClass258_22.method5528()) {
			local5.ka();
		}
		this.aClass258_22.method5527();
		this.I();
		if (this.aBoolean194) {
			Static85.method1457(true, false);
			this.aBoolean194 = false;
		}
	}

	@OriginalMember(owner = "client!h", name = "ta", descriptor = "(IIIIIILclient!ea;II)V")
	private native void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class57 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!h", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void l(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!h", name = "IA", descriptor = "(IIII)[I")
	public native int[] IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "fa", descriptor = "(IIII)V")
	public native void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "w", descriptor = "()F")
	public native float w();

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
	@Override
	public void method4673(@OriginalArg(0) int arg0) {
		this.aMaArray1[arg0].method3320();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I[Lclient!dd;)V")
	@Override
	public void method4706(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub8[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static143.anIntArray183[local1++] = arg1[local3].method5676();
			Static143.anIntArray183[local1++] = arg1[local3].method5674();
			Static143.anIntArray183[local1++] = arg1[local3].method5682();
			Static143.anIntArray183[local1++] = arg1[local3].method5679();
			Static143.aFloatArray15[local3] = arg1[local3].method5675();
			Static143.anIntArray183[local1++] = arg1[local3].method5683();
		}
		this.VA(arg0, Static143.anIntArray183, Static143.aFloatArray15);
	}

	@OriginalMember(owner = "client!h", name = "va", descriptor = "()V")
	public native void va();

	@OriginalMember(owner = "client!h", name = "ba", descriptor = "(IIII)V")
	public native void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "o", descriptor = "()Z")
	@Override
	public boolean method4668() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "Z", descriptor = "(IIII)V")
	public native void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "FA", descriptor = "()I")
	public native int FA();

	@OriginalMember(owner = "client!h", name = "NA", descriptor = "(IIIIII)V")
	public native void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!h", name = "A", descriptor = "()Ljava/lang/Object;")
	private Object method2098() {
		return new ka();
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(Z)V")
	@Override
	public void method4671(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!h", name = "la", descriptor = "()F")
	public native float la();

	@OriginalMember(owner = "client!h", name = "K", descriptor = "(IIIIII)V")
	private native void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!rl;Z)Lclient!f;")
	@Override
	public Class3 method4656(@OriginalArg(0) Class205 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray538;
		@Pc(5) byte[] local5 = arg0.aByteArray71;
		@Pc(8) int local8 = arg0.anInt6175;
		@Pc(11) int local11 = arg0.anInt6171;
		@Pc(32) Class3 local32;
		if (arg0.aByteArray70 == null) {
			local32 = new xa(this, this.aBa1, local2, local5, 0, arg0.anInt6175, arg0.anInt6175, arg0.anInt6171);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray70;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray538[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new k(this, this.aBa1, local40, 0, arg0.anInt6175, arg0.anInt6175, arg0.anInt6171);
				} else {
					local32 = new n(this, this.aBa1, local40, 0, arg0.anInt6175, arg0.anInt6175, arg0.anInt6171);
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
		local32.ka(arg0.anInt6173, arg0.anInt6170, arg0.anInt6172, arg0.anInt6174);
		return local32;
	}

	@OriginalMember(owner = "client!h", name = "V", descriptor = "(III)V")
	public native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!h", name = "i", descriptor = "(I)V")
	@Override
	public void method4697(@OriginalArg(0) int arg0) {
		Static131.method1935();
		this.ja(arg0);
		for (@Pc(10) ba local10 = (ba) this.aClass258_22.method5538(); local10 != null; local10 = (ba) this.aClass258_22.method5528()) {
			local10.KA();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4683(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!h", name = "x", descriptor = "()V")
	@Override
	public void method4693() {
	}

	@OriginalMember(owner = "client!h", name = "U", descriptor = "(IIIII)V")
	public native void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!h", name = "SA", descriptor = "(IIIIII)Z")
	public native boolean SA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.ya();
	}

	@OriginalMember(owner = "client!h", name = "y", descriptor = "()Z")
	@Override
	public boolean method4698() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.da(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.da(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "na", descriptor = "(I)V")
	public native void na(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!h", name = "GA", descriptor = "(IIII)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "MA", descriptor = "(S)Z")
	private boolean method2099(@OriginalArg(0) short arg0) {
		@Pc(2) Interface10 local2 = super.anInterface10_7;
		synchronized (super.anInterface10_7) {
			if (!super.anInterface10_7.method4242(arg0)) {
				return false;
			}
			@Pc(22) Class118 local22 = super.anInterface10_7.method4241(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(46) int[] local46;
			if (local22.aBoolean233 && local22.aBoolean237) {
				local46 = super.anInterface10_7.method4238(0.7F, arg0, 128, true, 128);
			} else {
				local46 = super.anInterface10_7.method4239(arg0, 128, 128, 0.7F);
			}
			this.f(arg0, local22.aByte53, local22.aByte54, local22.aBoolean237, local22.aBoolean233, local22.aBoolean232, local22.aByte55, local22.aByte51, local22.aByte56, local22.aShort57, local22.anInt3169, local22.aBoolean234, local22.aBoolean238, local46);
			return true;
		}
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(I)Lclient!l;")
	@Override
	public Class4_Sub27 method4647() {
		@Pc(5) ba local5 = new ba(this, 78643200);
		this.aClass258_22.method5526(local5);
		return local5;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)I")
	@Override
	public int method4665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V")
	@Override
	public void method4685(@OriginalArg(0) int arg0) {
		this.aMaArray1[arg0].method3318();
	}

	@OriginalMember(owner = "client!h", name = "t", descriptor = "()Z")
	@Override
	public boolean method4682() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!l;)V")
	@Override
	public void method4699(@OriginalArg(0) Class4_Sub27 arg0) {
		this.aBa1 = (ba) arg0;
		this.Y(arg0);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class3 method4633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new k(this, this.aBa1, arg0, arg1, arg2, arg3) : new n(this, this.aBa1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void f(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!h", name = "ja", descriptor = "(I)V")
	private native void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!h", name = "JA", descriptor = "(II)V")
	public native void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!h", name = "v", descriptor = "()Z")
	@Override
	public boolean method4688() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "XA", descriptor = "(IFFFFF)V")
	public native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(IIIIII)Lclient!mc;")
	@Override
	public Class59 method4670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)I")
	@Override
	public int method4674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!h", name = "EA", descriptor = "(S)Z")
	private boolean method2100(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class118 local9 = super.anInterface10_7.method4241(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.l(arg0, local9.aByte53, local9.aByte54, local9.aBoolean237, local9.aBoolean233, local9.aBoolean232, local9.aByte55, local9.aByte51, local9.aByte56, local9.aShort57, local9.anInt3169, local9.aBoolean234, local9.aBoolean238);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "m", descriptor = "()V")
	@Override
	public void method4661() {
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V")
	@Override
	public void method4663(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!h", name = "q", descriptor = "()Z")
	@Override
	public boolean method4679() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "n", descriptor = "()Z")
	@Override
	public boolean method4666() {
		return false;
	}
}
