package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public class Class178 {

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "I")
	static final int anInt3308 = 34336;

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "[I")
	static final int[] anIntArray311 = new int[1];

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "Lclient!aeq;")
	final Class86_Sub3 aClass86_Sub3_40;

	@OriginalMember(owner = "client!bt", name = "v", descriptor = "I")
	final int anInt3309;

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "(Lclient!aeq;ILjava/lang/String;)Lclient!bt;", line = 13)
	static Class178 method24557(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(1) int local1 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(arg1, local1);
		OpenGL.glProgramStringARB(arg1, 34933, arg2);
		OpenGL.glGetIntegerv(34379, anIntArray311, 0);
		if (anIntArray311[0] == -1) {
			OpenGL.glBindProgramARB(arg1, 0);
			return new Class178(arg0, arg1, local1);
		} else {
			OpenGL.glBindProgramARB(arg1, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(Lclient!aeq;ILjava/lang/String;)Lclient!bt;", line = 13)
	static Class178 method24558(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(1) int local1 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(arg1, local1);
		OpenGL.glProgramStringARB(arg1, 34933, arg2);
		OpenGL.glGetIntegerv(34379, anIntArray311, 0);
		if (anIntArray311[0] == -1) {
			OpenGL.glBindProgramARB(arg1, 0);
			return new Class178(arg0, arg1, local1);
		} else {
			OpenGL.glBindProgramARB(arg1, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!bt", name = "v", descriptor = "(Lclient!aeq;ILjava/lang/String;)Lclient!bt;", line = 13)
	static Class178 method24559(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(1) int local1 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(arg1, local1);
		OpenGL.glProgramStringARB(arg1, 34933, arg2);
		OpenGL.glGetIntegerv(34379, anIntArray311, 0);
		if (anIntArray311[0] == -1) {
			OpenGL.glBindProgramARB(arg1, 0);
			return new Class178(arg0, arg1, local1);
		} else {
			OpenGL.glBindProgramARB(arg1, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "(Lclient!aeq;ILjava/lang/String;)Lclient!bt;", line = 13)
	static Class178 method24560(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(1) int local1 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(arg1, local1);
		OpenGL.glProgramStringARB(arg1, 34933, arg2);
		OpenGL.glGetIntegerv(34379, anIntArray311, 0);
		if (anIntArray311[0] == -1) {
			OpenGL.glBindProgramARB(arg1, 0);
			return new Class178(arg0, arg1, local1);
		} else {
			OpenGL.glBindProgramARB(arg1, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Lclient!aeq;II)V", line = 25)
	Class178(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass86_Sub3_40 = arg0;
		this.anInt3309 = arg2;
	}

	@OriginalMember(owner = "client!bt", name = "hd", descriptor = "()V", line = 31)
	void method24561() throws Throwable {
		this.aClass86_Sub3_40.method6284(this.anInt3309);
		super.finalize();
	}

	@OriginalMember(owner = "client!bt", name = "hc", descriptor = "()V", line = 31)
	void method24562() throws Throwable {
		this.aClass86_Sub3_40.method6284(this.anInt3309);
		super.finalize();
	}

	@OriginalMember(owner = "client!bt", name = "finalize", descriptor = "()V", line = 31)
	@Override
	void finalize() throws Throwable {
		this.aClass86_Sub3_40.method6284(this.anInt3309);
		super.finalize();
	}

	@OriginalMember(owner = "client!bt", name = "hp", descriptor = "()V", line = 31)
	void method24563() throws Throwable {
		this.aClass86_Sub3_40.method6284(this.anInt3309);
		super.finalize();
	}
}
