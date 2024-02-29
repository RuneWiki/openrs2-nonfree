package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aot")
public class Class92_Sub1_Sub3 extends Class92_Sub1 {

	@OriginalMember(owner = "client!aot", name = "v", descriptor = "Lclient!bl;")
	Class173 aClass173_1;

	@OriginalMember(owner = "client!aot", name = "l", descriptor = "Lclient!aw;")
	Class158 aClass158_1;

	@OriginalMember(owner = "client!aot", name = "y", descriptor = "I")
	int anInt2505 = 0;

	@OriginalMember(owner = "client!aot", name = "w", descriptor = "I")
	int anInt2504 = 0;

	@OriginalMember(owner = "client!aot", name = "c", descriptor = "Lclient!aeh;")
	Class86_Sub2 aClass86_Sub2_12;

	@OriginalMember(owner = "client!aot", name = "<init>", descriptor = "(Lclient!aeh;)V", line = 12)
	Class92_Sub1_Sub3(@OriginalArg(0) Class86_Sub2 arg0) {
		this.aClass86_Sub2_12 = arg0;
	}

	@OriginalMember(owner = "client!aot", name = "p", descriptor = "()I", line = 17)
	@Override
	public int method23491() {
		return this.anInt2505 * -706875759;
	}

	@OriginalMember(owner = "client!aot", name = "w", descriptor = "()I", line = 17)
	@Override
	public int method23497() {
		return this.anInt2505 * -706875759;
	}

	@OriginalMember(owner = "client!aot", name = "c", descriptor = "()I", line = 21)
	@Override
	public int method23493() {
		return this.anInt2504 * -200708425;
	}

	@OriginalMember(owner = "client!aot", name = "t", descriptor = "()I", line = 21)
	@Override
	public int method23498() {
		return this.anInt2504 * -200708425;
	}

	@OriginalMember(owner = "client!aot", name = "q", descriptor = "()I", line = 21)
	@Override
	public int method23499() {
		return this.anInt2504 * -200708425;
	}

	@OriginalMember(owner = "client!aot", name = "f", descriptor = "(ILclient!df;)V", line = 25)
	@Override
	public void method23513(@OriginalArg(0) int arg0, @OriginalArg(1) Interface21 arg1) {
		if (arg0 != 0) {
			throw new RuntimeException();
		}
		@Pc(8) Class158 local8 = (Class158) arg1;
		if (this.aClass173_1 != null && local8 != null && (this.aClass173_1.anInt3292 * 1306524683 != local8.anInt3249 * 351836835 || local8.anInt3248 * -357499107 != this.aClass173_1.anInt3293 * 339609175)) {
			throw new RuntimeException();
		}
		this.aClass158_1 = local8;
		if (local8 != null) {
			this.anInt2505 = local8.anInt3249 * -1758578701;
			this.anInt2504 = local8.anInt3248 * 1183280331;
		} else if (this.aClass173_1 == null) {
			this.anInt2505 = 0;
			this.anInt2504 = 0;
		}
		if (this.aClass86_Sub2_12.method19940() == this) {
			this.method23508();
		}
	}

	@OriginalMember(owner = "client!aot", name = "n", descriptor = "(ILclient!df;)V", line = 25)
	@Override
	public void method23516(@OriginalArg(0) int arg0, @OriginalArg(1) Interface21 arg1) {
		if (arg0 != 0) {
			throw new RuntimeException();
		}
		@Pc(8) Class158 local8 = (Class158) arg1;
		if (this.aClass173_1 != null && local8 != null && (this.aClass173_1.anInt3292 * 1306524683 != local8.anInt3249 * 351836835 || local8.anInt3248 * -357499107 != this.aClass173_1.anInt3293 * 339609175)) {
			throw new RuntimeException();
		}
		this.aClass158_1 = local8;
		if (local8 != null) {
			this.anInt2505 = local8.anInt3249 * -1758578701;
			this.anInt2504 = local8.anInt3248 * 1183280331;
		} else if (this.aClass173_1 == null) {
			this.anInt2505 = 0;
			this.anInt2504 = 0;
		}
		if (this.aClass86_Sub2_12.method19940() == this) {
			this.method23508();
		}
	}

	@OriginalMember(owner = "client!aot", name = "a", descriptor = "(ILclient!df;)V", line = 25)
	@Override
	public void method23517(@OriginalArg(0) int arg0, @OriginalArg(1) Interface21 arg1) {
		if (arg0 != 0) {
			throw new RuntimeException();
		}
		@Pc(8) Class158 local8 = (Class158) arg1;
		if (this.aClass173_1 != null && local8 != null && (this.aClass173_1.anInt3292 * 1306524683 != local8.anInt3249 * 351836835 || local8.anInt3248 * -357499107 != this.aClass173_1.anInt3293 * 339609175)) {
			throw new RuntimeException();
		}
		this.aClass158_1 = local8;
		if (local8 != null) {
			this.anInt2505 = local8.anInt3249 * -1758578701;
			this.anInt2504 = local8.anInt3248 * 1183280331;
		} else if (this.aClass173_1 == null) {
			this.anInt2505 = 0;
			this.anInt2504 = 0;
		}
		if (this.aClass86_Sub2_12.method19940() == this) {
			this.method23508();
		}
	}

	@OriginalMember(owner = "client!aot", name = "m", descriptor = "(ILclient!df;)V", line = 25)
	@Override
	public void method23518(@OriginalArg(0) int arg0, @OriginalArg(1) Interface21 arg1) {
		if (arg0 != 0) {
			throw new RuntimeException();
		}
		@Pc(8) Class158 local8 = (Class158) arg1;
		if (this.aClass173_1 != null && local8 != null && (this.aClass173_1.anInt3292 * 1306524683 != local8.anInt3249 * 351836835 || local8.anInt3248 * -357499107 != this.aClass173_1.anInt3293 * 339609175)) {
			throw new RuntimeException();
		}
		this.aClass158_1 = local8;
		if (local8 != null) {
			this.anInt2505 = local8.anInt3249 * -1758578701;
			this.anInt2504 = local8.anInt3248 * 1183280331;
		} else if (this.aClass173_1 == null) {
			this.anInt2505 = 0;
			this.anInt2504 = 0;
		}
		if (this.aClass86_Sub2_12.method19940() == this) {
			this.method23508();
		}
	}

	@OriginalMember(owner = "client!aot", name = "e", descriptor = "(Lclient!de;)V", line = 41)
	@Override
	public void method23512(@OriginalArg(0) Interface20 arg0) {
		@Pc(2) Class173 local2 = (Class173) arg0;
		if (this.aClass158_1 != null && local2 != null && (this.aClass158_1.anInt3249 * 351836835 != local2.anInt3292 * 1306524683 || this.aClass158_1.anInt3248 * -357499107 != local2.anInt3293 * 339609175)) {
			throw new RuntimeException();
		}
		this.aClass173_1 = local2;
		if (local2 != null) {
			this.anInt2505 = local2.anInt3292 * 2018871003;
			this.anInt2504 = local2.anInt3293 * -1257601695;
		} else if (this.aClass158_1 == null) {
			this.anInt2505 = 0;
			this.anInt2504 = 0;
		}
		if (this.aClass86_Sub2_12.method19940() == this) {
			this.method23508();
		}
	}

	@OriginalMember(owner = "client!aot", name = "h", descriptor = "(Lclient!de;)V", line = 41)
	@Override
	public void method23519(@OriginalArg(0) Interface20 arg0) {
		@Pc(2) Class173 local2 = (Class173) arg0;
		if (this.aClass158_1 != null && local2 != null && (this.aClass158_1.anInt3249 * 351836835 != local2.anInt3292 * 1306524683 || this.aClass158_1.anInt3248 * -357499107 != local2.anInt3293 * 339609175)) {
			throw new RuntimeException();
		}
		this.aClass173_1 = local2;
		if (local2 != null) {
			this.anInt2505 = local2.anInt3292 * 2018871003;
			this.anInt2504 = local2.anInt3293 * -1257601695;
		} else if (this.aClass158_1 == null) {
			this.anInt2505 = 0;
			this.anInt2504 = 0;
		}
		if (this.aClass86_Sub2_12.method19940() == this) {
			this.method23508();
		}
	}

	@OriginalMember(owner = "client!aot", name = "aj", descriptor = "(Lclient!de;)V", line = 41)
	@Override
	public void method23511(@OriginalArg(0) Interface20 arg0) {
		@Pc(2) Class173 local2 = (Class173) arg0;
		if (this.aClass158_1 != null && local2 != null && (this.aClass158_1.anInt3249 * 351836835 != local2.anInt3292 * 1306524683 || this.aClass158_1.anInt3248 * -357499107 != local2.anInt3293 * 339609175)) {
			throw new RuntimeException();
		}
		this.aClass173_1 = local2;
		if (local2 != null) {
			this.anInt2505 = local2.anInt3292 * 2018871003;
			this.anInt2504 = local2.anInt3293 * -1257601695;
		} else if (this.aClass158_1 == null) {
			this.anInt2505 = 0;
			this.anInt2504 = 0;
		}
		if (this.aClass86_Sub2_12.method19940() == this) {
			this.method23508();
		}
	}

	@OriginalMember(owner = "client!aot", name = "ai", descriptor = "(Lclient!de;)V", line = 41)
	@Override
	public void method23520(@OriginalArg(0) Interface20 arg0) {
		@Pc(2) Class173 local2 = (Class173) arg0;
		if (this.aClass158_1 != null && local2 != null && (this.aClass158_1.anInt3249 * 351836835 != local2.anInt3292 * 1306524683 || this.aClass158_1.anInt3248 * -357499107 != local2.anInt3293 * 339609175)) {
			throw new RuntimeException();
		}
		this.aClass173_1 = local2;
		if (local2 != null) {
			this.anInt2505 = local2.anInt3292 * 2018871003;
			this.anInt2504 = local2.anInt3293 * -1257601695;
		} else if (this.aClass158_1 == null) {
			this.anInt2505 = 0;
			this.anInt2504 = 0;
		}
		if (this.aClass86_Sub2_12.method19940() == this) {
			this.method23508();
		}
	}

	@OriginalMember(owner = "client!aot", name = "ag", descriptor = "(Lclient!de;)V", line = 41)
	@Override
	public void method23521(@OriginalArg(0) Interface20 arg0) {
		@Pc(2) Class173 local2 = (Class173) arg0;
		if (this.aClass158_1 != null && local2 != null && (this.aClass158_1.anInt3249 * 351836835 != local2.anInt3292 * 1306524683 || this.aClass158_1.anInt3248 * -357499107 != local2.anInt3293 * 339609175)) {
			throw new RuntimeException();
		}
		this.aClass173_1 = local2;
		if (local2 != null) {
			this.anInt2505 = local2.anInt3292 * 2018871003;
			this.anInt2504 = local2.anInt3293 * -1257601695;
		} else if (this.aClass158_1 == null) {
			this.anInt2505 = 0;
			this.anInt2504 = 0;
		}
		if (this.aClass86_Sub2_12.method19940() == this) {
			this.method23508();
		}
	}

	@OriginalMember(owner = "client!aot", name = "o", descriptor = "()Z", line = 56)
	@Override
	public boolean method23514() {
		return true;
	}

	@OriginalMember(owner = "client!aot", name = "al", descriptor = "()Z", line = 56)
	@Override
	public boolean method23522() {
		return true;
	}

	@OriginalMember(owner = "client!aot", name = "ao", descriptor = "()Z", line = 56)
	@Override
	public boolean method23523() {
		return true;
	}

	@OriginalMember(owner = "client!aot", name = "l", descriptor = "()Z", line = 60)
	@Override
	boolean method23508() {
		this.aClass86_Sub2_12.method4865(this.anInt2505 * -706875759, this.anInt2504 * -200708425, this.aClass158_1 == null ? null : this.aClass158_1.anIntArray300, this.aClass173_1 == null ? null : this.aClass173_1.aFloatArray92);
		return true;
	}

	@OriginalMember(owner = "client!aot", name = "d", descriptor = "()Z", line = 60)
	@Override
	boolean method23492() {
		this.aClass86_Sub2_12.method4865(this.anInt2505 * -706875759, this.anInt2504 * -200708425, this.aClass158_1 == null ? null : this.aClass158_1.anIntArray300, this.aClass173_1 == null ? null : this.aClass173_1.aFloatArray92);
		return true;
	}

	@OriginalMember(owner = "client!aot", name = "s", descriptor = "()Z", line = 60)
	@Override
	boolean method23494() {
		this.aClass86_Sub2_12.method4865(this.anInt2505 * -706875759, this.anInt2504 * -200708425, this.aClass158_1 == null ? null : this.aClass158_1.anIntArray300, this.aClass173_1 == null ? null : this.aClass173_1.aFloatArray92);
		return true;
	}

	@OriginalMember(owner = "client!aot", name = "r", descriptor = "()Z", line = 60)
	@Override
	boolean method23495() {
		this.aClass86_Sub2_12.method4865(this.anInt2505 * -706875759, this.anInt2504 * -200708425, this.aClass158_1 == null ? null : this.aClass158_1.anIntArray300, this.aClass173_1 == null ? null : this.aClass173_1.aFloatArray92);
		return true;
	}

	@OriginalMember(owner = "client!aot", name = "x", descriptor = "()Z", line = 60)
	@Override
	boolean method23500() {
		this.aClass86_Sub2_12.method4865(this.anInt2505 * -706875759, this.anInt2504 * -200708425, this.aClass158_1 == null ? null : this.aClass158_1.anIntArray300, this.aClass173_1 == null ? null : this.aClass173_1.aFloatArray92);
		return true;
	}

	@OriginalMember(owner = "client!aot", name = "y", descriptor = "()Z", line = 65)
	@Override
	boolean method23496() {
		return true;
	}

	@OriginalMember(owner = "client!aot", name = "g", descriptor = "()Z", line = 65)
	@Override
	boolean method23503() {
		return true;
	}

	@OriginalMember(owner = "client!aot", name = "z", descriptor = "()Z", line = 65)
	@Override
	boolean method23504() {
		return true;
	}

	@OriginalMember(owner = "client!aot", name = "j", descriptor = "()Z", line = 65)
	@Override
	boolean method23505() {
		return true;
	}

	@OriginalMember(owner = "client!aot", name = "b", descriptor = "(IIIIIIZZ)V", line = 69)
	@Override
	public void method23515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		@Pc(1) int[] local1 = null;
		@Pc(3) int[] local3 = null;
		@Pc(5) float[] local5 = null;
		@Pc(7) float[] local7 = null;
		if (arg6 && this.aClass158_1 != null) {
			local1 = this.aClass158_1.anIntArray300;
			local3 = this.aClass86_Sub2_12.anIntArray39;
		}
		if (arg7 && this.aClass173_1 != null) {
			local5 = this.aClass173_1.aFloatArray92;
			local7 = this.aClass86_Sub2_12.aFloatArray15;
		}
		Class143_Sub8.method15172(this.anInt2505 * -706875759, this.aClass86_Sub2_12.anInt547 * 356365251, local1, local3, local5, local7, arg0, arg1, arg4, arg5, arg2, arg3);
	}

	@OriginalMember(owner = "client!aot", name = "ak", descriptor = "(IIIIIIZZ)V", line = 69)
	@Override
	public void method23524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		@Pc(1) int[] local1 = null;
		@Pc(3) int[] local3 = null;
		@Pc(5) float[] local5 = null;
		@Pc(7) float[] local7 = null;
		if (arg6 && this.aClass158_1 != null) {
			local1 = this.aClass158_1.anIntArray300;
			local3 = this.aClass86_Sub2_12.anIntArray39;
		}
		if (arg7 && this.aClass173_1 != null) {
			local5 = this.aClass173_1.aFloatArray92;
			local7 = this.aClass86_Sub2_12.aFloatArray15;
		}
		Class143_Sub8.method15172(this.anInt2505 * -706875759, this.aClass86_Sub2_12.anInt547 * 356365251, local1, local3, local5, local7, arg0, arg1, arg4, arg5, arg2, arg3);
	}

	@OriginalMember(owner = "client!aot", name = "au", descriptor = "(IIIIIIZZ)V", line = 69)
	@Override
	public void method23525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		@Pc(1) int[] local1 = null;
		@Pc(3) int[] local3 = null;
		@Pc(5) float[] local5 = null;
		@Pc(7) float[] local7 = null;
		if (arg6 && this.aClass158_1 != null) {
			local1 = this.aClass158_1.anIntArray300;
			local3 = this.aClass86_Sub2_12.anIntArray39;
		}
		if (arg7 && this.aClass173_1 != null) {
			local5 = this.aClass173_1.aFloatArray92;
			local7 = this.aClass86_Sub2_12.aFloatArray15;
		}
		Class143_Sub8.method15172(this.anInt2505 * -706875759, this.aClass86_Sub2_12.anInt547 * 356365251, local1, local3, local5, local7, arg0, arg1, arg4, arg5, arg2, arg3);
	}

	@OriginalMember(owner = "client!aot", name = "ar", descriptor = "(II[I[I[F[FIIIIII)V", line = 85)
	static void method18117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		@Pc(5) int local5 = arg7 * arg0 + arg6;
		@Pc(11) int local11 = arg8 + arg9 * arg1;
		@Pc(15) int local15 = arg0 - arg10;
		@Pc(19) int local19 = arg1 - arg10;
		@Pc(23) int local23;
		@Pc(30) int local30;
		if (arg2 == null) {
			for (local23 = 0; local23 < arg11; local23++) {
				local30 = local5 + arg10;
				while (local5 < local30) {
					arg5[local11++] = arg4[local5++];
				}
				local5 += local15;
				local11 += local19;
			}
		} else if (arg4 == null) {
			for (local23 = 0; local23 < arg11; local23++) {
				local30 = local5 + arg10;
				while (local5 < local30) {
					arg3[local11++] = arg2[local5++];
				}
				local5 += local15;
				local11 += local19;
			}
		} else {
			for (local23 = 0; local23 < arg11; local23++) {
				local30 = local5 + arg10;
				while (local5 < local30) {
					arg3[local11] = arg2[local5];
					arg5[local11++] = arg4[local5++];
				}
				local5 += local15;
				local11 += local19;
			}
		}
	}

	@OriginalMember(owner = "client!aot", name = "i", descriptor = "()V", line = 122)
	@Override
	public void method23502() {
	}

	@OriginalMember(owner = "client!aot", name = "v", descriptor = "()V", line = 122)
	@Override
	public void method23506() {
	}

	@OriginalMember(owner = "client!aot", name = "k", descriptor = "()V", line = 122)
	@Override
	public void method23507() {
	}

	@OriginalMember(owner = "client!aot", name = "u", descriptor = "()V", line = 122)
	@Override
	public void method23501() {
	}
}
