import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class14 implements Interface4 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "Lclient!oa;")
	private final oa anOa2;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "Lclient!ya;")
	private final ya aYa1;

	@OriginalMember(owner = "client!i", name = "q", descriptor = "[Lclient!pi;")
	public Class283[] aClass283Array2;

	@OriginalMember(owner = "client!i", name = "r", descriptor = "[Lclient!gfa;")
	public Class123[] aClass123Array2;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!ida;IIII)V")
	public i(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class159 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anOa2 = arg0;
		this.aYa1 = arg1;
		this.aClass283Array2 = arg2.aClass283Array3;
		this.aClass123Array2 = arg2.aClass123Array3;
		@Pc(24) int local24 = arg2.aClass283Array3 == null ? 0 : arg2.aClass283Array3.length;
		@Pc(33) int local33 = arg2.aClass123Array3 == null ? 0 : arg2.aClass123Array3.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass283Array2[local44].anInt8258;
			local42[local35++] = this.aClass283Array2[local44].anInt8262;
			local42[local35++] = this.aClass283Array2[local44].anInt8247;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass123Array2[local78].anInt3872;
		}
		@Pc(101) int local101 = arg2.aClass161Array1 == null ? 0 : arg2.aClass161Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class161 local116 = arg2.aClass161Array1[local110];
			@Pc(121) Class250 local121 = Static346.method5998(local116.anInt4866);
			local106[local108++] = local116.anInt4867;
			local106[local108++] = local121.anInt7543;
			local106[local108++] = local121.anInt7544;
			local106[local108++] = local121.anInt7541;
			local106[local108++] = local121.anInt7542;
			local106[local108++] = local121.anInt7547;
			local106[local108++] = local121.aBoolean561 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class161 local179 = arg2.aClass161Array1[local173];
			local106[local108++] = local179.anInt4865;
		}
		this.R(this.anOa2, this.aYa1, arg2.anInt4804, arg2.anInt4817, arg2.anIntArray229, arg2.anIntArray234, arg2.anIntArray235, arg2.anIntArray226, arg2.aShortArray65, arg2.anInt4810, arg2.aShortArray68, arg2.aShortArray69, arg2.aShortArray64, arg2.aByteArray38, arg2.aByteArray43, arg2.aByteArray42, arg2.aByteArray44, arg2.aShortArray67, arg2.aShortArray66, arg2.anIntArray232, arg2.aByte75, arg2.aShortArray70, arg2.anInt4821, arg2.aByteArray40, arg2.aShortArray63, arg2.aShortArray61, arg2.aShortArray62, arg2.anIntArray231, arg2.anIntArray236, arg2.anIntArray228, arg2.aByteArray39, arg2.aByteArray41, arg2.anIntArray227, arg2.anIntArray233, arg2.anIntArray230, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;)V")
	public i(@OriginalArg(0) oa arg0) {
		this.anOa2 = arg0;
		this.aYa1 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
	public native int HA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!dm;)V")
	private void method4302(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class76 arg1) {
		this.anOa2.method6870().method12(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public native Class2_Sub1_Sub11 ba(@OriginalArg(0) Class2_Sub1_Sub11 arg0);

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()V")
	@Override
	public void method8620() {
	}

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
	public native int G();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method8631(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anOa2.method6870().method2(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
	protected native boolean NA();

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
	public native boolean r();

	@OriginalMember(owner = "client!i", name = "A", descriptor = "(JIZ)V")
	private native void A(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method8619(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.l(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
	protected native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!dm;Lclient!et;II)V")
	@Override
	public void method8623(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class15_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.anOa2.method6870().method13(this, arg0, (int[]) null, arg2, arg3);
			return;
		}
		Static416.anIntArray372[5] = 0;
		this.anOa2.method6870().method13(this, arg0, Static416.anIntArray372, arg2, arg3);
		arg1.anInt2727 = Static416.anIntArray372[0];
		arg1.anInt2728 = Static416.anIntArray372[1];
		arg1.anInt2726 = Static416.anIntArray372[2];
		arg1.anInt2725 = Static416.anIntArray372[3];
		arg1.anInt2724 = Static416.anIntArray372[4];
		arg1.aBoolean200 = Static416.anIntArray372[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
	public native void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!dm;IZ)V")
	@Override
	public void method8621(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.A(((ja) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
	public native boolean F();

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()[Lclient!pi;")
	@Override
	public Class283[] method8630() {
		return this.aClass283Array2;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!dm;ZI)Z")
	@Override
	public boolean method8624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.anOa2.method6870().method3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
	protected native void wa();

	@OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Lclient!i;Lclient!i;IZZ)V")
	public native void ZA(@OriginalArg(0) i arg0, @OriginalArg(1) i arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class18 arg2, @OriginalArg(3) Class18 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()V")
	@Override
	protected void method8639() {
		if (this.anOa2.anInt7685 > 1) {
			synchronized (this) {
				super.aBoolean722 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
	public native int ua();

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()Z")
	@Override
	public boolean method8635() {
		return true;
	}

	@OriginalMember(owner = "client!i", name = "R", descriptor = "(Lclient!oa;Lclient!ya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void R(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!dm;)V")
	@Override
	public void method8632(@OriginalArg(0) Class76 arg0) {
		this.method4302(Static416.anIntArray374, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass283Array2 != null) {
			for (local10 = 0; local10 < this.aClass283Array2.length; local10++) {
				@Pc(16) Class283 local16 = this.aClass283Array2[local10];
				local16.anInt8255 = Static416.anIntArray374[local5++];
				local16.anInt8249 = Static416.anIntArray374[local5++];
				local16.anInt8246 = Static416.anIntArray374[local5++];
				local16.anInt8245 = Static416.anIntArray374[local5++];
				local16.anInt8254 = Static416.anIntArray374[local5++];
				local16.anInt8263 = Static416.anIntArray374[local5++];
				local16.anInt8251 = Static416.anIntArray374[local5++];
				local16.anInt8257 = Static416.anIntArray374[local5++];
				local16.anInt8244 = Static416.anIntArray374[local5++];
			}
		}
		if (this.aClass123Array2 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass123Array2.length; local10++) {
			@Pc(87) Class123 local87 = this.aClass123Array2[local10];
			@Pc(89) Class123 local89 = local87;
			if (local87.aClass123_2 != null) {
				local89 = local87.aClass123_2;
			}
			if (local87.aClass76_6 == null) {
				local87.aClass76_6 = arg0.method9643();
			} else {
				local87.aClass76_6.method9629(arg0);
			}
			local89.anInt3874 = Static416.anIntArray374[local5++];
			local89.anInt3870 = Static416.anIntArray374[local5++];
			local89.anInt3869 = Static416.anIntArray374[local5++];
		}
	}

	@OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
	public native void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class14 method8622(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anOa2.method6870().method6(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!dm;ZII)Z")
	@Override
	public boolean method8625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.anOa2.method6870().method9(this, arg0, arg1, arg2, arg3, arg5);
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()[Lclient!gfa;")
	@Override
	public Class123[] method8634() {
		return this.aClass123Array2;
	}

	@OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
	public native void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!dm;Lclient!et;I)V")
	@Override
	public void method8641(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class15_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anOa2.method6870().method1(this, arg0, (int[]) null, arg2);
			return;
		}
		Static416.anIntArray372[5] = 0;
		this.anOa2.method6870().method1(this, arg0, Static416.anIntArray372, arg2);
		arg1.anInt2727 = Static416.anIntArray372[0];
		arg1.anInt2728 = Static416.anIntArray372[1];
		arg1.anInt2726 = Static416.anIntArray372[2];
		arg1.anInt2725 = Static416.anIntArray372[3];
		arg1.anInt2724 = Static416.anIntArray372[4];
		arg1.aBoolean200 = Static416.anIntArray372[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static399.method6591(this);
		}
	}

	@OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
	public native void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
	public native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()V")
	@Override
	protected void method8618() {
		if (this.anOa2.anInt7685 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean722) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean722 = true;
		}
	}

	@OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!i", name = "oa", descriptor = "(Lclient!oa;)V")
	private native void oa(@OriginalArg(0) oa arg0);
}
