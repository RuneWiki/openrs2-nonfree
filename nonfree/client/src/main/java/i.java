import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class170 implements Interface6 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!i", name = "m", descriptor = "Lclient!oa;")
	private final oa anOa2;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "Lclient!ya;")
	private final ya aYa1;

	@OriginalMember(owner = "client!i", name = "l", descriptor = "[Lclient!ip;")
	public Class184[] aClass184Array2;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "[Lclient!lk;")
	public Class232[] aClass232Array2;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!gt;IIII)V")
	public i(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anOa2 = arg0;
		this.aYa1 = arg1;
		this.aClass184Array2 = arg2.aClass184Array1;
		this.aClass232Array2 = arg2.aClass232Array1;
		@Pc(24) int local24 = arg2.aClass184Array1 == null ? 0 : arg2.aClass184Array1.length;
		@Pc(34) int local34 = arg2.aClass232Array1 == null ? 0 : arg2.aClass232Array1.length;
		@Pc(36) int local36 = 0;
		@Pc(43) int[] local43 = new int[local24 * 3 + local34];
		for (@Pc(45) int local45 = 0; local45 < local24; local45++) {
			local43[local36++] = this.aClass184Array2[local45].anInt4428;
			local43[local36++] = this.aClass184Array2[local45].anInt4426;
			local43[local36++] = this.aClass184Array2[local45].anInt4439;
		}
		for (@Pc(79) int local79 = 0; local79 < local34; local79++) {
			local43[local36++] = this.aClass232Array2[local79].anInt5881;
		}
		@Pc(105) int local105 = arg2.aClass60Array1 == null ? 0 : arg2.aClass60Array1.length;
		@Pc(110) int[] local110 = new int[local105 * 8];
		@Pc(112) int local112 = 0;
		for (@Pc(114) int local114 = 0; local114 < local105; local114++) {
			@Pc(120) Class60 local120 = arg2.aClass60Array1[local114];
			@Pc(125) Class343 local125 = Static692.method9171(local120.anInt2032);
			local110[local112++] = local120.anInt2027;
			local110[local112++] = local125.anInt9031;
			local110[local112++] = local125.anInt9033;
			local110[local112++] = local125.anInt9034;
			local110[local112++] = local125.anInt9030;
			local110[local112++] = local125.anInt9028;
			local110[local112++] = local125.aBoolean605 ? -1 : 0;
		}
		for (@Pc(178) int local178 = 0; local178 < local105; local178++) {
			@Pc(184) Class60 local184 = arg2.aClass60Array1[local178];
			local110[local112++] = local184.anInt2028;
		}
		this.R(this.anOa2, this.aYa1, arg2.anInt3635, arg2.anInt3636, arg2.anIntArray253, arg2.anIntArray257, arg2.anIntArray251, arg2.anIntArray259, arg2.aShortArray32, arg2.anInt3646, arg2.aShortArray30, arg2.aShortArray33, arg2.aShortArray36, arg2.aByteArray29, arg2.aByteArray28, arg2.aByteArray27, arg2.aByteArray30, arg2.aShortArray35, arg2.aShortArray38, arg2.anIntArray258, arg2.aByte62, arg2.aShortArray29, arg2.anInt3629, arg2.aByteArray31, arg2.aShortArray37, arg2.aShortArray31, arg2.aShortArray34, arg2.anIntArray252, arg2.anIntArray254, arg2.anIntArray255, arg2.aByteArray32, arg2.aByteArray33, arg2.anIntArray261, arg2.anIntArray260, arg2.anIntArray256, local43, local24, local34, arg3, arg4, arg5, arg6, local110);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;)V")
	public i(@OriginalArg(0) oa arg0) {
		this.anOa2 = arg0;
		this.aYa1 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public native Class3_Sub7_Sub17 ba(@OriginalArg(0) Class3_Sub7_Sub17 arg0);

	@OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
	protected native boolean NA();

	@OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
	protected native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B[B)V")
	@Override
	public void method8363(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!cl;IZ)V")
	@Override
	public void method8361(@OriginalArg(0) Class58 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.B(((ja) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class259 arg2, @OriginalArg(3) Class259 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
	protected native void wa();

	@OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!i", name = "g", descriptor = "()V")
	@Override
	protected void method8370() {
		if (this.anOa2.anInt7156 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean660) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean660 = true;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()[Lclient!lk;")
	@Override
	public Class232[] method8352() {
		return this.aClass232Array2;
	}

	@OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
	public native int ua();

	@OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
	public native void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
	public native void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "R", descriptor = "(Lclient!oa;Lclient!ya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void R(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!cl;Lclient!ve;II)V")
	@Override
	public void method8350(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class9_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.anOa2.method6204().method14(this, arg0, (int[]) null, arg2, arg3);
			return;
		}
		Static457.anIntArray530[5] = 0;
		this.anOa2.method6204().method14(this, arg0, Static457.anIntArray530, arg2, arg3);
		arg1.anInt10619 = Static457.anIntArray530[0];
		arg1.anInt10618 = Static457.anIntArray530[1];
		arg1.anInt10616 = Static457.anIntArray530[2];
		arg1.anInt10617 = Static457.anIntArray530[3];
		arg1.anInt10620 = Static457.anIntArray530[4];
		arg1.aBoolean719 = Static457.anIntArray530[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
	public native boolean F();

	@OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method8355(@OriginalArg(0) Class170 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anOa2.method6204().method12(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
	public native int HA();

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!cl;ZI)Z")
	@Override
	public boolean method8349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class58 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.anOa2.method6204().method9(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()[B")
	@Override
	public byte[] method8366() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!cl;ZII)Z")
	@Override
	public boolean method8351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class58 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.anOa2.method6204().method1(this, arg0, arg1, arg2, arg3, arg5);
	}

	@OriginalMember(owner = "client!i", name = "oa", descriptor = "(Lclient!oa;)V")
	private native void oa(@OriginalArg(0) oa arg0);

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()[Lclient!ip;")
	@Override
	public Class184[] method8354() {
		return this.aClass184Array2;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!cl;Lclient!ve;I)V")
	@Override
	public void method8360(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class9_Sub9 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anOa2.method6204().method15(this, arg0, (int[]) null, arg2);
			return;
		}
		Static457.anIntArray530[5] = 0;
		this.anOa2.method6204().method15(this, arg0, Static457.anIntArray530, arg2);
		arg1.anInt10619 = Static457.anIntArray530[0];
		arg1.anInt10618 = Static457.anIntArray530[1];
		arg1.anInt10616 = Static457.anIntArray530[2];
		arg1.anInt10617 = Static457.anIntArray530[3];
		arg1.anInt10620 = Static457.anIntArray530[4];
		arg1.aBoolean719 = Static457.anIntArray530[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class170 method8369(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anOa2.method6204().method11(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Lclient!i;Lclient!i;IZZ)V")
	public native void ZA(@OriginalArg(0) i arg0, @OriginalArg(1) i arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()V")
	@Override
	public void method8362() {
	}

	@OriginalMember(owner = "client!i", name = "B", descriptor = "(JIZ)V")
	private native void B(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
	public native int G();

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!cl;)V")
	@Override
	public void method8357(@OriginalArg(0) Class58 arg0) {
		this.method3709(Static457.anIntArray532, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass184Array2 != null) {
			for (local10 = 0; local10 < this.aClass184Array2.length; local10++) {
				@Pc(16) Class184 local16 = this.aClass184Array2[local10];
				local16.anInt4429 = Static457.anIntArray532[local5++];
				local16.anInt4427 = Static457.anIntArray532[local5++];
				local16.anInt4424 = Static457.anIntArray532[local5++];
				local16.anInt4435 = Static457.anIntArray532[local5++];
				local16.anInt4440 = Static457.anIntArray532[local5++];
				local16.anInt4434 = Static457.anIntArray532[local5++];
				local16.anInt4430 = Static457.anIntArray532[local5++];
				local16.anInt4438 = Static457.anIntArray532[local5++];
				local16.anInt4431 = Static457.anIntArray532[local5++];
			}
		}
		if (this.aClass232Array2 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass232Array2.length; local10++) {
			@Pc(89) Class232 local89 = this.aClass232Array2[local10];
			@Pc(91) Class232 local91 = local89;
			if (local89.aClass232_1 != null) {
				local91 = local89.aClass232_1;
			}
			if (local89.aClass58_4 == null) {
				local89.aClass58_4 = arg0.method9522();
			} else {
				local89.aClass58_4.method9516(arg0);
			}
			local91.anInt5884 = Static457.anIntArray532[local5++];
			local91.anInt5886 = Static457.anIntArray532[local5++];
			local91.anInt5879 = Static457.anIntArray532[local5++];
		}
	}

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
	public native boolean r();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method8347(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.l(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
	@Override
	protected void method8365() {
		if (this.anOa2.anInt7156 > 1) {
			synchronized (this) {
				super.aBoolean660 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!cl;)V")
	private void method3709(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class58 arg1) {
		this.anOa2.method6204().method4(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
	public native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
	public native void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static199.method3055(this);
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()Z")
	@Override
	public boolean method8368() {
		return true;
	}

	@OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
	public native void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);
}
