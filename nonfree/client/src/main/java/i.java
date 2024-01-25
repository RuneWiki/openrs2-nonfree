import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class184 implements Interface7 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!i", name = "q", descriptor = "Lclient!oa;")
	private final oa anOa2;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "Lclient!ya;")
	private final ya aYa1;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "[Lclient!fba;")
	public Class100[] aClass100Array2;

	@OriginalMember(owner = "client!i", name = "r", descriptor = "[Lclient!mb;")
	public Class218[] aClass218Array2;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!ao;IIII)V")
	public i(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anOa2 = arg0;
		this.aYa1 = arg1;
		this.aClass100Array2 = arg2.aClass100Array1;
		this.aClass218Array2 = arg2.aClass218Array1;
		@Pc(24) int local24 = arg2.aClass100Array1 == null ? 0 : arg2.aClass100Array1.length;
		@Pc(33) int local33 = arg2.aClass218Array1 == null ? 0 : arg2.aClass218Array1.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass100Array2[local44].anInt2508;
			local42[local35++] = this.aClass100Array2[local44].anInt2511;
			local42[local35++] = this.aClass100Array2[local44].anInt2499;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass218Array2[local78].anInt6151;
		}
		@Pc(101) int local101 = arg2.aClass319Array1 == null ? 0 : arg2.aClass319Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class319 local116 = arg2.aClass319Array1[local110];
			@Pc(121) Class5 local121 = Static122.method1892(local116.anInt8754);
			local106[local108++] = local116.anInt8748;
			local106[local108++] = local121.anInt75;
			local106[local108++] = local121.anInt82;
			local106[local108++] = local121.anInt76;
			local106[local108++] = local121.anInt84;
			local106[local108++] = local121.anInt77;
			local106[local108++] = local121.aBoolean8 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class319 local179 = arg2.aClass319Array1[local173];
			local106[local108++] = local179.anInt8749;
		}
		this.R(this.anOa2, this.aYa1, arg2.anInt502, arg2.anInt506, arg2.anIntArray27, arg2.anIntArray28, arg2.anIntArray32, arg2.anIntArray25, arg2.aShortArray22, arg2.anInt509, arg2.aShortArray15, arg2.aShortArray19, arg2.aShortArray21, arg2.aByteArray3, arg2.aByteArray4, arg2.aByteArray5, arg2.aByteArray8, arg2.aShortArray16, arg2.aShortArray14, arg2.anIntArray31, arg2.aByte14, arg2.aShortArray20, arg2.anInt513, arg2.aByteArray7, arg2.aShortArray13, arg2.aShortArray18, arg2.aShortArray17, arg2.anIntArray22, arg2.anIntArray29, arg2.anIntArray23, arg2.aByteArray6, arg2.aByteArray9, arg2.anIntArray26, arg2.anIntArray30, arg2.anIntArray24, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;)V")
	public i(@OriginalArg(0) oa arg0) {
		this.anOa2 = arg0;
		this.aYa1 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!oo;)V")
	@Override
	public void method8659(@OriginalArg(0) Class207 arg0) {
		this.method3385(Static409.anIntArray431, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass100Array2 != null) {
			for (local10 = 0; local10 < this.aClass100Array2.length; local10++) {
				@Pc(16) Class100 local16 = this.aClass100Array2[local10];
				local16.anInt2513 = Static409.anIntArray431[local5++];
				local16.anInt2512 = Static409.anIntArray431[local5++];
				local16.anInt2501 = Static409.anIntArray431[local5++];
				local16.anInt2504 = Static409.anIntArray431[local5++];
				local16.anInt2502 = Static409.anIntArray431[local5++];
				local16.anInt2505 = Static409.anIntArray431[local5++];
				local16.anInt2500 = Static409.anIntArray431[local5++];
				local16.anInt2509 = Static409.anIntArray431[local5++];
				local16.anInt2498 = Static409.anIntArray431[local5++];
			}
		}
		if (this.aClass218Array2 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass218Array2.length; local10++) {
			@Pc(87) Class218 local87 = this.aClass218Array2[local10];
			@Pc(89) Class218 local89 = local87;
			if (local87.aClass218_2 != null) {
				local89 = local87.aClass218_2;
			}
			if (local87.aClass207_20 == null) {
				local87.aClass207_20 = arg0.method8199();
			} else {
				local87.aClass207_20.method8211(arg0);
			}
			local89.anInt6152 = Static409.anIntArray431[local5++];
			local89.anInt6153 = Static409.anIntArray431[local5++];
			local89.anInt6150 = Static409.anIntArray431[local5++];
		}
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()V")
	@Override
	protected void method8665() {
		if (this.anOa2.anInt6856 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean716) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean716 = true;
		}
	}

	@OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
	public native void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "A", descriptor = "(JIZ)V")
	private native void A(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
	public native int ua();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!oo;IZ)V")
	@Override
	public void method8642(@OriginalArg(0) Class207 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.A(((ja) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
	public native int G();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()Z")
	@Override
	public boolean method8645() {
		return true;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()[Lclient!mb;")
	@Override
	public Class218[] method8643() {
		return this.aClass218Array2;
	}

	@OriginalMember(owner = "client!i", name = "oa", descriptor = "(Lclient!oa;)V")
	private native void oa(@OriginalArg(0) oa arg0);

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12 arg2, @OriginalArg(3) Class12 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
	public native int HA();

	@OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
	public native void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static497.method7156(this);
		}
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()V")
	@Override
	protected void method8647() {
		if (this.anOa2.anInt6856 > 1) {
			synchronized (this) {
				super.aBoolean716 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Lclient!i;Lclient!i;IZZ)V")
	public native void ZA(@OriginalArg(0) i arg0, @OriginalArg(1) i arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class184 method8660(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anOa2.method5939().method13(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!oo;)V")
	private void method3385(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class207 arg1) {
		this.anOa2.method5939().method7(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "R", descriptor = "(Lclient!oa;Lclient!ya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void R(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!oo;ZII)Z")
	@Override
	public boolean method8653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.anOa2.method5939().method1(this, arg0, arg1, arg2, arg3, arg5);
	}

	@OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
	public native void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
	public native boolean F();

	@OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
	public native void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()V")
	@Override
	public void method8663() {
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()[Lclient!fba;")
	@Override
	public Class100[] method8657() {
		return this.aClass100Array2;
	}

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
	public native boolean r();

	@OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
	public native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!oo;ZI)Z")
	@Override
	public boolean method8656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.anOa2.method5939().method10(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!oo;Lclient!ea;I)V")
	@Override
	public void method8662(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Class2_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anOa2.method5939().method8(this, arg0, (int[]) null, arg2);
			return;
		}
		Static409.anIntArray432[5] = 0;
		this.anOa2.method5939().method8(this, arg0, Static409.anIntArray432, arg2);
		arg1.anInt2082 = Static409.anIntArray432[0];
		arg1.anInt2086 = Static409.anIntArray432[1];
		arg1.anInt2083 = Static409.anIntArray432[2];
		arg1.anInt2084 = Static409.anIntArray432[3];
		arg1.anInt2085 = Static409.anIntArray432[4];
		arg1.aBoolean124 = Static409.anIntArray432[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method8651(@OriginalArg(0) Class184 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anOa2.method5939().method3(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
	protected native boolean NA();

	@OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!oo;Lclient!ea;II)V")
	@Override
	public void method8658(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Class2_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.anOa2.method5939().method9(this, arg0, (int[]) null, arg2, arg3);
			return;
		}
		Static409.anIntArray432[5] = 0;
		this.anOa2.method5939().method9(this, arg0, Static409.anIntArray432, arg2, arg3);
		arg1.anInt2082 = Static409.anIntArray432[0];
		arg1.anInt2086 = Static409.anIntArray432[1];
		arg1.anInt2083 = Static409.anIntArray432[2];
		arg1.anInt2084 = Static409.anIntArray432[3];
		arg1.anInt2085 = Static409.anIntArray432[4];
		arg1.aBoolean124 = Static409.anIntArray432[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
	protected native void wa();

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method8650(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.l(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public native Class6_Sub4_Sub5 ba(@OriginalArg(0) Class6_Sub4_Sub5 arg0);

	@OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
	protected native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
