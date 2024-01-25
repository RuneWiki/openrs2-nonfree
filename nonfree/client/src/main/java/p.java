import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class p extends Class37 implements Interface4 {

	@OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!p", name = "o", descriptor = "Lclient!h;")
	private final h aH3;

	@OriginalMember(owner = "client!p", name = "n", descriptor = "Lclient!ba;")
	private final ba aBa2;

	@OriginalMember(owner = "client!p", name = "m", descriptor = "[Lclient!qr;")
	public Class203[] aClass203Array3;

	@OriginalMember(owner = "client!p", name = "l", descriptor = "[Lclient!wq;")
	public Class265[] aClass265Array3;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!h;Lclient!ba;Lclient!lo;IIII)V")
	public p(@OriginalArg(0) h arg0, @OriginalArg(1) ba arg1, @OriginalArg(2) Class155 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aH3 = arg0;
		this.aBa2 = arg1;
		this.aClass203Array3 = arg2.aClass203Array2;
		this.aClass265Array3 = arg2.aClass265Array2;
		@Pc(24) int local24 = arg2.aClass203Array2 == null ? 0 : arg2.aClass203Array2.length;
		@Pc(33) int local33 = arg2.aClass265Array2 == null ? 0 : arg2.aClass265Array2.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass203Array3[local44].anInt6042;
			local42[local35++] = this.aClass203Array3[local44].anInt6043;
			local42[local35++] = this.aClass203Array3[local44].anInt6048;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass265Array3[local78].anInt7759;
		}
		@Pc(101) int local101 = arg2.aClass111Array1 == null ? 0 : arg2.aClass111Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class111 local116 = arg2.aClass111Array1[local110];
			@Pc(121) Class91 local121 = Static38.method500(local116.anInt2669);
			local106[local108++] = local116.anInt2666;
			local106[local108++] = local121.anInt2201;
			local106[local108++] = local121.anInt2200;
			local106[local108++] = local121.anInt2195;
			local106[local108++] = local121.anInt2196;
			local106[local108++] = local121.anInt2202;
			local106[local108++] = local121.aBoolean174 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class111 local179 = arg2.aClass111Array1[local173];
			local106[local108++] = local179.anInt2665;
		}
		this.Y(this.aH3, this.aBa2, arg2.anInt4068, arg2.anInt4081, arg2.anIntArray323, arg2.anIntArray324, arg2.anIntArray327, arg2.anIntArray325, arg2.aShortArray68, arg2.anInt4066, arg2.aShortArray63, arg2.aShortArray61, arg2.aShortArray67, arg2.aByteArray47, arg2.aByteArray43, arg2.aByteArray45, arg2.aByteArray44, arg2.aShortArray60, arg2.aShortArray69, arg2.anIntArray328, arg2.aByte58, arg2.aShortArray59, arg2.anInt4079, arg2.aByteArray46, arg2.aShortArray64, arg2.aShortArray62, arg2.aShortArray66, arg2.anIntArray319, arg2.anIntArray326, arg2.anIntArray317, arg2.aByteArray48, arg2.aByteArray42, arg2.anIntArray316, arg2.anIntArray318, arg2.anIntArray321, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!h;)V")
	public p(@OriginalArg(0) h arg0) {
		this.aH3 = arg0;
		this.aBa2 = null;
		this.BA(arg0);
	}

	@OriginalMember(owner = "client!p", name = "ua", descriptor = "(Lclient!j;)Lclient!j;")
	public native Class1_Sub1_Sub3 ua(@OriginalArg(0) Class1_Sub1_Sub3 arg0);

	@OriginalMember(owner = "client!p", name = "FA", descriptor = "()Z")
	protected native boolean FA();

	@OriginalMember(owner = "client!p", name = "YA", descriptor = "(SS)V")
	public native void YA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!p", name = "ia", descriptor = "(I)V")
	public native void ia(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "E", descriptor = "()I")
	public native int E();

	@OriginalMember(owner = "client!p", name = "X", descriptor = "()I")
	public native int X();

	@OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static227.method3281(this);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!ia;Lclient!sf;II)V")
	@Override
	public void method4163(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class36_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aH3.method2252().d(this, arg0, null, arg2, 1);
			return;
		}
		Static137.anIntArray198[5] = 0;
		this.aH3.method2252().d(this, arg0, Static137.anIntArray198, arg2, 1);
		arg1.anInt6562 = Static137.anIntArray198[0];
		arg1.anInt6561 = Static137.anIntArray198[1];
		arg1.anInt6564 = Static137.anIntArray198[2];
		arg1.anInt6563 = Static137.anIntArray198[3];
		arg1.anInt6565 = Static137.anIntArray198[4];
		arg1.aBoolean534 = Static137.anIntArray198[5] != 0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IILclient!ia;Z)Z")
	@Override
	public boolean method4166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class43 arg2, @OriginalArg(3) boolean arg3) {
		return this.aH3.method2252().ua(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!ia;Lclient!sf;I)V")
	@Override
	public void method4167(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class36_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aH3.method2252().fa(this, arg0, null, arg2);
			return;
		}
		Static137.anIntArray198[5] = 0;
		this.aH3.method2252().fa(this, arg0, Static137.anIntArray198, arg2);
		arg1.anInt6562 = Static137.anIntArray198[0];
		arg1.anInt6561 = Static137.anIntArray198[1];
		arg1.anInt6564 = Static137.anIntArray198[2];
		arg1.anInt6563 = Static137.anIntArray198[3];
		arg1.anInt6565 = Static137.anIntArray198[4];
		arg1.aBoolean534 = Static137.anIntArray198[5] != 0;
	}

	@OriginalMember(owner = "client!p", name = "VA", descriptor = "()I")
	public native int VA();

	@OriginalMember(owner = "client!p", name = "Y", descriptor = "(Lclient!h;Lclient!ba;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void Y(@OriginalArg(0) h arg0, @OriginalArg(1) ba arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!p", name = "va", descriptor = "(I[IIIIZI[I)V")
	protected native void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "()[Lclient!wq;")
	@Override
	public Class265[] method4157() {
		return this.aClass265Array3;
	}

	@OriginalMember(owner = "client!p", name = "u", descriptor = "(I)V")
	public native void u(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "N", descriptor = "(SS)V")
	public native void N(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!p", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!p", name = "ZA", descriptor = "(I)V")
	public native void ZA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "la", descriptor = "()I")
	public native int la();

	@OriginalMember(owner = "client!p", name = "xa", descriptor = "(I[IIIIIZ)V")
	protected native void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!p", name = "Q", descriptor = "()I")
	public native int Q();

	@OriginalMember(owner = "client!p", name = "j", descriptor = "(Lclient!p;Lclient!p;IZZ)V")
	public native void j(@OriginalArg(0) p arg0, @OriginalArg(1) p arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!p", name = "ra", descriptor = "()I")
	public native int ra();

	@OriginalMember(owner = "client!p", name = "ea", descriptor = "(IILclient!na;Lclient!na;III)V")
	public native void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class70 arg2, @OriginalArg(3) Class70 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!p", name = "oa", descriptor = "(I)V")
	public native void oa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "o", descriptor = "(I)V")
	public native void o(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "K", descriptor = "(IIII)V")
	protected native void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!p", name = "b", descriptor = "()I")
	public native int b();

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!ia;)V")
	public void method4091(@OriginalArg(0) int arg0, @OriginalArg(1) Class43 arg1) {
		@Pc(1) int local1 = arg0;
		@Pc(6) int local6;
		if (this.aClass203Array3 != null) {
			for (local6 = 0; local6 < this.aClass203Array3.length; local6++) {
				@Pc(12) Class203 local12 = this.aClass203Array3[local6];
				local12.anInt6053 = Static137.anIntArray200[local1++];
				local12.anInt6045 = Static137.anIntArray200[local1++];
				local12.anInt6046 = Static137.anIntArray200[local1++];
				local12.anInt6051 = Static137.anIntArray200[local1++];
				local12.anInt6040 = Static137.anIntArray200[local1++];
				local12.anInt6047 = Static137.anIntArray200[local1++];
				local12.anInt6044 = Static137.anIntArray200[local1++];
				local12.anInt6052 = Static137.anIntArray200[local1++];
				local12.anInt6041 = Static137.anIntArray200[local1++];
			}
		}
		if (this.aClass265Array3 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass265Array3.length; local6++) {
			@Pc(83) Class265 local83 = this.aClass265Array3[local6];
			@Pc(85) Class265 local85 = local83;
			if (local83.aClass265_2 != null) {
				local85 = local83.aClass265_2;
			}
			if (local83.aClass43_5 == null) {
				local83.aClass43_5 = arg1.method5107();
			} else {
				local83.aClass43_5.ba(arg1);
			}
			local85.anInt7757 = Static137.anIntArray200[local1++];
			local85.anInt7755 = Static137.anIntArray200[local1++];
			local85.anInt7754 = Static137.anIntArray200[local1++];
		}
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "()Z")
	@Override
	public boolean method4168() {
		return true;
	}

	@OriginalMember(owner = "client!p", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!p", name = "WA", descriptor = "(I)V")
	public native void WA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "W", descriptor = "()V")
	protected native void W();

	@OriginalMember(owner = "client!p", name = "XA", descriptor = "(III)V")
	public native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!p", name = "BA", descriptor = "(Lclient!h;)V")
	private native void BA(@OriginalArg(0) h arg0);

	@OriginalMember(owner = "client!p", name = "C", descriptor = "()I")
	public native int C();

	@OriginalMember(owner = "client!p", name = "ja", descriptor = "(III)V")
	public native void ja(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!p", name = "c", descriptor = "()V")
	@Override
	public void method4158() {
	}

	@OriginalMember(owner = "client!p", name = "n", descriptor = "()I")
	public native int n();

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!c;IIIZ)V")
	@Override
	public void method4165(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aH3.method2252().I(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "()[Lclient!qr;")
	@Override
	public Class203[] method4169() {
		return this.aClass203Array3;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BIZ)Lclient!c;")
	@Override
	public Class37 method4155(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.aH3.method2252().method3515(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!p", name = "sa", descriptor = "()V")
	public native void sa();
}
