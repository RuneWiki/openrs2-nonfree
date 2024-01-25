import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class ma extends Class19 implements Interface13 {

	@OriginalMember(owner = "client!ma", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "Lclient!a;")
	private final a anA1;

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "Lclient!c;")
	private final c aC2;

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "[Lclient!lh;")
	public Class178[] aClass178Array5;

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "[Lclient!ia;")
	public Class129[] aClass129Array5;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!a;Lclient!c;Lclient!fd;IIII)V")
	public ma(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anA1 = arg0;
		this.aC2 = arg1;
		this.aClass178Array5 = arg2.aClass178Array3;
		this.aClass129Array5 = arg2.aClass129Array3;
		@Pc(24) int local24 = arg2.aClass178Array3 == null ? 0 : arg2.aClass178Array3.length;
		@Pc(33) int local33 = arg2.aClass129Array3 == null ? 0 : arg2.aClass129Array3.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass178Array5[local44].anInt5394;
			local42[local35++] = this.aClass178Array5[local44].anInt5388;
			local42[local35++] = this.aClass178Array5[local44].anInt5386;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass129Array5[local78].anInt4062;
		}
		@Pc(101) int local101 = arg2.aClass26Array1 == null ? 0 : arg2.aClass26Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class26 local116 = arg2.aClass26Array1[local110];
			@Pc(121) Class103 local121 = Static193.method3619(local116.anInt1200);
			local106[local108++] = local116.anInt1199;
			local106[local108++] = local121.anInt3483;
			local106[local108++] = local121.anInt3485;
			local106[local108++] = local121.anInt3488;
			local106[local108++] = local121.anInt3481;
			local106[local108++] = local121.anInt3484;
			local106[local108++] = local121.aBoolean212 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class26 local179 = arg2.aClass26Array1[local173];
			local106[local108++] = local179.anInt1205;
		}
		this.XA(this.anA1, this.aC2, arg2.anInt3059, arg2.anInt3066, arg2.anIntArray251, arg2.anIntArray249, arg2.anIntArray246, arg2.anIntArray243, arg2.aShortArray42, arg2.anInt3068, arg2.aShortArray37, arg2.aShortArray44, arg2.aShortArray46, arg2.aByteArray35, arg2.aByteArray36, arg2.aByteArray34, arg2.aByteArray37, arg2.aShortArray45, arg2.aShortArray40, arg2.anIntArray241, arg2.aByte23, arg2.aShortArray38, arg2.anInt3054, arg2.aByteArray38, arg2.aShortArray43, arg2.aShortArray41, arg2.aShortArray39, arg2.anIntArray242, arg2.anIntArray250, arg2.anIntArray248, arg2.aByteArray39, arg2.aByteArray40, arg2.anIntArray245, arg2.anIntArray240, arg2.anIntArray244, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!a;)V")
	public ma(@OriginalArg(0) a arg0) {
		this.anA1 = arg0;
		this.aC2 = null;
		this.i(arg0);
	}

	@OriginalMember(owner = "client!ma", name = "ga", descriptor = "()I")
	public native int ga();

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "()Z")
	@Override
	public boolean method7256() {
		return true;
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "()V")
	@Override
	public void method7259() {
	}

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "(IIII)V")
	protected native void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "()[Lclient!ia;")
	@Override
	public Class129[] method7246() {
		return this.aClass129Array5;
	}

	@OriginalMember(owner = "client!ma", name = "va", descriptor = "()I")
	public native int va();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!m;)V")
	public void method4905(@OriginalArg(0) int arg0, @OriginalArg(1) Class22 arg1) {
		@Pc(1) int local1 = arg0;
		@Pc(6) int local6;
		if (this.aClass178Array5 != null) {
			for (local6 = 0; local6 < this.aClass178Array5.length; local6++) {
				@Pc(12) Class178 local12 = this.aClass178Array5[local6];
				local12.anInt5393 = Static1.anIntArray6[local1++];
				local12.anInt5383 = Static1.anIntArray6[local1++];
				local12.anInt5381 = Static1.anIntArray6[local1++];
				local12.anInt5382 = Static1.anIntArray6[local1++];
				local12.anInt5387 = Static1.anIntArray6[local1++];
				local12.anInt5380 = Static1.anIntArray6[local1++];
				local12.anInt5395 = Static1.anIntArray6[local1++];
				local12.anInt5391 = Static1.anIntArray6[local1++];
				local12.anInt5385 = Static1.anIntArray6[local1++];
			}
		}
		if (this.aClass129Array5 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass129Array5.length; local6++) {
			@Pc(83) Class129 local83 = this.aClass129Array5[local6];
			@Pc(85) Class129 local85 = local83;
			if (local83.aClass129_2 != null) {
				local85 = local83.aClass129_2;
			}
			if (local83.aClass22_7 == null) {
				local83.aClass22_7 = arg1.method5945();
			} else {
				local83.aClass22_7.EA(arg1);
			}
			local85.anInt4068 = Static1.anIntArray6[local1++];
			local85.anInt4063 = Static1.anIntArray6[local1++];
			local85.anInt4064 = Static1.anIntArray6[local1++];
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "()[Lclient!lh;")
	@Override
	public Class178[] method7251() {
		return this.aClass178Array5;
	}

	@OriginalMember(owner = "client!ma", name = "OA", descriptor = "(I)V")
	public native void OA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "()I")
	public native int e();

	@OriginalMember(owner = "client!ma", name = "NA", descriptor = "(Z)V")
	public native void NA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ma", name = "BA", descriptor = "(I[IIIIZI[I)V")
	protected native void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ma", name = "WA", descriptor = "(Lclient!ma;Lclient!ma;IZZ)V")
	public native void WA(@OriginalArg(0) ma arg0, @OriginalArg(1) ma arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ma", name = "XA", descriptor = "(Lclient!a;Lclient!c;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void XA(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!ma", name = "X", descriptor = "()V")
	public native void X();

	@OriginalMember(owner = "client!ma", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!ma", name = "RA", descriptor = "(IILclient!sa;Lclient!sa;III)V")
	public native void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) Class10 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ma", name = "sa", descriptor = "()Z")
	protected native boolean sa();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILclient!m;Z)Z")
	@Override
	public boolean method7257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) boolean arg3) {
		return this.anA1.method164().RA(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ma", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!m;Lclient!pr;II)V")
	@Override
	public void method7253(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class2_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anA1.method164().m(this, arg0, null, arg2, 1);
			return;
		}
		Static1.anIntArray5[5] = 0;
		this.anA1.method164().m(this, arg0, Static1.anIntArray5, arg2, 1);
		arg1.anInt6640 = Static1.anIntArray5[0];
		arg1.anInt6642 = Static1.anIntArray5[1];
		arg1.anInt6643 = Static1.anIntArray5[2];
		arg1.anInt6639 = Static1.anIntArray5[3];
		arg1.anInt6641 = Static1.anIntArray5[4];
		arg1.aBoolean437 = Static1.anIntArray5[5] != 0;
	}

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "(I)V")
	public native void g(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "V", descriptor = "(III)V")
	public native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
	public native void b(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!r;IIIZ)V")
	@Override
	public void method7263(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anA1.method164().PA(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "(I)V")
	public native void m(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "L", descriptor = "(SS)V")
	public native void L(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ma", name = "Q", descriptor = "()I")
	public native int Q();

	@OriginalMember(owner = "client!ma", name = "ca", descriptor = "(III)V")
	public native void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "(Lclient!a;)V")
	private native void i(@OriginalArg(0) a arg0);

	@OriginalMember(owner = "client!ma", name = "D", descriptor = "(I)V")
	public native void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "wa", descriptor = "()I")
	public native int wa();

	@OriginalMember(owner = "client!ma", name = "TA", descriptor = "()I")
	public native int TA();

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "(I)V")
	public native void q(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "()I")
	public native int n();

	@OriginalMember(owner = "client!ma", name = "I", descriptor = "(I)V")
	public native void I(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "ba", descriptor = "()I")
	public native int ba();

	@OriginalMember(owner = "client!ma", name = "MA", descriptor = "()V")
	protected native void MA();

	@OriginalMember(owner = "client!ma", name = "EA", descriptor = "(Lclient!k;)Lclient!k;")
	public native Class1_Sub1_Sub4 EA(@OriginalArg(0) Class1_Sub1_Sub4 arg0);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!m;Lclient!pr;I)V")
	@Override
	public void method7258(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class2_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anA1.method164().ka(this, arg0, null, arg2);
			return;
		}
		Static1.anIntArray5[5] = 0;
		this.anA1.method164().ka(this, arg0, Static1.anIntArray5, arg2);
		arg1.anInt6640 = Static1.anIntArray5[0];
		arg1.anInt6642 = Static1.anIntArray5[1];
		arg1.anInt6643 = Static1.anIntArray5[2];
		arg1.anInt6639 = Static1.anIntArray5[3];
		arg1.anInt6641 = Static1.anIntArray5[4];
		arg1.aBoolean437 = Static1.anIntArray5[5] != 0;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BIZ)Lclient!r;")
	@Override
	public Class19 method7260(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anA1.method164().method7186(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static431.method6347(this);
		}
	}

	@OriginalMember(owner = "client!ma", name = "pa", descriptor = "(SS)V")
	public native void pa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ma", name = "ea", descriptor = "(I[IIIIIZ)V")
	protected native void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);
}
