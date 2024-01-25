import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class80 implements Interface6 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "Lclient!oa;")
	private final oa anOa2;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "Lclient!ya;")
	private final ya aYa1;

	@OriginalMember(owner = "client!i", name = "m", descriptor = "[Lclient!gv;")
	public Class136[] aClass136Array4;

	@OriginalMember(owner = "client!i", name = "l", descriptor = "[Lclient!oq;")
	public Class265[] aClass265Array4;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!dba;IIII)V")
	public i(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anOa2 = arg0;
		this.aYa1 = arg1;
		this.aClass136Array4 = arg2.aClass136Array1;
		this.aClass265Array4 = arg2.aClass265Array1;
		@Pc(24) int local24 = arg2.aClass136Array1 == null ? 0 : arg2.aClass136Array1.length;
		@Pc(33) int local33 = arg2.aClass265Array1 == null ? 0 : arg2.aClass265Array1.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass136Array4[local44].anInt3741;
			local42[local35++] = this.aClass136Array4[local44].anInt3739;
			local42[local35++] = this.aClass136Array4[local44].anInt3750;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass265Array4[local78].anInt7789;
		}
		@Pc(101) int local101 = arg2.aClass156Array1 == null ? 0 : arg2.aClass156Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class156 local116 = arg2.aClass156Array1[local110];
			@Pc(121) Class182 local121 = Static356.method5394(local116.anInt4305);
			local106[local108++] = local116.anInt4303;
			local106[local108++] = local121.anInt4852;
			local106[local108++] = local121.anInt4851;
			local106[local108++] = local121.anInt4854;
			local106[local108++] = local121.anInt4857;
			local106[local108++] = local121.anInt4853;
			local106[local108++] = local121.aBoolean331 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class156 local179 = arg2.aClass156Array1[local173];
			local106[local108++] = local179.anInt4307;
		}
		this.R(this.anOa2, this.aYa1, arg2.anInt2023, arg2.anInt2029, arg2.anIntArray147, arg2.anIntArray146, arg2.anIntArray148, arg2.anIntArray149, arg2.aShortArray21, arg2.anInt2019, arg2.aShortArray28, arg2.aShortArray22, arg2.aShortArray25, arg2.aByteArray27, arg2.aByteArray29, arg2.aByteArray26, arg2.aByteArray32, arg2.aShortArray23, arg2.aShortArray26, arg2.anIntArray142, arg2.aByte45, arg2.aShortArray19, arg2.anInt2017, arg2.aByteArray31, arg2.aShortArray27, arg2.aShortArray24, arg2.aShortArray20, arg2.anIntArray141, arg2.anIntArray144, arg2.anIntArray145, arg2.aByteArray28, arg2.aByteArray30, arg2.anIntArray151, arg2.anIntArray143, arg2.anIntArray150, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;)V")
	public i(@OriginalArg(0) oa arg0) {
		this.anOa2 = arg0;
		this.aYa1 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static480.method7122(this);
		}
	}

	@OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
	public native int G();

	@OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class80 method6378(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anOa2.method6171().method15(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) Class51 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!i", name = "K", descriptor = "(JIZ)V")
	private native void K(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()Z")
	@Override
	public boolean method6371() {
		return true;
	}

	@OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
	public native void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
	@Override
	protected void method6377() {
		if (this.anOa2.anInt7501 > 1) {
			synchronized (this) {
				super.aBoolean525 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
	public native void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "oa", descriptor = "(Lclient!oa;)V")
	private native void oa(@OriginalArg(0) oa arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!qja;ZII)Z")
	@Override
	public boolean method6386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.anOa2.method6171().method13(this, arg0, arg1, arg2, arg3, arg5);
	}

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
	protected native void wa();

	@OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
	protected native boolean NA();

	@OriginalMember(owner = "client!i", name = "R", descriptor = "(Lclient!oa;Lclient!ya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void R(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()[Lclient!gv;")
	@Override
	public Class136[] method6376() {
		return this.aClass136Array4;
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()V")
	@Override
	protected void method6381() {
		if (this.anOa2.anInt7501 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean525) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean525 = true;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!qja;Lclient!ag;I)V")
	@Override
	public void method6391(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class12_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anOa2.method6171().method16(this, arg0, (int[]) null, arg2);
			return;
		}
		Static412.anIntArray545[5] = 0;
		this.anOa2.method6171().method16(this, arg0, Static412.anIntArray545, arg2);
		arg1.anInt80 = Static412.anIntArray545[0];
		arg1.anInt83 = Static412.anIntArray545[1];
		arg1.anInt84 = Static412.anIntArray545[2];
		arg1.anInt82 = Static412.anIntArray545[3];
		arg1.anInt81 = Static412.anIntArray545[4];
		arg1.aBoolean6 = Static412.anIntArray545[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()[Lclient!oq;")
	@Override
	public Class265[] method6372() {
		return this.aClass265Array4;
	}

	@OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
	public native void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Lclient!i;Lclient!i;IZZ)V")
	public native void ZA(@OriginalArg(0) i arg0, @OriginalArg(1) i arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method6385(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anOa2.method6171().method1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!qja;IZ)V")
	@Override
	public void method6382(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.K(((ja) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
	public native int ua();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
	public native boolean F();

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!qja;)V")
	private void method3538(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class26 arg1) {
		this.anOa2.method6171().method11(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
	public native void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public native Class14_Sub3_Sub14 ba(@OriginalArg(0) Class14_Sub3_Sub14 arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!qja;Lclient!ag;II)V")
	@Override
	public void method6375(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class12_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.anOa2.method6171().method6(this, arg0, (int[]) null, arg2, arg3);
			return;
		}
		Static412.anIntArray545[5] = 0;
		this.anOa2.method6171().method6(this, arg0, Static412.anIntArray545, arg2, arg3);
		arg1.anInt80 = Static412.anIntArray545[0];
		arg1.anInt83 = Static412.anIntArray545[1];
		arg1.anInt84 = Static412.anIntArray545[2];
		arg1.anInt82 = Static412.anIntArray545[3];
		arg1.anInt81 = Static412.anIntArray545[4];
		arg1.aBoolean6 = Static412.anIntArray545[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
	public native int HA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method6384(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.l(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
	protected native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!qja;)V")
	@Override
	public void method6373(@OriginalArg(0) Class26 arg0) {
		this.method3538(Static412.anIntArray546, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass136Array4 != null) {
			for (local10 = 0; local10 < this.aClass136Array4.length; local10++) {
				@Pc(16) Class136 local16 = this.aClass136Array4[local10];
				local16.anInt3747 = Static412.anIntArray546[local5++];
				local16.anInt3738 = Static412.anIntArray546[local5++];
				local16.anInt3753 = Static412.anIntArray546[local5++];
				local16.anInt3746 = Static412.anIntArray546[local5++];
				local16.anInt3737 = Static412.anIntArray546[local5++];
				local16.anInt3749 = Static412.anIntArray546[local5++];
				local16.anInt3744 = Static412.anIntArray546[local5++];
				local16.anInt3743 = Static412.anIntArray546[local5++];
				local16.anInt3736 = Static412.anIntArray546[local5++];
			}
		}
		if (this.aClass265Array4 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass265Array4.length; local10++) {
			@Pc(87) Class265 local87 = this.aClass265Array4[local10];
			@Pc(89) Class265 local89 = local87;
			if (local87.aClass265_1 != null) {
				local89 = local87.aClass265_1;
			}
			if (local87.aClass26_10 == null) {
				local87.aClass26_10 = arg0.method6452();
			} else {
				local87.aClass26_10.method6447(arg0);
			}
			local89.anInt7790 = Static412.anIntArray546[local5++];
			local89.anInt7791 = Static412.anIntArray546[local5++];
			local89.anInt7792 = Static412.anIntArray546[local5++];
		}
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()V")
	@Override
	public void method6389() {
	}

	@OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
	public native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!qja;ZI)Z")
	@Override
	public boolean method6380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.anOa2.method6171().method10(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
	public native boolean r();
}
