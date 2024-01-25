import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class oa extends Class13 implements Interface3 {

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "Lclient!ya;")
	private ya aYa2;

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "Lclient!pda;")
	private Class51 aClass51_7;

	@OriginalMember(owner = "client!oa", name = "J", descriptor = "Lclient!p;")
	private p aP1;

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "[Lclient!a;")
	private a[] anAArray1;

	@OriginalMember(owner = "client!oa", name = "O", descriptor = "I")
	public int anInt6834;

	@OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
	public final long nativeid = 0L;

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "Z")
	private boolean aBoolean481 = false;

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "Lclient!fh;")
	private final Class114 aClass114_34 = new Class114();

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
	private int anInt6832 = 4096;

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "I")
	private int anInt6833 = 4096;

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "Lclient!tba;")
	private final Class323 aClass323_24 = new Class323(4);

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "Z")
	private boolean aBoolean482 = false;

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "Lclient!pda;")
	private Class51 aClass51_8;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public oa(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg1);
		try {
			if (!Static354.method5314("sw3d")) {
				throw new RuntimeException("");
			}
			Static8.method103();
			this.MA(super.anInterface2_12, 0, 0);
			Static187.method3201(true, false);
			this.aBoolean482 = true;
			this.aClass51_8 = new ja();
			this.method8138(new ja());
			this.method8099(1);
			this.method8139(0);
			if (arg0 != null) {
				this.method8146(arg0, arg2, arg3);
				this.method8124(arg0);
			}
		} catch (@Pc(80) Throwable local80) {
			this.method8117();
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
	public native void GA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "()V")
	@Override
	public void method8150() {
	}

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "()Lclient!a;")
	public a method5941() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt6834; local1++) {
			if (this.anAArray1[local1].aRunnable1 == Thread.currentThread()) {
				return this.anAArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
	public native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)I")
	@Override
	public int method8163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()V")
	@Override
	protected void method8103() {
		if (this.aBoolean481) {
			return;
		}
		this.anAArray1 = null;
		this.aP1 = null;
		this.aYa2 = null;
		this.aClass51_8 = null;
		this.aClass323_24.method7485();
		for (@Pc(25) ya local25 = (ya) this.aClass114_34.method2772(); local25 != null; local25 = (ya) this.aClass114_34.method2762()) {
			local25.ga();
		}
		this.aClass114_34.method2768();
		this.FA();
		if (this.aBoolean482) {
			Static21.method563(false, true);
			this.aBoolean482 = false;
		}
		this.method5943();
		Static8.method106();
		this.aBoolean481 = true;
	}

	@OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
	private native void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method8096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.Z(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
	private boolean method5942(@OriginalArg(0) short arg0) {
		@Pc(2) Interface2 local2 = super.anInterface2_12;
		synchronized (super.anInterface2_12) {
			if (!super.anInterface2_12.method6026(arg0)) {
				return false;
			}
			@Pc(22) Class271 local22 = super.anInterface2_12.method6027(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(44) int[] local44;
			if (local22.anInt7162 == 2) {
				local44 = super.anInterface2_12.method6023(128, 0.7F, arg0, 128);
			} else {
				local44 = super.anInterface2_12.method6024(128, arg0, true, 128, 0.7F);
			}
			this.CA(arg0, local44, local22.aShort94, local22.anInt7162, local22.aByte94, local22.aByte97, local22.anInt7159, local22.aBoolean516, local22.aByte92, local22.aByte91, local22.aByte93, local22.aByte95, local22.aBoolean514, local22.aBoolean515, local22.aBoolean512, local22.aBoolean513, local22.aBoolean510, local22.aByte96, local22.aBoolean511, local22.aBoolean509, local22.anInt7163);
			return true;
		}
	}

	@OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
	public native int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lclient!iea;")
	@Override
	public Class31 method8157(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new j(this, arg0, 0, arg1, arg2, arg3, false);
	}

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
	public native void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
	public native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
	private native void CA(@OriginalArg(0) short arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) boolean arg16, @OriginalArg(17) byte arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) boolean arg19, @OriginalArg(20) int arg20);

	@OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
	public native void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method8117();
		if (this.nativeid != 0L) {
			Static8.method107(this);
		}
	}

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILclient!aa;II)V")
	public native void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
	private native void n(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
	public native int XA();

	@OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
	public native void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class91 method8160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new t(this, this.aYa2, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
	private native void ma(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8131(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass323_24.method7484((long) arg0.hashCode());
		local8.method6175(arg0, arg1, arg2);
		if (arg0 != null && arg0 == this.aP1.aCanvas8) {
			this.method8124(arg0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
	public native int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	@Override
	public void method8086(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method7();
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
	@Override
	public void method8105() {
		this.anInt6832 = this.anInt6833 = 10000;
		if (this.anInt6834 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method8099(this.anInt6834);
		this.method8139(0);
	}

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "()V")
	@Override
	public void method8166() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lclient!laa;)V")
	@Override
	public void method8102(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub12[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static396.anIntArray455[local1++] = arg1[local3].method7415();
			Static396.anIntArray455[local1++] = arg1[local3].method7420();
			Static396.anIntArray455[local1++] = arg1[local3].method7421();
			Static396.anIntArray455[local1++] = arg1[local3].method7418();
			Static396.aFloatArray56[local3] = arg1[local3].method7422();
			Static396.anIntArray455[local1++] = arg1[local3].method7417();
		}
		this.N(arg0, Static396.anIntArray455, Static396.aFloatArray56);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8156(@OriginalArg(0) Canvas arg0) {
		if (this.aP1.aCanvas8 == arg0) {
			this.method8124((Canvas) null);
		}
		@Pc(16) p local16 = (p) this.aClass323_24.method7484((long) arg0.hashCode());
		if (local16 != null) {
			local16.method8920();
			local16.method6172();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method8158(@OriginalArg(0) Class2_Sub40 arg0) {
		this.aYa2 = (ya) arg0;
		this.va(arg0);
	}

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "()Lclient!nia;")
	@Override
	public Class240 method8135() {
		return new Class240(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8085(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6174(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
	private native void N(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
	@Override
	public void method8099(@OriginalArg(0) int arg0) {
		this.anInt6834 = arg0;
		this.anAArray1 = new a[this.anInt6834];
		for (@Pc(9) int local9 = 0; local9 < this.anInt6834; local9++) {
			this.anAArray1[local9] = new a(this, this.anInt6832, this.anInt6833);
		}
	}

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z")
	@Override
	public boolean method8145() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "()Z")
	@Override
	public boolean method8167() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "()V")
	@Override
	public void method8110() {
	}

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "()Lclient!pda;")
	@Override
	public Class51 method8119() {
		return this.aClass51_7;
	}

	@OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
	private native void FA();

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
	public native void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!nl;)V")
	@Override
	public void method8168(@OriginalArg(0) Interface18 arg0) {
		@Pc(2) wa local2 = (wa) arg0;
		this.n(local2.aJ1.nativeid, local2.aXa1.nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
	public native int E();

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
	public native int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!mda;Lclient!mda;FLclient!mda;)Lclient!mda;")
	@Override
	public Class49 method8123(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class49 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
	public native void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "()Z")
	@Override
	public boolean method8114() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method8126() {
	}

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z")
	@Override
	public boolean method8134() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lclient!iea;")
	@Override
	public Class31 method8169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new j(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!mda;)V")
	@Override
	public void method8132(@OriginalArg(0) Class49 arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
	private void method5943() {
		System.gc();
		System.runFinalization();
		Static8.method105();
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()I")
	@Override
	public int method8089() {
		return 4;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!pda;)V")
	@Override
	public void method8138(@OriginalArg(0) Class51 arg0) {
		this.aClass51_7 = arg0;
		this.ma(((ja) arg0).nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
	public native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z")
	@Override
	public boolean method8116() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lclient!p;)V")
	private native void t(@OriginalArg(0) p arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!fl;I)V")
	@Override
	public void method8165(@OriginalArg(0) Class119 arg0, @OriginalArg(1) int arg1) {
		this.method5945(arg0);
		this.method5941().method6(this, Static396.anIntArray454, Static396.anIntArray453, Static396.anIntArray450, Static396.aShortArray102, arg0.aClass202_1.method4751());
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.wa(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
	public native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
	public native void K(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method8104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!lga;IIII)Lclient!ka;")
	@Override
	public Class193 method8161(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new i(this, this.aYa2, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	@Override
	public void method8097(@OriginalArg(0) int arg0) {
		Static8.method105();
		this.d(arg0);
		for (@Pc(10) ya local10 = (ya) this.aClass114_34.method2772(); local10 != null; local10 = (ya) this.aClass114_34.method2762()) {
			local10.r();
		}
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	private native void d(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8124(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aP1 = null;
			this.t((p) null);
		} else {
			@Pc(10) p local10 = (p) this.aClass323_24.method7484((long) arg0.hashCode());
			this.aP1 = local10;
			this.t(local10);
		}
	}

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "(I)Lclient!za;")
	@Override
	public Class2_Sub40 method8162(@OriginalArg(0) int arg0) {
		@Pc(5) ya local5 = new ya(this, arg0);
		this.aClass114_34.method2771(local5);
		return local5;
	}

	@OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
	public native void xa(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lclient!iea;")
	@Override
	public Class31 method8153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new j(this, arg0, arg1, arg2, arg3, !arg4);
	}

	@OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
	public native int[] Y();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method8144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lclient!laa;")
	@Override
	public Class2_Sub12 method8111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub12_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "()Z")
	@Override
	public boolean method8152() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "()Lclient!pda;")
	@Override
	public Class51 method8154() {
		return this.aClass51_8;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
	@Override
	public void method8140(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I")
	@Override
	public int method8122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILclient!aa;II)V")
	private native void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lclient!lda;")
	@Override
	public Interface15 method8120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new xa(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
	@Override
	public void method8139(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method10();
	}

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "()Z")
	@Override
	public boolean method8128() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
	public native void C(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "()Z")
	@Override
	public boolean method8121() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
	public native int I();

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "()V")
	@Override
	public void method8108() {
	}

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
	public native void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
	public native void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z")
	@Override
	public boolean method8093() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lclient!za;)V")
	private native void va(@OriginalArg(0) Class2_Sub40 arg0);

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)Lclient!hca;")
	@Override
	public Interface8 method8151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method8169(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "()Lclient!pda;")
	@Override
	public Class51 method8137() {
		return new ja();
	}

	@OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
	protected native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!fl;)V")
	@Override
	public void method8101(@OriginalArg(0) Class119 arg0) {
		if (arg0.aClass202_1.method4751() != 0) {
			this.method5945(arg0);
			this.method5941().method6(this, Static396.anIntArray454, Static396.anIntArray453, Static396.anIntArray450, Static396.aShortArray102, arg0.aClass202_1.method4751());
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)Lclient!mda;")
	@Override
	public Class49 method8148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
	public native void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "()V")
	@Override
	public void method8118() {
	}

	@OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
	public native void la();

	@OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
	private Object method5944() {
		return new ba(this);
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()V")
	@Override
	public void method8094() {
		this.method8124(this.aP1.aCanvas8);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!fl;Z)V")
	private void method5945(@OriginalArg(0) Class119 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class16_Sub6_Sub1 local15 = (Class16_Sub6_Sub1) arg0.aClass202_1.method4755(); local15 != null; local15 = (Class16_Sub6_Sub1) arg0.aClass202_1.method4753()) {
			Static396.anIntArray454[local1++] = local15.anInt10126;
			Static396.anIntArray454[local1++] = local15.anInt10131;
			Static396.anIntArray454[local1++] = local15.anInt10130;
			Static396.anIntArray453[local3++] = local15.anInt10129;
			Static396.aShortArray102[local7++] = (short) local15.anInt10127;
			Static396.anIntArray450[local5++] = local15.anInt10125;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method8087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method8115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5941().method15(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
	public native void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
	private native void AA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) byte arg16, @OriginalArg(17) boolean arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) int arg19);

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "()Z")
	@Override
	public boolean method8142() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8106(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!hb;Z)Lclient!iea;")
	@Override
	public Class31 method8141(@OriginalArg(0) Class139 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) j local17 = new j(this, arg0.anIntArray261, arg0.aByteArray32, arg0.aByteArray31, 0, arg0.anInt3984, arg0.anInt3984, arg0.anInt3983);
		local17.method8792(arg0.anInt3981, arg0.anInt3980, arg0.anInt3985, arg0.anInt3982);
		return local17;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8146(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass323_24.method7484((long) arg0.hashCode());
		if (local8 == null) {
			try {
				@Pc(13) Class local13 = Class.forName("java.awt.Canvas");
				@Pc(23) Method local23 = local13.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local23.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(35) Exception local35) {
			}
			local8 = new p(this, arg0, arg1, arg2);
			this.aClass323_24.method7477(local8, (long) arg0.hashCode());
		} else if (local8.anInt7051 != arg1 || local8.anInt7052 != arg2) {
			local8.method6175(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!jl;[Lclient!hb;Z)Lclient!da;")
	@Override
	public Class37 method8136(@OriginalArg(0) Class183 arg0, @OriginalArg(1) Class139[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt3984;
			local7[local11] = arg1[local11].anInt3983;
			if (arg1[local11].aByteArray31 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new h(this, this.aYa2, arg0, arg1, (Class31[]) null);
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)V")
	@Override
	public void method8133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6176(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	@Override
	public void method8098(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
	@Override
	public void method8113(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "()Z")
	@Override
	public boolean method8147() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Lclient!d;II)V")
	private native void MA(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
	@Override
	public void method8100(@OriginalArg(0) int[] arg0) {
		@Pc(4) Dimension local4 = this.aP1.aCanvas8.getSize();
		arg0[0] = local4.width;
		arg0[1] = local4.height;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z")
	@Override
	public boolean method8084() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
	public native int i();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!hca;Lclient!lda;)Lclient!nl;")
	@Override
	public Interface18 method8107(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Interface15 arg1) {
		return new wa(this, (j) arg0, (xa) arg1);
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "()Z")
	@Override
	public boolean method8109() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
	public native void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method8125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new na(this, this.aYa2, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
	private boolean method5946(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class271 local9 = super.anInterface2_12.method6027(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.AA(arg0, local9.aShort94, local9.anInt7162, local9.aByte94, local9.aByte97, local9.anInt7159, local9.aBoolean516, local9.aByte92, local9.aByte91, local9.aByte93, local9.aByte95, local9.aBoolean514, local9.aBoolean515, local9.aBoolean512, local9.aBoolean513, local9.aBoolean510, local9.aByte96, local9.aBoolean511, local9.aBoolean509, local9.anInt7163);
				return true;
			}
		}
	}
}
