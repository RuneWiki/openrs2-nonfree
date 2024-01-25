import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class24 implements Interface7 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "Lclient!oa;")
	private final oa anOa2;

	@OriginalMember(owner = "client!i", name = "q", descriptor = "Lclient!ya;")
	private final ya aYa1;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "[Lclient!wr;")
	public Class382[] aClass382Array3;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "[Lclient!ol;")
	public Class243[] aClass243Array3;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!dh;IIII)V")
	public i(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class64 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anOa2 = arg0;
		this.aYa1 = arg1;
		this.aClass382Array3 = arg2.aClass382Array2;
		this.aClass243Array3 = arg2.aClass243Array2;
		@Pc(24) int local24 = arg2.aClass382Array2 == null ? 0 : arg2.aClass382Array2.length;
		@Pc(33) int local33 = arg2.aClass243Array2 == null ? 0 : arg2.aClass243Array2.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass382Array3[local44].anInt10680;
			local42[local35++] = this.aClass382Array3[local44].anInt10683;
			local42[local35++] = this.aClass382Array3[local44].anInt10673;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass243Array3[local78].anInt7539;
		}
		@Pc(101) int local101 = arg2.aClass5Array1 == null ? 0 : arg2.aClass5Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class5 local116 = arg2.aClass5Array1[local110];
			@Pc(121) Class148 local121 = Static250.method4484(local116.anInt66);
			local106[local108++] = local116.anInt67;
			local106[local108++] = local121.anInt4706;
			local106[local108++] = local121.anInt4705;
			local106[local108++] = local121.anInt4702;
			local106[local108++] = local121.anInt4700;
			local106[local108++] = local121.anInt4704;
			local106[local108++] = local121.aBoolean333 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class5 local179 = arg2.aClass5Array1[local173];
			local106[local108++] = local179.anInt64;
		}
		this.R(this.anOa2, this.aYa1, arg2.anInt2001, arg2.anInt1989, arg2.anIntArray132, arg2.anIntArray133, arg2.anIntArray130, arg2.anIntArray137, arg2.aShortArray41, arg2.anInt2002, arg2.aShortArray38, arg2.aShortArray37, arg2.aShortArray39, arg2.aByteArray32, arg2.aByteArray33, arg2.aByteArray29, arg2.aByteArray34, arg2.aShortArray46, arg2.aShortArray42, arg2.anIntArray136, arg2.aByte44, arg2.aShortArray44, arg2.anInt1998, arg2.aByteArray31, arg2.aShortArray40, arg2.aShortArray45, arg2.aShortArray43, arg2.anIntArray131, arg2.anIntArray134, arg2.anIntArray138, arg2.aByteArray30, arg2.aByteArray35, arg2.anIntArray140, arg2.anIntArray139, arg2.anIntArray135, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;)V")
	public i(@OriginalArg(0) oa arg0) {
		this.anOa2 = arg0;
		this.aYa1 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ql;Lclient!eda;II)V")
	@Override
	public void method6845(@OriginalArg(0) Class154 arg0, @OriginalArg(1) Class20_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.anOa2.method6328().method7(this, arg0, (int[]) null, arg2, arg3);
			return;
		}
		Static392.anIntArray436[5] = 0;
		this.anOa2.method6328().method7(this, arg0, Static392.anIntArray436, arg2, arg3);
		arg1.anInt2369 = Static392.anIntArray436[0];
		arg1.anInt2368 = Static392.anIntArray436[1];
		arg1.anInt2370 = Static392.anIntArray436[2];
		arg1.anInt2371 = Static392.anIntArray436[3];
		arg1.anInt2367 = Static392.anIntArray436[4];
		arg1.aBoolean175 = Static392.anIntArray436[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!ql;)V")
	private void method3813(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class154 arg1) {
		this.anOa2.method6328().method3(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
	protected native void wa();

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public native Class6_Sub2_Sub16 ba(@OriginalArg(0) Class6_Sub2_Sub16 arg0);

	@OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
	public native void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ql;)V")
	@Override
	public void method6861(@OriginalArg(0) Class154 arg0) {
		this.method3813(Static392.anIntArray441, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass382Array3 != null) {
			for (local10 = 0; local10 < this.aClass382Array3.length; local10++) {
				@Pc(16) Class382 local16 = this.aClass382Array3[local10];
				local16.anInt10689 = Static392.anIntArray441[local5++];
				local16.anInt10678 = Static392.anIntArray441[local5++];
				local16.anInt10687 = Static392.anIntArray441[local5++];
				local16.anInt10675 = Static392.anIntArray441[local5++];
				local16.anInt10679 = Static392.anIntArray441[local5++];
				local16.anInt10681 = Static392.anIntArray441[local5++];
				local16.anInt10685 = Static392.anIntArray441[local5++];
				local16.anInt10674 = Static392.anIntArray441[local5++];
				local16.anInt10676 = Static392.anIntArray441[local5++];
			}
		}
		if (this.aClass243Array3 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass243Array3.length; local10++) {
			@Pc(87) Class243 local87 = this.aClass243Array3[local10];
			@Pc(89) Class243 local89 = local87;
			if (local87.aClass243_2 != null) {
				local89 = local87.aClass243_2;
			}
			if (local87.aClass154_7 == null) {
				local87.aClass154_7 = arg0.method6574();
			} else {
				local87.aClass154_7.method6563(arg0);
			}
			local89.anInt7533 = Static392.anIntArray441[local5++];
			local89.anInt7531 = Static392.anIntArray441[local5++];
			local89.anInt7534 = Static392.anIntArray441[local5++];
		}
	}

	@OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
	protected native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
	public native int HA();

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method6858(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.l(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Lclient!i;Lclient!i;IZZ)V")
	public native void ZA(@OriginalArg(0) i arg0, @OriginalArg(1) i arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
	public native int G();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class24 method6850(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anOa2.method6328().method12(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "oa", descriptor = "(Lclient!oa;)V")
	private native void oa(@OriginalArg(0) oa arg0);

	@OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
	public native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
	public native int ua();

	@OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
	public native void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()V")
	@Override
	protected void method6870() {
		if (this.anOa2.anInt7350 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean539) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean539 = true;
		}
	}

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
	public native boolean r();

	@OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method6854(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anOa2.method6328().method5(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ql;Lclient!eda;I)V")
	@Override
	public void method6862(@OriginalArg(0) Class154 arg0, @OriginalArg(1) Class20_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anOa2.method6328().method1(this, arg0, (int[]) null, arg2);
			return;
		}
		Static392.anIntArray436[5] = 0;
		this.anOa2.method6328().method1(this, arg0, Static392.anIntArray436, arg2);
		arg1.anInt2369 = Static392.anIntArray436[0];
		arg1.anInt2368 = Static392.anIntArray436[1];
		arg1.anInt2370 = Static392.anIntArray436[2];
		arg1.anInt2371 = Static392.anIntArray436[3];
		arg1.anInt2367 = Static392.anIntArray436[4];
		arg1.aBoolean175 = Static392.anIntArray436[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()[Lclient!wr;")
	@Override
	public Class382[] method6853() {
		return this.aClass382Array3;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static24.method368(this);
		}
	}

	@OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class199 arg2, @OriginalArg(3) Class199 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()V")
	@Override
	public void method6859() {
	}

	@OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
	protected native boolean NA();

	@OriginalMember(owner = "client!i", name = "J", descriptor = "(JIZ)V")
	private native void J(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
	public native boolean F();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method6848(@OriginalArg(0) Class154 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.J(((ja) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!ql;ZI)Z")
	@Override
	public boolean method6855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class154 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.anOa2.method6328().method2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
	public native void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()V")
	@Override
	protected void method6856() {
		if (this.anOa2.anInt7350 > 1) {
			synchronized (this) {
				super.aBoolean539 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "R", descriptor = "(Lclient!oa;Lclient!ya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void R(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!ql;ZII)Z")
	@Override
	public boolean method6867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class154 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.anOa2.method6328().method8(this, arg0, arg1, arg2, arg3, arg5);
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()Z")
	@Override
	public boolean method6866() {
		return true;
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()[Lclient!ol;")
	@Override
	public Class243[] method6865() {
		return this.aClass243Array3;
	}

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
	public native void LA(@OriginalArg(0) int arg0);
}
