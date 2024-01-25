import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class p extends Class33 implements Interface4 {

	@OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!p", name = "k", descriptor = "Lclient!h;")
	private final h aH3;

	@OriginalMember(owner = "client!p", name = "l", descriptor = "Lclient!ba;")
	private final ba aBa2;

	@OriginalMember(owner = "client!p", name = "m", descriptor = "[Lclient!u;")
	public Class239[] aClass239Array1;

	@OriginalMember(owner = "client!p", name = "n", descriptor = "[Lclient!at;")
	public Class15[] aClass15Array1;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!h;Lclient!ba;Lclient!qc;IIII)V")
	public p(@OriginalArg(0) h arg0, @OriginalArg(1) ba arg1, @OriginalArg(2) Class199 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aH3 = arg0;
		this.aBa2 = arg1;
		this.aClass239Array1 = arg2.aClass239Array2;
		this.aClass15Array1 = arg2.aClass15Array2;
		@Pc(24) int local24 = arg2.aClass239Array2 == null ? 0 : arg2.aClass239Array2.length;
		@Pc(33) int local33 = arg2.aClass15Array2 == null ? 0 : arg2.aClass15Array2.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass239Array1[local44].anInt6502;
			local42[local35++] = this.aClass239Array1[local44].anInt6508;
			local42[local35++] = this.aClass239Array1[local44].anInt6505;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass15Array1[local78].anInt337;
		}
		@Pc(101) int local101 = arg2.aClass156Array1 == null ? 0 : arg2.aClass156Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class156 local116 = arg2.aClass156Array1[local110];
			@Pc(121) Class139 local121 = Static135.method1817(local116.anInt3993);
			local106[local108++] = local116.anInt3988;
			local106[local108++] = local121.anInt3370;
			local106[local108++] = local121.anInt3375;
			local106[local108++] = local121.anInt3374;
			local106[local108++] = local121.anInt3376;
			local106[local108++] = local121.anInt3373;
			local106[local108++] = local121.aBoolean256 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class156 local179 = arg2.aClass156Array1[local173];
			local106[local108++] = local179.anInt3989;
		}
		this.Y(this.aH3, this.aBa2, arg2.anInt5308, arg2.anInt5309, arg2.anIntArray319, arg2.anIntArray318, arg2.anIntArray313, arg2.anIntArray312, arg2.aShortArray61, arg2.anInt5299, arg2.aShortArray65, arg2.aShortArray64, arg2.aShortArray56, arg2.aByteArray57, arg2.aByteArray56, arg2.aByteArray55, arg2.aByteArray54, arg2.aShortArray57, arg2.aShortArray63, arg2.anIntArray316, arg2.aByte58, arg2.aShortArray62, arg2.anInt5304, arg2.aByteArray59, arg2.aShortArray60, arg2.aShortArray58, arg2.aShortArray59, arg2.anIntArray322, arg2.anIntArray320, arg2.anIntArray317, arg2.aByteArray53, arg2.aByteArray58, arg2.anIntArray314, arg2.anIntArray321, arg2.anIntArray315, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!h;)V")
	public p(@OriginalArg(0) h arg0) {
		this.aH3 = arg0;
		this.aBa2 = null;
		this.BA(arg0);
	}

	@OriginalMember(owner = "client!p", name = "o", descriptor = "(I)V")
	public native void o(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "d", descriptor = "()Z")
	@Override
	public boolean method5387() {
		return true;
	}

	@OriginalMember(owner = "client!p", name = "ea", descriptor = "(IILclient!na;Lclient!na;III)V")
	public native void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class163 arg2, @OriginalArg(3) Class163 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!p", name = "sa", descriptor = "()V")
	public native void sa();

	@OriginalMember(owner = "client!p", name = "N", descriptor = "(SS)V")
	public native void N(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!ia;)V")
	public void method3930(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1) {
		@Pc(1) int local1 = arg0;
		@Pc(6) int local6;
		if (this.aClass239Array1 != null) {
			for (local6 = 0; local6 < this.aClass239Array1.length; local6++) {
				@Pc(12) Class239 local12 = this.aClass239Array1[local6];
				local12.anInt6507 = Static147.anIntArray121[local1++];
				local12.anInt6503 = Static147.anIntArray121[local1++];
				local12.anInt6511 = Static147.anIntArray121[local1++];
				local12.anInt6506 = Static147.anIntArray121[local1++];
				local12.anInt6518 = Static147.anIntArray121[local1++];
				local12.anInt6519 = Static147.anIntArray121[local1++];
				local12.anInt6517 = Static147.anIntArray121[local1++];
				local12.anInt6520 = Static147.anIntArray121[local1++];
				local12.anInt6509 = Static147.anIntArray121[local1++];
			}
		}
		if (this.aClass15Array1 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass15Array1.length; local6++) {
			@Pc(83) Class15 local83 = this.aClass15Array1[local6];
			@Pc(85) Class15 local85 = local83;
			if (local83.aClass15_1 != null) {
				local85 = local83.aClass15_1;
			}
			if (local83.aClass40_1 == null) {
				local83.aClass40_1 = arg1.method4635();
			} else {
				local83.aClass40_1.ba(arg1);
			}
			local85.anInt336 = Static147.anIntArray121[local1++];
			local85.anInt340 = Static147.anIntArray121[local1++];
			local85.anInt334 = Static147.anIntArray121[local1++];
		}
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "()V")
	@Override
	public void method5397() {
	}

	@OriginalMember(owner = "client!p", name = "Y", descriptor = "(Lclient!h;Lclient!ba;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void Y(@OriginalArg(0) h arg0, @OriginalArg(1) ba arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!p", name = "ra", descriptor = "()I")
	public native int ra();

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!ia;Lclient!vk;I)V")
	@Override
	public void method5391(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class13_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aH3.method2082().fa(this, arg0, null, arg2);
			return;
		}
		Static147.anIntArray123[5] = 0;
		this.aH3.method2082().fa(this, arg0, Static147.anIntArray123, arg2);
		arg1.anInt7180 = Static147.anIntArray123[0];
		arg1.anInt7181 = Static147.anIntArray123[1];
		arg1.anInt7179 = Static147.anIntArray123[2];
		arg1.anInt7177 = Static147.anIntArray123[3];
		arg1.anInt7178 = Static147.anIntArray123[4];
		arg1.aBoolean591 = Static147.anIntArray123[5] != 0;
	}

	@OriginalMember(owner = "client!p", name = "u", descriptor = "(I)V")
	public native void u(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "WA", descriptor = "(I)V")
	public native void WA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "XA", descriptor = "(III)V")
	public native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!ia;Lclient!vk;II)V")
	@Override
	public void method5386(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class13_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aH3.method2082().d(this, arg0, null, arg2, 1);
			return;
		}
		Static147.anIntArray123[5] = 0;
		this.aH3.method2082().d(this, arg0, Static147.anIntArray123, arg2, 1);
		arg1.anInt7180 = Static147.anIntArray123[0];
		arg1.anInt7181 = Static147.anIntArray123[1];
		arg1.anInt7179 = Static147.anIntArray123[2];
		arg1.anInt7177 = Static147.anIntArray123[3];
		arg1.anInt7178 = Static147.anIntArray123[4];
		arg1.aBoolean591 = Static147.anIntArray123[5] != 0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!c;IIIZ)V")
	@Override
	public void method5384(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aH3.method2082().I(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IILclient!ia;Z)Z")
	@Override
	public boolean method5395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) boolean arg3) {
		return this.aH3.method2082().ua(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "()I")
	public native int b();

	@OriginalMember(owner = "client!p", name = "a", descriptor = "()[Lclient!u;")
	@Override
	public Class239[] method5380() {
		return this.aClass239Array1;
	}

	@OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		Static198.method2618(this);
	}

	@OriginalMember(owner = "client!p", name = "ja", descriptor = "(III)V")
	public native void ja(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!p", name = "ia", descriptor = "(I)V")
	public native void ia(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "E", descriptor = "()I")
	public native int E();

	@OriginalMember(owner = "client!p", name = "la", descriptor = "()I")
	public native int la();

	@OriginalMember(owner = "client!p", name = "xa", descriptor = "(I[IIIIIZ)V")
	protected native void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!p", name = "YA", descriptor = "(SS)V")
	public native void YA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!p", name = "ZA", descriptor = "(I)V")
	public native void ZA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "va", descriptor = "(I[IIIIZI[I)V")
	protected native void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!p", name = "oa", descriptor = "(I)V")
	public native void oa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "K", descriptor = "(IIII)V")
	protected native void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!p", name = "ua", descriptor = "(Lclient!j;)Lclient!j;")
	public native Class1_Sub3_Sub10 ua(@OriginalArg(0) Class1_Sub3_Sub10 arg0);

	@OriginalMember(owner = "client!p", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!p", name = "BA", descriptor = "(Lclient!h;)V")
	private native void BA(@OriginalArg(0) h arg0);

	@OriginalMember(owner = "client!p", name = "FA", descriptor = "()Z")
	protected native boolean FA();

	@OriginalMember(owner = "client!p", name = "VA", descriptor = "()I")
	public native int VA();

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BIZ)Lclient!c;")
	@Override
	public Class33 method5383(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.aH3.method2082().method3133(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!p", name = "Q", descriptor = "()I")
	public native int Q();

	@OriginalMember(owner = "client!p", name = "j", descriptor = "(Lclient!p;Lclient!p;IZZ)V")
	public native void j(@OriginalArg(0) p arg0, @OriginalArg(1) p arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!p", name = "n", descriptor = "()I")
	public native int n();

	@OriginalMember(owner = "client!p", name = "c", descriptor = "()[Lclient!at;")
	@Override
	public Class15[] method5385() {
		return this.aClass15Array1;
	}

	@OriginalMember(owner = "client!p", name = "X", descriptor = "()I")
	public native int X();

	@OriginalMember(owner = "client!p", name = "W", descriptor = "()V")
	protected native void W();

	@OriginalMember(owner = "client!p", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!p", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "C", descriptor = "()I")
	public native int C();
}
