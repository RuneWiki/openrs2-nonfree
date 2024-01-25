import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class l extends Class43 implements Interface18 {

	@OriginalMember(owner = "client!l", name = "v", descriptor = "Lclient!m;")
	private m aM1;

	@OriginalMember(owner = "client!l", name = "D", descriptor = "Lclient!q;")
	private Class109 aClass109_2;

	@OriginalMember(owner = "client!l", name = "M", descriptor = "Lclient!ta;")
	private ta aTa1;

	@OriginalMember(owner = "client!l", name = "N", descriptor = "I")
	public int anInt5303;

	@OriginalMember(owner = "client!l", name = "O", descriptor = "[Lclient!qa;")
	private qa[] aQaArray1;

	@OriginalMember(owner = "client!l", name = "u", descriptor = "Z")
	private boolean aBoolean422 = false;

	@OriginalMember(owner = "client!l", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!l", name = "t", descriptor = "Lclient!hga;")
	private final Class130 aClass130_36 = new Class130();

	@OriginalMember(owner = "client!l", name = "J", descriptor = "I")
	private final int anInt5302 = 4096;

	@OriginalMember(owner = "client!l", name = "E", descriptor = "I")
	private final int anInt5301 = 4096;

	@OriginalMember(owner = "client!l", name = "K", descriptor = "Lclient!sl;")
	private final Class310 aClass310_21 = new Class310(4);

	@OriginalMember(owner = "client!l", name = "P", descriptor = "Z")
	private boolean aBoolean423 = false;

	@OriginalMember(owner = "client!l", name = "L", descriptor = "Lclient!q;")
	private Class109 aClass109_3;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;)V")
	public l(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface8 arg1) {
		super(arg1);
		try {
			if (!Static557.method7419("sw3d")) {
				throw new RuntimeException("");
			}
			Static401.method5836();
			this.OA(super.anInterface8_12, 0, 0);
			Static497.method6706(false, true);
			this.aBoolean423 = true;
			this.aClass109_3 = new ra();
			this.method7187(new ra());
			this.method7157(1);
			this.method7141(0);
			if (arg0 != null) {
				this.method7199(arg0);
				this.method7163(arg0);
			}
		} catch (@Pc(78) Throwable local78) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!l", name = "I", descriptor = "(I[I[F)V")
	private native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
	@Override
	public void method7157(@OriginalArg(0) int arg0) {
		this.anInt5303 = arg0;
		this.aQaArray1 = new qa[this.anInt5303];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5303; local9++) {
			this.aQaArray1[local9] = new qa(this, this.anInt5302, this.anInt5301);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!fi;Z)V")
	private void method4629(@OriginalArg(0) Class96 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class9_Sub8_Sub2 local15 = (Class9_Sub8_Sub2) arg0.aClass269_1.method6013(); local15 != null; local15 = (Class9_Sub8_Sub2) arg0.aClass269_1.method6019()) {
			Static289.anIntArray401[local1++] = local15.anInt6176;
			Static289.anIntArray401[local1++] = local15.anInt6177;
			Static289.anIntArray401[local1++] = local15.anInt6180;
			Static289.anIntArray400[local3++] = local15.anInt6178;
			Static289.aShortArray140[local7++] = (short) local15.anInt6182;
			Static289.anIntArray396[local5++] = local15.anInt6181;
		}
	}

	@OriginalMember(owner = "client!l", name = "u", descriptor = "()Lclient!mp;")
	@Override
	public Class216 method7186() {
		return new Class216(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!l", name = "A", descriptor = "()Z")
	@Override
	public boolean method7211() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class46 method7198(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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

	@OriginalMember(owner = "client!l", name = "ra", descriptor = "(F)V")
	public native void ra(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!l", name = "FA", descriptor = "(ILclient!ua;II)V")
	public native void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "CA", descriptor = "(IIII)V")
	public native void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "L", descriptor = "()V")
	public native void L();

	@OriginalMember(owner = "client!l", name = "pa", descriptor = "(III)V")
	public native void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!l", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!l", name = "EA", descriptor = "(Lclient!e;)V")
	private native void EA(@OriginalArg(0) Class3_Sub16 arg0);

	@OriginalMember(owner = "client!l", name = "JA", descriptor = "()V")
	public native void JA();

	@OriginalMember(owner = "client!l", name = "v", descriptor = "()[I")
	public native int[] v();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class109 method7140() {
		return this.aClass109_2;
	}

	@OriginalMember(owner = "client!l", name = "p", descriptor = "()V")
	@Override
	public void method7171() {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method7190(@OriginalArg(0) Class46 arg0) {
		if (arg0 instanceof va) {
			this.q((va) arg0);
		} else if (arg0 instanceof t) {
			this.ma((t) arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.w(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V")
	@Override
	public void method7206(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!l", name = "R", descriptor = "()V")
	private native void R();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I[Lclient!ff;)V")
	@Override
	public void method7149(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static289.anIntArray398[local1++] = arg1[local3].method6731();
			Static289.anIntArray398[local1++] = arg1[local3].method6728();
			Static289.anIntArray398[local1++] = arg1[local3].method6725();
			Static289.anIntArray398[local1++] = arg1[local3].method6729();
			Static289.aFloatArray39[local3] = arg1[local3].method6732();
			Static289.anIntArray398[local1++] = arg1[local3].method6724();
		}
		this.I(arg0, Static289.anIntArray398, Static289.aFloatArray39);
	}

	@OriginalMember(owner = "client!l", name = "f", descriptor = "()Z")
	@Override
	public boolean method7150() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "B", descriptor = "()Z")
	@Override
	public boolean method7216() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "w", descriptor = "(IIIIII)V")
	private native void w(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "m", descriptor = "(IIIII)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "h", descriptor = "()Z")
	@Override
	public boolean method7153() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7163(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aTa1 = null;
			this.ia(null);
		} else {
			@Pc(10) ta local10 = (ta) this.aClass310_21.method6601((long) arg0.hashCode());
			this.aTa1 = local10;
			this.ia(local10);
		}
	}

	@OriginalMember(owner = "client!l", name = "D", descriptor = "()Lclient!qa;")
	public qa method4630() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5303; local1++) {
			if (this.aQaArray1[local1].aRunnable2 == Thread.currentThread()) {
				return this.aQaArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!l", name = "j", descriptor = "()I")
	@Override
	public int method7159() {
		return 4;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "()I")
	public native int b();

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V")
	@Override
	public void method7182(@OriginalArg(0) int arg0) {
		this.aQaArray1[arg0].method6008();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!js;Lclient!js;FLclient!js;)Lclient!js;")
	@Override
	public Class55 method7167(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class55 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4630().G(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!l", name = "i", descriptor = "()V")
	@Override
	public void method7154() {
	}

	@OriginalMember(owner = "client!l", name = "AA", descriptor = "(III[I)V")
	public native void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
	@Override
	public void method7191(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!l", name = "qa", descriptor = "(I)V")
	private native void qa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!daa;[Lclient!vw;Z)Lclient!la;")
	@Override
	public Class117 method7139(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class355[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt9165;
			local7[local11] = arg1[local11].anInt9162;
			if (arg1[local11].aByteArray105 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new c(this, this.aM1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!l", name = "ia", descriptor = "(Lclient!ta;)V")
	private native void ia(@OriginalArg(0) ta arg0);

	@OriginalMember(owner = "client!l", name = "GA", descriptor = "(II)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!l", name = "O", descriptor = "(IIIIII)Z")
	public native boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I")
	@Override
	public int method7169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!l", name = "f", descriptor = "(IIIIII)Lclient!js;")
	@Override
	public Class55 method7208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!l", name = "IA", descriptor = "(IIIIII[BII)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!l", name = "YA", descriptor = "(IIII)V")
	public native void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method7201(@OriginalArg(0) Class3_Sub16 arg0) {
		this.aM1 = (m) arg0;
		this.EA(arg0);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!nda;IIII)Lclient!da;")
	@Override
	public Class57 method7178(@OriginalArg(0) Class226 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new v(this, this.aM1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!l", name = "g", descriptor = "()V")
	@Override
	public void method7152() {
		this.method7163(this.aTa1.aCanvas10);
	}

	@OriginalMember(owner = "client!l", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!l", name = "l", descriptor = "()Z")
	@Override
	public boolean method7161() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "W", descriptor = "(S)Z")
	private boolean method4631(@OriginalArg(0) short arg0) {
		@Pc(2) Interface8 local2 = super.anInterface8_12;
		synchronized (super.anInterface8_12) {
			if (!super.anInterface8_12.method6559(arg0)) {
				return false;
			}
			@Pc(22) Class224 local22 = super.anInterface8_12.method6560(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(43) int[] local43;
			if (local22.aBoolean492) {
				local43 = super.anInterface8_12.method6556(arg0, 128, 0.7F, 128);
			} else {
				local43 = super.anInterface8_12.method6555(arg0, true, 0.7F, 128, 128);
			}
			this.xa(arg0, local22.aByte73, local22.aByte71, local22.aBoolean494, local22.aBoolean493, local22.aBoolean491, local22.aByte75, local22.aByte70, local22.aByte69, local22.aShort76, local22.anInt6094, local22.aBoolean495, local22.aBoolean489, local43);
			return true;
		}
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method7170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.XA(arg0, arg1, arg2, arg4, arg5);
		this.XA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.m(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.m(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "MA", descriptor = "(III[I)V")
	public native void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
	@Override
	public void method7195(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "()Z")
	@Override
	public boolean method7146() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class46 method7184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new t(this, this.aM1, arg0, arg1, arg2, arg3) : new va(this, this.aM1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!l", name = "V", descriptor = "(IIII)V")
	public native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!vw;Z)Lclient!f;")
	@Override
	public Class46 method7205(@OriginalArg(0) Class355 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray677;
		@Pc(5) byte[] local5 = arg0.aByteArray104;
		@Pc(8) int local8 = arg0.anInt9165;
		@Pc(11) int local11 = arg0.anInt9162;
		@Pc(32) Class46 local32;
		if (arg1 && arg0.aByteArray105 == null) {
			local32 = new w(this, this.aM1, local2, local5, 0, arg0.anInt9165, arg0.anInt9165, arg0.anInt9162);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray105;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray677[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new t(this, this.aM1, local40, 0, arg0.anInt9165, arg0.anInt9165, arg0.anInt9162);
				} else {
					local32 = new va(this, this.aM1, local40, 0, arg0.anInt9165, arg0.anInt9165, arg0.anInt9162);
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
		local32.Q(arg0.anInt9161, arg0.anInt9163, arg0.anInt9164, arg0.anInt9166);
		return local32;
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "()Z")
	@Override
	public boolean method7147() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIF)Lclient!ff;")
	@Override
	public Class3_Sub22 method7164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub22_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class46 method7143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new t(this, this.aM1, arg0, arg1);
	}

	@OriginalMember(owner = "client!l", name = "q", descriptor = "()Z")
	@Override
	public boolean method7172() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V")
	@Override
	public void method7215(@OriginalArg(0) int arg0) {
		Static401.method5838();
		this.qa(arg0);
		for (@Pc(10) m local10 = (m) this.aClass130_36.method3543(); local10 != null; local10 = (m) this.aClass130_36.method3551()) {
			local10.Z();
		}
	}

	@OriginalMember(owner = "client!l", name = "r", descriptor = "()Z")
	@Override
	public boolean method7173() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(II)I")
	@Override
	public int method7203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!l", name = "va", descriptor = "(I)V")
	public native void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "x", descriptor = "()V")
	@Override
	public void method7197() throws Exception_Sub1 {
		if (this.aTa1 == null) {
			throw new IllegalStateException("off");
		}
		this.aTa1.method6703();
	}

	@OriginalMember(owner = "client!l", name = "k", descriptor = "()Lclient!q;")
	@Override
	public Class109 method7160() {
		return new ra();
	}

	@OriginalMember(owner = "client!l", name = "ja", descriptor = "(I)V")
	public native void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "DA", descriptor = "()I")
	public native int DA();

	@OriginalMember(owner = "client!l", name = "VA", descriptor = "(IFFFFF)V")
	public native void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!l", name = "fa", descriptor = "()Ljava/lang/Object;")
	private Object method4632() {
		return new h(this);
	}

	@OriginalMember(owner = "client!l", name = "OA", descriptor = "(Lclient!fa;II)V")
	private native void OA(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!l", name = "A", descriptor = "(S)Z")
	private boolean method4633(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class224 local9 = super.anInterface8_12.method6560(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.Z(arg0, local9.aByte73, local9.aByte71, local9.aBoolean494, local9.aBoolean493, local9.aBoolean491, local9.aByte75, local9.aByte70, local9.aByte69, local9.aShort76, local9.anInt6094, local9.aBoolean495, local9.aBoolean489);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "xa", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void xa(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!l", name = "q", descriptor = "(Lclient!va;)V")
	private native void q(@OriginalArg(0) va arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!js;)V")
	@Override
	public void method7148(@OriginalArg(0) Class55 arg0) {
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(IIIII)V")
	protected native void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "la", descriptor = "(IIII)V")
	public native void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7194() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7209(@OriginalArg(0) Canvas arg0) {
		@Pc(8) ta local8 = (ta) this.aClass310_21.method6601((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.AA(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aTa1.aCanvas10) {
			this.method7163(arg0);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	@Override
	public void method7141(@OriginalArg(0) int arg0) {
		this.aQaArray1[arg0].method6009();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7144(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method7179();
		if (this.nativeid != 0L) {
			Static401.method5840(this);
		}
	}

	@OriginalMember(owner = "client!l", name = "BA", descriptor = "()I")
	public native int BA();

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7183(@OriginalArg(0) Canvas arg0) {
		if (this.aTa1.aCanvas10 == arg0) {
			this.method7163(null);
		}
		@Pc(16) ta local16 = (ta) this.aClass310_21.method6601((long) arg0.hashCode());
		if (local16 != null) {
			local16.method7812();
			local16.method6705();
		}
	}

	@OriginalMember(owner = "client!l", name = "f", descriptor = "(I)Lclient!e;")
	@Override
	public Class3_Sub16 method7193(@OriginalArg(0) int arg0) {
		@Pc(5) m local5 = new m(this, arg0);
		this.aClass130_36.method3548(local5);
		return local5;
	}

	@OriginalMember(owner = "client!l", name = "ma", descriptor = "(Lclient!t;)V")
	private native void ma(@OriginalArg(0) t arg0);

	@OriginalMember(owner = "client!l", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!l", name = "J", descriptor = "(IIIIII)V")
	public native void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "w", descriptor = "()Z")
	@Override
	public boolean method7192() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "t", descriptor = "()Z")
	@Override
	public boolean method7180() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "n", descriptor = "()V")
	@Override
	protected void method7165() {
		if (this.aBoolean422) {
			return;
		}
		this.aQaArray1 = null;
		this.aTa1 = null;
		this.aM1 = null;
		this.aClass109_3 = null;
		this.aClass310_21.method6605();
		for (@Pc(25) m local25 = (m) this.aClass130_36.method3543(); local25 != null; local25 = (m) this.aClass130_36.method3551()) {
			local25.D();
		}
		this.aClass130_36.method3541();
		this.R();
		if (this.aBoolean423) {
			Static216.method3777(true, false);
			this.aBoolean423 = false;
		}
		this.method4634();
		Static401.method5837();
		this.aBoolean422 = true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7207(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aTa1 == null) {
			throw new IllegalStateException("off");
		}
		this.aTa1.method6704(arg0, arg1);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([I)V")
	@Override
	public void method7158(@OriginalArg(0) int[] arg0) {
		@Pc(4) Dimension local4 = this.aTa1.aCanvas10.getSize();
		arg0[0] = local4.width;
		arg0[1] = local4.height;
	}

	@OriginalMember(owner = "client!l", name = "WA", descriptor = "()V")
	private void method4634() {
		System.gc();
		System.runFinalization();
		Static401.method5838();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method7156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class146 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.Q(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!l", name = "y", descriptor = "()V")
	@Override
	public void method7202() {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7187(@OriginalArg(0) Class109 arg0) {
		this.aClass109_2 = arg0;
		this.NA(arg0);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class146 method7168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new za(this, this.aM1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!l", name = "Q", descriptor = "(IIIIIILclient!ua;II)V")
	private native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class146 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!l", name = "m", descriptor = "()Z")
	@Override
	public boolean method7162() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!fi;I)V")
	@Override
	public void method7176(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1) {
		this.method4629(arg0);
		this.method4630().HA(this, Static289.anIntArray401, Static289.anIntArray400, Static289.anIntArray396, Static289.aShortArray140, arg0.aClass269_1.method6016());
	}

	@OriginalMember(owner = "client!l", name = "o", descriptor = "()Z")
	@Override
	public boolean method7166() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!fi;)V")
	@Override
	public void method7189(@OriginalArg(0) Class96 arg0) {
		this.method4629(arg0);
		this.method4630().HA(this, Static289.anIntArray401, Static289.anIntArray400, Static289.anIntArray396, Static289.aShortArray140, arg0.aClass269_1.method6016());
	}

	@OriginalMember(owner = "client!l", name = "XA", descriptor = "(IIIII)V")
	public native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "da", descriptor = "(IIII)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class139 method7210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new s(this, this.aM1, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "T", descriptor = "()I")
	public native int T();

	@OriginalMember(owner = "client!l", name = "NA", descriptor = "(Lclient!q;)V")
	private native void NA(@OriginalArg(0) Class109 arg0);

	@OriginalMember(owner = "client!l", name = "oa", descriptor = "([I)V")
	public native void oa(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!l", name = "h", descriptor = "(IIII)[I")
	public native int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "ZA", descriptor = "(Z)V")
	public native void ZA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!l", name = "c", descriptor = "()Lclient!q;")
	@Override
	public Class109 method7142() {
		return this.aClass109_3;
	}

	@OriginalMember(owner = "client!l", name = "C", descriptor = "()Z")
	@Override
	public boolean method7217() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7199(@OriginalArg(0) Canvas arg0) {
		@Pc(8) ta local8 = (ta) this.aClass310_21.method6601((long) arg0.hashCode());
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
		this.aClass310_21.method6603(local8, (long) arg0.hashCode());
	}

	@OriginalMember(owner = "client!l", name = "z", descriptor = "()V")
	@Override
	public void method7204() {
	}

	@OriginalMember(owner = "client!l", name = "s", descriptor = "()V")
	@Override
	public void method7177() {
	}

	@OriginalMember(owner = "client!l", name = "Z", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void Z(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);
}
