import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class v extends Class66 implements Interface21 {

	@OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!v", name = "r", descriptor = "Lclient!l;")
	private final l aL3;

	@OriginalMember(owner = "client!v", name = "p", descriptor = "Lclient!m;")
	private final m aM2;

	@OriginalMember(owner = "client!v", name = "s", descriptor = "[Lclient!hi;")
	public Class139[] aClass139Array4;

	@OriginalMember(owner = "client!v", name = "q", descriptor = "[Lclient!qg;")
	public Class270[] aClass270Array4;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!l;Lclient!m;Lclient!eg;IIII)V")
	public v(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aL3 = arg0;
		this.aM2 = arg1;
		this.aClass139Array4 = arg2.aClass139Array1;
		this.aClass270Array4 = arg2.aClass270Array1;
		@Pc(24) int local24 = arg2.aClass139Array1 == null ? 0 : arg2.aClass139Array1.length;
		@Pc(33) int local33 = arg2.aClass270Array1 == null ? 0 : arg2.aClass270Array1.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass139Array4[local44].anInt3911;
			local42[local35++] = this.aClass139Array4[local44].anInt3913;
			local42[local35++] = this.aClass139Array4[local44].anInt3912;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass270Array4[local78].anInt7311;
		}
		@Pc(101) int local101 = arg2.aClass214Array1 == null ? 0 : arg2.aClass214Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class214 local116 = arg2.aClass214Array1[local110];
			@Pc(121) Class55 local121 = Static276.method3098(local116.anInt5958);
			local106[local108++] = local116.anInt5956;
			local106[local108++] = local121.anInt1474;
			local106[local108++] = local121.anInt1480;
			local106[local108++] = local121.anInt1476;
			local106[local108++] = local121.anInt1473;
			local106[local108++] = local121.anInt1479;
			local106[local108++] = local121.aBoolean108 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class214 local179 = arg2.aClass214Array1[local173];
			local106[local108++] = local179.anInt5959;
		}
		this.QA(this.aL3, this.aM2, arg2.anInt2348, arg2.anInt2343, arg2.anIntArray148, arg2.anIntArray155, arg2.anIntArray152, arg2.anIntArray151, arg2.aShortArray28, arg2.anInt2351, arg2.aShortArray35, arg2.aShortArray31, arg2.aShortArray27, arg2.aByteArray31, arg2.aByteArray28, arg2.aByteArray27, arg2.aByteArray26, arg2.aShortArray36, arg2.aShortArray33, arg2.anIntArray149, arg2.aByte41, arg2.aShortArray34, arg2.anInt2356, arg2.aByteArray30, arg2.aShortArray30, arg2.aShortArray29, arg2.aShortArray32, arg2.anIntArray153, arg2.anIntArray146, arg2.anIntArray150, arg2.aByteArray32, arg2.aByteArray29, arg2.anIntArray154, arg2.anIntArray147, arg2.anIntArray145, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!l;)V")
	public v(@OriginalArg(0) l arg0) {
		this.aL3 = arg0;
		this.aM2 = null;
		this.X(arg0);
	}

	@OriginalMember(owner = "client!v", name = "X", descriptor = "(Lclient!l;)V")
	private native void X(@OriginalArg(0) l arg0);

	@OriginalMember(owner = "client!v", name = "QA", descriptor = "(Lclient!l;Lclient!m;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void QA(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!v", name = "LA", descriptor = "()Z")
	public native boolean LA();

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BIZ)Lclient!da;")
	@Override
	public Class66 method7551(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.aL3.method4479().method6045(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!q;Lclient!pba;I)V")
	@Override
	public void method7558(@OriginalArg(0) Class68 arg0, @OriginalArg(1) Class6_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aL3.method4479().LA(this, arg0, null, arg2);
			return;
		}
		Static294.anIntArray375[5] = 0;
		this.aL3.method4479().LA(this, arg0, Static294.anIntArray375, arg2);
		arg1.anInt6925 = Static294.anIntArray375[0];
		arg1.anInt6922 = Static294.anIntArray375[1];
		arg1.anInt6926 = Static294.anIntArray375[2];
		arg1.anInt6923 = Static294.anIntArray375[3];
		arg1.anInt6924 = Static294.anIntArray375[4];
		arg1.aBoolean539 = Static294.anIntArray375[5] != 0;
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(SS)V")
	public native void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	@Override
	public void method7553(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aL3.method4479().i(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!v", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class68 arg2, @OriginalArg(3) boolean arg3) {
		return this.aL3.method4479().XA(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "()[Lclient!qg;")
	@Override
	public Class270[] method7561() {
		return this.aClass270Array4;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7552(@OriginalArg(0) Class68 arg0) {
		this.method7526(Static294.anIntArray374, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass139Array4 != null) {
			for (local10 = 0; local10 < this.aClass139Array4.length; local10++) {
				@Pc(16) Class139 local16 = this.aClass139Array4[local10];
				local16.anInt3916 = Static294.anIntArray374[local5++];
				local16.anInt3908 = Static294.anIntArray374[local5++];
				local16.anInt3917 = Static294.anIntArray374[local5++];
				local16.anInt3909 = Static294.anIntArray374[local5++];
				local16.anInt3910 = Static294.anIntArray374[local5++];
				local16.anInt3918 = Static294.anIntArray374[local5++];
				local16.anInt3923 = Static294.anIntArray374[local5++];
				local16.anInt3920 = Static294.anIntArray374[local5++];
				local16.anInt3919 = Static294.anIntArray374[local5++];
			}
		}
		if (this.aClass270Array4 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass270Array4.length; local10++) {
			@Pc(87) Class270 local87 = this.aClass270Array4[local10];
			@Pc(89) Class270 local89 = local87;
			if (local87.aClass270_2 != null) {
				local89 = local87.aClass270_2;
			}
			if (local87.aClass68_6 == null) {
				local87.aClass68_6 = arg0.method6462();
			} else {
				local87.aClass68_6.M(arg0);
			}
			local89.anInt7321 = Static294.anIntArray374[local5++];
			local89.anInt7314 = Static294.anIntArray374[local5++];
			local89.anInt7320 = Static294.anIntArray374[local5++];
		}
	}

	@OriginalMember(owner = "client!v", name = "B", descriptor = "(I[IIIIZI[I)V")
	protected native void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!v", name = "fa", descriptor = "(I)V")
	public native void fa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "K", descriptor = "()I")
	public native int K();

	@OriginalMember(owner = "client!v", name = "MA", descriptor = "(I)V")
	public native void MA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "OA", descriptor = "()I")
	public native int OA();

	@OriginalMember(owner = "client!v", name = "b", descriptor = "()Z")
	@Override
	public boolean method7549() {
		return true;
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "()V")
	@Override
	protected void method7557() {
		if (this.aL3.anInt5334 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean691) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean691 = true;
		}
	}

	@OriginalMember(owner = "client!v", name = "R", descriptor = "(III)V")
	public native void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!v", name = "M", descriptor = "(I)V")
	public native void M(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
	@Override
	public void method7546() {
	}

	@OriginalMember(owner = "client!v", name = "T", descriptor = "(I)V")
	public native void T(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "za", descriptor = "()I")
	public native int za();

	@OriginalMember(owner = "client!v", name = "WA", descriptor = "(IIII)V")
	protected native void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!v", name = "W", descriptor = "(I)V")
	public native void W(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "J", descriptor = "()I")
	public native int J();

	@OriginalMember(owner = "client!v", name = "PA", descriptor = "()I")
	public native int PA();

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([ILclient!q;)V")
	private void method7526(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class68 arg1) {
		this.aL3.method4479().s(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!q;ZI)Z")
	@Override
	public boolean method7547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class68 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.aL3.method4479().XA(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!v", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	public native void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(3) Class67 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static214.method3448(this);
		}
	}

	@OriginalMember(owner = "client!v", name = "L", descriptor = "()V")
	protected native void L();

	@OriginalMember(owner = "client!v", name = "F", descriptor = "()Z")
	protected native boolean F();

	@OriginalMember(owner = "client!v", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!v", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	public native Class2_Sub3_Sub6 S(@OriginalArg(0) Class2_Sub3_Sub6 arg0);

	@OriginalMember(owner = "client!v", name = "oa", descriptor = "(III)V")
	public native void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!v", name = "ga", descriptor = "(I)V")
	public native void ga(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "c", descriptor = "()[Lclient!hi;")
	@Override
	public Class139[] method7550() {
		return this.aClass139Array4;
	}

	@OriginalMember(owner = "client!v", name = "I", descriptor = "(JI[IIIIIZ)V")
	private native void I(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7545(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.I(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!v", name = "FA", descriptor = "()V")
	public native void FA();

	@OriginalMember(owner = "client!v", name = "TA", descriptor = "()I")
	public native int TA();

	@OriginalMember(owner = "client!v", name = "SA", descriptor = "(I)V")
	public native void SA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "KA", descriptor = "()I")
	public native int KA();

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!q;Lclient!pba;II)V")
	@Override
	public void method7556(@OriginalArg(0) Class68 arg0, @OriginalArg(1) Class6_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.aL3.method4479().J(this, arg0, null, arg2, arg3);
			return;
		}
		Static294.anIntArray375[5] = 0;
		this.aL3.method4479().J(this, arg0, Static294.anIntArray375, arg2, arg3);
		arg1.anInt6925 = Static294.anIntArray375[0];
		arg1.anInt6922 = Static294.anIntArray375[1];
		arg1.anInt6926 = Static294.anIntArray375[2];
		arg1.anInt6923 = Static294.anIntArray375[3];
		arg1.anInt6924 = Static294.anIntArray375[4];
		arg1.aBoolean539 = Static294.anIntArray375[5] != 0;
	}

	@OriginalMember(owner = "client!v", name = "l", descriptor = "()I")
	public native int l();

	@OriginalMember(owner = "client!v", name = "n", descriptor = "(Lclient!v;Lclient!v;IZZ)V")
	public native void n(@OriginalArg(0) v arg0, @OriginalArg(1) v arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!v", name = "H", descriptor = "()I")
	public native int H();

	@OriginalMember(owner = "client!v", name = "d", descriptor = "()V")
	@Override
	protected void method7555() {
		if (this.aL3.anInt5334 > 1) {
			synchronized (this) {
				super.aBoolean691 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "DA", descriptor = "(SS)V")
	public native void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!v", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);
}
