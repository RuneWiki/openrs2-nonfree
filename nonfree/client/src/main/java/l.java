import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class l extends Class100 implements Interface21 {

	@OriginalMember(owner = "client!l", name = "q", descriptor = "Lclient!m;")
	private m aM1;

	@OriginalMember(owner = "client!l", name = "F", descriptor = "Lclient!ta;")
	private ta aTa1;

	@OriginalMember(owner = "client!l", name = "H", descriptor = "Lclient!q;")
	private Class68 aClass68_5;

	@OriginalMember(owner = "client!l", name = "J", descriptor = "I")
	public int anInt5334;

	@OriginalMember(owner = "client!l", name = "K", descriptor = "[Lclient!qa;")
	private qa[] aQaArray1;

	@OriginalMember(owner = "client!l", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!l", name = "B", descriptor = "Z")
	private boolean aBoolean421 = false;

	@OriginalMember(owner = "client!l", name = "p", descriptor = "Lclient!ae;")
	private final Class8 aClass8_28 = new Class8();

	@OriginalMember(owner = "client!l", name = "D", descriptor = "I")
	private final int anInt5333 = 4096;

	@OriginalMember(owner = "client!l", name = "C", descriptor = "I")
	private final int anInt5332 = 4096;

	@OriginalMember(owner = "client!l", name = "E", descriptor = "Lclient!il;")
	private final Class162 aClass162_24 = new Class162(4);

	@OriginalMember(owner = "client!l", name = "I", descriptor = "Z")
	private boolean aBoolean422 = false;

	@OriginalMember(owner = "client!l", name = "G", descriptor = "Lclient!q;")
	private Class68 aClass68_4;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;)V")
	public l(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface5 arg1) {
		super(arg1);
		try {
			if (!Static533.method7648("sw3d")) {
				throw new RuntimeException("");
			}
			Static214.method3450();
			this.OA(super.anInterface5_10, 0, 0);
			Static165.method2887(false, true);
			this.aBoolean422 = true;
			this.aClass68_4 = new ra();
			this.method6217(new ra());
			this.method6249(1);
			this.method6244(0);
			if (arg0 != null) {
				this.method6251(arg0);
				this.method6201(arg0);
			}
		} catch (@Pc(78) Throwable local78) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V")
	@Override
	public void method6239(@OriginalArg(0) int arg0) {
		this.aQaArray1[arg0].method6046();
	}

	@OriginalMember(owner = "client!l", name = "BA", descriptor = "()I")
	public native int BA();

	@OriginalMember(owner = "client!l", name = "n", descriptor = "()Z")
	@Override
	public boolean method6218() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method6237(@OriginalArg(0) Class39 arg0) {
		if (arg0 instanceof va) {
			this.q((va) arg0);
		} else if (arg0 instanceof t) {
			this.ma((t) arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!l", name = "EA", descriptor = "(Lclient!e;)V")
	private native void EA(@OriginalArg(0) Class2_Sub13 arg0);

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method6212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.XA(arg0, arg1, arg2, arg4, arg5);
		this.XA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.m(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.m(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "A", descriptor = "(S)Z")
	private boolean method4478(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class343 local9 = super.anInterface5_10.method917(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.Z(arg0, local9.aByte119, local9.aByte115, local9.aBoolean696, local9.aBoolean704, local9.aBoolean705, local9.aByte118, local9.aByte114, local9.aByte117, local9.aShort109, local9.anInt9124, local9.aBoolean699, local9.aBoolean701);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!jt;)V")
	@Override
	public void method6252(@OriginalArg(0) Class37 arg0) {
	}

	@OriginalMember(owner = "client!l", name = "I", descriptor = "(I[I[F)V")
	private native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!l", name = "O", descriptor = "(IIIIII)Z")
	public native boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "j", descriptor = "()V")
	@Override
	public void method6198() {
	}

	@OriginalMember(owner = "client!l", name = "YA", descriptor = "(IIII)V")
	public native void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "d", descriptor = "()Z")
	@Override
	public boolean method6186() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "D", descriptor = "()Lclient!qa;")
	public qa method4479() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5334; local1++) {
			if (this.aQaArray1[local1].aRunnable2 == Thread.currentThread()) {
				return this.aQaArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6202(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aTa1 == null) {
			throw new IllegalStateException("off");
		}
		this.aTa1.method6968(arg0, arg1);
	}

	@OriginalMember(owner = "client!l", name = "u", descriptor = "()V")
	@Override
	public void method6238() throws Exception_Sub1 {
		if (this.aTa1 == null) {
			throw new IllegalStateException("off");
		}
		this.aTa1.method6969();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!sa;[Lclient!aga;Z)Lclient!la;")
	@Override
	public Class29 method6225(@OriginalArg(0) Class294 arg0, @OriginalArg(1) Class13[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt427;
			local7[local11] = arg1[local11].anInt428;
			if (arg1[local11].aByteArray4 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new c(this, this.aM1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(IIIIII)Lclient!jt;")
	@Override
	public Class37 method6214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!l", name = "MA", descriptor = "(III[I)V")
	public native void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!l", name = "ma", descriptor = "(Lclient!t;)V")
	private native void ma(@OriginalArg(0) t arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ir;)V")
	@Override
	public void method6193(@OriginalArg(0) Class164 arg0) {
		this.method4482(arg0);
		this.method4479().HA(this, Static294.anIntArray378, Static294.anIntArray379, Static294.anIntArray376, Static294.aShortArray95, arg0.aClass234_1.method5480());
	}

	@OriginalMember(owner = "client!l", name = "VA", descriptor = "(IFFFFF)V")
	public native void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!l", name = "p", descriptor = "()Lclient!q;")
	@Override
	public Class68 method6222() {
		return this.aClass68_4;
	}

	@OriginalMember(owner = "client!l", name = "l", descriptor = "()Z")
	@Override
	public boolean method6206() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "()I")
	@Override
	public int method6185() {
		return 4;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(II)I")
	@Override
	public int method6216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ir;I)V")
	@Override
	public void method6257(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1) {
		this.method4482(arg0);
		this.method4479().HA(this, Static294.anIntArray378, Static294.anIntArray379, Static294.anIntArray376, Static294.aShortArray95, arg0.aClass234_1.method5480());
	}

	@OriginalMember(owner = "client!l", name = "CA", descriptor = "(IIII)V")
	public native void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "y", descriptor = "()Lclient!oa;")
	@Override
	public Class237 method6247() {
		return new Class237(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!l", name = "m", descriptor = "(IIIII)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "w", descriptor = "()V")
	@Override
	public void method6245() {
	}

	@OriginalMember(owner = "client!l", name = "k", descriptor = "()V")
	@Override
	public void method6203() {
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V")
	@Override
	public void method6242(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!l", name = "z", descriptor = "()Z")
	@Override
	public boolean method6248() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method6259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class20 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.Q(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class67 method6195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new s(this, this.aM1, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "Q", descriptor = "(IIIIIILclient!ua;II)V")
	private native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class20 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!l", name = "xa", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void xa(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!l", name = "o", descriptor = "()Z")
	@Override
	public boolean method6219() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "FA", descriptor = "(ILclient!ua;II)V")
	public native void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "WA", descriptor = "()V")
	private void method4480() {
		System.gc();
		System.runFinalization();
		Static214.method3451();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6260(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(I)Lclient!e;")
	@Override
	public Class2_Sub13 method6234(@OriginalArg(0) int arg0) {
		@Pc(5) m local5 = new m(this, arg0);
		this.aClass8_28.method212(local5);
		return local5;
	}

	@OriginalMember(owner = "client!l", name = "v", descriptor = "()[I")
	public native int[] v();

	@OriginalMember(owner = "client!l", name = "JA", descriptor = "()V")
	public native void JA();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I")
	@Override
	public int method6215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!eg;IIII)Lclient!da;")
	@Override
	public Class66 method6191(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new v(this, this.aM1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6227(@OriginalArg(0) Canvas arg0) {
		if (this.aTa1.aCanvas13 == arg0) {
			this.method6201(null);
		}
		@Pc(16) ta local16 = (ta) this.aClass162_24.method3519((long) arg0.hashCode());
		if (local16 != null) {
			local16.method7966();
			local16.method6966();
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4479().G(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(IIIII)V")
	protected native void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "x", descriptor = "()Z")
	@Override
	public boolean method6246() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I[Lclient!gga;)V")
	@Override
	public void method6188(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub14[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static294.anIntArray377[local1++] = arg1[local3].method7694();
			Static294.anIntArray377[local1++] = arg1[local3].method7696();
			Static294.anIntArray377[local1++] = arg1[local3].method7693();
			Static294.anIntArray377[local1++] = arg1[local3].method7691();
			Static294.aFloatArray42[local3] = arg1[local3].method7689();
			Static294.anIntArray377[local1++] = arg1[local3].method7687();
		}
		this.I(arg0, Static294.anIntArray377, Static294.aFloatArray42);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class39 method6226(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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

	@OriginalMember(owner = "client!l", name = "m", descriptor = "()Z")
	@Override
	public boolean method6208() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "g", descriptor = "()Z")
	@Override
	public boolean method6194() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "ja", descriptor = "(I)V")
	public native void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "va", descriptor = "(I)V")
	public native void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([I)V")
	@Override
	public void method6211(@OriginalArg(0) int[] arg0) {
		@Pc(4) Dimension local4 = this.aTa1.aCanvas13.getSize();
		arg0[0] = local4.width;
		arg0[1] = local4.height;
	}

	@OriginalMember(owner = "client!l", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!l", name = "i", descriptor = "()Z")
	@Override
	public boolean method6197() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "t", descriptor = "()Lclient!q;")
	@Override
	public Class68 method6235() {
		return this.aClass68_5;
	}

	@OriginalMember(owner = "client!l", name = "ZA", descriptor = "(Z)V")
	public native void ZA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIF)Lclient!gga;")
	@Override
	public Class2_Sub14 method6209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub14_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "T", descriptor = "()I")
	public native int T();

	@OriginalMember(owner = "client!l", name = "h", descriptor = "(IIII)[I")
	public native int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
	@Override
	public void method6199(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!l", name = "L", descriptor = "()V")
	public native void L();

	@OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V")
	@Override
	public void method6244(@OriginalArg(0) int arg0) {
		this.aQaArray1[arg0].method6044();
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
	@Override
	public void method6229(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!l", name = "qa", descriptor = "(I)V")
	private native void qa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "R", descriptor = "()V")
	private native void R();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6220() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!l", name = "DA", descriptor = "()I")
	public native int DA();

	@OriginalMember(owner = "client!l", name = "AA", descriptor = "(III[I)V")
	public native void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!l", name = "e", descriptor = "()Z")
	@Override
	public boolean method6187() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "la", descriptor = "(IIII)V")
	public native void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "r", descriptor = "()Z")
	@Override
	public boolean method6230() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "W", descriptor = "(S)Z")
	private boolean method4481(@OriginalArg(0) short arg0) {
		@Pc(2) Interface5 local2 = super.anInterface5_10;
		synchronized (super.anInterface5_10) {
			if (!super.anInterface5_10.method914(arg0)) {
				return false;
			}
			@Pc(22) Class343 local22 = super.anInterface5_10.method917(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(43) int[] local43;
			if (local22.aBoolean702) {
				local43 = super.anInterface5_10.method915(0.7F, 128, 128, arg0);
			} else {
				local43 = super.anInterface5_10.method916(arg0, 0.7F, true, 128, 128);
			}
			this.xa(arg0, local22.aByte119, local22.aByte115, local22.aBoolean696, local22.aBoolean704, local22.aBoolean705, local22.aByte118, local22.aByte114, local22.aByte117, local22.aShort109, local22.anInt9124, local22.aBoolean699, local22.aBoolean701, local43);
			return true;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	@Override
	public void method6205(@OriginalArg(0) int arg0) {
		Static214.method3451();
		this.qa(arg0);
		for (@Pc(10) m local10 = (m) this.aClass8_28.method210(); local10 != null; local10 = (m) this.aClass8_28.method218()) {
			local10.Z();
		}
	}

	@OriginalMember(owner = "client!l", name = "s", descriptor = "()V")
	@Override
	public void method6231() {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class39 method6236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new t(this, this.aM1, arg0, arg1, arg2, arg3) : new va(this, this.aM1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!l", name = "ra", descriptor = "(F)V")
	public native void ra(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!l", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ir;Z)V")
	private void method4482(@OriginalArg(0) Class164 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class6_Sub3_Sub1 local15 = (Class6_Sub3_Sub1) arg0.aClass234_1.method5477(); local15 != null; local15 = (Class6_Sub3_Sub1) arg0.aClass234_1.method5483()) {
			Static294.anIntArray378[local1++] = local15.anInt2921;
			Static294.anIntArray378[local1++] = local15.anInt2919;
			Static294.anIntArray378[local1++] = local15.anInt2917;
			Static294.anIntArray379[local3++] = local15.anInt2915;
			Static294.aShortArray95[local7++] = (short) local15.anInt2924;
			Static294.anIntArray376[local5++] = local15.anInt2914;
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "()I")
	public native int b();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method6217(@OriginalArg(0) Class68 arg0) {
		this.aClass68_5 = arg0;
		this.NA(arg0);
	}

	@OriginalMember(owner = "client!l", name = "OA", descriptor = "(Lclient!fa;II)V")
	private native void OA(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!l", name = "oa", descriptor = "([I)V")
	public native void oa(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!l", name = "ia", descriptor = "(Lclient!ta;)V")
	private native void ia(@OriginalArg(0) ta arg0);

	@OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method6262();
		if (this.nativeid != 0L) {
			Static214.method3448(this);
		}
	}

	@OriginalMember(owner = "client!l", name = "GA", descriptor = "(II)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V")
	@Override
	public void method6249(@OriginalArg(0) int arg0) {
		this.anInt5334 = arg0;
		this.aQaArray1 = new qa[this.anInt5334];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5334; local9++) {
			this.aQaArray1[local9] = new qa(this, this.anInt5332, this.anInt5333);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!jt;Lclient!jt;FLclient!jt;)Lclient!jt;")
	@Override
	public Class37 method6210(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class37 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class37 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.w(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "Z", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void Z(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!l", name = "f", descriptor = "()Z")
	@Override
	public boolean method6192() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6207(@OriginalArg(0) Canvas arg0) {
		@Pc(8) ta local8 = (ta) this.aClass162_24.method3519((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.AA(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aTa1.aCanvas13) {
			this.method6201(arg0);
		}
	}

	@OriginalMember(owner = "client!l", name = "A", descriptor = "()V")
	@Override
	protected void method6250() {
		if (this.aBoolean421) {
			return;
		}
		this.aQaArray1 = null;
		this.aTa1 = null;
		this.aM1 = null;
		this.aClass68_4 = null;
		this.aClass162_24.method3518();
		for (@Pc(25) m local25 = (m) this.aClass8_28.method210(); local25 != null; local25 = (m) this.aClass8_28.method218()) {
			local25.D();
		}
		this.aClass8_28.method220();
		this.R();
		if (this.aBoolean422) {
			Static304.method4555(false, true);
			this.aBoolean422 = false;
		}
		this.method4480();
		Static214.method3449();
		this.aBoolean421 = true;
	}

	@OriginalMember(owner = "client!l", name = "V", descriptor = "(IIII)V")
	public native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class39 method6204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new t(this, this.aM1, arg0, arg1);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!aga;Z)Lclient!f;")
	@Override
	public Class39 method6256(@OriginalArg(0) Class13 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray32;
		@Pc(5) byte[] local5 = arg0.aByteArray3;
		@Pc(8) int local8 = arg0.anInt427;
		@Pc(11) int local11 = arg0.anInt428;
		@Pc(32) Class39 local32;
		if (arg1 && arg0.aByteArray4 == null) {
			local32 = new w(this, this.aM1, local2, local5, 0, arg0.anInt427, arg0.anInt427, arg0.anInt428);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray4;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray32[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new t(this, this.aM1, local40, 0, arg0.anInt427, arg0.anInt427, arg0.anInt428);
				} else {
					local32 = new va(this, this.aM1, local40, 0, arg0.anInt427, arg0.anInt427, arg0.anInt428);
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
		local32.Q(arg0.anInt429, arg0.anInt430, arg0.anInt426, arg0.anInt431);
		return local32;
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6251(@OriginalArg(0) Canvas arg0) {
		@Pc(8) ta local8 = (ta) this.aClass162_24.method3519((long) arg0.hashCode());
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
		this.aClass162_24.method3522(local8, (long) arg0.hashCode());
	}

	@OriginalMember(owner = "client!l", name = "IA", descriptor = "(IIIIII[BII)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!l", name = "pa", descriptor = "(III)V")
	public native void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!l", name = "B", descriptor = "()Z")
	@Override
	public boolean method6254() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "fa", descriptor = "()Ljava/lang/Object;")
	private Object method4483() {
		return new h(this);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!l", name = "NA", descriptor = "(Lclient!q;)V")
	private native void NA(@OriginalArg(0) Class68 arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class20 method6240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new za(this, this.aM1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!l", name = "q", descriptor = "(Lclient!va;)V")
	private native void q(@OriginalArg(0) va arg0);

	@OriginalMember(owner = "client!l", name = "q", descriptor = "()V")
	@Override
	public void method6228() {
		this.method6201(this.aTa1.aCanvas13);
	}

	@OriginalMember(owner = "client!l", name = "da", descriptor = "(IIII)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "XA", descriptor = "(IIIII)V")
	public native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "h", descriptor = "()Z")
	@Override
	public boolean method6196() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6201(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aTa1 = null;
			this.ia(null);
		} else {
			@Pc(10) ta local10 = (ta) this.aClass162_24.method3519((long) arg0.hashCode());
			this.aTa1 = local10;
			this.ia(local10);
		}
	}

	@OriginalMember(owner = "client!l", name = "C", descriptor = "()Lclient!q;")
	@Override
	public Class68 method6258() {
		return new ra();
	}

	@OriginalMember(owner = "client!l", name = "w", descriptor = "(IIIIII)V")
	private native void w(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "()V")
	@Override
	public void method6184() {
	}

	@OriginalMember(owner = "client!l", name = "J", descriptor = "(IIIIII)V")
	public native void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method6223(@OriginalArg(0) Class2_Sub13 arg0) {
		this.aM1 = (m) arg0;
		this.EA(arg0);
	}
}
