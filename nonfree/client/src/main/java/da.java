import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class da extends Class90 implements Interface4 {

	@OriginalMember(owner = "client!da", name = "s", descriptor = "Lclient!a;")
	private a anA1;

	@OriginalMember(owner = "client!da", name = "v", descriptor = "Lclient!q;")
	private Class93 aClass93_4;

	@OriginalMember(owner = "client!da", name = "N", descriptor = "Lclient!v;")
	private v aV1;

	@OriginalMember(owner = "client!da", name = "O", descriptor = "[Lclient!t;")
	private t[] aTArray1;

	@OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
	private int anInt1461;

	@OriginalMember(owner = "client!da", name = "u", descriptor = "Z")
	private boolean aBoolean108 = false;

	@OriginalMember(owner = "client!da", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!da", name = "t", descriptor = "Lclient!su;")
	private final Class298 aClass298_32 = new Class298();

	@OriginalMember(owner = "client!da", name = "w", descriptor = "I")
	private final int anInt1459 = 4096;

	@OriginalMember(owner = "client!da", name = "G", descriptor = "I")
	private final int anInt1460 = 4096;

	@OriginalMember(owner = "client!da", name = "z", descriptor = "Lclient!oj;")
	private final Class234 aClass234_8 = new Class234(4);

	@OriginalMember(owner = "client!da", name = "P", descriptor = "Z")
	private boolean aBoolean109 = false;

	@OriginalMember(owner = "client!da", name = "L", descriptor = "Lclient!q;")
	private Class93 aClass93_5;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public da(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1) {
		super(arg1);
		try {
			if (!Static560.method7781("sw3d")) {
				throw new RuntimeException("");
			}
			Static489.method6850();
			this.PA(super.anInterface2_15, 0, 0);
			Static477.method6609(true, false);
			this.aBoolean109 = true;
			this.aClass93_5 = new wa();
			this.method7492(new wa());
			this.method7478(1);
			this.method7491(0);
			if (arg0 != null) {
				this.method7507(arg0);
				this.method7472(arg0);
			}
		} catch (@Pc(78) Throwable local78) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!da", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void J(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I[I[F)V")
	private native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!ld;)V")
	@Override
	public void method7448(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub25[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static87.anIntArray139[local1++] = arg1[local3].method6405();
			Static87.anIntArray139[local1++] = arg1[local3].method6402();
			Static87.anIntArray139[local1++] = arg1[local3].method6400();
			Static87.anIntArray139[local1++] = arg1[local3].method6398();
			Static87.aFloatArray10[local3] = arg1[local3].method6407();
			Static87.anIntArray139[local1++] = arg1[local3].method6409(true);
		}
		this.f(arg0, Static87.anIntArray139, Static87.aFloatArray10);
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method7494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.e(arg0, arg1, arg2, arg4, arg5);
		this.e(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.ya(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.ya(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "v", descriptor = "()I")
	public native int v();

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(Z)V")
	@Override
	public void method7500(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "()Lclient!q;")
	@Override
	public Class93 method7455() {
		return this.aClass93_5;
	}

	@OriginalMember(owner = "client!da", name = "JA", descriptor = "(I)V")
	public native void JA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "HA", descriptor = "()Ljava/lang/Object;")
	private Object method1347() {
		return new pa(this);
	}

	@OriginalMember(owner = "client!da", name = "m", descriptor = "(IIII)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "t", descriptor = "()V")
	@Override
	public void method7501() {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!mj;[Lclient!kq;Z)Lclient!ta;")
	@Override
	public Class82 method7523(@OriginalArg(0) Class202 arg0, @OriginalArg(1) Class177[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt4887;
			local7[local11] = arg1[local11].anInt4884;
			if (arg1[local11].aByteArray67 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new b(this, this.anA1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!rc;I)V")
	@Override
	public void method7476(@OriginalArg(0) Class24[] arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) Class60_Sub6[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method1349().n(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class60_Sub6 local15 = arg2[0];
		Static87.anIntArray138[5] = 0;
		this.method1349().n(this, arg0, arg1, Static87.anIntArray138, -1, arg3);
		local15.anInt7808 = Static87.anIntArray138[0];
		local15.anInt7807 = Static87.anIntArray138[1];
		local15.anInt7809 = Static87.anIntArray138[2];
		local15.anInt7810 = Static87.anIntArray138[3];
		local15.anInt7806 = Static87.anIntArray138[4];
		local15.aBoolean513 = Static87.anIntArray138[5] != 0;
	}

	@OriginalMember(owner = "client!da", name = "k", descriptor = "()V")
	public native void k();

	@OriginalMember(owner = "client!da", name = "D", descriptor = "()V")
	@Override
	protected void method7525() {
		if (this.aBoolean108) {
			return;
		}
		this.aTArray1 = null;
		this.aV1 = null;
		this.anA1 = null;
		this.aClass93_5 = null;
		this.aClass234_8.method5463();
		for (@Pc(25) a local25 = (a) this.aClass298_32.method6809(); local25 != null; local25 = (a) this.aClass298_32.method6821()) {
			local25.ZA();
		}
		this.aClass298_32.method6808();
		this.fa();
		if (this.aBoolean109) {
			Static477.method6611(true, false);
			this.aBoolean109 = false;
		}
		this.method1352();
		Static489.method6849();
		this.aBoolean108 = true;
	}

	@OriginalMember(owner = "client!da", name = "r", descriptor = "()Z")
	@Override
	public boolean method7499() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "q", descriptor = "()Z")
	@Override
	public boolean method7498() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "()V")
	private native void fa();

	@OriginalMember(owner = "client!da", name = "LA", descriptor = "(IIII)V")
	public native void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7460(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aV1 == null) {
			throw new IllegalStateException("off");
		}
		this.aV1.method7340(arg0, arg1);
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()Z")
	@Override
	public boolean method7452() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7526(@OriginalArg(0) Canvas arg0) {
		@Pc(8) v local8 = (v) this.aClass234_8.method5464((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.D(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aV1.aCanvas13) {
			this.method7472(arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!kq;Z)Lclient!xa;")
	@Override
	public Class71 method7522(@OriginalArg(0) Class177 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray399;
		@Pc(5) byte[] local5 = arg0.aByteArray66;
		@Pc(8) int local8 = arg0.anInt4887;
		@Pc(11) int local11 = arg0.anInt4884;
		@Pc(32) Class71 local32;
		if (arg0.aByteArray67 == null) {
			local32 = new la(this, this.anA1, local2, local5, 0, arg0.anInt4887, arg0.anInt4887, arg0.anInt4884);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray67;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray399[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new aa(this, this.anA1, local40, 0, arg0.anInt4887, arg0.anInt4887, arg0.anInt4884);
				} else {
					local32 = new ja(this, this.anA1, local40, 0, arg0.anInt4887, arg0.anInt4887, arg0.anInt4884);
				}
			} else {
				for (@Pc(47) int local47 = 0; local47 < local11; local47++) {
					local52 = local47 * local8;
					for (local54 = 0; local54 < local8; local54++) {
						local40[local52 + local54] = local2[local5[local52 + local54] & 0xFF] | local43[local52 + local54] << 24;
					}
				}
				local32 = new aa(this, this.anA1, local40, 0, local8, local8, local11);
			}
		}
		local32.EA(arg0.anInt4886, arg0.anInt4885, arg0.anInt4889, arg0.anInt4888);
		return local32;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(Z)V")
	@Override
	public void method7489(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7507(@OriginalArg(0) Canvas arg0) {
		@Pc(8) v local8 = (v) this.aClass234_8.method5464((long) arg0.hashCode());
		if (local8 != null) {
			return;
		}
		try {
			@Pc(13) Class local13 = Class.forName("java.awt.Canvas");
			@Pc(23) Method local23 = local13.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local23.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(35) Exception local35) {
		}
		local8 = new v(this, arg0);
		this.aClass234_8.method5466((long) arg0.hashCode(), local8);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7457(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!da", name = "ya", descriptor = "(IIIII)V")
	public native void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method7484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.BA(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "A", descriptor = "([I)V")
	public native void A(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!da", name = "z", descriptor = "()Z")
	@Override
	public boolean method7513() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7472(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aV1 = null;
			this.P(null);
		} else {
			@Pc(10) v local10 = (v) this.aClass234_8.method5464((long) arg0.hashCode());
			this.aV1 = local10;
			this.P(local10);
		}
	}

	@OriginalMember(owner = "client!da", name = "BA", descriptor = "(IIIIII)V")
	private native void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!hfa;)V")
	@Override
	public void method7511(@OriginalArg(0) Class127 arg0) {
		this.method1348(arg0, false);
		this.method1349().WA(this, Static87.anIntArray141, Static87.anIntArray142, Static87.anIntArray143, Static87.aShortArray13, arg0.aClass145_1.method3526());
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public Class71 method7453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new aa(this, this.anA1, arg0, arg1, arg2, arg3) : new ja(this, this.anA1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public void method7449(@OriginalArg(0) Class6_Sub2 arg0) {
		this.anA1 = (a) arg0;
		this.a(arg0);
	}

	@OriginalMember(owner = "client!da", name = "SA", descriptor = "()I")
	public native int SA();

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)V")
	@Override
	public void method7483(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "()Z")
	@Override
	public boolean method7466() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "()Z")
	@Override
	public boolean method7474() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V")
	@Override
	public void method7491(@OriginalArg(0) int arg0) {
		this.aTArray1[arg0].method6846();
	}

	@OriginalMember(owner = "client!da", name = "i", descriptor = "()Z")
	@Override
	public boolean method7479() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "L", descriptor = "(ILclient!fa;II)V")
	public native void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "w", descriptor = "()Z")
	@Override
	public boolean method7504() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!hfa;Z)V")
	private void method1348(@OriginalArg(0) Class127 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class60_Sub1_Sub1 local15 = (Class60_Sub1_Sub1) arg0.aClass145_1.method3522(); local15 != null; local15 = (Class60_Sub1_Sub1) arg0.aClass145_1.method3528()) {
			Static87.anIntArray141[local1++] = local15.anInt2705;
			Static87.anIntArray141[local1++] = local15.anInt2701;
			Static87.anIntArray141[local1++] = local15.anInt2709;
			Static87.anIntArray142[local3++] = local15.anInt2703;
			Static87.aShortArray13[local7++] = (short) local15.anInt2704;
			Static87.anIntArray143[local5++] = local15.anInt2707;
			if (arg1) {
				Static87.aByteArray12[local9++] = local15.aByte31;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()Lclient!fea;")
	@Override
	public Class102 method7450() {
		return new Class102(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!da", name = "sa", descriptor = "(II)V")
	public native void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!da", name = "G", descriptor = "()Lclient!t;")
	public t method1349() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1461; local1++) {
			if (this.aTArray1[local1].aRunnable4 == Thread.currentThread()) {
				return this.aTArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
	private native void c(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!hn;IIII)Lclient!ba;")
	@Override
	public Class24 method7464(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new j(this, this.anA1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V")
	@Override
	public void method7486(@OriginalArg(0) int arg0) {
		Static489.method6853();
		this.c(arg0);
		for (@Pc(10) a local10 = (a) this.aClass298_32.method6809(); local10 != null; local10 = (a) this.aClass298_32.method6821()) {
			local10.P();
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(II)I")
	@Override
	public int method7505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ka;)V")
	@Override
	public void method7454(@OriginalArg(0) Class3 arg0) {
	}

	@OriginalMember(owner = "client!da", name = "Q", descriptor = "(IIII)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "f", descriptor = "()V")
	@Override
	public void method7469() {
	}

	@OriginalMember(owner = "client!da", name = "y", descriptor = "()V")
	@Override
	public void method7508() throws Exception_Sub1 {
		if (this.aV1 == null) {
			throw new IllegalStateException("off");
		}
		this.aV1.method7339();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ba;Lclient!hfa;Lclient!q;Lclient!rc;I)V")
	@Override
	public void method7470(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) Class60_Sub6 arg3, @OriginalArg(4) int arg4) {
		this.method1348(arg1, true);
		if (arg3 == null) {
			this.method1349().m(this, arg0, arg2, null, arg4, Static87.anIntArray141, Static87.anIntArray142, Static87.anIntArray143, Static87.aShortArray13, Static87.aByteArray12, arg1.aClass145_1.method3526(), Static87.anIntArray140);
			return;
		}
		Static87.anIntArray138[5] = 0;
		this.method1349().m(this, arg0, arg2, Static87.anIntArray138, arg4, Static87.anIntArray141, Static87.anIntArray142, Static87.anIntArray143, Static87.aShortArray13, Static87.aByteArray12, arg1.aClass145_1.method3526(), Static87.anIntArray140);
		arg3.anInt7808 = Static87.anIntArray138[0];
		arg3.anInt7807 = Static87.anIntArray138[1];
		arg3.anInt7809 = Static87.anIntArray138[2];
		arg3.anInt7810 = Static87.anIntArray138[3];
		arg3.anInt7806 = Static87.anIntArray138[4];
		arg3.aBoolean513 = Static87.anIntArray138[5] != 0;
	}

	@OriginalMember(owner = "client!da", name = "ra", descriptor = "(IIIIIILclient!fa;II)V")
	private native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class17 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method1349().IA(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!da", name = "l", descriptor = "()Z")
	@Override
	public boolean method7485() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "o", descriptor = "()Z")
	@Override
	public boolean method7496() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7487(@OriginalArg(0) Canvas arg0) {
		if (this.aV1.aCanvas13 == arg0) {
			this.method7472(null);
		}
		@Pc(16) v local16 = (v) this.aClass234_8.method5464((long) arg0.hashCode());
		if (local16 != null) {
			local16.method7948();
			local16.method7338();
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)Lclient!i;")
	@Override
	public Class6_Sub2 method7451(@OriginalArg(0) int arg0) {
		@Pc(5) a local5 = new a(this, arg0);
		this.aClass298_32.method6812(local5);
		return local5;
	}

	@OriginalMember(owner = "client!da", name = "o", descriptor = "(Lclient!q;)V")
	private native void o(@OriginalArg(0) Class93 arg0);

	@OriginalMember(owner = "client!da", name = "p", descriptor = "()Z")
	@Override
	public boolean method7497() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public void method7520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class17 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.ra(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!da", name = "ca", descriptor = "(IIII)V")
	public native void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "na", descriptor = "(III[I)V")
	public native void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I")
	@Override
	public int method7461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(IIIII)V")
	public native void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method7462();
		if (this.nativeid != 0L) {
			Static489.method6851(this);
		}
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
	@Override
	public void method7478(@OriginalArg(0) int arg0) {
		this.anInt1461 = arg0;
		this.aTArray1 = new t[this.anInt1461];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1461; local9++) {
			this.aTArray1[local9] = new t(this, this.anInt1459, this.anInt1460);
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
	@Override
	public void method7468(@OriginalArg(0) int arg0) {
		this.aTArray1[arg0].method6847();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7492(@OriginalArg(0) Class93 arg0) {
		this.aClass93_4 = arg0;
		this.o(arg0);
	}

	@OriginalMember(owner = "client!da", name = "x", descriptor = "()Z")
	@Override
	public boolean method7506() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "(I)V")
	@Override
	public void method7510(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!da", name = "F", descriptor = "()V")
	public native void F();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!ba;Lclient!hfa;Lclient!q;[Lclient!rc;I)V")
	@Override
	public void method7524(@OriginalArg(0) Class24[] arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) Class60_Sub6[] arg3, @OriginalArg(4) int arg4) {
		this.method1348(arg1, true);
		if (arg3 == null) {
			this.method1349().v(this, arg0, arg2, null, arg4, Static87.anIntArray141, Static87.anIntArray142, Static87.anIntArray143, Static87.aShortArray13, Static87.aByteArray12, arg1.aClass145_1.method3526(), Static87.anIntArray140);
		} else {
			@Pc(28) Class60_Sub6 local28 = arg3[0];
			Static87.anIntArray138[5] = 0;
			this.method1349().v(this, arg0, arg2, Static87.anIntArray138, arg4, Static87.anIntArray141, Static87.anIntArray142, Static87.anIntArray143, Static87.aShortArray13, Static87.aByteArray12, arg1.aClass145_1.method3526(), Static87.anIntArray140);
			local28.anInt7808 = Static87.anIntArray138[0];
			local28.anInt7807 = Static87.anIntArray138[1];
			local28.anInt7809 = Static87.anIntArray138[2];
			local28.anInt7810 = Static87.anIntArray138[3];
			local28.anInt7806 = Static87.anIntArray138[4];
			local28.aBoolean513 = Static87.anIntArray138[5] != 0;
		}
		for (@Pc(86) int local86 = 0; local86 < arg0.length; local86++) {
			if (arg0[local86] != null) {
				@Pc(96) j local96 = (j) arg0[local86];
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7512() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!da", name = "YA", descriptor = "(IFFFFF)V")
	public native void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!da", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public Class71 method7471(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new aa(this, this.anA1, arg0, 0, arg1, arg2, arg3) : new ja(this, this.anA1, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new aa(this, this.anA1, arg0, 0, arg1, arg2, arg3) : new ja(this, this.anA1, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!da", name = "X", descriptor = "(III)V")
	public native void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIII)Lclient!ka;")
	@Override
	public Class3 method7456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!da", name = "PA", descriptor = "(Lclient!e;II)V")
	private native void PA(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "FA", descriptor = "(IIIIII)Z")
	public native boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIF)Lclient!ld;")
	@Override
	public Class6_Sub25 method7467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class6_Sub25_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "ma", descriptor = "(IIIIII[BII)V")
	public native void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!da", name = "B", descriptor = "()Lclient!q;")
	@Override
	public Class93 method7518() {
		return new wa();
	}

	@OriginalMember(owner = "client!da", name = "H", descriptor = "(Z)V")
	public native void H(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!da", name = "m", descriptor = "()V")
	@Override
	public void method7488() {
	}

	@OriginalMember(owner = "client!da", name = "u", descriptor = "()Z")
	@Override
	public boolean method7502() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "ka", descriptor = "(FF)V")
	public native void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class46 method7477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new ya(this, this.anA1, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void b(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!da", name = "qa", descriptor = "(S)Z")
	private boolean method1350(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class115 local9 = super.anInterface2_15.method3085(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.b(arg0, local9.aByte40, local9.aByte38, local9.aBoolean226, local9.aBoolean231, local9.aBoolean235, local9.aByte36, local9.aByte35, local9.aByte34, local9.aShort55, local9.anInt2984, local9.aBoolean227, local9.aBoolean234);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "ha", descriptor = "(F)V")
	public native void ha(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(S)Z")
	private boolean method1351(@OriginalArg(0) short arg0) {
		@Pc(2) Interface2 local2 = super.anInterface2_15;
		synchronized (super.anInterface2_15) {
			if (!super.anInterface2_15.method3089(arg0)) {
				return false;
			}
			@Pc(22) Class115 local22 = super.anInterface2_15.method3085(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(43) int[] local43;
			if (local22.aBoolean228) {
				local43 = super.anInterface2_15.method3087(128, 128, arg0, 0.7F);
			} else {
				local43 = super.anInterface2_15.method3088(arg0, 128, 0.7F, 128, true);
			}
			this.J(arg0, local22.aByte40, local22.aByte38, local22.aBoolean226, local22.aBoolean231, local22.aBoolean235, local22.aByte36, local22.aByte35, local22.aByte34, local22.aShort55, local22.anInt2984, local22.aBoolean227, local22.aBoolean234, local43);
			return true;
		}
	}

	@OriginalMember(owner = "client!da", name = "j", descriptor = "()Z")
	@Override
	public boolean method7480() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "C", descriptor = "()V")
	@Override
	public void method7521() {
	}

	@OriginalMember(owner = "client!da", name = "KA", descriptor = "(IIII)[I")
	public native int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!i;)V")
	private native void a(@OriginalArg(0) Class6_Sub2 arg0);

	@OriginalMember(owner = "client!da", name = "AA", descriptor = "(IIII)V")
	public native void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ka;Lclient!ka;FLclient!ka;)Lclient!ka;")
	@Override
	public Class3 method7503(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class3 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public Class17 method7517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new f(this, this.anA1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!da", name = "D", descriptor = "(I)V")
	public native void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "P", descriptor = "(Lclient!v;)V")
	private native void P(@OriginalArg(0) v arg0);

	@OriginalMember(owner = "client!da", name = "aa", descriptor = "()I")
	public native int aa();

	@OriginalMember(owner = "client!da", name = "C", descriptor = "(IIIIII)V")
	public native void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!da", name = "d", descriptor = "()I")
	@Override
	public int method7458() {
		return 4;
	}

	@OriginalMember(owner = "client!da", name = "IA", descriptor = "()I")
	public native int IA();

	@OriginalMember(owner = "client!da", name = "s", descriptor = "()V")
	private void method1352() {
		System.gc();
		System.runFinalization();
		Static489.method6853();
	}

	@OriginalMember(owner = "client!da", name = "n", descriptor = "()Z")
	@Override
	public boolean method7493() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "A", descriptor = "()V")
	@Override
	public void method7514() {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!da", name = "h", descriptor = "(IIIII)V")
	protected native void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "h", descriptor = "()V")
	@Override
	public void method7475() {
	}
}
