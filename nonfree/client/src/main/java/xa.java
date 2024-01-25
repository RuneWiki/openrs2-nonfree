import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xa")
public final class xa extends Class17 implements Interface1 {

	@OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!xa", name = "m", descriptor = "Lclient!w;")
	private final w aW3;

	@OriginalMember(owner = "client!xa", name = "p", descriptor = "Lclient!g;")
	private final g aG2;

	@OriginalMember(owner = "client!xa", name = "o", descriptor = "[Lclient!gh;")
	public Class94[] aClass94Array4;

	@OriginalMember(owner = "client!xa", name = "n", descriptor = "[Lclient!hv;")
	public Class114[] aClass114Array4;

	@OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lclient!w;Lclient!g;Lclient!ko;IIII)V")
	public xa(@OriginalArg(0) w arg0, @OriginalArg(1) g arg1, @OriginalArg(2) Class147 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aW3 = arg0;
		this.aG2 = arg1;
		this.aClass94Array4 = arg2.aClass94Array3;
		this.aClass114Array4 = arg2.aClass114Array3;
		@Pc(24) int local24 = arg2.aClass94Array3 == null ? 0 : arg2.aClass94Array3.length;
		@Pc(33) int local33 = arg2.aClass114Array3 == null ? 0 : arg2.aClass114Array3.length;
		@Pc(35) int local35 = 0;
		@Pc(42) int[] local42 = new int[local24 * 3 + local33];
		for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
			local42[local35++] = this.aClass94Array4[local44].anInt2952;
			local42[local35++] = this.aClass94Array4[local44].anInt2936;
			local42[local35++] = this.aClass94Array4[local44].anInt2942;
		}
		for (@Pc(78) int local78 = 0; local78 < local33; local78++) {
			local42[local35++] = this.aClass114Array4[local78].anInt3455;
		}
		@Pc(101) int local101 = arg2.aClass237Array1 == null ? 0 : arg2.aClass237Array1.length;
		@Pc(106) int[] local106 = new int[local101 * 8];
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < local101; local110++) {
			@Pc(116) Class237 local116 = arg2.aClass237Array1[local110];
			@Pc(121) Class261 local121 = Static194.method3153(local116.anInt6900);
			local106[local108++] = local116.anInt6899;
			local106[local108++] = local121.anInt7628;
			local106[local108++] = local121.anInt7637;
			local106[local108++] = local121.anInt7634;
			local106[local108++] = local121.anInt7633;
			local106[local108++] = local121.anInt7629;
			local106[local108++] = local121.aBoolean497 ? -1 : 0;
		}
		for (@Pc(173) int local173 = 0; local173 < local101; local173++) {
			@Pc(179) Class237 local179 = arg2.aClass237Array1[local173];
			local106[local108++] = local179.anInt6897;
		}
		this.P(this.aW3, this.aG2, arg2.anInt4362, arg2.anInt4364, arg2.anIntArray421, arg2.anIntArray415, arg2.anIntArray420, arg2.anIntArray416, arg2.aShortArray76, arg2.anInt4367, arg2.aShortArray71, arg2.aShortArray75, arg2.aShortArray72, arg2.aByteArray46, arg2.aByteArray48, arg2.aByteArray47, arg2.aByteArray45, arg2.aShortArray67, arg2.aShortArray69, arg2.anIntArray418, arg2.aByte50, arg2.aShortArray68, arg2.anInt4361, arg2.aByteArray51, arg2.aShortArray74, arg2.aShortArray73, arg2.aShortArray70, arg2.anIntArray419, arg2.anIntArray417, arg2.anIntArray413, arg2.aByteArray49, arg2.aByteArray50, arg2.anIntArray414, arg2.anIntArray412, arg2.anIntArray422, local42, local24, local33, arg3, arg4, arg5, arg6, local106);
	}

	@OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lclient!w;)V")
	public xa(@OriginalArg(0) w arg0) {
		this.aW3 = arg0;
		this.aG2 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!xa", name = "EA", descriptor = "(Lclient!i;)Lclient!i;")
	public native Class1_Sub1_Sub10 EA(@OriginalArg(0) Class1_Sub1_Sub10 arg0);

	@OriginalMember(owner = "client!xa", name = "X", descriptor = "(I)V")
	public native void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "P", descriptor = "(Lclient!w;Lclient!g;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void P(@OriginalArg(0) w arg0, @OriginalArg(1) g arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!xa", name = "p", descriptor = "()V")
	public native void p();

	@OriginalMember(owner = "client!xa", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "A", descriptor = "(I)V")
	public native void A(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "KA", descriptor = "()V")
	protected native void KA();

	@OriginalMember(owner = "client!xa", name = "L", descriptor = "()V")
	public native void L();

	@OriginalMember(owner = "client!xa", name = "u", descriptor = "(SS)V")
	public native void u(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!xa", name = "Y", descriptor = "()I")
	public native int Y();

	@OriginalMember(owner = "client!xa", name = "n", descriptor = "(III)V")
	public native void n(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "()V")
	@Override
	public void method6198() {
	}

	@OriginalMember(owner = "client!xa", name = "h", descriptor = "()Z")
	protected native boolean h();

	@OriginalMember(owner = "client!xa", name = "pa", descriptor = "()I")
	public native int pa();

	@OriginalMember(owner = "client!xa", name = "S", descriptor = "()I")
	public native int S();

	@OriginalMember(owner = "client!xa", name = "B", descriptor = "()I")
	public native int B();

	@OriginalMember(owner = "client!xa", name = "D", descriptor = "(I)V")
	public native void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(III)V")
	public native void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!xa", name = "va", descriptor = "(I[IIIIIZ)V")
	protected native void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!xa", name = "oa", descriptor = "(Lclient!w;)V")
	private native void oa(@OriginalArg(0) w arg0);

	@OriginalMember(owner = "client!xa", name = "k", descriptor = "()I")
	public native int k();

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(IILclient!c;Z)Z")
	@Override
	public boolean method6203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) boolean arg3) {
		return this.aW3.method5986().ia(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!xa", name = "W", descriptor = "(I)V")
	public native void W(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "Z", descriptor = "()I")
	public native int Z();

	@OriginalMember(owner = "client!xa", name = "d", descriptor = "()[Lclient!hv;")
	@Override
	public Class114[] method6205() {
		return this.aClass114Array4;
	}

	@OriginalMember(owner = "client!xa", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!xa", name = "da", descriptor = "(IILclient!ya;Lclient!ya;III)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(3) Class96 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!xa", name = "SA", descriptor = "(Lclient!xa;Lclient!xa;IZZ)V")
	public native void SA(@OriginalArg(0) xa arg0, @OriginalArg(1) xa arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lclient!e;IIIZ)V")
	@Override
	public void method6199(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aW3.method5986().s(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!xa", name = "MA", descriptor = "()I")
	public native int MA();

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(ILclient!c;)V")
	public void method6207(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1) {
		@Pc(1) int local1 = arg0;
		@Pc(6) int local6;
		if (this.aClass94Array4 != null) {
			for (local6 = 0; local6 < this.aClass94Array4.length; local6++) {
				@Pc(12) Class94 local12 = this.aClass94Array4[local6];
				local12.anInt2939 = Static440.anIntArray733[local1++];
				local12.anInt2950 = Static440.anIntArray733[local1++];
				local12.anInt2934 = Static440.anIntArray733[local1++];
				local12.anInt2943 = Static440.anIntArray733[local1++];
				local12.anInt2949 = Static440.anIntArray733[local1++];
				local12.anInt2947 = Static440.anIntArray733[local1++];
				local12.anInt2938 = Static440.anIntArray733[local1++];
				local12.anInt2940 = Static440.anIntArray733[local1++];
				local12.anInt2951 = Static440.anIntArray733[local1++];
			}
		}
		if (this.aClass114Array4 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass114Array4.length; local6++) {
			@Pc(83) Class114 local83 = this.aClass114Array4[local6];
			@Pc(85) Class114 local85 = local83;
			if (local83.aClass114_2 != null) {
				local85 = local83.aClass114_2;
			}
			if (local83.aClass40_2 == null) {
				local83.aClass40_2 = arg1.method4576();
			} else {
				local83.aClass40_2.ha(arg1);
			}
			local85.anInt3457 = Static440.anIntArray733[local1++];
			local85.anInt3459 = Static440.anIntArray733[local1++];
			local85.anInt3461 = Static440.anIntArray733[local1++];
		}
	}

	@OriginalMember(owner = "client!xa", name = "q", descriptor = "(SS)V")
	public native void q(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lclient!c;Lclient!tq;II)V")
	@Override
	public void method6195(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class41_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aW3.method5986().LA(this, arg0, null, arg2, 1);
			return;
		}
		Static440.anIntArray729[5] = 0;
		this.aW3.method5986().LA(this, arg0, Static440.anIntArray729, arg2, 1);
		arg1.anInt7135 = Static440.anIntArray729[0];
		arg1.anInt7134 = Static440.anIntArray729[1];
		arg1.anInt7138 = Static440.anIntArray729[2];
		arg1.anInt7136 = Static440.anIntArray729[3];
		arg1.anInt7137 = Static440.anIntArray729[4];
		arg1.aBoolean441 = Static440.anIntArray729[5] != 0;
	}

	@OriginalMember(owner = "client!xa", name = "K", descriptor = "(I)V")
	public native void K(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lclient!c;Lclient!tq;I)V")
	@Override
	public void method6189(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class41_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.aW3.method5986().MA(this, arg0, null, arg2);
			return;
		}
		Static440.anIntArray729[5] = 0;
		this.aW3.method5986().MA(this, arg0, Static440.anIntArray729, arg2);
		arg1.anInt7135 = Static440.anIntArray729[0];
		arg1.anInt7134 = Static440.anIntArray729[1];
		arg1.anInt7138 = Static440.anIntArray729[2];
		arg1.anInt7136 = Static440.anIntArray729[3];
		arg1.anInt7137 = Static440.anIntArray729[4];
		arg1.aBoolean441 = Static440.anIntArray729[5] != 0;
	}

	@OriginalMember(owner = "client!xa", name = "ma", descriptor = "(I)V")
	public native void ma(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xa", name = "ta", descriptor = "()I")
	public native int ta();

	@OriginalMember(owner = "client!xa", name = "za", descriptor = "(IIII)V")
	protected native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static252.method3749(this);
		}
	}

	@OriginalMember(owner = "client!xa", name = "aa", descriptor = "(I[IIIIZI[I)V")
	protected native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!xa", name = "l", descriptor = "()I")
	public native int l();

	@OriginalMember(owner = "client!xa", name = "b", descriptor = "()Z")
	@Override
	public boolean method6200() {
		return true;
	}

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(BIZ)Lclient!e;")
	@Override
	public Class17 method6202(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.aW3.method5986().method3256(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!xa", name = "c", descriptor = "()[Lclient!gh;")
	@Override
	public Class94[] method6201() {
		return this.aClass94Array4;
	}
}
