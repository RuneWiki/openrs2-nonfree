package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaa")
public class Class3_Sub1_Sub1 extends Class3_Sub1 implements Interface4 {

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "[I")
	static final int[] anIntArray4 = new int[1];

	@OriginalMember(owner = "client!aaa", name = "l", descriptor = "Lclient!abt;")
	final Class21_Sub2 aClass21_Sub2_1;

	@OriginalMember(owner = "client!aaa", name = "x", descriptor = "I")
	final int anInt8;

	@OriginalMember(owner = "client!aaa", name = "s", descriptor = "I")
	final int anInt10;

	@OriginalMember(owner = "client!aaa", name = "y", descriptor = "Lclient!cw;")
	final Class121 aClass121_1;

	@OriginalMember(owner = "client!aaa", name = "u", descriptor = "Lclient!dj;")
	final Class127 aClass127_1;

	@OriginalMember(owner = "client!aaa", name = "h", descriptor = "I")
	int anInt7;

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "I")
	final int anInt9;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lclient!abt;Lclient!cw;Lclient!dj;II)V", line = 18)
	Class3_Sub1_Sub1(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass21_Sub2_1 = arg0;
		this.anInt8 = arg3;
		this.anInt10 = arg4;
		this.aClass121_1 = arg1;
		this.aClass127_1 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray4, 0);
		this.anInt7 = anIntArray4[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt7);
		OpenGL.glRenderbufferStorageEXT(36161, Class21_Sub2.method4240(this.aClass121_1, this.aClass127_1), this.anInt8, this.anInt10);
		this.anInt9 = this.anInt8 * this.anInt10 * this.aClass121_1.anInt3211 * 1629489977 * this.aClass127_1.anInt3315 * -1246993659;
	}

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lclient!abt;Lclient!cw;Lclient!dj;III)V", line = 31)
	Class3_Sub1_Sub1(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass21_Sub2_1 = arg0;
		this.anInt8 = arg3;
		this.anInt10 = arg4;
		this.aClass121_1 = arg1;
		this.aClass127_1 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray4, 0);
		this.anInt7 = anIntArray4[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt7);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg5, Class21_Sub2.method4240(this.aClass121_1, this.aClass127_1), this.anInt8, this.anInt10);
		this.anInt9 = this.anInt8 * this.anInt10 * this.aClass121_1.anInt3211 * 1629489977 * this.aClass127_1.anInt3315 * -1246993659;
	}

	@OriginalMember(owner = "client!aaa", name = "p", descriptor = "()I", line = 45)
	@Override
	public int method27217() {
		return this.anInt8;
	}

	@OriginalMember(owner = "client!aaa", name = "l", descriptor = "()I", line = 45)
	@Override
	public int method27213() {
		return this.anInt8;
	}

	@OriginalMember(owner = "client!aaa", name = "h", descriptor = "()I", line = 45)
	@Override
	public int method27214() {
		return this.anInt8;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "()I", line = 49)
	@Override
	public int method27212() {
		return this.anInt10;
	}

	@OriginalMember(owner = "client!aaa", name = "x", descriptor = "()I", line = 49)
	@Override
	public int method27211() {
		return this.anInt10;
	}

	@OriginalMember(owner = "client!aaa", name = "s", descriptor = "()I", line = 49)
	@Override
	public int method27216() {
		return this.anInt10;
	}

	@OriginalMember(owner = "client!aaa", name = "u", descriptor = "()I", line = 49)
	@Override
	public int method27215() {
		return this.anInt10;
	}

	@OriginalMember(owner = "client!aaa", name = "z", descriptor = "(I)V", line = 53)
	@Override
	public void method22072(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt7);
	}

	@OriginalMember(owner = "client!aaa", name = "n", descriptor = "(I)V", line = 53)
	@Override
	public void method22073(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt7);
	}

	@OriginalMember(owner = "client!aaa", name = "j", descriptor = "(I)V", line = 53)
	@Override
	public void method22074(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt7);
	}

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "(I)V", line = 53)
	@Override
	public void method22071(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt7);
	}

	@OriginalMember(owner = "client!aaa", name = "g", descriptor = "()V", line = 57)
	@Override
	public void method27209() {
		if (this.anInt7 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt7 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt7 = 0;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "y", descriptor = "()V", line = 57)
	@Override
	public void method27208() {
		if (this.anInt7 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt7 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt7 = 0;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "()V", line = 57)
	@Override
	public void method27210() {
		if (this.anInt7 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt7 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt7 = 0;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "f", descriptor = "()V", line = 66)
	void method171() {
		if (this.anInt7 != 0) {
			this.aClass21_Sub2_1.method4106(this.anInt7, this.anInt9);
			this.anInt7 = 0;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "i", descriptor = "()V", line = 66)
	void method173() {
		if (this.anInt7 != 0) {
			this.aClass21_Sub2_1.method4106(this.anInt7, this.anInt9);
			this.anInt7 = 0;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "finalize", descriptor = "()V", line = 73)
	@Override
	void finalize() throws Throwable {
		this.method173();
		super.finalize();
	}

	@OriginalMember(owner = "client!aaa", name = "hh", descriptor = "()V", line = 73)
	void method172() throws Throwable {
		this.method173();
		super.finalize();
	}
}
