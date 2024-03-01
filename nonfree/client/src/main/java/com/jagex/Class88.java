package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public abstract class Class88 {

	@OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
	static final int anInt2536 = 34037;

	@OriginalMember(owner = "client!bq", name = "w", descriptor = "I")
	static final int anInt2537 = 5121;

	@OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
	static final int anInt2538 = 34067;

	@OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
	static final int anInt2539 = 32879;

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
	static final int anInt2540 = 3552;

	@OriginalMember(owner = "client!bq", name = "n", descriptor = "I")
	static final int anInt2544 = 3553;

	@OriginalMember(owner = "client!bq", name = "o", descriptor = "[I")
	static final int[] anIntArray210 = new int[1];

	@OriginalMember(owner = "client!bq", name = "r", descriptor = "Z")
	boolean aBoolean383 = false;

	@OriginalMember(owner = "client!bq", name = "l", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_34;

	@OriginalMember(owner = "client!bq", name = "z", descriptor = "I")
	final int anInt2543;

	@OriginalMember(owner = "client!bq", name = "p", descriptor = "Lclient!ck;")
	final Class206 aClass206_16;

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "Lclient!dg;")
	final Class226 aClass226_17;

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "Z")
	boolean aBoolean382;

	@OriginalMember(owner = "client!bq", name = "v", descriptor = "I")
	final int anInt2542;

	@OriginalMember(owner = "client!bq", name = "u", descriptor = "I")
	int anInt2541;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!afa;ILclient!ck;Lclient!dg;IZ)V", line = 25)
	Class88(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) Class226 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass104_Sub1_34 = arg0;
		this.anInt2543 = arg1;
		this.aClass206_16 = arg2;
		this.aClass226_17 = arg3;
		this.aBoolean382 = arg5;
		this.anInt2542 = arg4;
		OpenGL.glGenTextures(1, anIntArray210, 0);
		this.anInt2541 = anIntArray210[0];
		this.method18047(0);
	}

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "(Z)V", line = 38)
	void method18041(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean383 != arg0) {
			this.aBoolean383 = arg0;
			this.method18042();
		}
	}

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(Z)V", line = 38)
	void method18053(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean383 != arg0) {
			this.aBoolean383 = arg0;
			this.method18042();
		}
	}

	@OriginalMember(owner = "client!bq", name = "r", descriptor = "(Z)V", line = 38)
	void method18054(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean383 != arg0) {
			this.aBoolean383 = arg0;
			this.method18042();
		}
	}

	@OriginalMember(owner = "client!bq", name = "n", descriptor = "()V", line = 45)
	void method18042() {
		this.aClass104_Sub1_34.method3804(this);
		if (this.aBoolean383) {
			OpenGL.glTexParameteri(this.anInt2543, 10241, this.aBoolean382 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt2543, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt2543, 10241, this.aBoolean382 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt2543, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!bq", name = "v", descriptor = "()V", line = 45)
	void method18055() {
		this.aClass104_Sub1_34.method3804(this);
		if (this.aBoolean383) {
			OpenGL.glTexParameteri(this.anInt2543, 10241, this.aBoolean382 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt2543, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt2543, 10241, this.aBoolean382 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt2543, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!bq", name = "o", descriptor = "()V", line = 45)
	void method18072() {
		this.aClass104_Sub1_34.method3804(this);
		if (this.aBoolean383) {
			OpenGL.glTexParameteri(this.anInt2543, 10241, this.aBoolean382 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt2543, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt2543, 10241, this.aBoolean382 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt2543, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!bq", name = "m", descriptor = "()Z", line = 57)
	boolean method18043() {
		if (!this.aClass104_Sub1_34.aBoolean90) {
			return false;
		}
		@Pc(6) int local6 = this.method18058();
		this.aClass104_Sub1_34.method3804(this);
		OpenGL.glGenerateMipmapEXT(this.anInt2543);
		this.aBoolean382 = true;
		this.method18042();
		this.method18047(local6);
		return true;
	}

	@OriginalMember(owner = "client!bq", name = "y", descriptor = "()Z", line = 57)
	boolean method18057() {
		if (!this.aClass104_Sub1_34.aBoolean90) {
			return false;
		}
		@Pc(6) int local6 = this.method18058();
		this.aClass104_Sub1_34.method3804(this);
		OpenGL.glGenerateMipmapEXT(this.anInt2543);
		this.aBoolean382 = true;
		this.method18042();
		this.method18047(local6);
		return true;
	}

	@OriginalMember(owner = "client!bq", name = "s", descriptor = "()Z", line = 57)
	boolean method18074() {
		if (!this.aClass104_Sub1_34.aBoolean90) {
			return false;
		}
		@Pc(6) int local6 = this.method18058();
		this.aClass104_Sub1_34.method3804(this);
		OpenGL.glGenerateMipmapEXT(this.anInt2543);
		this.aBoolean382 = true;
		this.method18042();
		this.method18047(local6);
		return true;
	}

	@OriginalMember(owner = "client!bq", name = "q", descriptor = "(Z)V", line = 70)
	void method18059(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean382 != arg0) {
			@Pc(6) int local6 = this.method18058();
			this.aBoolean382 = true;
			this.method18042();
			this.method18047(local6);
		}
	}

	@OriginalMember(owner = "client!bq", name = "k", descriptor = "(Z)V", line = 70)
	void method18077(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean382 != arg0) {
			@Pc(6) int local6 = this.method18058();
			this.aBoolean382 = true;
			this.method18042();
			this.method18047(local6);
		}
	}

	@OriginalMember(owner = "client!bq", name = "x", descriptor = "()V", line = 79)
	void method18045() {
		if (this.anInt2541 != 0) {
			this.aClass104_Sub1_34.anInt533 -= this.method18058();
			@Pc(13) int[] local13 = new int[] { this.anInt2541 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt2541 = 0;
		}
	}

	@OriginalMember(owner = "client!bq", name = "f", descriptor = "()V", line = 79)
	void method18048() {
		if (this.anInt2541 != 0) {
			this.aClass104_Sub1_34.anInt533 -= this.method18058();
			@Pc(13) int[] local13 = new int[] { this.anInt2541 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt2541 = 0;
		}
	}

	@OriginalMember(owner = "client!bq", name = "h", descriptor = "()V", line = 79)
	void method18051() {
		if (this.anInt2541 != 0) {
			this.aClass104_Sub1_34.anInt533 -= this.method18058();
			@Pc(13) int[] local13 = new int[] { this.anInt2541 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt2541 = 0;
		}
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "()V", line = 79)
	void method18060() {
		if (this.anInt2541 != 0) {
			this.aClass104_Sub1_34.anInt533 -= this.method18058();
			@Pc(13) int[] local13 = new int[] { this.anInt2541 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt2541 = 0;
		}
	}

	@OriginalMember(owner = "client!bq", name = "w", descriptor = "()V", line = 89)
	void method18046() {
		if (this.anInt2541 != 0) {
			this.aClass104_Sub1_34.method3849(this.anInt2541, this.method18058());
			this.anInt2541 = 0;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "()V", line = 89)
	void method18062() {
		if (this.anInt2541 != 0) {
			this.aClass104_Sub1_34.method3849(this.anInt2541, this.method18058());
			this.anInt2541 = 0;
		}
	}

	@OriginalMember(owner = "client!bq", name = "g", descriptor = "()V", line = 89)
	void method18063() {
		if (this.anInt2541 != 0) {
			this.aClass104_Sub1_34.method3849(this.anInt2541, this.method18058());
			this.anInt2541 = 0;
		}
	}

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "()V", line = 89)
	void method18064() {
		if (this.anInt2541 != 0) {
			this.aClass104_Sub1_34.method3849(this.anInt2541, this.method18058());
			this.anInt2541 = 0;
		}
	}

	@OriginalMember(owner = "client!bq", name = "j", descriptor = "()V", line = 89)
	void method18065() {
		if (this.anInt2541 != 0) {
			this.aClass104_Sub1_34.method3849(this.anInt2541, this.method18058());
			this.anInt2541 = 0;
		}
	}

	@OriginalMember(owner = "client!bq", name = "finalize", descriptor = "()V", line = 96)
	@Override
	void finalize() throws Throwable {
		this.method18046();
		super.finalize();
	}

	@OriginalMember(owner = "client!bq", name = "hl", descriptor = "()V", line = 96)
	void method18052() throws Throwable {
		this.method18046();
		super.finalize();
	}

	@OriginalMember(owner = "client!bq", name = "l", descriptor = "(I)V", line = 101)
	void method18047(@OriginalArg(0) int arg0) {
		this.aClass104_Sub1_34.anInt533 -= arg0;
		this.aClass104_Sub1_34.anInt533 += this.method18058();
	}

	@OriginalMember(owner = "client!bq", name = "t", descriptor = "(I)V", line = 101)
	void method18056(@OriginalArg(0) int arg0) {
		this.aClass104_Sub1_34.anInt533 -= arg0;
		this.aClass104_Sub1_34.anInt533 += this.method18058();
	}

	@OriginalMember(owner = "client!bq", name = "u", descriptor = "()I", line = 106)
	int method18058() {
		@Pc(14) int local14 = this.aClass206_16.anInt3389 * -1639868421 * this.aClass226_17.anInt3646 * -1066472467 * this.anInt2542;
		return this.aBoolean382 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!bq", name = "ae", descriptor = "()I", line = 106)
	int method18067() {
		@Pc(14) int local14 = this.aClass206_16.anInt3389 * -1639868421 * this.aClass226_17.anInt3646 * -1066472467 * this.anInt2542;
		return this.aBoolean382 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!bq", name = "ac", descriptor = "(IIIIII[I)V", line = 111)
	static void method18040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		if (arg2 > 0 && !Class364.method27900(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Class364.method27900(arg3)) {
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

	@OriginalMember(owner = "client!bq", name = "al", descriptor = "(IIIIII[I)V", line = 111)
	static void method18044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		if (arg2 > 0 && !Class364.method27900(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Class364.method27900(arg3)) {
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

	@OriginalMember(owner = "client!bq", name = "z", descriptor = "(IIIIII[I)V", line = 111)
	static void method18068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		if (arg2 > 0 && !Class364.method27900(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Class364.method27900(arg3)) {
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

	@OriginalMember(owner = "client!bq", name = "ah", descriptor = "(IIIIII[I)V", line = 111)
	static void method18069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		if (arg2 > 0 && !Class364.method27900(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Class364.method27900(arg3)) {
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

	@OriginalMember(owner = "client!bq", name = "ag", descriptor = "(IIIIII[I)V", line = 111)
	static void method18071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		if (arg2 > 0 && !Class364.method27900(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Class364.method27900(arg3)) {
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

	@OriginalMember(owner = "client!bq", name = "ai", descriptor = "(IIIIII[I)V", line = 111)
	static void method18075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		if (arg2 > 0 && !Class364.method27900(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Class364.method27900(arg3)) {
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

	@OriginalMember(owner = "client!bq", name = "as", descriptor = "(IIIILclient!ck;[B)V", line = 177)
	static void method18061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class206 arg4, @OriginalArg(5) byte[] arg5) {
		if (arg2 > 0 && !Class364.method27900(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class364.method27900(arg3)) {
			@Pc(26) int local26 = arg4.anInt3389 * -1639868421;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = arg2 < arg3 ? arg2 : arg3;
			@Pc(39) int local39 = arg2 >> 1;
			@Pc(43) int local43 = arg3 >> 1;
			@Pc(45) byte[] local45 = arg5;
			@Pc(52) byte[] local52 = new byte[local39 * local43 * local26];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local28, arg1, arg2, arg3, 0, Class104_Sub1.method3926(arg4), 5121, local45, 0);
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

	@OriginalMember(owner = "client!bq", name = "p", descriptor = "(IIIILclient!ck;[B)V", line = 177)
	static void method18066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class206 arg4, @OriginalArg(5) byte[] arg5) {
		if (arg2 > 0 && !Class364.method27900(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class364.method27900(arg3)) {
			@Pc(26) int local26 = arg4.anInt3389 * -1639868421;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = arg2 < arg3 ? arg2 : arg3;
			@Pc(39) int local39 = arg2 >> 1;
			@Pc(43) int local43 = arg3 >> 1;
			@Pc(45) byte[] local45 = arg5;
			@Pc(52) byte[] local52 = new byte[local39 * local43 * local26];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local28, arg1, arg2, arg3, 0, Class104_Sub1.method3926(arg4), 5121, local45, 0);
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

	@OriginalMember(owner = "client!bq", name = "aw", descriptor = "(IIIILclient!ck;[B)V", line = 177)
	static void method18073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class206 arg4, @OriginalArg(5) byte[] arg5) {
		if (arg2 > 0 && !Class364.method27900(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class364.method27900(arg3)) {
			@Pc(26) int local26 = arg4.anInt3389 * -1639868421;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = arg2 < arg3 ? arg2 : arg3;
			@Pc(39) int local39 = arg2 >> 1;
			@Pc(43) int local43 = arg3 >> 1;
			@Pc(45) byte[] local45 = arg5;
			@Pc(52) byte[] local52 = new byte[local39 * local43 * local26];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local28, arg1, arg2, arg3, 0, Class104_Sub1.method3926(arg4), 5121, local45, 0);
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

	@OriginalMember(owner = "client!bq", name = "at", descriptor = "(IIIILclient!ck;[F)V", line = 228)
	static void method18049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class206 arg4, @OriginalArg(5) float[] arg5) {
		if (arg2 > 0 && !Class364.method27900(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class364.method27900(arg3)) {
			@Pc(26) int local26 = arg4.anInt3389 * -1639868421;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = arg2 < arg3 ? arg2 : arg3;
			@Pc(39) int local39 = arg2 >> 1;
			@Pc(43) int local43 = arg3 >> 1;
			@Pc(45) float[] local45 = arg5;
			@Pc(52) float[] local52 = new float[local39 * local43 * local26];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local28, arg1, arg2, arg3, 0, Class104_Sub1.method3926(arg4), 5126, local45, 0);
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

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "(IIIILclient!ck;[F)V", line = 228)
	static void method18050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class206 arg4, @OriginalArg(5) float[] arg5) {
		if (arg2 > 0 && !Class364.method27900(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class364.method27900(arg3)) {
			@Pc(26) int local26 = arg4.anInt3389 * -1639868421;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = arg2 < arg3 ? arg2 : arg3;
			@Pc(39) int local39 = arg2 >> 1;
			@Pc(43) int local43 = arg3 >> 1;
			@Pc(45) float[] local45 = arg5;
			@Pc(52) float[] local52 = new float[local39 * local43 * local26];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local28, arg1, arg2, arg3, 0, Class104_Sub1.method3926(arg4), 5126, local45, 0);
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

	@OriginalMember(owner = "client!bq", name = "am", descriptor = "(IIIILclient!ck;[F)V", line = 228)
	static void method18070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class206 arg4, @OriginalArg(5) float[] arg5) {
		if (arg2 > 0 && !Class364.method27900(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class364.method27900(arg3)) {
			@Pc(26) int local26 = arg4.anInt3389 * -1639868421;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = arg2 < arg3 ? arg2 : arg3;
			@Pc(39) int local39 = arg2 >> 1;
			@Pc(43) int local43 = arg3 >> 1;
			@Pc(45) float[] local45 = arg5;
			@Pc(52) float[] local52 = new float[local39 * local43 * local26];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local28, arg1, arg2, arg3, 0, Class104_Sub1.method3926(arg4), 5126, local45, 0);
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

	@OriginalMember(owner = "client!bq", name = "ad", descriptor = "(IIIILclient!ck;[F)V", line = 228)
	static void method18076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class206 arg4, @OriginalArg(5) float[] arg5) {
		if (arg2 > 0 && !Class364.method27900(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class364.method27900(arg3)) {
			@Pc(26) int local26 = arg4.anInt3389 * -1639868421;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = arg2 < arg3 ? arg2 : arg3;
			@Pc(39) int local39 = arg2 >> 1;
			@Pc(43) int local43 = arg3 >> 1;
			@Pc(45) float[] local45 = arg5;
			@Pc(52) float[] local52 = new float[local39 * local43 * local26];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local28, arg1, arg2, arg3, 0, Class104_Sub1.method3926(arg4), 5126, local45, 0);
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

	@OriginalMember(owner = "client!bq", name = "au", descriptor = "(IIIILclient!ck;[F)V", line = 228)
	static void method18078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class206 arg4, @OriginalArg(5) float[] arg5) {
		if (arg2 > 0 && !Class364.method27900(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class364.method27900(arg3)) {
			@Pc(26) int local26 = arg4.anInt3389 * -1639868421;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = arg2 < arg3 ? arg2 : arg3;
			@Pc(39) int local39 = arg2 >> 1;
			@Pc(43) int local43 = arg3 >> 1;
			@Pc(45) float[] local45 = arg5;
			@Pc(52) float[] local52 = new float[local39 * local43 * local26];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local28, arg1, arg2, arg3, 0, Class104_Sub1.method3926(arg4), 5126, local45, 0);
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
