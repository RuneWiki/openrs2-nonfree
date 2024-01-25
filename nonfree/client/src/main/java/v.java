import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class v extends Class63 implements Interface15 {

	@OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!v", name = "t", descriptor = "Lclient!l;")
	private final l aL3;

	@OriginalMember(owner = "client!v", name = "s", descriptor = "Lclient!m;")
	private final m aM2;

	@OriginalMember(owner = "client!v", name = "q", descriptor = "[Lclient!lea;")
	public Class206[] aClass206Array5;

	@OriginalMember(owner = "client!v", name = "r", descriptor = "[Lclient!in;")
	public Class158[] aClass158Array5;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!l;Lclient!m;Lclient!lm;IIII)V")
	public v(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) Class210 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aL3 = arg0;
		this.aM2 = arg1;
		this.aClass206Array5 = arg2.aClass206Array3;
		this.aClass158Array5 = arg2.aClass158Array3;
		@Pc(24) int local24 = arg2.aClass206Array3 == null ? 0 : arg2.aClass206Array3.length;
		@Pc(33) int local33 = arg2.aClass158Array3 == null ? 0 : arg2.aClass158Array3.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass206Array5[local44].anInt5078;
			local42[local35++] = this.aClass206Array5[local44].anInt5079;
			local42[local35++] = this.aClass206Array5[local44].anInt5080;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass158Array5[local78].anInt4248;
		}
		@Pc(101) int local101 = arg2.aClass264Array1 == null ? 0 : arg2.aClass264Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class264 local116 = arg2.aClass264Array1[local110];
			@Pc(121) Class352 local121 = Static548.method7013(local116.anInt7105);
			local106[local108++] = local116.anInt7109;
			local106[local108++] = local121.anInt9415;
			local106[local108++] = local121.anInt9412;
			local106[local108++] = local121.anInt9416;
			local106[local108++] = local121.anInt9417;
			local106[local108++] = local121.anInt9410;
			local106[local108++] = local121.aBoolean735 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class264 local179 = arg2.aClass264Array1[local173];
			local106[local108++] = local179.anInt7104;
		}
		this.QA(this.aL3, this.aM2, arg2.anInt5244, arg2.anInt5242, arg2.anIntArray407, arg2.anIntArray409, arg2.anIntArray405, arg2.anIntArray408, arg2.aShortArray86, arg2.anInt5254, arg2.aShortArray89, arg2.aShortArray93, arg2.aShortArray84, arg2.aByteArray57, arg2.aByteArray60, arg2.aByteArray61, arg2.aByteArray58, arg2.aShortArray87, arg2.aShortArray88, arg2.anIntArray410, arg2.aByte81, arg2.aShortArray90, arg2.anInt5245, arg2.aByteArray62, arg2.aShortArray85, arg2.aShortArray92, arg2.aShortArray91, arg2.anIntArray402, arg2.anIntArray404, arg2.anIntArray412, arg2.aByteArray59, arg2.aByteArray63, arg2.anIntArray406, arg2.anIntArray403, arg2.anIntArray411, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!l;)V")
	public v(@OriginalArg(0) l arg0) {
		this.aL3 = arg0;
		this.aM2 = null;
		this.X(arg0);
	}

	@OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static289.method4087(this);
		}
	}

	@OriginalMember(owner = "client!v", name = "M", descriptor = "(I)V")
	public native void M(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "OA", descriptor = "()I")
	public native int OA();

	@OriginalMember(owner = "client!v", name = "oa", descriptor = "(III)V")
	public native void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2, @OriginalArg(3) boolean arg3) {
		return this.aL3.method4040().XA(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!v", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!v", name = "LA", descriptor = "()Z")
	public native boolean LA();

	@OriginalMember(owner = "client!v", name = "d", descriptor = "()V")
	@Override
	protected void method7422() {
		if (this.aL3.anInt4961 > 1) {
			synchronized (this) {
				super.aBoolean701 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "QA", descriptor = "(Lclient!l;Lclient!m;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void QA(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7424(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.I(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!v", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	@Override
	public void method7423(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aL3.method4040().i(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!q;Lclient!kd;II)V")
	@Override
	public void method7420(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class8_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.aL3.method4040().J(this, arg0, null, arg2, arg3);
			return;
		}
		Static285.anIntArray384[5] = 0;
		this.aL3.method4040().J(this, arg0, Static285.anIntArray384, arg2, arg3);
		arg1.anInt4680 = Static285.anIntArray384[0];
		arg1.anInt4679 = Static285.anIntArray384[1];
		arg1.anInt4682 = Static285.anIntArray384[2];
		arg1.anInt4681 = Static285.anIntArray384[3];
		arg1.anInt4678 = Static285.anIntArray384[4];
		arg1.aBoolean353 = Static285.anIntArray384[5] != 0;
	}

	@OriginalMember(owner = "client!v", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	public native void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(3) Class47 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!v", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!v", name = "L", descriptor = "()V")
	protected native void L();

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(SS)V")
	public native void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!v", name = "I", descriptor = "(JI[IIIIIZ)V")
	private native void I(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!v", name = "T", descriptor = "(I)V")
	public native void T(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BIZ)Lclient!da;")
	@Override
	public Class63 method7417(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.aL3.method4040().method5732(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!v", name = "J", descriptor = "()I")
	public native int J();

	@OriginalMember(owner = "client!v", name = "KA", descriptor = "()I")
	public native int KA();

	@OriginalMember(owner = "client!v", name = "SA", descriptor = "(I)V")
	public native void SA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!q;Lclient!kd;I)V")
	@Override
	public void method7429(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class8_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aL3.method4040().LA(this, arg0, null, arg2);
			return;
		}
		Static285.anIntArray384[5] = 0;
		this.aL3.method4040().LA(this, arg0, Static285.anIntArray384, arg2);
		arg1.anInt4680 = Static285.anIntArray384[0];
		arg1.anInt4679 = Static285.anIntArray384[1];
		arg1.anInt4682 = Static285.anIntArray384[2];
		arg1.anInt4681 = Static285.anIntArray384[3];
		arg1.anInt4678 = Static285.anIntArray384[4];
		arg1.aBoolean353 = Static285.anIntArray384[5] != 0;
	}

	@OriginalMember(owner = "client!v", name = "B", descriptor = "(I[IIIIZI[I)V")
	protected native void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([ILclient!q;)V")
	private void method7434(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class113 arg1) {
		this.aL3.method4040().s(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!v", name = "PA", descriptor = "()I")
	public native int PA();

	@OriginalMember(owner = "client!v", name = "K", descriptor = "()I")
	public native int K();

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7409(@OriginalArg(0) Class113 arg0) {
		this.method7434(Static285.anIntArray385, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass206Array5 != null) {
			for (local10 = 0; local10 < this.aClass206Array5.length; local10++) {
				@Pc(16) Class206 local16 = this.aClass206Array5[local10];
				local16.anInt5066 = Static285.anIntArray385[local5++];
				local16.anInt5081 = Static285.anIntArray385[local5++];
				local16.anInt5073 = Static285.anIntArray385[local5++];
				local16.anInt5072 = Static285.anIntArray385[local5++];
				local16.anInt5070 = Static285.anIntArray385[local5++];
				local16.anInt5071 = Static285.anIntArray385[local5++];
				local16.anInt5083 = Static285.anIntArray385[local5++];
				local16.anInt5075 = Static285.anIntArray385[local5++];
				local16.anInt5082 = Static285.anIntArray385[local5++];
			}
		}
		if (this.aClass158Array5 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass158Array5.length; local10++) {
			@Pc(87) Class158 local87 = this.aClass158Array5[local10];
			@Pc(89) Class158 local89 = local87;
			if (local87.aClass158_1 != null) {
				local89 = local87.aClass158_1;
			}
			if (local87.aClass113_1 == null) {
				local87.aClass113_1 = arg0.method6103();
			} else {
				local87.aClass113_1.M(arg0);
			}
			local89.anInt4244 = Static285.anIntArray385[local5++];
			local89.anInt4247 = Static285.anIntArray385[local5++];
			local89.anInt4249 = Static285.anIntArray385[local5++];
		}
	}

	@OriginalMember(owner = "client!v", name = "F", descriptor = "()Z")
	protected native boolean F();

	@OriginalMember(owner = "client!v", name = "FA", descriptor = "()V")
	public native void FA();

	@OriginalMember(owner = "client!v", name = "W", descriptor = "(I)V")
	public native void W(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "n", descriptor = "(Lclient!v;Lclient!v;IZZ)V")
	public native void n(@OriginalArg(0) v arg0, @OriginalArg(1) v arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!v", name = "MA", descriptor = "(I)V")
	public native void MA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "c", descriptor = "()[Lclient!lea;")
	@Override
	public Class206[] method7421() {
		return this.aClass206Array5;
	}

	@OriginalMember(owner = "client!v", name = "fa", descriptor = "(I)V")
	public native void fa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!q;ZI)Z")
	@Override
	public boolean method7419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.aL3.method4040().XA(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
	@Override
	public void method7411() {
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "()[Lclient!in;")
	@Override
	public Class158[] method7413() {
		return this.aClass158Array5;
	}

	@OriginalMember(owner = "client!v", name = "l", descriptor = "()I")
	public native int l();

	@OriginalMember(owner = "client!v", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	public native Class1_Sub6_Sub5 S(@OriginalArg(0) Class1_Sub6_Sub5 arg0);

	@OriginalMember(owner = "client!v", name = "WA", descriptor = "(IIII)V")
	protected native void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!v", name = "H", descriptor = "()I")
	public native int H();

	@OriginalMember(owner = "client!v", name = "f", descriptor = "()Z")
	@Override
	public boolean method7430() {
		return true;
	}

	@OriginalMember(owner = "client!v", name = "TA", descriptor = "()I")
	public native int TA();

	@OriginalMember(owner = "client!v", name = "DA", descriptor = "(SS)V")
	public native void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!v", name = "e", descriptor = "()V")
	@Override
	protected void method7428() {
		if (this.aL3.anInt4961 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean701) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean701 = true;
		}
	}

	@OriginalMember(owner = "client!v", name = "X", descriptor = "(Lclient!l;)V")
	private native void X(@OriginalArg(0) l arg0);

	@OriginalMember(owner = "client!v", name = "za", descriptor = "()I")
	public native int za();

	@OriginalMember(owner = "client!v", name = "R", descriptor = "(III)V")
	public native void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!v", name = "ga", descriptor = "(I)V")
	public native void ga(@OriginalArg(0) int arg0);
}
