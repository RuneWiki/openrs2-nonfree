import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class95 implements Interface6 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!i", name = "x", descriptor = "Lclient!oa;")
	private final oa anOa2;

	@OriginalMember(owner = "client!i", name = "w", descriptor = "Lclient!ya;")
	private final ya aYa1;

	@OriginalMember(owner = "client!i", name = "v", descriptor = "[Lclient!cba;")
	public Class49[] aClass49Array3;

	@OriginalMember(owner = "client!i", name = "u", descriptor = "[Lclient!kw;")
	public Class197[] aClass197Array3;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!gfa;IIII)V")
	public i(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anOa2 = arg0;
		this.aYa1 = arg1;
		this.aClass49Array3 = arg2.aClass49Array2;
		this.aClass197Array3 = arg2.aClass197Array2;
		@Pc(24) int local24 = arg2.aClass49Array2 == null ? 0 : arg2.aClass49Array2.length;
		@Pc(33) int local33 = arg2.aClass197Array2 == null ? 0 : arg2.aClass197Array2.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass49Array3[local44].anInt1244;
			local42[local35++] = this.aClass49Array3[local44].anInt1241;
			local42[local35++] = this.aClass49Array3[local44].anInt1237;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass197Array3[local78].anInt5432;
		}
		@Pc(101) int local101 = arg2.aClass163Array1 == null ? 0 : arg2.aClass163Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class163 local116 = arg2.aClass163Array1[local110];
			@Pc(121) Class143 local121 = Static173.method3146(local116.anInt4729);
			local106[local108++] = local116.anInt4727;
			local106[local108++] = local121.anInt4311;
			local106[local108++] = local121.anInt4312;
			local106[local108++] = local121.anInt4306;
			local106[local108++] = local121.anInt4308;
			local106[local108++] = local121.anInt4307;
			local106[local108++] = local121.aBoolean323 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class163 local179 = arg2.aClass163Array1[local173];
			local106[local108++] = local179.anInt4730;
		}
		this.R(this.anOa2, this.aYa1, arg2.anInt3807, arg2.anInt3814, arg2.anIntArray335, arg2.anIntArray333, arg2.anIntArray325, arg2.anIntArray328, arg2.aShortArray51, arg2.anInt3811, arg2.aShortArray54, arg2.aShortArray57, arg2.aShortArray52, arg2.aByteArray33, arg2.aByteArray30, arg2.aByteArray34, arg2.aByteArray35, arg2.aShortArray50, arg2.aShortArray58, arg2.anIntArray332, arg2.aByte52, arg2.aShortArray53, arg2.anInt3817, arg2.aByteArray31, arg2.aShortArray59, arg2.aShortArray56, arg2.aShortArray55, arg2.anIntArray330, arg2.anIntArray334, arg2.anIntArray327, arg2.aByteArray32, arg2.aByteArray29, arg2.anIntArray336, arg2.anIntArray331, arg2.anIntArray329, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;)V")
	public i(@OriginalArg(0) oa arg0) {
		this.anOa2 = arg0;
		this.aYa1 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!uu;ZI)Z")
	@Override
	public boolean method5658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class239 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.anOa2.method6053().method16(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!uu;Lclient!taa;I)V")
	@Override
	public void method5653(@OriginalArg(0) Class239 arg0, @OriginalArg(1) Class28_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anOa2.method6053().method8(this, arg0, (int[]) null, arg2);
			return;
		}
		Static418.anIntArray593[5] = 0;
		this.anOa2.method6053().method8(this, arg0, Static418.anIntArray593, arg2);
		arg1.anInt9151 = Static418.anIntArray593[0];
		arg1.anInt9152 = Static418.anIntArray593[1];
		arg1.anInt9153 = Static418.anIntArray593[2];
		arg1.anInt9150 = Static418.anIntArray593[3];
		arg1.anInt9149 = Static418.anIntArray593[4];
		arg1.aBoolean716 = Static418.anIntArray593[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
	public native int HA();

	@OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!uu;)V")
	@Override
	public void method5669(@OriginalArg(0) Class239 arg0) {
		this.method3994(Static418.anIntArray597, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass49Array3 != null) {
			for (local10 = 0; local10 < this.aClass49Array3.length; local10++) {
				@Pc(16) Class49 local16 = this.aClass49Array3[local10];
				local16.anInt1238 = Static418.anIntArray597[local5++];
				local16.anInt1233 = Static418.anIntArray597[local5++];
				local16.anInt1234 = Static418.anIntArray597[local5++];
				local16.anInt1239 = Static418.anIntArray597[local5++];
				local16.anInt1231 = Static418.anIntArray597[local5++];
				local16.anInt1246 = Static418.anIntArray597[local5++];
				local16.anInt1232 = Static418.anIntArray597[local5++];
				local16.anInt1245 = Static418.anIntArray597[local5++];
				local16.anInt1248 = Static418.anIntArray597[local5++];
			}
		}
		if (this.aClass197Array3 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass197Array3.length; local10++) {
			@Pc(87) Class197 local87 = this.aClass197Array3[local10];
			@Pc(89) Class197 local89 = local87;
			if (local87.aClass197_1 != null) {
				local89 = local87.aClass197_1;
			}
			if (local87.aClass239_5 == null) {
				local87.aClass239_5 = arg0.method9235();
			} else {
				local87.aClass239_5.method9247(arg0);
			}
			local89.anInt5427 = Static418.anIntArray597[local5++];
			local89.anInt5431 = Static418.anIntArray597[local5++];
			local89.anInt5428 = Static418.anIntArray597[local5++];
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method5673(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anOa2.method6053().method1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class95 method5664(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anOa2.method6053().method6(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
	public native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!uu;Lclient!taa;II)V")
	@Override
	public void method5659(@OriginalArg(0) Class239 arg0, @OriginalArg(1) Class28_Sub8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.anOa2.method6053().method10(this, arg0, (int[]) null, arg2, arg3);
			return;
		}
		Static418.anIntArray593[5] = 0;
		this.anOa2.method6053().method10(this, arg0, Static418.anIntArray593, arg2, arg3);
		arg1.anInt9151 = Static418.anIntArray593[0];
		arg1.anInt9152 = Static418.anIntArray593[1];
		arg1.anInt9153 = Static418.anIntArray593[2];
		arg1.anInt9150 = Static418.anIntArray593[3];
		arg1.anInt9149 = Static418.anIntArray593[4];
		arg1.aBoolean716 = Static418.anIntArray593[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static612.method8677(this);
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()V")
	@Override
	protected void method5660() {
		if (this.anOa2.anInt6723 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean446) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean446 = true;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!uu;)V")
	private void method3994(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class239 arg1) {
		this.anOa2.method6053().method7(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
	protected native void wa();

	@OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
	public native void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()[Lclient!kw;")
	@Override
	public Class197[] method5668() {
		return this.aClass197Array3;
	}

	@OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!i", name = "K", descriptor = "(JIZ)V")
	private native void K(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!uu;ZII)Z")
	@Override
	public boolean method5650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class239 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.anOa2.method6053().method12(this, arg0, arg1, arg2, arg3, arg5);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method5672(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.l(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "R", descriptor = "(Lclient!oa;Lclient!ya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void R(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
	public native boolean r();

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "oa", descriptor = "(Lclient!oa;)V")
	private native void oa(@OriginalArg(0) oa arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!uu;IZ)V")
	@Override
	public void method5656(@OriginalArg(0) Class239 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.K(((ja) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) Class21 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public native Class3_Sub11_Sub3 ba(@OriginalArg(0) Class3_Sub11_Sub3 arg0);

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Lclient!i;Lclient!i;IZZ)V")
	public native void ZA(@OriginalArg(0) i arg0, @OriginalArg(1) i arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
	public native int ua();

	@OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
	public native boolean F();

	@OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()V")
	@Override
	protected void method5667() {
		if (this.anOa2.anInt6723 > 1) {
			synchronized (this) {
				super.aBoolean446 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
	public native int G();

	@OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
	public native void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
	protected native boolean NA();

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()Z")
	@Override
	public boolean method5666() {
		return true;
	}

	@OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
	protected native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
	public native void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()V")
	@Override
	public void method5665() {
	}

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()[Lclient!cba;")
	@Override
	public Class49[] method5654() {
		return this.aClass49Array3;
	}

	@OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
	public native void LA(@OriginalArg(0) int arg0);
}
