import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xa")
public final class xa extends Class8 implements Interface5 {

	@OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!xa", name = "t", descriptor = "Lclient!w;")
	private final w aW3;

	@OriginalMember(owner = "client!xa", name = "r", descriptor = "Lclient!g;")
	private final g aG2;

	@OriginalMember(owner = "client!xa", name = "q", descriptor = "[Lclient!ck;")
	public Class40[] aClass40Array4;

	@OriginalMember(owner = "client!xa", name = "s", descriptor = "[Lclient!sd;")
	public Class230[] aClass230Array4;

	@OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lclient!w;Lclient!g;Lclient!ld;IIII)V")
	public xa(@OriginalArg(0) w arg0, @OriginalArg(1) g arg1, @OriginalArg(2) Class147 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aW3 = arg0;
		this.aG2 = arg1;
		this.aClass40Array4 = arg2.aClass40Array2;
		this.aClass230Array4 = arg2.aClass230Array2;
		@Pc(24) int local24 = arg2.aClass40Array2 == null ? 0 : arg2.aClass40Array2.length;
		@Pc(33) int local33 = arg2.aClass230Array2 == null ? 0 : arg2.aClass230Array2.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass40Array4[local44].anInt765;
			local42[local35++] = this.aClass40Array4[local44].anInt764;
			local42[local35++] = this.aClass40Array4[local44].anInt756;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass230Array4[local78].anInt6004;
		}
		@Pc(101) int local101 = arg2.aClass264Array1 == null ? 0 : arg2.aClass264Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class264 local116 = arg2.aClass264Array1[local110];
			@Pc(121) Class27 local121 = Static256.method3592(local116.anInt6896);
			local106[local108++] = local116.anInt6895;
			local106[local108++] = local121.anInt399;
			local106[local108++] = local121.anInt397;
			local106[local108++] = local121.anInt403;
			local106[local108++] = local121.anInt395;
			local106[local108++] = local121.anInt402;
			local106[local108++] = local121.aBoolean65 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class264 local179 = arg2.aClass264Array1[local173];
			local106[local108++] = local179.anInt6891;
		}
		this.P(this.aW3, this.aG2, arg2.anInt4178, arg2.anInt4183, arg2.anIntArray305, arg2.anIntArray301, arg2.anIntArray300, arg2.anIntArray304, arg2.aShortArray56, arg2.anInt4185, arg2.aShortArray61, arg2.aShortArray57, arg2.aShortArray62, arg2.aByteArray57, arg2.aByteArray59, arg2.aByteArray60, arg2.aByteArray55, arg2.aShortArray63, arg2.aShortArray60, arg2.anIntArray307, arg2.aByte64, arg2.aShortArray59, arg2.anInt4171, arg2.aByteArray54, arg2.aShortArray58, arg2.aShortArray65, arg2.aShortArray64, arg2.anIntArray306, arg2.anIntArray303, arg2.anIntArray298, arg2.aByteArray56, arg2.aByteArray58, arg2.anIntArray302, arg2.anIntArray299, arg2.anIntArray297, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lclient!w;)V")
	public xa(@OriginalArg(0) w arg0) {
		this.aW3 = arg0;
		this.aG2 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!xa", name = "W", descriptor = "(I)V")
	public native void W(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "l", descriptor = "()I")
	public native int l();

	@OriginalMember(owner = "client!xa", name = "c", descriptor = "()Z")
	@Override
	public boolean method5994() {
		return true;
	}

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "()[Lclient!sd;")
	@Override
	public Class230[] method5988() {
		return this.aClass230Array4;
	}

	@OriginalMember(owner = "client!xa", name = "u", descriptor = "(SS)V")
	public native void u(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!xa", name = "oa", descriptor = "(Lclient!w;)V")
	private native void oa(@OriginalArg(0) w arg0);

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(III)V")
	public native void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!xa", name = "D", descriptor = "(I)V")
	public native void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "SA", descriptor = "(Lclient!xa;Lclient!xa;IZZ)V")
	public native void SA(@OriginalArg(0) xa arg0, @OriginalArg(1) xa arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!xa", name = "Y", descriptor = "()I")
	public native int Y();

	@OriginalMember(owner = "client!xa", name = "da", descriptor = "(IILclient!ya;Lclient!ya;III)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class139 arg2, @OriginalArg(3) Class139 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!xa", name = "za", descriptor = "(IIII)V")
	protected native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!xa", name = "MA", descriptor = "()I")
	public native int MA();

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(ILclient!c;)V")
	public void method6001(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1) {
		@Pc(1) int local1 = arg0;
		@Pc(6) int local6;
		if (this.aClass40Array4 != null) {
			for (local6 = 0; local6 < this.aClass40Array4.length; local6++) {
				@Pc(12) Class40 local12 = this.aClass40Array4[local6];
				local12.anInt760 = Static444.anIntArray515[local1++];
				local12.anInt768 = Static444.anIntArray515[local1++];
				local12.anInt759 = Static444.anIntArray515[local1++];
				local12.anInt766 = Static444.anIntArray515[local1++];
				local12.anInt761 = Static444.anIntArray515[local1++];
				local12.anInt769 = Static444.anIntArray515[local1++];
				local12.anInt762 = Static444.anIntArray515[local1++];
				local12.anInt763 = Static444.anIntArray515[local1++];
				local12.anInt767 = Static444.anIntArray515[local1++];
			}
		}
		if (this.aClass230Array4 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass230Array4.length; local6++) {
			@Pc(83) Class230 local83 = this.aClass230Array4[local6];
			@Pc(85) Class230 local85 = local83;
			if (local83.aClass230_2 != null) {
				local85 = local83.aClass230_2;
			}
			if (local83.aClass34_6 == null) {
				local83.aClass34_6 = arg1.method4361();
			} else {
				local83.aClass34_6.ha(arg1);
			}
			local85.anInt6005 = Static444.anIntArray515[local1++];
			local85.anInt5996 = Static444.anIntArray515[local1++];
			local85.anInt5994 = Static444.anIntArray515[local1++];
		}
	}

	@OriginalMember(owner = "client!xa", name = "ma", descriptor = "(I)V")
	public native void ma(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "P", descriptor = "(Lclient!w;Lclient!g;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void P(@OriginalArg(0) w arg0, @OriginalArg(1) g arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!xa", name = "b", descriptor = "()V")
	@Override
	public void method5991() {
	}

	@OriginalMember(owner = "client!xa", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "q", descriptor = "(SS)V")
	public native void q(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!xa", name = "K", descriptor = "(I)V")
	public native void K(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "n", descriptor = "(III)V")
	public native void n(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!xa", name = "p", descriptor = "()V")
	public native void p();

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lclient!e;IIIZ)V")
	@Override
	public void method5996(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aW3.method5610().s(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!xa", name = "KA", descriptor = "()V")
	protected native void KA();

	@OriginalMember(owner = "client!xa", name = "aa", descriptor = "(I[IIIIZI[I)V")
	protected native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lclient!c;Lclient!wp;II)V")
	@Override
	public void method5999(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class111_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aW3.method5610().LA(this, arg0, null, arg2, 1);
			return;
		}
		Static444.anIntArray516[5] = 0;
		this.aW3.method5610().LA(this, arg0, Static444.anIntArray516, arg2, 1);
		arg1.anInt7285 = Static444.anIntArray516[0];
		arg1.anInt7282 = Static444.anIntArray516[1];
		arg1.anInt7283 = Static444.anIntArray516[2];
		arg1.anInt7284 = Static444.anIntArray516[3];
		arg1.anInt7286 = Static444.anIntArray516[4];
		arg1.aBoolean631 = Static444.anIntArray516[5] != 0;
	}

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(IILclient!c;Z)Z")
	@Override
	public boolean method5985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) boolean arg3) {
		return this.aW3.method5610().ia(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!xa", name = "h", descriptor = "()Z")
	protected native boolean h();

	@OriginalMember(owner = "client!xa", name = "B", descriptor = "()I")
	public native int B();

	@OriginalMember(owner = "client!xa", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!xa", name = "L", descriptor = "()V")
	public native void L();

	@OriginalMember(owner = "client!xa", name = "S", descriptor = "()I")
	public native int S();

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(BIZ)Lclient!e;")
	@Override
	public Class8 method5983(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.aW3.method5610().method3012(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!xa", name = "Z", descriptor = "()I")
	public native int Z();

	@OriginalMember(owner = "client!xa", name = "pa", descriptor = "()I")
	public native int pa();

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lclient!c;Lclient!wp;I)V")
	@Override
	public void method5987(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class111_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aW3.method5610().MA(this, arg0, null, arg2);
			return;
		}
		Static444.anIntArray516[5] = 0;
		this.aW3.method5610().MA(this, arg0, Static444.anIntArray516, arg2);
		arg1.anInt7285 = Static444.anIntArray516[0];
		arg1.anInt7282 = Static444.anIntArray516[1];
		arg1.anInt7283 = Static444.anIntArray516[2];
		arg1.anInt7284 = Static444.anIntArray516[3];
		arg1.anInt7286 = Static444.anIntArray516[4];
		arg1.aBoolean631 = Static444.anIntArray516[5] != 0;
	}

	@OriginalMember(owner = "client!xa", name = "va", descriptor = "(I[IIIIIZ)V")
	protected native void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!xa", name = "EA", descriptor = "(Lclient!i;)Lclient!i;")
	public native Class1_Sub3_Sub11 EA(@OriginalArg(0) Class1_Sub3_Sub11 arg0);

	@OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static280.method3757(this);
		}
	}

	@OriginalMember(owner = "client!xa", name = "ta", descriptor = "()I")
	public native int ta();

	@OriginalMember(owner = "client!xa", name = "k", descriptor = "()I")
	public native int k();

	@OriginalMember(owner = "client!xa", name = "A", descriptor = "(I)V")
	public native void A(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "X", descriptor = "(I)V")
	public native void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "d", descriptor = "()[Lclient!ck;")
	@Override
	public Class40[] method5995() {
		return this.aClass40Array4;
	}
}
