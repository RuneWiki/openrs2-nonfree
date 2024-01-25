import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class oa extends Class132 implements Interface7 {

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "Lclient!ya;")
	private ya aYa2;

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "Lclient!oo;")
	private Class207 aClass207_24;

	@OriginalMember(owner = "client!oa", name = "O", descriptor = "Lclient!p;")
	private p aP1;

	@OriginalMember(owner = "client!oa", name = "S", descriptor = "[Lclient!a;")
	private a[] anAArray1;

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "I")
	public int anInt6856;

	@OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
	public final long nativeid = 0L;

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "Z")
	private boolean aBoolean444 = false;

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "Lclient!v;")
	private final Class362 aClass362_35 = new Class362();

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
	private int anInt6855 = 4096;

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "I")
	private int anInt6854 = 4096;

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "Lclient!lk;")
	private final Class209 aClass209_40 = new Class209(4);

	@OriginalMember(owner = "client!oa", name = "R", descriptor = "Z")
	private boolean aBoolean445 = false;

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "Lclient!oo;")
	private Class207 aClass207_25;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public oa(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg1);
		try {
			if (!Static272.method4009("sw3d")) {
				throw new RuntimeException("");
			}
			Static497.method7157();
			this.MA(super.anInterface6_11, 0, 0);
			Static144.method2110(true, false);
			this.aBoolean445 = true;
			this.aClass207_25 = new ja();
			this.method7517(new ja());
			this.method7486(1);
			this.method7497(0);
			if (arg0 != null) {
				this.method7494(arg0, arg2, arg3);
				this.method7505(arg0);
			}
		} catch (@Pc(80) Throwable local80) {
			this.method7491();
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
	public native void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
	private boolean method5934(@OriginalArg(0) short arg0) {
		@Pc(2) Interface6 local2 = super.anInterface6_11;
		synchronized (super.anInterface6_11) {
			if (!super.anInterface6_11.method7090(arg0)) {
				return false;
			}
			@Pc(22) Class294 local22 = super.anInterface6_11.method7088(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(44) int[] local44;
			if (local22.anInt8333 == 2) {
				local44 = super.anInterface6_11.method7089(arg0, 0.7F, 128, 128);
			} else {
				local44 = super.anInterface6_11.method7085(128, true, arg0, 0.7F, 128);
			}
			this.CA(arg0, local44, local22.aShort108, local22.anInt8333, local22.aByte120, local22.aByte114, local22.anInt8334, local22.aBoolean574, local22.aByte118, local22.aByte116, local22.aByte115, local22.aByte117, local22.aBoolean573, local22.aBoolean567, local22.aBoolean572, local22.aBoolean569, local22.aBoolean570, local22.aByte119, local22.aBoolean568, local22.aBoolean571, local22.anInt8332);
			return true;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method7441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
	private native void ma(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7505(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aP1 = null;
			this.t((p) null);
		} else {
			@Pc(10) p local10 = (p) this.aClass209_40.method5038((long) arg0.hashCode());
			this.aP1 = local10;
			this.t(local10);
		}
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V")
	@Override
	public void method7502(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
	public native void xa(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
	public native int i();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lclient!ho;")
	@Override
	public Class9 method7476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new j(this, arg0, arg1, arg2, arg3, !arg4);
	}

	@OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
	public native void GA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!oo;)V")
	@Override
	public void method7517(@OriginalArg(0) Class207 arg0) {
		this.aClass207_24 = arg0;
		this.ma(((ja) arg0).nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "()Lclient!oo;")
	@Override
	public Class207 method7467() {
		return new ja();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lclient!sca;)V")
	@Override
	public void method7504(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub17[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static409.anIntArray435[local1++] = arg1[local3].method8518();
			Static409.anIntArray435[local1++] = arg1[local3].method8522();
			Static409.anIntArray435[local1++] = arg1[local3].method8521();
			Static409.anIntArray435[local1++] = arg1[local3].method8520();
			Static409.aFloatArray28[local3] = arg1[local3].method8524();
			Static409.anIntArray435[local1++] = arg1[local3].method8519();
		}
		this.N(arg0, Static409.anIntArray435, Static409.aFloatArray28);
	}

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "()Z")
	@Override
	public boolean method7480() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "()Lclient!oo;")
	@Override
	public Class207 method7456() {
		return this.aClass207_25;
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)V")
	@Override
	public void method7464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6439(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I")
	@Override
	public int method7448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
	private native void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "()V")
	@Override
	protected void method7498() {
		if (this.aBoolean444) {
			return;
		}
		this.anAArray1 = null;
		this.aP1 = null;
		this.aYa2 = null;
		this.aClass207_25 = null;
		this.aClass209_40.method5041();
		for (@Pc(25) ya local25 = (ya) this.aClass362_35.method8538(); local25 != null; local25 = (ya) this.aClass362_35.method8530()) {
			local25.ga();
		}
		this.aClass362_35.method8543();
		this.FA();
		if (this.aBoolean445) {
			Static557.method7881(false, true);
			this.aBoolean445 = false;
		}
		this.method5935();
		Static497.method7158();
		this.aBoolean444 = true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class12 method7437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new t(this, this.aYa2, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
	public native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
	private native void n(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILclient!aa;II)V")
	private native void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
	public native void C(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
	private native void FA();

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
	@Override
	public void method7485(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()V")
	@Override
	public void method7442() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
	@Override
	public void method7451(@OriginalArg(0) int[] arg0) {
		@Pc(4) Dimension local4 = this.aP1.aCanvas9.getSize();
		arg0[0] = local4.width;
		arg0[1] = local4.height;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method7479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
	private void method5935() {
		System.gc();
		System.runFinalization();
		Static497.method7155();
	}

	@OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
	private Object method5936() {
		return new ba(this);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()Lclient!rb;")
	@Override
	public Class297 method7439() {
		return new Class297(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method7483(@OriginalArg(0) Class6_Sub20 arg0) {
		this.aYa2 = (ya) arg0;
		this.va(arg0);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lclient!sca;")
	@Override
	public Class6_Sub17 method7501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class6_Sub17_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
	public native int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
	public native void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
	public native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	@Override
	public void method7450(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
	public native void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "()V")
	@Override
	public void method7454() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ok;)V")
	@Override
	public void method7452(@OriginalArg(0) Class25 arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7460(@OriginalArg(0) Canvas arg0) {
		if (this.aP1.aCanvas9 == arg0) {
			this.method7505((Canvas) null);
		}
		@Pc(16) p local16 = (p) this.aClass209_40.method5038((long) arg0.hashCode());
		if (local16 != null) {
			local16.method9174();
			local16.method6437();
		}
	}

	@OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Lclient!d;II)V")
	private native void MA(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!hda;)V")
	@Override
	public void method7455(@OriginalArg(0) Class137 arg0) {
		if (arg0.aClass333_1.method7905() != 0) {
			this.method5937(arg0);
			this.method5939().method2(this, Static409.anIntArray436, Static409.anIntArray434, Static409.anIntArray433, Static409.aShortArray86, arg0.aClass333_1.method7905());
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z")
	@Override
	public boolean method7433() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!mia;)V")
	@Override
	public void method7489(@OriginalArg(0) Interface16 arg0) {
		@Pc(2) wa local2 = (wa) arg0;
		this.n(local2.aJ1.nativeid, local2.aXa1.nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
	public native int[] Y();

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILclient!aa;II)V")
	public native void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
	@Override
	public void method7497(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method14();
	}

	@OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
	public native void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7510(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass209_40.method5038((long) arg0.hashCode());
		local8.method6438(arg0, arg1, arg2);
		if (arg0 != null && arg0 == this.aP1.aCanvas9) {
			this.method7505(arg0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "()V")
	@Override
	public void method7493() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7494(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass209_40.method5038((long) arg0.hashCode());
		if (local8 == null) {
			try {
				@Pc(13) Class local13 = Class.forName("java.awt.Canvas");
				@Pc(23) Method local23 = local13.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local23.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(35) Exception local35) {
			}
			local8 = new p(this, arg0, arg1, arg2);
			this.aClass209_40.method5035((long) arg0.hashCode(), local8);
		} else if (local8.anInt7443 != arg1 || local8.anInt7442 != arg2) {
			local8.method6438(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)Lclient!ok;")
	@Override
	public Class25 method7443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7446(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6436(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
	@Override
	public boolean method7500() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lclient!p;)V")
	private native void t(@OriginalArg(0) p arg0);

	@OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
	private native void CA(@OriginalArg(0) short arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) boolean arg16, @OriginalArg(17) byte arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) boolean arg19, @OriginalArg(20) int arg20);

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
	@Override
	public boolean method7506() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "()Z")
	@Override
	public boolean method7508() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	private native void d(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
	@Override
	public void method7486(@OriginalArg(0) int arg0) {
		this.anInt6856 = arg0;
		this.anAArray1 = new a[this.anInt6856];
		for (@Pc(9) int local9 = 0; local9 < this.anInt6856; local9++) {
			this.anAArray1[local9] = new a(this, this.anInt6855, this.anInt6854);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!hw;[Lclient!fm;Z)Lclient!da;")
	@Override
	public Class19 method7518(@OriginalArg(0) Class151 arg0, @OriginalArg(1) Class112[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt2743;
			local7[local11] = arg1[local11].anInt2740;
			if (arg1[local11].aByteArray30 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new h(this, this.aYa2, arg0, arg1, (Class9[]) null);
	}

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
	public native int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
	@Override
	public void method7484(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method5();
	}

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
	public native void K(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z")
	@Override
	public boolean method7495() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!hda;I)V")
	@Override
	public void method7469(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1) {
		this.method5937(arg0);
		this.method5939().method2(this, Static409.anIntArray436, Static409.anIntArray434, Static409.anIntArray433, Static409.aShortArray86, arg0.aClass333_1.method7905());
	}

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
	public native void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
	public native void la();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!hda;Z)V")
	private void method5937(@OriginalArg(0) Class137 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class2_Sub6_Sub1 local15 = (Class2_Sub6_Sub1) arg0.aClass333_1.method7902(); local15 != null; local15 = (Class2_Sub6_Sub1) arg0.aClass333_1.method7903()) {
			Static409.anIntArray436[local1++] = local15.anInt2695;
			Static409.anIntArray436[local1++] = local15.anInt2698;
			Static409.anIntArray436[local1++] = local15.anInt2694;
			Static409.anIntArray434[local3++] = local15.anInt2699;
			Static409.aShortArray86[local7++] = (short) local15.anInt2693;
			Static409.anIntArray433[local5++] = local15.anInt2692;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
	public native void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
	public native int E();

	@OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
	private native void AA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) byte arg16, @OriginalArg(17) boolean arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) int arg19);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
	private boolean method5938(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class294 local9 = super.anInterface6_11.method7088(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.AA(arg0, local9.aShort108, local9.anInt8333, local9.aByte120, local9.aByte114, local9.anInt8334, local9.aBoolean574, local9.aByte118, local9.aByte116, local9.aByte115, local9.aByte117, local9.aBoolean573, local9.aBoolean567, local9.aBoolean572, local9.aBoolean569, local9.aBoolean570, local9.aByte119, local9.aBoolean568, local9.aBoolean571, local9.anInt8332);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z")
	@Override
	public boolean method7445() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "()V")
	@Override
	public void method7499() {
		this.method7505(this.aP1.aCanvas9);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7471(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
	public native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "()I")
	@Override
	public int method7511() {
		return 4;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lclient!ho;")
	@Override
	public Class9 method7482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new j(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
	protected native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lclient!cn;")
	@Override
	public Interface4 method7436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method7482(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method7515() {
	}

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ao;IIII)Lclient!ka;")
	@Override
	public Class184 method7475(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new i(this, this.aYa2, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method7481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
	public native int XA();

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method7491();
		if (this.nativeid != 0L) {
			Static497.method7156(this);
		}
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z")
	@Override
	public boolean method7447() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "()V")
	@Override
	public void method7477() {
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
	@Override
	public void method7458(@OriginalArg(0) int arg0) {
		Static497.method7155();
		this.d(arg0);
		for (@Pc(10) ya local10 = (ya) this.aClass362_35.method8538(); local10 != null; local10 = (ya) this.aClass362_35.method8530()) {
			local10.r();
		}
	}

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
	public native void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)I")
	@Override
	public int method7509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)V")
	@Override
	public void method7519() {
		this.anInt6855 = this.anInt6854 = 10000;
		if (this.anInt6856 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method7486(this.anInt6856);
		this.method7497(0);
	}

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z")
	@Override
	public boolean method7466() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z")
	@Override
	public boolean method7470() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "()Lclient!a;")
	public a method5939() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt6856; local1++) {
			if (this.anAArray1[local1].aRunnable1 == Thread.currentThread()) {
				return this.anAArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "()Z")
	@Override
	public boolean method7474() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method7465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new na(this, this.aYa2, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
	public native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)Lclient!za;")
	@Override
	public Class6_Sub20 method7453(@OriginalArg(0) int arg0) {
		@Pc(5) ya local5 = new ya(this, arg0);
		this.aClass362_35.method8536(local5);
		return local5;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!cn;Lclient!rca;)Lclient!mia;")
	@Override
	public Interface16 method7463(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Interface23 arg1) {
		return new wa(this, (j) arg0, (xa) arg1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5939().method4(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ok;Lclient!ok;FLclient!ok;)Lclient!ok;")
	@Override
	public Class25 method7457(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class25 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
	public native int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method7473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.wa(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "()V")
	@Override
	public void method7472() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method7492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.Z(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!fm;Z)Lclient!ho;")
	@Override
	public Class9 method7488(@OriginalArg(0) Class112 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) j local17 = new j(this, arg0.anIntArray152, arg0.aByteArray31, arg0.aByteArray30, 0, arg0.anInt2743, arg0.anInt2743, arg0.anInt2740);
		local17.method8931(arg0.anInt2745, arg0.anInt2741, arg0.anInt2742, arg0.anInt2744);
		return local17;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lclient!ho;")
	@Override
	public Class9 method7507(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new j(this, arg0, 0, arg1, arg2, arg3, false);
	}

	@OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lclient!za;)V")
	private native void va(@OriginalArg(0) Class6_Sub20 arg0);

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "()Lclient!oo;")
	@Override
	public Class207 method7496() {
		return this.aClass207_24;
	}

	@OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
	public native void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
	public native void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)Lclient!rca;")
	@Override
	public Interface23 method7459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new xa(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "()Z")
	@Override
	public boolean method7503() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
	public native void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z")
	@Override
	public boolean method7487() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
	public native int I();

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
	private native void N(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);
}
