package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adi")
public class Class78_Sub2 extends Class78 {

	@OriginalMember(owner = "client!adi", name = "i", descriptor = "I")
	final int anInt2412;

	@OriginalMember(owner = "client!adi", name = "k", descriptor = "I")
	final int anInt2413;

	@OriginalMember(owner = "client!adi", name = "<init>", descriptor = "(Lclient!aeq;ILclient!dt;Lclient!dl;II)V", line = 12)
	Class78_Sub2(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class212 arg2, @OriginalArg(3) Class206 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4 * arg5, false);
		this.anInt2412 = arg4;
		this.anInt2413 = arg5;
		this.aClass86_Sub3_31.method6195(this);
		OpenGL.glTexImage2Dub(this.anInt2408, 0, Class86_Sub3.method6292(this.aClass212_16, this.aClass206_17), arg4, arg5, 0, Class86_Sub3.method6289(this.aClass212_16), 5121, null, 0);
		this.method17453(true);
	}

	@OriginalMember(owner = "client!adi", name = "<init>", descriptor = "(Lclient!aeq;IIIII)V", line = 21)
	Class78_Sub2(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, Class212.aClass212_24, Class206.aClass206_23, arg4 * arg5, false);
		this.anInt2412 = arg4;
		this.anInt2413 = arg5;
		this.aClass86_Sub3_31.method6195(this);
		@Pc(24) Class92 local24 = this.aClass86_Sub3_31.method19940();
		if (local24 != null) {
			@Pc(33) int local33 = local24.method23493() - (arg3 + arg5);
			@Pc(39) int local39 = Class86_Sub3.method6292(this.aClass212_16, this.aClass206_17);
			OpenGL.glCopyTexImage2D(this.anInt2408, 0, local39, arg2, local33, arg4, arg5, 0);
		}
		this.method17453(true);
	}

	@OriginalMember(owner = "client!adi", name = "<init>", descriptor = "(Lclient!aeq;IIIZ[IIIZ)V", line = 35)
	Class78_Sub2(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, Class212.aClass212_18, Class206.aClass206_23, arg2 * arg3, arg4);
		this.anInt2412 = arg2;
		this.anInt2413 = arg3;
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
		this.aClass86_Sub3_31.method6195(this);
		if (this.anInt2408 != 34037 && arg4 && arg6 == 0 && arg7 == 0) {
			method17483(this.anInt2408, Class86_Sub3.method6292(this.aClass212_16, this.aClass206_17), this.anInt2412, this.anInt2413, 32993, this.aClass86_Sub3_31.anInt685, arg5);
			this.method17462(true);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(this.anInt2408, 0, Class86_Sub3.method6292(this.aClass212_16, this.aClass206_17), this.anInt2412, this.anInt2413, 0, 32993, this.aClass86_Sub3_31.anInt685, arg5, arg7 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method17462(false);
		}
		this.method17453(true);
	}

	@OriginalMember(owner = "client!adi", name = "<init>", descriptor = "(Lclient!aeq;ILclient!dt;Lclient!dl;IIZ[BLclient!dt;Z)V", line = 64)
	Class78_Sub2(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class212 arg2, @OriginalArg(3) Class206 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(8) Class212 arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg3, arg4 * arg5, arg6);
		this.anInt2412 = arg4;
		this.anInt2413 = arg5;
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
		this.aClass86_Sub3_31.method6195(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg6 && this.anInt2408 != 34037) {
			method17486(arg1, Class86_Sub3.method6292(this.aClass212_16, this.aClass206_17), arg4, arg5, arg8, arg7);
			this.method17462(true);
		} else {
			OpenGL.glTexImage2Dub(this.anInt2408, 0, Class86_Sub3.method6292(this.aClass212_16, this.aClass206_17), this.anInt2412, this.anInt2413, 0, Class86_Sub3.method6289(arg8), 5121, arg7, 0);
			this.method17462(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method17453(true);
	}

	@OriginalMember(owner = "client!adi", name = "<init>", descriptor = "(Lclient!aeq;ILclient!dt;Lclient!dl;IIZ[FLclient!dt;)V", line = 93)
	Class78_Sub2(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class212 arg2, @OriginalArg(3) Class206 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) Class212 arg8) {
		super(arg0, arg1, arg2, arg3, arg4 * arg5, arg6);
		this.anInt2412 = arg4;
		this.anInt2413 = arg5;
		this.aClass86_Sub3_31.method6195(this);
		if (arg6 && this.anInt2408 != 34037) {
			method17489(arg1, Class86_Sub3.method6292(this.aClass212_16, this.aClass206_17), arg4, arg5, arg8, arg7);
			this.method17462(true);
		} else {
			OpenGL.glTexImage2Df(this.anInt2408, 0, Class86_Sub3.method6292(this.aClass212_16, this.aClass206_17), this.anInt2412, this.anInt2413, 0, Class86_Sub3.method6289(arg8), 5126, arg7, 0);
			this.method17462(false);
		}
		this.method17453(true);
	}

	@OriginalMember(owner = "client!adi", name = "av", descriptor = "(ZZ)V", line = 109)
	void method17493(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (this.anInt2408 == 3553) {
			this.aClass86_Sub3_31.method6195(this);
			OpenGL.glTexParameteri(this.anInt2408, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(this.anInt2408, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!adi", name = "ay", descriptor = "(ZZ)V", line = 109)
	void method17494(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (this.anInt2408 == 3553) {
			this.aClass86_Sub3_31.method6195(this);
			OpenGL.glTexParameteri(this.anInt2408, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(this.anInt2408, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!adi", name = "at", descriptor = "(IIII[BLclient!dt;IIZ)V", line = 117)
	void method17495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class212 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		if (arg7 == 0) {
			arg7 = arg2;
		}
		if (arg8) {
			@Pc(10) int local10 = arg5.anInt3679 * 1676120375;
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
		this.aClass86_Sub3_31.method6195(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, arg7);
		}
		OpenGL.glTexSubImage2Dub(this.anInt2408, 0, arg0, this.anInt2413 - arg1 - arg3, arg2, arg3, Class86_Sub3.method6289(arg5), 5121, arg4, arg6);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!adi", name = "af", descriptor = "(IIII[BLclient!dt;IIZ)V", line = 117)
	void method17496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class212 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		if (arg7 == 0) {
			arg7 = arg2;
		}
		if (arg8) {
			@Pc(10) int local10 = arg5.anInt3679 * 1676120375;
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
		this.aClass86_Sub3_31.method6195(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, arg7);
		}
		OpenGL.glTexSubImage2Dub(this.anInt2408, 0, arg0, this.anInt2413 - arg1 - arg3, arg2, arg3, Class86_Sub3.method6289(arg5), 5121, arg4, arg6);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!adi", name = "ab", descriptor = "(IIII[IIIZ)V", line = 141)
	void method17497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
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
		this.aClass86_Sub3_31.method6195(this);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, arg6);
		}
		OpenGL.glTexSubImage2Di(this.anInt2408, 0, arg0, this.anInt2413 - arg1 - arg3, arg2, arg3, 32993, this.aClass86_Sub3_31.anInt685, arg4, arg5);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!adi", name = "an", descriptor = "(IIII[IIIZ)V", line = 141)
	void method17498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
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
		this.aClass86_Sub3_31.method6195(this);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, arg6);
		}
		OpenGL.glTexSubImage2Di(this.anInt2408, 0, arg0, this.anInt2413 - arg1 - arg3, arg2, arg3, 32993, this.aClass86_Sub3_31.anInt685, arg4, arg5);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!adi", name = "aa", descriptor = "(IIII[IIIZ)V", line = 141)
	void method17499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
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
		this.aClass86_Sub3_31.method6195(this);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, arg6);
		}
		OpenGL.glTexSubImage2Di(this.anInt2408, 0, arg0, this.anInt2413 - arg1 - arg3, arg2, arg3, 32993, this.aClass86_Sub3_31.anInt685, arg4, arg5);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!adi", name = "ae", descriptor = "(IIII[IIIZ)V", line = 141)
	void method17500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
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
		this.aClass86_Sub3_31.method6195(this);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, arg6);
		}
		OpenGL.glTexSubImage2Di(this.anInt2408, 0, arg0, this.anInt2413 - arg1 - arg3, arg2, arg3, 32993, this.aClass86_Sub3_31.anInt685, arg4, arg5);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!adi", name = "ah", descriptor = "(IIII[I[II)V", line = 160)
	void method17501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int[] local10 = arg5 == null ? new int[this.anInt2412 * this.anInt2413] : arg5;
		this.aClass86_Sub3_31.method6195(this);
		OpenGL.glGetTexImagei(this.anInt2408, 0, 32993, 5121, local10, 0);
		for (@Pc(24) int local24 = 0; local24 < arg3; local24++) {
			System.arraycopy(local10, (arg1 + (arg3 - 1) - local24) * this.anInt2412, arg4, arg6 + local24 * arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!adi", name = "ap", descriptor = "(IIII[I[II)V", line = 160)
	void method17502(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int[] local10 = arg4 == null ? new int[this.anInt2412 * this.anInt2413] : arg4;
		this.aClass86_Sub3_31.method6195(this);
		OpenGL.glGetTexImagei(this.anInt2408, 0, 32993, 5121, local10, 0);
		for (@Pc(24) int local24 = 0; local24 < arg2; local24++) {
			System.arraycopy(local10, (arg0 + (arg2 - 1) - local24) * this.anInt2412, arg3, arg5 + local24 * arg1, arg1);
		}
	}

	@OriginalMember(owner = "client!adi", name = "aw", descriptor = "(IIII[I[II)V", line = 160)
	void method17503(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int[] local10 = arg4 == null ? new int[this.anInt2412 * this.anInt2413] : arg4;
		this.aClass86_Sub3_31.method6195(this);
		OpenGL.glGetTexImagei(this.anInt2408, 0, 32993, 5121, local10, 0);
		for (@Pc(24) int local24 = 0; local24 < arg2; local24++) {
			System.arraycopy(local10, (arg0 + (arg2 - 1) - local24) * this.anInt2412, arg3, arg5 + local24 * arg1, arg1);
		}
	}

	@OriginalMember(owner = "client!adi", name = "az", descriptor = "(IIII[I[II)V", line = 160)
	void method17504(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int[] local10 = arg4 == null ? new int[this.anInt2412 * this.anInt2413] : arg4;
		this.aClass86_Sub3_31.method6195(this);
		OpenGL.glGetTexImagei(this.anInt2408, 0, 32993, 5121, local10, 0);
		for (@Pc(24) int local24 = 0; local24 < arg2; local24++) {
			System.arraycopy(local10, (arg0 + (arg2 - 1) - local24) * this.anInt2412, arg3, arg5 + local24 * arg1, arg1);
		}
	}

	@OriginalMember(owner = "client!adi", name = "as", descriptor = "(IIIIII)V", line = 169)
	void method17505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) Class92 local4 = this.aClass86_Sub3_31.method19940();
		if (local4 != null) {
			@Pc(13) int local13 = local4.method23493() - (arg5 + arg3);
			this.aClass86_Sub3_31.method6195(this);
			OpenGL.glCopyTexSubImage2D(this.anInt2408, 0, arg0, this.anInt2413 - (arg1 + arg3), arg4, local13, arg2, arg3);
			OpenGL.glFlush();
		}
	}

	@OriginalMember(owner = "client!adi", name = "bc", descriptor = "(IIIIII)V", line = 169)
	void method17506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) Class92 local4 = this.aClass86_Sub3_31.method19940();
		if (local4 != null) {
			@Pc(13) int local13 = local4.method23493() - (arg5 + arg3);
			this.aClass86_Sub3_31.method6195(this);
			OpenGL.glCopyTexSubImage2D(this.anInt2408, 0, arg0, this.anInt2413 - (arg1 + arg3), arg4, local13, arg2, arg3);
			OpenGL.glFlush();
		}
	}

	@OriginalMember(owner = "client!adi", name = "bj", descriptor = "(IIIIII)V", line = 169)
	void method17507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) Class92 local4 = this.aClass86_Sub3_31.method19940();
		if (local4 != null) {
			@Pc(13) int local13 = local4.method23493() - (arg5 + arg3);
			this.aClass86_Sub3_31.method6195(this);
			OpenGL.glCopyTexSubImage2D(this.anInt2408, 0, arg0, this.anInt2413 - (arg1 + arg3), arg4, local13, arg2, arg3);
			OpenGL.glFlush();
		}
	}

	@OriginalMember(owner = "client!adi", name = "bv", descriptor = "(IIIIII)V", line = 169)
	void method17508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) Class92 local4 = this.aClass86_Sub3_31.method19940();
		if (local4 != null) {
			@Pc(13) int local13 = local4.method23493() - (arg5 + arg3);
			this.aClass86_Sub3_31.method6195(this);
			OpenGL.glCopyTexSubImage2D(this.anInt2408, 0, arg0, this.anInt2413 - (arg1 + arg3), arg4, local13, arg2, arg3);
			OpenGL.glFlush();
		}
	}

	@OriginalMember(owner = "client!adi", name = "aq", descriptor = "(I)Lclient!de;", line = 179)
	Interface20 method17509(@OriginalArg(0) int arg0) {
		return new Class200(this, arg0);
	}

	@OriginalMember(owner = "client!adi", name = "bl", descriptor = "(I)Lclient!de;", line = 179)
	Interface20 method17510(@OriginalArg(0) int arg0) {
		return new Class200(this, arg0);
	}

	@OriginalMember(owner = "client!adi", name = "ba", descriptor = "(I)Lclient!de;", line = 179)
	Interface20 method17511(@OriginalArg(0) int arg0) {
		return new Class200(this, arg0);
	}

	@OriginalMember(owner = "client!adi", name = "bb", descriptor = "(I)Lclient!de;", line = 179)
	Interface20 method17512(@OriginalArg(0) int arg0) {
		return new Class200(this, arg0);
	}

	@OriginalMember(owner = "client!adi", name = "am", descriptor = "(I)Lclient!df;", line = 183)
	Interface21 method17513(@OriginalArg(0) int arg0) {
		return new Class200(this, arg0);
	}

	@OriginalMember(owner = "client!adi", name = "by", descriptor = "(I)Lclient!df;", line = 183)
	Interface21 method17514(@OriginalArg(0) int arg0) {
		return new Class200(this, arg0);
	}

	@OriginalMember(owner = "client!adi", name = "bd", descriptor = "(I)Lclient!df;", line = 183)
	Interface21 method17515(@OriginalArg(0) int arg0) {
		return new Class200(this, arg0);
	}

	@OriginalMember(owner = "client!adi", name = "bx", descriptor = "(I)Lclient!df;", line = 183)
	Interface21 method17516(@OriginalArg(0) int arg0) {
		return new Class200(this, arg0);
	}

	@OriginalMember(owner = "client!adi", name = "bw", descriptor = "(I)Lclient!df;", line = 183)
	Interface21 method17517(@OriginalArg(0) int arg0) {
		return new Class200(this, arg0);
	}
}
