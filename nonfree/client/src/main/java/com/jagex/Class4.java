package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public abstract class Class4 {

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
	static final int anInt5554 = 34037;

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
	static final int anInt5555 = 5121;

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
	static final int anInt5556 = 34067;

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
	static final int anInt5557 = 32879;

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
	static final int anInt5561 = 3552;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
	static final int anInt5562 = 3553;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "[I")
	static final int[] anIntArray527 = new int[1];

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "Z")
	boolean aBoolean852 = false;

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "Lclient!abt;")
	final Class21_Sub2 aClass21_Sub2_47;

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
	final int anInt5560;

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "Lclient!cw;")
	final Class121 aClass121_28;

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "Lclient!dj;")
	final Class127 aClass127_33;

	@OriginalMember(owner = "client!bf", name = "z", descriptor = "Z")
	boolean aBoolean851;

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
	final int anInt5558;

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
	int anInt5559;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!abt;ILclient!cw;Lclient!dj;IZ)V", line = 25)
	Class4(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass21_Sub2_47 = arg0;
		this.anInt5560 = arg1;
		this.aClass121_28 = arg2;
		this.aClass127_33 = arg3;
		this.aBoolean851 = arg5;
		this.anInt5558 = arg4;
		OpenGL.glGenTextures(1, anIntArray527, 0);
		this.anInt5559 = anIntArray527[0];
		this.method33719(0);
	}

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "(Z)V", line = 38)
	void method33712(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean852 != arg0) {
			this.aBoolean852 = arg0;
			this.method33738();
		}
	}

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "(Z)V", line = 38)
	void method33725(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean852 != arg0) {
			this.aBoolean852 = arg0;
			this.method33738();
		}
	}

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "(Z)V", line = 38)
	void method33729(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean852 != arg0) {
			this.aBoolean852 = arg0;
			this.method33738();
		}
	}

	@OriginalMember(owner = "client!bf", name = "z", descriptor = "(Z)V", line = 38)
	void method33733(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean852 != arg0) {
			this.aBoolean852 = arg0;
			this.method33738();
		}
	}

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "()V", line = 45)
	void method33718() {
		this.aClass21_Sub2_47.method4074(this);
		if (this.aBoolean852) {
			OpenGL.glTexParameteri(this.anInt5560, 10241, this.aBoolean851 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt5560, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt5560, 10241, this.aBoolean851 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt5560, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "()V", line = 45)
	void method33736() {
		this.aClass21_Sub2_47.method4074(this);
		if (this.aBoolean852) {
			OpenGL.glTexParameteri(this.anInt5560, 10241, this.aBoolean851 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt5560, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt5560, 10241, this.aBoolean851 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt5560, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "()V", line = 45)
	void method33738() {
		this.aClass21_Sub2_47.method4074(this);
		if (this.aBoolean852) {
			OpenGL.glTexParameteri(this.anInt5560, 10241, this.aBoolean851 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt5560, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt5560, 10241, this.aBoolean851 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt5560, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "()Z", line = 57)
	boolean method33714() {
		if (!this.aClass21_Sub2_47.aBoolean77) {
			return false;
		}
		@Pc(6) int local6 = this.method33720();
		this.aClass21_Sub2_47.method4074(this);
		OpenGL.glGenerateMipmapEXT(this.anInt5560);
		this.aBoolean851 = true;
		this.method33738();
		this.method33719(local6);
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "()Z", line = 57)
	boolean method33716() {
		if (!this.aClass21_Sub2_47.aBoolean77) {
			return false;
		}
		@Pc(6) int local6 = this.method33720();
		this.aClass21_Sub2_47.method4074(this);
		OpenGL.glGenerateMipmapEXT(this.anInt5560);
		this.aBoolean851 = true;
		this.method33738();
		this.method33719(local6);
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "()Z", line = 57)
	boolean method33731() {
		if (!this.aClass21_Sub2_47.aBoolean77) {
			return false;
		}
		@Pc(6) int local6 = this.method33720();
		this.aClass21_Sub2_47.method4074(this);
		OpenGL.glGenerateMipmapEXT(this.anInt5560);
		this.aBoolean851 = true;
		this.method33738();
		this.method33719(local6);
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "(Z)V", line = 70)
	void method33715(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean851 != arg0) {
			@Pc(6) int local6 = this.method33720();
			this.aBoolean851 = true;
			this.method33738();
			this.method33719(local6);
		}
	}

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "(Z)V", line = 70)
	void method33730(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean851 != arg0) {
			@Pc(6) int local6 = this.method33720();
			this.aBoolean851 = true;
			this.method33738();
			this.method33719(local6);
		}
	}

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "(Z)V", line = 70)
	void method33740(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean851 != arg0) {
			@Pc(6) int local6 = this.method33720();
			this.aBoolean851 = true;
			this.method33738();
			this.method33719(local6);
		}
	}

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "()V", line = 79)
	void method33728() {
		if (this.anInt5559 != 0) {
			this.aClass21_Sub2_47.anInt409 -= this.method33720();
			@Pc(13) int[] local13 = new int[] { this.anInt5559 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt5559 = 0;
		}
	}

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "()V", line = 79)
	void method33739() {
		if (this.anInt5559 != 0) {
			this.aClass21_Sub2_47.anInt409 -= this.method33720();
			@Pc(13) int[] local13 = new int[] { this.anInt5559 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt5559 = 0;
		}
	}

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "()V", line = 89)
	void method33717() {
		if (this.anInt5559 != 0) {
			this.aClass21_Sub2_47.method4044(this.anInt5559, this.method33720());
			this.anInt5559 = 0;
		}
	}

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "()V", line = 89)
	void method33726() {
		if (this.anInt5559 != 0) {
			this.aClass21_Sub2_47.method4044(this.anInt5559, this.method33720());
			this.anInt5559 = 0;
		}
	}

	@OriginalMember(owner = "client!bf", name = "hh", descriptor = "()V", line = 96)
	void method33724() throws Throwable {
		this.method33717();
		super.finalize();
	}

	@OriginalMember(owner = "client!bf", name = "finalize", descriptor = "()V", line = 96)
	@Override
	void finalize() throws Throwable {
		this.method33717();
		super.finalize();
	}

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "(I)V", line = 101)
	void method33719(@OriginalArg(0) int arg0) {
		this.aClass21_Sub2_47.anInt409 -= arg0;
		this.aClass21_Sub2_47.anInt409 += this.method33720();
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)V", line = 101)
	void method33732(@OriginalArg(0) int arg0) {
		this.aClass21_Sub2_47.anInt409 -= arg0;
		this.aClass21_Sub2_47.anInt409 += this.method33720();
	}

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "(I)V", line = 101)
	void method33734(@OriginalArg(0) int arg0) {
		this.aClass21_Sub2_47.anInt409 -= arg0;
		this.aClass21_Sub2_47.anInt409 += this.method33720();
	}

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "(I)V", line = 101)
	void method33735(@OriginalArg(0) int arg0) {
		this.aClass21_Sub2_47.anInt409 -= arg0;
		this.aClass21_Sub2_47.anInt409 += this.method33720();
	}

	@OriginalMember(owner = "client!bf", name = "af", descriptor = "()I", line = 106)
	int method33713() {
		@Pc(14) int local14 = this.aClass121_28.anInt3211 * 1629489977 * this.aClass127_33.anInt3315 * -1246993659 * this.anInt5558;
		return this.aBoolean851 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "()I", line = 106)
	int method33720() {
		@Pc(14) int local14 = this.aClass121_28.anInt3211 * 1629489977 * this.aClass127_33.anInt3315 * -1246993659 * this.anInt5558;
		return this.aBoolean851 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!bf", name = "at", descriptor = "()I", line = 106)
	int method33727() {
		@Pc(14) int local14 = this.aClass121_28.anInt3211 * 1629489977 * this.aClass127_33.anInt3315 * -1246993659 * this.anInt5558;
		return this.aBoolean851 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "()I", line = 106)
	int method33737() {
		@Pc(14) int local14 = this.aClass121_28.anInt3211 * 1629489977 * this.aClass127_33.anInt3315 * -1246993659 * this.anInt5558;
		return this.aBoolean851 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "(IIIIII[I)V", line = 111)
	static void method33721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		if (arg2 > 0 && !Class449.method28381(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Class449.method28381(arg3)) {
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

	@OriginalMember(owner = "client!bf", name = "ak", descriptor = "(IIIILclient!cw;[B)V", line = 177)
	static void method33711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class121 arg4, @OriginalArg(5) byte[] arg5) {
		if (arg2 > 0 && !Class449.method28381(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class449.method28381(arg3)) {
			@Pc(26) int local26 = arg4.anInt3211 * 1629489977;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = arg2 < arg3 ? arg2 : arg3;
			@Pc(39) int local39 = arg2 >> 1;
			@Pc(43) int local43 = arg3 >> 1;
			@Pc(45) byte[] local45 = arg5;
			@Pc(52) byte[] local52 = new byte[local39 * local43 * local26];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local28, arg1, arg2, arg3, 0, Class21_Sub2.method4149(arg4), 5121, local45, 0);
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

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIIILclient!cw;[B)V", line = 177)
	static void method33722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class121 arg4, @OriginalArg(5) byte[] arg5) {
		if (arg2 > 0 && !Class449.method28381(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class449.method28381(arg3)) {
			@Pc(26) int local26 = arg4.anInt3211 * 1629489977;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = arg2 < arg3 ? arg2 : arg3;
			@Pc(39) int local39 = arg2 >> 1;
			@Pc(43) int local43 = arg3 >> 1;
			@Pc(45) byte[] local45 = arg5;
			@Pc(52) byte[] local52 = new byte[local39 * local43 * local26];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local28, arg1, arg2, arg3, 0, Class21_Sub2.method4149(arg4), 5121, local45, 0);
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

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(IIIILclient!cw;[F)V", line = 228)
	static void method33723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class121 arg4, @OriginalArg(5) float[] arg5) {
		if (arg2 > 0 && !Class449.method28381(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class449.method28381(arg3)) {
			@Pc(26) int local26 = arg4.anInt3211 * 1629489977;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = arg2 < arg3 ? arg2 : arg3;
			@Pc(39) int local39 = arg2 >> 1;
			@Pc(43) int local43 = arg3 >> 1;
			@Pc(45) float[] local45 = arg5;
			@Pc(52) float[] local52 = new float[local39 * local43 * local26];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local28, arg1, arg2, arg3, 0, Class21_Sub2.method4149(arg4), 5126, local45, 0);
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

	@OriginalMember(owner = "client!bf", name = "aa", descriptor = "(IIIILclient!cw;[F)V", line = 228)
	static void method33741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class121 arg4, @OriginalArg(5) float[] arg5) {
		if (arg2 > 0 && !Class449.method28381(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class449.method28381(arg3)) {
			@Pc(26) int local26 = arg4.anInt3211 * 1629489977;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = arg2 < arg3 ? arg2 : arg3;
			@Pc(39) int local39 = arg2 >> 1;
			@Pc(43) int local43 = arg3 >> 1;
			@Pc(45) float[] local45 = arg5;
			@Pc(52) float[] local52 = new float[local39 * local43 * local26];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local28, arg1, arg2, arg3, 0, Class21_Sub2.method4149(arg4), 5126, local45, 0);
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

	@OriginalMember(owner = "client!bf", name = "ah", descriptor = "(IIIILclient!cw;[F)V", line = 228)
	static void method33742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class121 arg4, @OriginalArg(5) float[] arg5) {
		if (arg2 > 0 && !Class449.method28381(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class449.method28381(arg3)) {
			@Pc(26) int local26 = arg4.anInt3211 * 1629489977;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = arg2 < arg3 ? arg2 : arg3;
			@Pc(39) int local39 = arg2 >> 1;
			@Pc(43) int local43 = arg3 >> 1;
			@Pc(45) float[] local45 = arg5;
			@Pc(52) float[] local52 = new float[local39 * local43 * local26];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local28, arg1, arg2, arg3, 0, Class21_Sub2.method4149(arg4), 5126, local45, 0);
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
