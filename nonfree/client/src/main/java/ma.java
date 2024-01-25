import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class ma extends Class63 implements Interface14 {

	@OriginalMember(owner = "client!ma", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "Lclient!a;")
	private final a anA1;

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "Lclient!c;")
	private final c aC2;

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "[Lclient!mm;")
	public Class192[] aClass192Array5;

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "[Lclient!kv;")
	public Class169[] aClass169Array5;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!a;Lclient!c;Lclient!bt;IIII)V")
	public ma(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) Class29 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anA1 = arg0;
		this.aC2 = arg1;
		this.aClass192Array5 = arg2.aClass192Array1;
		this.aClass169Array5 = arg2.aClass169Array1;
		@Pc(24) int local24 = arg2.aClass192Array1 == null ? 0 : arg2.aClass192Array1.length;
		@Pc(33) int local33 = arg2.aClass169Array1 == null ? 0 : arg2.aClass169Array1.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass192Array5[local44].anInt5532;
			local42[local35++] = this.aClass192Array5[local44].anInt5539;
			local42[local35++] = this.aClass192Array5[local44].anInt5543;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass169Array5[local78].anInt4667;
		}
		@Pc(101) int local101 = arg2.aClass120Array1 == null ? 0 : arg2.aClass120Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class120 local116 = arg2.aClass120Array1[local110];
			@Pc(121) Class233 local121 = Static367.method5866(local116.anInt3401);
			local106[local108++] = local116.anInt3402;
			local106[local108++] = local121.anInt7439;
			local106[local108++] = local121.anInt7440;
			local106[local108++] = local121.anInt7435;
			local106[local108++] = local121.anInt7438;
			local106[local108++] = local121.anInt7434;
			local106[local108++] = local121.aBoolean556 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class120 local179 = arg2.aClass120Array1[local173];
			local106[local108++] = local179.anInt3400;
		}
		this.XA(this.anA1, this.aC2, arg2.anInt866, arg2.anInt861, arg2.anIntArray65, arg2.anIntArray71, arg2.anIntArray72, arg2.anIntArray68, arg2.aShortArray26, arg2.anInt856, arg2.aShortArray33, arg2.aShortArray27, arg2.aShortArray28, arg2.aByteArray25, arg2.aByteArray31, arg2.aByteArray30, arg2.aByteArray28, arg2.aShortArray30, arg2.aShortArray35, arg2.anIntArray66, arg2.aByte18, arg2.aShortArray31, arg2.anInt850, arg2.aByteArray27, arg2.aShortArray32, arg2.aShortArray29, arg2.aShortArray34, arg2.anIntArray64, arg2.anIntArray70, arg2.anIntArray73, arg2.aByteArray29, arg2.aByteArray26, arg2.anIntArray67, arg2.anIntArray69, arg2.anIntArray74, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!a;)V")
	public ma(@OriginalArg(0) a arg0) {
		this.anA1 = arg0;
		this.aC2 = null;
		this.i(arg0);
	}

	@OriginalMember(owner = "client!ma", name = "RA", descriptor = "(IILclient!sa;Lclient!sa;III)V")
	public native void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class75 arg2, @OriginalArg(3) Class75 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "()Z")
	@Override
	public boolean method7707() {
		return true;
	}

	@OriginalMember(owner = "client!ma", name = "L", descriptor = "(SS)V")
	public native void L(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ma", name = "sa", descriptor = "()Z")
	protected native boolean sa();

	@OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static508.method7434(this);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ma", name = "ba", descriptor = "()I")
	public native int ba();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BIZ)Lclient!r;")
	@Override
	public Class63 method7706(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anA1.method160().method7340(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ma", name = "ea", descriptor = "(I[IIIIIZ)V")
	protected native void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!r;IIIZ)V")
	@Override
	public void method7705(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anA1.method160().PA(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ma", name = "XA", descriptor = "(Lclient!a;Lclient!c;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void XA(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!ma", name = "TA", descriptor = "()I")
	public native int TA();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!m;)V")
	public void method4594(@OriginalArg(0) int arg0, @OriginalArg(1) Class181 arg1) {
		@Pc(1) int local1 = arg0;
		@Pc(6) int local6;
		if (this.aClass192Array5 != null) {
			for (local6 = 0; local6 < this.aClass192Array5.length; local6++) {
				@Pc(12) Class192 local12 = this.aClass192Array5[local6];
				local12.anInt5538 = Static1.anIntArray6[local1++];
				local12.anInt5544 = Static1.anIntArray6[local1++];
				local12.anInt5542 = Static1.anIntArray6[local1++];
				local12.anInt5545 = Static1.anIntArray6[local1++];
				local12.anInt5534 = Static1.anIntArray6[local1++];
				local12.anInt5533 = Static1.anIntArray6[local1++];
				local12.anInt5537 = Static1.anIntArray6[local1++];
				local12.anInt5535 = Static1.anIntArray6[local1++];
				local12.anInt5531 = Static1.anIntArray6[local1++];
			}
		}
		if (this.aClass169Array5 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass169Array5.length; local6++) {
			@Pc(83) Class169 local83 = this.aClass169Array5[local6];
			@Pc(85) Class169 local85 = local83;
			if (local83.aClass169_2 != null) {
				local85 = local83.aClass169_2;
			}
			if (local83.aClass181_10 == null) {
				local83.aClass181_10 = arg1.method5993();
			} else {
				local83.aClass181_10.EA(arg1);
			}
			local85.anInt4676 = Static1.anIntArray6[local1++];
			local85.anInt4674 = Static1.anIntArray6[local1++];
			local85.anInt4670 = Static1.anIntArray6[local1++];
		}
	}

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "(Lclient!a;)V")
	private native void i(@OriginalArg(0) a arg0);

	@OriginalMember(owner = "client!ma", name = "pa", descriptor = "(SS)V")
	public native void pa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "()I")
	public native int e();

	@OriginalMember(owner = "client!ma", name = "X", descriptor = "()V")
	public native void X();

	@OriginalMember(owner = "client!ma", name = "EA", descriptor = "(Lclient!k;)Lclient!k;")
	public native Class2_Sub13_Sub6 EA(@OriginalArg(0) Class2_Sub13_Sub6 arg0);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
	@Override
	public void method7696() {
	}

	@OriginalMember(owner = "client!ma", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILclient!m;Z)Z")
	@Override
	public boolean method7697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) boolean arg3) {
		return this.anA1.method160().RA(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "()[Lclient!mm;")
	@Override
	public Class192[] method7708() {
		return this.aClass192Array5;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!m;Lclient!gr;I)V")
	@Override
	public void method7700(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class6_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anA1.method160().ka(this, arg0, null, arg2);
			return;
		}
		Static1.anIntArray7[5] = 0;
		this.anA1.method160().ka(this, arg0, Static1.anIntArray7, arg2);
		arg1.anInt3041 = Static1.anIntArray7[0];
		arg1.anInt3043 = Static1.anIntArray7[1];
		arg1.anInt3042 = Static1.anIntArray7[2];
		arg1.anInt3044 = Static1.anIntArray7[3];
		arg1.anInt3040 = Static1.anIntArray7[4];
		arg1.aBoolean247 = Static1.anIntArray7[5] != 0;
	}

	@OriginalMember(owner = "client!ma", name = "D", descriptor = "(I)V")
	public native void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "WA", descriptor = "(Lclient!ma;Lclient!ma;IZZ)V")
	public native void WA(@OriginalArg(0) ma arg0, @OriginalArg(1) ma arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ma", name = "va", descriptor = "()I")
	public native int va();

	@OriginalMember(owner = "client!ma", name = "ga", descriptor = "()I")
	public native int ga();

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "()[Lclient!kv;")
	@Override
	public Class169[] method7702() {
		return this.aClass169Array5;
	}

	@OriginalMember(owner = "client!ma", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
	public native void b(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "(I)V")
	public native void m(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "V", descriptor = "(III)V")
	public native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ma", name = "NA", descriptor = "(Z)V")
	public native void NA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!m;Lclient!gr;II)V")
	@Override
	public void method7703(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class6_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anA1.method160().m(this, arg0, null, arg2, 1);
			return;
		}
		Static1.anIntArray7[5] = 0;
		this.anA1.method160().m(this, arg0, Static1.anIntArray7, arg2, 1);
		arg1.anInt3041 = Static1.anIntArray7[0];
		arg1.anInt3043 = Static1.anIntArray7[1];
		arg1.anInt3042 = Static1.anIntArray7[2];
		arg1.anInt3044 = Static1.anIntArray7[3];
		arg1.anInt3040 = Static1.anIntArray7[4];
		arg1.aBoolean247 = Static1.anIntArray7[5] != 0;
	}

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "(IIII)V")
	protected native void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ma", name = "BA", descriptor = "(I[IIIIZI[I)V")
	protected native void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "(I)V")
	public native void q(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "OA", descriptor = "(I)V")
	public native void OA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "(I)V")
	public native void g(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "Q", descriptor = "()I")
	public native int Q();

	@OriginalMember(owner = "client!ma", name = "wa", descriptor = "()I")
	public native int wa();

	@OriginalMember(owner = "client!ma", name = "I", descriptor = "(I)V")
	public native void I(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "ca", descriptor = "(III)V")
	public native void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ma", name = "MA", descriptor = "()V")
	protected native void MA();

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "()I")
	public native int n();
}
