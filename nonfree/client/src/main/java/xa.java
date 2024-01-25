import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xa")
public final class xa extends Class59 implements Interface8 {

	@OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!xa", name = "l", descriptor = "Lclient!w;")
	private final w aW3;

	@OriginalMember(owner = "client!xa", name = "m", descriptor = "Lclient!g;")
	private final g aG2;

	@OriginalMember(owner = "client!xa", name = "k", descriptor = "[Lclient!mf;")
	public Class155[] aClass155Array4;

	@OriginalMember(owner = "client!xa", name = "n", descriptor = "[Lclient!qe;")
	public Class199[] aClass199Array4;

	@OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lclient!w;Lclient!g;Lclient!qq;IIII)V")
	public xa(@OriginalArg(0) w arg0, @OriginalArg(1) g arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aW3 = arg0;
		this.aG2 = arg1;
		this.aClass155Array4 = arg2.aClass155Array2;
		this.aClass199Array4 = arg2.aClass199Array2;
		@Pc(24) int local24 = arg2.aClass155Array2 == null ? 0 : arg2.aClass155Array2.length;
		@Pc(33) int local33 = arg2.aClass199Array2 == null ? 0 : arg2.aClass199Array2.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass155Array4[local44].anInt3981;
			local42[local35++] = this.aClass155Array4[local44].anInt3982;
			local42[local35++] = this.aClass155Array4[local44].anInt3983;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass199Array4[local78].anInt5505;
		}
		@Pc(101) int local101 = arg2.aClass55Array1 == null ? 0 : arg2.aClass55Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class55 local116 = arg2.aClass55Array1[local110];
			@Pc(121) Class24 local121 = Static260.method3499(local116.anInt1458);
			local106[local108++] = local116.anInt1462;
			local106[local108++] = local121.anInt590;
			local106[local108++] = local121.anInt595;
			local106[local108++] = local121.anInt588;
			local106[local108++] = local121.anInt591;
			local106[local108++] = local121.anInt592;
			local106[local108++] = local121.aBoolean57 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class55 local179 = arg2.aClass55Array1[local173];
			local106[local108++] = local179.anInt1461;
		}
		this.P(this.aW3, this.aG2, arg2.anInt5609, arg2.anInt5607, arg2.anIntArray494, arg2.anIntArray489, arg2.anIntArray492, arg2.anIntArray493, arg2.aShortArray62, arg2.anInt5608, arg2.aShortArray67, arg2.aShortArray60, arg2.aShortArray61, arg2.aByteArray73, arg2.aByteArray75, arg2.aByteArray74, arg2.aByteArray72, arg2.aShortArray68, arg2.aShortArray65, arg2.anIntArray484, arg2.aByte73, arg2.aShortArray66, arg2.anInt5610, arg2.aByteArray70, arg2.aShortArray64, arg2.aShortArray69, arg2.aShortArray63, arg2.anIntArray485, arg2.anIntArray486, arg2.anIntArray488, arg2.aByteArray71, arg2.aByteArray69, arg2.anIntArray487, arg2.anIntArray490, arg2.anIntArray491, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lclient!w;)V")
	public xa(@OriginalArg(0) w arg0) {
		this.aW3 = arg0;
		this.aG2 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!xa", name = "X", descriptor = "(I)V")
	public native void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "za", descriptor = "(IIII)V")
	protected native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!xa", name = "D", descriptor = "(I)V")
	public native void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "da", descriptor = "(IILclient!ya;Lclient!ya;III)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class162 arg2, @OriginalArg(3) Class162 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!xa", name = "aa", descriptor = "(I[IIIIZI[I)V")
	protected native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lclient!c;Lclient!rr;II)V")
	@Override
	public void method5751(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class21_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aW3.method5570().LA(this, arg0, null, arg2, 1);
			return;
		}
		Static439.anIntArray624[5] = 0;
		this.aW3.method5570().LA(this, arg0, Static439.anIntArray624, arg2, 1);
		arg1.anInt5998 = Static439.anIntArray624[0];
		arg1.anInt6002 = Static439.anIntArray624[1];
		arg1.anInt6000 = Static439.anIntArray624[2];
		arg1.anInt6001 = Static439.anIntArray624[3];
		arg1.anInt5999 = Static439.anIntArray624[4];
		arg1.aBoolean436 = Static439.anIntArray624[5] != 0;
	}

	@OriginalMember(owner = "client!xa", name = "K", descriptor = "(I)V")
	public native void K(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(III)V")
	public native void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!xa", name = "P", descriptor = "(Lclient!w;Lclient!g;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void P(@OriginalArg(0) w arg0, @OriginalArg(1) g arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!xa", name = "Y", descriptor = "()I")
	public native int Y();

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!xa", name = "MA", descriptor = "()I")
	public native int MA();

	@OriginalMember(owner = "client!xa", name = "L", descriptor = "()V")
	public native void L();

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lclient!e;IIIZ)V")
	@Override
	public void method5743(@OriginalArg(0) Class59 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aW3.method5570().s(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!xa", name = "b", descriptor = "()V")
	@Override
	public void method5745() {
	}

	@OriginalMember(owner = "client!xa", name = "ta", descriptor = "()I")
	public native int ta();

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "()[Lclient!mf;")
	@Override
	public Class155[] method5742() {
		return this.aClass155Array4;
	}

	@OriginalMember(owner = "client!xa", name = "n", descriptor = "(III)V")
	public native void n(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!xa", name = "q", descriptor = "(SS)V")
	public native void q(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!xa", name = "Z", descriptor = "()I")
	public native int Z();

	@OriginalMember(owner = "client!xa", name = "pa", descriptor = "()I")
	public native int pa();

	@OriginalMember(owner = "client!xa", name = "d", descriptor = "()Z")
	@Override
	public boolean method5752() {
		return true;
	}

	@OriginalMember(owner = "client!xa", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!xa", name = "S", descriptor = "()I")
	public native int S();

	@OriginalMember(owner = "client!xa", name = "SA", descriptor = "(Lclient!xa;Lclient!xa;IZZ)V")
	public native void SA(@OriginalArg(0) xa arg0, @OriginalArg(1) xa arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!xa", name = "c", descriptor = "()[Lclient!qe;")
	@Override
	public Class199[] method5749() {
		return this.aClass199Array4;
	}

	@OriginalMember(owner = "client!xa", name = "k", descriptor = "()I")
	public native int k();

	@OriginalMember(owner = "client!xa", name = "p", descriptor = "()V")
	public native void p();

	@OriginalMember(owner = "client!xa", name = "oa", descriptor = "(Lclient!w;)V")
	private native void oa(@OriginalArg(0) w arg0);

	@OriginalMember(owner = "client!xa", name = "u", descriptor = "(SS)V")
	public native void u(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(BIZ)Lclient!e;")
	@Override
	public Class59 method5737(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.aW3.method5570().method2695(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(IILclient!c;Z)Z")
	@Override
	public boolean method5748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) boolean arg3) {
		return this.aW3.method5570().ia(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static1.method4(this);
		}
	}

	@OriginalMember(owner = "client!xa", name = "KA", descriptor = "()V")
	protected native void KA();

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lclient!c;Lclient!rr;I)V")
	@Override
	public void method5736(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class21_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aW3.method5570().MA(this, arg0, null, arg2);
			return;
		}
		Static439.anIntArray624[5] = 0;
		this.aW3.method5570().MA(this, arg0, Static439.anIntArray624, arg2);
		arg1.anInt5998 = Static439.anIntArray624[0];
		arg1.anInt6002 = Static439.anIntArray624[1];
		arg1.anInt6000 = Static439.anIntArray624[2];
		arg1.anInt6001 = Static439.anIntArray624[3];
		arg1.anInt5999 = Static439.anIntArray624[4];
		arg1.aBoolean436 = Static439.anIntArray624[5] != 0;
	}

	@OriginalMember(owner = "client!xa", name = "ma", descriptor = "(I)V")
	public native void ma(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "va", descriptor = "(I[IIIIIZ)V")
	protected native void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!xa", name = "A", descriptor = "(I)V")
	public native void A(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(ILclient!c;)V")
	public void method5753(@OriginalArg(0) int arg0, @OriginalArg(1) Class31 arg1) {
		@Pc(1) int local1 = arg0;
		@Pc(6) int local6;
		if (this.aClass155Array4 != null) {
			for (local6 = 0; local6 < this.aClass155Array4.length; local6++) {
				@Pc(12) Class155 local12 = this.aClass155Array4[local6];
				local12.anInt3985 = Static439.anIntArray622[local1++];
				local12.anInt3976 = Static439.anIntArray622[local1++];
				local12.anInt3989 = Static439.anIntArray622[local1++];
				local12.anInt3977 = Static439.anIntArray622[local1++];
				local12.anInt3980 = Static439.anIntArray622[local1++];
				local12.anInt3991 = Static439.anIntArray622[local1++];
				local12.anInt3987 = Static439.anIntArray622[local1++];
				local12.anInt3986 = Static439.anIntArray622[local1++];
				local12.anInt3978 = Static439.anIntArray622[local1++];
			}
		}
		if (this.aClass199Array4 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass199Array4.length; local6++) {
			@Pc(83) Class199 local83 = this.aClass199Array4[local6];
			@Pc(85) Class199 local85 = local83;
			if (local83.aClass199_2 != null) {
				local85 = local83.aClass199_2;
			}
			if (local83.aClass31_4 == null) {
				local83.aClass31_4 = arg1.method4797();
			} else {
				local83.aClass31_4.ha(arg1);
			}
			local85.anInt5502 = Static439.anIntArray622[local1++];
			local85.anInt5496 = Static439.anIntArray622[local1++];
			local85.anInt5497 = Static439.anIntArray622[local1++];
		}
	}

	@OriginalMember(owner = "client!xa", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "W", descriptor = "(I)V")
	public native void W(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "l", descriptor = "()I")
	public native int l();

	@OriginalMember(owner = "client!xa", name = "B", descriptor = "()I")
	public native int B();

	@OriginalMember(owner = "client!xa", name = "h", descriptor = "()Z")
	protected native boolean h();

	@OriginalMember(owner = "client!xa", name = "EA", descriptor = "(Lclient!i;)Lclient!i;")
	public native Class2_Sub5_Sub7 EA(@OriginalArg(0) Class2_Sub5_Sub7 arg0);
}
