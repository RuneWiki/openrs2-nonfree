package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public class Class373 implements Interface10, Interface13, Interface40 {

	@OriginalMember(owner = "client!op", name = "a", descriptor = "Lclient!cw;")
	final Class121 aClass121_27;

	@OriginalMember(owner = "client!op", name = "p", descriptor = "Lclient!dj;")
	final Class127 aClass127_32;

	@OriginalMember(owner = "client!op", name = "g", descriptor = "I")
	final int anInt4698;

	@OriginalMember(owner = "client!op", name = "l", descriptor = "I")
	final int anInt4700;

	@OriginalMember(owner = "client!op", name = "h", descriptor = "Lclient!akk;")
	final Class21_Sub3_Sub1 aClass21_Sub3_Sub1_11;

	@OriginalMember(owner = "client!op", name = "x", descriptor = "I")
	int anInt4699;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!akk;Lclient!cw;Lclient!dj;II)V", line = 16)
	Class373(@OriginalArg(0) Class21_Sub3_Sub1 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass121_27 = arg1;
		this.aClass127_32 = arg2;
		this.anInt4698 = arg3;
		this.anInt4700 = arg4;
		this.aClass21_Sub3_Sub1_11 = arg0;
		@Pc(19) int[] local19 = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, local19, 0);
		this.anInt4699 = local19[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt4699);
		OpenGL.glRenderbufferStorageEXT(36161, Class21_Sub3_Sub1.method16347(this.aClass121_27, this.aClass127_32), arg3, arg4);
	}

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!akk;Lclient!cw;Lclient!dj;III)V", line = 29)
	Class373(@OriginalArg(0) Class21_Sub3_Sub1 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass121_27 = arg1;
		this.aClass127_32 = arg2;
		this.anInt4698 = arg3;
		this.anInt4700 = arg4;
		this.aClass21_Sub3_Sub1_11 = arg0;
		@Pc(19) int[] local19 = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, local19, 0);
		this.anInt4699 = local19[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt4699);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg5, Class21_Sub3_Sub1.method16347(this.aClass121_27, this.aClass127_32), arg3, arg4);
	}

	@OriginalMember(owner = "client!op", name = "p", descriptor = "()I", line = 43)
	@Override
	public int method27217() {
		return this.anInt4698;
	}

	@OriginalMember(owner = "client!op", name = "l", descriptor = "()I", line = 43)
	@Override
	public int method27213() {
		return this.anInt4698;
	}

	@OriginalMember(owner = "client!op", name = "h", descriptor = "()I", line = 43)
	@Override
	public int method27214() {
		return this.anInt4698;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "()I", line = 47)
	@Override
	public int method27212() {
		return this.anInt4700;
	}

	@OriginalMember(owner = "client!op", name = "x", descriptor = "()I", line = 47)
	@Override
	public int method27211() {
		return this.anInt4700;
	}

	@OriginalMember(owner = "client!op", name = "s", descriptor = "()I", line = 47)
	@Override
	public int method27216() {
		return this.anInt4700;
	}

	@OriginalMember(owner = "client!op", name = "u", descriptor = "()I", line = 47)
	@Override
	public int method27215() {
		return this.anInt4700;
	}

	@OriginalMember(owner = "client!op", name = "z", descriptor = "(I)V", line = 51)
	@Override
	public void method27219(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt4699);
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(I)V", line = 51)
	@Override
	public void method27220(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt4699);
	}

	@OriginalMember(owner = "client!op", name = "j", descriptor = "(I)V", line = 51)
	@Override
	public void method27218(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt4699);
	}

	@OriginalMember(owner = "client!op", name = "g", descriptor = "()V", line = 55)
	@Override
	public void method27209() {
		if (this.anInt4699 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt4699 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt4699 = 0;
		}
	}

	@OriginalMember(owner = "client!op", name = "y", descriptor = "()V", line = 55)
	@Override
	public void method27208() {
		if (this.anInt4699 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt4699 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt4699 = 0;
		}
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "()V", line = 55)
	@Override
	public void method27210() {
		if (this.anInt4699 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt4699 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt4699 = 0;
		}
	}

	@OriginalMember(owner = "client!op", name = "n", descriptor = "()V", line = 64)
	void method27221() {
		if (this.anInt4699 != 0) {
			this.aClass21_Sub3_Sub1_11.method16343(this.anInt4699, this.anInt4698 * this.anInt4700 * this.aClass127_32.anInt3315 * -1246993659 * this.aClass121_27.anInt3211 * 1629489977);
			this.anInt4699 = 0;
		}
	}

	@OriginalMember(owner = "client!op", name = "e", descriptor = "()V", line = 64)
	void method27223() {
		if (this.anInt4699 != 0) {
			this.aClass21_Sub3_Sub1_11.method16343(this.anInt4699, this.anInt4698 * this.anInt4700 * this.aClass127_32.anInt3315 * -1246993659 * this.aClass121_27.anInt3211 * 1629489977);
			this.anInt4699 = 0;
		}
	}

	@OriginalMember(owner = "client!op", name = "r", descriptor = "()V", line = 64)
	void method27224() {
		if (this.anInt4699 != 0) {
			this.aClass21_Sub3_Sub1_11.method16343(this.anInt4699, this.anInt4698 * this.anInt4700 * this.aClass127_32.anInt3315 * -1246993659 * this.aClass121_27.anInt3211 * 1629489977);
			this.anInt4699 = 0;
		}
	}

	@OriginalMember(owner = "client!op", name = "finalize", descriptor = "()V", line = 71)
	@Override
	void finalize() throws Throwable {
		this.method27221();
		super.finalize();
	}

	@OriginalMember(owner = "client!op", name = "hh", descriptor = "()V", line = 71)
	void method27222() throws Throwable {
		this.method27221();
		super.finalize();
	}
}
