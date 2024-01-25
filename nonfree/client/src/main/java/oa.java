import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class oa extends Class65 implements Interface7 {

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "Lclient!ya;")
	private ya aYa2;

	@OriginalMember(owner = "client!oa", name = "J", descriptor = "Lclient!oha;")
	private Class254 aClass254_5;

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "Lclient!p;")
	private p aP1;

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "I")
	public int anInt7290;

	@OriginalMember(owner = "client!oa", name = "R", descriptor = "[Lclient!a;")
	private a[] anAArray1;

	@OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
	public final long nativeid = 0L;

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "Z")
	private boolean aBoolean628 = false;

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "Lclient!fca;")
	private final Class114 aClass114_48 = new Class114();

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
	private int anInt7289 = 4096;

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "I")
	private int anInt7288 = 4096;

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "Lclient!rda;")
	private final Class300 aClass300_32 = new Class300(4);

	@OriginalMember(owner = "client!oa", name = "S", descriptor = "Z")
	private boolean aBoolean629 = false;

	@OriginalMember(owner = "client!oa", name = "O", descriptor = "Lclient!oha;")
	private Class254 aClass254_6;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public oa(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg1);
		try {
			if (!Static278.method4508("sw3d")) {
				throw new RuntimeException("");
			}
			Static539.method7537();
			this.MA(super.anInterface4_11, 0, 0);
			Static238.method3722(true, false);
			this.aBoolean629 = true;
			this.aClass254_6 = new ja();
			this.method6891(new ja());
			this.method6931(1);
			this.method6956(0);
			if (arg0 != null) {
				this.method6928(arg0, arg2, arg3);
				this.method6946(arg0);
			}
		} catch (@Pc(80) Throwable local80) {
			this.method6923();
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method6923();
		if (this.nativeid != 0L) {
			Static539.method7536(this);
		}
	}

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
	public native void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "()Lclient!oha;")
	@Override
	public Class254 method6955() {
		return new ja();
	}

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
	@Override
	public boolean method6953() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILclient!aa;II)V")
	private native void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "()Lclient!oha;")
	@Override
	public Class254 method6890() {
		return this.aClass254_5;
	}

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lclient!za;)V")
	private native void va(@OriginalArg(0) Class5_Sub14 arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()Lclient!fga;")
	@Override
	public Class118 method6878() {
		return new Class118(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z")
	@Override
	public boolean method6930() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6946(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aP1 = null;
			this.t((p) null);
		} else {
			@Pc(10) p local10 = (p) this.aClass300_32.method7188((long) arg0.hashCode());
			this.aP1 = local10;
			this.t(local10);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!oha;)V")
	@Override
	public void method6891(@OriginalArg(0) Class254 arg0) {
		this.aClass254_5 = arg0;
		this.ma(((ja) arg0).nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method6915() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
	@Override
	public void method6945(@OriginalArg(0) int[] arg0) {
		@Pc(4) Dimension local4 = this.aP1.aCanvas12.getSize();
		arg0[0] = local4.width;
		arg0[1] = local4.height;
	}

	@OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!su;IIII)Lclient!ka;")
	@Override
	public Class153 method6964(@OriginalArg(0) Class329 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new i(this, this.aYa2, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)Lclient!tea;")
	@Override
	public Class57 method6893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
	public native int i();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6928(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass300_32.method7188((long) arg0.hashCode());
		if (local8 == null) {
			try {
				@Pc(13) Class local13 = Class.forName("java.awt.Canvas");
				@Pc(23) Method local23 = local13.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local23.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(35) Exception local35) {
			}
			local8 = new p(this, arg0, arg1, arg2);
			this.aClass300_32.method7191(local8, (long) arg0.hashCode());
		} else if (local8.anInt7541 != arg1 || local8.anInt7542 != arg2) {
			local8.method6371(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
	private native void n(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
	private boolean method6111(@OriginalArg(0) short arg0) {
		@Pc(2) Interface4 local2 = super.anInterface4_11;
		synchronized (super.anInterface4_11) {
			if (!super.anInterface4_11.method359(arg0)) {
				return false;
			}
			@Pc(22) Class136 local22 = super.anInterface4_11.method358(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(44) int[] local44;
			if (local22.anInt3869 == 2) {
				local44 = super.anInterface4_11.method360(128, 128, arg0, 0.7F);
			} else {
				local44 = super.anInterface4_11.method363(arg0, 128, 0.7F, true, 128);
			}
			this.CA(arg0, local44, local22.aShort36, local22.anInt3869, local22.aByte56, local22.aByte57, local22.anInt3864, local22.aBoolean312, local22.aByte55, local22.aByte51, local22.aByte52, local22.aByte53, local22.aBoolean315, local22.aBoolean311, local22.aBoolean313, local22.aBoolean308, local22.aBoolean309, local22.aByte54, local22.aBoolean310, local22.aBoolean314, local22.anInt3868);
			return true;
		}
	}

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
	public native void C(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
	@Override
	public void method6913() {
		this.anInt7288 = this.anInt7289 = 10000;
		if (this.anInt7290 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method6931(this.anInt7290);
		this.method6956(0);
	}

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "()V")
	@Override
	public void method6909() {
	}

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "()V")
	@Override
	protected void method6904() {
		if (this.aBoolean628) {
			return;
		}
		this.anAArray1 = null;
		this.aP1 = null;
		this.aYa2 = null;
		this.aClass254_6 = null;
		this.aClass300_32.method7189();
		for (@Pc(25) ya local25 = (ya) this.aClass114_48.method2805(); local25 != null; local25 = (ya) this.aClass114_48.method2814()) {
			local25.ga();
		}
		this.aClass114_48.method2808();
		this.FA();
		if (this.aBoolean629) {
			Static358.method5409(true, false);
			this.aBoolean629 = false;
		}
		this.method6112();
		Static539.method7538();
		this.aBoolean628 = true;
	}

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
	private native void N(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
	public native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILclient!aa;II)V")
	public native void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "()V")
	@Override
	public void method6963() {
	}

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
	public native void K(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "()V")
	@Override
	public void method6961() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method6960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.Z(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
	@Override
	public void method6931(@OriginalArg(0) int arg0) {
		this.anInt7290 = arg0;
		this.anAArray1 = new a[this.anInt7290];
		for (@Pc(9) int local9 = 0; local9 < this.anInt7290; local9++) {
			this.anAArray1[local9] = new a(this, this.anInt7288, this.anInt7289);
		}
	}

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z")
	@Override
	public boolean method6927() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	private native void d(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
	public native void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!vi;Z)Lclient!pu;")
	@Override
	public Class50 method6898(@OriginalArg(0) Class369 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) j local17 = new j(this, arg0.anIntArray561, arg0.aByteArray104, arg0.aByteArray103, 0, arg0.anInt10309, arg0.anInt10309, arg0.anInt10307);
		local17.method5986(arg0.anInt10308, arg0.anInt10306, arg0.anInt10311, arg0.anInt10310);
		return local17;
	}

	@OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
	public native void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!wq;)V")
	@Override
	public void method6899(@OriginalArg(0) Class392 arg0) {
		if (arg0.aClass307_1.method7415() != 0) {
			this.method6116(arg0);
			this.method6114().method11(this, Static410.anIntArray416, Static410.anIntArray412, Static410.anIntArray413, Static410.aShortArray84, arg0.aClass307_1.method7415());
		}
	}

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
	public native void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6888(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "()Lclient!oha;")
	@Override
	public Class254 method6903() {
		return this.aClass254_6;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!od;Lclient!ic;)Lclient!md;")
	@Override
	public Interface15 method6942(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) Interface9 arg1) {
		return new wa(this, (j) arg0, (xa) arg1);
	}

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "()V")
	@Override
	public void method6940() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class109 method6937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new t(this, this.aYa2, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
	public native int I();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6114().method4(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
	public native int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "(I)V")
	@Override
	public void method6958(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method12();
	}

	@OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
	public native void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
	public native void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lclient!gu;")
	@Override
	public Class5_Sub18 method6919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class5_Sub18_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
	private native void AA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) byte arg16, @OriginalArg(17) boolean arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) int arg19);

	@OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
	public native void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6912(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6372(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z")
	@Override
	public boolean method6896() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method6922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method6921(@OriginalArg(0) Class5_Sub14 arg0) {
		this.aYa2 = (ya) arg0;
		this.va(arg0);
	}

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
	@Override
	public boolean method6929() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
	private void method6112() {
		System.gc();
		System.runFinalization();
		Static539.method7539();
	}

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
	private native void FA();

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)Lclient!za;")
	@Override
	public Class5_Sub14 method6954(@OriginalArg(0) int arg0) {
		@Pc(5) ya local5 = new ya(this, arg0);
		this.aClass114_48.method2807(local5);
		return local5;
	}

	@OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
	public native int XA();

	@OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
	public native void xa(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z")
	@Override
	public boolean method6884() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z")
	@Override
	public boolean method6883() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
	private native void ma(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	@Override
	public void method6911(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
	private native void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
	protected native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z")
	@Override
	public boolean method6908() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
	private Object method6113() {
		return new ba(this);
	}

	@OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
	private native void CA(@OriginalArg(0) short arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) boolean arg16, @OriginalArg(17) byte arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) boolean arg19, @OriginalArg(20) int arg20);

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "()Lclient!a;")
	public a method6114() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7290; local1++) {
			if (this.anAArray1[local1].aRunnable1 == Thread.currentThread()) {
				return this.anAArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ne;[Lclient!vi;Z)Lclient!da;")
	@Override
	public Class73 method6886(@OriginalArg(0) Class247 arg0, @OriginalArg(1) Class369[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt10309;
			local7[local11] = arg1[local11].anInt10307;
			if (arg1[local11].aByteArray103 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new h(this, this.aYa2, arg0, arg1, (Class50[]) null);
	}

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "()Z")
	@Override
	public boolean method6947() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6950(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass300_32.method7188((long) arg0.hashCode());
		local8.method6371(arg0, arg1, arg2);
		if (arg0 != null && arg0 == this.aP1.aCanvas12) {
			this.method6946(arg0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6941(@OriginalArg(0) Canvas arg0) {
		if (this.aP1.aCanvas12 == arg0) {
			this.method6946((Canvas) null);
		}
		@Pc(16) p local16 = (p) this.aClass300_32.method7188((long) arg0.hashCode());
		if (local16 != null) {
			local16.method9052();
			local16.method6370();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!md;)V")
	@Override
	public void method6877(@OriginalArg(0) Interface15 arg0) {
		@Pc(2) wa local2 = (wa) arg0;
		this.n(local2.aJ1.nativeid, local2.aXa1.nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	@Override
	public void method6914(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method6932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.wa(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method6957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new na(this, this.aYa2, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!tea;)V")
	@Override
	public void method6905(@OriginalArg(0) Class57 arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)Lclient!ic;")
	@Override
	public Interface9 method6939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new xa(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lclient!gu;)V")
	@Override
	public void method6926(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub18[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static410.anIntArray411[local1++] = arg1[local3].method8055();
			Static410.anIntArray411[local1++] = arg1[local3].method8051();
			Static410.anIntArray411[local1++] = arg1[local3].method8057();
			Static410.anIntArray411[local1++] = arg1[local3].method8056();
			Static410.aFloatArray70[local3] = arg1[local3].method8054();
			Static410.anIntArray411[local1++] = arg1[local3].method8058();
		}
		this.N(arg0, Static410.anIntArray411, Static410.aFloatArray70);
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z")
	@Override
	public boolean method6887() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
	@Override
	public int method6882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)Lclient!od;")
	@Override
	public Interface19 method6894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method6907(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
	public native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
	public native void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
	public native int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
	public native int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!wq;I)V")
	@Override
	public void method6897(@OriginalArg(0) Class392 arg0, @OriginalArg(1) int arg1) {
		this.method6116(arg0);
		this.method6114().method11(this, Static410.anIntArray416, Static410.anIntArray412, Static410.anIntArray413, Static410.aShortArray84, arg0.aClass307_1.method7415());
	}

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
	public native int E();

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "()Z")
	@Override
	public boolean method6934() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "(I)V")
	@Override
	public void method6956(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method14();
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I")
	@Override
	public int method6885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
	public native int[] Y();

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z")
	@Override
	public boolean method6889() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
	@Override
	public void method6918(@OriginalArg(0) int arg0) {
		Static539.method7539();
		this.d(arg0);
		for (@Pc(10) ya local10 = (ya) this.aClass114_48.method2805(); local10 != null; local10 = (ya) this.aClass114_48.method2814()) {
			local10.r();
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method6895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!tea;Lclient!tea;FLclient!tea;)Lclient!tea;")
	@Override
	public Class57 method6949(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class57 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
	public native void la();

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
	private boolean method6115(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class136 local9 = super.anInterface4_11.method358(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.AA(arg0, local9.aShort36, local9.anInt3869, local9.aByte56, local9.aByte57, local9.anInt3864, local9.aBoolean312, local9.aByte55, local9.aByte51, local9.aByte52, local9.aByte53, local9.aBoolean315, local9.aBoolean311, local9.aBoolean313, local9.aBoolean308, local9.aBoolean309, local9.aByte54, local9.aBoolean310, local9.aBoolean314, local9.anInt3868);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "()V")
	@Override
	public void method6910() {
	}

	@OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
	public native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lclient!p;)V")
	private native void t(@OriginalArg(0) p arg0);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lclient!pu;")
	@Override
	public Class50 method6936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new j(this, arg0, arg1, arg2, arg3, !arg4);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lclient!pu;")
	@Override
	public Class50 method6907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new j(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "()V")
	@Override
	public void method6959() {
		this.method6946(this.aP1.aCanvas12);
	}

	@OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
	public native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!wq;Z)V")
	private void method6116(@OriginalArg(0) Class392 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class28_Sub3_Sub1 local15 = (Class28_Sub3_Sub1) arg0.aClass307_1.method7416(); local15 != null; local15 = (Class28_Sub3_Sub1) arg0.aClass307_1.method7410()) {
			Static410.anIntArray416[local1++] = local15.anInt5581;
			Static410.anIntArray416[local1++] = local15.anInt5584;
			Static410.anIntArray416[local1++] = local15.anInt5579;
			Static410.anIntArray412[local3++] = local15.anInt5585;
			Static410.aShortArray84[local7++] = (short) local15.anInt5580;
			Static410.anIntArray413[local5++] = local15.anInt5586;
		}
	}

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
	public native void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
	public native void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Lclient!d;II)V")
	private native void MA(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)V")
	@Override
	public void method6916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6373(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lclient!pu;")
	@Override
	public Class50 method6933(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new j(this, arg0, 0, arg1, arg2, arg3, false);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
	@Override
	public void method6944(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "()I")
	@Override
	public int method6892() {
		return 4;
	}

	@OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
	public native void GA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "()Z")
	@Override
	public boolean method6917() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method6935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}
}
