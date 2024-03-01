package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aat")
public class Class7_Sub5 extends Class7 {

	@OriginalMember(owner = "client!aat", name = "a", descriptor = "C")
	static final char aChar5 = '\u0000';

	@OriginalMember(owner = "client!aat", name = "g", descriptor = "C")
	static final char aChar6 = '\u0001';

	@OriginalMember(owner = "client!aat", name = "h", descriptor = "Z")
	boolean aBoolean35 = false;

	@OriginalMember(owner = "client!aat", name = "l", descriptor = "Lclient!bg;")
	Class90 aClass90_3;

	@OriginalMember(owner = "client!aat", name = "<init>", descriptor = "(Lclient!abt;)V", line = 14)
	Class7_Sub5(@OriginalArg(0) Class21_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean84) {
			this.aClass90_3 = new Class90(arg0, 2);
			this.aClass90_3.method21660(0);
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4114(34165, 7681);
			this.aClass21_Sub2_22.method4077(2, 34168, 770);
			this.aClass21_Sub2_22.method4078(0, 34167, 770);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			this.aClass21_Sub2_22.method4073(0);
			this.aClass90_3.method21649();
			this.aClass90_3.method21660(1);
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4114(8448, 8448);
			this.aClass21_Sub2_22.method4077(2, 34166, 770);
			this.aClass21_Sub2_22.method4078(0, 5890, 770);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aClass21_Sub2_22.method4073(0);
			this.aClass90_3.method21649();
		}
	}

	@OriginalMember(owner = "client!aat", name = "s", descriptor = "()Z", line = 47)
	@Override
	boolean method1226() {
		return true;
	}

	@OriginalMember(owner = "client!aat", name = "u", descriptor = "()Z", line = 47)
	@Override
	boolean method1233() {
		return true;
	}

	@OriginalMember(owner = "client!aat", name = "y", descriptor = "()Z", line = 47)
	@Override
	boolean method1230() {
		return true;
	}

	@OriginalMember(owner = "client!aat", name = "p", descriptor = "()Z", line = 47)
	@Override
	boolean method1222() {
		return true;
	}

	@OriginalMember(owner = "client!aat", name = "a", descriptor = "(Z)V", line = 51)
	@Override
	void method1223(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class4_Sub2 local3 = this.aClass21_Sub2_22.method4057();
		if (this.aClass90_3 == null || local3 == null || !arg0) {
			this.aClass21_Sub2_22.method4078(0, 34168, 770);
			return;
		}
		this.aClass90_3.method21650('\u0000');
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(local3);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass21_Sub2_22.aClass328_12.method26070(this.aClass21_Sub2_22.aFloatArray28), 0);
		OpenGL.glScalef(1.0F, -1.0F, -1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass21_Sub2_22.method4073(0);
		this.aBoolean35 = true;
	}

	@OriginalMember(owner = "client!aat", name = "b", descriptor = "(Z)V", line = 51)
	@Override
	void method1231(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class4_Sub2 local3 = this.aClass21_Sub2_22.method4057();
		if (this.aClass90_3 == null || local3 == null || !arg0) {
			this.aClass21_Sub2_22.method4078(0, 34168, 770);
			return;
		}
		this.aClass90_3.method21650('\u0000');
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(local3);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass21_Sub2_22.aClass328_12.method26070(this.aClass21_Sub2_22.aFloatArray28), 0);
		OpenGL.glScalef(1.0F, -1.0F, -1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass21_Sub2_22.method4073(0);
		this.aBoolean35 = true;
	}

	@OriginalMember(owner = "client!aat", name = "z", descriptor = "(Z)V", line = 51)
	@Override
	void method1228(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class4_Sub2 local3 = this.aClass21_Sub2_22.method4057();
		if (this.aClass90_3 == null || local3 == null || !arg0) {
			this.aClass21_Sub2_22.method4078(0, 34168, 770);
			return;
		}
		this.aClass90_3.method21650('\u0000');
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(local3);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass21_Sub2_22.aClass328_12.method26070(this.aClass21_Sub2_22.aFloatArray28), 0);
		OpenGL.glScalef(1.0F, -1.0F, -1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass21_Sub2_22.method4073(0);
		this.aBoolean35 = true;
	}

	@OriginalMember(owner = "client!aat", name = "c", descriptor = "(Z)V", line = 51)
	@Override
	void method1225(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class4_Sub2 local3 = this.aClass21_Sub2_22.method4057();
		if (this.aClass90_3 == null || local3 == null || !arg0) {
			this.aClass21_Sub2_22.method4078(0, 34168, 770);
			return;
		}
		this.aClass90_3.method21650('\u0000');
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(local3);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass21_Sub2_22.aClass328_12.method26070(this.aClass21_Sub2_22.aFloatArray28), 0);
		OpenGL.glScalef(1.0F, -1.0F, -1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass21_Sub2_22.method4073(0);
		this.aBoolean35 = true;
	}

	@OriginalMember(owner = "client!aat", name = "g", descriptor = "(Z)V", line = 67)
	@Override
	void method1224(@OriginalArg(0) boolean arg0) {
		this.aClass21_Sub2_22.method4114(8448, 7681);
	}

	@OriginalMember(owner = "client!aat", name = "j", descriptor = "(Z)V", line = 67)
	@Override
	void method1234() {
		this.aClass21_Sub2_22.method4114(8448, 7681);
	}

	@OriginalMember(owner = "client!aat", name = "n", descriptor = "()V", line = 71)
	@Override
	void method1229() {
		if (this.aBoolean35) {
			this.aClass90_3.method21650('\u0001');
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(null);
			this.aClass21_Sub2_22.method4073(0);
		} else {
			this.aClass21_Sub2_22.method4078(0, 5890, 770);
		}
		this.aClass21_Sub2_22.method4114(8448, 8448);
		this.aBoolean35 = false;
	}

	@OriginalMember(owner = "client!aat", name = "l", descriptor = "()V", line = 71)
	@Override
	void method1221() {
		if (this.aBoolean35) {
			this.aClass90_3.method21650('\u0001');
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(null);
			this.aClass21_Sub2_22.method4073(0);
		} else {
			this.aClass21_Sub2_22.method4078(0, 5890, 770);
		}
		this.aClass21_Sub2_22.method4114(8448, 8448);
		this.aBoolean35 = false;
	}

	@OriginalMember(owner = "client!aat", name = "e", descriptor = "()V", line = 71)
	@Override
	void method1236() {
		if (this.aBoolean35) {
			this.aClass90_3.method21650('\u0001');
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(null);
			this.aClass21_Sub2_22.method4073(0);
		} else {
			this.aClass21_Sub2_22.method4078(0, 5890, 770);
		}
		this.aClass21_Sub2_22.method4114(8448, 8448);
		this.aBoolean35 = false;
	}

	@OriginalMember(owner = "client!aat", name = "r", descriptor = "()V", line = 71)
	@Override
	void method1237() {
		if (this.aBoolean35) {
			this.aClass90_3.method21650('\u0001');
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(null);
			this.aClass21_Sub2_22.method4073(0);
		} else {
			this.aClass21_Sub2_22.method4078(0, 5890, 770);
		}
		this.aClass21_Sub2_22.method4114(8448, 8448);
		this.aBoolean35 = false;
	}

	@OriginalMember(owner = "client!aat", name = "d", descriptor = "()V", line = 71)
	@Override
	void method1238() {
		if (this.aBoolean35) {
			this.aClass90_3.method21650('\u0001');
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(null);
			this.aClass21_Sub2_22.method4073(0);
		} else {
			this.aClass21_Sub2_22.method4078(0, 5890, 770);
		}
		this.aClass21_Sub2_22.method4114(8448, 8448);
		this.aBoolean35 = false;
	}

	@OriginalMember(owner = "client!aat", name = "q", descriptor = "()V", line = 71)
	@Override
	void method1239() {
		if (this.aBoolean35) {
			this.aClass90_3.method21650('\u0001');
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(null);
			this.aClass21_Sub2_22.method4073(0);
		} else {
			this.aClass21_Sub2_22.method4078(0, 5890, 770);
		}
		this.aClass21_Sub2_22.method4114(8448, 8448);
		this.aBoolean35 = false;
	}

	@OriginalMember(owner = "client!aat", name = "h", descriptor = "(II)V", line = 82)
	@Override
	void method1232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aat", name = "m", descriptor = "(II)V", line = 82)
	@Override
	void method1235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aat", name = "t", descriptor = "(Lclient!bf;I)V", line = 85)
	@Override
	void method1241(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
		this.aClass21_Sub2_22.method4074(arg0);
		this.aClass21_Sub2_22.method4115(arg1);
	}

	@OriginalMember(owner = "client!aat", name = "v", descriptor = "(Lclient!bf;I)V", line = 85)
	@Override
	void method1240(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
		this.aClass21_Sub2_22.method4074(arg0);
		this.aClass21_Sub2_22.method4115(arg1);
	}

	@OriginalMember(owner = "client!aat", name = "x", descriptor = "(Lclient!bf;I)V", line = 85)
	@Override
	void method1227(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
		this.aClass21_Sub2_22.method4074(arg0);
		this.aClass21_Sub2_22.method4115(arg1);
	}
}
