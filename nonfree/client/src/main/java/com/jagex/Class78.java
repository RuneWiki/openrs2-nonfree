package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bx")
public abstract class Class78 {

	@OriginalMember(owner = "client!bx", name = "y", descriptor = "I")
	static final int anInt2403 = 32879;

	@OriginalMember(owner = "client!bx", name = "c", descriptor = "I")
	static final int anInt2404 = 3553;

	@OriginalMember(owner = "client!bx", name = "p", descriptor = "I")
	static final int anInt2406 = 3552;

	@OriginalMember(owner = "client!bx", name = "v", descriptor = "I")
	static final int anInt2407 = 34037;

	@OriginalMember(owner = "client!bx", name = "l", descriptor = "I")
	static final int anInt2409 = 34067;

	@OriginalMember(owner = "client!bx", name = "w", descriptor = "I")
	static final int anInt2411 = 5121;

	@OriginalMember(owner = "client!bx", name = "j", descriptor = "[I")
	static final int[] anIntArray224 = new int[1];

	@OriginalMember(owner = "client!bx", name = "g", descriptor = "Z")
	boolean aBoolean373 = false;

	@OriginalMember(owner = "client!bx", name = "t", descriptor = "Lclient!aeq;")
	final Class86_Sub3 aClass86_Sub3_31;

	@OriginalMember(owner = "client!bx", name = "x", descriptor = "I")
	final int anInt2408;

	@OriginalMember(owner = "client!bx", name = "d", descriptor = "Lclient!dt;")
	final Class212 aClass212_16;

	@OriginalMember(owner = "client!bx", name = "s", descriptor = "Lclient!dl;")
	final Class206 aClass206_17;

	@OriginalMember(owner = "client!bx", name = "r", descriptor = "Z")
	boolean aBoolean372;

	@OriginalMember(owner = "client!bx", name = "z", descriptor = "I")
	final int anInt2405;

	@OriginalMember(owner = "client!bx", name = "q", descriptor = "I")
	int anInt2410;

	@OriginalMember(owner = "client!bx", name = "<init>", descriptor = "(Lclient!aeq;ILclient!dt;Lclient!dl;IZ)V", line = 25)
	Class78(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class212 arg2, @OriginalArg(3) Class206 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass86_Sub3_31 = arg0;
		this.anInt2408 = arg1;
		this.aClass212_16 = arg2;
		this.aClass206_17 = arg3;
		this.aBoolean372 = arg5;
		this.anInt2405 = arg4;
		OpenGL.glGenTextures(1, anIntArray224, 0);
		this.anInt2410 = anIntArray224[0];
		this.method17476(0);
	}

	@OriginalMember(owner = "client!bx", name = "p", descriptor = "(Z)V", line = 38)
	void method17453(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean373 != arg0) {
			this.aBoolean373 = arg0;
			this.method17455();
		}
	}

	@OriginalMember(owner = "client!bx", name = "r", descriptor = "(Z)V", line = 38)
	void method17454(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean373 != arg0) {
			this.aBoolean373 = arg0;
			this.method17455();
		}
	}

	@OriginalMember(owner = "client!bx", name = "c", descriptor = "()V", line = 45)
	void method17455() {
		this.aClass86_Sub3_31.method6195(this);
		if (this.aBoolean373) {
			OpenGL.glTexParameteri(this.anInt2408, 10241, this.aBoolean372 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt2408, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt2408, 10241, this.aBoolean372 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt2408, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!bx", name = "z", descriptor = "()V", line = 45)
	void method17456() {
		this.aClass86_Sub3_31.method6195(this);
		if (this.aBoolean373) {
			OpenGL.glTexParameteri(this.anInt2408, 10241, this.aBoolean372 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt2408, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt2408, 10241, this.aBoolean372 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt2408, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!bx", name = "g", descriptor = "()V", line = 45)
	void method17457() {
		this.aClass86_Sub3_31.method6195(this);
		if (this.aBoolean373) {
			OpenGL.glTexParameteri(this.anInt2408, 10241, this.aBoolean372 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt2408, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt2408, 10241, this.aBoolean372 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt2408, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!bx", name = "i", descriptor = "()Z", line = 57)
	boolean method17458() {
		if (!this.aClass86_Sub3_31.aBoolean134) {
			return false;
		}
		@Pc(6) int local6 = this.method17480();
		this.aClass86_Sub3_31.method6195(this);
		OpenGL.glGenerateMipmapEXT(this.anInt2408);
		this.aBoolean372 = true;
		this.method17455();
		this.method17476(local6);
		return true;
	}

	@OriginalMember(owner = "client!bx", name = "v", descriptor = "()Z", line = 57)
	boolean method17459() {
		if (!this.aClass86_Sub3_31.aBoolean134) {
			return false;
		}
		@Pc(6) int local6 = this.method17480();
		this.aClass86_Sub3_31.method6195(this);
		OpenGL.glGenerateMipmapEXT(this.anInt2408);
		this.aBoolean372 = true;
		this.method17455();
		this.method17476(local6);
		return true;
	}

	@OriginalMember(owner = "client!bx", name = "j", descriptor = "()Z", line = 57)
	boolean method17460() {
		if (!this.aClass86_Sub3_31.aBoolean134) {
			return false;
		}
		@Pc(6) int local6 = this.method17480();
		this.aClass86_Sub3_31.method6195(this);
		OpenGL.glGenerateMipmapEXT(this.anInt2408);
		this.aBoolean372 = true;
		this.method17455();
		this.method17476(local6);
		return true;
	}

	@OriginalMember(owner = "client!bx", name = "k", descriptor = "()Z", line = 57)
	boolean method17461() {
		if (!this.aClass86_Sub3_31.aBoolean134) {
			return false;
		}
		@Pc(6) int local6 = this.method17480();
		this.aClass86_Sub3_31.method6195(this);
		OpenGL.glGenerateMipmapEXT(this.anInt2408);
		this.aBoolean372 = true;
		this.method17455();
		this.method17476(local6);
		return true;
	}

	@OriginalMember(owner = "client!bx", name = "l", descriptor = "(Z)V", line = 70)
	void method17462(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean372 != arg0) {
			@Pc(6) int local6 = this.method17480();
			this.aBoolean372 = true;
			this.method17455();
			this.method17476(local6);
		}
	}

	@OriginalMember(owner = "client!bx", name = "e", descriptor = "(Z)V", line = 70)
	void method17463(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean372 != arg0) {
			@Pc(6) int local6 = this.method17480();
			this.aBoolean372 = true;
			this.method17455();
			this.method17476(local6);
		}
	}

	@OriginalMember(owner = "client!bx", name = "f", descriptor = "(Z)V", line = 70)
	void method17464(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean372 != arg0) {
			@Pc(6) int local6 = this.method17480();
			this.aBoolean372 = true;
			this.method17455();
			this.method17476(local6);
		}
	}

	@OriginalMember(owner = "client!bx", name = "u", descriptor = "(Z)V", line = 70)
	void method17465(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean372 != arg0) {
			@Pc(6) int local6 = this.method17480();
			this.aBoolean372 = true;
			this.method17455();
			this.method17476(local6);
		}
	}

	@OriginalMember(owner = "client!bx", name = "y", descriptor = "()V", line = 79)
	void method17466() {
		if (this.anInt2410 != 0) {
			this.aClass86_Sub3_31.anInt724 -= this.method17480();
			@Pc(13) int[] local13 = new int[] { this.anInt2410 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt2410 = 0;
		}
	}

	@OriginalMember(owner = "client!bx", name = "b", descriptor = "()V", line = 79)
	void method17467() {
		if (this.anInt2410 != 0) {
			this.aClass86_Sub3_31.anInt724 -= this.method17480();
			@Pc(13) int[] local13 = new int[] { this.anInt2410 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt2410 = 0;
		}
	}

	@OriginalMember(owner = "client!bx", name = "o", descriptor = "()V", line = 79)
	void method17468() {
		if (this.anInt2410 != 0) {
			this.aClass86_Sub3_31.anInt724 -= this.method17480();
			@Pc(13) int[] local13 = new int[] { this.anInt2410 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt2410 = 0;
		}
	}

	@OriginalMember(owner = "client!bx", name = "n", descriptor = "()V", line = 79)
	void method17469() {
		if (this.anInt2410 != 0) {
			this.aClass86_Sub3_31.anInt724 -= this.method17480();
			@Pc(13) int[] local13 = new int[] { this.anInt2410 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt2410 = 0;
		}
	}

	@OriginalMember(owner = "client!bx", name = "a", descriptor = "()V", line = 79)
	void method17470() {
		if (this.anInt2410 != 0) {
			this.aClass86_Sub3_31.anInt724 -= this.method17480();
			@Pc(13) int[] local13 = new int[] { this.anInt2410 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt2410 = 0;
		}
	}

	@OriginalMember(owner = "client!bx", name = "w", descriptor = "()V", line = 89)
	void method17471() {
		if (this.anInt2410 != 0) {
			this.aClass86_Sub3_31.method6272(this.anInt2410, this.method17480());
			this.anInt2410 = 0;
		}
	}

	@OriginalMember(owner = "client!bx", name = "m", descriptor = "()V", line = 89)
	void method17472() {
		if (this.anInt2410 != 0) {
			this.aClass86_Sub3_31.method6272(this.anInt2410, this.method17480());
			this.anInt2410 = 0;
		}
	}

	@OriginalMember(owner = "client!bx", name = "finalize", descriptor = "()V", line = 96)
	@Override
	void finalize() throws Throwable {
		this.method17471();
		super.finalize();
	}

	@OriginalMember(owner = "client!bx", name = "hc", descriptor = "()V", line = 96)
	void method17473() throws Throwable {
		this.method17471();
		super.finalize();
	}

	@OriginalMember(owner = "client!bx", name = "hd", descriptor = "()V", line = 96)
	void method17474() throws Throwable {
		this.method17471();
		super.finalize();
	}

	@OriginalMember(owner = "client!bx", name = "hp", descriptor = "()V", line = 96)
	void method17475() throws Throwable {
		this.method17471();
		super.finalize();
	}

	@OriginalMember(owner = "client!bx", name = "t", descriptor = "(I)V", line = 101)
	void method17476(@OriginalArg(0) int arg0) {
		this.aClass86_Sub3_31.anInt724 -= arg0;
		this.aClass86_Sub3_31.anInt724 += this.method17480();
	}

	@OriginalMember(owner = "client!bx", name = "h", descriptor = "(I)V", line = 101)
	void method17477(@OriginalArg(0) int arg0) {
		this.aClass86_Sub3_31.anInt724 -= arg0;
		this.aClass86_Sub3_31.anInt724 += this.method17480();
	}

	@OriginalMember(owner = "client!bx", name = "aj", descriptor = "(I)V", line = 101)
	void method17478(@OriginalArg(0) int arg0) {
		this.aClass86_Sub3_31.anInt724 -= arg0;
		this.aClass86_Sub3_31.anInt724 += this.method17480();
	}

	@OriginalMember(owner = "client!bx", name = "ai", descriptor = "(I)V", line = 101)
	void method17479(@OriginalArg(0) int arg0) {
		this.aClass86_Sub3_31.anInt724 -= arg0;
		this.aClass86_Sub3_31.anInt724 += this.method17480();
	}

	@OriginalMember(owner = "client!bx", name = "q", descriptor = "()I", line = 106)
	int method17480() {
		@Pc(14) int local14 = this.aClass212_16.anInt3679 * 1676120375 * this.aClass206_17.anInt3581 * 1899960707 * this.anInt2405;
		return this.aBoolean372 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!bx", name = "ag", descriptor = "()I", line = 106)
	int method17481() {
		@Pc(14) int local14 = this.aClass212_16.anInt3679 * 1676120375 * this.aClass206_17.anInt3581 * 1899960707 * this.anInt2405;
		return this.aBoolean372 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!bx", name = "al", descriptor = "()I", line = 106)
	int method17482() {
		@Pc(14) int local14 = this.aClass212_16.anInt3679 * 1676120375 * this.aClass206_17.anInt3581 * 1899960707 * this.anInt2405;
		return this.aBoolean372 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!bx", name = "x", descriptor = "(IIIIII[I)V", line = 111)
	static void method17483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		if (arg2 > 0 && !Class562.method31306(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Class562.method31306(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg4 == 32993) {
			@Pc(31) int local31 = 0;
			@Pc(38) int local38 = arg2 < arg3 ? arg2 : arg3;
			@Pc(42) int local42 = arg2 >> 1;
			@Pc(46) int local46 = arg3 >> 1;
			@Pc(48) int[] local48 = arg6;
			@Pc(53) int[] local53 = new int[local42 * local46];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local31, arg1, arg2, arg3, 0, arg4, arg5, local48, 0);
				if (local38 <= 1) {
					return;
				}
				@Pc(69) int local69 = 0;
				@Pc(71) int local71 = 0;
				@Pc(75) int local75 = local71 + arg2;
				for (@Pc(77) int local77 = 0; local77 < local46; local77++) {
					for (@Pc(82) int local82 = 0; local82 < local42; local82++) {
						@Pc(90) int local90 = local48[local71++];
						@Pc(95) int local95 = local48[local71++];
						@Pc(100) int local100 = local48[local75++];
						@Pc(105) int local105 = local48[local75++];
						@Pc(111) int local111 = local90 >> 24 & 0xFF;
						@Pc(117) int local117 = local90 >> 16 & 0xFF;
						@Pc(123) int local123 = local90 >> 8 & 0xFF;
						@Pc(127) int local127 = local90 & 0xFF;
						@Pc(135) int local135 = local111 + (local95 >> 24 & 0xFF);
						@Pc(143) int local143 = local117 + (local95 >> 16 & 0xFF);
						@Pc(151) int local151 = local123 + (local95 >> 8 & 0xFF);
						@Pc(157) int local157 = local127 + (local95 & 0xFF);
						@Pc(165) int local165 = local135 + (local100 >> 24 & 0xFF);
						@Pc(173) int local173 = local143 + (local100 >> 16 & 0xFF);
						@Pc(181) int local181 = local151 + (local100 >> 8 & 0xFF);
						@Pc(187) int local187 = local157 + (local100 & 0xFF);
						@Pc(195) int local195 = local165 + (local105 >> 24 & 0xFF);
						@Pc(203) int local203 = local173 + (local105 >> 16 & 0xFF);
						@Pc(211) int local211 = local181 + (local105 >> 8 & 0xFF);
						@Pc(217) int local217 = local187 + (local105 & 0xFF);
						local53[local69++] = (local195 & 0x3FC) << 22 | (local203 & 0x3FC) << 14 | (local211 & 0x3FC) << 6 | local217 >> 2 & 0xFF;
					}
					local71 += arg2;
					local75 += arg2;
				}
				@Pc(258) int[] local258 = local53;
				local53 = local48;
				local48 = local258;
				arg2 = local42;
				arg3 = local46;
				local42 >>= 0x1;
				local46 >>= 0x1;
				local38 >>= 0x1;
				local31++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bx", name = "ao", descriptor = "(IIIIII[I)V", line = 111)
	static void method17484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		if (arg2 > 0 && !Class562.method31306(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Class562.method31306(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg4 == 32993) {
			@Pc(31) int local31 = 0;
			@Pc(38) int local38 = arg2 < arg3 ? arg2 : arg3;
			@Pc(42) int local42 = arg2 >> 1;
			@Pc(46) int local46 = arg3 >> 1;
			@Pc(48) int[] local48 = arg6;
			@Pc(53) int[] local53 = new int[local42 * local46];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local31, arg1, arg2, arg3, 0, arg4, arg5, local48, 0);
				if (local38 <= 1) {
					return;
				}
				@Pc(69) int local69 = 0;
				@Pc(71) int local71 = 0;
				@Pc(75) int local75 = local71 + arg2;
				for (@Pc(77) int local77 = 0; local77 < local46; local77++) {
					for (@Pc(82) int local82 = 0; local82 < local42; local82++) {
						@Pc(90) int local90 = local48[local71++];
						@Pc(95) int local95 = local48[local71++];
						@Pc(100) int local100 = local48[local75++];
						@Pc(105) int local105 = local48[local75++];
						@Pc(111) int local111 = local90 >> 24 & 0xFF;
						@Pc(117) int local117 = local90 >> 16 & 0xFF;
						@Pc(123) int local123 = local90 >> 8 & 0xFF;
						@Pc(127) int local127 = local90 & 0xFF;
						@Pc(135) int local135 = local111 + (local95 >> 24 & 0xFF);
						@Pc(143) int local143 = local117 + (local95 >> 16 & 0xFF);
						@Pc(151) int local151 = local123 + (local95 >> 8 & 0xFF);
						@Pc(157) int local157 = local127 + (local95 & 0xFF);
						@Pc(165) int local165 = local135 + (local100 >> 24 & 0xFF);
						@Pc(173) int local173 = local143 + (local100 >> 16 & 0xFF);
						@Pc(181) int local181 = local151 + (local100 >> 8 & 0xFF);
						@Pc(187) int local187 = local157 + (local100 & 0xFF);
						@Pc(195) int local195 = local165 + (local105 >> 24 & 0xFF);
						@Pc(203) int local203 = local173 + (local105 >> 16 & 0xFF);
						@Pc(211) int local211 = local181 + (local105 >> 8 & 0xFF);
						@Pc(217) int local217 = local187 + (local105 & 0xFF);
						local53[local69++] = (local195 & 0x3FC) << 22 | (local203 & 0x3FC) << 14 | (local211 & 0x3FC) << 6 | local217 >> 2 & 0xFF;
					}
					local71 += arg2;
					local75 += arg2;
				}
				@Pc(258) int[] local258 = local53;
				local53 = local48;
				local48 = local258;
				arg2 = local42;
				arg3 = local46;
				local42 >>= 0x1;
				local46 >>= 0x1;
				local38 >>= 0x1;
				local31++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bx", name = "ak", descriptor = "(IIIIII[I)V", line = 111)
	static void method17485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		if (arg2 > 0 && !Class562.method31306(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Class562.method31306(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg4 == 32993) {
			@Pc(31) int local31 = 0;
			@Pc(38) int local38 = arg2 < arg3 ? arg2 : arg3;
			@Pc(42) int local42 = arg2 >> 1;
			@Pc(46) int local46 = arg3 >> 1;
			@Pc(48) int[] local48 = arg6;
			@Pc(53) int[] local53 = new int[local42 * local46];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local31, arg1, arg2, arg3, 0, arg4, arg5, local48, 0);
				if (local38 <= 1) {
					return;
				}
				@Pc(69) int local69 = 0;
				@Pc(71) int local71 = 0;
				@Pc(75) int local75 = local71 + arg2;
				for (@Pc(77) int local77 = 0; local77 < local46; local77++) {
					for (@Pc(82) int local82 = 0; local82 < local42; local82++) {
						@Pc(90) int local90 = local48[local71++];
						@Pc(95) int local95 = local48[local71++];
						@Pc(100) int local100 = local48[local75++];
						@Pc(105) int local105 = local48[local75++];
						@Pc(111) int local111 = local90 >> 24 & 0xFF;
						@Pc(117) int local117 = local90 >> 16 & 0xFF;
						@Pc(123) int local123 = local90 >> 8 & 0xFF;
						@Pc(127) int local127 = local90 & 0xFF;
						@Pc(135) int local135 = local111 + (local95 >> 24 & 0xFF);
						@Pc(143) int local143 = local117 + (local95 >> 16 & 0xFF);
						@Pc(151) int local151 = local123 + (local95 >> 8 & 0xFF);
						@Pc(157) int local157 = local127 + (local95 & 0xFF);
						@Pc(165) int local165 = local135 + (local100 >> 24 & 0xFF);
						@Pc(173) int local173 = local143 + (local100 >> 16 & 0xFF);
						@Pc(181) int local181 = local151 + (local100 >> 8 & 0xFF);
						@Pc(187) int local187 = local157 + (local100 & 0xFF);
						@Pc(195) int local195 = local165 + (local105 >> 24 & 0xFF);
						@Pc(203) int local203 = local173 + (local105 >> 16 & 0xFF);
						@Pc(211) int local211 = local181 + (local105 >> 8 & 0xFF);
						@Pc(217) int local217 = local187 + (local105 & 0xFF);
						local53[local69++] = (local195 & 0x3FC) << 22 | (local203 & 0x3FC) << 14 | (local211 & 0x3FC) << 6 | local217 >> 2 & 0xFF;
					}
					local71 += arg2;
					local75 += arg2;
				}
				@Pc(258) int[] local258 = local53;
				local53 = local48;
				local48 = local258;
				arg2 = local42;
				arg3 = local46;
				local42 >>= 0x1;
				local46 >>= 0x1;
				local38 >>= 0x1;
				local31++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bx", name = "d", descriptor = "(IIIILclient!dt;[B)V", line = 177)
	static void method17486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class212 arg4, @OriginalArg(5) byte[] arg5) {
		if (arg2 > 0 && !Class562.method31306(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class562.method31306(arg3)) {
			@Pc(26) int local26 = arg4.anInt3679 * 1676120375;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = arg2 < arg3 ? arg2 : arg3;
			@Pc(39) int local39 = arg2 >> 1;
			@Pc(43) int local43 = arg3 >> 1;
			@Pc(45) byte[] local45 = arg5;
			@Pc(52) byte[] local52 = new byte[local39 * local43 * local26];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local28, arg1, arg2, arg3, 0, Class86_Sub3.method6289(arg4), 5121, local45, 0);
				if (local35 <= 1) {
					return;
				}
				@Pc(71) int local71 = arg2 * local26;
				for (@Pc(73) int local73 = 0; local73 < local26; local73++) {
					@Pc(78) int local78 = local73;
					@Pc(80) int local80 = local73;
					@Pc(84) int local84 = local73 + local71;
					for (@Pc(86) int local86 = 0; local86 < local43; local86++) {
						for (@Pc(91) int local91 = 0; local91 < local39; local91++) {
							@Pc(98) byte local98 = local45[local80];
							local80 += local26;
							@Pc(108) int local108 = local98 + local45[local80];
							local80 += local26;
							@Pc(118) int local118 = local108 + local45[local84];
							local84 += local26;
							@Pc(128) int local128 = local118 + local45[local84];
							local84 += local26;
							local52[local78] = (byte) (local128 >> 2);
							local78 += local26;
						}
						local80 += local71;
						local84 += local71;
					}
				}
				@Pc(159) byte[] local159 = local52;
				local52 = local45;
				local45 = local159;
				arg2 = local39;
				arg3 = local43;
				local39 >>= 0x1;
				local43 >>= 0x1;
				local35 >>= 0x1;
				local28++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bx", name = "ax", descriptor = "(IIIILclient!dt;[B)V", line = 177)
	static void method17487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class212 arg4, @OriginalArg(5) byte[] arg5) {
		if (arg2 > 0 && !Class562.method31306(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class562.method31306(arg3)) {
			@Pc(26) int local26 = arg4.anInt3679 * 1676120375;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = arg2 < arg3 ? arg2 : arg3;
			@Pc(39) int local39 = arg2 >> 1;
			@Pc(43) int local43 = arg3 >> 1;
			@Pc(45) byte[] local45 = arg5;
			@Pc(52) byte[] local52 = new byte[local39 * local43 * local26];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local28, arg1, arg2, arg3, 0, Class86_Sub3.method6289(arg4), 5121, local45, 0);
				if (local35 <= 1) {
					return;
				}
				@Pc(71) int local71 = arg2 * local26;
				for (@Pc(73) int local73 = 0; local73 < local26; local73++) {
					@Pc(78) int local78 = local73;
					@Pc(80) int local80 = local73;
					@Pc(84) int local84 = local73 + local71;
					for (@Pc(86) int local86 = 0; local86 < local43; local86++) {
						for (@Pc(91) int local91 = 0; local91 < local39; local91++) {
							@Pc(98) byte local98 = local45[local80];
							local80 += local26;
							@Pc(108) int local108 = local98 + local45[local80];
							local80 += local26;
							@Pc(118) int local118 = local108 + local45[local84];
							local84 += local26;
							@Pc(128) int local128 = local118 + local45[local84];
							local84 += local26;
							local52[local78] = (byte) (local128 >> 2);
							local78 += local26;
						}
						local80 += local71;
						local84 += local71;
					}
				}
				@Pc(159) byte[] local159 = local52;
				local52 = local45;
				local45 = local159;
				arg2 = local39;
				arg3 = local43;
				local39 >>= 0x1;
				local43 >>= 0x1;
				local35 >>= 0x1;
				local28++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bx", name = "au", descriptor = "(IIIILclient!dt;[B)V", line = 177)
	static void method17488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class212 arg4, @OriginalArg(5) byte[] arg5) {
		if (arg2 > 0 && !Class562.method31306(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class562.method31306(arg3)) {
			@Pc(26) int local26 = arg4.anInt3679 * 1676120375;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = arg2 < arg3 ? arg2 : arg3;
			@Pc(39) int local39 = arg2 >> 1;
			@Pc(43) int local43 = arg3 >> 1;
			@Pc(45) byte[] local45 = arg5;
			@Pc(52) byte[] local52 = new byte[local39 * local43 * local26];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local28, arg1, arg2, arg3, 0, Class86_Sub3.method6289(arg4), 5121, local45, 0);
				if (local35 <= 1) {
					return;
				}
				@Pc(71) int local71 = arg2 * local26;
				for (@Pc(73) int local73 = 0; local73 < local26; local73++) {
					@Pc(78) int local78 = local73;
					@Pc(80) int local80 = local73;
					@Pc(84) int local84 = local73 + local71;
					for (@Pc(86) int local86 = 0; local86 < local43; local86++) {
						for (@Pc(91) int local91 = 0; local91 < local39; local91++) {
							@Pc(98) byte local98 = local45[local80];
							local80 += local26;
							@Pc(108) int local108 = local98 + local45[local80];
							local80 += local26;
							@Pc(118) int local118 = local108 + local45[local84];
							local84 += local26;
							@Pc(128) int local128 = local118 + local45[local84];
							local84 += local26;
							local52[local78] = (byte) (local128 >> 2);
							local78 += local26;
						}
						local80 += local71;
						local84 += local71;
					}
				}
				@Pc(159) byte[] local159 = local52;
				local52 = local45;
				local45 = local159;
				arg2 = local39;
				arg3 = local43;
				local39 >>= 0x1;
				local43 >>= 0x1;
				local35 >>= 0x1;
				local28++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bx", name = "s", descriptor = "(IIIILclient!dt;[F)V", line = 228)
	static void method17489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class212 arg4, @OriginalArg(5) float[] arg5) {
		if (arg2 > 0 && !Class562.method31306(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class562.method31306(arg3)) {
			@Pc(26) int local26 = arg4.anInt3679 * 1676120375;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = arg2 < arg3 ? arg2 : arg3;
			@Pc(39) int local39 = arg2 >> 1;
			@Pc(43) int local43 = arg3 >> 1;
			@Pc(45) float[] local45 = arg5;
			@Pc(52) float[] local52 = new float[local39 * local43 * local26];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local28, arg1, arg2, arg3, 0, Class86_Sub3.method6289(arg4), 5126, local45, 0);
				if (local35 <= 1) {
					return;
				}
				@Pc(71) int local71 = arg2 * local26;
				for (@Pc(73) int local73 = 0; local73 < local26; local73++) {
					@Pc(78) int local78 = local73;
					@Pc(80) int local80 = local73;
					@Pc(84) int local84 = local73 + local71;
					for (@Pc(86) int local86 = 0; local86 < local43; local86++) {
						for (@Pc(91) int local91 = 0; local91 < local39; local91++) {
							@Pc(98) float local98 = local45[local80];
							local80 += local26;
							@Pc(108) float local108 = local98 + local45[local80];
							local80 += local26;
							@Pc(118) float local118 = local108 + local45[local84];
							local84 += local26;
							@Pc(128) float local128 = local118 + local45[local84];
							local84 += local26;
							local52[local78] = local128 * 0.25F;
							local78 += local26;
						}
						local80 += local71;
						local84 += local71;
					}
				}
				@Pc(158) float[] local158 = local52;
				local52 = local45;
				local45 = local158;
				arg2 = local39;
				arg3 = local43;
				local39 >>= 0x1;
				local43 >>= 0x1;
				local35 >>= 0x1;
				local28++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bx", name = "ar", descriptor = "(IIIILclient!dt;[F)V", line = 228)
	static void method17490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class212 arg4, @OriginalArg(5) float[] arg5) {
		if (arg2 > 0 && !Class562.method31306(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class562.method31306(arg3)) {
			@Pc(26) int local26 = arg4.anInt3679 * 1676120375;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = arg2 < arg3 ? arg2 : arg3;
			@Pc(39) int local39 = arg2 >> 1;
			@Pc(43) int local43 = arg3 >> 1;
			@Pc(45) float[] local45 = arg5;
			@Pc(52) float[] local52 = new float[local39 * local43 * local26];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local28, arg1, arg2, arg3, 0, Class86_Sub3.method6289(arg4), 5126, local45, 0);
				if (local35 <= 1) {
					return;
				}
				@Pc(71) int local71 = arg2 * local26;
				for (@Pc(73) int local73 = 0; local73 < local26; local73++) {
					@Pc(78) int local78 = local73;
					@Pc(80) int local80 = local73;
					@Pc(84) int local84 = local73 + local71;
					for (@Pc(86) int local86 = 0; local86 < local43; local86++) {
						for (@Pc(91) int local91 = 0; local91 < local39; local91++) {
							@Pc(98) float local98 = local45[local80];
							local80 += local26;
							@Pc(108) float local108 = local98 + local45[local80];
							local80 += local26;
							@Pc(118) float local118 = local108 + local45[local84];
							local84 += local26;
							@Pc(128) float local128 = local118 + local45[local84];
							local84 += local26;
							local52[local78] = local128 * 0.25F;
							local78 += local26;
						}
						local80 += local71;
						local84 += local71;
					}
				}
				@Pc(158) float[] local158 = local52;
				local52 = local45;
				local45 = local158;
				arg2 = local39;
				arg3 = local43;
				local39 >>= 0x1;
				local43 >>= 0x1;
				local35 >>= 0x1;
				local28++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bx", name = "ad", descriptor = "(IIIILclient!dt;[F)V", line = 228)
	static void method17491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class212 arg4, @OriginalArg(5) float[] arg5) {
		if (arg2 > 0 && !Class562.method31306(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class562.method31306(arg3)) {
			@Pc(26) int local26 = arg4.anInt3679 * 1676120375;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = arg2 < arg3 ? arg2 : arg3;
			@Pc(39) int local39 = arg2 >> 1;
			@Pc(43) int local43 = arg3 >> 1;
			@Pc(45) float[] local45 = arg5;
			@Pc(52) float[] local52 = new float[local39 * local43 * local26];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local28, arg1, arg2, arg3, 0, Class86_Sub3.method6289(arg4), 5126, local45, 0);
				if (local35 <= 1) {
					return;
				}
				@Pc(71) int local71 = arg2 * local26;
				for (@Pc(73) int local73 = 0; local73 < local26; local73++) {
					@Pc(78) int local78 = local73;
					@Pc(80) int local80 = local73;
					@Pc(84) int local84 = local73 + local71;
					for (@Pc(86) int local86 = 0; local86 < local43; local86++) {
						for (@Pc(91) int local91 = 0; local91 < local39; local91++) {
							@Pc(98) float local98 = local45[local80];
							local80 += local26;
							@Pc(108) float local108 = local98 + local45[local80];
							local80 += local26;
							@Pc(118) float local118 = local108 + local45[local84];
							local84 += local26;
							@Pc(128) float local128 = local118 + local45[local84];
							local84 += local26;
							local52[local78] = local128 * 0.25F;
							local78 += local26;
						}
						local80 += local71;
						local84 += local71;
					}
				}
				@Pc(158) float[] local158 = local52;
				local52 = local45;
				local45 = local158;
				arg2 = local39;
				arg3 = local43;
				local39 >>= 0x1;
				local43 >>= 0x1;
				local35 >>= 0x1;
				local28++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bx", name = "ac", descriptor = "(IIIILclient!dt;[F)V", line = 228)
	static void method17492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class212 arg4, @OriginalArg(5) float[] arg5) {
		if (arg2 > 0 && !Class562.method31306(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class562.method31306(arg3)) {
			@Pc(26) int local26 = arg4.anInt3679 * 1676120375;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = arg2 < arg3 ? arg2 : arg3;
			@Pc(39) int local39 = arg2 >> 1;
			@Pc(43) int local43 = arg3 >> 1;
			@Pc(45) float[] local45 = arg5;
			@Pc(52) float[] local52 = new float[local39 * local43 * local26];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local28, arg1, arg2, arg3, 0, Class86_Sub3.method6289(arg4), 5126, local45, 0);
				if (local35 <= 1) {
					return;
				}
				@Pc(71) int local71 = arg2 * local26;
				for (@Pc(73) int local73 = 0; local73 < local26; local73++) {
					@Pc(78) int local78 = local73;
					@Pc(80) int local80 = local73;
					@Pc(84) int local84 = local73 + local71;
					for (@Pc(86) int local86 = 0; local86 < local43; local86++) {
						for (@Pc(91) int local91 = 0; local91 < local39; local91++) {
							@Pc(98) float local98 = local45[local80];
							local80 += local26;
							@Pc(108) float local108 = local98 + local45[local80];
							local80 += local26;
							@Pc(118) float local118 = local108 + local45[local84];
							local84 += local26;
							@Pc(128) float local128 = local118 + local45[local84];
							local84 += local26;
							local52[local78] = local128 * 0.25F;
							local78 += local26;
						}
						local80 += local71;
						local84 += local71;
					}
				}
				@Pc(158) float[] local158 = local52;
				local52 = local45;
				local45 = local158;
				arg2 = local39;
				arg3 = local43;
				local39 >>= 0x1;
				local43 >>= 0x1;
				local35 >>= 0x1;
				local28++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
