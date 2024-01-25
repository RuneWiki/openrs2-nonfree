import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class p extends Class31 implements Interface3 {

	@OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!p", name = "i", descriptor = "Lclient!h;")
	private final h aH3;

	@OriginalMember(owner = "client!p", name = "k", descriptor = "Lclient!ba;")
	private final ba aBa2;

	@OriginalMember(owner = "client!p", name = "j", descriptor = "[Lclient!sm;")
	public Class209[] aClass209Array2;

	@OriginalMember(owner = "client!p", name = "l", descriptor = "[Lclient!ot;")
	public Class178[] aClass178Array2;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!h;Lclient!ba;Lclient!uu;IIII)V")
	public p(@OriginalArg(0) h arg0, @OriginalArg(1) ba arg1, @OriginalArg(2) Class242 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aH3 = arg0;
		this.aBa2 = arg1;
		this.aClass209Array2 = arg2.aClass209Array3;
		this.aClass178Array2 = arg2.aClass178Array3;
		@Pc(24) int local24 = arg2.aClass209Array3 == null ? 0 : arg2.aClass209Array3.length;
		@Pc(33) int local33 = arg2.aClass178Array3 == null ? 0 : arg2.aClass178Array3.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass209Array2[local44].anInt6545;
			local42[local35++] = this.aClass209Array2[local44].anInt6557;
			local42[local35++] = this.aClass209Array2[local44].anInt6544;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass178Array2[local78].anInt5411;
		}
		@Pc(101) int local101 = arg2.aClass266Array1 == null ? 0 : arg2.aClass266Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class266 local116 = arg2.aClass266Array1[local110];
			@Pc(121) Class79 local121 = Static128.method2226(local116.anInt7556);
			local106[local108++] = local116.anInt7551;
			local106[local108++] = local121.anInt2608;
			local106[local108++] = local121.anInt2610;
			local106[local108++] = local121.anInt2609;
			local106[local108++] = local121.anInt2612;
			local106[local108++] = local121.anInt2611;
			local106[local108++] = local121.aBoolean202 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class266 local179 = arg2.aClass266Array1[local173];
			local106[local108++] = local179.anInt7553;
		}
		this.Y(this.aH3, this.aBa2, arg2.anInt7167, arg2.anInt7158, arg2.anIntArray510, arg2.anIntArray501, arg2.anIntArray500, arg2.anIntArray508, arg2.aShortArray94, arg2.anInt7157, arg2.aShortArray91, arg2.aShortArray97, arg2.aShortArray98, arg2.aByteArray79, arg2.aByteArray76, arg2.aByteArray80, arg2.aByteArray78, arg2.aShortArray95, arg2.aShortArray90, arg2.anIntArray507, arg2.aByte104, arg2.aShortArray93, arg2.anInt7164, arg2.aByteArray82, arg2.aShortArray92, arg2.aShortArray89, arg2.aShortArray96, arg2.anIntArray505, arg2.anIntArray502, arg2.anIntArray503, arg2.aByteArray81, arg2.aByteArray77, arg2.anIntArray504, arg2.anIntArray506, arg2.anIntArray509, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!h;)V")
	public p(@OriginalArg(0) h arg0) {
		this.aH3 = arg0;
		this.aBa2 = null;
		this.BA(arg0);
	}

	@OriginalMember(owner = "client!p", name = "la", descriptor = "()I")
	public native int la();

	@OriginalMember(owner = "client!p", name = "xa", descriptor = "(I[IIIIIZ)V")
	protected native void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!p", name = "ia", descriptor = "(I)V")
	public native void ia(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "d", descriptor = "()[Lclient!sm;")
	@Override
	public Class209[] method5707() {
		return this.aClass209Array2;
	}

	@OriginalMember(owner = "client!p", name = "ZA", descriptor = "(I)V")
	public native void ZA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "ea", descriptor = "(IILclient!na;Lclient!na;III)V")
	public native void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class64 arg2, @OriginalArg(3) Class64 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!p", name = "E", descriptor = "()I")
	public native int E();

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!ia;)V")
	public void method4415(@OriginalArg(0) int arg0, @OriginalArg(1) Class106 arg1) {
		@Pc(1) int local1 = arg0;
		@Pc(6) int local6;
		if (this.aClass209Array2 != null) {
			for (local6 = 0; local6 < this.aClass209Array2.length; local6++) {
				@Pc(12) Class209 local12 = this.aClass209Array2[local6];
				local12.anInt6549 = Static145.anIntArray248[local1++];
				local12.anInt6551 = Static145.anIntArray248[local1++];
				local12.anInt6548 = Static145.anIntArray248[local1++];
				local12.anInt6554 = Static145.anIntArray248[local1++];
				local12.anInt6543 = Static145.anIntArray248[local1++];
				local12.anInt6547 = Static145.anIntArray248[local1++];
				local12.anInt6552 = Static145.anIntArray248[local1++];
				local12.anInt6559 = Static145.anIntArray248[local1++];
				local12.anInt6546 = Static145.anIntArray248[local1++];
			}
		}
		if (this.aClass178Array2 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass178Array2.length; local6++) {
			@Pc(83) Class178 local83 = this.aClass178Array2[local6];
			@Pc(85) Class178 local85 = local83;
			if (local83.aClass178_2 != null) {
				local85 = local83.aClass178_2;
			}
			if (local83.aClass106_4 == null) {
				local83.aClass106_4 = arg1.method5103();
			} else {
				local83.aClass106_4.ba(arg1);
			}
			local85.anInt5415 = Static145.anIntArray248[local1++];
			local85.anInt5410 = Static145.anIntArray248[local1++];
			local85.anInt5414 = Static145.anIntArray248[local1++];
		}
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "()V")
	@Override
	public void method5716() {
	}

	@OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static280.method4134(this);
	}

	@OriginalMember(owner = "client!p", name = "Q", descriptor = "()I")
	public native int Q();

	@OriginalMember(owner = "client!p", name = "N", descriptor = "(SS)V")
	public native void N(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!ia;Lclient!aq;II)V")
	@Override
	public void method5706(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class13_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aH3.method2648().d(this, arg0, null, arg2, 1);
			return;
		}
		Static145.anIntArray250[5] = 0;
		this.aH3.method2648().d(this, arg0, Static145.anIntArray250, arg2, 1);
		arg1.anInt557 = Static145.anIntArray250[0];
		arg1.anInt556 = Static145.anIntArray250[1];
		arg1.anInt555 = Static145.anIntArray250[2];
		arg1.anInt559 = Static145.anIntArray250[3];
		arg1.anInt558 = Static145.anIntArray250[4];
		arg1.aBoolean23 = Static145.anIntArray250[5] != 0;
	}

	@OriginalMember(owner = "client!p", name = "oa", descriptor = "(I)V")
	public native void oa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "BA", descriptor = "(Lclient!h;)V")
	private native void BA(@OriginalArg(0) h arg0);

	@OriginalMember(owner = "client!p", name = "ra", descriptor = "()I")
	public native int ra();

	@OriginalMember(owner = "client!p", name = "u", descriptor = "(I)V")
	public native void u(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "XA", descriptor = "(III)V")
	public native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!p", name = "sa", descriptor = "()V")
	public native void sa();

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!ia;Lclient!aq;I)V")
	@Override
	public void method5704(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class13_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aH3.method2648().fa(this, arg0, null, arg2);
			return;
		}
		Static145.anIntArray250[5] = 0;
		this.aH3.method2648().fa(this, arg0, Static145.anIntArray250, arg2);
		arg1.anInt557 = Static145.anIntArray250[0];
		arg1.anInt556 = Static145.anIntArray250[1];
		arg1.anInt555 = Static145.anIntArray250[2];
		arg1.anInt559 = Static145.anIntArray250[3];
		arg1.anInt558 = Static145.anIntArray250[4];
		arg1.aBoolean23 = Static145.anIntArray250[5] != 0;
	}

	@OriginalMember(owner = "client!p", name = "o", descriptor = "(I)V")
	public native void o(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "WA", descriptor = "(I)V")
	public native void WA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "ua", descriptor = "(Lclient!j;)Lclient!j;")
	public native Class3_Sub3_Sub4 ua(@OriginalArg(0) Class3_Sub3_Sub4 arg0);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!p", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!p", name = "a", descriptor = "()Z")
	@Override
	public boolean method5701() {
		return true;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BIZ)Lclient!c;")
	@Override
	public Class31 method5710(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.aH3.method2648().method3780(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "()[Lclient!ot;")
	@Override
	public Class178[] method5705() {
		return this.aClass178Array2;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IILclient!ia;Z)Z")
	@Override
	public boolean method5702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class106 arg2, @OriginalArg(3) boolean arg3) {
		return this.aH3.method2648().ua(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!p", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "VA", descriptor = "()I")
	public native int VA();

	@OriginalMember(owner = "client!p", name = "b", descriptor = "()I")
	public native int b();

	@OriginalMember(owner = "client!p", name = "ja", descriptor = "(III)V")
	public native void ja(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!p", name = "n", descriptor = "()I")
	public native int n();

	@OriginalMember(owner = "client!p", name = "W", descriptor = "()V")
	protected native void W();

	@OriginalMember(owner = "client!p", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!p", name = "Y", descriptor = "(Lclient!h;Lclient!ba;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void Y(@OriginalArg(0) h arg0, @OriginalArg(1) ba arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!p", name = "va", descriptor = "(I[IIIIZI[I)V")
	protected native void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!p", name = "YA", descriptor = "(SS)V")
	public native void YA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!p", name = "X", descriptor = "()I")
	public native int X();

	@OriginalMember(owner = "client!p", name = "C", descriptor = "()I")
	public native int C();

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!c;IIIZ)V")
	@Override
	public void method5700(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aH3.method2648().I(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!p", name = "K", descriptor = "(IIII)V")
	protected native void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!p", name = "FA", descriptor = "()Z")
	protected native boolean FA();

	@OriginalMember(owner = "client!p", name = "j", descriptor = "(Lclient!p;Lclient!p;IZZ)V")
	public native void j(@OriginalArg(0) p arg0, @OriginalArg(1) p arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);
}
