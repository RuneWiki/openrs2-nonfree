import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class s extends Class10 implements Interface13 {

	@OriginalMember(owner = "client!s", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "Lclient!bu;")
	private final Class38 aClass38_55 = new Class38();

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!a;")
	private final a anA2;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lclient!a;Lclient!c;II[[I[[IIII)V")
	public s(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		super(arg2, arg3, arg6);
		this.anA2 = arg0;
		this.HA(this.anA2, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6337(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		this.anA2.method164().Y(this, 0, 0, 1024, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!nm;[I)V")
	@Override
	public void method6335(@OriginalArg(0) Class1_Sub27 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass38_55.method1426(arg0);
		this.L(arg0.hashCode(), arg0.method5493(), arg0.method5487(), arg0.method5495(), arg0.method5496(), arg0.method5488(), arg1);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method6334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
			this.IA(arg0, arg1, local31, local69, local36, local78, local41, local60, local46, local51, arg13, arg14, arg15, false);
		}
	}

	@OriginalMember(owner = "client!s", name = "aa", descriptor = "(II)I")
	public native int aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
	@Override
	public void method6333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anA2.method164().k(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!s", name = "HA", descriptor = "(Lclient!a;Lclient!c;II[[I[[IIII)V")
	private native void HA(@OriginalArg(0) a arg0, @OriginalArg(1) c arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!s", name = "FA", descriptor = "([F)V")
	private native void FA(@OriginalArg(0) float[] arg0);

	@OriginalMember(owner = "client!s", name = "NA", descriptor = "(Z)V")
	public native void NA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!s", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static431.method6347(this);
		}
	}

	@OriginalMember(owner = "client!s", name = "X", descriptor = "(IILclient!k;)Lclient!k;")
	public native Class1_Sub1_Sub4 X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub4 arg2);

	@OriginalMember(owner = "client!s", name = "N", descriptor = "()V")
	public native void N();

	@OriginalMember(owner = "client!s", name = "Q", descriptor = "(III)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method6332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(1) int local1 = 0;
		@Pc(7) float[] local7 = new float[this.aClass38_55.method1422()];
		for (@Pc(13) Class1_Sub27 local13 = (Class1_Sub27) this.aClass38_55.method1419(); local13 != null; local13 = (Class1_Sub27) this.aClass38_55.method1415()) {
			local7[local1++] = local13.method5486();
		}
		this.FA(local7);
	}

	@OriginalMember(owner = "client!s", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!k;IIIIZ)Z")
	@Override
	public boolean method6336(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return true;
	}

	@OriginalMember(owner = "client!s", name = "ba", descriptor = "(II)I")
	public native int ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!s", name = "ya", descriptor = "(Lclient!k;IIIIZ)V")
	public native void ya(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!s", name = "F", descriptor = "(Lclient!k;IIIIZ)V")
	public native void F(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!s", name = "L", descriptor = "(IIIIII[I)V")
	private native void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6);
}
