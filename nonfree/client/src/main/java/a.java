import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class a extends Class122 implements Interface11 {

	@OriginalMember(owner = "client!a", name = "r", descriptor = "Lclient!c;")
	private c aC1;

	@OriginalMember(owner = "client!a", name = "D", descriptor = "Lclient!m;")
	private Class118 aClass118_1;

	@OriginalMember(owner = "client!a", name = "G", descriptor = "Lclient!b;")
	private b aB1;

	@OriginalMember(owner = "client!a", name = "L", descriptor = "I")
	private int anInt27;

	@OriginalMember(owner = "client!a", name = "M", descriptor = "[Lclient!v;")
	private v[] aVArray1;

	@OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!a", name = "u", descriptor = "Z")
	private boolean aBoolean1 = false;

	@OriginalMember(owner = "client!a", name = "t", descriptor = "Lclient!bv;")
	private final Class37 aClass37_1 = new Class37();

	@OriginalMember(owner = "client!a", name = "I", descriptor = "I")
	private final int anInt25 = 4096;

	@OriginalMember(owner = "client!a", name = "J", descriptor = "I")
	private final int anInt26 = 4096;

	@OriginalMember(owner = "client!a", name = "H", descriptor = "Lclient!ba;")
	private final Class17 aClass17_1 = new Class17(4);

	@OriginalMember(owner = "client!a", name = "N", descriptor = "Z")
	private boolean aBoolean2 = false;

	@OriginalMember(owner = "client!a", name = "K", descriptor = "Lclient!m;")
	private Class118 aClass118_2;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;)V")
	public a(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface8 arg1) {
		super(arg1);
		try {
			if (!Static193.method6050("sw3d")) {
				throw new RuntimeException("");
			}
			Static79.method1343();
			this.Y(super.anInterface8_14, 0, 0);
			Static20.method500(true, false);
			this.aBoolean2 = true;
			this.aClass118_2 = new q();
			this.method7250(new q());
			this.method7239(1);
			this.method7232(0);
			if (arg0 != null) {
				this.method7222(arg0);
				this.method7226(arg0);
			}
		} catch (@Pc(78) Throwable local78) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "t", descriptor = "(IIIIII)V")
	private native void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!a", name = "za", descriptor = "(IIIIII[BII)V")
	public native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!a", name = "k", descriptor = "()Z")
	@Override
	public boolean method7242() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method7237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.t(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ig;Z)Lclient!ha;")
	@Override
	public Class2 method7220(@OriginalArg(0) Class136 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray344;
		@Pc(5) byte[] local5 = arg0.aByteArray52;
		@Pc(8) int local8 = arg0.anInt4055;
		@Pc(11) int local11 = arg0.anInt4054;
		@Pc(32) Class2 local32;
		if (arg0.aByteArray53 == null) {
			local32 = new ca(this, this.aC1, local2, local5, 0, arg0.anInt4055, arg0.anInt4055, arg0.anInt4054);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray53;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray344[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new va(this, this.aC1, local40, 0, arg0.anInt4055, arg0.anInt4055, arg0.anInt4054);
				} else {
					local32 = new t(this, this.aC1, local40, 0, arg0.anInt4055, arg0.anInt4055, arg0.anInt4054);
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
		local32.KA(arg0.anInt4052, arg0.anInt4053, arg0.anInt4051, arg0.anInt4050);
		return local32;
	}

	@OriginalMember(owner = "client!a", name = "XA", descriptor = "()V")
	private void method157() {
		System.gc();
		System.runFinalization();
		Static79.method1342();
	}

	@OriginalMember(owner = "client!a", name = "C", descriptor = "()V")
	@Override
	public void method7281() {
	}

	@OriginalMember(owner = "client!a", name = "NA", descriptor = "(Z)V")
	public native void NA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!a", name = "l", descriptor = "()Z")
	@Override
	public boolean method7244() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "ca", descriptor = "(IIIIIILclient!pa;II)V")
	private native void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class40 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!a", name = "RA", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void RA(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(IIIII)V")
	public native void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!a", name = "YA", descriptor = "()I")
	public native int YA();

	@OriginalMember(owner = "client!a", name = "r", descriptor = "()Z")
	@Override
	public boolean method7255() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public Class205 method7219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new s(this, this.aC1, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I[Lclient!ww;)V")
	@Override
	public void method7264(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static1.anIntArray5[local1++] = arg1[local3].method2426();
			Static1.anIntArray5[local1++] = arg1[local3].method2428();
			Static1.anIntArray5[local1++] = arg1[local3].method2427();
			Static1.anIntArray5[local1++] = arg1[local3].method2434();
			Static1.aFloatArray1[local3] = arg1[local3].method2436();
			Static1.anIntArray5[local1++] = arg1[local3].method2432();
		}
		this.oa(arg0, Static1.anIntArray5, Static1.aFloatArray1);
	}

	@OriginalMember(owner = "client!a", name = "z", descriptor = "()Lclient!m;")
	@Override
	public Class118 method7275() {
		return new q();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method159().da(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIZ)Lclient!ha;")
	@Override
	public Class2 method7261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new va(this, this.aC1, arg0, arg1, arg2, arg3) : new t(this, this.aC1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!fp;IIII)Lclient!r;")
	@Override
	public Class145 method7280(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new ma(this, this.aC1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!a", name = "GA", descriptor = "(S)Z")
	private boolean method158(@OriginalArg(0) short arg0) {
		@Pc(2) Interface8 local2 = super.anInterface8_14;
		synchronized (super.anInterface8_14) {
			if (!super.anInterface8_14.method879(arg0)) {
				return false;
			}
			@Pc(22) Class220 local22 = super.anInterface8_14.method878(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(43) int[] local43;
			if (local22.aBoolean445) {
				local43 = super.anInterface8_14.method880(128, arg0, 128, 0.7F);
			} else {
				local43 = super.anInterface8_14.method876(arg0, true, 128, 0.7F, 128);
			}
			this.h(arg0, local22.aByte81, local22.aByte84, local22.aBoolean449, local22.aBoolean446, local22.aBoolean448, local22.aByte82, local22.aByte85, local22.aByte87, local22.aShort100, local22.anInt6250, local22.aBoolean453, local22.aBoolean447, local43);
			return true;
		}
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V")
	@Override
	public void method7234(@OriginalArg(0) int arg0) {
		Static79.method1342();
		this.HA(arg0);
		for (@Pc(10) c local10 = (c) this.aClass37_1.method977(); local10 != null; local10 = (c) this.aClass37_1.method971()) {
			local10.O();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([IIIII)Lclient!ha;")
	@Override
	public Class2 method7268(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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

	@OriginalMember(owner = "client!a", name = "la", descriptor = "(FF)V")
	public native void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	@Override
	public void method7211(@OriginalArg(0) int arg0) {
		this.aVArray1[arg0].method6989();
	}

	@OriginalMember(owner = "client!a", name = "q", descriptor = "()Z")
	@Override
	public boolean method7254() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "HA", descriptor = "(I)V")
	private native void HA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!a", name = "m", descriptor = "(IFFFFF)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!a", name = "IA", descriptor = "(III[I)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!a", name = "c", descriptor = "()I")
	public native int c();

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(II)I")
	@Override
	public int method7241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!a", name = "o", descriptor = "()V")
	@Override
	public void method7247() {
	}

	@OriginalMember(owner = "client!a", name = "xa", descriptor = "()V")
	public native void xa();

	@OriginalMember(owner = "client!a", name = "e", descriptor = "()Z")
	@Override
	public boolean method7218() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	@Override
	public void method7210(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!a", name = "y", descriptor = "()V")
	@Override
	public void method7269() {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7222(@OriginalArg(0) Canvas arg0) {
		@Pc(8) b local8 = (b) this.aClass17_1.method738((long) arg0.hashCode());
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
		this.aClass17_1.method737(local8, (long) arg0.hashCode());
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([Lclient!r;Lclient!kw;Lclient!m;[Lclient!eca;I)V")
	@Override
	public void method7283(@OriginalArg(0) Class145[] arg0, @OriginalArg(1) Class175 arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) Class72_Sub2[] arg3, @OriginalArg(4) int arg4) {
		this.method161(arg1, true);
		if (arg3 == null) {
			this.method159().N(this, arg0, arg2, null, arg4, Static1.anIntArray8, Static1.anIntArray7, Static1.anIntArray9, Static1.aShortArray1, Static1.aByteArray3, arg1.aClass193_1.method4755(), Static1.anIntArray4);
		} else {
			@Pc(28) Class72_Sub2 local28 = arg3[0];
			Static1.anIntArray6[5] = 0;
			this.method159().N(this, arg0, arg2, Static1.anIntArray6, arg4, Static1.anIntArray8, Static1.anIntArray7, Static1.anIntArray9, Static1.aShortArray1, Static1.aByteArray3, arg1.aClass193_1.method4755(), Static1.anIntArray4);
			local28.anInt2130 = Static1.anIntArray6[0];
			local28.anInt2131 = Static1.anIntArray6[1];
			local28.anInt2132 = Static1.anIntArray6[2];
			local28.anInt2133 = Static1.anIntArray6[3];
			local28.anInt2129 = Static1.anIntArray6[4];
			local28.aBoolean129 = Static1.anIntArray6[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) ma local98 = (ma) arg0[local88];
				local98.method4697(local86, arg2);
				if (local98.aClass161Array6 != null) {
					local86 += local98.aClass161Array6.length * 9;
				}
				if (local98.aClass93Array6 != null) {
					local86 += local98.aClass93Array6.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!pe;[Lclient!ig;Z)Lclient!ra;")
	@Override
	public Class67 method7270(@OriginalArg(0) Class232 arg0, @OriginalArg(1) Class136[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt4055;
			local7[local11] = arg1[local11].anInt4054;
			if (arg1[local11].aByteArray53 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new w(this, this.aC1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!kw;)V")
	@Override
	public void method7251(@OriginalArg(0) Class175 arg0) {
		this.method161(arg0, false);
		this.method159().O(this, Static1.anIntArray8, Static1.anIntArray7, Static1.anIntArray9, Static1.aShortArray1, arg0.aClass193_1.method4755());
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public void method7229(@OriginalArg(0) Class1_Sub8 arg0) {
		this.aC1 = (c) arg0;
		this.ea(arg0);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!eca;I)V")
	@Override
	public void method7257(@OriginalArg(0) Class145[] arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) Class72_Sub2[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method159().wa(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class72_Sub2 local15 = arg2[0];
		Static1.anIntArray6[5] = 0;
		this.method159().wa(this, arg0, arg1, Static1.anIntArray6, -1, arg3);
		local15.anInt2130 = Static1.anIntArray6[0];
		local15.anInt2131 = Static1.anIntArray6[1];
		local15.anInt2132 = Static1.anIntArray6[2];
		local15.anInt2133 = Static1.anIntArray6[3];
		local15.anInt2129 = Static1.anIntArray6[4];
		local15.aBoolean129 = Static1.anIntArray6[5] != 0;
	}

	@OriginalMember(owner = "client!a", name = "E", descriptor = "()Lclient!v;")
	public v method159() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt27; local1++) {
			if (this.aVArray1[local1].aRunnable3 == Thread.currentThread()) {
				return this.aVArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!a", name = "t", descriptor = "()Z")
	@Override
	public boolean method7258() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "E", descriptor = "(III)V")
	public native void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!a", name = "Y", descriptor = "(Lclient!n;II)V")
	private native void Y(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!a", name = "g", descriptor = "()Z")
	@Override
	public boolean method7228() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "A", descriptor = "()Lclient!qf;")
	@Override
	public Class246 method7276() {
		return new Class246(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "([I)V")
	public native void d(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!a", name = "v", descriptor = "()Z")
	@Override
	public boolean method7266() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "v", descriptor = "(IIII)[I")
	public native int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method7224();
		if (this.nativeid != 0L) {
			Static79.method1341(this);
		}
	}

	@OriginalMember(owner = "client!a", name = "m", descriptor = "()V")
	@Override
	protected void method7245() {
		if (this.aBoolean1) {
			return;
		}
		this.aVArray1 = null;
		this.aB1 = null;
		this.aC1 = null;
		this.aClass118_2 = null;
		this.aClass17_1.method734();
		for (@Pc(25) c local25 = (c) this.aClass37_1.method977(); local25 != null; local25 = (c) this.aClass37_1.method971()) {
			local25.za();
		}
		this.aClass37_1.method967();
		this.w();
		if (this.aBoolean2) {
			Static328.method5044(false, true);
			this.aBoolean2 = false;
		}
		this.method157();
		Static79.method1340();
		this.aBoolean1 = true;
	}

	@OriginalMember(owner = "client!a", name = "B", descriptor = "()Z")
	@Override
	public boolean method7279() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "N", descriptor = "(IIII)V")
	public native void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)V")
	@Override
	public void method7271(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I")
	@Override
	public int method7225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(IIIIII)Lclient!rn;")
	@Override
	public Class45 method7227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7278(@OriginalArg(0) Canvas arg0) {
		@Pc(8) b local8 = (b) this.aClass17_1.method738((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.xa(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aB1.aCanvas2) {
			this.method7226(arg0);
		}
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method7282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.UA(arg0, arg1, arg2, arg4, arg5);
		this.UA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.e(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.e(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "JA", descriptor = "(IIII)V")
	public native void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "s", descriptor = "()Lclient!m;")
	@Override
	public Class118 method7256() {
		return this.aClass118_2;
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(Z)V")
	@Override
	public void method7272(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!a", name = "j", descriptor = "()Z")
	@Override
	public boolean method7240() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "F", descriptor = "(IIII)V")
	public native void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	@Override
	public Class40 method7273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new ta(this, this.aC1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!a", name = "u", descriptor = "()Z")
	@Override
	public boolean method7262() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "()V")
	@Override
	public void method7214() {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7252() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(IIIIII)V")
	public native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!a", name = "f", descriptor = "()Z")
	@Override
	public boolean method7221() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "x", descriptor = "()Z")
	@Override
	public boolean method7267() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!r;Lclient!kw;Lclient!m;Lclient!eca;I)V")
	@Override
	public void method7246(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class175 arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) Class72_Sub2 arg3) {
		this.method161(arg1, true);
		if (arg3 == null) {
			this.method159().G(this, arg0, arg2, null, 0, Static1.anIntArray8, Static1.anIntArray7, Static1.anIntArray9, Static1.aShortArray1, Static1.aByteArray3, arg1.aClass193_1.method4755(), Static1.anIntArray4);
		} else {
			Static1.anIntArray6[5] = 0;
			this.method159().G(this, arg0, arg2, Static1.anIntArray6, 0, Static1.anIntArray8, Static1.anIntArray7, Static1.anIntArray9, Static1.aShortArray1, Static1.aByteArray3, arg1.aClass193_1.method4755(), Static1.anIntArray4);
			arg3.anInt2130 = Static1.anIntArray6[0];
			arg3.anInt2131 = Static1.anIntArray6[1];
			arg3.anInt2132 = Static1.anIntArray6[2];
			arg3.anInt2133 = Static1.anIntArray6[3];
			arg3.anInt2129 = Static1.anIntArray6[4];
			arg3.aBoolean129 = Static1.anIntArray6[5] != 0;
		}
		@Pc(83) ma local83 = (ma) arg0;
		local83.method4697(0, arg2);
	}

	@OriginalMember(owner = "client!a", name = "q", descriptor = "(IIII)V")
	public native void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7226(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aB1 = null;
			this.MA(null);
		} else {
			@Pc(10) b local10 = (b) this.aClass17_1.method738((long) arg0.hashCode());
			this.aB1 = local10;
			this.MA(local10);
		}
	}

	@OriginalMember(owner = "client!a", name = "WA", descriptor = "(S)Z")
	private boolean method160(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class220 local9 = super.anInterface8_14.method878(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.RA(arg0, local9.aByte81, local9.aByte84, local9.aBoolean449, local9.aBoolean446, local9.aBoolean448, local9.aByte82, local9.aByte85, local9.aByte87, local9.aShort100, local9.anInt6250, local9.aBoolean453, local9.aBoolean447);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public void method7250(@OriginalArg(0) Class118 arg0) {
		this.aClass118_1 = arg0;
		this.TA(arg0);
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "()I")
	@Override
	public int method7217() {
		return 4;
	}

	@OriginalMember(owner = "client!a", name = "CA", descriptor = "()I")
	public native int CA();

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7277(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!a", name = "n", descriptor = "()V")
	public native void n();

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!kw;Z)V")
	private void method161(@OriginalArg(0) Class175 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class72_Sub1_Sub1 local15 = (Class72_Sub1_Sub1) arg0.aClass193_1.method4759(); local15 != null; local15 = (Class72_Sub1_Sub1) arg0.aClass193_1.method4757()) {
			Static1.anIntArray8[local1++] = local15.anInt2189;
			Static1.anIntArray8[local1++] = local15.anInt2190;
			Static1.anIntArray8[local1++] = local15.anInt2187;
			Static1.anIntArray7[local3++] = local15.anInt2182;
			Static1.aShortArray1[local7++] = (short) local15.anInt2188;
			Static1.anIntArray9[local5++] = local15.anInt2184;
			if (arg1) {
				Static1.aByteArray3[local9++] = local15.aByte37;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
	@Override
	public void method7232(@OriginalArg(0) int arg0) {
		this.aVArray1[arg0].method6990();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!a", name = "TA", descriptor = "(Lclient!m;)V")
	private native void TA(@OriginalArg(0) Class118 arg0);

	@OriginalMember(owner = "client!a", name = "p", descriptor = "()Z")
	@Override
	public boolean method7248() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "w", descriptor = "()V")
	private native void w();

	@OriginalMember(owner = "client!a", name = "b", descriptor = "()Z")
	@Override
	public boolean method7215() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7216(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aB1 == null) {
			throw new IllegalStateException("off");
		}
		this.aB1.method732(arg0, arg1);
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V")
	@Override
	public void method7239(@OriginalArg(0) int arg0) {
		this.anInt27 = arg0;
		this.aVArray1 = new v[this.anInt27];
		for (@Pc(9) int local9 = 0; local9 < this.anInt27; local9++) {
			this.aVArray1[local9] = new v(this, this.anInt25, this.anInt26);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!rn;Lclient!rn;FLclient!rn;)Lclient!rn;")
	@Override
	public Class45 method7233(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class45 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class45 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!a", name = "M", descriptor = "(F)V")
	public native void M(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!a", name = "g", descriptor = "(I)Lclient!u;")
	@Override
	public Class1_Sub8 method7263(@OriginalArg(0) int arg0) {
		@Pc(5) c local5 = new c(this, arg0);
		this.aClass37_1.method970(local5);
		return local5;
	}

	@OriginalMember(owner = "client!a", name = "ba", descriptor = "()I")
	public native int ba();

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	@Override
	public void method7231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class40 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.ca(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!a", name = "G", descriptor = "(ILclient!pa;II)V")
	public native void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "Q", descriptor = "()Ljava/lang/Object;")
	private Object method162() {
		return new e(this);
	}

	@OriginalMember(owner = "client!a", name = "B", descriptor = "(IIIIII)Z")
	public native boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!rn;)V")
	@Override
	public void method7230(@OriginalArg(0) Class45 arg0) {
	}

	@OriginalMember(owner = "client!a", name = "D", descriptor = "()V")
	@Override
	public void method7284() {
	}

	@OriginalMember(owner = "client!a", name = "ta", descriptor = "(II)V")
	public native void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(IIII)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "ea", descriptor = "(Lclient!u;)V")
	private native void ea(@OriginalArg(0) Class1_Sub8 arg0);

	@OriginalMember(owner = "client!a", name = "L", descriptor = "(I)V")
	public native void L(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "h", descriptor = "()V")
	@Override
	public void method7236() throws Exception_Sub1 {
		if (this.aB1 == null) {
			throw new IllegalStateException("off");
		}
		this.aB1.method733();
	}

	@OriginalMember(owner = "client!a", name = "Z", descriptor = "(I)V")
	public native void Z(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7274(@OriginalArg(0) Canvas arg0) {
		if (this.aB1.aCanvas2 == arg0) {
			this.method7226(null);
		}
		@Pc(16) b local16 = (b) this.aClass17_1.method738((long) arg0.hashCode());
		if (local16 != null) {
			local16.method7525();
			local16.method730();
		}
	}

	@OriginalMember(owner = "client!a", name = "A", descriptor = "(IIIII)V")
	protected native void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!a", name = "oa", descriptor = "(I[I[F)V")
	private native void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIF)Lclient!ww;")
	@Override
	public Class1_Sub2 method7249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub2_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "UA", descriptor = "(IIIII)V")
	public native void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	@Override
	public void method7260(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!a", name = "i", descriptor = "()V")
	@Override
	public void method7238() {
	}

	@OriginalMember(owner = "client!a", name = "h", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void h(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!a", name = "MA", descriptor = "(Lclient!b;)V")
	private native void MA(@OriginalArg(0) b arg0);
}
