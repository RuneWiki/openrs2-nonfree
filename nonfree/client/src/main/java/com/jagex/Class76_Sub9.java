package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adz")
public class Class76_Sub9 extends Class76 {

	@OriginalMember(owner = "client!adz", name = "v", descriptor = "C")
	static final char aChar9 = '\u0001';

	@OriginalMember(owner = "client!adz", name = "c", descriptor = "C")
	static final char aChar10 = '\u0000';

	@OriginalMember(owner = "client!adz", name = "w", descriptor = "[F")
	static final float[] aFloatArray5 = new float[4];

	@OriginalMember(owner = "client!adz", name = "y", descriptor = "Lclient!bf;")
	Class168 aClass168_5;

	@OriginalMember(owner = "client!adz", name = "l", descriptor = "Lclient!bg;")
	Class169 aClass169_5;

	@OriginalMember(owner = "client!adz", name = "<init>", descriptor = "(Lclient!aeq;Lclient!bf;)V", line = 14)
	Class76_Sub9(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Class168 arg1) {
		super(arg0);
		this.aClass168_5 = arg1;
		this.aClass169_5 = new Class169(arg0, 2);
		this.aClass169_5.method24412(0);
		this.aClass86_Sub3_22.method6190(1);
		if (this.aClass168_5.aBoolean564) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		this.aClass86_Sub3_22.method6190(0);
		this.aClass169_5.method24414();
		this.aClass169_5.method24412(1);
		this.aClass86_Sub3_22.method6190(1);
		if (this.aClass168_5.aBoolean564) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass86_Sub3_22.method6190(0);
		this.aClass169_5.method24414();
	}

	@OriginalMember(owner = "client!adz", name = "q", descriptor = "()Z", line = 39)
	@Override
	boolean method1981() {
		return true;
	}

	@OriginalMember(owner = "client!adz", name = "p", descriptor = "()Z", line = 39)
	@Override
	boolean method1995() {
		return true;
	}

	@OriginalMember(owner = "client!adz", name = "t", descriptor = "()Z", line = 39)
	@Override
	boolean method1990() {
		return true;
	}

	@OriginalMember(owner = "client!adz", name = "x", descriptor = "()Z", line = 39)
	@Override
	boolean method1982() {
		return true;
	}

	@OriginalMember(owner = "client!adz", name = "c", descriptor = "(Z)V", line = 43)
	@Override
	void method1976(@OriginalArg(0) boolean arg0) {
		this.aClass169_5.method24416('\u0000');
		if (this.aClass168_5.aBoolean564) {
			this.aClass86_Sub3_22.method6190(1);
			this.aClass86_Sub3_22.method6195(this.aClass168_5.aClass78_Sub4_1);
			this.aClass86_Sub3_22.method6190(0);
		}
	}

	@OriginalMember(owner = "client!adz", name = "d", descriptor = "(Z)V", line = 43)
	@Override
	void method1983(@OriginalArg(0) boolean arg0) {
		this.aClass169_5.method24416('\u0000');
		if (this.aClass168_5.aBoolean564) {
			this.aClass86_Sub3_22.method6190(1);
			this.aClass86_Sub3_22.method6195(this.aClass168_5.aClass78_Sub4_1);
			this.aClass86_Sub3_22.method6190(0);
		}
	}

	@OriginalMember(owner = "client!adz", name = "s", descriptor = "(Z)V", line = 43)
	@Override
	void method1992(@OriginalArg(0) boolean arg0) {
		this.aClass169_5.method24416('\u0000');
		if (this.aClass168_5.aBoolean564) {
			this.aClass86_Sub3_22.method6190(1);
			this.aClass86_Sub3_22.method6195(this.aClass168_5.aClass78_Sub4_1);
			this.aClass86_Sub3_22.method6190(0);
		}
	}

	@OriginalMember(owner = "client!adz", name = "r", descriptor = "(Z)V", line = 43)
	@Override
	void method1985(@OriginalArg(0) boolean arg0) {
		this.aClass169_5.method24416('\u0000');
		if (this.aClass168_5.aBoolean564) {
			this.aClass86_Sub3_22.method6190(1);
			this.aClass86_Sub3_22.method6195(this.aClass168_5.aClass78_Sub4_1);
			this.aClass86_Sub3_22.method6190(0);
		}
	}

	@OriginalMember(owner = "client!adz", name = "g", descriptor = "(Z)V", line = 43)
	@Override
	void method1986(@OriginalArg(0) boolean arg0) {
		this.aClass169_5.method24416('\u0000');
		if (this.aClass168_5.aBoolean564) {
			this.aClass86_Sub3_22.method6190(1);
			this.aClass86_Sub3_22.method6195(this.aClass168_5.aClass78_Sub4_1);
			this.aClass86_Sub3_22.method6190(0);
		}
	}

	@OriginalMember(owner = "client!adz", name = "k", descriptor = "(Z)V", line = 51)
	@Override
	void method1980() {
	}

	@OriginalMember(owner = "client!adz", name = "z", descriptor = "(Z)V", line = 51)
	@Override
	void method1987() {
	}

	@OriginalMember(owner = "client!adz", name = "j", descriptor = "(Z)V", line = 51)
	@Override
	void method1988() {
	}

	@OriginalMember(owner = "client!adz", name = "i", descriptor = "(Z)V", line = 51)
	@Override
	void method1984() {
	}

	@OriginalMember(owner = "client!adz", name = "v", descriptor = "(Z)V", line = 51)
	@Override
	void method1977(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!adz", name = "l", descriptor = "()V", line = 54)
	@Override
	void method1975() {
		this.aClass169_5.method24416('\u0001');
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(null);
		this.aClass86_Sub3_22.method6190(0);
	}

	@OriginalMember(owner = "client!adz", name = "e", descriptor = "()V", line = 54)
	@Override
	void method1974() {
		this.aClass169_5.method24416('\u0001');
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(null);
		this.aClass86_Sub3_22.method6190(0);
	}

	@OriginalMember(owner = "client!adz", name = "u", descriptor = "()V", line = 54)
	@Override
	void method1989() {
		this.aClass169_5.method24416('\u0001');
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(null);
		this.aClass86_Sub3_22.method6190(0);
	}

	@OriginalMember(owner = "client!adz", name = "f", descriptor = "()V", line = 54)
	@Override
	void method1993() {
		this.aClass169_5.method24416('\u0001');
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(null);
		this.aClass86_Sub3_22.method6190(0);
	}

	@OriginalMember(owner = "client!adz", name = "b", descriptor = "(II)V", line = 61)
	@Override
	void method1978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		this.aClass86_Sub3_22.method6190(1);
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
		aFloatArray5[3] = (float) this.aClass86_Sub3_22.anInt723 * local8 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray5, 0);
		if (this.aClass168_5.aBoolean564) {
			aFloatArray5[0] = 0.0F;
			aFloatArray5[1] = 0.0F;
			aFloatArray5[2] = 0.0F;
			aFloatArray5[3] = (float) this.aClass86_Sub3_22.anInt723 * local19 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray5, 0);
		} else {
			@Pc(121) int local121 = (int) (local19 * (float) this.aClass86_Sub3_22.anInt723 * 16.0F);
			this.aClass86_Sub3_22.method6195(this.aClass168_5.aClass78_Sub2Array3[local121 % 16]);
		}
		this.aClass86_Sub3_22.method6190(0);
	}

	@OriginalMember(owner = "client!adz", name = "o", descriptor = "(II)V", line = 61)
	@Override
	void method1994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		this.aClass86_Sub3_22.method6190(1);
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
		aFloatArray5[3] = (float) this.aClass86_Sub3_22.anInt723 * local8 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray5, 0);
		if (this.aClass168_5.aBoolean564) {
			aFloatArray5[0] = 0.0F;
			aFloatArray5[1] = 0.0F;
			aFloatArray5[2] = 0.0F;
			aFloatArray5[3] = (float) this.aClass86_Sub3_22.anInt723 * local19 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray5, 0);
		} else {
			@Pc(121) int local121 = (int) (local19 * (float) this.aClass86_Sub3_22.anInt723 * 16.0F);
			this.aClass86_Sub3_22.method6195(this.aClass168_5.aClass78_Sub2Array3[local121 % 16]);
		}
		this.aClass86_Sub3_22.method6190(0);
	}

	@OriginalMember(owner = "client!adz", name = "y", descriptor = "(II)V", line = 61)
	@Override
	void method1979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		this.aClass86_Sub3_22.method6190(1);
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
		aFloatArray5[3] = (float) this.aClass86_Sub3_22.anInt723 * local8 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray5, 0);
		if (this.aClass168_5.aBoolean564) {
			aFloatArray5[0] = 0.0F;
			aFloatArray5[1] = 0.0F;
			aFloatArray5[2] = 0.0F;
			aFloatArray5[3] = (float) this.aClass86_Sub3_22.anInt723 * local19 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray5, 0);
		} else {
			@Pc(121) int local121 = (int) (local19 * (float) this.aClass86_Sub3_22.anInt723 * 16.0F);
			this.aClass86_Sub3_22.method6195(this.aClass168_5.aClass78_Sub2Array3[local121 % 16]);
		}
		this.aClass86_Sub3_22.method6190(0);
	}

	@OriginalMember(owner = "client!adz", name = "w", descriptor = "(Lclient!bx;I)V", line = 99)
	@Override
	void method1991(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1) {
		this.aClass86_Sub3_22.method6195(arg0);
		this.aClass86_Sub3_22.method6198(arg1);
	}

	@OriginalMember(owner = "client!adz", name = "n", descriptor = "(Lclient!bx;I)V", line = 99)
	@Override
	void method1996(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1) {
		this.aClass86_Sub3_22.method6195(arg0);
		this.aClass86_Sub3_22.method6198(arg1);
	}
}
