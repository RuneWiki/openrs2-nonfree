import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xa")
public final class xa extends Class57 implements Interface11 {

	@OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!xa", name = "n", descriptor = "Lclient!w;")
	private final w aW3;

	@OriginalMember(owner = "client!xa", name = "m", descriptor = "Lclient!g;")
	private final g aG2;

	@OriginalMember(owner = "client!xa", name = "l", descriptor = "[Lclient!od;")
	public Class179[] aClass179Array4;

	@OriginalMember(owner = "client!xa", name = "k", descriptor = "[Lclient!u;")
	public Class236[] aClass236Array4;

	@OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lclient!w;Lclient!g;Lclient!fe;IIII)V")
	public xa(@OriginalArg(0) w arg0, @OriginalArg(1) g arg1, @OriginalArg(2) Class74 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aW3 = arg0;
		this.aG2 = arg1;
		this.aClass179Array4 = arg2.aClass179Array1;
		this.aClass236Array4 = arg2.aClass236Array1;
		@Pc(24) int local24 = arg2.aClass179Array1 == null ? 0 : arg2.aClass179Array1.length;
		@Pc(33) int local33 = arg2.aClass236Array1 == null ? 0 : arg2.aClass236Array1.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass179Array4[local44].anInt4628;
			local42[local35++] = this.aClass179Array4[local44].anInt4624;
			local42[local35++] = this.aClass179Array4[local44].anInt4638;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass236Array4[local78].anInt6780;
		}
		@Pc(101) int local101 = arg2.aClass264Array1 == null ? 0 : arg2.aClass264Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class264 local116 = arg2.aClass264Array1[local110];
			@Pc(121) Class157 local121 = Static434.method5732(local116.anInt7367);
			local106[local108++] = local116.anInt7369;
			local106[local108++] = local121.anInt4074;
			local106[local108++] = local121.anInt4073;
			local106[local108++] = local121.anInt4080;
			local106[local108++] = local121.anInt4083;
			local106[local108++] = local121.anInt4079;
			local106[local108++] = local121.aBoolean266 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class264 local179 = arg2.aClass264Array1[local173];
			local106[local108++] = local179.anInt7368;
		}
		this.P(this.aW3, this.aG2, arg2.anInt1943, arg2.anInt1955, arg2.anIntArray96, arg2.anIntArray94, arg2.anIntArray99, arg2.anIntArray97, arg2.aShortArray21, arg2.anInt1949, arg2.aShortArray18, arg2.aShortArray17, arg2.aShortArray26, arg2.aByteArray25, arg2.aByteArray23, arg2.aByteArray20, arg2.aByteArray21, arg2.aShortArray24, arg2.aShortArray22, arg2.anIntArray103, arg2.aByte15, arg2.aShortArray19, arg2.anInt1947, arg2.aByteArray24, arg2.aShortArray25, arg2.aShortArray23, arg2.aShortArray20, arg2.anIntArray101, arg2.anIntArray102, arg2.anIntArray93, arg2.aByteArray26, arg2.aByteArray22, arg2.anIntArray100, arg2.anIntArray98, arg2.anIntArray95, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lclient!w;)V")
	public xa(@OriginalArg(0) w arg0) {
		this.aW3 = arg0;
		this.aG2 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!xa", name = "L", descriptor = "()V")
	public native void L();

	@OriginalMember(owner = "client!xa", name = "S", descriptor = "()I")
	public native int S();

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(III)V")
	public native void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!xa", name = "W", descriptor = "(I)V")
	public native void W(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(ILclient!c;)V")
	public void method6075(@OriginalArg(0) int arg0, @OriginalArg(1) Class29 arg1) {
		@Pc(1) int local1 = arg0;
		@Pc(6) int local6;
		if (this.aClass179Array4 != null) {
			for (local6 = 0; local6 < this.aClass179Array4.length; local6++) {
				@Pc(12) Class179 local12 = this.aClass179Array4[local6];
				local12.anInt4621 = Static443.anIntArray494[local1++];
				local12.anInt4634 = Static443.anIntArray494[local1++];
				local12.anInt4622 = Static443.anIntArray494[local1++];
				local12.anInt4632 = Static443.anIntArray494[local1++];
				local12.anInt4637 = Static443.anIntArray494[local1++];
				local12.anInt4626 = Static443.anIntArray494[local1++];
				local12.anInt4627 = Static443.anIntArray494[local1++];
				local12.anInt4633 = Static443.anIntArray494[local1++];
				local12.anInt4636 = Static443.anIntArray494[local1++];
			}
		}
		if (this.aClass236Array4 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass236Array4.length; local6++) {
			@Pc(83) Class236 local83 = this.aClass236Array4[local6];
			@Pc(85) Class236 local85 = local83;
			if (local83.aClass236_2 != null) {
				local85 = local83.aClass236_2;
			}
			if (local83.aClass29_7 == null) {
				local83.aClass29_7 = arg1.method4107();
			} else {
				local83.aClass29_7.ha(arg1);
			}
			local85.anInt6775 = Static443.anIntArray494[local1++];
			local85.anInt6781 = Static443.anIntArray494[local1++];
			local85.anInt6774 = Static443.anIntArray494[local1++];
		}
	}

	@OriginalMember(owner = "client!xa", name = "A", descriptor = "(I)V")
	public native void A(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "k", descriptor = "()I")
	public native int k();

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!xa", name = "aa", descriptor = "(I[IIIIZI[I)V")
	protected native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lclient!c;Lclient!wg;II)V")
	@Override
	public void method6072(@OriginalArg(0) Class29 arg0, @OriginalArg(1) Class88_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aW3.method5892().LA(this, arg0, null, arg2, 1);
			return;
		}
		Static443.anIntArray498[5] = 0;
		this.aW3.method5892().LA(this, arg0, Static443.anIntArray498, arg2, 1);
		arg1.anInt7384 = Static443.anIntArray498[0];
		arg1.anInt7387 = Static443.anIntArray498[1];
		arg1.anInt7385 = Static443.anIntArray498[2];
		arg1.anInt7388 = Static443.anIntArray498[3];
		arg1.anInt7386 = Static443.anIntArray498[4];
		arg1.aBoolean496 = Static443.anIntArray498[5] != 0;
	}

	@OriginalMember(owner = "client!xa", name = "SA", descriptor = "(Lclient!xa;Lclient!xa;IZZ)V")
	public native void SA(@OriginalArg(0) xa arg0, @OriginalArg(1) xa arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!xa", name = "K", descriptor = "(I)V")
	public native void K(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "EA", descriptor = "(Lclient!i;)Lclient!i;")
	public native Class5_Sub2_Sub1 EA(@OriginalArg(0) Class5_Sub2_Sub1 arg0);

	@OriginalMember(owner = "client!xa", name = "ma", descriptor = "(I)V")
	public native void ma(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lclient!c;Lclient!wg;I)V")
	@Override
	public void method6060(@OriginalArg(0) Class29 arg0, @OriginalArg(1) Class88_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aW3.method5892().MA(this, arg0, null, arg2);
			return;
		}
		Static443.anIntArray498[5] = 0;
		this.aW3.method5892().MA(this, arg0, Static443.anIntArray498, arg2);
		arg1.anInt7384 = Static443.anIntArray498[0];
		arg1.anInt7387 = Static443.anIntArray498[1];
		arg1.anInt7385 = Static443.anIntArray498[2];
		arg1.anInt7388 = Static443.anIntArray498[3];
		arg1.anInt7386 = Static443.anIntArray498[4];
		arg1.aBoolean496 = Static443.anIntArray498[5] != 0;
	}

	@OriginalMember(owner = "client!xa", name = "d", descriptor = "()[Lclient!od;")
	@Override
	public Class179[] method6073() {
		return this.aClass179Array4;
	}

	@OriginalMember(owner = "client!xa", name = "pa", descriptor = "()I")
	public native int pa();

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(BIZ)Lclient!e;")
	@Override
	public Class57 method6066(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.aW3.method5892().method2800(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!xa", name = "c", descriptor = "()V")
	@Override
	public void method6069() {
	}

	@OriginalMember(owner = "client!xa", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!xa", name = "u", descriptor = "(SS)V")
	public native void u(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!xa", name = "b", descriptor = "()Z")
	@Override
	public boolean method6068() {
		return true;
	}

	@OriginalMember(owner = "client!xa", name = "n", descriptor = "(III)V")
	public native void n(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "()[Lclient!u;")
	@Override
	public Class236[] method6064() {
		return this.aClass236Array4;
	}

	@OriginalMember(owner = "client!xa", name = "oa", descriptor = "(Lclient!w;)V")
	private native void oa(@OriginalArg(0) w arg0);

	@OriginalMember(owner = "client!xa", name = "B", descriptor = "()I")
	public native int B();

	@OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static155.method2188(this);
		}
	}

	@OriginalMember(owner = "client!xa", name = "h", descriptor = "()Z")
	protected native boolean h();

	@OriginalMember(owner = "client!xa", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "l", descriptor = "()I")
	public native int l();

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lclient!e;IIIZ)V")
	@Override
	public void method6063(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aW3.method5892().s(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!xa", name = "q", descriptor = "(SS)V")
	public native void q(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!xa", name = "ta", descriptor = "()I")
	public native int ta();

	@OriginalMember(owner = "client!xa", name = "Z", descriptor = "()I")
	public native int Z();

	@OriginalMember(owner = "client!xa", name = "p", descriptor = "()V")
	public native void p();

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(IILclient!c;Z)Z")
	@Override
	public boolean method6071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class29 arg2, @OriginalArg(3) boolean arg3) {
		return this.aW3.method5892().ia(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!xa", name = "va", descriptor = "(I[IIIIIZ)V")
	protected native void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!xa", name = "KA", descriptor = "()V")
	protected native void KA();

	@OriginalMember(owner = "client!xa", name = "P", descriptor = "(Lclient!w;Lclient!g;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void P(@OriginalArg(0) w arg0, @OriginalArg(1) g arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!xa", name = "D", descriptor = "(I)V")
	public native void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "za", descriptor = "(IIII)V")
	protected native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!xa", name = "X", descriptor = "(I)V")
	public native void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "MA", descriptor = "()I")
	public native int MA();

	@OriginalMember(owner = "client!xa", name = "da", descriptor = "(IILclient!ya;Lclient!ya;III)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class125 arg2, @OriginalArg(3) Class125 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!xa", name = "Y", descriptor = "()I")
	public native int Y();
}
