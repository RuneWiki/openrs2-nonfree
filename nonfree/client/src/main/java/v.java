import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class v extends Class52 implements Interface19 {

	@OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!v", name = "q", descriptor = "Lclient!l;")
	private final l aL3;

	@OriginalMember(owner = "client!v", name = "p", descriptor = "Lclient!m;")
	private final m aM2;

	@OriginalMember(owner = "client!v", name = "o", descriptor = "[Lclient!ns;")
	public Class244[] aClass244Array5;

	@OriginalMember(owner = "client!v", name = "n", descriptor = "[Lclient!lp;")
	public Class212[] aClass212Array5;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!l;Lclient!m;Lclient!nba;IIII)V")
	public v(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) Class231 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aL3 = arg0;
		this.aM2 = arg1;
		this.aClass244Array5 = arg2.aClass244Array1;
		this.aClass212Array5 = arg2.aClass212Array1;
		@Pc(24) int local24 = arg2.aClass244Array1 == null ? 0 : arg2.aClass244Array1.length;
		@Pc(33) int local33 = arg2.aClass212Array1 == null ? 0 : arg2.aClass212Array1.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass244Array5[local44].anInt6527;
			local42[local35++] = this.aClass244Array5[local44].anInt6532;
			local42[local35++] = this.aClass244Array5[local44].anInt6530;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass212Array5[local78].anInt5656;
		}
		@Pc(101) int local101 = arg2.aClass362Array1 == null ? 0 : arg2.aClass362Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class362 local116 = arg2.aClass362Array1[local110];
			@Pc(121) Class299 local121 = Static540.method7344(local116.anInt9626);
			local106[local108++] = local116.anInt9627;
			local106[local108++] = local121.anInt7990;
			local106[local108++] = local121.anInt7991;
			local106[local108++] = local121.anInt7984;
			local106[local108++] = local121.anInt7988;
			local106[local108++] = local121.anInt7989;
			local106[local108++] = local121.aBoolean608 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class362 local179 = arg2.aClass362Array1[local173];
			local106[local108++] = local179.anInt9630;
		}
		this.QA(this.aL3, this.aM2, arg2.anInt6251, arg2.anInt6260, arg2.anIntArray372, arg2.anIntArray375, arg2.anIntArray366, arg2.anIntArray367, arg2.aShortArray53, arg2.anInt6268, arg2.aShortArray55, arg2.aShortArray61, arg2.aShortArray52, arg2.aByteArray61, arg2.aByteArray60, arg2.aByteArray62, arg2.aByteArray64, arg2.aShortArray59, arg2.aShortArray51, arg2.anIntArray370, arg2.aByte86, arg2.aShortArray56, arg2.anInt6267, arg2.aByteArray59, arg2.aShortArray57, arg2.aShortArray58, arg2.aShortArray54, arg2.anIntArray374, arg2.anIntArray369, arg2.anIntArray373, arg2.aByteArray63, arg2.aByteArray58, arg2.anIntArray368, arg2.anIntArray365, arg2.anIntArray371, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!l;)V")
	public v(@OriginalArg(0) l arg0) {
		this.aL3 = arg0;
		this.aM2 = null;
		this.X(arg0);
	}

	@OriginalMember(owner = "client!v", name = "B", descriptor = "(I[IIIIZI[I)V")
	protected native void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!q;Lclient!et;I)V")
	@Override
	public void method7413(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class11_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aL3.method4280().LA(this, arg0, null, arg2);
			return;
		}
		Static283.anIntArray299[5] = 0;
		this.aL3.method4280().LA(this, arg0, Static283.anIntArray299, arg2);
		arg1.anInt2556 = Static283.anIntArray299[0];
		arg1.anInt2554 = Static283.anIntArray299[1];
		arg1.anInt2558 = Static283.anIntArray299[2];
		arg1.anInt2557 = Static283.anIntArray299[3];
		arg1.anInt2555 = Static283.anIntArray299[4];
		arg1.aBoolean195 = Static283.anIntArray299[5] != 0;
	}

	@OriginalMember(owner = "client!v", name = "za", descriptor = "()I")
	public native int za();

	@OriginalMember(owner = "client!v", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!v", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	public native void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class129 arg2, @OriginalArg(3) Class129 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!v", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	public native Class1_Sub8_Sub4 S(@OriginalArg(0) Class1_Sub8_Sub4 arg0);

	@OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static37.method673(this);
		}
	}

	@OriginalMember(owner = "client!v", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([ILclient!q;)V")
	private void method7416(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class34 arg1) {
		this.aL3.method4280().s(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "()Z")
	@Override
	public boolean method7409() {
		return true;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!q;IZ)V")
	@Override
	public void method7403(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.E(((ra) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!v", name = "PA", descriptor = "()I")
	public native int PA();

	@OriginalMember(owner = "client!v", name = "E", descriptor = "(JIZ)V")
	private native void E(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!v", name = "LA", descriptor = "()Z")
	public native boolean LA();

	@OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
	@Override
	protected void method7393() {
		if (this.aL3.anInt5220 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean680) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean680 = true;
		}
	}

	@OriginalMember(owner = "client!v", name = "n", descriptor = "(Lclient!v;Lclient!v;IZZ)V")
	public native void n(@OriginalArg(0) v arg0, @OriginalArg(1) v arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!v", name = "l", descriptor = "()I")
	public native int l();

	@OriginalMember(owner = "client!v", name = "T", descriptor = "(I)V")
	public native void T(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) boolean arg3) {
		return this.aL3.method4280().XA(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "()[Lclient!ns;")
	@Override
	public Class244[] method7404() {
		return this.aClass244Array5;
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "()V")
	@Override
	protected void method7399() {
		if (this.aL3.anInt5220 > 1) {
			synchronized (this) {
				super.aBoolean680 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "()V")
	@Override
	public void method7397() {
	}

	@OriginalMember(owner = "client!v", name = "TA", descriptor = "()I")
	public native int TA();

	@OriginalMember(owner = "client!v", name = "R", descriptor = "(III)V")
	public native void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7410(@OriginalArg(0) Class34 arg0) {
		this.method7416(Static283.anIntArray298, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass244Array5 != null) {
			for (local10 = 0; local10 < this.aClass244Array5.length; local10++) {
				@Pc(16) Class244 local16 = this.aClass244Array5[local10];
				local16.anInt6536 = Static283.anIntArray298[local5++];
				local16.anInt6534 = Static283.anIntArray298[local5++];
				local16.anInt6537 = Static283.anIntArray298[local5++];
				local16.anInt6525 = Static283.anIntArray298[local5++];
				local16.anInt6529 = Static283.anIntArray298[local5++];
				local16.anInt6533 = Static283.anIntArray298[local5++];
				local16.anInt6531 = Static283.anIntArray298[local5++];
				local16.anInt6524 = Static283.anIntArray298[local5++];
				local16.anInt6535 = Static283.anIntArray298[local5++];
			}
		}
		if (this.aClass212Array5 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass212Array5.length; local10++) {
			@Pc(87) Class212 local87 = this.aClass212Array5[local10];
			@Pc(89) Class212 local89 = local87;
			if (local87.aClass212_1 != null) {
				local89 = local87.aClass212_1;
			}
			if (local87.aClass34_4 == null) {
				local87.aClass34_4 = arg0.method6215();
			} else {
				local87.aClass34_4.M(arg0);
			}
			local89.anInt5651 = Static283.anIntArray298[local5++];
			local89.anInt5653 = Static283.anIntArray298[local5++];
			local89.anInt5655 = Static283.anIntArray298[local5++];
		}
	}

	@OriginalMember(owner = "client!v", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!v", name = "KA", descriptor = "()I")
	public native int KA();

	@OriginalMember(owner = "client!v", name = "H", descriptor = "()I")
	public native int H();

	@OriginalMember(owner = "client!v", name = "L", descriptor = "()V")
	protected native void L();

	@OriginalMember(owner = "client!v", name = "OA", descriptor = "()I")
	public native int OA();

	@OriginalMember(owner = "client!v", name = "W", descriptor = "(I)V")
	public native void W(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "K", descriptor = "()I")
	public native int K();

	@OriginalMember(owner = "client!v", name = "WA", descriptor = "(IIII)V")
	protected native void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!v", name = "b", descriptor = "()[Lclient!lp;")
	@Override
	public Class212[] method7395() {
		return this.aClass212Array5;
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(SS)V")
	public native void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!v", name = "M", descriptor = "(I)V")
	public native void M(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BIZ)Lclient!da;")
	@Override
	public Class52 method7412(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.aL3.method4280().method5881(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!v", name = "ga", descriptor = "(I)V")
	public native void ga(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "J", descriptor = "()I")
	public native int J();

	@OriginalMember(owner = "client!v", name = "QA", descriptor = "(Lclient!l;Lclient!m;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void QA(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!v", name = "SA", descriptor = "(I)V")
	public native void SA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "DA", descriptor = "(SS)V")
	public native void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!v", name = "FA", descriptor = "()V")
	public native void FA();

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!q;ZI)Z")
	@Override
	public boolean method7392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.aL3.method4280().XA(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!v", name = "F", descriptor = "()Z")
	protected native boolean F();

	@OriginalMember(owner = "client!v", name = "oa", descriptor = "(III)V")
	public native void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!v", name = "I", descriptor = "(JI[IIIIIZ)V")
	private native void I(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7391(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.I(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!v", name = "fa", descriptor = "(I)V")
	public native void fa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "MA", descriptor = "(I)V")
	public native void MA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!q;Lclient!et;II)V")
	@Override
	public void method7405(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class11_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.aL3.method4280().J(this, arg0, null, arg2, arg3);
			return;
		}
		Static283.anIntArray299[5] = 0;
		this.aL3.method4280().J(this, arg0, Static283.anIntArray299, arg2, arg3);
		arg1.anInt2556 = Static283.anIntArray299[0];
		arg1.anInt2554 = Static283.anIntArray299[1];
		arg1.anInt2558 = Static283.anIntArray299[2];
		arg1.anInt2557 = Static283.anIntArray299[3];
		arg1.anInt2555 = Static283.anIntArray299[4];
		arg1.aBoolean195 = Static283.anIntArray299[5] != 0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	@Override
	public void method7414(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aL3.method4280().i(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!v", name = "X", descriptor = "(Lclient!l;)V")
	private native void X(@OriginalArg(0) l arg0);
}
