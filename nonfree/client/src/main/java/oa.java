import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class oa extends Class57 implements Interface3 {

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "Lclient!ya;")
	private ya aYa2;

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "Lclient!p;")
	private p aP1;

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "Lclient!qq;")
	private Class203 aClass203_11;

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "[Lclient!a;")
	private a[] anAArray1;

	@OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
	public int anInt7102;

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "Z")
	private boolean aBoolean546 = false;

	@OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
	public final long nativeid = 0L;

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "Lclient!ef;")
	private final Class102 aClass102_46 = new Class102();

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
	private int anInt7101 = 4096;

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "I")
	private int anInt7100 = 4096;

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "Lclient!qha;")
	private final Class291 aClass291_27 = new Class291(4);

	@OriginalMember(owner = "client!oa", name = "J", descriptor = "Z")
	private boolean aBoolean547 = false;

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "Lclient!qq;")
	private Class203 aClass203_10;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public oa(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg1);
		try {
			if (!Static513.method7491("sw3d")) {
				throw new RuntimeException("");
			}
			Static428.method6346();
			this.MA(super.anInterface1_11, 0, 0);
			Static303.method4654(false, true);
			this.aBoolean547 = true;
			this.aClass203_10 = new ja();
			this.method7657(new ja());
			this.method7690(1);
			this.method7671(0);
			if (arg0 != null) {
				this.method7727(arg0, arg2, arg3);
				this.method7669(arg0);
			}
		} catch (@Pc(82) Throwable local82) {
			this.method7722();
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	@Override
	public void method7660(@OriginalArg(0) int arg0) {
		Static428.method6348();
		this.d(arg0);
		for (@Pc(10) ya local10 = (ya) this.aClass102_46.method1916(); local10 != null; local10 = (ya) this.aClass102_46.method1915()) {
			local10.r();
		}
	}

	@OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
	private native void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "()Lclient!qq;")
	@Override
	public Class203 method7676() {
		return new ja();
	}

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
	public native int I();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7699(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass291_27.method6993((long) arg0.hashCode(), 1);
		local8.method6432(arg0, arg1, arg2);
		if (arg0 != null && arg0 == this.aP1.aCanvas9) {
			this.method7669(arg0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
	public native void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILclient!aa;II)V")
	private native void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
	public native void xa(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method7722();
		if (this.nativeid != 0L) {
			Static428.method6349(this);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!jw;I)V")
	@Override
	public void method7662(@OriginalArg(0) Class193 arg0, @OriginalArg(1) int arg1) {
		this.method6111(arg0);
		this.method6108().method14(this, Static409.anIntArray421, Static409.anIntArray418, Static409.anIntArray420, Static409.aShortArray88, arg0.aClass154_1.method3050());
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)I")
	@Override
	public int method7670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7727(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass291_27.method6993((long) arg0.hashCode(), 1);
		if (local8 == null) {
			try {
				@Pc(15) Class local15 = Class.forName("java.awt.Canvas");
				@Pc(27) Method local27 = local15.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local27.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(39) Exception local39) {
			}
			local8 = new p(this, arg0, arg1, arg2);
			this.aClass291_27.method6984((long) arg0.hashCode(), local8);
		} else if (local8.anInt7443 != arg1 || local8.anInt7442 != arg2) {
			local8.method6432(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
	public native void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
	@Override
	public void method7678(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
	public native int XA();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lclient!fs;")
	@Override
	public Class134 method7688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new j(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method7696() {
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)Lclient!ol;")
	@Override
	public Class29 method7667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lclient!rk;")
	@Override
	public Interface23 method7653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new xa(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lclient!fs;")
	@Override
	public Class134 method7705(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new j(this, arg0, 0, arg1, arg2, arg3, false);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!jw;)V")
	@Override
	public void method7728(@OriginalArg(0) Class193 arg0) {
		if (arg0.aClass154_1.method3050() != 0) {
			this.method6111(arg0);
			this.method6108().method14(this, Static409.anIntArray421, Static409.anIntArray418, Static409.anIntArray420, Static409.aShortArray88, arg0.aClass154_1.method3050());
		}
	}

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
	public native void K(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method7713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ol;Lclient!ol;FLclient!ol;)Lclient!ol;")
	@Override
	public Class29 method7652(@OriginalArg(0) Class29 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class29 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
	public native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method7691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.Z(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lclient!za;)V")
	private native void va(@OriginalArg(0) Class5_Sub10 arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!nq;Lclient!rk;)Lclient!gea;")
	@Override
	public Interface6 method7668(@OriginalArg(0) Interface18 arg0, @OriginalArg(1) Interface23 arg1) {
		return new wa(this, (j) arg0, (xa) arg1);
	}

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "()Z")
	@Override
	public boolean method7704() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lclient!fs;")
	@Override
	public Class134 method7712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new j(this, arg0, arg1, arg2, arg3, !arg4);
	}

	@OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
	private native void CA(@OriginalArg(0) short arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) boolean arg16, @OriginalArg(17) byte arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) boolean arg19, @OriginalArg(20) int arg20);

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
	@Override
	public void method7671(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method5();
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "()V")
	@Override
	public void method7645() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7659(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
	public native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "()Lclient!a;")
	public a method6108() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7102; local1++) {
			if (this.anAArray1[local1].aRunnable1 == Thread.currentThread()) {
				return this.anAArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ju;IIII)Lclient!ka;")
	@Override
	public Class164 method7700(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new i(this, this.aYa2, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method7684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
	public native void la();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method7675(@OriginalArg(0) Class5_Sub10 arg0) {
		this.aYa2 = (ya) arg0;
		this.va(arg0);
	}

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
	public native int E();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class22 method7648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new t(this, this.aYa2, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
	private native void n(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
	public native int i();

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "()V")
	@Override
	public void method7717() {
	}

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
	@Override
	public boolean method7711() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
	private native void AA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) byte arg16, @OriginalArg(17) boolean arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) int arg19);

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z")
	@Override
	public boolean method7694() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
	private native void ma(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lclient!p;)V")
	private native void t(@OriginalArg(0) p arg0);

	@OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Lclient!d;II)V")
	private native void MA(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILclient!aa;II)V")
	public native void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "()V")
	@Override
	public void method7651() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
	@Override
	public void method7692(@OriginalArg(0) int[] arg0) {
		@Pc(4) Dimension local4 = this.aP1.aCanvas9.getSize();
		arg0[0] = local4.width;
		arg0[1] = local4.height;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method7686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.wa(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!qq;)V")
	@Override
	public void method7657(@OriginalArg(0) Class203 arg0) {
		this.aClass203_11 = arg0;
		this.ma(((ja) arg0).nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "(I)Lclient!za;")
	@Override
	public Class5_Sub10 method7646(@OriginalArg(0) int arg0) {
		@Pc(5) ya local5 = new ya(this, arg0);
		this.aClass102_46.method1921(local5);
		return local5;
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z")
	@Override
	public boolean method7644() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "()V")
	@Override
	public void method7718() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method7658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new na(this, this.aYa2, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lclient!uf;)V")
	@Override
	public void method7716(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub43[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static409.anIntArray417[local1++] = arg1[local3].method8251();
			Static409.anIntArray417[local1++] = arg1[local3].method8257();
			Static409.anIntArray417[local1++] = arg1[local3].method8255();
			Static409.anIntArray417[local1++] = arg1[local3].method8254();
			Static409.aFloatArray74[local3] = arg1[local3].method8250();
			Static409.anIntArray417[local1++] = arg1[local3].method8253();
		}
		this.N(arg0, Static409.anIntArray417, Static409.aFloatArray74);
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	private native void d(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	@Override
	public void method7701(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
	protected native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
	public native void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "()Lclient!qq;")
	@Override
	public Class203 method7672() {
		return this.aClass203_10;
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z")
	@Override
	public boolean method7642() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
	private void method6109() {
		System.gc();
		System.runFinalization();
		Static428.method6348();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7669(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aP1 = null;
			this.t((p) null);
		} else {
			@Pc(10) p local10 = (p) this.aClass291_27.method6993((long) arg0.hashCode(), 1);
			this.aP1 = local10;
			this.t(local10);
		}
	}

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
	@Override
	public void method7724() {
		this.anInt7101 = this.anInt7100 = 10000;
		if (this.anInt7102 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method7690(this.anInt7102);
		this.method7671(0);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z")
	@Override
	public boolean method7697() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
	private native void N(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!iga;Z)Lclient!fs;")
	@Override
	public Class134 method7654(@OriginalArg(0) Class173 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) j local17 = new j(this, arg0.anIntArray244, arg0.aByteArray28, arg0.aByteArray27, 0, arg0.anInt4282, arg0.anInt4282, arg0.anInt4287);
		local17.method9229(arg0.anInt4283, arg0.anInt4286, arg0.anInt4285, arg0.anInt4284);
		return local17;
	}

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z")
	@Override
	public boolean method7707() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
	public native int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "(I)V")
	@Override
	public void method7689(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method13();
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)Lclient!nq;")
	@Override
	public Interface18 method7649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method7688(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ol;)V")
	@Override
	public void method7702(@OriginalArg(0) Class29 arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
	public native void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "()Z")
	@Override
	public boolean method7665() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
	private boolean method6110(@OriginalArg(0) short arg0) {
		@Pc(2) Interface1 local2 = super.anInterface1_11;
		synchronized (super.anInterface1_11) {
			if (!super.anInterface1_11.method2860(arg0)) {
				return false;
			}
			@Pc(22) Class233 local22 = super.anInterface1_11.method2863(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(44) int[] local44;
			if (local22.anInt6313 == 2) {
				local44 = super.anInterface1_11.method2862(128, 0.7F, arg0, 128);
			} else {
				local44 = super.anInterface1_11.method2861(true, arg0, 128, 128, 0.7F);
			}
			this.CA(arg0, local44, local22.aShort78, local22.anInt6313, local22.aByte94, local22.aByte92, local22.anInt6309, local22.aBoolean485, local22.aByte97, local22.aByte98, local22.aByte96, local22.aByte93, local22.aBoolean482, local22.aBoolean481, local22.aBoolean484, local22.aBoolean478, local22.aBoolean480, local22.aByte95, local22.aBoolean479, local22.aBoolean483, local22.anInt6310);
			return true;
		}
	}

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "()Z")
	@Override
	public boolean method7706() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7666(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6435(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
	public native void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "()Z")
	@Override
	public boolean method7719() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
	@Override
	public void method7690(@OriginalArg(0) int arg0) {
		this.anInt7102 = arg0;
		this.anAArray1 = new a[this.anInt7102];
		for (@Pc(9) int local9 = 0; local9 < this.anInt7102; local9++) {
			this.anAArray1[local9] = new a(this, this.anInt7101, this.anInt7100);
		}
	}

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
	public native int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
	private native void FA();

	@OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
	public native int[] Y();

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "()V")
	@Override
	public void method7663() {
		this.method7669(this.aP1.aCanvas9);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6108().method6(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z")
	@Override
	public boolean method7664() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()V")
	@Override
	protected void method7643() {
		if (this.aBoolean546) {
			return;
		}
		this.anAArray1 = null;
		this.aP1 = null;
		this.aYa2 = null;
		this.aClass203_10 = null;
		this.aClass291_27.method6986(-115);
		for (@Pc(26) ya local26 = (ya) this.aClass102_46.method1916(); local26 != null; local26 = (ya) this.aClass102_46.method1915()) {
			local26.ga();
		}
		this.aClass102_46.method1932();
		this.FA();
		if (this.aBoolean547) {
			Static147.method2073(true, false);
			this.aBoolean547 = false;
		}
		this.method6109();
		Static428.method6347();
		this.aBoolean546 = true;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)I")
	@Override
	public int method7661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
	public native void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
	public native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lclient!uf;")
	@Override
	public Class5_Sub43 method7680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class5_Sub43_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
	public native void C(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)V")
	@Override
	public void method7673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6436(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!jw;Z)V")
	private void method6111(@OriginalArg(0) Class193 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class8_Sub8_Sub1 local15 = (Class8_Sub8_Sub1) arg0.aClass154_1.method3049(); local15 != null; local15 = (Class8_Sub8_Sub1) arg0.aClass154_1.method3051()) {
			Static409.anIntArray421[local1++] = local15.anInt7345;
			Static409.anIntArray421[local1++] = local15.anInt7350;
			Static409.anIntArray421[local1++] = local15.anInt7349;
			Static409.anIntArray418[local3++] = local15.anInt7344;
			Static409.aShortArray88[local7++] = (short) local15.anInt7342;
			Static409.anIntArray420[local5++] = local15.anInt7348;
		}
	}

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z")
	@Override
	public boolean method7674() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!gea;)V")
	@Override
	public void method7730(@OriginalArg(0) Interface6 arg0) {
		@Pc(2) wa local2 = (wa) arg0;
		this.n(local2.aJ1.nativeid, local2.aXa1.nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
	public native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!lq;[Lclient!iga;Z)Lclient!da;")
	@Override
	public Class80 method7708(@OriginalArg(0) Class224 arg0, @OriginalArg(1) Class173[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt4282;
			local7[local11] = arg1[local11].anInt4287;
			if (arg1[local11].aByteArray27 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new h(this, this.aYa2, arg0, arg1, (Class134[]) null);
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
	private boolean method6112(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class233 local9 = super.anInterface1_11.method2863(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.AA(arg0, local9.aShort78, local9.anInt6313, local9.aByte94, local9.aByte92, local9.anInt6309, local9.aBoolean485, local9.aByte97, local9.aByte98, local9.aByte96, local9.aByte93, local9.aBoolean482, local9.aBoolean481, local9.aBoolean484, local9.aBoolean478, local9.aBoolean480, local9.aByte95, local9.aBoolean479, local9.aBoolean483, local9.anInt6310);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
	public native void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
	public native void GA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "()Lclient!mi;")
	@Override
	public Class236 method7656() {
		return new Class236(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "()V")
	@Override
	public void method7729() {
	}

	@OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
	private Object method6113() {
		return new ba(this);
	}

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "()I")
	@Override
	public int method7721() {
		return 4;
	}

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
	public native void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
	public native void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
	@Override
	public boolean method7726() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
	public native void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	@Override
	public void method7650(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "()Lclient!qq;")
	@Override
	public Class203 method7720() {
		return this.aClass203_11;
	}

	@OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
	public native int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7703(@OriginalArg(0) Canvas arg0) {
		if (this.aP1.aCanvas9 == arg0) {
			this.method7669((Canvas) null);
		}
		@Pc(18) p local18 = (p) this.aClass291_27.method6993((long) arg0.hashCode(), 1);
		if (local18 != null) {
			local18.method9327(1);
			local18.method6433();
		}
	}
}
