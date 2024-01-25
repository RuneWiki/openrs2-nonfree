import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class s extends Class127 implements Interface17 {

	@OriginalMember(owner = "client!s", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!s", name = "l", descriptor = "Lclient!or;")
	private final Class244 aClass244_59 = new Class244();

	@OriginalMember(owner = "client!s", name = "m", descriptor = "Lclient!l;")
	private final l aL2;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lclient!l;Lclient!m;II[[I[[IIII)V")
	public s(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		super(arg2, arg3, arg6, arg4);
		this.aL2 = arg0;
		this.SA(this.aL2, arg1, arg2, arg3, super.anIntArrayArray102, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!s", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	public native Class3_Sub7_Sub3 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub3 arg2);

	@OriginalMember(owner = "client!s", name = "SA", descriptor = "(Lclient!l;Lclient!m;II[[I[[IIII)V")
	private native void SA(@OriginalArg(0) l arg0, @OriginalArg(1) m arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!s", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static41.method1086(this);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
			this.O(arg0, arg1, local31, local69, local36, local78, local41, local60, local46, local51, arg13, arg14, arg15, false);
		}
	}

	@OriginalMember(owner = "client!s", name = "YA", descriptor = "([F)V")
	private native void YA(@OriginalArg(0) float[] arg0);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!s", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	public native void E(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)V")
	public native void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!s", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!s", name = "BA", descriptor = "()V")
	public native void BA();

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
	@Override
	public void method7868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aL2.method4510().ZA(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7865(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		this.aL2.method4510().la(this, 0, 0, 1024, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	@Override
	public boolean method7863(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return true;
	}

	@OriginalMember(owner = "client!s", name = "VA", descriptor = "(IIIIII[I)V")
	private native void VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6);

	@OriginalMember(owner = "client!s", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	public native void DA(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!cp;[I)V")
	@Override
	public void method7866(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass244_59.method5570(arg0);
		this.VA(arg0.hashCode(), arg0.method5997(), arg0.method5990(), arg0.method5999(), arg0.method6000(), arg0.method5994(), arg1);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(1) int local1 = 0;
		@Pc(7) float[] local7 = new float[this.aClass244_59.method5575()];
		for (@Pc(13) Class3_Sub9 local13 = (Class3_Sub9) this.aClass244_59.method5572(); local13 != null; local13 = (Class3_Sub9) this.aClass244_59.method5576()) {
			local7[local1++] = local13.method5996();
		}
		this.YA(local7);
		for (@Pc(34) int local34 = 0; local34 < arg2 + arg2; local34++) {
			for (@Pc(37) int local37 = 0; local37 < arg2 + arg2; local37++) {
				if (arg3[local34][local37]) {
					@Pc(50) int local50 = arg0 + local34 - arg2;
					@Pc(56) int local56 = arg1 + local37 - arg2;
					if (local50 >= 0 && local50 < super.anInt10004 && local56 >= 0 && local56 < super.anInt10007) {
						this.method7868(local50, local56);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);
}
