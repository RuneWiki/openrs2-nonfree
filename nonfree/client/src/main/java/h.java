import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class h extends Class172 implements Interface2 {

	@OriginalMember(owner = "client!h", name = "v", descriptor = "Lclient!ba;")
	private ba aBa1;

	@OriginalMember(owner = "client!h", name = "I", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!h", name = "M", descriptor = "Lclient!la;")
	private la aLa1;

	@OriginalMember(owner = "client!h", name = "P", descriptor = "[Lclient!ma;")
	private ma[] aMaArray1;

	@OriginalMember(owner = "client!h", name = "Q", descriptor = "I")
	private int anInt2958;

	@OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!h", name = "t", descriptor = "Lclient!ug;")
	private final Class243 aClass243_18 = new Class243();

	@OriginalMember(owner = "client!h", name = "J", descriptor = "I")
	private final int anInt2956 = 4096;

	@OriginalMember(owner = "client!h", name = "K", descriptor = "I")
	private final int anInt2957 = 4096;

	@OriginalMember(owner = "client!h", name = "N", descriptor = "Lclient!an;")
	private final Class11 aClass11_17 = new Class11(4);

	@OriginalMember(owner = "client!h", name = "O", descriptor = "Z")
	private boolean aBoolean269 = false;

	@OriginalMember(owner = "client!h", name = "L", descriptor = "Lclient!ia;")
	private final Class107 aClass107_2;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!m;Lclient!li;)V")
	public h(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface5 arg2, @OriginalArg(3) Class143 arg3) {
		super(arg0, arg2);
		try {
			if (!Static142.aBoolean268) {
				if (arg3 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("sw3d");
					Static142.aBoolean268 = Boolean.TRUE;
				} else {
					arg3.method3396(this.getClass());
					Static142.aBoolean268 = Boolean.TRUE;
				}
			}
			if (!Static142.aBoolean268) {
				throw new RuntimeException("");
			}
			this.B(super.anInterface5_8, 0, 0);
			Static403.method5213(false, true);
			this.aBoolean269 = true;
			if (arg1 != null) {
				this.method5500(arg1);
				this.method5540(arg1);
			}
			this.aClass107_2 = new sa();
			this.m(new sa());
			this.method5497(1);
			this.method5521(0);
		} catch (@Pc(92) Throwable local92) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2354().sa(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!h", name = "j", descriptor = "(ILclient!ea;II)V")
	public native void j(@OriginalArg(0) int arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "s", descriptor = "()V")
	@Override
	public void method5515() {
		@Pc(1) int local1 = 0;
		while (local1 < 9) {
			try {
				synchronized (this.aCanvas3.getTreeLock()) {
					this.aLa1.SA();
					return;
				}
			} catch (@Pc(18) Exception local18) {
				Static360.method4758(200L);
				local1++;
			}
		}
		synchronized (this.aCanvas3.getTreeLock()) {
			this.aLa1.SA();
		}
	}

	@OriginalMember(owner = "client!h", name = "k", descriptor = "()Z")
	@Override
	public boolean method5486() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIILclient!ea;II)V")
	@Override
	public void method5498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class58 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.ta(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!h", name = "u", descriptor = "([I)V")
	public native void u(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5532(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas3 == arg0) {
			this.method5540(null);
		}
		@Pc(15) la local15 = (la) this.aClass11_17.method324((long) arg0.hashCode());
		if (local15 != null) {
			local15.method5977();
		}
		local15.method3321();
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V")
	@Override
	public void method5523(@OriginalArg(0) int arg0) {
		this.aMaArray1[arg0].method3624();
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "()Z")
	@Override
	public boolean method5474() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.ya();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!sh;)V")
	@Override
	public void method5471(@OriginalArg(0) Class227 arg0) {
		this.method2358(arg0, false);
		this.method2354().S(this, Static142.anIntArray184, Static142.anIntArray181, Static142.anIntArray180, Static142.aShortArray42, arg0.aClass235_1.method4960());
	}

	@OriginalMember(owner = "client!h", name = "o", descriptor = "(FF)V")
	public native void o(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!h", name = "r", descriptor = "()Z")
	@Override
	public boolean method5513() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "z", descriptor = "()Z")
	@Override
	public boolean method5533() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5512() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([Lclient!c;Lclient!sh;Lclient!ia;[Lclient!lc;I)V")
	@Override
	public void method5522(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) Class227 arg1, @OriginalArg(2) Class107 arg2, @OriginalArg(3) Class6_Sub5[] arg3, @OriginalArg(4) int arg4) {
		this.method2358(arg1, true);
		if (arg3 == null) {
			this.method2354().pa(this, arg0, arg2, null, arg4, Static142.anIntArray184, Static142.anIntArray181, Static142.anIntArray180, Static142.aShortArray42, Static142.aByteArray35, arg1.aClass235_1.method4960(), Static142.anIntArray183);
		} else {
			@Pc(28) Class6_Sub5 local28 = arg3[0];
			Static142.anIntArray182[5] = 0;
			this.method2354().pa(this, arg0, arg2, Static142.anIntArray182, arg4, Static142.anIntArray184, Static142.anIntArray181, Static142.anIntArray180, Static142.aShortArray42, Static142.aByteArray35, arg1.aClass235_1.method4960(), Static142.anIntArray183);
			local28.anInt4182 = Static142.anIntArray182[0];
			local28.anInt4183 = Static142.anIntArray182[1];
			local28.anInt4180 = Static142.anIntArray182[2];
			local28.anInt4181 = Static142.anIntArray182[3];
			local28.anInt4184 = Static142.anIntArray182[4];
			local28.aBoolean358 = Static142.anIntArray182[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) p local98 = (p) arg0[local88];
				local98.method4203(local86, arg2);
				if (local98.aClass269Array3 != null) {
					local86 += local98.aClass269Array3.length * 9;
				}
				if (local98.aClass165Array3 != null) {
					local86 += local98.aClass165Array3.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "y", descriptor = "()I")
	@Override
	public int method5531() {
		return 4;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method5528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.K(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "da", descriptor = "(IIIII)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!h", name = "K", descriptor = "(IIIIII)V")
	private native void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!h", name = "U", descriptor = "(IIIII)V")
	public native void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!h", name = "w", descriptor = "()F")
	public native float w();

	@OriginalMember(owner = "client!h", name = "ZA", descriptor = "()V")
	private void method2353() {
		System.gc();
		System.runFinalization();
		Static243.method3665();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5473(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(4) int local4;
		@Pc(9) Rectangle local9;
		while (local1 < 9) {
			try {
				for (local4 = 0; local4 < arg1; local4++) {
					local9 = arg0[local4];
					if (local9.width > 0 && local9.height > 0) {
						synchronized (this.aCanvas3.getTreeLock()) {
							this.aLa1.xa(local9.x, local9.y, local9.width, local9.height);
						}
					}
				}
				return;
			} catch (@Pc(44) Exception local44) {
				Static360.method4758(200L);
				local1++;
			}
		}
		for (local4 = 0; local4 < arg1; local4++) {
			local9 = arg0[local4];
			if (local9.width > 0 && local9.height > 0) {
				synchronized (this.aCanvas3.getTreeLock()) {
					this.aLa1.xa(local9.x, local9.y, local9.width, local9.height);
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(Z)V")
	@Override
	public void method5541(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!bi;Lclient!bi;FLclient!bi;)Lclient!bi;")
	@Override
	public Class23 method5525(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class23 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II[I[I)Lclient!ea;")
	@Override
	public Class58 method5499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new ca(this, this.aBa1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!h", name = "V", descriptor = "(III)V")
	public native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!h", name = "S", descriptor = "()V")
	public native void S();

	@OriginalMember(owner = "client!h", name = "f", descriptor = "()V")
	@Override
	public void method5476() {
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II[[I[[IIII)Lclient!na;")
	@Override
	public Class159 method5519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new b(this, this.aBa1, arg0, arg1, arg2, arg3, 128, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "B", descriptor = "()Z")
	@Override
	public boolean method5539() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5540(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas3 = null;
			this.aLa1 = null;
			this.P(null);
		} else {
			@Pc(10) la local10 = (la) this.aClass11_17.method324((long) arg0.hashCode());
			this.aCanvas3 = arg0;
			this.aLa1 = local10;
			this.P(local10);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!c;Lclient!sh;Lclient!ia;Lclient!lc;I)V")
	@Override
	public void method5520(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class227 arg1, @OriginalArg(2) Class107 arg2, @OriginalArg(3) Class6_Sub5 arg3) {
		this.method2358(arg1, true);
		if (arg3 == null) {
			this.method2354().f(this, arg0, arg2, null, 0, Static142.anIntArray184, Static142.anIntArray181, Static142.anIntArray180, Static142.aShortArray42, Static142.aByteArray35, arg1.aClass235_1.method4960(), Static142.anIntArray183);
		} else {
			Static142.anIntArray182[5] = 0;
			this.method2354().f(this, arg0, arg2, Static142.anIntArray182, 0, Static142.anIntArray184, Static142.anIntArray181, Static142.anIntArray180, Static142.aShortArray42, Static142.aByteArray35, arg1.aClass235_1.method4960(), Static142.anIntArray183);
			arg3.anInt4182 = Static142.anIntArray182[0];
			arg3.anInt4183 = Static142.anIntArray182[1];
			arg3.anInt4180 = Static142.anIntArray182[2];
			arg3.anInt4181 = Static142.anIntArray182[3];
			arg3.anInt4184 = Static142.anIntArray182[4];
			arg3.aBoolean358 = Static142.anIntArray182[5] != 0;
		}
		@Pc(83) p local83 = (p) arg0;
		local83.method4203(0, arg2);
	}

	@OriginalMember(owner = "client!h", name = "na", descriptor = "(I)V")
	public native void na(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!h", name = "g", descriptor = "()I")
	public native int g();

	@OriginalMember(owner = "client!h", name = "b", descriptor = "()Z")
	@Override
	public boolean method5472() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!h", name = "XA", descriptor = "(IFFFFF)V")
	public native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!h", name = "NA", descriptor = "(IIIIII)V")
	public native void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!h", name = "ja", descriptor = "(I)V")
	private native void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!h", name = "W", descriptor = "()I")
	public native int W();

	@OriginalMember(owner = "client!h", name = "D", descriptor = "()Lclient!ma;")
	public ma method2354() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2958; local1++) {
			if (this.aMaArray1[local1].aRunnable1 == Thread.currentThread()) {
				return this.aMaArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!eu;[Lclient!we;Z)Lclient!oa;")
	@Override
	public Class59 method5545(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class264[] arg1) {
		return new w(this, this.aBa1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!we;Z)Lclient!f;")
	@Override
	public Class8 method5542(@OriginalArg(0) Class264 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray523;
		@Pc(5) byte[] local5 = arg0.aByteArray94;
		@Pc(8) int local8 = arg0.anInt7502;
		@Pc(11) int local11 = arg0.anInt7501;
		@Pc(32) Class8 local32;
		if (arg0.aByteArray93 == null) {
			local32 = new xa(this, this.aBa1, local2, local5, 0, arg0.anInt7502, arg0.anInt7502, arg0.anInt7501);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray93;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray523[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new k(this, this.aBa1, local40, 0, arg0.anInt7502, arg0.anInt7502, arg0.anInt7501);
				} else {
					local32 = new n(this, this.aBa1, local40, 0, arg0.anInt7502, arg0.anInt7502, arg0.anInt7501);
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
		local32.ka(arg0.anInt7503, arg0.anInt7504, arg0.anInt7505, arg0.anInt7506);
		return local32;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5490(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class8 method5478(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
	@Override
	public void method5521(@OriginalArg(0) int arg0) {
		this.aMaArray1[arg0].method3623();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([Lclient!c;Lclient!ia;[Lclient!lc;I)V")
	@Override
	public void method5509(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) Class6_Sub5[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method2354().za(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class6_Sub5 local15 = arg2[0];
		Static142.anIntArray182[5] = 0;
		this.method2354().za(this, arg0, arg1, Static142.anIntArray182, -1, arg3);
		local15.anInt4182 = Static142.anIntArray182[0];
		local15.anInt4183 = Static142.anIntArray182[1];
		local15.anInt4180 = Static142.anIntArray182[2];
		local15.anInt4181 = Static142.anIntArray182[3];
		local15.anInt4184 = Static142.anIntArray182[4];
		local15.aBoolean358 = Static142.anIntArray182[5] != 0;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5514(@OriginalArg(0) Canvas arg0) {
		@Pc(8) la local8 = (la) this.aClass11_17.method324((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.ZA(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aCanvas3) {
			this.method5540(arg0);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class8 method5481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new k(this, this.aBa1, arg0, arg1, arg2, arg3) : new n(this, this.aBa1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
	@Override
	public void method5510(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!h", name = "VA", descriptor = "(I[I[F)V")
	private native void VA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!h", name = "p", descriptor = "()Z")
	@Override
	public boolean method5502() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
	@Override
	public void method5488(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)Lclient!l;")
	@Override
	public Class3_Sub29 method5487() {
		@Pc(5) ba local5 = new ba(this, 78643200);
		this.aClass243_18.method5198(local5);
		return local5;
	}

	@OriginalMember(owner = "client!h", name = "FA", descriptor = "()I")
	public native int FA();

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V")
	@Override
	public void method5527(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!h", name = "v", descriptor = "()Lclient!ia;")
	@Override
	public Class107 method5524() {
		return new sa();
	}

	@OriginalMember(owner = "client!h", name = "m", descriptor = "()Z")
	@Override
	public boolean method5494() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "()Z")
	@Override
	public boolean method5475() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "la", descriptor = "()F")
	public native float la();

	@OriginalMember(owner = "client!h", name = "B", descriptor = "(Lclient!m;II)V")
	private native void B(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "()V")
	@Override
	public void method5470() {
	}

	@OriginalMember(owner = "client!h", name = "C", descriptor = "()V")
	@Override
	public void method5543() {
	}

	@OriginalMember(owner = "client!h", name = "i", descriptor = "()Z")
	@Override
	public boolean method5482() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(IIIIII)Lclient!bi;")
	@Override
	public Class23 method5536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)I")
	@Override
	public int method5492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!h", name = "q", descriptor = "()Z")
	@Override
	public boolean method5508() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "u", descriptor = "()V")
	@Override
	public void method5518() {
	}

	@OriginalMember(owner = "client!h", name = "l", descriptor = "()Z")
	@Override
	public boolean method5491() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "pa", descriptor = "(IIII)V")
	public native void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "P", descriptor = "(Lclient!la;)V")
	private native void P(@OriginalArg(0) la arg0);

	@OriginalMember(owner = "client!h", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void l(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIF)Lclient!fk;")
	@Override
	public Class3_Sub8 method5534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub8_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "GA", descriptor = "(IIII)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "aa", descriptor = "(IIIIII[BII)V")
	public native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!h", name = "Z", descriptor = "(IIII)V")
	public native void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "ba", descriptor = "(IIII)V")
	public native void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "h", descriptor = "(I)V")
	@Override
	public void method5544(@OriginalArg(0) int arg0) {
		Static243.method3665();
		this.ja(arg0);
		for (@Pc(10) ba local10 = (ba) this.aClass243_18.method5208(); local10 != null; local10 = (ba) this.aClass243_18.method5203()) {
			local10.KA();
		}
	}

	@OriginalMember(owner = "client!h", name = "M", descriptor = "(I)V")
	public native void M(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!h", name = "t", descriptor = "()Z")
	@Override
	public boolean method5516() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "A", descriptor = "()Ljava/lang/Object;")
	private Object method2355() {
		return new ka();
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
	@Override
	public void method5497(@OriginalArg(0) int arg0) {
		this.anInt2958 = arg0;
		this.aMaArray1 = new ma[this.anInt2958];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2958; local9++) {
			this.aMaArray1[local9] = new ma(this, this.anInt2956, this.anInt2957);
		}
	}

	@OriginalMember(owner = "client!h", name = "h", descriptor = "()V")
	@Override
	public void method5477() {
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void f(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!bi;)V")
	@Override
	public void method5530(@OriginalArg(0) Class23 arg0) {
	}

	@OriginalMember(owner = "client!h", name = "MA", descriptor = "(S)Z")
	private boolean method2356(@OriginalArg(0) short arg0) {
		@Pc(2) Interface5 local2 = super.anInterface5_8;
		synchronized (super.anInterface5_8) {
			if (!super.anInterface5_8.method3921(arg0)) {
				return false;
			}
			@Pc(22) Class76 local22 = super.anInterface5_8.method3918(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(46) int[] local46;
			if (local22.aBoolean207 && local22.aBoolean212) {
				local46 = super.anInterface5_8.method3920(arg0, 128, 128, true, 0.7F);
			} else {
				local46 = super.anInterface5_8.method3919(arg0, 128, 0.7F, 128);
			}
			this.f(arg0, local22.aByte45, local22.aByte44, local22.aBoolean212, local22.aBoolean207, local22.aBoolean209, local22.aByte41, local22.aByte42, local22.aByte46, local22.aShort47, local22.anInt2415, local22.aBoolean211, local22.aBoolean210, local46);
			return true;
		}
	}

	@OriginalMember(owner = "client!h", name = "IA", descriptor = "(IIII)[I")
	public native int[] IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "ta", descriptor = "(IIIIIILclient!ea;II)V")
	private native void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class58 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!h", name = "ua", descriptor = "(F)V")
	public native void ua(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!h", name = "ia", descriptor = "(III[I)V")
	public native void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!h", name = "va", descriptor = "()V")
	public native void va();

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.da(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.da(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!h", name = "Y", descriptor = "(Lclient!l;)V")
	private native void Y(@OriginalArg(0) Class3_Sub29 arg0);

	@OriginalMember(owner = "client!h", name = "d", descriptor = "()I")
	public native int d();

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!l;)V")
	@Override
	public void method5526(@OriginalArg(0) Class3_Sub29 arg0) {
		this.aBa1 = (ba) arg0;
		this.Y(arg0);
	}

	@OriginalMember(owner = "client!h", name = "j", descriptor = "()Z")
	@Override
	public boolean method5483() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "SA", descriptor = "(IIIIII)Z")
	public native boolean SA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!h", name = "fa", descriptor = "(IIII)V")
	public native void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!h", name = "EA", descriptor = "(S)Z")
	private boolean method2357(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class76 local9 = super.anInterface5_8.method3918(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.l(arg0, local9.aByte45, local9.aByte44, local9.aBoolean212, local9.aBoolean207, local9.aBoolean209, local9.aByte41, local9.aByte42, local9.aByte46, local9.aShort47, local9.anInt2415, local9.aBoolean211, local9.aBoolean210);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "JA", descriptor = "(II)V")
	public native void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5500(@OriginalArg(0) Canvas arg0) {
		@Pc(8) la local8 = (la) this.aClass11_17.method324((long) arg0.hashCode());
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
		this.aClass11_17.method319(local8, (long) arg0.hashCode());
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!sh;Z)V")
	private void method2358(@OriginalArg(0) Class227 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class6_Sub3_Sub1 local15 = (Class6_Sub3_Sub1) arg0.aClass235_1.method4958(); local15 != null; local15 = (Class6_Sub3_Sub1) arg0.aClass235_1.method4961()) {
			Static142.anIntArray184[local1++] = local15.anInt1878;
			Static142.anIntArray184[local1++] = local15.anInt1881;
			Static142.anIntArray184[local1++] = local15.anInt1883;
			Static142.anIntArray181[local3++] = local15.anInt1876;
			Static142.aShortArray42[local7++] = (short) local15.anInt1879;
			Static142.anIntArray180[local5++] = local15.anInt1882;
			if (arg1) {
				Static142.aByteArray35[local9++] = local15.aByte37;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "x", descriptor = "()V")
	@Override
	protected void method5529() {
		for (@Pc(5) ba local5 = (ba) this.aClass243_18.method5208(); local5 != null; local5 = (ba) this.aClass243_18.method5203()) {
			local5.ka();
		}
		this.aClass243_18.method5200();
		this.I();
		if (this.aBoolean269) {
			Static411.method5290(true, false);
			this.aBoolean269 = false;
		}
	}

	@OriginalMember(owner = "client!h", name = "o", descriptor = "()Z")
	@Override
	public boolean method5496() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "xa", descriptor = "()I")
	public native int xa();

	@OriginalMember(owner = "client!h", name = "n", descriptor = "()Lclient!ia;")
	@Override
	public Class107 method5495() {
		return this.aClass107_2;
	}

	@OriginalMember(owner = "client!h", name = "I", descriptor = "()V")
	private native void I();

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)I")
	@Override
	public int method5501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I[Lclient!fk;)V")
	@Override
	public void method5485(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static142.anIntArray185[local1++] = arg1[local3].method4404();
			Static142.anIntArray185[local1++] = arg1[local3].method4397();
			Static142.anIntArray185[local1++] = arg1[local3].method4395();
			Static142.anIntArray185[local1++] = arg1[local3].method4400();
			Static142.aFloatArray8[local3] = arg1[local3].method4399();
			Static142.anIntArray185[local1++] = arg1[local3].method4402();
		}
		this.VA(arg0, Static142.anIntArray185, Static142.aFloatArray8);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!nd;IIII)Lclient!c;")
	@Override
	public Class9 method5537(@OriginalArg(0) Class161 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new p(this, this.aBa1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!h", name = "O", descriptor = "(IIIII)V")
	protected native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!h", name = "m", descriptor = "(Lclient!ia;)V")
	public native void m(@OriginalArg(0) Class107 arg0);
}
