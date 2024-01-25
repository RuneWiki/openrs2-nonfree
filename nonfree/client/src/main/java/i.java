import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class193 implements Interface3 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!i", name = "r", descriptor = "Lclient!oa;")
	private final oa anOa2;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "Lclient!ya;")
	private final ya aYa1;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "[Lclient!qi;")
	public Class287[] aClass287Array1;

	@OriginalMember(owner = "client!i", name = "q", descriptor = "[Lclient!hv;")
	public Class156[] aClass156Array1;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!lga;IIII)V")
	public i(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class212 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anOa2 = arg0;
		this.aYa1 = arg1;
		this.aClass287Array1 = arg2.aClass287Array2;
		this.aClass156Array1 = arg2.aClass156Array2;
		@Pc(24) int local24 = arg2.aClass287Array2 == null ? 0 : arg2.aClass287Array2.length;
		@Pc(33) int local33 = arg2.aClass156Array2 == null ? 0 : arg2.aClass156Array2.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass287Array1[local44].anInt7576;
			local42[local35++] = this.aClass287Array1[local44].anInt7583;
			local42[local35++] = this.aClass287Array1[local44].anInt7574;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass156Array1[local78].anInt4163;
		}
		@Pc(101) int local101 = arg2.aClass149Array1 == null ? 0 : arg2.aClass149Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class149 local116 = arg2.aClass149Array1[local110];
			@Pc(121) Class108 local121 = Static173.method2997(local116.anInt4081);
			local106[local108++] = local116.anInt4079;
			local106[local108++] = local121.anInt3075;
			local106[local108++] = local121.anInt3079;
			local106[local108++] = local121.anInt3070;
			local106[local108++] = local121.anInt3068;
			local106[local108++] = local121.anInt3071;
			local106[local108++] = local121.aBoolean243 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class149 local179 = arg2.aClass149Array1[local173];
			local106[local108++] = local179.anInt4077;
		}
		this.R(this.anOa2, this.aYa1, arg2.anInt5669, arg2.anInt5665, arg2.anIntArray355, arg2.anIntArray360, arg2.anIntArray353, arg2.anIntArray354, arg2.aShortArray64, arg2.anInt5661, arg2.aShortArray63, arg2.aShortArray69, arg2.aShortArray65, arg2.aByteArray46, arg2.aByteArray50, arg2.aByteArray52, arg2.aByteArray51, arg2.aShortArray68, arg2.aShortArray61, arg2.anIntArray362, arg2.aByte79, arg2.aShortArray66, arg2.anInt5663, arg2.aByteArray49, arg2.aShortArray70, arg2.aShortArray62, arg2.aShortArray67, arg2.anIntArray359, arg2.anIntArray363, arg2.anIntArray356, arg2.aByteArray47, arg2.aByteArray48, arg2.anIntArray358, arg2.anIntArray361, arg2.anIntArray357, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;)V")
	public i(@OriginalArg(0) oa arg0) {
		this.anOa2 = arg0;
		this.aYa1 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method6611(@OriginalArg(0) Class193 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anOa2.method5941().method12(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
	public native int G();

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()V")
	@Override
	public void method6624() {
	}

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
	public native boolean r();

	@OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()V")
	@Override
	protected void method6620() {
		if (this.anOa2.anInt6834 > 1) {
			synchronized (this) {
				super.aBoolean539 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()Z")
	@Override
	public boolean method6618() {
		return true;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!pda;Lclient!wt;I)V")
	@Override
	public void method6612(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class16_Sub10 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anOa2.method5941().method13(this, arg0, (int[]) null, arg2);
			return;
		}
		Static396.anIntArray451[5] = 0;
		this.anOa2.method5941().method13(this, arg0, Static396.anIntArray451, arg2);
		arg1.anInt10441 = Static396.anIntArray451[0];
		arg1.anInt10438 = Static396.anIntArray451[1];
		arg1.anInt10440 = Static396.anIntArray451[2];
		arg1.anInt10439 = Static396.anIntArray451[3];
		arg1.anInt10442 = Static396.anIntArray451[4];
		arg1.aBoolean758 = Static396.anIntArray451[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
	public native void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
	protected native void wa();

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()[Lclient!hv;")
	@Override
	public Class156[] method6625() {
		return this.aClass156Array1;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!pda;IZ)V")
	@Override
	public void method6627(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.D(((ja) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!pda;Lclient!wt;II)V")
	@Override
	public void method6622(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class16_Sub10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.anOa2.method5941().method16(this, arg0, (int[]) null, arg2, arg3);
			return;
		}
		Static396.anIntArray451[5] = 0;
		this.anOa2.method5941().method16(this, arg0, Static396.anIntArray451, arg2, arg3);
		arg1.anInt10441 = Static396.anIntArray451[0];
		arg1.anInt10438 = Static396.anIntArray451[1];
		arg1.anInt10440 = Static396.anIntArray451[2];
		arg1.anInt10439 = Static396.anIntArray451[3];
		arg1.anInt10442 = Static396.anIntArray451[4];
		arg1.aBoolean758 = Static396.anIntArray451[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "D", descriptor = "(JIZ)V")
	private native void D(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
	public native void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!pda;ZI)Z")
	@Override
	public boolean method6623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.anOa2.method5941().method5(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Lclient!i;Lclient!i;IZZ)V")
	public native void ZA(@OriginalArg(0) i arg0, @OriginalArg(1) i arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static8.method107(this);
		}
	}

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
	public native void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
	protected native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()[Lclient!qi;")
	@Override
	public Class287[] method6621() {
		return this.aClass287Array1;
	}

	@OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
	public native int HA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!pda;)V")
	@Override
	public void method6608(@OriginalArg(0) Class51 arg0) {
		this.method3681(Static396.anIntArray452, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass287Array1 != null) {
			for (local10 = 0; local10 < this.aClass287Array1.length; local10++) {
				@Pc(16) Class287 local16 = this.aClass287Array1[local10];
				local16.anInt7580 = Static396.anIntArray452[local5++];
				local16.anInt7579 = Static396.anIntArray452[local5++];
				local16.anInt7578 = Static396.anIntArray452[local5++];
				local16.anInt7586 = Static396.anIntArray452[local5++];
				local16.anInt7581 = Static396.anIntArray452[local5++];
				local16.anInt7571 = Static396.anIntArray452[local5++];
				local16.anInt7584 = Static396.anIntArray452[local5++];
				local16.anInt7585 = Static396.anIntArray452[local5++];
				local16.anInt7575 = Static396.anIntArray452[local5++];
			}
		}
		if (this.aClass156Array1 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass156Array1.length; local10++) {
			@Pc(87) Class156 local87 = this.aClass156Array1[local10];
			@Pc(89) Class156 local89 = local87;
			if (local87.aClass156_1 != null) {
				local89 = local87.aClass156_1;
			}
			if (local87.aClass51_4 == null) {
				local87.aClass51_4 = arg0.method6712();
			} else {
				local87.aClass51_4.method6704(arg0);
			}
			local89.anInt4165 = Static396.anIntArray452[local5++];
			local89.anInt4166 = Static396.anIntArray452[local5++];
			local89.anInt4160 = Static396.anIntArray452[local5++];
		}
	}

	@OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
	public native int ua();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class193 method6609(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anOa2.method5941().method11(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "oa", descriptor = "(Lclient!oa;)V")
	private native void oa(@OriginalArg(0) oa arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!pda;ZII)Z")
	@Override
	public boolean method6617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.anOa2.method5941().method2(this, arg0, arg1, arg2, arg3, arg5);
	}

	@OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
	public native void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) Class91 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
	protected native boolean NA();

	@OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()V")
	@Override
	protected void method6613() {
		if (this.anOa2.anInt6834 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean539) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean539 = true;
		}
	}

	@OriginalMember(owner = "client!i", name = "R", descriptor = "(Lclient!oa;Lclient!ya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void R(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
	public native boolean F();

	@OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public native Class2_Sub7_Sub17 ba(@OriginalArg(0) Class2_Sub7_Sub17 arg0);

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!pda;)V")
	private void method3681(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class51 arg1) {
		this.anOa2.method5941().method3(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method6629(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.l(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
	public native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);
}
