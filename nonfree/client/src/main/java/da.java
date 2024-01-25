import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class da extends Class55 implements Interface12 {

	@OriginalMember(owner = "client!da", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!da", name = "k", descriptor = "Lclient!ps;")
	private final Class193 aClass193_12 = new Class193();

	@OriginalMember(owner = "client!da", name = "l", descriptor = "Lclient!c;")
	private final c aC1;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!c;Lclient!k;II[[I[[IIII)V")
	public da(@OriginalArg(0) c arg0, @OriginalArg(1) k arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		super(arg2, arg3, arg6);
		this.aC1 = arg0;
		this.GA(this.aC1, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!da", name = "ta", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public native void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method3820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		@Pc(1) boolean local1 = false;
		if (arg9 != null) {
			for (@Pc(7) int local7 = 0; local7 < arg9.length; local7++) {
				@Pc(12) int local12 = arg9[local7];
				if (local12 != -1) {
					local1 = true;
					break;
				}
			}
		}
		@Pc(26) int local26 = arg9.length;
		@Pc(31) int[] local31 = new int[local26 * 3];
		@Pc(36) int[] local36 = new int[local26 * 3];
		@Pc(41) int[] local41 = new int[local26 * 3];
		@Pc(46) int[] local46 = new int[local26 * 3];
		@Pc(51) int[] local51 = new int[local26 * 3];
		@Pc(60) int[] local60 = arg10 == null ? null : new int[local26 * 3];
		@Pc(69) int[] local69 = arg3 == null ? null : new int[local26 * 3];
		@Pc(78) int[] local78 = arg5 == null ? null : new int[local26 * 3];
		@Pc(80) int local80 = 0;
		for (@Pc(82) int local82 = 0; local82 < local26; local82++) {
			@Pc(87) int local87 = arg6[local82];
			@Pc(91) int local91 = arg7[local82];
			@Pc(95) int local95 = arg8[local82];
			local31[local80] = arg2[local87];
			local36[local80] = arg4[local87];
			local41[local80] = arg9[local82];
			local46[local80] = arg11[local82];
			local51[local80] = arg12[local82];
			if (arg10 != null) {
				local60[local80] = arg10[local82];
			}
			if (arg3 != null) {
				local69[local80] = arg3[local87];
			}
			if (arg5 != null) {
				local78[local80] = arg5[local87];
			}
			local80++;
			local31[local80] = arg2[local91];
			local36[local80] = arg4[local91];
			local41[local80] = arg9[local82];
			local46[local80] = arg11[local82];
			local51[local80] = arg12[local82];
			if (arg10 != null) {
				local60[local80] = arg10[local82];
			}
			if (arg3 != null) {
				local69[local80] = arg3[local91];
			}
			if (arg5 != null) {
				local78[local80] = arg5[local91];
			}
			local80++;
			local31[local80] = arg2[local95];
			local36[local80] = arg4[local95];
			local41[local80] = arg9[local82];
			local46[local80] = arg11[local82];
			local51[local80] = arg12[local82];
			if (arg10 != null) {
				local60[local80] = arg10[local82];
			}
			if (arg3 != null) {
				local69[local80] = arg3[local95];
			}
			if (arg5 != null) {
				local78[local80] = arg5[local95];
			}
			local80++;
		}
		if (local1 || local60 != null) {
			this.ta(arg0, arg1, local31, local69, local36, local78, local41, local60, local46, local51, arg13, arg14, arg15, false);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method3816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(1) int local1 = 0;
		@Pc(7) float[] local7 = new float[this.aClass193_12.method4520()];
		for (@Pc(13) Class3_Sub7 local13 = (Class3_Sub7) this.aClass193_12.method4519(); local13 != null; local13 = (Class3_Sub7) this.aClass193_12.method4525()) {
			local7[local1++] = local13.method2479();
		}
		this.DA(local7);
	}

	@OriginalMember(owner = "client!da", name = "R", descriptor = "(II)I")
	public native int R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!da", name = "q", descriptor = "(IILclient!ia;)Lclient!ia;")
	public native Class3_Sub3_Sub9 q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub3_Sub9 arg2);

	@OriginalMember(owner = "client!da", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ia;IIIIZ)Z")
	@Override
	public boolean method3815(@OriginalArg(0) Class3_Sub3_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!be;[I)V")
	@Override
	public void method3818(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass193_12.method4527(arg0);
		this.la(arg0.hashCode(), arg0.method2483(), arg0.method2476(), arg0.method2481(), arg0.method2478(), arg0.method2480(), arg1);
	}

	@OriginalMember(owner = "client!da", name = "H", descriptor = "(Lclient!ia;IIIIZ)V")
	public native void H(@OriginalArg(0) Class3_Sub3_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!da", name = "oa", descriptor = "(II)I")
	public native int oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V")
	@Override
	public void method3814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aC1.method804().ka(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!da", name = "U", descriptor = "()V")
	public native void U();

	@OriginalMember(owner = "client!da", name = "GA", descriptor = "(Lclient!c;Lclient!k;II[[I[[IIII)V")
	private native void GA(@OriginalArg(0) c arg0, @OriginalArg(1) k arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method3813(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		this.aC1.method804().S(this, 0, 0, 1024, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!da", name = "m", descriptor = "(III)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "ia", descriptor = "(Lclient!ia;IIIIZ)V")
	public native void ia(@OriginalArg(0) Class3_Sub3_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!da", name = "la", descriptor = "(IIIIII[I)V")
	private native void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6);

	@OriginalMember(owner = "client!da", name = "DA", descriptor = "([F)V")
	private native void DA(@OriginalArg(0) float[] arg0);

	@OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static115.method1851(this);
		}
	}
}
