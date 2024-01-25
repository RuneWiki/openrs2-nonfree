import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class62 implements Interface10 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "Lclient!oa;")
	private final oa anOa2;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "Lclient!ya;")
	private final ya aYa1;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "[Lclient!mk;")
	public Class235[] aClass235Array2;

	@OriginalMember(owner = "client!i", name = "m", descriptor = "[Lclient!ir;")
	public Class170[] aClass170Array2;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!so;IIII)V")
	public i(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class334 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anOa2 = arg0;
		this.aYa1 = arg1;
		this.aClass235Array2 = arg2.aClass235Array5;
		this.aClass170Array2 = arg2.aClass170Array5;
		@Pc(24) int local24 = arg2.aClass235Array5 == null ? 0 : arg2.aClass235Array5.length;
		@Pc(33) int local33 = arg2.aClass170Array5 == null ? 0 : arg2.aClass170Array5.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass235Array2[local44].anInt5635;
			local42[local35++] = this.aClass235Array2[local44].anInt5634;
			local42[local35++] = this.aClass235Array2[local44].anInt5631;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass170Array2[local78].anInt4269;
		}
		@Pc(101) int local101 = arg2.aClass226Array1 == null ? 0 : arg2.aClass226Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class226 local116 = arg2.aClass226Array1[local110];
			@Pc(121) Class150 local121 = Static415.method5232(local116.anInt5502);
			local106[local108++] = local116.anInt5493;
			local106[local108++] = local121.anInt3544;
			local106[local108++] = local121.anInt3549;
			local106[local108++] = local121.anInt3546;
			local106[local108++] = local121.anInt3545;
			local106[local108++] = local121.anInt3548;
			local106[local108++] = local121.aBoolean261 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class226 local179 = arg2.aClass226Array1[local173];
			local106[local108++] = local179.anInt5501;
		}
		this.R(this.anOa2, this.aYa1, arg2.anInt8570, arg2.anInt8560, arg2.anIntArray596, arg2.anIntArray593, arg2.anIntArray589, arg2.anIntArray591, arg2.aShortArray126, arg2.anInt8557, arg2.aShortArray125, arg2.aShortArray132, arg2.aShortArray130, arg2.aByteArray89, arg2.aByteArray90, arg2.aByteArray86, arg2.aByteArray87, arg2.aShortArray129, arg2.aShortArray128, arg2.anIntArray588, arg2.aByte120, arg2.aShortArray127, arg2.anInt8561, arg2.aByteArray85, arg2.aShortArray131, arg2.aShortArray133, arg2.aShortArray124, arg2.anIntArray599, arg2.anIntArray594, arg2.anIntArray595, arg2.aByteArray88, arg2.aByteArray91, arg2.anIntArray590, arg2.anIntArray597, arg2.anIntArray592, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;)V")
	public i(@OriginalArg(0) oa arg0) {
		this.anOa2 = arg0;
		this.aYa1 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
	public native void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) Class42 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!nh;Lclient!gca;I)V")
	@Override
	public void method7335(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class3_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anOa2.method5860().method8(this, arg0, (int[]) null, arg2);
			return;
		}
		Static421.anIntArray459[5] = 0;
		this.anOa2.method5860().method8(this, arg0, Static421.anIntArray459, arg2);
		arg1.anInt3114 = Static421.anIntArray459[0];
		arg1.anInt3111 = Static421.anIntArray459[1];
		arg1.anInt3113 = Static421.anIntArray459[2];
		arg1.anInt3115 = Static421.anIntArray459[3];
		arg1.anInt3112 = Static421.anIntArray459[4];
		arg1.aBoolean234 = Static421.anIntArray459[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
	protected native boolean NA();

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "oa", descriptor = "(Lclient!oa;)V")
	private native void oa(@OriginalArg(0) oa arg0);

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
	@Override
	protected void method7340() {
		if (this.anOa2.anInt6647 > 1) {
			synchronized (this) {
				super.aBoolean661 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
	public native int HA();

	@OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!nh;ZI)Z")
	@Override
	public boolean method7347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class92 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.anOa2.method5860().method9(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class62 method7329(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anOa2.method5860().method4(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public native Class4_Sub5_Sub9 ba(@OriginalArg(0) Class4_Sub5_Sub9 arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!nh;)V")
	private void method3419(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class92 arg1) {
		this.anOa2.method5860().method15(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()[Lclient!ir;")
	@Override
	public Class170[] method7333() {
		return this.aClass170Array2;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()[Lclient!mk;")
	@Override
	public Class235[] method7331() {
		return this.aClass235Array2;
	}

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
	protected native void wa();

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static12.method230(this);
		}
	}

	@OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
	public native void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "B", descriptor = "(JIZ)V")
	private native void B(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!nh;ZII)Z")
	@Override
	public boolean method7341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class92 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.anOa2.method5860().method16(this, arg0, arg1, arg2, arg3, arg5);
	}

	@OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
	public native boolean F();

	@OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method7339(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anOa2.method5860().method5(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()Z")
	@Override
	public boolean method7344() {
		return true;
	}

	@OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
	protected native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Lclient!i;Lclient!i;IZZ)V")
	public native void ZA(@OriginalArg(0) i arg0, @OriginalArg(1) i arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!nh;Lclient!gca;II)V")
	@Override
	public void method7332(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class3_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.anOa2.method5860().method1(this, arg0, (int[]) null, arg2, arg3);
			return;
		}
		Static421.anIntArray459[5] = 0;
		this.anOa2.method5860().method1(this, arg0, Static421.anIntArray459, arg2, arg3);
		arg1.anInt3114 = Static421.anIntArray459[0];
		arg1.anInt3111 = Static421.anIntArray459[1];
		arg1.anInt3113 = Static421.anIntArray459[2];
		arg1.anInt3115 = Static421.anIntArray459[3];
		arg1.anInt3112 = Static421.anIntArray459[4];
		arg1.aBoolean234 = Static421.anIntArray459[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!nh;)V")
	@Override
	public void method7336(@OriginalArg(0) Class92 arg0) {
		this.method3419(Static421.anIntArray457, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass235Array2 != null) {
			for (local10 = 0; local10 < this.aClass235Array2.length; local10++) {
				@Pc(16) Class235 local16 = this.aClass235Array2[local10];
				local16.anInt5628 = Static421.anIntArray457[local5++];
				local16.anInt5637 = Static421.anIntArray457[local5++];
				local16.anInt5632 = Static421.anIntArray457[local5++];
				local16.anInt5627 = Static421.anIntArray457[local5++];
				local16.anInt5629 = Static421.anIntArray457[local5++];
				local16.anInt5623 = Static421.anIntArray457[local5++];
				local16.anInt5624 = Static421.anIntArray457[local5++];
				local16.anInt5626 = Static421.anIntArray457[local5++];
				local16.anInt5636 = Static421.anIntArray457[local5++];
			}
		}
		if (this.aClass170Array2 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass170Array2.length; local10++) {
			@Pc(87) Class170 local87 = this.aClass170Array2[local10];
			@Pc(89) Class170 local89 = local87;
			if (local87.aClass170_2 != null) {
				local89 = local87.aClass170_2;
			}
			if (local87.aClass92_3 == null) {
				local87.aClass92_3 = arg0.method3857();
			} else {
				local87.aClass92_3.method3865(arg0);
			}
			local89.anInt4272 = Static421.anIntArray457[local5++];
			local89.anInt4275 = Static421.anIntArray457[local5++];
			local89.anInt4270 = Static421.anIntArray457[local5++];
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!nh;IZ)V")
	@Override
	public void method7350(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.B(((ja) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
	public native boolean r();

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()V")
	@Override
	public void method7338() {
	}

	@OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
	public native int G();

	@OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
	public native int ua();

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()V")
	@Override
	protected void method7345() {
		if (this.anOa2.anInt6647 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean661) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean661 = true;
		}
	}

	@OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
	public native void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
	public native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7342(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.l(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
	public native void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "R", descriptor = "(Lclient!oa;Lclient!ya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void R(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
	public native int fa();
}
