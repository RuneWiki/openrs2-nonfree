import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ya")
public final class ya extends Class60 implements Interface9 {

	@OriginalMember(owner = "client!ya", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ya", name = "g", descriptor = "Lclient!rh;")
	private final Class275 aClass275_204 = new Class275();

	@OriginalMember(owner = "client!ya", name = "h", descriptor = "Lclient!da;")
	private final da aDa3;

	@OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(Lclient!da;Lclient!a;II[[I[[IIII)V")
	public ya(@OriginalArg(0) da arg0, @OriginalArg(1) a arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		super(arg2, arg3, arg6);
		this.aDa3 = arg0;
		this.j(this.aDa3, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!ya", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public native void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!hj;[I)V")
	@Override
	public void method7893(@OriginalArg(0) Class6_Sub7 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass275_204.method6370(arg0);
		this.T(arg0.hashCode(), arg0.method3490(), arg0.method3493(), arg0.method3492(), arg0.method3487(), arg0.method3486(), arg1);
	}

	@OriginalMember(owner = "client!ya", name = "aa", descriptor = "(Lclient!w;IIIIZ)V")
	public native void aa(@OriginalArg(0) Class6_Sub1_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(II)V")
	@Override
	public void method7892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aDa3.method1141().ma(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(IILclient!w;)Lclient!w;")
	public native Class6_Sub1_Sub12 c(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub1_Sub12 arg2);

	@OriginalMember(owner = "client!ya", name = "ba", descriptor = "()V")
	public native void ba();

	@OriginalMember(owner = "client!ya", name = "FA", descriptor = "(Lclient!w;IIIIZ)V")
	public native void FA(@OriginalArg(0) Class6_Sub1_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!ya", name = "sa", descriptor = "(II)I")
	public native int sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "EA", descriptor = "(III)V")
	public native void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
			this.BA(arg0, arg1, local31, local69, local36, local78, local41, local60, local46, local51, arg13, arg14, arg15, false);
		}
	}

	@OriginalMember(owner = "client!ya", name = "j", descriptor = "(Lclient!da;Lclient!a;II[[I[[IIII)V")
	private native void j(@OriginalArg(0) da arg0, @OriginalArg(1) a arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!ya", name = "H", descriptor = "(Z)V")
	public native void H(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static211.method3132(this);
		}
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(1) int local1 = 0;
		@Pc(7) float[] local7 = new float[this.aClass275_204.method6361()];
		for (@Pc(13) Class6_Sub7 local13 = (Class6_Sub7) this.aClass275_204.method6366(); local13 != null; local13 = (Class6_Sub7) this.aClass275_204.method6364()) {
			local7[local1++] = local13.method3491();
		}
		this.RA(local7);
	}

	@OriginalMember(owner = "client!ya", name = "JA", descriptor = "(II)I")
	public native int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7894(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		this.aDa3.method1141().J(this, 0, 0, 1024, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!w;IIIIZ)Z")
	@Override
	public boolean method7890(@OriginalArg(0) Class6_Sub1_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return true;
	}

	@OriginalMember(owner = "client!ya", name = "T", descriptor = "(IIIIII[I)V")
	private native void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6);

	@OriginalMember(owner = "client!ya", name = "RA", descriptor = "([F)V")
	private native void RA(@OriginalArg(0) float[] arg0);
}
