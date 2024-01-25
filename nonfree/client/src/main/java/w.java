import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class w extends Class75 implements Interface13 {

	@OriginalMember(owner = "client!w", name = "q", descriptor = "Lclient!g;")
	private g aG1;

	@OriginalMember(owner = "client!w", name = "H", descriptor = "Lclient!b;")
	private b aB1;

	@OriginalMember(owner = "client!w", name = "K", descriptor = "I")
	private int anInt7422;

	@OriginalMember(owner = "client!w", name = "L", descriptor = "[Lclient!k;")
	private k[] aKArray1;

	@OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!w", name = "A", descriptor = "Z")
	private boolean aBoolean505 = false;

	@OriginalMember(owner = "client!w", name = "r", descriptor = "Lclient!nj;")
	private final Class181 aClass181_50 = new Class181();

	@OriginalMember(owner = "client!w", name = "G", descriptor = "I")
	private final int anInt7421 = 4096;

	@OriginalMember(owner = "client!w", name = "E", descriptor = "I")
	private final int anInt7420 = 4096;

	@OriginalMember(owner = "client!w", name = "I", descriptor = "Lclient!ru;")
	private final Class220 aClass220_44 = new Class220(4);

	@OriginalMember(owner = "client!w", name = "J", descriptor = "Z")
	private boolean aBoolean506 = false;

	@OriginalMember(owner = "client!w", name = "F", descriptor = "Lclient!c;")
	private Class6 aClass6_5;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;Lclient!pb;)V")
	public w(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) Class194 arg3) {
		super(arg0, arg2);
		try {
			if (!Static443.aBoolean504) {
				if (arg3 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("sw3d");
					Static443.aBoolean504 = Boolean.TRUE;
				} else {
					arg3.method4395(this.getClass());
					Static443.aBoolean504 = Boolean.TRUE;
				}
			}
			if (!Static443.aBoolean504) {
				throw new RuntimeException("");
			}
			this.W(super.anInterface7_8, 0, 0);
			Static202.method2831(true, false);
			this.aBoolean506 = true;
			this.aClass6_5 = new qa();
			this.SA(new qa());
			this.method5984(1);
			this.method5954(0);
			if (arg1 != null) {
				this.method6020(arg1);
				this.method5964(arg1);
			}
		} catch (@Pc(95) Throwable local95) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)V")
	public native void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "m", descriptor = "(S)Z")
	private boolean method6024(@OriginalArg(0) short arg0) {
		@Pc(2) Interface7 local2 = super.anInterface7_8;
		synchronized (super.anInterface7_8) {
			if (!super.anInterface7_8.method1168(arg0)) {
				return false;
			}
			@Pc(22) Class257 local22 = super.anInterface7_8.method1170(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(46) int[] local46;
			if (local22.aBoolean485 && local22.aBoolean492) {
				local46 = super.anInterface7_8.method1171(true, 0.7F, arg0, 128, 128);
			} else {
				local46 = super.anInterface7_8.method1172(0.7F, 128, arg0, 128);
			}
			this.J(arg0, local22.aByte97, local22.aByte93, local22.aBoolean492, local22.aBoolean485, local22.aBoolean489, local22.aByte92, local22.aByte95, local22.aByte96, local22.aShort101, local22.anInt7252, local22.aBoolean484, local22.aBoolean490, local46);
			return true;
		}
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method5979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.ma(arg0, arg1, arg2, arg4, arg5);
		this.ma(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.IA(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.IA(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "da", descriptor = "(FF)V")
	public native void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
	@Override
	public void method5954(@OriginalArg(0) int arg0) {
		this.aKArray1[arg0].method2920();
	}

	@OriginalMember(owner = "client!w", name = "sa", descriptor = "(IIII)[I")
	public native int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "z", descriptor = "()Z")
	@Override
	public boolean method6015() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(IIIIII)Lclient!mt;")
	@Override
	public Class141 method6009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(II)I")
	@Override
	public int method6023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5988(@OriginalArg(0) Canvas arg0) {
		if (this.aB1.aCanvas1 == arg0) {
			this.method5964(null);
		}
		@Pc(16) b local16 = (b) this.aClass220_44.method5099((long) arg0.hashCode());
		if (local16 != null) {
			local16.method6260();
			local16.method396();
		}
	}

	@OriginalMember(owner = "client!w", name = "WA", descriptor = "(I[I[F)V")
	private native void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!w", name = "P", descriptor = "(IIIIII)V")
	public native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!w", name = "A", descriptor = "(IIIIII)V")
	private native void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)Lclient!n;")
	@Override
	public Class2_Sub7 method5955(@OriginalArg(0) int arg0) {
		@Pc(5) g local5 = new g(this, arg0);
		this.aClass181_50.method3973(local5);
		return local5;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!kk;I)V")
	@Override
	public void method6004(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) Class28_Sub4[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method6029().va(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class28_Sub4 local15 = arg2[0];
		Static443.anIntArray605[5] = 0;
		this.method6029().va(this, arg0, arg1, Static443.anIntArray605, -1, arg3);
		local15.anInt3690 = Static443.anIntArray605[0];
		local15.anInt3687 = Static443.anIntArray605[1];
		local15.anInt3689 = Static443.anIntArray605[2];
		local15.anInt3691 = Static443.anIntArray605[3];
		local15.anInt3688 = Static443.anIntArray605[4];
		local15.aBoolean246 = Static443.anIntArray605[5] != 0;
	}

	@OriginalMember(owner = "client!w", name = "y", descriptor = "()Lclient!c;")
	@Override
	public Class6 method6014() {
		return new qa();
	}

	@OriginalMember(owner = "client!w", name = "B", descriptor = "()Z")
	@Override
	public boolean method6021() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!fc;IIII)Lclient!e;")
	@Override
	public Class63 method6016(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new xa(this, this.aG1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([IIIII)Lclient!o;")
	@Override
	public Class41 method6006(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6020(@OriginalArg(0) Canvas arg0) {
		@Pc(8) b local8 = (b) this.aClass220_44.method5099((long) arg0.hashCode());
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
		this.aClass220_44.method5104(local8, (long) arg0.hashCode());
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!w", name = "GA", descriptor = "(IIII)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!dm;)V")
	@Override
	public void method5957(@OriginalArg(0) Class56 arg0) {
		this.method6027(arg0, false);
		this.method6029().J(this, Static443.anIntArray608, Static443.anIntArray606, Static443.anIntArray607, Static443.aShortArray117, arg0.aClass96_1.method2140());
	}

	@OriginalMember(owner = "client!w", name = "s", descriptor = "()I")
	@Override
	public int method5994() {
		return 4;
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(II)V")
	public native void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!w", name = "pa", descriptor = "()I")
	public native int pa();

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.A(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "g", descriptor = "()Z")
	@Override
	public boolean method5969() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "IA", descriptor = "(IIIII)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!w", name = "h", descriptor = "()Z")
	@Override
	public boolean method5972() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!mt;)V")
	@Override
	public void method5958(@OriginalArg(0) Class141 arg0) {
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(Z)V")
	@Override
	public void method5971(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V")
	@Override
	public void method5966(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!w", name = "Y", descriptor = "()I")
	public native int Y();

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5970(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!w", name = "X", descriptor = "(S)Z")
	private boolean method6025(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class257 local9 = super.anInterface7_8.method1170(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.l(arg0, local9.aByte97, local9.aByte93, local9.aBoolean492, local9.aBoolean485, local9.aBoolean489, local9.aByte92, local9.aByte95, local9.aByte96, local9.aShort101, local9.anInt7252, local9.aBoolean484, local9.aBoolean490);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method6013(@OriginalArg(0) Class2_Sub7 arg0) {
		this.aG1 = (g) arg0;
		this.QA(arg0);
	}

	@OriginalMember(owner = "client!w", name = "t", descriptor = "()V")
	@Override
	public void method5998() {
	}

	@OriginalMember(owner = "client!w", name = "v", descriptor = "(III[I)V")
	public native void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!w", name = "c", descriptor = "()Z")
	@Override
	public boolean method5951() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "AA", descriptor = "()I")
	public native int AA();

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	@Override
	public void method5959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class102 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.NA(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!w", name = "m", descriptor = "()Lclient!c;")
	@Override
	public Class6 method5990() {
		return this.aClass6_5;
	}

	@OriginalMember(owner = "client!w", name = "T", descriptor = "()F")
	public native float T();

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([Lclient!e;Lclient!dm;Lclient!c;[Lclient!kk;I)V")
	@Override
	public void method5965(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) Class28_Sub4[] arg3, @OriginalArg(4) int arg4) {
		this.method6027(arg1, true);
		if (arg3 == null) {
			this.method6029().D(this, arg0, arg2, null, arg4, Static443.anIntArray608, Static443.anIntArray606, Static443.anIntArray607, Static443.aShortArray117, Static443.aByteArray90, arg1.aClass96_1.method2140(), Static443.anIntArray604);
		} else {
			@Pc(28) Class28_Sub4 local28 = arg3[0];
			Static443.anIntArray605[5] = 0;
			this.method6029().D(this, arg0, arg2, Static443.anIntArray605, arg4, Static443.anIntArray608, Static443.anIntArray606, Static443.anIntArray607, Static443.aShortArray117, Static443.aByteArray90, arg1.aClass96_1.method2140(), Static443.anIntArray604);
			local28.anInt3690 = Static443.anIntArray605[0];
			local28.anInt3687 = Static443.anIntArray605[1];
			local28.anInt3689 = Static443.anIntArray605[2];
			local28.anInt3691 = Static443.anIntArray605[3];
			local28.anInt3688 = Static443.anIntArray605[4];
			local28.aBoolean246 = Static443.anIntArray605[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) xa local98 = (xa) arg0[local88];
				local98.method6300(local86, arg2);
				if (local98.aClass191Array4 != null) {
					local86 += local98.aClass191Array4.length * 9;
				}
				if (local98.aClass254Array4 != null) {
					local86 += local98.aClass254Array4.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(Lclient!b;)V")
	private native void e(@OriginalArg(0) b arg0);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6029().q(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!w", name = "NA", descriptor = "(IIIIIILclient!ta;II)V")
	private native void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class102 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ok;Z)Lclient!o;")
	@Override
	public Class41 method5986(@OriginalArg(0) Class190 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray453;
		@Pc(5) byte[] local5 = arg0.aByteArray58;
		@Pc(8) int local8 = arg0.anInt5312;
		@Pc(11) int local11 = arg0.anInt5313;
		@Pc(32) Class41 local32;
		if (arg0.aByteArray57 == null) {
			local32 = new q(this, this.aG1, local2, local5, 0, arg0.anInt5312, arg0.anInt5312, arg0.anInt5313);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray57;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray453[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new v(this, this.aG1, local40, 0, arg0.anInt5312, arg0.anInt5312, arg0.anInt5313);
				} else {
					local32 = new ca(this, this.aG1, local40, 0, arg0.anInt5312, arg0.anInt5312, arg0.anInt5313);
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
		local32.ha(arg0.anInt5311, arg0.anInt5315, arg0.anInt5310, arg0.anInt5314);
		return local32;
	}

	@OriginalMember(owner = "client!w", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void J(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!w", name = "aa", descriptor = "()F")
	public native float aa();

	@OriginalMember(owner = "client!w", name = "ua", descriptor = "()V")
	private native void ua();

	@OriginalMember(owner = "client!w", name = "n", descriptor = "()V")
	public native void n();

	@OriginalMember(owner = "client!w", name = "R", descriptor = "()V")
	private void method6026() {
		System.gc();
		System.runFinalization();
		Static60.method967();
	}

	@OriginalMember(owner = "client!w", name = "x", descriptor = "()Z")
	@Override
	public boolean method6003() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "ya", descriptor = "(I)V")
	public native void ya(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!w", name = "ma", descriptor = "(IIIII)V")
	public native void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!w", name = "K", descriptor = "(IIIIII[BII)V")
	public native void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	@Override
	public Class102 method5982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new va(this, this.aG1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!dm;Z)V")
	private void method6027(@OriginalArg(0) Class56 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class28_Sub2_Sub1 local15 = (Class28_Sub2_Sub1) arg0.aClass96_1.method2137(); local15 != null; local15 = (Class28_Sub2_Sub1) arg0.aClass96_1.method2144()) {
			Static443.anIntArray608[local1++] = local15.anInt4530;
			Static443.anIntArray608[local1++] = local15.anInt4535;
			Static443.anIntArray608[local1++] = local15.anInt4538;
			Static443.anIntArray606[local3++] = local15.anInt4532;
			Static443.aShortArray117[local7++] = (short) local15.anInt4537;
			Static443.anIntArray607[local5++] = local15.anInt4540;
			if (arg1) {
				Static443.aByteArray90[local9++] = local15.aByte65;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "u", descriptor = "(I)V")
	private native void u(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!w", name = "MA", descriptor = "([I)V")
	public native void MA(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I[Lclient!as;)V")
	@Override
	public void method6018(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static443.anIntArray603[local1++] = arg1[local3].method4087();
			Static443.anIntArray603[local1++] = arg1[local3].method4081();
			Static443.anIntArray603[local1++] = arg1[local3].method4092();
			Static443.anIntArray603[local1++] = arg1[local3].method4089();
			Static443.aFloatArray33[local3] = arg1[local3].method4085();
			Static443.anIntArray603[local1++] = arg1[local3].method4084();
		}
		this.WA(arg0, Static443.anIntArray603, Static443.aFloatArray33);
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
	@Override
	public void method5968(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!w", name = "OA", descriptor = "()I")
	public native int OA();

	@OriginalMember(owner = "client!w", name = "SA", descriptor = "(Lclient!c;)V")
	public native void SA(@OriginalArg(0) Class6 arg0);

	@OriginalMember(owner = "client!w", name = "ZA", descriptor = "(IIIII)V")
	protected native void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!w", name = "b", descriptor = "()Z")
	@Override
	public boolean method5948() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6012(@OriginalArg(0) Canvas arg0) {
		@Pc(8) b local8 = (b) this.aClass220_44.method5099((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.U(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aB1.aCanvas1) {
			this.method5964(arg0);
		}
	}

	@OriginalMember(owner = "client!w", name = "va", descriptor = "()V")
	public native void va();

	@OriginalMember(owner = "client!w", name = "i", descriptor = "()V")
	@Override
	public void method5975() {
	}

	@OriginalMember(owner = "client!w", name = "w", descriptor = "()Z")
	@Override
	public boolean method6002() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "k", descriptor = "()V")
	@Override
	public void method5980() {
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5950() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!w", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void l(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!w", name = "s", descriptor = "(IIII)V")
	public native void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!e;Lclient!dm;Lclient!c;Lclient!kk;I)V")
	@Override
	public void method5960(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) Class28_Sub4 arg3) {
		this.method6027(arg1, true);
		if (arg3 == null) {
			this.method6029().FA(this, arg0, arg2, null, 0, Static443.anIntArray608, Static443.anIntArray606, Static443.anIntArray607, Static443.aShortArray117, Static443.aByteArray90, arg1.aClass96_1.method2140(), Static443.anIntArray604);
		} else {
			Static443.anIntArray605[5] = 0;
			this.method6029().FA(this, arg0, arg2, Static443.anIntArray605, 0, Static443.anIntArray608, Static443.anIntArray606, Static443.anIntArray607, Static443.aShortArray117, Static443.aByteArray90, arg1.aClass96_1.method2140(), Static443.anIntArray604);
			arg3.anInt3690 = Static443.anIntArray605[0];
			arg3.anInt3687 = Static443.anIntArray605[1];
			arg3.anInt3689 = Static443.anIntArray605[2];
			arg3.anInt3691 = Static443.anIntArray605[3];
			arg3.anInt3688 = Static443.anIntArray605[4];
			arg3.aBoolean246 = Static443.anIntArray605[5] != 0;
		}
		@Pc(83) xa local83 = (xa) arg0;
		local83.method6300(0, arg2);
	}

	@OriginalMember(owner = "client!w", name = "Q", descriptor = "(III)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!w", name = "JA", descriptor = "(F)V")
	public native void JA(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!w", name = "e", descriptor = "()Z")
	@Override
	public boolean method5961() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	@Override
	public void method5953(@OriginalArg(0) int arg0) {
		Static60.method967();
		this.u(arg0);
		for (@Pc(10) g local10 = (g) this.aClass181_50.method3972(); local10 != null; local10 = (g) this.aClass181_50.method3975()) {
			local10.T();
		}
	}

	@OriginalMember(owner = "client!w", name = "j", descriptor = "()Z")
	@Override
	public boolean method5978() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "qa", descriptor = "()Ljava/lang/Object;")
	private Object method6028() {
		return new pa(this);
	}

	@OriginalMember(owner = "client!w", name = "t", descriptor = "(I)V")
	public native void t(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!w", name = "VA", descriptor = "(IIIIII)Z")
	public native boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
	@Override
	public void method5949(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!w", name = "r", descriptor = "()I")
	public native int r();

	@OriginalMember(owner = "client!w", name = "C", descriptor = "()Lclient!k;")
	public k method6029() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7422; local1++) {
			if (this.aKArray1[local1].aRunnable2 == Thread.currentThread()) {
				return this.aKArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!w", name = "v", descriptor = "()V")
	@Override
	protected void method6000() {
		if (this.aBoolean505) {
			return;
		}
		this.aKArray1 = null;
		this.aB1 = null;
		this.aG1 = null;
		this.aClass6_5 = null;
		this.aClass220_44.method5105();
		for (@Pc(25) g local25 = (g) this.aClass181_50.method3972(); local25 != null; local25 = (g) this.aClass181_50.method3975()) {
			local25.IA();
		}
		this.aClass181_50.method3969();
		this.ua();
		if (this.aBoolean506) {
			Static177.method2584(true, false);
			this.aBoolean506 = false;
		}
		this.method6026();
		Static60.method969();
		this.aBoolean505 = true;
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "()Z")
	@Override
	public boolean method5952() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "ba", descriptor = "(IIII)V")
	public native void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "p", descriptor = "()V")
	public native void p();

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!aq;[Lclient!ok;Z)Lclient!la;")
	@Override
	public Class14 method5977(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class190[] arg1) {
		return new ra(this, this.aG1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)I")
	@Override
	public int method5987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!w", name = "q", descriptor = "()V")
	@Override
	public void method5992() {
	}

	@OriginalMember(owner = "client!w", name = "o", descriptor = "()Z")
	@Override
	public boolean method5991() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "ra", descriptor = "(ILclient!ta;II)V")
	public native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5956(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aB1 == null) {
			throw new IllegalStateException("off");
		}
		this.aB1.method397(arg0, arg1);
	}

	@OriginalMember(owner = "client!w", name = "f", descriptor = "()V")
	@Override
	public void method5963() {
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIZ)Lclient!o;")
	@Override
	public Class41 method5973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new v(this, this.aG1, arg0, arg1, arg2, arg3) : new ca(this, this.aG1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V")
	@Override
	public void method5984(@OriginalArg(0) int arg0) {
		this.anInt7422 = arg0;
		this.aKArray1 = new k[this.anInt7422];
		for (@Pc(9) int local9 = 0; local9 < this.anInt7422; local9++) {
			this.aKArray1[local9] = new k(this, this.anInt7420, this.anInt7421);
		}
	}

	@OriginalMember(owner = "client!w", name = "HA", descriptor = "(IIII)V")
	public native void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "A", descriptor = "()Z")
	@Override
	public boolean method6017() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method5989();
		if (this.nativeid != 0L) {
			Static60.method970(this);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5964(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aB1 = null;
			this.e(null);
		} else {
			@Pc(10) b local10 = (b) this.aClass220_44.method5099((long) arg0.hashCode());
			this.aB1 = local10;
			this.e(local10);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIF)Lclient!as;")
	@Override
	public Class2_Sub4 method6019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub4_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!mt;Lclient!mt;FLclient!mt;)Lclient!mt;")
	@Override
	public Class141 method6005(@OriginalArg(0) Class141 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class141 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!w", name = "l", descriptor = "()V")
	@Override
	public void method5983() {
		if (this.aB1 == null) {
			throw new IllegalStateException("off");
		}
		this.aB1.method395();
	}

	@OriginalMember(owner = "client!w", name = "QA", descriptor = "(Lclient!n;)V")
	private native void QA(@OriginalArg(0) Class2_Sub7 arg0);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "()Z")
	@Override
	public boolean method5947() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "B", descriptor = "(IFFFFF)V")
	public native void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
	@Override
	public void method5974(@OriginalArg(0) int arg0) {
		this.aKArray1[arg0].method2918();
	}

	@OriginalMember(owner = "client!w", name = "W", descriptor = "(Lclient!l;II)V")
	private native void W(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!w", name = "u", descriptor = "()Z")
	@Override
	public boolean method5999() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	@Override
	public Class22 method6010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new fa(this, this.aG1, arg0, arg1, arg2, arg3, 128, arg4, arg5);
	}
}
