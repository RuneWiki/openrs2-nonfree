import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class149 implements Interface5 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "Lclient!oa;")
	private final oa anOa2;

	@OriginalMember(owner = "client!i", name = "r", descriptor = "Lclient!ya;")
	private final ya aYa1;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "[Lclient!vja;")
	public Class373[] aClass373Array3;

	@OriginalMember(owner = "client!i", name = "q", descriptor = "[Lclient!rea;")
	public Class305[] aClass305Array3;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!gl;IIII)V")
	public i(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anOa2 = arg0;
		this.aYa1 = arg1;
		this.aClass373Array3 = arg2.aClass373Array1;
		this.aClass305Array3 = arg2.aClass305Array1;
		@Pc(24) int local24 = arg2.aClass373Array1 == null ? 0 : arg2.aClass373Array1.length;
		@Pc(33) int local33 = arg2.aClass305Array1 == null ? 0 : arg2.aClass305Array1.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass373Array3[local44].anInt10557;
			local42[local35++] = this.aClass373Array3[local44].anInt10559;
			local42[local35++] = this.aClass373Array3[local44].anInt10548;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass305Array3[local78].anInt8121;
		}
		@Pc(101) int local101 = arg2.aClass145Array1 == null ? 0 : arg2.aClass145Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class145 local116 = arg2.aClass145Array1[local110];
			@Pc(121) Class258 local121 = Static538.method6887(local116.anInt3835);
			local106[local108++] = local116.anInt3834;
			local106[local108++] = local121.anInt6712;
			local106[local108++] = local121.anInt6711;
			local106[local108++] = local121.anInt6708;
			local106[local108++] = local121.anInt6713;
			local106[local108++] = local121.anInt6709;
			local106[local108++] = local121.aBoolean472 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class145 local179 = arg2.aClass145Array1[local173];
			local106[local108++] = local179.anInt3837;
		}
		this.R(this.anOa2, this.aYa1, arg2.anInt3575, arg2.anInt3583, arg2.anIntArray197, arg2.anIntArray192, arg2.anIntArray196, arg2.anIntArray194, arg2.aShortArray44, arg2.anInt3576, arg2.aShortArray42, arg2.aShortArray35, arg2.aShortArray37, arg2.aByteArray26, arg2.aByteArray30, arg2.aByteArray29, arg2.aByteArray28, arg2.aShortArray38, arg2.aShortArray43, arg2.anIntArray198, arg2.aByte58, arg2.aShortArray41, arg2.anInt3587, arg2.aByteArray25, arg2.aShortArray36, arg2.aShortArray40, arg2.aShortArray39, arg2.anIntArray190, arg2.anIntArray193, arg2.anIntArray189, arg2.aByteArray27, arg2.aByteArray31, arg2.anIntArray195, arg2.anIntArray191, arg2.anIntArray199, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;)V")
	public i(@OriginalArg(0) oa arg0) {
		this.anOa2 = arg0;
		this.aYa1 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
	public native void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!al;ZII)Z")
	@Override
	public boolean method8862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.anOa2.method5757().method1(this, arg0, arg1, arg2, arg3, arg5);
	}

	@OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
	public native int HA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method8871(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.l(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!al;ZI)Z")
	@Override
	public boolean method8866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.anOa2.method5757().method14(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "oa", descriptor = "(Lclient!oa;)V")
	private native void oa(@OriginalArg(0) oa arg0);

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Lclient!i;Lclient!i;IZZ)V")
	public native void ZA(@OriginalArg(0) i arg0, @OriginalArg(1) i arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
	protected native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!al;Lclient!ju;I)V")
	@Override
	public void method8857(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class34_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anOa2.method5757().method4(this, arg0, (int[]) null, arg2);
			return;
		}
		Static418.anIntArray357[5] = 0;
		this.anOa2.method5757().method4(this, arg0, Static418.anIntArray357, arg2);
		arg1.anInt4989 = Static418.anIntArray357[0];
		arg1.anInt4988 = Static418.anIntArray357[1];
		arg1.anInt4990 = Static418.anIntArray357[2];
		arg1.anInt4991 = Static418.anIntArray357[3];
		arg1.anInt4992 = Static418.anIntArray357[4];
		arg1.aBoolean332 = Static418.anIntArray357[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()Z")
	@Override
	public boolean method8846() {
		return true;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!al;)V")
	private void method3619(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class17 arg1) {
		this.anOa2.method5757().method8(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!al;Lclient!ju;II)V")
	@Override
	public void method8869(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class34_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.anOa2.method5757().method11(this, arg0, (int[]) null, arg2, arg3);
			return;
		}
		Static418.anIntArray357[5] = 0;
		this.anOa2.method5757().method11(this, arg0, Static418.anIntArray357, arg2, arg3);
		arg1.anInt4989 = Static418.anIntArray357[0];
		arg1.anInt4988 = Static418.anIntArray357[1];
		arg1.anInt4990 = Static418.anIntArray357[2];
		arg1.anInt4991 = Static418.anIntArray357[3];
		arg1.anInt4992 = Static418.anIntArray357[4];
		arg1.aBoolean332 = Static418.anIntArray357[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!al;)V")
	@Override
	public void method8848(@OriginalArg(0) Class17 arg0) {
		this.method3619(Static418.anIntArray358, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass373Array3 != null) {
			for (local10 = 0; local10 < this.aClass373Array3.length; local10++) {
				@Pc(16) Class373 local16 = this.aClass373Array3[local10];
				local16.anInt10560 = Static418.anIntArray358[local5++];
				local16.anInt10545 = Static418.anIntArray358[local5++];
				local16.anInt10547 = Static418.anIntArray358[local5++];
				local16.anInt10551 = Static418.anIntArray358[local5++];
				local16.anInt10561 = Static418.anIntArray358[local5++];
				local16.anInt10550 = Static418.anIntArray358[local5++];
				local16.anInt10563 = Static418.anIntArray358[local5++];
				local16.anInt10554 = Static418.anIntArray358[local5++];
				local16.anInt10546 = Static418.anIntArray358[local5++];
			}
		}
		if (this.aClass305Array3 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass305Array3.length; local10++) {
			@Pc(87) Class305 local87 = this.aClass305Array3[local10];
			@Pc(89) Class305 local89 = local87;
			if (local87.aClass305_1 != null) {
				local89 = local87.aClass305_1;
			}
			if (local87.aClass17_7 == null) {
				local87.aClass17_7 = arg0.method6230();
			} else {
				local87.aClass17_7.method6233(arg0);
			}
			local89.anInt8120 = Static418.anIntArray358[local5++];
			local89.anInt8115 = Static418.anIntArray358[local5++];
			local89.anInt8114 = Static418.anIntArray358[local5++];
		}
	}

	@OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
	public native int ua();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!al;IZ)V")
	@Override
	public void method8852(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.B(((ja) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()[Lclient!vja;")
	@Override
	public Class373[] method8867() {
		return this.aClass373Array3;
	}

	@OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
	protected native void wa();

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()V")
	@Override
	protected void method8849() {
		if (this.anOa2.anInt6786 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean740) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean740 = true;
		}
	}

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class149 method8858(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anOa2.method5757().method12(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
	public native boolean F();

	@OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
	public native int G();

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()V")
	@Override
	public void method8870() {
	}

	@OriginalMember(owner = "client!i", name = "R", descriptor = "(Lclient!oa;Lclient!ya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void R(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!i", name = "B", descriptor = "(JIZ)V")
	private native void B(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
	public native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) Class35 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()[Lclient!rea;")
	@Override
	public Class305[] method8861() {
		return this.aClass305Array3;
	}

	@OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
	public native boolean r();

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()V")
	@Override
	protected void method8859() {
		if (this.anOa2.anInt6786 > 1) {
			synchronized (this) {
				super.aBoolean740 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method8847(@OriginalArg(0) Class149 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anOa2.method5757().method7(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static496.method6512(this);
		}
	}

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public native Class3_Sub5_Sub11 ba(@OriginalArg(0) Class3_Sub5_Sub11 arg0);

	@OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
	public native void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
	protected native boolean NA();

	@OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
	public native void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
	public native void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);
}
