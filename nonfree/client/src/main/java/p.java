import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class p extends Class32 implements Interface3 {

	@OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!p", name = "o", descriptor = "Lclient!h;")
	private final h aH3;

	@OriginalMember(owner = "client!p", name = "p", descriptor = "Lclient!ba;")
	private final ba aBa2;

	@OriginalMember(owner = "client!p", name = "n", descriptor = "[Lclient!qm;")
	public Class202[] aClass202Array2;

	@OriginalMember(owner = "client!p", name = "q", descriptor = "[Lclient!au;")
	public Class17[] aClass17Array2;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!h;Lclient!ba;Lclient!wp;IIII)V")
	public p(@OriginalArg(0) h arg0, @OriginalArg(1) ba arg1, @OriginalArg(2) Class266 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aH3 = arg0;
		this.aBa2 = arg1;
		this.aClass202Array2 = arg2.aClass202Array4;
		this.aClass17Array2 = arg2.aClass17Array4;
		@Pc(24) int local24 = arg2.aClass202Array4 == null ? 0 : arg2.aClass202Array4.length;
		@Pc(33) int local33 = arg2.aClass17Array4 == null ? 0 : arg2.aClass17Array4.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass202Array2[local44].anInt5771;
			local42[local35++] = this.aClass202Array2[local44].anInt5777;
			local42[local35++] = this.aClass202Array2[local44].anInt5774;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass17Array2[local78].anInt428;
		}
		@Pc(101) int local101 = arg2.aClass84Array1 == null ? 0 : arg2.aClass84Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class84 local116 = arg2.aClass84Array1[local110];
			@Pc(121) Class91 local121 = Static415.method5639(local116.anInt2340);
			local106[local108++] = local116.anInt2344;
			local106[local108++] = local121.anInt2441;
			local106[local108++] = local121.anInt2435;
			local106[local108++] = local121.anInt2437;
			local106[local108++] = local121.anInt2432;
			local106[local108++] = local121.anInt2439;
			local106[local108++] = local121.aBoolean203 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class84 local179 = arg2.aClass84Array1[local173];
			local106[local108++] = local179.anInt2341;
		}
		this.Y(this.aH3, this.aBa2, arg2.anInt7805, arg2.anInt7804, arg2.anIntArray510, arg2.anIntArray518, arg2.anIntArray514, arg2.anIntArray517, arg2.aShortArray111, arg2.anInt7821, arg2.aShortArray107, arg2.aShortArray114, arg2.aShortArray112, arg2.aByteArray220, arg2.aByteArray216, arg2.aByteArray215, arg2.aByteArray217, arg2.aShortArray115, arg2.aShortArray109, arg2.anIntArray516, arg2.aByte105, arg2.aShortArray110, arg2.anInt7801, arg2.aByteArray219, arg2.aShortArray113, arg2.aShortArray108, arg2.aShortArray106, arg2.anIntArray511, arg2.anIntArray515, arg2.anIntArray513, arg2.aByteArray221, arg2.aByteArray218, arg2.anIntArray519, arg2.anIntArray520, arg2.anIntArray521, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!h;)V")
	public p(@OriginalArg(0) h arg0) {
		this.aH3 = arg0;
		this.aBa2 = null;
		this.BA(arg0);
	}

	@OriginalMember(owner = "client!p", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!p", name = "YA", descriptor = "(SS)V")
	public native void YA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!c;IIIZ)V")
	@Override
	public void method5672(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aH3.method2122().I(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!p", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!p", name = "ja", descriptor = "(III)V")
	public native void ja(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!p", name = "la", descriptor = "()I")
	public native int la();

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BIZ)Lclient!c;")
	@Override
	public Class32 method5678(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.aH3.method2122().method3578(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "()[Lclient!au;")
	@Override
	public Class17[] method5667() {
		return this.aClass17Array2;
	}

	@OriginalMember(owner = "client!p", name = "xa", descriptor = "(I[IIIIIZ)V")
	protected native void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IILclient!ia;Z)Z")
	@Override
	public boolean method5671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class102 arg2, @OriginalArg(3) boolean arg3) {
		return this.aH3.method2122().ua(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!p", name = "E", descriptor = "()I")
	public native int E();

	@OriginalMember(owner = "client!p", name = "FA", descriptor = "()Z")
	protected native boolean FA();

	@OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static234.method3563(this);
	}

	@OriginalMember(owner = "client!p", name = "u", descriptor = "(I)V")
	public native void u(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "ZA", descriptor = "(I)V")
	public native void ZA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "j", descriptor = "(Lclient!p;Lclient!p;IZZ)V")
	public native void j(@OriginalArg(0) p arg0, @OriginalArg(1) p arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!p", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "WA", descriptor = "(I)V")
	public native void WA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "ua", descriptor = "(Lclient!j;)Lclient!j;")
	public native Class2_Sub2_Sub9 ua(@OriginalArg(0) Class2_Sub2_Sub9 arg0);

	@OriginalMember(owner = "client!p", name = "ia", descriptor = "(I)V")
	public native void ia(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "X", descriptor = "()I")
	public native int X();

	@OriginalMember(owner = "client!p", name = "d", descriptor = "()[Lclient!qm;")
	@Override
	public Class202[] method5673() {
		return this.aClass202Array2;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
	@Override
	public void method5666() {
	}

	@OriginalMember(owner = "client!p", name = "W", descriptor = "()V")
	protected native void W();

	@OriginalMember(owner = "client!p", name = "Y", descriptor = "(Lclient!h;Lclient!ba;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void Y(@OriginalArg(0) h arg0, @OriginalArg(1) ba arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!p", name = "ra", descriptor = "()I")
	public native int ra();

	@OriginalMember(owner = "client!p", name = "o", descriptor = "(I)V")
	public native void o(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "N", descriptor = "(SS)V")
	public native void N(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!p", name = "sa", descriptor = "()V")
	public native void sa();

	@OriginalMember(owner = "client!p", name = "oa", descriptor = "(I)V")
	public native void oa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "K", descriptor = "(IIII)V")
	protected native void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!p", name = "Q", descriptor = "()I")
	public native int Q();

	@OriginalMember(owner = "client!p", name = "BA", descriptor = "(Lclient!h;)V")
	private native void BA(@OriginalArg(0) h arg0);

	@OriginalMember(owner = "client!p", name = "XA", descriptor = "(III)V")
	public native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!ia;)V")
	public void method4254(@OriginalArg(0) int arg0, @OriginalArg(1) Class102 arg1) {
		@Pc(1) int local1 = arg0;
		@Pc(6) int local6;
		if (this.aClass202Array2 != null) {
			for (local6 = 0; local6 < this.aClass202Array2.length; local6++) {
				@Pc(12) Class202 local12 = this.aClass202Array2[local6];
				local12.anInt5768 = Static144.anIntArray155[local1++];
				local12.anInt5761 = Static144.anIntArray155[local1++];
				local12.anInt5778 = Static144.anIntArray155[local1++];
				local12.anInt5769 = Static144.anIntArray155[local1++];
				local12.anInt5779 = Static144.anIntArray155[local1++];
				local12.anInt5773 = Static144.anIntArray155[local1++];
				local12.anInt5772 = Static144.anIntArray155[local1++];
				local12.anInt5758 = Static144.anIntArray155[local1++];
				local12.anInt5763 = Static144.anIntArray155[local1++];
			}
		}
		if (this.aClass17Array2 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass17Array2.length; local6++) {
			@Pc(83) Class17 local83 = this.aClass17Array2[local6];
			@Pc(85) Class17 local85 = local83;
			if (local83.aClass17_1 != null) {
				local85 = local83.aClass17_1;
			}
			if (local83.aClass102_1 == null) {
				local83.aClass102_1 = arg1.method4931();
			} else {
				local83.aClass102_1.ba(arg1);
			}
			local85.anInt427 = Static144.anIntArray155[local1++];
			local85.anInt430 = Static144.anIntArray155[local1++];
			local85.anInt431 = Static144.anIntArray155[local1++];
		}
	}

	@OriginalMember(owner = "client!p", name = "n", descriptor = "()I")
	public native int n();

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!ia;Lclient!fo;I)V")
	@Override
	public void method5675(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class38_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aH3.method2122().fa(this, arg0, null, arg2);
			return;
		}
		Static144.anIntArray154[5] = 0;
		this.aH3.method2122().fa(this, arg0, Static144.anIntArray154, arg2);
		arg1.anInt2397 = Static144.anIntArray154[0];
		arg1.anInt2399 = Static144.anIntArray154[1];
		arg1.anInt2401 = Static144.anIntArray154[2];
		arg1.anInt2400 = Static144.anIntArray154[3];
		arg1.anInt2398 = Static144.anIntArray154[4];
		arg1.aBoolean201 = Static144.anIntArray154[5] != 0;
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "()Z")
	@Override
	public boolean method5676() {
		return true;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!ia;Lclient!fo;II)V")
	@Override
	public void method5677(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class38_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aH3.method2122().d(this, arg0, null, arg2, 1);
			return;
		}
		Static144.anIntArray154[5] = 0;
		this.aH3.method2122().d(this, arg0, Static144.anIntArray154, arg2, 1);
		arg1.anInt2397 = Static144.anIntArray154[0];
		arg1.anInt2399 = Static144.anIntArray154[1];
		arg1.anInt2401 = Static144.anIntArray154[2];
		arg1.anInt2400 = Static144.anIntArray154[3];
		arg1.anInt2398 = Static144.anIntArray154[4];
		arg1.aBoolean201 = Static144.anIntArray154[5] != 0;
	}

	@OriginalMember(owner = "client!p", name = "ea", descriptor = "(IILclient!na;Lclient!na;III)V")
	public native void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class106 arg2, @OriginalArg(3) Class106 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!p", name = "C", descriptor = "()I")
	public native int C();

	@OriginalMember(owner = "client!p", name = "va", descriptor = "(I[IIIIZI[I)V")
	protected native void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!p", name = "VA", descriptor = "()I")
	public native int VA();

	@OriginalMember(owner = "client!p", name = "b", descriptor = "()I")
	public native int b();

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException();
	}
}
