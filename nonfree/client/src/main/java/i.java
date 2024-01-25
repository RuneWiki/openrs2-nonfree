import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class25 implements Interface8 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!i", name = "j", descriptor = "Lclient!oa;")
	private final oa anOa2;

	@OriginalMember(owner = "client!i", name = "m", descriptor = "Lclient!ya;")
	private final ya aYa1;

	@OriginalMember(owner = "client!i", name = "k", descriptor = "[Lclient!gi;")
	public Class130[] aClass130Array3;

	@OriginalMember(owner = "client!i", name = "l", descriptor = "[Lclient!uga;")
	public Class337[] aClass337Array3;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!ww;IIII)V")
	public i(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class379 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anOa2 = arg0;
		this.aYa1 = arg1;
		this.aClass130Array3 = arg2.aClass130Array5;
		this.aClass337Array3 = arg2.aClass337Array5;
		@Pc(24) int local24 = arg2.aClass130Array5 == null ? 0 : arg2.aClass130Array5.length;
		@Pc(33) int local33 = arg2.aClass337Array5 == null ? 0 : arg2.aClass337Array5.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass130Array3[local44].anInt4011;
			local42[local35++] = this.aClass130Array3[local44].anInt4017;
			local42[local35++] = this.aClass130Array3[local44].anInt4029;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass337Array3[local78].anInt9398;
		}
		@Pc(101) int local101 = arg2.aClass259Array1 == null ? 0 : arg2.aClass259Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class259 local116 = arg2.aClass259Array1[local110];
			@Pc(121) Class291 local121 = Static283.method4472(local116.anInt7712);
			local106[local108++] = local116.anInt7713;
			local106[local108++] = local121.anInt8273;
			local106[local108++] = local121.anInt8269;
			local106[local108++] = local121.anInt8275;
			local106[local108++] = local121.anInt8278;
			local106[local108++] = local121.anInt8276;
			local106[local108++] = local121.aBoolean617 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class259 local179 = arg2.aClass259Array1[local173];
			local106[local108++] = local179.anInt7711;
		}
		this.R(this.anOa2, this.aYa1, arg2.anInt10288, arg2.anInt10276, arg2.anIntArray743, arg2.anIntArray752, arg2.anIntArray751, arg2.anIntArray753, arg2.aShortArray159, arg2.anInt10272, arg2.aShortArray158, arg2.aShortArray152, arg2.aShortArray161, arg2.aByteArray103, arg2.aByteArray105, arg2.aByteArray104, arg2.aByteArray106, arg2.aShortArray154, arg2.aShortArray153, arg2.anIntArray754, arg2.aByte129, arg2.aShortArray155, arg2.anInt10279, arg2.aByteArray107, arg2.aShortArray160, arg2.aShortArray157, arg2.aShortArray156, arg2.anIntArray747, arg2.anIntArray749, arg2.anIntArray745, arg2.aByteArray101, arg2.aByteArray102, arg2.anIntArray748, arg2.anIntArray744, arg2.anIntArray746, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;)V")
	public i(@OriginalArg(0) oa arg0) {
		this.anOa2 = arg0;
		this.aYa1 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
	public native void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7714(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.l(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
	public native int HA();

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()V")
	@Override
	protected void method7718() {
		if (this.anOa2.anInt7046 > 1) {
			synchronized (this) {
				super.aBoolean674 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "B", descriptor = "(JIZ)V")
	private native void B(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "oa", descriptor = "(Lclient!oa;)V")
	private native void oa(@OriginalArg(0) oa arg0);

	@OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Lclient!i;Lclient!i;IZZ)V")
	public native void ZA(@OriginalArg(0) i arg0, @OriginalArg(1) i arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!kd;ZII)Z")
	@Override
	public boolean method7730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.anOa2.method5964().method1(this, arg0, arg1, arg2, arg3, arg5);
	}

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!kd;IZ)V")
	@Override
	public void method7734(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.B(((ja) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
	public native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class25 method7732(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anOa2.method5964().method2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
	@Override
	public void method7727() {
	}

	@OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
	public native boolean r();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!kd;Lclient!ig;I)V")
	@Override
	public void method7735(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class11_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anOa2.method5964().method14(this, arg0, null, arg2);
			return;
		}
		Static393.anIntArray475[5] = 0;
		this.anOa2.method5964().method14(this, arg0, Static393.anIntArray475, arg2);
		arg1.anInt4698 = Static393.anIntArray475[0];
		arg1.anInt4696 = Static393.anIntArray475[1];
		arg1.anInt4699 = Static393.anIntArray475[2];
		arg1.anInt4697 = Static393.anIntArray475[3];
		arg1.anInt4700 = Static393.anIntArray475[4];
		arg1.aBoolean391 = Static393.anIntArray475[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class112 arg2, @OriginalArg(3) Class112 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
	protected native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
	public native boolean F();

	@OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()[Lclient!gi;")
	@Override
	public Class130[] method7731() {
		return this.aClass130Array3;
	}

	@OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()[Lclient!uga;")
	@Override
	public Class337[] method7724() {
		return this.aClass337Array3;
	}

	@OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
	public native void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!kd;)V")
	private void method3839(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class6 arg1) {
		this.anOa2.method5964().method13(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public native Class2_Sub5_Sub12 ba(@OriginalArg(0) Class2_Sub5_Sub12 arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()Z")
	@Override
	public boolean method7713() {
		return true;
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()V")
	@Override
	protected void method7729() {
		if (this.anOa2.anInt7046 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean674) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean674 = true;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!kd;Lclient!ig;II)V")
	@Override
	public void method7725(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class11_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.anOa2.method5964().method16(this, arg0, null, arg2, arg3);
			return;
		}
		Static393.anIntArray475[5] = 0;
		this.anOa2.method5964().method16(this, arg0, Static393.anIntArray475, arg2, arg3);
		arg1.anInt4698 = Static393.anIntArray475[0];
		arg1.anInt4696 = Static393.anIntArray475[1];
		arg1.anInt4699 = Static393.anIntArray475[2];
		arg1.anInt4697 = Static393.anIntArray475[3];
		arg1.anInt4700 = Static393.anIntArray475[4];
		arg1.aBoolean391 = Static393.anIntArray475[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
	public native void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method7726(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anOa2.method5964().method10(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!kd;ZI)Z")
	@Override
	public boolean method7721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.anOa2.method5964().method8(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
	protected native void wa();

	@OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!kd;)V")
	@Override
	public void method7723(@OriginalArg(0) Class6 arg0) {
		this.method3839(Static393.anIntArray480, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass130Array3 != null) {
			for (local10 = 0; local10 < this.aClass130Array3.length; local10++) {
				@Pc(16) Class130 local16 = this.aClass130Array3[local10];
				local16.anInt4019 = Static393.anIntArray480[local5++];
				local16.anInt4023 = Static393.anIntArray480[local5++];
				local16.anInt4018 = Static393.anIntArray480[local5++];
				local16.anInt4012 = Static393.anIntArray480[local5++];
				local16.anInt4025 = Static393.anIntArray480[local5++];
				local16.anInt4024 = Static393.anIntArray480[local5++];
				local16.anInt4028 = Static393.anIntArray480[local5++];
				local16.anInt4014 = Static393.anIntArray480[local5++];
				local16.anInt4016 = Static393.anIntArray480[local5++];
			}
		}
		if (this.aClass337Array3 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass337Array3.length; local10++) {
			@Pc(87) Class337 local87 = this.aClass337Array3[local10];
			@Pc(89) Class337 local89 = local87;
			if (local87.aClass337_2 != null) {
				local89 = local87.aClass337_2;
			}
			if (local87.aClass6_35 == null) {
				local87.aClass6_35 = arg0.method6709();
			} else {
				local87.aClass6_35.method6695(arg0);
			}
			local89.anInt9397 = Static393.anIntArray480[local5++];
			local89.anInt9394 = Static393.anIntArray480[local5++];
			local89.anInt9393 = Static393.anIntArray480[local5++];
		}
	}

	@OriginalMember(owner = "client!i", name = "R", descriptor = "(Lclient!oa;Lclient!ya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void R(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static46.method930(this);
		}
	}

	@OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
	protected native boolean NA();

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
	public native void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
	public native int ua();

	@OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
	public native int G();

	@OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);
}
