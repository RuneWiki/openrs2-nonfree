import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class ma extends Class26 implements Interface12 {

	@OriginalMember(owner = "client!ma", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "Lclient!a;")
	private final a anA1;

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "Lclient!c;")
	private final c aC2;

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "[Lclient!ig;")
	public Class142[] aClass142Array6;

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "[Lclient!rn;")
	public Class265[] aClass265Array6;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!a;Lclient!c;Lclient!ln;IIII)V")
	public ma(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) Class192 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anA1 = arg0;
		this.aC2 = arg1;
		this.aClass142Array6 = arg2.aClass142Array5;
		this.aClass265Array6 = arg2.aClass265Array5;
		@Pc(24) int local24 = arg2.aClass142Array5 == null ? 0 : arg2.aClass142Array5.length;
		@Pc(33) int local33 = arg2.aClass265Array5 == null ? 0 : arg2.aClass265Array5.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass142Array6[local44].anInt4538;
			local42[local35++] = this.aClass142Array6[local44].anInt4540;
			local42[local35++] = this.aClass142Array6[local44].anInt4542;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass265Array6[local78].anInt7977;
		}
		@Pc(101) int local101 = arg2.aClass2Array1 == null ? 0 : arg2.aClass2Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class2 local116 = arg2.aClass2Array1[local110];
			@Pc(121) Class271 local121 = Static267.method4553(local116.anInt56);
			local106[local108++] = local116.anInt52;
			local106[local108++] = local121.anInt8113;
			local106[local108++] = local121.anInt8111;
			local106[local108++] = local121.anInt8107;
			local106[local108++] = local121.anInt8109;
			local106[local108++] = local121.anInt8112;
			local106[local108++] = local121.aBoolean555 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class2 local179 = arg2.aClass2Array1[local173];
			local106[local108++] = local179.anInt57;
		}
		this.XA(this.anA1, this.aC2, arg2.anInt5543, arg2.anInt5546, arg2.anIntArray386, arg2.anIntArray394, arg2.anIntArray387, arg2.anIntArray390, arg2.aShortArray77, arg2.anInt5556, arg2.aShortArray84, arg2.aShortArray86, arg2.aShortArray82, arg2.aByteArray65, arg2.aByteArray66, arg2.aByteArray62, arg2.aByteArray63, arg2.aShortArray85, arg2.aShortArray80, arg2.anIntArray388, arg2.aByte66, arg2.aShortArray79, arg2.anInt5557, arg2.aByteArray68, arg2.aShortArray78, arg2.aShortArray83, arg2.aShortArray81, arg2.anIntArray392, arg2.anIntArray385, arg2.anIntArray393, arg2.aByteArray67, arg2.aByteArray69, arg2.anIntArray395, arg2.anIntArray389, arg2.anIntArray391, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!a;)V")
	public ma(@OriginalArg(0) a arg0) {
		this.anA1 = arg0;
		this.aC2 = null;
		this.i(arg0);
	}

	@OriginalMember(owner = "client!ma", name = "MA", descriptor = "()V")
	protected native void MA();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!m;Lclient!kn;II)V")
	@Override
	public void method7994(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class7_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anA1.method162().m(this, arg0, null, arg2, 1);
			return;
		}
		Static1.anIntArray4[5] = 0;
		this.anA1.method162().m(this, arg0, Static1.anIntArray4, arg2, 1);
		arg1.anInt5261 = Static1.anIntArray4[0];
		arg1.anInt5260 = Static1.anIntArray4[1];
		arg1.anInt5262 = Static1.anIntArray4[2];
		arg1.anInt5259 = Static1.anIntArray4[3];
		arg1.anInt5258 = Static1.anIntArray4[4];
		arg1.aBoolean404 = Static1.anIntArray4[5] != 0;
	}

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "()I")
	public native int n();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ma", name = "L", descriptor = "(SS)V")
	public native void L(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "()[Lclient!rn;")
	@Override
	public Class265[] method7999() {
		return this.aClass265Array6;
	}

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "(I)V")
	public native void q(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "TA", descriptor = "()I")
	public native int TA();

	@OriginalMember(owner = "client!ma", name = "NA", descriptor = "(Z)V")
	public native void NA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ma", name = "Q", descriptor = "()I")
	public native int Q();

	@OriginalMember(owner = "client!ma", name = "BA", descriptor = "(I[IIIIZI[I)V")
	protected native void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ma", name = "pa", descriptor = "(SS)V")
	public native void pa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "(I)V")
	public native void m(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "wa", descriptor = "()I")
	public native int wa();

	@OriginalMember(owner = "client!ma", name = "OA", descriptor = "(I)V")
	public native void OA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
	public native void b(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "(I)V")
	public native void g(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILclient!m;Z)Z")
	@Override
	public boolean method8005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) boolean arg3) {
		return this.anA1.method162().RA(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ma", name = "WA", descriptor = "(Lclient!ma;Lclient!ma;IZZ)V")
	public native void WA(@OriginalArg(0) ma arg0, @OriginalArg(1) ma arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ma", name = "RA", descriptor = "(IILclient!sa;Lclient!sa;III)V")
	public native void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class215 arg2, @OriginalArg(3) Class215 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ma", name = "sa", descriptor = "()Z")
	protected native boolean sa();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!r;IIIZ)V")
	@Override
	public void method7998(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anA1.method162().PA(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ma", name = "va", descriptor = "()I")
	public native int va();

	@OriginalMember(owner = "client!ma", name = "EA", descriptor = "(Lclient!k;)Lclient!k;")
	public native Class12_Sub4_Sub10 EA(@OriginalArg(0) Class12_Sub4_Sub10 arg0);

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "()I")
	public native int e();

	@OriginalMember(owner = "client!ma", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static229.method4115(this);
		}
	}

	@OriginalMember(owner = "client!ma", name = "ca", descriptor = "(III)V")
	public native void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!m;)V")
	public void method4765(@OriginalArg(0) int arg0, @OriginalArg(1) Class91 arg1) {
		@Pc(1) int local1 = arg0;
		@Pc(6) int local6;
		if (this.aClass142Array6 != null) {
			for (local6 = 0; local6 < this.aClass142Array6.length; local6++) {
				@Pc(12) Class142 local12 = this.aClass142Array6[local6];
				local12.anInt4543 = Static1.anIntArray6[local1++];
				local12.anInt4545 = Static1.anIntArray6[local1++];
				local12.anInt4551 = Static1.anIntArray6[local1++];
				local12.anInt4547 = Static1.anIntArray6[local1++];
				local12.anInt4541 = Static1.anIntArray6[local1++];
				local12.anInt4550 = Static1.anIntArray6[local1++];
				local12.anInt4535 = Static1.anIntArray6[local1++];
				local12.anInt4548 = Static1.anIntArray6[local1++];
				local12.anInt4546 = Static1.anIntArray6[local1++];
			}
		}
		if (this.aClass265Array6 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass265Array6.length; local6++) {
			@Pc(83) Class265 local83 = this.aClass265Array6[local6];
			@Pc(85) Class265 local85 = local83;
			if (local83.aClass265_1 != null) {
				local85 = local83.aClass265_1;
			}
			if (local83.aClass91_6 == null) {
				local83.aClass91_6 = arg1.method7050();
			} else {
				local83.aClass91_6.EA(arg1);
			}
			local85.anInt7974 = Static1.anIntArray6[local1++];
			local85.anInt7975 = Static1.anIntArray6[local1++];
			local85.anInt7972 = Static1.anIntArray6[local1++];
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!m;Lclient!kn;I)V")
	@Override
	public void method8003(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class7_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anA1.method162().ka(this, arg0, null, arg2);
			return;
		}
		Static1.anIntArray4[5] = 0;
		this.anA1.method162().ka(this, arg0, Static1.anIntArray4, arg2);
		arg1.anInt5261 = Static1.anIntArray4[0];
		arg1.anInt5260 = Static1.anIntArray4[1];
		arg1.anInt5262 = Static1.anIntArray4[2];
		arg1.anInt5259 = Static1.anIntArray4[3];
		arg1.anInt5258 = Static1.anIntArray4[4];
		arg1.aBoolean404 = Static1.anIntArray4[5] != 0;
	}

	@OriginalMember(owner = "client!ma", name = "D", descriptor = "(I)V")
	public native void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "()V")
	@Override
	public void method8004() {
	}

	@OriginalMember(owner = "client!ma", name = "X", descriptor = "()V")
	public native void X();

	@OriginalMember(owner = "client!ma", name = "I", descriptor = "(I)V")
	public native void I(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "XA", descriptor = "(Lclient!a;Lclient!c;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void XA(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!ma", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "()[Lclient!ig;")
	@Override
	public Class142[] method8006() {
		return this.aClass142Array6;
	}

	@OriginalMember(owner = "client!ma", name = "V", descriptor = "(III)V")
	public native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BIZ)Lclient!r;")
	@Override
	public Class26 method7992(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anA1.method162().method7484(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "(Lclient!a;)V")
	private native void i(@OriginalArg(0) a arg0);

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "(IIII)V")
	protected native void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ma", name = "ba", descriptor = "()I")
	public native int ba();

	@OriginalMember(owner = "client!ma", name = "ea", descriptor = "(I[IIIIIZ)V")
	protected native void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ma", name = "ga", descriptor = "()I")
	public native int ga();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "()Z")
	@Override
	public boolean method7997() {
		return true;
	}
}
