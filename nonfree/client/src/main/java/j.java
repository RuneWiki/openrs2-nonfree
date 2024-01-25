import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class j extends Class20 implements Interface9 {

	@OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!j", name = "h", descriptor = "Lclient!da;")
	private final da aDa1;

	@OriginalMember(owner = "client!j", name = "i", descriptor = "Lclient!a;")
	private final a anA2;

	@OriginalMember(owner = "client!j", name = "k", descriptor = "[Lclient!et;")
	public Class85[] aClass85Array1;

	@OriginalMember(owner = "client!j", name = "j", descriptor = "[Lclient!fd;")
	public Class90[] aClass90Array1;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!da;Lclient!a;Lclient!nj;IIII)V")
	public j(@OriginalArg(0) da arg0, @OriginalArg(1) a arg1, @OriginalArg(2) Class220 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aDa1 = arg0;
		this.anA2 = arg1;
		this.aClass85Array1 = arg2.aClass85Array5;
		this.aClass90Array1 = arg2.aClass90Array5;
		@Pc(24) int local24 = arg2.aClass85Array5 == null ? 0 : arg2.aClass85Array5.length;
		@Pc(33) int local33 = arg2.aClass90Array5 == null ? 0 : arg2.aClass90Array5.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass85Array1[local44].anInt2868;
			local42[local35++] = this.aClass85Array1[local44].anInt2870;
			local42[local35++] = this.aClass85Array1[local44].anInt2866;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass90Array1[local78].anInt2975;
		}
		@Pc(101) int local101 = arg2.aClass265Array1 == null ? 0 : arg2.aClass265Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class265 local116 = arg2.aClass265Array1[local110];
			@Pc(121) Class97 local121 = Static154.method2911(local116.anInt7256);
			local106[local108++] = local116.anInt7251;
			local106[local108++] = local121.anInt3123;
			local106[local108++] = local121.anInt3116;
			local106[local108++] = local121.anInt3120;
			local106[local108++] = local121.anInt3122;
			local106[local108++] = local121.anInt3119;
			local106[local108++] = local121.aBoolean229 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class265 local179 = arg2.aClass265Array1[local173];
			local106[local108++] = local179.anInt7253;
		}
		this.za(this.aDa1, this.anA2, arg2.anInt6195, arg2.anInt6186, arg2.anIntArray454, arg2.anIntArray456, arg2.anIntArray455, arg2.anIntArray452, arg2.aShortArray70, arg2.anInt6188, arg2.aShortArray68, arg2.aShortArray75, arg2.aShortArray77, arg2.aByteArray75, arg2.aByteArray70, arg2.aByteArray76, arg2.aByteArray74, arg2.aShortArray71, arg2.aShortArray72, arg2.anIntArray457, arg2.aByte54, arg2.aShortArray74, arg2.anInt6183, arg2.aByteArray71, arg2.aShortArray76, arg2.aShortArray73, arg2.aShortArray69, arg2.anIntArray449, arg2.anIntArray458, arg2.anIntArray459, arg2.aByteArray73, arg2.aByteArray72, arg2.anIntArray451, arg2.anIntArray450, arg2.anIntArray453, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!da;)V")
	public j(@OriginalArg(0) da arg0) {
		this.aDa1 = arg0;
		this.anA2 = null;
		this.HA(arg0);
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "()V")
	@Override
	public void method7271() {
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	@Override
	public void method7258(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aDa1.method1595().o(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!q;Lclient!po;II)V")
	@Override
	public void method7259(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class98_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aDa1.method1595().N(this, arg0, null, arg2, 1);
			return;
		}
		Static77.anIntArray138[5] = 0;
		this.aDa1.method1595().N(this, arg0, Static77.anIntArray138, arg2, 1);
		arg1.anInt7042 = Static77.anIntArray138[0];
		arg1.anInt7044 = Static77.anIntArray138[1];
		arg1.anInt7043 = Static77.anIntArray138[2];
		arg1.anInt7045 = Static77.anIntArray138[3];
		arg1.anInt7041 = Static77.anIntArray138[4];
		arg1.aBoolean491 = Static77.anIntArray138[5] != 0;
	}

	@OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static184.method3380(this);
		}
	}

	@OriginalMember(owner = "client!j", name = "E", descriptor = "(I[IIIIIZ)V")
	protected native void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!j", name = "ia", descriptor = "(I)V")
	public native void ia(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "u", descriptor = "()I")
	public native int u();

	@OriginalMember(owner = "client!j", name = "HA", descriptor = "(Lclient!da;)V")
	private native void HA(@OriginalArg(0) da arg0);

	@OriginalMember(owner = "client!j", name = "ZA", descriptor = "()I")
	public native int ZA();

	@OriginalMember(owner = "client!j", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	public native Class6_Sub2_Sub14 Z(@OriginalArg(0) Class6_Sub2_Sub14 arg0);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([ILclient!q;)V")
	private void method3806(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class54 arg1) {
		this.aDa1.method1595().JA(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!j", name = "l", descriptor = "(III)V")
	public native void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class20 method7264(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.aDa1.method1595().method6747(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "()[Lclient!et;")
	@Override
	public Class85[] method7267() {
		return this.aClass85Array1;
	}

	@OriginalMember(owner = "client!j", name = "va", descriptor = "(I)V")
	public native void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!j", name = "D", descriptor = "(I)V")
	public native void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "Q", descriptor = "()Z")
	protected native boolean Q();

	@OriginalMember(owner = "client!j", name = "I", descriptor = "(I)V")
	public native void I(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "Y", descriptor = "()V")
	protected native void Y();

	@OriginalMember(owner = "client!j", name = "m", descriptor = "(III)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!j", name = "F", descriptor = "()I")
	public native int F();

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7263(@OriginalArg(0) Class54 arg0) {
		this.method3806(Static77.anIntArray137, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass85Array1 != null) {
			for (local10 = 0; local10 < this.aClass85Array1.length; local10++) {
				@Pc(16) Class85 local16 = this.aClass85Array1[local10];
				local16.anInt2862 = Static77.anIntArray137[local5++];
				local16.anInt2874 = Static77.anIntArray137[local5++];
				local16.anInt2875 = Static77.anIntArray137[local5++];
				local16.anInt2863 = Static77.anIntArray137[local5++];
				local16.anInt2865 = Static77.anIntArray137[local5++];
				local16.anInt2873 = Static77.anIntArray137[local5++];
				local16.anInt2864 = Static77.anIntArray137[local5++];
				local16.anInt2869 = Static77.anIntArray137[local5++];
				local16.anInt2878 = Static77.anIntArray137[local5++];
			}
		}
		if (this.aClass90Array1 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass90Array1.length; local10++) {
			@Pc(87) Class90 local87 = this.aClass90Array1[local10];
			@Pc(89) Class90 local89 = local87;
			if (local87.aClass90_1 != null) {
				local89 = local87.aClass90_1;
			}
			if (local87.aClass54_5 == null) {
				local87.aClass54_5 = arg0.method7693();
			} else {
				local87.aClass54_5.la(arg0);
			}
			local89.anInt2971 = Static77.anIntArray137[local5++];
			local89.anInt2976 = Static77.anIntArray137[local5++];
			local89.anInt2974 = Static77.anIntArray137[local5++];
		}
	}

	@OriginalMember(owner = "client!j", name = "H", descriptor = "(Z)V")
	public native void H(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!j", name = "V", descriptor = "(I)V")
	public native void V(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "v", descriptor = "(I)V")
	public native void v(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "ua", descriptor = "(IIII)V")
	protected native void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!j", name = "b", descriptor = "()[Lclient!fd;")
	@Override
	public Class90[] method7261() {
		return this.aClass90Array1;
	}

	@OriginalMember(owner = "client!j", name = "K", descriptor = "()I")
	public native int K();

	@OriginalMember(owner = "client!j", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!q;Lclient!po;I)V")
	@Override
	public void method7256(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class98_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aDa1.method1595().w(this, arg0, null, arg2);
			return;
		}
		Static77.anIntArray138[5] = 0;
		this.aDa1.method1595().w(this, arg0, Static77.anIntArray138, arg2);
		arg1.anInt7042 = Static77.anIntArray138[0];
		arg1.anInt7044 = Static77.anIntArray138[1];
		arg1.anInt7043 = Static77.anIntArray138[2];
		arg1.anInt7045 = Static77.anIntArray138[3];
		arg1.anInt7041 = Static77.anIntArray138[4];
		arg1.aBoolean491 = Static77.anIntArray138[5] != 0;
	}

	@OriginalMember(owner = "client!j", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!j", name = "ka", descriptor = "(SS)V")
	public native void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!j", name = "L", descriptor = "(Lclient!j;Lclient!j;IZZ)V")
	public native void L(@OriginalArg(0) j arg0, @OriginalArg(1) j arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!j", name = "h", descriptor = "()I")
	public native int h();

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) boolean arg3) {
		return this.aDa1.method1595().a(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!j", name = "P", descriptor = "()V")
	public native void P();

	@OriginalMember(owner = "client!j", name = "DA", descriptor = "()I")
	public native int DA();

	@OriginalMember(owner = "client!j", name = "a", descriptor = "()Z")
	@Override
	public boolean method7254() {
		return true;
	}

	@OriginalMember(owner = "client!j", name = "za", descriptor = "(Lclient!da;Lclient!a;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void za(@OriginalArg(0) da arg0, @OriginalArg(1) a arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!j", name = "ha", descriptor = "()I")
	public native int ha();

	@OriginalMember(owner = "client!j", name = "AA", descriptor = "(I)V")
	public native void AA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	public native void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class59 arg2, @OriginalArg(3) Class59 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!j", name = "da", descriptor = "(I[IIIIZI[I)V")
	protected native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!j", name = "LA", descriptor = "()I")
	public native int LA();

	@OriginalMember(owner = "client!j", name = "UA", descriptor = "(SS)V")
	public native void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);
}
