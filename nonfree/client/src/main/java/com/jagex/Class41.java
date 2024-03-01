package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public abstract class Class41 implements Interface28 {

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
	static final int anInt1119 = 34067;

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
	static final int anInt1120 = 32879;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
	static final int anInt1123 = 3553;

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
	static final int anInt1124 = 0;

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "[I")
	static final int[] anIntArray164 = new int[1];

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "Lclient!jn;")
	Class259 aClass259_4 = Class259.aClass259_5;

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "Lclient!akk;")
	final Class21_Sub3_Sub1 aClass21_Sub3_Sub1_9;

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
	final int anInt1118;

	@OriginalMember(owner = "client!oc", name = "u", descriptor = "Lclient!cw;")
	final Class121 aClass121_14;

	@OriginalMember(owner = "client!oc", name = "y", descriptor = "Lclient!dj;")
	final Class127 aClass127_15;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "Z")
	boolean aBoolean240;

	@OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
	final int anInt1122;

	@OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
	int anInt1121;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!akk;ILclient!cw;Lclient!dj;IZ)V", line = 25)
	Class41(@OriginalArg(0) Class21_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass21_Sub3_Sub1_9 = arg0;
		this.anInt1118 = arg1;
		this.aClass121_14 = arg2;
		this.aClass127_15 = arg3;
		this.aBoolean240 = arg5;
		this.anInt1122 = arg4;
		OpenGL.glGenTextures(1, anIntArray164, 0);
		this.anInt1121 = anIntArray164[0];
		this.method9875();
		this.method9879(0);
	}

	@OriginalMember(owner = "client!oc", name = "ao", descriptor = "()V", line = 39)
	@Override
	public void method9872() {
		if (this.anInt1121 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(11) int local11 = this.aClass21_Sub3_Sub1_9.method17719();
		@Pc(17) int local17 = this.aClass21_Sub3_Sub1_9.anIntArray229[local11];
		if (local17 != this.anInt1118) {
			if (local17 != 0) {
				OpenGL.glBindTexture(local17, 0);
				OpenGL.glDisable(local17);
			}
			OpenGL.glEnable(this.anInt1118);
			this.aClass21_Sub3_Sub1_9.anIntArray229[local11] = this.anInt1118;
		}
		OpenGL.glBindTexture(this.anInt1118, this.anInt1121);
	}

	@OriginalMember(owner = "client!oc", name = "ab", descriptor = "()V", line = 39)
	@Override
	public void method9868() {
		if (this.anInt1121 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(11) int local11 = this.aClass21_Sub3_Sub1_9.method17719();
		@Pc(17) int local17 = this.aClass21_Sub3_Sub1_9.anIntArray229[local11];
		if (local17 != this.anInt1118) {
			if (local17 != 0) {
				OpenGL.glBindTexture(local17, 0);
				OpenGL.glDisable(local17);
			}
			OpenGL.glEnable(this.anInt1118);
			this.aClass21_Sub3_Sub1_9.anIntArray229[local11] = this.anInt1118;
		}
		OpenGL.glBindTexture(this.anInt1118, this.anInt1121);
	}

	@OriginalMember(owner = "client!oc", name = "au", descriptor = "()V", line = 39)
	@Override
	public void method9873() {
		if (this.anInt1121 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(11) int local11 = this.aClass21_Sub3_Sub1_9.method17719();
		@Pc(17) int local17 = this.aClass21_Sub3_Sub1_9.anIntArray229[local11];
		if (local17 != this.anInt1118) {
			if (local17 != 0) {
				OpenGL.glBindTexture(local17, 0);
				OpenGL.glDisable(local17);
			}
			OpenGL.glEnable(this.anInt1118);
			this.aClass21_Sub3_Sub1_9.anIntArray229[local11] = this.anInt1118;
		}
		OpenGL.glBindTexture(this.anInt1118, this.anInt1121);
	}

	@OriginalMember(owner = "client!oc", name = "ap", descriptor = "(Lclient!jn;)V", line = 54)
	@Override
	public void method9867(@OriginalArg(0) Class259 arg0) {
		if (this.aClass259_4 != arg0) {
			this.aClass259_4 = arg0;
			this.method9875();
		}
	}

	@OriginalMember(owner = "client!oc", name = "ay", descriptor = "(Lclient!jn;)V", line = 54)
	@Override
	public void method9874(@OriginalArg(0) Class259 arg0) {
		if (this.aClass259_4 != arg0) {
			this.aClass259_4 = arg0;
			this.method9875();
		}
	}

	@OriginalMember(owner = "client!oc", name = "aw", descriptor = "()V", line = 61)
	void method9875() {
		if (this.anInt1121 == 0) {
			throw new IllegalStateException("");
		}
		this.aClass21_Sub3_Sub1_9.method17513(this);
		if (this.aClass259_4 == Class259.aClass259_5) {
			OpenGL.glTexParameteri(this.anInt1118, 10241, this.aBoolean240 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt1118, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt1118, 10241, this.aBoolean240 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt1118, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!oc", name = "bf", descriptor = "()V", line = 61)
	void method9889() {
		if (this.anInt1121 == 0) {
			throw new IllegalStateException("");
		}
		this.aClass21_Sub3_Sub1_9.method17513(this);
		if (this.aClass259_4 == Class259.aClass259_5) {
			OpenGL.glTexParameteri(this.anInt1118, 10241, this.aBoolean240 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt1118, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt1118, 10241, this.aBoolean240 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt1118, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!oc", name = "bt", descriptor = "()V", line = 61)
	void method9890() {
		if (this.anInt1121 == 0) {
			throw new IllegalStateException("");
		}
		this.aClass21_Sub3_Sub1_9.method17513(this);
		if (this.aClass259_4 == Class259.aClass259_5) {
			OpenGL.glTexParameteri(this.anInt1118, 10241, this.aBoolean240 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt1118, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt1118, 10241, this.aBoolean240 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt1118, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!oc", name = "al", descriptor = "()Z", line = 74)
	boolean method9882() {
		if (this.anInt1121 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(10) int local10 = this.method9892();
		this.aClass21_Sub3_Sub1_9.method17513(this);
		if (this.aClass21_Sub3_Sub1_9.aBoolean404) {
			OpenGL.glEnable(this.anInt1121);
		}
		OpenGL.glGenerateMipmapEXT(this.anInt1118);
		if (this.aClass21_Sub3_Sub1_9.aBoolean404) {
			OpenGL.glDisable(this.anInt1121);
		}
		this.aBoolean240 = true;
		this.method9875();
		this.method9879(local10);
		return true;
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "()Z", line = 74)
	boolean method9883() {
		if (this.anInt1121 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(10) int local10 = this.method9892();
		this.aClass21_Sub3_Sub1_9.method17513(this);
		if (this.aClass21_Sub3_Sub1_9.aBoolean404) {
			OpenGL.glEnable(this.anInt1121);
		}
		OpenGL.glGenerateMipmapEXT(this.anInt1118);
		if (this.aClass21_Sub3_Sub1_9.aBoolean404) {
			OpenGL.glDisable(this.anInt1121);
		}
		this.aBoolean240 = true;
		this.method9875();
		this.method9879(local10);
		return true;
	}

	@OriginalMember(owner = "client!oc", name = "ax", descriptor = "()Z", line = 74)
	boolean method9886() {
		if (this.anInt1121 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(10) int local10 = this.method9892();
		this.aClass21_Sub3_Sub1_9.method17513(this);
		if (this.aClass21_Sub3_Sub1_9.aBoolean404) {
			OpenGL.glEnable(this.anInt1121);
		}
		OpenGL.glGenerateMipmapEXT(this.anInt1118);
		if (this.aClass21_Sub3_Sub1_9.aBoolean404) {
			OpenGL.glDisable(this.anInt1121);
		}
		this.aBoolean240 = true;
		this.method9875();
		this.method9879(local10);
		return true;
	}

	@OriginalMember(owner = "client!oc", name = "az", descriptor = "()Z", line = 74)
	boolean method9887() {
		if (this.anInt1121 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(10) int local10 = this.method9892();
		this.aClass21_Sub3_Sub1_9.method17513(this);
		if (this.aClass21_Sub3_Sub1_9.aBoolean404) {
			OpenGL.glEnable(this.anInt1121);
		}
		OpenGL.glGenerateMipmapEXT(this.anInt1118);
		if (this.aClass21_Sub3_Sub1_9.aBoolean404) {
			OpenGL.glDisable(this.anInt1121);
		}
		this.aBoolean240 = true;
		this.method9875();
		this.method9879(local10);
		return true;
	}

	@OriginalMember(owner = "client!oc", name = "bg", descriptor = "(III[I)V", line = 87)
	void method9877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (this.anInt1121 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class449.method28381(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Class449.method28381(arg2)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass121_14 == Class121.aClass121_17) {
			@Pc(40) int local40 = 0;
			@Pc(47) int local47 = arg1 < arg2 ? arg1 : arg2;
			@Pc(51) int local51 = arg1 >> 1;
			@Pc(55) int local55 = arg2 >> 1;
			@Pc(57) int[] local57 = arg3;
			@Pc(62) int[] local62 = new int[local51 * local55];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local40, Class21_Sub3_Sub1.method16347(this.aClass121_14, this.aClass127_15), arg1, arg2, 0, 32993, this.aClass21_Sub3_Sub1_9.anInt2346, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(84) int local84 = 0;
				@Pc(86) int local86 = 0;
				@Pc(90) int local90 = local86 + arg1;
				for (@Pc(92) int local92 = 0; local92 < local55; local92++) {
					for (@Pc(97) int local97 = 0; local97 < local51; local97++) {
						@Pc(105) int local105 = local57[local86++];
						@Pc(110) int local110 = local57[local86++];
						@Pc(115) int local115 = local57[local90++];
						@Pc(120) int local120 = local57[local90++];
						@Pc(126) int local126 = local105 >> 24 & 0xFF;
						@Pc(132) int local132 = local105 >> 16 & 0xFF;
						@Pc(138) int local138 = local105 >> 8 & 0xFF;
						@Pc(142) int local142 = local105 & 0xFF;
						@Pc(150) int local150 = local126 + (local110 >> 24 & 0xFF);
						@Pc(158) int local158 = local132 + (local110 >> 16 & 0xFF);
						@Pc(166) int local166 = local138 + (local110 >> 8 & 0xFF);
						@Pc(172) int local172 = local142 + (local110 & 0xFF);
						@Pc(180) int local180 = local150 + (local115 >> 24 & 0xFF);
						@Pc(188) int local188 = local158 + (local115 >> 16 & 0xFF);
						@Pc(196) int local196 = local166 + (local115 >> 8 & 0xFF);
						@Pc(202) int local202 = local172 + (local115 & 0xFF);
						@Pc(210) int local210 = local180 + (local120 >> 24 & 0xFF);
						@Pc(218) int local218 = local188 + (local120 >> 16 & 0xFF);
						@Pc(226) int local226 = local196 + (local120 >> 8 & 0xFF);
						@Pc(232) int local232 = local202 + (local120 & 0xFF);
						local62[local84++] = (local210 & 0x3FC) << 22 | (local218 & 0x3FC) << 14 | (local226 & 0x3FC) << 6 | local232 >> 2 & 0xFF;
					}
					local86 += arg1;
					local90 += arg1;
				}
				@Pc(273) int[] local273 = local62;
				local62 = local57;
				local57 = local273;
				arg1 = local51;
				arg2 = local55;
				local51 >>= 0x1;
				local55 >>= 0x1;
				local47 >>= 0x1;
				local40++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!oc", name = "br", descriptor = "(III[I)V", line = 87)
	void method9880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (this.anInt1121 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class449.method28381(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Class449.method28381(arg2)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass121_14 == Class121.aClass121_17) {
			@Pc(40) int local40 = 0;
			@Pc(47) int local47 = arg1 < arg2 ? arg1 : arg2;
			@Pc(51) int local51 = arg1 >> 1;
			@Pc(55) int local55 = arg2 >> 1;
			@Pc(57) int[] local57 = arg3;
			@Pc(62) int[] local62 = new int[local51 * local55];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local40, Class21_Sub3_Sub1.method16347(this.aClass121_14, this.aClass127_15), arg1, arg2, 0, 32993, this.aClass21_Sub3_Sub1_9.anInt2346, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(84) int local84 = 0;
				@Pc(86) int local86 = 0;
				@Pc(90) int local90 = local86 + arg1;
				for (@Pc(92) int local92 = 0; local92 < local55; local92++) {
					for (@Pc(97) int local97 = 0; local97 < local51; local97++) {
						@Pc(105) int local105 = local57[local86++];
						@Pc(110) int local110 = local57[local86++];
						@Pc(115) int local115 = local57[local90++];
						@Pc(120) int local120 = local57[local90++];
						@Pc(126) int local126 = local105 >> 24 & 0xFF;
						@Pc(132) int local132 = local105 >> 16 & 0xFF;
						@Pc(138) int local138 = local105 >> 8 & 0xFF;
						@Pc(142) int local142 = local105 & 0xFF;
						@Pc(150) int local150 = local126 + (local110 >> 24 & 0xFF);
						@Pc(158) int local158 = local132 + (local110 >> 16 & 0xFF);
						@Pc(166) int local166 = local138 + (local110 >> 8 & 0xFF);
						@Pc(172) int local172 = local142 + (local110 & 0xFF);
						@Pc(180) int local180 = local150 + (local115 >> 24 & 0xFF);
						@Pc(188) int local188 = local158 + (local115 >> 16 & 0xFF);
						@Pc(196) int local196 = local166 + (local115 >> 8 & 0xFF);
						@Pc(202) int local202 = local172 + (local115 & 0xFF);
						@Pc(210) int local210 = local180 + (local120 >> 24 & 0xFF);
						@Pc(218) int local218 = local188 + (local120 >> 16 & 0xFF);
						@Pc(226) int local226 = local196 + (local120 >> 8 & 0xFF);
						@Pc(232) int local232 = local202 + (local120 & 0xFF);
						local62[local84++] = (local210 & 0x3FC) << 22 | (local218 & 0x3FC) << 14 | (local226 & 0x3FC) << 6 | local232 >> 2 & 0xFF;
					}
					local86 += arg1;
					local90 += arg1;
				}
				@Pc(273) int[] local273 = local62;
				local62 = local57;
				local57 = local273;
				arg1 = local51;
				arg2 = local55;
				local51 >>= 0x1;
				local55 >>= 0x1;
				local47 >>= 0x1;
				local40++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!oc", name = "ac", descriptor = "(III[I)V", line = 87)
	void method9884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (this.anInt1121 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class449.method28381(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Class449.method28381(arg2)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass121_14 == Class121.aClass121_17) {
			@Pc(40) int local40 = 0;
			@Pc(47) int local47 = arg1 < arg2 ? arg1 : arg2;
			@Pc(51) int local51 = arg1 >> 1;
			@Pc(55) int local55 = arg2 >> 1;
			@Pc(57) int[] local57 = arg3;
			@Pc(62) int[] local62 = new int[local51 * local55];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local40, Class21_Sub3_Sub1.method16347(this.aClass121_14, this.aClass127_15), arg1, arg2, 0, 32993, this.aClass21_Sub3_Sub1_9.anInt2346, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(84) int local84 = 0;
				@Pc(86) int local86 = 0;
				@Pc(90) int local90 = local86 + arg1;
				for (@Pc(92) int local92 = 0; local92 < local55; local92++) {
					for (@Pc(97) int local97 = 0; local97 < local51; local97++) {
						@Pc(105) int local105 = local57[local86++];
						@Pc(110) int local110 = local57[local86++];
						@Pc(115) int local115 = local57[local90++];
						@Pc(120) int local120 = local57[local90++];
						@Pc(126) int local126 = local105 >> 24 & 0xFF;
						@Pc(132) int local132 = local105 >> 16 & 0xFF;
						@Pc(138) int local138 = local105 >> 8 & 0xFF;
						@Pc(142) int local142 = local105 & 0xFF;
						@Pc(150) int local150 = local126 + (local110 >> 24 & 0xFF);
						@Pc(158) int local158 = local132 + (local110 >> 16 & 0xFF);
						@Pc(166) int local166 = local138 + (local110 >> 8 & 0xFF);
						@Pc(172) int local172 = local142 + (local110 & 0xFF);
						@Pc(180) int local180 = local150 + (local115 >> 24 & 0xFF);
						@Pc(188) int local188 = local158 + (local115 >> 16 & 0xFF);
						@Pc(196) int local196 = local166 + (local115 >> 8 & 0xFF);
						@Pc(202) int local202 = local172 + (local115 & 0xFF);
						@Pc(210) int local210 = local180 + (local120 >> 24 & 0xFF);
						@Pc(218) int local218 = local188 + (local120 >> 16 & 0xFF);
						@Pc(226) int local226 = local196 + (local120 >> 8 & 0xFF);
						@Pc(232) int local232 = local202 + (local120 & 0xFF);
						local62[local84++] = (local210 & 0x3FC) << 22 | (local218 & 0x3FC) << 14 | (local226 & 0x3FC) << 6 | local232 >> 2 & 0xFF;
					}
					local86 += arg1;
					local90 += arg1;
				}
				@Pc(273) int[] local273 = local62;
				local62 = local57;
				local57 = local273;
				arg1 = local51;
				arg2 = local55;
				local51 >>= 0x1;
				local55 >>= 0x1;
				local47 >>= 0x1;
				local40++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!oc", name = "bk", descriptor = "(III[I)V", line = 87)
	void method9891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (this.anInt1121 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class449.method28381(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Class449.method28381(arg2)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass121_14 == Class121.aClass121_17) {
			@Pc(40) int local40 = 0;
			@Pc(47) int local47 = arg1 < arg2 ? arg1 : arg2;
			@Pc(51) int local51 = arg1 >> 1;
			@Pc(55) int local55 = arg2 >> 1;
			@Pc(57) int[] local57 = arg3;
			@Pc(62) int[] local62 = new int[local51 * local55];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local40, Class21_Sub3_Sub1.method16347(this.aClass121_14, this.aClass127_15), arg1, arg2, 0, 32993, this.aClass21_Sub3_Sub1_9.anInt2346, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(84) int local84 = 0;
				@Pc(86) int local86 = 0;
				@Pc(90) int local90 = local86 + arg1;
				for (@Pc(92) int local92 = 0; local92 < local55; local92++) {
					for (@Pc(97) int local97 = 0; local97 < local51; local97++) {
						@Pc(105) int local105 = local57[local86++];
						@Pc(110) int local110 = local57[local86++];
						@Pc(115) int local115 = local57[local90++];
						@Pc(120) int local120 = local57[local90++];
						@Pc(126) int local126 = local105 >> 24 & 0xFF;
						@Pc(132) int local132 = local105 >> 16 & 0xFF;
						@Pc(138) int local138 = local105 >> 8 & 0xFF;
						@Pc(142) int local142 = local105 & 0xFF;
						@Pc(150) int local150 = local126 + (local110 >> 24 & 0xFF);
						@Pc(158) int local158 = local132 + (local110 >> 16 & 0xFF);
						@Pc(166) int local166 = local138 + (local110 >> 8 & 0xFF);
						@Pc(172) int local172 = local142 + (local110 & 0xFF);
						@Pc(180) int local180 = local150 + (local115 >> 24 & 0xFF);
						@Pc(188) int local188 = local158 + (local115 >> 16 & 0xFF);
						@Pc(196) int local196 = local166 + (local115 >> 8 & 0xFF);
						@Pc(202) int local202 = local172 + (local115 & 0xFF);
						@Pc(210) int local210 = local180 + (local120 >> 24 & 0xFF);
						@Pc(218) int local218 = local188 + (local120 >> 16 & 0xFF);
						@Pc(226) int local226 = local196 + (local120 >> 8 & 0xFF);
						@Pc(232) int local232 = local202 + (local120 & 0xFF);
						local62[local84++] = (local210 & 0x3FC) << 22 | (local218 & 0x3FC) << 14 | (local226 & 0x3FC) << 6 | local232 >> 2 & 0xFF;
					}
					local86 += arg1;
					local90 += arg1;
				}
				@Pc(273) int[] local273 = local62;
				local62 = local57;
				local57 = local273;
				arg1 = local51;
				arg2 = local55;
				local51 >>= 0x1;
				local55 >>= 0x1;
				local47 >>= 0x1;
				local40++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!oc", name = "bw", descriptor = "(III[B)V", line = 154)
	void method9878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		if (this.anInt1121 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class449.method28381(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class449.method28381(arg2)) {
			@Pc(35) int local35 = this.aClass121_14.anInt3211 * 1629489977;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg2 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) byte[] local54 = arg3;
			@Pc(61) byte[] local61 = new byte[local48 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local37, Class21_Sub3_Sub1.method16347(this.aClass121_14, this.aClass127_15), arg1, arg2, 0, Class21_Sub3_Sub1.method16337(this.aClass121_14), 5121, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg1 * local35;
				for (@Pc(87) int local87 = 0; local87 < local35; local87++) {
					@Pc(92) int local92 = local87;
					@Pc(94) int local94 = local87;
					@Pc(98) int local98 = local87 + local85;
					for (@Pc(100) int local100 = 0; local100 < local52; local100++) {
						for (@Pc(105) int local105 = 0; local105 < local48; local105++) {
							@Pc(112) byte local112 = local54[local94];
							local94 += local35;
							@Pc(122) int local122 = local112 + local54[local94];
							local94 += local35;
							@Pc(132) int local132 = local122 + local54[local98];
							local98 += local35;
							@Pc(142) int local142 = local132 + local54[local98];
							local98 += local35;
							local61[local92] = (byte) (local142 >> 2);
							local92 += local35;
						}
						local94 += local85;
						local98 += local85;
					}
				}
				@Pc(173) byte[] local173 = local61;
				local61 = local54;
				local54 = local173;
				arg1 = local48;
				arg2 = local52;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local44 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!oc", name = "bb", descriptor = "(III[B)V", line = 154)
	void method9893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		if (this.anInt1121 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class449.method28381(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class449.method28381(arg2)) {
			@Pc(35) int local35 = this.aClass121_14.anInt3211 * 1629489977;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg2 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) byte[] local54 = arg3;
			@Pc(61) byte[] local61 = new byte[local48 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local37, Class21_Sub3_Sub1.method16347(this.aClass121_14, this.aClass127_15), arg1, arg2, 0, Class21_Sub3_Sub1.method16337(this.aClass121_14), 5121, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg1 * local35;
				for (@Pc(87) int local87 = 0; local87 < local35; local87++) {
					@Pc(92) int local92 = local87;
					@Pc(94) int local94 = local87;
					@Pc(98) int local98 = local87 + local85;
					for (@Pc(100) int local100 = 0; local100 < local52; local100++) {
						for (@Pc(105) int local105 = 0; local105 < local48; local105++) {
							@Pc(112) byte local112 = local54[local94];
							local94 += local35;
							@Pc(122) int local122 = local112 + local54[local94];
							local94 += local35;
							@Pc(132) int local132 = local122 + local54[local98];
							local98 += local35;
							@Pc(142) int local142 = local132 + local54[local98];
							local98 += local35;
							local61[local92] = (byte) (local142 >> 2);
							local92 += local35;
						}
						local94 += local85;
						local98 += local85;
					}
				}
				@Pc(173) byte[] local173 = local61;
				local61 = local54;
				local54 = local173;
				arg1 = local48;
				arg2 = local52;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local44 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!oc", name = "by", descriptor = "(III[B)V", line = 154)
	void method9894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		if (this.anInt1121 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class449.method28381(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class449.method28381(arg2)) {
			@Pc(35) int local35 = this.aClass121_14.anInt3211 * 1629489977;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg2 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) byte[] local54 = arg3;
			@Pc(61) byte[] local61 = new byte[local48 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local37, Class21_Sub3_Sub1.method16347(this.aClass121_14, this.aClass127_15), arg1, arg2, 0, Class21_Sub3_Sub1.method16337(this.aClass121_14), 5121, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg1 * local35;
				for (@Pc(87) int local87 = 0; local87 < local35; local87++) {
					@Pc(92) int local92 = local87;
					@Pc(94) int local94 = local87;
					@Pc(98) int local98 = local87 + local85;
					for (@Pc(100) int local100 = 0; local100 < local52; local100++) {
						for (@Pc(105) int local105 = 0; local105 < local48; local105++) {
							@Pc(112) byte local112 = local54[local94];
							local94 += local35;
							@Pc(122) int local122 = local112 + local54[local94];
							local94 += local35;
							@Pc(132) int local132 = local122 + local54[local98];
							local98 += local35;
							@Pc(142) int local142 = local132 + local54[local98];
							local98 += local35;
							local61[local92] = (byte) (local142 >> 2);
							local92 += local35;
						}
						local94 += local85;
						local98 += local85;
					}
				}
				@Pc(173) byte[] local173 = local61;
				local61 = local54;
				local54 = local173;
				arg1 = local48;
				arg2 = local52;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local44 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!oc", name = "bp", descriptor = "(III[F)V", line = 206)
	void method9876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3) {
		if (this.anInt1121 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class449.method28381(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class449.method28381(arg2)) {
			@Pc(35) int local35 = this.aClass121_14.anInt3211 * 1629489977;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg2 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) float[] local54 = arg3;
			@Pc(61) float[] local61 = new float[local48 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local37, Class21_Sub3_Sub1.method16347(this.aClass121_14, this.aClass127_15), arg1, arg2, 0, Class21_Sub3_Sub1.method16337(this.aClass121_14), 5126, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg1 * local35;
				for (@Pc(87) int local87 = 0; local87 < local35; local87++) {
					@Pc(92) int local92 = local87;
					@Pc(94) int local94 = local87;
					@Pc(98) int local98 = local87 + local85;
					for (@Pc(100) int local100 = 0; local100 < local52; local100++) {
						for (@Pc(105) int local105 = 0; local105 < local48; local105++) {
							@Pc(112) float local112 = local54[local94];
							local94 += local35;
							@Pc(122) float local122 = local112 + local54[local94];
							local94 += local35;
							@Pc(132) float local132 = local122 + local54[local98];
							local98 += local35;
							@Pc(142) float local142 = local132 + local54[local98];
							local98 += local35;
							local61[local92] = local142 * 0.25F;
							local92 += local35;
						}
						local94 += local85;
						local98 += local85;
					}
				}
				@Pc(172) float[] local172 = local61;
				local61 = local54;
				local54 = local172;
				arg1 = local48;
				arg2 = local52;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local44 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!oc", name = "bl", descriptor = "(III[F)V", line = 206)
	void method9895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3) {
		if (this.anInt1121 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class449.method28381(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class449.method28381(arg2)) {
			@Pc(35) int local35 = this.aClass121_14.anInt3211 * 1629489977;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg2 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) float[] local54 = arg3;
			@Pc(61) float[] local61 = new float[local48 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local37, Class21_Sub3_Sub1.method16347(this.aClass121_14, this.aClass127_15), arg1, arg2, 0, Class21_Sub3_Sub1.method16337(this.aClass121_14), 5126, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg1 * local35;
				for (@Pc(87) int local87 = 0; local87 < local35; local87++) {
					@Pc(92) int local92 = local87;
					@Pc(94) int local94 = local87;
					@Pc(98) int local98 = local87 + local85;
					for (@Pc(100) int local100 = 0; local100 < local52; local100++) {
						for (@Pc(105) int local105 = 0; local105 < local48; local105++) {
							@Pc(112) float local112 = local54[local94];
							local94 += local35;
							@Pc(122) float local122 = local112 + local54[local94];
							local94 += local35;
							@Pc(132) float local132 = local122 + local54[local98];
							local98 += local35;
							@Pc(142) float local142 = local132 + local54[local98];
							local98 += local35;
							local61[local92] = local142 * 0.25F;
							local92 += local35;
						}
						local94 += local85;
						local98 += local85;
					}
				}
				@Pc(172) float[] local172 = local61;
				local61 = local54;
				local54 = local172;
				arg1 = local48;
				arg2 = local52;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local44 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!oc", name = "bi", descriptor = "(III[F)V", line = 206)
	void method9896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3) {
		if (this.anInt1121 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class449.method28381(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class449.method28381(arg2)) {
			@Pc(35) int local35 = this.aClass121_14.anInt3211 * 1629489977;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg2 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) float[] local54 = arg3;
			@Pc(61) float[] local61 = new float[local48 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local37, Class21_Sub3_Sub1.method16347(this.aClass121_14, this.aClass127_15), arg1, arg2, 0, Class21_Sub3_Sub1.method16337(this.aClass121_14), 5126, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg1 * local35;
				for (@Pc(87) int local87 = 0; local87 < local35; local87++) {
					@Pc(92) int local92 = local87;
					@Pc(94) int local94 = local87;
					@Pc(98) int local98 = local87 + local85;
					for (@Pc(100) int local100 = 0; local100 < local52; local100++) {
						for (@Pc(105) int local105 = 0; local105 < local48; local105++) {
							@Pc(112) float local112 = local54[local94];
							local94 += local35;
							@Pc(122) float local122 = local112 + local54[local94];
							local94 += local35;
							@Pc(132) float local132 = local122 + local54[local98];
							local98 += local35;
							@Pc(142) float local142 = local132 + local54[local98];
							local98 += local35;
							local61[local92] = local142 * 0.25F;
							local92 += local35;
						}
						local94 += local85;
						local98 += local85;
					}
				}
				@Pc(172) float[] local172 = local61;
				local61 = local54;
				local54 = local172;
				arg1 = local48;
				arg2 = local52;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local44 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!oc", name = "bu", descriptor = "(III[F)V", line = 206)
	void method9897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3) {
		if (this.anInt1121 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class449.method28381(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class449.method28381(arg2)) {
			@Pc(35) int local35 = this.aClass121_14.anInt3211 * 1629489977;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg2 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) float[] local54 = arg3;
			@Pc(61) float[] local61 = new float[local48 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local37, Class21_Sub3_Sub1.method16347(this.aClass121_14, this.aClass127_15), arg1, arg2, 0, Class21_Sub3_Sub1.method16337(this.aClass121_14), 5126, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg1 * local35;
				for (@Pc(87) int local87 = 0; local87 < local35; local87++) {
					@Pc(92) int local92 = local87;
					@Pc(94) int local94 = local87;
					@Pc(98) int local98 = local87 + local85;
					for (@Pc(100) int local100 = 0; local100 < local52; local100++) {
						for (@Pc(105) int local105 = 0; local105 < local48; local105++) {
							@Pc(112) float local112 = local54[local94];
							local94 += local35;
							@Pc(122) float local122 = local112 + local54[local94];
							local94 += local35;
							@Pc(132) float local132 = local122 + local54[local98];
							local98 += local35;
							@Pc(142) float local142 = local132 + local54[local98];
							local98 += local35;
							local61[local92] = local142 * 0.25F;
							local92 += local35;
						}
						local94 += local85;
						local98 += local85;
					}
				}
				@Pc(172) float[] local172 = local61;
				local61 = local54;
				local54 = local172;
				arg1 = local48;
				arg2 = local52;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local44 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!oc", name = "ba", descriptor = "(III[F)V", line = 206)
	void method9898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3) {
		if (this.anInt1121 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class449.method28381(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class449.method28381(arg2)) {
			@Pc(35) int local35 = this.aClass121_14.anInt3211 * 1629489977;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg2 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) float[] local54 = arg3;
			@Pc(61) float[] local61 = new float[local48 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local37, Class21_Sub3_Sub1.method16347(this.aClass121_14, this.aClass127_15), arg1, arg2, 0, Class21_Sub3_Sub1.method16337(this.aClass121_14), 5126, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg1 * local35;
				for (@Pc(87) int local87 = 0; local87 < local35; local87++) {
					@Pc(92) int local92 = local87;
					@Pc(94) int local94 = local87;
					@Pc(98) int local98 = local87 + local85;
					for (@Pc(100) int local100 = 0; local100 < local52; local100++) {
						for (@Pc(105) int local105 = 0; local105 < local48; local105++) {
							@Pc(112) float local112 = local54[local94];
							local94 += local35;
							@Pc(122) float local122 = local112 + local54[local94];
							local94 += local35;
							@Pc(132) float local132 = local122 + local54[local98];
							local98 += local35;
							@Pc(142) float local142 = local132 + local54[local98];
							local98 += local35;
							local61[local92] = local142 * 0.25F;
							local92 += local35;
						}
						local94 += local85;
						local98 += local85;
					}
				}
				@Pc(172) float[] local172 = local61;
				local61 = local54;
				local54 = local172;
				arg1 = local48;
				arg2 = local52;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local44 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!oc", name = "bd", descriptor = "(I)V", line = 258)
	void method9879(@OriginalArg(0) int arg0) {
		this.aClass21_Sub3_Sub1_9.anInt2484 -= arg0;
		this.aClass21_Sub3_Sub1_9.anInt2484 += this.method9892();
	}

	@OriginalMember(owner = "client!oc", name = "bs", descriptor = "()I", line = 263)
	int method9892() {
		@Pc(14) int local14 = this.aClass121_14.anInt3211 * 1629489977 * this.aClass127_15.anInt3315 * -1246993659 * this.anInt1122;
		return this.aBoolean240 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!oc", name = "bo", descriptor = "()I", line = 263)
	int method9899() {
		@Pc(14) int local14 = this.aClass121_14.anInt3211 * 1629489977 * this.aClass127_15.anInt3315 * -1246993659 * this.anInt1122;
		return this.aBoolean240 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!oc", name = "bc", descriptor = "()I", line = 263)
	int method9900() {
		@Pc(14) int local14 = this.aClass121_14.anInt3211 * 1629489977 * this.aClass127_15.anInt3315 * -1246993659 * this.anInt1122;
		return this.aBoolean240 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!oc", name = "bn", descriptor = "()I", line = 263)
	int method9901() {
		@Pc(14) int local14 = this.aClass121_14.anInt3211 * 1629489977 * this.aClass127_15.anInt3315 * -1246993659 * this.anInt1122;
		return this.aBoolean240 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!oc", name = "y", descriptor = "()V", line = 268)
	@Override
	public void method27208() {
		if (this.anInt1121 != 0) {
			this.aClass21_Sub3_Sub1_9.anInt2484 -= this.method9892();
			@Pc(13) int[] local13 = new int[] { this.anInt1121 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt1121 = 0;
		}
	}

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "()V", line = 268)
	@Override
	public void method27209() {
		if (this.anInt1121 != 0) {
			this.aClass21_Sub3_Sub1_9.anInt2484 -= this.method9892();
			@Pc(13) int[] local13 = new int[] { this.anInt1121 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt1121 = 0;
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "()V", line = 268)
	@Override
	public void method27210() {
		if (this.anInt1121 != 0) {
			this.aClass21_Sub3_Sub1_9.anInt2484 -= this.method9892();
			@Pc(13) int[] local13 = new int[] { this.anInt1121 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt1121 = 0;
		}
	}

	@OriginalMember(owner = "client!oc", name = "bm", descriptor = "()V", line = 278)
	void method9881() {
		if (this.anInt1121 != 0) {
			this.aClass21_Sub3_Sub1_9.method16341(this.anInt1121, this.method9892());
			this.anInt1121 = 0;
		}
	}

	@OriginalMember(owner = "client!oc", name = "bx", descriptor = "()V", line = 278)
	void method9888() {
		if (this.anInt1121 != 0) {
			this.aClass21_Sub3_Sub1_9.method16341(this.anInt1121, this.method9892());
			this.anInt1121 = 0;
		}
	}

	@OriginalMember(owner = "client!oc", name = "be", descriptor = "()V", line = 278)
	void method9902() {
		if (this.anInt1121 != 0) {
			this.aClass21_Sub3_Sub1_9.method16341(this.anInt1121, this.method9892());
			this.anInt1121 = 0;
		}
	}

	@OriginalMember(owner = "client!oc", name = "finalize", descriptor = "()V", line = 285)
	@Override
	void finalize() throws Throwable {
		this.method9881();
		super.finalize();
	}

	@OriginalMember(owner = "client!oc", name = "hh", descriptor = "()V", line = 285)
	void method9885() throws Throwable {
		this.method9881();
		super.finalize();
	}
}
