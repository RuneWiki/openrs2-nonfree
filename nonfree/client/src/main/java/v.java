import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class v extends Class57 implements Interface18 {

	@OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!v", name = "q", descriptor = "Lclient!l;")
	private final l aL3;

	@OriginalMember(owner = "client!v", name = "t", descriptor = "Lclient!m;")
	private final m aM2;

	@OriginalMember(owner = "client!v", name = "r", descriptor = "[Lclient!tk;")
	public Class323[] aClass323Array4;

	@OriginalMember(owner = "client!v", name = "s", descriptor = "[Lclient!aq;")
	public Class15[] aClass15Array4;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!l;Lclient!m;Lclient!nda;IIII)V")
	public v(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) Class226 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aL3 = arg0;
		this.aM2 = arg1;
		this.aClass323Array4 = arg2.aClass323Array3;
		this.aClass15Array4 = arg2.aClass15Array3;
		@Pc(24) int local24 = arg2.aClass323Array3 == null ? 0 : arg2.aClass323Array3.length;
		@Pc(33) int local33 = arg2.aClass15Array3 == null ? 0 : arg2.aClass15Array3.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass323Array4[local44].anInt8095;
			local42[local35++] = this.aClass323Array4[local44].anInt8103;
			local42[local35++] = this.aClass323Array4[local44].anInt8106;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass15Array4[local78].anInt548;
		}
		@Pc(101) int local101 = arg2.aClass161Array1 == null ? 0 : arg2.aClass161Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class161 local116 = arg2.aClass161Array1[local110];
			@Pc(121) Class336 local121 = Static237.method3979(local116.anInt4509);
			local106[local108++] = local116.anInt4511;
			local106[local108++] = local121.anInt8516;
			local106[local108++] = local121.anInt8512;
			local106[local108++] = local121.anInt8507;
			local106[local108++] = local121.anInt8514;
			local106[local108++] = local121.anInt8513;
			local106[local108++] = local121.aBoolean659 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class161 local179 = arg2.aClass161Array1[local173];
			local106[local108++] = local179.anInt4504;
		}
		this.QA(this.aL3, this.aM2, arg2.anInt6119, arg2.anInt6108, arg2.anIntArray483, arg2.anIntArray478, arg2.anIntArray475, arg2.anIntArray485, arg2.aShortArray197, arg2.anInt6105, arg2.aShortArray193, arg2.aShortArray194, arg2.aShortArray195, arg2.aByteArray73, arg2.aByteArray74, arg2.aByteArray76, arg2.aByteArray75, arg2.aShortArray199, arg2.aShortArray200, arg2.anIntArray479, arg2.aByte76, arg2.aShortArray198, arg2.anInt6115, arg2.aByteArray72, arg2.aShortArray202, arg2.aShortArray196, arg2.aShortArray201, arg2.anIntArray482, arg2.anIntArray484, arg2.anIntArray477, arg2.aByteArray77, arg2.aByteArray71, arg2.anIntArray480, arg2.anIntArray476, arg2.anIntArray474, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!l;)V")
	public v(@OriginalArg(0) l arg0) {
		this.aL3 = arg0;
		this.aM2 = null;
		this.X(arg0);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BIZ)Lclient!da;")
	@Override
	public Class57 method7522(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.aL3.method4630().method6010(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "()V")
	@Override
	public void method7517() {
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!v", name = "I", descriptor = "(JI[IIIIIZ)V")
	private native void I(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!v", name = "TA", descriptor = "()I")
	public native int TA();

	@OriginalMember(owner = "client!v", name = "R", descriptor = "(III)V")
	public native void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!v", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	@Override
	public void method7524(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aL3.method4630().i(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!v", name = "L", descriptor = "()V")
	protected native void L();

	@OriginalMember(owner = "client!v", name = "OA", descriptor = "()I")
	public native int OA();

	@OriginalMember(owner = "client!v", name = "H", descriptor = "()I")
	public native int H();

	@OriginalMember(owner = "client!v", name = "PA", descriptor = "()I")
	public native int PA();

	@OriginalMember(owner = "client!v", name = "W", descriptor = "(I)V")
	public native void W(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "MA", descriptor = "(I)V")
	public native void MA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "n", descriptor = "(Lclient!v;Lclient!v;IZZ)V")
	public native void n(@OriginalArg(0) v arg0, @OriginalArg(1) v arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!q;Lclient!ql;I)V")
	@Override
	public void method7501(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class9_Sub9 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aL3.method4630().LA(this, arg0, null, arg2);
			return;
		}
		Static289.anIntArray399[5] = 0;
		this.aL3.method4630().LA(this, arg0, Static289.anIntArray399, arg2);
		arg1.anInt7169 = Static289.anIntArray399[0];
		arg1.anInt7173 = Static289.anIntArray399[1];
		arg1.anInt7170 = Static289.anIntArray399[2];
		arg1.anInt7171 = Static289.anIntArray399[3];
		arg1.anInt7172 = Static289.anIntArray399[4];
		arg1.aBoolean567 = Static289.anIntArray399[5] != 0;
	}

	@OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static401.method5840(this);
		}
	}

	@OriginalMember(owner = "client!v", name = "KA", descriptor = "()I")
	public native int KA();

	@OriginalMember(owner = "client!v", name = "b", descriptor = "()V")
	@Override
	protected void method7508() {
		if (this.aL3.anInt5303 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean706) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean706 = true;
		}
	}

	@OriginalMember(owner = "client!v", name = "J", descriptor = "()I")
	public native int J();

	@OriginalMember(owner = "client!v", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	public native void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class139 arg2, @OriginalArg(3) Class139 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!v", name = "SA", descriptor = "(I)V")
	public native void SA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "d", descriptor = "()[Lclient!aq;")
	@Override
	public Class15[] method7516() {
		return this.aClass15Array4;
	}

	@OriginalMember(owner = "client!v", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!v", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!v", name = "ga", descriptor = "(I)V")
	public native void ga(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "B", descriptor = "(I[IIIIZI[I)V")
	protected native void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7525(@OriginalArg(0) Class109 arg0) {
		this.method7366(Static289.anIntArray397, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass323Array4 != null) {
			for (local10 = 0; local10 < this.aClass323Array4.length; local10++) {
				@Pc(16) Class323 local16 = this.aClass323Array4[local10];
				local16.anInt8107 = Static289.anIntArray397[local5++];
				local16.anInt8098 = Static289.anIntArray397[local5++];
				local16.anInt8093 = Static289.anIntArray397[local5++];
				local16.anInt8101 = Static289.anIntArray397[local5++];
				local16.anInt8094 = Static289.anIntArray397[local5++];
				local16.anInt8109 = Static289.anIntArray397[local5++];
				local16.anInt8092 = Static289.anIntArray397[local5++];
				local16.anInt8108 = Static289.anIntArray397[local5++];
				local16.anInt8104 = Static289.anIntArray397[local5++];
			}
		}
		if (this.aClass15Array4 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass15Array4.length; local10++) {
			@Pc(87) Class15 local87 = this.aClass15Array4[local10];
			@Pc(89) Class15 local89 = local87;
			if (local87.aClass15_1 != null) {
				local89 = local87.aClass15_1;
			}
			if (local87.aClass109_1 == null) {
				local87.aClass109_1 = arg0.method7100();
			} else {
				local87.aClass109_1.M(arg0);
			}
			local89.anInt549 = Static289.anIntArray397[local5++];
			local89.anInt538 = Static289.anIntArray397[local5++];
			local89.anInt541 = Static289.anIntArray397[local5++];
		}
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "()Z")
	@Override
	public boolean method7526() {
		return true;
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(SS)V")
	public native void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!q;Lclient!ql;II)V")
	@Override
	public void method7521(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class9_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.aL3.method4630().J(this, arg0, null, arg2, arg3);
			return;
		}
		Static289.anIntArray399[5] = 0;
		this.aL3.method4630().J(this, arg0, Static289.anIntArray399, arg2, arg3);
		arg1.anInt7169 = Static289.anIntArray399[0];
		arg1.anInt7173 = Static289.anIntArray399[1];
		arg1.anInt7170 = Static289.anIntArray399[2];
		arg1.anInt7171 = Static289.anIntArray399[3];
		arg1.anInt7172 = Static289.anIntArray399[4];
		arg1.aBoolean567 = Static289.anIntArray399[5] != 0;
	}

	@OriginalMember(owner = "client!v", name = "FA", descriptor = "()V")
	public native void FA();

	@OriginalMember(owner = "client!v", name = "QA", descriptor = "(Lclient!l;Lclient!m;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void QA(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!v", name = "X", descriptor = "(Lclient!l;)V")
	private native void X(@OriginalArg(0) l arg0);

	@OriginalMember(owner = "client!v", name = "WA", descriptor = "(IIII)V")
	protected native void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!v", name = "T", descriptor = "(I)V")
	public native void T(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "za", descriptor = "()I")
	public native int za();

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) boolean arg3) {
		return this.aL3.method4630().XA(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!q;ZI)Z")
	@Override
	public boolean method7509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.aL3.method4630().XA(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!v", name = "l", descriptor = "()I")
	public native int l();

	@OriginalMember(owner = "client!v", name = "M", descriptor = "(I)V")
	public native void M(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "oa", descriptor = "(III)V")
	public native void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!v", name = "LA", descriptor = "()Z")
	public native boolean LA();

	@OriginalMember(owner = "client!v", name = "K", descriptor = "()I")
	public native int K();

	@OriginalMember(owner = "client!v", name = "c", descriptor = "()V")
	@Override
	protected void method7513() {
		if (this.aL3.anInt5303 > 1) {
			synchronized (this) {
				super.aBoolean706 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([ILclient!q;)V")
	private void method7366(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class109 arg1) {
		this.aL3.method4630().s(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!v", name = "fa", descriptor = "(I)V")
	public native void fa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "F", descriptor = "()Z")
	protected native boolean F();

	@OriginalMember(owner = "client!v", name = "a", descriptor = "()[Lclient!tk;")
	@Override
	public Class323[] method7503() {
		return this.aClass323Array4;
	}

	@OriginalMember(owner = "client!v", name = "DA", descriptor = "(SS)V")
	public native void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7502(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.I(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!v", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	public native Class3_Sub3_Sub10 S(@OriginalArg(0) Class3_Sub3_Sub10 arg0);
}
