import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class fa extends Class108 implements Interface12 {

	@OriginalMember(owner = "client!fa", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "Lclient!c;")
	private final c aC2;

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "Lclient!k;")
	private final k aK2;

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "[Lclient!lq;")
	public Class141[] aClass141Array1;

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "[Lclient!hd;")
	public Class95[] aClass95Array1;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lclient!c;Lclient!k;Lclient!nd;IIII)V")
	public fa(@OriginalArg(0) c arg0, @OriginalArg(1) k arg1, @OriginalArg(2) Class160 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aC2 = arg0;
		this.aK2 = arg1;
		this.aClass141Array1 = arg2.aClass141Array3;
		this.aClass95Array1 = arg2.aClass95Array3;
		@Pc(24) int local24 = arg2.aClass141Array3 == null ? 0 : arg2.aClass141Array3.length;
		@Pc(33) int local33 = arg2.aClass95Array3 == null ? 0 : arg2.aClass95Array3.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass141Array1[local44].anInt4131;
			local42[local35++] = this.aClass141Array1[local44].anInt4126;
			local42[local35++] = this.aClass141Array1[local44].anInt4134;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass95Array1[local78].anInt2684;
		}
		@Pc(101) int local101 = arg2.aClass131Array1 == null ? 0 : arg2.aClass131Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class131 local116 = arg2.aClass131Array1[local110];
			@Pc(121) Class177 local121 = Static410.method5654(local116.anInt3720);
			local106[local108++] = local116.anInt3721;
			local106[local108++] = local121.anInt5194;
			local106[local108++] = local121.anInt5185;
			local106[local108++] = local121.anInt5186;
			local106[local108++] = local121.anInt5187;
			local106[local108++] = local121.anInt5191;
			local106[local108++] = local121.aBoolean377 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class131 local179 = arg2.aClass131Array1[local173];
			local106[local108++] = local179.anInt3722;
		}
		this.m(this.aC2, this.aK2, arg2.anInt4541, arg2.anInt4545, arg2.anIntArray297, arg2.anIntArray303, arg2.anIntArray300, arg2.anIntArray301, arg2.aShortArray66, arg2.anInt4544, arg2.aShortArray58, arg2.aShortArray64, arg2.aShortArray61, arg2.aByteArray81, arg2.aByteArray82, arg2.aByteArray84, arg2.aByteArray80, arg2.aShortArray60, arg2.aShortArray67, arg2.anIntArray302, arg2.aByte62, arg2.aShortArray63, arg2.anInt4555, arg2.aByteArray83, arg2.aShortArray65, arg2.aShortArray59, arg2.aShortArray62, arg2.anIntArray304, arg2.anIntArray306, arg2.anIntArray299, arg2.aByteArray79, arg2.aByteArray85, arg2.anIntArray307, arg2.anIntArray298, arg2.anIntArray305, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lclient!c;)V")
	public fa(@OriginalArg(0) c arg0) {
		this.aC2 = arg0;
		this.aK2 = null;
		this.va(arg0);
	}

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "(I)V")
	public native void q(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fa", name = "AA", descriptor = "()Z")
	protected native boolean AA();

	@OriginalMember(owner = "client!fa", name = "la", descriptor = "(IIII)V")
	protected native void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!fa", name = "F", descriptor = "()I")
	public native int F();

	@OriginalMember(owner = "client!fa", name = "K", descriptor = "()I")
	public native int K();

	@OriginalMember(owner = "client!fa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static115.method1851(this);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!n;Lclient!st;II)V")
	@Override
	public void method4933(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class23_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aC2.method804().k(this, arg0, null, arg2, 1);
			return;
		}
		Static41.anIntArray35[5] = 0;
		this.aC2.method804().k(this, arg0, Static41.anIntArray35, arg2, 1);
		arg1.anInt6475 = Static41.anIntArray35[0];
		arg1.anInt6476 = Static41.anIntArray35[1];
		arg1.anInt6478 = Static41.anIntArray35[2];
		arg1.anInt6474 = Static41.anIntArray35[3];
		arg1.anInt6477 = Static41.anIntArray35[4];
		arg1.aBoolean442 = Static41.anIntArray35[5] != 0;
	}

	@OriginalMember(owner = "client!fa", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!fa", name = "wa", descriptor = "()I")
	public native int wa();

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "()Z")
	@Override
	public boolean method4936() {
		return true;
	}

	@OriginalMember(owner = "client!fa", name = "R", descriptor = "(III)V")
	public native void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!fa", name = "ja", descriptor = "()I")
	public native int ja();

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "(I)V")
	public native void l(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method4947(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aC2.method804().K(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!fa", name = "ia", descriptor = "()I")
	public native int ia();

	@OriginalMember(owner = "client!fa", name = "IA", descriptor = "(I)V")
	public native void IA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "(IILclient!o;Lclient!o;III)V")
	public native void g(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class55 arg2, @OriginalArg(3) Class55 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!fa", name = "D", descriptor = "()I")
	public native int D();

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "()[Lclient!hd;")
	@Override
	public Class95[] method4940() {
		return this.aClass95Array1;
	}

	@OriginalMember(owner = "client!fa", name = "va", descriptor = "(Lclient!c;)V")
	private native void va(@OriginalArg(0) c arg0);

	@OriginalMember(owner = "client!fa", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!fa", name = "Z", descriptor = "(III)V")
	public native void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "(Lclient!c;Lclient!k;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void m(@OriginalArg(0) c arg0, @OriginalArg(1) k arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!fa", name = "J", descriptor = "()I")
	public native int J();

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "(SS)V")
	public native void i(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILclient!n;Z)Z")
	@Override
	public boolean method4937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(3) boolean arg3) {
		return this.aC2.method804().G(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!n;Lclient!st;I)V")
	@Override
	public void method4931(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class23_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aC2.method804().VA(this, arg0, null, arg2);
			return;
		}
		Static41.anIntArray35[5] = 0;
		this.aC2.method804().VA(this, arg0, Static41.anIntArray35, arg2);
		arg1.anInt6475 = Static41.anIntArray35[0];
		arg1.anInt6476 = Static41.anIntArray35[1];
		arg1.anInt6478 = Static41.anIntArray35[2];
		arg1.anInt6474 = Static41.anIntArray35[3];
		arg1.anInt6477 = Static41.anIntArray35[4];
		arg1.aBoolean442 = Static41.anIntArray35[5] != 0;
	}

	@OriginalMember(owner = "client!fa", name = "H", descriptor = "()I")
	public native int H();

	@OriginalMember(owner = "client!fa", name = "LA", descriptor = "(Lclient!ia;)Lclient!ia;")
	public native Class3_Sub3_Sub9 LA(@OriginalArg(0) Class3_Sub3_Sub9 arg0);

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "(I[IIIIIZ)V")
	protected native void e(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "()V")
	@Override
	public void method4945() {
	}

	@OriginalMember(owner = "client!fa", name = "E", descriptor = "(I)V")
	public native void E(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fa", name = "YA", descriptor = "()V")
	public native void YA();

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "(Lclient!fa;Lclient!fa;IZZ)V")
	public native void k(@OriginalArg(0) fa arg0, @OriginalArg(1) fa arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class108 method4930(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.aC2.method804().method6079(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!n;)V")
	public void method1764(@OriginalArg(0) int arg0, @OriginalArg(1) Class11 arg1) {
		@Pc(1) int local1 = arg0;
		@Pc(6) int local6;
		if (this.aClass141Array1 != null) {
			for (local6 = 0; local6 < this.aClass141Array1.length; local6++) {
				@Pc(12) Class141 local12 = this.aClass141Array1[local6];
				local12.anInt4129 = Static41.anIntArray38[local1++];
				local12.anInt4130 = Static41.anIntArray38[local1++];
				local12.anInt4128 = Static41.anIntArray38[local1++];
				local12.anInt4139 = Static41.anIntArray38[local1++];
				local12.anInt4123 = Static41.anIntArray38[local1++];
				local12.anInt4138 = Static41.anIntArray38[local1++];
				local12.anInt4135 = Static41.anIntArray38[local1++];
				local12.anInt4132 = Static41.anIntArray38[local1++];
				local12.anInt4124 = Static41.anIntArray38[local1++];
			}
		}
		if (this.aClass95Array1 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass95Array1.length; local6++) {
			@Pc(83) Class95 local83 = this.aClass95Array1[local6];
			@Pc(85) Class95 local85 = local83;
			if (local83.aClass95_2 != null) {
				local85 = local83.aClass95_2;
			}
			if (local83.aClass11_4 == null) {
				local83.aClass11_4 = arg1.method2905();
			} else {
				local83.aClass11_4.ya(arg1);
			}
			local85.anInt2680 = Static41.anIntArray38[local1++];
			local85.anInt2685 = Static41.anIntArray38[local1++];
			local85.anInt2681 = Static41.anIntArray38[local1++];
		}
	}

	@OriginalMember(owner = "client!fa", name = "B", descriptor = "(I)V")
	public native void B(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fa", name = "W", descriptor = "(I[IIIIZI[I)V")
	protected native void W(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!fa", name = "G", descriptor = "(SS)V")
	public native void G(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!fa", name = "Q", descriptor = "(I)V")
	public native void Q(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fa", name = "S", descriptor = "(I)V")
	public native void S(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fa", name = "ha", descriptor = "()V")
	protected native void ha();

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "()[Lclient!lq;")
	@Override
	public Class141[] method4944() {
		return this.aClass141Array1;
	}

	@OriginalMember(owner = "client!fa", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}
}
