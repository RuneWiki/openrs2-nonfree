import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class j extends Class21 implements Interface5 {

	@OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!j", name = "s", descriptor = "Lclient!da;")
	private final da aDa1;

	@OriginalMember(owner = "client!j", name = "q", descriptor = "Lclient!a;")
	private final a anA2;

	@OriginalMember(owner = "client!j", name = "p", descriptor = "[Lclient!gi;")
	public Class121[] aClass121Array3;

	@OriginalMember(owner = "client!j", name = "r", descriptor = "[Lclient!rea;")
	public Class280[] aClass280Array3;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!da;Lclient!a;Lclient!fca;IIII)V")
	public j(@OriginalArg(0) da arg0, @OriginalArg(1) a arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aDa1 = arg0;
		this.anA2 = arg1;
		this.aClass121Array3 = arg2.aClass121Array2;
		this.aClass280Array3 = arg2.aClass280Array2;
		@Pc(24) int local24 = arg2.aClass121Array2 == null ? 0 : arg2.aClass121Array2.length;
		@Pc(33) int local33 = arg2.aClass280Array2 == null ? 0 : arg2.aClass280Array2.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass121Array3[local44].anInt3496;
			local42[local35++] = this.aClass121Array3[local44].anInt3505;
			local42[local35++] = this.aClass121Array3[local44].anInt3508;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass280Array3[local78].anInt8557;
		}
		@Pc(101) int local101 = arg2.aClass275Array1 == null ? 0 : arg2.aClass275Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class275 local116 = arg2.aClass275Array1[local110];
			@Pc(121) Class198 local121 = Static53.method1292(local116.anInt8402);
			local106[local108++] = local116.anInt8401;
			local106[local108++] = local121.anInt6034;
			local106[local108++] = local121.anInt6039;
			local106[local108++] = local121.anInt6035;
			local106[local108++] = local121.anInt6036;
			local106[local108++] = local121.anInt6037;
			local106[local108++] = local121.aBoolean514 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class275 local179 = arg2.aClass275Array1[local173];
			local106[local108++] = local179.anInt8399;
		}
		this.za(this.aDa1, this.anA2, arg2.anInt3170, arg2.anInt3172, arg2.anIntArray202, arg2.anIntArray198, arg2.anIntArray200, arg2.anIntArray193, arg2.aShortArray51, arg2.anInt3177, arg2.aShortArray48, arg2.aShortArray53, arg2.aShortArray49, arg2.aByteArray47, arg2.aByteArray41, arg2.aByteArray43, arg2.aByteArray42, arg2.aShortArray56, arg2.aShortArray52, arg2.anIntArray203, arg2.aByte28, arg2.aShortArray55, arg2.anInt3183, arg2.aByteArray44, arg2.aShortArray50, arg2.aShortArray57, arg2.aShortArray54, arg2.anIntArray197, arg2.anIntArray194, arg2.anIntArray201, arg2.aByteArray46, arg2.aByteArray45, arg2.anIntArray199, arg2.anIntArray196, arg2.anIntArray195, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!da;)V")
	public j(@OriginalArg(0) da arg0) {
		this.aDa1 = arg0;
		this.anA2 = null;
		this.HA(arg0);
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "()[Lclient!rea;")
	@Override
	public Class280[] method7135() {
		return this.aClass280Array3;
	}

	@OriginalMember(owner = "client!j", name = "ia", descriptor = "(I)V")
	public native void ia(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7143(@OriginalArg(0) Class255 arg0) {
		this.method4003(Static80.anIntArray87, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass121Array3 != null) {
			for (local10 = 0; local10 < this.aClass121Array3.length; local10++) {
				@Pc(16) Class121 local16 = this.aClass121Array3[local10];
				local16.anInt3501 = Static80.anIntArray87[local5++];
				local16.anInt3503 = Static80.anIntArray87[local5++];
				local16.anInt3497 = Static80.anIntArray87[local5++];
				local16.anInt3511 = Static80.anIntArray87[local5++];
				local16.anInt3509 = Static80.anIntArray87[local5++];
				local16.anInt3506 = Static80.anIntArray87[local5++];
				local16.anInt3498 = Static80.anIntArray87[local5++];
				local16.anInt3502 = Static80.anIntArray87[local5++];
				local16.anInt3499 = Static80.anIntArray87[local5++];
			}
		}
		if (this.aClass280Array3 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass280Array3.length; local10++) {
			@Pc(87) Class280 local87 = this.aClass280Array3[local10];
			@Pc(89) Class280 local89 = local87;
			if (local87.aClass280_2 != null) {
				local89 = local87.aClass280_2;
			}
			if (local87.aClass255_7 == null) {
				local87.aClass255_7 = arg0.method8170();
			} else {
				local87.aClass255_7.la(arg0);
			}
			local89.anInt8550 = Static80.anIntArray87[local5++];
			local89.anInt8552 = Static80.anIntArray87[local5++];
			local89.anInt8555 = Static80.anIntArray87[local5++];
		}
	}

	@OriginalMember(owner = "client!j", name = "l", descriptor = "(III)V")
	public native void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!j", name = "V", descriptor = "(I)V")
	public native void V(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static328.method5683(this);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class255 arg2, @OriginalArg(3) boolean arg3) {
		return this.aDa1.method1869().a(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!j", name = "D", descriptor = "(I)V")
	public native void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "ha", descriptor = "()I")
	public native int ha();

	@OriginalMember(owner = "client!j", name = "F", descriptor = "()I")
	public native int F();

	@OriginalMember(owner = "client!j", name = "za", descriptor = "(Lclient!da;Lclient!a;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void za(@OriginalArg(0) da arg0, @OriginalArg(1) a arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!j", name = "I", descriptor = "(I)V")
	public native void I(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!q;Lclient!ht;I)V")
	@Override
	public void method7145(@OriginalArg(0) Class255 arg0, @OriginalArg(1) Class55_Sub3 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aDa1.method1869().w(this, arg0, null, arg2);
			return;
		}
		Static80.anIntArray90[5] = 0;
		this.aDa1.method1869().w(this, arg0, Static80.anIntArray90, arg2);
		arg1.anInt3936 = Static80.anIntArray90[0];
		arg1.anInt3937 = Static80.anIntArray90[1];
		arg1.anInt3938 = Static80.anIntArray90[2];
		arg1.anInt3935 = Static80.anIntArray90[3];
		arg1.anInt3934 = Static80.anIntArray90[4];
		arg1.aBoolean304 = Static80.anIntArray90[5] != 0;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class21 method7131(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.aDa1.method1869().method7470(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!j", name = "v", descriptor = "(I)V")
	public native void v(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "u", descriptor = "()I")
	public native int u();

	@OriginalMember(owner = "client!j", name = "E", descriptor = "(I[IIIIIZ)V")
	protected native void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!j", name = "ua", descriptor = "(IIII)V")
	protected native void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	@Override
	public void method7147(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aDa1.method1869().o(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!j", name = "UA", descriptor = "(SS)V")
	public native void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!j", name = "HA", descriptor = "(Lclient!da;)V")
	private native void HA(@OriginalArg(0) da arg0);

	@OriginalMember(owner = "client!j", name = "va", descriptor = "(I)V")
	public native void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "()Z")
	@Override
	public boolean method7134() {
		return true;
	}

	@OriginalMember(owner = "client!j", name = "AA", descriptor = "(I)V")
	public native void AA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([ILclient!q;)V")
	private void method4003(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class255 arg1) {
		this.aDa1.method1869().JA(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "()V")
	@Override
	public void method7142() {
	}

	@OriginalMember(owner = "client!j", name = "LA", descriptor = "()I")
	public native int LA();

	@OriginalMember(owner = "client!j", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!j", name = "P", descriptor = "()V")
	public native void P();

	@OriginalMember(owner = "client!j", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!j", name = "L", descriptor = "(Lclient!j;Lclient!j;IZZ)V")
	public native void L(@OriginalArg(0) j arg0, @OriginalArg(1) j arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!j", name = "da", descriptor = "(I[IIIIZI[I)V")
	protected native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!j", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	public native void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) Class4 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!j", name = "K", descriptor = "()I")
	public native int K();

	@OriginalMember(owner = "client!j", name = "Q", descriptor = "()Z")
	protected native boolean Q();

	@OriginalMember(owner = "client!j", name = "ka", descriptor = "(SS)V")
	public native void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!j", name = "m", descriptor = "(III)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!j", name = "ZA", descriptor = "()I")
	public native int ZA();

	@OriginalMember(owner = "client!j", name = "H", descriptor = "(Z)V")
	public native void H(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!q;Lclient!ht;II)V")
	@Override
	public void method7133(@OriginalArg(0) Class255 arg0, @OriginalArg(1) Class55_Sub3 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aDa1.method1869().N(this, arg0, null, arg2, 1);
			return;
		}
		Static80.anIntArray90[5] = 0;
		this.aDa1.method1869().N(this, arg0, Static80.anIntArray90, arg2, 1);
		arg1.anInt3936 = Static80.anIntArray90[0];
		arg1.anInt3937 = Static80.anIntArray90[1];
		arg1.anInt3938 = Static80.anIntArray90[2];
		arg1.anInt3935 = Static80.anIntArray90[3];
		arg1.anInt3934 = Static80.anIntArray90[4];
		arg1.aBoolean304 = Static80.anIntArray90[5] != 0;
	}

	@OriginalMember(owner = "client!j", name = "Y", descriptor = "()V")
	protected native void Y();

	@OriginalMember(owner = "client!j", name = "DA", descriptor = "()I")
	public native int DA();

	@OriginalMember(owner = "client!j", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	public native Class3_Sub4_Sub2 Z(@OriginalArg(0) Class3_Sub4_Sub2 arg0);

	@OriginalMember(owner = "client!j", name = "c", descriptor = "()[Lclient!gi;")
	@Override
	public Class121[] method7138() {
		return this.aClass121Array3;
	}

	@OriginalMember(owner = "client!j", name = "h", descriptor = "()I")
	public native int h();
}
