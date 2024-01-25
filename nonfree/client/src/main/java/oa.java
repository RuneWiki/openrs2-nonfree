import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class oa extends Class33 implements Interface10 {

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "Lclient!ya;")
	private ya aYa2;

	@OriginalMember(owner = "client!oa", name = "G", descriptor = "Lclient!nh;")
	private Class92 aClass92_5;

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "Lclient!p;")
	private p aP1;

	@OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
	public int anInt6647;

	@OriginalMember(owner = "client!oa", name = "S", descriptor = "[Lclient!a;")
	private a[] anAArray1;

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "Z")
	private boolean aBoolean511 = false;

	@OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
	public final long nativeid = 0L;

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_45 = new Class163();

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "I")
	private int anInt6645 = 4096;

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
	private int anInt6646 = 4096;

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "Lclient!dj;")
	private final Class66 aClass66_29 = new Class66(4);

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "Z")
	private boolean aBoolean512 = false;

	@OriginalMember(owner = "client!oa", name = "O", descriptor = "Lclient!nh;")
	private Class92 aClass92_6;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public oa(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg1);
		try {
			if (!Static678.method8984("sw3d")) {
				throw new RuntimeException("");
			}
			Static12.method231();
			this.MA(super.anInterface9_12, 0, 0);
			Static650.method8679(false, true);
			this.aBoolean512 = true;
			this.aClass92_6 = new ja();
			this.method8133(new ja());
			this.method8111(1);
			this.method8109(0);
			if (arg0 != null) {
				this.method8144(arg0, arg2, arg3);
				this.method8132(arg0);
			}
		} catch (@Pc(80) Throwable local80) {
			this.method8070();
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	private native void d(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(IIIIII)V")
	@Override
	public void method8142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
	@Override
	public void method8121() {
		this.anInt6645 = this.anInt6646 = 10000;
		if (this.anInt6647 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method8111(this.anInt6647);
		this.method8109(0);
	}

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
	public native void C(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
	private native void N(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
	public native void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
	public native void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	@Override
	public void method8089(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8141(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6144(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
	public native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
	@Override
	public void method8111(@OriginalArg(0) int arg0) {
		this.anInt6647 = arg0;
		this.anAArray1 = new a[this.anInt6647];
		for (@Pc(9) int local9 = 0; local9 < this.anInt6647; local9++) {
			this.anAArray1[local9] = new a(this, this.anInt6645, this.anInt6646);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!sea;Lclient!up;)Lclient!nm;")
	@Override
	public Interface18 method8119(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) Interface23 arg1) {
		return new wa(this, (j) arg0, (xa) arg1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method8150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new na(this, this.aYa2, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method8083(@OriginalArg(0) Class4_Sub13 arg0) {
		this.aYa2 = (ya) arg0;
		this.va(arg0);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	@Override
	public void method8087(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method6();
	}

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
	@Override
	public boolean method8127() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILclient!aa;II)V")
	private native void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)Lclient!za;")
	@Override
	public Class4_Sub13 method8088(@OriginalArg(0) int arg0) {
		@Pc(5) ya local5 = new ya(this, arg0);
		this.aClass163_45.method3646(local5);
		return local5;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

	@OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lclient!za;)V")
	private native void va(@OriginalArg(0) Class4_Sub13 arg0);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)Lclient!up;")
	@Override
	public Interface23 method8113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new xa(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
	public native int i();

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z")
	@Override
	public boolean method8108() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!af;)V")
	@Override
	public void method8085(@OriginalArg(0) Class9 arg0) {
		if (arg0.aClass87_1.method2177() != 0) {
			this.method5858(arg0);
			this.method5860().method3(this, Static421.anIntArray456, Static421.anIntArray458, Static421.anIntArray455, Static421.aShortArray77, arg0.aClass87_1.method2177());
		}
	}

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "()Lclient!ub;")
	@Override
	public Class359 method8115() {
		return new Class359(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()Lclient!nh;")
	@Override
	public Class92 method8076() {
		return this.aClass92_5;
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
	private void method5856() {
		System.gc();
		System.runFinalization();
		Static12.method229();
	}

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
	public native void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
	private native void ma(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)I")
	@Override
	public int method8140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "()Z")
	@Override
	public boolean method8114() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
	private native void n(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class42 method8068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new t(this, this.aYa2, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lclient!tf;")
	@Override
	public Class17 method8145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new j(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
	public native void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)I")
	@Override
	public int method8124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8110(@OriginalArg(0) Canvas arg0) {
		if (this.aP1.aCanvas8 == arg0) {
			this.method8132((Canvas) null);
		}
		@Pc(16) p local16 = (p) this.aClass66_29.method1994((long) arg0.hashCode());
		if (local16 != null) {
			local16.method9000();
			local16.method6146();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lclient!sea;")
	@Override
	public Interface21 method8084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method8145(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)V")
	@Override
	public void method8120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6145(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!af;I)V")
	@Override
	public void method8094(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1) {
		this.method5858(arg0);
		this.method5860().method3(this, Static421.anIntArray456, Static421.anIntArray458, Static421.anIntArray455, Static421.aShortArray77, arg0.aClass87_1.method2177());
	}

	@OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
	public native int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILclient!aa;II)V")
	public native void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
	public native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
	public native int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z")
	@Override
	public boolean method8074() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
	private native void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
	public native void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!nm;)V")
	@Override
	public void method8117(@OriginalArg(0) Interface18 arg0) {
		@Pc(2) wa local2 = (wa) arg0;
		this.n(local2.aJ1.nativeid, local2.aXa1.nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "()V")
	@Override
	public void method8093() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method8123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.Z(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
	protected native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
	public native void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
	public native int E();

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
	@Override
	public void method8092(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
	public native void K(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
	public native void xa(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Lclient!d;II)V")
	private native void MA(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lclient!kp;)V")
	@Override
	public void method8090(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub29[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static421.anIntArray460[local1++] = arg1[local3].method7627();
			Static421.anIntArray460[local1++] = arg1[local3].method7630();
			Static421.anIntArray460[local1++] = arg1[local3].method7628();
			Static421.anIntArray460[local1++] = arg1[local3].method7632();
			Static421.aFloatArray48[local3] = arg1[local3].method7626();
			Static421.anIntArray460[local1++] = arg1[local3].method7633();
		}
		this.N(arg0, Static421.anIntArray460, Static421.aFloatArray48);
	}

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z")
	@Override
	public boolean method8107() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "()V")
	@Override
	public void method8154() {
	}

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "()V")
	@Override
	public void method8134() {
		this.method8132(this.aP1.aCanvas8);
	}

	@OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
	private Object method5857() {
		return new ba(this);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method8116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lclient!tf;")
	@Override
	public Class17 method8151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new j(this, arg0, arg1, arg2, arg3, !arg4);
	}

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z")
	@Override
	public boolean method8101() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!af;Z)V")
	private void method5858(@OriginalArg(0) Class9 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class3_Sub3_Sub1 local15 = (Class3_Sub3_Sub1) arg0.aClass87_1.method2175(); local15 != null; local15 = (Class3_Sub3_Sub1) arg0.aClass87_1.method2180()) {
			Static421.anIntArray456[local1++] = local15.anInt1692;
			Static421.anIntArray456[local1++] = local15.anInt1696;
			Static421.anIntArray456[local1++] = local15.anInt1699;
			Static421.anIntArray458[local3++] = local15.anInt1695;
			Static421.aShortArray77[local7++] = (short) local15.anInt1694;
			Static421.anIntArray455[local5++] = local15.anInt1698;
		}
	}

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
	public native int I();

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
	public native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!jia;)V")
	@Override
	public void method8069(@OriginalArg(0) Class68 arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method8125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
	public native int[] Y();

	@OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
	private boolean method5859(@OriginalArg(0) short arg0) {
		@Pc(2) Interface9 local2 = super.anInterface9_12;
		synchronized (super.anInterface9_12) {
			if (!super.anInterface9_12.method1557(arg0)) {
				return false;
			}
			@Pc(22) Class130 local22 = super.anInterface9_12.method1558(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(44) int[] local44;
			if (local22.anInt3119 == 2) {
				local44 = super.anInterface9_12.method1559(arg0, 128, 128, 0.7F);
			} else {
				local44 = super.anInterface9_12.method1555(arg0, 0.7F, true, 128, 128);
			}
			this.CA(arg0, local44, local22.aShort49, local22.anInt3119, local22.aByte39, local22.aByte35, local22.anInt3118, local22.aBoolean236, local22.aByte40, local22.aByte38, local22.aByte34, local22.aByte36, local22.aBoolean241, local22.aBoolean238, local22.aBoolean240, local22.aBoolean235, local22.aBoolean239, local22.aByte37, local22.aBoolean242, local22.aBoolean237, local22.anInt3117);
			return true;
		}
	}

	@OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
	public native void la();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.wa(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
	public native void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8144(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass66_29.method1994((long) arg0.hashCode());
		if (local8 == null) {
			try {
				@Pc(13) Class local13 = Class.forName("java.awt.Canvas");
				@Pc(23) Method local23 = local13.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local23.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(35) Exception local35) {
			}
			local8 = new p(this, arg0, arg1, arg2);
			this.aClass66_29.method1985(local8, (long) arg0.hashCode());
		} else if (local8.anInt6984 != arg1 || local8.anInt6983 != arg2) {
			local8.method6147(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!nh;)V")
	@Override
	public void method8133(@OriginalArg(0) Class92 arg0) {
		this.aClass92_5 = arg0;
		this.ma(((ja) arg0).nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "()Z")
	@Override
	public boolean method8104() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z")
	@Override
	public boolean method8130() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
	@Override
	public void method8102(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
	public native void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "()Lclient!a;")
	public a method5860() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt6647; local1++) {
			if (this.anAArray1[local1].aRunnable1 == Thread.currentThread()) {
				return this.anAArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
	public native void GA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
	@Override
	public boolean method8146() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
	public native int XA();

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
	@Override
	public boolean method8152() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method8067() {
	}

	@OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
	public native int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "()V")
	@Override
	protected void method8126() {
		if (this.aBoolean511) {
			return;
		}
		this.anAArray1 = null;
		this.aP1 = null;
		this.aYa2 = null;
		this.aClass92_6 = null;
		this.aClass66_29.method1988();
		for (@Pc(25) ya local25 = (ya) this.aClass163_45.method3639(); local25 != null; local25 = (ya) this.aClass163_45.method3640()) {
			local25.ga();
		}
		this.aClass163_45.method3643();
		this.FA();
		if (this.aBoolean512) {
			Static373.method4918(true, false);
			this.aBoolean512 = false;
		}
		this.method5856();
		Static12.method232();
		this.aBoolean511 = true;
	}

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
	public native void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()Lclient!nh;")
	@Override
	public Class92 method8078() {
		return this.aClass92_6;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
	private boolean method5861(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class130 local9 = super.anInterface9_12.method1558(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.AA(arg0, local9.aShort49, local9.anInt3119, local9.aByte39, local9.aByte35, local9.anInt3118, local9.aBoolean236, local9.aByte40, local9.aByte38, local9.aByte34, local9.aByte36, local9.aBoolean241, local9.aBoolean238, local9.aBoolean240, local9.aBoolean235, local9.aBoolean239, local9.aByte37, local9.aBoolean242, local9.aBoolean237, local9.anInt3117);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z")
	@Override
	public boolean method8135() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
	private native void CA(@OriginalArg(0) short arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) boolean arg16, @OriginalArg(17) byte arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) boolean arg19, @OriginalArg(20) int arg20);

	@OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
	private native void FA();

	@OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()V")
	@Override
	public void method8073() {
	}

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "()Lclient!nh;")
	@Override
	public Class92 method8118() {
		return new ja();
	}

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method8070();
		if (this.nativeid != 0L) {
			Static12.method230(this);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!so;IIII)Lclient!ka;")
	@Override
	public Class62 method8072(@OriginalArg(0) Class334 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new i(this, this.aYa2, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "()Z")
	@Override
	public boolean method8136() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
	@Override
	public void method8109(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method10();
	}

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lclient!p;)V")
	private native void t(@OriginalArg(0) p arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8098(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass66_29.method1994((long) arg0.hashCode());
		local8.method6147(arg0, arg1, arg2);
		if (arg0 != null && arg0 == this.aP1.aCanvas8) {
			this.method8132(arg0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
	public native void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z")
	@Override
	public boolean method8071() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
	private native void AA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) byte arg16, @OriginalArg(17) boolean arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) int arg19);

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
	public native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!cr;Z)Lclient!tf;")
	@Override
	public Class17 method8147(@OriginalArg(0) Class51 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) j local17 = new j(this, arg0.anIntArray107, arg0.aByteArray23, arg0.aByteArray22, 0, arg0.anInt1661, arg0.anInt1661, arg0.anInt1657);
		local17.method5250(arg0.anInt1659, arg0.anInt1662, arg0.anInt1660, arg0.anInt1658);
		return local17;
	}

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "()V")
	@Override
	public void method8153() {
	}

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)V")
	@Override
	public void method8131(@OriginalArg(0) int arg0) {
		Static12.method229();
		this.d(arg0);
		for (@Pc(10) ya local10 = (ya) this.aClass163_45.method3639(); local10 != null; local10 = (ya) this.aClass163_45.method3640()) {
			local10.r();
		}
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "()I")
	@Override
	public int method8086() {
		return 4;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!jia;Lclient!jia;FLclient!jia;)Lclient!jia;")
	@Override
	public Class68 method8138(@OriginalArg(0) Class68 arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class68 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "()V")
	@Override
	public void method8149() {
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIIII)Lclient!jia;")
	@Override
	public Class68 method8112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method8091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5860().method12(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
	@Override
	public void method8155(@OriginalArg(0) int[] arg0) {
		@Pc(4) Dimension local4 = this.aP1.aCanvas8.getSize();
		arg0[0] = local4.width;
		arg0[1] = local4.height;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!bq;[Lclient!cr;Z)Lclient!da;")
	@Override
	public Class56 method8081(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class51[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt1661;
			local7[local11] = arg1[local11].anInt1657;
			if (arg1[local11].aByteArray22 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new h(this, this.aYa2, arg0, arg1, (Class17[]) null);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lclient!tf;")
	@Override
	public Class17 method8156(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new j(this, arg0, 0, arg1, arg2, arg3, false);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8132(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aP1 = null;
			this.t((p) null);
		} else {
			@Pc(10) p local10 = (p) this.aClass66_29.method1994((long) arg0.hashCode());
			this.aP1 = local10;
			this.t(local10);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8106(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lclient!kp;")
	@Override
	public Class4_Sub29 method8075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class4_Sub29_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}
}
