import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class j extends Class2 implements Interface8 {

	@OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!j", name = "w", descriptor = "Lclient!da;")
	private final da aDa1;

	@OriginalMember(owner = "client!j", name = "t", descriptor = "Lclient!a;")
	private final a anA2;

	@OriginalMember(owner = "client!j", name = "u", descriptor = "[Lclient!fca;")
	public Class83[] aClass83Array4;

	@OriginalMember(owner = "client!j", name = "v", descriptor = "[Lclient!gl;")
	public Class109[] aClass109Array4;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!da;Lclient!a;Lclient!or;IIII)V")
	public j(@OriginalArg(0) da arg0, @OriginalArg(1) a arg1, @OriginalArg(2) Class222 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aDa1 = arg0;
		this.anA2 = arg1;
		this.aClass83Array4 = arg2.aClass83Array6;
		this.aClass109Array4 = arg2.aClass109Array6;
		@Pc(24) int local24 = arg2.aClass83Array6 == null ? 0 : arg2.aClass83Array6.length;
		@Pc(33) int local33 = arg2.aClass109Array6 == null ? 0 : arg2.aClass109Array6.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass83Array4[local44].anInt2680;
			local42[local35++] = this.aClass83Array4[local44].anInt2681;
			local42[local35++] = this.aClass83Array4[local44].anInt2687;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass109Array4[local78].anInt3776;
		}
		@Pc(101) int local101 = arg2.aClass114Array1 == null ? 0 : arg2.aClass114Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class114 local116 = arg2.aClass114Array1[local110];
			@Pc(121) Class294 local121 = Static152.method2629(local116.anInt3854);
			local106[local108++] = local116.anInt3857;
			local106[local108++] = local121.anInt8731;
			local106[local108++] = local121.anInt8725;
			local106[local108++] = local121.anInt8723;
			local106[local108++] = local121.anInt8726;
			local106[local108++] = local121.anInt8732;
			local106[local108++] = local121.aBoolean646 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class114 local179 = arg2.aClass114Array1[local173];
			local106[local108++] = local179.anInt3856;
		}
		this.za(this.aDa1, this.anA2, arg2.anInt6692, arg2.anInt6708, arg2.anIntArray578, arg2.anIntArray574, arg2.anIntArray570, arg2.anIntArray575, arg2.aShortArray152, arg2.anInt6712, arg2.aShortArray150, arg2.aShortArray155, arg2.aShortArray153, arg2.aByteArray69, arg2.aByteArray70, arg2.aByteArray67, arg2.aByteArray66, arg2.aShortArray154, arg2.aShortArray159, arg2.anIntArray577, arg2.aByte55, arg2.aShortArray158, arg2.anInt6691, arg2.aByteArray71, arg2.aShortArray157, arg2.aShortArray156, arg2.aShortArray151, arg2.anIntArray568, arg2.anIntArray569, arg2.anIntArray573, arg2.aByteArray68, arg2.aByteArray72, arg2.anIntArray571, arg2.anIntArray576, arg2.anIntArray572, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!da;)V")
	public j(@OriginalArg(0) da arg0) {
		this.aDa1 = arg0;
		this.anA2 = null;
		this.HA(arg0);
	}

	@OriginalMember(owner = "client!j", name = "ka", descriptor = "(SS)V")
	public native void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!j", name = "DA", descriptor = "()I")
	public native int DA();

	@OriginalMember(owner = "client!j", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	public native void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class52 arg2, @OriginalArg(3) Class52 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!j", name = "b", descriptor = "()V")
	@Override
	public void method5785() {
	}

	@OriginalMember(owner = "client!j", name = "ZA", descriptor = "()I")
	public native int ZA();

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method5786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) boolean arg3) {
		return this.aDa1.method1542().a(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!j", name = "l", descriptor = "(III)V")
	public native void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!j", name = "v", descriptor = "(I)V")
	public native void v(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "LA", descriptor = "()I")
	public native int LA();

	@OriginalMember(owner = "client!j", name = "F", descriptor = "()I")
	public native int F();

	@OriginalMember(owner = "client!j", name = "m", descriptor = "(III)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method5770(@OriginalArg(0) Class205 arg0) {
		this.method3952(Static74.anIntArray187, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass83Array4 != null) {
			for (local10 = 0; local10 < this.aClass83Array4.length; local10++) {
				@Pc(16) Class83 local16 = this.aClass83Array4[local10];
				local16.anInt2691 = Static74.anIntArray187[local5++];
				local16.anInt2684 = Static74.anIntArray187[local5++];
				local16.anInt2682 = Static74.anIntArray187[local5++];
				local16.anInt2686 = Static74.anIntArray187[local5++];
				local16.anInt2690 = Static74.anIntArray187[local5++];
				local16.anInt2683 = Static74.anIntArray187[local5++];
				local16.anInt2689 = Static74.anIntArray187[local5++];
				local16.anInt2676 = Static74.anIntArray187[local5++];
				local16.anInt2677 = Static74.anIntArray187[local5++];
			}
		}
		if (this.aClass109Array4 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass109Array4.length; local10++) {
			@Pc(87) Class109 local87 = this.aClass109Array4[local10];
			@Pc(89) Class109 local89 = local87;
			if (local87.aClass109_1 != null) {
				local89 = local87.aClass109_1;
			}
			if (local87.aClass205_4 == null) {
				local87.aClass205_4 = arg0.method7801();
			} else {
				local87.aClass205_4.la(arg0);
			}
			local89.anInt3778 = Static74.anIntArray187[local5++];
			local89.anInt3780 = Static74.anIntArray187[local5++];
			local89.anInt3779 = Static74.anIntArray187[local5++];
		}
	}

	@OriginalMember(owner = "client!j", name = "za", descriptor = "(Lclient!da;Lclient!a;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void za(@OriginalArg(0) da arg0, @OriginalArg(1) a arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!j", name = "h", descriptor = "()I")
	public native int h();

	@OriginalMember(owner = "client!j", name = "UA", descriptor = "(SS)V")
	public native void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!j", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!j", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	public native Class3_Sub10_Sub18 Z(@OriginalArg(0) Class3_Sub10_Sub18 arg0);

	@OriginalMember(owner = "client!j", name = "I", descriptor = "(I)V")
	public native void I(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "da", descriptor = "(I[IIIIZI[I)V")
	protected native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class2 method5775(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.aDa1.method1542().method6845(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!j", name = "D", descriptor = "(I)V")
	public native void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "ia", descriptor = "(I)V")
	public native void ia(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "d", descriptor = "()[Lclient!gl;")
	@Override
	public Class109[] method5789() {
		return this.aClass109Array4;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([ILclient!q;)V")
	private void method3952(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class205 arg1) {
		this.aDa1.method1542().JA(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!q;Lclient!sda;I)V")
	@Override
	public void method5774(@OriginalArg(0) Class205 arg0, @OriginalArg(1) Class4_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aDa1.method1542().w(this, arg0, null, arg2);
			return;
		}
		Static74.anIntArray192[5] = 0;
		this.aDa1.method1542().w(this, arg0, Static74.anIntArray192, arg2);
		arg1.anInt8049 = Static74.anIntArray192[0];
		arg1.anInt8050 = Static74.anIntArray192[1];
		arg1.anInt8047 = Static74.anIntArray192[2];
		arg1.anInt8051 = Static74.anIntArray192[3];
		arg1.anInt8048 = Static74.anIntArray192[4];
		arg1.aBoolean573 = Static74.anIntArray192[5] != 0;
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "()Z")
	@Override
	public boolean method5788() {
		return true;
	}

	@OriginalMember(owner = "client!j", name = "P", descriptor = "()V")
	public native void P();

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	@Override
	public void method5781(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aDa1.method1542().o(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!j", name = "Q", descriptor = "()Z")
	protected native boolean Q();

	@OriginalMember(owner = "client!j", name = "ha", descriptor = "()I")
	public native int ha();

	@OriginalMember(owner = "client!j", name = "L", descriptor = "(Lclient!j;Lclient!j;IZZ)V")
	public native void L(@OriginalArg(0) j arg0, @OriginalArg(1) j arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "()[Lclient!fca;")
	@Override
	public Class83[] method5778() {
		return this.aClass83Array4;
	}

	@OriginalMember(owner = "client!j", name = "u", descriptor = "()I")
	public native int u();

	@OriginalMember(owner = "client!j", name = "Y", descriptor = "()V")
	protected native void Y();

	@OriginalMember(owner = "client!j", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!j", name = "E", descriptor = "(I[IIIIIZ)V")
	protected native void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!j", name = "ua", descriptor = "(IIII)V")
	protected native void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!j", name = "V", descriptor = "(I)V")
	public native void V(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "va", descriptor = "(I)V")
	public native void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "HA", descriptor = "(Lclient!da;)V")
	private native void HA(@OriginalArg(0) da arg0);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!q;Lclient!sda;II)V")
	@Override
	public void method5772(@OriginalArg(0) Class205 arg0, @OriginalArg(1) Class4_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aDa1.method1542().N(this, arg0, null, arg2, 1);
			return;
		}
		Static74.anIntArray192[5] = 0;
		this.aDa1.method1542().N(this, arg0, Static74.anIntArray192, arg2, 1);
		arg1.anInt8049 = Static74.anIntArray192[0];
		arg1.anInt8050 = Static74.anIntArray192[1];
		arg1.anInt8047 = Static74.anIntArray192[2];
		arg1.anInt8051 = Static74.anIntArray192[3];
		arg1.anInt8048 = Static74.anIntArray192[4];
		arg1.aBoolean573 = Static74.anIntArray192[5] != 0;
	}

	@OriginalMember(owner = "client!j", name = "K", descriptor = "()I")
	public native int K();

	@OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static354.method5572(this);
		}
	}

	@OriginalMember(owner = "client!j", name = "H", descriptor = "(Z)V")
	public native void H(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!j", name = "AA", descriptor = "(I)V")
	public native void AA(@OriginalArg(0) int arg0);
}
