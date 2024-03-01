package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public class Class87 {

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
	static final int anInt2933 = 34336;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "[I")
	static final int[] anIntArray278 = new int[1];

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "Lclient!abt;")
	final Class21_Sub2 aClass21_Sub2_38;

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
	final int anInt2934;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "(Lclient!abt;ILjava/lang/String;)Lclient!bb;", line = 13)
	static Class87 method21646(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(1) int local1 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(arg1, local1);
		OpenGL.glProgramStringARB(arg1, 34933, arg2);
		OpenGL.glGetIntegerv(34379, anIntArray278, 0);
		if (anIntArray278[0] == -1) {
			OpenGL.glBindProgramARB(arg1, 0);
			return new Class87(arg0, arg1, local1);
		} else {
			OpenGL.glBindProgramARB(arg1, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!abt;II)V", line = 25)
	Class87(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass21_Sub2_38 = arg0;
		this.anInt2934 = arg2;
	}

	@OriginalMember(owner = "client!bb", name = "finalize", descriptor = "()V", line = 31)
	@Override
	void finalize() throws Throwable {
		this.aClass21_Sub2_38.method4098(this.anInt2934);
		super.finalize();
	}

	@OriginalMember(owner = "client!bb", name = "hh", descriptor = "()V", line = 31)
	void method21647() throws Throwable {
		this.aClass21_Sub2_38.method4098(this.anInt2934);
		super.finalize();
	}
}
