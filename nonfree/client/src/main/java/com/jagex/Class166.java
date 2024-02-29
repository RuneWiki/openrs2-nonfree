package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public class Class166 {

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "[I")
	static final int[] anIntArray308 = new int[2];

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "Lclient!aeq;")
	final Class86_Sub3 aClass86_Sub3_39;

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
	final int anInt3284;

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "(Lclient!aeq;[Lclient!bw;)Lclient!bd;", line = 12)
	static Class166 method24386(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Class181[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg1.length; local1++) {
			if (arg1[local1] == null || arg1[local1].anInt3315 <= 0) {
				return null;
			}
		}
		local1 = OpenGL.glCreateProgram();
		@Pc(22) int local22;
		for (local22 = 0; local22 < arg1.length; local22++) {
			OpenGL.glAttachShader(local1, arg1[local22].anInt3315);
		}
		OpenGL.glLinkProgram(local1);
		OpenGL.glGetProgramiv(local1, 35714, anIntArray308, 0);
		if (anIntArray308[0] == 0) {
			OpenGL.glGetProgramiv(local1, 35716, anIntArray308, 1);
			if (anIntArray308[1] > 1) {
				@Pc(60) byte[] local60 = new byte[anIntArray308[1]];
				OpenGL.glGetProgramInfoLog(local1, anIntArray308[1], anIntArray308, 0, local60, 0);
				System.out.println(new String(local60));
			}
			if (anIntArray308[0] == 0) {
				for (local22 = 0; local22 < arg1.length; local22++) {
					OpenGL.glDetachShader(local1, arg1[local22].anInt3315);
				}
				OpenGL.glDeleteProgram(local1);
				return null;
			}
		}
		return new Class166(arg0, local1, arg1);
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(Lclient!aeq;[Lclient!bw;)Lclient!bd;", line = 12)
	static Class166 method24387(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Class181[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg1.length; local1++) {
			if (arg1[local1] == null || arg1[local1].anInt3315 <= 0) {
				return null;
			}
		}
		local1 = OpenGL.glCreateProgram();
		@Pc(22) int local22;
		for (local22 = 0; local22 < arg1.length; local22++) {
			OpenGL.glAttachShader(local1, arg1[local22].anInt3315);
		}
		OpenGL.glLinkProgram(local1);
		OpenGL.glGetProgramiv(local1, 35714, anIntArray308, 0);
		if (anIntArray308[0] == 0) {
			OpenGL.glGetProgramiv(local1, 35716, anIntArray308, 1);
			if (anIntArray308[1] > 1) {
				@Pc(60) byte[] local60 = new byte[anIntArray308[1]];
				OpenGL.glGetProgramInfoLog(local1, anIntArray308[1], anIntArray308, 0, local60, 0);
				System.out.println(new String(local60));
			}
			if (anIntArray308[0] == 0) {
				for (local22 = 0; local22 < arg1.length; local22++) {
					OpenGL.glDetachShader(local1, arg1[local22].anInt3315);
				}
				OpenGL.glDeleteProgram(local1);
				return null;
			}
		}
		return new Class166(arg0, local1, arg1);
	}

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "(Lclient!aeq;[Lclient!bw;)Lclient!bd;", line = 12)
	static Class166 method24388(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Class181[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg1.length; local1++) {
			if (arg1[local1] == null || arg1[local1].anInt3315 <= 0) {
				return null;
			}
		}
		local1 = OpenGL.glCreateProgram();
		@Pc(22) int local22;
		for (local22 = 0; local22 < arg1.length; local22++) {
			OpenGL.glAttachShader(local1, arg1[local22].anInt3315);
		}
		OpenGL.glLinkProgram(local1);
		OpenGL.glGetProgramiv(local1, 35714, anIntArray308, 0);
		if (anIntArray308[0] == 0) {
			OpenGL.glGetProgramiv(local1, 35716, anIntArray308, 1);
			if (anIntArray308[1] > 1) {
				@Pc(60) byte[] local60 = new byte[anIntArray308[1]];
				OpenGL.glGetProgramInfoLog(local1, anIntArray308[1], anIntArray308, 0, local60, 0);
				System.out.println(new String(local60));
			}
			if (anIntArray308[0] == 0) {
				for (local22 = 0; local22 < arg1.length; local22++) {
					OpenGL.glDetachShader(local1, arg1[local22].anInt3315);
				}
				OpenGL.glDeleteProgram(local1);
				return null;
			}
		}
		return new Class166(arg0, local1, arg1);
	}

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!aeq;I[Lclient!bw;)V", line = 37)
	Class166(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181[] arg2) {
		this.aClass86_Sub3_39 = arg0;
		this.anInt3284 = arg1;
	}

	@OriginalMember(owner = "client!bd", name = "finalize", descriptor = "()V", line = 43)
	@Override
	void finalize() throws Throwable {
		this.aClass86_Sub3_39.method6281((long) this.anInt3284);
		super.finalize();
	}

	@OriginalMember(owner = "client!bd", name = "hc", descriptor = "()V", line = 43)
	void method24389() throws Throwable {
		this.aClass86_Sub3_39.method6281((long) this.anInt3284);
		super.finalize();
	}

	@OriginalMember(owner = "client!bd", name = "hd", descriptor = "()V", line = 43)
	void method24390() throws Throwable {
		this.aClass86_Sub3_39.method6281((long) this.anInt3284);
		super.finalize();
	}

	@OriginalMember(owner = "client!bd", name = "hp", descriptor = "()V", line = 43)
	void method24391() throws Throwable {
		this.aClass86_Sub3_39.method6281((long) this.anInt3284);
		super.finalize();
	}
}
