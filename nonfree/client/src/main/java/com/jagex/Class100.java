package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public class Class100 {

	@OriginalMember(owner = "client!bs", name = "p", descriptor = "[I")
	static final int[] anIntArray284 = new int[2];

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "Lclient!abt;")
	final Class21_Sub2 aClass21_Sub2_40;

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
	final int anInt2963;

	@OriginalMember(owner = "client!bs", name = "p", descriptor = "(Lclient!abt;[Lclient!bt;)Lclient!bs;", line = 12)
	static Class100 method21834(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) Class101[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg1.length; local1++) {
			if (arg1[local1] == null || arg1[local1].anInt2966 <= 0) {
				return null;
			}
		}
		local1 = OpenGL.glCreateProgram();
		@Pc(22) int local22;
		for (local22 = 0; local22 < arg1.length; local22++) {
			OpenGL.glAttachShader(local1, arg1[local22].anInt2966);
		}
		OpenGL.glLinkProgram(local1);
		OpenGL.glGetProgramiv(local1, 35714, anIntArray284, 0);
		if (anIntArray284[0] == 0) {
			OpenGL.glGetProgramiv(local1, 35716, anIntArray284, 1);
			if (anIntArray284[1] > 1) {
				@Pc(60) byte[] local60 = new byte[anIntArray284[1]];
				OpenGL.glGetProgramInfoLog(local1, anIntArray284[1], anIntArray284, 0, local60, 0);
				System.out.println(new String(local60));
			}
			if (anIntArray284[0] == 0) {
				for (local22 = 0; local22 < arg1.length; local22++) {
					OpenGL.glDetachShader(local1, arg1[local22].anInt2966);
				}
				OpenGL.glDeleteProgram(local1);
				return null;
			}
		}
		return new Class100(arg0, local1, arg1);
	}

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lclient!abt;I[Lclient!bt;)V", line = 37)
	Class100(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class101[] arg2) {
		this.aClass21_Sub2_40 = arg0;
		this.anInt2963 = arg1;
	}

	@OriginalMember(owner = "client!bs", name = "hh", descriptor = "()V", line = 43)
	void method21833() throws Throwable {
		this.aClass21_Sub2_40.method4097((long) this.anInt2963);
		super.finalize();
	}

	@OriginalMember(owner = "client!bs", name = "finalize", descriptor = "()V", line = 43)
	@Override
	void finalize() throws Throwable {
		this.aClass21_Sub2_40.method4097((long) this.anInt2963);
		super.finalize();
	}
}
