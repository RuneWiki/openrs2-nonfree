package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aax")
public class Class7_Sub8 extends Class7 {

	@OriginalMember(owner = "client!aax", name = "x", descriptor = "F")
	static final float aFloat2 = 26.0F;

	@OriginalMember(owner = "client!aax", name = "g", descriptor = "I")
	static final int anInt126 = 5;

	@OriginalMember(owner = "client!aax", name = "l", descriptor = "I")
	static final int anInt127 = 128;

	@OriginalMember(owner = "client!aax", name = "h", descriptor = "I")
	static final int anInt128 = 24;

	@OriginalMember(owner = "client!aax", name = "a", descriptor = "I")
	static final int anInt129 = 128;

	@OriginalMember(owner = "client!aax", name = "s", descriptor = "F")
	static final float aFloat3 = -12.0F;

	@OriginalMember(owner = "client!aax", name = "y", descriptor = "C")
	static final char aChar7 = '\u0000';

	@OriginalMember(owner = "client!aax", name = "b", descriptor = "C")
	static final char aChar8 = '\u0001';

	@OriginalMember(owner = "client!aax", name = "u", descriptor = "F")
	static final float aFloat4 = 0.0F;

	@OriginalMember(owner = "client!aax", name = "c", descriptor = "Lclient!bg;")
	Class90 aClass90_4;

	@OriginalMember(owner = "client!aax", name = "z", descriptor = "Z")
	boolean aBoolean39;

	@OriginalMember(owner = "client!aax", name = "j", descriptor = "Z")
	boolean aBoolean38 = false;

	@OriginalMember(owner = "client!aax", name = "n", descriptor = "[Lclient!aae;")
	Class4_Sub2[] aClass4_Sub2Array1;

	@OriginalMember(owner = "client!aax", name = "<init>", descriptor = "(Lclient!abt;)V", line = 25)
	Class7_Sub8(@OriginalArg(0) Class21_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean84) {
			@Pc(12) byte[][] local12 = new byte[6][16384];
			@Pc(16) byte[][] local16 = new byte[6][16384];
			@Pc(20) byte[][] local20 = new byte[6][16384];
			@Pc(22) int local22 = 0;
			@Pc(29) Class320 local29 = new Class320(0.0F, -1.0F, 0.0F);
			for (@Pc(31) int local31 = 0; local31 < 128; local31++) {
				for (@Pc(36) int local36 = 0; local36 < 128; local36++) {
					@Pc(48) float local48 = (float) local36 * 2.0F / 128.0F - 1.0F;
					@Pc(57) float local57 = (float) local31 * 2.0F / 128.0F - 1.0F;
					@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local48 * local48 + 1.0F + local57 * local57)));
					@Pc(76) float local76 = local48 * local72;
					@Pc(80) float local80 = local57 * local72;
					for (@Pc(82) int local82 = 0; local82 < 6; local82++) {
						@Pc(96) Class320 local96;
						if (local82 == 0) {
							local96 = new Class320(-local72, -local76, local80);
						} else if (local82 == 1) {
							local96 = new Class320(local72, local76, local80);
						} else if (local82 == 2) {
							local96 = new Class320(-local76, local80, -local72);
						} else if (local82 == 3) {
							local96 = new Class320(-local76, -local80, local72);
						} else if (local82 == 4) {
							local96 = new Class320(local76, local72, -local80);
						} else {
							local96 = new Class320(local76, -local72, local80);
						}
						@Pc(158) float local158 = local96.method25877(local29);
						@Pc(164) float local164 = Math.max(0.0F, Math.min(1.0F, local158));
						@Pc(178) int local178;
						@Pc(188) int local188;
						@Pc(198) int local198;
						if (local164 > 0.0F) {
							local178 = Math.min(255, (int) (Math.pow((double) local164, 128.0D) * 400.0D));
							local188 = Math.min(255, (int) (Math.pow((double) local164, 24.0D) * 400.0D));
							local198 = Math.min(255, (int) (Math.pow((double) local164, 5.0D) * 400.0D));
						} else {
							local198 = 0;
							local188 = 0;
							local178 = 0;
						}
						local16[local82][local22] = (byte) local178;
						local20[local82][local22] = (byte) local188;
						local12[local82][local22] = (byte) local198;
					}
					local22++;
				}
			}
			this.aClass4_Sub2Array1 = new Class4_Sub2[3];
			this.aClass4_Sub2Array1[0] = new Class4_Sub2(this.aClass21_Sub2_22, Class121.aClass121_23, Class127.aClass127_23, 128, false, local16, Class121.aClass121_23);
			this.aClass4_Sub2Array1[1] = new Class4_Sub2(this.aClass21_Sub2_22, Class121.aClass121_23, Class127.aClass127_23, 128, false, local20, Class121.aClass121_23);
			this.aClass4_Sub2Array1[2] = new Class4_Sub2(this.aClass21_Sub2_22, Class121.aClass121_23, Class127.aClass127_23, 128, false, local12, Class121.aClass121_23);
			this.method1196();
		}
	}

	@OriginalMember(owner = "client!aax", name = "s", descriptor = "()Z", line = 96)
	@Override
	boolean method1226() {
		return true;
	}

	@OriginalMember(owner = "client!aax", name = "p", descriptor = "()Z", line = 96)
	@Override
	boolean method1222() {
		return true;
	}

	@OriginalMember(owner = "client!aax", name = "u", descriptor = "()Z", line = 96)
	@Override
	boolean method1233() {
		return true;
	}

	@OriginalMember(owner = "client!aax", name = "y", descriptor = "()Z", line = 96)
	@Override
	boolean method1230() {
		return true;
	}

	@OriginalMember(owner = "client!aax", name = "w", descriptor = "()V", line = 100)
	void method1196() {
		this.aClass90_4 = new Class90(this.aClass21_Sub2_22, 2);
		this.aClass90_4.method21660(0);
		this.aClass21_Sub2_22.method4073(1);
		OpenGL.glTexGeni(8192, 9472, 34065);
		OpenGL.glTexGeni(8193, 9472, 34065);
		OpenGL.glTexGeni(8194, 9472, 34065);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glEnable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(26.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
		OpenGL.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean39) {
			this.aClass21_Sub2_22.method4114(260, 7681);
			this.aClass21_Sub2_22.method4077(0, 5890, 770);
			this.aClass21_Sub2_22.method4078(0, 34167, 770);
		} else {
			this.aClass21_Sub2_22.method4114(7681, 8448);
			this.aClass21_Sub2_22.method4077(0, 34168, 768);
			this.aClass21_Sub2_22.method4073(2);
			this.aClass21_Sub2_22.method4114(260, 7681);
			this.aClass21_Sub2_22.method4077(0, 34168, 768);
			this.aClass21_Sub2_22.method4077(1, 34168, 770);
			this.aClass21_Sub2_22.method4078(0, 34167, 770);
		}
		this.aClass21_Sub2_22.method4073(0);
		this.aClass90_4.method21649();
		this.aClass90_4.method21660(1);
		this.aClass21_Sub2_22.method4073(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean39) {
			this.aClass21_Sub2_22.method4114(8448, 8448);
			this.aClass21_Sub2_22.method4077(0, 5890, 768);
			this.aClass21_Sub2_22.method4078(0, 5890, 770);
		} else {
			this.aClass21_Sub2_22.method4114(8448, 8448);
			this.aClass21_Sub2_22.method4077(0, 5890, 768);
			this.aClass21_Sub2_22.method4073(2);
			this.aClass21_Sub2_22.method4114(8448, 8448);
			this.aClass21_Sub2_22.method4077(0, 5890, 768);
			this.aClass21_Sub2_22.method4077(1, 34168, 768);
			this.aClass21_Sub2_22.method4078(0, 5890, 770);
		}
		this.aClass21_Sub2_22.method4073(0);
		this.aClass90_4.method21649();
	}

	@OriginalMember(owner = "client!aax", name = "o", descriptor = "()V", line = 100)
	void method1197() {
		this.aClass90_4 = new Class90(this.aClass21_Sub2_22, 2);
		this.aClass90_4.method21660(0);
		this.aClass21_Sub2_22.method4073(1);
		OpenGL.glTexGeni(8192, 9472, 34065);
		OpenGL.glTexGeni(8193, 9472, 34065);
		OpenGL.glTexGeni(8194, 9472, 34065);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glEnable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(26.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
		OpenGL.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean39) {
			this.aClass21_Sub2_22.method4114(260, 7681);
			this.aClass21_Sub2_22.method4077(0, 5890, 770);
			this.aClass21_Sub2_22.method4078(0, 34167, 770);
		} else {
			this.aClass21_Sub2_22.method4114(7681, 8448);
			this.aClass21_Sub2_22.method4077(0, 34168, 768);
			this.aClass21_Sub2_22.method4073(2);
			this.aClass21_Sub2_22.method4114(260, 7681);
			this.aClass21_Sub2_22.method4077(0, 34168, 768);
			this.aClass21_Sub2_22.method4077(1, 34168, 770);
			this.aClass21_Sub2_22.method4078(0, 34167, 770);
		}
		this.aClass21_Sub2_22.method4073(0);
		this.aClass90_4.method21649();
		this.aClass90_4.method21660(1);
		this.aClass21_Sub2_22.method4073(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean39) {
			this.aClass21_Sub2_22.method4114(8448, 8448);
			this.aClass21_Sub2_22.method4077(0, 5890, 768);
			this.aClass21_Sub2_22.method4078(0, 5890, 770);
		} else {
			this.aClass21_Sub2_22.method4114(8448, 8448);
			this.aClass21_Sub2_22.method4077(0, 5890, 768);
			this.aClass21_Sub2_22.method4073(2);
			this.aClass21_Sub2_22.method4114(8448, 8448);
			this.aClass21_Sub2_22.method4077(0, 5890, 768);
			this.aClass21_Sub2_22.method4077(1, 34168, 768);
			this.aClass21_Sub2_22.method4078(0, 5890, 770);
		}
		this.aClass21_Sub2_22.method4073(0);
		this.aClass90_4.method21649();
	}

	@OriginalMember(owner = "client!aax", name = "a", descriptor = "(Z)V", line = 158)
	@Override
	void method1223(@OriginalArg(0) boolean arg0) {
		if (this.aClass90_4 == null || !arg0) {
			this.aClass21_Sub2_22.method4078(0, 34168, 770);
			return;
		}
		if (!this.aBoolean39) {
			this.aClass21_Sub2_22.method4073(2);
			this.aClass21_Sub2_22.method4074(this.aClass21_Sub2_22.aClass4_Sub1_2);
			this.aClass21_Sub2_22.method4073(0);
		}
		this.aClass90_4.method21650('\u0000');
		this.aBoolean38 = true;
	}

	@OriginalMember(owner = "client!aax", name = "b", descriptor = "(Z)V", line = 158)
	@Override
	void method1231(@OriginalArg(0) boolean arg0) {
		if (this.aClass90_4 == null || !arg0) {
			this.aClass21_Sub2_22.method4078(0, 34168, 770);
			return;
		}
		if (!this.aBoolean39) {
			this.aClass21_Sub2_22.method4073(2);
			this.aClass21_Sub2_22.method4074(this.aClass21_Sub2_22.aClass4_Sub1_2);
			this.aClass21_Sub2_22.method4073(0);
		}
		this.aClass90_4.method21650('\u0000');
		this.aBoolean38 = true;
	}

	@OriginalMember(owner = "client!aax", name = "z", descriptor = "(Z)V", line = 158)
	@Override
	void method1228(@OriginalArg(0) boolean arg0) {
		if (this.aClass90_4 == null || !arg0) {
			this.aClass21_Sub2_22.method4078(0, 34168, 770);
			return;
		}
		if (!this.aBoolean39) {
			this.aClass21_Sub2_22.method4073(2);
			this.aClass21_Sub2_22.method4074(this.aClass21_Sub2_22.aClass4_Sub1_2);
			this.aClass21_Sub2_22.method4073(0);
		}
		this.aClass90_4.method21650('\u0000');
		this.aBoolean38 = true;
	}

	@OriginalMember(owner = "client!aax", name = "c", descriptor = "(Z)V", line = 158)
	@Override
	void method1225(@OriginalArg(0) boolean arg0) {
		if (this.aClass90_4 == null || !arg0) {
			this.aClass21_Sub2_22.method4078(0, 34168, 770);
			return;
		}
		if (!this.aBoolean39) {
			this.aClass21_Sub2_22.method4073(2);
			this.aClass21_Sub2_22.method4074(this.aClass21_Sub2_22.aClass4_Sub1_2);
			this.aClass21_Sub2_22.method4073(0);
		}
		this.aClass90_4.method21650('\u0000');
		this.aBoolean38 = true;
	}

	@OriginalMember(owner = "client!aax", name = "g", descriptor = "(Z)V", line = 171)
	@Override
	void method1224(@OriginalArg(0) boolean arg0) {
		this.aClass21_Sub2_22.method4114(8448, 7681);
	}

	@OriginalMember(owner = "client!aax", name = "j", descriptor = "(Z)V", line = 171)
	@Override
	void method1234() {
		this.aClass21_Sub2_22.method4114(8448, 7681);
	}

	@OriginalMember(owner = "client!aax", name = "n", descriptor = "()V", line = 175)
	@Override
	void method1229() {
		if (this.aBoolean38) {
			if (!this.aBoolean39) {
				this.aClass21_Sub2_22.method4073(2);
				this.aClass21_Sub2_22.method4074(null);
			}
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(null);
			this.aClass21_Sub2_22.method4073(0);
			this.aClass90_4.method21650('\u0001');
			this.aBoolean38 = false;
		} else {
			this.aClass21_Sub2_22.method4078(0, 5890, 770);
		}
		this.aClass21_Sub2_22.method4114(8448, 8448);
	}

	@OriginalMember(owner = "client!aax", name = "r", descriptor = "()V", line = 175)
	@Override
	void method1237() {
		if (this.aBoolean38) {
			if (!this.aBoolean39) {
				this.aClass21_Sub2_22.method4073(2);
				this.aClass21_Sub2_22.method4074(null);
			}
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(null);
			this.aClass21_Sub2_22.method4073(0);
			this.aClass90_4.method21650('\u0001');
			this.aBoolean38 = false;
		} else {
			this.aClass21_Sub2_22.method4078(0, 5890, 770);
		}
		this.aClass21_Sub2_22.method4114(8448, 8448);
	}

	@OriginalMember(owner = "client!aax", name = "l", descriptor = "()V", line = 175)
	@Override
	void method1221() {
		if (this.aBoolean38) {
			if (!this.aBoolean39) {
				this.aClass21_Sub2_22.method4073(2);
				this.aClass21_Sub2_22.method4074(null);
			}
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(null);
			this.aClass21_Sub2_22.method4073(0);
			this.aClass90_4.method21650('\u0001');
			this.aBoolean38 = false;
		} else {
			this.aClass21_Sub2_22.method4078(0, 5890, 770);
		}
		this.aClass21_Sub2_22.method4114(8448, 8448);
	}

	@OriginalMember(owner = "client!aax", name = "d", descriptor = "()V", line = 175)
	@Override
	void method1238() {
		if (this.aBoolean38) {
			if (!this.aBoolean39) {
				this.aClass21_Sub2_22.method4073(2);
				this.aClass21_Sub2_22.method4074(null);
			}
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(null);
			this.aClass21_Sub2_22.method4073(0);
			this.aClass90_4.method21650('\u0001');
			this.aBoolean38 = false;
		} else {
			this.aClass21_Sub2_22.method4078(0, 5890, 770);
		}
		this.aClass21_Sub2_22.method4114(8448, 8448);
	}

	@OriginalMember(owner = "client!aax", name = "q", descriptor = "()V", line = 175)
	@Override
	void method1239() {
		if (this.aBoolean38) {
			if (!this.aBoolean39) {
				this.aClass21_Sub2_22.method4073(2);
				this.aClass21_Sub2_22.method4074(null);
			}
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(null);
			this.aClass21_Sub2_22.method4073(0);
			this.aClass90_4.method21650('\u0001');
			this.aBoolean38 = false;
		} else {
			this.aClass21_Sub2_22.method4078(0, 5890, 770);
		}
		this.aClass21_Sub2_22.method4114(8448, 8448);
	}

	@OriginalMember(owner = "client!aax", name = "e", descriptor = "()V", line = 175)
	@Override
	void method1236() {
		if (this.aBoolean38) {
			if (!this.aBoolean39) {
				this.aClass21_Sub2_22.method4073(2);
				this.aClass21_Sub2_22.method4074(null);
			}
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(null);
			this.aClass21_Sub2_22.method4073(0);
			this.aClass90_4.method21650('\u0001');
			this.aBoolean38 = false;
		} else {
			this.aClass21_Sub2_22.method4078(0, 5890, 770);
		}
		this.aClass21_Sub2_22.method4114(8448, 8448);
	}

	@OriginalMember(owner = "client!aax", name = "h", descriptor = "(II)V", line = 191)
	@Override
	void method1232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean38) {
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(this.aClass4_Sub2Array1[arg0 - 1]);
			this.aClass21_Sub2_22.method4073(0);
		}
	}

	@OriginalMember(owner = "client!aax", name = "m", descriptor = "(II)V", line = 191)
	@Override
	void method1235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean38) {
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(this.aClass4_Sub2Array1[arg0 - 1]);
			this.aClass21_Sub2_22.method4073(0);
		}
	}

	@OriginalMember(owner = "client!aax", name = "x", descriptor = "(Lclient!bf;I)V", line = 199)
	@Override
	void method1227(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
		this.aClass21_Sub2_22.method4074(arg0);
		this.aClass21_Sub2_22.method4115(arg1);
	}

	@OriginalMember(owner = "client!aax", name = "v", descriptor = "(Lclient!bf;I)V", line = 199)
	@Override
	void method1240(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
		this.aClass21_Sub2_22.method4074(arg0);
		this.aClass21_Sub2_22.method4115(arg1);
	}

	@OriginalMember(owner = "client!aax", name = "t", descriptor = "(Lclient!bf;I)V", line = 199)
	@Override
	void method1241(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
		this.aClass21_Sub2_22.method4074(arg0);
		this.aClass21_Sub2_22.method4115(arg1);
	}
}
