import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class ma extends Class36 implements Interface9 {

	@OriginalMember(owner = "client!ma", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "Lclient!a;")
	private final a anA1;

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "Lclient!c;")
	private final c aC2;

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "[Lclient!on;")
	public Class223[] aClass223Array5;

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "[Lclient!tf;")
	public Class280[] aClass280Array5;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!a;Lclient!c;Lclient!ld;IIII)V")
	public ma(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) Class184 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anA1 = arg0;
		this.aC2 = arg1;
		this.aClass223Array5 = arg2.aClass223Array4;
		this.aClass280Array5 = arg2.aClass280Array4;
		@Pc(24) int local24 = arg2.aClass223Array4 == null ? 0 : arg2.aClass223Array4.length;
		@Pc(33) int local33 = arg2.aClass280Array4 == null ? 0 : arg2.aClass280Array4.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass223Array5[local44].anInt6756;
			local42[local35++] = this.aClass223Array5[local44].anInt6752;
			local42[local35++] = this.aClass223Array5[local44].anInt6765;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass280Array5[local78].anInt8077;
		}
		@Pc(101) int local101 = arg2.aClass21Array1 == null ? 0 : arg2.aClass21Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class21 local116 = arg2.aClass21Array1[local110];
			@Pc(121) Class147 local121 = Static181.method3084(local116.anInt535);
			local106[local108++] = local116.anInt536;
			local106[local108++] = local121.anInt4022;
			local106[local108++] = local121.anInt4025;
			local106[local108++] = local121.anInt4021;
			local106[local108++] = local121.anInt4017;
			local106[local108++] = local121.anInt4023;
			local106[local108++] = local121.aBoolean244 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class21 local179 = arg2.aClass21Array1[local173];
			local106[local108++] = local179.anInt534;
		}
		this.XA(this.anA1, this.aC2, arg2.anInt5398, arg2.anInt5399, arg2.anIntArray381, arg2.anIntArray379, arg2.anIntArray388, arg2.anIntArray378, arg2.aShortArray79, arg2.anInt5403, arg2.aShortArray78, arg2.aShortArray74, arg2.aShortArray75, arg2.aByteArray77, arg2.aByteArray73, arg2.aByteArray78, arg2.aByteArray75, arg2.aShortArray73, arg2.aShortArray80, arg2.anIntArray382, arg2.aByte56, arg2.aShortArray81, arg2.anInt5408, arg2.aByteArray72, arg2.aShortArray77, arg2.aShortArray76, arg2.aShortArray82, arg2.anIntArray384, arg2.anIntArray380, arg2.anIntArray387, arg2.aByteArray74, arg2.aByteArray76, arg2.anIntArray386, arg2.anIntArray385, arg2.anIntArray383, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!a;)V")
	public ma(@OriginalArg(0) a arg0) {
		this.anA1 = arg0;
		this.aC2 = null;
		this.i(arg0);
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "()V")
	@Override
	public void method7357() {
	}

	@OriginalMember(owner = "client!ma", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!ma", name = "ea", descriptor = "(I[IIIIIZ)V")
	protected native void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ma", name = "OA", descriptor = "(I)V")
	public native void OA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!m;Lclient!paa;I)V")
	@Override
	public void method7360(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class30_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anA1.method161().ka(this, arg0, null, arg2);
			return;
		}
		Static1.anIntArray7[5] = 0;
		this.anA1.method161().ka(this, arg0, Static1.anIntArray7, arg2);
		arg1.anInt6882 = Static1.anIntArray7[0];
		arg1.anInt6885 = Static1.anIntArray7[1];
		arg1.anInt6884 = Static1.anIntArray7[2];
		arg1.anInt6883 = Static1.anIntArray7[3];
		arg1.anInt6881 = Static1.anIntArray7[4];
		arg1.aBoolean481 = Static1.anIntArray7[5] != 0;
	}

	@OriginalMember(owner = "client!ma", name = "BA", descriptor = "(I[IIIIZI[I)V")
	protected native void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ma", name = "NA", descriptor = "(Z)V")
	public native void NA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ma", name = "RA", descriptor = "(IILclient!sa;Lclient!sa;III)V")
	public native void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class131 arg2, @OriginalArg(3) Class131 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "()Z")
	@Override
	public boolean method7353() {
		return true;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILclient!m;Z)Z")
	@Override
	public boolean method7359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) boolean arg3) {
		return this.anA1.method161().RA(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ma", name = "ca", descriptor = "(III)V")
	public native void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ma", name = "MA", descriptor = "()V")
	protected native void MA();

	@OriginalMember(owner = "client!ma", name = "TA", descriptor = "()I")
	public native int TA();

	@OriginalMember(owner = "client!ma", name = "ga", descriptor = "()I")
	public native int ga();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!m;)V")
	public void method4944(@OriginalArg(0) int arg0, @OriginalArg(1) Class78 arg1) {
		@Pc(1) int local1 = arg0;
		@Pc(6) int local6;
		if (this.aClass223Array5 != null) {
			for (local6 = 0; local6 < this.aClass223Array5.length; local6++) {
				@Pc(12) Class223 local12 = this.aClass223Array5[local6];
				local12.anInt6749 = Static1.anIntArray2[local1++];
				local12.anInt6759 = Static1.anIntArray2[local1++];
				local12.anInt6755 = Static1.anIntArray2[local1++];
				local12.anInt6762 = Static1.anIntArray2[local1++];
				local12.anInt6763 = Static1.anIntArray2[local1++];
				local12.anInt6750 = Static1.anIntArray2[local1++];
				local12.anInt6761 = Static1.anIntArray2[local1++];
				local12.anInt6757 = Static1.anIntArray2[local1++];
				local12.anInt6751 = Static1.anIntArray2[local1++];
			}
		}
		if (this.aClass280Array5 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass280Array5.length; local6++) {
			@Pc(83) Class280 local83 = this.aClass280Array5[local6];
			@Pc(85) Class280 local85 = local83;
			if (local83.aClass280_2 != null) {
				local85 = local83.aClass280_2;
			}
			if (local83.aClass78_6 == null) {
				local83.aClass78_6 = arg1.method5707();
			} else {
				local83.aClass78_6.EA(arg1);
			}
			local85.anInt8075 = Static1.anIntArray2[local1++];
			local85.anInt8068 = Static1.anIntArray2[local1++];
			local85.anInt8070 = Static1.anIntArray2[local1++];
		}
	}

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "(I)V")
	public native void m(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "ba", descriptor = "()I")
	public native int ba();

	@OriginalMember(owner = "client!ma", name = "sa", descriptor = "()Z")
	protected native boolean sa();

	@OriginalMember(owner = "client!ma", name = "L", descriptor = "(SS)V")
	public native void L(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ma", name = "WA", descriptor = "(Lclient!ma;Lclient!ma;IZZ)V")
	public native void WA(@OriginalArg(0) ma arg0, @OriginalArg(1) ma arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!r;IIIZ)V")
	@Override
	public void method7349(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anA1.method161().PA(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "()[Lclient!on;")
	@Override
	public Class223[] method7350() {
		return this.aClass223Array5;
	}

	@OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static351.method5441(this);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!m;Lclient!paa;II)V")
	@Override
	public void method7346(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class30_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anA1.method161().m(this, arg0, null, arg2, 1);
			return;
		}
		Static1.anIntArray7[5] = 0;
		this.anA1.method161().m(this, arg0, Static1.anIntArray7, arg2, 1);
		arg1.anInt6882 = Static1.anIntArray7[0];
		arg1.anInt6885 = Static1.anIntArray7[1];
		arg1.anInt6884 = Static1.anIntArray7[2];
		arg1.anInt6883 = Static1.anIntArray7[3];
		arg1.anInt6881 = Static1.anIntArray7[4];
		arg1.aBoolean481 = Static1.anIntArray7[5] != 0;
	}

	@OriginalMember(owner = "client!ma", name = "I", descriptor = "(I)V")
	public native void I(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "V", descriptor = "(III)V")
	public native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ma", name = "pa", descriptor = "(SS)V")
	public native void pa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "()[Lclient!tf;")
	@Override
	public Class280[] method7361() {
		return this.aClass280Array5;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
	public native void b(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "Q", descriptor = "()I")
	public native int Q();

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "(I)V")
	public native void g(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "()I")
	public native int e();

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "()I")
	public native int n();

	@OriginalMember(owner = "client!ma", name = "XA", descriptor = "(Lclient!a;Lclient!c;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void XA(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BIZ)Lclient!r;")
	@Override
	public Class36 method7356(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anA1.method161().method6954(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ma", name = "X", descriptor = "()V")
	public native void X();

	@OriginalMember(owner = "client!ma", name = "D", descriptor = "(I)V")
	public native void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "wa", descriptor = "()I")
	public native int wa();

	@OriginalMember(owner = "client!ma", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "(I)V")
	public native void q(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ma", name = "va", descriptor = "()I")
	public native int va();

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "(IIII)V")
	protected native void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "(Lclient!a;)V")
	private native void i(@OriginalArg(0) a arg0);

	@OriginalMember(owner = "client!ma", name = "EA", descriptor = "(Lclient!k;)Lclient!k;")
	public native Class5_Sub2_Sub13 EA(@OriginalArg(0) Class5_Sub2_Sub13 arg0);
}
