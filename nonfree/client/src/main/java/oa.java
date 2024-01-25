import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class oa extends Class82 implements Interface8 {

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "Lclient!ya;")
	private ya aYa2;

	@OriginalMember(owner = "client!oa", name = "O", descriptor = "Lclient!p;")
	private p aP1;

	@OriginalMember(owner = "client!oa", name = "R", descriptor = "Lclient!ih;")
	private Class31 aClass31_29;

	@OriginalMember(owner = "client!oa", name = "S", descriptor = "[Lclient!a;")
	private a[] anAArray1;

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "I")
	public int anInt7022;

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "Z")
	private boolean aBoolean507 = false;

	@OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
	public final long nativeid = 0L;

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "Lclient!mba;")
	private final Class216 aClass216_50 = new Class216();

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "I")
	private int anInt7020 = 4096;

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "I")
	private int anInt7021 = 4096;

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "Lclient!baa;")
	private final Class25 aClass25_30 = new Class25(4);

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "Z")
	private boolean aBoolean508 = false;

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "Lclient!ih;")
	private Class31 aClass31_28;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public oa(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg1);
		try {
			if (!Static422.method6653("sw3d")) {
				throw new RuntimeException("");
			}
			Static434.method6596();
			this.MA(super.anInterface5_9, 0, 0);
			Static56.method1015(true, false);
			this.aBoolean508 = true;
			this.aClass31_28 = new ja();
			this.method6160(new ja());
			this.method6165(1);
			this.method6098(0);
			if (arg0 != null) {
				this.method6123(arg0, arg2, arg3);
				this.method6099(arg0);
			}
		} catch (@Pc(80) Throwable local80) {
			this.method6133();
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
	private native void N(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
	public native int E();

	@OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
	public native int XA();

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "()Z")
	@Override
	public boolean method6183() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
	public native int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
	private native void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z")
	@Override
	public boolean method6113() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class91 method6139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new t(this, this.aYa2, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6148(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6478(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
	private native void AA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) byte arg16, @OriginalArg(17) boolean arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) int arg19);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
	@Override
	public void method6128(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lclient!fd;")
	@Override
	public Class103 method6180(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new j(this, arg0, 0, arg1, arg2, arg3, false);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6149(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass25_30.method426((long) arg0.hashCode());
		local8.method6479(arg0, arg1, arg2);
		if (arg0 != null && arg0 == this.aP1.aCanvas11) {
			this.method6099(arg0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "()V")
	@Override
	public void method6153() {
	}

	@OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lclient!za;)V")
	private native void va(@OriginalArg(0) Class3_Sub45 arg0);

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "()V")
	@Override
	public void method6130() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!oia;Z)Lclient!fd;")
	@Override
	public Class103 method6106(@OriginalArg(0) Class251 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) j local17 = new j(this, arg0.anIntArray430, arg0.aByteArray65, arg0.aByteArray64, 0, arg0.anInt7185, arg0.anInt7185, arg0.anInt7184);
		local17.method7441(arg0.anInt7183, arg0.anInt7180, arg0.anInt7181, arg0.anInt7182);
		return local17;
	}

	@OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
	private native void ma(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method6147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new na(this, this.aYa2, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
	public native void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	@Override
	public void method6109(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
	public native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
	private native void FA();

	@OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
	public native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "()Lclient!ih;")
	@Override
	public Class31 method6125() {
		return this.aClass31_28;
	}

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "()Lclient!a;")
	public a method6184() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7022; local1++) {
			if (this.anAArray1[local1].aRunnable1 == Thread.currentThread()) {
				return this.anAArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method6114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "()Lclient!ih;")
	@Override
	public Class31 method6170() {
		return new ja();
	}

	@OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
	protected native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
	public native void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "()Lclient!er;")
	@Override
	public Class98 method6119() {
		return new Class98(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "()Z")
	@Override
	public boolean method6177() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "()Lclient!ih;")
	@Override
	public Class31 method6174() {
		return this.aClass31_29;
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)Lclient!za;")
	@Override
	public Class3_Sub45 method6138(@OriginalArg(0) int arg0) {
		@Pc(5) ya local5 = new ya(this, arg0);
		this.aClass216_50.method5449(local5);
		return local5;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lclient!tj;")
	@Override
	public Class3_Sub22 method6126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub22_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method6122() {
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
	@Override
	public void method6159(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method8();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ik;I)V")
	@Override
	public void method6107(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1) {
		this.method6186(arg0);
		this.method6184().method13(this, Static391.anIntArray412, Static391.anIntArray414, Static391.anIntArray411, Static391.aShortArray82, arg0.aClass347_1.method8204());
	}

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
	public native int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)Lclient!pw;")
	@Override
	public Interface19 method6163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method6110(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!pw;Lclient!lh;)Lclient!di;")
	@Override
	public Interface7 method6143(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) Interface14 arg1) {
		return new wa(this, (j) arg0, (xa) arg1);
	}

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method6133();
		if (this.nativeid != 0L) {
			Static434.method6594(this);
		}
	}

	@OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
	private native void CA(@OriginalArg(0) short arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) boolean arg16, @OriginalArg(17) byte arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) boolean arg19, @OriginalArg(20) int arg20);

	@OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
	public native void la();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6123(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass25_30.method426((long) arg0.hashCode());
		if (local8 == null) {
			try {
				@Pc(13) Class local13 = Class.forName("java.awt.Canvas");
				@Pc(23) Method local23 = local13.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local23.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(35) Exception local35) {
			}
			local8 = new p(this, arg0, arg1, arg2);
			this.aClass25_30.method434((long) arg0.hashCode(), local8);
		} else if (local8.anInt7425 != arg1 || local8.anInt7424 != arg2) {
			local8.method6479(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	@Override
	public void method6098(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method1();
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	@Override
	public void method6132(@OriginalArg(0) int arg0) {
		Static434.method6595();
		this.d(arg0);
		for (@Pc(10) ya local10 = (ya) this.aClass216_50.method5457(); local10 != null; local10 = (ya) this.aClass216_50.method5458()) {
			local10.r();
		}
	}

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
	private boolean method6185(@OriginalArg(0) short arg0) {
		@Pc(2) Interface5 local2 = super.anInterface5_9;
		synchronized (super.anInterface5_9) {
			if (!super.anInterface5_9.method4130(arg0)) {
				return false;
			}
			@Pc(22) Class355 local22 = super.anInterface5_9.method4129(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(44) int[] local44;
			if (local22.anInt9790 == 2) {
				local44 = super.anInterface5_9.method4131(128, 128, arg0, 0.7F);
			} else {
				local44 = super.anInterface5_9.method4127(arg0, 0.7F, 128, 128, true);
			}
			this.CA(arg0, local44, local22.aShort122, local22.anInt9790, local22.aByte119, local22.aByte120, local22.anInt9795, local22.aBoolean741, local22.aByte121, local22.aByte124, local22.aByte125, local22.aByte122, local22.aBoolean743, local22.aBoolean742, local22.aBoolean748, local22.aBoolean744, local22.aBoolean747, local22.aByte123, local22.aBoolean746, local22.aBoolean745, local22.anInt9794);
			return true;
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z")
	@Override
	public boolean method6103() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
	public native void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
	@Override
	public void method6156(@OriginalArg(0) int[] arg0) {
		@Pc(4) Dimension local4 = this.aP1.aCanvas11.getSize();
		arg0[0] = local4.width;
		arg0[1] = local4.height;
	}

	@OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
	public native void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6102(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lclient!fd;")
	@Override
	public Class103 method6144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new j(this, arg0, arg1, arg2, arg3, !arg4);
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)Lclient!lh;")
	@Override
	public Interface14 method6182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new xa(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method6146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.Z(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z")
	@Override
	public boolean method6111() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!he;Lclient!he;FLclient!he;)Lclient!he;")
	@Override
	public Class141 method6150(@OriginalArg(0) Class141 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class141 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6140(@OriginalArg(0) Canvas arg0) {
		if (this.aP1.aCanvas11 == arg0) {
			this.method6099((Canvas) null);
		}
		@Pc(16) p local16 = (p) this.aClass25_30.method426((long) arg0.hashCode());
		if (local16 != null) {
			local16.method8682();
			local16.method6475();
		}
	}

	@OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
	public native int[] Y();

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "()V")
	@Override
	public void method6118() {
	}

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
	public native void K(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z")
	@Override
	public boolean method6120() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ik;Z)V")
	private void method6186(@OriginalArg(0) Class162 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class9_Sub3_Sub2 local15 = (Class9_Sub3_Sub2) arg0.aClass347_1.method8206(); local15 != null; local15 = (Class9_Sub3_Sub2) arg0.aClass347_1.method8205()) {
			Static391.anIntArray412[local1++] = local15.anInt6754;
			Static391.anIntArray412[local1++] = local15.anInt6759;
			Static391.anIntArray412[local1++] = local15.anInt6757;
			Static391.anIntArray414[local3++] = local15.anInt6756;
			Static391.aShortArray82[local7++] = (short) local15.anInt6758;
			Static391.anIntArray411[local5++] = local15.anInt6755;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method6173(@OriginalArg(0) Class3_Sub45 arg0) {
		this.aYa2 = (ya) arg0;
		this.va(arg0);
	}

	@OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
	public native void GA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ik;)V")
	@Override
	public void method6161(@OriginalArg(0) Class162 arg0) {
		if (arg0.aClass347_1.method8204() != 0) {
			this.method6186(arg0);
			this.method6184().method13(this, Static391.anIntArray412, Static391.anIntArray414, Static391.anIntArray411, Static391.aShortArray82, arg0.aClass347_1.method8204());
		}
	}

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILclient!aa;II)V")
	public native void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lclient!p;)V")
	private native void t(@OriginalArg(0) p arg0);

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
	@Override
	public void method6155(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "()Z")
	@Override
	public boolean method6136() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
	public native void xa(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Lclient!d;II)V")
	private native void MA(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lclient!fd;")
	@Override
	public Class103 method6110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new j(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
	@Override
	public void method6165(@OriginalArg(0) int arg0) {
		this.anInt7022 = arg0;
		this.anAArray1 = new a[this.anInt7022];
		for (@Pc(9) int local9 = 0; local9 < this.anInt7022; local9++) {
			this.anAArray1[local9] = new a(this, this.anInt7021, this.anInt7020);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!di;)V")
	@Override
	public void method6141(@OriginalArg(0) Interface7 arg0) {
		@Pc(2) wa local2 = (wa) arg0;
		this.n(local2.aJ1.nativeid, local2.aXa1.nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
	public native void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "()V")
	@Override
	public void method6157() {
	}

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "()V")
	@Override
	public void method6162() {
	}

	@OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
	public native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
	public native void C(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
	@Override
	public boolean method6171() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
	@Override
	public int method6105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method6181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "()I")
	@Override
	public int method6131() {
		return 4;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z")
	@Override
	public boolean method6101() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
	@Override
	public boolean method6175() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ej;[Lclient!oia;Z)Lclient!da;")
	@Override
	public Class63 method6127(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class251[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt7185;
			local7[local11] = arg1[local11].anInt7184;
			if (arg1[local11].aByteArray64 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new h(this, this.aYa2, arg0, arg1, (Class103[]) null);
	}

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
	private Object method6187() {
		return new ba(this);
	}

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
	public native int i();

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z")
	@Override
	public boolean method6104() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)Lclient!he;")
	@Override
	public Class141 method6168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z")
	@Override
	public boolean method6129() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
	private native void n(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)I")
	@Override
	public int method6169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "()V")
	@Override
	public void method6167() {
		this.method6099(this.aP1.aCanvas11);
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
	@Override
	public void method6135() {
		this.anInt7021 = this.anInt7020 = 10000;
		if (this.anInt7022 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method6165(this.anInt7022);
		this.method6098(0);
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
	public native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)V")
	@Override
	public void method6166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6477(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "()V")
	@Override
	protected void method6121() {
		if (this.aBoolean507) {
			return;
		}
		this.anAArray1 = null;
		this.aP1 = null;
		this.aYa2 = null;
		this.aClass31_28 = null;
		this.aClass25_30.method433();
		for (@Pc(25) ya local25 = (ya) this.aClass216_50.method5457(); local25 != null; local25 = (ya) this.aClass216_50.method5458()) {
			local25.ga();
		}
		this.aClass216_50.method5454();
		this.FA();
		if (this.aBoolean508) {
			Static92.method1552(false, true);
			this.aBoolean508 = false;
		}
		this.method6189();
		Static434.method6597();
		this.aBoolean507 = true;
	}

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
	public native int I();

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	private native void d(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ih;)V")
	@Override
	public void method6160(@OriginalArg(0) Class31 arg0) {
		this.aClass31_29 = arg0;
		this.ma(((ja) arg0).nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method6179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
	private boolean method6188(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class355 local9 = super.anInterface5_9.method4129(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.AA(arg0, local9.aShort122, local9.anInt9790, local9.aByte119, local9.aByte120, local9.anInt9795, local9.aBoolean741, local9.aByte121, local9.aByte124, local9.aByte125, local9.aByte122, local9.aBoolean743, local9.aBoolean742, local9.aBoolean748, local9.aBoolean744, local9.aBoolean747, local9.aByte123, local9.aBoolean746, local9.aBoolean745, local9.anInt9794);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
	public native void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lclient!tj;)V")
	@Override
	public void method6100(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static391.anIntArray415[local1++] = arg1[local3].method8391();
			Static391.anIntArray415[local1++] = arg1[local3].method8383();
			Static391.anIntArray415[local1++] = arg1[local3].method8386();
			Static391.anIntArray415[local1++] = arg1[local3].method8382();
			Static391.aFloatArray76[local3] = arg1[local3].method8387();
			Static391.anIntArray415[local1++] = arg1[local3].method8384();
		}
		this.N(arg0, Static391.anIntArray415, Static391.aFloatArray76);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

	@OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
	public native void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z")
	@Override
	public boolean method6158() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method6164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.wa(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!he;)V")
	@Override
	public void method6145(@OriginalArg(0) Class141 arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
	public native void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
	private void method6189() {
		System.gc();
		System.runFinalization();
		Static434.method6595();
	}

	@OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
	public native void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6099(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aP1 = null;
			this.t((p) null);
		} else {
			@Pc(10) p local10 = (p) this.aClass25_30.method426((long) arg0.hashCode());
			this.aP1 = local10;
			this.t(local10);
		}
	}

	@OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
	public native int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6184().method16(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!vo;IIII)Lclient!ka;")
	@Override
	public Class75 method6176(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new i(this, this.aYa2, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILclient!aa;II)V")
	private native void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
	public native void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
