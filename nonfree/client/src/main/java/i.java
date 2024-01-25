import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class128 implements Interface7 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!i", name = "r", descriptor = "Lclient!oa;")
	private final oa anOa2;

	@OriginalMember(owner = "client!i", name = "s", descriptor = "Lclient!ya;")
	private final ya aYa1;

	@OriginalMember(owner = "client!i", name = "q", descriptor = "[Lclient!al;")
	public Class18[] aClass18Array3;

	@OriginalMember(owner = "client!i", name = "t", descriptor = "[Lclient!mi;")
	public Class215[] aClass215Array3;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!id;IIII)V")
	public i(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class142 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anOa2 = arg0;
		this.aYa1 = arg1;
		this.aClass18Array3 = arg2.aClass18Array4;
		this.aClass215Array3 = arg2.aClass215Array4;
		@Pc(24) int local24 = arg2.aClass18Array4 == null ? 0 : arg2.aClass18Array4.length;
		@Pc(33) int local33 = arg2.aClass215Array4 == null ? 0 : arg2.aClass215Array4.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass18Array3[local44].anInt196;
			local42[local35++] = this.aClass18Array3[local44].anInt197;
			local42[local35++] = this.aClass18Array3[local44].anInt203;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass215Array3[local78].anInt6805;
		}
		@Pc(101) int local101 = arg2.aClass223Array1 == null ? 0 : arg2.aClass223Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class223 local116 = arg2.aClass223Array1[local110];
			@Pc(121) Class346 local121 = Static328.method5503(local116.anInt6992);
			local106[local108++] = local116.anInt6988;
			local106[local108++] = local121.anInt9796;
			local106[local108++] = local121.anInt9797;
			local106[local108++] = local121.anInt9795;
			local106[local108++] = local121.anInt9794;
			local106[local108++] = local121.anInt9798;
			local106[local108++] = local121.aBoolean809 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class223 local179 = arg2.aClass223Array1[local173];
			local106[local108++] = local179.anInt6987;
		}
		this.R(this.anOa2, this.aYa1, arg2.anInt5171, arg2.anInt5152, arg2.anIntArray301, arg2.anIntArray293, arg2.anIntArray299, arg2.anIntArray297, arg2.aShortArray72, arg2.anInt5154, arg2.aShortArray68, arg2.aShortArray74, arg2.aShortArray73, arg2.aByteArray54, arg2.aByteArray53, arg2.aByteArray51, arg2.aByteArray56, arg2.aShortArray70, arg2.aShortArray75, arg2.anIntArray298, arg2.aByte59, arg2.aShortArray71, arg2.anInt5164, arg2.aByteArray52, arg2.aShortArray67, arg2.aShortArray66, arg2.aShortArray69, arg2.anIntArray302, arg2.anIntArray294, arg2.anIntArray303, arg2.aByteArray57, arg2.aByteArray55, arg2.anIntArray295, arg2.anIntArray300, arg2.anIntArray296, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;)V")
	public i(@OriginalArg(0) oa arg0) {
		this.anOa2 = arg0;
		this.aYa1 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
	protected native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
	public native int ua();

	@OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
	public native void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
	protected native boolean NA();

	@OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "oa", descriptor = "(Lclient!oa;)V")
	private native void oa(@OriginalArg(0) oa arg0);

	@OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
	public native boolean F();

	@OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
	public native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!wc;ZI)Z")
	@Override
	public boolean method6296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.anOa2.method6238().method11(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Lclient!i;Lclient!i;IZZ)V")
	public native void ZA(@OriginalArg(0) i arg0, @OriginalArg(1) i arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!wc;Lclient!fda;I)V")
	@Override
	public void method6281(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class2_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anOa2.method6238().method2(this, arg0, null, arg2);
			return;
		}
		Static391.anIntArray453[5] = 0;
		this.anOa2.method6238().method2(this, arg0, Static391.anIntArray453, arg2);
		arg1.anInt3617 = Static391.anIntArray453[0];
		arg1.anInt3613 = Static391.anIntArray453[1];
		arg1.anInt3615 = Static391.anIntArray453[2];
		arg1.anInt3614 = Static391.anIntArray453[3];
		arg1.anInt3616 = Static391.anIntArray453[4];
		arg1.aBoolean303 = Static391.anIntArray453[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!wc;)V")
	private void method4322(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class47 arg1) {
		this.anOa2.method6238().method8(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
	protected native void wa();

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()[Lclient!al;")
	@Override
	public Class18[] method6277() {
		return this.aClass18Array3;
	}

	@OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!wc;IZ)V")
	@Override
	public void method6272(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.E(((ja) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
	public native boolean r();

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
	public native int HA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!wc;)V")
	@Override
	public void method6287(@OriginalArg(0) Class47 arg0) {
		this.method4322(Static391.anIntArray452, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass18Array3 != null) {
			for (local10 = 0; local10 < this.aClass18Array3.length; local10++) {
				@Pc(16) Class18 local16 = this.aClass18Array3[local10];
				local16.anInt198 = Static391.anIntArray452[local5++];
				local16.anInt199 = Static391.anIntArray452[local5++];
				local16.anInt204 = Static391.anIntArray452[local5++];
				local16.anInt194 = Static391.anIntArray452[local5++];
				local16.anInt201 = Static391.anIntArray452[local5++];
				local16.anInt200 = Static391.anIntArray452[local5++];
				local16.anInt208 = Static391.anIntArray452[local5++];
				local16.anInt207 = Static391.anIntArray452[local5++];
				local16.anInt206 = Static391.anIntArray452[local5++];
			}
		}
		if (this.aClass215Array3 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass215Array3.length; local10++) {
			@Pc(87) Class215 local87 = this.aClass215Array3[local10];
			@Pc(89) Class215 local89 = local87;
			if (local87.aClass215_1 != null) {
				local89 = local87.aClass215_1;
			}
			if (local87.aClass47_3 == null) {
				local87.aClass47_3 = arg0.method7867();
			} else {
				local87.aClass47_3.method7877(arg0);
			}
			local89.anInt6806 = Static391.anIntArray452[local5++];
			local89.anInt6804 = Static391.anIntArray452[local5++];
			local89.anInt6810 = Static391.anIntArray452[local5++];
		}
	}

	@OriginalMember(owner = "client!i", name = "R", descriptor = "(Lclient!oa;Lclient!ya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void R(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class128 method6279(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anOa2.method6238().method3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
	public native void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method6274(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anOa2.method6238().method12(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class274 arg2, @OriginalArg(3) Class274 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()Z")
	@Override
	public boolean method6270() {
		return true;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!wc;Lclient!fda;II)V")
	@Override
	public void method6294(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class2_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.anOa2.method6238().method16(this, arg0, null, arg2, arg3);
			return;
		}
		Static391.anIntArray453[5] = 0;
		this.anOa2.method6238().method16(this, arg0, Static391.anIntArray453, arg2, arg3);
		arg1.anInt3617 = Static391.anIntArray453[0];
		arg1.anInt3613 = Static391.anIntArray453[1];
		arg1.anInt3615 = Static391.anIntArray453[2];
		arg1.anInt3614 = Static391.anIntArray453[3];
		arg1.anInt3616 = Static391.anIntArray453[4];
		arg1.aBoolean303 = Static391.anIntArray453[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()[Lclient!mi;")
	@Override
	public Class215[] method6278() {
		return this.aClass215Array3;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!wc;ZII)Z")
	@Override
	public boolean method6283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.anOa2.method6238().method15(this, arg0, arg1, arg2, arg3, arg5);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method6271(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.l(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
	public native void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
	public native void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public native Class3_Sub1_Sub6 ba(@OriginalArg(0) Class3_Sub1_Sub6 arg0);

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static549.method7734(this);
		}
	}

	@OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!i", name = "E", descriptor = "(JIZ)V")
	private native void E(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()V")
	@Override
	public void method6295() {
	}

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
	@Override
	protected void method6288() {
		if (this.anOa2.anInt7423 > 1) {
			synchronized (this) {
				super.aBoolean639 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
	public native int G();

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()V")
	@Override
	protected void method6291() {
		if (this.anOa2.anInt7423 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean639) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean639 = true;
		}
	}
}
