import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class oa extends Class145 implements Interface5 {

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "Lclient!ya;")
	private ya aYa2;

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "Lclient!gw;")
	private Class86 aClass86_5;

	@OriginalMember(owner = "client!oa", name = "J", descriptor = "Lclient!p;")
	private p aP1;

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
	public int anInt7194;

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "[Lclient!a;")
	private a[] anAArray1;

	@OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
	public final long nativeid = 0L;

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "Z")
	private boolean aBoolean611 = false;

	@OriginalMember(owner = "client!oa", name = "O", descriptor = "Lclient!cga;")
	private final Class60 aClass60_144 = new Class60();

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
	private int anInt7192 = 4096;

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "I")
	private int anInt7193 = 4096;

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "Lclient!lba;")
	private final Class218 aClass218_33 = new Class218(4);

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "Z")
	private boolean aBoolean612 = false;

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "Lclient!gw;")
	private Class86 aClass86_6;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public oa(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg1);
		try {
			if (!Static548.method7659("sw3d")) {
				throw new RuntimeException("");
			}
			Static178.method2626();
			this.MA(super.anInterface3_12, 0, 0);
			Static669.method9116(false, true);
			this.aBoolean612 = true;
			this.aClass86_6 = new ja();
			this.method9656(new ja());
			this.method9633(1);
			this.method9705(0);
			if (arg0 != null) {
				this.method9631(arg0, arg2, arg3);
				this.method9689(arg0);
			}
		} catch (@Pc(82) Throwable local82) {
			this.method9661();
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lclient!ug;")
	@Override
	public Class43 method9654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new j(this, arg0, arg1, arg2, arg3, !arg4);
	}

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
	public native void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!mb;)V")
	@Override
	public void method9666(@OriginalArg(0) Class236 arg0) {
		if (arg0.aClass58_1.method1200() != 0) {
			this.method6490(arg0);
			this.method6486().method12(this, Static443.anIntArray516, Static443.anIntArray517, Static443.anIntArray513, Static443.aShortArray121, arg0.aClass58_1.method1200());
		}
	}

	@OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
	public native void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method9702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
	public native void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!db;)V")
	@Override
	public void method9701(@OriginalArg(0) Class74 arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z")
	@Override
	public boolean method9693() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!db;Lclient!db;FLclient!db;)Lclient!db;")
	@Override
	public Class74 method9678(@OriginalArg(0) Class74 arg0, @OriginalArg(1) Class74 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class74 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z")
	@Override
	public boolean method9646() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	@Override
	public void method9659(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "()V")
	@Override
	public void method9712() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method9684(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method9639(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6774(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
	public native int i();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lclient!ug;")
	@Override
	public Class43 method9638(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new j(this, arg0, 0, arg1, arg2, arg3, false);
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z")
	@Override
	public boolean method9648() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
	@Override
	public boolean method9632() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z")
	@Override
	public boolean method9674() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
	public native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Lclient!d;II)V")
	private native void MA(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILclient!aa;II)V")
	public native void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lclient!bba;")
	@Override
	public Class2_Sub7 method9664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub7_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!jt;Lclient!mh;)Lclient!cla;")
	@Override
	public Interface1 method9697(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Interface16 arg1) {
		return new wa(this, (j) arg0, (xa) arg1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
	@Override
	public int method9695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
	private native void n(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "()I")
	@Override
	public int method9694() {
		return 4;
	}

	@OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
	private native void CA(@OriginalArg(0) short arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) boolean arg16, @OriginalArg(17) byte arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) boolean arg19, @OriginalArg(20) int arg20);

	@OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
	private boolean method6485(@OriginalArg(0) short arg0) {
		@Pc(2) Interface3 local2 = super.anInterface3_12;
		synchronized (super.anInterface3_12) {
			if (!super.anInterface3_12.method2852(arg0)) {
				return false;
			}
			@Pc(22) Class8 local22 = super.anInterface3_12.method2857(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(44) int[] local44;
			if (local22.anInt186 == 2) {
				local44 = super.anInterface3_12.method2854(128, arg0, 128, 0.7F);
			} else {
				local44 = super.anInterface3_12.method2853(arg0, 0.7F, 128, 128, true);
			}
			this.CA(arg0, local44, local22.aShort10, local22.anInt186, local22.aByte15, local22.aByte11, local22.anInt189, local22.aBoolean28, local22.aByte13, local22.aByte12, local22.aByte16, local22.aByte14, local22.aBoolean32, local22.aBoolean34, local22.aBoolean35, local22.aBoolean31, local22.aBoolean33, local22.aByte10, local22.aBoolean29, local22.aBoolean30, local22.anInt188);
			return true;
		}
	}

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
	public native void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	private native void d(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method9704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "()Lclient!a;")
	public a method6486() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7194; local1++) {
			if (this.anAArray1[local1].aRunnable1 == Thread.currentThread()) {
				return this.anAArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z")
	@Override
	public boolean method9671() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
	private native void ma(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
	@Override
	public void method9669(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
	private Object method6487() {
		return new ba(this);
	}

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "()V")
	@Override
	protected void method9642() {
		if (this.aBoolean611) {
			return;
		}
		this.anAArray1 = null;
		this.aP1 = null;
		this.aYa2 = null;
		this.aClass86_6 = null;
		this.aClass218_33.method5097();
		for (@Pc(26) ya local26 = (ya) this.aClass60_144.method1226(7); local26 != null; local26 = (ya) this.aClass60_144.method1228()) {
			local26.ga();
		}
		this.aClass60_144.method1223();
		this.FA();
		if (this.aBoolean612) {
			Static503.method2433(false, true);
			this.aBoolean612 = false;
		}
		this.method6488();
		Static178.method2625();
		this.aBoolean611 = true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!mb;I)V")
	@Override
	public void method9690(@OriginalArg(0) Class236 arg0, @OriginalArg(1) int arg1) {
		this.method6490(arg0);
		this.method6486().method12(this, Static443.anIntArray516, Static443.anIntArray517, Static443.anIntArray513, Static443.aShortArray121, arg0.aClass58_1.method1200());
	}

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
	@Override
	public boolean method9665() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "()Lclient!bo;")
	@Override
	public Class47 method9653() {
		return new Class47(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)Lclient!za;")
	@Override
	public Class2_Sub28 method9649(@OriginalArg(0) int arg0) {
		@Pc(5) ya local5 = new ya(this, arg0);
		this.aClass60_144.method1233(local5);
		return local5;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

	@OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
	private native void AA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) byte arg16, @OriginalArg(17) boolean arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) int arg19);

	@OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
	public native void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method9714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.wa(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
	public native int E();

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
	public native void K(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method9708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)V")
	@Override
	public void method9644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6771(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
	public native void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()Lclient!gw;")
	@Override
	public Class86 method9699() {
		return this.aClass86_6;
	}

	@OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
	public native void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
	public native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method9640(@OriginalArg(0) Canvas arg0) {
		if (this.aP1.aCanvas8 == arg0) {
			this.method9689((Canvas) null);
		}
		@Pc(18) p local18 = (p) this.aClass218_33.method5095((long) arg0.hashCode(), 0);
		if (local18 != null) {
			local18.method9872();
			local18.method6773();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lclient!ug;")
	@Override
	public Class43 method9687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new j(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)Lclient!mh;")
	@Override
	public Interface16 method9645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new xa(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "()Z")
	@Override
	public boolean method9675() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
	private void method6488() {
		System.gc();
		System.runFinalization();
		Static178.method2624();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method9696() {
	}

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method9662(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass218_33.method5095((long) arg0.hashCode(), 0);
		local8.method6772(arg0, arg1, arg2);
		if (arg0 != null && arg0 == this.aP1.aCanvas8) {
			this.method9689(arg0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "()Z")
	@Override
	public boolean method9650() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "()V")
	@Override
	public void method9660() {
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method9713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "(I)V")
	@Override
	public void method9709(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method14();
	}

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
	private boolean method6489(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class8 local9 = super.anInterface3_12.method2857(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.AA(arg0, local9.aShort10, local9.anInt186, local9.aByte15, local9.aByte11, local9.anInt189, local9.aBoolean28, local9.aByte13, local9.aByte12, local9.aByte16, local9.aByte14, local9.aBoolean32, local9.aBoolean34, local9.aBoolean35, local9.aBoolean31, local9.aBoolean33, local9.aByte10, local9.aBoolean29, local9.aBoolean30, local9.anInt188);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
	public native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "()V")
	@Override
	public void method9673() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method9677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new na(this, this.aYa2, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
	private native void N(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "()Lclient!gw;")
	@Override
	public Class86 method9716() {
		return this.aClass86_5;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!cla;)V")
	@Override
	public void method9658(@OriginalArg(0) Interface1 arg0) {
		@Pc(2) wa local2 = (wa) arg0;
		this.n(local2.aJ1.nativeid, local2.aXa1.nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
	public native int XA();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!pga;[Lclient!tia;Z)Lclient!da;")
	@Override
	public Class68 method9707(@OriginalArg(0) Class289 arg0, @OriginalArg(1) Class355[] arg1, @OriginalArg(2) boolean arg2) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt9469;
			local7[local11] = arg1[local11].anInt9470;
			if (arg1[local11].aByteArray106 != null) {
				local9 = true;
			}
		}
		if (arg2) {
			if (local9) {
				throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
			}
			return new h(this, this.aYa2, arg0, arg1, (Class43[]) null);
		} else if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		} else {
			return new n(this, this.aYa2, arg0, arg1, (Class43[]) null);
		}
	}

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "()Z")
	@Override
	public boolean method9715() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method9631(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass218_33.method5095((long) arg0.hashCode(), 0);
		if (local8 == null) {
			try {
				@Pc(15) Class local15 = Class.forName("java.awt.Canvas");
				@Pc(27) Method local27 = local15.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local27.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(39) Exception local39) {
			}
			local8 = new p(this, arg0, arg1, arg2);
			this.aClass218_33.method5099(local8, (long) arg0.hashCode());
		} else if (local8.anInt7597 != arg1 || local8.anInt7598 != arg2) {
			local8.method6772(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
	public native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "()Lclient!gw;")
	@Override
	public Class86 method9691() {
		return new ja();
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIIII)Lclient!db;")
	@Override
	public Class74 method9692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!tia;Z)Lclient!ug;")
	@Override
	public Class43 method9683(@OriginalArg(0) Class355 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) j local17 = new j(this, arg0.anIntArray689, arg0.aByteArray107, arg0.aByteArray106, 0, arg0.anInt9469, arg0.anInt9469, arg0.anInt9470);
		local17.method9586(arg0.anInt9468, arg0.anInt9472, arg0.anInt9471, arg0.anInt9473);
		return local17;
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
	@Override
	public void method9718() {
		this.anInt7193 = this.anInt7192 = 10000;
		if (this.anInt7194 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method9633(this.anInt7194);
		this.method9705(0);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method9682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.Z(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
	public native void C(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "()Z")
	@Override
	public boolean method9710() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lclient!za;)V")
	private native void va(@OriginalArg(0) Class2_Sub28 arg0);

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)V")
	@Override
	public void method9672(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
	@Override
	public void method9668(@OriginalArg(0) int[] arg0) {
		@Pc(4) Dimension local4 = this.aP1.aCanvas8.getSize();
		arg0[0] = local4.width;
		arg0[1] = local4.height;
	}

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "()V")
	@Override
	public void method9667() {
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z")
	@Override
	public boolean method9698() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
	public native void la();

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
	public native void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!gw;)V")
	@Override
	public void method9656(@OriginalArg(0) Class86 arg0) {
		this.aClass86_5 = arg0;
		this.ma(((ja) arg0).nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
	@Override
	public void method9643(@OriginalArg(0) int arg0) {
		Static178.method2624();
		this.d(arg0);
		for (@Pc(10) ya local10 = (ya) this.aClass60_144.method1226(7); local10 != null; local10 = (ya) this.aClass60_144.method1228()) {
			local10.r();
		}
	}

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
	public native int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
	public native void xa(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
	@Override
	public void method9705(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method11();
	}

	@OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
	public native void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
	private native void FA();

	@OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
	protected native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class133 method9679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new t(this, this.aYa2, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
	public native int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILclient!aa;II)V")
	private native void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
	public native int[] Y();

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z")
	@Override
	public boolean method9681() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
	@Override
	public void method9633(@OriginalArg(0) int arg0) {
		this.anInt7194 = arg0;
		this.anAArray1 = new a[this.anInt7194];
		for (@Pc(9) int local9 = 0; local9 < this.anInt7194; local9++) {
			this.anAArray1[local9] = new a(this, this.anInt7193, this.anInt7192);
		}
	}

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method9661();
		if (this.nativeid != 0L) {
			Static178.method2627(this);
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method9689(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aP1 = null;
			this.t((p) null);
		} else {
			@Pc(10) p local10 = (p) this.aClass218_33.method5095((long) arg0.hashCode(), 0);
			this.aP1 = local10;
			this.t(local10);
		}
	}

	@OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
	private native void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
	public native void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method9663(@OriginalArg(0) Class2_Sub28 arg0) {
		this.aYa2 = (ya) arg0;
		this.va(arg0);
	}

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "()V")
	@Override
	public void method9706() {
		this.method9689(this.aP1.aCanvas8);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ln;IIII)Lclient!ka;")
	@Override
	public Class45 method9700(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new i(this, this.aYa2, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
	public native void GA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method9670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6486().method5(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lclient!bba;)V")
	@Override
	public void method9655(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static443.anIntArray518[local1++] = arg1[local3].method8171();
			Static443.anIntArray518[local1++] = arg1[local3].method8174();
			Static443.anIntArray518[local1++] = arg1[local3].method8172();
			Static443.anIntArray518[local1++] = arg1[local3].method8173();
			Static443.aFloatArray53[local3] = arg1[local3].method8169();
			Static443.anIntArray518[local1++] = arg1[local3].method8170();
		}
		this.N(arg0, Static443.anIntArray518, Static443.aFloatArray53);
	}

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
	public native int I();

	@OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
	public native int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "()V")
	@Override
	public void method9636() {
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)I")
	@Override
	public int method9686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)Lclient!jt;")
	@Override
	public Interface11 method9657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method9687(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
	@Override
	public boolean method9703() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!mb;Z)V")
	private void method6490(@OriginalArg(0) Class236 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class4_Sub1_Sub1 local15 = (Class4_Sub1_Sub1) arg0.aClass58_1.method1197(); local15 != null; local15 = (Class4_Sub1_Sub1) arg0.aClass58_1.method1199()) {
			Static443.anIntArray516[local1++] = local15.anInt5792;
			Static443.anIntArray516[local1++] = local15.anInt5786;
			Static443.anIntArray516[local1++] = local15.anInt5791;
			Static443.anIntArray517[local3++] = local15.anInt5784;
			Static443.aShortArray121[local7++] = (short) local15.anInt5789;
			Static443.anIntArray513[local5++] = local15.anInt5793;
		}
	}

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lclient!p;)V")
	private native void t(@OriginalArg(0) p arg0);
}
