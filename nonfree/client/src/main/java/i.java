import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class180 implements Interface10 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "Lclient!oa;")
	private final oa anOa2;

	@OriginalMember(owner = "client!i", name = "q", descriptor = "Lclient!ya;")
	private final ya aYa1;

	@OriginalMember(owner = "client!i", name = "s", descriptor = "[Lclient!cm;")
	public Class57[] aClass57Array1;

	@OriginalMember(owner = "client!i", name = "r", descriptor = "[Lclient!hi;")
	public Class143[] aClass143Array1;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!ur;IIII)V")
	public i(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class349 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anOa2 = arg0;
		this.aYa1 = arg1;
		this.aClass57Array1 = arg2.aClass57Array5;
		this.aClass143Array1 = arg2.aClass143Array5;
		@Pc(24) int local24 = arg2.aClass57Array5 == null ? 0 : arg2.aClass57Array5.length;
		@Pc(33) int local33 = arg2.aClass143Array5 == null ? 0 : arg2.aClass143Array5.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass57Array1[local44].anInt1261;
			local42[local35++] = this.aClass57Array1[local44].anInt1265;
			local42[local35++] = this.aClass57Array1[local44].anInt1270;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass143Array1[local78].anInt3651;
		}
		@Pc(101) int local101 = arg2.aClass196Array1 == null ? 0 : arg2.aClass196Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class196 local116 = arg2.aClass196Array1[local110];
			@Pc(121) Class255 local121 = Static415.method6340(local116.anInt4755);
			local106[local108++] = local116.anInt4752;
			local106[local108++] = local121.anInt6892;
			local106[local108++] = local121.anInt6891;
			local106[local108++] = local121.anInt6889;
			local106[local108++] = local121.anInt6893;
			local106[local108++] = local121.anInt6888;
			local106[local108++] = local121.aBoolean571 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class196 local179 = arg2.aClass196Array1[local173];
			local106[local108++] = local179.anInt4756;
		}
		this.R(this.anOa2, this.aYa1, arg2.anInt9582, arg2.anInt9589, arg2.anIntArray764, arg2.anIntArray774, arg2.anIntArray769, arg2.anIntArray771, arg2.aShortArray166, arg2.anInt9571, arg2.aShortArray167, arg2.aShortArray165, arg2.aShortArray174, arg2.aByteArray97, arg2.aByteArray96, arg2.aByteArray95, arg2.aByteArray91, arg2.aShortArray170, arg2.aShortArray171, arg2.anIntArray766, arg2.aByte128, arg2.aShortArray172, arg2.anInt9574, arg2.aByteArray92, arg2.aShortArray168, arg2.aShortArray169, arg2.aShortArray173, arg2.anIntArray772, arg2.anIntArray765, arg2.anIntArray763, arg2.aByteArray94, arg2.aByteArray93, arg2.anIntArray770, arg2.anIntArray767, arg2.anIntArray768, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;)V")
	public i(@OriginalArg(0) oa arg0) {
		this.anOa2 = arg0;
		this.aYa1 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
	public native void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
	public native void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method7937(@OriginalArg(0) Class180 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anOa2.method6083().method10(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!i", name = "J", descriptor = "(JIZ)V")
	private native void J(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ofa;Lclient!vh;II)V")
	@Override
	public void method7950(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class14_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.anOa2.method6083().method15(this, arg0, (int[]) null, arg2, arg3);
			return;
		}
		Static391.anIntArray539[5] = 0;
		this.anOa2.method6083().method15(this, arg0, Static391.anIntArray539, arg2, arg3);
		arg1.anInt9898 = Static391.anIntArray539[0];
		arg1.anInt9897 = Static391.anIntArray539[1];
		arg1.anInt9896 = Static391.anIntArray539[2];
		arg1.anInt9894 = Static391.anIntArray539[3];
		arg1.anInt9895 = Static391.anIntArray539[4];
		arg1.aBoolean809 = Static391.anIntArray539[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!ofa;ZII)Z")
	@Override
	public boolean method7929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.anOa2.method6083().method12(this, arg0, arg1, arg2, arg3, arg5);
	}

	@OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
	public native int HA();

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()Z")
	@Override
	public boolean method7931() {
		return true;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
	public native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Lclient!i;Lclient!i;IZZ)V")
	public native void ZA(@OriginalArg(0) i arg0, @OriginalArg(1) i arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7947(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.l(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
	@Override
	protected void method7936() {
		if (this.anOa2.anInt6830 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean749) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean749 = true;
		}
	}

	@OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public native Class5_Sub4_Sub10 ba(@OriginalArg(0) Class5_Sub4_Sub10 arg0);

	@OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
	protected native boolean NA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
	protected native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) Class40 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!ofa;ZI)Z")
	@Override
	public boolean method7946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.anOa2.method6083().method16(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
	public native void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
	public native int ua();

	@OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
	public native void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static212.method3227(this);
		}
	}

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ofa;)V")
	@Override
	public void method7951(@OriginalArg(0) Class117 arg0) {
		this.method3488(Static391.anIntArray534, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass57Array1 != null) {
			for (local10 = 0; local10 < this.aClass57Array1.length; local10++) {
				@Pc(16) Class57 local16 = this.aClass57Array1[local10];
				local16.anInt1262 = Static391.anIntArray534[local5++];
				local16.anInt1272 = Static391.anIntArray534[local5++];
				local16.anInt1271 = Static391.anIntArray534[local5++];
				local16.anInt1267 = Static391.anIntArray534[local5++];
				local16.anInt1266 = Static391.anIntArray534[local5++];
				local16.anInt1256 = Static391.anIntArray534[local5++];
				local16.anInt1255 = Static391.anIntArray534[local5++];
				local16.anInt1257 = Static391.anIntArray534[local5++];
				local16.anInt1269 = Static391.anIntArray534[local5++];
			}
		}
		if (this.aClass143Array1 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass143Array1.length; local10++) {
			@Pc(87) Class143 local87 = this.aClass143Array1[local10];
			@Pc(89) Class143 local89 = local87;
			if (local87.aClass143_1 != null) {
				local89 = local87.aClass143_1;
			}
			if (local87.aClass117_3 == null) {
				local87.aClass117_3 = arg0.method7248();
			} else {
				local87.aClass117_3.method7253(arg0);
			}
			local89.anInt3655 = Static391.anIntArray534[local5++];
			local89.anInt3654 = Static391.anIntArray534[local5++];
			local89.anInt3661 = Static391.anIntArray534[local5++];
		}
	}

	@OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "R", descriptor = "(Lclient!oa;Lclient!ya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void R(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!ofa;)V")
	private void method3488(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class117 arg1) {
		this.anOa2.method6083().method2(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()[Lclient!cm;")
	@Override
	public Class57[] method7940() {
		return this.aClass57Array1;
	}

	@OriginalMember(owner = "client!i", name = "oa", descriptor = "(Lclient!oa;)V")
	private native void oa(@OriginalArg(0) oa arg0);

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
	public native int G();

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()V")
	@Override
	public void method7944() {
	}

	@OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()[Lclient!hi;")
	@Override
	public Class143[] method7935() {
		return this.aClass143Array1;
	}

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
	public native boolean r();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ofa;Lclient!vh;I)V")
	@Override
	public void method7949(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class14_Sub9 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anOa2.method6083().method3(this, arg0, (int[]) null, arg2);
			return;
		}
		Static391.anIntArray539[5] = 0;
		this.anOa2.method6083().method3(this, arg0, Static391.anIntArray539, arg2);
		arg1.anInt9898 = Static391.anIntArray539[0];
		arg1.anInt9897 = Static391.anIntArray539[1];
		arg1.anInt9896 = Static391.anIntArray539[2];
		arg1.anInt9894 = Static391.anIntArray539[3];
		arg1.anInt9895 = Static391.anIntArray539[4];
		arg1.aBoolean809 = Static391.anIntArray539[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ofa;IZ)V")
	@Override
	public void method7952(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.J(((ja) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class180 method7945(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anOa2.method6083().method5(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()V")
	@Override
	protected void method7934() {
		if (this.anOa2.anInt6830 > 1) {
			synchronized (this) {
				super.aBoolean749 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
	public native boolean F();

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
	protected native void wa();
}
