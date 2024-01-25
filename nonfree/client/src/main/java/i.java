import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class83 implements Interface3 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "Lclient!oa;")
	private final oa anOa2;

	@OriginalMember(owner = "client!i", name = "l", descriptor = "Lclient!ya;")
	private final ya aYa1;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "[Lclient!nda;")
	public Class219[] aClass219Array2;

	@OriginalMember(owner = "client!i", name = "m", descriptor = "[Lclient!oia;")
	public Class238[] aClass238Array2;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!uk;IIII)V")
	public i(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class344 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anOa2 = arg0;
		this.aYa1 = arg1;
		this.aClass219Array2 = arg2.aClass219Array5;
		this.aClass238Array2 = arg2.aClass238Array5;
		@Pc(24) int local24 = arg2.aClass219Array5 == null ? 0 : arg2.aClass219Array5.length;
		@Pc(33) int local33 = arg2.aClass238Array5 == null ? 0 : arg2.aClass238Array5.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass219Array2[local44].anInt6898;
			local42[local35++] = this.aClass219Array2[local44].anInt6899;
			local42[local35++] = this.aClass219Array2[local44].anInt6906;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass238Array2[local78].anInt7661;
		}
		@Pc(101) int local101 = arg2.aClass156Array1 == null ? 0 : arg2.aClass156Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class156 local116 = arg2.aClass156Array1[local110];
			@Pc(121) Class101 local121 = Static635.method8514(local116.anInt5528);
			local106[local108++] = local116.anInt5531;
			local106[local108++] = local121.anInt3711;
			local106[local108++] = local121.anInt3715;
			local106[local108++] = local121.anInt3716;
			local106[local108++] = local121.anInt3718;
			local106[local108++] = local121.anInt3717;
			local106[local108++] = local121.aBoolean274 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class156 local179 = arg2.aClass156Array1[local173];
			local106[local108++] = local179.anInt5524;
		}
		this.R(this.anOa2, this.aYa1, arg2.anInt9920, arg2.anInt9923, arg2.anIntArray576, arg2.anIntArray570, arg2.anIntArray573, arg2.anIntArray567, arg2.aShortArray136, arg2.anInt9930, arg2.aShortArray131, arg2.aShortArray128, arg2.aShortArray134, arg2.aByteArray100, arg2.aByteArray98, arg2.aByteArray96, arg2.aByteArray95, arg2.aShortArray132, arg2.aShortArray135, arg2.anIntArray569, arg2.aByte113, arg2.aShortArray133, arg2.anInt9910, arg2.aByteArray101, arg2.aShortArray127, arg2.aShortArray129, arg2.aShortArray130, arg2.anIntArray574, arg2.anIntArray572, arg2.anIntArray577, arg2.aByteArray99, arg2.aByteArray97, arg2.anIntArray568, arg2.anIntArray575, arg2.anIntArray571, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;)V")
	public i(@OriginalArg(0) oa arg0) {
		this.anOa2 = arg0;
		this.aYa1 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()[Lclient!oia;")
	@Override
	public Class238[] method8005() {
		return this.aClass238Array2;
	}

	@OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
	public native void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!dfa;Lclient!im;II)V")
	@Override
	public void method8009(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class15_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.anOa2.method6139().method4(this, arg0, null, arg2, arg3);
			return;
		}
		Static381.anIntArray406[5] = 0;
		this.anOa2.method6139().method4(this, arg0, Static381.anIntArray406, arg2, arg3);
		arg1.anInt5263 = Static381.anIntArray406[0];
		arg1.anInt5265 = Static381.anIntArray406[1];
		arg1.anInt5262 = Static381.anIntArray406[2];
		arg1.anInt5266 = Static381.anIntArray406[3];
		arg1.anInt5264 = Static381.anIntArray406[4];
		arg1.aBoolean394 = Static381.anIntArray406[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()V")
	@Override
	protected void method8000() {
		if (this.anOa2.anInt7434 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean702) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean702 = true;
		}
	}

	@OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!dfa;ZII)Z")
	@Override
	public boolean method7994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.anOa2.method6139().method7(this, arg0, arg1, arg2, arg3, arg5);
	}

	@OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
	public native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public native Class8_Sub5_Sub11 ba(@OriginalArg(0) Class8_Sub5_Sub11 arg0);

	@OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
	public native void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
	public native boolean F();

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()V")
	@Override
	protected void method8011() {
		if (this.anOa2.anInt7434 > 1) {
			synchronized (this) {
				super.aBoolean702 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()Z")
	@Override
	public boolean method8012() {
		return true;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!dfa;)V")
	private void method4112(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class54 arg1) {
		this.anOa2.method6139().method15(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
	public native boolean r();

	@OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
	public native void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method8014(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.l(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
	protected native boolean NA();

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!dfa;IZ)V")
	@Override
	public void method7996(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.J(((ja) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()[Lclient!nda;")
	@Override
	public Class219[] method8010() {
		return this.aClass219Array2;
	}

	@OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
	public native int ua();

	@OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
	public native void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "J", descriptor = "(JIZ)V")
	private native void J(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static606.method8287(this);
		}
	}

	@OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Lclient!i;Lclient!i;IZZ)V")
	public native void ZA(@OriginalArg(0) i arg0, @OriginalArg(1) i arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
	protected native void wa();

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) Class86 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!dfa;)V")
	@Override
	public void method7999(@OriginalArg(0) Class54 arg0) {
		this.method4112(Static381.anIntArray405, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass219Array2 != null) {
			for (local10 = 0; local10 < this.aClass219Array2.length; local10++) {
				@Pc(16) Class219 local16 = this.aClass219Array2[local10];
				local16.anInt6908 = Static381.anIntArray405[local5++];
				local16.anInt6902 = Static381.anIntArray405[local5++];
				local16.anInt6900 = Static381.anIntArray405[local5++];
				local16.anInt6913 = Static381.anIntArray405[local5++];
				local16.anInt6911 = Static381.anIntArray405[local5++];
				local16.anInt6916 = Static381.anIntArray405[local5++];
				local16.anInt6904 = Static381.anIntArray405[local5++];
				local16.anInt6903 = Static381.anIntArray405[local5++];
				local16.anInt6905 = Static381.anIntArray405[local5++];
			}
		}
		if (this.aClass238Array2 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass238Array2.length; local10++) {
			@Pc(87) Class238 local87 = this.aClass238Array2[local10];
			@Pc(89) Class238 local89 = local87;
			if (local87.aClass238_1 != null) {
				local89 = local87.aClass238_1;
			}
			if (local87.aClass54_8 == null) {
				local87.aClass54_8 = arg0.method5133();
			} else {
				local87.aClass54_8.method5137(arg0);
			}
			local89.anInt7656 = Static381.anIntArray405[local5++];
			local89.anInt7662 = Static381.anIntArray405[local5++];
			local89.anInt7657 = Static381.anIntArray405[local5++];
		}
	}

	@OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()V")
	@Override
	public void method8002() {
	}

	@OriginalMember(owner = "client!i", name = "R", descriptor = "(Lclient!oa;Lclient!ya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void R(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!dfa;ZI)Z")
	@Override
	public boolean method8007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.anOa2.method6139().method13(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!dfa;Lclient!im;I)V")
	@Override
	public void method8003(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class15_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anOa2.method6139().method6(this, arg0, null, arg2);
			return;
		}
		Static381.anIntArray406[5] = 0;
		this.anOa2.method6139().method6(this, arg0, Static381.anIntArray406, arg2);
		arg1.anInt5263 = Static381.anIntArray406[0];
		arg1.anInt5265 = Static381.anIntArray406[1];
		arg1.anInt5262 = Static381.anIntArray406[2];
		arg1.anInt5266 = Static381.anIntArray406[3];
		arg1.anInt5264 = Static381.anIntArray406[4];
		arg1.aBoolean394 = Static381.anIntArray406[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "oa", descriptor = "(Lclient!oa;)V")
	private native void oa(@OriginalArg(0) oa arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method7995(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anOa2.method6139().method16(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
	public native int G();

	@OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
	protected native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class83 method7993(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anOa2.method6139().method2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
	public native int HA();
}
