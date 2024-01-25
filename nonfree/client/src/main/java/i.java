import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class164 implements Interface3 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "Lclient!oa;")
	private final oa anOa2;

	@OriginalMember(owner = "client!i", name = "q", descriptor = "Lclient!ya;")
	private final ya aYa1;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "[Lclient!jk;")
	public Class189[] aClass189Array2;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "[Lclient!hja;")
	public Class161[] aClass161Array2;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!ju;IIII)V")
	public i(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class192 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anOa2 = arg0;
		this.aYa1 = arg1;
		this.aClass189Array2 = arg2.aClass189Array4;
		this.aClass161Array2 = arg2.aClass161Array4;
		@Pc(24) int local24 = arg2.aClass189Array4 == null ? 0 : arg2.aClass189Array4.length;
		@Pc(33) int local33 = arg2.aClass161Array4 == null ? 0 : arg2.aClass161Array4.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass189Array2[local44].anInt4891;
			local42[local35++] = this.aClass189Array2[local44].anInt4885;
			local42[local35++] = this.aClass189Array2[local44].anInt4901;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass161Array2[local78].anInt3680;
		}
		@Pc(101) int local101 = arg2.aClass106Array1 == null ? 0 : arg2.aClass106Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class106 local116 = arg2.aClass106Array1[local110];
			@Pc(121) Class251 local121 = Static107.method1556(local116.anInt2264);
			local106[local108++] = local116.anInt2265;
			local106[local108++] = local121.anInt6814;
			local106[local108++] = local121.anInt6812;
			local106[local108++] = local121.anInt6810;
			local106[local108++] = local121.anInt6808;
			local106[local108++] = local121.anInt6811;
			local106[local108++] = local121.aBoolean527 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class106 local179 = arg2.aClass106Array1[local173];
			local106[local108++] = local179.anInt2270;
		}
		this.R(this.anOa2, this.aYa1, arg2.anInt5083, arg2.anInt5075, arg2.anIntArray278, arg2.anIntArray280, arg2.anIntArray281, arg2.anIntArray276, arg2.aShortArray78, arg2.anInt5085, arg2.aShortArray72, arg2.aShortArray77, arg2.aShortArray69, arg2.aByteArray40, arg2.aByteArray42, arg2.aByteArray37, arg2.aByteArray41, arg2.aShortArray76, arg2.aShortArray74, arg2.anIntArray284, arg2.aByte74, arg2.aShortArray71, arg2.anInt5082, arg2.aByteArray43, arg2.aShortArray75, arg2.aShortArray70, arg2.aShortArray73, arg2.anIntArray279, arg2.anIntArray283, arg2.anIntArray277, arg2.aByteArray38, arg2.aByteArray39, arg2.anIntArray285, arg2.anIntArray282, arg2.anIntArray286, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;)V")
	public i(@OriginalArg(0) oa arg0) {
		this.anOa2 = arg0;
		this.aYa1 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!qq;ZI)Z")
	@Override
	public boolean method9093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class203 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.anOa2.method6108().method16(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Lclient!i;Lclient!i;IZZ)V")
	public native void ZA(@OriginalArg(0) i arg0, @OriginalArg(1) i arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method9086(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anOa2.method6108().method8(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public native Class5_Sub5_Sub4 ba(@OriginalArg(0) Class5_Sub5_Sub4 arg0);

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) Class22 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method9082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!qq;IZ)V")
	@Override
	public void method9084(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.A(((ja) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
	public native boolean F();

	@OriginalMember(owner = "client!i", name = "R", descriptor = "(Lclient!oa;Lclient!ya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void R(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
	protected native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
	public native void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!qq;ZII)Z")
	@Override
	public boolean method9069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class203 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.anOa2.method6108().method15(this, arg0, arg1, arg2, arg3, arg5);
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()V")
	@Override
	protected void method9088() {
		if (this.anOa2.anInt7102 > 1) {
			synchronized (this) {
				super.aBoolean778 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()V")
	@Override
	protected void method9079() {
		if (this.anOa2.anInt7102 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean778) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean778 = true;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!qq;)V")
	private void method3450(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class203 arg1) {
		this.anOa2.method6108().method2(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "A", descriptor = "(JIZ)V")
	private native void A(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method9076(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.l(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
	public native boolean r();

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()V")
	@Override
	public void method9091() {
	}

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static428.method6349(this);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!qq;Lclient!ng;II)V")
	@Override
	public void method9092(@OriginalArg(0) Class203 arg0, @OriginalArg(1) Class8_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.anOa2.method6108().method3(this, arg0, (int[]) null, arg2, arg3);
			return;
		}
		Static409.anIntArray419[5] = 0;
		this.anOa2.method6108().method3(this, arg0, Static409.anIntArray419, arg2, arg3);
		arg1.anInt6699 = Static409.anIntArray419[0];
		arg1.anInt6698 = Static409.anIntArray419[1];
		arg1.anInt6701 = Static409.anIntArray419[2];
		arg1.anInt6702 = Static409.anIntArray419[3];
		arg1.anInt6700 = Static409.anIntArray419[4];
		arg1.aBoolean519 = Static409.anIntArray419[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()[Lclient!jk;")
	@Override
	public Class189[] method9081() {
		return this.aClass189Array2;
	}

	@OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
	public native void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!i", name = "oa", descriptor = "(Lclient!oa;)V")
	private native void oa(@OriginalArg(0) oa arg0);

	@OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
	public native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
	public native int ua();

	@OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class164 method9072(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anOa2.method6108().method7(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!qq;Lclient!ng;I)V")
	@Override
	public void method9073(@OriginalArg(0) Class203 arg0, @OriginalArg(1) Class8_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anOa2.method6108().method10(this, arg0, (int[]) null, arg2);
			return;
		}
		Static409.anIntArray419[5] = 0;
		this.anOa2.method6108().method10(this, arg0, Static409.anIntArray419, arg2);
		arg1.anInt6699 = Static409.anIntArray419[0];
		arg1.anInt6698 = Static409.anIntArray419[1];
		arg1.anInt6701 = Static409.anIntArray419[2];
		arg1.anInt6702 = Static409.anIntArray419[3];
		arg1.anInt6700 = Static409.anIntArray419[4];
		arg1.aBoolean519 = Static409.anIntArray419[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
	protected native boolean NA();

	@OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
	public native int G();

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
	protected native void wa();

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
	public native int HA();

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()Z")
	@Override
	public boolean method9083() {
		return true;
	}

	@OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
	public native void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()[Lclient!hja;")
	@Override
	public Class161[] method9070() {
		return this.aClass161Array2;
	}

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
	public native void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!qq;)V")
	@Override
	public void method9090(@OriginalArg(0) Class203 arg0) {
		this.method3450(Static409.anIntArray422, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass189Array2 != null) {
			for (local10 = 0; local10 < this.aClass189Array2.length; local10++) {
				@Pc(16) Class189 local16 = this.aClass189Array2[local10];
				local16.anInt4894 = Static409.anIntArray422[local5++];
				local16.anInt4883 = Static409.anIntArray422[local5++];
				local16.anInt4899 = Static409.anIntArray422[local5++];
				local16.anInt4896 = Static409.anIntArray422[local5++];
				local16.anInt4900 = Static409.anIntArray422[local5++];
				local16.anInt4888 = Static409.anIntArray422[local5++];
				local16.anInt4895 = Static409.anIntArray422[local5++];
				local16.anInt4886 = Static409.anIntArray422[local5++];
				local16.anInt4898 = Static409.anIntArray422[local5++];
			}
		}
		if (this.aClass161Array2 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass161Array2.length; local10++) {
			@Pc(87) Class161 local87 = this.aClass161Array2[local10];
			@Pc(89) Class161 local89 = local87;
			if (local87.aClass161_1 != null) {
				local89 = local87.aClass161_1;
			}
			if (local87.aClass203_5 == null) {
				local87.aClass203_5 = arg0.method8323();
			} else {
				local87.aClass203_5.method8336(arg0);
			}
			local89.anInt3681 = Static409.anIntArray422[local5++];
			local89.anInt3675 = Static409.anIntArray422[local5++];
			local89.anInt3678 = Static409.anIntArray422[local5++];
		}
	}
}
