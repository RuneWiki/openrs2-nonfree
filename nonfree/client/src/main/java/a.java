import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class a extends Class62 implements Interface9 {

	@OriginalMember(owner = "client!a", name = "v", descriptor = "Lclient!c;")
	private c aC1;

	@OriginalMember(owner = "client!a", name = "J", descriptor = "Lclient!b;")
	private b aB1;

	@OriginalMember(owner = "client!a", name = "L", descriptor = "Lclient!m;")
	private Class78 aClass78_1;

	@OriginalMember(owner = "client!a", name = "O", descriptor = "I")
	private int anInt27;

	@OriginalMember(owner = "client!a", name = "Q", descriptor = "[Lclient!v;")
	private v[] aVArray1;

	@OriginalMember(owner = "client!a", name = "u", descriptor = "Z")
	private boolean aBoolean1 = false;

	@OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!a", name = "D", descriptor = "Lclient!fea;")
	private final Class99 aClass99_1 = new Class99();

	@OriginalMember(owner = "client!a", name = "M", descriptor = "I")
	private final int anInt26 = 4096;

	@OriginalMember(owner = "client!a", name = "H", descriptor = "I")
	private final int anInt25 = 4096;

	@OriginalMember(owner = "client!a", name = "I", descriptor = "Lclient!cb;")
	private final Class42 aClass42_1 = new Class42(4);

	@OriginalMember(owner = "client!a", name = "P", descriptor = "Z")
	private boolean aBoolean2 = false;

	@OriginalMember(owner = "client!a", name = "N", descriptor = "Lclient!m;")
	private Class78 aClass78_2;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;)V")
	public a(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface8 arg1) {
		super(arg1);
		try {
			if (!Static66.method1216("sw3d")) {
				throw new RuntimeException("");
			}
			Static351.method5440();
			this.Y(super.anInterface8_145, 0, 0);
			Static265.method4417(true, false);
			this.aBoolean2 = true;
			this.aClass78_2 = new q();
			this.method7068(new q());
			this.method6997(1);
			this.method7001(0);
			if (arg0 != null) {
				this.method7026(arg0);
				this.method7015(arg0);
			}
		} catch (@Pc(78) Throwable local78) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!a", name = "m", descriptor = "(IFFFFF)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!a", name = "h", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void h(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I")
	@Override
	public int method7017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!a", name = "A", descriptor = "(IIIII)V")
	protected native void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!a", name = "d", descriptor = "()Z")
	@Override
	public boolean method7000() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "()V")
	@Override
	public void method6999() {
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(Z)V")
	@Override
	public void method7058(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!a", name = "v", descriptor = "(IIII)[I")
	public native int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "e", descriptor = "()V")
	@Override
	public void method7004() {
	}

	@OriginalMember(owner = "client!a", name = "WA", descriptor = "(S)Z")
	private boolean method157(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class271 local9 = super.anInterface8_145.method7237(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.RA(arg0, local9.aByte80, local9.aByte83, local9.aBoolean561, local9.aBoolean566, local9.aBoolean557, local9.aByte82, local9.aByte81, local9.aByte78, local9.aShort100, local9.anInt7867, local9.aBoolean559, local9.aBoolean563);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method161().da(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!fba;Z)Lclient!ha;")
	@Override
	public Class25 method6998(@OriginalArg(0) Class96 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray229;
		@Pc(5) byte[] local5 = arg0.aByteArray42;
		@Pc(8) int local8 = arg0.anInt2722;
		@Pc(11) int local11 = arg0.anInt2718;
		@Pc(32) Class25 local32;
		if (arg0.aByteArray41 == null) {
			local32 = new ca(this, this.aC1, local2, local5, 0, arg0.anInt2722, arg0.anInt2722, arg0.anInt2718);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray41;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray229[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new va(this, this.aC1, local40, 0, arg0.anInt2722, arg0.anInt2722, arg0.anInt2718);
				} else {
					local32 = new t(this, this.aC1, local40, 0, arg0.anInt2722, arg0.anInt2722, arg0.anInt2718);
				}
			} else {
				for (@Pc(47) int local47 = 0; local47 < local11; local47++) {
					local52 = local47 * local8;
					for (local54 = 0; local54 < local8; local54++) {
						local40[local52 + local54] = local2[local5[local52 + local54] & 0xFF] | local43[local52 + local54] << 24;
					}
				}
				local32 = new va(this, this.aC1, local40, 0, local8, local8, local11);
			}
		}
		local32.KA(arg0.anInt2719, arg0.anInt2720, arg0.anInt2723, arg0.anInt2721);
		return local32;
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7038(@OriginalArg(0) Canvas arg0) {
		@Pc(8) b local8 = (b) this.aClass42_1.method1109((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.xa(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aB1.aCanvas1) {
			this.method7015(arg0);
		}
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)Lclient!u;")
	@Override
	public Class5_Sub29 method7010(@OriginalArg(0) int arg0) {
		@Pc(5) c local5 = new c(this, arg0);
		this.aClass99_1.method2513(local5);
		return local5;
	}

	@OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method7061();
		if (this.nativeid != 0L) {
			Static351.method5441(this);
		}
	}

	@OriginalMember(owner = "client!a", name = "k", descriptor = "()Z")
	@Override
	public boolean method7023() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "A", descriptor = "()Z")
	@Override
	public boolean method7053() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "n", descriptor = "()V")
	public native void n();

	@OriginalMember(owner = "client!a", name = "g", descriptor = "(I)V")
	@Override
	public void method7048(@OriginalArg(0) int arg0) {
		Static351.method5439();
		this.HA(arg0);
		for (@Pc(10) c local10 = (c) this.aClass99_1.method2526(); local10 != null; local10 = (c) this.aClass99_1.method2519()) {
			local10.O();
		}
	}

	@OriginalMember(owner = "client!a", name = "i", descriptor = "()Lclient!dp;")
	@Override
	public Class68 method7016() {
		return new Class68(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!a", name = "JA", descriptor = "(IIII)V")
	public native void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "GA", descriptor = "(S)Z")
	private boolean method158(@OriginalArg(0) short arg0) {
		@Pc(2) Interface8 local2 = super.anInterface8_145;
		synchronized (super.anInterface8_145) {
			if (!super.anInterface8_145.method7236(arg0)) {
				return false;
			}
			@Pc(22) Class271 local22 = super.anInterface8_145.method7237(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(43) int[] local43;
			if (local22.aBoolean562) {
				local43 = super.anInterface8_145.method7232(0.7F, 128, arg0, 128);
			} else {
				local43 = super.anInterface8_145.method7234(128, 128, true, arg0, 0.7F);
			}
			this.h(arg0, local22.aByte80, local22.aByte83, local22.aBoolean561, local22.aBoolean566, local22.aBoolean557, local22.aByte82, local22.aByte81, local22.aByte78, local22.aShort100, local22.anInt7867, local22.aBoolean559, local22.aBoolean563, local43);
			return true;
		}
	}

	@OriginalMember(owner = "client!a", name = "s", descriptor = "()V")
	@Override
	public void method7035() {
	}

	@OriginalMember(owner = "client!a", name = "E", descriptor = "(III)V")
	public native void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!a", name = "z", descriptor = "()Z")
	@Override
	public boolean method7050() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "u", descriptor = "()V")
	@Override
	public void method7039() {
	}

	@OriginalMember(owner = "client!a", name = "B", descriptor = "()Z")
	@Override
	public boolean method7062() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIF)Lclient!uca;")
	@Override
	public Class5_Sub10 method6993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class5_Sub10_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "h", descriptor = "(I)V")
	@Override
	public void method7060(@OriginalArg(0) int arg0) {
		this.aVArray1[arg0].method6955();
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7015(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aB1 = null;
			this.MA(null);
		} else {
			@Pc(10) b local10 = (b) this.aClass42_1.method1109((long) arg0.hashCode());
			this.aB1 = local10;
			this.MA(local10);
		}
	}

	@OriginalMember(owner = "client!a", name = "N", descriptor = "(IIII)V")
	public native void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(IIIIII)V")
	public native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(IIIII)V")
	public native void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6995() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!a", name = "D", descriptor = "()V")
	@Override
	public void method7065() {
	}

	@OriginalMember(owner = "client!a", name = "za", descriptor = "(IIIIII[BII)V")
	public native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([IIIII)Lclient!ha;")
	@Override
	public Class25 method7021(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new va(this, this.aC1, arg0, 0, arg1, arg2, arg3) : new t(this, this.aC1, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new va(this, this.aC1, arg0, 0, arg1, arg2, arg3) : new t(this, this.aC1, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!a", name = "C", descriptor = "()Z")
	@Override
	public boolean method7063() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "la", descriptor = "(FF)V")
	public native void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!a", name = "P", descriptor = "()F")
	public native float P();

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!rl;[Lclient!fba;Z)Lclient!ra;")
	@Override
	public Class13 method7054(@OriginalArg(0) Class256 arg0, @OriginalArg(1) Class96[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt2722;
			local7[local11] = arg1[local11].anInt2718;
			if (arg1[local11].aByteArray41 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new w(this, this.aC1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!a", name = "ra", descriptor = "()F")
	public native float ra();

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public void method6991(@OriginalArg(0) Class5_Sub29 arg0) {
		this.aC1 = (c) arg0;
		this.ea(arg0);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public void method7068(@OriginalArg(0) Class78 arg0) {
		this.aClass78_1 = arg0;
		this.TA(arg0);
	}

	@OriginalMember(owner = "client!a", name = "w", descriptor = "()V")
	private native void w();

	@OriginalMember(owner = "client!a", name = "ba", descriptor = "()I")
	public native int ba();

	@OriginalMember(owner = "client!a", name = "l", descriptor = "()V")
	@Override
	public void method7025() {
	}

	@OriginalMember(owner = "client!a", name = "B", descriptor = "(IIIIII)Z")
	public native boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!a", name = "M", descriptor = "(F)V")
	public native void M(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7026(@OriginalArg(0) Canvas arg0) {
		@Pc(8) b local8 = (b) this.aClass42_1.method1109((long) arg0.hashCode());
		if (local8 != null) {
			return;
		}
		try {
			@Pc(13) Class local13 = Class.forName("java.awt.Canvas");
			@Pc(23) Method local23 = local13.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local23.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(35) Exception local35) {
		}
		local8 = new b(this, arg0);
		this.aClass42_1.method1106((long) arg0.hashCode(), local8);
	}

	@OriginalMember(owner = "client!a", name = "o", descriptor = "()V")
	@Override
	public void method7030() throws Exception_Sub1 {
		if (this.aB1 == null) {
			throw new IllegalStateException("off");
		}
		this.aB1.method661();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([Lclient!r;Lclient!sh;Lclient!m;[Lclient!paa;I)V")
	@Override
	public void method7008(@OriginalArg(0) Class36[] arg0, @OriginalArg(1) Class267 arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) Class30_Sub6[] arg3, @OriginalArg(4) int arg4) {
		this.method162(arg1, true);
		if (arg3 == null) {
			this.method161().N(this, arg0, arg2, null, arg4, Static1.anIntArray6, Static1.anIntArray3, Static1.anIntArray5, Static1.aShortArray1, Static1.aByteArray1, arg1.aClass161_1.method4076(), Static1.anIntArray2);
		} else {
			@Pc(28) Class30_Sub6 local28 = arg3[0];
			Static1.anIntArray7[5] = 0;
			this.method161().N(this, arg0, arg2, Static1.anIntArray7, arg4, Static1.anIntArray6, Static1.anIntArray3, Static1.anIntArray5, Static1.aShortArray1, Static1.aByteArray1, arg1.aClass161_1.method4076(), Static1.anIntArray2);
			local28.anInt6882 = Static1.anIntArray7[0];
			local28.anInt6885 = Static1.anIntArray7[1];
			local28.anInt6884 = Static1.anIntArray7[2];
			local28.anInt6883 = Static1.anIntArray7[3];
			local28.anInt6881 = Static1.anIntArray7[4];
			local28.aBoolean481 = Static1.anIntArray7[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) ma local98 = (ma) arg0[local88];
				local98.method4944(local86, arg2);
				if (local98.aClass223Array5 != null) {
					local86 += local98.aClass223Array5.length * 9;
				}
				if (local98.aClass280Array5 != null) {
					local86 += local98.aClass280Array5.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!a", name = "ta", descriptor = "(II)V")
	public native void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.UA(arg0, arg1, arg2, arg4, arg5);
		this.UA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.e(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.e(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "NA", descriptor = "(Z)V")
	public native void NA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method7036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.t(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "r", descriptor = "()I")
	@Override
	public int method7034() {
		return 4;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	@Override
	public void method7022(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(II)I")
	@Override
	public int method7024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!kk;Lclient!kk;FLclient!kk;)Lclient!kk;")
	@Override
	public Class92 method7052(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class92 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7055(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aB1 == null) {
			throw new IllegalStateException("off");
		}
		this.aB1.method664(arg0, arg1);
	}

	@OriginalMember(owner = "client!a", name = "YA", descriptor = "()I")
	public native int YA();

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	@Override
	public void method6997(@OriginalArg(0) int arg0) {
		this.anInt27 = arg0;
		this.aVArray1 = new v[this.anInt27];
		for (@Pc(9) int local9 = 0; local9 < this.anInt27; local9++) {
			this.aVArray1[local9] = new v(this, this.anInt26, this.anInt25);
		}
	}

	@OriginalMember(owner = "client!a", name = "g", descriptor = "()Z")
	@Override
	public boolean method7007() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "MA", descriptor = "(Lclient!b;)V")
	private native void MA(@OriginalArg(0) b arg0);

	@OriginalMember(owner = "client!a", name = "Q", descriptor = "()Ljava/lang/Object;")
	private Object method159() {
		return new e(this);
	}

	@OriginalMember(owner = "client!a", name = "XA", descriptor = "()V")
	private void method160() {
		System.gc();
		System.runFinalization();
		Static351.method5439();
	}

	@OriginalMember(owner = "client!a", name = "E", descriptor = "()Lclient!v;")
	public v method161() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt27; local1++) {
			if (this.aVArray1[local1].aRunnable4 == Thread.currentThread()) {
				return this.aVArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ld;IIII)Lclient!r;")
	@Override
	public Class36 method7012(@OriginalArg(0) Class184 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new ma(this, this.aC1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!a", name = "L", descriptor = "(I)V")
	public native void L(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "ea", descriptor = "(Lclient!u;)V")
	private native void ea(@OriginalArg(0) Class5_Sub29 arg0);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public Class131 method7051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new s(this, this.aC1, arg0, arg1, arg2, arg3, 128, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)V")
	@Override
	public void method7027(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	@Override
	public Class87 method7006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new ta(this, this.aC1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!a", name = "HA", descriptor = "(I)V")
	private native void HA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "h", descriptor = "()Lclient!m;")
	@Override
	public Class78 method7011() {
		return new q();
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(IIII)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "RA", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void RA(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I[Lclient!uca;)V")
	@Override
	public void method7059(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub10[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static1.anIntArray4[local1++] = arg1[local3].method5189();
			Static1.anIntArray4[local1++] = arg1[local3].method5190();
			Static1.anIntArray4[local1++] = arg1[local3].method5183();
			Static1.anIntArray4[local1++] = arg1[local3].method5191();
			Static1.aFloatArray1[local3] = arg1[local3].method5184();
			Static1.anIntArray4[local1++] = arg1[local3].method5185();
		}
		this.oa(arg0, Static1.anIntArray4, Static1.aFloatArray1);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!r;Lclient!sh;Lclient!m;Lclient!paa;I)V")
	@Override
	public void method7066(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class267 arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) Class30_Sub6 arg3) {
		this.method162(arg1, true);
		if (arg3 == null) {
			this.method161().G(this, arg0, arg2, null, 0, Static1.anIntArray6, Static1.anIntArray3, Static1.anIntArray5, Static1.aShortArray1, Static1.aByteArray1, arg1.aClass161_1.method4076(), Static1.anIntArray2);
		} else {
			Static1.anIntArray7[5] = 0;
			this.method161().G(this, arg0, arg2, Static1.anIntArray7, 0, Static1.anIntArray6, Static1.anIntArray3, Static1.anIntArray5, Static1.aShortArray1, Static1.aByteArray1, arg1.aClass161_1.method4076(), Static1.anIntArray2);
			arg3.anInt6882 = Static1.anIntArray7[0];
			arg3.anInt6885 = Static1.anIntArray7[1];
			arg3.anInt6884 = Static1.anIntArray7[2];
			arg3.anInt6883 = Static1.anIntArray7[3];
			arg3.anInt6881 = Static1.anIntArray7[4];
			arg3.aBoolean481 = Static1.anIntArray7[5] != 0;
		}
		@Pc(83) ma local83 = (ma) arg0;
		local83.method4944(0, arg2);
	}

	@OriginalMember(owner = "client!a", name = "t", descriptor = "(IIIIII)V")
	private native void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "()Lclient!m;")
	@Override
	public Class78 method6994() {
		return this.aClass78_2;
	}

	@OriginalMember(owner = "client!a", name = "CA", descriptor = "()I")
	public native int CA();

	@OriginalMember(owner = "client!a", name = "UA", descriptor = "(IIIII)V")
	public native void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIZ)Lclient!ha;")
	@Override
	public Class25 method7003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new va(this, this.aC1, arg0, arg1, arg2, arg3) : new t(this, this.aC1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!a", name = "xa", descriptor = "()V")
	public native void xa();

	@OriginalMember(owner = "client!a", name = "G", descriptor = "(ILclient!pa;II)V")
	public native void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class87 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "Z", descriptor = "(I)V")
	public native void Z(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "p", descriptor = "()Z")
	@Override
	public boolean method7031() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7041(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	@Override
	public void method7057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class87 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.ca(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!a", name = "IA", descriptor = "(III[I)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!a", name = "F", descriptor = "(IIII)V")
	public native void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!kk;)V")
	@Override
	public void method7067(@OriginalArg(0) Class92 arg0) {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7014(@OriginalArg(0) Canvas arg0) {
		if (this.aB1.aCanvas1 == arg0) {
			this.method7015(null);
		}
		@Pc(16) b local16 = (b) this.aClass42_1.method1109((long) arg0.hashCode());
		if (local16 != null) {
			local16.method7425();
			local16.method662();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	@Override
	public void method6996(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!a", name = "oa", descriptor = "(I[I[F)V")
	private native void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!a", name = "Y", descriptor = "(Lclient!n;II)V")
	private native void Y(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!a", name = "TA", descriptor = "(Lclient!m;)V")
	private native void TA(@OriginalArg(0) Class78 arg0);

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
	@Override
	public void method7001(@OriginalArg(0) int arg0) {
		this.aVArray1[arg0].method6953();
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "()I")
	public native int c();

	@OriginalMember(owner = "client!a", name = "ca", descriptor = "(IIIIIILclient!pa;II)V")
	private native void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class87 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!a", name = "x", descriptor = "()Z")
	@Override
	public boolean method7047() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!paa;I)V")
	@Override
	public void method7019(@OriginalArg(0) Class36[] arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) Class30_Sub6[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method161().wa(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class30_Sub6 local15 = arg2[0];
		Static1.anIntArray7[5] = 0;
		this.method161().wa(this, arg0, arg1, Static1.anIntArray7, -1, arg3);
		local15.anInt6882 = Static1.anIntArray7[0];
		local15.anInt6885 = Static1.anIntArray7[1];
		local15.anInt6884 = Static1.anIntArray7[2];
		local15.anInt6883 = Static1.anIntArray7[3];
		local15.anInt6881 = Static1.anIntArray7[4];
		local15.aBoolean481 = Static1.anIntArray7[5] != 0;
	}

	@OriginalMember(owner = "client!a", name = "m", descriptor = "()Z")
	@Override
	public boolean method7028() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "([I)V")
	public native void d(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!a", name = "j", descriptor = "()Z")
	@Override
	public boolean method7020() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!sh;)V")
	@Override
	public void method7002(@OriginalArg(0) Class267 arg0) {
		this.method162(arg0, false);
		this.method161().O(this, Static1.anIntArray6, Static1.anIntArray3, Static1.anIntArray5, Static1.aShortArray1, arg0.aClass161_1.method4076());
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "()Z")
	@Override
	public boolean method7005() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "y", descriptor = "()Z")
	@Override
	public boolean method7049() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!sh;Z)V")
	private void method162(@OriginalArg(0) Class267 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class30_Sub2_Sub1 local15 = (Class30_Sub2_Sub1) arg0.aClass161_1.method4080(); local15 != null; local15 = (Class30_Sub2_Sub1) arg0.aClass161_1.method4078()) {
			Static1.anIntArray6[local1++] = local15.anInt2966;
			Static1.anIntArray6[local1++] = local15.anInt2967;
			Static1.anIntArray6[local1++] = local15.anInt2969;
			Static1.anIntArray3[local3++] = local15.anInt2962;
			Static1.aShortArray1[local7++] = (short) local15.anInt2968;
			Static1.anIntArray5[local5++] = local15.anInt2963;
			if (arg1) {
				Static1.aByteArray1[local9++] = local15.aByte38;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "v", descriptor = "()Z")
	@Override
	public boolean method7044() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(IIIIII)Lclient!kk;")
	@Override
	public Class92 method7046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!a", name = "q", descriptor = "(IIII)V")
	public native void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "q", descriptor = "()Z")
	@Override
	public boolean method7033() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "t", descriptor = "()V")
	@Override
	protected void method7037() {
		if (this.aBoolean1) {
			return;
		}
		this.aVArray1 = null;
		this.aB1 = null;
		this.aC1 = null;
		this.aClass78_2 = null;
		this.aClass42_1.method1108();
		for (@Pc(25) c local25 = (c) this.aClass99_1.method2526(); local25 != null; local25 = (c) this.aClass99_1.method2519()) {
			local25.za();
		}
		this.aClass99_1.method2524();
		this.w();
		if (this.aBoolean2) {
			Static135.method2550(false, true);
			this.aBoolean2 = false;
		}
		this.method160();
		Static351.method5438();
		this.aBoolean1 = true;
	}
}
