import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class w extends Class106 implements Interface1 {

	@OriginalMember(owner = "client!w", name = "t", descriptor = "Lclient!g;")
	private g aG1;

	@OriginalMember(owner = "client!w", name = "H", descriptor = "Lclient!b;")
	private b aB1;

	@OriginalMember(owner = "client!w", name = "M", descriptor = "[Lclient!k;")
	private k[] aKArray1;

	@OriginalMember(owner = "client!w", name = "N", descriptor = "I")
	private int anInt7759;

	@OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!w", name = "u", descriptor = "Z")
	private boolean aBoolean504 = false;

	@OriginalMember(owner = "client!w", name = "v", descriptor = "Lclient!pu;")
	private final Class203 aClass203_51 = new Class203();

	@OriginalMember(owner = "client!w", name = "I", descriptor = "I")
	private final int anInt7757 = 4096;

	@OriginalMember(owner = "client!w", name = "L", descriptor = "I")
	private final int anInt7758 = 4096;

	@OriginalMember(owner = "client!w", name = "J", descriptor = "Lclient!bu;")
	private final Class38 aClass38_38 = new Class38(4);

	@OriginalMember(owner = "client!w", name = "O", descriptor = "Z")
	private boolean aBoolean506 = false;

	@OriginalMember(owner = "client!w", name = "K", descriptor = "Lclient!c;")
	private Class40 aClass40_5;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;Lclient!nv;)V")
	public w(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) Class183 arg3) {
		super(arg0, arg2);
		try {
			if (!Static440.aBoolean505) {
				if (arg3 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("sw3d");
					Static440.aBoolean505 = Boolean.TRUE;
				} else {
					arg3.method4166(this.getClass());
					Static440.aBoolean505 = Boolean.TRUE;
				}
			}
			if (!Static440.aBoolean505) {
				throw new RuntimeException("");
			}
			this.W(super.anInterface7_10, 0, 0);
			Static53.method996(true, false);
			this.aBoolean506 = true;
			this.aClass40_5 = new qa();
			this.SA(new qa());
			this.method5911(1);
			this.method5978(0);
			if (arg1 != null) {
				this.method5965(arg1);
				this.method5920(arg1);
			}
		} catch (@Pc(95) Throwable local95) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!w", name = "sa", descriptor = "(IIII)[I")
	public native int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "c", descriptor = "()Z")
	@Override
	public boolean method5910() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method5966();
		if (this.nativeid != 0L) {
			Static252.method3749(this);
		}
	}

	@OriginalMember(owner = "client!w", name = "SA", descriptor = "(Lclient!c;)V")
	public native void SA(@OriginalArg(0) Class40 arg0);

	@OriginalMember(owner = "client!w", name = "s", descriptor = "(IIII)V")
	public native void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "f", descriptor = "()Z")
	@Override
	public boolean method5925() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "ua", descriptor = "()V")
	private native void ua();

	@OriginalMember(owner = "client!w", name = "v", descriptor = "()V")
	@Override
	public void method5961() {
	}

	@OriginalMember(owner = "client!w", name = "s", descriptor = "()V")
	@Override
	public void method5950() {
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ug;)V")
	@Override
	public void method5967(@OriginalArg(0) Class86 arg0) {
	}

	@OriginalMember(owner = "client!w", name = "VA", descriptor = "(IIIIII)Z")
	public native boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!w", name = "t", descriptor = "()Z")
	@Override
	public boolean method5953() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "w", descriptor = "()Z")
	@Override
	public boolean method5963() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(Z)V")
	@Override
	public void method5982(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!w", name = "aa", descriptor = "()F")
	public native float aa();

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(IIIIII)Lclient!ug;")
	@Override
	public Class86 method5929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!w", name = "qa", descriptor = "()Ljava/lang/Object;")
	private Object method5983() {
		return new pa(this);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	@Override
	public Class96 method5979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new fa(this, this.aG1, arg0, arg1, arg2, arg3, 128, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([IIIII)Lclient!o;")
	@Override
	public Class137 method5969(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([Lclient!e;Lclient!d;Lclient!c;[Lclient!tq;I)V")
	@Override
	public void method5947(@OriginalArg(0) Class17[] arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) Class41_Sub8[] arg3, @OriginalArg(4) int arg4) {
		this.method5985(arg1, true);
		if (arg3 == null) {
			this.method5986().D(this, arg0, arg2, null, arg4, Static440.anIntArray732, Static440.anIntArray730, Static440.anIntArray731, Static440.aShortArray136, Static440.aByteArray92, arg1.aClass60_1.method1505(), Static440.anIntArray733);
		} else {
			@Pc(28) Class41_Sub8 local28 = arg3[0];
			Static440.anIntArray729[5] = 0;
			this.method5986().D(this, arg0, arg2, Static440.anIntArray729, arg4, Static440.anIntArray732, Static440.anIntArray730, Static440.anIntArray731, Static440.aShortArray136, Static440.aByteArray92, arg1.aClass60_1.method1505(), Static440.anIntArray733);
			local28.anInt7135 = Static440.anIntArray729[0];
			local28.anInt7134 = Static440.anIntArray729[1];
			local28.anInt7138 = Static440.anIntArray729[2];
			local28.anInt7136 = Static440.anIntArray729[3];
			local28.anInt7137 = Static440.anIntArray729[4];
			local28.aBoolean441 = Static440.anIntArray729[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) xa local98 = (xa) arg0[local88];
				local98.method6207(local86, arg2);
				if (local98.aClass94Array4 != null) {
					local86 += local98.aClass94Array4.length * 9;
				}
				if (local98.aClass114Array4 != null) {
					local86 += local98.aClass114Array4.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "JA", descriptor = "(F)V")
	public native void JA(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!w", name = "A", descriptor = "(IIIIII)V")
	private native void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!wh;Z)Lclient!o;")
	@Override
	public Class137 method5938(@OriginalArg(0) Class266 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray742;
		@Pc(5) byte[] local5 = arg0.aByteArray94;
		@Pc(8) int local8 = arg0.anInt7823;
		@Pc(11) int local11 = arg0.anInt7824;
		@Pc(32) Class137 local32;
		if (arg0.aByteArray95 == null) {
			local32 = new q(this, this.aG1, local2, local5, 0, arg0.anInt7823, arg0.anInt7823, arg0.anInt7824);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray95;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray742[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new v(this, this.aG1, local40, 0, arg0.anInt7823, arg0.anInt7823, arg0.anInt7824);
				} else {
					local32 = new ca(this, this.aG1, local40, 0, arg0.anInt7823, arg0.anInt7823, arg0.anInt7824);
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
		local32.ha(arg0.anInt7825, arg0.anInt7826, arg0.anInt7821, arg0.anInt7822);
		return local32;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!w", name = "WA", descriptor = "(I[I[F)V")
	private native void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!w", name = "va", descriptor = "()V")
	public native void va();

	@OriginalMember(owner = "client!w", name = "z", descriptor = "()Z")
	@Override
	public boolean method5975() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void J(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!w", name = "Y", descriptor = "()I")
	public native int Y();

	@OriginalMember(owner = "client!w", name = "ma", descriptor = "(IIIII)V")
	public native void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!w", name = "ra", descriptor = "(ILclient!ta;II)V")
	public native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "n", descriptor = "()V")
	public native void n();

	@OriginalMember(owner = "client!w", name = "h", descriptor = "()Z")
	@Override
	public boolean method5927() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "A", descriptor = "()V")
	@Override
	public void method5977() {
		if (this.aB1 == null) {
			throw new IllegalStateException("off");
		}
		this.aB1.method480();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIZ)Lclient!o;")
	@Override
	public Class137 method5931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new v(this, this.aG1, arg0, arg1, arg2, arg3) : new ca(this, this.aG1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.ma(arg0, arg1, arg2, arg4, arg5);
		this.ma(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.IA(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.IA(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIF)Lclient!ja;")
	@Override
	public Class1_Sub4 method5924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub4_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
	@Override
	public void method5957(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	@Override
	public void method5911(@OriginalArg(0) int arg0) {
		this.anInt7759 = arg0;
		this.aKArray1 = new k[this.anInt7759];
		for (@Pc(9) int local9 = 0; local9 < this.anInt7759; local9++) {
			this.aKArray1[local9] = new k(this, this.anInt7758, this.anInt7757);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5917(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5934(@OriginalArg(0) Canvas arg0) {
		@Pc(8) b local8 = (b) this.aClass38_38.method765((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.U(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aB1.aCanvas4) {
			this.method5920(arg0);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)I")
	@Override
	public int method5913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
	@Override
	public void method5915(@OriginalArg(0) int arg0) {
		this.aKArray1[arg0].method3254();
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(I)Lclient!n;")
	@Override
	public Class1_Sub11 method5940(@OriginalArg(0) int arg0) {
		@Pc(5) g local5 = new g(this, arg0);
		this.aClass203_51.method4551(local5);
		return local5;
	}

	@OriginalMember(owner = "client!w", name = "g", descriptor = "(I)V")
	@Override
	public void method5978(@OriginalArg(0) int arg0) {
		this.aKArray1[arg0].method3255();
	}

	@OriginalMember(owner = "client!w", name = "W", descriptor = "(Lclient!l;II)V")
	private native void W(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!w", name = "v", descriptor = "(III[I)V")
	public native void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!w", name = "m", descriptor = "()Lclient!c;")
	@Override
	public Class40 method5944() {
		return new qa();
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "()Z")
	@Override
	public boolean method5912() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "B", descriptor = "(IFFFFF)V")
	public native void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5920(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aB1 = null;
			this.e(null);
		} else {
			@Pc(10) b local10 = (b) this.aClass38_38.method765((long) arg0.hashCode());
			this.aB1 = local10;
			this.e(local10);
		}
	}

	@OriginalMember(owner = "client!w", name = "q", descriptor = "()Z")
	@Override
	public boolean method5949() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ug;Lclient!ug;FLclient!ug;)Lclient!ug;")
	@Override
	public Class86 method5972(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class86 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!w", name = "R", descriptor = "()V")
	private void method5984() {
		System.gc();
		System.runFinalization();
		Static252.method3747();
	}

	@OriginalMember(owner = "client!w", name = "HA", descriptor = "(IIII)V")
	public native void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "u", descriptor = "(I)V")
	private native void u(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!w", name = "GA", descriptor = "(IIII)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V")
	@Override
	public void method5976(@OriginalArg(0) int arg0) {
		Static252.method3747();
		this.u(arg0);
		for (@Pc(10) g local10 = (g) this.aClass203_51.method4548(); local10 != null; local10 = (g) this.aClass203_51.method4545()) {
			local10.T();
		}
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(Lclient!b;)V")
	private native void e(@OriginalArg(0) b arg0);

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5959(@OriginalArg(0) Canvas arg0) {
		if (this.aB1.aCanvas4 == arg0) {
			this.method5920(null);
		}
		@Pc(16) b local16 = (b) this.aClass38_38.method765((long) arg0.hashCode());
		if (local16 != null) {
			local16.method6178();
			local16.method481();
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!e;Lclient!d;Lclient!c;Lclient!tq;I)V")
	@Override
	public void method5952(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) Class41_Sub8 arg3) {
		this.method5985(arg1, true);
		if (arg3 == null) {
			this.method5986().FA(this, arg0, arg2, null, 0, Static440.anIntArray732, Static440.anIntArray730, Static440.anIntArray731, Static440.aShortArray136, Static440.aByteArray92, arg1.aClass60_1.method1505(), Static440.anIntArray733);
		} else {
			Static440.anIntArray729[5] = 0;
			this.method5986().FA(this, arg0, arg2, Static440.anIntArray729, 0, Static440.anIntArray732, Static440.anIntArray730, Static440.anIntArray731, Static440.aShortArray136, Static440.aByteArray92, arg1.aClass60_1.method1505(), Static440.anIntArray733);
			arg3.anInt7135 = Static440.anIntArray729[0];
			arg3.anInt7134 = Static440.anIntArray729[1];
			arg3.anInt7138 = Static440.anIntArray729[2];
			arg3.anInt7136 = Static440.anIntArray729[3];
			arg3.anInt7137 = Static440.anIntArray729[4];
			arg3.aBoolean441 = Static440.anIntArray729[5] != 0;
		}
		@Pc(83) xa local83 = (xa) arg0;
		local83.method6207(0, arg2);
	}

	@OriginalMember(owner = "client!w", name = "t", descriptor = "(I)V")
	public native void t(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!tq;I)V")
	@Override
	public void method5943(@OriginalArg(0) Class17[] arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) Class41_Sub8[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method5986().va(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class41_Sub8 local15 = arg2[0];
		Static440.anIntArray729[5] = 0;
		this.method5986().va(this, arg0, arg1, Static440.anIntArray729, -1, arg3);
		local15.anInt7135 = Static440.anIntArray729[0];
		local15.anInt7134 = Static440.anIntArray729[1];
		local15.anInt7138 = Static440.anIntArray729[2];
		local15.anInt7136 = Static440.anIntArray729[3];
		local15.anInt7137 = Static440.anIntArray729[4];
		local15.aBoolean441 = Static440.anIntArray729[5] != 0;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method5923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.A(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "NA", descriptor = "(IIIIIILclient!ta;II)V")
	private native void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class24 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!w", name = "B", descriptor = "()Z")
	@Override
	public boolean method5980() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "Q", descriptor = "(III)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!w", name = "ZA", descriptor = "(IIIII)V")
	protected native void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ko;IIII)Lclient!e;")
	@Override
	public Class17 method5922(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new xa(this, this.aG1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!d;)V")
	@Override
	public void method5908(@OriginalArg(0) Class51 arg0) {
		this.method5985(arg0, false);
		this.method5986().J(this, Static440.anIntArray732, Static440.anIntArray730, Static440.anIntArray731, Static440.aShortArray136, arg0.aClass60_1.method1505());
	}

	@OriginalMember(owner = "client!w", name = "y", descriptor = "()Z")
	@Override
	public boolean method5973() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5914() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!w", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void l(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(II)I")
	@Override
	public int method5954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5965(@OriginalArg(0) Canvas arg0) {
		@Pc(8) b local8 = (b) this.aClass38_38.method765((long) arg0.hashCode());
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
		this.aClass38_38.method766(local8, (long) arg0.hashCode());
	}

	@OriginalMember(owner = "client!w", name = "l", descriptor = "()Z")
	@Override
	public boolean method5942() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	@Override
	public void method5933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class24 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.NA(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!w", name = "k", descriptor = "()V")
	@Override
	public void method5935() {
	}

	@OriginalMember(owner = "client!w", name = "g", descriptor = "()V")
	@Override
	public void method5926() {
	}

	@OriginalMember(owner = "client!w", name = "da", descriptor = "(FF)V")
	public native void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!d;Z)V")
	private void method5985(@OriginalArg(0) Class51 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class41_Sub3_Sub2 local15 = (Class41_Sub3_Sub2) arg0.aClass60_1.method1513(); local15 != null; local15 = (Class41_Sub3_Sub2) arg0.aClass60_1.method1512()) {
			Static440.anIntArray732[local1++] = local15.anInt5607;
			Static440.anIntArray732[local1++] = local15.anInt5610;
			Static440.anIntArray732[local1++] = local15.anInt5606;
			Static440.anIntArray730[local3++] = local15.anInt5608;
			Static440.aShortArray136[local7++] = (short) local15.anInt5609;
			Static440.anIntArray731[local5++] = local15.anInt5605;
			if (arg1) {
				Static440.aByteArray92[local9++] = local15.aByte73;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "K", descriptor = "(IIIIII[BII)V")
	public native void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!w", name = "b", descriptor = "()Z")
	@Override
	public boolean method5907() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(II)V")
	public native void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!w", name = "ba", descriptor = "(IIII)V")
	public native void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "p", descriptor = "()V")
	public native void p();

	@OriginalMember(owner = "client!w", name = "MA", descriptor = "([I)V")
	public native void MA(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!w", name = "C", descriptor = "()Lclient!k;")
	public k method5986() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7759; local1++) {
			if (this.aKArray1[local1].aRunnable2 == Thread.currentThread()) {
				return this.aKArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!w", name = "T", descriptor = "()F")
	public native float T();

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
	@Override
	public void method5955(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!w", name = "i", descriptor = "()I")
	@Override
	public int method5928() {
		return 4;
	}

	@OriginalMember(owner = "client!w", name = "j", descriptor = "()Z")
	@Override
	public boolean method5930() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5946(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aB1 == null) {
			throw new IllegalStateException("off");
		}
		this.aB1.method483(arg0, arg1);
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "()Lclient!c;")
	@Override
	public Class40 method5918() {
		return this.aClass40_5;
	}

	@OriginalMember(owner = "client!w", name = "o", descriptor = "()Z")
	@Override
	public boolean method5945() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "QA", descriptor = "(Lclient!n;)V")
	private native void QA(@OriginalArg(0) Class1_Sub11 arg0);

	@OriginalMember(owner = "client!w", name = "m", descriptor = "(S)Z")
	private boolean method5987(@OriginalArg(0) short arg0) {
		@Pc(2) Interface7 local2 = super.anInterface7_10;
		synchronized (super.anInterface7_10) {
			if (!super.anInterface7_10.method77(arg0)) {
				return false;
			}
			@Pc(22) Class150 local22 = super.anInterface7_10.method78(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(46) int[] local46;
			if (local22.aBoolean274 && local22.aBoolean276) {
				local46 = super.anInterface7_10.method76(arg0, 0.7F, 128, 128, true);
			} else {
				local46 = super.anInterface7_10.method79(128, arg0, 128, 0.7F);
			}
			this.J(arg0, local22.aByte54, local22.aByte56, local22.aBoolean276, local22.aBoolean274, local22.aBoolean275, local22.aByte55, local22.aByte52, local22.aByte53, local22.aShort59, local22.anInt4425, local22.aBoolean271, local22.aBoolean270, local46);
			return true;
		}
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V")
	@Override
	public void method5971(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!w", name = "X", descriptor = "(S)Z")
	private boolean method5988(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class150 local9 = super.anInterface7_10.method78(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.l(arg0, local9.aByte54, local9.aByte56, local9.aBoolean276, local9.aBoolean274, local9.aBoolean275, local9.aByte55, local9.aByte52, local9.aByte53, local9.aShort59, local9.anInt4425, local9.aBoolean271, local9.aBoolean270);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)V")
	public native void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "()V")
	@Override
	protected void method5906() {
		if (this.aBoolean504) {
			return;
		}
		this.aKArray1 = null;
		this.aB1 = null;
		this.aG1 = null;
		this.aClass40_5 = null;
		this.aClass38_38.method774();
		for (@Pc(25) g local25 = (g) this.aClass203_51.method4548(); local25 != null; local25 = (g) this.aClass203_51.method4545()) {
			local25.IA();
		}
		this.aClass203_51.method4553();
		this.ua();
		if (this.aBoolean506) {
			Static198.method6180(true, false);
			this.aBoolean506 = false;
		}
		this.method5984();
		Static252.method3746();
		this.aBoolean504 = true;
	}

	@OriginalMember(owner = "client!w", name = "r", descriptor = "()I")
	public native int r();

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I[Lclient!ja;)V")
	@Override
	public void method5956(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub4[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static440.anIntArray734[local1++] = arg1[local3].method3813();
			Static440.anIntArray734[local1++] = arg1[local3].method3810();
			Static440.anIntArray734[local1++] = arg1[local3].method3809();
			Static440.anIntArray734[local1++] = arg1[local3].method3805();
			Static440.aFloatArray31[local3] = arg1[local3].method3811();
			Static440.anIntArray734[local1++] = arg1[local3].method3808();
		}
		this.WA(arg0, Static440.anIntArray734, Static440.aFloatArray31);
	}

	@OriginalMember(owner = "client!w", name = "IA", descriptor = "(IIIII)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!w", name = "x", descriptor = "()V")
	@Override
	public void method5964() {
	}

	@OriginalMember(owner = "client!w", name = "OA", descriptor = "()I")
	public native int OA();

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	@Override
	public Class24 method5939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new va(this, this.aG1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5986().q(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!w", name = "P", descriptor = "(IIIIII)V")
	public native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!w", name = "AA", descriptor = "()I")
	public native int AA();

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method5970(@OriginalArg(0) Class1_Sub11 arg0) {
		this.aG1 = (g) arg0;
		this.QA(arg0);
	}

	@OriginalMember(owner = "client!w", name = "ya", descriptor = "(I)V")
	public native void ya(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!qm;[Lclient!wh;Z)Lclient!la;")
	@Override
	public Class20 method5968(@OriginalArg(0) Class209 arg0, @OriginalArg(1) Class266[] arg1) {
		return new ra(this, this.aG1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!w", name = "pa", descriptor = "()I")
	public native int pa();

	@OriginalMember(owner = "client!w", name = "u", descriptor = "()Z")
	@Override
	public boolean method5960() {
		return false;
	}
}
