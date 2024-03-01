package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aab")
public class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!aab", name = "r", descriptor = "I")
	final int anInt2029;

	@OriginalMember(owner = "client!aab", name = "d", descriptor = "I")
	final int anInt2028;

	@OriginalMember(owner = "client!aab", name = "<init>", descriptor = "(Lclient!abt;ILclient!cw;Lclient!dj;II)V", line = 12)
	Class4_Sub1(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4 * arg5, false);
		this.anInt2029 = arg4;
		this.anInt2028 = arg5;
		this.aClass21_Sub2_47.method4074(this);
		OpenGL.glTexImage2Dub(this.anInt5560, 0, Class21_Sub2.method4240(this.aClass121_28, this.aClass127_33), arg4, arg5, 0, Class21_Sub2.method4149(this.aClass121_28), 5121, null, 0);
		this.method33712(true);
	}

	@OriginalMember(owner = "client!aab", name = "<init>", descriptor = "(Lclient!abt;IIIII)V", line = 21)
	Class4_Sub1(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, Class121.aClass121_18, Class127.aClass127_23, arg4 * arg5, false);
		this.anInt2029 = arg4;
		this.anInt2028 = arg5;
		this.aClass21_Sub2_47.method4074(this);
		@Pc(24) Class19 local24 = this.aClass21_Sub2_47.method17037();
		if (local24 != null) {
			@Pc(33) int local33 = local24.method21391() - (arg3 + arg5);
			@Pc(39) int local39 = Class21_Sub2.method4240(this.aClass121_28, this.aClass127_33);
			OpenGL.glCopyTexImage2D(this.anInt5560, 0, local39, arg2, local33, arg4, arg5, 0);
		}
		this.method33712(true);
	}

	@OriginalMember(owner = "client!aab", name = "<init>", descriptor = "(Lclient!abt;IIIZ[IIIZ)V", line = 35)
	Class4_Sub1(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, Class121.aClass121_17, Class127.aClass127_23, arg2 * arg3, arg4);
		this.anInt2029 = arg2;
		this.anInt2028 = arg3;
		if (arg8) {
			@Pc(21) int[] local21 = new int[arg5.length];
			for (@Pc(23) int local23 = 0; local23 < arg3; local23++) {
				@Pc(30) int local30 = local23 * arg2;
				@Pc(38) int local38 = (arg3 - local23 - 1) * arg2;
				for (@Pc(40) int local40 = 0; local40 < arg2; local40++) {
					local21[local30++] = arg5[local38++];
				}
			}
			arg5 = local21;
		}
		this.aClass21_Sub2_47.method4074(this);
		if (this.anInt5560 != 34037 && arg4 && arg6 == 0 && arg7 == 0) {
			method33721(this.anInt5560, Class21_Sub2.method4240(this.aClass121_28, this.aClass127_33), this.anInt2029, this.anInt2028, 32993, this.aClass21_Sub2_47.anInt451, arg5);
			this.method33715(true);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(this.anInt5560, 0, Class21_Sub2.method4240(this.aClass121_28, this.aClass127_33), this.anInt2029, this.anInt2028, 0, 32993, this.aClass21_Sub2_47.anInt451, arg5, arg7 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method33715(false);
		}
		this.method33712(true);
	}

	@OriginalMember(owner = "client!aab", name = "<init>", descriptor = "(Lclient!abt;ILclient!cw;Lclient!dj;IIZ[BLclient!cw;Z)V", line = 64)
	Class4_Sub1(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(8) Class121 arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg3, arg4 * arg5, arg6);
		this.anInt2029 = arg4;
		this.anInt2028 = arg5;
		if (arg9) {
			@Pc(21) byte[] local21 = new byte[arg7.length];
			for (@Pc(23) int local23 = 0; local23 < arg5; local23++) {
				@Pc(30) int local30 = local23 * arg4;
				@Pc(38) int local38 = (arg5 - local23 - 1) * arg4;
				for (@Pc(40) int local40 = 0; local40 < arg4; local40++) {
					local21[local30++] = arg7[local38++];
				}
			}
			arg7 = local21;
		}
		this.aClass21_Sub2_47.method4074(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg6 && this.anInt5560 != 34037) {
			method33722(arg1, Class21_Sub2.method4240(this.aClass121_28, this.aClass127_33), arg4, arg5, arg8, arg7);
			this.method33715(true);
		} else {
			OpenGL.glTexImage2Dub(this.anInt5560, 0, Class21_Sub2.method4240(this.aClass121_28, this.aClass127_33), this.anInt2029, this.anInt2028, 0, Class21_Sub2.method4149(arg8), 5121, arg7, 0);
			this.method33715(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method33712(true);
	}

	@OriginalMember(owner = "client!aab", name = "<init>", descriptor = "(Lclient!abt;ILclient!cw;Lclient!dj;IIZ[FLclient!cw;)V", line = 93)
	Class4_Sub1(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) Class121 arg8) {
		super(arg0, arg1, arg2, arg3, arg4 * arg5, arg6);
		this.anInt2029 = arg4;
		this.anInt2028 = arg5;
		this.aClass21_Sub2_47.method4074(this);
		if (arg6 && this.anInt5560 != 34037) {
			method33723(arg1, Class21_Sub2.method4240(this.aClass121_28, this.aClass127_33), arg4, arg5, arg8, arg7);
			this.method33715(true);
		} else {
			OpenGL.glTexImage2Df(this.anInt5560, 0, Class21_Sub2.method4240(this.aClass121_28, this.aClass127_33), this.anInt2029, this.anInt2028, 0, Class21_Sub2.method4149(arg8), 5126, arg7, 0);
			this.method33715(false);
		}
		this.method33712(true);
	}

	@OriginalMember(owner = "client!aab", name = "an", descriptor = "(ZZ)V", line = 109)
	void method14074(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (this.anInt5560 == 3553) {
			this.aClass21_Sub2_47.method4074(this);
			OpenGL.glTexParameteri(this.anInt5560, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(this.anInt5560, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!aab", name = "az", descriptor = "(ZZ)V", line = 109)
	void method14080(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (this.anInt5560 == 3553) {
			this.aClass21_Sub2_47.method4074(this);
			OpenGL.glTexParameteri(this.anInt5560, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(this.anInt5560, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!aab", name = "ax", descriptor = "(ZZ)V", line = 109)
	void method14086(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (this.anInt5560 == 3553) {
			this.aClass21_Sub2_47.method4074(this);
			OpenGL.glTexParameteri(this.anInt5560, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(this.anInt5560, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!aab", name = "aj", descriptor = "(IIII[BLclient!cw;IIZ)V", line = 117)
	void method14072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class121 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		if (arg7 == 0) {
			arg7 = arg2;
		}
		if (arg8) {
			@Pc(10) int local10 = arg5.anInt3211 * 1629489977;
			@Pc(14) int local14 = local10 * arg2;
			@Pc(18) int local18 = local10 * arg7;
			@Pc(23) byte[] local23 = new byte[local14 * arg3];
			for (@Pc(25) int local25 = 0; local25 < arg3; local25++) {
				@Pc(32) int local32 = local25 * local14;
				@Pc(42) int local42 = (arg3 - local25 - 1) * local18 + arg6;
				for (@Pc(44) int local44 = 0; local44 < local14; local44++) {
					local23[local32++] = arg4[local42++];
				}
			}
			arg4 = local23;
		}
		this.aClass21_Sub2_47.method4074(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, arg7);
		}
		OpenGL.glTexSubImage2Dub(this.anInt5560, 0, arg0, this.anInt2028 - arg1 - arg3, arg2, arg3, Class21_Sub2.method4149(arg5), 5121, arg4, arg6);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!aab", name = "al", descriptor = "(IIII[BLclient!cw;IIZ)V", line = 117)
	void method14081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class121 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		if (arg7 == 0) {
			arg7 = arg2;
		}
		if (arg8) {
			@Pc(10) int local10 = arg5.anInt3211 * 1629489977;
			@Pc(14) int local14 = local10 * arg2;
			@Pc(18) int local18 = local10 * arg7;
			@Pc(23) byte[] local23 = new byte[local14 * arg3];
			for (@Pc(25) int local25 = 0; local25 < arg3; local25++) {
				@Pc(32) int local32 = local25 * local14;
				@Pc(42) int local42 = (arg3 - local25 - 1) * local18 + arg6;
				for (@Pc(44) int local44 = 0; local44 < local14; local44++) {
					local23[local32++] = arg4[local42++];
				}
			}
			arg4 = local23;
		}
		this.aClass21_Sub2_47.method4074(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, arg7);
		}
		OpenGL.glTexSubImage2Dub(this.anInt5560, 0, arg0, this.anInt2028 - arg1 - arg3, arg2, arg3, Class21_Sub2.method4149(arg5), 5121, arg4, arg6);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!aab", name = "ao", descriptor = "(IIII[BLclient!cw;IIZ)V", line = 117)
	void method14089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class121 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		if (arg7 == 0) {
			arg7 = arg2;
		}
		if (arg8) {
			@Pc(10) int local10 = arg5.anInt3211 * 1629489977;
			@Pc(14) int local14 = local10 * arg2;
			@Pc(18) int local18 = local10 * arg7;
			@Pc(23) byte[] local23 = new byte[local14 * arg3];
			for (@Pc(25) int local25 = 0; local25 < arg3; local25++) {
				@Pc(32) int local32 = local25 * local14;
				@Pc(42) int local42 = (arg3 - local25 - 1) * local18 + arg6;
				for (@Pc(44) int local44 = 0; local44 < local14; local44++) {
					local23[local32++] = arg4[local42++];
				}
			}
			arg4 = local23;
		}
		this.aClass21_Sub2_47.method4074(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, arg7);
		}
		OpenGL.glTexSubImage2Dub(this.anInt5560, 0, arg0, this.anInt2028 - arg1 - arg3, arg2, arg3, Class21_Sub2.method4149(arg5), 5121, arg4, arg6);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!aab", name = "ap", descriptor = "(IIII[IIIZ)V", line = 141)
	void method14073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (arg6 == 0) {
			arg6 = arg2;
		}
		if (arg7) {
			@Pc(10) int[] local10 = new int[arg2 * arg3];
			for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
				@Pc(19) int local19 = local12 * arg2;
				@Pc(29) int local29 = (arg3 - local12 - 1) * arg6 + arg5;
				for (@Pc(31) int local31 = 0; local31 < arg2; local31++) {
					local10[local19++] = arg4[local29++];
				}
			}
			arg4 = local10;
		}
		this.aClass21_Sub2_47.method4074(this);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, arg6);
		}
		OpenGL.glTexSubImage2Di(this.anInt5560, 0, arg0, this.anInt2028 - arg1 - arg3, arg2, arg3, 32993, this.aClass21_Sub2_47.anInt451, arg4, arg5);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!aab", name = "as", descriptor = "(IIII[IIIZ)V", line = 141)
	void method14075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (arg6 == 0) {
			arg6 = arg2;
		}
		if (arg7) {
			@Pc(10) int[] local10 = new int[arg2 * arg3];
			for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
				@Pc(19) int local19 = local12 * arg2;
				@Pc(29) int local29 = (arg3 - local12 - 1) * arg6 + arg5;
				for (@Pc(31) int local31 = 0; local31 < arg2; local31++) {
					local10[local19++] = arg4[local29++];
				}
			}
			arg4 = local10;
		}
		this.aClass21_Sub2_47.method4074(this);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, arg6);
		}
		OpenGL.glTexSubImage2Di(this.anInt5560, 0, arg0, this.anInt2028 - arg1 - arg3, arg2, arg3, 32993, this.aClass21_Sub2_47.anInt451, arg4, arg5);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!aab", name = "ab", descriptor = "(IIII[IIIZ)V", line = 141)
	void method14084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (arg6 == 0) {
			arg6 = arg2;
		}
		if (arg7) {
			@Pc(10) int[] local10 = new int[arg2 * arg3];
			for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
				@Pc(19) int local19 = local12 * arg2;
				@Pc(29) int local29 = (arg3 - local12 - 1) * arg6 + arg5;
				for (@Pc(31) int local31 = 0; local31 < arg2; local31++) {
					local10[local19++] = arg4[local29++];
				}
			}
			arg4 = local10;
		}
		this.aClass21_Sub2_47.method4074(this);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, arg6);
		}
		OpenGL.glTexSubImage2Di(this.anInt5560, 0, arg0, this.anInt2028 - arg1 - arg3, arg2, arg3, 32993, this.aClass21_Sub2_47.anInt451, arg4, arg5);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!aab", name = "au", descriptor = "(IIII[IIIZ)V", line = 141)
	void method14085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (arg6 == 0) {
			arg6 = arg2;
		}
		if (arg7) {
			@Pc(10) int[] local10 = new int[arg2 * arg3];
			for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
				@Pc(19) int local19 = local12 * arg2;
				@Pc(29) int local29 = (arg3 - local12 - 1) * arg6 + arg5;
				for (@Pc(31) int local31 = 0; local31 < arg2; local31++) {
					local10[local19++] = arg4[local29++];
				}
			}
			arg4 = local10;
		}
		this.aClass21_Sub2_47.method4074(this);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, arg6);
		}
		OpenGL.glTexSubImage2Di(this.anInt5560, 0, arg0, this.anInt2028 - arg1 - arg3, arg2, arg3, 32993, this.aClass21_Sub2_47.anInt451, arg4, arg5);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!aab", name = "ay", descriptor = "(IIIIII)V", line = 160)
	void method14071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) Class19 local4 = this.aClass21_Sub2_47.method17037();
		if (local4 != null) {
			@Pc(13) int local13 = local4.method21391() - (arg5 + arg3);
			this.aClass21_Sub2_47.method4074(this);
			OpenGL.glCopyTexSubImage2D(this.anInt5560, 0, arg0, this.anInt2028 - (arg1 + arg3), arg4, local13, arg2, arg3);
			OpenGL.glFlush();
		}
	}

	@OriginalMember(owner = "client!aab", name = "ai", descriptor = "(IIIIII)V", line = 160)
	void method14076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) Class19 local4 = this.aClass21_Sub2_47.method17037();
		if (local4 != null) {
			@Pc(13) int local13 = local4.method21391() - (arg5 + arg3);
			this.aClass21_Sub2_47.method4074(this);
			OpenGL.glCopyTexSubImage2D(this.anInt5560, 0, arg0, this.anInt2028 - (arg1 + arg3), arg4, local13, arg2, arg3);
			OpenGL.glFlush();
		}
	}

	@OriginalMember(owner = "client!aab", name = "ae", descriptor = "(IIIIII)V", line = 160)
	void method14083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) Class19 local4 = this.aClass21_Sub2_47.method17037();
		if (local4 != null) {
			@Pc(13) int local13 = local4.method21391() - (arg5 + arg3);
			this.aClass21_Sub2_47.method4074(this);
			OpenGL.glCopyTexSubImage2D(this.anInt5560, 0, arg0, this.anInt2028 - (arg1 + arg3), arg4, local13, arg2, arg3);
			OpenGL.glFlush();
		}
	}

	@OriginalMember(owner = "client!aab", name = "ag", descriptor = "(IIIIII)V", line = 160)
	void method14087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) Class19 local4 = this.aClass21_Sub2_47.method17037();
		if (local4 != null) {
			@Pc(13) int local13 = local4.method21391() - (arg5 + arg3);
			this.aClass21_Sub2_47.method4074(this);
			OpenGL.glCopyTexSubImage2D(this.anInt5560, 0, arg0, this.anInt2028 - (arg1 + arg3), arg4, local13, arg2, arg3);
			OpenGL.glFlush();
		}
	}

	@OriginalMember(owner = "client!aab", name = "am", descriptor = "(IIIIII)V", line = 160)
	void method14088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) Class19 local4 = this.aClass21_Sub2_47.method17037();
		if (local4 != null) {
			@Pc(13) int local13 = local4.method21391() - (arg5 + arg3);
			this.aClass21_Sub2_47.method4074(this);
			OpenGL.glCopyTexSubImage2D(this.anInt5560, 0, arg0, this.anInt2028 - (arg1 + arg3), arg4, local13, arg2, arg3);
			OpenGL.glFlush();
		}
	}

	@OriginalMember(owner = "client!aab", name = "ad", descriptor = "(IIIIII)V", line = 160)
	void method14090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) Class19 local4 = this.aClass21_Sub2_47.method17037();
		if (local4 != null) {
			@Pc(13) int local13 = local4.method21391() - (arg5 + arg3);
			this.aClass21_Sub2_47.method4074(this);
			OpenGL.glCopyTexSubImage2D(this.anInt5560, 0, arg0, this.anInt2028 - (arg1 + arg3), arg4, local13, arg2, arg3);
			OpenGL.glFlush();
		}
	}

	@OriginalMember(owner = "client!aab", name = "aw", descriptor = "(IIIIII)V", line = 160)
	void method14091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) Class19 local4 = this.aClass21_Sub2_47.method17037();
		if (local4 != null) {
			@Pc(13) int local13 = local4.method21391() - (arg5 + arg3);
			this.aClass21_Sub2_47.method4074(this);
			OpenGL.glCopyTexSubImage2D(this.anInt5560, 0, arg0, this.anInt2028 - (arg1 + arg3), arg4, local13, arg2, arg3);
			OpenGL.glFlush();
		}
	}

	@OriginalMember(owner = "client!aab", name = "ar", descriptor = "(IIIIII)V", line = 160)
	void method14096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) Class19 local4 = this.aClass21_Sub2_47.method17037();
		if (local4 != null) {
			@Pc(13) int local13 = local4.method21391() - (arg5 + arg3);
			this.aClass21_Sub2_47.method4074(this);
			OpenGL.glCopyTexSubImage2D(this.anInt5560, 0, arg0, this.anInt2028 - (arg1 + arg3), arg4, local13, arg2, arg3);
			OpenGL.glFlush();
		}
	}

	@OriginalMember(owner = "client!aab", name = "aq", descriptor = "(I)Lclient!dr;", line = 170)
	Interface13 method14077(@OriginalArg(0) int arg0) {
		return new Class114(this, arg0);
	}

	@OriginalMember(owner = "client!aab", name = "ac", descriptor = "(I)Lclient!dr;", line = 170)
	Interface13 method14092(@OriginalArg(0) int arg0) {
		return new Class114(this, arg0);
	}

	@OriginalMember(owner = "client!aab", name = "av", descriptor = "(I)Lclient!da;", line = 174)
	Interface10 method14078(@OriginalArg(0) int arg0) {
		return new Class114(this, arg0);
	}

	@OriginalMember(owner = "client!aab", name = "bd", descriptor = "(I)Lclient!da;", line = 174)
	Interface10 method14079(@OriginalArg(0) int arg0) {
		return new Class114(this, arg0);
	}

	@OriginalMember(owner = "client!aab", name = "bm", descriptor = "(I)Lclient!da;", line = 174)
	Interface10 method14082(@OriginalArg(0) int arg0) {
		return new Class114(this, arg0);
	}

	@OriginalMember(owner = "client!aab", name = "bw", descriptor = "(I)Lclient!da;", line = 174)
	Interface10 method14093(@OriginalArg(0) int arg0) {
		return new Class114(this, arg0);
	}

	@OriginalMember(owner = "client!aab", name = "bp", descriptor = "(I)Lclient!da;", line = 174)
	Interface10 method14094(@OriginalArg(0) int arg0) {
		return new Class114(this, arg0);
	}

	@OriginalMember(owner = "client!aab", name = "bs", descriptor = "(I)Lclient!da;", line = 174)
	Interface10 method14095(@OriginalArg(0) int arg0) {
		return new Class114(this, arg0);
	}
}
