package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adv")
public class Class76_Sub8 extends Class76 {

	@OriginalMember(owner = "client!adv", name = "v", descriptor = "C")
	static final char aChar7 = '\u0001';

	@OriginalMember(owner = "client!adv", name = "c", descriptor = "C")
	static final char aChar8 = '\u0000';

	@OriginalMember(owner = "client!adv", name = "t", descriptor = "[F")
	static final float[] aFloatArray4 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!adv", name = "y", descriptor = "Lclient!bg;")
	Class169 aClass169_4;

	@OriginalMember(owner = "client!adv", name = "l", descriptor = "Lclient!bf;")
	final Class168 aClass168_4;

	@OriginalMember(owner = "client!adv", name = "w", descriptor = "Lclient!adp;")
	Class78_Sub3 aClass78_Sub3_1;

	@OriginalMember(owner = "client!adv", name = "<init>", descriptor = "(Lclient!aeq;Lclient!bf;)V", line = 16)
	Class76_Sub8(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Class168 arg1) {
		super(arg0);
		this.aClass168_4 = arg1;
		this.method1885();
		this.aClass78_Sub3_1 = new Class78_Sub3(this.aClass86_Sub3_22, Class212.aClass212_17, Class206.aClass206_23, 2, new byte[] { 0, -1 }, Class212.aClass212_17);
		this.aClass78_Sub3_1.method1730(false);
	}

	@OriginalMember(owner = "client!adv", name = "p", descriptor = "()Z", line = 24)
	@Override
	boolean method1995() {
		return true;
	}

	@OriginalMember(owner = "client!adv", name = "t", descriptor = "()Z", line = 24)
	@Override
	boolean method1990() {
		return true;
	}

	@OriginalMember(owner = "client!adv", name = "x", descriptor = "()Z", line = 24)
	@Override
	boolean method1982() {
		return true;
	}

	@OriginalMember(owner = "client!adv", name = "q", descriptor = "()Z", line = 24)
	@Override
	boolean method1981() {
		return true;
	}

	@OriginalMember(owner = "client!adv", name = "d", descriptor = "(Z)V", line = 28)
	@Override
	void method1983(@OriginalArg(0) boolean arg0) {
		if (this.aClass86_Sub3_22.anInt715 > 0) {
			@Pc(10) float local10 = -0.5F / (float) this.aClass86_Sub3_22.anInt715;
			this.aClass86_Sub3_22.method6190(1);
			aFloatArray4[0] = 0.0F;
			aFloatArray4[1] = 0.0F;
			aFloatArray4[2] = local10;
			aFloatArray4[3] = this.aClass86_Sub3_22.aFloat56 * local10 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray4, 0);
			OpenGL.glPopMatrix();
			this.aClass86_Sub3_22.method6109(0.5F, (float) this.aClass86_Sub3_22.anInt715);
			this.aClass86_Sub3_22.method6195(this.aClass78_Sub3_1);
			this.aClass86_Sub3_22.method6190(0);
		}
		this.aClass169_4.method24416('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!adv", name = "r", descriptor = "(Z)V", line = 28)
	@Override
	void method1985(@OriginalArg(0) boolean arg0) {
		if (this.aClass86_Sub3_22.anInt715 > 0) {
			@Pc(10) float local10 = -0.5F / (float) this.aClass86_Sub3_22.anInt715;
			this.aClass86_Sub3_22.method6190(1);
			aFloatArray4[0] = 0.0F;
			aFloatArray4[1] = 0.0F;
			aFloatArray4[2] = local10;
			aFloatArray4[3] = this.aClass86_Sub3_22.aFloat56 * local10 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray4, 0);
			OpenGL.glPopMatrix();
			this.aClass86_Sub3_22.method6109(0.5F, (float) this.aClass86_Sub3_22.anInt715);
			this.aClass86_Sub3_22.method6195(this.aClass78_Sub3_1);
			this.aClass86_Sub3_22.method6190(0);
		}
		this.aClass169_4.method24416('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!adv", name = "g", descriptor = "(Z)V", line = 28)
	@Override
	void method1986(@OriginalArg(0) boolean arg0) {
		if (this.aClass86_Sub3_22.anInt715 > 0) {
			@Pc(10) float local10 = -0.5F / (float) this.aClass86_Sub3_22.anInt715;
			this.aClass86_Sub3_22.method6190(1);
			aFloatArray4[0] = 0.0F;
			aFloatArray4[1] = 0.0F;
			aFloatArray4[2] = local10;
			aFloatArray4[3] = this.aClass86_Sub3_22.aFloat56 * local10 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray4, 0);
			OpenGL.glPopMatrix();
			this.aClass86_Sub3_22.method6109(0.5F, (float) this.aClass86_Sub3_22.anInt715);
			this.aClass86_Sub3_22.method6195(this.aClass78_Sub3_1);
			this.aClass86_Sub3_22.method6190(0);
		}
		this.aClass169_4.method24416('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!adv", name = "c", descriptor = "(Z)V", line = 28)
	@Override
	void method1976(@OriginalArg(0) boolean arg0) {
		if (this.aClass86_Sub3_22.anInt715 > 0) {
			@Pc(10) float local10 = -0.5F / (float) this.aClass86_Sub3_22.anInt715;
			this.aClass86_Sub3_22.method6190(1);
			aFloatArray4[0] = 0.0F;
			aFloatArray4[1] = 0.0F;
			aFloatArray4[2] = local10;
			aFloatArray4[3] = this.aClass86_Sub3_22.aFloat56 * local10 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray4, 0);
			OpenGL.glPopMatrix();
			this.aClass86_Sub3_22.method6109(0.5F, (float) this.aClass86_Sub3_22.anInt715);
			this.aClass86_Sub3_22.method6195(this.aClass78_Sub3_1);
			this.aClass86_Sub3_22.method6190(0);
		}
		this.aClass169_4.method24416('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!adv", name = "s", descriptor = "(Z)V", line = 28)
	@Override
	void method1992(@OriginalArg(0) boolean arg0) {
		if (this.aClass86_Sub3_22.anInt715 > 0) {
			@Pc(10) float local10 = -0.5F / (float) this.aClass86_Sub3_22.anInt715;
			this.aClass86_Sub3_22.method6190(1);
			aFloatArray4[0] = 0.0F;
			aFloatArray4[1] = 0.0F;
			aFloatArray4[2] = local10;
			aFloatArray4[3] = this.aClass86_Sub3_22.aFloat56 * local10 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray4, 0);
			OpenGL.glPopMatrix();
			this.aClass86_Sub3_22.method6109(0.5F, (float) this.aClass86_Sub3_22.anInt715);
			this.aClass86_Sub3_22.method6195(this.aClass78_Sub3_1);
			this.aClass86_Sub3_22.method6190(0);
		}
		this.aClass169_4.method24416('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!adv", name = "v", descriptor = "(Z)V", line = 51)
	@Override
	void method1977(@OriginalArg(0) boolean arg0) {
		this.aClass86_Sub3_22.method6207(260, 8448);
	}

	@OriginalMember(owner = "client!adv", name = "k", descriptor = "(Z)V", line = 51)
	@Override
	void method1980() {
		this.aClass86_Sub3_22.method6207(260, 8448);
	}

	@OriginalMember(owner = "client!adv", name = "j", descriptor = "(Z)V", line = 51)
	@Override
	void method1988() {
		this.aClass86_Sub3_22.method6207(260, 8448);
	}

	@OriginalMember(owner = "client!adv", name = "i", descriptor = "(Z)V", line = 51)
	@Override
	void method1984() {
		this.aClass86_Sub3_22.method6207(260, 8448);
	}

	@OriginalMember(owner = "client!adv", name = "z", descriptor = "(Z)V", line = 51)
	@Override
	void method1987() {
		this.aClass86_Sub3_22.method6207(260, 8448);
	}

	@OriginalMember(owner = "client!adv", name = "u", descriptor = "()V", line = 55)
	@Override
	void method1989() {
		this.aClass169_4.method24416('\u0001');
		if (this.aClass86_Sub3_22.anInt715 > 0) {
			this.aClass86_Sub3_22.method6190(1);
			this.aClass86_Sub3_22.method6195(null);
			this.aClass86_Sub3_22.method6109(1.0F, 0.0F);
			this.aClass86_Sub3_22.method6190(0);
		}
		this.aClass86_Sub3_22.method6207(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!adv", name = "l", descriptor = "()V", line = 55)
	@Override
	void method1975() {
		this.aClass169_4.method24416('\u0001');
		if (this.aClass86_Sub3_22.anInt715 > 0) {
			this.aClass86_Sub3_22.method6190(1);
			this.aClass86_Sub3_22.method6195(null);
			this.aClass86_Sub3_22.method6109(1.0F, 0.0F);
			this.aClass86_Sub3_22.method6190(0);
		}
		this.aClass86_Sub3_22.method6207(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!adv", name = "e", descriptor = "()V", line = 55)
	@Override
	void method1974() {
		this.aClass169_4.method24416('\u0001');
		if (this.aClass86_Sub3_22.anInt715 > 0) {
			this.aClass86_Sub3_22.method6190(1);
			this.aClass86_Sub3_22.method6195(null);
			this.aClass86_Sub3_22.method6109(1.0F, 0.0F);
			this.aClass86_Sub3_22.method6190(0);
		}
		this.aClass86_Sub3_22.method6207(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!adv", name = "f", descriptor = "()V", line = 55)
	@Override
	void method1993() {
		this.aClass169_4.method24416('\u0001');
		if (this.aClass86_Sub3_22.anInt715 > 0) {
			this.aClass86_Sub3_22.method6190(1);
			this.aClass86_Sub3_22.method6195(null);
			this.aClass86_Sub3_22.method6109(1.0F, 0.0F);
			this.aClass86_Sub3_22.method6190(0);
		}
		this.aClass86_Sub3_22.method6207(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!adv", name = "y", descriptor = "(II)V", line = 69)
	@Override
	void method1979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass168_4.aBoolean564) {
				this.aClass86_Sub3_22.method6195(this.aClass168_4.aClass78_Sub4_2);
				aFloatArray4[0] = 0.0F;
				aFloatArray4[1] = 0.0F;
				aFloatArray4[2] = 0.0F;
				aFloatArray4[3] = (float) (this.aClass86_Sub3_22.anInt723 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray4, 0);
			} else {
				@Pc(53) int local53 = this.aClass86_Sub3_22.anInt723 % 4000 * 16 / 4000;
				this.aClass86_Sub3_22.method6195(this.aClass168_4.aClass78_Sub2Array2[local53]);
			}
		} else if (this.aClass168_4.aBoolean564) {
			this.aClass86_Sub3_22.method6195(this.aClass168_4.aClass78_Sub4_2);
			aFloatArray4[0] = 0.0F;
			aFloatArray4[1] = 0.0F;
			aFloatArray4[2] = 0.0F;
			aFloatArray4[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray4, 0);
		} else {
			this.aClass86_Sub3_22.method6195(this.aClass168_4.aClass78_Sub2Array2[0]);
		}
	}

	@OriginalMember(owner = "client!adv", name = "b", descriptor = "(II)V", line = 69)
	@Override
	void method1978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass168_4.aBoolean564) {
				this.aClass86_Sub3_22.method6195(this.aClass168_4.aClass78_Sub4_2);
				aFloatArray4[0] = 0.0F;
				aFloatArray4[1] = 0.0F;
				aFloatArray4[2] = 0.0F;
				aFloatArray4[3] = (float) (this.aClass86_Sub3_22.anInt723 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray4, 0);
			} else {
				@Pc(53) int local53 = this.aClass86_Sub3_22.anInt723 % 4000 * 16 / 4000;
				this.aClass86_Sub3_22.method6195(this.aClass168_4.aClass78_Sub2Array2[local53]);
			}
		} else if (this.aClass168_4.aBoolean564) {
			this.aClass86_Sub3_22.method6195(this.aClass168_4.aClass78_Sub4_2);
			aFloatArray4[0] = 0.0F;
			aFloatArray4[1] = 0.0F;
			aFloatArray4[2] = 0.0F;
			aFloatArray4[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray4, 0);
		} else {
			this.aClass86_Sub3_22.method6195(this.aClass168_4.aClass78_Sub2Array2[0]);
		}
	}

	@OriginalMember(owner = "client!adv", name = "o", descriptor = "(II)V", line = 69)
	@Override
	void method1994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass168_4.aBoolean564) {
				this.aClass86_Sub3_22.method6195(this.aClass168_4.aClass78_Sub4_2);
				aFloatArray4[0] = 0.0F;
				aFloatArray4[1] = 0.0F;
				aFloatArray4[2] = 0.0F;
				aFloatArray4[3] = (float) (this.aClass86_Sub3_22.anInt723 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray4, 0);
			} else {
				@Pc(53) int local53 = this.aClass86_Sub3_22.anInt723 % 4000 * 16 / 4000;
				this.aClass86_Sub3_22.method6195(this.aClass168_4.aClass78_Sub2Array2[local53]);
			}
		} else if (this.aClass168_4.aBoolean564) {
			this.aClass86_Sub3_22.method6195(this.aClass168_4.aClass78_Sub4_2);
			aFloatArray4[0] = 0.0F;
			aFloatArray4[1] = 0.0F;
			aFloatArray4[2] = 0.0F;
			aFloatArray4[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray4, 0);
		} else {
			this.aClass86_Sub3_22.method6195(this.aClass168_4.aClass78_Sub2Array2[0]);
		}
	}

	@OriginalMember(owner = "client!adv", name = "w", descriptor = "(Lclient!bx;I)V", line = 96)
	@Override
	void method1991(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!adv", name = "n", descriptor = "(Lclient!bx;I)V", line = 96)
	@Override
	void method1996(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!adv", name = "a", descriptor = "()V", line = 99)
	void method1885() {
		this.aClass169_4 = new Class169(this.aClass86_Sub3_22, 2);
		this.aClass169_4.method24412(0);
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6207(7681, 260);
		this.aClass86_Sub3_22.method6213(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		this.aClass86_Sub3_22.method6190(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass168_4.aBoolean564) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass169_4.method24414();
		this.aClass169_4.method24412(1);
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6207(8448, 8448);
		this.aClass86_Sub3_22.method6213(0, 5890, 768);
		OpenGL.glDisable(3168);
		this.aClass86_Sub3_22.method6190(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass168_4.aBoolean564) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass169_4.method24414();
	}

	@OriginalMember(owner = "client!adv", name = "h", descriptor = "()V", line = 99)
	void method1886() {
		this.aClass169_4 = new Class169(this.aClass86_Sub3_22, 2);
		this.aClass169_4.method24412(0);
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6207(7681, 260);
		this.aClass86_Sub3_22.method6213(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		this.aClass86_Sub3_22.method6190(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass168_4.aBoolean564) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass169_4.method24414();
		this.aClass169_4.method24412(1);
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6207(8448, 8448);
		this.aClass86_Sub3_22.method6213(0, 5890, 768);
		OpenGL.glDisable(3168);
		this.aClass86_Sub3_22.method6190(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass168_4.aBoolean564) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass169_4.method24414();
	}

	@OriginalMember(owner = "client!adv", name = "m", descriptor = "()V", line = 99)
	void method1887() {
		this.aClass169_4 = new Class169(this.aClass86_Sub3_22, 2);
		this.aClass169_4.method24412(0);
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6207(7681, 260);
		this.aClass86_Sub3_22.method6213(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		this.aClass86_Sub3_22.method6190(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass168_4.aBoolean564) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass169_4.method24414();
		this.aClass169_4.method24412(1);
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6207(8448, 8448);
		this.aClass86_Sub3_22.method6213(0, 5890, 768);
		OpenGL.glDisable(3168);
		this.aClass86_Sub3_22.method6190(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass168_4.aBoolean564) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass169_4.method24414();
	}
}
