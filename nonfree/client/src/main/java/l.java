import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class l extends Class78 implements Interface19 {

	@OriginalMember(owner = "client!l", name = "u", descriptor = "Lclient!m;")
	private m aM1;

	@OriginalMember(owner = "client!l", name = "v", descriptor = "Lclient!q;")
	private Class34 aClass34_2;

	@OriginalMember(owner = "client!l", name = "G", descriptor = "Lclient!ta;")
	private ta aTa1;

	@OriginalMember(owner = "client!l", name = "H", descriptor = "I")
	public int anInt5220;

	@OriginalMember(owner = "client!l", name = "K", descriptor = "[Lclient!qa;")
	private qa[] aQaArray1;

	@OriginalMember(owner = "client!l", name = "r", descriptor = "Z")
	private boolean aBoolean399 = false;

	@OriginalMember(owner = "client!l", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!l", name = "t", descriptor = "Lclient!gca;")
	private final Class111 aClass111_24 = new Class111();

	@OriginalMember(owner = "client!l", name = "C", descriptor = "I")
	private final int anInt5218 = 4096;

	@OriginalMember(owner = "client!l", name = "D", descriptor = "I")
	private final int anInt5219 = 4096;

	@OriginalMember(owner = "client!l", name = "w", descriptor = "Lclient!faa;")
	private final Class91 aClass91_21 = new Class91(4);

	@OriginalMember(owner = "client!l", name = "N", descriptor = "Z")
	private boolean aBoolean400 = false;

	@OriginalMember(owner = "client!l", name = "x", descriptor = "Lclient!q;")
	private Class34 aClass34_3;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;)V")
	public l(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface9 arg1) {
		super(arg1);
		try {
			if (!Static362.method5319("sw3d")) {
				throw new RuntimeException("");
			}
			Static37.method674();
			this.OA(super.anInterface9_13, 0, 0);
			Static171.method2748(true, false);
			this.aBoolean400 = true;
			this.aClass34_3 = new ra();
			this.method6812(new ra());
			this.method6793(1);
			this.method6849(0);
			if (arg0 != null) {
				this.method6780(arg0);
				this.method6795(arg0);
			}
		} catch (@Pc(78) Throwable local78) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6795(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aTa1 = null;
			this.ia(null);
		} else {
			@Pc(10) ta local10 = (ta) this.aClass91_21.method2271((long) arg0.hashCode());
			this.aTa1 = local10;
			this.ia(local10);
		}
	}

	@OriginalMember(owner = "client!l", name = "p", descriptor = "()Z")
	@Override
	public boolean method6828() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "B", descriptor = "()Z")
	@Override
	public boolean method6851() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!l", name = "w", descriptor = "(IIIIII)V")
	private native void w(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!wn;Lclient!wn;FLclient!wn;)Lclient!wn;")
	@Override
	public Class209 method6811(@OriginalArg(0) Class209 arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class209 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6821(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aTa1 == null) {
			throw new IllegalStateException("off");
		}
		this.aTa1.method6762(arg0, arg1);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method6812(@OriginalArg(0) Class34 arg0) {
		this.aClass34_2 = arg0;
		this.NA(arg0);
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "()Z")
	@Override
	public boolean method6792() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "OA", descriptor = "(Lclient!fa;II)V")
	private native void OA(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!l", name = "z", descriptor = "()V")
	@Override
	public void method6846() {
		this.method6795(this.aTa1.aCanvas10);
	}

	@OriginalMember(owner = "client!l", name = "T", descriptor = "()I")
	public native int T();

	@OriginalMember(owner = "client!l", name = "s", descriptor = "()V")
	@Override
	public void method6834() {
	}

	@OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method6786();
		if (this.nativeid != 0L) {
			Static37.method673(this);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
	@Override
	public void method6824(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!l", name = "o", descriptor = "()V")
	@Override
	public void method6820() throws Exception_Sub1 {
		if (this.aTa1 == null) {
			throw new IllegalStateException("off");
		}
		this.aTa1.method6764();
	}

	@OriginalMember(owner = "client!l", name = "ja", descriptor = "(I)V")
	public native void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "qa", descriptor = "(I)V")
	private native void qa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!l", name = "x", descriptor = "()V")
	@Override
	public void method6844() {
	}

	@OriginalMember(owner = "client!l", name = "ra", descriptor = "(F)V")
	public native void ra(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!nba;IIII)Lclient!da;")
	@Override
	public Class52 method6817(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new v(this, this.aM1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!l", name = "i", descriptor = "()Z")
	@Override
	public boolean method6804() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIF)Lclient!tw;")
	@Override
	public Class1_Sub24 method6790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub24_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "f", descriptor = "()Z")
	@Override
	public boolean method6794() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "J", descriptor = "(IIIIII)V")
	public native void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method6798(@OriginalArg(0) Class1_Sub16 arg0) {
		this.aM1 = (m) arg0;
		this.EA(arg0);
	}

	@OriginalMember(owner = "client!l", name = "FA", descriptor = "(ILclient!ua;II)V")
	public native void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method6815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.w(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I")
	@Override
	public int method6782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!l", name = "I", descriptor = "(I[I[F)V")
	private native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!l", name = "c", descriptor = "()Z")
	@Override
	public boolean method6787() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "VA", descriptor = "(IFFFFF)V")
	public native void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!l", name = "XA", descriptor = "(IIIII)V")
	public native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6836() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!l", name = "h", descriptor = "()Z")
	@Override
	public boolean method6802() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "A", descriptor = "(S)Z")
	private boolean method4278(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class17 local9 = super.anInterface9_13.method947(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.Z(arg0, local9.aByte21, local9.aByte17, local9.aBoolean25, local9.aBoolean32, local9.aBoolean34, local9.aByte18, local9.aByte19, local9.aByte22, local9.aShort19, local9.anInt577, local9.aBoolean26, local9.aBoolean30);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "ma", descriptor = "(Lclient!t;)V")
	private native void ma(@OriginalArg(0) t arg0);

	@OriginalMember(owner = "client!l", name = "V", descriptor = "(IIII)V")
	public native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "v", descriptor = "()[I")
	public native int[] v();

	@OriginalMember(owner = "client!l", name = "k", descriptor = "()V")
	@Override
	public void method6809() {
	}

	@OriginalMember(owner = "client!l", name = "IA", descriptor = "(IIIIII[BII)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!l", name = "q", descriptor = "()Z")
	@Override
	public boolean method6831() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!wn;)V")
	@Override
	public void method6781(@OriginalArg(0) Class209 arg0) {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!vn;[Lclient!qga;Z)Lclient!la;")
	@Override
	public Class96 method6837(@OriginalArg(0) Class352 arg0, @OriginalArg(1) Class282[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt7490;
			local7[local11] = arg1[local11].anInt7493;
			if (arg1[local11].aByteArray73 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new c(this, this.aM1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!l", name = "j", descriptor = "()Z")
	@Override
	public boolean method6808() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "pa", descriptor = "(III)V")
	public native void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!l", name = "g", descriptor = "()Z")
	@Override
	public boolean method6801() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "BA", descriptor = "()I")
	public native int BA();

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(II)I")
	@Override
	public int method6819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!l", name = "n", descriptor = "()V")
	@Override
	public void method6816() {
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "()V")
	@Override
	protected void method6789() {
		if (this.aBoolean399) {
			return;
		}
		this.aQaArray1 = null;
		this.aTa1 = null;
		this.aM1 = null;
		this.aClass34_3 = null;
		this.aClass91_21.method2275();
		for (@Pc(25) m local25 = (m) this.aClass111_24.method2547(); local25 != null; local25 = (m) this.aClass111_24.method2554()) {
			local25.D();
		}
		this.aClass111_24.method2555();
		this.R();
		if (this.aBoolean400) {
			Static81.method1350(false, true);
			this.aBoolean400 = false;
		}
		this.method4283();
		Static37.method675();
		this.aBoolean399 = true;
	}

	@OriginalMember(owner = "client!l", name = "CA", descriptor = "(IIII)V")
	public native void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "fa", descriptor = "()Ljava/lang/Object;")
	private Object method4279() {
		return new h(this);
	}

	@OriginalMember(owner = "client!l", name = "va", descriptor = "(I)V")
	public native void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "D", descriptor = "()Lclient!qa;")
	public qa method4280() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5220; local1++) {
			if (this.aQaArray1[local1].aRunnable2 == Thread.currentThread()) {
				return this.aQaArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4280().G(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!l", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!l", name = "L", descriptor = "()V")
	public native void L();

	@OriginalMember(owner = "client!l", name = "w", descriptor = "()Lclient!q;")
	@Override
	public Class34 method6843() {
		return this.aClass34_2;
	}

	@OriginalMember(owner = "client!l", name = "O", descriptor = "(IIIIII)Z")
	public native boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!qga;Z)Lclient!f;")
	@Override
	public Class5 method6838(@OriginalArg(0) Class282 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray445;
		@Pc(5) byte[] local5 = arg0.aByteArray74;
		@Pc(8) int local8 = arg0.anInt7490;
		@Pc(11) int local11 = arg0.anInt7493;
		@Pc(32) Class5 local32;
		if (arg1 && arg0.aByteArray73 == null) {
			local32 = new w(this, this.aM1, local2, local5, 0, arg0.anInt7490, arg0.anInt7490, arg0.anInt7493);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray73;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray445[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new t(this, this.aM1, local40, 0, arg0.anInt7490, arg0.anInt7490, arg0.anInt7493);
				} else {
					local32 = new va(this, this.aM1, local40, 0, arg0.anInt7490, arg0.anInt7490, arg0.anInt7493);
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
		local32.Q(arg0.anInt7491, arg0.anInt7492, arg0.anInt7488, arg0.anInt7489);
		return local32;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6826(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!l", name = "h", descriptor = "(IIII)[I")
	public native int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "W", descriptor = "(S)Z")
	private boolean method4281(@OriginalArg(0) short arg0) {
		@Pc(2) Interface9 local2 = super.anInterface9_13;
		synchronized (super.anInterface9_13) {
			if (!super.anInterface9_13.method949(arg0)) {
				return false;
			}
			@Pc(22) Class17 local22 = super.anInterface9_13.method947(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(43) int[] local43;
			if (local22.aBoolean27) {
				local43 = super.anInterface9_13.method952(0.7F, 128, 128, arg0);
			} else {
				local43 = super.anInterface9_13.method948(true, arg0, 128, 0.7F, 128);
			}
			this.xa(arg0, local22.aByte21, local22.aByte17, local22.aBoolean25, local22.aBoolean32, local22.aBoolean34, local22.aByte18, local22.aByte19, local22.aByte22, local22.aShort19, local22.anInt577, local22.aBoolean26, local22.aBoolean30, local43);
			return true;
		}
	}

	@OriginalMember(owner = "client!l", name = "Z", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void Z(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!l", name = "u", descriptor = "()Lclient!ho;")
	@Override
	public Class141 method6841() {
		return new Class141(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6847(@OriginalArg(0) Canvas arg0) {
		if (this.aTa1.aCanvas10 == arg0) {
			this.method6795(null);
		}
		@Pc(16) ta local16 = (ta) this.aClass91_21.method2271((long) arg0.hashCode());
		if (local16 != null) {
			local16.method7908();
			local16.method6765();
		}
	}

	@OriginalMember(owner = "client!l", name = "YA", descriptor = "(IIII)V")
	public native void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "MA", descriptor = "(III[I)V")
	public native void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!l", name = "AA", descriptor = "(III[I)V")
	public native void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class5 method6823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new t(this, this.aM1, arg0, arg1, arg2, arg3) : new va(this, this.aM1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V")
	@Override
	public void method6852(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([I)V")
	@Override
	public void method6822(@OriginalArg(0) int[] arg0) {
		@Pc(4) Dimension local4 = this.aTa1.aCanvas10.getSize();
		arg0[0] = local4.width;
		arg0[1] = local4.height;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
	@Override
	public void method6785(@OriginalArg(0) int arg0) {
		this.aQaArray1[arg0].method5882();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!dk;Z)V")
	private void method4282(@OriginalArg(0) Class64 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class11_Sub5_Sub1 local15 = (Class11_Sub5_Sub1) arg0.aClass102_1.method2420(); local15 != null; local15 = (Class11_Sub5_Sub1) arg0.aClass102_1.method2415()) {
			Static283.anIntArray300[local1++] = local15.anInt4083;
			Static283.anIntArray300[local1++] = local15.anInt4081;
			Static283.anIntArray300[local1++] = local15.anInt4077;
			Static283.anIntArray302[local3++] = local15.anInt4079;
			Static283.aShortArray42[local7++] = (short) local15.anInt4078;
			Static283.anIntArray301[local5++] = local15.anInt4075;
		}
	}

	@OriginalMember(owner = "client!l", name = "la", descriptor = "(IIII)V")
	public native void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "q", descriptor = "(Lclient!va;)V")
	private native void q(@OriginalArg(0) va arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!dk;)V")
	@Override
	public void method6796(@OriginalArg(0) Class64 arg0) {
		this.method4282(arg0);
		this.method4280().HA(this, Static283.anIntArray300, Static283.anIntArray302, Static283.anIntArray301, Static283.aShortArray42, arg0.aClass102_1.method2421());
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method6827(@OriginalArg(0) Class5 arg0) {
		if (arg0 instanceof va) {
			this.q((va) arg0);
		} else if (arg0 instanceof t) {
			this.ma((t) arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(IIIIII)Lclient!wn;")
	@Override
	public Class209 method6818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!l", name = "A", descriptor = "()Lclient!q;")
	@Override
	public Class34 method6848() {
		return this.aClass34_3;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!dk;I)V")
	@Override
	public void method6850(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1) {
		this.method4282(arg0);
		this.method4280().HA(this, Static283.anIntArray300, Static283.anIntArray302, Static283.anIntArray301, Static283.aShortArray42, arg0.aClass102_1.method2421());
	}

	@OriginalMember(owner = "client!l", name = "r", descriptor = "()Lclient!q;")
	@Override
	public Class34 method6833() {
		return new ra();
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "()I")
	public native int b();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class5 method6832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new t(this, this.aM1, arg0, arg1);
	}

	@OriginalMember(owner = "client!l", name = "NA", descriptor = "(Lclient!q;)V")
	private native void NA(@OriginalArg(0) Class34 arg0);

	@OriginalMember(owner = "client!l", name = "WA", descriptor = "()V")
	private void method4283() {
		System.gc();
		System.runFinalization();
		Static37.method672();
	}

	@OriginalMember(owner = "client!l", name = "h", descriptor = "(I)V")
	@Override
	public void method6849(@OriginalArg(0) int arg0) {
		this.aQaArray1[arg0].method5880();
	}

	@OriginalMember(owner = "client!l", name = "oa", descriptor = "([I)V")
	public native void oa(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class5 method6842(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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

	@OriginalMember(owner = "client!l", name = "ia", descriptor = "(Lclient!ta;)V")
	private native void ia(@OriginalArg(0) ta arg0);

	@OriginalMember(owner = "client!l", name = "EA", descriptor = "(Lclient!e;)V")
	private native void EA(@OriginalArg(0) Class1_Sub16 arg0);

	@OriginalMember(owner = "client!l", name = "y", descriptor = "()Z")
	@Override
	public boolean method6845() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "Q", descriptor = "(IIIIIILclient!ua;II)V")
	private native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class181 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class181 method6797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new za(this, this.aM1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(IIIII)V")
	protected native void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "GA", descriptor = "(II)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I[Lclient!tw;)V")
	@Override
	public void method6825(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub24[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static283.anIntArray303[local1++] = arg1[local3].method7609();
			Static283.anIntArray303[local1++] = arg1[local3].method7612();
			Static283.anIntArray303[local1++] = arg1[local3].method7608();
			Static283.anIntArray303[local1++] = arg1[local3].method7610();
			Static283.aFloatArray47[local3] = arg1[local3].method7615();
			Static283.anIntArray303[local1++] = arg1[local3].method7613();
		}
		this.I(arg0, Static283.anIntArray303, Static283.aFloatArray47);
	}

	@OriginalMember(owner = "client!l", name = "DA", descriptor = "()I")
	public native int DA();

	@OriginalMember(owner = "client!l", name = "f", descriptor = "(I)Lclient!e;")
	@Override
	public Class1_Sub16 method6829(@OriginalArg(0) int arg0) {
		@Pc(5) m local5 = new m(this, arg0);
		this.aClass111_24.method2552(local5);
		return local5;
	}

	@OriginalMember(owner = "client!l", name = "xa", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void xa(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V")
	@Override
	public void method6839(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!l", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!l", name = "t", descriptor = "()Z")
	@Override
	public boolean method6840() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.XA(arg0, arg1, arg2, arg4, arg5);
		this.XA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.m(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.m(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V")
	@Override
	public void method6793(@OriginalArg(0) int arg0) {
		this.anInt5220 = arg0;
		this.aQaArray1 = new qa[this.anInt5220];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5220; local9++) {
			this.aQaArray1[local9] = new qa(this, this.anInt5219, this.anInt5218);
		}
	}

	@OriginalMember(owner = "client!l", name = "C", descriptor = "()Z")
	@Override
	public boolean method6854() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "JA", descriptor = "()V")
	public native void JA();

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
	@Override
	public void method6799(@OriginalArg(0) int arg0) {
		Static37.method672();
		this.qa(arg0);
		for (@Pc(10) m local10 = (m) this.aClass111_24.method2547(); local10 != null; local10 = (m) this.aClass111_24.method2554()) {
			local10.Z();
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class129 method6791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new s(this, this.aM1, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "m", descriptor = "()V")
	@Override
	public void method6813() {
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6853(@OriginalArg(0) Canvas arg0) {
		@Pc(8) ta local8 = (ta) this.aClass91_21.method2271((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.AA(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aTa1.aCanvas10) {
			this.method6795(arg0);
		}
	}

	@OriginalMember(owner = "client!l", name = "R", descriptor = "()V")
	private native void R();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method6807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class181 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.Q(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!l", name = "da", descriptor = "(IIII)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "l", descriptor = "()Z")
	@Override
	public boolean method6810() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "ZA", descriptor = "(Z)V")
	public native void ZA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "()I")
	@Override
	public int method6777() {
		return 4;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6780(@OriginalArg(0) Canvas arg0) {
		@Pc(8) ta local8 = (ta) this.aClass91_21.method2271((long) arg0.hashCode());
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
		this.aClass91_21.method2269((long) arg0.hashCode(), local8);
	}

	@OriginalMember(owner = "client!l", name = "m", descriptor = "(IIIII)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
