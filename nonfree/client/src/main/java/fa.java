import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class fa extends Class57 implements Interface10 {

	@OriginalMember(owner = "client!fa", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "Lclient!c;")
	private final c aC2;

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "Lclient!k;")
	private final k aK2;

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "[Lclient!eh;")
	public Class61[] aClass61Array3;

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "[Lclient!tb;")
	public Class239[] aClass239Array3;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lclient!c;Lclient!k;Lclient!ch;IIII)V")
	public fa(@OriginalArg(0) c arg0, @OriginalArg(1) k arg1, @OriginalArg(2) Class37 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aC2 = arg0;
		this.aK2 = arg1;
		this.aClass61Array3 = arg2.aClass61Array1;
		this.aClass239Array3 = arg2.aClass239Array1;
		@Pc(24) int local24 = arg2.aClass61Array1 == null ? 0 : arg2.aClass61Array1.length;
		@Pc(33) int local33 = arg2.aClass239Array1 == null ? 0 : arg2.aClass239Array1.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass61Array3[local44].anInt1987;
			local42[local35++] = this.aClass61Array3[local44].anInt1985;
			local42[local35++] = this.aClass61Array3[local44].anInt1983;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass239Array3[local78].anInt6763;
		}
		@Pc(101) int local101 = arg2.aClass158Array1 == null ? 0 : arg2.aClass158Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class158 local116 = arg2.aClass158Array1[local110];
			@Pc(121) Class203 local121 = Static273.method4373(local116.anInt4732);
			local106[local108++] = local116.anInt4729;
			local106[local108++] = local121.anInt5853;
			local106[local108++] = local121.anInt5857;
			local106[local108++] = local121.anInt5856;
			local106[local108++] = local121.anInt5860;
			local106[local108++] = local121.anInt5859;
			local106[local108++] = local121.aBoolean439 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class158 local179 = arg2.aClass158Array1[local173];
			local106[local108++] = local179.anInt4733;
		}
		this.m(this.aC2, this.aK2, arg2.anInt1051, arg2.anInt1042, arg2.anIntArray69, arg2.anIntArray67, arg2.anIntArray66, arg2.anIntArray72, arg2.aShortArray2, arg2.anInt1041, arg2.aShortArray9, arg2.aShortArray4, arg2.aShortArray3, arg2.aByteArray8, arg2.aByteArray9, arg2.aByteArray12, arg2.aByteArray7, arg2.aShortArray10, arg2.aShortArray11, arg2.anIntArray71, arg2.aByte5, arg2.aShortArray8, arg2.anInt1038, arg2.aByteArray11, arg2.aShortArray7, arg2.aShortArray5, arg2.aShortArray6, arg2.anIntArray63, arg2.anIntArray73, arg2.anIntArray68, arg2.aByteArray13, arg2.aByteArray10, arg2.anIntArray64, arg2.anIntArray70, arg2.anIntArray65, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lclient!c;)V")
	public fa(@OriginalArg(0) c arg0) {
		this.aC2 = arg0;
		this.aK2 = null;
		this.va(arg0);
	}

	@OriginalMember(owner = "client!fa", name = "ja", descriptor = "()I")
	public native int ja();

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILclient!n;Z)Z")
	@Override
	public boolean method6070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) boolean arg3) {
		return this.aC2.method893().G(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!n;)V")
	public void method1962(@OriginalArg(0) int arg0, @OriginalArg(1) Class72 arg1) {
		@Pc(1) int local1 = arg0;
		@Pc(6) int local6;
		if (this.aClass61Array3 != null) {
			for (local6 = 0; local6 < this.aClass61Array3.length; local6++) {
				@Pc(12) Class61 local12 = this.aClass61Array3[local6];
				local12.anInt1976 = Static40.anIntArray56[local1++];
				local12.anInt1978 = Static40.anIntArray56[local1++];
				local12.anInt1984 = Static40.anIntArray56[local1++];
				local12.anInt1980 = Static40.anIntArray56[local1++];
				local12.anInt1981 = Static40.anIntArray56[local1++];
				local12.anInt1975 = Static40.anIntArray56[local1++];
				local12.anInt1989 = Static40.anIntArray56[local1++];
				local12.anInt1977 = Static40.anIntArray56[local1++];
				local12.anInt1982 = Static40.anIntArray56[local1++];
			}
		}
		if (this.aClass239Array3 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass239Array3.length; local6++) {
			@Pc(83) Class239 local83 = this.aClass239Array3[local6];
			@Pc(85) Class239 local85 = local83;
			if (local83.aClass239_2 != null) {
				local85 = local83.aClass239_2;
			}
			if (local83.aClass72_6 == null) {
				local83.aClass72_6 = arg1.method3307();
			} else {
				local83.aClass72_6.ya(arg1);
			}
			local85.anInt6765 = Static40.anIntArray56[local1++];
			local85.anInt6761 = Static40.anIntArray56[local1++];
			local85.anInt6758 = Static40.anIntArray56[local1++];
		}
	}

	@OriginalMember(owner = "client!fa", name = "B", descriptor = "(I)V")
	public native void B(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "(I[IIIIIZ)V")
	protected native void e(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!fa", name = "E", descriptor = "(I)V")
	public native void E(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fa", name = "wa", descriptor = "()I")
	public native int wa();

	@OriginalMember(owner = "client!fa", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!fa", name = "G", descriptor = "(SS)V")
	public native void G(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!fa", name = "K", descriptor = "()I")
	public native int K();

	@OriginalMember(owner = "client!fa", name = "IA", descriptor = "(I)V")
	public native void IA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "()Z")
	@Override
	public boolean method6078() {
		return true;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!n;Lclient!wc;I)V")
	@Override
	public void method6073(@OriginalArg(0) Class72 arg0, @OriginalArg(1) Class71_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aC2.method893().VA(this, arg0, null, arg2);
			return;
		}
		Static40.anIntArray51[5] = 0;
		this.aC2.method893().VA(this, arg0, Static40.anIntArray51, arg2);
		arg1.anInt7743 = Static40.anIntArray51[0];
		arg1.anInt7744 = Static40.anIntArray51[1];
		arg1.anInt7742 = Static40.anIntArray51[2];
		arg1.anInt7740 = Static40.anIntArray51[3];
		arg1.anInt7741 = Static40.anIntArray51[4];
		arg1.aBoolean566 = Static40.anIntArray51[5] != 0;
	}

	@OriginalMember(owner = "client!fa", name = "W", descriptor = "(I[IIIIZI[I)V")
	protected native void W(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!fa", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "()[Lclient!tb;")
	@Override
	public Class239[] method6083() {
		return this.aClass239Array3;
	}

	@OriginalMember(owner = "client!fa", name = "S", descriptor = "(I)V")
	public native void S(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!fa", name = "F", descriptor = "()I")
	public native int F();

	@OriginalMember(owner = "client!fa", name = "va", descriptor = "(Lclient!c;)V")
	private native void va(@OriginalArg(0) c arg0);

	@OriginalMember(owner = "client!fa", name = "AA", descriptor = "()Z")
	protected native boolean AA();

	@OriginalMember(owner = "client!fa", name = "H", descriptor = "()I")
	public native int H();

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "(I)V")
	public native void l(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fa", name = "la", descriptor = "(IIII)V")
	protected native void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!fa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static36.method525(this);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!n;Lclient!wc;II)V")
	@Override
	public void method6087(@OriginalArg(0) Class72 arg0, @OriginalArg(1) Class71_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aC2.method893().k(this, arg0, null, arg2, 1);
			return;
		}
		Static40.anIntArray51[5] = 0;
		this.aC2.method893().k(this, arg0, Static40.anIntArray51, arg2, 1);
		arg1.anInt7743 = Static40.anIntArray51[0];
		arg1.anInt7744 = Static40.anIntArray51[1];
		arg1.anInt7742 = Static40.anIntArray51[2];
		arg1.anInt7740 = Static40.anIntArray51[3];
		arg1.anInt7741 = Static40.anIntArray51[4];
		arg1.aBoolean566 = Static40.anIntArray51[5] != 0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class57 method6075(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.aC2.method893().method6148(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "(Lclient!c;Lclient!k;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void m(@OriginalArg(0) c arg0, @OriginalArg(1) k arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!fa", name = "Z", descriptor = "(III)V")
	public native void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method6080(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aC2.method893().K(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!fa", name = "ha", descriptor = "()V")
	protected native void ha();

	@OriginalMember(owner = "client!fa", name = "YA", descriptor = "()V")
	public native void YA();

	@OriginalMember(owner = "client!fa", name = "ia", descriptor = "()I")
	public native int ia();

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "(Lclient!fa;Lclient!fa;IZZ)V")
	public native void k(@OriginalArg(0) fa arg0, @OriginalArg(1) fa arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "()V")
	@Override
	public void method6069() {
	}

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "(SS)V")
	public native void i(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!fa", name = "J", descriptor = "()I")
	public native int J();

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "(IILclient!o;Lclient!o;III)V")
	public native void g(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) Class14 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!fa", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!fa", name = "R", descriptor = "(III)V")
	public native void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!fa", name = "D", descriptor = "()I")
	public native int D();

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "(I)V")
	public native void q(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fa", name = "Q", descriptor = "(I)V")
	public native void Q(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fa", name = "LA", descriptor = "(Lclient!ia;)Lclient!ia;")
	public native Class4_Sub1_Sub6 LA(@OriginalArg(0) Class4_Sub1_Sub6 arg0);

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "()[Lclient!eh;")
	@Override
	public Class61[] method6076() {
		return this.aClass61Array3;
	}
}
