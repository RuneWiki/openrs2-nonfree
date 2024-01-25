import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class187 implements Interface4 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!i", name = "m", descriptor = "Lclient!oa;")
	private final oa anOa2;

	@OriginalMember(owner = "client!i", name = "j", descriptor = "Lclient!ya;")
	private final ya aYa1;

	@OriginalMember(owner = "client!i", name = "l", descriptor = "[Lclient!ou;")
	public Class261[] aClass261Array2;

	@OriginalMember(owner = "client!i", name = "k", descriptor = "[Lclient!sn;")
	public Class320[] aClass320Array2;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!b;IIII)V")
	public i(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anOa2 = arg0;
		this.aYa1 = arg1;
		this.aClass261Array2 = arg2.aClass261Array1;
		this.aClass320Array2 = arg2.aClass320Array1;
		@Pc(24) int local24 = arg2.aClass261Array1 == null ? 0 : arg2.aClass261Array1.length;
		@Pc(33) int local33 = arg2.aClass320Array1 == null ? 0 : arg2.aClass320Array1.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass261Array2[local44].anInt7181;
			local42[local35++] = this.aClass261Array2[local44].anInt7170;
			local42[local35++] = this.aClass261Array2[local44].anInt7167;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass320Array2[local78].anInt8924;
		}
		@Pc(101) int local101 = arg2.aClass257Array1 == null ? 0 : arg2.aClass257Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class257 local116 = arg2.aClass257Array1[local110];
			@Pc(121) Class70 local121 = Static128.method59(local116.anInt6691);
			local106[local108++] = local116.anInt6698;
			local106[local108++] = local121.anInt1882;
			local106[local108++] = local121.anInt1884;
			local106[local108++] = local121.anInt1880;
			local106[local108++] = local121.anInt1883;
			local106[local108++] = local121.anInt1881;
			local106[local108++] = local121.aBoolean138 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class257 local179 = arg2.aClass257Array1[local173];
			local106[local108++] = local179.anInt6693;
		}
		this.R(this.anOa2, this.aYa1, arg2.anInt386, arg2.anInt377, arg2.anIntArray16, arg2.anIntArray22, arg2.anIntArray17, arg2.anIntArray26, arg2.aShortArray14, arg2.anInt390, arg2.aShortArray9, arg2.aShortArray17, arg2.aShortArray18, arg2.aByteArray7, arg2.aByteArray4, arg2.aByteArray10, arg2.aByteArray9, arg2.aShortArray15, arg2.aShortArray16, arg2.anIntArray23, arg2.aByte6, arg2.aShortArray11, arg2.anInt382, arg2.aByteArray5, arg2.aShortArray13, arg2.aShortArray12, arg2.aShortArray10, arg2.anIntArray24, arg2.anIntArray25, arg2.anIntArray19, arg2.aByteArray6, arg2.aByteArray8, arg2.anIntArray21, arg2.anIntArray15, arg2.anIntArray18, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;)V")
	public i(@OriginalArg(0) oa arg0) {
		this.anOa2 = arg0;
		this.aYa1 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
	public native int ua();

	@OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
	public native void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
	public native void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()[Lclient!ou;")
	@Override
	public Class261[] method8650() {
		return this.aClass261Array2;
	}

	@OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
	public native boolean r();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!tc;ZII)Z")
	@Override
	public boolean method8641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.anOa2.method5773().method6(this, arg0, arg1, arg2, arg3, arg5);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!tc;ZI)Z")
	@Override
	public boolean method8642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.anOa2.method5773().method3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()Z")
	@Override
	public boolean method8649() {
		return true;
	}

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class61 arg2, @OriginalArg(3) Class61 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
	@Override
	public void method8651() {
	}

	@OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public native Class5_Sub5_Sub14 ba(@OriginalArg(0) Class5_Sub5_Sub14 arg0);

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!tc;)V")
	private void method3762(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class113 arg1) {
		this.anOa2.method5773().method7(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method8657(@OriginalArg(0) Class187 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anOa2.method5773().method4(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
	protected native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Lclient!i;Lclient!i;IZZ)V")
	public native void ZA(@OriginalArg(0) i arg0, @OriginalArg(1) i arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
	public native int HA();

	@OriginalMember(owner = "client!i", name = "R", descriptor = "(Lclient!oa;Lclient!ya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void R(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!tc;Lclient!qw;I)V")
	@Override
	public void method8645(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class4_Sub9 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anOa2.method5773().method13(this, arg0, null, arg2);
			return;
		}
		Static388.anIntArray360[5] = 0;
		this.anOa2.method5773().method13(this, arg0, Static388.anIntArray360, arg2);
		arg1.anInt7890 = Static388.anIntArray360[0];
		arg1.anInt7892 = Static388.anIntArray360[1];
		arg1.anInt7893 = Static388.anIntArray360[2];
		arg1.anInt7891 = Static388.anIntArray360[3];
		arg1.anInt7894 = Static388.anIntArray360[4];
		arg1.aBoolean558 = Static388.anIntArray360[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!tc;)V")
	@Override
	public void method8638(@OriginalArg(0) Class113 arg0) {
		this.method3762(Static388.anIntArray358, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass261Array2 != null) {
			for (local10 = 0; local10 < this.aClass261Array2.length; local10++) {
				@Pc(16) Class261 local16 = this.aClass261Array2[local10];
				local16.anInt7176 = Static388.anIntArray358[local5++];
				local16.anInt7169 = Static388.anIntArray358[local5++];
				local16.anInt7182 = Static388.anIntArray358[local5++];
				local16.anInt7180 = Static388.anIntArray358[local5++];
				local16.anInt7173 = Static388.anIntArray358[local5++];
				local16.anInt7166 = Static388.anIntArray358[local5++];
				local16.anInt7177 = Static388.anIntArray358[local5++];
				local16.anInt7168 = Static388.anIntArray358[local5++];
				local16.anInt7174 = Static388.anIntArray358[local5++];
			}
		}
		if (this.aClass320Array2 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass320Array2.length; local10++) {
			@Pc(87) Class320 local87 = this.aClass320Array2[local10];
			@Pc(89) Class320 local89 = local87;
			if (local87.aClass320_2 != null) {
				local89 = local87.aClass320_2;
			}
			if (local87.aClass113_8 == null) {
				local87.aClass113_8 = arg0.method8446();
			} else {
				local87.aClass113_8.method8456(arg0);
			}
			local89.anInt8926 = Static388.anIntArray358[local5++];
			local89.anInt8923 = Static388.anIntArray358[local5++];
			local89.anInt8925 = Static388.anIntArray358[local5++];
		}
	}

	@OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
	public native boolean F();

	@OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
	public native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
	protected native boolean NA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!tc;IZ)V")
	@Override
	public void method8659(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.D(((ja) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method8647(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.l(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
	protected native void wa();

	@OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
	public native void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "oa", descriptor = "(Lclient!oa;)V")
	private native void oa(@OriginalArg(0) oa arg0);

	@OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class187 method8656(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anOa2.method5773().method1(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!tc;Lclient!qw;II)V")
	@Override
	public void method8654(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class4_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.anOa2.method5773().method5(this, arg0, null, arg2, arg3);
			return;
		}
		Static388.anIntArray360[5] = 0;
		this.anOa2.method5773().method5(this, arg0, Static388.anIntArray360, arg2, arg3);
		arg1.anInt7890 = Static388.anIntArray360[0];
		arg1.anInt7892 = Static388.anIntArray360[1];
		arg1.anInt7893 = Static388.anIntArray360[2];
		arg1.anInt7891 = Static388.anIntArray360[3];
		arg1.anInt7894 = Static388.anIntArray360[4];
		arg1.aBoolean558 = Static388.anIntArray360[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()V")
	@Override
	protected void method8653() {
		if (this.anOa2.anInt6433 > 1) {
			synchronized (this) {
				super.aBoolean726 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "D", descriptor = "(JIZ)V")
	private native void D(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()V")
	@Override
	protected void method8658() {
		if (this.anOa2.anInt6433 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean726) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean726 = true;
		}
	}

	@OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
	public native int G();

	@OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
	public native void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()[Lclient!sn;")
	@Override
	public Class320[] method8636() {
		return this.aClass320Array2;
	}

	@OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static544.method7969(this);
		}
	}
}
