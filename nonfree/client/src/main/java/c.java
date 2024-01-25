import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class c extends Class30 implements Interface10 {

	@OriginalMember(owner = "client!c", name = "G", descriptor = "Lclient!k;")
	private k aK1;

	@OriginalMember(owner = "client!c", name = "L", descriptor = "Lclient!ca;")
	private ca aCa1;

	@OriginalMember(owner = "client!c", name = "N", descriptor = "[Lclient!wa;")
	private wa[] aWaArray1;

	@OriginalMember(owner = "client!c", name = "O", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!c", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "Z")
	private boolean aBoolean64 = false;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "Lclient!gw;")
	private final Class91 aClass91_10 = new Class91();

	@OriginalMember(owner = "client!c", name = "J", descriptor = "I")
	private final int anInt959 = 4096;

	@OriginalMember(owner = "client!c", name = "K", descriptor = "I")
	private final int anInt960 = 4096;

	@OriginalMember(owner = "client!c", name = "H", descriptor = "Lclient!hl;")
	private final Class96 aClass96_2 = new Class96(4);

	@OriginalMember(owner = "client!c", name = "M", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!c", name = "I", descriptor = "Lclient!n;")
	private Class72 aClass72_1;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;Lclient!ul;)V")
	public c(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) Class255 arg3) {
		super(arg0, arg2);
		try {
			if (!Static40.aBoolean65) {
				if (arg3 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("sw3d");
					Static40.aBoolean65 = Boolean.TRUE;
				} else {
					arg3.method5846(this.getClass());
					Static40.aBoolean65 = Boolean.TRUE;
				}
			}
			if (!Static40.aBoolean65) {
				throw new RuntimeException("");
			}
			this.OA(super.anInterface4_5, 0, 0);
			Static198.method3514(false, true);
			this.aBoolean66 = true;
			this.aClass72_1 = new ja();
			this.method2064(new ja());
			this.method2099(1);
			this.method2049(0);
			if (arg1 != null) {
				this.method2047(arg1);
				this.method2073(arg1);
			}
		} catch (@Pc(95) Throwable local95) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!w;)V")
	@Override
	public void method2060(@OriginalArg(0) Class4_Sub18 arg0) {
		this.aK1 = (k) arg0;
		this.ta(arg0);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(FFF)V")
	@Override
	public void method2084(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[[I[[IIII)Lclient!o;")
	@Override
	public Class14 method2089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new da(this, this.aK1, arg0, arg1, arg2, arg3, 128, arg4, arg5);
	}

	@OriginalMember(owner = "client!c", name = "ga", descriptor = "(Lclient!ca;)V")
	private native void ga(@OriginalArg(0) ca arg0);

	@OriginalMember(owner = "client!c", name = "g", descriptor = "()Z")
	@Override
	public boolean method2045() {
		return true;
	}

	@OriginalMember(owner = "client!c", name = "I", descriptor = "()F")
	public native float I();

	@OriginalMember(owner = "client!c", name = "b", descriptor = "()Z")
	@Override
	public boolean method2034() {
		return false;
	}

	@OriginalMember(owner = "client!c", name = "f", descriptor = "()V")
	@Override
	public void method2042() {
		if (this.aCa1 == null) {
			throw new IllegalStateException("off");
		}
		this.aCa1.method908();
	}

	@OriginalMember(owner = "client!c", name = "sa", descriptor = "()I")
	public native int sa();

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method2097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.LA(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!c", name = "p", descriptor = "()V")
	@Override
	public void method2083() {
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IIII)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "ja", descriptor = "()V")
	private native void ja();

	@OriginalMember(owner = "client!c", name = "R", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void R(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method2064(@OriginalArg(0) Class72 arg0) {
		this.va(arg0);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2032(@OriginalArg(0) Canvas arg0) {
		@Pc(8) ca local8 = (ca) this.aClass96_2.method2797((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.b(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aCa1.aCanvas3) {
			this.method2073(arg0);
		}
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(I)V")
	@Override
	public void method2062(@OriginalArg(0) int arg0) {
		Static36.method522();
		this.ba(arg0);
		for (@Pc(10) k local10 = (k) this.aClass91_10.method2584(); local10 != null; local10 = (k) this.aClass91_10.method2586()) {
			local10.d();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[Lclient!ni;)V")
	@Override
	public void method2081(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub17[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static40.anIntArray53[local1++] = arg1[local3].method6165();
			Static40.anIntArray53[local1++] = arg1[local3].method6162();
			Static40.anIntArray53[local1++] = arg1[local3].method6161();
			Static40.anIntArray53[local1++] = arg1[local3].method6160();
			Static40.aFloatArray9[local3] = arg1[local3].method6158();
			Static40.anIntArray53[local1++] = arg1[local3].method6159();
		}
		this.F(arg0, Static40.anIntArray53, Static40.aFloatArray9);
	}

	@OriginalMember(owner = "client!c", name = "A", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void A(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!c", name = "BA", descriptor = "(IIIII)V")
	public native void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
	@Override
	public void method2044(@OriginalArg(0) int arg0) {
		this.aWaArray1[arg0].method6149();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "()Z")
	@Override
	public boolean method2033() {
		return false;
	}

	@OriginalMember(owner = "client!c", name = "l", descriptor = "(I)V")
	public native void l(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!kv;)V")
	@Override
	public void method2067(@OriginalArg(0) Class41 arg0) {
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method2061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method893().U(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(Z)V")
	@Override
	public void method2106(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([Lclient!ka;Lclient!wg;Lclient!n;[Lclient!wc;I)V")
	@Override
	public void method2078(@OriginalArg(0) Class57[] arg0, @OriginalArg(1) Class270 arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) Class71_Sub7[] arg3, @OriginalArg(4) int arg4) {
		this.method894(arg1, true);
		if (arg3 == null) {
			this.method893().a(this, arg0, arg2, null, arg4, Static40.anIntArray55, Static40.anIntArray52, Static40.anIntArray54, Static40.aShortArray1, Static40.aByteArray6, arg1.aClass108_1.method3016(), Static40.anIntArray56);
		} else {
			@Pc(28) Class71_Sub7 local28 = arg3[0];
			Static40.anIntArray51[5] = 0;
			this.method893().a(this, arg0, arg2, Static40.anIntArray51, arg4, Static40.anIntArray55, Static40.anIntArray52, Static40.anIntArray54, Static40.aShortArray1, Static40.aByteArray6, arg1.aClass108_1.method3016(), Static40.anIntArray56);
			local28.anInt7743 = Static40.anIntArray51[0];
			local28.anInt7744 = Static40.anIntArray51[1];
			local28.anInt7742 = Static40.anIntArray51[2];
			local28.anInt7740 = Static40.anIntArray51[3];
			local28.anInt7741 = Static40.anIntArray51[4];
			local28.aBoolean566 = Static40.anIntArray51[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) fa local98 = (fa) arg0[local88];
				local98.method1962(local86, arg2);
				if (local98.aClass61Array3 != null) {
					local86 += local98.aClass61Array3.length * 9;
				}
				if (local98.aClass239Array3 != null) {
					local86 += local98.aClass239Array3.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "m", descriptor = "()Z")
	@Override
	public boolean method2070() {
		return true;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!kv;Lclient!kv;FLclient!kv;)Lclient!kv;")
	@Override
	public Class41 method2035(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class41 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!c", name = "A", descriptor = "()Lclient!n;")
	@Override
	public Class72 method2103() {
		return new ja();
	}

	@OriginalMember(owner = "client!c", name = "w", descriptor = "()Z")
	@Override
	public boolean method2096() {
		return false;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "()V")
	@Override
	public void method2038() {
	}

	@OriginalMember(owner = "client!c", name = "xa", descriptor = "()I")
	public native int xa();

	@OriginalMember(owner = "client!c", name = "ta", descriptor = "(Lclient!w;)V")
	private native void ta(@OriginalArg(0) Class4_Sub18 arg0);

	@OriginalMember(owner = "client!c", name = "d", descriptor = "()V")
	@Override
	public void method2039() {
	}

	@OriginalMember(owner = "client!c", name = "v", descriptor = "()Z")
	@Override
	public boolean method2094() {
		return false;
	}

	@OriginalMember(owner = "client!c", name = "h", descriptor = "()Z")
	@Override
	public boolean method2046() {
		return true;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2043(@OriginalArg(0) Canvas arg0) {
		if (this.aCa1.aCanvas3 == arg0) {
			this.method2073(null);
		}
		@Pc(16) ca local16 = (ca) this.aClass96_2.method2797((long) arg0.hashCode());
		if (local16 != null) {
			local16.method6330();
			local16.method906();
		}
	}

	@OriginalMember(owner = "client!c", name = "ZA", descriptor = "()V")
	private void method892() {
		System.gc();
		System.runFinalization();
		Static36.method522();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	@Override
	public void method2030(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!c", name = "ha", descriptor = "(III)V")
	public native void ha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "GA", descriptor = "(ILclient!i;II)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) Class74 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)I")
	@Override
	public int method2102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!c", name = "da", descriptor = "(IIIIIILclient!i;II)V")
	private native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class74 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!c", name = "C", descriptor = "()Lclient!wa;")
	public wa method893() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt961; local1++) {
			if (this.aWaArray1[local1].aRunnable2 == Thread.currentThread()) {
				return this.aWaArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!c", name = "Z", descriptor = "()I")
	public native int Z();

	@OriginalMember(owner = "client!c", name = "IA", descriptor = "(IIII)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "la", descriptor = "(IFFFFF)V")
	public native void la(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!c", name = "h", descriptor = "(II)V")
	public native void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!c", name = "F", descriptor = "(I[I[F)V")
	private native void F(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ch;IIII)Lclient!ka;")
	@Override
	public Class57 method2036(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new fa(this, this.aK1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!c", name = "p", descriptor = "([I)V")
	public native void p(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!c", name = "s", descriptor = "()F")
	public native float s();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
	@Override
	public void method2056(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!c", name = "va", descriptor = "(Lclient!n;)V")
	private native void va(@OriginalArg(0) Class72 arg0);

	@OriginalMember(owner = "client!c", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method2086();
		if (this.nativeid != 0L) {
			Static36.method525(this);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method2075(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCa1 == null) {
			throw new IllegalStateException("off");
		}
		this.aCa1.method907(arg0, arg1);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method2059() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!c", name = "H", descriptor = "()V")
	public native void H();

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method2074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.d(arg0, arg1, arg2, arg4, arg5);
		this.d(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.BA(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.BA(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!c", name = "y", descriptor = "()Z")
	@Override
	public boolean method2100() {
		return true;
	}

	@OriginalMember(owner = "client!c", name = "TA", descriptor = "(IIIIII)Z")
	public native boolean TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!c", name = "u", descriptor = "()Lclient!n;")
	@Override
	public Class72 method2092() {
		return this.aClass72_1;
	}

	@OriginalMember(owner = "client!c", name = "z", descriptor = "()Z")
	@Override
	public boolean method2101() {
		return true;
	}

	@OriginalMember(owner = "client!c", name = "x", descriptor = "()V")
	@Override
	public void method2098() {
	}

	@OriginalMember(owner = "client!c", name = "KA", descriptor = "(IIII)V")
	public native void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V")
	@Override
	public void method2099(@OriginalArg(0) int arg0) {
		this.anInt961 = arg0;
		this.aWaArray1 = new wa[this.anInt961];
		for (@Pc(9) int local9 = 0; local9 < this.anInt961; local9++) {
			this.aWaArray1[local9] = new wa(this, this.anInt959, this.anInt960);
		}
	}

	@OriginalMember(owner = "client!c", name = "B", descriptor = "()I")
	@Override
	public int method2104() {
		return 4;
	}

	@OriginalMember(owner = "client!c", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!wg;)V")
	@Override
	public void method2085(@OriginalArg(0) Class270 arg0) {
		this.method894(arg0, false);
		this.method893().ha(this, Static40.anIntArray55, Static40.anIntArray52, Static40.anIntArray54, Static40.aShortArray1, arg0.aClass108_1.method3016());
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIII)Lclient!kv;")
	@Override
	public Class41 method2057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([Lclient!ka;Lclient!n;[Lclient!wc;I)V")
	@Override
	public void method2050(@OriginalArg(0) Class57[] arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) Class71_Sub7[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method893().T(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class71_Sub7 local15 = arg2[0];
		Static40.anIntArray51[5] = 0;
		this.method893().T(this, arg0, arg1, Static40.anIntArray51, -1, arg3);
		local15.anInt7743 = Static40.anIntArray51[0];
		local15.anInt7744 = Static40.anIntArray51[1];
		local15.anInt7742 = Static40.anIntArray51[2];
		local15.anInt7740 = Static40.anIntArray51[3];
		local15.anInt7741 = Static40.anIntArray51[4];
		local15.aBoolean566 = Static40.anIntArray51[5] != 0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!gg;[Lclient!ho;Z)Lclient!ba;")
	@Override
	public Class18 method2054(@OriginalArg(0) Class84 arg0, @OriginalArg(1) Class98[] arg1) {
		return new b(this, this.aK1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "()Z")
	@Override
	public boolean method2040() {
		return false;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ho;Z)Lclient!aa;")
	@Override
	public Class2 method2031(@OriginalArg(0) Class98 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray260;
		@Pc(5) byte[] local5 = arg0.aByteArray33;
		@Pc(8) int local8 = arg0.anInt3171;
		@Pc(11) int local11 = arg0.anInt3175;
		@Pc(32) Class2 local32;
		if (arg0.aByteArray34 == null) {
			local32 = new va(this, this.aK1, local2, local5, 0, arg0.anInt3171, arg0.anInt3171, arg0.anInt3175);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray34;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray260[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new na(this, this.aK1, local40, 0, arg0.anInt3171, arg0.anInt3171, arg0.anInt3175);
				} else {
					local32 = new q(this, this.aK1, local40, 0, arg0.anInt3171, arg0.anInt3171, arg0.anInt3175);
				}
			} else {
				for (@Pc(47) int local47 = 0; local47 < local11; local47++) {
					local52 = local47 * local8;
					for (local54 = 0; local54 < local8; local54++) {
						local40[local52 + local54] = local2[local5[local52 + local54] & 0xFF] | local43[local52 + local54] << 24;
					}
				}
				local32 = new na(this, this.aK1, local40, 0, local8, local8, local11);
			}
		}
		local32.l(arg0.anInt3173, arg0.anInt3176, arg0.anInt3174, arg0.anInt3172);
		return local32;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(IIIII)V")
	public native void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIF)Lclient!ni;")
	@Override
	public Class4_Sub17 method2087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class4_Sub17_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!c", name = "l", descriptor = "()V")
	@Override
	protected void method2053() {
		if (this.aBoolean64) {
			return;
		}
		this.aWaArray1 = null;
		this.aCa1 = null;
		this.aK1 = null;
		this.aClass72_1 = null;
		this.aClass96_2.method2799();
		for (@Pc(25) k local25 = (k) this.aClass91_10.method2584(); local25 != null; local25 = (k) this.aClass91_10.method2586()) {
			local25.KA();
		}
		this.aClass91_10.method2582();
		this.ja();
		if (this.aBoolean66) {
			Static148.method5176(false, true);
			this.aBoolean66 = false;
		}
		this.method892();
		Static36.method523();
		this.aBoolean64 = true;
	}

	@OriginalMember(owner = "client!c", name = "r", descriptor = "()V")
	public native void r();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
	@Override
	public int method2065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!c", name = "MA", descriptor = "(F)V")
	public native void MA(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!c", name = "LA", descriptor = "(IIIIII)V")
	private native void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!c", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!wg;Z)V")
	private void method894(@OriginalArg(0) Class270 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class71_Sub1_Sub2 local15 = (Class71_Sub1_Sub2) arg0.aClass108_1.method3018(); local15 != null; local15 = (Class71_Sub1_Sub2) arg0.aClass108_1.method3014()) {
			Static40.anIntArray55[local1++] = local15.anInt3398;
			Static40.anIntArray55[local1++] = local15.anInt3404;
			Static40.anIntArray55[local1++] = local15.anInt3400;
			Static40.anIntArray52[local3++] = local15.anInt3399;
			Static40.aShortArray1[local7++] = (short) local15.anInt3402;
			Static40.anIntArray54[local5++] = local15.anInt3401;
			if (arg1) {
				Static40.aByteArray6[local9++] = local15.aByte22;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[I[I)Lclient!i;")
	@Override
	public Class74 method2079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new g(this, this.aK1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!c", name = "t", descriptor = "()Z")
	@Override
	public boolean method2090() {
		return true;
	}

	@OriginalMember(owner = "client!c", name = "i", descriptor = "()Z")
	@Override
	public boolean method2048() {
		return true;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
	@Override
	public void method2049(@OriginalArg(0) int arg0) {
		this.aWaArray1[arg0].method6147();
	}

	@OriginalMember(owner = "client!c", name = "PA", descriptor = "(FF)V")
	public native void PA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!c", name = "j", descriptor = "()Ljava/lang/Object;")
	private Object method895() {
		return new d(this);
	}

	@OriginalMember(owner = "client!c", name = "S", descriptor = "(IIIII)V")
	protected native void S(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)V")
	@Override
	public void method2068(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
	@Override
	public void method2063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([IIIII)Lclient!aa;")
	@Override
	public Class2 method2055(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new na(this, this.aK1, arg0, 0, arg1, arg2, arg3) : new q(this, this.aK1, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new na(this, this.aK1, arg0, 0, arg1, arg2, arg3) : new q(this, this.aK1, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(I)Lclient!w;")
	@Override
	public Class4_Sub18 method2051(@OriginalArg(0) int arg0) {
		@Pc(5) k local5 = new k(this, arg0);
		this.aClass91_10.method2587(local5);
		return local5;
	}

	@OriginalMember(owner = "client!c", name = "N", descriptor = "(IIII)[I")
	public native int[] N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "k", descriptor = "(S)Z")
	private boolean method896(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class160 local9 = super.anInterface4_5.method5685(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.R(arg0, local9.aByte49, local9.aByte53, local9.aBoolean327, local9.aBoolean319, local9.aBoolean328, local9.aByte55, local9.aByte50, local9.aByte51, local9.aShort51, local9.anInt4784, local9.aBoolean324, local9.aBoolean321);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "q", descriptor = "()V")
	@Override
	public void method2088() {
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2073(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCa1 = null;
			this.ga(null);
		} else {
			@Pc(10) ca local10 = (ca) this.aClass96_2.method2797((long) arg0.hashCode());
			this.aCa1 = local10;
			this.ga(local10);
		}
	}

	@OriginalMember(owner = "client!c", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!c", name = "n", descriptor = "()Z")
	@Override
	public boolean method2071() {
		return true;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2047(@OriginalArg(0) Canvas arg0) {
		@Pc(8) ca local8 = (ca) this.aClass96_2.method2797((long) arg0.hashCode());
		if (local8 != null) {
			return;
		}
		try {
			@Pc(13) Class local13 = Class.forName("java.awt.Canvas");
			@Pc(23) Method local23 = local13.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local23.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(35) Exception local35) {
		}
		local8 = new ca(this, arg0);
		this.aClass96_2.method2805((long) arg0.hashCode(), local8);
	}

	@OriginalMember(owner = "client!c", name = "q", descriptor = "(IIII)V")
	public native void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "k", descriptor = "()Z")
	@Override
	public boolean method2052() {
		return false;
	}

	@OriginalMember(owner = "client!c", name = "XA", descriptor = "(III[I)V")
	public native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ka;Lclient!wg;Lclient!n;Lclient!wc;I)V")
	@Override
	public void method2041(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class270 arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) Class71_Sub7 arg3) {
		this.method894(arg1, true);
		if (arg3 == null) {
			this.method893().FA(this, arg0, arg2, null, 0, Static40.anIntArray55, Static40.anIntArray52, Static40.anIntArray54, Static40.aShortArray1, Static40.aByteArray6, arg1.aClass108_1.method3016(), Static40.anIntArray56);
		} else {
			Static40.anIntArray51[5] = 0;
			this.method893().FA(this, arg0, arg2, Static40.anIntArray51, 0, Static40.anIntArray55, Static40.anIntArray52, Static40.anIntArray54, Static40.aShortArray1, Static40.aByteArray6, arg1.aClass108_1.method3016(), Static40.anIntArray56);
			arg3.anInt7743 = Static40.anIntArray51[0];
			arg3.anInt7744 = Static40.anIntArray51[1];
			arg3.anInt7742 = Static40.anIntArray51[2];
			arg3.anInt7740 = Static40.anIntArray51[3];
			arg3.anInt7741 = Static40.anIntArray51[4];
			arg3.aBoolean566 = Static40.anIntArray51[5] != 0;
		}
		@Pc(83) fa local83 = (fa) arg0;
		local83.method1962(0, arg2);
	}

	@OriginalMember(owner = "client!c", name = "w", descriptor = "(IIII)V")
	public native void w(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "wa", descriptor = "(S)Z")
	private boolean method897(@OriginalArg(0) short arg0) {
		@Pc(2) Interface4 local2 = super.anInterface4_5;
		synchronized (super.anInterface4_5) {
			if (!super.anInterface4_5.method5684(arg0)) {
				return false;
			}
			@Pc(22) Class160 local22 = super.anInterface4_5.method5685(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(46) int[] local46;
			if (local22.aBoolean319 && local22.aBoolean327) {
				local46 = super.anInterface4_5.method5686(0.7F, true, 128, 128, arg0);
			} else {
				local46 = super.anInterface4_5.method5683(128, 128, arg0, 0.7F);
			}
			this.A(arg0, local22.aByte49, local22.aByte53, local22.aBoolean327, local22.aBoolean319, local22.aBoolean328, local22.aByte55, local22.aByte50, local22.aByte51, local22.aShort51, local22.anInt4784, local22.aBoolean324, local22.aBoolean321, local46);
			return true;
		}
	}

	@OriginalMember(owner = "client!c", name = "M", descriptor = "(IIIIII)V")
	public native void M(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIZ)Lclient!aa;")
	@Override
	public Class2 method2058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new na(this, this.aK1, arg0, arg1, arg2, arg3) : new q(this, this.aK1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!c", name = "o", descriptor = "()Z")
	@Override
	public boolean method2076() {
		return false;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIILclient!i;II)V")
	@Override
	public void method2069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class74 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.da(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!c", name = "ba", descriptor = "(I)V")
	private native void ba(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "ua", descriptor = "(IIIIII[BII)V")
	public native void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!c", name = "K", descriptor = "(I)V")
	public native void K(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "OA", descriptor = "(Lclient!l;II)V")
	private native void OA(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
