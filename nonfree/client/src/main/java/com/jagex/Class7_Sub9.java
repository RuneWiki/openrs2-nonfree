package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaz")
public class Class7_Sub9 extends Class7 {

	@OriginalMember(owner = "client!aaz", name = "g", descriptor = "C")
	static final char aChar9 = '\u0001';

	@OriginalMember(owner = "client!aaz", name = "a", descriptor = "C")
	static final char aChar10 = '\u0000';

	@OriginalMember(owner = "client!aaz", name = "x", descriptor = "[F")
	static final float[] aFloatArray5 = new float[4];

	@OriginalMember(owner = "client!aaz", name = "h", descriptor = "Lclient!bi;")
	Class92 aClass92_5;

	@OriginalMember(owner = "client!aaz", name = "l", descriptor = "Lclient!bg;")
	Class90 aClass90_5;

	@OriginalMember(owner = "client!aaz", name = "<init>", descriptor = "(Lclient!abt;Lclient!bi;)V", line = 14)
	Class7_Sub9(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) Class92 arg1) {
		super(arg0);
		this.aClass92_5 = arg1;
		this.aClass90_5 = new Class90(arg0, 2);
		this.aClass90_5.method21660(0);
		this.aClass21_Sub2_22.method4073(1);
		if (this.aClass92_5.aBoolean535) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		this.aClass21_Sub2_22.method4073(0);
		this.aClass90_5.method21649();
		this.aClass90_5.method21660(1);
		this.aClass21_Sub2_22.method4073(1);
		if (this.aClass92_5.aBoolean535) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass21_Sub2_22.method4073(0);
		this.aClass90_5.method21649();
	}

	@OriginalMember(owner = "client!aaz", name = "p", descriptor = "()Z", line = 39)
	@Override
	boolean method1222() {
		return true;
	}

	@OriginalMember(owner = "client!aaz", name = "u", descriptor = "()Z", line = 39)
	@Override
	boolean method1233() {
		return true;
	}

	@OriginalMember(owner = "client!aaz", name = "s", descriptor = "()Z", line = 39)
	@Override
	boolean method1226() {
		return true;
	}

	@OriginalMember(owner = "client!aaz", name = "y", descriptor = "()Z", line = 39)
	@Override
	boolean method1230() {
		return true;
	}

	@OriginalMember(owner = "client!aaz", name = "a", descriptor = "(Z)V", line = 43)
	@Override
	void method1223(@OriginalArg(0) boolean arg0) {
		this.aClass90_5.method21650('\u0000');
		if (this.aClass92_5.aBoolean535) {
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(this.aClass92_5.aClass4_Sub4_3);
			this.aClass21_Sub2_22.method4073(0);
		}
	}

	@OriginalMember(owner = "client!aaz", name = "b", descriptor = "(Z)V", line = 43)
	@Override
	void method1231(@OriginalArg(0) boolean arg0) {
		this.aClass90_5.method21650('\u0000');
		if (this.aClass92_5.aBoolean535) {
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(this.aClass92_5.aClass4_Sub4_3);
			this.aClass21_Sub2_22.method4073(0);
		}
	}

	@OriginalMember(owner = "client!aaz", name = "c", descriptor = "(Z)V", line = 43)
	@Override
	void method1225(@OriginalArg(0) boolean arg0) {
		this.aClass90_5.method21650('\u0000');
		if (this.aClass92_5.aBoolean535) {
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(this.aClass92_5.aClass4_Sub4_3);
			this.aClass21_Sub2_22.method4073(0);
		}
	}

	@OriginalMember(owner = "client!aaz", name = "z", descriptor = "(Z)V", line = 43)
	@Override
	void method1228(@OriginalArg(0) boolean arg0) {
		this.aClass90_5.method21650('\u0000');
		if (this.aClass92_5.aBoolean535) {
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(this.aClass92_5.aClass4_Sub4_3);
			this.aClass21_Sub2_22.method4073(0);
		}
	}

	@OriginalMember(owner = "client!aaz", name = "j", descriptor = "(Z)V", line = 51)
	@Override
	void method1234() {
	}

	@OriginalMember(owner = "client!aaz", name = "g", descriptor = "(Z)V", line = 51)
	@Override
	void method1224(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aaz", name = "l", descriptor = "()V", line = 54)
	@Override
	void method1221() {
		this.aClass90_5.method21650('\u0001');
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(null);
		this.aClass21_Sub2_22.method4073(0);
	}

	@OriginalMember(owner = "client!aaz", name = "d", descriptor = "()V", line = 54)
	@Override
	void method1238() {
		this.aClass90_5.method21650('\u0001');
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(null);
		this.aClass21_Sub2_22.method4073(0);
	}

	@OriginalMember(owner = "client!aaz", name = "n", descriptor = "()V", line = 54)
	@Override
	void method1229() {
		this.aClass90_5.method21650('\u0001');
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(null);
		this.aClass21_Sub2_22.method4073(0);
	}

	@OriginalMember(owner = "client!aaz", name = "e", descriptor = "()V", line = 54)
	@Override
	void method1236() {
		this.aClass90_5.method21650('\u0001');
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(null);
		this.aClass21_Sub2_22.method4073(0);
	}

	@OriginalMember(owner = "client!aaz", name = "r", descriptor = "()V", line = 54)
	@Override
	void method1237() {
		this.aClass90_5.method21650('\u0001');
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(null);
		this.aClass21_Sub2_22.method4073(0);
	}

	@OriginalMember(owner = "client!aaz", name = "q", descriptor = "()V", line = 54)
	@Override
	void method1239() {
		this.aClass90_5.method21650('\u0001');
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(null);
		this.aClass21_Sub2_22.method4073(0);
	}

	@OriginalMember(owner = "client!aaz", name = "h", descriptor = "(II)V", line = 61)
	@Override
	void method1232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		this.aClass21_Sub2_22.method4073(1);
		if (local35) {
			aFloatArray5[0] = local27;
			aFloatArray5[1] = 0.0F;
			aFloatArray5[2] = 0.0F;
			aFloatArray5[3] = 0.0F;
		} else {
			aFloatArray5[0] = 0.0F;
			aFloatArray5[1] = 0.0F;
			aFloatArray5[2] = local27;
			aFloatArray5[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray5, 0);
		aFloatArray5[0] = 0.0F;
		aFloatArray5[1] = local27;
		aFloatArray5[2] = 0.0F;
		aFloatArray5[3] = (float) this.aClass21_Sub2_22.anInt443 * local8 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray5, 0);
		if (this.aClass92_5.aBoolean535) {
			aFloatArray5[0] = 0.0F;
			aFloatArray5[1] = 0.0F;
			aFloatArray5[2] = 0.0F;
			aFloatArray5[3] = (float) this.aClass21_Sub2_22.anInt443 * local19 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray5, 0);
		} else {
			@Pc(121) int local121 = (int) (local19 * (float) this.aClass21_Sub2_22.anInt443 * 16.0F);
			this.aClass21_Sub2_22.method4074(this.aClass92_5.aClass4_Sub1Array3[local121 % 16]);
		}
		this.aClass21_Sub2_22.method4073(0);
	}

	@OriginalMember(owner = "client!aaz", name = "m", descriptor = "(II)V", line = 61)
	@Override
	void method1235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		this.aClass21_Sub2_22.method4073(1);
		if (local35) {
			aFloatArray5[0] = local27;
			aFloatArray5[1] = 0.0F;
			aFloatArray5[2] = 0.0F;
			aFloatArray5[3] = 0.0F;
		} else {
			aFloatArray5[0] = 0.0F;
			aFloatArray5[1] = 0.0F;
			aFloatArray5[2] = local27;
			aFloatArray5[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray5, 0);
		aFloatArray5[0] = 0.0F;
		aFloatArray5[1] = local27;
		aFloatArray5[2] = 0.0F;
		aFloatArray5[3] = (float) this.aClass21_Sub2_22.anInt443 * local8 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray5, 0);
		if (this.aClass92_5.aBoolean535) {
			aFloatArray5[0] = 0.0F;
			aFloatArray5[1] = 0.0F;
			aFloatArray5[2] = 0.0F;
			aFloatArray5[3] = (float) this.aClass21_Sub2_22.anInt443 * local19 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray5, 0);
		} else {
			@Pc(121) int local121 = (int) (local19 * (float) this.aClass21_Sub2_22.anInt443 * 16.0F);
			this.aClass21_Sub2_22.method4074(this.aClass92_5.aClass4_Sub1Array3[local121 % 16]);
		}
		this.aClass21_Sub2_22.method4073(0);
	}

	@OriginalMember(owner = "client!aaz", name = "x", descriptor = "(Lclient!bf;I)V", line = 99)
	@Override
	void method1227(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
		this.aClass21_Sub2_22.method4074(arg0);
		this.aClass21_Sub2_22.method4115(arg1);
	}

	@OriginalMember(owner = "client!aaz", name = "v", descriptor = "(Lclient!bf;I)V", line = 99)
	@Override
	void method1240(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
		this.aClass21_Sub2_22.method4074(arg0);
		this.aClass21_Sub2_22.method4115(arg1);
	}

	@OriginalMember(owner = "client!aaz", name = "t", descriptor = "(Lclient!bf;I)V", line = 99)
	@Override
	void method1241(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
		this.aClass21_Sub2_22.method4074(arg0);
		this.aClass21_Sub2_22.method4115(arg1);
	}
}
