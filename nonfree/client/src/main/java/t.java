import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class t extends Class259 implements Interface6 {

	@OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!t", name = "k", descriptor = "Lclient!sja;")
	private final Class342 aClass342_74 = new Class342();

	@OriginalMember(owner = "client!t", name = "j", descriptor = "I")
	private int anInt9211 = -1;

	@OriginalMember(owner = "client!t", name = "l", descriptor = "Lclient!oa;")
	private final oa anOa3;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;II[[I[[IIII)V")
	public t(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		super(arg2, arg3, arg6, arg4);
		this.anOa3 = arg0;
		this.ga(this.anOa3, arg1, arg2, arg3, super.anIntArrayArray68, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!t", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public native void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method9297(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return true;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method9293(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		this.anOa3.method6204().method10(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!t", name = "ga", descriptor = "(Lclient!oa;Lclient!ya;II[[I[[IIII)V")
	private native void ga(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!t", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	public native Class3_Sub7_Sub17 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub17 arg2);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!jw;[I)V")
	@Override
	public void method9296(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass342_74.method7654(arg0);
		this.V(arg0.hashCode(), arg0.method7174(), arg0.method7175(), arg0.method7177(), arg0.method7173(), arg0.method7172(), arg1);
	}

	@OriginalMember(owner = "client!t", name = "ka", descriptor = "(III)V")
	public native void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!t", name = "V", descriptor = "(IIIIII[I)V")
	private native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6);

	@OriginalMember(owner = "client!t", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	public native void wa(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static199.method3055(this);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method9300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt9211 = arg5;
		@Pc(4) int local4 = 0;
		@Pc(10) float[] local10 = new float[this.aClass342_74.method7647()];
		for (@Pc(16) Class3_Sub5 local16 = (Class3_Sub5) this.aClass342_74.method7644(); local16 != null; local16 = (Class3_Sub5) this.aClass342_74.method7650()) {
			local10[local4++] = local16.method7176();
		}
		this.q(local10);
		for (@Pc(37) int local37 = 0; local37 < arg2 + arg2; local37++) {
			for (@Pc(40) int local40 = 0; local40 < arg2 + arg2; local40++) {
				if (arg3[local37][local40]) {
					@Pc(53) int local53 = arg0 + local37 - arg2;
					@Pc(59) int local59 = arg1 + local40 - arg2;
					if (local53 >= 0 && local53 < super.anInt10949 && local59 >= 0 && local59 < super.anInt10946) {
						this.method9298(local53, local59);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method9292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
			this.U(arg0, arg1, local31, local69, local36, local78, local41, local60, local46, local51, arg13, arg14, arg15, false);
		}
	}

	@OriginalMember(owner = "client!t", name = "YA", descriptor = "()V")
	public native void YA();

	@OriginalMember(owner = "client!t", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	public native void CA(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!t", name = "q", descriptor = "([F)V")
	private native void q(@OriginalArg(0) float[] arg0);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method9301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.anInt9211 = -1;
		@Pc(4) int local4 = 0;
		@Pc(10) float[] local10 = new float[this.aClass342_74.method7647()];
		for (@Pc(16) Class3_Sub5 local16 = (Class3_Sub5) this.aClass342_74.method7644(); local16 != null; local16 = (Class3_Sub5) this.aClass342_74.method7650()) {
			local10[local4++] = local16.method7176();
		}
		this.q(local10);
		for (@Pc(37) int local37 = 0; local37 < arg2 + arg2; local37++) {
			for (@Pc(40) int local40 = 0; local40 < arg2 + arg2; local40++) {
				if (arg3[local37][local40]) {
					@Pc(53) int local53 = arg0 + local37 - arg2;
					@Pc(59) int local59 = arg1 + local40 - arg2;
					if (local53 >= 0 && local53 < super.anInt10949 && local59 >= 0 && local59 < super.anInt10946) {
						this.method9298(local53, local59);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V")
	@Override
	public void method9298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt9211 < 0) {
			this.anOa3.method6204().method7(this, arg0, arg1);
		} else {
			this.anOa3.method6204().method5(this, arg0, arg1, this.anInt9211);
		}
	}
}
