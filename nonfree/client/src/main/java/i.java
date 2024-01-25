import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class92 implements Interface10 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "Lclient!oa;")
	private final oa anOa2;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "Lclient!ya;")
	private final ya aYa1;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "[Lclient!fk;")
	public Class103[] aClass103Array2;

	@OriginalMember(owner = "client!i", name = "q", descriptor = "[Lclient!cia;")
	public Class49[] aClass49Array2;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!lv;IIII)V")
	public i(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class192 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anOa2 = arg0;
		this.aYa1 = arg1;
		this.aClass103Array2 = arg2.aClass103Array4;
		this.aClass49Array2 = arg2.aClass49Array4;
		@Pc(24) int local24 = arg2.aClass103Array4 == null ? 0 : arg2.aClass103Array4.length;
		@Pc(33) int local33 = arg2.aClass49Array4 == null ? 0 : arg2.aClass49Array4.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass103Array2[local44].anInt3652;
			local42[local35++] = this.aClass103Array2[local44].anInt3647;
			local42[local35++] = this.aClass103Array2[local44].anInt3660;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass49Array2[local78].anInt2379;
		}
		@Pc(101) int local101 = arg2.aClass123Array1 == null ? 0 : arg2.aClass123Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class123 local116 = arg2.aClass123Array1[local110];
			@Pc(121) Class191 local121 = Static129.method2652(local116.anInt4149);
			local106[local108++] = local116.anInt4150;
			local106[local108++] = local121.anInt6625;
			local106[local108++] = local121.anInt6628;
			local106[local108++] = local121.anInt6623;
			local106[local108++] = local121.anInt6631;
			local106[local108++] = local121.anInt6627;
			local106[local108++] = local121.aBoolean521 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class123 local179 = arg2.aClass123Array1[local173];
			local106[local108++] = local179.anInt4153;
		}
		this.R(this.anOa2, this.aYa1, arg2.anInt6644, arg2.anInt6641, arg2.anIntArray317, arg2.anIntArray314, arg2.anIntArray319, arg2.anIntArray318, arg2.aShortArray107, arg2.anInt6635, arg2.aShortArray104, arg2.aShortArray109, arg2.aShortArray103, arg2.aByteArray52, arg2.aByteArray50, arg2.aByteArray51, arg2.aByteArray53, arg2.aShortArray110, arg2.aShortArray108, arg2.anIntArray312, arg2.aByte78, arg2.aShortArray105, arg2.anInt6637, arg2.aByteArray48, arg2.aShortArray106, arg2.aShortArray111, arg2.aShortArray102, arg2.anIntArray310, arg2.anIntArray315, arg2.anIntArray311, arg2.aByteArray54, arg2.aByteArray49, arg2.anIntArray316, arg2.anIntArray313, arg2.anIntArray309, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;)V")
	public i(@OriginalArg(0) oa arg0) {
		this.anOa2 = arg0;
		this.aYa1 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
	public native void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!hba;ZII)Z")
	@Override
	public boolean method7061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class115 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.anOa2.method6192().method13(this, arg0, arg1, arg2, arg3, arg5);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!hba;)V")
	private void method4181(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class115 arg1) {
		this.anOa2.method6192().method9(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Lclient!i;Lclient!i;IZZ)V")
	public native void ZA(@OriginalArg(0) i arg0, @OriginalArg(1) i arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "oa", descriptor = "(Lclient!oa;)V")
	private native void oa(@OriginalArg(0) oa arg0);

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()[Lclient!cia;")
	@Override
	public Class49[] method7050() {
		return this.aClass49Array2;
	}

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
	public native boolean r();

	@OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!hba;ZI)Z")
	@Override
	public boolean method7067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class115 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.anOa2.method6192().method16(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
	public native void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!hba;IZ)V")
	@Override
	public void method7059(@OriginalArg(0) Class115 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.A(((ja) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
	public native int G();

	@OriginalMember(owner = "client!i", name = "A", descriptor = "(JIZ)V")
	private native void A(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
	public native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class245 arg2, @OriginalArg(3) Class245 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public native Class6_Sub5_Sub10 ba(@OriginalArg(0) Class6_Sub5_Sub10 arg0);

	@OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
	public native void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!hba;)V")
	@Override
	public void method7071(@OriginalArg(0) Class115 arg0) {
		this.method4181(Static390.anIntArray357, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass103Array2 != null) {
			for (local10 = 0; local10 < this.aClass103Array2.length; local10++) {
				@Pc(16) Class103 local16 = this.aClass103Array2[local10];
				local16.anInt3656 = Static390.anIntArray357[local5++];
				local16.anInt3653 = Static390.anIntArray357[local5++];
				local16.anInt3657 = Static390.anIntArray357[local5++];
				local16.anInt3649 = Static390.anIntArray357[local5++];
				local16.anInt3650 = Static390.anIntArray357[local5++];
				local16.anInt3643 = Static390.anIntArray357[local5++];
				local16.anInt3645 = Static390.anIntArray357[local5++];
				local16.anInt3655 = Static390.anIntArray357[local5++];
				local16.anInt3648 = Static390.anIntArray357[local5++];
			}
		}
		if (this.aClass49Array2 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass49Array2.length; local10++) {
			@Pc(87) Class49 local87 = this.aClass49Array2[local10];
			@Pc(89) Class49 local89 = local87;
			if (local87.aClass49_1 != null) {
				local89 = local87.aClass49_1;
			}
			if (local87.aClass115_1 == null) {
				local87.aClass115_1 = arg0.method6292();
			} else {
				local87.aClass115_1.method6282(arg0);
			}
			local89.anInt2384 = Static390.anIntArray357[local5++];
			local89.anInt2381 = Static390.anIntArray357[local5++];
			local89.anInt2388 = Static390.anIntArray357[local5++];
		}
	}

	@OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()[Lclient!fk;")
	@Override
	public Class103[] method7048() {
		return this.aClass103Array2;
	}

	@OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
	public native boolean F();

	@OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
	protected native boolean NA();

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
	protected native void wa();

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!i", name = "g", descriptor = "()V")
	@Override
	protected void method7070() {
		if (this.anOa2.anInt7321 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean673) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean673 = true;
		}
	}

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
	public native int ua();

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()Z")
	@Override
	public boolean method7052() {
		return true;
	}

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static355.method5751(this);
		}
	}

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
	public native void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!hba;Lclient!lda;I)V")
	@Override
	public void method7053(@OriginalArg(0) Class115 arg0, @OriginalArg(1) Class9_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anOa2.method6192().method15(this, arg0, (int[]) null, arg2);
			return;
		}
		Static390.anIntArray359[5] = 0;
		this.anOa2.method6192().method15(this, arg0, Static390.anIntArray359, arg2);
		arg1.anInt6271 = Static390.anIntArray359[0];
		arg1.anInt6273 = Static390.anIntArray359[1];
		arg1.anInt6270 = Static390.anIntArray359[2];
		arg1.anInt6272 = Static390.anIntArray359[3];
		arg1.anInt6269 = Static390.anIntArray359[4];
		arg1.aBoolean490 = Static390.anIntArray359[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method7060(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anOa2.method6192().method6(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
	protected native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7072(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.l(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
	@Override
	public void method7054() {
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class92 method7069(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anOa2.method6192().method3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()V")
	@Override
	protected void method7055() {
		if (this.anOa2.anInt7321 > 1) {
			synchronized (this) {
				super.aBoolean673 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!hba;Lclient!lda;II)V")
	@Override
	public void method7057(@OriginalArg(0) Class115 arg0, @OriginalArg(1) Class9_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.anOa2.method6192().method12(this, arg0, (int[]) null, arg2, arg3);
			return;
		}
		Static390.anIntArray359[5] = 0;
		this.anOa2.method6192().method12(this, arg0, Static390.anIntArray359, arg2, arg3);
		arg1.anInt6271 = Static390.anIntArray359[0];
		arg1.anInt6273 = Static390.anIntArray359[1];
		arg1.anInt6270 = Static390.anIntArray359[2];
		arg1.anInt6272 = Static390.anIntArray359[3];
		arg1.anInt6269 = Static390.anIntArray359[4];
		arg1.aBoolean490 = Static390.anIntArray359[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "R", descriptor = "(Lclient!oa;Lclient!ya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void R(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
	public native int HA();
}
