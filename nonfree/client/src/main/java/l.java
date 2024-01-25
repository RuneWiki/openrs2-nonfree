import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class l extends Class44 implements Interface18 {

	@OriginalMember(owner = "client!l", name = "v", descriptor = "Lclient!m;")
	private m aM1;

	@OriginalMember(owner = "client!l", name = "E", descriptor = "Lclient!ta;")
	private ta aTa1;

	@OriginalMember(owner = "client!l", name = "F", descriptor = "Lclient!q;")
	private Class8 aClass8_4;

	@OriginalMember(owner = "client!l", name = "J", descriptor = "[Lclient!qa;")
	private qa[] aQaArray1;

	@OriginalMember(owner = "client!l", name = "L", descriptor = "I")
	public int anInt5880;

	@OriginalMember(owner = "client!l", name = "p", descriptor = "Z")
	private boolean aBoolean438 = false;

	@OriginalMember(owner = "client!l", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!l", name = "q", descriptor = "Lclient!oe;")
	private final Class244 aClass244_48 = new Class244();

	@OriginalMember(owner = "client!l", name = "G", descriptor = "I")
	private final int anInt5878 = 4096;

	@OriginalMember(owner = "client!l", name = "H", descriptor = "I")
	private final int anInt5879 = 4096;

	@OriginalMember(owner = "client!l", name = "D", descriptor = "Lclient!waa;")
	private final Class350 aClass350_22 = new Class350(4);

	@OriginalMember(owner = "client!l", name = "K", descriptor = "Z")
	private boolean aBoolean439 = false;

	@OriginalMember(owner = "client!l", name = "I", descriptor = "Lclient!q;")
	private Class8 aClass8_5;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;)V")
	public l(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface11 arg1) {
		super(arg1);
		try {
			if (!Static138.method2728("sw3d")) {
				throw new RuntimeException("");
			}
			Static302.method5184();
			this.OA(super.anInterface11_11, 0, 0);
			Static512.method7483(false, true);
			this.aBoolean439 = true;
			this.aClass8_5 = new ra();
			this.method4999(new ra());
			this.method4991(1);
			this.method5038(0);
			if (arg0 != null) {
				this.method5012(arg0);
				this.method4966(arg0);
			}
		} catch (@Pc(78) Throwable local78) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(I)Lclient!e;")
	@Override
	public Class4_Sub8 method5027(@OriginalArg(0) int arg0) {
		@Pc(5) m local5 = new m(this, arg0);
		this.aClass244_48.method5960(local5);
		return local5;
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "()Z")
	@Override
	public boolean method4976() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method4995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class6 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.Q(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class6 method4997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new za(this, this.aM1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "()I")
	public native int b();

	@OriginalMember(owner = "client!l", name = "d", descriptor = "()Z")
	@Override
	public boolean method4975() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!pga;Z)Lclient!f;")
	@Override
	public Class78 method5018(@OriginalArg(0) Class261 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray389;
		@Pc(5) byte[] local5 = arg0.aByteArray90;
		@Pc(8) int local8 = arg0.anInt7655;
		@Pc(11) int local11 = arg0.anInt7660;
		@Pc(32) Class78 local32;
		if (arg1 && arg0.aByteArray89 == null) {
			local32 = new w(this, this.aM1, local2, local5, 0, arg0.anInt7655, arg0.anInt7655, arg0.anInt7660);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray89;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray389[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new t(this, this.aM1, local40, 0, arg0.anInt7655, arg0.anInt7655, arg0.anInt7660);
				} else {
					local32 = new va(this, this.aM1, local40, 0, arg0.anInt7655, arg0.anInt7655, arg0.anInt7660);
				}
			} else {
				for (@Pc(47) int local47 = 0; local47 < local11; local47++) {
					local52 = local47 * local8;
					for (local54 = 0; local54 < local8; local54++) {
						local40[local52 + local54] = local2[local5[local52 + local54] & 0xFF] | local43[local52 + local54] << 24;
					}
				}
				local32 = new t(this, this.aM1, local40, 0, local8, local8, local11);
			}
		}
		local32.Q(arg0.anInt7657, arg0.anInt7656, arg0.anInt7658, arg0.anInt7659);
		return local32;
	}

	@OriginalMember(owner = "client!l", name = "O", descriptor = "(IIIIII)Z")
	public native boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "f", descriptor = "()Z")
	@Override
	public boolean method4977() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "I", descriptor = "(I[I[F)V")
	private native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class83 method4967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new s(this, this.aM1, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V")
	@Override
	public void method5038(@OriginalArg(0) int arg0) {
		this.aQaArray1[arg0].method6503();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!so;I)V")
	@Override
	public void method5026(@OriginalArg(0) Class305 arg0, @OriginalArg(1) int arg1) {
		this.method5046(arg0);
		this.method5047().HA(this, Static287.anIntArray287, Static287.anIntArray285, Static287.anIntArray286, Static287.aShortArray69, arg0.aClass224_1.method5406());
	}

	@OriginalMember(owner = "client!l", name = "o", descriptor = "()Z")
	@Override
	public boolean method5008() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "w", descriptor = "()Z")
	@Override
	public boolean method5028() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "A", descriptor = "()Z")
	@Override
	public boolean method5037() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "l", descriptor = "()V")
	@Override
	public void method5003() {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!so;)V")
	@Override
	public void method5017(@OriginalArg(0) Class305 arg0) {
		this.method5046(arg0);
		this.method5047().HA(this, Static287.anIntArray287, Static287.anIntArray285, Static287.anIntArray286, Static287.aShortArray69, arg0.aClass224_1.method5406());
	}

	@OriginalMember(owner = "client!l", name = "CA", descriptor = "(IIII)V")
	public native void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
	@Override
	public void method5031(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class78 method4964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new t(this, this.aM1, arg0, arg1, arg2, arg3) : new va(this, this.aM1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "()I")
	@Override
	public int method4972() {
		return 4;
	}

	@OriginalMember(owner = "client!l", name = "k", descriptor = "()Z")
	@Override
	public boolean method4993() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "WA", descriptor = "()V")
	private void method5043() {
		System.gc();
		System.runFinalization();
		Static302.method5185();
	}

	@OriginalMember(owner = "client!l", name = "OA", descriptor = "(Lclient!fa;II)V")
	private native void OA(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!l", name = "VA", descriptor = "(IFFFFF)V")
	public native void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!l", name = "r", descriptor = "()Z")
	@Override
	public boolean method5019() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "s", descriptor = "()Lclient!q;")
	@Override
	public Class8 method5020() {
		return this.aClass8_4;
	}

	@OriginalMember(owner = "client!l", name = "ra", descriptor = "(F)V")
	public native void ra(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4986(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aTa1 == null) {
			throw new IllegalStateException("off");
		}
		this.aTa1.method7329(arg0, arg1);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method5024(@OriginalArg(0) Class78 arg0) {
		if (arg0 instanceof va) {
			this.q((va) arg0);
		} else if (arg0 instanceof t) {
			this.ma((t) arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!l", name = "A", descriptor = "(S)Z")
	private boolean method5044(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class14 local9 = super.anInterface11_11.method7405(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.Z(arg0, local9.aByte7, local9.aByte8, local9.aBoolean10, local9.aBoolean11, local9.aBoolean14, local9.aByte4, local9.aByte6, local9.aByte9, local9.aShort12, local9.anInt239, local9.aBoolean8, local9.aBoolean7);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIF)Lclient!ul;")
	@Override
	public Class4_Sub24 method4979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class4_Sub24_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "R", descriptor = "()V")
	private native void R();

	@OriginalMember(owner = "client!l", name = "FA", descriptor = "(ILclient!ua;II)V")
	public native void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!l", name = "t", descriptor = "()Z")
	@Override
	public boolean method5022() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "J", descriptor = "(IIIIII)V")
	public native void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "JA", descriptor = "()V")
	public native void JA();

	@OriginalMember(owner = "client!l", name = "B", descriptor = "()V")
	@Override
	public void method5039() {
		this.method4966(this.aTa1.aCanvas14);
	}

	@OriginalMember(owner = "client!l", name = "oa", descriptor = "([I)V")
	public native void oa(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V")
	@Override
	public void method4991(@OriginalArg(0) int arg0) {
		this.anInt5880 = arg0;
		this.aQaArray1 = new qa[this.anInt5880];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5880; local9++) {
			this.aQaArray1[local9] = new qa(this, this.anInt5878, this.anInt5879);
		}
	}

	@OriginalMember(owner = "client!l", name = "W", descriptor = "(S)Z")
	private boolean method5045(@OriginalArg(0) short arg0) {
		@Pc(2) Interface11 local2 = super.anInterface11_11;
		synchronized (super.anInterface11_11) {
			if (!super.anInterface11_11.method7407(arg0)) {
				return false;
			}
			@Pc(22) Class14 local22 = super.anInterface11_11.method7405(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(43) int[] local43;
			if (local22.aBoolean15) {
				local43 = super.anInterface11_11.method7406(128, arg0, 128, 0.7F);
			} else {
				local43 = super.anInterface11_11.method7408(128, true, 128, arg0, 0.7F);
			}
			this.xa(arg0, local22.aByte7, local22.aByte8, local22.aBoolean10, local22.aBoolean11, local22.aBoolean14, local22.aByte4, local22.aByte6, local22.aByte9, local22.aShort12, local22.anInt239, local22.aBoolean8, local22.aBoolean7, local43);
			return true;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4992(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4994(@OriginalArg(0) Canvas arg0) {
		if (this.aTa1.aCanvas14 == arg0) {
			this.method4966(null);
		}
		@Pc(16) ta local16 = (ta) this.aClass350_22.method8207((long) arg0.hashCode());
		if (local16 != null) {
			local16.method8379();
			local16.method7328();
		}
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5012(@OriginalArg(0) Canvas arg0) {
		@Pc(8) ta local8 = (ta) this.aClass350_22.method8207((long) arg0.hashCode());
		if (local8 != null) {
			return;
		}
		try {
			@Pc(13) Class local13 = Class.forName("java.awt.Canvas");
			@Pc(23) Method local23 = local13.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local23.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(35) Exception local35) {
		}
		local8 = new ta(this, arg0);
		this.aClass350_22.method8199((long) arg0.hashCode(), local8);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!gda;[Lclient!pga;Z)Lclient!la;")
	@Override
	public Class58 method4983(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Class261[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt7655;
			local7[local11] = arg1[local11].anInt7660;
			if (arg1[local11].aByteArray89 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new c(this, this.aM1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method5001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.w(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "BA", descriptor = "()I")
	public native int BA();

	@OriginalMember(owner = "client!l", name = "YA", descriptor = "(IIII)V")
	public native void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method4999(@OriginalArg(0) Class8 arg0) {
		this.aClass8_4 = arg0;
		this.NA(arg0);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	@Override
	public void method4973(@OriginalArg(0) int arg0) {
		Static302.method5185();
		this.qa(arg0);
		for (@Pc(10) m local10 = (m) this.aClass244_48.method5963(); local10 != null; local10 = (m) this.aClass244_48.method5965()) {
			local10.Z();
		}
	}

	@OriginalMember(owner = "client!l", name = "v", descriptor = "()[I")
	public native int[] v();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method4988(@OriginalArg(0) Class4_Sub8 arg0) {
		this.aM1 = (m) arg0;
		this.EA(arg0);
	}

	@OriginalMember(owner = "client!l", name = "NA", descriptor = "(Lclient!q;)V")
	private native void NA(@OriginalArg(0) Class8 arg0);

	@OriginalMember(owner = "client!l", name = "xa", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void xa(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!l", name = "ia", descriptor = "(Lclient!ta;)V")
	private native void ia(@OriginalArg(0) ta arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "()Z")
	@Override
	public boolean method4965() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "Z", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void Z(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(II)I")
	@Override
	public int method5023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!l", name = "qa", descriptor = "(I)V")
	private native void qa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "pa", descriptor = "(III)V")
	public native void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!kk;IIII)Lclient!da;")
	@Override
	public Class57 method5016(@OriginalArg(0) Class191 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new v(this, this.aM1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4968(@OriginalArg(0) Canvas arg0) {
		@Pc(8) ta local8 = (ta) this.aClass350_22.method8207((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.AA(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aTa1.aCanvas14) {
			this.method4966(arg0);
		}
	}

	@OriginalMember(owner = "client!l", name = "Q", descriptor = "(IIIIIILclient!ua;II)V")
	private native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class6 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!caa;)V")
	@Override
	public void method4982(@OriginalArg(0) Class36 arg0) {
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method4996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.XA(arg0, arg1, arg2, arg4, arg5);
		this.XA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.m(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.m(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "ma", descriptor = "(Lclient!t;)V")
	private native void ma(@OriginalArg(0) t arg0);

	@OriginalMember(owner = "client!l", name = "q", descriptor = "(Lclient!va;)V")
	private native void q(@OriginalArg(0) va arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!so;Z)V")
	private void method5046(@OriginalArg(0) Class305 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class1_Sub1_Sub1 local15 = (Class1_Sub1_Sub1) arg0.aClass224_1.method5402(); local15 != null; local15 = (Class1_Sub1_Sub1) arg0.aClass224_1.method5403()) {
			Static287.anIntArray287[local1++] = local15.anInt72;
			Static287.anIntArray287[local1++] = local15.anInt71;
			Static287.anIntArray287[local1++] = local15.anInt73;
			Static287.anIntArray285[local3++] = local15.anInt69;
			Static287.aShortArray69[local7++] = (short) local15.anInt74;
			Static287.anIntArray286[local5++] = local15.anInt70;
		}
	}

	@OriginalMember(owner = "client!l", name = "D", descriptor = "()Lclient!qa;")
	public qa method5047() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5880; local1++) {
			if (this.aQaArray1[local1].aRunnable1 == Thread.currentThread()) {
				return this.aQaArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!l", name = "j", descriptor = "()V")
	@Override
	public void method4990() {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I[Lclient!ul;)V")
	@Override
	public void method5000(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub24[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static287.anIntArray288[local1++] = arg1[local3].method7145();
			Static287.anIntArray288[local1++] = arg1[local3].method7147();
			Static287.anIntArray288[local1++] = arg1[local3].method7142();
			Static287.anIntArray288[local1++] = arg1[local3].method7151();
			Static287.aFloatArray47[local3] = arg1[local3].method7144();
			Static287.anIntArray288[local1++] = arg1[local3].method7149();
		}
		this.I(arg0, Static287.anIntArray288, Static287.aFloatArray47);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4998() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!l", name = "x", descriptor = "()V")
	@Override
	protected void method5029() {
		if (this.aBoolean438) {
			return;
		}
		this.aQaArray1 = null;
		this.aTa1 = null;
		this.aM1 = null;
		this.aClass8_5 = null;
		this.aClass350_22.method8203();
		for (@Pc(25) m local25 = (m) this.aClass244_48.method5963(); local25 != null; local25 = (m) this.aClass244_48.method5965()) {
			local25.D();
		}
		this.aClass244_48.method5962();
		this.R();
		if (this.aBoolean439) {
			Static177.method7477(false, true);
			this.aBoolean439 = false;
		}
		this.method5043();
		Static302.method5183();
		this.aBoolean438 = true;
	}

	@OriginalMember(owner = "client!l", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!l", name = "fa", descriptor = "()Ljava/lang/Object;")
	private Object method5048() {
		return new h(this);
	}

	@OriginalMember(owner = "client!l", name = "T", descriptor = "()I")
	public native int T();

	@OriginalMember(owner = "client!l", name = "XA", descriptor = "(IIIII)V")
	public native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "L", descriptor = "()V")
	public native void L();

	@OriginalMember(owner = "client!l", name = "da", descriptor = "(IIII)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "q", descriptor = "()V")
	@Override
	public void method5013() throws Exception_Sub1 {
		if (this.aTa1 == null) {
			throw new IllegalStateException("off");
		}
		this.aTa1.method7327();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4966(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aTa1 = null;
			this.ia(null);
		} else {
			@Pc(10) ta local10 = (ta) this.aClass350_22.method8207((long) arg0.hashCode());
			this.aTa1 = local10;
			this.ia(local10);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
	@Override
	public void method5036(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V")
	@Override
	public void method5042(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!l", name = "GA", descriptor = "(II)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!l", name = "EA", descriptor = "(Lclient!e;)V")
	private native void EA(@OriginalArg(0) Class4_Sub8 arg0);

	@OriginalMember(owner = "client!l", name = "i", descriptor = "()Z")
	@Override
	public boolean method4989() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "V", descriptor = "(IIII)V")
	public native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "la", descriptor = "(IIII)V")
	public native void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "g", descriptor = "()V")
	@Override
	public void method4984() {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)Lclient!caa;")
	@Override
	public Class36 method4970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class78 method5035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new t(this, this.aM1, arg0, arg1);
	}

	@OriginalMember(owner = "client!l", name = "u", descriptor = "()Lclient!q;")
	@Override
	public Class8 method5025() {
		return new ra();
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(II)I")
	@Override
	public int method5010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
	@Override
	public void method4980(@OriginalArg(0) int arg0) {
		this.aQaArray1[arg0].method6504();
	}

	@OriginalMember(owner = "client!l", name = "w", descriptor = "(IIIIII)V")
	private native void w(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "ZA", descriptor = "(Z)V")
	public native void ZA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!l", name = "m", descriptor = "(IIIII)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class78 method4969(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new t(this, this.aM1, arg0, 0, arg1, arg2, arg3) : new va(this, this.aM1, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new t(this, this.aM1, arg0, 0, arg1, arg2, arg3) : new va(this, this.aM1, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!l", name = "va", descriptor = "(I)V")
	public native void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!caa;Lclient!caa;FLclient!caa;)Lclient!caa;")
	@Override
	public Class36 method5005(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class36 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!l", name = "h", descriptor = "()Lclient!ik;")
	@Override
	public Class155 method4985() {
		return new Class155(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!l", name = "n", descriptor = "()Lclient!q;")
	@Override
	public Class8 method5007() {
		return this.aClass8_5;
	}

	@OriginalMember(owner = "client!l", name = "C", descriptor = "()Z")
	@Override
	public boolean method5041() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "z", descriptor = "()Z")
	@Override
	public boolean method5034() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "m", descriptor = "()Z")
	@Override
	public boolean method5004() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([I)V")
	@Override
	public void method5011(@OriginalArg(0) int[] arg0) {
		@Pc(4) Dimension local4 = this.aTa1.aCanvas14.getSize();
		arg0[0] = local4.width;
		arg0[1] = local4.height;
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(IIIII)V")
	protected native void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "p", descriptor = "()V")
	@Override
	public void method5009() {
	}

	@OriginalMember(owner = "client!l", name = "MA", descriptor = "(III[I)V")
	public native void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method5033();
		if (this.nativeid != 0L) {
			Static302.method5182(this);
		}
	}

	@OriginalMember(owner = "client!l", name = "ja", descriptor = "(I)V")
	public native void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "IA", descriptor = "(IIIIII[BII)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!l", name = "h", descriptor = "(IIII)[I")
	public native int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5047().G(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!l", name = "DA", descriptor = "()I")
	public native int DA();

	@OriginalMember(owner = "client!l", name = "y", descriptor = "()V")
	@Override
	public void method5032() {
	}

	@OriginalMember(owner = "client!l", name = "AA", descriptor = "(III[I)V")
	public native void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);
}
