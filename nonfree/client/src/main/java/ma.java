import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class ma extends Class97 implements Interface14 {

	@OriginalMember(owner = "client!ma", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "Lclient!a;")
	private final a anA1;

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "Lclient!c;")
	private final c aC2;

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "[Lclient!dl;")
	public Class68[] aClass68Array4;

	@OriginalMember(owner = "client!ma", name = "t", descriptor = "[Lclient!fr;")
	public Class106[] aClass106Array4;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!a;Lclient!c;Lclient!ei;IIII)V")
	public ma(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) Class81 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anA1 = arg0;
		this.aC2 = arg1;
		this.aClass68Array4 = arg2.aClass68Array1;
		this.aClass106Array4 = arg2.aClass106Array1;
		@Pc(24) int local24 = arg2.aClass68Array1 == null ? 0 : arg2.aClass68Array1.length;
		@Pc(33) int local33 = arg2.aClass106Array1 == null ? 0 : arg2.aClass106Array1.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass68Array4[local44].anInt1933;
			local42[local35++] = this.aClass68Array4[local44].anInt1944;
			local42[local35++] = this.aClass68Array4[local44].anInt1938;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass106Array4[local78].anInt2810;
		}
		@Pc(101) int local101 = arg2.aClass256Array1 == null ? 0 : arg2.aClass256Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class256 local116 = arg2.aClass256Array1[local110];
			@Pc(121) Class34 local121 = Static461.method7929(local116.anInt7427);
			local106[local108++] = local116.anInt7426;
			local106[local108++] = local121.anInt1150;
			local106[local108++] = local121.anInt1151;
			local106[local108++] = local121.anInt1153;
			local106[local108++] = local121.anInt1154;
			local106[local108++] = local121.anInt1157;
			local106[local108++] = local121.aBoolean100 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class256 local179 = arg2.aClass256Array1[local173];
			local106[local108++] = local179.anInt7422;
		}
		this.XA(this.anA1, this.aC2, arg2.anInt2251, arg2.anInt2240, arg2.anIntArray174, arg2.anIntArray165, arg2.anIntArray170, arg2.anIntArray172, arg2.aShortArray44, arg2.anInt2239, arg2.aShortArray39, arg2.aShortArray45, arg2.aShortArray41, arg2.aByteArray29, arg2.aByteArray28, arg2.aByteArray25, arg2.aByteArray27, arg2.aShortArray42, arg2.aShortArray43, arg2.anIntArray173, arg2.aByte36, arg2.aShortArray46, arg2.anInt2249, arg2.aByteArray26, arg2.aShortArray48, arg2.aShortArray40, arg2.aShortArray47, arg2.anIntArray166, arg2.anIntArray168, arg2.anIntArray171, arg2.aByteArray24, arg2.aByteArray30, arg2.anIntArray169, arg2.anIntArray175, arg2.anIntArray167, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!a;)V")
	public ma(@OriginalArg(0) a arg0) {
		this.anA1 = arg0;
		this.aC2 = null;
		this.i(arg0);
	}

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "(I)V")
	public native void q(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "(I)V")
	public native void g(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "()[Lclient!dl;")
	@Override
	public Class68[] method6782() {
		return this.aClass68Array4;
	}

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "()I")
	public native int e();

	@OriginalMember(owner = "client!ma", name = "NA", descriptor = "(Z)V")
	public native void NA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ma", name = "sa", descriptor = "()Z")
	protected native boolean sa();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!m;Lclient!cf;II)V")
	@Override
	public void method6778(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class46_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anA1.method160().m(this, arg0, null, arg2, 1);
			return;
		}
		Static1.anIntArray4[5] = 0;
		this.anA1.method160().m(this, arg0, Static1.anIntArray4, arg2, 1);
		arg1.anInt1433 = Static1.anIntArray4[0];
		arg1.anInt1435 = Static1.anIntArray4[1];
		arg1.anInt1437 = Static1.anIntArray4[2];
		arg1.anInt1434 = Static1.anIntArray4[3];
		arg1.anInt1436 = Static1.anIntArray4[4];
		arg1.aBoolean109 = Static1.anIntArray4[5] != 0;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BIZ)Lclient!r;")
	@Override
	public Class97 method6770(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anA1.method160().method7704(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ma", name = "ea", descriptor = "(I[IIIIIZ)V")
	protected native void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ma", name = "MA", descriptor = "()V")
	protected native void MA();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!r;IIIZ)V")
	@Override
	public void method6769(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anA1.method160().PA(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!m;)V")
	public void method5066(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1) {
		@Pc(1) int local1 = arg0;
		@Pc(6) int local6;
		if (this.aClass68Array4 != null) {
			for (local6 = 0; local6 < this.aClass68Array4.length; local6++) {
				@Pc(12) Class68 local12 = this.aClass68Array4[local6];
				local12.anInt1946 = Static1.anIntArray8[local1++];
				local12.anInt1940 = Static1.anIntArray8[local1++];
				local12.anInt1935 = Static1.anIntArray8[local1++];
				local12.anInt1939 = Static1.anIntArray8[local1++];
				local12.anInt1934 = Static1.anIntArray8[local1++];
				local12.anInt1943 = Static1.anIntArray8[local1++];
				local12.anInt1941 = Static1.anIntArray8[local1++];
				local12.anInt1947 = Static1.anIntArray8[local1++];
				local12.anInt1936 = Static1.anIntArray8[local1++];
			}
		}
		if (this.aClass106Array4 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass106Array4.length; local6++) {
			@Pc(83) Class106 local83 = this.aClass106Array4[local6];
			@Pc(85) Class106 local85 = local83;
			if (local83.aClass106_1 != null) {
				local85 = local83.aClass106_1;
			}
			if (local83.aClass128_3 == null) {
				local83.aClass128_3 = arg1.method6887();
			} else {
				local83.aClass128_3.EA(arg1);
			}
			local85.anInt2800 = Static1.anIntArray8[local1++];
			local85.anInt2801 = Static1.anIntArray8[local1++];
			local85.anInt2809 = Static1.anIntArray8[local1++];
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!m;Lclient!cf;I)V")
	@Override
	public void method6773(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class46_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anA1.method160().ka(this, arg0, null, arg2);
			return;
		}
		Static1.anIntArray4[5] = 0;
		this.anA1.method160().ka(this, arg0, Static1.anIntArray4, arg2);
		arg1.anInt1433 = Static1.anIntArray4[0];
		arg1.anInt1435 = Static1.anIntArray4[1];
		arg1.anInt1437 = Static1.anIntArray4[2];
		arg1.anInt1434 = Static1.anIntArray4[3];
		arg1.anInt1436 = Static1.anIntArray4[4];
		arg1.aBoolean109 = Static1.anIntArray4[5] != 0;
	}

	@OriginalMember(owner = "client!ma", name = "pa", descriptor = "(SS)V")
	public native void pa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ma", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "(I)V")
	public native void m(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "()I")
	public native int n();

	@OriginalMember(owner = "client!ma", name = "TA", descriptor = "()I")
	public native int TA();

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "()Z")
	@Override
	public boolean method6784() {
		return true;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ma", name = "ba", descriptor = "()I")
	public native int ba();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "()[Lclient!fr;")
	@Override
	public Class106[] method6767() {
		return this.aClass106Array4;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
	public native void b(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "WA", descriptor = "(Lclient!ma;Lclient!ma;IZZ)V")
	public native void WA(@OriginalArg(0) ma arg0, @OriginalArg(1) ma arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static300.method5316(this);
		}
	}

	@OriginalMember(owner = "client!ma", name = "EA", descriptor = "(Lclient!k;)Lclient!k;")
	public native Class1_Sub2_Sub2 EA(@OriginalArg(0) Class1_Sub2_Sub2 arg0);

	@OriginalMember(owner = "client!ma", name = "va", descriptor = "()I")
	public native int va();

	@OriginalMember(owner = "client!ma", name = "ga", descriptor = "()I")
	public native int ga();

	@OriginalMember(owner = "client!ma", name = "BA", descriptor = "(I[IIIIZI[I)V")
	protected native void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ma", name = "D", descriptor = "(I)V")
	public native void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "X", descriptor = "()V")
	public native void X();

	@OriginalMember(owner = "client!ma", name = "RA", descriptor = "(IILclient!sa;Lclient!sa;III)V")
	public native void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7 arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ma", name = "XA", descriptor = "(Lclient!a;Lclient!c;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void XA(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "(Lclient!a;)V")
	private native void i(@OriginalArg(0) a arg0);

	@OriginalMember(owner = "client!ma", name = "wa", descriptor = "()I")
	public native int wa();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILclient!m;Z)Z")
	@Override
	public boolean method6785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class128 arg2, @OriginalArg(3) boolean arg3) {
		return this.anA1.method160().RA(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ma", name = "OA", descriptor = "(I)V")
	public native void OA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "L", descriptor = "(SS)V")
	public native void L(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ma", name = "I", descriptor = "(I)V")
	public native void I(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!ma", name = "Q", descriptor = "()I")
	public native int Q();

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "()V")
	@Override
	public void method6777() {
	}

	@OriginalMember(owner = "client!ma", name = "ca", descriptor = "(III)V")
	public native void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "(IIII)V")
	protected native void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ma", name = "V", descriptor = "(III)V")
	public native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
