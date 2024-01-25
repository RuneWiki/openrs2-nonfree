import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class a extends Class4 implements Interface14 {

	@OriginalMember(owner = "client!a", name = "q", descriptor = "Lclient!c;")
	private c aC1;

	@OriginalMember(owner = "client!a", name = "x", descriptor = "Lclient!m;")
	private Class128 aClass128_1;

	@OriginalMember(owner = "client!a", name = "D", descriptor = "Lclient!b;")
	private b aB1;

	@OriginalMember(owner = "client!a", name = "K", descriptor = "[Lclient!v;")
	private v[] aVArray1;

	@OriginalMember(owner = "client!a", name = "L", descriptor = "I")
	private int anInt29;

	@OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!a", name = "r", descriptor = "Z")
	private boolean aBoolean1 = false;

	@OriginalMember(owner = "client!a", name = "t", descriptor = "Lclient!ui;")
	private final Class295 aClass295_1 = new Class295();

	@OriginalMember(owner = "client!a", name = "u", descriptor = "I")
	private final int anInt27 = 4096;

	@OriginalMember(owner = "client!a", name = "F", descriptor = "I")
	private final int anInt28 = 4096;

	@OriginalMember(owner = "client!a", name = "z", descriptor = "Lclient!pt;")
	private final Class230 aClass230_1 = new Class230(4);

	@OriginalMember(owner = "client!a", name = "M", descriptor = "Z")
	private boolean aBoolean2 = false;

	@OriginalMember(owner = "client!a", name = "H", descriptor = "Lclient!m;")
	private Class128 aClass128_2;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;)V")
	public a(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface13 arg1) {
		super(arg1);
		try {
			if (!Static259.method4668("sw3d")) {
				throw new RuntimeException("");
			}
			Static300.method5314();
			this.Y(super.anInterface13_13, 0, 0);
			Static290.method5100(false, true);
			this.aBoolean2 = true;
			this.aClass128_2 = new q();
			this.method7198(new q());
			this.method7185(1);
			this.method7196(0);
			if (arg0 != null) {
				this.method7217(arg0);
				this.method7174(arg0);
			}
		} catch (@Pc(78) Throwable local78) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "v", descriptor = "()V")
	@Override
	public void method7202() {
	}

	@OriginalMember(owner = "client!a", name = "y", descriptor = "()Lclient!fd;")
	@Override
	public Class98 method7207() {
		return new Class98(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	@Override
	public void method7212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class28 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.ca(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!a", name = "P", descriptor = "()F")
	public native float P();

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public void method7198(@OriginalArg(0) Class128 arg0) {
		this.aClass128_1 = arg0;
		this.TA(arg0);
	}

	@OriginalMember(owner = "client!a", name = "E", descriptor = "(III)V")
	public native void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!a", name = "i", descriptor = "()V")
	@Override
	public void method7164() {
		if (this.aB1 == null) {
			throw new IllegalStateException("off");
		}
		this.aB1.method740();
	}

	@OriginalMember(owner = "client!a", name = "F", descriptor = "(IIII)V")
	public native void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ei;IIII)Lclient!r;")
	@Override
	public Class97 method7192(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new ma(this, this.aC1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!a", name = "j", descriptor = "()Lclient!m;")
	@Override
	public Class128 method7165() {
		return this.aClass128_2;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7178(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aB1 == null) {
			throw new IllegalStateException("off");
		}
		this.aB1.method741(arg0, arg1);
	}

	@OriginalMember(owner = "client!a", name = "ea", descriptor = "(Lclient!u;)V")
	private native void ea(@OriginalArg(0) Class1_Sub23 arg0);

	@OriginalMember(owner = "client!a", name = "Y", descriptor = "(Lclient!n;II)V")
	private native void Y(@OriginalArg(0) Interface13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!cf;I)V")
	@Override
	public void method7159(@OriginalArg(0) Class97[] arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) Class46_Sub1[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method160().wa(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class46_Sub1 local15 = arg2[0];
		Static1.anIntArray4[5] = 0;
		this.method160().wa(this, arg0, arg1, Static1.anIntArray4, -1, arg3);
		local15.anInt1433 = Static1.anIntArray4[0];
		local15.anInt1435 = Static1.anIntArray4[1];
		local15.anInt1437 = Static1.anIntArray4[2];
		local15.anInt1434 = Static1.anIntArray4[3];
		local15.anInt1436 = Static1.anIntArray4[4];
		local15.aBoolean109 = Static1.anIntArray4[5] != 0;
	}

	@OriginalMember(owner = "client!a", name = "o", descriptor = "()V")
	@Override
	public void method7173() {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public void method7210(@OriginalArg(0) Class1_Sub23 arg0) {
		this.aC1 = (c) arg0;
		this.ea(arg0);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!mv;)V")
	@Override
	public void method7218(@OriginalArg(0) Class103 arg0) {
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(IIIIII)V")
	public native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!a", name = "f", descriptor = "()V")
	@Override
	public void method7154() {
	}

	@OriginalMember(owner = "client!a", name = "ra", descriptor = "()F")
	public native float ra();

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)V")
	@Override
	public void method7214(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(IIII)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "Q", descriptor = "()Ljava/lang/Object;")
	private Object method155() {
		return new e(this);
	}

	@OriginalMember(owner = "client!a", name = "L", descriptor = "(I)V")
	public native void L(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "c", descriptor = "()I")
	public native int c();

	@OriginalMember(owner = "client!a", name = "ba", descriptor = "()I")
	public native int ba();

	@OriginalMember(owner = "client!a", name = "HA", descriptor = "(I)V")
	private native void HA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "q", descriptor = "()Z")
	@Override
	public boolean method7182() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	@Override
	public void method7177(@OriginalArg(0) int arg0) {
		Static300.method5318();
		this.HA(arg0);
		for (@Pc(10) c local10 = (c) this.aClass295_1.method7543(); local10 != null; local10 = (c) this.aClass295_1.method7540()) {
			local10.O();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIII)Lclient!mv;")
	@Override
	public Class103 method7172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!fc;[Lclient!dp;Z)Lclient!ra;")
	@Override
	public Class36 method7193(@OriginalArg(0) Class96 arg0, @OriginalArg(1) Class70[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt2013;
			local7[local11] = arg1[local11].anInt2012;
			if (arg1[local11].aByteArray18 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new w(this, this.aC1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "()Z")
	@Override
	public boolean method7152() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7188(@OriginalArg(0) Canvas arg0) {
		if (this.aB1.aCanvas3 == arg0) {
			this.method7174(null);
		}
		@Pc(16) b local16 = (b) this.aClass230_1.method6144((long) arg0.hashCode());
		if (local16 != null) {
			local16.method8239();
			local16.method743();
		}
	}

	@OriginalMember(owner = "client!a", name = "ta", descriptor = "(II)V")
	public native void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!a", name = "NA", descriptor = "(Z)V")
	public native void NA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!a", name = "k", descriptor = "()Z")
	@Override
	public boolean method7166() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "n", descriptor = "()V")
	public native void n();

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I")
	@Override
	public int method7167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!a", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!a", name = "t", descriptor = "(IIIIII)V")
	private native void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!a", name = "Z", descriptor = "(I)V")
	public native void Z(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "GA", descriptor = "(S)Z")
	private boolean method156(@OriginalArg(0) short arg0) {
		@Pc(2) Interface13 local2 = super.anInterface13_13;
		synchronized (super.anInterface13_13) {
			if (!super.anInterface13_13.method5788(arg0)) {
				return false;
			}
			@Pc(22) Class296 local22 = super.anInterface13_13.method5789(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(43) int[] local43;
			if (local22.aBoolean637) {
				local43 = super.anInterface13_13.method5786(0.7F, 128, 128, arg0);
			} else {
				local43 = super.anInterface13_13.method5790(128, true, 0.7F, arg0, 128);
			}
			this.h(arg0, local22.aByte103, local22.aByte99, local22.aBoolean641, local22.aBoolean640, local22.aBoolean642, local22.aByte101, local22.aByte105, local22.aByte104, local22.aShort116, local22.anInt8644, local22.aBoolean645, local22.aBoolean643, local43);
			return true;
		}
	}

	@OriginalMember(owner = "client!a", name = "p", descriptor = "()Z")
	@Override
	public boolean method7180() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "N", descriptor = "(IIII)V")
	public native void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "za", descriptor = "(IIIIII[BII)V")
	public native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!a", name = "b", descriptor = "()Z")
	@Override
	public boolean method7151() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([Lclient!r;Lclient!ka;Lclient!m;[Lclient!cf;I)V")
	@Override
	public void method7175(@OriginalArg(0) Class97[] arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(2) Class128 arg2, @OriginalArg(3) Class46_Sub1[] arg3, @OriginalArg(4) int arg4) {
		this.method159(arg1, true);
		if (arg3 == null) {
			this.method160().N(this, arg0, arg2, null, arg4, Static1.anIntArray5, Static1.anIntArray7, Static1.anIntArray6, Static1.aShortArray1, Static1.aByteArray1, arg1.aClass185_1.method5306(), Static1.anIntArray8);
		} else {
			@Pc(28) Class46_Sub1 local28 = arg3[0];
			Static1.anIntArray4[5] = 0;
			this.method160().N(this, arg0, arg2, Static1.anIntArray4, arg4, Static1.anIntArray5, Static1.anIntArray7, Static1.anIntArray6, Static1.aShortArray1, Static1.aByteArray1, arg1.aClass185_1.method5306(), Static1.anIntArray8);
			local28.anInt1433 = Static1.anIntArray4[0];
			local28.anInt1435 = Static1.anIntArray4[1];
			local28.anInt1437 = Static1.anIntArray4[2];
			local28.anInt1434 = Static1.anIntArray4[3];
			local28.anInt1436 = Static1.anIntArray4[4];
			local28.aBoolean109 = Static1.anIntArray4[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) ma local98 = (ma) arg0[local88];
				local98.method5066(local86, arg2);
				if (local98.aClass68Array4 != null) {
					local86 += local98.aClass68Array4.length * 9;
				}
				if (local98.aClass106Array4 != null) {
					local86 += local98.aClass106Array4.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "l", descriptor = "()V")
	@Override
	public void method7168() {
	}

	@OriginalMember(owner = "client!a", name = "xa", descriptor = "()V")
	public native void xa();

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method160().da(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
	@Override
	public void method7201(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!a", name = "w", descriptor = "()V")
	private native void w();

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I[Lclient!cba;)V")
	@Override
	public void method7222(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static1.anIntArray9[local1++] = arg1[local3].method4306();
			Static1.anIntArray9[local1++] = arg1[local3].method4305();
			Static1.anIntArray9[local1++] = arg1[local3].method4314();
			Static1.anIntArray9[local1++] = arg1[local3].method4311();
			Static1.aFloatArray1[local3] = arg1[local3].method4310();
			Static1.anIntArray9[local1++] = arg1[local3].method4313();
		}
		this.oa(arg0, Static1.anIntArray9, Static1.aFloatArray1);
	}

	@OriginalMember(owner = "client!a", name = "t", descriptor = "()Z")
	@Override
	public boolean method7195() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "D", descriptor = "()Z")
	@Override
	public boolean method7223() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "MA", descriptor = "(Lclient!b;)V")
	private native void MA(@OriginalArg(0) b arg0);

	@OriginalMember(owner = "client!a", name = "WA", descriptor = "(S)Z")
	private boolean method157(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class296 local9 = super.anInterface13_13.method5789(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.RA(arg0, local9.aByte103, local9.aByte99, local9.aBoolean641, local9.aBoolean640, local9.aBoolean642, local9.aByte101, local9.aByte105, local9.aByte104, local9.aShort116, local9.anInt8644, local9.aBoolean645, local9.aBoolean643);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "B", descriptor = "()Z")
	@Override
	public boolean method7219() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
	@Override
	public void method7196(@OriginalArg(0) int arg0) {
		this.aVArray1[arg0].method7705();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!mv;Lclient!mv;FLclient!mv;)Lclient!mv;")
	@Override
	public Class103 method7200(@OriginalArg(0) Class103 arg0, @OriginalArg(1) Class103 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class103 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(II)I")
	@Override
	public int method7184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "()Z")
	@Override
	public boolean method7148() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "z", descriptor = "()Z")
	@Override
	public boolean method7208() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "XA", descriptor = "()V")
	private void method158() {
		System.gc();
		System.runFinalization();
		Static300.method5318();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ka;Z)V")
	private void method159(@OriginalArg(0) Class158 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class46_Sub3_Sub1 local15 = (Class46_Sub3_Sub1) arg0.aClass185_1.method5309(); local15 != null; local15 = (Class46_Sub3_Sub1) arg0.aClass185_1.method5310()) {
			Static1.anIntArray5[local1++] = local15.anInt4593;
			Static1.anIntArray5[local1++] = local15.anInt4601;
			Static1.anIntArray5[local1++] = local15.anInt4597;
			Static1.anIntArray7[local3++] = local15.anInt4605;
			Static1.aShortArray1[local7++] = (short) local15.anInt4600;
			Static1.anIntArray6[local5++] = local15.anInt4604;
			if (arg1) {
				Static1.aByteArray1[local9++] = local15.aByte58;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "v", descriptor = "(IIII)[I")
	public native int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ka;)V")
	@Override
	public void method7179(@OriginalArg(0) Class158 arg0) {
		this.method159(arg0, false);
		this.method160().O(this, Static1.anIntArray5, Static1.anIntArray7, Static1.anIntArray6, Static1.aShortArray1, arg0.aClass185_1.method5306());
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([IIIII)Lclient!ha;")
	@Override
	public Class104 method7156(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7217(@OriginalArg(0) Canvas arg0) {
		@Pc(8) b local8 = (b) this.aClass230_1.method6144((long) arg0.hashCode());
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
		this.aClass230_1.method6139((long) arg0.hashCode(), local8);
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "()Z")
	@Override
	public boolean method7153() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "JA", descriptor = "(IIII)V")
	public native void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7158(@OriginalArg(0) Canvas arg0) {
		@Pc(8) b local8 = (b) this.aClass230_1.method6144((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.xa(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aB1.aCanvas3) {
			this.method7174(arg0);
		}
	}

	@OriginalMember(owner = "client!a", name = "ca", descriptor = "(IIIIIILclient!pa;II)V")
	private native void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class28 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!a", name = "CA", descriptor = "()I")
	public native int CA();

	@OriginalMember(owner = "client!a", name = "UA", descriptor = "(IIIII)V")
	public native void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!a", name = "A", descriptor = "()Z")
	@Override
	public boolean method7209() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "([I)V")
	public native void d(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!a", name = "G", descriptor = "(ILclient!pa;II)V")
	public native void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "h", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void h(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	@Override
	public Class28 method7186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new ta(this, this.aC1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!a", name = "r", descriptor = "()Z")
	@Override
	public boolean method7183() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "q", descriptor = "(IIII)V")
	public native void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "IA", descriptor = "(III[I)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!a", name = "RA", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void RA(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7174(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aB1 = null;
			this.MA(null);
		} else {
			@Pc(10) b local10 = (b) this.aClass230_1.method6144((long) arg0.hashCode());
			this.aB1 = local10;
			this.MA(local10);
		}
	}

	@OriginalMember(owner = "client!a", name = "g", descriptor = "(I)Lclient!u;")
	@Override
	public Class1_Sub23 method7220(@OriginalArg(0) int arg0) {
		@Pc(5) c local5 = new c(this, arg0);
		this.aClass295_1.method7533(local5);
		return local5;
	}

	@OriginalMember(owner = "client!a", name = "YA", descriptor = "()I")
	public native int YA();

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!dp;Z)Lclient!ha;")
	@Override
	public Class104 method7149(@OriginalArg(0) Class70 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray142;
		@Pc(5) byte[] local5 = arg0.aByteArray19;
		@Pc(8) int local8 = arg0.anInt2013;
		@Pc(11) int local11 = arg0.anInt2012;
		@Pc(32) Class104 local32;
		if (arg0.aByteArray18 == null) {
			local32 = new ca(this, this.aC1, local2, local5, 0, arg0.anInt2013, arg0.anInt2013, arg0.anInt2012);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray18;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray142[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new va(this, this.aC1, local40, 0, arg0.anInt2013, arg0.anInt2013, arg0.anInt2012);
				} else {
					local32 = new t(this, this.aC1, local40, 0, arg0.anInt2013, arg0.anInt2013, arg0.anInt2012);
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
		local32.KA(arg0.anInt2011, arg0.anInt2010, arg0.anInt2015, arg0.anInt2014);
		return local32;
	}

	@OriginalMember(owner = "client!a", name = "E", descriptor = "()Lclient!v;")
	public v method160() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt29; local1++) {
			if (this.aVArray1[local1].aRunnable4 == Thread.currentThread()) {
				return this.aVArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!a", name = "h", descriptor = "()I")
	@Override
	public int method7163() {
		return 4;
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method7203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.t(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "B", descriptor = "(IIIIII)Z")
	public native boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIF)Lclient!cba;")
	@Override
	public Class1_Sub5 method7170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub5_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "TA", descriptor = "(Lclient!m;)V")
	private native void TA(@OriginalArg(0) Class128 arg0);

	@OriginalMember(owner = "client!a", name = "u", descriptor = "()V")
	@Override
	protected void method7197() {
		if (this.aBoolean1) {
			return;
		}
		this.aVArray1 = null;
		this.aB1 = null;
		this.aC1 = null;
		this.aClass128_2 = null;
		this.aClass230_1.method6141();
		for (@Pc(25) c local25 = (c) this.aClass295_1.method7543(); local25 != null; local25 = (c) this.aClass295_1.method7540()) {
			local25.za();
		}
		this.aClass295_1.method7541();
		this.w();
		if (this.aBoolean2) {
			Static133.method7848(true, false);
			this.aBoolean2 = false;
		}
		this.method158();
		Static300.method5317();
		this.aBoolean1 = true;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7215() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	@Override
	public void method7160(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(IIIIZ)Lclient!ha;")
	@Override
	public Class104 method7199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new va(this, this.aC1, arg0, arg1, arg2, arg3) : new t(this, this.aC1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!a", name = "C", descriptor = "()V")
	@Override
	public void method7221() {
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(Z)V")
	@Override
	public void method7216(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V")
	@Override
	public void method7213(@OriginalArg(0) int arg0) {
		this.aVArray1[arg0].method7706();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7206(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(IIIII)V")
	public native void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method7150();
		if (this.nativeid != 0L) {
			Static300.method5316(this);
		}
	}

	@OriginalMember(owner = "client!a", name = "m", descriptor = "(IFFFFF)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!r;Lclient!ka;Lclient!m;Lclient!cf;I)V")
	@Override
	public void method7211(@OriginalArg(0) Class97 arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(2) Class128 arg2, @OriginalArg(3) Class46_Sub1 arg3) {
		this.method159(arg1, true);
		if (arg3 == null) {
			this.method160().G(this, arg0, arg2, null, 0, Static1.anIntArray5, Static1.anIntArray7, Static1.anIntArray6, Static1.aShortArray1, Static1.aByteArray1, arg1.aClass185_1.method5306(), Static1.anIntArray8);
		} else {
			Static1.anIntArray4[5] = 0;
			this.method160().G(this, arg0, arg2, Static1.anIntArray4, 0, Static1.anIntArray5, Static1.anIntArray7, Static1.anIntArray6, Static1.aShortArray1, Static1.aByteArray1, arg1.aClass185_1.method5306(), Static1.anIntArray8);
			arg3.anInt1433 = Static1.anIntArray4[0];
			arg3.anInt1435 = Static1.anIntArray4[1];
			arg3.anInt1437 = Static1.anIntArray4[2];
			arg3.anInt1434 = Static1.anIntArray4[3];
			arg3.anInt1436 = Static1.anIntArray4[4];
			arg3.aBoolean109 = Static1.anIntArray4[5] != 0;
		}
		@Pc(83) ma local83 = (ma) arg0;
		local83.method5066(0, arg2);
	}

	@OriginalMember(owner = "client!a", name = "s", descriptor = "()Lclient!m;")
	@Override
	public Class128 method7189() {
		return new q();
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	@Override
	public void method7185(@OriginalArg(0) int arg0) {
		this.anInt29 = arg0;
		this.aVArray1 = new v[this.anInt29];
		for (@Pc(9) int local9 = 0; local9 < this.anInt29; local9++) {
			this.aVArray1[local9] = new v(this, this.anInt27, this.anInt28);
		}
	}

	@OriginalMember(owner = "client!a", name = "g", descriptor = "()V")
	@Override
	public void method7161() {
	}

	@OriginalMember(owner = "client!a", name = "x", descriptor = "()Z")
	@Override
	public boolean method7204() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "m", descriptor = "()Z")
	@Override
	public boolean method7171() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method7181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.UA(arg0, arg1, arg2, arg4, arg5);
		this.UA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.e(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.e(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "oa", descriptor = "(I[I[F)V")
	private native void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!a", name = "M", descriptor = "(F)V")
	public native void M(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!a", name = "A", descriptor = "(IIIII)V")
	protected native void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public Class7 method7187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new s(this, this.aC1, arg0, arg1, arg2, arg3, 128, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "la", descriptor = "(FF)V")
	public native void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);
}
