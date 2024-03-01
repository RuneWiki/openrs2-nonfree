package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public class Class101 {

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
	static final int anInt2964 = 35632;

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "I")
	static final int anInt2965 = 35633;

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "[I")
	static final int[] anIntArray285 = new int[2];

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "Lclient!abt;")
	final Class21_Sub2 aClass21_Sub2_41;

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
	final int anInt2966;

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "(Lclient!abt;ILjava/lang/String;)Lclient!bt;", line = 14)
	static Class101 method21836(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(2) int local2 = OpenGL.glCreateShader(arg1);
		OpenGL.glShaderSource(local2, arg2);
		OpenGL.glCompileShader(local2);
		OpenGL.glGetShaderiv(local2, 35713, anIntArray285, 0);
		if (anIntArray285[0] == 0) {
			@Pc(18) boolean local18 = false;
			if (anIntArray285[0] == 0) {
				local18 = true;
				System.out.println("");
			}
			OpenGL.glGetShaderiv(local2, 35716, anIntArray285, 1);
			if (anIntArray285[1] > 1) {
				@Pc(42) byte[] local42 = new byte[anIntArray285[1]];
				OpenGL.glGetShaderInfoLog(local2, anIntArray285[1], anIntArray285, 0, local42, 0);
				System.out.println(new String(local42));
			}
			if (local18) {
				OpenGL.glDeleteShader(local2);
				return null;
			}
		}
		return new Class101(arg0, local2, arg1);
	}

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Lclient!abt;II)V", line = 38)
	Class101(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass21_Sub2_41 = arg0;
		this.anInt2966 = arg1;
	}

	@OriginalMember(owner = "client!bt", name = "hh", descriptor = "()V", line = 44)
	void method21835() throws Throwable {
		this.aClass21_Sub2_41.method4097((long) this.anInt2966);
		super.finalize();
	}

	@OriginalMember(owner = "client!bt", name = "finalize", descriptor = "()V", line = 44)
	@Override
	void finalize() throws Throwable {
		this.aClass21_Sub2_41.method4097((long) this.anInt2966);
		super.finalize();
	}
}
