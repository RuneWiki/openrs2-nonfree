import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class oa extends Class101 implements Interface4 {

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "Lclient!ya;")
	private ya aYa2;

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "Lclient!dm;")
	private Class76 aClass76_10;

	@OriginalMember(owner = "client!oa", name = "G", descriptor = "Lclient!p;")
	private p aP1;

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "[Lclient!a;")
	private a[] anAArray1;

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
	public int anInt7685;

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "Z")
	private boolean aBoolean570 = false;

	@OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
	public final long nativeid = 0L;

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "Lclient!ow;")
	private final Class271 aClass271_44 = new Class271();

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "I")
	private int anInt7683 = 4096;

	@OriginalMember(owner = "client!oa", name = "J", descriptor = "I")
	private int anInt7684 = 4096;

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "Lclient!si;")
	private final Class335 aClass335_27 = new Class335(4);

	@OriginalMember(owner = "client!oa", name = "O", descriptor = "Z")
	private boolean aBoolean571 = false;

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "Lclient!dm;")
	private Class76 aClass76_11;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public oa(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg1);
		try {
			if (!Static91.method1580("sw3d")) {
				throw new RuntimeException("");
			}
			Static399.method6590();
			this.MA(super.anInterface3_12, 0, 0);
			Static28.method489(false, true);
			this.aBoolean571 = true;
			this.aClass76_11 = new ja();
			this.method8067(new ja());
			this.method8088(1);
			this.method8062(0);
			if (arg0 != null) {
				this.method8119(arg0, arg2, arg3);
				this.method8144(arg0);
			}
		} catch (@Pc(80) Throwable local80) {
			this.method8148();
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
	@Override
	public boolean method8136() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
	public native void K(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lclient!mq;")
	@Override
	public Class71 method8079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new j(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "()Z")
	@Override
	public boolean method8114() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method8082(@OriginalArg(0) Class2_Sub5 arg0) {
		this.aYa2 = (ya) arg0;
		this.va(arg0);
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)I")
	@Override
	public int method8095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lclient!mfa;")
	@Override
	public Class2_Sub13 method8127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub13_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8144(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aP1 = null;
			this.t((p) null);
		} else {
			@Pc(10) p local10 = (p) this.aClass335_27.method8357((long) arg0.hashCode());
			this.aP1 = local10;
			this.t(local10);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!gka;I)V")
	@Override
	public void method8115(@OriginalArg(0) Class127 arg0, @OriginalArg(1) int arg1) {
		this.method6868(arg0);
		this.method6870().method16(this, Static416.anIntArray373, Static416.anIntArray375, Static416.anIntArray371, Static416.aShortArray98, arg0.aClass390_1.method9680());
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	@Override
	public void method8062(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method7();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method8097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new na(this, this.aYa2, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8092(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass335_27.method8357((long) arg0.hashCode());
		local8.method7191(arg0, arg1, arg2);
		if (arg0 != null && arg0 == this.aP1.aCanvas10) {
			this.method8144(arg0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "()Z")
	@Override
	public boolean method8133() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
	public native void GA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "()V")
	@Override
	public void method8147() {
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(IIIIII)Lclient!vr;")
	@Override
	public Class3 method8130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z")
	@Override
	public boolean method8102() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8143(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method7190(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
	public native void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
	public native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8119(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass335_27.method8357((long) arg0.hashCode());
		if (local8 == null) {
			try {
				@Pc(13) Class local13 = Class.forName("java.awt.Canvas");
				@Pc(23) Method local23 = local13.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local23.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(35) Exception local35) {
			}
			local8 = new p(this, arg0, arg1, arg2);
			this.aClass335_27.method8356(local8, (long) arg0.hashCode());
		} else if (local8.anInt8042 != arg1 || local8.anInt8043 != arg2) {
			local8.method7191(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
	private Object method6867() {
		return new ba(this);
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	private native void d(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
	public native void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!lf;Lclient!jk;)Lclient!rs;")
	@Override
	public Interface17 method8131(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Interface8 arg1) {
		return new wa(this, (j) arg0, (xa) arg1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method8138() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method8137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z")
	@Override
	public boolean method8117() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "()Z")
	@Override
	public boolean method8101() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method8148();
		if (this.nativeid != 0L) {
			Static399.method6591(this);
		}
	}

	@OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
	public native int XA();

	@OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z")
	@Override
	public boolean method8110() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method8129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!rs;)V")
	@Override
	public void method8108(@OriginalArg(0) Interface17 arg0) {
		@Pc(2) wa local2 = (wa) arg0;
		this.n(local2.aJ1.nativeid, local2.aXa1.nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
	private native void n(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
	public native void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lclient!p;)V")
	private native void t(@OriginalArg(0) p arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!gka;Z)V")
	private void method6868(@OriginalArg(0) Class127 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class15_Sub2_Sub1 local15 = (Class15_Sub2_Sub1) arg0.aClass390_1.method9676(); local15 != null; local15 = (Class15_Sub2_Sub1) arg0.aClass390_1.method9675()) {
			Static416.anIntArray373[local1++] = local15.anInt10896;
			Static416.anIntArray373[local1++] = local15.anInt10899;
			Static416.anIntArray373[local1++] = local15.anInt10900;
			Static416.anIntArray375[local3++] = local15.anInt10898;
			Static416.aShortArray98[local7++] = (short) local15.anInt10902;
			Static416.anIntArray371[local5++] = local15.anInt10903;
		}
	}

	@OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
	private native void CA(@OriginalArg(0) short arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) boolean arg16, @OriginalArg(17) byte arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) boolean arg19, @OriginalArg(20) int arg20);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method8091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.wa(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "()Z")
	@Override
	public boolean method8135() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!gka;)V")
	@Override
	public void method8065(@OriginalArg(0) Class127 arg0) {
		if (arg0.aClass390_1.method9680() != 0) {
			this.method6868(arg0);
			this.method6870().method16(this, Static416.anIntArray373, Static416.anIntArray375, Static416.anIntArray371, Static416.aShortArray98, arg0.aClass390_1.method9680());
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	@Override
	public void method8080(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method10();
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z")
	@Override
	public boolean method8070() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()Lclient!dm;")
	@Override
	public Class76 method8085() {
		return this.aClass76_11;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!vr;)V")
	@Override
	public void method8068(@OriginalArg(0) Class3 arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
	public native int[] Y();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lclient!mq;")
	@Override
	public Class71 method8105(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new j(this, arg0, 0, arg1, arg2, arg3, false);
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
	@Override
	public void method8098() {
		this.anInt7684 = this.anInt7683 = 10000;
		if (this.anInt7685 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method8088(this.anInt7685);
		this.method8062(0);
	}

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
	public native int i();

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "()Lclient!ev;")
	@Override
	public Class99 method8090() {
		return new Class99(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "()Lclient!dm;")
	@Override
	public Class76 method8141() {
		return new ja();
	}

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILclient!aa;II)V")
	public native void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILclient!aa;II)V")
	private native void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V")
	@Override
	public void method8121(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
	@Override
	public void method8106(@OriginalArg(0) int[] arg0) {
		@Pc(4) Dimension local4 = this.aP1.aCanvas10.getSize();
		arg0[0] = local4.width;
		arg0[1] = local4.height;
	}

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
	public native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method8132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6870().method14(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
	@Override
	public void method8122(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
	public native int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "()I")
	@Override
	public int method8109() {
		return 4;
	}

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8069(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
	public native int E();

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z")
	@Override
	public boolean method8128() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
	public native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
	@Override
	public boolean method8123() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
	private native void AA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) byte arg16, @OriginalArg(17) boolean arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) int arg19);

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z")
	@Override
	public boolean method8086() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
	private boolean method6869(@OriginalArg(0) short arg0) {
		@Pc(2) Interface3 local2 = super.anInterface3_12;
		synchronized (super.anInterface3_12) {
			if (!super.anInterface3_12.method1940(arg0)) {
				return false;
			}
			@Pc(22) Class136 local22 = super.anInterface3_12.method1941(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(44) int[] local44;
			if (local22.anInt4370 == 2) {
				local44 = super.anInterface3_12.method1939(0.7F, arg0, 128, 128);
			} else {
				local44 = super.anInterface3_12.method1938(true, 0.7F, 128, arg0, 128);
			}
			this.CA(arg0, local44, local22.aShort48, local22.anInt4370, local22.aByte62, local22.aByte64, local22.anInt4369, local22.aBoolean333, local22.aByte67, local22.aByte66, local22.aByte61, local22.aByte65, local22.aBoolean329, local22.aBoolean332, local22.aBoolean330, local22.aBoolean331, local22.aBoolean335, local22.aByte63, local22.aBoolean336, local22.aBoolean334, local22.anInt4368);
			return true;
		}
	}

	@OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
	private native void ma(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)Lclient!jk;")
	@Override
	public Interface8 method8140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new xa(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
	public native void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "()V")
	@Override
	public void method8125() {
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
	public native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
	private native void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
	@Override
	public void method8118(@OriginalArg(0) int arg0) {
		Static399.method6587();
		this.d(arg0);
		for (@Pc(10) ya local10 = (ya) this.aClass271_44.method7177(); local10 != null; local10 = (ya) this.aClass271_44.method7175()) {
			local10.r();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!de;Z)Lclient!mq;")
	@Override
	public Class71 method8063(@OriginalArg(0) Class67 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) j local17 = new j(this, arg0.anIntArray91, arg0.aByteArray19, arg0.aByteArray20, 0, arg0.anInt1761, arg0.anInt1761, arg0.anInt1759);
		local17.method7690(arg0.anInt1760, arg0.anInt1763, arg0.anInt1762, arg0.anInt1764);
		return local17;
	}

	@OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
	public native void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "()Lclient!dm;")
	@Override
	public Class76 method8112() {
		return this.aClass76_10;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()V")
	@Override
	public void method8066() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!rt;[Lclient!de;Z)Lclient!da;")
	@Override
	public Class59 method8146(@OriginalArg(0) Class324 arg0, @OriginalArg(1) Class67[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt1761;
			local7[local11] = arg1[local11].anInt1759;
			if (arg1[local11].aByteArray20 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new h(this, this.aYa2, arg0, arg1, (Class71[]) null);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8074(@OriginalArg(0) Canvas arg0) {
		if (this.aP1.aCanvas10 == arg0) {
			this.method8144((Canvas) null);
		}
		@Pc(16) p local16 = (p) this.aClass335_27.method8357((long) arg0.hashCode());
		if (local16 != null) {
			local16.method9825();
			local16.method7194();
		}
	}

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "()Lclient!a;")
	public a method6870() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7685; local1++) {
			if (this.anAArray1[local1].aRunnable1 == Thread.currentThread()) {
				return this.anAArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
	private native void FA();

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
	private void method6871() {
		System.gc();
		System.runFinalization();
		Static399.method6587();
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)Lclient!za;")
	@Override
	public Class2_Sub5 method8100(@OriginalArg(0) int arg0) {
		@Pc(5) ya local5 = new ya(this, arg0);
		this.aClass271_44.method7174(local5);
		return local5;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()V")
	@Override
	public void method8072() {
		this.method8144(this.aP1.aCanvas10);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V")
	@Override
	public void method8081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method7193(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I")
	@Override
	public int method8083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "()V")
	@Override
	public void method8107() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!dm;)V")
	@Override
	public void method8067(@OriginalArg(0) Class76 arg0) {
		this.aClass76_10 = arg0;
		this.ma(((ja) arg0).nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
	@Override
	public void method8088(@OriginalArg(0) int arg0) {
		this.anInt7685 = arg0;
		this.anAArray1 = new a[this.anInt7685];
		for (@Pc(9) int local9 = 0; local9 < this.anInt7685; local9++) {
			this.anAArray1[local9] = new a(this, this.anInt7684, this.anInt7683);
		}
	}

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
	@Override
	public boolean method8134() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method8126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
	protected native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lclient!mq;")
	@Override
	public Class71 method8077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new j(this, arg0, arg1, arg2, arg3, !arg4);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lclient!mfa;)V")
	@Override
	public void method8094(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static416.anIntArray370[local1++] = arg1[local3].method9411();
			Static416.anIntArray370[local1++] = arg1[local3].method9410();
			Static416.anIntArray370[local1++] = arg1[local3].method9406();
			Static416.anIntArray370[local1++] = arg1[local3].method9407();
			Static416.aFloatArray52[local3] = arg1[local3].method9404();
			Static416.anIntArray370[local1++] = arg1[local3].method9405();
		}
		this.N(arg0, Static416.anIntArray370, Static416.aFloatArray52);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method8073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.Z(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "()V")
	@Override
	public void method8116() {
	}

	@OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Lclient!d;II)V")
	private native void MA(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
	private boolean method6872(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class136 local9 = super.anInterface3_12.method1941(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.AA(arg0, local9.aShort48, local9.anInt4370, local9.aByte62, local9.aByte64, local9.anInt4369, local9.aBoolean333, local9.aByte67, local9.aByte66, local9.aByte61, local9.aByte65, local9.aBoolean329, local9.aBoolean332, local9.aBoolean330, local9.aBoolean331, local9.aBoolean335, local9.aByte63, local9.aBoolean336, local9.aBoolean334, local9.anInt4368);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class18 method8087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new t(this, this.aYa2, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "()V")
	@Override
	protected void method8124() {
		if (this.aBoolean570) {
			return;
		}
		this.anAArray1 = null;
		this.aP1 = null;
		this.aYa2 = null;
		this.aClass76_11 = null;
		this.aClass335_27.method8353();
		for (@Pc(25) ya local25 = (ya) this.aClass271_44.method7177(); local25 != null; local25 = (ya) this.aClass271_44.method7175()) {
			local25.ga();
		}
		this.aClass271_44.method7181();
		this.FA();
		if (this.aBoolean571) {
			Static508.method7933(true, false);
			this.aBoolean571 = false;
		}
		this.method6871();
		Static399.method6589();
		this.aBoolean570 = true;
	}

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
	public native void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
	public native void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
	public native void la();

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
	public native void C(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ida;IIII)Lclient!ka;")
	@Override
	public Class14 method8064(@OriginalArg(0) Class159 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new i(this, this.aYa2, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)Lclient!lf;")
	@Override
	public Interface11 method8084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method8079(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
	public native int I();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!vr;Lclient!vr;FLclient!vr;)Lclient!vr;")
	@Override
	public Class3 method8071(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class3 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
	public native void xa(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
	public native void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
	public native void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
	public native int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
	public native int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
	private native void N(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
	public native void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lclient!za;)V")
	private native void va(@OriginalArg(0) Class2_Sub5 arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	@Override
	public void method8093(@OriginalArg(0) boolean arg0) {
	}
}
