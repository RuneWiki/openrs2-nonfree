import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class j extends Class22 implements Interface9 {

	@OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!j", name = "p", descriptor = "Lclient!da;")
	private final da aDa1;

	@OriginalMember(owner = "client!j", name = "r", descriptor = "Lclient!a;")
	private final a anA2;

	@OriginalMember(owner = "client!j", name = "q", descriptor = "[Lclient!jq;")
	public Class163[] aClass163Array5;

	@OriginalMember(owner = "client!j", name = "o", descriptor = "[Lclient!pp;")
	public Class250[] aClass250Array5;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!da;Lclient!a;Lclient!rf;IIII)V")
	public j(@OriginalArg(0) da arg0, @OriginalArg(1) a arg1, @OriginalArg(2) Class274 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aDa1 = arg0;
		this.anA2 = arg1;
		this.aClass163Array5 = arg2.aClass163Array7;
		this.aClass250Array5 = arg2.aClass250Array7;
		@Pc(24) int local24 = arg2.aClass163Array7 == null ? 0 : arg2.aClass163Array7.length;
		@Pc(33) int local33 = arg2.aClass250Array7 == null ? 0 : arg2.aClass250Array7.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass163Array5[local44].anInt4049;
			local42[local35++] = this.aClass163Array5[local44].anInt4044;
			local42[local35++] = this.aClass163Array5[local44].anInt4045;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass250Array5[local78].anInt6989;
		}
		@Pc(101) int local101 = arg2.aClass55Array1 == null ? 0 : arg2.aClass55Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class55 local116 = arg2.aClass55Array1[local110];
			@Pc(121) Class26 local121 = Static459.method6466(local116.anInt1150);
			local106[local108++] = local116.anInt1155;
			local106[local108++] = local121.anInt544;
			local106[local108++] = local121.anInt545;
			local106[local108++] = local121.anInt550;
			local106[local108++] = local121.anInt543;
			local106[local108++] = local121.anInt542;
			local106[local108++] = local121.aBoolean17 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class55 local179 = arg2.aClass55Array1[local173];
			local106[local108++] = local179.anInt1148;
		}
		this.za(this.aDa1, this.anA2, arg2.anInt7672, arg2.anInt7662, arg2.anIntArray612, arg2.anIntArray603, arg2.anIntArray605, arg2.anIntArray608, arg2.aShortArray130, arg2.anInt7656, arg2.aShortArray122, arg2.aShortArray126, arg2.aShortArray125, arg2.aByteArray97, arg2.aByteArray100, arg2.aByteArray101, arg2.aByteArray102, arg2.aShortArray127, arg2.aShortArray131, arg2.anIntArray609, arg2.aByte85, arg2.aShortArray128, arg2.anInt7653, arg2.aByteArray99, arg2.aShortArray123, arg2.aShortArray129, arg2.aShortArray124, arg2.anIntArray610, arg2.anIntArray611, arg2.anIntArray606, arg2.aByteArray98, arg2.aByteArray103, arg2.anIntArray607, arg2.anIntArray613, arg2.anIntArray604, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!da;)V")
	public j(@OriginalArg(0) da arg0) {
		this.aDa1 = arg0;
		this.anA2 = null;
		this.HA(arg0);
	}

	@OriginalMember(owner = "client!j", name = "ZA", descriptor = "()I")
	public native int ZA();

	@OriginalMember(owner = "client!j", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	public native void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class60 arg2, @OriginalArg(3) Class60 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!j", name = "Y", descriptor = "()V")
	protected native void Y();

	@OriginalMember(owner = "client!j", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!j", name = "Q", descriptor = "()Z")
	protected native boolean Q();

	@OriginalMember(owner = "client!j", name = "D", descriptor = "(I)V")
	public native void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "za", descriptor = "(Lclient!da;Lclient!a;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void za(@OriginalArg(0) da arg0, @OriginalArg(1) a arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!j", name = "HA", descriptor = "(Lclient!da;)V")
	private native void HA(@OriginalArg(0) da arg0);

	@OriginalMember(owner = "client!j", name = "ha", descriptor = "()I")
	public native int ha();

	@OriginalMember(owner = "client!j", name = "a", descriptor = "()[Lclient!pp;")
	@Override
	public Class250[] method4692() {
		return this.aClass250Array5;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	@Override
	public void method4693(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aDa1.method1141().o(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!j", name = "va", descriptor = "(I)V")
	public native void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "l", descriptor = "(III)V")
	public native void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!j", name = "UA", descriptor = "(SS)V")
	public native void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!j", name = "v", descriptor = "(I)V")
	public native void v(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([ILclient!q;)V")
	private void method3288(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class34 arg1) {
		this.aDa1.method1141().JA(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "()[Lclient!jq;")
	@Override
	public Class163[] method4708() {
		return this.aClass163Array5;
	}

	@OriginalMember(owner = "client!j", name = "LA", descriptor = "()I")
	public native int LA();

	@OriginalMember(owner = "client!j", name = "I", descriptor = "(I)V")
	public native void I(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "P", descriptor = "()V")
	public native void P();

	@OriginalMember(owner = "client!j", name = "L", descriptor = "(Lclient!j;Lclient!j;IZZ)V")
	public native void L(@OriginalArg(0) j arg0, @OriginalArg(1) j arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class22 method4699(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.aDa1.method1141().method6663(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!j", name = "H", descriptor = "(Z)V")
	public native void H(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!j", name = "d", descriptor = "()Z")
	@Override
	public boolean method4709() {
		return true;
	}

	@OriginalMember(owner = "client!j", name = "AA", descriptor = "(I)V")
	public native void AA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "E", descriptor = "(I[IIIIIZ)V")
	protected native void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!j", name = "ka", descriptor = "(SS)V")
	public native void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!j", name = "u", descriptor = "()I")
	public native int u();

	@OriginalMember(owner = "client!j", name = "F", descriptor = "()I")
	public native int F();

	@OriginalMember(owner = "client!j", name = "V", descriptor = "(I)V")
	public native void V(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!j", name = "h", descriptor = "()I")
	public native int h();

	@OriginalMember(owner = "client!j", name = "DA", descriptor = "()I")
	public native int DA();

	@OriginalMember(owner = "client!j", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	public native Class6_Sub1_Sub12 Z(@OriginalArg(0) Class6_Sub1_Sub12 arg0);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!q;Lclient!qn;II)V")
	@Override
	public void method4702(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class102_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aDa1.method1141().N(this, arg0, null, arg2, 1);
			return;
		}
		Static76.anIntArray92[5] = 0;
		this.aDa1.method1141().N(this, arg0, Static76.anIntArray92, arg2, 1);
		arg1.anInt7450 = Static76.anIntArray92[0];
		arg1.anInt7449 = Static76.anIntArray92[1];
		arg1.anInt7452 = Static76.anIntArray92[2];
		arg1.anInt7448 = Static76.anIntArray92[3];
		arg1.anInt7451 = Static76.anIntArray92[4];
		arg1.aBoolean515 = Static76.anIntArray92[5] != 0;
	}

	@OriginalMember(owner = "client!j", name = "ia", descriptor = "(I)V")
	public native void ia(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "m", descriptor = "(III)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static211.method3132(this);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!q;Lclient!qn;I)V")
	@Override
	public void method4689(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class102_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aDa1.method1141().w(this, arg0, null, arg2);
			return;
		}
		Static76.anIntArray92[5] = 0;
		this.aDa1.method1141().w(this, arg0, Static76.anIntArray92, arg2);
		arg1.anInt7450 = Static76.anIntArray92[0];
		arg1.anInt7449 = Static76.anIntArray92[1];
		arg1.anInt7452 = Static76.anIntArray92[2];
		arg1.anInt7448 = Static76.anIntArray92[3];
		arg1.anInt7451 = Static76.anIntArray92[4];
		arg1.aBoolean515 = Static76.anIntArray92[5] != 0;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method4698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) boolean arg3) {
		return this.aDa1.method1141().a(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!j", name = "ua", descriptor = "(IIII)V")
	protected native void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!j", name = "K", descriptor = "()I")
	public native int K();

	@OriginalMember(owner = "client!j", name = "da", descriptor = "(I[IIIIZI[I)V")
	protected native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!j", name = "b", descriptor = "()V")
	@Override
	public void method4706() {
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method4701(@OriginalArg(0) Class34 arg0) {
		this.method3288(Static76.anIntArray91, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass163Array5 != null) {
			for (local10 = 0; local10 < this.aClass163Array5.length; local10++) {
				@Pc(16) Class163 local16 = this.aClass163Array5[local10];
				local16.anInt4051 = Static76.anIntArray91[local5++];
				local16.anInt4038 = Static76.anIntArray91[local5++];
				local16.anInt4047 = Static76.anIntArray91[local5++];
				local16.anInt4039 = Static76.anIntArray91[local5++];
				local16.anInt4052 = Static76.anIntArray91[local5++];
				local16.anInt4041 = Static76.anIntArray91[local5++];
				local16.anInt4043 = Static76.anIntArray91[local5++];
				local16.anInt4042 = Static76.anIntArray91[local5++];
				local16.anInt4048 = Static76.anIntArray91[local5++];
			}
		}
		if (this.aClass250Array5 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass250Array5.length; local10++) {
			@Pc(87) Class250 local87 = this.aClass250Array5[local10];
			@Pc(89) Class250 local89 = local87;
			if (local87.aClass250_2 != null) {
				local89 = local87.aClass250_2;
			}
			if (local87.aClass34_10 == null) {
				local87.aClass34_10 = arg0.method7612();
			} else {
				local87.aClass34_10.la(arg0);
			}
			local89.anInt6992 = Static76.anIntArray91[local5++];
			local89.anInt6988 = Static76.anIntArray91[local5++];
			local89.anInt6987 = Static76.anIntArray91[local5++];
		}
	}
}
