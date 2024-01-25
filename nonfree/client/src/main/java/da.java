import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class da extends Class105 implements Interface2 {

	@OriginalMember(owner = "client!da", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!da", name = "u", descriptor = "Lclient!qa;")
	private final qa aQa1;

	@OriginalMember(owner = "client!da", name = "w", descriptor = "Lclient!na;")
	private final na aNa1;

	@OriginalMember(owner = "client!da", name = "x", descriptor = "[Lclient!uj;")
	public Class244[] aClass244Array1;

	@OriginalMember(owner = "client!da", name = "v", descriptor = "[Lclient!dv;")
	public Class57[] aClass57Array1;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!qa;Lclient!na;Lclient!tp;IIII)V")
	public da(@OriginalArg(0) qa arg0, @OriginalArg(1) na arg1, @OriginalArg(2) Class236 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aQa1 = arg0;
		this.aNa1 = arg1;
		this.aClass244Array1 = arg2.aClass244Array4;
		this.aClass57Array1 = arg2.aClass57Array4;
		@Pc(24) int local24 = arg2.aClass244Array4 == null ? 0 : arg2.aClass244Array4.length;
		@Pc(33) int local33 = arg2.aClass57Array4 == null ? 0 : arg2.aClass57Array4.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass244Array1[local44].anInt6577;
			local42[local35++] = this.aClass244Array1[local44].anInt6578;
			local42[local35++] = this.aClass244Array1[local44].anInt6579;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass57Array1[local78].anInt1834;
		}
		@Pc(101) int local101 = arg2.aClass177Array1 == null ? 0 : arg2.aClass177Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class177 local116 = arg2.aClass177Array1[local110];
			@Pc(121) Class266 local121 = Static425.method5648(local116.anInt4871);
			local106[local108++] = local116.anInt4873;
			local106[local108++] = local121.anInt7161;
			local106[local108++] = local121.anInt7164;
			local106[local108++] = local121.anInt7159;
			local106[local108++] = local121.anInt7157;
			local106[local108++] = local121.anInt7156;
			local106[local108++] = local121.aBoolean495 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class177 local179 = arg2.aClass177Array1[local173];
			local106[local108++] = local179.anInt4869;
		}
		this.q(this.aQa1, this.aNa1, arg2.anInt6285, arg2.anInt6290, arg2.anIntArray581, arg2.anIntArray572, arg2.anIntArray575, arg2.anIntArray573, arg2.aShortArray108, arg2.anInt6304, arg2.aShortArray109, arg2.aShortArray110, arg2.aShortArray101, arg2.aByteArray86, arg2.aByteArray82, arg2.aByteArray87, arg2.aByteArray88, arg2.aShortArray103, arg2.aShortArray104, arg2.anIntArray580, arg2.aByte91, arg2.aShortArray105, arg2.anInt6288, arg2.aByteArray84, arg2.aShortArray107, arg2.aShortArray106, arg2.aShortArray102, arg2.anIntArray577, arg2.anIntArray578, arg2.anIntArray571, arg2.aByteArray85, arg2.aByteArray83, arg2.anIntArray579, arg2.anIntArray574, arg2.anIntArray576, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!qa;)V")
	public da(@OriginalArg(0) qa arg0) {
		this.aQa1 = arg0;
		this.aNa1 = null;
		this.o(arg0);
	}

	@OriginalMember(owner = "client!da", name = "PA", descriptor = "()I")
	public native int PA();

	@OriginalMember(owner = "client!da", name = "aa", descriptor = "(I)V")
	public native void aa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "w", descriptor = "()Z")
	protected native boolean w();

	@OriginalMember(owner = "client!da", name = "D", descriptor = "()I")
	public native int D();

	@OriginalMember(owner = "client!da", name = "R", descriptor = "(I)V")
	public native void R(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "q", descriptor = "(Lclient!qa;Lclient!na;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void q(@OriginalArg(0) qa arg0, @OriginalArg(1) na arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!t;IIIZ)V")
	@Override
	public void method3532(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aQa1.method4571().U(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!da", name = "HA", descriptor = "()I")
	public native int HA();

	@OriginalMember(owner = "client!da", name = "EA", descriptor = "()V")
	public native void EA();

	@OriginalMember(owner = "client!da", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "h", descriptor = "(IILclient!ta;Lclient!ta;III)V")
	public native void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class149 arg2, @OriginalArg(3) Class149 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!da", name = "N", descriptor = "(IIII)V")
	protected native void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "MA", descriptor = "()I")
	public native int MA();

	@OriginalMember(owner = "client!da", name = "m", descriptor = "()I")
	public native int m();

	@OriginalMember(owner = "client!da", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!da", name = "l", descriptor = "()I")
	public native int l();

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()[Lclient!uj;")
	@Override
	public Class244[] method3535() {
		return this.aClass244Array1;
	}

	@OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static382.method5154(this);
	}

	@OriginalMember(owner = "client!da", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!da", name = "P", descriptor = "()I")
	public native int P();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
	@Override
	public void method3537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!da", name = "UA", descriptor = "(I)V")
	public native void UA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "BA", descriptor = "(SS)V")
	public native void BA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!c;Lclient!ju;II)V")
	@Override
	public void method3546(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class4_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aQa1.method4571().ta(this, arg0, null, arg2, 1);
			return;
		}
		Static318.anIntArray503[5] = 0;
		this.aQa1.method4571().ta(this, arg0, Static318.anIntArray503, arg2, 1);
		arg1.anInt3546 = Static318.anIntArray503[0];
		arg1.anInt3548 = Static318.anIntArray503[1];
		arg1.anInt3545 = Static318.anIntArray503[2];
		arg1.anInt3547 = Static318.anIntArray503[3];
		arg1.anInt3544 = Static318.anIntArray503[4];
		arg1.aBoolean227 = Static318.anIntArray503[5] != 0;
	}

	@OriginalMember(owner = "client!da", name = "Q", descriptor = "(I)V")
	public native void Q(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!c;Lclient!ju;I)V")
	@Override
	public void method3534(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class4_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aQa1.method4571().ea(this, arg0, null, arg2);
			return;
		}
		Static318.anIntArray503[5] = 0;
		this.aQa1.method4571().ea(this, arg0, Static318.anIntArray503, arg2);
		arg1.anInt3546 = Static318.anIntArray503[0];
		arg1.anInt3548 = Static318.anIntArray503[1];
		arg1.anInt3545 = Static318.anIntArray503[2];
		arg1.anInt3547 = Static318.anIntArray503[3];
		arg1.anInt3544 = Static318.anIntArray503[4];
		arg1.aBoolean227 = Static318.anIntArray503[5] != 0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!c;Z)Z")
	@Override
	public boolean method3526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(3) boolean arg3) {
		return this.aQa1.method4571().B(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!da", name = "Z", descriptor = "(I)V")
	public native void Z(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "XA", descriptor = "(I[IIIIIZ)V")
	protected native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(Lclient!ba;)Lclient!ba;")
	public native Class1_Sub2_Sub1 fa(@OriginalArg(0) Class1_Sub2_Sub1 arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!c;)V")
	public void method1372(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1) {
		@Pc(1) int local1 = arg0;
		@Pc(6) int local6;
		if (this.aClass244Array1 != null) {
			for (local6 = 0; local6 < this.aClass244Array1.length; local6++) {
				@Pc(12) Class244 local12 = this.aClass244Array1[local6];
				local12.anInt6571 = Static318.anIntArray501[local1++];
				local12.anInt6568 = Static318.anIntArray501[local1++];
				local12.anInt6576 = Static318.anIntArray501[local1++];
				local12.anInt6570 = Static318.anIntArray501[local1++];
				local12.anInt6582 = Static318.anIntArray501[local1++];
				local12.anInt6580 = Static318.anIntArray501[local1++];
				local12.anInt6584 = Static318.anIntArray501[local1++];
				local12.anInt6585 = Static318.anIntArray501[local1++];
				local12.anInt6574 = Static318.anIntArray501[local1++];
			}
		}
		if (this.aClass57Array1 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass57Array1.length; local6++) {
			@Pc(83) Class57 local83 = this.aClass57Array1[local6];
			@Pc(85) Class57 local85 = local83;
			if (local83.aClass57_1 != null) {
				local85 = local83.aClass57_1;
			}
			if (local83.aClass33_1 == null) {
				local83.aClass33_1 = arg1.method4612();
			} else {
				local83.aClass33_1.za(arg1);
			}
			local85.anInt1828 = Static318.anIntArray501[local1++];
			local85.anInt1831 = Static318.anIntArray501[local1++];
			local85.anInt1830 = Static318.anIntArray501[local1++];
		}
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "()Z")
	@Override
	public boolean method3538() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "E", descriptor = "(I)V")
	public native void E(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "j", descriptor = "()V")
	protected native void j();

	@OriginalMember(owner = "client!da", name = "M", descriptor = "(I[IIIIZI[I)V")
	protected native void M(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZ)Lclient!t;")
	@Override
	public Class105 method3548(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.aQa1.method4571().method3842(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!da", name = "JA", descriptor = "(III)V")
	public native void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "NA", descriptor = "()I")
	public native int NA();

	@OriginalMember(owner = "client!da", name = "o", descriptor = "(Lclient!qa;)V")
	private native void o(@OriginalArg(0) qa arg0);

	@OriginalMember(owner = "client!da", name = "ya", descriptor = "(Lclient!da;Lclient!da;IZZ)V")
	public native void ya(@OriginalArg(0) da arg0, @OriginalArg(1) da arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
	public native void c(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "d", descriptor = "()V")
	@Override
	public void method3542() {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()[Lclient!dv;")
	@Override
	public Class57[] method3530() {
		return this.aClass57Array1;
	}

	@OriginalMember(owner = "client!da", name = "I", descriptor = "(SS)V")
	public native void I(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!da", name = "IA", descriptor = "()V")
	public native void IA();
}
