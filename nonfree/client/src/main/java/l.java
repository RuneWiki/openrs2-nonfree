import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class l extends Class31 implements Interface17 {

	@OriginalMember(owner = "client!l", name = "q", descriptor = "Lclient!m;")
	private m aM1;

	@OriginalMember(owner = "client!l", name = "F", descriptor = "Lclient!ta;")
	private ta aTa1;

	@OriginalMember(owner = "client!l", name = "K", descriptor = "Lclient!q;")
	private Class42 aClass42_2;

	@OriginalMember(owner = "client!l", name = "M", descriptor = "[Lclient!qa;")
	private qa[] aQaArray1;

	@OriginalMember(owner = "client!l", name = "N", descriptor = "I")
	public int anInt5537;

	@OriginalMember(owner = "client!l", name = "s", descriptor = "Z")
	private boolean aBoolean378 = false;

	@OriginalMember(owner = "client!l", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!l", name = "r", descriptor = "Lclient!or;")
	private final Class244 aClass244_44 = new Class244();

	@OriginalMember(owner = "client!l", name = "J", descriptor = "I")
	private final int anInt5536 = 4096;

	@OriginalMember(owner = "client!l", name = "G", descriptor = "I")
	private final int anInt5535 = 4096;

	@OriginalMember(owner = "client!l", name = "H", descriptor = "Lclient!sba;")
	private final Class297 aClass297_23 = new Class297(4);

	@OriginalMember(owner = "client!l", name = "L", descriptor = "Z")
	private boolean aBoolean379 = false;

	@OriginalMember(owner = "client!l", name = "I", descriptor = "Lclient!q;")
	private Class42 aClass42_1;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;)V")
	public l(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1) {
		super(arg1);
		try {
			if (!Static298.method4529("sw3d")) {
				throw new RuntimeException("");
			}
			Static41.method1089();
			this.OA(super.anInterface4_14, 0, 0);
			Static410.method5761(true, false);
			this.aBoolean379 = true;
			this.aClass42_1 = new ra();
			this.method8062(new ra());
			this.method8043(1);
			this.method8055(0);
			if (arg0 != null) {
				this.method8019(arg0);
				this.method8076(arg0);
			}
		} catch (@Pc(78) Throwable local78) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!l", name = "ma", descriptor = "(Lclient!t;)V")
	private native void ma(@OriginalArg(0) t arg0);

	@OriginalMember(owner = "client!l", name = "w", descriptor = "()Lclient!q;")
	@Override
	public Class42 method8075() {
		return this.aClass42_2;
	}

	@OriginalMember(owner = "client!l", name = "fa", descriptor = "()Ljava/lang/Object;")
	private Object method4507() {
		return new h(this);
	}

	@OriginalMember(owner = "client!l", name = "f", descriptor = "()Z")
	@Override
	public boolean method8028() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "t", descriptor = "()Z")
	@Override
	public boolean method8069() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "xa", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void xa(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!dd;)V")
	@Override
	public void method8068(@OriginalArg(0) Class47 arg0) {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!wt;Z)Lclient!f;")
	@Override
	public Class73 method8086(@OriginalArg(0) Class365 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray601;
		@Pc(5) byte[] local5 = arg0.aByteArray246;
		@Pc(8) int local8 = arg0.anInt10318;
		@Pc(11) int local11 = arg0.anInt10320;
		@Pc(32) Class73 local32;
		if (arg1 && arg0.aByteArray247 == null) {
			local32 = new w(this, this.aM1, local2, local5, 0, arg0.anInt10318, arg0.anInt10318, arg0.anInt10320);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray247;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray601[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new t(this, this.aM1, local40, 0, arg0.anInt10318, arg0.anInt10318, arg0.anInt10320);
				} else {
					local32 = new va(this, this.aM1, local40, 0, arg0.anInt10318, arg0.anInt10318, arg0.anInt10320);
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
		local32.Q(arg0.anInt10316, arg0.anInt10321, arg0.anInt10317, arg0.anInt10319);
		return local32;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "()Z")
	@Override
	public boolean method8018() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method8044(@OriginalArg(0) Class73 arg0) {
		if (arg0 instanceof va) {
			this.q((va) arg0);
		} else if (arg0 instanceof t) {
			this.ma((t) arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "()I")
	@Override
	public int method8026() {
		return 4;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([I)V")
	@Override
	public void method8057(@OriginalArg(0) int[] arg0) {
		@Pc(4) Dimension local4 = this.aTa1.aCanvas10.getSize();
		arg0[0] = local4.width;
		arg0[1] = local4.height;
	}

	@OriginalMember(owner = "client!l", name = "ia", descriptor = "(Lclient!ta;)V")
	private native void ia(@OriginalArg(0) ta arg0);

	@OriginalMember(owner = "client!l", name = "q", descriptor = "(Lclient!va;)V")
	private native void q(@OriginalArg(0) va arg0);

	@OriginalMember(owner = "client!l", name = "V", descriptor = "(IIII)V")
	public native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "h", descriptor = "()Lclient!q;")
	@Override
	public Class42 method8031() {
		return new ra();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!tt;Z)V")
	private void method4508(@OriginalArg(0) Class323 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class25_Sub5_Sub1 local15 = (Class25_Sub5_Sub1) arg0.aClass114_1.method3057(); local15 != null; local15 = (Class25_Sub5_Sub1) arg0.aClass114_1.method3059()) {
			Static296.anIntArray268[local1++] = local15.anInt8915;
			Static296.anIntArray268[local1++] = local15.anInt8911;
			Static296.anIntArray268[local1++] = local15.anInt8914;
			Static296.anIntArray269[local3++] = local15.anInt8912;
			Static296.aShortArray73[local7++] = (short) local15.anInt8908;
			Static296.anIntArray264[local5++] = local15.anInt8913;
		}
	}

	@OriginalMember(owner = "client!l", name = "A", descriptor = "(S)Z")
	private boolean method4509(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class172 local9 = super.anInterface4_14.method7229(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.Z(arg0, local9.aByte61, local9.aByte58, local9.aBoolean350, local9.aBoolean349, local9.aBoolean357, local9.aByte57, local9.aByte56, local9.aByte62, local9.aShort66, local9.anInt5206, local9.aBoolean353, local9.aBoolean354);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class127 method8077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new s(this, this.aM1, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "Z", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void Z(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method8064(@OriginalArg(0) Class3_Sub8 arg0) {
		this.aM1 = (m) arg0;
		this.EA(arg0);
	}

	@OriginalMember(owner = "client!l", name = "j", descriptor = "()V")
	@Override
	public void method8034() {
	}

	@OriginalMember(owner = "client!l", name = "qa", descriptor = "(I)V")
	private native void qa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "g", descriptor = "()V")
	@Override
	public void method8030() {
	}

	@OriginalMember(owner = "client!l", name = "XA", descriptor = "(IIIII)V")
	public native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "y", descriptor = "()V")
	@Override
	public void method8082() throws Exception_Sub1 {
		if (this.aTa1 == null) {
			throw new IllegalStateException("off");
		}
		this.aTa1.method6750();
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "()Z")
	@Override
	public boolean method8022() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method8092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4510().G(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!l", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!l", name = "JA", descriptor = "()V")
	public native void JA();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class73 method8091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new t(this, this.aM1, arg0, arg1, arg2, arg3) : new va(this, this.aM1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!l", name = "IA", descriptor = "(IIIIII[BII)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!l", name = "x", descriptor = "()V")
	@Override
	protected void method8079() {
		if (this.aBoolean378) {
			return;
		}
		this.aQaArray1 = null;
		this.aTa1 = null;
		this.aM1 = null;
		this.aClass42_1 = null;
		this.aClass297_23.method6535();
		for (@Pc(25) m local25 = (m) this.aClass244_44.method5572(); local25 != null; local25 = (m) this.aClass244_44.method5576()) {
			local25.D();
		}
		this.aClass244_44.method5581();
		this.R();
		if (this.aBoolean379) {
			Static114.method2275(true, false);
			this.aBoolean379 = false;
		}
		this.method4511();
		Static41.method1088();
		this.aBoolean378 = true;
	}

	@OriginalMember(owner = "client!l", name = "GA", descriptor = "(II)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!l", name = "D", descriptor = "()Lclient!qa;")
	public qa method4510() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5537; local1++) {
			if (this.aQaArray1[local1].aRunnable2 == Thread.currentThread()) {
				return this.aQaArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I")
	@Override
	public int method8039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!uo;IIII)Lclient!da;")
	@Override
	public Class52 method8046(@OriginalArg(0) Class332 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new v(this, this.aM1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!l", name = "u", descriptor = "()Z")
	@Override
	public boolean method8074() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "q", descriptor = "()Z")
	@Override
	public boolean method8063() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)Lclient!e;")
	@Override
	public Class3_Sub8 method8036(@OriginalArg(0) int arg0) {
		@Pc(5) m local5 = new m(this, arg0);
		this.aClass244_44.method5570(local5);
		return local5;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8049(@OriginalArg(0) Canvas arg0) {
		@Pc(8) ta local8 = (ta) this.aClass297_23.method6531((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.AA(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aTa1.aCanvas10) {
			this.method8076(arg0);
		}
	}

	@OriginalMember(owner = "client!l", name = "AA", descriptor = "(III[I)V")
	public native void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V")
	@Override
	public void method8055(@OriginalArg(0) int arg0) {
		this.aQaArray1[arg0].method5878();
	}

	@OriginalMember(owner = "client!l", name = "k", descriptor = "()Z")
	@Override
	public boolean method8037() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "R", descriptor = "()V")
	private native void R();

	@OriginalMember(owner = "client!l", name = "VA", descriptor = "(IFFFFF)V")
	public native void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8019(@OriginalArg(0) Canvas arg0) {
		@Pc(8) ta local8 = (ta) this.aClass297_23.method6531((long) arg0.hashCode());
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
		this.aClass297_23.method6537((long) arg0.hashCode(), local8);
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8076(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aTa1 = null;
			this.ia(null);
		} else {
			@Pc(10) ta local10 = (ta) this.aClass297_23.method6531((long) arg0.hashCode());
			this.aTa1 = local10;
			this.ia(local10);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method8081() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
	@Override
	public void method8045(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V")
	@Override
	public void method8048(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!l", name = "Q", descriptor = "(IIIIIILclient!ua;II)V")
	private native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class53 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!l", name = "WA", descriptor = "()V")
	private void method4511() {
		System.gc();
		System.runFinalization();
		Static41.method1087();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method8071(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aTa1 == null) {
			throw new IllegalStateException("off");
		}
		this.aTa1.method6748(arg0, arg1);
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8060(@OriginalArg(0) Canvas arg0) {
		if (this.aTa1.aCanvas10 == arg0) {
			this.method8076(null);
		}
		@Pc(16) ta local16 = (ta) this.aClass297_23.method6531((long) arg0.hashCode());
		if (local16 != null) {
			local16.method8128();
			local16.method6749();
		}
	}

	@OriginalMember(owner = "client!l", name = "A", descriptor = "()V")
	@Override
	public void method8087() {
		this.method8076(this.aTa1.aCanvas10);
	}

	@OriginalMember(owner = "client!l", name = "l", descriptor = "()Z")
	@Override
	public boolean method8040() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "DA", descriptor = "()I")
	public native int DA();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class73 method8033(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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

	@OriginalMember(owner = "client!l", name = "p", descriptor = "()Z")
	@Override
	public boolean method8054() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!l", name = "i", descriptor = "()V")
	@Override
	public void method8032() {
	}

	@OriginalMember(owner = "client!l", name = "YA", descriptor = "(IIII)V")
	public native void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "FA", descriptor = "(ILclient!ua;II)V")
	public native void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "EA", descriptor = "(Lclient!e;)V")
	private native void EA(@OriginalArg(0) Class3_Sub8 arg0);

	@OriginalMember(owner = "client!l", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!l", name = "pa", descriptor = "(III)V")
	public native void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!l", name = "L", descriptor = "()V")
	public native void L();

	@OriginalMember(owner = "client!l", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method8056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class53 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.Q(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class53 method8058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new za(this, this.aM1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!l", name = "la", descriptor = "(IIII)V")
	public native void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "n", descriptor = "()Z")
	@Override
	public boolean method8047() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!tt;I)V")
	@Override
	public void method8070(@OriginalArg(0) Class323 arg0, @OriginalArg(1) int arg1) {
		this.method4508(arg0);
		this.method4510().HA(this, Static296.anIntArray268, Static296.anIntArray269, Static296.anIntArray264, Static296.aShortArray73, arg0.aClass114_1.method3066());
	}

	@OriginalMember(owner = "client!l", name = "h", descriptor = "(IIII)[I")
	public native int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "O", descriptor = "(IIIIII)Z")
	public native boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "BA", descriptor = "()I")
	public native int BA();

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(II)I")
	@Override
	public int method8050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!l", name = "r", descriptor = "()Z")
	@Override
	public boolean method8066() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "m", descriptor = "()Lclient!fe;")
	@Override
	public Class102 method8041() {
		return new Class102(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIF)Lclient!cp;")
	@Override
	public Class3_Sub9 method8078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub9_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "C", descriptor = "()Z")
	@Override
	public boolean method8095() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I[Lclient!cp;)V")
	@Override
	public void method8038(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub9[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static296.anIntArray265[local1++] = arg1[local3].method5997();
			Static296.anIntArray265[local1++] = arg1[local3].method5990();
			Static296.anIntArray265[local1++] = arg1[local3].method5999();
			Static296.anIntArray265[local1++] = arg1[local3].method6000();
			Static296.aFloatArray52[local3] = arg1[local3].method5996();
			Static296.anIntArray265[local1++] = arg1[local3].method5994();
		}
		this.I(arg0, Static296.anIntArray265, Static296.aFloatArray52);
	}

	@OriginalMember(owner = "client!l", name = "va", descriptor = "(I)V")
	public native void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(IIIII)V")
	protected native void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "MA", descriptor = "(III[I)V")
	public native void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!l", name = "NA", descriptor = "(Lclient!q;)V")
	private native void NA(@OriginalArg(0) Class42 arg0);

	@OriginalMember(owner = "client!l", name = "CA", descriptor = "(IIII)V")
	public native void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "W", descriptor = "(S)Z")
	private boolean method4512(@OriginalArg(0) short arg0) {
		@Pc(2) Interface4 local2 = super.anInterface4_14;
		synchronized (super.anInterface4_14) {
			if (!super.anInterface4_14.method7227(arg0)) {
				return false;
			}
			@Pc(22) Class172 local22 = super.anInterface4_14.method7229(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(43) int[] local43;
			if (local22.aBoolean351) {
				local43 = super.anInterface4_14.method7228(0.7F, arg0, 128, 128);
			} else {
				local43 = super.anInterface4_14.method7226(128, arg0, true, 128, 0.7F);
			}
			this.xa(arg0, local22.aByte61, local22.aByte58, local22.aBoolean350, local22.aBoolean349, local22.aBoolean357, local22.aByte57, local22.aByte56, local22.aByte62, local22.aShort66, local22.anInt5206, local22.aBoolean353, local22.aBoolean354, local43);
			return true;
		}
	}

	@OriginalMember(owner = "client!l", name = "ZA", descriptor = "(Z)V")
	public native void ZA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!l", name = "J", descriptor = "(IIIIII)V")
	public native void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V")
	@Override
	public void method8043(@OriginalArg(0) int arg0) {
		this.anInt5537 = arg0;
		this.aQaArray1 = new qa[this.anInt5537];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5537; local9++) {
			this.aQaArray1[local9] = new qa(this, this.anInt5536, this.anInt5535);
		}
	}

	@OriginalMember(owner = "client!l", name = "OA", descriptor = "(Lclient!fa;II)V")
	private native void OA(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	@Override
	public void method8024(@OriginalArg(0) int arg0) {
		Static41.method1087();
		this.qa(arg0);
		for (@Pc(10) m local10 = (m) this.aClass244_44.method5572(); local10 != null; local10 = (m) this.aClass244_44.method5576()) {
			local10.Z();
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "()I")
	public native int b();

	@OriginalMember(owner = "client!l", name = "o", descriptor = "()Lclient!q;")
	@Override
	public Class42 method8052() {
		return this.aClass42_1;
	}

	@OriginalMember(owner = "client!l", name = "T", descriptor = "()I")
	public native int T();

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
	@Override
	public void method8051(@OriginalArg(0) int arg0) {
		this.aQaArray1[arg0].method5877();
	}

	@OriginalMember(owner = "client!l", name = "ra", descriptor = "(F)V")
	public native void ra(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!l", name = "oa", descriptor = "([I)V")
	public native void oa(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.XA(arg0, arg1, arg2, arg4, arg5);
		this.XA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.m(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.m(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8025(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method8059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.w(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method8062(@OriginalArg(0) Class42 arg0) {
		this.aClass42_2 = arg0;
		this.NA(arg0);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ufa;[Lclient!wt;Z)Lclient!la;")
	@Override
	public Class63 method8027(@OriginalArg(0) Class328 arg0, @OriginalArg(1) Class365[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt10318;
			local7[local11] = arg1[local11].anInt10320;
			if (arg1[local11].aByteArray247 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new c(this, this.aM1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(IIIIII)Lclient!dd;")
	@Override
	public Class47 method8083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method8053();
		if (this.nativeid != 0L) {
			Static41.method1086(this);
		}
	}

	@OriginalMember(owner = "client!l", name = "ja", descriptor = "(I)V")
	public native void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!dd;Lclient!dd;FLclient!dd;)Lclient!dd;")
	@Override
	public Class47 method8093(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class47 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!l", name = "I", descriptor = "(I[I[F)V")
	private native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!l", name = "s", descriptor = "()V")
	@Override
	public void method8067() {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class73 method8080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new t(this, this.aM1, arg0, arg1);
	}

	@OriginalMember(owner = "client!l", name = "w", descriptor = "(IIIIII)V")
	private native void w(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "z", descriptor = "()Z")
	@Override
	public boolean method8085() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V")
	@Override
	public void method8061(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!l", name = "da", descriptor = "(IIII)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "v", descriptor = "()[I")
	public native int[] v();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!tt;)V")
	@Override
	public void method8090(@OriginalArg(0) Class323 arg0) {
		this.method4508(arg0);
		this.method4510().HA(this, Static296.anIntArray268, Static296.anIntArray269, Static296.anIntArray264, Static296.aShortArray73, arg0.aClass114_1.method3066());
	}

	@OriginalMember(owner = "client!l", name = "B", descriptor = "()Z")
	@Override
	public boolean method8089() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "()V")
	@Override
	public void method8023() {
	}

	@OriginalMember(owner = "client!l", name = "m", descriptor = "(IIIII)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
