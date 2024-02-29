package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ads")
public class Class76_Sub6 extends Class76 {

	@OriginalMember(owner = "client!ads", name = "c", descriptor = "I")
	static final int anInt297 = 128;

	@OriginalMember(owner = "client!ads", name = "l", descriptor = "I")
	static final int anInt298 = 128;

	@OriginalMember(owner = "client!ads", name = "y", descriptor = "I")
	static final int anInt299 = 24;

	@OriginalMember(owner = "client!ads", name = "v", descriptor = "I")
	static final int anInt300 = 5;

	@OriginalMember(owner = "client!ads", name = "d", descriptor = "C")
	static final char aChar5 = '\u0001';

	@OriginalMember(owner = "client!ads", name = "q", descriptor = "F")
	static final float aFloat2 = 0.0F;

	@OriginalMember(owner = "client!ads", name = "x", descriptor = "C")
	static final char aChar6 = '\u0000';

	@OriginalMember(owner = "client!ads", name = "w", descriptor = "F")
	static final float aFloat3 = 26.0F;

	@OriginalMember(owner = "client!ads", name = "t", descriptor = "F")
	static final float aFloat4 = -12.0F;

	@OriginalMember(owner = "client!ads", name = "s", descriptor = "Lclient!bg;")
	Class169 aClass169_3;

	@OriginalMember(owner = "client!ads", name = "r", descriptor = "Z")
	boolean aBoolean46;

	@OriginalMember(owner = "client!ads", name = "g", descriptor = "Z")
	boolean aBoolean45 = false;

	@OriginalMember(owner = "client!ads", name = "z", descriptor = "[Lclient!adf;")
	Class78_Sub1[] aClass78_Sub1Array1;

	@OriginalMember(owner = "client!ads", name = "<init>", descriptor = "(Lclient!aeq;)V", line = 25)
	Class76_Sub6(@OriginalArg(0) Class86_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean140) {
			@Pc(12) byte[][] local12 = new byte[6][16384];
			@Pc(16) byte[][] local16 = new byte[6][16384];
			@Pc(20) byte[][] local20 = new byte[6][16384];
			@Pc(22) int local22 = 0;
			@Pc(29) Class447 local29 = new Class447(0.0F, -1.0F, 0.0F);
			for (@Pc(31) int local31 = 0; local31 < 128; local31++) {
				for (@Pc(36) int local36 = 0; local36 < 128; local36++) {
					@Pc(48) float local48 = (float) local36 * 2.0F / 128.0F - 1.0F;
					@Pc(57) float local57 = (float) local31 * 2.0F / 128.0F - 1.0F;
					@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local48 * local48 + 1.0F + local57 * local57)));
					@Pc(76) float local76 = local48 * local72;
					@Pc(80) float local80 = local57 * local72;
					for (@Pc(82) int local82 = 0; local82 < 6; local82++) {
						@Pc(96) Class447 local96;
						if (local82 == 0) {
							local96 = new Class447(-local72, -local76, local80);
						} else if (local82 == 1) {
							local96 = new Class447(local72, local76, local80);
						} else if (local82 == 2) {
							local96 = new Class447(-local76, local80, -local72);
						} else if (local82 == 3) {
							local96 = new Class447(-local76, -local80, local72);
						} else if (local82 == 4) {
							local96 = new Class447(local76, local72, -local80);
						} else {
							local96 = new Class447(local76, -local72, local80);
						}
						@Pc(158) float local158 = local96.method29162(local29);
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
			this.aClass78_Sub1Array1 = new Class78_Sub1[3];
			this.aClass78_Sub1Array1[0] = new Class78_Sub1(this.aClass86_Sub3_22, Class212.aClass212_17, Class206.aClass206_23, 128, false, local16, Class212.aClass212_17);
			this.aClass78_Sub1Array1[1] = new Class78_Sub1(this.aClass86_Sub3_22, Class212.aClass212_17, Class206.aClass206_23, 128, false, local20, Class212.aClass212_17);
			this.aClass78_Sub1Array1[2] = new Class78_Sub1(this.aClass86_Sub3_22, Class212.aClass212_17, Class206.aClass206_23, 128, false, local12, Class212.aClass212_17);
			this.method1819();
		}
	}

	@OriginalMember(owner = "client!ads", name = "p", descriptor = "()Z", line = 96)
	@Override
	boolean method1995() {
		return true;
	}

	@OriginalMember(owner = "client!ads", name = "t", descriptor = "()Z", line = 96)
	@Override
	boolean method1990() {
		return true;
	}

	@OriginalMember(owner = "client!ads", name = "q", descriptor = "()Z", line = 96)
	@Override
	boolean method1981() {
		return true;
	}

	@OriginalMember(owner = "client!ads", name = "x", descriptor = "()Z", line = 96)
	@Override
	boolean method1982() {
		return true;
	}

	@OriginalMember(owner = "client!ads", name = "a", descriptor = "()V", line = 100)
	void method1819() {
		this.aClass169_3 = new Class169(this.aClass86_Sub3_22, 2);
		this.aClass169_3.method24412(0);
		this.aClass86_Sub3_22.method6190(1);
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
		if (this.aBoolean46) {
			this.aClass86_Sub3_22.method6207(260, 7681);
			this.aClass86_Sub3_22.method6213(0, 5890, 770);
			this.aClass86_Sub3_22.method6214(0, 34167, 770);
		} else {
			this.aClass86_Sub3_22.method6207(7681, 8448);
			this.aClass86_Sub3_22.method6213(0, 34168, 768);
			this.aClass86_Sub3_22.method6190(2);
			this.aClass86_Sub3_22.method6207(260, 7681);
			this.aClass86_Sub3_22.method6213(0, 34168, 768);
			this.aClass86_Sub3_22.method6213(1, 34168, 770);
			this.aClass86_Sub3_22.method6214(0, 34167, 770);
		}
		this.aClass86_Sub3_22.method6190(0);
		this.aClass169_3.method24414();
		this.aClass169_3.method24412(1);
		this.aClass86_Sub3_22.method6190(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean46) {
			this.aClass86_Sub3_22.method6207(8448, 8448);
			this.aClass86_Sub3_22.method6213(0, 5890, 768);
			this.aClass86_Sub3_22.method6214(0, 5890, 770);
		} else {
			this.aClass86_Sub3_22.method6207(8448, 8448);
			this.aClass86_Sub3_22.method6213(0, 5890, 768);
			this.aClass86_Sub3_22.method6190(2);
			this.aClass86_Sub3_22.method6207(8448, 8448);
			this.aClass86_Sub3_22.method6213(0, 5890, 768);
			this.aClass86_Sub3_22.method6213(1, 34168, 768);
			this.aClass86_Sub3_22.method6214(0, 5890, 770);
		}
		this.aClass86_Sub3_22.method6190(0);
		this.aClass169_3.method24414();
	}

	@OriginalMember(owner = "client!ads", name = "m", descriptor = "()V", line = 100)
	void method1820() {
		this.aClass169_3 = new Class169(this.aClass86_Sub3_22, 2);
		this.aClass169_3.method24412(0);
		this.aClass86_Sub3_22.method6190(1);
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
		if (this.aBoolean46) {
			this.aClass86_Sub3_22.method6207(260, 7681);
			this.aClass86_Sub3_22.method6213(0, 5890, 770);
			this.aClass86_Sub3_22.method6214(0, 34167, 770);
		} else {
			this.aClass86_Sub3_22.method6207(7681, 8448);
			this.aClass86_Sub3_22.method6213(0, 34168, 768);
			this.aClass86_Sub3_22.method6190(2);
			this.aClass86_Sub3_22.method6207(260, 7681);
			this.aClass86_Sub3_22.method6213(0, 34168, 768);
			this.aClass86_Sub3_22.method6213(1, 34168, 770);
			this.aClass86_Sub3_22.method6214(0, 34167, 770);
		}
		this.aClass86_Sub3_22.method6190(0);
		this.aClass169_3.method24414();
		this.aClass169_3.method24412(1);
		this.aClass86_Sub3_22.method6190(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean46) {
			this.aClass86_Sub3_22.method6207(8448, 8448);
			this.aClass86_Sub3_22.method6213(0, 5890, 768);
			this.aClass86_Sub3_22.method6214(0, 5890, 770);
		} else {
			this.aClass86_Sub3_22.method6207(8448, 8448);
			this.aClass86_Sub3_22.method6213(0, 5890, 768);
			this.aClass86_Sub3_22.method6190(2);
			this.aClass86_Sub3_22.method6207(8448, 8448);
			this.aClass86_Sub3_22.method6213(0, 5890, 768);
			this.aClass86_Sub3_22.method6213(1, 34168, 768);
			this.aClass86_Sub3_22.method6214(0, 5890, 770);
		}
		this.aClass86_Sub3_22.method6190(0);
		this.aClass169_3.method24414();
	}

	@OriginalMember(owner = "client!ads", name = "c", descriptor = "(Z)V", line = 158)
	@Override
	void method1976(@OriginalArg(0) boolean arg0) {
		if (this.aClass169_3 == null || !arg0) {
			this.aClass86_Sub3_22.method6214(0, 34168, 770);
			return;
		}
		if (!this.aBoolean46) {
			this.aClass86_Sub3_22.method6190(2);
			this.aClass86_Sub3_22.method6195(this.aClass86_Sub3_22.aClass78_Sub2_2);
			this.aClass86_Sub3_22.method6190(0);
		}
		this.aClass169_3.method24416('\u0000');
		this.aBoolean45 = true;
	}

	@OriginalMember(owner = "client!ads", name = "r", descriptor = "(Z)V", line = 158)
	@Override
	void method1985(@OriginalArg(0) boolean arg0) {
		if (this.aClass169_3 == null || !arg0) {
			this.aClass86_Sub3_22.method6214(0, 34168, 770);
			return;
		}
		if (!this.aBoolean46) {
			this.aClass86_Sub3_22.method6190(2);
			this.aClass86_Sub3_22.method6195(this.aClass86_Sub3_22.aClass78_Sub2_2);
			this.aClass86_Sub3_22.method6190(0);
		}
		this.aClass169_3.method24416('\u0000');
		this.aBoolean45 = true;
	}

	@OriginalMember(owner = "client!ads", name = "s", descriptor = "(Z)V", line = 158)
	@Override
	void method1992(@OriginalArg(0) boolean arg0) {
		if (this.aClass169_3 == null || !arg0) {
			this.aClass86_Sub3_22.method6214(0, 34168, 770);
			return;
		}
		if (!this.aBoolean46) {
			this.aClass86_Sub3_22.method6190(2);
			this.aClass86_Sub3_22.method6195(this.aClass86_Sub3_22.aClass78_Sub2_2);
			this.aClass86_Sub3_22.method6190(0);
		}
		this.aClass169_3.method24416('\u0000');
		this.aBoolean45 = true;
	}

	@OriginalMember(owner = "client!ads", name = "d", descriptor = "(Z)V", line = 158)
	@Override
	void method1983(@OriginalArg(0) boolean arg0) {
		if (this.aClass169_3 == null || !arg0) {
			this.aClass86_Sub3_22.method6214(0, 34168, 770);
			return;
		}
		if (!this.aBoolean46) {
			this.aClass86_Sub3_22.method6190(2);
			this.aClass86_Sub3_22.method6195(this.aClass86_Sub3_22.aClass78_Sub2_2);
			this.aClass86_Sub3_22.method6190(0);
		}
		this.aClass169_3.method24416('\u0000');
		this.aBoolean45 = true;
	}

	@OriginalMember(owner = "client!ads", name = "g", descriptor = "(Z)V", line = 158)
	@Override
	void method1986(@OriginalArg(0) boolean arg0) {
		if (this.aClass169_3 == null || !arg0) {
			this.aClass86_Sub3_22.method6214(0, 34168, 770);
			return;
		}
		if (!this.aBoolean46) {
			this.aClass86_Sub3_22.method6190(2);
			this.aClass86_Sub3_22.method6195(this.aClass86_Sub3_22.aClass78_Sub2_2);
			this.aClass86_Sub3_22.method6190(0);
		}
		this.aClass169_3.method24416('\u0000');
		this.aBoolean45 = true;
	}

	@OriginalMember(owner = "client!ads", name = "v", descriptor = "(Z)V", line = 171)
	@Override
	void method1977(@OriginalArg(0) boolean arg0) {
		this.aClass86_Sub3_22.method6207(8448, 7681);
	}

	@OriginalMember(owner = "client!ads", name = "j", descriptor = "(Z)V", line = 171)
	@Override
	void method1988() {
		this.aClass86_Sub3_22.method6207(8448, 7681);
	}

	@OriginalMember(owner = "client!ads", name = "i", descriptor = "(Z)V", line = 171)
	@Override
	void method1984() {
		this.aClass86_Sub3_22.method6207(8448, 7681);
	}

	@OriginalMember(owner = "client!ads", name = "k", descriptor = "(Z)V", line = 171)
	@Override
	void method1980() {
		this.aClass86_Sub3_22.method6207(8448, 7681);
	}

	@OriginalMember(owner = "client!ads", name = "z", descriptor = "(Z)V", line = 171)
	@Override
	void method1987() {
		this.aClass86_Sub3_22.method6207(8448, 7681);
	}

	@OriginalMember(owner = "client!ads", name = "l", descriptor = "()V", line = 175)
	@Override
	void method1975() {
		if (this.aBoolean45) {
			if (!this.aBoolean46) {
				this.aClass86_Sub3_22.method6190(2);
				this.aClass86_Sub3_22.method6195(null);
			}
			this.aClass86_Sub3_22.method6190(1);
			this.aClass86_Sub3_22.method6195(null);
			this.aClass86_Sub3_22.method6190(0);
			this.aClass169_3.method24416('\u0001');
			this.aBoolean45 = false;
		} else {
			this.aClass86_Sub3_22.method6214(0, 5890, 770);
		}
		this.aClass86_Sub3_22.method6207(8448, 8448);
	}

	@OriginalMember(owner = "client!ads", name = "f", descriptor = "()V", line = 175)
	@Override
	void method1993() {
		if (this.aBoolean45) {
			if (!this.aBoolean46) {
				this.aClass86_Sub3_22.method6190(2);
				this.aClass86_Sub3_22.method6195(null);
			}
			this.aClass86_Sub3_22.method6190(1);
			this.aClass86_Sub3_22.method6195(null);
			this.aClass86_Sub3_22.method6190(0);
			this.aClass169_3.method24416('\u0001');
			this.aBoolean45 = false;
		} else {
			this.aClass86_Sub3_22.method6214(0, 5890, 770);
		}
		this.aClass86_Sub3_22.method6207(8448, 8448);
	}

	@OriginalMember(owner = "client!ads", name = "e", descriptor = "()V", line = 175)
	@Override
	void method1974() {
		if (this.aBoolean45) {
			if (!this.aBoolean46) {
				this.aClass86_Sub3_22.method6190(2);
				this.aClass86_Sub3_22.method6195(null);
			}
			this.aClass86_Sub3_22.method6190(1);
			this.aClass86_Sub3_22.method6195(null);
			this.aClass86_Sub3_22.method6190(0);
			this.aClass169_3.method24416('\u0001');
			this.aBoolean45 = false;
		} else {
			this.aClass86_Sub3_22.method6214(0, 5890, 770);
		}
		this.aClass86_Sub3_22.method6207(8448, 8448);
	}

	@OriginalMember(owner = "client!ads", name = "u", descriptor = "()V", line = 175)
	@Override
	void method1989() {
		if (this.aBoolean45) {
			if (!this.aBoolean46) {
				this.aClass86_Sub3_22.method6190(2);
				this.aClass86_Sub3_22.method6195(null);
			}
			this.aClass86_Sub3_22.method6190(1);
			this.aClass86_Sub3_22.method6195(null);
			this.aClass86_Sub3_22.method6190(0);
			this.aClass169_3.method24416('\u0001');
			this.aBoolean45 = false;
		} else {
			this.aClass86_Sub3_22.method6214(0, 5890, 770);
		}
		this.aClass86_Sub3_22.method6207(8448, 8448);
	}

	@OriginalMember(owner = "client!ads", name = "o", descriptor = "(II)V", line = 191)
	@Override
	void method1994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean45) {
			this.aClass86_Sub3_22.method6190(1);
			this.aClass86_Sub3_22.method6195(this.aClass78_Sub1Array1[arg0 - 1]);
			this.aClass86_Sub3_22.method6190(0);
		}
	}

	@OriginalMember(owner = "client!ads", name = "y", descriptor = "(II)V", line = 191)
	@Override
	void method1979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean45) {
			this.aClass86_Sub3_22.method6190(1);
			this.aClass86_Sub3_22.method6195(this.aClass78_Sub1Array1[arg0 - 1]);
			this.aClass86_Sub3_22.method6190(0);
		}
	}

	@OriginalMember(owner = "client!ads", name = "b", descriptor = "(II)V", line = 191)
	@Override
	void method1978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean45) {
			this.aClass86_Sub3_22.method6190(1);
			this.aClass86_Sub3_22.method6195(this.aClass78_Sub1Array1[arg0 - 1]);
			this.aClass86_Sub3_22.method6190(0);
		}
	}

	@OriginalMember(owner = "client!ads", name = "w", descriptor = "(Lclient!bx;I)V", line = 199)
	@Override
	void method1991(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1) {
		this.aClass86_Sub3_22.method6195(arg0);
		this.aClass86_Sub3_22.method6198(arg1);
	}

	@OriginalMember(owner = "client!ads", name = "n", descriptor = "(Lclient!bx;I)V", line = 199)
	@Override
	void method1996(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1) {
		this.aClass86_Sub3_22.method6195(arg0);
		this.aClass86_Sub3_22.method6198(arg1);
	}
}
