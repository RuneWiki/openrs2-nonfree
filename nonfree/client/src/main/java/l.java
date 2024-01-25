import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class l extends Class7 implements Interface18 {

	@OriginalMember(owner = "client!l", name = "t", descriptor = "Lclient!m;")
	private m aM1;

	@OriginalMember(owner = "client!l", name = "x", descriptor = "Lclient!q;")
	private Class81 aClass81_3;

	@OriginalMember(owner = "client!l", name = "L", descriptor = "Lclient!ta;")
	private ta aTa1;

	@OriginalMember(owner = "client!l", name = "O", descriptor = "I")
	public int anInt5849;

	@OriginalMember(owner = "client!l", name = "Q", descriptor = "[Lclient!qa;")
	private qa[] aQaArray1;

	@OriginalMember(owner = "client!l", name = "v", descriptor = "Z")
	private boolean aBoolean415 = false;

	@OriginalMember(owner = "client!l", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!l", name = "w", descriptor = "Lclient!au;")
	private final Class22 aClass22_39 = new Class22();

	@OriginalMember(owner = "client!l", name = "C", descriptor = "I")
	private final int anInt5847 = 4096;

	@OriginalMember(owner = "client!l", name = "D", descriptor = "I")
	private final int anInt5848 = 4096;

	@OriginalMember(owner = "client!l", name = "B", descriptor = "Lclient!mo;")
	private final Class221 aClass221_19 = new Class221(4);

	@OriginalMember(owner = "client!l", name = "P", descriptor = "Z")
	private boolean aBoolean416 = false;

	@OriginalMember(owner = "client!l", name = "J", descriptor = "Lclient!q;")
	private Class81 aClass81_4;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;)V")
	public l(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1) {
		super(arg1);
		try {
			if (!Static188.method3095("sw3d")) {
				throw new RuntimeException("");
			}
			Static379.method5897();
			this.OA(super.anInterface7_12, 0, 0);
			Static547.method7662(true, false);
			this.aBoolean416 = true;
			this.aClass81_4 = new ra();
			this.method7794(new ra());
			this.method7790(1);
			this.method7839(0);
			if (arg0 != null) {
				this.method7833(arg0);
				this.method7796(arg0);
			}
		} catch (@Pc(78) Throwable local78) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!l", name = "va", descriptor = "(I)V")
	public native void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "J", descriptor = "(IIIIII)V")
	public native void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I")
	@Override
	public int method7778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!l", name = "OA", descriptor = "(Lclient!fa;II)V")
	private native void OA(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!l", name = "JA", descriptor = "()V")
	public native void JA();

	@OriginalMember(owner = "client!l", name = "z", descriptor = "()Z")
	@Override
	public boolean method7847() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "L", descriptor = "()V")
	public native void L();

	@OriginalMember(owner = "client!l", name = "FA", descriptor = "(ILclient!ua;II)V")
	public native void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class88 method7838(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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

	@OriginalMember(owner = "client!l", name = "IA", descriptor = "(IIIIII[BII)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!l", name = "R", descriptor = "()V")
	private native void R();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	@Override
	public void method7790(@OriginalArg(0) int arg0) {
		this.anInt5849 = arg0;
		this.aQaArray1 = new qa[this.anInt5849];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5849; local9++) {
			this.aQaArray1[local9] = new qa(this, this.anInt5847, this.anInt5848);
		}
	}

	@OriginalMember(owner = "client!l", name = "v", descriptor = "()[I")
	public native int[] v();

	@OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V")
	@Override
	public void method7839(@OriginalArg(0) int arg0) {
		this.aQaArray1[arg0].method6246();
	}

	@OriginalMember(owner = "client!l", name = "la", descriptor = "(IIII)V")
	public native void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "qa", descriptor = "(I)V")
	private native void qa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7836(@OriginalArg(0) Canvas arg0) {
		if (this.aTa1.aCanvas12 == arg0) {
			this.method7796(null);
		}
		@Pc(16) ta local16 = (ta) this.aClass221_19.method5075((long) arg0.hashCode());
		if (local16 != null) {
			local16.method8193();
			local16.method7167();
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ll;[Lclient!fda;Z)Lclient!la;")
	@Override
	public Class45 method7837(@OriginalArg(0) Class198 arg0, @OriginalArg(1) Class103[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt3039;
			local7[local11] = arg1[local11].anInt3041;
			if (arg1[local11].aByteArray22 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new c(this, this.aM1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!l", name = "A", descriptor = "()V")
	@Override
	public void method7849() {
	}

	@OriginalMember(owner = "client!l", name = "MA", descriptor = "(III[I)V")
	public native void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!l", name = "D", descriptor = "()Lclient!qa;")
	public qa method4576() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5849; local1++) {
			if (this.aQaArray1[local1].aRunnable1 == Thread.currentThread()) {
				return this.aQaArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!l", name = "k", descriptor = "()Lclient!q;")
	@Override
	public Class81 method7812() {
		return this.aClass81_4;
	}

	@OriginalMember(owner = "client!l", name = "m", descriptor = "()Lclient!sr;")
	@Override
	public Class308 method7815() {
		return new Class308(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V")
	@Override
	public void method7810(@OriginalArg(0) int arg0) {
		this.aQaArray1[arg0].method6247();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!pa;Lclient!pa;FLclient!pa;)Lclient!pa;")
	@Override
	public Class112 method7816(@OriginalArg(0) Class112 arg0, @OriginalArg(1) Class112 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class112 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4576().G(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!l", name = "Z", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void Z(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!l", name = "T", descriptor = "()I")
	public native int T();

	@OriginalMember(owner = "client!l", name = "ia", descriptor = "(Lclient!ta;)V")
	private native void ia(@OriginalArg(0) ta arg0);

	@OriginalMember(owner = "client!l", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!l", name = "f", descriptor = "()Z")
	@Override
	public boolean method7795() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(I)Lclient!e;")
	@Override
	public Class4_Sub8 method7818(@OriginalArg(0) int arg0) {
		@Pc(5) m local5 = new m(this, arg0);
		this.aClass22_39.method894(local5);
		return local5;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class115 method7804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new s(this, this.aM1, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "DA", descriptor = "()I")
	public native int DA();

	@OriginalMember(owner = "client!l", name = "w", descriptor = "(IIIIII)V")
	private native void w(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "pa", descriptor = "(III)V")
	public native void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!l", name = "GA", descriptor = "(II)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!l", name = "xa", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void xa(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!l", name = "ma", descriptor = "(Lclient!t;)V")
	private native void ma(@OriginalArg(0) t arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!cr;IIII)Lclient!da;")
	@Override
	public Class65 method7828(@OriginalArg(0) Class59 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new v(this, this.aM1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!l", name = "t", descriptor = "()Z")
	@Override
	public boolean method7834() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([I)V")
	@Override
	public void method7806(@OriginalArg(0) int[] arg0) {
		@Pc(4) Dimension local4 = this.aTa1.aCanvas12.getSize();
		arg0[0] = local4.width;
		arg0[1] = local4.height;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
	@Override
	public void method7805(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!l", name = "q", descriptor = "(Lclient!va;)V")
	private native void q(@OriginalArg(0) va arg0);

	@OriginalMember(owner = "client!l", name = "u", descriptor = "()I")
	@Override
	public int method7835() {
		return 4;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7796(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aTa1 = null;
			this.ia(null);
		} else {
			@Pc(10) ta local10 = (ta) this.aClass221_19.method5075((long) arg0.hashCode());
			this.aTa1 = local10;
			this.ia(local10);
		}
	}

	@OriginalMember(owner = "client!l", name = "w", descriptor = "()Lclient!q;")
	@Override
	public Class81 method7842() {
		return new ra();
	}

	@OriginalMember(owner = "client!l", name = "o", descriptor = "()Z")
	@Override
	public boolean method7821() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "()V")
	@Override
	public void method7780() {
	}

	@OriginalMember(owner = "client!l", name = "NA", descriptor = "(Lclient!q;)V")
	private native void NA(@OriginalArg(0) Class81 arg0);

	@OriginalMember(owner = "client!l", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method7792();
		if (this.nativeid != 0L) {
			Static379.method5898(this);
		}
	}

	@OriginalMember(owner = "client!l", name = "EA", descriptor = "(Lclient!e;)V")
	private native void EA(@OriginalArg(0) Class4_Sub8 arg0);

	@OriginalMember(owner = "client!l", name = "oa", descriptor = "([I)V")
	public native void oa(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!l", name = "s", descriptor = "()Z")
	@Override
	public boolean method7831() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "l", descriptor = "()Z")
	@Override
	public boolean method7813() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "h", descriptor = "(IIII)[I")
	public native int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "q", descriptor = "()V")
	@Override
	public void method7827() throws Exception_Sub1 {
		if (this.aTa1 == null) {
			throw new IllegalStateException("off");
		}
		this.aTa1.method7164();
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method7824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.XA(arg0, arg1, arg2, arg4, arg5);
		this.XA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.m(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.m(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "n", descriptor = "()Z")
	@Override
	public boolean method7820() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "W", descriptor = "(S)Z")
	private boolean method4577(@OriginalArg(0) short arg0) {
		@Pc(2) Interface7 local2 = super.anInterface7_12;
		synchronized (super.anInterface7_12) {
			if (!super.anInterface7_12.method4463(arg0)) {
				return false;
			}
			@Pc(22) Class69 local22 = super.anInterface7_12.method4460(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(43) int[] local43;
			if (local22.aBoolean180) {
				local43 = super.anInterface7_12.method4464(128, arg0, 0.7F, 128);
			} else {
				local43 = super.anInterface7_12.method4462(128, true, arg0, 0.7F, 128);
			}
			this.xa(arg0, local22.aByte43, local22.aByte46, local22.aBoolean177, local22.aBoolean182, local22.aBoolean176, local22.aByte41, local22.aByte42, local22.aByte40, local22.aShort21, local22.anInt2293, local22.aBoolean183, local22.aBoolean178, local43);
			return true;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method7848(@OriginalArg(0) Class88 arg0) {
		if (arg0 instanceof va) {
			this.q((va) arg0);
		} else if (arg0 instanceof t) {
			this.ma((t) arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!l", name = "ja", descriptor = "(I)V")
	public native void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "XA", descriptor = "(IIIII)V")
	public native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method7851(@OriginalArg(0) Class4_Sub8 arg0) {
		this.aM1 = (m) arg0;
		this.EA(arg0);
	}

	@OriginalMember(owner = "client!l", name = "I", descriptor = "(I[I[F)V")
	private native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!l", name = "B", descriptor = "()Z")
	@Override
	public boolean method7850() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "BA", descriptor = "()I")
	public native int BA();

	@OriginalMember(owner = "client!l", name = "WA", descriptor = "()V")
	private void method4578() {
		System.gc();
		System.runFinalization();
		Static379.method5896();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "()Z")
	@Override
	public boolean method7779() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "YA", descriptor = "(IIII)V")
	public native void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.w(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7794(@OriginalArg(0) Class81 arg0) {
		this.aClass81_3 = arg0;
		this.NA(arg0);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class67 method7787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new za(this, this.aM1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!l", name = "m", descriptor = "(IIIII)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "AA", descriptor = "(III[I)V")
	public native void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!l", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!l", name = "j", descriptor = "()V")
	@Override
	public void method7811() {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!qg;I)V")
	@Override
	public void method7832(@OriginalArg(0) Class276 arg0, @OriginalArg(1) int arg1) {
		this.method4579(arg0);
		this.method4576().HA(this, Static285.anIntArray321, Static285.anIntArray320, Static285.anIntArray316, Static285.aShortArray64, arg0.aClass39_1.method1137());
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "()Lclient!q;")
	@Override
	public Class81 method7781() {
		return this.aClass81_3;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!qg;Z)V")
	private void method4579(@OriginalArg(0) Class276 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class21_Sub3_Sub1 local15 = (Class21_Sub3_Sub1) arg0.aClass39_1.method1136(); local15 != null; local15 = (Class21_Sub3_Sub1) arg0.aClass39_1.method1135()) {
			Static285.anIntArray321[local1++] = local15.anInt8632;
			Static285.anIntArray321[local1++] = local15.anInt8629;
			Static285.anIntArray321[local1++] = local15.anInt8627;
			Static285.anIntArray320[local3++] = local15.anInt8631;
			Static285.aShortArray64[local7++] = (short) local15.anInt8630;
			Static285.anIntArray316[local5++] = local15.anInt8623;
		}
	}

	@OriginalMember(owner = "client!l", name = "O", descriptor = "(IIIIII)Z")
	public native boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class88 method7855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new t(this, this.aM1, arg0, arg1);
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "()I")
	public native int b();

	@OriginalMember(owner = "client!l", name = "i", descriptor = "()Z")
	@Override
	public boolean method7807() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(IIIIII)Lclient!pa;")
	@Override
	public Class112 method7829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method7814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class67 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.Q(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!pa;)V")
	@Override
	public void method7784(@OriginalArg(0) Class112 arg0) {
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(IIIII)V")
	protected native void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "fa", descriptor = "()Ljava/lang/Object;")
	private Object method4580() {
		return new h(this);
	}

	@OriginalMember(owner = "client!l", name = "y", descriptor = "()Z")
	@Override
	public boolean method7845() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "C", descriptor = "()V")
	@Override
	public void method7854() {
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
	@Override
	public void method7791(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V")
	@Override
	public void method7826(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7841() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7840(@OriginalArg(0) Canvas arg0) {
		@Pc(8) ta local8 = (ta) this.aClass221_19.method5075((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.AA(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aTa1.aCanvas12) {
			this.method7796(arg0);
		}
	}

	@OriginalMember(owner = "client!l", name = "h", descriptor = "()Z")
	@Override
	public boolean method7803() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class88 method7788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new t(this, this.aM1, arg0, arg1, arg2, arg3) : new va(this, this.aM1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!l", name = "A", descriptor = "(S)Z")
	private boolean method4581(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class69 local9 = super.anInterface7_12.method4460(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.Z(arg0, local9.aByte43, local9.aByte46, local9.aBoolean177, local9.aBoolean182, local9.aBoolean176, local9.aByte41, local9.aByte42, local9.aByte40, local9.aShort21, local9.anInt2293, local9.aBoolean183, local9.aBoolean178);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "g", descriptor = "()Z")
	@Override
	public boolean method7802() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "Q", descriptor = "(IIIIIILclient!ua;II)V")
	private native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class67 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7799(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aTa1 == null) {
			throw new IllegalStateException("off");
		}
		this.aTa1.method7166(arg0, arg1);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!qg;)V")
	@Override
	public void method7777(@OriginalArg(0) Class276 arg0) {
		this.method4579(arg0);
		this.method4576().HA(this, Static285.anIntArray321, Static285.anIntArray320, Static285.anIntArray316, Static285.aShortArray64, arg0.aClass39_1.method1137());
	}

	@OriginalMember(owner = "client!l", name = "x", descriptor = "()V")
	@Override
	public void method7843() {
		this.method7796(this.aTa1.aCanvas12);
	}

	@OriginalMember(owner = "client!l", name = "ZA", descriptor = "(Z)V")
	public native void ZA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I[Lclient!am;)V")
	@Override
	public void method7852(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub3[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static285.anIntArray317[local1++] = arg1[local3].method4954();
			Static285.anIntArray317[local1++] = arg1[local3].method4953();
			Static285.anIntArray317[local1++] = arg1[local3].method4949();
			Static285.anIntArray317[local1++] = arg1[local3].method4950();
			Static285.aFloatArray44[local3] = arg1[local3].method4955();
			Static285.anIntArray317[local1++] = arg1[local3].method4952();
		}
		this.I(arg0, Static285.anIntArray317, Static285.aFloatArray44);
	}

	@OriginalMember(owner = "client!l", name = "V", descriptor = "(IIII)V")
	public native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "CA", descriptor = "(IIII)V")
	public native void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "r", descriptor = "()V")
	@Override
	public void method7830() {
	}

	@OriginalMember(owner = "client!l", name = "da", descriptor = "(IIII)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIF)Lclient!am;")
	@Override
	public Class4_Sub3 method7819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class4_Sub3_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "()Z")
	@Override
	public boolean method7782() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "p", descriptor = "()V")
	@Override
	protected void method7822() {
		if (this.aBoolean415) {
			return;
		}
		this.aQaArray1 = null;
		this.aTa1 = null;
		this.aM1 = null;
		this.aClass81_4 = null;
		this.aClass221_19.method5078();
		for (@Pc(25) m local25 = (m) this.aClass22_39.method895(); local25 != null; local25 = (m) this.aClass22_39.method889()) {
			local25.D();
		}
		this.aClass22_39.method886();
		this.R();
		if (this.aBoolean416) {
			Static506.method7293(false, true);
			this.aBoolean416 = false;
		}
		this.method4578();
		Static379.method5899();
		this.aBoolean415 = true;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7833(@OriginalArg(0) Canvas arg0) {
		@Pc(8) ta local8 = (ta) this.aClass221_19.method5075((long) arg0.hashCode());
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
		this.aClass221_19.method5073(local8, (long) arg0.hashCode());
	}

	@OriginalMember(owner = "client!l", name = "ra", descriptor = "(F)V")
	public native void ra(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!l", name = "h", descriptor = "(I)V")
	@Override
	public void method7853(@OriginalArg(0) int arg0) {
		Static379.method5896();
		this.qa(arg0);
		for (@Pc(10) m local10 = (m) this.aClass22_39.method895(); local10 != null; local10 = (m) this.aClass22_39.method889()) {
			local10.Z();
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7801(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!l", name = "VA", descriptor = "(IFFFFF)V")
	public native void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!fda;Z)Lclient!f;")
	@Override
	public Class88 method7808(@OriginalArg(0) Class103 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray142;
		@Pc(5) byte[] local5 = arg0.aByteArray23;
		@Pc(8) int local8 = arg0.anInt3039;
		@Pc(11) int local11 = arg0.anInt3041;
		@Pc(32) Class88 local32;
		if (arg1 && arg0.aByteArray22 == null) {
			local32 = new w(this, this.aM1, local2, local5, 0, arg0.anInt3039, arg0.anInt3039, arg0.anInt3041);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray22;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray142[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new t(this, this.aM1, local40, 0, arg0.anInt3039, arg0.anInt3039, arg0.anInt3041);
				} else {
					local32 = new va(this, this.aM1, local40, 0, arg0.anInt3039, arg0.anInt3039, arg0.anInt3041);
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
		local32.Q(arg0.anInt3037, arg0.anInt3038, arg0.anInt3036, arg0.anInt3040);
		return local32;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(II)I")
	@Override
	public int method7793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}
}
