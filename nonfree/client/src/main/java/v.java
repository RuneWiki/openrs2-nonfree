import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class v extends Class52 implements Interface17 {

	@OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!v", name = "o", descriptor = "Lclient!l;")
	private final l aL3;

	@OriginalMember(owner = "client!v", name = "p", descriptor = "Lclient!m;")
	private final m aM2;

	@OriginalMember(owner = "client!v", name = "q", descriptor = "[Lclient!ti;")
	public Class317[] aClass317Array5;

	@OriginalMember(owner = "client!v", name = "n", descriptor = "[Lclient!rea;")
	public Class280[] aClass280Array5;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!l;Lclient!m;Lclient!uo;IIII)V")
	public v(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) Class332 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aL3 = arg0;
		this.aM2 = arg1;
		this.aClass317Array5 = arg2.aClass317Array4;
		this.aClass280Array5 = arg2.aClass280Array4;
		@Pc(24) int local24 = arg2.aClass317Array4 == null ? 0 : arg2.aClass317Array4.length;
		@Pc(33) int local33 = arg2.aClass280Array4 == null ? 0 : arg2.aClass280Array4.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass317Array5[local44].anInt8871;
			local42[local35++] = this.aClass317Array5[local44].anInt8874;
			local42[local35++] = this.aClass317Array5[local44].anInt8867;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass280Array5[local78].anInt7963;
		}
		@Pc(101) int local101 = arg2.aClass10Array1 == null ? 0 : arg2.aClass10Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class10 local116 = arg2.aClass10Array1[local110];
			@Pc(121) Class75 local121 = Static487.method6594(local116.anInt89);
			local106[local108++] = local116.anInt88;
			local106[local108++] = local121.anInt2600;
			local106[local108++] = local121.anInt2602;
			local106[local108++] = local121.anInt2593;
			local106[local108++] = local121.anInt2592;
			local106[local108++] = local121.anInt2601;
			local106[local108++] = local121.aBoolean183 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class10 local179 = arg2.aClass10Array1[local173];
			local106[local108++] = local179.anInt85;
		}
		this.QA(this.aL3, this.aM2, arg2.anInt9541, arg2.anInt9546, arg2.anIntArray555, arg2.anIntArray550, arg2.anIntArray548, arg2.anIntArray553, arg2.aShortArray134, arg2.anInt9552, arg2.aShortArray135, arg2.aShortArray138, arg2.aShortArray137, arg2.aByteArray223, arg2.aByteArray227, arg2.aByteArray224, arg2.aByteArray228, arg2.aShortArray136, arg2.aShortArray132, arg2.anIntArray552, arg2.aByte126, arg2.aShortArray131, arg2.anInt9553, arg2.aByteArray229, arg2.aShortArray133, arg2.aShortArray140, arg2.aShortArray139, arg2.anIntArray556, arg2.anIntArray549, arg2.anIntArray554, arg2.aByteArray226, arg2.aByteArray225, arg2.anIntArray546, arg2.anIntArray551, arg2.anIntArray547, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!l;)V")
	public v(@OriginalArg(0) l arg0) {
		this.aL3 = arg0;
		this.aM2 = null;
		this.X(arg0);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([ILclient!q;)V")
	private void method7637(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class42 arg1) {
		this.aL3.method4510().s(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static41.method1086(this);
		}
	}

	@OriginalMember(owner = "client!v", name = "za", descriptor = "()I")
	public native int za();

	@OriginalMember(owner = "client!v", name = "b", descriptor = "()V")
	@Override
	protected void method7615() {
		if (this.aL3.anInt5537 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean640) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean640 = true;
		}
	}

	@OriginalMember(owner = "client!v", name = "SA", descriptor = "(I)V")
	public native void SA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "fa", descriptor = "(I)V")
	public native void fa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "()[Lclient!ti;")
	@Override
	public Class317[] method7613() {
		return this.aClass317Array5;
	}

	@OriginalMember(owner = "client!v", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	public native Class3_Sub7_Sub3 S(@OriginalArg(0) Class3_Sub7_Sub3 arg0);

	@OriginalMember(owner = "client!v", name = "L", descriptor = "()V")
	protected native void L();

	@OriginalMember(owner = "client!v", name = "OA", descriptor = "()I")
	public native int OA();

	@OriginalMember(owner = "client!v", name = "c", descriptor = "()V")
	@Override
	public void method7624() {
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) boolean arg3) {
		return this.aL3.method4510().XA(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!q;IZ)V")
	@Override
	public void method7629(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.U(((ra) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!v", name = "U", descriptor = "(JIZ)V")
	private native void U(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!v", name = "MA", descriptor = "(I)V")
	public native void MA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "I", descriptor = "(JI[IIIIIZ)V")
	private native void I(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BIZ)Lclient!da;")
	@Override
	public Class52 method7618(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.aL3.method4510().method5879(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!v", name = "KA", descriptor = "()I")
	public native int KA();

	@OriginalMember(owner = "client!v", name = "J", descriptor = "()I")
	public native int J();

	@OriginalMember(owner = "client!v", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!v", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!v", name = "K", descriptor = "()I")
	public native int K();

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!q;Lclient!b;II)V")
	@Override
	public void method7619(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class25_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.aL3.method4510().J(this, arg0, null, arg2, arg3);
			return;
		}
		Static296.anIntArray266[5] = 0;
		this.aL3.method4510().J(this, arg0, Static296.anIntArray266, arg2, arg3);
		arg1.anInt317 = Static296.anIntArray266[0];
		arg1.anInt314 = Static296.anIntArray266[1];
		arg1.anInt318 = Static296.anIntArray266[2];
		arg1.anInt316 = Static296.anIntArray266[3];
		arg1.anInt315 = Static296.anIntArray266[4];
		arg1.aBoolean21 = Static296.anIntArray266[5] != 0;
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "()Z")
	@Override
	public boolean method7632() {
		return true;
	}

	@OriginalMember(owner = "client!v", name = "l", descriptor = "()I")
	public native int l();

	@OriginalMember(owner = "client!v", name = "LA", descriptor = "()Z")
	public native boolean LA();

	@OriginalMember(owner = "client!v", name = "oa", descriptor = "(III)V")
	public native void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!v", name = "TA", descriptor = "()I")
	public native int TA();

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7614(@OriginalArg(0) Class42 arg0) {
		this.method7637(Static296.anIntArray267, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass317Array5 != null) {
			for (local10 = 0; local10 < this.aClass317Array5.length; local10++) {
				@Pc(16) Class317 local16 = this.aClass317Array5[local10];
				local16.anInt8865 = Static296.anIntArray267[local5++];
				local16.anInt8863 = Static296.anIntArray267[local5++];
				local16.anInt8875 = Static296.anIntArray267[local5++];
				local16.anInt8862 = Static296.anIntArray267[local5++];
				local16.anInt8872 = Static296.anIntArray267[local5++];
				local16.anInt8868 = Static296.anIntArray267[local5++];
				local16.anInt8864 = Static296.anIntArray267[local5++];
				local16.anInt8877 = Static296.anIntArray267[local5++];
				local16.anInt8879 = Static296.anIntArray267[local5++];
			}
		}
		if (this.aClass280Array5 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass280Array5.length; local10++) {
			@Pc(87) Class280 local87 = this.aClass280Array5[local10];
			@Pc(89) Class280 local89 = local87;
			if (local87.aClass280_2 != null) {
				local89 = local87.aClass280_2;
			}
			if (local87.aClass42_5 == null) {
				local87.aClass42_5 = arg0.method7519();
			} else {
				local87.aClass42_5.M(arg0);
			}
			local89.anInt7965 = Static296.anIntArray267[local5++];
			local89.anInt7971 = Static296.anIntArray267[local5++];
			local89.anInt7964 = Static296.anIntArray267[local5++];
		}
	}

	@OriginalMember(owner = "client!v", name = "T", descriptor = "(I)V")
	public native void T(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "DA", descriptor = "(SS)V")
	public native void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!v", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	public native void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!v", name = "X", descriptor = "(Lclient!l;)V")
	private native void X(@OriginalArg(0) l arg0);

	@OriginalMember(owner = "client!v", name = "d", descriptor = "()V")
	@Override
	protected void method7628() {
		if (this.aL3.anInt5537 > 1) {
			synchronized (this) {
				super.aBoolean640 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "FA", descriptor = "()V")
	public native void FA();

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	@Override
	public void method7634(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aL3.method4510().i(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7625(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.I(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!v", name = "F", descriptor = "()Z")
	protected native boolean F();

	@OriginalMember(owner = "client!v", name = "n", descriptor = "(Lclient!v;Lclient!v;IZZ)V")
	public native void n(@OriginalArg(0) v arg0, @OriginalArg(1) v arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "()[Lclient!rea;")
	@Override
	public Class280[] method7636() {
		return this.aClass280Array5;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!q;ZI)Z")
	@Override
	public boolean method7612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.aL3.method4510().XA(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!v", name = "QA", descriptor = "(Lclient!l;Lclient!m;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void QA(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(SS)V")
	public native void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!v", name = "ga", descriptor = "(I)V")
	public native void ga(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "W", descriptor = "(I)V")
	public native void W(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "R", descriptor = "(III)V")
	public native void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!v", name = "B", descriptor = "(I[IIIIZI[I)V")
	protected native void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!v", name = "M", descriptor = "(I)V")
	public native void M(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "H", descriptor = "()I")
	public native int H();

	@OriginalMember(owner = "client!v", name = "WA", descriptor = "(IIII)V")
	protected native void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!v", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!q;Lclient!b;I)V")
	@Override
	public void method7617(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class25_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aL3.method4510().LA(this, arg0, null, arg2);
			return;
		}
		Static296.anIntArray266[5] = 0;
		this.aL3.method4510().LA(this, arg0, Static296.anIntArray266, arg2);
		arg1.anInt317 = Static296.anIntArray266[0];
		arg1.anInt314 = Static296.anIntArray266[1];
		arg1.anInt318 = Static296.anIntArray266[2];
		arg1.anInt316 = Static296.anIntArray266[3];
		arg1.anInt315 = Static296.anIntArray266[4];
		arg1.aBoolean21 = Static296.anIntArray266[5] != 0;
	}

	@OriginalMember(owner = "client!v", name = "PA", descriptor = "()I")
	public native int PA();
}
