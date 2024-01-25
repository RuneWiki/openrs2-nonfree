import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class l extends Class12 implements Interface19 {

	@OriginalMember(owner = "client!l", name = "y", descriptor = "Lclient!m;")
	private m aM1;

	@OriginalMember(owner = "client!l", name = "B", descriptor = "Lclient!q;")
	private Class209 aClass209_3;

	@OriginalMember(owner = "client!l", name = "G", descriptor = "Lclient!ta;")
	private ta aTa1;

	@OriginalMember(owner = "client!l", name = "L", descriptor = "I")
	public int anInt5311;

	@OriginalMember(owner = "client!l", name = "M", descriptor = "[Lclient!qa;")
	private qa[] aQaArray1;

	@OriginalMember(owner = "client!l", name = "r", descriptor = "Z")
	private boolean aBoolean401 = false;

	@OriginalMember(owner = "client!l", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!l", name = "t", descriptor = "Lclient!wo;")
	private final Class361 aClass361_58 = new Class361();

	@OriginalMember(owner = "client!l", name = "H", descriptor = "I")
	private final int anInt5310 = 4096;

	@OriginalMember(owner = "client!l", name = "F", descriptor = "I")
	private final int anInt5309 = 4096;

	@OriginalMember(owner = "client!l", name = "E", descriptor = "Lclient!wh;")
	private final Class356 aClass356_24 = new Class356(4);

	@OriginalMember(owner = "client!l", name = "K", descriptor = "Z")
	private boolean aBoolean402 = false;

	@OriginalMember(owner = "client!l", name = "D", descriptor = "Lclient!q;")
	private Class209 aClass209_4;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;)V")
	public l(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface5 arg1) {
		super(arg1);
		try {
			if (!Static293.method4616("sw3d")) {
				throw new RuntimeException("");
			}
			Static223.method3675();
			this.OA(super.anInterface5_10, 0, 0);
			Static113.method1979(true, false);
			this.aBoolean402 = true;
			this.aClass209_4 = new ra();
			this.method6471(new ra());
			this.method6399(1);
			this.method6428(0);
			if (arg0 != null) {
				this.method6437(arg0);
				this.method6405(arg0);
			}
		} catch (@Pc(78) Throwable local78) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class17 method6452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new s(this, this.aM1, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	@Override
	public void method6399(@OriginalArg(0) int arg0) {
		this.anInt5311 = arg0;
		this.aQaArray1 = new qa[this.anInt5311];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5311; local9++) {
			this.aQaArray1[local9] = new qa(this, this.anInt5309, this.anInt5310);
		}
	}

	@OriginalMember(owner = "client!l", name = "Q", descriptor = "(IIIIIILclient!ua;II)V")
	private native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class200 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class10 method6420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new t(this, this.aM1, arg0, arg1);
	}

	@OriginalMember(owner = "client!l", name = "ra", descriptor = "(F)V")
	public native void ra(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!l", name = "da", descriptor = "(IIII)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "w", descriptor = "(IIIIII)V")
	private native void w(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "JA", descriptor = "()V")
	public native void JA();

	@OriginalMember(owner = "client!l", name = "AA", descriptor = "(III[I)V")
	public native void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4536().G(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!l", name = "EA", descriptor = "(Lclient!e;)V")
	private native void EA(@OriginalArg(0) Class1_Sub11 arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!it;)V")
	@Override
	public void method6421(@OriginalArg(0) Class36 arg0) {
	}

	@OriginalMember(owner = "client!l", name = "va", descriptor = "(I)V")
	public native void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "q", descriptor = "()V")
	@Override
	public void method6440() {
	}

	@OriginalMember(owner = "client!l", name = "WA", descriptor = "()V")
	private void method4534() {
		System.gc();
		System.runFinalization();
		Static223.method3677();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6395(@OriginalArg(0) Canvas arg0) {
		@Pc(8) ta local8 = (ta) this.aClass356_24.method7796((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.AA(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aTa1.aCanvas12) {
			this.method6405(arg0);
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(II)I")
	@Override
	public int method6467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!l", name = "BA", descriptor = "()I")
	public native int BA();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method6448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class200 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.Q(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6400(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aTa1 == null) {
			throw new IllegalStateException("off");
		}
		this.aTa1.method6946(arg0, arg1);
	}

	@OriginalMember(owner = "client!l", name = "oa", descriptor = "([I)V")
	public native void oa(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
	@Override
	public void method6398(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!l", name = "ia", descriptor = "(Lclient!ta;)V")
	private native void ia(@OriginalArg(0) ta arg0);

	@OriginalMember(owner = "client!l", name = "VA", descriptor = "(IFFFFF)V")
	public native void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!l", name = "m", descriptor = "()V")
	@Override
	public void method6425() {
	}

	@OriginalMember(owner = "client!l", name = "T", descriptor = "()I")
	public native int T();

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
	@Override
	public void method6424(@OriginalArg(0) int arg0) {
		Static223.method3677();
		this.qa(arg0);
		for (@Pc(10) m local10 = (m) this.aClass361_58.method7854(); local10 != null; local10 = (m) this.aClass361_58.method7853()) {
			local10.Z();
		}
	}

	@OriginalMember(owner = "client!l", name = "YA", descriptor = "(IIII)V")
	public native void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "C", descriptor = "()Z")
	@Override
	public boolean method6474() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "IA", descriptor = "(IIIIII[BII)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!l", name = "fa", descriptor = "()Ljava/lang/Object;")
	private Object method4535() {
		return new h(this);
	}

	@OriginalMember(owner = "client!l", name = "h", descriptor = "(IIII)[I")
	public native int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "s", descriptor = "()Z")
	@Override
	public boolean method6442() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6433() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!l", name = "u", descriptor = "()Z")
	@Override
	public boolean method6455() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "CA", descriptor = "(IIII)V")
	public native void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "pa", descriptor = "(III)V")
	public native void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!l", name = "d", descriptor = "()Z")
	@Override
	public boolean method6408() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "()Lclient!q;")
	@Override
	public Class209 method6410() {
		return new ra();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class10 method6470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new t(this, this.aM1, arg0, arg1, arg2, arg3) : new va(this, this.aM1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!l", name = "V", descriptor = "(IIII)V")
	public native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(I)Lclient!e;")
	@Override
	public Class1_Sub11 method6403(@OriginalArg(0) int arg0) {
		@Pc(5) m local5 = new m(this, arg0);
		this.aClass361_58.method7855(local5);
		return local5;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6446(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I")
	@Override
	public int method6445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V")
	@Override
	public void method6428(@OriginalArg(0) int arg0) {
		this.aQaArray1[arg0].method5870();
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
	@Override
	public void method6401(@OriginalArg(0) int arg0) {
		this.aQaArray1[arg0].method5871();
	}

	@OriginalMember(owner = "client!l", name = "O", descriptor = "(IIIIII)Z")
	public native boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "B", descriptor = "()Z")
	@Override
	public boolean method6473() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "I", descriptor = "(I[I[F)V")
	private native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!l", name = "D", descriptor = "()Lclient!qa;")
	public qa method4536() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5311; local1++) {
			if (this.aQaArray1[local1].aRunnable2 == Thread.currentThread()) {
				return this.aQaArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "()Z")
	@Override
	public boolean method6397() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "la", descriptor = "(IIII)V")
	public native void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!cca;IIII)Lclient!da;")
	@Override
	public Class61 method6407(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new v(this, this.aM1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!l", name = "GA", descriptor = "(II)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!l", name = "ZA", descriptor = "(Z)V")
	public native void ZA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!l", name = "z", descriptor = "()V")
	@Override
	public void method6469() {
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V")
	@Override
	public void method6461(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!l", name = "y", descriptor = "()Z")
	@Override
	public boolean method6463() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "FA", descriptor = "(ILclient!ua;II)V")
	public native void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class200 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ec;)V")
	@Override
	public void method6460(@OriginalArg(0) Class82 arg0) {
		this.method4538(arg0);
		this.method4536().HA(this, Static286.anIntArray325, Static286.anIntArray320, Static286.anIntArray322, Static286.aShortArray67, arg0.aClass127_1.method2718());
	}

	@OriginalMember(owner = "client!l", name = "R", descriptor = "()V")
	private native void R();

	@OriginalMember(owner = "client!l", name = "t", descriptor = "()Z")
	@Override
	public boolean method6451() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "i", descriptor = "()Z")
	@Override
	public boolean method6415() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method6465();
		if (this.nativeid != 0L) {
			Static223.method3676(this);
		}
	}

	@OriginalMember(owner = "client!l", name = "p", descriptor = "()Z")
	@Override
	public boolean method6439() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method6468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.w(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(IIIII)V")
	protected native void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "A", descriptor = "(S)Z")
	private boolean method4537(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class45 local9 = super.anInterface5_10.method4043(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.Z(arg0, local9.aByte22, local9.aByte28, local9.aBoolean119, local9.aBoolean118, local9.aBoolean123, local9.aByte26, local9.aByte24, local9.aByte25, local9.aShort19, local9.anInt1535, local9.aBoolean122, local9.aBoolean125);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "qa", descriptor = "(I)V")
	private native void qa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "NA", descriptor = "(Lclient!q;)V")
	private native void NA(@OriginalArg(0) Class209 arg0);

	@OriginalMember(owner = "client!l", name = "f", descriptor = "()Z")
	@Override
	public boolean method6411() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method6412(@OriginalArg(0) Class10 arg0) {
		if (arg0 instanceof va) {
			this.q((va) arg0);
		} else if (arg0 instanceof t) {
			this.ma((t) arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!l", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V")
	@Override
	public void method6454(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!l", name = "v", descriptor = "()[I")
	public native int[] v();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I[Lclient!qea;)V")
	@Override
	public void method6402(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static286.anIntArray323[local1++] = arg1[local3].method4159();
			Static286.anIntArray323[local1++] = arg1[local3].method4163();
			Static286.anIntArray323[local1++] = arg1[local3].method4158();
			Static286.anIntArray323[local1++] = arg1[local3].method4162();
			Static286.aFloatArray41[local3] = arg1[local3].method4160();
			Static286.anIntArray323[local1++] = arg1[local3].method4165();
		}
		this.I(arg0, Static286.anIntArray323, Static286.aFloatArray41);
	}

	@OriginalMember(owner = "client!l", name = "n", descriptor = "()Z")
	@Override
	public boolean method6431() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "J", descriptor = "(IIIIII)V")
	public native void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "o", descriptor = "()V")
	@Override
	public void method6436() {
	}

	@OriginalMember(owner = "client!l", name = "OA", descriptor = "(Lclient!fa;II)V")
	private native void OA(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ec;Z)V")
	private void method4538(@OriginalArg(0) Class82 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class20_Sub1_Sub1 local15 = (Class20_Sub1_Sub1) arg0.aClass127_1.method2713(); local15 != null; local15 = (Class20_Sub1_Sub1) arg0.aClass127_1.method2716()) {
			Static286.anIntArray325[local1++] = local15.anInt6325;
			Static286.anIntArray325[local1++] = local15.anInt6324;
			Static286.anIntArray325[local1++] = local15.anInt6329;
			Static286.anIntArray320[local3++] = local15.anInt6327;
			Static286.aShortArray67[local7++] = (short) local15.anInt6322;
			Static286.anIntArray322[local5++] = local15.anInt6323;
		}
	}

	@OriginalMember(owner = "client!l", name = "w", descriptor = "()Z")
	@Override
	public boolean method6459() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "MA", descriptor = "(III[I)V")
	public native void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!l", name = "DA", descriptor = "()I")
	public native int DA();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ec;I)V")
	@Override
	public void method6404(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1) {
		this.method4538(arg0);
		this.method4536().HA(this, Static286.anIntArray325, Static286.anIntArray320, Static286.anIntArray322, Static286.aShortArray67, arg0.aClass127_1.method2718());
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method6435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.XA(arg0, arg1, arg2, arg4, arg5);
		this.XA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.m(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.m(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class10 method6429(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method6471(@OriginalArg(0) Class209 arg0) {
		this.aClass209_3 = arg0;
		this.NA(arg0);
	}

	@OriginalMember(owner = "client!l", name = "Z", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void Z(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!l", name = "A", descriptor = "()V")
	@Override
	public void method6472() {
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6396(@OriginalArg(0) Canvas arg0) {
		if (this.aTa1.aCanvas12 == arg0) {
			this.method6405(null);
		}
		@Pc(16) ta local16 = (ta) this.aClass356_24.method7796((long) arg0.hashCode());
		if (local16 != null) {
			local16.method7878();
			local16.method6949();
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([I)V")
	@Override
	public void method6430(@OriginalArg(0) int[] arg0) {
		@Pc(4) Dimension local4 = this.aTa1.aCanvas12.getSize();
		arg0[0] = local4.width;
		arg0[1] = local4.height;
	}

	@OriginalMember(owner = "client!l", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class200 method6449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new za(this, this.aM1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method6422(@OriginalArg(0) Class1_Sub11 arg0) {
		this.aM1 = (m) arg0;
		this.EA(arg0);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!aga;[Lclient!tq;Z)Lclient!la;")
	@Override
	public Class35 method6457(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class318[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt8537;
			local7[local11] = arg1[local11].anInt8535;
			if (arg1[local11].aByteArray93 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new c(this, this.aM1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!l", name = "W", descriptor = "(S)Z")
	private boolean method4539(@OriginalArg(0) short arg0) {
		@Pc(2) Interface5 local2 = super.anInterface5_10;
		synchronized (super.anInterface5_10) {
			if (!super.anInterface5_10.method4045(arg0)) {
				return false;
			}
			@Pc(22) Class45 local22 = super.anInterface5_10.method4043(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(43) int[] local43;
			if (local22.aBoolean121) {
				local43 = super.anInterface5_10.method4047(128, 128, 0.7F, arg0);
			} else {
				local43 = super.anInterface5_10.method4048(arg0, 128, true, 0.7F, 128);
			}
			this.xa(arg0, local22.aByte22, local22.aByte28, local22.aBoolean119, local22.aBoolean118, local22.aBoolean123, local22.aByte26, local22.aByte24, local22.aByte25, local22.aShort19, local22.anInt1535, local22.aBoolean122, local22.aBoolean125, local43);
			return true;
		}
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6437(@OriginalArg(0) Canvas arg0) {
		@Pc(8) ta local8 = (ta) this.aClass356_24.method7796((long) arg0.hashCode());
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
		this.aClass356_24.method7800((long) arg0.hashCode(), local8);
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "()I")
	@Override
	public int method6406() {
		return 4;
	}

	@OriginalMember(owner = "client!l", name = "xa", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void xa(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!l", name = "g", descriptor = "()Z")
	@Override
	public boolean method6413() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "k", descriptor = "()Lclient!q;")
	@Override
	public Class209 method6417() {
		return this.aClass209_3;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "()I")
	public native int b();

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(IIIIII)Lclient!it;")
	@Override
	public Class36 method6444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!tq;Z)Lclient!f;")
	@Override
	public Class10 method6434(@OriginalArg(0) Class318 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray587;
		@Pc(5) byte[] local5 = arg0.aByteArray94;
		@Pc(8) int local8 = arg0.anInt8537;
		@Pc(11) int local11 = arg0.anInt8535;
		@Pc(32) Class10 local32;
		if (arg1 && arg0.aByteArray93 == null) {
			local32 = new w(this, this.aM1, local2, local5, 0, arg0.anInt8537, arg0.anInt8537, arg0.anInt8535);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray93;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray587[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new t(this, this.aM1, local40, 0, arg0.anInt8537, arg0.anInt8537, arg0.anInt8535);
				} else {
					local32 = new va(this, this.aM1, local40, 0, arg0.anInt8537, arg0.anInt8537, arg0.anInt8535);
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
		local32.Q(arg0.anInt8533, arg0.anInt8534, arg0.anInt8536, arg0.anInt8538);
		return local32;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!l", name = "l", descriptor = "()Lclient!aa;")
	@Override
	public Class2 method6419() {
		return new Class2(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!l", name = "h", descriptor = "()V")
	@Override
	protected void method6414() {
		if (this.aBoolean401) {
			return;
		}
		this.aQaArray1 = null;
		this.aTa1 = null;
		this.aM1 = null;
		this.aClass209_4 = null;
		this.aClass356_24.method7802();
		for (@Pc(25) m local25 = (m) this.aClass361_58.method7854(); local25 != null; local25 = (m) this.aClass361_58.method7853()) {
			local25.D();
		}
		this.aClass361_58.method7860();
		this.R();
		if (this.aBoolean402) {
			Static425.method5943(false, true);
			this.aBoolean402 = false;
		}
		this.method4534();
		Static223.method3674();
		this.aBoolean401 = true;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6405(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aTa1 = null;
			this.ia(null);
		} else {
			@Pc(10) ta local10 = (ta) this.aClass356_24.method7796((long) arg0.hashCode());
			this.aTa1 = local10;
			this.ia(local10);
		}
	}

	@OriginalMember(owner = "client!l", name = "XA", descriptor = "(IIIII)V")
	public native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "ma", descriptor = "(Lclient!t;)V")
	private native void ma(@OriginalArg(0) t arg0);

	@OriginalMember(owner = "client!l", name = "ja", descriptor = "(I)V")
	public native void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!l", name = "L", descriptor = "()V")
	public native void L();

	@OriginalMember(owner = "client!l", name = "m", descriptor = "(IIIII)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "x", descriptor = "()V")
	@Override
	public void method6462() {
		this.method6405(this.aTa1.aCanvas12);
	}

	@OriginalMember(owner = "client!l", name = "j", descriptor = "()V")
	@Override
	public void method6416() throws Exception_Sub1 {
		if (this.aTa1 == null) {
			throw new IllegalStateException("off");
		}
		this.aTa1.method6947();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIF)Lclient!qea;")
	@Override
	public Class1_Sub5 method6426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub5_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "r", descriptor = "()Lclient!q;")
	@Override
	public Class209 method6441() {
		return this.aClass209_4;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!it;Lclient!it;FLclient!it;)Lclient!it;")
	@Override
	public Class36 method6464(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class36 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!l", name = "q", descriptor = "(Lclient!va;)V")
	private native void q(@OriginalArg(0) va arg0);
}
