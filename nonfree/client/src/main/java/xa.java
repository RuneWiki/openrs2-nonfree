import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xa")
public final class xa extends Class57 implements Interface12 {

	@OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!xa", name = "n", descriptor = "Lclient!w;")
	private final w aW3;

	@OriginalMember(owner = "client!xa", name = "q", descriptor = "Lclient!g;")
	private final g aG2;

	@OriginalMember(owner = "client!xa", name = "p", descriptor = "[Lclient!su;")
	public Class229[] aClass229Array4;

	@OriginalMember(owner = "client!xa", name = "o", descriptor = "[Lclient!op;")
	public Class181[] aClass181Array4;

	@OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lclient!w;Lclient!g;Lclient!pq;IIII)V")
	public xa(@OriginalArg(0) w arg0, @OriginalArg(1) g arg1, @OriginalArg(2) Class193 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aW3 = arg0;
		this.aG2 = arg1;
		this.aClass229Array4 = arg2.aClass229Array3;
		this.aClass181Array4 = arg2.aClass181Array3;
		@Pc(24) int local24 = arg2.aClass229Array3 == null ? 0 : arg2.aClass229Array3.length;
		@Pc(33) int local33 = arg2.aClass181Array3 == null ? 0 : arg2.aClass181Array3.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass229Array4[local44].anInt6353;
			local42[local35++] = this.aClass229Array4[local44].anInt6352;
			local42[local35++] = this.aClass229Array4[local44].anInt6347;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass181Array4[local78].anInt5139;
		}
		@Pc(101) int local101 = arg2.aClass167Array1 == null ? 0 : arg2.aClass167Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class167 local116 = arg2.aClass167Array1[local110];
			@Pc(121) Class207 local121 = Static105.method1611(local116.anInt4864);
			local106[local108++] = local116.anInt4862;
			local106[local108++] = local121.anInt5799;
			local106[local108++] = local121.anInt5795;
			local106[local108++] = local121.anInt5792;
			local106[local108++] = local121.anInt5791;
			local106[local108++] = local121.anInt5794;
			local106[local108++] = local121.aBoolean662 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class167 local179 = arg2.aClass167Array1[local173];
			local106[local108++] = local179.anInt4866;
		}
		this.P(this.aW3, this.aG2, arg2.anInt5447, arg2.anInt5435, arg2.anIntArray365, arg2.anIntArray363, arg2.anIntArray361, arg2.anIntArray366, arg2.aShortArray90, arg2.anInt5437, arg2.aShortArray93, arg2.aShortArray96, arg2.aShortArray94, arg2.aByteArray65, arg2.aByteArray66, arg2.aByteArray69, arg2.aByteArray68, arg2.aShortArray91, arg2.aShortArray89, arg2.anIntArray359, arg2.aByte93, arg2.aShortArray95, arg2.anInt5449, arg2.aByteArray67, arg2.aShortArray88, arg2.aShortArray92, arg2.aShortArray87, arg2.anIntArray362, arg2.anIntArray367, arg2.anIntArray364, arg2.aByteArray63, arg2.aByteArray64, arg2.anIntArray357, arg2.anIntArray360, arg2.anIntArray358, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lclient!w;)V")
	public xa(@OriginalArg(0) w arg0) {
		this.aW3 = arg0;
		this.aG2 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!xa", name = "b", descriptor = "()[Lclient!su;")
	@Override
	public Class229[] method5958() {
		return this.aClass229Array4;
	}

	@OriginalMember(owner = "client!xa", name = "L", descriptor = "()V")
	public native void L();

	@OriginalMember(owner = "client!xa", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "P", descriptor = "(Lclient!w;Lclient!g;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void P(@OriginalArg(0) w arg0, @OriginalArg(1) g arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!xa", name = "d", descriptor = "()V")
	@Override
	public void method5963() {
	}

	@OriginalMember(owner = "client!xa", name = "ma", descriptor = "(I)V")
	public native void ma(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "c", descriptor = "()[Lclient!op;")
	@Override
	public Class181[] method5959() {
		return this.aClass181Array4;
	}

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lclient!c;Lclient!ut;II)V")
	@Override
	public void method5967(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class4_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aW3.method5804().LA(this, arg0, null, arg2, 1);
			return;
		}
		Static439.anIntArray501[5] = 0;
		this.aW3.method5804().LA(this, arg0, Static439.anIntArray501, arg2, 1);
		arg1.anInt7128 = Static439.anIntArray501[0];
		arg1.anInt7127 = Static439.anIntArray501[1];
		arg1.anInt7125 = Static439.anIntArray501[2];
		arg1.anInt7129 = Static439.anIntArray501[3];
		arg1.anInt7126 = Static439.anIntArray501[4];
		arg1.aBoolean779 = Static439.anIntArray501[5] != 0;
	}

	@OriginalMember(owner = "client!xa", name = "EA", descriptor = "(Lclient!i;)Lclient!i;")
	public native Class1_Sub5_Sub10 EA(@OriginalArg(0) Class1_Sub5_Sub10 arg0);

	@OriginalMember(owner = "client!xa", name = "u", descriptor = "(SS)V")
	public native void u(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!xa", name = "MA", descriptor = "()I")
	public native int MA();

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "()Z")
	@Override
	public boolean method5952() {
		return true;
	}

	@OriginalMember(owner = "client!xa", name = "h", descriptor = "()Z")
	protected native boolean h();

	@OriginalMember(owner = "client!xa", name = "W", descriptor = "(I)V")
	public native void W(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "l", descriptor = "()I")
	public native int l();

	@OriginalMember(owner = "client!xa", name = "S", descriptor = "()I")
	public native int S();

	@OriginalMember(owner = "client!xa", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(IILclient!c;Z)Z")
	@Override
	public boolean method5957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) boolean arg3) {
		return this.aW3.method5804().ia(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(BIZ)Lclient!e;")
	@Override
	public Class57 method5966(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.aW3.method5804().method2898(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!xa", name = "k", descriptor = "()I")
	public native int k();

	@OriginalMember(owner = "client!xa", name = "KA", descriptor = "()V")
	protected native void KA();

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!xa", name = "SA", descriptor = "(Lclient!xa;Lclient!xa;IZZ)V")
	public native void SA(@OriginalArg(0) xa arg0, @OriginalArg(1) xa arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static314.method4249(this);
		}
	}

	@OriginalMember(owner = "client!xa", name = "q", descriptor = "(SS)V")
	public native void q(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(ILclient!c;)V")
	public void method5968(@OriginalArg(0) int arg0, @OriginalArg(1) Class32 arg1) {
		@Pc(1) int local1 = arg0;
		@Pc(6) int local6;
		if (this.aClass229Array4 != null) {
			for (local6 = 0; local6 < this.aClass229Array4.length; local6++) {
				@Pc(12) Class229 local12 = this.aClass229Array4[local6];
				local12.anInt6343 = Static439.anIntArray499[local1++];
				local12.anInt6350 = Static439.anIntArray499[local1++];
				local12.anInt6340 = Static439.anIntArray499[local1++];
				local12.anInt6341 = Static439.anIntArray499[local1++];
				local12.anInt6355 = Static439.anIntArray499[local1++];
				local12.anInt6342 = Static439.anIntArray499[local1++];
				local12.anInt6357 = Static439.anIntArray499[local1++];
				local12.anInt6345 = Static439.anIntArray499[local1++];
				local12.anInt6348 = Static439.anIntArray499[local1++];
			}
		}
		if (this.aClass181Array4 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass181Array4.length; local6++) {
			@Pc(83) Class181 local83 = this.aClass181Array4[local6];
			@Pc(85) Class181 local85 = local83;
			if (local83.aClass181_2 != null) {
				local85 = local83.aClass181_2;
			}
			if (local83.aClass32_8 == null) {
				local83.aClass32_8 = arg1.method4315();
			} else {
				local83.aClass32_8.ha(arg1);
			}
			local85.anInt5144 = Static439.anIntArray499[local1++];
			local85.anInt5141 = Static439.anIntArray499[local1++];
			local85.anInt5136 = Static439.anIntArray499[local1++];
		}
	}

	@OriginalMember(owner = "client!xa", name = "D", descriptor = "(I)V")
	public native void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "p", descriptor = "()V")
	public native void p();

	@OriginalMember(owner = "client!xa", name = "n", descriptor = "(III)V")
	public native void n(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!xa", name = "pa", descriptor = "()I")
	public native int pa();

	@OriginalMember(owner = "client!xa", name = "X", descriptor = "(I)V")
	public native void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "da", descriptor = "(IILclient!ya;Lclient!ya;III)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2, @OriginalArg(3) Class157 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!xa", name = "K", descriptor = "(I)V")
	public native void K(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "A", descriptor = "(I)V")
	public native void A(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "B", descriptor = "()I")
	public native int B();

	@OriginalMember(owner = "client!xa", name = "aa", descriptor = "(I[IIIIZI[I)V")
	protected native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!xa", name = "ta", descriptor = "()I")
	public native int ta();

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(III)V")
	public native void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!xa", name = "Y", descriptor = "()I")
	public native int Y();

	@OriginalMember(owner = "client!xa", name = "oa", descriptor = "(Lclient!w;)V")
	private native void oa(@OriginalArg(0) w arg0);

	@OriginalMember(owner = "client!xa", name = "va", descriptor = "(I[IIIIIZ)V")
	protected native void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!xa", name = "Z", descriptor = "()I")
	public native int Z();

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lclient!e;IIIZ)V")
	@Override
	public void method5956(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aW3.method5804().s(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!xa", name = "za", descriptor = "(IIII)V")
	protected native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lclient!c;Lclient!ut;I)V")
	@Override
	public void method5953(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class4_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aW3.method5804().MA(this, arg0, null, arg2);
			return;
		}
		Static439.anIntArray501[5] = 0;
		this.aW3.method5804().MA(this, arg0, Static439.anIntArray501, arg2);
		arg1.anInt7128 = Static439.anIntArray501[0];
		arg1.anInt7127 = Static439.anIntArray501[1];
		arg1.anInt7125 = Static439.anIntArray501[2];
		arg1.anInt7129 = Static439.anIntArray501[3];
		arg1.anInt7126 = Static439.anIntArray501[4];
		arg1.aBoolean779 = Static439.anIntArray501[5] != 0;
	}
}
