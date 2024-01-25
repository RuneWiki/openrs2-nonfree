import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class h extends Class128 implements Interface4 {

	@OriginalMember(owner = "client!h", name = "r", descriptor = "Lclient!ba;")
	private ba aBa1;

	@OriginalMember(owner = "client!h", name = "F", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!h", name = "L", descriptor = "Lclient!la;")
	private la aLa1;

	@OriginalMember(owner = "client!h", name = "M", descriptor = "I")
	private int anInt2483;

	@OriginalMember(owner = "client!h", name = "O", descriptor = "[Lclient!ma;")
	private ma[] aMaArray1;

	@OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!h", name = "y", descriptor = "Lclient!vp;")
	private final Class254 aClass254_14 = new Class254();

	@OriginalMember(owner = "client!h", name = "C", descriptor = "I")
	private final int anInt2481 = 4096;

	@OriginalMember(owner = "client!h", name = "J", descriptor = "I")
	private final int anInt2482 = 4096;

	@OriginalMember(owner = "client!h", name = "B", descriptor = "Lclient!wa;")
	private final Class257 aClass257_11 = new Class257(4);

	@OriginalMember(owner = "client!h", name = "N", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!h", name = "D", descriptor = "Lclient!ia;")
	private final Class40 aClass40_4;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!m;Lclient!ji;)V")
	public h(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface8 arg2, @OriginalArg(3) Class124 arg3) {
		super(arg0, arg2);
		try {
			if (!Static147.aBoolean181) {
				if (arg3 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("sw3d");
					Static147.aBoolean181 = Boolean.TRUE;
				} else {
					arg3.method2524(this.getClass());
					Static147.aBoolean181 = Boolean.TRUE;
				}
			}
			if (!Static147.aBoolean181) {
				throw new RuntimeException("");
			}
			this.B(super.anInterface8_8, 0, 0);
			Static139.method1854(false, true);
			this.aBoolean182 = true;
			if (arg1 != null) {
				this.method3567(arg1);
				this.method3563(arg1);
			}
			this.aClass40_4 = new sa();
			this.m(new sa());
			this.method3550(1);
			this.method3592(0);
		} catch (@Pc(92) Throwable local92) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)I")
	@Override
	public int method3554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!h", name = "GA", descriptor = "(IIII)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "S", descriptor = "()V")
	public native void S();

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class49 method3564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new k(this, this.aBa1, arg0, arg1, arg2, arg3) : new n(this, this.aBa1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!h", name = "ba", descriptor = "(IIII)V")
	public native void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "XA", descriptor = "(IFFFFF)V")
	public native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!h", name = "ua", descriptor = "(F)V")
	public native void ua(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!h", name = "va", descriptor = "()V")
	public native void va();

	@OriginalMember(owner = "client!h", name = "r", descriptor = "()Z")
	@Override
	public boolean method3588() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!c;Lclient!po;Lclient!ia;Lclient!vk;I)V")
	@Override
	public void method3557(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) Class13_Sub8 arg3) {
		this.method2081(arg1, true);
		if (arg3 == null) {
			this.method2082().f(this, arg0, arg2, null, 0, Static147.anIntArray124, Static147.anIntArray125, Static147.anIntArray120, Static147.aShortArray38, Static147.aByteArray24, arg1.aClass46_1.method984(), Static147.anIntArray121);
		} else {
			Static147.anIntArray123[5] = 0;
			this.method2082().f(this, arg0, arg2, Static147.anIntArray123, 0, Static147.anIntArray124, Static147.anIntArray125, Static147.anIntArray120, Static147.aShortArray38, Static147.aByteArray24, arg1.aClass46_1.method984(), Static147.anIntArray121);
			arg3.anInt7180 = Static147.anIntArray123[0];
			arg3.anInt7181 = Static147.anIntArray123[1];
			arg3.anInt7179 = Static147.anIntArray123[2];
			arg3.anInt7177 = Static147.anIntArray123[3];
			arg3.anInt7178 = Static147.anIntArray123[4];
			arg3.aBoolean591 = Static147.anIntArray123[5] != 0;
		}
		@Pc(83) p local83 = (p) arg0;
		local83.method3930(0, arg2);
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(Z)V")
	@Override
	public void method3598(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!h", name = "I", descriptor = "()V")
	private native void I();

	@OriginalMember(owner = "client!h", name = "a", descriptor = "()V")
	@Override
	public void method3534() {
		@Pc(1) int local1 = 0;
		while (local1 < 9) {
			try {
				this.aLa1.SA();
				return;
			} catch (@Pc(7) Exception local7) {
				Static252.method2874(200L);
				local1++;
			}
		}
		this.aLa1.SA();
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(II)I")
	@Override
	public int method3605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!h", name = "SA", descriptor = "(IIIIII)Z")
	public native boolean SA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(IIIIII)Lclient!tl;")
	@Override
	public Class9 method3562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!h", name = "la", descriptor = "()F")
	public native float la();

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!l;)V")
	@Override
	public void method3601(@OriginalArg(0) Class1_Sub14 arg0) {
		this.aBa1 = (ba) arg0;
		this.Y(arg0);
	}

	@OriginalMember(owner = "client!h", name = "h", descriptor = "()V")
	@Override
	public void method3548() {
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIF)Lclient!kt;")
	@Override
	public Class1_Sub24 method3577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub24_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "v", descriptor = "()Z")
	@Override
	public boolean method3597() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!h", name = "d", descriptor = "()I")
	public native int d();

	@OriginalMember(owner = "client!h", name = "f", descriptor = "()Z")
	@Override
	public boolean method3545() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method3567(@OriginalArg(0) Canvas arg0) {
		@Pc(8) la local8 = (la) this.aClass257_11.method5503((long) arg0.hashCode());
		if (local8 != null) {
			return;
		}
		try {
			@Pc(13) Class local13 = Class.forName("java.awt.Canvas");
			@Pc(23) Method local23 = local13.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local23.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(35) Exception local35) {
		}
		local8 = new la(this, arg0);
		this.aClass257_11.method5504(local8, (long) arg0.hashCode());
	}

	@OriginalMember(owner = "client!h", name = "o", descriptor = "(FF)V")
	public native void o(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!h", name = "B", descriptor = "()Z")
	@Override
	public boolean method3608() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "m", descriptor = "(Lclient!ia;)V")
	public native void m(@OriginalArg(0) Class40 arg0);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!po;Z)V")
	private void method2081(@OriginalArg(0) Class194 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class13_Sub1_Sub1 local15 = (Class13_Sub1_Sub1) arg0.aClass46_1.method986(); local15 != null; local15 = (Class13_Sub1_Sub1) arg0.aClass46_1.method985()) {
			Static147.anIntArray124[local1++] = local15.anInt3243;
			Static147.anIntArray124[local1++] = local15.anInt3236;
			Static147.anIntArray124[local1++] = local15.anInt3237;
			Static147.anIntArray125[local3++] = local15.anInt3241;
			Static147.aShortArray38[local7++] = (short) local15.anInt3239;
			Static147.anIntArray120[local5++] = local15.anInt3238;
			if (arg1) {
				Static147.aByteArray24[local9++] = local15.aByte33;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "E", descriptor = "()Lclient!ma;")
	public ma method2082() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2483; local1++) {
			if (this.aMaArray1[local1].aRunnable1 == Thread.currentThread()) {
				return this.aMaArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!h", name = "j", descriptor = "(ILclient!ea;II)V")
	public native void j(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "u", descriptor = "()Z")
	@Override
	public boolean method3595() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V")
	@Override
	public void method3606(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method3574(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(4) int local4;
		@Pc(9) Rectangle local9;
		while (local1 < 9) {
			try {
				for (local4 = 0; local4 < arg1; local4++) {
					local9 = arg0[local4];
					if (local9.width > 0 && local9.height > 0) {
						this.aLa1.xa(local9.x, local9.y, local9.width, local9.height);
					}
				}
				return;
			} catch (@Pc(32) Exception local32) {
				Static252.method2874(200L);
				local1++;
			}
		}
		for (local4 = 0; local4 < arg1; local4++) {
			local9 = arg0[local4];
			if (local9.width > 0 && local9.height > 0) {
				this.aLa1.xa(local9.x, local9.y, local9.width, local9.height);
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "w", descriptor = "()F")
	public native float w();

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
	@Override
	public void method3544(@OriginalArg(0) int arg0) {
		Static198.method2617();
		this.ja(arg0);
		for (@Pc(10) ba local10 = (ba) this.aClass254_14.method5437(); local10 != null; local10 = (ba) this.aClass254_14.method5433()) {
			local10.KA();
		}
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void f(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
	@Override
	public void method3590(@OriginalArg(0) int arg0) {
		this.aMaArray1[arg0].method3134();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!gu;Z)Lclient!f;")
	@Override
	public Class49 method3540(@OriginalArg(0) Class100 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray118;
		@Pc(5) byte[] local5 = arg0.aByteArray22;
		@Pc(8) int local8 = arg0.anInt2451;
		@Pc(11) int local11 = arg0.anInt2454;
		@Pc(32) Class49 local32;
		if (arg0.aByteArray23 == null) {
			local32 = new xa(this, this.aBa1, local2, local5, 0, arg0.anInt2451, arg0.anInt2451, arg0.anInt2454);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray23;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray118[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new k(this, this.aBa1, local40, 0, arg0.anInt2451, arg0.anInt2451, arg0.anInt2454);
				} else {
					local32 = new n(this, this.aBa1, local40, 0, arg0.anInt2451, arg0.anInt2451, arg0.anInt2454);
				}
			} else {
				for (@Pc(47) int local47 = 0; local47 < local11; local47++) {
					local52 = local47 * local8;
					for (local54 = 0; local54 < local8; local54++) {
						local40[local52 + local54] = local2[local5[local52 + local54] & 0xFF] | local43[local52 + local54] << 24;
					}
				}
				local32 = new k(this, this.aBa1, local40, 0, local8, local8, local11);
			}
		}
		local32.ka(arg0.anInt2452, arg0.anInt2449, arg0.anInt2453, arg0.anInt2450);
		return local32;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I[Lclient!kt;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub24[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static147.anIntArray122[local1++] = arg1[local3].method4367();
			Static147.anIntArray122[local1++] = arg1[local3].method4376();
			Static147.anIntArray122[local1++] = arg1[local3].method4369();
			Static147.anIntArray122[local1++] = arg1[local3].method4374();
			Static147.aFloatArray15[local3] = arg1[local3].method4371();
			Static147.anIntArray122[local1++] = arg1[local3].method4373();
		}
		this.VA(arg0, Static147.anIntArray122, Static147.aFloatArray15);
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "()V")
	@Override
	public void method3542() {
	}

	@OriginalMember(owner = "client!h", name = "W", descriptor = "()I")
	public native int W();

	@OriginalMember(owner = "client!h", name = "l", descriptor = "()Z")
	@Override
	public boolean method3570() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "Z", descriptor = "(IIII)V")
	public native void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II[I[I)Lclient!ea;")
	@Override
	public Class59 method3585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new ca(this, this.aBa1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([Lclient!c;Lclient!ia;[Lclient!vk;I)V")
	@Override
	public void method3541(@OriginalArg(0) Class33[] arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) Class13_Sub8[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method2082().za(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class13_Sub8 local15 = arg2[0];
		Static147.anIntArray123[5] = 0;
		this.method2082().za(this, arg0, arg1, Static147.anIntArray123, -1, arg3);
		local15.anInt7180 = Static147.anIntArray123[0];
		local15.anInt7181 = Static147.anIntArray123[1];
		local15.anInt7179 = Static147.anIntArray123[2];
		local15.anInt7177 = Static147.anIntArray123[3];
		local15.anInt7178 = Static147.anIntArray123[4];
		local15.aBoolean591 = Static147.anIntArray123[5] != 0;
	}

	@OriginalMember(owner = "client!h", name = "VA", descriptor = "(I[I[F)V")
	private native void VA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V")
	@Override
	public void method3566(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!h", name = "da", descriptor = "(IIIII)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!h", name = "u", descriptor = "([I)V")
	public native void u(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!h", name = "Y", descriptor = "(Lclient!l;)V")
	private native void Y(@OriginalArg(0) Class1_Sub14 arg0);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method3591() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!h", name = "pa", descriptor = "(IIII)V")
	public native void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "ZA", descriptor = "()V")
	private void method2083() {
		System.gc();
		System.runFinalization();
		Static198.method2617();
	}

	@OriginalMember(owner = "client!h", name = "ta", descriptor = "(IIIIIILclient!ea;II)V")
	private native void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class59 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!h", name = "K", descriptor = "(IIIIII)V")
	private native void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!tl;)V")
	@Override
	public void method3576(@OriginalArg(0) Class9 arg0) {
	}

	@OriginalMember(owner = "client!h", name = "O", descriptor = "(IIIII)V")
	protected native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!h", name = "na", descriptor = "(I)V")
	public native void na(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!h", name = "FA", descriptor = "()I")
	public native int FA();

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!je;[Lclient!gu;Z)Lclient!oa;")
	@Override
	public Class16 method3575(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class100[] arg1) {
		return new w(this, this.aBa1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!h", name = "y", descriptor = "()Z")
	@Override
	public boolean method3603() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "()I")
	public native int g();

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!qc;IIII)Lclient!c;")
	@Override
	public Class33 method3602(@OriginalArg(0) Class199 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new p(this, this.aBa1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!h", name = "x", descriptor = "()Lclient!ia;")
	@Override
	public Class40 method3600() {
		return this.aClass40_4;
	}

	@OriginalMember(owner = "client!h", name = "q", descriptor = "()V")
	@Override
	protected void method3586() {
		for (@Pc(5) ba local5 = (ba) this.aClass254_14.method5437(); local5 != null; local5 = (ba) this.aClass254_14.method5433()) {
			local5.ka();
		}
		this.aClass254_14.method5438();
		this.I();
		if (this.aBoolean182) {
			Static366.method4763(false, true);
			this.aBoolean182 = false;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!tl;Lclient!tl;FLclient!tl;)Lclient!tl;")
	@Override
	public Class9 method3579(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class9 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!h", name = "MA", descriptor = "(S)Z")
	private boolean method2084(@OriginalArg(0) short arg0) {
		@Pc(2) Interface8 local2 = super.anInterface8_8;
		synchronized (super.anInterface8_8) {
			if (!super.anInterface8_8.method1376(arg0)) {
				return false;
			}
			@Pc(22) Class201 local22 = super.anInterface8_8.method1375(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(46) int[] local46;
			if (local22.aBoolean432 && local22.aBoolean433) {
				local46 = super.anInterface8_8.method1374(128, true, 128, 0.7F, arg0);
			} else {
				local46 = super.anInterface8_8.method1373(128, 128, arg0, 0.7F);
			}
			this.f(arg0, local22.aByte65, local22.aByte63, local22.aBoolean433, local22.aBoolean432, local22.aBoolean435, local22.aByte60, local22.aByte59, local22.aByte61, local22.aShort61, local22.anInt5367, local22.aBoolean428, local22.aBoolean434, local46);
			return true;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class49 method3572(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new k(this, this.aBa1, arg0, 0, arg1, arg2, arg3) : new n(this, this.aBa1, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new k(this, this.aBa1, arg0, 0, arg1, arg2, arg3) : new n(this, this.aBa1, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(FFF)V")
	@Override
	public void method3547(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
	@Override
	public void method3555(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!h", name = "j", descriptor = "()I")
	@Override
	public int method3558() {
		return 4;
	}

	@OriginalMember(owner = "client!h", name = "o", descriptor = "()V")
	@Override
	public void method3582() {
	}

	@OriginalMember(owner = "client!h", name = "A", descriptor = "()Ljava/lang/Object;")
	private Object method2085() {
		return new ka();
	}

	@OriginalMember(owner = "client!h", name = "i", descriptor = "()V")
	@Override
	public void method3556() {
	}

	@OriginalMember(owner = "client!h", name = "aa", descriptor = "(IIIIII[BII)V")
	public native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!h", name = "t", descriptor = "()Z")
	@Override
	public boolean method3594() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method3578(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas4 == arg0) {
			this.method3563(null);
		}
		@Pc(15) la local15 = (la) this.aClass257_11.method5503((long) arg0.hashCode());
		if (local15 != null) {
			local15.method5617();
		}
		local15.method2922();
	}

	@OriginalMember(owner = "client!h", name = "NA", descriptor = "(IIIIII)V")
	public native void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method3593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.da(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.da(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method3563(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas4 = null;
			this.aLa1 = null;
			this.P(null);
		} else {
			@Pc(10) la local10 = (la) this.aClass257_11.method5503((long) arg0.hashCode());
			this.aCanvas4 = arg0;
			this.aLa1 = local10;
			this.P(local10);
		}
	}

	@OriginalMember(owner = "client!h", name = "ia", descriptor = "(III[I)V")
	public native void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method3553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2082().sa(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!h", name = "p", descriptor = "()Z")
	@Override
	public boolean method3584() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "P", descriptor = "(Lclient!la;)V")
	private native void P(@OriginalArg(0) la arg0);

	@OriginalMember(owner = "client!h", name = "b", descriptor = "()V")
	@Override
	public void method3535() {
	}

	@OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.ya();
	}

	@OriginalMember(owner = "client!h", name = "V", descriptor = "(III)V")
	public native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!h", name = "z", descriptor = "()Z")
	@Override
	public boolean method3604() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)V")
	@Override
	public void method3543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!po;)V")
	@Override
	public void method3587(@OriginalArg(0) Class194 arg0) {
		this.method2081(arg0, false);
		this.method2082().S(this, Static147.anIntArray124, Static147.anIntArray125, Static147.anIntArray120, Static147.aShortArray38, arg0.aClass46_1.method984());
	}

	@OriginalMember(owner = "client!h", name = "m", descriptor = "()Z")
	@Override
	public boolean method3573() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)Lclient!l;")
	@Override
	public Class1_Sub14 method3538() {
		@Pc(5) ba local5 = new ba(this, 78643200);
		this.aClass254_14.method5430(local5);
		return local5;
	}

	@OriginalMember(owner = "client!h", name = "B", descriptor = "(Lclient!m;II)V")
	private native void B(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!h", name = "k", descriptor = "()Z")
	@Override
	public boolean method3569() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "M", descriptor = "(I)V")
	public native void M(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!h", name = "xa", descriptor = "()I")
	public native int xa();

	@OriginalMember(owner = "client!h", name = "ja", descriptor = "(I)V")
	private native void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
	@Override
	public void method3550(@OriginalArg(0) int arg0) {
		this.anInt2483 = arg0;
		this.aMaArray1 = new ma[this.anInt2483];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2483; local9++) {
			this.aMaArray1[local9] = new ma(this, this.anInt2482, this.anInt2481);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([Lclient!c;Lclient!po;Lclient!ia;[Lclient!vk;I)V")
	@Override
	public void method3546(@OriginalArg(0) Class33[] arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) Class13_Sub8[] arg3, @OriginalArg(4) int arg4) {
		this.method2081(arg1, true);
		if (arg3 == null) {
			this.method2082().pa(this, arg0, arg2, null, arg4, Static147.anIntArray124, Static147.anIntArray125, Static147.anIntArray120, Static147.aShortArray38, Static147.aByteArray24, arg1.aClass46_1.method984(), Static147.anIntArray121);
		} else {
			@Pc(28) Class13_Sub8 local28 = arg3[0];
			Static147.anIntArray123[5] = 0;
			this.method2082().pa(this, arg0, arg2, Static147.anIntArray123, arg4, Static147.anIntArray124, Static147.anIntArray125, Static147.anIntArray120, Static147.aShortArray38, Static147.aByteArray24, arg1.aClass46_1.method984(), Static147.anIntArray121);
			local28.anInt7180 = Static147.anIntArray123[0];
			local28.anInt7181 = Static147.anIntArray123[1];
			local28.anInt7179 = Static147.anIntArray123[2];
			local28.anInt7177 = Static147.anIntArray123[3];
			local28.anInt7178 = Static147.anIntArray123[4];
			local28.aBoolean591 = Static147.anIntArray123[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) p local98 = (p) arg0[local88];
				local98.method3930(local86, arg2);
				if (local98.aClass239Array1 != null) {
					local86 += local98.aClass239Array1.length * 9;
				}
				if (local98.aClass15Array1 != null) {
					local86 += local98.aClass15Array1.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "()Z")
	@Override
	public boolean method3536() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method3549(@OriginalArg(0) Canvas arg0) {
		@Pc(8) la local8 = (la) this.aClass257_11.method5503((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.ZA(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aCanvas4) {
			this.method3563(arg0);
		}
	}

	@OriginalMember(owner = "client!h", name = "U", descriptor = "(IIIII)V")
	public native void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!h", name = "fa", descriptor = "(IIII)V")
	public native void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "C", descriptor = "()Lclient!ia;")
	@Override
	public Class40 method3609() {
		return new sa();
	}

	@OriginalMember(owner = "client!h", name = "IA", descriptor = "(IIII)[I")
	public native int[] IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II[[I[[IIII)Lclient!na;")
	@Override
	public Class163 method3560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new b(this, this.aBa1, arg0, arg1, arg2, arg3, 128, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "JA", descriptor = "(II)V")
	public native void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!h", name = "n", descriptor = "()Z")
	@Override
	public boolean method3581() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "EA", descriptor = "(S)Z")
	private boolean method2086(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class201 local9 = super.anInterface8_8.method1375(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.l(arg0, local9.aByte65, local9.aByte63, local9.aBoolean433, local9.aBoolean432, local9.aBoolean435, local9.aByte60, local9.aByte59, local9.aByte61, local9.aShort61, local9.anInt5367, local9.aBoolean428, local9.aBoolean434);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "s", descriptor = "()Z")
	@Override
	public boolean method3589() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method3599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.K(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
	@Override
	public void method3592(@OriginalArg(0) int arg0) {
		this.aMaArray1[arg0].method3135();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIILclient!ea;II)V")
	@Override
	public void method3559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class59 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.ta(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!h", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void l(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);
}
