import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class w extends Class117 implements Interface5 {

	@OriginalMember(owner = "client!w", name = "u", descriptor = "Lclient!g;")
	private g aG1;

	@OriginalMember(owner = "client!w", name = "I", descriptor = "Lclient!b;")
	private b aB1;

	@OriginalMember(owner = "client!w", name = "M", descriptor = "[Lclient!k;")
	private k[] aKArray1;

	@OriginalMember(owner = "client!w", name = "O", descriptor = "I")
	private int anInt6979;

	@OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!w", name = "F", descriptor = "Z")
	private boolean aBoolean608 = false;

	@OriginalMember(owner = "client!w", name = "s", descriptor = "Lclient!am;")
	private final Class14 aClass14_48 = new Class14();

	@OriginalMember(owner = "client!w", name = "H", descriptor = "I")
	private final int anInt6977 = 4096;

	@OriginalMember(owner = "client!w", name = "L", descriptor = "I")
	private final int anInt6978 = 4096;

	@OriginalMember(owner = "client!w", name = "J", descriptor = "Lclient!qi;")
	private final Class208 aClass208_39 = new Class208(4);

	@OriginalMember(owner = "client!w", name = "N", descriptor = "Z")
	private boolean aBoolean609 = false;

	@OriginalMember(owner = "client!w", name = "K", descriptor = "Lclient!c;")
	private Class34 aClass34_8;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;Lclient!nt;)V")
	public w(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) Class177 arg3) {
		super(arg0, arg2);
		try {
			if (!Static444.aBoolean607) {
				if (arg3 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("sw3d");
					Static444.aBoolean607 = Boolean.TRUE;
				} else {
					arg3.method3847(this.getClass());
					Static444.aBoolean607 = Boolean.TRUE;
				}
			}
			if (!Static444.aBoolean607) {
				throw new RuntimeException("");
			}
			this.W(super.anInterface4_10, 0, 0);
			Static171.method2270(true, false);
			this.aBoolean609 = true;
			this.aClass34_8 = new qa();
			this.SA(new qa());
			this.method5718(1);
			this.method5722(0);
			if (arg1 != null) {
				this.method5703(arg1);
				this.method5688(arg1);
			}
		} catch (@Pc(95) Throwable local95) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!w", name = "A", descriptor = "(IIIIII)V")
	private native void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ud;)V")
	@Override
	public void method5661(@OriginalArg(0) Class59 arg0) {
	}

	@OriginalMember(owner = "client!w", name = "m", descriptor = "()V")
	@Override
	public void method5698() {
		if (this.aB1 == null) {
			throw new IllegalStateException("off");
		}
		this.aB1.method347();
	}

	@OriginalMember(owner = "client!w", name = "SA", descriptor = "(Lclient!c;)V")
	public native void SA(@OriginalArg(0) Class34 arg0);

	@OriginalMember(owner = "client!w", name = "x", descriptor = "()Z")
	@Override
	public boolean method5721() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method5701();
		if (this.nativeid != 0L) {
			Static280.method3757(this);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	@Override
	public void method5670(@OriginalArg(0) int arg0) {
		Static280.method3756();
		this.u(arg0);
		for (@Pc(10) g local10 = (g) this.aClass14_48.method203(); local10 != null; local10 = (g) this.aClass14_48.method208()) {
			local10.T();
		}
	}

	@OriginalMember(owner = "client!w", name = "s", descriptor = "(IIII)V")
	public native void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(II)I")
	@Override
	public int method5732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!dd;Z)Lclient!o;")
	@Override
	public Class85 method5707(@OriginalArg(0) Class52 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray114;
		@Pc(5) byte[] local5 = arg0.aByteArray13;
		@Pc(8) int local8 = arg0.anInt1019;
		@Pc(11) int local11 = arg0.anInt1015;
		@Pc(32) Class85 local32;
		if (arg0.aByteArray14 == null) {
			local32 = new q(this, this.aG1, local2, local5, 0, arg0.anInt1019, arg0.anInt1019, arg0.anInt1015);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray14;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray114[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new v(this, this.aG1, local40, 0, arg0.anInt1019, arg0.anInt1019, arg0.anInt1015);
				} else {
					local32 = new ca(this, this.aG1, local40, 0, arg0.anInt1019, arg0.anInt1019, arg0.anInt1015);
				}
			} else {
				for (@Pc(47) int local47 = 0; local47 < local11; local47++) {
					local52 = local47 * local8;
					for (local54 = 0; local54 < local8; local54++) {
						local40[local52 + local54] = local2[local5[local52 + local54] & 0xFF] | local43[local52 + local54] << 24;
					}
				}
				local32 = new v(this, this.aG1, local40, 0, local8, local8, local11);
			}
		}
		local32.ha(arg0.anInt1020, arg0.anInt1017, arg0.anInt1016, arg0.anInt1018);
		return local32;
	}

	@OriginalMember(owner = "client!w", name = "o", descriptor = "()Z")
	@Override
	public boolean method5706() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "f", descriptor = "()V")
	@Override
	public void method5672() {
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	@Override
	public void method5676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class73 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.NA(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!sj;)V")
	@Override
	public void method5699(@OriginalArg(0) Class232 arg0) {
		this.method5612(arg0, false);
		this.method5610().J(this, Static444.anIntArray512, Static444.anIntArray514, Static444.anIntArray517, Static444.aShortArray112, arg0.aClass15_1.method218());
	}

	@OriginalMember(owner = "client!w", name = "i", descriptor = "()Z")
	@Override
	public boolean method5689() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([IIIII)Lclient!o;")
	@Override
	public Class85 method5700(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new v(this, this.aG1, arg0, 0, arg1, arg2, arg3) : new ca(this, this.aG1, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new v(this, this.aG1, arg0, 0, arg1, arg2, arg3) : new ca(this, this.aG1, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "()Z")
	@Override
	public boolean method5667() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V")
	@Override
	public void method5718(@OriginalArg(0) int arg0) {
		this.anInt6979 = arg0;
		this.aKArray1 = new k[this.anInt6979];
		for (@Pc(9) int local9 = 0; local9 < this.anInt6979; local9++) {
			this.aKArray1[local9] = new k(this, this.anInt6977, this.anInt6978);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	@Override
	public Class73 method5716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new va(this, this.aG1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!w", name = "j", descriptor = "()Z")
	@Override
	public boolean method5691() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "GA", descriptor = "(IIII)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5703(@OriginalArg(0) Canvas arg0) {
		@Pc(8) b local8 = (b) this.aClass208_39.method4405((long) arg0.hashCode());
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
		this.aClass208_39.method4413((long) arg0.hashCode(), local8);
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(Lclient!b;)V")
	private native void e(@OriginalArg(0) b arg0);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	@Override
	public Class139 method5657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new fa(this, this.aG1, arg0, arg1, arg2, arg3, 128, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5683(@OriginalArg(0) Canvas arg0) {
		if (this.aB1.aCanvas1 == arg0) {
			this.method5688(null);
		}
		@Pc(16) b local16 = (b) this.aClass208_39.method4405((long) arg0.hashCode());
		if (local16 != null) {
			local16.method5953();
			local16.method346();
		}
	}

	@OriginalMember(owner = "client!w", name = "v", descriptor = "()Z")
	@Override
	public boolean method5714() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "IA", descriptor = "(IIIII)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!w", name = "NA", descriptor = "(IIIIIILclient!ta;II)V")
	private native void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class73 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!w", name = "ma", descriptor = "(IIIII)V")
	public native void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!w", name = "h", descriptor = "()Lclient!c;")
	@Override
	public Class34 method5685() {
		return this.aClass34_8;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!e;Lclient!sj;Lclient!c;Lclient!wp;I)V")
	@Override
	public void method5659(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class232 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class111_Sub8 arg3) {
		this.method5612(arg1, true);
		if (arg3 == null) {
			this.method5610().FA(this, arg0, arg2, null, 0, Static444.anIntArray512, Static444.anIntArray514, Static444.anIntArray517, Static444.aShortArray112, Static444.aByteArray93, arg1.aClass15_1.method218(), Static444.anIntArray515);
		} else {
			Static444.anIntArray516[5] = 0;
			this.method5610().FA(this, arg0, arg2, Static444.anIntArray516, 0, Static444.anIntArray512, Static444.anIntArray514, Static444.anIntArray517, Static444.aShortArray112, Static444.aByteArray93, arg1.aClass15_1.method218(), Static444.anIntArray515);
			arg3.anInt7285 = Static444.anIntArray516[0];
			arg3.anInt7282 = Static444.anIntArray516[1];
			arg3.anInt7283 = Static444.anIntArray516[2];
			arg3.anInt7284 = Static444.anIntArray516[3];
			arg3.anInt7286 = Static444.anIntArray516[4];
			arg3.aBoolean631 = Static444.anIntArray516[5] != 0;
		}
		@Pc(83) xa local83 = (xa) arg0;
		local83.method6001(0, arg2);
	}

	@OriginalMember(owner = "client!w", name = "ya", descriptor = "(I)V")
	public native void ya(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!w", name = "l", descriptor = "()Z")
	@Override
	public boolean method5697() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "z", descriptor = "()Z")
	@Override
	public boolean method5728() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void l(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ul;[Lclient!dd;Z)Lclient!la;")
	@Override
	public Class137 method5680(@OriginalArg(0) Class252 arg0, @OriginalArg(1) Class52[] arg1) {
		return new ra(this, this.aG1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!w", name = "h", descriptor = "(I)Lclient!n;")
	@Override
	public Class1_Sub4 method5726(@OriginalArg(0) int arg0) {
		@Pc(5) g local5 = new g(this, arg0);
		this.aClass14_48.method205(local5);
		return local5;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "()Z")
	@Override
	public boolean method5662() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
	@Override
	public void method5674(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!w", name = "QA", descriptor = "(Lclient!n;)V")
	private native void QA(@OriginalArg(0) Class1_Sub4 arg0);

	@OriginalMember(owner = "client!w", name = "ba", descriptor = "(IIII)V")
	public native void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(Z)V")
	@Override
	public void method5702(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
	@Override
	public void method5684(@OriginalArg(0) int arg0) {
		this.aKArray1[arg0].method3010();
	}

	@OriginalMember(owner = "client!w", name = "w", descriptor = "()Lclient!c;")
	@Override
	public Class34 method5717() {
		return new qa();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIF)Lclient!ls;")
	@Override
	public Class1_Sub29 method5719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub29_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "A", descriptor = "()V")
	@Override
	public void method5730() {
	}

	@OriginalMember(owner = "client!w", name = "y", descriptor = "()Z")
	@Override
	public boolean method5725() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "JA", descriptor = "(F)V")
	public native void JA(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!w", name = "WA", descriptor = "(I[I[F)V")
	private native void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "()Z")
	@Override
	public boolean method5655() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "k", descriptor = "()Z")
	@Override
	public boolean method5692() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5610().q(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!w", name = "AA", descriptor = "()I")
	public native int AA();

	@OriginalMember(owner = "client!w", name = "OA", descriptor = "()I")
	public native int OA();

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method5660(@OriginalArg(0) Class1_Sub4 arg0) {
		this.aG1 = (g) arg0;
		this.QA(arg0);
	}

	@OriginalMember(owner = "client!w", name = "VA", descriptor = "(IIIIII)Z")
	public native boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5671(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!w", name = "Q", descriptor = "(III)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!w", name = "MA", descriptor = "([I)V")
	public native void MA(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5688(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aB1 = null;
			this.e(null);
		} else {
			@Pc(10) b local10 = (b) this.aClass208_39.method4405((long) arg0.hashCode());
			this.aB1 = local10;
			this.e(local10);
		}
	}

	@OriginalMember(owner = "client!w", name = "K", descriptor = "(IIIIII[BII)V")
	public native void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!w", name = "va", descriptor = "()V")
	public native void va();

	@OriginalMember(owner = "client!w", name = "HA", descriptor = "(IIII)V")
	public native void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "pa", descriptor = "()I")
	public native int pa();

	@OriginalMember(owner = "client!w", name = "sa", descriptor = "(IIII)[I")
	public native int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "t", descriptor = "(I)V")
	public native void t(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(IIIIII)Lclient!ud;")
	@Override
	public Class59 method5724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ud;Lclient!ud;FLclient!ud;)Lclient!ud;")
	@Override
	public Class59 method5720(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class59 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!w", name = "T", descriptor = "()F")
	public native float T();

	@OriginalMember(owner = "client!w", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void J(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V")
	@Override
	public void method5677(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!w", name = "ua", descriptor = "()V")
	private native void ua();

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I[Lclient!ls;)V")
	@Override
	public void method5693(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub29[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static444.anIntArray513[local1++] = arg1[local3].method5837();
			Static444.anIntArray513[local1++] = arg1[local3].method5834();
			Static444.anIntArray513[local1++] = arg1[local3].method5838();
			Static444.anIntArray513[local1++] = arg1[local3].method5840();
			Static444.aFloatArray36[local3] = arg1[local3].method5841();
			Static444.anIntArray513[local1++] = arg1[local3].method5836();
		}
		this.WA(arg0, Static444.anIntArray513, Static444.aFloatArray36);
	}

	@OriginalMember(owner = "client!w", name = "ZA", descriptor = "(IIIII)V")
	protected native void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!w", name = "d", descriptor = "()V")
	@Override
	public void method5665() {
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ld;IIII)Lclient!e;")
	@Override
	public Class8 method5678(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new xa(this, this.aG1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([Lclient!e;Lclient!sj;Lclient!c;[Lclient!wp;I)V")
	@Override
	public void method5673(@OriginalArg(0) Class8[] arg0, @OriginalArg(1) Class232 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class111_Sub8[] arg3, @OriginalArg(4) int arg4) {
		this.method5612(arg1, true);
		if (arg3 == null) {
			this.method5610().D(this, arg0, arg2, null, arg4, Static444.anIntArray512, Static444.anIntArray514, Static444.anIntArray517, Static444.aShortArray112, Static444.aByteArray93, arg1.aClass15_1.method218(), Static444.anIntArray515);
		} else {
			@Pc(28) Class111_Sub8 local28 = arg3[0];
			Static444.anIntArray516[5] = 0;
			this.method5610().D(this, arg0, arg2, Static444.anIntArray516, arg4, Static444.anIntArray512, Static444.anIntArray514, Static444.anIntArray517, Static444.aShortArray112, Static444.aByteArray93, arg1.aClass15_1.method218(), Static444.anIntArray515);
			local28.anInt7285 = Static444.anIntArray516[0];
			local28.anInt7282 = Static444.anIntArray516[1];
			local28.anInt7283 = Static444.anIntArray516[2];
			local28.anInt7284 = Static444.anIntArray516[3];
			local28.anInt7286 = Static444.anIntArray516[4];
			local28.aBoolean631 = Static444.anIntArray516[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) xa local98 = (xa) arg0[local88];
				local98.method6001(local86, arg2);
				if (local98.aClass40Array4 != null) {
					local86 += local98.aClass40Array4.length * 9;
				}
				if (local98.aClass230Array4 != null) {
					local86 += local98.aClass230Array4.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "u", descriptor = "()Z")
	@Override
	public boolean method5713() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5727() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!w", name = "da", descriptor = "(FF)V")
	public native void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!w", name = "r", descriptor = "()I")
	public native int r();

	@OriginalMember(owner = "client!w", name = "R", descriptor = "()V")
	private void method5607() {
		System.gc();
		System.runFinalization();
		Static280.method3756();
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "()V")
	@Override
	protected void method5663() {
		if (this.aBoolean608) {
			return;
		}
		this.aKArray1 = null;
		this.aB1 = null;
		this.aG1 = null;
		this.aClass34_8 = null;
		this.aClass208_39.method4408();
		for (@Pc(25) g local25 = (g) this.aClass14_48.method203(); local25 != null; local25 = (g) this.aClass14_48.method208()) {
			local25.IA();
		}
		this.aClass14_48.method204();
		this.ua();
		if (this.aBoolean609) {
			Static309.method4101(true, false);
			this.aBoolean609 = false;
		}
		this.method5607();
		Static280.method3755();
		this.aBoolean608 = true;
	}

	@OriginalMember(owner = "client!w", name = "B", descriptor = "()V")
	@Override
	public void method5731() {
	}

	@OriginalMember(owner = "client!w", name = "X", descriptor = "(S)Z")
	private boolean method5608(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class25 local9 = super.anInterface4_10.method5090(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.l(arg0, local9.aByte12, local9.aByte7, local9.aBoolean56, local9.aBoolean60, local9.aBoolean57, local9.aByte8, local9.aByte13, local9.aByte11, local9.aShort16, local9.anInt355, local9.aBoolean59, local9.aBoolean55);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "qa", descriptor = "()Ljava/lang/Object;")
	private Object method5609() {
		return new pa(this);
	}

	@OriginalMember(owner = "client!w", name = "ra", descriptor = "(ILclient!ta;II)V")
	public native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!wp;I)V")
	@Override
	public void method5723(@OriginalArg(0) Class8[] arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class111_Sub8[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method5610().va(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class111_Sub8 local15 = arg2[0];
		Static444.anIntArray516[5] = 0;
		this.method5610().va(this, arg0, arg1, Static444.anIntArray516, -1, arg3);
		local15.anInt7285 = Static444.anIntArray516[0];
		local15.anInt7282 = Static444.anIntArray516[1];
		local15.anInt7283 = Static444.anIntArray516[2];
		local15.anInt7284 = Static444.anIntArray516[3];
		local15.anInt7286 = Static444.anIntArray516[4];
		local15.aBoolean631 = Static444.anIntArray516[5] != 0;
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(II)V")
	public native void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!w", name = "s", descriptor = "()Z")
	@Override
	public boolean method5711() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "C", descriptor = "()Lclient!k;")
	public k method5610() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt6979; local1++) {
			if (this.aKArray1[local1].aRunnable2 == Thread.currentThread()) {
				return this.aKArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!w", name = "t", descriptor = "()Z")
	@Override
	public boolean method5712() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method5729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.A(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5694(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aB1 == null) {
			throw new IllegalStateException("off");
		}
		this.aB1.method344(arg0, arg1);
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method5690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.ma(arg0, arg1, arg2, arg4, arg5);
		this.ma(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.IA(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.IA(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "aa", descriptor = "()F")
	public native float aa();

	@OriginalMember(owner = "client!w", name = "m", descriptor = "(S)Z")
	private boolean method5611(@OriginalArg(0) short arg0) {
		@Pc(2) Interface4 local2 = super.anInterface4_10;
		synchronized (super.anInterface4_10) {
			if (!super.anInterface4_10.method5089(arg0)) {
				return false;
			}
			@Pc(22) Class25 local22 = super.anInterface4_10.method5090(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(46) int[] local46;
			if (local22.aBoolean60 && local22.aBoolean56) {
				local46 = super.anInterface4_10.method5088(128, arg0, 0.7F, true, 128);
			} else {
				local46 = super.anInterface4_10.method5086(128, arg0, 128, 0.7F);
			}
			this.J(arg0, local22.aByte12, local22.aByte7, local22.aBoolean56, local22.aBoolean60, local22.aBoolean57, local22.aByte8, local22.aByte13, local22.aByte11, local22.aShort16, local22.anInt355, local22.aBoolean59, local22.aBoolean55, local46);
			return true;
		}
	}

	@OriginalMember(owner = "client!w", name = "W", descriptor = "(Lclient!l;II)V")
	private native void W(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!w", name = "u", descriptor = "(I)V")
	private native void u(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!w", name = "g", descriptor = "(I)V")
	@Override
	public void method5722(@OriginalArg(0) int arg0) {
		this.aKArray1[arg0].method3011();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIZ)Lclient!o;")
	@Override
	public Class85 method5709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new v(this, this.aG1, arg0, arg1, arg2, arg3) : new ca(this, this.aG1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!sj;Z)V")
	private void method5612(@OriginalArg(0) Class232 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class111_Sub1_Sub2 local15 = (Class111_Sub1_Sub2) arg0.aClass15_1.method222(); local15 != null; local15 = (Class111_Sub1_Sub2) arg0.aClass15_1.method220()) {
			Static444.anIntArray512[local1++] = local15.anInt6560;
			Static444.anIntArray512[local1++] = local15.anInt6566;
			Static444.anIntArray512[local1++] = local15.anInt6565;
			Static444.anIntArray514[local3++] = local15.anInt6561;
			Static444.aShortArray112[local7++] = (short) local15.anInt6562;
			Static444.anIntArray517[local5++] = local15.anInt6563;
			if (arg1) {
				Static444.aByteArray93[local9++] = local15.aByte92;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "B", descriptor = "(IFFFFF)V")
	public native void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!w", name = "P", descriptor = "(IIIIII)V")
	public native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!w", name = "q", descriptor = "()I")
	@Override
	public int method5710() {
		return 4;
	}

	@OriginalMember(owner = "client!w", name = "Y", descriptor = "()I")
	public native int Y();

	@OriginalMember(owner = "client!w", name = "g", descriptor = "()V")
	@Override
	public void method5679() {
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)I")
	@Override
	public int method5696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)V")
	public native void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5686(@OriginalArg(0) Canvas arg0) {
		@Pc(8) b local8 = (b) this.aClass208_39.method4405((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.U(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aB1.aCanvas1) {
			this.method5688(arg0);
		}
	}

	@OriginalMember(owner = "client!w", name = "v", descriptor = "(III[I)V")
	public native void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!w", name = "p", descriptor = "()V")
	public native void p();

	@OriginalMember(owner = "client!w", name = "n", descriptor = "()V")
	public native void n();
}
