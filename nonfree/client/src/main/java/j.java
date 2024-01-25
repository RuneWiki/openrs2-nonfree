import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class j extends Class24 implements Interface4 {

	@OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!j", name = "m", descriptor = "Lclient!da;")
	private final da aDa1;

	@OriginalMember(owner = "client!j", name = "n", descriptor = "Lclient!a;")
	private final a anA2;

	@OriginalMember(owner = "client!j", name = "o", descriptor = "[Lclient!bh;")
	public Class33[] aClass33Array4;

	@OriginalMember(owner = "client!j", name = "l", descriptor = "[Lclient!vp;")
	public Class335[] aClass335Array4;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!da;Lclient!a;Lclient!hn;IIII)V")
	public j(@OriginalArg(0) da arg0, @OriginalArg(1) a arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aDa1 = arg0;
		this.anA2 = arg1;
		this.aClass33Array4 = arg2.aClass33Array3;
		this.aClass335Array4 = arg2.aClass335Array3;
		@Pc(24) int local24 = arg2.aClass33Array3 == null ? 0 : arg2.aClass33Array3.length;
		@Pc(33) int local33 = arg2.aClass335Array3 == null ? 0 : arg2.aClass335Array3.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass33Array4[local44].anInt768;
			local42[local35++] = this.aClass33Array4[local44].anInt775;
			local42[local35++] = this.aClass33Array4[local44].anInt774;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass335Array4[local78].anInt9662;
		}
		@Pc(101) int local101 = arg2.aClass143Array1 == null ? 0 : arg2.aClass143Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class143 local116 = arg2.aClass143Array1[local110];
			@Pc(121) Class276 local121 = Static116.method1819(local116.anInt4098);
			local106[local108++] = local116.anInt4099;
			local106[local108++] = local121.anInt7927;
			local106[local108++] = local121.anInt7920;
			local106[local108++] = local121.anInt7928;
			local106[local108++] = local121.anInt7923;
			local106[local108++] = local121.anInt7922;
			local106[local108++] = local121.aBoolean518 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class143 local179 = arg2.aClass143Array1[local173];
			local106[local108++] = local179.anInt4094;
		}
		this.za(this.aDa1, this.anA2, arg2.anInt3857, arg2.anInt3867, arg2.anIntArray326, arg2.anIntArray328, arg2.anIntArray336, arg2.anIntArray329, arg2.aShortArray53, arg2.anInt3853, arg2.aShortArray52, arg2.aShortArray55, arg2.aShortArray60, arg2.aByteArray46, arg2.aByteArray49, arg2.aByteArray48, arg2.aByteArray47, arg2.aShortArray51, arg2.aShortArray58, arg2.anIntArray330, arg2.aByte51, arg2.aShortArray59, arg2.anInt3860, arg2.aByteArray45, arg2.aShortArray56, arg2.aShortArray57, arg2.aShortArray54, arg2.anIntArray331, arg2.anIntArray327, arg2.anIntArray333, arg2.aByteArray51, arg2.aByteArray50, arg2.anIntArray335, arg2.anIntArray334, arg2.anIntArray332, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!da;)V")
	public j(@OriginalArg(0) da arg0) {
		this.aDa1 = arg0;
		this.anA2 = null;
		this.HA(arg0);
	}

	@OriginalMember(owner = "client!j", name = "UA", descriptor = "(SS)V")
	public native void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7388(@OriginalArg(0) Class93 arg0) {
		this.method3624(Static87.anIntArray140, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass33Array4 != null) {
			for (local10 = 0; local10 < this.aClass33Array4.length; local10++) {
				@Pc(16) Class33 local16 = this.aClass33Array4[local10];
				local16.anInt769 = Static87.anIntArray140[local5++];
				local16.anInt782 = Static87.anIntArray140[local5++];
				local16.anInt780 = Static87.anIntArray140[local5++];
				local16.anInt770 = Static87.anIntArray140[local5++];
				local16.anInt776 = Static87.anIntArray140[local5++];
				local16.anInt777 = Static87.anIntArray140[local5++];
				local16.anInt771 = Static87.anIntArray140[local5++];
				local16.anInt773 = Static87.anIntArray140[local5++];
				local16.anInt778 = Static87.anIntArray140[local5++];
			}
		}
		if (this.aClass335Array4 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass335Array4.length; local10++) {
			@Pc(87) Class335 local87 = this.aClass335Array4[local10];
			@Pc(89) Class335 local89 = local87;
			if (local87.aClass335_2 != null) {
				local89 = local87.aClass335_2;
			}
			if (local87.aClass93_9 == null) {
				local87.aClass93_9 = arg0.method7795();
			} else {
				local87.aClass93_9.la(arg0);
			}
			local89.anInt9658 = Static87.anIntArray140[local5++];
			local89.anInt9655 = Static87.anIntArray140[local5++];
			local89.anInt9657 = Static87.anIntArray140[local5++];
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "()Z")
	@Override
	public boolean method7397() {
		return true;
	}

	@OriginalMember(owner = "client!j", name = "va", descriptor = "(I)V")
	public native void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "da", descriptor = "(I[IIIIZI[I)V")
	protected native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!j", name = "K", descriptor = "()I")
	public native int K();

	@OriginalMember(owner = "client!j", name = "ka", descriptor = "(SS)V")
	public native void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!j", name = "HA", descriptor = "(Lclient!da;)V")
	private native void HA(@OriginalArg(0) da arg0);

	@OriginalMember(owner = "client!j", name = "F", descriptor = "()I")
	public native int F();

	@OriginalMember(owner = "client!j", name = "m", descriptor = "(III)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!q;Lclient!rc;II)V")
	@Override
	public void method7392(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class60_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aDa1.method1349().N(this, arg0, null, arg2, 1);
			return;
		}
		Static87.anIntArray138[5] = 0;
		this.aDa1.method1349().N(this, arg0, Static87.anIntArray138, arg2, 1);
		arg1.anInt7808 = Static87.anIntArray138[0];
		arg1.anInt7807 = Static87.anIntArray138[1];
		arg1.anInt7809 = Static87.anIntArray138[2];
		arg1.anInt7810 = Static87.anIntArray138[3];
		arg1.anInt7806 = Static87.anIntArray138[4];
		arg1.aBoolean513 = Static87.anIntArray138[5] != 0;
	}

	@OriginalMember(owner = "client!j", name = "Q", descriptor = "()Z")
	protected native boolean Q();

	@OriginalMember(owner = "client!j", name = "AA", descriptor = "(I)V")
	public native void AA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	public native Class6_Sub5_Sub10 Z(@OriginalArg(0) Class6_Sub5_Sub10 arg0);

	@OriginalMember(owner = "client!j", name = "ZA", descriptor = "()I")
	public native int ZA();

	@OriginalMember(owner = "client!j", name = "I", descriptor = "(I)V")
	public native void I(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "ha", descriptor = "()I")
	public native int ha();

	@OriginalMember(owner = "client!j", name = "h", descriptor = "()I")
	public native int h();

	@OriginalMember(owner = "client!j", name = "LA", descriptor = "()I")
	public native int LA();

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!q;Lclient!rc;I)V")
	@Override
	public void method7393(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class60_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aDa1.method1349().w(this, arg0, null, arg2);
			return;
		}
		Static87.anIntArray138[5] = 0;
		this.aDa1.method1349().w(this, arg0, Static87.anIntArray138, arg2);
		arg1.anInt7808 = Static87.anIntArray138[0];
		arg1.anInt7807 = Static87.anIntArray138[1];
		arg1.anInt7809 = Static87.anIntArray138[2];
		arg1.anInt7810 = Static87.anIntArray138[3];
		arg1.anInt7806 = Static87.anIntArray138[4];
		arg1.aBoolean513 = Static87.anIntArray138[5] != 0;
	}

	@OriginalMember(owner = "client!j", name = "P", descriptor = "()V")
	public native void P();

	@OriginalMember(owner = "client!j", name = "u", descriptor = "()I")
	public native int u();

	@OriginalMember(owner = "client!j", name = "V", descriptor = "(I)V")
	public native void V(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "ua", descriptor = "(IIII)V")
	protected native void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!j", name = "DA", descriptor = "()I")
	public native int DA();

	@OriginalMember(owner = "client!j", name = "c", descriptor = "()V")
	@Override
	public void method7401() {
	}

	@OriginalMember(owner = "client!j", name = "L", descriptor = "(Lclient!j;Lclient!j;IZZ)V")
	public native void L(@OriginalArg(0) j arg0, @OriginalArg(1) j arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "()[Lclient!bh;")
	@Override
	public Class33[] method7383() {
		return this.aClass33Array4;
	}

	@OriginalMember(owner = "client!j", name = "l", descriptor = "(III)V")
	public native void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!j", name = "Y", descriptor = "()V")
	protected native void Y();

	@OriginalMember(owner = "client!j", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!j", name = "H", descriptor = "(Z)V")
	public native void H(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	@Override
	public void method7389(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aDa1.method1349().o(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static489.method6851(this);
		}
	}

	@OriginalMember(owner = "client!j", name = "ia", descriptor = "(I)V")
	public native void ia(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "E", descriptor = "(I[IIIIIZ)V")
	protected native void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class24 method7398(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.aDa1.method1349().method6848(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!j", name = "za", descriptor = "(Lclient!da;Lclient!a;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void za(@OriginalArg(0) da arg0, @OriginalArg(1) a arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!j", name = "d", descriptor = "()[Lclient!vp;")
	@Override
	public Class335[] method7402() {
		return this.aClass335Array4;
	}

	@OriginalMember(owner = "client!j", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	public native void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class46 arg2, @OriginalArg(3) Class46 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!j", name = "D", descriptor = "(I)V")
	public native void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "v", descriptor = "(I)V")
	public native void v(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([ILclient!q;)V")
	private void method3624(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class93 arg1) {
		this.aDa1.method1349().JA(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!j", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) boolean arg3) {
		return this.aDa1.method1349().a(this, arg0, arg1, arg2, arg3);
	}
}
