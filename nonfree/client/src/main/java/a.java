import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class a extends Class39 implements Interface14 {

	@OriginalMember(owner = "client!a", name = "o", descriptor = "Lclient!c;")
	private c aC1;

	@OriginalMember(owner = "client!a", name = "D", descriptor = "Lclient!m;")
	private Class181 aClass181_2;

	@OriginalMember(owner = "client!a", name = "G", descriptor = "Lclient!b;")
	private b aB1;

	@OriginalMember(owner = "client!a", name = "I", descriptor = "I")
	private int anInt27;

	@OriginalMember(owner = "client!a", name = "K", descriptor = "[Lclient!v;")
	private v[] aVArray1;

	@OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!a", name = "q", descriptor = "Z")
	private boolean aBoolean1 = false;

	@OriginalMember(owner = "client!a", name = "r", descriptor = "Lclient!rk;")
	private final Class249 aClass249_1 = new Class249();

	@OriginalMember(owner = "client!a", name = "E", descriptor = "I")
	private final int anInt25 = 4096;

	@OriginalMember(owner = "client!a", name = "F", descriptor = "I")
	private final int anInt26 = 4096;

	@OriginalMember(owner = "client!a", name = "H", descriptor = "Lclient!ica;")
	private final Class127 aClass127_1 = new Class127(4);

	@OriginalMember(owner = "client!a", name = "J", descriptor = "Z")
	private boolean aBoolean2 = false;

	@OriginalMember(owner = "client!a", name = "C", descriptor = "Lclient!m;")
	private Class181 aClass181_1;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;)V")
	public a(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface12 arg1) {
		super(arg1);
		try {
			if (!Static467.method7030("sw3d")) {
				throw new RuntimeException("");
			}
			Static508.method7432();
			this.Y(super.anInterface12_15, 0, 0);
			Static368.method5873(false, true);
			this.aBoolean2 = true;
			this.aClass181_1 = new q();
			this.method6015(new q());
			this.method6074(1);
			this.method6047(0);
			if (arg0 != null) {
				this.method6038(arg0);
				this.method6051(arg0);
			}
		} catch (@Pc(78) Throwable local78) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "HA", descriptor = "(I)V")
	private native void HA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(IIII)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "u", descriptor = "()V")
	@Override
	public void method6056() {
	}

	@OriginalMember(owner = "client!a", name = "oa", descriptor = "(I[I[F)V")
	private native void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!a", name = "CA", descriptor = "()I")
	public native int CA();

	@OriginalMember(owner = "client!a", name = "q", descriptor = "(IIII)V")
	public native void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "x", descriptor = "()Z")
	@Override
	public boolean method6065() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
	@Override
	public void method6027(@OriginalArg(0) int arg0) {
		this.aVArray1[arg0].method7339();
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "()Z")
	@Override
	public boolean method6014() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "j", descriptor = "()V")
	@Override
	public void method6031() {
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "()Z")
	@Override
	public boolean method6013() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "i", descriptor = "()Z")
	@Override
	public boolean method6026() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method6021();
		if (this.nativeid != 0L) {
			Static508.method7434(this);
		}
	}

	@OriginalMember(owner = "client!a", name = "ta", descriptor = "(II)V")
	public native void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!a", name = "e", descriptor = "()Lclient!m;")
	@Override
	public Class181 method6022() {
		return this.aClass181_1;
	}

	@OriginalMember(owner = "client!a", name = "C", descriptor = "()Z")
	@Override
	public boolean method6080() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	@Override
	public void method6032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class209 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.ca(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!a", name = "M", descriptor = "(F)V")
	public native void M(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6057(@OriginalArg(0) Canvas arg0) {
		@Pc(8) b local8 = (b) this.aClass127_1.method3205((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.xa(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aB1.aCanvas1) {
			this.method6051(arg0);
		}
	}

	@OriginalMember(owner = "client!a", name = "Y", descriptor = "(Lclient!n;II)V")
	private native void Y(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public void method6015(@OriginalArg(0) Class181 arg0) {
		this.aClass181_2 = arg0;
		this.TA(arg0);
	}

	@OriginalMember(owner = "client!a", name = "ea", descriptor = "(Lclient!u;)V")
	private native void ea(@OriginalArg(0) Class2_Sub4 arg0);

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(Z)V")
	@Override
	public void method6058(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!a", name = "N", descriptor = "(IIII)V")
	public native void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "ra", descriptor = "()F")
	public native float ra();

	@OriginalMember(owner = "client!a", name = "B", descriptor = "()V")
	@Override
	public void method6076() {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!lh;)V")
	@Override
	public void method6059(@OriginalArg(0) Class58 arg0) {
	}

	@OriginalMember(owner = "client!a", name = "G", descriptor = "(ILclient!pa;II)V")
	public native void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "A", descriptor = "()Z")
	@Override
	public boolean method6075() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6006() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6051(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aB1 = null;
			this.MA(null);
		} else {
			@Pc(10) b local10 = (b) this.aClass127_1.method3205((long) arg0.hashCode());
			this.aB1 = local10;
			this.MA(local10);
		}
	}

	@OriginalMember(owner = "client!a", name = "h", descriptor = "()Z")
	@Override
	public boolean method6025() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "la", descriptor = "(FF)V")
	public native void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!gr;I)V")
	@Override
	public void method6046(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) Class6_Sub4[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method160().wa(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class6_Sub4 local15 = arg2[0];
		Static1.anIntArray7[5] = 0;
		this.method160().wa(this, arg0, arg1, Static1.anIntArray7, -1, arg3);
		local15.anInt3041 = Static1.anIntArray7[0];
		local15.anInt3043 = Static1.anIntArray7[1];
		local15.anInt3042 = Static1.anIntArray7[2];
		local15.anInt3044 = Static1.anIntArray7[3];
		local15.anInt3040 = Static1.anIntArray7[4];
		local15.aBoolean247 = Static1.anIntArray7[5] != 0;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I")
	@Override
	public int method6028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(II)I")
	@Override
	public int method6070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!a", name = "t", descriptor = "()V")
	@Override
	protected void method6055() {
		if (this.aBoolean1) {
			return;
		}
		this.aVArray1 = null;
		this.aB1 = null;
		this.aC1 = null;
		this.aClass181_1 = null;
		this.aClass127_1.method3204();
		for (@Pc(25) c local25 = (c) this.aClass249_1.method6527(); local25 != null; local25 = (c) this.aClass249_1.method6525()) {
			local25.za();
		}
		this.aClass249_1.method6530();
		this.w();
		if (this.aBoolean2) {
			Static456.method6972(false, true);
			this.aBoolean2 = false;
		}
		this.method159();
		Static508.method7431();
		this.aBoolean1 = true;
	}

	@OriginalMember(owner = "client!a", name = "t", descriptor = "(IIIIII)V")
	private native void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	@Override
	public void method6008(@OriginalArg(0) int arg0) {
		Static508.method7433();
		this.HA(arg0);
		for (@Pc(10) c local10 = (c) this.aClass249_1.method6527(); local10 != null; local10 = (c) this.aClass249_1.method6525()) {
			local10.O();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!oaa;)V")
	@Override
	public void method6019(@OriginalArg(0) Class208 arg0) {
		this.method157(arg0, false);
		this.method160().O(this, Static1.anIntArray5, Static1.anIntArray3, Static1.anIntArray4, Static1.aShortArray1, arg0.aClass210_1.method5358());
	}

	@OriginalMember(owner = "client!a", name = "IA", descriptor = "(III[I)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIII)Lclient!lh;")
	@Override
	public Class58 method6040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!a", name = "Z", descriptor = "(I)V")
	public native void Z(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "c", descriptor = "()I")
	public native int c();

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!bt;IIII)Lclient!r;")
	@Override
	public Class63 method6011(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new ma(this, this.aC1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIF)Lclient!at;")
	@Override
	public Class2_Sub5 method6077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub5_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I[Lclient!at;)V")
	@Override
	public void method6063(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub5[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static1.anIntArray2[local1++] = arg1[local3].method1672();
			Static1.anIntArray2[local1++] = arg1[local3].method1671();
			Static1.anIntArray2[local1++] = arg1[local3].method1662();
			Static1.anIntArray2[local1++] = arg1[local3].method1666();
			Static1.aFloatArray1[local3] = arg1[local3].method1665();
			Static1.anIntArray2[local1++] = arg1[local3].method1669();
		}
		this.oa(arg0, Static1.anIntArray2, Static1.aFloatArray1);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!oaa;Z)V")
	private void method157(@OriginalArg(0) Class208 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class6_Sub1_Sub2 local15 = (Class6_Sub1_Sub2) arg0.aClass210_1.method5361(); local15 != null; local15 = (Class6_Sub1_Sub2) arg0.aClass210_1.method5353()) {
			Static1.anIntArray5[local1++] = local15.anInt8123;
			Static1.anIntArray5[local1++] = local15.anInt8129;
			Static1.anIntArray5[local1++] = local15.anInt8124;
			Static1.anIntArray3[local3++] = local15.anInt8125;
			Static1.aShortArray1[local7++] = (short) local15.anInt8127;
			Static1.anIntArray4[local5++] = local15.anInt8122;
			if (arg1) {
				Static1.aByteArray1[local9++] = local15.aByte101;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	@Override
	public void method6012(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!a", name = "TA", descriptor = "(Lclient!m;)V")
	private native void TA(@OriginalArg(0) Class181 arg0);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6064(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aB1 == null) {
			throw new IllegalStateException("off");
		}
		this.aB1.method628(arg0, arg1);
	}

	@OriginalMember(owner = "client!a", name = "ca", descriptor = "(IIIIIILclient!pa;II)V")
	private native void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class209 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!a", name = "y", descriptor = "()Z")
	@Override
	public boolean method6066() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "v", descriptor = "(IIII)[I")
	public native int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "GA", descriptor = "(S)Z")
	private boolean method158(@OriginalArg(0) short arg0) {
		@Pc(2) Interface12 local2 = super.anInterface12_15;
		synchronized (super.anInterface12_15) {
			if (!super.anInterface12_15.method2572(arg0)) {
				return false;
			}
			@Pc(22) Class204 local22 = super.anInterface12_15.method2573(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(43) int[] local43;
			if (local22.aBoolean453) {
				local43 = super.anInterface12_15.method2574(0.7F, 128, arg0, 128);
			} else {
				local43 = super.anInterface12_15.method2571(128, 128, 0.7F, arg0, true);
			}
			this.h(arg0, local22.aByte83, local22.aByte82, local22.aBoolean458, local22.aBoolean460, local22.aBoolean459, local22.aByte87, local22.aByte84, local22.aByte85, local22.aShort118, local22.anInt6219, local22.aBoolean456, local22.aBoolean461, local43);
			return true;
		}
	}

	@OriginalMember(owner = "client!a", name = "L", descriptor = "(I)V")
	public native void L(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "f", descriptor = "()V")
	@Override
	public void method6023() {
	}

	@OriginalMember(owner = "client!a", name = "q", descriptor = "()Z")
	@Override
	public boolean method6043() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V")
	@Override
	public void method6047(@OriginalArg(0) int arg0) {
		this.aVArray1[arg0].method7341();
	}

	@OriginalMember(owner = "client!a", name = "m", descriptor = "(IFFFFF)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!a", name = "UA", descriptor = "(IIIII)V")
	public native void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([Lclient!r;Lclient!oaa;Lclient!m;[Lclient!gr;I)V")
	@Override
	public void method6030(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) Class6_Sub4[] arg3, @OriginalArg(4) int arg4) {
		this.method157(arg1, true);
		if (arg3 == null) {
			this.method160().N(this, arg0, arg2, null, arg4, Static1.anIntArray5, Static1.anIntArray3, Static1.anIntArray4, Static1.aShortArray1, Static1.aByteArray1, arg1.aClass210_1.method5358(), Static1.anIntArray6);
		} else {
			@Pc(28) Class6_Sub4 local28 = arg3[0];
			Static1.anIntArray7[5] = 0;
			this.method160().N(this, arg0, arg2, Static1.anIntArray7, arg4, Static1.anIntArray5, Static1.anIntArray3, Static1.anIntArray4, Static1.aShortArray1, Static1.aByteArray1, arg1.aClass210_1.method5358(), Static1.anIntArray6);
			local28.anInt3041 = Static1.anIntArray7[0];
			local28.anInt3043 = Static1.anIntArray7[1];
			local28.anInt3042 = Static1.anIntArray7[2];
			local28.anInt3044 = Static1.anIntArray7[3];
			local28.anInt3040 = Static1.anIntArray7[4];
			local28.aBoolean247 = Static1.anIntArray7[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) ma local98 = (ma) arg0[local88];
				local98.method4594(local86, arg2);
				if (local98.aClass192Array5 != null) {
					local86 += local98.aClass192Array5.length * 9;
				}
				if (local98.aClass169Array5 != null) {
					local86 += local98.aClass169Array5.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([IIIII)Lclient!ha;")
	@Override
	public Class35 method6049(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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

	@OriginalMember(owner = "client!a", name = "P", descriptor = "()F")
	public native float P();

	@OriginalMember(owner = "client!a", name = "YA", descriptor = "()I")
	public native int YA();

	@OriginalMember(owner = "client!a", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!a", name = "XA", descriptor = "()V")
	private void method159() {
		System.gc();
		System.runFinalization();
		Static508.method7433();
	}

	@OriginalMember(owner = "client!a", name = "E", descriptor = "()Lclient!v;")
	public v method160() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt27; local1++) {
			if (this.aVArray1[local1].aRunnable4 == Thread.currentThread()) {
				return this.aVArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method6060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.UA(arg0, arg1, arg2, arg4, arg5);
		this.UA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.e(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.e(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "JA", descriptor = "(IIII)V")
	public native void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "ba", descriptor = "()I")
	public native int ba();

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!r;Lclient!oaa;Lclient!m;Lclient!gr;I)V")
	@Override
	public void method6020(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) Class6_Sub4 arg3) {
		this.method157(arg1, true);
		if (arg3 == null) {
			this.method160().G(this, arg0, arg2, null, 0, Static1.anIntArray5, Static1.anIntArray3, Static1.anIntArray4, Static1.aShortArray1, Static1.aByteArray1, arg1.aClass210_1.method5358(), Static1.anIntArray6);
		} else {
			Static1.anIntArray7[5] = 0;
			this.method160().G(this, arg0, arg2, Static1.anIntArray7, 0, Static1.anIntArray5, Static1.anIntArray3, Static1.anIntArray4, Static1.aShortArray1, Static1.aByteArray1, arg1.aClass210_1.method5358(), Static1.anIntArray6);
			arg3.anInt3041 = Static1.anIntArray7[0];
			arg3.anInt3043 = Static1.anIntArray7[1];
			arg3.anInt3042 = Static1.anIntArray7[2];
			arg3.anInt3044 = Static1.anIntArray7[3];
			arg3.anInt3040 = Static1.anIntArray7[4];
			arg3.aBoolean247 = Static1.anIntArray7[5] != 0;
		}
		@Pc(83) ma local83 = (ma) arg0;
		local83.method4594(0, arg2);
	}

	@OriginalMember(owner = "client!a", name = "MA", descriptor = "(Lclient!b;)V")
	private native void MA(@OriginalArg(0) b arg0);

	@OriginalMember(owner = "client!a", name = "D", descriptor = "()Z")
	@Override
	public boolean method6082() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "za", descriptor = "(IIIIII[BII)V")
	public native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6038(@OriginalArg(0) Canvas arg0) {
		@Pc(8) b local8 = (b) this.aClass127_1.method3205((long) arg0.hashCode());
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
		this.aClass127_1.method3213(local8, (long) arg0.hashCode());
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!lh;Lclient!lh;FLclient!lh;)Lclient!lh;")
	@Override
	public Class58 method6045(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class58 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(I)Lclient!u;")
	@Override
	public Class2_Sub4 method6033(@OriginalArg(0) int arg0) {
		@Pc(5) c local5 = new c(this, arg0);
		this.aClass249_1.method6523(local5);
		return local5;
	}

	@OriginalMember(owner = "client!a", name = "z", descriptor = "()Z")
	@Override
	public boolean method6073() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "o", descriptor = "()Z")
	@Override
	public boolean method6037() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(IIIIII)V")
	public native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!a", name = "E", descriptor = "(III)V")
	public native void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!a", name = "k", descriptor = "()V")
	@Override
	public void method6034() throws Exception_Sub1 {
		if (this.aB1 == null) {
			throw new IllegalStateException("off");
		}
		this.aB1.method626();
	}

	@OriginalMember(owner = "client!a", name = "RA", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void RA(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!a", name = "v", descriptor = "()V")
	@Override
	public void method6062() {
	}

	@OriginalMember(owner = "client!a", name = "r", descriptor = "()I")
	@Override
	public int method6053() {
		return 4;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	@Override
	public void method6010(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!a", name = "xa", descriptor = "()V")
	public native void xa();

	@OriginalMember(owner = "client!a", name = "a", descriptor = "()Lclient!rr;")
	@Override
	public Class254 method6009() {
		return new Class254(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!a", name = "F", descriptor = "(IIII)V")
	public native void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "w", descriptor = "()V")
	private native void w();

	@OriginalMember(owner = "client!a", name = "B", descriptor = "(IIIIII)Z")
	public native boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6007(@OriginalArg(0) Canvas arg0) {
		if (this.aB1.aCanvas1 == arg0) {
			this.method6051(null);
		}
		@Pc(16) b local16 = (b) this.aClass127_1.method3205((long) arg0.hashCode());
		if (local16 != null) {
			local16.method7802();
			local16.method629();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!dd;[Lclient!qr;Z)Lclient!ra;")
	@Override
	public Class47 method6078(@OriginalArg(0) Class52 arg0, @OriginalArg(1) Class241[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt7606;
			local7[local11] = arg1[local11].anInt7604;
			if (arg1[local11].aByteArray101 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new w(this, this.aC1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!a", name = "A", descriptor = "(IIIII)V")
	protected native void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method6083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.t(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "n", descriptor = "()V")
	public native void n();

	@OriginalMember(owner = "client!a", name = "Q", descriptor = "()Ljava/lang/Object;")
	private Object method161() {
		return new e(this);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method160().da(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!a", name = "WA", descriptor = "(S)Z")
	private boolean method162(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class204 local9 = super.anInterface12_15.method2573(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.RA(arg0, local9.aByte83, local9.aByte82, local9.aBoolean458, local9.aBoolean460, local9.aBoolean459, local9.aByte87, local9.aByte84, local9.aByte85, local9.aShort118, local9.anInt6219, local9.aBoolean456, local9.aBoolean461);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	@Override
	public Class209 method6017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new ta(this, this.aC1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!qr;Z)Lclient!ha;")
	@Override
	public Class35 method6018(@OriginalArg(0) Class241 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray589;
		@Pc(5) byte[] local5 = arg0.aByteArray102;
		@Pc(8) int local8 = arg0.anInt7606;
		@Pc(11) int local11 = arg0.anInt7604;
		@Pc(32) Class35 local32;
		if (arg0.aByteArray101 == null) {
			local32 = new ca(this, this.aC1, local2, local5, 0, arg0.anInt7606, arg0.anInt7606, arg0.anInt7604);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray101;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray589[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new va(this, this.aC1, local40, 0, arg0.anInt7606, arg0.anInt7606, arg0.anInt7604);
				} else {
					local32 = new t(this, this.aC1, local40, 0, arg0.anInt7606, arg0.anInt7606, arg0.anInt7604);
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
		local32.KA(arg0.anInt7603, arg0.anInt7605, arg0.anInt7601, arg0.anInt7602);
		return local32;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public Class75 method6081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new s(this, this.aC1, arg0, arg1, arg2, arg3, 128, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "s", descriptor = "()Z")
	@Override
	public boolean method6054() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(IIIII)V")
	public native void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!a", name = "NA", descriptor = "(Z)V")
	public native void NA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public void method6050(@OriginalArg(0) Class2_Sub4 arg0) {
		this.aC1 = (c) arg0;
		this.ea(arg0);
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)V")
	@Override
	public void method6044(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!a", name = "l", descriptor = "()Lclient!m;")
	@Override
	public Class181 method6035() {
		return new q();
	}

	@OriginalMember(owner = "client!a", name = "h", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void h(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6069(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!a", name = "p", descriptor = "()V")
	@Override
	public void method6041() {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIZ)Lclient!ha;")
	@Override
	public Class35 method6072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new va(this, this.aC1, arg0, arg1, arg2, arg3) : new t(this, this.aC1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!a", name = "g", descriptor = "()Z")
	@Override
	public boolean method6024() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "m", descriptor = "()Z")
	@Override
	public boolean method6036() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "([I)V")
	public native void d(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!a", name = "g", descriptor = "(I)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0) {
		this.anInt27 = arg0;
		this.aVArray1 = new v[this.anInt27];
		for (@Pc(9) int local9 = 0; local9 < this.anInt27; local9++) {
			this.aVArray1[local9] = new v(this, this.anInt26, this.anInt25);
		}
	}
}
