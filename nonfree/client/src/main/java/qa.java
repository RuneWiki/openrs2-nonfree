import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class qa extends Class49 implements Interface2 {

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "Lclient!na;")
	private na aNa2;

	@OriginalMember(owner = "client!qa", name = "D", descriptor = "Lclient!za;")
	private za aZa1;

	@OriginalMember(owner = "client!qa", name = "I", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!qa", name = "K", descriptor = "I")
	private int anInt5558;

	@OriginalMember(owner = "client!qa", name = "N", descriptor = "[Lclient!n;")
	private n[] aNArray1;

	@OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "Lclient!ar;")
	private final Class14 aClass14_40 = new Class14();

	@OriginalMember(owner = "client!qa", name = "F", descriptor = "I")
	private final int anInt5557 = 4096;

	@OriginalMember(owner = "client!qa", name = "E", descriptor = "I")
	private final int anInt5556 = 4096;

	@OriginalMember(owner = "client!qa", name = "J", descriptor = "Lclient!mn;")
	private final Class163 aClass163_36 = new Class163(4);

	@OriginalMember(owner = "client!qa", name = "L", descriptor = "Z")
	private boolean aBoolean394 = false;

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "Lclient!c;")
	private final Class35 aClass35_7;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!ga;Lclient!dr;)V")
	public qa(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) Class59 arg3) {
		super(arg0, arg2);
		try {
			if (!Static315.aBoolean393) {
				if (arg3 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("sw3d");
					Static315.aBoolean393 = Boolean.TRUE;
				} else {
					arg3.method1378(this.getClass());
					Static315.aBoolean393 = Boolean.TRUE;
				}
			}
			if (!Static315.aBoolean393) {
				throw new RuntimeException("");
			}
			this.K(super.anInterface4_6, 0, 0);
			Static336.method4686(true, false);
			this.aBoolean394 = true;
			if (arg1 != null) {
				this.method4438(arg1);
				this.method4436(arg1);
			}
			this.aClass35_7 = new i();
			this.ea(new i());
			this.method4424(1);
			this.method4407(0);
		} catch (@Pc(92) Throwable local92) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
	@Override
	public void method4481(@OriginalArg(0) int arg0) {
		this.aNArray1[arg0].method3861();
	}

	@OriginalMember(owner = "client!qa", name = "ca", descriptor = "(ILclient!ma;II)V")
	public native void ca(@OriginalArg(0) int arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "W", descriptor = "()F")
	public native float W();

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "()V")
	@Override
	public void method4475() {
	}

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z")
	@Override
	public boolean method4458() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "RA", descriptor = "(IIIIII)V")
	private native void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "AA", descriptor = "(IIII)V")
	public native void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
	@Override
	public int method4451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "()V")
	@Override
	protected void method4420() {
		for (@Pc(5) na local5 = (na) this.aClass14_40.method309(); local5 != null; local5 = (na) this.aClass14_40.method311()) {
			local5.H();
		}
		this.aClass14_40.method305();
		this.FA();
		if (this.aBoolean394) {
			Static313.method4399(false, true);
			this.aBoolean394 = false;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4419(@OriginalArg(0) Canvas arg0) {
		@Pc(8) za local8 = (za) this.aClass163_36.method3769((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.H(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aCanvas6) {
			this.method4436(arg0);
		}
	}

	@OriginalMember(owner = "client!qa", name = "xa", descriptor = "()F")
	public native float xa();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lclient!jd;")
	@Override
	public Class2_Sub20 method4478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub20_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
	@Override
	public int method4429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!qa", name = "MA", descriptor = "(I)V")
	public native void MA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4427(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
	@Override
	public void method4446(@OriginalArg(0) int arg0) {
		Static409.method5379();
		this.ma(arg0);
		for (@Pc(10) na local10 = (na) this.aClass14_40.method309(); local10 != null; local10 = (na) this.aClass14_40.method311()) {
			local10.a();
		}
	}

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "()Z")
	@Override
	public boolean method4455() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	@Override
	public void method4407(@OriginalArg(0) int arg0) {
		this.aNArray1[arg0].method3860();
	}

	@OriginalMember(owner = "client!qa", name = "UA", descriptor = "(III)V")
	public native void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!mh;Lclient!mh;FLclient!mh;)Lclient!mh;")
	@Override
	public Class155 method4443(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class155 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z")
	@Override
	public boolean method4442() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
	@Override
	public void method4423(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "()Z")
	@Override
	public boolean method4466() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "()V")
	@Override
	public void method4477() {
	}

	@OriginalMember(owner = "client!qa", name = "H", descriptor = "(IIII)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "()Z")
	@Override
	public boolean method4450() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!dq;[Lclient!ft;Z)Lclient!la;")
	@Override
	public Class116 method4479(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class85[] arg1) {
		return new s(this, this.aNa2, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!qa", name = "ma", descriptor = "(I)V")
	private native void ma(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void q(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!t;Lclient!pn;Lclient!c;Lclient!ii;I)V")
	@Override
	public void method4468(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) Class8_Sub4 arg3) {
		this.method4484(arg1, true);
		if (arg3 == null) {
			this.method4488().ba(this, arg0, arg2, null, 0, Static315.anIntArray458, Static315.anIntArray457, Static315.anIntArray454, Static315.aShortArray93, Static315.aByteArray106, arg1.aClass191_1.method4329(), Static315.anIntArray456);
		} else {
			Static315.anIntArray455[5] = 0;
			this.method4488().ba(this, arg0, arg2, Static315.anIntArray455, 0, Static315.anIntArray458, Static315.anIntArray457, Static315.anIntArray454, Static315.aShortArray93, Static315.aByteArray106, arg1.aClass191_1.method4329(), Static315.anIntArray456);
			arg3.anInt3263 = Static315.anIntArray455[0];
			arg3.anInt3264 = Static315.anIntArray455[1];
			arg3.anInt3260 = Static315.anIntArray455[2];
			arg3.anInt3262 = Static315.anIntArray455[3];
			arg3.anInt3261 = Static315.anIntArray455[4];
			arg3.aBoolean251 = Static315.anIntArray455[5] != 0;
		}
		@Pc(83) da local83 = (da) arg0;
		local83.method1141(0, arg2);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4488().va(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!qa", name = "ZA", descriptor = "()I")
	public native int ZA();

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "()Z")
	@Override
	public boolean method4425() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.EA();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lclient!ma;")
	@Override
	public Class73 method4430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new sa(this, this.aNa2, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qa", name = "fa", descriptor = "(IIII)V")
	public native void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
	@Override
	public void method4454(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!pn;Z)V")
	private void method4484(@OriginalArg(0) Class194 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class8_Sub2_Sub1 local15 = (Class8_Sub2_Sub1) arg0.aClass191_1.method4327(); local15 != null; local15 = (Class8_Sub2_Sub1) arg0.aClass191_1.method4332()) {
			Static315.anIntArray458[local1++] = local15.anInt7352;
			Static315.anIntArray458[local1++] = local15.anInt7354;
			Static315.anIntArray458[local1++] = local15.anInt7356;
			Static315.anIntArray457[local3++] = local15.anInt7358;
			Static315.aShortArray93[local7++] = (short) local15.anInt7357;
			Static315.anIntArray454[local5++] = local15.anInt7351;
			if (arg1) {
				Static315.aByteArray106[local9++] = local15.aByte100;
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "aa", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!qa", name = "T", descriptor = "(IFFFFF)V")
	public native void T(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "PA", descriptor = "(Lclient!za;)V")
	private native void PA(@OriginalArg(0) za arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public void method4453(@OriginalArg(0) Class2_Sub17 arg0) {
		this.aNa2 = (na) arg0;
		this.I(arg0);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4482() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method4449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.RA(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!qa", name = "da", descriptor = "([I)V")
	public native void da(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!qa", name = "YA", descriptor = "()I")
	public native int YA();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
	@Override
	public void method4476(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!pn;)V")
	@Override
	public void method4471(@OriginalArg(0) Class194 arg0) {
		this.method4484(arg0, false);
		this.method4488().G(this, Static315.anIntArray458, Static315.anIntArray457, Static315.anIntArray454, Static315.aShortArray93, arg0.aClass191_1.method4329());
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILclient!ma;II)V")
	@Override
	public void method4472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class73 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.A(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "()Z")
	@Override
	public boolean method4439() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lclient!jd;)V")
	@Override
	public void method4428(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static315.anIntArray459[local1++] = arg1[local3].method5740();
			Static315.anIntArray459[local1++] = arg1[local3].method5739();
			Static315.anIntArray459[local1++] = arg1[local3].method5741();
			Static315.anIntArray459[local1++] = arg1[local3].method5743();
			Static315.aFloatArray41[local3] = arg1[local3].method5737();
			Static315.anIntArray459[local1++] = arg1[local3].method5735();
		}
		this.za(arg0, Static315.anIntArray459, Static315.aFloatArray41);
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "()V")
	@Override
	public void method4417() {
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4438(@OriginalArg(0) Canvas arg0) {
		@Pc(8) za local8 = (za) this.aClass163_36.method3769((long) arg0.hashCode());
		if (local8 != null) {
			return;
		}
		try {
			@Pc(13) Class local13 = Class.forName("java.awt.Canvas");
			@Pc(23) Method local23 = local13.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local23.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(35) Exception local35) {
		}
		local8 = new za(this, arg0);
		this.aClass163_36.method3764((long) arg0.hashCode(), local8);
	}

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "(IIIIIILclient!ma;II)V")
	private native void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class73 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Lclient!l;")
	@Override
	public Class17 method4441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new ra(this, this.aNa2, arg0, arg1, arg2, arg3) : new ia(this, this.aNa2, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!t;Lclient!pn;Lclient!c;[Lclient!ii;I)V")
	@Override
	public void method4421(@OriginalArg(0) Class91[] arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) Class8_Sub4[] arg3, @OriginalArg(4) int arg4) {
		this.method4484(arg1, true);
		if (arg3 == null) {
			this.method4488().Y(this, arg0, arg2, null, arg4, Static315.anIntArray458, Static315.anIntArray457, Static315.anIntArray454, Static315.aShortArray93, Static315.aByteArray106, arg1.aClass191_1.method4329(), Static315.anIntArray456);
		} else {
			@Pc(28) Class8_Sub4 local28 = arg3[0];
			Static315.anIntArray455[5] = 0;
			this.method4488().Y(this, arg0, arg2, Static315.anIntArray455, arg4, Static315.anIntArray458, Static315.anIntArray457, Static315.anIntArray454, Static315.aShortArray93, Static315.aByteArray106, arg1.aClass191_1.method4329(), Static315.anIntArray456);
			local28.anInt3263 = Static315.anIntArray455[0];
			local28.anInt3264 = Static315.anIntArray455[1];
			local28.anInt3260 = Static315.anIntArray455[2];
			local28.anInt3262 = Static315.anIntArray455[3];
			local28.anInt3261 = Static315.anIntArray455[4];
			local28.aBoolean251 = Static315.anIntArray455[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) da local98 = (da) arg0[local88];
				local98.method1141(local86, arg2);
				if (local98.aClass200Array1 != null) {
					local86 += local98.aClass200Array1.length * 9;
				}
				if (local98.aClass189Array1 != null) {
					local86 += local98.aClass189Array1.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!t;Lclient!c;[Lclient!ii;I)V")
	@Override
	public void method4409(@OriginalArg(0) Class91[] arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) Class8_Sub4[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method4488().TA(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class8_Sub4 local15 = arg2[0];
		Static315.anIntArray455[5] = 0;
		this.method4488().TA(this, arg0, arg1, Static315.anIntArray455, -1, arg3);
		local15.anInt3263 = Static315.anIntArray455[0];
		local15.anInt3264 = Static315.anIntArray455[1];
		local15.anInt3260 = Static315.anIntArray455[2];
		local15.anInt3262 = Static315.anIntArray455[3];
		local15.anInt3261 = Static315.anIntArray455[4];
		local15.aBoolean251 = Static315.anIntArray455[5] != 0;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()I")
	public native int a();

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(FF)V")
	public native void g(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	@Override
	public void method4424(@OriginalArg(0) int arg0) {
		this.anInt5558 = arg0;
		this.aNArray1 = new n[this.anInt5558];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5558; local9++) {
			this.aNArray1[local9] = new n(this, this.anInt5557, this.anInt5556);
		}
	}

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "()Z")
	@Override
	public boolean method4457() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "OA", descriptor = "(IIII)V")
	public native void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "(F)V")
	public native void B(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "O", descriptor = "(IIIIII)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "JA", descriptor = "(IIIIII)Z")
	public native boolean JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "X", descriptor = "(III[I)V")
	public native void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "TA", descriptor = "(IIIII)V")
	public native void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "sa", descriptor = "(S)Z")
	private boolean method4485(@OriginalArg(0) short arg0) {
		@Pc(2) Interface4 local2 = super.anInterface4_6;
		synchronized (super.anInterface4_6) {
			if (!super.anInterface4_6.method3792(arg0)) {
				return false;
			}
			@Pc(22) Class140 local22 = super.anInterface4_6.method3794(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(46) int[] local46;
			if (local22.aBoolean293 && local22.aBoolean290) {
				local46 = super.anInterface4_6.method3790(128, arg0, 0.7F, true, 128);
			} else {
				local46 = super.anInterface4_6.method3791(128, arg0, 0.7F, 128);
			}
			this.q(arg0, local22.aByte59, local22.aByte65, local22.aBoolean290, local22.aBoolean293, local22.aBoolean289, local22.aByte60, local22.aByte63, local22.aByte62, local22.aShort44, local22.anInt3820, local22.aBoolean294, local22.aBoolean291, local46);
			return true;
		}
	}

	@OriginalMember(owner = "client!qa", name = "R", descriptor = "(S)Z")
	private boolean method4486(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class140 local9 = super.anInterface4_6.method3794(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.aa(arg0, local9.aByte59, local9.aByte65, local9.aBoolean290, local9.aBoolean293, local9.aBoolean289, local9.aByte60, local9.aByte63, local9.aByte62, local9.aShort44, local9.anInt3820, local9.aBoolean294, local9.aBoolean291);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "()Lclient!c;")
	@Override
	public Class35 method4467() {
		return new i();
	}

	@OriginalMember(owner = "client!qa", name = "ea", descriptor = "(Lclient!c;)V")
	public native void ea(@OriginalArg(0) Class35 arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4411(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(4) int local4;
		@Pc(9) Rectangle local9;
		while (local1 < 9) {
			try {
				for (local4 = 0; local4 < arg1; local4++) {
					local9 = arg0[local4];
					if (local9.width > 0 && local9.height > 0) {
						synchronized (this.aCanvas6.getTreeLock()) {
							this.aZa1.d(local9.x, local9.y, local9.width, local9.height);
						}
					}
				}
				return;
			} catch (@Pc(44) Exception local44) {
				Static81.method1477(200L);
				local1++;
			}
		}
		for (local4 = 0; local4 < arg1; local4++) {
			local9 = arg0[local4];
			if (local9.width > 0 && local9.height > 0) {
				synchronized (this.aCanvas6.getTreeLock()) {
					this.aZa1.d(local9.x, local9.y, local9.width, local9.height);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "()I")
	@Override
	public int method4433() {
		return 4;
	}

	@OriginalMember(owner = "client!qa", name = "GA", descriptor = "(IIII)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "IA", descriptor = "()I")
	public native int IA();

	@OriginalMember(owner = "client!qa", name = "ia", descriptor = "(II)V")
	public native void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "()V")
	@Override
	public void method4483() {
	}

	@OriginalMember(owner = "client!qa", name = "I", descriptor = "(Lclient!u;)V")
	private native void I(@OriginalArg(0) Class2_Sub17 arg0);

	@OriginalMember(owner = "client!qa", name = "SA", descriptor = "()Ljava/lang/Object;")
	private Object method4487() {
		return new p();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Lclient!l;")
	@Override
	public Class17 method4422(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new ra(this, this.aNa2, arg0, 0, arg1, arg2, arg3) : new ia(this, this.aNa2, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new ra(this, this.aNa2, arg0, 0, arg1, arg2, arg3) : new ia(this, this.aNa2, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qa", name = "D", descriptor = "()Lclient!n;")
	public n method4488() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5558; local1++) {
			if (this.aNArray1[local1].aRunnable2 == Thread.currentThread()) {
				return this.aNArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lclient!ta;")
	@Override
	public Class64 method4462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new ha(this, this.aNa2, arg0, arg1, arg2, arg3, 128, arg4, arg5);
	}

	@OriginalMember(owner = "client!qa", name = "ha", descriptor = "()V")
	private void method4489() {
		System.gc();
		System.runFinalization();
		Static409.method5379();
	}

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "()Z")
	@Override
	public boolean method4469() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "()Lclient!c;")
	@Override
	public Class35 method4445() {
		return this.aClass35_7;
	}

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "()Z")
	@Override
	public boolean method4431() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ft;Z)Lclient!l;")
	@Override
	public Class17 method4435(@OriginalArg(0) Class85 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray206;
		@Pc(5) byte[] local5 = arg0.aByteArray51;
		@Pc(8) int local8 = arg0.anInt2652;
		@Pc(11) int local11 = arg0.anInt2649;
		@Pc(32) Class17 local32;
		if (arg0.aByteArray52 == null) {
			local32 = new k(this, this.aNa2, local2, local5, 0, arg0.anInt2652, arg0.anInt2652, arg0.anInt2649);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray52;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray206[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new ra(this, this.aNa2, local40, 0, arg0.anInt2652, arg0.anInt2652, arg0.anInt2649);
				} else {
					local32 = new ia(this, this.aNa2, local40, 0, arg0.anInt2652, arg0.anInt2652, arg0.anInt2649);
				}
			} else {
				for (@Pc(47) int local47 = 0; local47 < local11; local47++) {
					local52 = local47 * local8;
					for (local54 = 0; local54 < local8; local54++) {
						local40[local52 + local54] = local2[local5[local52 + local54] & 0xFF] | local43[local52 + local54] << 24;
					}
				}
				local32 = new ra(this, this.aNa2, local40, 0, local8, local8, local11);
			}
		}
		local32.MA(arg0.anInt2650, arg0.anInt2647, arg0.anInt2651, arg0.anInt2648);
		return local32;
	}

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "()Z")
	@Override
	public boolean method4459() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.b(arg0, arg1, arg2, arg4, arg5);
		this.b(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.TA(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.TA(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
	@Override
	public void method4416(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qa", name = "F", descriptor = "(IIII)[I")
	public native int[] F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "NA", descriptor = "(IIIII)V")
	protected native void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "K", descriptor = "(Lclient!ga;II)V")
	private native void K(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z")
	@Override
	public boolean method4447() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIIII)Lclient!mh;")
	@Override
	public Class155 method4461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!kq;IIII)Lclient!t;")
	@Override
	public Class91 method4414(@OriginalArg(0) Class146 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new da(this, this.aNa2, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!qa", name = "EA", descriptor = "()V")
	public native void EA();

	@OriginalMember(owner = "client!qa", name = "za", descriptor = "(I[I[F)V")
	private native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "()V")
	public native void e();

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "()I")
	public native int w();

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "(I)V")
	public native void p(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4436(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas6 = null;
			this.aZa1 = null;
			this.PA(null);
		} else {
			@Pc(10) za local10 = (za) this.aClass163_36.method3769((long) arg0.hashCode());
			this.aCanvas6 = arg0;
			this.aZa1 = local10;
			this.PA(local10);
		}
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "()V")
	@Override
	public void method4412() {
		@Pc(1) int local1 = 0;
		while (local1 < 9) {
			try {
				synchronized (this.aCanvas6.getTreeLock()) {
					this.aZa1.ka();
					return;
				}
			} catch (@Pc(18) Exception local18) {
				Static81.method1477(200L);
				local1++;
			}
		}
		synchronized (this.aCanvas6.getTreeLock()) {
			this.aZa1.ka();
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()Z")
	@Override
	public boolean method4408() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "DA", descriptor = "(IIIIII[BII)V")
	public native void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!mh;)V")
	@Override
	public void method4470(@OriginalArg(0) Class155 arg0) {
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4460(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas6 == arg0) {
			this.method4436(null);
		}
		@Pc(15) za local15 = (za) this.aClass163_36.method3769((long) arg0.hashCode());
		if (local15 != null) {
			local15.method5866();
		}
		local15.method5868();
	}

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "()Z")
	@Override
	public boolean method4444() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "()Z")
	@Override
	public boolean method4465() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "FA", descriptor = "()V")
	private native void FA();

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)Lclient!u;")
	@Override
	public Class2_Sub17 method4440() {
		@Pc(5) na local5 = new na(this, 78643200);
		this.aClass14_40.method300(local5);
		return local5;
	}

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "()V")
	@Override
	public void method4432() {
	}

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "()V")
	public native void l();
}
