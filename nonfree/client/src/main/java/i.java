import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class182 implements Interface7 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!i", name = "m", descriptor = "Lclient!oa;")
	private final oa anOa2;

	@OriginalMember(owner = "client!i", name = "l", descriptor = "Lclient!ya;")
	private final ya aYa1;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "[Lclient!hr;")
	public Class143[] aClass143Array1;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "[Lclient!oo;")
	public Class255[] aClass255Array1;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!kda;IIII)V")
	public i(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class186 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anOa2 = arg0;
		this.aYa1 = arg1;
		this.aClass143Array1 = arg2.aClass143Array2;
		this.aClass255Array1 = arg2.aClass255Array2;
		@Pc(24) int local24 = arg2.aClass143Array2 == null ? 0 : arg2.aClass143Array2.length;
		@Pc(33) int local33 = arg2.aClass255Array2 == null ? 0 : arg2.aClass255Array2.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass143Array1[local44].anInt3607;
			local42[local35++] = this.aClass143Array1[local44].anInt3594;
			local42[local35++] = this.aClass143Array1[local44].anInt3598;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass255Array1[local78].anInt6388;
		}
		@Pc(101) int local101 = arg2.aClass245Array1 == null ? 0 : arg2.aClass245Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class245 local116 = arg2.aClass245Array1[local110];
			@Pc(121) Class302 local121 = Static382.method5115(local116.anInt6289);
			local106[local108++] = local116.anInt6287;
			local106[local108++] = local121.anInt8086;
			local106[local108++] = local121.anInt8091;
			local106[local108++] = local121.anInt8082;
			local106[local108++] = local121.anInt8085;
			local106[local108++] = local121.anInt8084;
			local106[local108++] = local121.aBoolean610 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class245 local179 = arg2.aClass245Array1[local173];
			local106[local108++] = local179.anInt6288;
		}
		this.R(this.anOa2, this.aYa1, arg2.anInt4698, arg2.anInt4703, arg2.anIntArray312, arg2.anIntArray317, arg2.anIntArray315, arg2.anIntArray308, arg2.aShortArray52, arg2.anInt4696, arg2.aShortArray53, arg2.aShortArray54, arg2.aShortArray50, arg2.aByteArray54, arg2.aByteArray55, arg2.aByteArray56, arg2.aByteArray59, arg2.aShortArray55, arg2.aShortArray51, arg2.anIntArray313, arg2.aByte73, arg2.aShortArray56, arg2.anInt4695, arg2.aByteArray57, arg2.aShortArray49, arg2.aShortArray58, arg2.aShortArray57, arg2.anIntArray310, arg2.anIntArray318, arg2.anIntArray309, arg2.aByteArray58, arg2.aByteArray53, arg2.anIntArray316, arg2.anIntArray311, arg2.anIntArray314, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;)V")
	public i(@OriginalArg(0) oa arg0) {
		this.anOa2 = arg0;
		this.aYa1 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()[Lclient!hr;")
	@Override
	public Class143[] method6217() {
		return this.aClass143Array1;
	}

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()[Lclient!oo;")
	@Override
	public Class255[] method6196() {
		return this.aClass255Array1;
	}

	@OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method6214(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.l(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()Z")
	@Override
	public boolean method6207() {
		return true;
	}

	@OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()V")
	@Override
	protected void method6209() {
		if (this.anOa2.anInt6155 > 1) {
			synchronized (this) {
				super.aBoolean547 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
	public native void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!uha;IZ)V")
	@Override
	public void method6204(@OriginalArg(0) Class177 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.A(((ja) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
	public native int HA();

	@OriginalMember(owner = "client!i", name = "R", descriptor = "(Lclient!oa;Lclient!ya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void R(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!uha;Lclient!au;I)V")
	@Override
	public void method6206(@OriginalArg(0) Class177 arg0, @OriginalArg(1) Class13_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anOa2.method5339().method9(this, arg0, null, arg2);
			return;
		}
		Static391.anIntArray456[5] = 0;
		this.anOa2.method5339().method9(this, arg0, Static391.anIntArray456, arg2);
		arg1.anInt603 = Static391.anIntArray456[0];
		arg1.anInt604 = Static391.anIntArray456[1];
		arg1.anInt605 = Static391.anIntArray456[2];
		arg1.anInt607 = Static391.anIntArray456[3];
		arg1.anInt606 = Static391.anIntArray456[4];
		arg1.aBoolean48 = Static391.anIntArray456[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static400.method5448(this);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!uha;ZII)Z")
	@Override
	public boolean method6203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class177 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.anOa2.method5339().method5(this, arg0, arg1, arg2, arg3, arg5);
	}

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
	public native boolean r();

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public native Class2_Sub2_Sub19 ba(@OriginalArg(0) Class2_Sub2_Sub19 arg0);

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!i", name = "A", descriptor = "(JIZ)V")
	private native void A(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
	public native int G();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class182 method6208(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anOa2.method5339().method6(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
	public native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!uha;)V")
	private void method3098(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class177 arg1) {
		this.anOa2.method5339().method13(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!uha;Lclient!au;II)V")
	@Override
	public void method6194(@OriginalArg(0) Class177 arg0, @OriginalArg(1) Class13_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.anOa2.method5339().method11(this, arg0, null, arg2, arg3);
			return;
		}
		Static391.anIntArray456[5] = 0;
		this.anOa2.method5339().method11(this, arg0, Static391.anIntArray456, arg2, arg3);
		arg1.anInt603 = Static391.anIntArray456[0];
		arg1.anInt604 = Static391.anIntArray456[1];
		arg1.anInt605 = Static391.anIntArray456[2];
		arg1.anInt607 = Static391.anIntArray456[3];
		arg1.anInt606 = Static391.anIntArray456[4];
		arg1.aBoolean48 = Static391.anIntArray456[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!uha;)V")
	@Override
	public void method6197(@OriginalArg(0) Class177 arg0) {
		this.method3098(Static391.anIntArray458, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass143Array1 != null) {
			for (local10 = 0; local10 < this.aClass143Array1.length; local10++) {
				@Pc(16) Class143 local16 = this.aClass143Array1[local10];
				local16.anInt3602 = Static391.anIntArray458[local5++];
				local16.anInt3596 = Static391.anIntArray458[local5++];
				local16.anInt3600 = Static391.anIntArray458[local5++];
				local16.anInt3603 = Static391.anIntArray458[local5++];
				local16.anInt3606 = Static391.anIntArray458[local5++];
				local16.anInt3610 = Static391.anIntArray458[local5++];
				local16.anInt3601 = Static391.anIntArray458[local5++];
				local16.anInt3604 = Static391.anIntArray458[local5++];
				local16.anInt3608 = Static391.anIntArray458[local5++];
			}
		}
		if (this.aClass255Array1 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass255Array1.length; local10++) {
			@Pc(87) Class255 local87 = this.aClass255Array1[local10];
			@Pc(89) Class255 local89 = local87;
			if (local87.aClass255_2 != null) {
				local89 = local87.aClass255_2;
			}
			if (local87.aClass177_8 == null) {
				local87.aClass177_8 = arg0.method7868();
			} else {
				local87.aClass177_8.method7879(arg0);
			}
			local89.anInt6389 = Static391.anIntArray458[local5++];
			local89.anInt6390 = Static391.anIntArray458[local5++];
			local89.anInt6392 = Static391.anIntArray458[local5++];
		}
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()V")
	@Override
	public void method6212() {
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
	public native int ua();

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
	@Override
	protected void method6210() {
		if (this.anOa2.anInt6155 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean547) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean547 = true;
		}
	}

	@OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
	public native void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
	protected native boolean NA();

	@OriginalMember(owner = "client!i", name = "oa", descriptor = "(Lclient!oa;)V")
	private native void oa(@OriginalArg(0) oa arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method6195(@OriginalArg(0) Class182 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anOa2.method5339().method7(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2, @OriginalArg(3) Class76 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
	protected native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!uha;ZI)Z")
	@Override
	public boolean method6205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class177 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.anOa2.method5339().method4(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Lclient!i;Lclient!i;IZZ)V")
	public native void ZA(@OriginalArg(0) i arg0, @OriginalArg(1) i arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
	public native void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
	public native boolean F();

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
	protected native void wa();

	@OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
	public native void LA(@OriginalArg(0) int arg0);
}
