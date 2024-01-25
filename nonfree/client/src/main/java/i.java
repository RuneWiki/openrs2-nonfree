import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class45 implements Interface5 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!i", name = "m", descriptor = "Lclient!oa;")
	private final oa anOa2;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "Lclient!ya;")
	private final ya aYa1;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "[Lclient!uda;")
	public Class364[] aClass364Array3;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "[Lclient!uc;")
	public Class363[] aClass363Array3;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!ln;IIII)V")
	public i(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class229 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anOa2 = arg0;
		this.aYa1 = arg1;
		this.aClass364Array3 = arg2.aClass364Array4;
		this.aClass363Array3 = arg2.aClass363Array4;
		@Pc(24) int local24 = arg2.aClass364Array4 == null ? 0 : arg2.aClass364Array4.length;
		@Pc(34) int local34 = arg2.aClass363Array4 == null ? 0 : arg2.aClass363Array4.length;
		@Pc(36) int local36 = 0;
		@Pc(43) int[] local43 = new int[local24 * 3 + local34];
		for (@Pc(45) int local45 = 0; local45 < local24; local45++) {
			local43[local36++] = this.aClass364Array3[local45].anInt9816;
			local43[local36++] = this.aClass364Array3[local45].anInt9818;
			local43[local36++] = this.aClass364Array3[local45].anInt9822;
		}
		for (@Pc(79) int local79 = 0; local79 < local34; local79++) {
			local43[local36++] = this.aClass363Array3[local79].anInt9789;
		}
		@Pc(105) int local105 = arg2.aClass390Array1 == null ? 0 : arg2.aClass390Array1.length;
		@Pc(110) int[] local110 = new int[local105 * 8];
		@Pc(112) int local112 = 0;
		for (@Pc(114) int local114 = 0; local114 < local105; local114++) {
			@Pc(120) Class390 local120 = arg2.aClass390Array1[local114];
			@Pc(125) Class28 local125 = Static200.method2824(local120.anInt10650);
			local110[local112++] = local120.anInt10646;
			local110[local112++] = local125.anInt485;
			local110[local112++] = local125.anInt488;
			local110[local112++] = local125.anInt489;
			local110[local112++] = local125.anInt487;
			local110[local112++] = local125.anInt483;
			local110[local112++] = local125.aBoolean70 ? -1 : 0;
		}
		for (@Pc(178) int local178 = 0; local178 < local105; local178++) {
			@Pc(184) Class390 local184 = arg2.aClass390Array1[local178];
			local110[local112++] = local184.anInt10645;
		}
		this.R(this.anOa2, this.aYa1, arg2.anInt5931, arg2.anInt5932, arg2.anIntArray394, arg2.anIntArray392, arg2.anIntArray396, arg2.anIntArray397, arg2.aShortArray99, arg2.anInt5934, arg2.aShortArray102, arg2.aShortArray95, arg2.aShortArray98, arg2.aByteArray79, arg2.aByteArray78, arg2.aByteArray80, arg2.aByteArray77, arg2.aShortArray100, arg2.aShortArray93, arg2.anIntArray395, arg2.aByte79, arg2.aShortArray97, arg2.anInt5946, arg2.aByteArray82, arg2.aShortArray94, arg2.aShortArray96, arg2.aShortArray101, arg2.anIntArray399, arg2.anIntArray402, arg2.anIntArray398, arg2.aByteArray81, arg2.aByteArray83, arg2.anIntArray400, arg2.anIntArray401, arg2.anIntArray393, local43, local24, local34, arg3, arg4, arg5, arg6, local110);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;)V")
	public i(@OriginalArg(0) oa arg0) {
		this.anOa2 = arg0;
		this.aYa1 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!i", name = "D", descriptor = "(JIZ)V")
	private native void D(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()[Lclient!uc;")
	@Override
	public Class363[] method5745() {
		return this.aClass363Array3;
	}

	@OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
	public native int HA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!gw;Lclient!fa;I)V")
	@Override
	public void method5769(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class4_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anOa2.method6486().method9(this, arg0, (int[]) null, arg2);
			return;
		}
		Static443.anIntArray515[5] = 0;
		this.anOa2.method6486().method9(this, arg0, Static443.anIntArray515, arg2);
		arg1.anInt2724 = Static443.anIntArray515[0];
		arg1.anInt2725 = Static443.anIntArray515[1];
		arg1.anInt2722 = Static443.anIntArray515[2];
		arg1.anInt2726 = Static443.anIntArray515[3];
		arg1.anInt2723 = Static443.anIntArray515[4];
		arg1.aBoolean269 = Static443.anIntArray515[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()[Lclient!uda;")
	@Override
	public Class364[] method5753() {
		return this.aClass364Array3;
	}

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static178.method2627(this);
		}
	}

	@OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
	public native int ua();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class45 method5768(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anOa2.method6486().method3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
	public native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()Z")
	@Override
	public boolean method5757() {
		return true;
	}

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
	public native boolean r();

	@OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!gw;ZI)Z")
	@Override
	public boolean method5770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.anOa2.method6486().method15(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!i", name = "oa", descriptor = "(Lclient!oa;)V")
	private native void oa(@OriginalArg(0) oa arg0);

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!gw;ZII)Z")
	@Override
	public boolean method5743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.anOa2.method6486().method1(this, arg0, arg1, arg2, arg3, arg5);
	}

	@OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
	public native boolean F();

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!gw;)V")
	private void method3676(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class86 arg1) {
		this.anOa2.method6486().method8(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()V")
	@Override
	public void method5763() {
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method5760(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anOa2.method6486().method13(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
	protected native boolean NA();

	@OriginalMember(owner = "client!i", name = "g", descriptor = "()V")
	@Override
	protected void method5747() {
		if (this.anOa2.anInt7194 > 1) {
			synchronized (this) {
				super.aBoolean535 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
	public native void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Lclient!i;Lclient!i;IZZ)V")
	public native void ZA(@OriginalArg(0) i arg0, @OriginalArg(1) i arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public native Class2_Sub6_Sub9 ba(@OriginalArg(0) Class2_Sub6_Sub9 arg0);

	@OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()[B")
	@Override
	public byte[] method5752() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method5751(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.l(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
	protected native void wa();

	@OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B[B)V")
	@Override
	public void method5762(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
	public native int G();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!gw;Lclient!fa;II)V")
	@Override
	public void method5759(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class4_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.anOa2.method6486().method10(this, arg0, (int[]) null, arg2, arg3);
			return;
		}
		Static443.anIntArray515[5] = 0;
		this.anOa2.method6486().method10(this, arg0, Static443.anIntArray515, arg2, arg3);
		arg1.anInt2724 = Static443.anIntArray515[0];
		arg1.anInt2725 = Static443.anIntArray515[1];
		arg1.anInt2722 = Static443.anIntArray515[2];
		arg1.anInt2726 = Static443.anIntArray515[3];
		arg1.anInt2723 = Static443.anIntArray515[4];
		arg1.aBoolean269 = Static443.anIntArray515[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
	public native void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
	@Override
	protected void method5746() {
		if (this.anOa2.anInt7194 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean535) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean535 = true;
		}
	}

	@OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
	public native void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "R", descriptor = "(Lclient!oa;Lclient!ya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void R(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class133 arg2, @OriginalArg(3) Class133 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!gw;)V")
	@Override
	public void method5750(@OriginalArg(0) Class86 arg0) {
		this.method3676(Static443.anIntArray514, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass364Array3 != null) {
			for (local10 = 0; local10 < this.aClass364Array3.length; local10++) {
				@Pc(16) Class364 local16 = this.aClass364Array3[local10];
				local16.anInt9825 = Static443.anIntArray514[local5++];
				local16.anInt9819 = Static443.anIntArray514[local5++];
				local16.anInt9826 = Static443.anIntArray514[local5++];
				local16.anInt9820 = Static443.anIntArray514[local5++];
				local16.anInt9832 = Static443.anIntArray514[local5++];
				local16.anInt9821 = Static443.anIntArray514[local5++];
				local16.anInt9827 = Static443.anIntArray514[local5++];
				local16.anInt9831 = Static443.anIntArray514[local5++];
				local16.anInt9830 = Static443.anIntArray514[local5++];
			}
		}
		if (this.aClass363Array3 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass363Array3.length; local10++) {
			@Pc(89) Class363 local89 = this.aClass363Array3[local10];
			@Pc(91) Class363 local91 = local89;
			if (local89.aClass363_2 != null) {
				local91 = local89.aClass363_2;
			}
			if (local89.aClass86_10 == null) {
				local89.aClass86_10 = arg0.method7018();
			} else {
				local89.aClass86_10.method7032(arg0);
			}
			local91.anInt9786 = Static443.anIntArray514[local5++];
			local91.anInt9783 = Static443.anIntArray514[local5++];
			local91.anInt9787 = Static443.anIntArray514[local5++];
		}
	}

	@OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
	public native void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
	protected native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!gw;IZ)V")
	@Override
	public void method5756(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.D(((ja) arg0).nativeid, arg1, arg2);
	}
}
