import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class a extends Class42 implements Interface12 {

	@OriginalMember(owner = "client!a", name = "B", descriptor = "Lclient!c;")
	private c aC1;

	@OriginalMember(owner = "client!a", name = "M", descriptor = "Lclient!m;")
	private Class91 aClass91_2;

	@OriginalMember(owner = "client!a", name = "O", descriptor = "Lclient!b;")
	private b aB1;

	@OriginalMember(owner = "client!a", name = "Q", descriptor = "[Lclient!v;")
	private v[] aVArray1;

	@OriginalMember(owner = "client!a", name = "R", descriptor = "I")
	private int anInt33;

	@OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "Z")
	private boolean aBoolean1 = false;

	@OriginalMember(owner = "client!a", name = "E", descriptor = "Lclient!dm;")
	private final Class73 aClass73_1 = new Class73();

	@OriginalMember(owner = "client!a", name = "L", descriptor = "I")
	private final int anInt31 = 4096;

	@OriginalMember(owner = "client!a", name = "N", descriptor = "I")
	private final int anInt32 = 4096;

	@OriginalMember(owner = "client!a", name = "J", descriptor = "Lclient!dea;")
	private final Class68 aClass68_1 = new Class68(4);

	@OriginalMember(owner = "client!a", name = "P", descriptor = "Z")
	private boolean aBoolean2 = false;

	@OriginalMember(owner = "client!a", name = "I", descriptor = "Lclient!m;")
	private Class91 aClass91_1;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;)V")
	public a(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface11 arg1) {
		super(arg1);
		try {
			if (!Static222.method4058("sw3d")) {
				throw new RuntimeException("");
			}
			Static229.method4114();
			this.Y(super.anInterface11_11, 0, 0);
			Static292.method4744(true, false);
			this.aBoolean2 = true;
			this.aClass91_1 = new q();
			this.method5855(new q());
			this.method5797(1);
			this.method5804(0);
			if (arg0 != null) {
				this.method5789(arg0);
				this.method5846(arg0);
			}
		} catch (@Pc(78) Throwable local78) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "t", descriptor = "(IIIIII)V")
	private native void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!a", name = "l", descriptor = "()V")
	@Override
	public void method5821() throws Exception_Sub1 {
		if (this.aB1 == null) {
			throw new IllegalStateException("off");
		}
		this.aB1.method543();
	}

	@OriginalMember(owner = "client!a", name = "GA", descriptor = "(S)Z")
	private boolean method161(@OriginalArg(0) short arg0) {
		@Pc(2) Interface11 local2 = super.anInterface11_11;
		synchronized (super.anInterface11_11) {
			if (!super.anInterface11_11.method6213(arg0)) {
				return false;
			}
			@Pc(22) Class278 local22 = super.anInterface11_11.method6215(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(43) int[] local43;
			if (local22.aBoolean569) {
				local43 = super.anInterface11_11.method6210(0.7F, 128, arg0, 128);
			} else {
				local43 = super.anInterface11_11.method6211(true, arg0, 128, 128, 0.7F);
			}
			this.h(arg0, local22.aByte84, local22.aByte85, local22.aBoolean571, local22.aBoolean568, local22.aBoolean573, local22.aByte82, local22.aByte88, local22.aByte87, local22.aShort96, local22.anInt8273, local22.aBoolean574, local22.aBoolean570, local43);
			return true;
		}
	}

	@OriginalMember(owner = "client!a", name = "t", descriptor = "()Z")
	@Override
	public boolean method5836() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "p", descriptor = "()Lclient!la;")
	@Override
	public Class179 method5828() {
		return new Class179(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "()Z")
	@Override
	public boolean method5808() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	@Override
	public void method5797(@OriginalArg(0) int arg0) {
		this.anInt33 = arg0;
		this.aVArray1 = new v[this.anInt33];
		for (@Pc(9) int local9 = 0; local9 < this.anInt33; local9++) {
			this.aVArray1[local9] = new v(this, this.anInt31, this.anInt32);
		}
	}

	@OriginalMember(owner = "client!a", name = "NA", descriptor = "(Z)V")
	public native void NA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!a", name = "r", descriptor = "()Z")
	@Override
	public boolean method5830() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5791(@OriginalArg(0) Canvas arg0) {
		if (this.aB1.aCanvas1 == arg0) {
			this.method5846(null);
		}
		@Pc(16) b local16 = (b) this.aClass68_1.method1917((long) arg0.hashCode());
		if (local16 != null) {
			local16.method7967();
			local16.method541();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	@Override
	public void method5793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class145 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.ca(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(IIIII)V")
	public native void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!a", name = "E", descriptor = "()Lclient!v;")
	public v method162() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt33; local1++) {
			if (this.aVArray1[local1].aRunnable4 == Thread.currentThread()) {
				return this.aVArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "()V")
	@Override
	protected void method5800() {
		if (this.aBoolean1) {
			return;
		}
		this.aVArray1 = null;
		this.aB1 = null;
		this.aC1 = null;
		this.aClass91_1 = null;
		this.aClass68_1.method1922();
		for (@Pc(25) c local25 = (c) this.aClass73_1.method2005(); local25 != null; local25 = (c) this.aClass73_1.method2009()) {
			local25.za();
		}
		this.aClass73_1.method2014();
		this.w();
		if (this.aBoolean2) {
			Static29.method558(true, false);
			this.aBoolean2 = false;
		}
		this.method163();
		Static229.method4112();
		this.aBoolean1 = true;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!a", name = "XA", descriptor = "()V")
	private void method163() {
		System.gc();
		System.runFinalization();
		Static229.method4113();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5803(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
	@Override
	public void method5804(@OriginalArg(0) int arg0) {
		this.aVArray1[arg0].method7483();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "()V")
	@Override
	public void method5792() {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I")
	@Override
	public int method5820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!a", name = "g", descriptor = "()V")
	@Override
	public void method5810() {
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "()V")
	@Override
	public void method5794() {
	}

	@OriginalMember(owner = "client!a", name = "q", descriptor = "(IIII)V")
	public native void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "o", descriptor = "()I")
	@Override
	public int method5825() {
		return 4;
	}

	@OriginalMember(owner = "client!a", name = "YA", descriptor = "()I")
	public native int YA();

	@OriginalMember(owner = "client!a", name = "C", descriptor = "()Z")
	@Override
	public boolean method5853() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "E", descriptor = "(III)V")
	public native void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!a", name = "Z", descriptor = "(I)V")
	public native void Z(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(II)I")
	@Override
	public int method5857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!sv;)V")
	@Override
	public void method5801(@OriginalArg(0) Class124 arg0) {
	}

	@OriginalMember(owner = "client!a", name = "oa", descriptor = "(I[I[F)V")
	private native void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!a", name = "HA", descriptor = "(I)V")
	private native void HA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method162().da(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!a", name = "h", descriptor = "()Z")
	@Override
	public boolean method5813() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!hp;Z)V")
	private void method164(@OriginalArg(0) Class136 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class7_Sub1_Sub1 local15 = (Class7_Sub1_Sub1) arg0.aClass313_1.method7873(); local15 != null; local15 = (Class7_Sub1_Sub1) arg0.aClass313_1.method7872()) {
			Static1.anIntArray2[local1++] = local15.anInt3263;
			Static1.anIntArray2[local1++] = local15.anInt3271;
			Static1.anIntArray2[local1++] = local15.anInt3272;
			Static1.anIntArray5[local3++] = local15.anInt3273;
			Static1.aShortArray1[local7++] = (short) local15.anInt3264;
			Static1.anIntArray3[local5++] = local15.anInt3268;
			if (arg1) {
				Static1.aByteArray1[local9++] = local15.aByte43;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	@Override
	public void method5806(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!r;Lclient!hp;Lclient!m;Lclient!kn;I)V")
	@Override
	public void method5864(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) Class7_Sub4 arg3) {
		this.method164(arg1, true);
		if (arg3 == null) {
			this.method162().G(this, arg0, arg2, null, 0, Static1.anIntArray2, Static1.anIntArray5, Static1.anIntArray3, Static1.aShortArray1, Static1.aByteArray1, arg1.aClass313_1.method7871(), Static1.anIntArray6);
		} else {
			Static1.anIntArray4[5] = 0;
			this.method162().G(this, arg0, arg2, Static1.anIntArray4, 0, Static1.anIntArray2, Static1.anIntArray5, Static1.anIntArray3, Static1.aShortArray1, Static1.aByteArray1, arg1.aClass313_1.method7871(), Static1.anIntArray6);
			arg3.anInt5261 = Static1.anIntArray4[0];
			arg3.anInt5260 = Static1.anIntArray4[1];
			arg3.anInt5262 = Static1.anIntArray4[2];
			arg3.anInt5259 = Static1.anIntArray4[3];
			arg3.anInt5258 = Static1.anIntArray4[4];
			arg3.aBoolean404 = Static1.anIntArray4[5] != 0;
		}
		@Pc(83) ma local83 = (ma) arg0;
		local83.method4765(0, arg2);
	}

	@OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method5807();
		if (this.nativeid != 0L) {
			Static229.method4115(this);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!kn;I)V")
	@Override
	public void method5860(@OriginalArg(0) Class26[] arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) Class7_Sub4[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method162().wa(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class7_Sub4 local15 = arg2[0];
		Static1.anIntArray4[5] = 0;
		this.method162().wa(this, arg0, arg1, Static1.anIntArray4, -1, arg3);
		local15.anInt5261 = Static1.anIntArray4[0];
		local15.anInt5260 = Static1.anIntArray4[1];
		local15.anInt5262 = Static1.anIntArray4[2];
		local15.anInt5259 = Static1.anIntArray4[3];
		local15.anInt5258 = Static1.anIntArray4[4];
		local15.aBoolean404 = Static1.anIntArray4[5] != 0;
	}

	@OriginalMember(owner = "client!a", name = "UA", descriptor = "(IIIII)V")
	public native void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!pu;[Lclient!bt;Z)Lclient!ra;")
	@Override
	public Class80 method5850(@OriginalArg(0) Class244 arg0, @OriginalArg(1) Class40[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt895;
			local7[local11] = arg1[local11].anInt894;
			if (arg1[local11].aByteArray22 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new w(this, this.aC1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ln;IIII)Lclient!r;")
	@Override
	public Class26 method5812(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new ma(this, this.aC1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!a", name = "s", descriptor = "()Z")
	@Override
	public boolean method5833() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "y", descriptor = "()V")
	@Override
	public void method5845() {
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "()Z")
	@Override
	public boolean method5798() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5835(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aB1 == null) {
			throw new IllegalStateException("off");
		}
		this.aB1.method540(arg0, arg1);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I[Lclient!rh;)V")
	@Override
	public void method5824(@OriginalArg(0) int arg0, @OriginalArg(1) Class12_Sub7[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static1.anIntArray7[local1++] = arg1[local3].method5124();
			Static1.anIntArray7[local1++] = arg1[local3].method5120();
			Static1.anIntArray7[local1++] = arg1[local3].method5117();
			Static1.anIntArray7[local1++] = arg1[local3].method5123();
			Static1.aFloatArray1[local3] = arg1[local3].method5125();
			Static1.anIntArray7[local1++] = arg1[local3].method5118();
		}
		this.oa(arg0, Static1.anIntArray7, Static1.aFloatArray1);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIZ)Lclient!ha;")
	@Override
	public Class84 method5817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new va(this, this.aC1, arg0, arg1, arg2, arg3) : new t(this, this.aC1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!a", name = "L", descriptor = "(I)V")
	public native void L(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([Lclient!r;Lclient!hp;Lclient!m;[Lclient!kn;I)V")
	@Override
	public void method5809(@OriginalArg(0) Class26[] arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) Class7_Sub4[] arg3, @OriginalArg(4) int arg4) {
		this.method164(arg1, true);
		if (arg3 == null) {
			this.method162().N(this, arg0, arg2, null, arg4, Static1.anIntArray2, Static1.anIntArray5, Static1.anIntArray3, Static1.aShortArray1, Static1.aByteArray1, arg1.aClass313_1.method7871(), Static1.anIntArray6);
		} else {
			@Pc(28) Class7_Sub4 local28 = arg3[0];
			Static1.anIntArray4[5] = 0;
			this.method162().N(this, arg0, arg2, Static1.anIntArray4, arg4, Static1.anIntArray2, Static1.anIntArray5, Static1.anIntArray3, Static1.aShortArray1, Static1.aByteArray1, arg1.aClass313_1.method7871(), Static1.anIntArray6);
			local28.anInt5261 = Static1.anIntArray4[0];
			local28.anInt5260 = Static1.anIntArray4[1];
			local28.anInt5262 = Static1.anIntArray4[2];
			local28.anInt5259 = Static1.anIntArray4[3];
			local28.anInt5258 = Static1.anIntArray4[4];
			local28.aBoolean404 = Static1.anIntArray4[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) ma local98 = (ma) arg0[local88];
				local98.method4765(local86, arg2);
				if (local98.aClass142Array6 != null) {
					local86 += local98.aClass142Array6.length * 9;
				}
				if (local98.aClass265Array6 != null) {
					local86 += local98.aClass265Array6.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "([I)V")
	public native void d(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!a", name = "MA", descriptor = "(Lclient!b;)V")
	private native void MA(@OriginalArg(0) b arg0);

	@OriginalMember(owner = "client!a", name = "TA", descriptor = "(Lclient!m;)V")
	private native void TA(@OriginalArg(0) Class91 arg0);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public void method5855(@OriginalArg(0) Class91 arg0) {
		this.aClass91_2 = arg0;
		this.TA(arg0);
	}

	@OriginalMember(owner = "client!a", name = "ea", descriptor = "(Lclient!u;)V")
	private native void ea(@OriginalArg(0) Class12_Sub36 arg0);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public void method5814(@OriginalArg(0) Class12_Sub36 arg0) {
		this.aC1 = (c) arg0;
		this.ea(arg0);
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5799(@OriginalArg(0) Canvas arg0) {
		@Pc(8) b local8 = (b) this.aClass68_1.method1917((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.xa(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aB1.aCanvas1) {
			this.method5846(arg0);
		}
	}

	@OriginalMember(owner = "client!a", name = "v", descriptor = "(IIII)[I")
	public native int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "F", descriptor = "(IIII)V")
	public native void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([IIIII)Lclient!ha;")
	@Override
	public Class84 method5862(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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

	@OriginalMember(owner = "client!a", name = "IA", descriptor = "(III[I)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!a", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!a", name = "WA", descriptor = "(S)Z")
	private boolean method165(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class278 local9 = super.anInterface11_11.method6215(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.RA(arg0, local9.aByte84, local9.aByte85, local9.aBoolean571, local9.aBoolean568, local9.aBoolean573, local9.aByte82, local9.aByte88, local9.aByte87, local9.aShort96, local9.anInt8273, local9.aBoolean574, local9.aBoolean570);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V")
	@Override
	public void method5837(@OriginalArg(0) int arg0) {
		this.aVArray1[arg0].method7482();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!sv;Lclient!sv;FLclient!sv;)Lclient!sv;")
	@Override
	public Class124 method5805(@OriginalArg(0) Class124 arg0, @OriginalArg(1) Class124 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class124 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	@Override
	public Class145 method5832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new ta(this, this.aC1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!hp;)V")
	@Override
	public void method5856(@OriginalArg(0) Class136 arg0) {
		this.method164(arg0, false);
		this.method162().O(this, Static1.anIntArray2, Static1.anIntArray5, Static1.anIntArray3, Static1.aShortArray1, arg0.aClass313_1.method7871());
	}

	@OriginalMember(owner = "client!a", name = "D", descriptor = "()Z")
	@Override
	public boolean method5867() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "RA", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void RA(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!a", name = "CA", descriptor = "()I")
	public native int CA();

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method5851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.t(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "JA", descriptor = "(IIII)V")
	public native void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "k", descriptor = "()Z")
	@Override
	public boolean method5819() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "G", descriptor = "(ILclient!pa;II)V")
	public native void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "z", descriptor = "()Lclient!m;")
	@Override
	public Class91 method5847() {
		return this.aClass91_1;
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method5834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.UA(arg0, arg1, arg2, arg4, arg5);
		this.UA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.e(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.e(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(IIII)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public Class215 method5796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new s(this, this.aC1, arg0, arg1, arg2, arg3, 128, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "Y", descriptor = "(Lclient!n;II)V")
	private native void Y(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)V")
	@Override
	public void method5822(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5844() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!a", name = "xa", descriptor = "()V")
	public native void xa();

	@OriginalMember(owner = "client!a", name = "B", descriptor = "()Z")
	@Override
	public boolean method5849() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "g", descriptor = "(I)V")
	@Override
	public void method5861(@OriginalArg(0) int arg0) {
		Static229.method4113();
		this.HA(arg0);
		for (@Pc(10) c local10 = (c) this.aClass73_1.method2005(); local10 != null; local10 = (c) this.aClass73_1.method2009()) {
			local10.O();
		}
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "()I")
	public native int c();

	@OriginalMember(owner = "client!a", name = "N", descriptor = "(IIII)V")
	public native void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!bt;Z)Lclient!ha;")
	@Override
	public Class84 method5839(@OriginalArg(0) Class40 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray124;
		@Pc(5) byte[] local5 = arg0.aByteArray21;
		@Pc(8) int local8 = arg0.anInt895;
		@Pc(11) int local11 = arg0.anInt894;
		@Pc(32) Class84 local32;
		if (arg0.aByteArray22 == null) {
			local32 = new ca(this, this.aC1, local2, local5, 0, arg0.anInt895, arg0.anInt895, arg0.anInt894);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray22;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray124[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new va(this, this.aC1, local40, 0, arg0.anInt895, arg0.anInt895, arg0.anInt894);
				} else {
					local32 = new t(this, this.aC1, local40, 0, arg0.anInt895, arg0.anInt895, arg0.anInt894);
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
		local32.KA(arg0.anInt897, arg0.anInt896, arg0.anInt899, arg0.anInt898);
		return local32;
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(I)Lclient!u;")
	@Override
	public Class12_Sub36 method5859(@OriginalArg(0) int arg0) {
		@Pc(5) c local5 = new c(this, arg0);
		this.aClass73_1.method2012(local5);
		return local5;
	}

	@OriginalMember(owner = "client!a", name = "M", descriptor = "(F)V")
	public native void M(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!a", name = "ba", descriptor = "()I")
	public native int ba();

	@OriginalMember(owner = "client!a", name = "za", descriptor = "(IIIIII[BII)V")
	public native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!a", name = "i", descriptor = "()V")
	@Override
	public void method5816() {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIII)Lclient!sv;")
	@Override
	public Class124 method5790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!a", name = "A", descriptor = "(IIIII)V")
	protected native void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!a", name = "h", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void h(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!a", name = "u", descriptor = "()V")
	@Override
	public void method5841() {
	}

	@OriginalMember(owner = "client!a", name = "w", descriptor = "()V")
	private native void w();

	@OriginalMember(owner = "client!a", name = "x", descriptor = "()Z")
	@Override
	public boolean method5843() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIF)Lclient!rh;")
	@Override
	public Class12_Sub7 method5831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class12_Sub7_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(Z)V")
	@Override
	public void method5863(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(IIIIII)V")
	public native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!a", name = "P", descriptor = "()F")
	public native float P();

	@OriginalMember(owner = "client!a", name = "B", descriptor = "(IIIIII)Z")
	public native boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5789(@OriginalArg(0) Canvas arg0) {
		@Pc(8) b local8 = (b) this.aClass68_1.method1917((long) arg0.hashCode());
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
		this.aClass68_1.method1916(local8, (long) arg0.hashCode());
	}

	@OriginalMember(owner = "client!a", name = "ra", descriptor = "()F")
	public native float ra();

	@OriginalMember(owner = "client!a", name = "q", descriptor = "()Lclient!m;")
	@Override
	public Class91 method5829() {
		return new q();
	}

	@OriginalMember(owner = "client!a", name = "A", descriptor = "()Z")
	@Override
	public boolean method5848() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "n", descriptor = "()V")
	public native void n();

	@OriginalMember(owner = "client!a", name = "j", descriptor = "()Z")
	@Override
	public boolean method5818() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "ca", descriptor = "(IIIIIILclient!pa;II)V")
	private native void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class145 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5846(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aB1 = null;
			this.MA(null);
		} else {
			@Pc(10) b local10 = (b) this.aClass68_1.method1917((long) arg0.hashCode());
			this.aB1 = local10;
			this.MA(local10);
		}
	}

	@OriginalMember(owner = "client!a", name = "v", descriptor = "()Z")
	@Override
	public boolean method5842() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
	@Override
	public void method5815(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!a", name = "m", descriptor = "()Z")
	@Override
	public boolean method5823() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "m", descriptor = "(IFFFFF)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!a", name = "Q", descriptor = "()Ljava/lang/Object;")
	private Object method166() {
		return new e(this);
	}

	@OriginalMember(owner = "client!a", name = "ta", descriptor = "(II)V")
	public native void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
