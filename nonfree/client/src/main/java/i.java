import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class43 implements Interface11 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!i", name = "m", descriptor = "Lclient!oa;")
	private final oa anOa2;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "Lclient!ya;")
	private final ya aYa1;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "[Lclient!ui;")
	public Class363[] aClass363Array2;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "[Lclient!ok;")
	public Class270[] aClass270Array2;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!kc;IIII)V")
	public i(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class197 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anOa2 = arg0;
		this.aYa1 = arg1;
		this.aClass363Array2 = arg2.aClass363Array3;
		this.aClass270Array2 = arg2.aClass270Array3;
		@Pc(24) int local24 = arg2.aClass363Array3 == null ? 0 : arg2.aClass363Array3.length;
		@Pc(33) int local33 = arg2.aClass270Array3 == null ? 0 : arg2.aClass270Array3.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass363Array2[local44].anInt9749;
			local42[local35++] = this.aClass363Array2[local44].anInt9754;
			local42[local35++] = this.aClass363Array2[local44].anInt9753;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass270Array2[local78].anInt7122;
		}
		@Pc(101) int local101 = arg2.aClass129Array1 == null ? 0 : arg2.aClass129Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class129 local116 = arg2.aClass129Array1[local110];
			@Pc(121) Class335 local121 = Static357.method5233(local116.anInt3390);
			local106[local108++] = local116.anInt3394;
			local106[local108++] = local121.anInt8745;
			local106[local108++] = local121.anInt8747;
			local106[local108++] = local121.anInt8737;
			local106[local108++] = local121.anInt8742;
			local106[local108++] = local121.anInt8743;
			local106[local108++] = local121.aBoolean577 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class129 local179 = arg2.aClass129Array1[local173];
			local106[local108++] = local179.anInt3386;
		}
		this.R(this.anOa2, this.aYa1, arg2.anInt5130, arg2.anInt5124, arg2.anIntArray307, arg2.anIntArray299, arg2.anIntArray302, arg2.anIntArray305, arg2.aShortArray72, arg2.anInt5115, arg2.aShortArray67, arg2.aShortArray71, arg2.aShortArray64, arg2.aByteArray50, arg2.aByteArray49, arg2.aByteArray55, arg2.aByteArray53, arg2.aShortArray68, arg2.aShortArray66, arg2.anIntArray303, arg2.aByte74, arg2.aShortArray70, arg2.anInt5110, arg2.aByteArray54, arg2.aShortArray63, arg2.aShortArray65, arg2.aShortArray69, arg2.anIntArray304, arg2.anIntArray306, arg2.anIntArray297, arg2.aByteArray51, arg2.aByteArray52, arg2.anIntArray300, arg2.anIntArray298, arg2.anIntArray301, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;)V")
	public i(@OriginalArg(0) oa arg0) {
		this.anOa2 = arg0;
		this.aYa1 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
	public native void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
	public native int HA();

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()Z")
	@Override
	public boolean method8858() {
		return true;
	}

	@OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!sj;)V")
	private void method3664(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class10 arg1) {
		this.anOa2.method6058().method7(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()[Lclient!ui;")
	@Override
	public Class363[] method8853() {
		return this.aClass363Array2;
	}

	@OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class43 method8840(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anOa2.method6058().method2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!i", name = "R", descriptor = "(Lclient!oa;Lclient!ya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void R(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!i", name = "oa", descriptor = "(Lclient!oa;)V")
	private native void oa(@OriginalArg(0) oa arg0);

	@OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
	protected native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Lclient!i;Lclient!i;IZZ)V")
	public native void ZA(@OriginalArg(0) i arg0, @OriginalArg(1) i arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
	public native void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public native Class5_Sub1_Sub15 ba(@OriginalArg(0) Class5_Sub1_Sub15 arg0);

	@OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
	protected native boolean NA();

	@OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
	public native boolean F();

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()[Lclient!ok;")
	@Override
	public Class270[] method8863() {
		return this.aClass270Array2;
	}

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
	public native boolean r();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method8860(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.l(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method8861(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anOa2.method6058().method5(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
	public native void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!sj;)V")
	@Override
	public void method8847(@OriginalArg(0) Class10 arg0) {
		this.method3664(Static410.anIntArray411, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass363Array2 != null) {
			for (local10 = 0; local10 < this.aClass363Array2.length; local10++) {
				@Pc(16) Class363 local16 = this.aClass363Array2[local10];
				local16.anInt9755 = Static410.anIntArray411[local5++];
				local16.anInt9751 = Static410.anIntArray411[local5++];
				local16.anInt9758 = Static410.anIntArray411[local5++];
				local16.anInt9762 = Static410.anIntArray411[local5++];
				local16.anInt9760 = Static410.anIntArray411[local5++];
				local16.anInt9748 = Static410.anIntArray411[local5++];
				local16.anInt9750 = Static410.anIntArray411[local5++];
				local16.anInt9761 = Static410.anIntArray411[local5++];
				local16.anInt9759 = Static410.anIntArray411[local5++];
			}
		}
		if (this.aClass270Array2 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass270Array2.length; local10++) {
			@Pc(87) Class270 local87 = this.aClass270Array2[local10];
			@Pc(89) Class270 local89 = local87;
			if (local87.aClass270_2 != null) {
				local89 = local87.aClass270_2;
			}
			if (local87.aClass10_7 == null) {
				local87.aClass10_7 = arg0.method4222();
			} else {
				local87.aClass10_7.method4212(arg0);
			}
			local89.anInt7124 = Static410.anIntArray411[local5++];
			local89.anInt7120 = Static410.anIntArray411[local5++];
			local89.anInt7119 = Static410.anIntArray411[local5++];
		}
	}

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class84 arg2, @OriginalArg(3) Class84 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
	public native void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()V")
	@Override
	protected void method8850() {
		if (this.anOa2.anInt6958 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean748) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean748 = true;
		}
	}

	@OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
	public native int G();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!sj;Lclient!rp;II)V")
	@Override
	public void method8846(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class4_Sub8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.anOa2.method6058().method16(this, arg0, (int[]) null, arg2, arg3);
			return;
		}
		Static410.anIntArray413[5] = 0;
		this.anOa2.method6058().method16(this, arg0, Static410.anIntArray413, arg2, arg3);
		arg1.anInt8408 = Static410.anIntArray413[0];
		arg1.anInt8405 = Static410.anIntArray413[1];
		arg1.anInt8406 = Static410.anIntArray413[2];
		arg1.anInt8404 = Static410.anIntArray413[3];
		arg1.anInt8407 = Static410.anIntArray413[4];
		arg1.aBoolean558 = Static410.anIntArray413[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static679.method9180(this);
		}
	}

	@OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!sj;ZI)Z")
	@Override
	public boolean method8852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.anOa2.method6058().method1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!sj;Lclient!rp;I)V")
	@Override
	public void method8849(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class4_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anOa2.method6058().method11(this, arg0, (int[]) null, arg2);
			return;
		}
		Static410.anIntArray413[5] = 0;
		this.anOa2.method6058().method11(this, arg0, Static410.anIntArray413, arg2);
		arg1.anInt8408 = Static410.anIntArray413[0];
		arg1.anInt8405 = Static410.anIntArray413[1];
		arg1.anInt8406 = Static410.anIntArray413[2];
		arg1.anInt8404 = Static410.anIntArray413[3];
		arg1.anInt8407 = Static410.anIntArray413[4];
		arg1.aBoolean558 = Static410.anIntArray413[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!sj;IZ)V")
	@Override
	public void method8856(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.A(((ja) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()V")
	@Override
	public void method8864() {
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!sj;ZII)Z")
	@Override
	public boolean method8844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.anOa2.method6058().method15(this, arg0, arg1, arg2, arg3, arg5);
	}

	@OriginalMember(owner = "client!i", name = "A", descriptor = "(JIZ)V")
	private native void A(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
	public native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
	protected native void wa();

	@OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
	public native int ua();

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()V")
	@Override
	protected void method8843() {
		if (this.anOa2.anInt6958 > 1) {
			synchronized (this) {
				super.aBoolean748 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
	public native int fa();
}
