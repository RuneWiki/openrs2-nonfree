import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class oa extends Class67 implements Interface4 {

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "Lclient!ya;")
	private ya aYa2;

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "Lclient!iu;")
	private Class181 aClass181_10;

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "Lclient!p;")
	private p aP1;

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
	public int anInt7703;

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "[Lclient!a;")
	private a[] anAArray1;

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "Z")
	private boolean aBoolean585 = false;

	@OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
	public final long nativeid = 0L;

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "Lclient!tj;")
	private final Class357 aClass357_45 = new Class357();

	@OriginalMember(owner = "client!oa", name = "J", descriptor = "I")
	private int anInt7701 = 4096;

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
	private int anInt7702 = 4096;

	@OriginalMember(owner = "client!oa", name = "G", descriptor = "Lclient!gn;")
	private final Class136 aClass136_33 = new Class136(4);

	@OriginalMember(owner = "client!oa", name = "O", descriptor = "Z")
	private boolean aBoolean586 = false;

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "Lclient!iu;")
	private Class181 aClass181_9;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public oa(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg1);
		try {
			if (!Static376.method5425("sw3d")) {
				throw new RuntimeException("");
			}
			Static253.method3960();
			this.MA(super.anInterface2_11, 0, 0);
			Static533.method7508(false, true);
			this.aBoolean586 = true;
			this.aClass181_9 = new ja();
			this.method7642(new ja());
			this.method7657(1);
			this.method7695(0);
			if (arg0 != null) {
				this.method7669(arg0, arg2, arg3);
				this.method7668(arg0);
			}
		} catch (@Pc(82) Throwable local82) {
			this.method7681();
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)Lclient!tt;")
	@Override
	public Interface25 method7717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method7670(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
	@Override
	public boolean method7658() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
	public native void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
	public native void C(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
	public native void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	@Override
	public void method7652(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lclient!bka;")
	@Override
	public Class9 method7686(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new j(this, arg0, 0, arg1, arg2, arg3, false);
	}

	@OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
	private native void AA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) byte arg16, @OriginalArg(17) boolean arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) int arg19);

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method7681();
		if (this.nativeid != 0L) {
			Static253.method3959(this);
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7668(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aP1 = null;
			this.t((p) null);
		} else {
			@Pc(10) p local10 = (p) this.aClass136_33.method3503((long) arg0.hashCode());
			this.aP1 = local10;
			this.t(local10);
		}
	}

	@OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
	public native void xa(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILclient!aa;II)V")
	private native void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method7708() {
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)Lclient!dn;")
	@Override
	public Class77 method7685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
	public native int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "()Z")
	@Override
	public boolean method7655() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)Lclient!za;")
	@Override
	public Class3_Sub17 method7665(@OriginalArg(0) int arg0) {
		@Pc(5) ya local5 = new ya(this, arg0);
		this.aClass357_45.method8401(local5);
		return local5;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)V")
	@Override
	public void method7630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6976(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z")
	@Override
	public boolean method7684() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z")
	@Override
	public boolean method7643() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
	@Override
	public void method7673(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
	public native void K(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
	@Override
	public void method7657(@OriginalArg(0) int arg0) {
		this.anInt7703 = arg0;
		this.anAArray1 = new a[this.anInt7703];
		for (@Pc(9) int local9 = 0; local9 < this.anInt7703; local9++) {
			this.anAArray1[local9] = new a(this, this.anInt7701, this.anInt7702);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
	@Override
	public void method7702(@OriginalArg(0) int[] arg0) {
		@Pc(4) Dimension local4 = this.aP1.aCanvas12.getSize();
		arg0[0] = local4.width;
		arg0[1] = local4.height;
	}

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
	public native void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

	@OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
	private boolean method6526(@OriginalArg(0) short arg0) {
		@Pc(2) Interface2 local2 = super.anInterface2_11;
		synchronized (super.anInterface2_11) {
			if (!super.anInterface2_11.method1024(arg0)) {
				return false;
			}
			@Pc(22) Class32 local22 = super.anInterface2_11.method1027(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(44) int[] local44;
			if (local22.anInt861 == 2) {
				local44 = super.anInterface2_11.method1026(0.7F, 128, 128, arg0);
			} else {
				local44 = super.anInterface2_11.method1025(128, 128, 0.7F, arg0, true);
			}
			this.CA(arg0, local44, local22.aShort9, local22.anInt861, local22.aByte25, local22.aByte19, local22.anInt862, local22.aBoolean71, local22.aByte20, local22.aByte24, local22.aByte22, local22.aByte23, local22.aBoolean67, local22.aBoolean65, local22.aBoolean69, local22.aBoolean68, local22.aBoolean64, local22.aByte21, local22.aBoolean66, local22.aBoolean70, local22.anInt865);
			return true;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method7675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new na(this, this.aYa2, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!pea;)V")
	@Override
	public void method7633(@OriginalArg(0) Interface20 arg0) {
		@Pc(2) wa local2 = (wa) arg0;
		this.n(local2.aJ1.nativeid, local2.aXa1.nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method7715(@OriginalArg(0) Class3_Sub17 arg0) {
		this.aYa2 = (ya) arg0;
		this.va(arg0);
	}

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
	private native void n(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
	public native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
	public native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!iq;IIII)Lclient!ka;")
	@Override
	public Class157 method7653(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new i(this, this.aYa2, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "()Lclient!iu;")
	@Override
	public Class181 method7683() {
		return this.aClass181_10;
	}

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
	public native int I();

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z")
	@Override
	public boolean method7699() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6531().method14(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
	@Override
	public void method7691(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
	public native int i();

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "()Z")
	@Override
	public boolean method7651() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "()Lclient!iu;")
	@Override
	public Class181 method7646() {
		return new ja();
	}

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7631(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass136_33.method3503((long) arg0.hashCode());
		local8.method6975(arg0, arg1, arg2);
		if (arg0 != null && arg0 == this.aP1.aCanvas12) {
			this.method7668(arg0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z")
	@Override
	public boolean method7648() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
	public native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lclient!p;)V")
	private native void t(@OriginalArg(0) p arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "()V")
	@Override
	public void method7667() {
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
	private boolean method6527(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class32 local9 = super.anInterface2_11.method1027(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.AA(arg0, local9.aShort9, local9.anInt861, local9.aByte25, local9.aByte19, local9.anInt862, local9.aBoolean71, local9.aByte20, local9.aByte24, local9.aByte22, local9.aByte23, local9.aBoolean67, local9.aBoolean65, local9.aBoolean69, local9.aBoolean68, local9.aBoolean64, local9.aByte21, local9.aBoolean66, local9.aBoolean70, local9.anInt865);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "()Lclient!ega;")
	@Override
	public Class90 method7687() {
		return new Class90(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
	public native void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
	public native int XA();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7636(@OriginalArg(0) Canvas arg0) {
		if (this.aP1.aCanvas12 == arg0) {
			this.method7668((Canvas) null);
		}
		@Pc(18) p local18 = (p) this.aClass136_33.method3503((long) arg0.hashCode());
		if (local18 != null) {
			local18.method9446();
			local18.method6977();
		}
	}

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
	public native void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	private native void d(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
	private native void ma(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!dn;Lclient!dn;FLclient!dn;)Lclient!dn;")
	@Override
	public Class77 method7662(@OriginalArg(0) Class77 arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class77 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
	private Object method6528() {
		return new ba(this);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7682(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
	public native void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "()Z")
	@Override
	public boolean method7637() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method7706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z")
	@Override
	public boolean method7661() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lclient!hba;")
	@Override
	public Interface8 method7689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new xa(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
	private native void CA(@OriginalArg(0) short arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) boolean arg16, @OriginalArg(17) byte arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) boolean arg19, @OriginalArg(20) int arg20);

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
	public native int E();

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7669(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass136_33.method3503((long) arg0.hashCode());
		if (local8 == null) {
			try {
				@Pc(15) Class local15 = Class.forName("java.awt.Canvas");
				@Pc(27) Method local27 = local15.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local27.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(39) Exception local39) {
			}
			local8 = new p(this, arg0, arg1, arg2);
			this.aClass136_33.method3508((long) arg0.hashCode(), local8);
		} else if (local8.anInt8303 != arg1 || local8.anInt8302 != arg2) {
			local8.method6975(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
	private native void FA();

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method7700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
	public native void la();

	@OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
	public native int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
	public native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "()V")
	@Override
	public void method7716() {
	}

	@OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Lclient!d;II)V")
	private native void MA(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
	private void method6529() {
		System.gc();
		System.runFinalization();
		Static253.method3961();
	}

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class313 method7679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new t(this, this.aYa2, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
	protected native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	@Override
	public void method7695(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method3();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method7698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
	@Override
	public boolean method7712() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method7713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.Z(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!dn;)V")
	@Override
	public void method7639(@OriginalArg(0) Class77 arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!hu;)V")
	@Override
	public void method7656(@OriginalArg(0) Class162 arg0) {
		if (arg0.aClass372_1.method8738() != 0) {
			this.method6530(arg0);
			this.method6531().method12(this, Static444.anIntArray412, Static444.anIntArray414, Static444.anIntArray416, Static444.aShortArray130, arg0.aClass372_1.method8738());
		}
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "()V")
	@Override
	public void method7678() {
	}

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "(I)V")
	@Override
	public void method7709(@OriginalArg(0) int arg0) {
		Static253.method3961();
		this.d(arg0);
		for (@Pc(10) ya local10 = (ya) this.aClass357_45.method8391(); local10 != null; local10 = (ya) this.aClass357_45.method8392()) {
			local10.r();
		}
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
	@Override
	public void method7672(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method4();
	}

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
	@Override
	public boolean method7697() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z")
	@Override
	public boolean method7710() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)V")
	@Override
	public void method7666() {
		this.anInt7701 = this.anInt7702 = 10000;
		if (this.anInt7703 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method7657(this.anInt7703);
		this.method7695(0);
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method7650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.wa(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!jr;Z)Lclient!bka;")
	@Override
	public Class9 method7659(@OriginalArg(0) Class194 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) j local17 = new j(this, arg0.anIntArray319, arg0.aByteArray46, arg0.aByteArray45, 0, arg0.anInt5596, arg0.anInt5596, arg0.anInt5595);
		local17.method8608(arg0.anInt5594, arg0.anInt5597, arg0.anInt5593, arg0.anInt5598);
		return local17;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!iu;)V")
	@Override
	public void method7642(@OriginalArg(0) Class181 arg0) {
		this.aClass181_10 = arg0;
		this.ma(((ja) arg0).nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!hu;Z)V")
	private void method6530(@OriginalArg(0) Class162 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class19_Sub4_Sub1 local15 = (Class19_Sub4_Sub1) arg0.aClass372_1.method8737(); local15 != null; local15 = (Class19_Sub4_Sub1) arg0.aClass372_1.method8736()) {
			Static444.anIntArray412[local1++] = local15.anInt3427;
			Static444.anIntArray412[local1++] = local15.anInt3425;
			Static444.anIntArray412[local1++] = local15.anInt3429;
			Static444.anIntArray414[local3++] = local15.anInt3423;
			Static444.aShortArray130[local7++] = (short) local15.anInt3422;
			Static444.anIntArray416[local5++] = local15.anInt3428;
		}
	}

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "()Z")
	@Override
	public boolean method7711() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "()V")
	@Override
	public void method7707() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!saa;[Lclient!jr;Z)Lclient!da;")
	@Override
	public Class44 method7641(@OriginalArg(0) Class330 arg0, @OriginalArg(1) Class194[] arg1, @OriginalArg(2) boolean arg2) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt5596;
			local7[local11] = arg1[local11].anInt5595;
			if (arg1[local11].aByteArray45 != null) {
				local9 = true;
			}
		}
		if (arg2) {
			if (local9) {
				throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
			}
			return new h(this, this.aYa2, arg0, arg1, (Class9[]) null);
		} else if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		} else {
			return new n(this, this.aYa2, arg0, arg1, (Class9[]) null);
		}
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "()Lclient!iu;")
	@Override
	public Class181 method7693() {
		return this.aClass181_9;
	}

	@OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
	public native void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
	private native void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "()V")
	@Override
	public void method7663() {
	}

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "()V")
	@Override
	public void method7645() {
		this.method7668(this.aP1.aCanvas12);
	}

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
	public native int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)I")
	@Override
	public int method7671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!hu;I)V")
	@Override
	public void method7692(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1) {
		this.method6530(arg0);
		this.method6531().method12(this, Static444.anIntArray412, Static444.anIntArray414, Static444.anIntArray416, Static444.aShortArray130, arg0.aClass372_1.method8738());
	}

	@OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
	public native void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!tt;Lclient!hba;)Lclient!pea;")
	@Override
	public Interface20 method7638(@OriginalArg(0) Interface25 arg0, @OriginalArg(1) Interface8 arg1) {
		return new wa(this, (j) arg0, (xa) arg1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lclient!vj;)V")
	@Override
	public void method7694(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub16[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static444.anIntArray411[local1++] = arg1[local3].method6323();
			Static444.anIntArray411[local1++] = arg1[local3].method6322();
			Static444.anIntArray411[local1++] = arg1[local3].method6320();
			Static444.anIntArray411[local1++] = arg1[local3].method6324();
			Static444.aFloatArray75[local3] = arg1[local3].method6326();
			Static444.anIntArray411[local1++] = arg1[local3].method6325();
		}
		this.N(arg0, Static444.anIntArray411, Static444.aFloatArray75);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lclient!vj;")
	@Override
	public Class3_Sub16 method7703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub16_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lclient!bka;")
	@Override
	public Class9 method7664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new j(this, arg0, arg1, arg2, arg3, !arg4);
	}

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "()I")
	@Override
	public int method7634() {
		return 4;
	}

	@OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
	public native int[] Y();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7649(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6978(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "()V")
	@Override
	protected void method7632() {
		if (this.aBoolean585) {
			return;
		}
		this.anAArray1 = null;
		this.aP1 = null;
		this.aYa2 = null;
		this.aClass181_9 = null;
		this.aClass136_33.method3505();
		for (@Pc(26) ya local26 = (ya) this.aClass357_45.method8391(); local26 != null; local26 = (ya) this.aClass357_45.method8392()) {
			local26.ga();
		}
		this.aClass357_45.method8403();
		this.FA();
		if (this.aBoolean586) {
			Static246.method3750(false, true);
			this.aBoolean586 = false;
		}
		this.method6529();
		Static253.method3958();
		this.aBoolean585 = true;
	}

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "()Lclient!a;")
	public a method6531() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7703; local1++) {
			if (this.anAArray1[local1].aRunnable1 == Thread.currentThread()) {
				return this.anAArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z")
	@Override
	public boolean method7654() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
	public native void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
	public native void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lclient!bka;")
	@Override
	public Class9 method7670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new j(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
	private native void N(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
	public native void GA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)I")
	@Override
	public int method7660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILclient!aa;II)V")
	public native void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lclient!za;)V")
	private native void va(@OriginalArg(0) Class3_Sub17 arg0);
}
