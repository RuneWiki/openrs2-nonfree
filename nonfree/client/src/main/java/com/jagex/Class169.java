package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class Class169 {

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
	final int anInt3291;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!aeq;I)V", line = 9)
	Class169(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt3291 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "(I)V", line = 14)
	void method24412(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt3291 + arg0, 4864);
	}

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "(I)V", line = 14)
	void method24413(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt3291 + arg0, 4864);
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "()V", line = 18)
	void method24414() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!bg", name = "y", descriptor = "()V", line = 18)
	void method24415() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!bg", name = "v", descriptor = "(C)V", line = 22)
	void method24416(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt3291 + arg0);
	}

	@OriginalMember(owner = "client!bg", name = "t", descriptor = "(C)V", line = 22)
	void method24417(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt3291 + arg0);
	}

	@OriginalMember(owner = "client!bg", name = "w", descriptor = "(C)V", line = 22)
	void method24418(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt3291 + arg0);
	}
}
