import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class da extends Class121 implements Interface9 {

	@OriginalMember(owner = "client!da", name = "u", descriptor = "Lclient!a;")
	private a anA1;

	@OriginalMember(owner = "client!da", name = "J", descriptor = "Lclient!q;")
	private Class34 aClass34_6;

	@OriginalMember(owner = "client!da", name = "N", descriptor = "Lclient!v;")
	private v aV1;

	@OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
	private int anInt1265;

	@OriginalMember(owner = "client!da", name = "R", descriptor = "[Lclient!t;")
	private t[] aTArray1;

	@OriginalMember(owner = "client!da", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!da", name = "v", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!da", name = "w", descriptor = "Lclient!rh;")
	private final Class275 aClass275_30 = new Class275();

	@OriginalMember(owner = "client!da", name = "M", descriptor = "I")
	private final int anInt1264 = 4096;

	@OriginalMember(owner = "client!da", name = "L", descriptor = "I")
	private final int anInt1263 = 4096;

	@OriginalMember(owner = "client!da", name = "O", descriptor = "Lclient!nj;")
	private final Class212 aClass212_3 = new Class212(4);

	@OriginalMember(owner = "client!da", name = "P", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!da", name = "K", descriptor = "Lclient!q;")
	private Class34 aClass34_7;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public da(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1) {
		super(arg1);
		try {
			if (!Static69.method889("sw3d")) {
				throw new RuntimeException("");
			}
			Static211.method3136();
			this.PA(super.anInterface7_14, 0, 0);
			Static285.method4044(true, false);
			this.aBoolean78 = true;
			this.aClass34_7 = new wa();
			this.method7112(new wa());
			this.method7119(1);
			this.method7105(0);
			if (arg0 != null) {
				this.method7120(arg0);
				this.method7101(arg0);
			}
		} catch (@Pc(78) Throwable local78) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7101(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aV1 = null;
			this.P(null);
		} else {
			@Pc(10) v local10 = (v) this.aClass212_3.method5106((long) arg0.hashCode());
			this.aV1 = local10;
			this.P(local10);
		}
	}

	@OriginalMember(owner = "client!da", name = "v", descriptor = "()I")
	public native int v();

	@OriginalMember(owner = "client!da", name = "d", descriptor = "()V")
	@Override
	public void method7090() {
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()V")
	@Override
	public void method7084() {
	}

	@OriginalMember(owner = "client!da", name = "FA", descriptor = "(IIIIII)Z")
	public native boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!hj;)V")
	@Override
	public void method7158(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub7[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static76.anIntArray90[local1++] = arg1[local3].method3490();
			Static76.anIntArray90[local1++] = arg1[local3].method3493();
			Static76.anIntArray90[local1++] = arg1[local3].method3492();
			Static76.anIntArray90[local1++] = arg1[local3].method3487();
			Static76.aFloatArray6[local3] = arg1[local3].method3491();
			Static76.anIntArray90[local1++] = arg1[local3].method3486();
		}
		this.f(arg0, Static76.anIntArray90, Static76.aFloatArray6);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ob;)V")
	@Override
	public void method7087(@OriginalArg(0) Class222 arg0) {
		this.method1146(arg0, false);
		this.method1141().WA(this, Static76.anIntArray89, Static76.anIntArray88, Static76.anIntArray93, Static76.aShortArray16, arg0.aClass118_1.method2334());
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method7127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.e(arg0, arg1, arg2, arg4, arg5);
		this.e(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.ya(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.ya(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "i", descriptor = "()V")
	@Override
	public void method7114() {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public void method7098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class16 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.ra(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!da", name = "ra", descriptor = "(IIIIIILclient!fa;II)V")
	private native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class16 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!da", name = "L", descriptor = "(ILclient!fa;II)V")
	public native void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "g", descriptor = "()Z")
	@Override
	public boolean method7097() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public void method7117(@OriginalArg(0) Class6_Sub24 arg0) {
		this.anA1 = (a) arg0;
		this.a(arg0);
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
	private native void c(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class60 method7121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new ya(this, this.anA1, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!me;Z)Lclient!xa;")
	@Override
	public Class4 method7157(@OriginalArg(0) Class196 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray509;
		@Pc(5) byte[] local5 = arg0.aByteArray68;
		@Pc(8) int local8 = arg0.anInt5516;
		@Pc(11) int local11 = arg0.anInt5517;
		@Pc(32) Class4 local32;
		if (arg0.aByteArray67 == null) {
			local32 = new la(this, this.anA1, local2, local5, 0, arg0.anInt5516, arg0.anInt5516, arg0.anInt5517);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray67;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray509[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new aa(this, this.anA1, local40, 0, arg0.anInt5516, arg0.anInt5516, arg0.anInt5517);
				} else {
					local32 = new ja(this, this.anA1, local40, 0, arg0.anInt5516, arg0.anInt5516, arg0.anInt5517);
				}
			} else {
				for (@Pc(47) int local47 = 0; local47 < local11; local47++) {
					local52 = local47 * local8;
					for (local54 = 0; local54 < local8; local54++) {
						local40[local52 + local54] = local2[local5[local52 + local54] & 0xFF] | local43[local52 + local54] << 24;
					}
				}
				local32 = new aa(this, this.anA1, local40, 0, local8, local8, local11);
			}
		}
		local32.EA(arg0.anInt5514, arg0.anInt5515, arg0.anInt5518, arg0.anInt5513);
		return local32;
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(IIIII)V")
	public native void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "D", descriptor = "(I)V")
	public native void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "w", descriptor = "()Z")
	@Override
	public boolean method7142() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "IA", descriptor = "()I")
	public native int IA();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.BA(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method1141().IA(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!da", name = "j", descriptor = "()Z")
	@Override
	public boolean method7122() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "KA", descriptor = "(IIII)[I")
	public native int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
	@Override
	public void method7089(@OriginalArg(0) int arg0) {
		this.aTArray1[arg0].method6662();
	}

	@OriginalMember(owner = "client!da", name = "h", descriptor = "()Z")
	@Override
	public boolean method7103() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7156(@OriginalArg(0) Canvas arg0) {
		@Pc(8) v local8 = (v) this.aClass212_3.method5106((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.D(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aV1.aCanvas18) {
			this.method7101(arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "na", descriptor = "(III[I)V")
	public native void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void b(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!da", name = "e", descriptor = "()Z")
	@Override
	public boolean method7093() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(II)I")
	@Override
	public int method7150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!da", name = "C", descriptor = "()V")
	@Override
	public void method7155() {
	}

	@OriginalMember(owner = "client!da", name = "PA", descriptor = "(Lclient!e;II)V")
	private native void PA(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()Z")
	@Override
	public boolean method7081() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!i;)V")
	private native void a(@OriginalArg(0) Class6_Sub24 arg0);

	@OriginalMember(owner = "client!da", name = "x", descriptor = "()Z")
	@Override
	public boolean method7143() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "ma", descriptor = "(IIIIII[BII)V")
	public native void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!da", name = "E", descriptor = "()Lclient!t;")
	public t method1141() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1265; local1++) {
			if (this.aTArray1[local1].aRunnable4 == Thread.currentThread()) {
				return this.aTArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7137(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!da", name = "YA", descriptor = "(IFFFFF)V")
	public native void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(Z)V")
	@Override
	public void method7129(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!da", name = "t", descriptor = "()Z")
	@Override
	public boolean method7139() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public Class4 method7110(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new aa(this, this.anA1, arg0, 0, arg1, arg2, arg3) : new ja(this, this.anA1, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new aa(this, this.anA1, arg0, 0, arg1, arg2, arg3) : new ja(this, this.anA1, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!qn;I)V")
	@Override
	public void method7136(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class102_Sub5[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method1141().n(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class102_Sub5 local15 = arg2[0];
		Static76.anIntArray92[5] = 0;
		this.method1141().n(this, arg0, arg1, Static76.anIntArray92, -1, arg3);
		local15.anInt7450 = Static76.anIntArray92[0];
		local15.anInt7449 = Static76.anIntArray92[1];
		local15.anInt7452 = Static76.anIntArray92[2];
		local15.anInt7448 = Static76.anIntArray92[3];
		local15.anInt7451 = Static76.anIntArray92[4];
		local15.aBoolean515 = Static76.anIntArray92[5] != 0;
	}

	@OriginalMember(owner = "client!da", name = "X", descriptor = "(III)V")
	public native void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "s", descriptor = "()V")
	private void method1142() {
		System.gc();
		System.runFinalization();
		Static211.method3133();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public Class16 method7083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new f(this, this.anA1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!da", name = "HA", descriptor = "()Ljava/lang/Object;")
	private Object method1143() {
		return new pa(this);
	}

	@OriginalMember(owner = "client!da", name = "k", descriptor = "()V")
	public native void k();

	@OriginalMember(owner = "client!da", name = "D", descriptor = "()Z")
	@Override
	public boolean method7159() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "qa", descriptor = "(S)Z")
	private boolean method1144(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class76 local9 = super.anInterface7_14.method5209(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.b(arg0, local9.aByte23, local9.aByte21, local9.aBoolean110, local9.aBoolean107, local9.aBoolean111, local9.aByte19, local9.aByte20, local9.aByte24, local9.aShort30, local9.anInt1602, local9.aBoolean106, local9.aBoolean109);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIF)Lclient!hj;")
	@Override
	public Class6_Sub7 method7082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class6_Sub7_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "H", descriptor = "(Z)V")
	public native void H(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7120(@OriginalArg(0) Canvas arg0) {
		@Pc(8) v local8 = (v) this.aClass212_3.method5106((long) arg0.hashCode());
		if (local8 != null) {
			return;
		}
		try {
			@Pc(13) Class local13 = Class.forName("java.awt.Canvas");
			@Pc(23) Method local23 = local13.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local23.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(35) Exception local35) {
		}
		local8 = new v(this, arg0);
		this.aClass212_3.method5104((long) arg0.hashCode(), local8);
	}

	@OriginalMember(owner = "client!da", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!aq;Lclient!aq;FLclient!aq;)Lclient!aq;")
	@Override
	public Class17 method7104(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class17 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7133(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aV1 == null) {
			throw new IllegalStateException("off");
		}
		this.aV1.method7385(arg0, arg1);
	}

	@OriginalMember(owner = "client!da", name = "F", descriptor = "()V")
	public native void F();

	@OriginalMember(owner = "client!da", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void J(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I[I[F)V")
	private native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!da", name = "Q", descriptor = "(IIII)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "m", descriptor = "(IIII)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "ca", descriptor = "(IIII)V")
	public native void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!aq;)V")
	@Override
	public void method7108(@OriginalArg(0) Class17 arg0) {
	}

	@OriginalMember(owner = "client!da", name = "u", descriptor = "()Z")
	@Override
	public boolean method7141() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "r", descriptor = "()Z")
	@Override
	public boolean method7134() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "LA", descriptor = "(IIII)V")
	public native void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "P", descriptor = "(Lclient!v;)V")
	private native void P(@OriginalArg(0) v arg0);

	@OriginalMember(owner = "client!da", name = "sa", descriptor = "(II)V")
	public native void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!da", name = "o", descriptor = "(Lclient!q;)V")
	private native void o(@OriginalArg(0) Class34 arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!ba;Lclient!ob;Lclient!q;[Lclient!qn;I)V")
	@Override
	public void method7151(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) Class222 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class102_Sub5[] arg3, @OriginalArg(4) int arg4) {
		this.method1146(arg1, true);
		if (arg3 == null) {
			this.method1141().v(this, arg0, arg2, null, arg4, Static76.anIntArray89, Static76.anIntArray88, Static76.anIntArray93, Static76.aShortArray16, Static76.aByteArray18, arg1.aClass118_1.method2334(), Static76.anIntArray91);
		} else {
			@Pc(28) Class102_Sub5 local28 = arg3[0];
			Static76.anIntArray92[5] = 0;
			this.method1141().v(this, arg0, arg2, Static76.anIntArray92, arg4, Static76.anIntArray89, Static76.anIntArray88, Static76.anIntArray93, Static76.aShortArray16, Static76.aByteArray18, arg1.aClass118_1.method2334(), Static76.anIntArray91);
			local28.anInt7450 = Static76.anIntArray92[0];
			local28.anInt7449 = Static76.anIntArray92[1];
			local28.anInt7452 = Static76.anIntArray92[2];
			local28.anInt7448 = Static76.anIntArray92[3];
			local28.anInt7451 = Static76.anIntArray92[4];
			local28.aBoolean515 = Static76.anIntArray92[5] != 0;
		}
		for (@Pc(86) int local86 = 0; local86 < arg0.length; local86++) {
			if (arg0[local86] != null) {
				@Pc(96) j local96 = (j) arg0[local86];
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(Z)V")
	@Override
	public void method7135(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!da", name = "m", descriptor = "()V")
	@Override
	protected void method7125() {
		if (this.aBoolean77) {
			return;
		}
		this.aTArray1 = null;
		this.aV1 = null;
		this.anA1 = null;
		this.aClass34_7 = null;
		this.aClass212_3.method5110();
		for (@Pc(25) a local25 = (a) this.aClass275_30.method6366(); local25 != null; local25 = (a) this.aClass275_30.method6364()) {
			local25.ZA();
		}
		this.aClass275_30.method6357();
		this.fa();
		if (this.aBoolean78) {
			Static441.method6330(false, true);
			this.aBoolean78 = false;
		}
		this.method1142();
		Static211.method3135();
		this.aBoolean77 = true;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "()I")
	@Override
	public int method7085() {
		return 4;
	}

	@OriginalMember(owner = "client!da", name = "B", descriptor = "()Z")
	@Override
	public boolean method7148() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public Class4 method7091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new aa(this, this.anA1, arg0, arg1, arg2, arg3) : new ja(this, this.anA1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ba;Lclient!ob;Lclient!q;Lclient!qn;I)V")
	@Override
	public void method7118(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class222 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class102_Sub5 arg3, @OriginalArg(4) int arg4) {
		this.method1146(arg1, true);
		if (arg3 == null) {
			this.method1141().m(this, arg0, arg2, null, arg4, Static76.anIntArray89, Static76.anIntArray88, Static76.anIntArray93, Static76.aShortArray16, Static76.aByteArray18, arg1.aClass118_1.method2334(), Static76.anIntArray91);
			return;
		}
		Static76.anIntArray92[5] = 0;
		this.method1141().m(this, arg0, arg2, Static76.anIntArray92, arg4, Static76.anIntArray89, Static76.anIntArray88, Static76.anIntArray93, Static76.aShortArray16, Static76.aByteArray18, arg1.aClass118_1.method2334(), Static76.anIntArray91);
		arg3.anInt7450 = Static76.anIntArray92[0];
		arg3.anInt7449 = Static76.anIntArray92[1];
		arg3.anInt7452 = Static76.anIntArray92[2];
		arg3.anInt7448 = Static76.anIntArray92[3];
		arg3.anInt7451 = Static76.anIntArray92[4];
		arg3.aBoolean515 = Static76.anIntArray92[5] != 0;
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
	@Override
	public void method7100(@OriginalArg(0) int arg0) {
		Static211.method3133();
		this.c(arg0);
		for (@Pc(10) a local10 = (a) this.aClass275_30.method6366(); local10 != null; local10 = (a) this.aClass275_30.method6364()) {
			local10.P();
		}
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "()V")
	private native void fa();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7112(@OriginalArg(0) Class34 arg0) {
		this.aClass34_6 = arg0;
		this.o(arg0);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7115() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!da", name = "A", descriptor = "()V")
	@Override
	public void method7147() {
	}

	@OriginalMember(owner = "client!da", name = "JA", descriptor = "(I)V")
	public native void JA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "aa", descriptor = "()I")
	public native int aa();

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(S)Z")
	private boolean method1145(@OriginalArg(0) short arg0) {
		@Pc(2) Interface7 local2 = super.anInterface7_14;
		synchronized (super.anInterface7_14) {
			if (!super.anInterface7_14.method5207(arg0)) {
				return false;
			}
			@Pc(22) Class76 local22 = super.anInterface7_14.method5209(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(43) int[] local43;
			if (local22.aBoolean113) {
				local43 = super.anInterface7_14.method5206(128, 0.7F, 128, arg0);
			} else {
				local43 = super.anInterface7_14.method5208(true, 0.7F, 128, 128, arg0);
			}
			this.J(arg0, local22.aByte23, local22.aByte21, local22.aBoolean110, local22.aBoolean107, local22.aBoolean111, local22.aByte19, local22.aByte20, local22.aByte24, local22.aShort30, local22.anInt1602, local22.aBoolean106, local22.aBoolean109, local43);
			return true;
		}
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(IIIIII)Lclient!aq;")
	@Override
	public Class17 method7113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!da", name = "ya", descriptor = "(IIIII)V")
	public native void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!il;[Lclient!me;Z)Lclient!ta;")
	@Override
	public Class56 method7123(@OriginalArg(0) Class146 arg0, @OriginalArg(1) Class196[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt5516;
			local7[local11] = arg1[local11].anInt5517;
			if (arg1[local11].aByteArray67 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new b(this, this.anA1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!da", name = "n", descriptor = "()Z")
	@Override
	public boolean method7126() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V")
	@Override
	public void method7105(@OriginalArg(0) int arg0) {
		this.aTArray1[arg0].method6661();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!da", name = "q", descriptor = "()Z")
	@Override
	public boolean method7131() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "l", descriptor = "()Lclient!ru;")
	@Override
	public Class282 method7124() {
		return new Class282(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!da", name = "z", descriptor = "()Lclient!q;")
	@Override
	public Class34 method7146() {
		return new wa();
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "(I)V")
	@Override
	public void method7119(@OriginalArg(0) int arg0) {
		this.anInt1265 = arg0;
		this.aTArray1 = new t[this.anInt1265];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1265; local9++) {
			this.aTArray1[local9] = new t(this, this.anInt1263, this.anInt1264);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I")
	@Override
	public int method7099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method7116();
		if (this.nativeid != 0L) {
			Static211.method3132(this);
		}
	}

	@OriginalMember(owner = "client!da", name = "C", descriptor = "(IIIIII)V")
	public native void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!rf;IIII)Lclient!ba;")
	@Override
	public Class22 method7088(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new j(this, this.anA1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!da", name = "ka", descriptor = "(FF)V")
	public native void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7132(@OriginalArg(0) Canvas arg0) {
		if (this.aV1.aCanvas18 == arg0) {
			this.method7101(null);
		}
		@Pc(16) v local16 = (v) this.aClass212_3.method5106((long) arg0.hashCode());
		if (local16 != null) {
			local16.method7849();
			local16.method7382();
		}
	}

	@OriginalMember(owner = "client!da", name = "A", descriptor = "([I)V")
	public native void A(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)V")
	@Override
	public void method7102(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!da", name = "BA", descriptor = "(IIIIII)V")
	private native void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!da", name = "y", descriptor = "()Z")
	@Override
	public boolean method7145() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ob;Z)V")
	private void method1146(@OriginalArg(0) Class222 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class102_Sub1_Sub1 local15 = (Class102_Sub1_Sub1) arg0.aClass118_1.method2331(); local15 != null; local15 = (Class102_Sub1_Sub1) arg0.aClass118_1.method2335()) {
			Static76.anIntArray89[local1++] = local15.anInt2516;
			Static76.anIntArray89[local1++] = local15.anInt2521;
			Static76.anIntArray89[local1++] = local15.anInt2518;
			Static76.anIntArray88[local3++] = local15.anInt2519;
			Static76.aShortArray16[local7++] = (short) local15.anInt2522;
			Static76.anIntArray93[local5++] = local15.anInt2520;
			if (arg1) {
				Static76.aByteArray18[local9++] = local15.aByte46;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "SA", descriptor = "()I")
	public native int SA();

	@OriginalMember(owner = "client!da", name = "f", descriptor = "()Lclient!q;")
	@Override
	public Class34 method7096() {
		return this.aClass34_7;
	}

	@OriginalMember(owner = "client!da", name = "AA", descriptor = "(IIII)V")
	public native void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "o", descriptor = "()V")
	@Override
	public void method7128() throws Exception_Sub1 {
		if (this.aV1 == null) {
			throw new IllegalStateException("off");
		}
		this.aV1.method7384();
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I)Lclient!i;")
	@Override
	public Class6_Sub24 method7107(@OriginalArg(0) int arg0) {
		@Pc(5) a local5 = new a(this, arg0);
		this.aClass275_30.method6370(local5);
		return local5;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	@Override
	public void method7086(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!da", name = "p", descriptor = "()V")
	@Override
	public void method7130() {
	}

	@OriginalMember(owner = "client!da", name = "h", descriptor = "(IIIII)V")
	protected native void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "ha", descriptor = "(F)V")
	public native void ha(@OriginalArg(0) float arg0);
}
