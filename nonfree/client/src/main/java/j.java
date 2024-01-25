import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class j extends Class9 implements Interface9 {

	@OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!j", name = "o", descriptor = "Lclient!da;")
	private final da aDa1;

	@OriginalMember(owner = "client!j", name = "m", descriptor = "Lclient!a;")
	private final a anA2;

	@OriginalMember(owner = "client!j", name = "n", descriptor = "[Lclient!jt;")
	public Class181[] aClass181Array6;

	@OriginalMember(owner = "client!j", name = "p", descriptor = "[Lclient!efa;")
	public Class89[] aClass89Array6;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!da;Lclient!a;Lclient!pf;IIII)V")
	public j(@OriginalArg(0) da arg0, @OriginalArg(1) a arg1, @OriginalArg(2) Class266 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aDa1 = arg0;
		this.anA2 = arg1;
		this.aClass181Array6 = arg2.aClass181Array7;
		this.aClass89Array6 = arg2.aClass89Array7;
		@Pc(24) int local24 = arg2.aClass181Array7 == null ? 0 : arg2.aClass181Array7.length;
		@Pc(33) int local33 = arg2.aClass89Array7 == null ? 0 : arg2.aClass89Array7.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass181Array6[local44].anInt5035;
			local42[local35++] = this.aClass181Array6[local44].anInt5020;
			local42[local35++] = this.aClass181Array6[local44].anInt5018;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass89Array6[local78].anInt2746;
		}
		@Pc(101) int local101 = arg2.aClass253Array1 == null ? 0 : arg2.aClass253Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class253 local116 = arg2.aClass253Array1[local110];
			@Pc(121) Class97 local121 = Static504.method7176(local116.anInt6800);
			local106[local108++] = local116.anInt6798;
			local106[local108++] = local121.anInt3081;
			local106[local108++] = local121.anInt3078;
			local106[local108++] = local121.anInt3082;
			local106[local108++] = local121.anInt3076;
			local106[local108++] = local121.anInt3083;
			local106[local108++] = local121.aBoolean242 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class253 local179 = arg2.aClass253Array1[local173];
			local106[local108++] = local179.anInt6796;
		}
		this.za(this.aDa1, this.anA2, arg2.anInt7023, arg2.anInt7033, arg2.anIntArray581, arg2.anIntArray580, arg2.anIntArray579, arg2.anIntArray584, arg2.aShortArray123, arg2.anInt7038, arg2.aShortArray128, arg2.aShortArray127, arg2.aShortArray121, arg2.aByteArray85, arg2.aByteArray87, arg2.aByteArray86, arg2.aByteArray90, arg2.aShortArray129, arg2.aShortArray124, arg2.anIntArray582, arg2.aByte78, arg2.aShortArray126, arg2.anInt7030, arg2.aByteArray89, arg2.aShortArray122, arg2.aShortArray125, arg2.aShortArray130, arg2.anIntArray586, arg2.anIntArray578, arg2.anIntArray588, arg2.aByteArray88, arg2.aByteArray91, arg2.anIntArray585, arg2.anIntArray583, arg2.anIntArray587, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!da;)V")
	public j(@OriginalArg(0) da arg0) {
		this.aDa1 = arg0;
		this.anA2 = null;
		this.HA(arg0);
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "()V")
	@Override
	public void method4016() {
	}

	@OriginalMember(owner = "client!j", name = "HA", descriptor = "(Lclient!da;)V")
	private native void HA(@OriginalArg(0) da arg0);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method4011(@OriginalArg(0) Class134 arg0) {
		this.method4024(Static82.anIntArray216, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass181Array6 != null) {
			for (local10 = 0; local10 < this.aClass181Array6.length; local10++) {
				@Pc(16) Class181 local16 = this.aClass181Array6[local10];
				local16.anInt5025 = Static82.anIntArray216[local5++];
				local16.anInt5021 = Static82.anIntArray216[local5++];
				local16.anInt5019 = Static82.anIntArray216[local5++];
				local16.anInt5024 = Static82.anIntArray216[local5++];
				local16.anInt5017 = Static82.anIntArray216[local5++];
				local16.anInt5032 = Static82.anIntArray216[local5++];
				local16.anInt5027 = Static82.anIntArray216[local5++];
				local16.anInt5022 = Static82.anIntArray216[local5++];
				local16.anInt5029 = Static82.anIntArray216[local5++];
			}
		}
		if (this.aClass89Array6 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass89Array6.length; local10++) {
			@Pc(87) Class89 local87 = this.aClass89Array6[local10];
			@Pc(89) Class89 local89 = local87;
			if (local87.aClass89_1 != null) {
				local89 = local87.aClass89_1;
			}
			if (local87.aClass134_3 == null) {
				local87.aClass134_3 = arg0.method7825();
			} else {
				local87.aClass134_3.la(arg0);
			}
			local89.anInt2748 = Static82.anIntArray216[local5++];
			local89.anInt2741 = Static82.anIntArray216[local5++];
			local89.anInt2744 = Static82.anIntArray216[local5++];
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method4007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) boolean arg3) {
		return this.aDa1.method1577().a(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!j", name = "Q", descriptor = "()Z")
	protected native boolean Q();

	@OriginalMember(owner = "client!j", name = "UA", descriptor = "(SS)V")
	public native void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!j", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!j", name = "ZA", descriptor = "()I")
	public native int ZA();

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!q;Lclient!ot;II)V")
	@Override
	public void method4004(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class26_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aDa1.method1577().N(this, arg0, null, arg2, 1);
			return;
		}
		Static82.anIntArray218[5] = 0;
		this.aDa1.method1577().N(this, arg0, Static82.anIntArray218, arg2, 1);
		arg1.anInt6866 = Static82.anIntArray218[0];
		arg1.anInt6865 = Static82.anIntArray218[1];
		arg1.anInt6863 = Static82.anIntArray218[2];
		arg1.anInt6862 = Static82.anIntArray218[3];
		arg1.anInt6864 = Static82.anIntArray218[4];
		arg1.aBoolean508 = Static82.anIntArray218[5] != 0;
	}

	@OriginalMember(owner = "client!j", name = "K", descriptor = "()I")
	public native int K();

	@OriginalMember(owner = "client!j", name = "LA", descriptor = "()I")
	public native int LA();

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([ILclient!q;)V")
	private void method4024(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class134 arg1) {
		this.aDa1.method1577().JA(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!j", name = "za", descriptor = "(Lclient!da;Lclient!a;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void za(@OriginalArg(0) da arg0, @OriginalArg(1) a arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!j", name = "ua", descriptor = "(IIII)V")
	protected native void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!j", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!j", name = "L", descriptor = "(Lclient!j;Lclient!j;IZZ)V")
	public native void L(@OriginalArg(0) j arg0, @OriginalArg(1) j arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!j", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	public native void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) Class16 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!j", name = "D", descriptor = "(I)V")
	public native void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "()[Lclient!efa;")
	@Override
	public Class89[] method4015() {
		return this.aClass89Array6;
	}

	@OriginalMember(owner = "client!j", name = "E", descriptor = "(I[IIIIIZ)V")
	protected native void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!j", name = "h", descriptor = "()I")
	public native int h();

	@OriginalMember(owner = "client!j", name = "H", descriptor = "(Z)V")
	public native void H(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!j", name = "AA", descriptor = "(I)V")
	public native void AA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class9 method4006(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.aDa1.method1577().method7062(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "()Z")
	@Override
	public boolean method4018() {
		return true;
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "()[Lclient!jt;")
	@Override
	public Class181[] method4019() {
		return this.aClass181Array6;
	}

	@OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static111.method2327(this);
		}
	}

	@OriginalMember(owner = "client!j", name = "ha", descriptor = "()I")
	public native int ha();

	@OriginalMember(owner = "client!j", name = "l", descriptor = "(III)V")
	public native void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!j", name = "ia", descriptor = "(I)V")
	public native void ia(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	@Override
	public void method4010(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aDa1.method1577().o(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!j", name = "m", descriptor = "(III)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!q;Lclient!ot;I)V")
	@Override
	public void method4023(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class26_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aDa1.method1577().w(this, arg0, null, arg2);
			return;
		}
		Static82.anIntArray218[5] = 0;
		this.aDa1.method1577().w(this, arg0, Static82.anIntArray218, arg2);
		arg1.anInt6866 = Static82.anIntArray218[0];
		arg1.anInt6865 = Static82.anIntArray218[1];
		arg1.anInt6863 = Static82.anIntArray218[2];
		arg1.anInt6862 = Static82.anIntArray218[3];
		arg1.anInt6864 = Static82.anIntArray218[4];
		arg1.aBoolean508 = Static82.anIntArray218[5] != 0;
	}

	@OriginalMember(owner = "client!j", name = "P", descriptor = "()V")
	public native void P();

	@OriginalMember(owner = "client!j", name = "va", descriptor = "(I)V")
	public native void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	public native Class4_Sub7_Sub3 Z(@OriginalArg(0) Class4_Sub7_Sub3 arg0);

	@OriginalMember(owner = "client!j", name = "da", descriptor = "(I[IIIIZI[I)V")
	protected native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!j", name = "DA", descriptor = "()I")
	public native int DA();

	@OriginalMember(owner = "client!j", name = "u", descriptor = "()I")
	public native int u();

	@OriginalMember(owner = "client!j", name = "v", descriptor = "(I)V")
	public native void v(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "ka", descriptor = "(SS)V")
	public native void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!j", name = "F", descriptor = "()I")
	public native int F();

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!j", name = "V", descriptor = "(I)V")
	public native void V(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "I", descriptor = "(I)V")
	public native void I(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "Y", descriptor = "()V")
	protected native void Y();
}
