import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class28 implements Interface6 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!i", name = "s", descriptor = "Lclient!oa;")
	private final oa anOa2;

	@OriginalMember(owner = "client!i", name = "t", descriptor = "Lclient!ya;")
	private final ya aYa1;

	@OriginalMember(owner = "client!i", name = "r", descriptor = "[Lclient!oea;")
	public Class261[] aClass261Array4;

	@OriginalMember(owner = "client!i", name = "u", descriptor = "[Lclient!qr;")
	public Class298[] aClass298Array4;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!dc;IIII)V")
	public i(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class73 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anOa2 = arg0;
		this.aYa1 = arg1;
		this.aClass261Array4 = arg2.aClass261Array2;
		this.aClass298Array4 = arg2.aClass298Array2;
		@Pc(24) int local24 = arg2.aClass261Array2 == null ? 0 : arg2.aClass261Array2.length;
		@Pc(33) int local33 = arg2.aClass298Array2 == null ? 0 : arg2.aClass298Array2.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass261Array4[local44].anInt7121;
			local42[local35++] = this.aClass261Array4[local44].anInt7134;
			local42[local35++] = this.aClass261Array4[local44].anInt7124;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass298Array4[local78].anInt8371;
		}
		@Pc(101) int local101 = arg2.aClass151Array1 == null ? 0 : arg2.aClass151Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class151 local116 = arg2.aClass151Array1[local110];
			@Pc(121) Class354 local121 = Static248.method3941(local116.anInt3835);
			local106[local108++] = local116.anInt3833;
			local106[local108++] = local121.anInt9477;
			local106[local108++] = local121.anInt9475;
			local106[local108++] = local121.anInt9478;
			local106[local108++] = local121.anInt9474;
			local106[local108++] = local121.anInt9476;
			local106[local108++] = local121.aBoolean706 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class151 local179 = arg2.aClass151Array1[local173];
			local106[local108++] = local179.anInt3836;
		}
		this.R(this.anOa2, this.aYa1, arg2.anInt2046, arg2.anInt2038, arg2.anIntArray133, arg2.anIntArray135, arg2.anIntArray131, arg2.anIntArray138, arg2.aShortArray30, arg2.anInt2040, arg2.aShortArray27, arg2.aShortArray35, arg2.aShortArray33, arg2.aByteArray11, arg2.aByteArray13, arg2.aByteArray10, arg2.aByteArray12, arg2.aShortArray34, arg2.aShortArray29, arg2.anIntArray137, arg2.aByte27, arg2.aShortArray28, arg2.anInt2034, arg2.aByteArray14, arg2.aShortArray36, arg2.aShortArray32, arg2.aShortArray31, arg2.anIntArray129, arg2.anIntArray134, arg2.anIntArray136, arg2.aByteArray9, arg2.aByteArray15, arg2.anIntArray130, arg2.anIntArray132, arg2.anIntArray128, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;)V")
	public i(@OriginalArg(0) oa arg0) {
		this.anOa2 = arg0;
		this.aYa1 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
	protected native boolean NA();

	@OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Lclient!i;Lclient!i;IZZ)V")
	public native void ZA(@OriginalArg(0) i arg0, @OriginalArg(1) i arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
	public native void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class104 arg2, @OriginalArg(3) Class104 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method6897(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anOa2.method5926().method11(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
	public native int HA();

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
	protected native void wa();

	@OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!sk;ZII)Z")
	@Override
	public boolean method6904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class25 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.anOa2.method5926().method5(this, arg0, arg1, arg2, arg3, arg5);
	}

	@OriginalMember(owner = "client!i", name = "oa", descriptor = "(Lclient!oa;)V")
	private native void oa(@OriginalArg(0) oa arg0);

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()Z")
	@Override
	public boolean method6899() {
		return true;
	}

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!sk;ZI)Z")
	@Override
	public boolean method6887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class25 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.anOa2.method5926().method10(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!sk;IZ)V")
	@Override
	public void method6889(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.B(((ja) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()V")
	@Override
	public void method6892() {
	}

	@OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!i", name = "R", descriptor = "(Lclient!oa;Lclient!ya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void R(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
	public native int ua();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!sk;Lclient!eea;I)V")
	@Override
	public void method6908(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class23_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anOa2.method5926().method8(this, arg0, (int[]) null, arg2);
			return;
		}
		Static413.anIntArray435[5] = 0;
		this.anOa2.method5926().method8(this, arg0, Static413.anIntArray435, arg2);
		arg1.anInt2467 = Static413.anIntArray435[0];
		arg1.anInt2464 = Static413.anIntArray435[1];
		arg1.anInt2463 = Static413.anIntArray435[2];
		arg1.anInt2465 = Static413.anIntArray435[3];
		arg1.anInt2466 = Static413.anIntArray435[4];
		arg1.aBoolean206 = Static413.anIntArray435[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
	public native void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
	public native int G();

	@OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
	public native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
	public native void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method6905(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.l(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!sk;Lclient!eea;II)V")
	@Override
	public void method6894(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class23_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.anOa2.method5926().method7(this, arg0, (int[]) null, arg2, arg3);
			return;
		}
		Static413.anIntArray435[5] = 0;
		this.anOa2.method5926().method7(this, arg0, Static413.anIntArray435, arg2, arg3);
		arg1.anInt2467 = Static413.anIntArray435[0];
		arg1.anInt2464 = Static413.anIntArray435[1];
		arg1.anInt2463 = Static413.anIntArray435[2];
		arg1.anInt2465 = Static413.anIntArray435[3];
		arg1.anInt2466 = Static413.anIntArray435[4];
		arg1.aBoolean206 = Static413.anIntArray435[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()[Lclient!oea;")
	@Override
	public Class261[] method6912() {
		return this.aClass261Array4;
	}

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static20.method731(this);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!sk;)V")
	@Override
	public void method6888(@OriginalArg(0) Class25 arg0) {
		this.method3884(Static413.anIntArray437, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass261Array4 != null) {
			for (local10 = 0; local10 < this.aClass261Array4.length; local10++) {
				@Pc(16) Class261 local16 = this.aClass261Array4[local10];
				local16.anInt7118 = Static413.anIntArray437[local5++];
				local16.anInt7128 = Static413.anIntArray437[local5++];
				local16.anInt7130 = Static413.anIntArray437[local5++];
				local16.anInt7117 = Static413.anIntArray437[local5++];
				local16.anInt7123 = Static413.anIntArray437[local5++];
				local16.anInt7129 = Static413.anIntArray437[local5++];
				local16.anInt7127 = Static413.anIntArray437[local5++];
				local16.anInt7125 = Static413.anIntArray437[local5++];
				local16.anInt7135 = Static413.anIntArray437[local5++];
			}
		}
		if (this.aClass298Array4 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass298Array4.length; local10++) {
			@Pc(87) Class298 local87 = this.aClass298Array4[local10];
			@Pc(89) Class298 local89 = local87;
			if (local87.aClass298_1 != null) {
				local89 = local87.aClass298_1;
			}
			if (local87.aClass25_7 == null) {
				local87.aClass25_7 = arg0.method4292();
			} else {
				local87.aClass25_7.method4297(arg0);
			}
			local89.anInt8373 = Static413.anIntArray437[local5++];
			local89.anInt8378 = Static413.anIntArray437[local5++];
			local89.anInt8379 = Static413.anIntArray437[local5++];
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!sk;)V")
	private void method3884(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class25 arg1) {
		this.anOa2.method5926().method1(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
	@Override
	protected void method6907() {
		if (this.anOa2.anInt7003 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean619) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean619 = true;
		}
	}

	@OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
	public native void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
	protected native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "B", descriptor = "(JIZ)V")
	private native void B(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()[Lclient!qr;")
	@Override
	public Class298[] method6911() {
		return this.aClass298Array4;
	}

	@OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class28 method6900(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anOa2.method5926().method15(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public native Class3_Sub6_Sub12 ba(@OriginalArg(0) Class3_Sub6_Sub12 arg0);

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
	public native boolean r();

	@OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
	public native boolean F();

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()V")
	@Override
	protected void method6896() {
		if (this.anOa2.anInt7003 > 1) {
			synchronized (this) {
				super.aBoolean619 = false;
				this.notifyAll();
			}
		}
	}
}
