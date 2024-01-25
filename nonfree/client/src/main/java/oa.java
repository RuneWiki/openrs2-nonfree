import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class oa extends Class16 implements Interface3 {

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "Lclient!ya;")
	private ya aYa2;

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "Lclient!p;")
	private p aP1;

	@OriginalMember(owner = "client!oa", name = "O", descriptor = "Lclient!dfa;")
	private Class54 aClass54_7;

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "[Lclient!a;")
	private a[] anAArray1;

	@OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
	public int anInt7434;

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "Z")
	private boolean aBoolean535 = false;

	@OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
	public final long nativeid = 0L;

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "Lclient!bq;")
	private final Class43 aClass43_48 = new Class43();

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "I")
	private int anInt7433 = 4096;

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
	private int anInt7432 = 4096;

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "Lclient!pfa;")
	private final Class253 aClass253_26 = new Class253(4);

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "Z")
	private boolean aBoolean536 = false;

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "Lclient!dfa;")
	private Class54 aClass54_6;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public oa(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg1);
		try {
			if (!Static267.method4634("sw3d")) {
				throw new RuntimeException("");
			}
			Static606.method8288();
			this.MA(super.anInterface2_12, 0, 0);
			Static93.method2184(false, true);
			this.aBoolean536 = true;
			this.aClass54_6 = new ja();
			this.method6066(new ja());
			this.method6099(1);
			this.method6101(0);
			if (arg0 != null) {
				this.method6085(arg0, arg2, arg3);
				this.method6120(arg0);
			}
		} catch (@Pc(80) Throwable local80) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6107(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
	public native void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
	protected native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
	public native void GA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
	public native void xa(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
	private native void FA();

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "()Lclient!a;")
	public a method6139() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7434; local1++) {
			if (this.anAArray1[local1].aRunnable1 == Thread.currentThread()) {
				return this.anAArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "()Z")
	@Override
	public boolean method6091() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
	public native void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
	public native void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
	public native void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
	@Override
	public boolean method6123() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method6070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new na(this, this.aYa2, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6129(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass253_26.method6594((long) arg0.hashCode());
		local8.method6482(arg0, arg1, arg2);
		if (arg0 != null && arg0 == this.aP1.aCanvas12) {
			this.method6120(arg0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!jj;)V")
	@Override
	public void method6078(@OriginalArg(0) Interface11 arg0) {
		@Pc(2) wa local2 = (wa) arg0;
		this.n(local2.aJ1.nativeid, local2.aXa1.nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
	public native void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lclient!hu;")
	@Override
	public Class21 method6054(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new j(this, arg0, 0, arg1, arg2, arg3, false);
	}

	@OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
	private Object method6140() {
		return new ba(this);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
	@Override
	public void method6111(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "()V")
	@Override
	public void method6128() {
		this.method6120(this.aP1.aCanvas12);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6090(@OriginalArg(0) Canvas arg0) {
		if (this.aP1.aCanvas12 == arg0) {
			this.method6120(null);
		}
		@Pc(16) p local16 = (p) this.aClass253_26.method6594((long) arg0.hashCode());
		if (local16 != null) {
			local16.method8640();
			local16.method6481();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)Lclient!km;")
	@Override
	public Class40 method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
	@Override
	public void method6119(@OriginalArg(0) int arg0) {
		Static606.method8291();
		this.d(arg0);
		for (@Pc(10) ya local10 = (ya) this.aClass43_48.method1422(); local10 != null; local10 = (ya) this.aClass43_48.method1426()) {
			local10.r();
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6120(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aP1 = null;
			this.t(null);
		} else {
			@Pc(10) p local10 = (p) this.aClass253_26.method6594((long) arg0.hashCode());
			this.aP1 = local10;
			this.t(local10);
		}
	}

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
	private native void n(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "()V")
	@Override
	public void method6095() {
	}

	@OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILclient!aa;II)V")
	public native void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
	public native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)I")
	@Override
	public int method6121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
	public native int E();

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "()I")
	@Override
	public int method6074() {
		return 4;
	}

	@OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
	public native int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
	private void method6141() {
		System.gc();
		System.runFinalization();
		Static606.method8291();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lclient!iaa;")
	@Override
	public Interface8 method6064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new xa(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ur;[Lclient!g;Z)Lclient!da;")
	@Override
	public Class27 method6088(@OriginalArg(0) Class345 arg0, @OriginalArg(1) Class111[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt4054;
			local7[local11] = arg1[local11].anInt4053;
			if (arg1[local11].aByteArray28 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new h(this, this.aYa2, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!uk;IIII)Lclient!ka;")
	@Override
	public Class83 method6094(@OriginalArg(0) Class344 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new i(this, this.aYa2, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method6058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.Z(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z")
	@Override
	public boolean method6080() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "()V")
	@Override
	public void method6075() {
	}

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "()Z")
	@Override
	public boolean method6122() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "()Z")
	@Override
	public boolean method6117() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()V")
	@Override
	protected void method6053() {
		if (this.aBoolean535) {
			return;
		}
		this.anAArray1 = null;
		this.aP1 = null;
		this.aYa2 = null;
		this.aClass54_6 = null;
		this.aClass253_26.method6598();
		for (@Pc(25) ya local25 = (ya) this.aClass43_48.method1422(); local25 != null; local25 = (ya) this.aClass43_48.method1426()) {
			local25.ga();
		}
		this.aClass43_48.method1431();
		this.FA();
		if (this.aBoolean536) {
			Static266.method4631(false, true);
			this.aBoolean536 = false;
		}
		this.method6141();
		Static606.method8289();
		this.aBoolean535 = true;
	}

	@OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
	public native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
	public native int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!km;)V")
	@Override
	public void method6072(@OriginalArg(0) Class40 arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
	private native void AA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) byte arg16, @OriginalArg(17) boolean arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) int arg19);

	@OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
	private native void CA(@OriginalArg(0) short arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) boolean arg16, @OriginalArg(17) byte arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) boolean arg19, @OriginalArg(20) int arg20);

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lclient!p;)V")
	private native void t(@OriginalArg(0) p arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!pca;)V")
	@Override
	public void method6100(@OriginalArg(0) Class250 arg0) {
		if (arg0.aClass131_1.method3728() != 0) {
			this.method6142(arg0);
			this.method6139().method5(this, Static381.anIntArray402, Static381.anIntArray403, Static381.anIntArray401, Static381.aShortArray98, arg0.aClass131_1.method3728());
		}
	}

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "()V")
	@Override
	public void method6081() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!km;Lclient!km;FLclient!km;)Lclient!km;")
	@Override
	public Class40 method6067(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class40 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
	public native int XA();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method6096(@OriginalArg(0) Class8_Sub30 arg0) {
		this.aYa2 = (ya) arg0;
		this.va(arg0);
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()V")
	@Override
	public void method6059() {
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	@Override
	public void method6082(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
	public native void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lclient!ada;)V")
	@Override
	public void method6052(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static381.anIntArray404[local1++] = arg1[local3].method5206();
			Static381.anIntArray404[local1++] = arg1[local3].method5198();
			Static381.anIntArray404[local1++] = arg1[local3].method5207();
			Static381.anIntArray404[local1++] = arg1[local3].method5200();
			Static381.aFloatArray68[local3] = arg1[local3].method5205();
			Static381.anIntArray404[local1++] = arg1[local3].method5203();
		}
		this.N(arg0, Static381.anIntArray404, Static381.aFloatArray68);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	@Override
	public void method6071(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method6093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.wa(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!g;Z)Lclient!hu;")
	@Override
	public Class21 method6135(@OriginalArg(0) Class111 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) j local17 = new j(this, arg0.anIntArray216, arg0.aByteArray27, arg0.aByteArray28, 0, arg0.anInt4054, arg0.anInt4054, arg0.anInt4053);
		local17.method5778(arg0.anInt4055, arg0.anInt4050, arg0.anInt4051, arg0.anInt4052);
		return local17;
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)V")
	@Override
	public void method6131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6480(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
	@Override
	public void method6101(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method11();
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	private native void d(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!kv;Lclient!iaa;)Lclient!jj;")
	@Override
	public Interface11 method6125(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) Interface8 arg1) {
		return new wa(this, (j) arg0, (xa) arg1);
	}

	@OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
	public native void la();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
	@Override
	public void method6087(@OriginalArg(0) int[] arg0) {
		@Pc(4) Dimension local4 = this.aP1.aCanvas12.getSize();
		arg0[0] = local4.width;
		arg0[1] = local4.height;
	}

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "()Lclient!dfa;")
	@Override
	public Class54 method6076() {
		return new ja();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method6113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z")
	@Override
	public boolean method6079() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z")
	@Override
	public boolean method6055() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6139().method14(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()V")
	@Override
	public void method6061() {
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z")
	@Override
	public boolean method6056() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
	public native void C(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
	public native void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILclient!aa;II)V")
	private native void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
	public native int I();

	@OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
	public native int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "()Z")
	@Override
	public boolean method6133() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
	public native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "()Z")
	@Override
	public boolean method6138() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I")
	@Override
	public int method6109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z")
	@Override
	public boolean method6115() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Lclient!d;II)V")
	private native void MA(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "(I)V")
	@Override
	public void method6134(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method9();
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)Lclient!za;")
	@Override
	public Class8_Sub30 method6112(@OriginalArg(0) int arg0) {
		@Pc(5) ya local5 = new ya(this, arg0);
		this.aClass43_48.method1424(local5);
		return local5;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!pca;Z)V")
	private void method6142(@OriginalArg(0) Class250 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class15_Sub5_Sub1 local15 = (Class15_Sub5_Sub1) arg0.aClass131_1.method3724(); local15 != null; local15 = (Class15_Sub5_Sub1) arg0.aClass131_1.method3727()) {
			Static381.anIntArray402[local1++] = local15.anInt3827;
			Static381.anIntArray402[local1++] = local15.anInt3830;
			Static381.anIntArray402[local1++] = local15.anInt3826;
			Static381.anIntArray403[local3++] = local15.anInt3828;
			Static381.aShortArray98[local7++] = (short) local15.anInt3824;
			Static381.anIntArray401[local5++] = local15.anInt3822;
		}
	}

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "()Lclient!dfa;")
	@Override
	public Class54 method6124() {
		return this.aClass54_6;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

	@OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
	public native int[] Y();

	@OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
	private native void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
	@Override
	public void method6083() {
		this.anInt7432 = this.anInt7433 = 10000;
		if (this.anInt7434 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method6099(this.anInt7434);
		this.method6101(0);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!pca;I)V")
	@Override
	public void method6108(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1) {
		this.method6142(arg0);
		this.method6139().method5(this, Static381.anIntArray402, Static381.anIntArray403, Static381.anIntArray401, Static381.aShortArray98, arg0.aClass131_1.method3728());
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class86 method6126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new t(this, this.aYa2, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
	@Override
	public void method6099(@OriginalArg(0) int arg0) {
		this.anInt7434 = arg0;
		this.anAArray1 = new a[this.anInt7434];
		for (@Pc(9) int local9 = 0; local9 < this.anInt7434; local9++) {
			this.anAArray1[local9] = new a(this, this.anInt7432, this.anInt7433);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lclient!hu;")
	@Override
	public Class21 method6104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new j(this, arg0, arg1, arg2, arg3, !arg4);
	}

	@OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
	private native void ma(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method6057() {
	}

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "()Z")
	@Override
	public boolean method6077() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "()Lclient!dfa;")
	@Override
	public Class54 method6118() {
		return this.aClass54_7;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lclient!ada;")
	@Override
	public Class8_Sub1 method6084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class8_Sub1_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
	private native void N(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6085(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass253_26.method6594((long) arg0.hashCode());
		if (local8 == null) {
			try {
				@Pc(13) Class local13 = Class.forName("java.awt.Canvas");
				@Pc(23) Method local23 = local13.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local23.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(35) Exception local35) {
			}
			local8 = new p(this, arg0, arg1, arg2);
			this.aClass253_26.method6591(local8, (long) arg0.hashCode());
		} else if (local8.anInt7823 != arg1 || local8.anInt7822 != arg2) {
			local8.method6482(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!dfa;)V")
	@Override
	public void method6066(@OriginalArg(0) Class54 arg0) {
		this.aClass54_7 = arg0;
		this.ma(((ja) arg0).nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "()Lclient!oba;")
	@Override
	public Class234 method6103() {
		return new Class234(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
	public native int i();

	@OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
	private boolean method6143(@OriginalArg(0) short arg0) {
		@Pc(2) Interface2 local2 = super.anInterface2_12;
		synchronized (super.anInterface2_12) {
			if (!super.anInterface2_12.method4025(arg0)) {
				return false;
			}
			@Pc(22) Class218 local22 = super.anInterface2_12.method4027(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(44) int[] local44;
			if (local22.anInt6842 == 2) {
				local44 = super.anInterface2_12.method4028(0.7F, 128, arg0, 128);
			} else {
				local44 = super.anInterface2_12.method4026(true, 128, arg0, 0.7F, 128);
			}
			this.CA(arg0, local44, local22.aShort73, local22.anInt6842, local22.aByte66, local22.aByte62, local22.anInt6845, local22.aBoolean476, local22.aByte63, local22.aByte68, local22.aByte67, local22.aByte64, local22.aBoolean471, local22.aBoolean475, local22.aBoolean474, local22.aBoolean478, local22.aBoolean472, local22.aByte65, local22.aBoolean477, local22.aBoolean473, local22.anInt6843);
			return true;
		}
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)Lclient!kv;")
	@Override
	public Interface14 method6127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method6060(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method6106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lclient!za;)V")
	private native void va(@OriginalArg(0) Class8_Sub30 arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lclient!hu;")
	@Override
	public Class21 method6060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new j(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method6063();
		if (this.nativeid != 0L) {
			Static606.method8287(this);
		}
	}

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6069(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6484(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z")
	@Override
	public boolean method6102() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method6110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
	public native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
	public native void K(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
	private boolean method6144(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class218 local9 = super.anInterface2_12.method4027(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.AA(arg0, local9.aShort73, local9.anInt6842, local9.aByte66, local9.aByte62, local9.anInt6845, local9.aBoolean476, local9.aByte63, local9.aByte68, local9.aByte67, local9.aByte64, local9.aBoolean471, local9.aBoolean475, local9.aBoolean474, local9.aBoolean478, local9.aBoolean472, local9.aByte65, local9.aBoolean477, local9.aBoolean473, local9.anInt6843);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
	public native void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
	public native void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
	public native void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);
}
