import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class oa extends Class33 implements Interface7 {

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "Lclient!ya;")
	private ya aYa2;

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "Lclient!wc;")
	private Class47 aClass47_5;

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "Lclient!p;")
	private p aP1;

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "[Lclient!a;")
	private a[] anAArray1;

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
	public int anInt7423;

	@OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
	public final long nativeid = 0L;

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "Z")
	private boolean aBoolean635 = false;

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "Lclient!qia;")
	private final Class276 aClass276_46 = new Class276();

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
	private int anInt7422 = 4096;

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
	private int anInt7421 = 4096;

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "Lclient!sga;")
	private final Class307 aClass307_37 = new Class307(4);

	@OriginalMember(owner = "client!oa", name = "O", descriptor = "Z")
	private boolean aBoolean636 = false;

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "Lclient!wc;")
	private Class47 aClass47_6;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public oa(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg1);
		try {
			if (!Static30.method575("sw3d")) {
				throw new RuntimeException("");
			}
			Static549.method7733();
			this.MA(super.anInterface5_11, 0, 0);
			Static146.method3249(false, true);
			this.aBoolean636 = true;
			this.aClass47_6 = new ja();
			this.method6233(new ja());
			this.method6195(1);
			this.method6154(0);
			if (arg0 != null) {
				this.method6227(arg0, arg2, arg3);
				this.method6159(arg0);
			}
		} catch (@Pc(80) Throwable local80) {
			this.method6151();
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6189(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass307_37.method7424((long) arg0.hashCode());
		local8.method6538(arg0, arg1, arg2);
		if (arg0 != null && arg0 == this.aP1.aCanvas11) {
			this.method6159(arg0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
	public native void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "()V")
	@Override
	public void method6178() {
		this.method6159(this.aP1.aCanvas11);
	}

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
	public native int I();

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lclient!za;)V")
	private native void va(@OriginalArg(0) Class3_Sub5 arg0);

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "()Lclient!a;")
	public a method6238() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7423; local1++) {
			if (this.anAArray1[local1].aRunnable1 == Thread.currentThread()) {
				return this.anAArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6182(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
	public native void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z")
	@Override
	public boolean method6172() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "()V")
	@Override
	public void method6199() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!cd;I)V")
	@Override
	public void method6214(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
		this.method6243(arg0);
		this.method6238().method9(this, Static391.anIntArray451, Static391.anIntArray455, Static391.anIntArray456, Static391.aShortArray111, arg0.aClass177_1.method4990());
	}

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lclient!p;)V")
	private native void t(@OriginalArg(0) p arg0);

	@OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
	private native void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
	public native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z")
	@Override
	public boolean method6155() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
	@Override
	public void method6201(@OriginalArg(0) int arg0) {
		Static549.method7735();
		this.d(arg0);
		for (@Pc(10) ya local10 = (ya) this.aClass276_46.method6907(); local10 != null; local10 = (ya) this.aClass276_46.method6912()) {
			local10.r();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class274 method6206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new t(this, this.aYa2, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

	@OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
	public native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
	public native void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method6163() {
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
	@Override
	public void method6184(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method4();
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	@Override
	public void method6154(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method13();
	}

	@OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
	public native void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!pea;Lclient!st;)Lclient!mk;")
	@Override
	public Interface16 method6211(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) Interface25 arg1) {
		return new wa(this, (j) arg0, (xa) arg1);
	}

	@OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
	private native void ma(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "()Z")
	@Override
	public boolean method6185() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!mk;)V")
	@Override
	public void method6194(@OriginalArg(0) Interface16 arg0) {
		@Pc(2) wa local2 = (wa) arg0;
		this.n(local2.aJ1.nativeid, local2.aXa1.nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
	public native void xa(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
	public native void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
	public native void C(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6229(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6537(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!tba;[Lclient!be;Z)Lclient!da;")
	@Override
	public Class25 method6202(@OriginalArg(0) Class315 arg0, @OriginalArg(1) Class28[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt618;
			local7[local11] = arg1[local11].anInt616;
			if (arg1[local11].aByteArray3 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new h(this, this.aYa2, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Lclient!d;II)V")
	private native void MA(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "()Z")
	@Override
	public boolean method6235() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
	public native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
	public native void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "()Z")
	@Override
	public boolean method6237() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
	private boolean method6239(@OriginalArg(0) short arg0) {
		@Pc(2) Interface5 local2 = super.anInterface5_11;
		synchronized (super.anInterface5_11) {
			if (!super.anInterface5_11.method6867(arg0)) {
				return false;
			}
			@Pc(22) Class156 local22 = super.anInterface5_11.method6869(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(44) int[] local44;
			if (local22.anInt5679 == 2) {
				local44 = super.anInterface5_11.method6870(arg0, 0.7F, 128, 128);
			} else {
				local44 = super.anInterface5_11.method6868(true, 0.7F, 128, arg0, 128);
			}
			this.CA(arg0, local44, local22.aShort82, local22.anInt5679, local22.aByte69, local22.aByte72, local22.anInt5678, local22.aBoolean494, local22.aByte71, local22.aByte74, local22.aByte68, local22.aByte73, local22.aBoolean497, local22.aBoolean496, local22.aBoolean493, local22.aBoolean492, local22.aBoolean495, local22.aByte70, local22.aBoolean498, local22.aBoolean491, local22.anInt5676);
			return true;
		}
	}

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "()Z")
	@Override
	public boolean method6221() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
	public native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
	public native int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z")
	@Override
	public boolean method6166() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
	private native void CA(@OriginalArg(0) short arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) boolean arg16, @OriginalArg(17) byte arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) boolean arg19, @OriginalArg(20) int arg20);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method6171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I")
	@Override
	public int method6176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
	public native int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V")
	@Override
	public void method6228(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!cd;)V")
	@Override
	public void method6160(@OriginalArg(0) Class40 arg0) {
		if (arg0.aClass177_1.method4990() != 0) {
			this.method6243(arg0);
			this.method6238().method9(this, Static391.anIntArray451, Static391.anIntArray455, Static391.anIntArray456, Static391.aShortArray111, arg0.aClass177_1.method4990());
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!be;Z)Lclient!ac;")
	@Override
	public Class5 method6161(@OriginalArg(0) Class28 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) j local17 = new j(this, arg0.anIntArray36, arg0.aByteArray2, arg0.aByteArray3, 0, arg0.anInt618, arg0.anInt618, arg0.anInt616);
		local17.method7586(arg0.anInt617, arg0.anInt614, arg0.anInt619, arg0.anInt615);
		return local17;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lclient!st;")
	@Override
	public Interface25 method6169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new xa(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILclient!aa;II)V")
	private native void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)V")
	@Override
	public void method6232(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lclient!ac;")
	@Override
	public Class5 method6193(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new j(this, arg0, 0, arg1, arg2, arg3, false);
	}

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "()I")
	@Override
	public int method6226() {
		return 4;
	}

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILclient!aa;II)V")
	public native void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
	public native void GA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!tj;Lclient!tj;FLclient!tj;)Lclient!tj;")
	@Override
	public Class4 method6222(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class4 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!wc;)V")
	@Override
	public void method6233(@OriginalArg(0) Class47 arg0) {
		this.aClass47_5 = arg0;
		this.ma(((ja) arg0).nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
	private Object method6240() {
		return new ba(this);
	}

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
	public native void K(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lclient!pk;)V")
	@Override
	public void method6203(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub27[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static391.anIntArray454[local1++] = arg1[local3].method5627();
			Static391.anIntArray454[local1++] = arg1[local3].method5628();
			Static391.anIntArray454[local1++] = arg1[local3].method5630();
			Static391.anIntArray454[local1++] = arg1[local3].method5624();
			Static391.aFloatArray58[local3] = arg1[local3].method5631();
			Static391.anIntArray454[local1++] = arg1[local3].method5626();
		}
		this.N(arg0, Static391.anIntArray454, Static391.aFloatArray58);
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)Lclient!za;")
	@Override
	public Class3_Sub5 method6158(@OriginalArg(0) int arg0) {
		@Pc(5) ya local5 = new ya(this, arg0);
		this.aClass276_46.method6906(local5);
		return local5;
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	private native void d(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "()V")
	@Override
	protected void method6224() {
		if (this.aBoolean635) {
			return;
		}
		this.anAArray1 = null;
		this.aP1 = null;
		this.aYa2 = null;
		this.aClass47_6 = null;
		this.aClass307_37.method7427();
		for (@Pc(25) ya local25 = (ya) this.aClass276_46.method6907(); local25 != null; local25 = (ya) this.aClass276_46.method6912()) {
			local25.ga();
		}
		this.aClass276_46.method6910();
		this.FA();
		if (this.aBoolean636) {
			Static577.method6361(false, true);
			this.aBoolean636 = false;
		}
		this.method6241();
		Static549.method7736();
		this.aBoolean635 = true;
	}

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
	public native void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method6196(@OriginalArg(0) Class3_Sub5 arg0) {
		this.aYa2 = (ya) arg0;
		this.va(arg0);
	}

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "()Lclient!wc;")
	@Override
	public Class47 method6200() {
		return this.aClass47_5;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6227(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass307_37.method7424((long) arg0.hashCode());
		if (local8 == null) {
			try {
				@Pc(13) Class local13 = Class.forName("java.awt.Canvas");
				@Pc(23) Method local23 = local13.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local23.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(35) Exception local35) {
			}
			local8 = new p(this, arg0, arg1, arg2);
			this.aClass307_37.method7425((long) arg0.hashCode(), local8);
		} else if (local8.anInt7806 != arg1 || local8.anInt7807 != arg2) {
			local8.method6538(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!tj;)V")
	@Override
	public void method6219(@OriginalArg(0) Class4 arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()V")
	@Override
	public void method6167() {
	}

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method6151();
		if (this.nativeid != 0L) {
			Static549.method7734(this);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method6207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
	public native int E();

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z")
	@Override
	public boolean method6205() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
	private native void n(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6159(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aP1 = null;
			this.t(null);
		} else {
			@Pc(10) p local10 = (p) this.aClass307_37.method7424((long) arg0.hashCode());
			this.aP1 = local10;
			this.t(local10);
		}
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)Lclient!pea;")
	@Override
	public Interface19 method6213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method6188(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
	private void method6241() {
		System.gc();
		System.runFinalization();
		Static549.method7735();
	}

	@OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "()V")
	@Override
	public void method6177() {
	}

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z")
	@Override
	public boolean method6218() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
	private boolean method6242(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class156 local9 = super.anInterface5_11.method6869(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.AA(arg0, local9.aShort82, local9.anInt5679, local9.aByte69, local9.aByte72, local9.anInt5678, local9.aBoolean494, local9.aByte71, local9.aByte74, local9.aByte68, local9.aByte73, local9.aBoolean497, local9.aBoolean496, local9.aBoolean493, local9.aBoolean492, local9.aBoolean495, local9.aByte70, local9.aBoolean498, local9.aBoolean491, local9.anInt5676);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)Lclient!tj;")
	@Override
	public Class4 method6183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
	@Override
	public void method6195(@OriginalArg(0) int arg0) {
		this.anInt7423 = arg0;
		this.anAArray1 = new a[this.anInt7423];
		for (@Pc(9) int local9 = 0; local9 < this.anInt7423; local9++) {
			this.anAArray1[local9] = new a(this, this.anInt7421, this.anInt7422);
		}
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)I")
	@Override
	public int method6220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
	public native void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
	public native int[] Y();

	@OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
	public native int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z")
	@Override
	public boolean method6192() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
	public native void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6187(@OriginalArg(0) Canvas arg0) {
		if (this.aP1.aCanvas11 == arg0) {
			this.method6159(null);
		}
		@Pc(16) p local16 = (p) this.aClass307_37.method7424((long) arg0.hashCode());
		if (local16 != null) {
			local16.method8671();
			local16.method6540();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!cd;Z)V")
	private void method6243(@OriginalArg(0) Class40 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class2_Sub4_Sub1 local15 = (Class2_Sub4_Sub1) arg0.aClass177_1.method4991(); local15 != null; local15 = (Class2_Sub4_Sub1) arg0.aClass177_1.method4995()) {
			Static391.anIntArray451[local1++] = local15.anInt5115;
			Static391.anIntArray451[local1++] = local15.anInt5118;
			Static391.anIntArray451[local1++] = local15.anInt5117;
			Static391.anIntArray455[local3++] = local15.anInt5114;
			Static391.aShortArray111[local7++] = (short) local15.anInt5116;
			Static391.anIntArray456[local5++] = local15.anInt5113;
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method6168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.wa(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "()V")
	@Override
	public void method6181() {
	}

	@OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
	private native void AA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) byte arg16, @OriginalArg(17) boolean arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) int arg19);

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
	private native void N(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
	@Override
	public boolean method6216() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!id;IIII)Lclient!ka;")
	@Override
	public Class128 method6157(@OriginalArg(0) Class142 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new i(this, this.aYa2, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
	public native int i();

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "()Lclient!wc;")
	@Override
	public Class47 method6225() {
		return this.aClass47_6;
	}

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z")
	@Override
	public boolean method6186() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method6174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
	@Override
	public void method6215(@OriginalArg(0) int[] arg0) {
		@Pc(4) Dimension local4 = this.aP1.aCanvas11.getSize();
		arg0[0] = local4.width;
		arg0[1] = local4.height;
	}

	@OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
	public native int XA();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6238().method6(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "()Z")
	@Override
	public boolean method6198() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()V")
	@Override
	public void method6173() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method6164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.Z(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method6191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new na(this, this.aYa2, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lclient!ac;")
	@Override
	public Class5 method6153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new j(this, arg0, arg1, arg2, arg3, !arg4);
	}

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
	public native void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)V")
	@Override
	public void method6217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6539(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lclient!ac;")
	@Override
	public Class5 method6188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new j(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
	private native void FA();

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "()Lclient!wc;")
	@Override
	public Class47 method6223() {
		return new ja();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lclient!pk;")
	@Override
	public Class3_Sub27 method6152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub27_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
	@Override
	public void method6212() {
		this.anInt7421 = this.anInt7422 = 10000;
		if (this.anInt7423 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method6195(this.anInt7423);
		this.method6154(0);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
	@Override
	public void method6197(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "()Lclient!oj;")
	@Override
	public Class248 method6230() {
		return new Class248(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
	protected native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
	public native void la();
}
