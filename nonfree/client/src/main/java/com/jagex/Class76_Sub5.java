package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ado")
public class Class76_Sub5 extends Class76 {

	@OriginalMember(owner = "client!ado", name = "v", descriptor = "C")
	static final char aChar3 = '\u0001';

	@OriginalMember(owner = "client!ado", name = "c", descriptor = "C")
	static final char aChar4 = '\u0000';

	@OriginalMember(owner = "client!ado", name = "y", descriptor = "Z")
	boolean aBoolean38 = false;

	@OriginalMember(owner = "client!ado", name = "l", descriptor = "Lclient!bg;")
	Class169 aClass169_2;

	@OriginalMember(owner = "client!ado", name = "<init>", descriptor = "(Lclient!aeq;)V", line = 14)
	Class76_Sub5(@OriginalArg(0) Class86_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean140) {
			this.aClass169_2 = new Class169(arg0, 2);
			this.aClass169_2.method24412(0);
			this.aClass86_Sub3_22.method6190(1);
			this.aClass86_Sub3_22.method6207(34165, 7681);
			this.aClass86_Sub3_22.method6213(2, 34168, 770);
			this.aClass86_Sub3_22.method6214(0, 34167, 770);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			this.aClass86_Sub3_22.method6190(0);
			this.aClass169_2.method24414();
			this.aClass169_2.method24412(1);
			this.aClass86_Sub3_22.method6190(1);
			this.aClass86_Sub3_22.method6207(8448, 8448);
			this.aClass86_Sub3_22.method6213(2, 34166, 770);
			this.aClass86_Sub3_22.method6214(0, 5890, 770);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aClass86_Sub3_22.method6190(0);
			this.aClass169_2.method24414();
		}
	}

	@OriginalMember(owner = "client!ado", name = "p", descriptor = "()Z", line = 47)
	@Override
	boolean method1995() {
		return true;
	}

	@OriginalMember(owner = "client!ado", name = "q", descriptor = "()Z", line = 47)
	@Override
	boolean method1981() {
		return true;
	}

	@OriginalMember(owner = "client!ado", name = "x", descriptor = "()Z", line = 47)
	@Override
	boolean method1982() {
		return true;
	}

	@OriginalMember(owner = "client!ado", name = "t", descriptor = "()Z", line = 47)
	@Override
	boolean method1990() {
		return true;
	}

	@OriginalMember(owner = "client!ado", name = "d", descriptor = "(Z)V", line = 51)
	@Override
	void method1983(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class78_Sub1 local3 = this.aClass86_Sub3_22.method6128();
		if (this.aClass169_2 == null || local3 == null || !arg0) {
			this.aClass86_Sub3_22.method6214(0, 34168, 770);
			return;
		}
		this.aClass169_2.method24416('\u0000');
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(local3);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass86_Sub3_22.aClass442_25.method29041(this.aClass86_Sub3_22.aFloatArray22), 0);
		OpenGL.glScalef(1.0F, -1.0F, -1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass86_Sub3_22.method6190(0);
		this.aBoolean38 = true;
	}

	@OriginalMember(owner = "client!ado", name = "s", descriptor = "(Z)V", line = 51)
	@Override
	void method1992(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class78_Sub1 local3 = this.aClass86_Sub3_22.method6128();
		if (this.aClass169_2 == null || local3 == null || !arg0) {
			this.aClass86_Sub3_22.method6214(0, 34168, 770);
			return;
		}
		this.aClass169_2.method24416('\u0000');
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(local3);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass86_Sub3_22.aClass442_25.method29041(this.aClass86_Sub3_22.aFloatArray22), 0);
		OpenGL.glScalef(1.0F, -1.0F, -1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass86_Sub3_22.method6190(0);
		this.aBoolean38 = true;
	}

	@OriginalMember(owner = "client!ado", name = "r", descriptor = "(Z)V", line = 51)
	@Override
	void method1985(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class78_Sub1 local3 = this.aClass86_Sub3_22.method6128();
		if (this.aClass169_2 == null || local3 == null || !arg0) {
			this.aClass86_Sub3_22.method6214(0, 34168, 770);
			return;
		}
		this.aClass169_2.method24416('\u0000');
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(local3);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass86_Sub3_22.aClass442_25.method29041(this.aClass86_Sub3_22.aFloatArray22), 0);
		OpenGL.glScalef(1.0F, -1.0F, -1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass86_Sub3_22.method6190(0);
		this.aBoolean38 = true;
	}

	@OriginalMember(owner = "client!ado", name = "g", descriptor = "(Z)V", line = 51)
	@Override
	void method1986(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class78_Sub1 local3 = this.aClass86_Sub3_22.method6128();
		if (this.aClass169_2 == null || local3 == null || !arg0) {
			this.aClass86_Sub3_22.method6214(0, 34168, 770);
			return;
		}
		this.aClass169_2.method24416('\u0000');
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(local3);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass86_Sub3_22.aClass442_25.method29041(this.aClass86_Sub3_22.aFloatArray22), 0);
		OpenGL.glScalef(1.0F, -1.0F, -1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass86_Sub3_22.method6190(0);
		this.aBoolean38 = true;
	}

	@OriginalMember(owner = "client!ado", name = "c", descriptor = "(Z)V", line = 51)
	@Override
	void method1976(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class78_Sub1 local3 = this.aClass86_Sub3_22.method6128();
		if (this.aClass169_2 == null || local3 == null || !arg0) {
			this.aClass86_Sub3_22.method6214(0, 34168, 770);
			return;
		}
		this.aClass169_2.method24416('\u0000');
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(local3);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass86_Sub3_22.aClass442_25.method29041(this.aClass86_Sub3_22.aFloatArray22), 0);
		OpenGL.glScalef(1.0F, -1.0F, -1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass86_Sub3_22.method6190(0);
		this.aBoolean38 = true;
	}

	@OriginalMember(owner = "client!ado", name = "v", descriptor = "(Z)V", line = 67)
	@Override
	void method1977(@OriginalArg(0) boolean arg0) {
		this.aClass86_Sub3_22.method6207(8448, 7681);
	}

	@OriginalMember(owner = "client!ado", name = "k", descriptor = "(Z)V", line = 67)
	@Override
	void method1980() {
		this.aClass86_Sub3_22.method6207(8448, 7681);
	}

	@OriginalMember(owner = "client!ado", name = "z", descriptor = "(Z)V", line = 67)
	@Override
	void method1987() {
		this.aClass86_Sub3_22.method6207(8448, 7681);
	}

	@OriginalMember(owner = "client!ado", name = "j", descriptor = "(Z)V", line = 67)
	@Override
	void method1988() {
		this.aClass86_Sub3_22.method6207(8448, 7681);
	}

	@OriginalMember(owner = "client!ado", name = "i", descriptor = "(Z)V", line = 67)
	@Override
	void method1984() {
		this.aClass86_Sub3_22.method6207(8448, 7681);
	}

	@OriginalMember(owner = "client!ado", name = "l", descriptor = "()V", line = 71)
	@Override
	void method1975() {
		if (this.aBoolean38) {
			this.aClass169_2.method24416('\u0001');
			this.aClass86_Sub3_22.method6190(1);
			this.aClass86_Sub3_22.method6195(null);
			this.aClass86_Sub3_22.method6190(0);
		} else {
			this.aClass86_Sub3_22.method6214(0, 5890, 770);
		}
		this.aClass86_Sub3_22.method6207(8448, 8448);
		this.aBoolean38 = false;
	}

	@OriginalMember(owner = "client!ado", name = "u", descriptor = "()V", line = 71)
	@Override
	void method1989() {
		if (this.aBoolean38) {
			this.aClass169_2.method24416('\u0001');
			this.aClass86_Sub3_22.method6190(1);
			this.aClass86_Sub3_22.method6195(null);
			this.aClass86_Sub3_22.method6190(0);
		} else {
			this.aClass86_Sub3_22.method6214(0, 5890, 770);
		}
		this.aClass86_Sub3_22.method6207(8448, 8448);
		this.aBoolean38 = false;
	}

	@OriginalMember(owner = "client!ado", name = "f", descriptor = "()V", line = 71)
	@Override
	void method1993() {
		if (this.aBoolean38) {
			this.aClass169_2.method24416('\u0001');
			this.aClass86_Sub3_22.method6190(1);
			this.aClass86_Sub3_22.method6195(null);
			this.aClass86_Sub3_22.method6190(0);
		} else {
			this.aClass86_Sub3_22.method6214(0, 5890, 770);
		}
		this.aClass86_Sub3_22.method6207(8448, 8448);
		this.aBoolean38 = false;
	}

	@OriginalMember(owner = "client!ado", name = "e", descriptor = "()V", line = 71)
	@Override
	void method1974() {
		if (this.aBoolean38) {
			this.aClass169_2.method24416('\u0001');
			this.aClass86_Sub3_22.method6190(1);
			this.aClass86_Sub3_22.method6195(null);
			this.aClass86_Sub3_22.method6190(0);
		} else {
			this.aClass86_Sub3_22.method6214(0, 5890, 770);
		}
		this.aClass86_Sub3_22.method6207(8448, 8448);
		this.aBoolean38 = false;
	}

	@OriginalMember(owner = "client!ado", name = "y", descriptor = "(II)V", line = 82)
	@Override
	void method1979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ado", name = "o", descriptor = "(II)V", line = 82)
	@Override
	void method1994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ado", name = "b", descriptor = "(II)V", line = 82)
	@Override
	void method1978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ado", name = "n", descriptor = "(Lclient!bx;I)V", line = 85)
	@Override
	void method1996(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1) {
		this.aClass86_Sub3_22.method6195(arg0);
		this.aClass86_Sub3_22.method6198(arg1);
	}

	@OriginalMember(owner = "client!ado", name = "w", descriptor = "(Lclient!bx;I)V", line = 85)
	@Override
	void method1991(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1) {
		this.aClass86_Sub3_22.method6195(arg0);
		this.aClass86_Sub3_22.method6198(arg1);
	}
}
