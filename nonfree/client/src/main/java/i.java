import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class17 implements Interface9 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!i", name = "m", descriptor = "Lclient!oa;")
	private final oa anOa2;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "Lclient!ya;")
	private final ya aYa1;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "[Lclient!qv;")
	public Class284[] aClass284Array3;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "[Lclient!vea;")
	public Class353[] aClass353Array3;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!fu;IIII)V")
	public i(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anOa2 = arg0;
		this.aYa1 = arg1;
		this.aClass284Array3 = arg2.aClass284Array2;
		this.aClass353Array3 = arg2.aClass353Array2;
		@Pc(24) int local24 = arg2.aClass284Array2 == null ? 0 : arg2.aClass284Array2.length;
		@Pc(33) int local33 = arg2.aClass353Array2 == null ? 0 : arg2.aClass353Array2.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass284Array3[local44].anInt8333;
			local42[local35++] = this.aClass284Array3[local44].anInt8326;
			local42[local35++] = this.aClass284Array3[local44].anInt8323;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass353Array3[local78].anInt9752;
		}
		@Pc(101) int local101 = arg2.aClass66Array1 == null ? 0 : arg2.aClass66Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class66 local116 = arg2.aClass66Array1[local110];
			@Pc(121) Class159 local121 = Static269.method4430(local116.anInt2189);
			local106[local108++] = local116.anInt2184;
			local106[local108++] = local121.anInt4553;
			local106[local108++] = local121.anInt4550;
			local106[local108++] = local121.anInt4548;
			local106[local108++] = local121.anInt4549;
			local106[local108++] = local121.anInt4551;
			local106[local108++] = local121.aBoolean305 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class66 local179 = arg2.aClass66Array1[local173];
			local106[local108++] = local179.anInt2188;
		}
		this.R(this.anOa2, this.aYa1, arg2.anInt3256, arg2.anInt3251, arg2.anIntArray166, arg2.anIntArray169, arg2.anIntArray168, arg2.anIntArray164, arg2.aShortArray56, arg2.anInt3252, arg2.aShortArray60, arg2.aShortArray61, arg2.aShortArray63, arg2.aByteArray40, arg2.aByteArray43, arg2.aByteArray44, arg2.aByteArray45, arg2.aShortArray57, arg2.aShortArray62, arg2.anIntArray165, arg2.aByte43, arg2.aShortArray58, arg2.anInt3254, arg2.aByteArray46, arg2.aShortArray64, arg2.aShortArray59, arg2.aShortArray55, arg2.anIntArray173, arg2.anIntArray170, arg2.anIntArray174, arg2.aByteArray41, arg2.aByteArray42, arg2.anIntArray171, arg2.anIntArray172, arg2.anIntArray167, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;)V")
	public i(@OriginalArg(0) oa arg0) {
		this.anOa2 = arg0;
		this.aYa1 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()[Lclient!qv;")
	@Override
	public Class284[] method5417() {
		return this.aClass284Array3;
	}

	@OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
	public native void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class17 method5409(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anOa2.method6324().method2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!sk;ZII)Z")
	@Override
	public boolean method5420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class39 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.anOa2.method6324().method5(this, arg0, arg1, arg2, arg3, arg5);
	}

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()[Lclient!vea;")
	@Override
	public Class353[] method5415() {
		return this.aClass353Array3;
	}

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static122.method2425(this);
		}
	}

	@OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
	public native void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!sk;)V")
	@Override
	public void method5425(@OriginalArg(0) Class39 arg0) {
		this.method3792(Static389.anIntArray443, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass284Array3 != null) {
			for (local10 = 0; local10 < this.aClass284Array3.length; local10++) {
				@Pc(16) Class284 local16 = this.aClass284Array3[local10];
				local16.anInt8331 = Static389.anIntArray443[local5++];
				local16.anInt8328 = Static389.anIntArray443[local5++];
				local16.anInt8322 = Static389.anIntArray443[local5++];
				local16.anInt8320 = Static389.anIntArray443[local5++];
				local16.anInt8319 = Static389.anIntArray443[local5++];
				local16.anInt8316 = Static389.anIntArray443[local5++];
				local16.anInt8329 = Static389.anIntArray443[local5++];
				local16.anInt8325 = Static389.anIntArray443[local5++];
				local16.anInt8324 = Static389.anIntArray443[local5++];
			}
		}
		if (this.aClass353Array3 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass353Array3.length; local10++) {
			@Pc(87) Class353 local87 = this.aClass353Array3[local10];
			@Pc(89) Class353 local89 = local87;
			if (local87.aClass353_2 != null) {
				local89 = local87.aClass353_2;
			}
			if (local87.aClass39_13 == null) {
				local87.aClass39_13 = arg0.method7248();
			} else {
				local87.aClass39_13.method7236(arg0);
			}
			local89.anInt9744 = Static389.anIntArray443[local5++];
			local89.anInt9747 = Static389.anIntArray443[local5++];
			local89.anInt9742 = Static389.anIntArray443[local5++];
		}
	}

	@OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
	public native int G();

	@OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!i", name = "oa", descriptor = "(Lclient!oa;)V")
	private native void oa(@OriginalArg(0) oa arg0);

	@OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
	public native void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!i", name = "B", descriptor = "(JIZ)V")
	private native void B(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
	public native boolean F();

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
	public native boolean r();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method5429(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anOa2.method6324().method1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!sk;IZ)V")
	@Override
	public void method5410(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.B(((ja) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
	protected native void wa();

	@OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
	public native void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Lclient!i;Lclient!i;IZZ)V")
	public native void ZA(@OriginalArg(0) i arg0, @OriginalArg(1) i arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()V")
	@Override
	public void method5426() {
	}

	@OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
	protected native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) Class51 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!sk;Lclient!nl;I)V")
	@Override
	public void method5411(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class4_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anOa2.method6324().method15(this, arg0, null, arg2);
			return;
		}
		Static389.anIntArray446[5] = 0;
		this.anOa2.method6324().method15(this, arg0, Static389.anIntArray446, arg2);
		arg1.anInt7142 = Static389.anIntArray446[0];
		arg1.anInt7144 = Static389.anIntArray446[1];
		arg1.anInt7143 = Static389.anIntArray446[2];
		arg1.anInt7145 = Static389.anIntArray446[3];
		arg1.anInt7146 = Static389.anIntArray446[4];
		arg1.aBoolean514 = Static389.anIntArray446[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
	public native int HA();

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public native Class3_Sub4_Sub5 ba(@OriginalArg(0) Class3_Sub4_Sub5 arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!sk;)V")
	private void method3792(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class39 arg1) {
		this.anOa2.method6324().method12(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!i", name = "R", descriptor = "(Lclient!oa;Lclient!ya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void R(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method5424(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.l(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
	protected native boolean NA();

	@OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
	public native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()V")
	@Override
	protected void method5427() {
		if (this.anOa2.anInt7244 > 1) {
			synchronized (this) {
				super.aBoolean443 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()Z")
	@Override
	public boolean method5422() {
		return true;
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
	@Override
	protected void method5423() {
		if (this.anOa2.anInt7244 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean443) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean443 = true;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!sk;Lclient!nl;II)V")
	@Override
	public void method5413(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class4_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.anOa2.method6324().method16(this, arg0, null, arg2, arg3);
			return;
		}
		Static389.anIntArray446[5] = 0;
		this.anOa2.method6324().method16(this, arg0, Static389.anIntArray446, arg2, arg3);
		arg1.anInt7142 = Static389.anIntArray446[0];
		arg1.anInt7144 = Static389.anIntArray446[1];
		arg1.anInt7143 = Static389.anIntArray446[2];
		arg1.anInt7145 = Static389.anIntArray446[3];
		arg1.anInt7146 = Static389.anIntArray446[4];
		arg1.aBoolean514 = Static389.anIntArray446[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
	public native int ua();

	@OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!sk;ZI)Z")
	@Override
	public boolean method5433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class39 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.anOa2.method6324().method9(this, arg0, arg1, arg2, arg3);
	}
}
