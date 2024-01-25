import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class ma extends Class145 implements Interface11 {

	@OriginalMember(owner = "client!ma", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "Lclient!a;")
	private final a anA1;

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "Lclient!c;")
	private final c aC2;

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "[Lclient!kca;")
	public Class161[] aClass161Array6;

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "[Lclient!fi;")
	public Class93[] aClass93Array6;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!a;Lclient!c;Lclient!fp;IIII)V")
	public ma(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anA1 = arg0;
		this.aC2 = arg1;
		this.aClass161Array6 = arg2.aClass161Array1;
		this.aClass93Array6 = arg2.aClass93Array1;
		@Pc(24) int local24 = arg2.aClass161Array1 == null ? 0 : arg2.aClass161Array1.length;
		@Pc(33) int local33 = arg2.aClass93Array1 == null ? 0 : arg2.aClass93Array1.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass161Array6[local44].anInt4842;
			local42[local35++] = this.aClass161Array6[local44].anInt4841;
			local42[local35++] = this.aClass161Array6[local44].anInt4847;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass93Array6[local78].anInt2654;
		}
		@Pc(101) int local101 = arg2.aClass208Array1 == null ? 0 : arg2.aClass208Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class208 local116 = arg2.aClass208Array1[local110];
			@Pc(121) Class125 local121 = Static177.method2903(local116.anInt5964);
			local106[local108++] = local116.anInt5962;
			local106[local108++] = local121.anInt3349;
			local106[local108++] = local121.anInt3354;
			local106[local108++] = local121.anInt3353;
			local106[local108++] = local121.anInt3350;
			local106[local108++] = local121.anInt3356;
			local106[local108++] = local121.aBoolean230 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class208 local179 = arg2.aClass208Array1[local173];
			local106[local108++] = local179.anInt5959;
		}
		this.XA(this.anA1, this.aC2, arg2.anInt2729, arg2.anInt2715, arg2.anIntArray261, arg2.anIntArray264, arg2.anIntArray265, arg2.anIntArray259, arg2.aShortArray43, arg2.anInt2727, arg2.aShortArray45, arg2.aShortArray42, arg2.aShortArray40, arg2.aByteArray39, arg2.aByteArray38, arg2.aByteArray33, arg2.aByteArray36, arg2.aShortArray39, arg2.aShortArray47, arg2.anIntArray258, arg2.aByte44, arg2.aShortArray41, arg2.anInt2710, arg2.aByteArray37, arg2.aShortArray38, arg2.aShortArray46, arg2.aShortArray44, arg2.anIntArray266, arg2.anIntArray267, arg2.anIntArray260, arg2.aByteArray34, arg2.aByteArray35, arg2.anIntArray262, arg2.anIntArray268, arg2.anIntArray263, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!a;)V")
	public ma(@OriginalArg(0) a arg0) {
		this.anA1 = arg0;
		this.aC2 = null;
		this.i(arg0);
	}

	@OriginalMember(owner = "client!ma", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!ma", name = "MA", descriptor = "()V")
	protected native void MA();

	@OriginalMember(owner = "client!ma", name = "OA", descriptor = "(I)V")
	public native void OA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "EA", descriptor = "(Lclient!k;)Lclient!k;")
	public native Class1_Sub1_Sub9 EA(@OriginalArg(0) Class1_Sub1_Sub9 arg0);

	@OriginalMember(owner = "client!ma", name = "wa", descriptor = "()I")
	public native int wa();

	@OriginalMember(owner = "client!ma", name = "ba", descriptor = "()I")
	public native int ba();

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "()Z")
	@Override
	public boolean method6670() {
		return true;
	}

	@OriginalMember(owner = "client!ma", name = "ca", descriptor = "(III)V")
	public native void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ma", name = "pa", descriptor = "(SS)V")
	public native void pa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ma", name = "L", descriptor = "(SS)V")
	public native void L(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILclient!m;Z)Z")
	@Override
	public boolean method6683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) boolean arg3) {
		return this.anA1.method159().RA(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ma", name = "V", descriptor = "(III)V")
	public native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ma", name = "X", descriptor = "()V")
	public native void X();

	@OriginalMember(owner = "client!ma", name = "WA", descriptor = "(Lclient!ma;Lclient!ma;IZZ)V")
	public native void WA(@OriginalArg(0) ma arg0, @OriginalArg(1) ma arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ma", name = "XA", descriptor = "(Lclient!a;Lclient!c;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void XA(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!ma", name = "D", descriptor = "(I)V")
	public native void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "ea", descriptor = "(I[IIIIIZ)V")
	protected native void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ma", name = "NA", descriptor = "(Z)V")
	public native void NA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!r;IIIZ)V")
	@Override
	public void method6674(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anA1.method159().PA(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ma", name = "TA", descriptor = "()I")
	public native int TA();

	@OriginalMember(owner = "client!ma", name = "sa", descriptor = "()Z")
	protected native boolean sa();

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "()I")
	public native int n();

	@OriginalMember(owner = "client!ma", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static79.method1341(this);
		}
	}

	@OriginalMember(owner = "client!ma", name = "I", descriptor = "(I)V")
	public native void I(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "()[Lclient!kca;")
	@Override
	public Class161[] method6677() {
		return this.aClass161Array6;
	}

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "(I)V")
	public native void q(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "(I)V")
	public native void g(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
	public native void b(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BIZ)Lclient!r;")
	@Override
	public Class145 method6672(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anA1.method159().method6991(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ma", name = "va", descriptor = "()I")
	public native int va();

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "()[Lclient!fi;")
	@Override
	public Class93[] method6684() {
		return this.aClass93Array6;
	}

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "(IIII)V")
	protected native void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ma", name = "BA", descriptor = "(I[IIIIZI[I)V")
	protected native void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ma", name = "ga", descriptor = "()I")
	public native int ga();

	@OriginalMember(owner = "client!ma", name = "RA", descriptor = "(IILclient!sa;Lclient!sa;III)V")
	public native void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) Class205 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "(I)V")
	public native void m(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!m;)V")
	public void method4697(@OriginalArg(0) int arg0, @OriginalArg(1) Class118 arg1) {
		@Pc(1) int local1 = arg0;
		@Pc(6) int local6;
		if (this.aClass161Array6 != null) {
			for (local6 = 0; local6 < this.aClass161Array6.length; local6++) {
				@Pc(12) Class161 local12 = this.aClass161Array6[local6];
				local12.anInt4838 = Static1.anIntArray4[local1++];
				local12.anInt4848 = Static1.anIntArray4[local1++];
				local12.anInt4843 = Static1.anIntArray4[local1++];
				local12.anInt4849 = Static1.anIntArray4[local1++];
				local12.anInt4846 = Static1.anIntArray4[local1++];
				local12.anInt4850 = Static1.anIntArray4[local1++];
				local12.anInt4839 = Static1.anIntArray4[local1++];
				local12.anInt4845 = Static1.anIntArray4[local1++];
				local12.anInt4840 = Static1.anIntArray4[local1++];
			}
		}
		if (this.aClass93Array6 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass93Array6.length; local6++) {
			@Pc(83) Class93 local83 = this.aClass93Array6[local6];
			@Pc(85) Class93 local85 = local83;
			if (local83.aClass93_1 != null) {
				local85 = local83.aClass93_1;
			}
			if (local83.aClass118_4 == null) {
				local83.aClass118_4 = arg1.method6964();
			} else {
				local83.aClass118_4.EA(arg1);
			}
			local85.anInt2652 = Static1.anIntArray4[local1++];
			local85.anInt2655 = Static1.anIntArray4[local1++];
			local85.anInt2651 = Static1.anIntArray4[local1++];
		}
	}

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "(Lclient!a;)V")
	private native void i(@OriginalArg(0) a arg0);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!m;Lclient!eca;I)V")
	@Override
	public void method6686(@OriginalArg(0) Class118 arg0, @OriginalArg(1) Class72_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anA1.method159().ka(this, arg0, null, arg2);
			return;
		}
		Static1.anIntArray6[5] = 0;
		this.anA1.method159().ka(this, arg0, Static1.anIntArray6, arg2);
		arg1.anInt2130 = Static1.anIntArray6[0];
		arg1.anInt2131 = Static1.anIntArray6[1];
		arg1.anInt2132 = Static1.anIntArray6[2];
		arg1.anInt2133 = Static1.anIntArray6[3];
		arg1.anInt2129 = Static1.anIntArray6[4];
		arg1.aBoolean129 = Static1.anIntArray6[5] != 0;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
	@Override
	public void method6668() {
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!m;Lclient!eca;II)V")
	@Override
	public void method6676(@OriginalArg(0) Class118 arg0, @OriginalArg(1) Class72_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anA1.method159().m(this, arg0, null, arg2, 1);
			return;
		}
		Static1.anIntArray6[5] = 0;
		this.anA1.method159().m(this, arg0, Static1.anIntArray6, arg2, 1);
		arg1.anInt2130 = Static1.anIntArray6[0];
		arg1.anInt2131 = Static1.anIntArray6[1];
		arg1.anInt2132 = Static1.anIntArray6[2];
		arg1.anInt2133 = Static1.anIntArray6[3];
		arg1.anInt2129 = Static1.anIntArray6[4];
		arg1.aBoolean129 = Static1.anIntArray6[5] != 0;
	}

	@OriginalMember(owner = "client!ma", name = "Q", descriptor = "()I")
	public native int Q();

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "()I")
	public native int e();
}
