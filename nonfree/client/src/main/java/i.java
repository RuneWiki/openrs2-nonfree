import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class54 implements Interface12 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!i", name = "v", descriptor = "Lclient!oa;")
	private final oa anOa2;

	@OriginalMember(owner = "client!i", name = "y", descriptor = "Lclient!ya;")
	private final ya aYa1;

	@OriginalMember(owner = "client!i", name = "w", descriptor = "[Lclient!kw;")
	public Class216[] aClass216Array2;

	@OriginalMember(owner = "client!i", name = "x", descriptor = "[Lclient!iia;")
	public Class173[] aClass173Array2;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!rha;IIII)V")
	public i(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class316 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anOa2 = arg0;
		this.aYa1 = arg1;
		this.aClass216Array2 = arg2.aClass216Array5;
		this.aClass173Array2 = arg2.aClass173Array5;
		@Pc(24) int local24 = arg2.aClass216Array5 == null ? 0 : arg2.aClass216Array5.length;
		@Pc(34) int local34 = arg2.aClass173Array5 == null ? 0 : arg2.aClass173Array5.length;
		@Pc(36) int local36 = 0;
		@Pc(43) int[] local43 = new int[local24 * 3 + local34];
		for (@Pc(45) int local45 = 0; local45 < local24; local45++) {
			local43[local36++] = this.aClass216Array2[local45].anInt5662;
			local43[local36++] = this.aClass216Array2[local45].anInt5658;
			local43[local36++] = this.aClass216Array2[local45].anInt5664;
		}
		for (@Pc(79) int local79 = 0; local79 < local34; local79++) {
			local43[local36++] = this.aClass173Array2[local79].anInt4951;
		}
		@Pc(105) int local105 = arg2.aClass395Array1 == null ? 0 : arg2.aClass395Array1.length;
		@Pc(110) int[] local110 = new int[local105 * 8];
		@Pc(112) int local112 = 0;
		for (@Pc(114) int local114 = 0; local114 < local105; local114++) {
			@Pc(120) Class395 local120 = arg2.aClass395Array1[local114];
			@Pc(125) Class399 local125 = Static634.method8589(local120.anInt10370);
			local110[local112++] = local120.anInt10374;
			local110[local112++] = local125.anInt10493;
			local110[local112++] = local125.anInt10495;
			local110[local112++] = local125.anInt10492;
			local110[local112++] = local125.anInt10494;
			local110[local112++] = local125.anInt10496;
			local110[local112++] = local125.aBoolean779 ? -1 : 0;
		}
		for (@Pc(178) int local178 = 0; local178 < local105; local178++) {
			@Pc(184) Class395 local184 = arg2.aClass395Array1[local178];
			local110[local112++] = local184.anInt10371;
		}
		this.R(this.anOa2, this.aYa1, arg2.anInt8599, arg2.anInt8603, arg2.anIntArray570, arg2.anIntArray575, arg2.anIntArray574, arg2.anIntArray569, arg2.aShortArray124, arg2.anInt8614, arg2.aShortArray131, arg2.aShortArray125, arg2.aShortArray129, arg2.aByteArray90, arg2.aByteArray91, arg2.aByteArray94, arg2.aByteArray93, arg2.aShortArray132, arg2.aShortArray133, arg2.anIntArray572, arg2.aByte129, arg2.aShortArray127, arg2.anInt8617, arg2.aByteArray96, arg2.aShortArray126, arg2.aShortArray128, arg2.aShortArray130, arg2.anIntArray571, arg2.anIntArray573, arg2.anIntArray567, arg2.aByteArray95, arg2.aByteArray92, arg2.anIntArray566, arg2.anIntArray568, arg2.anIntArray576, local43, local24, local34, arg3, arg4, arg5, arg6, local110);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;)V")
	public i(@OriginalArg(0) oa arg0) {
		this.anOa2 = arg0;
		this.aYa1 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
	public native int ua();

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public native Class6_Sub2_Sub18 ba(@OriginalArg(0) Class6_Sub2_Sub18 arg0);

	@OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
	protected native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
	public native int HA();

	@OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static179.method3406(this);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!qa;Lclient!wha;II)V")
	@Override
	public void method7407(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class60_Sub10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.anOa2.method6383().method5(this, arg0, (int[]) null, arg2, arg3);
			return;
		}
		Static413.anIntArray458[5] = 0;
		this.anOa2.method6383().method5(this, arg0, Static413.anIntArray458, arg2, arg3);
		arg1.anInt10340 = Static413.anIntArray458[0];
		arg1.anInt10338 = Static413.anIntArray458[1];
		arg1.anInt10341 = Static413.anIntArray458[2];
		arg1.anInt10342 = Static413.anIntArray458[3];
		arg1.anInt10339 = Static413.anIntArray458[4];
		arg1.aBoolean765 = Static413.anIntArray458[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
	protected native boolean NA();

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()[B")
	@Override
	public byte[] method7423() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!i", name = "g", descriptor = "()[Lclient!kw;")
	@Override
	public Class216[] method7408() {
		return this.aClass216Array2;
	}

	@OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
	public native void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
	public native boolean F();

	@OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
	public native void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()V")
	@Override
	protected void method7418() {
		if (this.anOa2.anInt7178 > 1) {
			synchronized (this) {
				super.aBoolean651 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
	public native void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
	public native boolean r();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class54 method7398(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anOa2.method6383().method7(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!qa;ZII)Z")
	@Override
	public boolean method7399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.anOa2.method6383().method10(this, arg0, arg1, arg2, arg3, arg5);
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
	@Override
	protected void method7420() {
		if (this.anOa2.anInt7178 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean651) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean651 = true;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!qa;)V")
	private void method4266(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class109 arg1) {
		this.anOa2.method6383().method11(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!qa;ZI)Z")
	@Override
	public boolean method7417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.anOa2.method6383().method4(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(3) Class96 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Lclient!i;Lclient!i;IZZ)V")
	public native void ZA(@OriginalArg(0) i arg0, @OriginalArg(1) i arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "oa", descriptor = "(Lclient!oa;)V")
	private native void oa(@OriginalArg(0) oa arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()V")
	@Override
	public void method7414() {
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()Z")
	@Override
	public boolean method7404() {
		return true;
	}

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "R", descriptor = "(Lclient!oa;Lclient!ya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void R(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
	public native int G();

	@OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
	public native void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7403(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.l(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!qa;)V")
	@Override
	public void method7410(@OriginalArg(0) Class109 arg0) {
		this.method4266(Static413.anIntArray455, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass216Array2 != null) {
			for (local10 = 0; local10 < this.aClass216Array2.length; local10++) {
				@Pc(16) Class216 local16 = this.aClass216Array2[local10];
				local16.anInt5653 = Static413.anIntArray455[local5++];
				local16.anInt5657 = Static413.anIntArray455[local5++];
				local16.anInt5655 = Static413.anIntArray455[local5++];
				local16.anInt5663 = Static413.anIntArray455[local5++];
				local16.anInt5666 = Static413.anIntArray455[local5++];
				local16.anInt5667 = Static413.anIntArray455[local5++];
				local16.anInt5665 = Static413.anIntArray455[local5++];
				local16.anInt5654 = Static413.anIntArray455[local5++];
				local16.anInt5656 = Static413.anIntArray455[local5++];
			}
		}
		if (this.aClass173Array2 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass173Array2.length; local10++) {
			@Pc(89) Class173 local89 = this.aClass173Array2[local10];
			@Pc(91) Class173 local91 = local89;
			if (local89.aClass173_1 != null) {
				local91 = local89.aClass173_1;
			}
			if (local89.aClass109_4 == null) {
				local89.aClass109_4 = arg0.method4609();
			} else {
				local89.aClass109_4.method4595(arg0);
			}
			local91.anInt4955 = Static413.anIntArray455[local5++];
			local91.anInt4954 = Static413.anIntArray455[local5++];
			local91.anInt4949 = Static413.anIntArray455[local5++];
		}
	}

	@OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
	public native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B[B)V")
	@Override
	public void method7424(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!qa;Lclient!wha;I)V")
	@Override
	public void method7401(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class60_Sub10 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anOa2.method6383().method12(this, arg0, (int[]) null, arg2);
			return;
		}
		Static413.anIntArray458[5] = 0;
		this.anOa2.method6383().method12(this, arg0, Static413.anIntArray458, arg2);
		arg1.anInt10340 = Static413.anIntArray458[0];
		arg1.anInt10338 = Static413.anIntArray458[1];
		arg1.anInt10341 = Static413.anIntArray458[2];
		arg1.anInt10342 = Static413.anIntArray458[3];
		arg1.anInt10339 = Static413.anIntArray458[4];
		arg1.aBoolean765 = Static413.anIntArray458[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "A", descriptor = "(JIZ)V")
	private native void A(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!qa;IZ)V")
	@Override
	public void method7416(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.A(((ja) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
	protected native void wa();

	@OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method7405(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anOa2.method6383().method1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()[Lclient!iia;")
	@Override
	public Class173[] method7409() {
		return this.aClass173Array2;
	}
}
