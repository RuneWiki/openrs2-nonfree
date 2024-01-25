import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class l extends Class134 implements Interface15 {

	@OriginalMember(owner = "client!l", name = "p", descriptor = "Lclient!m;")
	private m aM1;

	@OriginalMember(owner = "client!l", name = "s", descriptor = "Lclient!q;")
	private Class113 aClass113_3;

	@OriginalMember(owner = "client!l", name = "G", descriptor = "Lclient!ta;")
	private ta aTa1;

	@OriginalMember(owner = "client!l", name = "I", descriptor = "I")
	public int anInt4961;

	@OriginalMember(owner = "client!l", name = "J", descriptor = "[Lclient!qa;")
	private qa[] aQaArray1;

	@OriginalMember(owner = "client!l", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!l", name = "q", descriptor = "Z")
	private boolean aBoolean405 = false;

	@OriginalMember(owner = "client!l", name = "o", descriptor = "Lclient!wba;")
	private final Class353 aClass353_29 = new Class353();

	@OriginalMember(owner = "client!l", name = "B", descriptor = "I")
	private final int anInt4960 = 4096;

	@OriginalMember(owner = "client!l", name = "u", descriptor = "I")
	private final int anInt4959 = 4096;

	@OriginalMember(owner = "client!l", name = "C", descriptor = "Lclient!kea;")
	private final Class187 aClass187_20 = new Class187(4);

	@OriginalMember(owner = "client!l", name = "K", descriptor = "Z")
	private boolean aBoolean406 = false;

	@OriginalMember(owner = "client!l", name = "D", descriptor = "Lclient!q;")
	private Class113 aClass113_4;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;)V")
	public l(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1) {
		super(arg1);
		try {
			if (!Static342.method4694("sw3d")) {
				throw new RuntimeException("");
			}
			Static289.method4084();
			this.OA(super.anInterface7_10, 0, 0);
			Static209.method3312(false, true);
			this.aBoolean406 = true;
			this.aClass113_4 = new ra();
			this.method6919(new ra());
			this.method6966(1);
			this.method6943(0);
			if (arg0 != null) {
				this.method6946(arg0);
				this.method6937(arg0);
			}
		} catch (@Pc(78) Throwable local78) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!l", name = "n", descriptor = "()Lclient!q;")
	@Override
	public Class113 method6924() {
		return new ra();
	}

	@OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V")
	@Override
	public void method6965(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!l", name = "qa", descriptor = "(I)V")
	private native void qa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "m", descriptor = "(IIIII)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "f", descriptor = "()Z")
	@Override
	public boolean method6905() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "I", descriptor = "(I[I[F)V")
	private native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "()Z")
	@Override
	public boolean method6897() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "V", descriptor = "(IIII)V")
	public native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "A", descriptor = "()Z")
	@Override
	public boolean method6968() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "t", descriptor = "()Z")
	@Override
	public boolean method6952() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "BA", descriptor = "()I")
	public native int BA();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6901(@OriginalArg(0) Canvas arg0) {
		if (this.aTa1.aCanvas13 == arg0) {
			this.method6937(null);
		}
		@Pc(16) ta local16 = (ta) this.aClass187_20.method3797((long) arg0.hashCode());
		if (local16 != null) {
			local16.method7859();
			local16.method6637();
		}
	}

	@OriginalMember(owner = "client!l", name = "xa", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void xa(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V")
	@Override
	public void method6966(@OriginalArg(0) int arg0) {
		this.anInt4961 = arg0;
		this.aQaArray1 = new qa[this.anInt4961];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4961; local9++) {
			this.aQaArray1[local9] = new qa(this, this.anInt4960, this.anInt4959);
		}
	}

	@OriginalMember(owner = "client!l", name = "J", descriptor = "(IIIIII)V")
	public native void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!jba;)V")
	@Override
	public void method6913(@OriginalArg(0) Class83 arg0) {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)Lclient!jba;")
	@Override
	public Class83 method6911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(IIIII)V")
	protected native void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "W", descriptor = "(S)Z")
	private boolean method4037(@OriginalArg(0) short arg0) {
		@Pc(2) Interface7 local2 = super.anInterface7_10;
		synchronized (super.anInterface7_10) {
			if (!super.anInterface7_10.method3871(arg0)) {
				return false;
			}
			@Pc(22) Class3 local22 = super.anInterface7_10.method3874(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(43) int[] local43;
			if (local22.aBoolean10) {
				local43 = super.anInterface7_10.method3872(128, 128, arg0, 0.7F);
			} else {
				local43 = super.anInterface7_10.method3869(128, arg0, 0.7F, 128, true);
			}
			this.xa(arg0, local22.aByte2, local22.aByte5, local22.aBoolean8, local22.aBoolean14, local22.aBoolean11, local22.aByte6, local22.aByte3, local22.aByte7, local22.aShort1, local22.anInt54, local22.aBoolean12, local22.aBoolean5, local43);
			return true;
		}
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(I)Lclient!e;")
	@Override
	public Class1_Sub5 method6964(@OriginalArg(0) int arg0) {
		@Pc(5) m local5 = new m(this, arg0);
		this.aClass353_29.method7679(local5);
		return local5;
	}

	@OriginalMember(owner = "client!l", name = "L", descriptor = "()V")
	public native void L();

	@OriginalMember(owner = "client!l", name = "pa", descriptor = "(III)V")
	public native void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!l", name = "x", descriptor = "()Z")
	@Override
	public boolean method6956() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6946(@OriginalArg(0) Canvas arg0) {
		@Pc(8) ta local8 = (ta) this.aClass187_20.method3797((long) arg0.hashCode());
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
		this.aClass187_20.method3795(local8, (long) arg0.hashCode());
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(Z)V")
	@Override
	public void method6942(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!l", name = "R", descriptor = "()V")
	private native void R();

	@OriginalMember(owner = "client!l", name = "k", descriptor = "()Z")
	@Override
	public boolean method6917() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!uq;[Lclient!fg;Z)Lclient!la;")
	@Override
	public Class64 method6899(@OriginalArg(0) Class334 arg0, @OriginalArg(1) Class102[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt2624;
			local7[local11] = arg1[local11].anInt2626;
			if (arg1[local11].aByteArray31 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new c(this, this.aM1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!l", name = "j", descriptor = "()Z")
	@Override
	public boolean method6912() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "z", descriptor = "()Lclient!q;")
	@Override
	public Class113 method6963() {
		return this.aClass113_4;
	}

	@OriginalMember(owner = "client!l", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!l", name = "ra", descriptor = "(F)V")
	public native void ra(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!l", name = "CA", descriptor = "(IIII)V")
	public native void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I[Lclient!rc;)V")
	@Override
	public void method6953(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub18[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static285.anIntArray383[local1++] = arg1[local3].method4107();
			Static285.anIntArray383[local1++] = arg1[local3].method4101();
			Static285.anIntArray383[local1++] = arg1[local3].method4098();
			Static285.anIntArray383[local1++] = arg1[local3].method4104();
			Static285.aFloatArray28[local3] = arg1[local3].method4099();
			Static285.anIntArray383[local1++] = arg1[local3].method4102();
		}
		this.I(arg0, Static285.anIntArray383, Static285.aFloatArray28);
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V")
	@Override
	public void method6943(@OriginalArg(0) int arg0) {
		this.aQaArray1[arg0].method5730();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class22 method6918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new t(this, this.aM1, arg0, arg1, arg2, arg3) : new va(this, this.aM1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!l", name = "IA", descriptor = "(IIIIII[BII)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!fg;Z)Lclient!f;")
	@Override
	public Class22 method6896(@OriginalArg(0) Class102 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray224;
		@Pc(5) byte[] local5 = arg0.aByteArray32;
		@Pc(8) int local8 = arg0.anInt2624;
		@Pc(11) int local11 = arg0.anInt2626;
		@Pc(32) Class22 local32;
		if (arg1 && arg0.aByteArray31 == null) {
			local32 = new w(this, this.aM1, local2, local5, 0, arg0.anInt2624, arg0.anInt2624, arg0.anInt2626);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray31;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray224[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new t(this, this.aM1, local40, 0, arg0.anInt2624, arg0.anInt2624, arg0.anInt2626);
				} else {
					local32 = new va(this, this.aM1, local40, 0, arg0.anInt2624, arg0.anInt2624, arg0.anInt2626);
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
		local32.Q(arg0.anInt2622, arg0.anInt2625, arg0.anInt2623, arg0.anInt2621);
		return local32;
	}

	@OriginalMember(owner = "client!l", name = "ja", descriptor = "(I)V")
	public native void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "y", descriptor = "()Lclient!is;")
	@Override
	public Class162 method6962() {
		return new Class162(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!l", name = "WA", descriptor = "()V")
	private void method4038() {
		System.gc();
		System.runFinalization();
		Static289.method4088();
	}

	@OriginalMember(owner = "client!l", name = "GA", descriptor = "(II)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6937(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aTa1 = null;
			this.ia(null);
		} else {
			@Pc(10) ta local10 = (ta) this.aClass187_20.method3797((long) arg0.hashCode());
			this.aTa1 = local10;
			this.ia(local10);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method6921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class204 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.Q(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!l", name = "v", descriptor = "()[I")
	public native int[] v();

	@OriginalMember(owner = "client!l", name = "EA", descriptor = "(Lclient!e;)V")
	private native void EA(@OriginalArg(0) Class1_Sub5 arg0);

	@OriginalMember(owner = "client!l", name = "b", descriptor = "()I")
	public native int b();

	@OriginalMember(owner = "client!l", name = "o", descriptor = "()Z")
	@Override
	public boolean method6931() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method6959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.w(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "p", descriptor = "()V")
	@Override
	public void method6934() {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	@Override
	public void method6925(@OriginalArg(0) int arg0) {
		Static289.method4088();
		this.qa(arg0);
		for (@Pc(10) m local10 = (m) this.aClass353_29.method7677(); local10 != null; local10 = (m) this.aClass353_29.method7687()) {
			local10.Z();
		}
	}

	@OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method6939();
		if (this.nativeid != 0L) {
			Static289.method4087(this);
		}
	}

	@OriginalMember(owner = "client!l", name = "JA", descriptor = "()V")
	public native void JA();

	@OriginalMember(owner = "client!l", name = "l", descriptor = "()Lclient!q;")
	@Override
	public Class113 method6920() {
		return this.aClass113_3;
	}

	@OriginalMember(owner = "client!l", name = "va", descriptor = "(I)V")
	public native void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method6919(@OriginalArg(0) Class113 arg0) {
		this.aClass113_3 = arg0;
		this.NA(arg0);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!vi;)V")
	@Override
	public void method6940(@OriginalArg(0) Class343 arg0) {
		this.method4039(arg0);
		this.method4040().HA(this, Static285.anIntArray380, Static285.anIntArray382, Static285.anIntArray381, Static285.aShortArray79, arg0.aClass355_1.method7731());
	}

	@OriginalMember(owner = "client!l", name = "C", descriptor = "()V")
	@Override
	public void method6971() {
	}

	@OriginalMember(owner = "client!l", name = "m", descriptor = "()V")
	@Override
	protected void method6923() {
		if (this.aBoolean405) {
			return;
		}
		this.aQaArray1 = null;
		this.aTa1 = null;
		this.aM1 = null;
		this.aClass113_4 = null;
		this.aClass187_20.method3801();
		for (@Pc(25) m local25 = (m) this.aClass353_29.method7677(); local25 != null; local25 = (m) this.aClass353_29.method7687()) {
			local25.D();
		}
		this.aClass353_29.method7680();
		this.R();
		if (this.aBoolean406) {
			Static13.method128(false, true);
			this.aBoolean406 = false;
		}
		this.method4038();
		Static289.method4085();
		this.aBoolean405 = true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4040().G(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(II)I")
	@Override
	public int method6967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "()Z")
	@Override
	public boolean method6900() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "u", descriptor = "()Z")
	@Override
	public boolean method6954() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V")
	@Override
	public void method6961(@OriginalArg(0) int arg0) {
		this.aQaArray1[arg0].method5731();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class204 method6945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new za(this, this.aM1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!vi;I)V")
	@Override
	public void method6947(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1) {
		this.method4039(arg0);
		this.method4040().HA(this, Static285.anIntArray380, Static285.anIntArray382, Static285.anIntArray381, Static285.aShortArray79, arg0.aClass355_1.method7731());
	}

	@OriginalMember(owner = "client!l", name = "s", descriptor = "()Z")
	@Override
	public boolean method6951() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "q", descriptor = "()Z")
	@Override
	public boolean method6936() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "da", descriptor = "(IIII)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "FA", descriptor = "(ILclient!ua;II)V")
	public native void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class204 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "Z", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void Z(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!lm;IIII)Lclient!da;")
	@Override
	public Class63 method6910(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new v(this, this.aM1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I")
	@Override
	public int method6915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!l", name = "w", descriptor = "()I")
	@Override
	public int method6955() {
		return 4;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "()V")
	@Override
	public void method6898() {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class22 method6950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new t(this, this.aM1, arg0, arg1);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!vi;Z)V")
	private void method4039(@OriginalArg(0) Class343 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class8_Sub2_Sub1 local15 = (Class8_Sub2_Sub1) arg0.aClass355_1.method7727(); local15 != null; local15 = (Class8_Sub2_Sub1) arg0.aClass355_1.method7728()) {
			Static285.anIntArray380[local1++] = local15.anInt5208;
			Static285.anIntArray380[local1++] = local15.anInt5211;
			Static285.anIntArray380[local1++] = local15.anInt5210;
			Static285.anIntArray382[local3++] = local15.anInt5209;
			Static285.aShortArray79[local7++] = (short) local15.anInt5213;
			Static285.anIntArray381[local5++] = local15.anInt5212;
		}
	}

	@OriginalMember(owner = "client!l", name = "ZA", descriptor = "(Z)V")
	public native void ZA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
	@Override
	public void method6903(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!l", name = "O", descriptor = "(IIIIII)Z")
	public native boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIF)Lclient!rc;")
	@Override
	public Class1_Sub18 method6928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub18_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6909(@OriginalArg(0) Canvas arg0) {
		@Pc(8) ta local8 = (ta) this.aClass187_20.method3797((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.AA(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aTa1.aCanvas13) {
			this.method6937(arg0);
		}
	}

	@OriginalMember(owner = "client!l", name = "B", descriptor = "()V")
	@Override
	public void method6969() {
	}

	@OriginalMember(owner = "client!l", name = "la", descriptor = "(IIII)V")
	public native void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "VA", descriptor = "(IFFFFF)V")
	public native void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!l", name = "g", descriptor = "()Z")
	@Override
	public boolean method6906() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "D", descriptor = "()Lclient!qa;")
	public qa method4040() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4961; local1++) {
			if (this.aQaArray1[local1].aRunnable2 == Thread.currentThread()) {
				return this.aQaArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method6930(@OriginalArg(0) Class22 arg0) {
		if (arg0 instanceof va) {
			this.q((va) arg0);
		} else if (arg0 instanceof t) {
			this.ma((t) arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!l", name = "fa", descriptor = "()Ljava/lang/Object;")
	private Object method4041() {
		return new h(this);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!jba;Lclient!jba;FLclient!jba;)Lclient!jba;")
	@Override
	public Class83 method6895(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class83 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!l", name = "ma", descriptor = "(Lclient!t;)V")
	private native void ma(@OriginalArg(0) t arg0);

	@OriginalMember(owner = "client!l", name = "DA", descriptor = "()I")
	public native int DA();

	@OriginalMember(owner = "client!l", name = "h", descriptor = "(IIII)[I")
	public native int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!l", name = "YA", descriptor = "(IIII)V")
	public native void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method6916(@OriginalArg(0) Class1_Sub5 arg0) {
		this.aM1 = (m) arg0;
		this.EA(arg0);
	}

	@OriginalMember(owner = "client!l", name = "AA", descriptor = "(III[I)V")
	public native void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6914(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aTa1 == null) {
			throw new IllegalStateException("off");
		}
		this.aTa1.method6639(arg0, arg1);
	}

	@OriginalMember(owner = "client!l", name = "ia", descriptor = "(Lclient!ta;)V")
	private native void ia(@OriginalArg(0) ta arg0);

	@OriginalMember(owner = "client!l", name = "T", descriptor = "()I")
	public native int T();

	@OriginalMember(owner = "client!l", name = "Q", descriptor = "(IIIIIILclient!ua;II)V")
	private native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class204 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!l", name = "XA", descriptor = "(IIIII)V")
	public native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "r", descriptor = "()V")
	@Override
	public void method6944() throws Exception_Sub1 {
		if (this.aTa1 == null) {
			throw new IllegalStateException("off");
		}
		this.aTa1.method6640();
	}

	@OriginalMember(owner = "client!l", name = "oa", descriptor = "([I)V")
	public native void oa(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6941(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!l", name = "w", descriptor = "(IIIIII)V")
	private native void w(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "NA", descriptor = "(Lclient!q;)V")
	private native void NA(@OriginalArg(0) Class113 arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([I)V")
	@Override
	public void method6922(@OriginalArg(0) int[] arg0) {
		@Pc(4) Dimension local4 = this.aTa1.aCanvas13.getSize();
		arg0[0] = local4.width;
		arg0[1] = local4.height;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class22 method6970(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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

	@OriginalMember(owner = "client!l", name = "e", descriptor = "()V")
	@Override
	public void method6904() {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6932() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!l", name = "A", descriptor = "(S)Z")
	private boolean method4042(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class3 local9 = super.anInterface7_10.method3874(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.Z(arg0, local9.aByte2, local9.aByte5, local9.aBoolean8, local9.aBoolean14, local9.aBoolean11, local9.aByte6, local9.aByte3, local9.aByte7, local9.aShort1, local9.anInt54, local9.aBoolean12, local9.aBoolean5);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "h", descriptor = "()V")
	@Override
	public void method6907() {
		this.method6937(this.aTa1.aCanvas13);
	}

	@OriginalMember(owner = "client!l", name = "MA", descriptor = "(III[I)V")
	public native void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class47 method6902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new s(this, this.aM1, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "i", descriptor = "()Z")
	@Override
	public boolean method6908() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "OA", descriptor = "(Lclient!fa;II)V")
	private native void OA(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!l", name = "q", descriptor = "(Lclient!va;)V")
	private native void q(@OriginalArg(0) va arg0);

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method6958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.XA(arg0, arg1, arg2, arg4, arg5);
		this.XA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.m(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.m(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}
}
