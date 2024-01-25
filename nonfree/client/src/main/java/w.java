import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class w extends Class163 implements Interface8 {

	@OriginalMember(owner = "client!w", name = "t", descriptor = "Lclient!g;")
	private g aG1;

	@OriginalMember(owner = "client!w", name = "K", descriptor = "Lclient!b;")
	private b aB1;

	@OriginalMember(owner = "client!w", name = "M", descriptor = "[Lclient!k;")
	private k[] aKArray1;

	@OriginalMember(owner = "client!w", name = "O", descriptor = "I")
	private int anInt7077;

	@OriginalMember(owner = "client!w", name = "C", descriptor = "Z")
	private boolean aBoolean512 = false;

	@OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!w", name = "v", descriptor = "Lclient!mg;")
	private final Class156 aClass156_58 = new Class156();

	@OriginalMember(owner = "client!w", name = "L", descriptor = "I")
	private final int anInt7076 = 4096;

	@OriginalMember(owner = "client!w", name = "J", descriptor = "I")
	private final int anInt7075 = 4096;

	@OriginalMember(owner = "client!w", name = "I", descriptor = "Lclient!ew;")
	private final Class72 aClass72_46 = new Class72(4);

	@OriginalMember(owner = "client!w", name = "N", descriptor = "Z")
	private boolean aBoolean514 = false;

	@OriginalMember(owner = "client!w", name = "H", descriptor = "Lclient!c;")
	private Class31 aClass31_5;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;Lclient!or;)V")
	public w(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface9 arg2, @OriginalArg(3) Class183 arg3) {
		super(arg0, arg2);
		try {
			if (!Static439.aBoolean513) {
				if (arg3 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("sw3d");
					Static439.aBoolean513 = Boolean.TRUE;
				} else {
					arg3.method3898(this.getClass());
					Static439.aBoolean513 = Boolean.TRUE;
				}
			}
			if (!Static439.aBoolean513) {
				throw new RuntimeException("");
			}
			this.W(super.anInterface9_12, 0, 0);
			Static340.method5394(true, false);
			this.aBoolean514 = true;
			this.aClass31_5 = new qa();
			this.SA(new qa());
			this.method5564(1);
			this.method5547(0);
			if (arg1 != null) {
				this.method5518(arg1);
				this.method5560(arg1);
			}
		} catch (@Pc(95) Throwable local95) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!w", name = "QA", descriptor = "(Lclient!n;)V")
	private native void QA(@OriginalArg(0) Class2_Sub6 arg0);

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5519(@OriginalArg(0) Canvas arg0) {
		@Pc(8) b local8 = (b) this.aClass72_46.method1659((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.U(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aB1.aCanvas1) {
			this.method5560(arg0);
		}
	}

	@OriginalMember(owner = "client!w", name = "WA", descriptor = "(I[I[F)V")
	private native void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!vk;Z)V")
	private void method5568(@OriginalArg(0) Class256 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class21_Sub1_Sub1 local15 = (Class21_Sub1_Sub1) arg0.aClass187_1.method3974(); local15 != null; local15 = (Class21_Sub1_Sub1) arg0.aClass187_1.method3970()) {
			Static439.anIntArray623[local1++] = local15.anInt543;
			Static439.anIntArray623[local1++] = local15.anInt544;
			Static439.anIntArray623[local1++] = local15.anInt547;
			Static439.anIntArray627[local3++] = local15.anInt545;
			Static439.aShortArray106[local7++] = (short) local15.anInt548;
			Static439.anIntArray625[local5++] = local15.anInt542;
			if (arg1) {
				Static439.aByteArray91[local9++] = local15.aByte6;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!rr;I)V")
	@Override
	public void method5509(@OriginalArg(0) Class59[] arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class21_Sub7[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method5570().va(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class21_Sub7 local15 = arg2[0];
		Static439.anIntArray624[5] = 0;
		this.method5570().va(this, arg0, arg1, Static439.anIntArray624, -1, arg3);
		local15.anInt5998 = Static439.anIntArray624[0];
		local15.anInt6002 = Static439.anIntArray624[1];
		local15.anInt6000 = Static439.anIntArray624[2];
		local15.anInt6001 = Static439.anIntArray624[3];
		local15.anInt5999 = Static439.anIntArray624[4];
		local15.aBoolean436 = Static439.anIntArray624[5] != 0;
	}

	@OriginalMember(owner = "client!w", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void l(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)I")
	@Override
	public int method5502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!w", name = "ZA", descriptor = "(IIIII)V")
	protected native void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!w", name = "T", descriptor = "()F")
	public native float T();

	@OriginalMember(owner = "client!w", name = "da", descriptor = "(FF)V")
	public native void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5515(@OriginalArg(0) Canvas arg0) {
		if (this.aB1.aCanvas1 == arg0) {
			this.method5560(null);
		}
		@Pc(16) b local16 = (b) this.aClass72_46.method1659((long) arg0.hashCode());
		if (local16 != null) {
			local16.method5703();
			local16.method276();
		}
	}

	@OriginalMember(owner = "client!w", name = "r", descriptor = "()I")
	public native int r();

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ks;Lclient!ks;FLclient!ks;)Lclient!ks;")
	@Override
	public Class109 method5525(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class109 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!w", name = "k", descriptor = "()Z")
	@Override
	public boolean method5521() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "t", descriptor = "(I)V")
	public native void t(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!w", name = "NA", descriptor = "(IIIIIILclient!ta;II)V")
	private native void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class35 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5523() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!w", name = "Y", descriptor = "()I")
	public native int Y();

	@OriginalMember(owner = "client!w", name = "GA", descriptor = "(IIII)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "aa", descriptor = "()F")
	public native float aa();

	@OriginalMember(owner = "client!w", name = "pa", descriptor = "()I")
	public native int pa();

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!w", name = "u", descriptor = "()Z")
	@Override
	public boolean method5548() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5535(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aB1 == null) {
			throw new IllegalStateException("off");
		}
		this.aB1.method275(arg0, arg1);
	}

	@OriginalMember(owner = "client!w", name = "va", descriptor = "()V")
	public native void va();

	@OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method5554();
		if (this.nativeid != 0L) {
			Static1.method4(this);
		}
	}

	@OriginalMember(owner = "client!w", name = "v", descriptor = "(III[I)V")
	public native void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!w", name = "W", descriptor = "(Lclient!l;II)V")
	private native void W(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ks;)V")
	@Override
	public void method5561(@OriginalArg(0) Class109 arg0) {
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(Lclient!b;)V")
	private native void e(@OriginalArg(0) b arg0);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)V")
	public native void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "m", descriptor = "(S)Z")
	private boolean method5569(@OriginalArg(0) short arg0) {
		@Pc(2) Interface9 local2 = super.anInterface9_12;
		synchronized (super.anInterface9_12) {
			if (!super.anInterface9_12.method1773(arg0)) {
				return false;
			}
			@Pc(22) Class158 local22 = super.anInterface9_12.method1769(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(46) int[] local46;
			if (local22.aBoolean284 && local22.aBoolean280) {
				local46 = super.anInterface9_12.method1770(128, arg0, 0.7F, true, 128);
			} else {
				local46 = super.anInterface9_12.method1772(128, 0.7F, arg0, 128);
			}
			this.J(arg0, local22.aByte47, local22.aByte45, local22.aBoolean280, local22.aBoolean284, local22.aBoolean281, local22.aByte48, local22.aByte42, local22.aByte43, local22.aShort37, local22.anInt4043, local22.aBoolean278, local22.aBoolean285, local46);
			return true;
		}
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
	@Override
	public void method5510(@OriginalArg(0) int arg0) {
		Static1.method2();
		this.u(arg0);
		for (@Pc(10) g local10 = (g) this.aClass156_58.method3155(); local10 != null; local10 = (g) this.aClass156_58.method3150()) {
			local10.T();
		}
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "()V")
	@Override
	public void method5505() {
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5560(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aB1 = null;
			this.e(null);
		} else {
			@Pc(10) b local10 = (b) this.aClass72_46.method1659((long) arg0.hashCode());
			this.aB1 = local10;
			this.e(local10);
		}
	}

	@OriginalMember(owner = "client!w", name = "C", descriptor = "()Lclient!k;")
	public k method5570() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7077; local1++) {
			if (this.aKArray1[local1].aRunnable1 == Thread.currentThread()) {
				return this.aKArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!w", name = "n", descriptor = "()V")
	public native void n();

	@OriginalMember(owner = "client!w", name = "B", descriptor = "()Lclient!c;")
	@Override
	public Class31 method5566() {
		return new qa();
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "()V")
	@Override
	public void method5498() {
	}

	@OriginalMember(owner = "client!w", name = "j", descriptor = "()V")
	@Override
	public void method5520() {
	}

	@OriginalMember(owner = "client!w", name = "s", descriptor = "()Z")
	@Override
	public boolean method5541() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "h", descriptor = "(I)V")
	@Override
	public void method5564(@OriginalArg(0) int arg0) {
		this.anInt7077 = arg0;
		this.aKArray1 = new k[this.anInt7077];
		for (@Pc(9) int local9 = 0; local9 < this.anInt7077; local9++) {
			this.aKArray1[local9] = new k(this, this.anInt7076, this.anInt7075);
		}
	}

	@OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V")
	@Override
	public void method5547(@OriginalArg(0) int arg0) {
		this.aKArray1[arg0].method2697();
	}

	@OriginalMember(owner = "client!w", name = "MA", descriptor = "([I)V")
	public native void MA(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!w", name = "X", descriptor = "(S)Z")
	private boolean method5571(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class158 local9 = super.anInterface9_12.method1769(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.l(arg0, local9.aByte47, local9.aByte45, local9.aBoolean280, local9.aBoolean284, local9.aBoolean281, local9.aByte48, local9.aByte42, local9.aByte43, local9.aShort37, local9.anInt4043, local9.aBoolean278, local9.aBoolean285);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method5533(@OriginalArg(0) Class2_Sub6 arg0) {
		this.aG1 = (g) arg0;
		this.QA(arg0);
	}

	@OriginalMember(owner = "client!w", name = "t", descriptor = "()Z")
	@Override
	public boolean method5544() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([Lclient!e;Lclient!vk;Lclient!c;[Lclient!rr;I)V")
	@Override
	public void method5556(@OriginalArg(0) Class59[] arg0, @OriginalArg(1) Class256 arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Class21_Sub7[] arg3, @OriginalArg(4) int arg4) {
		this.method5568(arg1, true);
		if (arg3 == null) {
			this.method5570().D(this, arg0, arg2, null, arg4, Static439.anIntArray623, Static439.anIntArray627, Static439.anIntArray625, Static439.aShortArray106, Static439.aByteArray91, arg1.aClass187_1.method3972(), Static439.anIntArray622);
		} else {
			@Pc(28) Class21_Sub7 local28 = arg3[0];
			Static439.anIntArray624[5] = 0;
			this.method5570().D(this, arg0, arg2, Static439.anIntArray624, arg4, Static439.anIntArray623, Static439.anIntArray627, Static439.anIntArray625, Static439.aShortArray106, Static439.aByteArray91, arg1.aClass187_1.method3972(), Static439.anIntArray622);
			local28.anInt5998 = Static439.anIntArray624[0];
			local28.anInt6002 = Static439.anIntArray624[1];
			local28.anInt6000 = Static439.anIntArray624[2];
			local28.anInt6001 = Static439.anIntArray624[3];
			local28.anInt5999 = Static439.anIntArray624[4];
			local28.aBoolean436 = Static439.anIntArray624[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) xa local98 = (xa) arg0[local88];
				local98.method5753(local86, arg2);
				if (local98.aClass155Array4 != null) {
					local86 += local98.aClass155Array4.length * 9;
				}
				if (local98.aClass199Array4 != null) {
					local86 += local98.aClass199Array4.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "()Z")
	@Override
	public boolean method5492() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!qq;IIII)Lclient!e;")
	@Override
	public Class59 method5530(@OriginalArg(0) Class205 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new xa(this, this.aG1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!w", name = "w", descriptor = "()I")
	@Override
	public int method5553() {
		return 4;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I[Lclient!sa;)V")
	@Override
	public void method5536(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub29[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static439.anIntArray626[local1++] = arg1[local3].method5687();
			Static439.anIntArray626[local1++] = arg1[local3].method5695();
			Static439.anIntArray626[local1++] = arg1[local3].method5693();
			Static439.anIntArray626[local1++] = arg1[local3].method5691();
			Static439.aFloatArray36[local3] = arg1[local3].method5694();
			Static439.anIntArray626[local1++] = arg1[local3].method5692();
		}
		this.WA(arg0, Static439.anIntArray626, Static439.aFloatArray36);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	@Override
	public void method5495(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5517(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	@Override
	public Class162 method5557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new fa(this, this.aG1, arg0, arg1, arg2, arg3, 128, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "OA", descriptor = "()I")
	public native int OA();

	@OriginalMember(owner = "client!w", name = "P", descriptor = "(IIIIII)V")
	public native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5570().q(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([IIIII)Lclient!o;")
	@Override
	public Class13 method5522(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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

	@OriginalMember(owner = "client!w", name = "ba", descriptor = "(IIII)V")
	public native void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(II)V")
	public native void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
	@Override
	public void method5496(@OriginalArg(0) int arg0) {
		this.aKArray1[arg0].method2696();
	}

	@OriginalMember(owner = "client!w", name = "g", descriptor = "()Z")
	@Override
	public boolean method5508() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "HA", descriptor = "(IIII)V")
	public native void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "h", descriptor = "()V")
	@Override
	public void method5511() {
	}

	@OriginalMember(owner = "client!w", name = "s", descriptor = "(IIII)V")
	public native void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIF)Lclient!sa;")
	@Override
	public Class2_Sub29 method5542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub29_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "f", descriptor = "()Z")
	@Override
	public boolean method5507() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "AA", descriptor = "()I")
	public native int AA();

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
	@Override
	public void method5493(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!w", name = "VA", descriptor = "(IIIIII)Z")
	public native boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!w", name = "ra", descriptor = "(ILclient!ta;II)V")
	public native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V")
	@Override
	public void method5531(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(II)I")
	@Override
	public int method5514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	@Override
	public void method5546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class35 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.NA(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method5565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.ma(arg0, arg1, arg2, arg4, arg5);
		this.ma(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.IA(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.IA(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(Z)V")
	@Override
	public void method5534(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!kt;[Lclient!au;Z)Lclient!la;")
	@Override
	public Class92 method5537(@OriginalArg(0) Class141 arg0, @OriginalArg(1) Class17[] arg1) {
		return new ra(this, this.aG1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!w", name = "p", descriptor = "()V")
	public native void p();

	@OriginalMember(owner = "client!w", name = "ua", descriptor = "()V")
	private native void ua();

	@OriginalMember(owner = "client!w", name = "l", descriptor = "()Z")
	@Override
	public boolean method5524() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "y", descriptor = "()V")
	@Override
	public void method5559() {
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!vk;)V")
	@Override
	public void method5503(@OriginalArg(0) Class256 arg0) {
		this.method5568(arg0, false);
		this.method5570().J(this, Static439.anIntArray623, Static439.anIntArray627, Static439.anIntArray625, Static439.aShortArray106, arg0.aClass187_1.method3972());
	}

	@OriginalMember(owner = "client!w", name = "B", descriptor = "(IFFFFF)V")
	public native void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5518(@OriginalArg(0) Canvas arg0) {
		@Pc(8) b local8 = (b) this.aClass72_46.method1659((long) arg0.hashCode());
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
		this.aClass72_46.method1653(local8, (long) arg0.hashCode());
	}

	@OriginalMember(owner = "client!w", name = "z", descriptor = "()V")
	@Override
	public void method5562() {
		if (this.aB1 == null) {
			throw new IllegalStateException("off");
		}
		this.aB1.method274();
	}

	@OriginalMember(owner = "client!w", name = "sa", descriptor = "(IIII)[I")
	public native int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void J(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)Lclient!n;")
	@Override
	public Class2_Sub6 method5506(@OriginalArg(0) int arg0) {
		@Pc(5) g local5 = new g(this, arg0);
		this.aClass156_58.method3157(local5);
		return local5;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII)Lclient!ks;")
	@Override
	public Class109 method5499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!w", name = "q", descriptor = "()Lclient!c;")
	@Override
	public Class31 method5539() {
		return this.aClass31_5;
	}

	@OriginalMember(owner = "client!w", name = "i", descriptor = "()Z")
	@Override
	public boolean method5516() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "ma", descriptor = "(IIIII)V")
	public native void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!w", name = "u", descriptor = "(I)V")
	private native void u(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!w", name = "R", descriptor = "()V")
	private void method5572() {
		System.gc();
		System.runFinalization();
		Static1.method2();
	}

	@OriginalMember(owner = "client!w", name = "A", descriptor = "(IIIIII)V")
	private native void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!w", name = "ya", descriptor = "(I)V")
	public native void ya(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!w", name = "SA", descriptor = "(Lclient!c;)V")
	public native void SA(@OriginalArg(0) Class31 arg0);

	@OriginalMember(owner = "client!w", name = "x", descriptor = "()Z")
	@Override
	public boolean method5555() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "()Z")
	@Override
	public boolean method5491() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "o", descriptor = "()Z")
	@Override
	public boolean method5538() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.A(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!e;Lclient!vk;Lclient!c;Lclient!rr;I)V")
	@Override
	public void method5551(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class256 arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Class21_Sub7 arg3) {
		this.method5568(arg1, true);
		if (arg3 == null) {
			this.method5570().FA(this, arg0, arg2, null, 0, Static439.anIntArray623, Static439.anIntArray627, Static439.anIntArray625, Static439.aShortArray106, Static439.aByteArray91, arg1.aClass187_1.method3972(), Static439.anIntArray622);
		} else {
			Static439.anIntArray624[5] = 0;
			this.method5570().FA(this, arg0, arg2, Static439.anIntArray624, 0, Static439.anIntArray623, Static439.anIntArray627, Static439.anIntArray625, Static439.aShortArray106, Static439.aByteArray91, arg1.aClass187_1.method3972(), Static439.anIntArray622);
			arg3.anInt5998 = Static439.anIntArray624[0];
			arg3.anInt6002 = Static439.anIntArray624[1];
			arg3.anInt6000 = Static439.anIntArray624[2];
			arg3.anInt6001 = Static439.anIntArray624[3];
			arg3.anInt5999 = Static439.anIntArray624[4];
			arg3.aBoolean436 = Static439.anIntArray624[5] != 0;
		}
		@Pc(83) xa local83 = (xa) arg0;
		local83.method5753(0, arg2);
	}

	@OriginalMember(owner = "client!w", name = "JA", descriptor = "(F)V")
	public native void JA(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!au;Z)Lclient!o;")
	@Override
	public Class13 method5549(@OriginalArg(0) Class17 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray32;
		@Pc(5) byte[] local5 = arg0.aByteArray4;
		@Pc(8) int local8 = arg0.anInt342;
		@Pc(11) int local11 = arg0.anInt345;
		@Pc(32) Class13 local32;
		if (arg0.aByteArray3 == null) {
			local32 = new q(this, this.aG1, local2, local5, 0, arg0.anInt342, arg0.anInt342, arg0.anInt345);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray3;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray32[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new v(this, this.aG1, local40, 0, arg0.anInt342, arg0.anInt342, arg0.anInt345);
				} else {
					local32 = new ca(this, this.aG1, local40, 0, arg0.anInt342, arg0.anInt342, arg0.anInt345);
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
		local32.ha(arg0.anInt341, arg0.anInt344, arg0.anInt343, arg0.anInt346);
		return local32;
	}

	@OriginalMember(owner = "client!w", name = "IA", descriptor = "(IIIII)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!w", name = "A", descriptor = "()Z")
	@Override
	public boolean method5563() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "Q", descriptor = "(III)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!w", name = "qa", descriptor = "()Ljava/lang/Object;")
	private Object method5573() {
		return new pa(this);
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "()V")
	@Override
	protected void method5497() {
		if (this.aBoolean512) {
			return;
		}
		this.aKArray1 = null;
		this.aB1 = null;
		this.aG1 = null;
		this.aClass31_5 = null;
		this.aClass72_46.method1650();
		for (@Pc(25) g local25 = (g) this.aClass156_58.method3155(); local25 != null; local25 = (g) this.aClass156_58.method3150()) {
			local25.IA();
		}
		this.aClass156_58.method3161();
		this.ua();
		if (this.aBoolean514) {
			Static228.method2981(false, true);
			this.aBoolean514 = false;
		}
		this.method5572();
		Static1.method3();
		this.aBoolean512 = true;
	}

	@OriginalMember(owner = "client!w", name = "m", descriptor = "()Z")
	@Override
	public boolean method5528() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	@Override
	public Class35 method5550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new va(this, this.aG1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!w", name = "K", descriptor = "(IIIIII[BII)V")
	public native void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!w", name = "v", descriptor = "()Z")
	@Override
	public boolean method5552() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIZ)Lclient!o;")
	@Override
	public Class13 method5513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new v(this, this.aG1, arg0, arg1, arg2, arg3) : new ca(this, this.aG1, arg0, arg1, arg2, arg3);
	}
}
