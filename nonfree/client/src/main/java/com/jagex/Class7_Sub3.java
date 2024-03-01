package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aap")
public class Class7_Sub3 extends Class7 {

	@OriginalMember(owner = "client!aap", name = "g", descriptor = "C")
	static final char aChar3 = '\u0001';

	@OriginalMember(owner = "client!aap", name = "a", descriptor = "C")
	static final char aChar4 = '\u0000';

	@OriginalMember(owner = "client!aap", name = "s", descriptor = "[F")
	static final float[] aFloatArray4 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!aap", name = "h", descriptor = "Lclient!bg;")
	Class90 aClass90_2;

	@OriginalMember(owner = "client!aap", name = "l", descriptor = "Lclient!bi;")
	final Class92 aClass92_2;

	@OriginalMember(owner = "client!aap", name = "x", descriptor = "Lclient!aao;")
	Class4_Sub3 aClass4_Sub3_1;

	@OriginalMember(owner = "client!aap", name = "<init>", descriptor = "(Lclient!abt;Lclient!bi;)V", line = 16)
	Class7_Sub3(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) Class92 arg1) {
		super(arg0);
		this.aClass92_2 = arg1;
		this.method962();
		this.aClass4_Sub3_1 = new Class4_Sub3(this.aClass21_Sub2_22, Class121.aClass121_23, Class127.aClass127_23, 2, new byte[] { 0, -1 }, Class121.aClass121_23);
		this.aClass4_Sub3_1.method936(false);
	}

	@OriginalMember(owner = "client!aap", name = "s", descriptor = "()Z", line = 24)
	@Override
	boolean method1226() {
		return true;
	}

	@OriginalMember(owner = "client!aap", name = "u", descriptor = "()Z", line = 24)
	@Override
	boolean method1233() {
		return true;
	}

	@OriginalMember(owner = "client!aap", name = "p", descriptor = "()Z", line = 24)
	@Override
	boolean method1222() {
		return true;
	}

	@OriginalMember(owner = "client!aap", name = "y", descriptor = "()Z", line = 24)
	@Override
	boolean method1230() {
		return true;
	}

	@OriginalMember(owner = "client!aap", name = "a", descriptor = "(Z)V", line = 28)
	@Override
	void method1223(@OriginalArg(0) boolean arg0) {
		if (this.aClass21_Sub2_22.anInt433 > 0) {
			@Pc(10) float local10 = -0.5F / (float) this.aClass21_Sub2_22.anInt433;
			this.aClass21_Sub2_22.method4073(1);
			aFloatArray4[0] = 0.0F;
			aFloatArray4[1] = 0.0F;
			aFloatArray4[2] = local10;
			aFloatArray4[3] = this.aClass21_Sub2_22.aFloat56 * local10 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray4, 0);
			OpenGL.glPopMatrix();
			this.aClass21_Sub2_22.method4053(0.5F, (float) this.aClass21_Sub2_22.anInt433);
			this.aClass21_Sub2_22.method4074(this.aClass4_Sub3_1);
			this.aClass21_Sub2_22.method4073(0);
		}
		this.aClass90_2.method21650('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aap", name = "c", descriptor = "(Z)V", line = 28)
	@Override
	void method1225(@OriginalArg(0) boolean arg0) {
		if (this.aClass21_Sub2_22.anInt433 > 0) {
			@Pc(10) float local10 = -0.5F / (float) this.aClass21_Sub2_22.anInt433;
			this.aClass21_Sub2_22.method4073(1);
			aFloatArray4[0] = 0.0F;
			aFloatArray4[1] = 0.0F;
			aFloatArray4[2] = local10;
			aFloatArray4[3] = this.aClass21_Sub2_22.aFloat56 * local10 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray4, 0);
			OpenGL.glPopMatrix();
			this.aClass21_Sub2_22.method4053(0.5F, (float) this.aClass21_Sub2_22.anInt433);
			this.aClass21_Sub2_22.method4074(this.aClass4_Sub3_1);
			this.aClass21_Sub2_22.method4073(0);
		}
		this.aClass90_2.method21650('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aap", name = "b", descriptor = "(Z)V", line = 28)
	@Override
	void method1231(@OriginalArg(0) boolean arg0) {
		if (this.aClass21_Sub2_22.anInt433 > 0) {
			@Pc(10) float local10 = -0.5F / (float) this.aClass21_Sub2_22.anInt433;
			this.aClass21_Sub2_22.method4073(1);
			aFloatArray4[0] = 0.0F;
			aFloatArray4[1] = 0.0F;
			aFloatArray4[2] = local10;
			aFloatArray4[3] = this.aClass21_Sub2_22.aFloat56 * local10 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray4, 0);
			OpenGL.glPopMatrix();
			this.aClass21_Sub2_22.method4053(0.5F, (float) this.aClass21_Sub2_22.anInt433);
			this.aClass21_Sub2_22.method4074(this.aClass4_Sub3_1);
			this.aClass21_Sub2_22.method4073(0);
		}
		this.aClass90_2.method21650('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aap", name = "z", descriptor = "(Z)V", line = 28)
	@Override
	void method1228(@OriginalArg(0) boolean arg0) {
		if (this.aClass21_Sub2_22.anInt433 > 0) {
			@Pc(10) float local10 = -0.5F / (float) this.aClass21_Sub2_22.anInt433;
			this.aClass21_Sub2_22.method4073(1);
			aFloatArray4[0] = 0.0F;
			aFloatArray4[1] = 0.0F;
			aFloatArray4[2] = local10;
			aFloatArray4[3] = this.aClass21_Sub2_22.aFloat56 * local10 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray4, 0);
			OpenGL.glPopMatrix();
			this.aClass21_Sub2_22.method4053(0.5F, (float) this.aClass21_Sub2_22.anInt433);
			this.aClass21_Sub2_22.method4074(this.aClass4_Sub3_1);
			this.aClass21_Sub2_22.method4073(0);
		}
		this.aClass90_2.method21650('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aap", name = "g", descriptor = "(Z)V", line = 51)
	@Override
	void method1224(@OriginalArg(0) boolean arg0) {
		this.aClass21_Sub2_22.method4114(260, 8448);
	}

	@OriginalMember(owner = "client!aap", name = "j", descriptor = "(Z)V", line = 51)
	@Override
	void method1234() {
		this.aClass21_Sub2_22.method4114(260, 8448);
	}

	@OriginalMember(owner = "client!aap", name = "r", descriptor = "()V", line = 55)
	@Override
	void method1237() {
		this.aClass90_2.method21650('\u0001');
		if (this.aClass21_Sub2_22.anInt433 > 0) {
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(null);
			this.aClass21_Sub2_22.method4053(1.0F, 0.0F);
			this.aClass21_Sub2_22.method4073(0);
		}
		this.aClass21_Sub2_22.method4114(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aap", name = "l", descriptor = "()V", line = 55)
	@Override
	void method1221() {
		this.aClass90_2.method21650('\u0001');
		if (this.aClass21_Sub2_22.anInt433 > 0) {
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(null);
			this.aClass21_Sub2_22.method4053(1.0F, 0.0F);
			this.aClass21_Sub2_22.method4073(0);
		}
		this.aClass21_Sub2_22.method4114(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aap", name = "e", descriptor = "()V", line = 55)
	@Override
	void method1236() {
		this.aClass90_2.method21650('\u0001');
		if (this.aClass21_Sub2_22.anInt433 > 0) {
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(null);
			this.aClass21_Sub2_22.method4053(1.0F, 0.0F);
			this.aClass21_Sub2_22.method4073(0);
		}
		this.aClass21_Sub2_22.method4114(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aap", name = "d", descriptor = "()V", line = 55)
	@Override
	void method1238() {
		this.aClass90_2.method21650('\u0001');
		if (this.aClass21_Sub2_22.anInt433 > 0) {
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(null);
			this.aClass21_Sub2_22.method4053(1.0F, 0.0F);
			this.aClass21_Sub2_22.method4073(0);
		}
		this.aClass21_Sub2_22.method4114(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aap", name = "q", descriptor = "()V", line = 55)
	@Override
	void method1239() {
		this.aClass90_2.method21650('\u0001');
		if (this.aClass21_Sub2_22.anInt433 > 0) {
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(null);
			this.aClass21_Sub2_22.method4053(1.0F, 0.0F);
			this.aClass21_Sub2_22.method4073(0);
		}
		this.aClass21_Sub2_22.method4114(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aap", name = "n", descriptor = "()V", line = 55)
	@Override
	void method1229() {
		this.aClass90_2.method21650('\u0001');
		if (this.aClass21_Sub2_22.anInt433 > 0) {
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(null);
			this.aClass21_Sub2_22.method4053(1.0F, 0.0F);
			this.aClass21_Sub2_22.method4073(0);
		}
		this.aClass21_Sub2_22.method4114(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aap", name = "h", descriptor = "(II)V", line = 69)
	@Override
	void method1232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass92_2.aBoolean535) {
				this.aClass21_Sub2_22.method4074(this.aClass92_2.aClass4_Sub4_1);
				aFloatArray4[0] = 0.0F;
				aFloatArray4[1] = 0.0F;
				aFloatArray4[2] = 0.0F;
				aFloatArray4[3] = (float) (this.aClass21_Sub2_22.anInt443 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray4, 0);
			} else {
				@Pc(53) int local53 = this.aClass21_Sub2_22.anInt443 % 4000 * 16 / 4000;
				this.aClass21_Sub2_22.method4074(this.aClass92_2.aClass4_Sub1Array2[local53]);
			}
		} else if (this.aClass92_2.aBoolean535) {
			this.aClass21_Sub2_22.method4074(this.aClass92_2.aClass4_Sub4_1);
			aFloatArray4[0] = 0.0F;
			aFloatArray4[1] = 0.0F;
			aFloatArray4[2] = 0.0F;
			aFloatArray4[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray4, 0);
		} else {
			this.aClass21_Sub2_22.method4074(this.aClass92_2.aClass4_Sub1Array2[0]);
		}
	}

	@OriginalMember(owner = "client!aap", name = "m", descriptor = "(II)V", line = 69)
	@Override
	void method1235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass92_2.aBoolean535) {
				this.aClass21_Sub2_22.method4074(this.aClass92_2.aClass4_Sub4_1);
				aFloatArray4[0] = 0.0F;
				aFloatArray4[1] = 0.0F;
				aFloatArray4[2] = 0.0F;
				aFloatArray4[3] = (float) (this.aClass21_Sub2_22.anInt443 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray4, 0);
			} else {
				@Pc(53) int local53 = this.aClass21_Sub2_22.anInt443 % 4000 * 16 / 4000;
				this.aClass21_Sub2_22.method4074(this.aClass92_2.aClass4_Sub1Array2[local53]);
			}
		} else if (this.aClass92_2.aBoolean535) {
			this.aClass21_Sub2_22.method4074(this.aClass92_2.aClass4_Sub4_1);
			aFloatArray4[0] = 0.0F;
			aFloatArray4[1] = 0.0F;
			aFloatArray4[2] = 0.0F;
			aFloatArray4[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray4, 0);
		} else {
			this.aClass21_Sub2_22.method4074(this.aClass92_2.aClass4_Sub1Array2[0]);
		}
	}

	@OriginalMember(owner = "client!aap", name = "x", descriptor = "(Lclient!bf;I)V", line = 96)
	@Override
	void method1227(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aap", name = "v", descriptor = "(Lclient!bf;I)V", line = 96)
	@Override
	void method1240(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aap", name = "t", descriptor = "(Lclient!bf;I)V", line = 96)
	@Override
	void method1241(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aap", name = "w", descriptor = "()V", line = 99)
	void method962() {
		this.aClass90_2 = new Class90(this.aClass21_Sub2_22, 2);
		this.aClass90_2.method21660(0);
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4114(7681, 260);
		this.aClass21_Sub2_22.method4077(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		this.aClass21_Sub2_22.method4073(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass92_2.aBoolean535) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass90_2.method21649();
		this.aClass90_2.method21660(1);
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4114(8448, 8448);
		this.aClass21_Sub2_22.method4077(0, 5890, 768);
		OpenGL.glDisable(3168);
		this.aClass21_Sub2_22.method4073(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass92_2.aBoolean535) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass90_2.method21649();
	}

	@OriginalMember(owner = "client!aap", name = "o", descriptor = "()V", line = 99)
	void method963() {
		this.aClass90_2 = new Class90(this.aClass21_Sub2_22, 2);
		this.aClass90_2.method21660(0);
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4114(7681, 260);
		this.aClass21_Sub2_22.method4077(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		this.aClass21_Sub2_22.method4073(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass92_2.aBoolean535) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass90_2.method21649();
		this.aClass90_2.method21660(1);
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4114(8448, 8448);
		this.aClass21_Sub2_22.method4077(0, 5890, 768);
		OpenGL.glDisable(3168);
		this.aClass21_Sub2_22.method4073(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass92_2.aBoolean535) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass90_2.method21649();
	}
}
