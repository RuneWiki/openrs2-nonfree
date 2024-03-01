package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class Class90 {

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
	final int anInt2935;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!abt;I)V", line = 9)
	Class90(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt2935 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "(I)V", line = 14)
	void method21651(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt2935 + arg0, 4864);
	}

	@OriginalMember(owner = "client!bg", name = "x", descriptor = "(I)V", line = 14)
	void method21653(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt2935 + arg0, 4864);
	}

	@OriginalMember(owner = "client!bg", name = "s", descriptor = "(I)V", line = 14)
	void method21654(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt2935 + arg0, 4864);
	}

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "(I)V", line = 14)
	void method21658(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt2935 + arg0, 4864);
	}

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "(I)V", line = 14)
	void method21660(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt2935 + arg0, 4864);
	}

	@OriginalMember(owner = "client!bg", name = "u", descriptor = "()V", line = 18)
	void method21648() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "()V", line = 18)
	void method21649() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "()V", line = 18)
	void method21652() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!bg", name = "y", descriptor = "()V", line = 18)
	void method21656() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "()V", line = 18)
	void method21657() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!bg", name = "z", descriptor = "()V", line = 18)
	void method21659() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "(C)V", line = 22)
	void method21650(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt2935 + arg0);
	}

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "(C)V", line = 22)
	void method21655(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt2935 + arg0);
	}

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "(C)V", line = 22)
	void method21661(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt2935 + arg0);
	}
}
