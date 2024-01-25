import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class a extends Class9 implements Interface13 {

	@OriginalMember(owner = "client!a", name = "A", descriptor = "Lclient!c;")
	private c aC1;

	@OriginalMember(owner = "client!a", name = "D", descriptor = "Lclient!m;")
	private Class22 aClass22_1;

	@OriginalMember(owner = "client!a", name = "F", descriptor = "Lclient!b;")
	private b aB1;

	@OriginalMember(owner = "client!a", name = "J", descriptor = "I")
	private int anInt29;

	@OriginalMember(owner = "client!a", name = "K", descriptor = "[Lclient!v;")
	private v[] aVArray1;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "Z")
	private boolean aBoolean1 = false;

	@OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!a", name = "q", descriptor = "Lclient!bu;")
	private final Class38 aClass38_1 = new Class38();

	@OriginalMember(owner = "client!a", name = "E", descriptor = "I")
	private final int anInt27 = 4096;

	@OriginalMember(owner = "client!a", name = "I", descriptor = "I")
	private final int anInt28 = 4096;

	@OriginalMember(owner = "client!a", name = "H", descriptor = "Lclient!lb;")
	private final Class174 aClass174_1 = new Class174(4);

	@OriginalMember(owner = "client!a", name = "L", descriptor = "Z")
	private boolean aBoolean2 = false;

	@OriginalMember(owner = "client!a", name = "G", descriptor = "Lclient!m;")
	private Class22 aClass22_2;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;)V")
	public a(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface8 arg1) {
		super(arg1);
		try {
			if (!Static531.method7565("sw3d")) {
				throw new RuntimeException("");
			}
			Static431.method6350();
			this.Y(super.anInterface8_13, 0, 0);
			Static105.method2288(false, true);
			this.aBoolean2 = true;
			this.aClass22_2 = new q();
			this.method7597(new q());
			this.method7643(1);
			this.method7596(0);
			if (arg0 != null) {
				this.method7592(arg0);
				this.method7634(arg0);
			}
		} catch (@Pc(78) Throwable local78) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!qm;Z)Lclient!ha;")
	@Override
	public Class12 method7625(@OriginalArg(0) Class242 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray518;
		@Pc(5) byte[] local5 = arg0.aByteArray83;
		@Pc(8) int local8 = arg0.anInt6863;
		@Pc(11) int local11 = arg0.anInt6866;
		@Pc(32) Class12 local32;
		if (arg0.aByteArray82 == null) {
			local32 = new ca(this, this.aC1, local2, local5, 0, arg0.anInt6863, arg0.anInt6863, arg0.anInt6866);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray82;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray518[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new va(this, this.aC1, local40, 0, arg0.anInt6863, arg0.anInt6863, arg0.anInt6866);
				} else {
					local32 = new t(this, this.aC1, local40, 0, arg0.anInt6863, arg0.anInt6863, arg0.anInt6866);
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
		local32.KA(arg0.anInt6862, arg0.anInt6865, arg0.anInt6861, arg0.anInt6864);
		return local32;
	}

	@OriginalMember(owner = "client!a", name = "JA", descriptor = "(IIII)V")
	public native void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "F", descriptor = "(IIII)V")
	public native void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "Y", descriptor = "(Lclient!n;II)V")
	private native void Y(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!a", name = "h", descriptor = "()Z")
	@Override
	public boolean method7579() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "()Z")
	@Override
	public boolean method7571() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "P", descriptor = "()F")
	public native float P();

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!r;Lclient!rd;Lclient!m;Lclient!pr;I)V")
	@Override
	public void method7573(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class249 arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) Class2_Sub7 arg3) {
		this.method161(arg1, true);
		if (arg3 == null) {
			this.method164().G(this, arg0, arg2, null, 0, Static1.anIntArray2, Static1.anIntArray3, Static1.anIntArray7, Static1.aShortArray1, Static1.aByteArray1, arg1.aClass120_1.method3471(), Static1.anIntArray6);
		} else {
			Static1.anIntArray5[5] = 0;
			this.method164().G(this, arg0, arg2, Static1.anIntArray5, 0, Static1.anIntArray2, Static1.anIntArray3, Static1.anIntArray7, Static1.aShortArray1, Static1.aByteArray1, arg1.aClass120_1.method3471(), Static1.anIntArray6);
			arg3.anInt6640 = Static1.anIntArray5[0];
			arg3.anInt6642 = Static1.anIntArray5[1];
			arg3.anInt6643 = Static1.anIntArray5[2];
			arg3.anInt6639 = Static1.anIntArray5[3];
			arg3.anInt6641 = Static1.anIntArray5[4];
			arg3.aBoolean437 = Static1.anIntArray5[5] != 0;
		}
		@Pc(83) ma local83 = (ma) arg0;
		local83.method4905(0, arg2);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.UA(arg0, arg1, arg2, arg4, arg5);
		this.UA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.e(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.e(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7567(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aB1 == null) {
			throw new IllegalStateException("off");
		}
		this.aB1.method1127(arg0, arg1);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	@Override
	public Class23 method7631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new ta(this, this.aC1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!a", name = "xa", descriptor = "()V")
	public native void xa();

	@OriginalMember(owner = "client!a", name = "p", descriptor = "()Z")
	@Override
	public boolean method7605() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "z", descriptor = "()Z")
	@Override
	public boolean method7630() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "t", descriptor = "(IIIIII)V")
	private native void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!a", name = "m", descriptor = "(IFFFFF)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	@Override
	public void method7589(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!a", name = "ra", descriptor = "()F")
	public native float ra();

	@OriginalMember(owner = "client!a", name = "za", descriptor = "(IIIIII[BII)V")
	public native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!fd;IIII)Lclient!r;")
	@Override
	public Class19 method7635(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new ma(this, this.aC1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!rd;Z)V")
	private void method161(@OriginalArg(0) Class249 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class2_Sub4_Sub1 local15 = (Class2_Sub4_Sub1) arg0.aClass120_1.method3474(); local15 != null; local15 = (Class2_Sub4_Sub1) arg0.aClass120_1.method3477()) {
			Static1.anIntArray2[local1++] = local15.anInt2551;
			Static1.anIntArray2[local1++] = local15.anInt2549;
			Static1.anIntArray2[local1++] = local15.anInt2546;
			Static1.anIntArray3[local3++] = local15.anInt2550;
			Static1.aShortArray1[local7++] = (short) local15.anInt2552;
			Static1.anIntArray7[local5++] = local15.anInt2553;
			if (arg1) {
				Static1.aByteArray1[local9++] = local15.aByte13;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "A", descriptor = "(IIIII)V")
	protected native void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!a", name = "g", descriptor = "()Z")
	@Override
	public boolean method7576() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "()I")
	public native int c();

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(IIII)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method7572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.t(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "Z", descriptor = "(I)V")
	public native void Z(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIZ)Lclient!ha;")
	@Override
	public Class12 method7612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new va(this, this.aC1, arg0, arg1, arg2, arg3) : new t(this, this.aC1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "()Z")
	@Override
	public boolean method7575() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "B", descriptor = "()Z")
	@Override
	public boolean method7640() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "UA", descriptor = "(IIIII)V")
	public native void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!a", name = "d", descriptor = "()V")
	@Override
	public void method7570() {
	}

	@OriginalMember(owner = "client!a", name = "G", descriptor = "(ILclient!pa;II)V")
	public native void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7604(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(IIIIII)V")
	public native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I[Lclient!nm;)V")
	@Override
	public void method7588(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub27[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static1.anIntArray4[local1++] = arg1[local3].method5493();
			Static1.anIntArray4[local1++] = arg1[local3].method5487();
			Static1.anIntArray4[local1++] = arg1[local3].method5495();
			Static1.anIntArray4[local1++] = arg1[local3].method5496();
			Static1.aFloatArray2[local3] = arg1[local3].method5486();
			Static1.anIntArray4[local1++] = arg1[local3].method5488();
		}
		this.oa(arg0, Static1.anIntArray4, Static1.aFloatArray2);
	}

	@OriginalMember(owner = "client!a", name = "x", descriptor = "()V")
	@Override
	public void method7624() {
	}

	@OriginalMember(owner = "client!a", name = "B", descriptor = "(IIIIII)Z")
	public native boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!a", name = "h", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void h(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7634(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aB1 = null;
			this.MA(null);
		} else {
			@Pc(10) b local10 = (b) this.aClass174_1.method4422((long) arg0.hashCode());
			this.aB1 = local10;
			this.MA(local10);
		}
	}

	@OriginalMember(owner = "client!a", name = "D", descriptor = "()Lclient!m;")
	@Override
	public Class22 method7644() {
		return new q();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	@Override
	public void method7594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class23 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.ca(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!a", name = "q", descriptor = "(IIII)V")
	public native void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "HA", descriptor = "(I)V")
	private native void HA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "k", descriptor = "()V")
	@Override
	public void method7586() {
	}

	@OriginalMember(owner = "client!a", name = "C", descriptor = "()Lclient!m;")
	@Override
	public Class22 method7642() {
		return this.aClass22_2;
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(IIIII)V")
	public native void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!a", name = "r", descriptor = "()Z")
	@Override
	public boolean method7614() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "i", descriptor = "()I")
	@Override
	public int method7582() {
		return 4;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7595() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!pr;I)V")
	@Override
	public void method7578(@OriginalArg(0) Class19[] arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) Class2_Sub7[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method164().wa(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class2_Sub7 local15 = arg2[0];
		Static1.anIntArray5[5] = 0;
		this.method164().wa(this, arg0, arg1, Static1.anIntArray5, -1, arg3);
		local15.anInt6640 = Static1.anIntArray5[0];
		local15.anInt6642 = Static1.anIntArray5[1];
		local15.anInt6643 = Static1.anIntArray5[2];
		local15.anInt6639 = Static1.anIntArray5[3];
		local15.anInt6641 = Static1.anIntArray5[4];
		local15.aBoolean437 = Static1.anIntArray5[5] != 0;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!rd;)V")
	@Override
	public void method7577(@OriginalArg(0) Class249 arg0) {
		this.method161(arg0, false);
		this.method164().O(this, Static1.anIntArray2, Static1.anIntArray3, Static1.anIntArray7, Static1.aShortArray1, arg0.aClass120_1.method3471());
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!qba;)V")
	@Override
	public void method7580(@OriginalArg(0) Class25 arg0) {
	}

	@OriginalMember(owner = "client!a", name = "Q", descriptor = "()Ljava/lang/Object;")
	private Object method162() {
		return new e(this);
	}

	@OriginalMember(owner = "client!a", name = "v", descriptor = "()V")
	@Override
	public void method7623() {
	}

	@OriginalMember(owner = "client!a", name = "YA", descriptor = "()I")
	public native int YA();

	@OriginalMember(owner = "client!a", name = "A", descriptor = "()V")
	@Override
	public void method7637() throws Exception_Sub1 {
		if (this.aB1 == null) {
			throw new IllegalStateException("off");
		}
		this.aB1.method1128();
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V")
	@Override
	public void method7598(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!a", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!a", name = "b", descriptor = "()Z")
	@Override
	public boolean method7569() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "IA", descriptor = "(III[I)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!a", name = "n", descriptor = "()V")
	public native void n();

	@OriginalMember(owner = "client!a", name = "L", descriptor = "(I)V")
	public native void L(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "y", descriptor = "()Lclient!cr;")
	@Override
	public Class49 method7626() {
		return new Class49(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!a", name = "v", descriptor = "(IIII)[I")
	public native int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "h", descriptor = "(I)V")
	@Override
	public void method7643(@OriginalArg(0) int arg0) {
		this.anInt29 = arg0;
		this.aVArray1 = new v[this.anInt29];
		for (@Pc(9) int local9 = 0; local9 < this.anInt29; local9++) {
			this.aVArray1[local9] = new v(this, this.anInt28, this.anInt27);
		}
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(IIIIII)Lclient!qba;")
	@Override
	public Class25 method7608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!a", name = "la", descriptor = "(FF)V")
	public native void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!a", name = "ta", descriptor = "(II)V")
	public native void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!a", name = "ca", descriptor = "(IIIIIILclient!pa;II)V")
	private native void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class23 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7627(@OriginalArg(0) Canvas arg0) {
		@Pc(8) b local8 = (b) this.aClass174_1.method4422((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.xa(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aB1.aCanvas6) {
			this.method7634(arg0);
		}
	}

	@OriginalMember(owner = "client!a", name = "t", descriptor = "()Z")
	@Override
	public boolean method7620() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public void method7600(@OriginalArg(0) Class1_Sub16 arg0) {
		this.aC1 = (c) arg0;
		this.ea(arg0);
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)V")
	@Override
	public void method7610(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!a", name = "E", descriptor = "(III)V")
	public native void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!a", name = "TA", descriptor = "(Lclient!m;)V")
	private native void TA(@OriginalArg(0) Class22 arg0);

	@OriginalMember(owner = "client!a", name = "m", descriptor = "()Z")
	@Override
	public boolean method7601() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!a", name = "M", descriptor = "(F)V")
	public native void M(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!a", name = "MA", descriptor = "(Lclient!b;)V")
	private native void MA(@OriginalArg(0) b arg0);

	@OriginalMember(owner = "client!a", name = "RA", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void RA(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([Lclient!r;Lclient!rd;Lclient!m;[Lclient!pr;I)V")
	@Override
	public void method7593(@OriginalArg(0) Class19[] arg0, @OriginalArg(1) Class249 arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) Class2_Sub7[] arg3, @OriginalArg(4) int arg4) {
		this.method161(arg1, true);
		if (arg3 == null) {
			this.method164().N(this, arg0, arg2, null, arg4, Static1.anIntArray2, Static1.anIntArray3, Static1.anIntArray7, Static1.aShortArray1, Static1.aByteArray1, arg1.aClass120_1.method3471(), Static1.anIntArray6);
		} else {
			@Pc(28) Class2_Sub7 local28 = arg3[0];
			Static1.anIntArray5[5] = 0;
			this.method164().N(this, arg0, arg2, Static1.anIntArray5, arg4, Static1.anIntArray2, Static1.anIntArray3, Static1.anIntArray7, Static1.aShortArray1, Static1.aByteArray1, arg1.aClass120_1.method3471(), Static1.anIntArray6);
			local28.anInt6640 = Static1.anIntArray5[0];
			local28.anInt6642 = Static1.anIntArray5[1];
			local28.anInt6643 = Static1.anIntArray5[2];
			local28.anInt6639 = Static1.anIntArray5[3];
			local28.anInt6641 = Static1.anIntArray5[4];
			local28.aBoolean437 = Static1.anIntArray5[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) ma local98 = (ma) arg0[local88];
				local98.method4905(local86, arg2);
				if (local98.aClass178Array5 != null) {
					local86 += local98.aClass178Array5.length * 9;
				}
				if (local98.aClass129Array5 != null) {
					local86 += local98.aClass129Array5.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "ea", descriptor = "(Lclient!u;)V")
	private native void ea(@OriginalArg(0) Class1_Sub16 arg0);

	@OriginalMember(owner = "client!a", name = "NA", descriptor = "(Z)V")
	public native void NA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	@Override
	public void method7584(@OriginalArg(0) int arg0) {
		this.aVArray1[arg0].method7188();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public void method7597(@OriginalArg(0) Class22 arg0) {
		this.aClass22_1 = arg0;
		this.TA(arg0);
	}

	@OriginalMember(owner = "client!a", name = "o", descriptor = "()V")
	@Override
	public void method7602() {
	}

	@OriginalMember(owner = "client!a", name = "s", descriptor = "()V")
	@Override
	public void method7619() {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!qba;Lclient!qba;FLclient!qba;)Lclient!qba;")
	@Override
	public Class25 method7609(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class25 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7636(@OriginalArg(0) Canvas arg0) {
		if (this.aB1.aCanvas6 == arg0) {
			this.method7634(null);
		}
		@Pc(16) b local16 = (b) this.aClass174_1.method4422((long) arg0.hashCode());
		if (local16 != null) {
			local16.method7983();
			local16.method1130();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public Class10 method7574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new s(this, this.aC1, arg0, arg1, arg2, arg3, 128, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "CA", descriptor = "()I")
	public native int CA();

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I")
	@Override
	public int method7606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(II)I")
	@Override
	public int method7607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!a", name = "WA", descriptor = "(S)Z")
	private boolean method163(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class175 local9 = super.anInterface8_13.method7085(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.RA(arg0, local9.aByte59, local9.aByte58, local9.aBoolean359, local9.aBoolean356, local9.aBoolean350, local9.aByte57, local9.aByte60, local9.aByte54, local9.aShort81, local9.anInt5193, local9.aBoolean358, local9.aBoolean357);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "l", descriptor = "()Z")
	@Override
	public boolean method7591() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "E", descriptor = "()Lclient!v;")
	public v method164() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt29; local1++) {
			if (this.aVArray1[local1].aRunnable3 == Thread.currentThread()) {
				return this.aVArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([IIIII)Lclient!ha;")
	@Override
	public Class12 method7641(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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

	@OriginalMember(owner = "client!a", name = "u", descriptor = "()Z")
	@Override
	public boolean method7622() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "([I)V")
	public native void d(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
	@Override
	public void method7596(@OriginalArg(0) int arg0) {
		this.aVArray1[arg0].method7187();
	}

	@OriginalMember(owner = "client!a", name = "w", descriptor = "()V")
	private native void w();

	@OriginalMember(owner = "client!a", name = "g", descriptor = "(I)Lclient!u;")
	@Override
	public Class1_Sub16 method7629(@OriginalArg(0) int arg0) {
		@Pc(5) c local5 = new c(this, arg0);
		this.aClass38_1.method1426(local5);
		return local5;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "()V")
	@Override
	protected void method7566() {
		if (this.aBoolean1) {
			return;
		}
		this.aVArray1 = null;
		this.aB1 = null;
		this.aC1 = null;
		this.aClass22_2 = null;
		this.aClass174_1.method4423();
		for (@Pc(25) c local25 = (c) this.aClass38_1.method1419(); local25 != null; local25 = (c) this.aClass38_1.method1415()) {
			local25.za();
		}
		this.aClass38_1.method1417();
		this.w();
		if (this.aBoolean2) {
			Static88.method2132(true, false);
			this.aBoolean2 = false;
		}
		this.method165();
		Static431.method6349();
		this.aBoolean1 = true;
	}

	@OriginalMember(owner = "client!a", name = "N", descriptor = "(IIII)V")
	public native void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7592(@OriginalArg(0) Canvas arg0) {
		@Pc(8) b local8 = (b) this.aClass174_1.method4422((long) arg0.hashCode());
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
		this.aClass174_1.method4420(local8, (long) arg0.hashCode());
	}

	@OriginalMember(owner = "client!a", name = "oa", descriptor = "(I[I[F)V")
	private native void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V")
	@Override
	public void method7613(@OriginalArg(0) int arg0) {
		Static431.method6348();
		this.HA(arg0);
		for (@Pc(10) c local10 = (c) this.aClass38_1.method1419(); local10 != null; local10 = (c) this.aClass38_1.method1415()) {
			local10.O();
		}
	}

	@OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method7585();
		if (this.nativeid != 0L) {
			Static431.method6347(this);
		}
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(Z)V")
	@Override
	public void method7615(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!a", name = "q", descriptor = "()Z")
	@Override
	public boolean method7611() {
		return true;
	}

	@OriginalMember(owner = "client!a", name = "j", descriptor = "()Z")
	@Override
	public boolean method7583() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "XA", descriptor = "()V")
	private void method165() {
		System.gc();
		System.runFinalization();
		Static431.method6348();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method164().da(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!a", name = "ba", descriptor = "()I")
	public native int ba();

	@OriginalMember(owner = "client!a", name = "GA", descriptor = "(S)Z")
	private boolean method166(@OriginalArg(0) short arg0) {
		@Pc(2) Interface8 local2 = super.anInterface8_13;
		synchronized (super.anInterface8_13) {
			if (!super.anInterface8_13.method7084(arg0)) {
				return false;
			}
			@Pc(22) Class175 local22 = super.anInterface8_13.method7085(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(43) int[] local43;
			if (local22.aBoolean353) {
				local43 = super.anInterface8_13.method7086(128, 128, arg0, 0.7F);
			} else {
				local43 = super.anInterface8_13.method7088(128, true, 128, 0.7F, arg0);
			}
			this.h(arg0, local22.aByte59, local22.aByte58, local22.aBoolean359, local22.aBoolean356, local22.aBoolean350, local22.aByte57, local22.aByte60, local22.aByte54, local22.aShort81, local22.anInt5193, local22.aBoolean358, local22.aBoolean357, local43);
			return true;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIF)Lclient!nm;")
	@Override
	public Class1_Sub27 method7616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub27_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!lg;[Lclient!qm;Z)Lclient!ra;")
	@Override
	public Class27 method7603(@OriginalArg(0) Class177 arg0, @OriginalArg(1) Class242[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt6863;
			local7[local11] = arg1[local11].anInt6866;
			if (arg1[local11].aByteArray82 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new w(this, this.aC1, arg0, arg1, null);
	}
}
