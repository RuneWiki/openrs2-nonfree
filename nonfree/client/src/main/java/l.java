import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class l extends Class45 implements Interface16 {

	@OriginalMember(owner = "client!l", name = "s", descriptor = "Lclient!m;")
	private m aM1;

	@OriginalMember(owner = "client!l", name = "v", descriptor = "Lclient!ta;")
	private ta aTa1;

	@OriginalMember(owner = "client!l", name = "A", descriptor = "Lclient!q;")
	private Class11 aClass11_2;

	@OriginalMember(owner = "client!l", name = "L", descriptor = "[Lclient!qa;")
	private qa[] aQaArray1;

	@OriginalMember(owner = "client!l", name = "N", descriptor = "I")
	public int anInt4961;

	@OriginalMember(owner = "client!l", name = "q", descriptor = "Z")
	private boolean aBoolean358 = false;

	@OriginalMember(owner = "client!l", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!l", name = "r", descriptor = "Lclient!gk;")
	private final Class112 aClass112_32 = new Class112();

	@OriginalMember(owner = "client!l", name = "w", descriptor = "I")
	private final int anInt4959 = 4096;

	@OriginalMember(owner = "client!l", name = "B", descriptor = "I")
	private final int anInt4960 = 4096;

	@OriginalMember(owner = "client!l", name = "u", descriptor = "Lclient!wa;")
	private final Class354 aClass354_24 = new Class354(4);

	@OriginalMember(owner = "client!l", name = "M", descriptor = "Z")
	private boolean aBoolean359 = false;

	@OriginalMember(owner = "client!l", name = "H", descriptor = "Lclient!q;")
	private Class11 aClass11_3;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;)V")
	public l(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1) {
		super(arg1);
		try {
			if (!Static10.method149("sw3d")) {
				throw new RuntimeException("");
			}
			Static388.method5739();
			this.OA(super.anInterface3_12, 0, 0);
			Static218.method3484(true, false);
			this.aBoolean359 = true;
			this.aClass11_3 = new ra();
			this.method7367(new ra());
			this.method7411(1);
			this.method7416(0);
			if (arg0 != null) {
				this.method7414(arg0);
				this.method7409(arg0);
			}
		} catch (@Pc(78) Throwable local78) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!l", name = "D", descriptor = "()Lclient!qa;")
	public qa method4358() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4961; local1++) {
			if (this.aQaArray1[local1].aRunnable2 == Thread.currentThread()) {
				return this.aQaArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!l", name = "CA", descriptor = "(IIII)V")
	public native void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "pa", descriptor = "(III)V")
	public native void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!l", name = "v", descriptor = "()[I")
	public native int[] v();

	@OriginalMember(owner = "client!l", name = "y", descriptor = "()Z")
	@Override
	public boolean method7429() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class81 method7424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new za(this, this.aM1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!l", name = "V", descriptor = "(IIII)V")
	public native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "i", descriptor = "(I)V")
	@Override
	public void method7428(@OriginalArg(0) int arg0) {
		this.aQaArray1[arg0].method6005();
	}

	@OriginalMember(owner = "client!l", name = "q", descriptor = "(Lclient!va;)V")
	private native void q(@OriginalArg(0) va arg0);

	@OriginalMember(owner = "client!l", name = "h", descriptor = "(IIII)[I")
	public native int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!qw;Z)V")
	private void method4359(@OriginalArg(0) Class283 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class41_Sub3_Sub1 local15 = (Class41_Sub3_Sub1) arg0.aClass206_1.method4715(); local15 != null; local15 = (Class41_Sub3_Sub1) arg0.aClass206_1.method4713()) {
			Static289.anIntArray274[local1++] = local15.anInt6767;
			Static289.anIntArray274[local1++] = local15.anInt6761;
			Static289.anIntArray274[local1++] = local15.anInt6766;
			Static289.anIntArray277[local3++] = local15.anInt6763;
			Static289.aShortArray84[local7++] = (short) local15.anInt6764;
			Static289.anIntArray275[local5++] = local15.anInt6765;
		}
	}

	@OriginalMember(owner = "client!l", name = "t", descriptor = "()Z")
	@Override
	public boolean method7417() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!lj;)V")
	@Override
	public void method7415(@OriginalArg(0) Class12 arg0) {
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
	@Override
	public void method7410(@OriginalArg(0) int arg0) {
		Static388.method5740();
		this.qa(arg0);
		for (@Pc(10) m local10 = (m) this.aClass112_32.method3088(); local10 != null; local10 = (m) this.aClass112_32.method3084()) {
			local10.Z();
		}
	}

	@OriginalMember(owner = "client!l", name = "ra", descriptor = "(F)V")
	public native void ra(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!l", name = "o", descriptor = "()Lclient!q;")
	@Override
	public Class11 method7397() {
		return this.aClass11_3;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class14 method7362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new t(this, this.aM1, arg0, arg1, arg2, arg3) : new va(this, this.aM1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!l", name = "T", descriptor = "()I")
	public native int T();

	@OriginalMember(owner = "client!l", name = "i", descriptor = "()I")
	@Override
	public int method7374() {
		return 4;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V")
	@Override
	public void method7421(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!l", name = "ZA", descriptor = "(Z)V")
	public native void ZA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7403(@OriginalArg(0) Canvas arg0) {
		@Pc(8) ta local8 = (ta) this.aClass354_24.method7689((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.AA(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aTa1.aCanvas10) {
			this.method7409(arg0);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.w(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7399(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aTa1 == null) {
			throw new IllegalStateException("off");
		}
		this.aTa1.method6734(arg0, arg1);
	}

	@OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method7387();
		if (this.nativeid != 0L) {
			Static388.method5743(this);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!lj;Lclient!lj;FLclient!lj;)Lclient!lj;")
	@Override
	public Class12 method7381(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class12 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!l", name = "n", descriptor = "()Z")
	@Override
	public boolean method7391() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(IIIIII)Lclient!lj;")
	@Override
	public Class12 method7431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!l", name = "R", descriptor = "()V")
	private native void R();

	@OriginalMember(owner = "client!l", name = "oa", descriptor = "([I)V")
	public native void oa(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!l", name = "qa", descriptor = "(I)V")
	private native void qa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "j", descriptor = "()Z")
	@Override
	public boolean method7380() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "BA", descriptor = "()I")
	public native int BA();

	@OriginalMember(owner = "client!l", name = "u", descriptor = "()V")
	@Override
	public void method7420() {
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7414(@OriginalArg(0) Canvas arg0) {
		@Pc(8) ta local8 = (ta) this.aClass354_24.method7689((long) arg0.hashCode());
		if (local8 != null) {
			return;
		}
		try {
			@Pc(13) Class local13 = Class.forName("java.awt.Canvas");
			@Pc(23) Method local23 = local13.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local23.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(35) Exception local35) {
		}
		local8 = new ta(this, arg0);
		this.aClass354_24.method7691(local8, (long) arg0.hashCode());
	}

	@OriginalMember(owner = "client!l", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!l", name = "MA", descriptor = "(III[I)V")
	public native void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!l", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!l", name = "q", descriptor = "()Z")
	@Override
	public boolean method7404() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(II)I")
	@Override
	public int method7393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!l", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!l", name = "A", descriptor = "()V")
	@Override
	public void method7432() {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7405(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!l", name = "f", descriptor = "()Z")
	@Override
	public boolean method7365() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V")
	@Override
	public void method7411(@OriginalArg(0) int arg0) {
		this.anInt4961 = arg0;
		this.aQaArray1 = new qa[this.anInt4961];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4961; local9++) {
			this.aQaArray1[local9] = new qa(this, this.anInt4960, this.anInt4959);
		}
	}

	@OriginalMember(owner = "client!l", name = "l", descriptor = "()V")
	@Override
	public void method7386() throws Exception_Sub1 {
		if (this.aTa1 == null) {
			throw new IllegalStateException("off");
		}
		this.aTa1.method6731();
	}

	@OriginalMember(owner = "client!l", name = "Z", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void Z(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!l", name = "b", descriptor = "()I")
	public native int b();

	@OriginalMember(owner = "client!l", name = "da", descriptor = "(IIII)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "s", descriptor = "()Lclient!q;")
	@Override
	public Class11 method7408() {
		return this.aClass11_2;
	}

	@OriginalMember(owner = "client!l", name = "W", descriptor = "(S)Z")
	private boolean method4360(@OriginalArg(0) short arg0) {
		@Pc(2) Interface3 local2 = super.anInterface3_12;
		synchronized (super.anInterface3_12) {
			if (!super.anInterface3_12.method4774(arg0)) {
				return false;
			}
			@Pc(22) Class55 local22 = super.anInterface3_12.method4776(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(43) int[] local43;
			if (local22.aBoolean140) {
				local43 = super.anInterface3_12.method4777(arg0, 128, 0.7F, 128);
			} else {
				local43 = super.anInterface3_12.method4779(128, true, 0.7F, 128, arg0);
			}
			this.xa(arg0, local22.aByte17, local22.aByte15, local22.aBoolean139, local22.aBoolean144, local22.aBoolean142, local22.aByte18, local22.aByte21, local22.aByte16, local22.aShort21, local22.anInt1675, local22.aBoolean148, local22.aBoolean145, local43);
			return true;
		}
	}

	@OriginalMember(owner = "client!l", name = "fa", descriptor = "()Ljava/lang/Object;")
	private Object method4361() {
		return new h(this);
	}

	@OriginalMember(owner = "client!l", name = "xa", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void xa(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!l", name = "Q", descriptor = "(IIIIIILclient!ua;II)V")
	private native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class81 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7409(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aTa1 = null;
			this.ia(null);
		} else {
			@Pc(10) ta local10 = (ta) this.aClass354_24.method7689((long) arg0.hashCode());
			this.aTa1 = local10;
			this.ia(local10);
		}
	}

	@OriginalMember(owner = "client!l", name = "I", descriptor = "(I[I[F)V")
	private native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method7400(@OriginalArg(0) Class14 arg0) {
		if (arg0 instanceof va) {
			this.q((va) arg0);
		} else if (arg0 instanceof t) {
			this.ma((t) arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
	@Override
	public void method7372(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7367(@OriginalArg(0) Class11 arg0) {
		this.aClass11_2 = arg0;
		this.NA(arg0);
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7434(@OriginalArg(0) Canvas arg0) {
		if (this.aTa1.aCanvas10 == arg0) {
			this.method7409(null);
		}
		@Pc(16) ta local16 = (ta) this.aClass354_24.method7689((long) arg0.hashCode());
		if (local16 != null) {
			local16.method7825();
			local16.method6733();
		}
	}

	@OriginalMember(owner = "client!l", name = "B", descriptor = "()Z")
	@Override
	public boolean method7433() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "ma", descriptor = "(Lclient!t;)V")
	private native void ma(@OriginalArg(0) t arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([I)V")
	@Override
	public void method7407(@OriginalArg(0) int[] arg0) {
		@Pc(4) Dimension local4 = this.aTa1.aCanvas10.getSize();
		arg0[0] = local4.width;
		arg0[1] = local4.height;
	}

	@OriginalMember(owner = "client!l", name = "la", descriptor = "(IIII)V")
	public native void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ho;[Lclient!qo;Z)Lclient!la;")
	@Override
	public Class54 method7394(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class279[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt7341;
			local7[local11] = arg1[local11].anInt7340;
			if (arg1[local11].aByteArray79 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new c(this, this.aM1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method7402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.XA(arg0, arg1, arg2, arg4, arg5);
		this.XA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.m(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.m(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "h", descriptor = "()V")
	@Override
	public void method7370() {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class34 method7371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new s(this, this.aM1, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "ja", descriptor = "(I)V")
	public native void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "NA", descriptor = "(Lclient!q;)V")
	private native void NA(@OriginalArg(0) Class11 arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I")
	@Override
	public int method7392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!l", name = "r", descriptor = "()Z")
	@Override
	public boolean method7406() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "O", descriptor = "(IIIIII)Z")
	public native boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "XA", descriptor = "(IIIII)V")
	public native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "m", descriptor = "()Z")
	@Override
	public boolean method7389() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(IIIII)V")
	protected native void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIF)Lclient!eq;")
	@Override
	public Class3_Sub10 method7357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub10_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "()V")
	@Override
	public void method7361() {
	}

	@OriginalMember(owner = "client!l", name = "h", descriptor = "(I)Lclient!e;")
	@Override
	public Class3_Sub15 method7423(@OriginalArg(0) int arg0) {
		@Pc(5) m local5 = new m(this, arg0);
		this.aClass112_32.method3079(local5);
		return local5;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7378() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!l", name = "EA", descriptor = "(Lclient!e;)V")
	private native void EA(@OriginalArg(0) Class3_Sub15 arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
	@Override
	public void method7385(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!l", name = "GA", descriptor = "(II)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class14 method7395(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new t(this, this.aM1, arg0, 0, arg1, arg2, arg3) : new va(this, this.aM1, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new t(this, this.aM1, arg0, 0, arg1, arg2, arg3) : new va(this, this.aM1, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V")
	@Override
	public void method7416(@OriginalArg(0) int arg0) {
		this.aQaArray1[arg0].method6004();
	}

	@OriginalMember(owner = "client!l", name = "AA", descriptor = "(III[I)V")
	public native void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I[Lclient!eq;)V")
	@Override
	public void method7413(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub10[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static289.anIntArray276[local1++] = arg1[local3].method6021();
			Static289.anIntArray276[local1++] = arg1[local3].method6011();
			Static289.anIntArray276[local1++] = arg1[local3].method6015();
			Static289.anIntArray276[local1++] = arg1[local3].method6018();
			Static289.aFloatArray55[local3] = arg1[local3].method6013();
			Static289.anIntArray276[local1++] = arg1[local3].method6020();
		}
		this.I(arg0, Static289.anIntArray276, Static289.aFloatArray55);
	}

	@OriginalMember(owner = "client!l", name = "DA", descriptor = "()I")
	public native int DA();

	@OriginalMember(owner = "client!l", name = "J", descriptor = "(IIIIII)V")
	public native void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method7382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class81 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.Q(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!l", name = "ia", descriptor = "(Lclient!ta;)V")
	private native void ia(@OriginalArg(0) ta arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class14 method7390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new t(this, this.aM1, arg0, arg1);
	}

	@OriginalMember(owner = "client!l", name = "A", descriptor = "(S)Z")
	private boolean method4362(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class55 local9 = super.anInterface3_12.method4776(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.Z(arg0, local9.aByte17, local9.aByte15, local9.aBoolean139, local9.aBoolean144, local9.aBoolean142, local9.aByte18, local9.aByte21, local9.aByte16, local9.aShort21, local9.anInt1675, local9.aBoolean148, local9.aBoolean145);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "va", descriptor = "(I)V")
	public native void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "w", descriptor = "(IIIIII)V")
	private native void w(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "()V")
	@Override
	protected void method7359() {
		if (this.aBoolean358) {
			return;
		}
		this.aQaArray1 = null;
		this.aTa1 = null;
		this.aM1 = null;
		this.aClass11_3 = null;
		this.aClass354_24.method7687();
		for (@Pc(25) m local25 = (m) this.aClass112_32.method3088(); local25 != null; local25 = (m) this.aClass112_32.method3084()) {
			local25.D();
		}
		this.aClass112_32.method3092();
		this.R();
		if (this.aBoolean359) {
			Static133.method2618(true, false);
			this.aBoolean359 = false;
		}
		this.method4363();
		Static388.method5742();
		this.aBoolean358 = true;
	}

	@OriginalMember(owner = "client!l", name = "m", descriptor = "(IIIII)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "YA", descriptor = "(IIII)V")
	public native void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "VA", descriptor = "(IFFFFF)V")
	public native void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!qw;)V")
	@Override
	public void method7396(@OriginalArg(0) Class283 arg0) {
		this.method4359(arg0);
		this.method4358().HA(this, Static289.anIntArray274, Static289.anIntArray277, Static289.anIntArray275, Static289.aShortArray84, arg0.aClass206_1.method4714());
	}

	@OriginalMember(owner = "client!l", name = "WA", descriptor = "()V")
	private void method4363() {
		System.gc();
		System.runFinalization();
		Static388.method5740();
	}

	@OriginalMember(owner = "client!l", name = "w", descriptor = "()Lclient!q;")
	@Override
	public Class11 method7422() {
		return new ra();
	}

	@OriginalMember(owner = "client!l", name = "FA", descriptor = "(ILclient!ua;II)V")
	public native void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "p", descriptor = "()Lclient!aj;")
	@Override
	public Class15 method7401() {
		return new Class15(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!l", name = "k", descriptor = "()Z")
	@Override
	public boolean method7384() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "IA", descriptor = "(IIIIII[BII)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!l", name = "OA", descriptor = "(Lclient!fa;II)V")
	private native void OA(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!qo;Z)Lclient!f;")
	@Override
	public Class14 method7398(@OriginalArg(0) Class279 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray456;
		@Pc(5) byte[] local5 = arg0.aByteArray80;
		@Pc(8) int local8 = arg0.anInt7341;
		@Pc(11) int local11 = arg0.anInt7340;
		@Pc(32) Class14 local32;
		if (arg1 && arg0.aByteArray79 == null) {
			local32 = new w(this, this.aM1, local2, local5, 0, arg0.anInt7341, arg0.anInt7341, arg0.anInt7340);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray79;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray456[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new t(this, this.aM1, local40, 0, arg0.anInt7341, arg0.anInt7341, arg0.anInt7340);
				} else {
					local32 = new va(this, this.aM1, local40, 0, arg0.anInt7341, arg0.anInt7341, arg0.anInt7340);
				}
			} else {
				for (@Pc(47) int local47 = 0; local47 < local11; local47++) {
					local52 = local47 * local8;
					for (local54 = 0; local54 < local8; local54++) {
						local40[local52 + local54] = local2[local5[local52 + local54] & 0xFF] | local43[local52 + local54] << 24;
					}
				}
				local32 = new t(this, this.aM1, local40, 0, local8, local8, local11);
			}
		}
		local32.Q(arg0.anInt7339, arg0.anInt7338, arg0.anInt7343, arg0.anInt7342);
		return local32;
	}

	@OriginalMember(owner = "client!l", name = "z", descriptor = "()Z")
	@Override
	public boolean method7430() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method7418(@OriginalArg(0) Class3_Sub15 arg0) {
		this.aM1 = (m) arg0;
		this.EA(arg0);
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "()Z")
	@Override
	public boolean method7363() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "g", descriptor = "()V")
	@Override
	public void method7368() {
		this.method7409(this.aTa1.aCanvas10);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4358().G(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!l", name = "L", descriptor = "()V")
	public native void L();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!qw;I)V")
	@Override
	public void method7358(@OriginalArg(0) Class283 arg0, @OriginalArg(1) int arg1) {
		this.method4359(arg0);
		this.method4358().HA(this, Static289.anIntArray274, Static289.anIntArray277, Static289.anIntArray275, Static289.aShortArray84, arg0.aClass206_1.method4714());
	}

	@OriginalMember(owner = "client!l", name = "x", descriptor = "()V")
	@Override
	public void method7426() {
	}

	@OriginalMember(owner = "client!l", name = "JA", descriptor = "()V")
	public native void JA();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ef;IIII)Lclient!da;")
	@Override
	public Class60 method7419(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new v(this, this.aM1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "()Z")
	@Override
	public boolean method7360() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "C", descriptor = "()Z")
	@Override
	public boolean method7435() {
		return true;
	}
}
