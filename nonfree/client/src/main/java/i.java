import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class166 implements Interface8 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "Lclient!oa;")
	private final oa anOa2;

	@OriginalMember(owner = "client!i", name = "r", descriptor = "Lclient!ya;")
	private final ya aYa1;

	@OriginalMember(owner = "client!i", name = "q", descriptor = "[Lclient!nn;")
	public Class227[] aClass227Array2;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "[Lclient!eca;")
	public Class87[] aClass87Array2;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!bh;IIII)V")
	public i(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anOa2 = arg0;
		this.aYa1 = arg1;
		this.aClass227Array2 = arg2.aClass227Array1;
		this.aClass87Array2 = arg2.aClass87Array1;
		@Pc(24) int local24 = arg2.aClass227Array1 == null ? 0 : arg2.aClass227Array1.length;
		@Pc(33) int local33 = arg2.aClass87Array1 == null ? 0 : arg2.aClass87Array1.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass227Array2[local44].anInt7393;
			local42[local35++] = this.aClass227Array2[local44].anInt7390;
			local42[local35++] = this.aClass227Array2[local44].anInt7401;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass87Array2[local78].anInt3139;
		}
		@Pc(101) int local101 = arg2.aClass256Array1 == null ? 0 : arg2.aClass256Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class256 local116 = arg2.aClass256Array1[local110];
			@Pc(121) Class280 local121 = Static298.method5320(local116.anInt7918);
			local106[local108++] = local116.anInt7920;
			local106[local108++] = local121.anInt8472;
			local106[local108++] = local121.anInt8474;
			local106[local108++] = local121.anInt8471;
			local106[local108++] = local121.anInt8476;
			local106[local108++] = local121.anInt8477;
			local106[local108++] = local121.aBoolean606 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class256 local179 = arg2.aClass256Array1[local173];
			local106[local108++] = local179.anInt7921;
		}
		this.R(this.anOa2, this.aYa1, arg2.anInt1679, arg2.anInt1673, arg2.anIntArray64, arg2.anIntArray66, arg2.anIntArray67, arg2.anIntArray72, arg2.aShortArray15, arg2.anInt1670, arg2.aShortArray20, arg2.aShortArray14, arg2.aShortArray17, arg2.aByteArray25, arg2.aByteArray24, arg2.aByteArray23, arg2.aByteArray20, arg2.aShortArray19, arg2.aShortArray11, arg2.anIntArray63, arg2.aByte20, arg2.aShortArray18, arg2.anInt1671, arg2.aByteArray21, arg2.aShortArray13, arg2.aShortArray16, arg2.aShortArray12, arg2.anIntArray69, arg2.anIntArray62, arg2.anIntArray65, arg2.aByteArray22, arg2.aByteArray26, arg2.anIntArray71, arg2.anIntArray68, arg2.anIntArray70, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;)V")
	public i(@OriginalArg(0) oa arg0) {
		this.anOa2 = arg0;
		this.aYa1 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
	public native void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
	protected native boolean NA();

	@OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
	public native boolean F();

	@OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Lclient!i;Lclient!i;IZZ)V")
	public native void ZA(@OriginalArg(0) i arg0, @OriginalArg(1) i arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method6683(@OriginalArg(0) Class166 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anOa2.method6405().method3(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
	public native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!bca;ZII)Z")
	@Override
	public boolean method6693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class30 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.anOa2.method6405().method2(this, arg0, arg1, arg2, arg3, arg5);
	}

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()[Lclient!nn;")
	@Override
	public Class227[] method6689() {
		return this.aClass227Array2;
	}

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
	protected native void wa();

	@OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
	protected native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!bca;Lclient!iw;II)V")
	@Override
	public void method6678(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class3_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.anOa2.method6405().method8(this, arg0, null, arg2, arg3);
			return;
		}
		Static387.anIntArray473[5] = 0;
		this.anOa2.method6405().method8(this, arg0, Static387.anIntArray473, arg2, arg3);
		arg1.anInt5420 = Static387.anIntArray473[0];
		arg1.anInt5417 = Static387.anIntArray473[1];
		arg1.anInt5421 = Static387.anIntArray473[2];
		arg1.anInt5419 = Static387.anIntArray473[3];
		arg1.anInt5418 = Static387.anIntArray473[4];
		arg1.aBoolean411 = Static387.anIntArray473[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()Z")
	@Override
	public boolean method6688() {
		return true;
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()V")
	@Override
	protected void method6691() {
		if (this.anOa2.anInt7473 > 1) {
			synchronized (this) {
				super.aBoolean559 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
	public native void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!bca;ZI)Z")
	@Override
	public boolean method6698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class30 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.anOa2.method6405().method5(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class166 method6684(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anOa2.method6405().method11(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
	public native int HA();

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()V")
	@Override
	public void method6682() {
	}

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65 arg2, @OriginalArg(3) Class65 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method6675(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.l(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
	public native int G();

	@OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!i", name = "R", descriptor = "(Lclient!oa;Lclient!ya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void R(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
	public native void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
	public native void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static59.method1913(this);
		}
	}

	@OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!bca;IZ)V")
	@Override
	public void method6680(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.A(((ja) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()V")
	@Override
	protected void method6692() {
		if (this.anOa2.anInt7473 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean559) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean559 = true;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!bca;Lclient!iw;I)V")
	@Override
	public void method6685(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class3_Sub3 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anOa2.method6405().method4(this, arg0, null, arg2);
			return;
		}
		Static387.anIntArray473[5] = 0;
		this.anOa2.method6405().method4(this, arg0, Static387.anIntArray473, arg2);
		arg1.anInt5420 = Static387.anIntArray473[0];
		arg1.anInt5417 = Static387.anIntArray473[1];
		arg1.anInt5421 = Static387.anIntArray473[2];
		arg1.anInt5419 = Static387.anIntArray473[3];
		arg1.anInt5418 = Static387.anIntArray473[4];
		arg1.aBoolean411 = Static387.anIntArray473[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
	public native boolean r();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!bca;)V")
	@Override
	public void method6690(@OriginalArg(0) Class30 arg0) {
		this.method4358(Static387.anIntArray477, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass227Array2 != null) {
			for (local10 = 0; local10 < this.aClass227Array2.length; local10++) {
				@Pc(16) Class227 local16 = this.aClass227Array2[local10];
				local16.anInt7394 = Static387.anIntArray477[local5++];
				local16.anInt7400 = Static387.anIntArray477[local5++];
				local16.anInt7398 = Static387.anIntArray477[local5++];
				local16.anInt7395 = Static387.anIntArray477[local5++];
				local16.anInt7399 = Static387.anIntArray477[local5++];
				local16.anInt7392 = Static387.anIntArray477[local5++];
				local16.anInt7389 = Static387.anIntArray477[local5++];
				local16.anInt7388 = Static387.anIntArray477[local5++];
				local16.anInt7396 = Static387.anIntArray477[local5++];
			}
		}
		if (this.aClass87Array2 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass87Array2.length; local10++) {
			@Pc(87) Class87 local87 = this.aClass87Array2[local10];
			@Pc(89) Class87 local89 = local87;
			if (local87.aClass87_1 != null) {
				local89 = local87.aClass87_1;
			}
			if (local87.aClass30_4 == null) {
				local87.aClass30_4 = arg0.method4662();
			} else {
				local87.aClass30_4.method4653(arg0);
			}
			local89.anInt3133 = Static387.anIntArray477[local5++];
			local89.anInt3134 = Static387.anIntArray477[local5++];
			local89.anInt3135 = Static387.anIntArray477[local5++];
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()[Lclient!eca;")
	@Override
	public Class87[] method6674() {
		return this.aClass87Array2;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!bca;)V")
	private void method4358(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class30 arg1) {
		this.anOa2.method6405().method10(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
	public native int ua();

	@OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "A", descriptor = "(JIZ)V")
	private native void A(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public native Class2_Sub6_Sub7 ba(@OriginalArg(0) Class2_Sub6_Sub7 arg0);

	@OriginalMember(owner = "client!i", name = "oa", descriptor = "(Lclient!oa;)V")
	private native void oa(@OriginalArg(0) oa arg0);

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);
}
